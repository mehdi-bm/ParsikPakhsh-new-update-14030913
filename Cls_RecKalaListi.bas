B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel
'	Private ImageRow As ImageView
	Private ImageOff As ImageView
	Private LblGift As Label
	Private lbl_title As Label
	Private ImageCall As ImageView
	Private LblFee As Label
	Private LblFeeBadAzTakhfid As Label
	Private LblC_Kala As Label
	Private LblTozihat As Label
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

	
	Private btn_edit_Price As Label
	Dim maxkolRond As Long
	Private LblCountEshantion As Label
	Private btn_discount As Label
	Private LblMablaghTakhfif As Label
	Private LblMablaghMasrafkonande As Label
	Private lblSumMablaghKala As Label
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	Key.Initialize("Key")
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("L_RecKalaListi_2")
	
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
	
	
	lbl_title.Text = Item.NameKala
	LblC_Kala.Text = "کد کالا: " & Item.CodeKala
	
	
	Dim feebadaztakhfif As Int=(MCode.SingleResult("select fldFeeBadAzTakhfif from TblKala where fldCodeKala="& Item.CodeKala))
	If Item.MablaghTakhfif>0 And feebadaztakhfif=0 Then
		Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.MablaghTakhfif
'		ToastMessageShow("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.",True)
	else If Item.MablaghTakhfif>0 And feebadaztakhfif>0 Then
		Item.fldFeeBadAzTakhfif=feebadaztakhfif-Item.MablaghTakhfif
'		ToastMessageShow("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.",True)
	Else if Item.MablaghTakhfif=0 And feebadaztakhfif=0 Then
		Item.fldFeeBadAzTakhfif=Item.MablaghTakhfif
		Item.MablaghTakhfif=Item.MablaghTakhfif
	Else if Item.MablaghTakhfif=0 And feebadaztakhfif>0 Then
		Item.fldFeeBadAzTakhfif=feebadaztakhfif
	End If
	
	Dim fee As Int
	'If Item.fldTipFee=0 Then
	fee=Item.FeeForoosh
	If Item.MablaghTakhfif>0 Then
		Item.fldFeeBadAzTakhfif=fee-Item.MablaghTakhfif
		LblMablaghTakhfif.Text="فی تخفیف: "& NumberFormat(Item.MablaghTakhfif,1,3) & " " & MCode.VahedPool
		LblMablaghTakhfif.TextColor=Colors.Red
		LblMablaghTakhfif.Visible=True
	Else
		LblMablaghTakhfif.Text=0
		LblMablaghTakhfif.Visible=False
	End If
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
	Log(fee)
	If IsNumber(Item.FldFeeBadAzTakhfif) = True Then
		
		If Item.fldFeeBadAzTakhfif>=fee Then
			LblFee.Text ="فی فروش: "& NumberFormat(fee,1,3) & " " & MCode.VahedPool
			LblFeeBadAzTakhfid.Text = ""
			Item.FldFeeBadAzTakhfif=0
			ImageOff.Visible=False
		Else If Item.FldFeeBadAzTakhfif > 0 Then
			MCode.Rs.Initialize("فی فروش: "& NumberFormat(fee,1,3) & " " & MCode.VahedPool)
			MCode.Rs.Strikethrough (0, MCode.Rs.Length)
			MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
			LblFee.Text = MCode.Rs
			LblFeeBadAzTakhfid.Text ="فی بعد از تخفیف: "& NumberFormat(Item.FldFeeBadAzTakhfif,1,3) & " " & MCode.VahedPool
			ImageOff.Visible=True
		Else
			LblFee.Text ="فی فروش: "& NumberFormat(fee,1,3) & " " & MCode.VahedPool
			LblFeeBadAzTakhfid.Text = ""
			ImageOff.Visible=False
		End If
	Else
		LblFee.Text ="فی فروش: "& NumberFormat(fee,1,3) & " " & MCode.VahedPool
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
	lblVahedKol.Text = "تعداد به "& Item.NameVahed2

	
'	LblTedadEshan.Text = Item.FldEshantion
	'
'	Log(Item.FldTozihat)
'	If Item.FldTozihat <> ""   Then
'		LblTozihat.Visible=True
'	Else
'		LblTozihat.Visible=False
'	End If
'	
	If Item.FldEshantion=Null Then
		Item.FldEshantion=0
	End If
	Dim Price As Long=0
	If Item.FldFeeBadAzTakhfif > 0 Then
		Price = Item.FldFeeBadAzTakhfif * ((Item.TedadDarSabadKol * Item.TedadDarKarton) + Item.TedadDarSabadJoz)
		ImageOff.Visible=True
	Else
		Price = Item.FeeForoosh * ((Item.TedadDarSabadKol * Item.TedadDarKarton) + Item.TedadDarSabadJoz)
		ImageOff.Visible=False
	End If
	If Price>0 Then
		lblSumMablaghKala.Text="جمع مبلغ: "& NumberFormat(Price,1,3) & " " & MCode.VahedPool
	Else
		lblSumMablaghKala.Text="جمع مبلغ: 0"
	End If
	
	If Item.TedadDarKarton<>0 And IsNumber(Item.TedadDarKarton)=True Then
		maxkolRond=(Item.SumMandeKarton)
'		LblTedadKarton.Text="تعداد در کارتن: "& Item.TedadDarKarton
		If Item.NameVahed2="" Then
			LblTedadKarton.Text="تعداد در کارتن: "& Item.TedadDarKarton
		Else
			LblTedadKarton.Text="تعداد در "&Item.NameVahed2&": "& Item.TedadDarKarton
		End If
		Log(maxkolRond)
	Else
		maxkolRond=0
'		LblTedadKarton.Text="تعداد در کارتن:"&maxkolRond
		If Item.NameVahed2="" Then
			LblTedadKarton.Text="تعداد در کارتن: "& maxkolRond
		Else
			LblTedadKarton.Text="تعداد در "&Item.NameVahed2&": "& maxkolRond
		End If
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
	

	
	
	If Item.FldMablaghMasrafKonande>0 Then
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
	
	LblGift.Visible=MCode.CheckEshantion(Item.CodeKala)

End Sub

Sub Status(Enable As Boolean)
	LogColor("status: "&Enable,Colors.Red)
	BtnDownEshan.Enabled=Enable
	BtnUpEshan.Enabled=Enable
	LblTedadEshan.Enabled=Enable
	
	BtnDownJoz.Enabled=Enable
	BtnUpJoz.Enabled=Enable
	LblTedadJoz.Enabled=Enable
	
	BtnDownKol.Enabled=Enable
	BtnUpKol.Enabled=Enable
	LblTedadkol.Enabled=Enable
End Sub

Sub Btn_call_Click
	Dim str As String=$"جهت دریافت قیمت همکار لطفا با شماره
		 021-888821546 
		 تماس بگیرید"$
	Msgbox(str,"قیمت همکاری")
End Sub
'
'Sub LblGift_Click
'	Try
'		Dim Str(6) As String
'		Dim Message As String = ""
'		Dim Eshan1(),Eshan2(),Eshan3(),Eshan4(),Eshan5() As String
'		Dim NameEsh As String
'		Dim Cu As Cursor = MCode.Result("Select FldN_Kala From TblKala Where FldC_Kala = '"& Item.Esh_C_Kala &"'")
'		If Cu.RowCount>0 Then
'			Cu.Position=0
'			NameEsh = Cu.GetString("FldN_Kala")
'		Else
'			NameEsh = ""
'		End If
'	
'		Cu = MCode.Result("Select * From TblKala Where FldC_Kala = '"& Item.FldC_Kala &"'")
'		Cu.Position=0
'		If Cu.GetString("eshan") <> "0,0" Then
'			Eshan1=Regex.Split(",",Cu.GetString("eshan"))
'			Str(1) = "حالت اول: " & Eshan1(0) & " تا بخر ---------> " & Eshan1(1) & " تا " & NameEsh & " ببر"
'			Msgbox(Message,"اشانتیون به شرح ذیل می باشد:")
'		End If
'
''	Message = Str(1) & CRLF & Str(2) & CRLF & Str(3) & CRLF & Str(4) & CRLF & Str(5)
''		Message = CRLF & Str(1) & CRLF & CRLF & Str(2) & CRLF & CRLF & Str(3) & CRLF & CRLF & Str(4) & CRLF & CRLF & Str(5)
''		Log(Message)
''		If Message.Trim.Length > 0 Then
''			Msgbox(Message,"اشانتیون به شرح ذیل می باشد:")
''		End If
'	Catch
'		Log(LastException)
'	End Try
'
'End Sub

'Sub LblTozihat_Click
'	If Item.FldTozihat <> "" Then
'		Msgbox(Item.Tozihat,"توضیحات کالا")
'	End If
'End Sub

Sub BtnUpJoz_Click
	Dim A As Float = 0
	Dim Val As Float = 0
	Select Case MCode.isFloat
		Case True
			Val = 0.25
		Case False
			Val = 1
	End Select
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
	AddEshantion(A)
	AddToSabad
End Sub

Sub AddEshantion(t As Int)
'	If MCode.LoadEshantion(Item.CodeKala)<>Null Then
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
'		
'			End If
'		Else
'			Item.fldCountEshantion=0
'			Item.FldEshantion=0
'		End If
'	Else
'		Item.fldCountEshantion=0
'		Item.FldEshantion=0
'	End If
End Sub

Sub BtnDownJoz_Click
	
	Dim A As Float = 0
	Dim Val As Float = 0
	Select Case MCode.isFloat
		Case True
			Val = 0.25
		Case False
			Val = 1
	End Select
	
	A = Item.TedadDarSabadJoz
	If A > 0 Then
		A = A - Val
		Item.SumMande = Item.SumMande + Val
		Item.TedadDarSabadJoz = A
	End If
	AddEshantion(A)
	AddToSabad
End Sub

Sub BtnUpKol_Click
	If Item.TedadDarKarton=0 Then
		Return
	End If
	Dim A As Int = 0
	Dim Val As Float = 1
	A = Item.TedadDarSabadKol
	If MCode.ForooshBishAzMojoodi = "1" Then
		A = A + 1
		Item.SumMandeKarton = Item.SumMandeKarton - A
	Else if MCode.ForooshBishAzMojoodi = "0" Then
		If MCode.Action="SabtMarjooii" Then
			A = A + 1
			Item.SumMandeKarton = Item.SumMandeKarton - Val
		Else
			If Item.SumMandeKarton >= Item.TedadDarSabadKol  Then
				A = A + 1
				Item.SumMandeKarton = Item.SumMandeKarton - Val
			Else
				ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
			End If
		End If
		
	End If
	Item.TedadDarSabadKol = A
	AddToSabad
End Sub

Sub BtnDownKol_Click
	Dim A As Int = 0
	A = Item.TedadDarSabadKol
	If A > 0 Then
		A = A - 1
		Item.SumMandeKarton = Item.SumMandeKarton + Item.TedadDarSabadKol
		Item.TedadDarSabadKol = A
	End If
	AddToSabad
End Sub

Sub AddToSabad

	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	Dim Check As Boolean
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		If Cu.GetString("FldCodeKala") = Item.CodeKala Then
			If Item.TedadDarSabadJoz = 0 And Item.TedadDarSabadKol = 0  Then
				MCode.SaveUpdate("Delete From TblSabad Where FldCodeKala = '"& Item.CodeKala &"'")
			Else
				MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadJoz = '"& Item.TedadDarSabadJoz &"',FldTedadDarSabadKol = '"& Item.TedadDarSabadKol &"',FldEshantion = '"& Item.FldEshantion& _
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

Sub LblTedadJoz_Click
	CallSubDelayed2(base,"LblTedadJoz_Click",Item)
End Sub

Sub LblTedadKol_Click
	CallSubDelayed2(base,"LblTedadKol_Click",Item)
End Sub

'Sub Download (link As String)
'	Dim LowerCaseLink As String = link.ToLowerCase
'	If link.IndexOf("http")>-1 Or link.IndexOf("HTTP")>-1 Or link.IndexOf("Http")>-1 Then
'		Dim filename As String
'		filename = GetFilename(link)
'		If File.Exists(Starter.SharedFolder,filename) Then
'			ImageRow.Bitmap=LoadBitmapSample(Starter.SharedFolder,filename,300dip,300dip)
'		Else
'			If LowerCaseLink.Contains("jpg") Or LowerCaseLink.Contains("jpeg") Or LowerCaseLink.Contains("png") Then
'				Dim j As HttpJob
'				j.Initialize(link,Me)
'				j.Download(link)
'				Wait For (j) JobDone(Job As HttpJob)
'				If Job.Success Then
'					Try
'						Dim bmp As Bitmap = Job.GetBitmap
'						ImageRow.Bitmap=bmp
'						filename = GetFilename(Job.JobName)
'						WriteBitmap2File(bmp,90,filename)
'					Catch
'						Log(LastException)
'						ImageRow.Bitmap=MCode.ImgNothing
'					End Try
'				Else
'					ImageRow.Bitmap=MCode.ImgNothing
'				End If
'			Else
'				ToastMessageShow("فرمت تصویر اشتباه است",True)
'				ImageRow.Bitmap=MCode.ImgNothing
'			End If
'		End If
'	Else
'		ImageRow.Bitmap=MCode.ImgNothing
'	End If
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
	Dim A As Int = 0
	Dim B As Int = 0
	A = Item.FldEshantion
	If MCode.ForooshBishAzMojoodi = "1" Then
		If Item.FldEshantion<Item.fldCountEshantion Then
			A = A + 1
			Item.SumMande = Item.SumMande - 1
		End If
		
	Else if MCode.ForooshBishAzMojoodi = "0" Then
		B = Item.SumMande - ((Item.TedadDarSabadKol * Item.TedadDarKarton) + Item.TedadDarSabadJoz + Item.FldEshantion)
		If B > 0 Then
			If Item.FldEshantion<Item.fldCountEshantion Then
				A = A + 1
				Item.SumMande = Item.SumMande - 1
			End If
		Else
			ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
		End If
	End If
	Item.FldEshantion = A
	AddToSabad
End Sub

Sub BtnDownEshan_Click
	Dim A As Int = 0
	A = Item.FldEshantion
	If A > 0 Then
		A = A - 1
		Item.SumMande = Item.SumMande + 1
		Item.FldEshantion  = A
	End If
	AddToSabad
End Sub

Sub btn_edit_Price_Click
	CallSubDelayed2(base,"btn_edit_Price_Click",Item)
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