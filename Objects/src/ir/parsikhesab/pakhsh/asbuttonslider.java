package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class asbuttonslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.asbuttonslider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.asbuttonslider.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_leftside = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_rightside = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_slidebutton = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _tmp_xpnl_leftside = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _tmp_xpnl_rightside = null;
public int _donwx = 0;
public int _downy = 0;
public boolean _breachedlefttop = false;
public boolean _breachedrightbottom = false;
public String _xbuttonorientation = "";
public int _xlefttopcolor = 0;
public int _xrightbottomcolor = 0;
public int _xsliderbuttoncolor = 0;
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
public anywheresoftware.b4a.objects.B4XViewWrapper  _getlefttoppnl(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "getlefttoppnl", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getlefttoppnl", null));}
RDebugUtils.currentLine=128647168;
 //BA.debugLineNum = 128647168;BA.debugLine="Public Sub getLeftTopPnl As B4XView";
RDebugUtils.currentLine=128647170;
 //BA.debugLineNum = 128647170;BA.debugLine="Return xpnl_leftside";
if (true) return __ref._xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=128647172;
 //BA.debugLineNum = 128647172;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getrightbottompnl(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "getrightbottompnl", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getrightbottompnl", null));}
RDebugUtils.currentLine=128712704;
 //BA.debugLineNum = 128712704;BA.debugLine="Public Sub getRightBottomPnl As B4XView";
RDebugUtils.currentLine=128712706;
 //BA.debugLineNum = 128712706;BA.debugLine="Return xpnl_rightside";
if (true) return __ref._xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=128712708;
 //BA.debugLineNum = 128712708;BA.debugLine="End Sub";
return null;
}
public String  _base_resize(ir.parsikhesab.pakhsh.asbuttonslider __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=128909312;
 //BA.debugLineNum = 128909312;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=128909314;
 //BA.debugLineNum = 128909314;BA.debugLine="If xpnl_leftside.IsInitialized = False Then";
if (__ref._xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=128909316;
 //BA.debugLineNum = 128909316;BA.debugLine="ini_views";
__ref._ini_views /*String*/ (null);
 };
RDebugUtils.currentLine=128909320;
 //BA.debugLineNum = 128909320;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then xpnl_le";
if ((__ref._xbuttonorientation /*String*/ ).equals("Horizontal")) { 
__ref._xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width/(double)2),(int) (_height));}
else {
__ref._xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height/(double)2));};
RDebugUtils.currentLine=128909321;
 //BA.debugLineNum = 128909321;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then xpnl_ri";
if ((__ref._xbuttonorientation /*String*/ ).equals("Horizontal")) { 
__ref._xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width/(double)2),(int) (0),(int) (_width/(double)2),(int) (_height));}
else {
__ref._xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (_height/(double)2),(int) (_width),(int) (_height/(double)2));};
RDebugUtils.currentLine=128909322;
 //BA.debugLineNum = 128909322;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then xpnl_";
if ((__ref._xbuttonorientation /*String*/ ).equals("Horizontal")) { 
__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width/(double)2-_height/(double)2),(int) (0),(int) (_height),(int) (_height));}
else {
__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (_height/(double)2-_width/(double)2),(int) (_width),(int) (_width));};
RDebugUtils.currentLine=128909324;
 //BA.debugLineNum = 128909324;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then tmp_xpn";
if ((__ref._xbuttonorientation /*String*/ ).equals("Horizontal")) { 
__ref._tmp_xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width/(double)2-(_width/(double)3)/(double)2),(int) (0),(int) (_width/(double)3),(int) (_height));}
else {
__ref._tmp_xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (_height/(double)2-(_height/(double)3)/(double)2),(int) (_width),(int) (_height/(double)3));};
RDebugUtils.currentLine=128909325;
 //BA.debugLineNum = 128909325;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then tmp_xpn";
if ((__ref._xbuttonorientation /*String*/ ).equals("Horizontal")) { 
__ref._tmp_xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width/(double)2),(int) (0),(int) (_width/(double)3),(int) (_height));}
else {
__ref._tmp_xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (_height/(double)2),(int) (_width),(int) (_height/(double)3));};
RDebugUtils.currentLine=128909327;
 //BA.debugLineNum = 128909327;BA.debugLine="xpnl_leftside.SetColorAndBorder(xLeftTopColor,0,x";
__ref._xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xlefttopcolor /*int*/ ,(int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=128909328;
 //BA.debugLineNum = 128909328;BA.debugLine="xpnl_rightside.SetColorAndBorder(xRightBottomColo";
__ref._xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xrightbottomcolor /*int*/ ,(int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=128909329;
 //BA.debugLineNum = 128909329;BA.debugLine="xpnl_slidebutton.SetColorAndBorder(xSliderButtonC";
__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xsliderbuttoncolor /*int*/ ,(int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=128909330;
 //BA.debugLineNum = 128909330;BA.debugLine="tmp_xpnl_leftside.Color = xLeftTopColor";
__ref._tmp_xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xlefttopcolor /*int*/ );
RDebugUtils.currentLine=128909331;
 //BA.debugLineNum = 128909331;BA.debugLine="tmp_xpnl_rightside.Color = xRightBottomColor";
__ref._tmp_xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xrightbottomcolor /*int*/ );
RDebugUtils.currentLine=128909333;
 //BA.debugLineNum = 128909333;BA.debugLine="End Sub";
return "";
}
public String  _ini_views(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "ini_views", true))
	 {return ((String) Debug.delegate(ba, "ini_views", null));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=128974848;
 //BA.debugLineNum = 128974848;BA.debugLine="Private Sub ini_views";
RDebugUtils.currentLine=128974850;
 //BA.debugLineNum = 128974850;BA.debugLine="xpnl_leftside = xui.CreatePanel(\"xpnl_leftside\")";
__ref._xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_leftside");
RDebugUtils.currentLine=128974851;
 //BA.debugLineNum = 128974851;BA.debugLine="xpnl_rightside = xui.CreatePanel(\"xpnl_rightside\"";
__ref._xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_rightside");
RDebugUtils.currentLine=128974852;
 //BA.debugLineNum = 128974852;BA.debugLine="xpnl_slidebutton = xui.CreatePanel(\"xpnl_slidebut";
__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_slidebutton");
RDebugUtils.currentLine=128974854;
 //BA.debugLineNum = 128974854;BA.debugLine="tmp_xpnl_leftside = xui.CreatePanel(\"\")";
__ref._tmp_xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=128974855;
 //BA.debugLineNum = 128974855;BA.debugLine="tmp_xpnl_rightside = xui.CreatePanel(\"\")";
__ref._tmp_xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=128974859;
 //BA.debugLineNum = 128974859;BA.debugLine="Private r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=128974860;
 //BA.debugLineNum = 128974860;BA.debugLine="r.Target = xpnl_slidebutton";
_r.Target = (Object)(__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject());
RDebugUtils.currentLine=128974861;
 //BA.debugLineNum = 128974861;BA.debugLine="r.SetOnTouchListener(\"xpnl_slidebutton_Touch2\")";
_r.SetOnTouchListener(ba,"xpnl_slidebutton_Touch2");
RDebugUtils.currentLine=128974864;
 //BA.debugLineNum = 128974864;BA.debugLine="mBase.AddView(tmp_xpnl_leftside,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._tmp_xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=128974865;
 //BA.debugLineNum = 128974865;BA.debugLine="mBase.AddView(tmp_xpnl_rightside,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._tmp_xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=128974867;
 //BA.debugLineNum = 128974867;BA.debugLine="mBase.AddView(xpnl_leftside,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_leftside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=128974868;
 //BA.debugLineNum = 128974868;BA.debugLine="mBase.AddView(xpnl_rightside,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_rightside /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=128974869;
 //BA.debugLineNum = 128974869;BA.debugLine="mBase.AddView(xpnl_slidebutton,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=128974871;
 //BA.debugLineNum = 128974871;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
RDebugUtils.currentLine=127795200;
 //BA.debugLineNum = 127795200;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=127795201;
 //BA.debugLineNum = 127795201;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=127795202;
 //BA.debugLineNum = 127795202;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=127795203;
 //BA.debugLineNum = 127795203;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=127795204;
 //BA.debugLineNum = 127795204;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=127795206;
 //BA.debugLineNum = 127795206;BA.debugLine="Private xpnl_leftside,xpnl_rightside,xpnl_slidebu";
_xpnl_leftside = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_rightside = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_slidebutton = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=127795207;
 //BA.debugLineNum = 127795207;BA.debugLine="Private tmp_xpnl_leftside,tmp_xpnl_rightside As B";
_tmp_xpnl_leftside = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tmp_xpnl_rightside = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=127795209;
 //BA.debugLineNum = 127795209;BA.debugLine="Private donwx,downy As Int";
_donwx = 0;
_downy = 0;
RDebugUtils.currentLine=127795211;
 //BA.debugLineNum = 127795211;BA.debugLine="Private bReachedLeftTop,bReachedRightBottom As Bo";
_breachedlefttop = false;
_breachedrightbottom = __c.False;
RDebugUtils.currentLine=127795214;
 //BA.debugLineNum = 127795214;BA.debugLine="Private xButtonOrientation As String";
_xbuttonorientation = "";
RDebugUtils.currentLine=127795215;
 //BA.debugLineNum = 127795215;BA.debugLine="Private xLeftTopColor,xRightBottomColor,xSliderBu";
_xlefttopcolor = 0;
_xrightbottomcolor = 0;
_xsliderbuttoncolor = 0;
RDebugUtils.currentLine=127795217;
 //BA.debugLineNum = 127795217;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(ir.parsikhesab.pakhsh.asbuttonslider __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=127926272;
 //BA.debugLineNum = 127926272;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=127926273;
 //BA.debugLineNum = 127926273;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=127926275;
 //BA.debugLineNum = 127926275;BA.debugLine="ini_props(Props)";
__ref._ini_props /*String*/ (null,_props);
RDebugUtils.currentLine=127926279;
 //BA.debugLineNum = 127926279;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=127926283;
 //BA.debugLineNum = 127926283;BA.debugLine="End Sub";
return "";
}
public String  _ini_props(ir.parsikhesab.pakhsh.asbuttonslider __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "ini_props", true))
	 {return ((String) Debug.delegate(ba, "ini_props", new Object[] {_props}));}
RDebugUtils.currentLine=128843776;
 //BA.debugLineNum = 128843776;BA.debugLine="Private Sub ini_props(Props As Map)";
RDebugUtils.currentLine=128843778;
 //BA.debugLineNum = 128843778;BA.debugLine="xButtonOrientation = Props.Get(\"ButtonOrientation";
__ref._xbuttonorientation /*String*/  = BA.ObjectToString(_props.Get((Object)("ButtonOrientation")));
RDebugUtils.currentLine=128843779;
 //BA.debugLineNum = 128843779;BA.debugLine="xLeftTopColor = xui.PaintOrColorToColor(Props.Get";
__ref._xlefttopcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("LeftTopColor")));
RDebugUtils.currentLine=128843780;
 //BA.debugLineNum = 128843780;BA.debugLine="xRightBottomColor = xui.PaintOrColorToColor( Prop";
__ref._xrightbottomcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("RightBottomColor")));
RDebugUtils.currentLine=128843781;
 //BA.debugLineNum = 128843781;BA.debugLine="xSliderButtonColor = xui.PaintOrColorToColor( Pro";
__ref._xsliderbuttoncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SliderButtonColor")));
RDebugUtils.currentLine=128843783;
 //BA.debugLineNum = 128843783;BA.debugLine="End Sub";
return "";
}
public String  _dropslider(ir.parsikhesab.pakhsh.asbuttonslider __ref,boolean _lefttop) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "dropslider", true))
	 {return ((String) Debug.delegate(ba, "dropslider", new Object[] {_lefttop}));}
RDebugUtils.currentLine=129236992;
 //BA.debugLineNum = 129236992;BA.debugLine="Private Sub DropSlider(LeftTop As Boolean)";
RDebugUtils.currentLine=129236994;
 //BA.debugLineNum = 129236994;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_DropSl";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DropSlider",(int) (0))) { 
RDebugUtils.currentLine=129236995;
 //BA.debugLineNum = 129236995;BA.debugLine="CallSub2(mCallBack, mEventName & \"_DropSlider\",L";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DropSlider",(Object)(_lefttop));
 };
RDebugUtils.currentLine=129236998;
 //BA.debugLineNum = 129236998;BA.debugLine="End Sub";
return "";
}
public String  _getbuttonorientation(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "getbuttonorientation", true))
	 {return ((String) Debug.delegate(ba, "getbuttonorientation", null));}
RDebugUtils.currentLine=127991808;
 //BA.debugLineNum = 127991808;BA.debugLine="Public Sub getButtonOrientation As String";
RDebugUtils.currentLine=127991810;
 //BA.debugLineNum = 127991810;BA.debugLine="Return xButtonOrientation";
if (true) return __ref._xbuttonorientation /*String*/ ;
RDebugUtils.currentLine=127991812;
 //BA.debugLineNum = 127991812;BA.debugLine="End Sub";
return "";
}
public String  _getbuttonorientation_horizontal(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "getbuttonorientation_horizontal", true))
	 {return ((String) Debug.delegate(ba, "getbuttonorientation_horizontal", null));}
RDebugUtils.currentLine=128122880;
 //BA.debugLineNum = 128122880;BA.debugLine="Public Sub getBUTTONORIENTATION_HORIZONTAL As Stri";
RDebugUtils.currentLine=128122882;
 //BA.debugLineNum = 128122882;BA.debugLine="Return \"Horizontal\"";
if (true) return "Horizontal";
RDebugUtils.currentLine=128122884;
 //BA.debugLineNum = 128122884;BA.debugLine="End Sub";
return "";
}
public String  _getbuttonorientation_vertical(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "getbuttonorientation_vertical", true))
	 {return ((String) Debug.delegate(ba, "getbuttonorientation_vertical", null));}
RDebugUtils.currentLine=128188416;
 //BA.debugLineNum = 128188416;BA.debugLine="Public Sub getBUTTONORIENTATION_VERTICAL As String";
RDebugUtils.currentLine=128188418;
 //BA.debugLineNum = 128188418;BA.debugLine="Return \"Vertical\"";
if (true) return "Vertical";
RDebugUtils.currentLine=128188420;
 //BA.debugLineNum = 128188420;BA.debugLine="End Sub";
return "";
}
public int  _getlefttopcolor(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "getlefttopcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getlefttopcolor", null));}
RDebugUtils.currentLine=128253952;
 //BA.debugLineNum = 128253952;BA.debugLine="Public Sub getLeftTopColor As Int";
RDebugUtils.currentLine=128253954;
 //BA.debugLineNum = 128253954;BA.debugLine="Return xLeftTopColor";
if (true) return __ref._xlefttopcolor /*int*/ ;
RDebugUtils.currentLine=128253956;
 //BA.debugLineNum = 128253956;BA.debugLine="End Sub";
return 0;
}
public int  _getrightbottomcolor(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "getrightbottomcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getrightbottomcolor", null));}
RDebugUtils.currentLine=128385024;
 //BA.debugLineNum = 128385024;BA.debugLine="Public Sub getRightBottomColor As Int";
RDebugUtils.currentLine=128385026;
 //BA.debugLineNum = 128385026;BA.debugLine="Return xRightBottomColor";
if (true) return __ref._xrightbottomcolor /*int*/ ;
RDebugUtils.currentLine=128385028;
 //BA.debugLineNum = 128385028;BA.debugLine="End Sub";
return 0;
}
public int  _getsliderbuttoncolor(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "getsliderbuttoncolor", true))
	 {return ((Integer) Debug.delegate(ba, "getsliderbuttoncolor", null));}
RDebugUtils.currentLine=128516096;
 //BA.debugLineNum = 128516096;BA.debugLine="Public Sub getSliderButtonColor As Int";
RDebugUtils.currentLine=128516098;
 //BA.debugLineNum = 128516098;BA.debugLine="Return xSliderButtonColor";
if (true) return __ref._xsliderbuttoncolor /*int*/ ;
RDebugUtils.currentLine=128516100;
 //BA.debugLineNum = 128516100;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getsliderbuttonpnl(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "getsliderbuttonpnl", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getsliderbuttonpnl", null));}
RDebugUtils.currentLine=128778240;
 //BA.debugLineNum = 128778240;BA.debugLine="Public Sub getSliderButtonPnl As B4XView";
RDebugUtils.currentLine=128778242;
 //BA.debugLineNum = 128778242;BA.debugLine="Return xpnl_slidebutton";
if (true) return __ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=128778244;
 //BA.debugLineNum = 128778244;BA.debugLine="End Sub";
return null;
}
public String  _initialize(ir.parsikhesab.pakhsh.asbuttonslider __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=127860736;
 //BA.debugLineNum = 127860736;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=127860737;
 //BA.debugLineNum = 127860737;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=127860738;
 //BA.debugLineNum = 127860738;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=127860739;
 //BA.debugLineNum = 127860739;BA.debugLine="End Sub";
return "";
}
public String  _lefttopclick(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "lefttopclick", true))
	 {return ((String) Debug.delegate(ba, "lefttopclick", null));}
RDebugUtils.currentLine=129433600;
 //BA.debugLineNum = 129433600;BA.debugLine="Private Sub LeftTopClick";
RDebugUtils.currentLine=129433602;
 //BA.debugLineNum = 129433602;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_LeftTo";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LeftTopClick",(int) (0))) { 
RDebugUtils.currentLine=129433603;
 //BA.debugLineNum = 129433603;BA.debugLine="CallSub(mCallBack, mEventName & \"_LeftTopClick\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LeftTopClick");
 };
RDebugUtils.currentLine=129433606;
 //BA.debugLineNum = 129433606;BA.debugLine="End Sub";
return "";
}
public String  _reachedlefttop(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "reachedlefttop", true))
	 {return ((String) Debug.delegate(ba, "reachedlefttop", null));}
RDebugUtils.currentLine=129302528;
 //BA.debugLineNum = 129302528;BA.debugLine="Private Sub ReachedLeftTop";
RDebugUtils.currentLine=129302530;
 //BA.debugLineNum = 129302530;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Reache";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ReachedLeftTop",(int) (0))) { 
RDebugUtils.currentLine=129302531;
 //BA.debugLineNum = 129302531;BA.debugLine="CallSub(mCallBack, mEventName & \"_ReachedLeftTop";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ReachedLeftTop");
 };
RDebugUtils.currentLine=129302534;
 //BA.debugLineNum = 129302534;BA.debugLine="End Sub";
return "";
}
public String  _reachedrightbottom(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "reachedrightbottom", true))
	 {return ((String) Debug.delegate(ba, "reachedrightbottom", null));}
RDebugUtils.currentLine=129368064;
 //BA.debugLineNum = 129368064;BA.debugLine="Private Sub ReachedRightBottom";
RDebugUtils.currentLine=129368066;
 //BA.debugLineNum = 129368066;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Reache";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ReachedRightBottom",(int) (0))) { 
RDebugUtils.currentLine=129368067;
 //BA.debugLineNum = 129368067;BA.debugLine="CallSub(mCallBack, mEventName & \"_ReachedRightBo";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ReachedRightBottom");
 };
RDebugUtils.currentLine=129368070;
 //BA.debugLineNum = 129368070;BA.debugLine="End Sub";
return "";
}
public String  _rightbottomclick(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "rightbottomclick", true))
	 {return ((String) Debug.delegate(ba, "rightbottomclick", null));}
RDebugUtils.currentLine=129499136;
 //BA.debugLineNum = 129499136;BA.debugLine="Private Sub RightBottomClick";
RDebugUtils.currentLine=129499138;
 //BA.debugLineNum = 129499138;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_RightB";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_RightBottomClick",(int) (0))) { 
RDebugUtils.currentLine=129499139;
 //BA.debugLineNum = 129499139;BA.debugLine="CallSub(mCallBack, mEventName & \"_RightBottomCli";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_RightBottomClick");
 };
RDebugUtils.currentLine=129499142;
 //BA.debugLineNum = 129499142;BA.debugLine="End Sub";
return "";
}
public String  _setbuttonorientation(ir.parsikhesab.pakhsh.asbuttonslider __ref,String _orientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "setbuttonorientation", true))
	 {return ((String) Debug.delegate(ba, "setbuttonorientation", new Object[] {_orientation}));}
RDebugUtils.currentLine=128057344;
 //BA.debugLineNum = 128057344;BA.debugLine="Public Sub setButtonOrientation(Orientation As Str";
RDebugUtils.currentLine=128057346;
 //BA.debugLineNum = 128057346;BA.debugLine="If Orientation = \"Horizontal\" Or Orientation = \"V";
if ((_orientation).equals("Horizontal") || (_orientation).equals("Vertical")) { 
RDebugUtils.currentLine=128057348;
 //BA.debugLineNum = 128057348;BA.debugLine="xButtonOrientation = Orientation";
__ref._xbuttonorientation /*String*/  = _orientation;
 }else {
RDebugUtils.currentLine=128057352;
 //BA.debugLineNum = 128057352;BA.debugLine="xButtonOrientation = \"Horizontal\"";
__ref._xbuttonorientation /*String*/  = "Horizontal";
 };
RDebugUtils.currentLine=128057356;
 //BA.debugLineNum = 128057356;BA.debugLine="End Sub";
return "";
}
public String  _setlefttopcolor(ir.parsikhesab.pakhsh.asbuttonslider __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "setlefttopcolor", true))
	 {return ((String) Debug.delegate(ba, "setlefttopcolor", new Object[] {_color}));}
RDebugUtils.currentLine=128319488;
 //BA.debugLineNum = 128319488;BA.debugLine="Public Sub setLeftTopColor(Color As Int)";
RDebugUtils.currentLine=128319490;
 //BA.debugLineNum = 128319490;BA.debugLine="xLeftTopColor = Color";
__ref._xlefttopcolor /*int*/  = _color;
RDebugUtils.currentLine=128319491;
 //BA.debugLineNum = 128319491;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=128319493;
 //BA.debugLineNum = 128319493;BA.debugLine="End Sub";
return "";
}
public String  _setrightbottomcolor(ir.parsikhesab.pakhsh.asbuttonslider __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "setrightbottomcolor", true))
	 {return ((String) Debug.delegate(ba, "setrightbottomcolor", new Object[] {_color}));}
RDebugUtils.currentLine=128450560;
 //BA.debugLineNum = 128450560;BA.debugLine="Public Sub setRightBottomColor(Color As Int)";
RDebugUtils.currentLine=128450562;
 //BA.debugLineNum = 128450562;BA.debugLine="xRightBottomColor = Color";
__ref._xrightbottomcolor /*int*/  = _color;
RDebugUtils.currentLine=128450563;
 //BA.debugLineNum = 128450563;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=128450565;
 //BA.debugLineNum = 128450565;BA.debugLine="End Sub";
return "";
}
public String  _setsliderbuttoncolor(ir.parsikhesab.pakhsh.asbuttonslider __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "setsliderbuttoncolor", true))
	 {return ((String) Debug.delegate(ba, "setsliderbuttoncolor", new Object[] {_color}));}
RDebugUtils.currentLine=128581632;
 //BA.debugLineNum = 128581632;BA.debugLine="Public Sub setSliderButtonColor(Color As Int)";
RDebugUtils.currentLine=128581634;
 //BA.debugLineNum = 128581634;BA.debugLine="xSliderButtonColor = Color";
__ref._xsliderbuttoncolor /*int*/  = _color;
RDebugUtils.currentLine=128581635;
 //BA.debugLineNum = 128581635;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=128581637;
 //BA.debugLineNum = 128581637;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_leftside_click(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "xpnl_leftside_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_leftside_click", null));}
RDebugUtils.currentLine=129040384;
 //BA.debugLineNum = 129040384;BA.debugLine="Private Sub xpnl_leftside_Click";
RDebugUtils.currentLine=129040385;
 //BA.debugLineNum = 129040385;BA.debugLine="LeftTopClick";
__ref._lefttopclick /*String*/ (null);
RDebugUtils.currentLine=129040386;
 //BA.debugLineNum = 129040386;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_rightside_click(ir.parsikhesab.pakhsh.asbuttonslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "xpnl_rightside_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_rightside_click", null));}
RDebugUtils.currentLine=129105920;
 //BA.debugLineNum = 129105920;BA.debugLine="Private Sub xpnl_rightside_Click";
RDebugUtils.currentLine=129105921;
 //BA.debugLineNum = 129105921;BA.debugLine="RightBottomClick";
__ref._rightbottomclick /*String*/ (null);
RDebugUtils.currentLine=129105922;
 //BA.debugLineNum = 129105922;BA.debugLine="End Sub";
return "";
}
public boolean  _xpnl_slidebutton_touch2(ir.parsikhesab.pakhsh.asbuttonslider __ref,Object _o,int _action,float _x,float _y,Object _motion) throws Exception{
__ref = this;
RDebugUtils.currentModule="asbuttonslider";
if (Debug.shouldDelegate(ba, "xpnl_slidebutton_touch2", true))
	 {return ((Boolean) Debug.delegate(ba, "xpnl_slidebutton_touch2", new Object[] {_o,_action,_x,_y,_motion}));}
RDebugUtils.currentLine=129171456;
 //BA.debugLineNum = 129171456;BA.debugLine="Private Sub xpnl_slidebutton_Touch2 (o As Object,";
RDebugUtils.currentLine=129171461;
 //BA.debugLineNum = 129171461;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then";
if ((__ref._xbuttonorientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=129171463;
 //BA.debugLineNum = 129171463;BA.debugLine="If ACTION = xpnl_slidebutton.TOUCH_ACTION_DOWN T";
if (_action==__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=129171465;
 //BA.debugLineNum = 129171465;BA.debugLine="donwx = X";
__ref._donwx /*int*/  = (int) (_x);
 }else 
{RDebugUtils.currentLine=129171467;
 //BA.debugLineNum = 129171467;BA.debugLine="Else if ACTION = xpnl_slidebutton.TOUCH_ACTION_M";
if (_action==__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=129171469;
 //BA.debugLineNum = 129171469;BA.debugLine="If xpnl_slidebutton.Left + x - donwx + xpnl_sli";
if (__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_x-__ref._donwx /*int*/ +__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()) { 
RDebugUtils.currentLine=129171470;
 //BA.debugLineNum = 129171470;BA.debugLine="xpnl_slidebutton.Left = Max(0,xpnl_slidebutton";
__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (__c.Max(0,__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_x-__ref._donwx /*int*/ )));
 }else {
RDebugUtils.currentLine=129171472;
 //BA.debugLineNum = 129171472;BA.debugLine="xpnl_slidebutton.Left = Min(mBase.Width - xpnl";
__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_x-__ref._donwx /*int*/ +__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
 };
RDebugUtils.currentLine=129171475;
 //BA.debugLineNum = 129171475;BA.debugLine="If xpnl_slidebutton.Left = 0 Then";
if (__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()==0) { 
RDebugUtils.currentLine=129171477;
 //BA.debugLineNum = 129171477;BA.debugLine="If bReachedLeftTop = False Then	ReachedLeftTop";
if (__ref._breachedlefttop /*boolean*/ ==__c.False) { 
__ref._reachedlefttop /*String*/ (null);};
RDebugUtils.currentLine=129171478;
 //BA.debugLineNum = 129171478;BA.debugLine="bReachedLeftTop = True";
__ref._breachedlefttop /*boolean*/  = __c.True;
 }else 
{RDebugUtils.currentLine=129171480;
 //BA.debugLineNum = 129171480;BA.debugLine="Else if xpnl_slidebutton.Left + xpnl_slidebutto";
if (__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()) { 
RDebugUtils.currentLine=129171482;
 //BA.debugLineNum = 129171482;BA.debugLine="If bReachedRightBottom = False Then	ReachedRig";
if (__ref._breachedrightbottom /*boolean*/ ==__c.False) { 
__ref._reachedrightbottom /*String*/ (null);};
RDebugUtils.currentLine=129171483;
 //BA.debugLineNum = 129171483;BA.debugLine="bReachedRightBottom = True";
__ref._breachedrightbottom /*boolean*/  = __c.True;
 }}
;
 }else 
{RDebugUtils.currentLine=129171487;
 //BA.debugLineNum = 129171487;BA.debugLine="else If xpnl_slidebutton.TOUCH_ACTION_UP = ACTIO";
if (__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP==_action) { 
RDebugUtils.currentLine=129171489;
 //BA.debugLineNum = 129171489;BA.debugLine="If xpnl_slidebutton.Left + xpnl_slidebutton.Wid";
if (__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2) { 
__ref._dropslider /*String*/ (null,__c.True);}
else {
__ref._dropslider /*String*/ (null,__c.False);};
RDebugUtils.currentLine=129171491;
 //BA.debugLineNum = 129171491;BA.debugLine="xpnl_slidebutton.SetLayoutAnimated(0,mBase.Widt";
__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=129171493;
 //BA.debugLineNum = 129171493;BA.debugLine="bReachedLeftTop = False";
__ref._breachedlefttop /*boolean*/  = __c.False;
RDebugUtils.currentLine=129171494;
 //BA.debugLineNum = 129171494;BA.debugLine="bReachedRightBottom = False";
__ref._breachedrightbottom /*boolean*/  = __c.False;
 }}}
;
 }else {
RDebugUtils.currentLine=129171501;
 //BA.debugLineNum = 129171501;BA.debugLine="If ACTION = xpnl_slidebutton.TOUCH_ACTION_DOWN T";
if (_action==__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=129171503;
 //BA.debugLineNum = 129171503;BA.debugLine="downy  = y";
__ref._downy /*int*/  = (int) (_y);
 }else 
{RDebugUtils.currentLine=129171505;
 //BA.debugLineNum = 129171505;BA.debugLine="Else if ACTION = xpnl_slidebutton.TOUCH_ACTION_M";
if (_action==__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=129171507;
 //BA.debugLineNum = 129171507;BA.debugLine="If xpnl_slidebutton.Top + y - downy + xpnl_sli";
if (__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+_y-__ref._downy /*int*/ +__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=129171508;
 //BA.debugLineNum = 129171508;BA.debugLine="xpnl_slidebutton.Top = Max(0,xpnl_slidebutton.";
__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (__c.Max(0,__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+_y-__ref._downy /*int*/ )));
 }else {
RDebugUtils.currentLine=129171510;
 //BA.debugLineNum = 129171510;BA.debugLine="xpnl_slidebutton.Top = Min(mBase.Height - xpnl";
__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+_y-__ref._downy /*int*/ +__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
 };
RDebugUtils.currentLine=129171513;
 //BA.debugLineNum = 129171513;BA.debugLine="If xpnl_slidebutton.Top = 0 Then";
if (__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()==0) { 
RDebugUtils.currentLine=129171515;
 //BA.debugLineNum = 129171515;BA.debugLine="If bReachedLeftTop = False Then	ReachedLeftTop";
if (__ref._breachedlefttop /*boolean*/ ==__c.False) { 
__ref._reachedlefttop /*String*/ (null);};
RDebugUtils.currentLine=129171516;
 //BA.debugLineNum = 129171516;BA.debugLine="bReachedLeftTop = True";
__ref._breachedlefttop /*boolean*/  = __c.True;
 }else 
{RDebugUtils.currentLine=129171518;
 //BA.debugLineNum = 129171518;BA.debugLine="Else if xpnl_slidebutton.Top + xpnl_slidebutton";
if (__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=129171520;
 //BA.debugLineNum = 129171520;BA.debugLine="If bReachedRightBottom = False Then	ReachedRig";
if (__ref._breachedrightbottom /*boolean*/ ==__c.False) { 
__ref._reachedrightbottom /*String*/ (null);};
RDebugUtils.currentLine=129171521;
 //BA.debugLineNum = 129171521;BA.debugLine="bReachedRightBottom = True";
__ref._breachedrightbottom /*boolean*/  = __c.True;
 }}
;
 }else 
{RDebugUtils.currentLine=129171525;
 //BA.debugLineNum = 129171525;BA.debugLine="else If xpnl_slidebutton.TOUCH_ACTION_UP = ACTIO";
if (__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP==_action) { 
RDebugUtils.currentLine=129171527;
 //BA.debugLineNum = 129171527;BA.debugLine="If xpnl_slidebutton.Top + xpnl_slidebutton.Heig";
if (__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2) { 
__ref._dropslider /*String*/ (null,__c.True);}
else {
__ref._dropslider /*String*/ (null,__c.False);};
RDebugUtils.currentLine=129171531;
 //BA.debugLineNum = 129171531;BA.debugLine="xpnl_slidebutton.SetLayoutAnimated(0,0,mBase.He";
__ref._xpnl_slidebutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=129171533;
 //BA.debugLineNum = 129171533;BA.debugLine="bReachedLeftTop = False";
__ref._breachedlefttop /*boolean*/  = __c.False;
RDebugUtils.currentLine=129171534;
 //BA.debugLineNum = 129171534;BA.debugLine="bReachedRightBottom = False";
__ref._breachedrightbottom /*boolean*/  = __c.False;
 }}}
;
 };
RDebugUtils.currentLine=129171542;
 //BA.debugLineNum = 129171542;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=129171544;
 //BA.debugLineNum = 129171544;BA.debugLine="End Sub";
return false;
}
}