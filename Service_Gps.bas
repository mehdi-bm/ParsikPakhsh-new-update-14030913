B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=7.3
@EndOfDesignText@

#Region  Service Attributes 
	#StartAtBoot: True
'	#StartCommandReturnValue: android.app.Service.START_STICKY
#End Region

Sub Process_Globals
	Dim GPS1 As GPS
	'Dim Sql1 As SQL
	Dim Sf As StringFunctions
	Dim Imei As PhoneId
	Dim T_Gps,T_StartStopGps As Timer
	Dim jobInternet As HttpJob
	Dim PersianDate As PersianDate
	Dim GetTime,Lat,Lon As String
	Dim C_Visitor As String
	Dim th As Thread
	'Public GeoLoc As GeoLocator
'	Public FLP As FusedLocationProvider
End Sub

Sub Service_Create
'	If Not(File.Exists(File.DirDefaultExternal,"Parsik")) Then
'		File.MakeDir(File.DirDefaultExternal,"Parsik")
'		File.Copy(File.DirAssets,"parsik_db.db",File.DirDefaultExternal &"/Parsik","parsik_db.db")
'		File.MakeDir(File.DirDefaultExternal &"/Parsik","AksKala")
'	Else if File.Exists(File.DirDefaultExternal, "Parsik") = True Then
'		If Not(File.Exists(File.DirDefaultExternal & "/Parsik", "parsik_db.db")) Then
'			File.Copy(File.DirAssets,"parsik_db.db",File.DirDefaultExternal &"/Parsik","parsik_db.db")
'		End If
'		If Not(File.Exists(File.DirDefaultExternal &"/Parsik", "AksKala")) Then
'			File.MakeDir(File.DirDefaultExternal &"/Parsik","AksKala")
'		End If
'	End If
'	If Not(Sql1.IsInitialized) Then Sql1.Initialize(File.DirDefaultExternal &"/Parsik","parsik_db.db",False)
	'MCode.Sql1.ExecQuerySingleResult("PRAGMA journal_mode = delete")
	'Log("Current mode: " & MCode.Sql1.ExecQuerySingleResult("PRAGMA journal_mode"))
	Try
		If	MCode.ServiceGpsActive=1 Then
			GPS1.Initialize("GPS1")
			If GPS1.GPSEnabled=True Then
				'GeoLoc.Initialize("GeoLocation")
				T_Gps.Initialize("T_Gps",60000)
				T_StartStopGps.Initialize("T_StartStopGps",Interval)
				jobInternet.Initialize("jobInternet",Me)
			Else
				ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
				StartActivity(GPS1.LocationSettingsIntent)
			End If
		End If
	Catch
		Log(LastException)
	End Try

End Sub

Sub Interval As String
'	Dim Cu As Cursor = MCode.Result("Select FldIntervalGps From TblSetting")
'	Cu.Position=0
	Return MCode.IntervalGps * 60 * 1000
End Sub

Sub Service_Start (StartingIntent As Intent)
	'ToastMessageShow("Service_Start",True)
	GPS1.Initialize("GPS1")
	Try
		If	MCode.ServiceGpsActive=1 Then
			If GPS1.GPSEnabled=True Then
				T_StartStopGps_Tick
'				Dim Cu As Cursor = MCode.Result("Select FldC_Visitor From TblSetting")
'				Cu.Position=0
				C_Visitor = MCode.C_Visitor
	
				T_StartStopGps.Enabled=True
				T_Gps.Enabled=True
			Else
				ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
				StartActivity(GPS1.LocationSettingsIntent)
			End If
		End If	
	Catch
		Log(LastException)
	End Try

'	th.Initialise("trd")
'	th.Start(Me,"trd",Null)
End Sub
Sub trd
	

	T_StartStopGps_Tick
	Dim Cu As Cursor = MCode.Result("Select FldC_Visitor From TblSetting")
	Cu.Position=0
	C_Visitor = Cu.GetString("FldC_Visitor")
	
	T_StartStopGps.Enabled=True
	T_Gps.Enabled=True
End Sub
Sub T_StartStopGps_Tick
	Try
		If GPS1.GPSEnabled = True Then
			'GeoLoc.GetLocation
			GPS1.Start(0,0)
		Else
			GPS1.Stop
		End If
	Catch
		Log(LastException)
	End Try
End Sub
'Sub GeoLocation_Location(success As Boolean, Lattitude As Double, Longitude As Double, info As String, isMockLocation As Boolean)
'	Log($"GeoLocation_Location(${success}, ${Lattitude}, ${Longitude}, ${info}, ${isMockLocation})"$)
'	Try
'		If success Then
'			Lat=Lattitude
'			Lon=Longitude
'			GeoLoc.geoAddress
'			Log(GeoLoc.Address)
'			Log(GeoLoc.City)
'			Log(GeoLoc.Country)
'			Log(GeoLoc.KnownName)
'			'Log(GeoLoc.PostalCode)
''		Log(GeoLoc.State)
'		End If
'	Catch
'		Log(LastException)
'	End Try
'End Sub

Sub T_Gps_Tick
	Try
		SaveLocationToDb
	
		Dim Cu As Cursor = MCode.Result("Select * From TblGpsVisitor")
		If Cu.RowCount > 0 Then
			SendGps(DtToJson(Cu))
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub SaveLocationToDb
	Dim Cu As Cursor = MCode.Result("Select FldNoeDate From TblSetting")
	Cu.Position=0
	If Cu.GetString("FldNoeDate") = "S" Then
		Dim Tarikh As String = DatePersian
	else if Cu.GetString("FldNoeDate") = "M" Then
		Dim Tarikh As String = DateMiladi
	End If
	
	Dim Tm() As String
	Dim Time As String = DateTime.Time(DateTime.Now)
	Tm = Regex.Split(":",Time)
	Time=MCode.ConvertNumbersPersian2English(Tm(0)) & MCode.ConvertNumbersPersian2English(Tm(1))
	'Tm = Regex.Split(j(i)("FldTime"), ":")
	'Time = ConvertNumbersPersian2English(Tm(0)) & ConvertNumbersPersian2English(Tm(1))
	Log(Lat)
	Log(Lon)
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

Sub GPS1_LocationChanged (Location1 As Location)

	Lat=Location1.Latitude
	Lon=Location1.Longitude

End Sub

Sub Service_Destroy
	StartServiceAt(Me, DateTime.Now + 3 * 1000, False)
End Sub
Sub DatePersian2 As String
	Dim T() As String
	T = Regex.Split("/",PersianDate.getDate(0,0,0,"/"))
	If T(1).Length=1 Then
		T(1)="0"&T(1)
	End If
	If T(2).Length=1 Then
		T(2)="0"&T(2)
	End If
	Return T(1)&T(2)
End Sub
Sub DatePersian As String
	Dim T() As String
	T = Regex.Split("/",PersianDate.getDate(0,0,0,"/"))
	If T(1).Length=1 Then
		T(1)="0"&T(1)
	End If
	If T(2).Length=1 Then
		T(2)="0"&T(2)
	End If
	Return T(0)&T(1)&T(2)
End Sub

Sub DateMiladi As String
	Dim T() As String
	T = Regex.Split("/",DateTime.Date(DateTime.Now))
	If T(0).Length=1 Then
		T(0)="0"&T(0)
	End If
	If T(1).Length=1 Then
		T(1)="0"&T(0)
	End If
	Return T(2)&T(1)&T(0)
End Sub
Sub DateMiladi2 As String
	Dim T() As String
	T = Regex.Split("/",DateTime.Date(DateTime.Now))
	If T(0).Length=1 Then
		T(0)="0"&T(0)
	End If
	If T(1).Length=1 Then
		T(1)="0"&T(0)
	End If
	Return T(2)&T(1)
End Sub

Sub DtToJson(Cu As Cursor) As String
	Dim Olgoo As String
	Dim RowOlgoo As String
	Dim Str As String
	For i=0 To Cu.ColumnCount-1
		Olgoo=Olgoo & Chr(34) & Cu.GetColumnName(i) & Chr(34) & ":" & Chr(34) & Cu.GetColumnName(i) & i & Chr(34) & ","
	Next
	Olgoo=Sf.Left(Olgoo,Olgoo.Length-1)
	Olgoo = "{" & Olgoo & "}" & ","
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		RowOlgoo=Olgoo
		For j=0 To Cu.ColumnCount-1
			If Cu.GetString2(j)<> Null Then
				RowOlgoo = RowOlgoo.Replace(Cu.GetColumnName(j) & j,Cu.GetString2(j))
			End If
	
		Next
		Str=Str & RowOlgoo
	Next
	Str=Sf.Left(Str,Str.Length-1)
	Str="[" & Str & "]"
	File.WriteString(File.DirDefaultExternal, "1.txt", Str)
	Return Str
End Sub





'#Region  Service Attributes 
'	#StartAtBoot: True
'	#StartCommandReturnValue: android.app.Service.START_STICKY
'#End Region
'
'Sub Process_Globals
'	Dim GPS1 As GPS
'	Dim Sql1 As SQL
'	Dim Sf As StringFunctions
'	Dim Imei As PhoneId
'	Dim T_Gps,T_StartStopGps As Timer
'	Dim jobInternet As HttpJob
'	Dim PersianDate As PersianDate
'	Dim GetTime,Lat,Lon As String
'	Dim C_Visitor As String
'	Dim th As Thread
'	Dim background As Int=2
'	'Public GeoLoc As GeoLocator
'	Public FLP As FusedLocationProvider
'End Sub
'
'Sub Service_Create
'	If Not(File.Exists(File.DirDefaultExternal,"Parsik")) Then
'		File.MakeDir(File.DirDefaultExternal,"Parsik")
'		File.Copy(File.DirAssets,"parsik_db.db",File.DirDefaultExternal &"/Parsik","parsik_db.db")
'		File.MakeDir(File.DirDefaultExternal &"/Parsik","AksKala")
'	Else if File.Exists(File.DirDefaultExternal, "Parsik") = True Then
'		If Not(File.Exists(File.DirDefaultExternal & "/Parsik", "parsik_db.db")) Then
'			File.Copy(File.DirAssets,"parsik_db.db",File.DirDefaultExternal &"/Parsik","parsik_db.db")
'		End If
'		If Not(File.Exists(File.DirDefaultExternal &"/Parsik", "AksKala")) Then
'			File.MakeDir(File.DirDefaultExternal &"/Parsik","AksKala")
'		End If
'	End If
'	If Not(Sql1.IsInitialized) Then Sql1.Initialize(File.DirDefaultExternal &"/Parsik","parsik_db.db",False)

'	Try
'		If	background=2 Then
'			background=1
'		Else If background=1 Then
'			background=2
'		End If
'		GPS1.Initialize("GPS1")
'		If GPS1.GPSEnabled=True Then
'			'GeoLoc.Initialize("GeoLocation")
'			FLP.Initialize("flp")
'			FLP.Connect
'			Dim Interval1 As Int=Interval
'			If Interval1=0 Then
'				Interval1=60000
'			End If
'			T_Gps.Initialize("T_Gps",Interval1)
'			'T_StartStopGps.Initialize("T_StartStopGps",3000)
'			jobInternet.Initialize("jobInternet",Me)
'		Else
'			GPS1.Stop
'			If MCode.Gps=1 Then
'			
'				ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
'				StartActivity(GPS1.LocationSettingsIntent)
'			End If
'		
'		End If
'	
''		Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_NEVER
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,"Service_Gps-Service_Create")
'	End Try
'
'End Sub
'Public Sub StartFLP
'	Do While FLP.IsConnected = False
'		Sleep(1000)
'	Loop
'	'T_StartStopGps.Enabled=True
'		FLP.RequestLocationUpdates(CreateLocationRequest)
'		
'	
'End Sub
'
'
'Private Sub flp_LocationChanged (Location1 As Location)
'	Lat=Location1.Latitude
'	Lon=Location1.Longitude
'	Try
'		SaveLocationToDb
'	
'		Dim Cu As Cursor = Sql1.ExecQuery("Select FldVisitor,FldTarikh,FldTime,FldLat,FldLon From TblGpsVisitor")
'		If Cu.RowCount > 0 Then
'			Log(Cu.RowCount)
'			SendGps(MCode.DtToJson(Cu))
'		End If
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,"Service_Gps-T_Gps_Tick")
'	End Try
'End Sub
'
'Private Sub CreateLocationRequest As LocationRequest
'	Dim lr As LocationRequest
'	lr.Initialize
'	lr.SetInterval(Interval)
'	lr.SetFastestInterval(lr.GetInterval / 2)
'	lr.SetPriority(lr.Priority.PRIORITY_HIGH_ACCURACY)
'	Return lr
'End Sub
'
'Sub Interval As String
'	Dim Cu As Cursor = Sql1.ExecQuery("Select FldIntervalGps From TblSetting")
'	Cu.Position=0
'	Return Cu.GetString("FldIntervalGps") * 60 * 1000
'End Sub
'
'Sub Service_Start (StartingIntent As Intent)
'	
'	Try
'		'StartServiceAt(Me, DateTime.Now + Interval, False)
'		
''		If Service.AutomaticForegroundMode=2 Then
''		
''			Log("gps "& Service.AutomaticForegroundMode)
''			Else
''			Log("gps2 "& Service.AutomaticForegroundMode)
''		End If
''		Dim Tm() As String
''		Dim Time As String = DateTime.Time(DateTime.Now)
''		Tm = Regex.Split(":",Time)
''		Time=MCode.ConvertNumbersPersian2English(Tm(0)) & MCode.ConvertNumbersPersian2English(Tm(1))
''		Log("GPS OK")
''		Log(Time)
'		
'	 'Call this when the background task completes (if there is one)
'	'	StartServiceAt(Me, DateTime.Now + Interval, False)
'	
'	'	T_StartStopGps.Enabled=True
'		If GPS1.GPSEnabled=True Then
''		
''			'GPS1.Start(0,0)
''		StartFLP
''				'GeoLoc.GetLocation
'			T_Gps.Enabled=True
'			'T_StartStopGps.Enabled=True
'		Else
'			GPS1.Stop
'			If MCode.Gps=1 Then
'	
'			ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
'			StartActivity(GPS1.LocationSettingsIntent)
'		End If
'		
'		End If
'		
'
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,"Service_Gps-Service_Start")
'	End Try
'
''	th.Initialise("trd")
''	th.Start(Me,"trd",Null)
'End Sub
'Sub trd
'	
'
'	'T_StartStopGps_Tick
'	Dim Cu As Cursor = Sql1.ExecQuery("Select FldC_Visitor From TblSetting")
'	Cu.Position=0
'	C_Visitor = Cu.GetString("FldC_Visitor")
'	
'	T_StartStopGps.Enabled=True
'	T_Gps.Enabled=True
'End Sub
'Sub T_Gps_Tick
'	Try
'			StartFLP
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,"Service_Gps-T_StartStopGps_Tick")
'	End Try
'End Sub
''Sub GeoLocation_Location(success As Boolean, Lattitude As Double, Longitude As Double, info As String, isMockLocation As Boolean)
''	Log($"GeoLocation_Location(${success}, ${Lattitude}, ${Longitude}, ${info}, ${isMockLocation})"$)
''	Try
''		If success Then
''			Log(isMockLocation)
''			Lat=Lattitude
''			Lon=Longitude
''			Log(Lattitude)
''			Log(Longitude)
''			'GeoLoc.geoAddress
''			'Log(GeoLoc.Address)
''			'Log(GeoLoc.City)
''			'Log(GeoLoc.Country)
''			'Log(GeoLoc.KnownName)
''			'Log(GeoLoc.PostalCode)
'''		Log(GeoLoc.State)
''		End If
''	Catch
''		Log(LastException)
''	End Try
''End Sub
'
''Sub T_Gps_Tick 
''	Try
''		SaveLocationToDb
''	
''		Dim Cu As Cursor = Sql1.ExecQuery("Select * From TblGpsVisitor")
''		If Cu.RowCount > 0 Then
''			SendGps(MCode.DtToJson(Cu))
''		End If
''	Catch
''		Log(LastException)
''		myCode.SendError(LastException,"Service_Gps-T_Gps_Tick")
''	End Try
''End Sub
'
'Sub SaveLocationToDb
'	Try
'	Dim Cu As Cursor = MCode.Result("Select FldNoeDate From TblSetting")
'	Cu.Position=0
'	If Cu.GetString("FldNoeDate") = "S" Then
'		Dim Tarikh As String =MCode.DatePersian
'	else if Cu.GetString("FldNoeDate") = "M" Then
'		Dim Tarikh As String =MCode.DateMiladi
'	End If
'	
'	Dim Tm() As String
'	Dim Time As String = DateTime.Time(DateTime.Now)
'	Tm = Regex.Split(":",Time)
'		Log(Tm(0))
'		Log(Tm(1))
'	Time=MCode.ConvertNumbersPersian2English(Tm(0)) & MCode.ConvertNumbersPersian2English(Tm(1))
'	'Tm = Regex.Split(j(i)("FldTime"), ":")
'	'Time = ConvertNumbersPersian2English(Tm(0)) & ConvertNumbersPersian2English(Tm(1))
'	Log(Lat)
'	Log(Lon)
'	Log(Time)
'	Log(Tarikh)
'	If Lat <> "" And Lon <> "" And IsNumber(MCode.C_Visitor)=True And IsNumber(Tarikh)=True And IsNumber(Time)=True  Then
'		MCode.SaveUpdate("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"& MCode.C_Visitor &"','"& Tarikh &"','"& Time &"','"& Lat &"','"& Lon &"')")
'		GetTime=DateTime.Time(DateTime.Now)
'	End If
'	Lat=""
'	Lon=""
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,"Service_Gps-SaveLocationToDb")
'	End Try
''	ToastMessageShow("Save end",True)
'End Sub
'
'Sub SendGps(Str As String)
''	ToastMessageShow("Sending",True)
'Try
'	Dim Cu As Cursor = Sql1.ExecQuery("Select FldUrl From TblSetting")
'	Cu.Position=0
'	Log(Str)
'	Dim Url As String = Cu.GetString("FldUrl")
'	jobInternet.JobName ="SendGps"
'		jobInternet.PostString("http://" & Url & "/marashiservice.asmx/SaveGps","JsonDt=" & Str & "&Imei=" & MCode.DeviceId)
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,"Service_Gps-SaveLocationToDb")
'	End Try
'End Sub
'
'Sub JobDone (Job As HttpJob)
''	ToastMessageShow("JobDone",True)
'	Try
'	If Job.Success Then
'		Dim Str As String = Job.GetString
'		Select Case Job.JobName
'			Case "SendGps"
'				If Str = "No Result" Then
''					ToastMessageShow("خطا در ارسال",True)
'				Else
'					Sql1.ExecNonQuery("Delete From TblGpsVisitor")
'					Log("GPS OK")
''					ToastMessageShow("Send End",True)
'				End If
'		End Select
'	Else
''		ToastMessageShow("خطا در اتصال",True)
'	End If
'		jobInternet.Release
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,"Service_Gps-JobDone")
'	End Try
'End Sub
'
'Sub GPS1_LocationChanged (Location1 As Location)
'
'	Lat=Location1.Latitude
'	Lon=Location1.Longitude
'
'End Sub
'
'Sub Service_Destroy
''	Service.AutomaticForegroundMode=Service.AUTOMATIC_FOREGROUND_ALWAYS
'	StartServiceAt(Me, DateTime.Now + Interval, False)
'	End Sub
'
'
'
