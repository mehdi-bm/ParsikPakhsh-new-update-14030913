B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=9.9
@EndOfDesignText@
#IgnoreWarnings:34
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	
End Sub

Sub Globals
	Private BtnSabtSefaresh As Button
	Private CLV1 As CustomListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_SelFactor")
End Sub

Sub LoadListFaktor
	CLV1.Clear
	Dim Cu As Cursor = MCode.Result("Select * From TblFaktor where FldSync = 'False' Group by FldShomareFaktor")
	For i=0 To Cu.RowCount-1
		Cu.Position=i
		Dim rec As cls_RecFakor
		rec.Initialize(Cu.GetString("FldShomareFaktor"))
		CLV1.Add(rec.Panel,rec)
		'CLV1.ResizeItem(i,rec.Height)
	Next
End Sub

Sub Activity_Resume
	LoadListFaktor
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Activity.Finish
	End If
	Return True
End Sub

Sub BtnSabtSefaresh_Click
	Dim sel As Int=0
	For i=0 To CLV1.Size-1
		Dim rec As cls_RecFakor=CLV1.GetValue(i)
		If rec.IsChecked Then
			ProgressDialogShow2("در حال ارسال موارد انتخابی . . .",False)
			sel= rec.Faktor_number
			MCode.C_Tafzili=rec.getCode_Tafzili
			If sel>0 Then
				
				CallSubDelayed2(Service_Server,"LoadSend",sel)
				Sleep(2000)
			End If
		End If
	Next
Sleep(200)
Activity.Finish
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub