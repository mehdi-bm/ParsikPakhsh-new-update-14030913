B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim tmr As Timer
End Sub

Sub Globals
	Private btnDwnld As Button
	Private btnInstall As Button
	Private ButtonUpdate As Button
	Dim apkupdt As cl_appupdate
	Private phone As Phone
	Private APB1 As ProgressBar
	Private Label1 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Layout1")

	If FirstTime Then
		apkupdt.Initialize(Me,"update")			'initializes the class
		apkupdt.Verbose = True  				'this one affects the verbosity of the logs
	End If
	'ALWAYS NEEDED - this is your app's package name (see "Project/BuilConfigurations/Package")
'	apkupdt.PackageName = "webcom.webcom.pos"
	apkupdt.PackageName = "webcom.tahrirvisit.webcom"
	'ALWAYS NEEDED - this is the complete path to the info text file holding the newer version number
'	apkupdt.NewVerTxt = "https://apps.webcomstore.ir/webcom/visityar.inf"
	'ALWAYS NEEDED - this is the complete path to your newer apk
'	apkupdt.NewVerApk = MCode.UpdateLink
	apkupdt.NewVerApk = "https://apps.webcomstore.ir/webcom/visityar.apk"
	'OPTIONAL - Set credentials to access a protected folder. Not needed for this example
	apkupdt.setCredentials("test","test")
	'Label1.Text=MCode.UpdateMSG
	tmr.Initialize("tmr",500)
	APB1.Visible=False
	Label1.Text = "Status: "
	Wait For (CheckInstallationRequirements) Complete (Result As Boolean)
	btnDwnld_Click
End Sub

Sub Activity_Resume
End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub

'STEP 0: which is apk's package name?
'Can be called at any time not necessarily as step 0 as shown here
Sub btnPackage_Click
	'Show package name
	Label1.Text=$"${Label1.Text}Package name: ${apkupdt.PackageName}${CRLF}"$
End Sub

'STEP 1: which is apk's current version number? 
'Can be called at any time not necessarily as step 1 as shown here
Sub btnCurVer_Click
	'Read version number of currently executing apk
	apkupdt.ReadCurVN  'send out command; async result in update_UpdateComplete
End Sub
	
'STEP 2: just curious about eventual availability of a newer apk version, so we simply check for it
'Can be called at any time not necessarily as step 2 as shown here
Sub btnWebVer_Click
	'Read version number as showed in txt file on webserver
	apkupdt.ReadWebVN  'send out command; async result in update_UpdateComplete
End Sub

'STEP 3: compares current version number to the one reported by the webserver
'Must follows steps 1 and 2. Assuming no errors in steps 1 and 2
Sub btnCompare_Click
	If apkupdt.CurVN < apkupdt.WebVN Then
		Label1.Text=$"${Label1.Text}Newer version available${CRLF}"$
	Else
		Label1.Text=$"${Label1.Text}No newer version available${CRLF}"$
	End If
End Sub

'STEP 4: let's download the apk published on the webserver. No check on its version; just download it
'Can be called at any time not necessarily as step 4 as shown here
Sub btnDwnld_Click
	'download apk from webserver raising appropriate errors when problems arise
	apkupdt.DownloadApk  'send out command; async result in update_UpdateComplete
	ToastMessageShow("لطفا منتظر دریافت پیام تکمیل دانلود بمانید...",True)
	tmr.Enabled=True
	APB1.Visible=True
End Sub

'STEP 5: let's ask the user to install an apk's newer version, previously downloaded
'Must follow step 4. 
Sub btnInstall_Click
	Wait For (CheckInstallationRequirements) Complete (Result As Boolean)
	apkupdt.InstallApk(Result)  'send out command; async result in update_UpdateComplete
End Sub

'Do it all (steps 1 to 5) with a single call
Sub ButtonUpdate_Click
	Label1.Text=$"A single sub call does it all${CRLF}"$
	Wait For (CheckInstallationRequirements) Complete (Result As Boolean)
	'OPTIONAL - if you like to show a splash screen while checking for a newer apk goes on
	apkupdt.SetAndStartSplashScreen(Activity,LoadBitmap(File.DirAssets, "updating.jpg"))
	'NEEDED - this is the one you need if you want to perform "automatic" updating of your apk
	apkupdt.UpdateApk(Result) 'checks for newer apk, downloads it and asks the user to install it
End Sub

'This subs gets called after each command is executed
Sub update_UpdateComplete
	LogColor($"UpdateComplete - time: ${DateTime.Time(DateTime.Now)}"$, 0xFF556B2F)
	apkupdt.StopSplashScreen
	'too lazy to manage error conditions..check apkupdt.ERR_xxx codes if you like
	Select apkupdt.Status
		Case apkupdt.OK_CURVER
			Label1.Text=$"${Label1.Text}Running apk version: ${apkupdt.CurVN}${CRLF}"$
		Case apkupdt.OK_WEBVER
			Label1.Text=$"${Label1.Text}Webserver apk version: ${apkupdt.WebVN}${CRLF}"$
			Label1.Text=$"${Label1.Text}Optional Change Log data: ${apkupdt.WebChangeLog}${CRLF}"$
			Label1.Text=$"${Label1.Text}Optional FileSize Log data: ${apkupdt.WebFileSize}${CRLF}"$
		Case apkupdt.OK_NEWERAPK
			Label1.Text=$"${Label1.Text}Newer version available${CRLF}"$
		Case apkupdt.NO_NEWERAPK
			Label1.Text=$"${Label1.Text}No newer version available${CRLF}"$
		Case apkupdt.OK_DOWNLOAD
			ToastMessageShow("دانلود کامل شد...",True)
			tmr.Enabled=False
			'APB1.Value = 100
			btnInstall.Enabled=True
			Label1.Text=$"${Label1.Text}Newer version downloaded${CRLF}"$
'			Dim Res As Int = Msgbox2("نسخه جدید برنامه دریافت شده است" & CRLF & "آیا می خواهید نصب شود؟","آپدیت","بله","","خیر",Null)
'			If Res = DialogResponse.POSITIVE Then
'				ButtonUpdate_Click
'			End If	
		Case apkupdt.OK_INSTALL
			Label1.Text=$"${Label1.Text}User asked to install newer version${CRLF}"$
		Case apkupdt.ERR_NOPERM
			Log("No permission to install")
			Label1.Text=$"${Label1.Text}User gave no permission to install${CRLF}"$
		Case Else
			Label1.Text=$"${Label1.Text}Status: ${apkupdt.Status}${CRLF}"$
	End Select
	
End Sub

Public Sub tmr_tick
'	If APB1.Value<98 Then
'		tmr.Enabled=False
'		APB1.Value = APB1.Value + 1
'	End If
End Sub

#Region version-safe-apk-installation
'https://www.b4x.com/android/forum/threads/version-safe-apk-installation.87667/

Private Sub CheckInstallationRequirements As ResumableSub
	If File.ExternalWritable = False Then
		MsgboxAsync("Storage card not available. Make sure that your device is not connected in USB storage mode.", "")
		Return False
	Else If phone.SdkVersion >= 26 And apkupdt.CanRequestPackageInstalls = False Then
		MsgboxAsync("لطفا به برنامه اجازه نصب بدهید", "")
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