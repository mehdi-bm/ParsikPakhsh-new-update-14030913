B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel
	
	Private lblTarikh As Label
	Private LblNameMoshtari As Label
	Private lblAdress As Label
	Private lblTel As Label
	Private lblTitle As Label
	Private Parent As Panel
	Private Label1 As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(tarikh As String,name As String,address As String,tel As String,pardakhti As String, cu As Cursor)
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("L_PrintMali")
	lblAdress.Text="آدرس:"&address
	LblNameMoshtari.Text="نام مشتری:"&name
	lblTarikh.Text=tarikh
	lblTel.Text="تلفن:"&tel
	
	Label1.Text = MCode.AppName
'	lblMatn.Text = $"مبلغ ${NumberFormat2(pardakhti,0,0,0,True)} ریال  دریافت گردید."$
	' FldC_Visitor,FldC_Ashkhas,FldType,FldNoe,FldMablagh,FldShomareCheck,FldDateCheck,FldBankName,FldDateSabt)
	cu.Position=0
	
	Dim LblDateSabt As Label
	LblDateSabt.Initialize("LblDateSabt")
	LblDateSabt.TextColor=Colors.Black
	LblDateSabt.TextSize=16
	LblDateSabt.Gravity=Gravity.Right
	LblDateSabt.SingleLine=False
	LblDateSabt.Typeface=MCode.Font2
	LblDateSabt.Color=Colors.Transparent
	Parent.AddView(LblDateSabt,1%x,1%y,49%x,5%y)
	
	Dim LblShomareSabt As Label
	LblShomareSabt.Initialize("LblShomareSabt")
	LblShomareSabt.TextColor=Colors.Black
	LblShomareSabt.TextSize=16
	LblShomareSabt.Gravity=Gravity.Right
	LblShomareSabt.SingleLine=False
	LblShomareSabt.Typeface=MCode.Font2
	LblShomareSabt.Color=Colors.Transparent
	Parent.AddView(LblShomareSabt,50%x,1%y,46%x,5%y)
	
	Dim LblTypeSabt As Label
	LblTypeSabt.Initialize("LblTypeSabt")
	LblTypeSabt.TextColor=Colors.Black
	LblTypeSabt.TextSize=16
	LblTypeSabt.Gravity=Gravity.Right
	LblTypeSabt.SingleLine=False
	LblTypeSabt.Typeface=MCode.Font2
	LblTypeSabt.Color=Colors.Transparent
	Parent.AddView(LblTypeSabt,1%x,6%y,49%x,5%y)
	
	Dim LblNoeSabt As Label
	LblNoeSabt.Initialize("LblNoeSabt")
	LblNoeSabt.TextColor=Colors.Black
	LblNoeSabt.TextSize=16
	LblNoeSabt.Gravity=Gravity.Right
	LblNoeSabt.SingleLine=False
	LblNoeSabt.Typeface=MCode.Font2
	LblNoeSabt.Color=Colors.Transparent
	Parent.AddView(LblNoeSabt,50%x,6%y,46%x,5%y)
	
	Dim LblNameBank As Label
	LblNameBank.Initialize("LblNameBank")
	LblNameBank.TextColor=Colors.Black
	LblNameBank.TextSize=16
	LblNameBank.Gravity=Gravity.Right
	LblNameBank.SingleLine=False
	LblNameBank.Typeface=MCode.Font2
	LblNameBank.Color=Colors.Transparent
	Parent.AddView(LblNameBank,1%x,11%y,49%x,5%y)
	
	Dim LblMablagh As Label
	LblMablagh.Initialize("LblMablagh")
	LblMablagh.TextColor=Colors.Black
	LblMablagh.TextSize=16
	LblMablagh.Gravity=Gravity.Right
	LblMablagh.SingleLine=False
	LblMablagh.Typeface=MCode.Font2
	LblMablagh.Color=Colors.Transparent
	Parent.AddView(LblMablagh,50%x,11%y,46%x,5%y)
	
	Dim LblShomareCheck As Label
	LblShomareCheck.Initialize("LblShomareCheck")
	LblShomareCheck.TextColor=Colors.Black
	LblShomareCheck.TextSize=16
	LblShomareCheck.Gravity=Gravity.Right
	LblShomareCheck.SingleLine=False
	LblShomareCheck.Typeface=MCode.Font2
	LblShomareCheck.Color=Colors.Transparent
	Parent.AddView(LblShomareCheck,1%x,16%y,49%x,5%y)
	
	Dim LblDateCheck As Label
	LblDateCheck.Initialize("LblDateCheck")
	LblDateCheck.TextColor=Colors.Black
	LblDateCheck.TextSize=16
	LblDateCheck.Gravity=Gravity.Right
	LblDateCheck.SingleLine=False
	LblDateCheck.Typeface=MCode.Font2
	LblDateCheck.Color=Colors.Transparent
	Parent.AddView(LblDateCheck,50%x,16%y,46%x,5%y)
	
	Dim Item As AdapterListSabt
	Item.FldShomareSabt = cu.GetString("FldShomareSabt")
	Item.FldC_Ashkhas = cu.GetString("FldC_Ashkhas")
	Item.FldType = cu.GetString("FldType")
	Item.FldNoe = cu.GetString("FldNoe")
	Item.FldMablagh = cu.GetString("FldMablagh")
	Item.FldShomareCheck = cu.GetString("FldShomareCheck")
	Item.FldDateCheck = cu.GetString("FldDateCheck")
	Item.FldBankName = cu.GetString("FldBankName")
	Item.FldDateSabt = cu.GetString("FldDateSabt")
	
	Dim LblDateSabt As Label  = Parent.getview(0)
	LblDateSabt.Text = "تاریخ ثبت: " & MCode.Sf.Mid(Item.FldDateSabt,1,4) & "/" & MCode.Sf.Mid(Item.FldDateSabt,5,2) & "/" & MCode.Sf.Mid(Item.FldDateSabt,7,2)
	
	Dim LblShomareSabt As Label  = Parent.getview(1)
	LblShomareSabt.Text = "شماره ثبت: " & Item.FldShomareSabt
	
	Dim LblTypeSabt As Label  = Parent.getview(2)
	Select Case Item.FldType
		Case 1
			lblTitle.Text="رسید دریافت وجه"
			LblTypeSabt.text = "نوع تراکنش: دریافت"
		Case 2
			lblTitle.Text="رسید پرداخت وجه"
			LblTypeSabt.text = "نوع تراکنش: پرداخت"
	End Select
	
	Dim LblNoeSabt As Label  = Parent.getview(3)
	LblNoeSabt.text = "نوع ثبت: " & Item.FldNoe

	Dim LblNameBank As Label = Parent.getview(4)
	If Item.FldBankName<>0 Then
		LblNameBank.text = "نام بانک: " & Item.FldBankName
	Else
		LblNameBank.text = "نام بانک: -"
	End If
	
	Dim LblMablagh As Label = Parent.getview(5)
	LblMablagh.text = "مبلغ: " & NumberFormat(Item.FldMablagh,1,3)
	
	Dim LblShomareCheck As Label = Parent.getview(6)
	If Item.FldShomareCheck <> 0 Then
		LblShomareCheck.text = "شماره چک: " & Item.FldShomareCheck
	Else
		LblShomareCheck.text = "شماره چک: -"
	End If
	Dim LblDateCheck As Label = Parent.getview(7)
	If Item.FldDateCheck <> 0 Then
		LblDateCheck.text = "تاریخ چک: " & MCode.Sf.Mid(Item.FldDateCheck,1,4) & "/" & MCode.Sf.Mid(Item.FldDateCheck,5,2) & "/" & MCode.Sf.Mid(Item.FldDateCheck,7,2)
	Else
		LblDateCheck.text = "تاریخ چک: -"
	End If
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub
