B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=7.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
	#Extends: android.support.v7.app.AppCompatActivity
#End Region

Sub Process_Globals
	   #Region New
	Private gps	As GPS
	Dim T_EnterExit As Timer
	Dim T_Exit As Timer
	Dim T_DataCheck As Timer
	Public NoeGet As String
	Dim t_gps As Timer
	   #End Region
End Sub

Sub Globals
	#Region New
	Dim jobInternet As HttpJob
	Private sidemenu As SlidingMenu
	Dim DialogGetData As CustomLayoutDialog
	Dim DialogBackup As CustomLayoutDialog
	Private BtnBackMenu As Button
	Private clv1 As CustomListView
	Private pCantent As Panel
	Private pnl_body1 As Panel
	Private Btn_Search As Button
	Private lblAppName As Label
	Private Label2 As Label
	Private lblVer As Label
	Private pnlMenu As Panel
	Private Pnl_Top As Panel
	Private btn_menu As Button
'	Private lblSearchTXT As Label
	Private lbl_mnuText As Label
	Private Button3 As Button
	Private Button2 As Button
	Private Button1 As Button
	Private pnl_bottom As Panel
	Private subMenu1 As Cls_SubMenu1
	Private lbl_Title As Label
	Private clvH As CustomListView
	Private xui As XUI
	Private rp As RuntimePermissions
	Private IntExit As Byte
	Private lbl_etelaeResani As ScrollingLabel
	Private pnlGetData As Panel
	Private pnlSendData As Panel
	Private pnlSabteSefaresh As Panel
	Private pnlNewMoshtari As Panel
	Private lbl_MenuIMEI As Label
	Private clip As BClipboard
	Private lblVisitorName As Label
	Private lbl_CodeVisitor As Label
	Private ASB1 As ASButtonSlider
	Private LblText As Label
	
	Private gmap As GoogleMap
	Dim vaziat As Int
	Dim Lat As String
	Dim Lon As String
	Dim ModeEnterExit As Boolean
	Private PnlReport As Panel
	Private PnlMoshtarian As Panel
	Private Button4 As Button
	Private PnlShift As Panel
	Private Pnl_Bk As Panel
	#End Region
	Private pnlBackUp As Panel
	Private pnlbak As Panel
	Private txtBackUpFile As EditText
	Private BtnBackUpPnl As Button
	Private BtnCloseBackUpPnl As Button
	Dim apkupdt As cl_appupdate
	Dim VerFlag As String="checkupdate"
	Private pnl_smartphone As Panel
	Private pnl_map As Panel
	Private btn_Lock As Button
	Private btnCloseActivate As Button
	Private txtCodeMoshtari As EditText
	Private txtNameVisitor As EditText
	Private btnSendActivate As Button
	Private PnlActivate As Panel
	Private lblVaziat As Label
	Private pnlActiveStatus As Panel
	Private btnDarkMode As Button
	Private Label7 As Label
	Private PnlTopActivate As Panel
	
	'Private BBlbl As BBLabel
	
	Private pnlTabligh As Panel
	Private MapFragment1 As MapFragment
	Private Lbl_DateVersion As Label
	Private PnlDateVersion As Panel
	Private pnlImei As Panel
	Private pnl_Havale As Panel
	Dim HLV As Hitex_LayoutView
	Dim ListItemHome As List
	Dim ListTempItemHome As List
	Private pnl_body2 As Panel
	Private lblVersion1 As Label
	Private lblVersionNumber1 As Label
	Private lblDateVersion1 As Label
	Private lblTypeVersion As Label
	Private lblImei2 As Label
	Private btnSetting As Button
	Private lblTypeVersion1 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Try
			#Region New
		MCode.Initialize
		MCode.UpdateDataBase
		MCode.UpdateSetting	
		gps.Initialize("gps")

		sidemenu.Initialize("sidmenu")
		sidemenu.Menu.LoadLayout("mainmenulyr")
		sidemenu.Mode=sidemenu.RIGHT
		sidemenu.BehindOffset=33%x
'	apkupdt.Initialize(Me,"update")
		jobInternet.Initialize("jobInternet",Me)
'	apkupdt.Verbose = True
'	VerFlag="checkupdate"
		'If FirstTime Then
		
		'End If
		lblAppName.Text=MCode.AppName
		If MCode.TypeVersion="Stable" Then
			apkupdt.Initialize(Me,"update")
			apkupdt.Verbose = True
			VerFlag="checkupdate"
			btnCompare_Click
			lblTypeVersion.Text="نوع نسخه : عمومی"
		Else if MCode.TypeVersion="UpdateNew" Then
			lblTypeVersion.Text="نوع نسخه : اختصاصی"
		End If
		
		If MCode.PrinterType=1 Then
			apkupdt.Initialize(Me,"update")
			apkupdt.Verbose = True
			VerFlag="checkupdate"
			btnCompare_Click
			lblTypeVersion.Text="نوع نسخه : کارتخوان"
		End If
		
		Label2.Text=MCode.MenuTitle2
		'Label3.Text=MCode.MenuTitle3
		subMenu1.Initialize(Me,pnlMenu.Width)
		clv1.Add(subMenu1.Panel,subMenu1)
		'clv1.ResizeItem(0,subMenu1.Height)
		pCantent.Initialize("")
		pCantent.SetLayout(0,0,100%x,100%y)
		Activity.AddView(pCantent,0,0,100%x,100%y)
	
		pCantent.LoadLayout("L_Body")
'	Select Case MCode.HaveShift
'		Case True
'			PnlShift.Visible=True
'		Case False
'			PnlShift.Visible=False
'	End Select
		
	
		lbl_Title.text = Application.LabelName
		pnl_body1.LoadLayout("L_CLV")
		Dim p As Panel
		p.Initialize("")
		p.SetLayout(0,0,pnl_body1.Width,120%y)
	
		
		
		p.LoadLayout("L_HomeBody")
		clvH.Add(p,0)
'	pnl_body1.AddView(p,0,0,pnl_body1.Width,pnl_body1.Height)
		HLV.Initializer("HLV").GridView(2).Build
		ListItemHome.Initialize
		ListTempItemHome.Initialize
'		pnl_body2.AddView(HLV,0,0,100%x,100%y)
'		
		'LoadPage
		'CheckVaziat
		StartService(Service_Helper)
'		HLV.Show
'		loadItems
		
		'LoadPage
		CreateLabel(ASB1.LeftTopPnl,"اتمام ویزیت",xui.CreateDefaultBoldFont(15))
		CreateLabel(ASB1.RightBottomPnl,"شروع ویزیت",xui.CreateDefaultBoldFont(15))
		T_EnterExit.Initialize("T_EnterExit",5000)
		T_Exit.Initialize("T_Exit",1500)
	
		'T_DataCheck.Initialize("T_DataCheck",1500)
		MCode.page="Act_Main"
			#End Region
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
End Sub

Public Sub SetColorItems
	Dim ac As AppCompat
	 MCode.colorPrimary=ac.GetThemeAttribute("colorPrimary")
	MCode.colorPrimaryDark=ac.GetThemeAttribute("colorPrimaryDark")
	MCode.colorAccent=ac.GetThemeAttribute("colorAccent")
	Log(MCode.colorPrimary)
	Log(MCode.colorPrimaryDark)
	Log(MCode.colorAccent)
	
	If MCode.DarkMode="True" Then
		pnlActiveStatus.Color=MCode.colorPrimaryDark
		Pnl_Top.Color=MCode.colorPrimaryDark
		PnlTopActivate.Color =MCode.colorPrimaryDark
		btnSendActivate.Color=MCode.colorPrimaryDark
		BtnBackUpPnl.Color=MCode.colorPrimaryDark
		pnlMenu.Color=MCode.colorPrimaryDark
		pnlImei.Color=MCode.colorPrimaryDark
		PnlDateVersion.Color=MCode.colorPrimaryDark
		btnSetting.Color=MCode.colorPrimaryDark
	Else
		pnlActiveStatus.Color=MCode.colorPrimary
		Pnl_Top.Color=MCode.colorPrimary
		PnlTopActivate.Color=MCode.colorPrimary
		btnSendActivate.Color=MCode.colorPrimary
		BtnBackUpPnl.Color=MCode.colorPrimary
		pnlMenu.Color=MCode.colorPrimary
		pnlImei.Color=MCode.colorPrimary
		PnlDateVersion.Color=MCode.colorPrimary
		btnSetting.Color=MCode.colorPrimary
	End If

End Sub

Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return ListItemHome.Size
End Sub
Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As cls_Item_Home
	rec.Initialize
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub
Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim Item = ListItemHome.Get(Position) As AdapterItemHome
	Dim rec As cls_Item_Home=Parent.Tag
	rec.show(Item)
	Parent.Height=rec.Height
End Sub

Public Sub CheckAdmin
	Try
		If MCode.Admin="1" Then
			pnl_smartphone.Visible=False
			pnl_map.Visible=True
			If MCode.Tozie=0 Then
				pnl_map.Top=pnl_smartphone.Top
			Else
				pnl_map.Top=pnl_Havale.Top
				pnl_map.Left=pnl_Havale.Left+43%x
			End If
			
		Else
			pnl_smartphone.Visible=False
			pnl_map.Visible=False
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-CheckAdmin")
	End Try
End Sub

Public Sub CheckTozie
	Try
		If MCode.Tozie="1" Then
			pnl_Havale.Visible=True
		Else
			pnl_Havale.Visible=False
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-CheckTozie")
	End Try
End Sub

Sub CheckVaziat
	If MCode.IsConnected Then
		If MCode.CodeMoshtari=0 Then
			Dim Query As String="Update TblSetting Set FldVaziat = '0'"
			MCode.SaveUpdate(Query)
'			ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
			MCode.Vaziat=0
		End If
		ProgressDialogShow("جهت بررسی وضعیت نرم افزار لطفا چند لحظه صبر کنید...")
		If MCode.Vaziat=0 Then
			MCode.NoeGet="GetVaziat"
			Else
			MCode.NoeGet="GetCodeMoshtari"
		End If
		
		StartService(Service_Server)
	Else
		LoadPage
	End If

	'Sleep(300)
End Sub

Sub CheckGetTourVisitorToday
	Try
		If MCode.Vaziat=0 Then
			Return
		End If
		If MCode.C_Visitor="کد ویزیتور"  Then
			Return
		End If
		If MCode.C_Visitor.Length<5 Then
			Return
		End If

		If MCode.TourVisit=1 Then
			Dim count As Int=MCode.SingleResult($"Select Count(Id) from tblTourVisitor where fldDateVisit=${MCode.DatePersian}"$)
			If count=0 Then
			ProgressDialogShow("جهت دریافت لیست تور های جدید لطفا چند لحظه صبر کنید...")
				MCode.NoeGet="GetTourVisitor"
				 CallSubDelayed(Service_Server,"GetTourVisitor")
'				 Sleep(200)
				
			End If
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-CheckGetTourVisitorToday")
	End Try
End Sub

Private Sub CreateLabel(Parent As B4XView,Text As String,Font As B4XFont)
	
	Dim tmp_lbl As Label
	tmp_lbl.Initialize("")
	Dim xtmp_lbl As B4XView = tmp_lbl
	
	Parent.AddView(xtmp_lbl,0,0,Parent.Width,Parent.Height)
	xtmp_lbl.Font = Font
	xtmp_lbl.Text = Text
	xtmp_lbl.SetTextAlignment("CENTER","CENTER")
	xtmp_lbl.TextColor = xui.Color_White
	
End Sub

Sub PermissionActive4
	rp.CheckAndRequest(rp.PERMISSION_CALL_PHONE)
	Wait For Activity_PermissonResult (Permission As String,Result As Boolean)
End Sub





Sub LoadPage
	Try
		MCode.UpdateSetting
		
		CheckAdmin
		CheckTozie
		CheckGetTourVisitorToday

		lbl_CodeVisitor.Text = "کد ویزیتور"
		lblVisitorName.Text = "نام ویزیتور"

		PermissionActive4
		Dim Id As String
		Id=MCode.GetDeviceId
		If Id = "" Then
			Wait For (GetAdvertisingId) Complete (Id As String)
			'Id="162eea36-b3b8-480b-b466-d91e50764284 "
			Log(MCode.GetApiVersion)
			MCode.DeviceId=Id
			Log(Id)
		Else
			Log(Id)
			MCode.DeviceId=Id
		End If
		lbl_MenuIMEI.Text="سریال گوشی:  "& MCode.DeviceId
		lblImei2.Text=MCode.DeviceId
		If MCode.Vaziat=0 Then
			btn_Lock.Text= Chr(0xE897)
			btn_Lock.TextColor=Colors.Black
			lblVaziat.Text="غیر فعال"
'			txtCodeMoshtari.Text=""
		Else
			
			lbl_CodeVisitor.Text =  MCode.C_Visitor
			lblVisitorName.Text =  MCode.N_Visitor
			'CallSubDelayed(Service_Notification,"GetNotification")
			btn_Lock.Text=Chr(0xE0DA)
			btn_Lock.TextColor=Colors.Green
			lblVaziat.Text="فعال"
			txtCodeMoshtari.Text=MCode.CodeMoshtari
			'	StartService(Service_Gps)
			If MCode.Gps=1 Then
			'	StartService(FusedLocationService)
				StartService(FusedLocationService)
'				StartService(Service_Gps)
			End If
			Log("Gps Start")
			If MCode.GetDataOnline=1 Then
				'StartService(Service_Notification)
				'Log("Notification Start")
			End If
		End If
	
	
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadPage")
	End Try
End Sub


Sub Activity_Resume
	Try
		lblVer.Text="نسخه " & MCode.Version
		Lbl_DateVersion.Text="تاریخ نسخه " & MCode.DateVersion
		lblVersion1.Text=MCode.Version
		lblVersionNumber1.Text=MCode.NumberVersion
		lblDateVersion1.Text=MCode.DateVersion
		If MCode.TypeVersion="Stable" Then
			lblTypeVersion1.Text="عمومی"
		Else if MCode.TypeVersion="UpdateNew" Then
			lblTypeVersion1.Text="اختصاصی"
		End If
		
		If MCode.PrinterType=1 Then
			lblTypeVersion1.Text="کارت خوان"
		End If
		
		LoadPage
		
'		If myCode.getSetting("OUT.dat","input",0)=1 Then
'			Log("خروج")
'			Else
'			Log("ورود")
''			Dim Code As String=myCode.getSetting("OUT.dat","CodeInput",100)+1
''			myCode.setSetting("OUT.dat","CodeInput",Code)
'		End If
		pnlTabligh.Visible=False

	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Resume")
	End Try
	
	
End Sub

Sub SetVaziat
	Try
		If MCode.Vaziat=0 Then
			btn_Lock.Text= Chr(0xE897)
			btn_Lock.TextColor=Colors.Black
		Else
			StartService(Service_Notification)
			btn_Lock.Text=Chr(0xE0DA)
			btn_Lock.TextColor=Colors.Green
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-SetVaziat")
	End Try
End Sub

Sub StatusButton(Ena As Boolean)
	pnlSabteSefaresh.Enabled=Ena
	pnlNewMoshtari.Enabled=Ena
	pnlSendData.Enabled=Ena
	PnlReport.Enabled=Ena
	PnlMoshtarian.Enabled=Ena
	Button1.Enabled=Ena
	Button2.Enabled=Ena
	Button3.Enabled=Ena
	Button4.Enabled=Ena
End Sub

Sub ASB1_ReachedRightBottom
	Sleep(100)
	ModeEnterExit = True
	Dim xui As XUI

	ProgressDialogShow2("در حال ثبت ورود  ",False)
	SaveGps
	
End Sub

Sub ASB1_ReachedLeftTop
	ModeEnterExit = False

	ProgressDialogShow2("در حال ثبت خروج  ",False)
	SaveGps
	myCode.setSetting("OUT.dat","input",0)
End Sub

Sub SaveGps
	Try
		If gps.GPSEnabled=False Then
			ProgressDialogHide
			ToastMessageShow("موقعیت مکانی خود را روشن کنید", True)
			T_EnterExit.Enabled=False
			StartActivity(gps.LocationSettingsIntent)
		Else
			ProgressDialogShow2("لطفا تا دریافت موقعیت مکانی صبر کنید",False)
			T_EnterExit.Enabled=True
		End If
		
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-SaveGps")
	End Try
End Sub

Sub MapFragment1_Ready
	Sleep(100)
	Try
		
		If MCode.Gps="1" Then
			If gps.GPSEnabled=True Then
				gmap = MapFragment1.GetMap
				rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
				Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
				If Result Then
					gmap.MyLocationEnabled = True
					't_gps.Initialize("t_gps",IIf(MCode.Interval>0,MCode.Interval,1500))
'					t_gps.Enabled=True
				Else
					Log("No permission!")
				End If
			Else
				gmap.MyLocationEnabled=False
				ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
				StartActivity(gps.LocationSettingsIntent)
			End If
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-MapFragment1_Ready")
	End Try

End Sub

'Sub t_gps_Tick
'	If gmap.IsInitialized Then
'		Try
'			Dim cl As CameraPosition
'			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
'			gmap.AnimateCamera(cl)
'			Lat = gmap.MyLocation.Latitude
'			Lon = gmap.MyLocation.Longitude
'
'			If myCode.IsNullOrWhiteSpace(Lat)=False And myCode.IsNullOrWhiteSpace(Lon)=False Then
'				Log(Lat)
'				Log(Lon)
'				MCode.Lat=Lat
'				MCode.Lon=Lon
'				MCode.SaveLocationToDb
'			End If
'		Catch
'			Log(LastException)
'			myCode.SendError(LastException,Activity.Title&"-T_EnterExit_tick")
'		End Try
'	End If
'End Sub


Sub T_EnterExit_tick
	T_EnterExit.Enabled=False
	Dim Status As Int
	If gmap.IsInitialized Then
		Try
			Dim Time As String = DateTime.Time(DateTime.Now)
			Dim Date As String =MCode.DatePersian
			
			Dim cl As CameraPosition
			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
			gmap.AnimateCamera(cl)
			Lat = gmap.MyLocation.Latitude
			Lon = gmap.MyLocation.Longitude
			Log(Lat)
			Log(Lon)
			gps.Stop
			
			
		
			If ModeEnterExit =True Then
				
				Status = 1
			Else If ModeEnterExit = False Then
				
				Status = 0
			End If
			Dim Code As String=myCode.getSetting("OUT.dat","CodeInput",100)
				Dim item As AdapteEnterExitVisitor
				item.Initialize
				item.fldCode=Code
				item.fldType=Status
				item.fldDate=Date
				item.fldTime=Time
				item.fldLat=Lat
				item.fldLon=Lon
				Dim response As String = MCode.EnterExitVisitor(item)
						
				LogColor(response,Colors.red)
				Select Case response
					Case "Success"
						myCode.setSetting("OUT.dat","input",Status)
						If Status=0 Then
						If MCode.IsConnected Then
								
							End If
						myCode.setSetting("OUT.dat","CodeInput",Code+1)
						End If
'						Dim pd As PersianDate
'						Dim ti As String=pd.getDate(0,0,0,"/") & " " & DateTime.Time(DateTime.Now)
						MsgboxAsync("عملیات با موفقیت انجام گردید","")
						Activity_Resume
					Case "DuplicateEnter"
						myCode.setSetting("OUT.dat","input",Status)
						ToastMessageShow("ورود شما قبلا ثبت شده است",True)
						Activity_Resume
					Case "DuplicateExit"
						myCode.setSetting("OUT.dat","input",Status)
						ToastMessageShow("خروج شما قبلا ثبت شده است",True)
						Activity_Resume
					Case "NoEnter"
						ToastMessageShow("ورود شما ثبت نشده بدون ورود نمی توانید خروج ثبت کنید",True)
						Activity_Resume
					Case Else
						ToastMessageShow("خطایی در ثبت حضور و غیاب رخ داده است",True)
						
				End Select
				ProgressDialogHide
			
		Catch
			Log(LastException)
			myCode.SendError(LastException,Activity.Title&"-T_EnterExit_tick")
		End Try
	End If
End Sub

Sub T_DataCheck_Tick
	Dim Cu As Cursor = MCode.Result("Select * From TblLastSeen")
	If Cu.RowCount>0 Then
		LblText.Text = "اطلاعات ارسال نشده وجود دارد"
	Else
		LblText.Text = ""
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	T_DataCheck.Enabled=False
	'StopService(Service_Gps)
End Sub

Sub LoadDialogGetData
	Try
		Dim sf As Object = DialogGetData.ShowAsync("", "", "", "", Null, False)
'	DialogGetData.SetSize(94%x, 27%y)
'	DialogGetData.SetSize(94%x, 100%y)
	
'	Dim P As Panel
'	P.Initialize("P")
'	P.LoadLayout("L_YesNo")
'	p.SetLayout(0,0,100%x,100%y)
		Wait For (sf) Dialog_Ready(pnl As Panel)
'	pnl.AddView(P,0,0,94%x,100%y)
'	pnl.AddView(p,0,0,pnl.Width,pnl.Height)
		pnl.LoadLayout("L_YesNo")
		pnl.SetLayout(0,0,Pnl_Bk.Width,Pnl_Bk.Height)
		DialogGetData.SetSize(Pnl_Bk.Width + 5%x,Pnl_Bk.Height+5%y)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadDialogGetData")
	End Try
End Sub

Public Sub LoadDialogBackup(list As List)
	Try
		Dim sf As Object = DialogBackup.ShowAsync("", "", "", "", Null, False)
'	DialogGetData.SetSize(94%x, 27%y)
'	DialogGetData.SetSize(94%x, 100%y)
	
'	Dim P As Panel
'	P.Initialize("P")
'	P.LoadLayout("L_YesNo")
'	p.SetLayout(0,0,100%x,100%y)
		Wait For (sf) Dialog_Ready(pnl As Panel)
'	pnl.AddView(P,0,0,94%x,100%y)
'	pnl.AddView(p,0,0,pnl.Width,pnl.Height)
		pnl.Initialize("pnl")
		Pnl_Bk.Initialize("Pnl_Bk")
		pnl.LoadLayout("l_ShowListFileBackup")
		pnl.SetLayout(0,0,Pnl_Bk.Width,Pnl_Bk.Height)
		DialogBackup.SetSize(Pnl_Bk.Width + 5%x,Pnl_Bk.Height+5%y)
'	For i=0 To list.Size-1
'		Log(list.Get(i))
'	Next
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadDialogBackup")
	End Try
End Sub

Sub btnNo_Click
	DialogGetData.CloseDialog(DialogResponse.NEGATIVE)
End Sub

Sub BtnYes_Click
	Try
		DialogGetData.CloseDialog(DialogResponse.POSITIVE)
		Log("pnlGetData_Click")
		Dim Date As String = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
		Dim Time As String = DateTime.Time(DateTime.Now)
		Date = MCode.sf.Mid(Date,1,4) & "/" & MCode.sf.Mid(Date,5,2) & "/" & MCode.sf.Mid(Date,7,2)
		Dim Dt As String = Date & "   " & Time
		MCode.saveUpdate("Update TblSetting Set FldDateTimeRecive = '"& Dt &"'")
		ProgressDialogShow2("درحال دریافت اطلاعات...",False)

		'CallSubDelayed(Service_Connection,"Getsetting_New")
	
'		StopService(Service_Gps)
'		StopService(FusedLocationService)
		StopService(FusedLocationService)
		MCode.GpsIsEnable=False
		Log("Gps Stop")
		StopService(FirebaseMessaging)
		Log("FirebaseMessaging Stop")
		MCode.NoeGet="DaryaftEtlaat"
		ProgressDialogShow2("نرم افزار درحال دریافت اطلاعات از سرور میباشد، لطفا تا پایان عملیات دریافت منتظر بمانید",False)
		'th.Initialise("th")
		'th.Start(Me,"TUpdateData",Null)
		StartService(Service_Server)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-BtnYes_Click")
	End Try
End Sub

Sub pnlGetData_Click
	Try
		If MCode.Vaziat=0 Then
			ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
			Return
		End If
		If MCode.IsConnected=False And MCode.ConnectionStatus=1 Then
			ToastMessageShow("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید",False)
			Return
		End If
'		Dim Cu As Cursor = MCode.Result("Select * From TblFaktor where FldSync<>'True' ")
''		Dim Cu As Cursor = MCode.Result("Select * From TblAshkhasNew")
'		If Cu.RowCount>0 Then
'			ToastMessageShow("فاکتور ارسال نشده دارید لطفا ابتدا ارسال اطلاعات را انجام بدید سپس مجدد دریافت را بزنید",False)
'			Return
'		End If
'			Dim result As Int
'			result = Msgbox2("آیا مشتریان جدید حذف شوند؟", "حذف مشتری تعریف شده", "بله", "", "خیر", LoadBitmap(File.DirAssets,"icon.png"))
'		If result = DialogResponse.Positive Then 	
'			MCode.DeleteAshkhasNew=True
'		Else
'			MCode.DeleteAshkhasNew=False
'		End If
'		End If

		LoadDialogGetData
'		
		
'		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-pnlGetData_Click")
	End Try
End Sub

Sub pnlSendData_Click
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	StartActivity(Act_SendData)
End Sub

Sub pnlSabteSefaresh_Click
	Try
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
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-pnlSabteSefaresh_Click")
	End Try
End Sub
Sub PnlMoshtarian_Click
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
	MCode.page = "Act_Moshtarian"
	Try
		Dim Cu As Cursor
		Cu=MCode.Result("Select * From TblSetting")
		Cu.Position=0
		Log(Cu.GetString("FldC_Visitor"))
		If Cu.GetString("FldC_Visitor") = "کد ویزیتور" Then
			ToastMessageShow("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید",True)
			Return
		End If
		StartActivity(Act_SelectMantage)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-PnlMoshtarian_Click")
	End Try
End Sub
Sub pnlNewMoshtari_Click
	'If MCode.fldNewMoshtari=1 Then
	Try
		If MCode.Vaziat=0 Then
			ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
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
		If MCode.C_Visitor.Length<5 Then
			ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
			Return
		End If
		MCode.UpdateShakhs=False
		StartActivity(Act_NewAshkhas)
'	Else
'		ToastMessageShow("دسترسی شما محدود شده است",True)
'	End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-pnlNewMoshtari_Click")
	End Try
End Sub

private Sub btn_menu_Click
	sidemenu.ShowSecondaryMenu
End Sub
private Sub Btn_Search_Click
	Button4_Click
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	Try
		If KeyCode=KeyCodes.KEYCODE_BACK Then
			If sidemenu.Visible Then
				sidemenu.HideMenus
				Return True
			Else If PnlActivate.Visible Then
				PnlActivate.Visible=False
				MCode.AnimationClose(PnlActivate)
				Return True
			Else
				If IntExit = 1 Then
					'Starter.ShouldCloseAll=True
					Activity.Finish
					CloseActivities
				Else if IntExit = 0 Then
					IntExit = IntExit + 1
					ToastMessageShow("برای خروج کلید Back را مجدداً فشار دهید",False)
					T_Exit.Enabled = True
					Return True
				End If
			End If
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_KeyPress")
	End Try
	Return True
End Sub
Sub CloseActivities
	Dim jo As JavaObject
	jo.InitializeContext
	jo.RunMethod("finishAffinity", Null)
End Sub
Sub T_Exit_Tick
	IntExit = 0
	T_Exit.Enabled = False
End Sub

#if Java
import java.util.concurrent.Callable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

public static void GetAdvertisingId() {
   BA.runAsync(processBA, mostCurrent, "advertisingid_ready", new Object[] {false, ""}
       , new Callable<Object[]>() {
                   @Override
                   public Object[] call() throws Exception {
                       String id = AdvertisingIdClient.getAdvertisingIdInfo(mostCurrent).getId();
                       return new Object[] {true, id};
                   }
               }); }
#End If
Sub GetImei10
	Try
		Wait For (GetAdvertisingId) Complete (Id As String)
		Sleep(2000)
		If Id <> "" Then
			MCode.strImei = Id.Replace("-","")
			lbl_MenuIMEI.Text=MCode.strImei
			Log(MCode.strImei)
		Else
			MCode.strImei = GetDeviceId
			lbl_MenuIMEI.Text =MCode.strImei
			Log(MCode.strImei)
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-GetImei10")
	End Try
End Sub

Private Sub GetAdvertisingId As ResumableSub
	Dim jo As JavaObject = Me
	jo.RunMethod("GetAdvertisingId", Null)
	Wait For AdvertisingId_Ready (Success As Boolean, Id As String)
	Return Id
End Sub

Sub GetDeviceId As String
	Dim P As Phone
	Dim id As String
'	Dim r As Reflector
'	Dim Api As Int
'	Dim pID As PhoneId
	'
'	id = pID.GetDeviceId
'	Api = r.GetStaticField("android.os.Build$VERSION", "SDK_INT")
'	If id==Null Then
'		If Api < 9 Then
'			'Old devices
'			id= P.GetSettings("android_id")
'			'id = pID.GetDeviceId
'		Else
'			'New devices
'			id= r.GetStaticField("android.os.Build", "SERIAL")
'			If id.ToLowerCase = "unknown" Then
'				id= P.GetSettings("android_id")
'			End If
'	   
'			If id.ToLowerCase = "9774d56d682e549c" Or id = Null Then id = P.GetSettings("android_id")
'		End If
'	End If

'	If id == Null Or id == "" Then
	id= P.GetSettings("android_id")
	id = id.Replace("-","")
'	End If
	
'	Log(id)
	Return id
End Sub

Sub lbl_mnuText_Click
	btn_menu_Click
End Sub

Sub Activity_PermissionResult (Permission As String, Result As Boolean)
	If Permission=rp.PERMISSION_READ_PHONE_STATE Then
		If Result=True Then
			Log("---Get IMEI")
			If MCode.PImei.SdkVersion < 29 Then
				MCode.strImei = MCode.Imei.GetDeviceId
				lbl_MenuIMEI.Text=MCode.strImei
			Else
				GetImei10
			End If
		Else
			rp.CheckAndRequest(rp.PERMISSION_READ_PHONE_STATE)
		End If
	End If
	If Permission=rp.PERMISSION_ACCESS_COARSE_LOCATION Then
		If Result=True Then
			
		Else
'			ToastMessageShow("جهت کارکرد صحیح برنامه دسترسی ها را تایید فرمایید",True)
			rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_LOCATION)
		End If
	End If
	If Permission=rp.PERMISSION_ACCESS_FINE_LOCATION Then
		If Result=True Then
			
		Else
'			ToastMessageShow("جهت کارکرد صحیح برنامه دسترسی ها را تایید فرمایید",True)
			rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
		End If
	End If
	If Permission= rp.PERMISSION_CALL_PHONE Then
		Log(Result)
		If Result=True Then
			
		Else
'			ToastMessageShow("جهت کارکرد صحیح برنامه دسترسی ها را تایید فرمایید",True)
			rp.CheckAndRequest(rp.PERMISSION_CALL_PHONE)
		End If
	End If
End Sub

Sub Button1_Click
	'اعلانات
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

Sub Button2_Click
	'پشتیبانی
	StartActivity(Act_Support)
End Sub

Sub Button3_Click
	'تیکت
	StartActivity(Act_Ticket)
End Sub
Sub KalaSearch
'	If MCode.IsConnected Then
'		MCode.page="Search"
'		FirebaseMessaging.mode="GetGalleryKala"
'		StopService(Service_Gps)
'		StartService(FirebaseMessaging)
'	
'	Else
'		
'	End If
	StartActivity(Act_Search)
End Sub
Sub Button4_Click
	'کاتالوگ
	Try
		If MCode.C_Visitor="کد ویزیتور"  Then
			ToastMessageShow("ابتدا دریافت اطلاعات را انجام دهید",True)
			Return
		End If
		If MCode.C_Visitor.Length<5 Then
			ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
			Return
		End If
		If	MCode.Visitor="0" Then
			ToastMessageShow("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید",True)
			Return
		End If
		KalaSearch
		MCode.SetAnimation("zoom_enter1", "zoom_exit1")
	Catch
		Log(LastException)
	End Try
End Sub


Sub BtnBackMenu_Click
	sidemenu.HideMenus
End Sub
Sub OpenBackUpPnl
	pnlbak.Visible=True
	'BtnBackUpPnl.Visible=True
	MCode.AnimationOpen(pnlbak)
End Sub



Sub BtnBackUpPnl_Click
	If txtBackUpFile.Text<>"" Then
		Sleep(200)
		MCode.CreateBK(txtBackUpFile.Text)
		ToastMessageShow("پشتیبان اطلاعات با موفقیت تهیه شد",True)
		pnlbak.Visible=False
		MCode.AnimationClose(pnlbak)
		
	Else
		ToastMessageShow("لطفا نام فایل پشتیبانی را وارد نمایید",True)
		txtBackUpFile.SelectionStart=0
	End If
End Sub

Sub BtnCloseBackUpPnl_Click
	pnlbak.Visible=False
	MCode.AnimationClose(pnlbak)
End Sub





Sub PnlReport_Click
	'reports
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
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
	StartActivity(Act_Choose_Report)
'	Dim Lst As List
'	Lst.Initialize2(Array As String("گزارش مشتری","گزارش ویزیتور"))
'	InputListAsync(Lst,"انتخاب کنید",-1,True)
'	Wait For InputList_Result (Result As Int)
'	
'	Select Case Result
'		Case 0
'			StartActivity(Act_ReportVisitor)
'		Case 1
'			StartActivity(Act_ReportVisitor2)
	'End Select
End Sub

	#End Region

Sub UpdateVersion
	Try
		GetVersion
		VerFlag="update"
		ToastMessageShow("در حال بررسی ورژن نرم افزار . . .",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-UpdateVersion")
	End Try
End Sub
Sub UpdateApp
	Try
		apkupdt.PackageName = "ir.parsikhesab.pakhsh"
		apkupdt.NewVerApk = MCode.LinkDownload
		apkupdt.setCredentials("test","test")
		ButtonUpdate_Click
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-UpdateApp")
	End Try
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
	Try
		VerFlag="checkupdate"
		GetVersion
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btnCompare_Click")
	End Try
End Sub

'STEP 4: let's download the apk published on the webserver. No check on its version; just download it
'Can be called at any time not necessarily as step 4 as shown here
Sub btnDwnld_Click
	'download apk from webserver raising appropriate errors when problems arise
	Try
		apkupdt.DownloadApk  'send out command; async result in update_UpdateComplete
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btnDwnld_Click")
	End Try
End Sub

'STEP 5: let's ask the user to install an apk's newer version, previously downloaded
'Must follow step 4. 
Sub btnInstall_Click
	Try
		Wait For (CheckInstallationRequirements) Complete (Result As Boolean)
		apkupdt.InstallApk(Result)  'send out command; async result in update_UpdateComplete
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btnInstall_Click")
	End Try
End Sub

'Do it all (steps 1 to 5) with a single call
Sub ButtonUpdate_Click
	Try
		'EditText1.Text=$"A single sub call does it all${CRLF}"$
		Wait For (CheckInstallationRequirements) Complete (Result As Boolean)
		'OPTIONAL - if you like to show a splash screen while checking for a newer apk goes on
		apkupdt.SetAndStartSplashScreen(Activity,LoadBitmap(File.DirAssets, "bg-update-parsik-splash.jpg"))
		'NEEDED - this is the one you need if you want to perform "automatic" updating of your apk
		apkupdt.UpdateApk(Result) 'checks for newer apk, downloads it and asks the user to install it
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-ButtonUpdate_Click")
	End Try
End Sub




Sub update_UpdateComplete
	Try
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
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-update_UpdateComplete")
	End Try
End Sub

#Region version-safe-apk-installation
'http://www.b4x.com/android/forum/threads/version-safe-apk-installation.87667/

'Check whether we already have permission for install other apps. 
'If not we open the relevant settings page
'then wait for Activity_Resume and check the value of CanRequestPackageInstalls again
Private Sub CheckInstallationRequirements As ResumableSub
	Try
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
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-CheckInstallationRequirements")
		Return True
	End Try
End Sub
#End Region


Sub GetVersion
	Try
		jobInternet.JobName ="GetVersion"
		Dim str As String="parsiknew-"&MCode.TypeVersion
		If MCode.PrinterType=1 Then
			str="parsikPos"
		End If
		jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/Version","Imei=" & MCode.DeviceId &" &Type="&str)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-GetVersion")
	End Try
End Sub

Sub LoadGetVersion(Str As String)
	Try
		Dim RowsList As List
		Dim Row As Map
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		Row=RowsList.Get(0)
		MCode.NewVersion = Row.Get("FldVersion")
		MCode.LinkDownload = Row.Get("FldLink")
		Dim NumVer As String=Row.Get("FldNumberVersion")
		If NumVer>MCode.NumberVersion Then
			If VerFlag="update" Then
				UpdateApp
			End If
		
			If VerFlag="checkupdate" Then			
				Dim sf As Object = Msgbox2Async("نسخه جدید موجود است لطفا بروزرسانی کنید","هشدار بروزرسانی","بروزرسانی","","بعدا بروزرسانی میکنم",LoadBitmap(File.DirAssets,"icon.png"),False)
				Wait For (sf) Msgbox_Result (Result As Int)
				If Result = xui.DialogResponse_Positive Then
					MCode.CreateBK("")
					UpdateVersion
					Else
					ToastMessageShow("نسخه جدید موجود است لطفا بروزرسانی کنید",True)
				End If
				
			End If
		
		Else
			ToastMessageShow("شما از آخرین ورژن استفاده می کنید",True)
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadGetVersion")
	End Try
End Sub




Sub JobDone (Job As HttpJob)
	Try
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
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-JobDone")
	End Try
End Sub






Sub pnl_smartphone_Click
	
End Sub

Sub pnl_map_Click
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	StartActivity(Act_LocationVisitor)
End Sub

Sub btn_Lock_Click
	PnlActivate.Visible=True
	MCode.AnimationOpen(PnlActivate)
End Sub

Sub btnCloseActivate_Click
	PnlActivate.Visible=False
	MCode.AnimationClose(PnlActivate)
End Sub

Sub txtCodeMoshtari_TextChanged (Old As String, New As String)
	If txtCodeMoshtari.Text.Length>14 Then
		txtCodeMoshtari.Text=Old
		txtCodeMoshtari.SelectionStart=txtCodeMoshtari.Text.Length
	End If
End Sub

Sub btnSendActivate_Click
	Try
		If txtCodeMoshtari.Text<>"" And txtNameVisitor.Text<> "" Then
		
			MCode.CodeMoshtari=txtCodeMoshtari.Text
			MCode.N_Visitor=txtNameVisitor.Text
	             
			Dim Query As String="Update TblSetting Set FldTokenId = '"& MCode.DeviceId &"',FldCodeMoshtari = '"& txtCodeMoshtari.Text &"',FldNameVisitor = '"& txtNameVisitor.Text &"'"
			MCode.SaveUpdate(Query)
			MCode.page="Act_Main"
			MCode.NoeGet="SendTokenId"
			'StopService(Service_Gps)
			StopService(FusedLocationService)
			MCode.GpsIsEnable=False
			Log("Gps Stop")

			StartService(Service_Server)
	
		
			PnlActivate.Visible=False
			MCode.AnimationClose(PnlActivate)
			'CallSubDelayed(Service_Notification,"GetNotification3")
		Else
			ToastMessageShow("لطفا فیلد های خالی را تکمیل نمایید",False)
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btnSendActivate_Click")
	End Try
End Sub

Sub btnDarkMode_Click
	If MCode.DarkMode="True" Then
		MCode.DarkMode="False"
		btnDarkMode.Text=Chr(0xE3A8)
		
	Else
		MCode.DarkMode="True"
		btnDarkMode.Text=Chr(0xE3AA)
	
	End If
	SetColorItems
End Sub

Sub pnlTabligh_Click
	lbl_etelaeResani.TextColor=Colors.RGB(Rnd(0,255),Rnd(0,255),Rnd(0,255))
End Sub

Private Sub pnl_Havale_Click
	
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	Dim cu As Cursor=MCode.Result("Select * from TblHavale")
	If cu.RowCount=0 Then
		ToastMessageShow("حواله موجود نمی باشد",True)
		Return
	End If
	StartActivity(Act_HavaleTozie)
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

Private Sub btnSetting_Click
	StartActivity(Act_Setting)
End Sub



Private Sub pnlGoSite_Click
	MCode.OpenLinkInWebBrwoser("https://zaya.io/fbkzq")
End Sub

Private Sub pnlGoInsta_Click
	MCode.OpenLinkInWebBrwoser("https://zaya.io/v10gw")
End Sub




#If JAVA
import java.io.PrintWriter;
import java.io.StringWriter;

public static String GetJavaStackTrace(Exception e) {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    e.printStackTrace(pw);
    return sw.toString();
}
#End If