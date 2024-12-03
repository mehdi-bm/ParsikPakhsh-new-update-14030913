B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private LblShomareFaktor As Label
	
	Private Panel4 As Panel
	Private pnl_bk As Panel
	Private base As Object


	Private BtnCheck As Button
	Private LblDate As Label
	Private lblCodeVisitor As Label
	Private lblNameVisitor As Label
	Private lblVaziatTasfie As Label
	Private lblVaziatSefaresh As Label
	Private lblSharh As Label
	Private btnJoziat As Button
	Private lblCodeTafzili As Label
	Private lblSharhTafzili As Label
	Private lblTime As Label
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_rec_factorvisitor")
	
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub Show(Item1 As AdapteRepFactorVisitor)
	BtnCheck.Tag = Item1
	btnJoziat.Tag = Item1
	LblShomareFaktor.Text = Item1.fldShomareFactor
	lblCodeVisitor.Text = Item1.fldCodeVasete
	lblNameVisitor.Text = Item1.FldN_Visitor
	LblDate.Text = MCode.PersianDateDash(Item1.fldDate)
	lblTime.Text=Item1.fldTime
	lblVaziatTasfie.Text = Item1.fldNahveTasvie
	lblCodeTafzili.Text=Item1.fldCodeTafsili
	lblSharhTafzili.Text=Item1.fldSharheTafzili

	lblSharh.Text = Item1.fldTozihat
	If Item1.fldShomareFactorReal =-1 Then
		lblVaziatSefaresh.TextColor=Colors.Red
		lblVaziatSefaresh.Text ="تایید نشده"
		BtnCheck.Visible=True
	Else If Item1.fldShomareFactorReal="" Then
		lblVaziatSefaresh.TextColor=Colors.Green
		lblVaziatSefaresh.Text ="تایید شده"
		BtnCheck.Visible=False
	Else 
		lblVaziatSefaresh.TextColor=Colors.Black
		lblVaziatSefaresh.Text ="ثبت شده"
		BtnCheck.Visible=False
	End If
End Sub



Sub BtnCheck_Click
	Log(LblShomareFaktor.Text)
	Dim query As String
	query="Update tblPishPishFaktor set fldShomareFactorReal=NULL where fldShomareFactorReal=-1 and fldShomareFactor="&LblShomareFaktor.Text &" and fldCodeVasete="&lblCodeVisitor.Text
	MCode.BackPage="Act_RepFactorVisitor"
	CallSubDelayed2(Service_Server,"SendUpdateQuery",query)
End Sub

Sub btnJoziat_Click
	
	Act_RepRizFactorVisitor.Item1=btnJoziat.Tag
	StartActivity(Act_RepRizFactorVisitor)
End Sub