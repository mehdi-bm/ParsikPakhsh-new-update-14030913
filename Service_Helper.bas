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
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim t1 As Timer
	
End Sub

Sub Service_Create
	t1.Initialize("t1",10000)
	
End Sub

Sub Service_Start (StartingIntent As Intent)
'	StartServiceAt(Me,DateTime.Now+10000,True)
	
	Service.AutomaticForegroundMode= Service.AUTOMATIC_FOREGROUND_ALWAYS

	t1.Enabled=True
End Sub

Sub t1_Tick
	Log("GetDataStatus= "&MCode.GetDataStatus)
	If MCode.GetDataStatus Then
		t1.Enabled=False
		Return
	End If
		CheckVaziat
	If MCode.Vaziat=1 Then
		SaveTourVisit
	End If
	
End Sub

Sub CheckVaziat	
	Log("CheckVaziat")
	If MCode.IsConnected Then
			MCode.NoeGet="GetVaziat"		
		StartService(Service_Server)
	End If
End Sub

Sub SaveTourVisit
	Log("SaveTourVisit")
	If MCode.IsConnected Then
		MCode.NoeGet="SaveTourVisit"
		StartService(Service_Server)
	End If
End Sub

Sub Service_Destroy
'	MCode.receiver2.UnRegisterReceiver
End Sub
