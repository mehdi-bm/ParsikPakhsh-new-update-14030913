B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region
#Extends: android.support.v7.app.AppCompatActivity
Sub Process_Globals
	

End Sub

Sub Globals
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("l_Contuct")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub ic_Website_Click
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser("http://www.zomorodhesab.com"))
End Sub

Sub ic_Tell_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW, "tel:06132930013")
	StartActivity(i)
	MCode.SetAnimation("zoom_enter1", "zoom_exit1")
End Sub

Sub ic_Telegram_Click	
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser("http://t.me/zomorodhesab"))
End Sub

Sub ic_Mobile_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW, "tel:09168858084")
	StartActivity(i)
	MCode.SetAnimation("zoom_enter1", "zoom_exit1")
End Sub

Sub ic_Instagram_Click
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser("http://Instagram.com/zomorodhesab"))
End Sub

Sub lbl_WebsiteA_Click
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser("http://www.zomorodhesab.com"))

End Sub

Sub lbl_TellA_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW, "tel:06132930013")
	StartActivity(i)
	MCode.SetAnimation("zoom_enter1", "zoom_exit1")
End Sub

Sub lbl_TelegramA_Click
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser("http://t.me/zomorodhesab"))
End Sub

Sub lbl_MobileA_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW, "tel:09168858084")
	StartActivity(i)
	MCode.SetAnimation("zoom_enter1", "zoom_exit1")
End Sub

Sub lbl_InstagramA_Click
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser("http://Instagram.com/zomorodhesab"))
End Sub
