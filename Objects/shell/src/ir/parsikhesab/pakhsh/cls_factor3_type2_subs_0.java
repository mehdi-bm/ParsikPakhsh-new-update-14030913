package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_factor3_type2_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private p As Panel";
cls_factor3_type2._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_factor3_type2._p);
 //BA.debugLineNum = 4;BA.debugLine="Private pnl_bk As Panel";
cls_factor3_type2._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_factor3_type2._pnl_bk);
 //BA.debugLineNum = 7;BA.debugLine="Private imgSign As ImageView";
cls_factor3_type2._imgsign = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgsign",cls_factor3_type2._imgsign);
 //BA.debugLineNum = 8;BA.debugLine="Private lblSumFaktor As Label";
cls_factor3_type2._lblsumfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsumfaktor",cls_factor3_type2._lblsumfaktor);
 //BA.debugLineNum = 9;BA.debugLine="Private lblSumPardakht As Label";
cls_factor3_type2._lblsumpardakht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsumpardakht",cls_factor3_type2._lblsumpardakht);
 //BA.debugLineNum = 10;BA.debugLine="Private lblTozihat As Label";
cls_factor3_type2._lbltozihat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltozihat",cls_factor3_type2._lbltozihat);
 //BA.debugLineNum = 11;BA.debugLine="Private lblSignS As Label";
cls_factor3_type2._lblsigns = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsigns",cls_factor3_type2._lblsigns);
 //BA.debugLineNum = 12;BA.debugLine="Private lblSumKolTakhfif As Label";
cls_factor3_type2._lblsumkoltakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsumkoltakhfif",cls_factor3_type2._lblsumkoltakhfif);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_factor3_type2) ","cls_factor3_type2",57,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_factor3_type2","getheight", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("getLeft (cls_factor3_type2) ","cls_factor3_type2",57,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("getleft")) { return __ref.runUserSub(false, "cls_factor3_type2","getleft", __ref);}
 BA.debugLineNum = 61;BA.debugLine="Public Sub getLeft As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Return pnl_bk.Left";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getLeft");
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("getPanel (cls_factor3_type2) ","cls_factor3_type2",57,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_factor3_type2","getpanel", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(32768);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 49;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(65536);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("getTop (cls_factor3_type2) ","cls_factor3_type2",57,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("gettop")) { return __ref.runUserSub(false, "cls_factor3_type2","gettop", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Public Sub getTop As Int";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Return pnl_bk.Top";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getTop");
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("getWidth (cls_factor3_type2) ","cls_factor3_type2",57,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_factor3_type2","getwidth", __ref);}
 BA.debugLineNum = 52;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Return pnl_bk.Width";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth");
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _sumfaktor,RemoteObject _sumpardakht,RemoteObject _vaziatpardakht,RemoteObject _sumkhales,RemoteObject _sumtakhfifkala,RemoteObject _sumtahkfifvizhe,RemoteObject _sumkoltakhfif,RemoteObject _tozihat,RemoteObject _signaturebitmapstring) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_factor3_type2) ","cls_factor3_type2",57,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_factor3_type2","initialize", __ref, _ba, _sumfaktor, _sumpardakht, _vaziatpardakht, _sumkhales, _sumtakhfifkala, _sumtahkfifvizhe, _sumkoltakhfif, _tozihat, _signaturebitmapstring);}
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
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(sumFaktor,sumPardakht,Vaziat";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 18;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(131072);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_factor3_type2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_factor3_type2.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 19;BA.debugLine="p.LoadLayout(\"l_faktor3_type2\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_faktor3_type2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="lblSumFaktor.Text=sumFaktor";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblsumfaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sumfaktor));
 BA.debugLineNum = 21;BA.debugLine="lblSumPardakht.Text=sumPardakht";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblsumpardakht" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sumpardakht));
 BA.debugLineNum = 22;BA.debugLine="lblSumKolTakhfif.Text=SumKolTakhfif";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblsumkoltakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sumkoltakhfif));
 BA.debugLineNum = 23;BA.debugLine="lblTozihat.Text=Tozihat";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbltozihat" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tozihat));
 BA.debugLineNum = 29;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 31;BA.debugLine="Log(\"FldSignatureBitmapString: \" & SignatureBitm";
Debug.ShouldStop(1073741824);
cls_factor3_type2.__c.runVoidMethod ("LogImpl","587818255",RemoteObject.concat(RemoteObject.createImmutable("FldSignatureBitmapString: "),_signaturebitmapstring),0);
 BA.debugLineNum = 32;BA.debugLine="Log(SignatureBitmapString)";
Debug.ShouldStop(-2147483648);
cls_factor3_type2.__c.runVoidMethod ("LogImpl","587818256",_signaturebitmapstring,0);
 BA.debugLineNum = 33;BA.debugLine="Log(SignatureBitmapString.Length)";
Debug.ShouldStop(1);
cls_factor3_type2.__c.runVoidMethod ("LogImpl","587818257",BA.NumberToString(_signaturebitmapstring.runMethod(true,"length")),0);
 BA.debugLineNum = 35;BA.debugLine="Dim str2 As String=MCode.Decrypted(SignatureBitm";
Debug.ShouldStop(4);
_str2 = cls_factor3_type2._mcode.runMethod(true,"_decrypted" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_signaturebitmapstring));Debug.locals.put("str2", _str2);Debug.locals.put("str2", _str2);
 BA.debugLineNum = 36;BA.debugLine="If SignatureBitmapString<>\"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",_signaturebitmapstring,BA.ObjectToString(""))) { 
 BA.debugLineNum = 38;BA.debugLine="imgSign.Bitmap=ReadBlob(str2.Trim)";
Debug.ShouldStop(32);
__ref.getField(false,"_imgsign" /*RemoteObject*/ ).runMethod(false,"setBitmap",(__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_factor3_type2.class, "_readblob" /*RemoteObject*/ ,(Object)(_str2.runMethod(true,"trim"))).getObject()));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 41;BA.debugLine="lblSignS.Text=\"\"";
Debug.ShouldStop(256);
__ref.getField(false,"_lblsigns" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 42;BA.debugLine="imgSign.Visible=True";
Debug.ShouldStop(512);
__ref.getField(false,"_imgsign" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_factor3_type2.__c.getField(true,"True"));
 BA.debugLineNum = 43;BA.debugLine="Log(\"error emza....\")";
Debug.ShouldStop(1024);
cls_factor3_type2.__c.runVoidMethod ("LogImpl","587818267",RemoteObject.createImmutable("error emza...."),0);
 };
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ReadBlob (cls_factor3_type2) ","cls_factor3_type2",57,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("readblob")) { return __ref.runUserSub(false, "cls_factor3_type2","readblob", __ref, _emza);}
RemoteObject _buffer = null;
RemoteObject _inputstream1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bitmap1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("emza", _emza);
 BA.debugLineNum = 65;BA.debugLine="Sub ReadBlob(emza As String) As Bitmap";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="Dim Buffer() As Byte 'declare an empty byte array";
Debug.ShouldStop(4);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 68;BA.debugLine="Buffer=MCode.Su.DecodeBase64(emza)";
Debug.ShouldStop(8);
_buffer = cls_factor3_type2._mcode._su /*RemoteObject*/ .runMethod(false,"DecodeBase64",(Object)(_emza));Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 70;BA.debugLine="Dim InputStream1 As InputStream";
Debug.ShouldStop(32);
_inputstream1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("InputStream1", _inputstream1);
 BA.debugLineNum = 71;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer, 0,";
Debug.ShouldStop(64);
_inputstream1.runVoidMethod ("InitializeFromBytesArray",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")));
 BA.debugLineNum = 73;BA.debugLine="Dim Bitmap1 As Bitmap";
Debug.ShouldStop(256);
_bitmap1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("Bitmap1", _bitmap1);
 BA.debugLineNum = 74;BA.debugLine="Bitmap1.Initialize2(InputStream1)";
Debug.ShouldStop(512);
_bitmap1.runVoidMethod ("Initialize2",(Object)((_inputstream1.getObject())));
 BA.debugLineNum = 76;BA.debugLine="InputStream1.Close";
Debug.ShouldStop(2048);
_inputstream1.runVoidMethod ("Close");
 BA.debugLineNum = 78;BA.debugLine="Return Bitmap1";
Debug.ShouldStop(8192);
if (true) return _bitmap1;
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}