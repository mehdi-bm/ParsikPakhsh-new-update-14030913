package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class newinst2 extends android.app.Service{
	public static class newinst2_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (newinst2) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, newinst2.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static newinst2 mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return newinst2.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.newinst2");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.newinst2", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (newinst2) Create ***");
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
                    BA.LogInfo("** Service (newinst2) Create **");
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
    	BA.LogInfo("** Service (newinst2) Start **");
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
        BA.LogInfo("** Service (newinst2) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (newinst2) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (newinst2) Destroy **");
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
public static String _pkg = "";
public static boolean _svcverbose = false;
public static int _logcolor1 = 0;
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
public ir.parsikhesab.pakhsh.base64encodedecodeimage _base64encodedecodeimage = null;
public ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public static String  _getpackagename() throws Exception{
RDebugUtils.currentModule="newinst2";
if (Debug.shouldDelegate(processBA, "getpackagename", false))
	 {return ((String) Debug.delegate(processBA, "getpackagename", null));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=127664128;
 //BA.debugLineNum = 127664128;BA.debugLine="Sub GetPackageName As String";
RDebugUtils.currentLine=127664129;
 //BA.debugLineNum = 127664129;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=127664130;
 //BA.debugLineNum = 127664130;BA.debugLine="Return r.GetStaticField(\"anywheresoftware.b4a.BA\"";
if (true) return BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=127664131;
 //BA.debugLineNum = 127664131;BA.debugLine="End Sub";
return "";
}
public static String  _myappreload() throws Exception{
RDebugUtils.currentModule="newinst2";
if (Debug.shouldDelegate(processBA, "myappreload", false))
	 {return ((String) Debug.delegate(processBA, "myappreload", null));}
RDebugUtils.currentLine=127729664;
 //BA.debugLineNum = 127729664;BA.debugLine="Sub MyAppReload";
RDebugUtils.currentLine=127729665;
 //BA.debugLineNum = 127729665;BA.debugLine="If svcVerbose Then Log(\"-- AppUpdating.NewInst2:";
if (_svcverbose) { 
anywheresoftware.b4a.keywords.Common.LogImpl("5127729665","-- AppUpdating.NewInst2: processing MyAppReload",0);};
RDebugUtils.currentLine=127729666;
 //BA.debugLineNum = 127729666;BA.debugLine="If IsPaused(\"main\") Then";
if (anywheresoftware.b4a.keywords.Common.IsPaused(processBA,(Object)("main"))) { 
RDebugUtils.currentLine=127729667;
 //BA.debugLineNum = 127729667;BA.debugLine="StartActivity(\"main\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("main"));
 };
RDebugUtils.currentLine=127729671;
 //BA.debugLineNum = 127729671;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="newinst2";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=127467520;
 //BA.debugLineNum = 127467520;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=127467521;
 //BA.debugLineNum = 127467521;BA.debugLine="LogColor(\"---- AppUpdating.newinst2: service crea";
anywheresoftware.b4a.keywords.Common.LogImpl("5127467521","---- AppUpdating.newinst2: service created",_logcolor1);
RDebugUtils.currentLine=127467522;
 //BA.debugLineNum = 127467522;BA.debugLine="pkg = \"\"";
_pkg = "";
RDebugUtils.currentLine=127467523;
 //BA.debugLineNum = 127467523;BA.debugLine="svcVerbose = False";
_svcverbose = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=127467524;
 //BA.debugLineNum = 127467524;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="newinst2";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=127598592;
 //BA.debugLineNum = 127598592;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=127598593;
 //BA.debugLineNum = 127598593;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="newinst2";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=127533056;
 //BA.debugLineNum = 127533056;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=127533057;
 //BA.debugLineNum = 127533057;BA.debugLine="LogColor(\"---- AppUpdating.newinst2: service_star";
anywheresoftware.b4a.keywords.Common.LogImpl("5127533057","---- AppUpdating.newinst2: service_started",_logcolor1);
RDebugUtils.currentLine=127533058;
 //BA.debugLineNum = 127533058;BA.debugLine="If svcVerbose Then";
if (_svcverbose) { 
RDebugUtils.currentLine=127533059;
 //BA.debugLineNum = 127533059;BA.debugLine="Log($\"${TAB}intent: ${StartingIntent}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("5127533059",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+"intent: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_startingintent.getObject()))+""),0);
RDebugUtils.currentLine=127533060;
 //BA.debugLineNum = 127533060;BA.debugLine="Log($\"${TAB}action: ${StartingIntent.Action}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("5127533060",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+"action: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_startingintent.getAction()))+""),0);
RDebugUtils.currentLine=127533061;
 //BA.debugLineNum = 127533061;BA.debugLine="Log($\"${TAB}extra: ${StartingIntent.ExtrasToStri";
anywheresoftware.b4a.keywords.Common.LogImpl("5127533061",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+"extra: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_startingintent.ExtrasToString()))+""),0);
RDebugUtils.currentLine=127533062;
 //BA.debugLineNum = 127533062;BA.debugLine="Log($\"${TAB}data: ${StartingIntent.GetData}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("5127533062",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+"data: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_startingintent.GetData()))+""),0);
 };
RDebugUtils.currentLine=127533064;
 //BA.debugLineNum = 127533064;BA.debugLine="If StartingIntent.Action = \"android.intent.action";
if ((_startingintent.getAction()).equals("android.intent.action.MY_PACKAGE_REPLACED")) { 
RDebugUtils.currentLine=127533065;
 //BA.debugLineNum = 127533065;BA.debugLine="If svcVerbose Then Log($\"${TAB}Intent MY_PACKAGE";
if (_svcverbose) { 
anywheresoftware.b4a.keywords.Common.LogImpl("5127533065",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+"Intent MY_PACKAGE_REPLACED received!"),0);};
RDebugUtils.currentLine=127533066;
 //BA.debugLineNum = 127533066;BA.debugLine="pkg = GetPackageName";
_pkg = _getpackagename();
RDebugUtils.currentLine=127533067;
 //BA.debugLineNum = 127533067;BA.debugLine="If svcVerbose Then Log($\"${TAB}package: ${pkg}\"$";
if (_svcverbose) { 
anywheresoftware.b4a.keywords.Common.LogImpl("5127533067",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.TAB))+"package: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_pkg))+""),0);};
RDebugUtils.currentLine=127533068;
 //BA.debugLineNum = 127533068;BA.debugLine="MyAppReload";
_myappreload();
 };
RDebugUtils.currentLine=127533070;
 //BA.debugLineNum = 127533070;BA.debugLine="End Sub";
return "";
}
}