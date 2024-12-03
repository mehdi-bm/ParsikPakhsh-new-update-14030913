B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=12.8
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Service_Create

End Sub

Sub Service_Start (StartingIntent As Intent)
	Dim data As String
	data = StartingIntent.GetExtra("result_key") ' دریافت داده از اینتنت
	Log("Received data in service: " & data)

	' انجام عملیات مورد نیاز با داده‌ها

	Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
End Sub

Sub Service_Destroy

End Sub
