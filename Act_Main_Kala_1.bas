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
	
	Dim HLVGoroohKala As Hitex_LayoutView
	Dim HLVKala As Hitex_LayoutView
	Dim LSVGoroohKala As ListView
	Dim Utils As Hitex_Utils
	Dim Glide As Hitex_Glide
	Dim Key As IME
	Dim Anim As Animation
	Dim PicZoom As PinchZoomAndMove
	Dim ListGoroohKala,OriginalListGoroohKala As List
	Dim ListKala,OriginalListKala As List
	Dim ItemEntekhab As AdapterListKala
	Dim PositionEntekhab As Int
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
	Private LblBasket As ImageView
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
	Private TxtFeeForoosh As EditText
	Private LblVahed As Label
	Private txtTozihat As ACEditText
	Dim bmp1 As BitmapDrawable
	Dim maxkolRond As Long

End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Main_Kala1")
	HLVGoroohKala.Initializer("HLVGoroohKala").ListView.Build
	'HLVGoroohKala.Initializer("HLVGoroohKala").GridView(1).Build
	LSVGoroohKala.Initialize("LSVGoroohKala")
	HLVKala.Initializer("HLVKala").GridView(1).Build
	Activity.AddView(HLVGoroohKala,60%x,10%y,40%x,80%y)
	Activity.AddView(HLVKala,0%x,10%y,60%x,80%y)
	'bmp1.Initialize(LoadBitmap(File.DirAssets,"button4.png"))
	'HLVGoroohKala.Background=bmp1
	Key.Initialize("Key")
	ListGoroohKala.Initialize
	OriginalListGoroohKala.Initialize
	ListKala.Initialize
	OriginalListKala.Initialize
	LoadListGoroohKala
	HLVGoroohKala.CardView.BackgroundColor(Colors.Transparent)
	HLVGoroohKala.Ripple.Color(0x8aacc8)
	'HLVGoroohKala.Divider.Add1(Colors.Gray,1dip)
	HLVGoroohKala.CardView.CardElevation(4dip).Radius(5dip)
	HLVGoroohKala.Show
	HLVKala.Ripple.Color(0x8aacc8)
	
	HLVKala.Divider.Add1(Colors.Gray,5dip)
	HLVKala.Show
	MCode.IconView.SearchView.Create(Colors.Black,5,Colors.Gray)
	PnlTop.AddView(MCode.IconView.SearchView.View,90%x,2%y,8%x,8%x)
	MCode.IconView.OnClickListener(MCode.IconView.SearchView.View,"Search_Click")
	PicZoom.Initialize(ImgFullScreen,"img1","",1,3,3,False,Me)
	PicZoom.CanZoom=True
	PicZoom.CanMove=True
	PicZoom.LimitArea=True

	'LSVGoroohKala.SingleLineLayout.Label.Color=Colors.RGB(10,167,148)

End Sub




Sub LoadListGoroohKala
	'LSVGoroohKala.Clear
	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		Dim Item As AdapterGoroohKala
		Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
		Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
		OriginalListGoroohKala.Add(Item)
'		LSVGoroohKala.AddSingleLine2(Item.FldN_Gorooh,i)
	Next
	
	ListGoroohKala = OriginalListGoroohKala
	bmp1.Initialize(LoadBitmap(File.DirAssets,"button4.png"))
	
	LSVGoroohKala.Height=80%y
	LSVGoroohKala.Width=40%x
	LSVGoroohKala.SingleLineLayout.Label.Gravity=Gravity.CENTER_HORIZONTAL
	LSVGoroohKala.SingleLineLayout.ItemHeight=15%y
	LSVGoroohKala.SingleLineLayout.Background=bmp1
	LSVGoroohKala.SingleLineLayout.Label.Height=80%y
	LSVGoroohKala.SingleLineLayout.Label.Width=50%x
	LSVGoroohKala.SingleLineLayout.Label.Top=5%y
	LSVGoroohKala.SingleLineLayout.Label.Left=-10%x
	LSVGoroohKala.SingleLineLayout.Label.TextColor=Colors.RGB(48,71,98)
	LSVGoroohKala.SingleLineLayout.Label.TextSize=14
End Sub

Sub HLVGoroohKala_GetItemCount As Int
	Return ListGoroohKala.Size
End Sub



Sub HLVGoroohKala_onBindViewHolder (Parent As Panel, Position As Int)
	Dim Item = ListGoroohKala.Get(Position) As AdapterGoroohKala
	Dim LblSharh As Label  = Parent.getview(0)
	LblSharh.Text = Item.FldN_Gorooh
	Parent.Height = 10%y
End Sub
Sub LSVGoroohKala_ItemClick (Position As Int, Value As Object)
	
	LoadGoroohKalaGo(Position)
	LoadListGoroohKala
	LSVGoroohKala.SingleLineLayout.Label.SetLayout(40%x,10%y,40%x,80%y)
End Sub
Sub HLVGoroohKala_ItemClick (ClickedItem As Panel, Position As Int)
	LoadGoroohKalaGo(Position)
End Sub
'
Sub LoadGoroohKalaGo(Position As Int)
	Dim Item = ListGoroohKala.Get(Position) As AdapterGoroohKala
	LoadKala(Item.FldC_Gorooh)
	Dim Count As Int = Item.FldC_Gorooh.Length + 3
	Dim Dt As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& Item.FldC_Gorooh &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
	If Dt.RowCount>0 Then
		OriginalListGoroohKala.Clear
		For i=0 To Dt.RowCount-1
			Dt.Position=i
			Dim Item As AdapterGoroohKala
			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
			OriginalListGoroohKala.Add(Item)
			MCode.C_LayeKala=Item.FldC_Gorooh
		Next
		ListGoroohKala = OriginalListGoroohKala
		HLVGoroohKala.notifyDataSetChanged
	End If

End Sub

Sub LoadKala(C_Kala As String)
	If MCode.NamayeshKalaSefr = 1 Then
		Dim Cu As Cursor = MCode.Result("Select FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,FldSumMande,FldTedadDarKarton,Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As FldFeeForoosh From TblKala Where FldGoroohKala like '"& C_Kala &"%' order by FldGoroohKala")
	Else If MCode.NamayeshKalaSefr = 0 Then
		Dim Cu As Cursor = MCode.Result("Select FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,FldSumMande,FldTedadDarKarton,Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As FldFeeForoosh From TblKala Where FldGoroohKala like '"& C_Kala &"%' And FldSumMande > 0 order by FldGoroohKala")
	End If
	'Dim Cu As Cursor = MCode.Result("Select FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,FldSumMande,FldTedadDarKarton,Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As FldFeeForoosh From TblKala Where FldGoroohKala like '"& C_Kala &"%' order by FldGoroohKala")
	OriginalListKala.Clear
	If Cu.RowCount > 0 Then
		For i = 0 To Cu.RowCount - 1
			Dim ItemKala As AdapterListKala
			Cu.Position=i
			ItemKala.CodeKala=Cu.Getstring("FldCodeKala")
			ItemKala.NameKala=Cu.Getstring("FldNameKala")
			ItemKala.NameVahed=Cu.Getstring("FldNameVahed")
			ItemKala.NameVahed2=Cu.Getstring("FldNameVahed2")
			ItemKala.SumMande=Cu.Getstring("FldSumMande")
			ItemKala.TedadDarKarton =Cu.Getstring("FldTedadDarKarton")
			ItemKala.FeeForoosh=Cu.GetInt("FldFeeForoosh")
			If Cu.Getstring("FldNameVahed2") <> "" Then
				Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("FldFeeForoosh"))
				Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.Getstring("FldTedadDarKarton"))
				Dim FldSumMande As Int = Cu.Getstring("FldSumMande")
				ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
				ItemKala.SumMandeKarton=Round2( FldSumMande / FldTedadDarKarton,0)
			End If
			OriginalListKala.Add(ItemKala)
		Next
	End If
	ToastMessageShow("تعداد کالای زیر مجموعه " & "  " & Cu.RowCount,True)
	ListKala = OriginalListKala
	HLVKala.notifyDataSetChanged
End Sub

Sub LoadGoroohKalaBack(Code As String)
	Dim C_Gorooh As String = MCode.Sf.Left(Code,Code.Length-6)
	Dim Count As Int = C_Gorooh.Length + 3
	Dim Dt As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& C_Gorooh &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
	If Dt.RowCount>0 Then
		OriginalListGoroohKala.Clear
		For i=0 To Dt.RowCount-1
			Dt.Position=i
			Dim Item As AdapterGoroohKala
			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
			OriginalListGoroohKala.Add(Item)
			MCode.C_LayeKala=Item.FldC_Gorooh
		Next
		ListGoroohKala = OriginalListGoroohKala
		HLVGoroohKala.notifyDataSetChanged
	End If
	ListKala.Clear
	HLVKala.notifyDataSetChanged
End Sub

Sub HLVKala_GetItemCount As Int
	Return ListKala.Size
End Sub
'Sub HLVGoroohKala_onCreateViewHolder (Parent As Panel, ViewType As Int)
'	Dim LblSharh As Label
'	LblSharh.Initialize("LblSharh")
'	LblSharh.TextColor=Colors.black
'	LblSharh.TextSize=20
'	LblSharh.Gravity=Gravity.CENTER
'	LblSharh.SingleLine=False
'	LblSharh.Typeface= MCode.Font
'	Parent.AddView(LblSharh,3%x,1%y,35%x,8%y)
'End Sub
Sub HLVGoroohKala_onCreateViewHolder (Parent As Panel, ViewType As Int)
	Dim LblSharh As Label
	LblSharh.Initialize("LblSharh")
	LblSharh.TextColor=Colors.black
	LblSharh.TextSize=20
	LblSharh.Gravity=Gravity.CENTER
	LblSharh.SingleLine=False
	bmp1.Initialize(LoadBitmap(File.DirAssets,"button4.png"))
	LblSharh.Background=bmp1
	LblSharh.Typeface= MCode.Font
	Parent.AddView(LblSharh,3%x,1%y,35%x,8%y)
End Sub
Sub HLVKala_onCreateViewHolder (Parent As Panel, ViewType As Int)
	Dim ImageRow As ImageView
	ImageRow.Initialize("ImageRow")
	ImageRow.Gravity=Gravity.Fill
	Parent.AddView(ImageRow,1%x,1%y,55%x,25%y)
	Dim LblSharh As Label
	LblSharh.Initialize("LblSharh")
	LblSharh.TextColor=Colors.RGB(11,32,14)
	LblSharh.TextSize=17
	LblSharh.Gravity=Gravity.CENTER
	LblSharh.SingleLine=False
	LblSharh.Typeface=MCode.Font
	Parent.AddView(LblSharh,3%x,25%y,53%x,10%y)
	Dim ImgDivider As ImageView
	ImgDivider.Initialize("ImgDivider")
	ImgDivider.Gravity=Gravity.FILL
	'ImgDivider.Bitmap=MCode.Divider
	Parent.AddView(ImgDivider,3%x,35%y,53%x,1dip)
	Dim LblMablaghFi As Label
	LblMablaghFi.Initialize("LblMablaghFi")
	LblMablaghFi.TextColor=Colors.black
	LblMablaghFi.TextSize=20
	LblMablaghFi.Gravity=Gravity.CENTER
	LblMablaghFi.Typeface=MCode.Font
	Parent.AddView(LblMablaghFi,3%x,36%y,53%x,6%y)
	Dim ImgSabad As ImageView
	ImgSabad.Initialize("ImgSabad")
	ImgSabad.Gravity=Gravity.FILL
	ImgSabad.BringToFront
	ImgSabad.Bitmap=MCode.SabadImg
	Parent.AddView(ImgSabad,1%x,1%x,10%x,10%x)
	Dim LblTedadDarSabad As Label
	LblTedadDarSabad.Initialize("LblTedadDarSabad")
	LblTedadDarSabad.Width=6%x
	LblTedadDarSabad.Height=6%y
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
	Parent.AddView(LblTedadDarSabad,5%x,5%x,7%x,5%x)
End Sub

Sub HLVKala_onBindViewHolder (Parent As Panel, Position As Int)
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
	Parent.Height = 45%y
	Parent.Left = 1.5%x
End Sub

Sub HLVKala_onScrollStateChanged (State As Int)
	Key.HideKeyboard
	PnlKalaTozih.Visible=False
End Sub

Sub HLVKala_ItemClick (ClickedItem As Panel, Position As Int)
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
	Dim Num As Int = ItemEntekhab.FeeForoosh
	TxtFeeForoosh.Text=Num
	'TxtFeeForoosh.Text=MCode.qomaAshar(TxtFeeForoosh.Text)
	LblVahed.Text = MCode.VahedPool
	If  ItemEntekhab.FeeForooshKarton <> Null Then
		LblFeeForooshKarton.Text= NumberFormat(ItemEntekhab.FeeForooshKarton,0,3) & MCode.VahedPool
	Else
		LblFeeForooshKarton.Text="-"
	End If

	LblTedadDarKarton.Text=ItemEntekhab.TedadDarKarton
	MTxtTedadSabadJoz.Text= ItemEntekhab.TedadDarSabadJoz
	MTxtTedadSabadKol.Text= ItemEntekhab.TedadDarSabadkol
	maxkolRond=(ItemEntekhab.SumMande/ItemEntekhab.TedadDarKarton)
	Log(maxkolRond)
	LblMojoodi.Text = ItemEntekhab.SumMande & " " & ItemEntekhab.NameVahed
	
	If  ItemEntekhab.SumMandeKarton <> Null Then
		LblmojoodiKarton.Text = maxkolRond & " " & ItemEntekhab.NameVahed2
	Else
		LblmojoodiKarton.Text ="-"
		ItemEntekhab.SumMandeKarton = 0
	End If
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

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		If PnlImage.Visible=True Then
			PnlImage.Visible=False
			MCode.AnimationClose(PnlImage)
			PnlKalaTozih.Visible=True
			MCode.AnimationOpen(PnlKalaTozih)
			Return True
		Else if PnlKalaTozih.Visible=True Then
			MTxtTedadSabadJoz.Text = 0
			MTxtTedadSabadKol.Text = 0
			PnlKalaTozih.Visible=False
			MCode.AnimationClose(PnlKalaTozih)
			Return True
		Else If AcTxtSearch.Visible=True Then
			If AcTxtSearch.Text<>"" Then
				AcTxtSearch.Text = ""
				Return True
			Else
				LblBackSearch.Visible=False
				LblTitle.Visible=True
				AcTxtSearch.Visible=False
				Return True
			End If
		Else If MCode.C_LayeKala.Length > 3 Then
			LoadGoroohKalaBack(MCode.C_LayeKala)
			Return True
		Else
			MCode.C_LayeKala=""
			Activity.Finish
			MCode.SetAnimation("zoom_enter2", "zoom_exit2")
		End If
	End If
	Return True
End Sub

Sub AcTxtSearch_TextChanged (Old As String, New As String)
	ListKala = Utils.FilterSearchList("NameKala",OriginalListKala).Contains(New)
	HLVKala.ScrollToPosition(0)
	HLVKala.notifyDataSetChanged
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
	ItemEntekhab.FeeForoosh= TxtFeeForoosh.text
	ItemEntekhab.Tozihat=txtTozihat.Text
	AddToSabad
	HLVKala.notifyItemChanged(PositionEntekhab)
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
			MCode.SaveUpdate("Insert Into TblSabad (FldCodeKala,FldNameKala,FldTedadDarkarton,FldFeeForoosh,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldNameVahed,FldNameVahed2,FldTozihat) Values ('"& _
			 ItemEntekhab.CodeKala &"','"& ItemEntekhab.NameKala &"','"& ItemEntekhab.TedadDarKarton &"',"& ItemEntekhab.FeeForoosh &",'"& _
			  ItemEntekhab.TedadDarSabadJoz &"','"& ItemEntekhab.TedadDarSabadKol &"','"& ItemEntekhab.NameVahed &"','"& ItemEntekhab.NameVahed2 &"','"& ItemEntekhab.Tozihat &"')")
		Else if MTxtTedadSabadJoz.Text = 0 Or MTxtTedadSabadKol.Text = 0 Then

		End If
	End If
	LblBasketCount.Visible=True
	PnlKalaTozih.Visible=False
	MCode.AnimationClose(PnlKalaTozih)
	txtTozihat.Text=""
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
	If A<maxkolRond Then
	A = A + 1
	End If
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

Sub RefreshLblSabad
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	If Cu.RowCount>0 Then
		LblBasketCount.Visible=True
		LblBasketCount.Text=Cu.RowCount
	Else
		LblBasketCount.Visible=False
	End If
End Sub

Sub MTxtTedadSabadKol_TextChanged(Old As String, New As String)

	If ItemEntekhab.TedadDarSabadJoz <> 0 Then
		ItemEntekhab.TedadDarSabadKol=0
		MTxtTedadSabadKol.Text=0
	Else
		ItemEntekhab.TedadDarSabadKol=New
	End If
End Sub

Sub MTxtTedadSabadJoz_TextChanged(Old As String, New As String)
	If ItemEntekhab.TedadDarSabadKol<>0 Then
		ItemEntekhab.TedadDarSabadJoz=0
		MTxtTedadSabadJoz.Text=0
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

Sub Activity_Resume
	HLVKala.notifyDataSetChanged
	RefreshLblSabad
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


