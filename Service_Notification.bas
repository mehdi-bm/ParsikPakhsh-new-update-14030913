B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=8.8
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: True
	#StartCommandReturnValue: android.app.Service.START_STICKY
	
#End Region

Sub Process_Globals
	Dim jobInternet As HttpJob
	Dim count As Int=0
	Dim t1 As Timer
	Dim noti As AdvancedNotification
End Sub

Sub Service_Create
	jobInternet.Initialize("jobInternet",Me)
	jobInternet.GetRequest.Timeout=50000
	noti.Initialize
	noti.Icon="icon"
	noti.Light=True
	noti.Sound=False
	noti.NoClear=False
'	t1.Initialize("t1",6000)
'	t1.Enabled=True
End Sub

Sub Service_Start (StartingIntent As Intent)
	Dim t As Long= DateTime.Now + 6000
	'Log(t)
'	StartServiceAt("", t, True)
'	If MCode.IsConnected Then
'		If MCode.downloadingData=False Then
'			If MCode.Vaziat>0 And MCode.GetDataOnline=1 Then
'				Log("Notifi1")
'				GetNotification
'			End If
'		End If
'	End If

	't1.Enabled=True
	
		

	'Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
End Sub

Sub t1_Tick
	
	'Log("Notifi2")
	'GetNotification
End Sub

Sub GetNotification
	jobInternet.JobName ="GetNotification"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetNotification","Imei=" & MCode.DeviceId & "&CodeVisitor="&MCode.C_Visitor)
End Sub

Sub LoadGetNotification(Str As String)
	Dim RowsList As List
	Dim Row As Map
	Dim Strtype As String=""
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
	
		Log(Row.Get("fldTitle"))
		Log(Row.Get("fldTime"))
		Log(Row.Get("fldType"))
	
		If Row.Get("fldType")="" Then
			MCode.SaveUpdate("Insert Into TblNotifi (Id,FldTitle,FldBody,FldDate,FldTime) Values ('"& _
		 Row.Get("Id") &"','"& Row.Get("fldTitle") &"','"& Row.Get("fldBody") &"','"& Row.Get("fldDate") &"','"& Row.Get("fldTime") &"')")
		
			noti.SetInfo2(Row.Get("fldTitle"),Row.Get("fldBody"),Row.Get("Id"),Act_Notif)
			'MCode.EtelaResani=Row.Get("fldBody")
			Strtype=""
			Else
		
			Strtype=Row.Get("fldType")
			MCode.downloadingData=True
			If Row.Get("fldType")="GetForoosh" Or Row.Get("fldType")="GetKharid" Or Row.Get("fldType")="GetBargashtAzForoosh" Or Row.Get("fldType")="GetBargashtAzKharid" Then
				
				'Strtype=Row.Get("fldBody")
				CallSubDelayed3(FirebaseMessaging,"GetForooshAndKharid",Row.Get("fldTitle"),Row.Get("fldBody"))
				Else
				FirebaseMessaging.mode=Strtype
				StartService(FirebaseMessaging)
				
			End If
			
			
		End If
		
	Next
	noti.Notify(1)

	Log("نوتیفیکیشن بروزرسانی گردید")

End Sub



Sub GetNotification2
	jobInternet.JobName ="GetNotification2"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetNotification2","Imei=" & MCode.DeviceId)
End Sub

Sub LoadGetNotification2(Str As String)
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblTablighVisitor")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblTablighVisitor (Id,FldTitle,FldMessage,FldDate,FldTime,FldLink) Values ('"& _
		 Row.Get("Id") &"','"& Row.Get("FldTitle") &"','"& Row.Get("FldMessage") &"','"& Row.Get("FldDate") &"','"& Row.Get("FldTime") &"','"& Row.Get("FldLink") &"')")
		Log(Row.Get("FldTitle"))
		Log(Row.Get("FldTime"))
		'noti.SetInfo2(Row.Get("fldTitle"),Row.Get("FldMessage"),Row.Get("Id"),Act_Main)
		MCode.EtelaResani=Row.Get("FldMessage")
	Next
	'noti.Notify(2)
	Log("نوتیفیکیشن2 بروزرسانی گردید")

End Sub

Sub GetNotification3
	jobInternet.JobName ="GetNotification3"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetNotification3","Imei=" & MCode.DeviceId)
End Sub

Sub LoadGetNotification3(Str As String)
	Dim RowsList As List
	Dim Row As Map
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
'		MCode.SaveUpdate("Insert Into TblNotifi (Id,FldTitle,FldBody,FldDate,FldTime) Values ('"& _
'		 Row.Get("Id") &"','"& Row.Get("fldTitle") &"','"& Row.Get("fldBody") &"','"& Row.Get("fldDate") &"','"& Row.Get("fldTime") &"')")
		Log(Row.Get("fldTitle"))
		Log(Row.Get("fldTime"))
		
		'MCode.EtelaResani=Row.Get("fldBody")
	Next
	'noti.Notify(2)


End Sub

Sub JobDone (Job As HttpJob)
	Job.GetRequest.Timeout=50000
	If Job.Success Then
		Try
			Dim Str As String = Job.GetString
			Select Case Job.JobName
			

				Case "GetNotification"
					If Str = "No Result" Then
						Log("نوتیفیکیشن جدیدی موجود نمی باشد")
						ProgressDialogHide
					Else
						LoadGetNotification(Str)
					End If
					
				Case "GetNotification2"
					If Str = "No Result" Then
						Log("نوتیفیکیشن2 جدیدی موجود نمی باشد")
						ProgressDialogHide
					Else
						LoadGetNotification2(Str)
					End If
					
					ProgressDialogHide
					
				Case "GetNotification3"
					If Str = "No Result" Then
						Log("نوتیفیکیشن3 جدیدی موجود نمی باشد")
						ProgressDialogHide
					Else
						LoadGetNotification3(Str)
					End If
			End Select
		Catch
			Log(LastException)
		End Try
		ProgressDialogHide
	Else
		'If	MCode.IsConnected Then
			'If MCode.Vaziat=1 Then
				StartActivity(Act_Main)
			'Else
				'ToastMessageShow("خطا در دسترسی اینترنت",True)
			'End If
			
		'Else
			'Log("خطا در اتصال")
		'End If
		
		ProgressDialogHide
		'	StartService(Service_Gps)
		StartService(FusedLocationService)
		Log("Gps Start")
	End If
	jobInternet.Release
	
End Sub

Sub Service_Destroy

End Sub
