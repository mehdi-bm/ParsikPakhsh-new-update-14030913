package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class service_helper_subs_0 {


public static RemoteObject  _checkvaziat() throws Exception{
try {
		Debug.PushSubsStack("CheckVaziat (service_helper) ","service_helper",8,service_helper.processBA,service_helper.mostCurrent,39);
if (RapidSub.canDelegate("checkvaziat")) { return ir.parsikhesab.pakhsh.service_helper.remoteMe.runUserSub(false, "service_helper","checkvaziat");}
 BA.debugLineNum = 39;BA.debugLine="Sub CheckVaziat";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Log(\"CheckVaziat\")";
Debug.ShouldStop(128);
service_helper.mostCurrent.__c.runVoidMethod ("LogImpl","522347777",RemoteObject.createImmutable("CheckVaziat"),0);
 BA.debugLineNum = 41;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(256);
if (service_helper.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,service_helper.processBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 42;BA.debugLine="MCode.NoeGet=\"GetVaziat\"";
Debug.ShouldStop(512);
service_helper.mostCurrent._mcode._noeget /*RemoteObject*/  = BA.ObjectToString("GetVaziat");
 BA.debugLineNum = 43;BA.debugLine="StartService(Service_Server)";
Debug.ShouldStop(1024);
service_helper.mostCurrent.__c.runVoidMethod ("StartService",service_helper.processBA,(Object)((service_helper.mostCurrent._service_server.getObject())));
 };
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim t1 As Timer";
service_helper._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savetourvisit() throws Exception{
try {
		Debug.PushSubsStack("SaveTourVisit (service_helper) ","service_helper",8,service_helper.processBA,service_helper.mostCurrent,47);
if (RapidSub.canDelegate("savetourvisit")) { return ir.parsikhesab.pakhsh.service_helper.remoteMe.runUserSub(false, "service_helper","savetourvisit");}
 BA.debugLineNum = 47;BA.debugLine="Sub SaveTourVisit";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Log(\"SaveTourVisit\")";
Debug.ShouldStop(32768);
service_helper.mostCurrent.__c.runVoidMethod ("LogImpl","522413313",RemoteObject.createImmutable("SaveTourVisit"),0);
 BA.debugLineNum = 49;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(65536);
if (service_helper.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,service_helper.processBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 50;BA.debugLine="MCode.NoeGet=\"SaveTourVisit\"";
Debug.ShouldStop(131072);
service_helper.mostCurrent._mcode._noeget /*RemoteObject*/  = BA.ObjectToString("SaveTourVisit");
 BA.debugLineNum = 51;BA.debugLine="StartService(Service_Server)";
Debug.ShouldStop(262144);
service_helper.mostCurrent.__c.runVoidMethod ("StartService",service_helper.processBA,(Object)((service_helper.mostCurrent._service_server.getObject())));
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Service_Create (service_helper) ","service_helper",8,service_helper.processBA,service_helper.mostCurrent,13);
if (RapidSub.canDelegate("service_create")) { return ir.parsikhesab.pakhsh.service_helper.remoteMe.runUserSub(false, "service_helper","service_create");}
 BA.debugLineNum = 13;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="t1.Initialize(\"t1\",10000)";
Debug.ShouldStop(8192);
service_helper._t1.runVoidMethod ("Initialize",service_helper.processBA,(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 10000)));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Service_Destroy (service_helper) ","service_helper",8,service_helper.processBA,service_helper.mostCurrent,55);
if (RapidSub.canDelegate("service_destroy")) { return ir.parsikhesab.pakhsh.service_helper.remoteMe.runUserSub(false, "service_helper","service_destroy");}
 BA.debugLineNum = 55;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Service_Start (service_helper) ","service_helper",8,service_helper.processBA,service_helper.mostCurrent,18);
if (RapidSub.canDelegate("service_start")) { return ir.parsikhesab.pakhsh.service_helper.remoteMe.runUserSub(false, "service_helper","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 18;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 21;BA.debugLine="Service.AutomaticForegroundMode= Service.AUTOMATI";
Debug.ShouldStop(1048576);
service_helper.mostCurrent._service.setField ("AutomaticForegroundMode",service_helper.mostCurrent._service.getField(true,"AUTOMATIC_FOREGROUND_ALWAYS"));
 BA.debugLineNum = 23;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(4194304);
service_helper._t1.runMethod(true,"setEnabled",service_helper.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t1_tick() throws Exception{
try {
		Debug.PushSubsStack("t1_Tick (service_helper) ","service_helper",8,service_helper.processBA,service_helper.mostCurrent,26);
if (RapidSub.canDelegate("t1_tick")) { return ir.parsikhesab.pakhsh.service_helper.remoteMe.runUserSub(false, "service_helper","t1_tick");}
 BA.debugLineNum = 26;BA.debugLine="Sub t1_Tick";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Log(\"GetDataStatus= \"&MCode.GetDataStatus)";
Debug.ShouldStop(67108864);
service_helper.mostCurrent.__c.runVoidMethod ("LogImpl","522282241",RemoteObject.concat(RemoteObject.createImmutable("GetDataStatus= "),service_helper.mostCurrent._mcode._getdatastatus /*RemoteObject*/ ),0);
 BA.debugLineNum = 28;BA.debugLine="If MCode.GetDataStatus Then";
Debug.ShouldStop(134217728);
if (service_helper.mostCurrent._mcode._getdatastatus /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 29;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(268435456);
service_helper._t1.runMethod(true,"setEnabled",service_helper.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 30;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 32;BA.debugLine="CheckVaziat";
Debug.ShouldStop(-2147483648);
_checkvaziat();
 BA.debugLineNum = 33;BA.debugLine="If MCode.Vaziat=1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",service_helper.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 34;BA.debugLine="SaveTourVisit";
Debug.ShouldStop(2);
_savetourvisit();
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
}