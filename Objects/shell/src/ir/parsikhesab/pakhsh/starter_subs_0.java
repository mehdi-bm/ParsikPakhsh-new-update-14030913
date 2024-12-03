package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",101,starter.processBA,starter.mostCurrent,47);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 47;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.runVoidMethod ("StartServiceAt",starter.processBA,(Object)((starter.mostCurrent._fusedlocationservice.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {starter.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(3000)}, "+",1, 2)),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 50;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _closeactivities() throws Exception{
try {
		Debug.PushSubsStack("CloseActivities (starter) ","starter",101,starter.processBA,starter.mostCurrent,63);
if (RapidSub.canDelegate("closeactivities")) { return ir.parsikhesab.pakhsh.starter.remoteMe.runUserSub(false, "starter","closeactivities");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 63;BA.debugLine="Sub CloseActivities";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(-2147483648);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 65;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(1);
_jo.runVoidMethod ("InitializeContext",starter.processBA);
 BA.debugLineNum = 66;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
Debug.ShouldStop(2);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("finishAffinity")),(Object)((starter.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
 //BA.debugLineNum = 7;BA.debugLine="Public SharedFolder As String";
starter._sharedfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Public shared As String";
starter._shared = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Public rp As RuntimePermissions";
starter._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 10;BA.debugLine="Public PhoneEvent1 As PhoneEvents";
starter._phoneevent1 = RemoteObject.createNew ("anywheresoftware.b4a.phone.PhoneEvents");
 //BA.debugLineNum = 12;BA.debugLine="Dim t1 As Timer";
starter._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _receiver2_onreceive(RemoteObject _action,RemoteObject _keys,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("receiver2_OnReceive (starter) ","starter",101,starter.processBA,starter.mostCurrent,37);
if (RapidSub.canDelegate("receiver2_onreceive")) { return ir.parsikhesab.pakhsh.starter.remoteMe.runUserSub(false, "starter","receiver2_onreceive", _action, _keys, _data);}
Debug.locals.put("Action", _action);
Debug.locals.put("keys", _keys);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 37;BA.debugLine="Private Sub receiver2_OnReceive(Action As String,k";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Log(Action)";
Debug.ShouldStop(32);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","5121044993",_action,0);
 BA.debugLineNum = 39;BA.debugLine="Log(Data)";
Debug.ShouldStop(64);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","5121044994",BA.ObjectToString(_data),0);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Service_Create (starter) ","starter",101,starter.processBA,starter.mostCurrent,15);
if (RapidSub.canDelegate("service_create")) { return ir.parsikhesab.pakhsh.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 15;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(16384);
 BA.debugLineNum = 18;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"shared\")";
Debug.ShouldStop(131072);
starter._shared = starter._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("shared")));
 BA.debugLineNum = 19;BA.debugLine="SharedFolder=File.DirInternalCache";
Debug.ShouldStop(262144);
starter._sharedfolder = starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache");
 BA.debugLineNum = 20;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now";
Debug.ShouldStop(524288);
starter.mostCurrent.__c.runVoidMethod ("StartServiceAt",starter.processBA,(Object)((starter.mostCurrent._fusedlocationservice.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {starter.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(3000)}, "+",1, 2)),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 22;BA.debugLine="Service.AutomaticForegroundMode=1";
Debug.ShouldStop(2097152);
starter.mostCurrent._service.setField ("AutomaticForegroundMode",BA.numberCast(int.class, 1));
 BA.debugLineNum = 24;BA.debugLine="StartServiceAt(Service_Helper,DateTime.Now + 1000";
Debug.ShouldStop(8388608);
starter.mostCurrent.__c.runVoidMethod ("StartServiceAt",starter.processBA,(Object)((starter.mostCurrent._service_helper.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {starter.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(10000)}, "+",1, 2)),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",101,starter.processBA,starter.mostCurrent,56);
if (RapidSub.canDelegate("service_destroy")) { return ir.parsikhesab.pakhsh.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 56;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="Log(\"شکستن\")";
Debug.ShouldStop(33554432);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","5121241602",RemoteObject.createImmutable("شکستن"),0);
 BA.debugLineNum = 59;BA.debugLine="CloseActivities";
Debug.ShouldStop(67108864);
_closeactivities();
 BA.debugLineNum = 60;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now";
Debug.ShouldStop(134217728);
starter.mostCurrent.__c.runVoidMethod ("StartServiceAt",starter.processBA,(Object)((starter.mostCurrent._fusedlocationservice.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {starter.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(3000)}, "+",1, 2)),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Service_Start (starter) ","starter",101,starter.processBA,starter.mostCurrent,28);
if (RapidSub.canDelegate("service_start")) { return ir.parsikhesab.pakhsh.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 28;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",101,starter.processBA,starter.mostCurrent,42);
if (RapidSub.canDelegate("service_taskremoved")) { return ir.parsikhesab.pakhsh.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");}
 BA.debugLineNum = 42;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}