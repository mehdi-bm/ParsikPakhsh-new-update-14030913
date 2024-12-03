B4A=true
Group=Report
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#IgnoreWarnings:34
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim Gps As GPS
	Dim DateAz,DateTa As String
	Dim CodeMoshtari As String
	Dim TotalFactor As String
	
End Sub

Sub Globals
	Dim HLV As Hitex_LayoutView
	Private LblName As Label
	Private ListFaktor As List
	Private PnlTop As Panel
	Private pnl_HLV As Panel
	Private Label1 As Label
	Private Label2 As Label
	Private Label4 As Label
	Private LblBack As Button
	Private LblNameS As Label
	Private LblVaziatS As Label
	Private LblSumForoosh As Label
	Private LblSumSefaresh As Label
	Private LblSumBargasht As Label
	Private LblSumKhales As Label
	Private CmbVaziat As B4XComboBox
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_RepProfile")
	HLV.Initializer("HLV").ListView.Build
	pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Height)
	ListFaktor.Initialize
	Gps.Initialize("Gps")
	HLV.Ripple.Color(0xFF909090)
'	HLV.CardView.CardElevation(8dip).Radius(8dip)
	HLV.Show
	CmbVaziat.cmbBox.Add("همه سفارشات")
	CmbVaziat.cmbBox.Add("سفارشات ارسال نشده")
	CmbVaziat.cmbBox.Add("سفارشات ارسال شده")
	CmbVaziat.cmbBox.Add("فاکتورهای فروش رفته")
	CmbVaziat.cmbBox.Add("فاکتورهای فروش نرفته")
	CmbVaziat.cmbBox.Add("فاکتورهای مرجوع شده")
	CmbVaziat.cmbBox.Add("فاکتورهای امانی شده")
	
	CmbVaziat.SelectedIndex=0
	LoadData
'	CreatePage
End Sub


Sub LoadData
	Dim FilterVaziat As String=""
	Dim SumForoosh As String=0
	Dim SumSefaresh As String=0
	Dim SumBargasht As String=0
	Dim SumKhales As String=0
	
	Select CmbVaziat.SelectedIndex
		Case 0
			FilterVaziat=""
		Case 1
			FilterVaziat=" And FldSync='False'"
		Case 2
			FilterVaziat=" And FldSync='True'"
		Case 3
			FilterVaziat=" And fldShomareForoosh>0 and FldType='Foroosh'"
		Case 4
			FilterVaziat=" And fldShomareForoosh=0 and FldType='Foroosh'"
		Case 5
			FilterVaziat=" And FldType='Marjoee'"
		Case 6
			FilterVaziat=" And FldAmani='1'"
	End Select
	
	ListFaktor.Clear
	Dim TFsum As Long=0
	If CodeMoshtari=0 Then
		Dim cu1 As Cursor=MCode.Result("select distinct fldShomareForoosh from  TblFaktor where fldShomareForoosh>0   and FldDate between "&DateAz & " and "& DateTa &" "&FilterVaziat)
	Else
		Dim cu1 As Cursor=MCode.Result("select distinct fldShomareForoosh from  TblFaktor where fldShomareForoosh>0 and FldC_Tafzili="& CodeMoshtari &"   and FldDate between "&DateAz & " and "& DateTa &" "&FilterVaziat)
	End If
	If cu1.RowCount>0 Then
		For i=0 To cu1.RowCount-1
			Dim c As Int=0
			cu1.Position=i
			Dim fldTedadJozForoosh As String=0
			Dim fldTedadKolForoosh As String=0
			Dim Item As AdapterListFaktor
			Log(cu1.GetString("fldShomareForoosh"))
			Dim cu2 As Cursor = MCode.Result("select * from  TblFaktor where fldShomareForoosh="&cu1.GetString("fldShomareForoosh") &"  And FldDate between "&DateAz & " And "& DateTa &" "&FilterVaziat)
			If cu2.RowCount>0 Then
				For j=0 To cu2.RowCount-1
					cu2.Position=j
				
							
					Item.fldC_Ashkhas=cu2.GetString("FldC_Tafzili")
					Item.FldAmani=myCode.Is_Null_adad(cu2.GetString("FldAmani"))
					Item.fldDate=MCode.PersianDateDash(cu2.GetString("FldDate"))
					Item.FldType=cu2.GetString("FldType")
					Item.fldShomareForoosh=cu2.GetString("fldShomareForoosh")
					Item.fldTotalFaktor=cu2.GetString("FldTotalFaktor")
					If cu2.Getstring("FldSync")="True" Then
						Item.synced=True
					Else
						Item.synced=False
					End If
					Select cu2.GetString("FldType")
						Case "Foroosh"
							Item.fldShomareFaktor=cu2.GetString("FldShomareFaktor")
						
							fldTedadJozForoosh=fldTedadJozForoosh+cu2.GetString("FldTedadDarSabadJoz")
							fldTedadKolForoosh=fldTedadKolForoosh+cu2.GetString("FldTedadDarSabadKol")
				
							
			
						
						Case "Marjoee"
							Item.FldShomareBargasht=cu2.GetString("FldShomareBargasht")
							Item.fldShomareFaktor=cu2.GetString("FldShomareFaktor")
							Item.FldDateBargasht=MCode.PersianDateDash(cu2.GetString("FldDate"))
							Item.FldMablaghBargasht=MCode.SingleResult("Select distinct FldTotalFaktor from TblFaktor where FldType='"&cu2.GetString("FldType") & "' and FldDate between "&DateAz & " and "& DateTa & " and fldShomareForoosh="&cu2.GetString("fldShomareForoosh") &" "&FilterVaziat)
							Item.fldTedadJozMarjoee=MCode.SingleResult("Select sum(FldTedadDarSabadJoz) from TblFaktor where FldType='"&cu2.GetString("FldType") & "' and FldDate between "&DateAz & " and "& DateTa & "  and fldShomareForoosh="&cu2.GetString("fldShomareForoosh") &" "&FilterVaziat)
							Item.fldTedadCartonMarjoee=MCode.SingleResult("Select sum(FldTedadDarSabadKol) from TblFaktor where FldType='"&cu2.GetString("FldType") & "' and FldDate between "&DateAz & " and "& DateTa & "  and fldShomareForoosh="&cu2.GetString("fldShomareForoosh") &" "&FilterVaziat)
						
							Item.fldTedadJozMande=fldTedadJozForoosh-Item.fldTedadJozMarjoee
							Item.fldTedadCartonMande=fldTedadKolForoosh-Item.fldTedadCartonMarjoee
							Item.fldMablaghMande=myCode.Is_Null_adad(Item.fldTotalFaktor)-Item.FldMablaghBargasht
							
					End Select
					
				Next
				If Item.FldType="Foroosh" Then
					'foroosh
					SumForoosh=SumForoosh + myCode.Is_Null_adad(Item.FldTotalFaktor)
				else If Item.FldType="Marjoee" Then
					SumBargasht=SumBargasht +myCode.Is_Null_adad(Item.FldTotalFaktor)
				End If
				SumKhales =SumKhales + (SumForoosh-SumBargasht)
				Item.fldTedadJoz=fldTedadJozForoosh
				Item.fldTedadCarton=fldTedadKolForoosh
				ListFaktor.Add(Item)
			End If
		
			
		Next
	End If
	
	If CodeMoshtari=0 Then
		Dim cu1 As Cursor=MCode.Result("select distinct FldShomareFaktor from  TblFaktor where fldShomareForoosh=0 and FldType='Foroosh'  and FldDate between "&DateAz & " and "& DateTa &" "&FilterVaziat)
	Else
		Dim cu1 As Cursor=MCode.Result("select distinct FldShomareFaktor from  TblFaktor where fldShomareForoosh=0 and FldC_Tafzili="& CodeMoshtari &" and FldType='Foroosh'  and FldDate between "&DateAz & " and "& DateTa &" "&FilterVaziat)
	End If
	If cu1.RowCount>0 Then
	
		
		For i=0 To cu1.RowCount-1
			cu1.Position=i
			Dim fldTedadJozSefaresh  As String=0
			Dim fldTedadKolSefaresh As String=0
			Log(cu1.GetString("FldShomareFaktor"))
			Dim cu3 As Cursor = MCode.Result("select * from  TblFaktor where fldShomareForoosh=0 and FldShomareFaktor="& cu1.GetString("FldShomareFaktor") &"  And FldDate between "&DateAz & " And "& DateTa &" "&FilterVaziat)
			If cu3.RowCount>0 Then
				For j=0 To cu3.RowCount-1
					cu3.Position=j
					Dim Item2 As AdapterListFaktor
					Item2.fldShomareForoosh=cu3.GetString("fldShomareForoosh")
					Item2.fldC_Ashkhas=cu3.GetString("FldC_Tafzili")
					Item2.FldAmani=myCode.Is_Null_adad(cu3.GetString("FldAmani"))
					Item2.fldShomareFaktor=cu3.GetString("FldShomareFaktor")
					Item2.fldDate=MCode.PersianDateDash(cu3.GetString("FldDate"))
					Item2.fldTotalFaktor=cu3.GetString("FldTotalFaktor")
					If cu3.Getstring("FldSync")="True" Then
						Item2.synced=True
					Else
						Item2.synced=False
					End If
					'Item2.FldType=IIf(myCode.Check_Is_Null(cu2.GetString("FldType"),"Foroosh",)
					fldTedadJozSefaresh=fldTedadJozSefaresh+cu3.GetString("FldTedadDarSabadJoz")
					fldTedadKolSefaresh=fldTedadKolSefaresh+cu3.GetString("FldTedadDarSabadKol")
					
					
				Next
				'sefaresh
				SumSefaresh=SumSefaresh + myCode.Is_Null_adad(Item2.FldTotalFaktor)
				Item2.fldTedadJoz=fldTedadJozSefaresh
				Item2.fldTedadCarton=fldTedadKolSefaresh
				ListFaktor.Add(Item2)
				
		
			End If
		Next
	End If
	

	
	LblSumForoosh.Text=myCode.AdadToPrice(SumForoosh)
	LblSumSefaresh.Text=myCode.AdadToPrice(SumSefaresh)
	LblSumBargasht.Text=myCode.AdadToPrice(SumBargasht)
	LblSumKhales.Text=myCode.AdadToPrice(SumKhales)
	LblName.Text = ListFaktor.Size & " عدد"
	HLV.notifyDataSetChanged
	
End Sub

Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return ListFaktor.Size
End Sub

Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As Cls_Rec_Factor
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub

Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim Item = ListFaktor.Get(Position) As AdapterListFaktor
	Dim rec As Cls_Rec_Factor=Parent.Tag
	rec.Show(Item,DateAz,DateTa)
	Parent.Height=rec.Height
End Sub

Sub Activity_Resume
	HLV.notifyDataSetChanged
End Sub

Sub BtnListProfile_Click
'	StartActivity(Act_Check)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub LblBack_Click
	Activity.Finish
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

Private Sub CmbVaziat_SelectedIndexChanged (Index As Int)
	Log(Index)
	LoadData
End Sub