B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=12.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim Listkala As List
	Dim DateFactor As String
	Dim TypePrint As Int
	Dim Printer1 As EscPosPrinter
End Sub

Sub Globals
	Private ion As Object
	Private LblPrint As Label
	Private ImageView1 As ImageView
	Private clv1 As CustomListView
	Private LblSettingBTPrinter As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_PrintPic2")
	'Listkala.Initialize
	Printer1.Initialize(Me, "Printer1")
End Sub

Sub Activity_Resume
	clv1.Clear
	Select TypePrint
		Case 0
			CreateReport
		Case 1
			CreateReport2
	End Select
'	Printer1.DisConnect
'	If Printer1.IsBluetoothOn = False Then
'		Msgbox("لطفا بلوتوث گوشی خود را فعال نمائید و دستگاه پرینتر خود را انتخاب کنید.", "")
'	Else If Printer1.IsConnected = False Then
'		Printer1.Connect
'	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub LblShare_Click
	Dim filename As String=MCode.FaktorSelect & ".jpg"

	Dim bmp As B4XBitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
	Dim out As OutputStream
	out = File.OpenOutput(File.DirInternalCache, filename , False)
	bmp.WriteToStream(out, 100, "JPEG")
	out.Close
	Sleep(200)
	File.Copy(File.DirInternalCache, filename,File.DirDefaultExternal,filename)
	Sleep(200)
	Try
		Dim pn As PNMultipleSharing
		pn.ShareFileWithCaption(File.DirDefaultExternal,filename,"image/*","فاکتور ","اشتراک گذاری")
	Catch
		Log(LastException)
		ToastMessageShow("برنامه ای جهت اشتراک گذاری یافت نشد",True)
	End Try

End Sub
Sub Crop_Image(V As B4XView, left As Int, top As Int, width As Int, height As Int) As Bitmap
    
	Return V.Snapshot.Crop(left, top, width, height)
    
End Sub
Private Sub LblSettingBTPrinter_Click
	Printer1.Connect
End Sub

Private Sub LblPrint_Click

	Select MCode.PrinterType
		Case 0
			'blutooth
			If Printer1.IsBluetoothOn = False Then
				Msgbox("لطفا بلوتوث گوشی خود را فعال نمائید و دستگاه پرینتر خود را انتخاب کنید.", "")
			Else If Printer1.IsConnected = False Then
				Printer1.Connect
			Else
				PrintBluetooth
			End If
			
		Case 1
			'pos
			PrintPos
	End Select
	
End Sub






Sub PrintBluetooth()
	Printer1.Reset
	Dim filename As String=MCode.FaktorSelect & ".jpg"

	Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
	Dim out As OutputStream
	out = File.OpenOutput(File.DirInternalCache, filename , False)
	bmp1.WriteToStream(out, 100, "JPEG")
	out.Close
	Sleep(200)
	File.Copy(File.DirInternalCache, filename,File.DirDefaultExternal,filename)
	Sleep(200)
	' We can choose high and low density printing in both vertical and horizontal  axes
	Dim highdensity As Boolean = True
	Dim dots24 As Boolean = True
	
	' set various parameters according to the options above
	Dim LowXdpi As Int = 90
	Dim HighXdpi As Int = 180

	Dim dots8Ydpi As Int = 60
	Dim dots24Ydpi As Int = 180
	
	' defaults for low density and 8 bit slices
	Dim maxwidth As Int  = 288
	Dim Xdpi As Int = LowXdpi
	Dim Ydpi As Int = dots8Ydpi
	Dim sliceheight As Int = 8
	
	If highdensity Then
		maxwidth = 288*2
		Xdpi = HighXdpi
	End If
	
	If dots24 Then
		Ydpi = dots24Ydpi
		sliceheight = 24
	End If
		
	Dim bmp As Bitmap
	' Load an image to print and resize it to the maximum mage dimensions for the printer
	bmp.InitializeResize(File.DirDefaultExternal,filename, maxwidth, 3000, True) 'ignore
	'bmp.InitializeResize(File.DirAssets, "Avro_Lancaster.jpg", maxwidth, 512, True) 'ignore
	' Need to predistort the bitmap as the printed pixels are not square
	bmp = bmp.Resize(bmp.Width, bmp.Height * Ydpi / Xdpi, False)
	
	' Convert the RGB image to one with luminance values
	Dim myimage As AnImage = Printer1.ImageToBWIMage(bmp)
	
	' Choose thresholding the image or dithering it to get a black and white bit image
	'myimage = Printer1.ThresholdImage(myimage, 128)
	'myimage = Printer1.DitherImage1D(myimage, 128)
	myimage = Printer1.DitherImage2D(myimage, 128)
	
	' calculate number of slices in the image
	' For this demo we just truncate the image if there is not a complete final slice
	Dim lastslice As Int = myimage.Height / sliceheight - 1
	Dim excess As Int = myimage.Height * sliceheight - lastslice
	If excess > 0 Then lastslice = lastslice - 1
	
	Printer1.LineSpacing = 0
	Printer1.WriteString(CRLF) ' to show the user something is happening
	For i = 0 To lastslice
		Dim slice() As Byte = Printer1.PackImageSlice(myimage, i, dots24)
		Printer1.PrintImage2(myimage.Width, slice, highdensity, dots24)
		Sleep(350)
	Next
	Printer1.WriteString(CRLF  & CRLF & "Ended" & CRLF & CRLF)
	
End Sub

Sub PrintPos()
	' دکمه‌ی فراخوانی متد سرویس جاوا
	
	Dim filename As String=MCode.FaktorSelect & ".jpg"

	Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
	Dim out As OutputStream
	out = File.OpenOutput(File.DirInternalCache, filename , False)
	bmp1.WriteToStream(out, 100, "JPEG")
	out.Close
	Sleep(200)
	File.Copy(File.DirInternalCache, filename,File.DirDefaultExternal,filename)
	Sleep(200)
	Dim pathimage As String=File.Combine(File.DirDefaultExternal,filename)
	Dim intent As Intent
	intent.Initialize("Print", "")
	intent.SetComponent(MCode.PackageNamePosParsian &"/.MyJavaService") ' نام پکیج و کلاس سرویس جاوا
	' نام پکیج و کلاس سرویس جاوا
	intent.PutExtra("imagepath", pathimage) ' ارسال داده به سرویس جاوا
	intent.PutExtra("CompanyName", "Parsik") ' ارسال داده به سرویس جاوا
	StartService(intent)

End Sub

Sub Printer1_Connected (Success As Boolean)
	If Success Then
		ToastMessageShow("اتصال پرینتر برقرار شد", False)
		LblSettingBTPrinter.Enabled=True
	Else
		Msgbox(Printer1.ConnectedErrorMsg, "خطا در اتصال پرینتر.")
	End If
End Sub

Private Sub Printer1_NewData (Buffer() As Byte)
End Sub

Private Sub Printer1_Error
	'ToastMessageShow(LastException.Message, True)
	
End Sub

Private Sub Printer_Terminated
	ToastMessageShow("Connection is terminated.", True)
	
End Sub


'Sub LblPrint_Click
'	Dim filename As String=MCode.FaktorSelect & ".jpg"
'	
'	Dim bmp As Bitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
'	
'	Dim B As B4XBitmap = bmp.Resize(bmp.Width/2,bmp.Height/2,True)
'	Dim out As OutputStream
'	out = File.OpenOutput(File.DirDefaultExternal, filename , False)
'	B.WriteToStream(out, 90, "JPEG")
'	out.Close
'	
'	If File.Exists(File.DirDefaultExternal,"print_sepehr")=False Then
'		File.MakeDir(File.DirDefaultExternal,"print_sepehr")
'	End If
'	Dim filename As String=MCode.FaktorSelect & ".jpg"
'	File.Copy(File.DirDefaultExternal,filename,File.DirDefaultExternal,"print_sepehr/factor.jpg")
'	Dim i As Intent
'	i.Initialize("com.dml.sima7.sepehr.activity.Intent_PrintFactorActivity", "")
'	StartActivityForResult(i)
'
'End Sub


Sub StartActivityForResult(i As Intent)
	Dim jo As JavaObject = GetBA
	ion = jo.CreateEvent("anywheresoftware.b4a.IOnActivityResult", "ion", Null)
	jo.RunMethod("startActivityForResult", Array As Object(ion, i))
End Sub

Sub GetBA As Object
	Dim jo As JavaObject
	Dim cls As String = Me
	cls = cls.SubString("class ".Length)
	jo.InitializeStatic(cls)
	Return jo.GetField("processBA")
End Sub
Sub CreateReport
'	Wait For (MCode.CreateReportFaktor(Faktor)) complete (res As FinalFaktor_)
'	MCode.FinalFaktor=res

	''''''''''''''rec1'''''''''''''''''
	Dim rec1 As cls_Faktor1_Havale_Type1
	Dim Date As String= MCode.Sf.Mid(MCode.DatePersian,1,4) & "/" & MCode.Sf.Mid(MCode.DatePersian,5,2) & "/" & MCode.Sf.Mid(MCode.DatePersian,7,2)
	Dim DateFactor As String= DateFactor
	Dim Time As String=DateTime.Time(DateTime.Now)
	rec1.Initialize(MCode.C_Tafzili,MCode.N_Tafzili,MCode.C_Visitor,MCode.N_Visitor,MCode.AppName,MCode.ShomareFaktor,DateFactor,Date,Time,MCode.Tell_Tafzili,MCode.Address_Tafzili,MCode.CompanyName,MCode.CompanyTell,MCode.CompanyAddress)
	clv1.Add(rec1.Panel,0)
'	clv1.ResizeItem(0,rec1.Height-100)
	'''''''''''''rec2'''''''''''''''''
'	Dim Query As String
'	Query = "SELECT  TblFaktor.FldRadif,TblFaktor.FldNamekala,Cast(Round(TblFaktor.FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh ,TblFaktor.FldTedadDarSabadJoz,TblKala.FldNamevahed,TblFaktor.FldTedadDarSabadKol,TblKala.FldNameVahed2,TblFaktor.FldCodeKala,TblFaktor.FldMablaghMasrafKonande,TblFaktor.FldTozihat FROM TblFaktor,TblKala WHERE TblFaktor.FldCodeKala = TblKala.FldCodeKala And FldShomareFaktor = '"& MCode.ShomareFaktor &"'"
'	Dim Cu As Cursor =MCode.Result(Query)
	Dim Radif As String
	Dim CodeKala As String
	Dim NameKala As String
	Dim Fee As String
	Dim DarsadTakhfif As String
	Dim FeeTakhfif As String
	Dim TedadJoze As String
	Dim TedadKol As String
	Dim FeeYekKarton As String
	Dim SharhFactor As String
	
	Dim count As Int=0
	
	Dim MablaghKhales As Long=0
	Dim MablaghTakhfif As Long=0
	Dim MandeTalab As Long=0
	Dim MandeTasfieNashode As Long=0
	Dim MablagheKolDaryafti As Long=0
	Dim MablaghTakhfifDaryafti As Long=0
	Dim TotalFaktor As Long=0
	Dim Signature As String
	Dim GHabelePardakht As Long=0

	

	
	For i=0 To Listkala.Size-1
		Dim item As AdapteRizFactorHavale=Listkala.Get(i)
		Radif=i+1
		CodeKala=item.fldCodeKala
		NameKala=item.fldSharhKala
		Fee=item.fldFeeJoz
		TedadJoze=item.fldTedadJoz
		TedadKol=item.fldTedadCarton
		'Cast(FldMablaghTakhfif As Int) = 0 And  Cast(fldFeeBadAzTakhfif As Int) > 0
		If  item.fldMablaghTakhfif>0 Then
			FeeTakhfif=item.fldMablaghTakhfif
			'sumTakhfifKala=sumTakhfifKala+TakhfifKala
		Else
			FeeTakhfif=0
		End If
		If item.fldDarsadTakhfif=0 And item.fldDarsadTakhfif>0 Then
			DarsadTakhfif=item.fldDarsadTakhfif
			'sumTakhfifKala=sumTakhfifKala+TakhfifKala
		Else
			DarsadTakhfif=0
		End If

		FeeYekKarton=item.fldFeeYekCarton
		Signature=item.fldSignature
	
		Dim rec2 As cls_Faktor2_Havale_Type1
		rec2.Initialize(Radif,CodeKala,NameKala,myCode.AdadToPrice(Fee),myCode.AdadToPrice(FeeYekKarton),myCode.AdadToPrice(FeeTakhfif),DarsadTakhfif,TedadJoze,TedadKol)
		SharhFactor=item.fldSharhFactor
		clv1.Add(rec2.Panel,i)
		'clv1.ResizeItem(1,200)
		
		MablaghKhales=MablaghKhales+item.fldMablaghKhales
		MablaghTakhfif=MablaghTakhfif+item.fldMablaghTakhfif
		MandeTalab=item.fldMandeTalab
		MandeTasfieNashode=item.fldMandeTasfieNashode
		MablagheKolDaryafti=item.fldMablagheKolDaryafti
	Next
	'''''''''''''rec3'''''''''''''''''
	TotalFaktor=MablaghKhales+MablaghTakhfif
	Dim StrMablaghKhales As String=0
	Dim StrMablaghTakhfif As String=0
	Dim StrMandeTalab As String=0
	Dim StrMandeTasfieNashode As String=0
	Dim StrMablagheKolDaryafti As String=0
	Dim StrMablaghTakhfifDaryafti As String=0
	Dim StrTotalFaktor As String=0
	Dim StrGHabelePardakht As String=0
	Dim dr As Cursor=MCode.Result("select * from TblDaryaft where fldShomareFactor="& MCode.ShomareFaktor)
	If dr.RowCount>0 Then
		MablagheKolDaryafti=MCode.SingleResult("select sum(fldMablaghDaryafti) as fldMablaghDaryafti from TblDaryaft where fldType<>3 and fldShomareFactor="& MCode.ShomareFaktor)
		MablaghTakhfifDaryafti=MCode.SingleResult("select sum(FldMablaghTakhfif) as fldMablaghTakhfifDaryafti from TblDaryaft where fldType=3 and fldShomareFactor="& MCode.ShomareFaktor)
	
		'MandeTalab=MablaghKhales-MablagheKolDaryafti-myCode.Is_Null_adad(MablaghTakhfifDaryafti)
		MandeTasfieNashode=MablaghKhales-MablagheKolDaryafti
		StrMablaghTakhfifDaryafti=NumberFormat(myCode.Is_Null_adad(MablaghTakhfifDaryafti),1,3) & " " & MCode.VahedPool
		StrGHabelePardakht = NumberFormat(myCode.Is_Null_adad(MandeTalab),1,3) & " " & MCode.VahedPool
	Else
		StrGHabelePardakht = NumberFormat(myCode.Is_Null_adad(MablaghKhales),1,3) & " " & MCode.VahedPool
	End If
	
	StrMablaghKhales = myCode.AdadToPrice(MablaghKhales)
	StrTotalFaktor = myCode.AdadToPrice(TotalFaktor)
	
	StrMablaghTakhfif = myCode.AdadToPrice(MablaghTakhfif)
	StrMandeTalab = myCode.AdadToPrice(MandeTalab)
	StrMandeTasfieNashode = myCode.AdadToPrice(MandeTasfieNashode)
	StrMablagheKolDaryafti = myCode.AdadToPrice(MablagheKolDaryafti)

	
	Dim rec3 As cls_Faktor3_Havale_Type1
	rec3.Initialize(StrGHabelePardakht,StrMablaghKhales,StrMablaghTakhfifDaryafti,StrMandeTasfieNashode,StrMablaghTakhfif,StrMablagheKolDaryafti,StrTotalFaktor,SharhFactor,Signature)
	
	clv1.Add(rec3.Panel,count+1)
	'clv1.ResizeItem(2,100)
End Sub

Sub CreateReport2
'	Wait For (MCode.CreateReportFaktor(Faktor)) complete (res As FinalFaktor_)
'	MCode.FinalFaktor=res

	''''''''''''''rec1'''''''''''''''''
	Dim rec1 As cls_Faktor1_Havale_Type2
	Dim Date As String= MCode.Sf.Mid(MCode.DatePersian,1,4) & "/" & MCode.Sf.Mid(MCode.DatePersian,5,2) & "/" & MCode.Sf.Mid(MCode.DatePersian,7,2)
	Dim DateFactor As String= DateFactor
	Dim Time As String=DateTime.Time(DateTime.Now)
	rec1.Initialize(MCode.C_Tafzili,MCode.N_Tafzili,MCode.C_Visitor,MCode.N_Visitor,MCode.AppName,MCode.ShomareFaktor,DateFactor,Date,Time,MCode.Tell_Tafzili,MCode.Address_Tafzili,MCode.CompanyName,MCode.CompanyTell,MCode.CompanyAddress)
	clv1.Add(rec1.Panel,0)
'	clv1.ResizeItem(0,rec1.Height-100)
	'''''''''''''rec2'''''''''''''''''
'	Dim Query As String
'	Query = "SELECT  TblFaktor.FldRadif,TblFaktor.FldNamekala,Cast(Round(TblFaktor.FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh ,TblFaktor.FldTedadDarSabadJoz,TblKala.FldNamevahed,TblFaktor.FldTedadDarSabadKol,TblKala.FldNameVahed2,TblFaktor.FldCodeKala,TblFaktor.FldMablaghMasrafKonande,TblFaktor.FldTozihat FROM TblFaktor,TblKala WHERE TblFaktor.FldCodeKala = TblKala.FldCodeKala And FldShomareFaktor = '"& MCode.ShomareFaktor &"'"
'	Dim Cu As Cursor =MCode.Result(Query)
	Dim Radif As String
	Dim CodeKala As String
	Dim NameKala As String
	Dim Fee As String
	Dim DarsadTakhfif As String
	Dim FeeTakhfif As String
	Dim TedadJoze As String
	Dim TedadKol As String
	Dim FeeYekKarton As String
	Dim SharhFactor As String
	
	Dim count As Int=0
	
	Dim MablaghKhales As Long=0
	Dim MablaghTakhfif As Long=0
	Dim MandeTalab As Long=0
	Dim MandeTasfieNashode As Long=0
	Dim MablagheKolDaryafti As Long=0
	Dim MablaghTakhfifDaryafti As Long=0
	Dim TotalFaktor As Long=0
	Dim Signature As String
	Dim GHabelePardakht As Long=0

	

	
	For i=0 To Listkala.Size-1
		Dim item As AdapteRizFactorHavale=Listkala.Get(i)
		Radif=i+1
		CodeKala=item.fldCodeKala
		NameKala=item.fldSharhKala
		Fee=item.fldFeeJoz
		TedadJoze=item.fldTedadJoz
		TedadKol=item.fldTedadCarton
		'Cast(FldMablaghTakhfif As Int) = 0 And  Cast(fldFeeBadAzTakhfif As Int) > 0
		If  item.fldMablaghTakhfif>0 Then
			FeeTakhfif=item.fldMablaghTakhfif
			'sumTakhfifKala=sumTakhfifKala+TakhfifKala
		Else
			FeeTakhfif=0
		End If
		If item.fldDarsadTakhfif=0 And item.fldDarsadTakhfif>0 Then
			DarsadTakhfif=item.fldDarsadTakhfif
			'sumTakhfifKala=sumTakhfifKala+TakhfifKala
		Else
			DarsadTakhfif=0
		End If

		FeeYekKarton=item.fldFeeYekCarton
		Signature=item.fldSignature
	
		Dim rec2 As cls_Faktor2_Havale_Type2
		rec2.Initialize(Radif,CodeKala,NameKala,myCode.AdadToPrice(Fee),myCode.AdadToPrice(FeeYekKarton),myCode.AdadToPrice(FeeTakhfif),DarsadTakhfif,TedadJoze,TedadKol)
		SharhFactor=item.fldSharhFactor
		clv1.Add(rec2.Panel,i)
		'clv1.ResizeItem(1,200)
		
		MablaghKhales=MablaghKhales+item.fldMablaghKhales
		MablaghTakhfif=MablaghTakhfif+item.fldMablaghTakhfif
		MandeTalab=item.fldMandeTalab
		MandeTasfieNashode=item.fldMandeTasfieNashode
		MablagheKolDaryafti=item.fldMablagheKolDaryafti
	Next
	'''''''''''''rec3'''''''''''''''''
	TotalFaktor=MablaghKhales+MablaghTakhfif
	Dim StrMablaghKhales As String=0
	Dim StrMablaghTakhfif As String=0
	Dim StrMandeTalab As String=0
	Dim StrMandeTasfieNashode As String=0
	Dim StrMablagheKolDaryafti As String=0
	Dim StrMablaghTakhfifDaryafti As String=0
	Dim StrTotalFaktor As String=0
	Dim StrGHabelePardakht As String=0
	Dim dr As Cursor=MCode.Result("select * from TblDaryaft where fldShomareFactor="& MCode.ShomareFaktor)
	If dr.RowCount>0 Then
		MablagheKolDaryafti=MCode.SingleResult("select sum(fldMablaghDaryafti) as fldMablaghDaryafti from TblDaryaft where fldType<>3 and fldShomareFactor="& MCode.ShomareFaktor)
		MablaghTakhfifDaryafti=MCode.SingleResult("select sum(FldMablaghTakhfif) as fldMablaghTakhfifDaryafti from TblDaryaft where fldType=3 and fldShomareFactor="& MCode.ShomareFaktor)
	
		'MandeTalab=MablaghKhales-MablagheKolDaryafti-myCode.Is_Null_adad(MablaghTakhfifDaryafti)
		MandeTasfieNashode=MablaghKhales-MablagheKolDaryafti
		StrMablaghTakhfifDaryafti=NumberFormat(myCode.Is_Null_adad(MablaghTakhfifDaryafti),1,3) & " " & MCode.VahedPool
		StrGHabelePardakht = NumberFormat(myCode.Is_Null_adad(MandeTalab),1,3) & " " & MCode.VahedPool
	Else
		StrGHabelePardakht = NumberFormat(myCode.Is_Null_adad(MablaghKhales),1,3) & " " & MCode.VahedPool
	End If
	
	StrMablaghKhales = myCode.AdadToPrice(MablaghKhales)
	StrTotalFaktor = myCode.AdadToPrice(TotalFaktor)
	
	StrMablaghTakhfif = myCode.AdadToPrice(MablaghTakhfif)
	StrMandeTalab = myCode.AdadToPrice(MandeTalab)
	StrMandeTasfieNashode = myCode.AdadToPrice(MandeTasfieNashode)
	StrMablagheKolDaryafti = myCode.AdadToPrice(MablagheKolDaryafti)

	
	Dim rec3 As cls_Faktor3_Havale_Type2
	rec3.Initialize(StrGHabelePardakht,StrMablaghKhales,StrMablaghTakhfifDaryafti,StrMandeTasfieNashode,StrMablaghTakhfif,StrMablagheKolDaryafti,StrTotalFaktor,SharhFactor,Signature)
	
	clv1.Add(rec3.Panel,count+1)
	'clv1.ResizeItem(2,100)
End Sub


Sub btn_Back_Click
	Activity.Finish
End Sub
	

'این کد باید حتما در برنامه تون برای جلوگیری از بروز مشکل در اندروید های 8 به بالا قرار بگیره
#if java
import android.os.StrictMode;
public void _onCreate() { //@cafetoseeh
if (android.os.Build.VERSION.SDK_INT >= 18) {
StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
StrictMode.setVmPolicy(builder.build());
//cafetoseeh.ir
builder.detectFileUriExposure();
}}



///////////

#End If


