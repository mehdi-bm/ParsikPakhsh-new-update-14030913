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
	Private t1 As Timer
End Sub

Sub Globals
	Private Location1 As Location
	Private gmap As GoogleMap
	Private MapFragment1 As MapFragment
	Private xui As XUI
	Dim Lat,Lon As String=0
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Location1.Initialize
	Activity.LoadLayout("L_SaveLocation")
	If MapFragment1.IsGooglePlayServicesAvailable = False Then
		ToastMessageShow("Please install Google Play Services.", True)
		Dim result As Int
		result = Msgbox2("لطفا سرویس های گوگل را نصب و فعال نمایید", "Google Play Services", "", "","انصراف",LoadBitmap(File.DirAssets,"Google-Play-icon.png"))
		
		Activity.Finish
		Else
		t1.Initialize("t1",1000)
		t1.Enabled = True
		ProgressDialogShow2("چند لحظه صبر کنید درحال دریافت موقعیت",False)
	End If

'	ProgressDialogShow2("درحال یافتن موقعیت چند لحظه صبر کنید...",False)
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
		
	Else
		Log("No permission!")
	End If
End Sub

Sub t1_tick
	
	If gmap.IsInitialized Then
		Try
			Location1.Latitude  = gmap.MyLocation.Latitude
			Location1.Longitude = gmap.MyLocation.Longitude
'			lbl_Location.Text = Lat & "," & Lon
			Dim cl As CameraPosition
			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
			gmap.AnimateCamera(cl)
			t1.Enabled=False
			ProgressDialogHide
		Catch
			Log(LastException)
		End Try
	Else
		t1.Enabled=True
	End If
End Sub
Sub MapFragment1_LongClick (Point As LatLng)
	gmap.Clear()
	gmap.AddMarker(Point.Latitude, Point.Longitude, MCode.N_Tafzili)
	Lat=Point.Latitude
	Lon=Point.Longitude
	Log("Lat= "&Lat &" Lon= "&Lon)
	'pnlMap.Visible=False
End Sub
Sub BtnSave_Click
	Try
		If MCode.IsConnected=False And MCode.ConnectionStatus=1 Then
			ToastMessageShow("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید",False)
			Return
		End If
		If Lat<>0 And Lon <>0 Then
			Dim Cu As Cursor = MCode.Result("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
			If Cu.RowCount>0 Then
				MCode.SaveUpdate("Update TblLogVisitSefaresh Set FldLat = '"& Lat &"' , FldLon = '"& Lon &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
			Else
				MCode.SaveUpdate("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"& MCode.C_Tafzili &"','','','','"& Lat &"','"& Lon &"')")
			End If
			MCode.SaveUpdate("Update TblAshkhas Set FldLat = '"& Lat &"', FldLon = '"& Lon &"' Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
			CallSubDelayed3(Service_Server,"SaveLocationMoshtari",Lat,Lon)
			'Sleep(100)
			ProgressDialogHide
			ToastMessageShow("موقعیت با موفقیت ثبت گردید",True)
			Activity.Finish
		Else
			ToastMessageShow("لطفا نقطه مورد نظر را انتخاب کنید",False)
		End If
	Catch
		Log(LastException)
	End Try
End Sub


Sub btn_Back_Click
	Activity.Finish
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub