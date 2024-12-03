B4A=true
Group=Report
ModulesStructureVersion=1
Type=Activity
Version=12.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
Dim shomareForoosh As String
Dim shomareFaktor As String
Dim DateAz,DateTa As String

End Sub

Sub Globals
	
	Dim Table1 As Table
	Dim Table2 As Table
	Private LblDate As Label
	Private lblDateBargashti As Label
	Private lblMablaghMande As Label
	Private LblN_Ashkhas As Label
	Private lblShomareBargashti As Label
	Private LblShomareFaktor As Label
	Private lblShomareForoosh As Label
	Private lblTedadBargashti As Label
	Private lblTedadMande As Label
	Private lblTedadSefaresh As Label
	Private lblTotalBargashti As Label
	Private LblTotalFaktor As Label
	Private LblC_Ashkhas As Label
'	Dim HLV As Hitex_LayoutView
	Private ListFaktor1 As List
	Private ListFaktor2 As List
	Private ListFaktor3 As List
	Private LblBack As Button
	Private pnl_Table1 As Panel
	Private pnl_Table2 As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)		
	Activity.LoadLayout("L_RepRizeBargasht")
'	HLV.Initializer("HLV").ListView.Build
'	pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Height)
	ListFaktor1.Initialize
	ListFaktor2.Initialize
	ListFaktor3.Initialize
	Table1.Initialize(Me, "Table1",6)
	Table1.AddToActivity(pnl_Table1, 0,0,100%x,pnl_Table1.Height)
	
	Table2.Initialize(Me, "Table2",6)
	Table2.AddToActivity(pnl_Table2, 0,0,100%x,pnl_Table2.Height)
'	HLV.Ripple.Color(0xFF909090)
'	HLV.Show
	CreatePage
End Sub

Sub Grid1
	Dim Lst_ColNameTitle As List
	Lst_ColNameTitle.Initialize
	Lst_ColNameTitle.AddAll(Array As String("ردیف","کد کالا","نام کالا","تعداد جزء","تعداد کل","نوع فاکتور"))
	Table1.LoadSListReportRizeBargasht(ListFaktor1,Lst_ColNameTitle,6)
	Table1.SetColumnsWidths(Array As Int(70dip,70dip,70dip,70dip,70dip,70dip))
End Sub

Sub Grid2
	Dim Lst_ColNameTitle As List
	Lst_ColNameTitle.Initialize
	Lst_ColNameTitle.AddAll(Array As String("ردیف","کد کالا","نام کالا","تعداد جزء","تعداد کل","نوع"))
	Table2.LoadSListReportRizeBargashtResult(ListFaktor3,Lst_ColNameTitle,6)
	Table2.SetColumnsWidths(Array As Int(70dip,70dip,140dip,70dip,70dip,70dip))
End Sub

Sub CreatePage
	Try
		If shomareForoosh>0 Then
		Dim fldTedadJozForoosh As String=0
		Dim fldTedadKolForoosh As String=0
		Dim Item As AdapterListFaktor
		Dim cu2 As Cursor = MCode.Result("select * from  TblFaktor where fldShomareForoosh="&shomareForoosh &" and FldDate between "&DateAz & " and "& DateTa)
		For j=0 To cu2.RowCount-1
			cu2.Position=j
			Item.fldShomareForoosh=cu2.GetString("fldShomareForoosh")
			Item.fldC_Ashkhas=cu2.GetString("FldC_Tafzili")
			Item.FldAmani=cu2.GetString("FldAmani")
			Select cu2.GetString("FldType")
				Case "Foroosh"
					Item.fldShomareFaktor=cu2.GetString("FldShomareFaktor")
					Item.fldDate=MCode.PersianDateDash(cu2.GetString("FldDate"))
					Item.fldTotalFaktor=cu2.GetString("FldTotalFaktor")
					fldTedadJozForoosh=fldTedadJozForoosh+cu2.GetString("FldTedadDarSabadJoz")
					fldTedadKolForoosh=fldTedadKolForoosh+cu2.GetString("FldTedadDarSabadKol")
					
				Case "Marjoee"
					Item.FldShomareBargasht=cu2.GetString("FldShomareFaktor")
					Item.FldDateBargasht=MCode.PersianDateDash(cu2.GetString("FldDate"))
					Item.FldMablaghBargasht=MCode.SingleResult("Select distinct FldTotalFaktor from TblFaktor where FldType='"&cu2.GetString("FldType") & "' and FldDate between "&DateAz & " and "& DateTa & " and fldShomareForoosh="&shomareForoosh)
					Item.fldTedadJozMarjoee=MCode.SingleResult("Select sum(FldTedadDarSabadJoz) from TblFaktor where FldType='"&cu2.GetString("FldType") & "' and FldDate between "&DateAz & " and "& DateTa & "  and fldShomareForoosh="&shomareForoosh)
					Item.fldTedadCartonMarjoee=MCode.SingleResult("Select sum(FldTedadDarSabadKol) from TblFaktor where FldType='"&cu2.GetString("FldType") & "' and FldDate between "&DateAz & " and "& DateTa & "  and fldShomareForoosh="&shomareForoosh)						
					Item.fldTedadJozMande=fldTedadJozForoosh-Item.fldTedadJozMarjoee
					Item.fldTedadCartonMande=fldTedadKolForoosh-Item.fldTedadCartonMarjoee
					Item.fldMablaghMande=Item.fldTotalFaktor-Item.FldMablaghBargasht
			End Select
		Next
		Item.fldTedadJoz=fldTedadJozForoosh
		Item.fldTedadCarton=fldTedadKolForoosh
		LblShomareFaktor.Text = Item.fldShomareFaktor
		LblTotalFaktor.Text = NumberFormat(Item.fldTotalFaktor,1,3)
		LblDate.Text = Item.fldDate
		LblC_Ashkhas.Text = Item.fldC_Ashkhas
		lblShomareForoosh.Text=Item.fldShomareForoosh
		lblShomareBargashti.Text=IIf(myCode.Check_Is_Null(Item.FldShomareBargasht),"-",Item.FldShomareBargasht)
		lblDateBargashti.Text=IIf(myCode.Check_Is_Null(Item.FldDateBargasht),"-",Item.FldDateBargasht)
		lblTedadSefaresh.Text=myCode.ToInt(myCode.Is_Null_adad(Item.fldTedadJoz)) &"-"& myCode.ToInt(myCode.Is_Null_adad(Item.fldTedadCarton))
		lblTedadBargashti.Text=myCode.ToInt(myCode.Is_Null_adad(Item.fldTedadJozMarjoee)) &"-"& myCode.ToInt(myCode.Is_Null_adad(Item.fldTedadCartonMarjoee))
		lblTedadMande.Text=myCode.ToInt(myCode.Is_Null_adad(Item.fldTedadJozMande)) &"-"& myCode.ToInt(myCode.Is_Null_adad(Item.fldTedadCartonMande))
		lblMablaghMande.Text=IIf(myCode.Check_Is_Null(Item.fldMablaghMande),0,myCode.AdadToPrice(Item.fldMablaghMande))
		lblTotalBargashti.Text=IIf(myCode.Check_Is_Null(Item.FldMablaghBargasht),0,myCode.AdadToPrice(Item.FldMablaghBargasht))
		Dim Cu As Cursor= MCode.Result("Select fldSharheTafzili From TblAshkhas where FldCodeTafzili = '"& Item.fldC_Ashkhas &"'")
		If Cu.RowCount>0 Then
			Cu.Position=0
			LblN_Ashkhas.Text = Cu.GetString("fldSharheTafzili")
		Else
			LblN_Ashkhas.Text = "-"
			End If
		
		Else
			Dim Item2 As AdapterListFaktor
			Dim cu3 As Cursor = MCode.Result("select * from  TblFaktor where FldShomareFaktor="& shomareFaktor &"  And FldDate between "&DateAz & " And "& DateTa)
			If cu3.RowCount>0 Then
				For j=0 To cu3.RowCount-1
					cu3.Position=j				
					Item2.fldShomareForoosh=cu3.GetString("fldShomareForoosh")
					Item2.fldC_Ashkhas=cu3.GetString("FldC_Tafzili")
					Item2.FldAmani=cu3.GetString("FldAmani")
					Select cu3.GetString("FldType")
						Case "Foroosh"
							Item2.fldShomareFaktor=cu3.GetString("FldShomareFaktor")
							Item2.fldDate=MCode.PersianDateDash(cu3.GetString("FldDate"))
							Item2.fldTotalFaktor=cu3.GetString("FldTotalFaktor")
							Item2.fldTedadJoz=cu3.GetString("FldTedadDarSabadJoz")
							Item2.fldTedadCarton=cu3.GetString("FldTedadDarSabadKol")
					End Select
				
				Next
				
				LblShomareFaktor.Text = Item2.fldShomareFaktor
				LblTotalFaktor.Text = NumberFormat(Item2.fldTotalFaktor,1,3)
				LblDate.Text = Item2.fldDate
				LblC_Ashkhas.Text = Item2.fldC_Ashkhas
				lblShomareForoosh.Text=Item2.fldShomareForoosh
				lblShomareBargashti.Text=0'IIf(myCode.Check_Is_Null(Item2.FldShomareBargasht),"-",Item2.FldShomareBargasht)
				lblDateBargashti.Text=0'IIf(myCode.Check_Is_Null(Item2.FldDateBargasht),"-",Item2.FldDateBargasht)
				lblTedadSefaresh.Text=myCode.ToInt(myCode.Is_Null_adad(Item2.fldTedadJoz)) &"-"& myCode.ToInt(myCode.Is_Null_adad(Item2.fldTedadCarton))
				lblTedadBargashti.Text=0'myCode.ToInt(myCode.Is_Null_adad(Item2.fldTedadJozMarjoee)) &"-"& myCode.ToInt(myCode.Is_Null_adad(Item2.fldTedadCartonMarjoee))
				lblTedadMande.Text=0'myCode.ToInt(myCode.Is_Null_adad(Item2.fldTedadJozMande)) &"-"& myCode.ToInt(myCode.Is_Null_adad(Item2.fldTedadCartonMande))
				lblMablaghMande.Text=0'IIf(myCode.Check_Is_Null(Item2.fldMablaghMande),0,myCode.AdadToPrice(Item2.fldMablaghMande))
				lblTotalBargashti.Text=0'IIf(myCode.Check_Is_Null(Item2.FldMablaghBargasht),0,myCode.AdadToPrice(Item2.FldMablaghBargasht))
					
			End If
		End If
		LoadData
	Catch
		Log(LastException)
	End Try
End Sub

Public Sub LoadData
	Try	
'		ListFaktor1.Clear
'		If shomareForoosh>0 Then		
'		Dim cu2 As Cursor = MCode.Result("select * from  TblFaktor where fldShomareForoosh="&shomareForoosh &" and FldDate between "&DateAz & " and "& DateTa)
'		For j=0 To cu2.RowCount-1
'			cu2.Position=j
'			Dim Item As AdapterListRizeFaktor
'			Item.FldRadif=j+1
'			Item.fldShomareFaktor=cu2.GetString("FldShomareFaktor")
'			Item.fldCodeKala=cu2.GetString("FldCodeKala")
'			Item.fldSharhKala=cu2.GetString("FldNamekala")
'			Item.fldTotalFaktor=cu2.GetString("FldTotalFaktor")
'			Item.fldTedadJoz=cu2.GetString("FldTedadDarSabadJoz")
'			Item.fldTedadCarton=cu2.GetString("FldTedadDarSabadKol")
'			Select cu2.GetString("FldType")
'				Case "Foroosh"
'					Item.FldType="فروش"
'				Case "Marjoee"
'					Item.FldType="مرجوعی"
'			End Select
'				ListFaktor1.Add(Item)
'			Next
'		End If
'		Grid1
'		Grid2



		ListFaktor1.Clear
		ListFaktor2.Clear

			Dim cu2 As Cursor = MCode.Result("select * from  TblFaktor where  fldShomareForoosh="&shomareForoosh &" and FldDate between "&DateAz & " and "& DateTa)
			For j=0 To cu2.RowCount-1
				cu2.Position=j
				Dim Item As AdapterListRizeFaktor
				Item.FldRadif=j+1
				Item.fldShomareFaktor=cu2.GetString("FldShomareFaktor")
				Item.fldCodeKala=cu2.GetString("FldCodeKala")
				Item.fldSharhKala=cu2.GetString("FldNamekala")
				Item.fldTotalFaktor=cu2.GetString("FldTotalFaktor")
				Item.fldTedadJoz=cu2.GetString("FldTedadDarSabadJoz")
				Item.fldTedadCarton=cu2.GetString("FldTedadDarSabadKol")
				Select cu2.GetString("FldType")
					Case "Foroosh"
						Item.FldType="فروش"
						ListFaktor1.Add(Item)
					Case "Marjoee"
						Item.FldType="مرجوعی"
						ListFaktor2.Add(Item)					
				End Select
				
			Next
			ListFaktor3.Clear
			Dim c As Int=0
			For i=0 To ListFaktor1.Size-1
				Dim Item2 As AdapterListRizeFaktor
				Dim ItemForoosh  = ListFaktor1.Get(i) As AdapterListRizeFaktor
				Dim TedadJoz As String=0
				Dim TedadCarton As String=0
				Dim TotalFaktor As String=0				
				For j=0 To ListFaktor2.Size-1
				Dim  ItemBargasht = ListFaktor2.Get(j) As AdapterListRizeFaktor 
					If ItemForoosh.fldCodeKala=ItemBargasht.fldCodeKala Then						
					TedadJoz=TedadJoz+ItemBargasht.fldTedadJoz
					TedadCarton=TedadCarton+ItemBargasht.fldTedadCarton
					TotalFaktor=TotalFaktor+ItemBargasht.fldTotalFaktor
					End If				
				Next
			c=c+1
			Item2.FldRadif=c
			Item2.fldCodeKala=ItemForoosh.fldCodeKala
			Item2.fldSharhKala=ItemForoosh.fldSharhKala
			Item2.fldTedadJoz=ItemForoosh.fldTedadJoz-TedadJoz
			Item2.fldTedadCarton=ItemForoosh.fldTedadCarton-TedadCarton
			Item2.fldTotalFaktor=ItemForoosh.fldTotalFaktor-TotalFaktor
			ListFaktor3.Add(Item2)
				
		Next
				
		ListFaktor1.Clear
		ListFaktor2.Clear
			Dim cu2 As Cursor = MCode.Result("select * from  TblFaktor where  fldShomareForoosh="&shomareForoosh &" and FldDate between "&DateAz & " and "& DateTa)
			For j=0 To cu2.RowCount-1
				cu2.Position=j
				Dim Item As AdapterListRizeFaktor
				Item.FldRadif=j+1
				Item.fldShomareFaktor=cu2.GetString("FldShomareFaktor")
				Item.fldCodeKala=cu2.GetString("FldCodeKala")
				Item.fldSharhKala=cu2.GetString("FldNamekala")
				Item.fldTotalFaktor=cu2.GetString("FldTotalFaktor")
				Item.fldTedadJoz=cu2.GetString("FldTedadDarSabadJoz")
				Item.fldTedadCarton=cu2.GetString("FldTedadDarSabadKol")
				Select cu2.GetString("FldType")
					Case "Foroosh"
						Item.FldType="فروش"
						
					Case "Marjoee"
						Item.FldType="مرجوعی"
					
				End Select
			ListFaktor1.Add(Item)
			Next
	
		Grid1
		Grid2
		'HLV.notifyDataSetChanged
	Catch
		Log(LastException)
	End Try
End Sub

'Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
'	Return ListFaktor.Size
'End Sub
'
'Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
'	Dim rec As cls_rec_rizbargasht
'	rec.Initialize(Me)
'	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
'	Parent.Tag=rec
'End Sub
'
'Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
'	Dim Item = ListFaktor.Get(Position) As AdapterListRizeFaktor
'	Dim rec As cls_rec_rizbargasht=Parent.Tag
'	rec.Show(Item)
'	Parent.Height=rec.Height
'End Sub

Sub Activity_Resume
'	HLV.notifyDataSetChanged
End Sub

Sub LblBack_Click
	Activity.Finish
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


