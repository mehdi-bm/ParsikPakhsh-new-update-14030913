B4A=true
Group=Class\Report\PrintFactorType2
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel
	


	Private lblDateFactor As Label

	Private lblNameCo As Label
	Private lblNameMoshtari As Label

	Private lblShomareFactor As Label

	Private lblTell As Label
	Private lblAddress As Label
	Private lblNameCompany As Label
	Private lblTellCompany As Label
	Private lblAddressCompany As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(CodeMoshtari As String,NameMoshtari As String,CodeVisitor As String,NameVisitor As String,NameCo As String ,ShomareFactor As String,DateFactor As String,DateReport As String,TimeReport As String,Tell As String,Address As String,NameCompany As String,TellCompany As String,AddressCompany As String)
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_faktor1_type2")

	lblNameMoshtari.Text=NameMoshtari

	lblNameCo.Text=NameCo
	lblShomareFactor.Text=ShomareFactor
	lblDateFactor.Text=DateFactor
	
	lblTell.Text=Tell
	lblAddress.Text=Address
	
	lblNameCompany.Text=NameCompany
	lblTellCompany.Text=TellCompany
	lblAddressCompany.Text=AddressCompany
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