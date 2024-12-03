package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_ticket_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_ticket) ","act_ticket",52,act_ticket.mostCurrent.activityBA,act_ticket.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_ticket.remoteMe.runUserSub(false, "act_ticket","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"l_ticket\")";
Debug.ShouldStop(2097152);
act_ticket.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_ticket")),act_ticket.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="web.Initialize(\"\")";
Debug.ShouldStop(4194304);
act_ticket.mostCurrent._web.runVoidMethod ("Initialize",act_ticket.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="Wview.Initialize(web)";
Debug.ShouldStop(8388608);
act_ticket.mostCurrent._wview.runVoidMethod ("Initialize",(Object)((act_ticket.mostCurrent._web.getObject())));
 BA.debugLineNum = 25;BA.debugLine="pnlMain.AddView(Wview,0,0,100%x,100%y)";
Debug.ShouldStop(16777216);
act_ticket.mostCurrent._pnlmain.runVoidMethod ("AddView",(Object)((act_ticket.mostCurrent._wview.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_ticket.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_ticket.mostCurrent.activityBA)),(Object)(act_ticket.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_ticket.mostCurrent.activityBA)));
 BA.debugLineNum = 26;BA.debugLine="Wview.JavaScriptEnabled=True";
Debug.ShouldStop(33554432);
act_ticket.mostCurrent._wview.runMethod(true,"setJavaScriptEnabled",act_ticket.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 29;BA.debugLine="Wview.LoadUrl(Site)";
Debug.ShouldStop(268435456);
act_ticket.mostCurrent._wview.runVoidMethod ("LoadUrl",(Object)(act_ticket.mostCurrent._site));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_ticket) ","act_ticket",52,act_ticket.mostCurrent.activityBA,act_ticket.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_ticket.remoteMe.runUserSub(false, "act_ticket","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Resume (act_ticket) ","act_ticket",52,act_ticket.mostCurrent.activityBA,act_ticket.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_ticket.remoteMe.runUserSub(false, "act_ticket","activity_resume");}
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_ticket) ","act_ticket",52,act_ticket.mostCurrent.activityBA,act_ticket.mostCurrent,40);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_ticket.remoteMe.runUserSub(false, "act_ticket","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 40;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return act_ticket.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim Site As String = \"https://support.parsikhesab";
act_ticket.mostCurrent._site = BA.ObjectToString("https://support.parsikhesab.com/");
 //BA.debugLineNum = 14;BA.debugLine="Dim CurrentURL As String = Site";
act_ticket.mostCurrent._currenturl = act_ticket.mostCurrent._site;
 //BA.debugLineNum = 15;BA.debugLine="Dim web As WebView";
act_ticket.mostCurrent._web = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private Wview As WebViewExtras";
act_ticket.mostCurrent._wview = RemoteObject.createNew ("uk.co.martinpearman.b4a.webkit.WebViewExtras");
 //BA.debugLineNum = 17;BA.debugLine="Private pnlMain As Panel";
act_ticket.mostCurrent._pnlmain = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private pnlMain As Panel";
act_ticket.mostCurrent._pnlmain = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}