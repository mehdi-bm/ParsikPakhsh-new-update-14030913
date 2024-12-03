B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=13
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: True
	#StartCommandReturnValue: android.app.Service.START_STICKY
#End Region

Sub Process_Globals
	Private Fused As FusedLocationProviderClient
	Dim jobInternet As HttpJob
	Dim tgps ,T_StartStopGps As Timer
	Private Tracking As Boolean
	Dim GetTime As String
	Dim Lat,Lon As String
	'Private lock As PhoneWakeState
	Private nid As Int = 1
	Dim inc As Long=0
	Dim Tracking As Boolean
End Sub

Sub Service_Create
	Try
		Fused.Initialize("FusedLocation")
		'lock.PartialLock
		jobInternet.Initialize("jobInternet",Me)
		jobInternet.GetRequest.Timeout=50000
		tgps.Initialize("tgps",60000)
		Tracking=False
		Log("Gps Create")
	Catch
		Log(LastException)
	End Try
End Sub

Sub Service_Start (StartingIntent As Intent)
	Service.StartForeground(nid, CreateNotification("..."))
	
	'lock.KeepAlive(True)
	Log("Gps Start")
	Try
		Fused.Initialize("FusedLocation")
		If	MCode.ServiceGpsActive=1 Then
			Log("Gps ServiceGpsActive "& MCode.ServiceGpsActive)
			If Fused.IsLocationEnabledInSettings  Then
				Log("Gps IsLocationEnabledInSettings")
				Log("Gps Tracking: "&Tracking)
				If Tracking=False Then
					tgps.Enabled=True
				End If
			Else
				ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
				StartActivity(Fused.LocationSettingsIntent)
			End If
		End If
	Catch
		Log(LastException)
	End Try

	Service.AutomaticForegroundMode= Service.AUTOMATIC_FOREGROUND_ALWAYS 'Call this when the background task completes (if there is one)

End Sub


Sub GetNewGps()
	
End Sub


Sub tgps_Tick
	Tracking=True
	tgps.Enabled=False
	DefineFused
	Log("tgps_Tick")
End Sub

Private Sub DefineFused
	If Fused.IsLocationEnabledInSettings Then
		Fused.GetLocationAvailability
		inc=Interval
'		Wait For FusedLocation_LocationAvailabilityRequestCompleted (Available As Boolean)
'		Log("LocationAvailable=" & Available)
'		If Available Then
'			Fused.GetLastLocation
'			Wait For FusedLocation_LocationRequestCompleted (Result As LocationResult)
'			If Result.Status=LocationResult.STATUS_SUCCESSFUL Then
'				If Result.Location.IsInitialized Then
'					Dim LastLocation As LocationF = Result.Location
'					Log("LastLocation Latitude = " & LastLocation.Latitude)
'					Log("LastLocation Longitude = " & LastLocation.Longitude)
'					'Do whatever you want with other LocatioF properties and methods
'				Else
'					Log("Unknown last location")
'				End If
'			End If
'		End If
	
		'Initiate FusedLocation's LocationRequest which will allow events to be fired and it will continue to work in background
		Dim LocationRequest1 As LocationRequest
		LocationRequest1.Initialize(inc) 'Refresh interval is 1000 miliseconds
		LocationRequest1.SetMinUpdateIntervalMillis(inc) 'Minimum refresh interval is 100 miliseconds
		LocationRequest1.SetPriority(Priority.PRIORITY_HIGH_ACCURACY) 'Request high accuracy location
		LocationRequest1.SetMinUpdateDistanceMeters(0) 'Minimum distance in meters to fire location change event (0 is default)
		LocationRequest1.SetGranularity(Granularity.GRANULARITY_FINE)
		Fused.RequestLocationUpdates(LocationRequest1) 'Set location request to FusedLocationProviderClient and start FusedLocation
	Else
		MsgboxAsync("Location is turned off in devices's settings. Turn it on.","Warning")
		StartActivity(Fused.LocationSettingsIntent)
	End If
End Sub

Sub T_StartStopGps_Tick
'	Try
'		If Tracking Then Return
'		
'		If	MCode.ServiceGpsActive=1 Then
'			If Fused.IsLocationEnabledInSettings  Then
'				Tracking = True
'				DefineFused
'			Else
'				ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
'				StartActivity(Fused.LocationSettingsIntent)
'			End If
'		End If
'	Catch
'		Log(LastException)
'	End Try
End Sub

Sub Interval As String
'	Dim Cu As Cursor = MCode.Result("Select FldIntervalGps From TblSetting")
'	Cu.Position=0
	Return MCode.IntervalGps * 60 * 1000
End Sub


Sub Service_Destroy
	If Tracking Then
		Fused.RemoveLocationUpdates
	End If
	Tracking = False
	StartServiceAt(Me,DateTime.Now+1000,True)
	'lock.ReleasePartialLock
	Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_ALWAYS
End Sub

Private Sub FusedLocation_LocationAvailabilityChanged (Available As Boolean)
	'This event will be fired when location availability is changed
	'For example on signal lost or when location is turned off.
	Log("LocationAvailabile = " & Available)
End Sub

Private Sub FusedLocation_LocationChanged (mLocation As LocationF)
	'This event will be fired anytime your actual location is changed and if it meets the criteria of the defined LocationRequest
		
	Lat=mLocation.Latitude
	Lon=mLocation.Longitude
	
	Log("Lat=" & Lat & CRLF & "Lon=" & Lon)
	Dim n As Notification = CreateNotification($"${Lat} / ${Lon}"$)
	n.Notify(nid)

	Tracking=False
'	tgps.Enabled=False
'	Fused.RemoveLocationUpdates
	SaveLocationToDb
	
	
End Sub

Private Sub FusedLocation_LocationEnabledInSettingsChanged (Enabled As Boolean)
	'This event will be fired if user turn off or turn on Location in device's settings
	Log("LocationEnabled = " & Enabled)
	If Enabled=False Then
		StartActivity(Fused.LocationSettingsIntent)
	End If
End Sub
Sub SaveLocationToDb
	Dim Cu As Cursor = MCode.Result("Select FldNoeDate From TblSetting")
	Cu.Position=0
	If Cu.GetString("FldNoeDate") = "S" Then
		Dim Tarikh As String = MCode.DatePersian
	else if Cu.GetString("FldNoeDate") = "M" Then
		Dim Tarikh As String = MCode.DateMiladi
	End If
	
	Dim Tm() As String
	Dim Time As String = DateTime.Time(DateTime.Now)
	Tm = Regex.Split(":",Time)
	Time=MCode.ConvertNumbersPersian2English(Tm(0)) & MCode.ConvertNumbersPersian2English(Tm(1))
	'Tm = Regex.Split(j(i)("FldTime"), ":")
	'Time = ConvertNumbersPersian2English(Tm(0)) & ConvertNumbersPersian2English(Tm(1))
	Log(Lat)
	Log(Lon)
	If Lat <> "" And Lon <> "" And IsNumber(MCode.C_Visitor)=True And IsNumber(Tarikh)=True And IsNumber(Time)=True  Then
		MCode.SaveUpdate("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"& MCode.C_Visitor &"','"& Tarikh &"','"& Time &"','"& Lat &"','"& Lon &"')")
		GetTime=DateTime.Time(DateTime.Now)
		MCode.fusLat=Lat
		MCode.fusLon=Lon
		MCode.fusGetTime=GetTime
	End If
	Lat=""
	Lon=""
	
	Dim Cu As Cursor = MCode.Result("Select * From TblGpsVisitor")
	If Cu.RowCount > 0 Then
		SendGps(MCode.DtToJson(Cu))
	End If
'	ToastMessageShow("Save end",True)
End Sub

Sub CreateNotification (Body As String) As Notification
	Dim notification As Notification
	notification.Initialize2(notification.IMPORTANCE_LOW)
	notification.Icon = "icon"
	notification.Sound=False
	notification.Vibrate=False
	notification.SetInfo("Tracking location", Body, Main)
	Return notification
End Sub

Sub SendGps(Str As String)
'	ToastMessageShow("Sending",True)
'	Dim Cu As Cursor = MCode.Result("Select FldUrl From TblSetting")
'	Cu.Position=0
'	Dim Url As String = Cu.GetString("FldUrl")
	jobInternet.JobName ="SendGps"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveGps","JsonDt=" & Str & "&Imei=" & MCode.DeviceId)
End Sub

Sub JobDone (Job As HttpJob)
	Job.GetRequest.Timeout=50000
'	ToastMessageShow("JobDone",True)
	If Job.Success Then
		Dim Str As String = Job.GetString
		Select Case Job.JobName
			Case "SendGps"
				If Str = "No Result" Then
'					ToastMessageShow("خطا در ارسال",True)
				Else
					MCode.SaveUpdate("Delete From TblGpsVisitor")
					Log("GPS OK")
'					ToastMessageShow("Send End",True)
				End If
				tgps.Enabled=True
				Tracking=False
		End Select
	Else
'		ToastMessageShow("خطا در اتصال",True)
	End If
	jobInternet.Release
End Sub