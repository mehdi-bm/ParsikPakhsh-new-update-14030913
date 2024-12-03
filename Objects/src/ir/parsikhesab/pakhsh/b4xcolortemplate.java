package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcolortemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.b4xcolortemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.b4xcolortemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _colorpickerpart{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XCanvas cvs;
public anywheresoftware.b4a.objects.B4XViewWrapper pnl;
public anywheresoftware.b4a.objects.B4XViewWrapper iv;
public anywheresoftware.b4a.objects.B4XCanvas checkersCanvas;
public boolean DrawCheckers;
public void Initialize() {
IsInitialized = true;
cvs = new anywheresoftware.b4a.objects.B4XCanvas();
pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
checkersCanvas = new anywheresoftware.b4a.objects.B4XCanvas();
DrawCheckers = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _selectedalpha = 0;
public b4a.example.bitmapcreator _bccolors = null;
public float _selectedh = 0f;
public float _selecteds = 0f;
public float _selectedv = 0f;
public float _devicescale = 0f;
public float _colorscale = 0f;
public b4a.example.bitmapcreator _tempbc = null;
public int _dont_change = 0;
public ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart _huebar = null;
public ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart _colorpicker = null;
public ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart _alphabar = null;
public int _borderscolor = 0;
public ir.parsikhesab.pakhsh.b4xdialog _xdialog = null;
public Object[] _initialcolor = null;
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
public String  _alpha_touch(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "alpha_touch", true))
	 {return ((String) Debug.delegate(ba, "alpha_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=137560064;
 //BA.debugLineNum = 137560064;BA.debugLine="Private Sub Alpha_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=137560065;
 //BA.debugLineNum = 137560065;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=137560066;
 //BA.debugLineNum = 137560066;BA.debugLine="AlphaBarSelectedChange(x)";
__ref._alphabarselectedchange /*String*/ (null,_x);
RDebugUtils.currentLine=137560067;
 //BA.debugLineNum = 137560067;BA.debugLine="End Sub";
return "";
}
public String  _alphabarselectedchange(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,float _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "alphabarselectedchange", true))
	 {return ((String) Debug.delegate(ba, "alphabarselectedchange", new Object[] {_x}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=136642560;
 //BA.debugLineNum = 136642560;BA.debugLine="Private Sub AlphaBarSelectedChange(x As Float)";
RDebugUtils.currentLine=136642561;
 //BA.debugLineNum = 136642561;BA.debugLine="SelectedAlpha = 255 * Max(0, Min(1, x / AlphaBar.";
__ref._selectedalpha /*int*/  = (int) (255*__c.Max(0,__c.Min(1,_x/(double)__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
RDebugUtils.currentLine=136642562;
 //BA.debugLineNum = 136642562;BA.debugLine="x = SelectedAlpha / 255 * AlphaBar.pnl.Width";
_x = (float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=136642563;
 //BA.debugLineNum = 136642563;BA.debugLine="AlphaBar.cvs.ClearRect(AlphaBar.cvs.TargetRect)";
__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=136642564;
 //BA.debugLineNum = 136642564;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=136642565;
 //BA.debugLineNum = 136642565;BA.debugLine="r.Initialize(x - 3dip, 1dip, x + 3dip, AlphaBar.c";
_r.Initialize((float) (_x-__c.DipToCurrent((int) (3))),(float) (__c.DipToCurrent((int) (1))),(float) (_x+__c.DipToCurrent((int) (3))),(float) (__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=136642566;
 //BA.debugLineNum = 136642566;BA.debugLine="AlphaBar.cvs.DrawRect(r, xui.Color_Black, True, 2";
__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,__c.True,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=136642567;
 //BA.debugLineNum = 136642567;BA.debugLine="AlphaBar.cvs.Invalidate";
__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=136642568;
 //BA.debugLineNum = 136642568;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=136642569;
 //BA.debugLineNum = 136642569;BA.debugLine="End Sub";
return "";
}
public String  _update(ir.parsikhesab.pakhsh.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=136708096;
 //BA.debugLineNum = 136708096;BA.debugLine="Private Sub Update";
RDebugUtils.currentLine=136708097;
 //BA.debugLineNum = 136708097;BA.debugLine="DrawColors";
__ref._drawcolors /*String*/ (null);
RDebugUtils.currentLine=136708098;
 //BA.debugLineNum = 136708098;BA.debugLine="HandleSelectedColorChanged(DONT_CHANGE, DONT_CHAN";
__ref._handleselectedcolorchanged /*String*/ (null,__ref._dont_change /*int*/ ,__ref._dont_change /*int*/ );
RDebugUtils.currentLine=136708099;
 //BA.debugLineNum = 136708099;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _r = 0;
int _w = 0;
ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart _cpp = null;
int _i = 0;
RDebugUtils.currentLine=136249344;
 //BA.debugLineNum = 136249344;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=136249346;
 //BA.debugLineNum = 136249346;BA.debugLine="ColorScale = Max(1, Max(Width, Height) / 100 / De";
__ref._colorscale /*float*/  = (float) (__c.Max(1,__c.Max(_width,_height)/(double)100/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=136249347;
 //BA.debugLineNum = 136249347;BA.debugLine="HueBar.pnl.SetLayoutAnimated(0, 1dip, 1dip, 30dip";
__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (30)),(int) (_height-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=136249348;
 //BA.debugLineNum = 136249348;BA.debugLine="Dim r As Int = HueBar.pnl.Width + HueBar.pnl.Left";
_r = (int) (__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=136249349;
 //BA.debugLineNum = 136249349;BA.debugLine="Dim w As Int = Width - r - 1dip";
_w = (int) (_width-_r-__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=136249350;
 //BA.debugLineNum = 136249350;BA.debugLine="If xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=136249351;
 //BA.debugLineNum = 136249351;BA.debugLine="r = r - 1";
_r = (int) (_r-1);
RDebugUtils.currentLine=136249352;
 //BA.debugLineNum = 136249352;BA.debugLine="w = w + 1";
_w = (int) (_w+1);
 };
RDebugUtils.currentLine=136249354;
 //BA.debugLineNum = 136249354;BA.debugLine="AlphaBar.pnl.SetLayoutAnimated(0, r, Height - 31d";
__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,(int) (_height-__c.DipToCurrent((int) (31))),_w,__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=136249355;
 //BA.debugLineNum = 136249355;BA.debugLine="ColorPicker.pnl.SetLayoutAnimated(0, r, 1dip, w,";
__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,__c.DipToCurrent((int) (1)),_w,(int) (_height-__c.DipToCurrent((int) (3))-__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=136249356;
 //BA.debugLineNum = 136249356;BA.debugLine="bcColors.Initialize(ColorPicker.pnl.Width / Color";
__ref._bccolors /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._colorscale /*float*/ ),(int) (__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._colorscale /*float*/ ));
RDebugUtils.currentLine=136249357;
 //BA.debugLineNum = 136249357;BA.debugLine="For Each cpp As ColorPickerPart In Array(HueBar,";
{
final Object[] group12 = new Object[]{(Object)(__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ ),(Object)(__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ ),(Object)(__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ )};
final int groupLen12 = group12.length
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_cpp = (ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart)(group12[index12]);
RDebugUtils.currentLine=136249358;
 //BA.debugLineNum = 136249358;BA.debugLine="For i = 0 To cpp.pnl.NumberOfViews - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=136249359;
 //BA.debugLineNum = 136249359;BA.debugLine="cpp.pnl.GetView(i).SetLayoutAnimated(0, 0, 0, c";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }
};
RDebugUtils.currentLine=136249361;
 //BA.debugLineNum = 136249361;BA.debugLine="cpp.cvs.Resize(cpp.pnl.Width, cpp.pnl.Height)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=136249362;
 //BA.debugLineNum = 136249362;BA.debugLine="If cpp.DrawCheckers Then";
if (_cpp.DrawCheckers /*boolean*/ ) { 
RDebugUtils.currentLine=136249363;
 //BA.debugLineNum = 136249363;BA.debugLine="DrawCheckers(cpp)";
__ref._drawcheckers /*String*/ (null,_cpp);
 };
 }
};
RDebugUtils.currentLine=136249366;
 //BA.debugLineNum = 136249366;BA.debugLine="DrawHueBar";
__ref._drawhuebar /*String*/ (null);
RDebugUtils.currentLine=136249367;
 //BA.debugLineNum = 136249367;BA.debugLine="DrawAlphaBar";
__ref._drawalphabar /*String*/ (null);
RDebugUtils.currentLine=136249368;
 //BA.debugLineNum = 136249368;BA.debugLine="HueBarSelectedChanged (selectedH / 360 * HueBar.p";
__ref._huebarselectedchanged /*String*/ (null,(float) (__ref._selectedh /*float*/ /(double)360*__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=136249369;
 //BA.debugLineNum = 136249369;BA.debugLine="AlphaBarSelectedChange (SelectedAlpha / 255 * Alp";
__ref._alphabarselectedchange /*String*/ (null,(float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=136249370;
 //BA.debugLineNum = 136249370;BA.debugLine="End Sub";
return "";
}
public String  _drawcheckers(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart _cpp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawcheckers", true))
	 {return ((String) Debug.delegate(ba, "drawcheckers", new Object[] {_cpp}));}
int _size = 0;
int[] _clrs = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _x = 0;
int _xx = 0;
int _y = 0;
RDebugUtils.currentLine=136314880;
 //BA.debugLineNum = 136314880;BA.debugLine="Private Sub DrawCheckers (cpp As ColorPickerPart)";
RDebugUtils.currentLine=136314881;
 //BA.debugLineNum = 136314881;BA.debugLine="cpp.checkersCanvas.Resize(cpp.pnl.Width, cpp.pnl.";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=136314882;
 //BA.debugLineNum = 136314882;BA.debugLine="cpp.checkersCanvas.ClearRect(cpp.checkersCanvas.T";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=136314883;
 //BA.debugLineNum = 136314883;BA.debugLine="Dim size As Int = 10dip";
_size = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=136314884;
 //BA.debugLineNum = 136314884;BA.debugLine="Dim clrs() As Int = Array As Int(0xFFC0C0C0, 0xFF";
_clrs = new int[]{((int)0xffc0c0c0),((int)0xff757575)};
RDebugUtils.currentLine=136314885;
 //BA.debugLineNum = 136314885;BA.debugLine="Dim clr As Int = 0";
_clr = (int) (0);
RDebugUtils.currentLine=136314886;
 //BA.debugLineNum = 136314886;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=136314887;
 //BA.debugLineNum = 136314887;BA.debugLine="For x = 0 To cpp.checkersCanvas.TargetRect.Right";
{
final int step7 = _size;
final int limit7 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight()-__c.DipToCurrent((int) (1)));
_x = (int) (0) ;
for (;(step7 > 0 && _x <= limit7) || (step7 < 0 && _x >= limit7) ;_x = ((int)(0 + _x + step7))  ) {
RDebugUtils.currentLine=136314888;
 //BA.debugLineNum = 136314888;BA.debugLine="Dim xx As Int = x / size";
_xx = (int) (_x/(double)_size);
RDebugUtils.currentLine=136314889;
 //BA.debugLineNum = 136314889;BA.debugLine="clr = xx Mod 2";
_clr = (int) (_xx%2);
RDebugUtils.currentLine=136314890;
 //BA.debugLineNum = 136314890;BA.debugLine="For y = 0 To cpp.checkersCanvas.TargetRect.Botto";
{
final int step10 = _size;
final int limit10 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1)));
_y = (int) (0) ;
for (;(step10 > 0 && _y <= limit10) || (step10 < 0 && _y >= limit10) ;_y = ((int)(0 + _y + step10))  ) {
RDebugUtils.currentLine=136314891;
 //BA.debugLineNum = 136314891;BA.debugLine="clr = (clr + 1) Mod 2";
_clr = (int) ((_clr+1)%2);
RDebugUtils.currentLine=136314892;
 //BA.debugLineNum = 136314892;BA.debugLine="r.Initialize(x, y, x + size, y + size)";
_r.Initialize((float) (_x),(float) (_y),(float) (_x+_size),(float) (_y+_size));
RDebugUtils.currentLine=136314893;
 //BA.debugLineNum = 136314893;BA.debugLine="cpp.checkersCanvas.DrawRect(r, clrs(clr), True,";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,_clrs[_clr],__c.True,(float) (0));
 }
};
 }
};
RDebugUtils.currentLine=136314896;
 //BA.debugLineNum = 136314896;BA.debugLine="cpp.checkersCanvas.Invalidate";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=136314897;
 //BA.debugLineNum = 136314897;BA.debugLine="End Sub";
return "";
}
public String  _drawhuebar(ir.parsikhesab.pakhsh.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawhuebar", true))
	 {return ((String) Debug.delegate(ba, "drawhuebar", null));}
b4a.example.bitmapcreator _bchue = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=136380416;
 //BA.debugLineNum = 136380416;BA.debugLine="Private Sub DrawHueBar";
RDebugUtils.currentLine=136380417;
 //BA.debugLineNum = 136380417;BA.debugLine="Dim bcHue As BitmapCreator";
_bchue = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=136380418;
 //BA.debugLineNum = 136380418;BA.debugLine="bcHue.Initialize(HueBar.pnl.Width / DeviceScale,";
_bchue._initialize(ba,(int) (__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._devicescale /*float*/ ),(int) (__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=136380419;
 //BA.debugLineNum = 136380419;BA.debugLine="For y = 0 To bcHue.mHeight - 1";
{
final int step3 = 1;
final int limit3 = (int) (_bchue._mheight-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=136380420;
 //BA.debugLineNum = 136380420;BA.debugLine="For x = 0 To bcHue.mWidth - 1";
{
final int step4 = 1;
final int limit4 = (int) (_bchue._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=136380421;
 //BA.debugLineNum = 136380421;BA.debugLine="bcHue.SetHSV(x, y, 255, 360 / bcHue.mHeight * y";
_bchue._sethsv(_x,_y,(int) (255),(int) (360/(double)_bchue._mheight*_y),(float) (1),(float) (1));
 }
};
 }
};
RDebugUtils.currentLine=136380424;
 //BA.debugLineNum = 136380424;BA.debugLine="HueBar.iv.SetBitmap(bcHue.Bitmap)";
__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bchue._getbitmap().getObject()));
RDebugUtils.currentLine=136380425;
 //BA.debugLineNum = 136380425;BA.debugLine="End Sub";
return "";
}
public String  _drawalphabar(ir.parsikhesab.pakhsh.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawalphabar", true))
	 {return ((String) Debug.delegate(ba, "drawalphabar", null));}
b4a.example.bitmapcreator _bc = null;
b4a.example.bitmapcreator._argbcolor _argb = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=136445952;
 //BA.debugLineNum = 136445952;BA.debugLine="Private Sub DrawAlphaBar";
RDebugUtils.currentLine=136445953;
 //BA.debugLineNum = 136445953;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=136445954;
 //BA.debugLineNum = 136445954;BA.debugLine="bc.Initialize(AlphaBar.pnl.Width / DeviceScale, A";
_bc._initialize(ba,(int) (__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._devicescale /*float*/ ),(int) (__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=136445955;
 //BA.debugLineNum = 136445955;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=136445956;
 //BA.debugLineNum = 136445956;BA.debugLine="argb.r = 0xcc";
_argb.r = ((int)0xcc);
RDebugUtils.currentLine=136445957;
 //BA.debugLineNum = 136445957;BA.debugLine="argb.g = 0xcc";
_argb.g = ((int)0xcc);
RDebugUtils.currentLine=136445958;
 //BA.debugLineNum = 136445958;BA.debugLine="argb.b = 0xcc";
_argb.b = ((int)0xcc);
RDebugUtils.currentLine=136445960;
 //BA.debugLineNum = 136445960;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step7 = 1;
final int limit7 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit7 ;_y = _y + step7 ) {
RDebugUtils.currentLine=136445961;
 //BA.debugLineNum = 136445961;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step8 = 1;
final int limit8 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
RDebugUtils.currentLine=136445962;
 //BA.debugLineNum = 136445962;BA.debugLine="argb.a = x / bc.mWidth * 255";
_argb.a = (int) (_x/(double)_bc._mwidth*255);
RDebugUtils.currentLine=136445963;
 //BA.debugLineNum = 136445963;BA.debugLine="bc.SetARGB(x, y, argb)";
_bc._setargb(_x,_y,_argb);
 }
};
 }
};
RDebugUtils.currentLine=136445966;
 //BA.debugLineNum = 136445966;BA.debugLine="AlphaBar.iv.SetBitmap(bc.Bitmap)";
__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bc._getbitmap().getObject()));
RDebugUtils.currentLine=136445967;
 //BA.debugLineNum = 136445967;BA.debugLine="End Sub";
return "";
}
public String  _huebarselectedchanged(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "huebarselectedchanged", true))
	 {return ((String) Debug.delegate(ba, "huebarselectedchanged", new Object[] {_y}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=136577024;
 //BA.debugLineNum = 136577024;BA.debugLine="Private Sub HueBarSelectedChanged (y As Float)";
RDebugUtils.currentLine=136577025;
 //BA.debugLineNum = 136577025;BA.debugLine="selectedH = Max(0, Min(360, 360 * y / HueBar.pnl.";
__ref._selectedh /*float*/  = (float) (__c.Max(0,__c.Min(360,360*_y/(double)__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
RDebugUtils.currentLine=136577026;
 //BA.debugLineNum = 136577026;BA.debugLine="y = selectedH * HueBar.pnl.Height / 360";
_y = (float) (__ref._selectedh /*float*/ *__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)360);
RDebugUtils.currentLine=136577027;
 //BA.debugLineNum = 136577027;BA.debugLine="HueBar.cvs.ClearRect(HueBar.cvs.TargetRect)";
__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=136577028;
 //BA.debugLineNum = 136577028;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=136577029;
 //BA.debugLineNum = 136577029;BA.debugLine="r.Initialize(0, y - 3dip, HueBar.cvs.TargetRect.R";
_r.Initialize((float) (0),(float) (_y-__c.DipToCurrent((int) (3))),__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight(),(float) (_y+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=136577030;
 //BA.debugLineNum = 136577030;BA.debugLine="HueBar.cvs.DrawRect(r, xui.Color_White, False, 2d";
__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=136577031;
 //BA.debugLineNum = 136577031;BA.debugLine="HueBar.cvs.Invalidate";
__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=136577032;
 //BA.debugLineNum = 136577032;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=136577033;
 //BA.debugLineNum = 136577033;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
RDebugUtils.currentLine=136052736;
 //BA.debugLineNum = 136052736;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=136052737;
 //BA.debugLineNum = 136052737;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=136052738;
 //BA.debugLineNum = 136052738;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=136052739;
 //BA.debugLineNum = 136052739;BA.debugLine="Private SelectedAlpha As Int = 255";
_selectedalpha = (int) (255);
RDebugUtils.currentLine=136052740;
 //BA.debugLineNum = 136052740;BA.debugLine="Private bcColors As BitmapCreator";
_bccolors = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=136052741;
 //BA.debugLineNum = 136052741;BA.debugLine="Private selectedH = 60, selectedS = 0.5, selected";
_selectedh = (float) (60);
_selecteds = (float) (0.5);
_selectedv = (float) (0.5);
RDebugUtils.currentLine=136052742;
 //BA.debugLineNum = 136052742;BA.debugLine="Private DeviceScale, ColorScale As Float";
_devicescale = 0f;
_colorscale = 0f;
RDebugUtils.currentLine=136052743;
 //BA.debugLineNum = 136052743;BA.debugLine="Private tempBC As BitmapCreator";
_tempbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=136052744;
 //BA.debugLineNum = 136052744;BA.debugLine="Private const DONT_CHANGE As Int = -999999999";
_dont_change = (int) (-999999999);
RDebugUtils.currentLine=136052745;
 //BA.debugLineNum = 136052745;BA.debugLine="Type ColorPickerPart (cvs As B4XCanvas, pnl As B4";
;
RDebugUtils.currentLine=136052746;
 //BA.debugLineNum = 136052746;BA.debugLine="Private HueBar, ColorPicker, AlphaBar As ColorPic";
_huebar = new ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart();
_colorpicker = new ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart();
_alphabar = new ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart();
RDebugUtils.currentLine=136052747;
 //BA.debugLineNum = 136052747;BA.debugLine="Private BordersColor As Int";
_borderscolor = 0;
RDebugUtils.currentLine=136052748;
 //BA.debugLineNum = 136052748;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new ir.parsikhesab.pakhsh.b4xdialog();
RDebugUtils.currentLine=136052749;
 //BA.debugLineNum = 136052749;BA.debugLine="Private InitialColor() As Object";
_initialcolor = new Object[(int) (0)];
{
int d0 = _initialcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_initialcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=136052750;
 //BA.debugLineNum = 136052750;BA.debugLine="End Sub";
return "";
}
public String  _colors_touch(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "colors_touch", true))
	 {return ((String) Debug.delegate(ba, "colors_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=137428992;
 //BA.debugLineNum = 137428992;BA.debugLine="Private Sub Colors_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=137428993;
 //BA.debugLineNum = 137428993;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=137428994;
 //BA.debugLineNum = 137428994;BA.debugLine="HandleSelectedColorChanged(X, Y)";
__ref._handleselectedcolorchanged /*String*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=137428995;
 //BA.debugLineNum = 137428995;BA.debugLine="End Sub";
return "";
}
public String  _handleselectedcolorchanged(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "handleselectedcolorchanged", true))
	 {return ((String) Debug.delegate(ba, "handleselectedcolorchanged", new Object[] {_x,_y}));}
RDebugUtils.currentLine=136773632;
 //BA.debugLineNum = 136773632;BA.debugLine="Private Sub HandleSelectedColorChanged (x As Int,";
RDebugUtils.currentLine=136773633;
 //BA.debugLineNum = 136773633;BA.debugLine="If x <> DONT_CHANGE Then";
if (_x!=__ref._dont_change /*int*/ ) { 
RDebugUtils.currentLine=136773634;
 //BA.debugLineNum = 136773634;BA.debugLine="selectedS = Max(0, Min(1, x / ColorPicker.pnl.Wi";
__ref._selecteds /*float*/  = (float) (__c.Max(0,__c.Min(1,_x/(double)__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
RDebugUtils.currentLine=136773635;
 //BA.debugLineNum = 136773635;BA.debugLine="selectedV = Max(0, Min(1, (ColorPicker.pnl.Heigh";
__ref._selectedv /*float*/  = (float) (__c.Max(0,__c.Min(1,(__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_y)/(double)__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
 };
RDebugUtils.currentLine=136773637;
 //BA.debugLineNum = 136773637;BA.debugLine="ColorPicker.cvs.ClearRect(ColorPicker.cvs.TargetR";
__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=136773638;
 //BA.debugLineNum = 136773638;BA.debugLine="ColorPicker.cvs.DrawCircle(selectedS * ColorPicke";
__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._selecteds /*float*/ *__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._selectedv /*float*/ *__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(float) (__c.DipToCurrent((int) (10))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=136773640;
 //BA.debugLineNum = 136773640;BA.debugLine="ColorPicker.cvs.Invalidate";
__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=136773641;
 //BA.debugLineNum = 136773641;BA.debugLine="UpdateBarColor";
__ref._updatebarcolor /*String*/ (null);
RDebugUtils.currentLine=136773642;
 //BA.debugLineNum = 136773642;BA.debugLine="End Sub";
return "";
}
public Object[]  _colortohsv(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "colortohsv", true))
	 {return ((Object[]) Debug.delegate(ba, "colortohsv", new Object[] {_clr}));}
int _a = 0;
int _r = 0;
int _g = 0;
int _b = 0;
float _h = 0f;
float _s = 0f;
float _v = 0f;
int _cmax = 0;
int _cmin = 0;
float _rc = 0f;
float _gc = 0f;
float _bc = 0f;
RDebugUtils.currentLine=137101312;
 //BA.debugLineNum = 137101312;BA.debugLine="Public Sub ColorToHSV(clr As Int) As Object()";
RDebugUtils.currentLine=137101313;
 //BA.debugLineNum = 137101313;BA.debugLine="Dim a As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_a = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (24)));
RDebugUtils.currentLine=137101314;
 //BA.debugLineNum = 137101314;BA.debugLine="Dim r As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_r = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (16)));
RDebugUtils.currentLine=137101315;
 //BA.debugLineNum = 137101315;BA.debugLine="Dim g As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_g = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (8)));
RDebugUtils.currentLine=137101316;
 //BA.debugLineNum = 137101316;BA.debugLine="Dim b As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_b = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (0)));
RDebugUtils.currentLine=137101317;
 //BA.debugLineNum = 137101317;BA.debugLine="Dim h, s, v As Float";
_h = 0f;
_s = 0f;
_v = 0f;
RDebugUtils.currentLine=137101318;
 //BA.debugLineNum = 137101318;BA.debugLine="Dim cmax As Int = Max(Max(r, g), b)";
_cmax = (int) (__c.Max(__c.Max(_r,_g),_b));
RDebugUtils.currentLine=137101319;
 //BA.debugLineNum = 137101319;BA.debugLine="Dim cmin As Int = Min(Min(r, g), b)";
_cmin = (int) (__c.Min(__c.Min(_r,_g),_b));
RDebugUtils.currentLine=137101320;
 //BA.debugLineNum = 137101320;BA.debugLine="v = cmax / 255";
_v = (float) (_cmax/(double)255);
RDebugUtils.currentLine=137101321;
 //BA.debugLineNum = 137101321;BA.debugLine="If cmax <> 0 Then";
if (_cmax!=0) { 
RDebugUtils.currentLine=137101322;
 //BA.debugLineNum = 137101322;BA.debugLine="s = (cmax - cmin) / cmax";
_s = (float) ((_cmax-_cmin)/(double)_cmax);
 };
RDebugUtils.currentLine=137101324;
 //BA.debugLineNum = 137101324;BA.debugLine="If s = 0 Then";
if (_s==0) { 
RDebugUtils.currentLine=137101325;
 //BA.debugLineNum = 137101325;BA.debugLine="h = 0";
_h = (float) (0);
 }else {
RDebugUtils.currentLine=137101327;
 //BA.debugLineNum = 137101327;BA.debugLine="Dim rc As Float = (cmax - r) / (cmax - cmin)";
_rc = (float) ((_cmax-_r)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=137101328;
 //BA.debugLineNum = 137101328;BA.debugLine="Dim gc As Float = (cmax - g) / (cmax - cmin)";
_gc = (float) ((_cmax-_g)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=137101329;
 //BA.debugLineNum = 137101329;BA.debugLine="Dim bc As Float = (cmax - b) / (cmax - cmin)";
_bc = (float) ((_cmax-_b)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=137101330;
 //BA.debugLineNum = 137101330;BA.debugLine="If r = cmax Then";
if (_r==_cmax) { 
RDebugUtils.currentLine=137101331;
 //BA.debugLineNum = 137101331;BA.debugLine="h = bc - gc";
_h = (float) (_bc-_gc);
 }else 
{RDebugUtils.currentLine=137101332;
 //BA.debugLineNum = 137101332;BA.debugLine="Else If g = cmax Then";
if (_g==_cmax) { 
RDebugUtils.currentLine=137101333;
 //BA.debugLineNum = 137101333;BA.debugLine="h = 2 + rc - bc";
_h = (float) (2+_rc-_bc);
 }else {
RDebugUtils.currentLine=137101335;
 //BA.debugLineNum = 137101335;BA.debugLine="h = 4 + gc - rc";
_h = (float) (4+_gc-_rc);
 }}
;
RDebugUtils.currentLine=137101337;
 //BA.debugLineNum = 137101337;BA.debugLine="h = h / 6";
_h = (float) (_h/(double)6);
RDebugUtils.currentLine=137101338;
 //BA.debugLineNum = 137101338;BA.debugLine="If h < 0 Then h = h + 1";
if (_h<0) { 
_h = (float) (_h+1);};
 };
RDebugUtils.currentLine=137101340;
 //BA.debugLineNum = 137101340;BA.debugLine="Return Array (h * 360, s, v, a)";
if (true) return new Object[]{(Object)(_h*360),(Object)(_s),(Object)(_v),(Object)(_a)};
RDebugUtils.currentLine=137101341;
 //BA.debugLineNum = 137101341;BA.debugLine="End Sub";
return null;
}
public ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart  _createpanelforbitmapcreator(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,String _eventname,boolean _withcheckers) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "createpanelforbitmapcreator", true))
	 {return ((ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart) Debug.delegate(ba, "createpanelforbitmapcreator", new Object[] {_eventname,_withcheckers}));}
ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart _cpp = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _overlay = null;
RDebugUtils.currentLine=136183808;
 //BA.debugLineNum = 136183808;BA.debugLine="Private Sub CreatePanelForBitmapCreator (EventName";
RDebugUtils.currentLine=136183809;
 //BA.debugLineNum = 136183809;BA.debugLine="Dim cpp As ColorPickerPart";
_cpp = new ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart();
RDebugUtils.currentLine=136183810;
 //BA.debugLineNum = 136183810;BA.debugLine="cpp.Initialize";
_cpp.Initialize();
RDebugUtils.currentLine=136183811;
 //BA.debugLineNum = 136183811;BA.debugLine="cpp.pnl = xui.CreatePanel(\"\")";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=136183812;
 //BA.debugLineNum = 136183812;BA.debugLine="cpp.pnl.SetColorAndBorder(BordersColor, 1dip, Bor";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (1)),__ref._borderscolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=136183813;
 //BA.debugLineNum = 136183813;BA.debugLine="cpp.pnl.SetLayoutAnimated(0, 1dip, 1dip, 1dip, 1d";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=136183814;
 //BA.debugLineNum = 136183814;BA.debugLine="If WithCheckers Then";
if (_withcheckers) { 
RDebugUtils.currentLine=136183815;
 //BA.debugLineNum = 136183815;BA.debugLine="cpp.checkersCanvas.Initialize(cpp.pnl)";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=136183816;
 //BA.debugLineNum = 136183816;BA.debugLine="cpp.DrawCheckers = True";
_cpp.DrawCheckers /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=136183818;
 //BA.debugLineNum = 136183818;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=136183819;
 //BA.debugLineNum = 136183819;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=136183820;
 //BA.debugLineNum = 136183820;BA.debugLine="cpp.iv = iv";
_cpp.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=136183821;
 //BA.debugLineNum = 136183821;BA.debugLine="Dim overlay As B4XView = xui.CreatePanel(EventNam";
_overlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_overlay = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,_eventname);
RDebugUtils.currentLine=136183822;
 //BA.debugLineNum = 136183822;BA.debugLine="cpp.pnl.AddView(iv, 0, 0, 0, 0)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_iv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=136183823;
 //BA.debugLineNum = 136183823;BA.debugLine="cpp.pnl.AddView(overlay, 1dip, 1dip, 1dip, 1dip)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_overlay.getObject()),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=136183824;
 //BA.debugLineNum = 136183824;BA.debugLine="cpp.cvs.Initialize(overlay)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_overlay);
RDebugUtils.currentLine=136183825;
 //BA.debugLineNum = 136183825;BA.debugLine="mBase.AddView(cpp.pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=136183826;
 //BA.debugLineNum = 136183826;BA.debugLine="Return cpp";
if (true) return _cpp;
RDebugUtils.currentLine=136183827;
 //BA.debugLineNum = 136183827;BA.debugLine="End Sub";
return null;
}
public String  _dialogclosed(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=137297920;
 //BA.debugLineNum = 137297920;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=137297921;
 //BA.debugLineNum = 137297921;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=137297922;
 //BA.debugLineNum = 137297922;BA.debugLine="setSelectedHSVColor(InitialColor)";
__ref._setselectedhsvcolor /*String*/ (null,__ref._initialcolor /*Object[]*/ );
 };
RDebugUtils.currentLine=137297924;
 //BA.debugLineNum = 137297924;BA.debugLine="End Sub";
return "";
}
public String  _setselectedhsvcolor(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,Object[] _hsv) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "setselectedhsvcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedhsvcolor", new Object[] {_hsv}));}
RDebugUtils.currentLine=137035776;
 //BA.debugLineNum = 137035776;BA.debugLine="Public Sub setSelectedHSVColor (HSV() As Object)";
RDebugUtils.currentLine=137035777;
 //BA.debugLineNum = 137035777;BA.debugLine="selectedH = HSV(0)";
__ref._selectedh /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (0)]));
RDebugUtils.currentLine=137035778;
 //BA.debugLineNum = 137035778;BA.debugLine="selectedS = HSV(1)";
__ref._selecteds /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (1)]));
RDebugUtils.currentLine=137035779;
 //BA.debugLineNum = 137035779;BA.debugLine="selectedV = HSV(2)";
__ref._selectedv /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (2)]));
RDebugUtils.currentLine=137035780;
 //BA.debugLineNum = 137035780;BA.debugLine="SelectedAlpha = HSV(3)";
__ref._selectedalpha /*int*/  = (int)(BA.ObjectToNumber(_hsv[(int) (3)]));
RDebugUtils.currentLine=137035781;
 //BA.debugLineNum = 137035781;BA.debugLine="HueBarSelectedChanged(selectedH / 360 * HueBar.pn";
__ref._huebarselectedchanged /*String*/ (null,(float) (__ref._selectedh /*float*/ /(double)360*__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=137035782;
 //BA.debugLineNum = 137035782;BA.debugLine="AlphaBarSelectedChange(SelectedAlpha / 255 * Alph";
__ref._alphabarselectedchange /*String*/ (null,(float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=137035783;
 //BA.debugLineNum = 137035783;BA.debugLine="End Sub";
return "";
}
public String  _drawcolors(ir.parsikhesab.pakhsh.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawcolors", true))
	 {return ((String) Debug.delegate(ba, "drawcolors", null));}
int _x = 0;
int _y = 0;
RDebugUtils.currentLine=136511488;
 //BA.debugLineNum = 136511488;BA.debugLine="Private Sub DrawColors";
RDebugUtils.currentLine=136511489;
 //BA.debugLineNum = 136511489;BA.debugLine="For x = 0 To bcColors.mWidth - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._bccolors /*b4a.example.bitmapcreator*/ ._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit1 ;_x = _x + step1 ) {
RDebugUtils.currentLine=136511490;
 //BA.debugLineNum = 136511490;BA.debugLine="For y = 0 To bcColors.mHeight - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._bccolors /*b4a.example.bitmapcreator*/ ._mheight-1);
_y = (int) (0) ;
for (;_y <= limit2 ;_y = _y + step2 ) {
RDebugUtils.currentLine=136511491;
 //BA.debugLineNum = 136511491;BA.debugLine="bcColors.SetHSV(x, y, SelectedAlpha, selectedH,";
__ref._bccolors /*b4a.example.bitmapcreator*/ ._sethsv(_x,_y,__ref._selectedalpha /*int*/ ,(int) (__ref._selectedh /*float*/ ),(float) (_x/(double)__ref._bccolors /*b4a.example.bitmapcreator*/ ._mwidth),(float) ((__ref._bccolors /*b4a.example.bitmapcreator*/ ._mheight-_y)/(double)__ref._bccolors /*b4a.example.bitmapcreator*/ ._mheight));
 }
};
 }
};
RDebugUtils.currentLine=136511495;
 //BA.debugLineNum = 136511495;BA.debugLine="ColorPicker.iv.SetBitmap(bcColors.Bitmap.Resize(C";
__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._bccolors /*b4a.example.bitmapcreator*/ ._getbitmap().Resize(__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.False).getObject()));
RDebugUtils.currentLine=136511496;
 //BA.debugLineNum = 136511496;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=137166848;
 //BA.debugLineNum = 137166848;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=137166849;
 //BA.debugLineNum = 137166849;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=137166850;
 //BA.debugLineNum = 137166850;BA.debugLine="End Sub";
return null;
}
public int  _getselectedcolor(ir.parsikhesab.pakhsh.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getselectedcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedcolor", null));}
Object[] _hsv = null;
RDebugUtils.currentLine=136839168;
 //BA.debugLineNum = 136839168;BA.debugLine="Public Sub getSelectedColor As Int";
RDebugUtils.currentLine=136839169;
 //BA.debugLineNum = 136839169;BA.debugLine="Dim hsv() As Object = getSelectedHSVColor";
_hsv = __ref._getselectedhsvcolor /*Object[]*/ (null);
RDebugUtils.currentLine=136839170;
 //BA.debugLineNum = 136839170;BA.debugLine="tempBC.SetHSV(0, 0, SelectedAlpha, hsv(0), hsv(1)";
__ref._tempbc /*b4a.example.bitmapcreator*/ ._sethsv((int) (0),(int) (0),__ref._selectedalpha /*int*/ ,(int)(BA.ObjectToNumber(_hsv[(int) (0)])),(float)(BA.ObjectToNumber(_hsv[(int) (1)])),(float)(BA.ObjectToNumber(_hsv[(int) (2)])));
RDebugUtils.currentLine=136839171;
 //BA.debugLineNum = 136839171;BA.debugLine="Return tempBC.GetColor(0, 0)";
if (true) return __ref._tempbc /*b4a.example.bitmapcreator*/ ._getcolor((int) (0),(int) (0));
RDebugUtils.currentLine=136839172;
 //BA.debugLineNum = 136839172;BA.debugLine="End Sub";
return 0;
}
public Object[]  _getselectedhsvcolor(ir.parsikhesab.pakhsh.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getselectedhsvcolor", true))
	 {return ((Object[]) Debug.delegate(ba, "getselectedhsvcolor", null));}
RDebugUtils.currentLine=136970240;
 //BA.debugLineNum = 136970240;BA.debugLine="Public Sub getSelectedHSVColor As Object()";
RDebugUtils.currentLine=136970241;
 //BA.debugLineNum = 136970241;BA.debugLine="Return Array (selectedH, selectedS, selectedV, Se";
if (true) return new Object[]{(Object)(__ref._selectedh /*float*/ ),(Object)(__ref._selecteds /*float*/ ),(Object)(__ref._selectedv /*float*/ ),(Object)(__ref._selectedalpha /*int*/ )};
RDebugUtils.currentLine=136970242;
 //BA.debugLineNum = 136970242;BA.debugLine="End Sub";
return null;
}
public String  _updatebarcolor(ir.parsikhesab.pakhsh.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "updatebarcolor", true))
	 {return ((String) Debug.delegate(ba, "updatebarcolor", null));}
RDebugUtils.currentLine=137363456;
 //BA.debugLineNum = 137363456;BA.debugLine="Private Sub UpdateBarColor";
RDebugUtils.currentLine=137363457;
 //BA.debugLineNum = 137363457;BA.debugLine="If xDialog.IsInitialized And xDialog.TitleBar.IsI";
if (__ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/ .IsInitialized /*boolean*/ () && __ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=137363458;
 //BA.debugLineNum = 137363458;BA.debugLine="xDialog.TitleBar.Color = getSelectedColor";
__ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._getselectedcolor /*int*/ (null));
 };
RDebugUtils.currentLine=137363460;
 //BA.debugLineNum = 137363460;BA.debugLine="End Sub";
return "";
}
public String  _huebar_touch(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "huebar_touch", true))
	 {return ((String) Debug.delegate(ba, "huebar_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=137494528;
 //BA.debugLineNum = 137494528;BA.debugLine="Private Sub HueBar_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=137494529;
 //BA.debugLineNum = 137494529;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=137494530;
 //BA.debugLineNum = 137494530;BA.debugLine="HueBarSelectedChanged(Y)";
__ref._huebarselectedchanged /*String*/ (null,_y);
RDebugUtils.currentLine=137494531;
 //BA.debugLineNum = 137494531;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=136118272;
 //BA.debugLineNum = 136118272;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=136118273;
 //BA.debugLineNum = 136118273;BA.debugLine="tempBC.Initialize(1, 1)";
__ref._tempbc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (1),(int) (1));
RDebugUtils.currentLine=136118274;
 //BA.debugLineNum = 136118274;BA.debugLine="DeviceScale = 100dip / 100";
__ref._devicescale /*float*/  = (float) (__c.DipToCurrent((int) (100))/(double)100);
RDebugUtils.currentLine=136118275;
 //BA.debugLineNum = 136118275;BA.debugLine="mBase = xui.CreatePanel(\"\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=136118276;
 //BA.debugLineNum = 136118276;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 250dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=136118277;
 //BA.debugLineNum = 136118277;BA.debugLine="BordersColor = xui.Color_Black";
__ref._borderscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=136118278;
 //BA.debugLineNum = 136118278;BA.debugLine="mBase.SetColorAndBorder(BordersColor, 1dip, Borde";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (1)),__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=136118279;
 //BA.debugLineNum = 136118279;BA.debugLine="HueBar = CreatePanelForBitmapCreator(\"hueBar\", Fa";
__ref._huebar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ (null,"hueBar",__c.False);
RDebugUtils.currentLine=136118280;
 //BA.debugLineNum = 136118280;BA.debugLine="ColorPicker = CreatePanelForBitmapCreator(\"colors";
__ref._colorpicker /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ (null,"colors",__c.True);
RDebugUtils.currentLine=136118281;
 //BA.debugLineNum = 136118281;BA.debugLine="AlphaBar = CreatePanelForBitmapCreator(\"alpha\", T";
__ref._alphabar /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*ir.parsikhesab.pakhsh.b4xcolortemplate._colorpickerpart*/ (null,"alpha",__c.True);
RDebugUtils.currentLine=136118282;
 //BA.debugLineNum = 136118282;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=136118283;
 //BA.debugLineNum = 136118283;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcolor(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "setselectedcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedcolor", new Object[] {_i}));}
RDebugUtils.currentLine=136904704;
 //BA.debugLineNum = 136904704;BA.debugLine="Public Sub setSelectedColor(i As Int)";
RDebugUtils.currentLine=136904705;
 //BA.debugLineNum = 136904705;BA.debugLine="setSelectedHSVColor(ColorToHSV(i))";
__ref._setselectedhsvcolor /*String*/ (null,__ref._colortohsv /*Object[]*/ (null,_i));
RDebugUtils.currentLine=136904706;
 //BA.debugLineNum = 136904706;BA.debugLine="End Sub";
return "";
}
public void  _show(ir.parsikhesab.pakhsh.b4xcolortemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(ir.parsikhesab.pakhsh.b4xcolortemplate parent,ir.parsikhesab.pakhsh.b4xcolortemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.b4xcolortemplate __ref;
ir.parsikhesab.pakhsh.b4xcolortemplate parent;
ir.parsikhesab.pakhsh.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xcolortemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=137232385;
 //BA.debugLineNum = 137232385;BA.debugLine="InitialColor = getSelectedHSVColor";
__ref._initialcolor /*Object[]*/  = __ref._getselectedhsvcolor /*Object[]*/ (null);
RDebugUtils.currentLine=137232386;
 //BA.debugLineNum = 137232386;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=137232387;
 //BA.debugLineNum = 137232387;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xcolortemplate", "show"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=137232388;
 //BA.debugLineNum = 137232388;BA.debugLine="UpdateBarColor";
__ref._updatebarcolor /*String*/ (null);
RDebugUtils.currentLine=137232389;
 //BA.debugLineNum = 137232389;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}