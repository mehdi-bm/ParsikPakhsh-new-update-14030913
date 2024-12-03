package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_faktor3_havale_type2_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private p As Panel";
cls_faktor3_havale_type2._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_faktor3_havale_type2._p);
 //BA.debugLineNum = 4;BA.debugLine="Private pnl_bk As Panel";
cls_faktor3_havale_type2._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_faktor3_havale_type2._pnl_bk);
 //BA.debugLineNum = 6;BA.debugLine="Private imgSign As ImageView";
cls_faktor3_havale_type2._imgsign = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgsign",cls_faktor3_havale_type2._imgsign);
 //BA.debugLineNum = 7;BA.debugLine="Private lblTozihat As Label";
cls_faktor3_havale_type2._lbltozihat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltozihat",cls_faktor3_havale_type2._lbltozihat);
 //BA.debugLineNum = 8;BA.debugLine="Private lblSignS As Label";
cls_faktor3_havale_type2._lblsigns = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsigns",cls_faktor3_havale_type2._lblsigns);
 //BA.debugLineNum = 10;BA.debugLine="Private LblGHabelePardakht As Label";
cls_faktor3_havale_type2._lblghabelepardakht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblghabelepardakht",cls_faktor3_havale_type2._lblghabelepardakht);
 //BA.debugLineNum = 11;BA.debugLine="Private LblMablaghKhales As Label";
cls_faktor3_havale_type2._lblmablaghkhales = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghkhales",cls_faktor3_havale_type2._lblmablaghkhales);
 //BA.debugLineNum = 13;BA.debugLine="Private lblMandeTasfieNashode As Label";
cls_faktor3_havale_type2._lblmandetasfienashode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmandetasfienashode",cls_faktor3_havale_type2._lblmandetasfienashode);
 //BA.debugLineNum = 14;BA.debugLine="Private LblTakhfifKala As Label";
cls_faktor3_havale_type2._lbltakhfifkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltakhfifkala",cls_faktor3_havale_type2._lbltakhfifkala);
 //BA.debugLineNum = 15;BA.debugLine="Private LblTotalFaktor As Label";
cls_faktor3_havale_type2._lbltotalfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotalfaktor",cls_faktor3_havale_type2._lbltotalfaktor);
 //BA.debugLineNum = 17;BA.debugLine="Private lblMablagheKolDaryafti As Label";
cls_faktor3_havale_type2._lblmablaghekoldaryafti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghekoldaryafti",cls_faktor3_havale_type2._lblmablaghekoldaryafti);
 //BA.debugLineNum = 18;BA.debugLine="Private LblMablaghTakhfifDaryafti As Label";
cls_faktor3_havale_type2._lblmablaghtakhfifdaryafti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghtakhfifdaryafti",cls_faktor3_havale_type2._lblmablaghtakhfifdaryafti);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_faktor3_havale_type2) ","cls_faktor3_havale_type2",65,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_faktor3_havale_type2","getheight", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("getLeft (cls_faktor3_havale_type2) ","cls_faktor3_havale_type2",65,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("getleft")) { return __ref.runUserSub(false, "cls_faktor3_havale_type2","getleft", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Public Sub getLeft As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Return pnl_bk.Left";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getLeft");
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("getPanel (cls_faktor3_havale_type2) ","cls_faktor3_havale_type2",65,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_faktor3_havale_type2","getpanel", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 59;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("getTop (cls_faktor3_havale_type2) ","cls_faktor3_havale_type2",65,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("gettop")) { return __ref.runUserSub(false, "cls_faktor3_havale_type2","gettop", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub getTop As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Return pnl_bk.Top";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getTop");
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("getWidth (cls_faktor3_havale_type2) ","cls_faktor3_havale_type2",65,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_faktor3_havale_type2","getwidth", __ref);}
 BA.debugLineNum = 62;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Return pnl_bk.Width";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth");
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _ghabelepardakht,RemoteObject _mablaghkhales,RemoteObject _mablaghtakhfifdaryafti,RemoteObject _mandetasfienashode,RemoteObject _takhfifkala,RemoteObject _mablaghekoldaryafti,RemoteObject _totalfaktor,RemoteObject _tozihat,RemoteObject _signaturebitmapstring) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_faktor3_havale_type2) ","cls_faktor3_havale_type2",65,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_faktor3_havale_type2","initialize", __ref, _ba, _ghabelepardakht, _mablaghkhales, _mablaghtakhfifdaryafti, _mandetasfienashode, _takhfifkala, _mablaghekoldaryafti, _totalfaktor, _tozihat, _signaturebitmapstring);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _str2 = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("GHabelePardakht", _ghabelepardakht);
Debug.locals.put("MablaghKhales", _mablaghkhales);
Debug.locals.put("MablaghTakhfifDaryafti", _mablaghtakhfifdaryafti);
Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);
Debug.locals.put("TakhfifKala", _takhfifkala);
Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);
Debug.locals.put("TotalFaktor", _totalfaktor);
Debug.locals.put("Tozihat", _tozihat);
Debug.locals.put("SignatureBitmapString", _signaturebitmapstring);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize(GHabelePardakht,MablaghKhale";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_faktor3_havale_type2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_faktor3_havale_type2.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 25;BA.debugLine="p.LoadLayout(\"l_faktor3_havale_Type2\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_faktor3_havale_Type2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 26;BA.debugLine="LblGHabelePardakht.Text=GHabelePardakht";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblghabelepardakht" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_ghabelepardakht));
 BA.debugLineNum = 27;BA.debugLine="LblMablaghKhales.Text=MablaghKhales";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblmablaghkhales" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_mablaghkhales));
 BA.debugLineNum = 28;BA.debugLine="LblMablaghTakhfifDaryafti.Text=MablaghTakhfifDary";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblmablaghtakhfifdaryafti" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_mablaghtakhfifdaryafti));
 BA.debugLineNum = 29;BA.debugLine="lblMandeTasfieNashode.Text=MandeTasfieNashode";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblmandetasfienashode" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_mandetasfienashode));
 BA.debugLineNum = 30;BA.debugLine="LblTakhfifKala.Text=TakhfifKala";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbltakhfifkala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_takhfifkala));
 BA.debugLineNum = 31;BA.debugLine="LblTotalFaktor.Text=TotalFaktor";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbltotalfaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_totalfaktor));
 BA.debugLineNum = 32;BA.debugLine="lblMablagheKolDaryafti.Text=MablagheKolDaryafti";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblmablaghekoldaryafti" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_mablaghekoldaryafti));
 BA.debugLineNum = 33;BA.debugLine="lblTozihat.Text=Tozihat";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltozihat" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tozihat));
 BA.debugLineNum = 39;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 41;BA.debugLine="Log(\"FldSignatureBitmapString: \" & SignatureBitm";
Debug.ShouldStop(256);
cls_faktor3_havale_type2.__c.runVoidMethod ("LogImpl","591619347",RemoteObject.concat(RemoteObject.createImmutable("FldSignatureBitmapString: "),_signaturebitmapstring),0);
 BA.debugLineNum = 42;BA.debugLine="Log(SignatureBitmapString)";
Debug.ShouldStop(512);
cls_faktor3_havale_type2.__c.runVoidMethod ("LogImpl","591619348",_signaturebitmapstring,0);
 BA.debugLineNum = 43;BA.debugLine="Log(SignatureBitmapString.Length)";
Debug.ShouldStop(1024);
cls_faktor3_havale_type2.__c.runVoidMethod ("LogImpl","591619349",BA.NumberToString(_signaturebitmapstring.runMethod(true,"length")),0);
 BA.debugLineNum = 45;BA.debugLine="Dim str2 As String=MCode.Decrypted(SignatureBitm";
Debug.ShouldStop(4096);
_str2 = cls_faktor3_havale_type2._mcode.runMethod(true,"_decrypted" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_signaturebitmapstring));Debug.locals.put("str2", _str2);Debug.locals.put("str2", _str2);
 BA.debugLineNum = 46;BA.debugLine="If SignatureBitmapString<>\"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",_signaturebitmapstring,BA.ObjectToString(""))) { 
 BA.debugLineNum = 48;BA.debugLine="imgSign.Bitmap=ReadBlob(str2.Trim)";
Debug.ShouldStop(32768);
__ref.getField(false,"_imgsign" /*RemoteObject*/ ).runMethod(false,"setBitmap",(__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor3_havale_type2.class, "_readblob" /*RemoteObject*/ ,(Object)(_str2.runMethod(true,"trim"))).getObject()));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e21.toString()); BA.debugLineNum = 51;BA.debugLine="lblSignS.Text=\"\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblsigns" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 52;BA.debugLine="imgSign.Visible=True";
Debug.ShouldStop(524288);
__ref.getField(false,"_imgsign" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_faktor3_havale_type2.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="Log(\"error emza....\")";
Debug.ShouldStop(1048576);
cls_faktor3_havale_type2.__c.runVoidMethod ("LogImpl","591619359",RemoteObject.createImmutable("error emza...."),0);
 };
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("ReadBlob (cls_faktor3_havale_type2) ","cls_faktor3_havale_type2",65,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("readblob")) { return __ref.runUserSub(false, "cls_faktor3_havale_type2","readblob", __ref, _emza);}
RemoteObject _buffer = null;
RemoteObject _inputstream1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bitmap1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("emza", _emza);
 BA.debugLineNum = 75;BA.debugLine="Sub ReadBlob(emza As String) As Bitmap";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="Dim Buffer() As Byte 'declare an empty byte array";
Debug.ShouldStop(4096);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 78;BA.debugLine="Buffer=MCode.Su.DecodeBase64(emza)";
Debug.ShouldStop(8192);
_buffer = cls_faktor3_havale_type2._mcode._su /*RemoteObject*/ .runMethod(false,"DecodeBase64",(Object)(_emza));Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 80;BA.debugLine="Dim InputStream1 As InputStream";
Debug.ShouldStop(32768);
_inputstream1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("InputStream1", _inputstream1);
 BA.debugLineNum = 81;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer, 0,";
Debug.ShouldStop(65536);
_inputstream1.runVoidMethod ("InitializeFromBytesArray",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")));
 BA.debugLineNum = 83;BA.debugLine="Dim Bitmap1 As Bitmap";
Debug.ShouldStop(262144);
_bitmap1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("Bitmap1", _bitmap1);
 BA.debugLineNum = 84;BA.debugLine="Bitmap1.Initialize2(InputStream1)";
Debug.ShouldStop(524288);
_bitmap1.runVoidMethod ("Initialize2",(Object)((_inputstream1.getObject())));
 BA.debugLineNum = 86;BA.debugLine="InputStream1.Close";
Debug.ShouldStop(2097152);
_inputstream1.runVoidMethod ("Close");
 BA.debugLineNum = 88;BA.debugLine="Return Bitmap1";
Debug.ShouldStop(8388608);
if (true) return _bitmap1;
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}