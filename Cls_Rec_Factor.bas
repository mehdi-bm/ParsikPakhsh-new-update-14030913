B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private LblShomareFaktor As Label
	Private LblTotalFaktor As Label
	Private LblDate As Label
	Private LblC_Ashkhas As Label
	Private Panel4 As Panel
	Private pnl_bk As Panel
	Private base As Object
	Private BtnList As Button
	Private LblN_Ashkhas As Label
	Private ItemFactor As AdapterListFaktor
	Private lblDateBargashti As Label
	Private lblShomareBargashti As Label
	Private lblShomareForoosh As Label
	Private lblTedadBargashti As Label
	Private lblTedadSefaresh As Label
	Private lblTotalBargashti As Label
	Private lblTedadMande As Label
	Private lblMablaghMande As Label
	Dim date1,date2 As String
	Private btnShowJozeiat As Button
	Private lblCheckAmani As Label
	Private lblVaziat As Label
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("L_Rec_Factor")
	ItemFactor.Initialize
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub Show(Item1 As AdapterListFaktor,DateAz As String,DateTa As String)
'	BtnList.Tag = Item1
	ItemFactor = Item1
	LblShomareFaktor.Text = Item1.fldShomareFaktor
	LblTotalFaktor.Text = NumberFormat(Item1.fldTotalFaktor,1,3)
	LblDate.Text = Item1.fldDate
	LblC_Ashkhas.Text = Item1.fldC_Ashkhas
	lblShomareForoosh.Text=Item1.fldShomareForoosh
	lblShomareBargashti.Text=myCode.Is_Null_adad(Item1.FldShomareBargasht)
	lblDateBargashti.Text=IIf(myCode.Check_Is_Null(Item1.FldDateBargasht),"-",Item1.FldDateBargasht)
	lblTedadSefaresh.Text=myCode.ToInt(myCode.Is_Null_adad(Item1.fldTedadJoz)) &"-"& myCode.ToInt(myCode.Is_Null_adad(Item1.fldTedadCarton))
	lblTedadBargashti.Text=myCode.ToInt(myCode.Is_Null_adad(Item1.fldTedadJozMarjoee)) &"-"& myCode.ToInt(myCode.Is_Null_adad(Item1.fldTedadCartonMarjoee))
	lblTedadMande.Text=myCode.ToInt(myCode.Is_Null_adad(Item1.fldTedadJozMande)) &"-"& myCode.ToInt(myCode.Is_Null_adad(Item1.fldTedadCartonMande))
	lblMablaghMande.Text=IIf(myCode.Check_Is_Null(Item1.fldMablaghMande),0,myCode.AdadToPrice(Item1.fldMablaghMande))
	lblTotalBargashti.Text=IIf(myCode.Check_Is_Null(Item1.FldMablaghBargasht),0,myCode.AdadToPrice(Item1.FldMablaghBargasht))
	If Item1.FldAmani=0 Then
		lblCheckAmani.Text=Chr(0xE835)
		'lblCheckAmani.TextColor=Colors.Red
	Else
		lblCheckAmani.Text=Chr(0xE834)
		'lblCheckAmani.TextColor=Colors.Green
	End If
	
	If Item1.synced=True Then
		
		lblVaziat.Text="سفارش ارسال شده"
		
		If lblShomareForoosh.Text>0   Then
			lblVaziat.Text="سفارش تکمیل شده"
	
			If lblShomareBargashti.Text>0 Then
				lblVaziat.Text="سفارش مرجوع شده"
			End If
		End If
	Else
	
		lblVaziat.Text="سفارش ارسال نشده"
	End If
	
	Dim Cu As Cursor= MCode.Result("Select fldSharheTafzili From TblAshkhas where FldCodeTafzili = '"& Item1.fldC_Ashkhas &"'")
	If Cu.RowCount>0 Then
		Cu.Position=0
		LblN_Ashkhas.Text = Cu.GetString("fldSharheTafzili")
	Else
		LblN_Ashkhas.Text = "-"
	End If
	
	date1=DateAz
	date2=DateTa
End Sub

Sub BtnList_Click
	If ItemFactor.fldShomareForoosh>0 Then
		Act_ReportRizeBargasht.DateAz=date1
		Act_ReportRizeBargasht.DateTa=date2
		Act_ReportRizeBargasht.shomareForoosh=ItemFactor.fldShomareForoosh
		Act_ReportRizeBargasht.shomareFaktor=ItemFactor.fldShomareFaktor
		StartActivity(Act_ReportRizeBargasht)
		Else
		MCode.FaktorSelect = ItemFactor.fldShomareFaktor
		MCode.IsOnlineDataFactor=0
		StartActivity(Act_RizFaktor)
	End If

	

End Sub

Private Sub btnShowJozeiat_Click
	MCode.FaktorSelect = ItemFactor.fldShomareFaktor
	MCode.IsOnlineDataFactor=0
	Act_RizFaktor.Faktor=ItemFactor
	StartActivity(Act_RizFaktor)
End Sub

Private Sub btnShowMoqhaerat_Click
	Act_ReportRizeBargasht.DateAz=date1
	Act_ReportRizeBargasht.DateTa=date2
	Act_ReportRizeBargasht.shomareForoosh=ItemFactor.fldShomareForoosh
	Act_ReportRizeBargasht.shomareFaktor=ItemFactor.fldShomareFaktor
	StartActivity(Act_ReportRizeBargasht)
End Sub