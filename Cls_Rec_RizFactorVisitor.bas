B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel

	
	Private Panel4 As Panel
	Private pnl_bk As Panel
	Private base As Object


	Private lblCodeKala As Label
	Private LblFeeJoz As Label
	Private LblRadif As Label
	Private lblSharh As Label
	Private lblSharhKala As Label
	Private LblTedadCarton As Label
	Private lblTedadJoz As Label
	Private LblMablaghKol As Label
	Private LblTedadDarKarton As Label
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_rec_rizfactorvisitor")
	
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub Show(Item1 As AdapteRepRizFactorVisitor)
	
	LblRadif.Text=Item1.fldRadif
	lblCodeKala.Text=Item1.fldCodeKala
	LblFeeJoz.Text=Item1.fldFeeJoz &" "&MCode.VahedPool
	lblSharhKala.Text=Item1.fldSharhKala
	lblTedadJoz.Text=Item1.fldTedadJoz
	LblTedadCarton.Text=Item1.fldTedadCarton
	lblSharh.Text=Item1.fldTozihatRecord
	If Item1.SumFee>0 Then
		LblMablaghKol.Text=MCode.qomaAshar(Item1.SumFee) &" "&MCode.VahedPool
	Else
		LblMablaghKol.Text=0
	End If
	
	LblTedadDarKarton.Text=Item1.FldTedadDarKarton

	
	
End Sub



