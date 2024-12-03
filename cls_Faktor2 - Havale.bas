B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
#IgnoreWarnings : 5
Sub Class_Globals
	Private p As Panel
	
	
	Private pnl_bk As Panel
	Private lblCodeKala As Label
	Private lblFee As Label
	Private lblMablagh As Label
	Private lblNameKala As Label
	Private lblRadif As Label
	Private lblTedadKol As Label
	Private lblTedaJoze As Label
	Private lblTakhfifiKala As Label
	Private lblTakhfifVizhe As Label
	Private lblMablaghKhales As Label
	Private lblTedadDarKarton As Label
	Private lblSharh As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Radif,CodeKala,NameKala,Fee,FeeTakhfifKala,FeeTakhfifVizhe,Sum,MablaghKhales,TedadJoze,TedadKol,TedadDarKarton,Sharh As String)
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_faktor2 - havale")
	lblRadif.Text=Radif
	lblCodeKala.Text=CodeKala
	lblNameKala.Text=NameKala
	lblFee.Text=Fee
	lblTakhfifiKala.Text=FeeTakhfifKala
	lblTakhfifVizhe.Text=FeeTakhfifVizhe
	lblMablagh.Text=Sum
	lblMablaghKhales.Text=MablaghKhales
	lblTedaJoze.Text=TedadJoze
	lblTedadKol.Text=TedadKol
	lblTedadDarKarton.Text=TedadDarKarton
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
