B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=8.8
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	
	Private pnl_bk As Panel
	Private lblRow As Label
	Private lblDate As Label
	Private lblTime As Label
	Private btnDelete As Button
	Private btnReturn As Button
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Row As String,Date As String,Time As String)
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_backupitem")
	lblRow.Text=Row
	lblDate.Text=Date
	lblTime.Text=Time
End Sub

Sub btnDelete_Click
	
End Sub

Sub btnReturn_Click
	
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getWidth As Int
	Return pnl_bk.Width
End Sub
Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub
Public Sub getTop As Int
	Return pnl_bk.Top
End Sub
Public Sub getLeft As Int
	Return pnl_bk.Left
End Sub