B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=12.8
@EndOfDesignText@
#Region  Service Attributes 
	
	#StartAtBoot: false
	'#StartCommandReturnValue: android.app.Service.START_STICKY
#End Region

Sub Process_Globals
	Public GeoLoc As GeoLocator
	Dim GPS1 As GPS
	Public PermissionOK As Boolean
	Dim T_Gps,T_StartStopGps As Timer
	Dim GetTime,Lat,Lon As String
	Dim jobInternet As HttpJob
	Dim C_Visitor As String
	Dim PersianDate As PersianDate
	Dim Sf As StringFunctions
	Private lock As PhoneWakeState
End Sub

Sub GeoLocation_Location(success As Boolean, Lattitude As Double, Longitude As Double, info As String, isMockLocation As Boolean)
	Log($"GeoLocation_Location(${success}, ${Lattitude}, ${Longitude}, ${info}, ${isMockLocation})"$)
	If success Then
		'GeoLoc.geoAddress
		Log(Lattitude)
		Log(Longitude)
		Lat=Lattitude
		Lon=Longitude
'		Log(GeoLoc.City)
'		Log(GeoLoc.Country)
'		Log(GeoLoc.KnownName)
'		Log(GeoLoc.PostalCode)
'		Log(GeoLoc.State)
	End If
End Sub

Sub Service_Create
	
	Try
		
	
		GeoLoc.Initialize("GeoLocation")
		GPS1.Initialize("GPS1")
		jobInternet.Initialize("jobInternet",Me)
		T_StartStopGps.Initialize("T_StartStopGps",6000)
		If	MCode.ServiceGpsActive=1 Then
			MCode.UpdateSetting
			
			lock.PartialLock
			If GPS1.GPSEnabled=True Then
				T_Gps.Initialize("T_Gps",Interval)
				Dim intervalGps As Int
				 If Interval>0 Then
					intervalGps= Interval
					Else
					intervalGps=6000
				End If
				
			Else
				If MCode.Gps=1 Then
					ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
					StartActivity(GPS1.LocationSettingsIntent)
				End If
			
			End If
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub Service_Start (StartingIntent As Intent)
	If PermissionOK  Then
'		MCode.UpdateSetting
		StartServiceAt(Me,DateTime.Now + 3000,False)
		T_StartStopGps.Enabled=True
		T_Gps.Enabled=True
	
	End If
	Service.AutomaticForegroundMode=Service.AUTOMATIC_FOREGROUND_ALWAYS
'	Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
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


Sub T_StartStopGps_Tick
	Try
		If GPS1.GPSEnabled = True Then
			GeoLoc.GetLocation
		Else
			If MCode.Gps=1 Then
				ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
				StartActivity(GPS1.LocationSettingsIntent)
			End If
			
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub Interval As String
	Return MCode.IntervalGps * 60 * 1000
End Sub

Sub T_Gps_Tick
	Try
		SaveLocationToDb
	
		Dim Cu As Cursor = MCode.Result("Select FldVisitor,FldTarikh,FldTime,FldLat,FldLon From TblGpsVisitor")
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
	If Lat <> "" And Lon <> "" And IsNumber(MCode.C_Visitor)=True And IsNumber(Tarikh)=True And IsNumber(Time)=True  Then
		MCode.SaveUpdate("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"& MCode.C_Visitor &"','"& Tarikh &"','"& Time &"','"& Lat &"','"& Lon &"')")
		GetTime=DateTime.Time(DateTime.Now)
	End If
	Lat=""
	Lon=""
'	ToastMessageShow("Save end",True)
End Sub

Sub SendGps(Str As String)
	jobInternet.JobName ="SendGps"
	jobInternet.PostString("https://" & MCode.Url & "/marashiservice.asmx/SaveGps","JsonDt=" & Str & "&Imei=" & MCode.DeviceId)
End Sub



Sub JobDone (Job As HttpJob)
	Job.GetRequest.Timeout=50000
'	ToastMessageShow("JobDone",True)
	If Job.Success Then
		Dim Str As String = Job.GetString
		Select Case Job.JobName
			Case "SendGps"
				If Str = "No Result" Then
'					ToastMessageShow("وقعیت مکانی خطا در ارسال",True)
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