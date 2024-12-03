B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim Faktor As AdapterListFaktor
'	Dim AdtlistKala As AdapterListKala
	Dim listKala As List
	Dim TypePrint As Int
	Dim Printer1 As EscPosPrinter
	
	
End Sub

Sub Globals
	Private ion As Object
	Private LblPrint As Label
	Private ImageView1 As ImageView
	Private clv1 As CustomListView
	'Private sv1 As ScrollView
	Dim ImageSignature As String
	Dim SignatureUpdate As String
	Private LblSettingBTPrinter As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_PrintPic")

	Printer1.Initialize(Me, "Printer1")


End Sub



Sub CreateSign
	If File.Exists(File.DirDefaultExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png") Then
		SignatureUpdate="OK"
		Dim DateS As String =MCode.DatePersian
		Dim Time As String =DateTime.Time(DateTime.Now)
		ImageSignature =MCode.Encrypted(MCode.ConvertBlobToString(File.DirDefaultExternal & "/Parsik/Signature", MCode.C_Tafzili & ".png"))
		Dim query As String="Update TblFaktor Set FldSignatureBitmapString='"&ImageSignature&"' where FldShomareFaktor="&Faktor.fldShomareFaktor
		MCode.SaveUpdate(query)
'CallSubDelayed2(Service_Server,"SendUpdateQuery",query)
		File.Delete(File.DirDefaultExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png")
	End If
End Sub

Sub Activity_Resume
clv1.Clear
	CreateSign
	Select TypePrint
		Case 0
			CreateReport
		Case 1
			CreateReport1
	End Select
	
	Select MCode.PrinterType
		Case 0
		'blutooth
'		LblSettingBTPrinter.Visible=True
		Case 1
		'pos
'			LblSettingBTPrinter.Visible=False
'			StartReceiver(MyReceiver)
	End Select
	
'	Printer1.DisConnect
'	If Printer1.IsBluetoothOn = False Then
'		Msgbox("لطفا بلوتوث گوشی خود را فعال نمائید و دستگاه پرینتر خود را انتخاب کنید.", "")
'	Else If Printer1.IsConnected = False Then
'		Printer1.Connect
'	End If
'	Dim in As Intent
'	in = Activity.GetStartingIntent
'	If in <> Null Then
'		If in.HasExtra("result_key") Then
'			Dim data As String
'			data = in.GetExtra("result_key") ' دریافت داده از اینتنت
'			Log("Received data in service: " & data)
'			Return
'		End If
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
	
	'ConvertBitmapToPdf(MCode.FaktorSelect)
	
	Try
		Dim pn As PNMultipleSharing
		pn.ShareFileWithCaption(File.DirDefaultExternal,filename,"image/*","فاکتور ","اشتراک گذاری")
	Catch
		Log(LastException)
		ToastMessageShow("برنامه ای جهت اشتراک گذاری یافت نشد",True)
	End Try

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
	intent.SetComponent(MCode.PackageNamePosParsian & "/.MyJavaService") ' نام پکیج و کلاس سرویس جاوا
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




Sub Crop_Image(V As B4XView, left As Int, top As Int, width As Int, height As Int) As Bitmap
    
	Return V.Snapshot.Crop(left, top, width, height)
    
End Sub
Sub LblSign_Click
	
	StartActivity(Act_Emza)

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
	Dim rec1 As cls_Faktor1_Type1
	Dim Date As String= MCode.Sf.Mid(MCode.DatePersian,1,4) & "/" & MCode.Sf.Mid(MCode.DatePersian,5,2) & "/" & MCode.Sf.Mid(MCode.DatePersian,7,2)
	Dim DateFactor As String= MCode.Sf.Mid(Faktor.fldDate,1,4) & "/" & MCode.Sf.Mid(Faktor.fldDate,5,2) & "/" & MCode.Sf.Mid(Faktor.fldDate,7,2)
	Dim Time As String=DateTime.Time(DateTime.Now)
	rec1.Initialize(MCode.C_Tafzili,Faktor.C_Name,MCode.C_Visitor,MCode.N_Visitor,MCode.AppName,MCode.FaktorSelect,DateFactor,Date,Time,MCode.Tell_Tafzili,MCode.Address_Tafzili,MCode.CompanyName,MCode.CompanyTell,MCode.CompanyAddress)
	clv1.Add(rec1.Panel,0)
'	clv1.ResizeItem(0,rec1.Height-100)
	'''''''''''''rec2'''''''''''''''''
	Dim Query As String
	Query = "SELECT  TblFaktor.FldRadif,TblFaktor.FldNamekala,Cast(Round(TblFaktor.FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh ,TblFaktor.FldTedadDarSabadJoz,TblKala.FldNamevahed,TblFaktor.FldTedadDarSabadKol,TblKala.FldNameVahed2,TblFaktor.FldCodeKala,TblFaktor.FldMablaghMasrafKonande,TblFaktor.FldTozihat FROM TblFaktor,TblKala WHERE TblFaktor.FldCodeKala = TblKala.FldCodeKala And FldShomareFaktor = '"& MCode.ShomareFaktor &"'"
	Dim Cu As Cursor =MCode.Result(Query)
	Dim Radif As String
	Dim CodeKala As String
	Dim NameKala As String
	Dim Fee As Int
	Dim TakhfifKala As Int
	Dim TakhfifVizhe As Int
	Dim TedadJoze As String
	Dim TedadKol As String
	Dim TedadDarKarton As Int
	Dim Sum As String
	Dim SumKol As String=0
	Dim SumMablaghKhales As String=0
	Dim count As Int=0
	Dim sumFactor,sumPardakht,sumKhales,SumKolTakhfif As String=0
	Dim Tozihat,VaziatPardakht,SignatureBitmapString As String
	Dim sumTakhfifKala As String=0
	Dim sumTakhfifVizhe As String=0
	Dim sumMandeAzGhabl As String=0
'	Dim Cu2 As Cursor= Result("SELECT Sum((FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as TakhfifKala FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) = 0 and  Cast(fldFeeBadAzTakhfif AS Int) > 0 ")
'	Cu2.Position = 0
'	If Cu2.GetString("TakhfifKala") <> Null Then
'		Takhfif = Cu2.GetString("TakhfifKala")
'	Else
'		Takhfif = 0
'	End If
'	Tfaktor.TakhfifKala = Takhfif
'	Log("تخفیف کالا : " & Takhfif)
'	
'	Dim TakhfifVizhe As String
'	Dim Cu3 As Cursor= Result("SELECT Sum((FldMablaghTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as SumTakhfifVizhe FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) > 0 ")
'	Cu3.Position = 0
'	If Cu3.GetString("SumTakhfifVizhe") <> Null Then
'		TakhfifVizhe = Cu3.GetString("SumTakhfifVizhe")
'	Else
'		TakhfifVizhe = 0
'	End If
'	Tfaktor.TakhfifVizhe = TakhfifVizhe
'	Log("تخفیف ویژه : " & TakhfifVizhe)
	
	For i=0 To listKala.Size-1
		Dim item As AdapterListKala=listKala.Get(i)
		Radif=i+1
		CodeKala=item.CodeKala
		NameKala=item.NameKala
		Fee=item.FeeForoosh
		'Cast(FldMablaghTakhfif As Int) = 0 And  Cast(fldFeeBadAzTakhfif As Int) > 0
'		If item.MablaghTakhfif=0 And item.fldFeeBadAzTakhfif>0 Then
'			TakhfifKala=(item.FeeForoosh-item.fldFeeBadAzTakhfif)*((item.TedadDarSabadKol*item.TedadDarKarton)+item.TedadDarSabadJoz)
'			sumTakhfifKala=sumTakhfifKala+TakhfifKala
'			Else
'			TakhfifKala=0
'		End If
'		'TakhfifKala=(FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)
'		'Cast(FldMablaghTakhfif AS Int) > 0
'		If item.MablaghTakhfif>0 Then
'			TakhfifVizhe=(item.MablaghTakhfif)
'			sumTakhfifVizhe=sumTakhfifVizhe+TakhfifVizhe
'			Else
'			TakhfifVizhe=0
'		End If
		TakhfifKala=myCode.Is_Null_adad(item.TakhfifKala)
		sumTakhfifKala=sumTakhfifKala+TakhfifKala
		TakhfifVizhe=myCode.Is_Null_adad(item.MablaghTakhfif)
		sumTakhfifVizhe=sumTakhfifVizhe+TakhfifVizhe
		Tozihat=item.Tozihat
		TedadJoze=item.TedadDarSabadJoz
		TedadKol=item.TedadDarSabadKol
		TedadDarKarton=item.TedadDarKarton
		Sum=((TedadKol*TedadDarKarton)+TedadJoze)*Fee
		SumKol=SumKol+Sum
		SumMablaghKhales=SumMablaghKhales+Sum-(TakhfifKala+TakhfifVizhe)
	
	 
	
		Dim rec2 As cls_Faktor2_Type1
'		rec2.Initialize(Radif,CodeKala,NameKala,NumberFormat2(Fee,0,0,0,True)&" "&MCode.VahedPool,NumberFormat2(TakhfifKala,0,0,0,True)&" "&MCode.VahedPool,NumberFormat2(TakhfifVizhe,0,0,0,True)&" "&MCode.VahedPool,NumberFormat2(Sum,0,0,0,True)&" "&MCode.VahedPool,NumberFormat2(SumMablaghKhales,0,0,0,True)&" "&MCode.VahedPool,TedadJoze,TedadKol,TedadDarKarton,Tozihat)
		rec2.Initialize(Radif,item.CodeKala,item.NameKala,myCode.AdadToPrice(item.FeeForoosh),myCode.AdadToPrice(TakhfifKala),myCode.AdadToPrice(TakhfifVizhe),NumberFormat2(Sum,0,0,0,True)&" "&MCode.VahedPool,NumberFormat2(SumMablaghKhales,0,0,0,True)&" "&MCode.VahedPool,TedadJoze,TedadKol,TedadDarKarton,Tozihat)
		count=i+1

		clv1.Add(rec2.Panel,i)
		'clv1.ResizeItem(1,200)
	Next
	'''''''''''''rec3'''''''''''''''''

	Dim DarsadArzeshAfzode As String
	Dim ArzeshAfzode As String
	
'	Dim Cu2 As Cursor=MCode.Result("SELECT Sum((FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as TakhfifKala FROM TblFaktor Where Cast(FldMablaghTakhfif AS Int) = 0 and  Cast(fldFeeBadAzTakhfif AS Int) > 0 And FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
'	Cu2.Position = 0
'	If Cu2.GetString("TakhfifKala") <> Null Then
'		sumTakhfif = Cu2.GetString("TakhfifKala")
'	Else
'		sumTakhfif = 0
'	End If
	
	Log("تخفیف کالا : " & sumTakhfifKala)
	
	
'	Dim Cu3 As Cursor= MCode.Result("SELECT Sum((FldMablaghTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as SumTakhfifVizhe FROM TblFaktor Where Cast(FldMablaghTakhfif AS Int) > 0 And FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
'	Cu3.Position = 0
'	If Cu3.GetString("SumTakhfifVizhe") <> Null Then
'		sumTakhfifVizhe = Cu3.GetString("SumTakhfifVizhe")
'	Else
'		sumTakhfifVizhe = 0
'	End If
	
	Log("تخفیف ویژه : " & sumTakhfifVizhe)
	
	SumKolTakhfif=sumTakhfifKala+sumTakhfifVizhe
	'Dim imgSign As ImageView
	'imgSign.Initialize("")
	sumFactor=NumberFormat2(Faktor.fldMablaghKol,0,0,0,True)&" "&MCode.VahedPool
	sumPardakht=NumberFormat2(Faktor.fldTotalFaktor,0,0,0,True)&" "&MCode.VahedPool
	SumMablaghKhales=NumberFormat2(Faktor.fldTotalFaktor,0,0,0,True)&" "&MCode.VahedPool
	sumTakhfifKala=NumberFormat2(sumTakhfifKala,0,0,0,True)&" "&MCode.VahedPool
	sumTakhfifVizhe=NumberFormat2(sumTakhfifVizhe,0,0,0,True)&" "&MCode.VahedPool
	SumKolTakhfif=NumberFormat2(SumKolTakhfif,0,0,0,True)&" "&MCode.VahedPool
	SumKol=NumberFormat2(SumKol,0,0,0,True)&" "&MCode.VahedPool
	Tozihat=MCode.Tozihat_faktor
	VaziatPardakht=MCode.NoeTasvieFaktor
	DarsadArzeshAfzode =$"% ${Faktor.fldDarsadArzeshAfzode}"$
	ArzeshAfzode=myCode.AdadToPrice(Faktor.fldArzeshAfzode)
	sumMandeAzGhabl=IIf(Faktor.fldSumMandeAzGhabl=0,0,myCode.AdadToPrice(Faktor.fldSumMandeAzGhabl))
	If SignatureUpdate="OK" Then
		SignatureBitmapString=ImageSignature
	Else
		SignatureBitmapString=Faktor.Signature
End If
	
	Dim rec3 As cls_Faktor3_Type1
	rec3.Initialize(SumKol,sumPardakht,VaziatPardakht,SumMablaghKhales,sumTakhfifKala,sumTakhfifVizhe,SumKolTakhfif,Tozihat,SignatureBitmapString,DarsadArzeshAfzode,ArzeshAfzode,sumMandeAzGhabl)
	
	clv1.Add(rec3.Panel,count+1)
	'clv1.ResizeItem(2,100)
End Sub

Sub CreateReport1
'	Wait For (MCode.CreateReportFaktor(Faktor)) complete (res As FinalFaktor_)
'	MCode.FinalFaktor=res
	''''''''''''''rec1'''''''''''''''''
	Dim rec1 As cls_Factor1_Type2
	Dim Date As String= MCode.Sf.Mid(MCode.DatePersian,1,4) & "/" & MCode.Sf.Mid(MCode.DatePersian,5,2) & "/" & MCode.Sf.Mid(MCode.DatePersian,7,2)
	Dim DateFactor As String= MCode.Sf.Mid(Faktor.fldDate,1,4) & "/" & MCode.Sf.Mid(Faktor.fldDate,5,2) & "/" & MCode.Sf.Mid(Faktor.fldDate,7,2)
	Dim Time As String=DateTime.Time(DateTime.Now)
	rec1.Initialize(MCode.C_Tafzili,Faktor.C_Name,MCode.C_Visitor,MCode.N_Visitor,MCode.AppName,MCode.FaktorSelect,DateFactor,Date,Time,MCode.Tell_Tafzili,MCode.Address_Tafzili,MCode.CompanyName,MCode.CompanyTell,MCode.CompanyAddress)
	clv1.Add(rec1.Panel,0)
'	clv1.ResizeItem(0,rec1.Height-100)
	'''''''''''''rec2'''''''''''''''''
	Dim Query As String
	Query = "SELECT  TblFaktor.FldRadif,TblFaktor.FldNamekala,Cast(Round(TblFaktor.FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh ,TblFaktor.FldTedadDarSabadJoz,TblKala.FldNamevahed,TblFaktor.FldTedadDarSabadKol,TblKala.FldNameVahed2,TblFaktor.FldCodeKala,TblFaktor.FldMablaghMasrafKonande,TblFaktor.FldTozihat FROM TblFaktor,TblKala WHERE TblFaktor.FldCodeKala = TblKala.FldCodeKala And FldShomareFaktor = '"& MCode.ShomareFaktor &"'"
	Dim Cu As Cursor =MCode.Result(Query)
	Dim Radif As String
	Dim CodeKala As String
	Dim NameKala As String
	Dim Fee As Int
	Dim TakhfifKala As Int
	Dim TakhfifVizhe As Int
	Dim TedadJoze As String
	Dim TedadKol As String
	Dim TedadDarKarton As Int
	Dim Sum As String
	Dim SumKol As String=0
	Dim SumMablaghKhales As String=0
	Dim count As Int=0
	Dim sumFactor,sumPardakht,sumKhales,SumKolTakhfif As String=0
	Dim Tozihat,VaziatPardakht,SignatureBitmapString As String
	Dim sumTakhfifKala As String=0
	Dim sumTakhfifVizhe As String=0
	Dim sumMandeAzGhabl As String=0
'	Dim Cu2 As Cursor= Result("SELECT Sum((FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as TakhfifKala FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) = 0 and  Cast(fldFeeBadAzTakhfif AS Int) > 0 ")
'	Cu2.Position = 0
'	If Cu2.GetString("TakhfifKala") <> Null Then
'		Takhfif = Cu2.GetString("TakhfifKala")
'	Else
'		Takhfif = 0
'	End If
'	Tfaktor.TakhfifKala = Takhfif
'	Log("تخفیف کالا : " & Takhfif)
'	
'	Dim TakhfifVizhe As String
'	Dim Cu3 As Cursor= Result("SELECT Sum((FldMablaghTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as SumTakhfifVizhe FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) > 0 ")
'	Cu3.Position = 0
'	If Cu3.GetString("SumTakhfifVizhe") <> Null Then
'		TakhfifVizhe = Cu3.GetString("SumTakhfifVizhe")
'	Else
'		TakhfifVizhe = 0
'	End If
'	Tfaktor.TakhfifVizhe = TakhfifVizhe
'	Log("تخفیف ویژه : " & TakhfifVizhe)
	
	For i=0 To listKala.Size-1
		Dim item As AdapterListKala=listKala.Get(i)
		Radif=i+1
		CodeKala=item.CodeKala
		NameKala=item.NameKala
		Fee=item.FeeForoosh
		'Cast(FldMablaghTakhfif As Int) = 0 And  Cast(fldFeeBadAzTakhfif As Int) > 0
		If item.MablaghTakhfif=0 And item.fldFeeBadAzTakhfif>0 Then
			TakhfifKala=(item.FeeForoosh-item.fldFeeBadAzTakhfif)*((item.TedadDarSabadKol*item.TedadDarKarton)+item.TedadDarSabadJoz)
			sumTakhfifKala=sumTakhfifKala+TakhfifKala
			Else
			TakhfifKala=0
		End If
		'TakhfifKala=(FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)
		'Cast(FldMablaghTakhfif AS Int) > 0
		If item.MablaghTakhfif>0 Then
			TakhfifVizhe=(item.MablaghTakhfif)
			sumTakhfifVizhe=sumTakhfifVizhe+TakhfifVizhe
			Else
			TakhfifVizhe=0
		End If
		Tozihat=item.Tozihat
		TedadJoze=item.TedadDarSabadJoz
		TedadKol=item.TedadDarSabadKol
		TedadDarKarton=item.TedadDarKarton
		Sum=((TedadKol*TedadDarKarton)+TedadJoze)*Fee
		SumKol=SumKol+Sum
		SumMablaghKhales=SumMablaghKhales+Sum-TakhfifKala-TakhfifVizhe
	
	
	
		Dim rec2 As cls_Factor2_Type2
		rec2.Initialize(Radif,CodeKala,NameKala,NumberFormat2(Fee,0,0,0,True)&" "&MCode.VahedPool,NumberFormat2(TakhfifKala,0,0,0,True)&" "&MCode.VahedPool,NumberFormat2(TakhfifVizhe,0,0,0,True)&" "&MCode.VahedPool,NumberFormat2(Sum,0,0,0,True)&" "&MCode.VahedPool,NumberFormat2(SumMablaghKhales,0,0,0,True)&" "&MCode.VahedPool,TedadJoze,TedadKol,TedadDarKarton,Tozihat)
		count=i+1

		clv1.Add(rec2.Panel,i)
		'clv1.ResizeItem(1,200)
	Next
	'''''''''''''rec3'''''''''''''''''

	
	
'	Dim Cu2 As Cursor=MCode.Result("SELECT Sum((FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as TakhfifKala FROM TblFaktor Where Cast(FldMablaghTakhfif AS Int) = 0 and  Cast(fldFeeBadAzTakhfif AS Int) > 0 And FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
'	Cu2.Position = 0
'	If Cu2.GetString("TakhfifKala") <> Null Then
'		sumTakhfif = Cu2.GetString("TakhfifKala")
'	Else
'		sumTakhfif = 0
'	End If
	
	Log("تخفیف کالا : " & sumTakhfifKala)
	
	
'	Dim Cu3 As Cursor= MCode.Result("SELECT Sum((FldMablaghTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as SumTakhfifVizhe FROM TblFaktor Where Cast(FldMablaghTakhfif AS Int) > 0 And FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
'	Cu3.Position = 0
'	If Cu3.GetString("SumTakhfifVizhe") <> Null Then
'		sumTakhfifVizhe = Cu3.GetString("SumTakhfifVizhe")
'	Else
'		sumTakhfifVizhe = 0
'	End If
	
	Log("تخفیف ویژه : " & sumTakhfifVizhe)
	
	SumKolTakhfif=sumTakhfifKala+sumTakhfifVizhe
	'Dim imgSign As ImageView
	'imgSign.Initialize("")
	sumFactor=NumberFormat2(Faktor.fldMablaghKol,0,0,0,True)&" "&MCode.VahedPool
	sumPardakht=NumberFormat2(Faktor.fldTotalFaktor,0,0,0,True)&" "&MCode.VahedPool
	SumMablaghKhales=NumberFormat2(Faktor.fldTotalFaktor,0,0,0,True)&" "&MCode.VahedPool
	sumTakhfifKala=NumberFormat2(sumTakhfifKala,0,0,0,True)&" "&MCode.VahedPool
	sumTakhfifVizhe=NumberFormat2(sumTakhfifVizhe,0,0,0,True)&" "&MCode.VahedPool
	SumKolTakhfif=NumberFormat2(SumKolTakhfif,0,0,0,True)&" "&MCode.VahedPool
	SumKol=NumberFormat2(SumKol,0,0,0,True)&" "&MCode.VahedPool
	
	Tozihat=MCode.Tozihat_faktor
	VaziatPardakht=MCode.NoeTasvieFaktor
	If SignatureUpdate="OK" Then
		SignatureBitmapString=ImageSignature
	Else
	SignatureBitmapString=Faktor.Signature
End If
	Dim rec3 As cls_Factor3_Type2
	rec3.Initialize(SumKol,sumPardakht,VaziatPardakht,SumMablaghKhales,sumTakhfifKala,sumTakhfifVizhe,SumKolTakhfif,Tozihat,SignatureBitmapString)
	
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









'Sub PrintImage(filename As String)
'	Printer1.Reset
'	Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
'	Dim out As OutputStream
'	out = File.OpenOutput(File.DirInternalCache, filename , False)
'	bmp1.WriteToStream(out, 100, "JPEG")
'	out.Close
'	Sleep(200)
'	Dim bmp As Bitmap
'	' Load an image to print and resize it to the maximum mage dimensions for the printer
''	bmp.InitializeResize(File.DirInternalCache, filename, 1600, 2000, True) 'ignore
'	bmp.InitializeResize(File.DirAssets, "2.jpg", 1600, 2000, True) 'ignore
'	'bmp.InitializeResize(File.DirAssets, "Avro_Lancaster.jpg", 576, 512, True) 'ignore
'	
'	' Convert the RGB image to one with luminance values
'	Dim myimage As AnImage = Printer1.ImageToBWIMage(bmp)
'	
'	' Choose thresholding the image or dithering it to get a black and white bit image
'	'myimage = Printer1.ThresholdImage(myimage, 128)
'	'myimage = Printer1.DitherImage1D(myimage, 128)
'	myimage = Printer1.DitherImage2D(myimage, 128)
'	
'	' Send the black and white bit image to the printer
'	myimage= Printer1.PackImage(myimage)
'	Printer1.WriteString(CRLF) ' nudge the printer to show the user something is happening
'	Printer1.PrintImage(myimage)
'	'Printer1.WriteString(CRLF & "Ended" & CRLF & CRLF)
'End Sub


'Sub StartActivityForResult(i As Intent)
'	Dim requestCode As Int = 1  ' Unique request code
'	Dim jo As JavaObject = GetBA
'	
'	ion = jo.CreateEvent("anywheresoftware.b4a.IOnActivityResult", "ion", requestCode)
'	jo.RunMethod("startActivityForResult", Array As Object(ion, i))
'End Sub


