package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_profile_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,57);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Activity.LoadLayout(\"L_Profile\")";
Debug.ShouldStop(33554432);
act_profile.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Profile")),act_profile.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(67108864);
act_profile.mostCurrent._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,act_profile.processBA,(Object)(BA.ObjectToString("jobInternet")),(Object)(act_profile.getObject()));
 BA.debugLineNum = 60;BA.debugLine="ListFaktor.Initialize";
Debug.ShouldStop(134217728);
act_profile.mostCurrent._listfaktor.runVoidMethod ("Initialize");
 BA.debugLineNum = 61;BA.debugLine="ListFaktor.Clear";
Debug.ShouldStop(268435456);
act_profile.mostCurrent._listfaktor.runVoidMethod ("Clear");
 BA.debugLineNum = 62;BA.debugLine="Gps.Initialize(\"Gps\")";
Debug.ShouldStop(536870912);
act_profile._gps.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Gps")));
 BA.debugLineNum = 63;BA.debugLine="t1.Initialize(\"t1\",5000)";
Debug.ShouldStop(1073741824);
act_profile._t1.runVoidMethod ("Initialize",act_profile.processBA,(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 5000)));
 BA.debugLineNum = 64;BA.debugLine="T_Gps.Initialize(\"T_Gps\",7000)";
Debug.ShouldStop(-2147483648);
act_profile._t_gps.runVoidMethod ("Initialize",act_profile.processBA,(Object)(BA.ObjectToString("T_Gps")),(Object)(BA.numberCast(long.class, 7000)));
 BA.debugLineNum = 65;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(1);
act_profile.mostCurrent._hlv.runMethod(false,"Initializer",act_profile.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 66;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
Debug.ShouldStop(2);
act_profile.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_profile.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_profile.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_profile.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 67;BA.debugLine="HLV.Show";
Debug.ShouldStop(4);
act_profile.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 69;BA.debugLine="Log(\"tour: \"&TourVisit)";
Debug.ShouldStop(16);
act_profile.mostCurrent.__c.runVoidMethod ("LogImpl","556033292",RemoteObject.concat(RemoteObject.createImmutable("tour: "),act_profile._tourvisit),0);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,90);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 90;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 92;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_profile.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 93;BA.debugLine="btn_Back_Click";
Debug.ShouldStop(268435456);
_btn_back_click();
 };
 BA.debugLineNum = 95;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return act_profile.mostCurrent.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_profile.processBA, e7.toString()); BA.debugLineNum = 97;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
act_profile.mostCurrent.__c.runVoidMethod ("LogImpl","556295431",BA.ObjectToString(act_profile.mostCurrent.__c.runMethod(false,"LastException",act_profile.mostCurrent.activityBA)),0);
 BA.debugLineNum = 98;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2);
act_profile.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_profile.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_profile.mostCurrent.__c.runMethod(false,"LastException",act_profile.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_profile.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_KeyPress"))));
 };
 BA.debugLineNum = 100;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return act_profile.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,81);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 81;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Gps.Stop";
Debug.ShouldStop(131072);
act_profile._gps.runVoidMethod ("Stop");
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Resume (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,72);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","activity_resume");}
 BA.debugLineNum = 72;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 75;BA.debugLine="CreatePage";
Debug.ShouldStop(1024);
_createpage();
 BA.debugLineNum = 76;BA.debugLine="LoadListFaktor";
Debug.ShouldStop(2048);
_loadlistfaktor();
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Application_Error (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,822);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 822;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 824;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return act_profile.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 825;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btn_Back_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,85);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","btn_back_click");}
 BA.debugLineNum = 85;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="MCode.C_Tafzili=0";
Debug.ShouldStop(2097152);
act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 87;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
act_profile.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnextvisit_click() throws Exception{
try {
		Debug.PushSubsStack("BtnNextVisit_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,637);
if (RapidSub.canDelegate("btnnextvisit_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","btnnextvisit_click");}
 BA.debugLineNum = 637;BA.debugLine="Sub BtnNextVisit_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 638;BA.debugLine="OpenDialogNewVisit";
Debug.ShouldStop(536870912);
_opendialognewvisit();
 BA.debugLineNum = 639;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("BtnSave_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,693);
if (RapidSub.canDelegate("btnsave_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","btnsave_click");}
RemoteObject _check = RemoteObject.createImmutable(false);
RemoteObject _d = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 693;BA.debugLine="Sub BtnSave_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 694;BA.debugLine="Dim Check As Boolean = LblDate.text <> \"انتخاب کن";
Debug.ShouldStop(2097152);
_check = BA.ObjectToBoolean(RemoteObject.solveBoolean("!",act_profile.mostCurrent._lbldate.runMethod(true,"getText"),BA.ObjectToString("انتخاب کنید")) && RemoteObject.solveBoolean("!",act_profile.mostCurrent._txtdesc.runMethod(true,"getText"),BA.ObjectToString("")));Debug.locals.put("Check", _check);Debug.locals.put("Check", _check);
 BA.debugLineNum = 695;BA.debugLine="If Check = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_check,act_profile.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 696;BA.debugLine="Dim D As String = LblDate.Tag '& \" \" & TimePicke";
Debug.ShouldStop(8388608);
_d = BA.ObjectToString(act_profile.mostCurrent._lbldate.runMethod(false,"getTag"));Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 697;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(16777216);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_profile.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblNextVisit Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 698;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 699;BA.debugLine="MCode.SaveUpdate(\"Update TblNextVisit Set NextV";
Debug.ShouldStop(67108864);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblNextVisit Set NextVisitDate = '"),_d,RemoteObject.createImmutable("',NextVisitText = '"),act_profile.mostCurrent._txtdesc.runMethod(true,"getText"),RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 701;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblNextVisit (Fld";
Debug.ShouldStop(268435456);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblNextVisit (FldC_Ashkhas,NextVisitDate,NextVisitText) Values ('"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_d,RemoteObject.createImmutable("','"),act_profile.mostCurrent._txtdesc.runMethod(true,"getText"),RemoteObject.createImmutable("')"))));
 };
 BA.debugLineNum = 704;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas set nextVisi";
Debug.ShouldStop(-2147483648);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas set nextVisitDate = '"),_d,RemoteObject.createImmutable("',nextVisitText = '"),act_profile.mostCurrent._txtdesc.runMethod(true,"getText"),RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 706;BA.debugLine="LblBack_Click";
Debug.ShouldStop(2);
_lblback_click();
 }else {
 BA.debugLineNum = 708;BA.debugLine="ToastMessageShow(\"اطلاعات را به طور کامل وارد کن";
Debug.ShouldStop(8);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعات را به طور کامل وارد کنید")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 710;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshowcheks_click() throws Exception{
try {
		Debug.PushSubsStack("BtnShowCheks_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,343);
if (RapidSub.canDelegate("btnshowcheks_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","btnshowcheks_click");}
 BA.debugLineNum = 343;BA.debugLine="Sub BtnShowCheks_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 345;BA.debugLine="Log(\"Check\")";
Debug.ShouldStop(16777216);
act_profile.mostCurrent.__c.runVoidMethod ("LogImpl","556950786",RemoteObject.createImmutable("Check"),0);
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshowmap_click() throws Exception{
try {
		Debug.PushSubsStack("BtnShowMap_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,818);
if (RapidSub.canDelegate("btnshowmap_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","btnshowmap_click");}
 BA.debugLineNum = 818;BA.debugLine="Private Sub BtnShowMap_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 820;BA.debugLine="GetLocation(MCode.C_Tafzili)";
Debug.ShouldStop(524288);
_getlocation(act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ );
 BA.debugLineNum = 821;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshowmoeen_click() throws Exception{
try {
		Debug.PushSubsStack("BtnShowMoeen_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,617);
if (RapidSub.canDelegate("btnshowmoeen_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","btnshowmoeen_click");}
 BA.debugLineNum = 617;BA.debugLine="Sub BtnShowMoeen_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 620;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,103);
if (RapidSub.canDelegate("button1_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","button1_click");}
 BA.debugLineNum = 103;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="If MCode.Tozie=1 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",act_profile.mostCurrent._mcode._tozie /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 106;BA.debugLine="StartActivity(Act_Mali)";
Debug.ShouldStop(512);
act_profile.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((act_profile.mostCurrent._act_mali.getObject())));
 }else {
 BA.debugLineNum = 109;BA.debugLine="ToastMessageShow(\"این دسترسی برای شما فعال نیست";
Debug.ShouldStop(4096);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("این دسترسی برای شما فعال نیست ، با پشتیبانی تماس بگیرید")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,115);
if (RapidSub.canDelegate("button2_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","button2_click");}
 BA.debugLineNum = 115;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="If MCode.SendMarjoie = 1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_profile.mostCurrent._mcode._sendmarjoie /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 133;BA.debugLine="Log(MCode.C_Tafzili)";
Debug.ShouldStop(16);
act_profile.mostCurrent.__c.runVoidMethod ("LogImpl","556426514",act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,0);
 BA.debugLineNum = 134;BA.debugLine="MCode.FaktorSelect=\"\"";
Debug.ShouldStop(32);
act_profile.mostCurrent._mcode._faktorselect /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 135;BA.debugLine="MCode.Action=\"SabtMarjooii\"";
Debug.ShouldStop(64);
act_profile.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtMarjooii");
 BA.debugLineNum = 136;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(128);
act_profile.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((act_profile.mostCurrent._act_kaladefault.getObject())));
 }else {
 BA.debugLineNum = 139;BA.debugLine="ToastMessageShow(\"این دسترسی برای شما فعال نیست";
Debug.ShouldStop(1024);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("این دسترسی برای شما فعال نیست ، با پشتیبانی تماس بگیرید")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 };
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
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,144);
if (RapidSub.canDelegate("button3_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","button3_click");}
 BA.debugLineNum = 144;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="If	MCode.Visitor=\"0\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",act_profile.mostCurrent._mcode._visitor /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 146;BA.debugLine="ToastMessageShow(\"این بخش مربوط به نسخه ویزیتور";
Debug.ShouldStop(131072);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 147;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 149;BA.debugLine="lbl_Default_Click";
Debug.ShouldStop(1048576);
_lbl_default_click();
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,160);
if (RapidSub.canDelegate("button4_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","button4_click");}
 BA.debugLineNum = 160;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="pnl_location.BringToFront";
Debug.ShouldStop(1);
act_profile.mostCurrent._pnl_location.runVoidMethod ("BringToFront");
 BA.debugLineNum = 162;BA.debugLine="Pnl_menu.Visible=False";
Debug.ShouldStop(2);
act_profile.mostCurrent._pnl_menu.runMethod(true,"setVisible",act_profile.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 163;BA.debugLine="If pnl_location.Visible Then";
Debug.ShouldStop(4);
if (act_profile.mostCurrent._pnl_location.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 164;BA.debugLine="pnl_location.SetVisibleAnimated(600,False)";
Debug.ShouldStop(8);
act_profile.mostCurrent._pnl_location.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(act_profile.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 166;BA.debugLine="pnl_location.SetVisibleAnimated(600,True)";
Debug.ShouldStop(32);
act_profile.mostCurrent._pnl_location.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _createpage() throws Exception{
try {
		Debug.PushSubsStack("CreatePage (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,170);
if (RapidSub.canDelegate("createpage")) { ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","createpage"); return;}
ResumableSub_CreatePage rsub = new ResumableSub_CreatePage(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreatePage extends BA.ResumableSub {
public ResumableSub_CreatePage(ir.parsikhesab.pakhsh.act_profile parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_profile parent;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _st = RemoteObject.createImmutable("");
RemoteObject _lastvisit = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lastvisitdate = RemoteObject.createImmutable("");
RemoteObject _lastvisittime = RemoteObject.createImmutable("");
RemoteObject _datetimelastsefaresh = RemoteObject.createImmutable("");
RemoteObject _lastsefareshdate = RemoteObject.createImmutable("");
RemoteObject _lastsefareshtime = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreatePage (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,170);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 171;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_profile.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_profile", "createpage"),BA.numberCast(int.class, 200));
this.state = 40;
return;
case 40:
//C
this.state = 1;
;
 BA.debugLineNum = 172;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select * From TblA";
Debug.ShouldStop(2048);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodetafzili = '"),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 173;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 39;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 174;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(8192);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 175;BA.debugLine="LblCode.Text=Cu.GetString(\"fldCodetafzili\")";
Debug.ShouldStop(16384);
parent.mostCurrent._lblcode.runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili")))));
 BA.debugLineNum = 176;BA.debugLine="LblName.Text=Cu.GetString(\"fldSharheTafzili\")";
Debug.ShouldStop(32768);
parent.mostCurrent._lblname.runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili")))));
 BA.debugLineNum = 177;BA.debugLine="LblVaziat.Text=\"وضعیت : \"&myCode.Is_Null(Cu.GetS";
Debug.ShouldStop(65536);
parent.mostCurrent._lblvaziat.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("وضعیت : "),parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVaziat"))))))));
 BA.debugLineNum = 179;BA.debugLine="If myCode.Is_Null_adad(Cu.GetString(\"fldBlackLis";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldBlackList"))))),BA.NumberToString(1))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 180;BA.debugLine="LblBlackList.Visible=True";
Debug.ShouldStop(524288);
parent.mostCurrent._lblblacklist.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 182;BA.debugLine="LblBlackList.Visible=False";
Debug.ShouldStop(2097152);
parent.mostCurrent._lblblacklist.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 198;BA.debugLine="If IsNumber(Cu.GetString(\"fldMande\")) Then";
Debug.ShouldStop(32);

case 9:
//if
this.state = 14;
if (parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMande"))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 199;BA.debugLine="Dim st As String=NumberFormat2(Cu.GetString(\"";
Debug.ShouldStop(64);
_st = parent.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMande"))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(true,"True")));Debug.locals.put("st", _st);Debug.locals.put("st", _st);
 BA.debugLineNum = 200;BA.debugLine="mande=Cu.GetString(\"fldMande\")";
Debug.ShouldStop(128);
parent.mostCurrent._mande = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMande")));
 BA.debugLineNum = 201;BA.debugLine="Log(st)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","556623135",_st,0);
 BA.debugLineNum = 202;BA.debugLine="Sleep(100)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_profile.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_profile", "createpage"),BA.numberCast(int.class, 100));
this.state = 41;
return;
case 41:
//C
this.state = 14;
;
 BA.debugLineNum = 203;BA.debugLine="LblMandeHesab.Text = st & \" \" & MCode.VahedPo";
Debug.ShouldStop(1024);
parent.mostCurrent._lblmandehesab.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_st,RemoteObject.createImmutable(" "),parent.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 205;BA.debugLine="LblMandeHesab.Text=\" 0 \" & MCode.VahedPool";
Debug.ShouldStop(4096);
parent.mostCurrent._lblmandehesab.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" 0 "),parent.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 206;BA.debugLine="mande=0";
Debug.ShouldStop(8192);
parent.mostCurrent._mande = BA.NumberToString(0);
 if (true) break;
;
 BA.debugLineNum = 208;BA.debugLine="If mande>0 Then";
Debug.ShouldStop(32768);

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, parent.mostCurrent._mande),BA.numberCast(double.class, 0))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 209;BA.debugLine="LblMandeEtebar.Text=myCode.AdadToPrice(myCode.I";
Debug.ShouldStop(65536);
parent.mostCurrent._lblmandeetebar.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSaghfeEtebar")))))),BA.numberCast(double.class, parent.mostCurrent._mande)}, "-",1, 0))))));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 211;BA.debugLine="LblMandeEtebar.Text=myCode.AdadToPrice(myCode.I";
Debug.ShouldStop(262144);
parent.mostCurrent._lblmandeetebar.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSaghfeEtebar")))))))));
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 230;BA.debugLine="Dim LastVisit As String = myCode.Is_Null(Cu.GetS";
Debug.ShouldStop(32);
_lastvisit = parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("lastSeen")))));Debug.locals.put("LastVisit", _lastvisit);Debug.locals.put("LastVisit", _lastvisit);
 BA.debugLineNum = 231;BA.debugLine="If LastVisit.Length = 0 Then";
Debug.ShouldStop(64);
if (true) break;

case 20:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_lastvisit.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 232;BA.debugLine="LblLastVisit.Text=\"//\"";
Debug.ShouldStop(128);
parent.mostCurrent._lbllastvisit.runMethod(true,"setText",BA.ObjectToCharSequence("//"));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 234;BA.debugLine="Dim Str As List";
Debug.ShouldStop(512);
_str = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Str", _str);
 BA.debugLineNum = 235;BA.debugLine="Str.Initialize";
Debug.ShouldStop(1024);
_str.runVoidMethod ("Initialize");
 BA.debugLineNum = 236;BA.debugLine="Str = MCode.Sf.Split(LastVisit.Replace(\"-\",\"/\")";
Debug.ShouldStop(2048);
_str = parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(_lastvisit.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("/")))),(Object)(RemoteObject.createImmutable("T")));Debug.locals.put("Str", _str);
 BA.debugLineNum = 238;BA.debugLine="Dim DT As List = MCode.Sf.Split(Str.get(0),\"/\")";
Debug.ShouldStop(8192);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dt = parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(BA.ObjectToString(_str.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("DT", _dt);Debug.locals.put("DT", _dt);
 BA.debugLineNum = 239;BA.debugLine="Dim lastVisitDate As String = MCode.PersianDate";
Debug.ShouldStop(16384);
_lastvisitdate = parent.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(BA.ObjectToString(_dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("lastVisitDate", _lastvisitdate);Debug.locals.put("lastVisitDate", _lastvisitdate);
 BA.debugLineNum = 240;BA.debugLine="Dim lastVisitTime As String = Str.get(1)";
Debug.ShouldStop(32768);
_lastvisittime = BA.ObjectToString(_str.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("lastVisitTime", _lastvisittime);Debug.locals.put("lastVisitTime", _lastvisittime);
 BA.debugLineNum = 241;BA.debugLine="LblLastVisit.Text=lastVisitDate & CRLF & lastVi";
Debug.ShouldStop(65536);
parent.mostCurrent._lbllastvisit.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_lastvisitdate,parent.mostCurrent.__c.getField(true,"CRLF"),_lastvisittime)));
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 244;BA.debugLine="Dim DateTimeLastSefaresh As String = myCode.Is_N";
Debug.ShouldStop(524288);
_datetimelastsefaresh = parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("lastOrderDate")))));Debug.locals.put("DateTimeLastSefaresh", _datetimelastsefaresh);Debug.locals.put("DateTimeLastSefaresh", _datetimelastsefaresh);
 BA.debugLineNum = 245;BA.debugLine="If DateTimeLastSefaresh.Length = 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 26:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_datetimelastsefaresh.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 246;BA.debugLine="LblLastSefaresh.Text=\"//\"";
Debug.ShouldStop(2097152);
parent.mostCurrent._lbllastsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence("//"));
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 248;BA.debugLine="Dim Str As List";
Debug.ShouldStop(8388608);
_str = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Str", _str);
 BA.debugLineNum = 249;BA.debugLine="Str.Initialize";
Debug.ShouldStop(16777216);
_str.runVoidMethod ("Initialize");
 BA.debugLineNum = 250;BA.debugLine="Str = MCode.Sf.Split(DateTimeLastSefaresh.Repla";
Debug.ShouldStop(33554432);
_str = parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(_datetimelastsefaresh.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("/")))),(Object)(RemoteObject.createImmutable("T")));Debug.locals.put("Str", _str);
 BA.debugLineNum = 252;BA.debugLine="Dim DT As List = MCode.Sf.Split(Str.get(0),\"/\")";
Debug.ShouldStop(134217728);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dt = parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(BA.ObjectToString(_str.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("DT", _dt);Debug.locals.put("DT", _dt);
 BA.debugLineNum = 253;BA.debugLine="Dim LastSefareshDate As String = MCode.PersianD";
Debug.ShouldStop(268435456);
_lastsefareshdate = parent.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(BA.ObjectToString(_dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("LastSefareshDate", _lastsefareshdate);Debug.locals.put("LastSefareshDate", _lastsefareshdate);
 BA.debugLineNum = 254;BA.debugLine="Dim LastSefareshTime As String =Str.get(1)";
Debug.ShouldStop(536870912);
_lastsefareshtime = BA.ObjectToString(_str.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("LastSefareshTime", _lastsefareshtime);Debug.locals.put("LastSefareshTime", _lastsefareshtime);
 BA.debugLineNum = 255;BA.debugLine="LblLastSefaresh.Text=LastSefareshDate & CRLF &";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lbllastsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_lastsefareshdate,parent.mostCurrent.__c.getField(true,"CRLF"),_lastsefareshtime)));
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 258;BA.debugLine="LblTell.Text=myCode.Is_Null(Cu.GetString(\"fldTel";
Debug.ShouldStop(2);
parent.mostCurrent._lbltell.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell"))))),RemoteObject.createImmutable(" | "),parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMobile"))))))));
 BA.debugLineNum = 259;BA.debugLine="MCode.Tell_Tafzili=LblTell.Text";
Debug.ShouldStop(4);
parent.mostCurrent._mcode._tell_tafzili /*RemoteObject*/  = parent.mostCurrent._lbltell.runMethod(true,"getText");
 BA.debugLineNum = 260;BA.debugLine="If myCode.Is_Null(Cu.GetString(\"FldMobile\")) <>";
Debug.ShouldStop(8);
if (true) break;

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMobile"))))),BA.ObjectToString(""))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 261;BA.debugLine="LblTell.tag=Cu.GetString(\"FldMobile\")";
Debug.ShouldStop(16);
parent.mostCurrent._lbltell.runMethod(false,"setTag",(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMobile")))));
 if (true) break;
;
 BA.debugLineNum = 263;BA.debugLine="If myCode.Is_Null(Cu.GetString(\"fldTell\")) <> \"\"";
Debug.ShouldStop(64);

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell"))))),BA.ObjectToString(""))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 264;BA.debugLine="LblTell.tag=Cu.GetString(\"fldTell\")";
Debug.ShouldStop(128);
parent.mostCurrent._lbltell.runMethod(false,"setTag",(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell")))));
 if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 266;BA.debugLine="LblAddress.Text=Cu.GetString(\"fldAdress\")";
Debug.ShouldStop(512);
parent.mostCurrent._lbladdress.runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldAdress")))));
 BA.debugLineNum = 267;BA.debugLine="MCode.Address_Tafzili=LblAddress.Text";
Debug.ShouldStop(1024);
parent.mostCurrent._mcode._address_tafzili /*RemoteObject*/  = parent.mostCurrent._lbladdress.runMethod(true,"getText");
 if (true) break;

case 39:
//C
this.state = -1;
;
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _getlocation(RemoteObject _codetafzili) throws Exception{
try {
		Debug.PushSubsStack("GetLocation (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,738);
if (RapidSub.canDelegate("getlocation")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","getlocation", _codetafzili);}
Debug.locals.put("CodeTafzili", _codetafzili);
 BA.debugLineNum = 738;BA.debugLine="Sub GetLocation(CodeTafzili As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 739;BA.debugLine="jobInternet.JobName =\"GetLocation\"";
Debug.ShouldStop(4);
act_profile.mostCurrent._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetLocation"));
 BA.debugLineNum = 740;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8);
act_profile.mostCurrent._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),act_profile.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=Select FldC_Tafzili,FldLat,FldLon From TblLocation Where FldC_Tafzili = '"),_codetafzili,RemoteObject.createImmutable("'"),RemoteObject.createImmutable("&Imei="),act_profile.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 741;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Dim ListFaktor As List";
act_profile.mostCurrent._listfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 15;BA.debugLine="Private pnl_HLV As Panel";
act_profile.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private HLV As Hitex_LayoutView";
act_profile.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 17;BA.debugLine="Private rp As RuntimePermissions";
act_profile.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 18;BA.debugLine="Private BtnShowCheks As Label";
act_profile.mostCurrent._btnshowcheks = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LblVaziat As Label";
act_profile.mostCurrent._lblvaziat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private LblAddress As Label";
act_profile.mostCurrent._lbladdress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LblMandeHesab As Label";
act_profile.mostCurrent._lblmandehesab = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LblLastSefaresh As Label";
act_profile.mostCurrent._lbllastsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LblLastVisit As Label";
act_profile.mostCurrent._lbllastvisit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LblTell As Label";
act_profile.mostCurrent._lbltell = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LblName As Label";
act_profile.mostCurrent._lblname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Button1 As Button";
act_profile.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Button2 As Button";
act_profile.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Button3 As Button";
act_profile.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Button4 As Button";
act_profile.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private gmap As GoogleMap";
act_profile.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private MapFragment1 As MapFragment";
act_profile.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private pnl_location As Panel";
act_profile.mostCurrent._pnl_location = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Pnl_menu As Panel";
act_profile.mostCurrent._pnl_menu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lbl_sabt_Locastion As Label";
act_profile.mostCurrent._lbl_sabt_locastion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lbl_show_Locastion As Label";
act_profile.mostCurrent._lbl_show_locastion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lbl_Listi As Label";
act_profile.mostCurrent._lbl_listi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private lbl_Default As Label";
act_profile.mostCurrent._lbl_default = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private BtnShowMoeen As Label";
act_profile.mostCurrent._btnshowmoeen = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim GotoPage As Boolean";
act_profile._gotopage = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 40;BA.debugLine="Dim DialogNewVisit As CustomLayoutDialog";
act_profile.mostCurrent._dialognewvisit = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
 //BA.debugLineNum = 41;BA.debugLine="Private LblDate As Label";
act_profile.mostCurrent._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Dim MPD As ManamPersianDate";
act_profile.mostCurrent._mpd = RemoteObject.createNew ("com.b4a.manamsoftware.PersianDate.ManamPersianDate");
 //BA.debugLineNum = 44;BA.debugLine="Private TxtDesc As EditText";
act_profile.mostCurrent._txtdesc = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Dim jobInternet As HttpJob";
act_profile.mostCurrent._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");
 //BA.debugLineNum = 48;BA.debugLine="Private lblTasvie As Label";
act_profile.mostCurrent._lbltasvie = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Dim mande As String=0";
act_profile.mostCurrent._mande = BA.NumberToString(0);
 //BA.debugLineNum = 50;BA.debugLine="Private LblCode As Label";
act_profile.mostCurrent._lblcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private LblBlackList As Label";
act_profile.mostCurrent._lblblacklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private LblMandeEtebar As Label";
act_profile.mostCurrent._lblmandeetebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private PnlNextVisit As Panel";
act_profile.mostCurrent._pnlnextvisit = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gps_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("Gps_LocationChanged (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,559);
if (RapidSub.canDelegate("gps_locationchanged")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","gps_locationchanged", _location1);}
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 559;BA.debugLine="Sub Gps_LocationChanged (Location1 As Location)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 561;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,292);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","hlv_getitemcount");}
 BA.debugLineNum = 292;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="Return ListFaktor.Size '/ItemList.Size";
Debug.ShouldStop(16);
if (true) return act_profile.mostCurrent._listfaktor.runMethod(true,"getSize");
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_onBindViewHolder (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,286);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recfaktor");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 286;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="Dim item As AdapterListFaktor=ListFaktor.Get(Posi";
Debug.ShouldStop(1073741824);
_item = (act_profile.mostCurrent._listfaktor.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 288;BA.debugLine="Dim rec As cls_RecFaktor=Parent.Tag";
Debug.ShouldStop(-2147483648);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 289;BA.debugLine="rec.show(item)";
Debug.ShouldStop(1);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recfaktor.class, "_show" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 290;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(2);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recfaktor.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_oncreateviewholder(RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,280);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recfaktor");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 280;BA.debugLine="Private Sub HLV_onCreateViewHolder (Parent As Pane";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="Dim rec As cls_RecFaktor";
Debug.ShouldStop(16777216);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recfaktor");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 282;BA.debugLine="rec.Initialize";
Debug.ShouldStop(33554432);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recfaktor.class, "_initialize" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA);
 BA.debugLineNum = 283;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(67108864);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recfaktor.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_profile.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_profile.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recfaktor.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 284;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(134217728);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 285;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("JobDone (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,792);
if (RapidSub.canDelegate("jobdone")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","jobdone", _job);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 792;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 793;BA.debugLine="Job.GetRequest.Timeout=50000";
Debug.ShouldStop(16777216);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 794;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(33554432);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 796;BA.debugLine="Dim Str As String = Job.GetString";
Debug.ShouldStop(134217728);
_str = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 797;BA.debugLine="If Str <> \"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 798;BA.debugLine="Select Case Job.JobName";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("GetLocation"))) {
case 0: {
 BA.debugLineNum = 800;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 801;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
act_profile.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 802;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نش";
Debug.ShouldStop(2);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نشده است")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 804;BA.debugLine="LoadGetLocation(Str)";
Debug.ShouldStop(8);
_loadgetlocation(_str);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 808;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(128);
act_profile.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 }else {
 BA.debugLineNum = 812;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
act_profile.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 BA.debugLineNum = 815;BA.debugLine="jobInternet.Release";
Debug.ShouldStop(16384);
act_profile.mostCurrent._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 816;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _kaladefault() throws Exception{
try {
		Debug.PushSubsStack("KalaDefault (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,535);
if (RapidSub.canDelegate("kaladefault")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","kaladefault");}
 BA.debugLineNum = 535;BA.debugLine="Sub KalaDefault";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 543;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(1073741824);
act_profile.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((act_profile.mostCurrent._act_kaladefault.getObject())));
 BA.debugLineNum = 546;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _kalalisti() throws Exception{
try {
		Debug.PushSubsStack("Kalalisti (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,547);
if (RapidSub.canDelegate("kalalisti")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","kalalisti");}
 BA.debugLineNum = 547;BA.debugLine="Sub Kalalisti";
Debug.ShouldStop(4);
 BA.debugLineNum = 555;BA.debugLine="StartActivity(Act_Kala_listi)";
Debug.ShouldStop(1024);
act_profile.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((act_profile.mostCurrent._act_kala_listi.getObject())));
 BA.debugLineNum = 558;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_default_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_Default_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,348);
if (RapidSub.canDelegate("lbl_default_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","lbl_default_click");}
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 348;BA.debugLine="Sub lbl_Default_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="GotoPage = False";
Debug.ShouldStop(268435456);
act_profile._gotopage = act_profile.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 350;BA.debugLine="ProgressDialogShow(\"\")";
Debug.ShouldStop(536870912);
act_profile.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_profile.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 353;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian2";
Debug.ShouldStop(1);
_date = act_profile.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(act_profile.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA)));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 354;BA.debugLine="MCode.FaktorSelect=\"\"";
Debug.ShouldStop(2);
act_profile.mostCurrent._mcode._faktorselect /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 355;BA.debugLine="MCode.Action=\"SabtFaktor\"";
Debug.ShouldStop(4);
act_profile.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtFaktor");
 BA.debugLineNum = 357;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from Tb";
Debug.ShouldStop(16);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_profile.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 358;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 359;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Set";
Debug.ShouldStop(64);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblLogVisitSefaresh Set FldVisit = '"),_date,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 361;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefares";
Debug.ShouldStop(256);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_date,RemoteObject.createImmutable("','','','','')"))));
 };
 BA.debugLineNum = 363;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldLastVi";
Debug.ShouldStop(1024);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set FldLastVisit = '"),_date,RemoteObject.createImmutable("' Where fldCodetafzili = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 364;BA.debugLine="MCode.SaveUpdate(\"Update TblVisitorTour Set FldLa";
Debug.ShouldStop(2048);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblVisitorTour Set FldLastVisit = '"),_date,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 367;BA.debugLine="SaveLastSeen";
Debug.ShouldStop(16384);
_savelastseen();
 BA.debugLineNum = 372;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
Debug.ShouldStop(524288);
act_profile.mostCurrent._pnl_menu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(act_profile.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 374;BA.debugLine="KalaDefault";
Debug.ShouldStop(2097152);
_kaladefault();
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_listi_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_Listi_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,379);
if (RapidSub.canDelegate("lbl_listi_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","lbl_listi_click");}
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 379;BA.debugLine="Sub lbl_Listi_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 380;BA.debugLine="GotoPage = True";
Debug.ShouldStop(134217728);
act_profile._gotopage = act_profile.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 381;BA.debugLine="ProgressDialogShow(\"\")";
Debug.ShouldStop(268435456);
act_profile.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_profile.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 382;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
Debug.ShouldStop(536870912);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Delete From TblSabad")));
 BA.debugLineNum = 383;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian2";
Debug.ShouldStop(1073741824);
_date = act_profile.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(act_profile.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA)));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 385;BA.debugLine="MCode.FaktorSelect=\"\"";
Debug.ShouldStop(1);
act_profile.mostCurrent._mcode._faktorselect /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 386;BA.debugLine="MCode.Action=\"SabtFaktor\"";
Debug.ShouldStop(2);
act_profile.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtFaktor");
 BA.debugLineNum = 388;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from Tb";
Debug.ShouldStop(8);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_profile.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 389;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 390;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Set";
Debug.ShouldStop(32);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblLogVisitSefaresh Set FldVisit = '"),_date,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 392;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefares";
Debug.ShouldStop(128);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"),act_profile.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_date,RemoteObject.createImmutable("','','','','')"))));
 };
 BA.debugLineNum = 395;BA.debugLine="MCode.SaveUpdate(\"Update TblVisitorTour Set FldLa";
Debug.ShouldStop(1024);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblVisitorTour Set FldLastVisit = '"),_date,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 398;BA.debugLine="SaveLastSeen";
Debug.ShouldStop(8192);
_savelastseen();
 BA.debugLineNum = 403;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
Debug.ShouldStop(262144);
act_profile.mostCurrent._pnl_menu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(act_profile.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 405;BA.debugLine="Kalalisti";
Debug.ShouldStop(1048576);
_kalalisti();
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lbl_sabt_locastion_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_sabt_Locastion_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,593);
if (RapidSub.canDelegate("lbl_sabt_locastion_click")) { ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","lbl_sabt_locastion_click"); return;}
ResumableSub_lbl_sabt_Locastion_Click rsub = new ResumableSub_lbl_sabt_Locastion_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lbl_sabt_Locastion_Click extends BA.ResumableSub {
public ResumableSub_lbl_sabt_Locastion_Click(ir.parsikhesab.pakhsh.act_profile parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_profile parent;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lbl_sabt_Locastion_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,593);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 594;BA.debugLine="pnl_location.SetVisibleAnimated(600,False)";
Debug.ShouldStop(131072);
parent.mostCurrent._pnl_location.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 597;BA.debugLine="If Gps.GPSEnabled=False Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",parent._gps.runMethod(true,"getGPSEnabled"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 16;
 BA.debugLineNum = 598;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 599;BA.debugLine="StartActivity(Gps.LocationSettingsIntent)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((parent._gps.runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 601;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldLat,F";
Debug.ShouldStop(16777216);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldLat,FldLon From TblAshkhas Where fldCodetafzili = '"),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("' And FldLat <> '0' And FldLon <> '0'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 602;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 6:
//if
this.state = 15;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 8;
}else {
this.state = 14;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 603;BA.debugLine="Msgbox2Async(\"برای این مشتری موقعیت ثبت شده اس";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("برای این مشتری موقعیت ثبت شده است آیا مایلید موقعیت را اصلاح کنید؟")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),act_profile.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 604;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", act_profile.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_profile", "lbl_sabt_locastion_click"), null);
this.state = 17;
return;
case 17:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 605;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(268435456);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 607;BA.debugLine="StartActivity(Act_SaveLocation)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((parent.mostCurrent._act_savelocation.getObject())));
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 611;BA.debugLine="StartActivity(Act_SaveLocation)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((parent.mostCurrent._act_savelocation.getObject())));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 615;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _lbl_show_locastion_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_show_Locastion_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,563);
if (RapidSub.canDelegate("lbl_show_locastion_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","lbl_show_locastion_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.gps.LocationWrapper");
 BA.debugLineNum = 563;BA.debugLine="Sub lbl_show_Locastion_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 564;BA.debugLine="pnl_location.SetVisibleAnimated(600,False)";
Debug.ShouldStop(524288);
act_profile.mostCurrent._pnl_location.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(act_profile.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 567;BA.debugLine="If Gps.GPSEnabled=False Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",act_profile._gps.runMethod(true,"getGPSEnabled"),act_profile.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 568;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید";
Debug.ShouldStop(8388608);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 569;BA.debugLine="StartActivity(Gps.LocationSettingsIntent)";
Debug.ShouldStop(16777216);
act_profile.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((act_profile._gps.runMethod(false,"getLocationSettingsIntent"))));
 }else {
 BA.debugLineNum = 571;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_profile.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodetafzili = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("' And FldLat <> '0' And FldLon <> '0'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 572;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 573;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 574;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(536870912);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 575;BA.debugLine="Dim l As Location";
Debug.ShouldStop(1073741824);
_l = RemoteObject.createNew ("anywheresoftware.b4a.gps.LocationWrapper");Debug.locals.put("l", _l);
 BA.debugLineNum = 576;BA.debugLine="l.Initialize";
Debug.ShouldStop(-2147483648);
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 577;BA.debugLine="l.Latitude=Cu.GetString(\"FldLat\")";
Debug.ShouldStop(1);
_l.runMethod(true,"setLatitude",BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLat")))));
 BA.debugLineNum = 578;BA.debugLine="l.Longitude=Cu.GetString(\"FldLon\")";
Debug.ShouldStop(2);
_l.runMethod(true,"setLongitude",BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLon")))));
 BA.debugLineNum = 579;BA.debugLine="Act_ShowLocation.Location=l";
Debug.ShouldStop(4);
act_profile.mostCurrent._act_showlocation._location /*RemoteObject*/  = _l;
 BA.debugLineNum = 580;BA.debugLine="Act_ShowLocation.Name=Cu.GetString(\"fldSharheT";
Debug.ShouldStop(8);
act_profile.mostCurrent._act_showlocation._name /*RemoteObject*/  = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili")));
 BA.debugLineNum = 581;BA.debugLine="StartActivity(Act_ShowLocation)";
Debug.ShouldStop(16);
act_profile.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((act_profile.mostCurrent._act_showlocation.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_profile.processBA, e18.toString()); BA.debugLineNum = 583;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نگر";
Debug.ShouldStop(64);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نگردیده است")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 };
 }else {
 BA.debugLineNum = 587;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نگرد";
Debug.ShouldStop(1024);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نگردیده است")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 };
 };
 BA.debugLineNum = 591;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,656);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","lblback_click");}
 BA.debugLineNum = 656;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 658;BA.debugLine="PnlNextVisit.Visible=False";
Debug.ShouldStop(131072);
act_profile.mostCurrent._pnlnextvisit.runMethod(true,"setVisible",act_profile.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 659;BA.debugLine="MCode.AnimationClose(PnlNextVisit)";
Debug.ShouldStop(262144);
act_profile.mostCurrent._mcode.runVoidMethod ("_animationclose" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)((act_profile.mostCurrent._pnlnextvisit.getObject())));
 BA.debugLineNum = 660;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblcall_click() throws Exception{
try {
		Debug.PushSubsStack("lblCall_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,622);
if (RapidSub.canDelegate("lblcall_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","lblcall_click");}
RemoteObject _ispos = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 622;BA.debugLine="Sub lblCall_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 623;BA.debugLine="Dim isPos As Int = myCode.getSetting(\"setting.dat";
Debug.ShouldStop(16384);
_ispos = BA.numberCast(int.class, act_profile.mostCurrent._mycode.runMethod(true,"_getsetting" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(BA.ObjectToString("setting.dat")),(Object)(BA.ObjectToString("isPos")),(Object)(BA.NumberToString(0))));Debug.locals.put("isPos", _ispos);Debug.locals.put("isPos", _ispos);
 BA.debugLineNum = 624;BA.debugLine="Select Case isPos";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(_ispos,BA.numberCast(int.class, 1),BA.numberCast(int.class, 0))) {
case 0: {
 BA.debugLineNum = 626;BA.debugLine="ToastMessageShow(\"این امکان فقط برای تلفن همراه";
Debug.ShouldStop(131072);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("این امکان فقط برای تلفن همراه است")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 break; }
case 1: {
 BA.debugLineNum = 628;BA.debugLine="Dim str As String=LblTell.tag";
Debug.ShouldStop(524288);
_str = BA.ObjectToString(act_profile.mostCurrent._lbltell.runMethod(false,"getTag"));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 629;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(1048576);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 630;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"tel:\"&str)";
Debug.ShouldStop(2097152);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tel:"),_str)));
 BA.debugLineNum = 631;BA.debugLine="StartActivity(i)";
Debug.ShouldStop(4194304);
act_profile.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((_i.getObject())));
 break; }
}
;
 BA.debugLineNum = 635;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbldate_click() throws Exception{
try {
		Debug.PushSubsStack("LblDate_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,662);
if (RapidSub.canDelegate("lbldate_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","lbldate_click");}
RemoteObject _p1 = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 662;BA.debugLine="Sub LblDate_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 663;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
Debug.ShouldStop(4194304);
_p1 = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 664;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
Debug.ShouldStop(8388608);
_p1.runVoidMethod ("Initialize",act_profile.mostCurrent.activityBA,(Object)(BA.ObjectToString("p1")),(Object)(_p1.runMethod(true,"getPersianYear")),(Object)(_p1.runMethod(true,"getPersianMonth")),(Object)(_p1.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 665;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(16777216);
_p1.runMethod(true,"setAccentColor",act_profile.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 666;BA.debugLine="p1.OkText = \"تایید\"";
Debug.ShouldStop(33554432);
_p1.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 667;BA.debugLine="p1.CancelText = \"لغو\"";
Debug.ShouldStop(67108864);
_p1.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 668;BA.debugLine="p1.Title = \"تا تاریخ\"";
Debug.ShouldStop(134217728);
_p1.runVoidMethod ("setTitle",BA.ObjectToString("تا تاریخ"));
 BA.debugLineNum = 669;BA.debugLine="p1.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
Debug.ShouldStop(268435456);
_p1.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmobile(fanum)_bold.ttf"));
 BA.debugLineNum = 670;BA.debugLine="p1.Show(\"p1\")";
Debug.ShouldStop(536870912);
_p1.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p1")));
 BA.debugLineNum = 671;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbldesc_click() throws Exception{
try {
		Debug.PushSubsStack("LblDesc_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,713);
if (RapidSub.canDelegate("lbldesc_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","lbldesc_click");}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _nextvisitdate = RemoteObject.createImmutable("");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lastdate = RemoteObject.createImmutable("");
RemoteObject _nextvisittext = RemoteObject.createImmutable("");
 BA.debugLineNum = 713;BA.debugLine="Sub LblDesc_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 714;BA.debugLine="Dim Str As String";
Debug.ShouldStop(512);
_str = RemoteObject.createImmutable("");Debug.locals.put("Str", _str);
 BA.debugLineNum = 715;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select * From TblA";
Debug.ShouldStop(1024);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_profile.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodetafzili = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 716;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 717;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(4096);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 718;BA.debugLine="Dim nextVisitDate As String = myCode.Is_Null(Cu.";
Debug.ShouldStop(8192);
_nextvisitdate = act_profile.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nextVisitDate")))));Debug.locals.put("nextVisitDate", _nextvisitdate);Debug.locals.put("nextVisitDate", _nextvisitdate);
 BA.debugLineNum = 719;BA.debugLine="Dim Lst As List = MCode.Sf.Split(nextVisitDate.R";
Debug.ShouldStop(16384);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_profile.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(_nextvisitdate.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("/")))),(Object)(RemoteObject.createImmutable("T")));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 720;BA.debugLine="If nextVisitDate.Length>0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_nextvisitdate.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 721;BA.debugLine="Dim DT As List = MCode.Sf.Split(Lst.Get(0),\"/\")";
Debug.ShouldStop(65536);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dt = act_profile.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("DT", _dt);Debug.locals.put("DT", _dt);
 BA.debugLineNum = 722;BA.debugLine="Dim lastDate As String = MCode.PersianDate.getD";
Debug.ShouldStop(131072);
_lastdate = act_profile.mostCurrent._mcode._persiandate /*RemoteObject*/ .runMethod(true,"getDate",(Object)(BA.numberCast(int.class, _dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(int.class, _dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(int.class, _dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))))),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("lastDate", _lastdate);Debug.locals.put("lastDate", _lastdate);
 BA.debugLineNum = 723;BA.debugLine="Str = \"آخرین تاریخ ثبت شده: \" & lastDate & CRLF";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(RemoteObject.createImmutable("آخرین تاریخ ثبت شده: "),_lastdate,act_profile.mostCurrent.__c.getField(true,"CRLF"));Debug.locals.put("Str", _str);
 }else {
 BA.debugLineNum = 725;BA.debugLine="Str = \"آخرین تاریخ ثبت شده: //\" & CRLF";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(RemoteObject.createImmutable("آخرین تاریخ ثبت شده: //"),act_profile.mostCurrent.__c.getField(true,"CRLF"));Debug.locals.put("Str", _str);
 };
 BA.debugLineNum = 728;BA.debugLine="Dim nextVisitText As String = myCode.Is_Null(Cu.";
Debug.ShouldStop(8388608);
_nextvisittext = act_profile.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nextVisitText")))));Debug.locals.put("nextVisitText", _nextvisittext);Debug.locals.put("nextVisitText", _nextvisittext);
 BA.debugLineNum = 729;BA.debugLine="If nextVisitText.Length>0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_nextvisittext.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 730;BA.debugLine="Str = Str & \"آخرین یادداشت ثبت شده: \" & Cu.GetS";
Debug.ShouldStop(33554432);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("آخرین یادداشت ثبت شده: "),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nextVisitText"))));Debug.locals.put("Str", _str);
 }else {
 BA.debugLineNum = 732;BA.debugLine="Str = Str & \"آخرین یادداشت ثبت شده: ...\"";
Debug.ShouldStop(134217728);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable("آخرین یادداشت ثبت شده: ..."));Debug.locals.put("Str", _str);
 };
 BA.debugLineNum = 734;BA.debugLine="MsgboxAsync(Str,\"\")";
Debug.ShouldStop(536870912);
act_profile.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(_str)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),act_profile.processBA);
 };
 BA.debugLineNum = 736;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbltasvie_click() throws Exception{
try {
		Debug.PushSubsStack("lblTasvie_Click (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,827);
if (RapidSub.canDelegate("lbltasvie_click")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","lbltasvie_click");}
 BA.debugLineNum = 827;BA.debugLine="Private Sub lblTasvie_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 828;BA.debugLine="Act_Mali.ShomareFactor=0";
Debug.ShouldStop(134217728);
act_profile.mostCurrent._act_mali._shomarefactor /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 829;BA.debugLine="Act_Mali.MabalghGhablepardakht=mande";
Debug.ShouldStop(268435456);
act_profile.mostCurrent._act_mali._mabalghghablepardakht /*RemoteObject*/  = act_profile.mostCurrent._mande;
 BA.debugLineNum = 830;BA.debugLine="Act_Mali.CodeMoshtari=MCode.C_Tafzili";
Debug.ShouldStop(536870912);
act_profile.mostCurrent._act_mali._codemoshtari /*RemoteObject*/  = act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ;
 BA.debugLineNum = 831;BA.debugLine="Act_Mali.NameMoshtari=MCode.N_Tafzili";
Debug.ShouldStop(1073741824);
act_profile.mostCurrent._act_mali._namemoshtari /*RemoteObject*/  = act_profile.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ;
 BA.debugLineNum = 832;BA.debugLine="Act_Mali.ShomareTell=LblTell.Text";
Debug.ShouldStop(-2147483648);
act_profile.mostCurrent._act_mali._shomaretell /*RemoteObject*/  = act_profile.mostCurrent._lbltell.runMethod(true,"getText");
 BA.debugLineNum = 833;BA.debugLine="StartActivity(Act_Mali)";
Debug.ShouldStop(1);
act_profile.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((act_profile.mostCurrent._act_mali.getObject())));
 BA.debugLineNum = 834;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetlocation(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetLocation (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,743);
if (RapidSub.canDelegate("loadgetlocation")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","loadgetlocation", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 743;BA.debugLine="Sub LoadGetLocation(Str As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 744;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(128);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 745;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(256);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 746;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(512);
act_profile.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 747;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(1024);
_rowslist = act_profile.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 748;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(2048);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 749;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(4096);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 750;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8192);
act_profile.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 751;BA.debugLine="ShowMap(Row.Get(\"FldLat\"), Row.Get(\"FldLon\"))";
Debug.ShouldStop(16384);
_showmap(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldLat"))))),BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldLon"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 753;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadlistfaktor() throws Exception{
try {
		Debug.PushSubsStack("LoadListFaktor (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,295);
if (RapidSub.canDelegate("loadlistfaktor")) { ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","loadlistfaktor"); return;}
ResumableSub_LoadListFaktor rsub = new ResumableSub_LoadListFaktor(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadListFaktor extends BA.ResumableSub {
public ResumableSub_LoadListFaktor(ir.parsikhesab.pakhsh.act_profile parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_profile parent;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");
RemoteObject _sd = RemoteObject.createImmutable("");
int step5;
int limit5;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadListFaktor (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,295);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 296;BA.debugLine="Sleep(200)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_profile.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_profile", "loadlistfaktor"),BA.numberCast(int.class, 200));
this.state = 27;
return;
case 27:
//C
this.state = 1;
;
 BA.debugLineNum = 297;BA.debugLine="ListFaktor.Clear";
Debug.ShouldStop(256);
parent.mostCurrent._listfaktor.runVoidMethod ("Clear");
 BA.debugLineNum = 299;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(1024);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblFaktor Where FldC_Tafzili = '"),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'  Group by FldShomareFaktor,FldTotalFaktor,FldDate,FldTime Order By Cast(FldShomareFaktor As Int)"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 300;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 26;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 301;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//for
this.state = 25;
step5 = 1;
limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 28;
if (true) break;

case 28:
//C
this.state = 25;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 6;
if (true) break;

case 29:
//C
this.state = 28;
_i = ((int)(0 + _i + step5)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 302;BA.debugLine="Try";
Debug.ShouldStop(8192);
if (true) break;

case 7:
//try
this.state = 24;
this.catchState = 23;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 23;
 BA.debugLineNum = 303;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(16384);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 304;BA.debugLine="Dim Item As AdapterListFaktor";
Debug.ShouldStop(32768);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");Debug.locals.put("Item", _item);
 BA.debugLineNum = 305;BA.debugLine="Item.FldShomareFaktor=Cu.GetString(\"FldShomare";
Debug.ShouldStop(65536);
_item.setField ("fldShomareFaktor" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))));
 BA.debugLineNum = 306;BA.debugLine="If Cu.GetString(\"FldShomareBargasht\")<>0 And C";
Debug.ShouldStop(131072);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareBargasht"))),BA.NumberToString(0)) && RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareBargasht"))))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 307;BA.debugLine="Item.FldShomareBargasht=Cu.GetString(\"FldShom";
Debug.ShouldStop(262144);
_item.setField ("FldShomareBargasht" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareBargasht"))));
 BA.debugLineNum = 308;BA.debugLine="Item.wIsBacked=True";
Debug.ShouldStop(524288);
_item.setField ("wIsBacked" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 310;BA.debugLine="Item.wIsBacked=False";
Debug.ShouldStop(2097152);
_item.setField ("wIsBacked" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 311;BA.debugLine="Item.FldShomareBargasht=0";
Debug.ShouldStop(4194304);
_item.setField ("FldShomareBargasht" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 314;BA.debugLine="Item.FldTotalFaktor=Cu.GetString(\"FldTotalFakt";
Debug.ShouldStop(33554432);
_item.setField ("fldTotalFaktor" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))));
 BA.debugLineNum = 315;BA.debugLine="Item.fldC_Ashkhas=Cu.GetString(\"FldC_Tafzili\")";
Debug.ShouldStop(67108864);
_item.setField ("fldC_Ashkhas" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Tafzili"))));
 BA.debugLineNum = 316;BA.debugLine="Item.fldTozihFaktor = myCode.Is_Null( Cu.GetSt";
Debug.ShouldStop(134217728);
_item.setField ("fldTozihFaktor" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTozihat"))))));
 BA.debugLineNum = 317;BA.debugLine="Log(\">>\"&Item.fldC_Ashkhas)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","556885270",RemoteObject.concat(RemoteObject.createImmutable(">>"),_item.getField(true,"fldC_Ashkhas" /*RemoteObject*/ )),0);
 BA.debugLineNum = 318;BA.debugLine="Item.C_Name = LblName.Text";
Debug.ShouldStop(536870912);
_item.setField ("C_Name" /*RemoteObject*/ ,parent.mostCurrent._lblname.runMethod(true,"getText"));
 BA.debugLineNum = 319;BA.debugLine="Item.fldC_Tasvie=Cu.GetString(\"FldVaziatPardak";
Debug.ShouldStop(1073741824);
_item.setField ("fldC_Tasvie" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVaziatPardakht"))));
 BA.debugLineNum = 320;BA.debugLine="Log(myCode.Is_Null(Cu.GetString(\"FldSync\")))";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","556885273",parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSync"))))),0);
 BA.debugLineNum = 321;BA.debugLine="If myCode.Is_Null(Cu.GetString(\"FldSync\"))=\"Tr";
Debug.ShouldStop(1);
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSync"))))),BA.ObjectToString("True"))) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 322;BA.debugLine="Item.synced=True";
Debug.ShouldStop(2);
_item.setField ("synced" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 324;BA.debugLine="Item.synced=False";
Debug.ShouldStop(8);
_item.setField ("synced" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 21:
//C
this.state = 24;
;
 BA.debugLineNum = 326;BA.debugLine="Dim MPD As ManamPersianDate";
Debug.ShouldStop(32);
parent.mostCurrent._mpd = RemoteObject.createNew ("com.b4a.manamsoftware.PersianDate.ManamPersianDate");
 BA.debugLineNum = 327;BA.debugLine="Dim sd As String	= myCode.Is_Null(Cu.GetString";
Debug.ShouldStop(64);
_sd = parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDate")))));Debug.locals.put("sd", _sd);Debug.locals.put("sd", _sd);
 BA.debugLineNum = 328;BA.debugLine="Log(sd)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","556885281",_sd,0);
 BA.debugLineNum = 330;BA.debugLine="Item.FldDate=Cu.GetString(\"FldDate\")";
Debug.ShouldStop(512);
_item.setField ("fldDate" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDate"))));
 BA.debugLineNum = 331;BA.debugLine="Item.FldTime=Cu.GetString(\"FldTime\")";
Debug.ShouldStop(1024);
_item.setField ("fldTime" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTime"))));
 BA.debugLineNum = 332;BA.debugLine="ListFaktor.Add(Item)";
Debug.ShouldStop(2048);
parent.mostCurrent._listfaktor.runVoidMethod ("Add",(Object)((_item)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 BA.debugLineNum = 334;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","556885287",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_profile.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 29;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 337;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(65536);
parent.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 339;BA.debugLine="Log(ListFaktor.Size)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","556885292",BA.NumberToString(parent.mostCurrent._listfaktor.runMethod(true,"getSize")),0);
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_profile.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _mapfragment1_ready() throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,472);
if (RapidSub.canDelegate("mapfragment1_ready")) { ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","mapfragment1_ready"); return;}
ResumableSub_MapFragment1_Ready rsub = new ResumableSub_MapFragment1_Ready(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MapFragment1_Ready extends BA.ResumableSub {
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_profile parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_profile parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,472);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 473;BA.debugLine="Sleep(100)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_profile.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_profile", "mapfragment1_ready"),BA.numberCast(int.class, 100));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
 BA.debugLineNum = 474;BA.debugLine="Try";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 475;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(67108864);
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 BA.debugLineNum = 476;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOC";
Debug.ShouldStop(134217728);
parent.mostCurrent._rp.runVoidMethod ("CheckAndRequest",act_profile.processBA,(Object)(parent.mostCurrent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 477;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_profile.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_profile", "mapfragment1_ready"), null);
this.state = 14;
return;
case 14:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 478;BA.debugLine="If Result Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 9;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 479;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(1073741824);
parent.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 481;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","557278473",RemoteObject.createImmutable("No permission!"),0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 484;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","557278476",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_profile.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 487;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_profile.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _opendialognewvisit() throws Exception{
try {
		Debug.PushSubsStack("OpenDialogNewVisit (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,641);
if (RapidSub.canDelegate("opendialognewvisit")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","opendialognewvisit");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 641;BA.debugLine="Sub OpenDialogNewVisit";
Debug.ShouldStop(1);
 BA.debugLineNum = 642;BA.debugLine="PnlNextVisit.Visible=True";
Debug.ShouldStop(2);
act_profile.mostCurrent._pnlnextvisit.runMethod(true,"setVisible",act_profile.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 643;BA.debugLine="MCode.AnimationOpen(PnlNextVisit)";
Debug.ShouldStop(4);
act_profile.mostCurrent._mcode.runVoidMethod ("_animationopen" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)((act_profile.mostCurrent._pnlnextvisit.getObject())));
 BA.debugLineNum = 645;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(16);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_profile.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblNextVisit Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 646;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 647;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(64);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 648;BA.debugLine="TxtDesc.Text = Cu.GetString(\"NextVisitText\")";
Debug.ShouldStop(128);
act_profile.mostCurrent._txtdesc.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NextVisitText")))));
 BA.debugLineNum = 651;BA.debugLine="Dim DT As List = MCode.Sf.Split(Cu.GetString(\"Ne";
Debug.ShouldStop(1024);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dt = act_profile.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NextVisitDate")))),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("DT", _dt);Debug.locals.put("DT", _dt);
 BA.debugLineNum = 652;BA.debugLine="LblDate.Text = MCode.PersianDate.getDate(DT.Get(";
Debug.ShouldStop(2048);
act_profile.mostCurrent._lbldate.runMethod(true,"setText",BA.ObjectToCharSequence(act_profile.mostCurrent._mcode._persiandate /*RemoteObject*/ .runMethod(true,"getDate",(Object)(BA.numberCast(int.class, _dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(int.class, _dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(int.class, _dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))))),(Object)(RemoteObject.createImmutable("/")))));
 };
 BA.debugLineNum = 654;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_oncancel() throws Exception{
try {
		Debug.PushSubsStack("p_onCancel (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,678);
if (RapidSub.canDelegate("p_oncancel")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","p_oncancel");}
 BA.debugLineNum = 678;BA.debugLine="Sub p_onCancel";
Debug.ShouldStop(32);
 BA.debugLineNum = 679;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(64);
act_profile.mostCurrent.__c.runVoidMethod ("LogImpl","558195969",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 680;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_ondateset(RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("p_onDateSet (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,672);
if (RapidSub.canDelegate("p_ondateset")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","p_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 672;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 673;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(1);
act_profile.mostCurrent.__c.runVoidMethod ("LogImpl","558130433",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 674;BA.debugLine="LblDate.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"";
Debug.ShouldStop(2);
act_profile.mostCurrent._lbldate.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_profile.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_profile.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 675;BA.debugLine="LblDate.Tag=MPD.PersianToGregorian(year,month,day";
Debug.ShouldStop(4);
act_profile.mostCurrent._lbldate.runMethod(false,"setTag",(act_profile.mostCurrent._mpd.runMethod(true,"PersianToGregorian",(Object)(_year),(Object)(_month),(Object)(_day)).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")))));
 BA.debugLineNum = 676;BA.debugLine="LogColor(LblDate.Tag,Colors.Magenta)";
Debug.ShouldStop(8);
act_profile.mostCurrent.__c.runVoidMethod ("LogImpl","558130436",BA.ObjectToString(act_profile.mostCurrent._lbldate.runMethod(false,"getTag")),act_profile.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 677;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("p_onDismiss (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,681);
if (RapidSub.canDelegate("p_ondismiss")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","p_ondismiss");}
 BA.debugLineNum = 681;BA.debugLine="Sub p_onDismiss";
Debug.ShouldStop(256);
 BA.debugLineNum = 682;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(512);
act_profile.mostCurrent.__c.runVoidMethod ("LogImpl","558261505",RemoteObject.createImmutable("dismiss"),0);
 BA.debugLineNum = 683;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim Gps As GPS";
act_profile._gps = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 8;BA.debugLine="Private t1 As Timer";
act_profile._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 9;BA.debugLine="Dim T_Gps As Timer";
act_profile._t_gps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 10;BA.debugLine="Dim TourVisit As Boolean";
act_profile._tourvisit = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savegps() throws Exception{
try {
		Debug.PushSubsStack("SaveGps (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,461);
if (RapidSub.canDelegate("savegps")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","savegps");}
 BA.debugLineNum = 461;BA.debugLine="Sub SaveGps";
Debug.ShouldStop(4096);
 BA.debugLineNum = 462;BA.debugLine="If Gps.GPSEnabled=False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",act_profile._gps.runMethod(true,"getGPSEnabled"),act_profile.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 463;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید\"";
Debug.ShouldStop(16384);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 464;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(32768);
act_profile._t1.runMethod(true,"setEnabled",act_profile.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 465;BA.debugLine="StartActivity(Gps.LocationSettingsIntent)";
Debug.ShouldStop(65536);
act_profile.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((act_profile._gps.runMethod(false,"getLocationSettingsIntent"))));
 }else {
 BA.debugLineNum = 467;BA.debugLine="ProgressDialogShow2(\"لطفا تا دریافت موقعیت مکانی";
Debug.ShouldStop(262144);
act_profile.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_profile.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("لطفا تا دریافت موقعیت مکانی صبر کنید")),(Object)(act_profile.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 468;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(524288);
act_profile._t1.runMethod(true,"setEnabled",act_profile.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 470;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savelastseen() throws Exception{
try {
		Debug.PushSubsStack("SaveLastSeen (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,424);
if (RapidSub.canDelegate("savelastseen")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","savelastseen");}
RemoteObject _dateshamsi = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _d = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _maxradif = RemoteObject.createImmutable(0);
 BA.debugLineNum = 424;BA.debugLine="Sub SaveLastSeen";
Debug.ShouldStop(128);
 BA.debugLineNum = 426;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(512);
act_profile.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 428;BA.debugLine="Dim DateShamsi As String = MCode.DatePersian";
Debug.ShouldStop(2048);
_dateshamsi = act_profile.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA);Debug.locals.put("DateShamsi", _dateshamsi);Debug.locals.put("DateShamsi", _dateshamsi);
 BA.debugLineNum = 429;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(4096);
_time = act_profile.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_profile.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 430;BA.debugLine="Dim D As String = DateShamsi & \"T\" & Time";
Debug.ShouldStop(8192);
_d = RemoteObject.concat(_dateshamsi,RemoteObject.createImmutable("T"),_time);Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 431;BA.debugLine="LogColor(\"D: \" & D,Colors.Red)";
Debug.ShouldStop(16384);
act_profile.mostCurrent.__c.runVoidMethod ("LogImpl","557147399",RemoteObject.concat(RemoteObject.createImmutable("D: "),_d),act_profile.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 433;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(65536);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_profile.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblLastSeen Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("' "))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 434;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 435;BA.debugLine="MCode.SaveUpdate(\"Update TblLastSeen Set LastSee";
Debug.ShouldStop(262144);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblLastSeen Set LastSeen = '"),_d,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 437;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLastSeen (FldC_";
Debug.ShouldStop(1048576);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblLastSeen (FldC_Ashkhas,LastSeen) Values ('"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_d,RemoteObject.createImmutable("')"))));
 };
 BA.debugLineNum = 439;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set lastSeen";
Debug.ShouldStop(4194304);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set lastSeen = '"),_d,RemoteObject.createImmutable("' Where fldCodetafzili = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 441;BA.debugLine="If MCode.TourVisitSW And MCode.TourVisit=1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",act_profile.mostCurrent._mcode._tourvisitsw /*RemoteObject*/ ) && RemoteObject.solveBoolean("=",act_profile.mostCurrent._mcode._tourvisit /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 442;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set fldV";
Debug.ShouldStop(33554432);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update tblTourVisitor Set fldVaziat='2',fldTimeVisit='"),_time,RemoteObject.createImmutable("',fldSend='False' Where fldCodeTafzili = '"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("' and fldDateVisit='"),act_profile.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA),RemoteObject.createImmutable("' and fldType='Tour'"))));
 }else {
 BA.debugLineNum = 444;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select C";
Debug.ShouldStop(134217728);
_count = BA.numberCast(int.class, act_profile.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"),act_profile.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_profile.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldType='Free'"))))));Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 445;BA.debugLine="Dim MaxRadif As Int";
Debug.ShouldStop(268435456);
_maxradif = RemoteObject.createImmutable(0);Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 446;BA.debugLine="If Count=0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 447;BA.debugLine="MaxRadif=1";
Debug.ShouldStop(1073741824);
_maxradif = BA.numberCast(int.class, 1);Debug.locals.put("MaxRadif", _maxradif);
 }else {
 BA.debugLineNum = 449;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fldRa";
Debug.ShouldStop(1);
_maxradif = BA.numberCast(int.class, act_profile.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"),act_profile.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_profile.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldType='Free'"))))));Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 450;BA.debugLine="MaxRadif=MaxRadif+1";
Debug.ShouldStop(2);
_maxradif = RemoteObject.solve(new RemoteObject[] {_maxradif,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("MaxRadif", _maxradif);
 };
 BA.debugLineNum = 452;BA.debugLine="Cu = MCode.Result($\"SELECT * FROM TblAshkhas WHE";
Debug.ShouldStop(8);
_cu = act_profile.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM TblAshkhas WHERE TblAshkhas.fldCodetafzili ="),act_profile.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 454;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(32);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 455;BA.debugLine="MCode.SaveUpdate(\"Insert into tblTourVisitor(fld";
Debug.ShouldStop(64);
act_profile.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert into tblTourVisitor(fldRadif,fldCodeSuperVisor,fldCodeGroup,fldCodeVisitor,fldCodeTafzili,fldSharheTafzili,fldDate,fldDateVisit,fldTimeVisit,fldDateNextVisit,fldDateTozie,fldShomareSefaresh,fldTimeSefaresh,fldSharh,fldVaziat,fldShomareFactor,fldSend,fldType) Values("),_maxradif,RemoteObject.createImmutable(",0,'"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroup"))),RemoteObject.createImmutable("','"),act_profile.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("','"),act_profile.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),act_profile.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),act_profile.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA),RemoteObject.createImmutable("','"),act_profile.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA),RemoteObject.createImmutable("','"),_time,RemoteObject.createImmutable("','0','0','0','','0','2','0','False','Free')"))));
 };
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showmap(RemoteObject _lat1,RemoteObject _lon1) throws Exception{
try {
		Debug.PushSubsStack("ShowMap (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,755);
if (RapidSub.canDelegate("showmap")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","showmap", _lat1, _lon1);}
RemoteObject _destlat = RemoteObject.createImmutable(0);
RemoteObject _destlng = RemoteObject.createImmutable(0);
RemoteObject _label = RemoteObject.createImmutable("");
RemoteObject _uri = RemoteObject.createImmutable("");
RemoteObject _intent = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("Lat1", _lat1);
Debug.locals.put("Lon1", _lon1);
 BA.debugLineNum = 755;BA.debugLine="Sub ShowMap(Lat1 As String,Lon1 As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 756;BA.debugLine="If Lat1 =\"\" And Lon1=\"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_lat1,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",_lon1,BA.ObjectToString(""))) { 
 BA.debugLineNum = 757;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نشده ا";
Debug.ShouldStop(1048576);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نشده است")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 758;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 761;BA.debugLine="Dim destLat As Double = Lat1 ' عرض جغرافیایی مقصد";
Debug.ShouldStop(16777216);
_destlat = BA.numberCast(double.class, _lat1);Debug.locals.put("destLat", _destlat);Debug.locals.put("destLat", _destlat);
 BA.debugLineNum = 762;BA.debugLine="Dim destLng As Double = Lon1 ' طول جغرافیایی مقصد";
Debug.ShouldStop(33554432);
_destlng = BA.numberCast(double.class, _lon1);Debug.locals.put("destLng", _destlng);Debug.locals.put("destLng", _destlng);
 BA.debugLineNum = 763;BA.debugLine="Dim label As String = \"Destination\" ' برچسب مقصد";
Debug.ShouldStop(67108864);
_label = BA.ObjectToString("Destination");Debug.locals.put("label", _label);Debug.locals.put("label", _label);
 BA.debugLineNum = 765;BA.debugLine="Dim uri As String";
Debug.ShouldStop(268435456);
_uri = RemoteObject.createImmutable("");Debug.locals.put("uri", _uri);
 BA.debugLineNum = 766;BA.debugLine="uri = \"google.navigation:q=\" & destLat & \",\" & de";
Debug.ShouldStop(536870912);
_uri = RemoteObject.concat(RemoteObject.createImmutable("google.navigation:q="),_destlat,RemoteObject.createImmutable(","),_destlng,RemoteObject.createImmutable("&label="),_label);Debug.locals.put("uri", _uri);
 BA.debugLineNum = 768;BA.debugLine="Dim intent As Intent";
Debug.ShouldStop(-2147483648);
_intent = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("intent", _intent);
 BA.debugLineNum = 769;BA.debugLine="intent.Initialize(intent.ACTION_VIEW, uri)";
Debug.ShouldStop(1);
_intent.runVoidMethod ("Initialize",(Object)(_intent.getField(true,"ACTION_VIEW")),(Object)(_uri));
 BA.debugLineNum = 770;BA.debugLine="intent.SetComponent(\"com.google.android.apps.maps";
Debug.ShouldStop(2);
_intent.runVoidMethod ("SetComponent",(Object)(RemoteObject.createImmutable("com.google.android.apps.maps")));
 BA.debugLineNum = 772;BA.debugLine="If intent.IsInitialized Then";
Debug.ShouldStop(8);
if (_intent.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 773;BA.debugLine="StartActivity(intent)";
Debug.ShouldStop(16);
act_profile.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((_intent.getObject())));
 }else {
 BA.debugLineNum = 775;BA.debugLine="ToastMessageShow(\"Google Maps app not found\", Tr";
Debug.ShouldStop(64);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Google Maps app not found")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 790;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _t1_tick() throws Exception{
try {
		Debug.PushSubsStack("t1_tick (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,489);
if (RapidSub.canDelegate("t1_tick")) { ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","t1_tick"); return;}
ResumableSub_t1_tick rsub = new ResumableSub_t1_tick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_t1_tick extends BA.ResumableSub {
public ResumableSub_t1_tick(ir.parsikhesab.pakhsh.act_profile parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_profile parent;
RemoteObject _cl = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
RemoteObject _lat = RemoteObject.createImmutable("");
RemoteObject _lon = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _date = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("t1_tick (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,489);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 490;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(512);
parent._t1.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 491;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 24;
if (parent.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 492;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 BA.debugLineNum = 493;BA.debugLine="Dim cl As CameraPosition";
Debug.ShouldStop(4096);
_cl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cl", _cl);
 BA.debugLineNum = 494;BA.debugLine="cl.Initialize(gmap.MyLocation.Latitude,gmap.MyL";
Debug.ShouldStop(8192);
_cl.runVoidMethod ("Initialize",(Object)(parent.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLatitude")),(Object)(parent.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLongitude")),(Object)(BA.numberCast(float.class, 15)));
 BA.debugLineNum = 495;BA.debugLine="gmap.AnimateCamera(cl)";
Debug.ShouldStop(16384);
parent.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cl.getObject())));
 BA.debugLineNum = 496;BA.debugLine="Dim Lat As String = gmap.MyLocation.Latitude";
Debug.ShouldStop(32768);
_lat = BA.NumberToString(parent.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLatitude"));Debug.locals.put("Lat", _lat);Debug.locals.put("Lat", _lat);
 BA.debugLineNum = 497;BA.debugLine="Dim Lon As String = gmap.MyLocation.Longitude";
Debug.ShouldStop(65536);
_lon = BA.NumberToString(parent.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLongitude"));Debug.locals.put("Lon", _lon);Debug.locals.put("Lon", _lon);
 BA.debugLineNum = 498;BA.debugLine="Gps.Stop";
Debug.ShouldStop(131072);
parent._gps.runVoidMethod ("Stop");
 BA.debugLineNum = 500;BA.debugLine="Dim Time As String = MCode.ConvertNumbersPersia";
Debug.ShouldStop(524288);
_time = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 501;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersia";
Debug.ShouldStop(1048576);
_date = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 502;BA.debugLine="Date=Date.Replace(\"/\",\"-\") & \" \" & Time & \".000";
Debug.ShouldStop(2097152);
_date = RemoteObject.concat(_date.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-"))),RemoteObject.createImmutable(" "),_time,RemoteObject.createImmutable(".000"));Debug.locals.put("Date", _date);
 BA.debugLineNum = 503;BA.debugLine="LogColor(Date,Colors.Magenta)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","557344014",_date,parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 504;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGpsVisitor (Fl";
Debug.ShouldStop(8388608);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_profile.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"),parent.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_date,RemoteObject.createImmutable("','"),_time,RemoteObject.createImmutable("','"),_lat,RemoteObject.createImmutable("','"),_lon,RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 507;BA.debugLine="LogColor(\"Save Locate: \" & Lat & \"--\" & Lon,Col";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","557344018",RemoteObject.concat(RemoteObject.createImmutable("Save Locate: "),_lat,RemoteObject.createImmutable("--"),_lon),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 508;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 511;BA.debugLine="Wait For UpdateKala";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","updatekala", act_profile.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_profile", "t1_tick"), null);
this.state = 25;
return;
case 25:
//C
this.state = 7;
;
 BA.debugLineNum = 513;BA.debugLine="Select Case GotoPage";
Debug.ShouldStop(1);
if (true) break;

case 7:
//select
this.state = 12;
switch (BA.switchObjectToInt(parent._gotopage,parent.mostCurrent.__c.getField(true,"False"),parent.mostCurrent.__c.getField(true,"True"))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 515;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
Debug.ShouldStop(4);
parent.mostCurrent._pnl_menu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 516;BA.debugLine="KalaDefault";
Debug.ShouldStop(8);
_kaladefault();
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 518;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
Debug.ShouldStop(32);
parent.mostCurrent._pnl_menu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 519;BA.debugLine="StartActivity(Act_Kala_listi)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((parent.mostCurrent._act_kala_listi.getObject())));
 if (true) break;

case 12:
//C
this.state = 15;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 522;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","557344033",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_profile.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 24;
this.catchState = 0;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 525;BA.debugLine="Select Case GotoPage";
Debug.ShouldStop(4096);
if (true) break;

case 18:
//select
this.state = 23;
switch (BA.switchObjectToInt(parent._gotopage,parent.mostCurrent.__c.getField(true,"False"),parent.mostCurrent.__c.getField(true,"True"))) {
case 0: {
this.state = 20;
if (true) break;
}
case 1: {
this.state = 22;
if (true) break;
}
}
if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 527;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
Debug.ShouldStop(16384);
parent.mostCurrent._pnl_menu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 528;BA.debugLine="KalaDefault";
Debug.ShouldStop(32768);
_kaladefault();
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 530;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
Debug.ShouldStop(131072);
parent.mostCurrent._pnl_menu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 531;BA.debugLine="StartActivity(Act_Kala_listi)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_profile.processBA,(Object)((parent.mostCurrent._act_kala_listi.getObject())));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 534;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_profile.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _updatekala() throws Exception{
}
public static RemoteObject  _txtdesc_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtDesc_TextChanged (act_profile) ","act_profile",29,act_profile.mostCurrent.activityBA,act_profile.mostCurrent,686);
if (RapidSub.canDelegate("txtdesc_textchanged")) { return ir.parsikhesab.pakhsh.act_profile.remoteMe.runUserSub(false, "act_profile","txtdesc_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 686;BA.debugLine="Sub TxtDesc_TextChanged (Old As String, New As Str";
Debug.ShouldStop(8192);
 BA.debugLineNum = 687;BA.debugLine="If New.Length>245 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 245))) { 
 BA.debugLineNum = 688;BA.debugLine="ToastMessageShow(\"تعداد حروف می بایست 250 حرف با";
Debug.ShouldStop(32768);
act_profile.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تعداد حروف می بایست 250 حرف باشد")),(Object)(act_profile.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 689;BA.debugLine="TxtDesc.Text = Old";
Debug.ShouldStop(65536);
act_profile.mostCurrent._txtdesc.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_old));
 };
 BA.debugLineNum = 691;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}