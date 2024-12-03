B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(StartingIntent As Intent)
	Dim data As String
	data = StartingIntent.GetExtra("result_key") ' دریافت داده از اینتنت
	Log("Received data in service: " & data)
End Sub