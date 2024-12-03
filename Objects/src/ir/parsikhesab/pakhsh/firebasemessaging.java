package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class firebasemessaging extends android.app.Service{
	public static class firebasemessaging_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (firebasemessaging) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, firebasemessaging.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static firebasemessaging mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return firebasemessaging.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.firebasemessaging");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.firebasemessaging", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (firebasemessaging) Create ***");
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
                    BA.LogInfo("** Service (firebasemessaging) Create **");
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
    	BA.LogInfo("** Service (firebasemessaging) Start **");
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
        BA.LogInfo("** Service (firebasemessaging) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (firebasemessaging) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (firebasemessaging) Destroy **");
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
public static String _datenow = "";
public static String _dateupdate = "";
public static String _typedelete = "";
public static String _title = "";
public static String _mode = "";
public static int _i = 0;
public static String _codetafzili1 = "";
public static String _codekala1 = "";
public static String _statuscodetafzili1 = "";
public static String _statuscodekala1 = "";
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
public static String  _delete() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "delete", false))
	 {return ((String) Debug.delegate(processBA, "delete", null));}
RDebugUtils.currentLine=113967104;
 //BA.debugLineNum = 113967104;BA.debugLine="Sub Delete";
RDebugUtils.currentLine=113967105;
 //BA.debugLineNum = 113967105;BA.debugLine="TypeDelete=\"kala\"";
_typedelete = "kala";
RDebugUtils.currentLine=113967106;
 //BA.debugLineNum = 113967106;BA.debugLine="GetListDelete(\"kala\")";
_getlistdelete("kala");
RDebugUtils.currentLine=113967107;
 //BA.debugLineNum = 113967107;BA.debugLine="End Sub";
return "";
}
public static String  _getlistdelete(String _strtype) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getlistdelete", false))
	 {return ((String) Debug.delegate(processBA, "getlistdelete", new Object[] {_strtype}));}
RDebugUtils.currentLine=114229248;
 //BA.debugLineNum = 114229248;BA.debugLine="Sub GetListDelete(StrType As String)";
RDebugUtils.currentLine=114229249;
 //BA.debugLineNum = 114229249;BA.debugLine="jobInternet.JobName =\"GetListDeleted\"";
_jobinternet._jobname /*String*/  = "GetListDeleted";
RDebugUtils.currentLine=114229250;
 //BA.debugLineNum = 114229250;BA.debugLine="TypeDelete=StrType";
_typedelete = _strtype;
RDebugUtils.currentLine=114229251;
 //BA.debugLineNum = 114229251;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetListDeleted","&Imei="+mostCurrent._mcode._deviceid /*String*/ +" &StrType="+_strtype+" &DateUpdate="+_dateupdate);
RDebugUtils.currentLine=114229253;
 //BA.debugLineNum = 114229253;BA.debugLine="End Sub";
return "";
}
public static String  _getashkhas(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getashkhas", false))
	 {return ((String) Debug.delegate(processBA, "getashkhas", new Object[] {_str}));}
RDebugUtils.currentLine=115474432;
 //BA.debugLineNum = 115474432;BA.debugLine="Sub GetAshkhas(str As String)";
RDebugUtils.currentLine=115474433;
 //BA.debugLineNum = 115474433;BA.debugLine="Select str";
switch (BA.switchObjectToInt(_str,"GetAshkhas","GetAshkhasAll","GetSingleAshkhas")) {
case 0: {
RDebugUtils.currentLine=115474435;
 //BA.debugLineNum = 115474435;BA.debugLine="jobInternet.JobName =\"GetAshkhas\"";
_jobinternet._jobname /*String*/  = "GetAshkhas";
RDebugUtils.currentLine=115474436;
 //BA.debugLineNum = 115474436;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetStoredFast","NameStored=ListAshkhas"+"&fldFeeTasvie="+mostCurrent._mcode._feecode /*String*/ +"&Imei="+mostCurrent._mcode._deviceid /*String*/ +" &DateUpdate="+_dateupdate);
 break; }
case 1: {
RDebugUtils.currentLine=115474438;
 //BA.debugLineNum = 115474438;BA.debugLine="jobInternet.JobName =\"GetAshkhasAll\"";
_jobinternet._jobname /*String*/  = "GetAshkhasAll";
RDebugUtils.currentLine=115474439;
 //BA.debugLineNum = 115474439;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetStoredNew","NameStored=ListAshkhas"+"&fldFeeTasvie="+mostCurrent._mcode._feecode /*String*/ +"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
 break; }
case 2: {
RDebugUtils.currentLine=115474442;
 //BA.debugLineNum = 115474442;BA.debugLine="jobInternet.JobName =\"GetAshkhas\"";
_jobinternet._jobname /*String*/  = "GetAshkhas";
RDebugUtils.currentLine=115474443;
 //BA.debugLineNum = 115474443;BA.debugLine="Log (MCode.DeviceId)";
anywheresoftware.b4a.keywords.Common.LogImpl("5115474443",mostCurrent._mcode._deviceid /*String*/ ,0);
RDebugUtils.currentLine=115474444;
 //BA.debugLineNum = 115474444;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetSingle","NameStored=ListAshkhas"+"&fldCode="+_codetafzili1+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
 break; }
}
;
RDebugUtils.currentLine=115474447;
 //BA.debugLineNum = 115474447;BA.debugLine="End Sub";
return "";
}
public static String  _getcurrentdate() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getcurrentdate", false))
	 {return ((String) Debug.delegate(processBA, "getcurrentdate", null));}
RDebugUtils.currentLine=114163712;
 //BA.debugLineNum = 114163712;BA.debugLine="Sub GetCurrentDate";
RDebugUtils.currentLine=114163713;
 //BA.debugLineNum = 114163713;BA.debugLine="jobInternet.JobName =\"GetCurrentDate\"";
_jobinternet._jobname /*String*/  = "GetCurrentDate";
RDebugUtils.currentLine=114163714;
 //BA.debugLineNum = 114163714;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetCurrentDate",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=114163716;
 //BA.debugLineNum = 114163716;BA.debugLine="End Sub";
return "";
}
public static String  _getdateupdate() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getdateupdate", false))
	 {return ((String) Debug.delegate(processBA, "getdateupdate", null));}
RDebugUtils.currentLine=114032640;
 //BA.debugLineNum = 114032640;BA.debugLine="Sub GetDateUpdate";
RDebugUtils.currentLine=114032641;
 //BA.debugLineNum = 114032641;BA.debugLine="DateUpdate=MCode.SingleResult(\"select FldDateUpda";
_dateupdate = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (processBA,"select FldDateUpdate from TblSetting"));
RDebugUtils.currentLine=114032642;
 //BA.debugLineNum = 114032642;BA.debugLine="Log(\"DateUpdate :\"&DateUpdate)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114032642","DateUpdate :"+_dateupdate,0);
RDebugUtils.currentLine=114032643;
 //BA.debugLineNum = 114032643;BA.debugLine="End Sub";
return "";
}
public static String  _geteshantion() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "geteshantion", false))
	 {return ((String) Debug.delegate(processBA, "geteshantion", null));}
RDebugUtils.currentLine=115015680;
 //BA.debugLineNum = 115015680;BA.debugLine="Public Sub GetEshantion";
RDebugUtils.currentLine=115015681;
 //BA.debugLineNum = 115015681;BA.debugLine="jobInternet.JobName =\"GetEshantion\"";
_jobinternet._jobname /*String*/  = "GetEshantion";
RDebugUtils.currentLine=115015682;
 //BA.debugLineNum = 115015682;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetEshantion","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ +" &DateUpdate="+_dateupdate);
RDebugUtils.currentLine=115015683;
 //BA.debugLineNum = 115015683;BA.debugLine="End Sub";
return "";
}
public static String  _getfee() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getfee", false))
	 {return ((String) Debug.delegate(processBA, "getfee", null));}
RDebugUtils.currentLine=115998720;
 //BA.debugLineNum = 115998720;BA.debugLine="Sub GetFee";
RDebugUtils.currentLine=115998721;
 //BA.debugLineNum = 115998721;BA.debugLine="jobInternet.JobName =\"GetFee\"";
_jobinternet._jobname /*String*/  = "GetFee";
RDebugUtils.currentLine=115998722;
 //BA.debugLineNum = 115998722;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetListFee","&Imei="+mostCurrent._mcode._deviceid /*String*/ +" &DateUpdate="+_dateupdate);
RDebugUtils.currentLine=115998723;
 //BA.debugLineNum = 115998723;BA.debugLine="End Sub";
return "";
}
public static String  _getforooshandkharid(String _codetafzili,String _codekala) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getforooshandkharid", false))
	 {return ((String) Debug.delegate(processBA, "getforooshandkharid", new Object[] {_codetafzili,_codekala}));}
RDebugUtils.currentLine=114491392;
 //BA.debugLineNum = 114491392;BA.debugLine="Public Sub GetForooshAndKharid(CodeTafzili As Stri";
RDebugUtils.currentLine=114491393;
 //BA.debugLineNum = 114491393;BA.debugLine="CodeTafzili1=CodeTafzili";
_codetafzili1 = _codetafzili;
RDebugUtils.currentLine=114491394;
 //BA.debugLineNum = 114491394;BA.debugLine="CodeKala1=CodeKala";
_codekala1 = _codekala;
RDebugUtils.currentLine=114491395;
 //BA.debugLineNum = 114491395;BA.debugLine="StatusCodeKala1=\"NotOK\"";
_statuscodekala1 = "NotOK";
RDebugUtils.currentLine=114491396;
 //BA.debugLineNum = 114491396;BA.debugLine="If StatusCodeKala1=\"NotOK\" Then";
if ((_statuscodekala1).equals("NotOK")) { 
RDebugUtils.currentLine=114491397;
 //BA.debugLineNum = 114491397;BA.debugLine="GetKala(\"GetSingleKala\")";
_getkala("GetSingleKala");
 };
RDebugUtils.currentLine=114491401;
 //BA.debugLineNum = 114491401;BA.debugLine="End Sub";
return "";
}
public static String  _getkala(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getkala", false))
	 {return ((String) Debug.delegate(processBA, "getkala", new Object[] {_str}));}
RDebugUtils.currentLine=114556928;
 //BA.debugLineNum = 114556928;BA.debugLine="Sub GetKala(str As String)";
RDebugUtils.currentLine=114556929;
 //BA.debugLineNum = 114556929;BA.debugLine="Select str";
switch (BA.switchObjectToInt(_str,"GetKala","GetKalaAll","GetSingleKala")) {
case 0: {
RDebugUtils.currentLine=114556931;
 //BA.debugLineNum = 114556931;BA.debugLine="jobInternet.JobName =\"GetKala\"";
_jobinternet._jobname /*String*/  = "GetKala";
RDebugUtils.currentLine=114556932;
 //BA.debugLineNum = 114556932;BA.debugLine="Log ( MCode.DeviceId)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114556932",mostCurrent._mcode._deviceid /*String*/ ,0);
RDebugUtils.currentLine=114556934;
 //BA.debugLineNum = 114556934;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetStoredFast","NameStored=ListKala"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ +"&fldFeeTasvie="+mostCurrent._mcode._feecode /*String*/ +" &DateUpdate="+_dateupdate);
 break; }
case 1: {
RDebugUtils.currentLine=114556937;
 //BA.debugLineNum = 114556937;BA.debugLine="jobInternet.JobName =\"GetKalaAll\"";
_jobinternet._jobname /*String*/  = "GetKalaAll";
RDebugUtils.currentLine=114556938;
 //BA.debugLineNum = 114556938;BA.debugLine="Log ( MCode.DeviceId)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114556938",mostCurrent._mcode._deviceid /*String*/ ,0);
RDebugUtils.currentLine=114556939;
 //BA.debugLineNum = 114556939;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetStoredNew","NameStored=ListKala"+"&fldFeeTasvie="+mostCurrent._mcode._feecode /*String*/ +"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
 break; }
case 2: {
RDebugUtils.currentLine=114556941;
 //BA.debugLineNum = 114556941;BA.debugLine="jobInternet.JobName =\"GetKala\"";
_jobinternet._jobname /*String*/  = "GetKala";
RDebugUtils.currentLine=114556942;
 //BA.debugLineNum = 114556942;BA.debugLine="Log ( MCode.DeviceId)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114556942",mostCurrent._mcode._deviceid /*String*/ ,0);
RDebugUtils.currentLine=114556944;
 //BA.debugLineNum = 114556944;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetSingle","NameStored=ListKala"+"&fldCode="+_codekala1+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
 break; }
}
;
RDebugUtils.currentLine=114556948;
 //BA.debugLineNum = 114556948;BA.debugLine="End Sub";
return "";
}
public static String  _getgallerykala(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getgallerykala", false))
	 {return ((String) Debug.delegate(processBA, "getgallerykala", new Object[] {_str}));}
String _tblname = "";
RDebugUtils.currentLine=114884608;
 //BA.debugLineNum = 114884608;BA.debugLine="Sub GetGalleryKala(str As String)";
RDebugUtils.currentLine=114884609;
 //BA.debugLineNum = 114884609;BA.debugLine="Select str";
switch (BA.switchObjectToInt(_str,"GetGalleryKala","GetGalleryKalaAll")) {
case 0: {
RDebugUtils.currentLine=114884611;
 //BA.debugLineNum = 114884611;BA.debugLine="jobInternet.JobName =\"GetGalleryKala\"";
_jobinternet._jobname /*String*/  = "GetGalleryKala";
RDebugUtils.currentLine=114884613;
 //BA.debugLineNum = 114884613;BA.debugLine="Dim tblname As String";
_tblname = "";
RDebugUtils.currentLine=114884614;
 //BA.debugLineNum = 114884614;BA.debugLine="tblname=\"tblGalleryPic\"";
_tblname = "tblGalleryPic";
RDebugUtils.currentLine=114884615;
 //BA.debugLineNum = 114884615;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroidFast","TblName="+_tblname+"&Imei="+mostCurrent._mcode._deviceid /*String*/ +" &DateUpdate="+_dateupdate);
 break; }
case 1: {
RDebugUtils.currentLine=114884619;
 //BA.debugLineNum = 114884619;BA.debugLine="jobInternet.JobName =\"GetGalleryKalaAll\"";
_jobinternet._jobname /*String*/  = "GetGalleryKalaAll";
RDebugUtils.currentLine=114884620;
 //BA.debugLineNum = 114884620;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=select * from tblGalleryPic where fldDateUpdate='"+_dateupdate+"'"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
 break; }
}
;
RDebugUtils.currentLine=114884624;
 //BA.debugLineNum = 114884624;BA.debugLine="End Sub";
return "";
}
public static String  _getgoroohashkhas(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getgoroohashkhas", false))
	 {return ((String) Debug.delegate(processBA, "getgoroohashkhas", new Object[] {_str}));}
String _tblname = "";
RDebugUtils.currentLine=115671040;
 //BA.debugLineNum = 115671040;BA.debugLine="Sub GetGoroohAshkhas(str As String)";
RDebugUtils.currentLine=115671041;
 //BA.debugLineNum = 115671041;BA.debugLine="Select str";
switch (BA.switchObjectToInt(_str,"GetGoroohAshkhas","GetGoroohAshkhasAll")) {
case 0: {
RDebugUtils.currentLine=115671043;
 //BA.debugLineNum = 115671043;BA.debugLine="jobInternet.JobName =\"GetGoroohAshkhas\"";
_jobinternet._jobname /*String*/  = "GetGoroohAshkhas";
RDebugUtils.currentLine=115671044;
 //BA.debugLineNum = 115671044;BA.debugLine="Dim tblname As String";
_tblname = "";
RDebugUtils.currentLine=115671045;
 //BA.debugLineNum = 115671045;BA.debugLine="tblname=\"dbo.tblGroupAshkhas\"";
_tblname = "dbo.tblGroupAshkhas";
RDebugUtils.currentLine=115671046;
 //BA.debugLineNum = 115671046;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroidFast","TblName="+_tblname+"&Imei="+mostCurrent._mcode._deviceid /*String*/ +" &DateUpdate="+_dateupdate);
 break; }
case 1: {
RDebugUtils.currentLine=115671048;
 //BA.debugLineNum = 115671048;BA.debugLine="jobInternet.JobName =\"GetGoroohAshkhasAll\"";
_jobinternet._jobname /*String*/  = "GetGoroohAshkhasAll";
RDebugUtils.currentLine=115671049;
 //BA.debugLineNum = 115671049;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupAshkhas ORDER BY CONVERT(varchar, fldGroupId)"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
 break; }
}
;
RDebugUtils.currentLine=115671051;
 //BA.debugLineNum = 115671051;BA.debugLine="End Sub";
return "";
}
public static String  _getgoroohkala(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getgoroohkala", false))
	 {return ((String) Debug.delegate(processBA, "getgoroohkala", new Object[] {_str}));}
String _tblname = "";
RDebugUtils.currentLine=115277824;
 //BA.debugLineNum = 115277824;BA.debugLine="Sub GetGoroohKala(str As String)";
RDebugUtils.currentLine=115277825;
 //BA.debugLineNum = 115277825;BA.debugLine="Select str";
switch (BA.switchObjectToInt(_str,"GetGoroohKala","GetGoroohKalaAll")) {
case 0: {
RDebugUtils.currentLine=115277827;
 //BA.debugLineNum = 115277827;BA.debugLine="jobInternet.JobName =\"GetGoroohKala\"";
_jobinternet._jobname /*String*/  = "GetGoroohKala";
RDebugUtils.currentLine=115277829;
 //BA.debugLineNum = 115277829;BA.debugLine="Dim tblname As String";
_tblname = "";
RDebugUtils.currentLine=115277830;
 //BA.debugLineNum = 115277830;BA.debugLine="tblname=\"dbo.tblGroupKala\"";
_tblname = "dbo.tblGroupKala";
RDebugUtils.currentLine=115277831;
 //BA.debugLineNum = 115277831;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroidFast","TblName="+_tblname+"&Imei="+mostCurrent._mcode._deviceid /*String*/ +" &DateUpdate="+_dateupdate);
 break; }
case 1: {
RDebugUtils.currentLine=115277834;
 //BA.debugLineNum = 115277834;BA.debugLine="jobInternet.JobName =\"GetGoroohKalaAll\"";
_jobinternet._jobname /*String*/  = "GetGoroohKalaAll";
RDebugUtils.currentLine=115277835;
 //BA.debugLineNum = 115277835;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupKala ORDER BY CONVERT(varchar, fldGroupId)"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
 break; }
}
;
RDebugUtils.currentLine=115277839;
 //BA.debugLineNum = 115277839;BA.debugLine="End Sub";
return "";
}
public static String  _gethavale() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "gethavale", false))
	 {return ((String) Debug.delegate(processBA, "gethavale", null));}
RDebugUtils.currentLine=116391936;
 //BA.debugLineNum = 116391936;BA.debugLine="Sub GetHavale";
RDebugUtils.currentLine=116391937;
 //BA.debugLineNum = 116391937;BA.debugLine="jobInternet.JobName =\"GetHavale\"";
_jobinternet._jobname /*String*/  = "GetHavale";
RDebugUtils.currentLine=116391938;
 //BA.debugLineNum = 116391938;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetStoredTozie","NameStored=GetHavale"+" &Imei="+mostCurrent._mcode._deviceid /*String*/ +" &flag="+BA.NumberToString(mostCurrent._mcode._gethavaleflag /*int*/ )+" &LastDateUpdate="+_dateupdate);
RDebugUtils.currentLine=116391939;
 //BA.debugLineNum = 116391939;BA.debugLine="End Sub";
return "";
}
public static String  _gethavalebyuser() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "gethavalebyuser", false))
	 {return ((String) Debug.delegate(processBA, "gethavalebyuser", null));}
RDebugUtils.currentLine=116457472;
 //BA.debugLineNum = 116457472;BA.debugLine="Sub GetHavaleByUser";
RDebugUtils.currentLine=116457473;
 //BA.debugLineNum = 116457473;BA.debugLine="jobInternet.JobName =\"GetHavaleByUser\"";
_jobinternet._jobname /*String*/  = "GetHavaleByUser";
RDebugUtils.currentLine=116457474;
 //BA.debugLineNum = 116457474;BA.debugLine="Log(DateUpdate)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116457474",_dateupdate,0);
RDebugUtils.currentLine=116457475;
 //BA.debugLineNum = 116457475;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/ShowHavaleGoroohiByRanadeh","Imei="+mostCurrent._mcode._deviceid /*String*/ +"&flag="+BA.NumberToString(mostCurrent._mcode._gethavaleflag /*int*/ )+"&DateUpdate="+_dateupdate);
RDebugUtils.currentLine=116457476;
 //BA.debugLineNum = 116457476;BA.debugLine="End Sub";
return "";
}
public static String  _getreportrizepishfactor3() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getreportrizepishfactor3", false))
	 {return ((String) Debug.delegate(processBA, "getreportrizepishfactor3", null));}
RDebugUtils.currentLine=116785152;
 //BA.debugLineNum = 116785152;BA.debugLine="Sub GetReportRizePishFactor3";
RDebugUtils.currentLine=116785153;
 //BA.debugLineNum = 116785153;BA.debugLine="jobInternet.JobName =\"GetReportRizePishFactor3\"";
_jobinternet._jobname /*String*/  = "GetReportRizePishFactor3";
RDebugUtils.currentLine=116785154;
 //BA.debugLineNum = 116785154;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetRizReportFactor3","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &CodeVisitor="+mostCurrent._mcode._c_visitor /*String*/ );
RDebugUtils.currentLine=116785155;
 //BA.debugLineNum = 116785155;BA.debugLine="End Sub";
return "";
}
public static String  _getsetting() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getsetting", false))
	 {return ((String) Debug.delegate(processBA, "getsetting", null));}
RDebugUtils.currentLine=114294784;
 //BA.debugLineNum = 114294784;BA.debugLine="Sub GetSetting";
RDebugUtils.currentLine=114294785;
 //BA.debugLineNum = 114294785;BA.debugLine="jobInternet.JobName =\"GetSetting\"";
_jobinternet._jobname /*String*/  = "GetSetting";
RDebugUtils.currentLine=114294786;
 //BA.debugLineNum = 114294786;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetSetting","Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=114294787;
 //BA.debugLineNum = 114294787;BA.debugLine="End Sub";
return "";
}
public static String  _gettasvie() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "gettasvie", false))
	 {return ((String) Debug.delegate(processBA, "gettasvie", null));}
RDebugUtils.currentLine=116195328;
 //BA.debugLineNum = 116195328;BA.debugLine="Sub GetTasvie";
RDebugUtils.currentLine=116195329;
 //BA.debugLineNum = 116195329;BA.debugLine="jobInternet.JobName =\"GetTasvie\"";
_jobinternet._jobname /*String*/  = "GetTasvie";
RDebugUtils.currentLine=116195330;
 //BA.debugLineNum = 116195330;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetListTasvie","&Imei="+mostCurrent._mcode._deviceid /*String*/ +" &DateUpdate="+_dateupdate);
RDebugUtils.currentLine=116195331;
 //BA.debugLineNum = 116195331;BA.debugLine="End Sub";
return "";
}
public static String  _getupdatefee() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "getupdatefee", false))
	 {return ((String) Debug.delegate(processBA, "getupdatefee", null));}
RDebugUtils.currentLine=114753536;
 //BA.debugLineNum = 114753536;BA.debugLine="Sub GetUpdateFee";
RDebugUtils.currentLine=114753537;
 //BA.debugLineNum = 114753537;BA.debugLine="jobInternet.JobName =\"GetUpdateFee\"";
_jobinternet._jobname /*String*/  = "GetUpdateFee";
RDebugUtils.currentLine=114753538;
 //BA.debugLineNum = 114753538;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetStoredNew","NameStored=UpdateFee"+"&fldFeeTasvie="+mostCurrent._mcode._feecode /*String*/ +"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=114753539;
 //BA.debugLineNum = 114753539;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "jobdone", false))
	 {return ((String) Debug.delegate(processBA, "jobdone", new Object[] {_job}));}
String _str = "";
String _strcurrentdate = "";
String _strlistdeleted = "";
RDebugUtils.currentLine=116981760;
 //BA.debugLineNum = 116981760;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=116981761;
 //BA.debugLineNum = 116981761;BA.debugLine="Job.GetRequest.Timeout=50000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=116981762;
 //BA.debugLineNum = 116981762;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=116981764;
 //BA.debugLineNum = 116981764;BA.debugLine="Try";
try {RDebugUtils.currentLine=116981765;
 //BA.debugLineNum = 116981765;BA.debugLine="Dim Str As String = Job.GetString";
_str = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=116981766;
 //BA.debugLineNum = 116981766;BA.debugLine="Log(\"JobName: \"&Job.JobName & \" ,str=\"&Str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116981766","JobName: "+_job._jobname /*String*/ +" ,str="+_str,0);
RDebugUtils.currentLine=116981767;
 //BA.debugLineNum = 116981767;BA.debugLine="Select Case Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"GetSetting","SaveToken","GetCurrentDate","GetKala","GetKalaAll","GetUpdateFee","GetGoroohKala","GetGoroohKalaAll","GetAshkhas","GetGalleryKala","GetAshkhasAll","GetVaziat","GetGoroohAshkhas","GetGoroohAshkhasAll","GetEshantion","GetFee","GetHavale","GetHavaleByUser","ShowRizFactorForooshByHavale","GetTasvie","GetReportRizePishFactor3","GetListDeleted")) {
case 0: {
RDebugUtils.currentLine=116981769;
 //BA.debugLineNum = 116981769;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981771;
 //BA.debugLineNum = 116981771;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=116981773;
 //BA.debugLineNum = 116981773;BA.debugLine="LoadGetSetting(Str)";
_loadgetsetting(_str);
 };
RDebugUtils.currentLine=116981777;
 //BA.debugLineNum = 116981777;BA.debugLine="MCode.downloadingData=False";
mostCurrent._mcode._downloadingdata /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 break; }
case 1: {
RDebugUtils.currentLine=116981779;
 //BA.debugLineNum = 116981779;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981780;
 //BA.debugLineNum = 116981780;BA.debugLine="Log(\"خطا در ارسال توکین\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116981780","خطا در ارسال توکین",0);
 }else {
RDebugUtils.currentLine=116981782;
 //BA.debugLineNum = 116981782;BA.debugLine="Log(\"توکین با موفقیت ارسال گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116981782","توکین با موفقیت ارسال گردید",0);
 };
 break; }
case 2: {
RDebugUtils.currentLine=116981786;
 //BA.debugLineNum = 116981786;BA.debugLine="Dim StrCurrentDate As String = Job.GetString";
_strcurrentdate = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=116981788;
 //BA.debugLineNum = 116981788;BA.debugLine="If StrCurrentDate <> \"No Result\" Then";
if ((_strcurrentdate).equals("No Result") == false) { 
RDebugUtils.currentLine=116981789;
 //BA.debugLineNum = 116981789;BA.debugLine="datenow=StrCurrentDate";
_datenow = _strcurrentdate;
RDebugUtils.currentLine=116981791;
 //BA.debugLineNum = 116981791;BA.debugLine="If datenow.Length = 24 Then";
if (_datenow.length()==24) { 
RDebugUtils.currentLine=116981792;
 //BA.debugLineNum = 116981792;BA.debugLine="datenow=datenow.SubString2(0,23)";
_datenow = _datenow.substring((int) (0),(int) (23));
 };
RDebugUtils.currentLine=116981795;
 //BA.debugLineNum = 116981795;BA.debugLine="Log(\"datenow: \"&datenow)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116981795","datenow: "+_datenow,0);
RDebugUtils.currentLine=116981797;
 //BA.debugLineNum = 116981797;BA.debugLine="MCode.SaveUpdate(\"Update TblSetting Set FldD";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblSetting Set FldDateUpdate='"+_datenow+"'");
 };
 break; }
case 3: {
RDebugUtils.currentLine=116981800;
 //BA.debugLineNum = 116981800;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=116981805;
 //BA.debugLineNum = 116981805;BA.debugLine="LoadGetKalaFast(Str)";
_loadgetkalafast(_str);
 };
RDebugUtils.currentLine=116981807;
 //BA.debugLineNum = 116981807;BA.debugLine="Log(\"kala update\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116981807","kala update",0);
RDebugUtils.currentLine=116981808;
 //BA.debugLineNum = 116981808;BA.debugLine="MCode.downloadingData=False";
mostCurrent._mcode._downloadingdata /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=116981809;
 //BA.debugLineNum = 116981809;BA.debugLine="If CodeTafzili1>0 And CodeKala1>0 Then";
if ((double)(Double.parseDouble(_codetafzili1))>0 && (double)(Double.parseDouble(_codekala1))>0) { 
RDebugUtils.currentLine=116981810;
 //BA.debugLineNum = 116981810;BA.debugLine="StatusCodeKala1=\"OK\"";
_statuscodekala1 = "OK";
RDebugUtils.currentLine=116981811;
 //BA.debugLineNum = 116981811;BA.debugLine="GetAshkhas(\"GetSingleAshkhas\")";
_getashkhas("GetSingleAshkhas");
 };
 break; }
case 4: {
RDebugUtils.currentLine=116981828;
 //BA.debugLineNum = 116981828;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981831;
 //BA.debugLineNum = 116981831;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=116981833;
 //BA.debugLineNum = 116981833;BA.debugLine="LoadGetKala(Str)";
_loadgetkala(_str);
 };
 break; }
case 5: {
RDebugUtils.currentLine=116981837;
 //BA.debugLineNum = 116981837;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981839;
 //BA.debugLineNum = 116981839;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=116981841;
 //BA.debugLineNum = 116981841;BA.debugLine="LoadGetUpdateFee(Str)";
_loadgetupdatefee(_str);
 };
RDebugUtils.currentLine=116981844;
 //BA.debugLineNum = 116981844;BA.debugLine="Select MCode.page";
switch (BA.switchObjectToInt(mostCurrent._mcode._page /*String*/ ,"KalaDefault","Kala_listi","SabtMarjooii","Search")) {
case 0: {
RDebugUtils.currentLine=116981847;
 //BA.debugLineNum = 116981847;BA.debugLine="CallSubDelayed(Act_KalaDefault,\"LoadKala\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_kaladefault.getObject()),"LoadKala");
 break; }
case 1: {
RDebugUtils.currentLine=116981849;
 //BA.debugLineNum = 116981849;BA.debugLine="CallSubDelayed(Act_Kala_listi,\"LoadKala\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_kala_listi.getObject()),"LoadKala");
 break; }
case 2: {
RDebugUtils.currentLine=116981851;
 //BA.debugLineNum = 116981851;BA.debugLine="CallSubDelayed(Act_KalaDefault,\"LoadKala\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_kaladefault.getObject()),"LoadKala");
 break; }
case 3: {
RDebugUtils.currentLine=116981853;
 //BA.debugLineNum = 116981853;BA.debugLine="CallSubDelayed(Act_Search,\"LoadKala\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_search.getObject()),"LoadKala");
 break; }
}
;
 break; }
case 6: {
RDebugUtils.currentLine=116981856;
 //BA.debugLineNum = 116981856;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=116981861;
 //BA.debugLineNum = 116981861;BA.debugLine="LoadGetGoroohKalaFast(Str)";
_loadgetgoroohkalafast(_str);
 };
RDebugUtils.currentLine=116981863;
 //BA.debugLineNum = 116981863;BA.debugLine="Log(\"GetGoroohKala update\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116981863","GetGoroohKala update",0);
RDebugUtils.currentLine=116981864;
 //BA.debugLineNum = 116981864;BA.debugLine="MCode.downloadingData=False";
mostCurrent._mcode._downloadingdata /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 break; }
case 7: {
RDebugUtils.currentLine=116981867;
 //BA.debugLineNum = 116981867;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981870;
 //BA.debugLineNum = 116981870;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=116981872;
 //BA.debugLineNum = 116981872;BA.debugLine="LoadGetGoroohKala(Str)";
_loadgetgoroohkala(_str);
 };
 break; }
case 8: {
RDebugUtils.currentLine=116981877;
 //BA.debugLineNum = 116981877;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=116981881;
 //BA.debugLineNum = 116981881;BA.debugLine="LoadGetAshkhasFast(Str)";
_loadgetashkhasfast(_str);
 };
RDebugUtils.currentLine=116981884;
 //BA.debugLineNum = 116981884;BA.debugLine="Log(\"GetAshkhas update\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116981884","GetAshkhas update",0);
RDebugUtils.currentLine=116981885;
 //BA.debugLineNum = 116981885;BA.debugLine="MCode.downloadingData=False";
mostCurrent._mcode._downloadingdata /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 break; }
case 9: {
RDebugUtils.currentLine=116981895;
 //BA.debugLineNum = 116981895;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981898;
 //BA.debugLineNum = 116981898;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=116981900;
 //BA.debugLineNum = 116981900;BA.debugLine="LoadGetGalleryKalaFast(Str)";
_loadgetgallerykalafast(_str);
 };
RDebugUtils.currentLine=116981906;
 //BA.debugLineNum = 116981906;BA.debugLine="MCode.downloadingData=False";
mostCurrent._mcode._downloadingdata /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 break; }
case 10: {
RDebugUtils.currentLine=116981908;
 //BA.debugLineNum = 116981908;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981911;
 //BA.debugLineNum = 116981911;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=116981913;
 //BA.debugLineNum = 116981913;BA.debugLine="LoadGetAshkhas(Str)";
_loadgetashkhas(_str);
 };
 break; }
case 11: {
RDebugUtils.currentLine=116981917;
 //BA.debugLineNum = 116981917;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981919;
 //BA.debugLineNum = 116981919;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
 };
 break; }
case 12: {
RDebugUtils.currentLine=116981925;
 //BA.debugLineNum = 116981925;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=116981929;
 //BA.debugLineNum = 116981929;BA.debugLine="LoadGetGoroohAshkhasFast(Str)";
_loadgetgoroohashkhasfast(_str);
 };
RDebugUtils.currentLine=116981932;
 //BA.debugLineNum = 116981932;BA.debugLine="Log(\"GetGoroohAshkhas update\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116981932","GetGoroohAshkhas update",0);
RDebugUtils.currentLine=116981934;
 //BA.debugLineNum = 116981934;BA.debugLine="MCode.downloadingData=False";
mostCurrent._mcode._downloadingdata /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 break; }
case 13: {
RDebugUtils.currentLine=116981936;
 //BA.debugLineNum = 116981936;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981939;
 //BA.debugLineNum = 116981939;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=116981941;
 //BA.debugLineNum = 116981941;BA.debugLine="LoadGetGoroohAshkhas(Str)";
_loadgetgoroohashkhas(_str);
 };
 break; }
case 14: {
RDebugUtils.currentLine=116981946;
 //BA.debugLineNum = 116981946;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981949;
 //BA.debugLineNum = 116981949;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=116981951;
 //BA.debugLineNum = 116981951;BA.debugLine="LoadGetEshantionFast(Str)";
_loadgeteshantionfast(_str);
 };
RDebugUtils.currentLine=116981954;
 //BA.debugLineNum = 116981954;BA.debugLine="MCode.downloadingData=False";
mostCurrent._mcode._downloadingdata /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 break; }
case 15: {
RDebugUtils.currentLine=116981956;
 //BA.debugLineNum = 116981956;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=116981961;
 //BA.debugLineNum = 116981961;BA.debugLine="LoadGetFee(Str)";
_loadgetfee(_str);
 };
RDebugUtils.currentLine=116981963;
 //BA.debugLineNum = 116981963;BA.debugLine="MCode.downloadingData=False";
mostCurrent._mcode._downloadingdata /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 break; }
case 16: {
RDebugUtils.currentLine=116981970;
 //BA.debugLineNum = 116981970;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981973;
 //BA.debugLineNum = 116981973;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=116981975;
 //BA.debugLineNum = 116981975;BA.debugLine="If MCode.GetHavaleFlag=0 Then";
if (mostCurrent._mcode._gethavaleflag /*int*/ ==0) { 
RDebugUtils.currentLine=116981976;
 //BA.debugLineNum = 116981976;BA.debugLine="LoadGetGetHavale(Str)";
_loadgetgethavale(_str);
 }else {
RDebugUtils.currentLine=116981978;
 //BA.debugLineNum = 116981978;BA.debugLine="LoadGetGetHavaleFast(Str)";
_loadgetgethavalefast(_str);
 };
 };
 break; }
case 17: {
RDebugUtils.currentLine=116981982;
 //BA.debugLineNum = 116981982;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116981985;
 //BA.debugLineNum = 116981985;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=116981987;
 //BA.debugLineNum = 116981987;BA.debugLine="LoadGetGetHavaleFast(Str)";
_loadgetgethavalefast(_str);
 };
RDebugUtils.currentLine=116981989;
 //BA.debugLineNum = 116981989;BA.debugLine="ShowRizeFactorForooshByHavale";
_showrizefactorforooshbyhavale();
 break; }
case 18: {
RDebugUtils.currentLine=116981991;
 //BA.debugLineNum = 116981991;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=116981995;
 //BA.debugLineNum = 116981995;BA.debugLine="LoadShowRizeFactorForooshByHavale(Str)";
_loadshowrizefactorforooshbyhavale(_str);
 };
RDebugUtils.currentLine=116981997;
 //BA.debugLineNum = 116981997;BA.debugLine="If MCode.page=\"Act_RizeFactorHavale\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("Act_RizeFactorHavale")) { 
RDebugUtils.currentLine=116981998;
 //BA.debugLineNum = 116981998;BA.debugLine="CallSubDelayed(Act_RizeFactorHavale,\"CreateP";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_rizefactorhavale.getObject()),"CreatePge");
 };
RDebugUtils.currentLine=116982000;
 //BA.debugLineNum = 116982000;BA.debugLine="If MCode.page=\"Act_HavaleTozie\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("Act_HavaleTozie")) { 
RDebugUtils.currentLine=116982001;
 //BA.debugLineNum = 116982001;BA.debugLine="CallSubDelayed(Act_HavaleTozie,\"LoadFilter\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_havaletozie.getObject()),"LoadFilter");
 };
 break; }
case 19: {
RDebugUtils.currentLine=116982005;
 //BA.debugLineNum = 116982005;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=116982012;
 //BA.debugLineNum = 116982012;BA.debugLine="LoadGetTasvieFast(Str)";
_loadgettasviefast(_str);
 };
RDebugUtils.currentLine=116982014;
 //BA.debugLineNum = 116982014;BA.debugLine="If MCode.downloadingData=False Then";
if (mostCurrent._mcode._downloadingdata /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=116982015;
 //BA.debugLineNum = 116982015;BA.debugLine="Select MCode.page";
switch (BA.switchObjectToInt(mostCurrent._mcode._page /*String*/ ,"KalaDefault","Kala_listi","SabtMarjooii","Search")) {
case 0: {
RDebugUtils.currentLine=116982017;
 //BA.debugLineNum = 116982017;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 break; }
case 1: {
RDebugUtils.currentLine=116982019;
 //BA.debugLineNum = 116982019;BA.debugLine="StartActivity(Act_Kala_listi)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kala_listi.getObject()));
 break; }
case 2: {
RDebugUtils.currentLine=116982021;
 //BA.debugLineNum = 116982021;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 break; }
case 3: {
RDebugUtils.currentLine=116982023;
 //BA.debugLineNum = 116982023;BA.debugLine="StartActivity(Act_Search)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_search.getObject()));
 break; }
}
;
 }else {
RDebugUtils.currentLine=116982026;
 //BA.debugLineNum = 116982026;BA.debugLine="MCode.downloadingData=False";
mostCurrent._mcode._downloadingdata /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=116982030;
 //BA.debugLineNum = 116982030;BA.debugLine="MCode.page=\"\"";
mostCurrent._mcode._page /*String*/  = "";
 break; }
case 20: {
RDebugUtils.currentLine=116982034;
 //BA.debugLineNum = 116982034;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116982036;
 //BA.debugLineNum = 116982036;BA.debugLine="ToastMessageShow(\"سفارش موجود نمی باشد\",True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("سفارش موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=116982040;
 //BA.debugLineNum = 116982040;BA.debugLine="LoadGetReportRizePishFactor3Fast(Str)";
_loadgetreportrizepishfactor3fast(_str);
 };
 break; }
case 21: {
RDebugUtils.currentLine=116982044;
 //BA.debugLineNum = 116982044;BA.debugLine="Dim StrListDeleted As String = Job.GetString";
_strlistdeleted = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=116982046;
 //BA.debugLineNum = 116982046;BA.debugLine="If StrListDeleted = \"No Result\" Then";
if ((_strlistdeleted).equals("No Result")) { 
RDebugUtils.currentLine=116982048;
 //BA.debugLineNum = 116982048;BA.debugLine="Select TypeDelete";
switch (BA.switchObjectToInt(_typedelete,"kala","ashkhas","GroupKala","GalleryPic","GroupAshkhas","deleteall")) {
case 0: {
RDebugUtils.currentLine=116982050;
 //BA.debugLineNum = 116982050;BA.debugLine="Log(\"لیست حذف کالا خالی است\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116982050","لیست حذف کالا خالی است",0);
 break; }
case 1: {
RDebugUtils.currentLine=116982052;
 //BA.debugLineNum = 116982052;BA.debugLine="Log(\"لیست حذف اشخاص خالی است\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116982052","لیست حذف اشخاص خالی است",0);
 break; }
case 2: {
RDebugUtils.currentLine=116982054;
 //BA.debugLineNum = 116982054;BA.debugLine="Log(\"لیست حذف گروه کالا خالی است\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116982054","لیست حذف گروه کالا خالی است",0);
 break; }
case 3: {
RDebugUtils.currentLine=116982056;
 //BA.debugLineNum = 116982056;BA.debugLine="Log(\"لیست حذف گالری تصاویر خالی است\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116982056","لیست حذف گالری تصاویر خالی است",0);
 break; }
case 4: {
RDebugUtils.currentLine=116982058;
 //BA.debugLineNum = 116982058;BA.debugLine="Log(\"لیست حذف گروه اشخاص خالی است\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116982058","لیست حذف گروه اشخاص خالی است",0);
 break; }
case 5: {
RDebugUtils.currentLine=116982060;
 //BA.debugLineNum = 116982060;BA.debugLine="Log(\"لیست حذف کلی خالی است\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116982060","لیست حذف کلی خالی است",0);
 break; }
}
;
 }else {
RDebugUtils.currentLine=116982065;
 //BA.debugLineNum = 116982065;BA.debugLine="LoadGetListDelete(StrListDeleted)";
_loadgetlistdelete(_strlistdeleted);
 };
RDebugUtils.currentLine=116982068;
 //BA.debugLineNum = 116982068;BA.debugLine="Select TypeDelete";
switch (BA.switchObjectToInt(_typedelete,"kala","ashkhas","GroupKala","GetTokenData")) {
case 0: {
RDebugUtils.currentLine=116982070;
 //BA.debugLineNum = 116982070;BA.debugLine="TypeDelete=\"ashkhas\"";
_typedelete = "ashkhas";
RDebugUtils.currentLine=116982071;
 //BA.debugLineNum = 116982071;BA.debugLine="GetListDelete(\"ashkhas\")";
_getlistdelete("ashkhas");
 break; }
case 1: {
RDebugUtils.currentLine=116982074;
 //BA.debugLineNum = 116982074;BA.debugLine="TypeDelete=\"GroupKala\"";
_typedelete = "GroupKala";
RDebugUtils.currentLine=116982075;
 //BA.debugLineNum = 116982075;BA.debugLine="GetListDelete(\"GroupKala\")";
_getlistdelete("GroupKala");
 break; }
case 2: {
RDebugUtils.currentLine=116982077;
 //BA.debugLineNum = 116982077;BA.debugLine="TypeDelete=\"GroupAshkhas\"";
_typedelete = "GroupAshkhas";
RDebugUtils.currentLine=116982078;
 //BA.debugLineNum = 116982078;BA.debugLine="GetListDelete(\"GroupAshkhas\")";
_getlistdelete("GroupAshkhas");
 break; }
case 3: {
RDebugUtils.currentLine=116982081;
 //BA.debugLineNum = 116982081;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=116982083;
 //BA.debugLineNum = 116982083;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
 };
 break; }
}
;
RDebugUtils.currentLine=116982093;
 //BA.debugLineNum = 116982093;BA.debugLine="StartService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=116982094;
 //BA.debugLineNum = 116982094;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116982094","Gps Start",0);
 break; }
}
;
 } 
       catch (Exception e221) {
			processBA.setLastException(e221);RDebugUtils.currentLine=116982102;
 //BA.debugLineNum = 116982102;BA.debugLine="StartService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=116982103;
 //BA.debugLineNum = 116982103;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116982103","Gps Start",0);
RDebugUtils.currentLine=116982104;
 //BA.debugLineNum = 116982104;BA.debugLine="Log(\"error: \"&Job.JobName)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116982104","error: "+_job._jobname /*String*/ ,0);
RDebugUtils.currentLine=116982105;
 //BA.debugLineNum = 116982105;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116982105",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=116982106;
 //BA.debugLineNum = 116982106;BA.debugLine="myCode.SendError(Job.ErrorMessage,\"Service_Serv";
mostCurrent._mycode._senderror /*void*/ (processBA,_job._errormessage /*String*/ ,"Service_Server-JobDone: "+_job._jobname /*String*/ );
 };
 }else {
RDebugUtils.currentLine=116982109;
 //BA.debugLineNum = 116982109;BA.debugLine="myCode.SendError(Job.ErrorMessage,\"Service_Serve";
mostCurrent._mycode._senderror /*void*/ (processBA,_job._errormessage /*String*/ ,"Service_Server-JobDone: "+_job._jobname /*String*/ );
 };
RDebugUtils.currentLine=116982111;
 //BA.debugLineNum = 116982111;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetsetting(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetsetting", false))
	 {return ((String) Debug.delegate(processBA, "loadgetsetting", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.objects.collections.Map _fields = null;
anywheresoftware.b4a.objects.collections.Map _where = null;
RDebugUtils.currentLine=114360320;
 //BA.debugLineNum = 114360320;BA.debugLine="Sub LoadGetSetting(Str As String)";
RDebugUtils.currentLine=114360321;
 //BA.debugLineNum = 114360321;BA.debugLine="Try";
try {RDebugUtils.currentLine=114360322;
 //BA.debugLineNum = 114360322;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=114360323;
 //BA.debugLineNum = 114360323;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114360324;
 //BA.debugLineNum = 114360324;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=114360325;
 //BA.debugLineNum = 114360325;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=114360326;
 //BA.debugLineNum = 114360326;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=114360327;
 //BA.debugLineNum = 114360327;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=114360328;
 //BA.debugLineNum = 114360328;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114360329;
 //BA.debugLineNum = 114360329;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114360331;
 //BA.debugLineNum = 114360331;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=114360332;
 //BA.debugLineNum = 114360332;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=114360333;
 //BA.debugLineNum = 114360333;BA.debugLine="Fields.Put(\"FldImei\",MCode.DeviceId)";
_fields.Put((Object)("FldImei"),(Object)(mostCurrent._mcode._deviceid /*String*/ ));
RDebugUtils.currentLine=114360334;
 //BA.debugLineNum = 114360334;BA.debugLine="Fields.Put(\"FldC_Visitor\",Row.Get(\"FldC_Visitor";
_fields.Put((Object)("FldC_Visitor"),_row.Get((Object)("FldC_Visitor")));
RDebugUtils.currentLine=114360335;
 //BA.debugLineNum = 114360335;BA.debugLine="Fields.Put(\"FldN_Visitor\",Row.Get(\"FldN_Visitor";
_fields.Put((Object)("FldN_Visitor"),_row.Get((Object)("FldN_Visitor")));
RDebugUtils.currentLine=114360336;
 //BA.debugLineNum = 114360336;BA.debugLine="Fields.Put(\"FldGps\",Row.Get(\"FldGps\"))";
_fields.Put((Object)("FldGps"),_row.Get((Object)("FldGps")));
RDebugUtils.currentLine=114360337;
 //BA.debugLineNum = 114360337;BA.debugLine="Fields.Put(\"FldIntervalGps\",Row.Get(\"FldInterva";
_fields.Put((Object)("FldIntervalGps"),_row.Get((Object)("FldIntervalGps")));
RDebugUtils.currentLine=114360338;
 //BA.debugLineNum = 114360338;BA.debugLine="Fields.Put(\"FldNoeDate\",Row.Get(\"FldNoeDate\"))";
_fields.Put((Object)("FldNoeDate"),_row.Get((Object)("FldNoeDate")));
RDebugUtils.currentLine=114360339;
 //BA.debugLineNum = 114360339;BA.debugLine="Fields.Put(\"FldRound\",Row.Get(\"FldRound\"))";
_fields.Put((Object)("FldRound"),_row.Get((Object)("FldRound")));
RDebugUtils.currentLine=114360340;
 //BA.debugLineNum = 114360340;BA.debugLine="Fields.Put(\"FldKalaManfi\",Row.Get(\"FldKalaManfi";
_fields.Put((Object)("FldKalaManfi"),_row.Get((Object)("FldKalaManfi")));
RDebugUtils.currentLine=114360341;
 //BA.debugLineNum = 114360341;BA.debugLine="Fields.Put(\"FldTaghirFeeKala\",Row.Get(\"FldTaghi";
_fields.Put((Object)("FldTaghirFeeKala"),_row.Get((Object)("FldTaghirFeeKala")));
RDebugUtils.currentLine=114360342;
 //BA.debugLineNum = 114360342;BA.debugLine="Fields.Put(\"fldNamayeshKalaSefr\",Row.Get(\"fldNa";
_fields.Put((Object)("fldNamayeshKalaSefr"),_row.Get((Object)("fldNamayeshKalaSefr")));
RDebugUtils.currentLine=114360343;
 //BA.debugLineNum = 114360343;BA.debugLine="Fields.Put(\"FldDastrasiKala\",Row.Get(\"FldDastra";
_fields.Put((Object)("FldDastrasiKala"),_row.Get((Object)("FldDastrasiKala")));
RDebugUtils.currentLine=114360344;
 //BA.debugLineNum = 114360344;BA.debugLine="Fields.Put(\"FldDastrasiAshkhas\",Row.Get(\"FldDas";
_fields.Put((Object)("FldDastrasiAshkhas"),_row.Get((Object)("FldDastrasiAshkhas")));
RDebugUtils.currentLine=114360345;
 //BA.debugLineNum = 114360345;BA.debugLine="Fields.Put(\"FldAdmin\",Row.Get(\"FldAdmin\"))";
_fields.Put((Object)("FldAdmin"),_row.Get((Object)("FldAdmin")));
RDebugUtils.currentLine=114360346;
 //BA.debugLineNum = 114360346;BA.debugLine="Fields.Put(\"FldCheckAdmin\",Row.Get(\"FldCheckAdm";
_fields.Put((Object)("FldCheckAdmin"),_row.Get((Object)("FldCheckAdmin")));
RDebugUtils.currentLine=114360347;
 //BA.debugLineNum = 114360347;BA.debugLine="Fields.Put(\"FldTakhfifKala\",Row.Get(\"FldTakhfif";
_fields.Put((Object)("FldTakhfifKala"),_row.Get((Object)("FldTakhfifKala")));
RDebugUtils.currentLine=114360348;
 //BA.debugLineNum = 114360348;BA.debugLine="Fields.Put(\"FldTozie\",Row.Get(\"FldTozie\"))";
_fields.Put((Object)("FldTozie"),_row.Get((Object)("FldTozie")));
RDebugUtils.currentLine=114360349;
 //BA.debugLineNum = 114360349;BA.debugLine="Fields.Put(\"FldVisitor\",Row.Get(\"FldVisitor\"))";
_fields.Put((Object)("FldVisitor"),_row.Get((Object)("FldVisitor")));
RDebugUtils.currentLine=114360350;
 //BA.debugLineNum = 114360350;BA.debugLine="Fields.Put(\"FldVahedPool\",Row.Get(\"FldVahedPool";
_fields.Put((Object)("FldVahedPool"),_row.Get((Object)("FldVahedPool")));
RDebugUtils.currentLine=114360351;
 //BA.debugLineNum = 114360351;BA.debugLine="Fields.Put(\"FldHideMojodi\",Row.Get(\"FldHideMojo";
_fields.Put((Object)("FldHideMojodi"),_row.Get((Object)("FldHideMojodi")));
RDebugUtils.currentLine=114360352;
 //BA.debugLineNum = 114360352;BA.debugLine="Fields.Put(\"FldSendMarjoie\",Row.Get(\"FldSendMar";
_fields.Put((Object)("FldSendMarjoie"),_row.Get((Object)("FldSendMarjoie")));
RDebugUtils.currentLine=114360353;
 //BA.debugLineNum = 114360353;BA.debugLine="Fields.Put(\"FldPicOnline\",Row.Get(\"FldPicOnline";
_fields.Put((Object)("FldPicOnline"),_row.Get((Object)("FldPicOnline")));
RDebugUtils.currentLine=114360354;
 //BA.debugLineNum = 114360354;BA.debugLine="Fields.Put(\"FldDaryaft\",Row.Get(\"FldDaryaft\"))";
_fields.Put((Object)("FldDaryaft"),_row.Get((Object)("FldDaryaft")));
RDebugUtils.currentLine=114360355;
 //BA.debugLineNum = 114360355;BA.debugLine="Fields.Put(\"FldGetDataOnline\",Row.Get(\"FldGetDa";
_fields.Put((Object)("FldGetDataOnline"),_row.Get((Object)("FldGetDataOnline")));
RDebugUtils.currentLine=114360356;
 //BA.debugLineNum = 114360356;BA.debugLine="Fields.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
_fields.Put((Object)("FldAmani"),_row.Get((Object)("FldAmani")));
RDebugUtils.currentLine=114360357;
 //BA.debugLineNum = 114360357;BA.debugLine="Fields.Put(\"FldMojavezSefaresh\",Row.Get(\"FldMoj";
_fields.Put((Object)("FldMojavezSefaresh"),_row.Get((Object)("FldMojavezSefaresh")));
RDebugUtils.currentLine=114360358;
 //BA.debugLineNum = 114360358;BA.debugLine="Fields.Put(\"FldConnectionStatus\",Row.Get(\"FldCo";
_fields.Put((Object)("FldConnectionStatus"),_row.Get((Object)("FldConnectionStatus")));
RDebugUtils.currentLine=114360359;
 //BA.debugLineNum = 114360359;BA.debugLine="Fields.Put(\"FldEshantionTabaghati\",Row.Get(\"Fld";
_fields.Put((Object)("FldEshantionTabaghati"),_row.Get((Object)("FldEshantionTabaghati")));
RDebugUtils.currentLine=114360360;
 //BA.debugLineNum = 114360360;BA.debugLine="Fields.Put(\"FldEshantionRemove\",Row.Get(\"FldEsh";
_fields.Put((Object)("FldEshantionRemove"),_row.Get((Object)("FldEshantionRemove")));
RDebugUtils.currentLine=114360361;
 //BA.debugLineNum = 114360361;BA.debugLine="Where.Put(\"FldId\",1)";
_where.Put((Object)("FldId"),(Object)(1));
RDebugUtils.currentLine=114360363;
 //BA.debugLineNum = 114360363;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblSetting\",Fi";
mostCurrent._dbutils._updaterecord2 /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblSetting",_fields,_where);
 }
};
RDebugUtils.currentLine=114360368;
 //BA.debugLineNum = 114360368;BA.debugLine="MCode.UpdateSetting";
mostCurrent._mcode._updatesetting /*String*/ (processBA);
RDebugUtils.currentLine=114360373;
 //BA.debugLineNum = 114360373;BA.debugLine="Log(\"تنظیمات با موفقیت دریافت گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5114360373","تنظیمات با موفقیت دریافت گردید",0);
 } 
       catch (Exception e46) {
			processBA.setLastException(e46);RDebugUtils.currentLine=114360375;
 //BA.debugLineNum = 114360375;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114360375",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=114360376;
 //BA.debugLineNum = 114360376;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetSetting");
 };
RDebugUtils.currentLine=114360378;
 //BA.debugLineNum = 114360378;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetkalafast(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetkalafast", false))
	 {return ((String) Debug.delegate(processBA, "loadgetkalafast", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crow = null;
int _countrow = 0;
anywheresoftware.b4a.objects.collections.Map _fields = null;
anywheresoftware.b4a.objects.collections.Map _where = null;
String _path = "";
RDebugUtils.currentLine=114622464;
 //BA.debugLineNum = 114622464;BA.debugLine="Sub LoadGetKalaFast(Str As String)";
RDebugUtils.currentLine=114622465;
 //BA.debugLineNum = 114622465;BA.debugLine="Try";
try {RDebugUtils.currentLine=114622466;
 //BA.debugLineNum = 114622466;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=114622467;
 //BA.debugLineNum = 114622467;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114622468;
 //BA.debugLineNum = 114622468;BA.debugLine="Dim crow As  Cursor";
_crow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=114622469;
 //BA.debugLineNum = 114622469;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=114622470;
 //BA.debugLineNum = 114622470;BA.debugLine="Row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=114622471;
 //BA.debugLineNum = 114622471;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=114622472;
 //BA.debugLineNum = 114622472;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=114622473;
 //BA.debugLineNum = 114622473;BA.debugLine="Log(Str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114622473",_str,0);
RDebugUtils.currentLine=114622474;
 //BA.debugLineNum = 114622474;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=114622476;
 //BA.debugLineNum = 114622476;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=114622477;
 //BA.debugLineNum = 114622477;BA.debugLine="Log(\"fldCodeKala:\"& Row.Get(\"fldCodeKala\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5114622477","fldCodeKala:"+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))),0);
RDebugUtils.currentLine=114622479;
 //BA.debugLineNum = 114622479;BA.debugLine="crow=MCode.Result(\"select * from TblKala where f";
_crow = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblKala where fldCodeKala="+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))));
RDebugUtils.currentLine=114622480;
 //BA.debugLineNum = 114622480;BA.debugLine="CountRow=crow.RowCount";
_countrow = _crow.getRowCount();
RDebugUtils.currentLine=114622481;
 //BA.debugLineNum = 114622481;BA.debugLine="If CountRow =0 Then";
if (_countrow==0) { 
RDebugUtils.currentLine=114622482;
 //BA.debugLineNum = 114622482;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblKala\",RowsLis";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblKala",_rowslist);
 }else 
{RDebugUtils.currentLine=114622487;
 //BA.debugLineNum = 114622487;BA.debugLine="Else if CountRow>0 Then";
if (_countrow>0) { 
RDebugUtils.currentLine=114622498;
 //BA.debugLineNum = 114622498;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114622499;
 //BA.debugLineNum = 114622499;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114622501;
 //BA.debugLineNum = 114622501;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=114622502;
 //BA.debugLineNum = 114622502;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=114622503;
 //BA.debugLineNum = 114622503;BA.debugLine="Fields.Put(\"fldNameKala\",Row.Get(\"fldNameKala\")";
_fields.Put((Object)("fldNameKala"),_row.Get((Object)("fldNameKala")));
RDebugUtils.currentLine=114622504;
 //BA.debugLineNum = 114622504;BA.debugLine="Fields.Put(\"fldNameVahed\",Row.Get(\"fldNameVahed";
_fields.Put((Object)("fldNameVahed"),_row.Get((Object)("fldNameVahed")));
RDebugUtils.currentLine=114622505;
 //BA.debugLineNum = 114622505;BA.debugLine="Fields.Put(\"fldNameVahed2\",Row.Get(\"fldNameVahe";
_fields.Put((Object)("fldNameVahed2"),_row.Get((Object)("fldNameVahed2")));
RDebugUtils.currentLine=114622506;
 //BA.debugLineNum = 114622506;BA.debugLine="Fields.Put(\"SumMande\",Row.Get(\"SumMande\"))";
_fields.Put((Object)("SumMande"),_row.Get((Object)("SumMande")));
RDebugUtils.currentLine=114622507;
 //BA.debugLineNum = 114622507;BA.debugLine="Fields.Put(\"fldTedadDarKarton\",Row.Get(\"fldTeda";
_fields.Put((Object)("fldTedadDarKarton"),_row.Get((Object)("fldTedadDarKarton")));
RDebugUtils.currentLine=114622508;
 //BA.debugLineNum = 114622508;BA.debugLine="Fields.Put(\"fldFeeForoosh\",Row.Get(\"fldFeeForoo";
_fields.Put((Object)("fldFeeForoosh"),_row.Get((Object)("fldFeeForoosh")));
RDebugUtils.currentLine=114622509;
 //BA.debugLineNum = 114622509;BA.debugLine="Fields.Put(\"fldCodeGroup\",Row.Get(\"fldCodeGroup";
_fields.Put((Object)("fldCodeGroup"),_row.Get((Object)("fldCodeGroup")));
RDebugUtils.currentLine=114622510;
 //BA.debugLineNum = 114622510;BA.debugLine="Fields.Put(\"fldGhymatMasrafkonande\",Row.Get(\"fl";
_fields.Put((Object)("fldGhymatMasrafkonande"),_row.Get((Object)("fldGhymatMasrafkonande")));
RDebugUtils.currentLine=114622511;
 //BA.debugLineNum = 114622511;BA.debugLine="Fields.Put(\"fldPathPic\",Row.Get(\"fldPathPic\"))";
_fields.Put((Object)("fldPathPic"),_row.Get((Object)("fldPathPic")));
RDebugUtils.currentLine=114622512;
 //BA.debugLineNum = 114622512;BA.debugLine="Fields.Put(\"fldFeeTasvie\",Row.Get(\"fldFeeTasvie";
_fields.Put((Object)("fldFeeTasvie"),_row.Get((Object)("fldFeeTasvie")));
RDebugUtils.currentLine=114622513;
 //BA.debugLineNum = 114622513;BA.debugLine="Fields.Put(\"fldSharh\",Row.Get(\"fldSharh\"))";
_fields.Put((Object)("fldSharh"),_row.Get((Object)("fldSharh")));
RDebugUtils.currentLine=114622514;
 //BA.debugLineNum = 114622514;BA.debugLine="Where.Put(\"fldCodeKala\",Row.Get(\"fldCodeKala\"))";
_where.Put((Object)("fldCodeKala"),_row.Get((Object)("fldCodeKala")));
RDebugUtils.currentLine=114622518;
 //BA.debugLineNum = 114622518;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblKala\",Fiel";
mostCurrent._dbutils._updaterecord2 /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblKala",_fields,_where);
RDebugUtils.currentLine=114622531;
 //BA.debugLineNum = 114622531;BA.debugLine="If MCode.PicOnline=0 Then";
if ((mostCurrent._mcode._piconline /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=114622532;
 //BA.debugLineNum = 114622532;BA.debugLine="Dim path As String=myCode.GetPathPicByCodeKa";
_path = mostCurrent._mycode._getpathpicbycodekala /*String*/ (processBA,BA.ObjectToString(_row.Get((Object)("fldCodeKala"))));
RDebugUtils.currentLine=114622533;
 //BA.debugLineNum = 114622533;BA.debugLine="Log(path)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114622533",_path,0);
RDebugUtils.currentLine=114622534;
 //BA.debugLineNum = 114622534;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set fldPath";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblKala Set fldPathPic='"+_path+"' where FldCodeKala="+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))));
 };
 }}
;
 }
};
RDebugUtils.currentLine=114622546;
 //BA.debugLineNum = 114622546;BA.debugLine="Log(\"لیست کالا بروزرسانی گردید:   \" & RowsList.S";
anywheresoftware.b4a.keywords.Common.LogImpl("5114622546","لیست کالا بروزرسانی گردید:   "+BA.NumberToString(_rowslist.getSize()),0);
 } 
       catch (Exception e44) {
			processBA.setLastException(e44);RDebugUtils.currentLine=114622549;
 //BA.debugLineNum = 114622549;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114622549",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=114622550;
 //BA.debugLineNum = 114622550;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetKalaFast");
 };
RDebugUtils.currentLine=114622553;
 //BA.debugLineNum = 114622553;BA.debugLine="GetCurrentDate";
_getcurrentdate();
RDebugUtils.currentLine=114622554;
 //BA.debugLineNum = 114622554;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetkala(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetkala", false))
	 {return ((String) Debug.delegate(processBA, "loadgetkala", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _path = "";
RDebugUtils.currentLine=114688000;
 //BA.debugLineNum = 114688000;BA.debugLine="Sub LoadGetKala(Str As String)";
RDebugUtils.currentLine=114688001;
 //BA.debugLineNum = 114688001;BA.debugLine="Try";
try {RDebugUtils.currentLine=114688002;
 //BA.debugLineNum = 114688002;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=114688003;
 //BA.debugLineNum = 114688003;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114688004;
 //BA.debugLineNum = 114688004;BA.debugLine="Dim Cu As  Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=114688005;
 //BA.debugLineNum = 114688005;BA.debugLine="Row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=114688007;
 //BA.debugLineNum = 114688007;BA.debugLine="MCode.SaveUpdate(\"Delete From TblKala\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblKala");
RDebugUtils.currentLine=114688008;
 //BA.debugLineNum = 114688008;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=114688009;
 //BA.debugLineNum = 114688009;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=114688010;
 //BA.debugLineNum = 114688010;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblKala\",RowsList";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblKala",_rowslist);
RDebugUtils.currentLine=114688011;
 //BA.debugLineNum = 114688011;BA.debugLine="If MCode.PicOnline=0 Then";
if ((mostCurrent._mcode._piconline /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=114688012;
 //BA.debugLineNum = 114688012;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=114688014;
 //BA.debugLineNum = 114688014;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=114688015;
 //BA.debugLineNum = 114688015;BA.debugLine="Dim path As String=myCode.GetPathPicByCodeKala";
_path = mostCurrent._mycode._getpathpicbycodekala /*String*/ (processBA,BA.ObjectToString(_row.Get((Object)("fldCodeKala"))));
RDebugUtils.currentLine=114688016;
 //BA.debugLineNum = 114688016;BA.debugLine="Log(path)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114688016",_path,0);
RDebugUtils.currentLine=114688018;
 //BA.debugLineNum = 114688018;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set fldPathPi";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblKala Set fldPathPic='"+_path+"' where FldCodeKala="+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))));
 }
};
 };
RDebugUtils.currentLine=114688027;
 //BA.debugLineNum = 114688027;BA.debugLine="Cu=MCode.Result(\"Select * From TblKala\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblKala");
RDebugUtils.currentLine=114688028;
 //BA.debugLineNum = 114688028;BA.debugLine="Log(\"لیست کالا بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5114688028","لیست کالا بروزرسانی گردید",0);
RDebugUtils.currentLine=114688029;
 //BA.debugLineNum = 114688029;BA.debugLine="ToastMessageShow(\"لیست کالا بروزرسانی گردید:   \"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست کالا بروزرسانی گردید:   "+BA.NumberToString(_cu.getRowCount())),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e22) {
			processBA.setLastException(e22);RDebugUtils.currentLine=114688031;
 //BA.debugLineNum = 114688031;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114688031",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=114688032;
 //BA.debugLineNum = 114688032;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetKala");
 };
RDebugUtils.currentLine=114688034;
 //BA.debugLineNum = 114688034;BA.debugLine="GetCurrentDate";
_getcurrentdate();
RDebugUtils.currentLine=114688035;
 //BA.debugLineNum = 114688035;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetupdatefee(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetupdatefee", false))
	 {return ((String) Debug.delegate(processBA, "loadgetupdatefee", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=114819072;
 //BA.debugLineNum = 114819072;BA.debugLine="Sub LoadGetUpdateFee(Str As String)";
RDebugUtils.currentLine=114819073;
 //BA.debugLineNum = 114819073;BA.debugLine="Try";
try {RDebugUtils.currentLine=114819074;
 //BA.debugLineNum = 114819074;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=114819075;
 //BA.debugLineNum = 114819075;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114819076;
 //BA.debugLineNum = 114819076;BA.debugLine="Row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=114819078;
 //BA.debugLineNum = 114819078;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=114819079;
 //BA.debugLineNum = 114819079;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=114819081;
 //BA.debugLineNum = 114819081;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=114819082;
 //BA.debugLineNum = 114819082;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=114819083;
 //BA.debugLineNum = 114819083;BA.debugLine="Log(\"fldCodeKala:\"& Row.Get(\"fldCodeKala\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5114819083","fldCodeKala:"+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))),0);
RDebugUtils.currentLine=114819084;
 //BA.debugLineNum = 114819084;BA.debugLine="Log(\"fldFeeTasvie:\"& Row.Get(\"fldFeeTasvie\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5114819084","fldFeeTasvie:"+BA.ObjectToString(_row.Get((Object)("fldFeeTasvie"))),0);
RDebugUtils.currentLine=114819085;
 //BA.debugLineNum = 114819085;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set fldFeeTasvi";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblKala Set fldFeeTasvie='"+BA.ObjectToString(_row.Get((Object)("fldFeeTasvie")))+"'"+" where fldCodeKala="+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))));
 }
};
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=114819089;
 //BA.debugLineNum = 114819089;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114819089",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=114819090;
 //BA.debugLineNum = 114819090;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetUpdateFee");
 };
RDebugUtils.currentLine=114819092;
 //BA.debugLineNum = 114819092;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgoroohkalafast(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetgoroohkalafast", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgoroohkalafast", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crow = null;
int _countrow = 0;
RDebugUtils.currentLine=115343360;
 //BA.debugLineNum = 115343360;BA.debugLine="Sub LoadGetGoroohKalaFast(Str As String)";
RDebugUtils.currentLine=115343361;
 //BA.debugLineNum = 115343361;BA.debugLine="Try";
try {RDebugUtils.currentLine=115343362;
 //BA.debugLineNum = 115343362;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115343363;
 //BA.debugLineNum = 115343363;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115343364;
 //BA.debugLineNum = 115343364;BA.debugLine="Dim crow As  Cursor";
_crow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=115343365;
 //BA.debugLineNum = 115343365;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=115343368;
 //BA.debugLineNum = 115343368;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=115343369;
 //BA.debugLineNum = 115343369;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=115343371;
 //BA.debugLineNum = 115343371;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=115343373;
 //BA.debugLineNum = 115343373;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=115343374;
 //BA.debugLineNum = 115343374;BA.debugLine="Log(\"FldC_Gorooh:\"& Row.Get(\"fldGroupId\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5115343374","FldC_Gorooh:"+BA.ObjectToString(_row.Get((Object)("fldGroupId"))),0);
RDebugUtils.currentLine=115343376;
 //BA.debugLineNum = 115343376;BA.debugLine="crow=MCode.Result(\"select * from TblGoroohKala w";
_crow = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblGoroohKala where FldC_Gorooh="+BA.ObjectToString(_row.Get((Object)("fldGroupId"))));
RDebugUtils.currentLine=115343377;
 //BA.debugLineNum = 115343377;BA.debugLine="CountRow=crow.RowCount";
_countrow = _crow.getRowCount();
RDebugUtils.currentLine=115343378;
 //BA.debugLineNum = 115343378;BA.debugLine="If CountRow =0 Then";
if (_countrow==0) { 
RDebugUtils.currentLine=115343379;
 //BA.debugLineNum = 115343379;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohKala (Fl";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"+BA.ObjectToString(_row.Get((Object)("fldGroupId")))+"','"+BA.ObjectToString(_row.Get((Object)("fldGroupName")))+"')");
RDebugUtils.currentLine=115343381;
 //BA.debugLineNum = 115343381;BA.debugLine="Log(\"fldGroupName:\"&Row.Get(\"fldGroupName\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5115343381","fldGroupName:"+BA.ObjectToString(_row.Get((Object)("fldGroupName"))),0);
 }else 
{RDebugUtils.currentLine=115343382;
 //BA.debugLineNum = 115343382;BA.debugLine="Else if CountRow>0 Then";
if (_countrow>0) { 
RDebugUtils.currentLine=115343393;
 //BA.debugLineNum = 115343393;BA.debugLine="MCode.SaveUpdate(\"Update TblGoroohKala Set FldN";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblGoroohKala Set FldN_Gorooh='"+BA.ObjectToString(_row.Get((Object)("fldGroupName")))+"'"+" where FldC_Gorooh="+BA.ObjectToString(_row.Get((Object)("fldGroupId"))));
 }}
;
 }
};
RDebugUtils.currentLine=115343401;
 //BA.debugLineNum = 115343401;BA.debugLine="Log(\"لیست گروه کالا بروزرسانی گردید:   \" & RowsL";
anywheresoftware.b4a.keywords.Common.LogImpl("5115343401","لیست گروه کالا بروزرسانی گردید:   "+BA.NumberToString(_rowslist.getSize()),0);
 } 
       catch (Exception e22) {
			processBA.setLastException(e22);RDebugUtils.currentLine=115343403;
 //BA.debugLineNum = 115343403;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5115343403",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=115343404;
 //BA.debugLineNum = 115343404;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetGoroohKalaFast");
 };
RDebugUtils.currentLine=115343406;
 //BA.debugLineNum = 115343406;BA.debugLine="GetCurrentDate";
_getcurrentdate();
RDebugUtils.currentLine=115343407;
 //BA.debugLineNum = 115343407;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgoroohkala(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetgoroohkala", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgoroohkala", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=115408896;
 //BA.debugLineNum = 115408896;BA.debugLine="Sub LoadGetGoroohKala(Str As String)";
RDebugUtils.currentLine=115408897;
 //BA.debugLineNum = 115408897;BA.debugLine="Try";
try {RDebugUtils.currentLine=115408898;
 //BA.debugLineNum = 115408898;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115408899;
 //BA.debugLineNum = 115408899;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115408900;
 //BA.debugLineNum = 115408900;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohKala\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGoroohKala");
RDebugUtils.currentLine=115408901;
 //BA.debugLineNum = 115408901;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=115408902;
 //BA.debugLineNum = 115408902;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=115408904;
 //BA.debugLineNum = 115408904;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=115408905;
 //BA.debugLineNum = 115408905;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=115408906;
 //BA.debugLineNum = 115408906;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohKala (Fld";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"+BA.ObjectToString(_row.Get((Object)("fldGroupId")))+"','"+BA.ObjectToString(_row.Get((Object)("fldGroupName")))+"')");
RDebugUtils.currentLine=115408908;
 //BA.debugLineNum = 115408908;BA.debugLine="Log(\"fldGroupName:\"&Row.Get(\"fldGroupName\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5115408908","fldGroupName:"+BA.ObjectToString(_row.Get((Object)("fldGroupName"))),0);
 }
};
RDebugUtils.currentLine=115408911;
 //BA.debugLineNum = 115408911;BA.debugLine="Log(\"گروه کالا بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5115408911","گروه کالا بروزرسانی گردید",0);
RDebugUtils.currentLine=115408912;
 //BA.debugLineNum = 115408912;BA.debugLine="ToastMessageShow(\"گروه کالا بروزرسانی گردید\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گروه کالا بروزرسانی گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=115408914;
 //BA.debugLineNum = 115408914;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5115408914",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=115408915;
 //BA.debugLineNum = 115408915;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetGoroohKala");
 };
RDebugUtils.currentLine=115408917;
 //BA.debugLineNum = 115408917;BA.debugLine="GetCurrentDate";
_getcurrentdate();
RDebugUtils.currentLine=115408918;
 //BA.debugLineNum = 115408918;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetashkhasfast(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetashkhasfast", false))
	 {return ((String) Debug.delegate(processBA, "loadgetashkhasfast", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crow = null;
int _countrow = 0;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.objects.collections.Map _fields = null;
anywheresoftware.b4a.objects.collections.Map _where = null;
RDebugUtils.currentLine=115539968;
 //BA.debugLineNum = 115539968;BA.debugLine="Sub LoadGetAshkhasFast(Str As String)";
RDebugUtils.currentLine=115539969;
 //BA.debugLineNum = 115539969;BA.debugLine="Try";
try {RDebugUtils.currentLine=115539970;
 //BA.debugLineNum = 115539970;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115539971;
 //BA.debugLineNum = 115539971;BA.debugLine="Dim crow As  Cursor";
_crow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=115539972;
 //BA.debugLineNum = 115539972;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=115539973;
 //BA.debugLineNum = 115539973;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115539974;
 //BA.debugLineNum = 115539974;BA.debugLine="Row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=115539975;
 //BA.debugLineNum = 115539975;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=115539976;
 //BA.debugLineNum = 115539976;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=115539978;
 //BA.debugLineNum = 115539978;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=115539979;
 //BA.debugLineNum = 115539979;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=115539980;
 //BA.debugLineNum = 115539980;BA.debugLine="Log(\"fldCodetafzili:\"& Row.Get(\"fldCodetafzili\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5115539980","fldCodetafzili:"+BA.ObjectToString(_row.Get((Object)("fldCodetafzili"))),0);
RDebugUtils.currentLine=115539981;
 //BA.debugLineNum = 115539981;BA.debugLine="crow=MCode.Result(\"select * from TblAshkhas wher";
_crow = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblAshkhas where fldCodetafzili="+BA.ObjectToString(_row.Get((Object)("fldCodetafzili"))));
RDebugUtils.currentLine=115539982;
 //BA.debugLineNum = 115539982;BA.debugLine="CountRow=crow.RowCount";
_countrow = _crow.getRowCount();
RDebugUtils.currentLine=115539983;
 //BA.debugLineNum = 115539983;BA.debugLine="If CountRow =0 Then";
if (_countrow==0) { 
RDebugUtils.currentLine=115539984;
 //BA.debugLineNum = 115539984;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblAshkhas\",Row";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblAshkhas",_rowslist);
RDebugUtils.currentLine=115539985;
 //BA.debugLineNum = 115539985;BA.debugLine="If myCode.Is_Null(Row.Get(\"fldCodeMovaghat\"))<";
if ((mostCurrent._mycode._is_null /*String*/ (processBA,BA.ObjectToString(_row.Get((Object)("fldCodeMovaghat"))))).equals("") == false) { 
RDebugUtils.currentLine=115539986;
 //BA.debugLineNum = 115539986;BA.debugLine="MCode.SaveUpdate(\"Delete from TblAshkhas wher";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete from TblAshkhas where fldCodetafzili= "+BA.ObjectToString(_row.Get((Object)("fldCodeMovaghat"))));
RDebugUtils.currentLine=115539987;
 //BA.debugLineNum = 115539987;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor set FldC_T";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblFaktor set FldC_Tafzili="+BA.ObjectToString(_row.Get((Object)("fldCodetafzili")))+" where FldC_Tafzili="+BA.ObjectToString(_row.Get((Object)("fldCodeMovaghat"))));
 };
RDebugUtils.currentLine=115539989;
 //BA.debugLineNum = 115539989;BA.debugLine="Log(\"fldCodetafzili:\"&Row.Get(\"fldCodetafzili\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5115539989","fldCodetafzili:"+BA.ObjectToString(_row.Get((Object)("fldCodetafzili"))),0);
 }else 
{RDebugUtils.currentLine=115539990;
 //BA.debugLineNum = 115539990;BA.debugLine="Else if CountRow>0 Then";
if (_countrow>0) { 
RDebugUtils.currentLine=115539993;
 //BA.debugLineNum = 115539993;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115539994;
 //BA.debugLineNum = 115539994;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115539996;
 //BA.debugLineNum = 115539996;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=115539997;
 //BA.debugLineNum = 115539997;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=115539998;
 //BA.debugLineNum = 115539998;BA.debugLine="Fields.Put(\"fldSharheTafzili\",Row.Get(\"fldSharh";
_fields.Put((Object)("fldSharheTafzili"),_row.Get((Object)("fldSharheTafzili")));
RDebugUtils.currentLine=115539999;
 //BA.debugLineNum = 115539999;BA.debugLine="Fields.Put(\"fldMande\",Row.Get(\"fldMande\"))";
_fields.Put((Object)("fldMande"),_row.Get((Object)("fldMande")));
RDebugUtils.currentLine=115540000;
 //BA.debugLineNum = 115540000;BA.debugLine="Fields.Put(\"fldVisitor\",Row.Get(\"fldVisitor\"))";
_fields.Put((Object)("fldVisitor"),_row.Get((Object)("fldVisitor")));
RDebugUtils.currentLine=115540001;
 //BA.debugLineNum = 115540001;BA.debugLine="Fields.Put(\"fldTell\",Row.Get(\"fldTell\"))";
_fields.Put((Object)("fldTell"),_row.Get((Object)("fldTell")));
RDebugUtils.currentLine=115540002;
 //BA.debugLineNum = 115540002;BA.debugLine="Fields.Put(\"fldAdress\",Row.Get(\"fldAdress\"))";
_fields.Put((Object)("fldAdress"),_row.Get((Object)("fldAdress")));
RDebugUtils.currentLine=115540003;
 //BA.debugLineNum = 115540003;BA.debugLine="Fields.Put(\"fldNameGroup\",Row.Get(\"fldNameGroup";
_fields.Put((Object)("fldNameGroup"),_row.Get((Object)("fldNameGroup")));
RDebugUtils.currentLine=115540004;
 //BA.debugLineNum = 115540004;BA.debugLine="Fields.Put(\"fldCodeGroup\",Row.Get(\"fldCodeGroup";
_fields.Put((Object)("fldCodeGroup"),_row.Get((Object)("fldCodeGroup")));
RDebugUtils.currentLine=115540005;
 //BA.debugLineNum = 115540005;BA.debugLine="Fields.Put(\"fldLat\",Row.Get(\"fldLat\"))";
_fields.Put((Object)("fldLat"),_row.Get((Object)("fldLat")));
RDebugUtils.currentLine=115540006;
 //BA.debugLineNum = 115540006;BA.debugLine="Fields.Put(\"fldLon\",Row.Get(\"fldLon\"))";
_fields.Put((Object)("fldLon"),_row.Get((Object)("fldLon")));
RDebugUtils.currentLine=115540007;
 //BA.debugLineNum = 115540007;BA.debugLine="If myCode.Is_Null(Row.Get(\"fldCodeMovaghat\"))<";
if ((mostCurrent._mycode._is_null /*String*/ (processBA,BA.ObjectToString(_row.Get((Object)("fldCodeMovaghat"))))).equals("") == false) { 
RDebugUtils.currentLine=115540008;
 //BA.debugLineNum = 115540008;BA.debugLine="Fields.Put(\"fldCodetafzili\",Row.Get(\"fldCodet";
_fields.Put((Object)("fldCodetafzili"),_row.Get((Object)("fldCodetafzili")));
RDebugUtils.currentLine=115540009;
 //BA.debugLineNum = 115540009;BA.debugLine="Fields.Put(\"fldCodeMovaghat\",Row.Get(\"fldCode";
_fields.Put((Object)("fldCodeMovaghat"),_row.Get((Object)("fldCodeMovaghat")));
RDebugUtils.currentLine=115540010;
 //BA.debugLineNum = 115540010;BA.debugLine="Log(\"fldCodetafzili:\"&Row.Get(\"fldCodetafzili";
anywheresoftware.b4a.keywords.Common.LogImpl("5115540010","fldCodetafzili:"+BA.ObjectToString(_row.Get((Object)("fldCodetafzili"))),0);
RDebugUtils.currentLine=115540011;
 //BA.debugLineNum = 115540011;BA.debugLine="Log(\"fldCodeMovaghat:\"&Row.Get(\"fldCodeMovagh";
anywheresoftware.b4a.keywords.Common.LogImpl("5115540011","fldCodeMovaghat:"+BA.ObjectToString(_row.Get((Object)("fldCodeMovaghat"))),0);
RDebugUtils.currentLine=115540012;
 //BA.debugLineNum = 115540012;BA.debugLine="Where.Put(\"fldCodetafzili\",Row.Get(\"fldCodeMo";
_where.Put((Object)("fldCodetafzili"),_row.Get((Object)("fldCodeMovaghat")));
RDebugUtils.currentLine=115540013;
 //BA.debugLineNum = 115540013;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor set FldC_T";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblFaktor set FldC_Tafzili="+BA.ObjectToString(_row.Get((Object)("fldCodetafzili")))+" where FldC_Tafzili="+BA.ObjectToString(_row.Get((Object)("fldCodeMovaghat"))));
 }else {
RDebugUtils.currentLine=115540015;
 //BA.debugLineNum = 115540015;BA.debugLine="Where.Put(\"fldCodetafzili\",Row.Get(\"fldCodeta";
_where.Put((Object)("fldCodetafzili"),_row.Get((Object)("fldCodetafzili")));
 };
RDebugUtils.currentLine=115540020;
 //BA.debugLineNum = 115540020;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblAshkhas\",F";
mostCurrent._dbutils._updaterecord2 /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblAshkhas",_fields,_where);
 }}
;
 }
};
RDebugUtils.currentLine=115540024;
 //BA.debugLineNum = 115540024;BA.debugLine="Log(\"لیست اشخاص بروزرسانی گردید:   \" & RowsList.";
anywheresoftware.b4a.keywords.Common.LogImpl("5115540024","لیست اشخاص بروزرسانی گردید:   "+BA.NumberToString(_rowslist.getSize()),0);
 } 
       catch (Exception e50) {
			processBA.setLastException(e50);RDebugUtils.currentLine=115540026;
 //BA.debugLineNum = 115540026;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5115540026",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=115540027;
 //BA.debugLineNum = 115540027;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetGoroohKala");
 };
RDebugUtils.currentLine=115540029;
 //BA.debugLineNum = 115540029;BA.debugLine="GetCurrentDate";
_getcurrentdate();
RDebugUtils.currentLine=115540030;
 //BA.debugLineNum = 115540030;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgallerykalafast(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetgallerykalafast", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgallerykalafast", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crow = null;
int _countrow = 0;
anywheresoftware.b4a.objects.collections.Map _fields = null;
anywheresoftware.b4a.objects.collections.Map _where = null;
RDebugUtils.currentLine=114950144;
 //BA.debugLineNum = 114950144;BA.debugLine="Sub LoadGetGalleryKalaFast(Str As String)";
RDebugUtils.currentLine=114950145;
 //BA.debugLineNum = 114950145;BA.debugLine="Try";
try {RDebugUtils.currentLine=114950146;
 //BA.debugLineNum = 114950146;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=114950147;
 //BA.debugLineNum = 114950147;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114950148;
 //BA.debugLineNum = 114950148;BA.debugLine="Dim crow As  Cursor";
_crow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=114950149;
 //BA.debugLineNum = 114950149;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=114950150;
 //BA.debugLineNum = 114950150;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGalleryPic\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGalleryPic");
RDebugUtils.currentLine=114950151;
 //BA.debugLineNum = 114950151;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=114950152;
 //BA.debugLineNum = 114950152;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=114950154;
 //BA.debugLineNum = 114950154;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=114950155;
 //BA.debugLineNum = 114950155;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=114950156;
 //BA.debugLineNum = 114950156;BA.debugLine="Log(\"fldCodeKala:\"& Row.Get(\"fldCodeKala\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5114950156","fldCodeKala:"+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))),0);
RDebugUtils.currentLine=114950158;
 //BA.debugLineNum = 114950158;BA.debugLine="crow=MCode.Result(\"select * from TblGalleryPic w";
_crow = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblGalleryPic where fldCodeKala='"+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))+"' and fldImageNumber='"+BA.ObjectToString(_row.Get((Object)("fldImageNumber")))+"'");
RDebugUtils.currentLine=114950159;
 //BA.debugLineNum = 114950159;BA.debugLine="CountRow=crow.RowCount";
_countrow = _crow.getRowCount();
RDebugUtils.currentLine=114950160;
 //BA.debugLineNum = 114950160;BA.debugLine="If CountRow =0 Then";
if (_countrow==0) { 
RDebugUtils.currentLine=114950161;
 //BA.debugLineNum = 114950161;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblGalleryPic\",R";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblGalleryPic",_rowslist);
 }else 
{RDebugUtils.currentLine=114950165;
 //BA.debugLineNum = 114950165;BA.debugLine="Else if CountRow>0 Then";
if (_countrow>0) { 
RDebugUtils.currentLine=114950176;
 //BA.debugLineNum = 114950176;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114950177;
 //BA.debugLineNum = 114950177;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114950179;
 //BA.debugLineNum = 114950179;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=114950180;
 //BA.debugLineNum = 114950180;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=114950181;
 //BA.debugLineNum = 114950181;BA.debugLine="Fields.Put(\"fldImage\",Row.Get(\"fldImage\"))";
_fields.Put((Object)("fldImage"),_row.Get((Object)("fldImage")));
RDebugUtils.currentLine=114950182;
 //BA.debugLineNum = 114950182;BA.debugLine="Fields.Put(\"fldShow\",Row.Get(\"fldShow\"))";
_fields.Put((Object)("fldShow"),_row.Get((Object)("fldShow")));
RDebugUtils.currentLine=114950183;
 //BA.debugLineNum = 114950183;BA.debugLine="Where.Put(\"fldCodeKala\",Row.Get(\"fldCodeKala\"))";
_where.Put((Object)("fldCodeKala"),_row.Get((Object)("fldCodeKala")));
RDebugUtils.currentLine=114950184;
 //BA.debugLineNum = 114950184;BA.debugLine="Where.Put(\"fldImageNumber\",Row.Get(\"fldImageNum";
_where.Put((Object)("fldImageNumber"),_row.Get((Object)("fldImageNumber")));
RDebugUtils.currentLine=114950186;
 //BA.debugLineNum = 114950186;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblGalleryPic";
mostCurrent._dbutils._updaterecord2 /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblGalleryPic",_fields,_where);
 }}
;
 }
};
RDebugUtils.currentLine=114950193;
 //BA.debugLineNum = 114950193;BA.debugLine="Log(\"گالری تصاویر بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5114950193","گالری تصاویر بروزرسانی گردید",0);
RDebugUtils.currentLine=114950194;
 //BA.debugLineNum = 114950194;BA.debugLine="ToastMessageShow(\"گالری تصاویر بروزرسانی گردید\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گالری تصاویر بروزرسانی گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e31) {
			processBA.setLastException(e31);RDebugUtils.currentLine=114950196;
 //BA.debugLineNum = 114950196;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114950196",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=114950197;
 //BA.debugLineNum = 114950197;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetGalleryKalaFast");
 };
RDebugUtils.currentLine=114950199;
 //BA.debugLineNum = 114950199;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetashkhas(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetashkhas", false))
	 {return ((String) Debug.delegate(processBA, "loadgetashkhas", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
int _m = 0;
int _d = 0;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=115605504;
 //BA.debugLineNum = 115605504;BA.debugLine="Sub LoadGetAshkhas(Str As String)";
RDebugUtils.currentLine=115605505;
 //BA.debugLineNum = 115605505;BA.debugLine="Try";
try {RDebugUtils.currentLine=115605506;
 //BA.debugLineNum = 115605506;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115605507;
 //BA.debugLineNum = 115605507;BA.debugLine="Dim m,d As Int=0";
_m = 0;
_d = (int) (0);
RDebugUtils.currentLine=115605508;
 //BA.debugLineNum = 115605508;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115605509;
 //BA.debugLineNum = 115605509;BA.debugLine="Row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=115605510;
 //BA.debugLineNum = 115605510;BA.debugLine="Dim Cu As  Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=115605511;
 //BA.debugLineNum = 115605511;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblAshkhasNew");
RDebugUtils.currentLine=115605512;
 //BA.debugLineNum = 115605512;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=115605513;
 //BA.debugLineNum = 115605513;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas where";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblAshkhas where length(FldCodeTafzili)<6");
 }else {
RDebugUtils.currentLine=115605515;
 //BA.debugLineNum = 115605515;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblAshkhas");
 };
RDebugUtils.currentLine=115605517;
 //BA.debugLineNum = 115605517;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=115605518;
 //BA.debugLineNum = 115605518;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=115605519;
 //BA.debugLineNum = 115605519;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblAshkhas\",RowsLi";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblAshkhas",_rowslist);
RDebugUtils.currentLine=115605520;
 //BA.debugLineNum = 115605520;BA.debugLine="Cu=MCode.Result(\"Select * From TblAshkhas\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblAshkhas");
RDebugUtils.currentLine=115605521;
 //BA.debugLineNum = 115605521;BA.debugLine="Log(\"لیست اشخاص بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5115605521","لیست اشخاص بروزرسانی گردید",0);
RDebugUtils.currentLine=115605522;
 //BA.debugLineNum = 115605522;BA.debugLine="ToastMessageShow(\"لیست اشخاص بروزرسانی گردید:";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست اشخاص بروزرسانی گردید:   "+BA.NumberToString(_cu.getRowCount())),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e20) {
			processBA.setLastException(e20);RDebugUtils.currentLine=115605524;
 //BA.debugLineNum = 115605524;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5115605524",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=115605525;
 //BA.debugLineNum = 115605525;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetAshkhas");
 };
RDebugUtils.currentLine=115605527;
 //BA.debugLineNum = 115605527;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgoroohashkhasfast(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetgoroohashkhasfast", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgoroohashkhasfast", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crow = null;
int _countrow = 0;
RDebugUtils.currentLine=115736576;
 //BA.debugLineNum = 115736576;BA.debugLine="Sub LoadGetGoroohAshkhasFast(Str As String)";
RDebugUtils.currentLine=115736577;
 //BA.debugLineNum = 115736577;BA.debugLine="Try";
try {RDebugUtils.currentLine=115736578;
 //BA.debugLineNum = 115736578;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115736579;
 //BA.debugLineNum = 115736579;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115736580;
 //BA.debugLineNum = 115736580;BA.debugLine="Dim crow As  Cursor";
_crow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=115736581;
 //BA.debugLineNum = 115736581;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=115736583;
 //BA.debugLineNum = 115736583;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=115736584;
 //BA.debugLineNum = 115736584;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=115736586;
 //BA.debugLineNum = 115736586;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=115736587;
 //BA.debugLineNum = 115736587;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=115736588;
 //BA.debugLineNum = 115736588;BA.debugLine="crow=MCode.Result(\"select * from TblGoroohAshkha";
_crow = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblGoroohAshkhas where FldC_Gorooh="+BA.ObjectToString(_row.Get((Object)("fldGroupId"))));
RDebugUtils.currentLine=115736589;
 //BA.debugLineNum = 115736589;BA.debugLine="CountRow=crow.RowCount";
_countrow = _crow.getRowCount();
RDebugUtils.currentLine=115736590;
 //BA.debugLineNum = 115736590;BA.debugLine="If CountRow =0 Then";
if (_countrow==0) { 
RDebugUtils.currentLine=115736591;
 //BA.debugLineNum = 115736591;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohAshkhas";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('"+BA.ObjectToString(_row.Get((Object)("fldGroupId")))+"','"+BA.ObjectToString(_row.Get((Object)("fldGroupName")))+"')");
RDebugUtils.currentLine=115736593;
 //BA.debugLineNum = 115736593;BA.debugLine="Log(Row.Get(\"fldGroupName\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5115736593",BA.ObjectToString(_row.Get((Object)("fldGroupName"))),0);
 }else 
{RDebugUtils.currentLine=115736594;
 //BA.debugLineNum = 115736594;BA.debugLine="Else If CountRow>0 Then";
if (_countrow>0) { 
RDebugUtils.currentLine=115736603;
 //BA.debugLineNum = 115736603;BA.debugLine="MCode.SaveUpdate(\"Update TblGoroohAshkhas Set F";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblGoroohAshkhas Set FldN_Gorooh='"+BA.ObjectToString(_row.Get((Object)("fldGroupName")))+"'"+" where FldC_Gorooh="+BA.ObjectToString(_row.Get((Object)("fldGroupId"))));
 }}
;
 }
};
RDebugUtils.currentLine=115736609;
 //BA.debugLineNum = 115736609;BA.debugLine="Log(\"لیست 'گروه اشخاص بروزرسانی گردید:   \" & Rows";
anywheresoftware.b4a.keywords.Common.LogImpl("5115736609","لیست 'گروه اشخاص بروزرسانی گردید:   "+BA.NumberToString(_rowslist.getSize()),0);
RDebugUtils.currentLine=115736610;
 //BA.debugLineNum = 115736610;BA.debugLine="Log(\"گروه اشخاص بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5115736610","گروه اشخاص بروزرسانی گردید",0);
 } 
       catch (Exception e22) {
			processBA.setLastException(e22);RDebugUtils.currentLine=115736612;
 //BA.debugLineNum = 115736612;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5115736612",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=115736613;
 //BA.debugLineNum = 115736613;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetGoroohAshkhasFast");
 };
RDebugUtils.currentLine=115736616;
 //BA.debugLineNum = 115736616;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgoroohashkhas(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetgoroohashkhas", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgoroohashkhas", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=115802112;
 //BA.debugLineNum = 115802112;BA.debugLine="Sub LoadGetGoroohAshkhas(Str As String)";
RDebugUtils.currentLine=115802113;
 //BA.debugLineNum = 115802113;BA.debugLine="Try";
try {RDebugUtils.currentLine=115802114;
 //BA.debugLineNum = 115802114;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115802115;
 //BA.debugLineNum = 115802115;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115802116;
 //BA.debugLineNum = 115802116;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohAshkhas\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGoroohAshkhas");
RDebugUtils.currentLine=115802117;
 //BA.debugLineNum = 115802117;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=115802118;
 //BA.debugLineNum = 115802118;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=115802120;
 //BA.debugLineNum = 115802120;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=115802121;
 //BA.debugLineNum = 115802121;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=115802122;
 //BA.debugLineNum = 115802122;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohAshkhas (";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('"+BA.ObjectToString(_row.Get((Object)("fldGroupId")))+"','"+BA.ObjectToString(_row.Get((Object)("fldGroupName")))+"')");
RDebugUtils.currentLine=115802124;
 //BA.debugLineNum = 115802124;BA.debugLine="Log(Row.Get(\"fldGroupName\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5115802124",BA.ObjectToString(_row.Get((Object)("fldGroupName"))),0);
 }
};
RDebugUtils.currentLine=115802126;
 //BA.debugLineNum = 115802126;BA.debugLine="Log(\"گروه اشخاص بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5115802126","گروه اشخاص بروزرسانی گردید",0);
RDebugUtils.currentLine=115802127;
 //BA.debugLineNum = 115802127;BA.debugLine="ToastMessageShow(\"گروه اشخاص بروزرسانی گردید\",Tr";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گروه اشخاص بروزرسانی گردید"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=115802129;
 //BA.debugLineNum = 115802129;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5115802129",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=115802130;
 //BA.debugLineNum = 115802130;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetGoroohAshkhas");
 };
RDebugUtils.currentLine=115802133;
 //BA.debugLineNum = 115802133;BA.debugLine="End Sub";
return "";
}
public static String  _loadgeteshantionfast(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgeteshantionfast", false))
	 {return ((String) Debug.delegate(processBA, "loadgeteshantionfast", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crow = null;
int _countrow = 0;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.objects.collections.Map _fields = null;
anywheresoftware.b4a.objects.collections.Map _where = null;
RDebugUtils.currentLine=115081216;
 //BA.debugLineNum = 115081216;BA.debugLine="Sub LoadGetEshantionFast(Str As String)";
RDebugUtils.currentLine=115081217;
 //BA.debugLineNum = 115081217;BA.debugLine="Try";
try {RDebugUtils.currentLine=115081218;
 //BA.debugLineNum = 115081218;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115081219;
 //BA.debugLineNum = 115081219;BA.debugLine="Dim crow As  Cursor";
_crow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=115081220;
 //BA.debugLineNum = 115081220;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=115081221;
 //BA.debugLineNum = 115081221;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115081222;
 //BA.debugLineNum = 115081222;BA.debugLine="Row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=115081223;
 //BA.debugLineNum = 115081223;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=115081224;
 //BA.debugLineNum = 115081224;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=115081226;
 //BA.debugLineNum = 115081226;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=115081227;
 //BA.debugLineNum = 115081227;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=115081228;
 //BA.debugLineNum = 115081228;BA.debugLine="Log(\"fldCodeKala:\"& Row.Get(\"fldCodeKala\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5115081228","fldCodeKala:"+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))),0);
RDebugUtils.currentLine=115081229;
 //BA.debugLineNum = 115081229;BA.debugLine="crow=MCode.Result(\"select * from tblEshantionVis";
_crow = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from tblEshantionVisitori where fldCodeKala="+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))));
RDebugUtils.currentLine=115081230;
 //BA.debugLineNum = 115081230;BA.debugLine="CountRow=crow.RowCount";
_countrow = _crow.getRowCount();
RDebugUtils.currentLine=115081231;
 //BA.debugLineNum = 115081231;BA.debugLine="If CountRow =0 Then";
if (_countrow==0) { 
RDebugUtils.currentLine=115081232;
 //BA.debugLineNum = 115081232;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblEshantionVisi";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"tblEshantionVisitori",_rowslist);
 }else 
{RDebugUtils.currentLine=115081234;
 //BA.debugLineNum = 115081234;BA.debugLine="Else if CountRow>0 Then";
if (_countrow>0) { 
RDebugUtils.currentLine=115081237;
 //BA.debugLineNum = 115081237;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115081238;
 //BA.debugLineNum = 115081238;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115081240;
 //BA.debugLineNum = 115081240;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=115081241;
 //BA.debugLineNum = 115081241;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=115081242;
 //BA.debugLineNum = 115081242;BA.debugLine="Fields.Put(\"fldCodeKala\",Row.Get(\"fldCodeKala\")";
_fields.Put((Object)("fldCodeKala"),_row.Get((Object)("fldCodeKala")));
RDebugUtils.currentLine=115081243;
 //BA.debugLineNum = 115081243;BA.debugLine="Fields.Put(\"fldTedadEshantion\",Row.Get(\"fldTeda";
_fields.Put((Object)("fldTedadEshantion"),_row.Get((Object)("fldTedadEshantion")));
RDebugUtils.currentLine=115081244;
 //BA.debugLineNum = 115081244;BA.debugLine="Fields.Put(\"fldCountForoosh\",Row.Get(\"fldCountF";
_fields.Put((Object)("fldCountForoosh"),_row.Get((Object)("fldCountForoosh")));
RDebugUtils.currentLine=115081245;
 //BA.debugLineNum = 115081245;BA.debugLine="Fields.Put(\"fldVaziat\",Row.Get(\"fldVaziat\"))";
_fields.Put((Object)("fldVaziat"),_row.Get((Object)("fldVaziat")));
RDebugUtils.currentLine=115081247;
 //BA.debugLineNum = 115081247;BA.debugLine="Where.Put(\"fldCodeKala\",Row.Get(\"fldCodeKala\"))";
_where.Put((Object)("fldCodeKala"),_row.Get((Object)("fldCodeKala")));
RDebugUtils.currentLine=115081249;
 //BA.debugLineNum = 115081249;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"tblEshantionV";
mostCurrent._dbutils._updaterecord2 /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"tblEshantionVisitori",_fields,_where);
 }}
;
 }
};
RDebugUtils.currentLine=115081253;
 //BA.debugLineNum = 115081253;BA.debugLine="Log(\"لیست اشانتیون بروزرسانی گردید:   \" & RowsLi";
anywheresoftware.b4a.keywords.Common.LogImpl("5115081253","لیست اشانتیون بروزرسانی گردید:   "+BA.NumberToString(_rowslist.getSize()),0);
 } 
       catch (Exception e31) {
			processBA.setLastException(e31);RDebugUtils.currentLine=115081255;
 //BA.debugLineNum = 115081255;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5115081255",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=115081256;
 //BA.debugLineNum = 115081256;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetEshantionFast");
 };
RDebugUtils.currentLine=115081258;
 //BA.debugLineNum = 115081258;BA.debugLine="GetCurrentDate";
_getcurrentdate();
RDebugUtils.currentLine=115081259;
 //BA.debugLineNum = 115081259;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetfee(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetfee", false))
	 {return ((String) Debug.delegate(processBA, "loadgetfee", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=116064256;
 //BA.debugLineNum = 116064256;BA.debugLine="Sub LoadGetFee(Str As String)";
RDebugUtils.currentLine=116064257;
 //BA.debugLineNum = 116064257;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116064258;
 //BA.debugLineNum = 116064258;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116064259;
 //BA.debugLineNum = 116064259;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFee\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblFee");
RDebugUtils.currentLine=116064260;
 //BA.debugLineNum = 116064260;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=116064261;
 //BA.debugLineNum = 116064261;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=116064263;
 //BA.debugLineNum = 116064263;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=116064264;
 //BA.debugLineNum = 116064264;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=116064265;
 //BA.debugLineNum = 116064265;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblFee (FldCodeKal";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblFee (FldCodeKala,FldCodeTasvie,FldFee) Values ('"+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))+"','"+BA.ObjectToString(_row.Get((Object)("fldCodeTasvie")))+"','"+BA.ObjectToString(_row.Get((Object)("fldFee")))+"')");
 }
};
RDebugUtils.currentLine=116064268;
 //BA.debugLineNum = 116064268;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgethavale(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetgethavale", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgethavale", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=116523008;
 //BA.debugLineNum = 116523008;BA.debugLine="Sub LoadGetGetHavale(Str As String)";
RDebugUtils.currentLine=116523009;
 //BA.debugLineNum = 116523009;BA.debugLine="Try";
try {RDebugUtils.currentLine=116523010;
 //BA.debugLineNum = 116523010;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116523011;
 //BA.debugLineNum = 116523011;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116523012;
 //BA.debugLineNum = 116523012;BA.debugLine="MCode.SaveUpdate(\"Delete From TblHavale\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblHavale");
RDebugUtils.currentLine=116523013;
 //BA.debugLineNum = 116523013;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=116523014;
 //BA.debugLineNum = 116523014;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=116523015;
 //BA.debugLineNum = 116523015;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblHavale\",RowsLi";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblHavale",_rowslist);
RDebugUtils.currentLine=116523016;
 //BA.debugLineNum = 116523016;BA.debugLine="Log(\"لیست حواله بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116523016","لیست حواله بروزرسانی گردید",0);
RDebugUtils.currentLine=116523017;
 //BA.debugLineNum = 116523017;BA.debugLine="CallSubDelayed(Act_HavaleTozie,\"LoadFilter\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_havaletozie.getObject()),"LoadFilter");
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=116523019;
 //BA.debugLineNum = 116523019;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116523019",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=116523020;
 //BA.debugLineNum = 116523020;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetVisitor");
 };
RDebugUtils.currentLine=116523023;
 //BA.debugLineNum = 116523023;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgethavalefast(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetgethavalefast", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgethavalefast", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crow = null;
int _countrow = 0;
RDebugUtils.currentLine=116588544;
 //BA.debugLineNum = 116588544;BA.debugLine="Sub LoadGetGetHavaleFast(Str As String)";
RDebugUtils.currentLine=116588545;
 //BA.debugLineNum = 116588545;BA.debugLine="Try";
try {RDebugUtils.currentLine=116588546;
 //BA.debugLineNum = 116588546;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116588547;
 //BA.debugLineNum = 116588547;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116588548;
 //BA.debugLineNum = 116588548;BA.debugLine="Dim crow As  Cursor";
_crow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=116588549;
 //BA.debugLineNum = 116588549;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=116588551;
 //BA.debugLineNum = 116588551;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=116588552;
 //BA.debugLineNum = 116588552;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=116588554;
 //BA.debugLineNum = 116588554;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=116588555;
 //BA.debugLineNum = 116588555;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=116588556;
 //BA.debugLineNum = 116588556;BA.debugLine="Log(\"fldShomareHavale:\"& Row.Get(\"fldShomareHav";
anywheresoftware.b4a.keywords.Common.LogImpl("5116588556","fldShomareHavale:"+BA.ObjectToString(_row.Get((Object)("fldShomareHavale"))),0);
RDebugUtils.currentLine=116588558;
 //BA.debugLineNum = 116588558;BA.debugLine="crow=MCode.Result(\"select * from TblHavale wher";
_crow = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblHavale where fldShomareHavale='"+BA.ObjectToString(_row.Get((Object)("fldShomareHavale")))+"'");
RDebugUtils.currentLine=116588559;
 //BA.debugLineNum = 116588559;BA.debugLine="CountRow=crow.RowCount";
_countrow = _crow.getRowCount();
RDebugUtils.currentLine=116588560;
 //BA.debugLineNum = 116588560;BA.debugLine="If CountRow =0 Then";
if (_countrow==0) { 
RDebugUtils.currentLine=116588561;
 //BA.debugLineNum = 116588561;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblHavale\",Rows";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblHavale",_rowslist);
 }else 
{RDebugUtils.currentLine=116588563;
 //BA.debugLineNum = 116588563;BA.debugLine="Else if CountRow>0 Then";
if (_countrow>0) { 
RDebugUtils.currentLine=116588574;
 //BA.debugLineNum = 116588574;BA.debugLine="MCode.SaveUpdate(\"Update TblHavale Set fldShom";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblHavale Set fldShomareHavale='"+BA.ObjectToString(_row.Get((Object)("fldShomareHavale")))+"'"+",fldDate='"+BA.ObjectToString(_row.Get((Object)("fldDate")))+"'"+",fldVaziat='"+BA.ObjectToString(_row.Get((Object)("fldVaziat")))+"'"+",fldMandeFactor='"+BA.ObjectToString(_row.Get((Object)("fldMandeFactor")))+"'"+",fldCountFactor='"+BA.ObjectToString(_row.Get((Object)("fldCountFactor")))+"'"+" where fldShomareHavale='"+BA.ObjectToString(_row.Get((Object)("fldShomareHavale")))+"'");
 }}
;
 }
};
RDebugUtils.currentLine=116588584;
 //BA.debugLineNum = 116588584;BA.debugLine="Log(\"حواله بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116588584","حواله بروزرسانی گردید",0);
 } 
       catch (Exception e21) {
			processBA.setLastException(e21);RDebugUtils.currentLine=116588595;
 //BA.debugLineNum = 116588595;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116588595",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=116588596;
 //BA.debugLineNum = 116588596;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetTasvieFast");
 };
RDebugUtils.currentLine=116588598;
 //BA.debugLineNum = 116588598;BA.debugLine="End Sub";
return "";
}
public static String  _showrizefactorforooshbyhavale() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "showrizefactorforooshbyhavale", false))
	 {return ((String) Debug.delegate(processBA, "showrizefactorforooshbyhavale", null));}
RDebugUtils.currentLine=116654080;
 //BA.debugLineNum = 116654080;BA.debugLine="Sub ShowRizeFactorForooshByHavale()";
RDebugUtils.currentLine=116654081;
 //BA.debugLineNum = 116654081;BA.debugLine="jobInternet.JobName =\"ShowRizFactorForooshByHaval";
_jobinternet._jobname /*String*/  = "ShowRizFactorForooshByHavale";
RDebugUtils.currentLine=116654082;
 //BA.debugLineNum = 116654082;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/ShowRizFactorForooshByHavale","Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=116654083;
 //BA.debugLineNum = 116654083;BA.debugLine="End Sub";
return "";
}
public static String  _loadshowrizefactorforooshbyhavale(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadshowrizefactorforooshbyhavale", false))
	 {return ((String) Debug.delegate(processBA, "loadshowrizefactorforooshbyhavale", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
RDebugUtils.currentLine=116719616;
 //BA.debugLineNum = 116719616;BA.debugLine="Sub LoadShowRizeFactorForooshByHavale(Str As Strin";
RDebugUtils.currentLine=116719617;
 //BA.debugLineNum = 116719617;BA.debugLine="Try";
try {RDebugUtils.currentLine=116719618;
 //BA.debugLineNum = 116719618;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116719619;
 //BA.debugLineNum = 116719619;BA.debugLine="MCode.SaveUpdate(\"Delete From TblRizFactorHavale";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblRizFactorHavale");
RDebugUtils.currentLine=116719620;
 //BA.debugLineNum = 116719620;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=116719621;
 //BA.debugLineNum = 116719621;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=116719622;
 //BA.debugLineNum = 116719622;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblRizFactorHaval";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblRizFactorHavale",_rowslist);
RDebugUtils.currentLine=116719623;
 //BA.debugLineNum = 116719623;BA.debugLine="Log(\"ریز فاکتور های حواله دریافت گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116719623","ریز فاکتور های حواله دریافت گردید",0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=116719628;
 //BA.debugLineNum = 116719628;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116719628",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=116719629;
 //BA.debugLineNum = 116719629;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadShowFactorForooshByHavale");
 };
RDebugUtils.currentLine=116719632;
 //BA.debugLineNum = 116719632;BA.debugLine="End Sub";
return "";
}
public static String  _loadgettasviefast(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgettasviefast", false))
	 {return ((String) Debug.delegate(processBA, "loadgettasviefast", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crow = null;
int _countrow = 0;
RDebugUtils.currentLine=116326400;
 //BA.debugLineNum = 116326400;BA.debugLine="Sub LoadGetTasvieFast(Str As String)";
RDebugUtils.currentLine=116326401;
 //BA.debugLineNum = 116326401;BA.debugLine="Try";
try {RDebugUtils.currentLine=116326402;
 //BA.debugLineNum = 116326402;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116326403;
 //BA.debugLineNum = 116326403;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116326404;
 //BA.debugLineNum = 116326404;BA.debugLine="Dim crow As  Cursor";
_crow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=116326405;
 //BA.debugLineNum = 116326405;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=116326407;
 //BA.debugLineNum = 116326407;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=116326408;
 //BA.debugLineNum = 116326408;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=116326410;
 //BA.debugLineNum = 116326410;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=116326411;
 //BA.debugLineNum = 116326411;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=116326412;
 //BA.debugLineNum = 116326412;BA.debugLine="Log(\"FldCode:\"& Row.Get(\"fldCode\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5116326412","FldCode:"+BA.ObjectToString(_row.Get((Object)("fldCode"))),0);
RDebugUtils.currentLine=116326414;
 //BA.debugLineNum = 116326414;BA.debugLine="crow=MCode.Result(\"select * from TblTasvie where";
_crow = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblTasvie where FldCode='"+BA.ObjectToString(_row.Get((Object)("fldCode")))+"'");
RDebugUtils.currentLine=116326415;
 //BA.debugLineNum = 116326415;BA.debugLine="CountRow=crow.RowCount";
_countrow = _crow.getRowCount();
RDebugUtils.currentLine=116326416;
 //BA.debugLineNum = 116326416;BA.debugLine="If CountRow =0 Then";
if (_countrow==0) { 
RDebugUtils.currentLine=116326417;
 //BA.debugLineNum = 116326417;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblTasvie (FldCod";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblTasvie (FldCode,FldName) Values ('"+BA.ObjectToString(_row.Get((Object)("fldCode")))+"','"+BA.ObjectToString(_row.Get((Object)("fldName")))+"'");
 }else 
{RDebugUtils.currentLine=116326420;
 //BA.debugLineNum = 116326420;BA.debugLine="Else if CountRow>0 Then";
if (_countrow>0) { 
RDebugUtils.currentLine=116326431;
 //BA.debugLineNum = 116326431;BA.debugLine="MCode.SaveUpdate(\"Update TblTasvie Set FldName=";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblTasvie Set FldName='"+BA.ObjectToString(_row.Get((Object)("fldName")))+"'"+" where FldCode='"+BA.ObjectToString(_row.Get((Object)("fldCode")))+"'");
 }}
;
 }
};
RDebugUtils.currentLine=116326437;
 //BA.debugLineNum = 116326437;BA.debugLine="Log(\"تسویه بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116326437","تسویه بروزرسانی گردید",0);
RDebugUtils.currentLine=116326438;
 //BA.debugLineNum = 116326438;BA.debugLine="Select MCode.page";
switch (BA.switchObjectToInt(mostCurrent._mcode._page /*String*/ ,"KalaDefault","Kala_listi","SabtMarjooii","Search")) {
case 0: {
RDebugUtils.currentLine=116326441;
 //BA.debugLineNum = 116326441;BA.debugLine="CallSubDelayed(Act_KalaDefault,\"LoadAcSpNoeTas";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_kaladefault.getObject()),"LoadAcSpNoeTasvie");
 break; }
case 1: {
RDebugUtils.currentLine=116326443;
 //BA.debugLineNum = 116326443;BA.debugLine="CallSubDelayed(Act_Kala_listi,\"LoadAcSpNoeTasv";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_kala_listi.getObject()),"LoadAcSpNoeTasvie");
 break; }
case 2: {
RDebugUtils.currentLine=116326445;
 //BA.debugLineNum = 116326445;BA.debugLine="CallSubDelayed(Act_KalaDefault,\"LoadAcSpNoeTas";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_kaladefault.getObject()),"LoadAcSpNoeTasvie");
 break; }
case 3: {
RDebugUtils.currentLine=116326447;
 //BA.debugLineNum = 116326447;BA.debugLine="CallSubDelayed(Act_Search,\"LoadAcSpNoeTasvie\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_search.getObject()),"LoadAcSpNoeTasvie");
 break; }
}
;
 } 
       catch (Exception e31) {
			processBA.setLastException(e31);RDebugUtils.currentLine=116326450;
 //BA.debugLineNum = 116326450;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116326450",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=116326451;
 //BA.debugLineNum = 116326451;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetTasvieFast");
 };
RDebugUtils.currentLine=116326454;
 //BA.debugLineNum = 116326454;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetreportrizepishfactor3fast(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetreportrizepishfactor3fast", false))
	 {return ((String) Debug.delegate(processBA, "loadgetreportrizepishfactor3fast", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crow = null;
int _countrow = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=116916224;
 //BA.debugLineNum = 116916224;BA.debugLine="Sub LoadGetReportRizePishFactor3Fast(Str As String";
RDebugUtils.currentLine=116916225;
 //BA.debugLineNum = 116916225;BA.debugLine="Try";
try {RDebugUtils.currentLine=116916226;
 //BA.debugLineNum = 116916226;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116916227;
 //BA.debugLineNum = 116916227;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116916228;
 //BA.debugLineNum = 116916228;BA.debugLine="Dim crow As  Cursor";
_crow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=116916229;
 //BA.debugLineNum = 116916229;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=116916231;
 //BA.debugLineNum = 116916231;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=116916232;
 //BA.debugLineNum = 116916232;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=116916233;
 //BA.debugLineNum = 116916233;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116916234;
 //BA.debugLineNum = 116916234;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=116916235;
 //BA.debugLineNum = 116916235;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=116916236;
 //BA.debugLineNum = 116916236;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=116916237;
 //BA.debugLineNum = 116916237;BA.debugLine="Log(\"FldShomareFaktor:\"& Row.Get(\"fldShomareFac";
anywheresoftware.b4a.keywords.Common.LogImpl("5116916237","FldShomareFaktor:"+BA.ObjectToString(_row.Get((Object)("fldShomareFactor"))),0);
RDebugUtils.currentLine=116916239;
 //BA.debugLineNum = 116916239;BA.debugLine="crow=MCode.Result(\"select * from TblFaktor wher";
_crow = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblFaktor where FldShomareFaktor='"+BA.ObjectToString(_row.Get((Object)("fldShomareFactor")))+"'");
RDebugUtils.currentLine=116916240;
 //BA.debugLineNum = 116916240;BA.debugLine="CountRow=crow.RowCount";
_countrow = _crow.getRowCount();
RDebugUtils.currentLine=116916241;
 //BA.debugLineNum = 116916241;BA.debugLine="If CountRow =0 Then";
if (_countrow==0) { 
RDebugUtils.currentLine=116916242;
 //BA.debugLineNum = 116916242;BA.debugLine="If Row.Get(\"fldTedadJoz\")>0 Or Row.Get(\"fldTed";
if ((double)(BA.ObjectToNumber(_row.Get((Object)("fldTedadJoz"))))>0 || (double)(BA.ObjectToNumber(_row.Get((Object)("fldTedadCarton"))))>0) { 
RDebugUtils.currentLine=116916246;
 //BA.debugLineNum = 116916246;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116916247;
 //BA.debugLineNum = 116916247;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=116916248;
 //BA.debugLineNum = 116916248;BA.debugLine="m.Put(\"FldRadif\",Row.Get(\"fldRadif\"))";
_m.Put((Object)("FldRadif"),_row.Get((Object)("fldRadif")));
RDebugUtils.currentLine=116916249;
 //BA.debugLineNum = 116916249;BA.debugLine="m.Put(\"FldC_Visitor\",Row.Get(\"fldCodeVasete\")";
_m.Put((Object)("FldC_Visitor"),_row.Get((Object)("fldCodeVasete")));
RDebugUtils.currentLine=116916250;
 //BA.debugLineNum = 116916250;BA.debugLine="m.Put(\"FldC_Tafzili\",Row.Get(\"fldCodeTafsili\"";
_m.Put((Object)("FldC_Tafzili"),_row.Get((Object)("fldCodeTafsili")));
RDebugUtils.currentLine=116916251;
 //BA.debugLineNum = 116916251;BA.debugLine="m.Put(\"FldN_Tafzili\",Row.Get(\"fldSharheTafzil";
_m.Put((Object)("FldN_Tafzili"),_row.Get((Object)("fldSharheTafzili")));
RDebugUtils.currentLine=116916252;
 //BA.debugLineNum = 116916252;BA.debugLine="m.Put(\"FldShomareFaktor\",Row.Get(\"fldShomareF";
_m.Put((Object)("FldShomareFaktor"),_row.Get((Object)("fldShomareFactor")));
RDebugUtils.currentLine=116916253;
 //BA.debugLineNum = 116916253;BA.debugLine="m.Put(\"FldShomareBargasht\",Row.Get(\"fldShomar";
_m.Put((Object)("FldShomareBargasht"),_row.Get((Object)("fldShomareBargasht")));
RDebugUtils.currentLine=116916254;
 //BA.debugLineNum = 116916254;BA.debugLine="m.Put(\"FldCodeKala\",Row.Get(\"fldCodeKala\"))";
_m.Put((Object)("FldCodeKala"),_row.Get((Object)("fldCodeKala")));
RDebugUtils.currentLine=116916255;
 //BA.debugLineNum = 116916255;BA.debugLine="m.Put(\"FldNameKala\",Row.Get(\"fldSharhKala\"))";
_m.Put((Object)("FldNameKala"),_row.Get((Object)("fldSharhKala")));
RDebugUtils.currentLine=116916256;
 //BA.debugLineNum = 116916256;BA.debugLine="m.Put(\"FldFeeForoosh\",Row.Get(\"fldFeeJoz\"))";
_m.Put((Object)("FldFeeForoosh"),_row.Get((Object)("fldFeeJoz")));
RDebugUtils.currentLine=116916257;
 //BA.debugLineNum = 116916257;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Row.Get(\"fldMablag";
_m.Put((Object)("fldFeeBadAzTakhfif"),_row.Get((Object)("fldMablaghTakhfif")));
RDebugUtils.currentLine=116916258;
 //BA.debugLineNum = 116916258;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Row.Get(\"fldMablagh";
_m.Put((Object)("FldMablaghTakhfif"),_row.Get((Object)("fldMablaghTakhfif")));
RDebugUtils.currentLine=116916259;
 //BA.debugLineNum = 116916259;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Row.Get(\"fldTedad";
_m.Put((Object)("FldTedadDarSabadJoz"),_row.Get((Object)("fldTedadJoz")));
RDebugUtils.currentLine=116916260;
 //BA.debugLineNum = 116916260;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Row.Get(\"fldTedad";
_m.Put((Object)("FldTedadDarSabadKol"),_row.Get((Object)("fldTedadCarton")));
RDebugUtils.currentLine=116916261;
 //BA.debugLineNum = 116916261;BA.debugLine="m.Put(\"FldTedadDarkarton\",Row.Get(\"FldTedadDa";
_m.Put((Object)("FldTedadDarkarton"),_row.Get((Object)("FldTedadDarKarton")));
RDebugUtils.currentLine=116916262;
 //BA.debugLineNum = 116916262;BA.debugLine="m.Put(\"FldTotalFaktor\",Row.Get(\"FldTotalFakto";
_m.Put((Object)("FldTotalFaktor"),_row.Get((Object)("FldTotalFaktor")));
RDebugUtils.currentLine=116916263;
 //BA.debugLineNum = 116916263;BA.debugLine="m.Put(\"FldTozihat\",Row.Get(\"fldTozihatRecord\"";
_m.Put((Object)("FldTozihat"),_row.Get((Object)("fldTozihatRecord")));
RDebugUtils.currentLine=116916264;
 //BA.debugLineNum = 116916264;BA.debugLine="m.Put(\"FldTozih\",Row.Get(\"FldTozihat\"))";
_m.Put((Object)("FldTozih"),_row.Get((Object)("FldTozihat")));
RDebugUtils.currentLine=116916265;
 //BA.debugLineNum = 116916265;BA.debugLine="m.Put(\"FldVaziatPardakht\",Row.Get(\"fldNahveTa";
_m.Put((Object)("FldVaziatPardakht"),_row.Get((Object)("fldNahveTasvie")));
RDebugUtils.currentLine=116916266;
 //BA.debugLineNum = 116916266;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",Row.Get(\"FldMabl";
_m.Put((Object)("FldMablaghTakhfifKol"),_row.Get((Object)("FldMablaghTakhfifKol")));
RDebugUtils.currentLine=116916267;
 //BA.debugLineNum = 116916267;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",Row.Get(\"Fl";
_m.Put((Object)("FldSumMablaghTakhfifVizhe"),_row.Get((Object)("FldSumMablaghTakhfifVizhe")));
RDebugUtils.currentLine=116916268;
 //BA.debugLineNum = 116916268;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",Row.Get(\"Fld";
_m.Put((Object)("FldSumMablaghTakhfifKala"),_row.Get((Object)("FldSumMablaghTakhfifKala")));
RDebugUtils.currentLine=116916269;
 //BA.debugLineNum = 116916269;BA.debugLine="m.Put(\"FldMablaghKol\",Row.Get(\"FldTotalFaktor";
_m.Put((Object)("FldMablaghKol"),_row.Get((Object)("FldTotalFaktor")));
RDebugUtils.currentLine=116916270;
 //BA.debugLineNum = 116916270;BA.debugLine="m.Put(\"FldDate\",Row.Get(\"fldDate\"))";
_m.Put((Object)("FldDate"),_row.Get((Object)("fldDate")));
RDebugUtils.currentLine=116916271;
 //BA.debugLineNum = 116916271;BA.debugLine="m.Put(\"FldTime\",Row.Get(\"fldTime\"))";
_m.Put((Object)("FldTime"),_row.Get((Object)("fldTime")));
RDebugUtils.currentLine=116916272;
 //BA.debugLineNum = 116916272;BA.debugLine="m.Put(\"FldSignatureBitmapString\",Row.Get(\"Fld";
_m.Put((Object)("FldSignatureBitmapString"),_row.Get((Object)("FldSignatureBitmapString")));
RDebugUtils.currentLine=116916273;
 //BA.debugLineNum = 116916273;BA.debugLine="m.Put(\"FldSync\",\"True\")";
_m.Put((Object)("FldSync"),(Object)("True"));
RDebugUtils.currentLine=116916274;
 //BA.debugLineNum = 116916274;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
_m.Put((Object)("WIsBacked"),(Object)("False"));
RDebugUtils.currentLine=116916275;
 //BA.debugLineNum = 116916275;BA.debugLine="m.Put(\"FldType\",\"Foroosh\")";
_m.Put((Object)("FldType"),(Object)("Foroosh"));
RDebugUtils.currentLine=116916276;
 //BA.debugLineNum = 116916276;BA.debugLine="m.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
_m.Put((Object)("FldAmani"),_row.Get((Object)("FldAmani")));
RDebugUtils.currentLine=116916277;
 //BA.debugLineNum = 116916277;BA.debugLine="m.Put(\"fldShomareForoosh\",Row.Get(\"fldShomare";
_m.Put((Object)("fldShomareForoosh"),_row.Get((Object)("fldShomareForoosh")));
RDebugUtils.currentLine=116916278;
 //BA.debugLineNum = 116916278;BA.debugLine="m.Put(\"WSendFrom\",3)";
_m.Put((Object)("WSendFrom"),(Object)(3));
RDebugUtils.currentLine=116916279;
 //BA.debugLineNum = 116916279;BA.debugLine="lst.Add(m)";
_lst.Add((Object)(_m.getObject()));
 };
 }else 
{RDebugUtils.currentLine=116916284;
 //BA.debugLineNum = 116916284;BA.debugLine="Else if CountRow>0 Then";
if (_countrow>0) { 
RDebugUtils.currentLine=116916287;
 //BA.debugLineNum = 116916287;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor where";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblFaktor where FldShomareFaktor="+BA.ObjectToString(_row.Get((Object)("fldShomareFactor"))));
RDebugUtils.currentLine=116916290;
 //BA.debugLineNum = 116916290;BA.debugLine="If Row.Get(\"fldTedadJoz\")>0 Or Row.Get(\"fldTed";
if ((double)(BA.ObjectToNumber(_row.Get((Object)("fldTedadJoz"))))>0 || (double)(BA.ObjectToNumber(_row.Get((Object)("fldTedadCarton"))))>0) { 
RDebugUtils.currentLine=116916294;
 //BA.debugLineNum = 116916294;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116916295;
 //BA.debugLineNum = 116916295;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=116916296;
 //BA.debugLineNum = 116916296;BA.debugLine="m.Put(\"FldRadif\",Row.Get(\"fldRadif\"))";
_m.Put((Object)("FldRadif"),_row.Get((Object)("fldRadif")));
RDebugUtils.currentLine=116916297;
 //BA.debugLineNum = 116916297;BA.debugLine="m.Put(\"FldC_Visitor\",Row.Get(\"fldCodeVasete\")";
_m.Put((Object)("FldC_Visitor"),_row.Get((Object)("fldCodeVasete")));
RDebugUtils.currentLine=116916298;
 //BA.debugLineNum = 116916298;BA.debugLine="m.Put(\"FldC_Tafzili\",Row.Get(\"fldCodeTafsili\"";
_m.Put((Object)("FldC_Tafzili"),_row.Get((Object)("fldCodeTafsili")));
RDebugUtils.currentLine=116916299;
 //BA.debugLineNum = 116916299;BA.debugLine="m.Put(\"FldN_Tafzili\",Row.Get(\"fldSharheTafzil";
_m.Put((Object)("FldN_Tafzili"),_row.Get((Object)("fldSharheTafzili")));
RDebugUtils.currentLine=116916300;
 //BA.debugLineNum = 116916300;BA.debugLine="m.Put(\"FldShomareFaktor\",Row.Get(\"fldShomareF";
_m.Put((Object)("FldShomareFaktor"),_row.Get((Object)("fldShomareFactor")));
RDebugUtils.currentLine=116916301;
 //BA.debugLineNum = 116916301;BA.debugLine="m.Put(\"FldShomareBargasht\",Row.Get(\"fldShomar";
_m.Put((Object)("FldShomareBargasht"),_row.Get((Object)("fldShomareBargasht")));
RDebugUtils.currentLine=116916302;
 //BA.debugLineNum = 116916302;BA.debugLine="m.Put(\"FldCodeKala\",Row.Get(\"fldCodeKala\"))";
_m.Put((Object)("FldCodeKala"),_row.Get((Object)("fldCodeKala")));
RDebugUtils.currentLine=116916303;
 //BA.debugLineNum = 116916303;BA.debugLine="m.Put(\"FldNameKala\",Row.Get(\"fldSharhKala\"))";
_m.Put((Object)("FldNameKala"),_row.Get((Object)("fldSharhKala")));
RDebugUtils.currentLine=116916304;
 //BA.debugLineNum = 116916304;BA.debugLine="m.Put(\"FldFeeForoosh\",Row.Get(\"fldFeeJoz\"))";
_m.Put((Object)("FldFeeForoosh"),_row.Get((Object)("fldFeeJoz")));
RDebugUtils.currentLine=116916305;
 //BA.debugLineNum = 116916305;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Row.Get(\"fldMablag";
_m.Put((Object)("fldFeeBadAzTakhfif"),_row.Get((Object)("fldMablaghTakhfif")));
RDebugUtils.currentLine=116916306;
 //BA.debugLineNum = 116916306;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Row.Get(\"fldMablagh";
_m.Put((Object)("FldMablaghTakhfif"),_row.Get((Object)("fldMablaghTakhfif")));
RDebugUtils.currentLine=116916307;
 //BA.debugLineNum = 116916307;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Row.Get(\"fldTedad";
_m.Put((Object)("FldTedadDarSabadJoz"),_row.Get((Object)("fldTedadJoz")));
RDebugUtils.currentLine=116916308;
 //BA.debugLineNum = 116916308;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Row.Get(\"fldTedad";
_m.Put((Object)("FldTedadDarSabadKol"),_row.Get((Object)("fldTedadCarton")));
RDebugUtils.currentLine=116916309;
 //BA.debugLineNum = 116916309;BA.debugLine="m.Put(\"FldTedadDarkarton\",Row.Get(\"FldTedadDa";
_m.Put((Object)("FldTedadDarkarton"),_row.Get((Object)("FldTedadDarKarton")));
RDebugUtils.currentLine=116916310;
 //BA.debugLineNum = 116916310;BA.debugLine="m.Put(\"FldTotalFaktor\",Row.Get(\"FldTotalFakto";
_m.Put((Object)("FldTotalFaktor"),_row.Get((Object)("FldTotalFaktor")));
RDebugUtils.currentLine=116916311;
 //BA.debugLineNum = 116916311;BA.debugLine="m.Put(\"FldTozihat\",Row.Get(\"fldTozihatRecord\"";
_m.Put((Object)("FldTozihat"),_row.Get((Object)("fldTozihatRecord")));
RDebugUtils.currentLine=116916312;
 //BA.debugLineNum = 116916312;BA.debugLine="m.Put(\"FldTozih\",Row.Get(\"FldTozihat\"))";
_m.Put((Object)("FldTozih"),_row.Get((Object)("FldTozihat")));
RDebugUtils.currentLine=116916313;
 //BA.debugLineNum = 116916313;BA.debugLine="m.Put(\"FldVaziatPardakht\",Row.Get(\"fldNahveTa";
_m.Put((Object)("FldVaziatPardakht"),_row.Get((Object)("fldNahveTasvie")));
RDebugUtils.currentLine=116916314;
 //BA.debugLineNum = 116916314;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",Row.Get(\"FldMabl";
_m.Put((Object)("FldMablaghTakhfifKol"),_row.Get((Object)("FldMablaghTakhfifKol")));
RDebugUtils.currentLine=116916315;
 //BA.debugLineNum = 116916315;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",Row.Get(\"Fl";
_m.Put((Object)("FldSumMablaghTakhfifVizhe"),_row.Get((Object)("FldSumMablaghTakhfifVizhe")));
RDebugUtils.currentLine=116916316;
 //BA.debugLineNum = 116916316;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",Row.Get(\"Fld";
_m.Put((Object)("FldSumMablaghTakhfifKala"),_row.Get((Object)("FldSumMablaghTakhfifKala")));
RDebugUtils.currentLine=116916317;
 //BA.debugLineNum = 116916317;BA.debugLine="m.Put(\"FldMablaghKol\",Row.Get(\"FldTotalFaktor";
_m.Put((Object)("FldMablaghKol"),_row.Get((Object)("FldTotalFaktor")));
RDebugUtils.currentLine=116916318;
 //BA.debugLineNum = 116916318;BA.debugLine="m.Put(\"FldDate\",Row.Get(\"fldDate\"))";
_m.Put((Object)("FldDate"),_row.Get((Object)("fldDate")));
RDebugUtils.currentLine=116916319;
 //BA.debugLineNum = 116916319;BA.debugLine="m.Put(\"FldTime\",Row.Get(\"fldTime\"))";
_m.Put((Object)("FldTime"),_row.Get((Object)("fldTime")));
RDebugUtils.currentLine=116916320;
 //BA.debugLineNum = 116916320;BA.debugLine="m.Put(\"FldSignatureBitmapString\",Row.Get(\"Fld";
_m.Put((Object)("FldSignatureBitmapString"),_row.Get((Object)("FldSignatureBitmapString")));
RDebugUtils.currentLine=116916321;
 //BA.debugLineNum = 116916321;BA.debugLine="m.Put(\"FldSync\",\"True\")";
_m.Put((Object)("FldSync"),(Object)("True"));
RDebugUtils.currentLine=116916322;
 //BA.debugLineNum = 116916322;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
_m.Put((Object)("WIsBacked"),(Object)("False"));
RDebugUtils.currentLine=116916323;
 //BA.debugLineNum = 116916323;BA.debugLine="m.Put(\"FldType\",\"Foroosh\")";
_m.Put((Object)("FldType"),(Object)("Foroosh"));
RDebugUtils.currentLine=116916324;
 //BA.debugLineNum = 116916324;BA.debugLine="m.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
_m.Put((Object)("FldAmani"),_row.Get((Object)("FldAmani")));
RDebugUtils.currentLine=116916325;
 //BA.debugLineNum = 116916325;BA.debugLine="m.Put(\"fldShomareForoosh\",Row.Get(\"fldShomare";
_m.Put((Object)("fldShomareForoosh"),_row.Get((Object)("fldShomareForoosh")));
RDebugUtils.currentLine=116916326;
 //BA.debugLineNum = 116916326;BA.debugLine="m.Put(\"WSendFrom\",3)";
_m.Put((Object)("WSendFrom"),(Object)(3));
RDebugUtils.currentLine=116916327;
 //BA.debugLineNum = 116916327;BA.debugLine="lst.Add(m)";
_lst.Add((Object)(_m.getObject()));
 };
 }}
;
 }
};
RDebugUtils.currentLine=116916335;
 //BA.debugLineNum = 116916335;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFaktor\",lst)";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblFaktor",_lst);
RDebugUtils.currentLine=116916336;
 //BA.debugLineNum = 116916336;BA.debugLine="Log(\"لیست سفارشات بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116916336","لیست سفارشات بروزرسانی گردید",0);
 } 
       catch (Exception e95) {
			processBA.setLastException(e95);RDebugUtils.currentLine=116916338;
 //BA.debugLineNum = 116916338;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116916338",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=116916339;
 //BA.debugLineNum = 116916339;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetTasvieFast");
 };
RDebugUtils.currentLine=116916341;
 //BA.debugLineNum = 116916341;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetlistdelete(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetlistdelete", false))
	 {return ((String) Debug.delegate(processBA, "loadgetlistdelete", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _countrow = 0;
String _query = "";
RDebugUtils.currentLine=114425856;
 //BA.debugLineNum = 114425856;BA.debugLine="Sub LoadGetListDelete(Str As String)";
RDebugUtils.currentLine=114425857;
 //BA.debugLineNum = 114425857;BA.debugLine="Try";
try {RDebugUtils.currentLine=114425858;
 //BA.debugLineNum = 114425858;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=114425859;
 //BA.debugLineNum = 114425859;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114425860;
 //BA.debugLineNum = 114425860;BA.debugLine="Dim Cu As  Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=114425861;
 //BA.debugLineNum = 114425861;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=114425862;
 //BA.debugLineNum = 114425862;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=114425863;
 //BA.debugLineNum = 114425863;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=114425865;
 //BA.debugLineNum = 114425865;BA.debugLine="Select TypeDelete";
switch (BA.switchObjectToInt(_typedelete,"kala","ashkhas","GroupKala","GalleryPic","GroupAshkhas","deleteall")) {
case 0: {
RDebugUtils.currentLine=114425867;
 //BA.debugLineNum = 114425867;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=114425868;
 //BA.debugLineNum = 114425868;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=114425869;
 //BA.debugLineNum = 114425869;BA.debugLine="Log(\"deleted fldCodeKala:\"& Row.Get(\"fldCode\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425869","deleted fldCodeKala:"+BA.ObjectToString(_row.Get((Object)("fldCode"))),0);
RDebugUtils.currentLine=114425870;
 //BA.debugLineNum = 114425870;BA.debugLine="Cu=MCode.Result(\"select * from TblKala where f";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblKala where fldCodeKala="+BA.ObjectToString(_row.Get((Object)("fldCode"))));
RDebugUtils.currentLine=114425871;
 //BA.debugLineNum = 114425871;BA.debugLine="CountRow=Cu.RowCount";
_countrow = _cu.getRowCount();
RDebugUtils.currentLine=114425872;
 //BA.debugLineNum = 114425872;BA.debugLine="Log(CountRow)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425872",BA.NumberToString(_countrow),0);
RDebugUtils.currentLine=114425873;
 //BA.debugLineNum = 114425873;BA.debugLine="Dim Query As String=\"Delete From TblKala where";
_query = "Delete From TblKala where fldCodeKala= "+BA.ObjectToString(_row.Get((Object)("fldCode")));
RDebugUtils.currentLine=114425874;
 //BA.debugLineNum = 114425874;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (processBA,_query);
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=114425877;
 //BA.debugLineNum = 114425877;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step20 = 1;
final int limit20 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=114425878;
 //BA.debugLineNum = 114425878;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=114425879;
 //BA.debugLineNum = 114425879;BA.debugLine="Log(\"deleted fldCodetafzili:\"& Row.Get(\"fldCod";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425879","deleted fldCodetafzili:"+BA.ObjectToString(_row.Get((Object)("fldCode"))),0);
RDebugUtils.currentLine=114425880;
 //BA.debugLineNum = 114425880;BA.debugLine="Cu=MCode.Result(\"select * from TblAshkhas wher";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblAshkhas where fldCodetafzili="+BA.ObjectToString(_row.Get((Object)("fldCode"))));
RDebugUtils.currentLine=114425881;
 //BA.debugLineNum = 114425881;BA.debugLine="CountRow=Cu.RowCount";
_countrow = _cu.getRowCount();
RDebugUtils.currentLine=114425882;
 //BA.debugLineNum = 114425882;BA.debugLine="Log(CountRow)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425882",BA.NumberToString(_countrow),0);
RDebugUtils.currentLine=114425883;
 //BA.debugLineNum = 114425883;BA.debugLine="Dim Query As String=\"Delete From TblAshkhas wh";
_query = "Delete From TblAshkhas where fldCodetafzili= "+BA.ObjectToString(_row.Get((Object)("fldCode")));
RDebugUtils.currentLine=114425884;
 //BA.debugLineNum = 114425884;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (processBA,_query);
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=114425887;
 //BA.debugLineNum = 114425887;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step30 = 1;
final int limit30 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit30 ;_i = _i + step30 ) {
RDebugUtils.currentLine=114425888;
 //BA.debugLineNum = 114425888;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=114425889;
 //BA.debugLineNum = 114425889;BA.debugLine="Log(\"deleted fldGroupId:\"& Row.Get(\"fldCode\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425889","deleted fldGroupId:"+BA.ObjectToString(_row.Get((Object)("fldCode"))),0);
RDebugUtils.currentLine=114425890;
 //BA.debugLineNum = 114425890;BA.debugLine="Cu=MCode.Result(\"select * from TblGoroohKala w";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblGoroohKala where fldGroupId="+BA.ObjectToString(_row.Get((Object)("fldCode"))));
RDebugUtils.currentLine=114425891;
 //BA.debugLineNum = 114425891;BA.debugLine="CountRow=Cu.RowCount";
_countrow = _cu.getRowCount();
RDebugUtils.currentLine=114425892;
 //BA.debugLineNum = 114425892;BA.debugLine="Log(CountRow)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425892",BA.NumberToString(_countrow),0);
RDebugUtils.currentLine=114425893;
 //BA.debugLineNum = 114425893;BA.debugLine="Dim Query As String=\"Delete From TblGoroohKala";
_query = "Delete From TblGoroohKala where fldGroupId= "+BA.ObjectToString(_row.Get((Object)("fldCode")));
RDebugUtils.currentLine=114425894;
 //BA.debugLineNum = 114425894;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (processBA,_query);
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=114425897;
 //BA.debugLineNum = 114425897;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step40 = 1;
final int limit40 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit40 ;_i = _i + step40 ) {
RDebugUtils.currentLine=114425898;
 //BA.debugLineNum = 114425898;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=114425899;
 //BA.debugLineNum = 114425899;BA.debugLine="Log(\"deleted tblGalleryPic:\"& Row.Get(\"fldCode";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425899","deleted tblGalleryPic:"+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))),0);
RDebugUtils.currentLine=114425900;
 //BA.debugLineNum = 114425900;BA.debugLine="Cu=MCode.Result(\"select * from tblGalleryPic w";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from tblGalleryPic where fldCodeKala='"+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))+"' and fldImageNumber='"+BA.ObjectToString(_row.Get((Object)("fldImageNumber")))+"'");
RDebugUtils.currentLine=114425901;
 //BA.debugLineNum = 114425901;BA.debugLine="CountRow=Cu.RowCount";
_countrow = _cu.getRowCount();
RDebugUtils.currentLine=114425902;
 //BA.debugLineNum = 114425902;BA.debugLine="Log(CountRow)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425902",BA.NumberToString(_countrow),0);
RDebugUtils.currentLine=114425903;
 //BA.debugLineNum = 114425903;BA.debugLine="Dim Query As String=\"Delete From tblGalleryPic";
_query = "Delete From tblGalleryPic where fldCodeKala= "+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))+"' and fldImageNumber='"+BA.ObjectToString(_row.Get((Object)("fldImageNumber")))+"'";
RDebugUtils.currentLine=114425904;
 //BA.debugLineNum = 114425904;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (processBA,_query);
 }
};
 break; }
case 4: {
RDebugUtils.currentLine=114425907;
 //BA.debugLineNum = 114425907;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step50 = 1;
final int limit50 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit50 ;_i = _i + step50 ) {
RDebugUtils.currentLine=114425908;
 //BA.debugLineNum = 114425908;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=114425909;
 //BA.debugLineNum = 114425909;BA.debugLine="Log(\"deleted FldC_Gorooh:\"& Row.Get(\"fldCode\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425909","deleted FldC_Gorooh:"+BA.ObjectToString(_row.Get((Object)("fldCode"))),0);
RDebugUtils.currentLine=114425910;
 //BA.debugLineNum = 114425910;BA.debugLine="Cu=MCode.Result(\"select * from TblGoroohAshkha";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblGoroohAshkhas where FldC_Gorooh="+BA.ObjectToString(_row.Get((Object)("fldCode"))));
RDebugUtils.currentLine=114425911;
 //BA.debugLineNum = 114425911;BA.debugLine="CountRow=Cu.RowCount";
_countrow = _cu.getRowCount();
RDebugUtils.currentLine=114425912;
 //BA.debugLineNum = 114425912;BA.debugLine="Log(CountRow)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425912",BA.NumberToString(_countrow),0);
RDebugUtils.currentLine=114425913;
 //BA.debugLineNum = 114425913;BA.debugLine="Dim Query As String=\"Delete From TblGoroohAshk";
_query = "Delete From TblGoroohAshkhas where FldC_Gorooh= "+BA.ObjectToString(_row.Get((Object)("fldCode")));
RDebugUtils.currentLine=114425914;
 //BA.debugLineNum = 114425914;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (processBA,_query);
 }
};
 break; }
case 5: {
RDebugUtils.currentLine=114425917;
 //BA.debugLineNum = 114425917;BA.debugLine="MCode.SaveUpdate(\"Delete From TblKala\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblKala");
RDebugUtils.currentLine=114425918;
 //BA.debugLineNum = 114425918;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblAshkhas");
RDebugUtils.currentLine=114425919;
 //BA.debugLineNum = 114425919;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohKala\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGoroohKala");
RDebugUtils.currentLine=114425920;
 //BA.debugLineNum = 114425920;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohAshkhas\"";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGoroohAshkhas");
RDebugUtils.currentLine=114425921;
 //BA.debugLineNum = 114425921;BA.debugLine="MCode.SaveUpdate(\"Delete From tblGalleryPic\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblGalleryPic");
RDebugUtils.currentLine=114425922;
 //BA.debugLineNum = 114425922;BA.debugLine="DateUpdate=0";
_dateupdate = BA.NumberToString(0);
RDebugUtils.currentLine=114425924;
 //BA.debugLineNum = 114425924;BA.debugLine="GetCurrentDate";
_getcurrentdate();
 break; }
}
;
 } 
       catch (Exception e69) {
			processBA.setLastException(e69);RDebugUtils.currentLine=114425927;
 //BA.debugLineNum = 114425927;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114425927",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=114425928;
 //BA.debugLineNum = 114425928;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetListDelete");
 };
RDebugUtils.currentLine=114425930;
 //BA.debugLineNum = 114425930;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loaddata", false))
	 {return ((String) Debug.delegate(processBA, "loaddata", null));}
String _str = "";
String _getdate = "";
String _gettime = "";
RDebugUtils.currentLine=114098176;
 //BA.debugLineNum = 114098176;BA.debugLine="Sub LoadData";
RDebugUtils.currentLine=114098179;
 //BA.debugLineNum = 114098179;BA.debugLine="GetDateUpdate";
_getdateupdate();
RDebugUtils.currentLine=114098180;
 //BA.debugLineNum = 114098180;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=114098181;
 //BA.debugLineNum = 114098181;BA.debugLine="str=mode";
_str = _mode;
RDebugUtils.currentLine=114098182;
 //BA.debugLineNum = 114098182;BA.debugLine="Try";
try {RDebugUtils.currentLine=114098185;
 //BA.debugLineNum = 114098185;BA.debugLine="Log(\"Gps Stop\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098185","Gps Stop",0);
RDebugUtils.currentLine=114098187;
 //BA.debugLineNum = 114098187;BA.debugLine="Select str";
switch (BA.switchObjectToInt(_str,"GetSetting","GetKala","GetKalaAll","GetGoroohKala","GetGoroohKalaAll","GetAshkhas","GetAshkhasAll","GetGoroohAshkhas","GetGoroohAshkhasAll","GetGalleryKalaAll","GetUpdateFee","GetGalleryKala","GetHavale","GetHavaleByUser","GetEshantion","GetVaziat","GetFee","GetTasvie","GetReportRizePishFactor3","stop","GetDelete")) {
case 0: {
RDebugUtils.currentLine=114098190;
 //BA.debugLineNum = 114098190;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098190",_str,0);
RDebugUtils.currentLine=114098191;
 //BA.debugLineNum = 114098191;BA.debugLine="GetSetting";
_getsetting();
 break; }
case 1: {
RDebugUtils.currentLine=114098194;
 //BA.debugLineNum = 114098194;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098194",_str,0);
RDebugUtils.currentLine=114098195;
 //BA.debugLineNum = 114098195;BA.debugLine="GetKala(\"GetKala\")";
_getkala("GetKala");
 break; }
case 2: {
RDebugUtils.currentLine=114098198;
 //BA.debugLineNum = 114098198;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098198",_str,0);
RDebugUtils.currentLine=114098199;
 //BA.debugLineNum = 114098199;BA.debugLine="GetKala(\"GetKalaAll\")";
_getkala("GetKalaAll");
 break; }
case 3: {
RDebugUtils.currentLine=114098203;
 //BA.debugLineNum = 114098203;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098203",_str,0);
RDebugUtils.currentLine=114098204;
 //BA.debugLineNum = 114098204;BA.debugLine="GetGoroohKala(\"GetGoroohKala\")";
_getgoroohkala("GetGoroohKala");
 break; }
case 4: {
RDebugUtils.currentLine=114098208;
 //BA.debugLineNum = 114098208;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098208",_str,0);
RDebugUtils.currentLine=114098209;
 //BA.debugLineNum = 114098209;BA.debugLine="GetGoroohKala(\"GetGoroohKalaAll\")";
_getgoroohkala("GetGoroohKalaAll");
 break; }
case 5: {
RDebugUtils.currentLine=114098214;
 //BA.debugLineNum = 114098214;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098214",_str,0);
RDebugUtils.currentLine=114098215;
 //BA.debugLineNum = 114098215;BA.debugLine="GetAshkhas(\"GetAshkhas\")";
_getashkhas("GetAshkhas");
 break; }
case 6: {
RDebugUtils.currentLine=114098219;
 //BA.debugLineNum = 114098219;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098219",_str,0);
RDebugUtils.currentLine=114098220;
 //BA.debugLineNum = 114098220;BA.debugLine="GetAshkhas(\"GetAshkhasAll\")";
_getashkhas("GetAshkhasAll");
 break; }
case 7: {
RDebugUtils.currentLine=114098225;
 //BA.debugLineNum = 114098225;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098225",_str,0);
RDebugUtils.currentLine=114098226;
 //BA.debugLineNum = 114098226;BA.debugLine="GetGoroohAshkhas(\"GetGoroohAshkhas\")";
_getgoroohashkhas("GetGoroohAshkhas");
 break; }
case 8: {
RDebugUtils.currentLine=114098229;
 //BA.debugLineNum = 114098229;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098229",_str,0);
 break; }
case 9: {
RDebugUtils.currentLine=114098234;
 //BA.debugLineNum = 114098234;BA.debugLine="GetGalleryKala(\"GetGalleryKalaAll\")";
_getgallerykala("GetGalleryKalaAll");
 break; }
case 10: {
RDebugUtils.currentLine=114098237;
 //BA.debugLineNum = 114098237;BA.debugLine="GetUpdateFee";
_getupdatefee();
 break; }
case 11: {
RDebugUtils.currentLine=114098240;
 //BA.debugLineNum = 114098240;BA.debugLine="GetGalleryKala(\"GetGalleryKala\")";
_getgallerykala("GetGalleryKala");
 break; }
case 12: {
RDebugUtils.currentLine=114098243;
 //BA.debugLineNum = 114098243;BA.debugLine="GetHavale";
_gethavale();
 break; }
case 13: {
RDebugUtils.currentLine=114098246;
 //BA.debugLineNum = 114098246;BA.debugLine="GetHavaleByUser";
_gethavalebyuser();
 break; }
case 14: {
RDebugUtils.currentLine=114098250;
 //BA.debugLineNum = 114098250;BA.debugLine="GetEshantion";
_geteshantion();
 break; }
case 15: {
RDebugUtils.currentLine=114098253;
 //BA.debugLineNum = 114098253;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098253",_str,0);
 break; }
case 16: {
RDebugUtils.currentLine=114098256;
 //BA.debugLineNum = 114098256;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098256",_str,0);
RDebugUtils.currentLine=114098257;
 //BA.debugLineNum = 114098257;BA.debugLine="GetFee";
_getfee();
 break; }
case 17: {
RDebugUtils.currentLine=114098259;
 //BA.debugLineNum = 114098259;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098259",_str,0);
RDebugUtils.currentLine=114098260;
 //BA.debugLineNum = 114098260;BA.debugLine="GetTasvie";
_gettasvie();
 break; }
case 18: {
RDebugUtils.currentLine=114098262;
 //BA.debugLineNum = 114098262;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098262",_str,0);
RDebugUtils.currentLine=114098263;
 //BA.debugLineNum = 114098263;BA.debugLine="GetReportRizePishFactor3";
_getreportrizepishfactor3();
 break; }
case 19: {
RDebugUtils.currentLine=114098265;
 //BA.debugLineNum = 114098265;BA.debugLine="Log(\"stop\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098265","stop",0);
 break; }
case 20: {
RDebugUtils.currentLine=114098267;
 //BA.debugLineNum = 114098267;BA.debugLine="Delete";
_delete();
 break; }
default: {
RDebugUtils.currentLine=114098271;
 //BA.debugLineNum = 114098271;BA.debugLine="Dim GetDate As String";
_getdate = "";
RDebugUtils.currentLine=114098272;
 //BA.debugLineNum = 114098272;BA.debugLine="Dim GetTime As String";
_gettime = "";
RDebugUtils.currentLine=114098274;
 //BA.debugLineNum = 114098274;BA.debugLine="GetTime=DateTime.Time(DateTime.Now)";
_gettime = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=114098275;
 //BA.debugLineNum = 114098275;BA.debugLine="GetDate=MCode.DatePersian";
_getdate = mostCurrent._mcode._datepersian /*String*/ (processBA);
RDebugUtils.currentLine=114098276;
 //BA.debugLineNum = 114098276;BA.debugLine="Log(\"Time: \"&GetTime&\" Date: \"&GetDate)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098276","Time: "+_gettime+" Date: "+_getdate,0);
 break; }
}
;
 } 
       catch (Exception e68) {
			processBA.setLastException(e68);RDebugUtils.currentLine=114098294;
 //BA.debugLineNum = 114098294;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5114098294",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=114098295;
 //BA.debugLineNum = 114098295;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadData");
 };
RDebugUtils.currentLine=114098300;
 //BA.debugLineNum = 114098300;BA.debugLine="End Sub";
return "";
}
public static String  _loadgeteshantion(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgeteshantion", false))
	 {return ((String) Debug.delegate(processBA, "loadgeteshantion", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=115146752;
 //BA.debugLineNum = 115146752;BA.debugLine="Sub LoadGetEshantion(Str As String)";
RDebugUtils.currentLine=115146753;
 //BA.debugLineNum = 115146753;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115146754;
 //BA.debugLineNum = 115146754;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115146755;
 //BA.debugLineNum = 115146755;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionVisitor";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From tblEshantionVisitori");
RDebugUtils.currentLine=115146756;
 //BA.debugLineNum = 115146756;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=115146757;
 //BA.debugLineNum = 115146757;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=115146758;
 //BA.debugLineNum = 115146758;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblEshantionVisito";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"tblEshantionVisitori",_rowslist);
RDebugUtils.currentLine=115146765;
 //BA.debugLineNum = 115146765;BA.debugLine="Log(\"اشانتیون بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5115146765","اشانتیون بروزرسانی گردید",0);
RDebugUtils.currentLine=115146768;
 //BA.debugLineNum = 115146768;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetfeefast(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetfeefast", false))
	 {return ((String) Debug.delegate(processBA, "loadgetfeefast", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crow = null;
int _countrow = 0;
RDebugUtils.currentLine=116129792;
 //BA.debugLineNum = 116129792;BA.debugLine="Sub LoadGetFeeFast(Str As String)";
RDebugUtils.currentLine=116129793;
 //BA.debugLineNum = 116129793;BA.debugLine="Try";
try {RDebugUtils.currentLine=116129794;
 //BA.debugLineNum = 116129794;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116129795;
 //BA.debugLineNum = 116129795;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116129796;
 //BA.debugLineNum = 116129796;BA.debugLine="Dim crow As  Cursor";
_crow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=116129797;
 //BA.debugLineNum = 116129797;BA.debugLine="Dim CountRow As Int";
_countrow = 0;
RDebugUtils.currentLine=116129799;
 //BA.debugLineNum = 116129799;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=116129800;
 //BA.debugLineNum = 116129800;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=116129802;
 //BA.debugLineNum = 116129802;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=116129803;
 //BA.debugLineNum = 116129803;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=116129804;
 //BA.debugLineNum = 116129804;BA.debugLine="Log(\"fldCodeKala:\"& Row.Get(\"fldCodeKala\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5116129804","fldCodeKala:"+BA.ObjectToString(_row.Get((Object)("fldCodeKala"))),0);
RDebugUtils.currentLine=116129806;
 //BA.debugLineNum = 116129806;BA.debugLine="crow=MCode.Result(\"select * from TblFee where Fl";
_crow = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"select * from TblFee where FldCodeKala='"+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))+"' and FldCodeTasvie='"+BA.ObjectToString(_row.Get((Object)("fldCodeTasvie")))+"'");
RDebugUtils.currentLine=116129807;
 //BA.debugLineNum = 116129807;BA.debugLine="CountRow=crow.RowCount";
_countrow = _crow.getRowCount();
RDebugUtils.currentLine=116129808;
 //BA.debugLineNum = 116129808;BA.debugLine="If CountRow =0 Then";
if (_countrow==0) { 
RDebugUtils.currentLine=116129809;
 //BA.debugLineNum = 116129809;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblFee (FldCodeKa";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblFee (FldCodeKala,FldCodeTasvie,FldFee) Values ('"+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))+"','"+BA.ObjectToString(_row.Get((Object)("fldCodeTasvie")))+"','"+BA.ObjectToString(_row.Get((Object)("fldFee")))+"')");
 }else 
{RDebugUtils.currentLine=116129812;
 //BA.debugLineNum = 116129812;BA.debugLine="Else if CountRow>0 Then";
if (_countrow>0) { 
RDebugUtils.currentLine=116129823;
 //BA.debugLineNum = 116129823;BA.debugLine="MCode.SaveUpdate(\"Update TblFee Set FldFee='\"&R";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Update TblFee Set FldFee='"+BA.ObjectToString(_row.Get((Object)("fldFee")))+"'"+" where FldCodeKala='"+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))+"' and FldCodeTasvie='"+BA.ObjectToString(_row.Get((Object)("fldCodeTasvie")))+"'");
 }}
;
 }
};
RDebugUtils.currentLine=116129828;
 //BA.debugLineNum = 116129828;BA.debugLine="Log(\"فی بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116129828","فی بروزرسانی گردید",0);
 } 
       catch (Exception e21) {
			processBA.setLastException(e21);RDebugUtils.currentLine=116129830;
 //BA.debugLineNum = 116129830;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116129830",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=116129831;
 //BA.debugLineNum = 116129831;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-LoadGetFeeFast");
 };
RDebugUtils.currentLine=116129834;
 //BA.debugLineNum = 116129834;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetgallerykala(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetgallerykala", false))
	 {return ((String) Debug.delegate(processBA, "loadgetgallerykala", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=115212288;
 //BA.debugLineNum = 115212288;BA.debugLine="Sub LoadGetGalleryKala(Str As String)";
RDebugUtils.currentLine=115212289;
 //BA.debugLineNum = 115212289;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=115212290;
 //BA.debugLineNum = 115212290;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=115212291;
 //BA.debugLineNum = 115212291;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGalleryPic\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGalleryPic");
RDebugUtils.currentLine=115212292;
 //BA.debugLineNum = 115212292;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=115212293;
 //BA.debugLineNum = 115212293;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=115212295;
 //BA.debugLineNum = 115212295;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=115212296;
 //BA.debugLineNum = 115212296;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=115212297;
 //BA.debugLineNum = 115212297;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGalleryPic (fld";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblGalleryPic (fldCodeKala,fldImageNumber,fldImage,fldShow) Values ('"+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))+"','"+BA.ObjectToString(_row.Get((Object)("fldImageNumber")))+"','"+BA.ObjectToString(_row.Get((Object)("fldImage")))+"','"+BA.ObjectToString(_row.Get((Object)("fldShow")))+"')");
 }
};
RDebugUtils.currentLine=115212301;
 //BA.debugLineNum = 115212301;BA.debugLine="Log(\"گالری تصاویر بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5115212301","گالری تصاویر بروزرسانی گردید",0);
RDebugUtils.currentLine=115212302;
 //BA.debugLineNum = 115212302;BA.debugLine="ToastMessageShow(\"گالری تصاویر بروزرسانی گردید\",T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("گالری تصاویر بروزرسانی گردید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=115212303;
 //BA.debugLineNum = 115212303;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetreportrizepishfactor3(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgetreportrizepishfactor3", false))
	 {return ((String) Debug.delegate(processBA, "loadgetreportrizepishfactor3", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=116850688;
 //BA.debugLineNum = 116850688;BA.debugLine="Sub LoadGetReportRizePishFactor3(Str As String)";
RDebugUtils.currentLine=116850689;
 //BA.debugLineNum = 116850689;BA.debugLine="Try";
try {RDebugUtils.currentLine=116850690;
 //BA.debugLineNum = 116850690;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116850691;
 //BA.debugLineNum = 116850691;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116850692;
 //BA.debugLineNum = 116850692;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=116850693;
 //BA.debugLineNum = 116850693;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=116850695;
 //BA.debugLineNum = 116850695;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor where Fl";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblFaktor where FldSync='True'");
RDebugUtils.currentLine=116850696;
 //BA.debugLineNum = 116850696;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116850697;
 //BA.debugLineNum = 116850697;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=116850698;
 //BA.debugLineNum = 116850698;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=116850699;
 //BA.debugLineNum = 116850699;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=116850709;
 //BA.debugLineNum = 116850709;BA.debugLine="If Row.Get(\"fldTedadJoz\")>0 Or Row.Get(\"fldTeda";
if ((double)(BA.ObjectToNumber(_row.Get((Object)("fldTedadJoz"))))>0 || (double)(BA.ObjectToNumber(_row.Get((Object)("fldTedadCarton"))))>0) { 
RDebugUtils.currentLine=116850713;
 //BA.debugLineNum = 116850713;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116850714;
 //BA.debugLineNum = 116850714;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=116850715;
 //BA.debugLineNum = 116850715;BA.debugLine="m.Put(\"FldRadif\",Row.Get(\"fldRadif\"))";
_m.Put((Object)("FldRadif"),_row.Get((Object)("fldRadif")));
RDebugUtils.currentLine=116850716;
 //BA.debugLineNum = 116850716;BA.debugLine="m.Put(\"FldC_Visitor\",Row.Get(\"fldCodeVasete\"))";
_m.Put((Object)("FldC_Visitor"),_row.Get((Object)("fldCodeVasete")));
RDebugUtils.currentLine=116850717;
 //BA.debugLineNum = 116850717;BA.debugLine="m.Put(\"FldC_Tafzili\",Row.Get(\"fldCodeTafsili\")";
_m.Put((Object)("FldC_Tafzili"),_row.Get((Object)("fldCodeTafsili")));
RDebugUtils.currentLine=116850718;
 //BA.debugLineNum = 116850718;BA.debugLine="m.Put(\"FldN_Tafzili\",Row.Get(\"fldSharheTafzili";
_m.Put((Object)("FldN_Tafzili"),_row.Get((Object)("fldSharheTafzili")));
RDebugUtils.currentLine=116850719;
 //BA.debugLineNum = 116850719;BA.debugLine="m.Put(\"FldShomareFaktor\",Row.Get(\"fldShomareFa";
_m.Put((Object)("FldShomareFaktor"),_row.Get((Object)("fldShomareFactor")));
RDebugUtils.currentLine=116850720;
 //BA.debugLineNum = 116850720;BA.debugLine="m.Put(\"FldShomareBargasht\",Row.Get(\"fldShomare";
_m.Put((Object)("FldShomareBargasht"),_row.Get((Object)("fldShomareBargasht")));
RDebugUtils.currentLine=116850721;
 //BA.debugLineNum = 116850721;BA.debugLine="m.Put(\"FldCodeKala\",Row.Get(\"fldCodeKala\"))";
_m.Put((Object)("FldCodeKala"),_row.Get((Object)("fldCodeKala")));
RDebugUtils.currentLine=116850722;
 //BA.debugLineNum = 116850722;BA.debugLine="m.Put(\"FldNameKala\",Row.Get(\"fldSharhKala\"))";
_m.Put((Object)("FldNameKala"),_row.Get((Object)("fldSharhKala")));
RDebugUtils.currentLine=116850723;
 //BA.debugLineNum = 116850723;BA.debugLine="m.Put(\"FldFeeForoosh\",Row.Get(\"fldFeeJoz\"))";
_m.Put((Object)("FldFeeForoosh"),_row.Get((Object)("fldFeeJoz")));
RDebugUtils.currentLine=116850724;
 //BA.debugLineNum = 116850724;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Row.Get(\"fldMablagh";
_m.Put((Object)("fldFeeBadAzTakhfif"),_row.Get((Object)("fldMablaghTakhfif")));
RDebugUtils.currentLine=116850725;
 //BA.debugLineNum = 116850725;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Row.Get(\"fldMablaghT";
_m.Put((Object)("FldMablaghTakhfif"),_row.Get((Object)("fldMablaghTakhfif")));
RDebugUtils.currentLine=116850726;
 //BA.debugLineNum = 116850726;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Row.Get(\"fldTedadJ";
_m.Put((Object)("FldTedadDarSabadJoz"),_row.Get((Object)("fldTedadJoz")));
RDebugUtils.currentLine=116850727;
 //BA.debugLineNum = 116850727;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Row.Get(\"fldTedadC";
_m.Put((Object)("FldTedadDarSabadKol"),_row.Get((Object)("fldTedadCarton")));
RDebugUtils.currentLine=116850728;
 //BA.debugLineNum = 116850728;BA.debugLine="m.Put(\"FldTedadDarkarton\",Row.Get(\"FldTedadDar";
_m.Put((Object)("FldTedadDarkarton"),_row.Get((Object)("FldTedadDarKarton")));
RDebugUtils.currentLine=116850729;
 //BA.debugLineNum = 116850729;BA.debugLine="m.Put(\"FldTotalFaktor\",Row.Get(\"FldTotalFaktor";
_m.Put((Object)("FldTotalFaktor"),_row.Get((Object)("FldTotalFaktor")));
RDebugUtils.currentLine=116850730;
 //BA.debugLineNum = 116850730;BA.debugLine="m.Put(\"FldTozihat\",Row.Get(\"fldTozihatRecord\")";
_m.Put((Object)("FldTozihat"),_row.Get((Object)("fldTozihatRecord")));
RDebugUtils.currentLine=116850731;
 //BA.debugLineNum = 116850731;BA.debugLine="m.Put(\"FldTozih\",Row.Get(\"FldTozihat\"))";
_m.Put((Object)("FldTozih"),_row.Get((Object)("FldTozihat")));
RDebugUtils.currentLine=116850732;
 //BA.debugLineNum = 116850732;BA.debugLine="m.Put(\"FldVaziatPardakht\",Row.Get(\"fldNahveTas";
_m.Put((Object)("FldVaziatPardakht"),_row.Get((Object)("fldNahveTasvie")));
RDebugUtils.currentLine=116850733;
 //BA.debugLineNum = 116850733;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",Row.Get(\"FldMabla";
_m.Put((Object)("FldMablaghTakhfifKol"),_row.Get((Object)("FldMablaghTakhfifKol")));
RDebugUtils.currentLine=116850734;
 //BA.debugLineNum = 116850734;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",Row.Get(\"Fld";
_m.Put((Object)("FldSumMablaghTakhfifVizhe"),_row.Get((Object)("FldSumMablaghTakhfifVizhe")));
RDebugUtils.currentLine=116850735;
 //BA.debugLineNum = 116850735;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",Row.Get(\"FldS";
_m.Put((Object)("FldSumMablaghTakhfifKala"),_row.Get((Object)("FldSumMablaghTakhfifKala")));
RDebugUtils.currentLine=116850736;
 //BA.debugLineNum = 116850736;BA.debugLine="m.Put(\"FldMablaghKol\",Row.Get(\"FldTotalFaktor\"";
_m.Put((Object)("FldMablaghKol"),_row.Get((Object)("FldTotalFaktor")));
RDebugUtils.currentLine=116850737;
 //BA.debugLineNum = 116850737;BA.debugLine="m.Put(\"FldDate\",Row.Get(\"fldDate\"))";
_m.Put((Object)("FldDate"),_row.Get((Object)("fldDate")));
RDebugUtils.currentLine=116850738;
 //BA.debugLineNum = 116850738;BA.debugLine="m.Put(\"FldTime\",Row.Get(\"fldTime\"))";
_m.Put((Object)("FldTime"),_row.Get((Object)("fldTime")));
RDebugUtils.currentLine=116850739;
 //BA.debugLineNum = 116850739;BA.debugLine="m.Put(\"FldSignatureBitmapString\",Row.Get(\"FldS";
_m.Put((Object)("FldSignatureBitmapString"),_row.Get((Object)("FldSignatureBitmapString")));
RDebugUtils.currentLine=116850740;
 //BA.debugLineNum = 116850740;BA.debugLine="m.Put(\"FldSync\",\"True\")";
_m.Put((Object)("FldSync"),(Object)("True"));
RDebugUtils.currentLine=116850741;
 //BA.debugLineNum = 116850741;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
_m.Put((Object)("WIsBacked"),(Object)("False"));
RDebugUtils.currentLine=116850742;
 //BA.debugLineNum = 116850742;BA.debugLine="m.Put(\"FldType\",\"Foroosh\")";
_m.Put((Object)("FldType"),(Object)("Foroosh"));
RDebugUtils.currentLine=116850743;
 //BA.debugLineNum = 116850743;BA.debugLine="m.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
_m.Put((Object)("FldAmani"),_row.Get((Object)("FldAmani")));
RDebugUtils.currentLine=116850744;
 //BA.debugLineNum = 116850744;BA.debugLine="m.Put(\"fldShomareForoosh\",Row.Get(\"fldShomareF";
_m.Put((Object)("fldShomareForoosh"),_row.Get((Object)("fldShomareForoosh")));
RDebugUtils.currentLine=116850745;
 //BA.debugLineNum = 116850745;BA.debugLine="m.Put(\"WSendFrom\",3)";
_m.Put((Object)("WSendFrom"),(Object)(3));
RDebugUtils.currentLine=116850746;
 //BA.debugLineNum = 116850746;BA.debugLine="lst.Add(m)";
_lst.Add((Object)(_m.getObject()));
 };
 }
};
RDebugUtils.currentLine=116850751;
 //BA.debugLineNum = 116850751;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFaktor\",lst)";
mostCurrent._dbutils._insertmaps /*String*/ (processBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblFaktor",_lst);
RDebugUtils.currentLine=116850753;
 //BA.debugLineNum = 116850753;BA.debugLine="Log(\"لیست سفارشات بروزرسانی گردید\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5116850753","لیست سفارشات بروزرسانی گردید",0);
 } 
       catch (Exception e51) {
			processBA.setLastException(e51);RDebugUtils.currentLine=116850755;
 //BA.debugLineNum = 116850755;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5116850755",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=116850756;
 //BA.debugLineNum = 116850756;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"Service_Server-LoadGetReportRizePishFactor");
 };
RDebugUtils.currentLine=116850758;
 //BA.debugLineNum = 116850758;BA.debugLine="End Sub";
return "";
}
public static String  _loadgettasvie(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "loadgettasvie", false))
	 {return ((String) Debug.delegate(processBA, "loadgettasvie", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=116260864;
 //BA.debugLineNum = 116260864;BA.debugLine="Sub LoadGetTasvie(Str As String)";
RDebugUtils.currentLine=116260865;
 //BA.debugLineNum = 116260865;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116260866;
 //BA.debugLineNum = 116260866;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=116260867;
 //BA.debugLineNum = 116260867;BA.debugLine="MCode.SaveUpdate(\"Delete From TblTasvie\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblTasvie");
RDebugUtils.currentLine=116260868;
 //BA.debugLineNum = 116260868;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=116260869;
 //BA.debugLineNum = 116260869;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=116260871;
 //BA.debugLineNum = 116260871;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=116260872;
 //BA.debugLineNum = 116260872;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=116260873;
 //BA.debugLineNum = 116260873;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblTasvie (FldCode";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Insert Into TblTasvie (FldCode,FldName) Values ('"+BA.ObjectToString(_row.Get((Object)("fldCode")))+"','"+BA.ObjectToString(_row.Get((Object)("fldName")))+"')");
 }
};
RDebugUtils.currentLine=116260876;
 //BA.debugLineNum = 116260876;BA.debugLine="End Sub";
return "";
}
public static String  _sendtoken(String _str) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "sendtoken", false))
	 {return ((String) Debug.delegate(processBA, "sendtoken", new Object[] {_str}));}
RDebugUtils.currentLine=115933184;
 //BA.debugLineNum = 115933184;BA.debugLine="Sub SendToken(Str As String)";
RDebugUtils.currentLine=115933185;
 //BA.debugLineNum = 115933185;BA.debugLine="jobInternet.JobName =\"SaveToken\"";
_jobinternet._jobname /*String*/  = "SaveToken";
RDebugUtils.currentLine=115933186;
 //BA.debugLineNum = 115933186;BA.debugLine="Log(Str)";
anywheresoftware.b4a.keywords.Common.LogImpl("5115933186",_str,0);
RDebugUtils.currentLine=115933187;
 //BA.debugLineNum = 115933187;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveToken","Token="+_str+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=115933188;
 //BA.debugLineNum = 115933188;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=113770496;
 //BA.debugLineNum = 113770496;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=113770498;
 //BA.debugLineNum = 113770498;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
_jobinternet._initialize /*String*/ (null,processBA,"jobInternet",firebasemessaging.getObject());
RDebugUtils.currentLine=113770501;
 //BA.debugLineNum = 113770501;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=115867648;
 //BA.debugLineNum = 115867648;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=115867650;
 //BA.debugLineNum = 115867650;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=113901568;
 //BA.debugLineNum = 113901568;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=113901570;
 //BA.debugLineNum = 113901570;BA.debugLine="Try";
try {RDebugUtils.currentLine=113901572;
 //BA.debugLineNum = 113901572;BA.debugLine="GetCurrentDate";
_getcurrentdate();
RDebugUtils.currentLine=113901573;
 //BA.debugLineNum = 113901573;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((mostCurrent._mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=113901574;
 //BA.debugLineNum = 113901574;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=113901576;
 //BA.debugLineNum = 113901576;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (mostCurrent._mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=113901577;
 //BA.debugLineNum = 113901577;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=113901578;
 //BA.debugLineNum = 113901578;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=113901580;
 //BA.debugLineNum = 113901580;BA.debugLine="LoadData";
_loaddata();
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=113901582;
 //BA.debugLineNum = 113901582;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5113901582",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=113901583;
 //BA.debugLineNum = 113901583;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
mostCurrent._mycode._senderror /*void*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),"FirebaseMessaging-Service_Start");
 };
RDebugUtils.currentLine=113901587;
 //BA.debugLineNum = 113901587;BA.debugLine="End Sub";
return "";
}
public static String  _subscribetotopics() throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "subscribetotopics", false))
	 {return ((String) Debug.delegate(processBA, "subscribetotopics", null));}
RDebugUtils.currentLine=113836032;
 //BA.debugLineNum = 113836032;BA.debugLine="Public Sub SubscribeToTopics";
RDebugUtils.currentLine=113836034;
 //BA.debugLineNum = 113836034;BA.debugLine="End Sub";
return "";
}
}