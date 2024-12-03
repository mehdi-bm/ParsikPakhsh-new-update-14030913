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
	Dim Glide As Hitex_Glide
	Dim jobInternet As HttpJob
	Dim PicZoom As PinchZoomAndMove
	Dim Anim As Animation
	Dim Utils As Hitex_Utils
	Dim Key As IME
	Dim PositionEntekhab As Int
	Dim ListKala,OriginalItemList As List
	
	Dim ItemEntekhab As AdapterListKala
	Private AcTxtSearch As ACEditText
	Private LblSearchIcon As Label
	Private LblBackSearch As Label
	Private LblTitle As Label
	Private PnlKalaTozih As Panel
	Private imgKala As ImageView
	Private LblNameKala As Label
	Private LblTedadDarKarton As Label
	Private AcBtnDownJoz As ACButton
	Private AcBtnUpJoz As ACButton
	Private AcBtnDownKol As ACButton
	Private AcBtnUpKol As ACButton
	Private MTxtTedadSabadKol As MaskedEditText
	Private MTxtTedadSabadJoz As MaskedEditText
	Private AcBtnAdd As ACButton
	Private LblBasketCount As Label
	Private LblBasket As Label
	Private LblFeeForooshS As Label
	Private PnlImage As Panel
	Private ImgFullScreen As ImageView
	Private LblMojoodi As Label
	Private LblTedadDarKartonS As Label
	Private LblMojoodiS As Label
	Private PnlTop As Panel
	Private LblmojoodiKarton As Label
	Private LblFeeForooshKarton As Label
	Private LblFeeForooshKartonS As Label
	Private LblmojoodiKartonS As Label
	Private LblGoroohKalaS As Label
	Private AcSpGoroohKala As ACSpinner
	Private PnlGoroohKala As Panel
	Private TxtFeeForoosh As EditText
	Private LblVahed As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Main_Kala")
	jobInternet.Initialize("jobInternet",Me)
	HLV.Initializer("HLV").GridView(2).Build
	Activity.AddView(HLV,0,20%y,100%x,70%y)
	ListKala.Initialize
	OriginalItemList.Initialize
	Key.Initialize("Key")
	LoadSpGoroohKala
	LoadOrginalListKala1
	ListKala = OriginalItemList
	HLV.Ripple.Color(0xFF909090)
	HLV.CardView.CardElevation(4dip).Radius(2dip)
	HLV.Show	
	MCode.IconView.SearchView.Create(Colors.Black,5,Colors.Gray)
	PnlTop.AddView(MCode.IconView.SearchView.View,90%x,2%y,8%x,8%x)
	MCode.IconView.OnClickListener(MCode.IconView.SearchView.View,"Search_Click")
	PicZoom.Initialize(ImgFullScreen,"img1","",1,3,3,False,Me)
	PicZoom.CanZoom=True
	PicZoom.CanMove=True
	PicZoom.LimitArea=True
End Sub

Sub LoadSpGoroohKala
	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala ORDER BY FldC_Gorooh")
	AcSpGoroohKala.Clear
	AcSpGoroohKala.Add("همه")
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		AcSpGoroohKala.Add(Dt.GetString("FldN_Gorooh"))
	Next
	AcSpGoroohKala.SelectedIndex = 0

End Sub

Sub LoadOrginalListKala1
	Dim Cu As Cursor = MCode.Result("Select FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,FldSumMande,FldTedadDarKarton,Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As FldFeeForoosh,FldMablaghMasrafKonande From TblKala order by FldGoroohKala")
	For i = 0 To Cu.RowCount - 1
		Dim Item As AdapterListKala
		Cu.Position=i
		Item.CodeKala=Cu.Getstring("FldCodeKala")
		Item.NameKala=Cu.Getstring("FldNameKala")
		Item.NameVahed=Cu.Getstring("FldNameVahed")
		Item.NameVahed2=Cu.Getstring("FldNameVahed2")
		Item.SumMande=Cu.Getstring("FldSumMande")
		Item.TedadDarKarton =Cu.Getstring("FldTedadDarKarton")
		Item.FeeForoosh=Cu.GetInt("FldFeeForoosh")
		Item.FldMablaghMasrafKonande=Cu.GetString("FldMablaghMasrafKonande")
		If Cu.Getstring("FldNameVahed2") <> "" Then
			Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("FldFeeForoosh"))
			Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.Getstring("FldTedadDarKarton"))
			Dim FldSumMande As Int = Cu.Getstring("FldSumMande")
			
			Item.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
			Item.SumMandeKarton=FldSumMande / FldTedadDarKarton
		End If
		OriginalItemList.Add(Item)
	Next
	ListKala.Clear
End Sub

Sub LoadOrginalListKala(C_GoroohKala As String)
	If C_GoroohKala = "All" Then
		Dim Cu As Cursor = MCode.Result("Select FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,FldSumMande,FldTedadDarKarton,Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As FldFeeForoosh From TblKala order by FldGoroohKala")
	Else
		Dim Cu As Cursor = MCode.Result("Select FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,FldSumMande,FldTedadDarKarton,Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As FldFeeForoosh From TblKala Where FldGoroohKala like '"& C_GoroohKala &"%' order by FldGoroohKala")
	End If
	If Cu.RowCount > 0 Then
		OriginalItemList.Clear
		For i = 0 To Cu.RowCount - 1
			Dim Item As AdapterListKala
			Cu.Position=i
			Item.CodeKala=Cu.Getstring("FldCodeKala")
			Item.NameKala=Cu.Getstring("FldNameKala")
			Item.NameVahed=Cu.Getstring("FldNameVahed")
			Item.NameVahed2=Cu.Getstring("FldNameVahed2")
			Item.SumMande=Cu.Getstring("FldSumMande")
			Item.TedadDarKarton =Cu.Getstring("FldTedadDarKarton")
			Item.FeeForoosh=Cu.Getstring("FldFeeForoosh")
			If Cu.Getstring("FldNameVahed2") <> "" Then
				Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Getstring("FldFeeForoosh"))
				Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.Getstring("FldTedadDarKarton"))
				Dim FldSumMande As Int = Cu.Getstring("FldSumMande")
				Item.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
				Item.SumMandeKarton=FldSumMande / FldTedadDarKarton
			End If
			OriginalItemList.Add(Item)
		Next
	Else
		OriginalItemList.Clear
	End If
	ListKala = OriginalItemList
	HLV.notifyDataSetChanged
End Sub

Sub RefreshLblSabad
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	If Cu.RowCount>0 Then
		LblBasketCount.Visible=True
		LblBasketCount.Text=Cu.RowCount
	Else
		LblBasketCount.Visible=False
	End If
End Sub

Sub HLV_GetItemCount As Int 								   
	Return ListKala.Size
End Sub

Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)   
	Dim ImageRow As ImageView
	ImageRow.Initialize("ImageRow")
	ImageRow.Gravity=Gravity.Fill
	Parent.AddView(ImageRow,3%x,1%y,40%x,25%y)
	Dim LblSharh As Label
	LblSharh.Initialize("LblSharh")
	LblSharh.TextColor=Colors.RGB(11,32,14)
	LblSharh.TextSize=15
	LblSharh.Gravity=Gravity.CENTER
	LblSharh.SingleLine=False
	LblSharh.Typeface=MCode.Font
	Parent.AddView(LblSharh,3%x,25%y,40%x,10%y)
	Dim ImgDivider As ImageView
	ImgDivider.Initialize("ImgDivider")
	ImgDivider.Gravity=Gravity.FILL
	ImgDivider.Bitmap=MCode.Divider
	Parent.AddView(ImgDivider,3%x,35%y,40%x,1dip)
	Dim LblMablaghFi As Label
	LblMablaghFi.Initialize("LblMablaghFi")
	LblMablaghFi.TextColor=Colors.RGB(70,210,114)
	LblMablaghFi.TextSize=15
	LblMablaghFi.Gravity=Gravity.CENTER
	LblMablaghFi.Typeface=MCode.Font
	Parent.AddView(LblMablaghFi,3%x,40%y,40%x,6%y)
	Dim ImgSabad As ImageView
	ImgSabad.Initialize("ImgSabad")
	ImgSabad.Gravity=Gravity.FILL
	ImgSabad.BringToFront
	ImgSabad.Bitmap=MCode.SabadImg
	Parent.AddView(ImgSabad,1%x,1%x,10%x,10%x)
	Dim LblTedadDarSabad As Label
	LblTedadDarSabad.Initialize("LblTedadDarSabad")
	LblTedadDarSabad.Width=5%x
	LblTedadDarSabad.Height=5%x
	LblTedadDarSabad.TextColor=Colors.Black
	LblTedadDarSabad.TextSize=15
	Dim G As Int
	G = Bit.And(Gravity.Center, Gravity.CENTER)
	LblTedadDarSabad.Gravity = G
	Dim Setting As ColorDrawable
	Setting.Initialize(Colors.Transparent,50dip)
	LblTedadDarSabad.Background = Setting
	LblTedadDarSabad.Typeface=MCode.Font
	LblTedadDarSabad.Text = 0
	Parent.AddView(LblTedadDarSabad,4%x,4%x,7%x,5%x)
End Sub

Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)   
	Dim Item = ListKala.Get(Position) As AdapterListKala
	
	Dim ImageRow  As ImageView = Parent.GetView(0)
	Glide.Load(File.DirRootExternal &"/Zomorod/AksKala",Item.CodeKala & ".jpg").Apply(Glide.RequestOptions.Placeholder(MCode.placeHolder)).Into(ImageRow)
	Dim LblSharh As Label  = Parent.getview(1)
	LblSharh.Text = Item.NameKala
	Dim ImgDivider  As ImageView = Parent.GetView(2)
	Dim LblMablaghFi As Label = Parent.GetView(3)
	LblMablaghFi.Text = NumberFormat((Item.FeeForoosh),0,3) & "  " & MCode.VahedPool
	Dim ImgSabad  As ImageView = Parent.GetView(4)
	Dim LblTedadDarSabad As Label  = Parent.getview(5)
	Dim Check As Boolean
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	For i=0 To Cu.RowCount - 1
		Cu.Position=i
		If Cu.GetString("FldCodeKala") = Item.CodeKala Then
			If Cu.GetString("FldTedadDarSabadJoz") > 0 Then
				LblTedadDarSabad.Text = Cu.GetString("FldTedadDarSabadJoz")
			Else If Cu.GetString("FldTedadDarSabadKol") > 0 Then
				LblTedadDarSabad.Text = Cu.GetString("FldTedadDarSabadKol")
			Else
				LblTedadDarSabad.Text = 0
			End If
			Item.TedadDarSabadjoz=Cu.GetString("FldTedadDarSabadJoz")
			Item.TedadDarSabadKol=Cu.GetString("FldTedadDarSabadKol")
			Check=True
			Exit
		Else
			LblTedadDarSabad.Text = 0
			Item.TedadDarSabadjoz=0
			Item.TedadDarSabadkol=0
		End If
	Next
	If Check=False Then
		LblTedadDarSabad.Text = 0
		Item.TedadDarSabadjoz=0
		Item.TedadDarSabadkol=0
	End If
	Parent.Top = 2%y
	Parent.Height = 48%y
	Parent.Left = 1.5%x
End Sub

Sub HLV_onScrollStateChanged (State As Int)
	Key.HideKeyboard
	PnlKalaTozih.Visible=False
End Sub

Sub HLV_ItemClick (ClickedItem As Panel, Position As Int)		'👆 ItemClick 👆'
	PositionEntekhab=Position
	ItemEntekhab=ListKala.Get(Position)
	Key.HideKeyboard
	
	If MCode.kalamanfi=0 Then
		If ItemEntekhab.SumMande=0 Then
			ToastMessageShow("این کالا در انبار موجود نمی باشد",True)
			Return
		End If
	End If
	PnlKalaTozih.Visible=True
	PnlKalaTozih.BringToFront
	MCode.AnimationOpen(PnlKalaTozih)
	LoadPnlKalaTozih
End Sub

Sub LoadPnlKalaTozih
	TxtFeeForoosh.Typeface=MCode.Font
	LblFeeForooshKarton.Typeface=MCode.Font
	LblTedadDarKarton.Typeface=MCode.Font
	LblMojoodi.Typeface=MCode.Font
	LblmojoodiKarton.Typeface=MCode.Font
	LblFeeForooshS.Typeface=MCode.Font
	LblFeeForooshKartonS.Typeface=MCode.Font
	LblTedadDarKartonS.Typeface=MCode.Font
	LblMojoodiS.Typeface=MCode.Font
	LblmojoodiKartonS.Typeface=MCode.Font
	MTxtTedadSabadJoz.Typeface=MCode.Font
	MTxtTedadSabadKol.Typeface=MCode.Font
	LblMojoodi.Typeface=MCode.Font
	LblNameKala.Text=ItemEntekhab.NameKala
	TxtFeeForoosh.Text=ItemEntekhab.FeeForoosh
	LblVahed.Text = MCode.VahedPool
	LblFeeForooshKarton.Text= NumberFormat(ItemEntekhab.FeeForooshKarton,0,3) & MCode.VahedPool
	LblTedadDarKarton.Text=ItemEntekhab.TedadDarKarton
	MTxtTedadSabadJoz.Text= ItemEntekhab.TedadDarSabadJoz
	MTxtTedadSabadKol.Text= ItemEntekhab.TedadDarSabadkol
	LblMojoodi.Text = ItemEntekhab.SumMande & " " & ItemEntekhab.NameVahed
	LblmojoodiKarton.Text = ItemEntekhab.SumMandeKarton & " " & ItemEntekhab.NameVahed2
	If Not(File.Exists(File.DirRootExternal &"/Zomorod/AksKala",ItemEntekhab.CodeKala & ".jpg")) Then
		imgKala.Bitmap = MCode.placeHolder
	Else
		imgKala.Bitmap=LoadBitmap(File.DirRootExternal &"/Zomorod/AksKala",ItemEntekhab.CodeKala & ".jpg")
	End If
	If ItemEntekhab.NameVahed2="" Then
		AcBtnDownKol.Enabled=False
		AcBtnUpKol.Enabled=False
		MTxtTedadSabadKol.Enabled=False
	Else
		AcBtnDownKol.Enabled=True
		AcBtnUpKol.Enabled=True
		MTxtTedadSabadKol.Enabled=True
	End If
	If MCode.TaghirFeeKala=0 Then
		TxtFeeForoosh.Enabled=False
	Else if MCode.TaghirFeeKala=1 Then
		TxtFeeForoosh.Enabled=True
	End If
End Sub

Sub PnlKalaTozih_Click
	
End Sub

Sub Activity_Resume
	HLV.notifyDataSetChanged
	RefreshLblSabad
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
		Else if PnlKalaTozih.Visible=True Then
			MTxtTedadSabadJoz.Text = 0
			MTxtTedadSabadKol.Text = 0
			PnlKalaTozih.Visible=False
			MCode.AnimationClose(PnlKalaTozih)
			Return True	
		Else if PnlImage.Visible=True Then
			PnlImage.Visible=False
			MCode.AnimationClose(PnlImage)
			
			PnlKalaTozih.Visible=True
			MCode.AnimationOpen(PnlKalaTozih)
			Return True
		Else	
			Activity.Finish
			MCode.SetAnimation("zoom_enter2", "zoom_exit2")
		End If
	End If
	Return True
End Sub

Sub AcTxtSearch_TextChanged (Old As String, New As String)
	ListKala = Utils.FilterSearchList("NameKala",OriginalItemList).Contains(New)
	HLV.ScrollToPosition(0)
	HLV.notifyDataSetChanged
End Sub

Sub Search_Click
	MCode.IconView.SearchView.Start
	AcTxtSearch.Visible=True
	Key.ShowKeyboard(AcTxtSearch)
	LblBackSearch.Visible=True
	LblTitle.Visible=False
	PnlKalaTozih.Visible=False
End Sub

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

Sub AcBtnAdd_Click
	If MTxtTedadSabadJoz.Text = "" Then
		MTxtTedadSabadJoz.Text = 0
	End If
	If MTxtTedadSabadKol.Text = "" Then
		MTxtTedadSabadKol.Text = 0
	End If
	
	If MCode.kalamanfi=0 Then
		If MTxtTedadSabadJoz.Text > ItemEntekhab.SumMande Then
			ToastMessageShow("تعداد کالای انتخابی نمی تواند بیشتر از موجودی انبار باشد",True)
			Return
		Else If MTxtTedadSabadKol.Text > ItemEntekhab.SumMandeKarton Then
			ToastMessageShow("تعداد کالای انتخابی نمی تواند بیشتر از موجودی انبار باشد",True)
			Return
		End If
	End If
		ItemEntekhab.FeeForoosh=TxtFeeForoosh.text
		AddToSabad
		HLV.notifyItemChanged(PositionEntekhab)
		MCode.CheckChangeSabad=True
		Key.HideKeyboard
End Sub

Sub AddToSabad
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	Dim Check As Boolean
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		If Cu.GetString("FldCodeKala") = ItemEntekhab.CodeKala Then
			If MTxtTedadSabadJoz.Text = 0 And MTxtTedadSabadKol.Text = 0 Then
				MCode.SaveUpdate("Delete From TblSabad Where FldCodeKala = '"& ItemEntekhab.CodeKala &"'")
			Else
				MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadJoz = '"& ItemEntekhab.TedadDarSabadjoz &"',FldTedadDarSabadKol = '"& ItemEntekhab.TedadDarSabadkol &"' Where FldCodeKala = '"& ItemEntekhab.CodeKala &"'")
			End If
			Check = True
			Exit
		End If
	Next
	If Check = False Then
		If MTxtTedadSabadJoz.Text > 0 Or MTxtTedadSabadKol.Text > 0 Then
			MCode.SaveUpdate("Insert Into TblSabad (FldCodeKala,FldNameKala,FldTedadDarkarton,FldFeeForoosh,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldNameVahed,FldNameVahed2) Values ('"& _
			 ItemEntekhab.CodeKala &"','"& ItemEntekhab.NameKala &"','"& ItemEntekhab.TedadDarKarton &"','"& ItemEntekhab.FeeForoosh &"','"& _
			  ItemEntekhab.TedadDarSabadJoz &"','"& ItemEntekhab.TedadDarSabadKol &"','"& ItemEntekhab.NameVahed &"','"& ItemEntekhab.NameVahed2 &"')")
		Else if MTxtTedadSabadJoz.Text = 0 Or MTxtTedadSabadKol.Text = 0 Then

		End If
	End If
	LblBasketCount.Visible=True
	PnlKalaTozih.Visible=False
	MCode.AnimationClose(PnlKalaTozih)
	MTxtTedadSabadJoz.Text=0
	MTxtTedadSabadKol.Text=0
	RefreshLblSabad
End Sub

Sub AcBtnUpKol_Click
	Dim A As Int = 0
	If MTxtTedadSabadKol.Text = "" Then
		MTxtTedadSabadKol.Text=0
	End If
	A = MTxtTedadSabadKol.Text
	A = A + 1
	If MCode.kalamanfi=0 Then
		If A > ItemEntekhab.SumMandeKarton Then
			ToastMessageShow("تعداد کالای انتخابی نمی تواند بیشتر از موجودی انبار باشد",True)
			Return
		End If
	End If
	MTxtTedadSabadKol.Text = A
	ItemEntekhab.TedadDarSabadkol = A
	ItemEntekhab.FeeForoosh=TxtFeeForoosh.text
End Sub

Sub AcBtnDownKol_Click
	Dim A As Int = 0
	If MTxtTedadSabadKol.Text = "" Then
		MTxtTedadSabadKol.Text=0
	End If
	A = MTxtTedadSabadKol.Text
	If A > 0 Then
		A = A - 1
		MTxtTedadSabadKol.Text = A
		ItemEntekhab.TedadDarSabadkol = A
		ItemEntekhab.FeeForoosh=TxtFeeForoosh.text
	End If
End Sub

Sub AcBtnUpJoz_Click
	Dim A As Int = 0
	If MTxtTedadSabadJoz.Text = "" Then
		MTxtTedadSabadJoz.Text=0
	End If
	A = MTxtTedadSabadJoz.Text
	A = A + 1
	If MCode.kalamanfi=0 Then
		If A > ItemEntekhab.SumMande Then
			ToastMessageShow("تعداد کالای انتخابی نمی تواند بیشتر از موجودی انبار باشد",True)
			Return
		End If	
	End If
	MTxtTedadSabadJoz.Text = A
	ItemEntekhab.TedadDarSabadJoz = A
	ItemEntekhab.FeeForoosh=TxtFeeForoosh.text
End Sub

Sub AcBtnDownJoz_Click
	Dim A As Int = 0
	If MTxtTedadSabadJoz.Text = "" Then
		MTxtTedadSabadJoz.Text=0
	End If
	A = MTxtTedadSabadJoz.Text
	If A > 0 Then
		A = A - 1
		MTxtTedadSabadJoz.Text = A
		ItemEntekhab.TedadDarSabadjoz = A 
		ItemEntekhab.FeeForoosh=TxtFeeForoosh.text
	End If
End Sub

Sub LblBasket_Click
	If LblBasketCount.Visible=True Then
		'StartActivity(Act_Sabad)
		MCode.SetAnimation("zoom_enter1", "zoom_exit1")
	End If
End Sub

Sub LblBasketCount_Click
	If LblBasketCount.Visible=True Then
		'StartActivity(Act_Sabad)
		MCode.SetAnimation("zoom_enter1", "zoom_exit1")
	End If
End Sub

Sub ImgFullScreen_Click
	
End Sub

Sub TxtFeeForoosh_Click
	CallSubDelayed(Me, "TxtFeeForoosh_SelectText")
End Sub

Sub TxtFeeForoosh_SelectText
	DoEvents
	TxtFeeForoosh.SelectAll
	DoEvents
	TxtFeeForoosh.SelectAll
End Sub

Sub AcSpGoroohKala_ItemClick (Position As Int, Value As Object)
	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh From TblGoroohKala")
	If Position=0 Then
		AcSpGoroohKala.Tag = "All"
	Else
		Dt.Position = Position - 1
		AcSpGoroohKala.Tag = Dt.GetString("FldC_Gorooh")
	End If
	LoadOrginalListKala(AcSpGoroohKala.Tag)
End Sub

Sub MTxtTedadSabadKol_TextChanged(Old As String, New As String)
	If New = "" Then
		ItemEntekhab.TedadDarSabadKol=0
	Else
		ItemEntekhab.TedadDarSabadKol=New
	End If
End Sub

Sub MTxtTedadSabadJoz_TextChanged(Old As String, New As String)
	If New = "" Then
		ItemEntekhab.TedadDarSabadJoz=0
	Else
		ItemEntekhab.TedadDarSabadJoz=New
	End If
End Sub

Sub imgKala_Click
	If File.Exists(File.DirRootExternal &"/Zomorod/AksKala",ItemEntekhab.CodeKala & ".jpg") = True Then
		ImgFullScreen.Bitmap=LoadBitmapResize(File.DirRootExternal &"/Zomorod/AksKala",ItemEntekhab.CodeKala & ".jpg",ImgFullScreen.Width,ImgFullScreen.Height,True)
	Else
		ImgFullScreen.Bitmap = MCode.placeHolder
	End If
	PnlKalaTozih.Visible=False
	MCode.AnimationClose(PnlKalaTozih)
	PnlImage.Visible=True
	PnlImage.BringToFront
	MCode.AnimationOpen(PnlImage)

End Sub