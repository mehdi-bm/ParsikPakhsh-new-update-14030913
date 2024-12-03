B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.8
@EndOfDesignText@
Sub Class_Globals
	Dim xui As XUI
	Dim rp As RuntimePermissions
	Dim Printer As BT_Printer
	Private Preview As ScrollView
	Private ListView1 As ListView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	Printer.Initialize(Me,"Printer",Encoding.Windows1252)
	Preview.Color=Colors.LightGray
End Sub


Sub Associated
	' connect to Associated Printer
	ListView1.Clear
	Printer.SelectFromAssociatedPrinter
End Sub

Sub ScanPrinter
	' Scan for find Bluetooth Printer
	ListView1.Clear
	
	Printer.SearchNewPrinter
End Sub

Sub Printer_ListPrinterAssociated (ListNameAndMac As Map)
	' Return a List of BT associated
	ListView1.Clear
	For I=0 To ListNameAndMac.Size-1
		ListView1.AddSingleLine2(ListNameAndMac.GetKeyAt(I),ListNameAndMac.GetValueAt(I))
	Next
End Sub

Sub Printer_DiscoveryNewPrinter (PrinterFound As Map, DeviceClass As Int)
	' Find new printer
	Log("DEVICE Class:" & DeviceClass)
	ListView1.AddSingleLine2(PrinterFound.GetKeyAt(0),PrinterFound.GetValueAt(0))
End Sub

Sub Printer_DiscoveryFinished
	Log("Search End")
End Sub

Sub Printer_DiscoveryNoDeviceFound
	ToastMessageShow("Device not found",True)
End Sub

Sub ListView1_ItemClick (Position As Int, Value As Object)
	' Connect Printer for Mac
	Printer.SelectFromMac(Value)
End Sub

Sub Printer_ConnectedToPrint (Success As Boolean)
	' When is connect
	If Success Then
		ToastMessageShow("Connect to BT PRINTER",False)
	Else
		ToastMessageShow("Connection error on BT printer",False)
	End If
End Sub

Sub Printer_SendTerminated
	Log("Finish!!")
	'Printer.Close
End Sub

Sub RadioButtonText_CheckedChange(Checked As Boolean)
	Printer.ClearBuffer
	Printer.AddBuffer_Writeline(ESC_POS.BoldOn & "Hallo dear" & ESC_POS.DoubleOff)
	Printer.AddBuffer_Writeline("How are you?")
	Printer.AddBuffer_Writeline("Fine thank's")
	Printer.AddBuffer_Writeline("012345678901234567890123456789-F")
	
	Preview.Panel.Height=Printer.Preview.Height
	Preview.Panel.SetBackgroundImage(Printer.Preview)
End Sub

Sub PrintPdf
	Printer.ClearBuffer
	Printer.AddBuffer_Writeline(ESC_POS.BoldOn & "Hallo dear" & ESC_POS.DoubleOff)
	Printer.AddBuffer_Writeline("How are you?")
	Printer.AddBuffer_Writeline("Fine thank's")
	Printer.AddBuffer_Writeline("012345678901234567890123456789-F")
	
	
	Preview.Panel.Height=Printer.Preview.Height
	Preview.Panel.SetBackgroundImage(Printer.Preview)
End Sub

Sub RadioButtonIMG_CheckedChange(Checked As Boolean)
	Printer.ClearBuffer
	Printer.AddBuffer_Bitmap(CreateImage(Chr(0xF209) & " " & Chr(0xF17B),xui.CreateFontAwesome(16)),0)
	
	Preview.Panel.Height=Printer.Preview.Height
	Preview.Panel.SetBackgroundImage(Printer.Preview)
End Sub

Sub RadioButtonMIX_CheckedChange(Checked As Boolean)
	Printer.ClearBuffer
	Printer.AddBuffer_Writeline("TEST - Mixed Text and Image")
	Printer.AddBuffer_Writeline("012345678901234567890123456789-F")
	Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAssets,"qr.jpg"),0)
	Printer.AddBuffer_Writeline("END PRINT")
	
	Preview.Panel.Height=Printer.Preview.Height
	Preview.Panel.SetBackgroundImage(Printer.Preview)
End Sub

Sub ButtonPrint_Click
	Printer.flushAllAndClose
	
	Preview.Panel.Color=Colors.Transparent
	
'	RadioButtonIMG.Checked=False
'	RadioButtonMIX.Checked=False
'	RadioButtonText.Checked=False
End Sub


Sub CreateImage(Text As String,Font As B4XFont) As Bitmap
	Dim Can As B4XCanvas
	Dim V As B4XView = xui.CreatePanel("")
	V.SetLayoutAnimated(0,0,0,140,90) 'ignore
	
	Can.Initialize(V)
	Can.DrawRect(Can.TargetRect,xui.Color_White,True,1)
	Can.DrawText(Text,Can.TargetRect.CenterX,Can.TargetRect.Bottom*0.70,Font,xui.Color_Black,"CENTER")
	Can.Invalidate
	Return Can.CreateBitmap
	
End Sub
'Sub CreateReport8Cm
'	Dim Cu As Cursor = MCode.Result("Select TblFaktor.FldN_Kala,TblFaktor.FldFee,TblFaktor.FldFeeBadAzTakhfif,TblFaktor.FldTedadJoz,TblFaktor.FldTedadKol,FldTedadKarton,TblFaktor.FldTotalFaktor,TblFaktor.FldTozihFaktor,TblFaktor.FldC_Tasvie,TblFaktor.FldDate,TblFaktor.FldTime,TblAshkhas.FldN_Ashkhas,TblAshkhas.FldAddress,TblAshkhas.FldTell,TblAshkhas.FldMob,((TblFaktor.FldTedadJoz+(TblFaktor.FldTedadKol*TblFaktor.FldTedadKarton))*TblFaktor.FldFee) As FldMablaghKolRadif,FldSignatureBitmapString From TblFaktor,TblAshkhas Where TblFaktor.FldC_Ashkhas = TblAshkhas.FldC_Ashkhas And FldShomareFaktor = '"& MCode.FaktorSelect &"'")
'	Cu.Position=0
'	
'	Dim Date As String= MCode.Sf.Mid(Cu.GetString("FldDate"),1,4) & "/" & MCode.Sf.Mid(Cu.GetString("FldDate"),5,2) & "/" & MCode.Sf.Mid(Cu.GetString("FldDate"),7,2)
'	Dim NameMoshtari As String = Cu.GetString("FldN_Ashkhas")
'	Dim Address As String = Cu.GetString("FldAddress")
'	Dim Tell As String = Cu.GetString("FldTell") & " | " & Cu.GetString("FldMob")
'	Dim MablaghKolFaktor,MablaghGhabelPardakht As Long',MablaghGhabelPardakht,TakhfifKala,TakhfifRiali,TakhfifVizhe As Int
'	Dim RowCount As Int=Cu.RowCount : Dim RowHeight As Int=25
'	Dim Mablagh As Long
'	Dim Bottom,Bottom1 As Int
'	Dim info As PageInfo
'	Dim r As Rect
'	Dim TextRec As TextRec
'	Dim drw As ColorDrawable
'	Dim HeightPaper As Int
''	If MCode.Signature=1 And  Cu.GetBlob("FldSignatureBitmap") <> Null Then
'	If MCode.Signature=1 And  Cu.GetString("FldSignatureBitmapString") <> "None" Then
'		HeightPaper = 390+(Cu.RowCount*25)
'	Else
'		HeightPaper = 320+(Cu.RowCount*25)
'	End If
'	drw.Initialize(Colors.Black,1dip)
'	Pdf.Initialize("Pdf")
'	
'	r.Initialize(0,0,224,HeightPaper)
'	info.Initialize(224,HeightPaper,1,r)
'
'	Dim p As Page = Pdf.startPage(info)
'	'Top Sheet=========================================================
'	p.Canvas.DrawLine(7, 7, 217, 7, Colors.black, 1)
'	p.Canvas.DrawLine(7, 7, 7, 105, Colors.black, 1)
'	p.Canvas.DrawLine(217, 7, 217, 105, Colors.black, 1)
'	p.Canvas.DrawLine(7, 105, 217, 105, Colors.black, 1)
'	p.Canvas.DrawLine(7, 30, 217, 30, Colors.black, 1)
'	
'	Dim RectNameForooshgah As Rect
'	RectNameForooshgah.Initialize(7,7,217,30)
'	p.Canvas.DrawDrawable(drw,RectNameForooshgah)
'	
'	p.Canvas.DrawText(MCode.NameForooshgah, 112, 20, MCode.Font1, (1.33*MCode.TextSizePdf), Colors.White, "CENTER")
'	p.Canvas.DrawText("شماره فاکتور: " & MCode.FaktorSelect, 211, 40, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
'	p.Canvas.DrawText("تاریخ: " & Date, 211, 55, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
'	p.Canvas.DrawText("نام مشتری: " & NameMoshtari, 211, 70, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
'	p.Canvas.DrawText("آدرس: " & Address, 211, 85, MCode.Font1, (0.83*MCode.TextSizePdf), Colors.Black, "RIGHT")
''	TextRec.draw(p,10,80)
'	p.Canvas.DrawText("تلفن: " & Tell, 211, 100, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
'	
'	
'	Dim Bitmap1 As Bitmap
'	Bitmap1.Initialize(File.DirAssets, "Logo RGB.png")
'	Dim DestRect As Rect
'	DestRect.Initialize(8, 31, 40, 70)
'	p.Canvas.DrawBitmap(Bitmap1, Null, DestRect) 'draws the bitmap to the destination rectangle.
'	
'	
'	'Center Sheet======================================================
'	p.Canvas.DrawLine(7, 110, 217, 110, Colors.black, 1)
'	p.Canvas.DrawLine(7, 110+30, 217, 110+30, Colors.black, 1)
'	For i=1 To RowCount
'		p.Canvas.DrawLine(7, 140+(i*RowHeight), 217, 140+(i*RowHeight), Colors.black, 1)
'	Next
'	Bottom=140 + (RowCount)*RowHeight
'	
'	p.Canvas.DrawLine(7, 110, 7, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(50, 110, 50, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(67, 110, 67, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(84, 110, 84, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(200, 110, 200, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(217, 110, 217, Bottom, Colors.black, 1)
'	
'	p.Canvas.DrawText("مبلغ", 30, 126, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawTextRotated("تعداد کل", 60, 126, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	p.Canvas.DrawTextRotated("تعداد جزء", 77, 126, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	p.Canvas.DrawText("نام کالا", 145, 126, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	'ردیف---------------
'	
''	TextRec.Initialize("ردیف",17,30,6,Colors.Black)
''	TextRec.draw(p,200,125)
'	p.Canvas.DrawTextRotated("ردیف", 210, 126, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	
'	For i=0 To RowCount -1
'		Cu.Position=i
'		p.Canvas.DrawText(i+1, 208, 125 +30 + (i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'		
'		TextRec.Initialize(Cu.GetString("FldN_Kala"),70,18,8,Colors.Black)
'		TextRec.draw(p,90, 145+(i*RowHeight))
''		p.Canvas.DrawText(Cu.GetString("FldN_Kala"), 93, 140+(i*RowHeight), MCode.Font1, 2, Colors.Black, "CENTER")
'		p.Canvas.DrawText(Cu.GetString("FldTedadJoz"), 77, 155+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'		p.Canvas.DrawText(Cu.GetString("FldTedadKol"), 60,  155+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
''		If Cu.GetString("FldFeeBadAzTakhfif") = 0 Then
'		Mablagh = Cu.GetString("FldFee") * (Cu.GetString("FldTedadJoz")+(Cu.GetString("FldTedadKol")*Cu.GetString("FldTedadKarton")))
''		Else
''			Mablagh = Cu.GetString("FldFeeBadAzTakhfif") * (Cu.GetString("FldTedadJoz")+(Cu.GetString("FldTedadKol")*Cu.GetString("FldTedadKarton")))
''		End If
'		p.Canvas.DrawText(NumberFormat(Mablagh,0,3), 30, 155+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	
'		MablaghKolFaktor = MablaghKolFaktor + Cu.GetString("FldMablaghKolRadif")
''		TakhfifKala = TakhfifKala + (Cu.GetString("FldMablaghKolRadif")-Mablagh)
'	Next
'	MablaghGhabelPardakht=Cu.GetString("FldTotalFaktor")
'	
'	'=======================================================================
'	For i=0 To 5
'		p.Canvas.DrawLine(7, Bottom+5+(i*20), 217, Bottom+5+(i*20), Colors.black, 1)
'		Bottom1=Bottom+5+(i*20)
'	Next
'
'	p.Canvas.DrawLine(7, Bottom+5, 7, Bottom1, Colors.black, 1)
'	p.Canvas.DrawLine(120, Bottom+5, 120, Bottom1, Colors.black, 1)
'	p.Canvas.DrawLine(217, Bottom+5, 217, Bottom1, Colors.black, 1)
'
'	p.Canvas.DrawText("جمع فاکتور:", 169, Bottom+5+12, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawText("تخفیف کالا:", 169, Bottom+5+12+20, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawText("تخفیف ریالی:", 169, Bottom+5+12+40, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawText("تخفیف ویژه:", 169, Bottom+5+12+60, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawText("قابل پرداخت:", 169, Bottom+5+12+80, MCode.Font1, MCode.TextSizePdf, Colors.black, "CENTER")
'	
'	Dim RectMablaghFaktor As Rect
'	RectMablaghFaktor.Initialize(7,Bottom1-20,120,Bottom1)
'	p.Canvas.DrawDrawable(drw,RectMablaghFaktor)
'	
'	p.Canvas.DrawText(NumberFormat(MablaghKolFaktor,0,3), 55, Bottom+5+12, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawText(NumberFormat(TakhfifKala,0,3), 55, Bottom+5+12+20, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawText(NumberFormat(TakhfifRiali(MablaghKolFaktor),0,3), 55, Bottom+5+12+40, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawText(NumberFormat(TakhfifVizhe(MablaghKolFaktor),0,3), 55, Bottom+5+12+60, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawText(NumberFormat(MablaghGhabelPardakht,0,3), 55, Bottom+5+12+80, MCode.Font1, (1.33*MCode.TextSizePdf), Colors.White, "CENTER")
'	
'	p.Canvas.DrawText("زمان تحویل: " & MCode.ZamanTahvil, 217, Bottom1+10, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
'	p.Canvas.DrawText("آدرس: " & MCode.AddressForooshgah, 217, Bottom1+10+15, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
'	p.Canvas.DrawText("تلفن تماس: " & MCode.TellForooshgah, 217, Bottom1+10+15+15, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
''	p.Canvas.DrawText("امضای مشتری: " & MCode.TellForooshgah, 133, Bottom1+10+10+10+10, MCode.Font1, 2, Colors.Black, "RIGHT")
'	
''	If MCode.Signature=1 And  Cu.GetBlob("FldSignatureBitmap") <> Null Then
'	If MCode.Signature=1 And  Cu.Getstring("FldSignatureBitmapString") <> "None" Then
'		p.Canvas.DrawText("امضای مشتری:", 217, Bottom1+10+15+15+15, MCode.Font1, MCode.TextSizePdf, Colors.black, "RIGHT")
'		Dim SignatureRect As Rect
'		SignatureRect.Initialize(8, Bottom1+10+15+15+15, 72, Bottom1+10+15+15+15+70)
'		p.Canvas.DrawBitmap(ReadBlob(Cu), Null, SignatureRect)
'	End If
'	
'	Pdf.finishPage(p)
'	
'	ExportPdf
'End Sub
'
'Sub ExportPdf
'	Dim out As OutputStream = File.OpenOutput(File.DirRootExternal & "/Webcom/Report", MCode.FaktorSelect & ".pdf", False)
'	
'	Pdf.Writeto2(out)
'	out.Close
'	Pdf.Close
'	ToastMessageShow("فاکتور شما جهت چاپ ایجاد گردید",True)
'	
'	StartActivity(Act_Print)
'	MCode.SetAnimation("zoom_enter2", "zoom_exit2")
'End Sub

