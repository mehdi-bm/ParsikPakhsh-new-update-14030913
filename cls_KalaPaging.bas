B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel
	Private Key As IME
	Private Item  As AdapterListKala

	Private pnl_bk As Panel
	Private lbl_title As Label
	Private LblFee As Label
	Private Panel1 As Panel
	Private BtnUpJoz As Label
	Private BtnDownJoz As Label
	Private LblTedadJoz As Label
	Private Panel2 As Panel
	Private BtnUpKol As Label
	Private BtnDownKol As Label
	Private LblTedadkol As Label
	Private Panel3 As Panel
	
'	Private lbl_sum As Label
	Private Label4 As Label
	Private LblFeeBadAzTakhfid As Label
	Private LblTedadKarton As Label
	Private LblMojoodiJoz As Label
	Private LblMojoodiKol As Label
	Private LblC_Kala As Label
	
	Private options As B4XListTemplate
	Private Dialog As B4XDialog
	Private XUI As XUI
	Private base As B4XView

	Private lbl_changePrice As Label
	Private btn_edit_Price As Label
	Private LblTedadEshan As Label
	Private BtnDownEshan As Label
	Private BtnUpEshan As Label
	Private ImageRow As ImageView
	Private ImageOff As ImageView
'	Private ImageGift As ImageView
'	Private ImageTozihat As ImageView
	Private lblVahedKol As Label
	Private lblVahedJoz As Label
	Private LblGift As Label
	Private LblTozihat As Label
	Private Lbl_Bascket As Label
	Private LblBasketCount As Label
	Dim maxkolRond As Long
	Private LblCountEshantion As Label
	Private LblMablaghMasrafkonande As Label
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	Key.Initialize("Key")
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("L_PageKala_2")

	Dialog.Initialize (base)
	options.Initialize
	options.AllowMultiSelection = False
	options.MultiSelectionMinimum = 1
	
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub getWidth As Int
	Return pnl_bk.Width
End Sub

Sub show(data As AdapterListKala)
	Item=data
'	CallSubDelayed(base,"RefreshLblSabad")
	RefreshLblSabad
	Try
		
		lbl_title.Text = Item.NameKala
		LblC_Kala.Text = "کد کالا: " & Item.CodeKala
		'Log( "FldACode_C=" & Item.CodeKala & "    FldC_Kala=" & Item.FldC_Kala &  "    FldC_S_GroohKala=" & Item.FldC_S_GroohKala)
'	If IsNumber(Item.FldFeeBadAzTakhfif) = True Then
'		If Item.FldFeeBadAzTakhfif > 0 Then
'			MCode.Rs.Initialize(NumberFormat(Item.FldFee,1,3) & " " & MCode.VahedPool)
'			MCode.Rs.Strikethrough (0, MCode.Rs.Length)
'			MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
'			LblFee.Text = MCode.Rs
'			LblFeeBadAzTakhfid.Text = NumberFormat(Item.FldFeeBadAzTakhfif,1,3) & " " & MCode.VahedPool
'			ImageOff.Visible=True
'		Else
'			LblFee.Text = NumberFormat(Item.FldFee,1,3) & " " & MCode.VahedPool
'			LblFeeBadAzTakhfid.Text = ""
'			ImageOff.Visible=False
'		End If
'	Else
'		LblFee.Text = NumberFormat(Item.FldFee,1,3) & " " & MCode.VahedPool
'		LblFeeBadAzTakhfid.Text = ""
'	End If
	
'	LblFee.Text ="فی کالا: "& NumberFormat(Item.FeeForoosh,1,3) & " " & MCode.VahedPool
'	
'	If LblFeeBadAzTakhfid.Text="0" Then
'		LblFeeBadAzTakhfid.Text="فی تخفیف: 0"
'	Else
'		LblFeeBadAzTakhfid.Text="فی تخفیف: "&NumberFormat(Item.fldFeeBadAzTakhfif,1,3) & " " & MCode.VahedPool
'	End If

'	Log( "   FldC_Kala=" & Item.FldC_Kala &  "    FldC_S_GroohKala=" & Item.FldC_S_GroohKala)
		If IsNumber(Item.FldFeeBadAzTakhfif) = True Then
			If Item.FldFeeBadAzTakhfif > 0 Then
				MCode.Rs.Initialize(NumberFormat(Item.FeeForoosh,1,3) & " " & MCode.VahedPool)
				MCode.Rs.Strikethrough (0, MCode.Rs.Length)
				MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
				LblFee.Text = MCode.Rs
				LblFeeBadAzTakhfid.Text = NumberFormat(Item.FldFeeBadAzTakhfif,1,3) & " " & MCode.VahedPool
				ImageOff.Visible=True
			Else
				LblFee.Text = NumberFormat(Item.FeeForoosh,1,3) & " " & MCode.VahedPool
				LblFeeBadAzTakhfid.Text = ""
				ImageOff.Visible=False
			End If
		Else
			LblFee.Text = NumberFormat(Item.FeeForoosh,1,3) & " " & MCode.VahedPool
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
		
		If Item.TedadDarKarton<>0 And IsNumber(Item.TedadDarKarton)=True Then
			maxkolRond=(Item.SumMandeKarton)
			LblTedadKarton.Text="تعداد در کارتن: "& Item.TedadDarKarton
			Log(maxkolRond)
		Else
			maxkolRond=0
			LblTedadKarton.Text="تعداد در کارتن:"&maxkolRond
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

	
		If myCode.Is_Null_adad(Item.FldMablaghMasrafKonande)>0 Then
			LblMablaghMasrafkonande.Text="قیمت مصرف کننده: "& NumberFormat(Item.FldMablaghMasrafKonande,1,3) & " " & MCode.VahedPool
		Else
			LblMablaghMasrafkonande.Text="قیمت مصرف کننده: 0"
		End If

		If Item.fldCountEshantion<>Null Then
			LblCountEshantion.Text="تعداد هدیه : " & Item.fldCountEshantion
			LblTedadEshan.Text=Item.FldEshantion
		Else
			LblCountEshantion.Text="تعداد هدیه : 0"
		End If
'		Glide.Load(File.DirAssets,"ICON.png").Apply(Glide.RequestOptions.Placeholder(MCode.placeHolder)).Into(ImageRow)
'		pico.LoadUrl(File.Combine(File.DirAssets,"ICON.png")).IntoImageView(ImageRow)
'		
		If MCode.HideMojodi=1 Then
			LblMojoodiJoz.Visible=False
			LblMojoodiKol.Visible=False
		Else
			LblMojoodiJoz.Visible=True
			LblMojoodiKol.Visible=True
		End If
		Try
			myCode.DownloadImage5(Item.CodeKala,Item.fldPathPic,ImageRow)
'			Dim Link As String
'			If MCode.PicOnline=1 Then
'				If Item.fldPathPic="0" Then
'					MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'					ImageRow.Bitmap=MCode.placeHolder
'				Else
'					ImageRow.Bitmap=Null
'					Log("Link= " & Item.fldPathPic)
'					Link=MCode.ImageUrl &Item.fldPathPic
'					myCode.DownloadImage2(Link,ImageRow)
'				End If
'			
'			Else
'				MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'				ImageRow.Bitmap=MCode.placeHolder
'				
'			End If
		
		Catch
			Log(LastException)
		End Try
		
	Catch
		Log(LastException)
	End Try
	If MCode.Action="SabtMarjooii" Then
		BtnUpEshan.Enabled=False
		BtnDownEshan.Enabled=False
		LblTedadEshan.Color=Colors.LightGray
	End If
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

Private Sub Add_Item(s As String)

	If s=Null Then
		Log("Null")
	Else If s.Trim="" Then
		Log("empty")
	Else If s.Trim="0" Then
		Log("zeroo")
	Else
		options.Options.Add(s)
	End If
End Sub

Sub LblGift_Click
	Try
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
'		If Cu.GetString("eshan") <> "0,0" Then
'			Eshan1=Regex.Split(",",Cu.GetString("eshan"))
'			Str(1) = "حالت اول: " & Eshan1(0) & " تا بخر ---------> " & Eshan1(1) & " تا " & NameEsh & " ببر"
'		End If
'
''	Message = Str(1) & CRLF & Str(2) & CRLF & Str(3) & CRLF & Str(4) & CRLF & Str(5)
'		Message = CRLF & Str(1) & CRLF & CRLF & Str(2) & CRLF & CRLF & Str(3) & CRLF & CRLF & Str(4) & CRLF & CRLF & Str(5)
'		Log(Message)
'		If Message.Trim.Length > 0 Then
'			Msgbox(Message,"اشانتیون به شرح ذیل می باشد:")
'		End If
	Catch
		Log(LastException)
	End Try

End Sub

Private Sub LblTozihat_Click
'	If Item.FldTozihat <> "" Then
'		Msgbox(Item.FldTozihat,"توضیحات کالا")
'	End If
End Sub


Sub AddEshantion(t As Int)

'	Dim ItemEshantion As AdapterListEshantion=MCode.LoadEshantion(Item.CodeKala)
'	Dim m,e,u As Int=0
'	If ItemEshantion<>Null Then
'		If ItemEshantion.fldVaziat=1 Then
'			m=ItemEshantion.fldCountForoosh
'			e=ItemEshantion.fldTedadEshantion
'			If t=m Then
'				Item.fldCountEshantion=e
'			End If
'			If t>m Then
'				u=(t/m)
'				Item.fldCountEshantion=u*e
'			End If
'			If t<m Then
'				Item.fldCountEshantion=0
'				Item.FldEshantion=0
'			End If
'			
'			If Item.fldCountEshantion>0 Then
'				LblCountEshantion.Text="تعداد هدیه : " & Item.fldCountEshantion
'				Else
'				LblCountEshantion.Text="تعداد هدیه : " & 0
'			End If
'		
'		End If
'	Else
'		Item.fldCountEshantion=0
'		Item.FldEshantion=0
'	End If

End Sub

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
'	If MCode.LoadEshantion(Item.CodeKala)<>Null Then
'		AddEshantion(A)
'	Else
'		Item.fldCountEshantion=0
'		Item.FldEshantion=0
'	End If
	AddToSabad
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
'	If MCode.LoadEshantion(Item.CodeKala)<>Null Then
'		AddEshantion(A)
'	Else
'		Item.fldCountEshantion=0
'		Item.FldEshantion=0
'	End If
	AddToSabad
End Sub

Sub BtnUpKol_Click
	If Item.TedadDarKarton=0 Then
		Return
	End If
	Dim A As Int = 0
	A = Item.TedadDarSabadKol
	If MCode.ForooshBishAzMojoodi = "1" Then
		A = A + 1
		Item.SumMandeKarton = Item.SumMandeKarton - A
	Else if MCode.ForooshBishAzMojoodi = "0" Then
		If MCode.Action="SabtMarjooii" Then
			A = A + 1
			Item.SumMandeKarton = Item.SumMandeKarton - Item.TedadDarSabadKol
		Else
			If Item.SumMandeKarton >= Item.TedadDarSabadKol  Then
				A = A + 1
				Item.SumMandeKarton = Item.SumMandeKarton - Item.TedadDarSabadKol
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

	LblTedadJoz.Text = Item.TedadDarSabadJoz
	LblTedadkol.Text = Item.TedadDarSabadKol
	LblTedadEshan.Text = Item.FldEshantion
	
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	Dim Check As Boolean
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		If Cu.GetString("FldCodeKala") = Item.CodeKala Then
			If Item.TedadDarSabadJoz = 0 And Item.TedadDarSabadKol = 0 And Item.FldEshantion = 0 Then
				MCode.SaveUpdate("Delete From TblSabad Where FldCodeKala = '"& Item.CodeKala &"'")
			Else
				MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadJoz = '"& Item.TedadDarSabadJoz &"',FldTedadDarSabadKol = '"& Item.TedadDarSabadKol & _
				"', FldEshantion = '"& Item.FldEshantion &"' Where FldCodeKala = '"& Item.CodeKala &"'")
			End If
			Check = True
			Exit
		End If
	Next
	If Check = False Then
		MCode.AddToSabad(Item)
	End If
	'CallSubDelayed(base,"RefreshLblSabad")
	RefreshLblSabad
End Sub

'Sub AddToSabad
'
'	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
'	Dim Check As Boolean
'	For i=0 To Cu.RowCount -1
'		Cu.Position=i
'		If Cu.GetString("FldCodeKala") = Item.CodeKala Then
'			If Item.TedadDarSabadJoz = 0 And Item.TedadDarSabadKol = 0  Then
'				MCode.SaveUpdate("Delete From TblSabad Where FldCodeKala = '"& Item.CodeKala &"'")
'			Else
'				MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadJoz = '"& Item.TedadDarSabadJoz &"',FldTedadDarSabadKol = '"& Item.TedadDarSabadKol &"',FldEshantion = '"& Item.FldEshantion& _
'				"' Where FldCodeKala = '"& Item.CodeKala &"'")
'			End If
'			Check = True
'			Exit
'		End If
'	Next
'	If Check = False Then
'		MCode.AddToSabad(Item)
'	End If
'		CallSubDelayed(base,"RefreshLblSabad")
'
'End Sub

Private Sub btn_back_Click
	
	
End Sub

Private Sub btn_close_Click
	btn_back_Click
End Sub

Private Sub ImageRow_Click
	Act_ImageSlideShow.Item = Item
	StartActivity(Act_ImageSlideShow)

End Sub

Private Sub lbl_changePrice_Click
	Dialog.Title = "انتخاب تیپ قیمت"
	If options.Options.Size<1 Then
		Return
	End If
	Dim TimedTemplate As B4XTimedTemplate
	TimedTemplate.Initialize(options)
	TimedTemplate.TimeoutMilliseconds = 10000 'close after 10 seconds (this is the default value)
	Wait For (Dialog.ShowTemplate(TimedTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
'		Dialog.Show($"You selected: ${options.SelectedItems}"$, "OK", "", "")
'		Item.FldFee=options.SelectedItems.Get(0)
'		LblFee.Text = NumberFormat(Item.FldFee,1,3) & " " & MCode.VahedPool
	End If
End Sub

Sub LblTedadJoz_Click
	CallSubDelayed2(base,"LblTedadJoz_Click",Item)
End Sub

Sub LblTedadKol_Click
	CallSubDelayed2(base,"LblTedadKol_Click",Item)
End Sub

Private Sub btn_edit_Price_Click
'	Dim input As B4XInputTemplate
'	input.Initialize
'	input.lblTitle.Text = "قیمت جدید:"
'	input.ConfigureForNumbers(True, True)
'	Dim rs As ResumableSub = Dialog.ShowTemplate(input, "OK", "", "CANCEL")
'	Dialog.Base.Top = 50%y - Dialog.Base.Height / 2
'	Wait For (rs) Complete (Result As Int)
'	If Result = XUI.DialogResponse_Positive Then
'		If input.Text="" Then input.Text=0
'		Dim res As Float = input.Text 'no need to check with IsNumber
'		If Item.fldFeeBadAzTakhfif=0 Then
'			Item.FeeForoosh=res
'		Else
'			Item.fldFeeBadAzTakhfif=res
'		End If
'	End If
End Sub

Sub BtnUpEshan_Click
	Try
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
	Catch
		MCode.SendError(LastException)
		Log(LastException)
	End Try
End Sub

Sub BtnDownEshan_Click
	Try
		Dim A As Int = 0
		A = Item.FldEshantion
		If A > 0 Then
			A = A - 1
			Item.SumMande = Item.SumMande + 1
			Item.FldEshantion  = A
		End If
		AddToSabad
	Catch
		MCode.SendError(LastException)
		Log(LastException)
	End Try
End Sub

Sub Panel3_Click
	If LblBasketCount.Visible Then
		CallSubDelayed(Act_KalaPaging,"Panel3_Click")
	Else
		ToastMessageShow("سبد خرید خالی است",False)
	End If
End Sub

Sub RefreshLblSabad
	Try
		Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
		If Cu.RowCount>0 Then
			LblBasketCount.Visible=True
			LblBasketCount.Text=Cu.RowCount
			'Lbl_Bascket.Text="ثبت سفارش  " & NumberFormat2((Item.FldTedadjoz + (Item.FldTedadKol*Item.FldTedadKarton)) * Item.FldFee,0,0,0,True)
		Else
			LblBasketCount.Visible=False
		End If
	Catch
		Log(LastException)
	End Try

End Sub