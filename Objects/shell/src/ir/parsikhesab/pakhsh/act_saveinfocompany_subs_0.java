package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_saveinfocompany_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_saveinfocompany) ","act_saveinfocompany",43,act_saveinfocompany.mostCurrent.activityBA,act_saveinfocompany.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_saveinfocompany.remoteMe.runUserSub(false, "act_saveinfocompany","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Activity.LoadLayout(\"l_SaveInfoCompany\")";
Debug.ShouldStop(262144);
act_saveinfocompany.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_SaveInfoCompany")),act_saveinfocompany.mostCurrent.activityBA);
 BA.debugLineNum = 20;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(524288);
act_saveinfocompany.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 21;BA.debugLine="Key.SetCustomFilter(txtTellCompany,txtTellCompany";
Debug.ShouldStop(1048576);
act_saveinfocompany.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_saveinfocompany.mostCurrent._txttellcompany.getObject())),(Object)(act_saveinfocompany.mostCurrent._txttellcompany.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 22;BA.debugLine="Key.SetLengthFilter(txtCompanyName,50)";
Debug.ShouldStop(2097152);
act_saveinfocompany.mostCurrent._key.runVoidMethod ("SetLengthFilter",(Object)((act_saveinfocompany.mostCurrent._txtcompanyname.getObject())),(Object)(BA.numberCast(int.class, 50)));
 BA.debugLineNum = 23;BA.debugLine="Key.SetLengthFilter(txtTellCompany,11)";
Debug.ShouldStop(4194304);
act_saveinfocompany.mostCurrent._key.runVoidMethod ("SetLengthFilter",(Object)((act_saveinfocompany.mostCurrent._txttellcompany.getObject())),(Object)(BA.numberCast(int.class, 11)));
 BA.debugLineNum = 24;BA.debugLine="Key.SetLengthFilter(txtAddressCompany,200)";
Debug.ShouldStop(8388608);
act_saveinfocompany.mostCurrent._key.runVoidMethod ("SetLengthFilter",(Object)((act_saveinfocompany.mostCurrent._txtaddresscompany.getObject())),(Object)(BA.numberCast(int.class, 200)));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_saveinfocompany) ","act_saveinfocompany",43,act_saveinfocompany.mostCurrent.activityBA,act_saveinfocompany.mostCurrent,41);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_saveinfocompany.remoteMe.runUserSub(false, "act_saveinfocompany","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_Resume (act_saveinfocompany) ","act_saveinfocompany",43,act_saveinfocompany.mostCurrent.activityBA,act_saveinfocompany.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_saveinfocompany.remoteMe.runUserSub(false, "act_saveinfocompany","activity_resume");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 29;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(268435456);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 30;BA.debugLine="cu=MCode.Result(\"Select FldNameCompany,FldTellCo";
Debug.ShouldStop(536870912);
_cu = act_saveinfocompany.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_saveinfocompany.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select FldNameCompany,FldTellCompany,FldAddressCompany from TblSetting")));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 31;BA.debugLine="cu.Position=0";
Debug.ShouldStop(1073741824);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 32;BA.debugLine="txtCompanyName.Text=myCode.Is_Null(cu.GetString(";
Debug.ShouldStop(-2147483648);
act_saveinfocompany.mostCurrent._txtcompanyname.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_saveinfocompany.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_saveinfocompany.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNameCompany")))))));
 BA.debugLineNum = 33;BA.debugLine="txtTellCompany.Text=myCode.Is_Null(cu.GetString(";
Debug.ShouldStop(1);
act_saveinfocompany.mostCurrent._txttellcompany.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_saveinfocompany.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_saveinfocompany.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTellCompany")))))));
 BA.debugLineNum = 34;BA.debugLine="txtAddressCompany.Text=myCode.Is_Null(cu.GetStri";
Debug.ShouldStop(2);
act_saveinfocompany.mostCurrent._txtaddresscompany.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_saveinfocompany.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_saveinfocompany.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAddressCompany")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_saveinfocompany.processBA, e9.toString()); BA.debugLineNum = 36;BA.debugLine="ToastMessageShow(\"خطا در بارگزاری اطلاعات\",True)";
Debug.ShouldStop(8);
act_saveinfocompany.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در بارگزاری اطلاعات")),(Object)(act_saveinfocompany.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 37;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
act_saveinfocompany.mostCurrent.__c.runVoidMethod ("LogImpl","577594634",BA.ObjectToString(act_saveinfocompany.mostCurrent.__c.runMethod(false,"LastException",act_saveinfocompany.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("btn_Back_Click (act_saveinfocompany) ","act_saveinfocompany",43,act_saveinfocompany.mostCurrent.activityBA,act_saveinfocompany.mostCurrent,61);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_saveinfocompany.remoteMe.runUserSub(false, "act_saveinfocompany","btn_back_click");}
 BA.debugLineNum = 61;BA.debugLine="Private Sub btn_Back_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
act_saveinfocompany.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncancel_click() throws Exception{
try {
		Debug.PushSubsStack("btnCancel_Click (act_saveinfocompany) ","act_saveinfocompany",43,act_saveinfocompany.mostCurrent.activityBA,act_saveinfocompany.mostCurrent,57);
if (RapidSub.canDelegate("btncancel_click")) { return ir.parsikhesab.pakhsh.act_saveinfocompany.remoteMe.runUserSub(false, "act_saveinfocompany","btncancel_click");}
 BA.debugLineNum = 57;BA.debugLine="Private Sub btnCancel_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
act_saveinfocompany.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _btnsave_click() throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (act_saveinfocompany) ","act_saveinfocompany",43,act_saveinfocompany.mostCurrent.activityBA,act_saveinfocompany.mostCurrent,46);
if (RapidSub.canDelegate("btnsave_click")) { return ir.parsikhesab.pakhsh.act_saveinfocompany.remoteMe.runUserSub(false, "act_saveinfocompany","btnsave_click");}
 BA.debugLineNum = 46;BA.debugLine="Private Sub btnSave_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 48;BA.debugLine="MCode.SaveUpdate($\"Update TblSetting set FldName";
Debug.ShouldStop(32768);
act_saveinfocompany.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_saveinfocompany.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting set FldNameCompany='"),act_saveinfocompany.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_saveinfocompany.mostCurrent._txtcompanyname.runMethod(true,"getText")))),RemoteObject.createImmutable("',FldTellCompany='"),act_saveinfocompany.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_saveinfocompany.mostCurrent._txttellcompany.runMethod(true,"getText")))),RemoteObject.createImmutable("',FldAddressCompany='"),act_saveinfocompany.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_saveinfocompany.mostCurrent._txtaddresscompany.runMethod(true,"getText")))),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 49;BA.debugLine="ToastMessageShow(\"اطلاعات با موفقیت ثبت گردید\",T";
Debug.ShouldStop(65536);
act_saveinfocompany.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعات با موفقیت ثبت گردید")),(Object)(act_saveinfocompany.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 50;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
act_saveinfocompany.mostCurrent._activity.runVoidMethod ("Finish");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_saveinfocompany.processBA, e6.toString()); BA.debugLineNum = 52;BA.debugLine="ToastMessageShow(\"خطا در ثبت اطلاعات\",True)";
Debug.ShouldStop(524288);
act_saveinfocompany.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در ثبت اطلاعات")),(Object)(act_saveinfocompany.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 53;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
act_saveinfocompany.mostCurrent.__c.runVoidMethod ("LogImpl","577725703",BA.ObjectToString(act_saveinfocompany.mostCurrent.__c.runMethod(false,"LastException",act_saveinfocompany.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private txtAddressCompany As EditText";
act_saveinfocompany.mostCurrent._txtaddresscompany = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private txtCompanyName As EditText";
act_saveinfocompany.mostCurrent._txtcompanyname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private txtTellCompany As EditText";
act_saveinfocompany.mostCurrent._txttellcompany = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Dim Key As IME";
act_saveinfocompany.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}