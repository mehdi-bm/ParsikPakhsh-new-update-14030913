package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_settingpos_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_settingpos) ","act_settingpos",49,act_settingpos.mostCurrent.activityBA,act_settingpos.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_settingpos.remoteMe.runUserSub(false, "act_settingpos","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"l_settingPos\")";
Debug.ShouldStop(524288);
act_settingpos.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_settingPos")),act_settingpos.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_settingpos) ","act_settingpos",49,act_settingpos.mostCurrent.activityBA,act_settingpos.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_settingpos.remoteMe.runUserSub(false, "act_settingpos","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_settingpos) ","act_settingpos",49,act_settingpos.mostCurrent.activityBA,act_settingpos.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_settingpos.remoteMe.runUserSub(false, "act_settingpos","activity_resume");}
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}