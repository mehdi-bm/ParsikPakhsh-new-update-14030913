B4A=true
Group=Report
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals

End Sub

Sub Globals
	Private RB_Moshtari As RadioButton
	Private RB_Visitor As RadioButton
	Private RB_Soorathesab As RadioButton
	Private RB_RepFactorVisitor As RadioButton
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Choose_Report")
	
End Sub

Sub Activity_Resume
	If MCode.Admin="1" Then
		RB_RepFactorVisitor.Visible=True
		Else
		RB_RepFactorVisitor.Visible=False
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Btn_cancel_Click
	Activity.Finish
End Sub

Sub LblBack_Click
	Activity.Finish
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub

Sub Btn_ok_Click	
	Select Case True
		Case RB_Visitor.Checked
			StartActivity(Act_ReportVisitor2)
		Case RB_Moshtari.Checked
			StartActivity(Act_ReportVisitor)
		Case RB_Soorathesab.Checked
			StartActivity(Act_ReportSoorathesab)
		Case RB_RepFactorVisitor.Checked
			StartActivity(Act_RepFactorVisitor)
	End Select
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub