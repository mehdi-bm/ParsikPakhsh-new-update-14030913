package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_faktor3_havale_type2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_faktor3_havale_type2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_faktor3_havale_type2.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _p = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgsign = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltozihat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsigns = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblghabelepardakht = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghkhales = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmandetasfienashode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltakhfifkala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghekoldaryafti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghtakhfifdaryafti = null;
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
public ir.parsikhesab.pakhsh.base64encodedecodeimage _base64encodedecodeimage = null;
public ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(ir.parsikhesab.pakhsh.cls_faktor3_havale_type2 __ref,anywheresoftware.b4a.BA _ba,String _ghabelepardakht,String _mablaghkhales,String _mablaghtakhfifdaryafti,String _mandetasfienashode,String _takhfifkala,String _mablaghekoldaryafti,String _totalfaktor,String _tozihat,String _signaturebitmapstring) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_faktor3_havale_type2";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_ghabelepardakht,_mablaghkhales,_mablaghtakhfifdaryafti,_mandetasfienashode,_takhfifkala,_mablaghekoldaryafti,_totalfaktor,_tozihat,_signaturebitmapstring}));}
String _str2 = "";
RDebugUtils.currentLine=91619328;
 //BA.debugLineNum = 91619328;BA.debugLine="Public Sub Initialize(GHabelePardakht,MablaghKhale";
RDebugUtils.currentLine=91619329;
 //BA.debugLineNum = 91619329;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=91619330;
 //BA.debugLineNum = 91619330;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=91619331;
 //BA.debugLineNum = 91619331;BA.debugLine="p.LoadLayout(\"l_faktor3_havale_Type2\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_faktor3_havale_Type2",ba);
RDebugUtils.currentLine=91619332;
 //BA.debugLineNum = 91619332;BA.debugLine="LblGHabelePardakht.Text=GHabelePardakht";
__ref._lblghabelepardakht /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_ghabelepardakht));
RDebugUtils.currentLine=91619333;
 //BA.debugLineNum = 91619333;BA.debugLine="LblMablaghKhales.Text=MablaghKhales";
__ref._lblmablaghkhales /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mablaghkhales));
RDebugUtils.currentLine=91619334;
 //BA.debugLineNum = 91619334;BA.debugLine="LblMablaghTakhfifDaryafti.Text=MablaghTakhfifDary";
__ref._lblmablaghtakhfifdaryafti /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mablaghtakhfifdaryafti));
RDebugUtils.currentLine=91619335;
 //BA.debugLineNum = 91619335;BA.debugLine="lblMandeTasfieNashode.Text=MandeTasfieNashode";
__ref._lblmandetasfienashode /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mandetasfienashode));
RDebugUtils.currentLine=91619336;
 //BA.debugLineNum = 91619336;BA.debugLine="LblTakhfifKala.Text=TakhfifKala";
__ref._lbltakhfifkala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_takhfifkala));
RDebugUtils.currentLine=91619337;
 //BA.debugLineNum = 91619337;BA.debugLine="LblTotalFaktor.Text=TotalFaktor";
__ref._lbltotalfaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_totalfaktor));
RDebugUtils.currentLine=91619338;
 //BA.debugLineNum = 91619338;BA.debugLine="lblMablagheKolDaryafti.Text=MablagheKolDaryafti";
__ref._lblmablaghekoldaryafti /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mablaghekoldaryafti));
RDebugUtils.currentLine=91619339;
 //BA.debugLineNum = 91619339;BA.debugLine="lblTozihat.Text=Tozihat";
__ref._lbltozihat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tozihat));
RDebugUtils.currentLine=91619345;
 //BA.debugLineNum = 91619345;BA.debugLine="Try";
try {RDebugUtils.currentLine=91619347;
 //BA.debugLineNum = 91619347;BA.debugLine="Log(\"FldSignatureBitmapString: \" & SignatureBitm";
__c.LogImpl("591619347","FldSignatureBitmapString: "+_signaturebitmapstring,0);
RDebugUtils.currentLine=91619348;
 //BA.debugLineNum = 91619348;BA.debugLine="Log(SignatureBitmapString)";
__c.LogImpl("591619348",_signaturebitmapstring,0);
RDebugUtils.currentLine=91619349;
 //BA.debugLineNum = 91619349;BA.debugLine="Log(SignatureBitmapString.Length)";
__c.LogImpl("591619349",BA.NumberToString(_signaturebitmapstring.length()),0);
RDebugUtils.currentLine=91619351;
 //BA.debugLineNum = 91619351;BA.debugLine="Dim str2 As String=MCode.Decrypted(SignatureBitm";
_str2 = _mcode._decrypted /*String*/ (ba,_signaturebitmapstring);
RDebugUtils.currentLine=91619352;
 //BA.debugLineNum = 91619352;BA.debugLine="If SignatureBitmapString<>\"\" Then";
if ((_signaturebitmapstring).equals("") == false) { 
RDebugUtils.currentLine=91619354;
 //BA.debugLineNum = 91619354;BA.debugLine="imgSign.Bitmap=ReadBlob(str2.Trim)";
__ref._imgsign /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__ref._readblob /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null,_str2.trim()).getObject()));
 };
 } 
       catch (Exception e21) {
			ba.setLastException(e21);RDebugUtils.currentLine=91619357;
 //BA.debugLineNum = 91619357;BA.debugLine="lblSignS.Text=\"\"";
__ref._lblsigns /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=91619358;
 //BA.debugLineNum = 91619358;BA.debugLine="imgSign.Visible=True";
__ref._imgsign /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=91619359;
 //BA.debugLineNum = 91619359;BA.debugLine="Log(\"error emza....\")";
__c.LogImpl("591619359","error emza....",0);
 };
RDebugUtils.currentLine=91619361;
 //BA.debugLineNum = 91619361;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_faktor3_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type2";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=91684864;
 //BA.debugLineNum = 91684864;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=91684865;
 //BA.debugLineNum = 91684865;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=91684866;
 //BA.debugLineNum = 91684866;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=91684867;
 //BA.debugLineNum = 91684867;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_faktor3_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type2";
RDebugUtils.currentLine=91553792;
 //BA.debugLineNum = 91553792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=91553793;
 //BA.debugLineNum = 91553793;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=91553794;
 //BA.debugLineNum = 91553794;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=91553796;
 //BA.debugLineNum = 91553796;BA.debugLine="Private imgSign As ImageView";
_imgsign = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=91553797;
 //BA.debugLineNum = 91553797;BA.debugLine="Private lblTozihat As Label";
_lbltozihat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91553798;
 //BA.debugLineNum = 91553798;BA.debugLine="Private lblSignS As Label";
_lblsigns = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91553800;
 //BA.debugLineNum = 91553800;BA.debugLine="Private LblGHabelePardakht As Label";
_lblghabelepardakht = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91553801;
 //BA.debugLineNum = 91553801;BA.debugLine="Private LblMablaghKhales As Label";
_lblmablaghkhales = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91553803;
 //BA.debugLineNum = 91553803;BA.debugLine="Private lblMandeTasfieNashode As Label";
_lblmandetasfienashode = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91553804;
 //BA.debugLineNum = 91553804;BA.debugLine="Private LblTakhfifKala As Label";
_lbltakhfifkala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91553805;
 //BA.debugLineNum = 91553805;BA.debugLine="Private LblTotalFaktor As Label";
_lbltotalfaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91553807;
 //BA.debugLineNum = 91553807;BA.debugLine="Private lblMablagheKolDaryafti As Label";
_lblmablaghekoldaryafti = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91553808;
 //BA.debugLineNum = 91553808;BA.debugLine="Private LblMablaghTakhfifDaryafti As Label";
_lblmablaghtakhfifdaryafti = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91553809;
 //BA.debugLineNum = 91553809;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_faktor3_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type2";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=91815936;
 //BA.debugLineNum = 91815936;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=91815937;
 //BA.debugLineNum = 91815937;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=91815938;
 //BA.debugLineNum = 91815938;BA.debugLine="End Sub";
return 0;
}
public int  _getleft(ir.parsikhesab.pakhsh.cls_faktor3_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type2";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=91947008;
 //BA.debugLineNum = 91947008;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=91947009;
 //BA.debugLineNum = 91947009;BA.debugLine="Return pnl_bk.Left";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=91947010;
 //BA.debugLineNum = 91947010;BA.debugLine="End Sub";
return 0;
}
public int  _gettop(ir.parsikhesab.pakhsh.cls_faktor3_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type2";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=91881472;
 //BA.debugLineNum = 91881472;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=91881473;
 //BA.debugLineNum = 91881473;BA.debugLine="Return pnl_bk.Top";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=91881474;
 //BA.debugLineNum = 91881474;BA.debugLine="End Sub";
return 0;
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_faktor3_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type2";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=91750400;
 //BA.debugLineNum = 91750400;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=91750401;
 //BA.debugLineNum = 91750401;BA.debugLine="Return pnl_bk.Width";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=91750402;
 //BA.debugLineNum = 91750402;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _readblob(ir.parsikhesab.pakhsh.cls_faktor3_havale_type2 __ref,String _emza) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type2";
if (Debug.shouldDelegate(ba, "readblob", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "readblob", new Object[] {_emza}));}
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream1 = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap1 = null;
RDebugUtils.currentLine=92012544;
 //BA.debugLineNum = 92012544;BA.debugLine="Sub ReadBlob(emza As String) As Bitmap";
RDebugUtils.currentLine=92012546;
 //BA.debugLineNum = 92012546;BA.debugLine="Dim Buffer() As Byte 'declare an empty byte array";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=92012547;
 //BA.debugLineNum = 92012547;BA.debugLine="Buffer=MCode.Su.DecodeBase64(emza)";
_buffer = _mcode._su /*anywheresoftware.b4a.objects.StringUtils*/ .DecodeBase64(_emza);
RDebugUtils.currentLine=92012549;
 //BA.debugLineNum = 92012549;BA.debugLine="Dim InputStream1 As InputStream";
_inputstream1 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=92012550;
 //BA.debugLineNum = 92012550;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer, 0,";
_inputstream1.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=92012552;
 //BA.debugLineNum = 92012552;BA.debugLine="Dim Bitmap1 As Bitmap";
_bitmap1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=92012553;
 //BA.debugLineNum = 92012553;BA.debugLine="Bitmap1.Initialize2(InputStream1)";
_bitmap1.Initialize2((java.io.InputStream)(_inputstream1.getObject()));
RDebugUtils.currentLine=92012555;
 //BA.debugLineNum = 92012555;BA.debugLine="InputStream1.Close";
_inputstream1.Close();
RDebugUtils.currentLine=92012557;
 //BA.debugLineNum = 92012557;BA.debugLine="Return Bitmap1";
if (true) return _bitmap1;
RDebugUtils.currentLine=92012558;
 //BA.debugLineNum = 92012558;BA.debugLine="End Sub";
return null;
}
}