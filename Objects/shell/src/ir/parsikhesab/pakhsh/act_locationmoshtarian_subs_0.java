package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_locationmoshtarian_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,36);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"l_moshtarianlocation\")";
Debug.ShouldStop(16);
act_locationmoshtarian.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_moshtarianlocation")),act_locationmoshtarian.mostCurrent.activityBA);
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,353);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 353;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 354;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_locationmoshtarian.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 355;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
act_locationmoshtarian.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 357;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return act_locationmoshtarian.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 359;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return act_locationmoshtarian.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Pause (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,349);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 349;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Resume (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,344);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","activity_resume");}
 BA.debugLineNum = 344;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="LoadMap";
Debug.ShouldStop(16777216);
_loadmap();
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Application_Error (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,363);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 363;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(1024);
 BA.debugLineNum = 365;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) return act_locationmoshtarian.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("btn_Back_Click (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,340);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","btn_back_click");}
 BA.debugLineNum = 340;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
act_locationmoshtarian.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnforward_click() throws Exception{
try {
		Debug.PushSubsStack("btnForward_Click (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,437);
if (RapidSub.canDelegate("btnforward_click")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","btnforward_click");}
 BA.debugLineNum = 437;BA.debugLine="Private Sub btnForward_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 438;BA.debugLine="If n=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",act_locationmoshtarian.mostCurrent._n,BA.NumberToString(0))) { 
 BA.debugLineNum = 440;BA.debugLine="SelectData";
Debug.ShouldStop(8388608);
_selectdata();
 BA.debugLineNum = 441;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 443;BA.debugLine="n=n-1";
Debug.ShouldStop(67108864);
act_locationmoshtarian.mostCurrent._n = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_locationmoshtarian.mostCurrent._n),RemoteObject.createImmutable(1)}, "-",1, 0));
 BA.debugLineNum = 444;BA.debugLine="SelectData";
Debug.ShouldStop(134217728);
_selectdata();
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnext_click() throws Exception{
try {
		Debug.PushSubsStack("btnNext_Click (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,428);
if (RapidSub.canDelegate("btnnext_click")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","btnnext_click");}
 BA.debugLineNum = 428;BA.debugLine="Private Sub btnNext_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 429;BA.debugLine="If n=LstLocation.Size-1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",act_locationmoshtarian.mostCurrent._n,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_locationmoshtarian._lstlocation.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 430;BA.debugLine="SelectData";
Debug.ShouldStop(8192);
_selectdata();
 BA.debugLineNum = 431;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 433;BA.debugLine="n=n+1";
Debug.ShouldStop(65536);
act_locationmoshtarian.mostCurrent._n = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_locationmoshtarian.mostCurrent._n),RemoteObject.createImmutable(1)}, "+",1, 0));
 BA.debugLineNum = 434;BA.debugLine="SelectData";
Debug.ShouldStop(131072);
_selectdata();
 BA.debugLineNum = 435;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnvisit_click() throws Exception{
try {
		Debug.PushSubsStack("btnVisit_Click (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,417);
if (RapidSub.canDelegate("btnvisit_click")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","btnvisit_click");}
 BA.debugLineNum = 417;BA.debugLine="Private Sub btnVisit_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="If MCode.TourVisitSW Then";
Debug.ShouldStop(2);
if (act_locationmoshtarian.mostCurrent._mcode._tourvisitsw /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 419;BA.debugLine="If Cu.GetString(\"fldVaziat\")=\"1\" Or Cu.GetString";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldVaziat"))),BA.ObjectToString("1")) || RemoteObject.solveBoolean("=",act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldVaziat"))),BA.ObjectToString("2"))) { 
 BA.debugLineNum = 420;BA.debugLine="GoToVisit2";
Debug.ShouldStop(8);
_gotovisit2();
 };
 }else {
 BA.debugLineNum = 424;BA.debugLine="GoToVisit(itemSelect)";
Debug.ShouldStop(128);
_gotovisit(act_locationmoshtarian.mostCurrent._itemselect);
 };
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlocation() throws Exception{
try {
		Debug.PushSubsStack("GetLocation (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,78);
if (RapidSub.canDelegate("getlocation")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","getlocation");}
int _i = 0;
RemoteObject _llpoint = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");
RemoteObject _color = RemoteObject.createImmutable(0f);
RemoteObject _vaziat = RemoteObject.createImmutable("");
RemoteObject _first = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");
RemoteObject _cl = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
RemoteObject _pl = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.PolylineWrapper");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");
 BA.debugLineNum = 78;BA.debugLine="Private Sub GetLocation";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(16384);
if (act_locationmoshtarian.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 80;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 81;BA.debugLine="points.Initialize";
Debug.ShouldStop(65536);
act_locationmoshtarian.mostCurrent._points.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="gmap.Clear";
Debug.ShouldStop(131072);
act_locationmoshtarian.mostCurrent._gmap.runVoidMethod ("Clear");
 BA.debugLineNum = 83;BA.debugLine="points.Clear";
Debug.ShouldStop(262144);
act_locationmoshtarian.mostCurrent._points.runVoidMethod ("Clear");
 BA.debugLineNum = 84;BA.debugLine="If MCode.TourVisitSW Then";
Debug.ShouldStop(524288);
if (act_locationmoshtarian.mostCurrent._mcode._tourvisitsw /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 86;BA.debugLine="Cu = MCode.Result($\"SELECT tblTourVisitor.fldR";
Debug.ShouldStop(2097152);
act_locationmoshtarian.mostCurrent._cu = act_locationmoshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT tblTourVisitor.fldRadif,tblTourVisitor.fldCodeSuperVisor,tblTourVisitor.fldCodeVisitor,tblTourVisitor.fldCodeGroup,tblTourVisitor.fldCodeTafzili,TblAshkhas.fldSharheTafzili,tblTourVisitor.fldDate,tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit,tblTourVisitor.fldDateNextVisit,tblTourVisitor.fldDateTozie,tblTourVisitor.fldShomareSefaresh,tblTourVisitor.fldSharh,tblTourVisitor.fldVaziat,tblTourVisitor.fldShomareFactor,TblAshkhas.FldLat,TblAshkhas.FldLon,TblAshkhas.fldTell,TblAshkhas.fldAdress,TblAshkhas.fldMande,TblAshkhas.fldSaghfeEtebar,TblAshkhas.fldBlackList  FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND fldDateVisit = "),act_locationmoshtarian.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA)))),RemoteObject.createImmutable(" and fldType='Tour' ORDER BY tblTourVisitor.fldRadif ASC")))));
 BA.debugLineNum = 88;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",act_locationmoshtarian.mostCurrent._cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 89;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {act_locationmoshtarian.mostCurrent._cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 90;BA.debugLine="Dim llPoint As LatLng";
Debug.ShouldStop(33554432);
_llpoint = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");Debug.locals.put("llPoint", _llpoint);
 BA.debugLineNum = 91;BA.debugLine="Dim color As Float";
Debug.ShouldStop(67108864);
_color = RemoteObject.createImmutable(0f);Debug.locals.put("color", _color);
 BA.debugLineNum = 92;BA.debugLine="Dim vaziat As String";
Debug.ShouldStop(134217728);
_vaziat = RemoteObject.createImmutable("");Debug.locals.put("vaziat", _vaziat);
 BA.debugLineNum = 93;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(268435456);
act_locationmoshtarian.mostCurrent._cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 94;BA.debugLine="If Cu.GetString(\"fldVaziat\")=\"1\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldVaziat"))),BA.ObjectToString("1"))) { 
 BA.debugLineNum = 95;BA.debugLine="color=gmap.HUE_RED";
Debug.ShouldStop(1073741824);
_color = act_locationmoshtarian.mostCurrent._gmap.getField(true,"HUE_RED");Debug.locals.put("color", _color);
 BA.debugLineNum = 96;BA.debugLine="vaziat=\"ویزیت نشده\"";
Debug.ShouldStop(-2147483648);
_vaziat = BA.ObjectToString("ویزیت نشده");Debug.locals.put("vaziat", _vaziat);
 }else 
{ BA.debugLineNum = 97;BA.debugLine="Else if Cu.GetString(\"fldVaziat\")=\"2\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldVaziat"))),BA.ObjectToString("2"))) { 
 BA.debugLineNum = 98;BA.debugLine="color=gmap.HUE_BLUE";
Debug.ShouldStop(2);
_color = act_locationmoshtarian.mostCurrent._gmap.getField(true,"HUE_BLUE");Debug.locals.put("color", _color);
 BA.debugLineNum = 99;BA.debugLine="vaziat=\"ویزیت شده\"";
Debug.ShouldStop(4);
_vaziat = BA.ObjectToString("ویزیت شده");Debug.locals.put("vaziat", _vaziat);
 }else 
{ BA.debugLineNum = 100;BA.debugLine="Else if Cu.GetString(\"fldVaziat\")=\"3\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldVaziat"))),BA.ObjectToString("3"))) { 
 BA.debugLineNum = 101;BA.debugLine="color=gmap.HUE_GREEN";
Debug.ShouldStop(16);
_color = act_locationmoshtarian.mostCurrent._gmap.getField(true,"HUE_GREEN");Debug.locals.put("color", _color);
 BA.debugLineNum = 102;BA.debugLine="vaziat=\"سفارش گرفته\"";
Debug.ShouldStop(32);
_vaziat = BA.ObjectToString("سفارش گرفته");Debug.locals.put("vaziat", _vaziat);
 }else {
 BA.debugLineNum = 104;BA.debugLine="color=gmap.HUE_RED";
Debug.ShouldStop(128);
_color = act_locationmoshtarian.mostCurrent._gmap.getField(true,"HUE_RED");Debug.locals.put("color", _color);
 BA.debugLineNum = 105;BA.debugLine="vaziat=\"ویزیت نشده\"";
Debug.ShouldStop(256);
_vaziat = BA.ObjectToString("ویزیت نشده");Debug.locals.put("vaziat", _vaziat);
 }}}
;
 BA.debugLineNum = 107;BA.debugLine="gmap.AddMarker2(Cu.GetString(\"FldLat\"),Cu.Ge";
Debug.ShouldStop(1024);
act_locationmoshtarian.mostCurrent._gmap.runMethod(false,"AddMarker2",(Object)(BA.numberCast(double.class, act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLat"))))),(Object)(BA.numberCast(double.class, act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLon"))))),(Object)(RemoteObject.concat(act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldRadif"))),RemoteObject.createImmutable(") :"),RemoteObject.createImmutable("کد: "),act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili"))),RemoteObject.createImmutable(" نام: "),act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili"))),RemoteObject.createImmutable(" وضعیت: "),_vaziat)),(Object)(_color)).runMethod(true,"setSnippet",BA.NumberToString(_i));
 BA.debugLineNum = 108;BA.debugLine="llPoint.Initialize(Cu.GetString(\"FldLat\"),Cu";
Debug.ShouldStop(2048);
_llpoint.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLat"))))),(Object)(BA.numberCast(double.class, act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLon"))))));
 BA.debugLineNum = 109;BA.debugLine="points.Add(llPoint)";
Debug.ShouldStop(4096);
act_locationmoshtarian.mostCurrent._points.runVoidMethod ("Add",(Object)((_llpoint.getObject())));
 BA.debugLineNum = 110;BA.debugLine="If i=Cu.RowCount-1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {act_locationmoshtarian.mostCurrent._cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 111;BA.debugLine="Dim first As AdapterListAshkhas=LstLocation";
Debug.ShouldStop(16384);
_first = (act_locationmoshtarian._lstlocation.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 112;BA.debugLine="Dim cl As CameraPosition";
Debug.ShouldStop(32768);
_cl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cl", _cl);
 BA.debugLineNum = 113;BA.debugLine="cl.Initialize(first.Lat,first.Lon,50)";
Debug.ShouldStop(65536);
_cl.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, _first.getField(true,"Lat" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _first.getField(true,"Lon" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, 50)));
 BA.debugLineNum = 114;BA.debugLine="gmap.AnimateCamera(cl)";
Debug.ShouldStop(131072);
act_locationmoshtarian.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cl.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 118;BA.debugLine="Dim pl As Polyline = gmap.AddPolyline";
Debug.ShouldStop(2097152);
_pl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.PolylineWrapper");
_pl = act_locationmoshtarian.mostCurrent._gmap.runMethod(false,"AddPolyline");Debug.locals.put("pl", _pl);Debug.locals.put("pl", _pl);
 BA.debugLineNum = 119;BA.debugLine="pl.points = points";
Debug.ShouldStop(4194304);
_pl.runMethod(false,"setPoints",act_locationmoshtarian.mostCurrent._points);
 BA.debugLineNum = 120;BA.debugLine="pl.Color = Colors.Blue";
Debug.ShouldStop(8388608);
_pl.runMethod(true,"setColor",act_locationmoshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 };
 }else {
 BA.debugLineNum = 124;BA.debugLine="For i=0 To LstLocation.Size-1";
Debug.ShouldStop(134217728);
{
final int step42 = 1;
final int limit42 = RemoteObject.solve(new RemoteObject[] {act_locationmoshtarian._lstlocation.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42) ;_i = ((int)(0 + _i + step42))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 125;BA.debugLine="Dim item As AdapterListAshkhas=LstLocation.Ge";
Debug.ShouldStop(268435456);
_item = (act_locationmoshtarian._lstlocation.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 126;BA.debugLine="Dim llPoint As LatLng";
Debug.ShouldStop(536870912);
_llpoint = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");Debug.locals.put("llPoint", _llpoint);
 BA.debugLineNum = 127;BA.debugLine="Dim color As Float";
Debug.ShouldStop(1073741824);
_color = RemoteObject.createImmutable(0f);Debug.locals.put("color", _color);
 BA.debugLineNum = 129;BA.debugLine="If IsNumber(item.Lat) And IsNumber(item.Lon )";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(".",act_locationmoshtarian.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_item.getField(true,"Lat" /*RemoteObject*/ )))) && RemoteObject.solveBoolean(".",act_locationmoshtarian.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_item.getField(true,"Lon" /*RemoteObject*/ )))) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"Lat" /*RemoteObject*/ )),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"Lon" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 132;BA.debugLine="llPoint.Initialize(item.Lat,item.Lon)";
Debug.ShouldStop(8);
_llpoint.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, _item.getField(true,"Lat" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _item.getField(true,"Lon" /*RemoteObject*/ ))));
 BA.debugLineNum = 133;BA.debugLine="points.Add(llPoint)";
Debug.ShouldStop(16);
act_locationmoshtarian.mostCurrent._points.runVoidMethod ("Add",(Object)((_llpoint.getObject())));
 BA.debugLineNum = 136;BA.debugLine="color=gmap.HUE_RED";
Debug.ShouldStop(128);
_color = act_locationmoshtarian.mostCurrent._gmap.getField(true,"HUE_RED");Debug.locals.put("color", _color);
 BA.debugLineNum = 137;BA.debugLine="gmap.AddMarker2(item.Lat,item.Lon,item.Shar";
Debug.ShouldStop(256);
act_locationmoshtarian.mostCurrent._gmap.runMethod(false,"AddMarker2",(Object)(BA.numberCast(double.class, _item.getField(true,"Lat" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _item.getField(true,"Lon" /*RemoteObject*/ ))),(Object)(_item.getField(true,"SharhTafzili" /*RemoteObject*/ )),(Object)(_color)).runMethod(true,"setSnippet",BA.NumberToString(_i));
 };
 BA.debugLineNum = 142;BA.debugLine="If i=LstLocation.Size-1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {act_locationmoshtarian._lstlocation.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 143;BA.debugLine="Dim first As AdapterListAshkhas=LstLocation.";
Debug.ShouldStop(16384);
_first = (act_locationmoshtarian._lstlocation.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 144;BA.debugLine="Dim cl As CameraPosition";
Debug.ShouldStop(32768);
_cl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cl", _cl);
 BA.debugLineNum = 145;BA.debugLine="cl.Initialize(first.Lat,first.Lon,50)";
Debug.ShouldStop(65536);
_cl.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, _first.getField(true,"Lat" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _first.getField(true,"Lon" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, 50)));
 BA.debugLineNum = 146;BA.debugLine="gmap.AnimateCamera(cl)";
Debug.ShouldStop(131072);
act_locationmoshtarian.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cl.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 152;BA.debugLine="n=0";
Debug.ShouldStop(8388608);
act_locationmoshtarian.mostCurrent._n = BA.NumberToString(0);
 BA.debugLineNum = 153;BA.debugLine="SelectData";
Debug.ShouldStop(16777216);
_selectdata();
 BA.debugLineNum = 154;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(33554432);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e64) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_locationmoshtarian.processBA, e64.toString()); BA.debugLineNum = 156;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542336334",BA.ObjectToString(act_locationmoshtarian.mostCurrent.__c.runMethod(false,"LastException",act_locationmoshtarian.mostCurrent.activityBA)),0);
 };
 };
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvaziat(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("GetVaziat (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,206);
if (RapidSub.canDelegate("getvaziat")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","getvaziat", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 206;BA.debugLine="Sub GetVaziat(str As String) As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="If str=\"1\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 208;BA.debugLine="Return \"ویزیت نشده\"";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString("ویزیت نشده");
 }else 
{ BA.debugLineNum = 209;BA.debugLine="Else if str=\"2\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("2"))) { 
 BA.debugLineNum = 210;BA.debugLine="Return \"ویزیت شده\"";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToString("ویزیت شده");
 }else 
{ BA.debugLineNum = 211;BA.debugLine="Else if str=\"3\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("3"))) { 
 BA.debugLineNum = 212;BA.debugLine="Return \"سفارش گرفته\"";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString("سفارش گرفته");
 }else {
 BA.debugLineNum = 214;BA.debugLine="Return \"ویزیت نشده\"";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToString("ویزیت نشده");
 }}}
;
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
act_locationmoshtarian.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private MapFragment1 As MapFragment";
act_locationmoshtarian.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private XUI As XUI";
act_locationmoshtarian.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 16;BA.debugLine="Private Panel1 As Panel";
act_locationmoshtarian.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private pnlMap As Panel";
act_locationmoshtarian.mostCurrent._pnlmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private PnlTop As Panel";
act_locationmoshtarian.mostCurrent._pnltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim points As List";
act_locationmoshtarian.mostCurrent._points = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 20;BA.debugLine="Private btnForward As Button";
act_locationmoshtarian.mostCurrent._btnforward = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnNext As Button";
act_locationmoshtarian.mostCurrent._btnnext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private btnVisit As Button";
act_locationmoshtarian.mostCurrent._btnvisit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblAddress As Label";
act_locationmoshtarian.mostCurrent._lbladdress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblCall As Label";
act_locationmoshtarian.mostCurrent._lblcall = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblCodeMoshtari As Label";
act_locationmoshtarian.mostCurrent._lblcodemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblGoToLocation As Label";
act_locationmoshtarian.mostCurrent._lblgotolocation = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblNameMoshtari As Label";
act_locationmoshtarian.mostCurrent._lblnamemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblRadif As Label";
act_locationmoshtarian.mostCurrent._lblradif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblShomareTell As Label";
act_locationmoshtarian.mostCurrent._lblshomaretell = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblVaziatVisit As Label";
act_locationmoshtarian.mostCurrent._lblvaziatvisit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim itemSelect As AdapterListAshkhas";
act_locationmoshtarian.mostCurrent._itemselect = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");
 //BA.debugLineNum = 32;BA.debugLine="Dim n As String=0";
act_locationmoshtarian.mostCurrent._n = BA.NumberToString(0);
 //BA.debugLineNum = 33;BA.debugLine="Dim Cu As Cursor";
act_locationmoshtarian.mostCurrent._cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gotovisit(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("GoToVisit (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,218);
if (RapidSub.canDelegate("gotovisit")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","gotovisit", _item);}
RemoteObject _mande = RemoteObject.createImmutable("");
RemoteObject _saghfeetebar = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 218;BA.debugLine="Sub GoToVisit(item As AdapterListAshkhas)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 220;BA.debugLine="MCode.C_Tafzili=item.CodeTafzili";
Debug.ShouldStop(134217728);
act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = _item.getField(true,"CodeTafzili" /*RemoteObject*/ );
 BA.debugLineNum = 221;BA.debugLine="MCode.N_Tafzili=item.SharhTafzili";
Debug.ShouldStop(268435456);
act_locationmoshtarian.mostCurrent._mcode._n_tafzili /*RemoteObject*/  = _item.getField(true,"SharhTafzili" /*RemoteObject*/ );
 BA.debugLineNum = 222;BA.debugLine="Dim mande As String=myCode.Is_Null_adad(item.Mand";
Debug.ShouldStop(536870912);
_mande = act_locationmoshtarian.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(_item.getField(true,"Mande" /*RemoteObject*/ )));Debug.locals.put("mande", _mande);Debug.locals.put("mande", _mande);
 BA.debugLineNum = 223;BA.debugLine="Dim SaghfeEtebar As String=myCode.Is_Null_adad(it";
Debug.ShouldStop(1073741824);
_saghfeetebar = act_locationmoshtarian.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(_item.getField(true,"fldSaghfeEtebar" /*RemoteObject*/ )));Debug.locals.put("SaghfeEtebar", _saghfeetebar);Debug.locals.put("SaghfeEtebar", _saghfeetebar);
 BA.debugLineNum = 224;BA.debugLine="MCode.MandeHesab=mande";
Debug.ShouldStop(-2147483648);
act_locationmoshtarian.mostCurrent._mcode._mandehesab /*RemoteObject*/  = _mande;
 BA.debugLineNum = 225;BA.debugLine="If SaghfeEtebar>0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _saghfeetebar),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 226;BA.debugLine="If mande>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mande),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 227;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar - mande";
Debug.ShouldStop(4);
act_locationmoshtarian.mostCurrent._mcode._mandeetebar /*RemoteObject*/  = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _saghfeetebar),BA.numberCast(double.class, _mande)}, "-",1, 0));
 }else {
 BA.debugLineNum = 229;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar";
Debug.ShouldStop(16);
act_locationmoshtarian.mostCurrent._mcode._mandeetebar /*RemoteObject*/  = _saghfeetebar;
 };
 BA.debugLineNum = 232;BA.debugLine="MCode.ManedEtebarEnable=True";
Debug.ShouldStop(128);
act_locationmoshtarian.mostCurrent._mcode._manedetebarenable /*RemoteObject*/  = act_locationmoshtarian.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 234;BA.debugLine="MCode.ManedEtebarEnable=False";
Debug.ShouldStop(512);
act_locationmoshtarian.mostCurrent._mcode._manedetebarenable /*RemoteObject*/  = act_locationmoshtarian.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 235;BA.debugLine="MCode.MandeEtebar=0";
Debug.ShouldStop(1024);
act_locationmoshtarian.mostCurrent._mcode._mandeetebar /*RemoteObject*/  = BA.NumberToString(0);
 };
 BA.debugLineNum = 238;BA.debugLine="Log(\"مانده: \"& mande)";
Debug.ShouldStop(8192);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542598420",RemoteObject.concat(RemoteObject.createImmutable("مانده: "),_mande),0);
 BA.debugLineNum = 239;BA.debugLine="Log(\"سقف اعتبار: \"&SaghfeEtebar)";
Debug.ShouldStop(16384);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542598421",RemoteObject.concat(RemoteObject.createImmutable("سقف اعتبار: "),_saghfeetebar),0);
 BA.debugLineNum = 240;BA.debugLine="Log(\"مانده اعتبار: \"&MCode.MandeEtebar)";
Debug.ShouldStop(32768);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542598422",RemoteObject.concat(RemoteObject.createImmutable("مانده اعتبار: "),act_locationmoshtarian.mostCurrent._mcode._mandeetebar /*RemoteObject*/ ),0);
 BA.debugLineNum = 241;BA.debugLine="Log(\"وضعیت مانده اعتبار: \"&MCode.ManedEtebarEnabl";
Debug.ShouldStop(65536);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542598423",RemoteObject.concat(RemoteObject.createImmutable("وضعیت مانده اعتبار: "),act_locationmoshtarian.mostCurrent._mcode._manedetebarenable /*RemoteObject*/ ),0);
 BA.debugLineNum = 244;BA.debugLine="visit";
Debug.ShouldStop(524288);
_visit();
 BA.debugLineNum = 246;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(2097152);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("StartActivity",act_locationmoshtarian.processBA,(Object)((act_locationmoshtarian.mostCurrent._act_kaladefault.getObject())));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gotovisit2() throws Exception{
try {
		Debug.PushSubsStack("GoToVisit2 (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,250);
if (RapidSub.canDelegate("gotovisit2")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","gotovisit2");}
RemoteObject _mande = RemoteObject.createImmutable("");
RemoteObject _saghfeetebar = RemoteObject.createImmutable("");
 BA.debugLineNum = 250;BA.debugLine="Sub GoToVisit2";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 253;BA.debugLine="MCode.C_Tafzili=Cu.GetString(\"fldCodeTafzili\")";
Debug.ShouldStop(268435456);
act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili")));
 BA.debugLineNum = 254;BA.debugLine="MCode.N_Tafzili=Cu.GetString(\"fldSharheTafzili\")";
Debug.ShouldStop(536870912);
act_locationmoshtarian.mostCurrent._mcode._n_tafzili /*RemoteObject*/  = act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili")));
 BA.debugLineNum = 255;BA.debugLine="Dim mande As String=myCode.Is_Null_adad(Cu.GetStr";
Debug.ShouldStop(1073741824);
_mande = act_locationmoshtarian.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMande")))));Debug.locals.put("mande", _mande);Debug.locals.put("mande", _mande);
 BA.debugLineNum = 256;BA.debugLine="Dim SaghfeEtebar As String=myCode.Is_Null_adad(Cu";
Debug.ShouldStop(-2147483648);
_saghfeetebar = act_locationmoshtarian.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSaghfeEtebar")))));Debug.locals.put("SaghfeEtebar", _saghfeetebar);Debug.locals.put("SaghfeEtebar", _saghfeetebar);
 BA.debugLineNum = 257;BA.debugLine="MCode.MandeHesab=mande";
Debug.ShouldStop(1);
act_locationmoshtarian.mostCurrent._mcode._mandehesab /*RemoteObject*/  = _mande;
 BA.debugLineNum = 258;BA.debugLine="If SaghfeEtebar>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _saghfeetebar),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 259;BA.debugLine="If mande>0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mande),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 260;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar - mande";
Debug.ShouldStop(8);
act_locationmoshtarian.mostCurrent._mcode._mandeetebar /*RemoteObject*/  = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _saghfeetebar),BA.numberCast(double.class, _mande)}, "-",1, 0));
 }else {
 BA.debugLineNum = 262;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar";
Debug.ShouldStop(32);
act_locationmoshtarian.mostCurrent._mcode._mandeetebar /*RemoteObject*/  = _saghfeetebar;
 };
 BA.debugLineNum = 265;BA.debugLine="MCode.ManedEtebarEnable=True";
Debug.ShouldStop(256);
act_locationmoshtarian.mostCurrent._mcode._manedetebarenable /*RemoteObject*/  = act_locationmoshtarian.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 267;BA.debugLine="MCode.ManedEtebarEnable=False";
Debug.ShouldStop(1024);
act_locationmoshtarian.mostCurrent._mcode._manedetebarenable /*RemoteObject*/  = act_locationmoshtarian.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 268;BA.debugLine="MCode.MandeEtebar=0";
Debug.ShouldStop(2048);
act_locationmoshtarian.mostCurrent._mcode._mandeetebar /*RemoteObject*/  = BA.NumberToString(0);
 };
 BA.debugLineNum = 271;BA.debugLine="Log(\"مانده: \"& mande)";
Debug.ShouldStop(16384);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542663957",RemoteObject.concat(RemoteObject.createImmutable("مانده: "),_mande),0);
 BA.debugLineNum = 272;BA.debugLine="Log(\"سقف اعتبار: \"&SaghfeEtebar)";
Debug.ShouldStop(32768);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542663958",RemoteObject.concat(RemoteObject.createImmutable("سقف اعتبار: "),_saghfeetebar),0);
 BA.debugLineNum = 273;BA.debugLine="Log(\"مانده اعتبار: \"&MCode.MandeEtebar)";
Debug.ShouldStop(65536);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542663959",RemoteObject.concat(RemoteObject.createImmutable("مانده اعتبار: "),act_locationmoshtarian.mostCurrent._mcode._mandeetebar /*RemoteObject*/ ),0);
 BA.debugLineNum = 274;BA.debugLine="Log(\"وضعیت مانده اعتبار: \"&MCode.ManedEtebarEnabl";
Debug.ShouldStop(131072);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542663960",RemoteObject.concat(RemoteObject.createImmutable("وضعیت مانده اعتبار: "),act_locationmoshtarian.mostCurrent._mcode._manedetebarenable /*RemoteObject*/ ),0);
 BA.debugLineNum = 277;BA.debugLine="visit";
Debug.ShouldStop(1048576);
_visit();
 BA.debugLineNum = 279;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(4194304);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("StartActivity",act_locationmoshtarian.processBA,(Object)((act_locationmoshtarian.mostCurrent._act_kaladefault.getObject())));
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("lblCall_Click (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,410);
if (RapidSub.canDelegate("lblcall_click")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","lblcall_click");}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 410;BA.debugLine="Private Sub lblCall_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 411;BA.debugLine="Dim str As String=lblShomareTell.tag";
Debug.ShouldStop(67108864);
_str = BA.ObjectToString(act_locationmoshtarian.mostCurrent._lblshomaretell.runMethod(false,"getTag"));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 412;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(134217728);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 413;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"tel:\"&str)";
Debug.ShouldStop(268435456);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tel:"),_str)));
 BA.debugLineNum = 414;BA.debugLine="StartActivity(i)";
Debug.ShouldStop(536870912);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("StartActivity",act_locationmoshtarian.processBA,(Object)((_i.getObject())));
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblgotolocation_click() throws Exception{
try {
		Debug.PushSubsStack("lblGoToLocation_Click (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,369);
if (RapidSub.canDelegate("lblgotolocation_click")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","lblgotolocation_click");}
 BA.debugLineNum = 369;BA.debugLine="Private Sub lblGoToLocation_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 370;BA.debugLine="ShowMap(Cu.GetString(\"FldLat\"), Cu.GetString(\"Fld";
Debug.ShouldStop(131072);
_showmap(act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLat"))),act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLon"))));
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddata(RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("LoadData (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,44);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","loaddata", _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 44;BA.debugLine="Sub LoadData(lst As List)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If lst.Size>0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 46;BA.debugLine="LstLocation=lst";
Debug.ShouldStop(8192);
act_locationmoshtarian._lstlocation = _lst;
 BA.debugLineNum = 47;BA.debugLine="LoadMap";
Debug.ShouldStop(16384);
_loadmap();
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
public static void  _loadmap() throws Exception{
try {
		Debug.PushSubsStack("LoadMap (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,51);
if (RapidSub.canDelegate("loadmap")) { ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","loadmap"); return;}
ResumableSub_LoadMap rsub = new ResumableSub_LoadMap(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadMap extends BA.ResumableSub {
public ResumableSub_LoadMap(ir.parsikhesab.pakhsh.act_locationmoshtarian parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_locationmoshtarian parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadMap (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,51);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 52;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionSt";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA),parent.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 53;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود ر";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 54;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 56;BA.debugLine="If MapFragment1.IsGooglePlayServicesAvailable = F";
Debug.ShouldStop(8388608);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mapfragment1.runMethod(true,"IsGooglePlayServicesAvailable",act_locationmoshtarian.mostCurrent.activityBA),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 57;BA.debugLine="ToastMessageShow(\"Please install Google Play Ser";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please install Google Play Services.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 58;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 60;BA.debugLine="Sleep(200)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_locationmoshtarian.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_locationmoshtarian", "loadmap"),BA.numberCast(int.class, 200));
this.state = 21;
return;
case 21:
//C
this.state = 8;
;
 BA.debugLineNum = 61;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(268435456);
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 BA.debugLineNum = 62;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
Debug.ShouldStop(536870912);
parent._rp.runVoidMethod ("CheckAndRequest",act_locationmoshtarian.processBA,(Object)(parent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 63;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_locationmoshtarian.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_locationmoshtarian", "loadmap"), null);
this.state = 22;
return;
case 22:
//C
this.state = 8;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 64;BA.debugLine="If Result Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 8:
//if
this.state = 20;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 19;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 65;BA.debugLine="If LstLocation.Size>0 Then";
Debug.ShouldStop(1);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean(">",parent._lstlocation.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 66;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(2);
parent.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 67;BA.debugLine="GetLocation";
Debug.ShouldStop(4);
_getlocation();
 if (true) break;
;
 BA.debugLineNum = 69;BA.debugLine="If pnlMap.Visible=False Then";
Debug.ShouldStop(16);

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._pnlmap.runMethod(true,"getVisible"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 70;BA.debugLine="pnlMap.Visible=True";
Debug.ShouldStop(32);
parent.mostCurrent._pnlmap.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 73;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","542270742",RemoteObject.createImmutable("No permission!"),0);
 if (true) break;

case 20:
//C
this.state = -1;
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _mapfragment1_markerclick(RemoteObject _selectedmarker) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_MarkerClick (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,161);
if (RapidSub.canDelegate("mapfragment1_markerclick")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","mapfragment1_markerclick", _selectedmarker);}
Debug.locals.put("SelectedMarker", _selectedmarker);
 BA.debugLineNum = 161;BA.debugLine="Sub MapFragment1_MarkerClick (SelectedMarker As Ma";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="n=SelectedMarker.Snippet";
Debug.ShouldStop(2);
act_locationmoshtarian.mostCurrent._n = _selectedmarker.runMethod(true,"getSnippet");
 BA.debugLineNum = 163;BA.debugLine="SelectData";
Debug.ShouldStop(4);
_selectdata();
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
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
act_locationmoshtarian._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 8;BA.debugLine="Dim LstLocation As List";
act_locationmoshtarian._lstlocation = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savelastseen() throws Exception{
try {
		Debug.PushSubsStack("SaveLastSeen (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,300);
if (RapidSub.canDelegate("savelastseen")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","savelastseen");}
RemoteObject _dateshamsi = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _d = RemoteObject.createImmutable("");
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _maxradif = RemoteObject.createImmutable(0);
 BA.debugLineNum = 300;BA.debugLine="Sub SaveLastSeen";
Debug.ShouldStop(2048);
 BA.debugLineNum = 302;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(8192);
act_locationmoshtarian.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 304;BA.debugLine="Dim DateShamsi As String = MCode.DatePersian";
Debug.ShouldStop(32768);
_dateshamsi = act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA);Debug.locals.put("DateShamsi", _dateshamsi);Debug.locals.put("DateShamsi", _dateshamsi);
 BA.debugLineNum = 305;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(65536);
_time = act_locationmoshtarian.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_locationmoshtarian.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 306;BA.debugLine="Dim D As String = DateShamsi & \"T\" & Time";
Debug.ShouldStop(131072);
_d = RemoteObject.concat(_dateshamsi,RemoteObject.createImmutable("T"),_time);Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 307;BA.debugLine="LogColor(\"D: \" & D,Colors.Red)";
Debug.ShouldStop(262144);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542795015",RemoteObject.concat(RemoteObject.createImmutable("D: "),_d),act_locationmoshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 309;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(1048576);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_locationmoshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblLastSeen Where FldC_Ashkhas = '"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu1", _cu1);Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 310;BA.debugLine="If Cu1.RowCount>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 311;BA.debugLine="MCode.SaveUpdate(\"Update TblLastSeen Set LastSee";
Debug.ShouldStop(4194304);
act_locationmoshtarian.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblLastSeen Set LastSeen = '"),_d,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 313;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLastSeen (FldC_";
Debug.ShouldStop(16777216);
act_locationmoshtarian.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblLastSeen (FldC_Ashkhas,LastSeen) Values ('"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_d,RemoteObject.createImmutable("')"))));
 };
 BA.debugLineNum = 315;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set lastSeen";
Debug.ShouldStop(67108864);
act_locationmoshtarian.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set lastSeen = '"),_d,RemoteObject.createImmutable("' Where fldCodetafzili = '"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 319;BA.debugLine="If MCode.TourVisitSW And MCode.TourVisit=1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(".",act_locationmoshtarian.mostCurrent._mcode._tourvisitsw /*RemoteObject*/ ) && RemoteObject.solveBoolean("=",act_locationmoshtarian.mostCurrent._mcode._tourvisit /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 320;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set fldV";
Debug.ShouldStop(-2147483648);
act_locationmoshtarian.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update tblTourVisitor Set fldVaziat='2',fldTimeVisit='"),_time,RemoteObject.createImmutable("',fldSend='False' Where fldCodeTafzili = '"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("' and fldDateVisit='"),act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA),RemoteObject.createImmutable("' and fldType='Tour'"))));
 }else {
 BA.debugLineNum = 322;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select C";
Debug.ShouldStop(2);
_count = BA.numberCast(int.class, act_locationmoshtarian.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Count(fldRadif) from tblTourVisitor where fldCodeTafzili='"),act_locationmoshtarian.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ))),RemoteObject.createImmutable("' and fldDateVisit='"),act_locationmoshtarian.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldType='Free'"))))));Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 323;BA.debugLine="Dim MaxRadif As Int";
Debug.ShouldStop(4);
_maxradif = RemoteObject.createImmutable(0);Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 324;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select C";
Debug.ShouldStop(8);
_count = BA.numberCast(int.class, act_locationmoshtarian.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"),act_locationmoshtarian.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldType='Free'"))))));Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 325;BA.debugLine="Dim MaxRadif As Int";
Debug.ShouldStop(16);
_maxradif = RemoteObject.createImmutable(0);Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 326;BA.debugLine="If Count=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 327;BA.debugLine="MaxRadif=1";
Debug.ShouldStop(64);
_maxradif = BA.numberCast(int.class, 1);Debug.locals.put("MaxRadif", _maxradif);
 }else {
 BA.debugLineNum = 329;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fldRa";
Debug.ShouldStop(256);
_maxradif = BA.numberCast(int.class, act_locationmoshtarian.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"),act_locationmoshtarian.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldType='Free'"))))));Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 330;BA.debugLine="MaxRadif=MaxRadif+1";
Debug.ShouldStop(512);
_maxradif = RemoteObject.solve(new RemoteObject[] {_maxradif,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("MaxRadif", _maxradif);
 };
 BA.debugLineNum = 333;BA.debugLine="Cu1 = MCode.Result($\"SELECT * FROM TblAshkhas WH";
Debug.ShouldStop(4096);
_cu1 = act_locationmoshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM TblAshkhas WHERE TblAshkhas.fldCodetafzili ="),act_locationmoshtarian.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 335;BA.debugLine="Cu1.Position=0";
Debug.ShouldStop(16384);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 336;BA.debugLine="MCode.SaveUpdate(\"Insert into tblTourVisitor(fld";
Debug.ShouldStop(32768);
act_locationmoshtarian.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert into tblTourVisitor(fldRadif,fldCodeSuperVisor,fldCodeGroup,fldCodeVisitor,fldCodeTafzili,fldSharheTafzili,fldDate,fldDateVisit,fldTimeVisit,fldDateNextVisit,fldDateTozie,fldShomareSefaresh,fldTimeSefaresh,fldSharh,fldVaziat,fldShomareFactor,fldSend,fldType) Values("),_maxradif,RemoteObject.createImmutable(",0,'"),act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroup"))),RemoteObject.createImmutable("','"),act_locationmoshtarian.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("','"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),act_locationmoshtarian.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA),RemoteObject.createImmutable("','"),act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA),RemoteObject.createImmutable("','"),_time,RemoteObject.createImmutable("','0','0','0','','0','2','0','False','Free')"))));
 };
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectdata() throws Exception{
try {
		Debug.PushSubsStack("SelectData (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,169);
if (RapidSub.canDelegate("selectdata")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","selectdata");}
RemoteObject _cl = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
 BA.debugLineNum = 169;BA.debugLine="Sub SelectData";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="If MCode.TourVisitSW Then";
Debug.ShouldStop(512);
if (act_locationmoshtarian.mostCurrent._mcode._tourvisitsw /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 171;BA.debugLine="Cu = MCode.Result($\"SELECT tblTourVisitor.fldRad";
Debug.ShouldStop(1024);
act_locationmoshtarian.mostCurrent._cu = act_locationmoshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT tblTourVisitor.fldRadif,tblTourVisitor.fldCodeSuperVisor,tblTourVisitor.fldCodeVisitor,tblTourVisitor.fldCodeGroup,tblTourVisitor.fldCodeTafzili,TblAshkhas.fldSharheTafzili,tblTourVisitor.fldDate,tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit,tblTourVisitor.fldDateNextVisit,tblTourVisitor.fldDateTozie,tblTourVisitor.fldShomareSefaresh,tblTourVisitor.fldSharh,tblTourVisitor.fldVaziat,tblTourVisitor.fldShomareFactor,TblAshkhas.FldLat,TblAshkhas.FldLon,TblAshkhas.fldTell,TblAshkhas.fldAdress,TblAshkhas.fldMande,TblAshkhas.fldSaghfeEtebar,TblAshkhas.fldBlackList  FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND fldDateVisit = "),act_locationmoshtarian.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA)))),RemoteObject.createImmutable(" and fldType='Tour' ORDER BY tblTourVisitor.fldRadif ASC")))));
 BA.debugLineNum = 173;BA.debugLine="Cu.Position=n";
Debug.ShouldStop(4096);
act_locationmoshtarian.mostCurrent._cu.runMethod(true,"setPosition",BA.numberCast(int.class, act_locationmoshtarian.mostCurrent._n));
 BA.debugLineNum = 175;BA.debugLine="lblCodeMoshtari.Text=\"کد مشتری: \"&Cu.GetString(\"";
Debug.ShouldStop(16384);
act_locationmoshtarian.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد مشتری: "),act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili"))))));
 BA.debugLineNum = 176;BA.debugLine="lblNameMoshtari.Text=\"نام مشتری: \"&Cu.GetString(";
Debug.ShouldStop(32768);
act_locationmoshtarian.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نام مشتری: "),act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili"))))));
 BA.debugLineNum = 177;BA.debugLine="lblShomareTell.Text=\"شماره تماس: \"&Cu.GetString(";
Debug.ShouldStop(65536);
act_locationmoshtarian.mostCurrent._lblshomaretell.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شماره تماس: "),act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell"))))));
 BA.debugLineNum = 178;BA.debugLine="lblShomareTell.Tag=Cu.GetString(\"fldTell\")";
Debug.ShouldStop(131072);
act_locationmoshtarian.mostCurrent._lblshomaretell.runMethod(false,"setTag",(act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell")))));
 BA.debugLineNum = 179;BA.debugLine="lblRadif.Text=\"اولویت: \"& Cu.GetString(\"fldRadif";
Debug.ShouldStop(262144);
act_locationmoshtarian.mostCurrent._lblradif.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("اولویت: "),act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldRadif"))))));
 BA.debugLineNum = 180;BA.debugLine="lblVaziatVisit.Text=\"وضعیت: \"& GetVaziat(Cu.GetS";
Debug.ShouldStop(524288);
act_locationmoshtarian.mostCurrent._lblvaziatvisit.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("وضعیت: "),_getvaziat(act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldVaziat")))))));
 BA.debugLineNum = 181;BA.debugLine="lblAddress.Text=\"آدرس: \"&Cu.GetString(\"fldAdress";
Debug.ShouldStop(1048576);
act_locationmoshtarian.mostCurrent._lbladdress.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("آدرس: "),act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldAdress"))))));
 BA.debugLineNum = 182;BA.debugLine="Dim cl As CameraPosition";
Debug.ShouldStop(2097152);
_cl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cl", _cl);
 BA.debugLineNum = 183;BA.debugLine="cl.Initialize(Cu.GetString(\"FldLat\"),Cu.GetStrin";
Debug.ShouldStop(4194304);
_cl.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLat"))))),(Object)(BA.numberCast(double.class, act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLon"))))),(Object)(BA.numberCast(float.class, 50)));
 BA.debugLineNum = 184;BA.debugLine="gmap.AnimateCamera(cl)";
Debug.ShouldStop(8388608);
act_locationmoshtarian.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cl.getObject())));
 BA.debugLineNum = 185;BA.debugLine="Log(Cu.GetString(\"fldSharheTafzili\"))";
Debug.ShouldStop(16777216);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542467344",act_locationmoshtarian.mostCurrent._cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili"))),0);
 }else {
 BA.debugLineNum = 187;BA.debugLine="itemSelect=LstLocation.Get(n)";
Debug.ShouldStop(67108864);
act_locationmoshtarian.mostCurrent._itemselect = (act_locationmoshtarian._lstlocation.runMethod(false,"Get",(Object)(BA.numberCast(int.class, act_locationmoshtarian.mostCurrent._n))));
 BA.debugLineNum = 188;BA.debugLine="lblCodeMoshtari.Text=\"کد مشتری: \"&itemSelect.Cod";
Debug.ShouldStop(134217728);
act_locationmoshtarian.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد مشتری: "),act_locationmoshtarian.mostCurrent._itemselect.getField(true,"CodeTafzili" /*RemoteObject*/ ))));
 BA.debugLineNum = 189;BA.debugLine="lblNameMoshtari.Text=\"نام مشتری: \"&itemSelect.Sh";
Debug.ShouldStop(268435456);
act_locationmoshtarian.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نام مشتری: "),act_locationmoshtarian.mostCurrent._itemselect.getField(true,"SharhTafzili" /*RemoteObject*/ ))));
 BA.debugLineNum = 190;BA.debugLine="lblShomareTell.Text=\"شماره تماس: \"&itemSelect.Te";
Debug.ShouldStop(536870912);
act_locationmoshtarian.mostCurrent._lblshomaretell.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شماره تماس: "),act_locationmoshtarian.mostCurrent._itemselect.getField(true,"Tell" /*RemoteObject*/ ))));
 BA.debugLineNum = 191;BA.debugLine="lblShomareTell.Tag=itemSelect.Tell";
Debug.ShouldStop(1073741824);
act_locationmoshtarian.mostCurrent._lblshomaretell.runMethod(false,"setTag",(act_locationmoshtarian.mostCurrent._itemselect.getField(true,"Tell" /*RemoteObject*/ )));
 BA.debugLineNum = 192;BA.debugLine="lblRadif.Text=\"اولویت: \"&itemSelect.fldRadif";
Debug.ShouldStop(-2147483648);
act_locationmoshtarian.mostCurrent._lblradif.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("اولویت: "),act_locationmoshtarian.mostCurrent._itemselect.getField(true,"fldRadif" /*RemoteObject*/ ))));
 BA.debugLineNum = 193;BA.debugLine="lblVaziatVisit.Text=\"وضعیت: \"& GetVaziat(itemSel";
Debug.ShouldStop(1);
act_locationmoshtarian.mostCurrent._lblvaziatvisit.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("وضعیت: "),_getvaziat(act_locationmoshtarian.mostCurrent._itemselect.getField(true,"fldVaziatTour" /*RemoteObject*/ )))));
 BA.debugLineNum = 194;BA.debugLine="lblAddress.Text=\"آدرس: \"&itemSelect.Address";
Debug.ShouldStop(2);
act_locationmoshtarian.mostCurrent._lbladdress.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("آدرس: "),act_locationmoshtarian.mostCurrent._itemselect.getField(true,"Address" /*RemoteObject*/ ))));
 BA.debugLineNum = 195;BA.debugLine="Dim cl As CameraPosition";
Debug.ShouldStop(4);
_cl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cl", _cl);
 BA.debugLineNum = 196;BA.debugLine="cl.Initialize(itemSelect.Lat,itemSelect.Lon,50)";
Debug.ShouldStop(8);
_cl.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, act_locationmoshtarian.mostCurrent._itemselect.getField(true,"Lat" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, act_locationmoshtarian.mostCurrent._itemselect.getField(true,"Lon" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, 50)));
 BA.debugLineNum = 197;BA.debugLine="gmap.AnimateCamera(cl)";
Debug.ShouldStop(16);
act_locationmoshtarian.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cl.getObject())));
 BA.debugLineNum = 198;BA.debugLine="Log(itemSelect.SharhTafzili)";
Debug.ShouldStop(32);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","542467357",act_locationmoshtarian.mostCurrent._itemselect.getField(true,"SharhTafzili" /*RemoteObject*/ ),0);
 };
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
public static RemoteObject  _showmap(RemoteObject _lat1,RemoteObject _lon1) throws Exception{
try {
		Debug.PushSubsStack("ShowMap (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,373);
if (RapidSub.canDelegate("showmap")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","showmap", _lat1, _lon1);}
RemoteObject _destlat = RemoteObject.createImmutable(0);
RemoteObject _destlng = RemoteObject.createImmutable(0);
RemoteObject _label = RemoteObject.createImmutable("");
RemoteObject _uri = RemoteObject.createImmutable("");
RemoteObject _intent = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("Lat1", _lat1);
Debug.locals.put("Lon1", _lon1);
 BA.debugLineNum = 373;BA.debugLine="Sub ShowMap(Lat1 As String,Lon1 As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 374;BA.debugLine="If Lat1 =\"\" And Lon1=\"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_lat1,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",_lon1,BA.ObjectToString(""))) { 
 BA.debugLineNum = 375;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نشده ا";
Debug.ShouldStop(4194304);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نشده است")),(Object)(act_locationmoshtarian.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 376;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 379;BA.debugLine="Dim destLat As Double = Lat1 ' عرض جغرافیایی مقصد";
Debug.ShouldStop(67108864);
_destlat = BA.numberCast(double.class, _lat1);Debug.locals.put("destLat", _destlat);Debug.locals.put("destLat", _destlat);
 BA.debugLineNum = 380;BA.debugLine="Dim destLng As Double = Lon1 ' طول جغرافیایی مقصد";
Debug.ShouldStop(134217728);
_destlng = BA.numberCast(double.class, _lon1);Debug.locals.put("destLng", _destlng);Debug.locals.put("destLng", _destlng);
 BA.debugLineNum = 381;BA.debugLine="Dim label As String = \"Destination\" ' برچسب مقصد";
Debug.ShouldStop(268435456);
_label = BA.ObjectToString("Destination");Debug.locals.put("label", _label);Debug.locals.put("label", _label);
 BA.debugLineNum = 383;BA.debugLine="Dim uri As String";
Debug.ShouldStop(1073741824);
_uri = RemoteObject.createImmutable("");Debug.locals.put("uri", _uri);
 BA.debugLineNum = 384;BA.debugLine="uri = \"google.navigation:q=\" & destLat & \",\" & de";
Debug.ShouldStop(-2147483648);
_uri = RemoteObject.concat(RemoteObject.createImmutable("google.navigation:q="),_destlat,RemoteObject.createImmutable(","),_destlng,RemoteObject.createImmutable("&label="),_label);Debug.locals.put("uri", _uri);
 BA.debugLineNum = 386;BA.debugLine="Dim intent As Intent";
Debug.ShouldStop(2);
_intent = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("intent", _intent);
 BA.debugLineNum = 387;BA.debugLine="intent.Initialize(intent.ACTION_VIEW, uri)";
Debug.ShouldStop(4);
_intent.runVoidMethod ("Initialize",(Object)(_intent.getField(true,"ACTION_VIEW")),(Object)(_uri));
 BA.debugLineNum = 388;BA.debugLine="intent.SetComponent(\"com.google.android.apps.maps";
Debug.ShouldStop(8);
_intent.runVoidMethod ("SetComponent",(Object)(RemoteObject.createImmutable("com.google.android.apps.maps")));
 BA.debugLineNum = 390;BA.debugLine="If intent.IsInitialized Then";
Debug.ShouldStop(32);
if (_intent.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 391;BA.debugLine="StartActivity(intent)";
Debug.ShouldStop(64);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("StartActivity",act_locationmoshtarian.processBA,(Object)((_intent.getObject())));
 }else {
 BA.debugLineNum = 393;BA.debugLine="ToastMessageShow(\"Google Maps app not found\", Tr";
Debug.ShouldStop(256);
act_locationmoshtarian.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Google Maps app not found")),(Object)(act_locationmoshtarian.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 408;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _visit() throws Exception{
try {
		Debug.PushSubsStack("visit (act_locationmoshtarian) ","act_locationmoshtarian",20,act_locationmoshtarian.mostCurrent.activityBA,act_locationmoshtarian.mostCurrent,283);
if (RapidSub.canDelegate("visit")) { return ir.parsikhesab.pakhsh.act_locationmoshtarian.remoteMe.runUserSub(false, "act_locationmoshtarian","visit");}
RemoteObject _date = RemoteObject.createImmutable("");
 BA.debugLineNum = 283;BA.debugLine="Sub visit";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian2";
Debug.ShouldStop(134217728);
_date = act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(act_locationmoshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA)));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 285;BA.debugLine="If MCode.editFactor=False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_locationmoshtarian.mostCurrent._mcode._editfactor /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 286;BA.debugLine="MCode.FaktorSelect=\"\"";
Debug.ShouldStop(536870912);
act_locationmoshtarian.mostCurrent._mcode._faktorselect /*RemoteObject*/  = BA.ObjectToString("");
 };
 BA.debugLineNum = 288;BA.debugLine="MCode.Action=\"SabtFaktor\"";
Debug.ShouldStop(-2147483648);
act_locationmoshtarian.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtFaktor");
 BA.debugLineNum = 289;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from Tb";
Debug.ShouldStop(1);
act_locationmoshtarian.mostCurrent._cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
act_locationmoshtarian.mostCurrent._cu = act_locationmoshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 290;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",act_locationmoshtarian.mostCurrent._cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 291;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Set";
Debug.ShouldStop(4);
act_locationmoshtarian.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblLogVisitSefaresh Set FldVisit = '"),_date,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 293;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefares";
Debug.ShouldStop(16);
act_locationmoshtarian.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_date,RemoteObject.createImmutable("','','','','')"))));
 };
 BA.debugLineNum = 295;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldLastVi";
Debug.ShouldStop(64);
act_locationmoshtarian.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set FldLastVisit = '"),_date,RemoteObject.createImmutable("' Where fldCodetafzili = '"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 296;BA.debugLine="MCode.SaveUpdate(\"Update TblVisitorTour Set FldLa";
Debug.ShouldStop(128);
act_locationmoshtarian.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_locationmoshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblVisitorTour Set FldLastVisit = '"),_date,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),act_locationmoshtarian.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 297;BA.debugLine="SaveLastSeen";
Debug.ShouldStop(256);
_savelastseen();
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}