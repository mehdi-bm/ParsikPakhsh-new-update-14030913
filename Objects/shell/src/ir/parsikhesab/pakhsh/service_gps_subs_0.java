package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class service_gps_subs_0 {


public static RemoteObject  _datemiladi() throws Exception{
try {
		Debug.PushSubsStack("DateMiladi (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,232);
if (RapidSub.canDelegate("datemiladi")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","datemiladi");}
RemoteObject _t = null;
 BA.debugLineNum = 232;BA.debugLine="Sub DateMiladi As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="Dim T() As String";
Debug.ShouldStop(256);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 234;BA.debugLine="T = Regex.Split(\"/\",DateTime.Date(DateTime.Now))";
Debug.ShouldStop(512);
_t = service_gps.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(service_gps.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(service_gps.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 235;BA.debugLine="If T(0).Length=1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 0)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 236;BA.debugLine="T(0)=\"0\"&T(0)";
Debug.ShouldStop(2048);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 238;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 239;BA.debugLine="T(1)=\"0\"&T(0)";
Debug.ShouldStop(16384);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 241;BA.debugLine="Return T(2)&T(1)&T(0)";
Debug.ShouldStop(65536);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 2)),_t.getArrayElement(true,BA.numberCast(int.class, 1)),_t.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datemiladi2() throws Exception{
try {
		Debug.PushSubsStack("DateMiladi2 (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,243);
if (RapidSub.canDelegate("datemiladi2")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","datemiladi2");}
RemoteObject _t = null;
 BA.debugLineNum = 243;BA.debugLine="Sub DateMiladi2 As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="Dim T() As String";
Debug.ShouldStop(524288);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 245;BA.debugLine="T = Regex.Split(\"/\",DateTime.Date(DateTime.Now))";
Debug.ShouldStop(1048576);
_t = service_gps.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(service_gps.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(service_gps.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 246;BA.debugLine="If T(0).Length=1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 0)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 247;BA.debugLine="T(0)=\"0\"&T(0)";
Debug.ShouldStop(4194304);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 249;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 250;BA.debugLine="T(1)=\"0\"&T(0)";
Debug.ShouldStop(33554432);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 252;BA.debugLine="Return T(2)&T(1)";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 2)),_t.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datepersian() throws Exception{
try {
		Debug.PushSubsStack("DatePersian (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,220);
if (RapidSub.canDelegate("datepersian")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","datepersian");}
RemoteObject _t = null;
 BA.debugLineNum = 220;BA.debugLine="Sub DatePersian As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="Dim T() As String";
Debug.ShouldStop(268435456);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 222;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
Debug.ShouldStop(536870912);
_t = service_gps.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(service_gps._persiandate.runMethod(true,"getDate",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("/")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 223;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 224;BA.debugLine="T(1)=\"0\"&T(1)";
Debug.ShouldStop(-2147483648);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 1))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 226;BA.debugLine="If T(2).Length=1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 2)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 227;BA.debugLine="T(2)=\"0\"&T(2)";
Debug.ShouldStop(4);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 2))),BA.numberCast(int.class, 2));
 };
 BA.debugLineNum = 229;BA.debugLine="Return T(0)&T(1)&T(2)";
Debug.ShouldStop(16);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 0)),_t.getArrayElement(true,BA.numberCast(int.class, 1)),_t.getArrayElement(true,BA.numberCast(int.class, 2)));
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
public static RemoteObject  _datepersian2() throws Exception{
try {
		Debug.PushSubsStack("DatePersian2 (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,209);
if (RapidSub.canDelegate("datepersian2")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","datepersian2");}
RemoteObject _t = null;
 BA.debugLineNum = 209;BA.debugLine="Sub DatePersian2 As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim T() As String";
Debug.ShouldStop(131072);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 211;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
Debug.ShouldStop(262144);
_t = service_gps.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(service_gps._persiandate.runMethod(true,"getDate",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("/")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 212;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 213;BA.debugLine="T(1)=\"0\"&T(1)";
Debug.ShouldStop(1048576);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 1))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 215;BA.debugLine="If T(2).Length=1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 2)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 216;BA.debugLine="T(2)=\"0\"&T(2)";
Debug.ShouldStop(8388608);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 2))),BA.numberCast(int.class, 2));
 };
 BA.debugLineNum = 218;BA.debugLine="Return T(1)&T(2)";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 1)),_t.getArrayElement(true,BA.numberCast(int.class, 2)));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dttojson(RemoteObject _cu) throws Exception{
try {
		Debug.PushSubsStack("DtToJson (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,255);
if (RapidSub.canDelegate("dttojson")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","dttojson", _cu);}
RemoteObject _olgoo = RemoteObject.createImmutable("");
RemoteObject _rowolgoo = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
int _i = 0;
int _j = 0;
Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 255;BA.debugLine="Sub DtToJson(Cu As Cursor) As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="Dim Olgoo As String";
Debug.ShouldStop(-2147483648);
_olgoo = RemoteObject.createImmutable("");Debug.locals.put("Olgoo", _olgoo);
 BA.debugLineNum = 257;BA.debugLine="Dim RowOlgoo As String";
Debug.ShouldStop(1);
_rowolgoo = RemoteObject.createImmutable("");Debug.locals.put("RowOlgoo", _rowolgoo);
 BA.debugLineNum = 258;BA.debugLine="Dim Str As String";
Debug.ShouldStop(2);
_str = RemoteObject.createImmutable("");Debug.locals.put("Str", _str);
 BA.debugLineNum = 259;BA.debugLine="For i=0 To Cu.ColumnCount-1";
Debug.ShouldStop(4);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 260;BA.debugLine="Olgoo=Olgoo & Chr(34) & Cu.GetColumnName(i) & Ch";
Debug.ShouldStop(8);
_olgoo = RemoteObject.concat(_olgoo,service_gps.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),_cu.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),service_gps.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),RemoteObject.createImmutable(":"),service_gps.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),_cu.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(_i),service_gps.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),RemoteObject.createImmutable(","));Debug.locals.put("Olgoo", _olgoo);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 262;BA.debugLine="Olgoo=Sf.Left(Olgoo,Olgoo.Length-1)";
Debug.ShouldStop(32);
_olgoo = service_gps._sf.runMethod(true,"_vv0",(Object)(_olgoo),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_olgoo.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Olgoo", _olgoo);
 BA.debugLineNum = 263;BA.debugLine="Olgoo = \"{\" & Olgoo & \"}\" & \",\"";
Debug.ShouldStop(64);
_olgoo = RemoteObject.concat(RemoteObject.createImmutable("{"),_olgoo,RemoteObject.createImmutable("}"),RemoteObject.createImmutable(","));Debug.locals.put("Olgoo", _olgoo);
 BA.debugLineNum = 264;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(128);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 265;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(256);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 266;BA.debugLine="RowOlgoo=Olgoo";
Debug.ShouldStop(512);
_rowolgoo = _olgoo;Debug.locals.put("RowOlgoo", _rowolgoo);
 BA.debugLineNum = 267;BA.debugLine="For j=0 To Cu.ColumnCount-1";
Debug.ShouldStop(1024);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step12 > 0 && _j <= limit12) || (step12 < 0 && _j >= limit12) ;_j = ((int)(0 + _j + step12))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 268;BA.debugLine="If Cu.GetString2(j)<> Null Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _j))))) { 
 BA.debugLineNum = 269;BA.debugLine="RowOlgoo = RowOlgoo.Replace(Cu.GetColumnName(j";
Debug.ShouldStop(4096);
_rowolgoo = _rowolgoo.runMethod(true,"replace",(Object)(RemoteObject.concat(_cu.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _j))),RemoteObject.createImmutable(_j))),(Object)(_cu.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _j)))));Debug.locals.put("RowOlgoo", _rowolgoo);
 };
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 273;BA.debugLine="Str=Str & RowOlgoo";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,_rowolgoo);Debug.locals.put("Str", _str);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 275;BA.debugLine="Str=Sf.Left(Str,Str.Length-1)";
Debug.ShouldStop(262144);
_str = service_gps._sf.runMethod(true,"_vv0",(Object)(_str),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Str", _str);
 BA.debugLineNum = 276;BA.debugLine="Str=\"[\" & Str & \"]\"";
Debug.ShouldStop(524288);
_str = RemoteObject.concat(RemoteObject.createImmutable("["),_str,RemoteObject.createImmutable("]"));Debug.locals.put("Str", _str);
 BA.debugLineNum = 277;BA.debugLine="File.WriteString(File.DirDefaultExternal, \"1.txt\"";
Debug.ShouldStop(1048576);
service_gps.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(service_gps.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("1.txt")),(Object)(_str));
 BA.debugLineNum = 278;BA.debugLine="Return Str";
Debug.ShouldStop(2097152);
if (true) return _str;
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gps1_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("GPS1_LocationChanged (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,199);
if (RapidSub.canDelegate("gps1_locationchanged")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","gps1_locationchanged", _location1);}
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 199;BA.debugLine="Sub GPS1_LocationChanged (Location1 As Location)";
Debug.ShouldStop(64);
 BA.debugLineNum = 201;BA.debugLine="Lat=Location1.Latitude";
Debug.ShouldStop(256);
service_gps._lat = BA.NumberToString(_location1.runMethod(true,"getLatitude"));
 BA.debugLineNum = 202;BA.debugLine="Lon=Location1.Longitude";
Debug.ShouldStop(512);
service_gps._lon = BA.NumberToString(_location1.runMethod(true,"getLongitude"));
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
public static RemoteObject  _interval() throws Exception{
try {
		Debug.PushSubsStack("Interval (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,57);
if (RapidSub.canDelegate("interval")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","interval");}
 BA.debugLineNum = 57;BA.debugLine="Sub Interval As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 60;BA.debugLine="Return MCode.IntervalGps * 60 * 1000";
Debug.ShouldStop(134217728);
if (true) return BA.NumberToString(RemoteObject.solve(new RemoteObject[] {service_gps.mostCurrent._mcode._intervalgps /*RemoteObject*/ ,RemoteObject.createImmutable(60),RemoteObject.createImmutable(1000)}, "**",0, 1));
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
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,178);
if (RapidSub.canDelegate("jobdone")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","jobdone", _job);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 178;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Job.GetRequest.Timeout=50000";
Debug.ShouldStop(262144);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 181;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1048576);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 182;BA.debugLine="Dim Str As String = Job.GetString";
Debug.ShouldStop(2097152);
_str = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 183;BA.debugLine="Select Case Job.JobName";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("SendGps"))) {
case 0: {
 BA.debugLineNum = 185;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 188;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGpsVisitor\")";
Debug.ShouldStop(134217728);
service_gps.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_gps.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGpsVisitor")));
 BA.debugLineNum = 189;BA.debugLine="Log(\"GPS OK\")";
Debug.ShouldStop(268435456);
service_gps.mostCurrent.__c.runVoidMethod ("LogImpl","5119275531",RemoteObject.createImmutable("GPS OK"),0);
 };
 break; }
}
;
 }else {
 };
 BA.debugLineNum = 196;BA.debugLine="jobInternet.Release";
Debug.ShouldStop(8);
service_gps._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
 //BA.debugLineNum = 8;BA.debugLine="Dim GPS1 As GPS";
service_gps._gps1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 10;BA.debugLine="Dim Sf As StringFunctions";
service_gps._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");
 //BA.debugLineNum = 11;BA.debugLine="Dim Imei As PhoneId";
service_gps._imei = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneId");
 //BA.debugLineNum = 12;BA.debugLine="Dim T_Gps,T_StartStopGps As Timer";
service_gps._t_gps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
service_gps._t_startstopgps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 13;BA.debugLine="Dim jobInternet As HttpJob";
service_gps._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");
 //BA.debugLineNum = 14;BA.debugLine="Dim PersianDate As PersianDate";
service_gps._persiandate = RemoteObject.createNew ("anywheresoftware.b4a.student.PersianDate");
 //BA.debugLineNum = 15;BA.debugLine="Dim GetTime,Lat,Lon As String";
service_gps._gettime = RemoteObject.createImmutable("");
service_gps._lat = RemoteObject.createImmutable("");
service_gps._lon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim C_Visitor As String";
service_gps._c_visitor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim th As Thread";
service_gps._th = RemoteObject.createNew ("anywheresoftware.b4a.agraham.threading.Threading");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savelocationtodb() throws Exception{
try {
		Debug.PushSubsStack("SaveLocationToDb (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,143);
if (RapidSub.canDelegate("savelocationtodb")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","savelocationtodb");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _tarikh = RemoteObject.createImmutable("");
RemoteObject _tm = null;
RemoteObject _time = RemoteObject.createImmutable("");
 BA.debugLineNum = 143;BA.debugLine="Sub SaveLocationToDb";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldNoeDat";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_gps.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_gps.processBA,(Object)(RemoteObject.createImmutable("Select FldNoeDate From TblSetting")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 145;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(65536);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 146;BA.debugLine="If Cu.GetString(\"FldNoeDate\") = \"S\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNoeDate"))),BA.ObjectToString("S"))) { 
 BA.debugLineNum = 147;BA.debugLine="Dim Tarikh As String = DatePersian";
Debug.ShouldStop(262144);
_tarikh = _datepersian();Debug.locals.put("Tarikh", _tarikh);Debug.locals.put("Tarikh", _tarikh);
 }else 
{ BA.debugLineNum = 148;BA.debugLine="else if Cu.GetString(\"FldNoeDate\") = \"M\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNoeDate"))),BA.ObjectToString("M"))) { 
 BA.debugLineNum = 149;BA.debugLine="Dim Tarikh As String = DateMiladi";
Debug.ShouldStop(1048576);
_tarikh = _datemiladi();Debug.locals.put("Tarikh", _tarikh);Debug.locals.put("Tarikh", _tarikh);
 }}
;
 BA.debugLineNum = 152;BA.debugLine="Dim Tm() As String";
Debug.ShouldStop(8388608);
_tm = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Tm", _tm);
 BA.debugLineNum = 153;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(16777216);
_time = service_gps.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(service_gps.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 154;BA.debugLine="Tm = Regex.Split(\":\",Time)";
Debug.ShouldStop(33554432);
_tm = service_gps.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_time));Debug.locals.put("Tm", _tm);
 BA.debugLineNum = 155;BA.debugLine="Time=MCode.ConvertNumbersPersian2English(Tm(0)) &";
Debug.ShouldStop(67108864);
_time = RemoteObject.concat(service_gps.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,service_gps.processBA,(Object)(_tm.getArrayElement(true,BA.numberCast(int.class, 0)))),service_gps.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,service_gps.processBA,(Object)(_tm.getArrayElement(true,BA.numberCast(int.class, 1)))));Debug.locals.put("Time", _time);
 BA.debugLineNum = 158;BA.debugLine="Log(Lat)";
Debug.ShouldStop(536870912);
service_gps.mostCurrent.__c.runVoidMethod ("LogImpl","5119144463",service_gps._lat,0);
 BA.debugLineNum = 159;BA.debugLine="Log(Lon)";
Debug.ShouldStop(1073741824);
service_gps.mostCurrent.__c.runVoidMethod ("LogImpl","5119144464",service_gps._lon,0);
 BA.debugLineNum = 160;BA.debugLine="If Lat <> \"\" And Lon <> \"\" And IsNumber(C_Visitor";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",service_gps._lat,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",service_gps._lon,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",service_gps.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(service_gps._c_visitor)),service_gps.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",service_gps.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_tarikh)),service_gps.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",service_gps.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_time)),service_gps.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 161;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGpsVisitor (Fld";
Debug.ShouldStop(1);
service_gps.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_gps.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"),service_gps._c_visitor,RemoteObject.createImmutable("','"),_tarikh,RemoteObject.createImmutable("','"),_time,RemoteObject.createImmutable("','"),service_gps._lat,RemoteObject.createImmutable("','"),service_gps._lon,RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 162;BA.debugLine="GetTime=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(2);
service_gps._gettime = service_gps.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(service_gps.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 };
 BA.debugLineNum = 164;BA.debugLine="Lat=\"\"";
Debug.ShouldStop(8);
service_gps._lat = BA.ObjectToString("");
 BA.debugLineNum = 165;BA.debugLine="Lon=\"\"";
Debug.ShouldStop(16);
service_gps._lon = BA.ObjectToString("");
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendgps(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("SendGps (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,169);
if (RapidSub.canDelegate("sendgps")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","sendgps", _str);}
Debug.locals.put("Str", _str);
 BA.debugLineNum = 169;BA.debugLine="Sub SendGps(Str As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 174;BA.debugLine="jobInternet.JobName =\"SendGps\"";
Debug.ShouldStop(8192);
service_gps._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendGps"));
 BA.debugLineNum = 175;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(16384);
service_gps._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_gps.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveGps"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("JsonDt="),_str,RemoteObject.createImmutable("&Imei="),service_gps.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,22);
if (RapidSub.canDelegate("service_create")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","service_create");}
 BA.debugLineNum = 22;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 38;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 39;BA.debugLine="If	MCode.ServiceGpsActive=1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",service_gps.mostCurrent._mcode._servicegpsactive /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 40;BA.debugLine="GPS1.Initialize(\"GPS1\")";
Debug.ShouldStop(128);
service_gps._gps1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("GPS1")));
 BA.debugLineNum = 41;BA.debugLine="If GPS1.GPSEnabled=True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",service_gps._gps1.runMethod(true,"getGPSEnabled"),service_gps.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 43;BA.debugLine="T_Gps.Initialize(\"T_Gps\",60000)";
Debug.ShouldStop(1024);
service_gps._t_gps.runVoidMethod ("Initialize",service_gps.processBA,(Object)(BA.ObjectToString("T_Gps")),(Object)(BA.numberCast(long.class, 60000)));
 BA.debugLineNum = 44;BA.debugLine="T_StartStopGps.Initialize(\"T_StartStopGps\",Int";
Debug.ShouldStop(2048);
service_gps._t_startstopgps.runVoidMethod ("Initialize",service_gps.processBA,(Object)(BA.ObjectToString("T_StartStopGps")),(Object)(BA.numberCast(long.class, _interval())));
 BA.debugLineNum = 45;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(4096);
service_gps._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,service_gps.processBA,(Object)(BA.ObjectToString("jobInternet")),(Object)(service_gps.getObject()));
 }else {
 BA.debugLineNum = 47;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کن";
Debug.ShouldStop(16384);
service_gps.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید")),(Object)(service_gps.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 48;BA.debugLine="StartActivity(GPS1.LocationSettingsIntent)";
Debug.ShouldStop(32768);
service_gps.mostCurrent.__c.runVoidMethod ("StartActivity",service_gps.processBA,(Object)((service_gps._gps1.runMethod(false,"getLocationSettingsIntent"))));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_gps.processBA, e14.toString()); BA.debugLineNum = 52;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
service_gps.mostCurrent.__c.runVoidMethod ("LogImpl","5118751262",BA.ObjectToString(service_gps.mostCurrent.__c.runMethod(false,"LastException",service_gps.processBA)),0);
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
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,206);
if (RapidSub.canDelegate("service_destroy")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","service_destroy");}
 BA.debugLineNum = 206;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="StartServiceAt(Me, DateTime.Now + 3 * 1000, False";
Debug.ShouldStop(16384);
service_gps.mostCurrent.__c.runVoidMethod ("StartServiceAt",service_gps.processBA,(Object)(service_gps.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {service_gps.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000)}, "+*",1, 2)),(Object)(service_gps.mostCurrent.__c.getField(true,"False")));
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
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,63);
if (RapidSub.canDelegate("service_start")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 63;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="GPS1.Initialize(\"GPS1\")";
Debug.ShouldStop(1);
service_gps._gps1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("GPS1")));
 BA.debugLineNum = 66;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 67;BA.debugLine="If	MCode.ServiceGpsActive=1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",service_gps.mostCurrent._mcode._servicegpsactive /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 68;BA.debugLine="If GPS1.GPSEnabled=True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",service_gps._gps1.runMethod(true,"getGPSEnabled"),service_gps.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 69;BA.debugLine="T_StartStopGps_Tick";
Debug.ShouldStop(16);
_t_startstopgps_tick();
 BA.debugLineNum = 72;BA.debugLine="C_Visitor = MCode.C_Visitor";
Debug.ShouldStop(128);
service_gps._c_visitor = service_gps.mostCurrent._mcode._c_visitor /*RemoteObject*/ ;
 BA.debugLineNum = 74;BA.debugLine="T_StartStopGps.Enabled=True";
Debug.ShouldStop(512);
service_gps._t_startstopgps.runMethod(true,"setEnabled",service_gps.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 75;BA.debugLine="T_Gps.Enabled=True";
Debug.ShouldStop(1024);
service_gps._t_gps.runMethod(true,"setEnabled",service_gps.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 77;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کن";
Debug.ShouldStop(4096);
service_gps.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید")),(Object)(service_gps.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 78;BA.debugLine="StartActivity(GPS1.LocationSettingsIntent)";
Debug.ShouldStop(8192);
service_gps.mostCurrent.__c.runVoidMethod ("StartActivity",service_gps.processBA,(Object)((service_gps._gps1.runMethod(false,"getLocationSettingsIntent"))));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_gps.processBA, e15.toString()); BA.debugLineNum = 82;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
service_gps.mostCurrent.__c.runVoidMethod ("LogImpl","5118882323",BA.ObjectToString(service_gps.mostCurrent.__c.runMethod(false,"LastException",service_gps.processBA)),0);
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
public static RemoteObject  _t_gps_tick() throws Exception{
try {
		Debug.PushSubsStack("T_Gps_Tick (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,130);
if (RapidSub.canDelegate("t_gps_tick")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","t_gps_tick");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 130;BA.debugLine="Sub T_Gps_Tick";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 132;BA.debugLine="SaveLocationToDb";
Debug.ShouldStop(8);
_savelocationtodb();
 BA.debugLineNum = 134;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(32);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_gps.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_gps.processBA,(Object)(RemoteObject.createImmutable("Select * From TblGpsVisitor")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 135;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 136;BA.debugLine="SendGps(DtToJson(Cu))";
Debug.ShouldStop(128);
_sendgps(_dttojson(_cu));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_gps.processBA, e8.toString()); BA.debugLineNum = 139;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
service_gps.mostCurrent.__c.runVoidMethod ("LogImpl","5119078921",BA.ObjectToString(service_gps.mostCurrent.__c.runMethod(false,"LastException",service_gps.processBA)),0);
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
public static RemoteObject  _t_startstopgps_tick() throws Exception{
try {
		Debug.PushSubsStack("T_StartStopGps_Tick (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,99);
if (RapidSub.canDelegate("t_startstopgps_tick")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","t_startstopgps_tick");}
 BA.debugLineNum = 99;BA.debugLine="Sub T_StartStopGps_Tick";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 101;BA.debugLine="If GPS1.GPSEnabled = True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",service_gps._gps1.runMethod(true,"getGPSEnabled"),service_gps.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 103;BA.debugLine="GPS1.Start(0,0)";
Debug.ShouldStop(64);
service_gps._gps1.runVoidMethodAndSync ("Start",service_gps.processBA,(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 }else {
 BA.debugLineNum = 105;BA.debugLine="GPS1.Stop";
Debug.ShouldStop(256);
service_gps._gps1.runVoidMethod ("Stop");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_gps.processBA, e8.toString()); BA.debugLineNum = 108;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
service_gps.mostCurrent.__c.runVoidMethod ("LogImpl","5119013385",BA.ObjectToString(service_gps.mostCurrent.__c.runMethod(false,"LastException",service_gps.processBA)),0);
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
public static RemoteObject  _trd() throws Exception{
try {
		Debug.PushSubsStack("trd (service_gps) ","service_gps",98,service_gps.processBA,service_gps.mostCurrent,88);
if (RapidSub.canDelegate("trd")) { return ir.parsikhesab.pakhsh.service_gps.remoteMe.runUserSub(false, "service_gps","trd");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 88;BA.debugLine="Sub trd";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 91;BA.debugLine="T_StartStopGps_Tick";
Debug.ShouldStop(67108864);
_t_startstopgps_tick();
 BA.debugLineNum = 92;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldC_Visi";
Debug.ShouldStop(134217728);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_gps.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_gps.processBA,(Object)(RemoteObject.createImmutable("Select FldC_Visitor From TblSetting")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 93;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(268435456);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 94;BA.debugLine="C_Visitor = Cu.GetString(\"FldC_Visitor\")";
Debug.ShouldStop(536870912);
service_gps._c_visitor = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor")));
 BA.debugLineNum = 96;BA.debugLine="T_StartStopGps.Enabled=True";
Debug.ShouldStop(-2147483648);
service_gps._t_startstopgps.runMethod(true,"setEnabled",service_gps.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 97;BA.debugLine="T_Gps.Enabled=True";
Debug.ShouldStop(1);
service_gps._t_gps.runMethod(true,"setEnabled",service_gps.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}