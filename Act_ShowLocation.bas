B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
'#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Private rp As RuntimePermissions
	Dim Location As Location
	Dim Name As String
End Sub

Sub Globals
	Private gmap As GoogleMap
	Private MapFragment1 As MapFragment
	Private xui As XUI
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_ShowLocation")
	If MapFragment1.IsGooglePlayServicesAvailable = False Then
		ToastMessageShow("Please install Google Play Services.", True)
		Return
	End If

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub

Sub MapFragment1_Ready
	Sleep(100)
	gmap = MapFragment1.GetMap
	rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then
		gmap.MyLocationEnabled = True
		myLocation
	Else
		Log("No permission!")
	End If
End Sub

Private Sub myLocation
	If gmap.IsInitialized Then
		Try
'			Lat = gmap.MyLocation.Latitude
'			Lon = gmap.MyLocation.Longitude
'			lbl_Location.Text = Lat & "," & Lon
			If Location.IsInitialized Then
				gmap.AddMarker(Location.Latitude,Location.Longitude,Name)
			
				Dim cl As CameraPosition
				cl.Initialize(Location.Latitude,Location.Longitude,15)
				gmap.AnimateCamera(cl)
			End If
			ProgressDialogHide
		Catch
			Log(LastException)
		End Try

	End If
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub