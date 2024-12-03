B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private RB_PrinterBluetooth As RadioButton
	Private RB_PrinterPos As RadioButton
	Private lblSettingPosParsian As Label
	Private lblDownloadPosParsian As Label
	Dim apkupdt As cl_appupdate
	Private Panel5 As Panel
	Private btnSaveInfoCompany As Button
	Private SwArzeshAfzodeEnable As ACSwitch
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("l_setting")
	apkupdt.Initialize(Me,"update")
End Sub

Sub DownloadAppPos As String
	Dim link As String= MCode.linkposparsian
	apkupdt.PackageName = "com.pec.cpsdk"
	apkupdt.NewVerApk = link
	'apkupdt.setCredentials("test","test")
	apkupdt.DownloadApk
ProgressDialogShow("لطفا منتظر بمانید")
End Sub

Sub update_UpdateComplete
	LogColor($"UpdateComplete - time: ${DateTime.Time(DateTime.Now)}"$, 0xFF556B2F)
	ProgressDialogHide
	'too lazy to manage error conditions..check apkupdt.ERR_xxx codes if you like
	Select apkupdt.Status
		Case apkupdt.OK_CURVER
			Log($"Running apk version: ${apkupdt.CurVN}${CRLF}"$)
			
		Case apkupdt.OK_WEBVER
			Log($"Webserver apk version: ${apkupdt.WebVN}${CRLF}"$)
			'EditText1.Text=$"${EditText1.Text}Optional Change Log data: ${apkupdt.WebChangeLog}${CRLF}"$
'			EditText1.Text=$"${EditText1.Text}Optional FileSize Log data: ${apkupdt.WebFileSize}${CRLF}"$
		Case apkupdt.OK_NEWERAPK
'			EditText1.Text=$"${EditText1.Text}Newer version available${CRLF}"$
		Case apkupdt.NO_NEWERAPK
'			EditText1.Text=$"${EditText1.Text}No newer version available${CRLF}"$
		Case apkupdt.OK_DOWNLOAD
			Log("OK_DOWNLOAD")
			
			apkupdt.InstallApk(True)
'			EditText1.Text=$"${EditText1.Text}Newer version downloaded${CRLF}"$
		Case apkupdt.OK_INSTALL
			Log("OK_INSTALL")
'			EditText1.Text=$"${EditText1.Text}User asked to install newer version${CRLF}"$
		Case apkupdt.ERR_NOPERM
			Log("No permission to install")
'			EditText1.Text=$"${EditText1.Text}User gave no permission to install${CRLF}"$
		Case Else
'			EditText1.Text=$"${EditText1.Text}Status: ${apkupdt.Status}${CRLF}"$
	End Select
End Sub


Sub Activity_Resume
	MCode.page="act_setting"
	CheckPrinter
	CheckArzeshAfzode
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CheckPrinter
	Select MCode.PrinterType
		Case 0 'bluetooth
			RB_PrinterBluetooth.Checked=True
			lblSettingPosParsian.Visible=False
			lblDownloadPosParsian.Visible=False
		Case 1 'pos
			RB_PrinterPos.Checked=True
			lblSettingPosParsian.Visible=True
			lblDownloadPosParsian.Visible=True
	End Select
End Sub

Sub CheckArzeshAfzode
	Select MCode.ArzeshAfzodeEnable
		Case 0
			SwArzeshAfzodeEnable.Checked=False
		Case 1
			SwArzeshAfzodeEnable.Checked=True
	End Select
End Sub






Sub btn_Back_Click
	Activity.Finish
End Sub

Private Sub lblSettingPosParsian_Click
	
End Sub

Private Sub lblDownloadPosParsian_Click
	CallSubDelayed2(Service_Server,"GetVersion","Pos-Parsian")
	
	
End Sub

Private Sub RB_PrinterBluetooth_CheckedChange(Checked As Boolean)
	Try
		MCode.PrinterType=0
		MCode.SaveUpdate("update TblSetting Set FldPrinterType="&MCode.PrinterType)
		CheckPrinter
	Catch
		Log(LastException)
		myCode.SendError(LastException,MCode.page&"-RB_PrinterBluetooth_CheckedChange")
	End Try
End Sub

Private Sub RB_PrinterPos_CheckedChange(Checked As Boolean)
	Try	
		MCode.PrinterType=1	
		MCode.SaveUpdate("update TblSetting Set FldPrinterType="&MCode.PrinterType)
		CheckPrinter
	Catch
		Log(LastException)
		myCode.SendError(LastException,MCode.page&"-RB_PrinterPos_CheckedChange")
	End Try


End Sub



Private Sub btnSaveInfoCompany_Click
	StartActivity(Act_SaveInfoCompany)
End Sub

Private Sub SwArzeshAfzodeEnable_CheckedChange(Checked As Boolean)
	Try
		Dim enable As String=0
		If Checked Then
			enable=1
		End If
		MCode.ArzeshAfzodeEnable=enable
		MCode.SaveUpdate("update TblSetting Set fldArzeshAfzodeEnable='"& enable &"'")
		CheckArzeshAfzode
	Catch
		Log(LastException)
		myCode.SendError(LastException,MCode.page&"-SwArzeshAfzodeEnable_CheckedChange")
	End Try
End Sub