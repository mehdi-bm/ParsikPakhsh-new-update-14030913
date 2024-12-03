package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xfloattextfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.b4xfloattextfield");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.b4xfloattextfield.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mtextfield = null;
public int _animationduration = 0;
public float _largelabeltextsize = 0f;
public float _smalllabeltextsize = 0f;
public boolean _largelabel = false;
public anywheresoftware.b4a.objects.B4XCanvas _measuringcanvas = null;
public int _hintcolor = 0;
public int _nonfocusedhintcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _hintimageview = null;
public String _hinttext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _hintfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largefocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largenotfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallnotfocused = null;
public boolean _focused = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblclear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblv = null;
public anywheresoftware.b4a.objects.collections.Map _mprops = null;
public Object _tag = null;
public String _keyboardtype = "";
public boolean _multiline = false;
public ir.parsikhesab.pakhsh.b4xfloattextfield _mnexttextfield = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public int _hintlabellargeoffsetx = 0;
public int _hintlabelsmalloffsety = 0;
public int _hintlabelsmalloffsetx = 0;
public long _lastswitchtextfieldtime = 0L;
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
public String  _update(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=141623296;
 //BA.debugLineNum = 141623296;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=141623297;
 //BA.debugLineNum = 141623297;BA.debugLine="Dim f As B4XFont =  xui.CreateFont2(HintFont, Lar";
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._largelabeltextsize /*float*/ );
RDebugUtils.currentLine=141623298;
 //BA.debugLineNum = 141623298;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = __ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._hinttext /*String*/ ,_f);
RDebugUtils.currentLine=141623299;
 //BA.debugLineNum = 141623299;BA.debugLine="LargeFocused = CreateBitmap(r, HintColor, f)";
__ref._largefocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._hintcolor /*int*/ ,_f);
RDebugUtils.currentLine=141623300;
 //BA.debugLineNum = 141623300;BA.debugLine="LargeNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref._largenotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._nonfocusedhintcolor /*int*/ ,_f);
RDebugUtils.currentLine=141623301;
 //BA.debugLineNum = 141623301;BA.debugLine="f = xui.CreateFont2(HintFont, SmallLabelTextSize)";
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._smalllabeltextsize /*float*/ );
RDebugUtils.currentLine=141623302;
 //BA.debugLineNum = 141623302;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = __ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._hinttext /*String*/ ,_f);
RDebugUtils.currentLine=141623303;
 //BA.debugLineNum = 141623303;BA.debugLine="SmallFocused = CreateBitmap(r, HintColor, f)";
__ref._smallfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._hintcolor /*int*/ ,_f);
RDebugUtils.currentLine=141623304;
 //BA.debugLineNum = 141623304;BA.debugLine="SmallNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref._smallnotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._nonfocusedhintcolor /*int*/ ,_f);
RDebugUtils.currentLine=141623305;
 //BA.debugLineNum = 141623305;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=141623306;
 //BA.debugLineNum = 141623306;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _firstdistance = 0;
RDebugUtils.currentLine=141426688;
 //BA.debugLineNum = 141426688;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=141426689;
 //BA.debugLineNum = 141426689;BA.debugLine="mTextField.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=141426690;
 //BA.debugLineNum = 141426690;BA.debugLine="Dim FirstDistance As Int = 2dip";
_firstdistance = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=141426691;
 //BA.debugLineNum = 141426691;BA.debugLine="If Multiline And xui.IsB4J Then FirstDistance = 2";
if (__ref._multiline /*boolean*/  && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_firstdistance = __c.DipToCurrent((int) (22));};
RDebugUtils.currentLine=141426692;
 //BA.debugLineNum = 141426692;BA.debugLine="If lblV.IsInitialized Then";
if (__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=141426693;
 //BA.debugLineNum = 141426693;BA.debugLine="lblV.SetLayoutAnimated(0, Width - lblV.Width - F";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width-__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_firstdistance),(int) (0),__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (_height));
RDebugUtils.currentLine=141426694;
 //BA.debugLineNum = 141426694;BA.debugLine="FirstDistance = FirstDistance + lblV.Width + 2di";
_firstdistance = (int) (_firstdistance+__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__c.DipToCurrent((int) (2)));
 };
RDebugUtils.currentLine=141426696;
 //BA.debugLineNum = 141426696;BA.debugLine="If lblClear.IsInitialized Then";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=141426697;
 //BA.debugLineNum = 141426697;BA.debugLine="lblClear.SetLayoutAnimated(0, Width - lblClear.W";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width-__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_firstdistance),(int) (0),__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (_height));
 };
RDebugUtils.currentLine=141426699;
 //BA.debugLineNum = 141426699;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=141426700;
 //BA.debugLineNum = 141426700;BA.debugLine="End Sub";
return "";
}
public String  _updatelabel(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,String _txt,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "updatelabel", true))
	 {return ((String) Debug.delegate(ba, "updatelabel", new Object[] {_txt,_force}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _goingtolarge = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=141492224;
 //BA.debugLineNum = 141492224;BA.debugLine="Private Sub UpdateLabel (txt As String, force As B";
RDebugUtils.currentLine=141492225;
 //BA.debugLineNum = 141492225;BA.debugLine="For Each lbl As B4XView In Array As B4XView(lblCl";
{
final anywheresoftware.b4a.objects.B4XViewWrapper[] group1 = new anywheresoftware.b4a.objects.B4XViewWrapper[]{__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ };
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = group1[index1];
RDebugUtils.currentLine=141492226;
 //BA.debugLineNum = 141492226;BA.debugLine="If lbl.IsInitialized Then lbl.Visible = Focused";
if (_lbl.IsInitialized()) { 
_lbl.setVisible(__ref._focused /*boolean*/  && _txt.length()>0);};
 }
};
RDebugUtils.currentLine=141492229;
 //BA.debugLineNum = 141492229;BA.debugLine="Dim GoingToLarge As Boolean = txt.Length = 0";
_goingtolarge = _txt.length()==0;
RDebugUtils.currentLine=141492230;
 //BA.debugLineNum = 141492230;BA.debugLine="If GoingToLarge = LargeLabel And force = False Th";
if (_goingtolarge==__ref._largelabel /*boolean*/  && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=141492231;
 //BA.debugLineNum = 141492231;BA.debugLine="Dim b As B4XBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=141492232;
 //BA.debugLineNum = 141492232;BA.debugLine="If Focused Then";
if (__ref._focused /*boolean*/ ) { 
RDebugUtils.currentLine=141492233;
 //BA.debugLineNum = 141492233;BA.debugLine="If GoingToLarge Then b = LargeFocused Else b = S";
if (_goingtolarge) { 
_b = __ref._largefocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;}
else {
_b = __ref._smallfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;};
 }else {
RDebugUtils.currentLine=141492235;
 //BA.debugLineNum = 141492235;BA.debugLine="If GoingToLarge Then b = LargeNotFocused Else b";
if (_goingtolarge) { 
_b = __ref._largenotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;}
else {
_b = __ref._smallnotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;};
 };
RDebugUtils.currentLine=141492237;
 //BA.debugLineNum = 141492237;BA.debugLine="If b.IsInitialized = False Then Return";
if (_b.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=141492238;
 //BA.debugLineNum = 141492238;BA.debugLine="HintImageView.SetBitmap(b)";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=141492239;
 //BA.debugLineNum = 141492239;BA.debugLine="If GoingToLarge Then";
if (_goingtolarge) { 
RDebugUtils.currentLine=141492240;
 //BA.debugLineNum = 141492240;BA.debugLine="HintImageView.SetLayoutAnimated (AnimationDurati";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._hintlabellargeoffsetx /*int*/ ,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_b.getHeight()/(double)2),(int) (_b.getWidth()),(int) (_b.getHeight()));
RDebugUtils.currentLine=141492241;
 //BA.debugLineNum = 141492241;BA.debugLine="LargeLabel = True";
__ref._largelabel /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=141492243;
 //BA.debugLineNum = 141492243;BA.debugLine="HintImageView.SetLayoutAnimated(AnimationDuratio";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._hintlabelsmalloffsetx /*int*/ ,__ref._hintlabelsmalloffsety /*int*/ ,(int) (_b.getWidth()),(int) (_b.getHeight()));
RDebugUtils.currentLine=141492244;
 //BA.debugLineNum = 141492244;BA.debugLine="LargeLabel = False";
__ref._largelabel /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=141492246;
 //BA.debugLineNum = 141492246;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
RDebugUtils.currentLine=140836864;
 //BA.debugLineNum = 140836864;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=140836865;
 //BA.debugLineNum = 140836865;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=140836866;
 //BA.debugLineNum = 140836866;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=140836867;
 //BA.debugLineNum = 140836867;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=140836868;
 //BA.debugLineNum = 140836868;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=140836869;
 //BA.debugLineNum = 140836869;BA.debugLine="Private mTextField As B4XView";
_mtextfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=140836870;
 //BA.debugLineNum = 140836870;BA.debugLine="Public AnimationDuration As Int = 200";
_animationduration = (int) (200);
RDebugUtils.currentLine=140836871;
 //BA.debugLineNum = 140836871;BA.debugLine="Public LargeLabelTextSize = 18, SmallLabelTextSiz";
_largelabeltextsize = (float) (18);
_smalllabeltextsize = (float) (14);
RDebugUtils.currentLine=140836872;
 //BA.debugLineNum = 140836872;BA.debugLine="Private LargeLabel As Boolean";
_largelabel = false;
RDebugUtils.currentLine=140836873;
 //BA.debugLineNum = 140836873;BA.debugLine="Private MeasuringCanvas As B4XCanvas";
_measuringcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=140836874;
 //BA.debugLineNum = 140836874;BA.debugLine="Public HintColor As Int";
_hintcolor = 0;
RDebugUtils.currentLine=140836875;
 //BA.debugLineNum = 140836875;BA.debugLine="Public NonFocusedHintColor As Int";
_nonfocusedhintcolor = 0;
RDebugUtils.currentLine=140836876;
 //BA.debugLineNum = 140836876;BA.debugLine="Private HintImageView As B4XView";
_hintimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=140836877;
 //BA.debugLineNum = 140836877;BA.debugLine="Public HintText As String";
_hinttext = "";
RDebugUtils.currentLine=140836878;
 //BA.debugLineNum = 140836878;BA.debugLine="Public HintFont As B4XFont";
_hintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=140836879;
 //BA.debugLineNum = 140836879;BA.debugLine="Private LargeFocused, LargeNotFocused, SmallFocus";
_largefocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_largenotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallnotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=140836880;
 //BA.debugLineNum = 140836880;BA.debugLine="Public Focused As Boolean";
_focused = false;
RDebugUtils.currentLine=140836881;
 //BA.debugLineNum = 140836881;BA.debugLine="Public lblClear As B4XView";
_lblclear = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=140836882;
 //BA.debugLineNum = 140836882;BA.debugLine="Public lblV As B4XView";
_lblv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=140836883;
 //BA.debugLineNum = 140836883;BA.debugLine="Private mProps As Map";
_mprops = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=140836884;
 //BA.debugLineNum = 140836884;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=140836885;
 //BA.debugLineNum = 140836885;BA.debugLine="Private KeyboardType As String 'ignore";
_keyboardtype = "";
RDebugUtils.currentLine=140836886;
 //BA.debugLineNum = 140836886;BA.debugLine="Private Multiline As Boolean";
_multiline = false;
RDebugUtils.currentLine=140836887;
 //BA.debugLineNum = 140836887;BA.debugLine="Private mNextTextField As B4XFloatTextField";
_mnexttextfield = new ir.parsikhesab.pakhsh.b4xfloattextfield();
RDebugUtils.currentLine=140836889;
 //BA.debugLineNum = 140836889;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=140836894;
 //BA.debugLineNum = 140836894;BA.debugLine="Public HintLabelLargeOffsetX, HintLabelSmallOffse";
_hintlabellargeoffsetx = 0;
_hintlabelsmalloffsety = __c.DipToCurrent((int) (2));
_hintlabelsmalloffsetx = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=140836895;
 //BA.debugLineNum = 140836895;BA.debugLine="Private LastSwitchTextFieldTime As Long";
_lastswitchtextfieldtime = 0L;
RDebugUtils.currentLine=140836896;
 //BA.debugLineNum = 140836896;BA.debugLine="End Sub";
return "";
}
public String  _createacceptbutton(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createacceptbutton", true))
	 {return ((String) Debug.delegate(ba, "createacceptbutton", null));}
RDebugUtils.currentLine=141164544;
 //BA.debugLineNum = 141164544;BA.debugLine="Private Sub CreateAcceptButton";
RDebugUtils.currentLine=141164545;
 //BA.debugLineNum = 141164545;BA.debugLine="If mProps.GetDefault(\"ShowAccept\", True) = False";
if ((__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ShowAccept"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=141164546;
 //BA.debugLineNum = 141164546;BA.debugLine="lblV = CreateButton(Chr(0xE5CA))";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe5ca))));
RDebugUtils.currentLine=141164547;
 //BA.debugLineNum = 141164547;BA.debugLine="lblV.Tag = \"v\"";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("v"));
RDebugUtils.currentLine=141164548;
 //BA.debugLineNum = 141164548;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createbutton(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createbutton", new Object[] {_text}));}
anywheresoftware.b4a.objects.LabelWrapper _lc = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
RDebugUtils.currentLine=141361152;
 //BA.debugLineNum = 141361152;BA.debugLine="Private Sub CreateButton (Text As String) As B4XVi";
RDebugUtils.currentLine=141361153;
 //BA.debugLineNum = 141361153;BA.debugLine="Dim lc As Label";
_lc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=141361154;
 //BA.debugLineNum = 141361154;BA.debugLine="lc.Initialize(\"lc\")";
_lc.Initialize(ba,"lc");
RDebugUtils.currentLine=141361155;
 //BA.debugLineNum = 141361155;BA.debugLine="Dim x As B4XView = lc";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
RDebugUtils.currentLine=141361156;
 //BA.debugLineNum = 141361156;BA.debugLine="x = lc";
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
RDebugUtils.currentLine=141361157;
 //BA.debugLineNum = 141361157;BA.debugLine="x.Font = xui.CreateMaterialIcons(20)";
_x.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (20)));
RDebugUtils.currentLine=141361158;
 //BA.debugLineNum = 141361158;BA.debugLine="x.Text = Text";
_x.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=141361159;
 //BA.debugLineNum = 141361159;BA.debugLine="x.TextColor = mTextField.TextColor";
_x.setTextColor(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=141361160;
 //BA.debugLineNum = 141361160;BA.debugLine="x.Visible = False";
_x.setVisible(__c.False);
RDebugUtils.currentLine=141361161;
 //BA.debugLineNum = 141361161;BA.debugLine="x.SetTextAlignment(\"CENTER\", \"CENTER\")";
_x.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=141361162;
 //BA.debugLineNum = 141361162;BA.debugLine="mBase.AddView(x, 0, 0, 30dip, 30dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_x.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=141361163;
 //BA.debugLineNum = 141361163;BA.debugLine="Return x";
if (true) return _x;
RDebugUtils.currentLine=141361164;
 //BA.debugLineNum = 141361164;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createbitmap(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createbitmap", new Object[] {_r,_color,_fnt}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _c = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=141688832;
 //BA.debugLineNum = 141688832;BA.debugLine="Private Sub CreateBitmap(r As B4XRect, Color As In";
RDebugUtils.currentLine=141688833;
 //BA.debugLineNum = 141688833;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=141688834;
 //BA.debugLineNum = 141688834;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Max(1, r.Width + 2di";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (__c.Max(1,_r.getWidth()+__c.DipToCurrent((int) (2)))),(int) (__c.Max(1,_r.getHeight()+__c.DipToCurrent((int) (2)))));
RDebugUtils.currentLine=141688835;
 //BA.debugLineNum = 141688835;BA.debugLine="Dim c As B4XCanvas";
_c = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=141688836;
 //BA.debugLineNum = 141688836;BA.debugLine="c.Initialize(p)";
_c.Initialize(_p);
RDebugUtils.currentLine=141688837;
 //BA.debugLineNum = 141688837;BA.debugLine="Dim BaseLine As Int = p.Height / 2 - r.Height / 2";
_baseline = (int) (_p.getHeight()/(double)2-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=141688838;
 //BA.debugLineNum = 141688838;BA.debugLine="c.DrawText(HintText, p.Width / 2, BaseLine, Fnt,";
_c.DrawText(ba,__ref._hinttext /*String*/ ,(float) (_p.getWidth()/(double)2),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=141688839;
 //BA.debugLineNum = 141688839;BA.debugLine="Dim bmp As B4XBitmap = c.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _c.CreateBitmap();
RDebugUtils.currentLine=141688840;
 //BA.debugLineNum = 141688840;BA.debugLine="c.Release";
_c.Release();
RDebugUtils.currentLine=141688841;
 //BA.debugLineNum = 141688841;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=141688842;
 //BA.debugLineNum = 141688842;BA.debugLine="End Sub";
return null;
}
public String  _createclearbutton(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createclearbutton", true))
	 {return ((String) Debug.delegate(ba, "createclearbutton", null));}
RDebugUtils.currentLine=141099008;
 //BA.debugLineNum = 141099008;BA.debugLine="Private Sub CreateClearButton";
RDebugUtils.currentLine=141099009;
 //BA.debugLineNum = 141099009;BA.debugLine="If mProps.GetDefault(\"ShowClear\", True) = False T";
if ((__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ShowClear"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=141099010;
 //BA.debugLineNum = 141099010;BA.debugLine="If lblClear.IsInitialized And lblClear.Parent.IsI";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=141099011;
 //BA.debugLineNum = 141099011;BA.debugLine="lblClear = CreateButton(Chr(0xE14C))";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe14c))));
RDebugUtils.currentLine=141099012;
 //BA.debugLineNum = 141099012;BA.debugLine="lblClear.Tag = \"clear\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("clear"));
RDebugUtils.currentLine=141099014;
 //BA.debugLineNum = 141099014;BA.debugLine="End Sub";
return "";
}
public String  _createrevealbutton(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createrevealbutton", true))
	 {return ((String) Debug.delegate(ba, "createrevealbutton", null));}
RDebugUtils.currentLine=141230080;
 //BA.debugLineNum = 141230080;BA.debugLine="Private Sub CreateRevealButton";
RDebugUtils.currentLine=141230081;
 //BA.debugLineNum = 141230081;BA.debugLine="lblClear = CreateButton(Chr(0xE8F4))";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe8f4))));
RDebugUtils.currentLine=141230082;
 //BA.debugLineNum = 141230082;BA.debugLine="lblClear.Tag = \"reveal\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("reveal"));
RDebugUtils.currentLine=141230083;
 //BA.debugLineNum = 141230083;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextfield(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,boolean _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createtextfield", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextfield", new Object[] {_password}));}
anywheresoftware.b4a.objects.EditTextWrapper _tf = null;
RDebugUtils.currentLine=142278656;
 //BA.debugLineNum = 142278656;BA.debugLine="Private Sub CreateTextField (Password As Boolean)";
RDebugUtils.currentLine=142278672;
 //BA.debugLineNum = 142278672;BA.debugLine="Dim tf As EditText";
_tf = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=142278673;
 //BA.debugLineNum = 142278673;BA.debugLine="tf.Initialize(\"tf\")";
_tf.Initialize(ba,"tf");
RDebugUtils.currentLine=142278674;
 //BA.debugLineNum = 142278674;BA.debugLine="tf.SingleLine = Not(Multiline)";
_tf.setSingleLine(__c.Not(__ref._multiline /*boolean*/ ));
RDebugUtils.currentLine=142278675;
 //BA.debugLineNum = 142278675;BA.debugLine="tf.PasswordMode = Password";
_tf.setPasswordMode(_password);
RDebugUtils.currentLine=142278676;
 //BA.debugLineNum = 142278676;BA.debugLine="If Password Then";
if (_password) { 
RDebugUtils.currentLine=142278677;
 //BA.debugLineNum = 142278677;BA.debugLine="If KeyboardType <> \"Text\" Then";
if ((__ref._keyboardtype /*String*/ ).equals("Text") == false) { 
RDebugUtils.currentLine=142278678;
 //BA.debugLineNum = 142278678;BA.debugLine="tf.InputType = Bit.Or(tf.INPUT_TYPE_NUMBERS, 16";
_tf.setInputType(__c.Bit.Or(_tf.INPUT_TYPE_NUMBERS,(int) (16)));
 }else {
RDebugUtils.currentLine=142278680;
 //BA.debugLineNum = 142278680;BA.debugLine="tf.InputType = Bit.Or(0x00000080, 0x00080000) '";
_tf.setInputType(__c.Bit.Or(((int)0x00000080),((int)0x00080000)));
 };
 }else {
RDebugUtils.currentLine=142278683;
 //BA.debugLineNum = 142278683;BA.debugLine="Select KeyboardType";
switch (BA.switchObjectToInt(__ref._keyboardtype /*String*/ ,"Numbers","Decimal")) {
case 0: {
RDebugUtils.currentLine=142278685;
 //BA.debugLineNum = 142278685;BA.debugLine="tf.InputType = tf.INPUT_TYPE_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_NUMBERS);
 break; }
case 1: {
RDebugUtils.currentLine=142278687;
 //BA.debugLineNum = 142278687;BA.debugLine="tf.InputType = tf.INPUT_TYPE_DECIMAL_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_DECIMAL_NUMBERS);
 break; }
}
;
 };
RDebugUtils.currentLine=142278690;
 //BA.debugLineNum = 142278690;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject()));
RDebugUtils.currentLine=142278714;
 //BA.debugLineNum = 142278714;BA.debugLine="End Sub";
return null;
}
public String  _createtextfieldall(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,boolean _passwordmode,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createtextfieldall", true))
	 {return ((String) Debug.delegate(ba, "createtextfieldall", new Object[] {_passwordmode,_font1,_textcolor}));}
RDebugUtils.currentLine=141033472;
 //BA.debugLineNum = 141033472;BA.debugLine="Private Sub CreateTextFieldAll (PasswordMode As Bo";
RDebugUtils.currentLine=141033473;
 //BA.debugLineNum = 141033473;BA.debugLine="mTextField = CreateTextField (PasswordMode)";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_passwordmode);
RDebugUtils.currentLine=141033474;
 //BA.debugLineNum = 141033474;BA.debugLine="mTextField.Font = Font1";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_font1);
RDebugUtils.currentLine=141033475;
 //BA.debugLineNum = 141033475;BA.debugLine="mTextField.TextColor = TextColor";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=141033476;
 //BA.debugLineNum = 141033476;BA.debugLine="setNextField(mNextTextField)";
__ref._setnextfield /*String*/ (null,__ref._mnexttextfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ );
RDebugUtils.currentLine=141033477;
 //BA.debugLineNum = 141033477;BA.debugLine="mBase.AddView(mTextField, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=141033478;
 //BA.debugLineNum = 141033478;BA.debugLine="End Sub";
return "";
}
public String  _setnextfield(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,ir.parsikhesab.pakhsh.b4xfloattextfield _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "setnextfield", true))
	 {return ((String) Debug.delegate(ba, "setnextfield", new Object[] {_field}));}
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
Object _o = null;
RDebugUtils.currentLine=142082048;
 //BA.debugLineNum = 142082048;BA.debugLine="Public Sub setNextField (Field As B4XFloatTextFiel";
RDebugUtils.currentLine=142082049;
 //BA.debugLineNum = 142082049;BA.debugLine="If Field.IsInitialized = False Then Return";
if (_field.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=142082051;
 //BA.debugLineNum = 142082051;BA.debugLine="If Multiline = False Then";
if (__ref._multiline /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=142082052;
 //BA.debugLineNum = 142082052;BA.debugLine="If Field <> Me Then";
if ((_field).equals((ir.parsikhesab.pakhsh.b4xfloattextfield)(this)) == false) { 
RDebugUtils.currentLine=142082053;
 //BA.debugLineNum = 142082053;BA.debugLine="IME.AddHandleActionEvent(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .AddHandleActionEvent((android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),ba);
 };
RDebugUtils.currentLine=142082055;
 //BA.debugLineNum = 142082055;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=142082056;
 //BA.debugLineNum = 142082056;BA.debugLine="et.ForceDoneButton = True";
_et.setForceDoneButton(__c.True);
 };
RDebugUtils.currentLine=142082059;
 //BA.debugLineNum = 142082059;BA.debugLine="Dim o As Object = Field";
_o = (Object)(_field);
RDebugUtils.currentLine=142082060;
 //BA.debugLineNum = 142082060;BA.debugLine="mNextTextField = o";
__ref._mnexttextfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/  = (ir.parsikhesab.pakhsh.b4xfloattextfield)(_o);
RDebugUtils.currentLine=142082061;
 //BA.debugLineNum = 142082061;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _passedlabel = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
boolean _passwordmode = false;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=140967936;
 //BA.debugLineNum = 140967936;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=140967937;
 //BA.debugLineNum = 140967937;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=140967938;
 //BA.debugLineNum = 140967938;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=140967938;
 //BA.debugLineNum = 140967938;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=140967939;
 //BA.debugLineNum = 140967939;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=140967940;
 //BA.debugLineNum = 140967940;BA.debugLine="mProps = Props";
__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/  = _props;
RDebugUtils.currentLine=140967941;
 //BA.debugLineNum = 140967941;BA.debugLine="Dim PassedLabel As B4XView = lbl";
_passedlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_passedlabel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=140967942;
 //BA.debugLineNum = 140967942;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=140967943;
 //BA.debugLineNum = 140967943;BA.debugLine="iv.Initialize(\"HintImageView\")";
_iv.Initialize(ba,"HintImageView");
RDebugUtils.currentLine=140967944;
 //BA.debugLineNum = 140967944;BA.debugLine="HintImageView = iv";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=140967945;
 //BA.debugLineNum = 140967945;BA.debugLine="KeyboardType = Props.GetDefault(\"KeyboardType\", \"";
__ref._keyboardtype /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("KeyboardType"),(Object)("Text")));
RDebugUtils.currentLine=140967951;
 //BA.debugLineNum = 140967951;BA.debugLine="HintColor = xui.PaintOrColorToColor(Props.Get(\"Hi";
__ref._hintcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HintColor")));
RDebugUtils.currentLine=140967952;
 //BA.debugLineNum = 140967952;BA.debugLine="NonFocusedHintColor = xui.PaintOrColorToColor(Pro";
__ref._nonfocusedhintcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("NonFocusedHintColor")));
RDebugUtils.currentLine=140967954;
 //BA.debugLineNum = 140967954;BA.debugLine="HintText = Props.Get(\"Hint\")";
__ref._hinttext /*String*/  = BA.ObjectToString(_props.Get((Object)("Hint")));
RDebugUtils.currentLine=140967955;
 //BA.debugLineNum = 140967955;BA.debugLine="HintFont = PassedLabel.Font";
__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _passedlabel.getFont();
RDebugUtils.currentLine=140967956;
 //BA.debugLineNum = 140967956;BA.debugLine="Dim PasswordMode As Boolean = Props.GetDefault(\"P";
_passwordmode = BA.ObjectToBoolean(_props.GetDefault((Object)("PasswordField"),(Object)(__c.False)));
RDebugUtils.currentLine=140967957;
 //BA.debugLineNum = 140967957;BA.debugLine="Multiline = Props.GetDefault(\"Multiline\", False)";
__ref._multiline /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("Multiline"),(Object)(__c.False)));
RDebugUtils.currentLine=140967958;
 //BA.debugLineNum = 140967958;BA.debugLine="If PasswordMode And Multiline Then";
if (_passwordmode && __ref._multiline /*boolean*/ ) { 
RDebugUtils.currentLine=140967959;
 //BA.debugLineNum = 140967959;BA.debugLine="Multiline = False";
__ref._multiline /*boolean*/  = __c.False;
RDebugUtils.currentLine=140967960;
 //BA.debugLineNum = 140967960;BA.debugLine="Log(\"Multiline not supported with password mode.";
__c.LogImpl("9140967960","Multiline not supported with password mode.",0);
 };
RDebugUtils.currentLine=140967962;
 //BA.debugLineNum = 140967962;BA.debugLine="CreateTextFieldAll(PasswordMode, PassedLabel.Font";
__ref._createtextfieldall /*String*/ (null,_passwordmode,_passedlabel.getFont(),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_lbl.getTextColor())));
RDebugUtils.currentLine=140967964;
 //BA.debugLineNum = 140967964;BA.debugLine="mBase.AddView(HintImageView, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=140967965;
 //BA.debugLineNum = 140967965;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=140967966;
 //BA.debugLineNum = 140967966;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=140967967;
 //BA.debugLineNum = 140967967;BA.debugLine="MeasuringCanvas.Initialize(p)";
__ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_p);
RDebugUtils.currentLine=140967968;
 //BA.debugLineNum = 140967968;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=140967969;
 //BA.debugLineNum = 140967969;BA.debugLine="If PasswordMode And Props.GetDefault(\"ShowRevealB";
if (_passwordmode && BA.ObjectToBoolean(_props.GetDefault((Object)("ShowRevealButton"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=140967970;
 //BA.debugLineNum = 140967970;BA.debugLine="CreateRevealButton";
__ref._createrevealbutton /*String*/ (null);
 }else {
RDebugUtils.currentLine=140967972;
 //BA.debugLineNum = 140967972;BA.debugLine="CreateClearButton";
__ref._createclearbutton /*String*/ (null);
 };
RDebugUtils.currentLine=140967974;
 //BA.debugLineNum = 140967974;BA.debugLine="CreateAcceptButton";
__ref._createacceptbutton /*String*/ (null);
RDebugUtils.currentLine=140967975;
 //BA.debugLineNum = 140967975;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=140967976;
 //BA.debugLineNum = 140967976;BA.debugLine="End Sub";
return "";
}
public ir.parsikhesab.pakhsh.b4xfloattextfield  _getnextfield(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "getnextfield", true))
	 {return ((ir.parsikhesab.pakhsh.b4xfloattextfield) Debug.delegate(ba, "getnextfield", null));}
RDebugUtils.currentLine=142016512;
 //BA.debugLineNum = 142016512;BA.debugLine="Public Sub getNextField As B4XFloatTextField";
RDebugUtils.currentLine=142016513;
 //BA.debugLineNum = 142016513;BA.debugLine="Return mNextTextField";
if (true) return __ref._mnexttextfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ;
RDebugUtils.currentLine=142016514;
 //BA.debugLineNum = 142016514;BA.debugLine="End Sub";
return null;
}
public String  _gettext(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=142344192;
 //BA.debugLineNum = 142344192;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=142344193;
 //BA.debugLineNum = 142344193;BA.debugLine="Return mTextField.Text";
if (true) return __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=142344194;
 //BA.debugLineNum = 142344194;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _gettextfield(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "gettextfield", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "gettextfield", null));}
RDebugUtils.currentLine=142540800;
 //BA.debugLineNum = 142540800;BA.debugLine="Public Sub getTextField As B4XView";
RDebugUtils.currentLine=142540801;
 //BA.debugLineNum = 142540801;BA.debugLine="Return mTextField";
if (true) return __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=142540802;
 //BA.debugLineNum = 142540802;BA.debugLine="End Sub";
return null;
}
public boolean  _ime_handleaction(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "ime_handleaction", true))
	 {return ((Boolean) Debug.delegate(ba, "ime_handleaction", null));}
RDebugUtils.currentLine=142147584;
 //BA.debugLineNum = 142147584;BA.debugLine="Private Sub ime_HandleAction As Boolean";
RDebugUtils.currentLine=142147585;
 //BA.debugLineNum = 142147585;BA.debugLine="tf_EnterPressed";
__ref._tf_enterpressed /*String*/ (null);
RDebugUtils.currentLine=142147586;
 //BA.debugLineNum = 142147586;BA.debugLine="If mNextTextField.IsInitialized Then Return True";
if (__ref._mnexttextfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()) { 
if (true) return __c.True;};
RDebugUtils.currentLine=142147587;
 //BA.debugLineNum = 142147587;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=142147588;
 //BA.debugLineNum = 142147588;BA.debugLine="End Sub";
return false;
}
public String  _tf_enterpressed(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "tf_enterpressed", null));}
RDebugUtils.currentLine=142213120;
 //BA.debugLineNum = 142213120;BA.debugLine="Private Sub tf_EnterPressed";
RDebugUtils.currentLine=142213121;
 //BA.debugLineNum = 142213121;BA.debugLine="tf_Action";
__ref._tf_action /*String*/ (null);
RDebugUtils.currentLine=142213126;
 //BA.debugLineNum = 142213126;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=140902400;
 //BA.debugLineNum = 140902400;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=140902401;
 //BA.debugLineNum = 140902401;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=140902402;
 //BA.debugLineNum = 140902402;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=140902403;
 //BA.debugLineNum = 140902403;BA.debugLine="If xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=140902404;
 //BA.debugLineNum = 140902404;BA.debugLine="HintLabelLargeOffsetX = 6dip";
__ref._hintlabellargeoffsetx /*int*/  = __c.DipToCurrent((int) (6));
 }else {
RDebugUtils.currentLine=140902406;
 //BA.debugLineNum = 140902406;BA.debugLine="HintLabelLargeOffsetX = 12dip";
__ref._hintlabellargeoffsetx /*int*/  = __c.DipToCurrent((int) (12));
 };
RDebugUtils.currentLine=140902409;
 //BA.debugLineNum = 140902409;BA.debugLine="IME.Initialize(\"ime\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("ime");
RDebugUtils.currentLine=140902415;
 //BA.debugLineNum = 140902415;BA.debugLine="End Sub";
return "";
}
public String  _lc_click(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "lc_click", true))
	 {return ((String) Debug.delegate(ba, "lc_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
RDebugUtils.currentLine=142475264;
 //BA.debugLineNum = 142475264;BA.debugLine="Private Sub lc_Click";
RDebugUtils.currentLine=142475265;
 //BA.debugLineNum = 142475265;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=142475266;
 //BA.debugLineNum = 142475266;BA.debugLine="Select btn.Tag";
switch (BA.switchObjectToInt(_btn.getTag(),(Object)("clear"),(Object)("reveal"),(Object)("hide"),(Object)("v"))) {
case 0: {
RDebugUtils.currentLine=142475268;
 //BA.debugLineNum = 142475268;BA.debugLine="setText(\"\")";
__ref._settext /*String*/ (null,"");
 break; }
case 1: {
RDebugUtils.currentLine=142475270;
 //BA.debugLineNum = 142475270;BA.debugLine="SwitchFromPasswordToRegular (True)";
__ref._switchfrompasswordtoregular /*void*/ (null,__c.True);
 break; }
case 2: {
RDebugUtils.currentLine=142475272;
 //BA.debugLineNum = 142475272;BA.debugLine="SwitchFromPasswordToRegular(False)";
__ref._switchfrompasswordtoregular /*void*/ (null,__c.False);
 break; }
case 3: {
RDebugUtils.currentLine=142475274;
 //BA.debugLineNum = 142475274;BA.debugLine="tf_EnterPressed";
__ref._tf_enterpressed /*String*/ (null);
RDebugUtils.currentLine=142475275;
 //BA.debugLineNum = 142475275;BA.debugLine="If mNextTextField.IsInitialized = False Or mNex";
if (__ref._mnexttextfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()==__c.False || (__ref._mnexttextfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ).equals((ir.parsikhesab.pakhsh.b4xfloattextfield)(this))) { 
RDebugUtils.currentLine=142475277;
 //BA.debugLineNum = 142475277;BA.debugLine="IME.HideKeyboard";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);
 };
 break; }
}
;
RDebugUtils.currentLine=142475283;
 //BA.debugLineNum = 142475283;BA.debugLine="End Sub";
return "";
}
public String  _settext(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_s}));}
String _old = "";
RDebugUtils.currentLine=142409728;
 //BA.debugLineNum = 142409728;BA.debugLine="Public Sub setText(s As String)";
RDebugUtils.currentLine=142409729;
 //BA.debugLineNum = 142409729;BA.debugLine="Dim old As String = mTextField.Text 'ignore";
_old = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=142409730;
 //BA.debugLineNum = 142409730;BA.debugLine="mTextField.Text = s";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_s));
RDebugUtils.currentLine=142409732;
 //BA.debugLineNum = 142409732;BA.debugLine="If IsPaused(Me) Then tf_TextChanged(old, s)";
if (__c.IsPaused(ba,this)) { 
__ref._tf_textchanged /*String*/ (null,_old,_s);};
RDebugUtils.currentLine=142409736;
 //BA.debugLineNum = 142409736;BA.debugLine="End Sub";
return "";
}
public void  _switchfrompasswordtoregular(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,boolean _toregular) throws Exception{
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "switchfrompasswordtoregular", true))
	 {Debug.delegate(ba, "switchfrompasswordtoregular", new Object[] {_toregular}); return;}
ResumableSub_SwitchFromPasswordToRegular rsub = new ResumableSub_SwitchFromPasswordToRegular(this,__ref,_toregular);
rsub.resume(ba, null);
}
public static class ResumableSub_SwitchFromPasswordToRegular extends BA.ResumableSub {
public ResumableSub_SwitchFromPasswordToRegular(ir.parsikhesab.pakhsh.b4xfloattextfield parent,ir.parsikhesab.pakhsh.b4xfloattextfield __ref,boolean _toregular) {
this.parent = parent;
this.__ref = __ref;
this._toregular = _toregular;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.b4xfloattextfield __ref;
ir.parsikhesab.pakhsh.b4xfloattextfield parent;
boolean _toregular;
String _text = "";
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _oldfield = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xfloattextfield";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=141295617;
 //BA.debugLineNum = 141295617;BA.debugLine="Dim text As String = mTextField.Text";
_text = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=141295618;
 //BA.debugLineNum = 141295618;BA.debugLine="Dim textcolor As Int = mTextField.TextColor";
_textcolor = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor();
RDebugUtils.currentLine=141295619;
 //BA.debugLineNum = 141295619;BA.debugLine="Dim Font1 As B4XFont = mTextField.Font";
_font1 = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=141295620;
 //BA.debugLineNum = 141295620;BA.debugLine="Dim oldfield As B4XView = mTextField";
_oldfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
_oldfield = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=141295622;
 //BA.debugLineNum = 141295622;BA.debugLine="CreateTextFieldAll(Not(ToRegular), Font1, textcol";
__ref._createtextfieldall /*String*/ (null,parent.__c.Not(_toregular),_font1,_textcolor);
RDebugUtils.currentLine=141295623;
 //BA.debugLineNum = 141295623;BA.debugLine="mTextField.Text = text";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=141295624;
 //BA.debugLineNum = 141295624;BA.debugLine="If lblClear.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 10;
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=141295625;
 //BA.debugLineNum = 141295625;BA.debugLine="If ToRegular = False Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_toregular==parent.__c.False) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=141295626;
 //BA.debugLineNum = 141295626;BA.debugLine="lblClear.Text = Chr(0xE8F4)";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr(((int)0xe8f4))));
RDebugUtils.currentLine=141295627;
 //BA.debugLineNum = 141295627;BA.debugLine="lblClear.Tag = \"reveal\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("reveal"));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=141295629;
 //BA.debugLineNum = 141295629;BA.debugLine="lblClear.Tag = \"hide\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("hide"));
RDebugUtils.currentLine=141295630;
 //BA.debugLineNum = 141295630;BA.debugLine="lblClear.Text = Chr(0xE8F5)";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr(((int)0xe8f5))));
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=141295632;
 //BA.debugLineNum = 141295632;BA.debugLine="lblClear.BringToFront";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
 if (true) break;
;
RDebugUtils.currentLine=141295634;
 //BA.debugLineNum = 141295634;BA.debugLine="If lblV.IsInitialized Then lblV.BringToFront";

case 10:
//if
this.state = 15;
if (__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=141295635;
 //BA.debugLineNum = 141295635;BA.debugLine="HintImageView.BringToFront";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=141295636;
 //BA.debugLineNum = 141295636;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=141295641;
 //BA.debugLineNum = 141295641;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=141295642;
 //BA.debugLineNum = 141295642;BA.debugLine="et.SelectionStart = mTextField.Text.Length";
_et.setSelectionStart(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length());
RDebugUtils.currentLine=141295644;
 //BA.debugLineNum = 141295644;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now";
__ref._lastswitchtextfieldtime /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=141295645;
 //BA.debugLineNum = 141295645;BA.debugLine="mTextField.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=141295646;
 //BA.debugLineNum = 141295646;BA.debugLine="oldfield.RemoveViewFromParent";
_oldfield.RemoveViewFromParent();
RDebugUtils.currentLine=141295648;
 //BA.debugLineNum = 141295648;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now + 200";
__ref._lastswitchtextfieldtime /*long*/  = (long) (parent.__c.DateTime.getNow()+200);
RDebugUtils.currentLine=141295649;
 //BA.debugLineNum = 141295649;BA.debugLine="et.Enabled = False";
_et.setEnabled(parent.__c.False);
RDebugUtils.currentLine=141295650;
 //BA.debugLineNum = 141295650;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xfloattextfield", "switchfrompasswordtoregular"),(int) (50));
this.state = 20;
return;
case 20:
//C
this.state = 16;
;
RDebugUtils.currentLine=141295651;
 //BA.debugLineNum = 141295651;BA.debugLine="et.Enabled = True";
_et.setEnabled(parent.__c.True);
RDebugUtils.currentLine=141295652;
 //BA.debugLineNum = 141295652;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xfloattextfield", "switchfrompasswordtoregular"),(int) (50));
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=141295653;
 //BA.debugLineNum = 141295653;BA.debugLine="et.RequestFocus";
_et.RequestFocus();
RDebugUtils.currentLine=141295654;
 //BA.debugLineNum = 141295654;BA.debugLine="IME.ShowKeyboard(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=141295656;
 //BA.debugLineNum = 141295656;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Passwo";
if (true) break;

case 16:
//if
this.state = 19;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PasswordRevealChanged",(int) (1))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=141295657;
 //BA.debugLineNum = 141295657;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Passwo";
parent.__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PasswordRevealChanged",(Object)(_toregular));
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=141295659;
 //BA.debugLineNum = 141295659;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _requestfocusandshowkeyboard(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "requestfocusandshowkeyboard", true))
	 {return ((String) Debug.delegate(ba, "requestfocusandshowkeyboard", null));}
RDebugUtils.currentLine=142606336;
 //BA.debugLineNum = 142606336;BA.debugLine="Public Sub RequestFocusAndShowKeyboard";
RDebugUtils.currentLine=142606337;
 //BA.debugLineNum = 142606337;BA.debugLine="mTextField.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=142606339;
 //BA.debugLineNum = 142606339;BA.debugLine="IME.ShowKeyboard(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=142606341;
 //BA.debugLineNum = 142606341;BA.debugLine="End Sub";
return "";
}
public String  _tf_textchanged(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_textchanged", true))
	 {return ((String) Debug.delegate(ba, "tf_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=141950976;
 //BA.debugLineNum = 141950976;BA.debugLine="Private Sub tf_TextChanged (Old As String, New As";
RDebugUtils.currentLine=141950977;
 //BA.debugLineNum = 141950977;BA.debugLine="UpdateLabel(New, False)";
__ref._updatelabel /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=141950978;
 //BA.debugLineNum = 141950978;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TextCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(int) (2)) && __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=141950979;
 //BA.debugLineNum = 141950979;BA.debugLine="CallSub3(mCallBack, mEventName & \"_TextChanged\",";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(Object)(_old),(Object)(_new));
 };
RDebugUtils.currentLine=141950981;
 //BA.debugLineNum = 141950981;BA.debugLine="End Sub";
return "";
}
public String  _tf_action(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_action", true))
	 {return ((String) Debug.delegate(ba, "tf_action", null));}
RDebugUtils.currentLine=141885440;
 //BA.debugLineNum = 141885440;BA.debugLine="Private Sub tf_Action";
RDebugUtils.currentLine=141885441;
 //BA.debugLineNum = 141885441;BA.debugLine="If mNextTextField.IsInitialized And mNextTextFiel";
if (__ref._mnexttextfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ .IsInitialized /*boolean*/ () && (__ref._mnexttextfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ).equals((ir.parsikhesab.pakhsh.b4xfloattextfield)(this)) == false) { 
RDebugUtils.currentLine=141885442;
 //BA.debugLineNum = 141885442;BA.debugLine="mNextTextField.TextField.RequestFocus";
__ref._mnexttextfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
 };
RDebugUtils.currentLine=141885444;
 //BA.debugLineNum = 141885444;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EnterP";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed",(int) (0))) { 
RDebugUtils.currentLine=141885445;
 //BA.debugLineNum = 141885445;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_EnterPr";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed");
 };
RDebugUtils.currentLine=141885447;
 //BA.debugLineNum = 141885447;BA.debugLine="End Sub";
return "";
}
public String  _tf_beginedit(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_beginedit", true))
	 {return ((String) Debug.delegate(ba, "tf_beginedit", null));}
RDebugUtils.currentLine=141754368;
 //BA.debugLineNum = 141754368;BA.debugLine="Private Sub tf_BeginEdit";
RDebugUtils.currentLine=141754369;
 //BA.debugLineNum = 141754369;BA.debugLine="tf_FocusChanged(True)";
__ref._tf_focuschanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=141754370;
 //BA.debugLineNum = 141754370;BA.debugLine="End Sub";
return "";
}
public String  _tf_focuschanged(ir.parsikhesab.pakhsh.b4xfloattextfield __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "tf_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=141557760;
 //BA.debugLineNum = 141557760;BA.debugLine="Private Sub tf_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=141557761;
 //BA.debugLineNum = 141557761;BA.debugLine="Focused = HasFocus";
__ref._focused /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=141557762;
 //BA.debugLineNum = 141557762;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=141557763;
 //BA.debugLineNum = 141557763;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_FocusC";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
RDebugUtils.currentLine=141557764;
 //BA.debugLineNum = 141557764;BA.debugLine="If LastSwitchTextFieldTime + 100 < DateTime.Now";
if (__ref._lastswitchtextfieldtime /*long*/ +100<__c.DateTime.getNow()) { 
RDebugUtils.currentLine=141557765;
 //BA.debugLineNum = 141557765;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Focus";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(__ref._focused /*boolean*/ ));
 };
 };
RDebugUtils.currentLine=141557768;
 //BA.debugLineNum = 141557768;BA.debugLine="End Sub";
return "";
}
public String  _tf_endedit(ir.parsikhesab.pakhsh.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_endedit", true))
	 {return ((String) Debug.delegate(ba, "tf_endedit", null));}
RDebugUtils.currentLine=141819904;
 //BA.debugLineNum = 141819904;BA.debugLine="Private Sub tf_EndEdit";
RDebugUtils.currentLine=141819905;
 //BA.debugLineNum = 141819905;BA.debugLine="tf_FocusChanged(False)";
__ref._tf_focuschanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=141819906;
 //BA.debugLineNum = 141819906;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("tf_focuschanged");
}
}