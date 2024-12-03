package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_rizhavale_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"l_RizeHavale\")";
Debug.ShouldStop(-2147483648);
act_rizhavale.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_RizeHavale")),act_rizhavale.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="Fused.Initialize(\"FusedLocation\")";
Debug.ShouldStop(1);
act_rizhavale.mostCurrent._fused.runVoidMethod ("Initialize",act_rizhavale.processBA,(Object)(RemoteObject.createImmutable("FusedLocation")));
 BA.debugLineNum = 34;BA.debugLine="Gps.Initialize(\"Gps\")";
Debug.ShouldStop(2);
act_rizhavale._gps.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Gps")));
 BA.debugLineNum = 35;BA.debugLine="t1.Initialize(\"t1\",1000)";
Debug.ShouldStop(4);
act_rizhavale._t1.runVoidMethod ("Initialize",act_rizhavale.processBA,(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 36;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(8);
act_rizhavale.mostCurrent._hlv.runMethod(false,"Initializer",act_rizhavale.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 37;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
Debug.ShouldStop(16);
act_rizhavale.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_rizhavale.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_rizhavale.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_rizhavale.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 38;BA.debugLine="ListFaktor.Initialize";
Debug.ShouldStop(32);
act_rizhavale.mostCurrent._listfaktor.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="HLV.Ripple.Color(0xFF909090)";
Debug.ShouldStop(128);
act_rizhavale.mostCurrent._hlv.runMethod(false,"Ripple").runVoidMethod ("Color",(Object)(BA.numberCast(int.class, ((int)0xff909090))));
 BA.debugLineNum = 42;BA.debugLine="HLV.Show";
Debug.ShouldStop(512);
act_rizhavale.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizhavale.processBA, e12.toString()); BA.debugLineNum = 45;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
act_rizhavale.mostCurrent.__c.runVoidMethod ("LogImpl","569926928",BA.ObjectToString(act_rizhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA)),0);
 BA.debugLineNum = 46;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8192);
act_rizhavale.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_rizhavale.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_rizhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_rizhavale.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Pause (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,232);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 232;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 234;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,215);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","activity_resume");}
 BA.debugLineNum = 215;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="If SwLocation.Checked Then";
Debug.ShouldStop(8388608);
if (act_rizhavale.mostCurrent._swlocation.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 217;BA.debugLine="SaveGps";
Debug.ShouldStop(16777216);
_savegps();
 }else {
 BA.debugLineNum = 219;BA.debugLine="Create";
Debug.ShouldStop(67108864);
_create();
 };
 BA.debugLineNum = 224;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(-2147483648);
act_rizhavale.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Application_Error (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,268);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 268;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(2048);
 BA.debugLineNum = 270;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) return act_rizhavale.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlistprofile_click() throws Exception{
try {
		Debug.PushSubsStack("BtnListProfile_Click (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,227);
if (RapidSub.canDelegate("btnlistprofile_click")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","btnlistprofile_click");}
 BA.debugLineNum = 227;BA.debugLine="Sub BtnListProfile_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _create() throws Exception{
try {
		Debug.PushSubsStack("Create (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,51);
if (RapidSub.canDelegate("create")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","create");}
 BA.debugLineNum = 51;BA.debugLine="Sub Create";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 53;BA.debugLine="ProgressDialogShow(\"در حال بارگذاری اطلاعات . . .";
Debug.ShouldStop(1048576);
act_rizhavale.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_rizhavale.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال بارگذاری اطلاعات . . ."))));
 BA.debugLineNum = 54;BA.debugLine="lblShomareHavale.Text=Item1.fldShomareHavale";
Debug.ShouldStop(2097152);
act_rizhavale.mostCurrent._lblshomarehavale.runMethod(true,"setText",BA.ObjectToCharSequence(act_rizhavale._item1.getField(true,"fldShomareHavale" /*RemoteObject*/ )));
 BA.debugLineNum = 55;BA.debugLine="LblDate.Text=MCode.PersianDateDash(Item1.fldDate)";
Debug.ShouldStop(4194304);
act_rizhavale.mostCurrent._lbldate.runMethod(true,"setText",BA.ObjectToCharSequence(act_rizhavale.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_rizhavale.mostCurrent.activityBA,(Object)(act_rizhavale._item1.getField(true,"fldDate" /*RemoteObject*/ )))));
 BA.debugLineNum = 56;BA.debugLine="LblCountFactor.Text=Item1.fldCountFactor";
Debug.ShouldStop(8388608);
act_rizhavale.mostCurrent._lblcountfactor.runMethod(true,"setText",BA.ObjectToCharSequence(act_rizhavale._item1.getField(true,"fldCountFactor" /*RemoteObject*/ )));
 BA.debugLineNum = 57;BA.debugLine="If Item1.fldMandeFactor>0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_rizhavale._item1.getField(true,"fldMandeFactor" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 58;BA.debugLine="LblSumFactor.Text=MCode.qomaAshar(Item1.fldMande";
Debug.ShouldStop(33554432);
act_rizhavale.mostCurrent._lblsumfactor.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_rizhavale.mostCurrent._mcode.runMethod(true,"_qomaashar" /*RemoteObject*/ ,act_rizhavale.mostCurrent.activityBA,(Object)((act_rizhavale._item1.getField(true,"fldMandeFactor" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),act_rizhavale.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 60;BA.debugLine="LblSumFactor.Text=0";
Debug.ShouldStop(134217728);
act_rizhavale.mostCurrent._lblsumfactor.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 62;BA.debugLine="LblLat.Text=MCode.Lat";
Debug.ShouldStop(536870912);
act_rizhavale.mostCurrent._lbllat.runMethod(true,"setText",BA.ObjectToCharSequence(act_rizhavale.mostCurrent._mcode._lat /*RemoteObject*/ ));
 BA.debugLineNum = 63;BA.debugLine="LoadData";
Debug.ShouldStop(1073741824);
_loaddata();
 BA.debugLineNum = 64;BA.debugLine="LblLon.Text=MCode.Lon";
Debug.ShouldStop(-2147483648);
act_rizhavale.mostCurrent._lbllon.runMethod(true,"setText",BA.ObjectToCharSequence(act_rizhavale.mostCurrent._mcode._lon /*RemoteObject*/ ));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizhavale.processBA, e15.toString()); BA.debugLineNum = 66;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
act_rizhavale.mostCurrent.__c.runVoidMethod ("LogImpl","569992463",BA.ObjectToString(act_rizhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA)),0);
 BA.debugLineNum = 67;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4);
act_rizhavale.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_rizhavale.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_rizhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_rizhavale.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Create"))));
 };
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
public static void  _getlocation() throws Exception{
try {
		Debug.PushSubsStack("GetLocation (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,89);
if (RapidSub.canDelegate("getlocation")) { ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","getlocation"); return;}
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
public ResumableSub_GetLocation(ir.parsikhesab.pakhsh.act_rizhavale parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_rizhavale parent;
RemoteObject _available = RemoteObject.createImmutable(false);
RemoteObject _result = RemoteObject.declareNull("igolub.fused.b4a.location.LocationResultWrapper");
RemoteObject _lastlocation = RemoteObject.declareNull("igolub.fused.b4a.location.android.location.LocationFWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetLocation (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,89);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 90;BA.debugLine="If Fused.IsLocationEnabledInSettings Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 91;BA.debugLine="Fused.GetLocationAvailability";
Debug.ShouldStop(67108864);
parent.mostCurrent._fused.runVoidMethod ("GetLocationAvailability");
 BA.debugLineNum = 93;BA.debugLine="Wait For FusedLocation_LocationAvailabilityReque";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","fusedlocation_locationavailabilityrequestcompleted", act_rizhavale.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizhavale", "getlocation"), null);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_available = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Available", _available);
;
 BA.debugLineNum = 94;BA.debugLine="Log(\"LocationAvailable=\" & Available)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","570123525",RemoteObject.concat(RemoteObject.createImmutable("LocationAvailable="),_available),0);
 BA.debugLineNum = 95;BA.debugLine="If Available Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 96;BA.debugLine="Fused.GetLastLocation";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._fused.runVoidMethod ("GetLastLocation");
 BA.debugLineNum = 97;BA.debugLine="Wait For FusedLocation_LocationRequestCompleted";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","fusedlocation_locationrequestcompleted", act_rizhavale.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizhavale", "getlocation"), null);
this.state = 22;
return;
case 22:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 98;BA.debugLine="If Result.Status=LocationResult.STATUS_SUCCESSF";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 99;BA.debugLine="If Result.Location.IsInitialized Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 100;BA.debugLine="Dim LastLocation As LocationF = Result.Locati";
Debug.ShouldStop(8);
_lastlocation = RemoteObject.createNew ("igolub.fused.b4a.location.android.location.LocationFWrapper");
_lastlocation = _result.runMethod(false,"getLocation");Debug.locals.put("LastLocation", _lastlocation);Debug.locals.put("LastLocation", _lastlocation);
 BA.debugLineNum = 101;BA.debugLine="Log(\"LastLocation Latitude = \" & LastLocation";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","570123532",RemoteObject.concat(RemoteObject.createImmutable("LastLocation Latitude = "),_lastlocation.runMethod(true,"getLatitude")),0);
 BA.debugLineNum = 102;BA.debugLine="Log(\"LastLocation Longitude = \" & LastLocatio";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","570123533",RemoteObject.concat(RemoteObject.createImmutable("LastLocation Longitude = "),_lastlocation.runMethod(true,"getLongitude")),0);
 BA.debugLineNum = 104;BA.debugLine="MCode.Lat = LastLocation.Latitude";
Debug.ShouldStop(128);
parent.mostCurrent._mcode._lat /*RemoteObject*/  = BA.NumberToString(_lastlocation.runMethod(true,"getLatitude"));
 BA.debugLineNum = 105;BA.debugLine="MCode.Lon = LastLocation.Longitude";
Debug.ShouldStop(256);
parent.mostCurrent._mcode._lon /*RemoteObject*/  = BA.NumberToString(_lastlocation.runMethod(true,"getLongitude"));
 BA.debugLineNum = 106;BA.debugLine="Create";
Debug.ShouldStop(512);
_create();
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 108;BA.debugLine="Log(\"Unknown last location\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","570123539",RemoteObject.createImmutable("Unknown last location"),0);
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
 BA.debugLineNum = 113;BA.debugLine="MsgboxAsync(\"Location is turned off in devices's";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Location is turned off in devices's settings. Turn it on.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),act_rizhavale.processBA);
 BA.debugLineNum = 114;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizhavale.processBA,(Object)((parent.mostCurrent._fused.runMethod(false,"getLocationSettingsIntent").getObject())));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 116;BA.debugLine="End Sub";
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
public static void  _fusedlocation_locationavailabilityrequestcompleted(RemoteObject _available) throws Exception{
}
public static void  _fusedlocation_locationrequestcompleted(RemoteObject _result) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private rp As RuntimePermissions";
act_rizhavale.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 14;BA.debugLine="Private LblSumFactor As Label";
act_rizhavale.mostCurrent._lblsumfactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private LblCountFactor As Label";
act_rizhavale.mostCurrent._lblcountfactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private LblDate As Label";
act_rizhavale.mostCurrent._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim HLV As Hitex_LayoutView";
act_rizhavale.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 18;BA.debugLine="Private pnl_HLV As Panel";
act_rizhavale.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ListFaktor As List";
act_rizhavale.mostCurrent._listfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 20;BA.debugLine="Private lblShomareHavale As Label";
act_rizhavale.mostCurrent._lblshomarehavale = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private MapFragment1 As MapFragment";
act_rizhavale.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private gmap As GoogleMap";
act_rizhavale.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LblLat As Label";
act_rizhavale.mostCurrent._lbllat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LblLon As Label";
act_rizhavale.mostCurrent._lbllon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private SwLocation As ACSwitch";
act_rizhavale.mostCurrent._swlocation = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Fused As FusedLocationProviderClient";
act_rizhavale.mostCurrent._fused = RemoteObject.createNew ("igolub.fused.b4a.location.FusedLocationProviderClientWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,190);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","hlv_getitemcount");}
 BA.debugLineNum = 190;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="Return ListFaktor.Size";
Debug.ShouldStop(1073741824);
if (true) return act_rizhavale.mostCurrent._listfaktor.runMethod(true,"getSize");
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_itemclick(RemoteObject _clickeditem,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_ItemClick (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,210);
if (RapidSub.canDelegate("hlv_itemclick")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","hlv_itemclick", _clickeditem, _position);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rizhavale");
Debug.locals.put("ClickedItem", _clickeditem);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 210;BA.debugLine="Sub HLV_ItemClick (ClickedItem As Panel, Position";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Dim rec As Cls_RizHavale=ClickedItem.Tag";
Debug.ShouldStop(262144);
_rec = (_clickeditem.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 212;BA.debugLine="rec.lblShowHavale_Click";
Debug.ShouldStop(524288);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizhavale.class, "_lblshowhavale_click" /*RemoteObject*/ );
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_onBindViewHolder (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,201);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterizhavale");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rizhavale");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 201;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(256);
 BA.debugLineNum = 203;BA.debugLine="Dim Item = ListFaktor.Get(Position) As AdapteRizH";
Debug.ShouldStop(1024);
_item = (act_rizhavale.mostCurrent._listfaktor.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 204;BA.debugLine="Dim rec As Cls_RizHavale=Parent.Tag";
Debug.ShouldStop(2048);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 205;BA.debugLine="rec.shomareHavale=lblShomareHavale.Text";
Debug.ShouldStop(4096);
_rec.setField ("_shomarehavale" /*RemoteObject*/ ,act_rizhavale.mostCurrent._lblshomarehavale.runMethod(true,"getText"));
 BA.debugLineNum = 206;BA.debugLine="rec.Show(Item,Position)";
Debug.ShouldStop(8192);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizhavale.class, "_show" /*RemoteObject*/ ,(Object)(_item),(Object)(_position));
 BA.debugLineNum = 207;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(16384);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizhavale.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,194);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rizhavale");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 194;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Dim rec As Cls_RizHavale";
Debug.ShouldStop(4);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_rizhavale");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 196;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(8);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizhavale.class, "_initialize" /*RemoteObject*/ ,act_rizhavale.mostCurrent.activityBA,(Object)(act_rizhavale.getObject()));
 BA.debugLineNum = 197;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(16);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizhavale.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_rizhavale.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_rizhavale.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizhavale.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 198;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(32);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("LblBack_Click (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,236);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","lblback_click");}
 BA.debugLineNum = 236;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
act_rizhavale.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddata() throws Exception{
try {
		Debug.PushSubsStack("LoadData (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,142);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","loaddata");}
RemoteObject _cr = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterizhavale");
 BA.debugLineNum = 142;BA.debugLine="Sub LoadData";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 144;BA.debugLine="ListFaktor.Clear";
Debug.ShouldStop(32768);
act_rizhavale.mostCurrent._listfaktor.runVoidMethod ("Clear");
 BA.debugLineNum = 145;BA.debugLine="Dim cr As Cursor=MCode.Result(\"select fldShomareF";
Debug.ShouldStop(65536);
_cr = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cr = act_rizhavale.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizhavale.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select fldShomareFactor,Sum(fldMablaghKhales) as fldMablaghKhales,fldDate,fldCodeTafzili,fldSharhTafzili,fldLat,fldLon,fldTell,fldAddress,fldVaziat from TblRizFactorHavale where fldShomareHavale="),act_rizhavale.mostCurrent._lblshomarehavale.runMethod(true,"getText"),RemoteObject.createImmutable(" GROUP BY fldShomareFactor"))));Debug.locals.put("cr", _cr);Debug.locals.put("cr", _cr);
 BA.debugLineNum = 146;BA.debugLine="If cr.RowCount>0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_cr.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 149;BA.debugLine="For i=0 To cr.RowCount-1";
Debug.ShouldStop(1048576);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cr.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 150;BA.debugLine="cr.Position=i";
Debug.ShouldStop(2097152);
_cr.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 151;BA.debugLine="Dim Item As AdapteRizHavale";
Debug.ShouldStop(4194304);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterizhavale");Debug.locals.put("Item", _item);
 BA.debugLineNum = 152;BA.debugLine="Item.fldShomareFactor=cr.GetString(\"fldShomareF";
Debug.ShouldStop(8388608);
_item.setField ("fldShomareFactor" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareFactor"))));
 BA.debugLineNum = 153;BA.debugLine="Item.fldMablaghKhales=cr.GetString(\"fldMablaghK";
Debug.ShouldStop(16777216);
_item.setField ("fldMablaghKhales" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablaghKhales"))));
 BA.debugLineNum = 154;BA.debugLine="Item.fldDate=cr.GetString(\"fldDate\")";
Debug.ShouldStop(33554432);
_item.setField ("fldDate" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDate"))));
 BA.debugLineNum = 155;BA.debugLine="Item.fldCodeTafzili=cr.GetString(\"fldCodeTafzil";
Debug.ShouldStop(67108864);
_item.setField ("fldCodeTafzili" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili"))));
 BA.debugLineNum = 156;BA.debugLine="Item.fldSharhTafzili=cr.GetString(\"fldSharhTafz";
Debug.ShouldStop(134217728);
_item.setField ("fldSharhTafzili" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharhTafzili"))));
 BA.debugLineNum = 157;BA.debugLine="Item.fldLat=cr.GetString(\"fldLat\")";
Debug.ShouldStop(268435456);
_item.setField ("fldLat" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldLat"))));
 BA.debugLineNum = 158;BA.debugLine="Item.fldLon=cr.GetString(\"fldLon\")";
Debug.ShouldStop(536870912);
_item.setField ("fldLon" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldLon"))));
 BA.debugLineNum = 159;BA.debugLine="Item.fldTell=cr.GetString(\"fldTell\")";
Debug.ShouldStop(1073741824);
_item.setField ("fldTell" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell"))));
 BA.debugLineNum = 160;BA.debugLine="Item.fldAddress=cr.GetString(\"fldAddress\")";
Debug.ShouldStop(-2147483648);
_item.setField ("fldAddress" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldAddress"))));
 BA.debugLineNum = 161;BA.debugLine="Item.fldVaziat=cr.GetString(\"fldVaziat\")";
Debug.ShouldStop(1);
_item.setField ("fldVaziat" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldVaziat"))));
 BA.debugLineNum = 162;BA.debugLine="If SwLocation.Checked Then";
Debug.ShouldStop(2);
if (act_rizhavale.mostCurrent._swlocation.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 163;BA.debugLine="If Item.fldLat<>\"\" And Item.fldLon<>\"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_item.getField(true,"fldLat" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_item.getField(true,"fldLon" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 164;BA.debugLine="Item.Distance=MCode.CalculateDistance(MCode.L";
Debug.ShouldStop(8);
_item.setField ("Distance" /*RemoteObject*/ ,BA.NumberToString(act_rizhavale.mostCurrent._mcode.runMethod(true,"_calculatedistance" /*RemoteObject*/ ,act_rizhavale.mostCurrent.activityBA,(Object)(act_rizhavale.mostCurrent._mcode._lat /*RemoteObject*/ ),(Object)(act_rizhavale.mostCurrent._mcode._lon /*RemoteObject*/ ),(Object)(_item.getField(true,"fldLat" /*RemoteObject*/ )),(Object)(_item.getField(true,"fldLon" /*RemoteObject*/ )))));
 }else {
 BA.debugLineNum = 166;BA.debugLine="Item.Distance=0";
Debug.ShouldStop(32);
_item.setField ("Distance" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 }else {
 BA.debugLineNum = 169;BA.debugLine="Item.Distance=0";
Debug.ShouldStop(256);
_item.setField ("Distance" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 BA.debugLineNum = 174;BA.debugLine="ListFaktor.Add(Item)";
Debug.ShouldStop(8192);
act_rizhavale.mostCurrent._listfaktor.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 178;BA.debugLine="If SwLocation.Checked Then";
Debug.ShouldStop(131072);
if (act_rizhavale.mostCurrent._swlocation.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="ListFaktor.SortType(\"Distance\",True)";
Debug.ShouldStop(262144);
act_rizhavale.mostCurrent._listfaktor.runVoidMethod ("SortType",(Object)(BA.ObjectToString("Distance")),(Object)(act_rizhavale.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 181;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(1048576);
act_rizhavale.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 182;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2097152);
act_rizhavale.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizhavale.processBA, e36.toString()); BA.debugLineNum = 185;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
act_rizhavale.mostCurrent.__c.runVoidMethod ("LogImpl","570254635",BA.ObjectToString(act_rizhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA)),0);
 BA.debugLineNum = 186;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(33554432);
act_rizhavale.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_rizhavale.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_rizhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_rizhavale.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadData"))));
 };
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("MapFragment1_Ready (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,240);
if (RapidSub.canDelegate("mapfragment1_ready")) { ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","mapfragment1_ready"); return;}
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
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_rizhavale parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_rizhavale parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,240);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 241;BA.debugLine="Sleep(100)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_rizhavale.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizhavale", "mapfragment1_ready"),BA.numberCast(int.class, 100));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
 BA.debugLineNum = 242;BA.debugLine="Try";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 243;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(262144);
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 BA.debugLineNum = 244;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOC";
Debug.ShouldStop(524288);
parent.mostCurrent._rp.runVoidMethod ("CheckAndRequest",act_rizhavale.processBA,(Object)(parent.mostCurrent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 245;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_rizhavale.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizhavale", "mapfragment1_ready"), null);
this.state = 14;
return;
case 14:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 246;BA.debugLine="If Result Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 247;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(4194304);
parent.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 249;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","570844425",RemoteObject.createImmutable("No permission!"),0);
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
 BA.debugLineNum = 252;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","570844428",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_rizhavale.processBA, e0.toString());}
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
 //BA.debugLineNum = 7;BA.debugLine="Dim Gps As GPS";
act_rizhavale._gps = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 8;BA.debugLine="Dim t1 As Timer";
act_rizhavale._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 9;BA.debugLine="Dim Item1 As AdapteRepHavale";
act_rizhavale._item1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterephavale");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savegps() throws Exception{
try {
		Debug.PushSubsStack("SaveGps (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,72);
if (RapidSub.canDelegate("savegps")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","savegps");}
 BA.debugLineNum = 72;BA.debugLine="Sub SaveGps";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 74;BA.debugLine="If Gps.GPSEnabled=False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",act_rizhavale._gps.runMethod(true,"getGPSEnabled"),act_rizhavale.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 75;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید\"";
Debug.ShouldStop(1024);
act_rizhavale.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید")),(Object)(act_rizhavale.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 76;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(2048);
act_rizhavale._t1.runMethod(true,"setEnabled",act_rizhavale.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 77;BA.debugLine="StartActivity(Gps.LocationSettingsIntent)";
Debug.ShouldStop(4096);
act_rizhavale.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizhavale.processBA,(Object)((act_rizhavale._gps.runMethod(false,"getLocationSettingsIntent"))));
 }else {
 BA.debugLineNum = 80;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(32768);
act_rizhavale._t1.runMethod(true,"setEnabled",act_rizhavale.mostCurrent.__c.getField(true,"True"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizhavale.processBA, e10.toString()); BA.debugLineNum = 84;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
act_rizhavale.mostCurrent.__c.runVoidMethod ("LogImpl","570057996",BA.ObjectToString(act_rizhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA)),0);
 BA.debugLineNum = 85;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1048576);
act_rizhavale.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_rizhavale.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_rizhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_rizhavale.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-SaveGps"))));
 };
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swlocation_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwLocation_CheckedChange (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,256);
if (RapidSub.canDelegate("swlocation_checkedchange")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","swlocation_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 256;BA.debugLine="Private Sub SwLocation_CheckedChange(Checked As Bo";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="If Checked Then";
Debug.ShouldStop(1);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 258;BA.debugLine="SaveGps";
Debug.ShouldStop(2);
_savegps();
 }else {
 BA.debugLineNum = 260;BA.debugLine="Create";
Debug.ShouldStop(8);
_create();
 };
 BA.debugLineNum = 265;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(256);
act_rizhavale.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("t1_tick (act_rizhavale) ","act_rizhavale",39,act_rizhavale.mostCurrent.activityBA,act_rizhavale.mostCurrent,118);
if (RapidSub.canDelegate("t1_tick")) { return ir.parsikhesab.pakhsh.act_rizhavale.remoteMe.runUserSub(false, "act_rizhavale","t1_tick");}
 BA.debugLineNum = 118;BA.debugLine="Sub t1_tick";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 120;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(8388608);
act_rizhavale._t1.runMethod(true,"setEnabled",act_rizhavale.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 122;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 134;BA.debugLine="GetLocation";
Debug.ShouldStop(32);
_getlocation();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizhavale.processBA, e5.toString()); BA.debugLineNum = 137;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
act_rizhavale.mostCurrent.__c.runVoidMethod ("LogImpl","570189075",BA.ObjectToString(act_rizhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA)),0);
 BA.debugLineNum = 138;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(512);
act_rizhavale.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_rizhavale.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_rizhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizhavale.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_rizhavale.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-t1_tick"))));
 };
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}