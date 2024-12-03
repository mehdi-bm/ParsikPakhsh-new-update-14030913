package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class service_server extends android.app.Service{
	public static class service_server_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (service_server) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, service_server.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static service_server mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return service_server.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.service_server");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.service_server", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (service_server) Create ***");
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
                    BA.LogInfo("** Service (service_server) Create **");
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
    	BA.LogInfo("** Service (service_server) Start **");
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
        BA.LogInfo("** Service (service_server) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (service_server) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (service_server) Destroy **");
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
public static boolean _tgps = false;
public static int _shomarefactorselect = 0;
public static String _sendtype = "";
public static String _dt1 = "";
public static String _dt2 = "";
public static String _datenow = "";
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
public static String  _getallnotification() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getallnotification", false))
	 {return ((String) Debug.delegate(processBA, "getallnotification", null));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub GetAllNotification";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="jobInternet.JobName =\"GetAllNotification\"";
_jobinternet._jobname /*String*/  = "GetAllNotification";
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAllNotification","Imei="+mostCurrent._mcode._deviceid /*String*/ +"&CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ );
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="End Sub";
return "";
}
public static String  _getashkhas() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getashkhas", false))
	 {return ((String) Debug.delegate(processBA, "getashkhas", null));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub GetAshkhas";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="jobInternet.JobName =\"GetAshkhas\"";
_jobinternet._jobname /*String*/  = "GetAshkhas";
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetListAshkhas","&Imei="+mostCurrent._mcode._deviceid /*String*/ +"&Version=1");
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="End Sub";
return "";
}
public static void  _request(ir.parsikhesab.pakhsh.httpjob _j) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "request", false))
	 {Debug.delegate(processBA, "request", new Object[] {_j}); return;}
ResumableSub_Request rsub = new ResumableSub_Request(null,_j);
rsub.resume(processBA, null);
}
public static class ResumableSub_Request extends BA.ResumableSub {
public ResumableSub_Request(ir.parsikhesab.pakhsh.service_server parent,ir.parsikhesab.pakhsh.httpjob _j) {
this.parent = parent;
this._j = _j;
}
ir.parsikhesab.pakhsh.service_server parent;
ir.parsikhesab.pakhsh.httpjob _j;
String _str = "";
anywheresoftware.b4a.objects.collections.List _rowslist = null;
ir.parsikhesab.pakhsh.mcode._adapteversion _item = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
String _strcurrentdate = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _code = "";
String _name = "";
String _query = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="service_server";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 512;
this.catchState = 511;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 511;
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "service_server", "request"), (Object)(_j));
this.state = 513;
return;
case 513:
//C
this.state = 4;
_j = (ir.parsikhesab.pakhsh.httpjob) result[0];
;
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 509;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 500;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 498;
this.catchState = 497;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 497;
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="Dim Str As String = j.GetString";
_str = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="Log(j.JobName)";
anywheresoftware.b4a.keywords.Common.LogImpl("512845062",_j._jobname /*String*/ ,0);
RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="Select Case j.JobName";
if (true) break;

case 10:
//select
this.state = 495;
switch (BA.switchObjectToInt(_j._jobname /*String*/ ,"GetVersion","GetSetting","GetTanzimatAndroid","SaveVersionAndroidInfo","SaveAndroidLog","SaveLocationMoshtari","GetCurrentDate","GetGoroohKala","GetKala","GetGoroohAshkhas","GetAllNotification","GetGalleryKala","GetEshantion2","GetDaftarchTell","GetGroupDastrasiAshkhas","GetEshantionGroup","GetReportRizePishFactor3","GetHavaleByUser","GetAshkhas","GetFee","GetTasvie","GetTourVisitor","GetCodeMoshtari","GetVaziat","SendTokenId","SendFaktor","SendTourVisitor","SendAshkhasNew","GetReportVisitor","GetListGpsVisitor","GetReportMoshtari","GetReportFactor","GetReportRizePishFactor","GetSooratHesab","GetVisitor","GetReportFactorVisitor","GetReportRizFactorVisitor","ShowFactorForooshByHavale","ShowRizFactorForooshByHavale","GetBankMa","GetBankMoshtari","GetSandoogh","GetDaryaft","GetCheckDaryaft","GetVideoAmoozesh","GetPicFTPForAndroid","SendDaryaft","SendUpdateQuery")) {
case 0: {
this.state = 12;
if (true) break;
}
case 1: {
this.state = 22;
if (true) break;
}
case 2: {
this.state = 30;
if (true) break;
}
case 3: {
this.state = 38;
if (true) break;
}
case 4: {
this.state = 46;
if (true) break;
}
case 5: {
this.state = 54;
if (true) break;
}
case 6: {
this.state = 64;
if (true) break;
}
case 7: {
this.state = 81;
if (true) break;
}
case 8: {
this.state = 89;
if (true) break;
}
case 9: {
this.state = 97;
if (true) break;
}
case 10: {
this.state = 105;
if (true) break;
}
case 11: {
this.state = 113;
if (true) break;
}
case 12: {
this.state = 121;
if (true) break;
}
case 13: {
this.state = 129;
if (true) break;
}
case 14: {
this.state = 137;
if (true) break;
}
case 15: {
this.state = 145;
if (true) break;
}
case 16: {
this.state = 170;
if (true) break;
}
case 17: {
this.state = 189;
if (true) break;
}
case 18: {
this.state = 197;
if (true) break;
}
case 19: {
this.state = 211;
if (true) break;
}
case 20: {
this.state = 219;
if (true) break;
}
case 21: {
this.state = 227;
if (true) break;
}
case 22: {
this.state = 240;
if (true) break;
}
case 23: {
this.state = 248;
if (true) break;
}
case 24: {
this.state = 258;
if (true) break;
}
case 25: {
this.state = 268;
if (true) break;
}
case 26: {
this.state = 282;
if (true) break;
}
case 27: {
this.state = 290;
if (true) break;
}
case 28: {
this.state = 318;
if (true) break;
}
case 29: {
this.state = 326;
if (true) break;
}
case 30: {
this.state = 334;
if (true) break;
}
case 31: {
this.state = 342;
if (true) break;
}
case 32: {
this.state = 350;
if (true) break;
}
case 33: {
this.state = 358;
if (true) break;
}
case 34: {
this.state = 366;
if (true) break;
}
case 35: {
this.state = 379;
if (true) break;
}
case 36: {
this.state = 387;
if (true) break;
}
case 37: {
this.state = 395;
if (true) break;
}
case 38: {
this.state = 403;
if (true) break;
}
case 39: {
this.state = 411;
if (true) break;
}
case 40: {
this.state = 419;
if (true) break;
}
case 41: {
this.state = 427;
if (true) break;
}
case 42: {
this.state = 435;
if (true) break;
}
case 43: {
this.state = 443;
if (true) break;
}
case 44: {
this.state = 454;
if (true) break;
}
case 45: {
this.state = 462;
if (true) break;
}
case 46: {
this.state = 470;
if (true) break;
}
case 47: {
this.state = 478;
if (true) break;
}
}
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="If Str <> \"No Result\" Then";
if (true) break;

case 13:
//if
this.state = 20;
if ((_str).equals("No Result") == false) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="Log(Str)";
anywheresoftware.b4a.keywords.Common.LogImpl("512845067",_str,0);
RDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="If MCode.page=\"act_setting\" Then";
if (true) break;

case 16:
//if
this.state = 19;
if ((parent.mostCurrent._mcode._page /*String*/ ).equals("act_setting")) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=12845069;
 //BA.debugLineNum = 12845069;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12845070;
 //BA.debugLineNum = 12845070;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
parent.mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=12845071;
 //BA.debugLineNum = 12845071;BA.debugLine="Dim item As AdapteVersion";
_item = new ir.parsikhesab.pakhsh.mcode._adapteversion();
RDebugUtils.currentLine=12845072;
 //BA.debugLineNum = 12845072;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=12845073;
 //BA.debugLineNum = 12845073;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = parent.mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=12845074;
 //BA.debugLineNum = 12845074;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12845075;
 //BA.debugLineNum = 12845075;BA.debugLine="Row=RowsList.Get(0)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get((int) (0))));
RDebugUtils.currentLine=12845077;
 //BA.debugLineNum = 12845077;BA.debugLine="MCode.linkposparsian=Row.Get(\"FldLink\")";
parent.mostCurrent._mcode._linkposparsian /*String*/  = BA.ObjectToString(_row.Get((Object)("FldLink")));
RDebugUtils.currentLine=12845079;
 //BA.debugLineNum = 12845079;BA.debugLine="CallSubDelayed(Act_Setting,\"DownloadAppPos\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._act_setting.getObject()),"DownloadAppPos");
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 495;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=12845084;
 //BA.debugLineNum = 12845084;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 23:
//if
this.state = 28;
if ((_str).equals("No Result")) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
RDebugUtils.currentLine=12845085;
 //BA.debugLineNum = 12845085;BA.debugLine="ToastMessageShow(\"شما مجاز به استفاده از نرم";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("شما مجاز به استفاده از نرم افزار نمی باشید"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=12845089;
 //BA.debugLineNum = 12845089;BA.debugLine="th.RunOnGuiThread(\"LoadGetSetting\",Array As O";
parent._th.RunOnGuiThread("LoadGetSetting",new Object[]{(Object)(_str)});
 if (true) break;

case 28:
//C
this.state = 495;
;
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=12845095;
 //BA.debugLineNum = 12845095;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 31:
//if
this.state = 36;
if ((_str).equals("No Result")) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=12845100;
 //BA.debugLineNum = 12845100;BA.debugLine="th.RunOnGuiThread(\"LoadGetTanzimatAndroid\",Ar";
parent._th.RunOnGuiThread("LoadGetTanzimatAndroid",new Object[]{(Object)(_str)});
 if (true) break;

case 36:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845103;
 //BA.debugLineNum = 12845103;BA.debugLine="GetLinkFtp";
_getlinkftp();
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=12845105;
 //BA.debugLineNum = 12845105;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 39:
//if
this.state = 44;
if ((_str).equals("No Result")) { 
this.state = 41;
}else {
this.state = 43;
}if (true) break;

case 41:
//C
this.state = 44;
RDebugUtils.currentLine=12845106;
 //BA.debugLineNum = 12845106;BA.debugLine="Log(\"اطلاعات نرم افزار ارسال نشد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512845106","اطلاعات نرم افزار ارسال نشد",0);
 if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=12845108;
 //BA.debugLineNum = 12845108;BA.debugLine="Log(\"اطلاعات نرم افزار ارسال شد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512845108","اطلاعات نرم افزار ارسال شد",0);
 if (true) break;

case 44:
//C
this.state = 495;
;
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=12845111;
 //BA.debugLineNum = 12845111;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 47:
//if
this.state = 52;
if ((_str).equals("No Result")) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
RDebugUtils.currentLine=12845112;
 //BA.debugLineNum = 12845112;BA.debugLine="Log(\"خطا ارسال نشد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512845112","خطا ارسال نشد",0);
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=12845114;
 //BA.debugLineNum = 12845114;BA.debugLine="Log(\"خطا ارسال شد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512845114","خطا ارسال شد",0);
 if (true) break;

case 52:
//C
this.state = 495;
;
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=12845117;
 //BA.debugLineNum = 12845117;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 55:
//if
this.state = 62;
if ((_str).equals("No Result")) { 
this.state = 57;
}else 
{RDebugUtils.currentLine=12845119;
 //BA.debugLineNum = 12845119;BA.debugLine="Else If Str=\"Insert\" Then";
if ((_str).equals("Insert")) { 
this.state = 59;
}else 
{RDebugUtils.currentLine=12845121;
 //BA.debugLineNum = 12845121;BA.debugLine="Else If Str=\"Update\" Then";
if ((_str).equals("Update")) { 
this.state = 61;
}}}
if (true) break;

case 57:
//C
this.state = 62;
RDebugUtils.currentLine=12845118;
 //BA.debugLineNum = 12845118;BA.debugLine="Log(\"خطا در ارسال موقعیت مشتری\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512845118","خطا در ارسال موقعیت مشتری",0);
 if (true) break;

case 59:
//C
this.state = 62;
RDebugUtils.currentLine=12845120;
 //BA.debugLineNum = 12845120;BA.debugLine="Log(\"موقعیت مشتری با موفقیت ثبت شد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512845120","موقعیت مشتری با موفقیت ثبت شد",0);
 if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=12845122;
 //BA.debugLineNum = 12845122;BA.debugLine="Log(\"موقعیت مشتری بروزرسانی شد\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512845122","موقعیت مشتری بروزرسانی شد",0);
 if (true) break;

case 62:
//C
this.state = 495;
;
 if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=12845125;
 //BA.debugLineNum = 12845125;BA.debugLine="Dim StrCurrentDate As String = j.GetString";
_strcurrentdate = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=12845127;
 //BA.debugLineNum = 12845127;BA.debugLine="If StrCurrentDate <> \"No Result\" Then";
if (true) break;

case 65:
//if
this.state = 72;
if ((_strcurrentdate).equals("No Result") == false) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=12845128;
 //BA.debugLineNum = 12845128;BA.debugLine="datenow=StrCurrentDate";
parent._datenow = _strcurrentdate;
RDebugUtils.currentLine=12845130;
 //BA.debugLineNum = 12845130;BA.debugLine="If datenow.Length = 24 Then";
if (true) break;

case 68:
//if
this.state = 71;
if (parent._datenow.length()==24) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=12845131;
 //BA.debugLineNum = 12845131;BA.debugLine="datenow=datenow.SubString2(0,23)";
parent._datenow = parent._datenow.substring((int) (0),(int) (23));
 if (true) break;

case 71:
//C
this.state = 72;
;
RDebugUtils.currentLine=12845133;
 //BA.debugLineNum = 12845133;BA.debugLine="Log(\"datenow: \"&datenow)";
anywheresoftware.b4a.keywords.Common.LogImpl("512845133","datenow: "+parent._datenow,0);
 if (true) break;
;
RDebugUtils.currentLine=12845136;
 //BA.debugLineNum = 12845136;BA.debugLine="If	Act_Main.NoeGet=\"MojoodiAnbar\" Then";

case 72:
//if
this.state = 79;
if ((parent.mostCurrent._act_main._noeget /*String*/ ).equals("MojoodiAnbar")) { 
this.state = 74;
}else 
{RDebugUtils.currentLine=12845138;
 //BA.debugLineNum = 12845138;BA.debugLine="Else If Act_Main.NoeGet=\"UpdateFee\" Then";
if ((parent.mostCurrent._act_main._noeget /*String*/ ).equals("UpdateFee")) { 
this.state = 76;
}else {
this.state = 78;
}}
if (true) break;

case 74:
//C
this.state = 79;
RDebugUtils.currentLine=12845137;
 //BA.debugLineNum = 12845137;BA.debugLine="GetKala";
_getkala();
 if (true) break;

case 76:
//C
this.state = 79;
RDebugUtils.currentLine=12845139;
 //BA.debugLineNum = 12845139;BA.debugLine="GetFee";
_getfee();
 if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=12845141;
 //BA.debugLineNum = 12845141;BA.debugLine="GetSetting";
_getsetting();
 if (true) break;

case 79:
//C
this.state = 495;
;
 if (true) break;

case 81:
//C
this.state = 82;
RDebugUtils.currentLine=12845145;
 //BA.debugLineNum = 12845145;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 82:
//if
this.state = 87;
if ((_str).equals("No Result")) { 
this.state = 84;
}else {
this.state = 86;
}if (true) break;

case 84:
//C
this.state = 87;
RDebugUtils.currentLine=12845146;
 //BA.debugLineNum = 12845146;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohKala\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGoroohKala");
RDebugUtils.currentLine=12845147;
 //BA.debugLineNum = 12845147;BA.debugLine="ToastMessageShow(\"گروه کالا موجود نمی باشد\",T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گروه کالا موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=12845150;
 //BA.debugLineNum = 12845150;BA.debugLine="th.RunOnGuiThread(\"LoadGetGoroohKala\",Array A";
parent._th.RunOnGuiThread("LoadGetGoroohKala",new Object[]{(Object)(_str)});
 if (true) break;

case 87:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845153;
 //BA.debugLineNum = 12845153;BA.debugLine="GetKala";
_getkala();
 if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=12845155;
 //BA.debugLineNum = 12845155;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 90:
//if
this.state = 95;
if ((_str).equals("No Result")) { 
this.state = 92;
}else {
this.state = 94;
}if (true) break;

case 92:
//C
this.state = 95;
RDebugUtils.currentLine=12845156;
 //BA.debugLineNum = 12845156;BA.debugLine="MCode.SaveUpdate(\"Delete From TblKala\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblKala");
RDebugUtils.currentLine=12845157;
 //BA.debugLineNum = 12845157;BA.debugLine="ToastMessageShow(\"کالا موجود نمی باشد\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کالا موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 94:
//C
this.state = 95;
RDebugUtils.currentLine=12845160;
 //BA.debugLineNum = 12845160;BA.debugLine="th.RunOnGuiThread(\"LoadGetKala\",Array As Obje";
parent._th.RunOnGuiThread("LoadGetKala",new Object[]{(Object)(_str)});
 if (true) break;

case 95:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845164;
 //BA.debugLineNum = 12845164;BA.debugLine="GetGoroohAshkhas";
_getgoroohashkhas();
 if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=12845169;
 //BA.debugLineNum = 12845169;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 98:
//if
this.state = 103;
if ((_str).equals("No Result")) { 
this.state = 100;
}else {
this.state = 102;
}if (true) break;

case 100:
//C
this.state = 103;
RDebugUtils.currentLine=12845170;
 //BA.debugLineNum = 12845170;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohAshkha";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGoroohAshkhas");
RDebugUtils.currentLine=12845171;
 //BA.debugLineNum = 12845171;BA.debugLine="ToastMessageShow(\"گروه اشخاص موجود نمی باشد\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گروه اشخاص موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 102:
//C
this.state = 103;
RDebugUtils.currentLine=12845174;
 //BA.debugLineNum = 12845174;BA.debugLine="th.RunOnGuiThread(\"LoadGetGoroohAshkhas\",Arra";
parent._th.RunOnGuiThread("LoadGetGoroohAshkhas",new Object[]{(Object)(_str)});
 if (true) break;

case 103:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845178;
 //BA.debugLineNum = 12845178;BA.debugLine="GetAshkhas";
_getashkhas();
 if (true) break;

case 105:
//C
this.state = 106;
RDebugUtils.currentLine=12845180;
 //BA.debugLineNum = 12845180;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 106:
//if
this.state = 111;
if ((_str).equals("No Result")) { 
this.state = 108;
}else {
this.state = 110;
}if (true) break;

case 108:
//C
this.state = 111;
RDebugUtils.currentLine=12845181;
 //BA.debugLineNum = 12845181;BA.debugLine="MCode.SaveUpdate(\"Delete From TblNotifi\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblNotifi");
 if (true) break;

case 110:
//C
this.state = 111;
RDebugUtils.currentLine=12845185;
 //BA.debugLineNum = 12845185;BA.debugLine="th.RunOnGuiThread(\"LoadGetAllNotification\",Ar";
parent._th.RunOnGuiThread("LoadGetAllNotification",new Object[]{(Object)(_str)});
 if (true) break;

case 111:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845188;
 //BA.debugLineNum = 12845188;BA.debugLine="GetGalleryKala";
_getgallerykala();
 if (true) break;

case 113:
//C
this.state = 114;
RDebugUtils.currentLine=12845190;
 //BA.debugLineNum = 12845190;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 114:
//if
this.state = 119;
if ((_str).equals("No Result")) { 
this.state = 116;
}else {
this.state = 118;
}if (true) break;

case 116:
//C
this.state = 119;
RDebugUtils.currentLine=12845191;
 //BA.debugLineNum = 12845191;BA.debugLine="MCode.SaveUpdate(\"Delete From tblGalleryPic\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblGalleryPic");
RDebugUtils.currentLine=12845192;
 //BA.debugLineNum = 12845192;BA.debugLine="ToastMessageShow(\"گالری تصاویر موجود نمی باشد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گالری تصاویر موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 118:
//C
this.state = 119;
RDebugUtils.currentLine=12845195;
 //BA.debugLineNum = 12845195;BA.debugLine="th.RunOnGuiThread(\"LoadGetGalleryKala\",Array";
parent._th.RunOnGuiThread("LoadGetGalleryKala",new Object[]{(Object)(_str)});
 if (true) break;

case 119:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845199;
 //BA.debugLineNum = 12845199;BA.debugLine="GetEshantion2";
_geteshantion2();
 if (true) break;

case 121:
//C
this.state = 122;
RDebugUtils.currentLine=12845201;
 //BA.debugLineNum = 12845201;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 122:
//if
this.state = 127;
if ((_str).equals("No Result")) { 
this.state = 124;
}else {
this.state = 126;
}if (true) break;

case 124:
//C
this.state = 127;
RDebugUtils.currentLine=12845202;
 //BA.debugLineNum = 12845202;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionTab";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblEshantionTabaghati");
RDebugUtils.currentLine=12845203;
 //BA.debugLineNum = 12845203;BA.debugLine="ToastMessageShow(\"اشانتیون موجود نمی باشد\",Tr";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اشانتیون موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 126:
//C
this.state = 127;
RDebugUtils.currentLine=12845208;
 //BA.debugLineNum = 12845208;BA.debugLine="th.RunOnGuiThread(\"LoadGetEshantion2\",Array A";
parent._th.RunOnGuiThread("LoadGetEshantion2",new Object[]{(Object)(_str)});
 if (true) break;

case 127:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845210;
 //BA.debugLineNum = 12845210;BA.debugLine="GetDaftarchTell";
_getdaftarchtell();
 if (true) break;

case 129:
//C
this.state = 130;
RDebugUtils.currentLine=12845212;
 //BA.debugLineNum = 12845212;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 130:
//if
this.state = 135;
if ((_str).equals("No Result")) { 
this.state = 132;
}else {
this.state = 134;
}if (true) break;

case 132:
//C
this.state = 135;
RDebugUtils.currentLine=12845213;
 //BA.debugLineNum = 12845213;BA.debugLine="MCode.SaveUpdate(\"Delete From tblDaftarcheTel";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblDaftarcheTell");
RDebugUtils.currentLine=12845214;
 //BA.debugLineNum = 12845214;BA.debugLine="ToastMessageShow(\"دفترچه تلفن موجود نمی باشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دفترچه تلفن موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 134:
//C
this.state = 135;
RDebugUtils.currentLine=12845220;
 //BA.debugLineNum = 12845220;BA.debugLine="th.RunOnGuiThread(\"LoadGetDaftarchTell\",Array";
parent._th.RunOnGuiThread("LoadGetDaftarchTell",new Object[]{(Object)(_str)});
 if (true) break;

case 135:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845222;
 //BA.debugLineNum = 12845222;BA.debugLine="GetGroupDastrasiAshkhas";
_getgroupdastrasiashkhas();
 if (true) break;

case 137:
//C
this.state = 138;
RDebugUtils.currentLine=12845225;
 //BA.debugLineNum = 12845225;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 138:
//if
this.state = 143;
if ((_str).equals("No Result")) { 
this.state = 140;
}else {
this.state = 142;
}if (true) break;

case 140:
//C
this.state = 143;
RDebugUtils.currentLine=12845226;
 //BA.debugLineNum = 12845226;BA.debugLine="MCode.SaveUpdate(\"Delete From tblGroupDastras";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblGroupDastrasi");
 if (true) break;

case 142:
//C
this.state = 143;
RDebugUtils.currentLine=12845233;
 //BA.debugLineNum = 12845233;BA.debugLine="th.RunOnGuiThread(\"LoadGetGroupDastrasiAshkha";
parent._th.RunOnGuiThread("LoadGetGroupDastrasiAshkhas",new Object[]{(Object)(_str)});
 if (true) break;

case 143:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845235;
 //BA.debugLineNum = 12845235;BA.debugLine="GetEshantionGroup";
_geteshantiongroup();
 if (true) break;

case 145:
//C
this.state = 146;
RDebugUtils.currentLine=12845237;
 //BA.debugLineNum = 12845237;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 146:
//if
this.state = 151;
if ((_str).equals("No Result")) { 
this.state = 148;
}else {
this.state = 150;
}if (true) break;

case 148:
//C
this.state = 151;
RDebugUtils.currentLine=12845238;
 //BA.debugLineNum = 12845238;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionGro";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblEshantionGroup");
RDebugUtils.currentLine=12845239;
 //BA.debugLineNum = 12845239;BA.debugLine="ToastMessageShow(\"اشانتیون گروهی موجود نمی با";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اشانتیون گروهی موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 150:
//C
this.state = 151;
RDebugUtils.currentLine=12845243;
 //BA.debugLineNum = 12845243;BA.debugLine="th.RunOnGuiThread(\"LoadGetEshantionGroup\",Arr";
parent._th.RunOnGuiThread("LoadGetEshantionGroup",new Object[]{(Object)(_str)});
 if (true) break;
;
RDebugUtils.currentLine=12845247;
 //BA.debugLineNum = 12845247;BA.debugLine="If MCode.Visitor=1 Then";

case 151:
//if
this.state = 168;
if ((parent.mostCurrent._mcode._visitor /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 153;
}else {
this.state = 155;
}if (true) break;

case 153:
//C
this.state = 168;
RDebugUtils.currentLine=12845248;
 //BA.debugLineNum = 12845248;BA.debugLine="GetReportRizePishFactor3";
_getreportrizepishfactor3();
 if (true) break;

case 155:
//C
this.state = 156;
RDebugUtils.currentLine=12845250;
 //BA.debugLineNum = 12845250;BA.debugLine="If MCode.Tozie=1 Then";
if (true) break;

case 156:
//if
this.state = 167;
if ((parent.mostCurrent._mcode._tozie /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 158;
}else {
this.state = 160;
}if (true) break;

case 158:
//C
this.state = 167;
RDebugUtils.currentLine=12845251;
 //BA.debugLineNum = 12845251;BA.debugLine="GetHavaleByUser";
_gethavalebyuser();
 if (true) break;

case 160:
//C
this.state = 161;
RDebugUtils.currentLine=12845253;
 //BA.debugLineNum = 12845253;BA.debugLine="If MCode.Daryaft=1 Then";
if (true) break;

case 161:
//if
this.state = 166;
if ((parent.mostCurrent._mcode._daryaft /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 163;
}else {
this.state = 165;
}if (true) break;

case 163:
//C
this.state = 166;
RDebugUtils.currentLine=12845254;
 //BA.debugLineNum = 12845254;BA.debugLine="GetDaryaft";
_getdaryaft();
 if (true) break;

case 165:
//C
this.state = 166;
RDebugUtils.currentLine=12845256;
 //BA.debugLineNum = 12845256;BA.debugLine="MCode.GetDataStatus=False";
parent.mostCurrent._mcode._getdatastatus /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=12845257;
 //BA.debugLineNum = 12845257;BA.debugLine="StartService(Service_Helper)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._service_helper.getObject()));
RDebugUtils.currentLine=12845258;
 //BA.debugLineNum = 12845258;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 166:
//C
this.state = 167;
;
 if (true) break;

case 167:
//C
this.state = 168;
;
 if (true) break;

case 168:
//C
this.state = 495;
;
 if (true) break;

case 170:
//C
this.state = 171;
RDebugUtils.currentLine=12845267;
 //BA.debugLineNum = 12845267;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 171:
//if
this.state = 176;
if ((_str).equals("No Result")) { 
this.state = 173;
}else {
this.state = 175;
}if (true) break;

case 173:
//C
this.state = 176;
RDebugUtils.currentLine=12845269;
 //BA.debugLineNum = 12845269;BA.debugLine="ToastMessageShow(\"سفارش موجود نمی باشد\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("سفارش موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 175:
//C
this.state = 176;
RDebugUtils.currentLine=12845273;
 //BA.debugLineNum = 12845273;BA.debugLine="th.RunOnGuiThread(\"LoadGetReportRizePishFacto";
parent._th.RunOnGuiThread("LoadGetReportRizePishFactor3",new Object[]{(Object)(_str)});
 if (true) break;
;
RDebugUtils.currentLine=12845279;
 //BA.debugLineNum = 12845279;BA.debugLine="If MCode.Tozie=1 Then";

case 176:
//if
this.state = 187;
if ((parent.mostCurrent._mcode._tozie /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 178;
}else {
this.state = 180;
}if (true) break;

case 178:
//C
this.state = 187;
RDebugUtils.currentLine=12845280;
 //BA.debugLineNum = 12845280;BA.debugLine="GetHavaleByUser";
_gethavalebyuser();
 if (true) break;

case 180:
//C
this.state = 181;
RDebugUtils.currentLine=12845282;
 //BA.debugLineNum = 12845282;BA.debugLine="If MCode.Daryaft=1 Then";
if (true) break;

case 181:
//if
this.state = 186;
if ((parent.mostCurrent._mcode._daryaft /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 183;
}else {
this.state = 185;
}if (true) break;

case 183:
//C
this.state = 186;
RDebugUtils.currentLine=12845283;
 //BA.debugLineNum = 12845283;BA.debugLine="GetBankMa";
_getbankma();
 if (true) break;

case 185:
//C
this.state = 186;
RDebugUtils.currentLine=12845285;
 //BA.debugLineNum = 12845285;BA.debugLine="MCode.GetDataStatus=False";
parent.mostCurrent._mcode._getdatastatus /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=12845286;
 //BA.debugLineNum = 12845286;BA.debugLine="StartService(Service_Helper)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._service_helper.getObject()));
RDebugUtils.currentLine=12845287;
 //BA.debugLineNum = 12845287;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 186:
//C
this.state = 187;
;
 if (true) break;

case 187:
//C
this.state = 495;
;
 if (true) break;

case 189:
//C
this.state = 190;
RDebugUtils.currentLine=12845293;
 //BA.debugLineNum = 12845293;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 190:
//if
this.state = 195;
if ((_str).equals("No Result")) { 
this.state = 192;
}else {
this.state = 194;
}if (true) break;

case 192:
//C
this.state = 195;
 if (true) break;

case 194:
//C
this.state = 195;
RDebugUtils.currentLine=12845300;
 //BA.debugLineNum = 12845300;BA.debugLine="th.RunOnGuiThread(\"LoadGetGetHavale\",Array As";
parent._th.RunOnGuiThread("LoadGetGetHavale",new Object[]{(Object)(_str)});
 if (true) break;

case 195:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845304;
 //BA.debugLineNum = 12845304;BA.debugLine="ShowRizeFactorForooshByHavale";
_showrizefactorforooshbyhavale();
 if (true) break;

case 197:
//C
this.state = 198;
RDebugUtils.currentLine=12845306;
 //BA.debugLineNum = 12845306;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 198:
//if
this.state = 209;
if ((_str).equals("No Result")) { 
this.state = 200;
}else {
this.state = 208;
}if (true) break;

case 200:
//C
this.state = 201;
RDebugUtils.currentLine=12845308;
 //BA.debugLineNum = 12845308;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * Fro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblAshkhasNew");
RDebugUtils.currentLine=12845309;
 //BA.debugLineNum = 12845309;BA.debugLine="If Cu.RowCount>0 Then";
if (true) break;

case 201:
//if
this.state = 206;
if (_cu.getRowCount()>0) { 
this.state = 203;
}else {
this.state = 205;
}if (true) break;

case 203:
//C
this.state = 206;
RDebugUtils.currentLine=12845310;
 //BA.debugLineNum = 12845310;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas whe";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblAshkhas where length(FldCodeTafzili)<6");
 if (true) break;

case 205:
//C
this.state = 206;
RDebugUtils.currentLine=12845312;
 //BA.debugLineNum = 12845312;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblAshkhas");
 if (true) break;

case 206:
//C
this.state = 209;
;
RDebugUtils.currentLine=12845314;
 //BA.debugLineNum = 12845314;BA.debugLine="ToastMessageShow(\"شخصی موجود نمی باشد\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("شخصی موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 208:
//C
this.state = 209;
RDebugUtils.currentLine=12845317;
 //BA.debugLineNum = 12845317;BA.debugLine="th.RunOnGuiThread(\"LoadGetAshkhas\",Array As O";
parent._th.RunOnGuiThread("LoadGetAshkhas",new Object[]{(Object)(_str)});
 if (true) break;

case 209:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845320;
 //BA.debugLineNum = 12845320;BA.debugLine="GetFee";
_getfee();
 if (true) break;

case 211:
//C
this.state = 212;
RDebugUtils.currentLine=12845323;
 //BA.debugLineNum = 12845323;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 212:
//if
this.state = 217;
if ((_str).equals("No Result")) { 
this.state = 214;
}else {
this.state = 216;
}if (true) break;

case 214:
//C
this.state = 217;
RDebugUtils.currentLine=12845324;
 //BA.debugLineNum = 12845324;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFee\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblFee");
RDebugUtils.currentLine=12845325;
 //BA.debugLineNum = 12845325;BA.debugLine="ToastMessageShow(\"لیست چند قیمت موجود نمی باش";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست چند قیمت موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 216:
//C
this.state = 217;
RDebugUtils.currentLine=12845328;
 //BA.debugLineNum = 12845328;BA.debugLine="th.RunOnGuiThread(\"LoadGetFee\",Array As Objec";
parent._th.RunOnGuiThread("LoadGetFee",new Object[]{(Object)(_str)});
 if (true) break;

case 217:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845331;
 //BA.debugLineNum = 12845331;BA.debugLine="GetTasvie";
_gettasvie();
 if (true) break;

case 219:
//C
this.state = 220;
RDebugUtils.currentLine=12845333;
 //BA.debugLineNum = 12845333;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 220:
//if
this.state = 225;
if ((_str).equals("No Result")) { 
this.state = 222;
}else {
this.state = 224;
}if (true) break;

case 222:
//C
this.state = 225;
RDebugUtils.currentLine=12845334;
 //BA.debugLineNum = 12845334;BA.debugLine="MCode.SaveUpdate(\"Delete From TblTasvie\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblTasvie");
RDebugUtils.currentLine=12845335;
 //BA.debugLineNum = 12845335;BA.debugLine="Dim code As String=\"1000\"";
_code = "1000";
RDebugUtils.currentLine=12845336;
 //BA.debugLineNum = 12845336;BA.debugLine="Dim name As String=\"نقدی\"";
_name = "نقدی";
RDebugUtils.currentLine=12845338;
 //BA.debugLineNum = 12845338;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblTasvie (FldC";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblTasvie (FldCode,FldName) Values ('"+_code+"','"+_name+"')");
 if (true) break;

case 224:
//C
this.state = 225;
RDebugUtils.currentLine=12845343;
 //BA.debugLineNum = 12845343;BA.debugLine="th.RunOnGuiThread(\"LoadGetTasvie\",Array As Ob";
parent._th.RunOnGuiThread("LoadGetTasvie",new Object[]{(Object)(_str)});
 if (true) break;

case 225:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845346;
 //BA.debugLineNum = 12845346;BA.debugLine="MCode.SaveUpdate(\"Update TblSetting Set FldDat";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblSetting Set FldDateUpdate='"+parent._datenow+"'");
RDebugUtils.currentLine=12845349;
 //BA.debugLineNum = 12845349;BA.debugLine="GetTourVisitor";
_gettourvisitor();
 if (true) break;

case 227:
//C
this.state = 228;
RDebugUtils.currentLine=12845351;
 //BA.debugLineNum = 12845351;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 228:
//if
this.state = 233;
if ((_str).equals("No Result")) { 
this.state = 230;
}else {
this.state = 232;
}if (true) break;

case 230:
//C
this.state = 233;
RDebugUtils.currentLine=12845353;
 //BA.debugLineNum = 12845353;BA.debugLine="ToastMessageShow(\"تور ویزیت موجود نمی باشد\",T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تور ویزیت موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 232:
//C
this.state = 233;
RDebugUtils.currentLine=12845356;
 //BA.debugLineNum = 12845356;BA.debugLine="LoadGetTourVisitor(Str)";
_loadgettourvisitor(_str);
 if (true) break;
;
RDebugUtils.currentLine=12845359;
 //BA.debugLineNum = 12845359;BA.debugLine="If MCode.NoeGet=\"GetTourVisitor\" Then";

case 233:
//if
this.state = 238;
if ((parent.mostCurrent._mcode._noeget /*String*/ ).equals("GetTourVisitor")) { 
this.state = 235;
}else {
this.state = 237;
}if (true) break;

case 235:
//C
this.state = 238;
RDebugUtils.currentLine=12845360;
 //BA.debugLineNum = 12845360;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 237:
//C
this.state = 238;
RDebugUtils.currentLine=12845362;
 //BA.debugLineNum = 12845362;BA.debugLine="GetTanzimatAndroid";
_gettanzimatandroid();
 if (true) break;

case 238:
//C
this.state = 495;
;
 if (true) break;

case 240:
//C
this.state = 241;
RDebugUtils.currentLine=12845367;
 //BA.debugLineNum = 12845367;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 241:
//if
this.state = 246;
if ((_str).equals("No Result")) { 
this.state = 243;
}else {
this.state = 245;
}if (true) break;

case 243:
//C
this.state = 246;
RDebugUtils.currentLine=12845369;
 //BA.debugLineNum = 12845369;BA.debugLine="SendTokenId";
_sendtokenid();
 if (true) break;

case 245:
//C
this.state = 246;
RDebugUtils.currentLine=12845371;
 //BA.debugLineNum = 12845371;BA.debugLine="MCode.CodeMoshtari=Str";
parent.mostCurrent._mcode._codemoshtari /*String*/  = _str;
 if (true) break;

case 246:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845375;
 //BA.debugLineNum = 12845375;BA.debugLine="SendTokenId";
_sendtokenid();
 if (true) break;

case 248:
//C
this.state = 249;
RDebugUtils.currentLine=12845377;
 //BA.debugLineNum = 12845377;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 249:
//if
this.state = 256;
if ((_str).equals("No Result")) { 
this.state = 251;
}else 
{RDebugUtils.currentLine=12845381;
 //BA.debugLineNum = 12845381;BA.debugLine="Else If Str=\"No Active\" Then";
if ((_str).equals("No Active")) { 
this.state = 253;
}else {
this.state = 255;
}}
if (true) break;

case 251:
//C
this.state = 256;
RDebugUtils.currentLine=12845379;
 //BA.debugLineNum = 12845379;BA.debugLine="MCode.Vaziat=0";
parent.mostCurrent._mcode._vaziat /*int*/  = (int) (0);
 if (true) break;

case 253:
//C
this.state = 256;
RDebugUtils.currentLine=12845382;
 //BA.debugLineNum = 12845382;BA.debugLine="Dim Query As String=\"Update TblSetting Set Fl";
_query = "Update TblSetting Set FldVaziat = '0'";
RDebugUtils.currentLine=12845383;
 //BA.debugLineNum = 12845383;BA.debugLine="MCode.SaveUpdate(Query)";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,_query);
RDebugUtils.currentLine=12845386;
 //BA.debugLineNum = 12845386;BA.debugLine="MCode.Vaziat=0";
parent.mostCurrent._mcode._vaziat /*int*/  = (int) (0);
 if (true) break;

case 255:
//C
this.state = 256;
RDebugUtils.currentLine=12845389;
 //BA.debugLineNum = 12845389;BA.debugLine="th.RunOnGuiThread(\"LoadGetVaziat\",Array As Ob";
parent._th.RunOnGuiThread("LoadGetVaziat",new Object[]{(Object)(_str)});
 if (true) break;

case 256:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845392;
 //BA.debugLineNum = 12845392;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=12845393;
 //BA.debugLineNum = 12845393;BA.debugLine="GetSetting";
_getsetting();
 if (true) break;

case 258:
//C
this.state = 259;
RDebugUtils.currentLine=12845399;
 //BA.debugLineNum = 12845399;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 259:
//if
this.state = 266;
if ((_str).equals("No Result")) { 
this.state = 261;
}else 
{RDebugUtils.currentLine=12845402;
 //BA.debugLineNum = 12845402;BA.debugLine="Else If Str =\"Is Exist\" Or Str=\"OK\" Then";
if ((_str).equals("Is Exist") || (_str).equals("OK")) { 
this.state = 263;
}else {
this.state = 265;
}}
if (true) break;

case 261:
//C
this.state = 266;
RDebugUtils.currentLine=12845400;
 //BA.debugLineNum = 12845400;BA.debugLine="ToastMessageShow(\"اطلاعات ارسال شده صحیح نیست";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اطلاعات ارسال شده صحیح نیست "),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12845401;
 //BA.debugLineNum = 12845401;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 263:
//C
this.state = 266;
RDebugUtils.currentLine=12845403;
 //BA.debugLineNum = 12845403;BA.debugLine="GetVaziat";
_getvaziat();
 if (true) break;

case 265:
//C
this.state = 266;
RDebugUtils.currentLine=12845405;
 //BA.debugLineNum = 12845405;BA.debugLine="MCode.SaveUpdate(\"update TblSetting Set FldTo";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"update TblSetting Set FldTokenId='"+parent.mostCurrent._mcode._deviceid /*String*/ +"' and FldCodeMoshtari='"+parent.mostCurrent._mcode._codemoshtari /*String*/ +"' and FldNameVisitor='"+parent.mostCurrent._mcode._n_visitor /*String*/ +"' ");
RDebugUtils.currentLine=12845407;
 //BA.debugLineNum = 12845407;BA.debugLine="ToastMessageShow(\"درخواست فعالسازی با موفقیت";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("درخواست فعالسازی با موفقیت ارسال گردید"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 266:
//C
this.state = 495;
;
 if (true) break;

case 268:
//C
this.state = 269;
RDebugUtils.currentLine=12845410;
 //BA.debugLineNum = 12845410;BA.debugLine="If Str = \"Ok\" Then";
if (true) break;

case 269:
//if
this.state = 280;
if ((_str).equals("Ok")) { 
this.state = 271;
}else {
this.state = 279;
}if (true) break;

case 271:
//C
this.state = 272;
RDebugUtils.currentLine=12845411;
 //BA.debugLineNum = 12845411;BA.debugLine="If shomareFactorSelect>0 Then";
if (true) break;

case 272:
//if
this.state = 277;
if (parent._shomarefactorselect>0) { 
this.state = 274;
}else {
this.state = 276;
}if (true) break;

case 274:
//C
this.state = 277;
RDebugUtils.currentLine=12845412;
 //BA.debugLineNum = 12845412;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set FldSe";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblFaktor Set FldSend='1',FldSync='True' where FldShomareFaktor="+BA.NumberToString(parent._shomarefactorselect));
 if (true) break;

case 276:
//C
this.state = 277;
RDebugUtils.currentLine=12845414;
 //BA.debugLineNum = 12845414;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set FldSe";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblFaktor Set FldSend='1',FldSync='True'");
 if (true) break;

case 277:
//C
this.state = 280;
;
RDebugUtils.currentLine=12845417;
 //BA.debugLineNum = 12845417;BA.debugLine="ToastMessageShow(\"فاکتور با موفقیت ارسال گردی";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("فاکتور با موفقیت ارسال گردید"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 279:
//C
this.state = 280;
RDebugUtils.currentLine=12845419;
 //BA.debugLineNum = 12845419;BA.debugLine="ToastMessageShow(\"خطا در ارسال فاکتور\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("خطا در ارسال فاکتور"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 280:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845421;
 //BA.debugLineNum = 12845421;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 282:
//C
this.state = 283;
RDebugUtils.currentLine=12845425;
 //BA.debugLineNum = 12845425;BA.debugLine="If Str = \"ok\" Then";
if (true) break;

case 283:
//if
this.state = 288;
if ((_str).equals("ok")) { 
this.state = 285;
}else {
this.state = 287;
}if (true) break;

case 285:
//C
this.state = 288;
RDebugUtils.currentLine=12845427;
 //BA.debugLineNum = 12845427;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set f";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update tblTourVisitor Set fldSend='True' where fldDateVisit='"+parent.mostCurrent._mcode._datepersian /*String*/ (processBA)+"' and fldSend='False'");
RDebugUtils.currentLine=12845430;
 //BA.debugLineNum = 12845430;BA.debugLine="Log(\"تور ویزیت با موفقیت ارسال گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512845430","تور ویزیت با موفقیت ارسال گردید",0);
 if (true) break;

case 287:
//C
this.state = 288;
RDebugUtils.currentLine=12845432;
 //BA.debugLineNum = 12845432;BA.debugLine="ToastMessageShow(\"خطا در ارسال تور ویزیت\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("خطا در ارسال تور ویزیت"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 288:
//C
this.state = 495;
;
 if (true) break;

case 290:
//C
this.state = 291;
RDebugUtils.currentLine=12845438;
 //BA.debugLineNum = 12845438;BA.debugLine="If Str = \"Ok\" Then";
if (true) break;

case 291:
//if
this.state = 316;
if ((_str).equals("Ok")) { 
this.state = 293;
}else {
this.state = 315;
}if (true) break;

case 293:
//C
this.state = 294;
RDebugUtils.currentLine=12845439;
 //BA.debugLineNum = 12845439;BA.debugLine="ToastMessageShow(\"اشخاص جدید با موفقیت ارسال";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اشخاص جدید با موفقیت ارسال گردید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12845443;
 //BA.debugLineNum = 12845443;BA.debugLine="If Sendtype=\"Daryaft\" Then";
if (true) break;

case 294:
//if
this.state = 313;
if ((parent._sendtype).equals("Daryaft")) { 
this.state = 296;
}else 
{RDebugUtils.currentLine=12845447;
 //BA.debugLineNum = 12845447;BA.debugLine="Else if Sendtype=\"Faktor\" Then";
if ((parent._sendtype).equals("Faktor")) { 
this.state = 298;
}else 
{RDebugUtils.currentLine=12845455;
 //BA.debugLineNum = 12845455;BA.debugLine="Else If Sendtype=\"SendAshkhasNew\" Then";
if ((parent._sendtype).equals("SendAshkhasNew")) { 
this.state = 306;
}}}
if (true) break;

case 296:
//C
this.state = 313;
RDebugUtils.currentLine=12845444;
 //BA.debugLineNum = 12845444;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldS";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblAshkhas Set FldSync='True' where fldCodetafzili="+parent.mostCurrent._mcode._c_tafzili /*String*/ +" and FldSync='False'");
RDebugUtils.currentLine=12845445;
 //BA.debugLineNum = 12845445;BA.debugLine="SendDaryaft(dt1,dt2)";
_senddaryaft(parent._dt1,parent._dt2);
 if (true) break;

case 298:
//C
this.state = 299;
RDebugUtils.currentLine=12845448;
 //BA.debugLineNum = 12845448;BA.debugLine="If shomareFactorSelect>0 Then";
if (true) break;

case 299:
//if
this.state = 304;
if (parent._shomarefactorselect>0) { 
this.state = 301;
}else {
this.state = 303;
}if (true) break;

case 301:
//C
this.state = 304;
RDebugUtils.currentLine=12845449;
 //BA.debugLineNum = 12845449;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set Fld";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblAshkhas Set FldSync='True' where fldCodetafzili="+parent.mostCurrent._mcode._c_tafzili /*String*/ +" and FldSync='False'");
RDebugUtils.currentLine=12845450;
 //BA.debugLineNum = 12845450;BA.debugLine="LoadSendFaktor(shomareFactorSelect)";
_loadsendfaktor(BA.NumberToString(parent._shomarefactorselect));
 if (true) break;

case 303:
//C
this.state = 304;
RDebugUtils.currentLine=12845452;
 //BA.debugLineNum = 12845452;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set  Fl";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblAshkhas Set  FldSync='True' where  FldSync='False'");
RDebugUtils.currentLine=12845453;
 //BA.debugLineNum = 12845453;BA.debugLine="LoadSendFaktorAll";
_loadsendfaktorall();
 if (true) break;

case 304:
//C
this.state = 313;
;
 if (true) break;

case 306:
//C
this.state = 307;
RDebugUtils.currentLine=12845456;
 //BA.debugLineNum = 12845456;BA.debugLine="If MCode.C_Tafzili=0 Then";
if (true) break;

case 307:
//if
this.state = 312;
if ((parent.mostCurrent._mcode._c_tafzili /*String*/ ).equals(BA.NumberToString(0))) { 
this.state = 309;
}else {
this.state = 311;
}if (true) break;

case 309:
//C
this.state = 312;
RDebugUtils.currentLine=12845458;
 //BA.debugLineNum = 12845458;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set  Fl";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblAshkhas Set  FldSync='True' where  FldSync='False'");
 if (true) break;

case 311:
//C
this.state = 312;
RDebugUtils.currentLine=12845461;
 //BA.debugLineNum = 12845461;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set Fld";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblAshkhas Set FldSync='True' where fldCodetafzili="+parent.mostCurrent._mcode._c_tafzili /*String*/ +" and FldSync='False'");
 if (true) break;

case 312:
//C
this.state = 313;
;
 if (true) break;

case 313:
//C
this.state = 316;
;
 if (true) break;

case 315:
//C
this.state = 316;
RDebugUtils.currentLine=12845465;
 //BA.debugLineNum = 12845465;BA.debugLine="ToastMessageShow(\"خطا در ارسال اشخاص جدید\",Tr";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("خطا در ارسال اشخاص جدید"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 316:
//C
this.state = 495;
;
 if (true) break;

case 318:
//C
this.state = 319;
RDebugUtils.currentLine=12845469;
 //BA.debugLineNum = 12845469;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 319:
//if
this.state = 324;
if ((_str).equals("No Result")) { 
this.state = 321;
}else {
this.state = 323;
}if (true) break;

case 321:
//C
this.state = 324;
RDebugUtils.currentLine=12845471;
 //BA.debugLineNum = 12845471;BA.debugLine="ToastMessageShow(\"گزارشی موجود نمی باشد\",True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارشی موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 323:
//C
this.state = 324;
RDebugUtils.currentLine=12845473;
 //BA.debugLineNum = 12845473;BA.debugLine="LoadGetReportVisitor(Str)";
_loadgetreportvisitor(_str);
 if (true) break;

case 324:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845477;
 //BA.debugLineNum = 12845477;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 326:
//C
this.state = 327;
RDebugUtils.currentLine=12845480;
 //BA.debugLineNum = 12845480;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 327:
//if
this.state = 332;
if ((_str).equals("No Result")) { 
this.state = 329;
}else {
this.state = 331;
}if (true) break;

case 329:
//C
this.state = 332;
RDebugUtils.currentLine=12845482;
 //BA.debugLineNum = 12845482;BA.debugLine="ToastMessageShow(\"اطلاعات مسیریابی موجود نمی";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اطلاعات مسیریابی موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 331:
//C
this.state = 332;
RDebugUtils.currentLine=12845484;
 //BA.debugLineNum = 12845484;BA.debugLine="LoadGetListGpsVisitor(Str)";
_loadgetlistgpsvisitor(_str);
 if (true) break;

case 332:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845489;
 //BA.debugLineNum = 12845489;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 334:
//C
this.state = 335;
RDebugUtils.currentLine=12845491;
 //BA.debugLineNum = 12845491;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 335:
//if
this.state = 340;
if ((_str).equals("No Result")) { 
this.state = 337;
}else {
this.state = 339;
}if (true) break;

case 337:
//C
this.state = 340;
RDebugUtils.currentLine=12845493;
 //BA.debugLineNum = 12845493;BA.debugLine="ToastMessageShow(\"گزارشی موجود نمی باشد\",True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارشی موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 339:
//C
this.state = 340;
RDebugUtils.currentLine=12845495;
 //BA.debugLineNum = 12845495;BA.debugLine="LoadGetReportMoshtari(Str)";
_loadgetreportmoshtari(_str);
 if (true) break;

case 340:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845500;
 //BA.debugLineNum = 12845500;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 342:
//C
this.state = 343;
RDebugUtils.currentLine=12845503;
 //BA.debugLineNum = 12845503;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 343:
//if
this.state = 348;
if ((_str).equals("No Result")) { 
this.state = 345;
}else {
this.state = 347;
}if (true) break;

case 345:
//C
this.state = 348;
RDebugUtils.currentLine=12845505;
 //BA.debugLineNum = 12845505;BA.debugLine="ToastMessageShow(\"گزارشی موجود نمی باشد\",True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارشی موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 347:
//C
this.state = 348;
RDebugUtils.currentLine=12845507;
 //BA.debugLineNum = 12845507;BA.debugLine="LoadGetReportFactor(Str)";
_loadgetreportfactor(_str);
 if (true) break;

case 348:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845512;
 //BA.debugLineNum = 12845512;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 350:
//C
this.state = 351;
RDebugUtils.currentLine=12845514;
 //BA.debugLineNum = 12845514;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 351:
//if
this.state = 356;
if ((_str).equals("No Result")) { 
this.state = 353;
}else {
this.state = 355;
}if (true) break;

case 353:
//C
this.state = 356;
RDebugUtils.currentLine=12845516;
 //BA.debugLineNum = 12845516;BA.debugLine="ToastMessageShow(\"گزارشی موجود نمی باشد\",True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارشی موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 355:
//C
this.state = 356;
RDebugUtils.currentLine=12845518;
 //BA.debugLineNum = 12845518;BA.debugLine="LoadGetReportRizePishFactor(Str)";
_loadgetreportrizepishfactor(_str);
 if (true) break;

case 356:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845521;
 //BA.debugLineNum = 12845521;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 358:
//C
this.state = 359;
RDebugUtils.currentLine=12845523;
 //BA.debugLineNum = 12845523;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 359:
//if
this.state = 364;
if ((_str).equals("No Result")) { 
this.state = 361;
}else {
this.state = 363;
}if (true) break;

case 361:
//C
this.state = 364;
RDebugUtils.currentLine=12845524;
 //BA.debugLineNum = 12845524;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSooratHesab\"";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblSooratHesab");
RDebugUtils.currentLine=12845525;
 //BA.debugLineNum = 12845525;BA.debugLine="ToastMessageShow(\"صورت حساب موجود نمی باشد\",T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("صورت حساب موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 363:
//C
this.state = 364;
RDebugUtils.currentLine=12845527;
 //BA.debugLineNum = 12845527;BA.debugLine="LoadGetSooratHesab(Str)";
_loadgetsoorathesab(_str);
 if (true) break;

case 364:
//C
this.state = 495;
;
 if (true) break;

case 366:
//C
this.state = 367;
RDebugUtils.currentLine=12845533;
 //BA.debugLineNum = 12845533;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 367:
//if
this.state = 372;
if ((_str).equals("No Result")) { 
this.state = 369;
}else {
this.state = 371;
}if (true) break;

case 369:
//C
this.state = 372;
RDebugUtils.currentLine=12845534;
 //BA.debugLineNum = 12845534;BA.debugLine="MCode.SaveUpdate(\"Delete From TblVisitor\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblVisitor");
RDebugUtils.currentLine=12845535;
 //BA.debugLineNum = 12845535;BA.debugLine="ToastMessageShow(\"لیست ویزیتور موجود نمی باشد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست ویزیتور موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12845536;
 //BA.debugLineNum = 12845536;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 371:
//C
this.state = 372;
RDebugUtils.currentLine=12845538;
 //BA.debugLineNum = 12845538;BA.debugLine="LoadGetVisitor(Str)";
_loadgetvisitor(_str);
 if (true) break;
;
RDebugUtils.currentLine=12845540;
 //BA.debugLineNum = 12845540;BA.debugLine="Select MCode.page";

case 372:
//select
this.state = 377;
switch (BA.switchObjectToInt(parent.mostCurrent._mcode._page /*String*/ ,"Act_RepFactorVisitor","Act_LocationVisitor")) {
case 0: {
this.state = 374;
if (true) break;
}
case 1: {
this.state = 376;
if (true) break;
}
}
if (true) break;

case 374:
//C
this.state = 377;
RDebugUtils.currentLine=12845542;
 //BA.debugLineNum = 12845542;BA.debugLine="CallSubDelayed(Act_RepFactorVisitor,\"LoadDat";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._act_repfactorvisitor.getObject()),"LoadData");
 if (true) break;

case 376:
//C
this.state = 377;
RDebugUtils.currentLine=12845544;
 //BA.debugLineNum = 12845544;BA.debugLine="CallSubDelayed(Act_LocationVisitor,\"LoadVisi";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._act_locationvisitor.getObject()),"LoadVisitor");
 if (true) break;

case 377:
//C
this.state = 495;
;
 if (true) break;

case 379:
//C
this.state = 380;
RDebugUtils.currentLine=12845547;
 //BA.debugLineNum = 12845547;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 380:
//if
this.state = 385;
if ((_str).equals("No Result")) { 
this.state = 382;
}else {
this.state = 384;
}if (true) break;

case 382:
//C
this.state = 385;
RDebugUtils.currentLine=12845549;
 //BA.debugLineNum = 12845549;BA.debugLine="ToastMessageShow(\"گزارش سفارش ویزیتور موجود ن";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارش سفارش ویزیتور موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 384:
//C
this.state = 385;
RDebugUtils.currentLine=12845551;
 //BA.debugLineNum = 12845551;BA.debugLine="LoadGetReportFactorVisitor(Str)";
_loadgetreportfactorvisitor(_str);
 if (true) break;

case 385:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845554;
 //BA.debugLineNum = 12845554;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 387:
//C
this.state = 388;
RDebugUtils.currentLine=12845557;
 //BA.debugLineNum = 12845557;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 388:
//if
this.state = 393;
if ((_str).equals("No Result")) { 
this.state = 390;
}else {
this.state = 392;
}if (true) break;

case 390:
//C
this.state = 393;
RDebugUtils.currentLine=12845559;
 //BA.debugLineNum = 12845559;BA.debugLine="ToastMessageShow(\"گزارش سفارش ویزیتور موجود ن";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارش سفارش ویزیتور موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 392:
//C
this.state = 393;
RDebugUtils.currentLine=12845561;
 //BA.debugLineNum = 12845561;BA.debugLine="LoadGetReportRizFactorVisitor(Str)";
_loadgetreportrizfactorvisitor(_str);
 if (true) break;

case 393:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845564;
 //BA.debugLineNum = 12845564;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 395:
//C
this.state = 396;
RDebugUtils.currentLine=12845566;
 //BA.debugLineNum = 12845566;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 396:
//if
this.state = 401;
if ((_str).equals("No Result")) { 
this.state = 398;
}else {
this.state = 400;
}if (true) break;

case 398:
//C
this.state = 401;
 if (true) break;

case 400:
//C
this.state = 401;
RDebugUtils.currentLine=12845570;
 //BA.debugLineNum = 12845570;BA.debugLine="LoadShowFactorForooshByHavale(Str)";
_loadshowfactorforooshbyhavale(_str);
 if (true) break;

case 401:
//C
this.state = 495;
;
 if (true) break;

case 403:
//C
this.state = 404;
RDebugUtils.currentLine=12845574;
 //BA.debugLineNum = 12845574;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 404:
//if
this.state = 409;
if ((_str).equals("No Result")) { 
this.state = 406;
}else {
this.state = 408;
}if (true) break;

case 406:
//C
this.state = 409;
 if (true) break;

case 408:
//C
this.state = 409;
RDebugUtils.currentLine=12845578;
 //BA.debugLineNum = 12845578;BA.debugLine="LoadShowRizeFactorForooshByHavale(Str)";
_loadshowrizefactorforooshbyhavale(_str);
 if (true) break;

case 409:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845582;
 //BA.debugLineNum = 12845582;BA.debugLine="GetBankMa";
_getbankma();
 if (true) break;

case 411:
//C
this.state = 412;
RDebugUtils.currentLine=12845584;
 //BA.debugLineNum = 12845584;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 412:
//if
this.state = 417;
if ((_str).equals("No Result")) { 
this.state = 414;
}else {
this.state = 416;
}if (true) break;

case 414:
//C
this.state = 417;
 if (true) break;

case 416:
//C
this.state = 417;
RDebugUtils.currentLine=12845588;
 //BA.debugLineNum = 12845588;BA.debugLine="LoadGetBankMa(Str)";
_loadgetbankma(_str);
 if (true) break;

case 417:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845591;
 //BA.debugLineNum = 12845591;BA.debugLine="GetBankMoshtari";
_getbankmoshtari();
 if (true) break;

case 419:
//C
this.state = 420;
RDebugUtils.currentLine=12845593;
 //BA.debugLineNum = 12845593;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 420:
//if
this.state = 425;
if ((_str).equals("No Result")) { 
this.state = 422;
}else {
this.state = 424;
}if (true) break;

case 422:
//C
this.state = 425;
 if (true) break;

case 424:
//C
this.state = 425;
RDebugUtils.currentLine=12845597;
 //BA.debugLineNum = 12845597;BA.debugLine="LoadGetBankMoshtari(Str)";
_loadgetbankmoshtari(_str);
 if (true) break;

case 425:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845600;
 //BA.debugLineNum = 12845600;BA.debugLine="GetSandoogh";
_getsandoogh();
 if (true) break;

case 427:
//C
this.state = 428;
RDebugUtils.currentLine=12845602;
 //BA.debugLineNum = 12845602;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 428:
//if
this.state = 433;
if ((_str).equals("No Result")) { 
this.state = 430;
}else {
this.state = 432;
}if (true) break;

case 430:
//C
this.state = 433;
 if (true) break;

case 432:
//C
this.state = 433;
RDebugUtils.currentLine=12845606;
 //BA.debugLineNum = 12845606;BA.debugLine="LoadGetSandoogh(Str)";
_loadgetsandoogh(_str);
 if (true) break;

case 433:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845609;
 //BA.debugLineNum = 12845609;BA.debugLine="GetDaryaft";
_getdaryaft();
 if (true) break;

case 435:
//C
this.state = 436;
RDebugUtils.currentLine=12845611;
 //BA.debugLineNum = 12845611;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 436:
//if
this.state = 441;
if ((_str).equals("No Result")) { 
this.state = 438;
}else {
this.state = 440;
}if (true) break;

case 438:
//C
this.state = 441;
 if (true) break;

case 440:
//C
this.state = 441;
RDebugUtils.currentLine=12845615;
 //BA.debugLineNum = 12845615;BA.debugLine="LoadGetDaryaft(Str)";
_loadgetdaryaft(_str);
 if (true) break;

case 441:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845618;
 //BA.debugLineNum = 12845618;BA.debugLine="GetCheckDaryaft";
_getcheckdaryaft();
 if (true) break;

case 443:
//C
this.state = 444;
RDebugUtils.currentLine=12845620;
 //BA.debugLineNum = 12845620;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 444:
//if
this.state = 449;
if ((_str).equals("No Result")) { 
this.state = 446;
}else {
this.state = 448;
}if (true) break;

case 446:
//C
this.state = 449;
 if (true) break;

case 448:
//C
this.state = 449;
RDebugUtils.currentLine=12845624;
 //BA.debugLineNum = 12845624;BA.debugLine="LoadGetCheckDaryaft(Str)";
_loadgetcheckdaryaft(_str);
 if (true) break;
;
RDebugUtils.currentLine=12845628;
 //BA.debugLineNum = 12845628;BA.debugLine="If MCode.page=\"Act_HavaleTozie\" Then";

case 449:
//if
this.state = 452;
if ((parent.mostCurrent._mcode._page /*String*/ ).equals("Act_HavaleTozie")) { 
this.state = 451;
}if (true) break;

case 451:
//C
this.state = 452;
RDebugUtils.currentLine=12845629;
 //BA.debugLineNum = 12845629;BA.debugLine="CallSubDelayed(Act_HavaleTozie,\"LoadFilter\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._act_havaletozie.getObject()),"LoadFilter");
 if (true) break;

case 452:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845631;
 //BA.debugLineNum = 12845631;BA.debugLine="MCode.GetDataStatus=False";
parent.mostCurrent._mcode._getdatastatus /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=12845632;
 //BA.debugLineNum = 12845632;BA.debugLine="StartService(Service_Helper)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._service_helper.getObject()));
RDebugUtils.currentLine=12845633;
 //BA.debugLineNum = 12845633;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 454:
//C
this.state = 455;
RDebugUtils.currentLine=12845635;
 //BA.debugLineNum = 12845635;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 455:
//if
this.state = 460;
if ((_str).equals("No Result")) { 
this.state = 457;
}else {
this.state = 459;
}if (true) break;

case 457:
//C
this.state = 460;
RDebugUtils.currentLine=12845636;
 //BA.debugLineNum = 12845636;BA.debugLine="ToastMessageShow(\"لیست ویدیو موجود نمی باشد\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست ویدیو موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 459:
//C
this.state = 460;
RDebugUtils.currentLine=12845639;
 //BA.debugLineNum = 12845639;BA.debugLine="LoadGetVideoAmoozesh(Str)";
_loadgetvideoamoozesh(_str);
 if (true) break;

case 460:
//C
this.state = 495;
;
 if (true) break;

case 462:
//C
this.state = 463;
RDebugUtils.currentLine=12845642;
 //BA.debugLineNum = 12845642;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 463:
//if
this.state = 468;
if ((_str).equals("No Result")) { 
this.state = 465;
}else {
this.state = 467;
}if (true) break;

case 465:
//C
this.state = 468;
 if (true) break;

case 467:
//C
this.state = 468;
RDebugUtils.currentLine=12845646;
 //BA.debugLineNum = 12845646;BA.debugLine="LoadGetPicFTPForAndroid(Str)";
_loadgetpicftpforandroid(_str);
 if (true) break;

case 468:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845648;
 //BA.debugLineNum = 12845648;BA.debugLine="GetGalleryKala";
_getgallerykala();
 if (true) break;

case 470:
//C
this.state = 471;
RDebugUtils.currentLine=12845650;
 //BA.debugLineNum = 12845650;BA.debugLine="If Str = \"Ok\" Then";
if (true) break;

case 471:
//if
this.state = 476;
if ((_str).equals("Ok")) { 
this.state = 473;
}else {
this.state = 475;
}if (true) break;

case 473:
//C
this.state = 476;
RDebugUtils.currentLine=12845651;
 //BA.debugLineNum = 12845651;BA.debugLine="ToastMessageShow(\"دریافت با موفقیت ارسال گردی";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت با موفقیت ارسال گردید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12845653;
 //BA.debugLineNum = 12845653;BA.debugLine="MCode.SaveUpdate(\"Update TblDaryaft Set fldSe";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblDaryaft Set fldSend=1 where fldShomareDaryaft="+parent.mostCurrent._mcode._shomaredaryaft /*String*/ );
RDebugUtils.currentLine=12845655;
 //BA.debugLineNum = 12845655;BA.debugLine="MCode.SaveUpdate(\"Update TblCheckDaryafti Set";
parent.mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblCheckDaryafti Set fldSend=1 where fldShomareDaryaft="+parent.mostCurrent._mcode._shomaredaryaft /*String*/ );
RDebugUtils.currentLine=12845656;
 //BA.debugLineNum = 12845656;BA.debugLine="CallSubDelayed(Act_Mali,\"btnNew_Click\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._act_mali.getObject()),"btnNew_Click");
 if (true) break;

case 475:
//C
this.state = 476;
RDebugUtils.currentLine=12845658;
 //BA.debugLineNum = 12845658;BA.debugLine="ToastMessageShow(\"خطا در ارسال دریافت\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("خطا در ارسال دریافت"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 476:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845660;
 //BA.debugLineNum = 12845660;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 478:
//C
this.state = 479;
RDebugUtils.currentLine=12845662;
 //BA.debugLineNum = 12845662;BA.debugLine="If Str = \"No Result\" Then";
if (true) break;

case 479:
//if
this.state = 494;
if ((_str).equals("No Result")) { 
this.state = 481;
}else {
this.state = 483;
}if (true) break;

case 481:
//C
this.state = 494;
RDebugUtils.currentLine=12845664;
 //BA.debugLineNum = 12845664;BA.debugLine="ToastMessageShow(\"خطا در بروزرسانی\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("خطا در بروزرسانی"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 483:
//C
this.state = 484;
RDebugUtils.currentLine=12845666;
 //BA.debugLineNum = 12845666;BA.debugLine="If MCode.page=\"Act_RizeFactorHavale\" Then";
if (true) break;

case 484:
//if
this.state = 487;
if ((parent.mostCurrent._mcode._page /*String*/ ).equals("Act_RizeFactorHavale")) { 
this.state = 486;
}if (true) break;

case 486:
//C
this.state = 487;
RDebugUtils.currentLine=12845667;
 //BA.debugLineNum = 12845667;BA.debugLine="CallSubDelayed(Act_RizeFactorHavale,\"btnUpda";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._act_rizefactorhavale.getObject()),"btnUpdate_Click");
 if (true) break;
;
RDebugUtils.currentLine=12845669;
 //BA.debugLineNum = 12845669;BA.debugLine="If MCode.page=\"Act_RepFactorVisitor\" Then";

case 487:
//if
this.state = 490;
if ((parent.mostCurrent._mcode._page /*String*/ ).equals("Act_RepFactorVisitor")) { 
this.state = 489;
}if (true) break;

case 489:
//C
this.state = 490;
RDebugUtils.currentLine=12845670;
 //BA.debugLineNum = 12845670;BA.debugLine="CallSubDelayed(Act_RepFactorVisitor,\"BtnRepo";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._act_repfactorvisitor.getObject()),"BtnReport_Click");
 if (true) break;
;
RDebugUtils.currentLine=12845673;
 //BA.debugLineNum = 12845673;BA.debugLine="If MCode.page=\"Act_RepRizFactorVisitor\" Then";

case 490:
//if
this.state = 493;
if ((parent.mostCurrent._mcode._page /*String*/ ).equals("Act_RepRizFactorVisitor")) { 
this.state = 492;
}if (true) break;

case 492:
//C
this.state = 493;
RDebugUtils.currentLine=12845674;
 //BA.debugLineNum = 12845674;BA.debugLine="CallSubDelayed(Act_RepRizFactorVisitor,\"LblB";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._act_reprizfactorvisitor.getObject()),"LblBack_Click");
 if (true) break;

case 493:
//C
this.state = 494;
;
 if (true) break;

case 494:
//C
this.state = 495;
;
RDebugUtils.currentLine=12845678;
 //BA.debugLineNum = 12845678;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=12845679;
 //BA.debugLineNum = 12845679;BA.debugLine="MCode.GetDataStatus=False";
parent.mostCurrent._mcode._getdatastatus /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=12845680;
 //BA.debugLineNum = 12845680;BA.debugLine="StartService(Service_Helper)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._service_helper.getObject()));
 if (true) break;

case 495:
//C
this.state = 498;
;
 if (true) break;

case 497:
//C
this.state = 498;
this.catchState = 511;
RDebugUtils.currentLine=12845683;
 //BA.debugLineNum = 12845683;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("512845683",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 498:
//C
this.state = 509;
this.catchState = 511;
;
RDebugUtils.currentLine=12845685;
 //BA.debugLineNum = 12845685;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 500:
//C
this.state = 501;
RDebugUtils.currentLine=12845688;
 //BA.debugLineNum = 12845688;BA.debugLine="StartActivity(Act_Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._act_main.getObject()));
RDebugUtils.currentLine=12845689;
 //BA.debugLineNum = 12845689;BA.debugLine="If	MCode.IsConnected=False Then";
if (true) break;

case 501:
//if
this.state = 504;
if (parent.mostCurrent._mcode._isconnected /*boolean*/ (processBA)==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 503;
}if (true) break;

case 503:
//C
this.state = 504;
RDebugUtils.currentLine=12845690;
 //BA.debugLineNum = 12845690;BA.debugLine="ToastMessageShow(\"خطا در دسترسی اینترنت\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("خطا در دسترسی اینترنت"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12845691;
 //BA.debugLineNum = 12845691;BA.debugLine="myCode.SendError(j.ErrorMessage,\"Service_Server-";
parent.mostCurrent._mycode._senderror /*void*/ (processBA,_j._errormessage /*String*/ ,"Service_Server-JobDone-"+_str+"-"+parent.mostCurrent._mcode._page /*String*/ );
 if (true) break;

case 504:
//C
this.state = 505;
;
RDebugUtils.currentLine=12845694;
 //BA.debugLineNum = 12845694;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=12845696;
 //BA.debugLineNum = 12845696;BA.debugLine="MCode.GetDataStatus=False";
parent.mostCurrent._mcode._getdatastatus /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=12845697;
 //BA.debugLineNum = 12845697;BA.debugLine="StartService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=12845698;
 //BA.debugLineNum = 12845698;BA.debugLine="StartService(Service_Helper)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._service_helper.getObject()));
RDebugUtils.currentLine=12845699;
 //BA.debugLineNum = 12845699;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512845699","Gps Start",0);
RDebugUtils.currentLine=12845700;
 //BA.debugLineNum = 12845700;BA.debugLine="If MCode.IsOnlineDataFactor=1 Then";
if (true) break;

case 505:
//if
this.state = 508;
if ((parent.mostCurrent._mcode._isonlinedatafactor /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 507;
}if (true) break;

case 507:
//C
this.state = 508;
RDebugUtils.currentLine=12845702;
 //BA.debugLineNum = 12845702;BA.debugLine="Log(\"Notifi Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512845702","Notifi Start",0);
 if (true) break;

case 508:
//C
this.state = 509;
;
 if (true) break;

case 509:
//C
this.state = 512;
;
RDebugUtils.currentLine=12845707;
 //BA.debugLineNum = 12845707;BA.debugLine="jobInternet.Release";
parent._jobinternet._release /*String*/ (null);
RDebugUtils.currentLine=12845708;
 //BA.debugLineNum = 12845708;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "service_server", "request"),(int) (1000));
this.state = 514;
return;
case 514:
//C
this.state = 512;
;
 if (true) break;

case 511:
//C
this.state = 512;
this.catchState = 0;
RDebugUtils.currentLine=12845710;
 //BA.debugLineNum = 12845710;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=12845711;
 //BA.debugLineNum = 12845711;BA.debugLine="MCode.GetDataStatus=False";
parent.mostCurrent._mcode._getdatastatus /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=12845712;
 //BA.debugLineNum = 12845712;BA.debugLine="StartService(Service_Helper)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._service_helper.getObject()));
RDebugUtils.currentLine=12845713;
 //BA.debugLineNum = 12845713;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("512845713",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 512:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12845716;
 //BA.debugLineNum = 12845716;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _getbankma() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getbankma", false))
	 {return ((String) Debug.delegate(processBA, "getbankma", null));}
String _dateupdate = "";
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub GetBankMa";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="jobInternet.JobName =\"GetBankMa\"";
_jobinternet._jobname /*String*/  = "GetBankMa";
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="Dim DateUpdate As String=\"\"";
_dateupdate = "";
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetStoredTozieFast","NameStored=ShowBankeMa"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ +"&flag="+BA.NumberToString(mostCurrent._mcode._gethavaleflag /*int*/ )+"&LastDateUpdate="+_dateupdate);
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="End Sub";
return "";
}
public static String  _getbankmoshtari() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getbankmoshtari", false))
	 {return ((String) Debug.delegate(processBA, "getbankmoshtari", null));}
String _dateupdate = "";
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Sub GetBankMoshtari";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="jobInternet.JobName =\"GetBankMoshtari\"";
_jobinternet._jobname /*String*/  = "GetBankMoshtari";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Dim DateUpdate As String=\"\"";
_dateupdate = "";
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetStoredTozieFast","NameStored=ShowBankeMoshtari"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ +"&flag="+BA.NumberToString(mostCurrent._mcode._gethavaleflag /*int*/ )+"&LastDateUpdate="+_dateupdate);
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="End Sub";
return "";
}
public static String  _getcheckdaryaft() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getcheckdaryaft", false))
	 {return ((String) Debug.delegate(processBA, "getcheckdaryaft", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub GetCheckDaryaft";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="jobInternet.JobName =\"GetCheckDaryaft\"";
_jobinternet._jobname /*String*/  = "GetCheckDaryaft";
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetDaryaft","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &type=CheckDaryaft");
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="End Sub";
return "";
}
public static String  _getcodemoshtari() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getcodemoshtari", false))
	 {return ((String) Debug.delegate(processBA, "getcodemoshtari", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub GetCodeMoshtari";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="jobInternet.JobName =\"GetCodeMoshtari\"";
_jobinternet._jobname /*String*/  = "GetCodeMoshtari";
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetCodeMoshtari","imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrentdate() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getcurrentdate", false))
	 {return ((String) Debug.delegate(processBA, "getcurrentdate", null));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub GetCurrentDate";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="jobInternet.JobName =\"GetCurrentDate\"";
_jobinternet._jobname /*String*/  = "GetCurrentDate";
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetCurrentDate",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="End Sub";
return "";
}
public static String  _getdaftarchtell() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getdaftarchtell", false))
	 {return ((String) Debug.delegate(processBA, "getdaftarchtell", null));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub GetDaftarchTell";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="jobInternet.JobName =\"GetDaftarchTell\"";
_jobinternet._jobname /*String*/  = "GetDaftarchTell";
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetDaftarchTell","Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="End Sub";
return "";
}
public static String  _getdaryaft() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getdaryaft", false))
	 {return ((String) Debug.delegate(processBA, "getdaryaft", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub GetDaryaft";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="jobInternet.JobName =\"GetDaryaft\"";
_jobinternet._jobname /*String*/  = "GetDaryaft";
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetDaryaft","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &type=Daryaft");
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="End Sub";
return "";
}
public static String  _geteshantion() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "geteshantion", false))
	 {return ((String) Debug.delegate(processBA, "geteshantion", null));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub GetEshantion";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="jobInternet.JobName =\"GetEshantion\"";
_jobinternet._jobname /*String*/  = "GetEshantion";
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=select fldCodeKala,fldTedadEshantion,fldCountForoosh,fldVaziat from tblEshantionVisitori where fldCodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ +" &Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=8192009;
 //BA.debugLineNum = 8192009;BA.debugLine="End Sub";
return "";
}
public static String  _geteshantion2() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "geteshantion2", false))
	 {return ((String) Debug.delegate(processBA, "geteshantion2", null));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub GetEshantion2";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="jobInternet.JobName =\"GetEshantion2\"";
_jobinternet._jobname /*String*/  = "GetEshantion2";
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetEshantion2","Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="End Sub";
return "";
}
public static String  _geteshantiongroup() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "geteshantiongroup", false))
	 {return ((String) Debug.delegate(processBA, "geteshantiongroup", null));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub GetEshantionGroup";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="jobInternet.JobName =\"GetEshantionGroup\"";
_jobinternet._jobname /*String*/  = "GetEshantionGroup";
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetEshantionGroup","Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="End Sub";
return "";
}
public static String  _getfee() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getfee", false))
	 {return ((String) Debug.delegate(processBA, "getfee", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub GetFee";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="jobInternet.JobName =\"GetFee\"";
_jobinternet._jobname /*String*/  = "GetFee";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=Select fldCodeKala,fldCodeTasvie,fldFee From tblFee"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="End Sub";
return "";
}
public static String  _getgallerykala() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getgallerykala", false))
	 {return ((String) Debug.delegate(processBA, "getgallerykala", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub GetGalleryKala";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="jobInternet.JobName =\"GetGalleryKala\"";
_jobinternet._jobname /*String*/  = "GetGalleryKala";
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=select * from tblGalleryPic "+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="End Sub";
return "";
}
public static String  _getgoroohashkhas() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getgoroohashkhas", false))
	 {return ((String) Debug.delegate(processBA, "getgoroohashkhas", null));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub GetGoroohAshkhas";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="jobInternet.JobName =\"GetGoroohAshkhas\"";
_jobinternet._jobname /*String*/  = "GetGoroohAshkhas";
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetListGroupAshkhas2","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ );
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="End Sub";
return "";
}
public static String  _getgoroohkala() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getgoroohkala", false))
	 {return ((String) Debug.delegate(processBA, "getgoroohkala", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub GetGoroohKala";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="jobInternet.JobName =\"GetGoroohKala\"";
_jobinternet._jobname /*String*/  = "GetGoroohKala";
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="If MCode.DastrasiGroupKala=1 Then";
if (mostCurrent._mcode._dastrasigroupkala /*int*/ ==1) { 
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupKala ORDER BY CONVERT(varchar, fldGroupId)"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
 }else {
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupKala WHERE  fldGroupId in(SELECT  fldCodeGroup FROM   tblGroupDastrasiKala WHERE        (fldVizitor = "+mostCurrent._mcode._c_visitor /*String*/ +")) ORDER BY CONVERT(varchar, fldGroupId)"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
 };
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=7667723;
 //BA.debugLineNum = 7667723;BA.debugLine="End Sub";
return "";
}
public static String  _getgroupdastrasiashkhas() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getgroupdastrasiashkhas", false))
	 {return ((String) Debug.delegate(processBA, "getgroupdastrasiashkhas", null));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub GetGroupDastrasiAshkhas";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="jobInternet.JobName =\"GetGroupDastrasiAshkhas\"";
_jobinternet._jobname /*String*/  = "GetGroupDastrasiAshkhas";
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetGroupDastrasiAshkhas","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ );
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="End Sub";
return "";
}
public static String  _gethavalebyuser() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "gethavalebyuser", false))
	 {return ((String) Debug.delegate(processBA, "gethavalebyuser", null));}
String _dateupdate = "";
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub GetHavaleByUser";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="jobInternet.JobName =\"GetHavaleByUser\"";
_jobinternet._jobname /*String*/  = "GetHavaleByUser";
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Dim DateUpdate As String=\"\"";
_dateupdate = "";
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/ShowHavaleGoroohiByRanadeh","&Imei="+mostCurrent._mcode._deviceid /*String*/ +"&flag="+BA.NumberToString(mostCurrent._mcode._gethavaleflag /*int*/ )+"&DateUpdate="+_dateupdate);
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="End Sub";
return "";
}
public static String  _getkala() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getkala", false))
	 {return ((String) Debug.delegate(processBA, "getkala", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub GetKala";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="jobInternet.JobName =\"GetKala\"";
_jobinternet._jobname /*String*/  = "GetKala";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Log (MCode.DeviceId)";
anywheresoftware.b4a.keywords.Common.LogImpl("57143426",mostCurrent._mcode._deviceid /*String*/ ,0);
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetListKala","&fldFeeTasvie="+mostCurrent._mcode._feecode /*String*/ +"&Imei="+mostCurrent._mcode._deviceid /*String*/ +"&Version=2");
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="End Sub";
return "";
}
public static String  _getlinkftp() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getlinkftp", false))
	 {return ((String) Debug.delegate(processBA, "getlinkftp", null));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub GetLinkFtp";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="If	MCode.PicOnline=1 Then";
if ((mostCurrent._mcode._piconline /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="GetPicFTPForAndroid";
_getpicftpforandroid();
 }else {
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="GetGalleryKala";
_getgallerykala();
 };
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="End Sub";
return "";
}
public static String  _getpicftpforandroid() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getpicftpforandroid", false))
	 {return ((String) Debug.delegate(processBA, "getpicftpforandroid", null));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub GetPicFTPForAndroid";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="jobInternet.JobName =\"GetPicFTPForAndroid\"";
_jobinternet._jobname /*String*/  = "GetPicFTPForAndroid";
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetPicFTPForAndroid","CodeMoshtari="+mostCurrent._mcode._codemoshtari /*String*/ +"&Type=kala");
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="End Sub";
return "";
}
public static String  _getlistgpsvisitor() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getlistgpsvisitor", false))
	 {return ((String) Debug.delegate(processBA, "getlistgpsvisitor", null));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub GetListGpsVisitor";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="jobInternet.JobName =\"GetListGpsVisitor\"";
_jobinternet._jobname /*String*/  = "GetListGpsVisitor";
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetListGpsVisitor","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._codevisitorselect /*String*/ +" &DateTa="+mostCurrent._mcode._gpsdateta /*String*/ +" &TimeAz="+mostCurrent._mcode._gpstimeaz /*String*/ +" &TimeTa="+mostCurrent._mcode._gpstimeta /*String*/ +" &Count="+mostCurrent._mcode._countshowgpsmap /*String*/ );
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="End Sub";
return "";
}
public static String  _getreportfactor(String _dateaz,String _dateta) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getreportfactor", false))
	 {return ((String) Debug.delegate(processBA, "getreportfactor", new Object[] {_dateaz,_dateta}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub GetReportFactor(DateAz As String,DateTa As Str";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="jobInternet.JobName =\"GetReportFactor\"";
_jobinternet._jobname /*String*/  = "GetReportFactor";
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetReportFactor","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ +" &CodeTafsili="+mostCurrent._mcode._codemoshtariselect /*String*/ +" &DateAz="+_dateaz+" &DateTa="+_dateta);
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="End Sub";
return "";
}
public static String  _getreportfactorvisitor(String _dateaz,String _dateta) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getreportfactorvisitor", false))
	 {return ((String) Debug.delegate(processBA, "getreportfactorvisitor", new Object[] {_dateaz,_dateta}));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub GetReportFactorVisitor(DateAz As String,DateTa";
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="jobInternet.JobName =\"GetReportFactorVisitor\"";
_jobinternet._jobname /*String*/  = "GetReportFactorVisitor";
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetReportFactor2","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._codevisitorselect /*String*/ +" &DateAz="+_dateaz+" &DateTa="+_dateta);
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="End Sub";
return "";
}
public static String  _getreportmoshtari(String _dateaz,String _dateta) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getreportmoshtari", false))
	 {return ((String) Debug.delegate(processBA, "getreportmoshtari", new Object[] {_dateaz,_dateta}));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub GetReportMoshtari(DateAz As String,DateTa As S";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="jobInternet.JobName =\"GetReportMoshtari\"";
_jobinternet._jobname /*String*/  = "GetReportMoshtari";
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetReportMoshtari2","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ +" &CodeTafsili="+mostCurrent._mcode._codemoshtariselect /*String*/ +" &DateAz="+_dateaz+" &DateTa="+_dateta);
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="End Sub";
return "";
}
public static String  _getreportrizepishfactor(String _shomarefactor) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getreportrizepishfactor", false))
	 {return ((String) Debug.delegate(processBA, "getreportrizepishfactor", new Object[] {_shomarefactor}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub GetReportRizePishFactor(ShomareFactor As Strin";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="jobInternet.JobName =\"GetReportRizePishFactor\"";
_jobinternet._jobname /*String*/  = "GetReportRizePishFactor";
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetReportRizePishFactor","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ +" &CodeTafsili="+mostCurrent._mcode._c_tafzili /*String*/ +" &fldShomarehFactor="+_shomarefactor);
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="End Sub";
return "";
}
public static String  _getreportrizepishfactor3() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getreportrizepishfactor3", false))
	 {return ((String) Debug.delegate(processBA, "getreportrizepishfactor3", null));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub GetReportRizePishFactor3";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="jobInternet.JobName =\"GetReportRizePishFactor3\"";
_jobinternet._jobname /*String*/  = "GetReportRizePishFactor3";
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetRizReportFactor6","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ );
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="End Sub";
return "";
}
public static String  _getreportrizfactorvisitor(String _date) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getreportrizfactorvisitor", false))
	 {return ((String) Debug.delegate(processBA, "getreportrizfactorvisitor", new Object[] {_date}));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub GetReportRizFactorVisitor(date As String)";
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="jobInternet.JobName =\"GetReportRizFactorVisitor\"";
_jobinternet._jobname /*String*/  = "GetReportRizFactorVisitor";
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetRizReportFactor4","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ +" &ShomareFactor="+mostCurrent._mcode._faktorselect /*String*/ +" &fldDate="+_date);
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="End Sub";
return "";
}
public static String  _getreportvisitor(String _dateaz,String _dateta) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getreportvisitor", false))
	 {return ((String) Debug.delegate(processBA, "getreportvisitor", new Object[] {_dateaz,_dateta}));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub GetReportVisitor(DateAz As String,DateTa As St";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="jobInternet.JobName =\"GetReportVisitor\"";
_jobinternet._jobname /*String*/  = "GetReportVisitor";
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetReportVisitor1","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ +" &DateAz="+_dateaz+" &DateTa="+_dateta);
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="End Sub";
return "";
}
public static String  _getsandoogh() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getsandoogh", false))
	 {return ((String) Debug.delegate(processBA, "getsandoogh", null));}
String _dateupdate = "";
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Sub GetSandoogh";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="jobInternet.JobName =\"GetSandoogh\"";
_jobinternet._jobname /*String*/  = "GetSandoogh";
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="Dim DateUpdate As String=\"\"";
_dateupdate = "";
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetStoredTozieFast","NameStored=ShowListSandoogh"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ +"&flag="+BA.NumberToString(mostCurrent._mcode._gethavaleflag /*int*/ )+"&LastDateUpdate="+_dateupdate);
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="End Sub";
return "";
}
public static String  _getsetting() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getsetting", false))
	 {return ((String) Debug.delegate(processBA, "getsetting", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub GetSetting";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="jobInternet.JobName =\"GetSetting\"";
_jobinternet._jobname /*String*/  = "GetSetting";
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetSetting","Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="End Sub";
return "";
}
public static String  _getsoorathesab(String _dateaz,String _dateta) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getsoorathesab", false))
	 {return ((String) Debug.delegate(processBA, "getsoorathesab", new Object[] {_dateaz,_dateta}));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub GetSooratHesab(DateAz As String,DateTa As Stri";
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="jobInternet.JobName =\"GetSooratHesab\"";
_jobinternet._jobname /*String*/  = "GetSooratHesab";
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/ShowSooratHesabNew","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeTafzili="+mostCurrent._mcode._c_tafzili /*String*/ +" &DateAz="+_dateaz+" &DateTa="+_dateta);
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="End Sub";
return "";
}
public static String  _gettanzimatandroid() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "gettanzimatandroid", false))
	 {return ((String) Debug.delegate(processBA, "gettanzimatandroid", null));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub GetTanzimatAndroid";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="jobInternet.JobName =\"GetTanzimatAndroid\"";
_jobinternet._jobname /*String*/  = "GetTanzimatAndroid";
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=Select * From tblTanzimatAndroid"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="End Sub";
return "";
}
public static String  _gettasvie() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "gettasvie", false))
	 {return ((String) Debug.delegate(processBA, "gettasvie", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub GetTasvie";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="jobInternet.JobName =\"GetTasvie\"";
_jobinternet._jobname /*String*/  = "GetTasvie";
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=Select fldCode,fldName From tblTasvie"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="End Sub";
return "";
}
public static String  _gettourvisitor() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "gettourvisitor", false))
	 {return ((String) Debug.delegate(processBA, "gettourvisitor", null));}
String _date = "";
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Sub GetTourVisitor";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="jobInternet.JobName =\"GetTourVisitor\"";
_jobinternet._jobname /*String*/  = "GetTourVisitor";
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Dim date As String=MCode.DatePersian";
_date = mostCurrent._mcode._datepersian /*String*/ (processBA);
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetTourVisitor","Imei="+mostCurrent._mcode._deviceid /*String*/ +"&CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ +"&DateVisit="+_date);
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="End Sub";
return "";
}
public static String  _getvaziat() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getvaziat", false))
	 {return ((String) Debug.delegate(processBA, "getvaziat", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub GetVaziat";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="jobInternet.JobName =\"GetVaziat\"";
_jobinternet._jobname /*String*/  = "GetVaziat";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetVaziat","fldTokenId="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="End Sub";
return "";
}
public static String  _getversion(String _strtype) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getversion", false))
	 {return ((String) Debug.delegate(processBA, "getversion", new Object[] {_strtype}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub GetVersion(strType As String)";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="jobInternet.JobName =\"GetVersion\"";
_jobinternet._jobname /*String*/  = "GetVersion";
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/Version","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &Type="+_strtype);
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="End Sub";
return "";
}
public static String  _getvideoamoozesh() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getvideoamoozesh", false))
	 {return ((String) Debug.delegate(processBA, "getvideoamoozesh", null));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub GetVideoAmoozesh";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="jobInternet.JobName =\"GetVideoAmoozesh\"";
_jobinternet._jobname /*String*/  = "GetVideoAmoozesh";
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetVideoAmoozesh","Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="End Sub";
return "";
}
public static String  _getvisitor() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "getvisitor", false))
	 {return ((String) Debug.delegate(processBA, "getvisitor", null));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub GetVisitor";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="jobInternet.JobName =\"GetVisitor\"";
_jobinternet._jobname /*String*/  = "GetVisitor";
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=select FldC_Visitor,FldN_Visitor from TblSetting where len(FldImei)>5 "+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetallnotification(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetallnotification", false))
	 {return ((String) Debug.delegate(processBA, "loadgetallnotification", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub LoadGetAllNotification(Str As String)";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Try";
try {RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="MCode.SaveUpdate(\"Delete From TblNotifi\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblNotifi");
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblNotifi (Id,FldT";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblNotifi (Id,FldTitle,FldBody,FldDate,FldTime) Values ('"+BA.ObjectToString(_row.Get((Object)("Id")))+"','"+BA.ObjectToString(_row.Get((Object)("fldTitle")))+"','"+BA.ObjectToString(_row.Get((Object)("fldBody")))+"','"+BA.ObjectToString(_row.Get((Object)("fldDate")))+"','"+BA.ObjectToString(_row.Get((Object)("fldTime")))+"')");
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="Log(Row.Get(\"fldTitle\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("58912908",BA.ObjectToString(_row.Get((Object)("fldTitle"))),0);
 }
};
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="Log(\"نوتیفیکیشن بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("58912910","نوتیفیکیشن بروزرسانی گردید",0);
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=8912912;
 //BA.debugLineNum = 8912912;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("58912912",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=8912913;
 //BA.debugLineNum = 8912913;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetAllNotification");
 };
RDebugUtils.currentLine=8912915;
 //BA.debugLineNum = 8912915;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetashkhas(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetashkhas", false))
	 {return ((String) Debug.delegate(processBA, "loadgetashkhas", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
int _count = 0;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub LoadGetAshkhas(Str As String)";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Try";
try {RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="Dim Cu As  Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=7340051;
 //BA.debugLineNum = 7340051;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas where l";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblAshkhas where length(fldCodetafzili)<6");
RDebugUtils.currentLine=7340052;
 //BA.debugLineNum = 7340052;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblAshkhas\",RowsLi";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblAshkhas",_rowslist);
RDebugUtils.currentLine=7340053;
 //BA.debugLineNum = 7340053;BA.debugLine="Cu=MCode.Result(\"Select * From TblAshkhas\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblAshkhas");
RDebugUtils.currentLine=7340054;
 //BA.debugLineNum = 7340054;BA.debugLine="Log(\"لیست اشخاص بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("57340054","لیست اشخاص بروزرسانی گردید",0);
RDebugUtils.currentLine=7340057;
 //BA.debugLineNum = 7340057;BA.debugLine="Cu=MCode.Result(\"Select * From TblAshkhas where";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblAshkhas where length(fldCodetafzili)>5");
RDebugUtils.currentLine=7340058;
 //BA.debugLineNum = 7340058;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step13 = 1;
final int limit13 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=7340059;
 //BA.debugLineNum = 7340059;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=7340060;
 //BA.debugLineNum = 7340060;BA.debugLine="Log(Cu.GetString(\"fldCodetafzili\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("57340060",_cu.GetString("fldCodetafzili"),0);
RDebugUtils.currentLine=7340061;
 //BA.debugLineNum = 7340061;BA.debugLine="Log(Cu.GetString(\"fldCodeMovaghat\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("57340061",_cu.GetString("fldCodeMovaghat"),0);
RDebugUtils.currentLine=7340062;
 //BA.debugLineNum = 7340062;BA.debugLine="Dim count As Int=MCode.SingleResult(\"Select cou";
_count = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (processBA,"Select count(fldCodetafzili) From TblAshkhas where fldCodeMovaghat='"+_cu.GetString("fldCodetafzili")+"'")));
RDebugUtils.currentLine=7340063;
 //BA.debugLineNum = 7340063;BA.debugLine="If count > 0 Then";
if (_count>0) { 
RDebugUtils.currentLine=7340064;
 //BA.debugLineNum = 7340064;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas where";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblAshkhas where fldCodetafzili='"+_cu.GetString("fldCodetafzili")+"'");
 };
 }
};
 } 
       catch (Exception e23) {
			processBA.setLastException(e23);RDebugUtils.currentLine=7340072;
 //BA.debugLineNum = 7340072;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("57340072",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=7340073;
 //BA.debugLineNum = 7340073;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetAshkhas");
 };
RDebugUtils.currentLine=7340075;
 //BA.debugLineNum = 7340075;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetbankma(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetbankma", false))
	 {return ((String) Debug.delegate(processBA, "loadgetbankma", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub LoadGetBankMa(Str As String)";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Try";
try {RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="MCode.SaveUpdate(\"Delete From TblBankMa\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblBankMa");
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblBankMa\",RowsLi";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblBankMa",_rowslist);
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="Log(\"لیست بانک ما دریافت گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("510878984","لیست بانک ما دریافت گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=10878987;
 //BA.debugLineNum = 10878987;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("510878987",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=10878988;
 //BA.debugLineNum = 10878988;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetBankMa");
 };
RDebugUtils.currentLine=10878990;
 //BA.debugLineNum = 10878990;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetbankmoshtari(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetbankmoshtari", false))
	 {return ((String) Debug.delegate(processBA, "loadgetbankmoshtari", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Sub LoadGetBankMoshtari(Str As String)";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Try";
try {RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="MCode.SaveUpdate(\"Delete From TblBankMoshtari\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblBankMoshtari");
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblBankMoshtari\",";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblBankMoshtari",_rowslist);
RDebugUtils.currentLine=11010056;
 //BA.debugLineNum = 11010056;BA.debugLine="Log(\"لیست بانک مشتری دریافت گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("511010056","لیست بانک مشتری دریافت گردید",0);
RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="ToastMessageShow(\"لیست بانک مشتری دریافت گردید\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست بانک مشتری دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("511010059",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=11010060;
 //BA.debugLineNum = 11010060;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetBankMoshtari");
 };
RDebugUtils.currentLine=11010062;
 //BA.debugLineNum = 11010062;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetcheckdaryaft(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetcheckdaryaft", false))
	 {return ((String) Debug.delegate(processBA, "loadgetcheckdaryaft", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub LoadGetCheckDaryaft(Str As String)";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Try";
try {RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="MCode.SaveUpdate(\"Delete From TblCheckDaryafti\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblCheckDaryafti");
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="MCode.SaveUpdate(\"insert into TblCheckDaryafti(";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"insert into TblCheckDaryafti(fldShomareCheck,fldShomareHesab,fldShomareDaryaft,fldMablagh,fldShobe,fldSharh,fldDate,fldDateSarResid,fldCodeBank,fldCodeSahebeCheck,fldShomareFactor,fldCodeVaste,fldSend) values('"+BA.ObjectToString(_row.Get((Object)("fldShomareCheck")))+"','"+BA.ObjectToString(_row.Get((Object)("fldShomareHesab")))+"'"+",'"+BA.ObjectToString(_row.Get((Object)("fldShomareDaryaft")))+"'"+",'"+BA.ObjectToString(_row.Get((Object)("fldMablagh")))+"'"+",'"+BA.ObjectToString(_row.Get((Object)("fldShobe")))+"'"+",'"+BA.ObjectToString(_row.Get((Object)("fldSharh")))+"'"+",'"+BA.ObjectToString(_row.Get((Object)("fldDate")))+"'"+",'"+BA.ObjectToString(_row.Get((Object)("fldDateSarResid")))+""+"',"+BA.ObjectToString(_row.Get((Object)("fldCodeBank")))+""+",'"+BA.ObjectToString(_row.Get((Object)("fldCodeSahebeCheck")))+"'"+",'"+BA.ObjectToString(_row.Get((Object)("fldShomareFactor")))+"'"+",'"+BA.ObjectToString(_row.Get((Object)("fldCodeVaste")))+"'"+",1"+")");
 }
};
RDebugUtils.currentLine=8781849;
 //BA.debugLineNum = 8781849;BA.debugLine="Log(\"دریافت بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("58781849","دریافت بروزرسانی گردید",0);
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=8781851;
 //BA.debugLineNum = 8781851;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("58781851",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=8781852;
 //BA.debugLineNum = 8781852;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetGetDaryaft");
 };
RDebugUtils.currentLine=8781857;
 //BA.debugLineNum = 8781857;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetdaftarchtell(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetdaftarchtell", false))
	 {return ((String) Debug.delegate(processBA, "loadgetdaftarchtell", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub LoadGetDaftarchTell(Str As String)";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Try";
try {RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="MCode.SaveUpdate(\"Delete From tblDaftarcheTell\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblDaftarcheTell");
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblDaftarcheTell\"";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"tblDaftarcheTell",_rowslist);
RDebugUtils.currentLine=12648456;
 //BA.debugLineNum = 12648456;BA.debugLine="Log(\"دفترچه تلفن بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512648456","دفترچه تلفن بروزرسانی گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=12648458;
 //BA.debugLineNum = 12648458;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("512648458",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=12648459;
 //BA.debugLineNum = 12648459;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetDaftarchTell");
 };
RDebugUtils.currentLine=12648461;
 //BA.debugLineNum = 12648461;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetdaryaft(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetdaryaft", false))
	 {return ((String) Debug.delegate(processBA, "loadgetdaryaft", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub LoadGetDaryaft(Str As String)";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Try";
try {RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="MCode.SaveUpdate(\"Delete From TblDaryaft\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblDaryaft");
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblDaryaft\",RowsL";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblDaryaft",_rowslist);
RDebugUtils.currentLine=8650770;
 //BA.debugLineNum = 8650770;BA.debugLine="Log(\"دریافت بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("58650770","دریافت بروزرسانی گردید",0);
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=8650772;
 //BA.debugLineNum = 8650772;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("58650772",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=8650773;
 //BA.debugLineNum = 8650773;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetGetDaryaft");
 };
RDebugUtils.currentLine=8650778;
 //BA.debugLineNum = 8650778;BA.debugLine="End Sub";
return "";
}
public static String  _loadgeteshantion(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgeteshantion", false))
	 {return ((String) Debug.delegate(processBA, "loadgeteshantion", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub LoadGetEshantion(Str As String)";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Try";
try {RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionVisitor";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblEshantionVisitori");
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblEshantionVisito";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"tblEshantionVisitori",_rowslist);
RDebugUtils.currentLine=8257550;
 //BA.debugLineNum = 8257550;BA.debugLine="Log(\"اشانتیون بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("58257550","اشانتیون بروزرسانی گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=8257552;
 //BA.debugLineNum = 8257552;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("58257552",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=8257553;
 //BA.debugLineNum = 8257553;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetEshantion");
 };
RDebugUtils.currentLine=8257557;
 //BA.debugLineNum = 8257557;BA.debugLine="End Sub";
return "";
}
public static String  _loadgeteshantion2(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgeteshantion2", false))
	 {return ((String) Debug.delegate(processBA, "loadgeteshantion2", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub LoadGetEshantion2(Str As String)";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Try";
try {RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionTabagh";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblEshantionTabaghati");
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblEshantionTabag";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"tblEshantionTabaghati",_rowslist);
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="Log(\"اشانتیون بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("58388616","اشانتیون بروزرسانی گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=8388618;
 //BA.debugLineNum = 8388618;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("58388618",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=8388619;
 //BA.debugLineNum = 8388619;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetEshantion2");
 };
RDebugUtils.currentLine=8388621;
 //BA.debugLineNum = 8388621;BA.debugLine="End Sub";
return "";
}
public static String  _loadgeteshantiongroup(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgeteshantiongroup", false))
	 {return ((String) Debug.delegate(processBA, "loadgeteshantiongroup", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub LoadGetEshantionGroup(Str As String)";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Try";
try {RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionGroup\"";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblEshantionGroup");
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblEshantionGroup";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"tblEshantionGroup",_rowslist);
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="Log(\"اشانتیون گروهی بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("58519688","اشانتیون گروهی بروزرسانی گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("58519690",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetEshantionGroup");
 };
RDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetfee(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetfee", false))
	 {return ((String) Debug.delegate(processBA, "loadgetfee", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub LoadGetFee(Str As String)";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Try";
try {RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFee\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblFee");
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFee\",RowsList)";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblFee",_rowslist);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("57602185",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetFee");
 };
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgallerykala(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetgallerykala", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgallerykala", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub LoadGetGalleryKala(Str As String)";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Try";
try {RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGalleryPic\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGalleryPic");
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=8126474;
 //BA.debugLineNum = 8126474;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGalleryPic (fld";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGalleryPic (fldCodeKala,fldImageNumber,fldImage,fldShow) Values ('"+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))+"','"+BA.ObjectToString(_row.Get((Object)("fldImageNumber")))+"','"+BA.ObjectToString(_row.Get((Object)("fldImage")))+"','"+BA.ObjectToString(_row.Get((Object)("fldShow")))+"')");
 }
};
RDebugUtils.currentLine=8126478;
 //BA.debugLineNum = 8126478;BA.debugLine="Log(\"گالری تصاویر بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("58126478","گالری تصاویر بروزرسانی گردید",0);
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=8126480;
 //BA.debugLineNum = 8126480;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("58126480",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=8126481;
 //BA.debugLineNum = 8126481;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetGalleryKala");
 };
RDebugUtils.currentLine=8126484;
 //BA.debugLineNum = 8126484;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgethavale(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetgethavale", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgethavale", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Sub LoadGetGetHavale(Str As String)";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Try";
try {RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="MCode.SaveUpdate(\"Delete From TblHavale\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblHavale");
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblHavale\",RowsLi";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblHavale",_rowslist);
RDebugUtils.currentLine=10747919;
 //BA.debugLineNum = 10747919;BA.debugLine="Log(\"لیست حواله بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("510747919","لیست حواله بروزرسانی گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=10747922;
 //BA.debugLineNum = 10747922;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("510747922",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=10747923;
 //BA.debugLineNum = 10747923;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetVisitor");
 };
RDebugUtils.currentLine=10747926;
 //BA.debugLineNum = 10747926;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgoroohashkhas(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetgoroohashkhas", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgoroohashkhas", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub LoadGetGoroohAshkhas(Str As String)";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Try";
try {RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohAshkhas\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGoroohAshkhas");
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohAshkhas (";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('"+BA.ObjectToString(_row.Get((Object)("fldGroupId")))+"','"+BA.ObjectToString(_row.Get((Object)("fldGroupName")))+"')");
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="Log(Row.Get(\"fldGroupName\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("57995404",BA.ObjectToString(_row.Get((Object)("fldGroupName"))),0);
 }
};
RDebugUtils.currentLine=7995406;
 //BA.debugLineNum = 7995406;BA.debugLine="Log(\"گروه اشخاص بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("57995406","گروه اشخاص بروزرسانی گردید",0);
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=7995408;
 //BA.debugLineNum = 7995408;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("57995408",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=7995409;
 //BA.debugLineNum = 7995409;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetGoroohAshkhas");
 };
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgoroohkala(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetgoroohkala", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgoroohkala", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub LoadGetGoroohKala(Str As String)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Try";
try {RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohKala\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGoroohKala");
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohKala (Fld";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"+BA.ObjectToString(_row.Get((Object)("fldGroupId")))+"','"+BA.ObjectToString(_row.Get((Object)("fldGroupName")))+"')");
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="Log(\"fldGroupName:\"&Row.Get(\"fldGroupName\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("57733260","fldGroupName:"+BA.ObjectToString(_row.Get((Object)("fldGroupName"))),0);
 }
};
RDebugUtils.currentLine=7733262;
 //BA.debugLineNum = 7733262;BA.debugLine="Log(\"گروه کالا بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("57733262","گروه کالا بروزرسانی گردید",0);
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=7733265;
 //BA.debugLineNum = 7733265;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("57733265",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetGoroohKala");
 };
RDebugUtils.currentLine=7733268;
 //BA.debugLineNum = 7733268;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgroupdastrasiashkhas(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetgroupdastrasiashkhas", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgroupdastrasiashkhas", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Sub LoadGetGroupDastrasiAshkhas(Str As String)";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Try";
try {RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="MCode.SaveUpdate(\"Delete From tblGroupDastrasi\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblGroupDastrasi");
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=12779527;
 //BA.debugLineNum = 12779527;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblGroupDastrasi\"";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"tblGroupDastrasi",_rowslist);
RDebugUtils.currentLine=12779528;
 //BA.debugLineNum = 12779528;BA.debugLine="Log(\"دسترسی گروه اشخاص بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("512779528","دسترسی گروه اشخاص بروزرسانی گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=12779530;
 //BA.debugLineNum = 12779530;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("512779530",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=12779531;
 //BA.debugLineNum = 12779531;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetGroupDastrasiAshkhas");
 };
RDebugUtils.currentLine=12779533;
 //BA.debugLineNum = 12779533;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetkala(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetkala", false))
	 {return ((String) Debug.delegate(processBA, "loadgetkala", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub LoadGetKala(Str As String)";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Try";
try {RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="Dim Cu As  Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="Row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="MCode.SaveUpdate(\"Delete From TblKala\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblKala");
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblKala\",RowsList";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblKala",_rowslist);
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="If MCode.PicOnline=0 Then";
if ((mostCurrent._mcode._piconline /*String*/ ).equals(BA.NumberToString(0))) { 
 };
RDebugUtils.currentLine=7208988;
 //BA.debugLineNum = 7208988;BA.debugLine="Cu=MCode.Result(\"Select * From TblKala\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblKala");
RDebugUtils.currentLine=7208989;
 //BA.debugLineNum = 7208989;BA.debugLine="Log(\"لیست کالا بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("57208989","لیست کالا بروزرسانی گردید",0);
RDebugUtils.currentLine=7208990;
 //BA.debugLineNum = 7208990;BA.debugLine="ToastMessageShow(\"لیست کالا بروزرسانی گردید: \" &";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست کالا بروزرسانی گردید: "+BA.NumberToString(_cu.getRowCount())),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e16) {
			processBA.setLastException(e16);RDebugUtils.currentLine=7208992;
 //BA.debugLineNum = 7208992;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("57208992",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=7208993;
 //BA.debugLineNum = 7208993;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetKala");
 };
RDebugUtils.currentLine=7208995;
 //BA.debugLineNum = 7208995;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetlistgpsvisitor(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetlistgpsvisitor", false))
	 {return ((String) Debug.delegate(processBA, "loadgetlistgpsvisitor", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub LoadGetListGpsVisitor(Str As String)";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Try";
try {RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="CallSubDelayed2(Act_LocationVisitor,\"LoadData\",Ro";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_locationvisitor.getObject()),"LoadData",(Object)(_rowslist));
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="ToastMessageShow(\"مسیر حرکت ویزیتور با موفقیت در";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مسیر حرکت ویزیتور با موفقیت دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("511665417",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetReportRizFactorVisitor");
 };
RDebugUtils.currentLine=11665420;
 //BA.debugLineNum = 11665420;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetpicftpforandroid(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetpicftpforandroid", false))
	 {return ((String) Debug.delegate(processBA, "loadgetpicftpforandroid", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Sub LoadGetPicFTPForAndroid(Str As String)";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Try";
try {RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=11927559;
 //BA.debugLineNum = 11927559;BA.debugLine="Row=RowsList.Get(0)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get((int) (0))));
RDebugUtils.currentLine=11927560;
 //BA.debugLineNum = 11927560;BA.debugLine="MCode.SaveUpdate(\"Update TblSetting Set FldLinkP";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblSetting Set FldLinkPicKala='"+BA.ObjectToString(_row.Get((Object)("fldLink")))+"' where FldId=1");
RDebugUtils.currentLine=11927561;
 //BA.debugLineNum = 11927561;BA.debugLine="MCode.ImageUrl=Row.Get(\"fldLink\")";
mostCurrent._mcode._imageurl /*String*/  = BA.ObjectToString(_row.Get((Object)("fldLink")));
RDebugUtils.currentLine=11927562;
 //BA.debugLineNum = 11927562;BA.debugLine="Log(MCode.ImageUrl)";
anywheresoftware.b4a.keywords.Common.LogImpl("511927562",mostCurrent._mcode._imageurl /*String*/ ,0);
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=11927564;
 //BA.debugLineNum = 11927564;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("511927564",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=11927565;
 //BA.debugLineNum = 11927565;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetPicFTPForAndroid");
 };
RDebugUtils.currentLine=11927567;
 //BA.debugLineNum = 11927567;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetreportfactor(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetreportfactor", false))
	 {return ((String) Debug.delegate(processBA, "loadgetreportfactor", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub LoadGetReportFactor(Str As String)";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Try";
try {RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="If MCode.page=\"Act_ReportVisitor\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("Act_ReportVisitor")) { 
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="CallSubDelayed2(Act_ReportVisitor,\"LoadFactor\",R";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_reportvisitor.getObject()),"LoadFactor",(Object)(_rowslist));
 }else 
{RDebugUtils.currentLine=9830409;
 //BA.debugLineNum = 9830409;BA.debugLine="Else If MCode.page=\"Act_RepFactors\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("Act_RepFactors")) { 
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="CallSubDelayed2(Act_RepFactors,\"LoadData\",RowsLi";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_repfactors.getObject()),"LoadData",(Object)(_rowslist));
 }}
;
RDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="ToastMessageShow(\"گزارش مشتری با موفقیت دریافت گ";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارش مشتری با موفقیت دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=9830415;
 //BA.debugLineNum = 9830415;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("59830415",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=9830416;
 //BA.debugLineNum = 9830416;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetReportFactor");
 };
RDebugUtils.currentLine=9830418;
 //BA.debugLineNum = 9830418;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=9830419;
 //BA.debugLineNum = 9830419;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetreportfactorvisitor(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetreportfactorvisitor", false))
	 {return ((String) Debug.delegate(processBA, "loadgetreportfactorvisitor", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Sub LoadGetReportFactorVisitor(Str As String)";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Try";
try {RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="CallSubDelayed2(Act_RepFactorVisitor,\"CreateList\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_repfactorvisitor.getObject()),"CreateList",(Object)(_rowslist));
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="ToastMessageShow(\"گزارش سفارش ویزیتور با موفقیت";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارش سفارش ویزیتور با موفقیت دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("511403273",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetReportFactorVisitor");
 };
RDebugUtils.currentLine=11403276;
 //BA.debugLineNum = 11403276;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetreportmoshtari(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetreportmoshtari", false))
	 {return ((String) Debug.delegate(processBA, "loadgetreportmoshtari", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub LoadGetReportMoshtari(Str As String)";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Try";
try {RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="ToastMessageShow(\"گزارش مشتری با موفقیت دریافت گ";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارش مشتری با موفقیت دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=9699338;
 //BA.debugLineNum = 9699338;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("59699338",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=9699339;
 //BA.debugLineNum = 9699339;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetReportMoshtari");
 };
RDebugUtils.currentLine=9699341;
 //BA.debugLineNum = 9699341;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetreportrizepishfactor(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetreportrizepishfactor", false))
	 {return ((String) Debug.delegate(processBA, "loadgetreportrizepishfactor", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub LoadGetReportRizePishFactor(Str As String)";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Try";
try {RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="CallSubDelayed2(Act_RizFaktor,\"LoadData\",RowsList";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_rizfaktor.getObject()),"LoadData",(Object)(_rowslist));
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="ToastMessageShow(\"گزارش فاکتور مشتری با موفقیت د";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارش فاکتور مشتری با موفقیت دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("59961482",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetReportRizePishFactor");
 };
RDebugUtils.currentLine=9961486;
 //BA.debugLineNum = 9961486;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetreportrizepishfactor3(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetreportrizepishfactor3", false))
	 {return ((String) Debug.delegate(processBA, "loadgetreportrizepishfactor3", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Sub LoadGetReportRizePishFactor3(Str As String)";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Try";
try {RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor where Fl";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblFaktor where FldSync='True'");
RDebugUtils.currentLine=10092553;
 //BA.debugLineNum = 10092553;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=10092554;
 //BA.debugLineNum = 10092554;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=10092557;
 //BA.debugLineNum = 10092557;BA.debugLine="If Row.Get(\"fldTedadJoz\")>0 Or Row.Get(\"fldTedad";
if ((double)(BA.ObjectToNumber(_row.Get((Object)("fldTedadJoz"))))>0 || (double)(BA.ObjectToNumber(_row.Get((Object)("fldTedadCarton"))))>0) { 
RDebugUtils.currentLine=10092560;
 //BA.debugLineNum = 10092560;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10092561;
 //BA.debugLineNum = 10092561;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=10092562;
 //BA.debugLineNum = 10092562;BA.debugLine="m.Put(\"FldRadif\",Row.Get(\"fldRadif\"))";
_m.Put((Object)("FldRadif"),_row.Get((Object)("fldRadif")));
RDebugUtils.currentLine=10092563;
 //BA.debugLineNum = 10092563;BA.debugLine="m.Put(\"FldC_Visitor\",Row.Get(\"fldCodeVasete\"))";
_m.Put((Object)("FldC_Visitor"),_row.Get((Object)("fldCodeVasete")));
RDebugUtils.currentLine=10092564;
 //BA.debugLineNum = 10092564;BA.debugLine="m.Put(\"FldC_Tafzili\",Row.Get(\"fldCodeTafsili\"))";
_m.Put((Object)("FldC_Tafzili"),_row.Get((Object)("fldCodeTafsili")));
RDebugUtils.currentLine=10092565;
 //BA.debugLineNum = 10092565;BA.debugLine="m.Put(\"FldN_Tafzili\",Row.Get(\"fldSharheTafzili\"";
_m.Put((Object)("FldN_Tafzili"),_row.Get((Object)("fldSharheTafzili")));
RDebugUtils.currentLine=10092566;
 //BA.debugLineNum = 10092566;BA.debugLine="m.Put(\"FldShomareFaktor\",Row.Get(\"fldShomareFac";
_m.Put((Object)("FldShomareFaktor"),_row.Get((Object)("fldShomareFactor")));
RDebugUtils.currentLine=10092567;
 //BA.debugLineNum = 10092567;BA.debugLine="m.Put(\"FldShomareBargasht\",Row.Get(\"fldShomareB";
_m.Put((Object)("FldShomareBargasht"),_row.Get((Object)("fldShomareBargasht")));
RDebugUtils.currentLine=10092568;
 //BA.debugLineNum = 10092568;BA.debugLine="m.Put(\"FldCodeKala\",Row.Get(\"fldCodeKala\"))";
_m.Put((Object)("FldCodeKala"),_row.Get((Object)("fldCodeKala")));
RDebugUtils.currentLine=10092569;
 //BA.debugLineNum = 10092569;BA.debugLine="m.Put(\"FldNameKala\",Row.Get(\"fldSharhKala\"))";
_m.Put((Object)("FldNameKala"),_row.Get((Object)("fldSharhKala")));
RDebugUtils.currentLine=10092570;
 //BA.debugLineNum = 10092570;BA.debugLine="m.Put(\"FldFeeForoosh\",Row.Get(\"fldFeeJoz\"))";
_m.Put((Object)("FldFeeForoosh"),_row.Get((Object)("fldFeeJoz")));
RDebugUtils.currentLine=10092571;
 //BA.debugLineNum = 10092571;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Row.Get(\"fldFeeBadAz";
_m.Put((Object)("fldFeeBadAzTakhfif"),_row.Get((Object)("fldFeeBadAzTakhfif")));
RDebugUtils.currentLine=10092572;
 //BA.debugLineNum = 10092572;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Row.Get(\"fldMablaghTa";
_m.Put((Object)("FldMablaghTakhfif"),_row.Get((Object)("fldMablaghTakhfif")));
RDebugUtils.currentLine=10092573;
 //BA.debugLineNum = 10092573;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Row.Get(\"fldTedadJo";
_m.Put((Object)("FldTedadDarSabadJoz"),_row.Get((Object)("fldTedadJoz")));
RDebugUtils.currentLine=10092574;
 //BA.debugLineNum = 10092574;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Row.Get(\"fldTedadCa";
_m.Put((Object)("FldTedadDarSabadKol"),_row.Get((Object)("fldTedadCarton")));
RDebugUtils.currentLine=10092575;
 //BA.debugLineNum = 10092575;BA.debugLine="m.Put(\"FldTedadDarkarton\",Row.Get(\"FldTedadDarK";
_m.Put((Object)("FldTedadDarkarton"),_row.Get((Object)("FldTedadDarKarton")));
RDebugUtils.currentLine=10092576;
 //BA.debugLineNum = 10092576;BA.debugLine="m.Put(\"FldTotalFaktor\",Row.Get(\"FldTotalFaktor\"";
_m.Put((Object)("FldTotalFaktor"),_row.Get((Object)("FldTotalFaktor")));
RDebugUtils.currentLine=10092577;
 //BA.debugLineNum = 10092577;BA.debugLine="m.Put(\"FldTozihat\",Row.Get(\"fldTozihatRecord\"))";
_m.Put((Object)("FldTozihat"),_row.Get((Object)("fldTozihatRecord")));
RDebugUtils.currentLine=10092578;
 //BA.debugLineNum = 10092578;BA.debugLine="m.Put(\"FldTozih\",Row.Get(\"FldTozihat\"))";
_m.Put((Object)("FldTozih"),_row.Get((Object)("FldTozihat")));
RDebugUtils.currentLine=10092579;
 //BA.debugLineNum = 10092579;BA.debugLine="m.Put(\"FldNameVahed\",Row.Get(\"fldNameVahed1\"))";
_m.Put((Object)("FldNameVahed"),_row.Get((Object)("fldNameVahed1")));
RDebugUtils.currentLine=10092580;
 //BA.debugLineNum = 10092580;BA.debugLine="m.Put(\"FldNameVahed2\",Row.Get(\"fldNameVahed2\"))";
_m.Put((Object)("FldNameVahed2"),_row.Get((Object)("fldNameVahed2")));
RDebugUtils.currentLine=10092581;
 //BA.debugLineNum = 10092581;BA.debugLine="m.Put(\"FldVaziatPardakht\",Row.Get(\"fldNahveTasv";
_m.Put((Object)("FldVaziatPardakht"),_row.Get((Object)("fldNahveTasvie")));
RDebugUtils.currentLine=10092582;
 //BA.debugLineNum = 10092582;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",Row.Get(\"FldMablag";
_m.Put((Object)("FldMablaghTakhfifKol"),_row.Get((Object)("FldMablaghTakhfifKol")));
RDebugUtils.currentLine=10092583;
 //BA.debugLineNum = 10092583;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",Row.Get(\"FldS";
_m.Put((Object)("FldSumMablaghTakhfifVizhe"),_row.Get((Object)("FldSumMablaghTakhfifVizhe")));
RDebugUtils.currentLine=10092584;
 //BA.debugLineNum = 10092584;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",Row.Get(\"FldSu";
_m.Put((Object)("FldSumMablaghTakhfifKala"),_row.Get((Object)("FldSumMablaghTakhfifKala")));
RDebugUtils.currentLine=10092585;
 //BA.debugLineNum = 10092585;BA.debugLine="m.Put(\"FldMablaghKol\",Row.Get(\"FldTotalFaktor\")";
_m.Put((Object)("FldMablaghKol"),_row.Get((Object)("FldTotalFaktor")));
RDebugUtils.currentLine=10092586;
 //BA.debugLineNum = 10092586;BA.debugLine="m.Put(\"FldDate\",Row.Get(\"fldDate\"))";
_m.Put((Object)("FldDate"),_row.Get((Object)("fldDate")));
RDebugUtils.currentLine=10092587;
 //BA.debugLineNum = 10092587;BA.debugLine="m.Put(\"FldTime\",Row.Get(\"fldTime\"))";
_m.Put((Object)("FldTime"),_row.Get((Object)("fldTime")));
RDebugUtils.currentLine=10092588;
 //BA.debugLineNum = 10092588;BA.debugLine="m.Put(\"FldSignatureBitmapString\",Row.Get(\"FldSi";
_m.Put((Object)("FldSignatureBitmapString"),_row.Get((Object)("FldSignatureBitmapString")));
RDebugUtils.currentLine=10092589;
 //BA.debugLineNum = 10092589;BA.debugLine="m.Put(\"fldArzeshAfzode\",Row.Get(\"fldArzeshAfzod";
_m.Put((Object)("fldArzeshAfzode"),_row.Get((Object)("fldArzeshAfzode")));
RDebugUtils.currentLine=10092590;
 //BA.debugLineNum = 10092590;BA.debugLine="m.Put(\"fldDarsadArzeshAfzode\",Row.Get(\"fldDarsa";
_m.Put((Object)("fldDarsadArzeshAfzode"),_row.Get((Object)("fldDarsadArzeshAfzode")));
RDebugUtils.currentLine=10092591;
 //BA.debugLineNum = 10092591;BA.debugLine="m.Put(\"FldSync\",\"True\")";
_m.Put((Object)("FldSync"),(Object)("True"));
RDebugUtils.currentLine=10092593;
 //BA.debugLineNum = 10092593;BA.debugLine="If myCode.Is_Null_adad(Row.Get(\"fldShomareBarga";
if ((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (processBA,BA.ObjectToString(_row.Get((Object)("fldShomareBargasht"))))))>0) { 
RDebugUtils.currentLine=10092594;
 //BA.debugLineNum = 10092594;BA.debugLine="m.Put(\"WIsBacked\",\"True\")";
_m.Put((Object)("WIsBacked"),(Object)("True"));
 }else {
RDebugUtils.currentLine=10092596;
 //BA.debugLineNum = 10092596;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
_m.Put((Object)("WIsBacked"),(Object)("False"));
 };
RDebugUtils.currentLine=10092599;
 //BA.debugLineNum = 10092599;BA.debugLine="m.Put(\"FldType\",Row.Get(\"fldType\"))";
_m.Put((Object)("FldType"),_row.Get((Object)("fldType")));
RDebugUtils.currentLine=10092600;
 //BA.debugLineNum = 10092600;BA.debugLine="m.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
_m.Put((Object)("FldAmani"),_row.Get((Object)("FldAmani")));
RDebugUtils.currentLine=10092601;
 //BA.debugLineNum = 10092601;BA.debugLine="m.Put(\"fldShomareForoosh\",Row.Get(\"fldShomareFo";
_m.Put((Object)("fldShomareForoosh"),_row.Get((Object)("fldShomareForoosh")));
RDebugUtils.currentLine=10092602;
 //BA.debugLineNum = 10092602;BA.debugLine="m.Put(\"WSendFrom\",3)";
_m.Put((Object)("WSendFrom"),(Object)(3));
RDebugUtils.currentLine=10092603;
 //BA.debugLineNum = 10092603;BA.debugLine="Log(\"fldShomareFactor: \"&Row.Get(\"fldShomareFa";
anywheresoftware.b4a.keywords.Common.LogImpl("510092603","fldShomareFactor: "+BA.ObjectToString(_row.Get((Object)("fldShomareFactor"))),0);
RDebugUtils.currentLine=10092604;
 //BA.debugLineNum = 10092604;BA.debugLine="lst.Add(m)";
_lst.Add((Object)(_m.getObject()));
 };
 }
};
RDebugUtils.currentLine=10092608;
 //BA.debugLineNum = 10092608;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFaktor\",lst)";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblFaktor",_lst);
RDebugUtils.currentLine=10092610;
 //BA.debugLineNum = 10092610;BA.debugLine="Log(\"لیست سفارشات بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("510092610","لیست سفارشات بروزرسانی گردید",0);
 } 
       catch (Exception e60) {
			processBA.setLastException(e60);RDebugUtils.currentLine=10092612;
 //BA.debugLineNum = 10092612;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("510092612",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=10092613;
 //BA.debugLineNum = 10092613;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetReportRizePishFactor");
 };
RDebugUtils.currentLine=10092615;
 //BA.debugLineNum = 10092615;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetreportrizfactorvisitor(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetreportrizfactorvisitor", false))
	 {return ((String) Debug.delegate(processBA, "loadgetreportrizfactorvisitor", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub LoadGetReportRizFactorVisitor(Str As String)";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Try";
try {RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="CallSubDelayed2(Act_RepRizFactorVisitor,\"LoadData";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_reprizfactorvisitor.getObject()),"LoadData",(Object)(_rowslist));
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="ToastMessageShow(\"گزارش سفارش ویزیتور با موفقیت";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارش سفارش ویزیتور با موفقیت دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("511534345",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetReportRizFactorVisitor");
 };
RDebugUtils.currentLine=11534348;
 //BA.debugLineNum = 11534348;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetreportvisitor(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetreportvisitor", false))
	 {return ((String) Debug.delegate(processBA, "loadgetreportvisitor", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub LoadGetReportVisitor(Str As String)";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Try";
try {RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="CallSubDelayed2(Act_ReportVisitor2,\"CreateList\",R";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_reportvisitor2.getObject()),"CreateList",(Object)(_rowslist));
RDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="ToastMessageShow(\"گزارش ویزیتور با موفقیت دریافت";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارش ویزیتور با موفقیت دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("59568266",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=9568267;
 //BA.debugLineNum = 9568267;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetReportVisitor");
 };
RDebugUtils.currentLine=9568269;
 //BA.debugLineNum = 9568269;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetsandoogh(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetsandoogh", false))
	 {return ((String) Debug.delegate(processBA, "loadgetsandoogh", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub LoadGetSandoogh(Str As String)";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Try";
try {RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSandoogh\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblSandoogh");
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblSandoogh\",Rows";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblSandoogh",_rowslist);
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="Log(\"لیست صندوق دریافت گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("511141128","لیست صندوق دریافت گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=11141131;
 //BA.debugLineNum = 11141131;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("511141131",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=11141132;
 //BA.debugLineNum = 11141132;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetSandoogh");
 };
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetsetting(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetsetting", false))
	 {return ((String) Debug.delegate(processBA, "loadgetsetting", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _fields = null;
anywheresoftware.b4a.objects.collections.Map _where = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub LoadGetSetting(Str As String)";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Try";
try {RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="If MCode.Sf.Len(Row.Get(\"FldC_Visitor\"))<5 Then";
if (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(BA.ObjectToString(_row.Get((Object)("FldC_Visitor"))))<5) { 
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tr";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=6750225;
 //BA.debugLineNum = 6750225;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="Fields.Put(\"FldImei\",MCode.DeviceId)";
_fields.Put((Object)("FldImei"),(Object)(mostCurrent._mcode._deviceid /*String*/ ));
RDebugUtils.currentLine=6750227;
 //BA.debugLineNum = 6750227;BA.debugLine="Fields.Put(\"FldC_Visitor\",Row.Get(\"FldC_Visitor\"";
_fields.Put((Object)("FldC_Visitor"),_row.Get((Object)("FldC_Visitor")));
RDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="Fields.Put(\"FldN_Visitor\",Row.Get(\"FldN_Visitor\"";
_fields.Put((Object)("FldN_Visitor"),_row.Get((Object)("FldN_Visitor")));
RDebugUtils.currentLine=6750229;
 //BA.debugLineNum = 6750229;BA.debugLine="Fields.Put(\"FldGps\",Row.Get(\"FldGps\"))";
_fields.Put((Object)("FldGps"),_row.Get((Object)("FldGps")));
RDebugUtils.currentLine=6750230;
 //BA.debugLineNum = 6750230;BA.debugLine="Fields.Put(\"FldIntervalGps\",Row.Get(\"FldInterval";
_fields.Put((Object)("FldIntervalGps"),_row.Get((Object)("FldIntervalGps")));
RDebugUtils.currentLine=6750231;
 //BA.debugLineNum = 6750231;BA.debugLine="Fields.Put(\"FldNoeDate\",Row.Get(\"FldNoeDate\"))";
_fields.Put((Object)("FldNoeDate"),_row.Get((Object)("FldNoeDate")));
RDebugUtils.currentLine=6750232;
 //BA.debugLineNum = 6750232;BA.debugLine="Fields.Put(\"FldRound\",Row.Get(\"FldRound\"))";
_fields.Put((Object)("FldRound"),_row.Get((Object)("FldRound")));
RDebugUtils.currentLine=6750233;
 //BA.debugLineNum = 6750233;BA.debugLine="Fields.Put(\"FldKalaManfi\",Row.Get(\"FldKalaManfi\"";
_fields.Put((Object)("FldKalaManfi"),_row.Get((Object)("FldKalaManfi")));
RDebugUtils.currentLine=6750234;
 //BA.debugLineNum = 6750234;BA.debugLine="Fields.Put(\"FldTaghirFeeKala\",Row.Get(\"FldTaghir";
_fields.Put((Object)("FldTaghirFeeKala"),_row.Get((Object)("FldTaghirFeeKala")));
RDebugUtils.currentLine=6750235;
 //BA.debugLineNum = 6750235;BA.debugLine="Fields.Put(\"fldNamayeshKalaSefr\",Row.Get(\"fldNam";
_fields.Put((Object)("fldNamayeshKalaSefr"),_row.Get((Object)("fldNamayeshKalaSefr")));
RDebugUtils.currentLine=6750236;
 //BA.debugLineNum = 6750236;BA.debugLine="Fields.Put(\"FldDastrasiKala\",Row.Get(\"FldDastras";
_fields.Put((Object)("FldDastrasiKala"),_row.Get((Object)("FldDastrasiKala")));
RDebugUtils.currentLine=6750237;
 //BA.debugLineNum = 6750237;BA.debugLine="Fields.Put(\"FldDastrasiAshkhas\",Row.Get(\"FldDast";
_fields.Put((Object)("FldDastrasiAshkhas"),_row.Get((Object)("FldDastrasiAshkhas")));
RDebugUtils.currentLine=6750238;
 //BA.debugLineNum = 6750238;BA.debugLine="Fields.Put(\"FldAdmin\",Row.Get(\"FldAdmin\"))";
_fields.Put((Object)("FldAdmin"),_row.Get((Object)("FldAdmin")));
RDebugUtils.currentLine=6750239;
 //BA.debugLineNum = 6750239;BA.debugLine="Fields.Put(\"FldCheckAdmin\",Row.Get(\"FldCheckAdmi";
_fields.Put((Object)("FldCheckAdmin"),_row.Get((Object)("FldCheckAdmin")));
RDebugUtils.currentLine=6750240;
 //BA.debugLineNum = 6750240;BA.debugLine="Fields.Put(\"FldTakhfifKala\",Row.Get(\"FldTakhfifK";
_fields.Put((Object)("FldTakhfifKala"),_row.Get((Object)("FldTakhfifKala")));
RDebugUtils.currentLine=6750241;
 //BA.debugLineNum = 6750241;BA.debugLine="Fields.Put(\"FldTozie\",Row.Get(\"FldTozie\"))";
_fields.Put((Object)("FldTozie"),_row.Get((Object)("FldTozie")));
RDebugUtils.currentLine=6750242;
 //BA.debugLineNum = 6750242;BA.debugLine="Fields.Put(\"FldVisitor\",Row.Get(\"FldVisitor\"))";
_fields.Put((Object)("FldVisitor"),_row.Get((Object)("FldVisitor")));
RDebugUtils.currentLine=6750243;
 //BA.debugLineNum = 6750243;BA.debugLine="Fields.Put(\"FldVahedPool\",Row.Get(\"FldVahedPool\"";
_fields.Put((Object)("FldVahedPool"),_row.Get((Object)("FldVahedPool")));
RDebugUtils.currentLine=6750244;
 //BA.debugLineNum = 6750244;BA.debugLine="Fields.Put(\"FldHideMojodi\",Row.Get(\"FldHideMojod";
_fields.Put((Object)("FldHideMojodi"),_row.Get((Object)("FldHideMojodi")));
RDebugUtils.currentLine=6750245;
 //BA.debugLineNum = 6750245;BA.debugLine="Fields.Put(\"FldSendMarjoie\",Row.Get(\"FldSendMarj";
_fields.Put((Object)("FldSendMarjoie"),_row.Get((Object)("FldSendMarjoie")));
RDebugUtils.currentLine=6750246;
 //BA.debugLineNum = 6750246;BA.debugLine="Fields.Put(\"FldPicOnline\",Row.Get(\"FldPicOnline\"";
_fields.Put((Object)("FldPicOnline"),_row.Get((Object)("FldPicOnline")));
RDebugUtils.currentLine=6750247;
 //BA.debugLineNum = 6750247;BA.debugLine="Fields.Put(\"FldDaryaft\",Row.Get(\"FldDaryaft\"))";
_fields.Put((Object)("FldDaryaft"),_row.Get((Object)("FldDaryaft")));
RDebugUtils.currentLine=6750248;
 //BA.debugLineNum = 6750248;BA.debugLine="Fields.Put(\"FldGetDataOnline\",Row.Get(\"FldGetDat";
_fields.Put((Object)("FldGetDataOnline"),_row.Get((Object)("FldGetDataOnline")));
RDebugUtils.currentLine=6750249;
 //BA.debugLineNum = 6750249;BA.debugLine="Fields.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
_fields.Put((Object)("FldAmani"),_row.Get((Object)("FldAmani")));
RDebugUtils.currentLine=6750250;
 //BA.debugLineNum = 6750250;BA.debugLine="Fields.Put(\"FldMojavezSefaresh\",Row.Get(\"FldMoja";
_fields.Put((Object)("FldMojavezSefaresh"),_row.Get((Object)("FldMojavezSefaresh")));
RDebugUtils.currentLine=6750251;
 //BA.debugLineNum = 6750251;BA.debugLine="Fields.Put(\"FldConnectionStatus\",Row.Get(\"FldCon";
_fields.Put((Object)("FldConnectionStatus"),_row.Get((Object)("FldConnectionStatus")));
RDebugUtils.currentLine=6750252;
 //BA.debugLineNum = 6750252;BA.debugLine="Fields.Put(\"FldEshantionTabaghati\",Row.Get(\"FldE";
_fields.Put((Object)("FldEshantionTabaghati"),_row.Get((Object)("FldEshantionTabaghati")));
RDebugUtils.currentLine=6750253;
 //BA.debugLineNum = 6750253;BA.debugLine="Fields.Put(\"FldEshantionRemove\",Row.Get(\"FldEsha";
_fields.Put((Object)("FldEshantionRemove"),_row.Get((Object)("FldEshantionRemove")));
RDebugUtils.currentLine=6750254;
 //BA.debugLineNum = 6750254;BA.debugLine="Fields.Put(\"FldEshantionGroup\",Row.Get(\"FldEshan";
_fields.Put((Object)("FldEshantionGroup"),_row.Get((Object)("FldEshantionGroup")));
RDebugUtils.currentLine=6750255;
 //BA.debugLineNum = 6750255;BA.debugLine="Fields.Put(\"FldMobileIsImportent\",Row.Get(\"FldMo";
_fields.Put((Object)("FldMobileIsImportent"),_row.Get((Object)("FldMobileIsImportent")));
RDebugUtils.currentLine=6750256;
 //BA.debugLineNum = 6750256;BA.debugLine="Fields.Put(\"FldSaveFactorInLocation\",Row.Get(\"Fl";
_fields.Put((Object)("FldSaveFactorInLocation"),_row.Get((Object)("FldSaveFactorInLocation")));
RDebugUtils.currentLine=6750257;
 //BA.debugLineNum = 6750257;BA.debugLine="Fields.Put(\"FldMasafat\",Row.Get(\"FldMasafat\"))";
_fields.Put((Object)("FldMasafat"),_row.Get((Object)("FldMasafat")));
RDebugUtils.currentLine=6750259;
 //BA.debugLineNum = 6750259;BA.debugLine="Where.Put(\"FldId\",1)";
_where.Put((Object)("FldId"),(Object)(1));
RDebugUtils.currentLine=6750262;
 //BA.debugLineNum = 6750262;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblSetting\",Fi";
mostCurrent._dbutils._updaterecord2 /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblSetting",_fields,_where);
 }
};
RDebugUtils.currentLine=6750265;
 //BA.debugLineNum = 6750265;BA.debugLine="MCode.UpdateDataBase";
mostCurrent._mcode._updatedatabase /*String*/ (processBA);
RDebugUtils.currentLine=6750267;
 //BA.debugLineNum = 6750267;BA.debugLine="If MCode.NoeGet=\"DaryaftEtlaat\" Then";
if ((mostCurrent._mcode._noeget /*String*/ ).equals("DaryaftEtlaat")) { 
RDebugUtils.currentLine=6750268;
 //BA.debugLineNum = 6750268;BA.debugLine="GetGoroohKala";
_getgoroohkala();
 };
RDebugUtils.currentLine=6750274;
 //BA.debugLineNum = 6750274;BA.debugLine="StartService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
 } 
       catch (Exception e57) {
			processBA.setLastException(e57);RDebugUtils.currentLine=6750279;
 //BA.debugLineNum = 6750279;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("56750279",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=6750280;
 //BA.debugLineNum = 6750280;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetSetting");
 };
RDebugUtils.currentLine=6750282;
 //BA.debugLineNum = 6750282;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetsoorathesab(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetsoorathesab", false))
	 {return ((String) Debug.delegate(processBA, "loadgetsoorathesab", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub LoadGetSooratHesab(Str As String)";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Try";
try {RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="CallSubDelayed2(Act_ReportSoorathesab,\"CreateList";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_reportsoorathesab.getObject()),"CreateList",(Object)(_rowslist));
RDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="ToastMessageShow(\"گزارش صورتحساب مشتری با موفقیت";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گزارش صورتحساب مشتری با موفقیت دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("510223625",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=10223626;
 //BA.debugLineNum = 10223626;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetSooratHesab");
 };
RDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="End Sub";
return "";
}
public static String  _loadgettanzimatandroid(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgettanzimatandroid", false))
	 {return ((String) Debug.delegate(processBA, "loadgettanzimatandroid", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _fields = null;
anywheresoftware.b4a.objects.collections.Map _where = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub LoadGetTanzimatAndroid(Str As String)";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Try";
try {RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="Fields.Put(\"fldArzeshAfzode\",Row.Get(\"fldArzesh";
_fields.Put((Object)("fldArzeshAfzode"),_row.Get((Object)("fldArzeshAfzode")));
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="Where.Put(\"FldId\",1)";
_where.Put((Object)("FldId"),(Object)(1));
RDebugUtils.currentLine=7471122;
 //BA.debugLineNum = 7471122;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblSetting\",F";
mostCurrent._dbutils._updaterecord2 /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblSetting",_fields,_where);
 }
};
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="MCode.UpdateDataBase";
mostCurrent._mcode._updatedatabase /*String*/ (processBA);
 } 
       catch (Exception e18) {
			processBA.setLastException(e18);RDebugUtils.currentLine=7471129;
 //BA.debugLineNum = 7471129;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("57471129",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=7471130;
 //BA.debugLineNum = 7471130;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetTanzimatAndroid");
 };
RDebugUtils.currentLine=7471132;
 //BA.debugLineNum = 7471132;BA.debugLine="End Sub";
return "";
}
public static String  _loadgettasvie(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgettasvie", false))
	 {return ((String) Debug.delegate(processBA, "loadgettasvie", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub LoadGetTasvie(Str As String)";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Try";
try {RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="MCode.SaveUpdate(\"Delete From TblTasvie\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblTasvie");
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblTasvie (FldCode";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblTasvie (FldCode,FldName) Values ('"+BA.ObjectToString(_row.Get((Object)("fldCode")))+"','"+BA.ObjectToString(_row.Get((Object)("fldName")))+"')");
 }
};
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("57864334",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetTasvie");
 };
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="End Sub";
return "";
}
public static String  _loadgettourvisitor(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgettourvisitor", false))
	 {return ((String) Debug.delegate(processBA, "loadgettourvisitor", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub LoadGetTourVisitor(Str As String)";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Try";
try {RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="MCode.SaveUpdate(\"Delete From tblTourVisitor\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblTourVisitor");
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="MCode.SaveUpdate(\"Delete From tblTourVisitor\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblTourVisitor");
RDebugUtils.currentLine=10354696;
 //BA.debugLineNum = 10354696;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblTourVisitor\",R";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"tblTourVisitor",_rowslist);
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="Log(\"لیست تور ویزیت دریافت گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("510354697","لیست تور ویزیت دریافت گردید",0);
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="ToastMessageShow(\"لیست تور ویزیت دریافت گردید\",T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست تور ویزیت دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=10354749;
 //BA.debugLineNum = 10354749;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("510354749",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=10354750;
 //BA.debugLineNum = 10354750;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetBankMa");
 };
RDebugUtils.currentLine=10354752;
 //BA.debugLineNum = 10354752;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetvaziat(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetvaziat", false))
	 {return ((String) Debug.delegate(processBA, "loadgetvaziat", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
String _query = "";
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub LoadGetVaziat(Str As String)";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Try";
try {RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="Dim Query As String=\"Update TblSetting Set FldTo";
_query = "Update TblSetting Set FldTokenId = '"+mostCurrent._mcode._deviceid /*String*/ +"',FldCodeMoshtari = '"+mostCurrent._mcode._codemoshtari /*String*/ +"',FldNameVisitor = '"+BA.ObjectToString(_row.Get((Object)("fldNameVisitor")))+"',FldVaziat = '"+BA.ObjectToString(_row.Get((Object)("fldVaziat")))+"'";
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (processBA,_query);
 }
};
RDebugUtils.currentLine=7077899;
 //BA.debugLineNum = 7077899;BA.debugLine="MCode.Vaziat=MCode.SingleResult(\"select FldVazia";
mostCurrent._mcode._vaziat /*int*/  = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (processBA,"select FldVaziat from TblSetting")));
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=7077901;
 //BA.debugLineNum = 7077901;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("57077901",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=7077902;
 //BA.debugLineNum = 7077902;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetVaziat");
 };
RDebugUtils.currentLine=7077908;
 //BA.debugLineNum = 7077908;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetvideoamoozesh(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetvideoamoozesh", false))
	 {return ((String) Debug.delegate(processBA, "loadgetvideoamoozesh", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub LoadGetVideoAmoozesh(Str As String)";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Try";
try {RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="CallSubDelayed2(Act_Video,\"LoadData\",RowsList)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_video.getObject()),"LoadData",(Object)(_rowslist));
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="ToastMessageShow(\"لیست ویدیوهای آموزشی با موفقیت";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست ویدیوهای آموزشی با موفقیت دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("511796489",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=11796490;
 //BA.debugLineNum = 11796490;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetReportRizFactorVisitor");
 };
RDebugUtils.currentLine=11796492;
 //BA.debugLineNum = 11796492;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetvisitor(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadgetvisitor", false))
	 {return ((String) Debug.delegate(processBA, "loadgetvisitor", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Sub LoadGetVisitor(Str As String)";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Try";
try {RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="MCode.SaveUpdate(\"Delete From TblVisitor\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblVisitor");
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblVisitor\",RowsLi";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblVisitor",_rowslist);
RDebugUtils.currentLine=10485774;
 //BA.debugLineNum = 10485774;BA.debugLine="Log(\"لیست ویزیتورها بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("510485774","لیست ویزیتورها بروزرسانی گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=10485776;
 //BA.debugLineNum = 10485776;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("510485776",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=10485777;
 //BA.debugLineNum = 10485777;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetVisitor");
 };
RDebugUtils.currentLine=10485780;
 //BA.debugLineNum = 10485780;BA.debugLine="End Sub";
return "";
}
public static String  _loadsend(int _shomarefacktor) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadsend", false))
	 {return ((String) Debug.delegate(processBA, "loadsend", new Object[] {_shomarefacktor}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub LoadSend(ShomareFacktor As Int)";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Try";
try {RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="StopService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Sendtype=\"Faktor\"";
_sendtype = "Faktor";
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="shomareFactorSelect=ShomareFacktor";
_shomarefactorselect = _shomarefacktor;
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="If shomareFactorSelect=0 Then";
if (_shomarefactorselect==0) { 
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCode";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where FldSync='False'");
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
_sendashkhasnew(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 }else {
RDebugUtils.currentLine=9240591;
 //BA.debugLineNum = 9240591;BA.debugLine="LoadSendFaktorAll";
_loadsendfaktorall();
 };
 }else 
{RDebugUtils.currentLine=9240593;
 //BA.debugLineNum = 9240593;BA.debugLine="Else if shomareFactorSelect>0 Then";
if (_shomarefactorselect>0) { 
RDebugUtils.currentLine=9240594;
 //BA.debugLineNum = 9240594;BA.debugLine="If MCode.C_Tafzili.Length>5 Then";
if (mostCurrent._mcode._c_tafzili /*String*/ .length()>5) { 
RDebugUtils.currentLine=9240595;
 //BA.debugLineNum = 9240595;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCod";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where fldCodetafzili='"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=9240596;
 //BA.debugLineNum = 9240596;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=9240597;
 //BA.debugLineNum = 9240597;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=9240599;
 //BA.debugLineNum = 9240599;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
_sendashkhasnew(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 }else {
RDebugUtils.currentLine=9240601;
 //BA.debugLineNum = 9240601;BA.debugLine="LoadSendFaktor(ShomareFacktor)";
_loadsendfaktor(BA.NumberToString(_shomarefacktor));
 };
 }else {
RDebugUtils.currentLine=9240604;
 //BA.debugLineNum = 9240604;BA.debugLine="LoadSendFaktor(ShomareFacktor)";
_loadsendfaktor(BA.NumberToString(_shomarefacktor));
 };
 }}
;
 } 
       catch (Exception e27) {
			processBA.setLastException(e27);RDebugUtils.currentLine=9240609;
 //BA.debugLineNum = 9240609;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("59240609",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=9240610;
 //BA.debugLineNum = 9240610;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadSend");
 };
RDebugUtils.currentLine=9240612;
 //BA.debugLineNum = 9240612;BA.debugLine="End Sub";
return "";
}
public static String  _sendashkhasnew(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "sendashkhasnew", false))
	 {return ((String) Debug.delegate(processBA, "sendashkhasnew", new Object[] {_str}));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub SendAshkhasNew(Str As String)";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="jobInternet.JobName =\"SendAshkhasNew\"";
_jobinternet._jobname /*String*/  = "SendAshkhasNew";
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="Log(Str)";
anywheresoftware.b4a.keywords.Common.LogImpl("59437186",_str,0);
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveAshkhasNew4","JsonDt="+_str+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="End Sub";
return "";
}
public static String  _loadsendfaktorall() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadsendfaktorall", false))
	 {return ((String) Debug.delegate(processBA, "loadsendfaktorall", null));}
anywheresoftware.b4a.objects.collections.List _listjson = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub LoadSendFaktorAll";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Try";
try {RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Dim ListJson As List";
_listjson = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="ListJson.Initialize";
_listjson.Initialize();
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="If MCode.CheckAdmin=1 Then";
if ((mostCurrent._mcode._checkadmin /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldRadi";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"+mostCurrent._mcode._raghamashar /*String*/ +"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,-1 as fldShomareFactorReal,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False'");
 }else {
RDebugUtils.currentLine=9043978;
 //BA.debugLineNum = 9043978;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldRadi";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"+mostCurrent._mcode._raghamashar /*String*/ +"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False'");
 };
RDebugUtils.currentLine=9043981;
 //BA.debugLineNum = 9043981;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=9043983;
 //BA.debugLineNum = 9043983;BA.debugLine="SendFaktor(MCode.DtToJson(Cu))";
_sendfaktor(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 }else {
RDebugUtils.currentLine=9043985;
 //BA.debugLineNum = 9043985;BA.debugLine="ToastMessageShow(\"فاکتور جهت ارسال موجود نمی باش";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("فاکتور جهت ارسال موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9043986;
 //BA.debugLineNum = 9043986;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
 } 
       catch (Exception e16) {
			processBA.setLastException(e16);RDebugUtils.currentLine=9043990;
 //BA.debugLineNum = 9043990;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("59043990",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=9043991;
 //BA.debugLineNum = 9043991;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadSendFaktorAll");
 };
RDebugUtils.currentLine=9043993;
 //BA.debugLineNum = 9043993;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=9043994;
 //BA.debugLineNum = 9043994;BA.debugLine="End Sub";
return "";
}
public static String  _loadsendfaktor(String _shomarefacktor) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadsendfaktor", false))
	 {return ((String) Debug.delegate(processBA, "loadsendfaktor", new Object[] {_shomarefacktor}));}
anywheresoftware.b4a.objects.collections.List _listjson = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub LoadSendFaktor(ShomareFacktor As String)";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Try";
try {RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Dim ListJson As List";
_listjson = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="ListJson.Initialize";
_listjson.Initialize();
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="Dim Cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set FldSend='";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblFaktor Set FldSend='0',FldSync='False' where FldShomareFaktor = '"+_shomarefacktor+"'");
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="If MCode.CheckAdmin=1 Then";
if ((mostCurrent._mcode._checkadmin /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=9371658;
 //BA.debugLineNum = 9371658;BA.debugLine="Cu = MCode.Result(\"Select FldRadif,FldShomareFa";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,'' as FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"+mostCurrent._mcode._raghamashar /*String*/ +"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,'0' as FldLat,'0' as FldLon,FldTozih,FldShomareBargasht,FldDarsadTakhfif,FldType as fldType,FldMablaghTakhfif,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,-1 as fldShomareFactorReal,fldArzeshAfzode,fldDarsadArzeshAfzode  From TblFaktor Where FldShomareFaktor ="+_shomarefacktor);
 }else {
RDebugUtils.currentLine=9371660;
 //BA.debugLineNum = 9371660;BA.debugLine="Cu = MCode.Result(\"Select FldRadif,FldShomareFa";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,'' as FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"+mostCurrent._mcode._raghamashar /*String*/ +"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,'0' as FldLat,'0' as FldLon,FldTozih,FldShomareBargasht,FldDarsadTakhfif,FldType as fldType,FldMablaghTakhfif,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,fldArzeshAfzode,fldDarsadArzeshAfzode  From TblFaktor Where FldShomareFaktor ="+_shomarefacktor);
 };
RDebugUtils.currentLine=9371666;
 //BA.debugLineNum = 9371666;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=9371668;
 //BA.debugLineNum = 9371668;BA.debugLine="SendFaktor(MCode.DtToJson(Cu))";
_sendfaktor(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 }else {
RDebugUtils.currentLine=9371670;
 //BA.debugLineNum = 9371670;BA.debugLine="ToastMessageShow(\"فاکتور جهت ارسال موجود نمی باش";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("فاکتور جهت ارسال موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9371671;
 //BA.debugLineNum = 9371671;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
 } 
       catch (Exception e18) {
			processBA.setLastException(e18);RDebugUtils.currentLine=9371674;
 //BA.debugLineNum = 9371674;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("59371674",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=9371675;
 //BA.debugLineNum = 9371675;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadSendFaktor");
 };
RDebugUtils.currentLine=9371677;
 //BA.debugLineNum = 9371677;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=9371678;
 //BA.debugLineNum = 9371678;BA.debugLine="End Sub";
return "";
}
public static String  _loadsend2(String _codetafzili) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadsend2", false))
	 {return ((String) Debug.delegate(processBA, "loadsend2", new Object[] {_codetafzili}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub LoadSend2(CodeTafzili As String)";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Try";
try {RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="StopService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Sendtype=\"Faktor\"";
_sendtype = "Faktor";
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCodet";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where FldSync='False' and fldCodetafzili="+_codetafzili);
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="MCode.C_Tafzili=CodeTafzili";
mostCurrent._mcode._c_tafzili /*String*/  = _codetafzili;
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=9306121;
 //BA.debugLineNum = 9306121;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=9306123;
 //BA.debugLineNum = 9306123;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
_sendashkhasnew(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 }else {
RDebugUtils.currentLine=9306126;
 //BA.debugLineNum = 9306126;BA.debugLine="LoadSendFaktorAll2(CodeTafzili)";
_loadsendfaktorall2(_codetafzili);
 };
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=9306130;
 //BA.debugLineNum = 9306130;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("59306130",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=9306131;
 //BA.debugLineNum = 9306131;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadSend2");
 };
RDebugUtils.currentLine=9306133;
 //BA.debugLineNum = 9306133;BA.debugLine="End Sub";
return "";
}
public static String  _loadsendfaktorall2(String _codetafzili) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadsendfaktorall2", false))
	 {return ((String) Debug.delegate(processBA, "loadsendfaktorall2", new Object[] {_codetafzili}));}
anywheresoftware.b4a.objects.collections.List _listjson = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub LoadSendFaktorAll2(CodeTafzili As String)";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Try";
try {RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="Dim ListJson As List";
_listjson = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="ListJson.Initialize";
_listjson.Initialize();
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="If MCode.CheckAdmin=1 Then";
if ((mostCurrent._mcode._checkadmin /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldRadi";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"+mostCurrent._mcode._raghamashar /*String*/ +"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,-1 as fldShomareFactorReal,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False' and FldShomareFaktor='"+BA.NumberToString(_shomarefactorselect)+"' and FldC_Tafzili='"+_codetafzili+"'");
 }else {
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldRadi";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"+mostCurrent._mcode._raghamashar /*String*/ +"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False' and FldShomareFaktor='"+BA.NumberToString(_shomarefactorselect)+"' and FldC_Tafzili='"+_codetafzili+"'");
 };
RDebugUtils.currentLine=9109519;
 //BA.debugLineNum = 9109519;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="SendFaktor(MCode.DtToJson(Cu))";
_sendfaktor(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 }else {
RDebugUtils.currentLine=9109523;
 //BA.debugLineNum = 9109523;BA.debugLine="ToastMessageShow(\"فاکتور جهت ارسال موجود نمی با";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("فاکتور جهت ارسال موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9109524;
 //BA.debugLineNum = 9109524;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
 } 
       catch (Exception e16) {
			processBA.setLastException(e16);RDebugUtils.currentLine=9109528;
 //BA.debugLineNum = 9109528;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("59109528",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=9109529;
 //BA.debugLineNum = 9109529;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadSendFaktorAll2");
 };
RDebugUtils.currentLine=9109531;
 //BA.debugLineNum = 9109531;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=9109532;
 //BA.debugLineNum = 9109532;BA.debugLine="End Sub";
return "";
}
public static String  _loadsendashkhasnew() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadsendashkhasnew", false))
	 {return ((String) Debug.delegate(processBA, "loadsendashkhasnew", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub LoadSendAshkhasNew()";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Try";
try {RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Sendtype=\"SendAshkhasNew\"";
_sendtype = "SendAshkhasNew";
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="If MCode.C_Tafzili=0 Then";
if ((mostCurrent._mcode._c_tafzili /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCode";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where FldSync='False'");
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
_sendashkhasnew(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 };
 }else 
{RDebugUtils.currentLine=9175051;
 //BA.debugLineNum = 9175051;BA.debugLine="Else if MCode.C_Tafzili.Length>0 Then";
if (mostCurrent._mcode._c_tafzili /*String*/ .length()>0) { 
RDebugUtils.currentLine=9175052;
 //BA.debugLineNum = 9175052;BA.debugLine="If MCode.C_Tafzili.Length>5 Then";
if (mostCurrent._mcode._c_tafzili /*String*/ .length()>5) { 
RDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCod";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where fldCodetafzili='"+mostCurrent._mcode._c_tafzili /*String*/ +"' and FldSync='False'");
RDebugUtils.currentLine=9175054;
 //BA.debugLineNum = 9175054;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
_sendashkhasnew(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 };
 };
 }}
;
 } 
       catch (Exception e19) {
			processBA.setLastException(e19);RDebugUtils.currentLine=9175063;
 //BA.debugLineNum = 9175063;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("59175063",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=9175065;
 //BA.debugLineNum = 9175065;BA.debugLine="End Sub";
return "";
}
public static String  _loadsenddaryaft(String _strdtdaryaft,String _strdtcheckdaryaft) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadsenddaryaft", false))
	 {return ((String) Debug.delegate(processBA, "loadsenddaryaft", new Object[] {_strdtdaryaft,_strdtcheckdaryaft}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub LoadSendDaryaft(StrDtDaryaft As String,StrDtCh";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Try";
try {RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="Sendtype=\"Daryaft\"";
_sendtype = "Daryaft";
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="dt1=StrDtDaryaft";
_dt1 = _strdtdaryaft;
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="dt2=StrDtCheckDaryaft";
_dt2 = _strdtcheckdaryaft;
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="If shomareFactorSelect=0 Then";
if (_shomarefactorselect==0) { 
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCode";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where fldCodetafzili="+mostCurrent._mcode._c_tafzili /*String*/ +" and FldSync='False'");
RDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=12255243;
 //BA.debugLineNum = 12255243;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
_sendashkhasnew(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 }else {
RDebugUtils.currentLine=12255246;
 //BA.debugLineNum = 12255246;BA.debugLine="SendDaryaft(StrDtDaryaft,StrDtCheckDaryaft)";
_senddaryaft(_strdtdaryaft,_strdtcheckdaryaft);
 };
 }else 
{RDebugUtils.currentLine=12255248;
 //BA.debugLineNum = 12255248;BA.debugLine="Else if shomareFactorSelect>0 Then";
if (_shomarefactorselect>0) { 
RDebugUtils.currentLine=12255249;
 //BA.debugLineNum = 12255249;BA.debugLine="SendDaryaft(StrDtDaryaft,StrDtCheckDaryaft)";
_senddaryaft(_strdtdaryaft,_strdtcheckdaryaft);
 }}
;
 } 
       catch (Exception e17) {
			processBA.setLastException(e17);RDebugUtils.currentLine=12255252;
 //BA.debugLineNum = 12255252;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("512255252",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=12255253;
 //BA.debugLineNum = 12255253;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadSend");
 };
RDebugUtils.currentLine=12255255;
 //BA.debugLineNum = 12255255;BA.debugLine="End Sub";
return "";
}
public static String  _senddaryaft(String _strdtdaryaft,String _strdtcheckdaryaft) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "senddaryaft", false))
	 {return ((String) Debug.delegate(processBA, "senddaryaft", new Object[] {_strdtdaryaft,_strdtcheckdaryaft}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub SendDaryaft(StrDtDaryaft As String,StrDtCheckD";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="jobInternet.JobName =\"SendDaryaft\"";
_jobinternet._jobname /*String*/  = "SendDaryaft";
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Log(StrDtDaryaft)";
anywheresoftware.b4a.keywords.Common.LogImpl("512320770",_strdtdaryaft,0);
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="Log(StrDtCheckDaryaft)";
anywheresoftware.b4a.keywords.Common.LogImpl("512320771",_strdtcheckdaryaft,0);
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveDaryaft2","JsonDaryaftDt="+_strdtdaryaft+"&JsonCheckDaryaftDt="+_strdtcheckdaryaft+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="End Sub";
return "";
}
public static String  _sendfaktor(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "sendfaktor", false))
	 {return ((String) Debug.delegate(processBA, "sendfaktor", new Object[] {_str}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub SendFaktor(Str As String)";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="jobInternet.JobName =\"SendFaktor\"";
_jobinternet._jobname /*String*/  = "SendFaktor";
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Log(Str)";
anywheresoftware.b4a.keywords.Common.LogImpl("58978434",_str,0);
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveFaktor5","JsonDt="+_str+"&Visitor="+mostCurrent._mcode._c_visitor /*String*/ +"&Imei="+mostCurrent._mcode._deviceid /*String*/ +"&Version=3");
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="End Sub";
return "";
}
public static String  _loadsendtourvisitor() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadsendtourvisitor", false))
	 {return ((String) Debug.delegate(processBA, "loadsendtourvisitor", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub LoadSendTourVisitor";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Try";
try {RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="Dim Cu As Cursor = MCode.Result($\"SELECT tblTour";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,("SELECT tblTourVisitor.fldRadif,tblTourVisitor.fldCodeSuperVisor,tblTourVisitor.fldCodeVisitor,tblTourVisitor.fldCodeGroup,tblTourVisitor.fldCodeTafzili,TblAshkhas.fldSharheTafzili,tblTourVisitor.fldDate,tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit,tblTourVisitor.fldDateNextVisit,tblTourVisitor.fldDateTozie,tblTourVisitor.fldShomareSefaresh,tblTourVisitor.fldTimeSefaresh,tblTourVisitor.fldSharh,tblTourVisitor.fldVaziat,tblTourVisitor.fldShomareFactor,tblTourVisitor.fldType,TblAshkhas.FldLat,TblAshkhas.FldLon FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND fldDateVisit = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (processBA)))+" and tblTourVisitor.fldSend='False' ORDER BY tblTourVisitor.fldRadif ASC"));
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="SendTourVisitor(MCode.DtToJson(Cu))";
_sendtourvisitor(mostCurrent._mcode._dttojson /*String*/ (processBA,_cu));
 };
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("512386311",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=12386312;
 //BA.debugLineNum = 12386312;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadSend");
 };
RDebugUtils.currentLine=12386314;
 //BA.debugLineNum = 12386314;BA.debugLine="End Sub";
return "";
}
public static String  _sendtourvisitor(String _strdttourvisitor) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "sendtourvisitor", false))
	 {return ((String) Debug.delegate(processBA, "sendtourvisitor", new Object[] {_strdttourvisitor}));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub SendTourVisitor(StrDtTourVisitor As String)";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="jobInternet.JobName =\"SendTourVisitor\"";
_jobinternet._jobname /*String*/  = "SendTourVisitor";
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="Log(StrDtTourVisitor)";
anywheresoftware.b4a.keywords.Common.LogImpl("512451842",_strdttourvisitor,0);
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveTourFromAndroid","JsonDt="+_strdttourvisitor+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="End Sub";
return "";
}
public static String  _loadshowfactorforooshbyhavale(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadshowfactorforooshbyhavale", false))
	 {return ((String) Debug.delegate(processBA, "loadshowfactorforooshbyhavale", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Sub LoadShowFactorForooshByHavale(Str As String)";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Try";
try {RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="CallSubDelayed2(Act_RizHavale,\"LoadData\",RowsLis";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_rizhavale.getObject()),"LoadData",(Object)(_rowslist));
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("510616841",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadShowFactorForooshByHavale");
 };
RDebugUtils.currentLine=10616844;
 //BA.debugLineNum = 10616844;BA.debugLine="ToastMessageShow(\"ریز حواله ی توزیع دریافت گردید\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ریز حواله ی توزیع دریافت گردید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="End Sub";
return "";
}
public static String  _loadshowrizefactorforooshbyhavale(String _str) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "loadshowrizefactorforooshbyhavale", false))
	 {return ((String) Debug.delegate(processBA, "loadshowrizefactorforooshbyhavale", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Sub LoadShowRizeFactorForooshByHavale(Str As Strin";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Try";
try {RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="MCode.SaveUpdate(\"Delete From TblRizFactorHavale";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblRizFactorHavale");
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblRizFactorHaval";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblRizFactorHavale",_rowslist);
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Log(\"ریز فاکتور های حواله دریافت گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("511272199","ریز فاکتور های حواله دریافت گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=11272203;
 //BA.debugLineNum = 11272203;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("511272203",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadShowFactorForooshByHavale");
 };
RDebugUtils.currentLine=11272207;
 //BA.debugLineNum = 11272207;BA.debugLine="End Sub";
return "";
}
public static String  _showrizefactorforooshbyhavale() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "showrizefactorforooshbyhavale", false))
	 {return ((String) Debug.delegate(processBA, "showrizefactorforooshbyhavale", null));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Sub ShowRizeFactorForooshByHavale()";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="jobInternet.JobName =\"ShowRizFactorForooshByHaval";
_jobinternet._jobname /*String*/  = "ShowRizFactorForooshByHavale";
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/ShowRizFactorForooshByHavale","Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="End Sub";
return "";
}
public static String  _sendtokenid() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "sendtokenid", false))
	 {return ((String) Debug.delegate(processBA, "sendtokenid", null));}
String _str = "";
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub SendTokenId";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="jobInternet.JobName =\"SendTokenId\"";
_jobinternet._jobname /*String*/  = "SendTokenId";
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Dim str As String=MCode.TokenPush";
_str = mostCurrent._mcode._tokenpush /*String*/ ;
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("56815747",_str,0);
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/TokenSave2","fldTokenId="+mostCurrent._mcode._deviceid /*String*/ +" &fldNameVisitor="+mostCurrent._mcode._n_visitor /*String*/ +" &fldCodeMoshtari="+mostCurrent._mcode._codemoshtari /*String*/ +" &fldVersion="+mostCurrent._mcode._version /*String*/ +" &fldVersionNumber="+mostCurrent._mcode._numberversion /*String*/ +" &fldDate="+mostCurrent._mcode._removeslashdate /*String*/ (processBA,mostCurrent._mcode._dateversion /*String*/ ));
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="End Sub";
return "";
}
public static String  _run(int _i) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "run", false))
	 {return ((String) Debug.delegate(processBA, "run", new Object[] {_i}));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub Run(i As Int)";
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="End Sub";
return "";
}
public static String  _saveandroidlog(ir.parsikhesab.pakhsh.mcode._adapterandroidlog _item) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "saveandroidlog", false))
	 {return ((String) Debug.delegate(processBA, "saveandroidlog", new Object[] {_item}));}
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub SaveAndroidLog(item As AdapterAndroidLog)";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="jobInternet.JobName =\"SaveAndroidLog\"";
_jobinternet._jobname /*String*/  = "SaveAndroidLog";
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveAndroidLog","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ +" &NameVisitor="+mostCurrent._mcode._n_visitor /*String*/ +" &ShomareMoshtari="+mostCurrent._mcode._codemoshtari /*String*/ +" &Date1="+_item.date /*String*/ +" &Time1="+_item.time /*String*/ +" &Message="+_item.message /*String*/ +" &action="+_item.Action /*String*/ +" &Version="+mostCurrent._mcode._version /*String*/ +" &VersionNumber="+mostCurrent._mcode._numberversion /*String*/ );
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="End Sub";
return "";
}
public static void  _savelocationmoshtari(String _lat,String _lon) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "savelocationmoshtari", false))
	 {Debug.delegate(processBA, "savelocationmoshtari", new Object[] {_lat,_lon}); return;}
ResumableSub_SaveLocationMoshtari rsub = new ResumableSub_SaveLocationMoshtari(null,_lat,_lon);
rsub.resume(processBA, null);
}
public static class ResumableSub_SaveLocationMoshtari extends BA.ResumableSub {
public ResumableSub_SaveLocationMoshtari(ir.parsikhesab.pakhsh.service_server parent,String _lat,String _lon) {
this.parent = parent;
this._lat = _lat;
this._lon = _lon;
}
ir.parsikhesab.pakhsh.service_server parent;
String _lat;
String _lon;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="service_server";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "service_server", "savelocationmoshtari"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="jobInternet.JobName =\"SaveLocationMoshtari\"";
parent._jobinternet._jobname /*String*/  = "SaveLocationMoshtari";
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
parent._jobinternet._poststring /*String*/ (null,"http://"+parent.mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveLocationMoshtari","C_Tafzili="+parent.mostCurrent._mcode._c_tafzili /*String*/ +" &Lat="+_lat+" &Lon="+_lon+" &Imei="+parent.mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="Request(jobInternet)";
_request(parent._jobinternet);
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _saveversionandroidinfo() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "saveversionandroidinfo", false))
	 {return ((String) Debug.delegate(processBA, "saveversionandroidinfo", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub SaveVersionAndroidInfo";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="jobInternet.JobName =\"SaveVersionAndroidInfo\"";
_jobinternet._jobname /*String*/  = "SaveVersionAndroidInfo";
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="Cur=MCode.Result(\"Select * From TblSetting\")";
_cur = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblSetting");
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="Cur.Position=0";
_cur.setPosition((int) (0));
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="Log(Cur.GetString(\"FldImei\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("512124166",_cur.GetString("FldImei"),0);
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="Log(Cur.GetString(\"FldC_Visitor\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("512124167",_cur.GetString("FldC_Visitor"),0);
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="Log(Cur.GetString(\"FldN_Visitor\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("512124168",_cur.GetString("FldN_Visitor"),0);
RDebugUtils.currentLine=12124169;
 //BA.debugLineNum = 12124169;BA.debugLine="Log(Cur.GetString(\"FldCodeMoshtari\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("512124169",_cur.GetString("FldCodeMoshtari"),0);
RDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="Log(Cur.GetString(\"fldLastVersion\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("512124170",_cur.GetString("fldLastVersion"),0);
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="Log(Cur.GetString(\"fldDateSetup\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("512124171",_cur.GetString("fldDateSetup"),0);
RDebugUtils.currentLine=12124172;
 //BA.debugLineNum = 12124172;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveVersionAndroidInfo","Imei="+_cur.GetString("FldImei")+" &CodeVisitor="+_cur.GetString("FldC_Visitor")+" &NameVisitor="+_cur.GetString("FldN_Visitor")+" &ShomareMoshtari="+_cur.GetString("FldCodeMoshtari")+" &DateVersion="+mostCurrent._mcode._dateversion /*String*/ .replace("/","")+" &DateSetup="+_cur.GetString("fldDateSetup")+" &Version="+mostCurrent._mcode._version /*String*/ +" &VersionNumber="+mostCurrent._mcode._numberversion /*String*/ +" &LastVersion="+_cur.GetString("fldLastVersion")+" &TypeVersion="+mostCurrent._mcode._typeversion /*String*/ );
RDebugUtils.currentLine=12124173;
 //BA.debugLineNum = 12124173;BA.debugLine="End Sub";
return "";
}
public static String  _sendupdatequery(String _query) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "sendupdatequery", false))
	 {return ((String) Debug.delegate(processBA, "sendupdatequery", new Object[] {_query}));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub SendUpdateQuery(query As String)";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="jobInternet.JobName =\"SendUpdateQuery\"";
_jobinternet._jobname /*String*/  = "SendUpdateQuery";
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Log(query)";
anywheresoftware.b4a.keywords.Common.LogImpl("511993090",_query,0);
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/UpdateQuery","Query="+_query+" &Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Try";
try { } 
       catch (Exception e3) {
			processBA.setLastException(e3);RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("56291460",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="Try";
try {RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
_jobinternet._initialize /*String*/ (null,processBA,"jobInternet",service_server.getObject());
RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="jobInternet.GetRequest.Timeout=50000";
_jobinternet._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=6488076;
 //BA.debugLineNum = 6488076;BA.debugLine="th.Initialise(\"th\")";
_th.Initialise(processBA,"th");
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="Select MCode.NoeGet";
switch (BA.switchObjectToInt(mostCurrent._mcode._noeget /*String*/ ,"DaryaftEtlaat","GetCodeMoshtari","GetVaziat","SendTokenId","GetEshantion2","GetVisitor","SaveTourVisit")) {
case 0: {
RDebugUtils.currentLine=6488080;
 //BA.debugLineNum = 6488080;BA.debugLine="MCode.GetDataStatus=True";
mostCurrent._mcode._getdatastatus /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6488081;
 //BA.debugLineNum = 6488081;BA.debugLine="StopService(Service_Helper)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._service_helper.getObject()));
RDebugUtils.currentLine=6488082;
 //BA.debugLineNum = 6488082;BA.debugLine="GetCurrentDate";
_getcurrentdate();
 break; }
case 1: {
RDebugUtils.currentLine=6488084;
 //BA.debugLineNum = 6488084;BA.debugLine="GetCodeMoshtari";
_getcodemoshtari();
 break; }
case 2: {
RDebugUtils.currentLine=6488087;
 //BA.debugLineNum = 6488087;BA.debugLine="GetVaziat";
_getvaziat();
 break; }
case 3: {
RDebugUtils.currentLine=6488089;
 //BA.debugLineNum = 6488089;BA.debugLine="SendTokenId";
_sendtokenid();
 break; }
case 4: {
RDebugUtils.currentLine=6488091;
 //BA.debugLineNum = 6488091;BA.debugLine="GetEshantion2";
_geteshantion2();
 break; }
case 5: {
RDebugUtils.currentLine=6488093;
 //BA.debugLineNum = 6488093;BA.debugLine="GetVisitor";
_getvisitor();
 break; }
case 6: {
RDebugUtils.currentLine=6488095;
 //BA.debugLineNum = 6488095;BA.debugLine="LoadSendTourVisitor";
_loadsendtourvisitor();
 break; }
}
;
 } 
       catch (Exception e24) {
			processBA.setLastException(e24);RDebugUtils.currentLine=6488098;
 //BA.debugLineNum = 6488098;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("56488098",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=6488099;
 //BA.debugLineNum = 6488099;BA.debugLine="myCode.SendError(LastException,\"Service_Server-S";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-Service_Start");
 };
RDebugUtils.currentLine=6488101;
 //BA.debugLineNum = 6488101;BA.debugLine="End Sub";
return "";
}
public static String  _showfactorforooshbyhavale() throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "showfactorforooshbyhavale", false))
	 {return ((String) Debug.delegate(processBA, "showfactorforooshbyhavale", null));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub ShowFactorForooshByHavale()";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="jobInternet.JobName =\"ShowFactorForooshByHavale\"";
_jobinternet._jobname /*String*/  = "ShowFactorForooshByHavale";
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/ShowFactorForooshByHavale","Imei="+mostCurrent._mcode._deviceid /*String*/ +"&flag="+BA.NumberToString(mostCurrent._mcode._gethavaleflag /*int*/ )+"&ShomareHavale="+mostCurrent._mcode._shomarehavale /*String*/ );
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Request(jobInternet)";
_request(_jobinternet);
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="End Sub";
return "";
}
public static String  _th_ended(boolean _endedok,String _error) throws Exception{
RDebugUtils.currentModule="service_server";
if (Debug.shouldDelegate(processBA, "th_ended", false))
	 {return ((String) Debug.delegate(processBA, "th_ended", new Object[] {_endedok,_error}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub th_Ended(endedOK As Boolean, error As";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Log(\"th \" & endedOK)";
anywheresoftware.b4a.keywords.Common.LogImpl("56356993","th "+BA.ObjectToString(_endedok),0);
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return "";
}
}