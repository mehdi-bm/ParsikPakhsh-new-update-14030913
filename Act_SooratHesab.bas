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

Sub Process_Globals
	Dim SQL1 As SQL
End Sub

Sub Globals
	Dim Table1 As Table
	Private LblMablaghKol As Label
	Private LblNameKharidar As Label
	Dim PrintBuffer As String
	Dim BtAdmin As BluetoothAdmin
	Dim BTConnection As Serial
	Dim Printers As TextWriter
	Private btnPrint As ACButton
	Dim jobInternet As HttpJob
	Private btnclose As ACButton
	Private Panel1 As Panel
	Dim Pdf As PDFDocument
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_SooratHesab")
	jobInternet.Initialize("jobInternet",Me)
	
	If Not(SQL1.IsInitialized) Then SQL1.Initialize(File.DirRootExternal &"/Zomorod","zomorod_db.db",False)
	Table1.Initialize(Me, "Table1",5)
	Table1.AddToActivity(Activity, 0,11%y,100%x,79%y)
	Table1.HeaderColor=Colors.RGB(0,137,123)
	Table1.TableColor=Colors.RGB(0,137,123)
	Grid
	LblNameKharidar.Text= MCode.N_Tafzili
End Sub

Sub Grid
	Dim Query As String
	Query = "SELECT FldShomareFactor,FldMandeTalab,FldMablagheKolDaryafti,FldMandeTasfieNashode,FldDateSarResid From TblSooratHesab Where FldCodeTafzili = '"& MCode.C_Tafzili &"'"
	
	Table1.LoadSQLiteDB(File.DirRootExternal &"/Zomorod","zomorod_db.db",SQL1, Query)
	Table1.SetColumnsWidths(Array As Int( 100dip, 100dip,100dip,100dip,100dip))
	Table1.SetHeader(Array As String("شماره فاکتور","مانده طلب","مبلغ کل دریافتی","مانده تسویه نشده","تاریخ سر رسید"),Array As Int( 100dip, 100dip,100dip,100dip,100dip))

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Activity.Finish
		MCode.SetAnimation("zoom_enter2", "zoom_exit2")
	End If
	Return True
End Sub
	
Sub Printer_Connected (Success As Boolean)
	If Success Then
		Printers.Initialize2(BTConnection.OutputStream,"windows-1252") 'important to print f.e. German/French chars
		PrintBuffer=Chr(27)&"t"&Chr(16)&"Hello ehtiati" 'Set codepage 1252
		Printers.WriteLine(PrintBuffer)
		Printers.Flush
		
		Msgbox("Printed!","")
		Printers.Close
		BTConnection.Disconnect 'disable this if you like
	Else
		Msgbox("پرینتر یافت نشد...","خطای پرینتر")
	End If
End Sub

Sub GetSooratHesab
	jobInternet.JobName ="GetSooratHesab"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldCodeTafzili,fldSharheTafzili,fldShomareFactor,fldMandeTalab,fldMablagheKolDaryafti,fldMandeTasfieNashode,fldDateSarResid From tblFactorTafsfieNashode" & "&Imei=" & MCode.DeviceId)
End Sub

Sub LoadGetSooratHesab(Str As String)
	Dim RowsList As List
	Dim Row As Map
	Dim Cu As Cursor
	MCode.SaveUpdate("Delete From TblSooratHesab")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblSooratHesab (FldCodeTafzili,FldSharheTafzili,FldShomareFactor,FldMandeTalab,FldMablagheKolDaryafti,FldMandeTasfieNashode,FldDateSarResid) Values ('"& _
		 Row.Get("fldCodeTafzili") &"','"& Row.Get("fldSharheTafzili") &"','"& Row.Get("fldShomareFactor") &"','"& Row.Get("fldMandeTalab") &"','"& Row.Get("fldMablagheKolDaryafti") &"','"& Row.Get("fldMandeTasfieNashode") &"','"& Row.Get("fldDateSarResid") &"')")
	Next

	Cu=MCode.Result("Select * From TblSooratHesab")
	Log("صورت حساب بروزرسانی گردید")
	ToastMessageShow("صورت حساب بروزرسانی گردید:   " & Cu.RowCount,True)
End Sub

Sub btnPrint_Click
	'MCode.Printer
	'Table1.SaveTableToCSV(File.DirRootExternal &"/Zomorod/csv","Zomorod"&DateTime.Now)

	
	
	CreateReport8Cm
	
	
	
	
End Sub
Sub CreateReport8Cm
	Dim Query As String
	Query = "SELECT FldShomareFactor,FldMandeTalab,FldMablagheKolDaryafti,FldMandeTasfieNashode,FldDateSarResid From TblSooratHesab Where FldCodeTafzili = '"& MCode.C_Tafzili &"'"
	
	Dim Cu As Cursor = MCode.Result(Query)
	Cu.Position=0
	
'	Dim Date As String= MCode.Sf.Mid(Cu.GetString("FldDate"),1,4) & "/" & MCode.Sf.Mid(Cu.GetString("FldDate"),5,2) & "/" & MCode.Sf.Mid(Cu.GetString("FldDate"),7,2)
	
	Dim RowCount As Int=Cu.RowCount : Dim RowHeight As Int=30
	Dim Bottom,Bottom1 As Int
	Dim info As PageInfo
	
	Dim r As Rect
	Dim TextRec As TextRec
	Dim drw As ColorDrawable
	Dim HeightPaper As Int
'	If MCode.Signature=1 And  Cu.GetBlob("FldSignatureBitmap") <> Null Then
'	If MCode.Signature=1 And  Cu.GetString("FldSignatureBitmapString") <> "None" Then
		HeightPaper = 390+(Cu.RowCount*25)
'	Else
'		HeightPaper = 320+(Cu.RowCount*25)
'	End If
	drw.Initialize(Colors.Black,1dip)
	Pdf.Initialize("Pdf")
		TextRec.Initialize("",17,30,6,Colors.Yellow)
	r.Initialize(0,0,224,HeightPaper)
	info.Initialize(224,HeightPaper,1,r)


	Dim p As Page = Pdf.startPage(info)
	'Top Sheet=========================================================
	p.Canvas.DrawLine(7, 7, 217, 7, Colors.black, 1)
	p.Canvas.DrawLine(7, 7, 7, 105, Colors.black, 1)
	p.Canvas.DrawLine(217, 7, 217, 105, Colors.black, 1)
	p.Canvas.DrawLine(7, 105, 217, 105, Colors.black, 1)
	p.Canvas.DrawLine(7, 30, 217, 30, Colors.black, 1)
	
	Dim RectNameForooshgah As Rect
	RectNameForooshgah.Initialize(7,7,217,30)
	p.Canvas.DrawDrawable(drw,RectNameForooshgah)
	
'	p.Canvas.DrawText(MCode.NameForooshgah, 112, 20, MCode.Font1, (1.33*MCode.TextSizePdf), Colors.White, "CENTER")
	p.Canvas.DrawText("کد مشتری : " & MCode.C_Tafzili, 211, 45, MCode.Font1, 1.23*MCode.TextSizePdf, Colors.Black, "RIGHT")
	'p.Canvas.DrawText("تاریخ: " & Date, 211, 55, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
	p.Canvas.DrawText("نام مشتری: " & MCode.N_Tafzili, 211, 65, MCode.Font1, 1.23*MCode.TextSizePdf, Colors.Black, "RIGHT")
	
	p.Canvas.DrawText("تلفن: " & MCode.Tell_Tafzili, 211, 83, MCode.Font1, 1.23*MCode.TextSizePdf, Colors.Black, "RIGHT")
		
	p.Canvas.DrawText("آدرس: " & MCode.Address_Tafzili, 211, 100, MCode.Font1, (1.23*MCode.TextSizePdf), Colors.Black, "RIGHT")
	TextRec.draw(p,10,80)

	
	
'	Dim Bitmap1 As Bitmap
'	Bitmap1.Initialize(File.DirAssets, "icon.png")
'	Dim DestRect As Rect
'	DestRect.Initialize(8, 31, 80, 85)
'	p.Canvas.DrawBitmap(Bitmap1, Null, DestRect) 'draws the bitmap to the destination rectangle.
	
	p.Canvas.DrawText("نرم افزار حسابداری زمرد",112, 20, MCode.Font, (1.88*MCode.TextSizePdf), Colors.White, "CENTER")
	
	
	'Center Sheet======================================================
	p.Canvas.DrawLine(7, 110, 217, 110, Colors.black, 1)
	p.Canvas.DrawLine(7, 130+30, 217, 130+30, Colors.black, 1)
	For i=1 To RowCount
		p.Canvas.DrawLine(7, 190+(i*RowHeight), 217, 190+(i*RowHeight), Colors.black, 1)
	Next
	Bottom=190 + (RowCount)*RowHeight
	
	p.Canvas.DrawLine(7, 110, 7, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(30, 110, 30, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(83, 110, 83, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(135, 110, 135, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(182, 110, 182, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(200, 110, 200, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(217, 110, 217, Bottom, Colors.black, 1)
	
	'"شماره فاکتور","مانده طلب","مبلغ کل دریافتی","مانده تسویه نشده","تاریخ سر رسید"
	
	p.Canvas.DrawTextRotated("تاریخ سر رسید", 22, 135, MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
	p.Canvas.DrawText("مانده تسویه نشده", 57, 132, MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER")
	p.Canvas.DrawText("مبلغ کل دریافتی", 109, 132, MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER")
	p.Canvas.DrawText("مانده طلب", 163, 132, MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER")
	p.Canvas.DrawTextRotated("شماره فاکتور",192, 134, MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
	'ردیف---------------
	

	p.Canvas.DrawTextRotated("ردیف", 210, 132, MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
	
	For i=0 To RowCount -1
		Cu.Position=i
		p.Canvas.DrawText(i+1, 208, 150 +30 + (i*RowHeight), MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER")
		
		TextRec.Initialize("",70,18,8,Colors.Black)
		TextRec.draw(p,90, 165+(i*RowHeight))
		p.Canvas.DrawText(Cu.GetString("FldShomareFactor"), 192, 179+(i*RowHeight), MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER")
		p.Canvas.DrawText(Cu.GetString("FldMandeTalab"), 163, 179+(i*RowHeight), MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER")
		p.Canvas.DrawText(Cu.GetString("FldMablagheKolDaryafti"), 109,  179+(i*RowHeight), MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER")
		p.Canvas.DrawText(Cu.GetString("FldMandeTasfieNashode"), 57,  179+(i*RowHeight), MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER")
		p.Canvas.DrawTextRotated(Cu.GetString("FldDateSarResid"), 22,  189+(i*RowHeight), MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
	Next

	Pdf.finishPage(p)
	
	ExportPdf
End Sub

Sub ExportPdf
	Dim dir As String=File.DirRootExternal &"/Zomorod/pdf"
	Dim FileName As String="rptSoorathesab-"&DateTime.Now & ".pdf"
	Dim Address As String=dir&"/"&FileName
	Dim out As OutputStream = File.OpenOutput(dir, FileName, True)
	
	Pdf.Writeto2(out)
	out.Close
	Pdf.Close
	ToastMessageShow("فاکتور شما جهت چاپ ایجاد گردید",True)
	'Act_Print.filename=FileName
	'Act_Print.address=dir
	'StartActivity(Act_Print)
	If File.Exists(Starter.shared,FileName) Then
	Else
	
		File.Copy(dir,FileName,Starter.shared,FileName)
	End If
	Dim in As Intent
	in.Initialize(in.ACTION_SEND,CreateFileProviderUri(Starter.shared,FileName))
	in.Flags=1
	StartActivity(in)
	
	MCode.SetAnimation("zoom_enter2", "zoom_exit2")
End Sub
Sub CreateFileProviderUri (Dir As String, FileName As String) As Object
	Dim FileProvider As JavaObject
	Dim context As JavaObject
	context.InitializeContext
	FileProvider.InitializeStatic("android.support.v4.content.FileProvider")
	Dim f As JavaObject
	f.InitializeNewInstance("java.io.File", Array(Dir, FileName))
	Return FileProvider.RunMethod("getUriForFile", Array(context, Application.PackageName & ".provider", f))
End Sub


Sub btnclose_Click
	Panel1.Visible=True
End Sub