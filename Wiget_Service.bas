B4A=true
Group=Services
ModulesStructureVersion=1
Type=Receiver
Version=12.2
@EndOfDesignText@
Sub Process_Globals
	Private rv As RemoteViews
End Sub

'Called when an intent is received. 
'Do not assume that anything else, including the starter service, has run before this method.
Private Sub Receiver_Receive (FirstTime As Boolean, StartingIntent As Intent)
	If FirstTime Then
		'rv = ConfigureHomeWidget("l_Wiget1", "rv", 60, "Hello Widget")
	End If
	rv.HandleWidgetEvents(StartingIntent)
End Sub

Private Sub rv_RequestUpdate
	rv.SetImage("ImageView1", LoadBitmap(File.DirAssets, "icon.png"))
	
'	rv.SetText("Label1", "نرم افزار حسابداری پارسیک")
'	rv.SetTextColor("Label1",0xFFFF0000)
	rv.UpdateWidget
End Sub

Private Sub ImageView1_Click
	StartActivity(Main)
End Sub
