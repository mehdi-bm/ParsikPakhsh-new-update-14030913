package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_choose_report_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_choose_report) ","act_choose_report",12,act_choose_report.mostCurrent.activityBA,act_choose_report.mostCurrent,17);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_choose_report.remoteMe.runUserSub(false, "act_choose_report","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 17;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Activity.LoadLayout(\"L_Choose_Report\")";
Debug.ShouldStop(131072);
act_choose_report.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Choose_Report")),act_choose_report.mostCurrent.activityBA);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Pause (act_choose_report) ","act_choose_report",12,act_choose_report.mostCurrent.activityBA,act_choose_report.mostCurrent,30);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_choose_report.remoteMe.runUserSub(false, "act_choose_report","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_choose_report) ","act_choose_report",12,act_choose_report.mostCurrent.activityBA,act_choose_report.mostCurrent,22);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_choose_report.remoteMe.runUserSub(false, "act_choose_report","activity_resume");}
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="If MCode.Admin=\"1\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",act_choose_report.mostCurrent._mcode._admin /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 24;BA.debugLine="RB_RepFactorVisitor.Visible=True";
Debug.ShouldStop(8388608);
act_choose_report.mostCurrent._rb_repfactorvisitor.runMethod(true,"setVisible",act_choose_report.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 26;BA.debugLine="RB_RepFactorVisitor.Visible=False";
Debug.ShouldStop(33554432);
act_choose_report.mostCurrent._rb_repfactorvisitor.runMethod(true,"setVisible",act_choose_report.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Application_Error (act_choose_report) ","act_choose_report",12,act_choose_report.mostCurrent.activityBA,act_choose_report.mostCurrent,58);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_choose_report.remoteMe.runUserSub(false, "act_choose_report","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 58;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return act_choose_report.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_back_click() throws Exception{
try {
		Debug.PushSubsStack("btn_Back_Click (act_choose_report) ","act_choose_report",12,act_choose_report.mostCurrent.activityBA,act_choose_report.mostCurrent,42);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_choose_report.remoteMe.runUserSub(false, "act_choose_report","btn_back_click");}
 BA.debugLineNum = 42;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
act_choose_report.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _btn_cancel_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_cancel_Click (act_choose_report) ","act_choose_report",12,act_choose_report.mostCurrent.activityBA,act_choose_report.mostCurrent,34);
if (RapidSub.canDelegate("btn_cancel_click")) { return ir.parsikhesab.pakhsh.act_choose_report.remoteMe.runUserSub(false, "act_choose_report","btn_cancel_click");}
 BA.debugLineNum = 34;BA.debugLine="Sub Btn_cancel_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
act_choose_report.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _btn_ok_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_ok_Click (act_choose_report) ","act_choose_report",12,act_choose_report.mostCurrent.activityBA,act_choose_report.mostCurrent,46);
if (RapidSub.canDelegate("btn_ok_click")) { return ir.parsikhesab.pakhsh.act_choose_report.remoteMe.runUserSub(false, "act_choose_report","btn_ok_click");}
 BA.debugLineNum = 46;BA.debugLine="Sub Btn_ok_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Select Case True";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(act_choose_report.mostCurrent.__c.getField(true,"True"),act_choose_report.mostCurrent._rb_visitor.runMethod(true,"getChecked"),act_choose_report.mostCurrent._rb_moshtari.runMethod(true,"getChecked"),act_choose_report.mostCurrent._rb_soorathesab.runMethod(true,"getChecked"),act_choose_report.mostCurrent._rb_repfactorvisitor.runMethod(true,"getChecked"))) {
case 0: {
 BA.debugLineNum = 49;BA.debugLine="StartActivity(Act_ReportVisitor2)";
Debug.ShouldStop(65536);
act_choose_report.mostCurrent.__c.runVoidMethod ("StartActivity",act_choose_report.processBA,(Object)((act_choose_report.mostCurrent._act_reportvisitor2.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 51;BA.debugLine="StartActivity(Act_ReportVisitor)";
Debug.ShouldStop(262144);
act_choose_report.mostCurrent.__c.runVoidMethod ("StartActivity",act_choose_report.processBA,(Object)((act_choose_report.mostCurrent._act_reportvisitor.getObject())));
 break; }
case 2: {
 BA.debugLineNum = 53;BA.debugLine="StartActivity(Act_ReportSoorathesab)";
Debug.ShouldStop(1048576);
act_choose_report.mostCurrent.__c.runVoidMethod ("StartActivity",act_choose_report.processBA,(Object)((act_choose_report.mostCurrent._act_reportsoorathesab.getObject())));
 break; }
case 3: {
 BA.debugLineNum = 55;BA.debugLine="StartActivity(Act_RepFactorVisitor)";
Debug.ShouldStop(4194304);
act_choose_report.mostCurrent.__c.runVoidMethod ("StartActivity",act_choose_report.processBA,(Object)((act_choose_report.mostCurrent._act_repfactorvisitor.getObject())));
 break; }
}
;
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private RB_Moshtari As RadioButton";
act_choose_report.mostCurrent._rb_moshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private RB_Visitor As RadioButton";
act_choose_report.mostCurrent._rb_visitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private RB_Soorathesab As RadioButton";
act_choose_report.mostCurrent._rb_soorathesab = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private RB_RepFactorVisitor As RadioButton";
act_choose_report.mostCurrent._rb_repfactorvisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (act_choose_report) ","act_choose_report",12,act_choose_report.mostCurrent.activityBA,act_choose_report.mostCurrent,38);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_choose_report.remoteMe.runUserSub(false, "act_choose_report","lblback_click");}
 BA.debugLineNum = 38;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
act_choose_report.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}