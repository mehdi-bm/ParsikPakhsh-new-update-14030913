B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region
#Extends: android.support.v7.app.AppCompatActivity
Sub Process_Globals
	Dim SQL1 As SQL
End Sub

Sub Globals
	Dim jobInternet As HttpJob
	Dim Table1 As Table
	Dim DateAz,DateTa As String
	Private Picker As Hitex_PersianDatePicker
	Private LblMablaghKol As Label
	Private TxtAz As EditText
	Private TxtTa As EditText
	Private BtnGet As Button
	Dim Obj As Object
	Dim Key As IME
	Dim Query As String
	Dim DateFilter As String
	Dim datetempA,datetempB As Long
	Private chkAll As ACCheckBox
	Dim q As Object
	Private lblNameShakhs As Label
	Dim code,name As String
	Dim SumBedhi As Long
	
	Private btnAshkhas As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("l_FaktorTasfieNashode")
	If	chkAll.Checked=True Then
		TxtAz.Enabled=False
		TxtTa.Enabled=False
		btnAshkhas.Enabled=False
		lblNameShakhs.Text="همه ی اشخاص"
	End If
	
	If Not(SQL1.IsInitialized) Then SQL1.Initialize(File.DirRootExternal &"/Zomorod","zomorod_db.db",False)
	Table1.Initialize(Me, "Table1",7)
	Table1.HeaderColor=Colors.RGB(0,137,123)
	Table1.TableColor=Colors.RGB(0,137,123)
	Table1.AddToActivity(Activity, 0,22%y,100%x,59%y)
	'Query = "select FldCodeTafzili,FldSharheTafzili,FldShomareFactor,FldMandeTalab,FldMablagheKolDaryafti,FldMandeTasfieNashode,FldDateSarResid from TblSooratHesab where fldMablagheKolDaryafti=0"
	Query = "select FldDateSarResid,FldMandeTasfieNashode,FldMablagheKolDaryafti,FldMandeTalab,FldShomareFactor,FldSharheTafzili,FldCodeTafzili from TblSooratHesab where fldMablagheKolDaryafti=0 and TblSooratHesab.FldCodeTafzili in (select FldCodeTafzili from TblAshkhas)"
	q=MCode.SingleResult("select sum(FldMandeTasfieNashode) from TblSooratHesab where fldMablagheKolDaryafti=0 and TblSooratHesab.FldCodeTafzili in (select fldCodetafzili from TblAshkhas)")
	If IsNumber(q) Then
		SumBedhi=q
		Else
		SumBedhi=0
	End If
	
	Grid

End Sub
Sub Grid
	
	Table1.LoadSQLiteDB(File.DirRootExternal &"/Zomorod","zomorod_db.db",SQL1, Query)
	Table1.SetColumnsWidths(Array As Int(100dip, 80dip,50dip,80dip,50dip,100dip,200dip))
	'Table1.SetColumnsWidths(Array As Int( 200dip, 100dip,50dip,80dip,50dip,80dip,100dip))
	'Table1.SetHeader(Array As String("کد شخص","نام شخص","شماره فاکتور","مبلغ طلب","مبلغ کل دریافتی","مانده تسویه نشده","تاریخ سررسید"),Array As Int( 200dip, 100dip,50dip,80dip,50dip,80dip,100dip))
	Table1.SetHeader(Array As String("تاریخ سررسید","مانده تسویه نشده","مبلغ کل دریافتی","مبلغ طلب","شماره فاکتور","نام شخص","کد شخص"),Array As Int(100dip, 80dip,50dip,80dip,50dip,100dip,200dip))


	
		LblMablaghKol.Text=SumBedhi
	LblMablaghKol.Text=MCode.qomaAshar(LblMablaghKol.Text)
	
	
	


	
End Sub


Sub DatePicker
	Picker.Initialize("Picker") _
	.setTypeFace(Typeface.LoadFromAssets("iransans_light.ttf")) _
	.TodayButton("امروز") _
	.TodayButtonVisible(True) _
	.MinYear(1300) _
	.MaxYear(1400) _
	.setActionTextColor(0xFF1F2DC9) _
	.Show
End Sub
Sub Picker_onDateSelected (Calendar As Hitex_PersianCalendar)
	Dim Month,Day As String
	
	If MCode.sf.len(Calendar.PersianMonth) = 2 Then
		Month = Calendar.PersianMonth
	Else
		Month = "0" & Calendar.PersianMonth
	End If
	
	If MCode.sf.len(Calendar.PersianDay) = 2 Then
		Day = Calendar.PersianDay
	Else
		Day = "0" & Calendar.PersianDay
	End If

	Dim Txt As EditText = Obj
	If Obj=TxtAz Then
		DateAz=Calendar.Persianyear & Month & Day
		Log(DateAz)
	Else If Obj=TxtTa Then
		DateTa=Calendar.Persianyear &  Month & Day
		Log(DateTa)
	End If
'	Txt.Text=Calendar.PersianLongDate	
	Txt.Text = Calendar.Persianyear & "/" & Month & "/" & Day
	
End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Sub Picker_onDisimised
	Log("Disimised")
End Sub

Sub TxtTa_Click
	Obj=TxtTa
	DatePicker
End Sub

Sub TxtAz_Click
	Obj=TxtAz
	DatePicker
End Sub
Sub BtnGet_Click
	If chkAll.Checked=False Then
		Log(code)
		Log(name)
	
	If	code <> "" And name <> "" Then
			If	TxtAz.Text<>"از تاریخ" And TxtTa.Text <> "تا تاریخ" Then
			If MCode.Sf.Val(DateTa) < MCode.Sf.Val(DateAz) Then
				ToastMessageShow("تاریخ را صحیح وارد نمایید",True)
				Return
			End If
			If MCode.Sf.Val(DateTa) = 0 Or MCode.Sf.Val(DateAz) = 0 Then
				ToastMessageShow("تاریخ را صحیح وارد نمایید",True)
				Return
			End If
			datetempA=DateAz
			datetempB=DateTa
			DateFilter=" and FldDateSarResid between "& datetempA &" and "& datetempB &" and FldCodeTafzili="& code
				Query="select FldDateSarResid,FldMandeTasfieNashode,FldMablagheKolDaryafti,FldMandeTalab,FldShomareFactor,FldSharheTafzili,FldCodeTafzili from TblSooratHesab where TblSooratHesab.FldCodeTafzili in (select fldCodetafzili from TblAshkhas) and fldMablagheKolDaryafti=0 "& DateFilter
				q=MCode.SingleResult("select sum(FldMandeTasfieNashode) from TblSooratHesab where fldMablagheKolDaryafti=0 "& DateFilter)
				If IsNumber(q) Then
					SumBedhi=q
				Else
					SumBedhi=0
				End If
			Grid
			Else
			DateFilter=" and FldCodeTafzili="& code
				Query="select FldDateSarResid,FldMandeTasfieNashode,FldMablagheKolDaryafti,FldMandeTalab,FldShomareFactor,FldSharheTafzili,FldCodeTafzili from TblSooratHesab where TblSooratHesab.FldCodeTafzili in (select fldCodetafzili from TblAshkhas) and fldMablagheKolDaryafti=0 "& DateFilter
				q=MCode.SingleResult("select sum(FldMandeTasfieNashode) from TblSooratHesab where TblSooratHesab.FldCodeTafzili in (select fldCodetafzili from TblAshkhas) and fldMablagheKolDaryafti=0 "& DateFilter)
				If IsNumber(q) Then
					SumBedhi=q
				Else
					SumBedhi=0
				End If
			Grid
			End If
		Else
			If	TxtAz.Text<>"از تاریخ" And TxtTa.Text <> "تا تاریخ" Then
				If MCode.Sf.Val(DateTa) < MCode.Sf.Val(DateAz) Then
					ToastMessageShow("تاریخ را صحیح وارد نمایید",True)
					Return
				End If
				If MCode.Sf.Val(DateTa) = 0 Or MCode.Sf.Val(DateAz) = 0 Then
					ToastMessageShow("تاریخ را صحیح وارد نمایید",True)
					Return
				End If
				datetempA=DateAz
				datetempB=DateTa
				DateFilter=" and FldDateSarResid between "& datetempA &" and "& datetempB
				Query="select FldDateSarResid,FldMandeTasfieNashode,FldMablagheKolDaryafti,FldMandeTalab,FldShomareFactor,FldSharheTafzili,FldCodeTafzili from TblSooratHesab where fldMablagheKolDaryafti=0 "& DateFilter
				q=MCode.SingleResult("select sum(FldMandeTasfieNashode) from TblSooratHesab where  TblSooratHesab.FldCodeTafzili in (select fldCodetafzili from TblAshkhas) and  fldMablagheKolDaryafti=0 "& DateFilter)
				If IsNumber(q) Then
					SumBedhi=q
				Else
					SumBedhi=0
				End If
				Grid
			
			End If
	
	End If
	Else
		TxtAz.Enabled=False
		TxtTa.Enabled=False
		btnAshkhas.Enabled=False
		Query = "select FldDateSarResid,FldMandeTasfieNashode,FldMablagheKolDaryafti,FldMandeTalab,FldShomareFactor,FldSharheTafzili,FldCodeTafzili from TblSooratHesab where TblSooratHesab.FldCodeTafzili in (select fldCodetafzili from TblAshkhas) and fldMablagheKolDaryafti=0"
		q=MCode.SingleResult("select sum(FldMandeTasfieNashode) from TblSooratHesab where TblSooratHesab.FldCodeTafzili in (select fldCodetafzili from TblAshkhas) and fldMablagheKolDaryafti=0 ")
		If IsNumber(q) Then
			SumBedhi=q
		Else
			SumBedhi=0
		End If
		Grid
End If
	Key.HideKeyboard
End Sub
Sub LoadShakhs(CodeShakhs As String,NameShakhs As String)
	code=CodeShakhs
	name=NameShakhs
	lblNameShakhs.Text = "آقای/خانم  " & NameShakhs
	lblNameShakhs.Tag = CodeShakhs
	MCode.BackPage=""
End Sub
Sub btnAshkhas_Click
	MCode.BackPage="Act_FaktorTasfieNashode"
	StartActivity(Act_Main_Ashkhas)
End Sub

Sub chkAll_CheckedChange(Checked As Boolean)
	If	chkAll.Checked=True Then
		TxtAz.Enabled=False
		TxtTa.Enabled=False
		btnAshkhas.Enabled=False
		lblNameShakhs.Text="همه ی اشخاص"
		TxtAz.Text="از تاریخ"
		TxtTa.Text="تا تاریخ"
		code=""
		name=""
	Else
		TxtAz.Enabled=True
		TxtTa.Enabled=True
		btnAshkhas.Enabled=True
	End If
End Sub