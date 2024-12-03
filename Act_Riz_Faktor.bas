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
	Dim ItemEntekhab As AdapterListKala
	Private LblMablaghKol As Label
	Private LblNameKharidar As Label
	Private AcSpLblVaziatPardakht As ACSpinner
	Private LblTitle As Label
	Private PnlEdit As Panel
	Private AcBtnUpJoz As ACButton
	Private MTxtTedadSabadJoz As MaskedEditText
	Private AcBtnDownJoz As ACButton
	Private AcBtnDownKol As ACButton
	Private MTxtTedadSabadKol As MaskedEditText
	Private AcBtnUpkol As ACButton
	Private AcBtnEdit As ACButton
	Private AcBtnSaveTozih As ACButton
	Private TxtTozih As EditText
	Private LblVaziatPardakhti As Label
	Dim Pdf As PDFDocument
	Dim MablaghKol As String
	Dim dateprint As String
	Private ion As Object
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Riz_Faktor")
	If Not(SQL1.IsInitialized) Then SQL1.Initialize(File.DirRootExternal &"/Zomorod","zomorod_db.db",False)
	Table1.Initialize(Me, "Table1",8)
	Table1.AddToActivity(Activity, 0,31%y,100%x,50%y)
	Table1.HeaderColor=Colors.RGB(0,137,123)
	Table1.TableColor=Colors.RGB(0,137,123)
	Table1.FontSize=19
	Grid
	LoadPage
	'Log(MCode.GetDateNow)
End Sub

Sub Grid
	Dim Query As String
	Query = "SELECT  TblFaktor.FldRadif,TblFaktor.FldNamekala,Cast(Round(TblFaktor.FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh ,TblFaktor.FldTedadDarSabadJoz,TblKala.fldNamevahed,TblFaktor.FldTedadDarSabadKol,TblKala.fldNameVahed2,TblFaktor.FldCodeKala,TblFaktor.FldMablaghMasrafKonande,TblFaktor.FldTozihat FROM TblFaktor,TblKala WHERE TblFaktor.FldCodeKala = TblKala.fldCodeKala And FldShomareFaktor = '"& MCode.ShomareFaktor &"'"
	Table1.LoadSQLiteDB(File.DirRootExternal &"/Zomorod","zomorod_db.db",SQL1, Query)
	Table1.SetColumnsWidths(Array As Int( 50dip,200dip, 100dip,50dip,80dip,50dip,80dip,80dip,80dip,100dip))
	Table1.SetHeader(Array As String("ردیف","نام کالا","قیمت فی","تعداد جزء","واحد جزء","تعداد کل","واحد کل","کد کالا","قیمت مصرف کننده","توضیحات"),Array As Int( 50dip,200dip, 100dip,50dip,80dip,50dip,80dip,80dip,80dip,100dip))

	MohasebeMablaghFaktor
End Sub

private Sub Grid_CellLongClick(Col As Int,Row As Int)
	If MCode.NoeFaktorClick = "NoSend" Then
		Dim CodeKala As String =Table1.GetValue(7,Row)
		Dim Result As Int
		Result=Msgbox2("ردیف مورد نظر حذف گردد؟","پیام","بله","","خیر",Null)
		If Result=DialogResponse.POSITIVE Then
			MCode.SaveUpdate("Delete From TblFaktor Where FldShomareFaktor = '"& MCode.ShomareFaktor &"' And FldCodeKala = '"& CodeKala &"'")
			UpdateRadif
			Grid
		End If
	End If
End Sub

Sub btnPrint_Click
	'MCode.Printer
	'Table1.SaveTableToCSV(File.DirRootExternal &"/Zomorod/csv","Zomorod"&DateTime.Now)

	
	
	CreateReport8Cm
	
	
	If MCode.PrinterType=0 Then
		PrintBlutooth
	Else
		PrintPos
	End If
	
'	Dim dir As String=File.DirRootExternal &"/Zomorod/Jpg"
'	Dim FileName As String="rptRizeFaktor-"&dateprint& ".jpg"
'	
'	Dim bmp As B4XBitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
'	Dim out As OutputStream
'	out = File.OpenOutput(File.DirRootExternal, FileName , False)
'	bmp.WriteToStream(out, 90, "JPEG")
'	out.Close
'
'	If File.Exists(File.DirRootExternal,"print_sepehr")=False Then
'		File.MakeDir(File.DirRootExternal,"print_sepehr")
'	End If
'	Dim FileName As String=MCode.FaktorSelect & ".jpg"
'	File.Copy(File.DirRootExternal,FileName,File.DirRootExternal,"print_sepehr/factor.jpg")
'	
'	Dim isPos As Int = myCode.getSetting("setting.dat","isPos",0)
'	Select Case isPos
'		Case 1
'			PrintPos
'		Case 0
'			PrintBlutooth
'	End Select
	
	
End Sub
Sub CreateReport8Cm
	Dim Query As String
	Query = "SELECT  TblFaktor.FldRadif,TblFaktor.FldNamekala,Cast(Round(TblFaktor.FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh ,TblFaktor.FldTedadDarSabadJoz,TblKala.fldNamevahed as fldNamevahed,TblFaktor.FldTedadDarSabadKol,TblKala.fldNameVahed2,TblFaktor.FldCodeKala,TblFaktor.FldMablaghMasrafKonande,TblFaktor.FldTozihat FROM TblFaktor,TblKala WHERE TblFaktor.FldCodeKala = TblKala.fldCodeKala And FldShomareFaktor = '"& MCode.ShomareFaktor &"'"
	
	Dim Cu As Cursor = MCode.Result(Query)
	Cu.Position=0
	
	'Dim Date As String= MCode.Sf.Mid(Cu.GetString("FldDate"),1,4) & "/" & MCode.Sf.Mid(Cu.GetString("FldDate"),5,2) & "/" & MCode.Sf.Mid(Cu.GetString("FldDate"),7,2)
	
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

	
	p.Canvas.DrawText("شماره فاکتور: " & MCode.ShomareFaktor, 60, 45, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
	p.Canvas.DrawText("تاریخ: " & MCode.Sf.Mid(MCode.DateFaktor,1,4) & "/" & MCode.Sf.Mid(MCode.DateFaktor,5,2) & "/" & MCode.Sf.Mid(MCode.DateFaktor,7,2), 70, 65, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
	
	p.Canvas.DrawText("کد مشتری : " & MCode.C_Tafzili, 211, 45, MCode.Font1, 1.23*MCode.TextSizePdf, Colors.Black, "RIGHT")
	p.Canvas.DrawText("نام مشتری: " & MCode.N_Tafzili, 211, 65, MCode.Font1, 1.23*MCode.TextSizePdf, Colors.Black, "RIGHT")
	
	p.Canvas.DrawText("کد ویزیتور : " & MCode.C_Visitor, 211, 85, MCode.Font1, 1.23*MCode.TextSizePdf, Colors.Black, "RIGHT")
	p.Canvas.DrawText("نام ویزیتور: " & MCode.N_Visitor, 211, 100, MCode.Font1, 1.23*MCode.TextSizePdf, Colors.Black, "RIGHT")
	

	
'	p.Canvas.DrawText("تلفن: " & MCode.Tell_Tafzili, 211, 83, MCode.Font1, 1.23*MCode.TextSizePdf, Colors.Black, "RIGHT")
'		
'	p.Canvas.DrawText("آدرس: " & MCode.Address_Tafzili, 211, 100, MCode.Font1, (1.23*MCode.TextSizePdf), Colors.Black, "RIGHT")
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
	For i=0 To RowCount
		p.Canvas.DrawLine(7, 190+(i*RowHeight), 217, 190+(i*RowHeight), Colors.black, 1)
	Next
	Bottom=190 + (RowCount)*RowHeight
	'#1
'	p.Canvas.DrawLine(7, 110, 7, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(45, 110, 45, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(65, 110, 65, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(85, 110, 85, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(105, 110, 105, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(122, 110, 122, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(152, 110, 152, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(182, 110, 182, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(200, 110, 200, Bottom, Colors.black, 1)
'	p.Canvas.DrawLine(217, 110, 217, Bottom, Colors.black, 1)
'	
'	'"ردیف","نام کالا","قیمت فی","تعداد جزء","واحد جزء","تعداد کل","واحد کل","کد کالا","قیمت مصرف کننده","توضیحات"
'	
''	p.Canvas.DrawTextRotated("توضیحات", 85, 135, MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
''	p.Canvas.DrawTextRotated("قیمت مصرف کننده", 85, 135, MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'
'	p.Canvas.DrawText("توضیحات", 25, 135, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawTextRotated("واحد کل", 55, 135, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	p.Canvas.DrawTextRotated("تعداد کل", 78, 135, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	p.Canvas.DrawTextRotated("واحد جزء", 95, 132, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	p.Canvas.DrawTextRotated("تعداد جزء", 113, 132, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	p.Canvas.DrawText("قیمت فی",135, 132, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'	p.Canvas.DrawTextRotated("نام کالا",170, 134, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	p.Canvas.DrawTextRotated("کد کالا", 192, 135, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	'ردیف---------------
'	
'
'	p.Canvas.DrawTextRotated("ردیف", 210, 132, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	
'	For i=0 To RowCount -1
'		Cu.Position=i
'		p.Canvas.DrawText(i+1, 208, 150 +30 + (i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'		
'		TextRec.Initialize("",70,18,8,Colors.Black)
'		TextRec.draw(p,90, 165+(i*RowHeight))
'		p.Canvas.DrawTextRotated(Cu.GetString("FldCodeKala"), 192,  179+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'		p.Canvas.DrawText(Cu.GetString("FldNamekala"), 170, 179+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'		p.Canvas.DrawText(MCode.qomaAshar(Cu.GetString("FldFeeForoosh")), 135, 179+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'		p.Canvas.DrawText(Cu.GetString("FldTedadDarSabadJoz"), 113,  179+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'		p.Canvas.DrawText(Cu.GetString("fldNamevahed"), 95,  179+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'		p.Canvas.DrawTextRotated(Cu.GetString("FldTedadDarSabadKol"), 78,  179+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'		p.Canvas.DrawText(Cu.GetString("fldNameVahed2")&"کارتن", 55,  179+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'		p.Canvas.DrawText(Cu.GetString("FldTozihat"), 25,  179+(i*RowHeight), MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
'		
'	
'	Next
	
	
	'#2
	p.Canvas.DrawLine(7, 110, 7, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(45, 110, 45, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(80, 110, 80, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(119, 110, 119, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(182, 110, 182, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(200, 110, 200, Bottom, Colors.black, 1)
	p.Canvas.DrawLine(217, 110, 217, Bottom, Colors.black, 1)
	
	'"ردیف","نام کالا","قیمت فی","تعداد جزء","واحد جزء","تعداد کل","واحد کل","کد کالا","قیمت مصرف کننده","توضیحات"
	
'	p.Canvas.DrawTextRotated("توضیحات", 85, 135, MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER",-90)
'	p.Canvas.DrawTextRotated("قیمت مصرف کننده", 85, 135, MCode.Font, MCode.TextSizePdf, Colors.Black, "CENTER",-90)



	p.Canvas.DrawText("تعداد کل", 25, 135, MCode.Font1, 4.5, Colors.Black, "CENTER")
	p.Canvas.DrawText("تعداد جزء", 65,135, MCode.Font1, 4.5, Colors.Black, "CENTER")
	p.Canvas.DrawText("قیمت فی",100, 135, MCode.Font1, 4.5, Colors.Black, "CENTER")
	p.Canvas.DrawText("نام کالا",150, 135, MCode.Font1, 4.5, Colors.Black, "CENTER")
	p.Canvas.DrawTextRotated("کد کالا", 192, 135, MCode.Font1, 4.5, Colors.Black, "CENTER",-90)
	'ردیف---------------
	

	p.Canvas.DrawTextRotated("ردیف", 210, 132, MCode.Font1, 4.5, Colors.Black, "CENTER",-90)
	
	For i=0 To RowCount-1
		Cu.Position=i
		p.Canvas.DrawText(i+1, 208, 150 +30 + (i*RowHeight), MCode.Font1, 4.5, Colors.Black, "CENTER")
		
		TextRec.Initialize("",70,18,8,Colors.Black)
		TextRec.draw(p,90, 165+(i*RowHeight))
		p.Canvas.DrawTextRotated(Cu.GetString("FldCodeKala"), 192,  177+(i*RowHeight), MCode.Font1, 6, Colors.Black, "CENTER",-90)
		p.Canvas.DrawText(Cu.GetString("FldNamekala"), 150, 179+(i*RowHeight), MCode.Font1, 4.5, Colors.Black, "CENTER")
		p.Canvas.DrawText(MCode.qomaAshar(Cu.GetString("FldFeeForoosh")), 100, 179+(i*RowHeight), MCode.Font1, 4.5, Colors.Black, "CENTER")
		p.Canvas.DrawText(Cu.GetString("FldTedadDarSabadJoz"), 65,  179+(i*RowHeight), MCode.Font1, 4.5, Colors.Black, "CENTER")
		p.Canvas.DrawText(Cu.GetString("FldTedadDarSabadKol"), 25,  179+(i*RowHeight), MCode.Font1, 4.5, Colors.Black, "CENTER")
	
	
		
	
	Next
	For i=0 To 3
		p.Canvas.DrawLine(7, Bottom+5+(i*20), 217, Bottom+5+(i*20), Colors.black, 1)
		Bottom1=Bottom+5+(i*20)
	Next

	p.Canvas.DrawLine(7, Bottom+5, 7, Bottom1, Colors.black, 1)
	p.Canvas.DrawLine(120, Bottom+5, 120, Bottom1, Colors.black, 1)
	p.Canvas.DrawLine(217, Bottom+5, 217, Bottom1, Colors.black, 1)

	p.Canvas.DrawText("جمع فاکتور:", 169, Bottom+5+12, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
	p.Canvas.DrawText("نحوه پرداخت:", 169, Bottom+5+12+20, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
	'p.Canvas.DrawText("تخفیف ریالی:", 169, Bottom+5+12+40, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
	'p.Canvas.DrawText("تخفیف ویژه:", 169, Bottom+5+12+60, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
	p.Canvas.DrawText("قابل پرداخت:", 169, Bottom+5+12+40, MCode.Font1, MCode.TextSizePdf, Colors.black, "CENTER")
	
	Dim RectMablaghFaktor As Rect
	RectMablaghFaktor.Initialize(7,Bottom1-20,120,Bottom1)
	p.Canvas.DrawDrawable(drw,RectMablaghFaktor)
	
	p.Canvas.DrawText(NumberFormat(MablaghKol,0,3)&" " & MCode.VahedPool, 55, Bottom+5+12, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
	p.Canvas.DrawText(AcSpLblVaziatPardakht.SelectedItem, 55, Bottom+5+12+20, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
	'p.Canvas.DrawText(NumberFormat(TakhfifRiali(MablaghKolFaktor),0,3), 55, Bottom+5+12+40, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
	'p.Canvas.DrawText(NumberFormat(TakhfifVizhe(MablaghKolFaktor),0,3), 55, Bottom+5+12+60, MCode.Font1, MCode.TextSizePdf, Colors.Black, "CENTER")
	p.Canvas.DrawText(NumberFormat(MablaghKol,0,3)&" " & MCode.VahedPool, 55, Bottom+5+12+40, MCode.Font1, (1.33*MCode.TextSizePdf), Colors.White, "CENTER")
	
	'p.Canvas.DrawText("زمان تحویل: " & MCode.ZamanTahvil, 217, Bottom1+10, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
	'p.Canvas.DrawText("آدرس: " & MCode.AddressForooshgah, 217, Bottom1+10+15, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
'	p.Canvas.DrawText("تلفن تماس: " & MCode.TellForooshgah, 217, Bottom1+10+15+15, MCode.Font1, MCode.TextSizePdf, Colors.Black, "RIGHT")
'	p.Canvas.DrawText("امضای مشتری: " & MCode.TellForooshgah, 133, Bottom1+10+10+10+10, MCode.Font1, 2, Colors.Black, "RIGHT")
	
'	If MCode.Signature=1 And  Cu.GetBlob("FldSignatureBitmap") <> Null Then
'	If MCode.Signature=1 And  Cu.Getstring("FldSignatureBitmapString") <> "None" Then
	p.Canvas.DrawText("امضای مشتری:", 217, Bottom1+10+15+15+15, MCode.Font2, MCode.TextSizePdf, Colors.black, "RIGHT")
	Dim SignatureRect As Rect
	SignatureRect.Initialize(10, Bottom1+50, 82, Bottom1+1+1+1+1+80)
	If File.Exists(File.DirInternal, "sign.png") Then
	Dim b As Bitmap
	b=LoadBitmap(File.DirInternal, "sign.png")
	p.Canvas.DrawBitmap(b, Null, SignatureRect)
	End If


	Pdf.finishPage(p)
	
	dateprint=DateTime.Now
	ExportPdf
	ExportJpg(p.Canvas)
	
End Sub

Sub ExportJpg(Canvas1 As Canvas)
	If File.Exists(File.DirRootExternal,"print_sepehr")=False Then
		File.MakeDir(File.DirRootExternal,"print_sepehr")
	End If

	Dim Out As OutputStream
	Out = File.OpenOutput(File.DirRootExternal,"print_sepehr/factor.jpg", False)
	Canvas1.Bitmap.WriteToStream(Out, 90, "JPEG")
	Out.Close

End Sub
Sub ExportPdf
	Dim dir As String=File.DirRootExternal &"/Zomorod/pdf"
	Dim FileName As String="rptRizeFaktor-"&dateprint & ".pdf"
	Dim Address As String=dir&"/"&FileName
	Dim out As OutputStream = File.OpenOutput(dir, FileName, True)
	
	Pdf.Writeto2(out)
	out.Close
	Pdf.Close
	ToastMessageShow("فاکتور شما جهت چاپ ایجاد گردید",True)
	'Act_Print.filename=FileName
	'Act_Print.address=dir
	'StartActivity(Act_Print)

End Sub

Sub PrintBlutooth
	Dim dir As String=File.DirRootExternal &"/Zomorod/pdf"
	Dim FileName As String="rptRizeFaktor-"&dateprint & ".pdf"
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

Sub PrintPos
	Dim i As Intent
	i.Initialize("com.dml.sima7.sepehr.activity.Intent_PrintFactorActivity", "")
	StartActivityForResult(i)
End Sub
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

Sub CreateFileProviderUri (Dir As String, FileName As String) As Object
	Dim FileProvider As JavaObject
	Dim context As JavaObject
	context.InitializeContext
	FileProvider.InitializeStatic("android.support.v4.content.FileProvider")
	Dim f As JavaObject
	f.InitializeNewInstance("java.io.File", Array(Dir, FileName))
	Return FileProvider.RunMethod("getUriForFile", Array(context, Application.PackageName & ".provider", f))
End Sub

private Sub Grid_CellClick(Col As Int,Row As Int)
	If MCode.NoeFaktorClick = "NoSend" Then
		PnlEdit.Visible=True
		PnlEdit.BringToFront
		MCode.AnimationOpen(PnlEdit)
		LoadPnlEdit(Row)
	End If
End Sub

Sub UpdateRadif
	Dim Radif As Int
	Dim Cu As Cursor = MCode.Result("Select FldCodeKala From TblFaktor Where FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
	For i=0 To Cu.RowCount-1
		Cu.Position=i
		Radif = i + 1
		MCode.SaveUpdate("Update TblFaktor Set FldRadif = '"& Radif &"' Where FldCodeKala = '"& Cu.GetString("FldCodeKala") &"'")
	Next
End Sub

Sub MohasebeMablaghFaktor
	Dim Dttb As Cursor = MCode.Result("Select FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTedadDarKarton,Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As FldFeeForoosh From TblFaktor Where FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
	Dim Sum,A As Double
	Dim TedadDarSabadJoz,TedadDarSabadKol,TedadDarKarton,FeeForoosh As Double
	For i=0 To Dttb.RowCount - 1
		Dttb.Position=i
		If Dttb.GetString("FldTedadDarSabadJoz") = "" Then
			TedadDarSabadJoz = 0
		Else
			TedadDarSabadJoz = Dttb.GetString("FldTedadDarSabadJoz")
		End If
		If Dttb.GetString("FldTedadDarSabadKol") = "" Then
			TedadDarSabadKol = 0
		Else
			TedadDarSabadKol = Dttb.GetString("FldTedadDarSabadKol")
		End If
		If Dttb.GetString("FldTedadDarKarton") = "" Then
			TedadDarKarton = 0
		Else
			TedadDarKarton = Dttb.GetString("FldTedadDarKarton")
		End If
		If Dttb.GetInt("FldFeeForoosh") = 0 Then
			FeeForoosh = 0
		Else
			FeeForoosh = MCode.RemoveqomaAshar(Dttb.GetInt("FldFeeForoosh"))
		End If
		A = (TedadDarSabadJoz + (TedadDarSabadKol * TedadDarKarton)) * FeeForoosh
		Sum = Sum + A
	Next
	LblMablaghKol.Text = NumberFormat(Sum,0,3) & " " & MCode.VahedPool
	MablaghKol=Sum
End Sub

Sub UpdateFee(Code As String)
	Dim Dt As Cursor = MCode.Result("Select FldCode From TblTasvie")
	Dim DtFee As Cursor
	Dim DtKala As Cursor
	Dt.Position = Code
	Dim CodeTasvie  As String = Dt.GetString("FldCode")
	AcSpLblVaziatPardakht.Tag=CodeTasvie
	Dt = MCode.Result("Select * From TblFaktor Where FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
	For i=0 To Dt.RowCount -1
		Dt.Position=i
		DtFee=MCode.Result("Select FldCodeKala,FldCodeTasvie,Round(FldFee,'"& MCode.RaghamAshar &"') As FldFee From TblFee Where FldCodeTasvie = '"& CodeTasvie &"' And FldCodeKala = '"& Dt.GetString("FldCodeKala") &"'")
		DtFee.Position=0
		If DtFee.RowCount>0 Then
			MCode.SaveUpdate("Update TblFaktor Set FldFeeForoosh = '"& DtFee.GetString("FldFee") &"' Where FldCodeKala = '"& Dt.GetString("FldCodeKala") &"' And FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
		Else
			DtKala = MCode.Result("Select Round(fldFeeForoosh,'"& MCode.RaghamAshar &"') As fldFeeForoosh From TblKala Where fldCodekala = '"& Dt.GetString("FldCodeKala") &"'")
			DtKala.Position=0
			MCode.SaveUpdate("Update TblFaktor Set FldFeeForoosh = "& DtKala.GetInt("FldFeeForoosh") &" Where FldCodeKala = '"& Dt.GetString("FldCodeKala") &"' And FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
		End If
	Next
	MCode.SaveUpdate("Update TblFaktor Set FldVaziatPArdakht = '"& CodeTasvie &"' Where FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
	Grid
End Sub

Sub AcSpLblVaziatPardakht_ItemClick (Position As Int, Value As Object)
	If Value <> "" Then
		Dim Result As Int
		Result = Msgbox2("آیا قیمت ها متناسب با وضعیت پرداخت اعمال گردد ؟","","بله","","خیر",Null)
		If Result=DialogResponse.POSITIVE Then
			LblVaziatPardakhti.Text=Value
			UpdateFee(Position)
		End If
	End If
End Sub

Sub LoadPage
	Dim Dt As Cursor
	Dim CodeTasvie As String
	Dim Index As Int
	Dt= MCode.Result("Select FldVaziatPardakht,FldN_Tafzili,FldC_Tafzili,FldTozih From TblFaktor Where FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
	Dt.Position=0
	CodeTasvie = Dt.GetString("FldVaziatPardakht")
	LblNameKharidar.Text ="آقای/خانم  " & Dt.GetString("FldN_Tafzili")
	LblNameKharidar.Tag = Dt.GetString("FldC_Tafzili")
	LblTitle.Text = "فاکتور:  " & MCode.ShomareFaktor
	TxtTozih.Text=Dt.GetString("FldTozih")
	Dt= MCode.Result("Select FldCode,FldName From TblTasvie")
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		AcSpLblVaziatPardakht.Add(Dt.GetString("FldName"))
		If Dt.GetString("FldCode") = CodeTasvie Then
			LblVaziatPardakhti.Text=Dt.GetString("FldName")
			Index=i
		End If
	Next
	AcSpLblVaziatPardakht.SelectedIndex = Index
	If MCode.NoeFaktorClick = "Send" Then
		AcSpLblVaziatPardakht.Enabled=False
		TxtTozih.Enabled=False
		AcBtnSaveTozih.Enabled=False
	End If
	If File.Exists(File.DirInternal, "sign.png") Then
		File.Delete(File.DirInternal, "sign.png")
	End If
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		If PnlEdit.Visible=True Then
			PnlEdit.Visible=False
			MCode.AnimationClose(PnlEdit)
			Return True
		Else
			Activity.Finish
			MCode.SetAnimation("zoom_enter2", "zoom_exit2")
		End If
	End If
	Return True
End Sub

Sub LoadPnlEdit(Row As String)
	MTxtTedadSabadJoz.Typeface=MCode.Font
	MTxtTedadSabadKol.Typeface=MCode.Font
	ItemEntekhab.CodeKala= Table1.GetValue(7,Row)
	ItemEntekhab.NameVahed2=Table1.GetValue(6,Row)
	MTxtTedadSabadJoz.Text = Table1.GetValue(3,Row)
	MTxtTedadSabadKol.Text = Table1.GetValue(5,Row)
	If ItemEntekhab.NameVahed2 = "" Then
		AcBtnDownKol.Enabled=False
		AcBtnUpkol.Enabled=False
		MTxtTedadSabadKol.Enabled=False
	Else
		AcBtnDownKol.Enabled=True
		AcBtnUpkol.Enabled=True
		MTxtTedadSabadKol.Enabled=True
	End If
End Sub

Sub AcBtnEdit_Click
	Dim Result As Int
	If MTxtTedadSabadJoz.Text > 0 Or MTxtTedadSabadKol.Text > 0 Then
		MCode.SaveUpdate("Update TblFaktor Set FldTedadDarSabadJoz = '"& MTxtTedadSabadJoz.text &"' , FldTedadDarSabadKol = '"& MTxtTedadSabadKol.Text &"' Where FldShomareFaktor = '"& MCode.ShomareFaktor &"' And FldCodeKala = '"& ItemEntekhab.CodeKala &"'")
	Else
		Result=Msgbox2("آیا می خواهید ردیف مورد نظر حذف گردد؟","توجه","بله","","خیر",Null)
		If Result=DialogResponse.POSITIVE Then
			MCode.SaveUpdate("Delete From TblFaktor Where FldShomareFaktor = '"& MCode.ShomareFaktor &"' And FldCodeKala = '"& ItemEntekhab.CodeKala &"'")
			UpdateRadif
		End If
	End If
	Grid
	PnlEdit.Visible=False
	MCode.AnimationClose(PnlEdit)
End Sub

Sub AcBtnUpkol_Click
	Dim A As Int = 0
	A = MTxtTedadSabadKol.Text
	A = A + 1
	MTxtTedadSabadKol.Text = A
End Sub

Sub AcBtnDownKol_Click
	Dim A As Int = 0
	A = MTxtTedadSabadKol.Text
	If A > 0 Then
		A = A - 1
		MTxtTedadSabadKol.Text = A
	End If
End Sub

Sub AcBtnUpJoz_Click
	Dim A As Int = 0
	A = MTxtTedadSabadJoz.Text
	A = A + 1
	MTxtTedadSabadJoz.Text = A
End Sub

Sub AcBtnDownJoz_Click
	Dim A As Int = 0
	A = MTxtTedadSabadJoz.Text
	If A > 0 Then
		A = A - 1
		MTxtTedadSabadJoz.Text = A
	End If
End Sub

Sub PnlEdit_Click
	
End Sub

Sub AcBtnSaveTozih_Click
	MCode.SaveUpdate("Update TblFaktor Set FldTozih = '"& TxtTozih.Text &"' Where FldShomareFaktor = '"& MCode.ShomareFaktor &"'")
	ToastMessageShow("توضیح فاکتور اصلاح گردید",True)
End Sub

Sub btnSign_Click
	StartActivity(Act_Signature)
End Sub