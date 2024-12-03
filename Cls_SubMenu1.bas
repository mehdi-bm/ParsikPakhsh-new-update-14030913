B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Dim jobInternet As HttpJob
	Private p As Panel
	Private pnl_bk As Panel
	Private mdl As Object
	Private lbl_Login As Label
	Private lblVertion As Label
	Private pnl_CallSuport As Panel
	Private Pnl_Exit As Panel
	
	Private pnl_GetData As Panel
	Private Pnl_SendData As Panel
	Private pnl_NewSefaresh As Panel
	Private pnl_AddNewMoshtari As Panel
	Private pnlSendTiket As Panel
	Private pnl_Elanat As Panel
	Private pnl_Reports As Panel
	Private pnl_Backup As Panel
	Private PnlChangeCompany As Panel
	Private BackInfo As Panel
	Dim apkupdt As cl_appupdate
	Dim VerFlag As String="checkupdate"
	'Dim act As Activity
	Private Pnl_Video As Panel
	Private lblEditNumber As Label
End Sub

Public Sub Initialize(ref As Object,with As Int)
	mdl = ref
	'act=mdl
	p.Initialize("")
	p.SetLayout(0,0,with,100%y)
	p.LoadLayout("l_MenuItems")
	apkupdt.Initialize(Me,"update")
	jobInternet.Initialize("jobInternet",Me)
	apkupdt.Verbose = True
	VerFlag="checkupdate"
	pnl_bk.Tag=False
	Dim Cu As Cursor = MCode.Result("Select * From TblSetting")
	Cu.Position=0
'	lbl_userName.Text = Cu.GetString("FldName")
'	lblVertion.Text =MCode.Code & "." & Application.VersionCode & "." & MCode.Plan
	lblVertion.Text = Application.VersionName
	lblEditNumber.Text="نسخه ویرایش: " &MCode.NumberVersion
	If MCode.HaveShift = True Then
		Dim Dt As String=myCode.getSetting("OUT.dat","input",0)
		Select Case Dt
			Case 0
				Pnl_SendData.Enabled=False
				pnl_NewSefaresh.Enabled=False
				pnl_Reports.Enabled=False
			Case 1
				Pnl_SendData.Enabled=True
				pnl_NewSefaresh.Enabled=True
				pnl_Reports.Enabled=True
		End Select
	End If
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Private Sub HideMenu
	CallSubDelayed(mdl,"BtnBackMenu_Click")
End Sub


Public Sub Refresh
	

End Sub

Sub BackInfo_Click
	If File.Exists(File.DirDefaultExternal,"Parsik/Backup/backlist.txt") = True Then
		StartActivity(Act_Restore)
	Else
		ToastMessageShow("هیچ فایل پشتیبانی موجود نمی باشد",False)
	End If
	HideMenu
End Sub

Sub pnl_GetData_Click
	HideMenu

'	Dim Cu As Cursor = MCode.Result("Select * From TblAshkhasNew")
'	If Cu.RowCount>0 Then
'		Msgbox("ابتدا اطلاعات را ارسال نمایید سپس دریافت اطلاعات را انجام دهید","توجه")
'	Else
'		'StopService(Service_Gps)
'		StopService(FusedLocationService)
'		MCode.GpsIsEnable=False
'		Log("Gps Stop")
'		StopService(FirebaseMessaging)
'		Log("FirebaseMessaging Stop")
'		MCode.NoeGet="DaryaftEtlaat"
'		ProgressDialogShow2("نرم افزار درحال دریافت اطلاعات از سرور میباشد، لطفا تا پایان عملیات دریافت منتظر بمانید",False)
'		StartService(Service_Server)
'	End If
	CallSubDelayed(Act_Main,"pnlGetData_Click")
End Sub
'
Sub Pnl_SendData_Click
	HideMenu
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	StartActivity(Act_SendData)
End Sub
'
Sub pnl_NewSefaresh_Click
	HideMenu
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	If	MCode.Visitor="0" Then
		ToastMessageShow("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید",True)
		Return
	End If
	Dim Cu As Cursor
	Cu=MCode.Result("Select * From TblSetting")
	Cu.Position=0
	Log(Cu.GetString("FldC_Visitor"))
	If Cu.GetString("FldC_Visitor") = "کد ویزیتور" Then
		ToastMessageShow("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید",True)
		Return
	End If
	If MCode.C_Visitor="کد ویزیتور"  Then
		ToastMessageShow("ابتدا دریافت اطلاعات را انجام دهید",True)
		Return
	End If
	If MCode.C_Visitor.Length<5 Then
		ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
		Return
	End If
'		Cu=MCode.Result("Select * From TblAshkhas")
'		If Cu.RowCount=0 Then
'			ToastMessageShow("مسیری برای شما تعریف نشده است",True)
'			Return
'		End If
	Cu=MCode.Result("Select * From TblKala")
	If Cu.RowCount=0 Then
		ToastMessageShow("لیست کالا به درستی دریافت نشده است",True)
		Return
	End If
	Cu=MCode.Result("Select * From TblGoroohKala")
	If Cu.RowCount=0 Then
		ToastMessageShow("جدول گروه کالا به درستی دریافت نشده است",True)
		Return
	End If
	Cu=MCode.Result("Select * From TblTasvie")
	If Cu.RowCount=0 Then
		ToastMessageShow("جدول تسویه حساب به درستی دریافت نشده است",True)
		Return
	End If
	'MCode.page = "Act_SelectMantage"
	MCode.Action="SabtFaktor"
	StartActivity(Act_KalaDefault)
End Sub
'
Sub pnl_AddNewMoshtari_Click
	HideMenu
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	If MCode.C_Visitor="کد ویزیتور"  Then
		ToastMessageShow("ابتدا دریافت اطلاعات را انجام دهید",True)
		Return
	End If
	If MCode.C_Visitor.Length<5 Then
		ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
		Return
	End If
	StartActivity(Act_NewAshkhas)
End Sub
'

'
Sub pnl_Elanat_Click
	HideMenu
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	If MCode.C_Visitor="کد ویزیتور"  Then
		ToastMessageShow("ابتدا دریافت اطلاعات را انجام دهید",True)
		Return
	End If
	If MCode.C_Visitor.Length<5 Then
		ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
		Return
	End If
	StartActivity(Act_Notif)
End Sub
'
Sub pnl_Reports_Click
	HideMenu
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	If MCode.C_Visitor="کد ویزیتور"  Then
		ToastMessageShow("ابتدا دریافت اطلاعات را انجام دهید",True)
		Return
	End If
	If MCode.C_Visitor.Length<5 Then
		ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
		Return
	End If
	StartActivity(Act_Choose_Report)
End Sub

Sub pnl_PrintSetting_Click
	HideMenu
	
End Sub

Sub pnl_CallSuport_Click
	HideMenu
	StartActivity(Act_Support)
End Sub

Sub Pnl_Exit_Click
	HideMenu
	Dim jo As JavaObject
	jo.InitializeContext
	jo.RunMethod("finishAffinity", Null)
	ExitApplication
End Sub

Sub pnlSendTiket_Click
	HideMenu
	StartActivity(Act_Ticket)
End Sub

Sub pnl_Backup_Click
	HideMenu
	CallSubDelayed(Act_Main,"OpenBackUpPnl")
End Sub



Sub PnlChangeCompany_Click
	Msgbox2Async("با تغییر فروشگاه اطلاعات فعلی حذف میگردد، لطفا قبل از تغییر فروشگاه نسبت به ارسال اطلاعات اطمینان حاصل فرمایید." & CRLF & "آیا می خواهید فروشگاه را تغییر دهید؟","توجه","بله","","خیر",Null,False)
	Wait For Msgbox_Result(Result As Int)
	If Result=DialogResponse.POSITIVE Then
		Msgbox2Async("" & CRLF & "آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟","توجه","بله","انصراف","خیر",Null,False)
		Wait For Msgbox_Result(Result As Int)
			If Result=DialogResponse.POSITIVE Then
				MCode.CreateBK("")
			End If
		File.Delete(File.DirDefaultExternal &"/Parsik","parsik_db.db")
		Sleep(200)
		File.Copy(File.DirAssets,"parsik_db.db",File.DirDefaultExternal &"/Parsik","parsik_db.db")
		StartActivity(Main)
	End If
	HideMenu
End Sub



Sub pnl_updateApk_Click
	HideMenu
	Msgbox2Async("" & CRLF & "آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟","توجه","بله","انصراف","خیر",Null,False)
	Wait For Msgbox_Result(Result1 As Int)
	If Result1=DialogResponse.POSITIVE Then
		MCode.CreateBK("")
		CallSubDelayed(Act_Main,"UpdateVersion")
	End If
	
End Sub

Sub UpdateApp
	
	apkupdt.PackageName = "ir.parsikhesab.pakhsh"
	apkupdt.NewVerApk = MCode.LinkDownload
	apkupdt.setCredentials("test","test")
	ButtonUpdate_Click
	'apkupdt.DownloadApk
	'ProgressDialogShow2("در حال بروزرسانی نرم افزار ، لطفا چند دقیقه صبر نمایید",False)
	
End Sub


'Sub update_UpdateComplete
'	Select apkupdt.Status
'		Case apkupdt.OK_DOWNLOAD
'			'apkupdt.InstallApk
'		Case Else
'			ProgressDialogHide
'	End Select
'End Sub
Sub btnWebVer_Click
	'Read version number as showed in txt file on webserver
	apkupdt.ReadWebVN  'send out command; async result in update_UpdateComplete
End Sub

'STEP 3: compares current version number to the one reported by the webserver
'Must follows steps 1 and 2. Assuming no errors in steps 1 and 2
Sub btnCompare_Click
	VerFlag="checkupdate"
	GetVersion
End Sub

'STEP 4: let's download the apk published on the webserver. No check on its version; just download it
'Can be called at any time not necessarily as step 4 as shown here
Sub btnDwnld_Click
	'download apk from webserver raising appropriate errors when problems arise
	apkupdt.DownloadApk  'send out command; async result in update_UpdateComplete
	
End Sub

'STEP 5: let's ask the user to install an apk's newer version, previously downloaded
'Must follow step 4. 
Sub btnInstall_Click
	Wait For (CheckInstallationRequirements) Complete (Result As Boolean)
	apkupdt.InstallApk(Result)  'send out command; async result in update_UpdateComplete
End Sub

'Do it all (steps 1 to 5) with a single call
Sub ButtonUpdate_Click
	
	'EditText1.Text=$"A single sub call does it all${CRLF}"$
	Wait For (CheckInstallationRequirements) Complete (Result As Boolean)
	'OPTIONAL - if you like to show a splash screen while checking for a newer apk goes on
	apkupdt.SetAndStartSplashScreen(mdl,LoadBitmap(File.DirAssets, "bg-update-parsik-splash.jpg"))
	'NEEDED - this is the one you need if you want to perform "automatic" updating of your apk
	apkupdt.UpdateApk(Result) 'checks for newer apk, downloads it and asks the user to install it
End Sub




Sub update_UpdateComplete
	LogColor($"UpdateComplete - time: ${DateTime.Time(DateTime.Now)}"$, 0xFF556B2F)
	apkupdt.StopSplashScreen
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
'			EditText1.Text=$"${EditText1.Text}Newer version downloaded${CRLF}"$
		Case apkupdt.OK_INSTALL
'			EditText1.Text=$"${EditText1.Text}User asked to install newer version${CRLF}"$
		Case apkupdt.ERR_NOPERM
			Log("No permission to install")
'			EditText1.Text=$"${EditText1.Text}User gave no permission to install${CRLF}"$
		Case Else
'			EditText1.Text=$"${EditText1.Text}Status: ${apkupdt.Status}${CRLF}"$
	End Select
End Sub

#Region version-safe-apk-installation
'http://www.b4x.com/android/forum/threads/version-safe-apk-installation.87667/

'Check whether we already have permission for install other apps. 
'If not we open the relevant settings page
'then wait for Activity_Resume and check the value of CanRequestPackageInstalls again
Private Sub CheckInstallationRequirements As ResumableSub
	If File.ExternalWritable = False Then
		MsgboxAsync("Storage card not available. Make sure that your device is not connected in USB storage mode.", "")
		Return False
	Else If MCode.PImei.SdkVersion >= 26 And apkupdt.CanRequestPackageInstalls = False Then
		MsgboxAsync("Please allow me to install applications.", "")
		Wait For Msgbox_Result(Result As Int)
		Dim in As Intent
		in.Initialize("android.settings.MANAGE_UNKNOWN_APP_SOURCES", "package:" & Application.PackageName)
		StartActivity(in)
		Wait For Activity_Resume '<-- wait for Activity_Resume
		Return apkupdt.CanRequestPackageInstalls
	Else If apkupdt.CheckNonMarketAppsEnabled = False Then
		MsgboxAsync("Please enable installation of non-market applications." & CRLF & "Under Settings - Security - Unknown sources" _
			 & CRLF & "Or Settings - Applications - Unknown sources", "")
		Return False
	Else
		Return True
	End If
End Sub
#End Region


Sub GetVersion
	jobInternet.JobName ="GetVersion"
	
	Dim str As String="parsiknew-"&MCode.TypeVersion
	If MCode.PrinterType=1 Then
		str="parsikPos"
	End If
	
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/Version","Imei=" & MCode.DeviceId &" &Type="&str)
End Sub

Sub LoadGetVersion(Str As String)
	Dim RowsList As List
	Dim Row As Map
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	Row=RowsList.Get(0)
	MCode.NewVersion = Row.Get("FldVersion")
	MCode.LinkDownload = Row.Get("FldLink")
	If VerFlag="Download" Then
		Download
	Else
		If MCode.NewVersion>MCode.Version Then
			If VerFlag="update" Then
				UpdateApp
			End If		
			If VerFlag="checkupdate" Then
				ToastMessageShow("نسخه جدید موجود است لطفا بروزرسانی کنید",True)
			End If	
		Else
			ToastMessageShow("شما از آخرین ورژن استفاده می کنید",True)
		End If
	End If
End Sub
Sub JobDone (Job As HttpJob)
	Job.GetRequest.Timeout=50000
	If Job.Success Then
		Dim Str As String = Job.GetString
		Select Case Job.JobName
			Case "GetVersion"
				If Str = "No Result" Then
					ToastMessageShow("امکان آپدیت نرم افزار وجود ندارد",True)
				Else
					LoadGetVersion(Str)
				End If
		
		End Select
	Else
		ProgressDialogHide
		'Msgbox ("خطا در اتصال","خطا")
	End If
	jobInternet.Release
End Sub

Sub Download
	Try
		Msgbox2Async("" & CRLF & "آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟","توجه","بله","انصراف","خیر",Null,False)
		Wait For Msgbox_Result(Result1 As Int)
		If Result1=DialogResponse.POSITIVE Then
			MCode.CreateBK("")
			Dim p1 As PhoneIntents
			StartActivity(p1.OpenBrowser(MCode.LinkDownload))
		End If
		
	Catch
		Log(LastException)
	End Try
End Sub
Private Sub pnl_DownloadLastVersion_Click
	VerFlag="Download"
	GetVersion
End Sub

Private Sub Pnl_Video_Click
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	If MCode.IsConnected Then
		If MCode.C_Visitor="کد ویزیتور"  Then
			ToastMessageShow("ابتدا دریافت اطلاعات را انجام دهید",True)
			Return
		End If
		If MCode.C_Visitor.Length<5 Then
			ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
			Return
		End If
		StartActivity(Act_Video)
	Else
		ToastMessageShow("ارتباط اینترنت شما قطع میباشد",False)
	End If
End Sub