package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class base64encodedecodeimage_subs_0 {


public static RemoteObject  _base64anyfiletostring(RemoteObject _ba,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Base64AnyFileToString (base64encodedecodeimage) ","base64encodedecodeimage",109,_ba,base64encodedecodeimage.mostCurrent,36);
if (RapidSub.canDelegate("base64anyfiletostring")) { return ir.parsikhesab.pakhsh.base64encodedecodeimage.remoteMe.runUserSub(false, "base64encodedecodeimage","base64anyfiletostring", _ba, _dir, _filename);}
RemoteObject _convert = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 36;BA.debugLine="Sub Base64AnyFileToString(Dir As String, Filename";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="Dim convert As StringUtils";
Debug.JustUpdateDeviceLine();
_convert = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("convert", _convert);
 BA.debugLineNum = 39;BA.debugLine="Return convert.EncodeBase64(File.ReadBytes(Dir, F";
Debug.JustUpdateDeviceLine();
if (true) return _convert.runMethod(true,"EncodeBase64",(Object)(base64encodedecodeimage.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadBytes",(Object)(_dir),(Object)(_filename))));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base64imagetostring(RemoteObject _ba,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Base64ImageToString (base64encodedecodeimage) ","base64encodedecodeimage",109,_ba,base64encodedecodeimage.mostCurrent,29);
if (RapidSub.canDelegate("base64imagetostring")) { return ir.parsikhesab.pakhsh.base64encodedecodeimage.remoteMe.runUserSub(false, "base64encodedecodeimage","base64imagetostring", _ba, _dir, _filename);}
RemoteObject _convert = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 29;BA.debugLine="Sub Base64ImageToString(Dir As String, Filename As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="Dim convert As StringUtils";
Debug.JustUpdateDeviceLine();
_convert = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("convert", _convert);
 BA.debugLineNum = 32;BA.debugLine="Return convert.EncodeBase64(File.ReadBytes(Dir, F";
Debug.JustUpdateDeviceLine();
if (true) return _convert.runMethod(true,"EncodeBase64",(Object)(base64encodedecodeimage.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadBytes",(Object)(_dir),(Object)(_filename))));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base64imagetostring2(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Base64ImageToString2 (base64encodedecodeimage) ","base64encodedecodeimage",109,_ba,base64encodedecodeimage.mostCurrent,50);
if (RapidSub.canDelegate("base64imagetostring2")) { return ir.parsikhesab.pakhsh.base64encodedecodeimage.remoteMe.runUserSub(false, "base64encodedecodeimage","base64imagetostring2", _ba, _filename);}
RemoteObject _convert = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
;
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 50;BA.debugLine="Sub Base64ImageToString2(Filename As B4XBitmap) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="Dim convert As StringUtils";
Debug.JustUpdateDeviceLine();
_convert = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("convert", _convert);
 BA.debugLineNum = 52;BA.debugLine="Return convert.EncodeBase64(BitmapToBMP(Filename)";
Debug.JustUpdateDeviceLine();
if (true) return _convert.runMethod(true,"EncodeBase64",(Object)(_bitmaptobmp(_ba,_filename)));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base64stringtoanyfile(RemoteObject _ba,RemoteObject _s,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Base64StringToAnyFile (base64encodedecodeimage) ","base64encodedecodeimage",109,_ba,base64encodedecodeimage.mostCurrent,42);
if (RapidSub.canDelegate("base64stringtoanyfile")) { return ir.parsikhesab.pakhsh.base64encodedecodeimage.remoteMe.runUserSub(false, "base64encodedecodeimage","base64stringtoanyfile", _ba, _s, _dir, _filename);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _bytes = null;
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
;
Debug.locals.put("s", _s);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 42;BA.debugLine="Sub Base64StringToAnyFile(s As String, Dir As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="Dim su As StringUtils";
Debug.JustUpdateDeviceLine();
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 44;BA.debugLine="Dim bytes() As Byte = su.DecodeBase64(s)";
Debug.JustUpdateDeviceLine();
_bytes = _su.runMethod(false,"DecodeBase64",(Object)(_s));Debug.locals.put("bytes", _bytes);Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 45;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
Debug.JustUpdateDeviceLine();
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = base64encodedecodeimage.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dir),(Object)(_filename),(Object)(base64encodedecodeimage.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 46;BA.debugLine="out.WriteBytes(bytes, 0, bytes.Length)";
Debug.JustUpdateDeviceLine();
_out.runVoidMethod ("WriteBytes",(Object)(_bytes),(Object)(BA.numberCast(int.class, 0)),(Object)(_bytes.getField(true,"length")));
 BA.debugLineNum = 47;BA.debugLine="out.Close";
Debug.JustUpdateDeviceLine();
_out.runVoidMethod ("Close");
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base64stringtoimage(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("Base64StringToImage (base64encodedecodeimage) ","base64encodedecodeimage",109,_ba,base64encodedecodeimage.mostCurrent,9);
if (RapidSub.canDelegate("base64stringtoimage")) { return ir.parsikhesab.pakhsh.base64encodedecodeimage.remoteMe.runUserSub(false, "base64encodedecodeimage","base64stringtoimage", _ba, _s);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _bytes = null;
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
;
Debug.locals.put("s", _s);
 BA.debugLineNum = 9;BA.debugLine="Sub Base64StringToImage(s As String) As B4XBitmap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 10;BA.debugLine="Dim su As StringUtils";
Debug.JustUpdateDeviceLine();
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 11;BA.debugLine="Dim bytes() As Byte = su.DecodeBase64(s)";
Debug.JustUpdateDeviceLine();
_bytes = _su.runMethod(false,"DecodeBase64",(Object)(_s));Debug.locals.put("bytes", _bytes);Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 12;BA.debugLine="Dim In As InputStream";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 13;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
Debug.JustUpdateDeviceLine();
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_bytes),(Object)(BA.numberCast(int.class, 0)),(Object)(_bytes.getField(true,"length")));
 BA.debugLineNum = 15;BA.debugLine="Dim bmp As Bitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 16;BA.debugLine="bmp.Initialize2(In)";
Debug.JustUpdateDeviceLine();
_bmp.runVoidMethod ("Initialize2",(Object)((_in.getObject())));
 BA.debugLineNum = 17;BA.debugLine="In.Close";
Debug.JustUpdateDeviceLine();
_in.runVoidMethod ("Close");
 BA.debugLineNum = 18;BA.debugLine="Return bmp";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _bmp.getObject());
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bitmaptobmp(RemoteObject _ba,RemoteObject _img) throws Exception{
try {
		Debug.PushSubsStack("BitmapToBMP (base64encodedecodeimage) ","base64encodedecodeimage",109,_ba,base64encodedecodeimage.mostCurrent,55);
if (RapidSub.canDelegate("bitmaptobmp")) { return ir.parsikhesab.pakhsh.base64encodedecodeimage.remoteMe.runUserSub(false, "base64encodedecodeimage","bitmaptobmp", _ba, _img);}
RemoteObject _larg = RemoteObject.createImmutable(0);
RemoteObject _padding1 = RemoteObject.createImmutable(0);
RemoteObject _headersize = RemoteObject.createImmutable(0);
RemoteObject _offset = RemoteObject.createImmutable(0);
RemoteObject _size = RemoteObject.createImmutable(0);
RemoteObject _raf = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
RemoteObject _buffer = null;
RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _a = RemoteObject.declareNull("b4a.example.bitmapcreator._argbcolor");
int _y = 0;
int _x = 0;
int _i = 0;
;
Debug.locals.put("img", _img);
 BA.debugLineNum = 55;BA.debugLine="Sub BitmapToBMP (img As B4XBitmap) As Byte()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="Dim larg As Int = img.Width";
Debug.JustUpdateDeviceLine();
_larg = BA.numberCast(int.class, _img.runMethod(true,"getWidth"));Debug.locals.put("larg", _larg);Debug.locals.put("larg", _larg);
 BA.debugLineNum = 57;BA.debugLine="Dim Padding1 As Int = 4 - ((larg * 3) Mod 4)";
Debug.JustUpdateDeviceLine();
_padding1 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(4),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_larg,RemoteObject.createImmutable(3)}, "*",0, 1)),RemoteObject.createImmutable(4)}, "%",0, 1))}, "-",1, 1);Debug.locals.put("Padding1", _padding1);Debug.locals.put("Padding1", _padding1);
 BA.debugLineNum = 58;BA.debugLine="Dim Padding1 As Int = 4 - ((30 * 3) Mod 4)";
Debug.JustUpdateDeviceLine();
_padding1 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(4),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(30),RemoteObject.createImmutable(3)}, "*",0, 1)),RemoteObject.createImmutable(4)}, "%",0, 1))}, "-",1, 1);Debug.locals.put("Padding1", _padding1);Debug.locals.put("Padding1", _padding1);
 BA.debugLineNum = 59;BA.debugLine="If Padding1 = 4 Then Padding1 = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_padding1,BA.numberCast(double.class, 4))) { 
_padding1 = BA.numberCast(int.class, 0);Debug.locals.put("Padding1", _padding1);};
 BA.debugLineNum = 60;BA.debugLine="Dim HeaderSize As Int = 40";
Debug.JustUpdateDeviceLine();
_headersize = BA.numberCast(int.class, 40);Debug.locals.put("HeaderSize", _headersize);Debug.locals.put("HeaderSize", _headersize);
 BA.debugLineNum = 61;BA.debugLine="Dim offset As Int = HeaderSize + 14";
Debug.JustUpdateDeviceLine();
_offset = RemoteObject.solve(new RemoteObject[] {_headersize,RemoteObject.createImmutable(14)}, "+",1, 1);Debug.locals.put("offset", _offset);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 62;BA.debugLine="Dim size As Int = offset + img.Width * img.Height";
Debug.JustUpdateDeviceLine();
_size = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_offset,_img.runMethod(true,"getWidth"),_img.runMethod(true,"getHeight"),RemoteObject.createImmutable(3),_img.runMethod(true,"getHeight"),_padding1}, "+**+*",2, 0));Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 63;BA.debugLine="Dim raf As RandomAccessFile";
Debug.JustUpdateDeviceLine();
_raf = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");Debug.locals.put("raf", _raf);
 BA.debugLineNum = 64;BA.debugLine="Dim buffer(size) As Byte";
Debug.JustUpdateDeviceLine();
_buffer = RemoteObject.createNewArray ("byte", new int[] {_size.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 65;BA.debugLine="raf.Initialize3(buffer, True)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("Initialize3",(Object)(_buffer),(Object)(base64encodedecodeimage.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 66;BA.debugLine="raf.WriteBytes(Array As Byte(Asc(\"B\"), Asc(\"M\")),";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteBytes",(Object)(RemoteObject.createNewArray("byte",new int[] {2},new Object[] {BA.numberCast(byte.class, base64encodedecodeimage.mostCurrent.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("B"))))),BA.numberCast(byte.class, base64encodedecodeimage.mostCurrent.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("M")))))})),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 67;BA.debugLine="raf.WriteInt(size, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(_size),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 68;BA.debugLine="raf.CurrentPosition = raf.CurrentPosition + 4";
Debug.JustUpdateDeviceLine();
_raf.setField ("CurrentPosition",RemoteObject.solve(new RemoteObject[] {_raf.getField(true,"CurrentPosition"),RemoteObject.createImmutable(4)}, "+",1, 2));
 BA.debugLineNum = 69;BA.debugLine="raf.WriteInt(offset, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(_offset),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 71;BA.debugLine="raf.WriteInt(HeaderSize, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(_headersize),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 72;BA.debugLine="raf.WriteInt(img.Width, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(BA.numberCast(int.class, _img.runMethod(true,"getWidth"))),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 73;BA.debugLine="raf.WriteInt(img.Height, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(BA.numberCast(int.class, _img.runMethod(true,"getHeight"))),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 74;BA.debugLine="raf.WriteShort(1, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteShort",(Object)(BA.numberCast(short.class, 1)),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 75;BA.debugLine="raf.WriteShort(24, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteShort",(Object)(BA.numberCast(short.class, 24)),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 76;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(BA.numberCast(int.class, 0)),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 77;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(BA.numberCast(int.class, 0)),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 78;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(BA.numberCast(int.class, 0)),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 79;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(BA.numberCast(int.class, 0)),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 80;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(BA.numberCast(int.class, 0)),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 81;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteInt",(Object)(BA.numberCast(int.class, 0)),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 82;BA.debugLine="Dim bc As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 83;BA.debugLine="bc.Initialize(img.Width, img.Height)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.numberCast(int.class, _img.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, _img.runMethod(true,"getHeight"))));
 BA.debugLineNum = 84;BA.debugLine="bc.CopyPixelsFromBitmap(img)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelsfrombitmap",(Object)(_img));
 BA.debugLineNum = 85;BA.debugLine="Dim a As ARGBColor";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.createNew ("b4a.example.bitmapcreator._argbcolor");Debug.locals.put("a", _a);
 BA.debugLineNum = 86;BA.debugLine="For y = bc.mHeight - 1 To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step30 = -1;
final int limit30 = 0;
_y = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step30 > 0 && _y <= limit30) || (step30 < 0 && _y >= limit30) ;_y = ((int)(0 + _y + step30))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 87;BA.debugLine="For x = 0 To bc.mWidth - 1";
Debug.JustUpdateDeviceLine();
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step31 > 0 && _x <= limit31) || (step31 < 0 && _x >= limit31) ;_x = ((int)(0 + _x + step31))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 88;BA.debugLine="bc.GetARGB(x, y, a)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_a));
 BA.debugLineNum = 89;BA.debugLine="raf.WriteByte(a.b, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteByte",(Object)(BA.numberCast(byte.class, _a.getField(true,"b"))),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 90;BA.debugLine="raf.WriteByte(a.g, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteByte",(Object)(BA.numberCast(byte.class, _a.getField(true,"g"))),(Object)(_raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 91;BA.debugLine="raf.WriteByte(a.r, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteByte",(Object)(BA.numberCast(byte.class, _a.getField(true,"r"))),(Object)(_raf.getField(true,"CurrentPosition")));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 93;BA.debugLine="For i = 0 To Padding1 - 1";
Debug.JustUpdateDeviceLine();
{
final int step37 = 1;
final int limit37 = RemoteObject.solve(new RemoteObject[] {_padding1,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37) ;_i = ((int)(0 + _i + step37))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 94;BA.debugLine="raf.WriteByte(0, raf.CurrentPosition)";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("WriteByte",(Object)(BA.numberCast(byte.class, 0)),(Object)(_raf.getField(true,"CurrentPosition")));
 }
}Debug.locals.put("i", _i);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 97;BA.debugLine="raf.Close";
Debug.JustUpdateDeviceLine();
_raf.runVoidMethod ("Close");
 BA.debugLineNum = 98;BA.debugLine="Return buffer";
Debug.JustUpdateDeviceLine();
if (true) return _buffer;
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _validbase64(RemoteObject _ba,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ValidBase64 (base64encodedecodeimage) ","base64encodedecodeimage",109,_ba,base64encodedecodeimage.mostCurrent,102);
if (RapidSub.canDelegate("validbase64")) { return ir.parsikhesab.pakhsh.base64encodedecodeimage.remoteMe.runUserSub(false, "base64encodedecodeimage","validbase64", _ba, _text);}
;
Debug.locals.put("text", _text);
 BA.debugLineNum = 102;BA.debugLine="Sub ValidBase64(text As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="If Regex.IsMatch(\"^([A-Za-z0-9+/]{4})*([A-Za-z0-9";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",base64encodedecodeimage.mostCurrent.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(BA.ObjectToString("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$")),(Object)(_text.runMethod(true,"trim")))) && RemoteObject.solveBoolean(">",_text.runMethod(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 104;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return base64encodedecodeimage.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 106;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return base64encodedecodeimage.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}