package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tracker_subs_0 {


public static RemoteObject  _gps_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("GPS_LocationChanged (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,87);
if (RapidSub.canDelegate("gps_locationchanged")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","gps_locationchanged", _location1);}
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 87;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="Lat=$\"$2.5{Location1.Latitude}\"$";
Debug.ShouldStop(16777216);
tracker._lat = (RemoteObject.concat(RemoteObject.createImmutable(""),tracker.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.5")),(Object)((_location1.runMethod(true,"getLatitude")))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 90;BA.debugLine="Lon=$\"$2.5{Location1.Longitude}\"$";
Debug.ShouldStop(33554432);
tracker._lon = (RemoteObject.concat(RemoteObject.createImmutable(""),tracker.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.5")),(Object)((_location1.runMethod(true,"getLongitude")))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 95;BA.debugLine="Tracking=False";
Debug.ShouldStop(1073741824);
tracker._tracking = tracker.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _interval() throws Exception{
try {
		Debug.PushSubsStack("Interval (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,27);
if (RapidSub.canDelegate("interval")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","interval");}
 BA.debugLineNum = 27;BA.debugLine="Sub Interval As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Return MCode.IntervalGps * 60 * 1000";
Debug.ShouldStop(134217728);
if (true) return BA.NumberToString(RemoteObject.solve(new RemoteObject[] {tracker.mostCurrent._mcode._intervalgps /*RemoteObject*/ ,RemoteObject.createImmutable(60),RemoteObject.createImmutable(1000)}, "**",0, 1));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,146);
if (RapidSub.canDelegate("jobdone")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","jobdone", _job);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 146;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Job.GetRequest.Timeout=50000";
Debug.ShouldStop(262144);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 149;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1048576);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 150;BA.debugLine="Dim Str As String = Job.GetString";
Debug.ShouldStop(2097152);
_str = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 151;BA.debugLine="Select Case Job.JobName";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("SendGps"))) {
case 0: {
 BA.debugLineNum = 153;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 156;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGpsVisitor\")";
Debug.ShouldStop(134217728);
tracker.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,tracker.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGpsVisitor")));
 BA.debugLineNum = 157;BA.debugLine="Log(\"GPS OK\")";
Debug.ShouldStop(268435456);
tracker.mostCurrent.__c.runVoidMethod ("LogImpl","5123994123",RemoteObject.createImmutable("GPS OK"),0);
 };
 break; }
}
;
 }else {
 };
 BA.debugLineNum = 164;BA.debugLine="jobInternet.Release";
Debug.ShouldStop(8);
tracker._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private nid As Int = 1";
tracker._nid = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 7;BA.debugLine="Private GPS As GPS";
tracker._gps = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 8;BA.debugLine="Private Tracking As Boolean";
tracker._tracking = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 9;BA.debugLine="Private LastUpdateTime As Long";
tracker._lastupdatetime = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 10;BA.debugLine="Private lock As PhoneWakeState";
tracker._lock = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
 //BA.debugLineNum = 11;BA.debugLine="Dim T_Gps,T_StartStopGps As Timer";
tracker._t_gps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
tracker._t_startstopgps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 12;BA.debugLine="Dim jobInternet As HttpJob";
tracker._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");
 //BA.debugLineNum = 13;BA.debugLine="Dim PersianDate As PersianDate";
tracker._persiandate = RemoteObject.createNew ("anywheresoftware.b4a.student.PersianDate");
 //BA.debugLineNum = 14;BA.debugLine="Dim GetTime,Lat,Lon As String";
tracker._gettime = RemoteObject.createImmutable("");
tracker._lat = RemoteObject.createImmutable("");
tracker._lon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim C_Visitor As String";
tracker._c_visitor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savelocationtodb() throws Exception{
try {
		Debug.PushSubsStack("SaveLocationToDb (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,112);
if (RapidSub.canDelegate("savelocationtodb")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","savelocationtodb");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _tarikh = RemoteObject.createImmutable("");
RemoteObject _tm = null;
RemoteObject _time = RemoteObject.createImmutable("");
 BA.debugLineNum = 112;BA.debugLine="Sub SaveLocationToDb";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldNoeDat";
Debug.ShouldStop(65536);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = tracker.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,tracker.processBA,(Object)(RemoteObject.createImmutable("Select FldNoeDate From TblSetting")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 114;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(131072);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 115;BA.debugLine="If Cu.GetString(\"FldNoeDate\") = \"S\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNoeDate"))),BA.ObjectToString("S"))) { 
 BA.debugLineNum = 116;BA.debugLine="Dim Tarikh As String =MCode.DatePersian";
Debug.ShouldStop(524288);
_tarikh = tracker.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,tracker.processBA);Debug.locals.put("Tarikh", _tarikh);Debug.locals.put("Tarikh", _tarikh);
 }else 
{ BA.debugLineNum = 117;BA.debugLine="else if Cu.GetString(\"FldNoeDate\") = \"M\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNoeDate"))),BA.ObjectToString("M"))) { 
 BA.debugLineNum = 118;BA.debugLine="Dim Tarikh As String =MCode.DateMiladi";
Debug.ShouldStop(2097152);
_tarikh = tracker.mostCurrent._mcode.runMethod(true,"_datemiladi" /*RemoteObject*/ ,tracker.processBA);Debug.locals.put("Tarikh", _tarikh);Debug.locals.put("Tarikh", _tarikh);
 }}
;
 BA.debugLineNum = 121;BA.debugLine="Dim Tm() As String";
Debug.ShouldStop(16777216);
_tm = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Tm", _tm);
 BA.debugLineNum = 122;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(33554432);
_time = tracker.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(tracker.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 123;BA.debugLine="Tm = Regex.Split(\":\",Time)";
Debug.ShouldStop(67108864);
_tm = tracker.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_time));Debug.locals.put("Tm", _tm);
 BA.debugLineNum = 124;BA.debugLine="Time=MCode.ConvertNumbersPersian2English(Tm(0)) &";
Debug.ShouldStop(134217728);
_time = RemoteObject.concat(tracker.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,tracker.processBA,(Object)(_tm.getArrayElement(true,BA.numberCast(int.class, 0)))),tracker.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,tracker.processBA,(Object)(_tm.getArrayElement(true,BA.numberCast(int.class, 1)))));Debug.locals.put("Time", _time);
 BA.debugLineNum = 127;BA.debugLine="Log(Lat)";
Debug.ShouldStop(1073741824);
tracker.mostCurrent.__c.runVoidMethod ("LogImpl","5123863055",tracker._lat,0);
 BA.debugLineNum = 128;BA.debugLine="If Lat <> \"\" And Lon <> \"\" And IsNumber(C_Visitor";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",tracker._lat,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",tracker._lon,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",tracker.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(tracker._c_visitor)),tracker.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",tracker.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_tarikh)),tracker.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",tracker.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_time)),tracker.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 129;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGpsVisitor (Fld";
Debug.ShouldStop(1);
tracker.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,tracker.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"),tracker._c_visitor,RemoteObject.createImmutable("','"),_tarikh,RemoteObject.createImmutable("','"),_time,RemoteObject.createImmutable("','"),tracker._lat,RemoteObject.createImmutable("','"),tracker._lon,RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 130;BA.debugLine="GetTime=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(2);
tracker._gettime = tracker.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(tracker.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 };
 BA.debugLineNum = 132;BA.debugLine="Lat=\"\"";
Debug.ShouldStop(8);
tracker._lat = BA.ObjectToString("");
 BA.debugLineNum = 133;BA.debugLine="Lon=\"\"";
Debug.ShouldStop(16);
tracker._lon = BA.ObjectToString("");
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendgps(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("SendGps (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,137);
if (RapidSub.canDelegate("sendgps")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","sendgps", _str);}
Debug.locals.put("Str", _str);
 BA.debugLineNum = 137;BA.debugLine="Sub SendGps(Str As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 142;BA.debugLine="jobInternet.JobName =\"SendGps\"";
Debug.ShouldStop(8192);
tracker._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendGps"));
 BA.debugLineNum = 143;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(16384);
tracker._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),tracker.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveGps"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("JsonDt="),_str,RemoteObject.createImmutable("&Imei="),tracker.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,18);
if (RapidSub.canDelegate("service_create")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","service_create");}
 BA.debugLineNum = 18;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="GPS.Initialize(\"gps\")";
Debug.ShouldStop(524288);
tracker._gps.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("gps")));
 BA.debugLineNum = 21;BA.debugLine="T_Gps.Initialize(\"T_Gps\",60000)";
Debug.ShouldStop(1048576);
tracker._t_gps.runVoidMethod ("Initialize",tracker.processBA,(Object)(BA.ObjectToString("T_Gps")),(Object)(BA.numberCast(long.class, 60000)));
 BA.debugLineNum = 22;BA.debugLine="T_StartStopGps.Initialize(\"T_StartStopGps\",Interv";
Debug.ShouldStop(2097152);
tracker._t_startstopgps.runVoidMethod ("Initialize",tracker.processBA,(Object)(BA.ObjectToString("T_StartStopGps")),(Object)(BA.numberCast(long.class, _interval())));
 BA.debugLineNum = 23;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(4194304);
tracker._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,tracker.processBA,(Object)(BA.ObjectToString("jobInternet")),(Object)(tracker.getObject()));
 BA.debugLineNum = 24;BA.debugLine="lock.PartialLock";
Debug.ShouldStop(8388608);
tracker._lock.runVoidMethod ("PartialLock",tracker.processBA);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,177);
if (RapidSub.canDelegate("service_destroy")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","service_destroy");}
 BA.debugLineNum = 177;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="If Tracking Then";
Debug.ShouldStop(131072);
if (tracker._tracking.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="GPS.Stop";
Debug.ShouldStop(262144);
tracker._gps.runVoidMethod ("Stop");
 };
 BA.debugLineNum = 181;BA.debugLine="Tracking = False";
Debug.ShouldStop(1048576);
tracker._tracking = tracker.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 182;BA.debugLine="lock.ReleasePartialLock";
Debug.ShouldStop(2097152);
tracker._lock.runVoidMethod ("ReleasePartialLock");
 BA.debugLineNum = 183;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
Debug.ShouldStop(4194304);
tracker.mostCurrent._service.setField ("AutomaticForegroundMode",tracker.mostCurrent._service.getField(true,"AUTOMATIC_FOREGROUND_ALWAYS"));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,31);
if (RapidSub.canDelegate("service_start")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 31;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="If MCode.Gps=1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",tracker.mostCurrent._mcode._gps /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 34;BA.debugLine="Track";
Debug.ShouldStop(2);
_track();
 };
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_gps_tick() throws Exception{
try {
		Debug.PushSubsStack("T_Gps_Tick (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,99);
if (RapidSub.canDelegate("t_gps_tick")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","t_gps_tick");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 99;BA.debugLine="Sub T_Gps_Tick";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 101;BA.debugLine="SaveLocationToDb";
Debug.ShouldStop(16);
_savelocationtodb();
 BA.debugLineNum = 103;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(64);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = tracker.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,tracker.processBA,(Object)(RemoteObject.createImmutable("Select * From TblGpsVisitor")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 104;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 105;BA.debugLine="SendGps(MCode.DtToJson(Cu))";
Debug.ShouldStop(256);
_sendgps(tracker.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,tracker.processBA,(Object)(_cu)));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",tracker.processBA, e8.toString()); BA.debugLineNum = 108;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
tracker.mostCurrent.__c.runVoidMethod ("LogImpl","5123797513",BA.ObjectToString(tracker.mostCurrent.__c.runMethod(false,"LastException",tracker.processBA)),0);
 };
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_startstopgps_tick() throws Exception{
try {
		Debug.PushSubsStack("T_StartStopGps_Tick (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,68);
if (RapidSub.canDelegate("t_startstopgps_tick")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","t_startstopgps_tick");}
 BA.debugLineNum = 68;BA.debugLine="Sub T_StartStopGps_Tick";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 70;BA.debugLine="If GPS.GPSEnabled = True Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",tracker._gps.runMethod(true,"getGPSEnabled"),tracker.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 72;BA.debugLine="If Tracking Then Return";
Debug.ShouldStop(128);
if (tracker._tracking.<Boolean>get().booleanValue()) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 73;BA.debugLine="If Starter.rp.Check(Starter.rp.PERMISSION_ACCES";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",tracker.mostCurrent._starter._rp /*RemoteObject*/ .runMethod(true,"Check",(Object)(tracker.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION"))),tracker.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 74;BA.debugLine="Log(\"No permission\")";
Debug.ShouldStop(512);
tracker.mostCurrent.__c.runVoidMethod ("LogImpl","5123666438",RemoteObject.createImmutable("No permission"),0);
 BA.debugLineNum = 75;BA.debugLine="Return";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 77;BA.debugLine="GPS.Start(0, 0)";
Debug.ShouldStop(4096);
tracker._gps.runVoidMethodAndSync ("Start",tracker.processBA,(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 78;BA.debugLine="Tracking = True";
Debug.ShouldStop(8192);
tracker._tracking = tracker.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 80;BA.debugLine="GPS.Stop";
Debug.ShouldStop(32768);
tracker._gps.runVoidMethod ("Stop");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",tracker.processBA, e14.toString()); BA.debugLineNum = 83;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
tracker.mostCurrent.__c.runVoidMethod ("LogImpl","5123666447",BA.ObjectToString(tracker.mostCurrent.__c.runMethod(false,"LastException",tracker.processBA)),0);
 };
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _track() throws Exception{
try {
		Debug.PushSubsStack("Track (tracker) ","tracker",103,tracker.processBA,tracker.mostCurrent,39);
if (RapidSub.canDelegate("track")) { return ir.parsikhesab.pakhsh.tracker.remoteMe.runUserSub(false, "tracker","track");}
 BA.debugLineNum = 39;BA.debugLine="Public Sub Track";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If	MCode.ServiceGpsActive=1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",tracker.mostCurrent._mcode._servicegpsactive /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 41;BA.debugLine="If GPS.GPSEnabled=True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",tracker._gps.runMethod(true,"getGPSEnabled"),tracker.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 42;BA.debugLine="T_StartStopGps_Tick";
Debug.ShouldStop(512);
_t_startstopgps_tick();
 BA.debugLineNum = 45;BA.debugLine="C_Visitor = MCode.C_Visitor";
Debug.ShouldStop(4096);
tracker._c_visitor = tracker.mostCurrent._mcode._c_visitor /*RemoteObject*/ ;
 BA.debugLineNum = 47;BA.debugLine="T_StartStopGps.Enabled=True";
Debug.ShouldStop(16384);
tracker._t_startstopgps.runMethod(true,"setEnabled",tracker.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="T_Gps.Enabled=True";
Debug.ShouldStop(32768);
tracker._t_gps.runMethod(true,"setEnabled",tracker.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 50;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کنی";
Debug.ShouldStop(131072);
tracker.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید")),(Object)(tracker.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 51;BA.debugLine="StartActivity(GPS.LocationSettingsIntent)";
Debug.ShouldStop(262144);
tracker.mostCurrent.__c.runVoidMethod ("StartActivity",tracker.processBA,(Object)((tracker._gps.runMethod(false,"getLocationSettingsIntent"))));
 };
 }else {
 BA.debugLineNum = 54;BA.debugLine="If GPS.GPSEnabled=True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",tracker._gps.runMethod(true,"getGPSEnabled"),tracker.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 55;BA.debugLine="T_StartStopGps_Tick";
Debug.ShouldStop(4194304);
_t_startstopgps_tick();
 BA.debugLineNum = 58;BA.debugLine="C_Visitor = MCode.C_Visitor";
Debug.ShouldStop(33554432);
tracker._c_visitor = tracker.mostCurrent._mcode._c_visitor /*RemoteObject*/ ;
 BA.debugLineNum = 60;BA.debugLine="T_StartStopGps.Enabled=True";
Debug.ShouldStop(134217728);
tracker._t_startstopgps.runMethod(true,"setEnabled",tracker.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 61;BA.debugLine="T_Gps.Enabled=True";
Debug.ShouldStop(268435456);
tracker._t_gps.runMethod(true,"setEnabled",tracker.mostCurrent.__c.getField(true,"True"));
 };
 };
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}