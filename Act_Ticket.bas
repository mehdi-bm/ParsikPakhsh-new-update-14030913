B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	

End Sub

Sub Globals

	Dim Site As String = "https://support.parsikhesab.com/"
	Dim CurrentURL As String = Site
	Dim web As WebView
	Private Wview As WebViewExtras
	Private pnlMain As Panel
	Private pnlMain As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("l_ticket")
	web.Initialize("")
	Wview.Initialize(web)
	pnlMain.AddView(Wview,0,0,100%x,100%y)
	Wview.JavaScriptEnabled=True
	
'	Wview.SetHttpAuthUsernamePassword(Site,"Realm","username","password")
	Wview.LoadUrl(Site)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub
