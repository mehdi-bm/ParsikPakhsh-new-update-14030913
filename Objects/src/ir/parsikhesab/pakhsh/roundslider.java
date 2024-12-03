package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class roundslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.roundslider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.roundslider.class).invoke(this, new Object[] {null});
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
public int _mvalue = 0;
public int _mmin = 0;
public int _mmax = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _thumb = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _circlerect = null;
public int _valuecolor = 0;
public int _stroke = 0;
public int _thumbsize = 0;
public Object _tag = null;
public int _mthumbbordercolor = 0;
public int _mthumbinnercolor = 0;
public int _mcirclefillcolor = 0;
public int _mcirclenonvaluecolor = 0;
public boolean _mrollover = false;
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
public String  _base_resize(ir.parsikhesab.pakhsh.roundslider __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=152829952;
 //BA.debugLineNum = 152829952;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=152829953;
 //BA.debugLineNum = 152829953;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=152829954;
 //BA.debugLineNum = 152829954;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=152829955;
 //BA.debugLineNum = 152829955;BA.debugLine="If thumb.IsInitialized = False Then CreateThumb";
if (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
__ref._createthumb /*String*/ (null);};
RDebugUtils.currentLine=152829956;
 //BA.debugLineNum = 152829956;BA.debugLine="CircleRect.Initialize(ThumbSize + stroke, ThumbSi";
__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (_width-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ),(float) (_height-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ));
RDebugUtils.currentLine=152829957;
 //BA.debugLineNum = 152829957;BA.debugLine="xlbl.SetLayoutAnimated(0, CircleRect.Left, Circle";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight()));
RDebugUtils.currentLine=152829958;
 //BA.debugLineNum = 152829958;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=152829959;
 //BA.debugLineNum = 152829959;BA.debugLine="End Sub";
return "";
}
public String  _createthumb(ir.parsikhesab.pakhsh.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "createthumb", true))
	 {return ((String) Debug.delegate(ba, "createthumb", null));}
b4a.example.bcpath _p = null;
int _r = 0;
int _g = 0;
int _l = 0;
b4a.example.bitmapcreator _bc = null;
RDebugUtils.currentLine=152764416;
 //BA.debugLineNum = 152764416;BA.debugLine="Private Sub CreateThumb";
RDebugUtils.currentLine=152764417;
 //BA.debugLineNum = 152764417;BA.debugLine="Dim p As BCPath";
_p = new b4a.example.bcpath();
RDebugUtils.currentLine=152764418;
 //BA.debugLineNum = 152764418;BA.debugLine="Dim r As Int = 80dip";
_r = __c.DipToCurrent((int) (80));
RDebugUtils.currentLine=152764419;
 //BA.debugLineNum = 152764419;BA.debugLine="Dim g As Int = 8dip";
_g = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=152764420;
 //BA.debugLineNum = 152764420;BA.debugLine="Dim l As Int = 28dip";
_l = __c.DipToCurrent((int) (28));
RDebugUtils.currentLine=152764421;
 //BA.debugLineNum = 152764421;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=152764422;
 //BA.debugLineNum = 152764422;BA.debugLine="bc.Initialize(2 * r + g + 3dip, 2 * r + l + g)";
_bc._initialize(ba,(int) (2*_r+_g+__c.DipToCurrent((int) (3))),(int) (2*_r+_l+_g));
RDebugUtils.currentLine=152764423;
 //BA.debugLineNum = 152764423;BA.debugLine="p.Initialize(r - l + g, 2 * r - 2dip + g)";
_p._initialize(ba,(float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=152764424;
 //BA.debugLineNum = 152764424;BA.debugLine="p.LineTo(r + l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r+_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=152764425;
 //BA.debugLineNum = 152764425;BA.debugLine="p.LineTo(r + g, 2 * r + l + g)";
_p._lineto((float) (_r+_g),(float) (2*_r+_l+_g));
RDebugUtils.currentLine=152764426;
 //BA.debugLineNum = 152764426;BA.debugLine="p.LineTo(r - l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=152764427;
 //BA.debugLineNum = 152764427;BA.debugLine="bc.DrawPath(p, mThumbBorderColor, True, 0)";
_bc._drawpath(_p,__ref._mthumbbordercolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=152764428;
 //BA.debugLineNum = 152764428;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbInnerColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._mthumbinnercolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=152764429;
 //BA.debugLineNum = 152764429;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbBorderColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._mthumbbordercolor /*int*/ ,__c.False,__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=152764430;
 //BA.debugLineNum = 152764430;BA.debugLine="thumb = bc.Bitmap";
__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bc._getbitmap();
RDebugUtils.currentLine=152764431;
 //BA.debugLineNum = 152764431;BA.debugLine="ThumbSize = thumb.Height / 4";
__ref._thumbsize /*int*/  = (int) (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=152764432;
 //BA.debugLineNum = 152764432;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=152764433;
 //BA.debugLineNum = 152764433;BA.debugLine="End Sub";
return "";
}
public String  _draw(ir.parsikhesab.pakhsh.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
int _radius = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _b4jstrokeoffset = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _dest = null;
int _r = 0;
int _cx = 0;
int _cy = 0;
RDebugUtils.currentLine=152895488;
 //BA.debugLineNum = 152895488;BA.debugLine="Public Sub Draw";
RDebugUtils.currentLine=152895489;
 //BA.debugLineNum = 152895489;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=152895490;
 //BA.debugLineNum = 152895490;BA.debugLine="Dim radius As Int = CircleRect.Width / 2";
_radius = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2);
RDebugUtils.currentLine=152895491;
 //BA.debugLineNum = 152895491;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius),__ref._mcirclenonvaluecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
RDebugUtils.currentLine=152895492;
 //BA.debugLineNum = 152895492;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=152895493;
 //BA.debugLineNum = 152895493;BA.debugLine="Dim angle As Int = (mValue - mMin) / (mMax - mMin";
_angle = (int) ((__ref._mvalue /*int*/ -__ref._mmin /*int*/ )/(double)(__ref._mmax /*int*/ -__ref._mmin /*int*/ )*360);
RDebugUtils.currentLine=152895494;
 //BA.debugLineNum = 152895494;BA.debugLine="Dim B4JStrokeOffset As Int";
_b4jstrokeoffset = 0;
RDebugUtils.currentLine=152895495;
 //BA.debugLineNum = 152895495;BA.debugLine="If xui.IsB4J Then B4JStrokeOffset = stroke / 2";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_b4jstrokeoffset = (int) (__ref._stroke /*int*/ /(double)2);};
RDebugUtils.currentLine=152895496;
 //BA.debugLineNum = 152895496;BA.debugLine="If mValue = mMax Then";
if (__ref._mvalue /*int*/ ==__ref._mmax /*int*/ ) { 
RDebugUtils.currentLine=152895497;
 //BA.debugLineNum = 152895497;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Ce";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius),__ref._valuecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
 }else {
RDebugUtils.currentLine=152895499;
 //BA.debugLineNum = 152895499;BA.debugLine="p.InitializeArc(CircleRect.CenterX, CircleRect.C";
_p.InitializeArc(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius+_b4jstrokeoffset),(float) (-90),(float) (_angle));
RDebugUtils.currentLine=152895500;
 //BA.debugLineNum = 152895500;BA.debugLine="cvs.DrawPath(p, ValueColor, False, stroke)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._valuecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
 };
RDebugUtils.currentLine=152895502;
 //BA.debugLineNum = 152895502;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius-_b4jstrokeoffset),__ref._mcirclefillcolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=152895503;
 //BA.debugLineNum = 152895503;BA.debugLine="Dim dest As B4XRect";
_dest = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=152895504;
 //BA.debugLineNum = 152895504;BA.debugLine="Dim r As Int = radius + ThumbSize / 2 + stroke /";
_r = (int) (_radius+__ref._thumbsize /*int*/ /(double)2+__ref._stroke /*int*/ /(double)2);
RDebugUtils.currentLine=152895505;
 //BA.debugLineNum = 152895505;BA.debugLine="Dim cx As Int = CircleRect.CenterX + r * CosD(ang";
_cx = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX()+_r*__c.CosD(_angle-90));
RDebugUtils.currentLine=152895506;
 //BA.debugLineNum = 152895506;BA.debugLine="Dim cy As Int = CircleRect.CenterY + r * SinD(ang";
_cy = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY()+_r*__c.SinD(_angle-90));
RDebugUtils.currentLine=152895507;
 //BA.debugLineNum = 152895507;BA.debugLine="dest.Initialize(cx - thumb.Width / 8, cy - ThumbS";
_dest.Initialize((float) (_cx-__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy-__ref._thumbsize /*int*/ /(double)2),(float) (_cx+__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy+__ref._thumbsize /*int*/ /(double)2));
RDebugUtils.currentLine=152895508;
 //BA.debugLineNum = 152895508;BA.debugLine="cvs.DrawBitmapRotated(thumb, dest, angle)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawBitmapRotated((android.graphics.Bitmap)(__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()),_dest,(float) (_angle));
RDebugUtils.currentLine=152895509;
 //BA.debugLineNum = 152895509;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=152895510;
 //BA.debugLineNum = 152895510;BA.debugLine="xlbl.Text = mValue";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._mvalue /*int*/ ));
RDebugUtils.currentLine=152895511;
 //BA.debugLineNum = 152895511;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
RDebugUtils.currentLine=152436736;
 //BA.debugLineNum = 152436736;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=152436737;
 //BA.debugLineNum = 152436737;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=152436738;
 //BA.debugLineNum = 152436738;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=152436739;
 //BA.debugLineNum = 152436739;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=152436740;
 //BA.debugLineNum = 152436740;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=152436741;
 //BA.debugLineNum = 152436741;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=152436742;
 //BA.debugLineNum = 152436742;BA.debugLine="Private mValue As Int = 75";
_mvalue = (int) (75);
RDebugUtils.currentLine=152436743;
 //BA.debugLineNum = 152436743;BA.debugLine="Private mMin, mMax As Int";
_mmin = 0;
_mmax = 0;
RDebugUtils.currentLine=152436744;
 //BA.debugLineNum = 152436744;BA.debugLine="Private thumb As B4XBitmap";
_thumb = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=152436745;
 //BA.debugLineNum = 152436745;BA.debugLine="Private pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=152436746;
 //BA.debugLineNum = 152436746;BA.debugLine="Private xlbl As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=152436747;
 //BA.debugLineNum = 152436747;BA.debugLine="Private CircleRect As B4XRect";
_circlerect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=152436748;
 //BA.debugLineNum = 152436748;BA.debugLine="Private ValueColor As Int";
_valuecolor = 0;
RDebugUtils.currentLine=152436749;
 //BA.debugLineNum = 152436749;BA.debugLine="Private stroke As Int";
_stroke = 0;
RDebugUtils.currentLine=152436750;
 //BA.debugLineNum = 152436750;BA.debugLine="Private ThumbSize As Int";
_thumbsize = 0;
RDebugUtils.currentLine=152436751;
 //BA.debugLineNum = 152436751;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=152436752;
 //BA.debugLineNum = 152436752;BA.debugLine="Private mThumbBorderColor As Int = 0xFF5B5B5B";
_mthumbbordercolor = ((int)0xff5b5b5b);
RDebugUtils.currentLine=152436753;
 //BA.debugLineNum = 152436753;BA.debugLine="Private mThumbInnerColor As Int = xui.Color_White";
_mthumbinnercolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=152436754;
 //BA.debugLineNum = 152436754;BA.debugLine="Private mCircleFillColor As Int = xui.Color_White";
_mcirclefillcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=152436755;
 //BA.debugLineNum = 152436755;BA.debugLine="Private mCircleNonValueColor As Int = 0xFFB6B6B6";
_mcirclenonvaluecolor = ((int)0xffb6b6b6);
RDebugUtils.currentLine=152436756;
 //BA.debugLineNum = 152436756;BA.debugLine="Private mRollOver As Boolean";
_mrollover = false;
RDebugUtils.currentLine=152436757;
 //BA.debugLineNum = 152436757;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(ir.parsikhesab.pakhsh.roundslider __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=152567808;
 //BA.debugLineNum = 152567808;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=152567809;
 //BA.debugLineNum = 152567809;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=152567810;
 //BA.debugLineNum = 152567810;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=152567810;
 //BA.debugLineNum = 152567810;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=152567811;
 //BA.debugLineNum = 152567811;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=152567812;
 //BA.debugLineNum = 152567812;BA.debugLine="mMin = Props.Get(\"Min\")";
__ref._mmin /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
RDebugUtils.currentLine=152567813;
 //BA.debugLineNum = 152567813;BA.debugLine="mMax = Props.Get(\"Max\")";
__ref._mmax /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
RDebugUtils.currentLine=152567814;
 //BA.debugLineNum = 152567814;BA.debugLine="mValue = mMin";
__ref._mvalue /*int*/  = __ref._mmin /*int*/ ;
RDebugUtils.currentLine=152567815;
 //BA.debugLineNum = 152567815;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=152567816;
 //BA.debugLineNum = 152567816;BA.debugLine="xlbl = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=152567817;
 //BA.debugLineNum = 152567817;BA.debugLine="xlbl.Visible = True";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=152567818;
 //BA.debugLineNum = 152567818;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=152567819;
 //BA.debugLineNum = 152567819;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=152567820;
 //BA.debugLineNum = 152567820;BA.debugLine="ValueColor = xui.PaintOrColorToColor(Props.Get(\"V";
__ref._valuecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ValueColor")));
RDebugUtils.currentLine=152567821;
 //BA.debugLineNum = 152567821;BA.debugLine="mRollOver = Props.GetDefault(\"RollOver\", False)";
__ref._mrollover /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("RollOver"),(Object)(__c.False)));
RDebugUtils.currentLine=152567822;
 //BA.debugLineNum = 152567822;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=152567823;
 //BA.debugLineNum = 152567823;BA.debugLine="stroke = 8dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (8));
 }else 
{RDebugUtils.currentLine=152567824;
 //BA.debugLineNum = 152567824;BA.debugLine="Else If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=152567825;
 //BA.debugLineNum = 152567825;BA.debugLine="stroke = 6dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (6));
 }}
;
RDebugUtils.currentLine=152567827;
 //BA.debugLineNum = 152567827;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=152567828;
 //BA.debugLineNum = 152567828;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(ir.parsikhesab.pakhsh.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=153157632;
 //BA.debugLineNum = 153157632;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=153157633;
 //BA.debugLineNum = 153157633;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=153157634;
 //BA.debugLineNum = 153157634;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.roundslider __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=152502272;
 //BA.debugLineNum = 152502272;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=152502273;
 //BA.debugLineNum = 152502273;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=152502274;
 //BA.debugLineNum = 152502274;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=152502275;
 //BA.debugLineNum = 152502275;BA.debugLine="End Sub";
return "";
}
public String  _pnl_touch(ir.parsikhesab.pakhsh.roundslider __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_touch", true))
	 {return ((String) Debug.delegate(ba, "pnl_touch", new Object[] {_action,_x,_y}));}
int _dx = 0;
int _dy = 0;
float _dist = 0f;
int _angle = 0;
int _newvalue = 0;
RDebugUtils.currentLine=152961024;
 //BA.debugLineNum = 152961024;BA.debugLine="Private Sub pnl_Touch (Action As Int, X As Float,";
RDebugUtils.currentLine=152961025;
 //BA.debugLineNum = 152961025;BA.debugLine="If Action = pnl.TOUCH_ACTION_MOVE_NOTOUCH Then Re";
if (_action==__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=152961026;
 //BA.debugLineNum = 152961026;BA.debugLine="Dim dx As Int = x - CircleRect.CenterX";
_dx = (int) (_x-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX());
RDebugUtils.currentLine=152961027;
 //BA.debugLineNum = 152961027;BA.debugLine="Dim dy As Int = y - CircleRect.CenterY";
_dy = (int) (_y-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY());
RDebugUtils.currentLine=152961028;
 //BA.debugLineNum = 152961028;BA.debugLine="Dim dist As Float = Sqrt(Power(dx, 2) + Power(dy,";
_dist = (float) (__c.Sqrt(__c.Power(_dx,2)+__c.Power(_dy,2)));
RDebugUtils.currentLine=152961029;
 //BA.debugLineNum = 152961029;BA.debugLine="If dist > CircleRect.Width / 2 Then";
if (_dist>__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2) { 
RDebugUtils.currentLine=152961030;
 //BA.debugLineNum = 152961030;BA.debugLine="Dim angle As Int = Round(ATan2D(dy, dx))";
_angle = (int) (__c.Round(__c.ATan2D(_dy,_dx)));
RDebugUtils.currentLine=152961031;
 //BA.debugLineNum = 152961031;BA.debugLine="angle = angle + 90";
_angle = (int) (_angle+90);
RDebugUtils.currentLine=152961032;
 //BA.debugLineNum = 152961032;BA.debugLine="angle = (angle + 360) Mod 360";
_angle = (int) ((_angle+360)%360);
RDebugUtils.currentLine=152961033;
 //BA.debugLineNum = 152961033;BA.debugLine="Dim NewValue As Int = mMin + angle / 360 * (mMax";
_newvalue = (int) (__ref._mmin /*int*/ +_angle/(double)360*(__ref._mmax /*int*/ -__ref._mmin /*int*/ ));
RDebugUtils.currentLine=152961034;
 //BA.debugLineNum = 152961034;BA.debugLine="NewValue = Max(mMin, Min(mMax, NewValue))";
_newvalue = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_newvalue)));
RDebugUtils.currentLine=152961035;
 //BA.debugLineNum = 152961035;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=152961036;
 //BA.debugLineNum = 152961036;BA.debugLine="If mRollOver = False Then";
if (__ref._mrollover /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=152961037;
 //BA.debugLineNum = 152961037;BA.debugLine="If Abs(NewValue - mValue) > (mMax - mMin) / 2";
if (__c.Abs(_newvalue-__ref._mvalue /*int*/ )>(__ref._mmax /*int*/ -__ref._mmin /*int*/ )/(double)2) { 
RDebugUtils.currentLine=152961038;
 //BA.debugLineNum = 152961038;BA.debugLine="If mValue >= (mMax + mMin) / 2 Then";
if (__ref._mvalue /*int*/ >=(__ref._mmax /*int*/ +__ref._mmin /*int*/ )/(double)2) { 
RDebugUtils.currentLine=152961039;
 //BA.debugLineNum = 152961039;BA.debugLine="mValue = mMax";
__ref._mvalue /*int*/  = __ref._mmax /*int*/ ;
 }else {
RDebugUtils.currentLine=152961041;
 //BA.debugLineNum = 152961041;BA.debugLine="mValue = mMin";
__ref._mvalue /*int*/  = __ref._mmin /*int*/ ;
 };
 }else {
RDebugUtils.currentLine=152961044;
 //BA.debugLineNum = 152961044;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
 };
 }else {
RDebugUtils.currentLine=152961047;
 //BA.debugLineNum = 152961047;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
 };
RDebugUtils.currentLine=152961049;
 //BA.debugLineNum = 152961049;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Valu";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (1))) { 
RDebugUtils.currentLine=152961050;
 //BA.debugLineNum = 152961050;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ValueChange";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*int*/ ));
 };
 };
RDebugUtils.currentLine=152961053;
 //BA.debugLineNum = 152961053;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 };
RDebugUtils.currentLine=152961055;
 //BA.debugLineNum = 152961055;BA.debugLine="End Sub";
return "";
}
public String  _setcirclecolor(ir.parsikhesab.pakhsh.roundslider __ref,int _nonvaluecolor,int _innercolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setcirclecolor", true))
	 {return ((String) Debug.delegate(ba, "setcirclecolor", new Object[] {_nonvaluecolor,_innercolor}));}
RDebugUtils.currentLine=152698880;
 //BA.debugLineNum = 152698880;BA.debugLine="Public Sub SetCircleColor (NonValueColor As Int, I";
RDebugUtils.currentLine=152698881;
 //BA.debugLineNum = 152698881;BA.debugLine="mCircleNonValueColor = NonValueColor";
__ref._mcirclenonvaluecolor /*int*/  = _nonvaluecolor;
RDebugUtils.currentLine=152698882;
 //BA.debugLineNum = 152698882;BA.debugLine="mCircleFillColor = InnerColor";
__ref._mcirclefillcolor /*int*/  = _innercolor;
RDebugUtils.currentLine=152698883;
 //BA.debugLineNum = 152698883;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=152698884;
 //BA.debugLineNum = 152698884;BA.debugLine="End Sub";
return "";
}
public String  _setrange(ir.parsikhesab.pakhsh.roundslider __ref,int _newmin,int _newmax) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setrange", true))
	 {return ((String) Debug.delegate(ba, "setrange", new Object[] {_newmin,_newmax}));}
RDebugUtils.currentLine=153092096;
 //BA.debugLineNum = 153092096;BA.debugLine="Public Sub SetRange(NewMin As Int, NewMax As Int)";
RDebugUtils.currentLine=153092097;
 //BA.debugLineNum = 153092097;BA.debugLine="mMin = NewMin";
__ref._mmin /*int*/  = _newmin;
RDebugUtils.currentLine=153092098;
 //BA.debugLineNum = 153092098;BA.debugLine="mMax = NewMax";
__ref._mmax /*int*/  = _newmax;
RDebugUtils.currentLine=153092099;
 //BA.debugLineNum = 153092099;BA.debugLine="setValue(mValue)";
__ref._setvalue /*String*/ (null,__ref._mvalue /*int*/ );
RDebugUtils.currentLine=153092100;
 //BA.debugLineNum = 153092100;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(ir.parsikhesab.pakhsh.roundslider __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=153026560;
 //BA.debugLineNum = 153026560;BA.debugLine="Public Sub setValue (v As Int)";
RDebugUtils.currentLine=153026561;
 //BA.debugLineNum = 153026561;BA.debugLine="mValue = Max(mMin, Min(mMax, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_v)));
RDebugUtils.currentLine=153026562;
 //BA.debugLineNum = 153026562;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=153026563;
 //BA.debugLineNum = 153026563;BA.debugLine="End Sub";
return "";
}
public String  _setthumbcolor(ir.parsikhesab.pakhsh.roundslider __ref,int _bordercolor,int _innercolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setthumbcolor", true))
	 {return ((String) Debug.delegate(ba, "setthumbcolor", new Object[] {_bordercolor,_innercolor}));}
RDebugUtils.currentLine=152633344;
 //BA.debugLineNum = 152633344;BA.debugLine="Public Sub SetThumbColor(BorderColor As Int, Inner";
RDebugUtils.currentLine=152633345;
 //BA.debugLineNum = 152633345;BA.debugLine="mThumbBorderColor = BorderColor";
__ref._mthumbbordercolor /*int*/  = _bordercolor;
RDebugUtils.currentLine=152633346;
 //BA.debugLineNum = 152633346;BA.debugLine="mThumbInnerColor = InnerColor";
__ref._mthumbinnercolor /*int*/  = _innercolor;
RDebugUtils.currentLine=152633347;
 //BA.debugLineNum = 152633347;BA.debugLine="CreateThumb";
__ref._createthumb /*String*/ (null);
RDebugUtils.currentLine=152633348;
 //BA.debugLineNum = 152633348;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=152633349;
 //BA.debugLineNum = 152633349;BA.debugLine="End Sub";
return "";
}
}