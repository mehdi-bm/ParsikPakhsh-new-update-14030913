package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class base64encodedecodeimage {
private static base64encodedecodeimage mostCurrent = new base64encodedecodeimage();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public igolub.fused.b4a.location.android.location.LocationFWrapper.LocationFStatic _locationf = null;
public igolub.fused.b4a.location.LocationResultWrapper.LocationResultConstants _locationresult = null;
public igolub.fused.b4a.location.LocationRequestWrapper.LocationRequestConstants _locationrequest = null;
public igolub.fused.b4a.location.staticmodules.PriorityWrapper _priority = null;
public igolub.fused.b4a.location.staticmodules.GranularityWrapper _granularity = null;
public igolub.permissionmanager.b4a.PermissionsManagerFileProvider _fileprovider = null;
public igolub.permissionmanager.b4a.PermissionsManagerConstants _permissionsmanager = null;
public b4a.example.dateutils _dateutils = null;
public ir.parsikhesab.pakhsh.main _main = null;
public ir.parsikhesab.pakhsh.act_main _act_main = null;
public ir.parsikhesab.pakhsh.service_server _service_server = null;
public ir.parsikhesab.pakhsh.mcode _mcode = null;
public ir.parsikhesab.pakhsh.mycode _mycode = null;
public ir.parsikhesab.pakhsh.mdatabase _mdatabase = null;
public ir.parsikhesab.pakhsh.gpswiget _gpswiget = null;
public ir.parsikhesab.pakhsh.fusedlocationservice _fusedlocationservice = null;
public ir.parsikhesab.pakhsh.service_helper _service_helper = null;
public ir.parsikhesab.pakhsh.act_selectmantage _act_selectmantage = null;
public ir.parsikhesab.pakhsh.act_reprizfactorvisitor _act_reprizfactorvisitor = null;
public ir.parsikhesab.pakhsh.act_choose_report _act_choose_report = null;
public ir.parsikhesab.pakhsh.act_emza _act_emza = null;
public ir.parsikhesab.pakhsh.act_havaletozie _act_havaletozie = null;
public ir.parsikhesab.pakhsh.act_imageslideshow _act_imageslideshow = null;
public ir.parsikhesab.pakhsh.act_kala_listi _act_kala_listi = null;
public ir.parsikhesab.pakhsh.act_kaladefault _act_kaladefault = null;
public ir.parsikhesab.pakhsh.act_kalapaging _act_kalapaging = null;
public ir.parsikhesab.pakhsh.act_kalapaging2 _act_kalapaging2 = null;
public ir.parsikhesab.pakhsh.act_locationmoshtarian _act_locationmoshtarian = null;
public ir.parsikhesab.pakhsh.act_locationvisitor _act_locationvisitor = null;
public ir.parsikhesab.pakhsh.act_mali _act_mali = null;
public ir.parsikhesab.pakhsh.act_moshtarian _act_moshtarian = null;
public ir.parsikhesab.pakhsh.act_newashkhas _act_newashkhas = null;
public ir.parsikhesab.pakhsh.act_notif _act_notif = null;
public ir.parsikhesab.pakhsh.act_printmali _act_printmali = null;
public ir.parsikhesab.pakhsh.act_printpic _act_printpic = null;
public ir.parsikhesab.pakhsh.act_printpic2 _act_printpic2 = null;
public ir.parsikhesab.pakhsh.act_profile _act_profile = null;
public ir.parsikhesab.pakhsh.act_repfactors _act_repfactors = null;
public ir.parsikhesab.pakhsh.act_repfactorvisitor _act_repfactorvisitor = null;
public ir.parsikhesab.pakhsh.act_reportrizebargasht _act_reportrizebargasht = null;
public ir.parsikhesab.pakhsh.act_reportsoorathesab _act_reportsoorathesab = null;
public ir.parsikhesab.pakhsh.act_reportvisitor _act_reportvisitor = null;
public ir.parsikhesab.pakhsh.act_reportvisitor2 _act_reportvisitor2 = null;
public ir.parsikhesab.pakhsh.act_restore _act_restore = null;
public ir.parsikhesab.pakhsh.act_rizefactorhavale _act_rizefactorhavale = null;
public ir.parsikhesab.pakhsh.act_rizfaktor _act_rizfaktor = null;
public ir.parsikhesab.pakhsh.act_rizhavale _act_rizhavale = null;
public ir.parsikhesab.pakhsh.act_sabad _act_sabad = null;
public ir.parsikhesab.pakhsh.act_sabtmarjooii _act_sabtmarjooii = null;
public ir.parsikhesab.pakhsh.act_sabtrizcheck _act_sabtrizcheck = null;
public ir.parsikhesab.pakhsh.act_saveinfocompany _act_saveinfocompany = null;
public ir.parsikhesab.pakhsh.act_savelocation _act_savelocation = null;
public ir.parsikhesab.pakhsh.act_search _act_search = null;
public ir.parsikhesab.pakhsh.act_selfaktor _act_selfaktor = null;
public ir.parsikhesab.pakhsh.act_senddata _act_senddata = null;
public ir.parsikhesab.pakhsh.act_setting _act_setting = null;
public ir.parsikhesab.pakhsh.act_settingpos _act_settingpos = null;
public ir.parsikhesab.pakhsh.act_showlocation _act_showlocation = null;
public ir.parsikhesab.pakhsh.act_support _act_support = null;
public ir.parsikhesab.pakhsh.act_ticket _act_ticket = null;
public ir.parsikhesab.pakhsh.act_video _act_video = null;
public ir.parsikhesab.pakhsh.clskala _clskala = null;
public ir.parsikhesab.pakhsh.dbutils _dbutils = null;
public ir.parsikhesab.pakhsh.firebasemessaging _firebasemessaging = null;
public ir.parsikhesab.pakhsh.geoservice _geoservice = null;
public ir.parsikhesab.pakhsh.imagedownloader _imagedownloader = null;
public ir.parsikhesab.pakhsh.myreceiver _myreceiver = null;
public ir.parsikhesab.pakhsh.service_gps _service_gps = null;
public ir.parsikhesab.pakhsh.service_notification _service_notification = null;
public ir.parsikhesab.pakhsh.signaturecapture _signaturecapture = null;
public ir.parsikhesab.pakhsh.starter _starter = null;
public ir.parsikhesab.pakhsh.tracker _tracker = null;
public ir.parsikhesab.pakhsh.wiget_service _wiget_service = null;
public ir.parsikhesab.pakhsh.xmlviewex _xmlviewex = null;
public ir.parsikhesab.pakhsh.newinst2 _newinst2 = null;
public ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public static String  _base64anyfiletostring(anywheresoftware.b4a.BA _ba,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="base64encodedecodeimage";
if (Debug.shouldDelegate(null, "base64anyfiletostring", true))
	 {return ((String) Debug.delegate(null, "base64anyfiletostring", new Object[] {_ba,_dir,_filename}));}
anywheresoftware.b4a.objects.StringUtils _convert = null;
RDebugUtils.currentLine=129761280;
 //BA.debugLineNum = 129761280;BA.debugLine="Sub Base64AnyFileToString(Dir As String, Filename";
RDebugUtils.currentLine=129761281;
 //BA.debugLineNum = 129761281;BA.debugLine="Dim convert As StringUtils";
_convert = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=129761283;
 //BA.debugLineNum = 129761283;BA.debugLine="Return convert.EncodeBase64(File.ReadBytes(Dir, F";
if (true) return _convert.EncodeBase64(anywheresoftware.b4a.keywords.Common.File.ReadBytes(_dir,_filename));
RDebugUtils.currentLine=129761284;
 //BA.debugLineNum = 129761284;BA.debugLine="End Sub";
return "";
}
public static String  _base64imagetostring(anywheresoftware.b4a.BA _ba,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="base64encodedecodeimage";
if (Debug.shouldDelegate(null, "base64imagetostring", true))
	 {return ((String) Debug.delegate(null, "base64imagetostring", new Object[] {_ba,_dir,_filename}));}
anywheresoftware.b4a.objects.StringUtils _convert = null;
RDebugUtils.currentLine=129695744;
 //BA.debugLineNum = 129695744;BA.debugLine="Sub Base64ImageToString(Dir As String, Filename As";
RDebugUtils.currentLine=129695745;
 //BA.debugLineNum = 129695745;BA.debugLine="Dim convert As StringUtils";
_convert = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=129695747;
 //BA.debugLineNum = 129695747;BA.debugLine="Return convert.EncodeBase64(File.ReadBytes(Dir, F";
if (true) return _convert.EncodeBase64(anywheresoftware.b4a.keywords.Common.File.ReadBytes(_dir,_filename));
RDebugUtils.currentLine=129695748;
 //BA.debugLineNum = 129695748;BA.debugLine="End Sub";
return "";
}
public static String  _base64imagetostring2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _filename) throws Exception{
RDebugUtils.currentModule="base64encodedecodeimage";
if (Debug.shouldDelegate(null, "base64imagetostring2", true))
	 {return ((String) Debug.delegate(null, "base64imagetostring2", new Object[] {_ba,_filename}));}
anywheresoftware.b4a.objects.StringUtils _convert = null;
RDebugUtils.currentLine=129892352;
 //BA.debugLineNum = 129892352;BA.debugLine="Sub Base64ImageToString2(Filename As B4XBitmap) As";
RDebugUtils.currentLine=129892353;
 //BA.debugLineNum = 129892353;BA.debugLine="Dim convert As StringUtils";
_convert = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=129892354;
 //BA.debugLineNum = 129892354;BA.debugLine="Return convert.EncodeBase64(BitmapToBMP(Filename)";
if (true) return _convert.EncodeBase64(_bitmaptobmp(_ba,_filename));
RDebugUtils.currentLine=129892355;
 //BA.debugLineNum = 129892355;BA.debugLine="End Sub";
return "";
}
public static byte[]  _bitmaptobmp(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _img) throws Exception{
RDebugUtils.currentModule="base64encodedecodeimage";
if (Debug.shouldDelegate(null, "bitmaptobmp", true))
	 {return ((byte[]) Debug.delegate(null, "bitmaptobmp", new Object[] {_ba,_img}));}
int _larg = 0;
int _padding1 = 0;
int _headersize = 0;
int _offset = 0;
int _size = 0;
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
byte[] _buffer = null;
b4a.example.bitmapcreator _bc = null;
b4a.example.bitmapcreator._argbcolor _a = null;
int _y = 0;
int _x = 0;
int _i = 0;
RDebugUtils.currentLine=129957888;
 //BA.debugLineNum = 129957888;BA.debugLine="Sub BitmapToBMP (img As B4XBitmap) As Byte()";
RDebugUtils.currentLine=129957889;
 //BA.debugLineNum = 129957889;BA.debugLine="Dim larg As Int = img.Width";
_larg = (int) (_img.getWidth());
RDebugUtils.currentLine=129957890;
 //BA.debugLineNum = 129957890;BA.debugLine="Dim Padding1 As Int = 4 - ((larg * 3) Mod 4)";
_padding1 = (int) (4-((_larg*3)%4));
RDebugUtils.currentLine=129957891;
 //BA.debugLineNum = 129957891;BA.debugLine="Dim Padding1 As Int = 4 - ((30 * 3) Mod 4)";
_padding1 = (int) (4-((30*3)%4));
RDebugUtils.currentLine=129957892;
 //BA.debugLineNum = 129957892;BA.debugLine="If Padding1 = 4 Then Padding1 = 0";
if (_padding1==4) { 
_padding1 = (int) (0);};
RDebugUtils.currentLine=129957893;
 //BA.debugLineNum = 129957893;BA.debugLine="Dim HeaderSize As Int = 40";
_headersize = (int) (40);
RDebugUtils.currentLine=129957894;
 //BA.debugLineNum = 129957894;BA.debugLine="Dim offset As Int = HeaderSize + 14";
_offset = (int) (_headersize+14);
RDebugUtils.currentLine=129957895;
 //BA.debugLineNum = 129957895;BA.debugLine="Dim size As Int = offset + img.Width * img.Height";
_size = (int) (_offset+_img.getWidth()*_img.getHeight()*3+_img.getHeight()*_padding1);
RDebugUtils.currentLine=129957896;
 //BA.debugLineNum = 129957896;BA.debugLine="Dim raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=129957897;
 //BA.debugLineNum = 129957897;BA.debugLine="Dim buffer(size) As Byte";
_buffer = new byte[_size];
;
RDebugUtils.currentLine=129957898;
 //BA.debugLineNum = 129957898;BA.debugLine="raf.Initialize3(buffer, True)";
_raf.Initialize3(_buffer,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129957899;
 //BA.debugLineNum = 129957899;BA.debugLine="raf.WriteBytes(Array As Byte(Asc(\"B\"), Asc(\"M\")),";
_raf.WriteBytes(new byte[]{(byte) (anywheresoftware.b4a.keywords.Common.Asc(BA.ObjectToChar("B"))),(byte) (anywheresoftware.b4a.keywords.Common.Asc(BA.ObjectToChar("M")))},(int) (0),(int) (2),_raf.CurrentPosition);
RDebugUtils.currentLine=129957900;
 //BA.debugLineNum = 129957900;BA.debugLine="raf.WriteInt(size, raf.CurrentPosition)";
_raf.WriteInt(_size,_raf.CurrentPosition);
RDebugUtils.currentLine=129957901;
 //BA.debugLineNum = 129957901;BA.debugLine="raf.CurrentPosition = raf.CurrentPosition + 4";
_raf.CurrentPosition = (long) (_raf.CurrentPosition+4);
RDebugUtils.currentLine=129957902;
 //BA.debugLineNum = 129957902;BA.debugLine="raf.WriteInt(offset, raf.CurrentPosition)";
_raf.WriteInt(_offset,_raf.CurrentPosition);
RDebugUtils.currentLine=129957904;
 //BA.debugLineNum = 129957904;BA.debugLine="raf.WriteInt(HeaderSize, raf.CurrentPosition)";
_raf.WriteInt(_headersize,_raf.CurrentPosition);
RDebugUtils.currentLine=129957905;
 //BA.debugLineNum = 129957905;BA.debugLine="raf.WriteInt(img.Width, raf.CurrentPosition)";
_raf.WriteInt((int) (_img.getWidth()),_raf.CurrentPosition);
RDebugUtils.currentLine=129957906;
 //BA.debugLineNum = 129957906;BA.debugLine="raf.WriteInt(img.Height, raf.CurrentPosition)";
_raf.WriteInt((int) (_img.getHeight()),_raf.CurrentPosition);
RDebugUtils.currentLine=129957907;
 //BA.debugLineNum = 129957907;BA.debugLine="raf.WriteShort(1, raf.CurrentPosition)";
_raf.WriteShort((short) (1),_raf.CurrentPosition);
RDebugUtils.currentLine=129957908;
 //BA.debugLineNum = 129957908;BA.debugLine="raf.WriteShort(24, raf.CurrentPosition)";
_raf.WriteShort((short) (24),_raf.CurrentPosition);
RDebugUtils.currentLine=129957909;
 //BA.debugLineNum = 129957909;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
_raf.WriteInt((int) (0),_raf.CurrentPosition);
RDebugUtils.currentLine=129957910;
 //BA.debugLineNum = 129957910;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
_raf.WriteInt((int) (0),_raf.CurrentPosition);
RDebugUtils.currentLine=129957911;
 //BA.debugLineNum = 129957911;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
_raf.WriteInt((int) (0),_raf.CurrentPosition);
RDebugUtils.currentLine=129957912;
 //BA.debugLineNum = 129957912;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
_raf.WriteInt((int) (0),_raf.CurrentPosition);
RDebugUtils.currentLine=129957913;
 //BA.debugLineNum = 129957913;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
_raf.WriteInt((int) (0),_raf.CurrentPosition);
RDebugUtils.currentLine=129957914;
 //BA.debugLineNum = 129957914;BA.debugLine="raf.WriteInt(0, raf.CurrentPosition)";
_raf.WriteInt((int) (0),_raf.CurrentPosition);
RDebugUtils.currentLine=129957915;
 //BA.debugLineNum = 129957915;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=129957916;
 //BA.debugLineNum = 129957916;BA.debugLine="bc.Initialize(img.Width, img.Height)";
_bc._initialize((_ba.processBA == null ? _ba : _ba.processBA),(int) (_img.getWidth()),(int) (_img.getHeight()));
RDebugUtils.currentLine=129957917;
 //BA.debugLineNum = 129957917;BA.debugLine="bc.CopyPixelsFromBitmap(img)";
_bc._copypixelsfrombitmap(_img);
RDebugUtils.currentLine=129957918;
 //BA.debugLineNum = 129957918;BA.debugLine="Dim a As ARGBColor";
_a = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=129957919;
 //BA.debugLineNum = 129957919;BA.debugLine="For y = bc.mHeight - 1 To 0 Step -1";
{
final int step30 = -1;
final int limit30 = (int) (0);
_y = (int) (_bc._mheight-1) ;
for (;_y >= limit30 ;_y = _y + step30 ) {
RDebugUtils.currentLine=129957920;
 //BA.debugLineNum = 129957920;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step31 = 1;
final int limit31 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit31 ;_x = _x + step31 ) {
RDebugUtils.currentLine=129957921;
 //BA.debugLineNum = 129957921;BA.debugLine="bc.GetARGB(x, y, a)";
_bc._getargb(_x,_y,_a);
RDebugUtils.currentLine=129957922;
 //BA.debugLineNum = 129957922;BA.debugLine="raf.WriteByte(a.b, raf.CurrentPosition)";
_raf.WriteByte((byte) (_a.b),_raf.CurrentPosition);
RDebugUtils.currentLine=129957923;
 //BA.debugLineNum = 129957923;BA.debugLine="raf.WriteByte(a.g, raf.CurrentPosition)";
_raf.WriteByte((byte) (_a.g),_raf.CurrentPosition);
RDebugUtils.currentLine=129957924;
 //BA.debugLineNum = 129957924;BA.debugLine="raf.WriteByte(a.r, raf.CurrentPosition)";
_raf.WriteByte((byte) (_a.r),_raf.CurrentPosition);
 }
};
RDebugUtils.currentLine=129957926;
 //BA.debugLineNum = 129957926;BA.debugLine="For i = 0 To Padding1 - 1";
{
final int step37 = 1;
final int limit37 = (int) (_padding1-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
RDebugUtils.currentLine=129957927;
 //BA.debugLineNum = 129957927;BA.debugLine="raf.WriteByte(0, raf.CurrentPosition)";
_raf.WriteByte((byte) (0),_raf.CurrentPosition);
 }
};
 }
};
RDebugUtils.currentLine=129957930;
 //BA.debugLineNum = 129957930;BA.debugLine="raf.Close";
_raf.Close();
RDebugUtils.currentLine=129957931;
 //BA.debugLineNum = 129957931;BA.debugLine="Return buffer";
if (true) return _buffer;
RDebugUtils.currentLine=129957932;
 //BA.debugLineNum = 129957932;BA.debugLine="End Sub";
return null;
}
public static String  _base64stringtoanyfile(anywheresoftware.b4a.BA _ba,String _s,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="base64encodedecodeimage";
if (Debug.shouldDelegate(null, "base64stringtoanyfile", true))
	 {return ((String) Debug.delegate(null, "base64stringtoanyfile", new Object[] {_ba,_s,_dir,_filename}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
byte[] _bytes = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=129826816;
 //BA.debugLineNum = 129826816;BA.debugLine="Sub Base64StringToAnyFile(s As String, Dir As Stri";
RDebugUtils.currentLine=129826817;
 //BA.debugLineNum = 129826817;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=129826818;
 //BA.debugLineNum = 129826818;BA.debugLine="Dim bytes() As Byte = su.DecodeBase64(s)";
_bytes = _su.DecodeBase64(_s);
RDebugUtils.currentLine=129826819;
 //BA.debugLineNum = 129826819;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_dir,_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129826820;
 //BA.debugLineNum = 129826820;BA.debugLine="out.WriteBytes(bytes, 0, bytes.Length)";
_out.WriteBytes(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=129826821;
 //BA.debugLineNum = 129826821;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=129826822;
 //BA.debugLineNum = 129826822;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _base64stringtoimage(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="base64encodedecodeimage";
if (Debug.shouldDelegate(null, "base64stringtoimage", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(null, "base64stringtoimage", new Object[] {_ba,_s}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
byte[] _bytes = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=129630208;
 //BA.debugLineNum = 129630208;BA.debugLine="Sub Base64StringToImage(s As String) As B4XBitmap";
RDebugUtils.currentLine=129630209;
 //BA.debugLineNum = 129630209;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=129630210;
 //BA.debugLineNum = 129630210;BA.debugLine="Dim bytes() As Byte = su.DecodeBase64(s)";
_bytes = _su.DecodeBase64(_s);
RDebugUtils.currentLine=129630211;
 //BA.debugLineNum = 129630211;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=129630212;
 //BA.debugLineNum = 129630212;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=129630214;
 //BA.debugLineNum = 129630214;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=129630215;
 //BA.debugLineNum = 129630215;BA.debugLine="bmp.Initialize2(In)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=129630216;
 //BA.debugLineNum = 129630216;BA.debugLine="In.Close";
_in.Close();
RDebugUtils.currentLine=129630217;
 //BA.debugLineNum = 129630217;BA.debugLine="Return bmp";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=129630225;
 //BA.debugLineNum = 129630225;BA.debugLine="End Sub";
return null;
}
public static boolean  _validbase64(anywheresoftware.b4a.BA _ba,String _text) throws Exception{
RDebugUtils.currentModule="base64encodedecodeimage";
if (Debug.shouldDelegate(null, "validbase64", true))
	 {return ((Boolean) Debug.delegate(null, "validbase64", new Object[] {_ba,_text}));}
RDebugUtils.currentLine=130023424;
 //BA.debugLineNum = 130023424;BA.debugLine="Sub ValidBase64(text As String) As Boolean";
RDebugUtils.currentLine=130023425;
 //BA.debugLineNum = 130023425;BA.debugLine="If Regex.IsMatch(\"^([A-Za-z0-9+/]{4})*([A-Za-z0-9";
if (anywheresoftware.b4a.keywords.Common.Regex.IsMatch("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$",_text.trim()) && _text.length()>3) { 
RDebugUtils.currentLine=130023426;
 //BA.debugLineNum = 130023426;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=130023428;
 //BA.debugLineNum = 130023428;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=130023430;
 //BA.debugLineNum = 130023430;BA.debugLine="End Sub";
return false;
}
}