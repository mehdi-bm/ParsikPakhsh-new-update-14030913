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
	Private MTxtTedadSabadKol As AutoCompleteEditText
	Private MTxtTedadSabadJoz As AutoCompleteEditText
	Private AcBtnAdd As ACButton
	Private LblBasketCount As Label
	Private LblBasket As ImageView
	Private LblFeeForooshS As Label
	Private PnlImage As Panel
	Dim ListKalaKol As List
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
	Dim noeLoadKala As String
	Dim orderkala As String
	Private SpOrderKala As ACSpinner
	Private txtMablaghMasrafKonande As AutoCompleteEditText
	Dim MablaghMasrafKonande As String
	Private LblVahed1 As Label
	Private lblCodeKala As Label
	Dim CodeGroup As String
	Dim pnlGroupKala As Panel
	Dim CodeGroupSelected As String
	Dim pico As Picasso
	Dim t1 As Timer
	Dim tcount As Int
	Private btnUpdate As Button
	Dim hlv As Hitex_LayoutView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Main_Kala2")
	'HLVGoroohKala.Initializer("HLVGoroohKala").ListView.Build
'	Wait For update_data
	
	
	HLVGoroohKala.Initializer("HLVGoroohKala").ListView.Horizontal.RTL.Build
	HLVKala.Initializer("HLVKala").GridView(1).Build
	HLVGoroohKala.Ripple.Color(0x8aacc8)
	'HLVGoroohKala.CardView.CardElevation(2dip).Radius(5dip)
	HLVGoroohKala.Color=Colors.Transparent
	'HLVGoroohKala.Color=Colors.LightGray
	HLVGoroohKala.Height=8%y
	HLVGoroohKala.SpacingItemDecoration(5,True)
	HLVKala.Ripple.Color(0x8aacc8)
	'HLVKala.Divider.Add2(Colors.Gray,5dip,12dip,19dip)
	HLVKala.Divider.Add1(Colors.Gray,5dip)
	HLVKala.CardView.CardElevation(4dip).Radius(5dip)
	HLVKala.SpacingItemDecoration(10,False)
	
	pnlGroupKala.Initialize("pnlGroupKala")
	pico.Initialize
	Activity.AddView(pnlGroupKala,0,10%y,100%x,15%y)
	pnlGroupKala.AddView(HLVGoroohKala,0,1%y,100%x,10%y)
	Activity.AddView(HLVKala,0%x,20%y,100%x,80%y)
	'bmp1.Initialize(LoadBitmap(File.DirAssets,"button4.png"))
	'HLVGoroohKala.Background=bmp1
	Key.Initialize("Key")
	
	t1.Initialize("t1",1000)
	tcount=3
	t1.Enabled=True
	
		
	
	

		'StartActivity(Me)

	'LSVGoroohKala.SingleLineLayout.Label.Color=Colors.RGB(10,167,148)

End Sub
Sub t1_Tick
	If tcount > 0 Then
		tcount=tcount-1
		LoadData
		Else
			t1.Enabled=False
	End If
	
End Sub

Sub LoadData
	update_data
	
	ListGoroohKala.Initialize
	OriginalListGoroohKala.Initialize
	ListKala.Initialize
	OriginalListKala.Initialize
	SpOrderKala.Add("کد کالا")
	SpOrderKala.Add("نام کالا")
	SpOrderKala.SelectedIndex=0
	orderkala=" fldCodeKala"
	
	LoadListGoroohKala
	
	

	HLVGoroohKala.Show
	

	HLVKala.Show
	LoadKala(100)
	MCode.IconView.SearchView.Create(Colors.Black,5,Colors.Gray)
	PnlTop.AddView(MCode.IconView.SearchView.View,90%x,2%y,8%x,8%x)
	MCode.IconView.OnClickListener(MCode.IconView.SearchView.View,"Search_Click")
	PicZoom.Initialize(ImgFullScreen,"img1","",1,3,3,False,Me)
	PicZoom.CanZoom=True
	PicZoom.CanMove=True
	PicZoom.LimitArea=True
	RefreshLblSabad
	HLVKala.notifyDataSetChanged
End Sub


Sub LoadListGoroohKala
	'LSVGoroohKala.Clear
	
	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		Dim Item As AdapterGoroohKala
		Dim cu As Cursor
		
		cu=MCode.Result("Select fldCodeKala From TblKala where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") & "%'")
		If cu.RowCount>0 Then
			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
			OriginalListGoroohKala.Add(Item)
		End If
'		LSVGoroohKala.AddSingleLine2(Item.FldN_Gorooh,i)
	Next
	
	ListGoroohKala = OriginalListGoroohKala
End Sub

Sub HLVGoroohKala_GetItemCount As Int
	Return ListGoroohKala.Size
End Sub


Sub HLVGoroohKala_onCreateViewHolder (Parent As Panel, ViewType As Int)
	Dim LblSharh As Label
	LblSharh.Initialize("LblSharh")
	LblSharh.TextColor=Colors.black
	LblSharh.TextSize=20
	LblSharh.Gravity=Gravity.CENTER
	LblSharh.SingleLine=False
	LblSharh.Typeface= MCode.Font
	bmp1.Initialize(LoadBitmap(File.DirAssets,"button4.png"))
	LblSharh.Background=bmp1
	Parent.AddView(LblSharh,0,0,43%x,8%y)
End Sub
Sub HLVGoroohKala_onBindViewHolder (Parent As Panel, Position As Int)
	Dim Item = ListGoroohKala.Get(Position) As AdapterGoroohKala
	Dim LblSharh As Label  = Parent.getview(0)
	LblSharh.Text = Item.FldN_Gorooh
	
'	Parent.Top=13%y
	Parent.Height = 8%y
	Parent.Width=43%x

	
	Parent.Color=Colors.RGB(238,238,238)
End Sub
Sub LSVGoroohKala_ItemClick (Position As Int, Value As Object)
	
	LoadGoroohKalaGo(Position)
	LoadListGoroohKala
	'LSVGoroohKala.SingleLineLayout.Label.SetLayout(40%x,10%y,40%x,80%y)
End Sub
Sub HLVGoroohKala_ItemClick (ClickedItem As Panel, Position As Int)
	If Position<>-1 Then
		LoadGoroohKalaGo(Position)
	End If
	'update_data
End Sub
'
Sub LoadGoroohKalaGo(Position As Int)
	Dim Item = ListGoroohKala.Get(Position) As AdapterGoroohKala
	noeLoadKala="LoadKala"
	CodeGroup=Item.FldC_Gorooh
	LoadKala(Item.FldC_Gorooh)

	Dim Count As Int = Item.FldC_Gorooh.Length + 3
	Dim Dt As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& Item.FldC_Gorooh &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
	'Dim Dr As Cursor=MCode.Result("Select * from TblGoroohKala")
	'Log(Dr.RowCount)
	If Dt.RowCount>0 Then
		OriginalListGoroohKala.Clear
		For i=0 To Dt.RowCount-1
			Dt.Position=i
			Dim Item As AdapterGoroohKala
			Dim cu As Cursor
			cu=MCode.Result("Select fldCodeKala From TblKala where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") & "%'")
			If cu.RowCount>0 Then
				Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
				Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
				OriginalListGoroohKala.Add(Item)
				MCode.C_LayeKala=Item.FldC_Gorooh
			End If
		Next
		ListGoroohKala = OriginalListGoroohKala
		HLVGoroohKala.notifyDataSetChanged
		
	End If

End Sub
#Region LoadKalaKol
Sub LoadKalaKol
	If MCode.NamayeshKalaSefr = 1 Then
		Dim Cu As Cursor = MCode.Result("Select fldCodeKala,fldNameKala,fldNameVahed,fldNameVahed2,SumMande,fldTedadDarKarton,Round(fldFeeForoosh,'"& MCode.RaghamAshar &"') As fldFeeForoosh,Round(fldGhymatMasrafkonande,'"& MCode.RaghamAshar &"') As fldGhymatMasrafkonande,fldPathPic From TblKala order by fldCodeGroup")
	Else If MCode.NamayeshKalaSefr = 0 Then
		Dim Cu As Cursor = MCode.Result("Select fldCodeKala,fldNameKala,fldNameVahed,fldNameVahed2,SumMande,fldTedadDarKarton,Round(fldFeeForoosh,'"& MCode.RaghamAshar &"') As fldFeeForoosh,Round(fldGhymatMasrafkonande,'"& MCode.RaghamAshar &"') As fldGhymatMasrafkonande,fldPathPic From TblKala Where SumMande > 0 order by fldCodeGroup")
	End If
	'Dim Cu As Cursor = MCode.Result("Select FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,SumMande,FldTedadDarKarton,Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As FldFeeForoosh From TblKala Where FldGoroohKala like '"& C_Kala &"%' order by FldGoroohKala")
	OriginalListKala.Clear
	If Cu.RowCount > 0 Then
		For i = 0 To Cu.RowCount - 1
			Dim ItemKala As AdapterListKala
			Cu.Position=i
			ItemKala.CodeKala=Cu.Getstring("fldCodeKala")
			ItemKala.NameKala=Cu.Getstring("fldNameKala")
			ItemKala.NameVahed=Cu.Getstring("fldNameVahed")
			ItemKala.NameVahed2=Cu.Getstring("fldNameVahed2")
			ItemKala.SumMande=Cu.Getstring("SumMande")
			ItemKala.TedadDarKarton =Cu.Getstring("fldTedadDarKarton")
			ItemKala.FeeForoosh=Cu.GetInt("fldFeeForoosh")
			ItemKala.FldMablaghMasrafKonande=Cu.GetString("fldGhymatMasrafkonande")
			If Cu.GetString("fldPathPic")<>Null Then
				ItemKala.fldPathPic=Cu.GetString("fldPathPic")
			Else
				ItemKala.fldPathPic="0"
			End If
			If Cu.Getstring("fldNameVahed2") <> "" Then
				Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("fldFeeForoosh"))
				Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.Getstring("fldTedadDarKarton"))
				Dim SumMande As Int = Cu.Getstring("SumMande")
				ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
				ItemKala.SumMandeKarton=Round2( SumMande / FldTedadDarKarton,0)
			End If
			OriginalListKala.Add(ItemKala)
		Next
	End If
	'ToastMessageShow("تعداد کالای زیر مجموعه " & "  " & Cu.RowCount,True)
	ListKala = OriginalListKala
	ListKalaKol=OriginalListKala
	HLVKala.notifyDataSetChanged
End Sub
#End Region
Sub LoadKala(C_Kala As String)
	If noeLoadKala<>"Search" Then
		If MCode.NamayeshKalaSefr = 1 Then
			Dim Cu As Cursor = MCode.Result("Select fldCodeKala,fldNameKala,fldNameVahed,fldNameVahed2,SumMande,fldTedadDarKarton,Round(fldFeeForoosh,'"& MCode.RaghamAshar &"') As fldFeeForoosh,Round(fldGhymatMasrafkonande,'"& MCode.RaghamAshar &"') As fldGhymatMasrafkonande,fldPathPic From TblKala Where fldCodeGroup like '"& C_Kala &"%' order by "& orderkala)
		Else If MCode.NamayeshKalaSefr = 0 Then
			Dim Cu As Cursor = MCode.Result("Select fldCodeKala,fldNameKala,fldNameVahed,fldNameVahed2,SumMande,fldTedadDarKarton,Round(fldFeeForoosh,'"& MCode.RaghamAshar &"') As fldFeeForoosh,Round(fldGhymatMasrafkonande,'"& MCode.RaghamAshar &"') As fldGhymatMasrafkonande,fldPathPic From TblKala Where fldCodeGroup like '"& C_Kala &"%' And SumMande > 0 order by "& orderkala)
		End If
	Else
		If MCode.NamayeshKalaSefr = 1 Then
			Dim Cu As Cursor = MCode.Result("Select fldCodeKala,fldNameKala,fldNameVahed,fldNameVahed2,SumMande,fldTedadDarKarton,Round(fldFeeForoosh,'"& MCode.RaghamAshar &"') As fldFeeForoosh,Round(fldGhymatMasrafkonande,'"& MCode.RaghamAshar &"') As fldGhymatMasrafkonande,fldPathPic From TblKala order by "& orderkala)
		Else If MCode.NamayeshKalaSefr = 0 Then
			Dim Cu As Cursor = MCode.Result("Select fldCodeKala,fldNameKala,fldNameVahed,fldNameVahed2,SumMande,fldTedadDarKarton,Round(fldFeeForoosh,'"& MCode.RaghamAshar &"') As fldFeeForoosh,Round(fldGhymatMasrafkonande,'"& MCode.RaghamAshar &"') As fldGhymatMasrafkonande,fldPathPic From TblKala Where SumMande > 0 order by "& orderkala)
		End If
	End If
	'Dim Cu As Cursor = MCode.Result("Select FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,SumMande,FldTedadDarKarton,Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As FldFeeForoosh From TblKala Where FldGoroohKala like '"& C_Kala &"%' order by FldGoroohKala")
	OriginalListKala.Clear
	If Cu.RowCount > 0 Then
		For i = 0 To Cu.RowCount - 1
			Dim ItemKala As AdapterListKala
			Cu.Position=i
			ItemKala.CodeKala=Cu.Getstring("fldCodeKala")
			ItemKala.NameKala=Cu.Getstring("fldNameKala")
			ItemKala.NameVahed=Cu.Getstring("fldNameVahed")
			ItemKala.NameVahed2=Cu.Getstring("fldNameVahed2")
			ItemKala.SumMande=Cu.Getstring("SumMande")
			ItemKala.TedadDarKarton =Cu.Getstring("fldTedadDarKarton")
			ItemKala.FeeForoosh=Cu.GetInt("fldFeeForoosh")
			ItemKala.FldMablaghMasrafKonande=Cu.GetString("fldGhymatMasrafkonande")
			
			If Cu.GetString("fldPathPic")<>Null Then
				ItemKala.fldPathPic=Cu.GetString("fldPathPic")
				Else
				ItemKala.fldPathPic="0"
			End If
			If Cu.Getstring("fldNameVahed2") <> "" Then
				Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("fldFeeForoosh"))
				Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.Getstring("fldTedadDarKarton"))
				Dim SumMande As Int = Cu.Getstring("SumMande")
				ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
				ItemKala.SumMandeKarton=Round2( SumMande / FldTedadDarKarton,0)
			End If
			OriginalListKala.Add(ItemKala)
		Next
	End If
	'ToastMessageShow("تعداد کالای زیر مجموعه " & "  " & Cu.RowCount,True)
	ListKala = OriginalListKala
	ListKalaKol=OriginalListKala
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
			Dim cu As Cursor
			cu=MCode.Result("Select fldCodeKala From TblKala where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") & "%'")
			If cu.RowCount>0 Then
			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
			OriginalListGoroohKala.Add(Item)
			MCode.C_LayeKala=Item.FldC_Gorooh
			End If
		Next
		ListGoroohKala = OriginalListGoroohKala
		HLVGoroohKala.notifyDataSetChanged
	End If
	ListKala.Clear
	HLVKala.notifyDataSetChanged
	If C_Gorooh.Length=0 Then
		LoadKalaKol
	End If
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

Sub HLVKala_onCreateViewHolder (Parent As Panel, ViewType As Int)

	Dim ImageRow As ImageView
	ImageRow.Initialize("ImageRow")
	ImageRow.Gravity=Gravity.Fill
	Parent.AddView(ImageRow,55%x,0,45%x,45%x)
	
	Dim LblCodeKalas As Label
	LblCodeKalas.Initialize("LblCodeKalas")
	LblCodeKalas.TextColor=Colors.RGB(11,32,14)
	LblCodeKalas.TextSize=17
	LblCodeKalas.Gravity=Gravity.CENTER
	LblCodeKalas.SingleLine=False
	LblCodeKalas.Typeface=MCode.Font
	Parent.AddView(LblCodeKalas,53%x,23%y,53%x,10%y)
	
	Dim LblSharh As Label
	LblSharh.Initialize("LblSharh")
	LblSharh.TextColor=Colors.RGB(11,32,14)
	LblSharh.TextSize=17
	LblSharh.Gravity=Gravity.CENTER
	LblSharh.SingleLine=False
	LblSharh.Typeface=MCode.Font
	Parent.AddView(LblSharh,3%x,12%y,53%x,10%y)
	Dim ImgDivider As ImageView
	ImgDivider.Initialize("ImgDivider")
	ImgDivider.Gravity=Gravity.FILL
	'ImgDivider.Bitmap=MCode.Divider
	Parent.AddView(ImgDivider,3%x,30%y,53%x,1dip)
	Dim LblMablaghFi As Label
	LblMablaghFi.Initialize("LblMablaghFi")
	LblMablaghFi.TextColor=Colors.black
	LblMablaghFi.TextSize=20
	LblMablaghFi.Gravity=Gravity.CENTER
	LblMablaghFi.Typeface=MCode.Font
	Parent.AddView(LblMablaghFi,3%x,25%y,53%x,6%y)
	Dim ImgSabad As ImageView
	ImgSabad.Initialize("ImgSabad")
	ImgSabad.Gravity=Gravity.FILL
	ImgSabad.BringToFront
	ImgSabad.Bitmap=MCode.SabadImg
	Parent.AddView(ImgSabad,1%x,1%x,15%x,15%x)
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
	Parent.AddView(LblTedadDarSabad,9%x,9%x,7%x,5%x)
End Sub


Sub HLVKala_onBindViewHolder (Parent As Panel, Position As Int)
	Dim Item = ListKala.Get(Position) As AdapterListKala
	Dim ImageRow  As ImageView = Parent.GetView(0)

	
	If Item.fldPathPic="" Or Item.fldPathPic="0" Then
		Glide.Load(File.DirRootExternal &"/Zomorod/AksKala",Item.CodeKala & ".jpg").Apply(Glide.RequestOptions.Placeholder(MCode.placeHolder)).Into(ImageRow)
		Else
		pico.LoadUrl(MCode.ImageUrl & Item.fldPathPic).IntoImageView(ImageRow)
	End If


	Dim LblCodeKalas As Label  = Parent.getview(1)
	LblCodeKalas.Text = "کد کالا: "& Item.CodeKala
	
	Dim LblSharh As Label  = Parent.getview(2)
	LblSharh.Text ="نام کالا: "& Item.NameKala
	
	Dim ImgDivider  As ImageView = Parent.GetView(3)
	Dim LblMablaghFi As Label = Parent.GetView(4)
	LblMablaghFi.Text = NumberFormat((Item.FeeForoosh),0,3) & "  " & MCode.VahedPool
	Dim ImgSabad  As ImageView = Parent.GetView(5)
	Dim LblTedadDarSabad As Label  = Parent.getview(6)
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
	Parent.Height = 35%y
	Parent.Left = 1.5%x
	Parent.Width=100%x
	
End Sub

Sub HLVKala_onScrollStateChanged (State As Int)
	Key.HideKeyboard
	PnlKalaTozih.Visible=False
	pico.Initialize
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
	tcount=3
	t1.Enabled=True
	btnUpdate.Visible=False
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
	txtTozihat.Typeface=MCode.Font
	lblCodeKala.Typeface=MCode.Font
	LblNameKala.Text=ItemEntekhab.NameKala
	If ItemEntekhab.FldMablaghMasrafKonande= Null Then
		MablaghMasrafKonande=0
	Else
		MablaghMasrafKonande=ItemEntekhab.FldMablaghMasrafKonande
	End If
	lblCodeKala.Text=ItemEntekhab.CodeKala
	
	txtMablaghMasrafKonande.Text=MCode.qomaAshar(MablaghMasrafKonande)
	LblVahed1.Text = MCode.VahedPool
	Dim Num As Int = ItemEntekhab.FeeForoosh
	
	TxtFeeForoosh.Text=Num
	TxtFeeForoosh.Text=MCode.qomaAshar(TxtFeeForoosh.Text)
	LblVahed.Text = MCode.VahedPool
	If  ItemEntekhab.FeeForooshKarton <> Null Then
		LblFeeForooshKarton.Text= NumberFormat(ItemEntekhab.FeeForooshKarton,0,3) & MCode.VahedPool
	Else
		LblFeeForooshKarton.Text="-"
	End If

	LblTedadDarKarton.Text=ItemEntekhab.TedadDarKarton
	MTxtTedadSabadJoz.Text= ItemEntekhab.TedadDarSabadJoz
	MTxtTedadSabadKol.Text= ItemEntekhab.TedadDarSabadkol
	If ItemEntekhab.TedadDarKarton<>0 And IsNumber(ItemEntekhab.TedadDarKarton)=True Then
		maxkolRond=(ItemEntekhab.SumMande/ItemEntekhab.TedadDarKarton)
		Log(maxkolRond)
	Else
		maxkolRond=0
	End If
	Log(maxkolRond)
	LblMojoodi.Text = ItemEntekhab.SumMande & " " & ItemEntekhab.NameVahed
	
	If  ItemEntekhab.SumMandeKarton <> Null Then
		LblmojoodiKarton.Text = maxkolRond & " " & ItemEntekhab.NameVahed2
	Else
		LblmojoodiKarton.Text ="-"
		ItemEntekhab.SumMandeKarton = 0
	End If
	If ItemEntekhab.fldPathPic="" Or ItemEntekhab.fldPathPic="0" Then
		If Not(File.Exists(File.DirRootExternal &"/Zomorod/AksKala",ItemEntekhab.CodeKala & ".jpg")) Then
			imgKala.Bitmap = MCode.placeHolder
		Else
			imgKala.Bitmap=LoadBitmap(File.DirRootExternal &"/Zomorod/AksKala",ItemEntekhab.CodeKala & ".jpg")
		End If
	Else
		pico.LoadUrl(MCode.ImageUrl & ItemEntekhab.fldPathPic).IntoImageView(imgKala)
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
			btnUpdate.Visible=True
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
	If IsNumber(MCode.ConvertNumbersPersian2English(New))= True And New.Length>4 Then
		Dim num As Int
		noeLoadKala="Search"
		LoadKala(0)
		Log(New)
		num=MCode.ConvertNumbersPersian2English(New)
		Log(num)
		ListKala = Utils.FilterSearchList("CodeKala",OriginalListKala).Contains(num)
		HLVKala.ScrollToPosition(0)
		HLVKala.notifyDataSetChanged
	Else if IsNumber(New)=False Then
		noeLoadKala="Search"
		LoadKala(0)
		ListKala = Utils.FilterSearchList("NameKala",OriginalListKala).Contains(New)
		HLVKala.ScrollToPosition(0)
		HLVKala.notifyDataSetChanged
		
	End If
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
	ItemEntekhab.FldMablaghMasrafKonande=MCode.RemoveqomaAshar(txtMablaghMasrafKonande.Text)
	ItemEntekhab.FeeForoosh= MCode.RemoveqomaAshar(TxtFeeForoosh.text)
	ItemEntekhab.Tozihat=txtTozihat.Text
	AddToSabad
	btnUpdate.Visible=True
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
			MCode.SaveUpdate("Insert Into TblSabad (FldCodeKala,FldNameKala,FldTedadDarkarton,FldFeeForoosh,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldNameVahed,FldNameVahed2,FldTozihat,FldMablaghMasrafKonande) Values ('"& _
			 ItemEntekhab.CodeKala &"','"& ItemEntekhab.NameKala &"','"& ItemEntekhab.TedadDarKarton &"',"& ItemEntekhab.FeeForoosh &",'"& _
			  ItemEntekhab.TedadDarSabadJoz &"','"& ItemEntekhab.TedadDarSabadKol &"','"& ItemEntekhab.NameVahed &"','"& ItemEntekhab.NameVahed2 &"','"& ItemEntekhab.Tozihat &"','"& ItemEntekhab.FldMablaghMasrafKonande &"')")
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
	
	
	If MTxtTedadSabadJoz.Text <> 0 Then
		MTxtTedadSabadKol.Text=0
		
	Else
	Dim A As Int = 0
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
	ItemEntekhab.FeeForoosh=MCode.RemoveqomaAshar(TxtFeeForoosh.text)
	End If
	
	
End Sub

Sub AcBtnDownKol_Click
	
	If MTxtTedadSabadJoz.Text <> 0 Then
		MTxtTedadSabadKol.Text=0
		
	Else
	Dim A As Int = 0
	A = MTxtTedadSabadKol.Text
	If A > 0 Then
		A = A - 1
		MTxtTedadSabadKol.Text = A
		ItemEntekhab.TedadDarSabadkol = A
		ItemEntekhab.FeeForoosh=MCode.RemoveqomaAshar(TxtFeeForoosh.text)
	End If
	End If

End Sub

Sub AcBtnUpJoz_Click
	
	If MTxtTedadSabadKol.Text<>0 Then
		MTxtTedadSabadJoz.Text=0
		
	Else
	Dim A As Int = 0
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
	ItemEntekhab.FeeForoosh=MCode.RemoveqomaAshar(TxtFeeForoosh.text)
			
	End If
	
End Sub

Sub AcBtnDownJoz_Click

	If MTxtTedadSabadKol.Text<>0 Then
		MTxtTedadSabadJoz.Text=0
	Else
	Dim A As Int = 0
	A = MTxtTedadSabadJoz.Text
	If A > 0 Then
		A = A - 1
		MTxtTedadSabadJoz.Text = A
		ItemEntekhab.TedadDarSabadjoz = A
		ItemEntekhab.FeeForoosh=MCode.RemoveqomaAshar(TxtFeeForoosh.text)
	End If
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
		'LblBasketCount.Visible=True
		LblBasketCount.Text=Cu.RowCount
	Else
		LblBasketCount.Text=0
		'LblBasketCount.Visible=False
	End If
End Sub

Sub MTxtTedadSabadKol_TextChanged(Old As String, New As String)
If MTxtTedadSabadKol.Text <> 0 Then
	If ItemEntekhab.TedadDarSabadJoz <> 0 Then
		ItemEntekhab.TedadDarSabadKol=0
		MTxtTedadSabadKol.Text=0
	Else
	ItemEntekhab.TedadDarSabadKol=New
		End If
	End If
End Sub

Sub MTxtTedadSabadJoz_TextChanged(Old As String, New As String)
If MTxtTedadSabadJoz.Text <> 0 Then
	If ItemEntekhab.TedadDarSabadKol<>0 Then
		ItemEntekhab.TedadDarSabadJoz=0
		MTxtTedadSabadJoz.Text=0
	Else
	ItemEntekhab.TedadDarSabadJoz=New
		End If
	End If
End Sub

Sub imgKala_Click
	If ItemEntekhab.fldPathPic="" Or ItemEntekhab.fldPathPic="0" Then
'		Glide.Load(File.DirRootExternal &"/Zomorod/AksKala",Item.CodeKala & ".jpg").Apply(Glide.RequestOptions.Placeholder(MCode.placeHolder)).Into(ImageRow)
		If File.Exists(File.DirRootExternal &"/Zomorod/AksKala",ItemEntekhab.CodeKala & ".jpg") = True Then
			ImgFullScreen.Bitmap=LoadBitmapResize(File.DirRootExternal &"/Zomorod/AksKala",ItemEntekhab.CodeKala & ".jpg",ImgFullScreen.Width,ImgFullScreen.Height,True)
		Else
			ImgFullScreen.Bitmap = MCode.placeHolder
		End If
	Else
		pico.LoadUrl(MCode.ImageUrl & ItemEntekhab.fldPathPic).IntoImageView(ImgFullScreen)
	End If
	
	PnlKalaTozih.Visible=False
	MCode.AnimationClose(PnlKalaTozih)
	PnlImage.Visible=True
	PnlImage.BringToFront
	MCode.AnimationOpen(PnlImage)
End Sub

Sub Activity_Resume
	pico.Initialize		
	
	RefreshLblSabad
	
End Sub
Sub update_data
	StartService(FirebaseMessaging)	
	FirebaseMessaging.mode="GetGoroohKala"
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub




Sub SpOrderKala_ItemClick (Position As Int, Value As Object)
	If SpOrderKala.SelectedIndex = 0 Then
		orderkala=" fldCodeKala"
	Else if SpOrderKala.SelectedIndex=1 Then
		orderkala=" fldNameKala"
	End If
	LoadKala(CodeGroupSelected)
End Sub

Sub btnUpdate_Click
	tcount=3
	t1.Enabled=True
End Sub