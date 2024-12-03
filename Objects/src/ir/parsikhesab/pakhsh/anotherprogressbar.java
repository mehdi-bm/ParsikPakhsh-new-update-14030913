package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class anotherprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.anotherprogressbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.anotherprogressbar.class).invoke(this, new Object[] {null});
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
public b4a.example.bcpath._bcbrush _busybrush = null;
public int _backgroundcolor = 0;
public int _busyindex = 0;
public b4a.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _miv = null;
public b4a.example.bcpath._bcbrush _transparentbrush = null;
public boolean _vertical = false;
public float _currentvalue = 0f;
public int _emptycolor = 0;
public b4a.example.bcpath._bcbrush _emptybrush = null;
public int _mvalue = 0;
public Object _tag = null;
public float _valuechangepersecond = 0f;
public int _cornerradius = 0;
public int _brushoffsetdelta = 0;
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
public String  _base_resize(ir.parsikhesab.pakhsh.anotherprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=134742016;
 //BA.debugLineNum = 134742016;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=134742017;
 //BA.debugLineNum = 134742017;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
RDebugUtils.currentLine=134742018;
 //BA.debugLineNum = 134742018;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
RDebugUtils.currentLine=134742020;
 //BA.debugLineNum = 134742020;BA.debugLine="bc.Initialize(mBase.Width / xui.Scale, mBase.Heig";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()));
RDebugUtils.currentLine=134742021;
 //BA.debugLineNum = 134742021;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref._vertical /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()>__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=134742022;
 //BA.debugLineNum = 134742022;BA.debugLine="UpdateGraphics";
__ref._updategraphics /*String*/ (null);
RDebugUtils.currentLine=134742024;
 //BA.debugLineNum = 134742024;BA.debugLine="End Sub";
return "";
}
public String  _updategraphics(ir.parsikhesab.pakhsh.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "updategraphics", true))
	 {return ((String) Debug.delegate(ba, "updategraphics", null));}
int _width = 0;
b4a.example.bitmapcreator _template = null;
b4a.example.bitmapcreator._argbcolor _bcolor = null;
RDebugUtils.currentLine=135004160;
 //BA.debugLineNum = 135004160;BA.debugLine="Public Sub UpdateGraphics";
RDebugUtils.currentLine=135004161;
 //BA.debugLineNum = 135004161;BA.debugLine="EmptyBrush = bc.CreateBrushFromColor(EmptyColor)";
__ref._emptybrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._emptycolor /*int*/ );
RDebugUtils.currentLine=135004162;
 //BA.debugLineNum = 135004162;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=135004163;
 //BA.debugLineNum = 135004163;BA.debugLine="Dim Width As Int = 40";
_width = (int) (40);
RDebugUtils.currentLine=135004164;
 //BA.debugLineNum = 135004164;BA.debugLine="Dim Template As BitmapCreator";
_template = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=135004165;
 //BA.debugLineNum = 135004165;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=135004166;
 //BA.debugLineNum = 135004166;BA.debugLine="bc.ColorToARGB(BackgroundColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._backgroundcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=135004167;
 //BA.debugLineNum = 135004167;BA.debugLine="bcolor.r = Min(255, bcolor.r * 1.5)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*1.5));
RDebugUtils.currentLine=135004168;
 //BA.debugLineNum = 135004168;BA.debugLine="bcolor.g = Min(255, bcolor.g * 1.5)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*1.5));
RDebugUtils.currentLine=135004169;
 //BA.debugLineNum = 135004169;BA.debugLine="bcolor.b = Min(255, bcolor.b * 1.5)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*1.5));
RDebugUtils.currentLine=135004170;
 //BA.debugLineNum = 135004170;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=135004171;
 //BA.debugLineNum = 135004171;BA.debugLine="Template.Initialize(mBase.Width / xui.Scale, mBa";
_template._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()+_width));
 }else {
RDebugUtils.currentLine=135004173;
 //BA.debugLineNum = 135004173;BA.debugLine="Template.Initialize(mBase.Height / xui.Scale + W";
_template._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()+_width),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()));
 };
RDebugUtils.currentLine=135004176;
 //BA.debugLineNum = 135004176;BA.debugLine="Template.DrawRect(Template.TargetRect, Background";
_template._drawrect(_template._targetrect,__ref._backgroundcolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=135004177;
 //BA.debugLineNum = 135004177;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=135004178;
 //BA.debugLineNum = 135004178;BA.debugLine="Template.DrawLine(-Width / 2, Width / 2, Templat";
_template._drawline((float) (-_width/(double)2),(float) (_width/(double)2),(float) (_template._mwidth+_width/(double)2),(float) (_template._mheight-_width/(double)2),__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor),_width);
 }else {
RDebugUtils.currentLine=135004180;
 //BA.debugLineNum = 135004180;BA.debugLine="Template.DrawLine(Width / 2, -Width / 2, Templat";
_template._drawline((float) (_width/(double)2),(float) (-_width/(double)2),(float) (_template._mwidth-_width/(double)2),(float) (_template._mheight+_width/(double)2),__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor),_width);
 };
RDebugUtils.currentLine=135004182;
 //BA.debugLineNum = 135004182;BA.debugLine="BusyBrush = bc.CreateBrushFromBitmapCreator(Templ";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfrombitmapcreator(_template);
RDebugUtils.currentLine=135004183;
 //BA.debugLineNum = 135004183;BA.debugLine="If mValue = 100 Then";
if (__ref._mvalue /*int*/ ==100) { 
RDebugUtils.currentLine=135004184;
 //BA.debugLineNum = 135004184;BA.debugLine="bc.DrawRectRounded(bc.TargetRect, BackgroundColo";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._backgroundcolor /*int*/ ,__c.True,(int) (0),(int) (15));
 }else {
RDebugUtils.currentLine=135004186;
 //BA.debugLineNum = 135004186;BA.debugLine="bc.DrawRectRounded2(bc.TargetRect, EmptyBrush, T";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._emptybrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0),(int) (15));
 };
RDebugUtils.currentLine=135004188;
 //BA.debugLineNum = 135004188;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, mIV)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=135004189;
 //BA.debugLineNum = 135004189;BA.debugLine="setVisible(mBase.Visible)";
__ref._setvisible /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible());
RDebugUtils.currentLine=135004190;
 //BA.debugLineNum = 135004190;BA.debugLine="End Sub";
return "";
}
public void  _busyloop(ir.parsikhesab.pakhsh.anotherprogressbar __ref) throws Exception{
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "busyloop", true))
	 {Debug.delegate(ba, "busyloop", null); return;}
ResumableSub_BusyLoop rsub = new ResumableSub_BusyLoop(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_BusyLoop extends BA.ResumableSub {
public ResumableSub_BusyLoop(ir.parsikhesab.pakhsh.anotherprogressbar parent,ir.parsikhesab.pakhsh.anotherprogressbar __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.anotherprogressbar __ref;
ir.parsikhesab.pakhsh.anotherprogressbar parent;
int _myindex = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
long _lasttime = 0L;
anywheresoftware.b4a.objects.collections.List _tasks = null;
float _delta = 0f;
float _change = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="anotherprogressbar";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=134807553;
 //BA.debugLineNum = 134807553;BA.debugLine="Dim MyIndex As Int = BusyIndex";
_myindex = __ref._busyindex /*int*/ ;
RDebugUtils.currentLine=134807554;
 //BA.debugLineNum = 134807554;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=134807555;
 //BA.debugLineNum = 134807555;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight)";
_r.Initialize((float) (0),(float) (0),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mheight));
RDebugUtils.currentLine=134807556;
 //BA.debugLineNum = 134807556;BA.debugLine="Dim LastTime As Long = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=134807557;
 //BA.debugLineNum = 134807557;BA.debugLine="Do While MyIndex = BusyIndex";
if (true) break;

case 1:
//do while
this.state = 37;
while (_myindex==__ref._busyindex /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=134807558;
 //BA.debugLineNum = 134807558;BA.debugLine="If Vertical Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._vertical /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=134807559;
 //BA.debugLineNum = 134807559;BA.debugLine="BusyBrush.SrcOffsetY = BusyBrush.SrcOffsetY + B";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetY = (int) (__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetY+__ref._brushoffsetdelta /*int*/ );
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=134807561;
 //BA.debugLineNum = 134807561;BA.debugLine="BusyBrush.SrcOffsetX = BusyBrush.SrcOffsetX + B";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetX = (int) (__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetX+__ref._brushoffsetdelta /*int*/ );
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=134807563;
 //BA.debugLineNum = 134807563;BA.debugLine="Dim tasks As List";
_tasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=134807564;
 //BA.debugLineNum = 134807564;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=134807565;
 //BA.debugLineNum = 134807565;BA.debugLine="tasks.Add(bc.AsyncDrawRect(bc.TargetRect, Transp";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrect(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0))));
RDebugUtils.currentLine=134807566;
 //BA.debugLineNum = 134807566;BA.debugLine="Dim delta As Float = mValue - CurrentValue";
_delta = (float) (__ref._mvalue /*int*/ -__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=134807567;
 //BA.debugLineNum = 134807567;BA.debugLine="If Abs(delta) <= 1 Then";
if (true) break;

case 10:
//if
this.state = 21;
if (parent.__c.Abs(_delta)<=1) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 21;
RDebugUtils.currentLine=134807568;
 //BA.debugLineNum = 134807568;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=134807570;
 //BA.debugLineNum = 134807570;BA.debugLine="Dim change As Float = (DateTime.Now - LastTime)";
_change = (float) ((parent.__c.DateTime.getNow()-_lasttime)/(double)1000*__ref._valuechangepersecond /*float*/ );
RDebugUtils.currentLine=134807571;
 //BA.debugLineNum = 134807571;BA.debugLine="If delta > 0 Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_delta>0) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=134807572;
 //BA.debugLineNum = 134807572;BA.debugLine="CurrentValue = CurrentValue + Min(change, mVal";
__ref._currentvalue /*float*/  = (float) (__ref._currentvalue /*float*/ +parent.__c.Min(_change,__ref._mvalue /*int*/ -__ref._currentvalue /*float*/ ));
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=134807574;
 //BA.debugLineNum = 134807574;BA.debugLine="CurrentValue = CurrentValue - Min(change, Curr";
__ref._currentvalue /*float*/  = (float) (__ref._currentvalue /*float*/ -parent.__c.Min(_change,__ref._currentvalue /*float*/ -__ref._mvalue /*int*/ ));
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=134807577;
 //BA.debugLineNum = 134807577;BA.debugLine="LastTime = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=134807578;
 //BA.debugLineNum = 134807578;BA.debugLine="If CurrentValue < 100 Then";
if (true) break;

case 22:
//if
this.state = 25;
if (__ref._currentvalue /*float*/ <100) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=134807579;
 //BA.debugLineNum = 134807579;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(bc.TargetRect";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrectrounded(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._emptybrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0),__ref._cornerradius /*int*/ )));
 if (true) break;
;
RDebugUtils.currentLine=134807581;
 //BA.debugLineNum = 134807581;BA.debugLine="If Vertical Then";

case 25:
//if
this.state = 30;
if (__ref._vertical /*boolean*/ ) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=134807582;
 //BA.debugLineNum = 134807582;BA.debugLine="r.Bottom = Round(CurrentValue / 100 * bc.mHeigh";
_r.setBottom((float) (parent.__c.Round(__ref._currentvalue /*float*/ /(double)100*__ref._bc /*b4a.example.bitmapcreator*/ ._mheight)));
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=134807584;
 //BA.debugLineNum = 134807584;BA.debugLine="r.Right = Round(CurrentValue / 100 * bc.mWidth)";
_r.setRight((float) (parent.__c.Round(__ref._currentvalue /*float*/ /(double)100*__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth)));
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=134807587;
 //BA.debugLineNum = 134807587;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(r, BusyBrush,";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrectrounded(_r,__ref._busybrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0),__ref._cornerradius /*int*/ )));
RDebugUtils.currentLine=134807588;
 //BA.debugLineNum = 134807588;BA.debugLine="bc.DrawBitmapCreatorsAsync(Me, \"BC\", tasks)";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawbitmapcreatorsasync(parent,"BC",_tasks);
RDebugUtils.currentLine=134807589;
 //BA.debugLineNum = 134807589;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
parent.__c.WaitFor("bc_bitmapready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "anotherprogressbar", "busyloop"), null);
this.state = 38;
return;
case 38:
//C
this.state = 31;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
RDebugUtils.currentLine=134807590;
 //BA.debugLineNum = 134807590;BA.debugLine="If xui.IsB4J Then bmp = bc.Bitmap";
if (true) break;

case 31:
//if
this.state = 36;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_bmp = __ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap();
if (true) break;

case 36:
//C
this.state = 1;
;
RDebugUtils.currentLine=134807591;
 //BA.debugLineNum = 134807591;BA.debugLine="bc.SetBitmapToImageView(bmp, mIV)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(_bmp,__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=134807592;
 //BA.debugLineNum = 134807592;BA.debugLine="Sleep(30)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "anotherprogressbar", "busyloop"),(int) (30));
this.state = 39;
return;
case 39:
//C
this.state = 1;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=134807594;
 //BA.debugLineNum = 134807594;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(ir.parsikhesab.pakhsh.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
RDebugUtils.currentLine=134545408;
 //BA.debugLineNum = 134545408;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=134545409;
 //BA.debugLineNum = 134545409;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=134545410;
 //BA.debugLineNum = 134545410;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=134545411;
 //BA.debugLineNum = 134545411;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=134545412;
 //BA.debugLineNum = 134545412;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=134545413;
 //BA.debugLineNum = 134545413;BA.debugLine="Private BusyBrush As BCBrush";
_busybrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=134545414;
 //BA.debugLineNum = 134545414;BA.debugLine="Private BackgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=134545415;
 //BA.debugLineNum = 134545415;BA.debugLine="Private BusyIndex As Int";
_busyindex = 0;
RDebugUtils.currentLine=134545416;
 //BA.debugLineNum = 134545416;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=134545417;
 //BA.debugLineNum = 134545417;BA.debugLine="Private mIV As B4XView";
_miv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=134545418;
 //BA.debugLineNum = 134545418;BA.debugLine="Private TransparentBrush As BCBrush";
_transparentbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=134545419;
 //BA.debugLineNum = 134545419;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=134545420;
 //BA.debugLineNum = 134545420;BA.debugLine="Private CurrentValue As Float";
_currentvalue = 0f;
RDebugUtils.currentLine=134545421;
 //BA.debugLineNum = 134545421;BA.debugLine="Public EmptyColor As Int = xui.Color_White";
_emptycolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=134545422;
 //BA.debugLineNum = 134545422;BA.debugLine="Private EmptyBrush As BCBrush";
_emptybrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=134545423;
 //BA.debugLineNum = 134545423;BA.debugLine="Private mValue As Int";
_mvalue = 0;
RDebugUtils.currentLine=134545424;
 //BA.debugLineNum = 134545424;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=134545425;
 //BA.debugLineNum = 134545425;BA.debugLine="Public ValueChangePerSecond As Float = 60";
_valuechangepersecond = (float) (60);
RDebugUtils.currentLine=134545426;
 //BA.debugLineNum = 134545426;BA.debugLine="Public CornerRadius As Int";
_cornerradius = 0;
RDebugUtils.currentLine=134545427;
 //BA.debugLineNum = 134545427;BA.debugLine="Public BrushOffsetDelta As Int = 3";
_brushoffsetdelta = (int) (3);
RDebugUtils.currentLine=134545428;
 //BA.debugLineNum = 134545428;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(ir.parsikhesab.pakhsh.anotherprogressbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=134676480;
 //BA.debugLineNum = 134676480;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=134676481;
 //BA.debugLineNum = 134676481;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=134676482;
 //BA.debugLineNum = 134676482;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=134676482;
 //BA.debugLineNum = 134676482;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=134676483;
 //BA.debugLineNum = 134676483;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=134676484;
 //BA.debugLineNum = 134676484;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=134676485;
 //BA.debugLineNum = 134676485;BA.debugLine="mIV = iv";
__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=134676486;
 //BA.debugLineNum = 134676486;BA.debugLine="mIV.Color = xui.Color_Transparent";
__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=134676487;
 //BA.debugLineNum = 134676487;BA.debugLine="setValue(Props.GetDefault(\"Value\", 100))";
__ref._setvalue /*String*/ (null,(int)(BA.ObjectToNumber(_props.GetDefault((Object)("Value"),(Object)(100)))));
RDebugUtils.currentLine=134676488;
 //BA.debugLineNum = 134676488;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
RDebugUtils.currentLine=134676489;
 //BA.debugLineNum = 134676489;BA.debugLine="mBase.AddView(mIV, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=134676490;
 //BA.debugLineNum = 134676490;BA.debugLine="mBase.AddView(lbl, 0, 0, mBase.Width, mBase.Heigh";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_lbl.getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=134676491;
 //BA.debugLineNum = 134676491;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=134676492;
 //BA.debugLineNum = 134676492;BA.debugLine="BackgroundColor = xui.PaintOrColorToColor(Props.G";
__ref._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ProgressColor")));
RDebugUtils.currentLine=134676493;
 //BA.debugLineNum = 134676493;BA.debugLine="CornerRadius = Props.GetDefault(\"CornerRadius\", 1";
__ref._cornerradius /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornerRadius"),(Object)(15))));
RDebugUtils.currentLine=134676494;
 //BA.debugLineNum = 134676494;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=134676495;
 //BA.debugLineNum = 134676495;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(ir.parsikhesab.pakhsh.anotherprogressbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=135266304;
 //BA.debugLineNum = 135266304;BA.debugLine="Public Sub setValue (v As Int)";
RDebugUtils.currentLine=135266305;
 //BA.debugLineNum = 135266305;BA.debugLine="mValue = Max(0, Min(100, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(0,__c.Min(100,_v)));
RDebugUtils.currentLine=135266306;
 //BA.debugLineNum = 135266306;BA.debugLine="End Sub";
return "";
}
public int  _getprogresscolor(ir.parsikhesab.pakhsh.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getprogresscolor", true))
	 {return ((Integer) Debug.delegate(ba, "getprogresscolor", null));}
RDebugUtils.currentLine=134873088;
 //BA.debugLineNum = 134873088;BA.debugLine="Public Sub getProgressColor As Int";
RDebugUtils.currentLine=134873089;
 //BA.debugLineNum = 134873089;BA.debugLine="Return BackgroundColor";
if (true) return __ref._backgroundcolor /*int*/ ;
RDebugUtils.currentLine=134873090;
 //BA.debugLineNum = 134873090;BA.debugLine="End Sub";
return 0;
}
public int  _getvalue(ir.parsikhesab.pakhsh.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=135200768;
 //BA.debugLineNum = 135200768;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=135200769;
 //BA.debugLineNum = 135200769;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=135200770;
 //BA.debugLineNum = 135200770;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible(ir.parsikhesab.pakhsh.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=135135232;
 //BA.debugLineNum = 135135232;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=135135233;
 //BA.debugLineNum = 135135233;BA.debugLine="Return mBase.Visible";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible();
RDebugUtils.currentLine=135135234;
 //BA.debugLineNum = 135135234;BA.debugLine="End Sub";
return false;
}
public String  _initialize(ir.parsikhesab.pakhsh.anotherprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=134610944;
 //BA.debugLineNum = 134610944;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=134610945;
 //BA.debugLineNum = 134610945;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=134610946;
 //BA.debugLineNum = 134610946;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=134610947;
 //BA.debugLineNum = 134610947;BA.debugLine="End Sub";
return "";
}
public String  _setprogresscolor(ir.parsikhesab.pakhsh.anotherprogressbar __ref,int _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setprogresscolor", true))
	 {return ((String) Debug.delegate(ba, "setprogresscolor", new Object[] {_c}));}
RDebugUtils.currentLine=134938624;
 //BA.debugLineNum = 134938624;BA.debugLine="Public Sub setProgressColor (c As Int)";
RDebugUtils.currentLine=134938625;
 //BA.debugLineNum = 134938625;BA.debugLine="BackgroundColor = c";
__ref._backgroundcolor /*int*/  = _c;
RDebugUtils.currentLine=134938626;
 //BA.debugLineNum = 134938626;BA.debugLine="UpdateGraphics";
__ref._updategraphics /*String*/ (null);
RDebugUtils.currentLine=134938627;
 //BA.debugLineNum = 134938627;BA.debugLine="End Sub";
return "";
}
public String  _setvaluenoanimation(ir.parsikhesab.pakhsh.anotherprogressbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvaluenoanimation", true))
	 {return ((String) Debug.delegate(ba, "setvaluenoanimation", new Object[] {_v}));}
RDebugUtils.currentLine=135331840;
 //BA.debugLineNum = 135331840;BA.debugLine="Public Sub SetValueNoAnimation (v As Int)";
RDebugUtils.currentLine=135331841;
 //BA.debugLineNum = 135331841;BA.debugLine="setValue(v)";
__ref._setvalue /*String*/ (null,_v);
RDebugUtils.currentLine=135331842;
 //BA.debugLineNum = 135331842;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
RDebugUtils.currentLine=135331843;
 //BA.debugLineNum = 135331843;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(ir.parsikhesab.pakhsh.anotherprogressbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=135069696;
 //BA.debugLineNum = 135069696;BA.debugLine="Public Sub setVisible(b As Boolean)";
RDebugUtils.currentLine=135069697;
 //BA.debugLineNum = 135069697;BA.debugLine="BusyIndex = BusyIndex + 1";
__ref._busyindex /*int*/  = (int) (__ref._busyindex /*int*/ +1);
RDebugUtils.currentLine=135069698;
 //BA.debugLineNum = 135069698;BA.debugLine="If b Then";
if (_b) { 
RDebugUtils.currentLine=135069699;
 //BA.debugLineNum = 135069699;BA.debugLine="BusyLoop";
__ref._busyloop /*void*/ (null);
 };
RDebugUtils.currentLine=135069701;
 //BA.debugLineNum = 135069701;BA.debugLine="mBase.Visible = b";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(_b);
RDebugUtils.currentLine=135069702;
 //BA.debugLineNum = 135069702;BA.debugLine="End Sub";
return "";
}
}