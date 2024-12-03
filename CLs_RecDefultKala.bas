B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel
	Private ImageRow As ImageView
	Private ImageOff As ImageView
'	Private ImageGift As ImageView
	Private lbl_title As Label
	Private ImageCall As ImageView
	Private LblFee As Label
	Private LblFeeBadAzTakhfid As Label
	Private LblC_Kala As Label
	Private ImageTozihat As ImageView
	Private LblMojoodiJoz As Label
	Private LblMojoodiKol As Label
	Private LblTedadKarton As Label
	Private BtnUpJoz As Label
	Private LblTedadJoz As Label
	Private BtnDownJoz As Label
	Private BtnDownKol As Label
	Private LblTedadkol As Label
	Private BtnUpKol As Label
	Private Item As AdapterListKala
	Private Key As IME
	Private base As Object
	Private BtnDownEshan As Label
	Private BtnUpEshan As Label
	Private LblTedadEshan As Label
	Private lblVahedJoz As Label
	Private lblVahedKol As Label
	Private LblBuyPrice As Label
	Private Panel4 As Panel
	Private LblGift As Label
	Private LblTozihat As Label
	
	Private btn_edit_Price As Label
	Dim maxkolRond As String
	'Dim Glide As Hitex_Glide
	Private LblCountEshantion As Label
	
	Private btn_discount As Label
	Private LblMablaghTakhfif As Label
	Private LblMablaghMasrafkonande As Label
	Private lblSumMablaghKala As Label
	Private lblDarsadTakhfif As Label
	Private pnlJoz As Panel
	Private pnlKol As Panel
	Private pnlEshan As Panel
	Private LblCodeGroup As Label
	Private LblFeeYekKarton As Label
	
	'Dim Target1 As DefaultTarget
'	Dim Glide As AriaGlide
	Private LblDarsadArzeshAfzodeKala As Label
	Private LblArzeshAfzodeKala As Label
	Private SwDisableArzeshAfzode As ACSwitch
End Sub




Public Sub Initialize(mdl As Object)
	Try
	base = mdl
	Key.Initialize("Key")
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_rechomeitem_2")
	

	Dim btnChangePrice As Int=MCode.TaghirFeeKala
	If btnChangePrice=0 Then
		btn_edit_Price.Visible=False
	Else
		btn_edit_Price.Visible=True
	End If
	
	Dim btndiscount As Int=MCode.TakhfifKala
	If btndiscount=0 Then
		btn_discount.Visible=False
		Else
		btn_discount.Visible=True
	End If
'	ImageRow1.Bitmap=MCode.
	Catch
		MCode.SendError(LastException)
		Log(LastException)
	End Try
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub Show(Item1 As AdapterListKala,position As Int)
	Item=Item1
	Private ImageRow1 As ImageView
	ImageRow1.Initialize("")
	ImageRow1.Tag=position
'	SwDisableArzeshAfzode.Tag=position

	lbl_title.Text = Item.NameKala
	LblCodeGroup.Text = "کد گروه: " & Item.CodeGroup
	LblC_Kala.Text = "کد کالا: " & Item.CodeKala
	Dim fee As Int
	'If Item.fldTipFee=0 Then
	fee=Item.FeeForoosh
	Dim cu As Cursor=MCode.Result("select * from TblSabad where FldCodeKala="& Item.CodeKala)
	cu.Position=0
	If cu.RowCount>0 Then
		fee=cu.GetString("FldFeeForoosh")
	End If
	
	
	'Dim cu As Cursor=MCode.Result("select * from TblKala where fldCodeKala="& Item.CodeKala)
	'cu.Position=0
'	Dim feebadaztakhfif As Int=myCode.Is_Null_adad(Item.fldFeeBadAzTakhfif)
'	If Item.MablaghTakhfif>0 And feebadaztakhfif=0 Then
'		Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.MablaghTakhfif
''		ToastMessageShow("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.",True)
'	else If Item.MablaghTakhfif>0 And feebadaztakhfif>0 Then
'		Item.fldFeeBadAzTakhfif=feebadaztakhfif-Item.MablaghTakhfif
''		ToastMessageShow("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.",True)
'	Else if Item.MablaghTakhfif=0 And feebadaztakhfif=0 Then
'		Item.fldFeeBadAzTakhfif=Item.MablaghTakhfif
'		Item.MablaghTakhfif=Item.MablaghTakhfif
'	Else if Item.MablaghTakhfif=0 And feebadaztakhfif>0 Then
'		Item.fldFeeBadAzTakhfif=feebadaztakhfif
'	End If
	
	

'	Else

'		Dim ItemTasvie As AdapterListNoeTasvie
'		ItemTasvie.Initialize
'		ItemTasvie=MCode.LoadAcSpNoeTasvie.Get(Item.fldTipFee-1)
'		'Log(ItemTasvie.GetMablaghFee(ItemTasvie.FldC_Tasvie,ItemTasvie.FldC_Tasvie)
'		Dim Cu2 As Cursor
'		Cu2=MCode.Result("select FldFee from TblFee where FldCodeTasvie=" & ItemTasvie.FldC_Tasvie &" and FldCodeKala="&Item.CodeKala)
'		If Cu2.RowCount>0 Then
'			fee=MCode.SingleResult("select FldFee from TblFee where FldCodeTasvie=" & ItemTasvie.FldC_Tasvie &" and FldCodeKala="&Item.CodeKala)
'		End If
'		If fee=0 Then
'			fee=Item.FeeForoosh
'		End If
'		Cu2.Close
'	End If

	If Item.MablaghTakhfif>0 Then
		Dim tedadKol As String=myCode.Is_Null_adad(Item.TedadDarSabadJoz)+(myCode.Is_Null_adad(Item.TedadDarSabadKol)*myCode.Is_Null_adad(Item.TedadDarKarton))
		Dim FeeKol As String=(Item.FeeForoosh*tedadKol)
		If tedadKol>0 Then
			Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKol)*Item.fldDarsadTakhfif)/100)
		    Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghTakhfif
		Else
			'Item.MablaghTakhfif=(((Item.FeeForoosh)*Item.fldDarsadTakhfif)/100)
		End If
		LblMablaghTakhfif.Text="فی تخفیف: "& myCode.AdadToPrice(myCode.Is_Null_adad(Item.MablaghTakhfif))
		LblMablaghTakhfif.TextColor=Colors.Red
		lblDarsadTakhfif.TextColor=Colors.Red
		LblMablaghTakhfif.Visible=True
		lblDarsadTakhfif.Visible=True
		lblDarsadTakhfif.Text="درصد تخفیف: %"& myCode.Is_Null_adad(Item.fldDarsadTakhfif)
	Else
		lblDarsadTakhfif.Text=0
		LblMablaghTakhfif.Text=0
		LblMablaghTakhfif.Visible=False
		lblDarsadTakhfif.Visible=False
	End If
	
	
	Log(fee)
	If IsNumber(Item.FldFeeBadAzTakhfif) = True Then
	
'		If Item.fldFeeBadAzTakhfif>=fee Then
'			LblFee.Text ="فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool
'			LblFeeBadAzTakhfid.Text = ""
'			Item.FldFeeBadAzTakhfif=0
'			ImageOff.Visible=False				
		 If Item.FldFeeBadAzTakhfif > 0 Then	
			MCode.Rs.Initialize("فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool)
			MCode.Rs.Strikethrough (0, MCode.Rs.Length)
			MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
			LblFee.Text = MCode.Rs
			LblFeeBadAzTakhfid.Text ="فی بعد از تخفیف: "& NumberFormat(myCode.Is_Null_adad(Item.FldFeeBadAzTakhfif),1,3) & " " & MCode.VahedPool
			ImageOff.Visible=True
		Else If Item.FldFeeBadAzTakhfif = 0 And myCode.Is_Null_adad(Item.fldDarsadTakhfif)=100 Then
			MCode.Rs.Initialize("فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool)
			MCode.Rs.Strikethrough (0, MCode.Rs.Length)
			MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
			Item.MablaghTakhfif=(Item.FeeForoosh*Item.TedadDarSabadJoz+(Item.TedadDarSabadKol*Item.TedadDarKarton))
			Item.FldFeeBadAzTakhfif=0
			LblFee.Text = 0
			LblFeeBadAzTakhfid.Text ="فی بعد از تخفیف: "& NumberFormat(myCode.Is_Null_adad(Item.FldFeeBadAzTakhfif),1,3) & " " & MCode.VahedPool
			ImageOff.Visible=True
		Else If Item.FldFeeBadAzTakhfif = 0 Then
			MCode.Rs.Initialize("فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool)
			MCode.Rs.Strikethrough (0, MCode.Rs.Length)
			MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
			LblFee.Text = MCode.Rs
			LblFeeBadAzTakhfid.Text ="فی بعد از تخفیف: "& NumberFormat(myCode.Is_Null_adad(Item.FldFeeBadAzTakhfif),1,3) & " " & MCode.VahedPool
			ImageOff.Visible=True
		Else
			LblFee.Text ="فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool
			LblFeeBadAzTakhfid.Text = ""
			ImageOff.Visible=False
		End If
	Else
		LblFee.Text ="فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool
		LblFeeBadAzTakhfid.Text = ""
	End If
	
	If Item.TedadDarSabadJoz=Null Then
		LblTedadJoz.Text=0
		Item.TedadDarSabadJoz=0
		Else
		LblTedadJoz.Text =Item.TedadDarSabadJoz
	End If
	lblVahedJoz.Text = "تعداد به "& Item.NameVahed
	
	If Item.TedadDarSabadKol=Null Then
		LblTedadkol.Text=0
		Item.TedadDarSabadKol=0
	Else
		LblTedadkol.Text =Item.TedadDarSabadKol
	End If
	If Item.NameVahed2="" Then
		lblVahedKol.Text = "تعداد به کارتن "& Item.NameVahed2
		Else
		lblVahedKol.Text = "تعداد به "& Item.NameVahed2
	End If
	

	
'	LblTedadEshan.Text = Item.FldEshantion
	'
'	Log(Item.FldTozihat)
'	If Item.FldTozihat <> ""   Then
'		LblTozihat.Visible=True
'	Else
'		LblTozihat.Visible=False
'	End If
'	
	
	Item.FldEshantion=myCode.Is_Null_adad(Item.FldEshantion)

	Dim Price As Long=0
	If myCode.Is_Null_adad(Item.FldFeeBadAzTakhfif) > 0 Then
		Price = Item.FldFeeBadAzTakhfif * ((Item.TedadDarSabadKol * Item.TedadDarKarton) + Item.TedadDarSabadJoz)
		ImageOff.Visible=True
	Else If myCode.Is_Null_adad(Item.FldFeeBadAzTakhfif)=0 And myCode.Is_Null_adad(Item.fldDarsadTakhfif)=100 Then
		Price=0
	Else
	Price = Item.FeeForoosh * ((Item.TedadDarSabadKol * myCode.Is_Null_adad(Item.TedadDarKarton)) + Item.TedadDarSabadJoz)
		ImageOff.Visible=False
	End If
	
	If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzodeKala) =0 And MCode.ArzeshAfzodeEnable=1 And SwDisableArzeshAfzode.Checked=True Then
		Item.fldDarsadArzeshAfzodeKala=myCode.Is_Null_adad(MCode.ArzeshAfzode)
	Else If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzodeKala) >0 And MCode.ArzeshAfzodeEnable=1 Then
		Item.fldDarsadArzeshAfzodeKala=myCode.Is_Null_adad(Item.fldDarsadArzeshAfzodeKala)
	Else
		Item.fldDarsadArzeshAfzodeKala=0
	End If

	LblDarsadArzeshAfzodeKala.Text="درصد ارزش افزوده: %"& myCode.Is_Null_adad(Item.fldDarsadArzeshAfzodeKala)
	
	
	If Item.TedadDarKarton<>0 And IsNumber(Item.TedadDarKarton)=True Then
		maxkolRond=(Item.SumMandeKarton)
		
		If Item.NameVahed2="" Then
			LblTedadKarton.Text="تعداد در کارتن: "& Item.TedadDarKarton
		Else
			LblTedadKarton.Text="تعداد در "&Item.NameVahed2&": "& Item.TedadDarKarton
		End If
		LblFeeYekKarton.Text="فی یک کارتن: "&myCode.AdadToPrice(Item.FeeForoosh*Item.TedadDarKarton)
		Log(maxkolRond)
	Else
		maxkolRond=0
		'LblTedadKarton.Text="تعداد در کارتن:"&maxkolRond
		If Item.NameVahed2="" Then
			LblTedadKarton.Text="تعداد در کارتن: "& maxkolRond
		Else
			LblTedadKarton.Text="تعداد در "&Item.NameVahed2&": "& maxkolRond
		End If
		LblFeeYekKarton.Text="فی یک کارتن: "&0
		LblMojoodiKol.Text ="موجودی کل: -"
	End If
	Log(maxkolRond)
	LblMojoodiJoz.Text ="موجودی جزء: "& Item.SumMande & " " & Item.NameVahed
	
	If  Item.SumMandeKarton <> Null Then
		LblMojoodiKol.Text ="موجودی کل: "& maxkolRond & " " & Item.NameVahed2
	Else
		LblMojoodiKol.Text ="موجودی کل: -"
		'ItemEntekhab.SumMandeKarton = 0
	End If
	If Item.TedadDarSabadJoz>0 Then
		AddEshantion(Item.TedadDarSabadJoz)
		LblTedadEshan.Text = Item.FldEshantion
	End If
	If Item.fldCountEshantion<>Null Then
		LblCountEshantion.Text="تعداد هدیه : " & Item.fldCountEshantion
		LblTedadEshan.Text=Item.FldEshantion
		Else
		LblCountEshantion.Text="تعداد هدیه : 0"
	End If
	If MCode.EshantionGroup=1 Then
		LblTedadEshan.Text=Item.FldEshantion
	End If
	'Item.MablaghTakhfif=0
	
	

	If Price>0 Then		
			If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzodeKala)>0 And SwDisableArzeshAfzode.Checked Then
				Item.fldArzeshAfzodeKala=myCode.Is_Null_adad(MCode.MohasbeArzeshAfzodeKala(Price,Item.fldDarsadArzeshAfzodeKala))
				If Item.fldArzeshAfzodeKala>0 Then
					LblArzeshAfzodeKala.Text="مبلغ ارزش افزوده: "& myCode.AdadToPrice(Item.fldArzeshAfzodeKala)
					Price=Price+Item.fldArzeshAfzodeKala
				End If
			Else
				LblArzeshAfzodeKala.Text="مبلغ ارزش افزوده: "& myCode.Is_Null_adad(Item.fldArzeshAfzodeKala)
			End If

		lblSumMablaghKala.Text="جمع مبلغ: "& NumberFormat(myCode.Is_Null_adad(Price),1,3) & " " & MCode.VahedPool
	Else
		lblSumMablaghKala.Text="جمع مبلغ: 0"
	End If
	

	
	
		
'		If tedadJoz>0 And tedadKol>0 Then
'			Item.MablaghTakhfif=((fee-Item.fldFeeBadAzTakhfif)*tedadJoz)+((fee-Item.fldFeeBadAzTakhfif)*(Item.TedadDarKarton*tedadKol))
'		Else
'			If tedadJoz>0 Then
'				Item.MablaghTakhfif=((fee-Item.fldFeeBadAzTakhfif)*tedadJoz)
'			End If
'			If tedadKol>0 Then
'				Item.MablaghTakhfif=((fee-Item.fldFeeBadAzTakhfif)*(Item.TedadDarKarton*tedadKol))
'			End If
'		
'		End If
	


	
	
	If myCode.Is_Null_adad(Item.FldMablaghMasrafKonande)>0 Then
		LblMablaghMasrafkonande.Text="قیمت مصرف کننده: "& NumberFormat(Item.FldMablaghMasrafKonande,1,3) & " " & MCode.VahedPool
		Else
		LblMablaghMasrafkonande.Text="قیمت مصرف کننده: 0"
	End If
	
	If MCode.HideMojodi=1 Then
		LblMojoodiJoz.Visible=False
		LblMojoodiKol.Visible=False
	Else
		LblMojoodiJoz.Visible=True
		LblMojoodiKol.Visible=True
	End If


	Try
'		myCode.DownloadImage5(Item.CodeKala,Item.fldPathPic,ImageRow)
'		ImageRow.Bitmap=Null
'		Dim Link As String
'		Log("CodeKala "& Item.CodeKala)
'		If MCode.PicOnline=1 Then
''			ImageRow.Bitmap=Null
'			Dim filename As String=Item.CodeKala & ".jpg"
'			If Item.fldPathPic="0" Then
'				
'		
'				If File.Exists(File.DirDefaultExternal&"/Parsik/AksKala",filename) Then
'					File.Delete(File.DirDefaultExternal&"/Parsik/AksKala",filename)
'				End If
'				MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'				ImageRow.Bitmap=MCode.placeHolder
'			Else
'				If MCode.IsConnected Then
'					If File.Exists(File.DirDefaultExternal&"/Parsik/AksKala",filename)=True Then
'						MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'						ImageRow.Bitmap=MCode.placeHolder
'						Return
'					End If
'					'ImageRow.Bitmap=Null
''					MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
''					ImageRow.Bitmap=MCode.placeHolder
'					Link=MCode.ImageUrl &Item.fldPathPic
'					Log("Link= " & MCode.ImageUrl & Item.fldPathPic)
'				
'					Dim links As Map
'					links.Initialize
'					links.Put(ImageRow, Link)
'					MCode.CodeKalaImage=Item.CodeKala
'					CallSubDelayed2(ImageDownloader, "Download", links)
'					MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'					ImageRow.Bitmap=MCode.placeHolder
'					Else
'					MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'					ImageRow.Bitmap=MCode.placeHolder
'				End If
'		
'		
'				
''				'Glide.Get.ClearDiskCache
''				'Glide.Get.ClearMemory
''				Dim LowerCaseLink As String = Link.ToLowerCase
''				If LowerCaseLink.Contains("jpg") Or LowerCaseLink.Contains("jpeg") Or LowerCaseLink.Contains("png") Then
''				Else
''		
''					'Link = File.Combine(File.DirAssets,"ICON.png")
''		
''				End If
''				ImageRow.Tag=Null
''				Log("show= " & Link)
'	
''		Glide.Load2(Link).Apply(Glide.RO.FitCenter).Into(ph)
''		Glide.Load2(Link).Apply(Glide.RequestOptions.Placeholder(MCode.ImgNothing).SkipMemoryCache(True)).Into(ph)
'				'Glide.Load2(Link).Apply(Glide.RequestOptions.Placeholder(MCode.placeHolder)).Apply(Glide.RO.FitCenter).Into(ImageRow)
''				Glide.Load(Link).AsBitmap.IntoImageView(ImageRow)
''				Dim pic As Picasso
''				pic.Initialize
''				pic.LoadUrl(Link).IntoImageView(ImageRow)
'				
'				
'				'Target1.Initialize("Target1", "MyTagValue")
''				pic.LoadUrl(Link).IntoImageView(ImageRow)
''				pic.Initialize
''				pic.LoadUrl("http://09183373774.parsikhesab.com/uploadimage/1000011.jpg").Fit.IntoImageView(ImageRow)
'				
''				pic.LoadUrl(Link).IntoImageView(ImageRow)
'				'myCode.DownloadImage2(Link,ImageRow)
'			End If
'			Else
			MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
			ImageRow.Bitmap=MCode.placeHolder				
'		End If	
		MojavezSefaresh
		Sleep(200)
	Catch

		Log(LastException)
	End Try
	If MCode.EshantionTabaghati=1 Then
		LblGift.Visible=MCode.CheckEshantion(Item.CodeKala)
	End If
	
	
	LblGift.Visible=MCode.CheckEshantionGroup(Item.CodeGroup)

	
End Sub


'
'Sub Target1_Error(Tag As Object)
'	Log("Target1_Error Tag="&Tag)
'	MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'	ImageRow.Bitmap=MCode.placeHolder
'End Sub
'
'Sub Target1_Success(Bitmap1 As Bitmap, Tag As Object)
'	Log("Target1_Success Tag="&Tag)
'	If Tag="MyTagValue" Then
'		'   do something with the Bitmap
'		ImageRow.Bitmap=Bitmap1
'	End If
'End Sub

Private Sub MojavezSefaresh
	Select MCode.MojavezSefaresh
		Case 0
			BtnUpJoz.Enabled=True
			BtnDownJoz.Enabled=True
			pnlJoz.Enabled=True
			LblTedadJoz.Enabled=True
			
			BtnUpKol.Enabled=True
			BtnDownKol.Enabled=True
			pnlKol.Enabled=True
			LblTedadkol.Enabled=True
		Case 1
			BtnUpJoz.Enabled=True
			BtnDownJoz.Enabled=True
			pnlJoz.Enabled=True
			LblTedadJoz.Enabled=True
			
			BtnUpKol.Enabled=False
			BtnDownKol.Enabled=False
			pnlKol.Enabled=False
			LblTedadkol.Enabled=False
		Case 2
			BtnUpJoz.Enabled=False
			BtnDownJoz.Enabled=False
			pnlJoz.Enabled=False
			LblTedadJoz.Enabled=False
			
			BtnUpKol.Enabled=True
			BtnDownKol.Enabled=True
			pnlKol.Enabled=True
			LblTedadkol.Enabled=True
	End Select
End Sub


Sub LblTozihat_Click
	If myCode.Is_Null(Item.fldSharh) <> "" Then
		Msgbox(myCode.Is_Null(Item.fldSharh),"توضیحات کالا")
		Else
			ToastMessageShow("این کالا فاقد توضیحات است",False)
	End If
End Sub

Sub BtnUpJoz_Click
	Dim A As Float = 0
	Dim Val As Float = 0
'	Select Case MCode.isFloat
'		Case True
'			Val = 0.25
'		Case False
	Val = 1
'	End Select
	If	Item.TedadDarSabadJoz=Null Then
		Item.TedadDarSabadJoz=0
		LblTedadJoz.Text=0
	End If
	
	A = Item.TedadDarSabadJoz
	If MCode.ForooshBishAzMojoodi = "1" Then
		A = A + Val
		Item.SumMande = Item.SumMande - Val
	Else if MCode.ForooshBishAzMojoodi = "0" Then
		If MCode.Action="SabtMarjooii" Then
			A = A + Val
			Item.SumMande = Item.SumMande - Val
		Else
			If Item.SumMande > 0 Then
				A = A + Val
				Item.SumMande = Item.SumMande - Val
			Else
				ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
			End If
		End If
	End If
	Item.TedadDarSabadJoz = A
	
'	If MCode.LoadEshantion(Item.CodeKala)<>Null Then
'		AddEshantion(A)
'	Else
'		Item.fldCountEshantion=0
'		Item.FldEshantion=0
'	End If
	
	
	
	AddToSabad
		
	If MCode.EshantionGroup=1 Then
	
		'Dim count As Int=MCode.SingleResult("Select Count(FldCodeKala) From TblSabad ")
	
		CallSubDelayed2(Act_KalaDefault,"AddEshantionGroup",Item.CodeGroup)
	
	End If
End Sub

Sub AddEshantion(t As Int)

'		Dim ItemEshantion As AdapterListEshantion=MCode.LoadEshantion(Item.CodeKala)
'		Dim m,e,u As Int=0
'		If ItemEshantion<>Null Then
'			If ItemEshantion.fldVaziat=1 Then
'				m=ItemEshantion.fldCountForoosh
'				e=ItemEshantion.fldTedadEshantion
'				If t=m Then
'					Item.fldCountEshantion=e
'				End If
'				If t>m Then
'					u=(t/m)
'					Item.fldCountEshantion=u*e
'				End If
'				If t<m Then
'					Item.fldCountEshantion=0
'					Item.FldEshantion=0
'				End If
'			If Item.fldCountEshantion>0 Then
'				LblCountEshantion.Text=Item.fldCountEshantion
'			End If
'			
'			End If
'		Else
'			Item.fldCountEshantion=0
'			Item.FldEshantion=0
'		End If

End Sub

Sub BtnDownJoz_Click

	Dim A As Float = 0
	Dim Val As Float = 0
'	Select Case MCode.isFloat
'		Case True
'			Val = 0.25
'		Case False
	Val = 1
'	End Select
	
	A = Item.TedadDarSabadJoz
	If A > 0 Then
		A = A - Val
		Item.SumMande = Item.SumMande + Val
		Item.TedadDarSabadJoz = A
	End If
	
'	If MCode.LoadEshantion(Item.CodeKala)<>Null Then
'		AddEshantion(A)
'	Else
'		Item.fldCountEshantion=0
'		Item.FldEshantion=0
'	End If
	
	AddToSabad
		
	If MCode.EshantionGroup=1 Then
	
		'Dim count As Int=MCode.SingleResult("Select Count(FldCodeKala) From TblSabad ")
	
		CallSubDelayed2(Act_KalaDefault,"AddEshantionGroup",Item.CodeGroup)
	
	End If
End Sub

Sub BtnUpKol_Click
	
	If Item.TedadDarKarton=0 Then
		Return
	End If
	Dim A As Float = 0
	Dim Val As Float = 1


	A = Item.TedadDarSabadKol
	If MCode.Action="SabtMarjooii" Then
		A = A + 1
		Item.SumMandeKarton = Item.SumMandeKarton - Val
	Else
		If MCode.ForooshBishAzMojoodi = "1" Then
			A = A + 1
			Item.SumMandeKarton = Item.SumMandeKarton - Val
		Else if MCode.ForooshBishAzMojoodi = "0" Then
			If Item.SumMandeKarton > 0 Then
				A = A + Val
				Item.SumMandeKarton = Item.SumMandeKarton - Val
			Else
				ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
			End If
		End If
	End If
'	If MCode.ForooshBishAzMojoodi = "1" Then
'		A = A + 1
'		Item.SumMandeKarton = Item.SumMandeKarton - A
'	Else if MCode.ForooshBishAzMojoodi = "0" Then
'	
'		
'	End If
	Item.TedadDarSabadKol = A
	'Dim kol As Int=Item.TedadDarKarton*A
	'AddEshantion(kol)
	AddToSabad
		
	If MCode.EshantionGroup=1 Then
	
		'Dim count As Int=MCode.SingleResult("Select Count(FldCodeKala) From TblSabad ")
	
		CallSubDelayed2(Act_KalaDefault,"AddEshantionGroup",Item.CodeGroup)
	
	End If
End Sub

Sub BtnDownKol_Click
	
'	Dim A As Int = 0
'	A = Item.TedadDarSabadKol
'	If A > 0 Then
'		A = A - 1
'		Item.SumMandeKarton = Item.SumMandeKarton + Item.TedadDarSabadKol
'		Item.TedadDarSabadKol = A
'	'	Dim kol As Int=Item.TedadDarKarton*A
'	'	AddEshantion(kol)
'	End If


	If Item.TedadDarKarton=0 Then
		Return
	End If
	Dim A As Float = 0
	Dim Val As Float = 1


	A = Item.TedadDarSabadKol
	A = A - 1
	Item.SumMandeKarton = Item.SumMandeKarton + Val
	Item.TedadDarSabadKol = A

	AddToSabad
	If MCode.EshantionGroup=1 Then
	
		'Dim count As Int=MCode.SingleResult("Select Count(FldCodeKala) From TblSabad ")
	
		CallSubDelayed2(Act_KalaDefault,"AddEshantionGroup",Item.CodeGroup)
	
	End If
End Sub

Sub CheckArzeshAfzode As String
	Dim tedadKol As String=myCode.Is_Null_adad(Item.TedadDarSabadJoz)+(myCode.Is_Null_adad(Item.TedadDarSabadKol)*myCode.Is_Null_adad(Item.TedadDarKarton))
	Dim FeeKol As String=(Item.FeeForoosh*tedadKol)
	If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzodeKala)>0 And SwDisableArzeshAfzode.Checked Then
		Item.fldArzeshAfzodeKala=myCode.Is_Null_adad(MCode.MohasbeArzeshAfzodeKala(FeeKol,Item.fldDarsadArzeshAfzodeKala))
		If Item.fldArzeshAfzodeKala>0 Then
			LblArzeshAfzodeKala.Text="مبلغ ارزش افزوده: "& myCode.AdadToPrice(Item.fldArzeshAfzodeKala)
			FeeKol=FeeKol+Item.fldArzeshAfzodeKala
		End If
	Else
		LblArzeshAfzodeKala.Text="مبلغ ارزش افزوده: "& myCode.Is_Null_adad(Item.fldArzeshAfzodeKala)
	End If
	Return FeeKol
End Sub

Sub AddToSabad
'	Item.MablaghTakhfif=0
'	If Item.fldFeeBadAzTakhfif>0 Then
'		Dim tedadJoz As String=myCode.Is_Null_adad(Item.TedadDarSabadJoz)
'		Dim tedadKol As String=myCode.Is_Null_adad(Item.TedadDarSabadKol)
'		
'		If tedadJoz>0 And tedadKol>0 Then
'			Item.MablaghTakhfif=((Item.FeeForoosh-Item.fldFeeBadAzTakhfif)*tedadJoz)+((Item.FeeForoosh-Item.fldFeeBadAzTakhfif)*(Item.TedadDarKarton*tedadKol))
'		Else
'			If tedadJoz>0 Then
'				Item.MablaghTakhfif=((Item.FeeForoosh-Item.fldFeeBadAzTakhfif)*tedadJoz)
'			End If
'			If tedadKol>0 Then
'				Item.MablaghTakhfif=((Item.FeeForoosh-Item.fldFeeBadAzTakhfif)*(Item.TedadDarKarton*tedadKol))
'			End If
'		
'		End If
'	End If
	Dim tedadKol As String=myCode.Is_Null_adad(Item.TedadDarSabadJoz)+(myCode.Is_Null_adad(Item.TedadDarSabadKol)*myCode.Is_Null_adad(Item.TedadDarKarton))
	Dim FeeKol As String=(Item.FeeForoosh*tedadKol)
	
		
		If tedadKol>0 Then
			If Item.MablaghTakhfif>0 Then
				Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKol)*Item.fldDarsadTakhfif)/100)
				Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghTakhfif
			End If
		
		Else
			If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>0 Then
				Item.MablaghTakhfif=(((Item.FeeForoosh)*Item.fldDarsadTakhfif)/100)
				Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.MablaghTakhfif
			End If					
	End If

	FeeKol=CheckArzeshAfzode 
	
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	Dim Check As Boolean
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		If Cu.GetString("FldCodeKala") = Item.CodeKala Then
			If Item.TedadDarSabadJoz = 0 And Item.TedadDarSabadKol = 0  Then
				If Item.FldEshantion>0 Then
					MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadJoz = '"& Item.TedadDarSabadJoz &"',FldTedadDarSabadKol = '"& Item.TedadDarSabadKol &"',FldMablaghTakhfif = '"& Item.MablaghTakhfif &"',FldDarsadTakhfif = '"& myCode.Is_Null_adad(Item.fldDarsadTakhfif) & ",fldFeeBadAzTakhfif = '"& myCode.Is_Null_adad(Item.fldFeeBadAzTakhfif) &"',fldArzeshAfzode = '"& myCode.Is_Null_adad(Item.fldArzeshAfzodeKala) & "',fldDarsadArzeshAfzode = '"& myCode.Is_Null_adad(Item.fldDarsadArzeshAfzodeKala) &"', FldEshantion = '"& Item.FldEshantion& _
				"' Where FldCodeKala = '"& Item.CodeKala &"'")
				Else
					MCode.SaveUpdate("Delete From TblSabad Where FldCodeKala = '"& Item.CodeKala &"'")
				End If
				
			Else
'				If Item.FldEshantion>0 Then
'					Item.TedadDarSabadJoz=0
'					Item.TedadDarSabadKol=0				
'				End If
				MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadJoz = '"& Item.TedadDarSabadJoz &"',FldTedadDarSabadKol = '"& Item.TedadDarSabadKol &"',FldMablaghTakhfif = '"& Item.MablaghTakhfif &"',FldDarsadTakhfif = '"& myCode.Is_Null_adad(Item.fldDarsadTakhfif) & "',fldFeeBadAzTakhfif = '"& myCode.Is_Null_adad(Item.fldFeeBadAzTakhfif) & "',fldArzeshAfzode = '"& myCode.Is_Null_adad(Item.fldArzeshAfzodeKala) & "',fldDarsadArzeshAfzode = '"& myCode.Is_Null_adad(Item.fldDarsadArzeshAfzodeKala) &"',FldEshantion = '"& Item.FldEshantion& _
				"' Where FldCodeKala = '"& Item.CodeKala &"'")
			End If
			Check = True
			Exit
		End If
	Next
	If Check = False Then
		MCode.AddToSabad(Item)
	End If

		CallSubDelayed(base,"RefreshLblSabad")
End Sub

Sub ImageRow_Click

	Act_ImageSlideShow.Item = Item
	StartActivity(Act_ImageSlideShow)
		

'	Act_KalaDefault.Page="Act_ImageSlideShow"
End Sub

Sub LblTedadJoz_Click

		CallSubDelayed2(base,"LblTedadJoz_Click",Item)
		

End Sub

Sub LblTedadKol_Click
	If myCode.Is_Null_adad(Item.TedadDarKarton)=0 Then
		Return 
	End If
	
		CallSubDelayed2(base,"LblTedadKol_Click",Item)
		

End Sub

'Sub Download (link As String)
'	Dim LowerCaseLink As String = link.ToLowerCase
'	Dim filename As String
'	filename = GetFilename(link)
'	If File.Exists(Starter.SharedFolder,filename) Then
'		ImageRow.Bitmap=LoadBitmapSample(Starter.SharedFolder,filename,300dip,300dip)
'	Else
'		If LowerCaseLink.Contains("jpg") Or LowerCaseLink.Contains("jpeg") Or LowerCaseLink.Contains("png") Then
'			Dim j As HttpJob
'			j.Initialize(link,Me)
'			j.Download(link)
'			Wait For (j) JobDone(Job As HttpJob)
'			If Job.Success Then
'				Try
'				Dim bmp As Bitmap = Job.GetBitmap
'				ImageRow.Bitmap=bmp
'				filename = GetFilename(Job.JobName)
'				WriteBitmap2File(bmp,90,filename)
'				Catch
'					Log(LastException)
'					ImageRow.Bitmap=MCode.ImgNothing
'				End Try
'			Else
'				ImageRow.Bitmap=MCode.ImgNothing
'			End If
'		Else
'			ToastMessageShow("فرمت تصویر اشتباه است",True)
'			ImageRow.Bitmap=MCode.ImgNothing
'		End If	
'	End If
'
'End Sub

Sub GetFilename(fullpath As String) As String
	Dim res As String
	res = fullpath.SubString(fullpath.LastIndexOf("/") + 1)
	Return res
End Sub
Sub WriteBitmap2File(Image As Bitmap, Quality As Int,filename As String)
	Try
		Dim out As OutputStream = File.OpenOutput(Starter.SharedFolder, filename, False)
		Dim data() As Byte = GetByteFromBitmap(Image, Quality)
		out.WriteBytes(data, 0, data.Length)
	Catch
		Log(DateTime.Date(DateTime.Now)&"="&"WriteBitmap2File")
	End Try
	out.Close
End Sub

Sub GetByteFromBitmap(img As Bitmap, Quality As Int) As Byte()

	Dim out As OutputStream
	Dim data() As Byte
	out.InitializeToBytesArray(1)
	img.WriteToStream(out,Quality,"JPEG")
	data = out.ToBytesArray
		out.Close
	Return data
End Sub

Sub BtnUpEshan_Click
	Try
	Dim A As Int = 0
	Dim B As Int = 0
	Dim minas As Int=MCode.GetCountEshantionGroup(Item.CodeGroup)

			

	If minas=0 Then
		Return
	End If
		
	A = Item.FldEshantion
	If MCode.ForooshBishAzMojoodi = "1" Then
		If Item.FldEshantion<myCode.Is_Null_adad(Item.fldCountEshantion) Or myCode.Is_Null_adad(MCode.GetCountEshantionGroup(Item.CodeGroup))>0 Then
			A = A + 1
			Item.SumMande = Item.SumMande - 1
		End If
		
	Else if MCode.ForooshBishAzMojoodi = "0" Then
		B = Item.SumMande - ((Item.TedadDarSabadKol * Item.TedadDarKarton) + Item.TedadDarSabadJoz + Item.FldEshantion)
		If B > 0 Then
				If Item.FldEshantion<myCode.Is_Null_adad(Item.fldCountEshantion) Or MCode.GetCountEshantionGroup(Item.CodeGroup)>0 Then
				A = A + 1
				Item.SumMande = Item.SumMande - 1
			End If
		Else
			ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
		End If
	End If
	Item.FldEshantion = A
'	Item.fldDarsadTakhfif=100
'	Item.MablaghTakhfif=Item.FeeForoosh
'	Item.Tozihat="اشانتیون"
		AddToSabad
		
		If minas>0 Then
			CallSubDelayed3(Act_KalaDefault,"UpEshantion",Item.CodeGroup,minas)
		End If
		
	Catch
		MCode.SendError(LastException)
		Log(LastException)
	End Try
End Sub

Sub BtnDownEshan_Click
	Try
		If Item.FldEshantion>0 Then
			If MCode.EshantionRemove=0 And MCode.EshantionTabaghati=1 Then
				ToastMessageShow("شما مجوز حذف قلم اشانتیون را ندارید",False)
				Return
			End If
		End If
	Dim A As Int = 0
	A = Item.FldEshantion
	If A > 0 Then
		A = A - 1
		Item.SumMande = Item.SumMande + 1  
		Item.FldEshantion  = A
		If A=0 Then
			Item.fldDarsadTakhfif=0
			Item.MablaghTakhfif=0
			Item.Tozihat=""
		End If
	End If
		AddToSabad
		CallSubDelayed3(Act_KalaDefault,"DownEshantion",Item,A)
	Catch
		MCode.SendError(LastException)
		Log(LastException)
	End Try
End Sub

Sub btn_edit_Price_Click
		If MCode.TaghirFeeKala=1 Then
			CallSubDelayed2(base,"btn_edit_Price_Click",Item)
		End If		
End Sub

Sub pnl_bk_Click
'	act_showKala.Item=Item
'	StartActivity(act_showKala)
End Sub



Sub btn_discount_Click
	If MCode.TakhfifKala=1 Then
		CallSubDelayed2(base,"btn_discount_Click",Item)
	End If
End Sub


Sub DisableArzeshAfzodeKala(Checked As Boolean)
	SwDisableArzeshAfzode.Checked=Checked
End Sub

Private Sub SwDisableArzeshAfzode_CheckedChange(Checked As Boolean)
	CallSubDelayed3(base,"DisableArzeshAfzode",Item,SwDisableArzeshAfzode)
End Sub