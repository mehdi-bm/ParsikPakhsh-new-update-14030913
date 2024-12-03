B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=12.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim Gps As GPS
	Dim t1 As Timer
	Dim Item1 As AdapteRepHavale
End Sub

Sub Globals
	Private rp As RuntimePermissions
	Private LblSumFactor As Label
	Private LblCountFactor As Label
	Private LblDate As Label
	Dim HLV As Hitex_LayoutView
	Private pnl_HLV As Panel
	Private ListFaktor As List
	Private lblShomareHavale As Label
	Private MapFragment1 As MapFragment
	Private gmap As GoogleMap
	Private LblLat As Label
	Private LblLon As Label
	Private SwLocation As ACSwitch
	Private Fused As FusedLocationProviderClient
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Try
	Activity.LoadLayout("l_RizeHavale")
	Fused.Initialize("FusedLocation")
	Gps.Initialize("Gps")
	t1.Initialize("t1",1000)
	HLV.Initializer("HLV").ListView.Build
	pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Height)
	ListFaktor.Initialize
	'Gps.Initialize("Gps")
	HLV.Ripple.Color(0xFF909090)
'	HLV.CardView.CardElevation(8dip).Radius(8dip)
	HLV.Show
	
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
	
End Sub

Sub Create
	Try
	ProgressDialogShow("در حال بارگذاری اطلاعات . . .")
	lblShomareHavale.Text=Item1.fldShomareHavale
	LblDate.Text=MCode.PersianDateDash(Item1.fldDate)
	LblCountFactor.Text=Item1.fldCountFactor
	If Item1.fldMandeFactor>0 Then
		LblSumFactor.Text=MCode.qomaAshar(Item1.fldMandeFactor) &" "&MCode.VahedPool
	Else
		LblSumFactor.Text=0
	End If
	LblLat.Text=MCode.Lat
		LoadData
	LblLon.Text=MCode.Lon
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Create")
	End Try
	'CallSubDelayed(Service_Server,"ShowFactorForooshByHavale")
End Sub

Sub SaveGps
	Try
	If Gps.GPSEnabled=False Then
		ToastMessageShow("موقعیت مکانی خود را روشن کنید", True)
		t1.Enabled=False
		StartActivity(Gps.LocationSettingsIntent)
	Else
		'ProgressDialogShow2("لطفا تا دریافت موقعیت مکانی صبر کنید",False)
		t1.Enabled=True
		
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-SaveGps")
	End Try
End Sub

Sub GetLocation
	If Fused.IsLocationEnabledInSettings Then
		Fused.GetLocationAvailability

		Wait For FusedLocation_LocationAvailabilityRequestCompleted (Available As Boolean)
		Log("LocationAvailable=" & Available)
		If Available Then
			Fused.GetLastLocation
			Wait For FusedLocation_LocationRequestCompleted (Result As LocationResult)
			If Result.Status=LocationResult.STATUS_SUCCESSFUL Then
				If Result.Location.IsInitialized Then
					Dim LastLocation As LocationF = Result.Location
					Log("LastLocation Latitude = " & LastLocation.Latitude)
					Log("LastLocation Longitude = " & LastLocation.Longitude)
					'Do whatever you want with other LocatioF properties and methods
					MCode.Lat = LastLocation.Latitude
					MCode.Lon = LastLocation.Longitude
					Create
				Else
					Log("Unknown last location")
				End If
			End If
		End If
	Else
		MsgboxAsync("Location is turned off in devices's settings. Turn it on.","Warning")
		StartActivity(Fused.LocationSettingsIntent)
	End If
End Sub

Sub t1_tick
	
	t1.Enabled=False
'	If gmap.IsInitialized Then
	Try
'			Dim cl As CameraPosition
'			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
'			gmap.AnimateCamera(cl)
'			Dim Lat As String = gmap.MyLocation.Latitude
'			Dim Lon As String = gmap.MyLocation.Longitude
'			Gps.Stop
'			Log(Lat)
'			Log(Lon)
'			MCode.Lat=Lat
'			MCode.Lon=Lon
		'ProgressDialogHide
		GetLocation
			
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-t1_tick")
	End Try
	'End If
End Sub
Sub LoadData
	Try
	ListFaktor.Clear
	Dim cr As Cursor=MCode.Result("select fldShomareFactor,Sum(fldMablaghKhales) as fldMablaghKhales,fldDate,fldCodeTafzili,fldSharhTafzili,fldLat,fldLon,fldTell,fldAddress,fldVaziat from TblRizFactorHavale where fldShomareHavale="&lblShomareHavale.Text &" GROUP BY fldShomareFactor")
	If cr.RowCount>0 Then

		
		For i=0 To cr.RowCount-1
			cr.Position=i
			Dim Item As AdapteRizHavale
			Item.fldShomareFactor=cr.GetString("fldShomareFactor")
			Item.fldMablaghKhales=cr.GetString("fldMablaghKhales")
			Item.fldDate=cr.GetString("fldDate")
			Item.fldCodeTafzili=cr.GetString("fldCodeTafzili")
			Item.fldSharhTafzili=cr.GetString("fldSharhTafzili")
			Item.fldLat=cr.GetString("fldLat")
			Item.fldLon=cr.GetString("fldLon")			
			Item.fldTell=cr.GetString("fldTell")
			Item.fldAddress=cr.GetString("fldAddress")
			Item.fldVaziat=cr.GetString("fldVaziat")
			If SwLocation.Checked Then
				If Item.fldLat<>"" And Item.fldLon<>"" Then
					Item.Distance=MCode.CalculateDistance(MCode.Lat,MCode.Lon,Item.fldLat,Item.fldLon)
				Else
					Item.Distance=0
				End If
				Else
				Item.Distance=0
			End If
			
			
	
			ListFaktor.Add(Item)
		Next
		'LblSumFactor.Text=NumberFormat2(TFsum,0,0,0,True) & " ریال "
'		LblVaziat.Text=TFsum
		If SwLocation.Checked Then
				ListFaktor.SortType("Distance",True)
		End If
		HLV.notifyDataSetChanged
		ProgressDialogHide
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadData")
	End Try
End Sub

Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return ListFaktor.Size
End Sub

Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As Cls_RizHavale
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub

Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	
	Dim Item = ListFaktor.Get(Position) As AdapteRizHavale
	Dim rec As Cls_RizHavale=Parent.Tag
	rec.shomareHavale=lblShomareHavale.Text
	rec.Show(Item,Position)
	Parent.Height=rec.Height
End Sub

Sub HLV_ItemClick (ClickedItem As Panel, Position As Int)		'👆 ItemClick 👆'
	Dim rec As Cls_RizHavale=ClickedItem.Tag
	rec.lblShowHavale_Click
End Sub

Sub Activity_Resume
	If SwLocation.Checked Then
		SaveGps
		Else
		Create
	End If
		
	
	
	HLV.notifyDataSetChanged
End Sub

Sub BtnListProfile_Click
	
'	StartActivity(Act_Check)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub LblBack_Click
	Activity.Finish
End Sub

Private Sub MapFragment1_Ready
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

Private Sub SwLocation_CheckedChange(Checked As Boolean)
	If Checked Then
			SaveGps
		Else
			Create
	End If
		

	
	HLV.notifyDataSetChanged
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

