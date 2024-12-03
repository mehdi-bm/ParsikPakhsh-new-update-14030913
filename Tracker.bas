B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=8.5
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: True
#End Region

Sub Process_Globals
	Private nid As Int = 1
	Private GPS As GPS
	Private Tracking As Boolean
	Private LastUpdateTime As Long
	Private lock As PhoneWakeState
	Dim T_Gps,T_StartStopGps As Timer
	Dim jobInternet As HttpJob
	Dim PersianDate As PersianDate
	Dim GetTime,Lat,Lon As String
	Dim C_Visitor As String
End Sub

Sub Service_Create
'	Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_ALWAYS 'we are handling it ourselves
	GPS.Initialize("gps")
	T_Gps.Initialize("T_Gps",60000)
	T_StartStopGps.Initialize("T_StartStopGps",Interval)
	jobInternet.Initialize("jobInternet",Me)
	lock.PartialLock
End Sub

Sub Interval As String
	Return MCode.IntervalGps * 60 * 1000
End Sub

Sub Service_Start (StartingIntent As Intent)
'	Service.StartForeground(nid, CreateNotification("..."))
If MCode.Gps=1 Then
		Track
End If
	
End Sub

Public Sub Track
	If	MCode.ServiceGpsActive=1 Then
		If GPS.GPSEnabled=True Then
			T_StartStopGps_Tick
'				Dim Cu As Cursor = MCode.Result("Select FldC_Visitor From TblSetting")
'				Cu.Position=0
			C_Visitor = MCode.C_Visitor
	
			T_StartStopGps.Enabled=True
			T_Gps.Enabled=True
		Else
			ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
			StartActivity(GPS.LocationSettingsIntent)
		End If
	Else
		If GPS.GPSEnabled=True Then
			T_StartStopGps_Tick
'				Dim Cu As Cursor = MCode.Result("Select FldC_Visitor From TblSetting")
'				Cu.Position=0
			C_Visitor = MCode.C_Visitor
	
			T_StartStopGps.Enabled=True
			T_Gps.Enabled=True
		
		End If
	End If
	
End Sub

Sub T_StartStopGps_Tick
	Try
		If GPS.GPSEnabled = True Then
			'GeoLoc.GetLocation
			If Tracking Then Return
			If Starter.rp.Check(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION) = False Then
				Log("No permission")
				Return
			End If
			GPS.Start(0, 0)
			Tracking = True
		Else
			GPS.Stop
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub GPS_LocationChanged (Location1 As Location)
	'If DateTime.Now > LastUpdateTime + 10 * DateTime.TicksPerSecond Then
		Lat=$"$2.5{Location1.Latitude}"$
		Lon=$"$2.5{Location1.Longitude}"$
'		Dim n As Notification = CreateNotification($"${Lat} / ${Lon}"$)
'		n.Notify(nid)
		'LastUpdateTime = DateTime.Now
		
		Tracking=False
	'End If
End Sub

Sub T_Gps_Tick
	Try
		SaveLocationToDb
	
		Dim Cu As Cursor = MCode.Result("Select * From TblGpsVisitor")
		If Cu.RowCount > 0 Then
			SendGps(MCode.DtToJson(Cu))
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub SaveLocationToDb
	Dim Cu As Cursor = MCode.Result("Select FldNoeDate From TblSetting")
	Cu.Position=0
	If Cu.GetString("FldNoeDate") = "S" Then
		Dim Tarikh As String =MCode.DatePersian
	else if Cu.GetString("FldNoeDate") = "M" Then
		Dim Tarikh As String =MCode.DateMiladi
	End If
	
	Dim Tm() As String
	Dim Time As String = DateTime.Time(DateTime.Now)
	Tm = Regex.Split(":",Time)
	Time=MCode.ConvertNumbersPersian2English(Tm(0)) & MCode.ConvertNumbersPersian2English(Tm(1))
	'Tm = Regex.Split(j(i)("FldTime"), ":")
	'Time = ConvertNumbersPersian2English(Tm(0)) & ConvertNumbersPersian2English(Tm(1))
	Log(Lat)
	If Lat <> "" And Lon <> "" And IsNumber(C_Visitor)=True And IsNumber(Tarikh)=True And IsNumber(Time)=True  Then
		MCode.SaveUpdate("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"& C_Visitor &"','"& Tarikh &"','"& Time &"','"& Lat &"','"& Lon &"')")
		GetTime=DateTime.Time(DateTime.Now)
	End If
	Lat=""
	Lon=""
'	ToastMessageShow("Save end",True)
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
		End Select
	Else
'		ToastMessageShow("خطا در اتصال",True)
	End If
	jobInternet.Release
End Sub

'Sub CreateNotification (Body As String) As Notification
'	Dim notification As Notification
'	notification.Initialize2(notification.IMPORTANCE_LOW)
'	notification.Icon = "icon"
'	notification.Sound=False
'	notification.Vibrate=False
'	notification.SetInfo("Tracking location", Body, Main)
'	Return notification
'End Sub

Sub Service_Destroy
	If Tracking Then
		GPS.Stop
	End If
	Tracking = False
	lock.ReleasePartialLock
	Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_ALWAYS
End Sub
