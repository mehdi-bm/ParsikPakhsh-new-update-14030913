package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class service_notification extends android.app.Service{
	public static class service_notification_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (service_notification) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, service_notification.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static service_notification mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return service_notification.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.service_notification");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.service_notification", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (service_notification) Create ***");
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
                    BA.LogInfo("** Service (service_notification) Create **");
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
    	BA.LogInfo("** Service (service_notification) Start **");
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
        BA.LogInfo("** Service (service_notification) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (service_notification) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (service_notification) Destroy **");
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
public static ir.parsikhesab.pakhsh.httpjob _jobinternet = null;
public static int _count = 0;
public static anywheresoftware.b4a.objects.Timer _t1 = null;
public static barxdroid.advancednotification.AdvancedNotification _noti = null;
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
public ir.parsikhesab.pakhsh.signaturecapture _signaturecapture = null;
public ir.parsikhesab.pakhsh.starter _starter = null;
public ir.parsikhesab.pakhsh.tracker _tracker = null;
public ir.parsikhesab.pakhsh.wiget_service _wiget_service = null;
public ir.parsikhesab.pakhsh.xmlviewex _xmlviewex = null;
public ir.parsikhesab.pakhsh.newinst2 _newinst2 = null;
public ir.parsikhesab.pakhsh.base64encodedecodeimage _base64encodedecodeimage = null;
public ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public static String  _getnotification() throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "getnotification", false))
	 {return ((String) Debug.delegate(processBA, "getnotification", null));}
RDebugUtils.currentLine=120061952;
 //BA.debugLineNum = 120061952;BA.debugLine="Sub GetNotification";
RDebugUtils.currentLine=120061953;
 //BA.debugLineNum = 120061953;BA.debugLine="jobInternet.JobName =\"GetNotification\"";
_jobinternet._jobname /*String*/  = "GetNotification";
RDebugUtils.currentLine=120061954;
 //BA.debugLineNum = 120061954;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetNotification","Imei="+mostCurrent._mcode._deviceid /*String*/ +"&CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ );
RDebugUtils.currentLine=120061955;
 //BA.debugLineNum = 120061955;BA.debugLine="End Sub";
return "";
}
public static String  _getnotification2() throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "getnotification2", false))
	 {return ((String) Debug.delegate(processBA, "getnotification2", null));}
RDebugUtils.currentLine=120193024;
 //BA.debugLineNum = 120193024;BA.debugLine="Sub GetNotification2";
RDebugUtils.currentLine=120193025;
 //BA.debugLineNum = 120193025;BA.debugLine="jobInternet.JobName =\"GetNotification2\"";
_jobinternet._jobname /*String*/  = "GetNotification2";
RDebugUtils.currentLine=120193026;
 //BA.debugLineNum = 120193026;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetNotification2","Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=120193027;
 //BA.debugLineNum = 120193027;BA.debugLine="End Sub";
return "";
}
public static String  _getnotification3() throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "getnotification3", false))
	 {return ((String) Debug.delegate(processBA, "getnotification3", null));}
RDebugUtils.currentLine=120324096;
 //BA.debugLineNum = 120324096;BA.debugLine="Sub GetNotification3";
RDebugUtils.currentLine=120324097;
 //BA.debugLineNum = 120324097;BA.debugLine="jobInternet.JobName =\"GetNotification3\"";
_jobinternet._jobname /*String*/  = "GetNotification3";
RDebugUtils.currentLine=120324098;
 //BA.debugLineNum = 120324098;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetNotification3","Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=120324099;
 //BA.debugLineNum = 120324099;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "jobdone", false))
	 {return ((String) Debug.delegate(processBA, "jobdone", new Object[] {_job}));}
String _str = "";
RDebugUtils.currentLine=120455168;
 //BA.debugLineNum = 120455168;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=120455169;
 //BA.debugLineNum = 120455169;BA.debugLine="Job.GetRequest.Timeout=50000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=120455170;
 //BA.debugLineNum = 120455170;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=120455171;
 //BA.debugLineNum = 120455171;BA.debugLine="Try";
try {RDebugUtils.currentLine=120455172;
 //BA.debugLineNum = 120455172;BA.debugLine="Dim Str As String = Job.GetString";
_str = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=120455173;
 //BA.debugLineNum = 120455173;BA.debugLine="Select Case Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"GetNotification","GetNotification2","GetNotification3")) {
case 0: {
RDebugUtils.currentLine=120455177;
 //BA.debugLineNum = 120455177;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=120455178;
 //BA.debugLineNum = 120455178;BA.debugLine="Log(\"نوتیفیکیشن جدیدی موجود نمی باشد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5120455178","نوتیفیکیشن جدیدی موجود نمی باشد",0);
RDebugUtils.currentLine=120455179;
 //BA.debugLineNum = 120455179;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=120455181;
 //BA.debugLineNum = 120455181;BA.debugLine="LoadGetNotification(Str)";
_loadgetnotification(_str);
 };
 break; }
case 1: {
RDebugUtils.currentLine=120455185;
 //BA.debugLineNum = 120455185;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=120455186;
 //BA.debugLineNum = 120455186;BA.debugLine="Log(\"نوتیفیکیشن2 جدیدی موجود نمی باشد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5120455186","نوتیفیکیشن2 جدیدی موجود نمی باشد",0);
RDebugUtils.currentLine=120455187;
 //BA.debugLineNum = 120455187;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=120455189;
 //BA.debugLineNum = 120455189;BA.debugLine="LoadGetNotification2(Str)";
_loadgetnotification2(_str);
 };
RDebugUtils.currentLine=120455192;
 //BA.debugLineNum = 120455192;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 2: {
RDebugUtils.currentLine=120455195;
 //BA.debugLineNum = 120455195;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=120455196;
 //BA.debugLineNum = 120455196;BA.debugLine="Log(\"نوتیفیکیشن3 جدیدی موجود نمی باشد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5120455196","نوتیفیکیشن3 جدیدی موجود نمی باشد",0);
RDebugUtils.currentLine=120455197;
 //BA.debugLineNum = 120455197;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=120455199;
 //BA.debugLineNum = 120455199;BA.debugLine="LoadGetNotification3(Str)";
_loadgetnotification3(_str);
 };
 break; }
}
;
 } 
       catch (Exception e30) {
			processBA.setLastException(e30);RDebugUtils.currentLine=120455203;
 //BA.debugLineNum = 120455203;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5120455203",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=120455205;
 //BA.debugLineNum = 120455205;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=120455209;
 //BA.debugLineNum = 120455209;BA.debugLine="StartActivity(Act_Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_main.getObject()));
RDebugUtils.currentLine=120455218;
 //BA.debugLineNum = 120455218;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=120455220;
 //BA.debugLineNum = 120455220;BA.debugLine="StartService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=120455221;
 //BA.debugLineNum = 120455221;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5120455221","Gps Start",0);
 };
RDebugUtils.currentLine=120455223;
 //BA.debugLineNum = 120455223;BA.debugLine="jobInternet.Release";
_jobinternet._release /*String*/ (null);
RDebugUtils.currentLine=120455225;
 //BA.debugLineNum = 120455225;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetnotification(String _str) throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "loadgetnotification", false))
	 {return ((String) Debug.delegate(processBA, "loadgetnotification", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
String _strtype = "";
int _i = 0;
RDebugUtils.currentLine=120127488;
 //BA.debugLineNum = 120127488;BA.debugLine="Sub LoadGetNotification(Str As String)";
RDebugUtils.currentLine=120127489;
 //BA.debugLineNum = 120127489;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=120127490;
 //BA.debugLineNum = 120127490;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=120127491;
 //BA.debugLineNum = 120127491;BA.debugLine="Dim Strtype As String=\"\"";
_strtype = "";
RDebugUtils.currentLine=120127492;
 //BA.debugLineNum = 120127492;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=120127493;
 //BA.debugLineNum = 120127493;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=120127494;
 //BA.debugLineNum = 120127494;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=120127495;
 //BA.debugLineNum = 120127495;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=120127497;
 //BA.debugLineNum = 120127497;BA.debugLine="Log(Row.Get(\"fldTitle\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5120127497",BA.ObjectToString(_row.Get((Object)("fldTitle"))),0);
RDebugUtils.currentLine=120127498;
 //BA.debugLineNum = 120127498;BA.debugLine="Log(Row.Get(\"fldTime\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5120127498",BA.ObjectToString(_row.Get((Object)("fldTime"))),0);
RDebugUtils.currentLine=120127499;
 //BA.debugLineNum = 120127499;BA.debugLine="Log(Row.Get(\"fldType\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5120127499",BA.ObjectToString(_row.Get((Object)("fldType"))),0);
RDebugUtils.currentLine=120127501;
 //BA.debugLineNum = 120127501;BA.debugLine="If Row.Get(\"fldType\")=\"\" Then";
if ((_row.Get((Object)("fldType"))).equals((Object)(""))) { 
RDebugUtils.currentLine=120127502;
 //BA.debugLineNum = 120127502;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblNotifi (Id,Fld";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblNotifi (Id,FldTitle,FldBody,FldDate,FldTime) Values ('"+BA.ObjectToString(_row.Get((Object)("Id")))+"','"+BA.ObjectToString(_row.Get((Object)("fldTitle")))+"','"+BA.ObjectToString(_row.Get((Object)("fldBody")))+"','"+BA.ObjectToString(_row.Get((Object)("fldDate")))+"','"+BA.ObjectToString(_row.Get((Object)("fldTime")))+"')");
RDebugUtils.currentLine=120127505;
 //BA.debugLineNum = 120127505;BA.debugLine="noti.SetInfo2(Row.Get(\"fldTitle\"),Row.Get(\"fldB";
_noti.SetInfo2(processBA,BA.ObjectToString(_row.Get((Object)("fldTitle"))),BA.ObjectToString(_row.Get((Object)("fldBody"))),BA.ObjectToString(_row.Get((Object)("Id"))),(Object)(mostCurrent._act_notif.getObject()));
RDebugUtils.currentLine=120127507;
 //BA.debugLineNum = 120127507;BA.debugLine="Strtype=\"\"";
_strtype = "";
 }else {
RDebugUtils.currentLine=120127510;
 //BA.debugLineNum = 120127510;BA.debugLine="Strtype=Row.Get(\"fldType\")";
_strtype = BA.ObjectToString(_row.Get((Object)("fldType")));
RDebugUtils.currentLine=120127511;
 //BA.debugLineNum = 120127511;BA.debugLine="MCode.downloadingData=True";
mostCurrent._mcode._downloadingdata /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=120127512;
 //BA.debugLineNum = 120127512;BA.debugLine="If Row.Get(\"fldType\")=\"GetForoosh\" Or Row.Get(\"";
if ((_row.Get((Object)("fldType"))).equals((Object)("GetForoosh")) || (_row.Get((Object)("fldType"))).equals((Object)("GetKharid")) || (_row.Get((Object)("fldType"))).equals((Object)("GetBargashtAzForoosh")) || (_row.Get((Object)("fldType"))).equals((Object)("GetBargashtAzKharid"))) { 
RDebugUtils.currentLine=120127515;
 //BA.debugLineNum = 120127515;BA.debugLine="CallSubDelayed3(FirebaseMessaging,\"GetForooshA";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._firebasemessaging.getObject()),"GetForooshAndKharid",_row.Get((Object)("fldTitle")),_row.Get((Object)("fldBody")));
 }else {
RDebugUtils.currentLine=120127517;
 //BA.debugLineNum = 120127517;BA.debugLine="FirebaseMessaging.mode=Strtype";
mostCurrent._firebasemessaging._mode /*String*/  = _strtype;
RDebugUtils.currentLine=120127518;
 //BA.debugLineNum = 120127518;BA.debugLine="StartService(FirebaseMessaging)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._firebasemessaging.getObject()));
 };
 };
 }
};
RDebugUtils.currentLine=120127526;
 //BA.debugLineNum = 120127526;BA.debugLine="noti.Notify(1)";
_noti.Notify((int) (1));
RDebugUtils.currentLine=120127528;
 //BA.debugLineNum = 120127528;BA.debugLine="Log(\"نوتیفیکیشن بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5120127528","نوتیفیکیشن بروزرسانی گردید",0);
RDebugUtils.currentLine=120127530;
 //BA.debugLineNum = 120127530;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetnotification2(String _str) throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "loadgetnotification2", false))
	 {return ((String) Debug.delegate(processBA, "loadgetnotification2", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
RDebugUtils.currentLine=120258560;
 //BA.debugLineNum = 120258560;BA.debugLine="Sub LoadGetNotification2(Str As String)";
RDebugUtils.currentLine=120258561;
 //BA.debugLineNum = 120258561;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=120258562;
 //BA.debugLineNum = 120258562;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=120258563;
 //BA.debugLineNum = 120258563;BA.debugLine="MCode.SaveUpdate(\"Delete From TblTablighVisitor\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblTablighVisitor");
RDebugUtils.currentLine=120258564;
 //BA.debugLineNum = 120258564;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=120258565;
 //BA.debugLineNum = 120258565;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=120258566;
 //BA.debugLineNum = 120258566;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=120258567;
 //BA.debugLineNum = 120258567;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=120258568;
 //BA.debugLineNum = 120258568;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblTablighVisitor";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblTablighVisitor (Id,FldTitle,FldMessage,FldDate,FldTime,FldLink) Values ('"+BA.ObjectToString(_row.Get((Object)("Id")))+"','"+BA.ObjectToString(_row.Get((Object)("FldTitle")))+"','"+BA.ObjectToString(_row.Get((Object)("FldMessage")))+"','"+BA.ObjectToString(_row.Get((Object)("FldDate")))+"','"+BA.ObjectToString(_row.Get((Object)("FldTime")))+"','"+BA.ObjectToString(_row.Get((Object)("FldLink")))+"')");
RDebugUtils.currentLine=120258570;
 //BA.debugLineNum = 120258570;BA.debugLine="Log(Row.Get(\"FldTitle\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5120258570",BA.ObjectToString(_row.Get((Object)("FldTitle"))),0);
RDebugUtils.currentLine=120258571;
 //BA.debugLineNum = 120258571;BA.debugLine="Log(Row.Get(\"FldTime\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5120258571",BA.ObjectToString(_row.Get((Object)("FldTime"))),0);
RDebugUtils.currentLine=120258573;
 //BA.debugLineNum = 120258573;BA.debugLine="MCode.EtelaResani=Row.Get(\"FldMessage\")";
mostCurrent._mcode._etelaresani /*String*/  = BA.ObjectToString(_row.Get((Object)("FldMessage")));
 }
};
RDebugUtils.currentLine=120258576;
 //BA.debugLineNum = 120258576;BA.debugLine="Log(\"نوتیفیکیشن2 بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5120258576","نوتیفیکیشن2 بروزرسانی گردید",0);
RDebugUtils.currentLine=120258578;
 //BA.debugLineNum = 120258578;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetnotification3(String _str) throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "loadgetnotification3", false))
	 {return ((String) Debug.delegate(processBA, "loadgetnotification3", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
RDebugUtils.currentLine=120389632;
 //BA.debugLineNum = 120389632;BA.debugLine="Sub LoadGetNotification3(Str As String)";
RDebugUtils.currentLine=120389633;
 //BA.debugLineNum = 120389633;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=120389634;
 //BA.debugLineNum = 120389634;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=120389635;
 //BA.debugLineNum = 120389635;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=120389636;
 //BA.debugLineNum = 120389636;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=120389637;
 //BA.debugLineNum = 120389637;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=120389638;
 //BA.debugLineNum = 120389638;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=120389641;
 //BA.debugLineNum = 120389641;BA.debugLine="Log(Row.Get(\"fldTitle\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5120389641",BA.ObjectToString(_row.Get((Object)("fldTitle"))),0);
RDebugUtils.currentLine=120389642;
 //BA.debugLineNum = 120389642;BA.debugLine="Log(Row.Get(\"fldTime\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5120389642",BA.ObjectToString(_row.Get((Object)("fldTime"))),0);
 }
};
RDebugUtils.currentLine=120389649;
 //BA.debugLineNum = 120389649;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=119865344;
 //BA.debugLineNum = 119865344;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=119865345;
 //BA.debugLineNum = 119865345;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
_jobinternet._initialize /*String*/ (null,processBA,"jobInternet",service_notification.getObject());
RDebugUtils.currentLine=119865346;
 //BA.debugLineNum = 119865346;BA.debugLine="jobInternet.GetRequest.Timeout=50000";
_jobinternet._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=119865347;
 //BA.debugLineNum = 119865347;BA.debugLine="noti.Initialize";
_noti.Initialize();
RDebugUtils.currentLine=119865348;
 //BA.debugLineNum = 119865348;BA.debugLine="noti.Icon=\"icon\"";
_noti.setIcon("icon");
RDebugUtils.currentLine=119865349;
 //BA.debugLineNum = 119865349;BA.debugLine="noti.Light=True";
_noti.setLight(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=119865350;
 //BA.debugLineNum = 119865350;BA.debugLine="noti.Sound=False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=119865351;
 //BA.debugLineNum = 119865351;BA.debugLine="noti.NoClear=False";
_noti.setNoClear(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=119865354;
 //BA.debugLineNum = 119865354;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=120520704;
 //BA.debugLineNum = 120520704;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=120520706;
 //BA.debugLineNum = 120520706;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
long _t = 0L;
RDebugUtils.currentLine=119930880;
 //BA.debugLineNum = 119930880;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=119930881;
 //BA.debugLineNum = 119930881;BA.debugLine="Dim t As Long= DateTime.Now + 6000";
_t = (long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+6000);
RDebugUtils.currentLine=119930898;
 //BA.debugLineNum = 119930898;BA.debugLine="End Sub";
return "";
}
public static String  _t1_tick() throws Exception{
RDebugUtils.currentModule="service_notification";
if (Debug.shouldDelegate(processBA, "t1_tick", false))
	 {return ((String) Debug.delegate(processBA, "t1_tick", null));}
RDebugUtils.currentLine=119996416;
 //BA.debugLineNum = 119996416;BA.debugLine="Sub t1_Tick";
RDebugUtils.currentLine=119996420;
 //BA.debugLineNum = 119996420;BA.debugLine="End Sub";
return "";
}
}