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
	
	Dim maxkolRond As Long
	Dim Glide As Hitex_Glide
'	Dim Glide As Hitex_Glide
'	Dim ImgRow As ImageView
	'Private fldFeeBadAzTakhfif As Label
	
	Private Panel4 As Panel
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	Key.Initialize("Key")
	
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("L_RecSearch")
'	ImgRow.Initialize("ImgRow")
'	p.AddView(ImgRow,70%x,1%y,29%x,23%y)
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
	
	
	

	LblTedadJoz.Text ="تعداد جزء"& Item.TedadDarSabadJoz
	lblVahedJoz.Text = "تعداد به "& Item.NameVahed
	LblTedadkol.Text ="تعداد کل"& Item.TedadDarSabadKol
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

	LblGift.Visible=MCode.CheckEshantion(Item.CodeKala)
	If MCode.HideMojodi=1 Then
		LblMojoodiJoz.Visible=False
		LblMojoodiKol.Visible=False
	Else
		LblMojoodiJoz.Visible=True
		LblMojoodiKol.Visible=True
	End If

	Try
'		Dim Link As String
'		If MCode.PicOnline=1 Then
'			If Item.fldPathPic="0" Then
'				MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'				ImageRow.Bitmap=MCode.placeHolder
'			Else
'				Log("Link= " & Item.fldPathPic)
'				Link=MCode.ImageUrl &Item.fldPathPic
'				myCode.DownloadImage2(Link,ImageRow)
'			End If
'			
'		Else
'			MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'			ImageRow.Bitmap=MCode.placeHolder
'				
'		End If
		myCode.DownloadImage5(Item.CodeKala,Item.fldPathPic,ImageRow)
	Catch
		Log(LastException)
	End Try




	
'	
'	If MCode.ShowMande=1 Then
'		If Item.FldTedadKarton = 0 Then
'			LblMojoodiJoz.Text = "موجودی جز: " & LblTedadJoz.Text &" " &lblVahedJoz.Text
'			LblMojoodiKol.Text = "موچودی کل: " & LblTedadkol.Text &" "&lblVahedKol.Text
'		Else
'			Dim a,b As Int
'			a=Item.FldMande
'			b=Item.FldTedadKarton
'			LblMojoodi.Text = "موجودی: " & NumberFormat((a/b),0,0) & Item.FldN_Vahed_Kol & " و " & (a Mod b) & Item.FldN_Vahed
'		End If
'	Else
'		LblMojoodi.Text = ""
'	End If

'	LblGift.Visible=True
'	Dim eshan As Int=myCode.getSetting("setting.dat","WSetEshan",0)
	'LogColor("Eshan= " & eshan,Colors.Cyan)
'	If eshan=1 Then
'		BtnUpEshan.Enabled=True
'		BtnDownEshan.Enabled=True
'		LblGift.Visible=True
'		LblTedadEshan.Color=Colors.Transparent
'		LogColor("Eshan1= " & Item.FldEshantion,Colors.Cyan)
'		If Item.eshan = "0,0" Then
'			BtnUpEshan.Enabled=False
'			BtnDownEshan.Enabled=False
'			LblGift.Visible=False
'			LogColor("Eshan2= " & eshan,Colors.Cyan)
'		End If
'	Else
'		BtnUpEshan.Enabled=False
'		BtnDownEshan.Enabled=False
'		LblGift.Visible=False
'		LogColor("Eshan3= " & eshan,Colors.Cyan)
'	End If
'	If eshan=1 Then
'		If Item.eshan = "0,0" Then
'			BtnUpEshan.Enabled=True
'			BtnDownEshan.Enabled=True
'			LblTedadEshan.Visible=True
'			LblTedadEshan.Color=Colors.Transparent
'		Else
'			BtnUpEshan.Enabled=False
'			BtnDownEshan.Enabled=False
'			LblTedadEshan.Visible=False
'			LblTedadEshan.Color=Colors.Transparent
'		End If
'	Else
'		BtnUpEshan.Enabled=False
'		BtnDownEshan.Enabled=False
'		LblTedadEshan.Visible=False
'		LblTedadEshan.Color=Colors.Transparent
'	End If
'	If Item.eshan = "0,0" Then
'		LblGift.Visible=False
'	Else
'		LblGift.Visible=True
'	End If
'	
'	If MCode.Action="SabtMarjooii" Then
'		BtnUpEshan.Enabled=False
'		BtnDownEshan.Enabled=False
'		LblTedadEshan.Color=Colors.LightGray
'	End If
'	
'	If Item.FldLink=Null Then
'		Return
'	End If
'	

'	If Item.FldLink.Length<15 Then
'		ImageRow.Bitmap=LoadBitmap(File.DirAssets,"nothing2.png")
'	Else
'		Dim s() As String=Regex.Split(",",Item.FldLink.Trim)
'		If s.Length>0 Then
'			Try
'				myCode.DownloadImage(s(0),ImageRow)
'			Catch
'				ImageRow.Bitmap=MCode.ImgNothing
'				Log(LastException)
'			End Try
'		Else
'			ImageRow.Bitmap=MCode.ImgNothing
'		End If
'	End If

'	Try
'		Log("Link= " & Item.FldLink)
'		ImageRow.Bitmap=Null
'		Dim Link() As String
'		If Item.FldLink ="" Then Item.FldLink = MCode.ImgNothingLink
'		Link = Regex.Split(",",Item.FldLink)
'		myCode.DownloadImage(Link(0),ImageRow)
'	Catch
'		ImageRow.Bitmap=MCode.ImgNothing
'		Log(LastException)
'	End Try

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

Sub LblGift_Click
'	Try
'		Dim Str(6) As String
'		Dim Message As String = ""
'		Dim Eshan1() As String
'		Dim NameEsh As String
''		Dim Cu As Cursor = MCode.Result("Select FldN_Kala From TblKala Where FldC_Kala = '"& Item.Esh_C_Kala &"'")
''		If Cu.RowCount>0 Then
''			Cu.Position=0
''			NameEsh = Cu.GetString("FldN_Kala")
''		Else
''			NameEsh = ""
''		End If
''	
''		Cu = MCode.Result("Select * From TblKala Where FldC_Kala = '"& Item.FldC_Kala &"'")
''		Cu.Position=0
''		If Cu.GetString("eshan") <> "0,0" Then
''			Eshan1=Regex.Split(",",Cu.GetString("eshan"))
''			Str(1) = "حالت اول: " & Eshan1(0) & " تا بخر ---------> " & Eshan1(1) & " تا " & NameEsh & " ببر"
''		End If
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

Sub LblTozihat_Click
'	If Item.FldTozihat <> "" Then
'		Msgbox(Item.FldTozihat,"توضیحات کالا")
'	End If
End Sub

Sub BtnUpJoz_Click
'	Dim A As Float = 0
'	Dim Val As Float = 0
'	Select Case MCode.isFloat
'		Case True
'			Val = 0.25
'		Case False
'			Val = 1
'	End Select
	
'	A = Item.FldTedadJoz
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
	AddToSabad
End Sub

Sub BtnUpKol_Click
'	Dim A As Int = 0
'	A = Item.FldTedadKol
'	If MCode.ForooshBishAzMojoodi = "1" Then
'		A = A + 1
'		Item.FldMande = Item.FldMande - Item.FldTedadKarton
'	Else if MCode.ForooshBishAzMojoodi = "0" Then
'		If Item.FldMande >= Item.FldTedadKarton  Then
'			A = A + 1
'			Item.FldMande = Item.FldMande - Item.FldTedadKarton
'		Else
'			ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
'		End If
'	End If
'	Item.FldTedadKol = A
	AddToSabad
End Sub

Sub BtnDownKol_Click
	Dim A As Int = 0
	A = Item.TedadDarSabadKol
	If A > 0 Then
		A = A - 1
		Item.SumMande = Item.SumMande + Item.TedadDarSabadKol
		Item.TedadDarSabadKol = A
	End If
	AddToSabad
End Sub

Sub AddToSabad

	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	Dim Check As Boolean
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		If Cu.GetString("FldC_Kala") = Item.CodeKala Then
			If Item.TedadDarSabadJoz = 0 And Item.TedadDarSabadKol = 0  Then
				MCode.SaveUpdate("Delete From TblSabad Where FldC_Kala = '"& Item.CodeKala &"'")
			Else
				MCode.SaveUpdate("Update TblSabad Set FldTedadJoz = '"& Item.TedadDarSabadJoz &"',FldTedadKol = '"& Item.TedadDarSabadKol & _
				"' Where FldC_kala = '"& Item.CodeKala &"'")
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

Sub ImageRow_Click
	Act_ImageSlideShow.Item = Item
	StartActivity(Act_ImageSlideShow)

End Sub

Sub LblTedadJoz_Click
	CallSubDelayed2(base,"LblTedadJoz_Click",Item)
End Sub

Sub LblTedadKol_Click
	CallSubDelayed2(base,"LblTedadKol_Click",Item)
End Sub

Sub Download (link As String)
	If link.IndexOf("http")>-1 Or link.IndexOf("HTTP")>-1 Or link.IndexOf("Http")>-1 Then
		Dim filename As String
		filename = GetFilename(link)
		If File.Exists(Starter.SharedFolder,filename) Then
			ImageRow.Bitmap=LoadBitmapSample(Starter.SharedFolder,filename,300dip,300dip)
		Else
			Dim j As HttpJob
			j.Initialize(link,Me)
			j.Download(link)
			Wait For (j) JobDone(Job As HttpJob)
			If Job.Success Then
				Dim bmp As Bitmap = Job.GetBitmap
				ImageRow.Bitmap=bmp
				filename = GetFilename(Job.JobName)
				WriteBitmap2File(bmp,90,filename)
			Else
				ImageRow.Bitmap=LoadBitmap(File.DirAssets,"ICON.png")
			End If
		End If
	Else
		ImageRow.Bitmap=LoadBitmap(File.DirAssets,"ICON.png")
	End If
End Sub

Sub GetFilename(fullpath As String) As String
	Dim res As String
	res = fullpath.SubString(fullpath.LastIndexOf("/") + 1)
	Return res
End Sub
Sub WriteBitmap2File(Image As Bitmap, Quality As Int,filename As String)
'	Try
'		Dim out As OutputStream = File.OpenOutput(Starter.SharedFolder, filename, False)
'		Dim data() As Byte = GetByteFromBitmap(Image, Quality)
'		out.WriteBytes(data, 0, data.Length)
'	Catch
'		Log(DateTime.Date(DateTime.Now)&"="&"WriteBitmap2File")
'	End Try
'	out.Close
End Sub

Sub GetByteFromBitmap(Img As Bitmap, Quality As Int) As Byte()
	Dim out As OutputStream
	Dim data() As Byte
	out.InitializeToBytesArray(1)
	Img.WriteToStream(out,Quality,"JPEG")
	data = out.ToBytesArray
	out.Close
	Return data
End Sub

Sub BtnUpEshan_Click
'	Dim A As Int = 0
'	Dim B As Int = 0
'	A = Item.FldEshantion
'	If MCode.ForooshBishAzMojoodi = "1" Then
'		A = A + 1
'		Item.FldMande = Item.FldMande - 1
'	Else if MCode.ForooshBishAzMojoodi = "0" Then
'		B = Item.FldMande - ((Item.FldTedadKol * Item.FldTedadKarton) + Item.FldTedadJoz + Item.FldEshantion)
'		If B > 0 Then
'			A = A + 1
'			Item.FldMande = Item.FldMande - 1
'		Else
'			ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
'		End If
'	End If
'	Item.FldEshantion = A
	AddToSabad
End Sub

Sub BtnDownEshan_Click
	Dim A As Int = 0
'	A = Item.FldEshantion
'	If A > 0 Then
'		A = A - 1
'		Item.FldMande = Item.FldMande + 1
'		Item.FldEshantion  = A
'	End If
	AddToSabad
End Sub

Sub pnl_bk_Click
'	Log("click")
'	Act_ShowKala2.Item=Item
'	StartActivity(Act_ShowKala2)
End Sub

