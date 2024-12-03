package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_showlocation_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_showlocation) ","act_showlocation",50,act_showlocation.mostCurrent.activityBA,act_showlocation.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_showlocation.remoteMe.runUserSub(false, "act_showlocation","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Activity.LoadLayout(\"L_ShowLocation\")";
Debug.ShouldStop(262144);
act_showlocation.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_ShowLocation")),act_showlocation.mostCurrent.activityBA);
 BA.debugLineNum = 20;BA.debugLine="If MapFragment1.IsGooglePlayServicesAvailable = F";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_showlocation.mostCurrent._mapfragment1.runMethod(true,"IsGooglePlayServicesAvailable",act_showlocation.mostCurrent.activityBA),act_showlocation.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 21;BA.debugLine="ToastMessageShow(\"Please install Google Play Ser";
Debug.ShouldStop(1048576);
act_showlocation.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please install Google Play Services.")),(Object)(act_showlocation.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 22;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
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
		Debug.PushSubsStack("Activity_Pause (act_showlocation) ","act_showlocation",50,act_showlocation.mostCurrent.activityBA,act_showlocation.mostCurrent,31);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_showlocation.remoteMe.runUserSub(false, "act_showlocation","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Resume (act_showlocation) ","act_showlocation",50,act_showlocation.mostCurrent.activityBA,act_showlocation.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_showlocation.remoteMe.runUserSub(false, "act_showlocation","activity_resume");}
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Application_Error (act_showlocation) ","act_showlocation",50,act_showlocation.mostCurrent.activityBA,act_showlocation.mostCurrent,72);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_showlocation.remoteMe.runUserSub(false, "act_showlocation","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 72;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return act_showlocation.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("btn_Back_Click (act_showlocation) ","act_showlocation",50,act_showlocation.mostCurrent.activityBA,act_showlocation.mostCurrent,69);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_showlocation.remoteMe.runUserSub(false, "act_showlocation","btn_back_click");}
 BA.debugLineNum = 69;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
act_showlocation.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 13;BA.debugLine="Private gmap As GoogleMap";
act_showlocation.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private MapFragment1 As MapFragment";
act_showlocation.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI";
act_showlocation.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _mapfragment1_ready() throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_showlocation) ","act_showlocation",50,act_showlocation.mostCurrent.activityBA,act_showlocation.mostCurrent,35);
if (RapidSub.canDelegate("mapfragment1_ready")) { ir.parsikhesab.pakhsh.act_showlocation.remoteMe.runUserSub(false, "act_showlocation","mapfragment1_ready"); return;}
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
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_showlocation parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_showlocation parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_showlocation) ","act_showlocation",50,act_showlocation.mostCurrent.activityBA,act_showlocation.mostCurrent,35);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 36;BA.debugLine="Sleep(100)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_showlocation.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_showlocation", "mapfragment1_ready"),BA.numberCast(int.class, 100));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 37;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(16);
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 BA.debugLineNum = 38;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
Debug.ShouldStop(32);
parent._rp.runVoidMethod ("CheckAndRequest",act_showlocation.processBA,(Object)(parent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 39;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_showlocation.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_showlocation", "mapfragment1_ready"), null);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 40;BA.debugLine="If Result Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 6;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 41;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(256);
parent.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 42;BA.debugLine="myLocation";
Debug.ShouldStop(512);
_mylocation();
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 44;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","583886089",RemoteObject.createImmutable("No permission!"),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _mylocation() throws Exception{
try {
		Debug.PushSubsStack("myLocation (act_showlocation) ","act_showlocation",50,act_showlocation.mostCurrent.activityBA,act_showlocation.mostCurrent,48);
if (RapidSub.canDelegate("mylocation")) { return ir.parsikhesab.pakhsh.act_showlocation.remoteMe.runUserSub(false, "act_showlocation","mylocation");}
RemoteObject _cl = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
 BA.debugLineNum = 48;BA.debugLine="Private Sub myLocation";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(65536);
if (act_showlocation.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 50;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 54;BA.debugLine="If Location.IsInitialized Then";
Debug.ShouldStop(2097152);
if (act_showlocation._location.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 55;BA.debugLine="gmap.AddMarker(Location.Latitude,Location.Long";
Debug.ShouldStop(4194304);
act_showlocation.mostCurrent._gmap.runVoidMethod ("AddMarker",(Object)(act_showlocation._location.runMethod(true,"getLatitude")),(Object)(act_showlocation._location.runMethod(true,"getLongitude")),(Object)(act_showlocation._name));
 BA.debugLineNum = 57;BA.debugLine="Dim cl As CameraPosition";
Debug.ShouldStop(16777216);
_cl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cl", _cl);
 BA.debugLineNum = 58;BA.debugLine="cl.Initialize(Location.Latitude,Location.Longi";
Debug.ShouldStop(33554432);
_cl.runVoidMethod ("Initialize",(Object)(act_showlocation._location.runMethod(true,"getLatitude")),(Object)(act_showlocation._location.runMethod(true,"getLongitude")),(Object)(BA.numberCast(float.class, 15)));
 BA.debugLineNum = 59;BA.debugLine="gmap.AnimateCamera(cl)";
Debug.ShouldStop(67108864);
act_showlocation.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cl.getObject())));
 };
 BA.debugLineNum = 61;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
act_showlocation.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_showlocation.processBA, e11.toString()); BA.debugLineNum = 63;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
act_showlocation.mostCurrent.__c.runVoidMethod ("LogImpl","583951631",BA.ObjectToString(act_showlocation.mostCurrent.__c.runMethod(false,"LastException",act_showlocation.mostCurrent.activityBA)),0);
 };
 };
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
 //BA.debugLineNum = 7;BA.debugLine="Private rp As RuntimePermissions";
act_showlocation._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 8;BA.debugLine="Dim Location As Location";
act_showlocation._location = RemoteObject.createNew ("anywheresoftware.b4a.gps.LocationWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Dim Name As String";
act_showlocation._name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}