package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ReceiverHelper;
import anywheresoftware.b4a.debug.*;

public class gpswiget extends android.content.BroadcastReceiver{
		
    static gpswiget mostCurrent;
	public static BA processBA;
    private ReceiverHelper _receiver;
    private static boolean firstTime = true;
    public static Class<?> getObject() {
		return gpswiget.class;
	}
	@Override
	public void onReceive(android.content.Context context, android.content.Intent intent) {
        mostCurrent = this;
       
        if (processBA == null) {
           
		    processBA = new anywheresoftware.b4a.ShellBA(context, null, null, anywheresoftware.b4a.BA.SharedProcessBA.ModuleType.RECEIVER, "ir.parsikhesab.pakhsh.gpswiget");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
        }
         _receiver = new ReceiverHelper(this);
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.gpswiget", processBA, _receiver, anywheresoftware.b4a.keywords.Common.Density);
		}
        processBA.setActivityPaused(false);
        BA.LogInfo("*** Receiver (gpswiget) Receive " + (firstTime ? "(first time)" : "") + " ***");
        anywheresoftware.b4a.objects.IntentWrapper iw = new anywheresoftware.b4a.objects.IntentWrapper();
        iw.setObject(intent);
        processBA.raiseEvent(null, "receiver_receive", firstTime, iw);
        firstTime = false;
    }
	

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.RemoteViewsWrapper _rv = null;
public static ir.parsikhesab.pakhsh.httpjob _jobinternet = null;
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
public static String  _imageview1_click() throws Exception{
RDebugUtils.currentModule="gpswiget";
if (Debug.shouldDelegate(processBA, "imageview1_click", false))
	 {return ((String) Debug.delegate(processBA, "imageview1_click", null));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Private Sub ImageView1_Click";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="StartActivity(Act_Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_main.getObject()));
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
RDebugUtils.currentModule="gpswiget";
if (Debug.shouldDelegate(processBA, "jobdone", false))
	 {return ((String) Debug.delegate(processBA, "jobdone", new Object[] {_job}));}
String _str = "";
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="Job.GetRequest.Timeout=50000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="Dim Str As String = Job.GetString";
_str = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="Select Case Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"SendGps")) {
case 0: {
RDebugUtils.currentLine=20709383;
 //BA.debugLineNum = 20709383;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
 }else {
RDebugUtils.currentLine=20709386;
 //BA.debugLineNum = 20709386;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGpsVisitor\")";
mostCurrent._mcode._saveupdate /*String*/ (processBA,"Delete From TblGpsVisitor");
RDebugUtils.currentLine=20709387;
 //BA.debugLineNum = 20709387;BA.debugLine="Log(\"GPS OK\")";
anywheresoftware.b4a.keywords.Common.LogImpl("520709387","GPS OK",0);
 };
 break; }
}
;
 }else {
 };
RDebugUtils.currentLine=20709394;
 //BA.debugLineNum = 20709394;BA.debugLine="jobInternet.Release";
_jobinternet._release /*String*/ (null);
RDebugUtils.currentLine=20709395;
 //BA.debugLineNum = 20709395;BA.debugLine="End Sub";
return "";
}
public static String  _label1_click() throws Exception{
RDebugUtils.currentModule="gpswiget";
if (Debug.shouldDelegate(processBA, "label1_click", false))
	 {return ((String) Debug.delegate(processBA, "label1_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20905989;
 //BA.debugLineNum = 20905989;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((mostCurrent._mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20905993;
 //BA.debugLineNum = 20905993;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (mostCurrent._mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=20905994;
 //BA.debugLineNum = 20905994;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20905995;
 //BA.debugLineNum = 20905995;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20905997;
 //BA.debugLineNum = 20905997;BA.debugLine="MCode.page = \"Act_Moshtarian\"";
mostCurrent._mcode._page /*String*/  = "Act_Moshtarian";
RDebugUtils.currentLine=20905998;
 //BA.debugLineNum = 20905998;BA.debugLine="Dim Cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20905999;
 //BA.debugLineNum = 20905999;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblSetting");
RDebugUtils.currentLine=20906000;
 //BA.debugLineNum = 20906000;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=20906001;
 //BA.debugLineNum = 20906001;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("520906001",_cu.GetString("FldC_Visitor"),0);
RDebugUtils.currentLine=20906002;
 //BA.debugLineNum = 20906002;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" Th";
if ((_cu.GetString("FldC_Visitor")).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=20906003;
 //BA.debugLineNum = 20906003;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بعد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20906004;
 //BA.debugLineNum = 20906004;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20906006;
 //BA.debugLineNum = 20906006;BA.debugLine="StartActivity(Act_SelectMantage)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_selectmantage.getObject()));
RDebugUtils.currentLine=20906007;
 //BA.debugLineNum = 20906007;BA.debugLine="End Sub";
return "";
}
public static String  _label4_click() throws Exception{
RDebugUtils.currentModule="gpswiget";
if (Debug.shouldDelegate(processBA, "label4_click", false))
	 {return ((String) Debug.delegate(processBA, "label4_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Private Sub Label4_Click";
RDebugUtils.currentLine=20971524;
 //BA.debugLineNum = 20971524;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=20971525;
 //BA.debugLineNum = 20971525;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20971526;
 //BA.debugLineNum = 20971526;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20971528;
 //BA.debugLineNum = 20971528;BA.debugLine="Dim Cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20971529;
 //BA.debugLineNum = 20971529;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblSetting");
RDebugUtils.currentLine=20971530;
 //BA.debugLineNum = 20971530;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=20971531;
 //BA.debugLineNum = 20971531;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("520971531",_cu.GetString("FldC_Visitor"),0);
RDebugUtils.currentLine=20971532;
 //BA.debugLineNum = 20971532;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" Th";
if ((_cu.GetString("FldC_Visitor")).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=20971533;
 //BA.debugLineNum = 20971533;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بعد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20971534;
 //BA.debugLineNum = 20971534;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20971536;
 //BA.debugLineNum = 20971536;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (mostCurrent._mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=20971537;
 //BA.debugLineNum = 20971537;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20971538;
 //BA.debugLineNum = 20971538;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20971540;
 //BA.debugLineNum = 20971540;BA.debugLine="MCode.UpdateShakhs=False";
mostCurrent._mcode._updateshakhs /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=20971541;
 //BA.debugLineNum = 20971541;BA.debugLine="StartActivity(Act_NewAshkhas)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_newashkhas.getObject()));
RDebugUtils.currentLine=20971544;
 //BA.debugLineNum = 20971544;BA.debugLine="End Sub";
return "";
}
public static String  _label5_click() throws Exception{
RDebugUtils.currentModule="gpswiget";
if (Debug.shouldDelegate(processBA, "label5_click", false))
	 {return ((String) Debug.delegate(processBA, "label5_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Private Sub Label5_Click";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="If	MCode.Visitor=\"0\" Then";
if ((mostCurrent._mcode._visitor /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="ToastMessageShow(\"این بخش مربوط به نسخه ویزیتور";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20840455;
 //BA.debugLineNum = 20840455;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20840457;
 //BA.debugLineNum = 20840457;BA.debugLine="Dim Cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20840458;
 //BA.debugLineNum = 20840458;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblSetting");
RDebugUtils.currentLine=20840459;
 //BA.debugLineNum = 20840459;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=20840460;
 //BA.debugLineNum = 20840460;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("520840460",_cu.GetString("FldC_Visitor"),0);
RDebugUtils.currentLine=20840461;
 //BA.debugLineNum = 20840461;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" Th";
if ((_cu.GetString("FldC_Visitor")).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=20840462;
 //BA.debugLineNum = 20840462;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بعد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20840463;
 //BA.debugLineNum = 20840463;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20840465;
 //BA.debugLineNum = 20840465;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((mostCurrent._mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=20840466;
 //BA.debugLineNum = 20840466;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20840467;
 //BA.debugLineNum = 20840467;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20840469;
 //BA.debugLineNum = 20840469;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (mostCurrent._mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=20840470;
 //BA.debugLineNum = 20840470;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20840471;
 //BA.debugLineNum = 20840471;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20840478;
 //BA.debugLineNum = 20840478;BA.debugLine="Cu=MCode.Result(\"Select * From TblKala\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblKala");
RDebugUtils.currentLine=20840479;
 //BA.debugLineNum = 20840479;BA.debugLine="If Cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=20840480;
 //BA.debugLineNum = 20840480;BA.debugLine="ToastMessageShow(\"لیست کالا به درستی دریافت نشده";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست کالا به درستی دریافت نشده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20840481;
 //BA.debugLineNum = 20840481;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20840483;
 //BA.debugLineNum = 20840483;BA.debugLine="Cu=MCode.Result(\"Select * From TblGoroohKala\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblGoroohKala");
RDebugUtils.currentLine=20840484;
 //BA.debugLineNum = 20840484;BA.debugLine="If Cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=20840485;
 //BA.debugLineNum = 20840485;BA.debugLine="ToastMessageShow(\"جدول گروه کالا به درستی دریافت";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("جدول گروه کالا به درستی دریافت نشده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20840486;
 //BA.debugLineNum = 20840486;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20840488;
 //BA.debugLineNum = 20840488;BA.debugLine="Cu=MCode.Result(\"Select * From TblTasvie\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (processBA,"Select * From TblTasvie");
RDebugUtils.currentLine=20840489;
 //BA.debugLineNum = 20840489;BA.debugLine="If Cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=20840490;
 //BA.debugLineNum = 20840490;BA.debugLine="ToastMessageShow(\"جدول تسویه حساب به درستی دریاف";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("جدول تسویه حساب به درستی دریافت نشده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20840491;
 //BA.debugLineNum = 20840491;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20840494;
 //BA.debugLineNum = 20840494;BA.debugLine="MCode.Action=\"SabtFaktor\"";
mostCurrent._mcode._action /*String*/  = "SabtFaktor";
RDebugUtils.currentLine=20840495;
 //BA.debugLineNum = 20840495;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
RDebugUtils.currentLine=20840496;
 //BA.debugLineNum = 20840496;BA.debugLine="End Sub";
return "";
}
public static String  _receiver_receive(boolean _firsttime,anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="gpswiget";
if (Debug.shouldDelegate(processBA, "receiver_receive", false))
	 {return ((String) Debug.delegate(processBA, "receiver_receive", new Object[] {_firsttime,_startingintent}));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="rv = ConfigureHomeWidget(\"L2\", \"rv\", 30, \"Parsik";
_rv = anywheresoftware.b4a.objects.RemoteViewsWrapper.createRemoteViews(processBA, R.layout.gpswiget_layout, "L2","rv");
 };
RDebugUtils.currentLine=20447237;
 //BA.debugLineNum = 20447237;BA.debugLine="MCode.widgetEnable=rv.HandleWidgetEvents(Starting";
mostCurrent._mcode._widgetenable /*boolean*/  = _rv.HandleWidgetEvents(processBA,(android.content.Intent)(_startingintent.getObject()));
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="Log(\"recever\")";
anywheresoftware.b4a.keywords.Common.LogImpl("520447238","recever",0);
RDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
_jobinternet._initialize /*String*/ (null,processBA,"jobInternet",gpswiget.getObject());
RDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="jobInternet.GetRequest.Timeout=50000";
_jobinternet._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=20447241;
 //BA.debugLineNum = 20447241;BA.debugLine="t1.Initialize(\"t1\", 10000)";
_t1.Initialize(processBA,"t1",(long) (10000));
RDebugUtils.currentLine=20447242;
 //BA.debugLineNum = 20447242;BA.debugLine="t1.Enabled = True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20447243;
 //BA.debugLineNum = 20447243;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now+";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+1000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20447244;
 //BA.debugLineNum = 20447244;BA.debugLine="End Sub";
return "";
}
public static String  _rv_requestupdate() throws Exception{
RDebugUtils.currentModule="gpswiget";
if (Debug.shouldDelegate(processBA, "rv_requestupdate", false))
	 {return ((String) Debug.delegate(processBA, "rv_requestupdate", null));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Private Sub rv_RequestUpdate";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="t1.Initialize(\"t1\", 10000)";
_t1.Initialize(processBA,"t1",(long) (10000));
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="t1.Enabled = True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643843;
 //BA.debugLineNum = 20643843;BA.debugLine="Log(\"UpdateWidget2\")";
anywheresoftware.b4a.keywords.Common.LogImpl("520643843","UpdateWidget2",0);
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now+";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+1000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643845;
 //BA.debugLineNum = 20643845;BA.debugLine="End Sub";
return "";
}
public static String  _sendgps(String _str) throws Exception{
RDebugUtils.currentModule="gpswiget";
if (Debug.shouldDelegate(processBA, "sendgps", false))
	 {return ((String) Debug.delegate(processBA, "sendgps", new Object[] {_str}));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Sub SendGps(Str As String)";
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="jobInternet.JobName =\"SendGps\"";
_jobinternet._jobname /*String*/  = "SendGps";
RDebugUtils.currentLine=20578310;
 //BA.debugLineNum = 20578310;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
_jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/SaveGps","JsonDt="+_str+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=20578311;
 //BA.debugLineNum = 20578311;BA.debugLine="End Sub";
return "";
}
public static String  _t1_tick() throws Exception{
RDebugUtils.currentModule="gpswiget";
if (Debug.shouldDelegate(processBA, "t1_tick", false))
	 {return ((String) Debug.delegate(processBA, "t1_tick", null));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Sub t1_Tick";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="rv.SetText(\"Label2\", Application.LabelName)";
_rv.SetText(processBA,"Label2",BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Application.getLabelName()));
RDebugUtils.currentLine=20512778;
 //BA.debugLineNum = 20512778;BA.debugLine="rv.SetText(\"Label3\",\"طول جغرافیایی : \"& MCode.fus";
_rv.SetText(processBA,"Label3",BA.ObjectToCharSequence("طول جغرافیایی : "+mostCurrent._mcode._fuslat /*String*/ ));
RDebugUtils.currentLine=20512779;
 //BA.debugLineNum = 20512779;BA.debugLine="rv.SetText(\"Label7\",\"عرض جغرافیایی : \"& MCode.fus";
_rv.SetText(processBA,"Label7",BA.ObjectToCharSequence("عرض جغرافیایی : "+mostCurrent._mcode._fuslon /*String*/ ));
RDebugUtils.currentLine=20512781;
 //BA.debugLineNum = 20512781;BA.debugLine="rv.SetText(\"Label6\",\"آخرین ساعت ارسال موقعیت : \"";
_rv.SetText(processBA,"Label6",BA.ObjectToCharSequence("آخرین ساعت ارسال موقعیت : "+mostCurrent._mcode._fusgettime /*String*/ ));
RDebugUtils.currentLine=20512783;
 //BA.debugLineNum = 20512783;BA.debugLine="Log(\"SendGps\")";
anywheresoftware.b4a.keywords.Common.LogImpl("520512783","SendGps",0);
RDebugUtils.currentLine=20512785;
 //BA.debugLineNum = 20512785;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now+";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+1000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20512786;
 //BA.debugLineNum = 20512786;BA.debugLine="rv.UpdateWidget";
_rv.UpdateWidget(processBA);
RDebugUtils.currentLine=20512788;
 //BA.debugLineNum = 20512788;BA.debugLine="Log(\"UpdateWidget1\")";
anywheresoftware.b4a.keywords.Common.LogImpl("520512788","UpdateWidget1",0);
RDebugUtils.currentLine=20512789;
 //BA.debugLineNum = 20512789;BA.debugLine="End Sub";
return "";
}
}