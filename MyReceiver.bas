B4A=true
Group=Services
ModulesStructureVersion=1
Type=Receiver
Version=12.8
@EndOfDesignText@
Sub Process_Globals
	
End Sub

'Called when an intent is received. 
'Do not assume that anything else, including the starter service, has run before this method.
Private Sub Receiver_Receive (FirstTime As Boolean, StartingIntent As Intent)
	Dim data As String
	data = StartingIntent.GetExtra("result_key") ' دریافت داده از اینتنت
	Log("Received data in service: " & data)
End Sub

