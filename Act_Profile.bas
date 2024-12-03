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
	Dim Gps As GPS
	Private t1 As Timer
	Dim T_Gps As Timer
	Dim TourVisit As Boolean
End Sub

Sub Globals
	Dim ListFaktor As List
	Private pnl_HLV As Panel
	Private HLV As Hitex_LayoutView
	Private rp As RuntimePermissions
	Private BtnShowCheks As Label
	Private LblVaziat As Label
	Private LblAddress As Label
	Private LblMandeHesab As Label
	Private LblLastSefaresh As Label
	Private LblLastVisit As Label
	Private LblTell As Label
	Private LblName As Label
	Private Button1 As Button
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	Private gmap As GoogleMap
	Private MapFragment1 As MapFragment
	Private pnl_location As Panel
	Private Pnl_menu As Panel
	Private lbl_sabt_Locastion As Label
	Private lbl_show_Locastion As Label
	Private lbl_Listi As Label
	Private lbl_Default As Label
	Private BtnShowMoeen As Label
	Dim GotoPage As Boolean
	Dim DialogNewVisit As CustomLayoutDialog
	Private LblDate As Label
	Dim MPD As ManamPersianDate
'	Private TimePicker As SingleTimePicker
	Private TxtDesc As EditText
	Dim jobInternet As HttpJob
'	Private LblLastTime As Label
'	Private LblLastText As Label
	Private lblTasvie As Label
	Dim mande As String=0
	Private LblCode As Label
	
	Private LblBlackList As Label
	Private LblMandeEtebar As Label
	Private PnlNextVisit As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Profile")
	jobInternet.Initialize("jobInternet",Me)
	ListFaktor.Initialize
	ListFaktor.Clear
	Gps.Initialize("Gps")
	t1.Initialize("t1",5000)
	T_Gps.Initialize("T_Gps",7000)
	HLV.Initializer("HLV").ListView.Build
	pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Height)
	HLV.Show
	'CreatePage
	Log("tour: "&TourVisit)
End Sub

Sub Activity_Resume
	'MCode.UpdateSetting
'	MCode.page="Profile"
	CreatePage
	LoadListFaktor
	
'	HLV.notifyDataSetChanged
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	Gps.Stop
End Sub

Sub btn_Back_Click
	MCode.C_Tafzili=0
	Activity.Finish
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	Try
		If KeyCode=KeyCodes.KEYCODE_BACK Then
			btn_Back_Click
		End If
		Return True
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_KeyPress")
	End Try
	Return True
End Sub

Sub Button1_Click
	
	If MCode.Tozie=1 Then
		StartActivity(Act_Mali)
		Else

		ToastMessageShow("این دسترسی برای شما فعال نیست ، با پشتیبانی تماس بگیرید",True)
	End If
	
	
End Sub

Sub Button2_Click
	If MCode.SendMarjoie = 1 Then
'	MCode.SaveUpdate("Delete From TblSabad")
	
'		If MCode.IsConnected Then
'		StartService(FirebaseMessaging)
'		MCode.page="SabtMarjooii"
'		FirebaseMessaging.mode="GetGalleryKala"
'		
'		Sleep(100)
'		MCode.NoeGet="GetEshantion"
'		StartService(Service_Server)
'		
'		Sleep(50)
'		MCode.FaktorSelect=""
'		MCode.Action="SabtMarjooii"
'		StartActivity(Act_KalaDefault)
'	Else
		Log(MCode.C_Tafzili)
		MCode.FaktorSelect=""
		MCode.Action="SabtMarjooii"
		StartActivity(Act_KalaDefault)
'	End If
	Else
		ToastMessageShow("این دسترسی برای شما فعال نیست ، با پشتیبانی تماس بگیرید",True)
	End If
	
End Sub

Sub Button3_Click
	If	MCode.Visitor="0" Then
		ToastMessageShow("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید",True)
		Return
	End If
	lbl_Default_Click
'	pnl_location.Visible=False
'	Pnl_menu.BringToFront
'	
'	If Pnl_menu.Visible=False Then
'		Pnl_menu.SetVisibleAnimated(600,True)
'	Else
'		Pnl_menu.SetVisibleAnimated(600,False)
'	End If
End Sub

Sub Button4_Click
	pnl_location.BringToFront
	Pnl_menu.Visible=False
	If pnl_location.Visible Then
		pnl_location.SetVisibleAnimated(600,False)
	Else
		pnl_location.SetVisibleAnimated(600,True)
	End If
End Sub

Sub CreatePage
	Sleep(200)
	Dim Cu As Cursor=MCode.Result("Select * From TblAshkhas Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
	If Cu.RowCount>0 Then
		Cu.Position=0
		LblCode.Text=Cu.GetString("fldCodetafzili")
		LblName.Text=Cu.GetString("fldSharheTafzili")
		LblVaziat.Text="وضعیت : "&myCode.Is_Null(Cu.GetString("FldVaziat"))
		
		If myCode.Is_Null_adad(Cu.GetString("fldBlackList"))=1 Then
			LblBlackList.Visible=True
		Else
			LblBlackList.Visible=False
		End If
'		If IsNumber(Cu.GetString("FldEtebar")) Then
'			Dim st As String=NumberFormat2(Cu.GetString("FldEtebar"),1,0,0,True)
'			Log("==>>"& st)
'			Sleep(100)
''			LblHadeEtebar.Text = st & " " & MCode.VahedPool
'		Else
'			LblHadeEtebar.Text=" 0 " & MCode.VahedPool
'		End If
		
'		Select Case MCode.showbedehkaran
'			Case "0"
'				LblMandeHesab.Text="عدم دسترسی"
'			Case "1"

				If IsNumber(Cu.GetString("fldMande")) Then
					Dim st As String=NumberFormat2(Cu.GetString("fldMande"),1,0,0,True)
					mande=Cu.GetString("fldMande")
					Log(st)
					Sleep(100)
					LblMandeHesab.Text = st & " " & MCode.VahedPool
				Else
					LblMandeHesab.Text=" 0 " & MCode.VahedPool
				mande=0
				End If
		If mande>0 Then
			LblMandeEtebar.Text=myCode.AdadToPrice(myCode.Is_Null_adad(Cu.GetString("fldSaghfeEtebar")) - mande)
		Else
			LblMandeEtebar.Text=myCode.AdadToPrice(myCode.Is_Null_adad(Cu.GetString("fldSaghfeEtebar")))
		End If
		
'		End Select
		
'		Dim lastVisit As String = myCode.Is_Null(Cu.GetString("FldLastVisit"))
'		If lastVisit.Length = 0 Then
'			LblLastVisit.Text="//"
'		Else
'			LblLastVisit.Text= MCode.Sf.Mid(lastVisit,1,4) & "/" & MCode.Sf.Mid(lastVisit,5,2) & "/" & MCode.Sf.Mid(lastVisit,7,2)
'		End If
'		
'		Dim FldLastSefaresh As String = myCode.Is_Null(Cu.GetString("FldLastSefaresh"))
'		If FldLastSefaresh.Length = 0 Then
'			LblLastSefaresh.Text="//"
'		Else
'			LblLastSefaresh.Text= MCode.Sf.Mid(FldLastSefaresh,1,4) & "/" & MCode.Sf.Mid(FldLastSefaresh,5,2) & "/" & MCode.Sf.Mid(FldLastSefaresh,7,2)
'		End If
		
		Dim LastVisit As String = myCode.Is_Null(Cu.GetString("lastSeen"))
		If LastVisit.Length = 0 Then
			LblLastVisit.Text="//"
		Else
			Dim Str As List
			Str.Initialize
			Str = MCode.Sf.Split(LastVisit.Replace("-","/"),"T")

			Dim DT As List = MCode.Sf.Split(Str.get(0),"/")
			Dim lastVisitDate As String = MCode.PersianDateDash(DT.Get(0))
			Dim lastVisitTime As String = Str.get(1)
			LblLastVisit.Text=lastVisitDate & CRLF & lastVisitTime
		End If
		
		Dim DateTimeLastSefaresh As String = myCode.Is_Null(Cu.GetString("lastOrderDate"))
		If DateTimeLastSefaresh.Length = 0 Then
			LblLastSefaresh.Text="//"
		Else
			Dim Str As List
			Str.Initialize
			Str = MCode.Sf.Split(DateTimeLastSefaresh.Replace("-","/"),"T")
			
			Dim DT As List = MCode.Sf.Split(Str.get(0),"/")
			Dim LastSefareshDate As String = MCode.PersianDateDash(DT.Get(0))
			Dim LastSefareshTime As String =Str.get(1)
			LblLastSefaresh.Text=LastSefareshDate & CRLF & LastSefareshTime
		End If
		
		LblTell.Text=myCode.Is_Null(Cu.GetString("fldTell")) & " | " & myCode.Is_Null(Cu.GetString("FldMobile"))
			MCode.Tell_Tafzili=LblTell.Text
		If myCode.Is_Null(Cu.GetString("FldMobile")) <> "" Then
			LblTell.tag=Cu.GetString("FldMobile")
		 End If
		If myCode.Is_Null(Cu.GetString("fldTell")) <> "" Then
			LblTell.tag=Cu.GetString("fldTell")
		End If
		LblAddress.Text=Cu.GetString("fldAdress")
		MCode.Address_Tafzili=LblAddress.Text
	End If
	
'	Cu=MCode.Result("Select FldTakhfifVizhe From TblAshkhas Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
'	Cu.Position=0
'	If Cu.GetString("FldTakhfifVizhe") <> Null Then
'		MCode.DarsadTakhfifVizhe = Cu.GetString("FldTakhfifVizhe")
'	Else
'		MCode.DarsadTakhfifVizhe = 0
'	End If
	
End Sub

Private Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As cls_RecFaktor
	rec.Initialize
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub
Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim item As AdapterListFaktor=ListFaktor.Get(Position)
	Dim rec As cls_RecFaktor=Parent.Tag
	rec.show(item)
	Parent.Height=rec.Height
End Sub
Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return ListFaktor.Size '/ItemList.Size
End Sub
Sub LoadListFaktor
	Sleep(200)
	ListFaktor.Clear

	Dim Cu As Cursor = MCode.Result("Select * From TblFaktor Where FldC_Tafzili = '"& MCode.C_Tafzili &"'  Group by FldShomareFaktor,FldTotalFaktor,FldDate,FldTime Order By Cast(FldShomareFaktor As Int)")
	If Cu.RowCount>0 Then
		For i=0 To Cu.RowCount-1
			Try
				Cu.Position=i
				Dim Item As AdapterListFaktor
				Item.FldShomareFaktor=Cu.GetString("FldShomareFaktor")
				If Cu.GetString("FldShomareBargasht")<>0 And Cu.GetString("FldShomareBargasht")<>Null Then
					Item.FldShomareBargasht=Cu.GetString("FldShomareBargasht")
					Item.wIsBacked=True
				Else
					Item.wIsBacked=False
					Item.FldShomareBargasht=0
				End If
				
				Item.FldTotalFaktor=Cu.GetString("FldTotalFaktor")				
				Item.fldC_Ashkhas=Cu.GetString("FldC_Tafzili")
				Item.fldTozihFaktor = myCode.Is_Null( Cu.GetString("FldTozihat"))
				Log(">>"&Item.fldC_Ashkhas)
				Item.C_Name = LblName.Text
				Item.fldC_Tasvie=Cu.GetString("FldVaziatPardakht")
				Log(myCode.Is_Null(Cu.GetString("FldSync")))
				If myCode.Is_Null(Cu.GetString("FldSync"))="True" Then
					Item.synced=True
				Else
					Item.synced=False
				End If
				Dim MPD As ManamPersianDate
				Dim sd As String	= myCode.Is_Null(Cu.GetString("FldDate"))
				Log(sd)
				'Item.FldDate	= MPD.GregorianToPersian(MCode.Sf.Mid(sd,1,4) , MCode.Sf.Mid(sd,6,2) , MCode.Sf.Mid(sd,9,2))
				Item.FldDate=Cu.GetString("FldDate")				
				Item.FldTime=Cu.GetString("FldTime")
				ListFaktor.Add(Item)
			Catch
				Log(LastException)
			End Try
		Next
		HLV.notifyDataSetChanged
	End If
	Log(ListFaktor.Size)
	
End Sub

Sub BtnShowCheks_Click
	'StartActivity(Act_Check)
	Log("Check")
End Sub

Sub lbl_Default_Click
	GotoPage = False
	ProgressDialogShow("")
'	MCode.SaveUpdate("Delete From TblSabad")
	
	Dim Date As String = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	MCode.FaktorSelect=""
	MCode.Action="SabtFaktor"
	'	If MCode.FaktorSelect="" Then
	Dim Cu As Cursor = MCode.Result("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	If Cu.RowCount>0 Then
		MCode.SaveUpdate("Update TblLogVisitSefaresh Set FldVisit = '"& Date &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	Else
		MCode.SaveUpdate("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"& MCode.C_Tafzili &"','"& Date &"','','','','')")
	End If
	MCode.SaveUpdate("Update TblAshkhas Set FldLastVisit = '"& Date &"' Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
	MCode.SaveUpdate("Update TblVisitorTour Set FldLastVisit = '"& Date &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	

	SaveLastSeen

	'If MCode.Gps = 1 Then
		'SaveGps
	'Else
Pnl_menu.SetVisibleAnimated(600,False)

	KalaDefault
		
	
End Sub

Sub lbl_Listi_Click
	GotoPage = True
	ProgressDialogShow("")
	MCode.SaveUpdate("Delete From TblSabad")
	Dim Date As String = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	
	MCode.FaktorSelect=""
	MCode.Action="SabtFaktor"
'	If MCode.FaktorSelect="" Then
	Dim Cu As Cursor = MCode.Result("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	If Cu.RowCount>0 Then
		MCode.SaveUpdate("Update TblLogVisitSefaresh Set FldVisit = '"& Date &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	Else
		MCode.SaveUpdate("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"& MCode.CodeMoshtari &"','"& Date &"','','','','')")
	End If
'	MCode.SaveUpdate("Update TblAshkhas Set FldLastVisit = '"& Date &"' Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
	MCode.SaveUpdate("Update TblVisitorTour Set FldLastVisit = '"& Date &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
'	End If
		
	SaveLastSeen
	
	'If MCode.Gps = 1 Then
	'	SaveGps
	'Else
	Pnl_menu.SetVisibleAnimated(600,False)
	
	Kalalisti
'	If MCode.ConnectionState Then
'		StartService(FirebaseMessaging)
'		MCode.page="Kala_listi"
'		FirebaseMessaging.mode="GetGalleryKala"
'		
'		Sleep(100)
'		MCode.NoeGet="GetEshantion"
'		StartService(Service_Server)
'		
'		Sleep(50)
'		StartActivity(Act_Kala_listi)
'	Else
'		StartActivity(Act_Kala_listi)
'	End If
		
	'End If
End Sub

Sub SaveLastSeen
	'ثبت آخرین بازدید مشتری=====================================
	DateTime.DateFormat="yyyy-MM-dd"
'	Dim DateMiladi As String = MCode.ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
	Dim DateShamsi As String = MCode.DatePersian
	Dim Time As String = DateTime.Time(DateTime.Now)
	Dim D As String = DateShamsi & "T" & Time
	LogColor("D: " & D,Colors.Red)
			
	Dim Cu As Cursor = MCode.Result("Select * From TblLastSeen Where FldC_Ashkhas = '"& MCode.C_Tafzili &"' ")
	If Cu.RowCount>0 Then
		MCode.SaveUpdate("Update TblLastSeen Set LastSeen = '"& D &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	Else
		MCode.SaveUpdate("Insert Into TblLastSeen (FldC_Ashkhas,LastSeen) Values ('"& MCode.C_Tafzili &"','"& D &"')")
	End If
	MCode.SaveUpdate("Update TblAshkhas Set lastSeen = '"& D &"' Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
	
	If MCode.TourVisitSW And MCode.TourVisit=1 Then
		MCode.SaveUpdate("Update tblTourVisitor Set fldVaziat='2',fldTimeVisit='"& Time &"',fldSend='False' Where fldCodeTafzili = '"& MCode.C_Tafzili &"' and fldDateVisit='"& MCode.DatePersian &"' and fldType='Tour'")
	Else
		Dim Count As Int = MCode.SingleResult($"Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldType='Free'"$)
		Dim MaxRadif As Int
		If Count=0 Then
			MaxRadif=1
		Else
			MaxRadif= MCode.SingleResult($"Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldType='Free'"$)
			MaxRadif=MaxRadif+1
		End If
		Cu = MCode.Result($"SELECT * FROM TblAshkhas WHERE TblAshkhas.fldCodetafzili =${MCode.C_Tafzili}"$)
				
		Cu.Position=0
		MCode.SaveUpdate("Insert into tblTourVisitor(fldRadif,fldCodeSuperVisor,fldCodeGroup,fldCodeVisitor,fldCodeTafzili,fldSharheTafzili,fldDate,fldDateVisit,fldTimeVisit,fldDateNextVisit,fldDateTozie,fldShomareSefaresh,fldTimeSefaresh,fldSharh,fldVaziat,fldShomareFactor,fldSend,fldType) Values("& MaxRadif &",0,'"& Cu.GetString("fldCodeGroup") &"','"& MCode.C_Visitor &"','"& MCode.C_Tafzili &"','"& MCode.N_Tafzili &"','"& MCode.DatePersian &"','"& MCode.DatePersian &"','"& Time &"','0','0','0','','0','2','0','False','Free')")
	End If
	
	'=======================================================
End Sub

Sub SaveGps	
	If Gps.GPSEnabled=False Then
		ToastMessageShow("موقعیت مکانی خود را روشن کنید", True)
		t1.Enabled=False
		StartActivity(Gps.LocationSettingsIntent)
	Else
		ProgressDialogShow2("لطفا تا دریافت موقعیت مکانی صبر کنید",False)
		t1.Enabled=True
	End If
End Sub

Sub MapFragment1_Ready
	Sleep(100)
	Try
		gmap = MapFragment1.GetMap
		rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result Then
			gmap.MyLocationEnabled = True
		Else
			Log("No permission!")
		End If
	Catch
		Log(LastException)
	End Try

End Sub

Sub t1_tick
	t1.Enabled=False
	If gmap.IsInitialized Then
		Try
			Dim cl As CameraPosition
			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
			gmap.AnimateCamera(cl)
			Dim Lat As String = gmap.MyLocation.Latitude
			Dim Lon As String = gmap.MyLocation.Longitude
			Gps.Stop
			
			Dim Time As String = MCode.ConvertNumbersPersian2English(DateTime.Time(DateTime.Now))
			Dim Date As String = MCode.ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
			Date=Date.Replace("/","-") & " " & Time & ".000"
			LogColor(Date,Colors.Magenta)
			MCode.SaveUpdate("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"& MCode.C_Visitor &"','"& Date &"','"& Time &"','"& Lat &"','"& Lon &"')")
'			MCode.SaveUpdate("Insert Into TblGps (FldC_Visitor,FldLat,FldLon,FldDate,FldTime,FldC_Customer,FldVaziat) Values ('"& MCode.C_Visitor &"','"& _
'	 			Lat &"','"& Lon &"','"& Date &"','"& Time &"','"& MCode.CodeMoshtari &"','False')")
			LogColor("Save Locate: " & Lat & "--" & Lon,Colors.Blue)
			ProgressDialogHide
'			T_Gps.Enabled=False

			Wait For UpdateKala

			Select Case GotoPage
				Case False
					Pnl_menu.SetVisibleAnimated(600,False)
					KalaDefault
				Case True
					Pnl_menu.SetVisibleAnimated(600,False)
					StartActivity(Act_Kala_listi)
			End Select
		Catch
			Log(LastException)
		End Try
	Else
		Select Case GotoPage
			Case False
				Pnl_menu.SetVisibleAnimated(600,False)
				KalaDefault
			Case True
				Pnl_menu.SetVisibleAnimated(600,False)
				StartActivity(Act_Kala_listi)
		End Select
	End If
End Sub
Sub KalaDefault
'	If MCode.IsConnected Then
'		MCode.page="KalaDefault"
'		FirebaseMessaging.mode="GetGalleryKala"
'		StopService(Service_Gps)
'		StartService(FirebaseMessaging)
'	
'	Else
		StartActivity(Act_KalaDefault)
'	End If
	
End Sub
Sub Kalalisti
'	If MCode.IsConnected Then
'		MCode.page="Kala_listi"
'		FirebaseMessaging.mode="GetGalleryKala"
'		StopService(Service_Gps)
'		StartService(FirebaseMessaging)
'	
'	Else
		StartActivity(Act_Kala_listi)
'	End If
	
End Sub
Sub Gps_LocationChanged (Location1 As Location)

End Sub

Sub lbl_show_Locastion_Click
	pnl_location.SetVisibleAnimated(600,False)
'	DialogProfile_ItemSelected(Null,3,"")

		If Gps.GPSEnabled=False Then
			ToastMessageShow("موقعیت مکانی خود را روشن کنید", True)
			StartActivity(Gps.LocationSettingsIntent)
		Else
		Dim Cu As Cursor = MCode.Result("Select * From TblAshkhas Where fldCodetafzili = '"& MCode.C_Tafzili &"' And FldLat <> '0' And FldLon <> '0'")
			If Cu.RowCount>0 Then
				Try
					Cu.Position=0
					Dim l As Location
					l.Initialize
					l.Latitude=Cu.GetString("FldLat")
					l.Longitude=Cu.GetString("FldLon")
					Act_ShowLocation.Location=l
				Act_ShowLocation.Name=Cu.GetString("fldSharheTafzili")
					StartActivity(Act_ShowLocation)
				Catch
					ToastMessageShow("برای این شخص موقعیت ثبت نگردیده است",True)
				End Try
				
			Else
				ToastMessageShow("برای این شخص موقعیت ثبت نگردیده است",True)
			End If
		End If

End Sub

Sub lbl_sabt_Locastion_Click
	pnl_location.SetVisibleAnimated(600,False)
'	DialogProfile_ItemSelected(Null,2,"")

		If Gps.GPSEnabled=False Then
			ToastMessageShow("موقعیت مکانی خود را روشن کنید", True)
			StartActivity(Gps.LocationSettingsIntent)
		Else
		Dim Cu As Cursor = MCode.Result("Select FldLat,FldLon From TblAshkhas Where fldCodetafzili = '"& MCode.C_Tafzili &"' And FldLat <> '0' And FldLon <> '0'")
			If Cu.RowCount>0 Then
				Msgbox2Async("برای این مشتری موقعیت ثبت شده است آیا مایلید موقعیت را اصلاح کنید؟", "", "بله", "", "خیر", Null, False)
				Wait For Msgbox_Result (Result As Int)
				If Result = DialogResponse.POSITIVE Then
'					ProgressDialogShow2("لطفا تا دریافت موقعیت مکانی صبر کنید" & CRLF & "جهت تسریع در این عملیات زیر سقف نباشید",True)
					StartActivity(Act_SaveLocation)
				End If
			Else
'				ProgressDialogShow2("لطفا تا دریافت موقعیت مکانی صبر کنید" & CRLF & "جهت تسریع در این عملیات زیر سقف نباشید",True)
				StartActivity(Act_SaveLocation)
'				Gps.Start(0,0)
			End If
		End If
End Sub

Sub BtnShowMoeen_Click
	'Act_RepMoeen.CodeMoshtari=MCode.CodeMoshtari
	'StartActivity(Act_RepMoeen)
End Sub

Sub lblCall_Click
	Dim isPos As Int = myCode.getSetting("setting.dat","isPos",0)
	Select Case isPos
		Case 1
			ToastMessageShow("این امکان فقط برای تلفن همراه است",True)
		Case 0
			Dim str As String=LblTell.tag
			Dim i As Intent
			i.Initialize(i.ACTION_VIEW, "tel:"&str)
			StartActivity(i)
	End Select
	

End Sub

Sub BtnNextVisit_Click
	OpenDialogNewVisit
End Sub

Sub OpenDialogNewVisit
	PnlNextVisit.Visible=True
	MCode.AnimationOpen(PnlNextVisit)
	
	Dim Cu As Cursor = MCode.Result("Select * From TblNextVisit Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	If Cu.RowCount>0 Then
		Cu.Position=0
		TxtDesc.Text = Cu.GetString("NextVisitText")
'		Log(Cu.GetString("NextVisitDate"))

		Dim DT As List = MCode.Sf.Split(Cu.GetString("NextVisitDate"),"-")
		LblDate.Text = MCode.PersianDate.getDate(DT.Get(0),DT.Get(1),DT.Get(2),"/")
	End If
End Sub

Sub LblBack_Click
'	DialogNewVisit.CloseDialog(DialogResponse.NEGATIVE)
	PnlNextVisit.Visible=False
	MCode.AnimationClose(PnlNextVisit)
End Sub

Sub LblDate_Click
	Dim p1 As PersianMaterialDatePicker
	p1.Initialize("p1",p1.PersianYear,p1.PersianMonth,p1.PersianDay)
	p1.AccentColor = Colors.RGB(83,99,255)
	p1.OkText = "تایید"
	p1.CancelText = "لغو"
	p1.Title = "تا تاریخ"
	p1.Typeface = "iransansmobile(fanum)_bold.ttf"
	p1.Show("p1")
End Sub
Sub p_onDateSet(year As Int,month As Int,day As Int)
	Log(year&"/"&month&"/"&day)
	LblDate.Text=year&"/"&NumberFormat(month,2,0)&"/"&NumberFormat(day,2,0)
	LblDate.Tag=MPD.PersianToGregorian(year,month,day).Replace("/","-") 
	LogColor(LblDate.Tag,Colors.Magenta)
End Sub
Sub p_onCancel
	Log("cancel")
End Sub
Sub p_onDismiss
	Log("dismiss")
End Sub


Sub TxtDesc_TextChanged (Old As String, New As String)
	If New.Length>245 Then
		ToastMessageShow("تعداد حروف می بایست 250 حرف باشد",True)
		TxtDesc.Text = Old
	End If
End Sub

Sub BtnSave_Click
	Dim Check As Boolean = LblDate.text <> "انتخاب کنید" And TxtDesc.Text <> ""
	If Check = True Then
		Dim D As String = LblDate.Tag '& " " & TimePicker.tag
		Dim Cu As Cursor = MCode.Result("Select * From TblNextVisit Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
		If Cu.RowCount>0 Then
			MCode.SaveUpdate("Update TblNextVisit Set NextVisitDate = '"& D &"',NextVisitText = '"& TxtDesc.text &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
		Else
			MCode.SaveUpdate("Insert Into TblNextVisit (FldC_Ashkhas,NextVisitDate,NextVisitText) Values ('"& MCode.C_Tafzili &"','"& D &"','"& TxtDesc.text &"')")
		End If
		
		MCode.SaveUpdate("Update TblAshkhas set nextVisitDate = '"& D &"',nextVisitText = '"& TxtDesc.text &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
		
		LblBack_Click
	Else
		ToastMessageShow("اطلاعات را به طور کامل وارد کنید",True)
	End If	
End Sub


Sub LblDesc_Click
	Dim Str As String
	Dim Cu As Cursor=MCode.Result("Select * From TblAshkhas Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
	If Cu.RowCount>0 Then
		Cu.Position=0
		Dim nextVisitDate As String = myCode.Is_Null(Cu.GetString("nextVisitDate"))
		Dim Lst As List = MCode.Sf.Split(nextVisitDate.Replace("-","/"),"T")
		If nextVisitDate.Length>0 Then
			Dim DT As List = MCode.Sf.Split(Lst.Get(0),"/")
			Dim lastDate As String = MCode.PersianDate.getDate(DT.Get(0),DT.Get(1),DT.Get(2),"/")
			Str = "آخرین تاریخ ثبت شده: " & lastDate & CRLF
		Else
			Str = "آخرین تاریخ ثبت شده: //" & CRLF
		End If
		
		Dim nextVisitText As String = myCode.Is_Null(Cu.GetString("nextVisitText"))
		If nextVisitText.Length>0 Then
			Str = Str & "آخرین یادداشت ثبت شده: " & Cu.GetString("nextVisitText")
		Else
			Str = Str & "آخرین یادداشت ثبت شده: ..."
		End If
		MsgboxAsync(Str,"")
	End If
End Sub

Sub GetLocation(CodeTafzili As String)
	jobInternet.JobName ="GetLocation"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select FldC_Tafzili,FldLat,FldLon From TblLocation Where FldC_Tafzili = '"& CodeTafzili &"'" & "&Imei=" & MCode.DeviceId)
End Sub

Sub LoadGetLocation(Str As String)
	Dim RowsList As List
	Dim Row As Map
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		ProgressDialogHide
		ShowMap(Row.Get("FldLat"), Row.Get("FldLon"))
	Next
End Sub

Sub ShowMap(Lat1 As String,Lon1 As String)
	If Lat1 ="" And Lon1="" Then
		ToastMessageShow("برای این شخص موقعیت ثبت نشده است",True)
		Return
	End If
	
	Dim destLat As Double = Lat1 ' عرض جغرافیایی مقصد
	Dim destLng As Double = Lon1 ' طول جغرافیایی مقصد
	Dim label As String = "Destination" ' برچسب مقصد

	Dim uri As String
	uri = "google.navigation:q=" & destLat & "," & destLng & "&label=" & label

	Dim intent As Intent
	intent.Initialize(intent.ACTION_VIEW, uri)
	intent.SetComponent("com.google.android.apps.maps")

	If intent.IsInitialized Then
		StartActivity(intent)
	Else
		ToastMessageShow("Google Maps app not found", True)
	End If
	
'	Dim Intent1 , in2 As Intent
'	Dim Uri As String
'	Dim pm As PackageManager
''	in2 = pm.GetApplicationIntent("com.google.android.apps.maps")
''	If in2.IsInitialized Then
'		Uri="geo:0,0?q=" & Lat1 & "," & Lon1 
'		'Uri="google.navigation:q=" & Lat1 & "," & Lon1 & "
'		Intent1.Initialize(Intent1.ACTION_VIEW, Uri)
'		StartActivity(Intent1)
''	Else
''		ToastMessageShow("لطفا GoogleMap را نصب نمایید.",True)
''	End If
End Sub

Sub JobDone (Job As HttpJob)
	Job.GetRequest.Timeout=50000
	If Job.Success Then
	
		Dim Str As String = Job.GetString
		If Str <> "" Then
			Select Case Job.JobName
				Case "GetLocation"
					If Str = "No Result" Then
						ProgressDialogHide
						ToastMessageShow("برای این شخص موقعیت ثبت نشده است",True)
					Else
						LoadGetLocation(Str)
					End If
			End Select
		Else
			ProgressDialogHide
			'ToastMessageShow("خطا در اتصال",False)
		End If
	Else
		ProgressDialogHide
		'ToastMessageShow("خطا در اتصال",False)
	End If
	jobInternet.Release
End Sub

Private Sub BtnShowMap_Click
	
	GetLocation(MCode.C_Tafzili)
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

Private Sub lblTasvie_Click
	Act_Mali.ShomareFactor=0
	Act_Mali.MabalghGhablepardakht=mande
	Act_Mali.CodeMoshtari=MCode.C_Tafzili
	Act_Mali.NameMoshtari=MCode.N_Tafzili
	Act_Mali.ShomareTell=LblTell.Text
	StartActivity(Act_Mali)
End Sub