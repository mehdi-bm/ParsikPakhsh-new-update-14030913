B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private ticket As AdapterListNotif
	Private pnl_BK As Panel
	Private lblDate As Label
	Private lblTime As Label
	Private lblMatn As Label
	Private lbl_Subject As Label
	Private lblBack As Label
	Private Panel1 As Panel
	Private LblLine As Label
End Sub

Public Sub Initialize
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("L_RecNotif")
End Sub
Public Sub show_data(item As AdapterListNotif)
	ticket			=item
	lblDate.Text	=ticket.FldDate
	lblTime.Text	=ticket.FldTime
	lbl_Subject.Text=ticket.FldTitle
	lblMatn.Text	="شرح :"&ticket.FldBody
	Dim su As StringUtils
	lblMatn.Height = su.MeasureMultilineTextHeight(lblMatn, lblMatn.Text)+10dip
	lblBack.Height=lblMatn.Height+lbl_Subject.Height
	Panel1.Height=lblMatn.Height+lbl_Subject.Height+lbl_Subject.Height
	pnl_BK.Height=lblMatn.Height+lbl_Subject.Height+lbl_Subject.top+10dip
	LblLine.Height = lblMatn.Height+10dip
End Sub
Public Sub getPanel As Panel
	pnl_BK.RemoveView
	Return pnl_BK
End Sub
Public Sub getHeight As Int
	Return pnl_BK.Height+20dip
End Sub
Public Sub getWidth As Int
	Return pnl_BK.Width+5dip
End Sub

Private Sub pnl_bk_Click
	
End Sub
