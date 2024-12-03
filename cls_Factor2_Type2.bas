B4A=true
Group=Class\Report\PrintFactorType2
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
#IgnoreWarnings : 5
Sub Class_Globals
	Private p As Panel
	
	
	Private pnl_bk As Panel

	Private lblFee As Label
	Private lblMablagh As Label
	Private lblNameKala As Label
	Private lblRadif As Label

	Private lblTedaJoze As Label

	Private lblSharh As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Radif,CodeKala,NameKala,Fee,FeeTakhfifKala,FeeTakhfifVizhe,Sum,MablaghKhales,TedadJoze,TedadKol,TedadDarKarton,Sharh As String)
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_faktor2_type2")
	lblRadif.Text=Radif
	lblNameKala.Text=NameKala
	lblFee.Text=Fee
	lblMablagh.Text=Sum
	lblTedaJoze.Text=TedadJoze
	lblSharh.Text=Sharh
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
