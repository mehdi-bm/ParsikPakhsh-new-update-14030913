package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_rec_video extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_rec_video");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_rec_video.class).invoke(this, new Object[] {null});
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
public Object _base = null;
public anywheresoftware.b4a.objects.IME _key = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistvideo _item = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgv = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblplay = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_rec_video __ref,ir.parsikhesab.pakhsh.mcode._adapterlistvideo _item1,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_video";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1,_position}));}
String _link = "";
com.glide.Hitex_Glide _glide = null;
com.glide.Hitex_RequestOptions _requestoptions = null;
RDebugUtils.currentLine=100401152;
 //BA.debugLineNum = 100401152;BA.debugLine="Public Sub Show(Item1 As AdapterListVideo,position";
RDebugUtils.currentLine=100401153;
 //BA.debugLineNum = 100401153;BA.debugLine="item=Item1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistvideo*/  = _item1;
RDebugUtils.currentLine=100401154;
 //BA.debugLineNum = 100401154;BA.debugLine="lblTitle.Text=Item1.fldTitle";
__ref._lbltitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldTitle /*String*/ ));
RDebugUtils.currentLine=100401155;
 //BA.debugLineNum = 100401155;BA.debugLine="Dim Link As String=item.fldImage";
_link = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistvideo*/ .fldImage /*String*/ ;
RDebugUtils.currentLine=100401158;
 //BA.debugLineNum = 100401158;BA.debugLine="Dim Glide As Hitex_Glide";
_glide = new com.glide.Hitex_Glide();
RDebugUtils.currentLine=100401161;
 //BA.debugLineNum = 100401161;BA.debugLine="Dim RequestOptions As Hitex_RequestOptions";
_requestoptions = new com.glide.Hitex_RequestOptions();
RDebugUtils.currentLine=100401162;
 //BA.debugLineNum = 100401162;BA.debugLine="RequestOptions.Initialize.FitCenter";
_requestoptions.Initialize().FitCenter();
RDebugUtils.currentLine=100401164;
 //BA.debugLineNum = 100401164;BA.debugLine="Glide.GetBitmap2(\"Glide\", item.fldTitle, Link, Re";
_glide.GetBitmap2(ba,"Glide",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistvideo*/ .fldTitle /*String*/ ),_link,_requestoptions);
RDebugUtils.currentLine=100401169;
 //BA.debugLineNum = 100401169;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_rec_video __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_video";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=100532224;
 //BA.debugLineNum = 100532224;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=100532225;
 //BA.debugLineNum = 100532225;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=100532226;
 //BA.debugLineNum = 100532226;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_rec_video __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_rec_video";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=100335616;
 //BA.debugLineNum = 100335616;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=100335617;
 //BA.debugLineNum = 100335617;BA.debugLine="Try";
try {RDebugUtils.currentLine=100335618;
 //BA.debugLineNum = 100335618;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=100335619;
 //BA.debugLineNum = 100335619;BA.debugLine="Key.Initialize(\"Key\")";
__ref._key /*anywheresoftware.b4a.objects.IME*/ .Initialize("Key");
RDebugUtils.currentLine=100335620;
 //BA.debugLineNum = 100335620;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=100335621;
 //BA.debugLineNum = 100335621;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=100335622;
 //BA.debugLineNum = 100335622;BA.debugLine="p.LoadLayout(\"l_rec_video\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_rec_video",ba);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=100335627;
 //BA.debugLineNum = 100335627;BA.debugLine="MCode.SendError(LastException)";
_mcode._senderror /*String*/ (ba,BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=100335628;
 //BA.debugLineNum = 100335628;BA.debugLine="Log(LastException)";
__c.LogImpl("5100335628",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=100335630;
 //BA.debugLineNum = 100335630;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_rec_video __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_video";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=100597760;
 //BA.debugLineNum = 100597760;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=100597761;
 //BA.debugLineNum = 100597761;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=100597762;
 //BA.debugLineNum = 100597762;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=100597763;
 //BA.debugLineNum = 100597763;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_rec_video __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_video";
RDebugUtils.currentLine=100270080;
 //BA.debugLineNum = 100270080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=100270081;
 //BA.debugLineNum = 100270081;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=100270082;
 //BA.debugLineNum = 100270082;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=100270083;
 //BA.debugLineNum = 100270083;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=100270084;
 //BA.debugLineNum = 100270084;BA.debugLine="Private Key As IME";
_key = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=100270086;
 //BA.debugLineNum = 100270086;BA.debugLine="Dim item As AdapterListVideo";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistvideo();
RDebugUtils.currentLine=100270087;
 //BA.debugLineNum = 100270087;BA.debugLine="Private lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=100270088;
 //BA.debugLineNum = 100270088;BA.debugLine="Private imgV As ImageView";
_imgv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=100270089;
 //BA.debugLineNum = 100270089;BA.debugLine="Private lblPlay As Label";
_lblplay = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=100270090;
 //BA.debugLineNum = 100270090;BA.debugLine="End Sub";
return "";
}
public String  _glide_ongetbitmap(ir.parsikhesab.pakhsh.cls_rec_video __ref,Object _tag,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _getbitmap) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_video";
if (Debug.shouldDelegate(ba, "glide_ongetbitmap", false))
	 {return ((String) Debug.delegate(ba, "glide_ongetbitmap", new Object[] {_tag,_getbitmap}));}
RDebugUtils.currentLine=100466688;
 //BA.debugLineNum = 100466688;BA.debugLine="Sub Glide_onGetBitmap (Tag As Object, getBitmap As";
RDebugUtils.currentLine=100466689;
 //BA.debugLineNum = 100466689;BA.debugLine="Log(Tag)";
__c.LogImpl("5100466689",BA.ObjectToString(_tag),0);
RDebugUtils.currentLine=100466690;
 //BA.debugLineNum = 100466690;BA.debugLine="Log(getBitmap)";
__c.LogImpl("5100466690",BA.ObjectToString(_getbitmap),0);
RDebugUtils.currentLine=100466691;
 //BA.debugLineNum = 100466691;BA.debugLine="imgV.Bitmap = getBitmap";
__ref._imgv /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_getbitmap.getObject()));
RDebugUtils.currentLine=100466692;
 //BA.debugLineNum = 100466692;BA.debugLine="End Sub";
return "";
}
public String  _lblplay_click(ir.parsikhesab.pakhsh.cls_rec_video __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_video";
if (Debug.shouldDelegate(ba, "lblplay_click", false))
	 {return ((String) Debug.delegate(ba, "lblplay_click", null));}
RDebugUtils.currentLine=100663296;
 //BA.debugLineNum = 100663296;BA.debugLine="Private Sub lblPlay_Click";
RDebugUtils.currentLine=100663298;
 //BA.debugLineNum = 100663298;BA.debugLine="CallSubDelayed2(Act_Video,\"LoadVideo\",item)";
__c.CallSubDelayed2(ba,(Object)(_act_video.getObject()),"LoadVideo",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistvideo*/ ));
RDebugUtils.currentLine=100663299;
 //BA.debugLineNum = 100663299;BA.debugLine="End Sub";
return "";
}
}