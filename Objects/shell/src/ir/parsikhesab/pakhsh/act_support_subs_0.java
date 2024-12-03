package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_support_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_support) ","act_support",51,act_support.mostCurrent.activityBA,act_support.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_support.remoteMe.runUserSub(false, "act_support","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"L_Postibani\")";
Debug.ShouldStop(16777216);
act_support.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Postibani")),act_support.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="tel1=\"02188658058\"";
Debug.ShouldStop(33554432);
act_support.mostCurrent._tel1 = BA.ObjectToString("02188658058");
 BA.debugLineNum = 27;BA.debugLine="tel2=\"09336999395\"";
Debug.ShouldStop(67108864);
act_support.mostCurrent._tel2 = BA.ObjectToString("09336999395");
 BA.debugLineNum = 28;BA.debugLine="site=\"www.Parsikhesab.com\"";
Debug.ShouldStop(134217728);
act_support.mostCurrent._site = BA.ObjectToString("www.Parsikhesab.com");
 BA.debugLineNum = 29;BA.debugLine="LblNum1.Text=tel1";
Debug.ShouldStop(268435456);
act_support.mostCurrent._lblnum1.runMethod(true,"setText",BA.ObjectToCharSequence(act_support.mostCurrent._tel1));
 BA.debugLineNum = 30;BA.debugLine="LblNum2.Text=tel2";
Debug.ShouldStop(536870912);
act_support.mostCurrent._lblnum2.runMethod(true,"setText",BA.ObjectToCharSequence(act_support.mostCurrent._tel2));
 BA.debugLineNum = 31;BA.debugLine="LblSite.Text=site";
Debug.ShouldStop(1073741824);
act_support.mostCurrent._lblsite.runMethod(true,"setText",BA.ObjectToCharSequence(act_support.mostCurrent._site));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Pause (act_support) ","act_support",51,act_support.mostCurrent.activityBA,act_support.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_support.remoteMe.runUserSub(false, "act_support","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_support) ","act_support",51,act_support.mostCurrent.activityBA,act_support.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_support.remoteMe.runUserSub(false, "act_support","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_back_click() throws Exception{
try {
		Debug.PushSubsStack("btn_back_Click (act_support) ","act_support",51,act_support.mostCurrent.activityBA,act_support.mostCurrent,75);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_support.remoteMe.runUserSub(false, "act_support","btn_back_click");}
 BA.debugLineNum = 75;BA.debugLine="Sub btn_back_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
act_support.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 16;BA.debugLine="Private LblNum1 As Label";
act_support.mostCurrent._lblnum1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private LblNum2 As Label";
act_support.mostCurrent._lblnum2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LblSite As Label";
act_support.mostCurrent._lblsite = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim tel1,tel2 As String";
act_support.mostCurrent._tel1 = RemoteObject.createImmutable("");
act_support.mostCurrent._tel2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Dim site As String";
act_support.mostCurrent._site = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblcall1_click() throws Exception{
try {
		Debug.PushSubsStack("LblCall1_Click (act_support) ","act_support",51,act_support.mostCurrent.activityBA,act_support.mostCurrent,48);
if (RapidSub.canDelegate("lblcall1_click")) { return ir.parsikhesab.pakhsh.act_support.remoteMe.runUserSub(false, "act_support","lblcall1_click");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 48;BA.debugLine="Sub LblCall1_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(65536);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 50;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"tel:\" & tel1)";
Debug.ShouldStop(131072);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tel:"),act_support.mostCurrent._tel1)));
 BA.debugLineNum = 51;BA.debugLine="StartActivity(i)";
Debug.ShouldStop(262144);
act_support.mostCurrent.__c.runVoidMethod ("StartActivity",act_support.processBA,(Object)((_i.getObject())));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblcall2_click() throws Exception{
try {
		Debug.PushSubsStack("LblCall2_Click (act_support) ","act_support",51,act_support.mostCurrent.activityBA,act_support.mostCurrent,60);
if (RapidSub.canDelegate("lblcall2_click")) { return ir.parsikhesab.pakhsh.act_support.remoteMe.runUserSub(false, "act_support","lblcall2_click");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 60;BA.debugLine="Sub LblCall2_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(268435456);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 62;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"tel:\" & tel2)";
Debug.ShouldStop(536870912);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tel:"),act_support.mostCurrent._tel2)));
 BA.debugLineNum = 63;BA.debugLine="StartActivity(i)";
Debug.ShouldStop(1073741824);
act_support.mostCurrent.__c.runVoidMethod ("StartActivity",act_support.processBA,(Object)((_i.getObject())));
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
public static RemoteObject  _lblnum1_click() throws Exception{
try {
		Debug.PushSubsStack("LblNum1_Click (act_support) ","act_support",51,act_support.mostCurrent.activityBA,act_support.mostCurrent,42);
if (RapidSub.canDelegate("lblnum1_click")) { return ir.parsikhesab.pakhsh.act_support.remoteMe.runUserSub(false, "act_support","lblnum1_click");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 42;BA.debugLine="Sub LblNum1_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(1024);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 44;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"tel:\" & tel1)";
Debug.ShouldStop(2048);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tel:"),act_support.mostCurrent._tel1)));
 BA.debugLineNum = 45;BA.debugLine="StartActivity(i)";
Debug.ShouldStop(4096);
act_support.mostCurrent.__c.runVoidMethod ("StartActivity",act_support.processBA,(Object)((_i.getObject())));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblnum2_click() throws Exception{
try {
		Debug.PushSubsStack("LblNum2_Click (act_support) ","act_support",51,act_support.mostCurrent.activityBA,act_support.mostCurrent,54);
if (RapidSub.canDelegate("lblnum2_click")) { return ir.parsikhesab.pakhsh.act_support.remoteMe.runUserSub(false, "act_support","lblnum2_click");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 54;BA.debugLine="Sub LblNum2_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(4194304);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 56;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"tel:\" & tel2)";
Debug.ShouldStop(8388608);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tel:"),act_support.mostCurrent._tel2)));
 BA.debugLineNum = 57;BA.debugLine="StartActivity(i)";
Debug.ShouldStop(16777216);
act_support.mostCurrent.__c.runVoidMethod ("StartActivity",act_support.processBA,(Object)((_i.getObject())));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblsite_click() throws Exception{
try {
		Debug.PushSubsStack("LblSite_Click (act_support) ","act_support",51,act_support.mostCurrent.activityBA,act_support.mostCurrent,66);
if (RapidSub.canDelegate("lblsite_click")) { return ir.parsikhesab.pakhsh.act_support.remoteMe.runUserSub(false, "act_support","lblsite_click");}
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 66;BA.debugLine="Sub LblSite_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 68;BA.debugLine="Dim p1 As PhoneIntents";
Debug.ShouldStop(8);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 69;BA.debugLine="StartActivity(p1.OpenBrowser(\"http://www.parsikh";
Debug.ShouldStop(16);
act_support.mostCurrent.__c.runVoidMethod ("StartActivity",act_support.processBA,(Object)((_p1.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://www.parsikhesab.com"))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_support.processBA, e5.toString()); BA.debugLineNum = 71;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
act_support.mostCurrent.__c.runVoidMethod ("LogImpl","584738053",BA.ObjectToString(act_support.mostCurrent.__c.runMethod(false,"LastException",act_support.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}