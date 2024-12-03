﻿B4A=true
Group=Report
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals

End Sub

Sub Globals
	Private XUI As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	Private SearchTemplate As B4XSearchTemplate
	
'	Dim Table1 As Table
	Private PnlGrid As Panel
	Private Panel1 As Panel
	Private BtnAz As Button
	Private BtnTa As Button
	Dim DateAz,DateTa As String
	Dim LstReport As List
	Dim TitleReport(3) As Long

	Private Btn_SelVisitor As Button
	
	Dim HLV As Hitex_LayoutView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("l_repfactorvisitor")
	LstReport.Initialize
	Base = Activity
	Dialog.Initialize (Panel1)
	Dialog.Title = "جستجو"
	SearchTemplate.Initialize
	MCode.page="Act_RepFactorVisitor"
	MCode.NoeGet="GetVisitor"
	StartService(Service_Server)
	MCode.CodeVisitorSelect=0
End Sub

Public Sub LoadData
	MCode.page="Act_RepFactorVisitor"
	Dim Items As List
	Items.Initialize
	Dim Cu As Cursor = MCode.Result("Select * From TblVisitor ")
	For i=0 To Cu.RowCount-1
		Cu.Position=i
		Dim Name As String =  Cu.GetString("FldN_Visitor")
		Items.Add(Name)
	Next
	SearchTemplate.SetItems(Items)
	SearchTemplate.GetPanel(Dialog).BringToFront
	
	HLV.Initializer("HLV").ListView.Build
	PnlGrid.AddView(HLV,0,0,PnlGrid.Width,PnlGrid.Height)
End Sub

Sub CreateGrid
'	Table1.Initialize(Me, "Table1",9)
'	Table1.AddToActivity(PnlGrid, 0,0,100%x,PnlGrid.Height)
'	
'	Dim Lst_ColNameTitle As List
'	Lst_ColNameTitle.Initialize
'	Lst_ColNameTitle.AddAll(Array As String("مانده","مبلغ بستانکاری","مبلغ بدهکاری","تاریخ","ریز.سند","شرح","ش.سند","ش","ردیف"))
'
''	Dim Lng(3) As Long
'	'Table1.LoadSListSoorathesab(LstReport,Lst_ColNameTitle,9)
'	Table1.SetColumnsWidths(Array As Int(22%x, 22%x,22%x,22%x,22%x,33%x,14%x,14%x,14%x))
'	Table1.SetHeader(Array As String("مانده","مبلغ بستانکاری","مبلغ بدهکاری","تاریخ","ریز.سند","شرح","ش.سند","ش","ردیف"),Array As Int(22%x, 22%x,22%x,22%x,22%x,33%x,14%x,14%x,14%x))
'	
'	LblSumBedehkar.Text = NumberFormat(TitleReport(0),1,3) & " ریال "
'	LblSumBestankar.Text = NumberFormat(TitleReport(1),1,3) & " ریال "
'	LblSumMande.Text = NumberFormat(TitleReport(2),1,3) & " ریال "
	


End Sub

Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '# onCreate #'
	Dim rec As Cls_Rec_FactorVisitor
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub

Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '* onBind *'
	Dim Item = LstReport.Get(Position) As AdapteRepFactorVisitor
	Dim rec As Cls_Rec_FactorVisitor=Parent.Tag
	rec.Show(Item)
	Parent.Height=rec.Height
End Sub

Sub HLV_GetItemCount As Int 								        '$ ItemCount $'
	Return LstReport.Size
End Sub

Sub Activity_Resume
BtnReport_Click
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Activity.Finish
	Else
		Return True
	End If
	Return True
End Sub

Sub BtnReport_Click
	If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(BtnTa.Tag) = 8 Then
		ProgressDialogShow2("در حال دریافت اطلاعات . . .",False)
		
		CallSubDelayed3(Service_Server,"GetReportFactorVisitor",MCode.ConvertNumbersPersian2English(DateAz),MCode.ConvertNumbersPersian2English(DateTa))
	Else
		ToastMessageShow("تاریخ را به طور صحیح وارد نمایید",True)
	End If
End Sub

Sub CreateList(Lst As List)
	LstReport.Clear
	TitleReport(0) = 0
	TitleReport(1) = 0
	TitleReport(2) = 0
	
	For Each coljRoot As Map In Lst
		Dim Item As AdapteRepFactorVisitor
		Item.fldShomareFactor =  coljRoot.Get("fldShomareFactor")
		Item.fldCodeVasete = coljRoot.Get("fldCodeVasete")
		Item.FldN_Visitor =coljRoot.Get("FldN_Visitor")
		Item.fldDate =coljRoot.Get("fldDate")
		Item.fldTime =coljRoot.Get("fldTime")
'		If coljRoot.Get("fldFeeJoz")>0 Then
'			Item.fldFeeJoz =MCode.qomaAshar(coljRoot.Get("fldFeeJoz"))
'			Else				
'			Item.fldFeeJoz =0
'		End If
'		
'		Dim	TedadJoz As Int=coljRoot.Get("fldTedadJoz")
'		Item.fldTedadJoz =TedadJoz
	
		
'		Item.fldTedadCarton =coljRoot.Get("fldTedadCarton")
		If coljRoot.Get("fldNahveTasvie")<>"0" Then
			Item.fldNahveTasvie=MCode.GetNahvieTasfie(coljRoot.Get("fldNahveTasvie"))
		Else
			Item.fldNahveTasvie="نامشخص"
		End If
'		Item.fldNahveTasvie =MCode.GetNahvieTasfie(coljRoot.Get("fldNahveTasvie"))
		Item.fldCodeTafsili =coljRoot.Get("fldCodeTafsili")
		Item.fldSharheTafzili =coljRoot.Get("fldSharheTafzili")
		Item.fldTozihat =coljRoot.Get("fldTozihat")
		
'		If coljRoot.Get("SumFee")>0 Then
'			Item.SumFee =MCode.qomaAshar(coljRoot.Get("SumFee"))
'		Else
'			Item.SumFee =0
'		End If
		Item.fldShomareFactorReal =coljRoot.Get("fldShomareFactorReal")
	
		
		LstReport.Add(Item)
'		
'	
'		If myCode.Is_Null(coljRoot.Get("fldBedehkar"))<>"" Then
'			Item.fldBedehkar =myCode.Is_Null(coljRoot.Get("fldBedehkar"))
'			Log(coljRoot.Get("fldBedehkar"))
'			TitleReport(0) = TitleReport(0) + coljRoot.Get("fldBedehkar")
'		End If
'		If myCode.Is_Null(coljRoot.Get("fldBestankar"))<>"" Then
'			Item.fldBestankar =myCode.Is_Null(coljRoot.Get("fldBestankar"))
'			Log(coljRoot.Get("fldBestankar"))
'			TitleReport(1) = TitleReport(1) + coljRoot.Get("fldBestankar")
'		End If
'		If myCode.Is_Null(coljRoot.Get("fldMande"))<>"" Then
'			Item.fldMande =myCode.Is_Null(coljRoot.Get("fldMande"))
'			Log(coljRoot.Get("fldMande"))
'			TitleReport(2) = TitleReport(2) + coljRoot.Get("fldMande")
'		End If
		
	Next

	LstReport.SortType("fldShomareFactor",False)

	HLV.Show
	'CreateGrid
End Sub

Sub BtnAz_Click
	Dim p As PersianMaterialDatePicker
	p.Initialize("p",p.PersianYear,p.PersianMonth,p.PersianDay)
	p.AccentColor = Colors.RGB(83,99,255)
	p.OkText = "تایید"
	p.CancelText = "لغو"
	p.Title = "از تاریخ"
	p.Typeface = "iransansmobile(fanum)_bold.ttf"
	p.Show("p")
End Sub
Sub p_onDateSet(year As Int,month As Int,day As Int)
	Log(year&"/"&month&"/"&day)
	BtnAz.Text=year&"/"&NumberFormat(month,2,0)&"/"&NumberFormat(day,2,0)
	BtnAz.Tag =year&NumberFormat(day,2,0)&NumberFormat(month,2,0)
'	DateAz=MPD.PersianToGregorian(year,month,day)
'	DateAz=DateAz.Replace("/","-") & " " & DateTime.Time(DateTime.Now) & ".000"
'	DateAz=NumberFormat(day,2,0)&"/"&NumberFormat(month,2,0)&"/"&year
	DateAz=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
	LogColor(DateAz,Colors.Magenta)
End Sub

Sub BtnTa_Click
	Dim p1 As PersianMaterialDatePicker
	p1.Initialize("p1",p1.PersianYear,p1.PersianMonth,p1.PersianDay)
	p1.AccentColor = Colors.RGB(83,99,255)
	p1.OkText = "تایید"
	p1.CancelText = "لغو"
	p1.Title = "تا تاریخ"
	p1.Typeface = "iransansmobile(fanum)_bold.ttf"
	p1.Show("p1")
End Sub
Sub p1_onDateSet(year As Int,month As Int,day As Int)
	Log(year&"/"&month&"/"&day)
	BtnTa.Text=year&"/"&NumberFormat(month,2,0)&"/"&NumberFormat(day,2,0)
	BtnTa.Tag=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
'	DateTa= MPD.PersianToGregorian(year,month,day)
'	DateTa=DateTa.Replace("/","-") & " " & DateTime.Time(DateTime.Now) & ".000"
'	DateTa=NumberFormat(day,2,0)&"/"&NumberFormat(month,2,0)&"/"&year
	DateTa=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
	LogColor(DateTa,Colors.Magenta)
End Sub
Sub p1_onCancel
	Log("cancel")
End Sub
Sub p1_onDismiss
	Log("dismiss")
End Sub

Sub LblBack_Click
	Activity.Finish
End Sub

Sub Img_Sort_Click
	Dim Lst As List = Array As String("مبلغ کم به زیاد","مبلغ زیاد به کم")
	Dim res As Int = InputList(Lst,"مرتب سازی براساس:",-1)
	Select Case res
		Case 0
			LstReport.SortType("fldFeeJoz",False)
		Case 1
			LstReport.SortType("fldFeeJoz",True)
	End Select
	ProgressDialogShow("لطفا چند لحظه صبر کنید")
	CreateGrid
End Sub
Sub Btn_SelVisitor_Click
'	Btn_show.Visible=False
'	Btn_Forosh.Visible=False
	Panel1.BringToFront
	Panel1.Visible=True
	SearchTemplate.SearchField.HintText="نام ویزیتور"
	SearchTemplate.SearchField.lblClear.Text=""
	SearchTemplate.SearchField.lblV.Text=""
	SearchTemplate.SearchField.Update
	Dim rs As Object = Dialog.ShowTemplate(SearchTemplate, "", "", "انصراف")
	AnimateDialog(Dialog, "right")
	Wait For (rs) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		Btn_SelVisitor.Text = SearchTemplate.SelectedItem
		Dim Cu As Cursor = MCode.Result("Select * From TblVisitor where FldN_Visitor='"&Btn_SelVisitor.Text&"'")
		Cu.Position=0
		MCode.CodeVisitorSelect =  Cu.GetString("FldC_Visitor")
		Log("کد ویزیتور : "&Cu.GetString("FldC_Visitor"))
	Else
		Btn_SelVisitor.Text = "انتخاب ویزیتور"
		MCode.CodeVisitorSelect=0
	End If
	Panel1.Visible=False
End Sub
Sub AnimateDialog (dlg As B4XDialog, FromEdge As String)
	Dim Base As B4XView = dlg.Base
	Dim top As Int = Base.Top
	Dim left As Int = Base.Left
	Select FromEdge.ToLowerCase
		Case "bottom"
			Base.Top = Base.Parent.Height
		Case "top"
			Base.Top = -Base.Height
		Case "left"
			Base.Left = -Base.Width
		Case "right"
			Base.Left = Base.Parent.Width
	End Select
	Base.SetLayoutAnimated(300, left, top, Base.Width, Base.Height)
End Sub
Sub Img_Chart_Click
'	Act_Chart.LstChart = LstReport
'	StartActivity(Act_Chart)
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub