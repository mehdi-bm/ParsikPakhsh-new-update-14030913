package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class firebasemessaging_subs_0 {


public static RemoteObject  _delete() throws Exception{
try {
		Debug.PushSubsStack("Delete (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,57);
if (RapidSub.canDelegate("delete")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","delete");}
 BA.debugLineNum = 57;BA.debugLine="Sub Delete";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="TypeDelete=\"kala\"";
Debug.ShouldStop(33554432);
firebasemessaging._typedelete = BA.ObjectToString("kala");
 BA.debugLineNum = 59;BA.debugLine="GetListDelete(\"kala\")";
Debug.ShouldStop(67108864);
_getlistdelete(RemoteObject.createImmutable("kala"));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getashkhas(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("GetAshkhas (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,795);
if (RapidSub.canDelegate("getashkhas")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getashkhas", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 795;BA.debugLine="Sub GetAshkhas(str As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 796;BA.debugLine="Select str";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_str,BA.ObjectToString("GetAshkhas"),BA.ObjectToString("GetAshkhasAll"),BA.ObjectToString("GetSingleAshkhas"))) {
case 0: {
 BA.debugLineNum = 798;BA.debugLine="jobInternet.JobName =\"GetAshkhas\"";
Debug.ShouldStop(536870912);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetAshkhas"));
 BA.debugLineNum = 799;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(1073741824);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetStoredFast"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=ListAshkhas"),RemoteObject.createImmutable("&fldFeeTasvie="),firebasemessaging.mostCurrent._mcode._feecode /*RemoteObject*/ ,RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateUpdate="),firebasemessaging._dateupdate)));
 break; }
case 1: {
 BA.debugLineNum = 801;BA.debugLine="jobInternet.JobName =\"GetAshkhasAll\"";
Debug.ShouldStop(1);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetAshkhasAll"));
 BA.debugLineNum = 802;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(2);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetStoredNew"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=ListAshkhas"),RemoteObject.createImmutable("&fldFeeTasvie="),firebasemessaging.mostCurrent._mcode._feecode /*RemoteObject*/ ,RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 break; }
case 2: {
 BA.debugLineNum = 805;BA.debugLine="jobInternet.JobName =\"GetAshkhas\"";
Debug.ShouldStop(16);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetAshkhas"));
 BA.debugLineNum = 806;BA.debugLine="Log (MCode.DeviceId)";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115474443",firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,0);
 BA.debugLineNum = 807;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(64);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetSingle"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=ListAshkhas"),RemoteObject.createImmutable("&fldCode="),firebasemessaging._codetafzili1,RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 810;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentdate() throws Exception{
try {
		Debug.PushSubsStack("GetCurrentDate (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,209);
if (RapidSub.canDelegate("getcurrentdate")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getcurrentdate");}
 BA.debugLineNum = 209;BA.debugLine="Sub GetCurrentDate";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="jobInternet.JobName =\"GetCurrentDate\"";
Debug.ShouldStop(131072);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetCurrentDate"));
 BA.debugLineNum = 211;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(262144);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetCurrentDate"))),(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.getField(false,"Null"))));
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
public static RemoteObject  _getdateupdate() throws Exception{
try {
		Debug.PushSubsStack("GetDateUpdate (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,61);
if (RapidSub.canDelegate("getdateupdate")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getdateupdate");}
 BA.debugLineNum = 61;BA.debugLine="Sub GetDateUpdate";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="DateUpdate=MCode.SingleResult(\"select FldDateUpda";
Debug.ShouldStop(536870912);
firebasemessaging._dateupdate = BA.ObjectToString(firebasemessaging.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("select FldDateUpdate from TblSetting"))));
 BA.debugLineNum = 63;BA.debugLine="Log(\"DateUpdate :\"&DateUpdate)";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114032642",RemoteObject.concat(RemoteObject.createImmutable("DateUpdate :"),firebasemessaging._dateupdate),0);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geteshantion() throws Exception{
try {
		Debug.PushSubsStack("GetEshantion (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,622);
if (RapidSub.canDelegate("geteshantion")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","geteshantion");}
 BA.debugLineNum = 622;BA.debugLine="Public Sub GetEshantion";
Debug.ShouldStop(8192);
 BA.debugLineNum = 623;BA.debugLine="jobInternet.JobName =\"GetEshantion\"";
Debug.ShouldStop(16384);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetEshantion"));
 BA.debugLineNum = 624;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(32768);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetEshantion"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),firebasemessaging.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateUpdate="),firebasemessaging._dateupdate)));
 BA.debugLineNum = 625;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfee() throws Exception{
try {
		Debug.PushSubsStack("GetFee (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1016);
if (RapidSub.canDelegate("getfee")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getfee");}
 BA.debugLineNum = 1016;BA.debugLine="Sub GetFee";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1017;BA.debugLine="jobInternet.JobName =\"GetFee\"";
Debug.ShouldStop(16777216);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetFee"));
 BA.debugLineNum = 1018;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(33554432);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetListFee"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateUpdate="),firebasemessaging._dateupdate)));
 BA.debugLineNum = 1019;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getforooshandkharid(RemoteObject _codetafzili,RemoteObject _codekala) throws Exception{
try {
		Debug.PushSubsStack("GetForooshAndKharid (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,360);
if (RapidSub.canDelegate("getforooshandkharid")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getforooshandkharid", _codetafzili, _codekala);}
Debug.locals.put("CodeTafzili", _codetafzili);
Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 360;BA.debugLine="Public Sub GetForooshAndKharid(CodeTafzili As Stri";
Debug.ShouldStop(128);
 BA.debugLineNum = 361;BA.debugLine="CodeTafzili1=CodeTafzili";
Debug.ShouldStop(256);
firebasemessaging._codetafzili1 = _codetafzili;
 BA.debugLineNum = 362;BA.debugLine="CodeKala1=CodeKala";
Debug.ShouldStop(512);
firebasemessaging._codekala1 = _codekala;
 BA.debugLineNum = 363;BA.debugLine="StatusCodeKala1=\"NotOK\"";
Debug.ShouldStop(1024);
firebasemessaging._statuscodekala1 = BA.ObjectToString("NotOK");
 BA.debugLineNum = 364;BA.debugLine="If StatusCodeKala1=\"NotOK\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",firebasemessaging._statuscodekala1,BA.ObjectToString("NotOK"))) { 
 BA.debugLineNum = 365;BA.debugLine="GetKala(\"GetSingleKala\")";
Debug.ShouldStop(4096);
_getkala(RemoteObject.createImmutable("GetSingleKala"));
 };
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgallerykala(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("GetGalleryKala (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,547);
if (RapidSub.canDelegate("getgallerykala")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getgallerykala", _str);}
RemoteObject _tblname = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 547;BA.debugLine="Sub GetGalleryKala(str As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 548;BA.debugLine="Select str";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_str,BA.ObjectToString("GetGalleryKala"),BA.ObjectToString("GetGalleryKalaAll"))) {
case 0: {
 BA.debugLineNum = 550;BA.debugLine="jobInternet.JobName =\"GetGalleryKala\"";
Debug.ShouldStop(32);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetGalleryKala"));
 BA.debugLineNum = 552;BA.debugLine="Dim tblname As String";
Debug.ShouldStop(128);
_tblname = RemoteObject.createImmutable("");Debug.locals.put("tblname", _tblname);
 BA.debugLineNum = 553;BA.debugLine="tblname=\"tblGalleryPic\"";
Debug.ShouldStop(256);
_tblname = BA.ObjectToString("tblGalleryPic");Debug.locals.put("tblname", _tblname);
 BA.debugLineNum = 554;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(512);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroidFast"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("TblName="),_tblname,RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateUpdate="),firebasemessaging._dateupdate)));
 break; }
case 1: {
 BA.debugLineNum = 558;BA.debugLine="jobInternet.JobName =\"GetGalleryKalaAll\"";
Debug.ShouldStop(8192);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetGalleryKalaAll"));
 BA.debugLineNum = 559;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(16384);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=select * from tblGalleryPic where fldDateUpdate='"),firebasemessaging._dateupdate,RemoteObject.createImmutable("'"),RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 563;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgoroohashkhas(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("GetGoroohAshkhas (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,899);
if (RapidSub.canDelegate("getgoroohashkhas")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getgoroohashkhas", _str);}
RemoteObject _tblname = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 899;BA.debugLine="Sub GetGoroohAshkhas(str As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 900;BA.debugLine="Select str";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_str,BA.ObjectToString("GetGoroohAshkhas"),BA.ObjectToString("GetGoroohAshkhasAll"))) {
case 0: {
 BA.debugLineNum = 902;BA.debugLine="jobInternet.JobName =\"GetGoroohAshkhas\"";
Debug.ShouldStop(32);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetGoroohAshkhas"));
 BA.debugLineNum = 903;BA.debugLine="Dim tblname As String";
Debug.ShouldStop(64);
_tblname = RemoteObject.createImmutable("");Debug.locals.put("tblname", _tblname);
 BA.debugLineNum = 904;BA.debugLine="tblname=\"dbo.tblGroupAshkhas\"";
Debug.ShouldStop(128);
_tblname = BA.ObjectToString("dbo.tblGroupAshkhas");Debug.locals.put("tblname", _tblname);
 BA.debugLineNum = 905;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(256);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroidFast"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("TblName="),_tblname,RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateUpdate="),firebasemessaging._dateupdate)));
 break; }
case 1: {
 BA.debugLineNum = 907;BA.debugLine="jobInternet.JobName =\"GetGoroohAshkhasAll\"";
Debug.ShouldStop(1024);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetGoroohAshkhasAll"));
 BA.debugLineNum = 908;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(2048);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=Select fldGroupId,fldGroupName From tblGroupAshkhas ORDER BY CONVERT(varchar, fldGroupId)"),RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 910;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgoroohkala(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("GetGoroohKala (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,707);
if (RapidSub.canDelegate("getgoroohkala")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getgoroohkala", _str);}
RemoteObject _tblname = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 707;BA.debugLine="Sub GetGoroohKala(str As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 708;BA.debugLine="Select str";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_str,BA.ObjectToString("GetGoroohKala"),BA.ObjectToString("GetGoroohKalaAll"))) {
case 0: {
 BA.debugLineNum = 710;BA.debugLine="jobInternet.JobName =\"GetGoroohKala\"";
Debug.ShouldStop(32);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetGoroohKala"));
 BA.debugLineNum = 712;BA.debugLine="Dim tblname As String";
Debug.ShouldStop(128);
_tblname = RemoteObject.createImmutable("");Debug.locals.put("tblname", _tblname);
 BA.debugLineNum = 713;BA.debugLine="tblname=\"dbo.tblGroupKala\"";
Debug.ShouldStop(256);
_tblname = BA.ObjectToString("dbo.tblGroupKala");Debug.locals.put("tblname", _tblname);
 BA.debugLineNum = 714;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(512);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroidFast"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("TblName="),_tblname,RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateUpdate="),firebasemessaging._dateupdate)));
 break; }
case 1: {
 BA.debugLineNum = 717;BA.debugLine="jobInternet.JobName =\"GetGoroohKalaAll\"";
Debug.ShouldStop(4096);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetGoroohKalaAll"));
 BA.debugLineNum = 718;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(8192);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=Select fldGroupId,fldGroupName From tblGroupKala ORDER BY CONVERT(varchar, fldGroupId)"),RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 722;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gethavale() throws Exception{
try {
		Debug.PushSubsStack("GetHavale (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1153);
if (RapidSub.canDelegate("gethavale")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","gethavale");}
 BA.debugLineNum = 1153;BA.debugLine="Sub GetHavale";
Debug.ShouldStop(1);
 BA.debugLineNum = 1154;BA.debugLine="jobInternet.JobName =\"GetHavale\"";
Debug.ShouldStop(2);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetHavale"));
 BA.debugLineNum = 1155;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(4);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetStoredTozie"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=GetHavale"),RemoteObject.createImmutable(" &Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &flag="),firebasemessaging.mostCurrent._mcode._gethavaleflag /*RemoteObject*/ ,RemoteObject.createImmutable(" &LastDateUpdate="),firebasemessaging._dateupdate)));
 BA.debugLineNum = 1156;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gethavalebyuser() throws Exception{
try {
		Debug.PushSubsStack("GetHavaleByUser (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1157);
if (RapidSub.canDelegate("gethavalebyuser")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","gethavalebyuser");}
 BA.debugLineNum = 1157;BA.debugLine="Sub GetHavaleByUser";
Debug.ShouldStop(16);
 BA.debugLineNum = 1158;BA.debugLine="jobInternet.JobName =\"GetHavaleByUser\"";
Debug.ShouldStop(32);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetHavaleByUser"));
 BA.debugLineNum = 1159;BA.debugLine="Log(DateUpdate)";
Debug.ShouldStop(64);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116457474",firebasemessaging._dateupdate,0);
 BA.debugLineNum = 1160;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(128);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/ShowHavaleGoroohiByRanadeh"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&flag="),firebasemessaging.mostCurrent._mcode._gethavaleflag /*RemoteObject*/ ,RemoteObject.createImmutable("&DateUpdate="),firebasemessaging._dateupdate)));
 BA.debugLineNum = 1161;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getkala(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("GetKala (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,371);
if (RapidSub.canDelegate("getkala")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getkala", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 371;BA.debugLine="Sub GetKala(str As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 372;BA.debugLine="Select str";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_str,BA.ObjectToString("GetKala"),BA.ObjectToString("GetKalaAll"),BA.ObjectToString("GetSingleKala"))) {
case 0: {
 BA.debugLineNum = 374;BA.debugLine="jobInternet.JobName =\"GetKala\"";
Debug.ShouldStop(2097152);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetKala"));
 BA.debugLineNum = 375;BA.debugLine="Log ( MCode.DeviceId)";
Debug.ShouldStop(4194304);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114556932",firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,0);
 BA.debugLineNum = 377;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(16777216);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetStoredFast"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=ListKala"),RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&fldFeeTasvie="),firebasemessaging.mostCurrent._mcode._feecode /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateUpdate="),firebasemessaging._dateupdate)));
 break; }
case 1: {
 BA.debugLineNum = 380;BA.debugLine="jobInternet.JobName =\"GetKalaAll\"";
Debug.ShouldStop(134217728);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetKalaAll"));
 BA.debugLineNum = 381;BA.debugLine="Log ( MCode.DeviceId)";
Debug.ShouldStop(268435456);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114556938",firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,0);
 BA.debugLineNum = 382;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(536870912);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetStoredNew"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=ListKala"),RemoteObject.createImmutable("&fldFeeTasvie="),firebasemessaging.mostCurrent._mcode._feecode /*RemoteObject*/ ,RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 break; }
case 2: {
 BA.debugLineNum = 384;BA.debugLine="jobInternet.JobName =\"GetKala\"";
Debug.ShouldStop(-2147483648);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetKala"));
 BA.debugLineNum = 385;BA.debugLine="Log ( MCode.DeviceId)";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114556942",firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,0);
 BA.debugLineNum = 387;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url &";
Debug.ShouldStop(4);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetSingle"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=ListKala"),RemoteObject.createImmutable("&fldCode="),firebasemessaging._codekala1,RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistdelete(RemoteObject _strtype) throws Exception{
try {
		Debug.PushSubsStack("GetListDelete (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,214);
if (RapidSub.canDelegate("getlistdelete")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getlistdelete", _strtype);}
Debug.locals.put("StrType", _strtype);
 BA.debugLineNum = 214;BA.debugLine="Sub GetListDelete(StrType As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="jobInternet.JobName =\"GetListDeleted\"";
Debug.ShouldStop(4194304);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetListDeleted"));
 BA.debugLineNum = 216;BA.debugLine="TypeDelete=StrType";
Debug.ShouldStop(8388608);
firebasemessaging._typedelete = _strtype;
 BA.debugLineNum = 217;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(16777216);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetListDeleted"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &StrType="),_strtype,RemoteObject.createImmutable(" &DateUpdate="),firebasemessaging._dateupdate)));
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
public static RemoteObject  _getreportrizepishfactor3() throws Exception{
try {
		Debug.PushSubsStack("GetReportRizePishFactor3 (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1261);
if (RapidSub.canDelegate("getreportrizepishfactor3")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getreportrizepishfactor3");}
 BA.debugLineNum = 1261;BA.debugLine="Sub GetReportRizePishFactor3";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1262;BA.debugLine="jobInternet.JobName =\"GetReportRizePishFactor3\"";
Debug.ShouldStop(8192);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetReportRizePishFactor3"));
 BA.debugLineNum = 1263;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(16384);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetRizReportFactor3"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),firebasemessaging.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 1264;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsetting() throws Exception{
try {
		Debug.PushSubsStack("GetSetting (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,220);
if (RapidSub.canDelegate("getsetting")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getsetting");}
 BA.debugLineNum = 220;BA.debugLine="Sub GetSetting";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="jobInternet.JobName =\"GetSetting\"";
Debug.ShouldStop(268435456);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetSetting"));
 BA.debugLineNum = 222;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(536870912);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetSetting"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettasvie() throws Exception{
try {
		Debug.PushSubsStack("GetTasvie (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1078);
if (RapidSub.canDelegate("gettasvie")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","gettasvie");}
 BA.debugLineNum = 1078;BA.debugLine="Sub GetTasvie";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1079;BA.debugLine="jobInternet.JobName =\"GetTasvie\"";
Debug.ShouldStop(4194304);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetTasvie"));
 BA.debugLineNum = 1080;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8388608);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetListTasvie"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateUpdate="),firebasemessaging._dateupdate)));
 BA.debugLineNum = 1081;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getupdatefee() throws Exception{
try {
		Debug.PushSubsStack("GetUpdateFee (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,520);
if (RapidSub.canDelegate("getupdatefee")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","getupdatefee");}
 BA.debugLineNum = 520;BA.debugLine="Sub GetUpdateFee";
Debug.ShouldStop(128);
 BA.debugLineNum = 521;BA.debugLine="jobInternet.JobName =\"GetUpdateFee\"";
Debug.ShouldStop(256);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetUpdateFee"));
 BA.debugLineNum = 522;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(512);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetStoredNew"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=UpdateFee"),RemoteObject.createImmutable("&fldFeeTasvie="),firebasemessaging.mostCurrent._mcode._feecode /*RemoteObject*/ ,RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("JobDone (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1457);
if (RapidSub.canDelegate("jobdone")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","jobdone", _job);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _strcurrentdate = RemoteObject.createImmutable("");
RemoteObject _strlistdeleted = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 1457;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1458;BA.debugLine="Job.GetRequest.Timeout=50000";
Debug.ShouldStop(131072);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 1459;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(262144);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1461;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 1462;BA.debugLine="Dim Str As String = Job.GetString";
Debug.ShouldStop(2097152);
_str = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 1463;BA.debugLine="Log(\"JobName: \"&Job.JobName & \" ,str=\"&Str)";
Debug.ShouldStop(4194304);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116981766",RemoteObject.concat(RemoteObject.createImmutable("JobName: "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(" ,str="),_str),0);
 BA.debugLineNum = 1464;BA.debugLine="Select Case Job.JobName";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("GetSetting"),BA.ObjectToString("SaveToken"),BA.ObjectToString("GetCurrentDate"),BA.ObjectToString("GetKala"),BA.ObjectToString("GetKalaAll"),BA.ObjectToString("GetUpdateFee"),BA.ObjectToString("GetGoroohKala"),BA.ObjectToString("GetGoroohKalaAll"),BA.ObjectToString("GetAshkhas"),BA.ObjectToString("GetGalleryKala"),BA.ObjectToString("GetAshkhasAll"),BA.ObjectToString("GetVaziat"),BA.ObjectToString("GetGoroohAshkhas"),BA.ObjectToString("GetGoroohAshkhasAll"),BA.ObjectToString("GetEshantion"),BA.ObjectToString("GetFee"),BA.ObjectToString("GetHavale"),BA.ObjectToString("GetHavaleByUser"),BA.ObjectToString("ShowRizFactorForooshByHavale"),BA.ObjectToString("GetTasvie"),BA.ObjectToString("GetReportRizePishFactor3"),BA.ObjectToString("GetListDeleted"))) {
case 0: {
 BA.debugLineNum = 1466;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1468;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 1470;BA.debugLine="LoadGetSetting(Str)";
Debug.ShouldStop(536870912);
_loadgetsetting(_str);
 };
 BA.debugLineNum = 1474;BA.debugLine="MCode.downloadingData=False";
Debug.ShouldStop(2);
firebasemessaging.mostCurrent._mcode._downloadingdata /*RemoteObject*/  = firebasemessaging.mostCurrent.__c.getField(true,"False");
 break; }
case 1: {
 BA.debugLineNum = 1476;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1477;BA.debugLine="Log(\"خطا در ارسال توکین\")";
Debug.ShouldStop(16);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116981780",RemoteObject.createImmutable("خطا در ارسال توکین"),0);
 }else {
 BA.debugLineNum = 1479;BA.debugLine="Log(\"توکین با موفقیت ارسال گردید\")";
Debug.ShouldStop(64);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116981782",RemoteObject.createImmutable("توکین با موفقیت ارسال گردید"),0);
 };
 break; }
case 2: {
 BA.debugLineNum = 1483;BA.debugLine="Dim StrCurrentDate As String = Job.GetString";
Debug.ShouldStop(1024);
_strcurrentdate = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("StrCurrentDate", _strcurrentdate);Debug.locals.put("StrCurrentDate", _strcurrentdate);
 BA.debugLineNum = 1485;BA.debugLine="If StrCurrentDate <> \"No Result\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",_strcurrentdate,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1486;BA.debugLine="datenow=StrCurrentDate";
Debug.ShouldStop(8192);
firebasemessaging._datenow = _strcurrentdate;
 BA.debugLineNum = 1488;BA.debugLine="If datenow.Length = 24 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",firebasemessaging._datenow.runMethod(true,"length"),BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 1489;BA.debugLine="datenow=datenow.SubString2(0,23)";
Debug.ShouldStop(65536);
firebasemessaging._datenow = firebasemessaging._datenow.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 23)));
 };
 BA.debugLineNum = 1492;BA.debugLine="Log(\"datenow: \"&datenow)";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116981795",RemoteObject.concat(RemoteObject.createImmutable("datenow: "),firebasemessaging._datenow),0);
 BA.debugLineNum = 1494;BA.debugLine="MCode.SaveUpdate(\"Update TblSetting Set FldD";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set FldDateUpdate='"),firebasemessaging._datenow,RemoteObject.createImmutable("'"))));
 };
 break; }
case 3: {
 BA.debugLineNum = 1497;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 1502;BA.debugLine="LoadGetKalaFast(Str)";
Debug.ShouldStop(536870912);
_loadgetkalafast(_str);
 };
 BA.debugLineNum = 1504;BA.debugLine="Log(\"kala update\")";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116981807",RemoteObject.createImmutable("kala update"),0);
 BA.debugLineNum = 1505;BA.debugLine="MCode.downloadingData=False";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent._mcode._downloadingdata /*RemoteObject*/  = firebasemessaging.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1506;BA.debugLine="If CodeTafzili1>0 And CodeKala1>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, firebasemessaging._codetafzili1),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, firebasemessaging._codekala1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1507;BA.debugLine="StatusCodeKala1=\"OK\"";
Debug.ShouldStop(4);
firebasemessaging._statuscodekala1 = BA.ObjectToString("OK");
 BA.debugLineNum = 1508;BA.debugLine="GetAshkhas(\"GetSingleAshkhas\")";
Debug.ShouldStop(8);
_getashkhas(RemoteObject.createImmutable("GetSingleAshkhas"));
 };
 break; }
case 4: {
 BA.debugLineNum = 1525;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1528;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 1530;BA.debugLine="LoadGetKala(Str)";
Debug.ShouldStop(33554432);
_loadgetkala(_str);
 };
 break; }
case 5: {
 BA.debugLineNum = 1534;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1536;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 1538;BA.debugLine="LoadGetUpdateFee(Str)";
Debug.ShouldStop(2);
_loadgetupdatefee(_str);
 };
 BA.debugLineNum = 1541;BA.debugLine="Select MCode.page";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(firebasemessaging.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("KalaDefault"),BA.ObjectToString("Kala_listi"),BA.ObjectToString("SabtMarjooii"),BA.ObjectToString("Search"))) {
case 0: {
 BA.debugLineNum = 1544;BA.debugLine="CallSubDelayed(Act_KalaDefault,\"LoadKala\")";
Debug.ShouldStop(128);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_kaladefault.getObject())),(Object)(RemoteObject.createImmutable("LoadKala")));
 break; }
case 1: {
 BA.debugLineNum = 1546;BA.debugLine="CallSubDelayed(Act_Kala_listi,\"LoadKala\")";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_kala_listi.getObject())),(Object)(RemoteObject.createImmutable("LoadKala")));
 break; }
case 2: {
 BA.debugLineNum = 1548;BA.debugLine="CallSubDelayed(Act_KalaDefault,\"LoadKala\")";
Debug.ShouldStop(2048);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_kaladefault.getObject())),(Object)(RemoteObject.createImmutable("LoadKala")));
 break; }
case 3: {
 BA.debugLineNum = 1550;BA.debugLine="CallSubDelayed(Act_Search,\"LoadKala\")";
Debug.ShouldStop(8192);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_search.getObject())),(Object)(RemoteObject.createImmutable("LoadKala")));
 break; }
}
;
 break; }
case 6: {
 BA.debugLineNum = 1553;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 1558;BA.debugLine="LoadGetGoroohKalaFast(Str)";
Debug.ShouldStop(2097152);
_loadgetgoroohkalafast(_str);
 };
 BA.debugLineNum = 1560;BA.debugLine="Log(\"GetGoroohKala update\")";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116981863",RemoteObject.createImmutable("GetGoroohKala update"),0);
 BA.debugLineNum = 1561;BA.debugLine="MCode.downloadingData=False";
Debug.ShouldStop(16777216);
firebasemessaging.mostCurrent._mcode._downloadingdata /*RemoteObject*/  = firebasemessaging.mostCurrent.__c.getField(true,"False");
 break; }
case 7: {
 BA.debugLineNum = 1564;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1567;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 1569;BA.debugLine="LoadGetGoroohKala(Str)";
Debug.ShouldStop(1);
_loadgetgoroohkala(_str);
 };
 break; }
case 8: {
 BA.debugLineNum = 1574;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 1578;BA.debugLine="LoadGetAshkhasFast(Str)";
Debug.ShouldStop(512);
_loadgetashkhasfast(_str);
 };
 BA.debugLineNum = 1581;BA.debugLine="Log(\"GetAshkhas update\")";
Debug.ShouldStop(4096);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116981884",RemoteObject.createImmutable("GetAshkhas update"),0);
 BA.debugLineNum = 1582;BA.debugLine="MCode.downloadingData=False";
Debug.ShouldStop(8192);
firebasemessaging.mostCurrent._mcode._downloadingdata /*RemoteObject*/  = firebasemessaging.mostCurrent.__c.getField(true,"False");
 break; }
case 9: {
 BA.debugLineNum = 1592;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1595;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 1597;BA.debugLine="LoadGetGalleryKalaFast(Str)";
Debug.ShouldStop(268435456);
_loadgetgallerykalafast(_str);
 };
 BA.debugLineNum = 1603;BA.debugLine="MCode.downloadingData=False";
Debug.ShouldStop(4);
firebasemessaging.mostCurrent._mcode._downloadingdata /*RemoteObject*/  = firebasemessaging.mostCurrent.__c.getField(true,"False");
 break; }
case 10: {
 BA.debugLineNum = 1605;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1608;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(128);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 1610;BA.debugLine="LoadGetAshkhas(Str)";
Debug.ShouldStop(512);
_loadgetashkhas(_str);
 };
 break; }
case 11: {
 BA.debugLineNum = 1614;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1616;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32768);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 };
 break; }
case 12: {
 BA.debugLineNum = 1622;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 1626;BA.debugLine="LoadGetGoroohAshkhasFast(Str)";
Debug.ShouldStop(33554432);
_loadgetgoroohashkhasfast(_str);
 };
 BA.debugLineNum = 1629;BA.debugLine="Log(\"GetGoroohAshkhas update\")";
Debug.ShouldStop(268435456);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116981932",RemoteObject.createImmutable("GetGoroohAshkhas update"),0);
 BA.debugLineNum = 1631;BA.debugLine="MCode.downloadingData=False";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent._mcode._downloadingdata /*RemoteObject*/  = firebasemessaging.mostCurrent.__c.getField(true,"False");
 break; }
case 13: {
 BA.debugLineNum = 1633;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1636;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 1638;BA.debugLine="LoadGetGoroohAshkhas(Str)";
Debug.ShouldStop(32);
_loadgetgoroohashkhas(_str);
 };
 break; }
case 14: {
 BA.debugLineNum = 1643;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1646;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8192);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 1648;BA.debugLine="LoadGetEshantionFast(Str)";
Debug.ShouldStop(32768);
_loadgeteshantionfast(_str);
 };
 BA.debugLineNum = 1651;BA.debugLine="MCode.downloadingData=False";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent._mcode._downloadingdata /*RemoteObject*/  = firebasemessaging.mostCurrent.__c.getField(true,"False");
 break; }
case 15: {
 BA.debugLineNum = 1653;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 1658;BA.debugLine="LoadGetFee(Str)";
Debug.ShouldStop(33554432);
_loadgetfee(_str);
 };
 BA.debugLineNum = 1660;BA.debugLine="MCode.downloadingData=False";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent._mcode._downloadingdata /*RemoteObject*/  = firebasemessaging.mostCurrent.__c.getField(true,"False");
 break; }
case 16: {
 BA.debugLineNum = 1667;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1670;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 1672;BA.debugLine="If MCode.GetHavaleFlag=0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",firebasemessaging.mostCurrent._mcode._gethavaleflag /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1673;BA.debugLine="LoadGetGetHavale(Str)";
Debug.ShouldStop(256);
_loadgetgethavale(_str);
 }else {
 BA.debugLineNum = 1675;BA.debugLine="LoadGetGetHavaleFast(Str)";
Debug.ShouldStop(1024);
_loadgetgethavalefast(_str);
 };
 };
 break; }
case 17: {
 BA.debugLineNum = 1679;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1682;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(131072);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 1684;BA.debugLine="LoadGetGetHavaleFast(Str)";
Debug.ShouldStop(524288);
_loadgetgethavalefast(_str);
 };
 BA.debugLineNum = 1686;BA.debugLine="ShowRizeFactorForooshByHavale";
Debug.ShouldStop(2097152);
_showrizefactorforooshbyhavale();
 break; }
case 18: {
 BA.debugLineNum = 1688;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 1692;BA.debugLine="LoadShowRizeFactorForooshByHavale(Str)";
Debug.ShouldStop(134217728);
_loadshowrizefactorforooshbyhavale(_str);
 };
 BA.debugLineNum = 1694;BA.debugLine="If MCode.page=\"Act_RizeFactorHavale\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",firebasemessaging.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_RizeFactorHavale"))) { 
 BA.debugLineNum = 1695;BA.debugLine="CallSubDelayed(Act_RizeFactorHavale,\"CreateP";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_rizefactorhavale.getObject())),(Object)(RemoteObject.createImmutable("CreatePge")));
 };
 BA.debugLineNum = 1697;BA.debugLine="If MCode.page=\"Act_HavaleTozie\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",firebasemessaging.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_HavaleTozie"))) { 
 BA.debugLineNum = 1698;BA.debugLine="CallSubDelayed(Act_HavaleTozie,\"LoadFilter\")";
Debug.ShouldStop(2);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_havaletozie.getObject())),(Object)(RemoteObject.createImmutable("LoadFilter")));
 };
 break; }
case 19: {
 BA.debugLineNum = 1702;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 1709;BA.debugLine="LoadGetTasvieFast(Str)";
Debug.ShouldStop(4096);
_loadgettasviefast(_str);
 };
 BA.debugLineNum = 1711;BA.debugLine="If MCode.downloadingData=False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",firebasemessaging.mostCurrent._mcode._downloadingdata /*RemoteObject*/ ,firebasemessaging.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1712;BA.debugLine="Select MCode.page";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(firebasemessaging.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("KalaDefault"),BA.ObjectToString("Kala_listi"),BA.ObjectToString("SabtMarjooii"),BA.ObjectToString("Search"))) {
case 0: {
 BA.debugLineNum = 1714;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(131072);
firebasemessaging.mostCurrent.__c.runVoidMethod ("StartActivity",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_kaladefault.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 1716;BA.debugLine="StartActivity(Act_Kala_listi)";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent.__c.runVoidMethod ("StartActivity",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_kala_listi.getObject())));
 break; }
case 2: {
 BA.debugLineNum = 1718;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent.__c.runVoidMethod ("StartActivity",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_kaladefault.getObject())));
 break; }
case 3: {
 BA.debugLineNum = 1720;BA.debugLine="StartActivity(Act_Search)";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent.__c.runVoidMethod ("StartActivity",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_search.getObject())));
 break; }
}
;
 }else {
 BA.debugLineNum = 1723;BA.debugLine="MCode.downloadingData=False";
Debug.ShouldStop(67108864);
firebasemessaging.mostCurrent._mcode._downloadingdata /*RemoteObject*/  = firebasemessaging.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 1727;BA.debugLine="MCode.page=\"\"";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("");
 break; }
case 20: {
 BA.debugLineNum = 1731;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1733;BA.debugLine="ToastMessageShow(\"سفارش موجود نمی باشد\",True";
Debug.ShouldStop(16);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش موجود نمی باشد")),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 1737;BA.debugLine="LoadGetReportRizePishFactor3Fast(Str)";
Debug.ShouldStop(256);
_loadgetreportrizepishfactor3fast(_str);
 };
 break; }
case 21: {
 BA.debugLineNum = 1741;BA.debugLine="Dim StrListDeleted As String = Job.GetString";
Debug.ShouldStop(4096);
_strlistdeleted = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("StrListDeleted", _strlistdeleted);Debug.locals.put("StrListDeleted", _strlistdeleted);
 BA.debugLineNum = 1743;BA.debugLine="If StrListDeleted = \"No Result\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_strlistdeleted,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1745;BA.debugLine="Select TypeDelete";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(firebasemessaging._typedelete,BA.ObjectToString("kala"),BA.ObjectToString("ashkhas"),BA.ObjectToString("GroupKala"),BA.ObjectToString("GalleryPic"),BA.ObjectToString("GroupAshkhas"),BA.ObjectToString("deleteall"))) {
case 0: {
 BA.debugLineNum = 1747;BA.debugLine="Log(\"لیست حذف کالا خالی است\")";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116982050",RemoteObject.createImmutable("لیست حذف کالا خالی است"),0);
 break; }
case 1: {
 BA.debugLineNum = 1749;BA.debugLine="Log(\"لیست حذف اشخاص خالی است\")";
Debug.ShouldStop(1048576);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116982052",RemoteObject.createImmutable("لیست حذف اشخاص خالی است"),0);
 break; }
case 2: {
 BA.debugLineNum = 1751;BA.debugLine="Log(\"لیست حذف گروه کالا خالی است\")";
Debug.ShouldStop(4194304);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116982054",RemoteObject.createImmutable("لیست حذف گروه کالا خالی است"),0);
 break; }
case 3: {
 BA.debugLineNum = 1753;BA.debugLine="Log(\"لیست حذف گالری تصاویر خالی است\")";
Debug.ShouldStop(16777216);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116982056",RemoteObject.createImmutable("لیست حذف گالری تصاویر خالی است"),0);
 break; }
case 4: {
 BA.debugLineNum = 1755;BA.debugLine="Log(\"لیست حذف گروه اشخاص خالی است\")";
Debug.ShouldStop(67108864);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116982058",RemoteObject.createImmutable("لیست حذف گروه اشخاص خالی است"),0);
 break; }
case 5: {
 BA.debugLineNum = 1757;BA.debugLine="Log(\"لیست حذف کلی خالی است\")";
Debug.ShouldStop(268435456);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116982060",RemoteObject.createImmutable("لیست حذف کلی خالی است"),0);
 break; }
}
;
 }else {
 BA.debugLineNum = 1762;BA.debugLine="LoadGetListDelete(StrListDeleted)";
Debug.ShouldStop(2);
_loadgetlistdelete(_strlistdeleted);
 };
 BA.debugLineNum = 1765;BA.debugLine="Select TypeDelete";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(firebasemessaging._typedelete,BA.ObjectToString("kala"),BA.ObjectToString("ashkhas"),BA.ObjectToString("GroupKala"),BA.ObjectToString("GetTokenData"))) {
case 0: {
 BA.debugLineNum = 1767;BA.debugLine="TypeDelete=\"ashkhas\"";
Debug.ShouldStop(64);
firebasemessaging._typedelete = BA.ObjectToString("ashkhas");
 BA.debugLineNum = 1768;BA.debugLine="GetListDelete(\"ashkhas\")";
Debug.ShouldStop(128);
_getlistdelete(RemoteObject.createImmutable("ashkhas"));
 break; }
case 1: {
 BA.debugLineNum = 1771;BA.debugLine="TypeDelete=\"GroupKala\"";
Debug.ShouldStop(1024);
firebasemessaging._typedelete = BA.ObjectToString("GroupKala");
 BA.debugLineNum = 1772;BA.debugLine="GetListDelete(\"GroupKala\")";
Debug.ShouldStop(2048);
_getlistdelete(RemoteObject.createImmutable("GroupKala"));
 break; }
case 2: {
 BA.debugLineNum = 1774;BA.debugLine="TypeDelete=\"GroupAshkhas\"";
Debug.ShouldStop(8192);
firebasemessaging._typedelete = BA.ObjectToString("GroupAshkhas");
 BA.debugLineNum = 1775;BA.debugLine="GetListDelete(\"GroupAshkhas\")";
Debug.ShouldStop(16384);
_getlistdelete(RemoteObject.createImmutable("GroupAshkhas"));
 break; }
case 3: {
 BA.debugLineNum = 1778;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1780;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 };
 break; }
}
;
 BA.debugLineNum = 1790;BA.debugLine="StartService(FusedLocationService)";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent.__c.runVoidMethod ("StartService",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 1791;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116982094",RemoteObject.createImmutable("Gps Start"),0);
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e221) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e221.toString()); BA.debugLineNum = 1799;BA.debugLine="StartService(FusedLocationService)";
Debug.ShouldStop(64);
firebasemessaging.mostCurrent.__c.runVoidMethod ("StartService",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 1800;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(128);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116982103",RemoteObject.createImmutable("Gps Start"),0);
 BA.debugLineNum = 1801;BA.debugLine="Log(\"error: \"&Job.JobName)";
Debug.ShouldStop(256);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116982104",RemoteObject.concat(RemoteObject.createImmutable("error: "),_job.getField(true,"_jobname" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1802;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116982105",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 1803;BA.debugLine="myCode.SendError(Job.ErrorMessage,\"Service_Serv";
Debug.ShouldStop(1024);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Service_Server-JobDone: "),_job.getField(true,"_jobname" /*RemoteObject*/ ))));
 };
 }else {
 BA.debugLineNum = 1806;BA.debugLine="myCode.SendError(Job.ErrorMessage,\"Service_Serve";
Debug.ShouldStop(8192);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Service_Server-JobDone: "),_job.getField(true,"_jobname" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 1808;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("LoadData (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,83);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loaddata");}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _getdate = RemoteObject.createImmutable("");
RemoteObject _gettime = RemoteObject.createImmutable("");
 BA.debugLineNum = 83;BA.debugLine="Sub LoadData";
Debug.ShouldStop(262144);
 BA.debugLineNum = 86;BA.debugLine="GetDateUpdate";
Debug.ShouldStop(2097152);
_getdateupdate();
 BA.debugLineNum = 87;BA.debugLine="Dim str As String";
Debug.ShouldStop(4194304);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 88;BA.debugLine="str=mode";
Debug.ShouldStop(8388608);
_str = firebasemessaging._mode;Debug.locals.put("str", _str);
 BA.debugLineNum = 89;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 92;BA.debugLine="Log(\"Gps Stop\")";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098185",RemoteObject.createImmutable("Gps Stop"),0);
 BA.debugLineNum = 94;BA.debugLine="Select str";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_str,BA.ObjectToString("GetSetting"),BA.ObjectToString("GetKala"),BA.ObjectToString("GetKalaAll"),BA.ObjectToString("GetGoroohKala"),BA.ObjectToString("GetGoroohKalaAll"),BA.ObjectToString("GetAshkhas"),BA.ObjectToString("GetAshkhasAll"),BA.ObjectToString("GetGoroohAshkhas"),BA.ObjectToString("GetGoroohAshkhasAll"),BA.ObjectToString("GetGalleryKalaAll"),BA.ObjectToString("GetUpdateFee"),BA.ObjectToString("GetGalleryKala"),BA.ObjectToString("GetHavale"),BA.ObjectToString("GetHavaleByUser"),BA.ObjectToString("GetEshantion"),BA.ObjectToString("GetVaziat"),BA.ObjectToString("GetFee"),BA.ObjectToString("GetTasvie"),BA.ObjectToString("GetReportRizePishFactor3"),BA.ObjectToString("stop"),BA.ObjectToString("GetDelete"))) {
case 0: {
 BA.debugLineNum = 97;BA.debugLine="Log(str)";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098190",_str,0);
 BA.debugLineNum = 98;BA.debugLine="GetSetting";
Debug.ShouldStop(2);
_getsetting();
 break; }
case 1: {
 BA.debugLineNum = 101;BA.debugLine="Log(str)";
Debug.ShouldStop(16);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098194",_str,0);
 BA.debugLineNum = 102;BA.debugLine="GetKala(\"GetKala\")";
Debug.ShouldStop(32);
_getkala(RemoteObject.createImmutable("GetKala"));
 break; }
case 2: {
 BA.debugLineNum = 105;BA.debugLine="Log(str)";
Debug.ShouldStop(256);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098198",_str,0);
 BA.debugLineNum = 106;BA.debugLine="GetKala(\"GetKalaAll\")";
Debug.ShouldStop(512);
_getkala(RemoteObject.createImmutable("GetKalaAll"));
 break; }
case 3: {
 BA.debugLineNum = 110;BA.debugLine="Log(str)";
Debug.ShouldStop(8192);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098203",_str,0);
 BA.debugLineNum = 111;BA.debugLine="GetGoroohKala(\"GetGoroohKala\")";
Debug.ShouldStop(16384);
_getgoroohkala(RemoteObject.createImmutable("GetGoroohKala"));
 break; }
case 4: {
 BA.debugLineNum = 115;BA.debugLine="Log(str)";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098208",_str,0);
 BA.debugLineNum = 116;BA.debugLine="GetGoroohKala(\"GetGoroohKalaAll\")";
Debug.ShouldStop(524288);
_getgoroohkala(RemoteObject.createImmutable("GetGoroohKalaAll"));
 break; }
case 5: {
 BA.debugLineNum = 121;BA.debugLine="Log(str)";
Debug.ShouldStop(16777216);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098214",_str,0);
 BA.debugLineNum = 122;BA.debugLine="GetAshkhas(\"GetAshkhas\")";
Debug.ShouldStop(33554432);
_getashkhas(RemoteObject.createImmutable("GetAshkhas"));
 break; }
case 6: {
 BA.debugLineNum = 126;BA.debugLine="Log(str)";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098219",_str,0);
 BA.debugLineNum = 127;BA.debugLine="GetAshkhas(\"GetAshkhasAll\")";
Debug.ShouldStop(1073741824);
_getashkhas(RemoteObject.createImmutable("GetAshkhasAll"));
 break; }
case 7: {
 BA.debugLineNum = 132;BA.debugLine="Log(str)";
Debug.ShouldStop(8);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098225",_str,0);
 BA.debugLineNum = 133;BA.debugLine="GetGoroohAshkhas(\"GetGoroohAshkhas\")";
Debug.ShouldStop(16);
_getgoroohashkhas(RemoteObject.createImmutable("GetGoroohAshkhas"));
 break; }
case 8: {
 BA.debugLineNum = 136;BA.debugLine="Log(str)";
Debug.ShouldStop(128);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098229",_str,0);
 break; }
case 9: {
 BA.debugLineNum = 141;BA.debugLine="GetGalleryKala(\"GetGalleryKalaAll\")";
Debug.ShouldStop(4096);
_getgallerykala(RemoteObject.createImmutable("GetGalleryKalaAll"));
 break; }
case 10: {
 BA.debugLineNum = 144;BA.debugLine="GetUpdateFee";
Debug.ShouldStop(32768);
_getupdatefee();
 break; }
case 11: {
 BA.debugLineNum = 147;BA.debugLine="GetGalleryKala(\"GetGalleryKala\")";
Debug.ShouldStop(262144);
_getgallerykala(RemoteObject.createImmutable("GetGalleryKala"));
 break; }
case 12: {
 BA.debugLineNum = 150;BA.debugLine="GetHavale";
Debug.ShouldStop(2097152);
_gethavale();
 break; }
case 13: {
 BA.debugLineNum = 153;BA.debugLine="GetHavaleByUser";
Debug.ShouldStop(16777216);
_gethavalebyuser();
 break; }
case 14: {
 BA.debugLineNum = 157;BA.debugLine="GetEshantion";
Debug.ShouldStop(268435456);
_geteshantion();
 break; }
case 15: {
 BA.debugLineNum = 160;BA.debugLine="Log(str)";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098253",_str,0);
 break; }
case 16: {
 BA.debugLineNum = 163;BA.debugLine="Log(str)";
Debug.ShouldStop(4);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098256",_str,0);
 BA.debugLineNum = 164;BA.debugLine="GetFee";
Debug.ShouldStop(8);
_getfee();
 break; }
case 17: {
 BA.debugLineNum = 166;BA.debugLine="Log(str)";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098259",_str,0);
 BA.debugLineNum = 167;BA.debugLine="GetTasvie";
Debug.ShouldStop(64);
_gettasvie();
 break; }
case 18: {
 BA.debugLineNum = 169;BA.debugLine="Log(str)";
Debug.ShouldStop(256);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098262",_str,0);
 BA.debugLineNum = 170;BA.debugLine="GetReportRizePishFactor3";
Debug.ShouldStop(512);
_getreportrizepishfactor3();
 break; }
case 19: {
 BA.debugLineNum = 172;BA.debugLine="Log(\"stop\")";
Debug.ShouldStop(2048);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098265",RemoteObject.createImmutable("stop"),0);
 break; }
case 20: {
 BA.debugLineNum = 174;BA.debugLine="Delete";
Debug.ShouldStop(8192);
_delete();
 break; }
default: {
 BA.debugLineNum = 178;BA.debugLine="Dim GetDate As String";
Debug.ShouldStop(131072);
_getdate = RemoteObject.createImmutable("");Debug.locals.put("GetDate", _getdate);
 BA.debugLineNum = 179;BA.debugLine="Dim GetTime As String";
Debug.ShouldStop(262144);
_gettime = RemoteObject.createImmutable("");Debug.locals.put("GetTime", _gettime);
 BA.debugLineNum = 181;BA.debugLine="GetTime=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(1048576);
_gettime = firebasemessaging.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("GetTime", _gettime);
 BA.debugLineNum = 182;BA.debugLine="GetDate=MCode.DatePersian";
Debug.ShouldStop(2097152);
_getdate = firebasemessaging.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,firebasemessaging.processBA);Debug.locals.put("GetDate", _getdate);
 BA.debugLineNum = 183;BA.debugLine="Log(\"Time: \"&GetTime&\" Date: \"&GetDate)";
Debug.ShouldStop(4194304);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098276",RemoteObject.concat(RemoteObject.createImmutable("Time: "),_gettime,RemoteObject.createImmutable(" Date: "),_getdate),0);
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e68) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e68.toString()); BA.debugLineNum = 201;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114098294",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 202;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadData")));
 };
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetashkhas(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetAshkhas (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,875);
if (RapidSub.canDelegate("loadgetashkhas")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetashkhas", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.createImmutable(0);
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 875;BA.debugLine="Sub LoadGetAshkhas(Str As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 876;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 877;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(4096);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 878;BA.debugLine="Dim m,d As Int=0";
Debug.ShouldStop(8192);
_m = RemoteObject.createImmutable(0);Debug.locals.put("m", _m);
_d = BA.numberCast(int.class, 0);Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 879;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(16384);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 880;BA.debugLine="Row.Initialize";
Debug.ShouldStop(32768);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 881;BA.debugLine="Dim Cu As  Cursor";
Debug.ShouldStop(65536);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 882;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(131072);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Select * From TblAshkhasNew")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 883;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 884;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas where";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblAshkhas where length(FldCodeTafzili)<6")));
 }else {
 BA.debugLineNum = 886;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas\")";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblAshkhas")));
 };
 BA.debugLineNum = 888;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 889;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(16777216);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 890;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblAshkhas\",RowsLi";
Debug.ShouldStop(33554432);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblAshkhas")),(Object)(_rowslist));
 BA.debugLineNum = 891;BA.debugLine="Cu=MCode.Result(\"Select * From TblAshkhas\")";
Debug.ShouldStop(67108864);
_cu = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Select * From TblAshkhas")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 892;BA.debugLine="Log(\"لیست اشخاص بروزرسانی گردید\")";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115605521",RemoteObject.createImmutable("لیست اشخاص بروزرسانی گردید"),0);
 BA.debugLineNum = 893;BA.debugLine="ToastMessageShow(\"لیست اشخاص بروزرسانی گردید:";
Debug.ShouldStop(268435456);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("لیست اشخاص بروزرسانی گردید:   "),_cu.runMethod(true,"getRowCount")))),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e20.toString()); BA.debugLineNum = 895;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115605524",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 896;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetAshkhas")));
 };
 BA.debugLineNum = 898;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetashkhasfast(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetAshkhasFast (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,812);
if (RapidSub.canDelegate("loadgetashkhasfast")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetashkhasfast", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _crow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _where = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 812;BA.debugLine="Sub LoadGetAshkhasFast(Str As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 813;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 814;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(8192);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 815;BA.debugLine="Dim crow As  Cursor";
Debug.ShouldStop(16384);
_crow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("crow", _crow);
 BA.debugLineNum = 816;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(32768);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 817;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(65536);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 818;BA.debugLine="Row.Initialize";
Debug.ShouldStop(131072);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 819;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 820;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(524288);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 822;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(2097152);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit9) || (step9 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit9) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step9))  ) {
 BA.debugLineNum = 823;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(4194304);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 824;BA.debugLine="Log(\"fldCodetafzili:\"& Row.Get(\"fldCodetafzili\")";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115539980",RemoteObject.concat(RemoteObject.createImmutable("fldCodetafzili:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodetafzili"))))),0);
 BA.debugLineNum = 825;BA.debugLine="crow=MCode.Result(\"select * from TblAshkhas wher";
Debug.ShouldStop(16777216);
_crow = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblAshkhas where fldCodetafzili="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodetafzili")))))));Debug.locals.put("crow", _crow);
 BA.debugLineNum = 826;BA.debugLine="CountRow=crow.RowCount";
Debug.ShouldStop(33554432);
_countrow = _crow.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 827;BA.debugLine="If CountRow =0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 828;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblAshkhas\",Row";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblAshkhas")),(Object)(_rowslist));
 BA.debugLineNum = 829;BA.debugLine="If myCode.Is_Null(Row.Get(\"fldCodeMovaghat\"))<";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",firebasemessaging.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeMovaghat"))))))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 830;BA.debugLine="MCode.SaveUpdate(\"Delete from TblAshkhas wher";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete from TblAshkhas where fldCodetafzili= "),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeMovaghat")))))));
 BA.debugLineNum = 831;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor set FldC_T";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblFaktor set FldC_Tafzili="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodetafzili")))),RemoteObject.createImmutable(" where FldC_Tafzili="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeMovaghat")))))));
 };
 BA.debugLineNum = 833;BA.debugLine="Log(\"fldCodetafzili:\"&Row.Get(\"fldCodetafzili\")";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115539989",RemoteObject.concat(RemoteObject.createImmutable("fldCodetafzili:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodetafzili"))))),0);
 }else 
{ BA.debugLineNum = 834;BA.debugLine="Else if CountRow>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 837;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(16);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 838;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(32);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 840;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(128);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 841;BA.debugLine="Where.Initialize";
Debug.ShouldStop(256);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 842;BA.debugLine="Fields.Put(\"fldSharheTafzili\",Row.Get(\"fldSharh";
Debug.ShouldStop(512);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharheTafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharheTafzili"))))));
 BA.debugLineNum = 843;BA.debugLine="Fields.Put(\"fldMande\",Row.Get(\"fldMande\"))";
Debug.ShouldStop(1024);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldMande"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMande"))))));
 BA.debugLineNum = 844;BA.debugLine="Fields.Put(\"fldVisitor\",Row.Get(\"fldVisitor\"))";
Debug.ShouldStop(2048);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldVisitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldVisitor"))))));
 BA.debugLineNum = 845;BA.debugLine="Fields.Put(\"fldTell\",Row.Get(\"fldTell\"))";
Debug.ShouldStop(4096);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldTell"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTell"))))));
 BA.debugLineNum = 846;BA.debugLine="Fields.Put(\"fldAdress\",Row.Get(\"fldAdress\"))";
Debug.ShouldStop(8192);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldAdress"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldAdress"))))));
 BA.debugLineNum = 847;BA.debugLine="Fields.Put(\"fldNameGroup\",Row.Get(\"fldNameGroup";
Debug.ShouldStop(16384);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldNameGroup"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNameGroup"))))));
 BA.debugLineNum = 848;BA.debugLine="Fields.Put(\"fldCodeGroup\",Row.Get(\"fldCodeGroup";
Debug.ShouldStop(32768);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeGroup"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeGroup"))))));
 BA.debugLineNum = 849;BA.debugLine="Fields.Put(\"fldLat\",Row.Get(\"fldLat\"))";
Debug.ShouldStop(65536);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldLat"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldLat"))))));
 BA.debugLineNum = 850;BA.debugLine="Fields.Put(\"fldLon\",Row.Get(\"fldLon\"))";
Debug.ShouldStop(131072);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldLon"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldLon"))))));
 BA.debugLineNum = 851;BA.debugLine="If myCode.Is_Null(Row.Get(\"fldCodeMovaghat\"))<";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",firebasemessaging.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeMovaghat"))))))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 852;BA.debugLine="Fields.Put(\"fldCodetafzili\",Row.Get(\"fldCodet";
Debug.ShouldStop(524288);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodetafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodetafzili"))))));
 BA.debugLineNum = 853;BA.debugLine="Fields.Put(\"fldCodeMovaghat\",Row.Get(\"fldCode";
Debug.ShouldStop(1048576);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeMovaghat"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeMovaghat"))))));
 BA.debugLineNum = 854;BA.debugLine="Log(\"fldCodetafzili:\"&Row.Get(\"fldCodetafzili";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115540010",RemoteObject.concat(RemoteObject.createImmutable("fldCodetafzili:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodetafzili"))))),0);
 BA.debugLineNum = 855;BA.debugLine="Log(\"fldCodeMovaghat:\"&Row.Get(\"fldCodeMovagh";
Debug.ShouldStop(4194304);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115540011",RemoteObject.concat(RemoteObject.createImmutable("fldCodeMovaghat:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeMovaghat"))))),0);
 BA.debugLineNum = 856;BA.debugLine="Where.Put(\"fldCodetafzili\",Row.Get(\"fldCodeMo";
Debug.ShouldStop(8388608);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodetafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeMovaghat"))))));
 BA.debugLineNum = 857;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor set FldC_T";
Debug.ShouldStop(16777216);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblFaktor set FldC_Tafzili="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodetafzili")))),RemoteObject.createImmutable(" where FldC_Tafzili="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeMovaghat")))))));
 }else {
 BA.debugLineNum = 859;BA.debugLine="Where.Put(\"fldCodetafzili\",Row.Get(\"fldCodeta";
Debug.ShouldStop(67108864);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodetafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodetafzili"))))));
 };
 BA.debugLineNum = 864;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblAshkhas\",F";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblAshkhas")),(Object)(_fields),(Object)(_where));
 }}
;
 }
};
 BA.debugLineNum = 868;BA.debugLine="Log(\"لیست اشخاص بروزرسانی گردید:   \" & RowsList.";
Debug.ShouldStop(8);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115540024",RemoteObject.concat(RemoteObject.createImmutable("لیست اشخاص بروزرسانی گردید:   "),_rowslist.runMethod(true,"getSize")),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e50) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e50.toString()); BA.debugLineNum = 870;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115540026",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 871;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(64);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetGoroohKala")));
 };
 BA.debugLineNum = 873;BA.debugLine="GetCurrentDate";
Debug.ShouldStop(256);
_getcurrentdate();
 BA.debugLineNum = 874;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgeteshantion(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetEshantion (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,672);
if (RapidSub.canDelegate("loadgeteshantion")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgeteshantion", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 672;BA.debugLine="Sub LoadGetEshantion(Str As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 673;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(1);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 674;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(2);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 675;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionVisitor";
Debug.ShouldStop(4);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From tblEshantionVisitori")));
 BA.debugLineNum = 676;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(8);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 677;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(16);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 678;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblEshantionVisito";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("tblEshantionVisitori")),(Object)(_rowslist));
 BA.debugLineNum = 685;BA.debugLine="Log(\"اشانتیون بروزرسانی گردید\")";
Debug.ShouldStop(4096);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115146765",RemoteObject.createImmutable("اشانتیون بروزرسانی گردید"),0);
 BA.debugLineNum = 688;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgeteshantionfast(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetEshantionFast (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,627);
if (RapidSub.canDelegate("loadgeteshantionfast")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgeteshantionfast", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _crow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _where = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 627;BA.debugLine="Sub LoadGetEshantionFast(Str As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 628;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 629;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(1048576);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 630;BA.debugLine="Dim crow As  Cursor";
Debug.ShouldStop(2097152);
_crow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("crow", _crow);
 BA.debugLineNum = 631;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(4194304);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 632;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(8388608);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 633;BA.debugLine="Row.Initialize";
Debug.ShouldStop(16777216);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 634;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(33554432);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 635;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(67108864);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 637;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(268435456);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit9) || (step9 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit9) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step9))  ) {
 BA.debugLineNum = 638;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(536870912);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 639;BA.debugLine="Log(\"fldCodeKala:\"& Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115081228",RemoteObject.concat(RemoteObject.createImmutable("fldCodeKala:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))),0);
 BA.debugLineNum = 640;BA.debugLine="crow=MCode.Result(\"select * from tblEshantionVis";
Debug.ShouldStop(-2147483648);
_crow = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from tblEshantionVisitori where fldCodeKala="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))))));Debug.locals.put("crow", _crow);
 BA.debugLineNum = 641;BA.debugLine="CountRow=crow.RowCount";
Debug.ShouldStop(1);
_countrow = _crow.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 642;BA.debugLine="If CountRow =0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 643;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblEshantionVisi";
Debug.ShouldStop(4);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("tblEshantionVisitori")),(Object)(_rowslist));
 }else 
{ BA.debugLineNum = 645;BA.debugLine="Else if CountRow>0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 648;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(128);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 649;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(256);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 651;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(1024);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 652;BA.debugLine="Where.Initialize";
Debug.ShouldStop(2048);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 653;BA.debugLine="Fields.Put(\"fldCodeKala\",Row.Get(\"fldCodeKala\")";
Debug.ShouldStop(4096);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))));
 BA.debugLineNum = 654;BA.debugLine="Fields.Put(\"fldTedadEshantion\",Row.Get(\"fldTeda";
Debug.ShouldStop(8192);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldTedadEshantion"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadEshantion"))))));
 BA.debugLineNum = 655;BA.debugLine="Fields.Put(\"fldCountForoosh\",Row.Get(\"fldCountF";
Debug.ShouldStop(16384);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCountForoosh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCountForoosh"))))));
 BA.debugLineNum = 656;BA.debugLine="Fields.Put(\"fldVaziat\",Row.Get(\"fldVaziat\"))";
Debug.ShouldStop(32768);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldVaziat"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldVaziat"))))));
 BA.debugLineNum = 658;BA.debugLine="Where.Put(\"fldCodeKala\",Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(131072);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))));
 BA.debugLineNum = 660;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"tblEshantionV";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("tblEshantionVisitori")),(Object)(_fields),(Object)(_where));
 }}
;
 }
};
 BA.debugLineNum = 664;BA.debugLine="Log(\"لیست اشانتیون بروزرسانی گردید:   \" & RowsLi";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115081253",RemoteObject.concat(RemoteObject.createImmutable("لیست اشانتیون بروزرسانی گردید:   "),_rowslist.runMethod(true,"getSize")),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e31) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e31.toString()); BA.debugLineNum = 666;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115081255",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 667;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(67108864);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetEshantionFast")));
 };
 BA.debugLineNum = 669;BA.debugLine="GetCurrentDate";
Debug.ShouldStop(268435456);
_getcurrentdate();
 BA.debugLineNum = 670;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetfee(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetFee (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1021);
if (RapidSub.canDelegate("loadgetfee")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetfee", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1021;BA.debugLine="Sub LoadGetFee(Str As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1022;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(536870912);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1023;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(1073741824);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1024;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFee\")";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblFee")));
 BA.debugLineNum = 1025;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1026;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(2);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1028;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(8);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit6) || (step6 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit6) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step6))  ) {
 BA.debugLineNum = 1029;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(16);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1030;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblFee (FldCodeKal";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblFee (FldCodeKala,FldCodeTasvie,FldFee) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeTasvie")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFee")))),RemoteObject.createImmutable("')"))));
 }
};
 BA.debugLineNum = 1033;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetfeefast(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetFeeFast (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1035);
if (RapidSub.canDelegate("loadgetfeefast")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetfeefast", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _crow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1035;BA.debugLine="Sub LoadGetFeeFast(Str As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1036;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 1037;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(4096);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1038;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(8192);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1039;BA.debugLine="Dim crow As  Cursor";
Debug.ShouldStop(16384);
_crow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("crow", _crow);
 BA.debugLineNum = 1040;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(32768);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 1042;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(131072);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1043;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(262144);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1045;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(1048576);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit8) || (step8 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit8) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step8))  ) {
 BA.debugLineNum = 1046;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(2097152);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1047;BA.debugLine="Log(\"fldCodeKala:\"& Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(4194304);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116129804",RemoteObject.concat(RemoteObject.createImmutable("fldCodeKala:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))),0);
 BA.debugLineNum = 1049;BA.debugLine="crow=MCode.Result(\"select * from TblFee where Fl";
Debug.ShouldStop(16777216);
_crow = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblFee where FldCodeKala='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))),RemoteObject.createImmutable("' and FldCodeTasvie='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeTasvie")))),RemoteObject.createImmutable("'"))));Debug.locals.put("crow", _crow);
 BA.debugLineNum = 1050;BA.debugLine="CountRow=crow.RowCount";
Debug.ShouldStop(33554432);
_countrow = _crow.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 1051;BA.debugLine="If CountRow =0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1052;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblFee (FldCodeKa";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblFee (FldCodeKala,FldCodeTasvie,FldFee) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeTasvie")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFee")))),RemoteObject.createImmutable("')"))));
 }else 
{ BA.debugLineNum = 1055;BA.debugLine="Else if CountRow>0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1066;BA.debugLine="MCode.SaveUpdate(\"Update TblFee Set FldFee='\"&R";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblFee Set FldFee='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFee")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" where FldCodeKala='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))),RemoteObject.createImmutable("' and FldCodeTasvie='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeTasvie")))),RemoteObject.createImmutable("'"))));
 }}
;
 }
};
 BA.debugLineNum = 1071;BA.debugLine="Log(\"فی بروزرسانی گردید\")";
Debug.ShouldStop(16384);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116129828",RemoteObject.createImmutable("فی بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e21.toString()); BA.debugLineNum = 1073;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116129830",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 1074;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(131072);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetFeeFast")));
 };
 BA.debugLineNum = 1077;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetgallerykala(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetGalleryKala (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,690);
if (RapidSub.canDelegate("loadgetgallerykala")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetgallerykala", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 690;BA.debugLine="Sub LoadGetGalleryKala(Str As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 691;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(262144);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 692;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(524288);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 693;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGalleryPic\")";
Debug.ShouldStop(1048576);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGalleryPic")));
 BA.debugLineNum = 694;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 695;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(4194304);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 697;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(16777216);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit6) || (step6 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit6) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step6))  ) {
 BA.debugLineNum = 698;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(33554432);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 699;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGalleryPic (fld";
Debug.ShouldStop(67108864);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGalleryPic (fldCodeKala,fldImageNumber,fldImage,fldShow) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldImageNumber")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldImage")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShow")))),RemoteObject.createImmutable("')"))));
 }
};
 BA.debugLineNum = 703;BA.debugLine="Log(\"گالری تصاویر بروزرسانی گردید\")";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115212301",RemoteObject.createImmutable("گالری تصاویر بروزرسانی گردید"),0);
 BA.debugLineNum = 704;BA.debugLine="ToastMessageShow(\"گالری تصاویر بروزرسانی گردید\",T";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گالری تصاویر بروزرسانی گردید")),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 705;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetgallerykalafast(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetGalleryKalaFast (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,565);
if (RapidSub.canDelegate("loadgetgallerykalafast")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetgallerykalafast", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _crow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _where = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 565;BA.debugLine="Sub LoadGetGalleryKalaFast(Str As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 566;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 567;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(4194304);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 568;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(8388608);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 569;BA.debugLine="Dim crow As  Cursor";
Debug.ShouldStop(16777216);
_crow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("crow", _crow);
 BA.debugLineNum = 570;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(33554432);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 571;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGalleryPic\")";
Debug.ShouldStop(67108864);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGalleryPic")));
 BA.debugLineNum = 572;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 573;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(268435456);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 575;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(1073741824);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit9) || (step9 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit9) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step9))  ) {
 BA.debugLineNum = 576;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(-2147483648);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 577;BA.debugLine="Log(\"fldCodeKala:\"& Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114950156",RemoteObject.concat(RemoteObject.createImmutable("fldCodeKala:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))),0);
 BA.debugLineNum = 579;BA.debugLine="crow=MCode.Result(\"select * from TblGalleryPic w";
Debug.ShouldStop(4);
_crow = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblGalleryPic where fldCodeKala='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))),RemoteObject.createImmutable("' and fldImageNumber='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldImageNumber")))),RemoteObject.createImmutable("'"))));Debug.locals.put("crow", _crow);
 BA.debugLineNum = 580;BA.debugLine="CountRow=crow.RowCount";
Debug.ShouldStop(8);
_countrow = _crow.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 581;BA.debugLine="If CountRow =0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 582;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblGalleryPic\",R";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblGalleryPic")),(Object)(_rowslist));
 }else 
{ BA.debugLineNum = 586;BA.debugLine="Else if CountRow>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 597;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(1048576);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 598;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(2097152);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 600;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(8388608);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 601;BA.debugLine="Where.Initialize";
Debug.ShouldStop(16777216);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 602;BA.debugLine="Fields.Put(\"fldImage\",Row.Get(\"fldImage\"))";
Debug.ShouldStop(33554432);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldImage"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldImage"))))));
 BA.debugLineNum = 603;BA.debugLine="Fields.Put(\"fldShow\",Row.Get(\"fldShow\"))";
Debug.ShouldStop(67108864);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShow"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShow"))))));
 BA.debugLineNum = 604;BA.debugLine="Where.Put(\"fldCodeKala\",Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(134217728);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))));
 BA.debugLineNum = 605;BA.debugLine="Where.Put(\"fldImageNumber\",Row.Get(\"fldImageNum";
Debug.ShouldStop(268435456);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldImageNumber"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldImageNumber"))))));
 BA.debugLineNum = 607;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblGalleryPic";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblGalleryPic")),(Object)(_fields),(Object)(_where));
 }}
;
 }
};
 BA.debugLineNum = 614;BA.debugLine="Log(\"گالری تصاویر بروزرسانی گردید\")";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114950193",RemoteObject.createImmutable("گالری تصاویر بروزرسانی گردید"),0);
 BA.debugLineNum = 615;BA.debugLine="ToastMessageShow(\"گالری تصاویر بروزرسانی گردید\",";
Debug.ShouldStop(64);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گالری تصاویر بروزرسانی گردید")),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e31) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e31.toString()); BA.debugLineNum = 617;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114950196",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 618;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetGalleryKalaFast")));
 };
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
public static RemoteObject  _loadgetgethavale(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetGetHavale (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1163);
if (RapidSub.canDelegate("loadgetgethavale")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetgethavale", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1163;BA.debugLine="Sub LoadGetGetHavale(Str As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1164;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 1165;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(4096);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1166;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(8192);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1167;BA.debugLine="MCode.SaveUpdate(\"Delete From TblHavale\")";
Debug.ShouldStop(16384);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblHavale")));
 BA.debugLineNum = 1168;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(32768);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1169;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(65536);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1170;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblHavale\",RowsLi";
Debug.ShouldStop(131072);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblHavale")),(Object)(_rowslist));
 BA.debugLineNum = 1171;BA.debugLine="Log(\"لیست حواله بروزرسانی گردید\")";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116523016",RemoteObject.createImmutable("لیست حواله بروزرسانی گردید"),0);
 BA.debugLineNum = 1172;BA.debugLine="CallSubDelayed(Act_HavaleTozie,\"LoadFilter\")";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_havaletozie.getObject())),(Object)(RemoteObject.createImmutable("LoadFilter")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e11.toString()); BA.debugLineNum = 1174;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116523019",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 1175;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(4194304);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetVisitor")));
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
public static RemoteObject  _loadgetgethavalefast(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetGetHavaleFast (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1182);
if (RapidSub.canDelegate("loadgetgethavalefast")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetgethavalefast", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _crow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1182;BA.debugLine="Sub LoadGetGetHavaleFast(Str As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1183;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 1184;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(-2147483648);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1185;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(1);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1186;BA.debugLine="Dim crow As  Cursor";
Debug.ShouldStop(2);
_crow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("crow", _crow);
 BA.debugLineNum = 1187;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(4);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 1189;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(16);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1190;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(32);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1192;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(128);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit8) || (step8 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit8) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step8))  ) {
 BA.debugLineNum = 1193;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(256);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1194;BA.debugLine="Log(\"fldShomareHavale:\"& Row.Get(\"fldShomareHav";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116588556",RemoteObject.concat(RemoteObject.createImmutable("fldShomareHavale:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareHavale"))))),0);
 BA.debugLineNum = 1196;BA.debugLine="crow=MCode.Result(\"select * from TblHavale wher";
Debug.ShouldStop(2048);
_crow = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblHavale where fldShomareHavale='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareHavale")))),RemoteObject.createImmutable("'"))));Debug.locals.put("crow", _crow);
 BA.debugLineNum = 1197;BA.debugLine="CountRow=crow.RowCount";
Debug.ShouldStop(4096);
_countrow = _crow.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 1198;BA.debugLine="If CountRow =0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1199;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblHavale\",Rows";
Debug.ShouldStop(16384);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblHavale")),(Object)(_rowslist));
 }else 
{ BA.debugLineNum = 1201;BA.debugLine="Else if CountRow>0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1212;BA.debugLine="MCode.SaveUpdate(\"Update TblHavale Set fldShom";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblHavale Set fldShomareHavale='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareHavale")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",fldDate='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",fldVaziat='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldVaziat")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",fldMandeFactor='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMandeFactor")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",fldCountFactor='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCountFactor")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" where fldShomareHavale='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareHavale")))),RemoteObject.createImmutable("'"))));
 }}
;
 }
};
 BA.debugLineNum = 1222;BA.debugLine="Log(\"حواله بروزرسانی گردید\")";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116588584",RemoteObject.createImmutable("حواله بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e21.toString()); BA.debugLineNum = 1233;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116588595",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 1234;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(131072);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetTasvieFast")));
 };
 BA.debugLineNum = 1236;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetgoroohashkhas(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetGoroohAshkhas (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,953);
if (RapidSub.canDelegate("loadgetgoroohashkhas")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetgoroohashkhas", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 953;BA.debugLine="Sub LoadGetGoroohAshkhas(Str As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 954;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 955;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(67108864);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 956;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(134217728);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 957;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohAshkhas\")";
Debug.ShouldStop(268435456);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGoroohAshkhas")));
 BA.debugLineNum = 958;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 959;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(1073741824);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 961;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(1);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step7 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit7) || (step7 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit7) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step7))  ) {
 BA.debugLineNum = 962;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(2);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 963;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohAshkhas (";
Debug.ShouldStop(4);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName")))),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 965;BA.debugLine="Log(Row.Get(\"fldGroupName\"))";
Debug.ShouldStop(16);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115802124",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName"))))),0);
 }
};
 BA.debugLineNum = 967;BA.debugLine="Log(\"گروه اشخاص بروزرسانی گردید\")";
Debug.ShouldStop(64);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115802126",RemoteObject.createImmutable("گروه اشخاص بروزرسانی گردید"),0);
 BA.debugLineNum = 968;BA.debugLine="ToastMessageShow(\"گروه اشخاص بروزرسانی گردید\",Tr";
Debug.ShouldStop(128);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گروه اشخاص بروزرسانی گردید")),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e15.toString()); BA.debugLineNum = 970;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115802129",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 971;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(1024);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetGoroohAshkhas")));
 };
 BA.debugLineNum = 974;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetgoroohashkhasfast(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetGoroohAshkhasFast (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,912);
if (RapidSub.canDelegate("loadgetgoroohashkhasfast")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetgoroohashkhasfast", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _crow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
Debug.locals.put("Str", _str);
 BA.debugLineNum = 912;BA.debugLine="Sub LoadGetGoroohAshkhasFast(Str As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 913;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 914;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(131072);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 915;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(262144);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 916;BA.debugLine="Dim crow As  Cursor";
Debug.ShouldStop(524288);
_crow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("crow", _crow);
 BA.debugLineNum = 917;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(1048576);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 919;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(4194304);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 920;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(8388608);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 922;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(33554432);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit8) || (step8 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit8) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step8))  ) {
 BA.debugLineNum = 923;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(67108864);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 924;BA.debugLine="crow=MCode.Result(\"select * from TblGoroohAshkha";
Debug.ShouldStop(134217728);
_crow = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblGoroohAshkhas where FldC_Gorooh="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId")))))));Debug.locals.put("crow", _crow);
 BA.debugLineNum = 925;BA.debugLine="CountRow=crow.RowCount";
Debug.ShouldStop(268435456);
_countrow = _crow.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 926;BA.debugLine="If CountRow =0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 927;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohAshkhas";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName")))),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 929;BA.debugLine="Log(Row.Get(\"fldGroupName\"))";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115736593",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName"))))),0);
 }else 
{ BA.debugLineNum = 930;BA.debugLine="Else If CountRow>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 939;BA.debugLine="MCode.SaveUpdate(\"Update TblGoroohAshkhas Set F";
Debug.ShouldStop(1024);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblGoroohAshkhas Set FldN_Gorooh='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" where FldC_Gorooh="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId")))))));
 }}
;
 }
};
 BA.debugLineNum = 945;BA.debugLine="Log(\"لیست 'گروه اشخاص بروزرسانی گردید:   \" & Rows";
Debug.ShouldStop(65536);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115736609",RemoteObject.concat(RemoteObject.createImmutable("لیست 'گروه اشخاص بروزرسانی گردید:   "),_rowslist.runMethod(true,"getSize")),0);
 BA.debugLineNum = 946;BA.debugLine="Log(\"گروه اشخاص بروزرسانی گردید\")";
Debug.ShouldStop(131072);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115736610",RemoteObject.createImmutable("گروه اشخاص بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e22.toString()); BA.debugLineNum = 948;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115736612",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 949;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(1048576);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetGoroohAshkhasFast")));
 };
 BA.debugLineNum = 952;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetgoroohkala(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetGoroohKala (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,771);
if (RapidSub.canDelegate("loadgetgoroohkala")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetgoroohkala", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 771;BA.debugLine="Sub LoadGetGoroohKala(Str As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 772;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 773;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(16);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 774;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(32);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 775;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohKala\")";
Debug.ShouldStop(64);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGoroohKala")));
 BA.debugLineNum = 776;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(128);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 777;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(256);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 779;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(1024);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step7 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit7) || (step7 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit7) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step7))  ) {
 BA.debugLineNum = 780;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(2048);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 781;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohKala (Fld";
Debug.ShouldStop(4096);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName")))),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 783;BA.debugLine="Log(\"fldGroupName:\"&Row.Get(\"fldGroupName\"))";
Debug.ShouldStop(16384);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115408908",RemoteObject.concat(RemoteObject.createImmutable("fldGroupName:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName"))))),0);
 }
};
 BA.debugLineNum = 786;BA.debugLine="Log(\"گروه کالا بروزرسانی گردید\")";
Debug.ShouldStop(131072);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115408911",RemoteObject.createImmutable("گروه کالا بروزرسانی گردید"),0);
 BA.debugLineNum = 787;BA.debugLine="ToastMessageShow(\"گروه کالا بروزرسانی گردید\",Tru";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گروه کالا بروزرسانی گردید")),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e15.toString()); BA.debugLineNum = 789;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115408914",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 790;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetGoroohKala")));
 };
 BA.debugLineNum = 792;BA.debugLine="GetCurrentDate";
Debug.ShouldStop(8388608);
_getcurrentdate();
 BA.debugLineNum = 793;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetgoroohkalafast(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetGoroohKalaFast (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,723);
if (RapidSub.canDelegate("loadgetgoroohkalafast")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetgoroohkalafast", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _crow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
Debug.locals.put("Str", _str);
 BA.debugLineNum = 723;BA.debugLine="Sub LoadGetGoroohKalaFast(Str As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 724;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 725;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(1048576);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 726;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(2097152);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 727;BA.debugLine="Dim crow As  Cursor";
Debug.ShouldStop(4194304);
_crow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("crow", _crow);
 BA.debugLineNum = 728;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(8388608);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 731;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(67108864);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 732;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(134217728);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 734;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(536870912);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit8) || (step8 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit8) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step8))  ) {
 BA.debugLineNum = 736;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(-2147483648);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 737;BA.debugLine="Log(\"FldC_Gorooh:\"& Row.Get(\"fldGroupId\"))";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115343374",RemoteObject.concat(RemoteObject.createImmutable("FldC_Gorooh:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId"))))),0);
 BA.debugLineNum = 739;BA.debugLine="crow=MCode.Result(\"select * from TblGoroohKala w";
Debug.ShouldStop(4);
_crow = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblGoroohKala where FldC_Gorooh="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId")))))));Debug.locals.put("crow", _crow);
 BA.debugLineNum = 740;BA.debugLine="CountRow=crow.RowCount";
Debug.ShouldStop(8);
_countrow = _crow.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 741;BA.debugLine="If CountRow =0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 742;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohKala (Fl";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName")))),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 744;BA.debugLine="Log(\"fldGroupName:\"&Row.Get(\"fldGroupName\"))";
Debug.ShouldStop(128);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115343381",RemoteObject.concat(RemoteObject.createImmutable("fldGroupName:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName"))))),0);
 }else 
{ BA.debugLineNum = 745;BA.debugLine="Else if CountRow>0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 756;BA.debugLine="MCode.SaveUpdate(\"Update TblGoroohKala Set FldN";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblGoroohKala Set FldN_Gorooh='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" where FldC_Gorooh="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId")))))));
 }}
;
 }
};
 BA.debugLineNum = 764;BA.debugLine="Log(\"لیست گروه کالا بروزرسانی گردید:   \" & RowsL";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115343401",RemoteObject.concat(RemoteObject.createImmutable("لیست گروه کالا بروزرسانی گردید:   "),_rowslist.runMethod(true,"getSize")),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e22.toString()); BA.debugLineNum = 766;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115343403",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 767;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetGoroohKalaFast")));
 };
 BA.debugLineNum = 769;BA.debugLine="GetCurrentDate";
Debug.ShouldStop(1);
_getcurrentdate();
 BA.debugLineNum = 770;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetkala(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetKala (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,483);
if (RapidSub.canDelegate("loadgetkala")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetkala", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _path = RemoteObject.createImmutable("");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 483;BA.debugLine="Sub LoadGetKala(Str As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 484;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 485;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(16);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 486;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(32);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 487;BA.debugLine="Dim Cu As  Cursor";
Debug.ShouldStop(64);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 488;BA.debugLine="Row.Initialize";
Debug.ShouldStop(128);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 490;BA.debugLine="MCode.SaveUpdate(\"Delete From TblKala\")";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblKala")));
 BA.debugLineNum = 491;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
Debug.ShouldStop(1024);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 492;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(2048);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 493;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblKala\",RowsList";
Debug.ShouldStop(4096);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblKala")),(Object)(_rowslist));
 BA.debugLineNum = 494;BA.debugLine="If MCode.PicOnline=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",firebasemessaging.mostCurrent._mcode._piconline /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 495;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(16384);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step11 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit11) || (step11 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit11) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step11))  ) {
 BA.debugLineNum = 497;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(65536);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 498;BA.debugLine="Dim path As String=myCode.GetPathPicByCodeKala";
Debug.ShouldStop(131072);
_path = firebasemessaging.mostCurrent._mycode.runMethod(true,"_getpathpicbycodekala" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))))));Debug.locals.put("path", _path);Debug.locals.put("path", _path);
 BA.debugLineNum = 499;BA.debugLine="Log(path)";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114688016",_path,0);
 BA.debugLineNum = 501;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set fldPathPi";
Debug.ShouldStop(1048576);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblKala Set fldPathPic='"),_path,RemoteObject.createImmutable("' where FldCodeKala="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))))));
 }
};
 };
 BA.debugLineNum = 510;BA.debugLine="Cu=MCode.Result(\"Select * From TblKala\")";
Debug.ShouldStop(536870912);
_cu = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Select * From TblKala")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 511;BA.debugLine="Log(\"لیست کالا بروزرسانی گردید\")";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114688028",RemoteObject.createImmutable("لیست کالا بروزرسانی گردید"),0);
 BA.debugLineNum = 512;BA.debugLine="ToastMessageShow(\"لیست کالا بروزرسانی گردید:   \"";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("لیست کالا بروزرسانی گردید:   "),_cu.runMethod(true,"getRowCount")))),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e22.toString()); BA.debugLineNum = 514;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114688031",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 515;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(4);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetKala")));
 };
 BA.debugLineNum = 517;BA.debugLine="GetCurrentDate";
Debug.ShouldStop(16);
_getcurrentdate();
 BA.debugLineNum = 518;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetkalafast(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetKalaFast (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,392);
if (RapidSub.canDelegate("loadgetkalafast")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetkalafast", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _crow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _where = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _path = RemoteObject.createImmutable("");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 392;BA.debugLine="Sub LoadGetKalaFast(Str As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 393;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 394;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(512);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 395;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(1024);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 396;BA.debugLine="Dim crow As  Cursor";
Debug.ShouldStop(2048);
_crow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("crow", _crow);
 BA.debugLineNum = 397;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(4096);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 398;BA.debugLine="Row.Initialize";
Debug.ShouldStop(8192);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 399;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
Debug.ShouldStop(16384);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 400;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(32768);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 401;BA.debugLine="Log(Str)";
Debug.ShouldStop(65536);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114622473",_str,0);
 BA.debugLineNum = 402;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(131072);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step10 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit10) || (step10 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit10) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step10))  ) {
 BA.debugLineNum = 404;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(524288);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 405;BA.debugLine="Log(\"fldCodeKala:\"& Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(1048576);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114622477",RemoteObject.concat(RemoteObject.createImmutable("fldCodeKala:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))),0);
 BA.debugLineNum = 407;BA.debugLine="crow=MCode.Result(\"select * from TblKala where f";
Debug.ShouldStop(4194304);
_crow = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeKala="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))))));Debug.locals.put("crow", _crow);
 BA.debugLineNum = 408;BA.debugLine="CountRow=crow.RowCount";
Debug.ShouldStop(8388608);
_countrow = _crow.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 409;BA.debugLine="If CountRow =0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 410;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblKala\",RowsLis";
Debug.ShouldStop(33554432);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblKala")),(Object)(_rowslist));
 }else 
{ BA.debugLineNum = 415;BA.debugLine="Else if CountRow>0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 426;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(512);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 427;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(1024);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 429;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(4096);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 430;BA.debugLine="Where.Initialize";
Debug.ShouldStop(8192);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 431;BA.debugLine="Fields.Put(\"fldNameKala\",Row.Get(\"fldNameKala\")";
Debug.ShouldStop(16384);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldNameKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNameKala"))))));
 BA.debugLineNum = 432;BA.debugLine="Fields.Put(\"fldNameVahed\",Row.Get(\"fldNameVahed";
Debug.ShouldStop(32768);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldNameVahed"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNameVahed"))))));
 BA.debugLineNum = 433;BA.debugLine="Fields.Put(\"fldNameVahed2\",Row.Get(\"fldNameVahe";
Debug.ShouldStop(65536);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldNameVahed2"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNameVahed2"))))));
 BA.debugLineNum = 434;BA.debugLine="Fields.Put(\"SumMande\",Row.Get(\"SumMande\"))";
Debug.ShouldStop(131072);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("SumMande"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SumMande"))))));
 BA.debugLineNum = 435;BA.debugLine="Fields.Put(\"fldTedadDarKarton\",Row.Get(\"fldTeda";
Debug.ShouldStop(262144);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldTedadDarKarton"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadDarKarton"))))));
 BA.debugLineNum = 436;BA.debugLine="Fields.Put(\"fldFeeForoosh\",Row.Get(\"fldFeeForoo";
Debug.ShouldStop(524288);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldFeeForoosh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeForoosh"))))));
 BA.debugLineNum = 437;BA.debugLine="Fields.Put(\"fldCodeGroup\",Row.Get(\"fldCodeGroup";
Debug.ShouldStop(1048576);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeGroup"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeGroup"))))));
 BA.debugLineNum = 438;BA.debugLine="Fields.Put(\"fldGhymatMasrafkonande\",Row.Get(\"fl";
Debug.ShouldStop(2097152);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldGhymatMasrafkonande"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGhymatMasrafkonande"))))));
 BA.debugLineNum = 439;BA.debugLine="Fields.Put(\"fldPathPic\",Row.Get(\"fldPathPic\"))";
Debug.ShouldStop(4194304);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldPathPic"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldPathPic"))))));
 BA.debugLineNum = 440;BA.debugLine="Fields.Put(\"fldFeeTasvie\",Row.Get(\"fldFeeTasvie";
Debug.ShouldStop(8388608);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldFeeTasvie"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeTasvie"))))));
 BA.debugLineNum = 441;BA.debugLine="Fields.Put(\"fldSharh\",Row.Get(\"fldSharh\"))";
Debug.ShouldStop(16777216);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharh"))))));
 BA.debugLineNum = 442;BA.debugLine="Where.Put(\"fldCodeKala\",Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(33554432);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))));
 BA.debugLineNum = 446;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblKala\",Fiel";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblKala")),(Object)(_fields),(Object)(_where));
 BA.debugLineNum = 459;BA.debugLine="If MCode.PicOnline=0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",firebasemessaging.mostCurrent._mcode._piconline /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 460;BA.debugLine="Dim path As String=myCode.GetPathPicByCodeKa";
Debug.ShouldStop(2048);
_path = firebasemessaging.mostCurrent._mycode.runMethod(true,"_getpathpicbycodekala" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))))));Debug.locals.put("path", _path);Debug.locals.put("path", _path);
 BA.debugLineNum = 461;BA.debugLine="Log(path)";
Debug.ShouldStop(4096);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114622533",_path,0);
 BA.debugLineNum = 462;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set fldPath";
Debug.ShouldStop(8192);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblKala Set fldPathPic='"),_path,RemoteObject.createImmutable("' where FldCodeKala="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))))));
 };
 }}
;
 }
};
 BA.debugLineNum = 474;BA.debugLine="Log(\"لیست کالا بروزرسانی گردید:   \" & RowsList.S";
Debug.ShouldStop(33554432);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114622546",RemoteObject.concat(RemoteObject.createImmutable("لیست کالا بروزرسانی گردید:   "),_rowslist.runMethod(true,"getSize")),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e44) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e44.toString()); BA.debugLineNum = 477;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114622549",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 478;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetKalaFast")));
 };
 BA.debugLineNum = 481;BA.debugLine="GetCurrentDate";
Debug.ShouldStop(1);
_getcurrentdate();
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetlistdelete(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetListDelete (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,284);
if (RapidSub.canDelegate("loadgetlistdelete")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetlistdelete", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
RemoteObject _query = RemoteObject.createImmutable("");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 284;BA.debugLine="Sub LoadGetListDelete(Str As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 286;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(536870912);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 287;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(1073741824);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 288;BA.debugLine="Dim Cu As  Cursor";
Debug.ShouldStop(-2147483648);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 289;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(1);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 290;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(2);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 291;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(4);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 293;BA.debugLine="Select TypeDelete";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(firebasemessaging._typedelete,BA.ObjectToString("kala"),BA.ObjectToString("ashkhas"),BA.ObjectToString("GroupKala"),BA.ObjectToString("GalleryPic"),BA.ObjectToString("GroupAshkhas"),BA.ObjectToString("deleteall"))) {
case 0: {
 BA.debugLineNum = 295;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(64);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step10 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit10) || (step10 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit10) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step10))  ) {
 BA.debugLineNum = 296;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(128);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 297;BA.debugLine="Log(\"deleted fldCodeKala:\"& Row.Get(\"fldCode\")";
Debug.ShouldStop(256);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425869",RemoteObject.concat(RemoteObject.createImmutable("deleted fldCodeKala:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode"))))),0);
 BA.debugLineNum = 298;BA.debugLine="Cu=MCode.Result(\"select * from TblKala where f";
Debug.ShouldStop(512);
_cu = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeKala="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))))));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 299;BA.debugLine="CountRow=Cu.RowCount";
Debug.ShouldStop(1024);
_countrow = _cu.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 300;BA.debugLine="Log(CountRow)";
Debug.ShouldStop(2048);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425872",BA.NumberToString(_countrow),0);
 BA.debugLineNum = 301;BA.debugLine="Dim Query As String=\"Delete From TblKala where";
Debug.ShouldStop(4096);
_query = RemoteObject.concat(RemoteObject.createImmutable("Delete From TblKala where fldCodeKala= "),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))));Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 302;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(8192);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(_query));
 }
};
 break; }
case 1: {
 BA.debugLineNum = 305;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(65536);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step20 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit20) || (step20 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit20) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step20))  ) {
 BA.debugLineNum = 306;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(131072);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 307;BA.debugLine="Log(\"deleted fldCodetafzili:\"& Row.Get(\"fldCod";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425879",RemoteObject.concat(RemoteObject.createImmutable("deleted fldCodetafzili:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode"))))),0);
 BA.debugLineNum = 308;BA.debugLine="Cu=MCode.Result(\"select * from TblAshkhas wher";
Debug.ShouldStop(524288);
_cu = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblAshkhas where fldCodetafzili="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))))));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 309;BA.debugLine="CountRow=Cu.RowCount";
Debug.ShouldStop(1048576);
_countrow = _cu.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 310;BA.debugLine="Log(CountRow)";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425882",BA.NumberToString(_countrow),0);
 BA.debugLineNum = 311;BA.debugLine="Dim Query As String=\"Delete From TblAshkhas wh";
Debug.ShouldStop(4194304);
_query = RemoteObject.concat(RemoteObject.createImmutable("Delete From TblAshkhas where fldCodetafzili= "),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))));Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 312;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(_query));
 }
};
 break; }
case 2: {
 BA.debugLineNum = 315;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(67108864);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step30 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit30) || (step30 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit30) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step30))  ) {
 BA.debugLineNum = 316;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(134217728);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 317;BA.debugLine="Log(\"deleted fldGroupId:\"& Row.Get(\"fldCode\"))";
Debug.ShouldStop(268435456);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425889",RemoteObject.concat(RemoteObject.createImmutable("deleted fldGroupId:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode"))))),0);
 BA.debugLineNum = 318;BA.debugLine="Cu=MCode.Result(\"select * from TblGoroohKala w";
Debug.ShouldStop(536870912);
_cu = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblGoroohKala where fldGroupId="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))))));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 319;BA.debugLine="CountRow=Cu.RowCount";
Debug.ShouldStop(1073741824);
_countrow = _cu.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 320;BA.debugLine="Log(CountRow)";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425892",BA.NumberToString(_countrow),0);
 BA.debugLineNum = 321;BA.debugLine="Dim Query As String=\"Delete From TblGoroohKala";
Debug.ShouldStop(1);
_query = RemoteObject.concat(RemoteObject.createImmutable("Delete From TblGoroohKala where fldGroupId= "),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))));Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 322;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(2);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(_query));
 }
};
 break; }
case 3: {
 BA.debugLineNum = 325;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(16);
{
final int step40 = 1;
final int limit40 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step40 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit40) || (step40 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit40) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step40))  ) {
 BA.debugLineNum = 326;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(32);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 327;BA.debugLine="Log(\"deleted tblGalleryPic:\"& Row.Get(\"fldCode";
Debug.ShouldStop(64);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425899",RemoteObject.concat(RemoteObject.createImmutable("deleted tblGalleryPic:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))),0);
 BA.debugLineNum = 328;BA.debugLine="Cu=MCode.Result(\"select * from tblGalleryPic w";
Debug.ShouldStop(128);
_cu = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from tblGalleryPic where fldCodeKala='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))),RemoteObject.createImmutable("' and fldImageNumber='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldImageNumber")))),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 329;BA.debugLine="CountRow=Cu.RowCount";
Debug.ShouldStop(256);
_countrow = _cu.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 330;BA.debugLine="Log(CountRow)";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425902",BA.NumberToString(_countrow),0);
 BA.debugLineNum = 331;BA.debugLine="Dim Query As String=\"Delete From tblGalleryPic";
Debug.ShouldStop(1024);
_query = RemoteObject.concat(RemoteObject.createImmutable("Delete From tblGalleryPic where fldCodeKala= "),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))),RemoteObject.createImmutable("' and fldImageNumber='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldImageNumber")))),RemoteObject.createImmutable("'"));Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 332;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(2048);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(_query));
 }
};
 break; }
case 4: {
 BA.debugLineNum = 335;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(16384);
{
final int step50 = 1;
final int limit50 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step50 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit50) || (step50 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit50) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step50))  ) {
 BA.debugLineNum = 336;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(32768);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 337;BA.debugLine="Log(\"deleted FldC_Gorooh:\"& Row.Get(\"fldCode\")";
Debug.ShouldStop(65536);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425909",RemoteObject.concat(RemoteObject.createImmutable("deleted FldC_Gorooh:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode"))))),0);
 BA.debugLineNum = 338;BA.debugLine="Cu=MCode.Result(\"select * from TblGoroohAshkha";
Debug.ShouldStop(131072);
_cu = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblGoroohAshkhas where FldC_Gorooh="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))))));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 339;BA.debugLine="CountRow=Cu.RowCount";
Debug.ShouldStop(262144);
_countrow = _cu.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 340;BA.debugLine="Log(CountRow)";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425912",BA.NumberToString(_countrow),0);
 BA.debugLineNum = 341;BA.debugLine="Dim Query As String=\"Delete From TblGoroohAshk";
Debug.ShouldStop(1048576);
_query = RemoteObject.concat(RemoteObject.createImmutable("Delete From TblGoroohAshkhas where FldC_Gorooh= "),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))));Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 342;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(_query));
 }
};
 break; }
case 5: {
 BA.debugLineNum = 345;BA.debugLine="MCode.SaveUpdate(\"Delete From TblKala\")";
Debug.ShouldStop(16777216);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblKala")));
 BA.debugLineNum = 346;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas\")";
Debug.ShouldStop(33554432);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblAshkhas")));
 BA.debugLineNum = 347;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohKala\")";
Debug.ShouldStop(67108864);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGoroohKala")));
 BA.debugLineNum = 348;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohAshkhas\"";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGoroohAshkhas")));
 BA.debugLineNum = 349;BA.debugLine="MCode.SaveUpdate(\"Delete From tblGalleryPic\")";
Debug.ShouldStop(268435456);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From tblGalleryPic")));
 BA.debugLineNum = 350;BA.debugLine="DateUpdate=0";
Debug.ShouldStop(536870912);
firebasemessaging._dateupdate = BA.NumberToString(0);
 BA.debugLineNum = 352;BA.debugLine="GetCurrentDate";
Debug.ShouldStop(-2147483648);
_getcurrentdate();
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e69) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e69.toString()); BA.debugLineNum = 355;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114425927",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 356;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(8);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetListDelete")));
 };
 BA.debugLineNum = 358;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetreportrizepishfactor3(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetReportRizePishFactor3 (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1266);
if (RapidSub.canDelegate("loadgetreportrizepishfactor3")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetreportrizepishfactor3", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1266;BA.debugLine="Sub LoadGetReportRizePishFactor3(Str As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1267;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1268;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(524288);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1269;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(1048576);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1270;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1271;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(4194304);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1273;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor where Fl";
Debug.ShouldStop(16777216);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblFaktor where FldSync='True'")));
 BA.debugLineNum = 1274;BA.debugLine="Dim lst As List";
Debug.ShouldStop(33554432);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1275;BA.debugLine="lst.Initialize";
Debug.ShouldStop(67108864);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 1276;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(134217728);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit9) || (step9 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit9) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step9))  ) {
 BA.debugLineNum = 1277;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(268435456);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1287;BA.debugLine="If Row.Get(\"fldTedadJoz\")>0 Or Row.Get(\"fldTeda";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz"))))),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1291;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1024);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 1292;BA.debugLine="m.Initialize";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 1293;BA.debugLine="m.Put(\"FldRadif\",Row.Get(\"fldRadif\"))";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldRadif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldRadif"))))));
 BA.debugLineNum = 1294;BA.debugLine="m.Put(\"FldC_Visitor\",Row.Get(\"fldCodeVasete\"))";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Visitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeVasete"))))));
 BA.debugLineNum = 1295;BA.debugLine="m.Put(\"FldC_Tafzili\",Row.Get(\"fldCodeTafsili\")";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Tafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeTafsili"))))));
 BA.debugLineNum = 1296;BA.debugLine="m.Put(\"FldN_Tafzili\",Row.Get(\"fldSharheTafzili";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldN_Tafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharheTafzili"))))));
 BA.debugLineNum = 1297;BA.debugLine="m.Put(\"FldShomareFaktor\",Row.Get(\"fldShomareFa";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareFaktor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactor"))))));
 BA.debugLineNum = 1298;BA.debugLine="m.Put(\"FldShomareBargasht\",Row.Get(\"fldShomare";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareBargasht"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareBargasht"))))));
 BA.debugLineNum = 1299;BA.debugLine="m.Put(\"FldCodeKala\",Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCodeKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))));
 BA.debugLineNum = 1300;BA.debugLine="m.Put(\"FldNameKala\",Row.Get(\"fldSharhKala\"))";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharhKala"))))));
 BA.debugLineNum = 1301;BA.debugLine="m.Put(\"FldFeeForoosh\",Row.Get(\"fldFeeJoz\"))";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldFeeForoosh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeJoz"))))));
 BA.debugLineNum = 1302;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Row.Get(\"fldMablagh";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldFeeBadAzTakhfif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMablaghTakhfif"))))));
 BA.debugLineNum = 1303;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Row.Get(\"fldMablaghT";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMablaghTakhfif"))))));
 BA.debugLineNum = 1304;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Row.Get(\"fldTedadJ";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadJoz"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz"))))));
 BA.debugLineNum = 1305;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Row.Get(\"fldTedadC";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))));
 BA.debugLineNum = 1306;BA.debugLine="m.Put(\"FldTedadDarkarton\",Row.Get(\"FldTedadDar";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarkarton"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTedadDarKarton"))))));
 BA.debugLineNum = 1307;BA.debugLine="m.Put(\"FldTotalFaktor\",Row.Get(\"FldTotalFaktor";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTotalFaktor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTotalFaktor"))))));
 BA.debugLineNum = 1308;BA.debugLine="m.Put(\"FldTozihat\",Row.Get(\"fldTozihatRecord\")";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozihat"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTozihatRecord"))))));
 BA.debugLineNum = 1309;BA.debugLine="m.Put(\"FldTozih\",Row.Get(\"FldTozihat\"))";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozih"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTozihat"))))));
 BA.debugLineNum = 1310;BA.debugLine="m.Put(\"FldVaziatPardakht\",Row.Get(\"fldNahveTas";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVaziatPardakht"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNahveTasvie"))))));
 BA.debugLineNum = 1311;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",Row.Get(\"FldMabla";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfifKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldMablaghTakhfifKol"))))));
 BA.debugLineNum = 1312;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",Row.Get(\"Fld";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifVizhe"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSumMablaghTakhfifVizhe"))))));
 BA.debugLineNum = 1313;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",Row.Get(\"FldS";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSumMablaghTakhfifKala"))))));
 BA.debugLineNum = 1314;BA.debugLine="m.Put(\"FldMablaghKol\",Row.Get(\"FldTotalFaktor\"";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTotalFaktor"))))));
 BA.debugLineNum = 1315;BA.debugLine="m.Put(\"FldDate\",Row.Get(\"fldDate\"))";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDate"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate"))))));
 BA.debugLineNum = 1316;BA.debugLine="m.Put(\"FldTime\",Row.Get(\"fldTime\"))";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTime"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTime"))))));
 BA.debugLineNum = 1317;BA.debugLine="m.Put(\"FldSignatureBitmapString\",Row.Get(\"FldS";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSignatureBitmapString"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSignatureBitmapString"))))));
 BA.debugLineNum = 1318;BA.debugLine="m.Put(\"FldSync\",\"True\")";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSync"))),(Object)((RemoteObject.createImmutable("True"))));
 BA.debugLineNum = 1319;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WIsBacked"))),(Object)((RemoteObject.createImmutable("False"))));
 BA.debugLineNum = 1320;BA.debugLine="m.Put(\"FldType\",\"Foroosh\")";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldType"))),(Object)((RemoteObject.createImmutable("Foroosh"))));
 BA.debugLineNum = 1321;BA.debugLine="m.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAmani"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldAmani"))))));
 BA.debugLineNum = 1322;BA.debugLine="m.Put(\"fldShomareForoosh\",Row.Get(\"fldShomareF";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareForoosh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareForoosh"))))));
 BA.debugLineNum = 1323;BA.debugLine="m.Put(\"WSendFrom\",3)";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WSendFrom"))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 1324;BA.debugLine="lst.Add(m)";
Debug.ShouldStop(2048);
_lst.runVoidMethod ("Add",(Object)((_m.getObject())));
 };
 }
};
 BA.debugLineNum = 1329;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFaktor\",lst)";
Debug.ShouldStop(65536);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblFaktor")),(Object)(_lst));
 BA.debugLineNum = 1331;BA.debugLine="Log(\"لیست سفارشات بروزرسانی گردید\")";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116850753",RemoteObject.createImmutable("لیست سفارشات بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e51) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e51.toString()); BA.debugLineNum = 1333;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116850755",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 1334;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetReportRizePishFactor")));
 };
 BA.debugLineNum = 1336;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetreportrizepishfactor3fast(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetReportRizePishFactor3Fast (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1338);
if (RapidSub.canDelegate("loadgetreportrizepishfactor3fast")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetreportrizepishfactor3fast", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _crow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1338;BA.debugLine="Sub LoadGetReportRizePishFactor3Fast(Str As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1339;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 1340;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(134217728);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1341;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(268435456);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1342;BA.debugLine="Dim crow As  Cursor";
Debug.ShouldStop(536870912);
_crow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("crow", _crow);
 BA.debugLineNum = 1343;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(1073741824);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 1345;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1346;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(2);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1347;BA.debugLine="Dim lst As List";
Debug.ShouldStop(4);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1348;BA.debugLine="lst.Initialize";
Debug.ShouldStop(8);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 1349;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(16);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step10 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit10) || (step10 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit10) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step10))  ) {
 BA.debugLineNum = 1350;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(32);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1351;BA.debugLine="Log(\"FldShomareFaktor:\"& Row.Get(\"fldShomareFac";
Debug.ShouldStop(64);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116916237",RemoteObject.concat(RemoteObject.createImmutable("FldShomareFaktor:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactor"))))),0);
 BA.debugLineNum = 1353;BA.debugLine="crow=MCode.Result(\"select * from TblFaktor wher";
Debug.ShouldStop(256);
_crow = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblFaktor where FldShomareFaktor='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactor")))),RemoteObject.createImmutable("'"))));Debug.locals.put("crow", _crow);
 BA.debugLineNum = 1354;BA.debugLine="CountRow=crow.RowCount";
Debug.ShouldStop(512);
_countrow = _crow.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 1355;BA.debugLine="If CountRow =0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1356;BA.debugLine="If Row.Get(\"fldTedadJoz\")>0 Or Row.Get(\"fldTed";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz"))))),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1360;BA.debugLine="Dim m As Map";
Debug.ShouldStop(32768);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 1361;BA.debugLine="m.Initialize";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 1362;BA.debugLine="m.Put(\"FldRadif\",Row.Get(\"fldRadif\"))";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldRadif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldRadif"))))));
 BA.debugLineNum = 1363;BA.debugLine="m.Put(\"FldC_Visitor\",Row.Get(\"fldCodeVasete\")";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Visitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeVasete"))))));
 BA.debugLineNum = 1364;BA.debugLine="m.Put(\"FldC_Tafzili\",Row.Get(\"fldCodeTafsili\"";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Tafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeTafsili"))))));
 BA.debugLineNum = 1365;BA.debugLine="m.Put(\"FldN_Tafzili\",Row.Get(\"fldSharheTafzil";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldN_Tafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharheTafzili"))))));
 BA.debugLineNum = 1366;BA.debugLine="m.Put(\"FldShomareFaktor\",Row.Get(\"fldShomareF";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareFaktor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactor"))))));
 BA.debugLineNum = 1367;BA.debugLine="m.Put(\"FldShomareBargasht\",Row.Get(\"fldShomar";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareBargasht"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareBargasht"))))));
 BA.debugLineNum = 1368;BA.debugLine="m.Put(\"FldCodeKala\",Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCodeKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))));
 BA.debugLineNum = 1369;BA.debugLine="m.Put(\"FldNameKala\",Row.Get(\"fldSharhKala\"))";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharhKala"))))));
 BA.debugLineNum = 1370;BA.debugLine="m.Put(\"FldFeeForoosh\",Row.Get(\"fldFeeJoz\"))";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldFeeForoosh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeJoz"))))));
 BA.debugLineNum = 1371;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Row.Get(\"fldMablag";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldFeeBadAzTakhfif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMablaghTakhfif"))))));
 BA.debugLineNum = 1372;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Row.Get(\"fldMablagh";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMablaghTakhfif"))))));
 BA.debugLineNum = 1373;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Row.Get(\"fldTedad";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadJoz"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz"))))));
 BA.debugLineNum = 1374;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Row.Get(\"fldTedad";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))));
 BA.debugLineNum = 1375;BA.debugLine="m.Put(\"FldTedadDarkarton\",Row.Get(\"FldTedadDa";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarkarton"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTedadDarKarton"))))));
 BA.debugLineNum = 1376;BA.debugLine="m.Put(\"FldTotalFaktor\",Row.Get(\"FldTotalFakto";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTotalFaktor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTotalFaktor"))))));
 BA.debugLineNum = 1377;BA.debugLine="m.Put(\"FldTozihat\",Row.Get(\"fldTozihatRecord\"";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozihat"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTozihatRecord"))))));
 BA.debugLineNum = 1378;BA.debugLine="m.Put(\"FldTozih\",Row.Get(\"FldTozihat\"))";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozih"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTozihat"))))));
 BA.debugLineNum = 1379;BA.debugLine="m.Put(\"FldVaziatPardakht\",Row.Get(\"fldNahveTa";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVaziatPardakht"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNahveTasvie"))))));
 BA.debugLineNum = 1380;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",Row.Get(\"FldMabl";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfifKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldMablaghTakhfifKol"))))));
 BA.debugLineNum = 1381;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",Row.Get(\"Fl";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifVizhe"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSumMablaghTakhfifVizhe"))))));
 BA.debugLineNum = 1382;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",Row.Get(\"Fld";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSumMablaghTakhfifKala"))))));
 BA.debugLineNum = 1383;BA.debugLine="m.Put(\"FldMablaghKol\",Row.Get(\"FldTotalFaktor";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTotalFaktor"))))));
 BA.debugLineNum = 1384;BA.debugLine="m.Put(\"FldDate\",Row.Get(\"fldDate\"))";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDate"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate"))))));
 BA.debugLineNum = 1385;BA.debugLine="m.Put(\"FldTime\",Row.Get(\"fldTime\"))";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTime"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTime"))))));
 BA.debugLineNum = 1386;BA.debugLine="m.Put(\"FldSignatureBitmapString\",Row.Get(\"Fld";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSignatureBitmapString"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSignatureBitmapString"))))));
 BA.debugLineNum = 1387;BA.debugLine="m.Put(\"FldSync\",\"True\")";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSync"))),(Object)((RemoteObject.createImmutable("True"))));
 BA.debugLineNum = 1388;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WIsBacked"))),(Object)((RemoteObject.createImmutable("False"))));
 BA.debugLineNum = 1389;BA.debugLine="m.Put(\"FldType\",\"Foroosh\")";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldType"))),(Object)((RemoteObject.createImmutable("Foroosh"))));
 BA.debugLineNum = 1390;BA.debugLine="m.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAmani"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldAmani"))))));
 BA.debugLineNum = 1391;BA.debugLine="m.Put(\"fldShomareForoosh\",Row.Get(\"fldShomare";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareForoosh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareForoosh"))))));
 BA.debugLineNum = 1392;BA.debugLine="m.Put(\"WSendFrom\",3)";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WSendFrom"))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 1393;BA.debugLine="lst.Add(m)";
Debug.ShouldStop(65536);
_lst.runVoidMethod ("Add",(Object)((_m.getObject())));
 };
 }else 
{ BA.debugLineNum = 1398;BA.debugLine="Else if CountRow>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1401;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor where";
Debug.ShouldStop(16777216);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblFaktor where FldShomareFaktor="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactor")))))));
 BA.debugLineNum = 1404;BA.debugLine="If Row.Get(\"fldTedadJoz\")>0 Or Row.Get(\"fldTed";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz"))))),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1408;BA.debugLine="Dim m As Map";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 1409;BA.debugLine="m.Initialize";
Debug.ShouldStop(1);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 1410;BA.debugLine="m.Put(\"FldRadif\",Row.Get(\"fldRadif\"))";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldRadif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldRadif"))))));
 BA.debugLineNum = 1411;BA.debugLine="m.Put(\"FldC_Visitor\",Row.Get(\"fldCodeVasete\")";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Visitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeVasete"))))));
 BA.debugLineNum = 1412;BA.debugLine="m.Put(\"FldC_Tafzili\",Row.Get(\"fldCodeTafsili\"";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Tafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeTafsili"))))));
 BA.debugLineNum = 1413;BA.debugLine="m.Put(\"FldN_Tafzili\",Row.Get(\"fldSharheTafzil";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldN_Tafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharheTafzili"))))));
 BA.debugLineNum = 1414;BA.debugLine="m.Put(\"FldShomareFaktor\",Row.Get(\"fldShomareF";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareFaktor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactor"))))));
 BA.debugLineNum = 1415;BA.debugLine="m.Put(\"FldShomareBargasht\",Row.Get(\"fldShomar";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareBargasht"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareBargasht"))))));
 BA.debugLineNum = 1416;BA.debugLine="m.Put(\"FldCodeKala\",Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCodeKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))));
 BA.debugLineNum = 1417;BA.debugLine="m.Put(\"FldNameKala\",Row.Get(\"fldSharhKala\"))";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharhKala"))))));
 BA.debugLineNum = 1418;BA.debugLine="m.Put(\"FldFeeForoosh\",Row.Get(\"fldFeeJoz\"))";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldFeeForoosh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeJoz"))))));
 BA.debugLineNum = 1419;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Row.Get(\"fldMablag";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldFeeBadAzTakhfif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMablaghTakhfif"))))));
 BA.debugLineNum = 1420;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Row.Get(\"fldMablagh";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMablaghTakhfif"))))));
 BA.debugLineNum = 1421;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Row.Get(\"fldTedad";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadJoz"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz"))))));
 BA.debugLineNum = 1422;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Row.Get(\"fldTedad";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))));
 BA.debugLineNum = 1423;BA.debugLine="m.Put(\"FldTedadDarkarton\",Row.Get(\"FldTedadDa";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarkarton"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTedadDarKarton"))))));
 BA.debugLineNum = 1424;BA.debugLine="m.Put(\"FldTotalFaktor\",Row.Get(\"FldTotalFakto";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTotalFaktor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTotalFaktor"))))));
 BA.debugLineNum = 1425;BA.debugLine="m.Put(\"FldTozihat\",Row.Get(\"fldTozihatRecord\"";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozihat"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTozihatRecord"))))));
 BA.debugLineNum = 1426;BA.debugLine="m.Put(\"FldTozih\",Row.Get(\"FldTozihat\"))";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozih"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTozihat"))))));
 BA.debugLineNum = 1427;BA.debugLine="m.Put(\"FldVaziatPardakht\",Row.Get(\"fldNahveTa";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVaziatPardakht"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNahveTasvie"))))));
 BA.debugLineNum = 1428;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",Row.Get(\"FldMabl";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfifKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldMablaghTakhfifKol"))))));
 BA.debugLineNum = 1429;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",Row.Get(\"Fl";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifVizhe"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSumMablaghTakhfifVizhe"))))));
 BA.debugLineNum = 1430;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",Row.Get(\"Fld";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSumMablaghTakhfifKala"))))));
 BA.debugLineNum = 1431;BA.debugLine="m.Put(\"FldMablaghKol\",Row.Get(\"FldTotalFaktor";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTotalFaktor"))))));
 BA.debugLineNum = 1432;BA.debugLine="m.Put(\"FldDate\",Row.Get(\"fldDate\"))";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDate"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate"))))));
 BA.debugLineNum = 1433;BA.debugLine="m.Put(\"FldTime\",Row.Get(\"fldTime\"))";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTime"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTime"))))));
 BA.debugLineNum = 1434;BA.debugLine="m.Put(\"FldSignatureBitmapString\",Row.Get(\"Fld";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSignatureBitmapString"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSignatureBitmapString"))))));
 BA.debugLineNum = 1435;BA.debugLine="m.Put(\"FldSync\",\"True\")";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSync"))),(Object)((RemoteObject.createImmutable("True"))));
 BA.debugLineNum = 1436;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WIsBacked"))),(Object)((RemoteObject.createImmutable("False"))));
 BA.debugLineNum = 1437;BA.debugLine="m.Put(\"FldType\",\"Foroosh\")";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldType"))),(Object)((RemoteObject.createImmutable("Foroosh"))));
 BA.debugLineNum = 1438;BA.debugLine="m.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAmani"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldAmani"))))));
 BA.debugLineNum = 1439;BA.debugLine="m.Put(\"fldShomareForoosh\",Row.Get(\"fldShomare";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareForoosh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareForoosh"))))));
 BA.debugLineNum = 1440;BA.debugLine="m.Put(\"WSendFrom\",3)";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WSendFrom"))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 1441;BA.debugLine="lst.Add(m)";
Debug.ShouldStop(1);
_lst.runVoidMethod ("Add",(Object)((_m.getObject())));
 };
 }}
;
 }
};
 BA.debugLineNum = 1449;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFaktor\",lst)";
Debug.ShouldStop(256);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblFaktor")),(Object)(_lst));
 BA.debugLineNum = 1450;BA.debugLine="Log(\"لیست سفارشات بروزرسانی گردید\")";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116916336",RemoteObject.createImmutable("لیست سفارشات بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e95) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e95.toString()); BA.debugLineNum = 1452;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116916338",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 1453;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(4096);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetTasvieFast")));
 };
 BA.debugLineNum = 1455;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetsetting(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetSetting (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,225);
if (RapidSub.canDelegate("loadgetsetting")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetsetting", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _where = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 225;BA.debugLine="Sub LoadGetSetting(Str As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 227;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(4);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 228;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(8);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 229;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(16);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 230;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(32);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 231;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(64);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit6) || (step6 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit6) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step6))  ) {
 BA.debugLineNum = 232;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(128);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 233;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(256);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 234;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(512);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 236;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(2048);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 237;BA.debugLine="Where.Initialize";
Debug.ShouldStop(4096);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 238;BA.debugLine="Fields.Put(\"FldImei\",MCode.DeviceId)";
Debug.ShouldStop(8192);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldImei"))),(Object)((firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 239;BA.debugLine="Fields.Put(\"FldC_Visitor\",Row.Get(\"FldC_Visitor";
Debug.ShouldStop(16384);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Visitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldC_Visitor"))))));
 BA.debugLineNum = 240;BA.debugLine="Fields.Put(\"FldN_Visitor\",Row.Get(\"FldN_Visitor";
Debug.ShouldStop(32768);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldN_Visitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldN_Visitor"))))));
 BA.debugLineNum = 241;BA.debugLine="Fields.Put(\"FldGps\",Row.Get(\"FldGps\"))";
Debug.ShouldStop(65536);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldGps"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldGps"))))));
 BA.debugLineNum = 242;BA.debugLine="Fields.Put(\"FldIntervalGps\",Row.Get(\"FldInterva";
Debug.ShouldStop(131072);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldIntervalGps"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldIntervalGps"))))));
 BA.debugLineNum = 243;BA.debugLine="Fields.Put(\"FldNoeDate\",Row.Get(\"FldNoeDate\"))";
Debug.ShouldStop(262144);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNoeDate"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldNoeDate"))))));
 BA.debugLineNum = 244;BA.debugLine="Fields.Put(\"FldRound\",Row.Get(\"FldRound\"))";
Debug.ShouldStop(524288);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldRound"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldRound"))))));
 BA.debugLineNum = 245;BA.debugLine="Fields.Put(\"FldKalaManfi\",Row.Get(\"FldKalaManfi";
Debug.ShouldStop(1048576);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldKalaManfi"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldKalaManfi"))))));
 BA.debugLineNum = 246;BA.debugLine="Fields.Put(\"FldTaghirFeeKala\",Row.Get(\"FldTaghi";
Debug.ShouldStop(2097152);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTaghirFeeKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTaghirFeeKala"))))));
 BA.debugLineNum = 247;BA.debugLine="Fields.Put(\"fldNamayeshKalaSefr\",Row.Get(\"fldNa";
Debug.ShouldStop(4194304);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldNamayeshKalaSefr"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNamayeshKalaSefr"))))));
 BA.debugLineNum = 248;BA.debugLine="Fields.Put(\"FldDastrasiKala\",Row.Get(\"FldDastra";
Debug.ShouldStop(8388608);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDastrasiKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldDastrasiKala"))))));
 BA.debugLineNum = 249;BA.debugLine="Fields.Put(\"FldDastrasiAshkhas\",Row.Get(\"FldDas";
Debug.ShouldStop(16777216);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDastrasiAshkhas"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldDastrasiAshkhas"))))));
 BA.debugLineNum = 250;BA.debugLine="Fields.Put(\"FldAdmin\",Row.Get(\"FldAdmin\"))";
Debug.ShouldStop(33554432);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAdmin"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldAdmin"))))));
 BA.debugLineNum = 251;BA.debugLine="Fields.Put(\"FldCheckAdmin\",Row.Get(\"FldCheckAdm";
Debug.ShouldStop(67108864);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCheckAdmin"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldCheckAdmin"))))));
 BA.debugLineNum = 252;BA.debugLine="Fields.Put(\"FldTakhfifKala\",Row.Get(\"FldTakhfif";
Debug.ShouldStop(134217728);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTakhfifKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTakhfifKala"))))));
 BA.debugLineNum = 253;BA.debugLine="Fields.Put(\"FldTozie\",Row.Get(\"FldTozie\"))";
Debug.ShouldStop(268435456);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozie"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTozie"))))));
 BA.debugLineNum = 254;BA.debugLine="Fields.Put(\"FldVisitor\",Row.Get(\"FldVisitor\"))";
Debug.ShouldStop(536870912);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVisitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldVisitor"))))));
 BA.debugLineNum = 255;BA.debugLine="Fields.Put(\"FldVahedPool\",Row.Get(\"FldVahedPool";
Debug.ShouldStop(1073741824);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVahedPool"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldVahedPool"))))));
 BA.debugLineNum = 256;BA.debugLine="Fields.Put(\"FldHideMojodi\",Row.Get(\"FldHideMojo";
Debug.ShouldStop(-2147483648);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldHideMojodi"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldHideMojodi"))))));
 BA.debugLineNum = 257;BA.debugLine="Fields.Put(\"FldSendMarjoie\",Row.Get(\"FldSendMar";
Debug.ShouldStop(1);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSendMarjoie"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSendMarjoie"))))));
 BA.debugLineNum = 258;BA.debugLine="Fields.Put(\"FldPicOnline\",Row.Get(\"FldPicOnline";
Debug.ShouldStop(2);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldPicOnline"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldPicOnline"))))));
 BA.debugLineNum = 259;BA.debugLine="Fields.Put(\"FldDaryaft\",Row.Get(\"FldDaryaft\"))";
Debug.ShouldStop(4);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDaryaft"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldDaryaft"))))));
 BA.debugLineNum = 260;BA.debugLine="Fields.Put(\"FldGetDataOnline\",Row.Get(\"FldGetDa";
Debug.ShouldStop(8);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldGetDataOnline"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldGetDataOnline"))))));
 BA.debugLineNum = 261;BA.debugLine="Fields.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
Debug.ShouldStop(16);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAmani"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldAmani"))))));
 BA.debugLineNum = 262;BA.debugLine="Fields.Put(\"FldMojavezSefaresh\",Row.Get(\"FldMoj";
Debug.ShouldStop(32);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMojavezSefaresh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldMojavezSefaresh"))))));
 BA.debugLineNum = 263;BA.debugLine="Fields.Put(\"FldConnectionStatus\",Row.Get(\"FldCo";
Debug.ShouldStop(64);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldConnectionStatus"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldConnectionStatus"))))));
 BA.debugLineNum = 264;BA.debugLine="Fields.Put(\"FldEshantionTabaghati\",Row.Get(\"Fld";
Debug.ShouldStop(128);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldEshantionTabaghati"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldEshantionTabaghati"))))));
 BA.debugLineNum = 265;BA.debugLine="Fields.Put(\"FldEshantionRemove\",Row.Get(\"FldEsh";
Debug.ShouldStop(256);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldEshantionRemove"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldEshantionRemove"))))));
 BA.debugLineNum = 266;BA.debugLine="Where.Put(\"FldId\",1)";
Debug.ShouldStop(512);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldId"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 268;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblSetting\",Fi";
Debug.ShouldStop(2048);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblSetting")),(Object)(_fields),(Object)(_where));
 }
};
 BA.debugLineNum = 273;BA.debugLine="MCode.UpdateSetting";
Debug.ShouldStop(65536);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_updatesetting" /*RemoteObject*/ ,firebasemessaging.processBA);
 BA.debugLineNum = 278;BA.debugLine="Log(\"تنظیمات با موفقیت دریافت گردید\")";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114360373",RemoteObject.createImmutable("تنظیمات با موفقیت دریافت گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e46) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e46.toString()); BA.debugLineNum = 280;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114360375",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 281;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(16777216);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetSetting")));
 };
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgettasvie(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetTasvie (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1083);
if (RapidSub.canDelegate("loadgettasvie")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgettasvie", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1083;BA.debugLine="Sub LoadGetTasvie(Str As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1084;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(134217728);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1085;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(268435456);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1086;BA.debugLine="MCode.SaveUpdate(\"Delete From TblTasvie\")";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblTasvie")));
 BA.debugLineNum = 1087;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1088;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(-2147483648);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1090;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(2);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit6) || (step6 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit6) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step6))  ) {
 BA.debugLineNum = 1091;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(4);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1092;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblTasvie (FldCode";
Debug.ShouldStop(8);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblTasvie (FldCode,FldName) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldName")))),RemoteObject.createImmutable("')"))));
 }
};
 BA.debugLineNum = 1095;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgettasviefast(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetTasvieFast (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1097);
if (RapidSub.canDelegate("loadgettasviefast")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgettasviefast", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _crow = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _countrow = RemoteObject.createImmutable(0);
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1097;BA.debugLine="Sub LoadGetTasvieFast(Str As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 1098;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 1099;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(1024);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1100;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(2048);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1101;BA.debugLine="Dim crow As  Cursor";
Debug.ShouldStop(4096);
_crow = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("crow", _crow);
 BA.debugLineNum = 1102;BA.debugLine="Dim CountRow As Int";
Debug.ShouldStop(8192);
_countrow = RemoteObject.createImmutable(0);Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 1104;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(32768);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1105;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(65536);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1107;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(262144);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit8) || (step8 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit8) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step8))  ) {
 BA.debugLineNum = 1108;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(524288);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1109;BA.debugLine="Log(\"FldCode:\"& Row.Get(\"fldCode\"))";
Debug.ShouldStop(1048576);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116326412",RemoteObject.concat(RemoteObject.createImmutable("FldCode:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode"))))),0);
 BA.debugLineNum = 1111;BA.debugLine="crow=MCode.Result(\"select * from TblTasvie where";
Debug.ShouldStop(4194304);
_crow = firebasemessaging.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblTasvie where FldCode='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))),RemoteObject.createImmutable("'"))));Debug.locals.put("crow", _crow);
 BA.debugLineNum = 1112;BA.debugLine="CountRow=crow.RowCount";
Debug.ShouldStop(8388608);
_countrow = _crow.runMethod(true,"getRowCount");Debug.locals.put("CountRow", _countrow);
 BA.debugLineNum = 1113;BA.debugLine="If CountRow =0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1114;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblTasvie (FldCod";
Debug.ShouldStop(33554432);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblTasvie (FldCode,FldName) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldName")))),RemoteObject.createImmutable("'"))));
 }else 
{ BA.debugLineNum = 1117;BA.debugLine="Else if CountRow>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_countrow,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1128;BA.debugLine="MCode.SaveUpdate(\"Update TblTasvie Set FldName=";
Debug.ShouldStop(128);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblTasvie Set FldName='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldName")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" where FldCode='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))),RemoteObject.createImmutable("'"))));
 }}
;
 }
};
 BA.debugLineNum = 1134;BA.debugLine="Log(\"تسویه بروزرسانی گردید\")";
Debug.ShouldStop(8192);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116326437",RemoteObject.createImmutable("تسویه بروزرسانی گردید"),0);
 BA.debugLineNum = 1135;BA.debugLine="Select MCode.page";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(firebasemessaging.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("KalaDefault"),BA.ObjectToString("Kala_listi"),BA.ObjectToString("SabtMarjooii"),BA.ObjectToString("Search"))) {
case 0: {
 BA.debugLineNum = 1138;BA.debugLine="CallSubDelayed(Act_KalaDefault,\"LoadAcSpNoeTas";
Debug.ShouldStop(131072);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_kaladefault.getObject())),(Object)(RemoteObject.createImmutable("LoadAcSpNoeTasvie")));
 break; }
case 1: {
 BA.debugLineNum = 1140;BA.debugLine="CallSubDelayed(Act_Kala_listi,\"LoadAcSpNoeTasv";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_kala_listi.getObject())),(Object)(RemoteObject.createImmutable("LoadAcSpNoeTasvie")));
 break; }
case 2: {
 BA.debugLineNum = 1142;BA.debugLine="CallSubDelayed(Act_KalaDefault,\"LoadAcSpNoeTas";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_kaladefault.getObject())),(Object)(RemoteObject.createImmutable("LoadAcSpNoeTasvie")));
 break; }
case 3: {
 BA.debugLineNum = 1144;BA.debugLine="CallSubDelayed(Act_Search,\"LoadAcSpNoeTasvie\")";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent.__c.runVoidMethod ("CallSubDelayed",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._act_search.getObject())),(Object)(RemoteObject.createImmutable("LoadAcSpNoeTasvie")));
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e31) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e31.toString()); BA.debugLineNum = 1147;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116326450",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 1148;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(134217728);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetTasvieFast")));
 };
 BA.debugLineNum = 1151;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetupdatefee(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetUpdateFee (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,525);
if (RapidSub.canDelegate("loadgetupdatefee")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadgetupdatefee", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 525;BA.debugLine="Sub LoadGetUpdateFee(Str As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 526;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 527;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(16384);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 528;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(32768);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 529;BA.debugLine="Row.Initialize";
Debug.ShouldStop(65536);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 531;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 532;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(524288);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 534;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(2097152);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
firebasemessaging._i = BA.numberCast(int.class, 0) ;
for (;(step7 > 0 && firebasemessaging._i.<Integer>get().intValue() <= limit7) || (step7 < 0 && firebasemessaging._i.<Integer>get().intValue() >= limit7) ;firebasemessaging._i = RemoteObject.createImmutable((int)(0 + firebasemessaging._i.<Integer>get().intValue() + step7))  ) {
 BA.debugLineNum = 535;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(4194304);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(firebasemessaging._i)));Debug.locals.put("Row", _row);
 BA.debugLineNum = 536;BA.debugLine="Log(\"fldCodeKala:\"& Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(8388608);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114819083",RemoteObject.concat(RemoteObject.createImmutable("fldCodeKala:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))),0);
 BA.debugLineNum = 537;BA.debugLine="Log(\"fldFeeTasvie:\"& Row.Get(\"fldFeeTasvie\"))";
Debug.ShouldStop(16777216);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114819084",RemoteObject.concat(RemoteObject.createImmutable("fldFeeTasvie:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeTasvie"))))),0);
 BA.debugLineNum = 538;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set fldFeeTasvi";
Debug.ShouldStop(33554432);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblKala Set fldFeeTasvie='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeTasvie")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" where fldCodeKala="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))))));
 }
};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e14.toString()); BA.debugLineNum = 542;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5114819089",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 543;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-LoadGetUpdateFee")));
 };
 BA.debugLineNum = 545;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadshowrizefactorforooshbyhavale(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadShowRizeFactorForooshByHavale (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1243);
if (RapidSub.canDelegate("loadshowrizefactorforooshbyhavale")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","loadshowrizefactorforooshbyhavale", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1243;BA.debugLine="Sub LoadShowRizeFactorForooshByHavale(Str As Strin";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1244;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 1245;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(268435456);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1246;BA.debugLine="MCode.SaveUpdate(\"Delete From TblRizFactorHavale";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("Delete From TblRizFactorHavale")));
 BA.debugLineNum = 1247;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(1073741824);
firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1248;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(-2147483648);
_rowslist = firebasemessaging.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1249;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblRizFactorHaval";
Debug.ShouldStop(1);
firebasemessaging.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(firebasemessaging.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblRizFactorHavale")),(Object)(_rowslist));
 BA.debugLineNum = 1250;BA.debugLine="Log(\"ریز فاکتور های حواله دریافت گردید\")";
Debug.ShouldStop(2);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116719623",RemoteObject.createImmutable("ریز فاکتور های حواله دریافت گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e9.toString()); BA.debugLineNum = 1255;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5116719628",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 1256;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(128);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadShowFactorForooshByHavale")));
 };
 BA.debugLineNum = 1259;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Dim jobInternet As HttpJob";
firebasemessaging._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");
 //BA.debugLineNum = 9;BA.debugLine="Dim datenow As String";
firebasemessaging._datenow = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim DateUpdate As String";
firebasemessaging._dateupdate = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim TypeDelete As String";
firebasemessaging._typedelete = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim Title As String";
firebasemessaging._title = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Public mode As String";
firebasemessaging._mode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim i As Int=0";
firebasemessaging._i = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 15;BA.debugLine="Dim CodeTafzili1,CodeKala1 As String";
firebasemessaging._codetafzili1 = RemoteObject.createImmutable("");
firebasemessaging._codekala1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim StatusCodeTafzili1,StatusCodeKala1 As String=";
firebasemessaging._statuscodetafzili1 = RemoteObject.createImmutable("");
firebasemessaging._statuscodekala1 = BA.ObjectToString("NotOK");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sendtoken(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("SendToken (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,981);
if (RapidSub.canDelegate("sendtoken")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","sendtoken", _str);}
Debug.locals.put("Str", _str);
 BA.debugLineNum = 981;BA.debugLine="Sub SendToken(Str As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 982;BA.debugLine="jobInternet.JobName =\"SaveToken\"";
Debug.ShouldStop(2097152);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SaveToken"));
 BA.debugLineNum = 983;BA.debugLine="Log(Str)";
Debug.ShouldStop(4194304);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5115933186",_str,0);
 BA.debugLineNum = 984;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8388608);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveToken"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Token="),_str,RemoteObject.createImmutable("&Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 985;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Service_Create (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,20);
if (RapidSub.canDelegate("service_create")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_create");}
 BA.debugLineNum = 20;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(2097152);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString("jobInternet")),(Object)(firebasemessaging.getObject()));
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
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,978);
if (RapidSub.canDelegate("service_destroy")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_destroy");}
 BA.debugLineNum = 978;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(131072);
 BA.debugLineNum = 980;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Service_Start (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,31);
if (RapidSub.canDelegate("service_start")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 31;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 35;BA.debugLine="GetCurrentDate";
Debug.ShouldStop(4);
_getcurrentdate();
 BA.debugLineNum = 36;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",firebasemessaging.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 37;BA.debugLine="Return";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 39;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",firebasemessaging.mostCurrent._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 40;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tru";
Debug.ShouldStop(128);
firebasemessaging.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 41;BA.debugLine="Return";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 43;BA.debugLine="LoadData";
Debug.ShouldStop(1024);
_loaddata();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e12.toString()); BA.debugLineNum = 45;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","5113901582",BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA)),0);
 BA.debugLineNum = 46;BA.debugLine="myCode.SendError(LastException,\"FirebaseMessagin";
Debug.ShouldStop(8192);
firebasemessaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,firebasemessaging.processBA,(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA))),(Object)(RemoteObject.createImmutable("FirebaseMessaging-Service_Start")));
 };
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showrizefactorforooshbyhavale() throws Exception{
try {
		Debug.PushSubsStack("ShowRizeFactorForooshByHavale (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,1238);
if (RapidSub.canDelegate("showrizefactorforooshbyhavale")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","showrizefactorforooshbyhavale");}
 BA.debugLineNum = 1238;BA.debugLine="Sub ShowRizeFactorForooshByHavale()";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1239;BA.debugLine="jobInternet.JobName =\"ShowRizFactorForooshByHaval";
Debug.ShouldStop(4194304);
firebasemessaging._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("ShowRizFactorForooshByHavale"));
 BA.debugLineNum = 1240;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8388608);
firebasemessaging._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),firebasemessaging.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/ShowRizFactorForooshByHavale"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),firebasemessaging.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 1241;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _subscribetotopics() throws Exception{
try {
		Debug.PushSubsStack("SubscribeToTopics (firebasemessaging) ","firebasemessaging",94,firebasemessaging.processBA,firebasemessaging.mostCurrent,27);
if (RapidSub.canDelegate("subscribetotopics")) { return ir.parsikhesab.pakhsh.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","subscribetotopics");}
 BA.debugLineNum = 27;BA.debugLine="Public Sub SubscribeToTopics";
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
}