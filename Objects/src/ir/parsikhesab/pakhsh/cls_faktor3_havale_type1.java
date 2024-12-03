package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_faktor3_havale_type1 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_faktor3_havale_type1");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_faktor3_havale_type1.class).invoke(this, new Object[] {null});
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
public String  _initialize(ir.parsikhesab.pakhsh.cls_faktor3_havale_type1 __ref,anywheresoftware.b4a.BA _ba,String _ghabelepardakht,String _mablaghkhales,String _mablaghtakhfifdaryafti,String _mandetasfienashode,String _takhfifkala,String _mablaghekoldaryafti,String _totalfaktor,String _tozihat,String _signaturebitmapstring) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_faktor3_havale_type1";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_ghabelepardakht,_mablaghkhales,_mablaghtakhfifdaryafti,_mandetasfienashode,_takhfifkala,_mablaghekoldaryafti,_totalfaktor,_tozihat,_signaturebitmapstring}));}
String _str2 = "";
RDebugUtils.currentLine=91095040;
 //BA.debugLineNum = 91095040;BA.debugLine="Public Sub Initialize(GHabelePardakht,MablaghKhale";
RDebugUtils.currentLine=91095041;
 //BA.debugLineNum = 91095041;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=91095042;
 //BA.debugLineNum = 91095042;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=91095043;
 //BA.debugLineNum = 91095043;BA.debugLine="p.LoadLayout(\"l_faktor3_havale_Type1\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_faktor3_havale_Type1",ba);
RDebugUtils.currentLine=91095044;
 //BA.debugLineNum = 91095044;BA.debugLine="LblGHabelePardakht.Text=GHabelePardakht";
__ref._lblghabelepardakht /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_ghabelepardakht));
RDebugUtils.currentLine=91095045;
 //BA.debugLineNum = 91095045;BA.debugLine="LblMablaghKhales.Text=MablaghKhales";
__ref._lblmablaghkhales /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mablaghkhales));
RDebugUtils.currentLine=91095046;
 //BA.debugLineNum = 91095046;BA.debugLine="LblMablaghTakhfifDaryafti.Text=MablaghTakhfifDary";
__ref._lblmablaghtakhfifdaryafti /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mablaghtakhfifdaryafti));
RDebugUtils.currentLine=91095047;
 //BA.debugLineNum = 91095047;BA.debugLine="lblMandeTasfieNashode.Text=MandeTasfieNashode";
__ref._lblmandetasfienashode /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mandetasfienashode));
RDebugUtils.currentLine=91095048;
 //BA.debugLineNum = 91095048;BA.debugLine="LblTakhfifKala.Text=TakhfifKala";
__ref._lbltakhfifkala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_takhfifkala));
RDebugUtils.currentLine=91095049;
 //BA.debugLineNum = 91095049;BA.debugLine="LblTotalFaktor.Text=TotalFaktor";
__ref._lbltotalfaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_totalfaktor));
RDebugUtils.currentLine=91095050;
 //BA.debugLineNum = 91095050;BA.debugLine="lblMablagheKolDaryafti.Text=MablagheKolDaryafti";
__ref._lblmablaghekoldaryafti /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mablaghekoldaryafti));
RDebugUtils.currentLine=91095051;
 //BA.debugLineNum = 91095051;BA.debugLine="lblTozihat.Text=Tozihat";
__ref._lbltozihat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tozihat));
RDebugUtils.currentLine=91095057;
 //BA.debugLineNum = 91095057;BA.debugLine="Try";
try {RDebugUtils.currentLine=91095059;
 //BA.debugLineNum = 91095059;BA.debugLine="Log(\"FldSignatureBitmapString: \" & SignatureBitm";
__c.LogImpl("591095059","FldSignatureBitmapString: "+_signaturebitmapstring,0);
RDebugUtils.currentLine=91095060;
 //BA.debugLineNum = 91095060;BA.debugLine="Log(SignatureBitmapString)";
__c.LogImpl("591095060",_signaturebitmapstring,0);
RDebugUtils.currentLine=91095061;
 //BA.debugLineNum = 91095061;BA.debugLine="Log(SignatureBitmapString.Length)";
__c.LogImpl("591095061",BA.NumberToString(_signaturebitmapstring.length()),0);
RDebugUtils.currentLine=91095063;
 //BA.debugLineNum = 91095063;BA.debugLine="Dim str2 As String=MCode.Decrypted(SignatureBitm";
_str2 = _mcode._decrypted /*String*/ (ba,_signaturebitmapstring);
RDebugUtils.currentLine=91095064;
 //BA.debugLineNum = 91095064;BA.debugLine="If SignatureBitmapString<>\"\" Then";
if ((_signaturebitmapstring).equals("") == false) { 
RDebugUtils.currentLine=91095066;
 //BA.debugLineNum = 91095066;BA.debugLine="imgSign.Bitmap=ReadBlob(str2.Trim)";
__ref._imgsign /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__ref._readblob /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null,_str2.trim()).getObject()));
 };
 } 
       catch (Exception e21) {
			ba.setLastException(e21);RDebugUtils.currentLine=91095069;
 //BA.debugLineNum = 91095069;BA.debugLine="lblSignS.Text=\"\"";
__ref._lblsigns /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=91095070;
 //BA.debugLineNum = 91095070;BA.debugLine="imgSign.Visible=True";
__ref._imgsign /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=91095071;
 //BA.debugLineNum = 91095071;BA.debugLine="Log(\"error emza....\")";
__c.LogImpl("591095071","error emza....",0);
 };
RDebugUtils.currentLine=91095073;
 //BA.debugLineNum = 91095073;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_faktor3_havale_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type1";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=91160576;
 //BA.debugLineNum = 91160576;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=91160577;
 //BA.debugLineNum = 91160577;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=91160578;
 //BA.debugLineNum = 91160578;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=91160579;
 //BA.debugLineNum = 91160579;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_faktor3_havale_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type1";
RDebugUtils.currentLine=91029504;
 //BA.debugLineNum = 91029504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=91029505;
 //BA.debugLineNum = 91029505;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=91029506;
 //BA.debugLineNum = 91029506;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=91029508;
 //BA.debugLineNum = 91029508;BA.debugLine="Private imgSign As ImageView";
_imgsign = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=91029509;
 //BA.debugLineNum = 91029509;BA.debugLine="Private lblTozihat As Label";
_lbltozihat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91029510;
 //BA.debugLineNum = 91029510;BA.debugLine="Private lblSignS As Label";
_lblsigns = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91029512;
 //BA.debugLineNum = 91029512;BA.debugLine="Private LblGHabelePardakht As Label";
_lblghabelepardakht = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91029513;
 //BA.debugLineNum = 91029513;BA.debugLine="Private LblMablaghKhales As Label";
_lblmablaghkhales = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91029515;
 //BA.debugLineNum = 91029515;BA.debugLine="Private lblMandeTasfieNashode As Label";
_lblmandetasfienashode = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91029516;
 //BA.debugLineNum = 91029516;BA.debugLine="Private LblTakhfifKala As Label";
_lbltakhfifkala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91029517;
 //BA.debugLineNum = 91029517;BA.debugLine="Private LblTotalFaktor As Label";
_lbltotalfaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91029519;
 //BA.debugLineNum = 91029519;BA.debugLine="Private lblMablagheKolDaryafti As Label";
_lblmablaghekoldaryafti = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91029520;
 //BA.debugLineNum = 91029520;BA.debugLine="Private LblMablaghTakhfifDaryafti As Label";
_lblmablaghtakhfifdaryafti = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=91029521;
 //BA.debugLineNum = 91029521;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_faktor3_havale_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type1";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=91291648;
 //BA.debugLineNum = 91291648;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=91291649;
 //BA.debugLineNum = 91291649;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=91291650;
 //BA.debugLineNum = 91291650;BA.debugLine="End Sub";
return 0;
}
public int  _getleft(ir.parsikhesab.pakhsh.cls_faktor3_havale_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type1";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=91422720;
 //BA.debugLineNum = 91422720;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=91422721;
 //BA.debugLineNum = 91422721;BA.debugLine="Return pnl_bk.Left";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=91422722;
 //BA.debugLineNum = 91422722;BA.debugLine="End Sub";
return 0;
}
public int  _gettop(ir.parsikhesab.pakhsh.cls_faktor3_havale_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type1";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=91357184;
 //BA.debugLineNum = 91357184;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=91357185;
 //BA.debugLineNum = 91357185;BA.debugLine="Return pnl_bk.Top";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=91357186;
 //BA.debugLineNum = 91357186;BA.debugLine="End Sub";
return 0;
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_faktor3_havale_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type1";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=91226112;
 //BA.debugLineNum = 91226112;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=91226113;
 //BA.debugLineNum = 91226113;BA.debugLine="Return pnl_bk.Width";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=91226114;
 //BA.debugLineNum = 91226114;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _readblob(ir.parsikhesab.pakhsh.cls_faktor3_havale_type1 __ref,String _emza) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor3_havale_type1";
if (Debug.shouldDelegate(ba, "readblob", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "readblob", new Object[] {_emza}));}
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream1 = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap1 = null;
RDebugUtils.currentLine=91488256;
 //BA.debugLineNum = 91488256;BA.debugLine="Sub ReadBlob(emza As String) As Bitmap";
RDebugUtils.currentLine=91488258;
 //BA.debugLineNum = 91488258;BA.debugLine="Dim Buffer() As Byte 'declare an empty byte array";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=91488259;
 //BA.debugLineNum = 91488259;BA.debugLine="Buffer=MCode.Su.DecodeBase64(emza)";
_buffer = _mcode._su /*anywheresoftware.b4a.objects.StringUtils*/ .DecodeBase64(_emza);
RDebugUtils.currentLine=91488261;
 //BA.debugLineNum = 91488261;BA.debugLine="Dim InputStream1 As InputStream";
_inputstream1 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=91488262;
 //BA.debugLineNum = 91488262;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer, 0,";
_inputstream1.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=91488264;
 //BA.debugLineNum = 91488264;BA.debugLine="Dim Bitmap1 As Bitmap";
_bitmap1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=91488265;
 //BA.debugLineNum = 91488265;BA.debugLine="Bitmap1.Initialize2(InputStream1)";
_bitmap1.Initialize2((java.io.InputStream)(_inputstream1.getObject()));
RDebugUtils.currentLine=91488267;
 //BA.debugLineNum = 91488267;BA.debugLine="InputStream1.Close";
_inputstream1.Close();
RDebugUtils.currentLine=91488269;
 //BA.debugLineNum = 91488269;BA.debugLine="Return Bitmap1";
if (true) return _bitmap1;
RDebugUtils.currentLine=91488270;
 //BA.debugLineNum = 91488270;BA.debugLine="End Sub";
return null;
}
}