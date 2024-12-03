package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class geoservice_subs_0 {


public static RemoteObject  _datemiladi() throws Exception{
try {
		Debug.PushSubsStack("DateMiladi (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,110);
if (RapidSub.canDelegate("datemiladi")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","datemiladi");}
RemoteObject _t = null;
 BA.debugLineNum = 110;BA.debugLine="Sub DateMiladi As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Dim T() As String";
Debug.ShouldStop(16384);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 112;BA.debugLine="T = Regex.Split(\"/\",DateTime.Date(DateTime.Now))";
Debug.ShouldStop(32768);
_t = geoservice.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(geoservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(geoservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 113;BA.debugLine="If T(0).Length=1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 0)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 114;BA.debugLine="T(0)=\"0\"&T(0)";
Debug.ShouldStop(131072);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 116;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 117;BA.debugLine="T(1)=\"0\"&T(0)";
Debug.ShouldStop(1048576);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 119;BA.debugLine="Return T(2)&T(1)&T(0)";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 2)),_t.getArrayElement(true,BA.numberCast(int.class, 1)),_t.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("DateMiladi2 (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,121);
if (RapidSub.canDelegate("datemiladi2")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","datemiladi2");}
RemoteObject _t = null;
 BA.debugLineNum = 121;BA.debugLine="Sub DateMiladi2 As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Dim T() As String";
Debug.ShouldStop(33554432);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 123;BA.debugLine="T = Regex.Split(\"/\",DateTime.Date(DateTime.Now))";
Debug.ShouldStop(67108864);
_t = geoservice.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(geoservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(geoservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 124;BA.debugLine="If T(0).Length=1 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 0)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 125;BA.debugLine="T(0)=\"0\"&T(0)";
Debug.ShouldStop(268435456);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 127;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 128;BA.debugLine="T(1)=\"0\"&T(0)";
Debug.ShouldStop(-2147483648);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 130;BA.debugLine="Return T(2)&T(1)";
Debug.ShouldStop(2);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 2)),_t.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("DatePersian (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,98);
if (RapidSub.canDelegate("datepersian")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","datepersian");}
RemoteObject _t = null;
 BA.debugLineNum = 98;BA.debugLine="Sub DatePersian As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="Dim T() As String";
Debug.ShouldStop(4);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 100;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
Debug.ShouldStop(8);
_t = geoservice.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(geoservice._persiandate.runMethod(true,"getDate",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("/")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 101;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 102;BA.debugLine="T(1)=\"0\"&T(1)";
Debug.ShouldStop(32);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 1))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 104;BA.debugLine="If T(2).Length=1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 2)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 105;BA.debugLine="T(2)=\"0\"&T(2)";
Debug.ShouldStop(256);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 2))),BA.numberCast(int.class, 2));
 };
 BA.debugLineNum = 107;BA.debugLine="Return T(0)&T(1)&T(2)";
Debug.ShouldStop(1024);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 0)),_t.getArrayElement(true,BA.numberCast(int.class, 1)),_t.getArrayElement(true,BA.numberCast(int.class, 2)));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("DatePersian2 (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,87);
if (RapidSub.canDelegate("datepersian2")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","datepersian2");}
RemoteObject _t = null;
 BA.debugLineNum = 87;BA.debugLine="Sub DatePersian2 As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Dim T() As String";
Debug.ShouldStop(8388608);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 89;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
Debug.ShouldStop(16777216);
_t = geoservice.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(geoservice._persiandate.runMethod(true,"getDate",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("/")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 90;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 91;BA.debugLine="T(1)=\"0\"&T(1)";
Debug.ShouldStop(67108864);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 1))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 93;BA.debugLine="If T(2).Length=1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 2)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 94;BA.debugLine="T(2)=\"0\"&T(2)";
Debug.ShouldStop(536870912);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 2))),BA.numberCast(int.class, 2));
 };
 BA.debugLineNum = 96;BA.debugLine="Return T(1)&T(2)";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 1)),_t.getArrayElement(true,BA.numberCast(int.class, 2)));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("DtToJson (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,133);
if (RapidSub.canDelegate("dttojson")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","dttojson", _cu);}
RemoteObject _olgoo = RemoteObject.createImmutable("");
RemoteObject _rowolgoo = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
int _i = 0;
int _j = 0;
Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 133;BA.debugLine="Sub DtToJson(Cu As Cursor) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Dim Olgoo As String";
Debug.ShouldStop(32);
_olgoo = RemoteObject.createImmutable("");Debug.locals.put("Olgoo", _olgoo);
 BA.debugLineNum = 135;BA.debugLine="Dim RowOlgoo As String";
Debug.ShouldStop(64);
_rowolgoo = RemoteObject.createImmutable("");Debug.locals.put("RowOlgoo", _rowolgoo);
 BA.debugLineNum = 136;BA.debugLine="Dim Str As String";
Debug.ShouldStop(128);
_str = RemoteObject.createImmutable("");Debug.locals.put("Str", _str);
 BA.debugLineNum = 137;BA.debugLine="For i=0 To Cu.ColumnCount-1";
Debug.ShouldStop(256);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 138;BA.debugLine="Olgoo=Olgoo & Chr(34) & Cu.GetColumnName(i) & Ch";
Debug.ShouldStop(512);
_olgoo = RemoteObject.concat(_olgoo,geoservice.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),_cu.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),geoservice.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),RemoteObject.createImmutable(":"),geoservice.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),_cu.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(_i),geoservice.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),RemoteObject.createImmutable(","));Debug.locals.put("Olgoo", _olgoo);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 140;BA.debugLine="Olgoo=Sf.Left(Olgoo,Olgoo.Length-1)";
Debug.ShouldStop(2048);
_olgoo = geoservice._sf.runMethod(true,"_vv0",(Object)(_olgoo),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_olgoo.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Olgoo", _olgoo);
 BA.debugLineNum = 141;BA.debugLine="Olgoo = \"{\" & Olgoo & \"}\" & \",\"";
Debug.ShouldStop(4096);
_olgoo = RemoteObject.concat(RemoteObject.createImmutable("{"),_olgoo,RemoteObject.createImmutable("}"),RemoteObject.createImmutable(","));Debug.locals.put("Olgoo", _olgoo);
 BA.debugLineNum = 142;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(8192);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 143;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(16384);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 144;BA.debugLine="RowOlgoo=Olgoo";
Debug.ShouldStop(32768);
_rowolgoo = _olgoo;Debug.locals.put("RowOlgoo", _rowolgoo);
 BA.debugLineNum = 145;BA.debugLine="For j=0 To Cu.ColumnCount-1";
Debug.ShouldStop(65536);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step12 > 0 && _j <= limit12) || (step12 < 0 && _j >= limit12) ;_j = ((int)(0 + _j + step12))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 146;BA.debugLine="If Cu.GetString2(j)<> Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _j))))) { 
 BA.debugLineNum = 147;BA.debugLine="RowOlgoo = RowOlgoo.Replace(Cu.GetColumnName(j";
Debug.ShouldStop(262144);
_rowolgoo = _rowolgoo.runMethod(true,"replace",(Object)(RemoteObject.concat(_cu.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _j))),RemoteObject.createImmutable(_j))),(Object)(_cu.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _j)))));Debug.locals.put("RowOlgoo", _rowolgoo);
 };
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 151;BA.debugLine="Str=Str & RowOlgoo";
Debug.ShouldStop(4194304);
_str = RemoteObject.concat(_str,_rowolgoo);Debug.locals.put("Str", _str);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 153;BA.debugLine="Str=Sf.Left(Str,Str.Length-1)";
Debug.ShouldStop(16777216);
_str = geoservice._sf.runMethod(true,"_vv0",(Object)(_str),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Str", _str);
 BA.debugLineNum = 154;BA.debugLine="Str=\"[\" & Str & \"]\"";
Debug.ShouldStop(33554432);
_str = RemoteObject.concat(RemoteObject.createImmutable("["),_str,RemoteObject.createImmutable("]"));Debug.locals.put("Str", _str);
 BA.debugLineNum = 155;BA.debugLine="File.WriteString(File.DirDefaultExternal, \"1.txt\"";
Debug.ShouldStop(67108864);
geoservice.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(geoservice.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("1.txt")),(Object)(_str));
 BA.debugLineNum = 156;BA.debugLine="Return Str";
Debug.ShouldStop(134217728);
if (true) return _str;
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geolocation_location(RemoteObject _success,RemoteObject _lattitude,RemoteObject _longitude,RemoteObject _info,RemoteObject _ismocklocation) throws Exception{
try {
		Debug.PushSubsStack("GeoLocation_Location (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,20);
if (RapidSub.canDelegate("geolocation_location")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","geolocation_location", _success, _lattitude, _longitude, _info, _ismocklocation);}
Debug.locals.put("success", _success);
Debug.locals.put("Lattitude", _lattitude);
Debug.locals.put("Longitude", _longitude);
Debug.locals.put("info", _info);
Debug.locals.put("isMockLocation", _ismocklocation);
 BA.debugLineNum = 20;BA.debugLine="Sub GeoLocation_Location(success As Boolean, Latti";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Log($\"GeoLocation_Location(${success}, ${Lattitud";
Debug.ShouldStop(1048576);
geoservice.mostCurrent.__c.runVoidMethod ("LogImpl","5117112833",(RemoteObject.concat(RemoteObject.createImmutable("GeoLocation_Location("),geoservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable(", "),geoservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lattitude))),RemoteObject.createImmutable(", "),geoservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_longitude))),RemoteObject.createImmutable(", "),geoservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_info))),RemoteObject.createImmutable(", "),geoservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ismocklocation))),RemoteObject.createImmutable(")"))),0);
 BA.debugLineNum = 22;BA.debugLine="If success Then";
Debug.ShouldStop(2097152);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 24;BA.debugLine="Log(Lattitude)";
Debug.ShouldStop(8388608);
geoservice.mostCurrent.__c.runVoidMethod ("LogImpl","5117112836",BA.NumberToString(_lattitude),0);
 BA.debugLineNum = 25;BA.debugLine="Log(Longitude)";
Debug.ShouldStop(16777216);
geoservice.mostCurrent.__c.runVoidMethod ("LogImpl","5117112837",BA.NumberToString(_longitude),0);
 BA.debugLineNum = 26;BA.debugLine="Lat=Lattitude";
Debug.ShouldStop(33554432);
geoservice._lat = BA.NumberToString(_lattitude);
 BA.debugLineNum = 27;BA.debugLine="Lon=Longitude";
Debug.ShouldStop(67108864);
geoservice._lon = BA.NumberToString(_longitude);
 };
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Interval (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,176);
if (RapidSub.canDelegate("interval")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","interval");}
 BA.debugLineNum = 176;BA.debugLine="Sub Interval As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="Return MCode.IntervalGps * 60 * 1000";
Debug.ShouldStop(65536);
if (true) return BA.NumberToString(RemoteObject.solve(new RemoteObject[] {geoservice.mostCurrent._mcode._intervalgps /*RemoteObject*/ ,RemoteObject.createImmutable(60),RemoteObject.createImmutable(1000)}, "**",0, 1));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("JobDone (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,226);
if (RapidSub.canDelegate("jobdone")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","jobdone", _job);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 226;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="Job.GetRequest.Timeout=50000";
Debug.ShouldStop(4);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 229;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 230;BA.debugLine="Dim Str As String = Job.GetString";
Debug.ShouldStop(32);
_str = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 231;BA.debugLine="Select Case Job.JobName";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("SendGps"))) {
case 0: {
 BA.debugLineNum = 233;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 236;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGpsVisitor\")";
Debug.ShouldStop(2048);
geoservice.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,geoservice.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGpsVisitor")));
 BA.debugLineNum = 237;BA.debugLine="Log(\"GPS OK\")";
Debug.ShouldStop(4096);
geoservice.mostCurrent.__c.runVoidMethod ("LogImpl","5118030347",RemoteObject.createImmutable("GPS OK"),0);
 };
 break; }
}
;
 }else {
 };
 BA.debugLineNum = 244;BA.debugLine="jobInternet.Release";
Debug.ShouldStop(524288);
geoservice._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 8;BA.debugLine="Public GeoLoc As GeoLocator";
geoservice._geoloc = RemoteObject.createNew ("de.donmanfred.GeoLocatorwrapper");
 //BA.debugLineNum = 9;BA.debugLine="Dim GPS1 As GPS";
geoservice._gps1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 10;BA.debugLine="Public PermissionOK As Boolean";
geoservice._permissionok = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 11;BA.debugLine="Dim T_Gps,T_StartStopGps As Timer";
geoservice._t_gps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
geoservice._t_startstopgps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 12;BA.debugLine="Dim GetTime,Lat,Lon As String";
geoservice._gettime = RemoteObject.createImmutable("");
geoservice._lat = RemoteObject.createImmutable("");
geoservice._lon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim jobInternet As HttpJob";
geoservice._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");
 //BA.debugLineNum = 14;BA.debugLine="Dim C_Visitor As String";
geoservice._c_visitor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim PersianDate As PersianDate";
geoservice._persiandate = RemoteObject.createNew ("anywheresoftware.b4a.student.PersianDate");
 //BA.debugLineNum = 16;BA.debugLine="Dim Sf As StringFunctions";
geoservice._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");
 //BA.debugLineNum = 17;BA.debugLine="Private lock As PhoneWakeState";
geoservice._lock = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savelocationtodb() throws Exception{
try {
		Debug.PushSubsStack("SaveLocationToDb (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,193);
if (RapidSub.canDelegate("savelocationtodb")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","savelocationtodb");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _tarikh = RemoteObject.createImmutable("");
RemoteObject _tm = null;
RemoteObject _time = RemoteObject.createImmutable("");
 BA.debugLineNum = 193;BA.debugLine="Sub SaveLocationToDb";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldNoeDat";
Debug.ShouldStop(2);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = geoservice.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,geoservice.processBA,(Object)(RemoteObject.createImmutable("Select FldNoeDate From TblSetting")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 195;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(4);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 196;BA.debugLine="If Cu.GetString(\"FldNoeDate\") = \"S\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNoeDate"))),BA.ObjectToString("S"))) { 
 BA.debugLineNum = 197;BA.debugLine="Dim Tarikh As String = DatePersian";
Debug.ShouldStop(16);
_tarikh = _datepersian();Debug.locals.put("Tarikh", _tarikh);Debug.locals.put("Tarikh", _tarikh);
 }else 
{ BA.debugLineNum = 198;BA.debugLine="else if Cu.GetString(\"FldNoeDate\") = \"M\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNoeDate"))),BA.ObjectToString("M"))) { 
 BA.debugLineNum = 199;BA.debugLine="Dim Tarikh As String = DateMiladi";
Debug.ShouldStop(64);
_tarikh = _datemiladi();Debug.locals.put("Tarikh", _tarikh);Debug.locals.put("Tarikh", _tarikh);
 }}
;
 BA.debugLineNum = 202;BA.debugLine="Dim Tm() As String";
Debug.ShouldStop(512);
_tm = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Tm", _tm);
 BA.debugLineNum = 203;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(1024);
_time = geoservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(geoservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 204;BA.debugLine="Tm = Regex.Split(\":\",Time)";
Debug.ShouldStop(2048);
_tm = geoservice.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_time));Debug.locals.put("Tm", _tm);
 BA.debugLineNum = 205;BA.debugLine="Time=MCode.ConvertNumbersPersian2English(Tm(0)) &";
Debug.ShouldStop(4096);
_time = RemoteObject.concat(geoservice.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,geoservice.processBA,(Object)(_tm.getArrayElement(true,BA.numberCast(int.class, 0)))),geoservice.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,geoservice.processBA,(Object)(_tm.getArrayElement(true,BA.numberCast(int.class, 1)))));Debug.locals.put("Time", _time);
 BA.debugLineNum = 208;BA.debugLine="Log(Lat)";
Debug.ShouldStop(32768);
geoservice.mostCurrent.__c.runVoidMethod ("LogImpl","5117899279",geoservice._lat,0);
 BA.debugLineNum = 209;BA.debugLine="Log(Lon)";
Debug.ShouldStop(65536);
geoservice.mostCurrent.__c.runVoidMethod ("LogImpl","5117899280",geoservice._lon,0);
 BA.debugLineNum = 210;BA.debugLine="If Lat <> \"\" And Lon <> \"\" And IsNumber(MCode.C_V";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",geoservice._lat,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",geoservice._lon,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",geoservice.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(geoservice.mostCurrent._mcode._c_visitor /*RemoteObject*/ )),geoservice.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",geoservice.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_tarikh)),geoservice.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",geoservice.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_time)),geoservice.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 211;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGpsVisitor (Fld";
Debug.ShouldStop(262144);
geoservice.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,geoservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"),geoservice.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_tarikh,RemoteObject.createImmutable("','"),_time,RemoteObject.createImmutable("','"),geoservice._lat,RemoteObject.createImmutable("','"),geoservice._lon,RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 212;BA.debugLine="GetTime=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(524288);
geoservice._gettime = geoservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(geoservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 };
 BA.debugLineNum = 214;BA.debugLine="Lat=\"\"";
Debug.ShouldStop(2097152);
geoservice._lat = BA.ObjectToString("");
 BA.debugLineNum = 215;BA.debugLine="Lon=\"\"";
Debug.ShouldStop(4194304);
geoservice._lon = BA.ObjectToString("");
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("SendGps (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,219);
if (RapidSub.canDelegate("sendgps")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","sendgps", _str);}
Debug.locals.put("Str", _str);
 BA.debugLineNum = 219;BA.debugLine="Sub SendGps(Str As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 220;BA.debugLine="jobInternet.JobName =\"SendGps\"";
Debug.ShouldStop(134217728);
geoservice._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendGps"));
 BA.debugLineNum = 221;BA.debugLine="jobInternet.PostString(\"https://\" & MCode.Url & \"";
Debug.ShouldStop(268435456);
geoservice._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://"),geoservice.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveGps"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("JsonDt="),_str,RemoteObject.createImmutable("&Imei="),geoservice.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Service_Create (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,36);
if (RapidSub.canDelegate("service_create")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","service_create");}
RemoteObject _intervalgps = RemoteObject.createImmutable(0);
 BA.debugLineNum = 36;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 41;BA.debugLine="GeoLoc.Initialize(\"GeoLocation\")";
Debug.ShouldStop(256);
geoservice._geoloc.runVoidMethod ("Initialize",geoservice.processBA,(Object)(RemoteObject.createImmutable("GeoLocation")));
 BA.debugLineNum = 42;BA.debugLine="GPS1.Initialize(\"GPS1\")";
Debug.ShouldStop(512);
geoservice._gps1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("GPS1")));
 BA.debugLineNum = 43;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(1024);
geoservice._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,geoservice.processBA,(Object)(BA.ObjectToString("jobInternet")),(Object)(geoservice.getObject()));
 BA.debugLineNum = 44;BA.debugLine="T_StartStopGps.Initialize(\"T_StartStopGps\",6000)";
Debug.ShouldStop(2048);
geoservice._t_startstopgps.runVoidMethod ("Initialize",geoservice.processBA,(Object)(BA.ObjectToString("T_StartStopGps")),(Object)(BA.numberCast(long.class, 6000)));
 BA.debugLineNum = 45;BA.debugLine="If	MCode.ServiceGpsActive=1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",geoservice.mostCurrent._mcode._servicegpsactive /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 46;BA.debugLine="MCode.UpdateSetting";
Debug.ShouldStop(8192);
geoservice.mostCurrent._mcode.runVoidMethod ("_updatesetting" /*RemoteObject*/ ,geoservice.processBA);
 BA.debugLineNum = 48;BA.debugLine="lock.PartialLock";
Debug.ShouldStop(32768);
geoservice._lock.runVoidMethod ("PartialLock",geoservice.processBA);
 BA.debugLineNum = 49;BA.debugLine="If GPS1.GPSEnabled=True Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",geoservice._gps1.runMethod(true,"getGPSEnabled"),geoservice.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 50;BA.debugLine="T_Gps.Initialize(\"T_Gps\",Interval)";
Debug.ShouldStop(131072);
geoservice._t_gps.runVoidMethod ("Initialize",geoservice.processBA,(Object)(BA.ObjectToString("T_Gps")),(Object)(BA.numberCast(long.class, _interval())));
 BA.debugLineNum = 51;BA.debugLine="Dim intervalGps As Int";
Debug.ShouldStop(262144);
_intervalgps = RemoteObject.createImmutable(0);Debug.locals.put("intervalGps", _intervalgps);
 BA.debugLineNum = 52;BA.debugLine="If Interval>0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _interval()),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 53;BA.debugLine="intervalGps= Interval";
Debug.ShouldStop(1048576);
_intervalgps = BA.numberCast(int.class, _interval());Debug.locals.put("intervalGps", _intervalgps);
 }else {
 BA.debugLineNum = 55;BA.debugLine="intervalGps=6000";
Debug.ShouldStop(4194304);
_intervalgps = BA.numberCast(int.class, 6000);Debug.locals.put("intervalGps", _intervalgps);
 };
 }else {
 BA.debugLineNum = 59;BA.debugLine="If MCode.Gps=1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",geoservice.mostCurrent._mcode._gps /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 60;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال ک";
Debug.ShouldStop(134217728);
geoservice.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید")),(Object)(geoservice.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 61;BA.debugLine="StartActivity(GPS1.LocationSettingsIntent)";
Debug.ShouldStop(268435456);
geoservice.mostCurrent.__c.runVoidMethod ("StartActivity",geoservice.processBA,(Object)((geoservice._gps1.runMethod(false,"getLocationSettingsIntent"))));
 };
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e25) {
			BA.rdebugUtils.runVoidMethod("setLastException",geoservice.processBA, e25.toString()); BA.debugLineNum = 67;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
geoservice.mostCurrent.__c.runVoidMethod ("LogImpl","5117178399",BA.ObjectToString(geoservice.mostCurrent.__c.runMethod(false,"LastException",geoservice.processBA)),0);
 };
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Service_Destroy (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,84);
if (RapidSub.canDelegate("service_destroy")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","service_destroy");}
 BA.debugLineNum = 84;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="StartServiceAt(Me, DateTime.Now + 3 * 1000, False";
Debug.ShouldStop(1048576);
geoservice.mostCurrent.__c.runVoidMethod ("StartServiceAt",geoservice.processBA,(Object)(geoservice.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {geoservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000)}, "+*",1, 2)),(Object)(geoservice.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Service_Start (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,71);
if (RapidSub.canDelegate("service_start")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 71;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="If PermissionOK  Then";
Debug.ShouldStop(128);
if (geoservice._permissionok.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 74;BA.debugLine="StartServiceAt(Me,DateTime.Now + 3000,False)";
Debug.ShouldStop(512);
geoservice.mostCurrent.__c.runVoidMethod ("StartServiceAt",geoservice.processBA,(Object)(geoservice.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {geoservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(3000)}, "+",1, 2)),(Object)(geoservice.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 75;BA.debugLine="T_StartStopGps.Enabled=True";
Debug.ShouldStop(1024);
geoservice._t_startstopgps.runMethod(true,"setEnabled",geoservice.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="T_Gps.Enabled=True";
Debug.ShouldStop(2048);
geoservice._t_gps.runMethod(true,"setEnabled",geoservice.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 79;BA.debugLine="Service.AutomaticForegroundMode=Service.AUTOMATIC";
Debug.ShouldStop(16384);
geoservice.mostCurrent._service.setField ("AutomaticForegroundMode",geoservice.mostCurrent._service.getField(true,"AUTOMATIC_FOREGROUND_ALWAYS"));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("T_Gps_Tick (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,180);
if (RapidSub.canDelegate("t_gps_tick")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","t_gps_tick");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 180;BA.debugLine="Sub T_Gps_Tick";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 182;BA.debugLine="SaveLocationToDb";
Debug.ShouldStop(2097152);
_savelocationtodb();
 BA.debugLineNum = 184;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldVisit";
Debug.ShouldStop(8388608);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = geoservice.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,geoservice.processBA,(Object)(RemoteObject.createImmutable("Select FldVisitor,FldTarikh,FldTime,FldLat,FldLon From TblGpsVisitor")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 185;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 186;BA.debugLine="SendGps(DtToJson(Cu))";
Debug.ShouldStop(33554432);
_sendgps(_dttojson(_cu));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",geoservice.processBA, e8.toString()); BA.debugLineNum = 189;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
geoservice.mostCurrent.__c.runVoidMethod ("LogImpl","5117833737",BA.ObjectToString(geoservice.mostCurrent.__c.runMethod(false,"LastException",geoservice.processBA)),0);
 };
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("T_StartStopGps_Tick (geoservice) ","geoservice",95,geoservice.processBA,geoservice.mostCurrent,160);
if (RapidSub.canDelegate("t_startstopgps_tick")) { return ir.parsikhesab.pakhsh.geoservice.remoteMe.runUserSub(false, "geoservice","t_startstopgps_tick");}
 BA.debugLineNum = 160;BA.debugLine="Sub T_StartStopGps_Tick";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 162;BA.debugLine="If GPS1.GPSEnabled = True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",geoservice._gps1.runMethod(true,"getGPSEnabled"),geoservice.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 163;BA.debugLine="GeoLoc.GetLocation";
Debug.ShouldStop(4);
geoservice._geoloc.runVoidMethod ("GetLocation",geoservice.processBA);
 }else {
 BA.debugLineNum = 165;BA.debugLine="If MCode.Gps=1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",geoservice.mostCurrent._mcode._gps /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 166;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کن";
Debug.ShouldStop(32);
geoservice.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید")),(Object)(geoservice.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 167;BA.debugLine="StartActivity(GPS1.LocationSettingsIntent)";
Debug.ShouldStop(64);
geoservice.mostCurrent.__c.runVoidMethod ("StartActivity",geoservice.processBA,(Object)((geoservice._gps1.runMethod(false,"getLocationSettingsIntent"))));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",geoservice.processBA, e11.toString()); BA.debugLineNum = 172;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
geoservice.mostCurrent.__c.runVoidMethod ("LogImpl","5117702668",BA.ObjectToString(geoservice.mostCurrent.__c.runMethod(false,"LastException",geoservice.processBA)),0);
 };
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}