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
	
	Private lbl_sum As Label
	'Private Label4 As Label
	Private LblFeeBadAzTakhfid As Label
	Private LblTedadKarton As Label
	Private LblMojoodi As Label
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
	Private Label1 As Label
	Private LblMojoodiKol As Label
	Private LblMojoodiJoz As Label
	Dim maxkolRond As Long
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	Key.Initialize("Key")
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
'	p.LoadLayout("L_PageKala_2")
	p.LoadLayout("L_PageKala_Search")

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
	CallSubDelayed(base,"RefreshLblSabad")
	Try	
		lbl_title.Text = Item.NameKala
		LblC_Kala.Text = "کد کالا: " & Item.CodeKala
		LblGift.Visible=MCode.CheckEshantion(Item.CodeKala)
'
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
		If Item.TedadDarKarton<>0 And IsNumber(Item.TedadDarKarton)=True Then
			maxkolRond=(Item.SumMande/Item.TedadDarKarton)
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
		LblGift.Visible=MCode.CheckEshantion(Item.CodeKala)
'		LblTedadJoz.Text = Item.FldTedadJoz
'		lblVahedJoz.Text = "تعداد به "& Item.FldN_Vahed
'		LblTedadkol.Text = Item.FldTedadkol
'		lblVahedKol.Text = "تعداد به "& Item.FldN_Vahed_Kol
'		LblTedadEshan.Text = Item.FldEshantion
'
'		If Item.FldFee = 0 Then
'			Status(False)
'		Else
'			Status(True)
'			If MCode.DoVahedi = 0 Then
'				LblTedadKarton.Text = "تعداد در " & Item.FldN_Vahed_Kol & ": " & " - "
'				BtnUpKol.Enabled=False
'				BtnDownKol.Enabled=False
'				LblTedadkol.Enabled=False
'				LblTedadkol.Text = "-"
'			Else
'				If Item.FldTedadKarton = "0" Then
'					LblTedadKarton.Text = "تعداد در " & Item.FldN_Vahed_Kol & ": " & " - "
'					BtnUpKol.Enabled=False
'					BtnDownKol.Enabled=False
'					LblTedadkol.Enabled=False
'					LblTedadkol.Text = "-"
'				Else
'					LblTedadKarton.Text = "تعداد در " & Item.FldN_Vahed_Kol & ": " & Item.FldTedadKarton & " " & Item.FldN_Vahed
'					BtnUpKol.Enabled=True
'					BtnDownKol.Enabled=True
'					LblTedadkol.Enabled=True
'				End If
'			End If
'		End If
'		If MCode.ShowMande=1 Then
'			Item.FldMande=Item.FldMande-Item.FldTedadjoz + (Item.FldTedadkol * Item.FldTedadKarton)
'			LblMojoodi.Text = "موجودی: " & Item.FldMande
'		Else
'			LblMojoodi.Text = ""
'		End If
'	
'		If Item.FldTozihat <> ""   Then
'			LblTozihat.Visible=True
'		Else
'			LblTozihat.Visible=False
'		End If
'	
'
'		Add_Item(Item.FldTipFee3)
'		Add_Item(Item.FldTipFee4)
'		Add_Item(Item.FldTipFee5)
'		Add_Item(Item.FldTipFee6)
'		Add_Item(Item.FldTipFee7)
'		Add_Item(Item.FldTipFee8)
'		Add_Item(Item.FldTipFee9)
'		Add_Item(Item.FldTipFee10)
'	
'		Dim btnshow As Int=myCode.getSetting("setting.dat","WSetTip",0)
'		Log(btnshow)
'		If btnshow=0 Then
'			lbl_changePrice.Visible=False
'		Else
'			lbl_changePrice.Visible=False
'		End If
'		
'		Dim btnChangePrice As Int=myCode.getSetting("setting.dat","WSetFee",0)
'		Log(btnshow)
'		If btnChangePrice=0 Then
'			btn_edit_Price.Visible=False
'		Else
'			btn_edit_Price.Visible=False
'		End If
'	
'		Dim eshan As Int=myCode.getSetting("setting.dat","WSetEshan",0)
'		LogColor("Eshan= " & eshan,Colors.Cyan)
''		If eshan=1 Then
''			BtnUpEshan.Enabled=True
''			BtnDownEshan.Enabled=True
''			LblGift.Visible=True
''			LblTedadEshan.Color=Colors.Transparent
''			LogColor("Eshan1= " & Item.FldEshantion,Colors.Cyan)
''			If Item.eshan = "0,0" Then
''				BtnUpEshan.Enabled=False
''				BtnDownEshan.Enabled=False
''				LblGift.Visible=False
''				LogColor("Eshan2= " & eshan,Colors.Cyan)
''			End If
''		Else
''			BtnUpEshan.Enabled=False
''			BtnDownEshan.Enabled=False
''			LblGift.Visible=False
''			LogColor("Eshan3= " & eshan,Colors.Cyan)
''		End If
'		If eshan=1 Then
'			If Item.eshan = "0,0" Then
'				BtnUpEshan.Enabled=True
'				BtnDownEshan.Enabled=True
'				LblTedadEshan.Visible=True
'				LblTedadEshan.Color=Colors.Transparent
'			Else
'				BtnUpEshan.Enabled=False
'				BtnDownEshan.Enabled=False
'				LblTedadEshan.Visible=False
'				LblTedadEshan.Color=Colors.Transparent
'			End If
'		Else
'			BtnUpEshan.Enabled=False
'			BtnDownEshan.Enabled=False
'			LblTedadEshan.Visible=False
'			LblTedadEshan.Color=Colors.Transparent
'		End If
'		If Item.eshan = "0,0" Then
'			LblGift.Visible=False
'		Else
'			LblGift.Visible=True
'		End If
		
	Catch
		Log(LastException)
	End Try
'	If MCode.Action="SabtMarjooii" Then
'		BtnUpEshan.Enabled=False
'		BtnDownEshan.Enabled=False
'		LblTedadEshan.Color=Colors.LightGray
'	End If
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
	'Try
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
'	Catch
'		Log(LastException)
'	End Try

End Sub

Private Sub LblTozihat_Click
'	If Item.FldTozihat <> "" Then
'		Msgbox(Item.FldTozihat,"توضیحات کالا")
'	End If
End Sub

Private Sub BtnUpJoz_Click
	Dim A As Float = 0
	Dim Val As Float = 0
	Select Case MCode.isFloat
		Case True
			Val = 0.25
		Case False
			Val = 1
	End Select
	
	A = Item.TedadDarSabadJoz
'	If MCode.ForooshBishAzMojoodi = "1" Then
'		A = A + Val
'		Item.FldMande = Item.FldMande - Val
'
'	Else if MCode.ForooshBishAzMojoodi = "0" Then
'		If Item.FldMande > 0 Then
'			A = A + Val
'			Item.FldMande = Item.FldMande - Val
'		Else
'			ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
'		End If
'	End If
	'Item.FldTedadJoz = A
	AddToSabad
End Sub

Private Sub BtnDownJoz_Click
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

	AddToSabad
End Sub

Private Sub BtnUpKol_Click
'	Dim A As Int = 0
'	
'	A = Item.FldTedadKol
'	If MCode.ForooshBishAzMojoodi = "1" Then
'		A = A + 1
'		Item.FldMande = Item.FldMande - Item.FldTedadKarton
'
'	Else if MCode.ForooshBishAzMojoodi = "0" Then
'		If Item.FldMande >= Item.FldTedadKarton  Then
''			If Item.FldMax > 0 Then
''				If  A < Item.FldMax Then
''					A = A + 1
''				Else
''					ToastMessageShow("مقدار انتخابی شما بیشتر از حد مجاز است.",True)
''				End If
''			Else
'			A = A + 1
'			Item.FldMande = Item.FldMande - Item.FldTedadKarton
''			End If
'		Else
'			ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
'		End If
'	End If
'	Item.FldTedadKol = A
'	AddToSabad
End Sub

Private Sub BtnDownKol_Click
	Dim A As Int = 0

	A = Item.TedadDarSabadKol
	If A > 0 Then
		A = A - 1
		Item.SumMande = Item.SumMande + Item.TedadDarKarton
		Item.TedadDarSabadKol = A
	End If
	AddToSabad
End Sub

Private Sub AddToSabad
	LblMojoodi.Text = "موجودی: " & Item.SumMande
	If Item.SumMande < 0 Then
		LblMojoodi.TextColor=Colors.Red
	Else
		LblMojoodi.TextColor=Colors.Black
	End If

	LblTedadJoz.Text = Item.TedadDarSabadJoz
	lblVahedJoz.Text = "تعداد به "& Item.NameVahed
	LblTedadkol.Text = Item.TedadDarSabadKol
	lblVahedKol.Text = "تعداد به "& Item.NameVahed2
	'LblTedadEshan.Text = Item.FldEshantion
	lbl_sum.Text=NumberFormat2((Item.TedadDarSabadJoz + (Item.TedadDarSabadKol*Item.TedadDarKarton)) * Item.FeeForoosh,0,0,0,True)
	
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	Dim Check As Boolean
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		If Cu.GetString("FldC_Kala") = Item.CodeKala Then
			If Item.TedadDarSabadJoz = 0 And Item.TedadDarSabadJoz = 0  Then
				MCode.SaveUpdate("Delete From TblSabad Where FldC_Kala = '"& Item.CodeKala &"'")
			Else
				MCode.SaveUpdate("Update TblSabad Set FldTedadJoz = '"& Item.TedadDarSabadJoz &"',FldTedadKol = '"& Item.TedadDarSabadKol & _
				"'  Where FldC_kala = '"& Item.CodeKala &"'")
			End If
			Check = True
			Exit
		End If
	Next
	If Check = False Then
		'MCode.AddToSabad(Item)
	End If
	CallSubDelayed(base,"RefreshLblSabad")
End Sub

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
'	Dialog.Title = "انتخاب تیپ قیمت"
'	If options.Options.Size<1 Then
'		Return
'	End If
'	Dim TimedTemplate As B4XTimedTemplate
'	TimedTemplate.Initialize(options)
'	TimedTemplate.TimeoutMilliseconds = 10000 'close after 10 seconds (this is the default value)
'	Wait For (Dialog.ShowTemplate(TimedTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
'	If Result = XUI.DialogResponse_Positive Then
''		Dialog.Show($"You selected: ${options.SelectedItems}"$, "OK", "", "")
'		Item.FldFee=options.SelectedItems.Get(0)
'		LblFee.Text = NumberFormat(Item.FldFee,1,3) & " " & MCode.VahedPool
'	End If
End Sub

Private Sub LblTedadJoz_Click
'	Dialog.Title = "  "
'	Dim input As B4XInputTemplate
'	input.Initialize
'	input.lblTitle.Text = " تعداد "&Item.FldN_Vahed
'	Select Case MCode.isFloat
'		Case True
'			input.ConfigureForNumbers(True, True)
'		Case False
'			input.ConfigureForNumbers(False, True)
'	End Select
'	
'	Dim rs As ResumableSub =Dialog.ShowTemplate(input, "OK", "", "CANCEL")
'	Dialog.Base.Top = 50%y - Dialog.Base.Height / 2
'	Wait For (rs) Complete (Result As Int)
'	If Result = XUI.DialogResponse_Positive Then
'		Dim res As Float = input.Text 'no need to check with IsNumber
'		If res>0 Then
'			Item.FldTedadJoz = res
'			AddToSabad
'		End If
'	End If

End Sub

Private Sub LblTedadkol_Click
'	Dialog.Title = "  "
'	Dim input As B4XInputTemplate
'	input.Initialize
'	input.lblTitle.Text = " تعداد "&Item.FldN_Vahed_Kol
'	input.ConfigureForNumbers(True, True)
'	
'	Dim rs As ResumableSub =Dialog.ShowTemplate(input, "OK", "", "CANCEL")
'	Dialog.Base.Top = 50%y - Dialog.Base.Height / 2
'	Wait For (rs) Complete (Result As Int)
'	If Result = XUI.DialogResponse_Positive Then
'		Dim res As Float = input.Text 'no need to check with IsNumber
'		If res>0 Then
'			Item.FldTedadKol = res
'			AddToSabad
'		End If
'	End If
End Sub

Private Sub btn_edit_Price_Click
	Dim input As B4XInputTemplate
	input.Initialize
	input.lblTitle.Text = "قیمت جدید:"
	input.ConfigureForNumbers(True, True)
	Dim rs As ResumableSub = Dialog.ShowTemplate(input, "OK", "", "CANCEL")
	Dialog.Base.Top = 50%y - Dialog.Base.Height / 2
	Wait For (rs) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		If input.Text="" Then input.Text=0
		Dim res As Float = input.Text 'no need to check with IsNumber
		Item.FeeForoosh=res
		MCode.SaveUpdate("Update TblKala Set FldFee='"&res&"' where FldC_Kala = '"& Item.CodeKala &"'")
		LblFee.Text = NumberFormat(Item.FeeForoosh,1,3) & " " & MCode.VahedPool
	End If
End Sub

Private Sub BtnUpEshan_Click
	Dim A As Int = 0
	Dim B As Int
	
'	A = Item.FldEshantion
'	If MCode.ForooshBishAzMojoodi = "1" Then
'		A = A + 1
'		Item.FldMande = Item.FldMande - 1
'	Else if MCode.ForooshBishAzMojoodi = "0" Then
'		B = Item.FldMande - ((Item.FldTedadKol * Item.FldTedadKarton) + Item.FldTedadJoz + Item.FldEshantion)
'		If B > 0 Then
''			If Item.FldMax > 0 Then
''				If  A < Item.FldMax Then
''					A = A + 1
''				Else
''					ToastMessageShow("مقدار انتخابی شما بیشتر از حد مجاز است.",True)
''				End If
''			Else
'			A = A + 1
'			Item.FldMande = Item.FldMande - 1
''			End If
'		Else
'			ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
'		End If
'	End If
'	Item.FldEshantion = A
'	AddToSabad

End Sub

Private Sub BtnDownEshan_Click
'	Dim A As Int = 0
'
'	A = Item.FldEshantion
'	If A > 0 Then
'		A = A - 1
'		Item.FldMande = Item.FldMande + 1
'		Item.FldEshantion  = A
'	End If
'	AddToSabad
End Sub
