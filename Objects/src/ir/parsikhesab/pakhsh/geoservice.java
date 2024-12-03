package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class geoservice extends android.app.Service{
	public static class geoservice_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (geoservice) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, geoservice.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static geoservice mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return geoservice.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.geoservice");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.geoservice", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (geoservice) Create ***");
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
                    BA.LogInfo("** Service (geoservice) Create **");
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
    	BA.LogInfo("** Service (geoservice) Start **");
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
        BA.LogInfo("** Service (geoservice) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (geoservice) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (geoservice) Destroy **");
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
public static de.donmanfred.GeoLocatorwrapper _geoloc = null;
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static boolean _permissionok = false;
public static anywheresoftware.b4a.objects.Timer _t_gps = null;
public static anywheresoftware.b4a.objects.Timer _t_startstopgps = null;
public static String _gettime = "";
public static String _lat = "";
public static String _lon = "";
public static ir.parsikhesab.pakhsh.httpjob _jobinternet = null;
public static String _c_visitor = "";
public static anywheresoftware.b4a.student.PersianDate _persiandate = null;
public static ADR.stringdemo.stringfunctions _sf = null;
public static anywheresoftware.b4a.phone.Phone.PhoneWakeState _lock = null;
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
public static String  _datemiladi() throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "datemiladi", false))
	 {return ((String) Debug.delegate(processBA, "datemiladi", null));}
String[] _t = null;
RDebugUtils.currentLine=117506048;
 //BA.debugLineNum = 117506048;BA.debugLine="Sub DateMiladi As String";
RDebugUtils.currentLine=117506049;
 //BA.debugLineNum = 117506049;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=117506050;
 //BA.debugLineNum = 117506050;BA.debugLine="T = Regex.Split(\"/\",DateTime.Date(DateTime.Now))";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=117506051;
 //BA.debugLineNum = 117506051;BA.debugLine="If T(0).Length=1 Then";
if (_t[(int) (0)].length()==1) { 
RDebugUtils.currentLine=117506052;
 //BA.debugLineNum = 117506052;BA.debugLine="T(0)=\"0\"&T(0)";
_t[(int) (0)] = "0"+_t[(int) (0)];
 };
RDebugUtils.currentLine=117506054;
 //BA.debugLineNum = 117506054;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=117506055;
 //BA.debugLineNum = 117506055;BA.debugLine="T(1)=\"0\"&T(0)";
_t[(int) (1)] = "0"+_t[(int) (0)];
 };
RDebugUtils.currentLine=117506057;
 //BA.debugLineNum = 117506057;BA.debugLine="Return T(2)&T(1)&T(0)";
if (true) return _t[(int) (2)]+_t[(int) (1)]+_t[(int) (0)];
RDebugUtils.currentLine=117506058;
 //BA.debugLineNum = 117506058;BA.debugLine="End Sub";
return "";
}
public static String  _datemiladi2() throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "datemiladi2", false))
	 {return ((String) Debug.delegate(processBA, "datemiladi2", null));}
String[] _t = null;
RDebugUtils.currentLine=117571584;
 //BA.debugLineNum = 117571584;BA.debugLine="Sub DateMiladi2 As String";
RDebugUtils.currentLine=117571585;
 //BA.debugLineNum = 117571585;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=117571586;
 //BA.debugLineNum = 117571586;BA.debugLine="T = Regex.Split(\"/\",DateTime.Date(DateTime.Now))";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=117571587;
 //BA.debugLineNum = 117571587;BA.debugLine="If T(0).Length=1 Then";
if (_t[(int) (0)].length()==1) { 
RDebugUtils.currentLine=117571588;
 //BA.debugLineNum = 117571588;BA.debugLine="T(0)=\"0\"&T(0)";
_t[(int) (0)] = "0"+_t[(int) (0)];
 };
RDebugUtils.currentLine=117571590;
 //BA.debugLineNum = 117571590;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=117571591;
 //BA.debugLineNum = 117571591;BA.debugLine="T(1)=\"0\"&T(0)";
_t[(int) (1)] = "0"+_t[(int) (0)];
 };
RDebugUtils.currentLine=117571593;
 //BA.debugLineNum = 117571593;BA.debugLine="Return T(2)&T(1)";
if (true) return _t[(int) (2)]+_t[(int) (1)];
RDebugUtils.currentLine=117571594;
 //BA.debugLineNum = 117571594;BA.debugLine="End Sub";
return "";
}
public static String  _datepersian() throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "datepersian", false))
	 {return ((String) Debug.delegate(processBA, "datepersian", null));}
String[] _t = null;
RDebugUtils.currentLine=117440512;
 //BA.debugLineNum = 117440512;BA.debugLine="Sub DatePersian As String";
RDebugUtils.currentLine=117440513;
 //BA.debugLineNum = 117440513;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=117440514;
 //BA.debugLineNum = 117440514;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",_persiandate.getDate((int) (0),(int) (0),(int) (0),"/"));
RDebugUtils.currentLine=117440515;
 //BA.debugLineNum = 117440515;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=117440516;
 //BA.debugLineNum = 117440516;BA.debugLine="T(1)=\"0\"&T(1)";
_t[(int) (1)] = "0"+_t[(int) (1)];
 };
RDebugUtils.currentLine=117440518;
 //BA.debugLineNum = 117440518;BA.debugLine="If T(2).Length=1 Then";
if (_t[(int) (2)].length()==1) { 
RDebugUtils.currentLine=117440519;
 //BA.debugLineNum = 117440519;BA.debugLine="T(2)=\"0\"&T(2)";
_t[(int) (2)] = "0"+_t[(int) (2)];
 };
RDebugUtils.currentLine=117440521;
 //BA.debugLineNum = 117440521;BA.debugLine="Return T(0)&T(1)&T(2)";
if (true) return _t[(int) (0)]+_t[(int) (1)]+_t[(int) (2)];
RDebugUtils.currentLine=117440522;
 //BA.debugLineNum = 117440522;BA.debugLine="End Sub";
return "";
}
public static String  _datepersian2() throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "datepersian2", false))
	 {return ((String) Debug.delegate(processBA, "datepersian2", null));}
String[] _t = null;
RDebugUtils.currentLine=117374976;
 //BA.debugLineNum = 117374976;BA.debugLine="Sub DatePersian2 As String";
RDebugUtils.currentLine=117374977;
 //BA.debugLineNum = 117374977;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=117374978;
 //BA.debugLineNum = 117374978;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",_persiandate.getDate((int) (0),(int) (0),(int) (0),"/"));
RDebugUtils.currentLine=117374979;
 //BA.debugLineNum = 117374979;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=117374980;
 //BA.debugLineNum = 117374980;BA.debugLine="T(1)=\"0\"&T(1)";
_t[(int) (1)] = "0"+_t[(int) (1)];
 };
RDebugUtils.currentLine=117374982;
 //BA.debugLineNum = 117374982;BA.debugLine="If T(2).Length=1 Then";
if (_t[(int) (2)].length()==1) { 
RDebugUtils.currentLine=117374983;
 //BA.debugLineNum = 117374983;BA.debugLine="T(2)=\"0\"&T(2)";
_t[(int) (2)] = "0"+_t[(int) (2)];
 };
RDebugUtils.currentLine=117374985;
 //BA.debugLineNum = 117374985;BA.debugLine="Return T(1)&T(2)";
if (true) return _t[(int) (1)]+_t[(int) (2)];
RDebugUtils.currentLine=117374986;
 //BA.debugLineNum = 117374986;BA.debugLine="End Sub";
return "";
}
public static String  _dttojson(anywheresoftware.b4a.sql.SQL.CursorWrapper _cu) throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "dttojson", false))
	 {return ((String) Debug.delegate(processBA, "dttojson", new Object[] {_cu}));}
String _olgoo = "";
String _rowolgoo = "";
String _str = "";
int _i = 0;
int _j = 0;
RDebugUtils.currentLine=117637120;
 //BA.debugLineNum = 117637120;BA.debugLine="Sub DtToJson(Cu As Cursor) As String";
RDebugUtils.currentLine=117637121;
 //BA.debugLineNum = 117637121;BA.debugLine="Dim Olgoo As String";
_olgoo = "";
RDebugUtils.currentLine=117637122;
 //BA.debugLineNum = 117637122;BA.debugLine="Dim RowOlgoo As String";
_rowolgoo = "";
RDebugUtils.currentLine=117637123;
 //BA.debugLineNum = 117637123;BA.debugLine="Dim Str As String";
_str = "";
RDebugUtils.currentLine=117637124;
 //BA.debugLineNum = 117637124;BA.debugLine="For i=0 To Cu.ColumnCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_cu.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=117637125;
 //BA.debugLineNum = 117637125;BA.debugLine="Olgoo=Olgoo & Chr(34) & Cu.GetColumnName(i) & Ch";
_olgoo = _olgoo+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+_cu.GetColumnName(_i)+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+":"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+_cu.GetColumnName(_i)+BA.NumberToString(_i)+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+",";
 }
};
RDebugUtils.currentLine=117637127;
 //BA.debugLineNum = 117637127;BA.debugLine="Olgoo=Sf.Left(Olgoo,Olgoo.Length-1)";
_olgoo = _sf._vv0(_olgoo,(long) (_olgoo.length()-1));
RDebugUtils.currentLine=117637128;
 //BA.debugLineNum = 117637128;BA.debugLine="Olgoo = \"{\" & Olgoo & \"}\" & \",\"";
_olgoo = "{"+_olgoo+"}"+",";
RDebugUtils.currentLine=117637129;
 //BA.debugLineNum = 117637129;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step9 = 1;
final int limit9 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=117637130;
 //BA.debugLineNum = 117637130;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=117637131;
 //BA.debugLineNum = 117637131;BA.debugLine="RowOlgoo=Olgoo";
_rowolgoo = _olgoo;
RDebugUtils.currentLine=117637132;
 //BA.debugLineNum = 117637132;BA.debugLine="For j=0 To Cu.ColumnCount-1";
{
final int step12 = 1;
final int limit12 = (int) (_cu.getColumnCount()-1);
_j = (int) (0) ;
for (;_j <= limit12 ;_j = _j + step12 ) {
RDebugUtils.currentLine=117637133;
 //BA.debugLineNum = 117637133;BA.debugLine="If Cu.GetString2(j)<> Null Then";
if (_cu.GetString2(_j)!= null) { 
RDebugUtils.currentLine=117637134;
 //BA.debugLineNum = 117637134;BA.debugLine="RowOlgoo = RowOlgoo.Replace(Cu.GetColumnName(j";
_rowolgoo = _rowolgoo.replace(_cu.GetColumnName(_j)+BA.NumberToString(_j),_cu.GetString2(_j));
 };
 }
};
RDebugUtils.currentLine=117637138;
 //BA.debugLineNum = 117637138;BA.debugLine="Str=Str & RowOlgoo";
_str = _str+_rowolgoo;
 }
};
RDebugUtils.currentLine=117637140;
 //BA.debugLineNum = 117637140;BA.debugLine="Str=Sf.Left(Str,Str.Length-1)";
_str = _sf._vv0(_str,(long) (_str.length()-1));
RDebugUtils.currentLine=117637141;
 //BA.debugLineNum = 117637141;BA.debugLine="Str=\"[\" & Str & \"]\"";
_str = "["+_str+"]";
RDebugUtils.currentLine=117637142;
 //BA.debugLineNum = 117637142;BA.debugLine="File.WriteString(File.DirDefaultExternal, \"1.txt\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"1.txt",_str);
RDebugUtils.currentLine=117637143;
 //BA.debugLineNum = 117637143;BA.debugLine="Return Str";
if (true) return _str;
RDebugUtils.currentLine=117637144;
 //BA.debugLineNum = 117637144;BA.debugLine="End Sub";
return "";
}
public static String  _geolocation_location(boolean _success,double _lattitude,double _longitude,String _info,boolean _ismocklocation) throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "geolocation_location", false))
	 {return ((String) Debug.delegate(processBA, "geolocation_location", new Object[] {_success,_lattitude,_longitude,_info,_ismocklocation}));}
RDebugUtils.currentLine=117112832;
 //BA.debugLineNum = 117112832;BA.debugLine="Sub GeoLocation_Location(success As Boolean, Latti";
RDebugUtils.currentLine=117112833;
 //BA.debugLineNum = 117112833;BA.debugLine="Log($\"GeoLocation_Location(${success}, ${Lattitud";
anywheresoftware.b4a.keywords.Common.LogImpl("5117112833",("GeoLocation_Location("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_success))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lattitude))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_longitude))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_info))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ismocklocation))+")"),0);
RDebugUtils.currentLine=117112834;
 //BA.debugLineNum = 117112834;BA.debugLine="If success Then";
if (_success) { 
RDebugUtils.currentLine=117112836;
 //BA.debugLineNum = 117112836;BA.debugLine="Log(Lattitude)";
anywheresoftware.b4a.keywords.Common.LogImpl("5117112836",BA.NumberToString(_lattitude),0);
RDebugUtils.currentLine=117112837;
 //BA.debugLineNum = 117112837;BA.debugLine="Log(Longitude)";
anywheresoftware.b4a.keywords.Common.LogImpl("5117112837",BA.NumberToString(_longitude),0);
RDebugUtils.currentLine=117112838;
 //BA.debugLineNum = 117112838;BA.debugLine="Lat=Lattitude";
_lat = BA.NumberToString(_lattitude);
RDebugUtils.currentLine=117112839;
 //BA.debugLineNum = 117112839;BA.debugLine="Lon=Longitude";
_lon = BA.NumberToString(_longitude);
 };
RDebugUtils.currentLine=117112846;
 //BA.debugLineNum = 117112846;BA.debugLine="End Sub";
return "";
}
public static String  _interval() throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "interval", false))
	 {return ((String) Debug.delegate(processBA, "interval", null));}
RDebugUtils.currentLine=117768192;
 //BA.debugLineNum = 117768192;BA.debugLine="Sub Interval As String";
RDebugUtils.currentLine=117768193;
 //BA.debugLineNum = 117768193;BA.debugLine="Return MCode.IntervalGps * 60 * 1000";
if (true) return BA.NumberToString(mostCurrent._mcode._intervalgps /*int*/ *60*1000);
RDebugUtils.currentLine=117768194;
 //BA.debugLineNum = 117768194;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "jobdone", false))
	 {return ((String) Debug.delegate(processBA, "jobdone", new Object[] {_job}));}
String _str = "";
RDebugUtils.currentLine=118030336;
 //BA.debugLineNum = 118030336;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=118030337;
 //BA.debugLineNum = 118030337;BA.debugLine="Job.GetRequest.Timeout=50000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=118030339;
 //BA.debugLineNum = 118030339;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=118030340;
 //BA.debugLineNum = 118030340;BA.debugLine="Dim Str As String = Job.GetString";
_str = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=118030341;
 //BA.debugLineNum = 118030341;BA.debugLine="Select Case Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"SendGps")) {
case 0: {
RDebugUtils.currentLine=118030343;
 //BA.debugLineNum = 118030343;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=118030346;
 //BA.debugLineNum = 118030346;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGpsVisitor\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGpsVisitor");
RDebugUtils.currentLine=118030347;
 //BA.debugLineNum = 118030347;BA.debugLine="Log(\"GPS OK\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5118030347","GPS OK",0);
 };
 break; }
}
;
 }else {
 };
RDebugUtils.currentLine=118030354;
 //BA.debugLineNum = 118030354;BA.debugLine="jobInternet.Release";
_jobinternet._release /*String*/ (null);
RDebugUtils.currentLine=118030355;
 //BA.debugLineNum = 118030355;BA.debugLine="End Sub";
return "";
}
public static String  _savelocationtodb() throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "savelocationtodb", false))
	 {return ((String) Debug.delegate(processBA, "savelocationtodb", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _tarikh = "";
String[] _tm = null;
String _time = "";
RDebugUtils.currentLine=117899264;
 //BA.debugLineNum = 117899264;BA.debugLine="Sub SaveLocationToDb";
RDebugUtils.currentLine=117899265;
 //BA.debugLineNum = 117899265;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldNoeDat";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldNoeDate From TblSetting");
RDebugUtils.currentLine=117899266;
 //BA.debugLineNum = 117899266;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=117899267;
 //BA.debugLineNum = 117899267;BA.debugLine="If Cu.GetString(\"FldNoeDate\") = \"S\" Then";
if ((_cu.GetString("FldNoeDate")).equals("S")) { 
RDebugUtils.currentLine=117899268;
 //BA.debugLineNum = 117899268;BA.debugLine="Dim Tarikh As String = DatePersian";
_tarikh = _datepersian();
 }else 
{RDebugUtils.currentLine=117899269;
 //BA.debugLineNum = 117899269;BA.debugLine="else if Cu.GetString(\"FldNoeDate\") = \"M\" Then";
if ((_cu.GetString("FldNoeDate")).equals("M")) { 
RDebugUtils.currentLine=117899270;
 //BA.debugLineNum = 117899270;BA.debugLine="Dim Tarikh As String = DateMiladi";
_tarikh = _datemiladi();
 }}
;
RDebugUtils.currentLine=117899273;
 //BA.debugLineNum = 117899273;BA.debugLine="Dim Tm() As String";
_tm = new String[(int) (0)];
java.util.Arrays.fill(_tm,"");
RDebugUtils.currentLine=117899274;
 //BA.debugLineNum = 117899274;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=117899275;
 //BA.debugLineNum = 117899275;BA.debugLine="Tm = Regex.Split(\":\",Time)";
_tm = anywheresoftware.b4a.keywords.Common.Regex.Split(":",_time);
RDebugUtils.currentLine=117899276;
 //BA.debugLineNum = 117899276;BA.debugLine="Time=MCode.ConvertNumbersPersian2English(Tm(0)) &";
_time = mostCurrent._mcode._convertnumberspersian2english /*String*/ (processBA,_tm[(int) (0)])+mostCurrent._mcode._convertnumberspersian2english /*String*/ (processBA,_tm[(int) (1)]);
RDebugUtils.currentLine=117899279;
 //BA.debugLineNum = 117899279;BA.debugLine="Log(Lat)";
anywheresoftware.b4a.keywords.Common.LogImpl("5117899279",_lat,0);
RDebugUtils.currentLine=117899280;
 //BA.debugLineNum = 117899280;BA.debugLine="Log(Lon)";
anywheresoftware.b4a.keywords.Common.LogImpl("5117899280",_lon,0);
RDebugUtils.currentLine=117899281;
 //BA.debugLineNum = 117899281;BA.debugLine="If Lat <> \"\" And Lon <> \"\" And IsNumber(MCode.C_V";
if ((_lat).equals("") == false && (_lon).equals("") == false && anywheresoftware.b4a.keywords.Common.IsNumber(mostCurrent._mcode._c_visitor /*String*/ )==anywheresoftware.b4a.keywords.Common.True && anywheresoftware.b4a.keywords.Common.IsNumber(_tarikh)==anywheresoftware.b4a.keywords.Common.True && anywheresoftware.b4a.keywords.Common.IsNumber(_time)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=117899282;
 //BA.debugLineNum = 117899282;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGpsVisitor (Fld";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"+mostCurrent._mcode._c_visitor /*String*/ +"','"+_tarikh+"','"+_time+"','"+_lat+"','"+_lon+"')");
RDebugUtils.currentLine=117899283;
 //BA.debugLineNum = 117899283;BA.debugLine="GetTime=DateTime.Time(DateTime.Now)";
_gettime = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 };
RDebugUtils.currentLine=117899285;
 //BA.debugLineNum = 117899285;BA.debugLine="Lat=\"\"";
_lat = "";
RDebugUtils.currentLine=117899286;
 //BA.debugLineNum = 117899286;BA.debugLine="Lon=\"\"";
_lon = "";
RDebugUtils.currentLine=117899288;
 //BA.debugLineNum = 117899288;BA.debugLine="End Sub";
return "";
}
public static String  _sendgps(String _str) throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "sendgps", false))
	 {return ((String) Debug.delegate(processBA, "sendgps", new Object[] {_str}));}
RDebugUtils.currentLine=117964800;
 //BA.debugLineNum = 117964800;BA.debugLine="Sub SendGps(Str As String)";
RDebugUtils.currentLine=117964801;
 //BA.debugLineNum = 117964801;BA.debugLine="jobInternet.JobName =\"SendGps\"";
_jobinternet._jobname /*String*/  = "SendGps";
RDebugUtils.currentLine=117964802;
 //BA.debugLineNum = 117964802;BA.debugLine="jobInternet.PostString(\"https://\" & MCode.Url & \"";
_jobinternet._poststring /*String*/ (null,"https://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveGps","JsonDt="+_str+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=117964803;
 //BA.debugLineNum = 117964803;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
int _intervalgps = 0;
RDebugUtils.currentLine=117178368;
 //BA.debugLineNum = 117178368;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=117178370;
 //BA.debugLineNum = 117178370;BA.debugLine="Try";
try {RDebugUtils.currentLine=117178373;
 //BA.debugLineNum = 117178373;BA.debugLine="GeoLoc.Initialize(\"GeoLocation\")";
_geoloc.Initialize(processBA,"GeoLocation");
RDebugUtils.currentLine=117178374;
 //BA.debugLineNum = 117178374;BA.debugLine="GPS1.Initialize(\"GPS1\")";
_gps1.Initialize("GPS1");
RDebugUtils.currentLine=117178375;
 //BA.debugLineNum = 117178375;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
_jobinternet._initialize /*String*/ (null,processBA,"jobInternet",geoservice.getObject());
RDebugUtils.currentLine=117178376;
 //BA.debugLineNum = 117178376;BA.debugLine="T_StartStopGps.Initialize(\"T_StartStopGps\",6000)";
_t_startstopgps.Initialize(processBA,"T_StartStopGps",(long) (6000));
RDebugUtils.currentLine=117178377;
 //BA.debugLineNum = 117178377;BA.debugLine="If	MCode.ServiceGpsActive=1 Then";
if (mostCurrent._mcode._servicegpsactive /*int*/ ==1) { 
RDebugUtils.currentLine=117178378;
 //BA.debugLineNum = 117178378;BA.debugLine="MCode.UpdateSetting";
mostCurrent._mcode._updatesetting /*String*/ (processBA);
RDebugUtils.currentLine=117178380;
 //BA.debugLineNum = 117178380;BA.debugLine="lock.PartialLock";
_lock.PartialLock(processBA);
RDebugUtils.currentLine=117178381;
 //BA.debugLineNum = 117178381;BA.debugLine="If GPS1.GPSEnabled=True Then";
if (_gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=117178382;
 //BA.debugLineNum = 117178382;BA.debugLine="T_Gps.Initialize(\"T_Gps\",Interval)";
_t_gps.Initialize(processBA,"T_Gps",(long)(Double.parseDouble(_interval())));
RDebugUtils.currentLine=117178383;
 //BA.debugLineNum = 117178383;BA.debugLine="Dim intervalGps As Int";
_intervalgps = 0;
RDebugUtils.currentLine=117178384;
 //BA.debugLineNum = 117178384;BA.debugLine="If Interval>0 Then";
if ((double)(Double.parseDouble(_interval()))>0) { 
RDebugUtils.currentLine=117178385;
 //BA.debugLineNum = 117178385;BA.debugLine="intervalGps= Interval";
_intervalgps = (int)(Double.parseDouble(_interval()));
 }else {
RDebugUtils.currentLine=117178387;
 //BA.debugLineNum = 117178387;BA.debugLine="intervalGps=6000";
_intervalgps = (int) (6000);
 };
 }else {
RDebugUtils.currentLine=117178391;
 //BA.debugLineNum = 117178391;BA.debugLine="If MCode.Gps=1 Then";
if ((mostCurrent._mcode._gps /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=117178392;
 //BA.debugLineNum = 117178392;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال ک";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=117178393;
 //BA.debugLineNum = 117178393;BA.debugLine="StartActivity(GPS1.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_gps1.getLocationSettingsIntent()));
 };
 };
 };
 } 
       catch (Exception e25) {
			processBA.setLastException(e25);RDebugUtils.currentLine=117178399;
 //BA.debugLineNum = 117178399;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5117178399",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=117178401;
 //BA.debugLineNum = 117178401;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=117309440;
 //BA.debugLineNum = 117309440;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=117309441;
 //BA.debugLineNum = 117309441;BA.debugLine="StartServiceAt(Me, DateTime.Now + 3 * 1000, False";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,geoservice.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+3*1000),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=117309442;
 //BA.debugLineNum = 117309442;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=117243904;
 //BA.debugLineNum = 117243904;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=117243905;
 //BA.debugLineNum = 117243905;BA.debugLine="If PermissionOK  Then";
if (_permissionok) { 
RDebugUtils.currentLine=117243907;
 //BA.debugLineNum = 117243907;BA.debugLine="StartServiceAt(Me,DateTime.Now + 3000,False)";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,geoservice.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+3000),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=117243908;
 //BA.debugLineNum = 117243908;BA.debugLine="T_StartStopGps.Enabled=True";
_t_startstopgps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=117243909;
 //BA.debugLineNum = 117243909;BA.debugLine="T_Gps.Enabled=True";
_t_gps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=117243912;
 //BA.debugLineNum = 117243912;BA.debugLine="Service.AutomaticForegroundMode=Service.AUTOMATIC";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_ALWAYS;
RDebugUtils.currentLine=117243914;
 //BA.debugLineNum = 117243914;BA.debugLine="End Sub";
return "";
}
public static String  _t_gps_tick() throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "t_gps_tick", false))
	 {return ((String) Debug.delegate(processBA, "t_gps_tick", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=117833728;
 //BA.debugLineNum = 117833728;BA.debugLine="Sub T_Gps_Tick";
RDebugUtils.currentLine=117833729;
 //BA.debugLineNum = 117833729;BA.debugLine="Try";
try {RDebugUtils.currentLine=117833730;
 //BA.debugLineNum = 117833730;BA.debugLine="SaveLocationToDb";
_savelocationtodb();
RDebugUtils.currentLine=117833732;
 //BA.debugLineNum = 117833732;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldVisit";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldVisitor,FldTarikh,FldTime,FldLat,FldLon From TblGpsVisitor");
RDebugUtils.currentLine=117833733;
 //BA.debugLineNum = 117833733;BA.debugLine="If Cu.RowCount > 0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=117833734;
 //BA.debugLineNum = 117833734;BA.debugLine="SendGps(DtToJson(Cu))";
_sendgps(_dttojson(_cu));
 };
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=117833737;
 //BA.debugLineNum = 117833737;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5117833737",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=117833739;
 //BA.debugLineNum = 117833739;BA.debugLine="End Sub";
return "";
}
public static String  _t_startstopgps_tick() throws Exception{
RDebugUtils.currentModule="geoservice";
if (Debug.shouldDelegate(processBA, "t_startstopgps_tick", false))
	 {return ((String) Debug.delegate(processBA, "t_startstopgps_tick", null));}
RDebugUtils.currentLine=117702656;
 //BA.debugLineNum = 117702656;BA.debugLine="Sub T_StartStopGps_Tick";
RDebugUtils.currentLine=117702657;
 //BA.debugLineNum = 117702657;BA.debugLine="Try";
try {RDebugUtils.currentLine=117702658;
 //BA.debugLineNum = 117702658;BA.debugLine="If GPS1.GPSEnabled = True Then";
if (_gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=117702659;
 //BA.debugLineNum = 117702659;BA.debugLine="GeoLoc.GetLocation";
_geoloc.GetLocation(processBA);
 }else {
RDebugUtils.currentLine=117702661;
 //BA.debugLineNum = 117702661;BA.debugLine="If MCode.Gps=1 Then";
if ((mostCurrent._mcode._gps /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=117702662;
 //BA.debugLineNum = 117702662;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کن";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=117702663;
 //BA.debugLineNum = 117702663;BA.debugLine="StartActivity(GPS1.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_gps1.getLocationSettingsIntent()));
 };
 };
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=117702668;
 //BA.debugLineNum = 117702668;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5117702668",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=117702670;
 //BA.debugLineNum = 117702670;BA.debugLine="End Sub";
return "";
}
}