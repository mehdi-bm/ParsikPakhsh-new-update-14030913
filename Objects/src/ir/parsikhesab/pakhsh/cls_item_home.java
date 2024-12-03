package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_item_home extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_item_home");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_item_home.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ImageViewWrapper _imgv = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_item_home __ref,ir.parsikhesab.pakhsh.mcode._adapteritemhome _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_item_home";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item}));}
RDebugUtils.currentLine=93126656;
 //BA.debugLineNum = 93126656;BA.debugLine="Public Sub show(item As AdapterItemHome)";
RDebugUtils.currentLine=93126657;
 //BA.debugLineNum = 93126657;BA.debugLine="imgV.Bitmap=LoadBitmap(File.DirAssets,item.img)";
__ref._imgv /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),_item.img /*String*/ ).getObject()));
RDebugUtils.currentLine=93126658;
 //BA.debugLineNum = 93126658;BA.debugLine="lblTitle.Text=item.title";
__ref._lbltitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item.title /*String*/ ));
RDebugUtils.currentLine=93126659;
 //BA.debugLineNum = 93126659;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_item_home __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_item_home";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=93257728;
 //BA.debugLineNum = 93257728;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=93257729;
 //BA.debugLineNum = 93257729;BA.debugLine="Return pnl_BK.Height+20dip";
if (true) return (int) (__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()+__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=93257730;
 //BA.debugLineNum = 93257730;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_item_home __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_item_home";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=93061120;
 //BA.debugLineNum = 93061120;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=93061121;
 //BA.debugLineNum = 93061121;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=93061122;
 //BA.debugLineNum = 93061122;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=93061123;
 //BA.debugLineNum = 93061123;BA.debugLine="p.LoadLayout(\"l_item_home\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_item_home",ba);
RDebugUtils.currentLine=93061124;
 //BA.debugLineNum = 93061124;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_item_home __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_item_home";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=93192192;
 //BA.debugLineNum = 93192192;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=93192193;
 //BA.debugLineNum = 93192193;BA.debugLine="pnl_BK.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=93192194;
 //BA.debugLineNum = 93192194;BA.debugLine="Return pnl_BK";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=93192195;
 //BA.debugLineNum = 93192195;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_item_home __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_item_home";
RDebugUtils.currentLine=92995584;
 //BA.debugLineNum = 92995584;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=92995585;
 //BA.debugLineNum = 92995585;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=92995586;
 //BA.debugLineNum = 92995586;BA.debugLine="Private pnl_BK As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=92995587;
 //BA.debugLineNum = 92995587;BA.debugLine="Private imgV As ImageView";
_imgv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=92995588;
 //BA.debugLineNum = 92995588;BA.debugLine="Private lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=92995589;
 //BA.debugLineNum = 92995589;BA.debugLine="End Sub";
return "";
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_item_home __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_item_home";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=93323264;
 //BA.debugLineNum = 93323264;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=93323265;
 //BA.debugLineNum = 93323265;BA.debugLine="Return pnl_BK.Width+5dip";
if (true) return (int) (__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=93323266;
 //BA.debugLineNum = 93323266;BA.debugLine="End Sub";
return 0;
}
public String  _pnl_bk_click(ir.parsikhesab.pakhsh.cls_item_home __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_item_home";
if (Debug.shouldDelegate(ba, "pnl_bk_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_bk_click", null));}
RDebugUtils.currentLine=93388800;
 //BA.debugLineNum = 93388800;BA.debugLine="Private Sub pnl_bk_Click";
RDebugUtils.currentLine=93388802;
 //BA.debugLineNum = 93388802;BA.debugLine="End Sub";
return "";
}
}