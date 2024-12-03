B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private base As Object
	Private gmap As GoogleMap
	Private MapFragment1 As MapFragment
	Private gps	As GPS
	Dim t_gps As Timer
	Private rp As RuntimePermissions
	Dim Lat As String
	Dim Lon As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(mdl As Object)
	base = mdl
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_GPS")
	
End Sub

Private Sub MapFragment1_Ready
	Sleep(100)
	Try
	
			If gps.GPSEnabled=True Then
				gmap = MapFragment1.GetMap
				rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
				Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
				If Result Then
					gmap.MyLocationEnabled = True
					't_gps.Initialize("t_gps",IIf(MCode.Interval>0,MCode.Interval,1500))
					t_gps.Enabled=True
				Else
					Log("No permission!")
				End If
			Else
				gmap.MyLocationEnabled=False
				ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
				StartActivity(gps.LocationSettingsIntent)
			End If
		
	Catch
		Log(LastException)
		'myCode.SendError(LastException,Activity.Title&"-MapFragment1_Ready")
	End Try
End Sub

Sub t_gps_Tick
	If gmap.IsInitialized Then
		Try
			Dim cl As CameraPosition
			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
			gmap.AnimateCamera(cl)
			Lat = gmap.MyLocation.Latitude
			Lon = gmap.MyLocation.Longitude

			If myCode.IsNullOrWhiteSpace(Lat)=False And myCode.IsNullOrWhiteSpace(Lon)=False Then
				Log(Lat)
				Log(Lon)
				MCode.Lat=Lat
				MCode.Lon=Lon
				MCode.SaveLocationToDb
			End If
		Catch
			Log(LastException)
			'myCode.SendError(LastException,Activity.Title&"-T_EnterExit_tick")
		End Try
	End If
End Sub