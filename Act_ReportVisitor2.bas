B4A=true
Group=Report
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals

End Sub

Sub Globals
	Dim Table1 As Table
	Private PnlGrid As Panel
	Private LblTedadFaktor As Label
	Private LblSumFaktor As Label
	Private LblPoorsant As Label
	Private BtnAz As Button
	Private BtnTa As Button
	Dim DateAz,DateTa As String
	Dim LstReport As List
	Dim TitleReport(3) As Long
	Private Img_Chart As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_ReportVisitor2")
	LstReport.Initialize
End Sub

Sub CreateGrid
	Table1.Initialize(Me, "Table1",6)
	Table1.AddToActivity(PnlGrid, 0,0,100%x,PnlGrid.Height)
	
	Dim Lst_ColNameTitle As List
	Lst_ColNameTitle.Initialize
	Lst_ColNameTitle.AddAll(Array As String("مبلغ","ت.فاکتور","ت.کل","ت.کارتن","ت.جزء","نام کالا"))

'	Dim Lng(3) As Long
	Table1.LoadSListVisitor(LstReport,Lst_ColNameTitle,6)
	Table1.SetColumnsWidths(Array As Int(25%x, 14%x,14%x,14%x,14%x,33%x))
	Table1.SetHeader(Array As String("مبلغ","ت.فاکتور","ت.کل","ت.کارتن","ت.جزء","نام کالا"),Array As Int(25%x, 14%x,14%x,14%x,14%x,33%x))
	
	LblTedadFaktor.Text = TitleReport(0)
	LblSumFaktor.Text = NumberFormat(TitleReport(1),1,3) & " ریال "
	LblPoorsant.Text = NumberFormat(TitleReport(2),1,3) & " ریال "
	
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub BtnReport_Click
	If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(BtnTa.Tag) = 8 Then
		ProgressDialogShow2("در حال دریافت اطلاعات . . .",False)
		Dim M As Map
		M.Initialize
		M.Put("Imei" , MCode.DeviceId)
		M.Put("CodeVisitor",MCode.C_Visitor)
		M.Put("DateAz",MCode.ConvertNumbersPersian2English(DateAz))
		M.Put("DateTa",MCode.ConvertNumbersPersian2English(DateTa))
		
		ProgressDialogShow2("لطفا صبر کنید . . .",False)
		CallSubDelayed3(Service_Server,"GetReportVisitor",MCode.ConvertNumbersPersian2English(DateAz),MCode.ConvertNumbersPersian2English(DateTa))
	Else
		ToastMessageShow("تاریخ را به طور صحیح وارد نمایید",True)
	End If
End Sub

Sub CreateList(Lst As List)
	LstReport.Clear
	TitleReport(0) = 0
	TitleReport(1) =0
	For Each coljRoot As Map In Lst
		Dim Item As AdapterReportVisitor
		Item.fldSharhKala = coljRoot.Get("fldSharhKala")
		Item.fldTedadJoz = coljRoot.Get("fldTedadJoz")
		Item.fldTedadCarton = coljRoot.Get("fldTedadCarton")
		Item.fldTedadKol = coljRoot.Get("fldTedadKol")
		Item.fldCount = coljRoot.Get("fldCount")
		Item.fldFeeJoz = coljRoot.Get("fldFeeJoz")
		
		LstReport.Add(Item)
		
		TitleReport(0) = TitleReport(0) + coljRoot.Get("fldCount")
		TitleReport(1) = TitleReport(1) + coljRoot.Get("fldFeeJoz")
		'TitleReport(2) = coljRoot.Get("visitorPorsant")
	Next
	CreateGrid
End Sub

Sub BtnAz_Click
	Dim p As PersianMaterialDatePicker
	p.Initialize("p",p.PersianYear,p.PersianMonth,p.PersianDay)
	p.AccentColor = Colors.RGB(83,99,255)
	p.OkText = "تایید"
	p.CancelText = "لغو"
	p.Title = "از تاریخ"
	p.Typeface = "iransansmonospacednum.ttf"
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
Sub p_onCancel
	Log("cancel")
End Sub
Sub p_onDismiss
	Log("dismiss")
End Sub
Sub BtnTa_Click
	Dim p1 As PersianMaterialDatePicker
	p1.Initialize("p1",p1.PersianYear,p1.PersianMonth,p1.PersianDay)
	p1.AccentColor = Colors.RGB(83,99,255)
	p1.OkText = "تایید"
	p1.CancelText = "لغو"
	p1.Title = "تا تاریخ"
	p1.Typeface = "iransansmonospacednum.ttf"
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

Sub Img_Chart_Click
'	Act_Chart.LstChart = LstReport
'	StartActivity(Act_Chart)
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub