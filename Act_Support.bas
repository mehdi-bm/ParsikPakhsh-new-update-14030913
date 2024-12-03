B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private LblNum1 As Label
	Private LblNum2 As Label
	Private LblSite As Label
	Dim tel1,tel2 As String
	Dim site As String
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("L_Postibani")
	tel1="02188658058"
	tel2="09336999395"
	site="www.Parsikhesab.com"
	LblNum1.Text=tel1
	LblNum2.Text=tel2
	LblSite.Text=site
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub LblNum1_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW, "tel:" & tel1)
	StartActivity(i)
End Sub

Sub LblCall1_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW, "tel:" & tel1)
	StartActivity(i)
End Sub

Sub LblNum2_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW, "tel:" & tel2)
	StartActivity(i)
End Sub

Sub LblCall2_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW, "tel:" & tel2)
	StartActivity(i)
End Sub

Sub LblSite_Click
	Try
		Dim p1 As PhoneIntents
		StartActivity(p1.OpenBrowser("http://www.parsikhesab.com"))
	Catch
		Log(LastException)
	End Try
End Sub

Sub btn_back_Click
	Activity.Finish
End Sub

