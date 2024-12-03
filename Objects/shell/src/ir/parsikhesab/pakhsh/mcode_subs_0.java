package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mcode_subs_0 {


public static RemoteObject  _addtosabad(RemoteObject _ba,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("AddToSabad (mcode) ","mcode",3,_ba,mcode.mostCurrent,2717);
if (RapidSub.canDelegate("addtosabad")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","addtosabad", _ba, _item);}
;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 2717;BA.debugLine="Sub AddToSabad( Item  As AdapterListKala)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2718;BA.debugLine="If Item.TedadDarSabadJoz > 0 Or Item.TedadDarSaba";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2720;BA.debugLine="SaveUpdate(\"Insert Into TblSabad (FldCodeKala,fl";
Debug.ShouldStop(-2147483648);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblSabad (FldCodeKala,fldCodeGroup,FldNameKala,FldTedadDarkarton,FldFeeForoosh,fldFeeBadAzTakhfif,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldNameVahed,FldNameVahed2,FldTozihat,FldMablaghMasrafKonande,fldPathPic,FldSumMande,FldEshantion,FldMablaghTakhfif,FldDarsadTakhfif,fldArzeshAfzode,fldDarsadArzeshAfzode) Values ('"),_item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"CodeGroup" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"NameKala" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"TedadDarKarton" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"NameVahed" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"NameVahed2" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"Tozihat" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"FldMablaghMasrafKonande" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldPathPic" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"SumMande" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"FldEshantion" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("')")));
 };
 BA.debugLineNum = 2724;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addzero(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("AddZero (mcode) ","mcode",3,_ba,mcode.mostCurrent,3780);
if (RapidSub.canDelegate("addzero")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","addzero", _ba, _str);}
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 3780;BA.debugLine="Sub AddZero(str As String) As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 3781;BA.debugLine="If IsNumber(str) And str<10 And str>0 And str.Len";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(".",mcode.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_str))) && RemoteObject.solveBoolean("<",BA.numberCast(double.class, _str),BA.numberCast(double.class, 10)) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _str),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_str.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 3782;BA.debugLine="str=\"0\"& str";
Debug.ShouldStop(32);
_str = RemoteObject.concat(RemoteObject.createImmutable("0"),_str);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 3784;BA.debugLine="Return str";
Debug.ShouldStop(128);
if (true) return _str;
 BA.debugLineNum = 3785;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animationclose(RemoteObject _ba,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("AnimationClose (mcode) ","mcode",3,_ba,mcode.mostCurrent,2446);
if (RapidSub.canDelegate("animationclose")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","animationclose", _ba, _view);}
RemoteObject _ani = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
;
Debug.locals.put("View", _view);
 BA.debugLineNum = 2446;BA.debugLine="Sub AnimationClose(View As Object)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2447;BA.debugLine="Dim Ani As Animation";
Debug.ShouldStop(16384);
_ani = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("Ani", _ani);
 BA.debugLineNum = 2448;BA.debugLine="Ani.InitializeScaleCenter(\"\", 1,1,0,0, View)";
Debug.ShouldStop(32768);
_ani.runVoidMethod ("InitializeScaleCenter",_ba,(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)((_view)));
 BA.debugLineNum = 2449;BA.debugLine="Ani.Duration = 300";
Debug.ShouldStop(65536);
_ani.runMethod(true,"setDuration",BA.numberCast(long.class, 300));
 BA.debugLineNum = 2450;BA.debugLine="Ani.Start(View)";
Debug.ShouldStop(131072);
_ani.runVoidMethod ("Start",(Object)((_view)));
 BA.debugLineNum = 2451;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animationopen(RemoteObject _ba,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("AnimationOpen (mcode) ","mcode",3,_ba,mcode.mostCurrent,2439);
if (RapidSub.canDelegate("animationopen")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","animationopen", _ba, _view);}
RemoteObject _ani = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
;
Debug.locals.put("View", _view);
 BA.debugLineNum = 2439;BA.debugLine="Sub AnimationOpen(View As Object)";
Debug.ShouldStop(64);
 BA.debugLineNum = 2440;BA.debugLine="Dim Ani As Animation";
Debug.ShouldStop(128);
_ani = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("Ani", _ani);
 BA.debugLineNum = 2441;BA.debugLine="Ani.InitializeScaleCenter(\"\", 0,0,1,1, View)";
Debug.ShouldStop(256);
_ani.runVoidMethod ("InitializeScaleCenter",_ba,(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)((_view)));
 BA.debugLineNum = 2442;BA.debugLine="Ani.Duration = 300";
Debug.ShouldStop(512);
_ani.runMethod(true,"setDuration",BA.numberCast(long.class, 300));
 BA.debugLineNum = 2443;BA.debugLine="Ani.Start(View)";
Debug.ShouldStop(1024);
_ani.runVoidMethod ("Start",(Object)((_view)));
 BA.debugLineNum = 2444;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calculatedistance(RemoteObject _ba,RemoteObject _lat1,RemoteObject _lon1,RemoteObject _lat2,RemoteObject _lon2) throws Exception{
try {
		Debug.PushSubsStack("CalculateDistance (mcode) ","mcode",3,_ba,mcode.mostCurrent,3805);
if (RapidSub.canDelegate("calculatedistance")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","calculatedistance", _ba, _lat1, _lon1, _lat2, _lon2);}
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.gps.LocationWrapper");
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.gps.LocationWrapper");
RemoteObject _dis = RemoteObject.createImmutable(0L);
;
Debug.locals.put("lat1", _lat1);
Debug.locals.put("lon1", _lon1);
Debug.locals.put("lat2", _lat2);
Debug.locals.put("lon2", _lon2);
 BA.debugLineNum = 3805;BA.debugLine="Sub CalculateDistance(lat1 As String,lon1 As Strin";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 3806;BA.debugLine="Dim p1,p2 As Location";
Debug.ShouldStop(536870912);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.LocationWrapper");Debug.locals.put("p1", _p1);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.gps.LocationWrapper");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 3807;BA.debugLine="p1.Initialize2(lat1,lon1)";
Debug.ShouldStop(1073741824);
_p1.runVoidMethod ("Initialize2",(Object)(_lat1),(Object)(_lon1));
 BA.debugLineNum = 3808;BA.debugLine="p2.Initialize2(lat2,lon2)";
Debug.ShouldStop(-2147483648);
_p2.runVoidMethod ("Initialize2",(Object)(_lat2),(Object)(_lon2));
 BA.debugLineNum = 3809;BA.debugLine="Dim dis As Long=p1.DistanceTo(p2)";
Debug.ShouldStop(1);
_dis = BA.numberCast(long.class, _p1.runMethod(true,"DistanceTo",(Object)((_p2.getObject()))));Debug.locals.put("dis", _dis);Debug.locals.put("dis", _dis);
 BA.debugLineNum = 3810;BA.debugLine="Return dis";
Debug.ShouldStop(2);
if (true) return _dis;
 BA.debugLineNum = 3811;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check_internet(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("check_internet (mcode) ","mcode",3,_ba,mcode.mostCurrent,2705);
if (RapidSub.canDelegate("check_internet")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","check_internet", _ba);}
RemoteObject _ph = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _connected = RemoteObject.createImmutable(false);
;
 BA.debugLineNum = 2705;BA.debugLine="Sub check_internet As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2706;BA.debugLine="Dim ph As Phone";
Debug.ShouldStop(131072);
_ph = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("ph", _ph);
 BA.debugLineNum = 2707;BA.debugLine="Dim connected As Boolean";
Debug.ShouldStop(262144);
_connected = RemoteObject.createImmutable(false);Debug.locals.put("connected", _connected);
 BA.debugLineNum = 2708;BA.debugLine="ph.GetDataState";
Debug.ShouldStop(524288);
_ph.runVoidMethod ("GetDataState");
 BA.debugLineNum = 2709;BA.debugLine="If ph.GetDataState=\"CONNECTED\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_ph.runMethod(true,"GetDataState"),BA.ObjectToString("CONNECTED"))) { 
 BA.debugLineNum = 2710;BA.debugLine="connected=True";
Debug.ShouldStop(2097152);
_connected = mcode.mostCurrent.__c.getField(true,"True");Debug.locals.put("connected", _connected);
 }else 
{ BA.debugLineNum = 2711;BA.debugLine="Else If ph.GetSettings(\"wifi_on\")=1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_ph.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("wifi_on"))),BA.NumberToString(1))) { 
 BA.debugLineNum = 2712;BA.debugLine="connected=False";
Debug.ShouldStop(8388608);
_connected = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("connected", _connected);
 }}
;
 BA.debugLineNum = 2714;BA.debugLine="Return connected";
Debug.ShouldStop(33554432);
if (true) return _connected;
 BA.debugLineNum = 2715;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkblacklist(RemoteObject _ba,RemoteObject _codetafzili) throws Exception{
try {
		Debug.PushSubsStack("CheckBlackList (mcode) ","mcode",3,_ba,mcode.mostCurrent,3521);
if (RapidSub.canDelegate("checkblacklist")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","checkblacklist", _ba, _codetafzili);}
RemoteObject _res = RemoteObject.createImmutable("");
;
Debug.locals.put("CodeTafzili", _codetafzili);
 BA.debugLineNum = 3521;BA.debugLine="Public Sub CheckBlackList(CodeTafzili As String) A";
Debug.ShouldStop(1);
 BA.debugLineNum = 3522;BA.debugLine="Dim res As String=SingleResult(\"Select fldBlackLi";
Debug.ShouldStop(2);
_res = BA.ObjectToString(_singleresult(_ba,RemoteObject.concat(RemoteObject.createImmutable("Select fldBlackList from TblAshkhas where fldCodetafzili="),_codetafzili)));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 3523;BA.debugLine="If res=\"1\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_res,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 3524;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return mcode.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 3526;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) return mcode.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 3528;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkcodekalaeshantion(RemoteObject _ba,RemoteObject _codekalaforoosh,RemoteObject _codekalaeshantion) throws Exception{
try {
		Debug.PushSubsStack("CheckCodeKalaEshantion (mcode) ","mcode",3,_ba,mcode.mostCurrent,3754);
if (RapidSub.canDelegate("checkcodekalaeshantion")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","checkcodekalaeshantion", _ba, _codekalaforoosh, _codekalaeshantion);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
Debug.locals.put("CodeKalaForoosh", _codekalaforoosh);
Debug.locals.put("CodeKalaEshantion", _codekalaeshantion);
 BA.debugLineNum = 3754;BA.debugLine="Sub CheckCodeKalaEshantion(CodeKalaForoosh As Stri";
Debug.ShouldStop(512);
 BA.debugLineNum = 3755;BA.debugLine="Dim cu As Cursor=Result($\"Select * from tblEshant";
Debug.ShouldStop(1024);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,(RemoteObject.concat(RemoteObject.createImmutable("Select * from tblEshantionTabaghati where fldCodeKalaForoosh= "),mcode.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codekalaforoosh))),RemoteObject.createImmutable(" and fldCodeKalaEshantion= "),mcode.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codekalaeshantion))),RemoteObject.createImmutable(""))));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 3756;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3757;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) return mcode.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 3759;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) return mcode.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 3760;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkeshantion(RemoteObject _ba,RemoteObject _codekala) throws Exception{
try {
		Debug.PushSubsStack("CheckEshantion (mcode) ","mcode",3,_ba,mcode.mostCurrent,2964);
if (RapidSub.canDelegate("checkeshantion")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","checkeshantion", _ba, _codekala);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 2964;BA.debugLine="Public Sub CheckEshantion(CodeKala As String) As B";
Debug.ShouldStop(524288);
 BA.debugLineNum = 2965;BA.debugLine="If EshantionTabaghati=1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",mcode._eshantiontabaghati,BA.NumberToString(1))) { 
 BA.debugLineNum = 2966;BA.debugLine="Dim cu As Cursor=Result(\"select * from tblEshanti";
Debug.ShouldStop(2097152);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("select * from tblEshantionTabaghati where fldCodeKalaForoosh="),_codekala));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 2967;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2968;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return mcode.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 2972;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) return mcode.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2973;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkeshantiongroup(RemoteObject _ba,RemoteObject _codegroupkala) throws Exception{
try {
		Debug.PushSubsStack("CheckEshantionGroup (mcode) ","mcode",3,_ba,mcode.mostCurrent,2975);
if (RapidSub.canDelegate("checkeshantiongroup")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","checkeshantiongroup", _ba, _codegroupkala);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
Debug.locals.put("CodeGroupKala", _codegroupkala);
 BA.debugLineNum = 2975;BA.debugLine="Public Sub CheckEshantionGroup(CodeGroupKala As St";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 2976;BA.debugLine="If EshantionGroup=1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",mcode._eshantiongroup,BA.NumberToString(1))) { 
 BA.debugLineNum = 2977;BA.debugLine="Dim cu As Cursor=Result(\"select * from tblEshant";
Debug.ShouldStop(1);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("select * from tblEshantionGroup where fldCodeGroupKala="),_codegroupkala));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 2978;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2979;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return mcode.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 2983;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) return mcode.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2984;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertblobtostring(RemoteObject _ba,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ConvertBlobToString (mcode) ","mcode",3,_ba,mcode.mostCurrent,2881);
if (RapidSub.canDelegate("convertblobtostring")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","convertblobtostring", _ba, _dir, _filename);}
RemoteObject _inputstream1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _outputstream1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _buffer = null;
RemoteObject _strblob = RemoteObject.createImmutable("");
;
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 2881;BA.debugLine="Sub ConvertBlobToString(Dir As String,FileName As";
Debug.ShouldStop(1);
 BA.debugLineNum = 2882;BA.debugLine="If File.Exists(Dir,FileName) = True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dir),(Object)(_filename)),mcode.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2883;BA.debugLine="Dim InputStream1 As InputStream";
Debug.ShouldStop(4);
_inputstream1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("InputStream1", _inputstream1);
 BA.debugLineNum = 2884;BA.debugLine="InputStream1 = File.OpenInput(Dir,FileName)";
Debug.ShouldStop(8);
_inputstream1 = mcode.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename));Debug.locals.put("InputStream1", _inputstream1);
 BA.debugLineNum = 2885;BA.debugLine="Dim OutputStream1 As OutputStream";
Debug.ShouldStop(16);
_outputstream1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("OutputStream1", _outputstream1);
 BA.debugLineNum = 2886;BA.debugLine="OutputStream1.InitializeToBytesArray(1000)";
Debug.ShouldStop(32);
_outputstream1.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 1000)));
 BA.debugLineNum = 2887;BA.debugLine="File.Copy2(InputStream1, OutputStream1)";
Debug.ShouldStop(64);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_inputstream1.getObject())),(Object)((_outputstream1.getObject())));
 BA.debugLineNum = 2888;BA.debugLine="Dim Buffer() As Byte";
Debug.ShouldStop(128);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 2889;BA.debugLine="Buffer = OutputStream1.ToBytesArray";
Debug.ShouldStop(256);
_buffer = _outputstream1.runMethod(false,"ToBytesArray");Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 2890;BA.debugLine="Dim StrBlob As String = Su.EncodeBase64(Buffer)";
Debug.ShouldStop(512);
_strblob = mcode._su.runMethod(true,"EncodeBase64",(Object)(_buffer));Debug.locals.put("StrBlob", _strblob);Debug.locals.put("StrBlob", _strblob);
 BA.debugLineNum = 2891;BA.debugLine="File.Delete(Dir,FileName)";
Debug.ShouldStop(1024);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_dir),(Object)(_filename));
 }else {
 BA.debugLineNum = 2893;BA.debugLine="StrBlob = \"\"";
Debug.ShouldStop(4096);
_strblob = BA.ObjectToString("");Debug.locals.put("StrBlob", _strblob);
 };
 BA.debugLineNum = 2896;BA.debugLine="Return StrBlob";
Debug.ShouldStop(32768);
if (true) return _strblob;
 BA.debugLineNum = 2902;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertipdfimg(RemoteObject _ba,RemoteObject _dirfile,RemoteObject _namefile) throws Exception{
try {
		Debug.PushSubsStack("ConvertiPdfImg (mcode) ","mcode",3,_ba,mcode.mostCurrent,2638);
if (RapidSub.canDelegate("convertipdfimg")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","convertipdfimg", _ba, _dirfile, _namefile);}
RemoteObject _render = RemoteObject.declareNull("de.donmanfred.PDFRendererwrapper");
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
int _i = 0;
;
Debug.locals.put("dirFile", _dirfile);
Debug.locals.put("namefile", _namefile);
 BA.debugLineNum = 2638;BA.debugLine="Sub ConvertiPdfImg(dirFile As String,namefile As S";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2639;BA.debugLine="Dim Render As PDFRenderer";
Debug.ShouldStop(16384);
_render = RemoteObject.createNew ("de.donmanfred.PDFRendererwrapper");Debug.locals.put("Render", _render);
 BA.debugLineNum = 2640;BA.debugLine="Dim img As Bitmap";
Debug.ShouldStop(32768);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 2642;BA.debugLine="Render.Initialize(\"\",dirFile,namefile)";
Debug.ShouldStop(131072);
_render.runVoidMethod ("Initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_dirfile),(Object)(_namefile));
 BA.debugLineNum = 2643;BA.debugLine="For i = 0 To Render.PageCount-1";
Debug.ShouldStop(262144);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_render.runMethod(true,"getPageCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2644;BA.debugLine="img = Render.renderPageforDisplay(i)";
Debug.ShouldStop(524288);
_img = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _render.runMethod(false,"renderPageforDisplay",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("img", _img);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2648;BA.debugLine="Return img";
Debug.ShouldStop(8388608);
if (true) return _img;
 BA.debugLineNum = 2650;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertnumberspersian2english(RemoteObject _ba,RemoteObject _snumber) throws Exception{
try {
		Debug.PushSubsStack("ConvertNumbersPersian2English (mcode) ","mcode",3,_ba,mcode.mostCurrent,2502);
if (RapidSub.canDelegate("convertnumberspersian2english")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","convertnumberspersian2english", _ba, _snumber);}
RemoteObject _pnumbers = null;
RemoteObject _enumbers = null;
RemoteObject _res = RemoteObject.createImmutable("");
int _i = 0;
int _j = 0;
;
Debug.locals.put("sNumber", _snumber);
 BA.debugLineNum = 2502;BA.debugLine="Sub  ConvertNumbersPersian2English(sNumber As Stri";
Debug.ShouldStop(32);
 BA.debugLineNum = 2503;BA.debugLine="Dim PNumbers(10) As String";
Debug.ShouldStop(64);
_pnumbers = RemoteObject.createNewArray ("String", new int[] {10}, new Object[]{});Debug.locals.put("PNumbers", _pnumbers);
 BA.debugLineNum = 2504;BA.debugLine="Dim ENumbers(10) As String";
Debug.ShouldStop(128);
_enumbers = RemoteObject.createNewArray ("String", new int[] {10}, new Object[]{});Debug.locals.put("ENumbers", _enumbers);
 BA.debugLineNum = 2505;BA.debugLine="Dim res As String";
Debug.ShouldStop(256);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 2507;BA.debugLine="PNumbers(0) = \"۰\"";
Debug.ShouldStop(1024);
_pnumbers.setArrayElement (BA.ObjectToString("۰"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2508;BA.debugLine="PNumbers(1) = \"۱\"";
Debug.ShouldStop(2048);
_pnumbers.setArrayElement (BA.ObjectToString("۱"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 2509;BA.debugLine="PNumbers(2) = \"۲\"";
Debug.ShouldStop(4096);
_pnumbers.setArrayElement (BA.ObjectToString("۲"),BA.numberCast(int.class, 2));
 BA.debugLineNum = 2510;BA.debugLine="PNumbers(3) = \"۳\"";
Debug.ShouldStop(8192);
_pnumbers.setArrayElement (BA.ObjectToString("۳"),BA.numberCast(int.class, 3));
 BA.debugLineNum = 2511;BA.debugLine="PNumbers(4) = \"۴\"";
Debug.ShouldStop(16384);
_pnumbers.setArrayElement (BA.ObjectToString("۴"),BA.numberCast(int.class, 4));
 BA.debugLineNum = 2512;BA.debugLine="PNumbers(5) = \"۵\"";
Debug.ShouldStop(32768);
_pnumbers.setArrayElement (BA.ObjectToString("۵"),BA.numberCast(int.class, 5));
 BA.debugLineNum = 2513;BA.debugLine="PNumbers(6) = \"۶\"";
Debug.ShouldStop(65536);
_pnumbers.setArrayElement (BA.ObjectToString("۶"),BA.numberCast(int.class, 6));
 BA.debugLineNum = 2514;BA.debugLine="PNumbers(7) = \"۷\"";
Debug.ShouldStop(131072);
_pnumbers.setArrayElement (BA.ObjectToString("۷"),BA.numberCast(int.class, 7));
 BA.debugLineNum = 2515;BA.debugLine="PNumbers(8) = \"۸\"";
Debug.ShouldStop(262144);
_pnumbers.setArrayElement (BA.ObjectToString("۸"),BA.numberCast(int.class, 8));
 BA.debugLineNum = 2516;BA.debugLine="PNumbers(9) = \"۹\"";
Debug.ShouldStop(524288);
_pnumbers.setArrayElement (BA.ObjectToString("۹"),BA.numberCast(int.class, 9));
 BA.debugLineNum = 2518;BA.debugLine="ENumbers(0) = \"0\"";
Debug.ShouldStop(2097152);
_enumbers.setArrayElement (BA.ObjectToString("0"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2519;BA.debugLine="ENumbers(1) = \"1\"";
Debug.ShouldStop(4194304);
_enumbers.setArrayElement (BA.ObjectToString("1"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 2520;BA.debugLine="ENumbers(2) = \"2\"";
Debug.ShouldStop(8388608);
_enumbers.setArrayElement (BA.ObjectToString("2"),BA.numberCast(int.class, 2));
 BA.debugLineNum = 2521;BA.debugLine="ENumbers(3) = \"3\"";
Debug.ShouldStop(16777216);
_enumbers.setArrayElement (BA.ObjectToString("3"),BA.numberCast(int.class, 3));
 BA.debugLineNum = 2522;BA.debugLine="ENumbers(4) = \"4\"";
Debug.ShouldStop(33554432);
_enumbers.setArrayElement (BA.ObjectToString("4"),BA.numberCast(int.class, 4));
 BA.debugLineNum = 2523;BA.debugLine="ENumbers(5) = \"5\"";
Debug.ShouldStop(67108864);
_enumbers.setArrayElement (BA.ObjectToString("5"),BA.numberCast(int.class, 5));
 BA.debugLineNum = 2524;BA.debugLine="ENumbers(6) = \"6\"";
Debug.ShouldStop(134217728);
_enumbers.setArrayElement (BA.ObjectToString("6"),BA.numberCast(int.class, 6));
 BA.debugLineNum = 2525;BA.debugLine="ENumbers(7) = \"7\"";
Debug.ShouldStop(268435456);
_enumbers.setArrayElement (BA.ObjectToString("7"),BA.numberCast(int.class, 7));
 BA.debugLineNum = 2526;BA.debugLine="ENumbers(8) = \"8\"";
Debug.ShouldStop(536870912);
_enumbers.setArrayElement (BA.ObjectToString("8"),BA.numberCast(int.class, 8));
 BA.debugLineNum = 2527;BA.debugLine="ENumbers(9) = \"9\"";
Debug.ShouldStop(1073741824);
_enumbers.setArrayElement (BA.ObjectToString("9"),BA.numberCast(int.class, 9));
 BA.debugLineNum = 2529;BA.debugLine="For i = 0 To sNumber.Length - 1";
Debug.ShouldStop(1);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_snumber.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2530;BA.debugLine="For j=0 To 9";
Debug.ShouldStop(2);
{
final int step25 = 1;
final int limit25 = 9;
_j = 0 ;
for (;(step25 > 0 && _j <= limit25) || (step25 < 0 && _j >= limit25) ;_j = ((int)(0 + _j + step25))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 2531;BA.debugLine="If sNumber.SubString2(i,i+1) = PNumbers(j) Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_snumber.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _i)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),_pnumbers.getArrayElement(true,BA.numberCast(int.class, _j)))) { 
 BA.debugLineNum = 2532;BA.debugLine="res = res & ENumbers(j)";
Debug.ShouldStop(8);
_res = RemoteObject.concat(_res,_enumbers.getArrayElement(true,BA.numberCast(int.class, _j)));Debug.locals.put("res", _res);
 }else 
{ BA.debugLineNum = 2533;BA.debugLine="Else if sNumber.SubString2(i,i+1) = ENumbers(j)";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_snumber.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _i)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),_enumbers.getArrayElement(true,BA.numberCast(int.class, _j)))) { 
 BA.debugLineNum = 2534;BA.debugLine="res = res & ENumbers(j)";
Debug.ShouldStop(32);
_res = RemoteObject.concat(_res,_enumbers.getArrayElement(true,BA.numberCast(int.class, _j)));Debug.locals.put("res", _res);
 }}
;
 }
}Debug.locals.put("j", _j);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2538;BA.debugLine="Return res";
Debug.ShouldStop(512);
if (true) return _res;
 BA.debugLineNum = 2539;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertnumtotime(RemoteObject _ba,RemoteObject _time) throws Exception{
try {
		Debug.PushSubsStack("ConvertNumToTime (mcode) ","mcode",3,_ba,mcode.mostCurrent,3119);
if (RapidSub.canDelegate("convertnumtotime")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","convertnumtotime", _ba, _time);}
RemoteObject _hh = RemoteObject.createImmutable("");
RemoteObject _mm = RemoteObject.createImmutable("");
;
Debug.locals.put("Time", _time);
 BA.debugLineNum = 3119;BA.debugLine="Sub ConvertNumToTime(Time As String) As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 3122;BA.debugLine="Dim HH As String=Time.SubString2(0,2)";
Debug.ShouldStop(131072);
_hh = _time.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("HH", _hh);Debug.locals.put("HH", _hh);
 BA.debugLineNum = 3123;BA.debugLine="Dim MM As String=Time.SubString2(2,4)";
Debug.ShouldStop(262144);
_mm = _time.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("MM", _mm);Debug.locals.put("MM", _mm);
 BA.debugLineNum = 3124;BA.debugLine="Log(Time.SubString2(0,2))";
Debug.ShouldStop(524288);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516056325",_time.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))),0);
 BA.debugLineNum = 3125;BA.debugLine="Log(Time.SubString2(2,4))";
Debug.ShouldStop(1048576);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516056326",_time.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 4))),0);
 BA.debugLineNum = 3127;BA.debugLine="Return HH & \":\" & MM";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.concat(_hh,RemoteObject.createImmutable(":"),_mm);
 BA.debugLineNum = 3128;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertnumtotime2(RemoteObject _ba,RemoteObject _hh,RemoteObject _mm) throws Exception{
try {
		Debug.PushSubsStack("ConvertNumToTime2 (mcode) ","mcode",3,_ba,mcode.mostCurrent,3129);
if (RapidSub.canDelegate("convertnumtotime2")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","convertnumtotime2", _ba, _hh, _mm);}
;
Debug.locals.put("HH", _hh);
Debug.locals.put("MM", _mm);
 BA.debugLineNum = 3129;BA.debugLine="Sub ConvertNumToTime2(HH As String,MM As String) A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 3136;BA.debugLine="If HH.Length=1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_hh.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 3137;BA.debugLine="HH=\"0\"&HH";
Debug.ShouldStop(1);
_hh = RemoteObject.concat(RemoteObject.createImmutable("0"),_hh);Debug.locals.put("HH", _hh);
 };
 BA.debugLineNum = 3139;BA.debugLine="If MM.Length=1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_mm.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 3140;BA.debugLine="MM=\"0\"&MM";
Debug.ShouldStop(8);
_mm = RemoteObject.concat(RemoteObject.createImmutable("0"),_mm);Debug.locals.put("MM", _mm);
 };
 BA.debugLineNum = 3142;BA.debugLine="Return HH & \":\" & MM";
Debug.ShouldStop(32);
if (true) return RemoteObject.concat(_hh,RemoteObject.createImmutable(":"),_mm);
 BA.debugLineNum = 3143;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertstrtoint(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("ConvertStrToInt (mcode) ","mcode",3,_ba,mcode.mostCurrent,2541);
if (RapidSub.canDelegate("convertstrtoint")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","convertstrtoint", _ba, _str);}
RemoteObject _i = RemoteObject.createImmutable(0);
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 2541;BA.debugLine="Sub ConvertStrToInt(str As String) As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 2542;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8192);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2543;BA.debugLine="i=Sf.Val(str)";
Debug.ShouldStop(16384);
_i = BA.numberCast(int.class, mcode._sf.runMethod(true,"_vvvvv1",(Object)(_str)));Debug.locals.put("i", _i);
 BA.debugLineNum = 2544;BA.debugLine="Return i";
Debug.ShouldStop(32768);
if (true) return _i;
 BA.debugLineNum = 2545;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _converttojson(RemoteObject _ba,RemoteObject _map) throws Exception{
try {
		Debug.PushSubsStack("ConvertToJSON (mcode) ","mcode",3,_ba,mcode.mostCurrent,3813);
if (RapidSub.canDelegate("converttojson")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","converttojson", _ba, _map);}
RemoteObject _jsongen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
;
Debug.locals.put("Map", _map);
 BA.debugLineNum = 3813;BA.debugLine="Sub ConvertToJSON(Map As Map) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 3815;BA.debugLine="Dim JSONGen As JSONGenerator";
Debug.ShouldStop(64);
_jsongen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGen", _jsongen);
 BA.debugLineNum = 3816;BA.debugLine="JSONGen.Initialize(Map)";
Debug.ShouldStop(128);
_jsongen.runVoidMethod ("Initialize",(Object)(_map));
 BA.debugLineNum = 3819;BA.debugLine="Return JSONGen.ToString";
Debug.ShouldStop(1024);
if (true) return _jsongen.runMethod(true,"ToString");
 BA.debugLineNum = 3820;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _countpushsmsnotopen(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CountPushSmsNotOpen (mcode) ","mcode",3,_ba,mcode.mostCurrent,2565);
if (RapidSub.canDelegate("countpushsmsnotopen")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","countpushsmsnotopen", _ba);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
 BA.debugLineNum = 2565;BA.debugLine="public Sub CountPushSmsNotOpen As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 2566;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(32);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 2567;BA.debugLine="cu=Result(\"select Id From TblNotifi where FldStat";
Debug.ShouldStop(64);
_cu = _result(_ba,RemoteObject.createImmutable("select Id From TblNotifi where FldStatus='0'"));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 2568;BA.debugLine="Return	cu.RowCount";
Debug.ShouldStop(128);
if (true) return _cu.runMethod(true,"getRowCount");
 BA.debugLineNum = 2569;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _createbk(RemoteObject _ba,RemoteObject _namefile) throws Exception{
try {
		Debug.PushSubsStack("CreateBK (mcode) ","mcode",3,_ba,mcode.mostCurrent,368);
if (RapidSub.canDelegate("createbk")) { ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","createbk", _ba, _namefile); return;}
ResumableSub_CreateBK rsub = new ResumableSub_CreateBK(null,_ba,_namefile);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateBK extends BA.ResumableSub {
public ResumableSub_CreateBK(ir.parsikhesab.pakhsh.mcode parent,RemoteObject _ba,RemoteObject _namefile) {
this.parent = parent;
this._ba = _ba;
this._namefile = _namefile;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.mcode parent;
RemoteObject _ba;
RemoteObject _namefile;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _backitem = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile");
RemoteObject _str = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateBK (mcode) ","mcode",3,_ba,mcode.mostCurrent,368);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
Debug.locals.put("namefile", _namefile);
 BA.debugLineNum = 369;BA.debugLine="Dim FileName As String";
Debug.ShouldStop(65536);
_filename = RemoteObject.createImmutable("");Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 370;BA.debugLine="Dim Date As String=PersianDateDash(DatePersian)";
Debug.ShouldStop(131072);
_date = _persiandatedash(_ba,_datepersian(_ba));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 371;BA.debugLine="Dim Time As String=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(262144);
_time = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 372;BA.debugLine="If namefile<>\"\" Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_namefile,BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 373;BA.debugLine="FileName=namefile";
Debug.ShouldStop(1048576);
_filename = _namefile;Debug.locals.put("FileName", _filename);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 375;BA.debugLine="FileName=\"bk\"&DateTime.Date(DateTime.Now)&DateTi";
Debug.ShouldStop(4194304);
_filename = RemoteObject.concat(RemoteObject.createImmutable("bk"),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 376;BA.debugLine="FileName=FileName.Replace(\":\",\"\")";
Debug.ShouldStop(8388608);
_filename = _filename.runMethod(true,"replace",(Object)(BA.ObjectToString(":")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 377;BA.debugLine="FileName=FileName.Replace(\"/\",\"\")";
Debug.ShouldStop(16777216);
_filename = _filename.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("FileName", _filename);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 379;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(67108864);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 380;BA.debugLine="Dim backitem As AdapterListBackupFile";
Debug.ShouldStop(134217728);
_backitem = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile");Debug.locals.put("backitem", _backitem);
 BA.debugLineNum = 381;BA.debugLine="backitem.Initialize";
Debug.ShouldStop(268435456);
_backitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 382;BA.debugLine="List1.Initialize";
Debug.ShouldStop(536870912);
_list1.runVoidMethod ("Initialize");
 BA.debugLineNum = 385;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"Parsik/B";
Debug.ShouldStop(1);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("Parsik/Backup"))),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 386;BA.debugLine="File.MakeDir(File.DirDefaultExternal,\"Parsik/Bac";
Debug.ShouldStop(2);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("Parsik/Backup")));
 BA.debugLineNum = 387;BA.debugLine="File.Copy(File.DirAssets,\"backlist.txt\",File.Dir";
Debug.ShouldStop(4);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("backlist.txt")),(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(RemoteObject.createImmutable("backlist.txt")));
 if (true) break;
;
 BA.debugLineNum = 390;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"Parsik/Ba";
Debug.ShouldStop(32);

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("Parsik/Backup/backlist.txt"))),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 391;BA.debugLine="File.Copy(File.DirAssets,\"backlist.txt\",File.Dir";
Debug.ShouldStop(64);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("backlist.txt")),(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(RemoteObject.createImmutable("backlist.txt")));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 393;BA.debugLine="List1 = File.ReadList(File.DirDefaultExternal &\"";
Debug.ShouldStop(256);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(RemoteObject.createImmutable("backlist.txt")));Debug.locals.put("List1", _list1);
 if (true) break;

case 15:
//C
this.state = -1;
;
 BA.debugLineNum = 397;BA.debugLine="backitem.FileName=FileName";
Debug.ShouldStop(4096);
_backitem.setField ("FileName" /*RemoteObject*/ ,_filename);
 BA.debugLineNum = 398;BA.debugLine="backitem.Date=PersianDateDash(DatePersian)";
Debug.ShouldStop(8192);
_backitem.setField ("Date" /*RemoteObject*/ ,_persiandatedash(_ba,_datepersian(_ba)));
 BA.debugLineNum = 399;BA.debugLine="backitem.Time=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(16384);
_backitem.setField ("Time" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 401;BA.debugLine="Dim str As String=FileName&\",\"& Date &\",\"& Time";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_filename,RemoteObject.createImmutable(","),_date,RemoteObject.createImmutable(","),_time);Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 405;BA.debugLine="List1.Add(str)";
Debug.ShouldStop(1048576);
_list1.runVoidMethod ("Add",(Object)((_str)));
 BA.debugLineNum = 410;BA.debugLine="File.WriteList(File.DirDefaultExternal &\"/Parsik/";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(BA.ObjectToString("backlist.txt")),(Object)(_list1));
 BA.debugLineNum = 413;BA.debugLine="File.Copy(File.DirDefaultExternal &\"/Parsik\",\"par";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(BA.ObjectToString("parsik_db.db")),(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(RemoteObject.concat(_filename,RemoteObject.createImmutable(".db"))));
 BA.debugLineNum = 414;BA.debugLine="Sleep(200)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mcode", "createbk"),BA.numberCast(int.class, 200));
this.state = 16;
return;
case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 417;BA.debugLine="End Sub";
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
public static RemoteObject  _createreportfaktor(RemoteObject _ba,RemoteObject _faktor) throws Exception{
try {
		Debug.PushSubsStack("CreateReportFaktor (mcode) ","mcode",3,_ba,mcode.mostCurrent,2726);
if (RapidSub.canDelegate("createreportfaktor")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","createreportfaktor", _ba, _faktor);}
ResumableSub_CreateReportFaktor rsub = new ResumableSub_CreateReportFaktor(null,_ba,_faktor);
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
public static class ResumableSub_CreateReportFaktor extends BA.ResumableSub {
public ResumableSub_CreateReportFaktor(ir.parsikhesab.pakhsh.mcode parent,RemoteObject _ba,RemoteObject _faktor) {
this.parent = parent;
this._ba = _ba;
this._faktor = _faktor;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.mcode parent;
RemoteObject _ba;
RemoteObject _faktor;
RemoteObject _tfaktor = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._finalfaktor_");
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _cutasview = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _takhfif = RemoteObject.createImmutable("");
RemoteObject _cu2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _takhfifvizhe = RemoteObject.createImmutable("");
RemoteObject _cu3 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sood = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateReportFaktor (mcode) ","mcode",3,_ba,mcode.mostCurrent,2726);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
;
Debug.locals.put("Faktor", _faktor);
 BA.debugLineNum = 2727;BA.debugLine="Dim Tfaktor As FinalFaktor_";
Debug.ShouldStop(64);
_tfaktor = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._finalfaktor_");Debug.locals.put("Tfaktor", _tfaktor);
 BA.debugLineNum = 2728;BA.debugLine="Tfaktor.date=Faktor.fldDate";
Debug.ShouldStop(128);
_tfaktor.setField ("date" /*RemoteObject*/ ,_faktor.getField(true,"fldDate" /*RemoteObject*/ ));
 BA.debugLineNum = 2731;BA.debugLine="Dim Cu1 As Cursor = Result(\"Select * From TblAshk";
Debug.ShouldStop(1024);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldC_Ashkhas = '"),_faktor.getField(true,"fldC_Ashkhas" /*RemoteObject*/ ),RemoteObject.createImmutable("'")));Debug.locals.put("Cu1", _cu1);Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 2732;BA.debugLine="If Cu1.RowCount>0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2733;BA.debugLine="Cu1.Position=0";
Debug.ShouldStop(4096);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2734;BA.debugLine="Tfaktor.Customername=Cu1.GetString(\"FldN_Ashkhas";
Debug.ShouldStop(8192);
_tfaktor.setField ("Customername" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Ashkhas"))));
 BA.debugLineNum = 2735;BA.debugLine="Tfaktor.Mantaghe = Cu1.GetString(\"FldN_City\")";
Debug.ShouldStop(16384);
_tfaktor.setField ("Mantaghe" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_City"))));
 BA.debugLineNum = 2736;BA.debugLine="Tfaktor.Address = Cu1.GetString(\"FldAddress\")";
Debug.ShouldStop(32768);
_tfaktor.setField ("Address" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAddress"))));
 BA.debugLineNum = 2737;BA.debugLine="Tfaktor.Tel = Cu1.GetString(\"FldTell\") & \" | \" &";
Debug.ShouldStop(65536);
_tfaktor.setField ("Tel" /*RemoteObject*/ ,RemoteObject.concat(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTell"))),RemoteObject.createImmutable(" | "),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMob")))));
 BA.debugLineNum = 2738;BA.debugLine="If IsNumber(Cu1.GetString(\"FldMandeHesab\")) Then";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMandeHesab"))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 2739;BA.debugLine="Tfaktor.MandeHesab = myCode.Is_int( Cu1.GetStri";
Debug.ShouldStop(262144);
_tfaktor.setField ("MandeHesab" /*RemoteObject*/ ,BA.NumberToString(parent.mostCurrent._mycode.runMethod(true,"_is_int" /*RemoteObject*/ ,_ba,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMandeHesab")))))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2741;BA.debugLine="Tfaktor.MandeHesab = 0";
Debug.ShouldStop(1048576);
_tfaktor.setField ("MandeHesab" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2744;BA.debugLine="Tfaktor.Customername=\"مشتری جدید\"";
Debug.ShouldStop(8388608);
_tfaktor.setField ("Customername" /*RemoteObject*/ ,BA.ObjectToString("مشتری جدید"));
 BA.debugLineNum = 2745;BA.debugLine="Tfaktor.Mantaghe = \"\"";
Debug.ShouldStop(16777216);
_tfaktor.setField ("Mantaghe" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 2746;BA.debugLine="Tfaktor.Address = \"\"";
Debug.ShouldStop(33554432);
_tfaktor.setField ("Address" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 2747;BA.debugLine="Tfaktor.Tel = \"\"";
Debug.ShouldStop(67108864);
_tfaktor.setField ("Tel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 2748;BA.debugLine="Tfaktor.MandeHesab = 0";
Debug.ShouldStop(134217728);
_tfaktor.setField ("MandeHesab" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 2753;BA.debugLine="Dim CuTasview As Cursor = Result(\"Select * From T";
Debug.ShouldStop(1);
_cutasview = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cutasview = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("Select * From TblNoeTasvie Where FldC_Tasvie = '"),_faktor.getField(true,"fldC_Tasvie" /*RemoteObject*/ ),RemoteObject.createImmutable("'")));Debug.locals.put("CuTasview", _cutasview);Debug.locals.put("CuTasview", _cutasview);
 BA.debugLineNum = 2754;BA.debugLine="Sleep(0)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mcode", "createreportfaktor"),BA.numberCast(int.class, 0));
this.state = 25;
return;
case 25:
//C
this.state = 13;
;
 BA.debugLineNum = 2755;BA.debugLine="CuTasview.Position=0";
Debug.ShouldStop(4);
_cutasview.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2756;BA.debugLine="Tfaktor.TasvieType = CuTasview.GetString(\"FldN_Ta";
Debug.ShouldStop(8);
_tfaktor.setField ("TasvieType" /*RemoteObject*/ ,_cutasview.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Tasvie"))));
 BA.debugLineNum = 2759;BA.debugLine="Tfaktor.KhamFaktor   = Faktor.fldTotalFaktor + Fa";
Debug.ShouldStop(64);
_tfaktor.setField ("KhamFaktor" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _faktor.getField(true,"fldTotalFaktor" /*RemoteObject*/ )),BA.numberCast(double.class, _faktor.getField(true,"FldTakhfifVizhe" /*RemoteObject*/ )),BA.numberCast(double.class, _faktor.getField(true,"FldTakhfifKala" /*RemoteObject*/ ))}, "++",2, 0)));
 BA.debugLineNum = 2761;BA.debugLine="Dim Takhfif As String";
Debug.ShouldStop(256);
_takhfif = RemoteObject.createImmutable("");Debug.locals.put("Takhfif", _takhfif);
 BA.debugLineNum = 2762;BA.debugLine="Dim Cu2 As Cursor= Result(\"SELECT Sum((FldFeeForo";
Debug.ShouldStop(512);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = _result(_ba,RemoteObject.createImmutable("SELECT Sum((FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as SumTakhfif FROM TblSabad Where Cast(fldFeeBadAzTakhfif AS Int) > 0 "));Debug.locals.put("Cu2", _cu2);Debug.locals.put("Cu2", _cu2);
 BA.debugLineNum = 2763;BA.debugLine="Cu2.Position = 0";
Debug.ShouldStop(1024);
_cu2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2764;BA.debugLine="If Cu2.GetString(\"SumTakhfif\") <> Null Then";
Debug.ShouldStop(2048);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("N",_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumTakhfif"))))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 2765;BA.debugLine="Takhfif = Cu2.GetString(\"SumTakhfif\")";
Debug.ShouldStop(4096);
_takhfif = _cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumTakhfif")));Debug.locals.put("Takhfif", _takhfif);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2767;BA.debugLine="Takhfif = 0";
Debug.ShouldStop(16384);
_takhfif = BA.NumberToString(0);Debug.locals.put("Takhfif", _takhfif);
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 2769;BA.debugLine="Tfaktor.TakhfifKala = Takhfif";
Debug.ShouldStop(65536);
_tfaktor.setField ("TakhfifKala" /*RemoteObject*/ ,_takhfif);
 BA.debugLineNum = 2770;BA.debugLine="Log(\"تخفیف کالا : \" & Takhfif)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","515073324",RemoteObject.concat(RemoteObject.createImmutable("تخفیف کالا : "),_takhfif),0);
 BA.debugLineNum = 2772;BA.debugLine="Dim TakhfifVizhe As String";
Debug.ShouldStop(524288);
_takhfifvizhe = RemoteObject.createImmutable("");Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 BA.debugLineNum = 2773;BA.debugLine="Dim Cu3 As Cursor= Result(\"SELECT Sum((FldMablagh";
Debug.ShouldStop(1048576);
_cu3 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu3 = _result(_ba,RemoteObject.createImmutable("SELECT Sum((FldMablaghTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz))  as SumTakhfifVizhe FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) > 0 "));Debug.locals.put("Cu3", _cu3);Debug.locals.put("Cu3", _cu3);
 BA.debugLineNum = 2774;BA.debugLine="Cu3.Position = 0";
Debug.ShouldStop(2097152);
_cu3.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2775;BA.debugLine="If Cu3.GetString(\"SumTakhfifVizhe\") <> Null Then";
Debug.ShouldStop(4194304);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("N",_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumTakhfifVizhe"))))) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 2776;BA.debugLine="TakhfifVizhe = Cu3.GetString(\"SumTakhfifVizhe\")";
Debug.ShouldStop(8388608);
_takhfifvizhe = _cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumTakhfifVizhe")));Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 2778;BA.debugLine="TakhfifVizhe = 0";
Debug.ShouldStop(33554432);
_takhfifvizhe = BA.NumberToString(0);Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 2780;BA.debugLine="Tfaktor.TakhfifVizhe = TakhfifVizhe";
Debug.ShouldStop(134217728);
_tfaktor.setField ("TakhfifVizhe" /*RemoteObject*/ ,_takhfifvizhe);
 BA.debugLineNum = 2781;BA.debugLine="Log(\"تخفیف ویژه : \" & TakhfifVizhe)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","515073335",RemoteObject.concat(RemoteObject.createImmutable("تخفیف ویژه : "),_takhfifvizhe),0);
 BA.debugLineNum = 2787;BA.debugLine="Log(\"تخفیف ویژه : \" & Tfaktor.TakhfifVizhe)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","515073341",RemoteObject.concat(RemoteObject.createImmutable("تخفیف ویژه : "),_tfaktor.getField(true,"TakhfifVizhe" /*RemoteObject*/ )),0);
 BA.debugLineNum = 2790;BA.debugLine="Tfaktor.GablePardakht = Tfaktor.KhamFaktor - Tfak";
Debug.ShouldStop(32);
_tfaktor.setField ("GablePardakht" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tfaktor.getField(true,"KhamFaktor" /*RemoteObject*/ )),BA.numberCast(double.class, _tfaktor.getField(true,"TakhfifKala" /*RemoteObject*/ )),BA.numberCast(double.class, _tfaktor.getField(true,"TakhfifVizhe" /*RemoteObject*/ ))}, "--",2, 0)));
 BA.debugLineNum = 2792;BA.debugLine="Dim Sood As Long = (Tfaktor.GablePardakht)*(Darsa";
Debug.ShouldStop(128);
_sood = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, (_tfaktor.getField(true,"GablePardakht" /*RemoteObject*/ ))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent._darsadsood),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0));Debug.locals.put("Sood", _sood);Debug.locals.put("Sood", _sood);
 BA.debugLineNum = 2793;BA.debugLine="Log(\"سود ویزیتور : \" & Sood)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","515073347",RemoteObject.concat(RemoteObject.createImmutable("سود ویزیتور : "),_sood),0);
 BA.debugLineNum = 2794;BA.debugLine="Tfaktor.SoodVisitor = Sood";
Debug.ShouldStop(512);
_tfaktor.setField ("SoodVisitor" /*RemoteObject*/ ,BA.NumberToString(_sood));
 BA.debugLineNum = 2795;BA.debugLine="Return Tfaktor";
Debug.ShouldStop(1024);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_tfaktor));return;};
 BA.debugLineNum = 2796;BA.debugLine="End Sub";
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
public static RemoteObject  _createreportsabad(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CreateReportSabad (mcode) ","mcode",3,_ba,mcode.mostCurrent,2798);
if (RapidSub.canDelegate("createreportsabad")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","createreportsabad", _ba);}
RemoteObject _tfaktor = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._finalfaktor_");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _rowcount = RemoteObject.createImmutable(0);
RemoteObject _mablagh = RemoteObject.createImmutable(0L);
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _mablaghkolfaktor = RemoteObject.createImmutable(0L);
int _i = 0;
RemoteObject _takhfif = RemoteObject.createImmutable("");
RemoteObject _takhfifvizhe = RemoteObject.createImmutable("");
RemoteObject _mablagharzeshafzode = RemoteObject.createImmutable(0L);
;
 BA.debugLineNum = 2798;BA.debugLine="Sub CreateReportSabad";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2799;BA.debugLine="Dim Tfaktor As FinalFaktor_";
Debug.ShouldStop(16384);
_tfaktor = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._finalfaktor_");Debug.locals.put("Tfaktor", _tfaktor);
 BA.debugLineNum = 2800;BA.debugLine="Dim Cu As Cursor = Result(\"Select * From TblSabad";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.createImmutable("Select * From TblSabad"));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 2801;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(65536);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2802;BA.debugLine="If Cu.RowCount=0 Then Return";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 2804;BA.debugLine="Dim RowCount As Int=Cu.RowCount";
Debug.ShouldStop(524288);
_rowcount = _cu.runMethod(true,"getRowCount");Debug.locals.put("RowCount", _rowcount);Debug.locals.put("RowCount", _rowcount);
 BA.debugLineNum = 2805;BA.debugLine="Dim Mablagh As Long";
Debug.ShouldStop(1048576);
_mablagh = RemoteObject.createImmutable(0L);Debug.locals.put("Mablagh", _mablagh);
 BA.debugLineNum = 2806;BA.debugLine="Dim tedadKol As String";
Debug.ShouldStop(2097152);
_tedadkol = RemoteObject.createImmutable("");Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 2807;BA.debugLine="Log(Cu.GetString(\"FldFeeForoosh\"))";
Debug.ShouldStop(4194304);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","515138825",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFeeForoosh"))),0);
 BA.debugLineNum = 2808;BA.debugLine="Log(Cu.GetString(\"FldMablaghTakhfif\"))";
Debug.ShouldStop(8388608);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","515138826",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif"))),0);
 BA.debugLineNum = 2809;BA.debugLine="Log(Cu.GetString(\"FldDarsadTakhfif\"))";
Debug.ShouldStop(16777216);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","515138827",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif"))),0);
 BA.debugLineNum = 2810;BA.debugLine="Log(Cu.GetString(\"FldEshantion\"))";
Debug.ShouldStop(33554432);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","515138828",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion"))),0);
 BA.debugLineNum = 2812;BA.debugLine="Dim MablaghKolFaktor As Long = 0";
Debug.ShouldStop(134217728);
_mablaghkolfaktor = BA.numberCast(long.class, 0);Debug.locals.put("MablaghKolFaktor", _mablaghkolfaktor);Debug.locals.put("MablaghKolFaktor", _mablaghkolfaktor);
 BA.debugLineNum = 2815;BA.debugLine="For i=0 To RowCount -1";
Debug.ShouldStop(1073741824);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_rowcount,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2816;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(-2147483648);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 2817;BA.debugLine="Mablagh = Cu.GetString(\"FldFeeForoosh\") * (Cu.Ge";
Debug.ShouldStop(1);
_mablagh = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFeeForoosh")))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz")))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol")))),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarKarton"))))}, "*",0, 0))}, "+",1, 0))}, "*",0, 0));Debug.locals.put("Mablagh", _mablagh);
 BA.debugLineNum = 2819;BA.debugLine="tedadKol=(Cu.GetString(\"FldTedadDarSabadJoz\")+(C";
Debug.ShouldStop(4);
_tedadkol = BA.NumberToString((RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz")))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol")))),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarKarton"))))}, "*",0, 0))}, "+",1, 0)));Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 2820;BA.debugLine="MablaghKolFaktor = MablaghKolFaktor + Mablagh";
Debug.ShouldStop(8);
_mablaghkolfaktor = RemoteObject.solve(new RemoteObject[] {_mablaghkolfaktor,_mablagh}, "+",1, 2);Debug.locals.put("MablaghKolFaktor", _mablaghkolfaktor);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2824;BA.debugLine="Tfaktor.KhamFaktor   = MablaghKolFaktor";
Debug.ShouldStop(128);
_tfaktor.setField ("KhamFaktor" /*RemoteObject*/ ,BA.NumberToString(_mablaghkolfaktor));
 BA.debugLineNum = 2825;BA.debugLine="Tfaktor.date=\"\"";
Debug.ShouldStop(256);
_tfaktor.setField ("date" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 2827;BA.debugLine="Dim Takhfif As String";
Debug.ShouldStop(1024);
_takhfif = RemoteObject.createImmutable("");Debug.locals.put("Takhfif", _takhfif);
 BA.debugLineNum = 2828;BA.debugLine="Takhfif= SingleResult(\"SELECT Sum((FldFeeForoosh";
Debug.ShouldStop(2048);
_takhfif = BA.ObjectToString(_singleresult(_ba,RemoteObject.createImmutable("SELECT Sum((FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as TakhfifKala FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) = 0 and  Cast(fldFeeBadAzTakhfif AS Int) > 0 ")));Debug.locals.put("Takhfif", _takhfif);
 BA.debugLineNum = 2829;BA.debugLine="Takhfif= myCode.Is_Null_adad(Takhfif)";
Debug.ShouldStop(4096);
_takhfif = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_takhfif));Debug.locals.put("Takhfif", _takhfif);
 BA.debugLineNum = 2830;BA.debugLine="Tfaktor.TakhfifKala = Takhfif";
Debug.ShouldStop(8192);
_tfaktor.setField ("TakhfifKala" /*RemoteObject*/ ,_takhfif);
 BA.debugLineNum = 2831;BA.debugLine="Log(\"تخفیف کالا : \" & Takhfif)";
Debug.ShouldStop(16384);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","515138849",RemoteObject.concat(RemoteObject.createImmutable("تخفیف کالا : "),_takhfif),0);
 BA.debugLineNum = 2833;BA.debugLine="Dim TakhfifVizhe As String";
Debug.ShouldStop(65536);
_takhfifvizhe = RemoteObject.createImmutable("");Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 BA.debugLineNum = 2835;BA.debugLine="TakhfifVizhe= SingleResult(\"SELECT Sum((FldMablag";
Debug.ShouldStop(262144);
_takhfifvizhe = BA.ObjectToString(_singleresult(_ba,RemoteObject.createImmutable("SELECT Sum((FldMablaghTakhfif)) as SumTakhfifVizhe FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) > 0   ")));Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 BA.debugLineNum = 2837;BA.debugLine="TakhfifVizhe= myCode.Is_Null_adad(TakhfifVizhe)";
Debug.ShouldStop(1048576);
_takhfifvizhe = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_takhfifvizhe));Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 BA.debugLineNum = 2839;BA.debugLine="Tfaktor.TakhfifVizhe = TakhfifVizhe";
Debug.ShouldStop(4194304);
_tfaktor.setField ("TakhfifVizhe" /*RemoteObject*/ ,_takhfifvizhe);
 BA.debugLineNum = 2840;BA.debugLine="Log(\"تخفیف ویژه : \" & TakhfifVizhe)";
Debug.ShouldStop(8388608);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","515138858",RemoteObject.concat(RemoteObject.createImmutable("تخفیف ویژه : "),_takhfifvizhe),0);
 BA.debugLineNum = 2842;BA.debugLine="Tfaktor.TakhfifKol=Takhfif+TakhfifVizhe";
Debug.ShouldStop(33554432);
_tfaktor.setField ("TakhfifKol" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _takhfif),BA.numberCast(double.class, _takhfifvizhe)}, "+",1, 0)));
 BA.debugLineNum = 2846;BA.debugLine="Tfaktor.GablePardakht = MablaghKolFaktor - Tfakto";
Debug.ShouldStop(536870912);
_tfaktor.setField ("GablePardakht" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_mablaghkolfaktor,BA.numberCast(double.class, _tfaktor.getField(true,"TakhfifKol" /*RemoteObject*/ ))}, "-",1, 0)));
 BA.debugLineNum = 2847;BA.debugLine="If Tfaktor.TakhfifKol>0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tfaktor.getField(true,"TakhfifKol" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2848;BA.debugLine="Tfaktor.SumKolBadazTahkfif=Tfaktor.GablePardakht";
Debug.ShouldStop(-2147483648);
_tfaktor.setField ("SumKolBadazTahkfif" /*RemoteObject*/ ,_tfaktor.getField(true,"GablePardakht" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 2850;BA.debugLine="Tfaktor.SumKolBadazTahkfif=0";
Debug.ShouldStop(2);
_tfaktor.setField ("SumKolBadazTahkfif" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 BA.debugLineNum = 2852;BA.debugLine="Dim MablaghArzeshAfzode As Long = 0";
Debug.ShouldStop(8);
_mablagharzeshafzode = BA.numberCast(long.class, 0);Debug.locals.put("MablaghArzeshAfzode", _mablagharzeshafzode);Debug.locals.put("MablaghArzeshAfzode", _mablagharzeshafzode);
 BA.debugLineNum = 2853;BA.debugLine="If ArzeshAfzodeEnable=1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",mcode._arzeshafzodeenable,BA.NumberToString(1))) { 
 BA.debugLineNum = 2855;BA.debugLine="MablaghArzeshAfzode = SingleResult(\"SELECT Sum(";
Debug.ShouldStop(64);
_mablagharzeshafzode = BA.numberCast(long.class, _singleresult(_ba,RemoteObject.createImmutable("SELECT Sum((fldArzeshAfzode)) FROM TblSabad ")));Debug.locals.put("MablaghArzeshAfzode", _mablagharzeshafzode);
 BA.debugLineNum = 2856;BA.debugLine="Tfaktor.fldArzeshAfzode=MablaghArzeshAfzode";
Debug.ShouldStop(128);
_tfaktor.setField ("fldArzeshAfzode" /*RemoteObject*/ ,BA.NumberToString(_mablagharzeshafzode));
 BA.debugLineNum = 2857;BA.debugLine="Tfaktor.GablePardakht=Tfaktor.GablePardakht+Mabl";
Debug.ShouldStop(256);
_tfaktor.setField ("GablePardakht" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tfaktor.getField(true,"GablePardakht" /*RemoteObject*/ )),_mablagharzeshafzode}, "+",1, 0)));
 }else {
 BA.debugLineNum = 2868;BA.debugLine="Tfaktor.fldArzeshAfzode=0";
Debug.ShouldStop(524288);
_tfaktor.setField ("fldArzeshAfzode" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 2869;BA.debugLine="SaveUpdate($\"Update TblSabad Set fldArzeshAfzode";
Debug.ShouldStop(1048576);
_saveupdate(_ba,(RemoteObject.createImmutable("Update TblSabad Set fldArzeshAfzode='0',fldDarsadArzeshAfzode='0'")));
 };
 BA.debugLineNum = 2878;BA.debugLine="FinalFaktor=Tfaktor";
Debug.ShouldStop(536870912);
mcode._finalfaktor = _tfaktor;
 BA.debugLineNum = 2879;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datemiladi(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("DateMiladi (mcode) ","mcode",3,_ba,mcode.mostCurrent,2490);
if (RapidSub.canDelegate("datemiladi")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","datemiladi", _ba);}
RemoteObject _t = null;
;
 BA.debugLineNum = 2490;BA.debugLine="Sub DateMiladi As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 2491;BA.debugLine="Dim T() As String";
Debug.ShouldStop(67108864);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 2492;BA.debugLine="T = Regex.Split(\"/\",DateTime.Date(DateTime.Now))";
Debug.ShouldStop(134217728);
_t = mcode.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(mcode.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(mcode.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 2493;BA.debugLine="If T(0).Length=1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 0)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2494;BA.debugLine="T(0)=\"0\"&T(0)";
Debug.ShouldStop(536870912);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 2496;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2497;BA.debugLine="T(1)=\"0\"&T(0)";
Debug.ShouldStop(1);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 0))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 2499;BA.debugLine="Return T(2)&T(1)&T(0)";
Debug.ShouldStop(4);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 2)),_t.getArrayElement(true,BA.numberCast(int.class, 1)),_t.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 2500;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datepersian(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("DatePersian (mcode) ","mcode",3,_ba,mcode.mostCurrent,2453);
if (RapidSub.canDelegate("datepersian")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","datepersian", _ba);}
RemoteObject _t = null;
;
 BA.debugLineNum = 2453;BA.debugLine="Sub DatePersian As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2454;BA.debugLine="Dim T() As String";
Debug.ShouldStop(2097152);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 2455;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
Debug.ShouldStop(4194304);
_t = mcode.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(mcode._persiandate.runMethod(true,"getDate",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("/")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 2456;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2457;BA.debugLine="T(1)=\"0\"&T(1)";
Debug.ShouldStop(16777216);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 1))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 2459;BA.debugLine="If T(2).Length=1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 2)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2460;BA.debugLine="T(2)=\"0\"&T(2)";
Debug.ShouldStop(134217728);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 2))),BA.numberCast(int.class, 2));
 };
 BA.debugLineNum = 2462;BA.debugLine="Return T(0)&T(1)&T(2)";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 0)),_t.getArrayElement(true,BA.numberCast(int.class, 1)),_t.getArrayElement(true,BA.numberCast(int.class, 2)));
 BA.debugLineNum = 2463;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datepersian2(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("DatePersian2 (mcode) ","mcode",3,_ba,mcode.mostCurrent,2464);
if (RapidSub.canDelegate("datepersian2")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","datepersian2", _ba);}
RemoteObject _t = null;
;
 BA.debugLineNum = 2464;BA.debugLine="Sub DatePersian2 As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 2465;BA.debugLine="Dim T() As String";
Debug.ShouldStop(1);
_t = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("T", _t);
 BA.debugLineNum = 2466;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
Debug.ShouldStop(2);
_t = mcode.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(mcode._persiandate.runMethod(true,"getDate",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("/")))));Debug.locals.put("T", _t);
 BA.debugLineNum = 2467;BA.debugLine="If T(1).Length=1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2468;BA.debugLine="T(1)=\"0\"&T(1)";
Debug.ShouldStop(8);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 1))),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 2470;BA.debugLine="If T(2).Length=1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_t.getArrayElement(true,BA.numberCast(int.class, 2)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2471;BA.debugLine="T(2)=\"0\"&T(2)";
Debug.ShouldStop(64);
_t.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("0"),_t.getArrayElement(true,BA.numberCast(int.class, 2))),BA.numberCast(int.class, 2));
 };
 BA.debugLineNum = 2473;BA.debugLine="Return T(1)&T(2)";
Debug.ShouldStop(256);
if (true) return RemoteObject.concat(_t.getArrayElement(true,BA.numberCast(int.class, 1)),_t.getArrayElement(true,BA.numberCast(int.class, 2)));
 BA.debugLineNum = 2474;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _decrypted(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Decrypted (mcode) ","mcode",3,_ba,mcode.mostCurrent,3269);
if (RapidSub.canDelegate("decrypted")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","decrypted", _ba, _str);}
RemoteObject _enc = RemoteObject.declareNull("b4a.example.aesencryption");
RemoteObject _result1 = RemoteObject.createImmutable("");
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 3269;BA.debugLine="Sub Decrypted(str As String) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 3270;BA.debugLine="Dim Enc As AESEncryption";
Debug.ShouldStop(32);
_enc = RemoteObject.createNew ("b4a.example.aesencryption");Debug.locals.put("Enc", _enc);
 BA.debugLineNum = 3271;BA.debugLine="Dim Result1 As String";
Debug.ShouldStop(64);
_result1 = RemoteObject.createImmutable("");Debug.locals.put("Result1", _result1);
 BA.debugLineNum = 3272;BA.debugLine="Enc.InitializationVector = \"Q.6qYq0_C+mGmymX\" 'Mu";
Debug.ShouldStop(128);
_enc.setField ("_v7",BA.ObjectToString("Q.6qYq0_C+mGmymX"));
 BA.debugLineNum = 3273;BA.debugLine="Enc.SecretKey = \"3hba8fOumOPrMG0.G?-mkF-scGOkPwyW";
Debug.ShouldStop(256);
_enc.setField ("_v0",BA.ObjectToString("3hba8fOumOPrMG0.G?-mkF-scGOkPwyW"));
 BA.debugLineNum = 3274;BA.debugLine="Result1=Enc.AESDecrypt(str)";
Debug.ShouldStop(512);
_result1 = _enc.runMethod(true,"_v5",(Object)(_str));Debug.locals.put("Result1", _result1);
 BA.debugLineNum = 3275;BA.debugLine="Log($\"Decrypted = ${Result1}\"$)";
Debug.ShouldStop(1024);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516515078",(RemoteObject.concat(RemoteObject.createImmutable("Decrypted = "),mcode.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_result1))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 3276;BA.debugLine="Log($\"DecryptedLength = ${Result1.Length}\"$)";
Debug.ShouldStop(2048);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516515079",(RemoteObject.concat(RemoteObject.createImmutable("DecryptedLength = "),mcode.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_result1.runMethod(true,"length")))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 3277;BA.debugLine="Return  Result1";
Debug.ShouldStop(4096);
if (true) return _result1;
 BA.debugLineNum = 3278;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dttojson(RemoteObject _ba,RemoteObject _cu) throws Exception{
try {
		Debug.PushSubsStack("DtToJson (mcode) ","mcode",3,_ba,mcode.mostCurrent,2399);
if (RapidSub.canDelegate("dttojson")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","dttojson", _ba, _cu);}
RemoteObject _olgoo = RemoteObject.createImmutable("");
RemoteObject _rowolgoo = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
int _i = 0;
int _j = 0;
;
Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 2399;BA.debugLine="Sub DtToJson(Cu As Cursor) As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 2400;BA.debugLine="Dim Olgoo As String";
Debug.ShouldStop(-2147483648);
_olgoo = RemoteObject.createImmutable("");Debug.locals.put("Olgoo", _olgoo);
 BA.debugLineNum = 2401;BA.debugLine="Dim RowOlgoo As String";
Debug.ShouldStop(1);
_rowolgoo = RemoteObject.createImmutable("");Debug.locals.put("RowOlgoo", _rowolgoo);
 BA.debugLineNum = 2402;BA.debugLine="Dim Str As String";
Debug.ShouldStop(2);
_str = RemoteObject.createImmutable("");Debug.locals.put("Str", _str);
 BA.debugLineNum = 2403;BA.debugLine="For i=0 To Cu.ColumnCount-1";
Debug.ShouldStop(4);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2404;BA.debugLine="Olgoo=Olgoo & Chr(34) & Cu.GetColumnName(i) & Ch";
Debug.ShouldStop(8);
_olgoo = RemoteObject.concat(_olgoo,mcode.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),_cu.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),mcode.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),RemoteObject.createImmutable(":"),mcode.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),_cu.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(_i),mcode.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))),RemoteObject.createImmutable(","));Debug.locals.put("Olgoo", _olgoo);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2406;BA.debugLine="Olgoo=Sf.Left(Olgoo,Olgoo.Length-1)";
Debug.ShouldStop(32);
_olgoo = mcode._sf.runMethod(true,"_vv0",(Object)(_olgoo),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_olgoo.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Olgoo", _olgoo);
 BA.debugLineNum = 2407;BA.debugLine="Olgoo = \"{\" & Olgoo & \"}\" & \",\"";
Debug.ShouldStop(64);
_olgoo = RemoteObject.concat(RemoteObject.createImmutable("{"),_olgoo,RemoteObject.createImmutable("}"),RemoteObject.createImmutable(","));Debug.locals.put("Olgoo", _olgoo);
 BA.debugLineNum = 2408;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(128);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2409;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(256);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 2410;BA.debugLine="RowOlgoo=Olgoo";
Debug.ShouldStop(512);
_rowolgoo = _olgoo;Debug.locals.put("RowOlgoo", _rowolgoo);
 BA.debugLineNum = 2411;BA.debugLine="For j=0 To Cu.ColumnCount-1";
Debug.ShouldStop(1024);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step12 > 0 && _j <= limit12) || (step12 < 0 && _j >= limit12) ;_j = ((int)(0 + _j + step12))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 2412;BA.debugLine="Log(Cu.GetColumnName(j)& j)";
Debug.ShouldStop(2048);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513697037",RemoteObject.concat(_cu.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _j))),RemoteObject.createImmutable(_j)),0);
 BA.debugLineNum = 2414;BA.debugLine="If (Cu.GetString2(j)<>Null) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _j)))))) { 
 BA.debugLineNum = 2415;BA.debugLine="RowOlgoo = RowOlgoo.Replace(Cu.GetColumnName(j";
Debug.ShouldStop(16384);
_rowolgoo = _rowolgoo.runMethod(true,"replace",(Object)(RemoteObject.concat(_cu.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _j))),RemoteObject.createImmutable(_j))),(Object)(_cu.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _j)))));Debug.locals.put("RowOlgoo", _rowolgoo);
 };
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 2418;BA.debugLine="Str=Str & RowOlgoo";
Debug.ShouldStop(131072);
_str = RemoteObject.concat(_str,_rowolgoo);Debug.locals.put("Str", _str);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2420;BA.debugLine="Str=Sf.Left(Str,Str.Length-1)";
Debug.ShouldStop(524288);
_str = mcode._sf.runMethod(true,"_vv0",(Object)(_str),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Str", _str);
 BA.debugLineNum = 2421;BA.debugLine="Str=\"[\" & Str & \"]\"";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(RemoteObject.createImmutable("["),_str,RemoteObject.createImmutable("]"));Debug.locals.put("Str", _str);
 BA.debugLineNum = 2422;BA.debugLine="Return Str";
Debug.ShouldStop(2097152);
if (true) return _str;
 BA.debugLineNum = 2423;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _encrypted(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Encrypted (mcode) ","mcode",3,_ba,mcode.mostCurrent,3258);
if (RapidSub.canDelegate("encrypted")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","encrypted", _ba, _str);}
RemoteObject _enc = RemoteObject.declareNull("b4a.example.aesencryption");
RemoteObject _result1 = RemoteObject.createImmutable("");
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 3258;BA.debugLine="Sub Encrypted(str As String) As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 3259;BA.debugLine="Dim Enc As AESEncryption";
Debug.ShouldStop(67108864);
_enc = RemoteObject.createNew ("b4a.example.aesencryption");Debug.locals.put("Enc", _enc);
 BA.debugLineNum = 3260;BA.debugLine="Dim Result1 As String";
Debug.ShouldStop(134217728);
_result1 = RemoteObject.createImmutable("");Debug.locals.put("Result1", _result1);
 BA.debugLineNum = 3261;BA.debugLine="Enc.InitializationVector = \"Q.6qYq0_C+mGmymX\" 'Mu";
Debug.ShouldStop(268435456);
_enc.setField ("_v7",BA.ObjectToString("Q.6qYq0_C+mGmymX"));
 BA.debugLineNum = 3262;BA.debugLine="Enc.SecretKey = \"3hba8fOumOPrMG0.G?-mkF-scGOkPwyW";
Debug.ShouldStop(536870912);
_enc.setField ("_v0",BA.ObjectToString("3hba8fOumOPrMG0.G?-mkF-scGOkPwyW"));
 BA.debugLineNum = 3263;BA.debugLine="Result1=Enc.AESEncrypt(str)";
Debug.ShouldStop(1073741824);
_result1 = _enc.runMethod(true,"_v6",(Object)(_str));Debug.locals.put("Result1", _result1);
 BA.debugLineNum = 3264;BA.debugLine="Log($\"Encrypted = ${Result1}\"$)";
Debug.ShouldStop(-2147483648);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516449542",(RemoteObject.concat(RemoteObject.createImmutable("Encrypted = "),mcode.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_result1))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 3265;BA.debugLine="Log($\"EncryptedLength = ${Result1.Length}\"$)";
Debug.ShouldStop(1);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516449543",(RemoteObject.concat(RemoteObject.createImmutable("EncryptedLength = "),mcode.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_result1.runMethod(true,"length")))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 3266;BA.debugLine="Return  Result1";
Debug.ShouldStop(2);
if (true) return _result1;
 BA.debugLineNum = 3267;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enterexitvisitor(RemoteObject _ba,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("EnterExitVisitor (mcode) ","mcode",3,_ba,mcode.mostCurrent,3475);
if (RapidSub.canDelegate("enterexitvisitor")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","enterexitvisitor", _ba, _item);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _query = RemoteObject.createImmutable("");
;
Debug.locals.put("item", _item);
 BA.debugLineNum = 3475;BA.debugLine="Public Sub EnterExitVisitor(item As AdapteEnterExi";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3476;BA.debugLine="Dim res As String=\"\"";
Debug.ShouldStop(524288);
_res = BA.ObjectToString("");Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 3477;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 3478;BA.debugLine="Dim cu As Cursor=Result(\"Select * from TblEnterE";
Debug.ShouldStop(2097152);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("Select * from TblEnterExitVisitor where fldCode='"),_item.getField(true,"fldCode" /*RemoteObject*/ ),RemoteObject.createImmutable("'")));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 3479;BA.debugLine="Select cu.RowCount";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_cu.runMethod(true,"getRowCount"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 3482;BA.debugLine="If item.fldType=1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_item.getField(true,"fldType" /*RemoteObject*/ ),BA.NumberToString(1))) { 
 BA.debugLineNum = 3486;BA.debugLine="Dim query As String=\"Insert into TblEnterExit";
Debug.ShouldStop(536870912);
_query = RemoteObject.concat(RemoteObject.createImmutable("Insert into TblEnterExitVisitor(fldType,fldDate,fldTime,fldLat,fldLon,fldSend,fldCode) "),RemoteObject.createImmutable("Values('ورود','"),_item.getField(true,"fldDate" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldTime" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldLat" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldLon" /*RemoteObject*/ ),RemoteObject.createImmutable("','False','"),_item.getField(true,"fldCode" /*RemoteObject*/ ),RemoteObject.createImmutable("')"));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 3488;BA.debugLine="SaveUpdate(query)";
Debug.ShouldStop(-2147483648);
_saveupdate(_ba,_query);
 BA.debugLineNum = 3489;BA.debugLine="res=\"Success\"";
Debug.ShouldStop(1);
_res = BA.ObjectToString("Success");Debug.locals.put("res", _res);
 }else {
 BA.debugLineNum = 3492;BA.debugLine="res=\"NoEnter\"";
Debug.ShouldStop(8);
_res = BA.ObjectToString("NoEnter");Debug.locals.put("res", _res);
 };
 break; }
case 1: {
 BA.debugLineNum = 3496;BA.debugLine="If item.fldType=1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_item.getField(true,"fldType" /*RemoteObject*/ ),BA.NumberToString(1))) { 
 BA.debugLineNum = 3498;BA.debugLine="res=\"DuplicateEnter\"";
Debug.ShouldStop(512);
_res = BA.ObjectToString("DuplicateEnter");Debug.locals.put("res", _res);
 }else {
 BA.debugLineNum = 3501;BA.debugLine="Dim query As String=\"Insert into TblEnterExit";
Debug.ShouldStop(4096);
_query = RemoteObject.concat(RemoteObject.createImmutable("Insert into TblEnterExitVisitor(fldType,fldDate,fldTime,fldLat,fldLon,fldSend,fldCode) "),RemoteObject.createImmutable("Values('خروج','"),_item.getField(true,"fldDate" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldTime" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldLat" /*RemoteObject*/ ),RemoteObject.createImmutable("','"),_item.getField(true,"fldLon" /*RemoteObject*/ ),RemoteObject.createImmutable("','False','"),_item.getField(true,"fldCode" /*RemoteObject*/ ),RemoteObject.createImmutable("')"));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 3503;BA.debugLine="SaveUpdate(query)";
Debug.ShouldStop(16384);
_saveupdate(_ba,_query);
 BA.debugLineNum = 3504;BA.debugLine="res=\"Success\"";
Debug.ShouldStop(32768);
_res = BA.ObjectToString("Success");Debug.locals.put("res", _res);
 };
 break; }
case 2: {
 BA.debugLineNum = 3508;BA.debugLine="res=\"DuplicateExit\"";
Debug.ShouldStop(524288);
_res = BA.ObjectToString("DuplicateExit");Debug.locals.put("res", _res);
 break; }
default: {
 BA.debugLineNum = 3510;BA.debugLine="res=\"\"";
Debug.ShouldStop(2097152);
_res = BA.ObjectToString("");Debug.locals.put("res", _res);
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e27.toString()); BA.debugLineNum = 3514;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516908327",BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 3515;BA.debugLine="res=\"\"";
Debug.ShouldStop(67108864);
_res = BA.ObjectToString("");Debug.locals.put("res", _res);
 BA.debugLineNum = 3516;BA.debugLine="myCode.SendError(LastException,\"MCode-T_EnterExi";
Debug.ShouldStop(134217728);
mcode.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,_ba,(Object)(BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba))),(Object)(RemoteObject.createImmutable("MCode-T_EnterExit_tick")));
 };
 BA.debugLineNum = 3518;BA.debugLine="Return res";
Debug.ShouldStop(536870912);
if (true) return _res;
 BA.debugLineNum = 3519;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getapiversion(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetApiVersion (mcode) ","mcode",3,_ba,mcode.mostCurrent,2631);
if (RapidSub.canDelegate("getapiversion")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getapiversion", _ba);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _api = RemoteObject.createImmutable(0);
;
 BA.debugLineNum = 2631;BA.debugLine="Sub GetApiVersion As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 2632;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(128);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 2633;BA.debugLine="Dim Api As Int";
Debug.ShouldStop(256);
_api = RemoteObject.createImmutable(0);Debug.locals.put("Api", _api);
 BA.debugLineNum = 2634;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
Debug.ShouldStop(512);
_api = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.os.Build$VERSION")),(Object)(RemoteObject.createImmutable("SDK_INT"))));Debug.locals.put("Api", _api);
 BA.debugLineNum = 2635;BA.debugLine="Return Api";
Debug.ShouldStop(1024);
if (true) return _api;
 BA.debugLineNum = 2636;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcounteshantiongroup(RemoteObject _ba,RemoteObject _codegroup) throws Exception{
try {
		Debug.PushSubsStack("GetCountEshantionGroup (mcode) ","mcode",3,_ba,mcode.mostCurrent,3762);
if (RapidSub.canDelegate("getcounteshantiongroup")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getcounteshantiongroup", _ba, _codegroup);}
RemoteObject _count = RemoteObject.createImmutable(0);
;
Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 3762;BA.debugLine="Sub GetCountEshantionGroup(CodeGroup As String) As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 3763;BA.debugLine="Dim Count As Int=0";
Debug.ShouldStop(262144);
_count = BA.numberCast(int.class, 0);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 3764;BA.debugLine="Count=myCode.Is_Null_adad(SingleResult(\"Select fl";
Debug.ShouldStop(524288);
_count = BA.numberCast(int.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(BA.ObjectToString(_singleresult(_ba,RemoteObject.concat(RemoteObject.createImmutable("Select fldTedadEshantion from tblEshantionGroupTemp where fldCodeGroupKalaEshantion='"),_codegroup,RemoteObject.createImmutable("'")))))));Debug.locals.put("Count", _count);
 BA.debugLineNum = 3766;BA.debugLine="Return Count";
Debug.ShouldStop(2097152);
if (true) return _count;
 BA.debugLineNum = 3767;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdatenow(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetDateNow (mcode) ","mcode",3,_ba,mcode.mostCurrent,2666);
if (RapidSub.canDelegate("getdatenow")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getdatenow", _ba);}
RemoteObject _pcd = RemoteObject.declareNull("anywheresoftware.b4a.student.PersianDate");
RemoteObject _dateshamsi = RemoteObject.createImmutable("");
RemoteObject _yearm = RemoteObject.createImmutable(0);
RemoteObject _monthm = RemoteObject.createImmutable(0);
RemoteObject _daym = RemoteObject.createImmutable(0);
;
 BA.debugLineNum = 2666;BA.debugLine="Sub GetDateNow() As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 2667;BA.debugLine="Dim pcd As PersianDate";
Debug.ShouldStop(1024);
_pcd = RemoteObject.createNew ("anywheresoftware.b4a.student.PersianDate");Debug.locals.put("pcd", _pcd);
 BA.debugLineNum = 2669;BA.debugLine="Dim DateShamsi As String";
Debug.ShouldStop(4096);
_dateshamsi = RemoteObject.createImmutable("");Debug.locals.put("DateShamsi", _dateshamsi);
 BA.debugLineNum = 2670;BA.debugLine="Dim YearM,MonthM,DayM As Int";
Debug.ShouldStop(8192);
_yearm = RemoteObject.createImmutable(0);Debug.locals.put("YearM", _yearm);
_monthm = RemoteObject.createImmutable(0);Debug.locals.put("MonthM", _monthm);
_daym = RemoteObject.createImmutable(0);Debug.locals.put("DayM", _daym);
 BA.debugLineNum = 2671;BA.debugLine="YearM = DateTime.GetYear(DateTime.Now)";
Debug.ShouldStop(16384);
_yearm = mcode.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(mcode.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("YearM", _yearm);
 BA.debugLineNum = 2672;BA.debugLine="MonthM = DateTime.GetMonth(DateTime.Now)";
Debug.ShouldStop(32768);
_monthm = mcode.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(mcode.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("MonthM", _monthm);
 BA.debugLineNum = 2673;BA.debugLine="DayM = DateTime.GetDayOfMonth(DateTime.Now)";
Debug.ShouldStop(65536);
_daym = mcode.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(mcode.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("DayM", _daym);
 BA.debugLineNum = 2674;BA.debugLine="DateShamsi=pcd.getDate(YearM,MonthM,DayM,\"0\")";
Debug.ShouldStop(131072);
_dateshamsi = _pcd.runMethod(true,"getDate",(Object)(_yearm),(Object)(_monthm),(Object)(_daym),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("DateShamsi", _dateshamsi);
 BA.debugLineNum = 2701;BA.debugLine="Log(DateShamsi)";
Debug.ShouldStop(4096);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","514876707",_dateshamsi,0);
 BA.debugLineNum = 2702;BA.debugLine="Return DateShamsi";
Debug.ShouldStop(8192);
if (true) return _dateshamsi;
 BA.debugLineNum = 2703;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdeviceid(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetDeviceId (mcode) ","mcode",3,_ba,mcode.mostCurrent,2597);
if (RapidSub.canDelegate("getdeviceid")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getdeviceid", _ba);}
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _api = RemoteObject.createImmutable(0);
RemoteObject _pid = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneId");
;
 BA.debugLineNum = 2597;BA.debugLine="Sub GetDeviceId As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 2599;BA.debugLine="Dim P1 As Phone";
Debug.ShouldStop(64);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("P1", _p1);
 BA.debugLineNum = 2600;BA.debugLine="Dim id As String";
Debug.ShouldStop(128);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 2601;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(256);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 2602;BA.debugLine="Dim Api As Int";
Debug.ShouldStop(512);
_api = RemoteObject.createImmutable(0);Debug.locals.put("Api", _api);
 BA.debugLineNum = 2603;BA.debugLine="Dim pID As PhoneId";
Debug.ShouldStop(1024);
_pid = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneId");Debug.locals.put("pID", _pid);
 BA.debugLineNum = 2606;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
Debug.ShouldStop(8192);
_api = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.os.Build$VERSION")),(Object)(RemoteObject.createImmutable("SDK_INT"))));Debug.locals.put("Api", _api);
 BA.debugLineNum = 2609;BA.debugLine="Log(\"api: \"& Api)";
Debug.ShouldStop(65536);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","514614540",RemoteObject.concat(RemoteObject.createImmutable("api: "),_api),0);
 BA.debugLineNum = 2610;BA.debugLine="If Api < 28 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("<",_api,BA.numberCast(double.class, 28))) { 
 BA.debugLineNum = 2612;BA.debugLine="id = pID.GetDeviceId";
Debug.ShouldStop(524288);
_id = _pid.runMethod(true,"GetDeviceId");Debug.locals.put("id", _id);
 }else {
 BA.debugLineNum = 2616;BA.debugLine="id= r.GetStaticField(\"android.os.Build\", \"SERIAL";
Debug.ShouldStop(8388608);
_id = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.os.Build")),(Object)(RemoteObject.createImmutable("SERIAL"))));Debug.locals.put("id", _id);
 BA.debugLineNum = 2617;BA.debugLine="If id.ToLowerCase = \"unknown\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_id.runMethod(true,"toLowerCase"),BA.ObjectToString("unknown"))) { 
 BA.debugLineNum = 2618;BA.debugLine="id= P1.GetSettings(\"android_id\")";
Debug.ShouldStop(33554432);
_id = _p1.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("android_id")));Debug.locals.put("id", _id);
 };
 BA.debugLineNum = 2621;BA.debugLine="If id.ToLowerCase = \"9774d56d682e549c\" Or id = N";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_id.runMethod(true,"toLowerCase"),BA.ObjectToString("9774d56d682e549c")) || RemoteObject.solveBoolean("n",_id)) { 
_id = _p1.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("android_id")));Debug.locals.put("id", _id);};
 };
 BA.debugLineNum = 2628;BA.debugLine="Return id";
Debug.ShouldStop(8);
if (true) return _id;
 BA.debugLineNum = 2629;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistgallerykala(RemoteObject _ba,RemoteObject _codekala) throws Exception{
try {
		Debug.PushSubsStack("GetListGalleryKala (mcode) ","mcode",3,_ba,mcode.mostCurrent,3020);
if (RapidSub.canDelegate("getlistgallerykala")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getlistgallerykala", _ba, _codekala);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 3020;BA.debugLine="Public Sub GetListGalleryKala(CodeKala As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 3021;BA.debugLine="Dim lst As List";
Debug.ShouldStop(4096);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 3022;BA.debugLine="lst.Initialize";
Debug.ShouldStop(8192);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 3023;BA.debugLine="If File.Exists(File.DirDefaultExternal &\"/parsik/";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/parsik/GalleryKala"))),(Object)(_codekala)),mcode.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3024;BA.debugLine="lst=File.ListFiles(File.Combine(File.DirDefaultE";
Debug.ShouldStop(32768);
_lst = mcode.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/parsik/GalleryKala"))),(Object)(_codekala))));Debug.locals.put("lst", _lst);
 BA.debugLineNum = 3025;BA.debugLine="If lst.Size>0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3026;BA.debugLine="Return lst";
Debug.ShouldStop(131072);
if (true) return _lst;
 }else {
 BA.debugLineNum = 3028;BA.debugLine="Return lst";
Debug.ShouldStop(524288);
if (true) return _lst;
 };
 }else {
 BA.debugLineNum = 3031;BA.debugLine="Return lst";
Debug.ShouldStop(4194304);
if (true) return _lst;
 };
 BA.debugLineNum = 3033;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlog(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetLog (mcode) ","mcode",3,_ba,mcode.mostCurrent,424);
if (RapidSub.canDelegate("getlog")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getlog", _ba);}
;
 BA.debugLineNum = 424;BA.debugLine="Sub GetLog() As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 426;BA.debugLine="Return File.ReadString(File.DirDefaultExternal &\"";
Debug.ShouldStop(512);
if (true) return mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(RemoteObject.createImmutable("log.txt")));
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmablaghfee(RemoteObject _ba,RemoteObject _fldcodetasvie,RemoteObject _fldcodekala) throws Exception{
try {
		Debug.PushSubsStack("GetMablaghFee (mcode) ","mcode",3,_ba,mcode.mostCurrent,3144);
if (RapidSub.canDelegate("getmablaghfee")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getmablaghfee", _ba, _fldcodetasvie, _fldcodekala);}
RemoteObject _fee = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
Debug.locals.put("fldCodeTasvie", _fldcodetasvie);
Debug.locals.put("fldCodeKala", _fldcodekala);
 BA.debugLineNum = 3144;BA.debugLine="Sub GetMablaghFee(fldCodeTasvie As String,fldCodeK";
Debug.ShouldStop(128);
 BA.debugLineNum = 3145;BA.debugLine="Dim fee As Int=0";
Debug.ShouldStop(256);
_fee = BA.numberCast(int.class, 0);Debug.locals.put("fee", _fee);Debug.locals.put("fee", _fee);
 BA.debugLineNum = 3146;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(512);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 3147;BA.debugLine="cu=Result(\"select FldFee from TblFee where FldCod";
Debug.ShouldStop(1024);
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("select FldFee from TblFee where FldCodeTasvie="),_fldcodetasvie,RemoteObject.createImmutable(" and FldCodeKala="),_fldcodekala));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 3148;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3149;BA.debugLine="fee=SingleResult(\"select FldFee from TblFee wher";
Debug.ShouldStop(4096);
_fee = BA.numberCast(int.class, _singleresult(_ba,RemoteObject.concat(RemoteObject.createImmutable("select FldFee from TblFee where FldCodeTasvie="),_fldcodetasvie,RemoteObject.createImmutable(" and FldCodeKala="),_fldcodekala)));Debug.locals.put("fee", _fee);
 };
 BA.debugLineNum = 3151;BA.debugLine="cu.Close";
Debug.ShouldStop(16384);
_cu.runVoidMethod ("Close");
 BA.debugLineNum = 3152;BA.debugLine="Return fee";
Debug.ShouldStop(32768);
if (true) return _fee;
 BA.debugLineNum = 3153;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnahvietasfie(RemoteObject _ba,RemoteObject _fldcode) throws Exception{
try {
		Debug.PushSubsStack("GetNahvieTasfie (mcode) ","mcode",3,_ba,mcode.mostCurrent,2986);
if (RapidSub.canDelegate("getnahvietasfie")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getnahvietasfie", _ba, _fldcode);}
;
Debug.locals.put("fldCode", _fldcode);
 BA.debugLineNum = 2986;BA.debugLine="Public Sub GetNahvieTasfie(fldCode As String) As S";
Debug.ShouldStop(512);
 BA.debugLineNum = 2987;BA.debugLine="Return SingleResult(\"select FldName from TblTasvi";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToString(_singleresult(_ba,RemoteObject.concat(RemoteObject.createImmutable("select FldName from TblTasvie where FldCode="),_fldcode)));
 BA.debugLineNum = 2988;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnamegroupkala(RemoteObject _ba,RemoteObject _codegroup) throws Exception{
try {
		Debug.PushSubsStack("GetNameGroupKala (mcode) ","mcode",3,_ba,mcode.mostCurrent,3769);
if (RapidSub.canDelegate("getnamegroupkala")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getnamegroupkala", _ba, _codegroup);}
RemoteObject _str = RemoteObject.createImmutable("");
;
Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 3769;BA.debugLine="Sub GetNameGroupKala(CodeGroup As String) As Strin";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 3770;BA.debugLine="Dim str As String=\"\"";
Debug.ShouldStop(33554432);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 3771;BA.debugLine="str=SingleResult(\"Select FldN_Gorooh From TblGoro";
Debug.ShouldStop(67108864);
_str = BA.ObjectToString(_singleresult(_ba,RemoteObject.concat(RemoteObject.createImmutable("Select FldN_Gorooh From TblGoroohKala where FldC_Gorooh="),_codegroup)));Debug.locals.put("str", _str);
 BA.debugLineNum = 3772;BA.debugLine="Return str";
Debug.ShouldStop(134217728);
if (true) return _str;
 BA.debugLineNum = 3773;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpickala(RemoteObject _ba,RemoteObject _codekala) throws Exception{
try {
		Debug.PushSubsStack("GetPicKala (mcode) ","mcode",3,_ba,mcode.mostCurrent,2997);
if (RapidSub.canDelegate("getpickala")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getpickala", _ba, _codekala);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
;
Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 2997;BA.debugLine="Public Sub GetPicKala(CodeKala As String) As Bitma";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2998;BA.debugLine="If File.Exists(File.DirDefaultExternal &\"/parsik/";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/parsik/AksKala"))),(Object)(RemoteObject.concat(_codekala,RemoteObject.createImmutable(".jpg")))),mcode.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3000;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(8388608);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 3001;BA.debugLine="bmp.InitializeSample(File.DirAssets,\"icon.png\",2";
Debug.ShouldStop(16777216);
_bmp.runVoidMethod ("InitializeSample",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("icon.png")),(Object)(mcode.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2800)))),(Object)(mcode.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2800)))));
 BA.debugLineNum = 3002;BA.debugLine="If RotatePic Then";
Debug.ShouldStop(33554432);
if (mcode._rotatepic.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3003;BA.debugLine="Return bmp.Rotate(180)";
Debug.ShouldStop(67108864);
if (true) return _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(float.class, 180)));
 }else {
 BA.debugLineNum = 3005;BA.debugLine="Return bmp";
Debug.ShouldStop(268435456);
if (true) return _bmp;
 };
 }else {
 BA.debugLineNum = 3010;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(2);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 3011;BA.debugLine="bmp.InitializeSample(File.DirDefaultExternal &\"/";
Debug.ShouldStop(4);
_bmp.runVoidMethod ("InitializeSample",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/parsik/AksKala"))),(Object)(RemoteObject.concat(_codekala,RemoteObject.createImmutable(".jpg"))),(Object)(mcode.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2800)))),(Object)(mcode.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2800)))));
 BA.debugLineNum = 3012;BA.debugLine="If RotatePic Then";
Debug.ShouldStop(8);
if (mcode._rotatepic.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3013;BA.debugLine="Return bmp.Rotate(180)";
Debug.ShouldStop(16);
if (true) return _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(float.class, 180)));
 }else {
 BA.debugLineNum = 3015;BA.debugLine="Return bmp";
Debug.ShouldStop(64);
if (true) return _bmp;
 };
 };
 BA.debugLineNum = 3018;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpickalapath(RemoteObject _ba,RemoteObject _codekala) throws Exception{
try {
		Debug.PushSubsStack("GetPicKalaPath (mcode) ","mcode",3,_ba,mcode.mostCurrent,3055);
if (RapidSub.canDelegate("getpickalapath")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getpickalapath", _ba, _codekala);}
;
Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 3055;BA.debugLine="Public Sub GetPicKalaPath(CodeKala As String) As S";
Debug.ShouldStop(16384);
 BA.debugLineNum = 3056;BA.debugLine="If File.Exists(File.DirDefaultExternal &\"/parsik/";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/parsik/AksKala"))),(Object)(RemoteObject.concat(_codekala,RemoteObject.createImmutable(".jpg")))),mcode.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3058;BA.debugLine="Return File.Combine(File.DirAssets,\"icon.png\")";
Debug.ShouldStop(131072);
if (true) return mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png")));
 }else {
 BA.debugLineNum = 3061;BA.debugLine="Return File.Combine(File.DirDefaultExternal &\"/p";
Debug.ShouldStop(1048576);
if (true) return mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/parsik/AksKala"))),(Object)(RemoteObject.concat(_codekala,RemoteObject.createImmutable(".jpg"))));
 };
 BA.debugLineNum = 3063;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getupdatefeesabad(RemoteObject _ba,RemoteObject _str,RemoteObject _codekala) throws Exception{
try {
		Debug.PushSubsStack("GetUpdateFeeSabad (mcode) ","mcode",3,_ba,mcode.mostCurrent,3451);
if (RapidSub.canDelegate("getupdatefeesabad")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","getupdatefeesabad", _ba, _str, _codekala);}
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterchangefeekala");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
Debug.locals.put("str", _str);
Debug.locals.put("codeKala", _codekala);
 BA.debugLineNum = 3451;BA.debugLine="Sub GetUpdateFeeSabad(str As String,codeKala As St";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 3453;BA.debugLine="If lstChangeFeeKala.Size>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",mcode._lstchangefeekala.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3454;BA.debugLine="For i=0 To lstChangeFeeKala.Size-1";
Debug.ShouldStop(536870912);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {mcode._lstchangefeekala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3455;BA.debugLine="Dim Item = lstChangeFeeKala.Get(i) As AdapterCh";
Debug.ShouldStop(1073741824);
_item = (mcode._lstchangefeekala.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 3456;BA.debugLine="If Item.FldCodKala=codeKala Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_item.getField(true,"FldCodKala" /*RemoteObject*/ ),_codekala)) { 
 BA.debugLineNum = 3457;BA.debugLine="str=Item.FldFee";
Debug.ShouldStop(1);
_str = _item.getField(true,"FldFee" /*RemoteObject*/ );Debug.locals.put("str", _str);
 BA.debugLineNum = 3458;BA.debugLine="Exit";
Debug.ShouldStop(2);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 3462;BA.debugLine="Dim cu As Cursor=Result(\"select * from TblSabad";
Debug.ShouldStop(32);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("select * from TblSabad where FldCodeKala="),_codekala));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 3463;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3464;BA.debugLine="SaveUpdate(\"Update TblSabad Set  FldFeeForoosh=";
Debug.ShouldStop(128);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set  FldFeeForoosh="),_str,RemoteObject.createImmutable(",FldupdateFee=NULL where FldCodeKala="),_codekala));
 };
 };
 BA.debugLineNum = 3467;BA.debugLine="Return str";
Debug.ShouldStop(1024);
if (true) return _str;
 BA.debugLineNum = 3468;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mcode) ","mcode",3,_ba,mcode.mostCurrent,211);
if (RapidSub.canDelegate("initialize")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","initialize", _ba);}
RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
;
 BA.debugLineNum = 211;BA.debugLine="Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal,\"Parsi";
Debug.ShouldStop(524288);
if (mcode.mostCurrent.__c.runMethod(true,"Not",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("Parsik"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 213;BA.debugLine="File.MakeDir(File.DirDefaultExternal,\"Parsik\")";
Debug.ShouldStop(1048576);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("Parsik")));
 };
 BA.debugLineNum = 215;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal,\"Parsi";
Debug.ShouldStop(4194304);
if (mcode.mostCurrent.__c.runMethod(true,"Not",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("Parsik"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 216;BA.debugLine="File.MakeDir(File.DirDefaultExternal,\"Parsik\")";
Debug.ShouldStop(8388608);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("Parsik")));
 BA.debugLineNum = 217;BA.debugLine="File.Copy(File.DirAssets,\"parsik_db.db\",File.Dir";
Debug.ShouldStop(16777216);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("parsik_db.db")),(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("parsik_db.db")));
 BA.debugLineNum = 218;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\",";
Debug.ShouldStop(33554432);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("AksKala")));
 BA.debugLineNum = 219;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\",";
Debug.ShouldStop(67108864);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("GalleryKala")));
 BA.debugLineNum = 220;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\",";
Debug.ShouldStop(134217728);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("pdf")));
 BA.debugLineNum = 221;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\",";
Debug.ShouldStop(268435456);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("Signature")));
 BA.debugLineNum = 222;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\",";
Debug.ShouldStop(536870912);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("Backup")));
 BA.debugLineNum = 223;BA.debugLine="File.WriteString(File.DirDefaultExternal &\"/Pars";
Debug.ShouldStop(1073741824);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(BA.ObjectToString("backlist.txt")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 224;BA.debugLine="File.WriteString(File.DirDefaultExternal &\"/Pars";
Debug.ShouldStop(-2147483648);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(BA.ObjectToString("log.txt")),(Object)(RemoteObject.createImmutable("")));
 }else 
{ BA.debugLineNum = 226;BA.debugLine="Else if File.Exists(File.DirDefaultExternal, \"Par";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("Parsik"))),mcode.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 227;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal & \"/P";
Debug.ShouldStop(4);
if (mcode.mostCurrent.__c.runMethod(true,"Not",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("parsik_db.db"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 228;BA.debugLine="File.Copy(File.DirAssets,\"parsik_db.db\",File.Di";
Debug.ShouldStop(8);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("parsik_db.db")),(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("parsik_db.db")));
 };
 BA.debugLineNum = 230;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal &\"/Pa";
Debug.ShouldStop(32);
if (mcode.mostCurrent.__c.runMethod(true,"Not",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("AksKala"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 231;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\"";
Debug.ShouldStop(64);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("AksKala")));
 };
 BA.debugLineNum = 233;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal &\"/Pa";
Debug.ShouldStop(256);
if (mcode.mostCurrent.__c.runMethod(true,"Not",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("GalleryKala"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 234;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\"";
Debug.ShouldStop(512);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("GalleryKala")));
 };
 BA.debugLineNum = 236;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal &\"/Pa";
Debug.ShouldStop(2048);
if (mcode.mostCurrent.__c.runMethod(true,"Not",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("pdf"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 237;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\"";
Debug.ShouldStop(4096);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("pdf")));
 };
 BA.debugLineNum = 239;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal &\"/Pa";
Debug.ShouldStop(16384);
if (mcode.mostCurrent.__c.runMethod(true,"Not",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("Signature"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 240;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\"";
Debug.ShouldStop(32768);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("Signature")));
 };
 BA.debugLineNum = 242;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal &\"/Pa";
Debug.ShouldStop(131072);
if (mcode.mostCurrent.__c.runMethod(true,"Not",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("Backup"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 243;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\"";
Debug.ShouldStop(262144);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("Backup")));
 BA.debugLineNum = 244;BA.debugLine="File.WriteString(File.DirDefaultExternal &\"/Par";
Debug.ShouldStop(524288);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(BA.ObjectToString("backlist.txt")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 245;BA.debugLine="File.WriteString(File.DirDefaultExternal &\"/Par";
Debug.ShouldStop(1048576);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(BA.ObjectToString("log.txt")),(Object)(RemoteObject.createImmutable("")));
 };
 }}
;
 BA.debugLineNum = 249;BA.debugLine="Dim ac As AppCompat";
Debug.ShouldStop(16777216);
_ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");Debug.locals.put("ac", _ac);
 BA.debugLineNum = 250;BA.debugLine="colorPrimary=ac.GetThemeAttribute(\"colorPrimary\")";
Debug.ShouldStop(33554432);
mcode._colorprimary = _ac.runMethod(true,"GetThemeAttribute",_ba,(Object)(RemoteObject.createImmutable("colorPrimary")));
 BA.debugLineNum = 251;BA.debugLine="colorPrimaryDark=ac.GetThemeAttribute(\"colorPrima";
Debug.ShouldStop(67108864);
mcode._colorprimarydark = _ac.runMethod(true,"GetThemeAttribute",_ba,(Object)(RemoteObject.createImmutable("colorPrimaryDark")));
 BA.debugLineNum = 252;BA.debugLine="colorAccent=ac.GetThemeAttribute(\"colorAccent\")";
Debug.ShouldStop(134217728);
mcode._coloraccent = _ac.runMethod(true,"GetThemeAttribute",_ba,(Object)(RemoteObject.createImmutable("colorAccent")));
 BA.debugLineNum = 253;BA.debugLine="Log(colorPrimary)";
Debug.ShouldStop(268435456);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","512976170",BA.NumberToString(mcode._colorprimary),0);
 BA.debugLineNum = 254;BA.debugLine="Log(colorPrimaryDark)";
Debug.ShouldStop(536870912);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","512976171",BA.NumberToString(mcode._colorprimarydark),0);
 BA.debugLineNum = 255;BA.debugLine="Log(colorAccent)";
Debug.ShouldStop(1073741824);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","512976172",BA.NumberToString(mcode._coloraccent),0);
 BA.debugLineNum = 256;BA.debugLine="Sql1.Initialize(File.DirDefaultExternal &\"/Parsi";
Debug.ShouldStop(-2147483648);
mcode._sql1.runVoidMethod ("Initialize",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(BA.ObjectToString("parsik_db.db")),(Object)(mcode.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 260;BA.debugLine="Url=\"zomorodonline.ir\"";
Debug.ShouldStop(8);
mcode._url = BA.ObjectToString("zomorodonline.ir");
 BA.debugLineNum = 261;BA.debugLine="lstChangeFeeKala.Initialize";
Debug.ShouldStop(16);
mcode._lstchangefeekala.runVoidMethod ("Initialize");
 BA.debugLineNum = 262;BA.debugLine="receiver2.Initialize(\"receiver2\")";
Debug.ShouldStop(32);
mcode._receiver2.runVoidMethod ("Initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(RemoteObject.createImmutable("receiver2")));
 BA.debugLineNum = 263;BA.debugLine="receiver2.AddAction(PackageNamePosParsian &\".ACTI";
Debug.ShouldStop(64);
mcode._receiver2.runVoidMethod ("AddAction",(Object)(RemoteObject.concat(mcode._packagenameposparsian,RemoteObject.createImmutable(".ACTION_RESULT"))));
 BA.debugLineNum = 265;BA.debugLine="receiver2.SetPriority(1)";
Debug.ShouldStop(256);
mcode._receiver2.runVoidMethod ("SetPriority",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 266;BA.debugLine="receiver2.RegisterReceiver";
Debug.ShouldStop(512);
mcode._receiver2.runVoidMethod ("RegisterReceiver");
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _interval(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Interval (mcode) ","mcode",3,_ba,mcode.mostCurrent,363);
if (RapidSub.canDelegate("interval")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","interval", _ba);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
 BA.debugLineNum = 363;BA.debugLine="Sub Interval As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 364;BA.debugLine="Dim Cu As Cursor = Sql1.ExecQuery(\"Select FldInte";
Debug.ShouldStop(2048);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mcode._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select FldIntervalGps From TblSetting"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 365;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(4096);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 366;BA.debugLine="Return Cu.GetString(\"FldIntervalGps\") * 60 * 1000";
Debug.ShouldStop(8192);
if (true) return BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldIntervalGps")))),RemoteObject.createImmutable(60),RemoteObject.createImmutable(1000)}, "**",0, 0));
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isconnected(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("IsConnected (mcode) ","mcode",3,_ba,mcode.mostCurrent,3105);
if (RapidSub.canDelegate("isconnected")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","isconnected", _ba);}
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _server = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper");
;
 BA.debugLineNum = 3105;BA.debugLine="Sub IsConnected As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 3106;BA.debugLine="Dim P1 As Phone";
Debug.ShouldStop(2);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("P1", _p1);
 BA.debugLineNum = 3107;BA.debugLine="Dim server As ServerSocket'Add a reference to the";
Debug.ShouldStop(4);
_server = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper");Debug.locals.put("server", _server);
 BA.debugLineNum = 3108;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 3113;BA.debugLine="Return True";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return mcode.mostCurrent.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e6.toString()); BA.debugLineNum = 3115;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) return mcode.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 3117;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadacspnoetasvie(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpNoeTasvie (mcode) ","mcode",3,_ba,mcode.mostCurrent,3171);
if (RapidSub.canDelegate("loadacspnoetasvie")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","loadacspnoetasvie", _ba);}
RemoteObject _listtasvie = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _somearray = null;
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
;
 BA.debugLineNum = 3171;BA.debugLine="Sub LoadAcSpNoeTasvie As List";
Debug.ShouldStop(4);
 BA.debugLineNum = 3172;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 3173;BA.debugLine="Dim ListTasvie As List";
Debug.ShouldStop(16);
_listtasvie = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListTasvie", _listtasvie);
 BA.debugLineNum = 3174;BA.debugLine="ListTasvie.Initialize";
Debug.ShouldStop(32);
_listtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 3175;BA.debugLine="Dim Cu As Cursor = Result(\"Select * From TblTasvi";
Debug.ShouldStop(64);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.createImmutable("Select * From TblTasvie"));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 3176;BA.debugLine="Dim SomeArray(Cu.RowCount+1) As String";
Debug.ShouldStop(128);
_somearray = RemoteObject.createNewArray ("String", new int[] {RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("SomeArray", _somearray);
 BA.debugLineNum = 3177;BA.debugLine="SomeArray(0)=\"انتخاب کنید\"";
Debug.ShouldStop(256);
_somearray.setArrayElement (BA.ObjectToString("انتخاب کنید"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3178;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3179;BA.debugLine="For i = 0 To Cu.RowCount-1";
Debug.ShouldStop(1024);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3180;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(2048);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 3181;BA.debugLine="Dim Item As AdapterListNoeTasvie";
Debug.ShouldStop(4096);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("Item", _item);
 BA.debugLineNum = 3182;BA.debugLine="Item.FldC_Tasvie=Cu.GetString(\"FldCode\")";
Debug.ShouldStop(8192);
_item.setField ("FldC_Tasvie" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCode"))));
 BA.debugLineNum = 3183;BA.debugLine="Item.FldN_Tasvie=Cu.GetString(\"FldName\")";
Debug.ShouldStop(16384);
_item.setField ("FldN_Tasvie" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldName"))));
 BA.debugLineNum = 3184;BA.debugLine="ListTasvie.Add(Item)";
Debug.ShouldStop(32768);
_listtasvie.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 3186;BA.debugLine="SomeArray(i+1)=Cu.GetString(\"FldName\")";
Debug.ShouldStop(131072);
_somearray.setArrayElement (_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldName"))),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3188;BA.debugLine="ArrayTasvieForKala=SomeArray";
Debug.ShouldStop(524288);
mcode._arraytasvieforkala = _somearray;
 };
 BA.debugLineNum = 3190;BA.debugLine="Return ListTasvie";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return _listtasvie;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e20.toString()); BA.debugLineNum = 3193;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516318486",BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 3195;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadeshantiongroup(RemoteObject _ba,RemoteObject _codegroup) throws Exception{
try {
		Debug.PushSubsStack("LoadEshantionGroup (mcode) ","mcode",3,_ba,mcode.mostCurrent,2922);
if (RapidSub.canDelegate("loadeshantiongroup")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","loadeshantiongroup", _ba, _codegroup);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");
;
Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 2922;BA.debugLine="Public Sub LoadEshantionGroup(CodeGroup As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 2923;BA.debugLine="Dim lst As List";
Debug.ShouldStop(1024);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 2924;BA.debugLine="lst.Initialize";
Debug.ShouldStop(2048);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 2925;BA.debugLine="Dim cu As Cursor=Result(\"select * from tblEshanti";
Debug.ShouldStop(4096);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("select * from tblEshantionGroup where fldCodeGroupKala="),_codegroup));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 2926;BA.debugLine="If	cu.RowCount>0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2927;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(16384);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2928;BA.debugLine="cu.Position=i";
Debug.ShouldStop(32768);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 2929;BA.debugLine="Dim item As AdapterListEshantionGroup";
Debug.ShouldStop(65536);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");Debug.locals.put("item", _item);
 BA.debugLineNum = 2930;BA.debugLine="item.ID=cu.GetString(\"ID\")";
Debug.ShouldStop(131072);
_item.setField ("ID" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ID"))));
 BA.debugLineNum = 2931;BA.debugLine="item.fldCodeGroupKala=cu.GetString(\"fldCodeGrou";
Debug.ShouldStop(262144);
_item.setField ("fldCodeGroupKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroupKala"))));
 BA.debugLineNum = 2932;BA.debugLine="item.fldTedadForoosh=cu.GetString(\"fldTedadForo";
Debug.ShouldStop(524288);
_item.setField ("fldTedadForoosh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadForoosh"))));
 BA.debugLineNum = 2933;BA.debugLine="item.fldTedadEshantion=cu.GetString(\"fldTedadEs";
Debug.ShouldStop(1048576);
_item.setField ("fldTedadEshantion" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadEshantion"))));
 BA.debugLineNum = 2934;BA.debugLine="item.fldCodeGroupKalaEshantion=cu.GetString(\"fl";
Debug.ShouldStop(2097152);
_item.setField ("fldCodeGroupKalaEshantion" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroupKalaEshantion"))));
 BA.debugLineNum = 2935;BA.debugLine="item.fldShomareTabaghe=cu.GetString(\"fldShomare";
Debug.ShouldStop(4194304);
_item.setField ("fldShomareTabaghe" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareTabaghe"))));
 BA.debugLineNum = 2936;BA.debugLine="lst.Add(item)";
Debug.ShouldStop(8388608);
_lst.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2938;BA.debugLine="Return lst";
Debug.ShouldStop(33554432);
if (true) return _lst;
 };
 BA.debugLineNum = 2940;BA.debugLine="Return Null";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), mcode.mostCurrent.__c.getField(false,"Null"));
 BA.debugLineNum = 2941;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadeshantiontabaghati(RemoteObject _ba,RemoteObject _codekala) throws Exception{
try {
		Debug.PushSubsStack("LoadEshantionTabaghati (mcode) ","mcode",3,_ba,mcode.mostCurrent,2943);
if (RapidSub.canDelegate("loadeshantiontabaghati")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","loadeshantiontabaghati", _ba, _codekala);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantion");
;
Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 2943;BA.debugLine="Public Sub LoadEshantionTabaghati(CodeKala As Stri";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 2944;BA.debugLine="Dim lst As List";
Debug.ShouldStop(-2147483648);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 2945;BA.debugLine="lst.Initialize";
Debug.ShouldStop(1);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 2946;BA.debugLine="Dim cu As Cursor=Result(\"select * from tblEshanti";
Debug.ShouldStop(2);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("select * from tblEshantionTabaghati where fldCodeKalaForoosh="),_codekala));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 2947;BA.debugLine="If	cu.RowCount>0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2948;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(8);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2949;BA.debugLine="cu.Position=i";
Debug.ShouldStop(16);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 2950;BA.debugLine="Dim item As AdapterListEshantion";
Debug.ShouldStop(32);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlisteshantion");Debug.locals.put("item", _item);
 BA.debugLineNum = 2951;BA.debugLine="item.ID=cu.GetString(\"ID\")";
Debug.ShouldStop(64);
_item.setField ("ID" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ID"))));
 BA.debugLineNum = 2952;BA.debugLine="item.fldCodeKalaForoosh=cu.GetString(\"fldCodeKa";
Debug.ShouldStop(128);
_item.setField ("fldCodeKalaForoosh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeKalaForoosh"))));
 BA.debugLineNum = 2953;BA.debugLine="item.fldTedadForoosh=cu.GetString(\"fldTedadForo";
Debug.ShouldStop(256);
_item.setField ("fldTedadForoosh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadForoosh"))));
 BA.debugLineNum = 2954;BA.debugLine="item.fldTedadEshantion=cu.GetString(\"fldTedadEs";
Debug.ShouldStop(512);
_item.setField ("fldTedadEshantion" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadEshantion"))));
 BA.debugLineNum = 2955;BA.debugLine="item.fldCodeKalaEshantion=cu.GetString(\"fldCode";
Debug.ShouldStop(1024);
_item.setField ("fldCodeKalaEshantion" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeKalaEshantion"))));
 BA.debugLineNum = 2956;BA.debugLine="item.fldShomareTabaghe=cu.GetString(\"fldShomare";
Debug.ShouldStop(2048);
_item.setField ("fldShomareTabaghe" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareTabaghe"))));
 BA.debugLineNum = 2957;BA.debugLine="lst.Add(item)";
Debug.ShouldStop(4096);
_lst.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2959;BA.debugLine="Return lst";
Debug.ShouldStop(16384);
if (true) return _lst;
 };
 BA.debugLineNum = 2961;BA.debugLine="Return Null";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), mcode.mostCurrent.__c.getField(false,"Null"));
 BA.debugLineNum = 2962;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadlistkala(RemoteObject _ba,RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("LoadListKala (mcode) ","mcode",3,_ba,mcode.mostCurrent,3530);
if (RapidSub.canDelegate("loadlistkala")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","loadlistkala", _ba, _query);}
RemoteObject _orginallistkala = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _itemkala = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _fee = RemoteObject.createImmutable("");
RemoteObject _countsabad = RemoteObject.createImmutable("");
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _fldfeeforoosh = RemoteObject.createImmutable(0);
RemoteObject _fldtedaddarkarton = RemoteObject.createImmutable(0);
RemoteObject _summande = RemoteObject.createImmutable(0);
RemoteObject _sumkol = RemoteObject.createImmutable(0L);
;
Debug.locals.put("Query", _query);
 BA.debugLineNum = 3530;BA.debugLine="Sub LoadListKala(Query As String) As List";
Debug.ShouldStop(512);
 BA.debugLineNum = 3531;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 3532;BA.debugLine="Dim OrginalListKala As List";
Debug.ShouldStop(2048);
_orginallistkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("OrginalListKala", _orginallistkala);
 BA.debugLineNum = 3533;BA.debugLine="OrginalListKala.Initialize";
Debug.ShouldStop(4096);
_orginallistkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 3538;BA.debugLine="OrginalListKala.Clear";
Debug.ShouldStop(131072);
_orginallistkala.runVoidMethod ("Clear");
 BA.debugLineNum = 3539;BA.debugLine="Dim Cu As Cursor = Result(Query)";
Debug.ShouldStop(262144);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,_query);Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 3540;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3541;BA.debugLine="StopService(FusedLocationService)";
Debug.ShouldStop(1048576);
mcode.mostCurrent.__c.runVoidMethod ("StopService",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((mcode.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 3544;BA.debugLine="For i = 0 To Cu.RowCount - 1";
Debug.ShouldStop(8388608);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3545;BA.debugLine="Dim ItemKala As AdapterListKala";
Debug.ShouldStop(16777216);
_itemkala = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");Debug.locals.put("ItemKala", _itemkala);
 BA.debugLineNum = 3546;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(33554432);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 3547;BA.debugLine="ItemKala.CodeGroup=Cu.Getstring(\"fldCodeGroup\"";
Debug.ShouldStop(67108864);
_itemkala.setField ("CodeGroup" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroup"))));
 BA.debugLineNum = 3548;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
Debug.ShouldStop(134217728);
_itemkala.setField ("CodeKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeKala"))));
 BA.debugLineNum = 3549;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
Debug.ShouldStop(268435456);
_itemkala.setField ("NameKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameKala"))));
 BA.debugLineNum = 3550;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\"";
Debug.ShouldStop(536870912);
_itemkala.setField ("NameVahed" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed"))));
 BA.debugLineNum = 3551;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed";
Debug.ShouldStop(1073741824);
_itemkala.setField ("NameVahed2" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))));
 BA.debugLineNum = 3552;BA.debugLine="ItemKala.fldSharh=Cu.Getstring(\"fldSharh\")";
Debug.ShouldStop(-2147483648);
_itemkala.setField ("fldSharh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh"))));
 BA.debugLineNum = 3553;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
Debug.ShouldStop(1);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));
 BA.debugLineNum = 3566;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTeda";
Debug.ShouldStop(8192);
_itemkala.setField ("TedadDarKarton" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))));
 BA.debugLineNum = 3569;BA.debugLine="Dim fee As String";
Debug.ShouldStop(65536);
_fee = RemoteObject.createImmutable("");Debug.locals.put("fee", _fee);
 BA.debugLineNum = 3570;BA.debugLine="If feeTip=0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",mcode._feetip,BA.NumberToString(0))) { 
 BA.debugLineNum = 3571;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(262144);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 }else {
 BA.debugLineNum = 3577;BA.debugLine="fee=myCode.Is_Null_adad(Cu.GetString(\"fldFeeT";
Debug.ShouldStop(16777216);
_fee = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeTasvie")))));Debug.locals.put("fee", _fee);
 BA.debugLineNum = 3579;BA.debugLine="If 	IsNumber(fee) And fee>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(".",mcode.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_fee))) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _fee),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3580;BA.debugLine="Log(Cu.GetString(\"fldFeeTasvie\"))";
Debug.ShouldStop(134217728);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","517039410",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeTasvie"))),0);
 BA.debugLineNum = 3582;BA.debugLine="If  fee>Cu.GetString(\"fldFeeBadAzTakhfif\") T";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _fee),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif")))))) { 
 BA.debugLineNum = 3584;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(-2147483648);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 }else 
{ BA.debugLineNum = 3585;BA.debugLine="Else if fee<Cu.GetString(\"fldFeeBadAzTakhfif";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _fee),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif")))))) { 
 BA.debugLineNum = 3586;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee";
Debug.ShouldStop(2);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_fee);
 BA.debugLineNum = 3587;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(4);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 }else {
 BA.debugLineNum = 3591;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"f";
Debug.ShouldStop(64);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 BA.debugLineNum = 3592;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(128);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 }}
;
 }else {
 BA.debugLineNum = 3596;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(2048);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 };
 };
 BA.debugLineNum = 3610;BA.debugLine="Dim countSabad As String=SingleResult(\"select";
Debug.ShouldStop(33554432);
_countsabad = BA.ObjectToString(_singleresult(_ba,RemoteObject.concat(RemoteObject.createImmutable("select count(FldId) from TblSabad where FldCodeKala="),_itemkala.getField(true,"CodeKala" /*RemoteObject*/ ))));Debug.locals.put("countSabad", _countsabad);Debug.locals.put("countSabad", _countsabad);
 BA.debugLineNum = 3611;BA.debugLine="If countSabad>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _countsabad),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3612;BA.debugLine="Dim cu1 As Cursor=Result(\"select * from TblSa";
Debug.ShouldStop(134217728);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("select * from TblSabad where FldCodeKala="),_itemkala.getField(true,"CodeKala" /*RemoteObject*/ )));Debug.locals.put("cu1", _cu1);Debug.locals.put("cu1", _cu1);
 BA.debugLineNum = 3613;BA.debugLine="cu1.Position=0";
Debug.ShouldStop(268435456);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 3614;BA.debugLine="feeTip=feeTip";
Debug.ShouldStop(536870912);
mcode._feetip = mcode._feetip;
 BA.debugLineNum = 3615;BA.debugLine="ItemKala.TedadDarSabadJoz =cu1.Getstring(\"Fld";
Debug.ShouldStop(1073741824);
_itemkala.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))));
 BA.debugLineNum = 3616;BA.debugLine="ItemKala.TedadDarSabadKol =cu1.Getstring(\"Fld";
Debug.ShouldStop(-2147483648);
_itemkala.setField ("TedadDarSabadKol" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))));
 BA.debugLineNum = 3617;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")-cu";
Debug.ShouldStop(1);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande")))),BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))))}, "-",1, 0)));
 BA.debugLineNum = 3618;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 3619;BA.debugLine="Dim FldFeeForoosh As Int = Sf.Val(Cu.GetInt(";
Debug.ShouldStop(4);
_fldfeeforoosh = BA.numberCast(int.class, mcode._sf.runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 3620;BA.debugLine="Dim FldTedadDarKarton As Int = Sf.Val(cu1.Ge";
Debug.ShouldStop(8);
_fldtedaddarkarton = BA.numberCast(int.class, mcode._sf.runMethod(true,"_vvvvv1",(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 3621;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande";
Debug.ShouldStop(16);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 3622;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fl";
Debug.ShouldStop(32);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 3623;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / F";
Debug.ShouldStop(64);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(mcode.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0)))));
 };
 BA.debugLineNum = 3626;BA.debugLine="If feeTip=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",mcode._feetip,BA.NumberToString(0))) { 
 BA.debugLineNum = 3627;BA.debugLine="fee=cu1.GetString(\"FldFeeForoosh\")";
Debug.ShouldStop(1024);
_fee = _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFeeForoosh")));Debug.locals.put("fee", _fee);
 }else {
 BA.debugLineNum = 3629;BA.debugLine="fee=GetUpdateFeeSabad(fee,ItemKala.CodeKala)";
Debug.ShouldStop(4096);
_fee = _getupdatefeesabad(_ba,_fee,_itemkala.getField(true,"CodeKala" /*RemoteObject*/ ));Debug.locals.put("fee", _fee);
 };
 BA.debugLineNum = 3635;BA.debugLine="ItemKala.FldEshantion=cu1.Getstring(\"FldEshan";
Debug.ShouldStop(262144);
_itemkala.setField ("FldEshantion" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion"))));
 BA.debugLineNum = 3639;BA.debugLine="If myCode.Is_Null_adad(cu1.GetString(\"FldDars";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif")))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3643;BA.debugLine="ItemKala.fldDarsadTakhfif=cu1.GetString(\"Fld";
Debug.ShouldStop(67108864);
_itemkala.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif"))));
 BA.debugLineNum = 3644;BA.debugLine="ItemKala.MablaghTakhfif=((ItemKala.FeeForoos";
Debug.ShouldStop(134217728);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_itemkala.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif"))))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 }else {
 BA.debugLineNum = 3650;BA.debugLine="If cu1.GetString(\"FldMablaghTakhfif\")>0 And";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif")))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("N",_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif"))))) { 
 BA.debugLineNum = 3652;BA.debugLine="ItemKala.MablaghTakhfif=cu1.GetString(\"FldM";
Debug.ShouldStop(8);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif")))));
 BA.debugLineNum = 3653;BA.debugLine="ItemKala.fldDarsadTakhfif=\"0\"";
Debug.ShouldStop(16);
_itemkala.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 }else {
 BA.debugLineNum = 3657;BA.debugLine="ItemKala.MablaghTakhfif=\"0\"";
Debug.ShouldStop(256);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, "0"));
 BA.debugLineNum = 3658;BA.debugLine="ItemKala.fldDarsadTakhfif=\"0\"";
Debug.ShouldStop(512);
_itemkala.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 };
 };
 BA.debugLineNum = 3665;BA.debugLine="cu1.Close";
Debug.ShouldStop(65536);
_cu1.runVoidMethod ("Close");
 };
 BA.debugLineNum = 3669;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null Th";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))))) { 
 BA.debugLineNum = 3671;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fld";
Debug.ShouldStop(4194304);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 }else {
 BA.debugLineNum = 3675;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(67108864);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 };
 BA.debugLineNum = 3678;BA.debugLine="If ItemKala.MablaghTakhfif>0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3679;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.Mabl";
Debug.ShouldStop(1073741824);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fee),_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 };
 BA.debugLineNum = 3682;BA.debugLine="ItemKala.FeeForoosh=fee";
Debug.ShouldStop(2);
_itemkala.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _fee));
 BA.debugLineNum = 3685;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString(";
Debug.ShouldStop(16);
_itemkala.setField ("FldMablaghMasrafKonande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldGhymatMasrafkonande"))));
 BA.debugLineNum = 3689;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
Debug.ShouldStop(256);
_itemkala.setField ("fldPathPic" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))));
 BA.debugLineNum = 3696;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\"  Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 3697;BA.debugLine="Dim FldFeeForoosh As Int = Sf.Val(Cu.GetInt(\"";
Debug.ShouldStop(65536);
_fldfeeforoosh = BA.numberCast(int.class, mcode._sf.runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 3698;BA.debugLine="Dim FldTedadDarKarton As Int = Sf.Val(Cu.Gets";
Debug.ShouldStop(131072);
_fldtedaddarkarton = BA.numberCast(int.class, mcode._sf.runMethod(true,"_vvvvv1",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 3699;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\"";
Debug.ShouldStop(262144);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 3700;BA.debugLine="If FldTedadDarKarton>0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_fldtedaddarkarton,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3701;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fl";
Debug.ShouldStop(1048576);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 3703;BA.debugLine="Dim SumKol As Long=(SumMande / FldTedadDarKa";
Debug.ShouldStop(4194304);
_sumkol = BA.numberCast(long.class, (RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)));Debug.locals.put("SumKol", _sumkol);Debug.locals.put("SumKol", _sumkol);
 BA.debugLineNum = 3704;BA.debugLine="ItemKala.SumMandeKarton=SumKol";
Debug.ShouldStop(8388608);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(_sumkol));
 }else {
 BA.debugLineNum = 3706;BA.debugLine="ItemKala.SumMandeKarton=0";
Debug.ShouldStop(33554432);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 };
 BA.debugLineNum = 3713;BA.debugLine="OrginalListKala.Add(ItemKala)";
Debug.ShouldStop(1);
_orginallistkala.runVoidMethod ("Add",(Object)((_itemkala)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3718;BA.debugLine="Cu.Close";
Debug.ShouldStop(32);
_cu.runVoidMethod ("Close");
 };
 BA.debugLineNum = 3732;BA.debugLine="Return OrginalListKala";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return _orginallistkala;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e103) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e103.toString()); BA.debugLineNum = 3735;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","517039565",BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 3736;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(8388608);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","517039566",mcode.mostCurrent.__c.runMethod(false,"LastException",_ba).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 3737;BA.debugLine="myCode.SendError(LastException.Message,\"LoadList";
Debug.ShouldStop(16777216);
mcode.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,_ba,(Object)(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba).runMethod(true,"getMessage")),(Object)(RemoteObject.createImmutable("LoadListKala")));
 };
 BA.debugLineNum = 3752;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _miladitoshamsidate(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("MiladiToShamsiDate (mcode) ","mcode",3,_ba,mcode.mostCurrent,2651);
if (RapidSub.canDelegate("miladitoshamsidate")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","miladitoshamsidate", _ba, _str);}
RemoteObject _t1 = RemoteObject.createImmutable("");
RemoteObject _t2 = RemoteObject.createImmutable("");
RemoteObject _t3 = RemoteObject.createImmutable("");
RemoteObject _pcd = RemoteObject.declareNull("anywheresoftware.b4a.student.PersianDate");
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 2651;BA.debugLine="Sub MiladiToShamsiDate(str As String) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2652;BA.debugLine="Dim T1,T2,T3 As String";
Debug.ShouldStop(134217728);
_t1 = RemoteObject.createImmutable("");Debug.locals.put("T1", _t1);
_t2 = RemoteObject.createImmutable("");Debug.locals.put("T2", _t2);
_t3 = RemoteObject.createImmutable("");Debug.locals.put("T3", _t3);
 BA.debugLineNum = 2653;BA.debugLine="Dim pcd As PersianDate";
Debug.ShouldStop(268435456);
_pcd = RemoteObject.createNew ("anywheresoftware.b4a.student.PersianDate");Debug.locals.put("pcd", _pcd);
 BA.debugLineNum = 2654;BA.debugLine="Log(str.Length)";
Debug.ShouldStop(536870912);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","514811139",BA.NumberToString(_str.runMethod(true,"length")),0);
 BA.debugLineNum = 2655;BA.debugLine="T1=str.SubString2(0,4) '13981120";
Debug.ShouldStop(1073741824);
_t1 = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("T1", _t1);
 BA.debugLineNum = 2656;BA.debugLine="T2=str.SubString2(4,6)'11";
Debug.ShouldStop(-2147483648);
_t2 = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 4)),(Object)(BA.numberCast(int.class, 6)));Debug.locals.put("T2", _t2);
 BA.debugLineNum = 2657;BA.debugLine="T3=str.SubString2(6,8)'20";
Debug.ShouldStop(1);
_t3 = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 8)));Debug.locals.put("T3", _t3);
 BA.debugLineNum = 2658;BA.debugLine="If T2.Length=1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_t2.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2659;BA.debugLine="T2=\"0\"&T2";
Debug.ShouldStop(4);
_t2 = RemoteObject.concat(RemoteObject.createImmutable("0"),_t2);Debug.locals.put("T2", _t2);
 };
 BA.debugLineNum = 2661;BA.debugLine="If T3.Length=1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_t3.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2662;BA.debugLine="T3=\"0\"&T3";
Debug.ShouldStop(32);
_t3 = RemoteObject.concat(RemoteObject.createImmutable("0"),_t3);Debug.locals.put("T3", _t3);
 };
 BA.debugLineNum = 2664;BA.debugLine="Return pcd.getDate(T1,T2,T3,\"/\")";
Debug.ShouldStop(128);
if (true) return _pcd.runMethod(true,"getDate",(Object)(BA.numberCast(int.class, _t1)),(Object)(BA.numberCast(int.class, _t2)),(Object)(BA.numberCast(int.class, _t3)),(Object)(RemoteObject.createImmutable("/")));
 BA.debugLineNum = 2665;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mohasbearzeshafzode(RemoteObject _ba,RemoteObject _sum) throws Exception{
try {
		Debug.PushSubsStack("MohasbeArzeshAfzode (mcode) ","mcode",3,_ba,mcode.mostCurrent,3787);
if (RapidSub.canDelegate("mohasbearzeshafzode")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","mohasbearzeshafzode", _ba, _sum);}
;
Debug.locals.put("Sum", _sum);
 BA.debugLineNum = 3787;BA.debugLine="Sub MohasbeArzeshAfzode(Sum As Long) As Long";
Debug.ShouldStop(1024);
 BA.debugLineNum = 3788;BA.debugLine="If ArzeshAfzodeEnable=1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",mcode._arzeshafzodeenable,BA.NumberToString(1))) { 
 BA.debugLineNum = 3789;BA.debugLine="Return Sum*(ArzeshAfzode/100)";
Debug.ShouldStop(4096);
if (true) return BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_sum,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, mcode._arzeshafzode),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0));
 }else {
 BA.debugLineNum = 3791;BA.debugLine="Return 0";
Debug.ShouldStop(16384);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 3793;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mohasbearzeshafzodekala(RemoteObject _ba,RemoteObject _sum,RemoteObject _arzeshafzodekala) throws Exception{
try {
		Debug.PushSubsStack("MohasbeArzeshAfzodeKala (mcode) ","mcode",3,_ba,mcode.mostCurrent,3795);
if (RapidSub.canDelegate("mohasbearzeshafzodekala")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","mohasbearzeshafzodekala", _ba, _sum, _arzeshafzodekala);}
;
Debug.locals.put("Sum", _sum);
Debug.locals.put("ArzeshAfzodeKala", _arzeshafzodekala);
 BA.debugLineNum = 3795;BA.debugLine="Sub MohasbeArzeshAfzodeKala(Sum As Long,ArzeshAfzo";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3796;BA.debugLine="If myCode.Is_Null_adad(ArzeshAfzodeKala)>0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_arzeshafzodekala))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3797;BA.debugLine="Return Sum*(ArzeshAfzodeKala/100)";
Debug.ShouldStop(1048576);
if (true) return BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_sum,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _arzeshafzodekala),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0));
 }else 
{ BA.debugLineNum = 3798;BA.debugLine="Else If ArzeshAfzodeEnable=1 And  myCode.Is_Null_";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",mcode._arzeshafzodeenable,BA.NumberToString(1)) && RemoteObject.solveBoolean("=",mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_arzeshafzodekala)),BA.NumberToString(0))) { 
 BA.debugLineNum = 3799;BA.debugLine="Return Sum*(ArzeshAfzode/100)";
Debug.ShouldStop(4194304);
if (true) return BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_sum,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, mcode._arzeshafzode),RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0));
 }else {
 BA.debugLineNum = 3801;BA.debugLine="Return 0";
Debug.ShouldStop(16777216);
if (true) return BA.numberCast(long.class, 0);
 }}
;
 BA.debugLineNum = 3803;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openlinkinwebbrwoser(RemoteObject _ba,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("OpenLinkInWebBrwoser (mcode) ","mcode",3,_ba,mcode.mostCurrent,3775);
if (RapidSub.canDelegate("openlinkinwebbrwoser")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","openlinkinwebbrwoser", _ba, _link);}
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
;
Debug.locals.put("link", _link);
 BA.debugLineNum = 3775;BA.debugLine="Sub OpenLinkInWebBrwoser(link As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 3776;BA.debugLine="Dim p1 As PhoneIntents";
Debug.ShouldStop(-2147483648);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 3777;BA.debugLine="StartActivity(p1.OpenBrowser(link))";
Debug.ShouldStop(1);
mcode.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((_p1.runMethod(false,"OpenBrowser",(Object)(_link)))));
 BA.debugLineNum = 3778;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _persiandatedash(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("PersianDateDash (mcode) ","mcode",3,_ba,mcode.mostCurrent,2475);
if (RapidSub.canDelegate("persiandatedash")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","persiandatedash", _ba, _str);}
RemoteObject _t1 = RemoteObject.createImmutable("");
RemoteObject _t2 = RemoteObject.createImmutable("");
RemoteObject _t3 = RemoteObject.createImmutable("");
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 2475;BA.debugLine="Sub PersianDateDash(str As String) As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2476;BA.debugLine="Dim T1,T2,T3 As String";
Debug.ShouldStop(2048);
_t1 = RemoteObject.createImmutable("");Debug.locals.put("T1", _t1);
_t2 = RemoteObject.createImmutable("");Debug.locals.put("T2", _t2);
_t3 = RemoteObject.createImmutable("");Debug.locals.put("T3", _t3);
 BA.debugLineNum = 2477;BA.debugLine="Log(str.Length)";
Debug.ShouldStop(4096);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","514090242",BA.NumberToString(_str.runMethod(true,"length")),0);
 BA.debugLineNum = 2478;BA.debugLine="T1=str.SubString2(0,4) '13981120";
Debug.ShouldStop(8192);
_t1 = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("T1", _t1);
 BA.debugLineNum = 2479;BA.debugLine="T2=str.SubString2(4,6)'11";
Debug.ShouldStop(16384);
_t2 = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 4)),(Object)(BA.numberCast(int.class, 6)));Debug.locals.put("T2", _t2);
 BA.debugLineNum = 2480;BA.debugLine="T3=str.SubString2(6,8)'20";
Debug.ShouldStop(32768);
_t3 = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 8)));Debug.locals.put("T3", _t3);
 BA.debugLineNum = 2481;BA.debugLine="If T2.Length=1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_t2.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2482;BA.debugLine="T2=\"0\"&T2";
Debug.ShouldStop(131072);
_t2 = RemoteObject.concat(RemoteObject.createImmutable("0"),_t2);Debug.locals.put("T2", _t2);
 };
 BA.debugLineNum = 2484;BA.debugLine="If T3.Length=1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_t3.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 2485;BA.debugLine="T3=\"0\"&T3";
Debug.ShouldStop(1048576);
_t3 = RemoteObject.concat(RemoteObject.createImmutable("0"),_t3);Debug.locals.put("T3", _t3);
 };
 BA.debugLineNum = 2487;BA.debugLine="Return T1&\"/\"&T2&\"/\"&T3";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.concat(_t1,RemoteObject.createImmutable("/"),_t2,RemoteObject.createImmutable("/"),_t3);
 BA.debugLineNum = 2489;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Printer (mcode) ","mcode",3,_ba,mcode.mostCurrent,2571);
if (RapidSub.canDelegate("printer")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","printer", _ba);}
RemoteObject _paireddevices = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _devicename = RemoteObject.createImmutable("");
RemoteObject _macaddress = RemoteObject.createImmutable("");
int _i = 0;
;
 BA.debugLineNum = 2571;BA.debugLine="Sub Printer";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2572;BA.debugLine="BtAdmin.Initialize(\"BlueTooth\")";
Debug.ShouldStop(2048);
mcode._btadmin.runVoidMethod ("Initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(RemoteObject.createImmutable("BlueTooth")));
 BA.debugLineNum = 2573;BA.debugLine="BTConnection.Initialize(\"Printer\")";
Debug.ShouldStop(4096);
mcode._btconnection.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Printer")));
 BA.debugLineNum = 2574;BA.debugLine="If BTConnection.IsEnabled=True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",mcode._btconnection.runMethod(true,"IsEnabled"),mcode.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2575;BA.debugLine="Dim PairedDevices As Map";
Debug.ShouldStop(16384);
_paireddevices = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("PairedDevices", _paireddevices);
 BA.debugLineNum = 2576;BA.debugLine="PairedDevices = BTConnection.GetPairedDevices";
Debug.ShouldStop(32768);
_paireddevices = mcode._btconnection.runMethod(false,"GetPairedDevices");Debug.locals.put("PairedDevices", _paireddevices);
 BA.debugLineNum = 2577;BA.debugLine="Dim l As List";
Debug.ShouldStop(65536);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l", _l);
 BA.debugLineNum = 2578;BA.debugLine="Dim DeviceName, MacAddress As String";
Debug.ShouldStop(131072);
_devicename = RemoteObject.createImmutable("");Debug.locals.put("DeviceName", _devicename);
_macaddress = RemoteObject.createImmutable("");Debug.locals.put("MacAddress", _macaddress);
 BA.debugLineNum = 2579;BA.debugLine="l.Initialize";
Debug.ShouldStop(262144);
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 2580;BA.debugLine="For i = 0 To PairedDevices.Size - 1 'Check all de";
Debug.ShouldStop(524288);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_paireddevices.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2581;BA.debugLine="l.Add(PairedDevices.GetKeyAt(i))";
Debug.ShouldStop(1048576);
_l.runVoidMethod ("Add",(Object)(_paireddevices.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 2582;BA.debugLine="DeviceName=PairedDevices.Getkeyat(i)";
Debug.ShouldStop(2097152);
_devicename = BA.ObjectToString(_paireddevices.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("DeviceName", _devicename);
 BA.debugLineNum = 2583;BA.debugLine="MacAddress=PairedDevices.GetValueAt(i)";
Debug.ShouldStop(4194304);
_macaddress = BA.ObjectToString(_paireddevices.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("MacAddress", _macaddress);
 BA.debugLineNum = 2584;BA.debugLine="Log(DeviceName & \" -> \" & MacAddress)";
Debug.ShouldStop(8388608);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","514549005",RemoteObject.concat(_devicename,RemoteObject.createImmutable(" -> "),_macaddress),0);
 BA.debugLineNum = 2585;BA.debugLine="If DeviceName.Contains(\"Thermal\") Then 'Insert";
Debug.ShouldStop(16777216);
if (_devicename.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Thermal"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2586;BA.debugLine="Exit";
Debug.ShouldStop(33554432);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2589;BA.debugLine="BTConnection.Connect(MacAddress)";
Debug.ShouldStop(268435456);
mcode._btconnection.runVoidMethod ("Connect",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(_macaddress));
 }else {
 BA.debugLineNum = 2591;BA.debugLine="ToastMessageShow(\"بلوتوث گوشی شما غیر فعال می با";
Debug.ShouldStop(1073741824);
mcode.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("بلوتوث گوشی شما غیر فعال می باشد")),(Object)(mcode.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 2594;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim Sql1 As SQL";
mcode._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 3;BA.debugLine="Dim Sf As StringFunctions";
mcode._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");
 //BA.debugLineNum = 4;BA.debugLine="Dim IconView As Amir_IconView";
mcode._iconview = RemoteObject.createNew ("ir.aghajari.iconanim.Amir_IconView");
 //BA.debugLineNum = 5;BA.debugLine="Dim PersianDate As PersianDate";
mcode._persiandate = RemoteObject.createNew ("anywheresoftware.b4a.student.PersianDate");
 //BA.debugLineNum = 6;BA.debugLine="Dim MD As MSMaterialDrawer";
mcode._md = RemoteObject.createNew ("com.maximussoft.msmaterialdrawer.MSMaterialDrawer");
 //BA.debugLineNum = 7;BA.debugLine="Dim Json As JSONParser";
mcode._json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");
 //BA.debugLineNum = 8;BA.debugLine="Dim jsonG As JSONGenerator";
mcode._jsong = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
 //BA.debugLineNum = 9;BA.debugLine="Dim P As PhoneId";
mcode._p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneId");
 //BA.debugLineNum = 10;BA.debugLine="Dim PImei As Phone";
mcode._pimei = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 11;BA.debugLine="Dim Imei As PhoneId";
mcode._imei = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneId");
 //BA.debugLineNum = 12;BA.debugLine="Dim strImei As String";
mcode._strimei = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Type AdapterItemHome(img As String,title As Strin";
;
 //BA.debugLineNum = 14;BA.debugLine="Type AdapterChangeFeeKala(FldCodKala As String,Fl";
;
 //BA.debugLineNum = 15;BA.debugLine="Type AdapterGoroohKala(FldC_Gorooh As String,FldN";
;
 //BA.debugLineNum = 16;BA.debugLine="Type AdapterAndroidLog(message As String,date As";
;
 //BA.debugLineNum = 17;BA.debugLine="Type AdapterListBackupFile(FileName As String,Dat";
;
 //BA.debugLineNum = 18;BA.debugLine="Type AdapterListKala(CodeGroup As String,CodeKala";
;
 //BA.debugLineNum = 19;BA.debugLine="Type AdapterGoroohAshkhas(FldC_Gorooh As String,F";
;
 //BA.debugLineNum = 21;BA.debugLine="Type AdapterSendFaktor(FldRadif As String,FldShom";
;
 //BA.debugLineNum = 23;BA.debugLine="Type AdapterFaktor(FldId As Int,FldRadif As Strin";
;
 //BA.debugLineNum = 24;BA.debugLine="Type AdapterListAshkhas(CodeTafzili As String,Sha";
;
 //BA.debugLineNum = 25;BA.debugLine="Type AdapterListTicket(FldCode As String,FldOnvan";
;
 //BA.debugLineNum = 26;BA.debugLine="Type AdapterListNoeTasvie(FldC_Tasvie As String,F";
;
 //BA.debugLineNum = 27;BA.debugLine="Type AdapterListFaktor(C_Name,fldShomareFaktor,fl";
;
 //BA.debugLineNum = 28;BA.debugLine="Type AdapterListRizeFaktor(FldRadif,C_Name,fldSho";
;
 //BA.debugLineNum = 29;BA.debugLine="Type FinalFaktor_(SoodVisitor,MandeHesab,date,shf";
;
 //BA.debugLineNum = 30;BA.debugLine="Type AdapterReportVisitor(fldSharhKala,fldTedadJo";
;
 //BA.debugLineNum = 31;BA.debugLine="Type AdapterReportMoshtari(fldFeeJoz,fldFeeBargas";
;
 //BA.debugLineNum = 32;BA.debugLine="Type AdapterReportSooratHesab(fldRadif,shomare,fl";
;
 //BA.debugLineNum = 33;BA.debugLine="Type AdapterListNotif(FldId As String,FldTitle As";
;
 //BA.debugLineNum = 35;BA.debugLine="Type AdapterListTour(CodeVisitor As String,indexT";
;
 //BA.debugLineNum = 36;BA.debugLine="Type AdapterListRizeTour(Id As Int,fldRadif As In";
;
 //BA.debugLineNum = 39;BA.debugLine="Type AdapterListEshantion(ID,fldCodeKalaForoosh,f";
;
 //BA.debugLineNum = 40;BA.debugLine="Type AdapterListEshantionGroup(ID,fldCodeGroupKal";
;
 //BA.debugLineNum = 41;BA.debugLine="Type AdapterListEshantionGroupContent(fldCodeGrou";
;
 //BA.debugLineNum = 42;BA.debugLine="Type AdapteRepFactorVisitor(fldShomareFactor,fldC";
;
 //BA.debugLineNum = 43;BA.debugLine="Type AdapteRepRizFactorVisitor(fldRadif,fldShomar";
;
 //BA.debugLineNum = 44;BA.debugLine="Type AdapteRepHavale(fldShomareHavale,fldDate,fld";
;
 //BA.debugLineNum = 45;BA.debugLine="Type AdapteRizHavale(fldShomareFactor,fldCodeTafz";
;
 //BA.debugLineNum = 46;BA.debugLine="Type AdapteRizFactorHavale(fldShomareFactor,fldSh";
;
 //BA.debugLineNum = 47;BA.debugLine="Type AdapterListSabt(FldShomareSabt As String,Fld";
;
 //BA.debugLineNum = 48;BA.debugLine="Type AdapterListVideo(Id As String,fldTitle As St";
;
 //BA.debugLineNum = 49;BA.debugLine="Type AdapterListCheckDaryafti(ID As String,fldSho";
;
 //BA.debugLineNum = 50;BA.debugLine="Type AdapteEnterExitVisitor(fldType,fldDate,fldTi";
;
 //BA.debugLineNum = 51;BA.debugLine="Type AdapteVersion(FldVersion,FldLink,FldDateUpda";
;
 //BA.debugLineNum = 52;BA.debugLine="Dim Font2 = Typeface.LoadFromAssets(\"IRANSansMobi";
mcode._font2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
mcode._font2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), mcode.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("IRANSansMobile(FaNum)_Bold.ttf"))));
 //BA.debugLineNum = 54;BA.debugLine="Dim placeHolder As Bitmap";
mcode._placeholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Dim VahedPool As String";
mcode._vahedpool = RemoteObject.createImmutable("");
 //BA.debugLineNum = 56;BA.debugLine="Dim RaghamAshar As String";
mcode._raghamashar = RemoteObject.createImmutable("");
 //BA.debugLineNum = 57;BA.debugLine="Dim C_Visitor,N_Visitor As String";
mcode._c_visitor = RemoteObject.createImmutable("");
mcode._n_visitor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 58;BA.debugLine="Dim Url As String";
mcode._url = RemoteObject.createImmutable("");
 //BA.debugLineNum = 59;BA.debugLine="Dim kalamanfi As String";
mcode._kalamanfi = RemoteObject.createImmutable("");
 //BA.debugLineNum = 60;BA.debugLine="Dim TaghirFeeKala As String";
mcode._taghirfeekala = RemoteObject.createImmutable("");
 //BA.debugLineNum = 61;BA.debugLine="Dim TakhfifKala As String";
mcode._takhfifkala = RemoteObject.createImmutable("");
 //BA.debugLineNum = 62;BA.debugLine="Dim BackPage As String";
mcode._backpage = RemoteObject.createImmutable("");
 //BA.debugLineNum = 63;BA.debugLine="Dim ShomareFaktor As String";
mcode._shomarefaktor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 64;BA.debugLine="Dim NoeFaktorClick As String";
mcode._noefaktorclick = RemoteObject.createImmutable("");
 //BA.debugLineNum = 65;BA.debugLine="Dim NoeFaktorChecked As String = \"NewFaktor\"";
mcode._noefaktorchecked = BA.ObjectToString("NewFaktor");
 //BA.debugLineNum = 66;BA.debugLine="Dim ServiceGpsActive As Int";
mcode._servicegpsactive = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 67;BA.debugLine="Dim C_Tafzili,N_Tafzili,Address_Tafzili,Tell_Tafz";
mcode._c_tafzili = RemoteObject.createImmutable("");
mcode._n_tafzili = RemoteObject.createImmutable("");
mcode._address_tafzili = RemoteObject.createImmutable("");
mcode._tell_tafzili = RemoteObject.createImmutable("");
 //BA.debugLineNum = 68;BA.debugLine="Dim Version As String = Application.VersionName";
mcode._version = mcode.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionName");
 //BA.debugLineNum = 69;BA.debugLine="Dim NamayeshKalaSefr As String";
mcode._namayeshkalasefr = RemoteObject.createImmutable("");
 //BA.debugLineNum = 70;BA.debugLine="Dim NewVersion,LinkDownload As String";
mcode._newversion = RemoteObject.createImmutable("");
mcode._linkdownload = RemoteObject.createImmutable("");
 //BA.debugLineNum = 71;BA.debugLine="Dim C_LayeKala As String";
mcode._c_layekala = RemoteObject.createImmutable("");
 //BA.debugLineNum = 72;BA.debugLine="Dim C_LayeAshkhas As String";
mcode._c_layeashkhas = RemoteObject.createImmutable("");
 //BA.debugLineNum = 73;BA.debugLine="Dim DateFaktor As String";
mcode._datefaktor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 74;BA.debugLine="Dim VaziatPardakhtFaktor As String";
mcode._vaziatpardakhtfaktor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 75;BA.debugLine="Dim PrintBuffer As String";
mcode._printbuffer = RemoteObject.createImmutable("");
 //BA.debugLineNum = 76;BA.debugLine="Dim BtAdmin As BluetoothAdmin";
mcode._btadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.Serial.BluetoothAdmin");
 //BA.debugLineNum = 77;BA.debugLine="Dim BTConnection As Serial";
mcode._btconnection = RemoteObject.createNew ("anywheresoftware.b4a.objects.Serial");
 //BA.debugLineNum = 78;BA.debugLine="Dim Printers As TextWriter";
mcode._printers = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Dim Sf As StringFunctions";
mcode._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");
 //BA.debugLineNum = 80;BA.debugLine="Dim TypeGetData As String";
mcode._typegetdata = RemoteObject.createImmutable("");
 //BA.debugLineNum = 81;BA.debugLine="Dim LoadEnable As Boolean";
mcode._loadenable = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 82;BA.debugLine="Dim PauseState As Boolean";
mcode._pausestate = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 83;BA.debugLine="Public DeviceId As String";
mcode._deviceid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 84;BA.debugLine="Dim IsActive As Boolean=False";
mcode._isactive = mcode.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 85;BA.debugLine="Public SaveFactorInLocation As Boolean";
mcode._savefactorinlocation = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 86;BA.debugLine="Public Masafat As Long";
mcode._masafat = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 87;BA.debugLine="Dim TokenPush As String";
mcode._tokenpush = RemoteObject.createImmutable("");
 //BA.debugLineNum = 88;BA.debugLine="Dim PushBody As String";
mcode._pushbody = RemoteObject.createImmutable("");
 //BA.debugLineNum = 89;BA.debugLine="Dim DastrasiGroupKala,DastrasiGroupAshkhas As Int";
mcode._dastrasigroupkala = RemoteObject.createImmutable(0);
mcode._dastrasigroupashkhas = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 90;BA.debugLine="Dim OriginalListFaktor As List";
mcode._originallistfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 91;BA.debugLine="Dim TextSizePdf As Int=4.5";
mcode._textsizepdf = BA.numberCast(int.class, 4.5);
 //BA.debugLineNum = 92;BA.debugLine="Dim bmtSignature As Bitmap";
mcode._bmtsignature = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Dim GpsIsEnable As Boolean=True";
mcode._gpsisenable = mcode.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 94;BA.debugLine="Dim PrinterType As Int=0";
mcode._printertype = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 95;BA.debugLine="Dim Vaziat As Int";
mcode._vaziat = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 96;BA.debugLine="Dim CodeMoshtari As String";
mcode._codemoshtari = RemoteObject.createImmutable("");
 //BA.debugLineNum = 97;BA.debugLine="Dim ImageUrl As String";
mcode._imageurl = RemoteObject.createImmutable("");
 //BA.debugLineNum = 98;BA.debugLine="Dim BackToActivity As String";
mcode._backtoactivity = RemoteObject.createImmutable("");
 //BA.debugLineNum = 101;BA.debugLine="Dim AppName As String=Application.LabelName";
mcode._appname = mcode.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName");
 //BA.debugLineNum = 102;BA.debugLine="Dim MenuTitle2 As String=\"\"";
mcode._menutitle2 = BA.ObjectToString("");
 //BA.debugLineNum = 103;BA.debugLine="Dim AppVer As String=\"V: \" & Application.VersionC";
mcode._appver = RemoteObject.concat(RemoteObject.createImmutable("V: "),mcode.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"));
 //BA.debugLineNum = 104;BA.debugLine="Dim Plan As String = 4";
mcode._plan = BA.NumberToString(4);
 //BA.debugLineNum = 105;BA.debugLine="Dim Code As String = 9000015";
mcode._code = BA.NumberToString(9000015);
 //BA.debugLineNum = 106;BA.debugLine="Dim HaveShift As Boolean";
mcode._haveshift = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 107;BA.debugLine="Dim EtelaResani As String=0";
mcode._etelaresani = BA.NumberToString(0);
 //BA.debugLineNum = 108;BA.debugLine="Dim fldNewMoshtari As String = 0";
mcode._fldnewmoshtari = BA.NumberToString(0);
 //BA.debugLineNum = 109;BA.debugLine="Dim ShowBedehkaran As String=0";
mcode._showbedehkaran = BA.NumberToString(0);
 //BA.debugLineNum = 110;BA.debugLine="Dim NoeGet As String = \"\"";
mcode._noeget = BA.ObjectToString("");
 //BA.debugLineNum = 111;BA.debugLine="Dim isFloat As Boolean";
mcode._isfloat = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 112;BA.debugLine="Dim Rs As RichString";
mcode._rs = RemoteObject.createNew ("anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString");
 //BA.debugLineNum = 113;BA.debugLine="Dim page As String = \"\"";
mcode._page = BA.ObjectToString("");
 //BA.debugLineNum = 114;BA.debugLine="Dim Gps As String=0";
mcode._gps = BA.NumberToString(0);
 //BA.debugLineNum = 115;BA.debugLine="Dim SabtGpsShakhs As String=0";
mcode._sabtgpsshakhs = BA.NumberToString(0);
 //BA.debugLineNum = 116;BA.debugLine="Dim ShowGpsShakhs As String=0";
mcode._showgpsshakhs = BA.NumberToString(0);
 //BA.debugLineNum = 117;BA.debugLine="Dim Action As String=0";
mcode._action = BA.NumberToString(0);
 //BA.debugLineNum = 118;BA.debugLine="Dim FaktorSelect As String=\"\"";
mcode._faktorselect = BA.ObjectToString("");
 //BA.debugLineNum = 119;BA.debugLine="Dim ForooshBishAzMojoodi As String = 0";
mcode._forooshbishazmojoodi = BA.NumberToString(0);
 //BA.debugLineNum = 120;BA.debugLine="Dim Signature As String=1";
mcode._signature = BA.NumberToString(1);
 //BA.debugLineNum = 121;BA.debugLine="Dim VoroodTozihKala As String=0";
mcode._voroodtozihkala = BA.NumberToString(0);
 //BA.debugLineNum = 122;BA.debugLine="Dim DarsadSood As String=0";
mcode._darsadsood = BA.NumberToString(0);
 //BA.debugLineNum = 123;BA.debugLine="Dim DarsadTakhfifVizhe As Int = 0";
mcode._darsadtakhfifvizhe = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 124;BA.debugLine="Dim KharidBiashAz As String=0";
mcode._kharidbiashaz = BA.NumberToString(0);
 //BA.debugLineNum = 125;BA.debugLine="Dim DateTimeSend As String=0";
mcode._datetimesend = BA.NumberToString(0);
 //BA.debugLineNum = 126;BA.debugLine="Dim DateTimeRecive As String=0";
mcode._datetimerecive = BA.NumberToString(0);
 //BA.debugLineNum = 127;BA.debugLine="Dim ShomareSabt As String=0";
mcode._shomaresabt = BA.NumberToString(0);
 //BA.debugLineNum = 128;BA.debugLine="Dim IconLink As String =\"\"";
mcode._iconlink = BA.ObjectToString("");
 //BA.debugLineNum = 129;BA.debugLine="Dim FinalFaktor As FinalFaktor_";
mcode._finalfaktor = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._finalfaktor_");
 //BA.debugLineNum = 130;BA.debugLine="Dim Su As StringUtils";
mcode._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");
 //BA.debugLineNum = 131;BA.debugLine="Dim ListNotif As List";
mcode._listnotif = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 132;BA.debugLine="Dim CodeVisitorSelect As String=0";
mcode._codevisitorselect = BA.NumberToString(0);
 //BA.debugLineNum = 133;BA.debugLine="Dim CodeMoshtariSelect As String=0";
mcode._codemoshtariselect = BA.NumberToString(0);
 //BA.debugLineNum = 134;BA.debugLine="Dim CountShowGpsMap As String=0";
mcode._countshowgpsmap = BA.NumberToString(0);
 //BA.debugLineNum = 135;BA.debugLine="Dim Tag As Object=0";
mcode._tag = RemoteObject.createImmutable((0));
 //BA.debugLineNum = 136;BA.debugLine="Dim Admin As String";
mcode._admin = RemoteObject.createImmutable("");
 //BA.debugLineNum = 137;BA.debugLine="Dim Tozie As String=0";
mcode._tozie = BA.NumberToString(0);
 //BA.debugLineNum = 138;BA.debugLine="Dim Visitor As String=0";
mcode._visitor = BA.NumberToString(0);
 //BA.debugLineNum = 139;BA.debugLine="Dim SendMarjoie As String=0";
mcode._sendmarjoie = BA.NumberToString(0);
 //BA.debugLineNum = 140;BA.debugLine="Dim CheckAdmin As String";
mcode._checkadmin = RemoteObject.createImmutable("");
 //BA.debugLineNum = 141;BA.debugLine="Dim HideMojodi As String";
mcode._hidemojodi = RemoteObject.createImmutable("");
 //BA.debugLineNum = 142;BA.debugLine="Dim MablaghKol As String";
mcode._mablaghkol = RemoteObject.createImmutable("");
 //BA.debugLineNum = 143;BA.debugLine="Dim Tozihat_faktor As String";
mcode._tozihat_faktor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 144;BA.debugLine="Dim NoeTasvieFaktor As String";
mcode._noetasviefaktor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 145;BA.debugLine="Dim DateVersion As String";
mcode._dateversion = RemoteObject.createImmutable("");
 //BA.debugLineNum = 146;BA.debugLine="Dim IsOnlineDataFactor As String=0";
mcode._isonlinedatafactor = BA.NumberToString(0);
 //BA.debugLineNum = 147;BA.debugLine="Dim feeTip As String=0";
mcode._feetip = BA.NumberToString(0);
 //BA.debugLineNum = 148;BA.debugLine="Dim feeCode As String=0";
mcode._feecode = BA.NumberToString(0);
 //BA.debugLineNum = 149;BA.debugLine="Dim PicOnline As String";
mcode._piconline = RemoteObject.createImmutable("");
 //BA.debugLineNum = 150;BA.debugLine="Dim ConnectionStatus As String=0";
mcode._connectionstatus = BA.NumberToString(0);
 //BA.debugLineNum = 151;BA.debugLine="Dim ArrayTasvieForKala() As String";
mcode._arraytasvieforkala = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 152;BA.debugLine="Dim TypeVersion As String=\"UpdateNew\"";
mcode._typeversion = BA.ObjectToString("UpdateNew");
 //BA.debugLineNum = 153;BA.debugLine="Dim NumberVersion As String=Application.VersionCo";
mcode._numberversion = BA.NumberToString(mcode.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"));
 //BA.debugLineNum = 154;BA.debugLine="Dim DateVersion As String=\"1403/08/15\"";
mcode._dateversion = BA.ObjectToString("1403/08/15");
 //BA.debugLineNum = 155;BA.debugLine="Dim DarkMode As String=\"False\"";
mcode._darkmode = BA.ObjectToString("False");
 //BA.debugLineNum = 156;BA.debugLine="Dim colorPrimary As Int";
mcode._colorprimary = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 157;BA.debugLine="Dim colorPrimaryDark As Int";
mcode._colorprimarydark = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 158;BA.debugLine="Dim colorAccent As Int";
mcode._coloraccent = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 159;BA.debugLine="Dim Vpn As Boolean";
mcode._vpn = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 160;BA.debugLine="Dim IntervalGps As Int=1";
mcode._intervalgps = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 161;BA.debugLine="Dim Lat,Lon As String";
mcode._lat = RemoteObject.createImmutable("");
mcode._lon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 162;BA.debugLine="Dim GetHavaleFlag As Int=0";
mcode._gethavaleflag = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 163;BA.debugLine="Dim ShomareHavale As String=0";
mcode._shomarehavale = BA.NumberToString(0);
 //BA.debugLineNum = 164;BA.debugLine="Dim ShomareDaryaft As String=0";
mcode._shomaredaryaft = BA.NumberToString(0);
 //BA.debugLineNum = 165;BA.debugLine="Dim VideoSelected As String=0";
mcode._videoselected = BA.NumberToString(0);
 //BA.debugLineNum = 166;BA.debugLine="Dim lstChangeFeeKala As List";
mcode._lstchangefeekala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 167;BA.debugLine="Dim downloadingData As Boolean";
mcode._downloadingdata = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 168;BA.debugLine="Dim GpsDateTa As String,GpsTimeAz As String,GpsTi";
mcode._gpsdateta = RemoteObject.createImmutable("");
mcode._gpstimeaz = RemoteObject.createImmutable("");
mcode._gpstimeta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 169;BA.debugLine="Dim GetDataOnline As String=0";
mcode._getdataonline = BA.NumberToString(0);
 //BA.debugLineNum = 170;BA.debugLine="Dim Daryaft As String=0";
mcode._daryaft = BA.NumberToString(0);
 //BA.debugLineNum = 171;BA.debugLine="Dim Amani As String=0";
mcode._amani = BA.NumberToString(0);
 //BA.debugLineNum = 172;BA.debugLine="Dim isAmani As String=0";
mcode._isamani = BA.NumberToString(0);
 //BA.debugLineNum = 173;BA.debugLine="Dim SetVisit As String=0";
mcode._setvisit = BA.NumberToString(0);
 //BA.debugLineNum = 174;BA.debugLine="Dim MojavezSefaresh As String=0";
mcode._mojavezsefaresh = BA.NumberToString(0);
 //BA.debugLineNum = 175;BA.debugLine="Dim DeleteAshkhasNew As Boolean=False";
mcode._deleteashkhasnew = mcode.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 176;BA.debugLine="Dim RotatePic As Boolean=False";
mcode._rotatepic = mcode.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 177;BA.debugLine="Dim UpdateShakhs As Boolean=False";
mcode._updateshakhs = mcode.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 178;BA.debugLine="Dim FeeChange As String=0";
mcode._feechange = BA.NumberToString(0);
 //BA.debugLineNum = 179;BA.debugLine="Dim EshantionTabaghati As String=0";
mcode._eshantiontabaghati = BA.NumberToString(0);
 //BA.debugLineNum = 180;BA.debugLine="Dim EshantionGroup As String=0";
mcode._eshantiongroup = BA.NumberToString(0);
 //BA.debugLineNum = 181;BA.debugLine="Dim EshantionRemove As String=0";
mcode._eshantionremove = BA.NumberToString(0);
 //BA.debugLineNum = 182;BA.debugLine="Dim CountEshantionGroup As String=0";
mcode._counteshantiongroup = BA.NumberToString(0);
 //BA.debugLineNum = 183;BA.debugLine="Dim MandeEtebar As String=0";
mcode._mandeetebar = BA.NumberToString(0);
 //BA.debugLineNum = 184;BA.debugLine="Dim MandeHesab As String=0";
mcode._mandehesab = BA.NumberToString(0);
 //BA.debugLineNum = 185;BA.debugLine="Dim ManedEtebarEnable As Boolean=False";
mcode._manedetebarenable = mcode.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 186;BA.debugLine="Dim th As Thread";
mcode._th = RemoteObject.createNew ("anywheresoftware.b4a.agraham.threading.Threading");
 //BA.debugLineNum = 187;BA.debugLine="Dim linkposparsian As String";
mcode._linkposparsian = RemoteObject.createImmutable("");
 //BA.debugLineNum = 189;BA.debugLine="Dim PackageNamePosParsian As String=\"com.parsikhe";
mcode._packagenameposparsian = BA.ObjectToString("com.parsikhesab.parsianpos");
 //BA.debugLineNum = 190;BA.debugLine="Dim StatusPicKala As String";
mcode._statuspickala = RemoteObject.createImmutable("");
 //BA.debugLineNum = 191;BA.debugLine="Dim CodeKalaImage As String";
mcode._codekalaimage = RemoteObject.createImmutable("");
 //BA.debugLineNum = 192;BA.debugLine="Dim CompanyName As String";
mcode._companyname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 193;BA.debugLine="Dim CompanyTell As String";
mcode._companytell = RemoteObject.createImmutable("");
 //BA.debugLineNum = 194;BA.debugLine="Dim CompanyAddress As String";
mcode._companyaddress = RemoteObject.createImmutable("");
 //BA.debugLineNum = 195;BA.debugLine="Dim MobileIsImportent As String=0";
mcode._mobileisimportent = BA.NumberToString(0);
 //BA.debugLineNum = 197;BA.debugLine="Dim ArzeshAfzode As String=0";
mcode._arzeshafzode = BA.NumberToString(0);
 //BA.debugLineNum = 198;BA.debugLine="Dim ArzeshAfzodeEnable As String=0";
mcode._arzeshafzodeenable = BA.NumberToString(0);
 //BA.debugLineNum = 199;BA.debugLine="Dim UpdateSefaresh As Boolean=False";
mcode._updatesefaresh = mcode.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 200;BA.debugLine="Dim fusLat As String=\"\"";
mcode._fuslat = BA.ObjectToString("");
 //BA.debugLineNum = 201;BA.debugLine="Dim fusLon As String=\"\"";
mcode._fuslon = BA.ObjectToString("");
 //BA.debugLineNum = 202;BA.debugLine="Dim fusGetTime As String=\"00:00\"";
mcode._fusgettime = BA.ObjectToString("00:00");
 //BA.debugLineNum = 203;BA.debugLine="Dim widgetEnable As Boolean=False";
mcode._widgetenable = mcode.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 204;BA.debugLine="Dim editFactor As Boolean";
mcode._editfactor = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 205;BA.debugLine="Dim TourVisit As String=0";
mcode._tourvisit = BA.NumberToString(0);
 //BA.debugLineNum = 206;BA.debugLine="Dim receiver2 As PNBroadcastReceiver";
mcode._receiver2 = RemoteObject.createNew ("PNBroadcastReceiver.PNBrodcastReceiver");
 //BA.debugLineNum = 207;BA.debugLine="Dim TourVisitSW As Boolean";
mcode._tourvisitsw = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 208;BA.debugLine="Dim GetDataStatus As Boolean=False";
mcode._getdatastatus = mcode.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _qomaashar(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("qomaAshar (mcode) ","mcode",3,_ba,mcode.mostCurrent,2547);
if (RapidSub.canDelegate("qomaashar")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","qomaashar", _ba, _str);}
RemoteObject _d = RemoteObject.createImmutable("");
RemoteObject _doub = RemoteObject.createImmutable(0);
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 2547;BA.debugLine="Sub qomaAshar(str As Object) As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2548;BA.debugLine="Dim d As String";
Debug.ShouldStop(524288);
_d = RemoteObject.createImmutable("");Debug.locals.put("d", _d);
 BA.debugLineNum = 2549;BA.debugLine="Dim doub As Double";
Debug.ShouldStop(1048576);
_doub = RemoteObject.createImmutable(0);Debug.locals.put("doub", _doub);
 BA.debugLineNum = 2550;BA.debugLine="If str <>\"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_str,RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 2551;BA.debugLine="doub=str";
Debug.ShouldStop(4194304);
_doub = BA.numberCast(double.class, _str);Debug.locals.put("doub", _doub);
 BA.debugLineNum = 2552;BA.debugLine="d=NumberFormat(doub,0,0)";
Debug.ShouldStop(8388608);
_d = mcode.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_doub),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("d", _d);
 };
 BA.debugLineNum = 2555;BA.debugLine="Return d";
Debug.ShouldStop(67108864);
if (true) return _d;
 BA.debugLineNum = 2556;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeqomaashar(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("RemoveqomaAshar (mcode) ","mcode",3,_ba,mcode.mostCurrent,2558);
if (RapidSub.canDelegate("removeqomaashar")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","removeqomaashar", _ba, _s);}
RemoteObject _num = RemoteObject.createImmutable(0);
;
Debug.locals.put("S", _s);
 BA.debugLineNum = 2558;BA.debugLine="Sub RemoveqomaAshar(S As String) As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2559;BA.debugLine="Dim Num As Int";
Debug.ShouldStop(1073741824);
_num = RemoteObject.createImmutable(0);Debug.locals.put("Num", _num);
 BA.debugLineNum = 2560;BA.debugLine="S=s.Replace(\",\",\"\")";
Debug.ShouldStop(-2147483648);
_s = _s.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("S", _s);
 BA.debugLineNum = 2561;BA.debugLine="Num=S";
Debug.ShouldStop(1);
_num = BA.numberCast(int.class, _s);Debug.locals.put("Num", _num);
 BA.debugLineNum = 2562;BA.debugLine="Return Num";
Debug.ShouldStop(2);
if (true) return _num;
 BA.debugLineNum = 2563;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeslashdate(RemoteObject _ba,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("RemoveSlashDate (mcode) ","mcode",3,_ba,mcode.mostCurrent,3470);
if (RapidSub.canDelegate("removeslashdate")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","removeslashdate", _ba, _date);}
;
Debug.locals.put("date", _date);
 BA.debugLineNum = 3470;BA.debugLine="Sub RemoveSlashDate(date As String) As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 3471;BA.debugLine="Return date.Replace(\"/\",\"\")";
Debug.ShouldStop(16384);
if (true) return _date.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3472;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _result(RemoteObject _ba,RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("Result (mcode) ","mcode",3,_ba,mcode.mostCurrent,429);
if (RapidSub.canDelegate("result")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","result", _ba, _query);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
Debug.locals.put("Query", _query);
 BA.debugLineNum = 429;BA.debugLine="Sub Result(Query As String) As Cursor";
Debug.ShouldStop(4096);
 BA.debugLineNum = 431;BA.debugLine="Dim Cu As Cursor";
Debug.ShouldStop(16384);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 432;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 433;BA.debugLine="If Sql1.IsInitialized=False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",mcode._sql1.runMethod(true,"IsInitialized"),mcode.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 434;BA.debugLine="Initialize";
Debug.ShouldStop(131072);
_initialize(_ba);
 };
 BA.debugLineNum = 436;BA.debugLine="Cu=Sql1.ExecQuery(Query)";
Debug.ShouldStop(524288);
_cu = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mcode._sql1.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("Cu", _cu);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e8.toString()); BA.debugLineNum = 438;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513369353",BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 439;BA.debugLine="myCode.SendError(LastException,\"MCode-Result\")";
Debug.ShouldStop(4194304);
mcode.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,_ba,(Object)(BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba))),(Object)(RemoteObject.createImmutable("MCode-Result")));
 };
 BA.debugLineNum = 442;BA.debugLine="Return Cu";
Debug.ShouldStop(33554432);
if (true) return _cu;
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savejsonfile(RemoteObject _ba,RemoteObject _fileroot,RemoteObject _filename,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("SaveJsonFile (mcode) ","mcode",3,_ba,mcode.mostCurrent,3065);
if (RapidSub.canDelegate("savejsonfile")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","savejsonfile", _ba, _fileroot, _filename, _data);}
RemoteObject _b = RemoteObject.createImmutable(false);
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
;
Debug.locals.put("fileRoot", _fileroot);
Debug.locals.put("filename", _filename);
Debug.locals.put("data", _data);
 BA.debugLineNum = 3065;BA.debugLine="Public Sub SaveJsonFile(fileRoot As String,filenam";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 3066;BA.debugLine="Dim b As Boolean=False";
Debug.ShouldStop(33554432);
_b = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 3067;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 3068;BA.debugLine="If File.Exists(fileRoot,filename)=False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_fileroot),(Object)(_filename)),mcode.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 3069;BA.debugLine="File.MakeDir(fileRoot,filename)";
Debug.ShouldStop(268435456);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(_fileroot),(Object)(_filename));
 };
 BA.debugLineNum = 3071;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(1073741824);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 3072;BA.debugLine="JSONGenerator.Initialize2(data)";
Debug.ShouldStop(-2147483648);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_data));
 BA.debugLineNum = 3073;BA.debugLine="File.WriteString(fileRoot,filename,JSONGenerator";
Debug.ShouldStop(1);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_fileroot),(Object)(_filename),(Object)(_jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 3074;BA.debugLine="b=True";
Debug.ShouldStop(2);
_b = mcode.mostCurrent.__c.getField(true,"True");Debug.locals.put("b", _b);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e11.toString()); BA.debugLineNum = 3076;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","515925259",BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 3077;BA.debugLine="b=False";
Debug.ShouldStop(16);
_b = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("b", _b);
 };
 BA.debugLineNum = 3079;BA.debugLine="Return b";
Debug.ShouldStop(64);
if (true) return _b;
 BA.debugLineNum = 3080;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savelocationtodb(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("SaveLocationToDb (mcode) ","mcode",3,_ba,mcode.mostCurrent,3280);
if (RapidSub.canDelegate("savelocationtodb")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","savelocationtodb", _ba);}
;
 BA.debugLineNum = 3280;BA.debugLine="Sub SaveLocationToDb";
Debug.ShouldStop(32768);
 BA.debugLineNum = 3327;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savelog(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("SaveLog (mcode) ","mcode",3,_ba,mcode.mostCurrent,419);
if (RapidSub.canDelegate("savelog")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","savelog", _ba, _str);}
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 419;BA.debugLine="Sub SaveLog(str As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 421;BA.debugLine="File.WriteString(File.DirDefaultExternal &\"/Parsi";
Debug.ShouldStop(16);
mcode.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(BA.ObjectToString("log.txt")),(Object)(_str));
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
public static RemoteObject  _saveupdate(RemoteObject _ba,RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("SaveUpdate (mcode) ","mcode",3,_ba,mcode.mostCurrent,458);
if (RapidSub.canDelegate("saveupdate")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","saveupdate", _ba, _query);}
;
Debug.locals.put("query", _query);
 BA.debugLineNum = 458;BA.debugLine="Sub SaveUpdate(query As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 459;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 460;BA.debugLine="If Sql1.IsInitialized=False Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",mcode._sql1.runMethod(true,"IsInitialized"),mcode.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 461;BA.debugLine="Initialize";
Debug.ShouldStop(4096);
_initialize(_ba);
 };
 BA.debugLineNum = 463;BA.debugLine="Sql1.ExecNonQuery(query)";
Debug.ShouldStop(16384);
mcode._sql1.runVoidMethod ("ExecNonQuery",(Object)(_query));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e7.toString()); BA.debugLineNum = 466;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513500424",BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 467;BA.debugLine="Log(\"not Save\")";
Debug.ShouldStop(262144);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513500425",RemoteObject.createImmutable("not Save"),0);
 BA.debugLineNum = 468;BA.debugLine="myCode.SendError(LastException,\"MCode-SaveUpdate";
Debug.ShouldStop(524288);
mcode.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,_ba,(Object)(BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba))),(Object)(RemoteObject.createImmutable("MCode-SaveUpdate")));
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
public static RemoteObject  _senderror(RemoteObject _ba,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SendError (mcode) ","mcode",3,_ba,mcode.mostCurrent,2990);
if (RapidSub.canDelegate("senderror")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","senderror", _ba, _text);}
;
Debug.locals.put("Text", _text);
 BA.debugLineNum = 2990;BA.debugLine="Public Sub SendError(Text As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2993;BA.debugLine="Log(Text)";
Debug.ShouldStop(65536);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","515597571",_text,0);
 BA.debugLineNum = 2995;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setanimation(RemoteObject _ba,RemoteObject _inanimation,RemoteObject _outanimation) throws Exception{
try {
		Debug.PushSubsStack("SetAnimation (mcode) ","mcode",3,_ba,mcode.mostCurrent,2428);
if (RapidSub.canDelegate("setanimation")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","setanimation", _ba, _inanimation, _outanimation);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
;
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 2428;BA.debugLine="Sub SetAnimation(InAnimation As String,OutAnimatio";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 2429;BA.debugLine="Dim R As Reflector";
Debug.ShouldStop(268435456);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("R", _r);
 BA.debugLineNum = 2430;BA.debugLine="Dim Package As String";
Debug.ShouldStop(536870912);
_package = RemoteObject.createImmutable("");Debug.locals.put("Package", _package);
 BA.debugLineNum = 2431;BA.debugLine="Dim In , Out As Int";
Debug.ShouldStop(1073741824);
_in = RemoteObject.createImmutable(0);Debug.locals.put("In", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("Out", _out);
 BA.debugLineNum = 2432;BA.debugLine="Package=R.GetStaticFielD(\"anywheresoftware.b4a.BA";
Debug.ShouldStop(-2147483648);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("Package", _package);
 BA.debugLineNum = 2433;BA.debugLine="In=R.GetStaticField(Package & \".R$anim\",InAnimati";
Debug.ShouldStop(1);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("In", _in);
 BA.debugLineNum = 2434;BA.debugLine="Out=R.GetStaticField(Package & \".R$anim\",OutAnima";
Debug.ShouldStop(2);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("Out", _out);
 BA.debugLineNum = 2435;BA.debugLine="R.Target=R.GetActivity";
Debug.ShouldStop(4);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 2436;BA.debugLine="R.RunMethod4(\"overridePendingTransition\",Array As";
Debug.ShouldStop(8);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 2437;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _singleresult(RemoteObject _ba,RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("SingleResult (mcode) ","mcode",3,_ba,mcode.mostCurrent,444);
if (RapidSub.canDelegate("singleresult")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","singleresult", _ba, _query);}
RemoteObject _ob = RemoteObject.declareNull("Object");
;
Debug.locals.put("Query", _query);
 BA.debugLineNum = 444;BA.debugLine="Sub SingleResult(Query As String) As Object";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 445;BA.debugLine="Dim ob As Object";
Debug.ShouldStop(268435456);
_ob = RemoteObject.createNew ("Object");Debug.locals.put("ob", _ob);
 BA.debugLineNum = 447;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 448;BA.debugLine="If Sql1.IsInitialized=False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",mcode._sql1.runMethod(true,"IsInitialized"),mcode.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 449;BA.debugLine="Initialize";
Debug.ShouldStop(1);
_initialize(_ba);
 };
 BA.debugLineNum = 451;BA.debugLine="ob=Sql1.ExecQuerySingleResult(Query)";
Debug.ShouldStop(4);
_ob = (mcode._sql1.runMethod(true,"ExecQuerySingleResult",(Object)(_query)));Debug.locals.put("ob", _ob);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e8.toString()); BA.debugLineNum = 453;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513434889",BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 454;BA.debugLine="myCode.SendError(LastException,\"MCode-SingleResu";
Debug.ShouldStop(32);
mcode.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,_ba,(Object)(BA.ObjectToString(mcode.mostCurrent.__c.runMethod(false,"LastException",_ba))),(Object)(RemoteObject.createImmutable("MCode-SingleResult")));
 };
 BA.debugLineNum = 456;BA.debugLine="Return ob";
Debug.ShouldStop(128);
if (true) return _ob;
 BA.debugLineNum = 457;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabase(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBase (mcode) ","mcode",3,_ba,mcode.mostCurrent,475);
if (RapidSub.canDelegate("updatedatabase")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","updatedatabase", _ba);}
;
 BA.debugLineNum = 475;BA.debugLine="Sub UpdateDataBase";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 477;BA.debugLine="MDatabase.CreateDataBaseNewTable";
Debug.ShouldStop(268435456);
mcode.mostCurrent._mdatabase.runVoidMethod ("_createdatabasenewtable" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 478;BA.debugLine="MDatabase.UpdateDataBaseSetting";
Debug.ShouldStop(536870912);
mcode.mostCurrent._mdatabase.runVoidMethod ("_updatedatabasesetting" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 479;BA.debugLine="MDatabase.UpdateDataBaseKala";
Debug.ShouldStop(1073741824);
mcode.mostCurrent._mdatabase.runVoidMethod ("_updatedatabasekala" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 480;BA.debugLine="MDatabase.UpdateDataBaseAshkhas";
Debug.ShouldStop(-2147483648);
mcode.mostCurrent._mdatabase.runVoidMethod ("_updatedatabaseashkhas" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 481;BA.debugLine="MDatabase.UpdateDataBaseSabad";
Debug.ShouldStop(1);
mcode.mostCurrent._mdatabase.runVoidMethod ("_updatedatabasesabad" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 482;BA.debugLine="MDatabase.UpdateDataBaseFactor";
Debug.ShouldStop(2);
mcode.mostCurrent._mdatabase.runVoidMethod ("_updatedatabasefactor" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 483;BA.debugLine="MDatabase.UpdateDataBaseDaryaft";
Debug.ShouldStop(4);
mcode.mostCurrent._mdatabase.runVoidMethod ("_updatedatabasedaryaft" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 484;BA.debugLine="MDatabase.UpdateDataBaseEnterExitVisitor";
Debug.ShouldStop(8);
mcode.mostCurrent._mdatabase.runVoidMethod ("_updatedatabaseenterexitvisitor" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 485;BA.debugLine="MDatabase.UpdateDataBaseGpsVisitor";
Debug.ShouldStop(16);
mcode.mostCurrent._mdatabase.runVoidMethod ("_updatedatabasegpsvisitor" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 486;BA.debugLine="MDatabase.UpdateDataBaseHavale";
Debug.ShouldStop(32);
mcode.mostCurrent._mdatabase.runVoidMethod ("_updatedatabasehavale" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 487;BA.debugLine="MDatabase.UpdateDataBaseAshkhasNew";
Debug.ShouldStop(64);
mcode.mostCurrent._mdatabase.runVoidMethod ("_updatedatabaseashkhasnew" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 489;BA.debugLine="Sql1.ExecNonQuery(\"Update TblSetting Set FldVersi";
Debug.ShouldStop(256);
mcode._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set FldVersion = '"),mcode._version,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 490;BA.debugLine="SaveUpdate(\"Update TblSetting Set FldUrl = 'zomor";
Debug.ShouldStop(512);
_saveupdate(_ba,RemoteObject.createImmutable("Update TblSetting Set FldUrl = 'zomorodonline.ir'"));
 BA.debugLineNum = 491;BA.debugLine="Initialize";
Debug.ShouldStop(1024);
_initialize(_ba);
 BA.debugLineNum = 492;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabaseold(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseOld (mcode) ","mcode",3,_ba,mcode.mostCurrent,494);
if (RapidSub.canDelegate("updatedatabaseold")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","updatedatabaseold", _ba);}
;
 BA.debugLineNum = 494;BA.debugLine="Sub UpdateDataBaseOld";
Debug.ShouldStop(8192);
 BA.debugLineNum = 2397;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatefeeoffline(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateFeeOffline (mcode) ","mcode",3,_ba,mcode.mostCurrent,3155);
if (RapidSub.canDelegate("updatefeeoffline")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","updatefeeoffline", _ba);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 3155;BA.debugLine="Sub UpdateFeeOffline";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3156;BA.debugLine="If feeCode>0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, mcode._feecode),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3157;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(1048576);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 3158;BA.debugLine="cu=Result(\"select * from TblFee where FldCodeTas";
Debug.ShouldStop(2097152);
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("select * from TblFee where FldCodeTasvie="),mcode._feecode));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 3159;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3160;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(8388608);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3161;BA.debugLine="cu.Position=i";
Debug.ShouldStop(16777216);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 3162;BA.debugLine="Log(\"FldCodeKala:\"& cu.GetString(\"FldCodeKala\"";
Debug.ShouldStop(33554432);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516252935",RemoteObject.concat(RemoteObject.createImmutable("FldCodeKala:"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))),0);
 BA.debugLineNum = 3163;BA.debugLine="Log(\"fldFeeTasvie:\"& cu.GetString(\"FldFee\"))";
Debug.ShouldStop(67108864);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516252936",RemoteObject.concat(RemoteObject.createImmutable("fldFeeTasvie:"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFee")))),0);
 BA.debugLineNum = 3164;BA.debugLine="SaveUpdate(\"Update TblKala Set fldFeeTasvie='\"";
Debug.ShouldStop(134217728);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblKala Set fldFeeTasvie='"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFee"))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" where fldCodeKala="),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 3169;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatefeesabad(RemoteObject _ba,RemoteObject _str,RemoteObject _codekala) throws Exception{
try {
		Debug.PushSubsStack("UpdateFeeSabad (mcode) ","mcode",3,_ba,mcode.mostCurrent,3329);
if (RapidSub.canDelegate("updatefeesabad")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","updatefeesabad", _ba, _str, _codekala);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ishas = RemoteObject.createImmutable(false);
RemoteObject _c = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterchangefeekala");
;
Debug.locals.put("str", _str);
Debug.locals.put("codeKala", _codekala);
 BA.debugLineNum = 3329;BA.debugLine="Sub UpdateFeeSabad(str As String,codeKala As Strin";
Debug.ShouldStop(1);
 BA.debugLineNum = 3330;BA.debugLine="If str>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _str),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3331;BA.debugLine="Dim cu As Cursor=Result(\"select * from TblSabad w";
Debug.ShouldStop(4);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("select * from TblSabad where FldCodeKala="),_codekala));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 3332;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3333;BA.debugLine="SaveUpdate(\"Update TblSabad Set FldFeeForoosh=\"&";
Debug.ShouldStop(16);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldFeeForoosh="),_str,RemoteObject.createImmutable(", FldupdateFee="),_str,RemoteObject.createImmutable(" where FldCodeKala="),_codekala));
 };
 BA.debugLineNum = 3336;BA.debugLine="If lstChangeFeeKala.Size>0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",mcode._lstchangefeekala.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3338;BA.debugLine="Dim ishas As Boolean=False";
Debug.ShouldStop(512);
_ishas = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 3339;BA.debugLine="Dim c As Int=0";
Debug.ShouldStop(1024);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 3340;BA.debugLine="For i=0 To lstChangeFeeKala.Size-1";
Debug.ShouldStop(2048);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {mcode._lstchangefeekala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3341;BA.debugLine="Dim Item = lstChangeFeeKala.Get(i) As AdapterC";
Debug.ShouldStop(4096);
_item = (mcode._lstchangefeekala.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 3342;BA.debugLine="If Item.FldCodKala=codeKala Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_item.getField(true,"FldCodKala" /*RemoteObject*/ ),_codekala)) { 
 BA.debugLineNum = 3343;BA.debugLine="ishas=True";
Debug.ShouldStop(16384);
_ishas = mcode.mostCurrent.__c.getField(true,"True");Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 3344;BA.debugLine="c=i";
Debug.ShouldStop(32768);
_c = BA.numberCast(int.class, _i);Debug.locals.put("c", _c);
 BA.debugLineNum = 3345;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 }else {
 BA.debugLineNum = 3347;BA.debugLine="ishas=False";
Debug.ShouldStop(262144);
_ishas = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3351;BA.debugLine="If ishas Then";
Debug.ShouldStop(4194304);
if (_ishas.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3352;BA.debugLine="lstChangeFeeKala.RemoveAt(c)";
Debug.ShouldStop(8388608);
mcode._lstchangefeekala.runVoidMethod ("RemoveAt",(Object)(_c));
 };
 BA.debugLineNum = 3354;BA.debugLine="Dim Item As AdapterChangeFeeKala";
Debug.ShouldStop(33554432);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterchangefeekala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 3355;BA.debugLine="Item.Initialize";
Debug.ShouldStop(67108864);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 3356;BA.debugLine="Item.FldCodKala=codeKala";
Debug.ShouldStop(134217728);
_item.setField ("FldCodKala" /*RemoteObject*/ ,_codekala);
 BA.debugLineNum = 3357;BA.debugLine="Item.FldFee=str";
Debug.ShouldStop(268435456);
_item.setField ("FldFee" /*RemoteObject*/ ,_str);
 BA.debugLineNum = 3358;BA.debugLine="lstChangeFeeKala.Add(Item)";
Debug.ShouldStop(536870912);
mcode._lstchangefeekala.runVoidMethod ("Add",(Object)((_item)));
 }else {
 BA.debugLineNum = 3361;BA.debugLine="Dim Item As AdapterChangeFeeKala";
Debug.ShouldStop(1);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterchangefeekala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 3362;BA.debugLine="Item.Initialize";
Debug.ShouldStop(2);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 3363;BA.debugLine="Item.FldCodKala=codeKala";
Debug.ShouldStop(4);
_item.setField ("FldCodKala" /*RemoteObject*/ ,_codekala);
 BA.debugLineNum = 3364;BA.debugLine="Item.FldFee=str";
Debug.ShouldStop(8);
_item.setField ("FldFee" /*RemoteObject*/ ,_str);
 BA.debugLineNum = 3365;BA.debugLine="lstChangeFeeKala.Add(Item)";
Debug.ShouldStop(16);
mcode._lstchangefeekala.runVoidMethod ("Add",(Object)((_item)));
 };
 }else {
 BA.debugLineNum = 3369;BA.debugLine="Dim ishas As Boolean=False";
Debug.ShouldStop(256);
_ishas = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 3370;BA.debugLine="Dim c As Int=0";
Debug.ShouldStop(512);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 3371;BA.debugLine="For i=0 To lstChangeFeeKala.Size-1";
Debug.ShouldStop(1024);
{
final int step37 = 1;
final int limit37 = RemoteObject.solve(new RemoteObject[] {mcode._lstchangefeekala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37) ;_i = ((int)(0 + _i + step37))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3372;BA.debugLine="Dim Item = lstChangeFeeKala.Get(i) As AdapterCh";
Debug.ShouldStop(2048);
_item = (mcode._lstchangefeekala.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 3373;BA.debugLine="If Item.FldCodKala=codeKala Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_item.getField(true,"FldCodKala" /*RemoteObject*/ ),_codekala)) { 
 BA.debugLineNum = 3374;BA.debugLine="ishas=True";
Debug.ShouldStop(8192);
_ishas = mcode.mostCurrent.__c.getField(true,"True");Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 3375;BA.debugLine="c=i";
Debug.ShouldStop(16384);
_c = BA.numberCast(int.class, _i);Debug.locals.put("c", _c);
 BA.debugLineNum = 3376;BA.debugLine="Exit";
Debug.ShouldStop(32768);
if (true) break;
 }else {
 BA.debugLineNum = 3378;BA.debugLine="ishas=False";
Debug.ShouldStop(131072);
_ishas = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3382;BA.debugLine="If ishas Then";
Debug.ShouldStop(2097152);
if (_ishas.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3383;BA.debugLine="lstChangeFeeKala.RemoveAt(c)";
Debug.ShouldStop(4194304);
mcode._lstchangefeekala.runVoidMethod ("RemoveAt",(Object)(_c));
 BA.debugLineNum = 3384;BA.debugLine="SaveUpdate(\"Update TblSabad Set  FldupdateFee=\"";
Debug.ShouldStop(8388608);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set  FldupdateFee="),_str,RemoteObject.createImmutable(" where FldCodeKala="),_codekala));
 };
 };
 BA.debugLineNum = 3388;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatefeesabad2(RemoteObject _ba,RemoteObject _item1) throws Exception{
try {
		Debug.PushSubsStack("UpdateFeeSabad2 (mcode) ","mcode",3,_ba,mcode.mostCurrent,3390);
if (RapidSub.canDelegate("updatefeesabad2")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","updatefeesabad2", _ba, _item1);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ishas = RemoteObject.createImmutable(false);
RemoteObject _c = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterchangefeekala");
;
Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 3390;BA.debugLine="Sub UpdateFeeSabad2(Item1 As AdapterListKala)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 3391;BA.debugLine="If Item1.FeeForoosh>0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_item1.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3392;BA.debugLine="Dim cu As Cursor=Result(\"select * from TblSabad w";
Debug.ShouldStop(-2147483648);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("select * from TblSabad where FldCodeKala="),_item1.getField(true,"CodeKala" /*RemoteObject*/ )));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 3393;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3394;BA.debugLine="SaveUpdate(\"Update TblSabad Set FldFeeForoosh=\"";
Debug.ShouldStop(2);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldFeeForoosh="),_item1.getField(true,"FeeForoosh" /*RemoteObject*/ ),RemoteObject.createImmutable(",FldMablaghTakhfif = '"),_item1.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldDarsadTakhfif = '"),mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_item1.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))),RemoteObject.createImmutable("',fldFeeBadAzTakhfif = '"),mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_item1.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),RemoteObject.createImmutable("', FldupdateFee="),_item1.getField(true,"FeeForoosh" /*RemoteObject*/ ),RemoteObject.createImmutable(" where FldCodeKala="),_item1.getField(true,"CodeKala" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 3397;BA.debugLine="If lstChangeFeeKala.Size>0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",mcode._lstchangefeekala.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3399;BA.debugLine="Dim ishas As Boolean=False";
Debug.ShouldStop(64);
_ishas = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 3400;BA.debugLine="Dim c As Int=0";
Debug.ShouldStop(128);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 3401;BA.debugLine="For i=0 To lstChangeFeeKala.Size-1";
Debug.ShouldStop(256);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {mcode._lstchangefeekala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3402;BA.debugLine="Dim Item = lstChangeFeeKala.Get(i) As AdapterC";
Debug.ShouldStop(512);
_item = (mcode._lstchangefeekala.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 3403;BA.debugLine="If Item.FldCodKala=Item1.CodeKala Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_item.getField(true,"FldCodKala" /*RemoteObject*/ ),_item1.getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 3404;BA.debugLine="ishas=True";
Debug.ShouldStop(2048);
_ishas = mcode.mostCurrent.__c.getField(true,"True");Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 3405;BA.debugLine="c=i";
Debug.ShouldStop(4096);
_c = BA.numberCast(int.class, _i);Debug.locals.put("c", _c);
 BA.debugLineNum = 3406;BA.debugLine="Exit";
Debug.ShouldStop(8192);
if (true) break;
 }else {
 BA.debugLineNum = 3408;BA.debugLine="ishas=False";
Debug.ShouldStop(32768);
_ishas = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3412;BA.debugLine="If ishas Then";
Debug.ShouldStop(524288);
if (_ishas.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3413;BA.debugLine="lstChangeFeeKala.RemoveAt(c)";
Debug.ShouldStop(1048576);
mcode._lstchangefeekala.runVoidMethod ("RemoveAt",(Object)(_c));
 };
 BA.debugLineNum = 3415;BA.debugLine="Dim Item As AdapterChangeFeeKala";
Debug.ShouldStop(4194304);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterchangefeekala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 3416;BA.debugLine="Item.Initialize";
Debug.ShouldStop(8388608);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 3417;BA.debugLine="Item.FldCodKala=Item1.CodeKala";
Debug.ShouldStop(16777216);
_item.setField ("FldCodKala" /*RemoteObject*/ ,_item1.getField(true,"CodeKala" /*RemoteObject*/ ));
 BA.debugLineNum = 3418;BA.debugLine="Item.FldFee=Item1.FeeForoosh";
Debug.ShouldStop(33554432);
_item.setField ("FldFee" /*RemoteObject*/ ,BA.NumberToString(_item1.getField(true,"FeeForoosh" /*RemoteObject*/ )));
 BA.debugLineNum = 3419;BA.debugLine="lstChangeFeeKala.Add(Item)";
Debug.ShouldStop(67108864);
mcode._lstchangefeekala.runVoidMethod ("Add",(Object)((_item)));
 }else {
 BA.debugLineNum = 3422;BA.debugLine="Dim Item As AdapterChangeFeeKala";
Debug.ShouldStop(536870912);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterchangefeekala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 3423;BA.debugLine="Item.Initialize";
Debug.ShouldStop(1073741824);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 3424;BA.debugLine="Item.FldCodKala=Item1.CodeKala";
Debug.ShouldStop(-2147483648);
_item.setField ("FldCodKala" /*RemoteObject*/ ,_item1.getField(true,"CodeKala" /*RemoteObject*/ ));
 BA.debugLineNum = 3425;BA.debugLine="Item.FldFee=Item1.FeeForoosh";
Debug.ShouldStop(1);
_item.setField ("FldFee" /*RemoteObject*/ ,BA.NumberToString(_item1.getField(true,"FeeForoosh" /*RemoteObject*/ )));
 BA.debugLineNum = 3426;BA.debugLine="lstChangeFeeKala.Add(Item)";
Debug.ShouldStop(2);
mcode._lstchangefeekala.runVoidMethod ("Add",(Object)((_item)));
 };
 }else {
 BA.debugLineNum = 3430;BA.debugLine="Dim ishas As Boolean=False";
Debug.ShouldStop(32);
_ishas = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 3431;BA.debugLine="Dim c As Int=0";
Debug.ShouldStop(64);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 3432;BA.debugLine="For i=0 To lstChangeFeeKala.Size-1";
Debug.ShouldStop(128);
{
final int step37 = 1;
final int limit37 = RemoteObject.solve(new RemoteObject[] {mcode._lstchangefeekala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37) ;_i = ((int)(0 + _i + step37))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3433;BA.debugLine="Dim Item = lstChangeFeeKala.Get(i) As AdapterCh";
Debug.ShouldStop(256);
_item = (mcode._lstchangefeekala.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 3434;BA.debugLine="If Item.FldCodKala=Item1.CodeKala Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_item.getField(true,"FldCodKala" /*RemoteObject*/ ),_item1.getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 3435;BA.debugLine="ishas=True";
Debug.ShouldStop(1024);
_ishas = mcode.mostCurrent.__c.getField(true,"True");Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 3436;BA.debugLine="c=i";
Debug.ShouldStop(2048);
_c = BA.numberCast(int.class, _i);Debug.locals.put("c", _c);
 BA.debugLineNum = 3437;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 }else {
 BA.debugLineNum = 3439;BA.debugLine="ishas=False";
Debug.ShouldStop(16384);
_ishas = mcode.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3443;BA.debugLine="If ishas Then";
Debug.ShouldStop(262144);
if (_ishas.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3444;BA.debugLine="lstChangeFeeKala.RemoveAt(c)";
Debug.ShouldStop(524288);
mcode._lstchangefeekala.runVoidMethod ("RemoveAt",(Object)(_c));
 BA.debugLineNum = 3445;BA.debugLine="SaveUpdate(\"Update TblSabad Set  FldupdateFee=\"";
Debug.ShouldStop(1048576);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set  FldupdateFee="),_item1.getField(true,"FeeForoosh" /*RemoteObject*/ ),RemoteObject.createImmutable(" where FldCodeKala="),_item1.getField(true,"CodeKala" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 3449;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatelistpickala(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateListPicKala (mcode) ","mcode",3,_ba,mcode.mostCurrent,3037);
if (RapidSub.canDelegate("updatelistpickala")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","updatelistpickala", _ba);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _fldpathpic = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 3037;BA.debugLine="Public Sub UpdateListPicKala";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 3038;BA.debugLine="Dim lst As List";
Debug.ShouldStop(536870912);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 3039;BA.debugLine="lst.Initialize";
Debug.ShouldStop(1073741824);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 3040;BA.debugLine="lst=File.ListFiles(File.Combine(File.DirDefaultEx";
Debug.ShouldStop(-2147483648);
_lst = mcode.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(mcode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/parsik"))),(Object)(RemoteObject.createImmutable("AksKala")))));Debug.locals.put("lst", _lst);
 BA.debugLineNum = 3042;BA.debugLine="For	i=0 To lst.Size-1";
Debug.ShouldStop(2);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3043;BA.debugLine="Dim filename As String=lst.Get(i)";
Debug.ShouldStop(4);
_filename = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 3044;BA.debugLine="Dim fldPathPic As String=SingleResult(\"select fl";
Debug.ShouldStop(8);
_fldpathpic = BA.ObjectToString(_singleresult(_ba,RemoteObject.concat(RemoteObject.createImmutable("select fldPathPic from TblKala where fldCodeKala="),_filename.runMethod(true,"replace",(Object)(BA.ObjectToString(".jpg")),(Object)(RemoteObject.createImmutable(""))))));Debug.locals.put("fldPathPic", _fldpathpic);Debug.locals.put("fldPathPic", _fldpathpic);
 BA.debugLineNum = 3046;BA.debugLine="If fldPathPic = \"0\" Or fldPathPic = Null  Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_fldpathpic,BA.ObjectToString("0")) || RemoteObject.solveBoolean("n",_fldpathpic)) { 
 BA.debugLineNum = 3047;BA.debugLine="SaveUpdate(\"Update TblKala Set fldPathPicOfflin";
Debug.ShouldStop(64);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblKala Set fldPathPicOffline='"),_filename,RemoteObject.createImmutable("' where fldCodeKala="),_filename.runMethod(true,"replace",(Object)(BA.ObjectToString(".jpg")),(Object)(RemoteObject.createImmutable("")))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3052;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatenoetasviedarsabad(RemoteObject _ba,RemoteObject _index,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("UpdateNoeTasvieDarSabad (mcode) ","mcode",3,_ba,mcode.mostCurrent,3197);
if (RapidSub.canDelegate("updatenoetasviedarsabad")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","updatenoetasviedarsabad", _ba, _index, _item);}
RemoteObject _fee = RemoteObject.createImmutable(0);
RemoteObject _feeforoosh = RemoteObject.createImmutable(0);
RemoteObject _feebadaztakhfif = RemoteObject.createImmutable(0);
RemoteObject _darsadtakhfif = RemoteObject.createImmutable(0);
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _itemtasvie = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
RemoteObject _mablaghtakhfif = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
Debug.locals.put("Index", _index);
Debug.locals.put("Item", _item);
 BA.debugLineNum = 3197;BA.debugLine="Sub UpdateNoeTasvieDarSabad(Index As Int,Item As A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 3199;BA.debugLine="Dim fee As Int";
Debug.ShouldStop(1073741824);
_fee = RemoteObject.createImmutable(0);Debug.locals.put("fee", _fee);
 BA.debugLineNum = 3200;BA.debugLine="Dim FeeForoosh As Int";
Debug.ShouldStop(-2147483648);
_feeforoosh = RemoteObject.createImmutable(0);Debug.locals.put("FeeForoosh", _feeforoosh);
 BA.debugLineNum = 3201;BA.debugLine="Dim FeeBadAzTakhfif As Int";
Debug.ShouldStop(1);
_feebadaztakhfif = RemoteObject.createImmutable(0);Debug.locals.put("FeeBadAzTakhfif", _feebadaztakhfif);
 BA.debugLineNum = 3202;BA.debugLine="Dim DarsadTakhfif As Int";
Debug.ShouldStop(2);
_darsadtakhfif = RemoteObject.createImmutable(0);Debug.locals.put("DarsadTakhfif", _darsadtakhfif);
 BA.debugLineNum = 3203;BA.debugLine="Dim Cu1 As Cursor";
Debug.ShouldStop(4);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 3204;BA.debugLine="If Item<>Null Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("N",_item)) { 
 BA.debugLineNum = 3205;BA.debugLine="Cu1= Result(\"Select * From TblSabad where FldCod";
Debug.ShouldStop(16);
_cu1 = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("Select * From TblSabad where FldCodeKala="),_item.getField(true,"CodeKala" /*RemoteObject*/ )));Debug.locals.put("Cu1", _cu1);
 }else {
 BA.debugLineNum = 3207;BA.debugLine="Cu1= Result(\"Select * From TblSabad\")";
Debug.ShouldStop(64);
_cu1 = _result(_ba,RemoteObject.createImmutable("Select * From TblSabad"));Debug.locals.put("Cu1", _cu1);
 };
 BA.debugLineNum = 3210;BA.debugLine="LogColor(Cu1.RowCount,Colors.Red)";
Debug.ShouldStop(512);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516384013",BA.NumberToString(_cu1.runMethod(true,"getRowCount")),mcode.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 3211;BA.debugLine="If Cu1.RowCount>0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3212;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
Debug.ShouldStop(2048);
_itemtasvie = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 3213;BA.debugLine="Dim MablaghTakhfif As Int=0";
Debug.ShouldStop(4096);
_mablaghtakhfif = BA.numberCast(int.class, 0);Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);
 BA.debugLineNum = 3214;BA.debugLine="ItemTasvie.Initialize";
Debug.ShouldStop(8192);
_itemtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 3215;BA.debugLine="ItemTasvie=LoadAcSpNoeTasvie.Get(Index)";
Debug.ShouldStop(16384);
_itemtasvie = (_loadacspnoetasvie(_ba).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 3216;BA.debugLine="For i=0 To Cu1.RowCount-1";
Debug.ShouldStop(32768);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_cu1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3217;BA.debugLine="Cu1.Position=i";
Debug.ShouldStop(65536);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 3218;BA.debugLine="Dim cu As Cursor=Result(\"Select * from TblKala";
Debug.ShouldStop(131072);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.concat(RemoteObject.createImmutable("Select * from TblKala where FldCodeKala="),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 3219;BA.debugLine="cu.Position=0";
Debug.ShouldStop(262144);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 3220;BA.debugLine="If Item<>Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",_item)) { 
 BA.debugLineNum = 3221;BA.debugLine="MablaghTakhfif=myCode.Is_Null_adad(Item.Mablag";
Debug.ShouldStop(1048576);
_mablaghtakhfif = BA.numberCast(int.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(BA.NumberToString(_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ )))));Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);
 BA.debugLineNum = 3222;BA.debugLine="FeeForoosh=myCode.Is_Null_adad(Item.FeeForoosh";
Debug.ShouldStop(2097152);
_feeforoosh = BA.numberCast(int.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(BA.NumberToString(_item.getField(true,"FeeForoosh" /*RemoteObject*/ )))));Debug.locals.put("FeeForoosh", _feeforoosh);
 BA.debugLineNum = 3223;BA.debugLine="FeeBadAzTakhfif=myCode.Is_Null_adad(Item.fldFe";
Debug.ShouldStop(4194304);
_feebadaztakhfif = BA.numberCast(int.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))));Debug.locals.put("FeeBadAzTakhfif", _feebadaztakhfif);
 BA.debugLineNum = 3224;BA.debugLine="DarsadTakhfif=myCode.Is_Null_adad(Item.fldDars";
Debug.ShouldStop(8388608);
_darsadtakhfif = BA.numberCast(int.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))));Debug.locals.put("DarsadTakhfif", _darsadtakhfif);
 }else {
 BA.debugLineNum = 3226;BA.debugLine="FeeForoosh=myCode.Is_Null_adad(Cu1.Getstring(\"";
Debug.ShouldStop(33554432);
_feeforoosh = BA.numberCast(int.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFeeForoosh"))))));Debug.locals.put("FeeForoosh", _feeforoosh);
 BA.debugLineNum = 3227;BA.debugLine="FeeBadAzTakhfif=myCode.Is_Null_adad(Cu1.Getstr";
Debug.ShouldStop(67108864);
_feebadaztakhfif = BA.numberCast(int.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))))));Debug.locals.put("FeeBadAzTakhfif", _feebadaztakhfif);
 };
 BA.debugLineNum = 3230;BA.debugLine="Log(MablaghTakhfif)";
Debug.ShouldStop(536870912);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516384033",BA.NumberToString(_mablaghtakhfif),0);
 BA.debugLineNum = 3231;BA.debugLine="fee=GetMablaghFee(ItemTasvie.FldC_Tasvie,Cu1.Ge";
Debug.ShouldStop(1073741824);
_fee = RemoteObject.solve(new RemoteObject[] {_getmablaghfee(_ba,_itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ ),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))),_mablaghtakhfif}, "-",1, 1);Debug.locals.put("fee", _fee);
 BA.debugLineNum = 3234;BA.debugLine="Log(Cu1.Getstring(\"FldCodeKala\"))";
Debug.ShouldStop(2);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516384037",_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),0);
 BA.debugLineNum = 3236;BA.debugLine="If fee>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_fee,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3237;BA.debugLine="If fee>FeeBadAzTakhfif And FeeBadAzTakhfif>0 T";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_fee,BA.numberCast(double.class, _feebadaztakhfif)) && RemoteObject.solveBoolean(">",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3238;BA.debugLine="SaveUpdate(\"Update TblSabad Set fldFeeBadAzTa";
Debug.ShouldStop(32);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set fldFeeBadAzTakhfif=0 ,FldFeeForoosh="),_feeforoosh,RemoteObject.createImmutable(" ,FldMablaghTakhfif="),_mablaghtakhfif,RemoteObject.createImmutable(" ,FldDarsadTakhfif="),_darsadtakhfif,RemoteObject.createImmutable(" ,FldVaziatPardakht="),_itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ ),RemoteObject.createImmutable(" where FldCodeKala="),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))));
 }else 
{ BA.debugLineNum = 3239;BA.debugLine="Else If fee>FeeBadAzTakhfif And FeeBadAzTakhfi";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_fee,BA.numberCast(double.class, _feebadaztakhfif)) && RemoteObject.solveBoolean("=",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3240;BA.debugLine="SaveUpdate(\"Update TblSabad Set FldFeeForoosh";
Debug.ShouldStop(128);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldFeeForoosh="),_fee,RemoteObject.createImmutable(" ,FldMablaghTakhfif="),_mablaghtakhfif,RemoteObject.createImmutable(",FldDarsadTakhfif="),_darsadtakhfif,RemoteObject.createImmutable(" ,FldVaziatPardakht="),_itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ ),RemoteObject.createImmutable(" where FldCodeKala="),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))));
 }else 
{ BA.debugLineNum = 3241;BA.debugLine="Else If fee<FeeBadAzTakhfif And FeeBadAzTakhfi";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("<",_fee,BA.numberCast(double.class, _feebadaztakhfif)) && RemoteObject.solveBoolean(">",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3242;BA.debugLine="SaveUpdate(\"Update TblSabad Set fldFeeBadAzTa";
Debug.ShouldStop(512);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set fldFeeBadAzTakhfif="),_fee,RemoteObject.createImmutable(" ,FldFeeForoosh="),_feeforoosh,RemoteObject.createImmutable(",FldMablaghTakhfif="),_mablaghtakhfif,RemoteObject.createImmutable(",FldDarsadTakhfif="),_darsadtakhfif,RemoteObject.createImmutable(" ,FldVaziatPardakht="),_itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ ),RemoteObject.createImmutable("  where FldCodeKala="),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))));
 }else 
{ BA.debugLineNum = 3243;BA.debugLine="Else If fee<FeeBadAzTakhfif And FeeBadAzTakhfi";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",_fee,BA.numberCast(double.class, _feebadaztakhfif)) && RemoteObject.solveBoolean("=",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3244;BA.debugLine="SaveUpdate(\"Update TblSabad Set FldFeeForoosh";
Debug.ShouldStop(2048);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldFeeForoosh="),_fee,RemoteObject.createImmutable(",FldMablaghTakhfif="),_mablaghtakhfif,RemoteObject.createImmutable(",FldDarsadTakhfif="),_darsadtakhfif,RemoteObject.createImmutable(" ,FldVaziatPardakht="),_itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ ),RemoteObject.createImmutable("  where FldCodeKala="),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))));
 }else {
 BA.debugLineNum = 3246;BA.debugLine="SaveUpdate(\"Update TblSabad Set fldFeeBadAzTa";
Debug.ShouldStop(8192);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set fldFeeBadAzTakhfif="),_feebadaztakhfif,RemoteObject.createImmutable(" ,FldFeeForoosh="),_feeforoosh,RemoteObject.createImmutable(",FldMablaghTakhfif="),_mablaghtakhfif,RemoteObject.createImmutable(",FldDarsadTakhfif="),_darsadtakhfif,RemoteObject.createImmutable(" ,FldVaziatPardakht="),_itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ ),RemoteObject.createImmutable(" where FldCodeKala="),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))));
 }}}}
;
 }else {
 BA.debugLineNum = 3250;BA.debugLine="SaveUpdate(\"Update TblSabad Set fldFeeBadAzTak";
Debug.ShouldStop(131072);
_saveupdate(_ba,RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set fldFeeBadAzTakhfif="),_feebadaztakhfif,RemoteObject.createImmutable(" ,FldFeeForoosh="),_feeforoosh,RemoteObject.createImmutable(",FldMablaghTakhfif="),_mablaghtakhfif,RemoteObject.createImmutable(",FldDarsadTakhfif="),_darsadtakhfif,RemoteObject.createImmutable(" ,FldVaziatPardakht="),_itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ ),RemoteObject.createImmutable(" where FldCodeKala="),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3254;BA.debugLine="Log(fee)";
Debug.ShouldStop(2097152);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","516384057",BA.NumberToString(_fee),0);
 };
 BA.debugLineNum = 3256;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatesetting(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateSetting (mcode) ","mcode",3,_ba,mcode.mostCurrent,269);
if (RapidSub.canDelegate("updatesetting")) { return ir.parsikhesab.pakhsh.mcode.remoteMe.runUserSub(false, "mcode","updatesetting", _ba);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
 BA.debugLineNum = 269;BA.debugLine="Sub UpdateSetting";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Dim Cu As Cursor = Result(\"Select * From TblSetti";
Debug.ShouldStop(8192);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = _result(_ba,RemoteObject.createImmutable("Select * From TblSetting"));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 271;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(16384);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 277;BA.debugLine="Gps= Cu.GetString(\"FldGps\")";
Debug.ShouldStop(1048576);
mcode._gps = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldGps")));
 BA.debugLineNum = 278;BA.debugLine="ServiceGpsActive = Cu.GetString(\"FldGps\")";
Debug.ShouldStop(2097152);
mcode._servicegpsactive = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldGps"))));
 BA.debugLineNum = 279;BA.debugLine="RaghamAshar = Cu.GetString(\"FldRound\")";
Debug.ShouldStop(4194304);
mcode._raghamashar = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldRound")));
 BA.debugLineNum = 280;BA.debugLine="VahedPool = Cu.GetString(\"FldVahedPool\")";
Debug.ShouldStop(8388608);
mcode._vahedpool = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVahedPool")));
 BA.debugLineNum = 282;BA.debugLine="C_Visitor = Cu.GetString(\"FldC_Visitor\")";
Debug.ShouldStop(33554432);
mcode._c_visitor = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor")));
 BA.debugLineNum = 283;BA.debugLine="N_Visitor = Cu.GetString(\"FldN_Visitor\")";
Debug.ShouldStop(67108864);
mcode._n_visitor = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Visitor")));
 BA.debugLineNum = 284;BA.debugLine="Url = Cu.GetString(\"FldUrl\")";
Debug.ShouldStop(134217728);
mcode._url = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldUrl")));
 BA.debugLineNum = 285;BA.debugLine="kalamanfi = Cu.GetString(\"FldKalaManfi\")";
Debug.ShouldStop(268435456);
mcode._kalamanfi = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldKalaManfi")));
 BA.debugLineNum = 286;BA.debugLine="ForooshBishAzMojoodi=kalamanfi";
Debug.ShouldStop(536870912);
mcode._forooshbishazmojoodi = mcode._kalamanfi;
 BA.debugLineNum = 287;BA.debugLine="KharidBiashAz=kalamanfi";
Debug.ShouldStop(1073741824);
mcode._kharidbiashaz = mcode._kalamanfi;
 BA.debugLineNum = 288;BA.debugLine="TaghirFeeKala = Cu.GetString(\"FldTaghirFeeKala\")";
Debug.ShouldStop(-2147483648);
mcode._taghirfeekala = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTaghirFeeKala")));
 BA.debugLineNum = 289;BA.debugLine="NamayeshKalaSefr = Cu.GetString(\"FldNamayeshKalaS";
Debug.ShouldStop(1);
mcode._namayeshkalasefr = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNamayeshKalaSefr")));
 BA.debugLineNum = 290;BA.debugLine="DastrasiGroupKala =myCode.Is_Null_adad(Cu.GetStri";
Debug.ShouldStop(2);
mcode._dastrasigroupkala = BA.numberCast(int.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDastrasiKala"))))));
 BA.debugLineNum = 291;BA.debugLine="ArzeshAfzodeEnable=Cu.GetString(\"fldArzeshAfzodeE";
Debug.ShouldStop(4);
mcode._arzeshafzodeenable = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldArzeshAfzodeEnable")));
 BA.debugLineNum = 292;BA.debugLine="ArzeshAfzode =myCode.Is_Null_adad(Cu.GetString(\"f";
Debug.ShouldStop(8);
mcode._arzeshafzode = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldArzeshAfzode")))));
 BA.debugLineNum = 293;BA.debugLine="Log(\"ارزش افزوده: \"&ArzeshAfzode)";
Debug.ShouldStop(16);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513041688",RemoteObject.concat(RemoteObject.createImmutable("ارزش افزوده: "),mcode._arzeshafzode),0);
 BA.debugLineNum = 295;BA.debugLine="Log(\"DastrasiGroupKala= \"&DastrasiGroupKala)";
Debug.ShouldStop(64);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513041690",RemoteObject.concat(RemoteObject.createImmutable("DastrasiGroupKala= "),mcode._dastrasigroupkala),0);
 BA.debugLineNum = 296;BA.debugLine="DastrasiGroupAshkhas =myCode.Is_Null_adad(Cu.GetS";
Debug.ShouldStop(128);
mcode._dastrasigroupashkhas = BA.numberCast(int.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDastrasiAshkhas"))))));
 BA.debugLineNum = 297;BA.debugLine="Log(\"DastrsiGroupAshkhas= \"&DastrasiGroupAshkhas)";
Debug.ShouldStop(256);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513041692",RemoteObject.concat(RemoteObject.createImmutable("DastrsiGroupAshkhas= "),mcode._dastrasigroupashkhas),0);
 BA.debugLineNum = 298;BA.debugLine="CodeMoshtari=Cu.GetString(\"FldCodeMoshtari\")";
Debug.ShouldStop(512);
mcode._codemoshtari = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeMoshtari")));
 BA.debugLineNum = 301;BA.debugLine="Log(Cu.GetString(\"FldSaveFactorInLocation\"))";
Debug.ShouldStop(4096);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513041696",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSaveFactorInLocation"))),0);
 BA.debugLineNum = 302;BA.debugLine="If Cu.GetString(\"FldSaveFactorInLocation\")=\"0\" Th";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSaveFactorInLocation"))),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 303;BA.debugLine="SaveFactorInLocation=False";
Debug.ShouldStop(16384);
mcode._savefactorinlocation = mcode.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 305;BA.debugLine="SaveFactorInLocation=True";
Debug.ShouldStop(65536);
mcode._savefactorinlocation = mcode.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 307;BA.debugLine="Log(Cu.GetString(\"FldMasafat\"))";
Debug.ShouldStop(262144);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513041702",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMasafat"))),0);
 BA.debugLineNum = 308;BA.debugLine="Masafat=Cu.GetString(\"FldMasafat\")";
Debug.ShouldStop(524288);
mcode._masafat = BA.numberCast(long.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMasafat"))));
 BA.debugLineNum = 309;BA.debugLine="PrinterType=Cu.GetInt(\"FldPrinterType\")";
Debug.ShouldStop(1048576);
mcode._printertype = _cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("FldPrinterType")));
 BA.debugLineNum = 310;BA.debugLine="Vaziat=myCode.Is_Null_adad(Cu.GetString(\"FldVazia";
Debug.ShouldStop(2097152);
mcode._vaziat = BA.numberCast(int.class, mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVaziat"))))));
 BA.debugLineNum = 312;BA.debugLine="If Cu.GetString(\"FldDateTimeRecive\")<>Null Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDateTimeRecive"))))) { 
 BA.debugLineNum = 313;BA.debugLine="DateTimeRecive=Cu.GetString(\"FldDateTimeRecive\")";
Debug.ShouldStop(16777216);
mcode._datetimerecive = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDateTimeRecive")));
 }else {
 BA.debugLineNum = 315;BA.debugLine="DateTimeRecive=0";
Debug.ShouldStop(67108864);
mcode._datetimerecive = BA.NumberToString(0);
 };
 BA.debugLineNum = 317;BA.debugLine="If Cu.GetString(\"FldDateTimeSend\")<>Null Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDateTimeSend"))))) { 
 BA.debugLineNum = 318;BA.debugLine="DateTimeSend=Cu.GetString(\"FldDateTimeSend\")";
Debug.ShouldStop(536870912);
mcode._datetimesend = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDateTimeSend")));
 }else {
 BA.debugLineNum = 320;BA.debugLine="DateTimeSend=0";
Debug.ShouldStop(-2147483648);
mcode._datetimesend = BA.NumberToString(0);
 };
 BA.debugLineNum = 325;BA.debugLine="TakhfifKala = Cu.GetString(\"FldTakhfifKala\")";
Debug.ShouldStop(16);
mcode._takhfifkala = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTakhfifKala")));
 BA.debugLineNum = 326;BA.debugLine="HideMojodi = Cu.GetString(\"FldHideMojodi\")";
Debug.ShouldStop(32);
mcode._hidemojodi = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldHideMojodi")));
 BA.debugLineNum = 327;BA.debugLine="Admin = Cu.GetString(\"FldAdmin\")";
Debug.ShouldStop(64);
mcode._admin = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAdmin")));
 BA.debugLineNum = 328;BA.debugLine="CheckAdmin = Cu.GetString(\"FldCheckAdmin\")";
Debug.ShouldStop(128);
mcode._checkadmin = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCheckAdmin")));
 BA.debugLineNum = 329;BA.debugLine="Tozie = Cu.GetString(\"FldTozie\")";
Debug.ShouldStop(256);
mcode._tozie = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTozie")));
 BA.debugLineNum = 331;BA.debugLine="Visitor = Cu.GetString(\"FldVisitor\")";
Debug.ShouldStop(1024);
mcode._visitor = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVisitor")));
 BA.debugLineNum = 332;BA.debugLine="SendMarjoie = Cu.GetString(\"FldSendMarjoie\")";
Debug.ShouldStop(2048);
mcode._sendmarjoie = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSendMarjoie")));
 BA.debugLineNum = 333;BA.debugLine="PicOnline = Cu.GetString(\"FldPicOnline\")";
Debug.ShouldStop(4096);
mcode._piconline = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldPicOnline")));
 BA.debugLineNum = 334;BA.debugLine="Daryaft =myCode.Is_Null_adad(Cu.GetString(\"FldDar";
Debug.ShouldStop(8192);
mcode._daryaft = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDaryaft")))));
 BA.debugLineNum = 335;BA.debugLine="Amani =myCode.Is_Null_adad(Cu.GetString(\"FldAmani";
Debug.ShouldStop(16384);
mcode._amani = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAmani")))));
 BA.debugLineNum = 336;BA.debugLine="MojavezSefaresh =myCode.Is_Null_adad(Cu.GetString";
Debug.ShouldStop(32768);
mcode._mojavezsefaresh = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMojavezSefaresh")))));
 BA.debugLineNum = 337;BA.debugLine="GetDataOnline=myCode.Is_Null_adad(Cu.GetString(\"F";
Debug.ShouldStop(65536);
mcode._getdataonline = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldGetDataOnline")))));
 BA.debugLineNum = 338;BA.debugLine="ConnectionStatus=myCode.Is_Null_adad(Cu.GetString";
Debug.ShouldStop(131072);
mcode._connectionstatus = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldConnectionStatus")))));
 BA.debugLineNum = 339;BA.debugLine="GetDataOnline=0";
Debug.ShouldStop(262144);
mcode._getdataonline = BA.NumberToString(0);
 BA.debugLineNum = 340;BA.debugLine="If	PicOnline=1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",mcode._piconline,BA.NumberToString(1))) { 
 BA.debugLineNum = 341;BA.debugLine="ImageUrl=Cu.GetString(\"FldLinkPicKala\")";
Debug.ShouldStop(1048576);
mcode._imageurl = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLinkPicKala")));
 };
 BA.debugLineNum = 345;BA.debugLine="IntervalGps=Cu.GetString(\"FldIntervalGps\")";
Debug.ShouldStop(16777216);
mcode._intervalgps = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldIntervalGps"))));
 BA.debugLineNum = 346;BA.debugLine="EshantionTabaghati=myCode.Is_Null_adad(Cu.GetStri";
Debug.ShouldStop(33554432);
mcode._eshantiontabaghati = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantionTabaghati")))));
 BA.debugLineNum = 347;BA.debugLine="EshantionRemove=myCode.Is_Null_adad(Cu.GetString(";
Debug.ShouldStop(67108864);
mcode._eshantionremove = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantionRemove")))));
 BA.debugLineNum = 348;BA.debugLine="EshantionGroup=myCode.Is_Null_adad(Cu.GetString(\"";
Debug.ShouldStop(134217728);
mcode._eshantiongroup = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantionGroup")))));
 BA.debugLineNum = 350;BA.debugLine="CompanyName=myCode.Is_Null(Cu.GetString(\"FldNameC";
Debug.ShouldStop(536870912);
mcode._companyname = mcode.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNameCompany")))));
 BA.debugLineNum = 351;BA.debugLine="CompanyTell=myCode.Is_Null(Cu.GetString(\"FldTellC";
Debug.ShouldStop(1073741824);
mcode._companytell = mcode.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTellCompany")))));
 BA.debugLineNum = 352;BA.debugLine="CompanyAddress=myCode.Is_Null(Cu.GetString(\"FldAd";
Debug.ShouldStop(-2147483648);
mcode._companyaddress = mcode.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAddressCompany")))));
 BA.debugLineNum = 353;BA.debugLine="MobileIsImportent=myCode.Is_Null_adad(Cu.GetStrin";
Debug.ShouldStop(1);
mcode._mobileisimportent = mcode.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMobileIsImportent")))));
 BA.debugLineNum = 354;BA.debugLine="TourVisit=1";
Debug.ShouldStop(2);
mcode._tourvisit = BA.NumberToString(1);
 BA.debugLineNum = 361;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(256);
mcode.mostCurrent.__c.runVoidMethod ("LogImpl","513041756",RemoteObject.createImmutable("Gps Start"),0);
 BA.debugLineNum = 362;BA.debugLine="End Sub";
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