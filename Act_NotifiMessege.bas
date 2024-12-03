B4A=true
Group=Default Group
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
	Dim HLVMain As Hitex_LayoutView
	Dim Pic1 = LoadBitmap(File.DirAssets,"PushOpen.png") As Bitmap
	Dim Pic2 = LoadBitmap(File.DirAssets,"PushClose.png") As Bitmap
	Private Picker As Hitex_PersianDatePicker
	Private pnlMain As Panel
	Private TxtAz As EditText
	Private TxtTa As EditText
	Private AcTxtSearch As ACEditText
	Dim ListPush,OriginalListPush As List
	Type AdapterListPush(Id As Int,FldTitle As String,FldBody As String,FldDate As String,FldTime As String,FldStatus As String)
	Dim send As Boolean
	'Dim IsSearch As Boolean
	Dim Utils As Hitex_Utils
	Dim Key As IME
	'Private lblBodyMsg As Label
	Private lblDateMsg As Label
	Private lblTimeMsg As Label
	Private pnlMessagebox As Panel
	Private PnlTop As Panel
	Private lblBodyMsg As Label
	Private lblTitleMsg As Label
	Dim DateAz,DateTa As String
	Private pnlBodyMsg As Panel
	Private LV1 As ListView
	Dim Obj As Object
	Dim datenow As String
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
Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("L_PushMessege")
	HLVMain.Initializer("HLVMain").ListView.Build
	pnlMain.AddView(HLVMain,0,1%y,100%x,60%y)
	ListPush.Initialize
	OriginalListPush.Initialize	
	Key.Initialize("Key")
	'	ts.Initialize
	'sv1.Panel.AddView(pnlBodyMsg,5%x,0,89%x,100%y)
	'ts.LongText(lblBodyMsg,lblBodyMsg.Text,20,sv1,1.5)
	datenow=MCode.DatePersian
	send=False
	'IsSearch=False
	LoadListPush(-1,datenow,datenow)
	HLVMain.Divider.Add1(Colors.White,5dip)

	HLVMain.Ripple.Color(0xFF909090)
	HLVMain.CardView.CardElevation(4dip).Radius(5dip)
	HLVMain.Show
	
	Dim Label1 As Label
	Label1 = LV1.SingleLineLayout.Label
	Label1.TextSize = 17
	Label1.TextColor = Colors.Black
	Label1.Typeface=MCode.Font
	Label1.Gravity=Gravity.CENTER
	LV1.SingleLineLayout.ItemHeight=590
	
End Sub


Sub LoadListPush(Status As Int,SDateAz As String,SDateTa As String)
	OriginalListPush.Clear
	ListPush.Clear
	If TxtAz.Text<>"" And TxtTa.Text<>"" Then
		Dim Dt As Cursor
		Select Status
			Case 0
				Dt = MCode.Result("Select Id,FldTitle,FldBody,FldDate,FldTime,FldStatus From TblNotifi where FldStatus='0' and FldDate between "&SDateAz&" and "&SDateTa&" ORDER BY Id desc")		
			Case 1
			    Dt= MCode.Result("Select Id,FldTitle,FldBody,FldDate,FldTime,FldStatus From TblNotifi where FldStatus='1' and FldDate between "&SDateAz&" and "&SDateTa&" ORDER BY Id desc")			
			Case Else
				Dt = MCode.Result("Select Id,FldTitle,FldBody,FldDate,FldTime,FldStatus From TblNotifi where  FldDate between "&SDateAz&" and "&SDateTa&" ORDER BY Id desc")			
		End Select	
	Else
		Select Status
			Case 0
				Dim Dt As Cursor = MCode.Result("Select Id,FldTitle,FldBody,FldDate,FldTime,FldStatus From TblNotifi where FldStatus='0' ORDER BY Id desc")			
			Case 1
				Dt = MCode.Result("Select Id,FldTitle,FldBody,FldDate,FldTime,FldStatus From TblNotifi where FldStatus='1' ORDER BY Id desc")			
			Case Else
			    Dt= MCode.Result("Select Id,FldTitle,FldBody,FldDate,FldTime,FldStatus From TblNotifi ORDER BY Id desc")			
		End Select	
	End If
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		Dim Item As AdapterListPush
		Item.Id=Dt.GetInt("Id")
		Item.FldTitle=Dt.GetString("FldTitle")
		Item.FldBody=Dt.GetString("FldBody")
		Item.FldDate=Dt.GetString("FldDate")
		Item.FldTime=Dt.GetString("FldTime")
		Item.FldStatus=Dt.GetString("FldStatus")

		OriginalListPush.Add(Item)
	Next
	ListPush = OriginalListPush
	If	send=True Then
	HLVMain.notifyDataSetChanged
	End If
	send=False
End Sub
Sub HLVMain_onCreateViewHolder (Parent As Panel, ViewType As Int)
	
	Dim ImageRow As ImageView
	ImageRow.Initialize("ImageRow")
	ImageRow.Gravity=Gravity.Fill

	Parent.AddView(ImageRow,75%x,0,21%x,15%y)
	
	Dim lblTitle As Label
	lblTitle.Initialize("LblTitle")
	lblTitle.TextColor=Colors.RGB(11,32,14)
	lblTitle.TextSize=17
	lblTitle.Gravity=Gravity.RIGHT
	lblTitle.SingleLine=True
	lblTitle.Typeface=MCode.Font
	Parent.AddView(lblTitle,20%x,3%y,47%x,5%y)
	
	Dim lblBody As Label
	lblBody.Initialize("LblBody")
	lblBody.TextColor=Colors.RGB(11,32,14)
	lblBody.TextSize=20
	lblBody.Gravity=Gravity.RIGHT
	lblBody.SingleLine=False
	lblBody.Typeface=MCode.Font
	Parent.AddView(lblBody,10%x,10%y,56%x,10%y)
	
	
	Dim lblDate As Label
	lblDate.Initialize("lblDate")
	lblDate.TextColor=Colors.RGB(11,32,14)
	lblDate.TextSize=17
	lblDate.Gravity=Gravity.RIGHT
	lblDate.SingleLine=True
	lblDate.Typeface=MCode.Font
	Parent.AddView(lblDate,45%x,27%y,47%x,5%y)
	
	Dim lblTime As Label
	lblTime.Initialize("lblTime")
	lblTime.TextColor=Colors.RGB(11,32,14)
	lblTime.TextSize=17
	lblTime.Gravity=Gravity.LEFT
	lblTime.SingleLine=False
	lblTime.Typeface=MCode.Font
	Parent.AddView(lblTime,3%x,27%y,56%x,10%y)
	


	
End Sub


Sub HLVMain_onBindViewHolder (Parent As Panel, Position As Int)
	Dim Item = ListPush.Get(Position) As AdapterListPush
	Dim imageRow  As ImageView = Parent.GetView(0)
	Select Item.FldStatus
		Case "0"
			imageRow.Bitmap=Pic2
			Parent.Color=Colors.RGB(251,249,226)
		Case "1"
			imageRow.Bitmap=Pic1
			Parent.Color=0xE2E2E2E2
	End Select
	Dim lblTitle As Label= Parent.GetView(1)
	lblTitle.Text="عنوان: "&Item.FldTitle
	Dim lblBody As Label= Parent.GetView(2)
	lblBody.Text="متن پیام: "&Item.FldBody
	
	Dim lblDate As Label= Parent.GetView(3)
	Dim date As String
	date=MCode.PersianDateDash(Item.FldDate)
	lblDate.Text="تاریخ: "& date
	
	Dim lblTime As Label= Parent.GetView(4)
	lblTime.Text="ساعت: "&Item.FldTime
	
	
	
	
	Parent.Top = 0
	Parent.Height = 32%y
	Parent.Width=98%x
	Parent.Left = 1%x
	
	

	
'	Parent.Top = 2%y
'	Parent.Height = 36%y
'	Parent.Left = 1.5%x
'	Parent.Width=50%x
	
End Sub
Sub HLVMain_GetItemCount As Int
	Return ListPush.Size
End Sub
Sub HLVMain_ItemClick (ClickedItem As Panel, Position As Int)		'👆 ItemClick 👆'
	Dim Item = ListPush.Get(Position) As AdapterListPush
	Log(Item.Id)
	MCode.SaveUpdate("update TblNotifi Set FldStatus='1' where Id="&Item.Id)
	lblTitleMsg.Text=Item.FldTitle
	lblDateMsg.Text=MCode.PersianDateDash(Item.FldDate)
	lblTimeMsg.Text=Item.FldTime
	'lblBodyMsg.Text=Item.FldBody
	Dim Countlength As Int
	Countlength=Item.FldBody.Length
	If Countlength<300 Then
		LV1.AddSingleLine(Item.FldBody)
		Else
	
			Dim count,CEnd As Int
			Dim str As String
			count=Ceil(Countlength/150)
			CEnd=150		
			
			For i=0 To count-1
				If i=0 Then
					str=Item.FldBody.SubString2(i,CEnd)
					LV1.AddSingleLine(str)
				Else
					str=Item.FldBody.SubString2(CEnd+1,CEnd+150)
					LV1.AddSingleLine(str)
				End If
			
			Next
	End If
	pnlMessagebox.Visible=True
	PnlTop.Visible=False
	Key.HideKeyboard
	MCode.AnimationOpen(pnlMessagebox)
End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub LblSearchIcon_Click
	
End Sub

Sub BtnGet_Click
	If MCode.Sf.Val(DateTa) < MCode.Sf.Val(DateAz) Then
		ToastMessageShow("تاریخ را صحیح وارد نمایید",True)
		Return
	End If
	If MCode.Sf.Val(DateTa) = 0 Or MCode.Sf.Val(DateAz) = 0 Then
		ToastMessageShow("تاریخ را صحیح وارد نمایید",True)
		Return
	End If
	LoadListPush(-1,DateAz,DateTa)
	HLVMain.ScrollToPosition(0)
	HLVMain.notifyDataSetChanged
	Key.HideKeyboard
End Sub

Sub AcTxtSearch_TextChanged (Old As String, New As String)
		'IsSearch=True
		send=False
	LoadListPush(-1,DateAz,DateTa)
		ListPush = Utils.FilterSearchList("FldBody",OriginalListPush).Contains(New)
		HLVMain.ScrollToPosition(0)
		HLVMain.notifyDataSetChanged
End Sub

Sub Search_Click
	MCode.IconView.SearchView.Start
	AcTxtSearch.Visible=True
	Key.ShowKeyboard(AcTxtSearch)
End Sub

Sub LblBackSearch_Click	
	Sleep(400)
	AcTxtSearch.Text=""
	AcTxtSearch.Visible=False
	Key.HideKeyboard
	Activity.Finish
	MCode.SetAnimation("zoom_enter2", "zoom_exit2")
End Sub
Sub Activity_KeyPress (KeyCode As Int) As Boolean
If KeyCode=KeyCodes.KEYCODE_BACK Then
	If pnlMessagebox.Visible=True Then
		LV1.Clear
		pnlMessagebox.Visible=False
		PnlTop.Visible=True
		imgShowAll_Click
			MCode.AnimationClose(pnlMessagebox)
			Return True
	Else
			Activity.Finish
			MCode.SetAnimation("zoom_enter2", "zoom_exit2")
	End If
		
End If
	Return True
End Sub
Sub imgShowAll_Click
	send=True
	LoadListPush(-1,datenow,datenow)
	
End Sub

Sub imgShowClose_Click
	send=True
	LoadListPush(0,datenow,datenow)
End Sub

Sub imgShowOpen_Click
	send=True
	LoadListPush(1,datenow,datenow)
End Sub

Sub TxtTa_Click
	Obj=TxtTa
	DatePicker
End Sub

Sub TxtAz_Click
	Obj=TxtAz
	DatePicker
End Sub

Sub lblBack_Click
	LV1.Clear
	pnlMessagebox.Visible=False
	PnlTop.Visible=True
	imgShowAll_Click
	MCode.AnimationClose(pnlMessagebox)

End Sub