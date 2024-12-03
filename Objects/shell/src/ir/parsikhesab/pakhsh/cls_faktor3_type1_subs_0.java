package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_faktor3_type1_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private p As Panel";
cls_faktor3_type1._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_faktor3_type1._p);
 //BA.debugLineNum = 4;BA.debugLine="Private pnl_bk As Panel";
cls_faktor3_type1._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_faktor3_type1._pnl_bk);
 //BA.debugLineNum = 7;BA.debugLine="Private imgSign As ImageView";
cls_faktor3_type1._imgsign = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgsign",cls_faktor3_type1._imgsign);
 //BA.debugLineNum = 8;BA.debugLine="Private lblSumFaktor As Label";
cls_faktor3_type1._lblsumfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsumfaktor",cls_faktor3_type1._lblsumfaktor);
 //BA.debugLineNum = 9;BA.debugLine="Private lblSumPardakht As Label";
cls_faktor3_type1._lblsumpardakht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsumpardakht",cls_faktor3_type1._lblsumpardakht);
 //BA.debugLineNum = 10;BA.debugLine="Private lblTozihat As Label";
cls_faktor3_type1._lbltozihat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltozihat",cls_faktor3_type1._lbltozihat);
 //BA.debugLineNum = 11;BA.debugLine="Private lblVaziatPardakht As Label";
cls_faktor3_type1._lblvaziatpardakht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvaziatpardakht",cls_faktor3_type1._lblvaziatpardakht);
 //BA.debugLineNum = 12;BA.debugLine="Private lblSignS As Label";
cls_faktor3_type1._lblsigns = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsigns",cls_faktor3_type1._lblsigns);
 //BA.debugLineNum = 13;BA.debugLine="Private lblSumKhales As Label";
cls_faktor3_type1._lblsumkhales = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsumkhales",cls_faktor3_type1._lblsumkhales);
 //BA.debugLineNum = 14;BA.debugLine="Private lblSumTakhfifKala As Label";
cls_faktor3_type1._lblsumtakhfifkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsumtakhfifkala",cls_faktor3_type1._lblsumtakhfifkala);
 //BA.debugLineNum = 15;BA.debugLine="Private lblSumTahkfifVizhe As Label";
cls_faktor3_type1._lblsumtahkfifvizhe = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsumtahkfifvizhe",cls_faktor3_type1._lblsumtahkfifvizhe);
 //BA.debugLineNum = 16;BA.debugLine="Private lblSumKolTakhfif As Label";
cls_faktor3_type1._lblsumkoltakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsumkoltakhfif",cls_faktor3_type1._lblsumkoltakhfif);
 //BA.debugLineNum = 17;BA.debugLine="Private lblDarsadArzeshAfzode As Label";
cls_faktor3_type1._lbldarsadarzeshafzode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldarsadarzeshafzode",cls_faktor3_type1._lbldarsadarzeshafzode);
 //BA.debugLineNum = 18;BA.debugLine="Private lblArzeshAfzode As Label";
cls_faktor3_type1._lblarzeshafzode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblarzeshafzode",cls_faktor3_type1._lblarzeshafzode);
 //BA.debugLineNum = 19;BA.debugLine="Private lblMandeGhabl As Label";
cls_faktor3_type1._lblmandeghabl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmandeghabl",cls_faktor3_type1._lblmandeghabl);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_faktor3_type1) ","cls_faktor3_type1",66,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_faktor3_type1","getheight", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeft (cls_faktor3_type1) ","cls_faktor3_type1",66,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("getleft")) { return __ref.runUserSub(false, "cls_faktor3_type1","getleft", __ref);}
 BA.debugLineNum = 75;BA.debugLine="Public Sub getLeft As Int";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Return pnl_bk.Left";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getLeft");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPanel (cls_faktor3_type1) ","cls_faktor3_type1",66,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_faktor3_type1","getpanel", __ref);}
 BA.debugLineNum = 61;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 63;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTop (cls_faktor3_type1) ","cls_faktor3_type1",66,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("gettop")) { return __ref.runUserSub(false, "cls_faktor3_type1","gettop", __ref);}
 BA.debugLineNum = 72;BA.debugLine="Public Sub getTop As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Return pnl_bk.Top";
Debug.ShouldStop(256);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getTop");
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWidth (cls_faktor3_type1) ","cls_faktor3_type1",66,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_faktor3_type1","getwidth", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Return pnl_bk.Width";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth");
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _sumfaktor,RemoteObject _sumpardakht,RemoteObject _vaziatpardakht,RemoteObject _sumkhales,RemoteObject _sumtakhfifkala,RemoteObject _sumtahkfifvizhe,RemoteObject _sumkoltakhfif,RemoteObject _tozihat,RemoteObject _signaturebitmapstring,RemoteObject _darsadarzeshafzode,RemoteObject _arzeshafzode,RemoteObject _summandeazghabl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_faktor3_type1) ","cls_faktor3_type1",66,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_faktor3_type1","initialize", __ref, _ba, _sumfaktor, _sumpardakht, _vaziatpardakht, _sumkhales, _sumtakhfifkala, _sumtahkfifvizhe, _sumkoltakhfif, _tozihat, _signaturebitmapstring, _darsadarzeshafzode, _arzeshafzode, _summandeazghabl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _str2 = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("sumFaktor", _sumfaktor);
Debug.locals.put("sumPardakht", _sumpardakht);
Debug.locals.put("VaziatPardakht", _vaziatpardakht);
Debug.locals.put("SumKhales", _sumkhales);
Debug.locals.put("SumTakhfifKala", _sumtakhfifkala);
Debug.locals.put("SumTahkfifVizhe", _sumtahkfifvizhe);
Debug.locals.put("SumKolTakhfif", _sumkoltakhfif);
Debug.locals.put("Tozihat", _tozihat);
Debug.locals.put("SignatureBitmapString", _signaturebitmapstring);
Debug.locals.put("DarsadArzeshAfzode", _darsadarzeshafzode);
Debug.locals.put("ArzeshAfzode", _arzeshafzode);
Debug.locals.put("sumMandeAzGhabl", _summandeazghabl);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize(sumFaktor,sumPardakht,Vaziat";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 25;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_faktor3_type1.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_faktor3_type1.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 26;BA.debugLine="p.LoadLayout(\"l_faktor3_type1\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_faktor3_type1")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="lblSumFaktor.Text=sumFaktor";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblsumfaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sumfaktor));
 BA.debugLineNum = 28;BA.debugLine="lblSumPardakht.Text=sumPardakht";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblsumpardakht" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sumpardakht));
 BA.debugLineNum = 29;BA.debugLine="lblVaziatPardakht.Text=VaziatPardakht";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblvaziatpardakht" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_vaziatpardakht));
 BA.debugLineNum = 30;BA.debugLine="lblSumKhales.Text=SumKhales";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblsumkhales" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sumkhales));
 BA.debugLineNum = 31;BA.debugLine="lblSumTakhfifKala.Text=SumTakhfifKala";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblsumtakhfifkala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sumtakhfifkala));
 BA.debugLineNum = 32;BA.debugLine="lblSumTahkfifVizhe.Text=SumTahkfifVizhe";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblsumtahkfifvizhe" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sumtahkfifvizhe));
 BA.debugLineNum = 33;BA.debugLine="lblSumKolTakhfif.Text=SumKolTakhfif";
Debug.ShouldStop(1);
__ref.getField(false,"_lblsumkoltakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sumkoltakhfif));
 BA.debugLineNum = 34;BA.debugLine="lblDarsadArzeshAfzode.Text=DarsadArzeshAfzode";
Debug.ShouldStop(2);
__ref.getField(false,"_lbldarsadarzeshafzode" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_darsadarzeshafzode));
 BA.debugLineNum = 35;BA.debugLine="lblArzeshAfzode.Text=ArzeshAfzode";
Debug.ShouldStop(4);
__ref.getField(false,"_lblarzeshafzode" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_arzeshafzode));
 BA.debugLineNum = 36;BA.debugLine="lblTozihat.Text=Tozihat";
Debug.ShouldStop(8);
__ref.getField(false,"_lbltozihat" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tozihat));
 BA.debugLineNum = 37;BA.debugLine="lblMandeGhabl.Text=sumMandeAzGhabl";
Debug.ShouldStop(16);
__ref.getField(false,"_lblmandeghabl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_summandeazghabl));
 BA.debugLineNum = 43;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 45;BA.debugLine="Log(\"FldSignatureBitmapString: \" & SignatureBitm";
Debug.ShouldStop(4096);
cls_faktor3_type1.__c.runVoidMethod ("LogImpl","592143638",RemoteObject.concat(RemoteObject.createImmutable("FldSignatureBitmapString: "),_signaturebitmapstring),0);
 BA.debugLineNum = 46;BA.debugLine="Log(SignatureBitmapString)";
Debug.ShouldStop(8192);
cls_faktor3_type1.__c.runVoidMethod ("LogImpl","592143639",_signaturebitmapstring,0);
 BA.debugLineNum = 47;BA.debugLine="Log(SignatureBitmapString.Length)";
Debug.ShouldStop(16384);
cls_faktor3_type1.__c.runVoidMethod ("LogImpl","592143640",BA.NumberToString(_signaturebitmapstring.runMethod(true,"length")),0);
 BA.debugLineNum = 49;BA.debugLine="Dim str2 As String=MCode.Decrypted(SignatureBitm";
Debug.ShouldStop(65536);
_str2 = cls_faktor3_type1._mcode.runMethod(true,"_decrypted" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_signaturebitmapstring));Debug.locals.put("str2", _str2);Debug.locals.put("str2", _str2);
 BA.debugLineNum = 50;BA.debugLine="If SignatureBitmapString<>\"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_signaturebitmapstring,BA.ObjectToString(""))) { 
 BA.debugLineNum = 52;BA.debugLine="imgSign.Bitmap=ReadBlob(str2.Trim)";
Debug.ShouldStop(524288);
__ref.getField(false,"_imgsign" /*RemoteObject*/ ).runMethod(false,"setBitmap",(__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor3_type1.class, "_readblob" /*RemoteObject*/ ,(Object)(_str2.runMethod(true,"trim"))).getObject()));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e24.toString()); BA.debugLineNum = 55;BA.debugLine="lblSignS.Text=\"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblsigns" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 56;BA.debugLine="imgSign.Visible=True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_imgsign" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_faktor3_type1.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="Log(\"error emza....\")";
Debug.ShouldStop(16777216);
cls_faktor3_type1.__c.runVoidMethod ("LogImpl","592143650",RemoteObject.createImmutable("error emza...."),0);
 };
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readblob(RemoteObject __ref,RemoteObject _emza) throws Exception{
try {
		Debug.PushSubsStack("ReadBlob (cls_faktor3_type1) ","cls_faktor3_type1",66,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("readblob")) { return __ref.runUserSub(false, "cls_faktor3_type1","readblob", __ref, _emza);}
RemoteObject _buffer = null;
RemoteObject _inputstream1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bitmap1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("emza", _emza);
 BA.debugLineNum = 79;BA.debugLine="Sub ReadBlob(emza As String) As Bitmap";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="Dim Buffer() As Byte 'declare an empty byte array";
Debug.ShouldStop(65536);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 82;BA.debugLine="Buffer=MCode.Su.DecodeBase64(emza)";
Debug.ShouldStop(131072);
_buffer = cls_faktor3_type1._mcode._su /*RemoteObject*/ .runMethod(false,"DecodeBase64",(Object)(_emza));Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 84;BA.debugLine="Dim InputStream1 As InputStream";
Debug.ShouldStop(524288);
_inputstream1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("InputStream1", _inputstream1);
 BA.debugLineNum = 85;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer, 0,";
Debug.ShouldStop(1048576);
_inputstream1.runVoidMethod ("InitializeFromBytesArray",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")));
 BA.debugLineNum = 87;BA.debugLine="Dim Bitmap1 As Bitmap";
Debug.ShouldStop(4194304);
_bitmap1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("Bitmap1", _bitmap1);
 BA.debugLineNum = 88;BA.debugLine="Bitmap1.Initialize2(InputStream1)";
Debug.ShouldStop(8388608);
_bitmap1.runVoidMethod ("Initialize2",(Object)((_inputstream1.getObject())));
 BA.debugLineNum = 90;BA.debugLine="InputStream1.Close";
Debug.ShouldStop(33554432);
_inputstream1.runVoidMethod ("Close");
 BA.debugLineNum = 92;BA.debugLine="Return Bitmap1";
Debug.ShouldStop(134217728);
if (true) return _bitmap1;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}