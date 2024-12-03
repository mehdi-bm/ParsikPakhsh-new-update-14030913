B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=7.3
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: True
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	Public SharedFolder As String
	Public shared As String
	Public rp As RuntimePermissions
	Public PhoneEvent1 As PhoneEvents
	
	Dim t1 As Timer
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	shared = rp.GetSafeDirDefaultExternal("shared")
	SharedFolder=File.DirInternalCache
	StartServiceAt(FusedLocationService,DateTime.Now + 3000,False)

	Service.AutomaticForegroundMode=1
	
	StartServiceAt(Service_Helper,DateTime.Now + 10000,False)

End Sub

Sub Service_Start (StartingIntent As Intent)

	'StartServiceAt(Me,DateTime.Now + 10000,False)

	
	
End Sub


Private Sub receiver2_OnReceive(Action As String,keys() As String,Data As Object)
	Log(Action)
	Log(Data)
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	'MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, "Main", Error)
	StartServiceAt(FusedLocationService,DateTime.Now + 3000,False)
	Return True
End Sub




Sub Service_Destroy
	
	Log("شکستن")
	CloseActivities
	StartServiceAt(FusedLocationService,DateTime.Now + 3000,False)
End Sub

Sub CloseActivities
	Dim jo As JavaObject
	jo.InitializeContext
	jo.RunMethod("finishAffinity", Null)
End Sub

'Sub PhoneEvent_ConnectivityChanged(NetworkType As String, State As String, Intent As Intent)
'    
'	'NetworkType - WIFI or MOBILE.
'	'State - One of the following values: CONNECTING, CONNECTED, SUSPENDED, DISCONNECTING, DISCONNECTED, UNKNOWN.
'	MCode.Vpn=False
'	
'		
'
''	Log("AutomaticForegroundMode= " & Service.AutomaticForegroundMode)
''	If Service.AutomaticForegroundMode=1 Then		
''		Log("Is Listening")
''		If State = "CONNECTED" Then
''			If NetworkType="VPN" Then
''				MCode.Vpn=True
''				ToastMessageShow("برای عملکرد بهتر نرم افزار لطفا VPN را خاموش کنید",True)
''			End If
''			ToastMessageShow("اینترنت متصل است",True)
''			Log(NetworkType)
''			Log(State)
''			MCode.ConnectionState=True
''		Else
''			ToastMessageShow("ارتباط اینترنت قطع میباشد",True)
''			Log(NetworkType)
''			Log(State)
''			MCode.ConnectionState=False
''		End If
''	End If
'
'End Sub
'Sub AddError(Err As String)
'	Dim pdata As Map
'	pdata.Initialize
'	pdata.Put("errorText" , FirebaseMessaging.fm.Token)
'	pdata.Put("apiKey",MCode.ApiKey)
'	Dim J1 As HttpJob
'	J1.Initialize("",Me)
'	J1.GetRequest.Timeout=4000
'	J1.PostMultipart("http://" & MCode.url & "/api/Error/AddErrorLog",pdata,Null )
'End Sub