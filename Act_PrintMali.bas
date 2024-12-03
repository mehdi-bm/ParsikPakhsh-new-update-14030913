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
	Dim Pardakhti As String
	Dim cu As Cursor
End Sub

Sub Globals
	Private ion As Object
	Private clv1 As CustomListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_PrintPic")

End Sub

Sub Activity_Resume
	clv1.Clear
	CreateReport
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub LblShare_Click
	Dim filename As String=MCode.ShomareSabt & ".jpg"
	
	'Dim bmp As B4XBitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
	Dim bmp As Bitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
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

Sub LblPrint_Click
	Dim filename As String=MCode.ShomareSabt & ".jpg"
	
	Dim bmp As Bitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
	'Dim bmp As B4XBitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
	Dim out As OutputStream
	out = File.OpenOutput(File.DirDefaultExternal, filename , False)
	bmp.WriteToStream(out, 90, "JPEG")
	out.Close

	If File.Exists(File.DirDefaultExternal,"print_sepehr")=False Then
		File.MakeDir(File.DirDefaultExternal,"print_sepehr")
	End If
	Dim filename As String=MCode.ShomareSabt & ".jpg"
	File.Copy(File.DirDefaultExternal,filename,File.DirDefaultExternal,"print_sepehr/factor.jpg")
	
	Dim isPos As Int = myCode.getSetting("setting.dat","isPos",0)
	Select Case isPos
		Case 1
			PrintPos
		Case 0
			PrintBlutooth
	End Select
End Sub

Sub PrintPos
	Dim i As Intent
	i.Initialize("com.dml.sima7.sepehr.activity.Intent_PrintFactorActivity", "")
	StartActivityForResult(i)
End Sub

Sub PrintBlutooth
'	Dim Pdf As PdfDocument
'	Dim info As PageInfo
'	Dim r As Rect
'	Dim Bitmap1 As Bitmap = LoadBitmap(File.DirDefaultExternal & "/print_sepehr", "factor.jpg")
'	Dim SignatureRect As Rect
'	Log(Bitmap1.Height)
'	'Pdf.Initialize("Pdf")
'	r.Initialize(0,0,140,200)
'	info.Initialize(140,200,1,r)
'	'Dim p As Page = Pdf.startPage(info)
'	SignatureRect.Initialize(0,0,140,200)
'	
'	'p.Canvas.DrawBitmap(Bitmap1, Null, SignatureRect)
'	'Pdf.finishPage(p)
'	
'	Dim out As OutputStream = File.OpenOutput(File.DirDefaultExternal & "/print_sepehr", "factor.pdf", False)
'	'Pdf.Writeto2(out)
'	out.Close
'	Pdf.Close
'	ToastMessageShow("فاکتور شما جهت چاپ ایجاد گردید",True)
'
'	Dim i As Intent
'	i.Initialize(i.ACTION_VIEW, "file://" & File.DirDefaultExternal & "/print_sepehr/factor.pdf")
'	i.SetType("application/pdf")
'	StartActivity(i)
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
Sub CreateReport
	Dim Cu1 As Cursor = MCode.Result("Select * From TblAshkhas Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
	Cu1.Position=0
	Dim pd As PersianDate
	Dim Date As String= pd.getDate(0,0,0,"/")
	Dim nameMoshtari As String = Cu1.GetString("fldSharheTafzili")
	Dim Address As String = Cu1.GetString("fldAdress")
	Dim Tell As String = myCode.Is_Null(Cu1.GetString("fldTell")) & " | " & myCode.Is_Null(Cu1.GetString("FldMobile"))

	'Top Sheet=========================================================
	
		Dim rec1 As cls_PrintMali
		rec1.Initialize(Date,nameMoshtari,Address,Tell,Pardakhti,cu)
		clv1.Add(rec1.Panel,0)
		'clv1.ResizeItem(0,rec1.Height)


	Dim filename As String=MCode.ShomareSabt & ".jpg"
	Dim bmp As Bitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
	Dim B As B4XBitmap = bmp.Resize(bmp.Width/2,bmp.Height/2,True)
	'Dim bmp As B4XBitmap = clv1.sv.ScrollViewInnerPanel.Snapshot
	Dim out As OutputStream
	out = File.OpenOutput(File.DirDefaultExternal, filename , False)
	b.WriteToStream(out, 90, "JPEG")
	out.Close

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
#End If

Sub btn_Back_Click
	Activity.Finish
End Sub
