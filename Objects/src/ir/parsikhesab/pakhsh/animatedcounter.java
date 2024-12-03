package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class animatedcounter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.animatedcounter");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.animatedcounter.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _imageviews = null;
public int _mdigits = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltemplate = null;
public anywheresoftware.b4a.objects.collections.List _mvalue = null;
public int _digitheight = 0;
public int _digitwidth = 0;
public int _mduration = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _fade = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xfadeiv = null;
public Object _tag = null;
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
public String  _base_resize(ir.parsikhesab.pakhsh.animatedcounter __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _columns = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _left = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
RDebugUtils.currentLine=134217728;
 //BA.debugLineNum = 134217728;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=134217729;
 //BA.debugLineNum = 134217729;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=134217730;
 //BA.debugLineNum = 134217730;BA.debugLine="xfadeIv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=134217731;
 //BA.debugLineNum = 134217731;BA.debugLine="xfadeIv.SetBitmap(fade.Resize(Width, Height, Fals";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._fade /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_width),(int) (_height),__c.False).getObject()));
RDebugUtils.currentLine=134217732;
 //BA.debugLineNum = 134217732;BA.debugLine="DigitHeight = Height";
__ref._digitheight /*int*/  = (int) (_height);
RDebugUtils.currentLine=134217733;
 //BA.debugLineNum = 134217733;BA.debugLine="Dim Columns As Int = mdigits";
_columns = __ref._mdigits /*int*/ ;
RDebugUtils.currentLine=134217734;
 //BA.debugLineNum = 134217734;BA.debugLine="DigitWidth = Width / Columns";
__ref._digitwidth /*int*/  = (int) (_width/(double)_columns);
RDebugUtils.currentLine=134217735;
 //BA.debugLineNum = 134217735;BA.debugLine="Dim bmp As B4XBitmap = CreateBitmap(lblTemplate)";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,__ref._lbltemplate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=134217736;
 //BA.debugLineNum = 134217736;BA.debugLine="Dim left As Int = Width";
_left = (int) (_width);
RDebugUtils.currentLine=134217737;
 //BA.debugLineNum = 134217737;BA.debugLine="For i = 0 To ImageViews.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=134217738;
 //BA.debugLineNum = 134217738;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_iv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=134217740;
 //BA.debugLineNum = 134217740;BA.debugLine="left = left - DigitWidth";
_left = (int) (_left-__ref._digitwidth /*int*/ );
RDebugUtils.currentLine=134217741;
 //BA.debugLineNum = 134217741;BA.debugLine="iv.SetLayoutAnimated(0, left, TopFromValue(i), D";
_iv.SetLayoutAnimated((int) (0),_left,__ref._topfromvalue /*int*/ (null,_i),__ref._digitwidth /*int*/ ,(int) (__ref._digitheight /*int*/ *10));
RDebugUtils.currentLine=134217742;
 //BA.debugLineNum = 134217742;BA.debugLine="iv.SetBitmap(bmp)";
_iv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=134217744;
 //BA.debugLineNum = 134217744;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createbitmap(ir.parsikhesab.pakhsh.animatedcounter __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "createbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createbitmap", new Object[] {_lbl}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _res = null;
RDebugUtils.currentLine=134348800;
 //BA.debugLineNum = 134348800;BA.debugLine="Private Sub CreateBitmap (lbl As B4XView) As B4XBi";
RDebugUtils.currentLine=134348801;
 //BA.debugLineNum = 134348801;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=134348802;
 //BA.debugLineNum = 134348802;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, DigitWidth, DigitHei";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._digitwidth /*int*/ ,(int) (__ref._digitheight /*int*/ *10));
RDebugUtils.currentLine=134348803;
 //BA.debugLineNum = 134348803;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=134348804;
 //BA.debugLineNum = 134348804;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
RDebugUtils.currentLine=134348805;
 //BA.debugLineNum = 134348805;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"5\", lbl.Font)";
_r = _cvs.MeasureText("5",_lbl.getFont());
RDebugUtils.currentLine=134348806;
 //BA.debugLineNum = 134348806;BA.debugLine="Dim BaseLine As Int = DigitHeight / 2 - r.Height";
_baseline = (int) (__ref._digitheight /*int*/ /(double)2-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=134348807;
 //BA.debugLineNum = 134348807;BA.debugLine="For i = 0 To 9";
{
final int step7 = 1;
final int limit7 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=134348808;
 //BA.debugLineNum = 134348808;BA.debugLine="cvs.DrawText(i, DigitWidth / 2, i * DigitHeight";
_cvs.DrawText(ba,BA.NumberToString(_i),(float) (__ref._digitwidth /*int*/ /(double)2),(float) (_i*__ref._digitheight /*int*/ +_baseline),_lbl.getFont(),_lbl.getTextColor(),BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=134348810;
 //BA.debugLineNum = 134348810;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
RDebugUtils.currentLine=134348811;
 //BA.debugLineNum = 134348811;BA.debugLine="Dim res As B4XBitmap = cvs.CreateBitmap";
_res = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_res = _cvs.CreateBitmap();
RDebugUtils.currentLine=134348812;
 //BA.debugLineNum = 134348812;BA.debugLine="cvs.Release";
_cvs.Release();
RDebugUtils.currentLine=134348813;
 //BA.debugLineNum = 134348813;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=134348814;
 //BA.debugLineNum = 134348814;BA.debugLine="End Sub";
return null;
}
public int  _topfromvalue(ir.parsikhesab.pakhsh.animatedcounter __ref,int _digit) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "topfromvalue", true))
	 {return ((Integer) Debug.delegate(ba, "topfromvalue", new Object[] {_digit}));}
int _d = 0;
RDebugUtils.currentLine=134283264;
 //BA.debugLineNum = 134283264;BA.debugLine="Private Sub TopFromValue (Digit As Int) As Int";
RDebugUtils.currentLine=134283265;
 //BA.debugLineNum = 134283265;BA.debugLine="Dim d As Int = mValue.Get(Digit)";
_d = (int)(BA.ObjectToNumber(__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_digit)));
RDebugUtils.currentLine=134283266;
 //BA.debugLineNum = 134283266;BA.debugLine="Return -d * DigitHeight";
if (true) return (int) (-_d*__ref._digitheight /*int*/ );
RDebugUtils.currentLine=134283267;
 //BA.debugLineNum = 134283267;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(ir.parsikhesab.pakhsh.animatedcounter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
RDebugUtils.currentLine=133955584;
 //BA.debugLineNum = 133955584;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=133955585;
 //BA.debugLineNum = 133955585;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=133955586;
 //BA.debugLineNum = 133955586;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=133955587;
 //BA.debugLineNum = 133955587;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=133955588;
 //BA.debugLineNum = 133955588;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=133955589;
 //BA.debugLineNum = 133955589;BA.debugLine="Private ImageViews As List";
_imageviews = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=133955590;
 //BA.debugLineNum = 133955590;BA.debugLine="Private mdigits As Int";
_mdigits = 0;
RDebugUtils.currentLine=133955591;
 //BA.debugLineNum = 133955591;BA.debugLine="Private lblTemplate As B4XView";
_lbltemplate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=133955592;
 //BA.debugLineNum = 133955592;BA.debugLine="Private mValue As List";
_mvalue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=133955593;
 //BA.debugLineNum = 133955593;BA.debugLine="Private DigitHeight, DigitWidth As Int";
_digitheight = 0;
_digitwidth = 0;
RDebugUtils.currentLine=133955594;
 //BA.debugLineNum = 133955594;BA.debugLine="Private mDuration As Int";
_mduration = 0;
RDebugUtils.currentLine=133955595;
 //BA.debugLineNum = 133955595;BA.debugLine="Private fade As B4XBitmap";
_fade = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=133955596;
 //BA.debugLineNum = 133955596;BA.debugLine="Private xfadeIv As B4XView";
_xfadeiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=133955597;
 //BA.debugLineNum = 133955597;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=133955599;
 //BA.debugLineNum = 133955599;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createfadebitmap(ir.parsikhesab.pakhsh.animatedcounter __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "createfadebitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createfadebitmap", new Object[] {_clr}));}
b4a.example.bitmapcreator _bc = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _tclr = 0;
RDebugUtils.currentLine=134152192;
 //BA.debugLineNum = 134152192;BA.debugLine="Private Sub CreateFadeBitmap (clr As Int) As B4XBi";
RDebugUtils.currentLine=134152193;
 //BA.debugLineNum = 134152193;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=134152194;
 //BA.debugLineNum = 134152194;BA.debugLine="bc.Initialize(200, 50)";
_bc._initialize(ba,(int) (200),(int) (50));
RDebugUtils.currentLine=134152195;
 //BA.debugLineNum = 134152195;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=134152196;
 //BA.debugLineNum = 134152196;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight / 3)";
_r.Initialize((float) (0),(float) (0),(float) (_bc._mwidth),(float) (_bc._mheight/(double)3));
RDebugUtils.currentLine=134152197;
 //BA.debugLineNum = 134152197;BA.debugLine="Dim tclr As Int = Bit.And(0x00ffffff, clr)";
_tclr = __c.Bit.And(((int)0x00ffffff),_clr);
RDebugUtils.currentLine=134152198;
 //BA.debugLineNum = 134152198;BA.debugLine="bc.FillGradient(Array As Int(clr, tclr), r, \"TOP_";
_bc._fillgradient(new int[]{_clr,_tclr},_r,"TOP_BOTTOM");
RDebugUtils.currentLine=134152199;
 //BA.debugLineNum = 134152199;BA.debugLine="r.Top = bc.mHeight * 2 / 3";
_r.setTop((float) (_bc._mheight*2/(double)3));
RDebugUtils.currentLine=134152200;
 //BA.debugLineNum = 134152200;BA.debugLine="r.Bottom = bc.mHeight";
_r.setBottom((float) (_bc._mheight));
RDebugUtils.currentLine=134152201;
 //BA.debugLineNum = 134152201;BA.debugLine="bc.FillGradient(Array As Int(clr, tclr), r, \"BOTT";
_bc._fillgradient(new int[]{_clr,_tclr},_r,"BOTTOM_TOP");
RDebugUtils.currentLine=134152202;
 //BA.debugLineNum = 134152202;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
RDebugUtils.currentLine=134152203;
 //BA.debugLineNum = 134152203;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(ir.parsikhesab.pakhsh.animatedcounter __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
int _i = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.ImageViewWrapper _fadeiv = null;
RDebugUtils.currentLine=134086656;
 //BA.debugLineNum = 134086656;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=134086657;
 //BA.debugLineNum = 134086657;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=134086658;
 //BA.debugLineNum = 134086658;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=134086658;
 //BA.debugLineNum = 134086658;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=134086659;
 //BA.debugLineNum = 134086659;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\") 'needed";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=134086660;
 //BA.debugLineNum = 134086660;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=134086661;
 //BA.debugLineNum = 134086661;BA.debugLine="mdigits = Props.Get(\"Digits\")";
__ref._mdigits /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Digits"))));
RDebugUtils.currentLine=134086662;
 //BA.debugLineNum = 134086662;BA.debugLine="mDuration = Props.Get(\"Duration\")";
__ref._mduration /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
RDebugUtils.currentLine=134086663;
 //BA.debugLineNum = 134086663;BA.debugLine="lblTemplate = lbl";
__ref._lbltemplate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=134086664;
 //BA.debugLineNum = 134086664;BA.debugLine="fade = CreateFadeBitmap(xui.PaintOrColorToColor(P";
__ref._fade /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createfadebitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("FadeColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White))));
RDebugUtils.currentLine=134086665;
 //BA.debugLineNum = 134086665;BA.debugLine="For i = 0 To mdigits - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mdigits /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=134086666;
 //BA.debugLineNum = 134086666;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=134086667;
 //BA.debugLineNum = 134086667;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=134086668;
 //BA.debugLineNum = 134086668;BA.debugLine="ImageViews.Add(iv)";
__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_iv.getObject()));
RDebugUtils.currentLine=134086669;
 //BA.debugLineNum = 134086669;BA.debugLine="mBase.GetView(0).AddView(iv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).AddView((android.view.View)(_iv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 }
};
RDebugUtils.currentLine=134086671;
 //BA.debugLineNum = 134086671;BA.debugLine="Dim fadeIv As ImageView";
_fadeiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=134086672;
 //BA.debugLineNum = 134086672;BA.debugLine="fadeIv.Initialize(\"\")";
_fadeiv.Initialize(ba,"");
RDebugUtils.currentLine=134086673;
 //BA.debugLineNum = 134086673;BA.debugLine="xfadeIv = fadeIv";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_fadeiv.getObject()));
RDebugUtils.currentLine=134086674;
 //BA.debugLineNum = 134086674;BA.debugLine="mBase.GetView(0).AddView(fadeIv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).AddView((android.view.View)(_fadeiv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=134086675;
 //BA.debugLineNum = 134086675;BA.debugLine="setValue(0)";
__ref._setvalue /*String*/ (null,(int) (0));
RDebugUtils.currentLine=134086676;
 //BA.debugLineNum = 134086676;BA.debugLine="If xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=134086677;
 //BA.debugLineNum = 134086677;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=134086678;
 //BA.debugLineNum = 134086678;BA.debugLine="setValue(getValue)";
__ref._setvalue /*String*/ (null,__ref._getvalue /*int*/ (null));
 };
RDebugUtils.currentLine=134086680;
 //BA.debugLineNum = 134086680;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(ir.parsikhesab.pakhsh.animatedcounter __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
RDebugUtils.currentLine=134414336;
 //BA.debugLineNum = 134414336;BA.debugLine="Public Sub setValue(v As Int)";
RDebugUtils.currentLine=134414337;
 //BA.debugLineNum = 134414337;BA.debugLine="mValue.Clear";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=134414338;
 //BA.debugLineNum = 134414338;BA.debugLine="For i = 0 To mdigits - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mdigits /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=134414339;
 //BA.debugLineNum = 134414339;BA.debugLine="mValue.Add(v Mod 10)";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v%10));
RDebugUtils.currentLine=134414340;
 //BA.debugLineNum = 134414340;BA.debugLine="v = v / 10";
_v = (int) (_v/(double)10);
RDebugUtils.currentLine=134414341;
 //BA.debugLineNum = 134414341;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_iv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=134414342;
 //BA.debugLineNum = 134414342;BA.debugLine="iv.SetLayoutAnimated(mDuration, iv.Left, TopFrom";
_iv.SetLayoutAnimated(__ref._mduration /*int*/ ,_iv.getLeft(),__ref._topfromvalue /*int*/ (null,_i),(int) (__c.Max(1,_iv.getWidth())),(int) (__c.Max(1,_iv.getHeight())));
 }
};
RDebugUtils.currentLine=134414345;
 //BA.debugLineNum = 134414345;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(ir.parsikhesab.pakhsh.animatedcounter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
int _res = 0;
int _i = 0;
RDebugUtils.currentLine=134479872;
 //BA.debugLineNum = 134479872;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=134479873;
 //BA.debugLineNum = 134479873;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=134479874;
 //BA.debugLineNum = 134479874;BA.debugLine="For i = 0 To mValue.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=134479875;
 //BA.debugLineNum = 134479875;BA.debugLine="res = res + mValue.Get(i) * Power(10, i)";
_res = (int) (_res+(double)(BA.ObjectToNumber(__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))*__c.Power(10,_i));
 }
};
RDebugUtils.currentLine=134479877;
 //BA.debugLineNum = 134479877;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=134479878;
 //BA.debugLineNum = 134479878;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.animatedcounter __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=134021120;
 //BA.debugLineNum = 134021120;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=134021121;
 //BA.debugLineNum = 134021121;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=134021122;
 //BA.debugLineNum = 134021122;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=134021123;
 //BA.debugLineNum = 134021123;BA.debugLine="ImageViews.Initialize";
__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=134021124;
 //BA.debugLineNum = 134021124;BA.debugLine="mValue.Initialize";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=134021125;
 //BA.debugLineNum = 134021125;BA.debugLine="End Sub";
return "";
}
}