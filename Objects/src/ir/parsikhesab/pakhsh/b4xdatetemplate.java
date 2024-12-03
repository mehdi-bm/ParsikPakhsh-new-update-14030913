package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xdatetemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.b4xdatetemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.b4xdatetemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _month = 0;
public int _year = 0;
public float _boxw = 0f;
public float _boxh = 0f;
public float _vcorrection = 0f;
public int _tempselectedday = 0;
public int _dayofweekoffset = 0;
public int _daysinmonth = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanebg = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanefg = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvsbackground = null;
public long _selecteddate = 0L;
public long _previousselecteddate = 0L;
public int _selectedyear = 0;
public int _selectedmonth = 0;
public int _selectedday = 0;
public int _highlightedcolor = 0;
public int _selectedcolor = 0;
public int _daysinmonthcolor = 0;
public int _daysinweekcolor = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvsdays = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _daystitlespane = null;
public int _firstday = 0;
public int _minyear = 0;
public int _maxyear = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblmonth = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblyear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnldialog = null;
public anywheresoftware.b4a.objects.collections.List _monthsnames = null;
public ir.parsikhesab.pakhsh.b4xdialog _mdialog = null;
public boolean _closeonselection = false;
public anywheresoftware.b4a.objects.collections.List _daysofweeknames = null;
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
public String  _btnmonth_click(ir.parsikhesab.pakhsh.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "btnmonth_click", true))
	 {return ((String) Debug.delegate(ba, "btnmonth_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
int _m = 0;
RDebugUtils.currentLine=139198464;
 //BA.debugLineNum = 139198464;BA.debugLine="Private Sub btnMonth_Click";
RDebugUtils.currentLine=139198465;
 //BA.debugLineNum = 139198465;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=139198466;
 //BA.debugLineNum = 139198466;BA.debugLine="Dim m As Int = 12 + month - 1 + btn.Tag";
_m = (int) (12+__ref._month /*int*/ -1+(double)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=139198467;
 //BA.debugLineNum = 139198467;BA.debugLine="month = (m Mod 12) + 1";
__ref._month /*int*/  = (int) ((_m%12)+1);
RDebugUtils.currentLine=139198468;
 //BA.debugLineNum = 139198468;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=139198469;
 //BA.debugLineNum = 139198469;BA.debugLine="End Sub";
return "";
}
public String  _drawdays(ir.parsikhesab.pakhsh.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "drawdays", true))
	 {return ((String) Debug.delegate(ba, "drawdays", null));}
long _firstdayofmonth = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _day = 0;
int _row = 0;
RDebugUtils.currentLine=138608640;
 //BA.debugLineNum = 138608640;BA.debugLine="Private Sub DrawDays";
RDebugUtils.currentLine=138608641;
 //BA.debugLineNum = 138608641;BA.debugLine="lblMonth.Text = MonthsNames.Get(month - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._monthsnames /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._month /*int*/ -1))));
RDebugUtils.currentLine=138608642;
 //BA.debugLineNum = 138608642;BA.debugLine="lblYear.Text = year";
__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._year /*int*/ ));
RDebugUtils.currentLine=138608643;
 //BA.debugLineNum = 138608643;BA.debugLine="SetYearsButtonState";
__ref._setyearsbuttonstate /*String*/ (null);
RDebugUtils.currentLine=138608644;
 //BA.debugLineNum = 138608644;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=138608645;
 //BA.debugLineNum = 138608645;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=138608646;
 //BA.debugLineNum = 138608646;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.setDate(y";
_firstdayofmonth = (long) (_dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,(int) (1))-1);
RDebugUtils.currentLine=138608647;
 //BA.debugLineNum = 138608647;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
__ref._dayofweekoffset /*int*/  = (int) ((7+__c.DateTime.GetDayOfWeek(_firstdayofmonth)-__ref._firstday /*int*/ )%7);
RDebugUtils.currentLine=138608648;
 //BA.debugLineNum = 138608648;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
__ref._daysinmonth /*int*/  = _dateutils._numberofdaysinmonth(ba,__ref._month /*int*/ ,__ref._year /*int*/ );
RDebugUtils.currentLine=138608649;
 //BA.debugLineNum = 138608649;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (__ref._year /*int*/ ==__ref._selectedyear /*int*/  && __ref._month /*int*/ ==__ref._selectedmonth /*int*/ ) { 
RDebugUtils.currentLine=138608651;
 //BA.debugLineNum = 138608651;BA.debugLine="DrawBox(cvs, SelectedColor, (selectedDay - 1 + d";
__ref._drawbox /*String*/ (null,__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ ,__ref._selectedcolor /*int*/ ,(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )%7),(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )/(double)7));
 };
RDebugUtils.currentLine=138608654;
 //BA.debugLineNum = 138608654;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14));
RDebugUtils.currentLine=138608655;
 //BA.debugLineNum = 138608655;BA.debugLine="For day = 1 To daysInMonth";
{
final int step13 = 1;
final int limit13 = __ref._daysinmonth /*int*/ ;
_day = (int) (1) ;
for (;_day <= limit13 ;_day = _day + step13 ) {
RDebugUtils.currentLine=138608656;
 //BA.debugLineNum = 138608656;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+__ref._dayofweekoffset /*int*/ )/(double)7);
RDebugUtils.currentLine=138608657;
 //BA.debugLineNum = 138608657;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,BA.NumberToString(_day),(float) ((((__ref._dayofweekoffset /*int*/ +_day-1)%7)+0.5)*__ref._boxw /*float*/ ),(float) ((_row+0.5)*__ref._boxh /*float*/ +__ref._vcorrection /*float*/ ),_daysfont,__ref._daysinmonthcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=138608660;
 //BA.debugLineNum = 138608660;BA.debugLine="cvsBackground.Invalidate";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=138608661;
 //BA.debugLineNum = 138608661;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=138608662;
 //BA.debugLineNum = 138608662;BA.debugLine="End Sub";
return "";
}
public String  _btnyear_click(ir.parsikhesab.pakhsh.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "btnyear_click", true))
	 {return ((String) Debug.delegate(ba, "btnyear_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
RDebugUtils.currentLine=139132928;
 //BA.debugLineNum = 139132928;BA.debugLine="Private Sub btnYear_Click";
RDebugUtils.currentLine=139132929;
 //BA.debugLineNum = 139132929;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=139132930;
 //BA.debugLineNum = 139132930;BA.debugLine="year = year + btn.Tag";
__ref._year /*int*/  = (int) (__ref._year /*int*/ +(double)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=139132931;
 //BA.debugLineNum = 139132931;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=139132932;
 //BA.debugLineNum = 139132932;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
RDebugUtils.currentLine=138477568;
 //BA.debugLineNum = 138477568;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=138477569;
 //BA.debugLineNum = 138477569;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=138477570;
 //BA.debugLineNum = 138477570;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
RDebugUtils.currentLine=138477571;
 //BA.debugLineNum = 138477571;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
RDebugUtils.currentLine=138477572;
 //BA.debugLineNum = 138477572;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
RDebugUtils.currentLine=138477573;
 //BA.debugLineNum = 138477573;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
RDebugUtils.currentLine=138477574;
 //BA.debugLineNum = 138477574;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
RDebugUtils.currentLine=138477575;
 //BA.debugLineNum = 138477575;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
RDebugUtils.currentLine=138477576;
 //BA.debugLineNum = 138477576;BA.debugLine="Private DaysPaneBg As B4XView";
_dayspanebg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138477577;
 //BA.debugLineNum = 138477577;BA.debugLine="Private DaysPaneFg As B4XView";
_dayspanefg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138477578;
 //BA.debugLineNum = 138477578;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=138477579;
 //BA.debugLineNum = 138477579;BA.debugLine="Private cvsBackground As B4XCanvas";
_cvsbackground = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=138477580;
 //BA.debugLineNum = 138477580;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=138477581;
 //BA.debugLineNum = 138477581;BA.debugLine="Private PreviousSelectedDate As Long";
_previousselecteddate = 0L;
RDebugUtils.currentLine=138477582;
 //BA.debugLineNum = 138477582;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
RDebugUtils.currentLine=138477583;
 //BA.debugLineNum = 138477583;BA.debugLine="Public HighlightedColor As Int = 0xFF001BBD";
_highlightedcolor = ((int)0xff001bbd);
RDebugUtils.currentLine=138477584;
 //BA.debugLineNum = 138477584;BA.debugLine="Public SelectedColor As Int = 0xFF0BA29B";
_selectedcolor = ((int)0xff0ba29b);
RDebugUtils.currentLine=138477585;
 //BA.debugLineNum = 138477585;BA.debugLine="Public DaysInMonthColor As Int = xui.Color_White";
_daysinmonthcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=138477586;
 //BA.debugLineNum = 138477586;BA.debugLine="Public DaysInWeekColor As Int = xui.Color_Gray";
_daysinweekcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=138477587;
 //BA.debugLineNum = 138477587;BA.debugLine="Private cvsDays As B4XCanvas";
_cvsdays = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=138477588;
 //BA.debugLineNum = 138477588;BA.debugLine="Private DaysTitlesPane As B4XView";
_daystitlespane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138477589;
 //BA.debugLineNum = 138477589;BA.debugLine="Public FirstDay As Int = 0";
_firstday = (int) (0);
RDebugUtils.currentLine=138477590;
 //BA.debugLineNum = 138477590;BA.debugLine="Public MinYear = 1970, MaxYear = 2030 As Int";
_minyear = (int) (1970);
_maxyear = (int) (2030);
RDebugUtils.currentLine=138477591;
 //BA.debugLineNum = 138477591;BA.debugLine="Public btnMonthLeft As B4XView";
_btnmonthleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138477592;
 //BA.debugLineNum = 138477592;BA.debugLine="Public btnMonthRight As B4XView";
_btnmonthright = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138477593;
 //BA.debugLineNum = 138477593;BA.debugLine="Public btnYearLeft As B4XView";
_btnyearleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138477594;
 //BA.debugLineNum = 138477594;BA.debugLine="Public btnYearRight As B4XView";
_btnyearright = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138477595;
 //BA.debugLineNum = 138477595;BA.debugLine="Public lblMonth As B4XView";
_lblmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138477596;
 //BA.debugLineNum = 138477596;BA.debugLine="Public lblYear As B4XView";
_lblyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138477597;
 //BA.debugLineNum = 138477597;BA.debugLine="Private pnlDialog As B4XView";
_pnldialog = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=138477598;
 //BA.debugLineNum = 138477598;BA.debugLine="Public MonthsNames As List";
_monthsnames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=138477599;
 //BA.debugLineNum = 138477599;BA.debugLine="Private mDialog As B4XDialog";
_mdialog = new ir.parsikhesab.pakhsh.b4xdialog();
RDebugUtils.currentLine=138477600;
 //BA.debugLineNum = 138477600;BA.debugLine="Public CloseOnSelection As Boolean = True";
_closeonselection = __c.True;
RDebugUtils.currentLine=138477601;
 //BA.debugLineNum = 138477601;BA.debugLine="Public DaysOfWeekNames As List";
_daysofweeknames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=138477602;
 //BA.debugLineNum = 138477602;BA.debugLine="End Sub";
return "";
}
public String  _dayspanefg_touch(ir.parsikhesab.pakhsh.b4xdatetemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "dayspanefg_touch", true))
	 {return ((String) Debug.delegate(ba, "dayspanefg_touch", new Object[] {_action,_x,_y}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=139264000;
 //BA.debugLineNum = 139264000;BA.debugLine="Private Sub DaysPaneFg_Touch (Action As Int, X As";
RDebugUtils.currentLine=139264001;
 //BA.debugLineNum = 139264001;BA.debugLine="Dim p As B4XView = DaysPaneFg";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=139264002;
 //BA.debugLineNum = 139264002;BA.debugLine="HandleMouse(X, Y, Action <> p.TOUCH_ACTION_UP)";
__ref._handlemouse /*String*/ (null,_x,_y,_action!=_p.TOUCH_ACTION_UP);
RDebugUtils.currentLine=139264003;
 //BA.debugLineNum = 139264003;BA.debugLine="End Sub";
return "";
}
public String  _handlemouse(ir.parsikhesab.pakhsh.b4xdatetemplate __ref,double _x,double _y,boolean _move) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "handlemouse", true))
	 {return ((String) Debug.delegate(ba, "handlemouse", new Object[] {_x,_y,_move}));}
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
RDebugUtils.currentLine=139001856;
 //BA.debugLineNum = 139001856;BA.debugLine="Private Sub HandleMouse(x As Double, y As Double,";
RDebugUtils.currentLine=139001857;
 //BA.debugLineNum = 139001857;BA.debugLine="Dim boxX = x / boxW, boxY =  y / boxH As Int";
_boxx = (int) (_x/(double)__ref._boxw /*float*/ );
_boxy = (int) (_y/(double)__ref._boxh /*float*/ );
RDebugUtils.currentLine=139001858;
 //BA.debugLineNum = 139001858;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-__ref._dayofweekoffset /*int*/ );
RDebugUtils.currentLine=139001859;
 //BA.debugLineNum = 139001859;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=__ref._daysinmonth /*int*/ ;
RDebugUtils.currentLine=139001860;
 //BA.debugLineNum = 139001860;BA.debugLine="If move Then";
if (_move) { 
RDebugUtils.currentLine=139001861;
 //BA.debugLineNum = 139001861;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==__ref._tempselectedday /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=139001862;
 //BA.debugLineNum = 139001862;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=139001863;
 //BA.debugLineNum = 139001863;BA.debugLine="tempSelectedDay = newSelectedDay";
__ref._tempselectedday /*int*/  = _newselectedday;
RDebugUtils.currentLine=139001864;
 //BA.debugLineNum = 139001864;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=139001865;
 //BA.debugLineNum = 139001865;BA.debugLine="DrawBox(cvsBackground, HighlightedColor, boxX,";
__ref._drawbox /*String*/ (null,__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ ,__ref._highlightedcolor /*int*/ ,_boxx,_boxy);
 };
 }else {
RDebugUtils.currentLine=139001868;
 //BA.debugLineNum = 139001868;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=139001869;
 //BA.debugLineNum = 139001869;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=139001870;
 //BA.debugLineNum = 139001870;BA.debugLine="SelectDay(newSelectedDay)";
__ref._selectday /*String*/ (null,_newselectedday);
RDebugUtils.currentLine=139001871;
 //BA.debugLineNum = 139001871;BA.debugLine="If CloseOnSelection Then";
if (__ref._closeonselection /*boolean*/ ) { 
RDebugUtils.currentLine=139001872;
 //BA.debugLineNum = 139001872;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 }else {
RDebugUtils.currentLine=139001874;
 //BA.debugLineNum = 139001874;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
 };
 };
 };
RDebugUtils.currentLine=139001879;
 //BA.debugLineNum = 139001879;BA.debugLine="cvsBackground.Invalidate";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=139001880;
 //BA.debugLineNum = 139001880;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(ir.parsikhesab.pakhsh.b4xdatetemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=139460608;
 //BA.debugLineNum = 139460608;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=139460609;
 //BA.debugLineNum = 139460609;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=139460610;
 //BA.debugLineNum = 139460610;BA.debugLine="setDate(PreviousSelectedDate)";
__ref._setdate /*String*/ (null,__ref._previousselecteddate /*long*/ );
 };
RDebugUtils.currentLine=139460612;
 //BA.debugLineNum = 139460612;BA.debugLine="End Sub";
return "";
}
public String  _setdate(ir.parsikhesab.pakhsh.b4xdatetemplate __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "setdate", true))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_date}));}
RDebugUtils.currentLine=138870784;
 //BA.debugLineNum = 138870784;BA.debugLine="Public Sub setDate(date As Long)";
RDebugUtils.currentLine=138870786;
 //BA.debugLineNum = 138870786;BA.debugLine="If lblYear.IsInitialized = False Then";
if (__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=138870787;
 //BA.debugLineNum = 138870787;BA.debugLine="selectedDate = date";
__ref._selecteddate /*long*/  = _date;
RDebugUtils.currentLine=138870788;
 //BA.debugLineNum = 138870788;BA.debugLine="Return 'the date will be set after the layout is";
if (true) return "";
 };
RDebugUtils.currentLine=138870790;
 //BA.debugLineNum = 138870790;BA.debugLine="year = DateTime.GetYear(date)";
__ref._year /*int*/  = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=138870791;
 //BA.debugLineNum = 138870791;BA.debugLine="month = DateTime.GetMonth(date)";
__ref._month /*int*/  = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=138870792;
 //BA.debugLineNum = 138870792;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date))";
__ref._selectday /*String*/ (null,__c.DateTime.GetDayOfMonth(_date));
RDebugUtils.currentLine=138870793;
 //BA.debugLineNum = 138870793;BA.debugLine="lblYear.Text = year";
__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._year /*int*/ ));
RDebugUtils.currentLine=138870794;
 //BA.debugLineNum = 138870794;BA.debugLine="lblMonth.Text = MonthsNames.Get(month - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._monthsnames /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._month /*int*/ -1))));
RDebugUtils.currentLine=138870795;
 //BA.debugLineNum = 138870795;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(ir.parsikhesab.pakhsh.b4xdatetemplate __ref,anywheresoftware.b4a.objects.B4XCanvas _c,int _clr,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "drawbox", true))
	 {return ((String) Debug.delegate(ba, "drawbox", new Object[] {_c,_clr,_x,_y}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=138739712;
 //BA.debugLineNum = 138739712;BA.debugLine="Private Sub DrawBox(c As B4XCanvas, clr As Int, x";
RDebugUtils.currentLine=138739713;
 //BA.debugLineNum = 138739713;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=138739714;
 //BA.debugLineNum = 138739714;BA.debugLine="r.Initialize(x * boxW, y * boxH, x * boxW + boxW,";
_r.Initialize((float) (_x*__ref._boxw /*float*/ ),(float) (_y*__ref._boxh /*float*/ ),(float) (_x*__ref._boxw /*float*/ +__ref._boxw /*float*/ ),(float) (_y*__ref._boxh /*float*/ +__ref._boxh /*float*/ ));
RDebugUtils.currentLine=138739715;
 //BA.debugLineNum = 138739715;BA.debugLine="c.DrawRect(r, clr, True, 1dip)";
_c.DrawRect(_r,_clr,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=138739716;
 //BA.debugLineNum = 138739716;BA.debugLine="End Sub";
return "";
}
public String  _setyearsbuttonstate(ir.parsikhesab.pakhsh.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "setyearsbuttonstate", true))
	 {return ((String) Debug.delegate(ba, "setyearsbuttonstate", null));}
RDebugUtils.currentLine=138674176;
 //BA.debugLineNum = 138674176;BA.debugLine="Private Sub SetYearsButtonState";
RDebugUtils.currentLine=138674177;
 //BA.debugLineNum = 138674177;BA.debugLine="btnYearLeft.Enabled = year > MinYear";
__ref._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._year /*int*/ >__ref._minyear /*int*/ );
RDebugUtils.currentLine=138674178;
 //BA.debugLineNum = 138674178;BA.debugLine="btnYearRight.Enabled = year < MaxYear";
__ref._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._year /*int*/ <__ref._maxyear /*int*/ );
RDebugUtils.currentLine=138674179;
 //BA.debugLineNum = 138674179;BA.debugLine="End Sub";
return "";
}
public long  _getdate(ir.parsikhesab.pakhsh.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "getdate", true))
	 {return ((Long) Debug.delegate(ba, "getdate", null));}
RDebugUtils.currentLine=138805248;
 //BA.debugLineNum = 138805248;BA.debugLine="Public Sub getDate As Long";
RDebugUtils.currentLine=138805249;
 //BA.debugLineNum = 138805249;BA.debugLine="Return selectedDate";
if (true) return __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=138805250;
 //BA.debugLineNum = 138805250;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(ir.parsikhesab.pakhsh.b4xdatetemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=139329536;
 //BA.debugLineNum = 139329536;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=139329537;
 //BA.debugLineNum = 139329537;BA.debugLine="Return pnlDialog";
if (true) return __ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=139329538;
 //BA.debugLineNum = 139329538;BA.debugLine="End Sub";
return null;
}
public String  _selectday(ir.parsikhesab.pakhsh.b4xdatetemplate __ref,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "selectday", true))
	 {return ((String) Debug.delegate(ba, "selectday", new Object[] {_day}));}
RDebugUtils.currentLine=138936320;
 //BA.debugLineNum = 138936320;BA.debugLine="Private Sub SelectDay(day As Int)";
RDebugUtils.currentLine=138936321;
 //BA.debugLineNum = 138936321;BA.debugLine="selectedDate = DateUtils.setDate(year, month, day";
__ref._selecteddate /*long*/  = _dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,_day);
RDebugUtils.currentLine=138936322;
 //BA.debugLineNum = 138936322;BA.debugLine="selectedDay = day";
__ref._selectedday /*int*/  = _day;
RDebugUtils.currentLine=138936323;
 //BA.debugLineNum = 138936323;BA.debugLine="selectedMonth = month";
__ref._selectedmonth /*int*/  = __ref._month /*int*/ ;
RDebugUtils.currentLine=138936324;
 //BA.debugLineNum = 138936324;BA.debugLine="selectedYear = year";
__ref._selectedyear /*int*/  = __ref._year /*int*/ ;
RDebugUtils.currentLine=138936325;
 //BA.debugLineNum = 138936325;BA.debugLine="End Sub";
return "";
}
public String  _hide(ir.parsikhesab.pakhsh.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=139067392;
 //BA.debugLineNum = 139067392;BA.debugLine="Private Sub Hide";
RDebugUtils.currentLine=139067393;
 //BA.debugLineNum = 139067393;BA.debugLine="mDialog.Close(xui.DialogResponse_Positive)";
__ref._mdialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=139067394;
 //BA.debugLineNum = 139067394;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.parsikhesab.pakhsh.b4xdatetemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=138543104;
 //BA.debugLineNum = 138543104;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=138543105;
 //BA.debugLineNum = 138543105;BA.debugLine="pnlDialog = xui.CreatePanel(\"\")";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=138543106;
 //BA.debugLineNum = 138543106;BA.debugLine="pnlDialog.SetLayoutAnimated(0, 0, 0, 320dip,300di";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (320)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=138543107;
 //BA.debugLineNum = 138543107;BA.debugLine="pnlDialog.LoadLayout(\"DateTemplate\")";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("DateTemplate",ba);
RDebugUtils.currentLine=138543108;
 //BA.debugLineNum = 138543108;BA.debugLine="pnlDialog.Tag = Me";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=138543109;
 //BA.debugLineNum = 138543109;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
__ref._month /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=138543110;
 //BA.debugLineNum = 138543110;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
__ref._year /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=138543111;
 //BA.debugLineNum = 138543111;BA.debugLine="MonthsNames = DateUtils.GetMonthsNames";
__ref._monthsnames /*anywheresoftware.b4a.objects.collections.List*/  = _dateutils._getmonthsnames(ba);
RDebugUtils.currentLine=138543112;
 //BA.debugLineNum = 138543112;BA.debugLine="selectedDate = DateTime.Now";
__ref._selecteddate /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=138543113;
 //BA.debugLineNum = 138543113;BA.debugLine="setDate(selectedDate)";
__ref._setdate /*String*/ (null,__ref._selecteddate /*long*/ );
RDebugUtils.currentLine=138543114;
 //BA.debugLineNum = 138543114;BA.debugLine="cvs.Initialize(DaysPaneFg)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=138543115;
 //BA.debugLineNum = 138543115;BA.debugLine="cvsBackground.Initialize(DaysPaneBg)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._dayspanebg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=138543116;
 //BA.debugLineNum = 138543116;BA.debugLine="boxW = cvs.TargetRect.Width / 7";
__ref._boxw /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)7);
RDebugUtils.currentLine=138543117;
 //BA.debugLineNum = 138543117;BA.debugLine="boxH = cvs.TargetRect.Height / 6";
__ref._boxh /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()/(double)6);
RDebugUtils.currentLine=138543118;
 //BA.debugLineNum = 138543118;BA.debugLine="vCorrection = 5dip";
__ref._vcorrection /*float*/  = (float) (__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=138543119;
 //BA.debugLineNum = 138543119;BA.debugLine="cvsDays.Initialize(DaysTitlesPane)";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._daystitlespane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=138543125;
 //BA.debugLineNum = 138543125;BA.debugLine="DaysOfWeekNames.Initialize";
__ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=138543126;
 //BA.debugLineNum = 138543126;BA.debugLine="DaysOfWeekNames.AddAll(DateUtils.GetDaysNames)";
__ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_dateutils._getdaysnames(ba));
RDebugUtils.currentLine=138543127;
 //BA.debugLineNum = 138543127;BA.debugLine="End Sub";
return "";
}
public void  _show(ir.parsikhesab.pakhsh.b4xdatetemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(ir.parsikhesab.pakhsh.b4xdatetemplate parent,ir.parsikhesab.pakhsh.b4xdatetemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.b4xdatetemplate __ref;
ir.parsikhesab.pakhsh.b4xdatetemplate parent;
ir.parsikhesab.pakhsh.b4xdialog _dialog;
anywheresoftware.b4a.objects.collections.List _days = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _i = 0;
String _d = "";
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdatetemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=139395073;
 //BA.debugLineNum = 139395073;BA.debugLine="Dim days As List = DaysOfWeekNames";
_days = new anywheresoftware.b4a.objects.collections.List();
_days = __ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=139395074;
 //BA.debugLineNum = 139395074;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14));
RDebugUtils.currentLine=139395075;
 //BA.debugLineNum = 139395075;BA.debugLine="cvsDays.ClearRect(cvsDays.TargetRect)";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=139395076;
 //BA.debugLineNum = 139395076;BA.debugLine="For i = FirstDay To FirstDay + 7 - 1";
if (true) break;

case 1:
//for
this.state = 10;
step4 = 1;
limit4 = (int) (__ref._firstday /*int*/ +7-1);
_i = __ref._firstday /*int*/  ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=139395077;
 //BA.debugLineNum = 139395077;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
_d = BA.ObjectToString(_days.Get((int) (_i%7)));
RDebugUtils.currentLine=139395078;
 //BA.debugLineNum = 139395078;BA.debugLine="If d.Length > 2 Then d = d.SubString2(0, 2)";
if (true) break;

case 4:
//if
this.state = 9;
if (_d.length()>2) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_d = _d.substring((int) (0),(int) (2));
if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=139395079;
 //BA.debugLineNum = 139395079;BA.debugLine="cvsDays.DrawText(d, (i - FirstDay + 0.5) * boxW,";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_d,(float) ((_i-__ref._firstday /*int*/ +0.5)*__ref._boxw /*float*/ ),(float) (parent.__c.DipToCurrent((int) (20))),_daysfont,__ref._daysinweekcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=139395081;
 //BA.debugLineNum = 139395081;BA.debugLine="cvsDays.Invalidate";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=139395082;
 //BA.debugLineNum = 139395082;BA.debugLine="mDialog = Dialog";
__ref._mdialog /*ir.parsikhesab.pakhsh.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=139395083;
 //BA.debugLineNum = 139395083;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=139395084;
 //BA.debugLineNum = 139395084;BA.debugLine="PreviousSelectedDate = selectedDate";
__ref._previousselecteddate /*long*/  = __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=139395085;
 //BA.debugLineNum = 139395085;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdatetemplate", "show"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=139395086;
 //BA.debugLineNum = 139395086;BA.debugLine="SetYearsButtonState";
__ref._setyearsbuttonstate /*String*/ (null);
RDebugUtils.currentLine=139395087;
 //BA.debugLineNum = 139395087;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}