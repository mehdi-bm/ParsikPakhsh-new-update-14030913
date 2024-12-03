package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.starter");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
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
                    BA.LogInfo("** Service (starter) Create **");
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
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
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
        BA.LogInfo("** Service (starter) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
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
public static String _sharedfolder = "";
public static String _shared = "";
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static anywheresoftware.b4a.phone.PhoneEvents _phoneevent1 = null;
public static anywheresoftware.b4a.objects.Timer _t1 = null;
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
public ir.parsikhesab.pakhsh.tracker _tracker = null;
public ir.parsikhesab.pakhsh.wiget_service _wiget_service = null;
public ir.parsikhesab.pakhsh.xmlviewex _xmlviewex = null;
public ir.parsikhesab.pakhsh.newinst2 _newinst2 = null;
public ir.parsikhesab.pakhsh.base64encodedecodeimage _base64encodedecodeimage = null;
public ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=121176064;
 //BA.debugLineNum = 121176064;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=121176066;
 //BA.debugLineNum = 121176066;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+3000),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=121176067;
 //BA.debugLineNum = 121176067;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=121176068;
 //BA.debugLineNum = 121176068;BA.debugLine="End Sub";
return false;
}
public static String  _closeactivities() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "closeactivities", false))
	 {return ((String) Debug.delegate(processBA, "closeactivities", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=121307136;
 //BA.debugLineNum = 121307136;BA.debugLine="Sub CloseActivities";
RDebugUtils.currentLine=121307137;
 //BA.debugLineNum = 121307137;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=121307138;
 //BA.debugLineNum = 121307138;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(processBA);
RDebugUtils.currentLine=121307139;
 //BA.debugLineNum = 121307139;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
_jo.RunMethod("finishAffinity",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=121307140;
 //BA.debugLineNum = 121307140;BA.debugLine="End Sub";
return "";
}
public static String  _receiver2_onreceive(String _action,String[] _keys,Object _data) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "receiver2_onreceive", false))
	 {return ((String) Debug.delegate(processBA, "receiver2_onreceive", new Object[] {_action,_keys,_data}));}
RDebugUtils.currentLine=121044992;
 //BA.debugLineNum = 121044992;BA.debugLine="Private Sub receiver2_OnReceive(Action As String,k";
RDebugUtils.currentLine=121044993;
 //BA.debugLineNum = 121044993;BA.debugLine="Log(Action)";
anywheresoftware.b4a.keywords.Common.LogImpl("5121044993",_action,0);
RDebugUtils.currentLine=121044994;
 //BA.debugLineNum = 121044994;BA.debugLine="Log(Data)";
anywheresoftware.b4a.keywords.Common.LogImpl("5121044994",BA.ObjectToString(_data),0);
RDebugUtils.currentLine=121044995;
 //BA.debugLineNum = 121044995;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=120913920;
 //BA.debugLineNum = 120913920;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=120913923;
 //BA.debugLineNum = 120913923;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"shared\")";
_shared = _rp.GetSafeDirDefaultExternal("shared");
RDebugUtils.currentLine=120913924;
 //BA.debugLineNum = 120913924;BA.debugLine="SharedFolder=File.DirInternalCache";
_sharedfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternalCache();
RDebugUtils.currentLine=120913925;
 //BA.debugLineNum = 120913925;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+3000),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=120913927;
 //BA.debugLineNum = 120913927;BA.debugLine="Service.AutomaticForegroundMode=1";
mostCurrent._service.AutomaticForegroundMode = (int) (1);
RDebugUtils.currentLine=120913929;
 //BA.debugLineNum = 120913929;BA.debugLine="StartServiceAt(Service_Helper,DateTime.Now + 1000";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,(Object)(mostCurrent._service_helper.getObject()),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+10000),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=120913931;
 //BA.debugLineNum = 120913931;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=121241600;
 //BA.debugLineNum = 121241600;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=121241602;
 //BA.debugLineNum = 121241602;BA.debugLine="Log(\"شکستن\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5121241602","شکستن",0);
RDebugUtils.currentLine=121241603;
 //BA.debugLineNum = 121241603;BA.debugLine="CloseActivities";
_closeactivities();
RDebugUtils.currentLine=121241604;
 //BA.debugLineNum = 121241604;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+3000),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=121241605;
 //BA.debugLineNum = 121241605;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=120979456;
 //BA.debugLineNum = 120979456;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=120979462;
 //BA.debugLineNum = 120979462;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_taskremoved", false))
	 {return ((String) Debug.delegate(processBA, "service_taskremoved", null));}
RDebugUtils.currentLine=121110528;
 //BA.debugLineNum = 121110528;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=121110530;
 //BA.debugLineNum = 121110530;BA.debugLine="End Sub";
return "";
}
}