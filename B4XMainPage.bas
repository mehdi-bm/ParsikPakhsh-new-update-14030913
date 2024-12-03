B4A=true
Group=Pages
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@

Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Dim T_Gif As Timer
	Private lblTitle As Label
	Private lblVer As Label
	Private pnlLogo As Panel
	Private pnlTitle As Panel
	Private pnlVer As Panel
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("l_Splash")
	ShowSplash
End Sub

Sub ShowSplash
	Try
		MCode.Initialize
		MCode.UpdateDataBase
		'MCode.UpdateSetting
		'StopService(Service_Gps)
		StopService(FusedLocationService)
		Service_Gps.GPS1.Stop
		MCode.GpsIsEnable=False
	
		
		T_Gif.Initialize("T_Gif",3000)
		T_Gif.Enabled=True
	
		lblTitle.Text=Application.LabelName
		lblVer.Text="نسخه "&Application.VersionName
		'StartService(FirebaseMessaging)
		'StartService(Service_Notification)
		'Glide.Load(File.DirAssets,"123.gif").Into(ImgGif)
	 
		If MCode.Vaziat=1 Then
			'StartService(Service_Notification)
		End If
	Catch
		Log(LastException)
		'myCode.SendError(LastException,Activity.Title&"-ShowSplash")
	End Try
End Sub

Sub T_Gif_Tick
	T_Gif.Enabled=False
	'MCode.UpdateDataBase
	'MCode.UpdateSetting

	StartActivity(Act_Main)
	'Activity.Finish
End Sub






'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.