B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	Dim LstChart As List
End Sub

Sub Globals
	Dim pnlPie, pnlLine, pnl2Lines, pnlBars, pnlStackedBars As Panel
	Private PnlChart As Panel
	Private TxtNumber As EditText
	Private RbDesc As RadioButton
	Private RbAsc As RadioButton
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Chart")
'	LstChart.Initialize
End Sub

Sub CreatePieTab
	Dim p As Panel
	p.Initialize("")
	pnlPie.Initialize("pnlPie")
	p.AddView(pnlPie, 0, 0, 100%x, 100%y)' - 100dip)
	PnlChart.AddView(p,0,0,PnlChart.Width,PnlChart.Height)
	Dim PD As PieData
	PD.Initialize
	PD.Target = pnlPie 'Set the target view
	'Add the items. The last parameter is the color. Passing 0 will make it a random color.
	
	Select Case True
		Case RbAsc.Checked
			LstChart.SortType("amount",True)
		Case RbDesc.Checked
			LstChart.SortType("amount",False)
	End Select
	
	LogColor(LstChart.Size,Colors.Red)
	If MCode.Sf.Val(TxtNumber.Text.trim)>LstChart.Size Then
		TxtNumber.Text = LstChart.Size
	End If
	For i=0 To MCode.Sf.Val(TxtNumber.Text.trim) -1
		Dim Item = LstChart.Get(i) As AdapterReportVisitor
		Charts.AddPieItem(PD, Item.articleName & " ---> " & NumberFormat(Item.amount,1,3),Item.amount, 0)
	Next
	
	PD.GapDegrees = 20 'Total size of gaps between slices. Set to 0 for no gaps.
	PD.LegendBackColor = Colors.ARGB(150, 100, 100, 100) 'The background color of the legend bitmap.
	Dim legend As Bitmap
	legend = Charts.DrawPie(PD, Colors.White, True)
	Dim ImageView1 As ImageView
	ImageView1.Initialize("")
	ImageView1.SetBackgroundImage(legend)
	pnlPie.AddView(ImageView1, 10dip, 10dip, legend.Width, legend.Height)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub LblBack_Click
	Activity.Finish
End Sub

Sub BtnReport_Click
	If IsNumber(TxtNumber.Text.Trim) = False Then
		TxtNumber.Text = 5
	End If
	CreatePieTab
End Sub

Sub TxtNumber_TextChanged (Old As String, New As String)
	If IsNumber(New) = True Then
		If New >10 Then
			TxtNumber.text = 10
		End If
	End If
End Sub