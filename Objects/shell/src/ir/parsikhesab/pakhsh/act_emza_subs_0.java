package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_emza_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_emza) ","act_emza",13,act_emza.mostCurrent.activityBA,act_emza.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_emza.remoteMe.runUserSub(false, "act_emza","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"L_Emza_2\")";
Debug.ShouldStop(2097152);
act_emza.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Emza_2")),act_emza.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="CanvasSignature.Initialize(PnlSignatureBitmap)";
Debug.ShouldStop(8388608);
act_emza.mostCurrent._canvassignature.runVoidMethod ("Initialize",(Object)((act_emza.mostCurrent._pnlsignaturebitmap.getObject())));
 BA.debugLineNum = 25;BA.debugLine="SD.Initialize";
Debug.ShouldStop(16777216);
act_emza.mostCurrent._sd.runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="SD.Canvas = CanvasSignature";
Debug.ShouldStop(33554432);
act_emza.mostCurrent._sd.setField ("Canvas" /*RemoteObject*/ ,act_emza.mostCurrent._canvassignature);
 BA.debugLineNum = 27;BA.debugLine="SD.Panel = PnlSignatureBitmap";
Debug.ShouldStop(67108864);
act_emza.mostCurrent._sd.setField ("Panel" /*RemoteObject*/ ,act_emza.mostCurrent._pnlsignaturebitmap);
 BA.debugLineNum = 28;BA.debugLine="SD.SignatureColor = Colors.Black";
Debug.ShouldStop(134217728);
act_emza.mostCurrent._sd.setField ("SignatureColor" /*RemoteObject*/ ,act_emza.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 29;BA.debugLine="SD.SignatureWidth = 5dip 'Stroke width";
Debug.ShouldStop(268435456);
act_emza.mostCurrent._sd.setField ("SignatureWidth" /*RemoteObject*/ ,act_emza.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))));
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
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_emza) ","act_emza",13,act_emza.mostCurrent.activityBA,act_emza.mostCurrent,62);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_emza.remoteMe.runUserSub(false, "act_emza","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 62;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return act_emza.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btn_Back_Click (act_emza) ","act_emza",13,act_emza.mostCurrent.activityBA,act_emza.mostCurrent,59);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_emza.remoteMe.runUserSub(false, "act_emza","btn_back_click");}
 BA.debugLineNum = 59;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
act_emza.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _btncancelsignature_click() throws Exception{
try {
		Debug.PushSubsStack("BtnCancelSignature_Click (act_emza) ","act_emza",13,act_emza.mostCurrent.activityBA,act_emza.mostCurrent,37);
if (RapidSub.canDelegate("btncancelsignature_click")) { return ir.parsikhesab.pakhsh.act_emza.remoteMe.runUserSub(false, "act_emza","btncancelsignature_click");}
 BA.debugLineNum = 37;BA.debugLine="Sub BtnCancelSignature_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 41;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
act_emza.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclearsignature_click() throws Exception{
try {
		Debug.PushSubsStack("BtnClearSignature_Click (act_emza) ","act_emza",13,act_emza.mostCurrent.activityBA,act_emza.mostCurrent,44);
if (RapidSub.canDelegate("btnclearsignature_click")) { return ir.parsikhesab.pakhsh.act_emza.remoteMe.runUserSub(false, "act_emza","btnclearsignature_click");}
 BA.debugLineNum = 44;BA.debugLine="Sub BtnClearSignature_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="SignatureCapture.Clear(SD)";
Debug.ShouldStop(4096);
act_emza.mostCurrent._signaturecapture.runVoidMethod ("_clear" /*RemoteObject*/ ,act_emza.mostCurrent.activityBA,(Object)(act_emza.mostCurrent._sd));
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
public static RemoteObject  _btnsavesignature_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSaveSignature_Click (act_emza) ","act_emza",13,act_emza.mostCurrent.activityBA,act_emza.mostCurrent,48);
if (RapidSub.canDelegate("btnsavesignature_click")) { return ir.parsikhesab.pakhsh.act_emza.remoteMe.runUserSub(false, "act_emza","btnsavesignature_click");}
 BA.debugLineNum = 48;BA.debugLine="Sub BtnSaveSignature_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="SignatureCapture.Save(SD, File.DirDefaultExternal";
Debug.ShouldStop(65536);
act_emza.mostCurrent._signaturecapture.runVoidMethod ("_save" /*RemoteObject*/ ,act_emza.mostCurrent.activityBA,(Object)(act_emza.mostCurrent._sd),(Object)(RemoteObject.concat(act_emza.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Signature"))),(Object)(RemoteObject.concat(act_emza.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(".png"))));
 BA.debugLineNum = 50;BA.debugLine="SignatureCapture.Clear(SD)";
Debug.ShouldStop(131072);
act_emza.mostCurrent._signaturecapture.runVoidMethod ("_clear" /*RemoteObject*/ ,act_emza.mostCurrent.activityBA,(Object)(act_emza.mostCurrent._sd));
 BA.debugLineNum = 52;BA.debugLine="If MCode.page=\"Act_RizeFactorHavale\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_emza.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_RizeFactorHavale"))) { 
 BA.debugLineNum = 53;BA.debugLine="CallSubDelayed(Act_RizeFactorHavale,\"LoadCheck\")";
Debug.ShouldStop(1048576);
act_emza.mostCurrent.__c.runVoidMethod ("CallSubDelayed",act_emza.processBA,(Object)((act_emza.mostCurrent._act_rizefactorhavale.getObject())),(Object)(RemoteObject.createImmutable("LoadCheck")));
 };
 BA.debugLineNum = 56;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
act_emza.mostCurrent._activity.runVoidMethod ("Finish");
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
 //BA.debugLineNum = 11;BA.debugLine="Dim CanvasSignature As Canvas";
act_emza.mostCurrent._canvassignature = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim SD As SignatureData";
act_emza.mostCurrent._sd = RemoteObject.createNew ("ir.parsikhesab.pakhsh.signaturecapture._signaturedata");
 //BA.debugLineNum = 13;BA.debugLine="Private PnlSignature As Panel";
act_emza.mostCurrent._pnlsignature = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private BtnSaveSignature As Button";
act_emza.mostCurrent._btnsavesignature = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private BtnClearSignature As Button";
act_emza.mostCurrent._btnclearsignature = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private BtnCancelSignature As Button";
act_emza.mostCurrent._btncancelsignature = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PnlSignatureBitmap As Panel";
act_emza.mostCurrent._pnlsignaturebitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _pnlsignaturebitmap_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PnlSignatureBitmap_Touch (act_emza) ","act_emza",13,act_emza.mostCurrent.activityBA,act_emza.mostCurrent,33);
if (RapidSub.canDelegate("pnlsignaturebitmap_touch")) { return ir.parsikhesab.pakhsh.act_emza.remoteMe.runUserSub(false, "act_emza","pnlsignaturebitmap_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 33;BA.debugLine="Sub PnlSignatureBitmap_Touch (Action As Int, X As";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="SignatureCapture.Panel_Touch(SD, x, y, Action)";
Debug.ShouldStop(2);
act_emza.mostCurrent._signaturecapture.runVoidMethod ("_panel_touch" /*RemoteObject*/ ,act_emza.mostCurrent.activityBA,(Object)(act_emza.mostCurrent._sd),(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_action));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}