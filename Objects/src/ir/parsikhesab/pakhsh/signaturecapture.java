package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class signaturecapture {
private static signaturecapture mostCurrent = new signaturecapture();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public static class _signaturedata{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper Canvas;
public anywheresoftware.b4a.objects.PanelWrapper Panel;
public int SignatureColor;
public int SignatureWidth;
public void Initialize() {
IsInitialized = true;
Canvas = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
Panel = new anywheresoftware.b4a.objects.PanelWrapper();
SignatureColor = 0;
SignatureWidth = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static int _px = 0;
public static int _py = 0;
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
public ir.parsikhesab.pakhsh.starter _starter = null;
public ir.parsikhesab.pakhsh.tracker _tracker = null;
public ir.parsikhesab.pakhsh.wiget_service _wiget_service = null;
public ir.parsikhesab.pakhsh.xmlviewex _xmlviewex = null;
public ir.parsikhesab.pakhsh.newinst2 _newinst2 = null;
public ir.parsikhesab.pakhsh.base64encodedecodeimage _base64encodedecodeimage = null;
public ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public static String  _clear(anywheresoftware.b4a.BA _ba,ir.parsikhesab.pakhsh.signaturecapture._signaturedata _sd) throws Exception{
RDebugUtils.currentModule="signaturecapture";
if (Debug.shouldDelegate(null, "clear", false))
	 {return ((String) Debug.delegate(null, "clear", new Object[] {_ba,_sd}));}
RDebugUtils.currentLine=120717312;
 //BA.debugLineNum = 120717312;BA.debugLine="Sub Clear(SD As SignatureData)";
RDebugUtils.currentLine=120717313;
 //BA.debugLineNum = 120717313;BA.debugLine="SD.Canvas.DrawColor(Colors.White)";
_sd.Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=120717314;
 //BA.debugLineNum = 120717314;BA.debugLine="SD.Panel.Invalidate";
_sd.Panel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=120717315;
 //BA.debugLineNum = 120717315;BA.debugLine="End Sub";
return "";
}
public static String  _save(anywheresoftware.b4a.BA _ba,ir.parsikhesab.pakhsh.signaturecapture._signaturedata _sd,String _dir,String _name) throws Exception{
RDebugUtils.currentModule="signaturecapture";
if (Debug.shouldDelegate(null, "save", false))
	 {return ((String) Debug.delegate(null, "save", new Object[] {_ba,_sd,_dir,_name}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=120782848;
 //BA.debugLineNum = 120782848;BA.debugLine="Sub Save(SD As SignatureData, Dir As String, Name";
RDebugUtils.currentLine=120782849;
 //BA.debugLineNum = 120782849;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=120782850;
 //BA.debugLineNum = 120782850;BA.debugLine="out = File.OpenOutput(Dir, Name, False)";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_dir,_name,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=120782851;
 //BA.debugLineNum = 120782851;BA.debugLine="SD.Canvas.Bitmap.WriteToStream(out, 100, \"PNG\")";
_sd.Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"PNG"));
RDebugUtils.currentLine=120782852;
 //BA.debugLineNum = 120782852;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=120782853;
 //BA.debugLineNum = 120782853;BA.debugLine="End Sub";
return "";
}
public static String  _panel_touch(anywheresoftware.b4a.BA _ba,ir.parsikhesab.pakhsh.signaturecapture._signaturedata _sd,int _x,int _y,int _action) throws Exception{
RDebugUtils.currentModule="signaturecapture";
if (Debug.shouldDelegate(null, "panel_touch", false))
	 {return ((String) Debug.delegate(null, "panel_touch", new Object[] {_ba,_sd,_x,_y,_action}));}
RDebugUtils.currentLine=120651776;
 //BA.debugLineNum = 120651776;BA.debugLine="Sub Panel_Touch(SD As SignatureData, x As Int,y As";
RDebugUtils.currentLine=120651777;
 //BA.debugLineNum = 120651777;BA.debugLine="If Action = 0 Then 'mouse down constant";
if (_action==0) { 
RDebugUtils.currentLine=120651778;
 //BA.debugLineNum = 120651778;BA.debugLine="px = x";
_px = _x;
RDebugUtils.currentLine=120651779;
 //BA.debugLineNum = 120651779;BA.debugLine="py = y";
_py = _y;
 }else {
RDebugUtils.currentLine=120651781;
 //BA.debugLineNum = 120651781;BA.debugLine="SD.Canvas.DrawLine(px, py, x, y, SD.SignatureCol";
_sd.Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawLine((float) (_px),(float) (_py),(float) (_x),(float) (_y),_sd.SignatureColor /*int*/ ,(float) (_sd.SignatureWidth /*int*/ ));
RDebugUtils.currentLine=120651782;
 //BA.debugLineNum = 120651782;BA.debugLine="SD.Panel.Invalidate";
_sd.Panel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=120651783;
 //BA.debugLineNum = 120651783;BA.debugLine="px = x";
_px = _x;
RDebugUtils.currentLine=120651784;
 //BA.debugLineNum = 120651784;BA.debugLine="py = y";
_py = _y;
 };
RDebugUtils.currentLine=120651786;
 //BA.debugLineNum = 120651786;BA.debugLine="End Sub";
return "";
}
}