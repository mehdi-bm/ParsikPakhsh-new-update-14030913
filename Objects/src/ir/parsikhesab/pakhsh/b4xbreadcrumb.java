package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xbreadcrumb extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.b4xbreadcrumb");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.b4xbreadcrumb.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _mitems = null;
public anywheresoftware.b4a.objects.collections.List _rightpositions = null;
public int _textcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
public int _offset = 0;
public b4a.example.bitmapcreator _bc = null;
public int _crumbcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public int _presseditem = 0;
public Object _tag = null;
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
public String  _base_resize(ir.parsikhesab.pakhsh.b4xbreadcrumb __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=135593984;
 //BA.debugLineNum = 135593984;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=135593985;
 //BA.debugLineNum = 135593985;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=135593986;
 //BA.debugLineNum = 135593986;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=135593987;
 //BA.debugLineNum = 135593987;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=135593988;
 //BA.debugLineNum = 135593988;BA.debugLine="End Sub";
return "";
}
public String  _draw(ir.parsikhesab.pakhsh.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
b4a.example.bitmapcreator._argbcolor _bcolor = null;
int _strokecolor = 0;
int[] _clrs = null;
int _left = 0;
int _i = 0;
int _sc = 0;
int _width = 0;
RDebugUtils.currentLine=135659520;
 //BA.debugLineNum = 135659520;BA.debugLine="Private Sub Draw";
RDebugUtils.currentLine=135659521;
 //BA.debugLineNum = 135659521;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=135659522;
 //BA.debugLineNum = 135659522;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=135659523;
 //BA.debugLineNum = 135659523;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._crumbcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=135659524;
 //BA.debugLineNum = 135659524;BA.debugLine="bcolor.r = Min(255, bcolor.r * 2)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*2));
RDebugUtils.currentLine=135659525;
 //BA.debugLineNum = 135659525;BA.debugLine="bcolor.g = Min(255, bcolor.g * 2)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*2));
RDebugUtils.currentLine=135659526;
 //BA.debugLineNum = 135659526;BA.debugLine="bcolor.b = Min(255, bcolor.b * 2)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*2));
RDebugUtils.currentLine=135659527;
 //BA.debugLineNum = 135659527;BA.debugLine="Dim strokeColor As Int = bc.ARGBToColor(bcolor)";
_strokecolor = __ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor);
RDebugUtils.currentLine=135659529;
 //BA.debugLineNum = 135659529;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._crumbcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=135659530;
 //BA.debugLineNum = 135659530;BA.debugLine="bcolor.r = bcolor.r * 0.8";
_bcolor.r = (int) (_bcolor.r*0.8);
RDebugUtils.currentLine=135659531;
 //BA.debugLineNum = 135659531;BA.debugLine="bcolor.g = bcolor.g * 0.8";
_bcolor.g = (int) (_bcolor.g*0.8);
RDebugUtils.currentLine=135659532;
 //BA.debugLineNum = 135659532;BA.debugLine="bcolor.b = bcolor.b * 0.8";
_bcolor.b = (int) (_bcolor.b*0.8);
RDebugUtils.currentLine=135659533;
 //BA.debugLineNum = 135659533;BA.debugLine="Dim Clrs() As Int = Array As Int(CrumbColor, bc.A";
_clrs = new int[]{__ref._crumbcolor /*int*/ ,__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor)};
RDebugUtils.currentLine=135659535;
 //BA.debugLineNum = 135659535;BA.debugLine="RightPositions.Clear";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=135659536;
 //BA.debugLineNum = 135659536;BA.debugLine="If mItems.Size = 0 Then Return";
if (__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=135659537;
 //BA.debugLineNum = 135659537;BA.debugLine="Dim Left As Int = 0";
_left = (int) (0);
RDebugUtils.currentLine=135659538;
 //BA.debugLineNum = 135659538;BA.debugLine="For i = 0 To mItems.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=135659539;
 //BA.debugLineNum = 135659539;BA.debugLine="Dim sc As Int";
_sc = 0;
RDebugUtils.currentLine=135659540;
 //BA.debugLineNum = 135659540;BA.debugLine="If PressedItem = i Then sc = strokeColor Else sc";
if (__ref._presseditem /*int*/ ==_i) { 
_sc = _strokecolor;}
else {
_sc = (int) (0);};
RDebugUtils.currentLine=135659541;
 //BA.debugLineNum = 135659541;BA.debugLine="Dim width As Int = DrawItem(Left, mItems.Get(i),";
_width = __ref._drawitem /*int*/ (null,_left,BA.ObjectToString(__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),_i==0,_i==__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,_clrs[(int) (_i%_clrs.length)],_sc);
RDebugUtils.currentLine=135659542;
 //BA.debugLineNum = 135659542;BA.debugLine="Left = Left + width + offset + 2dip";
_left = (int) (_left+_width+__ref._offset /*int*/ +__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=135659543;
 //BA.debugLineNum = 135659543;BA.debugLine="RightPositions.Add(Left)";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_left));
 }
};
RDebugUtils.currentLine=135659545;
 //BA.debugLineNum = 135659545;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=135659546;
 //BA.debugLineNum = 135659546;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
RDebugUtils.currentLine=135397376;
 //BA.debugLineNum = 135397376;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=135397377;
 //BA.debugLineNum = 135397377;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=135397378;
 //BA.debugLineNum = 135397378;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=135397379;
 //BA.debugLineNum = 135397379;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=135397380;
 //BA.debugLineNum = 135397380;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=135397381;
 //BA.debugLineNum = 135397381;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=135397382;
 //BA.debugLineNum = 135397382;BA.debugLine="Private mItems As List";
_mitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=135397383;
 //BA.debugLineNum = 135397383;BA.debugLine="Private RightPositions As List";
_rightpositions = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=135397384;
 //BA.debugLineNum = 135397384;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=135397385;
 //BA.debugLineNum = 135397385;BA.debugLine="Public fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=135397386;
 //BA.debugLineNum = 135397386;BA.debugLine="Private offset As Int = 10dip";
_offset = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=135397387;
 //BA.debugLineNum = 135397387;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=135397388;
 //BA.debugLineNum = 135397388;BA.debugLine="Public CrumbColor As Int";
_crumbcolor = 0;
RDebugUtils.currentLine=135397389;
 //BA.debugLineNum = 135397389;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=135397390;
 //BA.debugLineNum = 135397390;BA.debugLine="Private PressedItem As Int = -1";
_presseditem = (int) (-1);
RDebugUtils.currentLine=135397391;
 //BA.debugLineNum = 135397391;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=135397392;
 //BA.debugLineNum = 135397392;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=135397393;
 //BA.debugLineNum = 135397393;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(ir.parsikhesab.pakhsh.b4xbreadcrumb __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
String _items = "";
String _s = "";
RDebugUtils.currentLine=135528448;
 //BA.debugLineNum = 135528448;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=135528449;
 //BA.debugLineNum = 135528449;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=135528450;
 //BA.debugLineNum = 135528450;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=135528450;
 //BA.debugLineNum = 135528450;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=135528451;
 //BA.debugLineNum = 135528451;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=135528452;
 //BA.debugLineNum = 135528452;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=135528453;
 //BA.debugLineNum = 135528453;BA.debugLine="fnt = xlbl.Font";
__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=135528454;
 //BA.debugLineNum = 135528454;BA.debugLine="TextColor = xlbl.TextColor";
__ref._textcolor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=135528455;
 //BA.debugLineNum = 135528455;BA.debugLine="CrumbColor = xui.PaintOrColorToColor(Props.Get(\"C";
__ref._crumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CrumbColor")));
RDebugUtils.currentLine=135528456;
 //BA.debugLineNum = 135528456;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=135528457;
 //BA.debugLineNum = 135528457;BA.debugLine="TouchPanel = xui.CreatePanel(\"Touch\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"Touch");
RDebugUtils.currentLine=135528458;
 //BA.debugLineNum = 135528458;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=135528459;
 //BA.debugLineNum = 135528459;BA.debugLine="Dim items As String = Props.Get(\"Items\")";
_items = BA.ObjectToString(_props.Get((Object)("Items")));
RDebugUtils.currentLine=135528460;
 //BA.debugLineNum = 135528460;BA.debugLine="For Each s As String In Regex.Split(\"\\|\", items)";
{
final String[] group13 = __c.Regex.Split("\\|",_items);
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_s = group13[index13];
RDebugUtils.currentLine=135528461;
 //BA.debugLineNum = 135528461;BA.debugLine="mItems.Add(s)";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=135528463;
 //BA.debugLineNum = 135528463;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=135528464;
 //BA.debugLineNum = 135528464;BA.debugLine="End Sub";
return "";
}
public int  _drawitem(ir.parsikhesab.pakhsh.b4xbreadcrumb __ref,int _left,String _text,boolean _first,boolean _last,int _clr,int _strokecolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "drawitem", true))
	 {return ((Integer) Debug.delegate(ba, "drawitem", new Object[] {_left,_text,_first,_last,_clr,_strokecolor}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _itemwidth = 0;
int _itemheight = 0;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
RDebugUtils.currentLine=135725056;
 //BA.debugLineNum = 135725056;BA.debugLine="Private Sub DrawItem(Left As Int, Text As String,";
RDebugUtils.currentLine=135725057;
 //BA.debugLineNum = 135725057;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Text, fnt)";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_text,__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=135725058;
 //BA.debugLineNum = 135725058;BA.debugLine="Dim ItemWidth As Int = r.Width + 30dip";
_itemwidth = (int) (_r.getWidth()+__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=135725059;
 //BA.debugLineNum = 135725059;BA.debugLine="Dim ItemHeight As Int = cvs.TargetRect.Height";
_itemheight = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight());
RDebugUtils.currentLine=135725060;
 //BA.debugLineNum = 135725060;BA.debugLine="Dim BaseLine As Int = cvs.TargetRect.CenterY - r.";
_baseline = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=135725061;
 //BA.debugLineNum = 135725061;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=135725062;
 //BA.debugLineNum = 135725062;BA.debugLine="p.Initialize(Left, 0)";
_p.Initialize((float) (_left),(float) (0));
RDebugUtils.currentLine=135725063;
 //BA.debugLineNum = 135725063;BA.debugLine="p.LineTo(Left + ItemWidth, 0)";
_p.LineTo((float) (_left+_itemwidth),(float) (0));
RDebugUtils.currentLine=135725064;
 //BA.debugLineNum = 135725064;BA.debugLine="If Last = False Then";
if (_last==__c.False) { 
RDebugUtils.currentLine=135725065;
 //BA.debugLineNum = 135725065;BA.debugLine="p.LineTo(Left + ItemWidth + offset, ItemHeight /";
_p.LineTo((float) (_left+_itemwidth+__ref._offset /*int*/ ),(float) (_itemheight/(double)2));
 };
RDebugUtils.currentLine=135725067;
 //BA.debugLineNum = 135725067;BA.debugLine="p.LineTo(Left + ItemWidth, ItemHeight)";
_p.LineTo((float) (_left+_itemwidth),(float) (_itemheight));
RDebugUtils.currentLine=135725068;
 //BA.debugLineNum = 135725068;BA.debugLine="If First = False Then";
if (_first==__c.False) { 
RDebugUtils.currentLine=135725069;
 //BA.debugLineNum = 135725069;BA.debugLine="p.LineTo(Left - offset, ItemHeight)";
_p.LineTo((float) (_left-__ref._offset /*int*/ ),(float) (_itemheight));
RDebugUtils.currentLine=135725070;
 //BA.debugLineNum = 135725070;BA.debugLine="p.LineTo(Left, ItemHeight / 2)";
_p.LineTo((float) (_left),(float) (_itemheight/(double)2));
RDebugUtils.currentLine=135725071;
 //BA.debugLineNum = 135725071;BA.debugLine="p.LineTo(Left - offset, 0)";
_p.LineTo((float) (_left-__ref._offset /*int*/ ),(float) (0));
 }else {
RDebugUtils.currentLine=135725073;
 //BA.debugLineNum = 135725073;BA.debugLine="p.LineTo(Left, ItemHeight)";
_p.LineTo((float) (_left),(float) (_itemheight));
 };
RDebugUtils.currentLine=135725075;
 //BA.debugLineNum = 135725075;BA.debugLine="p.LineTo(Left, 0)";
_p.LineTo((float) (_left),(float) (0));
RDebugUtils.currentLine=135725076;
 //BA.debugLineNum = 135725076;BA.debugLine="cvs.DrawPath(p, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_clr,__c.True,(float) (0));
RDebugUtils.currentLine=135725077;
 //BA.debugLineNum = 135725077;BA.debugLine="If strokeColor <> 0 Then";
if (_strokecolor!=0) { 
RDebugUtils.currentLine=135725078;
 //BA.debugLineNum = 135725078;BA.debugLine="cvs.DrawPath(p, strokeColor, False, 3dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_strokecolor,__c.False,(float) (__c.DipToCurrent((int) (3))));
 };
RDebugUtils.currentLine=135725081;
 //BA.debugLineNum = 135725081;BA.debugLine="cvs.DrawText(Text, Left + ItemWidth / 2, BaseLine";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_text,(float) (_left+_itemwidth/(double)2),(float) (_baseline),__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._textcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=135725082;
 //BA.debugLineNum = 135725082;BA.debugLine="Return ItemWidth";
if (true) return _itemwidth;
RDebugUtils.currentLine=135725083;
 //BA.debugLineNum = 135725083;BA.debugLine="End Sub";
return 0;
}
public int  _finditem(ir.parsikhesab.pakhsh.b4xbreadcrumb __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "finditem", true))
	 {return ((Integer) Debug.delegate(ba, "finditem", new Object[] {_x,_y}));}
int _r = 0;
int _i = 0;
RDebugUtils.currentLine=135856128;
 //BA.debugLineNum = 135856128;BA.debugLine="Private Sub FindItem (x As Int, y As Int) As Int";
RDebugUtils.currentLine=135856129;
 //BA.debugLineNum = 135856129;BA.debugLine="If RightPositions.Size = 0 Then Return -1";
if (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=135856130;
 //BA.debugLineNum = 135856130;BA.debugLine="If y < 0 Or y > cvs.TargetRect.Height Then Return";
if (_y<0 || _y>__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=135856131;
 //BA.debugLineNum = 135856131;BA.debugLine="Dim r As Int = RightPositions.Get(RightPositions.";
_r = (int)(BA.ObjectToNumber(__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=135856132;
 //BA.debugLineNum = 135856132;BA.debugLine="If x > r Then Return -1";
if (_x>_r) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=135856133;
 //BA.debugLineNum = 135856133;BA.debugLine="For i = RightPositions.Size - 2 To 0 Step -1";
{
final int step5 = -1;
final int limit5 = (int) (0);
_i = (int) (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-2) ;
for (;_i >= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=135856134;
 //BA.debugLineNum = 135856134;BA.debugLine="Dim r As Int = RightPositions.Get(i)";
_r = (int)(BA.ObjectToNumber(__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=135856135;
 //BA.debugLineNum = 135856135;BA.debugLine="If x > r Then Return i + 1";
if (_x>_r) { 
if (true) return (int) (_i+1);};
 }
};
RDebugUtils.currentLine=135856137;
 //BA.debugLineNum = 135856137;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=135856138;
 //BA.debugLineNum = 135856138;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getitems(ir.parsikhesab.pakhsh.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "getitems", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getitems", null));}
RDebugUtils.currentLine=135987200;
 //BA.debugLineNum = 135987200;BA.debugLine="Public Sub getItems As List";
RDebugUtils.currentLine=135987201;
 //BA.debugLineNum = 135987201;BA.debugLine="Return mItems";
if (true) return __ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=135987202;
 //BA.debugLineNum = 135987202;BA.debugLine="End Sub";
return null;
}
public String  _initialize(ir.parsikhesab.pakhsh.b4xbreadcrumb __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=135462912;
 //BA.debugLineNum = 135462912;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=135462913;
 //BA.debugLineNum = 135462913;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=135462914;
 //BA.debugLineNum = 135462914;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=135462915;
 //BA.debugLineNum = 135462915;BA.debugLine="mItems.Initialize";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=135462916;
 //BA.debugLineNum = 135462916;BA.debugLine="RightPositions.Initialize";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=135462917;
 //BA.debugLineNum = 135462917;BA.debugLine="bc.Initialize(1, 1)";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (1),(int) (1));
RDebugUtils.currentLine=135462918;
 //BA.debugLineNum = 135462918;BA.debugLine="End Sub";
return "";
}
public String  _setitems(ir.parsikhesab.pakhsh.b4xbreadcrumb __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((String) Debug.delegate(ba, "setitems", new Object[] {_i}));}
RDebugUtils.currentLine=135921664;
 //BA.debugLineNum = 135921664;BA.debugLine="Public Sub setItems (i As List)";
RDebugUtils.currentLine=135921665;
 //BA.debugLineNum = 135921665;BA.debugLine="mItems = i";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/  = _i;
RDebugUtils.currentLine=135921666;
 //BA.debugLineNum = 135921666;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=135921667;
 //BA.debugLineNum = 135921667;BA.debugLine="End Sub";
return "";
}
public String  _touch_touch(ir.parsikhesab.pakhsh.b4xbreadcrumb __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "touch_touch", true))
	 {return ((String) Debug.delegate(ba, "touch_touch", new Object[] {_action,_x,_y}));}
int _prev = 0;
int _index = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
RDebugUtils.currentLine=135790592;
 //BA.debugLineNum = 135790592;BA.debugLine="Private Sub Touch_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=135790593;
 //BA.debugLineNum = 135790593;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP)) {
case 0: 
case 1: {
RDebugUtils.currentLine=135790595;
 //BA.debugLineNum = 135790595;BA.debugLine="Dim prev As Int = PressedItem";
_prev = __ref._presseditem /*int*/ ;
RDebugUtils.currentLine=135790596;
 //BA.debugLineNum = 135790596;BA.debugLine="PressedItem = FindItem(X, Y)";
__ref._presseditem /*int*/  = __ref._finditem /*int*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=135790597;
 //BA.debugLineNum = 135790597;BA.debugLine="If prev <> PressedItem Then Draw";
if (_prev!=__ref._presseditem /*int*/ ) { 
__ref._draw /*String*/ (null);};
 break; }
case 2: {
RDebugUtils.currentLine=135790599;
 //BA.debugLineNum = 135790599;BA.debugLine="Dim index As Int = FindItem(X, Y)";
_index = __ref._finditem /*int*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=135790600;
 //BA.debugLineNum = 135790600;BA.debugLine="If index = PressedItem And index > -1 Then";
if (_index==__ref._presseditem /*int*/  && _index>-1) { 
RDebugUtils.currentLine=135790601;
 //BA.debugLineNum = 135790601;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=135790602;
 //BA.debugLineNum = 135790602;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=135790603;
 //BA.debugLineNum = 135790603;BA.debugLine="For i = 0 To index";
{
final int step11 = 1;
final int limit11 = _index;
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=135790604;
 //BA.debugLineNum = 135790604;BA.debugLine="Items.Add(mItems.Get(i))";
_items.Add(__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=135790606;
 //BA.debugLineNum = 135790606;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=135790607;
 //BA.debugLineNum = 135790607;BA.debugLine="CallSub2(mCallBack, mEventName & \"_CrumbClick\"";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CrumbClick",(Object)(_items));
 };
RDebugUtils.currentLine=135790609;
 //BA.debugLineNum = 135790609;BA.debugLine="PressedItem = -1";
__ref._presseditem /*int*/  = (int) (-1);
RDebugUtils.currentLine=135790610;
 //BA.debugLineNum = 135790610;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=135790612;
 //BA.debugLineNum = 135790612;BA.debugLine="End Sub";
return "";
}
}