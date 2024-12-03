package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_imageslideshow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_imageslideshow");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_imageslideshow.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagerow = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_imageslideshow __ref,anywheresoftware.b4a.objects.collections.List _link,int _position,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_imageslideshow";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_link,_position,_item}));}
RDebugUtils.currentLine=92733440;
 //BA.debugLineNum = 92733440;BA.debugLine="Public Sub Show(Link As List,Position As Int,item";
RDebugUtils.currentLine=92733442;
 //BA.debugLineNum = 92733442;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(item.CodeKala)";
_mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = _mcode._getpickala /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (ba,_item.CodeKala /*String*/ );
RDebugUtils.currentLine=92733443;
 //BA.debugLineNum = 92733443;BA.debugLine="ImageRow.Bitmap=MCode.placeHolder";
__ref._imagerow /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=92733444;
 //BA.debugLineNum = 92733444;BA.debugLine="End Sub";
return "";
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_imageslideshow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_imageslideshow";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=92930048;
 //BA.debugLineNum = 92930048;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=92930049;
 //BA.debugLineNum = 92930049;BA.debugLine="Return pnl_bk.Width";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=92930050;
 //BA.debugLineNum = 92930050;BA.debugLine="End Sub";
return 0;
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_imageslideshow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_imageslideshow";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=92864512;
 //BA.debugLineNum = 92864512;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=92864513;
 //BA.debugLineNum = 92864513;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=92864514;
 //BA.debugLineNum = 92864514;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_imageslideshow __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_imageslideshow";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=92667904;
 //BA.debugLineNum = 92667904;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=92667905;
 //BA.debugLineNum = 92667905;BA.debugLine="base = mdl";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mdl));
RDebugUtils.currentLine=92667906;
 //BA.debugLineNum = 92667906;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=92667907;
 //BA.debugLineNum = 92667907;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=92667908;
 //BA.debugLineNum = 92667908;BA.debugLine="p.LoadLayout(\"L_ImageSlide\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("L_ImageSlide",ba);
RDebugUtils.currentLine=92667910;
 //BA.debugLineNum = 92667910;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_imageslideshow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_imageslideshow";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=92798976;
 //BA.debugLineNum = 92798976;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=92798977;
 //BA.debugLineNum = 92798977;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=92798978;
 //BA.debugLineNum = 92798978;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=92798979;
 //BA.debugLineNum = 92798979;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_imageslideshow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_imageslideshow";
RDebugUtils.currentLine=92602368;
 //BA.debugLineNum = 92602368;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=92602369;
 //BA.debugLineNum = 92602369;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=92602370;
 //BA.debugLineNum = 92602370;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=92602371;
 //BA.debugLineNum = 92602371;BA.debugLine="Private base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=92602372;
 //BA.debugLineNum = 92602372;BA.debugLine="Private ImageRow As ImageView";
_imagerow = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=92602373;
 //BA.debugLineNum = 92602373;BA.debugLine="End Sub";
return "";
}
}