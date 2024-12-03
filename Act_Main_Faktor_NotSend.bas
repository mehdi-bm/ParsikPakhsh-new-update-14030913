B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region
#Extends: android.support.v7.app.AppCompatActivity
Sub Process_Globals

End Sub

Sub Globals
	Dim HLV As Hitex_LayoutView
	Dim Utils As Hitex_Utils
	Dim Anim As Animation
	Dim Key As IME
	Dim Pic = LoadBitmap(File.DirAssets,"Yellow.png") As Bitmap
	Dim ListFaktor,OriginalItemList As List
	Private AcTxtSearch As ACEditText
	Private LblBackSearch As Label
	Private LblTitle As Label
	Private PnlTop As Panel
'	Dim ImgDelete  As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Main_Faktor")
	HLV.Initializer("HLV").ListView.Build
	Activity.AddView(HLV,0,10%y,100%x,90%y)
	ListFaktor.Initialize
	Key.Initialize("Key")
	LoadListFaktor
	OriginalItemList = ListFaktor
	LblTitle.Text = "فاکتور های ارسال نشده"
	
	MCode.IconView.SearchView.Create(Colors.Black,5,Colors.Gray)
	PnlTop.AddView(MCode.IconView.SearchView.View,90%x,2%y,8%x,8%x)
	MCode.IconView.OnClickListener(MCode.IconView.SearchView.View,"Search_Click")
	
End Sub

Sub LoadListFaktor
	Dim Cu As Cursor = MCode.Result("Select FldShomareFaktor,FldTarikh,FldC_Tafzili,FldN_Tafzili,FldVaziatPardakht,FldTozih From TblFaktor Where FldSend = 0 Group by FldShomareFaktor,FldTarikh,FldC_Tafzili,FldN_Tafzili,FldVaziatPardakht  Order by FldTarikh")
	For i = 0 To Cu.RowCount - 1
'		Dim Item As AdapterListFaktor
'		Cu.Position=i
'		Item.FldShomareFaktor=Cu.Getstring("FldShomareFaktor")
'		Item.FldTarikh=Cu.Getstring("FldTarikh")
'		Item.FldC_Tafzili=Cu.Getstring("FldC_Tafzili")
'		Item.FldN_Tafzili=Cu.Getstring("FldN_Tafzili")
'		Item.FldVaziatPardakht=Cu.Getstring("FldVaziatPardakht")
'		Item.FldTozih=Cu.Getstring("FldTozih")
'		ListFaktor.Add(Item)
	Next
	HLV.Ripple.Color(0xFF909090)
	HLV.CardView.CardElevation(4dip).Radius(2dip)
	HLV.Show
End Sub

Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return ListFaktor.Size
End Sub

Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim ImageRow As ImageView
	ImageRow.Initialize("ImageRow")
	ImageRow.Gravity=Gravity.Fill
	ImageRow.Bitmap=Pic
	Parent.AddView(ImageRow,1%x,1%x,20%x,20%x)
	
	Dim LblNameKharidar As Label
	LblNameKharidar.Initialize("LblNameKharidar")
	LblNameKharidar.TextColor=Colors.RGB(11,32,14)
	LblNameKharidar.TextSize=15
	LblNameKharidar.Gravity=Gravity.CENTER
	LblNameKharidar.SingleLine=False
	LblNameKharidar.Typeface=MCode.Font
	Parent.AddView(LblNameKharidar,25%x,1%y,73%x,6%y)
	
	Dim ImgDivider As ImageView
	ImgDivider.Initialize("ImgDivider")
	ImgDivider.Gravity=Gravity.FILL
	ImgDivider.Bitmap=MCode.Divider
	Parent.AddView(ImgDivider,27%x,6%y,65%x,1dip)
	
	Dim LblShomareFaktor As Label
	LblShomareFaktor.Initialize("LblShomareFaktor")
	LblShomareFaktor.TextColor=Colors.RGB(236,47,65)
	LblShomareFaktor.TextSize=15
	LblShomareFaktor.Gravity=Gravity.CENTER
	LblShomareFaktor.Typeface=MCode.Font
	Parent.AddView(LblShomareFaktor,60%x,6%y+1dip,36%x,6%y)
	
	Dim LblTarikh As Label
	LblTarikh.Initialize("LblTarikh")
	LblTarikh.TextColor=Colors.RGB(236,47,65)
	LblTarikh.TextSize=15
	LblTarikh.Gravity=Gravity.CENTER
	LblTarikh.Typeface=MCode.Font
	Parent.AddView(LblTarikh,25%x,6%y+1dip,35%x,6%y)
	
	'Dim ImgDelete As ImageView
'	ImgDelete.Initialize("ImgDelete")
'	ImgDelete.Gravity=Gravity.Fill
'	ImgDelete.Bitmap=MCode.Delete
'	Parent.AddView(ImgDelete,85%x,1%x,8%x,8%x)
	
End Sub

Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
'	Dim Item = ListFaktor.Get(Position) As AdapterListFaktor
'	Parent.Tag=Item.FldC_Tafzili
'	
'	Dim imageRow  As ImageView = Parent.GetView(0)
'	
'	Dim LblNameKharidar As Label  = Parent.getview(1)
'	LblNameKharidar.Text = "نام خریدار:  " & Item.FldN_Tafzili
'	
'	Dim ImgDivider  As ImageView = Parent.GetView(2)
''	
'	Dim LblShomareFaktor As Label = Parent.GetView(3)
'	LblShomareFaktor.Text = "فاکتور: " & Item.FldShomareFaktor
'
'	Dim LblTarikh As Label = Parent.GetView(4)
'	If MCode.NoeDate = "S" Then
'		LblTarikh.Text = "تاریخ: " & MCode.Sf.Mid(Item.FldTarikh,1,4) & "/" & MCode.Sf.Mid(Item.FldTarikh,5,2) & "/" & MCode.Sf.Mid(Item.FldTarikh,7,2)
'	else if MCode.NoeDate = "M" Then
'		LblTarikh.Text = "Date: " & MCode.Sf.Mid(Item.FldTarikh,1,4) & "/" & MCode.Sf.Mid(Item.FldTarikh,5,2) & "/" & MCode.Sf.Mid(Item.FldTarikh,7,2)
'	End If	
'	
'	Dim ImgDelete  As ImageView = Parent.GetView(5)
'	ImgDelete.Tag=Position
	
	Parent.Height = 12%y
End Sub

Sub HLV_ItemClick (ClickedItem As Panel, Position As Int)		'👆 ItemClick 👆'
'	Dim Res As Int
''	Dim Res2 As Int
'	Dim Item = ListFaktor.Get(Position) As AdapterListFaktor
'	If MCode.BackPage = "Act_Sabad" Then
'		Dim Str As String
'		Str = Item.FldC_Tafzili & "," & Item.FldN_Tafzili & "," & Item.FldShomareFaktor & "," & Item.FldTarikh & "," & Item.FldTozih
'		CallSubDelayed3(Act_Sabad,"LoadShakhsVaziatPardakht",Str,Item.FldVaziatPardakht)
'		Activity.Finish
'	Else
'		Res=Msgbox2("یکی از موارد زیر را انتخاب نمایید","توجه","مشاهده فاکتور","","حذف فاکتور",Null)
'		If Res=DialogResponse.POSITIVE Then
'			MCode.ShomareFaktor = Item.FldShomareFaktor
'			MCode.C_Tafzili= Item.FldC_Tafzili
'			MCode.N_Tafzili=Item.FldN_Tafzili
'			MCode.DateFaktor= Item.FldTarikh
'			StartActivity(Act_Riz_Faktor)
'			MCode.SetAnimation("zoom_enter1", "zoom_exit1")
'		Else if Res=DialogResponse.NEGATIVE Then
'			Res=Msgbox2("آیا فاکتور مورد نظر حذف گردد؟","توجه","بله","","خیر",Null)
'			If Res=DialogResponse.POSITIVE Then
'				MCode.SaveUpdate("Delete From TblFaktor Where FldShomareFaktor = '"& Item.FldShomareFaktor &"'")
'				ListFaktor.RemoveAt(Position)
'				HLV.notifyDataSetChanged
'			End If	
'		End If
'		
'	End If
End Sub

'Sub ImgDelete_Click
'	Dim Img  As ImageView = Sender
'	Dim Item = ListFaktor.Get(Img.tag) As AdapterListFaktor
'	Dim Result As Int
'	Result = Msgbox2("آیا می خواهید حذف گردد ؟","","بله","","خیر",Null)
'	If Result=DialogResponse.POSITIVE Then
'		MCode.SaveUpdate("Delete From TblFaktor Where FldShomareFaktor = '"& Item.FldShomareFaktor &"'")
'	End If
'End Sub

'Sub HLV_ItemLongClick (LongClickedItem As Panel, Position As Int) ' 👉 ItemLongClick 👈'
'	Dim Item = ListFaktor.Get(Position) As AdapterListFaktor
'	Dim Result As Int
'	Result = Msgbox2("آیا می خواهید حذف گردد ؟","","بله","","خیر",Null)
'	If Result=DialogResponse.POSITIVE Then
'		MCode.SaveUpdate("Delete From TblFaktor Where FldShomareFaktor = '"& Item.FldShomareFaktor &"'")
'	End If
'End Sub

Sub HLV_onScrollStateChanged (State As Int)
	Key.HideKeyboard
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		If AcTxtSearch.Visible=True Then
			If AcTxtSearch.Text<>"" Then
				AcTxtSearch.Text = ""
				Return True
			Else
				LblBackSearch.Visible=False
				LblTitle.Visible=True
				AcTxtSearch.Visible=False
				Return True
			End If
		Else
			Activity.Finish
			MCode.SetAnimation("zoom_enter2", "zoom_exit2")
		End If
	End If
	Return True
End Sub

Sub AcTxtSearch_TextChanged (Old As String, New As String)
	ListFaktor = Utils.FilterSearchList("FldN_Tafzili",OriginalItemList).Contains(New)
	HLV.ScrollToPosition(0)
	HLV.notifyDataSetChanged
End Sub

Sub Search_Click
	MCode.IconView.SearchView.Start
	AcTxtSearch.Visible=True
	Key.ShowKeyboard(AcTxtSearch)
	LblBackSearch.Visible=True
	LblTitle.Visible=False
End Sub


'Sub LblSearchIcon_Click
'	AcTxtSearch.Visible=True
'	Key.ShowKeyboard(AcTxtSearch)
'	LblBackSearch.Visible=True
'	LblTitle.Visible=False
'End Sub

Sub LblBackSearch_Click
	LblBackSearch.Visible=False
	Anim.InitializeRotateCenter("",0,180,LblBackSearch)
	Anim.Duration=400
	Anim.Start(LblBackSearch)
	Sleep(400)
	LblTitle.Visible=True
	AcTxtSearch.Text=""
	AcTxtSearch.Visible=False
	Key.HideKeyboard
End Sub

Sub PnlJoziat_Click
	
End Sub