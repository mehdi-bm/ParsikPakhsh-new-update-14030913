B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=12.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals


End Sub

Sub Globals
	Private pnl_HLV As Panel
	Private HLV As Hitex_LayoutView
	Dim MPD As ManamPersianDate
	Dim DateAz,DateTa As String
	Private BtnTa As Button
	Private BtnAz As Button
	Private SwOpen As ACSwitch
	Private SwClose As ACSwitch
	Private SwToday As ACSwitch
	Private TxtSearch As EditText
	Dim listHavale As List
	Dim OriginallistHavale As List
	Dim OrderBy As String=" Order By fldShomareHavale Asc"
	Private LblTedadToday As Label
	Private LblTedadClose As Label
	Private lblTedadOpen As Label
	Private Img_sort As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Try
	Activity.LoadLayout("L_HavaleTozie")
	listHavale.Initialize
	OriginallistHavale.Initialize
	HLV.Initializer("HLV").ListView.Build
	pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Height)
		HLV.Show
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
End Sub

Public Sub LoadFilter
	Try
	Dim str As String=""
	Dim countfilter As Int=0
	Dim Filter As Boolean=False

		If SwOpen.Checked Then
			countfilter=countfilter+1
			str= str & " and fldVaziat=1"
			Filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If
		
		If SwClose.Checked Then
			countfilter=countfilter+1
			str= str & " and fldVaziat<>1"
			Filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If
		
		If BtnAz.Text<>"تعیین تاریخ" And BtnTa.Text<>"تعیین تاریخ" Then
			countfilter=countfilter+1
			str= str & " and fldDate between "&BtnAz.Text.Replace("/","") & " , "&BtnTa.Text.Replace("/","")
			Filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
				str=str.Replace(" , "," and ")
			End If
		End If
		
		
		If SwToday.Checked Then
			Dim datep As String =MCode.DatePersian
			countfilter=countfilter+1
			str= str & " and fldDate="&datep
			Filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If
		
		
		If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
			Dim Search As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
			If Search="" Then
				Search=TxtSearch.Text
			End If
			countfilter=countfilter+1
			If IsNumber(Search) Then
				str = str & $" and  (fldShomareHavale = '${Search}') "$
			End If
			Filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If
		
		
		
		
		If Filter=True And str<>"" Then
			
			'str=str.Replace(" and ","")
			str="select * from TblHavale where "&str&" " & OrderBy
		Else
			str="select * from TblHavale  " & OrderBy
		End If
		LoadHavale(str)
	
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadFilter")
	End Try
	

End Sub

Public Sub CheckVaziat(ShomareHavale As String) As String
	Dim countAll As String=0
	Dim countVaziatTahvilShode As String=0
	Dim vaziat As String=0
	
	countAll=MCode.SingleResult($"select count(fldShomareHavale) from TblRizFactorHavale where fldShomareHavale=${ShomareHavale} "$)
	countVaziatTahvilShode=MCode.SingleResult($"select count(fldShomareHavale) from TblRizFactorHavale where fldShomareHavale=${ShomareHavale} and fldVaziat=1 "$)	
	If countAll=countVaziatTahvilShode Then
		vaziat=1
	End If
	
	Return vaziat
End Sub

Public Sub LoadHavale(query As String)
	Try
	listHavale.Clear
	OriginallistHavale.Clear
	Dim cu As Cursor
	cu=MCode.Result(query)
	If	cu.RowCount>0 Then
		For i=0 To cu.RowCount-1 
			cu.Position=i
			Dim item As AdapteRepHavale		
			item.fldShomareHavale=cu.GetString("fldShomareHavale")
			item.fldDate=cu.GetString("fldDate")
			item.fldVaziat=cu.GetString("fldVaziat")'CheckVaziat(item.fldShomareHavale)
			item.fldMandeFactor=cu.GetString("fldMandeFactor")
			item.fldCountFactor=cu.GetString("fldCountFactor")
			OriginallistHavale.Add(item)
		Next
		cu.Close
	
	End If
	listHavale=OriginallistHavale
 	If	SwToday.Checked Then
 			LblTedadToday.Text=listHavale.Size
		Else
			LblTedadToday.Text=0
	End If
	If	SwOpen.Checked Then
			lblTedadOpen.Text=listHavale.Size
		Else
			lblTedadOpen.Text=0
	End If
	If	SwClose.Checked Then
			LblTedadClose.Text=listHavale.Size
		Else
			LblTedadClose.Text=0
	End If
 
		HLV.notifyDataSetChanged
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadHavale")
	End Try
End Sub

Private Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As Cls_Rec_Havale
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub
Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim item As AdapteRepHavale=listHavale.Get(Position)
	Dim rec As Cls_Rec_Havale=Parent.Tag
	rec.show(item)
	Parent.Height=rec.Height
End Sub
Sub HLV_ItemClick (ClickedItem As Panel, Position As Int)		'👆 ItemClick 👆'
	Dim rec As Cls_Rec_Havale=ClickedItem.Tag
	rec.lblShowHavale_Click
End Sub
Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return listHavale.Size '/ItemList.Size
End Sub
Sub Activity_Resume
	btnUpdate_Click
'	LoadFilter
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub

Sub BtnAz_Click
	Try
	Dim p As PersianMaterialDatePicker
	p.Initialize("p",p.PersianYear,p.PersianMonth,p.PersianDay)
	p.AccentColor = Colors.RGB(83,99,255)
	p.OkText = "تایید"
	p.CancelText = "لغو"
	p.Title = "از تاریخ"
	p.Typeface = "iransansmonospacednum.ttf"
		p.Show("p")
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-BtnAz_Click")
	End Try
End Sub
Sub p_onDateSet(year As Int,month As Int,day As Int)
	Try
	Log(year&"/"&month&"/"&day)
	BtnAz.Text=year&"/"&NumberFormat(month,2,0)&"/"&NumberFormat(day,2,0)
	BtnAz.Tag=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
	DateAz=MPD.PersianToGregorian(year,month,day)
'	DateAz=DateAz.Replace("/","-") & " " & DateTime.Time(DateTime.Now) & ".000"
'	DateAz=DateAz.Replace("/","-") & " " & "00:00:00" & ".000"
	DateAz=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
		LogColor(DateAz,Colors.Magenta)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-p_onDateSet")
	End Try
End Sub
Sub p_onCancel
	Log("cancel")
End Sub
Sub p_onDismiss
	Log("dismiss1")
	LoadFilter
End Sub
Sub BtnTa_Click
	Try
	Dim p1 As PersianMaterialDatePicker
	p1.Initialize("p1",p1.PersianYear,p1.PersianMonth,p1.PersianDay)
	p1.AccentColor = Colors.RGB(83,99,255)
	p1.OkText = "تایید"
	p1.CancelText = "لغو"
	p1.Title = "تا تاریخ"
	p1.Typeface = "iransansmonospacednum.ttf"
		p1.Show("p1")
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-BtnTa_Click")
	End Try
End Sub
Sub p1_onDateSet(year As Int,month As Int,day As Int)
	Try
	Log(year&"/"&month&"/"&day)
	BtnTa.Text=year&"/"&NumberFormat(month,2,0)&"/"&NumberFormat(day,2,0)
	BtnTa.Tag=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
	DateTa= MPD.PersianToGregorian(year,month,day)
'	DateTa=DateTa.Replace("/","-") & " " & DateTime.Time(DateTime.Now) & ".000"
'	DateTa=DateTa.Replace("/","-") & " " & "23:59:00" & ".000"
	DateTa=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
		LogColor(DateTa,Colors.Magenta)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-p1_onDateSet")
	End Try
End Sub
Sub p1_onCancel
	Log("cancel")
End Sub
Sub p1_onDismiss
	Log("dismiss")
	LoadFilter
End Sub


Private Sub SwOpen_CheckedChange(Checked As Boolean)
	LoadFilter
End Sub

Private Sub SwClose_CheckedChange(Checked As Boolean)
	LoadFilter
End Sub

Private Sub SwToday_CheckedChange(Checked As Boolean)
	LoadFilter
End Sub

Private Sub TxtSearch_TextChanged (Old As String, New As String)
	LoadFilter
End Sub

Private Sub btn_sort_Click
	
End Sub

Private Sub btnUpdate_Click
	
	Try
		ProgressDialogShow("لطفا چند لحظه صبر کنید...")
		MCode.page="Act_HavaleTozie"
		If MCode.IsConnected Then
			MCode.GetHavaleFlag=0
			'FirebaseMessaging.mode="GetHavaleByUser"
			CallSubDelayed(Service_Server,"GetHavaleByUser")
		Else
			LoadFilter
		End If
		'LoadFilter
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btnUpdate_Click")
	End Try
	
'	Sleep(100)
	
	
	
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

Private Sub Img_sort_Click
	Try
	
		Dim Lst As List = Array As String("از قدیم به جدید","از جدید به قدیم")
		Dim res As Int = InputList(Lst,"مرتب سازی براساس:",-1)
		Select Case res
			Case 0
				OrderBy = " Order By fldShomareHavale Asc"
			Case 1
				OrderBy = " Order By fldShomareHavale Desc"
	
		End Select
		Log(OrderBy)
'	search(AcSwGift.Value)
		LoadFilter
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Img_sort_Click")
	End Try
End Sub