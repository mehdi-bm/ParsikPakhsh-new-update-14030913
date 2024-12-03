package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class swiftbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.swiftbutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.swiftbutton.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public int _clr1 = 0;
public int _clr2 = 0;
public int _disabledcolor = 0;
public boolean _pressed = false;
public Object _tag = null;
public boolean _mdisabled = false;
public int _cornersradius = 0;
public int _sideheight = 0;
public boolean _mhaptic = false;
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
public String  _base_resize(ir.parsikhesab.pakhsh.swiftbutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=154140672;
 //BA.debugLineNum = 154140672;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=154140673;
 //BA.debugLineNum = 154140673;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=154140674;
 //BA.debugLineNum = 154140674;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=154140675;
 //BA.debugLineNum = 154140675;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
RDebugUtils.currentLine=154140677;
 //BA.debugLineNum = 154140677;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=154140678;
 //BA.debugLineNum = 154140678;BA.debugLine="End Sub";
return "";
}
public String  _draw(ir.parsikhesab.pakhsh.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _c = 0;
RDebugUtils.currentLine=154599424;
 //BA.debugLineNum = 154599424;BA.debugLine="Private Sub Draw";
RDebugUtils.currentLine=154599425;
 //BA.debugLineNum = 154599425;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=154599426;
 //BA.debugLineNum = 154599426;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=154599427;
 //BA.debugLineNum = 154599427;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=154599428;
 //BA.debugLineNum = 154599428;BA.debugLine="r.Initialize(0, SideHeight, mBase.Width, mBase.He";
_r.Initialize((float) (0),(float) (__ref._sideheight /*int*/ ),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=154599429;
 //BA.debugLineNum = 154599429;BA.debugLine="If pressed = False Then";
if (__ref._pressed /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=154599430;
 //BA.debugLineNum = 154599430;BA.debugLine="xLBL.Top = 0";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (0));
RDebugUtils.currentLine=154599431;
 //BA.debugLineNum = 154599431;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=154599432;
 //BA.debugLineNum = 154599432;BA.debugLine="cvs.DrawPath(p, clr2, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._clr2 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=154599433;
 //BA.debugLineNum = 154599433;BA.debugLine="r.Initialize(0, 0, mBase.Width, mBase.Height - S";
_r.Initialize((float) (0),(float) (0),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._sideheight /*int*/ ));
RDebugUtils.currentLine=154599434;
 //BA.debugLineNum = 154599434;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=154599435;
 //BA.debugLineNum = 154599435;BA.debugLine="cvs.DrawPath(p, clr1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._clr1 /*int*/ ,__c.True,(float) (0));
 }else {
RDebugUtils.currentLine=154599437;
 //BA.debugLineNum = 154599437;BA.debugLine="xLBL.Top = SideHeight";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(__ref._sideheight /*int*/ );
RDebugUtils.currentLine=154599438;
 //BA.debugLineNum = 154599438;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=154599439;
 //BA.debugLineNum = 154599439;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=154599440;
 //BA.debugLineNum = 154599440;BA.debugLine="If mDisabled Then c = disabledColor Else c = clr";
if (__ref._mdisabled /*boolean*/ ) { 
_c = __ref._disabledcolor /*int*/ ;}
else {
_c = __ref._clr1 /*int*/ ;};
RDebugUtils.currentLine=154599441;
 //BA.debugLineNum = 154599441;BA.debugLine="cvs.DrawPath(p, c, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_c,__c.True,(float) (0));
 };
RDebugUtils.currentLine=154599444;
 //BA.debugLineNum = 154599444;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=154599445;
 //BA.debugLineNum = 154599445;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
RDebugUtils.currentLine=153944064;
 //BA.debugLineNum = 153944064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=153944065;
 //BA.debugLineNum = 153944065;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=153944066;
 //BA.debugLineNum = 153944066;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=153944067;
 //BA.debugLineNum = 153944067;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=153944068;
 //BA.debugLineNum = 153944068;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=153944069;
 //BA.debugLineNum = 153944069;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=153944070;
 //BA.debugLineNum = 153944070;BA.debugLine="Public xLBL As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=153944071;
 //BA.debugLineNum = 153944071;BA.debugLine="Public clr1, clr2, disabledColor As Int";
_clr1 = 0;
_clr2 = 0;
_disabledcolor = 0;
RDebugUtils.currentLine=153944072;
 //BA.debugLineNum = 153944072;BA.debugLine="Private pressed As Boolean";
_pressed = false;
RDebugUtils.currentLine=153944073;
 //BA.debugLineNum = 153944073;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=153944074;
 //BA.debugLineNum = 153944074;BA.debugLine="Private mDisabled As Boolean";
_mdisabled = false;
RDebugUtils.currentLine=153944075;
 //BA.debugLineNum = 153944075;BA.debugLine="Public CornersRadius, SideHeight As Int";
_cornersradius = 0;
_sideheight = 0;
RDebugUtils.currentLine=153944076;
 //BA.debugLineNum = 153944076;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=153944077;
 //BA.debugLineNum = 153944077;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(ir.parsikhesab.pakhsh.swiftbutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=154075136;
 //BA.debugLineNum = 154075136;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=154075137;
 //BA.debugLineNum = 154075137;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=154075138;
 //BA.debugLineNum = 154075138;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=154075138;
 //BA.debugLineNum = 154075138;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=154075139;
 //BA.debugLineNum = 154075139;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"p\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"p");
RDebugUtils.currentLine=154075140;
 //BA.debugLineNum = 154075140;BA.debugLine="p.Color = xui.Color_Transparent";
_p.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=154075141;
 //BA.debugLineNum = 154075141;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"Primary";
__ref._clr1 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("PrimaryColor")));
RDebugUtils.currentLine=154075142;
 //BA.debugLineNum = 154075142;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"Seconda";
__ref._clr2 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SecondaryColor")));
RDebugUtils.currentLine=154075143;
 //BA.debugLineNum = 154075143;BA.debugLine="disabledColor = xui.PaintOrColorToColor(Props.Get";
__ref._disabledcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("DisabledColor"),(Object)(((int)0xff999999))));
RDebugUtils.currentLine=154075144;
 //BA.debugLineNum = 154075144;BA.debugLine="CornersRadius = DipToCurrent(Props.GetDefault(\"Co";
__ref._cornersradius /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(15)))));
RDebugUtils.currentLine=154075145;
 //BA.debugLineNum = 154075145;BA.debugLine="SideHeight = DipToCurrent(Props.GetDefault(\"SideH";
__ref._sideheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("SideHeight"),(Object)(5)))));
RDebugUtils.currentLine=154075146;
 //BA.debugLineNum = 154075146;BA.debugLine="mDisabled = Not(Props.GetDefault(\"ButtonEnabled\",";
__ref._mdisabled /*boolean*/  = __c.Not(BA.ObjectToBoolean(_props.GetDefault((Object)("ButtonEnabled"),(Object)(__c.True))));
RDebugUtils.currentLine=154075147;
 //BA.debugLineNum = 154075147;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=154075148;
 //BA.debugLineNum = 154075148;BA.debugLine="pressed = mDisabled";
__ref._pressed /*boolean*/  = __ref._mdisabled /*boolean*/ ;
RDebugUtils.currentLine=154075149;
 //BA.debugLineNum = 154075149;BA.debugLine="xLBL = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=154075150;
 //BA.debugLineNum = 154075150;BA.debugLine="xLBL.Visible = True";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=154075151;
 //BA.debugLineNum = 154075151;BA.debugLine="mBase.AddView(xLBL, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=154075152;
 //BA.debugLineNum = 154075152;BA.debugLine="mBase.AddView(p, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=154075153;
 //BA.debugLineNum = 154075153;BA.debugLine="xLBL.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=154075154;
 //BA.debugLineNum = 154075154;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=154075155;
 //BA.debugLineNum = 154075155;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=154075156;
 //BA.debugLineNum = 154075156;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled(ir.parsikhesab.pakhsh.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=154206208;
 //BA.debugLineNum = 154206208;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=154206209;
 //BA.debugLineNum = 154206209;BA.debugLine="Return Not(mDisabled)";
if (true) return __c.Not(__ref._mdisabled /*boolean*/ );
RDebugUtils.currentLine=154206210;
 //BA.debugLineNum = 154206210;BA.debugLine="End Sub";
return false;
}
public String  _initialize(ir.parsikhesab.pakhsh.swiftbutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=154009600;
 //BA.debugLineNum = 154009600;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=154009601;
 //BA.debugLineNum = 154009601;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=154009602;
 //BA.debugLineNum = 154009602;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=154009603;
 //BA.debugLineNum = 154009603;BA.debugLine="End Sub";
return "";
}
public String  _p_touch(ir.parsikhesab.pakhsh.swiftbutton __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "p_touch", true))
	 {return ((String) Debug.delegate(ba, "p_touch", new Object[] {_action,_x,_y}));}
boolean _inside = false;
RDebugUtils.currentLine=154337280;
 //BA.debugLineNum = 154337280;BA.debugLine="Private Sub p_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=154337281;
 //BA.debugLineNum = 154337281;BA.debugLine="If mDisabled Then Return";
if (__ref._mdisabled /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=154337282;
 //BA.debugLineNum = 154337282;BA.debugLine="Dim Inside As Boolean = x > 0 And x < mBase.Width";
_inside = _x>0 && _x<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth() && _y>0 && _y<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
RDebugUtils.currentLine=154337283;
 //BA.debugLineNum = 154337283;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP,(int) (3))) {
case 0: {
RDebugUtils.currentLine=154337285;
 //BA.debugLineNum = 154337285;BA.debugLine="SetPressedState(True)";
__ref._setpressedstate /*String*/ (null,__c.True);
RDebugUtils.currentLine=154337286;
 //BA.debugLineNum = 154337286;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=154337288;
 //BA.debugLineNum = 154337288;BA.debugLine="If pressed <> Inside Then";
if (__ref._pressed /*boolean*/ !=_inside) { 
RDebugUtils.currentLine=154337289;
 //BA.debugLineNum = 154337289;BA.debugLine="SetPressedState(Inside)";
__ref._setpressedstate /*String*/ (null,_inside);
RDebugUtils.currentLine=154337290;
 //BA.debugLineNum = 154337290;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 };
 break; }
case 2: 
case 3: {
RDebugUtils.currentLine=154337293;
 //BA.debugLineNum = 154337293;BA.debugLine="SetPressedState(False)";
__ref._setpressedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=154337294;
 //BA.debugLineNum = 154337294;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=154337295;
 //BA.debugLineNum = 154337295;BA.debugLine="If Inside Then";
if (_inside) { 
RDebugUtils.currentLine=154337296;
 //BA.debugLineNum = 154337296;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=154337297;
 //BA.debugLineNum = 154337297;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Click";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click");
 };
 break; }
}
;
RDebugUtils.currentLine=154337300;
 //BA.debugLineNum = 154337300;BA.debugLine="End Sub";
return "";
}
public String  _setpressedstate(ir.parsikhesab.pakhsh.swiftbutton __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setpressedstate", true))
	 {return ((String) Debug.delegate(ba, "setpressedstate", new Object[] {_newstate}));}
RDebugUtils.currentLine=154402816;
 //BA.debugLineNum = 154402816;BA.debugLine="Private Sub SetPressedState(NewState As Boolean)";
RDebugUtils.currentLine=154402817;
 //BA.debugLineNum = 154402817;BA.debugLine="If pressed = NewState Then Return";
if (__ref._pressed /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=154402818;
 //BA.debugLineNum = 154402818;BA.debugLine="If NewState And xui.SubExists(mCallBack, mEventNa";
if (_newstate && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonDown",(int) (0))) { 
RDebugUtils.currentLine=154402819;
 //BA.debugLineNum = 154402819;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonD";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonDown");
 };
RDebugUtils.currentLine=154402821;
 //BA.debugLineNum = 154402821;BA.debugLine="If NewState = False And xui.SubExists(mCallBack,";
if (_newstate==__c.False && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonUp",(int) (0))) { 
RDebugUtils.currentLine=154402822;
 //BA.debugLineNum = 154402822;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonU";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonUp");
 };
RDebugUtils.currentLine=154402824;
 //BA.debugLineNum = 154402824;BA.debugLine="pressed= NewState";
__ref._pressed /*boolean*/  = _newstate;
RDebugUtils.currentLine=154402825;
 //BA.debugLineNum = 154402825;BA.debugLine="End Sub";
return "";
}
public String  _setcolors(ir.parsikhesab.pakhsh.swiftbutton __ref,int _primary,int _secondary) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setcolors", true))
	 {return ((String) Debug.delegate(ba, "setcolors", new Object[] {_primary,_secondary}));}
RDebugUtils.currentLine=154468352;
 //BA.debugLineNum = 154468352;BA.debugLine="Public Sub SetColors(Primary As Int, Secondary As";
RDebugUtils.currentLine=154468353;
 //BA.debugLineNum = 154468353;BA.debugLine="clr1 = Primary";
__ref._clr1 /*int*/  = _primary;
RDebugUtils.currentLine=154468354;
 //BA.debugLineNum = 154468354;BA.debugLine="clr2 = Secondary";
__ref._clr2 /*int*/  = _secondary;
RDebugUtils.currentLine=154468355;
 //BA.debugLineNum = 154468355;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=154468356;
 //BA.debugLineNum = 154468356;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(ir.parsikhesab.pakhsh.swiftbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=154271744;
 //BA.debugLineNum = 154271744;BA.debugLine="Public Sub setEnabled(b As Boolean)";
RDebugUtils.currentLine=154271745;
 //BA.debugLineNum = 154271745;BA.debugLine="mDisabled = Not(b)";
__ref._mdisabled /*boolean*/  = __c.Not(_b);
RDebugUtils.currentLine=154271746;
 //BA.debugLineNum = 154271746;BA.debugLine="pressed = mDisabled";
__ref._pressed /*boolean*/  = __ref._mdisabled /*boolean*/ ;
RDebugUtils.currentLine=154271747;
 //BA.debugLineNum = 154271747;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=154271748;
 //BA.debugLineNum = 154271748;BA.debugLine="End Sub";
return "";
}
public String  _update(ir.parsikhesab.pakhsh.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=154533888;
 //BA.debugLineNum = 154533888;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=154533889;
 //BA.debugLineNum = 154533889;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=154533890;
 //BA.debugLineNum = 154533890;BA.debugLine="End Sub";
return "";
}
}