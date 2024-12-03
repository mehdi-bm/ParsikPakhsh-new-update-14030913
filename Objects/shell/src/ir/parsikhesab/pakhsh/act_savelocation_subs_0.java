package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_savelocation_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_savelocation) ","act_savelocation",44,act_savelocation.mostCurrent.activityBA,act_savelocation.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_savelocation.remoteMe.runUserSub(false, "act_savelocation","activity_create", _firsttime);}
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Location1.Initialize";
Debug.ShouldStop(524288);
act_savelocation.mostCurrent._location1.runVoidMethod ("Initialize");
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"L_SaveLocation\")";
Debug.ShouldStop(1048576);
act_savelocation.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_SaveLocation")),act_savelocation.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="If MapFragment1.IsGooglePlayServicesAvailable = F";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",act_savelocation.mostCurrent._mapfragment1.runMethod(true,"IsGooglePlayServicesAvailable",act_savelocation.mostCurrent.activityBA),act_savelocation.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 23;BA.debugLine="ToastMessageShow(\"Please install Google Play Ser";
Debug.ShouldStop(4194304);
act_savelocation.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please install Google Play Services.")),(Object)(act_savelocation.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 24;BA.debugLine="Dim result As Int";
Debug.ShouldStop(8388608);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 25;BA.debugLine="result = Msgbox2(\"لطفا سرویس های گوگل را نصب و ف";
Debug.ShouldStop(16777216);
_result = act_savelocation.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("لطفا سرویس های گوگل را نصب و فعال نمایید")),(Object)(BA.ObjectToCharSequence("Google Play Services")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("انصراف")),(Object)((act_savelocation.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_savelocation.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Google-Play-icon.png"))).getObject())),act_savelocation.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 27;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
act_savelocation.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 29;BA.debugLine="t1.Initialize(\"t1\",1000)";
Debug.ShouldStop(268435456);
act_savelocation._t1.runVoidMethod ("Initialize",act_savelocation.processBA,(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 30;BA.debugLine="t1.Enabled = True";
Debug.ShouldStop(536870912);
act_savelocation._t1.runMethod(true,"setEnabled",act_savelocation.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 31;BA.debugLine="ProgressDialogShow2(\"چند لحظه صبر کنید درحال دری";
Debug.ShouldStop(1073741824);
act_savelocation.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_savelocation.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("چند لحظه صبر کنید درحال دریافت موقعیت")),(Object)(act_savelocation.mostCurrent.__c.getField(true,"False")));
 };
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_savelocation) ","act_savelocation",44,act_savelocation.mostCurrent.activityBA,act_savelocation.mostCurrent,41);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_savelocation.remoteMe.runUserSub(false, "act_savelocation","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (act_savelocation) ","act_savelocation",44,act_savelocation.mostCurrent.activityBA,act_savelocation.mostCurrent,37);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_savelocation.remoteMe.runUserSub(false, "act_savelocation","activity_resume");}
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
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
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_savelocation) ","act_savelocation",44,act_savelocation.mostCurrent.activityBA,act_savelocation.mostCurrent,116);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_savelocation.remoteMe.runUserSub(false, "act_savelocation","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 116;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(524288);
 BA.debugLineNum = 118;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return act_savelocation.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("btn_Back_Click (act_savelocation) ","act_savelocation",44,act_savelocation.mostCurrent.activityBA,act_savelocation.mostCurrent,113);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_savelocation.remoteMe.runUserSub(false, "act_savelocation","btn_back_click");}
 BA.debugLineNum = 113;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
act_savelocation.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("BtnSave_Click (act_savelocation) ","act_savelocation",44,act_savelocation.mostCurrent.activityBA,act_savelocation.mostCurrent,85);
if (RapidSub.canDelegate("btnsave_click")) { return ir.parsikhesab.pakhsh.act_savelocation.remoteMe.runUserSub(false, "act_savelocation","btnsave_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 85;BA.debugLine="Sub BtnSave_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 87;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",act_savelocation.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_savelocation.mostCurrent.activityBA),act_savelocation.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",act_savelocation.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 88;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
Debug.ShouldStop(8388608);
act_savelocation.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(act_savelocation.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 89;BA.debugLine="Return";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 91;BA.debugLine="If Lat<>0 And Lon <>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",act_savelocation.mostCurrent._lat,BA.NumberToString(0)) && RemoteObject.solveBoolean("!",act_savelocation.mostCurrent._lon,BA.NumberToString(0))) { 
 BA.debugLineNum = 92;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from";
Debug.ShouldStop(134217728);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_savelocation.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_savelocation.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"),act_savelocation.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 93;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 94;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh S";
Debug.ShouldStop(536870912);
act_savelocation.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_savelocation.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblLogVisitSefaresh Set FldLat = '"),act_savelocation.mostCurrent._lat,RemoteObject.createImmutable("' , FldLon = '"),act_savelocation.mostCurrent._lon,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_savelocation.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 96;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefar";
Debug.ShouldStop(-2147483648);
act_savelocation.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_savelocation.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"),act_savelocation.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','','','','"),act_savelocation.mostCurrent._lat,RemoteObject.createImmutable("','"),act_savelocation.mostCurrent._lon,RemoteObject.createImmutable("')"))));
 };
 BA.debugLineNum = 98;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldLat";
Debug.ShouldStop(2);
act_savelocation.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_savelocation.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set FldLat = '"),act_savelocation.mostCurrent._lat,RemoteObject.createImmutable("', FldLon = '"),act_savelocation.mostCurrent._lon,RemoteObject.createImmutable("' Where fldCodetafzili = '"),act_savelocation.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 99;BA.debugLine="CallSubDelayed3(Service_Server,\"SaveLocationMos";
Debug.ShouldStop(4);
act_savelocation.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",act_savelocation.processBA,(Object)((act_savelocation.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("SaveLocationMoshtari")),(Object)((act_savelocation.mostCurrent._lat)),(Object)((act_savelocation.mostCurrent._lon)));
 BA.debugLineNum = 101;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
act_savelocation.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 102;BA.debugLine="ToastMessageShow(\"موقعیت با موفقیت ثبت گردید\",T";
Debug.ShouldStop(32);
act_savelocation.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("موقعیت با موفقیت ثبت گردید")),(Object)(act_savelocation.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 103;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
act_savelocation.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 105;BA.debugLine="ToastMessageShow(\"لطفا نقطه مورد نظر را انتخاب";
Debug.ShouldStop(256);
act_savelocation.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا نقطه مورد نظر را انتخاب کنید")),(Object)(act_savelocation.mostCurrent.__c.getField(true,"False")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_savelocation.processBA, e22.toString()); BA.debugLineNum = 108;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
act_savelocation.mostCurrent.__c.runVoidMethod ("LogImpl","578446615",BA.ObjectToString(act_savelocation.mostCurrent.__c.runMethod(false,"LastException",act_savelocation.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
 //BA.debugLineNum = 12;BA.debugLine="Private Location1 As Location";
act_savelocation.mostCurrent._location1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.LocationWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private gmap As GoogleMap";
act_savelocation.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private MapFragment1 As MapFragment";
act_savelocation.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI";
act_savelocation.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 16;BA.debugLine="Dim Lat,Lon As String=0";
act_savelocation.mostCurrent._lat = RemoteObject.createImmutable("");
act_savelocation.mostCurrent._lon = BA.NumberToString(0);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _mapfragment1_longclick(RemoteObject _point) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_LongClick (act_savelocation) ","act_savelocation",44,act_savelocation.mostCurrent.activityBA,act_savelocation.mostCurrent,77);
if (RapidSub.canDelegate("mapfragment1_longclick")) { return ir.parsikhesab.pakhsh.act_savelocation.remoteMe.runUserSub(false, "act_savelocation","mapfragment1_longclick", _point);}
Debug.locals.put("Point", _point);
 BA.debugLineNum = 77;BA.debugLine="Sub MapFragment1_LongClick (Point As LatLng)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="gmap.Clear()";
Debug.ShouldStop(8192);
act_savelocation.mostCurrent._gmap.runVoidMethod ("Clear");
 BA.debugLineNum = 79;BA.debugLine="gmap.AddMarker(Point.Latitude, Point.Longitude, M";
Debug.ShouldStop(16384);
act_savelocation.mostCurrent._gmap.runVoidMethod ("AddMarker",(Object)(_point.runMethod(true,"getLatitude")),(Object)(_point.runMethod(true,"getLongitude")),(Object)(act_savelocation.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 80;BA.debugLine="Lat=Point.Latitude";
Debug.ShouldStop(32768);
act_savelocation.mostCurrent._lat = BA.NumberToString(_point.runMethod(true,"getLatitude"));
 BA.debugLineNum = 81;BA.debugLine="Lon=Point.Longitude";
Debug.ShouldStop(65536);
act_savelocation.mostCurrent._lon = BA.NumberToString(_point.runMethod(true,"getLongitude"));
 BA.debugLineNum = 82;BA.debugLine="Log(\"Lat= \"&Lat &\" Lon= \"&Lon)";
Debug.ShouldStop(131072);
act_savelocation.mostCurrent.__c.runVoidMethod ("LogImpl","578381061",RemoteObject.concat(RemoteObject.createImmutable("Lat= "),act_savelocation.mostCurrent._lat,RemoteObject.createImmutable(" Lon= "),act_savelocation.mostCurrent._lon),0);
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("MapFragment1_Ready (act_savelocation) ","act_savelocation",44,act_savelocation.mostCurrent.activityBA,act_savelocation.mostCurrent,45);
if (RapidSub.canDelegate("mapfragment1_ready")) { ir.parsikhesab.pakhsh.act_savelocation.remoteMe.runUserSub(false, "act_savelocation","mapfragment1_ready"); return;}
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
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_savelocation parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_savelocation parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_savelocation) ","act_savelocation",44,act_savelocation.mostCurrent.activityBA,act_savelocation.mostCurrent,45);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 46;BA.debugLine="Sleep(100)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_savelocation.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_savelocation", "mapfragment1_ready"),BA.numberCast(int.class, 100));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 47;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(16384);
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 BA.debugLineNum = 48;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
Debug.ShouldStop(32768);
parent._rp.runVoidMethod ("CheckAndRequest",act_savelocation.processBA,(Object)(parent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 49;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_savelocation.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_savelocation", "mapfragment1_ready"), null);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 50;BA.debugLine="If Result Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 51;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(262144);
parent.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 54;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","578249993",RemoteObject.createImmutable("No permission!"),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 56;BA.debugLine="End Sub";
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private rp As RuntimePermissions";
act_savelocation._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 8;BA.debugLine="Private t1 As Timer";
act_savelocation._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _t1_tick() throws Exception{
try {
		Debug.PushSubsStack("t1_tick (act_savelocation) ","act_savelocation",44,act_savelocation.mostCurrent.activityBA,act_savelocation.mostCurrent,58);
if (RapidSub.canDelegate("t1_tick")) { return ir.parsikhesab.pakhsh.act_savelocation.remoteMe.runUserSub(false, "act_savelocation","t1_tick");}
RemoteObject _cl = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
 BA.debugLineNum = 58;BA.debugLine="Sub t1_tick";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(134217728);
if (act_savelocation.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 61;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 62;BA.debugLine="Location1.Latitude  = gmap.MyLocation.Latitude";
Debug.ShouldStop(536870912);
act_savelocation.mostCurrent._location1.runMethod(true,"setLatitude",act_savelocation.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLatitude"));
 BA.debugLineNum = 63;BA.debugLine="Location1.Longitude = gmap.MyLocation.Longitude";
Debug.ShouldStop(1073741824);
act_savelocation.mostCurrent._location1.runMethod(true,"setLongitude",act_savelocation.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLongitude"));
 BA.debugLineNum = 65;BA.debugLine="Dim cl As CameraPosition";
Debug.ShouldStop(1);
_cl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cl", _cl);
 BA.debugLineNum = 66;BA.debugLine="cl.Initialize(gmap.MyLocation.Latitude,gmap.MyL";
Debug.ShouldStop(2);
_cl.runVoidMethod ("Initialize",(Object)(act_savelocation.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLatitude")),(Object)(act_savelocation.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLongitude")),(Object)(BA.numberCast(float.class, 15)));
 BA.debugLineNum = 67;BA.debugLine="gmap.AnimateCamera(cl)";
Debug.ShouldStop(4);
act_savelocation.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cl.getObject())));
 BA.debugLineNum = 68;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(8);
act_savelocation._t1.runMethod(true,"setEnabled",act_savelocation.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 69;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
act_savelocation.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_savelocation.processBA, e11.toString()); BA.debugLineNum = 71;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
act_savelocation.mostCurrent.__c.runVoidMethod ("LogImpl","578315533",BA.ObjectToString(act_savelocation.mostCurrent.__c.runMethod(false,"LastException",act_savelocation.mostCurrent.activityBA)),0);
 };
 }else {
 BA.debugLineNum = 74;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(512);
act_savelocation._t1.runMethod(true,"setEnabled",act_savelocation.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}