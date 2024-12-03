package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class fusedlocationservice extends android.app.Service{
	public static class fusedlocationservice_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (fusedlocationservice) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, fusedlocationservice.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static fusedlocationservice mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return fusedlocationservice.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.fusedlocationservice");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.fusedlocationservice", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (fusedlocationservice) Create ***");
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
                    BA.LogInfo("** Service (fusedlocationservice) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (fusedlocationservice) Start **");
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
        BA.LogInfo("** Service (fusedlocationservice) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (fusedlocationservice) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (fusedlocationservice) Destroy **");
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
public static igolub.fused.b4a.location.FusedLocationProviderClientWrapper _fused = null;
public static ir.parsikhesab.pakhsh.httpjob _jobinternet = null;
public static anywheresoftware.b4a.objects.Timer _tgps = null;
public static anywheresoftware.b4a.objects.Timer _t_startstopgps = null;
public static boolean _tracking = false;
public static String _gettime = "";
public static String _lat = "";
public static String _lon = "";
public static int _nid = 0;
public static long _inc = 0L;
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
public static anywheresoftware.b4a.objects.NotificationWrapper  _createnotification(String _body) throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "createnotification", false))
	 {return ((anywheresoftware.b4a.objects.NotificationWrapper) Debug.delegate(processBA, "createnotification", new Object[] {_body}));}
anywheresoftware.b4a.objects.NotificationWrapper _notification = null;
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Sub CreateNotification (Body As String) As Notific";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Dim notification As Notification";
_notification = new anywheresoftware.b4a.objects.NotificationWrapper();
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="notification.Initialize2(notification.IMPORTANCE_";
_notification.Initialize2(_notification.IMPORTANCE_LOW);
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="notification.Icon = \"icon\"";
_notification.setIcon("icon");
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="notification.Sound=False";
_notification.setSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="notification.Vibrate=False";
_notification.setVibrate(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="notification.SetInfo(\"Tracking location\", Body, M";
_notification.SetInfoNew(processBA,BA.ObjectToCharSequence("Tracking location"),BA.ObjectToCharSequence(_body),(Object)(mostCurrent._main.getObject()));
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="Return notification";
if (true) return _notification;
RDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="End Sub";
return null;
}
public static String  _definefused() throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "definefused", false))
	 {return ((String) Debug.delegate(processBA, "definefused", null));}
igolub.fused.b4a.location.LocationRequestWrapper _locationrequest1 = null;
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Private Sub DefineFused";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="If Fused.IsLocationEnabledInSettings Then";
if (_fused.getIsLocationEnabledInSettings()) { 
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="Fused.GetLocationAvailability";
_fused.GetLocationAvailability();
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="inc=Interval";
_inc = (long)(Double.parseDouble(_interval()));
RDebugUtils.currentLine=21364758;
 //BA.debugLineNum = 21364758;BA.debugLine="Dim LocationRequest1 As LocationRequest";
_locationrequest1 = new igolub.fused.b4a.location.LocationRequestWrapper();
RDebugUtils.currentLine=21364759;
 //BA.debugLineNum = 21364759;BA.debugLine="LocationRequest1.Initialize(inc) 'Refresh interv";
_locationrequest1.Initialize(_inc);
RDebugUtils.currentLine=21364760;
 //BA.debugLineNum = 21364760;BA.debugLine="LocationRequest1.SetMinUpdateIntervalMillis(inc)";
_locationrequest1.SetMinUpdateIntervalMillis(_inc);
RDebugUtils.currentLine=21364761;
 //BA.debugLineNum = 21364761;BA.debugLine="LocationRequest1.SetPriority(Priority.PRIORITY_H";
_locationrequest1.SetPriority(mostCurrent._priority.PRIORITY_HIGH_ACCURACY);
RDebugUtils.currentLine=21364762;
 //BA.debugLineNum = 21364762;BA.debugLine="LocationRequest1.SetMinUpdateDistanceMeters(0) '";
_locationrequest1.SetMinUpdateDistanceMeters((float) (0));
RDebugUtils.currentLine=21364763;
 //BA.debugLineNum = 21364763;BA.debugLine="LocationRequest1.SetGranularity(Granularity.GRAN";
_locationrequest1.SetGranularity(mostCurrent._granularity.GRANULARITY_FINE);
RDebugUtils.currentLine=21364764;
 //BA.debugLineNum = 21364764;BA.debugLine="Fused.RequestLocationUpdates(LocationRequest1) '";
_fused.RequestLocationUpdates(_locationrequest1);
 }else {
RDebugUtils.currentLine=21364766;
 //BA.debugLineNum = 21364766;BA.debugLine="MsgboxAsync(\"Location is turned off in devices's";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Location is turned off in devices's settings. Turn it on."),BA.ObjectToCharSequence("Warning"),processBA);
RDebugUtils.currentLine=21364767;
 //BA.debugLineNum = 21364767;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_fused.getLocationSettingsIntent().getObject()));
 };
RDebugUtils.currentLine=21364769;
 //BA.debugLineNum = 21364769;BA.debugLine="End Sub";
return "";
}
public static String  _interval() throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "interval", false))
	 {return ((String) Debug.delegate(processBA, "interval", null));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub Interval As String";
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="Return MCode.IntervalGps * 60 * 1000";
if (true) return BA.NumberToString(mostCurrent._mcode._intervalgps /*int*/ *60*1000);
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="End Sub";
return "";
}
public static String  _fusedlocation_locationavailabilitychanged(boolean _available) throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "fusedlocation_locationavailabilitychanged", false))
	 {return ((String) Debug.delegate(processBA, "fusedlocation_locationavailabilitychanged", new Object[] {_available}));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Private Sub FusedLocation_LocationAvailabilityChan";
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Log(\"LocationAvailabile = \" & Available)";
anywheresoftware.b4a.keywords.Common.LogImpl("521626883","LocationAvailabile = "+BA.ObjectToString(_available),0);
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="End Sub";
return "";
}
public static String  _fusedlocation_locationchanged(igolub.fused.b4a.location.android.location.LocationFWrapper _mlocation) throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "fusedlocation_locationchanged", false))
	 {return ((String) Debug.delegate(processBA, "fusedlocation_locationchanged", new Object[] {_mlocation}));}
anywheresoftware.b4a.objects.NotificationWrapper _n = null;
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Private Sub FusedLocation_LocationChanged (mLocati";
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="Lat=mLocation.Latitude";
_lat = BA.NumberToString(_mlocation.getLatitude());
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="Lon=mLocation.Longitude";
_lon = BA.NumberToString(_mlocation.getLongitude());
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="Log(\"Lat=\" & Lat & CRLF & \"Lon=\" & Lon)";
anywheresoftware.b4a.keywords.Common.LogImpl("521692422","Lat="+_lat+anywheresoftware.b4a.keywords.Common.CRLF+"Lon="+_lon,0);
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="Dim n As Notification = CreateNotification($\"${La";
_n = new anywheresoftware.b4a.objects.NotificationWrapper();
_n = _createnotification((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lat))+" / "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lon))+""));
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="n.Notify(nid)";
_n.Notify(_nid);
RDebugUtils.currentLine=21692426;
 //BA.debugLineNum = 21692426;BA.debugLine="Tracking=False";
_tracking = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21692429;
 //BA.debugLineNum = 21692429;BA.debugLine="SaveLocationToDb";
_savelocationtodb();
RDebugUtils.currentLine=21692432;
 //BA.debugLineNum = 21692432;BA.debugLine="End Sub";
return "";
}
public static String  _savelocationtodb() throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "savelocationtodb", false))
	 {return ((String) Debug.delegate(processBA, "savelocationtodb", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _tarikh = "";
String[] _tm = null;
String _time = "";
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Sub SaveLocationToDb";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldNoeDat";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldNoeDate From TblSetting");
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="If Cu.GetString(\"FldNoeDate\") = \"S\" Then";
if ((_cu.GetString("FldNoeDate")).equals("S")) { 
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="Dim Tarikh As String = MCode.DatePersian";
_tarikh = mostCurrent._mcode._datepersian /*String*/ (processBA);
 }else 
{RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="else if Cu.GetString(\"FldNoeDate\") = \"M\" Then";
if ((_cu.GetString("FldNoeDate")).equals("M")) { 
RDebugUtils.currentLine=21823494;
 //BA.debugLineNum = 21823494;BA.debugLine="Dim Tarikh As String = MCode.DateMiladi";
_tarikh = mostCurrent._mcode._datemiladi /*String*/ (processBA);
 }}
;
RDebugUtils.currentLine=21823497;
 //BA.debugLineNum = 21823497;BA.debugLine="Dim Tm() As String";
_tm = new String[(int) (0)];
java.util.Arrays.fill(_tm,"");
RDebugUtils.currentLine=21823498;
 //BA.debugLineNum = 21823498;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=21823499;
 //BA.debugLineNum = 21823499;BA.debugLine="Tm = Regex.Split(\":\",Time)";
_tm = anywheresoftware.b4a.keywords.Common.Regex.Split(":",_time);
RDebugUtils.currentLine=21823500;
 //BA.debugLineNum = 21823500;BA.debugLine="Time=MCode.ConvertNumbersPersian2English(Tm(0)) &";
_time = mostCurrent._mcode._convertnumberspersian2english /*String*/ (processBA,_tm[(int) (0)])+mostCurrent._mcode._convertnumberspersian2english /*String*/ (processBA,_tm[(int) (1)]);
RDebugUtils.currentLine=21823503;
 //BA.debugLineNum = 21823503;BA.debugLine="Log(Lat)";
anywheresoftware.b4a.keywords.Common.LogImpl("521823503",_lat,0);
RDebugUtils.currentLine=21823504;
 //BA.debugLineNum = 21823504;BA.debugLine="Log(Lon)";
anywheresoftware.b4a.keywords.Common.LogImpl("521823504",_lon,0);
RDebugUtils.currentLine=21823505;
 //BA.debugLineNum = 21823505;BA.debugLine="If Lat <> \"\" And Lon <> \"\" And IsNumber(MCode.C_V";
if ((_lat).equals("") == false && (_lon).equals("") == false && anywheresoftware.b4a.keywords.Common.IsNumber(mostCurrent._mcode._c_visitor /*String*/ )==anywheresoftware.b4a.keywords.Common.True && anywheresoftware.b4a.keywords.Common.IsNumber(_tarikh)==anywheresoftware.b4a.keywords.Common.True && anywheresoftware.b4a.keywords.Common.IsNumber(_time)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=21823506;
 //BA.debugLineNum = 21823506;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGpsVisitor (Fld";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"+mostCurrent._mcode._c_visitor /*String*/ +"','"+_tarikh+"','"+_time+"','"+_lat+"','"+_lon+"')");
RDebugUtils.currentLine=21823507;
 //BA.debugLineNum = 21823507;BA.debugLine="GetTime=DateTime.Time(DateTime.Now)";
_gettime = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=21823508;
 //BA.debugLineNum = 21823508;BA.debugLine="MCode.fusLat=Lat";
mostCurrent._mcode._fuslat /*String*/  = _lat;
RDebugUtils.currentLine=21823509;
 //BA.debugLineNum = 21823509;BA.debugLine="MCode.fusLon=Lon";
mostCurrent._mcode._fuslon /*String*/  = _lon;
RDebugUtils.currentLine=21823510;
 //BA.debugLineNum = 21823510;BA.debugLine="MCode.fusGetTime=GetTime";
mostCurrent._mcode._fusgettime /*String*/  = _gettime;
 };
RDebugUtils.currentLine=21823512;
 //BA.debugLineNum = 21823512;BA.debugLine="Lat=\"\"";
_lat = "";
RDebugUtils.currentLine=21823513;
 //BA.debugLineNum = 21823513;BA.debugLine="Lon=\"\"";
_lon = "";
RDebugUtils.currentLine=21823515;
 //BA.debugLineNum = 21823515;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblGpsVisitor");
RDebugUtils.currentLine=21823516;
 //BA.debugLineNum = 21823516;BA.debugLine="If Cu.RowCount > 0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=21823517;
 //BA.debugLineNum = 21823517;BA.debugLine="SendGps(MCode.DtToJson(Cu))";
_sendgps(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 };
RDebugUtils.currentLine=21823520;
 //BA.debugLineNum = 21823520;BA.debugLine="End Sub";
return "";
}
public static String  _fusedlocation_locationenabledinsettingschanged(boolean _enabled) throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "fusedlocation_locationenabledinsettingschanged", false))
	 {return ((String) Debug.delegate(processBA, "fusedlocation_locationenabledinsettingschanged", new Object[] {_enabled}));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Private Sub FusedLocation_LocationEnabledInSetting";
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="Log(\"LocationEnabled = \" & Enabled)";
anywheresoftware.b4a.keywords.Common.LogImpl("521757954","LocationEnabled = "+BA.ObjectToString(_enabled),0);
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="If Enabled=False Then";
if (_enabled==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_fused.getLocationSettingsIntent().getObject()));
 };
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="End Sub";
return "";
}
public static String  _getnewgps() throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "getnewgps", false))
	 {return ((String) Debug.delegate(processBA, "getnewgps", null));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Sub GetNewGps()";
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "jobdone", false))
	 {return ((String) Debug.delegate(processBA, "jobdone", new Object[] {_job}));}
String _str = "";
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Job.GetRequest.Timeout=50000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="Dim Str As String = Job.GetString";
_str = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="Select Case Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"SendGps")) {
case 0: {
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=22020106;
 //BA.debugLineNum = 22020106;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGpsVisitor\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGpsVisitor");
RDebugUtils.currentLine=22020107;
 //BA.debugLineNum = 22020107;BA.debugLine="Log(\"GPS OK\")";
anywheresoftware.b4a.keywords.Common.LogImpl("522020107","GPS OK",0);
 };
RDebugUtils.currentLine=22020110;
 //BA.debugLineNum = 22020110;BA.debugLine="tgps.Enabled=True";
_tgps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22020111;
 //BA.debugLineNum = 22020111;BA.debugLine="Tracking=False";
_tracking = anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
 }else {
 };
RDebugUtils.currentLine=22020116;
 //BA.debugLineNum = 22020116;BA.debugLine="jobInternet.Release";
_jobinternet._release /*String*/ (null);
RDebugUtils.currentLine=22020117;
 //BA.debugLineNum = 22020117;BA.debugLine="End Sub";
return "";
}
public static String  _sendgps(String _str) throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "sendgps", false))
	 {return ((String) Debug.delegate(processBA, "sendgps", new Object[] {_str}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Sub SendGps(Str As String)";
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="jobInternet.JobName =\"SendGps\"";
_jobinternet._jobname /*String*/  = "SendGps";
RDebugUtils.currentLine=21954566;
 //BA.debugLineNum = 21954566;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveGps","JsonDt="+_str+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=21954567;
 //BA.debugLineNum = 21954567;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="Try";
try {RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="Fused.Initialize(\"FusedLocation\")";
_fused.Initialize(processBA,"FusedLocation");
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
_jobinternet._initialize /*String*/ (null,processBA,"jobInternet",fusedlocationservice.getObject());
RDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="jobInternet.GetRequest.Timeout=50000";
_jobinternet._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="tgps.Initialize(\"tgps\",60000)";
_tgps.Initialize(processBA,"tgps",(long) (60000));
RDebugUtils.currentLine=21102599;
 //BA.debugLineNum = 21102599;BA.debugLine="Tracking=False";
_tracking = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21102600;
 //BA.debugLineNum = 21102600;BA.debugLine="Log(\"Gps Create\")";
anywheresoftware.b4a.keywords.Common.LogImpl("521102600","Gps Create",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=21102602;
 //BA.debugLineNum = 21102602;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("521102602",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=21102604;
 //BA.debugLineNum = 21102604;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="If Tracking Then";
if (_tracking) { 
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="Fused.RemoveLocationUpdates";
_fused.RemoveLocationUpdates();
 };
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="Tracking = False";
_tracking = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="StartServiceAt(Me,DateTime.Now+1000,True)";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,fusedlocationservice.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+1000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_ALWAYS;
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="Service.StartForeground(nid, CreateNotification(\"";
mostCurrent._service.StartForeground(_nid,(android.app.Notification)(_createnotification("...").getObject()));
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("521168132","Gps Start",0);
RDebugUtils.currentLine=21168133;
 //BA.debugLineNum = 21168133;BA.debugLine="Try";
try {RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="Fused.Initialize(\"FusedLocation\")";
_fused.Initialize(processBA,"FusedLocation");
RDebugUtils.currentLine=21168135;
 //BA.debugLineNum = 21168135;BA.debugLine="If	MCode.ServiceGpsActive=1 Then";
if (mostCurrent._mcode._servicegpsactive /*int*/ ==1) { 
RDebugUtils.currentLine=21168136;
 //BA.debugLineNum = 21168136;BA.debugLine="Log(\"Gps ServiceGpsActive \"& MCode.ServiceGpsAc";
anywheresoftware.b4a.keywords.Common.LogImpl("521168136","Gps ServiceGpsActive "+BA.NumberToString(mostCurrent._mcode._servicegpsactive /*int*/ ),0);
RDebugUtils.currentLine=21168137;
 //BA.debugLineNum = 21168137;BA.debugLine="If Fused.IsLocationEnabledInSettings  Then";
if (_fused.getIsLocationEnabledInSettings()) { 
RDebugUtils.currentLine=21168138;
 //BA.debugLineNum = 21168138;BA.debugLine="Log(\"Gps IsLocationEnabledInSettings\")";
anywheresoftware.b4a.keywords.Common.LogImpl("521168138","Gps IsLocationEnabledInSettings",0);
RDebugUtils.currentLine=21168139;
 //BA.debugLineNum = 21168139;BA.debugLine="Log(\"Gps Tracking: \"&Tracking)";
anywheresoftware.b4a.keywords.Common.LogImpl("521168139","Gps Tracking: "+BA.ObjectToString(_tracking),0);
RDebugUtils.currentLine=21168140;
 //BA.debugLineNum = 21168140;BA.debugLine="If Tracking=False Then";
if (_tracking==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=21168141;
 //BA.debugLineNum = 21168141;BA.debugLine="tgps.Enabled=True";
_tgps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 }else {
RDebugUtils.currentLine=21168144;
 //BA.debugLineNum = 21168144;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کن";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21168145;
 //BA.debugLineNum = 21168145;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_fused.getLocationSettingsIntent().getObject()));
 };
 };
 } 
       catch (Exception e19) {
			processBA.setLastException(e19);RDebugUtils.currentLine=21168149;
 //BA.debugLineNum = 21168149;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("521168149",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=21168152;
 //BA.debugLineNum = 21168152;BA.debugLine="Service.AutomaticForegroundMode= Service.AUTOMATI";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_ALWAYS;
RDebugUtils.currentLine=21168154;
 //BA.debugLineNum = 21168154;BA.debugLine="End Sub";
return "";
}
public static String  _t_startstopgps_tick() throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "t_startstopgps_tick", false))
	 {return ((String) Debug.delegate(processBA, "t_startstopgps_tick", null));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub T_StartStopGps_Tick";
RDebugUtils.currentLine=21430288;
 //BA.debugLineNum = 21430288;BA.debugLine="End Sub";
return "";
}
public static String  _tgps_tick() throws Exception{
RDebugUtils.currentModule="fusedlocationservice";
if (Debug.shouldDelegate(processBA, "tgps_tick", false))
	 {return ((String) Debug.delegate(processBA, "tgps_tick", null));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Sub tgps_Tick";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Tracking=True";
_tracking = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="tgps.Enabled=False";
_tgps.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="DefineFused";
_definefused();
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="Log(\"tgps_Tick\")";
anywheresoftware.b4a.keywords.Common.LogImpl("521299204","tgps_Tick",0);
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="End Sub";
return "";
}
}