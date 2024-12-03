B4A=true
Group=Report
ModulesStructureVersion=1
Type=Activity
Version=9.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals

End Sub

Sub Globals
	Private Dialog As B4XDialog
	Private XUI As XUI
	Private Base As B4XView
	Private SearchTemplate As B4XSearchTemplate
	Dim MPD As ManamPersianDate
	

	Private BtnReport As Button
	Private BtnTa As Button
	Private BtnAz As Button
	Dim DateAz,DateTa As String

	Private Btn_SelAshkhas As Button
	Private Panel1 As Panel
	Private Btn_show As Button

	Dim LstReport As List
	Private LblSumForoosh As Label
	Private LblTedadEshantion As Label
	Private LblSumBargasht As Label
	Private LblSumKhales As Label
	Private LblTedadForoosh As Label
	Private LblTedadBargasht As Label
	Private LblTedadSefaresh As Label
	Private LblSumSefaresh As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_ReportVisitor")
	LstReport.Initialize
'	If MCode.DateTimeRecive=0 Then
'		LblLastGet.Text = "هنوز دریافتی صورت نگرفته است"
'	Else	
'		LblLastGet.Text = MCode.DateTimeRecive
'	End If
'	If MCode.DateTimeSend=0 Then
'		LblLastSend.Text = "هنوز ارسالی صورت نگرفته است"
'	Else
'		LblLastSend.Text = MCode.DateTimeSend
'	End If
	
	Base = Activity
	Dialog.Initialize (Panel1)
	Dialog.Title = "جستجو"
	SearchTemplate.Initialize
	Dim Items As List
	Items.Initialize
	Dim Cu As Cursor = MCode.Result("Select * From TblAshkhas ")
	For i=0 To Cu.RowCount-1
		Cu.Position=i
		Dim Name As String =  Cu.GetString("fldSharheTafzili")
		Items.Add(Name)
	Next
	SearchTemplate.SetItems(Items)
	SearchTemplate.GetPanel(Dialog).BringToFront
	Btn_show.Visible=False
	MCode.CodeMoshtariSelect=0
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Activity.Finish
	Else
		Return True
	End If
	Return True
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

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
	BtnAz.Tag=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
	DateAz=MPD.PersianToGregorian(year,month,day)
'	DateAz=DateAz.Replace("/","-") & " " & DateTime.Time(DateTime.Now) & ".000"
'	DateAz=DateAz.Replace("/","-") & " " & "00:00:00" & ".000"
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
	DateTa= MPD.PersianToGregorian(year,month,day)
'	DateTa=DateTa.Replace("/","-") & " " & DateTime.Time(DateTime.Now) & ".000"
'	DateTa=DateTa.Replace("/","-") & " " & "23:59:00" & ".000"
	DateTa=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
	LogColor(DateTa,Colors.Magenta)
End Sub
Sub p1_onCancel
	Log("cancel")
End Sub
Sub p1_onDismiss
	Log("dismiss")
End Sub

Sub BtnReport_Click
	LblSumForoosh.Text = "0"
	LblSumBargasht.Text = "0"
	LblTedadEshantion.Text = "0"
	LblSumKhales.Text = "0"
	If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(BtnTa.Tag) = 8 Then

		ProgressDialogShow2("لطفا صبر کنید . . .",False)
		'CallSubDelayed3(Service_Server,"GetReportMoshtari",DateAz,DateTa)
		LoadData
	Else
		ToastMessageShow("تاریخ را به طور صحیح وارد نمایید",True)
	End If

End Sub

Sub LoadData
	Try
		LstReport.Clear
		Dim hasreport As String=0
	
		Dim fldFeeJoz As String=0
		Dim fldFeeBargasht As String=0
		Dim fldTedadEshantionJoz As String=0
		Dim fldTedadEshantionKol As String=0
		Dim fldTedadJozForoosh As String=0
		Dim fldTedadKolForoosh As String=0
		Dim fldTedadJozBargasht As String=0
		Dim fldTedadKolBargasht As String=0
		Dim fldSumKhales As String=0
		Dim fldFeeJozSefaresh As String=0
		Dim fldTedadJozSefaresh  As String=0
		Dim fldTedadKolSefaresh As String=0
		If MCode.CodeMoshtariSelect=0 Then
			fldTedadJozSefaresh=myCode.Is_Null_adad(MCode.SingleResult("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldDate between "&DateAz & " and "& DateTa))
			fldTedadKolSefaresh=myCode.Is_Null_adad(MCode.SingleResult("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldDate between "&DateAz & " and "& DateTa))
			Dim cu As Cursor=MCode.Result("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldDate between "&DateAz & " and "& DateTa)
			If cu.RowCount>0 Then
				For  i=0 To cu.RowCount-1
					cu.Position=i
					fldFeeJozSefaresh =fldFeeJozSefaresh+ myCode.Is_Null_adad(cu.GetString("FldTotalFaktor"))
				Next
				hasreport=1
			End If

			fldTedadJozForoosh=myCode.Is_Null_adad(MCode.SingleResult("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldDate between "&DateAz & " and "& DateTa))
			fldTedadKolForoosh=myCode.Is_Null_adad(MCode.SingleResult("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldDate between "&DateAz & " and "& DateTa))
			Dim cu As Cursor=MCode.Result("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldDate between "&DateAz & " and "& DateTa)
			If cu.RowCount>0 Then
				For  i=0 To cu.RowCount-1
					cu.Position=i
					fldFeeJoz =fldFeeJoz+ myCode.Is_Null_adad(cu.GetString("FldTotalFaktor"))
				Next
				hasreport=1
			End If

			fldTedadJozBargasht=myCode.Is_Null_adad(MCode.SingleResult("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldDate between "&DateAz & " and "& DateTa))
			fldTedadKolBargasht=myCode.Is_Null_adad(MCode.SingleResult("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldDate between "&DateAz & " and "& DateTa))
			Dim cu As Cursor=MCode.Result("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldDate between "&DateAz & " and "& DateTa)
			If cu.RowCount>0 Then
				For  i=0 To cu.RowCount-1
					cu.Position=i
					fldFeeBargasht =fldFeeBargasht+ myCode.Is_Null_adad(cu.GetString("FldTotalFaktor"))
				Next
				hasreport=1
			End If
		Else
			
			fldTedadJozSefaresh=myCode.Is_Null_adad(MCode.SingleResult($"select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldC_Tafzili=${MCode.CodeMoshtariSelect} and FldDate between ${DateAz}  and  ${DateTa}"$))
			fldTedadKolSefaresh=myCode.Is_Null_adad(MCode.SingleResult($"select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldC_Tafzili=${MCode.CodeMoshtariSelect} and FldDate between ${DateAz}  and  ${DateTa}"$))
			Dim cu As Cursor=MCode.Result($"select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldC_Tafzili=${MCode.CodeMoshtariSelect} and FldDate between ${DateAz}   and  ${DateTa}"$)
			If cu.RowCount>0 Then
				For  i=0 To cu.RowCount-1
					cu.Position=i
					fldFeeJozSefaresh =fldFeeJozSefaresh+ myCode.Is_Null_adad(cu.GetString("FldTotalFaktor"))
				Next
				hasreport=1
			End If

			fldTedadJozForoosh=myCode.Is_Null_adad(MCode.SingleResult($"select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldC_Tafzili=${MCode.CodeMoshtariSelect} and FldDate between ${DateAz}  and  ${DateTa}"$))
			fldTedadKolForoosh=myCode.Is_Null_adad(MCode.SingleResult($"select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldC_Tafzili=${MCode.CodeMoshtariSelect} and FldDate between ${DateAz}  and  ${DateTa}"$))
			Dim cu As Cursor=MCode.Result($"select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldC_Tafzili=${MCode.CodeMoshtariSelect} and FldDate between ${DateAz}   and  ${DateTa}"$)
			If cu.RowCount>0 Then
				For  i=0 To cu.RowCount-1
					cu.Position=i
					fldFeeJoz =fldFeeJoz+ myCode.Is_Null_adad(cu.GetString("FldTotalFaktor"))
				Next
				hasreport=1
			End If

			fldTedadJozBargasht=myCode.Is_Null_adad(MCode.SingleResult($"select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldC_Tafzili=${MCode.CodeMoshtariSelect} and FldDate between ${DateAz}  and  ${DateTa}"$))
			fldTedadKolBargasht=myCode.Is_Null_adad(MCode.SingleResult($"select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldC_Tafzili=${MCode.CodeMoshtariSelect} and FldDate between ${DateAz}  and  ${DateTa}"$))
			Dim cu As Cursor=MCode.Result($"select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldC_Tafzili=${MCode.CodeMoshtariSelect} and FldDate between ${DateAz}   and  ${DateTa}"$)
			If cu.RowCount>0 Then
				For  i=0 To cu.RowCount-1
					cu.Position=i
					fldFeeBargasht =fldFeeBargasht+ myCode.Is_Null_adad(cu.GetString("FldTotalFaktor"))
				Next
				hasreport=1
			End If

						
		End If
		LblTedadForoosh.Text= fldTedadJozForoosh &" عدد و "& fldTedadKolForoosh &" کارتن "
		LblTedadSefaresh.Text= fldTedadJozSefaresh &" عدد و "& fldTedadKolSefaresh &" کارتن "
		LblTedadBargasht.Text= fldTedadJozBargasht &" عدد و "& fldTedadKolBargasht &" کارتن "
		LblTedadEshantion.Text= fldTedadEshantionJoz &" عدد و "& fldTedadEshantionKol &" کارتن "
	
		LblSumForoosh.Text =myCode.AdadToPrice(fldFeeJoz)
		LblSumSefaresh.Text =myCode.AdadToPrice(fldFeeJozSefaresh)
		LblSumBargasht.Text =myCode.AdadToPrice(fldFeeBargasht)
		
		If	fldFeeJoz>0 Then
			fldSumKhales=fldFeeJoz-fldFeeBargasht
		Else
		
			fldSumKhales=0
		End If
		
		LblSumKhales.Text =myCode.AdadToPrice(fldSumKhales)

		ProgressDialogHide
		If hasreport=1 Then
			Btn_show.Visible=True
		Else
			Btn_show.Visible=False
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadData")
	End Try
End Sub

Sub Btn_SelAshkhas_Click
	Btn_show.Visible=False
	Panel1.BringToFront
	Panel1.Visible=True
	SearchTemplate.SearchField.HintText="نام مشتری"
	SearchTemplate.SearchField.lblClear.Text=""
	SearchTemplate.SearchField.lblV.Text=""
	SearchTemplate.SearchField.Update
	Dim rs As Object = Dialog.ShowTemplate(SearchTemplate, "", "", "انصراف")
	AnimateDialog(Dialog, "right")
	Wait For (rs) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		Btn_SelAshkhas.Text = SearchTemplate.SelectedItem
		Dim Cu As Cursor = MCode.Result("Select * From TblAshkhas where fldSharheTafzili='"&Btn_SelAshkhas.Text&"'")
		Cu.Position=0
		MCode.CodeMoshtariSelect =  Cu.GetString("fldCodetafzili")
		Log("کد مشتری : "&Cu.GetString("fldCodetafzili"))
	Else
		Btn_SelAshkhas.Text = "انتخاب مشتری"
		MCode.CodeMoshtariSelect=0
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

Sub Btn_show_Click
	Act_RepFactors.CodeMoshtari=MCode.CodeMoshtariSelect
	Act_RepFactors.DateAz=DateAz
	Act_RepFactors.DateTa=DateTa
	Act_RepFactors.TotalFactor=LblSumKhales.Text
	StartActivity(Act_RepFactors)
	'LoadListFaktor
End Sub

Sub LoadListFaktor
	Dim TFsum As Long=0

	If MCode.Sf.Len(DateAz) = 8 And MCode.Sf.Len(DateTa) = 8 Then
		MCode.page="Act_ReportVisitor"
		ProgressDialogShow2("لطفا چند لحظه صبر کنید . . .",False)
'		LblName.Text=myCode.GetNameTafsiliByCode(CodeMoshtari)
		CallSubDelayed3(Service_Server,"GetReportFactor",DateAz,DateTa)
'		Dim j As HttpJob
'		j.Initialize("",Me)
'		j.PostMultipart("http://" & MCode.url & "/api/Visitor/GetOrders",m,Null )
'		j.GetRequest.SetHeader("apiKey",MCode.ApiKey)
'		Wait For (j) jobdone(j As HttpJob)
'		ProgressDialogHide
'		If j.Success Then
'			Dim str As String=j.GetString
'			Dim RowList As List
'			Dim Row As Map
'			MCode.Json.Initialize(str.Trim )
'			RowList = MCode.Json.NextArray
'			For i=0 To RowList.Size-1
'				Row=RowList.Get(i)
'				Dim Item As AdapterListFaktor
'				Item.FldShomareFaktor=Row.Get("id")
'				Item.fldTotalFaktor=Row.Get("fldTotalFaktor")
'				Item.fldTozihFaktor=Row.Get("fldTozihFaktor")
'				Item.fldC_Tasvie=Row.Get("fldC_Tasvie")
'				Item.fldC_Ashkhas=Row.Get("fldC_Ashkhas")
'				Item.fldDate=Row.Get("fldDate")
'	
'				
'			
'				Item.FldName=Row.Get("fldName")
'				Item.synced=True 'Row.Get("synced")
'				Item.fldTime=""
'				Log(MCode.Sf.Mid(Item.FldDate,1,4) & MCode.Sf.Mid(Item.FldDate,6,2) & MCode.Sf.Mid(Item.FldDate,9,2))
'				Item.fldDate=MPD.GregorianToPersian(MCode.Sf.Mid(Item.FldDate,1,4) , MCode.Sf.Mid(Item.FldDate,6,2) , MCode.Sf.Mid(Item.FldDate,9,2))
'				Item.fldVaziat=Row.Get("fldVaziat")
'				Item.wIsBacked=Row.Get("wIsBacked")
'				If IsNumber(Item.FldTotalFaktor) Then
'					TFsum = TFsum + Item.FldTotalFaktor
'				End If
'				ListFaktor.Add(Item)
'			Next
'			CreatePage
'			HLV.notifyDataSetChanged
'		Else
'			ProgressDialogHide
'			ToastMessageShow("خطا در دریافت اطلاعات",True)
'		End If
	Else
		ToastMessageShow("تاریخ را به طور صحیح وارد نمایید",True)
	End If
	
'	LblVaziat.Text=NumberFormat2(TFsum,0,0,0,True) & " ریال "
End Sub
Sub LoadFactor(lst As List)
	If	lst.Size>0 Then
		Act_RepFactors.DateAz=DateAz
		Act_RepFactors.Dateta=DateTa
		Act_RepFactors.CodeMoshtari=MCode.CodeMoshtariSelect
		Act_RepFactors.TotalFactor=LblSumKhales.Text
		StartActivity(Act_RepFactors)
	Else
		ToastMessageShow("اطلاعات ارسالی وجود ندارد",True)
	End If
End Sub



Sub LblBack_Click
	Activity.Finish
End Sub
