package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="Activity.LoadLayout(\"l_Splash\")";
Debug.ShouldStop(131072);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_Splash")),main.mostCurrent.activityBA);
 BA.debugLineNum = 51;BA.debugLine="lblTitle.Text=Application.LabelName";
Debug.ShouldStop(262144);
main.mostCurrent._lbltitle.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName")));
 BA.debugLineNum = 52;BA.debugLine="lblVer.Text=\"نسخه \"&Application.VersionName";
Debug.ShouldStop(524288);
main.mostCurrent._lblver.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نسخه "),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionName"))));
 BA.debugLineNum = 53;BA.debugLine="nativeMe.InitializeContext";
Debug.ShouldStop(1048576);
main.mostCurrent._nativeme.runVoidMethod ("InitializeContext",main.processBA);
 BA.debugLineNum = 54;BA.debugLine="nativeMe.RunMethod(\"setDefaultUncaughtExceptionHa";
Debug.ShouldStop(2097152);
main.mostCurrent._nativeme.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDefaultUncaughtExceptionHandler")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 55;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(4194304);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 56;BA.debugLine="i = Activity.GetStartingIntent";
Debug.ShouldStop(8388608);
_i = main.mostCurrent._activity.runMethod(false,"GetStartingIntent");Debug.locals.put("i", _i);
 BA.debugLineNum = 57;BA.debugLine="If i.HasExtra(\"Crash\") Then";
Debug.ShouldStop(16777216);
if (_i.runMethod(true,"HasExtra",(Object)(RemoteObject.createImmutable("Crash"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="Log(\"After crash: \" & i.GetExtra(\"Crash\"))";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5131082",RemoteObject.concat(RemoteObject.createImmutable("After crash: "),_i.runMethod(false,"GetExtra",(Object)(RemoteObject.createImmutable("Crash")))),0);
 };
 BA.debugLineNum = 60;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(134217728);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 61;BA.debugLine="Log(\"Hello\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5131085",RemoteObject.createImmutable("Hello"),0);
 };
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,185);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 185;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) return main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,181);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 181;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Activity_PermissionResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,96);
if (RapidSub.canDelegate("activity_permissionresult")) { return ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","activity_permissionresult", _permission, _result);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _api = RemoteObject.createImmutable(0);
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 96;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 98;BA.debugLine="Dim Api As Int";
Debug.ShouldStop(2);
_api = RemoteObject.createImmutable(0);Debug.locals.put("Api", _api);
 BA.debugLineNum = 99;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
Debug.ShouldStop(4);
_api = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.os.Build$VERSION")),(Object)(RemoteObject.createImmutable("SDK_INT"))));Debug.locals.put("Api", _api);
 BA.debugLineNum = 100;BA.debugLine="rp.GetSafeDirDefaultExternal(\"Parsik\")";
Debug.ShouldStop(8);
main._rp.runVoidMethod ("GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("Parsik")));
 BA.debugLineNum = 101;BA.debugLine="If Api >= 30 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("g",_api,BA.numberCast(double.class, 30))) { 
 BA.debugLineNum = 102;BA.debugLine="If Permission = PermissionsManager.SPECIAL_MANAG";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_permission,main.mostCurrent._permissionsmanager.getField(true,"SPECIAL_MANAGE_EXTERNAL_STORAGE"))) { 
 BA.debugLineNum = 103;BA.debugLine="Log(Result)";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5524295",BA.ObjectToString(_result),0);
 BA.debugLineNum = 104;BA.debugLine="PermissionActive2";
Debug.ShouldStop(128);
_permissionactive2();
 };
 }else {
 BA.debugLineNum = 107;BA.debugLine="If Permission = rp.PERMISSION_WRITE_EXTERNAL_STO";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_permission,main._rp.getField(true,"PERMISSION_WRITE_EXTERNAL_STORAGE"))) { 
 BA.debugLineNum = 108;BA.debugLine="Log(Result)";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5524300",BA.ObjectToString(_result),0);
 BA.debugLineNum = 109;BA.debugLine="PermissionActive2";
Debug.ShouldStop(4096);
_permissionactive2();
 };
 };
 BA.debugLineNum = 113;BA.debugLine="If Permission = rp.PERMISSION_READ_PHONE_STATE Th";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_permission,main._rp.getField(true,"PERMISSION_READ_PHONE_STATE"))) { 
 BA.debugLineNum = 114;BA.debugLine="Log(Result)";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5524306",BA.ObjectToString(_result),0);
 BA.debugLineNum = 115;BA.debugLine="PermissionActive3";
Debug.ShouldStop(262144);
_permissionactive3();
 };
 BA.debugLineNum = 117;BA.debugLine="If Permission= rp.PERMISSION_ACCESS_FINE_LOCATION";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_permission,main._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION"))) { 
 BA.debugLineNum = 118;BA.debugLine="Log(Result)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5524310",BA.ObjectToString(_result),0);
 BA.debugLineNum = 121;BA.debugLine="PermissionActive4";
Debug.ShouldStop(16777216);
_permissionactive4();
 };
 BA.debugLineNum = 123;BA.debugLine="If Permission= rp.PERMISSION_CALL_PHONE Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_permission,main._rp.getField(true,"PERMISSION_CALL_PHONE"))) { 
 BA.debugLineNum = 124;BA.debugLine="Log(Result)";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5524316",BA.ObjectToString(_result),0);
 BA.debugLineNum = 125;BA.debugLine="PermissionActive5";
Debug.ShouldStop(268435456);
_permissionactive5();
 };
 BA.debugLineNum = 127;BA.debugLine="If Permission = rp.PERMISSION_ACCESS_COARSE_LOCAT";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_permission,main._rp.getField(true,"PERMISSION_ACCESS_COARSE_LOCATION"))) { 
 BA.debugLineNum = 128;BA.debugLine="Log(Result)";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5524320",BA.ObjectToString(_result),0);
 BA.debugLineNum = 129;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 131;BA.debugLine="T_Gif.Initialize(\"T_Gif\",3000)";
Debug.ShouldStop(4);
main._t_gif.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("T_Gif")),(Object)(BA.numberCast(long.class, 3000)));
 BA.debugLineNum = 132;BA.debugLine="ShowSplash";
Debug.ShouldStop(8);
_showsplash();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e34) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e34.toString()); BA.debugLineNum = 134;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5524326",BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 135;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"";
Debug.ShouldStop(64);
main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_PermissionResult"))));
 };
 };
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,171);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 171;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 178;BA.debugLine="PermissionActive1";
Debug.ShouldStop(131072);
_permissionactive1();
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkvaziat() throws Exception{
try {
		Debug.PushSubsStack("CheckVaziat (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,227);
if (RapidSub.canDelegate("checkvaziat")) { return ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","checkvaziat");}
RemoteObject _query = RemoteObject.createImmutable("");
 BA.debugLineNum = 227;BA.debugLine="Sub CheckVaziat";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(8);
if (main.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,main.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 229;BA.debugLine="If MCode.CodeMoshtari=0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 230;BA.debugLine="Dim Query As String=\"Update TblSetting Set FldV";
Debug.ShouldStop(32);
_query = BA.ObjectToString("Update TblSetting Set FldVaziat = '0'");Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 231;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(64);
main.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_query));
 BA.debugLineNum = 233;BA.debugLine="MCode.Vaziat=0";
Debug.ShouldStop(256);
main.mostCurrent._mcode._vaziat /*RemoteObject*/  = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 236;BA.debugLine="MCode.NoeGet=\"GetVaziat\"";
Debug.ShouldStop(2048);
main.mostCurrent._mcode._noeget /*RemoteObject*/  = BA.ObjectToString("GetVaziat");
 BA.debugLineNum = 237;BA.debugLine="StartService(Service_Server)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("StartService",main.processBA,(Object)((main.mostCurrent._service_server.getObject())));
 }else {
 };
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getadvertisingid() throws Exception{
try {
		Debug.PushSubsStack("GetAdvertisingId (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,244);
if (RapidSub.canDelegate("getadvertisingid")) { return ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","getadvertisingid");}
ResumableSub_GetAdvertisingId rsub = new ResumableSub_GetAdvertisingId(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetAdvertisingId extends BA.ResumableSub {
public ResumableSub_GetAdvertisingId(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.main parent;
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _id = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetAdvertisingId (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,244);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 245;BA.debugLine="Dim jo As JavaObject = Me";
Debug.ShouldStop(1048576);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 246;BA.debugLine="jo.RunMethod(\"GetAdvertisingId\", Null)";
Debug.ShouldStop(2097152);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("GetAdvertisingId")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 247;BA.debugLine="Wait For AdvertisingId_Ready (Success As Boolean,";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","advertisingid_ready", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getadvertisingid"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_id = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Id", _id);
;
 BA.debugLineNum = 248;BA.debugLine="Return Id";
Debug.ShouldStop(8388608);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_id));return;};
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static void  _advertisingid_ready(RemoteObject _success,RemoteObject _id) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 38;BA.debugLine="Private ImgGif As ImageView";
main.mostCurrent._imggif = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lblTitle As Label";
main.mostCurrent._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lblVer As Label";
main.mostCurrent._lblver = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private pnlLogo As Panel";
main.mostCurrent._pnllogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private pnlTitle As Panel";
main.mostCurrent._pnltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private pnlVer As Panel";
main.mostCurrent._pnlver = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private nativeMe As JavaObject";
main.mostCurrent._nativeme = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _loadpage() throws Exception{
try {
		Debug.PushSubsStack("LoadPage (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,190);
if (RapidSub.canDelegate("loadpage")) { ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","loadpage"); return;}
ResumableSub_LoadPage rsub = new ResumableSub_LoadPage(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadPage extends BA.ResumableSub {
public ResumableSub_LoadPage(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.main parent;
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadPage (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,190);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 191;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//try
this.state = 21;
this.catchState = 20;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 20;
 BA.debugLineNum = 193;BA.debugLine="Dim Id As String";
Debug.ShouldStop(1);
_id = RemoteObject.createImmutable("");Debug.locals.put("Id", _id);
 BA.debugLineNum = 194;BA.debugLine="Id=MCode.GetDeviceId";
Debug.ShouldStop(2);
_id = parent.mostCurrent._mcode.runMethod(true,"_getdeviceid" /*RemoteObject*/ ,main.mostCurrent.activityBA);Debug.locals.put("Id", _id);
 BA.debugLineNum = 195;BA.debugLine="If Id = \"\" Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_id,BA.ObjectToString(""))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 196;BA.debugLine="Wait For (GetAdvertisingId) Complete (Id As Str";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "loadpage"), _getadvertisingid());
this.state = 22;
return;
case 22:
//C
this.state = 9;
_id = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Id", _id);
;
 BA.debugLineNum = 198;BA.debugLine="Log(MCode.GetApiVersion)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5917512",BA.NumberToString(parent.mostCurrent._mcode.runMethod(true,"_getapiversion" /*RemoteObject*/ ,main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 199;BA.debugLine="MCode.DeviceId=Id";
Debug.ShouldStop(64);
parent.mostCurrent._mcode._deviceid /*RemoteObject*/  = _id;
 BA.debugLineNum = 200;BA.debugLine="Log(Id)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5917514",_id,0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 202;BA.debugLine="Log(Id)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5917516",_id,0);
 BA.debugLineNum = 203;BA.debugLine="MCode.DeviceId=Id";
Debug.ShouldStop(1024);
parent.mostCurrent._mcode._deviceid /*RemoteObject*/  = _id;
 if (true) break;
;
 BA.debugLineNum = 205;BA.debugLine="If MCode.Gps=1 Then";
Debug.ShouldStop(4096);

case 9:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._gps /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 212;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSIO";
Debug.ShouldStop(524288);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 213;BA.debugLine="Wait For Activity_PermissionResult (Permission";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "loadpage"), null);
this.state = 23;
return;
case 23:
//C
this.state = 12;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 214;BA.debugLine="If Result Then";
Debug.ShouldStop(2097152);
if (true) break;

case 12:
//if
this.state = 17;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 217;BA.debugLine="ToastMessageShow(\"No permission...\", True)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No permission...")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 21;
;
 BA.debugLineNum = 220;BA.debugLine="StartActivity(Act_Main)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._act_main.getObject())));
 BA.debugLineNum = 221;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 Debug.CheckDeviceExceptions();
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
 BA.debugLineNum = 223;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5917537",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 224;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadPage"))));
 if (true) break;
if (true) break;

case 21:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static void  _complete(RemoteObject _id) throws Exception{
}
public static void  _permissionactive1() throws Exception{
try {
		Debug.PushSubsStack("PermissionActive1 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,65);
if (RapidSub.canDelegate("permissionactive1")) { ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","permissionactive1"); return;}
ResumableSub_PermissionActive1 rsub = new ResumableSub_PermissionActive1(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PermissionActive1 extends BA.ResumableSub {
public ResumableSub_PermissionActive1(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.main parent;
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _api = RemoteObject.createImmutable(0);
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PermissionActive1 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,65);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 66;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(2);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 67;BA.debugLine="Dim Api As Int";
Debug.ShouldStop(4);
_api = RemoteObject.createImmutable(0);Debug.locals.put("Api", _api);
 BA.debugLineNum = 68;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
Debug.ShouldStop(8);
_api = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.os.Build$VERSION")),(Object)(RemoteObject.createImmutable("SDK_INT"))));Debug.locals.put("Api", _api);
 BA.debugLineNum = 69;BA.debugLine="If Api >= 30 Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("g",_api,BA.numberCast(double.class, 30))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 70;BA.debugLine="PM.CheckAndRequestPermission(PermissionsManager.";
Debug.ShouldStop(32);
parent._pm.runVoidMethod ("CheckAndRequestPermission",main.processBA,(Object)(parent.mostCurrent._permissionsmanager.getField(true,"SPECIAL_MANAGE_EXTERNAL_STORAGE")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 72;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_WRITE_EXTERNAL_";
Debug.ShouldStop(128);
parent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent._rp.getField(true,"PERMISSION_WRITE_EXTERNAL_STORAGE")));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissonresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "permissionactive1"), null);
this.state = 7;
return;
case 7:
//C
this.state = -1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static void  _activity_permissonresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static void  _permissionactive2() throws Exception{
try {
		Debug.PushSubsStack("PermissionActive2 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,77);
if (RapidSub.canDelegate("permissionactive2")) { ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","permissionactive2"); return;}
ResumableSub_PermissionActive2 rsub = new ResumableSub_PermissionActive2(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PermissionActive2 extends BA.ResumableSub {
public ResumableSub_PermissionActive2(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.main parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PermissionActive2 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,77);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 78;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_PHONE_STATE";
Debug.ShouldStop(8192);
parent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent._rp.getField(true,"PERMISSION_READ_PHONE_STATE")));
 BA.debugLineNum = 79;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissonresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "permissionactive2"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static void  _permissionactive3() throws Exception{
try {
		Debug.PushSubsStack("PermissionActive3 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,81);
if (RapidSub.canDelegate("permissionactive3")) { ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","permissionactive3"); return;}
ResumableSub_PermissionActive3 rsub = new ResumableSub_PermissionActive3(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PermissionActive3 extends BA.ResumableSub {
public ResumableSub_PermissionActive3(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.main parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PermissionActive3 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,81);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 82;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
Debug.ShouldStop(131072);
parent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 83;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissonresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "permissionactive3"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static void  _permissionactive4() throws Exception{
try {
		Debug.PushSubsStack("PermissionActive4 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,85);
if (RapidSub.canDelegate("permissionactive4")) { ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","permissionactive4"); return;}
ResumableSub_PermissionActive4 rsub = new ResumableSub_PermissionActive4(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PermissionActive4 extends BA.ResumableSub {
public ResumableSub_PermissionActive4(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.main parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PermissionActive4 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,85);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 86;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CALL_PHONE)";
Debug.ShouldStop(2097152);
parent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent._rp.getField(true,"PERMISSION_CALL_PHONE")));
 BA.debugLineNum = 87;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissonresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "permissionactive4"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static void  _permissionactive5() throws Exception{
try {
		Debug.PushSubsStack("PermissionActive5 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,89);
if (RapidSub.canDelegate("permissionactive5")) { ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","permissionactive5"); return;}
ResumableSub_PermissionActive5 rsub = new ResumableSub_PermissionActive5(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PermissionActive5 extends BA.ResumableSub {
public ResumableSub_PermissionActive5(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.main parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PermissionActive5 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,89);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 90;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_LO";
Debug.ShouldStop(33554432);
parent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent._rp.getField(true,"PERMISSION_ACCESS_COARSE_LOCATION")));
 BA.debugLineNum = 91;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissonresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "permissionactive5"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
act_main_subs_0._process_globals();
service_server_subs_0._process_globals();
mcode_subs_0._process_globals();
mycode_subs_0._process_globals();
mdatabase_subs_0._process_globals();
gpswiget_subs_0._process_globals();
fusedlocationservice_subs_0._process_globals();
service_helper_subs_0._process_globals();
act_selectmantage_subs_0._process_globals();
act_reprizfactorvisitor_subs_0._process_globals();
act_choose_report_subs_0._process_globals();
act_emza_subs_0._process_globals();
act_havaletozie_subs_0._process_globals();
act_imageslideshow_subs_0._process_globals();
act_kala_listi_subs_0._process_globals();
act_kaladefault_subs_0._process_globals();
act_kalapaging_subs_0._process_globals();
act_kalapaging2_subs_0._process_globals();
act_locationmoshtarian_subs_0._process_globals();
act_locationvisitor_subs_0._process_globals();
act_mali_subs_0._process_globals();
act_moshtarian_subs_0._process_globals();
act_newashkhas_subs_0._process_globals();
act_notif_subs_0._process_globals();
act_printmali_subs_0._process_globals();
act_printpic_subs_0._process_globals();
act_printpic2_subs_0._process_globals();
act_profile_subs_0._process_globals();
act_repfactors_subs_0._process_globals();
act_repfactorvisitor_subs_0._process_globals();
act_reportrizebargasht_subs_0._process_globals();
act_reportsoorathesab_subs_0._process_globals();
act_reportvisitor_subs_0._process_globals();
act_reportvisitor2_subs_0._process_globals();
act_restore_subs_0._process_globals();
act_rizefactorhavale_subs_0._process_globals();
act_rizfaktor_subs_0._process_globals();
act_rizhavale_subs_0._process_globals();
act_sabad_subs_0._process_globals();
act_sabtmarjooii_subs_0._process_globals();
act_sabtrizcheck_subs_0._process_globals();
act_saveinfocompany_subs_0._process_globals();
act_savelocation_subs_0._process_globals();
act_search_subs_0._process_globals();
act_selfaktor_subs_0._process_globals();
act_senddata_subs_0._process_globals();
act_setting_subs_0._process_globals();
act_settingpos_subs_0._process_globals();
act_showlocation_subs_0._process_globals();
act_support_subs_0._process_globals();
act_ticket_subs_0._process_globals();
act_video_subs_0._process_globals();
clskala_subs_0._process_globals();
dbutils_subs_0._process_globals();
firebasemessaging_subs_0._process_globals();
geoservice_subs_0._process_globals();
imagedownloader_subs_0._process_globals();
myreceiver_subs_0._process_globals();
service_gps_subs_0._process_globals();
service_notification_subs_0._process_globals();
signaturecapture_subs_0._process_globals();
starter_subs_0._process_globals();
tracker_subs_0._process_globals();
wiget_service_subs_0._process_globals();
xmlviewex_subs_0._process_globals();
newinst2_subs_0._process_globals();
base64encodedecodeimage_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.main");
act_main.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_main");
service_server.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.service_server");
mcode.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.mcode");
mycode.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.mycode");
mdatabase.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.mdatabase");
gpswiget.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.gpswiget");
fusedlocationservice.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.fusedlocationservice");
service_helper.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.service_helper");
act_selectmantage.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_selectmantage");
cls_recashkhas.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_recashkhas");
act_reprizfactorvisitor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_reprizfactorvisitor");
act_choose_report.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_choose_report");
act_emza.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_emza");
act_havaletozie.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_havaletozie");
act_imageslideshow.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_imageslideshow");
act_kala_listi.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_kala_listi");
act_kaladefault.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_kaladefault");
act_kalapaging.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_kalapaging");
act_kalapaging2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_kalapaging2");
act_locationmoshtarian.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_locationmoshtarian");
act_locationvisitor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_locationvisitor");
act_mali.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_mali");
act_moshtarian.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_moshtarian");
act_newashkhas.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_newashkhas");
act_notif.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_notif");
act_printmali.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_printmali");
act_printpic.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_printpic");
act_printpic2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_printpic2");
act_profile.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_profile");
act_repfactors.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_repfactors");
act_repfactorvisitor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_repfactorvisitor");
act_reportrizebargasht.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_reportrizebargasht");
act_reportsoorathesab.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_reportsoorathesab");
act_reportvisitor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_reportvisitor");
act_reportvisitor2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_reportvisitor2");
act_restore.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_restore");
act_rizefactorhavale.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_rizefactorhavale");
act_rizfaktor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_rizfaktor");
act_rizhavale.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_rizhavale");
act_sabad.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_sabad");
act_sabtmarjooii.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_sabtmarjooii");
act_sabtrizcheck.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_sabtrizcheck");
act_saveinfocompany.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_saveinfocompany");
act_savelocation.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_savelocation");
act_search.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_search");
act_selfaktor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_selfaktor");
act_senddata.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_senddata");
act_setting.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_setting");
act_settingpos.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_settingpos");
act_showlocation.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_showlocation");
act_support.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_support");
act_ticket.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_ticket");
act_video.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.act_video");
b4xmainpage.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xmainpage");
cls_factor1_type2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_factor1_type2");
cls_factor2_type2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_factor2_type2");
cls_factor3_type2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_factor3_type2");
cls_faktor1_havale_type1.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_faktor1_havale_type1");
cls_faktor1_havale_type2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_faktor1_havale_type2");
cls_faktor1_type1.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_faktor1_type1");
cls_faktor2_havale_type1.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_faktor2_havale_type1");
cls_faktor2_havale_type2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_faktor2_havale_type2");
cls_faktor2_type1.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_faktor2_type1");
cls_faktor3_havale_type1.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_faktor3_havale_type1");
cls_faktor3_havale_type2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_faktor3_havale_type2");
cls_faktor3_type1.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_faktor3_type1");
cls_imageslideshow.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_imageslideshow");
cls_item_home.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_item_home");
cls_kalapaging.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_kalapaging");
cls_kalapaging2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_kalapaging2");
cls_pos.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_pos");
cls_printmali.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_printmali");
cls_rec_factor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_rec_factor");
cls_rec_factorvisitor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_rec_factorvisitor");
cls_rec_havale.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_rec_havale");
cls_rec_mali.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_rec_mali");
cls_rec_restorfileitem.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_rec_restorfileitem");
cls_rec_rizbargasht.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_rec_rizbargasht");
cls_rec_rizfactorvisitor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor");
cls_rec_video.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_rec_video");
cls_recbackupitem.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_recbackupitem");
cls_recdefultkala.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_recdefultkala");
cls_recfakor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_recfakor");
cls_recfaktor.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_recfaktor");
cls_reckalalisti.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_reckalalisti");
cls_recnotif.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_recnotif");
cls_recsabadkhariditem.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_recsabadkhariditem");
cls_rizcheck.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_rizcheck");
cls_rizhavale.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_rizhavale");
cls_search.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_search");
cls_submenu1.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cls_submenu1");
clskala.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.clskala");
dbutils.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.dbutils");
firebasemessaging.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.firebasemessaging");
geoservice.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.geoservice");
imagedownloader.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.imagedownloader");
myreceiver.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.myreceiver");
service_gps.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.service_gps");
service_notification.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.service_notification");
signaturecapture.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.signaturecapture");
starter.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.starter");
table.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.table");
tracker.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.tracker");
wiget_service.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.wiget_service");
xmlviewex.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.xmlviewex");
cl_appupdate.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.cl_appupdate");
newinst2.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.newinst2");
asbuttonslider.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.asbuttonslider");
base64encodedecodeimage.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.base64encodedecodeimage");
httputils2service.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.httputils2service");
httpjob.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.httpjob");
map2xml.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.map2xml");
xml2map.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.xml2map");
animatedcounter.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("ir.parsikhesab.pakhsh.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 30;BA.debugLine="Dim T_Gif As Timer";
main._t_gif = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 32;BA.debugLine="Private rp As RuntimePermissions";
main._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 33;BA.debugLine="Dim PM As PermissionsManager";
main._pm = RemoteObject.createNew ("igolub.permissionmanager.b4a.PermissionsManager");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showsplash() throws Exception{
try {
		Debug.PushSubsStack("ShowSplash (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,139);
if (RapidSub.canDelegate("showsplash")) { return ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","showsplash");}
 BA.debugLineNum = 139;BA.debugLine="Sub ShowSplash";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 141;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4096);
main.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 142;BA.debugLine="MCode.UpdateDataBase";
Debug.ShouldStop(8192);
main.mostCurrent._mcode.runVoidMethod ("_updatedatabase" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 147;BA.debugLine="T_Gif.Enabled=True";
Debug.ShouldStop(262144);
main._t_gif.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e6.toString()); BA.debugLineNum = 155;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5589840",BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 156;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(134217728);
main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-ShowSplash"))));
 };
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
public static RemoteObject  _t_gif_tick() throws Exception{
try {
		Debug.PushSubsStack("T_Gif_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,160);
if (RapidSub.canDelegate("t_gif_tick")) { return ir.parsikhesab.pakhsh.main.remoteMe.runUserSub(false, "main","t_gif_tick");}
 BA.debugLineNum = 160;BA.debugLine="Sub T_Gif_Tick";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="T_Gif.Enabled=False";
Debug.ShouldStop(1);
main._t_gif.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 163;BA.debugLine="StartActivity(Act_Main)";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._act_main.getObject())));
 BA.debugLineNum = 164;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 165;BA.debugLine="End Sub";
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