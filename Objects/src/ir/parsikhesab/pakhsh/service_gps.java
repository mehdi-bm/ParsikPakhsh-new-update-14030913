package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class service_gps extends android.app.Service{
	public static class service_gps_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (service_gps) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, service_gps.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static service_gps mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return service_gps.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.service_gps");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.service_gps", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (service_gps) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (service_gps) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (service_gps) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }

	public void onTimeout(int startId) {
        BA.LogInfo("** Service (service_gps) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (service_gps) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (service_gps) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static ADR.stringdemo.stringfunctions _sf = null;
public static anywheresoftware.b4a.phone.Phone.PhoneId _imei = null;
public static anywheresoftware.b4a.objects.Timer _t_gps = null;
public static anywheresoftware.b4a.objects.Timer _t_startstopgps = null;
public static ir.parsikhesab.pakhsh.httpjob _jobinternet = null;
public static anywheresoftware.b4a.student.PersianDate _persiandate = null;
public static String _gettime = "";
public static String _lat = "";
public static String _lon = "";
public static String _c_visitor = "";
public static anywheresoftware.b4a.agraham.threading.Threading _th = null;
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
public static String  _datemiladi() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "datemiladi", false))
	 {return ((String) Debug.delegate(processBA, "datemiladi", null));}
String[] _t = null;
RDebugUtils.currentLine=119603200;
 //BA.debugLineNum = 119603200;BA.debugLine="Sub DateMiladi As String";
RDebugUtils.currentLine=119603201;
 //BA.debugLineNum = 119603201;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=119603202;
 //BA.debugLineNum = 119603202;BA.debugLine="T = Regex.Split(\"/\",DateTime.Date(DateTime.Now))";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=119603203;
 //BA.debugLineNum = 119603203;BA.debugLine="If T(0).Length=1 Then";
if (_t[(int) (0)].length()==1) { 
RDebugUtils.currentLine=119603204;
 //BA.debugLineNum = 119603204;BA.debugLine="T(0)=\"0\"&T(0)";
_t[(int) (0)] = "0"+_t[(int) (0)];
 };
RDebugUtils.currentLine=119603206;
 //BA.debugLineNum = 119603206;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=119603207;
 //BA.debugLineNum = 119603207;BA.debugLine="T(1)=\"0\"&T(0)";
_t[(int) (1)] = "0"+_t[(int) (0)];
 };
RDebugUtils.currentLine=119603209;
 //BA.debugLineNum = 119603209;BA.debugLine="Return T(2)&T(1)&T(0)";
if (true) return _t[(int) (2)]+_t[(int) (1)]+_t[(int) (0)];
RDebugUtils.currentLine=119603210;
 //BA.debugLineNum = 119603210;BA.debugLine="End Sub";
return "";
}
public static String  _datemiladi2() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "datemiladi2", false))
	 {return ((String) Debug.delegate(processBA, "datemiladi2", null));}
String[] _t = null;
RDebugUtils.currentLine=119668736;
 //BA.debugLineNum = 119668736;BA.debugLine="Sub DateMiladi2 As String";
RDebugUtils.currentLine=119668737;
 //BA.debugLineNum = 119668737;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=119668738;
 //BA.debugLineNum = 119668738;BA.debugLine="T = Regex.Split(\"/\",DateTime.Date(DateTime.Now))";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=119668739;
 //BA.debugLineNum = 119668739;BA.debugLine="If T(0).Length=1 Then";
if (_t[(int) (0)].length()==1) { 
RDebugUtils.currentLine=119668740;
 //BA.debugLineNum = 119668740;BA.debugLine="T(0)=\"0\"&T(0)";
_t[(int) (0)] = "0"+_t[(int) (0)];
 };
RDebugUtils.currentLine=119668742;
 //BA.debugLineNum = 119668742;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=119668743;
 //BA.debugLineNum = 119668743;BA.debugLine="T(1)=\"0\"&T(0)";
_t[(int) (1)] = "0"+_t[(int) (0)];
 };
RDebugUtils.currentLine=119668745;
 //BA.debugLineNum = 119668745;BA.debugLine="Return T(2)&T(1)";
if (true) return _t[(int) (2)]+_t[(int) (1)];
RDebugUtils.currentLine=119668746;
 //BA.debugLineNum = 119668746;BA.debugLine="End Sub";
return "";
}
public static String  _datepersian() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "datepersian", false))
	 {return ((String) Debug.delegate(processBA, "datepersian", null));}
String[] _t = null;
RDebugUtils.currentLine=119537664;
 //BA.debugLineNum = 119537664;BA.debugLine="Sub DatePersian As String";
RDebugUtils.currentLine=119537665;
 //BA.debugLineNum = 119537665;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=119537666;
 //BA.debugLineNum = 119537666;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",_persiandate.getDate((int) (0),(int) (0),(int) (0),"/"));
RDebugUtils.currentLine=119537667;
 //BA.debugLineNum = 119537667;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=119537668;
 //BA.debugLineNum = 119537668;BA.debugLine="T(1)=\"0\"&T(1)";
_t[(int) (1)] = "0"+_t[(int) (1)];
 };
RDebugUtils.currentLine=119537670;
 //BA.debugLineNum = 119537670;BA.debugLine="If T(2).Length=1 Then";
if (_t[(int) (2)].length()==1) { 
RDebugUtils.currentLine=119537671;
 //BA.debugLineNum = 119537671;BA.debugLine="T(2)=\"0\"&T(2)";
_t[(int) (2)] = "0"+_t[(int) (2)];
 };
RDebugUtils.currentLine=119537673;
 //BA.debugLineNum = 119537673;BA.debugLine="Return T(0)&T(1)&T(2)";
if (true) return _t[(int) (0)]+_t[(int) (1)]+_t[(int) (2)];
RDebugUtils.currentLine=119537674;
 //BA.debugLineNum = 119537674;BA.debugLine="End Sub";
return "";
}
public static String  _datepersian2() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "datepersian2", false))
	 {return ((String) Debug.delegate(processBA, "datepersian2", null));}
String[] _t = null;
RDebugUtils.currentLine=119472128;
 //BA.debugLineNum = 119472128;BA.debugLine="Sub DatePersian2 As String";
RDebugUtils.currentLine=119472129;
 //BA.debugLineNum = 119472129;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=119472130;
 //BA.debugLineNum = 119472130;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",_persiandate.getDate((int) (0),(int) (0),(int) (0),"/"));
RDebugUtils.currentLine=119472131;
 //BA.debugLineNum = 119472131;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=119472132;
 //BA.debugLineNum = 119472132;BA.debugLine="T(1)=\"0\"&T(1)";
_t[(int) (1)] = "0"+_t[(int) (1)];
 };
RDebugUtils.currentLine=119472134;
 //BA.debugLineNum = 119472134;BA.debugLine="If T(2).Length=1 Then";
if (_t[(int) (2)].length()==1) { 
RDebugUtils.currentLine=119472135;
 //BA.debugLineNum = 119472135;BA.debugLine="T(2)=\"0\"&T(2)";
_t[(int) (2)] = "0"+_t[(int) (2)];
 };
RDebugUtils.currentLine=119472137;
 //BA.debugLineNum = 119472137;BA.debugLine="Return T(1)&T(2)";
if (true) return _t[(int) (1)]+_t[(int) (2)];
RDebugUtils.currentLine=119472138;
 //BA.debugLineNum = 119472138;BA.debugLine="End Sub";
return "";
}
public static String  _dttojson(anywheresoftware.b4a.sql.SQL.CursorWrapper _cu) throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "dttojson", false))
	 {return ((String) Debug.delegate(processBA, "dttojson", new Object[] {_cu}));}
String _olgoo = "";
String _rowolgoo = "";
String _str = "";
int _i = 0;
int _j = 0;
RDebugUtils.currentLine=119734272;
 //BA.debugLineNum = 119734272;BA.debugLine="Sub DtToJson(Cu As Cursor) As String";
RDebugUtils.currentLine=119734273;
 //BA.debugLineNum = 119734273;BA.debugLine="Dim Olgoo As String";
_olgoo = "";
RDebugUtils.currentLine=119734274;
 //BA.debugLineNum = 119734274;BA.debugLine="Dim RowOlgoo As String";
_rowolgoo = "";
RDebugUtils.currentLine=119734275;
 //BA.debugLineNum = 119734275;BA.debugLine="Dim Str As String";
_str = "";
RDebugUtils.currentLine=119734276;
 //BA.debugLineNum = 119734276;BA.debugLine="For i=0 To Cu.ColumnCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_cu.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=119734277;
 //BA.debugLineNum = 119734277;BA.debugLine="Olgoo=Olgoo & Chr(34) & Cu.GetColumnName(i) & Ch";
_olgoo = _olgoo+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+_cu.GetColumnName(_i)+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+":"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+_cu.GetColumnName(_i)+BA.NumberToString(_i)+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+",";
 }
};
RDebugUtils.currentLine=119734279;
 //BA.debugLineNum = 119734279;BA.debugLine="Olgoo=Sf.Left(Olgoo,Olgoo.Length-1)";
_olgoo = _sf._vv0(_olgoo,(long) (_olgoo.length()-1));
RDebugUtils.currentLine=119734280;
 //BA.debugLineNum = 119734280;BA.debugLine="Olgoo = \"{\" & Olgoo & \"}\" & \",\"";
_olgoo = "{"+_olgoo+"}"+",";
RDebugUtils.currentLine=119734281;
 //BA.debugLineNum = 119734281;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step9 = 1;
final int limit9 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=119734282;
 //BA.debugLineNum = 119734282;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=119734283;
 //BA.debugLineNum = 119734283;BA.debugLine="RowOlgoo=Olgoo";
_rowolgoo = _olgoo;
RDebugUtils.currentLine=119734284;
 //BA.debugLineNum = 119734284;BA.debugLine="For j=0 To Cu.ColumnCount-1";
{
final int step12 = 1;
final int limit12 = (int) (_cu.getColumnCount()-1);
_j = (int) (0) ;
for (;_j <= limit12 ;_j = _j + step12 ) {
RDebugUtils.currentLine=119734285;
 //BA.debugLineNum = 119734285;BA.debugLine="If Cu.GetString2(j)<> Null Then";
if (_cu.GetString2(_j)!= null) { 
RDebugUtils.currentLine=119734286;
 //BA.debugLineNum = 119734286;BA.debugLine="RowOlgoo = RowOlgoo.Replace(Cu.GetColumnName(j";
_rowolgoo = _rowolgoo.replace(_cu.GetColumnName(_j)+BA.NumberToString(_j),_cu.GetString2(_j));
 };
 }
};
RDebugUtils.currentLine=119734290;
 //BA.debugLineNum = 119734290;BA.debugLine="Str=Str & RowOlgoo";
_str = _str+_rowolgoo;
 }
};
RDebugUtils.currentLine=119734292;
 //BA.debugLineNum = 119734292;BA.debugLine="Str=Sf.Left(Str,Str.Length-1)";
_str = _sf._vv0(_str,(long) (_str.length()-1));
RDebugUtils.currentLine=119734293;
 //BA.debugLineNum = 119734293;BA.debugLine="Str=\"[\" & Str & \"]\"";
_str = "["+_str+"]";
RDebugUtils.currentLine=119734294;
 //BA.debugLineNum = 119734294;BA.debugLine="File.WriteString(File.DirDefaultExternal, \"1.txt\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"1.txt",_str);
RDebugUtils.currentLine=119734295;
 //BA.debugLineNum = 119734295;BA.debugLine="Return Str";
if (true) return _str;
RDebugUtils.currentLine=119734296;
 //BA.debugLineNum = 119734296;BA.debugLine="End Sub";
return "";
}
public static String  _gps1_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "gps1_locationchanged", false))
	 {return ((String) Debug.delegate(processBA, "gps1_locationchanged", new Object[] {_location1}));}
RDebugUtils.currentLine=119341056;
 //BA.debugLineNum = 119341056;BA.debugLine="Sub GPS1_LocationChanged (Location1 As Location)";
RDebugUtils.currentLine=119341058;
 //BA.debugLineNum = 119341058;BA.debugLine="Lat=Location1.Latitude";
_lat = BA.NumberToString(_location1.getLatitude());
RDebugUtils.currentLine=119341059;
 //BA.debugLineNum = 119341059;BA.debugLine="Lon=Location1.Longitude";
_lon = BA.NumberToString(_location1.getLongitude());
RDebugUtils.currentLine=119341061;
 //BA.debugLineNum = 119341061;BA.debugLine="End Sub";
return "";
}
public static String  _interval() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "interval", false))
	 {return ((String) Debug.delegate(processBA, "interval", null));}
RDebugUtils.currentLine=118816768;
 //BA.debugLineNum = 118816768;BA.debugLine="Sub Interval As String";
RDebugUtils.currentLine=118816771;
 //BA.debugLineNum = 118816771;BA.debugLine="Return MCode.IntervalGps * 60 * 1000";
if (true) return BA.NumberToString(mostCurrent._mcode._intervalgps /*int*/ *60*1000);
RDebugUtils.currentLine=118816772;
 //BA.debugLineNum = 118816772;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "jobdone", false))
	 {return ((String) Debug.delegate(processBA, "jobdone", new Object[] {_job}));}
String _str = "";
RDebugUtils.currentLine=119275520;
 //BA.debugLineNum = 119275520;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=119275521;
 //BA.debugLineNum = 119275521;BA.debugLine="Job.GetRequest.Timeout=50000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=119275523;
 //BA.debugLineNum = 119275523;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=119275524;
 //BA.debugLineNum = 119275524;BA.debugLine="Dim Str As String = Job.GetString";
_str = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=119275525;
 //BA.debugLineNum = 119275525;BA.debugLine="Select Case Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"SendGps")) {
case 0: {
RDebugUtils.currentLine=119275527;
 //BA.debugLineNum = 119275527;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=119275530;
 //BA.debugLineNum = 119275530;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGpsVisitor\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGpsVisitor");
RDebugUtils.currentLine=119275531;
 //BA.debugLineNum = 119275531;BA.debugLine="Log(\"GPS OK\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5119275531","GPS OK",0);
 };
 break; }
}
;
 }else {
 };
RDebugUtils.currentLine=119275538;
 //BA.debugLineNum = 119275538;BA.debugLine="jobInternet.Release";
_jobinternet._release /*String*/ (null);
RDebugUtils.currentLine=119275539;
 //BA.debugLineNum = 119275539;BA.debugLine="End Sub";
return "";
}
public static String  _savelocationtodb() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "savelocationtodb", false))
	 {return ((String) Debug.delegate(processBA, "savelocationtodb", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _tarikh = "";
String[] _tm = null;
String _time = "";
RDebugUtils.currentLine=119144448;
 //BA.debugLineNum = 119144448;BA.debugLine="Sub SaveLocationToDb";
RDebugUtils.currentLine=119144449;
 //BA.debugLineNum = 119144449;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldNoeDat";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldNoeDate From TblSetting");
RDebugUtils.currentLine=119144450;
 //BA.debugLineNum = 119144450;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=119144451;
 //BA.debugLineNum = 119144451;BA.debugLine="If Cu.GetString(\"FldNoeDate\") = \"S\" Then";
if ((_cu.GetString("FldNoeDate")).equals("S")) { 
RDebugUtils.currentLine=119144452;
 //BA.debugLineNum = 119144452;BA.debugLine="Dim Tarikh As String = DatePersian";
_tarikh = _datepersian();
 }else 
{RDebugUtils.currentLine=119144453;
 //BA.debugLineNum = 119144453;BA.debugLine="else if Cu.GetString(\"FldNoeDate\") = \"M\" Then";
if ((_cu.GetString("FldNoeDate")).equals("M")) { 
RDebugUtils.currentLine=119144454;
 //BA.debugLineNum = 119144454;BA.debugLine="Dim Tarikh As String = DateMiladi";
_tarikh = _datemiladi();
 }}
;
RDebugUtils.currentLine=119144457;
 //BA.debugLineNum = 119144457;BA.debugLine="Dim Tm() As String";
_tm = new String[(int) (0)];
java.util.Arrays.fill(_tm,"");
RDebugUtils.currentLine=119144458;
 //BA.debugLineNum = 119144458;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=119144459;
 //BA.debugLineNum = 119144459;BA.debugLine="Tm = Regex.Split(\":\",Time)";
_tm = anywheresoftware.b4a.keywords.Common.Regex.Split(":",_time);
RDebugUtils.currentLine=119144460;
 //BA.debugLineNum = 119144460;BA.debugLine="Time=MCode.ConvertNumbersPersian2English(Tm(0)) &";
_time = mostCurrent._mcode._convertnumberspersian2english /*String*/ (processBA,_tm[(int) (0)])+mostCurrent._mcode._convertnumberspersian2english /*String*/ (processBA,_tm[(int) (1)]);
RDebugUtils.currentLine=119144463;
 //BA.debugLineNum = 119144463;BA.debugLine="Log(Lat)";
anywheresoftware.b4a.keywords.Common.LogImpl("5119144463",_lat,0);
RDebugUtils.currentLine=119144464;
 //BA.debugLineNum = 119144464;BA.debugLine="Log(Lon)";
anywheresoftware.b4a.keywords.Common.LogImpl("5119144464",_lon,0);
RDebugUtils.currentLine=119144465;
 //BA.debugLineNum = 119144465;BA.debugLine="If Lat <> \"\" And Lon <> \"\" And IsNumber(C_Visitor";
if ((_lat).equals("") == false && (_lon).equals("") == false && anywheresoftware.b4a.keywords.Common.IsNumber(_c_visitor)==anywheresoftware.b4a.keywords.Common.True && anywheresoftware.b4a.keywords.Common.IsNumber(_tarikh)==anywheresoftware.b4a.keywords.Common.True && anywheresoftware.b4a.keywords.Common.IsNumber(_time)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=119144466;
 //BA.debugLineNum = 119144466;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGpsVisitor (Fld";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"+_c_visitor+"','"+_tarikh+"','"+_time+"','"+_lat+"','"+_lon+"')");
RDebugUtils.currentLine=119144467;
 //BA.debugLineNum = 119144467;BA.debugLine="GetTime=DateTime.Time(DateTime.Now)";
_gettime = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 };
RDebugUtils.currentLine=119144469;
 //BA.debugLineNum = 119144469;BA.debugLine="Lat=\"\"";
_lat = "";
RDebugUtils.currentLine=119144470;
 //BA.debugLineNum = 119144470;BA.debugLine="Lon=\"\"";
_lon = "";
RDebugUtils.currentLine=119144472;
 //BA.debugLineNum = 119144472;BA.debugLine="End Sub";
return "";
}
public static String  _sendgps(String _str) throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "sendgps", false))
	 {return ((String) Debug.delegate(processBA, "sendgps", new Object[] {_str}));}
RDebugUtils.currentLine=119209984;
 //BA.debugLineNum = 119209984;BA.debugLine="Sub SendGps(Str As String)";
RDebugUtils.currentLine=119209989;
 //BA.debugLineNum = 119209989;BA.debugLine="jobInternet.JobName =\"SendGps\"";
_jobinternet._jobname /*String*/  = "SendGps";
RDebugUtils.currentLine=119209990;
 //BA.debugLineNum = 119209990;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveGps","JsonDt="+_str+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=119209991;
 //BA.debugLineNum = 119209991;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=118751232;
 //BA.debugLineNum = 118751232;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=118751248;
 //BA.debugLineNum = 118751248;BA.debugLine="Try";
try {RDebugUtils.currentLine=118751249;
 //BA.debugLineNum = 118751249;BA.debugLine="If	MCode.ServiceGpsActive=1 Then";
if (mostCurrent._mcode._servicegpsactive /*int*/ ==1) { 
RDebugUtils.currentLine=118751250;
 //BA.debugLineNum = 118751250;BA.debugLine="GPS1.Initialize(\"GPS1\")";
_gps1.Initialize("GPS1");
RDebugUtils.currentLine=118751251;
 //BA.debugLineNum = 118751251;BA.debugLine="If GPS1.GPSEnabled=True Then";
if (_gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=118751253;
 //BA.debugLineNum = 118751253;BA.debugLine="T_Gps.Initialize(\"T_Gps\",60000)";
_t_gps.Initialize(processBA,"T_Gps",(long) (60000));
RDebugUtils.currentLine=118751254;
 //BA.debugLineNum = 118751254;BA.debugLine="T_StartStopGps.Initialize(\"T_StartStopGps\",Int";
_t_startstopgps.Initialize(processBA,"T_StartStopGps",(long)(Double.parseDouble(_interval())));
RDebugUtils.currentLine=118751255;
 //BA.debugLineNum = 118751255;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
_jobinternet._initialize /*String*/ (null,processBA,"jobInternet",service_gps.getObject());
 }else {
RDebugUtils.currentLine=118751257;
 //BA.debugLineNum = 118751257;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کن";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=118751258;
 //BA.debugLineNum = 118751258;BA.debugLine="StartActivity(GPS1.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_gps1.getLocationSettingsIntent()));
 };
 };
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=118751262;
 //BA.debugLineNum = 118751262;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5118751262",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=118751265;
 //BA.debugLineNum = 118751265;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=119406592;
 //BA.debugLineNum = 119406592;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=119406593;
 //BA.debugLineNum = 119406593;BA.debugLine="StartServiceAt(Me, DateTime.Now + 3 * 1000, False";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,service_gps.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+3*1000),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=119406594;
 //BA.debugLineNum = 119406594;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=118882304;
 //BA.debugLineNum = 118882304;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=118882306;
 //BA.debugLineNum = 118882306;BA.debugLine="GPS1.Initialize(\"GPS1\")";
_gps1.Initialize("GPS1");
RDebugUtils.currentLine=118882307;
 //BA.debugLineNum = 118882307;BA.debugLine="Try";
try {RDebugUtils.currentLine=118882308;
 //BA.debugLineNum = 118882308;BA.debugLine="If	MCode.ServiceGpsActive=1 Then";
if (mostCurrent._mcode._servicegpsactive /*int*/ ==1) { 
RDebugUtils.currentLine=118882309;
 //BA.debugLineNum = 118882309;BA.debugLine="If GPS1.GPSEnabled=True Then";
if (_gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=118882310;
 //BA.debugLineNum = 118882310;BA.debugLine="T_StartStopGps_Tick";
_t_startstopgps_tick();
RDebugUtils.currentLine=118882313;
 //BA.debugLineNum = 118882313;BA.debugLine="C_Visitor = MCode.C_Visitor";
_c_visitor = mostCurrent._mcode._c_visitor /*String*/ ;
RDebugUtils.currentLine=118882315;
 //BA.debugLineNum = 118882315;BA.debugLine="T_StartStopGps.Enabled=True";
_t_startstopgps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=118882316;
 //BA.debugLineNum = 118882316;BA.debugLine="T_Gps.Enabled=True";
_t_gps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=118882318;
 //BA.debugLineNum = 118882318;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کن";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=118882319;
 //BA.debugLineNum = 118882319;BA.debugLine="StartActivity(GPS1.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_gps1.getLocationSettingsIntent()));
 };
 };
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=118882323;
 //BA.debugLineNum = 118882323;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5118882323",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=118882328;
 //BA.debugLineNum = 118882328;BA.debugLine="End Sub";
return "";
}
public static String  _t_startstopgps_tick() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "t_startstopgps_tick", false))
	 {return ((String) Debug.delegate(processBA, "t_startstopgps_tick", null));}
RDebugUtils.currentLine=119013376;
 //BA.debugLineNum = 119013376;BA.debugLine="Sub T_StartStopGps_Tick";
RDebugUtils.currentLine=119013377;
 //BA.debugLineNum = 119013377;BA.debugLine="Try";
try {RDebugUtils.currentLine=119013378;
 //BA.debugLineNum = 119013378;BA.debugLine="If GPS1.GPSEnabled = True Then";
if (_gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=119013380;
 //BA.debugLineNum = 119013380;BA.debugLine="GPS1.Start(0,0)";
_gps1.Start(processBA,(long) (0),(float) (0));
 }else {
RDebugUtils.currentLine=119013382;
 //BA.debugLineNum = 119013382;BA.debugLine="GPS1.Stop";
_gps1.Stop();
 };
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=119013385;
 //BA.debugLineNum = 119013385;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5119013385",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=119013387;
 //BA.debugLineNum = 119013387;BA.debugLine="End Sub";
return "";
}
public static String  _t_gps_tick() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "t_gps_tick", false))
	 {return ((String) Debug.delegate(processBA, "t_gps_tick", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=119078912;
 //BA.debugLineNum = 119078912;BA.debugLine="Sub T_Gps_Tick";
RDebugUtils.currentLine=119078913;
 //BA.debugLineNum = 119078913;BA.debugLine="Try";
try {RDebugUtils.currentLine=119078914;
 //BA.debugLineNum = 119078914;BA.debugLine="SaveLocationToDb";
_savelocationtodb();
RDebugUtils.currentLine=119078916;
 //BA.debugLineNum = 119078916;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblGpsVisitor");
RDebugUtils.currentLine=119078917;
 //BA.debugLineNum = 119078917;BA.debugLine="If Cu.RowCount > 0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=119078918;
 //BA.debugLineNum = 119078918;BA.debugLine="SendGps(DtToJson(Cu))";
_sendgps(_dttojson(_cu));
 };
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=119078921;
 //BA.debugLineNum = 119078921;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5119078921",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=119078923;
 //BA.debugLineNum = 119078923;BA.debugLine="End Sub";
return "";
}
public static String  _trd() throws Exception{
RDebugUtils.currentModule="service_gps";
if (Debug.shouldDelegate(processBA, "trd", false))
	 {return ((String) Debug.delegate(processBA, "trd", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=118947840;
 //BA.debugLineNum = 118947840;BA.debugLine="Sub trd";
RDebugUtils.currentLine=118947843;
 //BA.debugLineNum = 118947843;BA.debugLine="T_StartStopGps_Tick";
_t_startstopgps_tick();
RDebugUtils.currentLine=118947844;
 //BA.debugLineNum = 118947844;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldC_Visi";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldC_Visitor From TblSetting");
RDebugUtils.currentLine=118947845;
 //BA.debugLineNum = 118947845;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=118947846;
 //BA.debugLineNum = 118947846;BA.debugLine="C_Visitor = Cu.GetString(\"FldC_Visitor\")";
_c_visitor = _cu.GetString("FldC_Visitor");
RDebugUtils.currentLine=118947848;
 //BA.debugLineNum = 118947848;BA.debugLine="T_StartStopGps.Enabled=True";
_t_startstopgps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=118947849;
 //BA.debugLineNum = 118947849;BA.debugLine="T_Gps.Enabled=True";
_t_gps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=118947850;
 //BA.debugLineNum = 118947850;BA.debugLine="End Sub";
return "";
}
}