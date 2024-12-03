package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class fusedlocationservice_subs_0 {


public static RemoteObject  _createnotification(RemoteObject _body) throws Exception{
try {
		Debug.PushSubsStack("CreateNotification (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,209);
if (RapidSub.canDelegate("createnotification")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","createnotification", _body);}
RemoteObject _notification = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
Debug.locals.put("Body", _body);
 BA.debugLineNum = 209;BA.debugLine="Sub CreateNotification (Body As String) As Notific";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim notification As Notification";
Debug.ShouldStop(131072);
_notification = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");Debug.locals.put("notification", _notification);
 BA.debugLineNum = 211;BA.debugLine="notification.Initialize2(notification.IMPORTANCE_";
Debug.ShouldStop(262144);
_notification.runVoidMethod ("Initialize2",(Object)(_notification.getField(true,"IMPORTANCE_LOW")));
 BA.debugLineNum = 212;BA.debugLine="notification.Icon = \"icon\"";
Debug.ShouldStop(524288);
_notification.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 213;BA.debugLine="notification.Sound=False";
Debug.ShouldStop(1048576);
_notification.runVoidMethod ("setSound",fusedlocationservice.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 214;BA.debugLine="notification.Vibrate=False";
Debug.ShouldStop(2097152);
_notification.runVoidMethod ("setVibrate",fusedlocationservice.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 215;BA.debugLine="notification.SetInfo(\"Tracking location\", Body, M";
Debug.ShouldStop(4194304);
_notification.runVoidMethod ("SetInfoNew",fusedlocationservice.processBA,(Object)(BA.ObjectToCharSequence("Tracking location")),(Object)(BA.ObjectToCharSequence(_body)),(Object)((fusedlocationservice.mostCurrent._main.getObject())));
 BA.debugLineNum = 216;BA.debugLine="Return notification";
Debug.ShouldStop(8388608);
if (true) return _notification;
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _definefused() throws Exception{
try {
		Debug.PushSubsStack("DefineFused (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,74);
if (RapidSub.canDelegate("definefused")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","definefused");}
RemoteObject _locationrequest1 = RemoteObject.declareNull("igolub.fused.b4a.location.LocationRequestWrapper");
 BA.debugLineNum = 74;BA.debugLine="Private Sub DefineFused";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="If Fused.IsLocationEnabledInSettings Then";
Debug.ShouldStop(1024);
if (fusedlocationservice._fused.runMethod(true,"getIsLocationEnabledInSettings").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="Fused.GetLocationAvailability";
Debug.ShouldStop(2048);
fusedlocationservice._fused.runVoidMethod ("GetLocationAvailability");
 BA.debugLineNum = 77;BA.debugLine="inc=Interval";
Debug.ShouldStop(4096);
fusedlocationservice._inc = BA.numberCast(long.class, _interval());
 BA.debugLineNum = 96;BA.debugLine="Dim LocationRequest1 As LocationRequest";
Debug.ShouldStop(-2147483648);
_locationrequest1 = RemoteObject.createNew ("igolub.fused.b4a.location.LocationRequestWrapper");Debug.locals.put("LocationRequest1", _locationrequest1);
 BA.debugLineNum = 97;BA.debugLine="LocationRequest1.Initialize(inc) 'Refresh interv";
Debug.ShouldStop(1);
_locationrequest1.runVoidMethod ("Initialize",(Object)(fusedlocationservice._inc));
 BA.debugLineNum = 98;BA.debugLine="LocationRequest1.SetMinUpdateIntervalMillis(inc)";
Debug.ShouldStop(2);
_locationrequest1.runVoidMethod ("SetMinUpdateIntervalMillis",(Object)(fusedlocationservice._inc));
 BA.debugLineNum = 99;BA.debugLine="LocationRequest1.SetPriority(Priority.PRIORITY_H";
Debug.ShouldStop(4);
_locationrequest1.runVoidMethod ("SetPriority",(Object)(fusedlocationservice.mostCurrent._priority.getField(true,"PRIORITY_HIGH_ACCURACY")));
 BA.debugLineNum = 100;BA.debugLine="LocationRequest1.SetMinUpdateDistanceMeters(0) '";
Debug.ShouldStop(8);
_locationrequest1.runVoidMethod ("SetMinUpdateDistanceMeters",(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 101;BA.debugLine="LocationRequest1.SetGranularity(Granularity.GRAN";
Debug.ShouldStop(16);
_locationrequest1.runVoidMethod ("SetGranularity",(Object)(fusedlocationservice.mostCurrent._granularity.getField(true,"GRANULARITY_FINE")));
 BA.debugLineNum = 102;BA.debugLine="Fused.RequestLocationUpdates(LocationRequest1) '";
Debug.ShouldStop(32);
fusedlocationservice._fused.runVoidMethod ("RequestLocationUpdates",(Object)(_locationrequest1));
 }else {
 BA.debugLineNum = 104;BA.debugLine="MsgboxAsync(\"Location is turned off in devices's";
Debug.ShouldStop(128);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Location is turned off in devices's settings. Turn it on.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),fusedlocationservice.processBA);
 BA.debugLineNum = 105;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
Debug.ShouldStop(256);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("StartActivity",fusedlocationservice.processBA,(Object)((fusedlocationservice._fused.runMethod(false,"getLocationSettingsIntent").getObject())));
 };
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fusedlocation_locationavailabilitychanged(RemoteObject _available) throws Exception{
try {
		Debug.PushSubsStack("FusedLocation_LocationAvailabilityChanged (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,144);
if (RapidSub.canDelegate("fusedlocation_locationavailabilitychanged")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","fusedlocation_locationavailabilitychanged", _available);}
Debug.locals.put("Available", _available);
 BA.debugLineNum = 144;BA.debugLine="Private Sub FusedLocation_LocationAvailabilityChan";
Debug.ShouldStop(32768);
 BA.debugLineNum = 147;BA.debugLine="Log(\"LocationAvailabile = \" & Available)";
Debug.ShouldStop(262144);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521626883",RemoteObject.concat(RemoteObject.createImmutable("LocationAvailabile = "),_available),0);
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fusedlocation_locationchanged(RemoteObject _mlocation) throws Exception{
try {
		Debug.PushSubsStack("FusedLocation_LocationChanged (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,150);
if (RapidSub.canDelegate("fusedlocation_locationchanged")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","fusedlocation_locationchanged", _mlocation);}
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
Debug.locals.put("mLocation", _mlocation);
 BA.debugLineNum = 150;BA.debugLine="Private Sub FusedLocation_LocationChanged (mLocati";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 153;BA.debugLine="Lat=mLocation.Latitude";
Debug.ShouldStop(16777216);
fusedlocationservice._lat = BA.NumberToString(_mlocation.runMethod(true,"getLatitude"));
 BA.debugLineNum = 154;BA.debugLine="Lon=mLocation.Longitude";
Debug.ShouldStop(33554432);
fusedlocationservice._lon = BA.NumberToString(_mlocation.runMethod(true,"getLongitude"));
 BA.debugLineNum = 156;BA.debugLine="Log(\"Lat=\" & Lat & CRLF & \"Lon=\" & Lon)";
Debug.ShouldStop(134217728);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521692422",RemoteObject.concat(RemoteObject.createImmutable("Lat="),fusedlocationservice._lat,fusedlocationservice.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Lon="),fusedlocationservice._lon),0);
 BA.debugLineNum = 157;BA.debugLine="Dim n As Notification = CreateNotification($\"${La";
Debug.ShouldStop(268435456);
_n = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");
_n = _createnotification((RemoteObject.concat(RemoteObject.createImmutable(""),fusedlocationservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((fusedlocationservice._lat))),RemoteObject.createImmutable(" / "),fusedlocationservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((fusedlocationservice._lon))),RemoteObject.createImmutable(""))));Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 158;BA.debugLine="n.Notify(nid)";
Debug.ShouldStop(536870912);
_n.runVoidMethod ("Notify",(Object)(fusedlocationservice._nid));
 BA.debugLineNum = 160;BA.debugLine="Tracking=False";
Debug.ShouldStop(-2147483648);
fusedlocationservice._tracking = fusedlocationservice.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 163;BA.debugLine="SaveLocationToDb";
Debug.ShouldStop(4);
_savelocationtodb();
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fusedlocation_locationenabledinsettingschanged(RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("FusedLocation_LocationEnabledInSettingsChanged (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,168);
if (RapidSub.canDelegate("fusedlocation_locationenabledinsettingschanged")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","fusedlocation_locationenabledinsettingschanged", _enabled);}
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 168;BA.debugLine="Private Sub FusedLocation_LocationEnabledInSetting";
Debug.ShouldStop(128);
 BA.debugLineNum = 170;BA.debugLine="Log(\"LocationEnabled = \" & Enabled)";
Debug.ShouldStop(512);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521757954",RemoteObject.concat(RemoteObject.createImmutable("LocationEnabled = "),_enabled),0);
 BA.debugLineNum = 171;BA.debugLine="If Enabled=False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_enabled,fusedlocationservice.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 172;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
Debug.ShouldStop(2048);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("StartActivity",fusedlocationservice.processBA,(Object)((fusedlocationservice._fused.runMethod(false,"getLocationSettingsIntent").getObject())));
 };
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnewgps() throws Exception{
try {
		Debug.PushSubsStack("GetNewGps (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,62);
if (RapidSub.canDelegate("getnewgps")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","getnewgps");}
 BA.debugLineNum = 62;BA.debugLine="Sub GetNewGps()";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Interval (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,127);
if (RapidSub.canDelegate("interval")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","interval");}
 BA.debugLineNum = 127;BA.debugLine="Sub Interval As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 130;BA.debugLine="Return MCode.IntervalGps * 60 * 1000";
Debug.ShouldStop(2);
if (true) return BA.NumberToString(RemoteObject.solve(new RemoteObject[] {fusedlocationservice.mostCurrent._mcode._intervalgps /*RemoteObject*/ ,RemoteObject.createImmutable(60),RemoteObject.createImmutable(1000)}, "**",0, 1));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("JobDone (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,228);
if (RapidSub.canDelegate("jobdone")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","jobdone", _job);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 228;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="Job.GetRequest.Timeout=50000";
Debug.ShouldStop(16);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 231;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(64);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 232;BA.debugLine="Dim Str As String = Job.GetString";
Debug.ShouldStop(128);
_str = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 233;BA.debugLine="Select Case Job.JobName";
Debug.ShouldStop(256);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("SendGps"))) {
case 0: {
 BA.debugLineNum = 235;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 238;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGpsVisitor\")";
Debug.ShouldStop(8192);
fusedlocationservice.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,fusedlocationservice.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGpsVisitor")));
 BA.debugLineNum = 239;BA.debugLine="Log(\"GPS OK\")";
Debug.ShouldStop(16384);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","522020107",RemoteObject.createImmutable("GPS OK"),0);
 };
 BA.debugLineNum = 242;BA.debugLine="tgps.Enabled=True";
Debug.ShouldStop(131072);
fusedlocationservice._tgps.runMethod(true,"setEnabled",fusedlocationservice.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 243;BA.debugLine="Tracking=False";
Debug.ShouldStop(262144);
fusedlocationservice._tracking = fusedlocationservice.mostCurrent.__c.getField(true,"False");
 break; }
}
;
 }else {
 };
 BA.debugLineNum = 248;BA.debugLine="jobInternet.Release";
Debug.ShouldStop(8388608);
fusedlocationservice._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private Fused As FusedLocationProviderClient";
fusedlocationservice._fused = RemoteObject.createNew ("igolub.fused.b4a.location.FusedLocationProviderClientWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Dim jobInternet As HttpJob";
fusedlocationservice._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");
 //BA.debugLineNum = 9;BA.debugLine="Dim tgps ,T_StartStopGps As Timer";
fusedlocationservice._tgps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
fusedlocationservice._t_startstopgps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 10;BA.debugLine="Private Tracking As Boolean";
fusedlocationservice._tracking = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 11;BA.debugLine="Dim GetTime As String";
fusedlocationservice._gettime = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim Lat,Lon As String";
fusedlocationservice._lat = RemoteObject.createImmutable("");
fusedlocationservice._lon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Private nid As Int = 1";
fusedlocationservice._nid = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 15;BA.debugLine="Dim inc As Long=0";
fusedlocationservice._inc = BA.numberCast(long.class, 0);
 //BA.debugLineNum = 16;BA.debugLine="Dim Tracking As Boolean";
fusedlocationservice._tracking = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savelocationtodb() throws Exception{
try {
		Debug.PushSubsStack("SaveLocationToDb (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,175);
if (RapidSub.canDelegate("savelocationtodb")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","savelocationtodb");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _tarikh = RemoteObject.createImmutable("");
RemoteObject _tm = null;
RemoteObject _time = RemoteObject.createImmutable("");
 BA.debugLineNum = 175;BA.debugLine="Sub SaveLocationToDb";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldNoeDat";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = fusedlocationservice.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,fusedlocationservice.processBA,(Object)(RemoteObject.createImmutable("Select FldNoeDate From TblSetting")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 177;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(65536);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 178;BA.debugLine="If Cu.GetString(\"FldNoeDate\") = \"S\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNoeDate"))),BA.ObjectToString("S"))) { 
 BA.debugLineNum = 179;BA.debugLine="Dim Tarikh As String = MCode.DatePersian";
Debug.ShouldStop(262144);
_tarikh = fusedlocationservice.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,fusedlocationservice.processBA);Debug.locals.put("Tarikh", _tarikh);Debug.locals.put("Tarikh", _tarikh);
 }else 
{ BA.debugLineNum = 180;BA.debugLine="else if Cu.GetString(\"FldNoeDate\") = \"M\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNoeDate"))),BA.ObjectToString("M"))) { 
 BA.debugLineNum = 181;BA.debugLine="Dim Tarikh As String = MCode.DateMiladi";
Debug.ShouldStop(1048576);
_tarikh = fusedlocationservice.mostCurrent._mcode.runMethod(true,"_datemiladi" /*RemoteObject*/ ,fusedlocationservice.processBA);Debug.locals.put("Tarikh", _tarikh);Debug.locals.put("Tarikh", _tarikh);
 }}
;
 BA.debugLineNum = 184;BA.debugLine="Dim Tm() As String";
Debug.ShouldStop(8388608);
_tm = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Tm", _tm);
 BA.debugLineNum = 185;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(16777216);
_time = fusedlocationservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(fusedlocationservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 186;BA.debugLine="Tm = Regex.Split(\":\",Time)";
Debug.ShouldStop(33554432);
_tm = fusedlocationservice.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_time));Debug.locals.put("Tm", _tm);
 BA.debugLineNum = 187;BA.debugLine="Time=MCode.ConvertNumbersPersian2English(Tm(0)) &";
Debug.ShouldStop(67108864);
_time = RemoteObject.concat(fusedlocationservice.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,fusedlocationservice.processBA,(Object)(_tm.getArrayElement(true,BA.numberCast(int.class, 0)))),fusedlocationservice.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,fusedlocationservice.processBA,(Object)(_tm.getArrayElement(true,BA.numberCast(int.class, 1)))));Debug.locals.put("Time", _time);
 BA.debugLineNum = 190;BA.debugLine="Log(Lat)";
Debug.ShouldStop(536870912);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521823503",fusedlocationservice._lat,0);
 BA.debugLineNum = 191;BA.debugLine="Log(Lon)";
Debug.ShouldStop(1073741824);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521823504",fusedlocationservice._lon,0);
 BA.debugLineNum = 192;BA.debugLine="If Lat <> \"\" And Lon <> \"\" And IsNumber(MCode.C_V";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",fusedlocationservice._lat,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",fusedlocationservice._lon,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",fusedlocationservice.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(fusedlocationservice.mostCurrent._mcode._c_visitor /*RemoteObject*/ )),fusedlocationservice.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",fusedlocationservice.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_tarikh)),fusedlocationservice.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",fusedlocationservice.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_time)),fusedlocationservice.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 193;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGpsVisitor (Fld";
Debug.ShouldStop(1);
fusedlocationservice.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,fusedlocationservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"),fusedlocationservice.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_tarikh,RemoteObject.createImmutable("','"),_time,RemoteObject.createImmutable("','"),fusedlocationservice._lat,RemoteObject.createImmutable("','"),fusedlocationservice._lon,RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 194;BA.debugLine="GetTime=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(2);
fusedlocationservice._gettime = fusedlocationservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(fusedlocationservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 195;BA.debugLine="MCode.fusLat=Lat";
Debug.ShouldStop(4);
fusedlocationservice.mostCurrent._mcode._fuslat /*RemoteObject*/  = fusedlocationservice._lat;
 BA.debugLineNum = 196;BA.debugLine="MCode.fusLon=Lon";
Debug.ShouldStop(8);
fusedlocationservice.mostCurrent._mcode._fuslon /*RemoteObject*/  = fusedlocationservice._lon;
 BA.debugLineNum = 197;BA.debugLine="MCode.fusGetTime=GetTime";
Debug.ShouldStop(16);
fusedlocationservice.mostCurrent._mcode._fusgettime /*RemoteObject*/  = fusedlocationservice._gettime;
 };
 BA.debugLineNum = 199;BA.debugLine="Lat=\"\"";
Debug.ShouldStop(64);
fusedlocationservice._lat = BA.ObjectToString("");
 BA.debugLineNum = 200;BA.debugLine="Lon=\"\"";
Debug.ShouldStop(128);
fusedlocationservice._lon = BA.ObjectToString("");
 BA.debugLineNum = 202;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(512);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = fusedlocationservice.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,fusedlocationservice.processBA,(Object)(RemoteObject.createImmutable("Select * From TblGpsVisitor")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 203;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 204;BA.debugLine="SendGps(MCode.DtToJson(Cu))";
Debug.ShouldStop(2048);
_sendgps(fusedlocationservice.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,fusedlocationservice.processBA,(Object)(_cu)));
 };
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("SendGps (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,219);
if (RapidSub.canDelegate("sendgps")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","sendgps", _str);}
Debug.locals.put("Str", _str);
 BA.debugLineNum = 219;BA.debugLine="Sub SendGps(Str As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 224;BA.debugLine="jobInternet.JobName =\"SendGps\"";
Debug.ShouldStop(-2147483648);
fusedlocationservice._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendGps"));
 BA.debugLineNum = 225;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(1);
fusedlocationservice._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),fusedlocationservice.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveGps"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("JsonDt="),_str,RemoteObject.createImmutable("&Imei="),fusedlocationservice.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Service_Create (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,19);
if (RapidSub.canDelegate("service_create")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","service_create");}
 BA.debugLineNum = 19;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 21;BA.debugLine="Fused.Initialize(\"FusedLocation\")";
Debug.ShouldStop(1048576);
fusedlocationservice._fused.runVoidMethod ("Initialize",fusedlocationservice.processBA,(Object)(RemoteObject.createImmutable("FusedLocation")));
 BA.debugLineNum = 23;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(4194304);
fusedlocationservice._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,fusedlocationservice.processBA,(Object)(BA.ObjectToString("jobInternet")),(Object)(fusedlocationservice.getObject()));
 BA.debugLineNum = 24;BA.debugLine="jobInternet.GetRequest.Timeout=50000";
Debug.ShouldStop(8388608);
fusedlocationservice._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 25;BA.debugLine="tgps.Initialize(\"tgps\",60000)";
Debug.ShouldStop(16777216);
fusedlocationservice._tgps.runVoidMethod ("Initialize",fusedlocationservice.processBA,(Object)(BA.ObjectToString("tgps")),(Object)(BA.numberCast(long.class, 60000)));
 BA.debugLineNum = 26;BA.debugLine="Tracking=False";
Debug.ShouldStop(33554432);
fusedlocationservice._tracking = fusedlocationservice.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 27;BA.debugLine="Log(\"Gps Create\")";
Debug.ShouldStop(67108864);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521102600",RemoteObject.createImmutable("Gps Create"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",fusedlocationservice.processBA, e9.toString()); BA.debugLineNum = 29;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521102602",BA.ObjectToString(fusedlocationservice.mostCurrent.__c.runMethod(false,"LastException",fusedlocationservice.processBA)),0);
 };
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Service_Destroy (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,134);
if (RapidSub.canDelegate("service_destroy")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","service_destroy");}
 BA.debugLineNum = 134;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="If Tracking Then";
Debug.ShouldStop(64);
if (fusedlocationservice._tracking.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 136;BA.debugLine="Fused.RemoveLocationUpdates";
Debug.ShouldStop(128);
fusedlocationservice._fused.runVoidMethod ("RemoveLocationUpdates");
 };
 BA.debugLineNum = 138;BA.debugLine="Tracking = False";
Debug.ShouldStop(512);
fusedlocationservice._tracking = fusedlocationservice.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 139;BA.debugLine="StartServiceAt(Me,DateTime.Now+1000,True)";
Debug.ShouldStop(1024);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("StartServiceAt",fusedlocationservice.processBA,(Object)(fusedlocationservice.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {fusedlocationservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000)}, "+",1, 2)),(Object)(fusedlocationservice.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 141;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
Debug.ShouldStop(4096);
fusedlocationservice.mostCurrent._service.setField ("AutomaticForegroundMode",fusedlocationservice.mostCurrent._service.getField(true,"AUTOMATIC_FOREGROUND_ALWAYS"));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Service_Start (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,33);
if (RapidSub.canDelegate("service_start")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 33;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Service.StartForeground(nid, CreateNotification(\"";
Debug.ShouldStop(2);
fusedlocationservice.mostCurrent._service.runVoidMethod ("StartForeground",(Object)(fusedlocationservice._nid),(Object)((_createnotification(RemoteObject.createImmutable("...")).getObject())));
 BA.debugLineNum = 37;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(16);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521168132",RemoteObject.createImmutable("Gps Start"),0);
 BA.debugLineNum = 38;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 39;BA.debugLine="Fused.Initialize(\"FusedLocation\")";
Debug.ShouldStop(64);
fusedlocationservice._fused.runVoidMethod ("Initialize",fusedlocationservice.processBA,(Object)(RemoteObject.createImmutable("FusedLocation")));
 BA.debugLineNum = 40;BA.debugLine="If	MCode.ServiceGpsActive=1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",fusedlocationservice.mostCurrent._mcode._servicegpsactive /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 41;BA.debugLine="Log(\"Gps ServiceGpsActive \"& MCode.ServiceGpsAc";
Debug.ShouldStop(256);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521168136",RemoteObject.concat(RemoteObject.createImmutable("Gps ServiceGpsActive "),fusedlocationservice.mostCurrent._mcode._servicegpsactive /*RemoteObject*/ ),0);
 BA.debugLineNum = 42;BA.debugLine="If Fused.IsLocationEnabledInSettings  Then";
Debug.ShouldStop(512);
if (fusedlocationservice._fused.runMethod(true,"getIsLocationEnabledInSettings").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 43;BA.debugLine="Log(\"Gps IsLocationEnabledInSettings\")";
Debug.ShouldStop(1024);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521168138",RemoteObject.createImmutable("Gps IsLocationEnabledInSettings"),0);
 BA.debugLineNum = 44;BA.debugLine="Log(\"Gps Tracking: \"&Tracking)";
Debug.ShouldStop(2048);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521168139",RemoteObject.concat(RemoteObject.createImmutable("Gps Tracking: "),fusedlocationservice._tracking),0);
 BA.debugLineNum = 45;BA.debugLine="If Tracking=False Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",fusedlocationservice._tracking,fusedlocationservice.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 46;BA.debugLine="tgps.Enabled=True";
Debug.ShouldStop(8192);
fusedlocationservice._tgps.runMethod(true,"setEnabled",fusedlocationservice.mostCurrent.__c.getField(true,"True"));
 };
 }else {
 BA.debugLineNum = 49;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کن";
Debug.ShouldStop(65536);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید")),(Object)(fusedlocationservice.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 50;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
Debug.ShouldStop(131072);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("StartActivity",fusedlocationservice.processBA,(Object)((fusedlocationservice._fused.runMethod(false,"getLocationSettingsIntent").getObject())));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",fusedlocationservice.processBA, e19.toString()); BA.debugLineNum = 54;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521168149",BA.ObjectToString(fusedlocationservice.mostCurrent.__c.runMethod(false,"LastException",fusedlocationservice.processBA)),0);
 };
 BA.debugLineNum = 57;BA.debugLine="Service.AutomaticForegroundMode= Service.AUTOMATI";
Debug.ShouldStop(16777216);
fusedlocationservice.mostCurrent._service.setField ("AutomaticForegroundMode",fusedlocationservice.mostCurrent._service.getField(true,"AUTOMATIC_FOREGROUND_ALWAYS"));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("T_StartStopGps_Tick (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,109);
if (RapidSub.canDelegate("t_startstopgps_tick")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","t_startstopgps_tick");}
 BA.debugLineNum = 109;BA.debugLine="Sub T_StartStopGps_Tick";
Debug.ShouldStop(4096);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tgps_tick() throws Exception{
try {
		Debug.PushSubsStack("tgps_Tick (fusedlocationservice) ","fusedlocationservice",7,fusedlocationservice.processBA,fusedlocationservice.mostCurrent,67);
if (RapidSub.canDelegate("tgps_tick")) { return ir.parsikhesab.pakhsh.fusedlocationservice.remoteMe.runUserSub(false, "fusedlocationservice","tgps_tick");}
 BA.debugLineNum = 67;BA.debugLine="Sub tgps_Tick";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Tracking=True";
Debug.ShouldStop(8);
fusedlocationservice._tracking = fusedlocationservice.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 69;BA.debugLine="tgps.Enabled=False";
Debug.ShouldStop(16);
fusedlocationservice._tgps.runMethod(true,"setEnabled",fusedlocationservice.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 70;BA.debugLine="DefineFused";
Debug.ShouldStop(32);
_definefused();
 BA.debugLineNum = 71;BA.debugLine="Log(\"tgps_Tick\")";
Debug.ShouldStop(64);
fusedlocationservice.mostCurrent.__c.runVoidMethod ("LogImpl","521299204",RemoteObject.createImmutable("tgps_Tick"),0);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}