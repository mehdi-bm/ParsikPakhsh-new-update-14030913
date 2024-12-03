B4A=true
Group=Report
ModulesStructureVersion=1
Type=Activity
Version=13
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Private rp As RuntimePermissions	
	Dim LstLocation As List
	
End Sub

Sub Globals
	Private gmap As GoogleMap
	Private MapFragment1 As MapFragment
	Private XUI As XUI
	Private Panel1 As Panel
	Private pnlMap As Panel	
	Private PnlTop As Panel
	Dim points As List
	Private btnForward As Button
	Private btnNext As Button
	Private btnVisit As Button
	Private lblAddress As Label
	Private lblCall As Label
	Private lblCodeMoshtari As Label
	Private lblGoToLocation As Label
	Private lblNameMoshtari As Label
	Private lblRadif As Label
	Private lblShomareTell As Label
	Private lblVaziatVisit As Label
	Dim itemSelect As AdapterListAshkhas
	Dim n As String=0
	Dim Cu As Cursor
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("l_moshtarianlocation")
	'MCode.page="Act_LocationMoshtarian"	
End Sub




Sub LoadData(lst As List)
	If lst.Size>0 Then
		LstLocation=lst
		LoadMap
	End If
End Sub

Sub LoadMap
	If MCode.IsConnected=False And MCode.ConnectionStatus=1 Then
		ToastMessageShow("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید",False)
		Return
	End If
	If MapFragment1.IsGooglePlayServicesAvailable = False Then
		ToastMessageShow("Please install Google Play Services.", True)
		Return
	End If
	Sleep(200)
	gmap = MapFragment1.GetMap
	rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then
		If LstLocation.Size>0 Then
			gmap.MyLocationEnabled = True
			GetLocation
		End If
		If pnlMap.Visible=False Then
			pnlMap.Visible=True
		End If
	Else
		Log("No permission!")
	End If
	
End Sub

Private Sub GetLocation
	If gmap.IsInitialized Then
		Try	
				points.Initialize
				gmap.Clear
				points.Clear	
			If MCode.TourVisitSW Then
				'اگر تور ویزیت باشد
				Cu = MCode.Result($"SELECT tblTourVisitor.fldRadif,tblTourVisitor.fldCodeSuperVisor,tblTourVisitor.fldCodeVisitor,tblTourVisitor.fldCodeGroup,tblTourVisitor.fldCodeTafzili,TblAshkhas.fldSharheTafzili,tblTourVisitor.fldDate,tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit,tblTourVisitor.fldDateNextVisit,tblTourVisitor.fldDateTozie,tblTourVisitor.fldShomareSefaresh,tblTourVisitor.fldSharh,tblTourVisitor.fldVaziat,tblTourVisitor.fldShomareFactor,TblAshkhas.FldLat,TblAshkhas.FldLon,TblAshkhas.fldTell,TblAshkhas.fldAdress,TblAshkhas.fldMande,TblAshkhas.fldSaghfeEtebar,TblAshkhas.fldBlackList  FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND fldDateVisit = ${MCode.DatePersian} and fldType='Tour' ORDER BY tblTourVisitor.fldRadif ASC"$)
				
				If Cu.RowCount>0 Then
					For i=0 To Cu.RowCount-1
						Dim llPoint As LatLng
						Dim color As Float
						Dim vaziat As String
						Cu.Position=i
						If Cu.GetString("fldVaziat")="1" Then
							color=gmap.HUE_RED							
							vaziat="ویزیت نشده"
						Else if Cu.GetString("fldVaziat")="2" Then
							color=gmap.HUE_BLUE
							vaziat="ویزیت شده"
						Else if Cu.GetString("fldVaziat")="3" Then
							color=gmap.HUE_GREEN
							vaziat="سفارش گرفته"
						Else
							color=gmap.HUE_RED
							vaziat="ویزیت نشده"
						End If
						gmap.AddMarker2(Cu.GetString("FldLat"),Cu.GetString("FldLon"),Cu.GetString("fldRadif") &") :"& "کد: "&Cu.GetString("fldCodeTafzili") &" نام: " & Cu.GetString("fldSharheTafzili") & " وضعیت: "& vaziat,color).Snippet=i
						llPoint.Initialize(Cu.GetString("FldLat"),Cu.GetString("FldLon"))
						points.Add(llPoint)
						If i=Cu.RowCount-1 Then
							Dim first As AdapterListAshkhas=LstLocation.Get(0)
							Dim cl As CameraPosition
							cl.Initialize(first.Lat,first.Lon,50)
							gmap.AnimateCamera(cl)
						
						End If
					Next
					Dim pl As Polyline = gmap.AddPolyline
					pl.points = points
					pl.Color = Colors.Blue
				End If
				
			Else
				For i=0 To LstLocation.Size-1
					Dim item As AdapterListAshkhas=LstLocation.Get(i)
					Dim llPoint As LatLng
					Dim color As Float
				
					If IsNumber(item.Lat) And IsNumber(item.Lon ) And item.Lat >0 And item.Lon >0 Then
					
			
						llPoint.Initialize(item.Lat,item.Lon)
						points.Add(llPoint)
						
			
							color=gmap.HUE_RED
							gmap.AddMarker2(item.Lat,item.Lon,item.SharhTafzili,color).Snippet=i
					
			
					
					End If
					If i=LstLocation.Size-1 Then
						Dim first As AdapterListAshkhas=LstLocation.Get(0)
						Dim cl As CameraPosition
						cl.Initialize(first.Lat,first.Lon,50)
						gmap.AnimateCamera(cl)
						
					End If
				Next
			End If
		
			n=0
			SelectData
			ProgressDialogHide
		Catch
			Log(LastException)
		End Try

	End If
End Sub
Sub MapFragment1_MarkerClick (SelectedMarker As Marker) As Boolean 'Return True to consume the click
	n=SelectedMarker.Snippet
	SelectData
	
	
	
End Sub

Sub SelectData
	If MCode.TourVisitSW Then
		Cu = MCode.Result($"SELECT tblTourVisitor.fldRadif,tblTourVisitor.fldCodeSuperVisor,tblTourVisitor.fldCodeVisitor,tblTourVisitor.fldCodeGroup,tblTourVisitor.fldCodeTafzili,TblAshkhas.fldSharheTafzili,tblTourVisitor.fldDate,tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit,tblTourVisitor.fldDateNextVisit,tblTourVisitor.fldDateTozie,tblTourVisitor.fldShomareSefaresh,tblTourVisitor.fldSharh,tblTourVisitor.fldVaziat,tblTourVisitor.fldShomareFactor,TblAshkhas.FldLat,TblAshkhas.FldLon,TblAshkhas.fldTell,TblAshkhas.fldAdress,TblAshkhas.fldMande,TblAshkhas.fldSaghfeEtebar,TblAshkhas.fldBlackList  FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND fldDateVisit = ${MCode.DatePersian} and fldType='Tour' ORDER BY tblTourVisitor.fldRadif ASC"$)
				
		Cu.Position=n
		
		lblCodeMoshtari.Text="کد مشتری: "&Cu.GetString("fldCodeTafzili")
		lblNameMoshtari.Text="نام مشتری: "&Cu.GetString("fldSharheTafzili")
		lblShomareTell.Text="شماره تماس: "&Cu.GetString("fldTell")
		lblShomareTell.Tag=Cu.GetString("fldTell")
		lblRadif.Text="اولویت: "& Cu.GetString("fldRadif")
		lblVaziatVisit.Text="وضعیت: "& GetVaziat(Cu.GetString("fldVaziat"))
		lblAddress.Text="آدرس: "&Cu.GetString("fldAdress")
		Dim cl As CameraPosition
		cl.Initialize(Cu.GetString("FldLat"),Cu.GetString("FldLon"),50)
		gmap.AnimateCamera(cl)	
		Log(Cu.GetString("fldSharheTafzili"))
	Else
		itemSelect=LstLocation.Get(n)
		lblCodeMoshtari.Text="کد مشتری: "&itemSelect.CodeTafzili
		lblNameMoshtari.Text="نام مشتری: "&itemSelect.SharhTafzili
		lblShomareTell.Text="شماره تماس: "&itemSelect.Tell
		lblShomareTell.Tag=itemSelect.Tell
		lblRadif.Text="اولویت: "&itemSelect.fldRadif
		lblVaziatVisit.Text="وضعیت: "& GetVaziat(itemSelect.fldVaziatTour)
		lblAddress.Text="آدرس: "&itemSelect.Address
		Dim cl As CameraPosition
		cl.Initialize(itemSelect.Lat,itemSelect.Lon,50)
		gmap.AnimateCamera(cl)
		Log(itemSelect.SharhTafzili)
	End If

	

	
End Sub

Sub GetVaziat(str As String) As String
	If str="1" Then
		Return "ویزیت نشده"
	Else if str="2" Then
		Return "ویزیت شده"
	Else if str="3" Then
		Return "سفارش گرفته"
	Else
		Return "ویزیت نشده"
	End If
End Sub

Sub GoToVisit(item As AdapterListAshkhas)
	'MCode.SaveUpdate("Delete From TblSabad")
	MCode.C_Tafzili=item.CodeTafzili
	MCode.N_Tafzili=item.SharhTafzili
	Dim mande As String=myCode.Is_Null_adad(item.Mande)	
	Dim SaghfeEtebar As String=myCode.Is_Null_adad(item.fldSaghfeEtebar)	
	MCode.MandeHesab=mande
	If SaghfeEtebar>0 Then
		If mande>0 Then
			MCode.MandeEtebar=SaghfeEtebar - mande
			Else
			MCode.MandeEtebar=SaghfeEtebar 
		End If
		
		MCode.ManedEtebarEnable=True
		Else
		MCode.ManedEtebarEnable=False
		MCode.MandeEtebar=0
	End If
	
	Log("مانده: "& mande)
	Log("سقف اعتبار: "&SaghfeEtebar)
	Log("مانده اعتبار: "&MCode.MandeEtebar)
	Log("وضعیت مانده اعتبار: "&MCode.ManedEtebarEnable)


			visit
		
	StartActivity(Act_KalaDefault)

End Sub

Sub GoToVisit2
	'MCode.SaveUpdate("Delete From TblSabad")

	MCode.C_Tafzili=Cu.GetString("fldCodeTafzili")
	MCode.N_Tafzili=Cu.GetString("fldSharheTafzili")
	Dim mande As String=myCode.Is_Null_adad(Cu.GetString("fldMande"))
	Dim SaghfeEtebar As String=myCode.Is_Null_adad(Cu.GetString("fldSaghfeEtebar"))
	MCode.MandeHesab=mande
	If SaghfeEtebar>0 Then
		If mande>0 Then
			MCode.MandeEtebar=SaghfeEtebar - mande
			Else
			MCode.MandeEtebar=SaghfeEtebar 
		End If
		
		MCode.ManedEtebarEnable=True
		Else
		MCode.ManedEtebarEnable=False
		MCode.MandeEtebar=0
	End If
	
	Log("مانده: "& mande)
	Log("سقف اعتبار: "&SaghfeEtebar)
	Log("مانده اعتبار: "&MCode.MandeEtebar)
	Log("وضعیت مانده اعتبار: "&MCode.ManedEtebarEnable)


	visit
		
	StartActivity(Act_KalaDefault)

End Sub

Sub visit
	Dim Date As String = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	If MCode.editFactor=False Then
		MCode.FaktorSelect=""
	End If
	MCode.Action="SabtFaktor"
	Dim Cu As Cursor = MCode.Result("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	If Cu.RowCount>0 Then
		MCode.SaveUpdate("Update TblLogVisitSefaresh Set FldVisit = '"& Date &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	Else
		MCode.SaveUpdate("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"& MCode.C_Tafzili &"','"& Date &"','','','','')")
	End If
	MCode.SaveUpdate("Update TblAshkhas Set FldLastVisit = '"& Date &"' Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
	MCode.SaveUpdate("Update TblVisitorTour Set FldLastVisit = '"& Date &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	SaveLastSeen
End Sub

Sub SaveLastSeen
	'ثبت آخرین بازدید مشتری=====================================
	DateTime.DateFormat="yyyy-MM-dd"
'	Dim DateMiladi As String = MCode.ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
	Dim DateShamsi As String = MCode.DatePersian
	Dim Time As String = DateTime.Time(DateTime.Now)
	Dim D As String = DateShamsi & "T" & Time
	LogColor("D: " & D,Colors.Red)
			
	Dim Cu1 As Cursor = MCode.Result("Select * From TblLastSeen Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	If Cu1.RowCount>0 Then
		MCode.SaveUpdate("Update TblLastSeen Set LastSeen = '"& D &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	Else
		MCode.SaveUpdate("Insert Into TblLastSeen (FldC_Ashkhas,LastSeen) Values ('"& MCode.C_Tafzili &"','"& D &"')")
	End If
	MCode.SaveUpdate("Update TblAshkhas Set lastSeen = '"& D &"' Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
	
	
	
	If MCode.TourVisitSW And MCode.TourVisit=1 Then
		MCode.SaveUpdate("Update tblTourVisitor Set fldVaziat='2',fldTimeVisit='"& Time &"',fldSend='False' Where fldCodeTafzili = '"& MCode.C_Tafzili &"' and fldDateVisit='"& MCode.DatePersian &"' and fldType='Tour'")
	Else
		Dim Count As Int = MCode.SingleResult($"Select Count(fldRadif) from tblTourVisitor where fldCodeTafzili='${MCode.C_Tafzili}' and fldDateVisit='${MCode.DatePersian}' and fldType='Free'"$)
		Dim MaxRadif As Int
		Dim Count As Int = MCode.SingleResult($"Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldType='Free'"$)
		Dim MaxRadif As Int
		If Count=0 Then
			MaxRadif=1
		Else
			MaxRadif= MCode.SingleResult($"Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldType='Free'"$)
			MaxRadif=MaxRadif+1
		End If
		
		Cu1 = MCode.Result($"SELECT * FROM TblAshkhas WHERE TblAshkhas.fldCodetafzili =${MCode.C_Tafzili}"$)
				
		Cu1.Position=0
		MCode.SaveUpdate("Insert into tblTourVisitor(fldRadif,fldCodeSuperVisor,fldCodeGroup,fldCodeVisitor,fldCodeTafzili,fldSharheTafzili,fldDate,fldDateVisit,fldTimeVisit,fldDateNextVisit,fldDateTozie,fldShomareSefaresh,fldTimeSefaresh,fldSharh,fldVaziat,fldShomareFactor,fldSend,fldType) Values("& MaxRadif &",0,'"& Cu.GetString("fldCodeGroup") &"','"& MCode.C_Visitor &"','"& MCode.C_Tafzili &"','"& MCode.N_Tafzili &"','"& MCode.DatePersian &"','"& MCode.DatePersian &"','"& Time &"','0','0','0','','0','2','0','False','Free')")
	End If
	'=======================================================
End Sub
Sub btn_Back_Click
	Activity.Finish
End Sub

Sub Activity_Resume
	LoadMap
'	CallSubDelayed(Act_SelectMantage,"GetListTours")
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Activity.Finish
	Else
		Return True
	End If
	Return True
End Sub


Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub


Private Sub lblGoToLocation_Click
	ShowMap(Cu.GetString("FldLat"), Cu.GetString("FldLon"))
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

Private Sub lblCall_Click
	Dim str As String=lblShomareTell.tag
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW, "tel:"&str)
	StartActivity(i)
End Sub

Private Sub btnVisit_Click
	If MCode.TourVisitSW Then
		If Cu.GetString("fldVaziat")="1" Or Cu.GetString("fldVaziat")="2" Then
			GoToVisit2
		End If
		
	Else
		GoToVisit(itemSelect)
	End If
End Sub

Private Sub btnNext_Click
	If n=LstLocation.Size-1 Then	
		SelectData
		Return
	End If
	n=n+1
	SelectData
End Sub

Private Sub btnForward_Click
	If n=0 Then
		
		SelectData
		Return		
	End If
	n=n-1
	SelectData
End Sub