package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class tracker extends android.app.Service{
	public static class tracker_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (tracker) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, tracker.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static tracker mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return tracker.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.tracker");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.tracker", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (tracker) Create ***");
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
                    BA.LogInfo("** Service (tracker) Create **");
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
    	BA.LogInfo("** Service (tracker) Start **");
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
        BA.LogInfo("** Service (tracker) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (tracker) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (tracker) Destroy **");
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
public static int _nid = 0;
public static anywheresoftware.b4a.gps.GPS _gps = null;
public static boolean _tracking = false;
public static long _lastupdatetime = 0L;
public static anywheresoftware.b4a.phone.Phone.PhoneWakeState _lock = null;
public static anywheresoftware.b4a.objects.Timer _t_gps = null;
public static anywheresoftware.b4a.objects.Timer _t_startstopgps = null;
public static ir.parsikhesab.pakhsh.httpjob _jobinternet = null;
public static anywheresoftware.b4a.student.PersianDate _persiandate = null;
public static String _gettime = "";
public static String _lat = "";
public static String _lon = "";
public static String _c_visitor = "";
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
public ir.parsikhesab.pakhsh.wiget_service _wiget_service = null;
public ir.parsikhesab.pakhsh.xmlviewex _xmlviewex = null;
public ir.parsikhesab.pakhsh.newinst2 _newinst2 = null;
public ir.parsikhesab.pakhsh.base64encodedecodeimage _base64encodedecodeimage = null;
public ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "gps_locationchanged", false))
	 {return ((String) Debug.delegate(processBA, "gps_locationchanged", new Object[] {_location1}));}
RDebugUtils.currentLine=123731968;
 //BA.debugLineNum = 123731968;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
RDebugUtils.currentLine=123731970;
 //BA.debugLineNum = 123731970;BA.debugLine="Lat=$\"$2.5{Location1.Latitude}\"$";
_lat = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("2.5",(Object)(_location1.getLatitude()))+"");
RDebugUtils.currentLine=123731971;
 //BA.debugLineNum = 123731971;BA.debugLine="Lon=$\"$2.5{Location1.Longitude}\"$";
_lon = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("2.5",(Object)(_location1.getLongitude()))+"");
RDebugUtils.currentLine=123731976;
 //BA.debugLineNum = 123731976;BA.debugLine="Tracking=False";
_tracking = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=123731978;
 //BA.debugLineNum = 123731978;BA.debugLine="End Sub";
return "";
}
public static String  _interval() throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "interval", false))
	 {return ((String) Debug.delegate(processBA, "interval", null));}
RDebugUtils.currentLine=123469824;
 //BA.debugLineNum = 123469824;BA.debugLine="Sub Interval As String";
RDebugUtils.currentLine=123469825;
 //BA.debugLineNum = 123469825;BA.debugLine="Return MCode.IntervalGps * 60 * 1000";
if (true) return BA.NumberToString(mostCurrent._mcode._intervalgps /*int*/ *60*1000);
RDebugUtils.currentLine=123469826;
 //BA.debugLineNum = 123469826;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "jobdone", false))
	 {return ((String) Debug.delegate(processBA, "jobdone", new Object[] {_job}));}
String _str = "";
RDebugUtils.currentLine=123994112;
 //BA.debugLineNum = 123994112;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=123994113;
 //BA.debugLineNum = 123994113;BA.debugLine="Job.GetRequest.Timeout=50000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=123994115;
 //BA.debugLineNum = 123994115;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=123994116;
 //BA.debugLineNum = 123994116;BA.debugLine="Dim Str As String = Job.GetString";
_str = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=123994117;
 //BA.debugLineNum = 123994117;BA.debugLine="Select Case Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"SendGps")) {
case 0: {
RDebugUtils.currentLine=123994119;
 //BA.debugLineNum = 123994119;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=123994122;
 //BA.debugLineNum = 123994122;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGpsVisitor\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGpsVisitor");
RDebugUtils.currentLine=123994123;
 //BA.debugLineNum = 123994123;BA.debugLine="Log(\"GPS OK\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5123994123","GPS OK",0);
 };
 break; }
}
;
 }else {
 };
RDebugUtils.currentLine=123994130;
 //BA.debugLineNum = 123994130;BA.debugLine="jobInternet.Release";
_jobinternet._release /*String*/ (null);
RDebugUtils.currentLine=123994131;
 //BA.debugLineNum = 123994131;BA.debugLine="End Sub";
return "";
}
public static String  _savelocationtodb() throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "savelocationtodb", false))
	 {return ((String) Debug.delegate(processBA, "savelocationtodb", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _tarikh = "";
String[] _tm = null;
String _time = "";
RDebugUtils.currentLine=123863040;
 //BA.debugLineNum = 123863040;BA.debugLine="Sub SaveLocationToDb";
RDebugUtils.currentLine=123863041;
 //BA.debugLineNum = 123863041;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldNoeDat";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldNoeDate From TblSetting");
RDebugUtils.currentLine=123863042;
 //BA.debugLineNum = 123863042;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=123863043;
 //BA.debugLineNum = 123863043;BA.debugLine="If Cu.GetString(\"FldNoeDate\") = \"S\" Then";
if ((_cu.GetString("FldNoeDate")).equals("S")) { 
RDebugUtils.currentLine=123863044;
 //BA.debugLineNum = 123863044;BA.debugLine="Dim Tarikh As String =MCode.DatePersian";
_tarikh = mostCurrent._mcode._datepersian /*String*/ (processBA);
 }else 
{RDebugUtils.currentLine=123863045;
 //BA.debugLineNum = 123863045;BA.debugLine="else if Cu.GetString(\"FldNoeDate\") = \"M\" Then";
if ((_cu.GetString("FldNoeDate")).equals("M")) { 
RDebugUtils.currentLine=123863046;
 //BA.debugLineNum = 123863046;BA.debugLine="Dim Tarikh As String =MCode.DateMiladi";
_tarikh = mostCurrent._mcode._datemiladi /*String*/ (processBA);
 }}
;
RDebugUtils.currentLine=123863049;
 //BA.debugLineNum = 123863049;BA.debugLine="Dim Tm() As String";
_tm = new String[(int) (0)];
java.util.Arrays.fill(_tm,"");
RDebugUtils.currentLine=123863050;
 //BA.debugLineNum = 123863050;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=123863051;
 //BA.debugLineNum = 123863051;BA.debugLine="Tm = Regex.Split(\":\",Time)";
_tm = anywheresoftware.b4a.keywords.Common.Regex.Split(":",_time);
RDebugUtils.currentLine=123863052;
 //BA.debugLineNum = 123863052;BA.debugLine="Time=MCode.ConvertNumbersPersian2English(Tm(0)) &";
_time = mostCurrent._mcode._convertnumberspersian2english /*String*/ (processBA,_tm[(int) (0)])+mostCurrent._mcode._convertnumberspersian2english /*String*/ (processBA,_tm[(int) (1)]);
RDebugUtils.currentLine=123863055;
 //BA.debugLineNum = 123863055;BA.debugLine="Log(Lat)";
anywheresoftware.b4a.keywords.Common.LogImpl("5123863055",_lat,0);
RDebugUtils.currentLine=123863056;
 //BA.debugLineNum = 123863056;BA.debugLine="If Lat <> \"\" And Lon <> \"\" And IsNumber(C_Visitor";
if ((_lat).equals("") == false && (_lon).equals("") == false && anywheresoftware.b4a.keywords.Common.IsNumber(_c_visitor)==anywheresoftware.b4a.keywords.Common.True && anywheresoftware.b4a.keywords.Common.IsNumber(_tarikh)==anywheresoftware.b4a.keywords.Common.True && anywheresoftware.b4a.keywords.Common.IsNumber(_time)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=123863057;
 //BA.debugLineNum = 123863057;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGpsVisitor (Fld";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"+_c_visitor+"','"+_tarikh+"','"+_time+"','"+_lat+"','"+_lon+"')");
RDebugUtils.currentLine=123863058;
 //BA.debugLineNum = 123863058;BA.debugLine="GetTime=DateTime.Time(DateTime.Now)";
_gettime = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 };
RDebugUtils.currentLine=123863060;
 //BA.debugLineNum = 123863060;BA.debugLine="Lat=\"\"";
_lat = "";
RDebugUtils.currentLine=123863061;
 //BA.debugLineNum = 123863061;BA.debugLine="Lon=\"\"";
_lon = "";
RDebugUtils.currentLine=123863063;
 //BA.debugLineNum = 123863063;BA.debugLine="End Sub";
return "";
}
public static String  _sendgps(String _str) throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "sendgps", false))
	 {return ((String) Debug.delegate(processBA, "sendgps", new Object[] {_str}));}
RDebugUtils.currentLine=123928576;
 //BA.debugLineNum = 123928576;BA.debugLine="Sub SendGps(Str As String)";
RDebugUtils.currentLine=123928581;
 //BA.debugLineNum = 123928581;BA.debugLine="jobInternet.JobName =\"SendGps\"";
_jobinternet._jobname /*String*/  = "SendGps";
RDebugUtils.currentLine=123928582;
 //BA.debugLineNum = 123928582;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveGps","JsonDt="+_str+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=123928583;
 //BA.debugLineNum = 123928583;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=123404288;
 //BA.debugLineNum = 123404288;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=123404290;
 //BA.debugLineNum = 123404290;BA.debugLine="GPS.Initialize(\"gps\")";
_gps.Initialize("gps");
RDebugUtils.currentLine=123404291;
 //BA.debugLineNum = 123404291;BA.debugLine="T_Gps.Initialize(\"T_Gps\",60000)";
_t_gps.Initialize(processBA,"T_Gps",(long) (60000));
RDebugUtils.currentLine=123404292;
 //BA.debugLineNum = 123404292;BA.debugLine="T_StartStopGps.Initialize(\"T_StartStopGps\",Interv";
_t_startstopgps.Initialize(processBA,"T_StartStopGps",(long)(Double.parseDouble(_interval())));
RDebugUtils.currentLine=123404293;
 //BA.debugLineNum = 123404293;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
_jobinternet._initialize /*String*/ (null,processBA,"jobInternet",tracker.getObject());
RDebugUtils.currentLine=123404294;
 //BA.debugLineNum = 123404294;BA.debugLine="lock.PartialLock";
_lock.PartialLock(processBA);
RDebugUtils.currentLine=123404295;
 //BA.debugLineNum = 123404295;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=124059648;
 //BA.debugLineNum = 124059648;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=124059649;
 //BA.debugLineNum = 124059649;BA.debugLine="If Tracking Then";
if (_tracking) { 
RDebugUtils.currentLine=124059650;
 //BA.debugLineNum = 124059650;BA.debugLine="GPS.Stop";
_gps.Stop();
 };
RDebugUtils.currentLine=124059652;
 //BA.debugLineNum = 124059652;BA.debugLine="Tracking = False";
_tracking = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=124059653;
 //BA.debugLineNum = 124059653;BA.debugLine="lock.ReleasePartialLock";
_lock.ReleasePartialLock();
RDebugUtils.currentLine=124059654;
 //BA.debugLineNum = 124059654;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_ALWAYS;
RDebugUtils.currentLine=124059655;
 //BA.debugLineNum = 124059655;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=123535360;
 //BA.debugLineNum = 123535360;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=123535362;
 //BA.debugLineNum = 123535362;BA.debugLine="If MCode.Gps=1 Then";
if ((mostCurrent._mcode._gps /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=123535363;
 //BA.debugLineNum = 123535363;BA.debugLine="Track";
_track();
 };
RDebugUtils.currentLine=123535366;
 //BA.debugLineNum = 123535366;BA.debugLine="End Sub";
return "";
}
public static String  _track() throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "track", false))
	 {return ((String) Debug.delegate(processBA, "track", null));}
RDebugUtils.currentLine=123600896;
 //BA.debugLineNum = 123600896;BA.debugLine="Public Sub Track";
RDebugUtils.currentLine=123600897;
 //BA.debugLineNum = 123600897;BA.debugLine="If	MCode.ServiceGpsActive=1 Then";
if (mostCurrent._mcode._servicegpsactive /*int*/ ==1) { 
RDebugUtils.currentLine=123600898;
 //BA.debugLineNum = 123600898;BA.debugLine="If GPS.GPSEnabled=True Then";
if (_gps.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=123600899;
 //BA.debugLineNum = 123600899;BA.debugLine="T_StartStopGps_Tick";
_t_startstopgps_tick();
RDebugUtils.currentLine=123600902;
 //BA.debugLineNum = 123600902;BA.debugLine="C_Visitor = MCode.C_Visitor";
_c_visitor = mostCurrent._mcode._c_visitor /*String*/ ;
RDebugUtils.currentLine=123600904;
 //BA.debugLineNum = 123600904;BA.debugLine="T_StartStopGps.Enabled=True";
_t_startstopgps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=123600905;
 //BA.debugLineNum = 123600905;BA.debugLine="T_Gps.Enabled=True";
_t_gps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=123600907;
 //BA.debugLineNum = 123600907;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کنی";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=123600908;
 //BA.debugLineNum = 123600908;BA.debugLine="StartActivity(GPS.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_gps.getLocationSettingsIntent()));
 };
 }else {
RDebugUtils.currentLine=123600911;
 //BA.debugLineNum = 123600911;BA.debugLine="If GPS.GPSEnabled=True Then";
if (_gps.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=123600912;
 //BA.debugLineNum = 123600912;BA.debugLine="T_StartStopGps_Tick";
_t_startstopgps_tick();
RDebugUtils.currentLine=123600915;
 //BA.debugLineNum = 123600915;BA.debugLine="C_Visitor = MCode.C_Visitor";
_c_visitor = mostCurrent._mcode._c_visitor /*String*/ ;
RDebugUtils.currentLine=123600917;
 //BA.debugLineNum = 123600917;BA.debugLine="T_StartStopGps.Enabled=True";
_t_startstopgps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=123600918;
 //BA.debugLineNum = 123600918;BA.debugLine="T_Gps.Enabled=True";
_t_gps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 };
RDebugUtils.currentLine=123600923;
 //BA.debugLineNum = 123600923;BA.debugLine="End Sub";
return "";
}
public static String  _t_gps_tick() throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "t_gps_tick", false))
	 {return ((String) Debug.delegate(processBA, "t_gps_tick", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=123797504;
 //BA.debugLineNum = 123797504;BA.debugLine="Sub T_Gps_Tick";
RDebugUtils.currentLine=123797505;
 //BA.debugLineNum = 123797505;BA.debugLine="Try";
try {RDebugUtils.currentLine=123797506;
 //BA.debugLineNum = 123797506;BA.debugLine="SaveLocationToDb";
_savelocationtodb();
RDebugUtils.currentLine=123797508;
 //BA.debugLineNum = 123797508;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblGpsVisitor");
RDebugUtils.currentLine=123797509;
 //BA.debugLineNum = 123797509;BA.debugLine="If Cu.RowCount > 0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=123797510;
 //BA.debugLineNum = 123797510;BA.debugLine="SendGps(MCode.DtToJson(Cu))";
_sendgps(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 };
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=123797513;
 //BA.debugLineNum = 123797513;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5123797513",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=123797515;
 //BA.debugLineNum = 123797515;BA.debugLine="End Sub";
return "";
}
public static String  _t_startstopgps_tick() throws Exception{
RDebugUtils.currentModule="tracker";
if (Debug.shouldDelegate(processBA, "t_startstopgps_tick", false))
	 {return ((String) Debug.delegate(processBA, "t_startstopgps_tick", null));}
RDebugUtils.currentLine=123666432;
 //BA.debugLineNum = 123666432;BA.debugLine="Sub T_StartStopGps_Tick";
RDebugUtils.currentLine=123666433;
 //BA.debugLineNum = 123666433;BA.debugLine="Try";
try {RDebugUtils.currentLine=123666434;
 //BA.debugLineNum = 123666434;BA.debugLine="If GPS.GPSEnabled = True Then";
if (_gps.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=123666436;
 //BA.debugLineNum = 123666436;BA.debugLine="If Tracking Then Return";
if (_tracking) { 
if (true) return "";};
RDebugUtils.currentLine=123666437;
 //BA.debugLineNum = 123666437;BA.debugLine="If Starter.rp.Check(Starter.rp.PERMISSION_ACCES";
if (mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .Check(mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_FINE_LOCATION)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=123666438;
 //BA.debugLineNum = 123666438;BA.debugLine="Log(\"No permission\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5123666438","No permission",0);
RDebugUtils.currentLine=123666439;
 //BA.debugLineNum = 123666439;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=123666441;
 //BA.debugLineNum = 123666441;BA.debugLine="GPS.Start(0, 0)";
_gps.Start(processBA,(long) (0),(float) (0));
RDebugUtils.currentLine=123666442;
 //BA.debugLineNum = 123666442;BA.debugLine="Tracking = True";
_tracking = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=123666444;
 //BA.debugLineNum = 123666444;BA.debugLine="GPS.Stop";
_gps.Stop();
 };
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=123666447;
 //BA.debugLineNum = 123666447;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5123666447",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=123666449;
 //BA.debugLineNum = 123666449;BA.debugLine="End Sub";
return "";
}
}