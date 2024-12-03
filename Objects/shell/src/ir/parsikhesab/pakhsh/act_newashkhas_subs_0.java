package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_newashkhas_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,72);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 72;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 74;BA.debugLine="Activity.LoadLayout(\"L_NewAshkhas\")";
Debug.ShouldStop(512);
act_newashkhas.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_NewAshkhas")),act_newashkhas.mostCurrent.activityBA);
 BA.debugLineNum = 75;BA.debugLine="Base = Activity";
Debug.ShouldStop(1024);
act_newashkhas.mostCurrent._base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_newashkhas.mostCurrent._activity.getObject());
 BA.debugLineNum = 76;BA.debugLine="Dialog.Initialize (Panel1)";
Debug.ShouldStop(2048);
act_newashkhas.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_newashkhas.mostCurrent._panel1.getObject()));
 BA.debugLineNum = 77;BA.debugLine="Dialog.Title = \"جستجوی گروه اشخاص\"";
Debug.ShouldStop(4096);
act_newashkhas.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("جستجوی گروه اشخاص")));
 BA.debugLineNum = 78;BA.debugLine="SearchTemplate1.Initialize";
Debug.ShouldStop(8192);
act_newashkhas.mostCurrent._searchtemplate1.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA);
 BA.debugLineNum = 79;BA.debugLine="SearchTemplate2.Initialize";
Debug.ShouldStop(16384);
act_newashkhas.mostCurrent._searchtemplate2.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA);
 BA.debugLineNum = 81;BA.debugLine="OriginalListGoroohAshkhas1.Initialize";
Debug.ShouldStop(65536);
act_newashkhas.mostCurrent._originallistgoroohashkhas1.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="OriginalListGoroohAshkhas2.Initialize";
Debug.ShouldStop(131072);
act_newashkhas.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Initialize");
 BA.debugLineNum = 83;BA.debugLine="ListGoroohAshkhas1.Initialize";
Debug.ShouldStop(262144);
act_newashkhas.mostCurrent._listgoroohashkhas1.runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="ListGoroohAshkhas2.Initialize";
Debug.ShouldStop(524288);
act_newashkhas.mostCurrent._listgoroohashkhas2.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="lstSelectedCodeGroupAshkhas.Initialize";
Debug.ShouldStop(1048576);
act_newashkhas.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Initialize");
 BA.debugLineNum = 86;BA.debugLine="lstGroup1.Initialize";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent._lstgroup1.runVoidMethod ("Initialize");
 BA.debugLineNum = 87;BA.debugLine="lstGroup2.Initialize";
Debug.ShouldStop(4194304);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Initialize");
 BA.debugLineNum = 88;BA.debugLine="lstSearchGroup1.Initialize";
Debug.ShouldStop(8388608);
act_newashkhas.mostCurrent._lstsearchgroup1.runVoidMethod ("Initialize");
 BA.debugLineNum = 89;BA.debugLine="lstSearchGroup2.Initialize";
Debug.ShouldStop(16777216);
act_newashkhas.mostCurrent._lstsearchgroup2.runVoidMethod ("Initialize");
 BA.debugLineNum = 90;BA.debugLine="Fused.Initialize(\"FusedLocation\")";
Debug.ShouldStop(33554432);
act_newashkhas.mostCurrent._fused.runVoidMethod ("Initialize",act_newashkhas.processBA,(Object)(RemoteObject.createImmutable("FusedLocation")));
 BA.debugLineNum = 91;BA.debugLine="GPS1.Initialize(\"GPS1\")";
Debug.ShouldStop(67108864);
act_newashkhas._gps1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("GPS1")));
 BA.debugLineNum = 92;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(134217728);
act_newashkhas.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 93;BA.debugLine="t1.Initialize(\"t1\",5000)";
Debug.ShouldStop(268435456);
act_newashkhas._t1.runVoidMethod ("Initialize",act_newashkhas.processBA,(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 5000)));
 BA.debugLineNum = 94;BA.debugLine="CreatePage";
Debug.ShouldStop(536870912);
_createpage();
 BA.debugLineNum = 95;BA.debugLine="If GPS1.GPSEnabled = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",act_newashkhas._gps1.runMethod(true,"getGPSEnabled"),act_newashkhas.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 96;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید";
Debug.ShouldStop(-2147483648);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 97;BA.debugLine="StartActivity(GPS1.LocationSettingsIntent) 'Wil";
Debug.ShouldStop(1);
act_newashkhas.mostCurrent.__c.runVoidMethod ("StartActivity",act_newashkhas.processBA,(Object)((act_newashkhas._gps1.runMethod(false,"getLocationSettingsIntent"))));
 }else {
 BA.debugLineNum = 99;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(4);
act_newashkhas._t1.runMethod(true,"setEnabled",act_newashkhas.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 102;BA.debugLine="Log(Activity.Title)";
Debug.ShouldStop(32);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549479710",BA.ObjectToString(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle")),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e30) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e30.toString()); BA.debugLineNum = 104;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549479712",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 105;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
Debug.ShouldStop(256);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,794);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 794;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 795;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_newashkhas.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 796;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
act_newashkhas.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 797;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return act_newashkhas.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 799;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) return act_newashkhas.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 801;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Pause (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,820);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 820;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 821;BA.debugLine="GPS1.Stop";
Debug.ShouldStop(1048576);
act_newashkhas._gps1.runVoidMethod ("Stop");
 BA.debugLineNum = 822;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Resume (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,803);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","activity_resume");}
 BA.debugLineNum = 803;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 804;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionSt";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA),act_newashkhas.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 805;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود ر";
Debug.ShouldStop(16);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 814;BA.debugLine="If GPS1.GPSEnabled=True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",act_newashkhas._gps1.runMethod(true,"getGPSEnabled"),act_newashkhas.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 815;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(16384);
act_newashkhas._t1.runMethod(true,"setEnabled",act_newashkhas.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 818;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animatedialog(RemoteObject _dlg,RemoteObject _fromedge) throws Exception{
try {
		Debug.PushSubsStack("AnimateDialog (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1230);
if (RapidSub.canDelegate("animatedialog")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","animatedialog", _dlg, _fromedge);}
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
Debug.locals.put("dlg", _dlg);
Debug.locals.put("FromEdge", _fromedge);
 BA.debugLineNum = 1230;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1231;BA.debugLine="Dim Base As B4XView = dlg.Base";
Debug.ShouldStop(16384);
act_newashkhas.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
act_newashkhas.mostCurrent._base = _dlg.getField(false,"_base" /*RemoteObject*/ );
 BA.debugLineNum = 1232;BA.debugLine="Dim top As Int = Base.Top";
Debug.ShouldStop(32768);
_top = act_newashkhas.mostCurrent._base.runMethod(true,"getTop");Debug.locals.put("top", _top);Debug.locals.put("top", _top);
 BA.debugLineNum = 1233;BA.debugLine="Dim left As Int = Base.Left";
Debug.ShouldStop(65536);
_left = act_newashkhas.mostCurrent._base.runMethod(true,"getLeft");Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 1234;BA.debugLine="Select FromEdge.ToLowerCase";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(_fromedge.runMethod(true,"toLowerCase"),BA.ObjectToString("bottom"),BA.ObjectToString("top"),BA.ObjectToString("left"),BA.ObjectToString("right"))) {
case 0: {
 BA.debugLineNum = 1236;BA.debugLine="Base.Top = Base.Parent.Height";
Debug.ShouldStop(524288);
act_newashkhas.mostCurrent._base.runMethod(true,"setTop",act_newashkhas.mostCurrent._base.runMethod(false,"getParent").runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 1238;BA.debugLine="Base.Top = -Base.Height";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent._base.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + act_newashkhas.mostCurrent._base.runMethod(true,"getHeight").<Integer>get().intValue())));
 break; }
case 2: {
 BA.debugLineNum = 1240;BA.debugLine="Base.Left = -Base.Width";
Debug.ShouldStop(8388608);
act_newashkhas.mostCurrent._base.runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + act_newashkhas.mostCurrent._base.runMethod(true,"getWidth").<Integer>get().intValue())));
 break; }
case 3: {
 BA.debugLineNum = 1242;BA.debugLine="Base.Left = Base.Parent.Width";
Debug.ShouldStop(33554432);
act_newashkhas.mostCurrent._base.runMethod(true,"setLeft",act_newashkhas.mostCurrent._base.runMethod(false,"getParent").runMethod(true,"getWidth"));
 break; }
}
;
 BA.debugLineNum = 1244;BA.debugLine="Base.SetLayoutAnimated(300, left, top, Base.Width";
Debug.ShouldStop(134217728);
act_newashkhas.mostCurrent._base.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(_left),(Object)(_top),(Object)(act_newashkhas.mostCurrent._base.runMethod(true,"getWidth")),(Object)(act_newashkhas.mostCurrent._base.runMethod(true,"getHeight")));
 BA.debugLineNum = 1245;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Application_Error (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1197);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 1197;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1199;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) return act_newashkhas.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1200;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("btn_Back_Click (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1193);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","btn_back_click");}
 BA.debugLineNum = 1193;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 1194;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
act_newashkhas.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1195;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnewnumber_click() throws Exception{
try {
		Debug.PushSubsStack("BtnNewNumber_Click (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1188);
if (RapidSub.canDelegate("btnnewnumber_click")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","btnnewnumber_click");}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 1188;BA.debugLine="Sub BtnNewNumber_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1189;BA.debugLine="Dim str As String=DateTime.Now";
Debug.ShouldStop(16);
_str = BA.NumberToString(act_newashkhas.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 1190;BA.debugLine="TxtMob.Text=\"09\"&str.SubString(str.Length-9)";
Debug.ShouldStop(32);
act_newashkhas.mostCurrent._txtmob.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("09"),_str.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),RemoteObject.createImmutable(9)}, "-",1, 1))))));
 BA.debugLineNum = 1191;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsavenewmoshtari_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSaveNewMoshtari_Click (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,915);
if (RapidSub.canDelegate("btnsavenewmoshtari_click")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","btnsavenewmoshtari_click");}
 BA.debugLineNum = 915;BA.debugLine="Sub BtnSaveNewMoshtari_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 916;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 918;BA.debugLine="If TxtName.Text = \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._txtname.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 919;BA.debugLine="ToastMessageShow(\"نام مشتری را وارد نمایید\",Tru";
Debug.ShouldStop(4194304);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نام مشتری را وارد نمایید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 920;BA.debugLine="Return";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 923;BA.debugLine="If MCode.MobileIsImportent=\"1\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._mcode._mobileisimportent /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 924;BA.debugLine="If TxtMob.Text = \"\" And MCode.MobileIsImportent";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._txtmob.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._mcode._mobileisimportent /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 925;BA.debugLine="ToastMessageShow(\"شماره همراه مشتری را وارد نم";
Debug.ShouldStop(268435456);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شماره همراه مشتری را وارد نمایید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 926;BA.debugLine="Return";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 929;BA.debugLine="If (MCode.Sf.Len(TxtMob.Text.Trim) <> 11 And MC";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("!",act_newashkhas.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(act_newashkhas.mostCurrent._txtmob.runMethod(true,"getText").runMethod(true,"trim"))),BA.numberCast(long.class, 11)) && RemoteObject.solveBoolean("!",act_newashkhas.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vv0",(Object)(act_newashkhas.mostCurrent._txtmob.runMethod(true,"getText").runMethod(true,"trim")),(Object)(BA.numberCast(long.class, 2))),RemoteObject.createImmutable("09")))) { 
 BA.debugLineNum = 930;BA.debugLine="ToastMessageShow(\"شماره همراه را به طور کامل و";
Debug.ShouldStop(2);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شماره همراه را به طور کامل و صحیح وارد نمایید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 931;BA.debugLine="Return";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 935;BA.debugLine="If TxtTell.Text<>\"\"  Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",act_newashkhas.mostCurrent._txttell.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 936;BA.debugLine="If MCode.Sf.Len(TxtTell.Text.Trim) <> 11 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",act_newashkhas.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(act_newashkhas.mostCurrent._txttell.runMethod(true,"getText").runMethod(true,"trim"))),BA.numberCast(long.class, 11))) { 
 BA.debugLineNum = 937;BA.debugLine="ToastMessageShow(\"تلفن ثابت را به طور کامل و ص";
Debug.ShouldStop(256);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تلفن ثابت را به طور کامل و صحیح وارد نمایید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 938;BA.debugLine="Return";
Debug.ShouldStop(512);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 943;BA.debugLine="If TxtAddress.Text = \"\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._txtaddress.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 944;BA.debugLine="ToastMessageShow(\"آدرس مشتری را وارد نمایید\",Tr";
Debug.ShouldStop(32768);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("آدرس مشتری را وارد نمایید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 945;BA.debugLine="Return";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 947;BA.debugLine="If CheckSubGroup(GroupCodeSelect)=False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_checksubgroup(BA.NumberToString(act_newashkhas._groupcodeselect)),act_newashkhas.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 948;BA.debugLine="ToastMessageShow(\"امکان ثبت شخص جدید در گروهی ک";
Debug.ShouldStop(524288);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("امکان ثبت شخص جدید در گروهی که زیر گروه دارد وجود ندارد , لطفا در زیر گروه این گروه مد نظر شما ثبت نمایید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 949;BA.debugLine="Return";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 952;BA.debugLine="SaveNewMoshtari";
Debug.ShouldStop(8388608);
_savenewmoshtari();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e32.toString()); BA.debugLineNum = 954;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550659367",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 955;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
Debug.ShouldStop(67108864);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnSaveNewMoshtari_Click"))));
 };
 BA.debugLineNum = 958;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnsearchgroup1_click() throws Exception{
try {
		Debug.PushSubsStack("btnSearchGroup1_Click (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1247);
if (RapidSub.canDelegate("btnsearchgroup1_click")) { ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","btnsearchgroup1_click"); return;}
ResumableSub_btnSearchGroup1_Click rsub = new ResumableSub_btnSearchGroup1_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSearchGroup1_Click extends BA.ResumableSub {
public ResumableSub_btnSearchGroup1_Click(ir.parsikhesab.pakhsh.act_newashkhas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_newashkhas parent;
RemoteObject _rs = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSearchGroup1_Click (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1247);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1249;BA.debugLine="Panel1.BringToFront";
Debug.ShouldStop(1);
parent.mostCurrent._panel1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 1250;BA.debugLine="Panel1.Visible=True";
Debug.ShouldStop(2);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1251;BA.debugLine="SearchTemplate1.SearchField.HintText=\"نام گروه مو";
Debug.ShouldStop(4);
parent.mostCurrent._searchtemplate1.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString("نام گروه مورد نظر را جستجو نمایید"));
 BA.debugLineNum = 1252;BA.debugLine="SearchTemplate1.SearchField.lblClear.Text=\"\"";
Debug.ShouldStop(8);
parent.mostCurrent._searchtemplate1.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1253;BA.debugLine="SearchTemplate1.SearchField.lblV.Text=\"\"";
Debug.ShouldStop(16);
parent.mostCurrent._searchtemplate1.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1254;BA.debugLine="SearchTemplate1.SearchField.Update";
Debug.ShouldStop(32);
parent.mostCurrent._searchtemplate1.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 1255;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
Debug.ShouldStop(64);
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._searchtemplate1)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("انصراف"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1256;BA.debugLine="AnimateDialog(Dialog, \"right\")";
Debug.ShouldStop(128);
_animatedialog(parent.mostCurrent._dialog,RemoteObject.createImmutable("right"));
 BA.debugLineNum = 1257;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_newashkhas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_newashkhas", "btnsearchgroup1_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1258;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1262;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldC_Gor";
Debug.ShouldStop(8192);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldN_Gorooh='"),parent.mostCurrent._searchtemplate1.getField(true,"_selecteditem" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1263;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(16384);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1264;BA.debugLine="GroupCodeSelect1 =  Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(32768);
parent.mostCurrent._groupcodeselect1 = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh")));
 BA.debugLineNum = 1265;BA.debugLine="GroupNameSelect1 =  Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(65536);
parent.mostCurrent._groupnameselect1 = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")));
 BA.debugLineNum = 1266;BA.debugLine="Log(\"کد گروه اشخاص : \"&Cu.GetString(\"FldC_Gorooh";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","551511315",RemoteObject.concat(RemoteObject.createImmutable("کد گروه اشخاص : "),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh")))),0);
 BA.debugLineNum = 1267;BA.debugLine="Log(\"نام گروه اشخاص : \"&Cu.GetString(\"FldN_Goroo";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","551511316",RemoteObject.concat(RemoteObject.createImmutable("نام گروه اشخاص : "),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")))),0);
 BA.debugLineNum = 1272;BA.debugLine="NiceSpinner.Text=GroupNameSelect1";
Debug.ShouldStop(8388608);
parent.mostCurrent._nicespinner.runMethod(true,"setText",(parent.mostCurrent._groupnameselect1));
 BA.debugLineNum = 1273;BA.debugLine="NiceSpinner_item_clicked1";
Debug.ShouldStop(16777216);
_nicespinner_item_clicked1();
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1278;BA.debugLine="GroupCodeSelect1=0";
Debug.ShouldStop(536870912);
parent.mostCurrent._groupcodeselect1 = BA.NumberToString(0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1280;BA.debugLine="Panel1.Visible=False";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1281;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _btnsearchgroup2_click() throws Exception{
try {
		Debug.PushSubsStack("btnSearchGroup2_Click (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1283);
if (RapidSub.canDelegate("btnsearchgroup2_click")) { ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","btnsearchgroup2_click"); return;}
ResumableSub_btnSearchGroup2_Click rsub = new ResumableSub_btnSearchGroup2_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSearchGroup2_Click extends BA.ResumableSub {
public ResumableSub_btnSearchGroup2_Click(ir.parsikhesab.pakhsh.act_newashkhas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_newashkhas parent;
RemoteObject _rs = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSearchGroup2_Click (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1283);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1284;BA.debugLine="If lstSearchGroup2.Size=0 Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._lstsearchgroup2.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1285;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1287;BA.debugLine="Panel1.BringToFront";
Debug.ShouldStop(64);
parent.mostCurrent._panel1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 1288;BA.debugLine="Panel1.Visible=True";
Debug.ShouldStop(128);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1289;BA.debugLine="SearchTemplate2.SearchField.HintText=\"نام گروه مو";
Debug.ShouldStop(256);
parent.mostCurrent._searchtemplate2.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString("نام گروه مورد نظر را جستجو نمایید"));
 BA.debugLineNum = 1290;BA.debugLine="SearchTemplate2.SearchField.lblClear.Text=\"\"";
Debug.ShouldStop(512);
parent.mostCurrent._searchtemplate2.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1291;BA.debugLine="SearchTemplate2.SearchField.lblV.Text=\"\"";
Debug.ShouldStop(1024);
parent.mostCurrent._searchtemplate2.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1292;BA.debugLine="SearchTemplate2.SearchField.Update";
Debug.ShouldStop(2048);
parent.mostCurrent._searchtemplate2.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 1293;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
Debug.ShouldStop(4096);
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._searchtemplate2)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("انصراف"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1294;BA.debugLine="AnimateDialog(Dialog, \"right\")";
Debug.ShouldStop(8192);
_animatedialog(parent.mostCurrent._dialog,RemoteObject.createImmutable("right"));
 BA.debugLineNum = 1295;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_newashkhas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_newashkhas", "btnsearchgroup2_click"), _rs);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1296;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(32768);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 1307;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblGoroohAshkhas where FldN_Gorooh='"),parent.mostCurrent._searchtemplate2.getField(true,"_selecteditem" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1314;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(2);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1315;BA.debugLine="GroupCodeSelect2 =  Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(4);
parent.mostCurrent._groupcodeselect2 = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh")));
 BA.debugLineNum = 1316;BA.debugLine="GroupNameSelect2 =  Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(8);
parent.mostCurrent._groupnameselect2 = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")));
 BA.debugLineNum = 1317;BA.debugLine="Log(\"کد گروه اشخاص : \"&Cu.GetString(\"FldC_Gorooh";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","551576866",RemoteObject.concat(RemoteObject.createImmutable("کد گروه اشخاص : "),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh")))),0);
 BA.debugLineNum = 1318;BA.debugLine="Log(\"نام گروه اشخاص : \"&Cu.GetString(\"FldN_Goroo";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","551576867",RemoteObject.concat(RemoteObject.createImmutable("نام گروه اشخاص : "),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")))),0);
 BA.debugLineNum = 1326;BA.debugLine="NiceSpinner1.Text=GroupNameSelect2";
Debug.ShouldStop(8192);
parent.mostCurrent._nicespinner1.runMethod(true,"setText",(parent.mostCurrent._groupnameselect2));
 BA.debugLineNum = 1327;BA.debugLine="NiceSpinner1_item_clicked1";
Debug.ShouldStop(16384);
_nicespinner1_item_clicked1();
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1330;BA.debugLine="GroupCodeSelect2=0";
Debug.ShouldStop(131072);
parent.mostCurrent._groupcodeselect2 = BA.NumberToString(0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1332;BA.debugLine="Panel1.Visible=False";
Debug.ShouldStop(524288);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1333;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _checksubgroup(RemoteObject _codegroup) throws Exception{
try {
		Debug.PushSubsStack("CheckSubGroup (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,776);
if (RapidSub.canDelegate("checksubgroup")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","checksubgroup", _codegroup);}
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 776;BA.debugLine="Public Sub CheckSubGroup(CodeGroup As String) As B";
Debug.ShouldStop(128);
 BA.debugLineNum = 777;BA.debugLine="Dim mc As String=CodeGroup";
Debug.ShouldStop(256);
_mc = _codegroup;Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 778;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(512);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 779;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Gorooh";
Debug.ShouldStop(1024);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_newashkhas.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 780;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 781;BA.debugLine="Return False";
Debug.ShouldStop(4096);
if (true) return act_newashkhas.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 783;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) return act_newashkhas.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 784;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checktekrarimoshtari(RemoteObject _strnumber) throws Exception{
try {
		Debug.PushSubsStack("CheckTekrariMoshtari (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,985);
if (RapidSub.canDelegate("checktekrarimoshtari")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","checktekrarimoshtari", _strnumber);}
RemoteObject _b = RemoteObject.createImmutable(false);
RemoteObject _count = RemoteObject.createImmutable("");
Debug.locals.put("strNumber", _strnumber);
 BA.debugLineNum = 985;BA.debugLine="Sub CheckTekrariMoshtari(strNumber As String) As B";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 986;BA.debugLine="Dim b As Boolean=False";
Debug.ShouldStop(33554432);
_b = act_newashkhas.mostCurrent.__c.getField(true,"False");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 987;BA.debugLine="Dim count As String=0";
Debug.ShouldStop(67108864);
_count = BA.NumberToString(0);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 989;BA.debugLine="If MCode.UpdateShakhs=True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._mcode._updateshakhs /*RemoteObject*/ ,act_newashkhas.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 991;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeta";
Debug.ShouldStop(1073741824);
_count = BA.ObjectToString(act_newashkhas.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where fldTell='"),_strnumber,RemoteObject.createImmutable("' and fldCodetafzili='"),act_newashkhas.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'")))));Debug.locals.put("count", _count);
 BA.debugLineNum = 993;BA.debugLine="count=myCode.Is_Null_adad(count)";
Debug.ShouldStop(1);
_count = act_newashkhas.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(_count));Debug.locals.put("count", _count);
 BA.debugLineNum = 994;BA.debugLine="If count>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _count),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 995;BA.debugLine="b=True";
Debug.ShouldStop(4);
_b = act_newashkhas.mostCurrent.__c.getField(true,"True");Debug.locals.put("b", _b);
 };
 BA.debugLineNum = 998;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeta";
Debug.ShouldStop(32);
_count = BA.ObjectToString(act_newashkhas.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where FldMobile='"),_strnumber,RemoteObject.createImmutable("' and fldCodetafzili='"),act_newashkhas.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'")))));Debug.locals.put("count", _count);
 BA.debugLineNum = 999;BA.debugLine="count=myCode.Is_Null_adad(count)";
Debug.ShouldStop(64);
_count = act_newashkhas.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(_count));Debug.locals.put("count", _count);
 BA.debugLineNum = 1000;BA.debugLine="If count>0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _count),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1001;BA.debugLine="b=True";
Debug.ShouldStop(256);
_b = act_newashkhas.mostCurrent.__c.getField(true,"True");Debug.locals.put("b", _b);
 };
 }else {
 BA.debugLineNum = 1006;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeta";
Debug.ShouldStop(8192);
_count = BA.ObjectToString(act_newashkhas.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where fldTell='"),_strnumber,RemoteObject.createImmutable("'")))));Debug.locals.put("count", _count);
 BA.debugLineNum = 1007;BA.debugLine="count=myCode.Is_Null_adad(count)";
Debug.ShouldStop(16384);
_count = act_newashkhas.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(_count));Debug.locals.put("count", _count);
 BA.debugLineNum = 1008;BA.debugLine="If count>0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _count),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1009;BA.debugLine="b=True";
Debug.ShouldStop(65536);
_b = act_newashkhas.mostCurrent.__c.getField(true,"True");Debug.locals.put("b", _b);
 };
 BA.debugLineNum = 1012;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeta";
Debug.ShouldStop(524288);
_count = BA.ObjectToString(act_newashkhas.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where FldMobile='"),_strnumber,RemoteObject.createImmutable("'")))));Debug.locals.put("count", _count);
 BA.debugLineNum = 1013;BA.debugLine="count=myCode.Is_Null_adad(count)";
Debug.ShouldStop(1048576);
_count = act_newashkhas.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(_count));Debug.locals.put("count", _count);
 BA.debugLineNum = 1014;BA.debugLine="If count>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _count),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1015;BA.debugLine="b=True";
Debug.ShouldStop(4194304);
_b = act_newashkhas.mostCurrent.__c.getField(true,"True");Debug.locals.put("b", _b);
 };
 };
 BA.debugLineNum = 1021;BA.debugLine="Return b";
Debug.ShouldStop(268435456);
if (true) return _b;
 BA.debugLineNum = 1022;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checktekrarimoshtari2(RemoteObject _strnumber) throws Exception{
try {
		Debug.PushSubsStack("CheckTekrariMoshtari2 (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,960);
if (RapidSub.canDelegate("checktekrarimoshtari2")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","checktekrarimoshtari2", _strnumber);}
RemoteObject _b = RemoteObject.createImmutable(false);
RemoteObject _count = RemoteObject.createImmutable("");
Debug.locals.put("strNumber", _strnumber);
 BA.debugLineNum = 960;BA.debugLine="Sub CheckTekrariMoshtari2(strNumber As String) As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 961;BA.debugLine="Dim b As Boolean=False";
Debug.ShouldStop(1);
_b = act_newashkhas.mostCurrent.__c.getField(true,"False");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 962;BA.debugLine="Dim count As String=0";
Debug.ShouldStop(2);
_count = BA.NumberToString(0);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 963;BA.debugLine="If MCode.UpdateShakhs=True Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._mcode._updateshakhs /*RemoteObject*/ ,act_newashkhas.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 965;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeTa";
Debug.ShouldStop(16);
_count = BA.ObjectToString(act_newashkhas.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select count(fldCodeTafzili) from tblDaftarcheTell where fldShomare='"),_strnumber,RemoteObject.createImmutable("' and fldCodeTafzili<>'"),act_newashkhas.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'")))));Debug.locals.put("count", _count);
 BA.debugLineNum = 967;BA.debugLine="count=myCode.Is_Null_adad(count)";
Debug.ShouldStop(64);
_count = act_newashkhas.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(_count));Debug.locals.put("count", _count);
 BA.debugLineNum = 968;BA.debugLine="If count>0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _count),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 969;BA.debugLine="b=True";
Debug.ShouldStop(256);
_b = act_newashkhas.mostCurrent.__c.getField(true,"True");Debug.locals.put("b", _b);
 };
 }else {
 BA.debugLineNum = 973;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeTa";
Debug.ShouldStop(4096);
_count = BA.ObjectToString(act_newashkhas.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select count(fldCodeTafzili) from tblDaftarcheTell where fldShomare='"),_strnumber,RemoteObject.createImmutable("'")))));Debug.locals.put("count", _count);
 BA.debugLineNum = 975;BA.debugLine="count=myCode.Is_Null_adad(count)";
Debug.ShouldStop(16384);
_count = act_newashkhas.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(_count));Debug.locals.put("count", _count);
 BA.debugLineNum = 976;BA.debugLine="If count>0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _count),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 977;BA.debugLine="b=True";
Debug.ShouldStop(65536);
_b = act_newashkhas.mostCurrent.__c.getField(true,"True");Debug.locals.put("b", _b);
 };
 };
 BA.debugLineNum = 982;BA.debugLine="Return b";
Debug.ShouldStop(2097152);
if (true) return _b;
 BA.debugLineNum = 983;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chgps_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ChGps_CheckedChange (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1170);
if (RapidSub.canDelegate("chgps_checkedchange")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","chgps_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1170;BA.debugLine="Sub ChGps_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1171;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_checked,act_newashkhas.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1172;BA.debugLine="TxtLat.Enabled=True";
Debug.ShouldStop(524288);
act_newashkhas.mostCurrent._txtlat.runMethod(true,"setEnabled",act_newashkhas.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1173;BA.debugLine="TxtLon.Enabled=True";
Debug.ShouldStop(1048576);
act_newashkhas.mostCurrent._txtlon.runMethod(true,"setEnabled",act_newashkhas.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 1175;BA.debugLine="TxtLat.Enabled=False";
Debug.ShouldStop(4194304);
act_newashkhas.mostCurrent._txtlat.runMethod(true,"setEnabled",act_newashkhas.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1176;BA.debugLine="TxtLon.Enabled=False";
Debug.ShouldStop(8388608);
act_newashkhas.mostCurrent._txtlon.runMethod(true,"setEnabled",act_newashkhas.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1178;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpage() throws Exception{
try {
		Debug.PushSubsStack("CreatePage (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,115);
if (RapidSub.canDelegate("createpage")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","createpage");}
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _newcode = RemoteObject.createImmutable("");
 BA.debugLineNum = 115;BA.debugLine="Sub CreatePage";
Debug.ShouldStop(262144);
 BA.debugLineNum = 117;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 118;BA.debugLine="Key.SetCustomFilter(TxtTell,TxtTell.INPUT_TYPE_N";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_newashkhas.mostCurrent._txttell.getObject())),(Object)(act_newashkhas.mostCurrent._txttell.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 119;BA.debugLine="Key.SetCustomFilter(TxtMob,TxtMob.INPUT_TYPE_NUM";
Debug.ShouldStop(4194304);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_newashkhas.mostCurrent._txtmob.getObject())),(Object)(act_newashkhas.mostCurrent._txtmob.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 120;BA.debugLine="Key.SetCustomFilter(TxtLat,TxtLat.INPUT_TYPE_NUM";
Debug.ShouldStop(8388608);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_newashkhas.mostCurrent._txtlat.getObject())),(Object)(act_newashkhas.mostCurrent._txtlat.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789.")));
 BA.debugLineNum = 121;BA.debugLine="Key.SetCustomFilter(TxtLon,TxtLon.INPUT_TYPE_NUM";
Debug.ShouldStop(16777216);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_newashkhas.mostCurrent._txtlon.getObject())),(Object)(act_newashkhas.mostCurrent._txtlon.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789.")));
 BA.debugLineNum = 122;BA.debugLine="Key.SetCustomFilter(TxtShomarehesab,TxtShomarehe";
Debug.ShouldStop(33554432);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_newashkhas.mostCurrent._txtshomarehesab.getObject())),(Object)(act_newashkhas.mostCurrent._txtshomarehesab.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 123;BA.debugLine="Key.SetCustomFilter(TxtC_Posti,TxtC_Posti.INPUT_";
Debug.ShouldStop(67108864);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_newashkhas.mostCurrent._txtc_posti.getObject())),(Object)(act_newashkhas.mostCurrent._txtc_posti.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 124;BA.debugLine="Key.SetLengthFilter(TxtMob,11)";
Debug.ShouldStop(134217728);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetLengthFilter",(Object)((act_newashkhas.mostCurrent._txtmob.getObject())),(Object)(BA.numberCast(int.class, 11)));
 BA.debugLineNum = 125;BA.debugLine="Key.SetLengthFilter(TxtC_Posti,10)";
Debug.ShouldStop(268435456);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetLengthFilter",(Object)((act_newashkhas.mostCurrent._txtc_posti.getObject())),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 126;BA.debugLine="Key.SetLengthFilter(TxtC_Meli,10)";
Debug.ShouldStop(536870912);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetLengthFilter",(Object)((act_newashkhas.mostCurrent._txtc_meli.getObject())),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 127;BA.debugLine="Key.SetLengthFilter(TxtShomarehesab,29)";
Debug.ShouldStop(1073741824);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetLengthFilter",(Object)((act_newashkhas.mostCurrent._txtshomarehesab.getObject())),(Object)(BA.numberCast(int.class, 29)));
 BA.debugLineNum = 128;BA.debugLine="Key.SetLengthFilter(TxtName,50)";
Debug.ShouldStop(-2147483648);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetLengthFilter",(Object)((act_newashkhas.mostCurrent._txtname.getObject())),(Object)(BA.numberCast(int.class, 50)));
 BA.debugLineNum = 129;BA.debugLine="Key.SetLengthFilter(TxtAddress,200)";
Debug.ShouldStop(1);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetLengthFilter",(Object)((act_newashkhas.mostCurrent._txtaddress.getObject())),(Object)(BA.numberCast(int.class, 200)));
 BA.debugLineNum = 130;BA.debugLine="Key.SetLengthFilter(TxtTell,11)";
Debug.ShouldStop(2);
act_newashkhas.mostCurrent._key.runVoidMethod ("SetLengthFilter",(Object)((act_newashkhas.mostCurrent._txttell.getObject())),(Object)(BA.numberCast(int.class, 11)));
 BA.debugLineNum = 131;BA.debugLine="If MCode.Gps=1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._mcode._gps /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 132;BA.debugLine="ChGps.Enabled=False";
Debug.ShouldStop(8);
act_newashkhas.mostCurrent._chgps.runMethod(true,"setEnabled",act_newashkhas.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 134;BA.debugLine="ChGps.Enabled=True";
Debug.ShouldStop(32);
act_newashkhas.mostCurrent._chgps.runMethod(true,"setEnabled",act_newashkhas.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 136;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\")";
Debug.ShouldStop(128);
act_newashkhas.mostCurrent._nicespinner.runVoidMethod ("Initialize",act_newashkhas.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner")));
 BA.debugLineNum = 137;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
Debug.ShouldStop(256);
act_newashkhas.mostCurrent._nicespinner.runMethod(true,"setTextColor",act_newashkhas.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 138;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(512);
act_newashkhas.mostCurrent._nicespinner.runMethod(true,"setGravity",act_newashkhas.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 139;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"";
Debug.ShouldStop(1024);
act_newashkhas.mostCurrent._nicespinner.runMethod(false,"setTypeface",act_newashkhas.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 140;BA.debugLine="PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBas";
Debug.ShouldStop(2048);
act_newashkhas.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_newashkhas.mostCurrent._nicespinner.getObject())),(Object)(act_newashkhas.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_newashkhas.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_newashkhas.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_newashkhas.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 142;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(8192);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 143;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
Debug.ShouldStop(16384);
_op.runVoidMethod ("Initialize2",(Object)(act_newashkhas.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_newashkhas.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_newashkhas.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_newashkhas.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 144;BA.debugLine="NiceSpinner.Background=op";
Debug.ShouldStop(32768);
act_newashkhas.mostCurrent._nicespinner.runMethod(false,"setBackground",(_op.getObject()));
 BA.debugLineNum = 146;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
Debug.ShouldStop(131072);
act_newashkhas.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_newashkhas.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner1")));
 BA.debugLineNum = 147;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(262144);
act_newashkhas.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_newashkhas.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 148;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(524288);
act_newashkhas.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_newashkhas.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 149;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(";
Debug.ShouldStop(1048576);
act_newashkhas.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_newashkhas.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 150;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBa";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_newashkhas.mostCurrent._nicespinner1.getObject())),(Object)(act_newashkhas.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_newashkhas.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_newashkhas.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_newashkhas.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 152;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(8388608);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 153;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bl";
Debug.ShouldStop(16777216);
_op1.runVoidMethod ("Initialize2",(Object)(act_newashkhas.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_newashkhas.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_newashkhas.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_newashkhas.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 154;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(33554432);
act_newashkhas.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 155;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(67108864);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 156;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(134217728);
act_newashkhas.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_newashkhas.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 158;BA.debugLine="LoadAcSpGroohAshkas";
Debug.ShouldStop(536870912);
_loadacspgroohashkas();
 BA.debugLineNum = 159;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(1073741824);
_time = act_newashkhas.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_newashkhas.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 160;BA.debugLine="Dim NewCode As String = MCode.ConvertNumbersPers";
Debug.ShouldStop(-2147483648);
_newcode = act_newashkhas.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,act_newashkhas.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA),_time.runMethod(true,"replace",(Object)(BA.ObjectToString(":")),(Object)(RemoteObject.createImmutable(""))))));Debug.locals.put("NewCode", _newcode);Debug.locals.put("NewCode", _newcode);
 BA.debugLineNum = 161;BA.debugLine="TxtCodeMostari.Text=NewCode";
Debug.ShouldStop(1);
act_newashkhas.mostCurrent._txtcodemostari.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_newcode));
 BA.debugLineNum = 162;BA.debugLine="If MCode.UpdateShakhs=True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._mcode._updateshakhs /*RemoteObject*/ ,act_newashkhas.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 163;BA.debugLine="LoadUpdateShakhs";
Debug.ShouldStop(4);
_loadupdateshakhs();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e46) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e46.toString()); BA.debugLineNum = 166;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549610803",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 167;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
Debug.ShouldStop(64);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-CreatePage"))));
 };
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getlocation() throws Exception{
try {
		Debug.PushSubsStack("GetLocation (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,852);
if (RapidSub.canDelegate("getlocation")) { ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","getlocation"); return;}
ResumableSub_GetLocation rsub = new ResumableSub_GetLocation(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetLocation extends BA.ResumableSub {
public ResumableSub_GetLocation(ir.parsikhesab.pakhsh.act_newashkhas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_newashkhas parent;
RemoteObject _available = RemoteObject.createImmutable(false);
RemoteObject _result = RemoteObject.declareNull("igolub.fused.b4a.location.LocationResultWrapper");
RemoteObject _lastlocation = RemoteObject.declareNull("igolub.fused.b4a.location.android.location.LocationFWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetLocation (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,852);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 853;BA.debugLine="If Fused.IsLocationEnabledInSettings Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 20;
if (parent.mostCurrent._fused.runMethod(true,"getIsLocationEnabledInSettings").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 854;BA.debugLine="Fused.GetLocationAvailability";
Debug.ShouldStop(2097152);
parent.mostCurrent._fused.runVoidMethod ("GetLocationAvailability");
 BA.debugLineNum = 856;BA.debugLine="Wait For FusedLocation_LocationAvailabilityReque";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","fusedlocation_locationavailabilityrequestcompleted", act_newashkhas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_newashkhas", "getlocation"), null);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_available = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Available", _available);
;
 BA.debugLineNum = 857;BA.debugLine="Log(\"LocationAvailable=\" & Available)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","550528261",RemoteObject.concat(RemoteObject.createImmutable("LocationAvailable="),_available),0);
 BA.debugLineNum = 858;BA.debugLine="If Available Then";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 17;
if (_available.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 859;BA.debugLine="Fused.GetLastLocation";
Debug.ShouldStop(67108864);
parent.mostCurrent._fused.runVoidMethod ("GetLastLocation");
 BA.debugLineNum = 860;BA.debugLine="Wait For FusedLocation_LocationRequestCompleted";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","fusedlocation_locationrequestcompleted", act_newashkhas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_newashkhas", "getlocation"), null);
this.state = 22;
return;
case 22:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 861;BA.debugLine="If Result.Status=LocationResult.STATUS_SUCCESSF";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"getStatus"),BA.numberCast(double.class, parent.mostCurrent._locationresult.getField(true,"STATUS_SUCCESSFUL")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 862;BA.debugLine="If Result.Location.IsInitialized Then";
Debug.ShouldStop(536870912);
if (true) break;

case 10:
//if
this.state = 15;
if (_result.runMethod(false,"getLocation").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 863;BA.debugLine="Dim LastLocation As LocationF = Result.Locati";
Debug.ShouldStop(1073741824);
_lastlocation = RemoteObject.createNew ("igolub.fused.b4a.location.android.location.LocationFWrapper");
_lastlocation = _result.runMethod(false,"getLocation");Debug.locals.put("LastLocation", _lastlocation);Debug.locals.put("LastLocation", _lastlocation);
 BA.debugLineNum = 864;BA.debugLine="Log(\"LastLocation Latitude = \" & LastLocation";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","550528268",RemoteObject.concat(RemoteObject.createImmutable("LastLocation Latitude = "),_lastlocation.runMethod(true,"getLatitude")),0);
 BA.debugLineNum = 865;BA.debugLine="Log(\"LastLocation Longitude = \" & LastLocatio";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","550528269",RemoteObject.concat(RemoteObject.createImmutable("LastLocation Longitude = "),_lastlocation.runMethod(true,"getLongitude")),0);
 BA.debugLineNum = 867;BA.debugLine="TxtLat.text = LastLocation.Latitude";
Debug.ShouldStop(4);
parent.mostCurrent._txtlat.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_lastlocation.runMethod(true,"getLatitude")));
 BA.debugLineNum = 868;BA.debugLine="TxtLon.text = LastLocation.Longitude";
Debug.ShouldStop(8);
parent.mostCurrent._txtlon.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_lastlocation.runMethod(true,"getLongitude")));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 870;BA.debugLine="Log(\"Unknown last location\")";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","550528274",RemoteObject.createImmutable("Unknown last location"),0);
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 875;BA.debugLine="MsgboxAsync(\"Location is turned off in devices's";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Location is turned off in devices's settings. Turn it on.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),act_newashkhas.processBA);
 BA.debugLineNum = 876;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_newashkhas.processBA,(Object)((parent.mostCurrent._fused.runMethod(false,"getLocationSettingsIntent").getObject())));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 878;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static void  _fusedlocation_locationavailabilityrequestcompleted(RemoteObject _available) throws Exception{
}
public static void  _fusedlocation_locationrequestcompleted(RemoteObject _result) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private rp As RuntimePermissions";
act_newashkhas.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 14;BA.debugLine="Private TxtName As EditText";
act_newashkhas.mostCurrent._txtname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private TxtTell As EditText";
act_newashkhas.mostCurrent._txttell = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private TxtMob As EditText";
act_newashkhas.mostCurrent._txtmob = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private TxtAddress As EditText";
act_newashkhas.mostCurrent._txtaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private BtnSaveNewMoshtari As Button";
act_newashkhas.mostCurrent._btnsavenewmoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim Lat As String";
act_newashkhas.mostCurrent._lat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Dim Lon As String";
act_newashkhas.mostCurrent._lon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Private ChGps As CheckBox";
act_newashkhas.mostCurrent._chgps = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim Key As IME";
act_newashkhas.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 23;BA.debugLine="Private TxtShomarehesab As EditText";
act_newashkhas.mostCurrent._txtshomarehesab = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private TxtLat As EditText";
act_newashkhas.mostCurrent._txtlat = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private TxtLon As EditText";
act_newashkhas.mostCurrent._txtlon = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private TxtC_Meli As EditText";
act_newashkhas.mostCurrent._txtc_meli = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private BtnNewNumber As Label";
act_newashkhas.mostCurrent._btnnewnumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PnlSpCity As Panel";
act_newashkhas.mostCurrent._pnlspcity = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Public NiceSpinner As NiceSpinner";
act_newashkhas.mostCurrent._nicespinner = RemoteObject.createNew ("nicespinnerwrapper.niceSpinnerWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Public NiceSpinner1 As NiceSpinner";
act_newashkhas.mostCurrent._nicespinner1 = RemoteObject.createNew ("nicespinnerwrapper.niceSpinnerWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
act_newashkhas.mostCurrent._b4xcombobox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 32;BA.debugLine="Private B4XComboBox2 As B4XComboBox";
act_newashkhas.mostCurrent._b4xcombobox2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 33;BA.debugLine="Dim ListGoroohAshkhas1,OriginalListGoroohAshkhas1";
act_newashkhas.mostCurrent._listgoroohashkhas1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_newashkhas.mostCurrent._originallistgoroohashkhas1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 34;BA.debugLine="Dim ListGoroohAshkhas2,OriginalListGoroohAshkhas2";
act_newashkhas.mostCurrent._listgoroohashkhas2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_newashkhas.mostCurrent._originallistgoroohashkhas2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 35;BA.debugLine="Dim GroupCodeSelect As Long";
act_newashkhas._groupcodeselect = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 36;BA.debugLine="Dim GroupNameSelect As String";
act_newashkhas.mostCurrent._groupnameselect = RemoteObject.createImmutable("");
 //BA.debugLineNum = 37;BA.debugLine="Private gmap As GoogleMap";
act_newashkhas.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private MapFragment1 As MapFragment";
act_newashkhas.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private TxtC_Posti As EditText";
act_newashkhas.mostCurrent._txtc_posti = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Dim loc As LatLng";
act_newashkhas.mostCurrent._loc = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private PnlSpGroup As Panel";
act_newashkhas.mostCurrent._pnlspgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Dim lstGroup1 As List";
act_newashkhas.mostCurrent._lstgroup1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 43;BA.debugLine="Dim lstGroup2 As List";
act_newashkhas.mostCurrent._lstgroup2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 44;BA.debugLine="Dim lstSearchGroup1 As List";
act_newashkhas.mostCurrent._lstsearchgroup1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 45;BA.debugLine="Dim lstSearchGroup2 As List";
act_newashkhas.mostCurrent._lstsearchgroup2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 46;BA.debugLine="Dim lstSelectedCodeGroupAshkhas As List";
act_newashkhas.mostCurrent._lstselectedcodegroupashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 47;BA.debugLine="Dim GroupCodeSelect1 As String=\"0\"";
act_newashkhas.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 //BA.debugLineNum = 48;BA.debugLine="Dim GroupNameSelect1 As String=\"\"";
act_newashkhas.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 //BA.debugLineNum = 49;BA.debugLine="Dim GroupCodeSelect2 As String=\"0\"";
act_newashkhas.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 //BA.debugLineNum = 50;BA.debugLine="Dim GroupNameSelect2 As String=\"\"";
act_newashkhas.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 //BA.debugLineNum = 51;BA.debugLine="Dim IndexGroup1 As Int=0";
act_newashkhas._indexgroup1 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 52;BA.debugLine="Dim IndexGroup2 As Int=0";
act_newashkhas._indexgroup2 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 54;BA.debugLine="Private lblTitle As Label";
act_newashkhas.mostCurrent._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Dim TypeSelectGroup As String=\"\"";
act_newashkhas.mostCurrent._typeselectgroup = BA.ObjectToString("");
 //BA.debugLineNum = 56;BA.debugLine="Private TxtCodeMostari As EditText";
act_newashkhas.mostCurrent._txtcodemostari = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private SearchTemplate1 As B4XSearchTemplate";
act_newashkhas.mostCurrent._searchtemplate1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xsearchtemplate");
 //BA.debugLineNum = 60;BA.debugLine="Private SearchTemplate2 As B4XSearchTemplate";
act_newashkhas.mostCurrent._searchtemplate2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xsearchtemplate");
 //BA.debugLineNum = 61;BA.debugLine="Private XUI As XUI";
act_newashkhas.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 62;BA.debugLine="Private Dialog As B4XDialog";
act_newashkhas.mostCurrent._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 63;BA.debugLine="Private Base As B4XView";
act_newashkhas.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private Panel1 As Panel";
act_newashkhas.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private Fused As FusedLocationProviderClient";
act_newashkhas.mostCurrent._fused = RemoteObject.createNew ("igolub.fused.b4a.location.FusedLocationProviderClientWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private btnSearchGroup1 As Label";
act_newashkhas.mostCurrent._btnsearchgroup1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private btnSearchGroup2 As Label";
act_newashkhas.mostCurrent._btnsearchgroup2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Dim querySearch1 As String";
act_newashkhas.mostCurrent._querysearch1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 69;BA.debugLine="Dim querySearch2 As String";
act_newashkhas.mostCurrent._querysearch2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gps1_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("GPS1_LocationChanged (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,786);
if (RapidSub.canDelegate("gps1_locationchanged")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","gps1_locationchanged", _location1);}
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 786;BA.debugLine="Sub GPS1_LocationChanged (Location1 As Location)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 791;BA.debugLine="GPS1.Stop";
Debug.ShouldStop(4194304);
act_newashkhas._gps1.runVoidMethod ("Stop");
 BA.debugLineNum = 792;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gps1_userenabled(RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("GPS1_UserEnabled (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,109);
if (RapidSub.canDelegate("gps1_userenabled")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","gps1_userenabled", _enabled);}
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 109;BA.debugLine="Sub GPS1_UserEnabled (Enabled As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="If Enabled=True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_enabled,act_newashkhas.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 111;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(16384);
act_newashkhas._t1.runMethod(true,"setEnabled",act_newashkhas.mostCurrent.__c.getField(true,"True"));
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
public static RemoteObject  _loadacspgroohashkas() throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpGroohAshkas (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,329);
if (RapidSub.canDelegate("loadacspgroohashkas")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","loadacspgroohashkas");}
RemoteObject _lsttemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dt1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _indextemp = RemoteObject.createImmutable("");
RemoteObject _dt2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _j = 0;
RemoteObject _code2 = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0L);
RemoteObject _mincode = RemoteObject.createImmutable("");
RemoteObject _sizecode = RemoteObject.createImmutable(0L);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _a = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _namegroup = RemoteObject.createImmutable("");
RemoteObject _codegroup = RemoteObject.createImmutable("");
 BA.debugLineNum = 329;BA.debugLine="Sub LoadAcSpGroohAshkas";
Debug.ShouldStop(256);
 BA.debugLineNum = 330;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 331;BA.debugLine="Dim lstTemp As List";
Debug.ShouldStop(1024);
_lsttemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstTemp", _lsttemp);
 BA.debugLineNum = 332;BA.debugLine="lstTemp.Initialize";
Debug.ShouldStop(2048);
_lsttemp.runVoidMethod ("Initialize");
 BA.debugLineNum = 334;BA.debugLine="lstGroup1.Add(\"همه گروه ها\")";
Debug.ShouldStop(8192);
act_newashkhas.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 335;BA.debugLine="querySearch1=\"Select FldC_Gorooh,FldN_Gorooh Fro";
Debug.ShouldStop(16384);
act_newashkhas.mostCurrent._querysearch1 = BA.ObjectToString("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas ");
 BA.debugLineNum = 336;BA.debugLine="Dim Dt1 As Cursor = MCode.Result(querySearch1)";
Debug.ShouldStop(32768);
_dt1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt1 = act_newashkhas.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas.mostCurrent._querysearch1));Debug.locals.put("Dt1", _dt1);Debug.locals.put("Dt1", _dt1);
 BA.debugLineNum = 337;BA.debugLine="For i=0 To Dt1.RowCount-1";
Debug.ShouldStop(65536);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_dt1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 338;BA.debugLine="Dt1.Position=i";
Debug.ShouldStop(131072);
_dt1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 339;BA.debugLine="Dim code As String=Dt1.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(262144);
_code = _dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 340;BA.debugLine="Dim indexTemp As String=lstTemp.IndexOf(code)";
Debug.ShouldStop(524288);
_indextemp = BA.NumberToString(_lsttemp.runMethod(true,"IndexOf",(Object)((_code))));Debug.locals.put("indexTemp", _indextemp);Debug.locals.put("indexTemp", _indextemp);
 BA.debugLineNum = 341;BA.debugLine="If indexTemp=-1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_indextemp,BA.NumberToString(-(double) (0 + 1)))) { 
 BA.debugLineNum = 342;BA.debugLine="Dim dt2 As Cursor =MCode.Result(\"Select * From";
Debug.ShouldStop(2097152);
_dt2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt2 = act_newashkhas.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblGoroohAshkhas where FldC_Gorooh Like '"),_code,RemoteObject.createImmutable("%'"))));Debug.locals.put("dt2", _dt2);Debug.locals.put("dt2", _dt2);
 BA.debugLineNum = 343;BA.debugLine="If dt2.RowCount>0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_dt2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 344;BA.debugLine="For j=0 To dt2.RowCount-1";
Debug.ShouldStop(8388608);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_dt2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step14 > 0 && _j <= limit14) || (step14 < 0 && _j >= limit14) ;_j = ((int)(0 + _j + step14))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 345;BA.debugLine="dt2.Position=j";
Debug.ShouldStop(16777216);
_dt2.runMethod(true,"setPosition",BA.numberCast(int.class, _j));
 BA.debugLineNum = 346;BA.debugLine="Dim code2 As String=dt2.GetString(\"FldC_Goro";
Debug.ShouldStop(33554432);
_code2 = _dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("code2", _code2);Debug.locals.put("code2", _code2);
 BA.debugLineNum = 348;BA.debugLine="Dim count As Long";
Debug.ShouldStop(134217728);
_count = RemoteObject.createImmutable(0L);Debug.locals.put("count", _count);
 BA.debugLineNum = 349;BA.debugLine="Dim MinCode As String =MCode.SingleResult(\"S";
Debug.ShouldStop(268435456);
_mincode = BA.ObjectToString(act_newashkhas.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"),_code2,RemoteObject.createImmutable("%'")))));Debug.locals.put("MinCode", _mincode);Debug.locals.put("MinCode", _mincode);
 BA.debugLineNum = 350;BA.debugLine="Dim sizeCode As Long=dt2.GetString(\"FldC_Gor";
Debug.ShouldStop(536870912);
_sizecode = BA.numberCast(long.class, _dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"length"));Debug.locals.put("sizeCode", _sizecode);Debug.locals.put("sizeCode", _sizecode);
 BA.debugLineNum = 351;BA.debugLine="If MinCode.Length=sizeCode Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_mincode.runMethod(true,"length"),BA.numberCast(double.class, _sizecode))) { 
 BA.debugLineNum = 352;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(-2147483648);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 353;BA.debugLine="Item.FldC_Gorooh= dt2.GetString(\"FldC_Goroo";
Debug.ShouldStop(1);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 354;BA.debugLine="Item.FldN_Gorooh= dt2.GetString(\"FldN_Goroo";
Debug.ShouldStop(2);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 355;BA.debugLine="OriginalListGoroohAshkhas1.Add(Item)";
Debug.ShouldStop(4);
act_newashkhas.mostCurrent._originallistgoroohashkhas1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 356;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(8);
act_newashkhas.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 357;BA.debugLine="lstSearchGroup1.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(16);
act_newashkhas.mostCurrent._lstsearchgroup1.runVoidMethod ("Add",(Object)((_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 360;BA.debugLine="If MinCode.Length=sizeCode Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_mincode.runMethod(true,"length"),BA.numberCast(double.class, _sizecode))) { 
 BA.debugLineNum = 361;BA.debugLine="For Each a As AdapterGoroohAshkhas In Orig";
Debug.ShouldStop(256);
{
final RemoteObject group29 = act_newashkhas.mostCurrent._originallistgoroohashkhas1;
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_a = (group29.runMethod(false,"Get",index29));Debug.locals.put("a", _a);
Debug.locals.put("a", _a);
 BA.debugLineNum = 362;BA.debugLine="If a.FldC_Gorooh.SubString2(0,3)=code2 Th";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_a.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),_code2)) { 
 BA.debugLineNum = 363;BA.debugLine="count=1";
Debug.ShouldStop(1024);
_count = BA.numberCast(long.class, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 364;BA.debugLine="Exit";
Debug.ShouldStop(2048);
if (true) break;
 };
 }
}Debug.locals.put("a", _a);
;
 BA.debugLineNum = 367;BA.debugLine="If count =0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 368;BA.debugLine="Dim NameGroup,CodeGroup As String";
Debug.ShouldStop(32768);
_namegroup = RemoteObject.createImmutable("");Debug.locals.put("NameGroup", _namegroup);
_codegroup = RemoteObject.createImmutable("");Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 369;BA.debugLine="CodeGroup=MinCode";
Debug.ShouldStop(65536);
_codegroup = _mincode;Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 370;BA.debugLine="NameGroup=MCode.SingleResult(\"Select FldN";
Debug.ShouldStop(131072);
_namegroup = BA.ObjectToString(act_newashkhas.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"),_mincode,RemoteObject.createImmutable("'")))));Debug.locals.put("NameGroup", _namegroup);
 BA.debugLineNum = 371;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(262144);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 372;BA.debugLine="Item.FldC_Gorooh= CodeGroup";
Debug.ShouldStop(524288);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_codegroup);
 BA.debugLineNum = 373;BA.debugLine="Item.FldN_Gorooh= NameGroup";
Debug.ShouldStop(1048576);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_namegroup);
 BA.debugLineNum = 374;BA.debugLine="OriginalListGoroohAshkhas1.Add(Item)";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent._originallistgoroohashkhas1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 375;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(4194304);
act_newashkhas.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 376;BA.debugLine="lstSearchGroup1.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(8388608);
act_newashkhas.mostCurrent._lstsearchgroup1.runVoidMethod ("Add",(Object)((_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ))));
 };
 }else {
 };
 };
 }
}Debug.locals.put("j", _j);
;
 };
 BA.debugLineNum = 394;BA.debugLine="lstTemp.Add(code)";
Debug.ShouldStop(512);
_lsttemp.runVoidMethod ("Add",(Object)((_code)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 402;BA.debugLine="Log(\"lstSearchGroup1: \"& lstSearchGroup1.Size)";
Debug.ShouldStop(131072);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549741897",RemoteObject.concat(RemoteObject.createImmutable("lstSearchGroup1: "),act_newashkhas.mostCurrent._lstsearchgroup1.runMethod(true,"getSize")),0);
 BA.debugLineNum = 403;BA.debugLine="SearchTemplate1.SetItems(lstSearchGroup1)";
Debug.ShouldStop(262144);
act_newashkhas.mostCurrent._searchtemplate1.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(act_newashkhas.mostCurrent._lstsearchgroup1));
 BA.debugLineNum = 405;BA.debugLine="SearchTemplate1.GetPanel(Dialog).BringToFront";
Debug.ShouldStop(1048576);
act_newashkhas.mostCurrent._searchtemplate1.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_getpanel" /*RemoteObject*/ ,(Object)(act_newashkhas.mostCurrent._dialog)).runVoidMethod ("BringToFront");
 BA.debugLineNum = 429;BA.debugLine="NiceSpinner.attachDataSource(lstGroup1)";
Debug.ShouldStop(4096);
act_newashkhas.mostCurrent._nicespinner.runVoidMethod ("attachDataSource",(Object)((act_newashkhas.mostCurrent._lstgroup1.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e59) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e59.toString()); BA.debugLineNum = 431;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549741926",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 432;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32768);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadAcSpGroohAshkas"))));
 };
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadacspgroohashkas2() throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpGroohAshkas2 (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,436);
if (RapidSub.canDelegate("loadacspgroohashkas2")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","loadacspgroohashkas2");}
RemoteObject _lsttemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _name = RemoteObject.createImmutable("");
 BA.debugLineNum = 436;BA.debugLine="Sub LoadAcSpGroohAshkas2";
Debug.ShouldStop(524288);
 BA.debugLineNum = 437;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 438;BA.debugLine="Dim lstTemp As List";
Debug.ShouldStop(2097152);
_lsttemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstTemp", _lsttemp);
 BA.debugLineNum = 439;BA.debugLine="lstTemp.Initialize";
Debug.ShouldStop(4194304);
_lsttemp.runVoidMethod ("Initialize");
 BA.debugLineNum = 440;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(8388608);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_newashkhas.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblGoroohAshkhas ")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 441;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 442;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(33554432);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 443;BA.debugLine="Dim Name As String =  Cu.GetString(\"FldN_Gorooh";
Debug.ShouldStop(67108864);
_name = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")));Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 444;BA.debugLine="lstTemp.Add(Name)";
Debug.ShouldStop(134217728);
_lsttemp.runVoidMethod ("Add",(Object)((_name)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 446;BA.debugLine="SearchTemplate1.SetItems(lstTemp)";
Debug.ShouldStop(536870912);
act_newashkhas.mostCurrent._searchtemplate1.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_lsttemp));
 BA.debugLineNum = 447;BA.debugLine="SearchTemplate1.GetPanel(Dialog).BringToFront";
Debug.ShouldStop(1073741824);
act_newashkhas.mostCurrent._searchtemplate1.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_getpanel" /*RemoteObject*/ ,(Object)(act_newashkhas.mostCurrent._dialog)).runVoidMethod ("BringToFront");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e13.toString()); BA.debugLineNum = 538;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549807462",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 539;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(67108864);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadAcSpGroohAshkas"))));
 };
 BA.debugLineNum = 541;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadupdateshakhs() throws Exception{
try {
		Debug.PushSubsStack("LoadUpdateShakhs (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,171);
if (RapidSub.canDelegate("loadupdateshakhs")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","loadupdateshakhs");}
 BA.debugLineNum = 171;BA.debugLine="Sub LoadUpdateShakhs";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="TxtName.Text=shakhs.SharhTafzili";
Debug.ShouldStop(2048);
act_newashkhas.mostCurrent._txtname.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_newashkhas._shakhs.getField(true,"SharhTafzili" /*RemoteObject*/ )));
 BA.debugLineNum = 173;BA.debugLine="TxtTell.Text=shakhs.Tell";
Debug.ShouldStop(4096);
act_newashkhas.mostCurrent._txttell.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_newashkhas._shakhs.getField(true,"Tell" /*RemoteObject*/ )));
 BA.debugLineNum = 174;BA.debugLine="TxtAddress.Text=shakhs.Address";
Debug.ShouldStop(8192);
act_newashkhas.mostCurrent._txtaddress.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_newashkhas._shakhs.getField(true,"Address" /*RemoteObject*/ )));
 BA.debugLineNum = 175;BA.debugLine="TxtC_Meli.Text=myCode.Is_Null(shakhs.FldC_Meli)";
Debug.ShouldStop(16384);
act_newashkhas.mostCurrent._txtc_meli.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_newashkhas.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas._shakhs.getField(true,"FldC_Meli" /*RemoteObject*/ )))));
 BA.debugLineNum = 176;BA.debugLine="TxtC_Posti.Text=myCode.Is_Null(shakhs.FldC_Posti)";
Debug.ShouldStop(32768);
act_newashkhas.mostCurrent._txtc_posti.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_newashkhas.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas._shakhs.getField(true,"FldC_Posti" /*RemoteObject*/ )))));
 BA.debugLineNum = 177;BA.debugLine="TxtShomarehesab.Text=myCode.Is_Null(shakhs.FldSho";
Debug.ShouldStop(65536);
act_newashkhas.mostCurrent._txtshomarehesab.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_newashkhas.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas._shakhs.getField(true,"FldShomarehesab" /*RemoteObject*/ )))));
 BA.debugLineNum = 178;BA.debugLine="TxtMob.Text=shakhs.FldMobile";
Debug.ShouldStop(131072);
act_newashkhas.mostCurrent._txtmob.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_newashkhas._shakhs.getField(true,"FldMobile" /*RemoteObject*/ )));
 BA.debugLineNum = 179;BA.debugLine="TxtCodeMostari.Text= shakhs.CodeTafzili";
Debug.ShouldStop(262144);
act_newashkhas.mostCurrent._txtcodemostari.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_newashkhas._shakhs.getField(true,"CodeTafzili" /*RemoteObject*/ )));
 BA.debugLineNum = 181;BA.debugLine="lblTitle.Text=\"ویرایش مشتری جدید\"";
Debug.ShouldStop(1048576);
act_newashkhas.mostCurrent._lbltitle.runMethod(true,"setText",BA.ObjectToCharSequence("ویرایش مشتری جدید"));
 BA.debugLineNum = 184;BA.debugLine="TypeSelectGroup=\"Update\"";
Debug.ShouldStop(8388608);
act_newashkhas.mostCurrent._typeselectgroup = BA.ObjectToString("Update");
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mapfragment1_ready() throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,824);
if (RapidSub.canDelegate("mapfragment1_ready")) { ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","mapfragment1_ready"); return;}
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
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_newashkhas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_newashkhas parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,824);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 827;BA.debugLine="Try";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 828;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(134217728);
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 BA.debugLineNum = 829;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOC";
Debug.ShouldStop(268435456);
parent.mostCurrent._rp.runVoidMethod ("CheckAndRequest",act_newashkhas.processBA,(Object)(parent.mostCurrent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 830;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_newashkhas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_newashkhas", "mapfragment1_ready"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 831;BA.debugLine="If Result Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 832;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 836;BA.debugLine="Sleep(200)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_newashkhas.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_newashkhas", "mapfragment1_ready"),BA.numberCast(int.class, 200));
this.state = 14;
return;
case 14:
//C
this.state = 9;
;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 845;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","550462741",RemoteObject.createImmutable("No permission!"),0);
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
 BA.debugLineNum = 848;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","550462744",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 849;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
Debug.ShouldStop(65536);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-MapFragment1_Ready"))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 851;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e0.toString());}
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
public static RemoteObject  _nicespinner_item_clicked() throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner_item_clicked (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,632);
if (RapidSub.canDelegate("nicespinner_item_clicked")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","nicespinner_item_clicked");}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 632;BA.debugLine="Sub NiceSpinner_item_clicked";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 633;BA.debugLine="Dim Position As Int=NiceSpinner.SelectedIndex";
Debug.ShouldStop(16777216);
_position = act_newashkhas.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex");Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 634;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.SelectedIndex &\" se";
Debug.ShouldStop(33554432);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550003970",RemoteObject.concat(RemoteObject.createImmutable("ns1 item "),act_newashkhas.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 635;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.Text &\" selected\")";
Debug.ShouldStop(67108864);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550003971",RemoteObject.concat(RemoteObject.createImmutable("ns1 item "),act_newashkhas.mostCurrent._nicespinner.runMethod(true,"getText"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 637;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 638;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(536870912);
act_newashkhas.mostCurrent._key.runVoidMethod ("HideKeyboard",act_newashkhas.mostCurrent.activityBA);
 BA.debugLineNum = 640;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 641;BA.debugLine="ListGoroohAshkhas1.Clear";
Debug.ShouldStop(1);
act_newashkhas.mostCurrent._listgoroohashkhas1.runVoidMethod ("Clear");
 BA.debugLineNum = 642;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(2);
act_newashkhas.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 644;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(8);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 646;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(32);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 648;BA.debugLine="GroupCodeSelect1=\"0\"";
Debug.ShouldStop(128);
act_newashkhas.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 BA.debugLineNum = 649;BA.debugLine="GroupNameSelect1=\"\"";
Debug.ShouldStop(256);
act_newashkhas.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 BA.debugLineNum = 650;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(512);
act_newashkhas.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 651;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(1024);
act_newashkhas.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 }else {
 BA.debugLineNum = 654;BA.debugLine="Dim lst As List=OriginalListGoroohAshkhas1";
Debug.ShouldStop(8192);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_newashkhas.mostCurrent._originallistgoroohashkhas1;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 655;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
Debug.ShouldStop(16384);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550003991",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_newashkhas.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1)),0);
 BA.debugLineNum = 656;BA.debugLine="Dim index As Int=Position-1";
Debug.ShouldStop(32768);
_index = RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 657;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(index)";
Debug.ShouldStop(65536);
_item = (_lst.runMethod(false,"Get",(Object)(_index)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 658;BA.debugLine="Log(Item.FldN_Gorooh)";
Debug.ShouldStop(131072);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550003994",_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 659;BA.debugLine="Log(Item.FldC_Gorooh)";
Debug.ShouldStop(262144);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550003995",_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 660;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(524288);
act_newashkhas.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 661;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
Debug.ShouldStop(1048576);
act_newashkhas.mostCurrent._groupnameselect1 = _item.getField(true,"FldN_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 662;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 663;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4194304);
act_newashkhas.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 664;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(8388608);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 666;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(33554432);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 667;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_newashkhas.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 668;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 669;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(268435456);
act_newashkhas.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 671;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(1073741824);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 673;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(1);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 674;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(2);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33) ;_i = ((int)(0 + _i + step33))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 675;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(4);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 676;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(8);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 677;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(16);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 678;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(32);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 679;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
Debug.ShouldStop(64);
act_newashkhas.mostCurrent._listgoroohashkhas1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 681;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(256);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 684;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(2048);
act_newashkhas.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_newashkhas.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 686;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(GroupCodeSelec";
Debug.ShouldStop(8192);
act_newashkhas.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Add",(Object)((act_newashkhas.mostCurrent._groupcodeselect1)));
 }else {
 BA.debugLineNum = 688;BA.debugLine="ListGoroohAshkhas1.Clear";
Debug.ShouldStop(32768);
act_newashkhas.mostCurrent._listgoroohashkhas1.runVoidMethod ("Clear");
 BA.debugLineNum = 689;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(65536);
act_newashkhas.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 691;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(262144);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 693;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(1048576);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 694;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 695;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4194304);
act_newashkhas.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 };
 };
 BA.debugLineNum = 701;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(268435456);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550004037",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_newashkhas.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 702;BA.debugLine="GroupCodeSelect=GroupCodeSelect1";
Debug.ShouldStop(536870912);
act_newashkhas._groupcodeselect = BA.numberCast(long.class, act_newashkhas.mostCurrent._groupcodeselect1);
 BA.debugLineNum = 703;BA.debugLine="Log(\"postion1: \"&Position)";
Debug.ShouldStop(1073741824);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550004039",RemoteObject.concat(RemoteObject.createImmutable("postion1: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e56) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e56.toString()); BA.debugLineNum = 705;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550004041",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 706;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner_ItemClick"))));
 };
 BA.debugLineNum = 708;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner_item_clicked1() throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner_item_clicked1 (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,546);
if (RapidSub.canDelegate("nicespinner_item_clicked1")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","nicespinner_item_clicked1");}
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 546;BA.debugLine="Sub NiceSpinner_item_clicked1";
Debug.ShouldStop(2);
 BA.debugLineNum = 553;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.Text &\" selected\")";
Debug.ShouldStop(256);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549872903",RemoteObject.concat(RemoteObject.createImmutable("ns1 item "),act_newashkhas.mostCurrent._nicespinner.runMethod(true,"getText"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 555;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 556;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(2048);
act_newashkhas.mostCurrent._key.runVoidMethod ("HideKeyboard",act_newashkhas.mostCurrent.activityBA);
 BA.debugLineNum = 560;BA.debugLine="lstSearchGroup2.Clear";
Debug.ShouldStop(32768);
act_newashkhas.mostCurrent._lstsearchgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 561;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(65536);
act_newashkhas.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 562;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(131072);
act_newashkhas.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 563;BA.debugLine="Dim mc As String=GroupCodeSelect1";
Debug.ShouldStop(262144);
_mc = act_newashkhas.mostCurrent._groupcodeselect1;Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 565;BA.debugLine="Dim Count As Int = 3";
Debug.ShouldStop(1048576);
_count = BA.numberCast(int.class, 3);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 566;BA.debugLine="querySearch2=\"Select FldC_Gorooh,FldN_Gorooh Fro";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent._querysearch2 = RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) > "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"));
 BA.debugLineNum = 567;BA.debugLine="Dim Cu As Cursor=MCode.Result(querySearch2)";
Debug.ShouldStop(4194304);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_newashkhas.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas.mostCurrent._querysearch2));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 568;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 571;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(67108864);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 572;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(134217728);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 574;BA.debugLine="lstSearchGroup2.Add(Cu.GetString(\"FldN_Gorooh\"";
Debug.ShouldStop(536870912);
act_newashkhas.mostCurrent._lstsearchgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 580;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(8);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549872930",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_newashkhas.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 581;BA.debugLine="GroupCodeSelect=GroupCodeSelect1";
Debug.ShouldStop(16);
act_newashkhas._groupcodeselect = BA.numberCast(long.class, act_newashkhas.mostCurrent._groupcodeselect1);
 BA.debugLineNum = 585;BA.debugLine="SearchTemplate2.SetItems(lstSearchGroup2)";
Debug.ShouldStop(256);
act_newashkhas.mostCurrent._searchtemplate2.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(act_newashkhas.mostCurrent._lstsearchgroup2));
 BA.debugLineNum = 586;BA.debugLine="SearchTemplate2.GetPanel(Dialog).BringToFront";
Debug.ShouldStop(512);
act_newashkhas.mostCurrent._searchtemplate2.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_getpanel" /*RemoteObject*/ ,(Object)(act_newashkhas.mostCurrent._dialog)).runVoidMethod ("BringToFront");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e22.toString()); BA.debugLineNum = 589;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549872939",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 590;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8192);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner_ItemClick"))));
 };
 BA.debugLineNum = 592;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner1_item_clicked() throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner1_item_clicked (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,710);
if (RapidSub.canDelegate("nicespinner1_item_clicked")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","nicespinner1_item_clicked");}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
 BA.debugLineNum = 710;BA.debugLine="Sub NiceSpinner1_item_clicked";
Debug.ShouldStop(32);
 BA.debugLineNum = 711;BA.debugLine="Dim Position As Int=NiceSpinner1.SelectedIndex";
Debug.ShouldStop(64);
_position = act_newashkhas.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex");Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 712;BA.debugLine="Dim Value As Object=NiceSpinner1.Text";
Debug.ShouldStop(128);
_value = (act_newashkhas.mostCurrent._nicespinner1.runMethod(true,"getText"));Debug.locals.put("Value", _value);Debug.locals.put("Value", _value);
 BA.debugLineNum = 713;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.SelectedIndex &\" s";
Debug.ShouldStop(256);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550069507",RemoteObject.concat(RemoteObject.createImmutable("ns2 item "),act_newashkhas.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 714;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.Text &\" selected\")";
Debug.ShouldStop(512);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550069508",RemoteObject.concat(RemoteObject.createImmutable("ns2 item "),act_newashkhas.mostCurrent._nicespinner1.runMethod(true,"getText"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 715;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 716;BA.debugLine="If Position=0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 717;BA.debugLine="If lstSelectedCodeGroupAshkhas.Size>0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",act_newashkhas.mostCurrent._lstselectedcodegroupashkhas.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 718;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupAshkhas.G";
Debug.ShouldStop(8192);
act_newashkhas.mostCurrent._groupcodeselect2 = BA.ObjectToString(act_newashkhas.mostCurrent._lstselectedcodegroupashkhas.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_newashkhas.mostCurrent._lstselectedcodegroupashkhas.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 };
 }else {
 BA.debugLineNum = 722;BA.debugLine="Dim lst As List=ListGoroohAshkhas1";
Debug.ShouldStop(131072);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_newashkhas.mostCurrent._listgoroohashkhas1;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 723;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(Positi";
Debug.ShouldStop(262144);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 724;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
Debug.ShouldStop(524288);
act_newashkhas.mostCurrent._groupcodeselect2 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 726;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(2097152);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 728;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(8388608);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 729;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(16777216);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_newashkhas.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 730;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 731;BA.debugLine="ListGoroohAshkhas1.Clear";
Debug.ShouldStop(67108864);
act_newashkhas.mostCurrent._listgoroohashkhas1.runVoidMethod ("Clear");
 BA.debugLineNum = 735;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(Item.FldC_Goro";
Debug.ShouldStop(1073741824);
act_newashkhas.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Add",(Object)((_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 739;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(4);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 741;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(16);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 743;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(64);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 744;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(128);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 745;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(256);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 746;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(512);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 747;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(1024);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 748;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
Debug.ShouldStop(2048);
act_newashkhas.mostCurrent._listgoroohashkhas1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 750;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(8192);
act_newashkhas.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 753;BA.debugLine="NiceSpinner1.RemoveView";
Debug.ShouldStop(65536);
act_newashkhas.mostCurrent._nicespinner1.runVoidMethod ("RemoveView");
 BA.debugLineNum = 754;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
Debug.ShouldStop(131072);
act_newashkhas.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_newashkhas.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner1")));
 BA.debugLineNum = 755;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.m";
Debug.ShouldStop(262144);
act_newashkhas.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_newashkhas.mostCurrent._nicespinner1.getObject())),(Object)(act_newashkhas.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_newashkhas.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_newashkhas.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_newashkhas.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 756;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(524288);
act_newashkhas.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_newashkhas.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 757;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONT";
Debug.ShouldStop(1048576);
act_newashkhas.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_newashkhas.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 758;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAsset";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_newashkhas.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 759;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(4194304);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 760;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.";
Debug.ShouldStop(8388608);
_op1.runVoidMethod ("Initialize2",(Object)(act_newashkhas.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_newashkhas.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_newashkhas.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_newashkhas.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 761;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(16777216);
act_newashkhas.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 762;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(33554432);
act_newashkhas.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_newashkhas.mostCurrent._lstgroup2.getObject())));
 };
 };
 BA.debugLineNum = 766;BA.debugLine="GroupCodeSelect=GroupCodeSelect2";
Debug.ShouldStop(536870912);
act_newashkhas._groupcodeselect = BA.numberCast(long.class, act_newashkhas.mostCurrent._groupcodeselect2);
 BA.debugLineNum = 767;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(1073741824);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550069561",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_newashkhas.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 768;BA.debugLine="Log(\"position2: \"&Position)";
Debug.ShouldStop(-2147483648);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550069562",RemoteObject.concat(RemoteObject.createImmutable("position2: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e46) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e46.toString()); BA.debugLineNum = 770;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550069564",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 771;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner1_ItemClick"))));
 };
 BA.debugLineNum = 773;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner1_item_clicked1() throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner1_item_clicked1 (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,594);
if (RapidSub.canDelegate("nicespinner1_item_clicked1")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","nicespinner1_item_clicked1");}
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 594;BA.debugLine="Sub NiceSpinner1_item_clicked1";
Debug.ShouldStop(131072);
 BA.debugLineNum = 601;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.Text &\" selected\")";
Debug.ShouldStop(16777216);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549938439",RemoteObject.concat(RemoteObject.createImmutable("ns2 item "),act_newashkhas.mostCurrent._nicespinner1.runMethod(true,"getText"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 602;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 605;BA.debugLine="Dim mc As String=GroupCodeSelect2";
Debug.ShouldStop(268435456);
_mc = act_newashkhas.mostCurrent._groupcodeselect2;Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 607;BA.debugLine="Dim Count As Int =3";
Debug.ShouldStop(1073741824);
_count = BA.numberCast(int.class, 3);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 608;BA.debugLine="querySearch2=\"Select FldC_Gorooh,FldN_Gorooh Fro";
Debug.ShouldStop(-2147483648);
act_newashkhas.mostCurrent._querysearch2 = RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) > "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"));
 BA.debugLineNum = 609;BA.debugLine="Dim Cu As Cursor=MCode.Result(querySearch2)";
Debug.ShouldStop(1);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_newashkhas.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas.mostCurrent._querysearch2));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 610;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 612;BA.debugLine="lstSearchGroup2.Clear";
Debug.ShouldStop(8);
act_newashkhas.mostCurrent._lstsearchgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 614;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(32);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 615;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(64);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 616;BA.debugLine="lstSearchGroup2.Add(Cu.GetString(\"FldN_Gorooh\"";
Debug.ShouldStop(128);
act_newashkhas.mostCurrent._lstsearchgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 620;BA.debugLine="GroupCodeSelect=GroupCodeSelect2";
Debug.ShouldStop(2048);
act_newashkhas._groupcodeselect = BA.numberCast(long.class, act_newashkhas.mostCurrent._groupcodeselect2);
 BA.debugLineNum = 621;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(4096);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549938459",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_newashkhas.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 623;BA.debugLine="Log(\"lstSearchGroup2: \"& lstSearchGroup2.Size)";
Debug.ShouldStop(16384);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549938461",RemoteObject.concat(RemoteObject.createImmutable("lstSearchGroup2: "),act_newashkhas.mostCurrent._lstsearchgroup2.runMethod(true,"getSize")),0);
 BA.debugLineNum = 624;BA.debugLine="SearchTemplate2.SetItems(lstSearchGroup2)";
Debug.ShouldStop(32768);
act_newashkhas.mostCurrent._searchtemplate2.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(act_newashkhas.mostCurrent._lstsearchgroup2));
 BA.debugLineNum = 625;BA.debugLine="SearchTemplate2.GetPanel(Dialog).BringToFront";
Debug.ShouldStop(65536);
act_newashkhas.mostCurrent._searchtemplate2.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_getpanel" /*RemoteObject*/ ,(Object)(act_newashkhas.mostCurrent._dialog)).runVoidMethod ("BringToFront");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e20.toString()); BA.debugLineNum = 627;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","549938465",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 628;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(524288);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner1_ItemClick"))));
 };
 BA.debugLineNum = 630;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim GPS1 As GPS";
act_newashkhas._gps1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 8;BA.debugLine="Private t1 As Timer";
act_newashkhas._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 9;BA.debugLine="Public shakhs As AdapterListAshkhas";
act_newashkhas._shakhs = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savenewmoshtari() throws Exception{
try {
		Debug.PushSubsStack("SaveNewMoshtari (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1024);
if (RapidSub.canDelegate("savenewmoshtari")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","savenewmoshtari");}
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _chek = RemoteObject.createImmutable(false);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 1024;BA.debugLine="Sub SaveNewMoshtari";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1026;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 1027;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(4);
_time = act_newashkhas.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_newashkhas.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 1032;BA.debugLine="Dim Chek As Boolean";
Debug.ShouldStop(128);
_chek = RemoteObject.createImmutable(false);Debug.locals.put("Chek", _chek);
 BA.debugLineNum = 1033;BA.debugLine="If ChGps.Checked=True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._chgps.runMethod(true,"getChecked"),act_newashkhas.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1034;BA.debugLine="Chek=True";
Debug.ShouldStop(512);
_chek = act_newashkhas.mostCurrent.__c.getField(true,"True");Debug.locals.put("Chek", _chek);
 }else {
 BA.debugLineNum = 1036;BA.debugLine="If Lat.Length>0 And Lon.Length>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",act_newashkhas.mostCurrent._lat.runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",act_newashkhas.mostCurrent._lon.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1037;BA.debugLine="Chek=True";
Debug.ShouldStop(4096);
_chek = act_newashkhas.mostCurrent.__c.getField(true,"True");Debug.locals.put("Chek", _chek);
 }else {
 BA.debugLineNum = 1039;BA.debugLine="ToastMessageShow(\"تا دریافت موقعیت مکانی کمی ص";
Debug.ShouldStop(16384);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تا دریافت موقعیت مکانی کمی صبر کنید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 };
 };
 BA.debugLineNum = 1042;BA.debugLine="If	GroupCodeSelect=0  Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_newashkhas._groupcodeselect,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 1043;BA.debugLine="ToastMessageShow(\"لطفا گروه مورد نظر را انتخاب";
Debug.ShouldStop(262144);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا گروه مورد نظر را انتخاب کنید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1044;BA.debugLine="Return";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1046;BA.debugLine="If myCode.Check_Is_Null(MCode.C_Visitor) Or MCod";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(".",act_newashkhas.mostCurrent._mycode.runMethod(true,"_check_is_null" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas.mostCurrent._mcode._c_visitor /*RemoteObject*/ ))) || RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1047;BA.debugLine="Dim Cu As Cursor =MCode.Result(\"Select * From T";
Debug.ShouldStop(4194304);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_newashkhas.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1048;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(8388608);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1049;BA.debugLine="MCode.C_Visitor = Cu.GetString(\"FldC_Visitor\")";
Debug.ShouldStop(16777216);
act_newashkhas.mostCurrent._mcode._c_visitor /*RemoteObject*/  = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor")));
 BA.debugLineNum = 1050;BA.debugLine="MCode.N_Visitor = Cu.GetString(\"FldN_Visitor\")";
Debug.ShouldStop(33554432);
act_newashkhas.mostCurrent._mcode._n_visitor /*RemoteObject*/  = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Visitor")));
 BA.debugLineNum = 1051;BA.debugLine="myCode.SendError(\"SaveNewMoshtari NoSetCodeVisi";
Debug.ShouldStop(67108864);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString("SaveNewMoshtari NoSetCodeVisitor")),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-SaveNewMoshtari"))));
 };
 BA.debugLineNum = 1053;BA.debugLine="If Chek=True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_chek,act_newashkhas.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1054;BA.debugLine="If Lat = \"\" Or Lon = \"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._lat,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._lon,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1055;BA.debugLine="Lat = \"\"";
Debug.ShouldStop(1073741824);
act_newashkhas.mostCurrent._lat = BA.ObjectToString("");
 BA.debugLineNum = 1056;BA.debugLine="Lon = \"\"";
Debug.ShouldStop(-2147483648);
act_newashkhas.mostCurrent._lon = BA.ObjectToString("");
 };
 BA.debugLineNum = 1061;BA.debugLine="If TxtC_Meli.Text = \"\" Then TxtC_Meli.Text = \"\"";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._txtc_meli.runMethod(true,"getText"),BA.ObjectToString(""))) { 
act_newashkhas.mostCurrent._txtc_meli.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 1062;BA.debugLine="If TxtTell.Text<>\"\"  Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",act_newashkhas.mostCurrent._txttell.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 1063;BA.debugLine="If CheckTekrariMoshtari2(TxtTell.text)  Then";
Debug.ShouldStop(64);
if (_checktekrarimoshtari2(act_newashkhas.mostCurrent._txttell.runMethod(true,"getText")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1064;BA.debugLine="ToastMessageShow(\"شماره تلفن وارد شده تکراری";
Debug.ShouldStop(128);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شماره تلفن وارد شده تکراری می باشد")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1065;BA.debugLine="Return";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 1068;BA.debugLine="If TxtMob.Text<>\"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",act_newashkhas.mostCurrent._txtmob.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 1069;BA.debugLine="If CheckTekrariMoshtari2(TxtMob.text) Then";
Debug.ShouldStop(4096);
if (_checktekrarimoshtari2(act_newashkhas.mostCurrent._txtmob.runMethod(true,"getText")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1070;BA.debugLine="ToastMessageShow(\"شماره موبایل وارد شده تکرار";
Debug.ShouldStop(8192);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شماره موبایل وارد شده تکراری می باشد")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1071;BA.debugLine="Return";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 1075;BA.debugLine="If MCode.UpdateShakhs=False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",act_newashkhas.mostCurrent._mcode._updateshakhs /*RemoteObject*/ ,act_newashkhas.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1080;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblAshkhasNew (F";
Debug.ShouldStop(8388608);
act_newashkhas.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblAshkhasNew (FldCodeTafzili,FldSharheTafzili,FldVisitor,FldTell,FldMobile,FldAddress,FldCodeGroup,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon) Values ('"),act_newashkhas.mostCurrent._txtcodemostari.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),act_newashkhas.mostCurrent._txtname.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),act_newashkhas.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("', '"),act_newashkhas.mostCurrent._txttell.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtmob.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtaddress.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas._groupcodeselect,RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtc_meli.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtc_posti.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtshomarehesab.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtlat.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtlon.runMethod(true,"getText"),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 1085;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblAshkhas (fldC";
Debug.ShouldStop(268435456);
act_newashkhas.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblAshkhas (fldCodetafzili,fldSharheTafzili,fldVisitor,fldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,fldAdress,fldMande,fldCodeGroup,fldNameGroup,FldLat,FldLon,FldSync) Values ('"),act_newashkhas.mostCurrent._txtcodemostari.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),act_newashkhas.mostCurrent._txtname.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),act_newashkhas.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("', '"),act_newashkhas.mostCurrent._txttell.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtmob.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtc_meli.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtc_posti.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtshomarehesab.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtaddress.runMethod(true,"getText"),RemoteObject.createImmutable("','0','"),act_newashkhas._groupcodeselect,RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._groupnameselect,RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtlat.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_newashkhas.mostCurrent._txtlon.runMethod(true,"getText"),RemoteObject.createImmutable("','False')"))));
 BA.debugLineNum = 1091;BA.debugLine="MCode.C_Tafzili=TxtCodeMostari.Text";
Debug.ShouldStop(4);
act_newashkhas.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = act_newashkhas.mostCurrent._txtcodemostari.runMethod(true,"getText");
 BA.debugLineNum = 1092;BA.debugLine="CallSub3(Service_Server,\"SaveLocationMoshtari\"";
Debug.ShouldStop(8);
act_newashkhas.mostCurrent.__c.runMethodAndSync(false,"CallSubNew3",act_newashkhas.processBA,(Object)((act_newashkhas.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("SaveLocationMoshtari")),(Object)((act_newashkhas.mostCurrent._txtlat.runMethod(true,"getText"))),(Object)((act_newashkhas.mostCurrent._txtlon.runMethod(true,"getText"))));
 BA.debugLineNum = 1093;BA.debugLine="ToastMessageShow(\"اطلاعات با موفقیت ثبت گردید\"";
Debug.ShouldStop(16);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعات با موفقیت ثبت گردید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1094;BA.debugLine="GPS1.stop";
Debug.ShouldStop(32);
act_newashkhas._gps1.runVoidMethod ("Stop");
 BA.debugLineNum = 1095;BA.debugLine="Activity_KeyPress(KeyCodes.KEYCODE_BACK)";
Debug.ShouldStop(64);
_activity_keypress(act_newashkhas.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK"));
 }else {
 BA.debugLineNum = 1099;BA.debugLine="UpdateAshkhasNew";
Debug.ShouldStop(1024);
_updateashkhasnew();
 BA.debugLineNum = 1101;BA.debugLine="UpdateAshkhas";
Debug.ShouldStop(4096);
_updateashkhas();
 };
 BA.debugLineNum = 1111;BA.debugLine="ToastMessageShow(\"اطلاعات با موفقیت ثبت گردید\",";
Debug.ShouldStop(4194304);
act_newashkhas.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعات با موفقیت ثبت گردید")),(Object)(act_newashkhas.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1112;BA.debugLine="GPS1.stop";
Debug.ShouldStop(8388608);
act_newashkhas._gps1.runVoidMethod ("Stop");
 BA.debugLineNum = 1113;BA.debugLine="Activity_KeyPress(KeyCodes.KEYCODE_BACK)";
Debug.ShouldStop(16777216);
_activity_keypress(act_newashkhas.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e59) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e59.toString()); BA.debugLineNum = 1116;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550856028",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1117;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
Debug.ShouldStop(268435456);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-SaveNewMoshtari"))));
 };
 BA.debugLineNum = 1119;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("t1_tick (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,880);
if (RapidSub.canDelegate("t1_tick")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","t1_tick");}
 BA.debugLineNum = 880;BA.debugLine="Sub t1_tick";
Debug.ShouldStop(32768);
 BA.debugLineNum = 881;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(65536);
act_newashkhas._t1.runMethod(true,"setEnabled",act_newashkhas.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 882;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 883;BA.debugLine="GetLocation";
Debug.ShouldStop(262144);
_getlocation();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_newashkhas.processBA, e5.toString()); BA.debugLineNum = 886;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent.__c.runVoidMethod ("LogImpl","550593798",BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA)),0);
 BA.debugLineNum = 887;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
Debug.ShouldStop(4194304);
act_newashkhas.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_newashkhas.mostCurrent.__c.runMethod(false,"LastException",act_newashkhas.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_newashkhas.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-t1_tick"))));
 };
 BA.debugLineNum = 913;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtlat_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtLat_TextChanged (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1184);
if (RapidSub.canDelegate("txtlat_textchanged")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","txtlat_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1184;BA.debugLine="Sub TxtLat_TextChanged (Old As String, New As Stri";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1185;BA.debugLine="Lat=MCode.ConvertNumbersPersian2English(TxtLat.te";
Debug.ShouldStop(1);
act_newashkhas.mostCurrent._lat = act_newashkhas.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas.mostCurrent._txtlat.runMethod(true,"getText")));
 BA.debugLineNum = 1186;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtlon_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtLon_TextChanged (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1180);
if (RapidSub.canDelegate("txtlon_textchanged")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","txtlon_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1180;BA.debugLine="Sub TxtLon_TextChanged (Old As String, New As Stri";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1181;BA.debugLine="Lon=MCode.ConvertNumbersPersian2English(TxtLon.te";
Debug.ShouldStop(268435456);
act_newashkhas.mostCurrent._lon = act_newashkhas.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas.mostCurrent._txtlon.runMethod(true,"getText")));
 BA.debugLineNum = 1182;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateashkhas() throws Exception{
try {
		Debug.PushSubsStack("UpdateAshkhas (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1145);
if (RapidSub.canDelegate("updateashkhas")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","updateashkhas");}
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _where = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 1145;BA.debugLine="Sub UpdateAshkhas";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1146;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(33554432);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 1147;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(67108864);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 1149;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(268435456);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 1150;BA.debugLine="Where.Initialize";
Debug.ShouldStop(536870912);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 1152;BA.debugLine="Fields.Put(\"fldSharheTafzili\",TxtName.Text)";
Debug.ShouldStop(-2147483648);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharheTafzili"))),(Object)((act_newashkhas.mostCurrent._txtname.runMethod(true,"getText"))));
 BA.debugLineNum = 1153;BA.debugLine="Fields.Put(\"fldTell\",TxtTell.Text)";
Debug.ShouldStop(1);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldTell"))),(Object)((act_newashkhas.mostCurrent._txttell.runMethod(true,"getText"))));
 BA.debugLineNum = 1154;BA.debugLine="Fields.Put(\"FldMobile\",TxtMob.Text)";
Debug.ShouldStop(2);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMobile"))),(Object)((act_newashkhas.mostCurrent._txtmob.runMethod(true,"getText"))));
 BA.debugLineNum = 1155;BA.debugLine="Fields.Put(\"fldAdress\",TxtAddress.Text)";
Debug.ShouldStop(4);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldAdress"))),(Object)((act_newashkhas.mostCurrent._txtaddress.runMethod(true,"getText"))));
 BA.debugLineNum = 1156;BA.debugLine="Fields.Put(\"fldCodeGroup\",GroupCodeSelect)";
Debug.ShouldStop(8);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeGroup"))),(Object)((act_newashkhas._groupcodeselect)));
 BA.debugLineNum = 1157;BA.debugLine="Fields.Put(\"fldNameGroup\",GroupNameSelect)";
Debug.ShouldStop(16);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldNameGroup"))),(Object)((act_newashkhas.mostCurrent._groupnameselect)));
 BA.debugLineNum = 1158;BA.debugLine="Fields.Put(\"FldC_Meli\",TxtC_Meli.Text)";
Debug.ShouldStop(32);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Meli"))),(Object)((act_newashkhas.mostCurrent._txtc_meli.runMethod(true,"getText"))));
 BA.debugLineNum = 1159;BA.debugLine="Fields.Put(\"FldC_Posti\",TxtC_Posti.Text)";
Debug.ShouldStop(64);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Posti"))),(Object)((act_newashkhas.mostCurrent._txtc_posti.runMethod(true,"getText"))));
 BA.debugLineNum = 1160;BA.debugLine="Fields.Put(\"FldShomarehesab\",TxtShomarehesab.Text";
Debug.ShouldStop(128);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomarehesab"))),(Object)((act_newashkhas.mostCurrent._txtshomarehesab.runMethod(true,"getText"))));
 BA.debugLineNum = 1161;BA.debugLine="Fields.Put(\"FldLat\",TxtLat.Text)";
Debug.ShouldStop(256);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldLat"))),(Object)((act_newashkhas.mostCurrent._txtlat.runMethod(true,"getText"))));
 BA.debugLineNum = 1162;BA.debugLine="Fields.Put(\"FldLon\",TxtLon.Text)";
Debug.ShouldStop(512);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldLon"))),(Object)((act_newashkhas.mostCurrent._txtlon.runMethod(true,"getText"))));
 BA.debugLineNum = 1164;BA.debugLine="Where.Put(\"fldCodetafzili\",shakhs.CodeTafzili)";
Debug.ShouldStop(2048);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodetafzili"))),(Object)((act_newashkhas._shakhs.getField(true,"CodeTafzili" /*RemoteObject*/ ))));
 BA.debugLineNum = 1167;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblAshkhas\",Fie";
Debug.ShouldStop(16384);
act_newashkhas.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblAshkhas")),(Object)(_fields),(Object)(_where));
 BA.debugLineNum = 1168;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateashkhasnew() throws Exception{
try {
		Debug.PushSubsStack("UpdateAshkhasNew (act_newashkhas) ","act_newashkhas",24,act_newashkhas.mostCurrent.activityBA,act_newashkhas.mostCurrent,1121);
if (RapidSub.canDelegate("updateashkhasnew")) { return ir.parsikhesab.pakhsh.act_newashkhas.remoteMe.runUserSub(false, "act_newashkhas","updateashkhasnew");}
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _where = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 1121;BA.debugLine="Sub UpdateAshkhasNew";
Debug.ShouldStop(1);
 BA.debugLineNum = 1122;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(2);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 1123;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(4);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 1125;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(16);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 1126;BA.debugLine="Where.Initialize";
Debug.ShouldStop(32);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 1128;BA.debugLine="Fields.Put(\"FldSharheTafzili\",TxtName.Text)";
Debug.ShouldStop(128);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSharheTafzili"))),(Object)((act_newashkhas.mostCurrent._txtname.runMethod(true,"getText"))));
 BA.debugLineNum = 1129;BA.debugLine="Fields.Put(\"FldTell\",TxtTell.Text)";
Debug.ShouldStop(256);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTell"))),(Object)((act_newashkhas.mostCurrent._txttell.runMethod(true,"getText"))));
 BA.debugLineNum = 1130;BA.debugLine="Fields.Put(\"FldMobile\",TxtMob.Text)";
Debug.ShouldStop(512);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMobile"))),(Object)((act_newashkhas.mostCurrent._txtmob.runMethod(true,"getText"))));
 BA.debugLineNum = 1131;BA.debugLine="Fields.Put(\"FldAddress\",TxtAddress.Text)";
Debug.ShouldStop(1024);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAddress"))),(Object)((act_newashkhas.mostCurrent._txtaddress.runMethod(true,"getText"))));
 BA.debugLineNum = 1132;BA.debugLine="Fields.Put(\"fldCodeGroup\",GroupCodeSelect)";
Debug.ShouldStop(2048);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeGroup"))),(Object)((act_newashkhas._groupcodeselect)));
 BA.debugLineNum = 1133;BA.debugLine="Fields.Put(\"FldC_Meli\",TxtC_Meli.Text)";
Debug.ShouldStop(4096);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Meli"))),(Object)((act_newashkhas.mostCurrent._txtc_meli.runMethod(true,"getText"))));
 BA.debugLineNum = 1134;BA.debugLine="Fields.Put(\"FldC_Posti\",TxtC_Posti.Text)";
Debug.ShouldStop(8192);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Posti"))),(Object)((act_newashkhas.mostCurrent._txtc_posti.runMethod(true,"getText"))));
 BA.debugLineNum = 1135;BA.debugLine="Fields.Put(\"FldShomarehesab\",TxtShomarehesab.Text";
Debug.ShouldStop(16384);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomarehesab"))),(Object)((act_newashkhas.mostCurrent._txtshomarehesab.runMethod(true,"getText"))));
 BA.debugLineNum = 1136;BA.debugLine="Fields.Put(\"FldLat\",TxtLat.Text)";
Debug.ShouldStop(32768);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldLat"))),(Object)((act_newashkhas.mostCurrent._txtlat.runMethod(true,"getText"))));
 BA.debugLineNum = 1137;BA.debugLine="Fields.Put(\"FldLon\",TxtLon.Text)";
Debug.ShouldStop(65536);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldLon"))),(Object)((act_newashkhas.mostCurrent._txtlon.runMethod(true,"getText"))));
 BA.debugLineNum = 1139;BA.debugLine="Where.Put(\"FldCodeTafzili\",shakhs.CodeTafzili)";
Debug.ShouldStop(262144);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCodeTafzili"))),(Object)((act_newashkhas._shakhs.getField(true,"CodeTafzili" /*RemoteObject*/ ))));
 BA.debugLineNum = 1142;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblAshkhasNew\",";
Debug.ShouldStop(2097152);
act_newashkhas.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,act_newashkhas.mostCurrent.activityBA,(Object)(act_newashkhas.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblAshkhasNew")),(Object)(_fields),(Object)(_where));
 BA.debugLineNum = 1143;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}