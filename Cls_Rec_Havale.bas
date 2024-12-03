B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel

	Dim Item As AdapteRepHavale
	Private pnl_bk As Panel
	Private base As Object
	Private LblDate As Label
	Private LblTotal As Label
	Private LblShomareHavale As Label
	Private lblCount As Label
	Private lblCheck As Label
	Private lblUnCheck As Label
	Private lblShowHavale As Label
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_rechavale")
	
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub Show(Item1 As AdapteRepHavale)
	Item=Item1
	LblShomareHavale.Text="شماره حواله "&Item1.fldShomareHavale
	LblDate.Text=MCode.PersianDateDash(Item1.fldDate)
	lblCount.Text=Item1.fldCountFactor
	If Item1.fldMandeFactor>0 Then
		LblTotal.Text=MCode.qomaAshar(Item1.fldMandeFactor) &" "&MCode.VahedPool
	Else
		LblTotal.Text=0
	End If

	If myCode.Is_Null_adad(Item1.fldVaziat)=0 Then
		lblUnCheck.Visible=True
		lblCheck.Visible=False
		Else
		lblUnCheck.Visible=False
		lblCheck.Visible=True
	End If
Log(Item1.fldVaziat)
	
	
End Sub

Public Sub lblShowHavale_Click
	MCode.ShomareHavale=Item.fldShomareHavale
	Act_RizHavale.Item1=Item
	StartActivity(Act_RizHavale)
End Sub