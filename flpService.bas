B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=12.5
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: True
	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private flp As FusedLocationProvider
	Private GPS As GPS
	Private rp As RuntimePermissions
	Dim T_Gps,T_StartStopGps As Timer
	Dim jobInternet As HttpJob
	Private Tracking As Boolean
	Dim PersianDate As PersianDate
	Dim GetTime,Lat,Lon As String
	Dim C_Visitor As String
End Sub

Sub Service_Create
	'Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_NEVER 'we are handling it ourselves
	GPS.Initialize("gps")
	T_Gps.Initialize("T_Gps",60000)
	T_StartStopGps.Initialize("T_StartStopGps",Interval)
	jobInternet.Initialize("jobInternet",Me)
	flp.Initialize("flp")
	flp.Connect
End Sub

Private Sub flp_ConnectionSuccess
	Log("Connected to location provider")
End Sub

Private Sub flp_ConnectionFailed(ConnectionResult1 As Int)
	Log("Failed to connect to location provider")
End Sub

Private Sub CheckLocationSettingStatus As ResumableSub
	Dim f As LocationSettingsRequestBuilder
	f.Initialize
	f.AddLocationRequest(CreateLocationRequest)
	flp.CheckLocationSettings(f.Build)
	Wait For flp_LocationSettingsChecked(LocationSettingsResult1 As LocationSettingsResult)
	Return LocationSettingsResult1
End Sub


Public Sub StartLocationUpdates
	flp.RequestLocationUpdates(CreateLocationRequest)
End Sub

Private Sub flp_LocationChanged (Location1 As Location)
	Log($"$1.2{Location1.Latitude} / $1.2{Location1.Longitude}"$)
	flp.Disconnect
End Sub

Private Sub CreateLocationRequest As LocationRequest
	Dim lr As LocationRequest
	lr.Initialize
	lr.SetInterval(0)
	Return lr
End Sub

Sub btnStart_Click
	'rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
	'Wait For B4XPage_PermissionResult (Permission As String, Result As Boolean)
	If flp.IsConnected = False Then
		SetState("Location provider not available")
	End If

	SettingsAreGood
	
End Sub

Sub SettingsAreGood
	SetState("Location enabled - waiting for updates")
	StartLocationUpdates
End Sub

Sub SetState (msg As String)
	Log("State: " & msg)
End Sub

Sub Interval As String
	Return MCode.IntervalGps * 60 * 1000
End Sub

Sub Service_Start (StartingIntent As Intent)
	Track
	'Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
End Sub


Public Sub Track
	If	MCode.ServiceGpsActive=1 Then
		If GPS.GPSEnabled Then
			T_StartStopGps_Tick
'				Dim Cu As Cursor = MCode.Result("Select FldC_Visitor From TblSetting")
'				Cu.Position=0
			C_Visitor = MCode.C_Visitor
	
			T_StartStopGps.Enabled=True
			T_Gps.Enabled=True
		Else
			ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
			'StartActivity(GPS.LocationSettingsIntent)
		End If
	Else
		If GPS.GPSEnabled Then
			T_StartStopGps_Tick
'				Dim Cu As Cursor = MCode.Result("Select FldC_Visitor From TblSetting")
'				Cu.Position=0
			C_Visitor = MCode.C_Visitor
	
			T_StartStopGps.Enabled=True
			T_Gps.Enabled=True
		Else
			
			'StartActivity(GPS.LocationSettingsIntent)
		End If
	End If
	
End Sub

Sub T_StartStopGps_Tick
	Try
		If GPS.GPSEnabled = True Then
			'GeoLoc.GetLocation
			If Tracking Then Return
'			If Starter.rp.Check(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION) = False Then
'				Log("No permission")
'				Return
'			End If
			StartLocationUpdates
			Tracking = True
		Else
			flp.Disconnect
			'GPS.Stop
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub Service_Destroy

End Sub
