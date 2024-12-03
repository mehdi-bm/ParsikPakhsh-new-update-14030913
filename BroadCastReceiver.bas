B4A=true
Group=Class
ModulesStructureVersion=1
Type=Receiver
Version=12.8
@EndOfDesignText@
Sub Process_Globals
	
End Sub

'Called when an intent is received. 
'Do not assume that anything else, including the starter service, has run before this method.
Private Sub Receiver_Receive (FirstTime As Boolean, StartingIntent As Intent)
	' کد اجرایی هنگامی که BroadCast دریافت می‌شود
	' اینجا شما می‌توانید اطلاعات را از Intent دریافت کرده و با آن کار کنید
	' مثال:
	Dim data As String
	data = StartingIntent.GetExtra("Key") ' Key باید همان نامی باشد که شما در ارسال Intent از آن استفاده کرده‌اید
	Log("Received data: " & data)
End Sub

