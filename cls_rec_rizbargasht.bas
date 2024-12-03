B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=12.5
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private base As Object
	Private ItemFactor As AdapterListRizeFaktor
	Private pnl_bk As Panel
	Private lblCodeKala As Label
	Private lblNameKala As Label
	Private lblRadif As Label
	Private lblShomareFactor As Label
	Private lblTedadJoz As Label
	Private lblTedadKol As Label
	Private lblTotalFactor As Label
	Private lblType As Label
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_Rec_RizeBargasht")
	ItemFactor.Initialize

End Sub

Public Sub Show(Item1 As AdapterListRizeFaktor)
	ItemFactor=Item1
	lblRadif.Text=ItemFactor.FldRadif
	lblCodeKala.Text=ItemFactor.fldCodeKala
	lblNameKala.Text=ItemFactor.fldSharhKala
	lblShomareFactor.Text=ItemFactor.fldShomareFaktor
	lblTedadJoz.Text=ItemFactor.fldTedadJoz
	lblTedadKol.Text=ItemFactor.fldTedadCarton
	lblType.Text=ItemFactor.FldType
	lblTotalFactor.Text=myCode.AdadToPrice(ItemFactor.fldTotalFaktor)
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Private Sub BtnList_Click
	MCode.FaktorSelect = ItemFactor.fldShomareFaktor
	StartActivity(Act_RizFaktor)
End Sub