B4A=true
Group=Class\Report\PrintHavale_Type2
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
#IgnoreWarnings : 5
Sub Class_Globals
	Private p As Panel
	
	
	Private pnl_bk As Panel

	Private lblCodeKala As Label
	Private lblDarsadTakhfif As Label
	Private lblFee As Label
	Private lblFeeTakhfifi As Label
	Private lblFeeYekKarton As Label
	Private lblNameKala As Label
	Private lblRadif As Label
	Private lblTedadKol As Label
	Private lblTedaJoze As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Radif,CodeKala,NameKala,Fee,FeeYekKarton,FeeTakhfif,DarsadTakhfif,TedadJoze,TedadKol As String)
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_faktor2_havale_Type2")
	lblRadif.Text=Radif
	
	lblCodeKala.Text=CodeKala
	lblNameKala.Text=NameKala
	
	lblFeeTakhfifi.Text=FeeTakhfif
	lblDarsadTakhfif.Text=DarsadTakhfif
	
	lblTedaJoze.Text=TedadJoze
	lblTedadKol.Text=TedadKol
	
	lblFee.Text=Fee
	lblFeeYekKarton.Text=FeeYekKarton

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
