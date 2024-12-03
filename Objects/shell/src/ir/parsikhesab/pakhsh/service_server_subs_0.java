package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class service_server_subs_0 {


public static RemoteObject  _getallnotification() throws Exception{
try {
		Debug.PushSubsStack("GetAllNotification (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,655);
if (RapidSub.canDelegate("getallnotification")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getallnotification");}
 BA.debugLineNum = 655;BA.debugLine="Sub GetAllNotification";
Debug.ShouldStop(16384);
 BA.debugLineNum = 656;BA.debugLine="jobInternet.JobName =\"GetAllNotification\"";
Debug.ShouldStop(32768);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetAllNotification"));
 BA.debugLineNum = 657;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(65536);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAllNotification"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 658;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getashkhas() throws Exception{
try {
		Debug.PushSubsStack("GetAshkhas (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,263);
if (RapidSub.canDelegate("getashkhas")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getashkhas");}
 BA.debugLineNum = 263;BA.debugLine="Sub GetAshkhas";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="jobInternet.JobName =\"GetAshkhas\"";
Debug.ShouldStop(128);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetAshkhas"));
 BA.debugLineNum = 266;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(512);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetListAshkhas"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&Version=1"))));
 BA.debugLineNum = 267;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(1024);
_request(service_server._jobinternet);
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbankma() throws Exception{
try {
		Debug.PushSubsStack("GetBankMa (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1222);
if (RapidSub.canDelegate("getbankma")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getbankma");}
RemoteObject _dateupdate = RemoteObject.createImmutable("");
 BA.debugLineNum = 1222;BA.debugLine="Sub GetBankMa";
Debug.ShouldStop(32);
 BA.debugLineNum = 1223;BA.debugLine="jobInternet.JobName =\"GetBankMa\"";
Debug.ShouldStop(64);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetBankMa"));
 BA.debugLineNum = 1224;BA.debugLine="Dim DateUpdate As String=\"\"";
Debug.ShouldStop(128);
_dateupdate = BA.ObjectToString("");Debug.locals.put("DateUpdate", _dateupdate);Debug.locals.put("DateUpdate", _dateupdate);
 BA.debugLineNum = 1225;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(256);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetStoredTozieFast"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=ShowBankeMa"),RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&flag="),service_server.mostCurrent._mcode._gethavaleflag /*RemoteObject*/ ,RemoteObject.createImmutable("&LastDateUpdate="),_dateupdate)));
 BA.debugLineNum = 1226;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(512);
_request(service_server._jobinternet);
 BA.debugLineNum = 1227;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbankmoshtari() throws Exception{
try {
		Debug.PushSubsStack("GetBankMoshtari (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1245);
if (RapidSub.canDelegate("getbankmoshtari")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getbankmoshtari");}
RemoteObject _dateupdate = RemoteObject.createImmutable("");
 BA.debugLineNum = 1245;BA.debugLine="Sub GetBankMoshtari";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1246;BA.debugLine="jobInternet.JobName =\"GetBankMoshtari\"";
Debug.ShouldStop(536870912);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetBankMoshtari"));
 BA.debugLineNum = 1247;BA.debugLine="Dim DateUpdate As String=\"\"";
Debug.ShouldStop(1073741824);
_dateupdate = BA.ObjectToString("");Debug.locals.put("DateUpdate", _dateupdate);Debug.locals.put("DateUpdate", _dateupdate);
 BA.debugLineNum = 1248;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(-2147483648);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetStoredTozieFast"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=ShowBankeMoshtari"),RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&flag="),service_server.mostCurrent._mcode._gethavaleflag /*RemoteObject*/ ,RemoteObject.createImmutable("&LastDateUpdate="),_dateupdate)));
 BA.debugLineNum = 1249;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(1);
_request(service_server._jobinternet);
 BA.debugLineNum = 1250;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcheckdaryaft() throws Exception{
try {
		Debug.PushSubsStack("GetCheckDaryaft (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,612);
if (RapidSub.canDelegate("getcheckdaryaft")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getcheckdaryaft");}
 BA.debugLineNum = 612;BA.debugLine="Public Sub GetCheckDaryaft";
Debug.ShouldStop(8);
 BA.debugLineNum = 613;BA.debugLine="jobInternet.JobName =\"GetCheckDaryaft\"";
Debug.ShouldStop(16);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetCheckDaryaft"));
 BA.debugLineNum = 614;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(32);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetDaryaft"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &type=CheckDaryaft"))));
 BA.debugLineNum = 615;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(64);
_request(service_server._jobinternet);
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcodemoshtari() throws Exception{
try {
		Debug.PushSubsStack("GetCodeMoshtari (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,177);
if (RapidSub.canDelegate("getcodemoshtari")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getcodemoshtari");}
 BA.debugLineNum = 177;BA.debugLine="Sub GetCodeMoshtari";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="jobInternet.JobName =\"GetCodeMoshtari\"";
Debug.ShouldStop(131072);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetCodeMoshtari"));
 BA.debugLineNum = 179;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(262144);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetCodeMoshtari"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 180;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(524288);
_request(service_server._jobinternet);
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("GetCurrentDate (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,88);
if (RapidSub.canDelegate("getcurrentdate")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getcurrentdate");}
 BA.debugLineNum = 88;BA.debugLine="Sub GetCurrentDate";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="jobInternet.JobName =\"GetCurrentDate\"";
Debug.ShouldStop(16777216);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetCurrentDate"));
 BA.debugLineNum = 90;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(33554432);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetCurrentDate"))),(Object)(BA.ObjectToString(service_server.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 91;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(67108864);
_request(service_server._jobinternet);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdaftarchtell() throws Exception{
try {
		Debug.PushSubsStack("GetDaftarchTell (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1522);
if (RapidSub.canDelegate("getdaftarchtell")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getdaftarchtell");}
 BA.debugLineNum = 1522;BA.debugLine="Public Sub GetDaftarchTell";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1523;BA.debugLine="jobInternet.JobName =\"GetDaftarchTell\"";
Debug.ShouldStop(262144);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetDaftarchTell"));
 BA.debugLineNum = 1524;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(524288);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetDaftarchTell"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 1525;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(1048576);
_request(service_server._jobinternet);
 BA.debugLineNum = 1526;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdaryaft() throws Exception{
try {
		Debug.PushSubsStack("GetDaryaft (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,578);
if (RapidSub.canDelegate("getdaryaft")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getdaryaft");}
 BA.debugLineNum = 578;BA.debugLine="Public Sub GetDaryaft";
Debug.ShouldStop(2);
 BA.debugLineNum = 579;BA.debugLine="jobInternet.JobName =\"GetDaryaft\"";
Debug.ShouldStop(4);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetDaryaft"));
 BA.debugLineNum = 580;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetDaryaft"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &type=Daryaft"))));
 BA.debugLineNum = 581;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(16);
_request(service_server._jobinternet);
 BA.debugLineNum = 582;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("GetEshantion (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,502);
if (RapidSub.canDelegate("geteshantion")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","geteshantion");}
 BA.debugLineNum = 502;BA.debugLine="Public Sub GetEshantion";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 503;BA.debugLine="jobInternet.JobName =\"GetEshantion\"";
Debug.ShouldStop(4194304);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetEshantion"));
 BA.debugLineNum = 504;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8388608);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=select fldCodeKala,fldTedadEshantion,fldCountForoosh,fldVaziat from tblEshantionVisitori where fldCodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(" &Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 510;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(536870912);
_request(service_server._jobinternet);
 BA.debugLineNum = 511;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geteshantion2() throws Exception{
try {
		Debug.PushSubsStack("GetEshantion2 (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,536);
if (RapidSub.canDelegate("geteshantion2")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","geteshantion2");}
 BA.debugLineNum = 536;BA.debugLine="Public Sub GetEshantion2";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 537;BA.debugLine="jobInternet.JobName =\"GetEshantion2\"";
Debug.ShouldStop(16777216);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetEshantion2"));
 BA.debugLineNum = 538;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(33554432);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetEshantion2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 539;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(67108864);
_request(service_server._jobinternet);
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geteshantiongroup() throws Exception{
try {
		Debug.PushSubsStack("GetEshantionGroup (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,557);
if (RapidSub.canDelegate("geteshantiongroup")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","geteshantiongroup");}
 BA.debugLineNum = 557;BA.debugLine="Public Sub GetEshantionGroup";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="jobInternet.JobName =\"GetEshantionGroup\"";
Debug.ShouldStop(8192);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetEshantionGroup"));
 BA.debugLineNum = 559;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(16384);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetEshantionGroup"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 560;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(32768);
_request(service_server._jobinternet);
 BA.debugLineNum = 561;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetFee (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,351);
if (RapidSub.canDelegate("getfee")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getfee");}
 BA.debugLineNum = 351;BA.debugLine="Sub GetFee";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 352;BA.debugLine="jobInternet.JobName =\"GetFee\"";
Debug.ShouldStop(-2147483648);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetFee"));
 BA.debugLineNum = 353;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(1);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=Select fldCodeKala,fldCodeTasvie,fldFee From tblFee"),RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 354;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(2);
_request(service_server._jobinternet);
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgallerykala() throws Exception{
try {
		Debug.PushSubsStack("GetGalleryKala (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,469);
if (RapidSub.canDelegate("getgallerykala")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getgallerykala");}
 BA.debugLineNum = 469;BA.debugLine="Sub GetGalleryKala";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 470;BA.debugLine="jobInternet.JobName =\"GetGalleryKala\"";
Debug.ShouldStop(2097152);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetGalleryKala"));
 BA.debugLineNum = 471;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(4194304);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=select * from tblGalleryPic "),RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 477;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(268435456);
_request(service_server._jobinternet);
 BA.debugLineNum = 478;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgoroohashkhas() throws Exception{
try {
		Debug.PushSubsStack("GetGoroohAshkhas (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,439);
if (RapidSub.canDelegate("getgoroohashkhas")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getgoroohashkhas");}
 BA.debugLineNum = 439;BA.debugLine="Sub GetGoroohAshkhas";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 440;BA.debugLine="jobInternet.JobName =\"GetGoroohAshkhas\"";
Debug.ShouldStop(8388608);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetGoroohAshkhas"));
 BA.debugLineNum = 441;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(16777216);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetListGroupAshkhas2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 444;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(134217728);
_request(service_server._jobinternet);
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
public static RemoteObject  _getgoroohkala() throws Exception{
try {
		Debug.PushSubsStack("GetGoroohKala (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,376);
if (RapidSub.canDelegate("getgoroohkala")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getgoroohkala");}
 BA.debugLineNum = 376;BA.debugLine="Sub GetGoroohKala";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 377;BA.debugLine="jobInternet.JobName =\"GetGoroohKala\"";
Debug.ShouldStop(16777216);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetGoroohKala"));
 BA.debugLineNum = 379;BA.debugLine="If MCode.DastrasiGroupKala=1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",service_server.mostCurrent._mcode._dastrasigroupkala /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 380;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"";
Debug.ShouldStop(134217728);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=Select fldGroupId,fldGroupName From tblGroupKala ORDER BY CONVERT(varchar, fldGroupId)"),RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 383;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"";
Debug.ShouldStop(1073741824);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=Select fldGroupId,fldGroupName From tblGroupKala WHERE  fldGroupId in(SELECT  fldCodeGroup FROM   tblGroupDastrasiKala WHERE        (fldVizitor = "),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(")) ORDER BY CONVERT(varchar, fldGroupId)"),RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 };
 BA.debugLineNum = 386;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(2);
_request(service_server._jobinternet);
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgroupdastrasiashkhas() throws Exception{
try {
		Debug.PushSubsStack("GetGroupDastrasiAshkhas (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1543);
if (RapidSub.canDelegate("getgroupdastrasiashkhas")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getgroupdastrasiashkhas");}
 BA.debugLineNum = 1543;BA.debugLine="Public Sub GetGroupDastrasiAshkhas";
Debug.ShouldStop(64);
 BA.debugLineNum = 1544;BA.debugLine="jobInternet.JobName =\"GetGroupDastrasiAshkhas\"";
Debug.ShouldStop(128);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetGroupDastrasiAshkhas"));
 BA.debugLineNum = 1545;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(256);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetGroupDastrasiAshkhas"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 1546;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(512);
_request(service_server._jobinternet);
 BA.debugLineNum = 1547;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("GetHavaleByUser (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1191);
if (RapidSub.canDelegate("gethavalebyuser")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","gethavalebyuser");}
RemoteObject _dateupdate = RemoteObject.createImmutable("");
 BA.debugLineNum = 1191;BA.debugLine="Sub GetHavaleByUser";
Debug.ShouldStop(64);
 BA.debugLineNum = 1192;BA.debugLine="jobInternet.JobName =\"GetHavaleByUser\"";
Debug.ShouldStop(128);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetHavaleByUser"));
 BA.debugLineNum = 1193;BA.debugLine="Dim DateUpdate As String=\"\"";
Debug.ShouldStop(256);
_dateupdate = BA.ObjectToString("");Debug.locals.put("DateUpdate", _dateupdate);Debug.locals.put("DateUpdate", _dateupdate);
 BA.debugLineNum = 1194;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(512);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/ShowHavaleGoroohiByRanadeh"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&flag="),service_server.mostCurrent._mcode._gethavaleflag /*RemoteObject*/ ,RemoteObject.createImmutable("&DateUpdate="),_dateupdate)));
 BA.debugLineNum = 1195;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(1024);
_request(service_server._jobinternet);
 BA.debugLineNum = 1196;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getkala() throws Exception{
try {
		Debug.PushSubsStack("GetKala (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,219);
if (RapidSub.canDelegate("getkala")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getkala");}
 BA.debugLineNum = 219;BA.debugLine="Sub GetKala";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 220;BA.debugLine="jobInternet.JobName =\"GetKala\"";
Debug.ShouldStop(134217728);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetKala"));
 BA.debugLineNum = 221;BA.debugLine="Log (MCode.DeviceId)";
Debug.ShouldStop(268435456);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57143426",service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,0);
 BA.debugLineNum = 222;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(536870912);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetListKala"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("&fldFeeTasvie="),service_server.mostCurrent._mcode._feecode /*RemoteObject*/ ,RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&Version=2"))));
 BA.debugLineNum = 223;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(1073741824);
_request(service_server._jobinternet);
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlinkftp() throws Exception{
try {
		Debug.PushSubsStack("GetLinkFtp (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,189);
if (RapidSub.canDelegate("getlinkftp")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getlinkftp");}
 BA.debugLineNum = 189;BA.debugLine="Sub GetLinkFtp";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="If	MCode.PicOnline=1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",service_server.mostCurrent._mcode._piconline /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 191;BA.debugLine="GetPicFTPForAndroid";
Debug.ShouldStop(1073741824);
_getpicftpforandroid();
 }else {
 BA.debugLineNum = 193;BA.debugLine="GetGalleryKala";
Debug.ShouldStop(1);
_getgallerykala();
 };
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistgpsvisitor() throws Exception{
try {
		Debug.PushSubsStack("GetListGpsVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1360);
if (RapidSub.canDelegate("getlistgpsvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getlistgpsvisitor");}
 BA.debugLineNum = 1360;BA.debugLine="Sub GetListGpsVisitor";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1361;BA.debugLine="jobInternet.JobName =\"GetListGpsVisitor\"";
Debug.ShouldStop(65536);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetListGpsVisitor"));
 BA.debugLineNum = 1362;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(131072);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetListGpsVisitor"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._codevisitorselect /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateTa="),service_server.mostCurrent._mcode._gpsdateta /*RemoteObject*/ ,RemoteObject.createImmutable(" &TimeAz="),service_server.mostCurrent._mcode._gpstimeaz /*RemoteObject*/ ,RemoteObject.createImmutable(" &TimeTa="),service_server.mostCurrent._mcode._gpstimeta /*RemoteObject*/ ,RemoteObject.createImmutable(" &Count="),service_server.mostCurrent._mcode._countshowgpsmap /*RemoteObject*/ )));
 BA.debugLineNum = 1363;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(262144);
_request(service_server._jobinternet);
 BA.debugLineNum = 1364;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpicftpforandroid() throws Exception{
try {
		Debug.PushSubsStack("GetPicFTPForAndroid (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1400);
if (RapidSub.canDelegate("getpicftpforandroid")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getpicftpforandroid");}
 BA.debugLineNum = 1400;BA.debugLine="Sub GetPicFTPForAndroid";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1401;BA.debugLine="jobInternet.JobName =\"GetPicFTPForAndroid\"";
Debug.ShouldStop(16777216);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetPicFTPForAndroid"));
 BA.debugLineNum = 1402;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(33554432);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetPicFTPForAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("CodeMoshtari="),service_server.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ,RemoteObject.createImmutable("&Type=kala"))));
 BA.debugLineNum = 1403;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(67108864);
_request(service_server._jobinternet);
 BA.debugLineNum = 1404;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getreportfactor(RemoteObject _dateaz,RemoteObject _dateta) throws Exception{
try {
		Debug.PushSubsStack("GetReportFactor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,917);
if (RapidSub.canDelegate("getreportfactor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getreportfactor", _dateaz, _dateta);}
Debug.locals.put("DateAz", _dateaz);
Debug.locals.put("DateTa", _dateta);
 BA.debugLineNum = 917;BA.debugLine="Sub GetReportFactor(DateAz As String,DateTa As Str";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 918;BA.debugLine="jobInternet.JobName =\"GetReportFactor\"";
Debug.ShouldStop(2097152);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetReportFactor"));
 BA.debugLineNum = 919;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(4194304);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetReportFactor"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeTafsili="),service_server.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateAz="),_dateaz,RemoteObject.createImmutable(" &DateTa="),_dateta)));
 BA.debugLineNum = 920;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(8388608);
_request(service_server._jobinternet);
 BA.debugLineNum = 921;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getreportfactorvisitor(RemoteObject _dateaz,RemoteObject _dateta) throws Exception{
try {
		Debug.PushSubsStack("GetReportFactorVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1314);
if (RapidSub.canDelegate("getreportfactorvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getreportfactorvisitor", _dateaz, _dateta);}
Debug.locals.put("DateAz", _dateaz);
Debug.locals.put("DateTa", _dateta);
 BA.debugLineNum = 1314;BA.debugLine="Sub GetReportFactorVisitor(DateAz As String,DateTa";
Debug.ShouldStop(2);
 BA.debugLineNum = 1318;BA.debugLine="jobInternet.JobName =\"GetReportFactorVisitor\"";
Debug.ShouldStop(32);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetReportFactorVisitor"));
 BA.debugLineNum = 1319;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(64);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetReportFactor2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._codevisitorselect /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateAz="),_dateaz,RemoteObject.createImmutable(" &DateTa="),_dateta)));
 BA.debugLineNum = 1320;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(128);
_request(service_server._jobinternet);
 BA.debugLineNum = 1321;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getreportmoshtari(RemoteObject _dateaz,RemoteObject _dateta) throws Exception{
try {
		Debug.PushSubsStack("GetReportMoshtari (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,897);
if (RapidSub.canDelegate("getreportmoshtari")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getreportmoshtari", _dateaz, _dateta);}
Debug.locals.put("DateAz", _dateaz);
Debug.locals.put("DateTa", _dateta);
 BA.debugLineNum = 897;BA.debugLine="Sub GetReportMoshtari(DateAz As String,DateTa As S";
Debug.ShouldStop(1);
 BA.debugLineNum = 898;BA.debugLine="jobInternet.JobName =\"GetReportMoshtari\"";
Debug.ShouldStop(2);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetReportMoshtari"));
 BA.debugLineNum = 899;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(4);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetReportMoshtari2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeTafsili="),service_server.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateAz="),_dateaz,RemoteObject.createImmutable(" &DateTa="),_dateta)));
 BA.debugLineNum = 900;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getreportrizepishfactor(RemoteObject _shomarefactor) throws Exception{
try {
		Debug.PushSubsStack("GetReportRizePishFactor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,944);
if (RapidSub.canDelegate("getreportrizepishfactor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getreportrizepishfactor", _shomarefactor);}
Debug.locals.put("ShomareFactor", _shomarefactor);
 BA.debugLineNum = 944;BA.debugLine="Sub GetReportRizePishFactor(ShomareFactor As Strin";
Debug.ShouldStop(32768);
 BA.debugLineNum = 945;BA.debugLine="jobInternet.JobName =\"GetReportRizePishFactor\"";
Debug.ShouldStop(65536);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetReportRizePishFactor"));
 BA.debugLineNum = 946;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(131072);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetReportRizePishFactor"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeTafsili="),service_server.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(" &fldShomarehFactor="),_shomarefactor)));
 BA.debugLineNum = 947;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(262144);
_request(service_server._jobinternet);
 BA.debugLineNum = 948;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("GetReportRizePishFactor3 (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,966);
if (RapidSub.canDelegate("getreportrizepishfactor3")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getreportrizepishfactor3");}
 BA.debugLineNum = 966;BA.debugLine="Sub GetReportRizePishFactor3";
Debug.ShouldStop(32);
 BA.debugLineNum = 967;BA.debugLine="jobInternet.JobName =\"GetReportRizePishFactor3\"";
Debug.ShouldStop(64);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetReportRizePishFactor3"));
 BA.debugLineNum = 968;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(128);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetRizReportFactor6"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 969;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(256);
_request(service_server._jobinternet);
 BA.debugLineNum = 970;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getreportrizfactorvisitor(RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("GetReportRizFactorVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1337);
if (RapidSub.canDelegate("getreportrizfactorvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getreportrizfactorvisitor", _date);}
Debug.locals.put("date", _date);
 BA.debugLineNum = 1337;BA.debugLine="Sub GetReportRizFactorVisitor(date As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1341;BA.debugLine="jobInternet.JobName =\"GetReportRizFactorVisitor\"";
Debug.ShouldStop(268435456);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetReportRizFactorVisitor"));
 BA.debugLineNum = 1342;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(536870912);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetRizReportFactor4"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(" &ShomareFactor="),service_server.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable(" &fldDate="),_date)));
 BA.debugLineNum = 1343;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(1073741824);
_request(service_server._jobinternet);
 BA.debugLineNum = 1344;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getreportvisitor(RemoteObject _dateaz,RemoteObject _dateta) throws Exception{
try {
		Debug.PushSubsStack("GetReportVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,876);
if (RapidSub.canDelegate("getreportvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getreportvisitor", _dateaz, _dateta);}
Debug.locals.put("DateAz", _dateaz);
Debug.locals.put("DateTa", _dateta);
 BA.debugLineNum = 876;BA.debugLine="Sub GetReportVisitor(DateAz As String,DateTa As St";
Debug.ShouldStop(2048);
 BA.debugLineNum = 877;BA.debugLine="jobInternet.JobName =\"GetReportVisitor\"";
Debug.ShouldStop(4096);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetReportVisitor"));
 BA.debugLineNum = 878;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8192);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetReportVisitor1"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateAz="),_dateaz,RemoteObject.createImmutable(" &DateTa="),_dateta)));
 BA.debugLineNum = 879;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(16384);
_request(service_server._jobinternet);
 BA.debugLineNum = 880;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsandoogh() throws Exception{
try {
		Debug.PushSubsStack("GetSandoogh (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1268);
if (RapidSub.canDelegate("getsandoogh")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getsandoogh");}
RemoteObject _dateupdate = RemoteObject.createImmutable("");
 BA.debugLineNum = 1268;BA.debugLine="Sub GetSandoogh";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1269;BA.debugLine="jobInternet.JobName =\"GetSandoogh\"";
Debug.ShouldStop(1048576);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetSandoogh"));
 BA.debugLineNum = 1270;BA.debugLine="Dim DateUpdate As String=\"\"";
Debug.ShouldStop(2097152);
_dateupdate = BA.ObjectToString("");Debug.locals.put("DateUpdate", _dateupdate);Debug.locals.put("DateUpdate", _dateupdate);
 BA.debugLineNum = 1271;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(4194304);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetStoredTozieFast"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NameStored=ShowListSandoogh"),RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&flag="),service_server.mostCurrent._mcode._gethavaleflag /*RemoteObject*/ ,RemoteObject.createImmutable("&LastDateUpdate="),_dateupdate)));
 BA.debugLineNum = 1272;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(8388608);
_request(service_server._jobinternet);
 BA.debugLineNum = 1273;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("GetSetting (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,82);
if (RapidSub.canDelegate("getsetting")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getsetting");}
 BA.debugLineNum = 82;BA.debugLine="Sub GetSetting";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="jobInternet.JobName =\"GetSetting\"";
Debug.ShouldStop(262144);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetSetting"));
 BA.debugLineNum = 84;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(524288);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetSetting"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(1048576);
_request(service_server._jobinternet);
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
public static RemoteObject  _getsoorathesab(RemoteObject _dateaz,RemoteObject _dateta) throws Exception{
try {
		Debug.PushSubsStack("GetSooratHesab (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1045);
if (RapidSub.canDelegate("getsoorathesab")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getsoorathesab", _dateaz, _dateta);}
Debug.locals.put("DateAz", _dateaz);
Debug.locals.put("DateTa", _dateta);
 BA.debugLineNum = 1045;BA.debugLine="Sub GetSooratHesab(DateAz As String,DateTa As Stri";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1049;BA.debugLine="jobInternet.JobName =\"GetSooratHesab\"";
Debug.ShouldStop(16777216);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetSooratHesab"));
 BA.debugLineNum = 1050;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(33554432);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/ShowSooratHesabNew"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeTafzili="),service_server.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(" &DateAz="),_dateaz,RemoteObject.createImmutable(" &DateTa="),_dateta)));
 BA.debugLineNum = 1051;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(67108864);
_request(service_server._jobinternet);
 BA.debugLineNum = 1052;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettanzimatandroid() throws Exception{
try {
		Debug.PushSubsStack("GetTanzimatAndroid (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,315);
if (RapidSub.canDelegate("gettanzimatandroid")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","gettanzimatandroid");}
 BA.debugLineNum = 315;BA.debugLine="Sub GetTanzimatAndroid";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 316;BA.debugLine="jobInternet.JobName =\"GetTanzimatAndroid\"";
Debug.ShouldStop(134217728);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetTanzimatAndroid"));
 BA.debugLineNum = 317;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(268435456);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=Select * From tblTanzimatAndroid"),RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 318;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(536870912);
_request(service_server._jobinternet);
 BA.debugLineNum = 319;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetTasvie (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,414);
if (RapidSub.canDelegate("gettasvie")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","gettasvie");}
 BA.debugLineNum = 414;BA.debugLine="Sub GetTasvie";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 415;BA.debugLine="jobInternet.JobName =\"GetTasvie\"";
Debug.ShouldStop(1073741824);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetTasvie"));
 BA.debugLineNum = 416;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(-2147483648);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=Select fldCode,fldName From tblTasvie"),RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 417;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(1);
_request(service_server._jobinternet);
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettourvisitor() throws Exception{
try {
		Debug.PushSubsStack("GetTourVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1068);
if (RapidSub.canDelegate("gettourvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","gettourvisitor");}
RemoteObject _date = RemoteObject.createImmutable("");
 BA.debugLineNum = 1068;BA.debugLine="Sub GetTourVisitor";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1069;BA.debugLine="jobInternet.JobName =\"GetTourVisitor\"";
Debug.ShouldStop(4096);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetTourVisitor"));
 BA.debugLineNum = 1070;BA.debugLine="Dim date As String=MCode.DatePersian";
Debug.ShouldStop(8192);
_date = service_server.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,service_server.processBA);Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 1071;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(16384);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetTourVisitor"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("&DateVisit="),_date)));
 BA.debugLineNum = 1072;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(32768);
_request(service_server._jobinternet);
 BA.debugLineNum = 1073;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvaziat() throws Exception{
try {
		Debug.PushSubsStack("GetVaziat (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,183);
if (RapidSub.canDelegate("getvaziat")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getvaziat");}
 BA.debugLineNum = 183;BA.debugLine="Sub GetVaziat";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="jobInternet.JobName =\"GetVaziat\"";
Debug.ShouldStop(8388608);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetVaziat"));
 BA.debugLineNum = 185;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(16777216);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetVaziat"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("fldTokenId="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 186;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(33554432);
_request(service_server._jobinternet);
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getversion(RemoteObject _strtype) throws Exception{
try {
		Debug.PushSubsStack("GetVersion (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1516);
if (RapidSub.canDelegate("getversion")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getversion", _strtype);}
Debug.locals.put("strType", _strtype);
 BA.debugLineNum = 1516;BA.debugLine="Public Sub GetVersion(strType As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1517;BA.debugLine="jobInternet.JobName =\"GetVersion\"";
Debug.ShouldStop(4096);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetVersion"));
 BA.debugLineNum = 1518;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8192);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/Version"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &Type="),_strtype)));
 BA.debugLineNum = 1519;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(16384);
_request(service_server._jobinternet);
 BA.debugLineNum = 1520;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvideoamoozesh() throws Exception{
try {
		Debug.PushSubsStack("GetVideoAmoozesh (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1380);
if (RapidSub.canDelegate("getvideoamoozesh")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getvideoamoozesh");}
 BA.debugLineNum = 1380;BA.debugLine="Sub GetVideoAmoozesh";
Debug.ShouldStop(8);
 BA.debugLineNum = 1381;BA.debugLine="jobInternet.JobName =\"GetVideoAmoozesh\"";
Debug.ShouldStop(16);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetVideoAmoozesh"));
 BA.debugLineNum = 1382;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(32);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetVideoAmoozesh"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 1383;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(64);
_request(service_server._jobinternet);
 BA.debugLineNum = 1384;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvisitor() throws Exception{
try {
		Debug.PushSubsStack("GetVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1141);
if (RapidSub.canDelegate("getvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","getvisitor");}
 BA.debugLineNum = 1141;BA.debugLine="Sub GetVisitor";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1142;BA.debugLine="jobInternet.JobName =\"GetVisitor\"";
Debug.ShouldStop(2097152);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetVisitor"));
 BA.debugLineNum = 1143;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(4194304);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query=select FldC_Visitor,FldN_Visitor from TblSetting where len(FldImei)>5 "),RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 1144;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(8388608);
_request(service_server._jobinternet);
 BA.debugLineNum = 1145;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetallnotification(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetAllNotification (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,660);
if (RapidSub.canDelegate("loadgetallnotification")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetallnotification", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 660;BA.debugLine="Sub LoadGetAllNotification(Str As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 661;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 662;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(2097152);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 663;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(4194304);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 664;BA.debugLine="MCode.SaveUpdate(\"Delete From TblNotifi\")";
Debug.ShouldStop(8388608);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblNotifi")));
 BA.debugLineNum = 665;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(16777216);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 666;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(33554432);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 668;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(134217728);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 669;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(268435456);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 670;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblNotifi (Id,FldT";
Debug.ShouldStop(536870912);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblNotifi (Id,FldTitle,FldBody,FldDate,FldTime) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Id")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTitle")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBody")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTime")))),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 672;BA.debugLine="Log(Row.Get(\"fldTitle\"))";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58912908",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTitle"))))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 674;BA.debugLine="Log(\"نوتیفیکیشن بروزرسانی گردید\")";
Debug.ShouldStop(2);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58912910",RemoteObject.createImmutable("نوتیفیکیشن بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e14.toString()); BA.debugLineNum = 676;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58912912",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 677;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(16);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetAllNotification")));
 };
 BA.debugLineNum = 679;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("LoadGetAshkhas (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,270);
if (RapidSub.canDelegate("loadgetashkhas")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetashkhas", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _count = RemoteObject.createImmutable(0);
Debug.locals.put("Str", _str);
 BA.debugLineNum = 270;BA.debugLine="Sub LoadGetAshkhas(Str As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 271;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 272;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(32768);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 275;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(262144);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 276;BA.debugLine="Row.Initialize";
Debug.ShouldStop(524288);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 277;BA.debugLine="Dim Cu As  Cursor";
Debug.ShouldStop(1048576);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 279;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(4194304);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 280;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(8388608);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 289;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas where l";
Debug.ShouldStop(1);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblAshkhas where length(fldCodetafzili)<6")));
 BA.debugLineNum = 290;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblAshkhas\",RowsLi";
Debug.ShouldStop(2);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblAshkhas")),(Object)(_rowslist));
 BA.debugLineNum = 291;BA.debugLine="Cu=MCode.Result(\"Select * From TblAshkhas\")";
Debug.ShouldStop(4);
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Select * From TblAshkhas")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 292;BA.debugLine="Log(\"لیست اشخاص بروزرسانی گردید\")";
Debug.ShouldStop(8);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57340054",RemoteObject.createImmutable("لیست اشخاص بروزرسانی گردید"),0);
 BA.debugLineNum = 295;BA.debugLine="Cu=MCode.Result(\"Select * From TblAshkhas where";
Debug.ShouldStop(64);
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Select * From TblAshkhas where length(fldCodetafzili)>5")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 296;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(128);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 297;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(256);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 298;BA.debugLine="Log(Cu.GetString(\"fldCodetafzili\"))";
Debug.ShouldStop(512);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57340060",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili"))),0);
 BA.debugLineNum = 299;BA.debugLine="Log(Cu.GetString(\"fldCodeMovaghat\"))";
Debug.ShouldStop(1024);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57340061",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeMovaghat"))),0);
 BA.debugLineNum = 300;BA.debugLine="Dim count As Int=MCode.SingleResult(\"Select cou";
Debug.ShouldStop(2048);
_count = BA.numberCast(int.class, service_server.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select count(fldCodetafzili) From TblAshkhas where fldCodeMovaghat='"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili"))),RemoteObject.createImmutable("'")))));Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 301;BA.debugLine="If count > 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 302;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas where";
Debug.ShouldStop(8192);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblAshkhas where fldCodetafzili='"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili"))),RemoteObject.createImmutable("'"))));
 };
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e23.toString()); BA.debugLineNum = 310;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57340072",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 311;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(4194304);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetAshkhas")));
 };
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetbankma(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetBankMa (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1229);
if (RapidSub.canDelegate("loadgetbankma")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetbankma", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1229;BA.debugLine="Sub LoadGetBankMa(Str As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1230;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 1231;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(16384);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1233;BA.debugLine="MCode.SaveUpdate(\"Delete From TblBankMa\")";
Debug.ShouldStop(65536);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblBankMa")));
 BA.debugLineNum = 1234;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(131072);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1235;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(262144);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1236;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblBankMa\",RowsLi";
Debug.ShouldStop(524288);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblBankMa")),(Object)(_rowslist));
 BA.debugLineNum = 1237;BA.debugLine="Log(\"لیست بانک ما دریافت گردید\")";
Debug.ShouldStop(1048576);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510878984",RemoteObject.createImmutable("لیست بانک ما دریافت گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e9.toString()); BA.debugLineNum = 1240;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510878987",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1241;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(16777216);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetBankMa")));
 };
 BA.debugLineNum = 1243;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetbankmoshtari(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetBankMoshtari (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1252);
if (RapidSub.canDelegate("loadgetbankmoshtari")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetbankmoshtari", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1252;BA.debugLine="Sub LoadGetBankMoshtari(Str As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 1253;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 1254;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(32);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1256;BA.debugLine="MCode.SaveUpdate(\"Delete From TblBankMoshtari\")";
Debug.ShouldStop(128);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblBankMoshtari")));
 BA.debugLineNum = 1257;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(256);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1258;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(512);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1259;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblBankMoshtari\",";
Debug.ShouldStop(1024);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblBankMoshtari")),(Object)(_rowslist));
 BA.debugLineNum = 1260;BA.debugLine="Log(\"لیست بانک مشتری دریافت گردید\")";
Debug.ShouldStop(2048);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511010056",RemoteObject.createImmutable("لیست بانک مشتری دریافت گردید"),0);
 BA.debugLineNum = 1261;BA.debugLine="ToastMessageShow(\"لیست بانک مشتری دریافت گردید\",";
Debug.ShouldStop(4096);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لیست بانک مشتری دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e10.toString()); BA.debugLineNum = 1263;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511010059",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1264;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(32768);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetBankMoshtari")));
 };
 BA.debugLineNum = 1266;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetcheckdaryaft(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetCheckDaryaft (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,618);
if (RapidSub.canDelegate("loadgetcheckdaryaft")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetcheckdaryaft", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 618;BA.debugLine="Sub LoadGetCheckDaryaft(Str As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 619;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 620;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(2048);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 621;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(4096);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 622;BA.debugLine="MCode.SaveUpdate(\"Delete From TblCheckDaryafti\")";
Debug.ShouldStop(8192);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblCheckDaryafti")));
 BA.debugLineNum = 623;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(16384);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 624;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(32768);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 626;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(131072);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 627;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(262144);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 628;BA.debugLine="MCode.SaveUpdate(\"insert into TblCheckDaryafti(";
Debug.ShouldStop(524288);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("insert into TblCheckDaryafti(fldShomareCheck,fldShomareHesab,fldShomareDaryaft,fldMablagh,fldShobe,fldSharh,fldDate,fldDateSarResid,fldCodeBank,fldCodeSahebeCheck,fldShomareFactor,fldCodeVaste,fldSend) values('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareCheck")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareHesab")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareDaryaft")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMablagh")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShobe")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharh")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDateSarResid")))),RemoteObject.createImmutable(""),RemoteObject.createImmutable("',"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeBank")))),RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeSahebeCheck")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactor")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeVaste")))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",1"),RemoteObject.createImmutable(")"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 643;BA.debugLine="Log(\"دریافت بروزرسانی گردید\")";
Debug.ShouldStop(4);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58781849",RemoteObject.createImmutable("دریافت بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e13.toString()); BA.debugLineNum = 645;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58781851",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 646;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(32);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetGetDaryaft")));
 };
 BA.debugLineNum = 651;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetdaftarchtell(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetDaftarchTell (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1528);
if (RapidSub.canDelegate("loadgetdaftarchtell")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetdaftarchtell", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1528;BA.debugLine="Sub LoadGetDaftarchTell(Str As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1529;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 1530;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(33554432);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1532;BA.debugLine="MCode.SaveUpdate(\"Delete From tblDaftarcheTell\")";
Debug.ShouldStop(134217728);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblDaftarcheTell")));
 BA.debugLineNum = 1533;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(268435456);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1534;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(536870912);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1535;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblDaftarcheTell\"";
Debug.ShouldStop(1073741824);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("tblDaftarcheTell")),(Object)(_rowslist));
 BA.debugLineNum = 1536;BA.debugLine="Log(\"دفترچه تلفن بروزرسانی گردید\")";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512648456",RemoteObject.createImmutable("دفترچه تلفن بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e9.toString()); BA.debugLineNum = 1538;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512648458",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1539;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(4);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetDaftarchTell")));
 };
 BA.debugLineNum = 1541;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetdaryaft(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetDaryaft (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,584);
if (RapidSub.canDelegate("loadgetdaryaft")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetdaryaft", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 584;BA.debugLine="Sub LoadGetDaryaft(Str As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 585;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 586;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(512);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 587;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(1024);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 588;BA.debugLine="MCode.SaveUpdate(\"Delete From TblDaryaft\")";
Debug.ShouldStop(2048);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblDaryaft")));
 BA.debugLineNum = 589;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(4096);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 590;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(8192);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 591;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblDaryaft\",RowsL";
Debug.ShouldStop(16384);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblDaryaft")),(Object)(_rowslist));
 BA.debugLineNum = 602;BA.debugLine="Log(\"دریافت بروزرسانی گردید\")";
Debug.ShouldStop(33554432);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58650770",RemoteObject.createImmutable("دریافت بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e10.toString()); BA.debugLineNum = 604;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58650772",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 605;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(268435456);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetGetDaryaft")));
 };
 BA.debugLineNum = 610;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("LoadGetEshantion (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,513);
if (RapidSub.canDelegate("loadgeteshantion")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgeteshantion", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 513;BA.debugLine="Sub LoadGetEshantion(Str As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 514;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 515;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(4);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 517;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionVisitor";
Debug.ShouldStop(16);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblEshantionVisitori")));
 BA.debugLineNum = 518;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(32);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 519;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(64);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 520;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblEshantionVisito";
Debug.ShouldStop(128);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("tblEshantionVisitori")),(Object)(_rowslist));
 BA.debugLineNum = 527;BA.debugLine="Log(\"اشانتیون بروزرسانی گردید\")";
Debug.ShouldStop(16384);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58257550",RemoteObject.createImmutable("اشانتیون بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e9.toString()); BA.debugLineNum = 529;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58257552",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 530;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(131072);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetEshantion")));
 };
 BA.debugLineNum = 534;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgeteshantion2(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetEshantion2 (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,542);
if (RapidSub.canDelegate("loadgeteshantion2")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgeteshantion2", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 542;BA.debugLine="Sub LoadGetEshantion2(Str As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 543;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 544;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(-2147483648);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 546;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionTabagh";
Debug.ShouldStop(2);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblEshantionTabaghati")));
 BA.debugLineNum = 547;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(4);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 548;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(8);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 549;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblEshantionTabag";
Debug.ShouldStop(16);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("tblEshantionTabaghati")),(Object)(_rowslist));
 BA.debugLineNum = 550;BA.debugLine="Log(\"اشانتیون بروزرسانی گردید\")";
Debug.ShouldStop(32);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58388616",RemoteObject.createImmutable("اشانتیون بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e9.toString()); BA.debugLineNum = 552;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58388618",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 553;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(256);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetEshantion2")));
 };
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgeteshantiongroup(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetEshantionGroup (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,563);
if (RapidSub.canDelegate("loadgeteshantiongroup")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgeteshantiongroup", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 563;BA.debugLine="Sub LoadGetEshantionGroup(Str As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 564;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 565;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(1048576);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 567;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionGroup\"";
Debug.ShouldStop(4194304);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblEshantionGroup")));
 BA.debugLineNum = 568;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(8388608);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 569;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(16777216);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 570;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblEshantionGroup";
Debug.ShouldStop(33554432);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("tblEshantionGroup")),(Object)(_rowslist));
 BA.debugLineNum = 571;BA.debugLine="Log(\"اشانتیون گروهی بروزرسانی گردید\")";
Debug.ShouldStop(67108864);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58519688",RemoteObject.createImmutable("اشانتیون گروهی بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e9.toString()); BA.debugLineNum = 573;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58519690",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 574;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(536870912);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetEshantionGroup")));
 };
 BA.debugLineNum = 576;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("LoadGetFee (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,357);
if (RapidSub.canDelegate("loadgetfee")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetfee", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 357;BA.debugLine="Sub LoadGetFee(Str As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 358;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 359;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(64);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 361;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFee\")";
Debug.ShouldStop(256);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblFee")));
 BA.debugLineNum = 362;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(512);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 363;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(1024);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 364;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFee\",RowsList)";
Debug.ShouldStop(2048);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblFee")),(Object)(_rowslist));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e8.toString()); BA.debugLineNum = 366;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57602185",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 367;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(16384);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetFee")));
 };
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("LoadGetGalleryKala (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,480);
if (RapidSub.canDelegate("loadgetgallerykala")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetgallerykala", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 480;BA.debugLine="Sub LoadGetGalleryKala(Str As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 481;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 482;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(2);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 483;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(4);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 484;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGalleryPic\")";
Debug.ShouldStop(8);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGalleryPic")));
 BA.debugLineNum = 485;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(16);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 486;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(32);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 488;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(128);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 489;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(256);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 490;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGalleryPic (fld";
Debug.ShouldStop(512);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGalleryPic (fldCodeKala,fldImageNumber,fldImage,fldShow) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldImageNumber")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldImage")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShow")))),RemoteObject.createImmutable("')"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 494;BA.debugLine="Log(\"گالری تصاویر بروزرسانی گردید\")";
Debug.ShouldStop(8192);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58126478",RemoteObject.createImmutable("گالری تصاویر بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e13.toString()); BA.debugLineNum = 496;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58126480",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 497;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(65536);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetGalleryKala")));
 };
 BA.debugLineNum = 500;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("LoadGetGetHavale (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1198);
if (RapidSub.canDelegate("loadgetgethavale")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetgethavale", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1198;BA.debugLine="Sub LoadGetGetHavale(Str As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1199;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 1200;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(32768);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1202;BA.debugLine="MCode.SaveUpdate(\"Delete From TblHavale\")";
Debug.ShouldStop(131072);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblHavale")));
 BA.debugLineNum = 1203;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(262144);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1204;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(524288);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1205;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblHavale\",RowsLi";
Debug.ShouldStop(1048576);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblHavale")),(Object)(_rowslist));
 BA.debugLineNum = 1213;BA.debugLine="Log(\"لیست حواله بروزرسانی گردید\")";
Debug.ShouldStop(268435456);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510747919",RemoteObject.createImmutable("لیست حواله بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e9.toString()); BA.debugLineNum = 1216;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510747922",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1217;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(1);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetVisitor")));
 };
 BA.debugLineNum = 1220;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("LoadGetGoroohAshkhas (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,447);
if (RapidSub.canDelegate("loadgetgoroohashkhas")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetgoroohashkhas", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 447;BA.debugLine="Sub LoadGetGoroohAshkhas(Str As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 448;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 449;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(1);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 450;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(2);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 451;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohAshkhas\")";
Debug.ShouldStop(4);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGoroohAshkhas")));
 BA.debugLineNum = 452;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
Debug.ShouldStop(8);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 453;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(16);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 455;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(64);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 456;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(128);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 457;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohAshkhas (";
Debug.ShouldStop(256);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName")))),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 459;BA.debugLine="Log(Row.Get(\"fldGroupName\"))";
Debug.ShouldStop(1024);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57995404",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName"))))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 461;BA.debugLine="Log(\"گروه اشخاص بروزرسانی گردید\")";
Debug.ShouldStop(4096);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57995406",RemoteObject.createImmutable("گروه اشخاص بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e14.toString()); BA.debugLineNum = 463;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57995408",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 464;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(32768);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetGoroohAshkhas")));
 };
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("LoadGetGoroohKala (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,389);
if (RapidSub.canDelegate("loadgetgoroohkala")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetgoroohkala", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 389;BA.debugLine="Sub LoadGetGoroohKala(Str As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 390;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 391;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(64);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 392;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(128);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 393;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohKala\")";
Debug.ShouldStop(256);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGoroohKala")));
 BA.debugLineNum = 394;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(512);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 395;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(1024);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 397;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(4096);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 398;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(8192);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 399;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGoroohKala (Fld";
Debug.ShouldStop(16384);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupId")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName")))),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 401;BA.debugLine="Log(\"fldGroupName:\"&Row.Get(\"fldGroupName\"))";
Debug.ShouldStop(65536);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57733260",RemoteObject.concat(RemoteObject.createImmutable("fldGroupName:"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGroupName"))))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 403;BA.debugLine="Log(\"گروه کالا بروزرسانی گردید\")";
Debug.ShouldStop(262144);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57733262",RemoteObject.createImmutable("گروه کالا بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e14.toString()); BA.debugLineNum = 406;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57733265",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 407;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(4194304);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetGoroohKala")));
 };
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetgroupdastrasiashkhas(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetGroupDastrasiAshkhas (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1549);
if (RapidSub.canDelegate("loadgetgroupdastrasiashkhas")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetgroupdastrasiashkhas", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1549;BA.debugLine="Sub LoadGetGroupDastrasiAshkhas(Str As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1550;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 1551;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(16384);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1553;BA.debugLine="MCode.SaveUpdate(\"Delete From tblGroupDastrasi\")";
Debug.ShouldStop(65536);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblGroupDastrasi")));
 BA.debugLineNum = 1554;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(131072);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1555;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(262144);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1556;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblGroupDastrasi\"";
Debug.ShouldStop(524288);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("tblGroupDastrasi")),(Object)(_rowslist));
 BA.debugLineNum = 1557;BA.debugLine="Log(\"دسترسی گروه اشخاص بروزرسانی گردید\")";
Debug.ShouldStop(1048576);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512779528",RemoteObject.createImmutable("دسترسی گروه اشخاص بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e9.toString()); BA.debugLineNum = 1559;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512779530",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1560;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(8388608);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetGroupDastrasiAshkhas")));
 };
 BA.debugLineNum = 1562;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("LoadGetKala (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,226);
if (RapidSub.canDelegate("loadgetkala")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetkala", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 226;BA.debugLine="Sub LoadGetKala(Str As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 228;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(8);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 229;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(16);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 230;BA.debugLine="Dim Cu As  Cursor";
Debug.ShouldStop(32);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 231;BA.debugLine="Row.Initialize";
Debug.ShouldStop(64);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 233;BA.debugLine="MCode.SaveUpdate(\"Delete From TblKala\")";
Debug.ShouldStop(256);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblKala")));
 BA.debugLineNum = 234;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
Debug.ShouldStop(512);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 235;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(1024);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 236;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblKala\",RowsList";
Debug.ShouldStop(2048);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblKala")),(Object)(_rowslist));
 BA.debugLineNum = 237;BA.debugLine="If MCode.PicOnline=0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",service_server.mostCurrent._mcode._piconline /*RemoteObject*/ ,BA.NumberToString(0))) { 
 };
 BA.debugLineNum = 254;BA.debugLine="Cu=MCode.Result(\"Select * From TblKala\")";
Debug.ShouldStop(536870912);
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Select * From TblKala")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 255;BA.debugLine="Log(\"لیست کالا بروزرسانی گردید\")";
Debug.ShouldStop(1073741824);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57208989",RemoteObject.createImmutable("لیست کالا بروزرسانی گردید"),0);
 BA.debugLineNum = 256;BA.debugLine="ToastMessageShow(\"لیست کالا بروزرسانی گردید: \" &";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("لیست کالا بروزرسانی گردید: "),_cu.runMethod(true,"getRowCount")))),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e16.toString()); BA.debugLineNum = 258;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57208992",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 259;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(4);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetKala")));
 };
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetlistgpsvisitor(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetListGpsVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1366);
if (RapidSub.canDelegate("loadgetlistgpsvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetlistgpsvisitor", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1366;BA.debugLine="Sub LoadGetListGpsVisitor(Str As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1367;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 1368;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(8388608);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1369;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(16777216);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1370;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(33554432);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1372;BA.debugLine="CallSubDelayed2(Act_LocationVisitor,\"LoadData\",Ro";
Debug.ShouldStop(134217728);
service_server.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",service_server.processBA,(Object)((service_server.mostCurrent._act_locationvisitor.getObject())),(Object)(BA.ObjectToString("LoadData")),(Object)((_rowslist)));
 BA.debugLineNum = 1373;BA.debugLine="ToastMessageShow(\"مسیر حرکت ویزیتور با موفقیت در";
Debug.ShouldStop(268435456);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مسیر حرکت ویزیتور با موفقیت دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e8.toString()); BA.debugLineNum = 1375;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511665417",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1376;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetReportRizFactorVisitor")));
 };
 BA.debugLineNum = 1378;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetpicftpforandroid(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetPicFTPForAndroid (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1406);
if (RapidSub.canDelegate("loadgetpicftpforandroid")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetpicftpforandroid", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1406;BA.debugLine="Sub LoadGetPicFTPForAndroid(Str As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1407;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 1408;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(-2147483648);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1409;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(1);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1410;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(2);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1411;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(4);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1413;BA.debugLine="Row=RowsList.Get(0)";
Debug.ShouldStop(16);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1414;BA.debugLine="MCode.SaveUpdate(\"Update TblSetting Set FldLinkP";
Debug.ShouldStop(32);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set FldLinkPicKala='"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldLink")))),RemoteObject.createImmutable("' where FldId=1"))));
 BA.debugLineNum = 1415;BA.debugLine="MCode.ImageUrl=Row.Get(\"fldLink\")";
Debug.ShouldStop(64);
service_server.mostCurrent._mcode._imageurl /*RemoteObject*/  = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldLink")))));
 BA.debugLineNum = 1416;BA.debugLine="Log(MCode.ImageUrl)";
Debug.ShouldStop(128);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511927562",service_server.mostCurrent._mcode._imageurl /*RemoteObject*/ ,0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e11.toString()); BA.debugLineNum = 1418;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511927564",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1419;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(1024);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetPicFTPForAndroid")));
 };
 BA.debugLineNum = 1421;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetreportfactor(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetReportFactor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,923);
if (RapidSub.canDelegate("loadgetreportfactor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetreportfactor", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 923;BA.debugLine="Sub LoadGetReportFactor(Str As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 924;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 925;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(268435456);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 926;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(536870912);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 927;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(1073741824);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 930;BA.debugLine="If MCode.page=\"Act_ReportVisitor\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",service_server.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_ReportVisitor"))) { 
 BA.debugLineNum = 931;BA.debugLine="CallSubDelayed2(Act_ReportVisitor,\"LoadFactor\",R";
Debug.ShouldStop(4);
service_server.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",service_server.processBA,(Object)((service_server.mostCurrent._act_reportvisitor.getObject())),(Object)(BA.ObjectToString("LoadFactor")),(Object)((_rowslist)));
 }else 
{ BA.debugLineNum = 932;BA.debugLine="Else If MCode.page=\"Act_RepFactors\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",service_server.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_RepFactors"))) { 
 BA.debugLineNum = 933;BA.debugLine="CallSubDelayed2(Act_RepFactors,\"LoadData\",RowsLi";
Debug.ShouldStop(16);
service_server.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",service_server.processBA,(Object)((service_server.mostCurrent._act_repfactors.getObject())),(Object)(BA.ObjectToString("LoadData")),(Object)((_rowslist)));
 }}
;
 BA.debugLineNum = 936;BA.debugLine="ToastMessageShow(\"گزارش مشتری با موفقیت دریافت گ";
Debug.ShouldStop(128);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارش مشتری با موفقیت دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e12.toString()); BA.debugLineNum = 938;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59830415",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 939;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(1024);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetReportFactor")));
 };
 BA.debugLineNum = 941;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
service_server.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 942;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetreportfactorvisitor(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetReportFactorVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1323);
if (RapidSub.canDelegate("loadgetreportfactorvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetreportfactorvisitor", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1323;BA.debugLine="Sub LoadGetReportFactorVisitor(Str As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1324;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 1325;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(4096);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1326;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(8192);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1327;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(16384);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1329;BA.debugLine="CallSubDelayed2(Act_RepFactorVisitor,\"CreateList\"";
Debug.ShouldStop(65536);
service_server.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",service_server.processBA,(Object)((service_server.mostCurrent._act_repfactorvisitor.getObject())),(Object)(BA.ObjectToString("CreateList")),(Object)((_rowslist)));
 BA.debugLineNum = 1330;BA.debugLine="ToastMessageShow(\"گزارش سفارش ویزیتور با موفقیت";
Debug.ShouldStop(131072);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارش سفارش ویزیتور با موفقیت دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e8.toString()); BA.debugLineNum = 1332;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511403273",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1333;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(1048576);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetReportFactorVisitor")));
 };
 BA.debugLineNum = 1335;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetreportmoshtari(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetReportMoshtari (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,902);
if (RapidSub.canDelegate("loadgetreportmoshtari")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetreportmoshtari", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 902;BA.debugLine="Sub LoadGetReportMoshtari(Str As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 903;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 904;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(128);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 905;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(256);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 906;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(512);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 910;BA.debugLine="ToastMessageShow(\"گزارش مشتری با موفقیت دریافت گ";
Debug.ShouldStop(8192);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارش مشتری با موفقیت دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e7.toString()); BA.debugLineNum = 912;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59699338",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 913;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(65536);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetReportMoshtari")));
 };
 BA.debugLineNum = 915;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetreportrizepishfactor(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetReportRizePishFactor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,950);
if (RapidSub.canDelegate("loadgetreportrizepishfactor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetreportrizepishfactor", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 950;BA.debugLine="Sub LoadGetReportRizePishFactor(Str As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 951;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 952;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(8388608);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 953;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(16777216);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 954;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(33554432);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 957;BA.debugLine="CallSubDelayed2(Act_RizFaktor,\"LoadData\",RowsList";
Debug.ShouldStop(268435456);
service_server.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",service_server.processBA,(Object)((service_server.mostCurrent._act_rizfaktor.getObject())),(Object)(BA.ObjectToString("LoadData")),(Object)((_rowslist)));
 BA.debugLineNum = 958;BA.debugLine="ToastMessageShow(\"گزارش فاکتور مشتری با موفقیت د";
Debug.ShouldStop(536870912);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارش فاکتور مشتری با موفقیت دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e8.toString()); BA.debugLineNum = 960;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59961482",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 961;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(1);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetReportRizePishFactor")));
 };
 BA.debugLineNum = 964;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("LoadGetReportRizePishFactor3 (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,972);
if (RapidSub.canDelegate("loadgetreportrizepishfactor3")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetreportrizepishfactor3", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 972;BA.debugLine="Sub LoadGetReportRizePishFactor3(Str As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 973;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 974;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(8192);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 975;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(16384);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 976;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(32768);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 977;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(65536);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 978;BA.debugLine="Dim lst As List";
Debug.ShouldStop(131072);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 979;BA.debugLine="lst.Initialize";
Debug.ShouldStop(262144);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 980;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor where Fl";
Debug.ShouldStop(524288);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblFaktor where FldSync='True'")));
 BA.debugLineNum = 981;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(1048576);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 982;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(2097152);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 985;BA.debugLine="If Row.Get(\"fldTedadJoz\")>0 Or Row.Get(\"fldTedad";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz"))))),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 988;BA.debugLine="Dim m As Map";
Debug.ShouldStop(134217728);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 989;BA.debugLine="m.Initialize";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 990;BA.debugLine="m.Put(\"FldRadif\",Row.Get(\"fldRadif\"))";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldRadif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldRadif"))))));
 BA.debugLineNum = 991;BA.debugLine="m.Put(\"FldC_Visitor\",Row.Get(\"fldCodeVasete\"))";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Visitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeVasete"))))));
 BA.debugLineNum = 992;BA.debugLine="m.Put(\"FldC_Tafzili\",Row.Get(\"fldCodeTafsili\"))";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Tafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeTafsili"))))));
 BA.debugLineNum = 993;BA.debugLine="m.Put(\"FldN_Tafzili\",Row.Get(\"fldSharheTafzili\"";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldN_Tafzili"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharheTafzili"))))));
 BA.debugLineNum = 994;BA.debugLine="m.Put(\"FldShomareFaktor\",Row.Get(\"fldShomareFac";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareFaktor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactor"))))));
 BA.debugLineNum = 995;BA.debugLine="m.Put(\"FldShomareBargasht\",Row.Get(\"fldShomareB";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareBargasht"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareBargasht"))))));
 BA.debugLineNum = 996;BA.debugLine="m.Put(\"FldCodeKala\",Row.Get(\"fldCodeKala\"))";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCodeKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))));
 BA.debugLineNum = 997;BA.debugLine="m.Put(\"FldNameKala\",Row.Get(\"fldSharhKala\"))";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharhKala"))))));
 BA.debugLineNum = 998;BA.debugLine="m.Put(\"FldFeeForoosh\",Row.Get(\"fldFeeJoz\"))";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldFeeForoosh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeJoz"))))));
 BA.debugLineNum = 999;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Row.Get(\"fldFeeBadAz";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldFeeBadAzTakhfif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeBadAzTakhfif"))))));
 BA.debugLineNum = 1000;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Row.Get(\"fldMablaghTa";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfif"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMablaghTakhfif"))))));
 BA.debugLineNum = 1001;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Row.Get(\"fldTedadJo";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadJoz"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz"))))));
 BA.debugLineNum = 1002;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Row.Get(\"fldTedadCa";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))));
 BA.debugLineNum = 1003;BA.debugLine="m.Put(\"FldTedadDarkarton\",Row.Get(\"FldTedadDarK";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarkarton"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTedadDarKarton"))))));
 BA.debugLineNum = 1004;BA.debugLine="m.Put(\"FldTotalFaktor\",Row.Get(\"FldTotalFaktor\"";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTotalFaktor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTotalFaktor"))))));
 BA.debugLineNum = 1005;BA.debugLine="m.Put(\"FldTozihat\",Row.Get(\"fldTozihatRecord\"))";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozihat"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTozihatRecord"))))));
 BA.debugLineNum = 1006;BA.debugLine="m.Put(\"FldTozih\",Row.Get(\"FldTozihat\"))";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozih"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTozihat"))))));
 BA.debugLineNum = 1007;BA.debugLine="m.Put(\"FldNameVahed\",Row.Get(\"fldNameVahed1\"))";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameVahed"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNameVahed1"))))));
 BA.debugLineNum = 1008;BA.debugLine="m.Put(\"FldNameVahed2\",Row.Get(\"fldNameVahed2\"))";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameVahed2"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNameVahed2"))))));
 BA.debugLineNum = 1009;BA.debugLine="m.Put(\"FldVaziatPardakht\",Row.Get(\"fldNahveTasv";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVaziatPardakht"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNahveTasvie"))))));
 BA.debugLineNum = 1010;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",Row.Get(\"FldMablag";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfifKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldMablaghTakhfifKol"))))));
 BA.debugLineNum = 1011;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",Row.Get(\"FldS";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifVizhe"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSumMablaghTakhfifVizhe"))))));
 BA.debugLineNum = 1012;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",Row.Get(\"FldSu";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSumMablaghTakhfifKala"))))));
 BA.debugLineNum = 1013;BA.debugLine="m.Put(\"FldMablaghKol\",Row.Get(\"FldTotalFaktor\")";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghKol"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTotalFaktor"))))));
 BA.debugLineNum = 1014;BA.debugLine="m.Put(\"FldDate\",Row.Get(\"fldDate\"))";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDate"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate"))))));
 BA.debugLineNum = 1015;BA.debugLine="m.Put(\"FldTime\",Row.Get(\"fldTime\"))";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTime"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTime"))))));
 BA.debugLineNum = 1016;BA.debugLine="m.Put(\"FldSignatureBitmapString\",Row.Get(\"FldSi";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSignatureBitmapString"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSignatureBitmapString"))))));
 BA.debugLineNum = 1017;BA.debugLine="m.Put(\"fldArzeshAfzode\",Row.Get(\"fldArzeshAfzod";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldArzeshAfzode"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldArzeshAfzode"))))));
 BA.debugLineNum = 1018;BA.debugLine="m.Put(\"fldDarsadArzeshAfzode\",Row.Get(\"fldDarsa";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldDarsadArzeshAfzode"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDarsadArzeshAfzode"))))));
 BA.debugLineNum = 1019;BA.debugLine="m.Put(\"FldSync\",\"True\")";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSync"))),(Object)((RemoteObject.createImmutable("True"))));
 BA.debugLineNum = 1021;BA.debugLine="If myCode.Is_Null_adad(Row.Get(\"fldShomareBarga";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, service_server.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,service_server.processBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareBargasht")))))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1022;BA.debugLine="m.Put(\"WIsBacked\",\"True\")";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WIsBacked"))),(Object)((RemoteObject.createImmutable("True"))));
 }else {
 BA.debugLineNum = 1024;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WIsBacked"))),(Object)((RemoteObject.createImmutable("False"))));
 };
 BA.debugLineNum = 1027;BA.debugLine="m.Put(\"FldType\",Row.Get(\"fldType\"))";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldType"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldType"))))));
 BA.debugLineNum = 1028;BA.debugLine="m.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAmani"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldAmani"))))));
 BA.debugLineNum = 1029;BA.debugLine="m.Put(\"fldShomareForoosh\",Row.Get(\"fldShomareFo";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareForoosh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareForoosh"))))));
 BA.debugLineNum = 1030;BA.debugLine="m.Put(\"WSendFrom\",3)";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WSendFrom"))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 1031;BA.debugLine="Log(\"fldShomareFactor: \"&Row.Get(\"fldShomareFa";
Debug.ShouldStop(64);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510092603",RemoteObject.concat(RemoteObject.createImmutable("fldShomareFactor: "),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactor"))))),0);
 BA.debugLineNum = 1032;BA.debugLine="lst.Add(m)";
Debug.ShouldStop(128);
_lst.runVoidMethod ("Add",(Object)((_m.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1036;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFaktor\",lst)";
Debug.ShouldStop(2048);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblFaktor")),(Object)(_lst));
 BA.debugLineNum = 1038;BA.debugLine="Log(\"لیست سفارشات بروزرسانی گردید\")";
Debug.ShouldStop(8192);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510092610",RemoteObject.createImmutable("لیست سفارشات بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e60) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e60.toString()); BA.debugLineNum = 1040;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510092612",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1041;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(65536);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetReportRizePishFactor")));
 };
 BA.debugLineNum = 1043;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetreportrizfactorvisitor(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetReportRizFactorVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1346);
if (RapidSub.canDelegate("loadgetreportrizfactorvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetreportrizfactorvisitor", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1346;BA.debugLine="Sub LoadGetReportRizFactorVisitor(Str As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1347;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 1348;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(8);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1349;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(16);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1350;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(32);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1352;BA.debugLine="CallSubDelayed2(Act_RepRizFactorVisitor,\"LoadData";
Debug.ShouldStop(128);
service_server.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",service_server.processBA,(Object)((service_server.mostCurrent._act_reprizfactorvisitor.getObject())),(Object)(BA.ObjectToString("LoadData")),(Object)((_rowslist)));
 BA.debugLineNum = 1353;BA.debugLine="ToastMessageShow(\"گزارش سفارش ویزیتور با موفقیت";
Debug.ShouldStop(256);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارش سفارش ویزیتور با موفقیت دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e8.toString()); BA.debugLineNum = 1355;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511534345",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1356;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(2048);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetReportRizFactorVisitor")));
 };
 BA.debugLineNum = 1358;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetreportvisitor(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetReportVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,882);
if (RapidSub.canDelegate("loadgetreportvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetreportvisitor", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 882;BA.debugLine="Sub LoadGetReportVisitor(Str As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 883;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 884;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(524288);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 885;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(1048576);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 886;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(2097152);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 889;BA.debugLine="CallSubDelayed2(Act_ReportVisitor2,\"CreateList\",R";
Debug.ShouldStop(16777216);
service_server.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",service_server.processBA,(Object)((service_server.mostCurrent._act_reportvisitor2.getObject())),(Object)(BA.ObjectToString("CreateList")),(Object)((_rowslist)));
 BA.debugLineNum = 890;BA.debugLine="ToastMessageShow(\"گزارش ویزیتور با موفقیت دریافت";
Debug.ShouldStop(33554432);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارش ویزیتور با موفقیت دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e8.toString()); BA.debugLineNum = 892;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59568266",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 893;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(268435456);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetReportVisitor")));
 };
 BA.debugLineNum = 895;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetsandoogh(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetSandoogh (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1275);
if (RapidSub.canDelegate("loadgetsandoogh")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetsandoogh", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1275;BA.debugLine="Sub LoadGetSandoogh(Str As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1276;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 1277;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(268435456);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1279;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSandoogh\")";
Debug.ShouldStop(1073741824);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblSandoogh")));
 BA.debugLineNum = 1280;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1281;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(1);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1282;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblSandoogh\",Rows";
Debug.ShouldStop(2);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblSandoogh")),(Object)(_rowslist));
 BA.debugLineNum = 1283;BA.debugLine="Log(\"لیست صندوق دریافت گردید\")";
Debug.ShouldStop(4);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511141128",RemoteObject.createImmutable("لیست صندوق دریافت گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e9.toString()); BA.debugLineNum = 1286;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511141131",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1287;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(64);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetSandoogh")));
 };
 BA.debugLineNum = 1289;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("LoadGetSetting (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,94);
if (RapidSub.canDelegate("loadgetsetting")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetsetting", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _where = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 94;BA.debugLine="Sub LoadGetSetting(Str As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 96;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(-2147483648);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 97;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(1);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 98;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(2);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 99;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(4);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 100;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(8);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 101;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(16);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 102;BA.debugLine="If MCode.Sf.Len(Row.Get(\"FldC_Visitor\"))<5 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",service_server.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldC_Visitor"))))))),BA.numberCast(long.class, 5))) { 
 BA.debugLineNum = 103;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tr";
Debug.ShouldStop(64);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 105;BA.debugLine="Return";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 107;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(1024);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 108;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(2048);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 110;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(8192);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 111;BA.debugLine="Where.Initialize";
Debug.ShouldStop(16384);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 112;BA.debugLine="Fields.Put(\"FldImei\",MCode.DeviceId)";
Debug.ShouldStop(32768);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldImei"))),(Object)((service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 113;BA.debugLine="Fields.Put(\"FldC_Visitor\",Row.Get(\"FldC_Visitor\"";
Debug.ShouldStop(65536);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Visitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldC_Visitor"))))));
 BA.debugLineNum = 114;BA.debugLine="Fields.Put(\"FldN_Visitor\",Row.Get(\"FldN_Visitor\"";
Debug.ShouldStop(131072);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldN_Visitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldN_Visitor"))))));
 BA.debugLineNum = 115;BA.debugLine="Fields.Put(\"FldGps\",Row.Get(\"FldGps\"))";
Debug.ShouldStop(262144);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldGps"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldGps"))))));
 BA.debugLineNum = 116;BA.debugLine="Fields.Put(\"FldIntervalGps\",Row.Get(\"FldInterval";
Debug.ShouldStop(524288);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldIntervalGps"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldIntervalGps"))))));
 BA.debugLineNum = 117;BA.debugLine="Fields.Put(\"FldNoeDate\",Row.Get(\"FldNoeDate\"))";
Debug.ShouldStop(1048576);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNoeDate"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldNoeDate"))))));
 BA.debugLineNum = 118;BA.debugLine="Fields.Put(\"FldRound\",Row.Get(\"FldRound\"))";
Debug.ShouldStop(2097152);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldRound"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldRound"))))));
 BA.debugLineNum = 119;BA.debugLine="Fields.Put(\"FldKalaManfi\",Row.Get(\"FldKalaManfi\"";
Debug.ShouldStop(4194304);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldKalaManfi"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldKalaManfi"))))));
 BA.debugLineNum = 120;BA.debugLine="Fields.Put(\"FldTaghirFeeKala\",Row.Get(\"FldTaghir";
Debug.ShouldStop(8388608);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTaghirFeeKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTaghirFeeKala"))))));
 BA.debugLineNum = 121;BA.debugLine="Fields.Put(\"fldNamayeshKalaSefr\",Row.Get(\"fldNam";
Debug.ShouldStop(16777216);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldNamayeshKalaSefr"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNamayeshKalaSefr"))))));
 BA.debugLineNum = 122;BA.debugLine="Fields.Put(\"FldDastrasiKala\",Row.Get(\"FldDastras";
Debug.ShouldStop(33554432);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDastrasiKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldDastrasiKala"))))));
 BA.debugLineNum = 123;BA.debugLine="Fields.Put(\"FldDastrasiAshkhas\",Row.Get(\"FldDast";
Debug.ShouldStop(67108864);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDastrasiAshkhas"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldDastrasiAshkhas"))))));
 BA.debugLineNum = 124;BA.debugLine="Fields.Put(\"FldAdmin\",Row.Get(\"FldAdmin\"))";
Debug.ShouldStop(134217728);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAdmin"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldAdmin"))))));
 BA.debugLineNum = 125;BA.debugLine="Fields.Put(\"FldCheckAdmin\",Row.Get(\"FldCheckAdmi";
Debug.ShouldStop(268435456);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCheckAdmin"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldCheckAdmin"))))));
 BA.debugLineNum = 126;BA.debugLine="Fields.Put(\"FldTakhfifKala\",Row.Get(\"FldTakhfifK";
Debug.ShouldStop(536870912);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTakhfifKala"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTakhfifKala"))))));
 BA.debugLineNum = 127;BA.debugLine="Fields.Put(\"FldTozie\",Row.Get(\"FldTozie\"))";
Debug.ShouldStop(1073741824);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozie"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTozie"))))));
 BA.debugLineNum = 128;BA.debugLine="Fields.Put(\"FldVisitor\",Row.Get(\"FldVisitor\"))";
Debug.ShouldStop(-2147483648);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVisitor"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldVisitor"))))));
 BA.debugLineNum = 129;BA.debugLine="Fields.Put(\"FldVahedPool\",Row.Get(\"FldVahedPool\"";
Debug.ShouldStop(1);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVahedPool"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldVahedPool"))))));
 BA.debugLineNum = 130;BA.debugLine="Fields.Put(\"FldHideMojodi\",Row.Get(\"FldHideMojod";
Debug.ShouldStop(2);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldHideMojodi"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldHideMojodi"))))));
 BA.debugLineNum = 131;BA.debugLine="Fields.Put(\"FldSendMarjoie\",Row.Get(\"FldSendMarj";
Debug.ShouldStop(4);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSendMarjoie"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSendMarjoie"))))));
 BA.debugLineNum = 132;BA.debugLine="Fields.Put(\"FldPicOnline\",Row.Get(\"FldPicOnline\"";
Debug.ShouldStop(8);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldPicOnline"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldPicOnline"))))));
 BA.debugLineNum = 133;BA.debugLine="Fields.Put(\"FldDaryaft\",Row.Get(\"FldDaryaft\"))";
Debug.ShouldStop(16);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDaryaft"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldDaryaft"))))));
 BA.debugLineNum = 134;BA.debugLine="Fields.Put(\"FldGetDataOnline\",Row.Get(\"FldGetDat";
Debug.ShouldStop(32);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldGetDataOnline"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldGetDataOnline"))))));
 BA.debugLineNum = 135;BA.debugLine="Fields.Put(\"FldAmani\",Row.Get(\"FldAmani\"))";
Debug.ShouldStop(64);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAmani"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldAmani"))))));
 BA.debugLineNum = 136;BA.debugLine="Fields.Put(\"FldMojavezSefaresh\",Row.Get(\"FldMoja";
Debug.ShouldStop(128);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMojavezSefaresh"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldMojavezSefaresh"))))));
 BA.debugLineNum = 137;BA.debugLine="Fields.Put(\"FldConnectionStatus\",Row.Get(\"FldCon";
Debug.ShouldStop(256);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldConnectionStatus"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldConnectionStatus"))))));
 BA.debugLineNum = 138;BA.debugLine="Fields.Put(\"FldEshantionTabaghati\",Row.Get(\"FldE";
Debug.ShouldStop(512);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldEshantionTabaghati"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldEshantionTabaghati"))))));
 BA.debugLineNum = 139;BA.debugLine="Fields.Put(\"FldEshantionRemove\",Row.Get(\"FldEsha";
Debug.ShouldStop(1024);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldEshantionRemove"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldEshantionRemove"))))));
 BA.debugLineNum = 140;BA.debugLine="Fields.Put(\"FldEshantionGroup\",Row.Get(\"FldEshan";
Debug.ShouldStop(2048);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldEshantionGroup"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldEshantionGroup"))))));
 BA.debugLineNum = 141;BA.debugLine="Fields.Put(\"FldMobileIsImportent\",Row.Get(\"FldMo";
Debug.ShouldStop(4096);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMobileIsImportent"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldMobileIsImportent"))))));
 BA.debugLineNum = 142;BA.debugLine="Fields.Put(\"FldSaveFactorInLocation\",Row.Get(\"Fl";
Debug.ShouldStop(8192);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSaveFactorInLocation"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSaveFactorInLocation"))))));
 BA.debugLineNum = 143;BA.debugLine="Fields.Put(\"FldMasafat\",Row.Get(\"FldMasafat\"))";
Debug.ShouldStop(16384);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMasafat"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldMasafat"))))));
 BA.debugLineNum = 145;BA.debugLine="Where.Put(\"FldId\",1)";
Debug.ShouldStop(65536);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldId"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 148;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblSetting\",Fi";
Debug.ShouldStop(524288);
service_server.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblSetting")),(Object)(_fields),(Object)(_where));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 151;BA.debugLine="MCode.UpdateDataBase";
Debug.ShouldStop(4194304);
service_server.mostCurrent._mcode.runVoidMethod ("_updatedatabase" /*RemoteObject*/ ,service_server.processBA);
 BA.debugLineNum = 153;BA.debugLine="If MCode.NoeGet=\"DaryaftEtlaat\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",service_server.mostCurrent._mcode._noeget /*RemoteObject*/ ,BA.ObjectToString("DaryaftEtlaat"))) { 
 BA.debugLineNum = 154;BA.debugLine="GetGoroohKala";
Debug.ShouldStop(33554432);
_getgoroohkala();
 };
 BA.debugLineNum = 160;BA.debugLine="StartService(FusedLocationService)";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent.__c.runVoidMethod ("StartService",service_server.processBA,(Object)((service_server.mostCurrent._fusedlocationservice.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e57) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e57.toString()); BA.debugLineNum = 165;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","56750279",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 166;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(32);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetSetting")));
 };
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetsoorathesab(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetSooratHesab (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1054);
if (RapidSub.canDelegate("loadgetsoorathesab")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetsoorathesab", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1054;BA.debugLine="Sub LoadGetSooratHesab(Str As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1055;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 1056;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(-2147483648);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1057;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(1);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1058;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(2);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1060;BA.debugLine="CallSubDelayed2(Act_ReportSoorathesab,\"CreateList";
Debug.ShouldStop(8);
service_server.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",service_server.processBA,(Object)((service_server.mostCurrent._act_reportsoorathesab.getObject())),(Object)(BA.ObjectToString("CreateList")),(Object)((_rowslist)));
 BA.debugLineNum = 1061;BA.debugLine="ToastMessageShow(\"گزارش صورتحساب مشتری با موفقیت";
Debug.ShouldStop(16);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارش صورتحساب مشتری با موفقیت دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e8.toString()); BA.debugLineNum = 1063;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510223625",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1064;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(128);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetSooratHesab")));
 };
 BA.debugLineNum = 1066;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgettanzimatandroid(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetTanzimatAndroid (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,321);
if (RapidSub.canDelegate("loadgettanzimatandroid")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgettanzimatandroid", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _where = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 321;BA.debugLine="Sub LoadGetTanzimatAndroid(Str As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 322;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 323;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(4);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 324;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(8);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 325;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(16);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 326;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(32);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 327;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(64);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 328;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(128);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 330;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(512);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 331;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(1024);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 333;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(4096);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 334;BA.debugLine="Where.Initialize";
Debug.ShouldStop(8192);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 335;BA.debugLine="Fields.Put(\"fldArzeshAfzode\",Row.Get(\"fldArzesh";
Debug.ShouldStop(16384);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldArzeshAfzode"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldArzeshAfzode"))))));
 BA.debugLineNum = 336;BA.debugLine="Where.Put(\"FldId\",1)";
Debug.ShouldStop(32768);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldId"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 339;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblSetting\",F";
Debug.ShouldStop(262144);
service_server.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblSetting")),(Object)(_fields),(Object)(_where));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 341;BA.debugLine="MCode.UpdateDataBase";
Debug.ShouldStop(1048576);
service_server.mostCurrent._mcode.runVoidMethod ("_updatedatabase" /*RemoteObject*/ ,service_server.processBA);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e18.toString()); BA.debugLineNum = 346;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57471129",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 347;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(67108864);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetTanzimatAndroid")));
 };
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("LoadGetTasvie (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,420);
if (RapidSub.canDelegate("loadgettasvie")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgettasvie", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 420;BA.debugLine="Sub LoadGetTasvie(Str As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 421;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 422;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(32);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 423;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(64);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 424;BA.debugLine="MCode.SaveUpdate(\"Delete From TblTasvie\")";
Debug.ShouldStop(128);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblTasvie")));
 BA.debugLineNum = 425;BA.debugLine="MCode.Json.Initialize(Str.Trim)";
Debug.ShouldStop(256);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 426;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(512);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 428;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(2048);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 429;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(4096);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 430;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblTasvie (FldCode";
Debug.ShouldStop(8192);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblTasvie (FldCode,FldName) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCode")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldName")))),RemoteObject.createImmutable("')"))));
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e12.toString()); BA.debugLineNum = 434;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57864334",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 435;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(262144);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetTasvie")));
 };
 BA.debugLineNum = 437;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgettourvisitor(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetTourVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1075);
if (RapidSub.canDelegate("loadgettourvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgettourvisitor", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1075;BA.debugLine="Sub LoadGetTourVisitor(Str As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1076;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 1077;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(1048576);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1078;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(2097152);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1079;BA.debugLine="MCode.SaveUpdate(\"Delete From tblTourVisitor\")";
Debug.ShouldStop(4194304);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblTourVisitor")));
 BA.debugLineNum = 1080;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(8388608);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1081;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(16777216);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1082;BA.debugLine="MCode.SaveUpdate(\"Delete From tblTourVisitor\")";
Debug.ShouldStop(33554432);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblTourVisitor")));
 BA.debugLineNum = 1083;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"tblTourVisitor\",R";
Debug.ShouldStop(67108864);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("tblTourVisitor")),(Object)(_rowslist));
 BA.debugLineNum = 1084;BA.debugLine="Log(\"لیست تور ویزیت دریافت گردید\")";
Debug.ShouldStop(134217728);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510354697",RemoteObject.createImmutable("لیست تور ویزیت دریافت گردید"),0);
 BA.debugLineNum = 1085;BA.debugLine="ToastMessageShow(\"لیست تور ویزیت دریافت گردید\",T";
Debug.ShouldStop(268435456);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لیست تور ویزیت دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e12.toString()); BA.debugLineNum = 1136;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510354749",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1137;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(65536);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetBankMa")));
 };
 BA.debugLineNum = 1139;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetvaziat(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetVaziat (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,197);
if (RapidSub.canDelegate("loadgetvaziat")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetvaziat", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _query = RemoteObject.createImmutable("");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 197;BA.debugLine="Sub LoadGetVaziat(Str As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 199;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(64);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 200;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(128);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 201;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(256);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 202;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(512);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 203;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(1024);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 204;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(2048);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 205;BA.debugLine="Dim Query As String=\"Update TblSetting Set FldTo";
Debug.ShouldStop(4096);
_query = RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set FldTokenId = '"),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("',FldCodeMoshtari = '"),service_server.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ,RemoteObject.createImmutable("',FldNameVisitor = '"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNameVisitor")))),RemoteObject.createImmutable("',FldVaziat = '"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldVaziat")))),RemoteObject.createImmutable("'"));Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 206;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(8192);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(_query));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 208;BA.debugLine="MCode.Vaziat=MCode.SingleResult(\"select FldVazia";
Debug.ShouldStop(32768);
service_server.mostCurrent._mcode._vaziat /*RemoteObject*/  = BA.numberCast(int.class, service_server.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("select FldVaziat from TblSetting"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e13.toString()); BA.debugLineNum = 210;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","57077901",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 211;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(262144);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetVaziat")));
 };
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
public static RemoteObject  _loadgetvideoamoozesh(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetVideoAmoozesh (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1386);
if (RapidSub.canDelegate("loadgetvideoamoozesh")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetvideoamoozesh", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1386;BA.debugLine="Sub LoadGetVideoAmoozesh(Str As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 1387;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 1388;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(2048);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1389;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(4096);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1390;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(8192);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1392;BA.debugLine="CallSubDelayed2(Act_Video,\"LoadData\",RowsList)";
Debug.ShouldStop(32768);
service_server.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",service_server.processBA,(Object)((service_server.mostCurrent._act_video.getObject())),(Object)(BA.ObjectToString("LoadData")),(Object)((_rowslist)));
 BA.debugLineNum = 1393;BA.debugLine="ToastMessageShow(\"لیست ویدیوهای آموزشی با موفقیت";
Debug.ShouldStop(65536);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لیست ویدیوهای آموزشی با موفقیت دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e8.toString()); BA.debugLineNum = 1395;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511796489",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1396;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(524288);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetReportRizFactorVisitor")));
 };
 BA.debugLineNum = 1398;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetvisitor(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1147);
if (RapidSub.canDelegate("loadgetvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadgetvisitor", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1147;BA.debugLine="Sub LoadGetVisitor(Str As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1148;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 1149;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(268435456);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1151;BA.debugLine="MCode.SaveUpdate(\"Delete From TblVisitor\")";
Debug.ShouldStop(1073741824);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblVisitor")));
 BA.debugLineNum = 1152;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1153;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(1);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1154;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblVisitor\",RowsLi";
Debug.ShouldStop(2);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblVisitor")),(Object)(_rowslist));
 BA.debugLineNum = 1161;BA.debugLine="Log(\"لیست ویزیتورها بروزرسانی گردید\")";
Debug.ShouldStop(256);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510485774",RemoteObject.createImmutable("لیست ویزیتورها بروزرسانی گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e9.toString()); BA.debugLineNum = 1163;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510485776",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1164;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(2048);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadGetVisitor")));
 };
 BA.debugLineNum = 1167;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsend(RemoteObject _shomarefacktor) throws Exception{
try {
		Debug.PushSubsStack("LoadSend (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,776);
if (RapidSub.canDelegate("loadsend")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadsend", _shomarefacktor);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("ShomareFacktor", _shomarefacktor);
 BA.debugLineNum = 776;BA.debugLine="Sub LoadSend(ShomareFacktor As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 777;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 778;BA.debugLine="StopService(FusedLocationService)";
Debug.ShouldStop(512);
service_server.mostCurrent.__c.runVoidMethod ("StopService",service_server.processBA,(Object)((service_server.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 779;BA.debugLine="Sendtype=\"Faktor\"";
Debug.ShouldStop(1024);
service_server._sendtype = BA.ObjectToString("Faktor");
 BA.debugLineNum = 780;BA.debugLine="shomareFactorSelect=ShomareFacktor";
Debug.ShouldStop(2048);
service_server._shomarefactorselect = _shomarefacktor;
 BA.debugLineNum = 781;BA.debugLine="If shomareFactorSelect=0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",service_server._shomarefactorselect,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 782;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCode";
Debug.ShouldStop(8192);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where FldSync='False'")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 785;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(65536);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 786;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 788;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
Debug.ShouldStop(524288);
_sendashkhasnew(service_server.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,service_server.processBA,(Object)(_cu)));
 }else {
 BA.debugLineNum = 791;BA.debugLine="LoadSendFaktorAll";
Debug.ShouldStop(4194304);
_loadsendfaktorall();
 };
 }else 
{ BA.debugLineNum = 793;BA.debugLine="Else if shomareFactorSelect>0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",service_server._shomarefactorselect,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 794;BA.debugLine="If MCode.C_Tafzili.Length>5 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",service_server.mostCurrent._mcode._c_tafzili /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 795;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCod";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where fldCodetafzili='"),service_server.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 796;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(134217728);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 797;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 799;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
Debug.ShouldStop(1073741824);
_sendashkhasnew(service_server.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,service_server.processBA,(Object)(_cu)));
 }else {
 BA.debugLineNum = 801;BA.debugLine="LoadSendFaktor(ShomareFacktor)";
Debug.ShouldStop(1);
_loadsendfaktor(BA.NumberToString(_shomarefacktor));
 };
 }else {
 BA.debugLineNum = 804;BA.debugLine="LoadSendFaktor(ShomareFacktor)";
Debug.ShouldStop(8);
_loadsendfaktor(BA.NumberToString(_shomarefacktor));
 };
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e27.toString()); BA.debugLineNum = 809;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59240609",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 810;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(512);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadSend")));
 };
 BA.debugLineNum = 812;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsend2(RemoteObject _codetafzili) throws Exception{
try {
		Debug.PushSubsStack("LoadSend2 (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,813);
if (RapidSub.canDelegate("loadsend2")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadsend2", _codetafzili);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("CodeTafzili", _codetafzili);
 BA.debugLineNum = 813;BA.debugLine="Sub LoadSend2(CodeTafzili As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 814;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 815;BA.debugLine="StopService(FusedLocationService)";
Debug.ShouldStop(16384);
service_server.mostCurrent.__c.runVoidMethod ("StopService",service_server.processBA,(Object)((service_server.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 816;BA.debugLine="Sendtype=\"Faktor\"";
Debug.ShouldStop(32768);
service_server._sendtype = BA.ObjectToString("Faktor");
 BA.debugLineNum = 818;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCodet";
Debug.ShouldStop(131072);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where FldSync='False' and fldCodetafzili="),_codetafzili)));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 819;BA.debugLine="MCode.C_Tafzili=CodeTafzili";
Debug.ShouldStop(262144);
service_server.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = _codetafzili;
 BA.debugLineNum = 821;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(1048576);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 822;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 824;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
Debug.ShouldStop(8388608);
_sendashkhasnew(service_server.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,service_server.processBA,(Object)(_cu)));
 }else {
 BA.debugLineNum = 827;BA.debugLine="LoadSendFaktorAll2(CodeTafzili)";
Debug.ShouldStop(67108864);
_loadsendfaktorall2(_codetafzili);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e13.toString()); BA.debugLineNum = 831;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59306130",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 832;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadSend2")));
 };
 BA.debugLineNum = 834;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsendashkhasnew() throws Exception{
try {
		Debug.PushSubsStack("LoadSendAshkhasNew (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,749);
if (RapidSub.canDelegate("loadsendashkhasnew")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadsendashkhasnew");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 749;BA.debugLine="Sub LoadSendAshkhasNew()";
Debug.ShouldStop(4096);
 BA.debugLineNum = 750;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 751;BA.debugLine="Sendtype=\"SendAshkhasNew\"";
Debug.ShouldStop(16384);
service_server._sendtype = BA.ObjectToString("SendAshkhasNew");
 BA.debugLineNum = 752;BA.debugLine="If MCode.C_Tafzili=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",service_server.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 753;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCode";
Debug.ShouldStop(65536);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where FldSync='False'")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 755;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(262144);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 756;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 758;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
Debug.ShouldStop(2097152);
_sendashkhasnew(service_server.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,service_server.processBA,(Object)(_cu)));
 };
 }else 
{ BA.debugLineNum = 760;BA.debugLine="Else if MCode.C_Tafzili.Length>0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",service_server.mostCurrent._mcode._c_tafzili /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 761;BA.debugLine="If MCode.C_Tafzili.Length>5 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",service_server.mostCurrent._mcode._c_tafzili /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 762;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCod";
Debug.ShouldStop(33554432);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where fldCodetafzili='"),service_server.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("' and FldSync='False'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 763;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(67108864);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 764;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 766;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
Debug.ShouldStop(536870912);
_sendashkhasnew(service_server.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,service_server.processBA,(Object)(_cu)));
 };
 };
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e19.toString()); BA.debugLineNum = 772;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59175063",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 };
 BA.debugLineNum = 774;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsenddaryaft(RemoteObject _strdtdaryaft,RemoteObject _strdtcheckdaryaft) throws Exception{
try {
		Debug.PushSubsStack("LoadSendDaryaft (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1458);
if (RapidSub.canDelegate("loadsenddaryaft")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadsenddaryaft", _strdtdaryaft, _strdtcheckdaryaft);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("StrDtDaryaft", _strdtdaryaft);
Debug.locals.put("StrDtCheckDaryaft", _strdtcheckdaryaft);
 BA.debugLineNum = 1458;BA.debugLine="Sub LoadSendDaryaft(StrDtDaryaft As String,StrDtCh";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1459;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1460;BA.debugLine="Sendtype=\"Daryaft\"";
Debug.ShouldStop(524288);
service_server._sendtype = BA.ObjectToString("Daryaft");
 BA.debugLineNum = 1461;BA.debugLine="dt1=StrDtDaryaft";
Debug.ShouldStop(1048576);
service_server._dt1 = _strdtdaryaft;
 BA.debugLineNum = 1462;BA.debugLine="dt2=StrDtCheckDaryaft";
Debug.ShouldStop(2097152);
service_server._dt2 = _strdtcheckdaryaft;
 BA.debugLineNum = 1463;BA.debugLine="If shomareFactorSelect=0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",service_server._shomarefactorselect,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1464;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"SELECT fldCode";
Debug.ShouldStop(8388608);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where fldCodetafzili="),service_server.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(" and FldSync='False'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1466;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(33554432);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1467;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1469;BA.debugLine="SendAshkhasNew(MCode.DtToJson(Cu))";
Debug.ShouldStop(268435456);
_sendashkhasnew(service_server.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,service_server.processBA,(Object)(_cu)));
 }else {
 BA.debugLineNum = 1472;BA.debugLine="SendDaryaft(StrDtDaryaft,StrDtCheckDaryaft)";
Debug.ShouldStop(-2147483648);
_senddaryaft(_strdtdaryaft,_strdtcheckdaryaft);
 };
 }else 
{ BA.debugLineNum = 1474;BA.debugLine="Else if shomareFactorSelect>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",service_server._shomarefactorselect,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1475;BA.debugLine="SendDaryaft(StrDtDaryaft,StrDtCheckDaryaft)";
Debug.ShouldStop(4);
_senddaryaft(_strdtdaryaft,_strdtcheckdaryaft);
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e17.toString()); BA.debugLineNum = 1478;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512255252",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1479;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(64);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadSend")));
 };
 BA.debugLineNum = 1481;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsendfaktor(RemoteObject _shomarefacktor) throws Exception{
try {
		Debug.PushSubsStack("LoadSendFaktor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,837);
if (RapidSub.canDelegate("loadsendfaktor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadsendfaktor", _shomarefacktor);}
RemoteObject _listjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("ShomareFacktor", _shomarefacktor);
 BA.debugLineNum = 837;BA.debugLine="Sub LoadSendFaktor(ShomareFacktor As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 838;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 839;BA.debugLine="Dim ListJson As List";
Debug.ShouldStop(64);
_listjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListJson", _listjson);
 BA.debugLineNum = 840;BA.debugLine="ListJson.Initialize";
Debug.ShouldStop(128);
_listjson.runVoidMethod ("Initialize");
 BA.debugLineNum = 841;BA.debugLine="Dim Cu As Cursor";
Debug.ShouldStop(256);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 842;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set FldSend='";
Debug.ShouldStop(512);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblFaktor Set FldSend='0',FldSync='False' where FldShomareFaktor = '"),_shomarefacktor,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 846;BA.debugLine="If MCode.CheckAdmin=1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",service_server.mostCurrent._mcode._checkadmin /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 847;BA.debugLine="Cu = MCode.Result(\"Select FldRadif,FldShomareFa";
Debug.ShouldStop(16384);
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,'' as FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"),service_server.mostCurrent._mcode._raghamashar /*RemoteObject*/ ,RemoteObject.createImmutable("') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,'0' as FldLat,'0' as FldLon,FldTozih,FldShomareBargasht,FldDarsadTakhfif,FldType as fldType,FldMablaghTakhfif,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,-1 as fldShomareFactorReal,fldArzeshAfzode,fldDarsadArzeshAfzode  From TblFaktor Where FldShomareFaktor ="),_shomarefacktor)));Debug.locals.put("Cu", _cu);
 }else {
 BA.debugLineNum = 849;BA.debugLine="Cu = MCode.Result(\"Select FldRadif,FldShomareFa";
Debug.ShouldStop(65536);
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,'' as FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"),service_server.mostCurrent._mcode._raghamashar /*RemoteObject*/ ,RemoteObject.createImmutable("') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,'0' as FldLat,'0' as FldLon,FldTozih,FldShomareBargasht,FldDarsadTakhfif,FldType as fldType,FldMablaghTakhfif,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,fldArzeshAfzode,fldDarsadArzeshAfzode  From TblFaktor Where FldShomareFaktor ="),_shomarefacktor)));Debug.locals.put("Cu", _cu);
 };
 BA.debugLineNum = 855;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 857;BA.debugLine="SendFaktor(MCode.DtToJson(Cu))";
Debug.ShouldStop(16777216);
_sendfaktor(service_server.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,service_server.processBA,(Object)(_cu)));
 }else {
 BA.debugLineNum = 859;BA.debugLine="ToastMessageShow(\"فاکتور جهت ارسال موجود نمی باش";
Debug.ShouldStop(67108864);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فاکتور جهت ارسال موجود نمی باشد")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 860;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
service_server.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e18.toString()); BA.debugLineNum = 863;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59371674",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 864;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadSendFaktor")));
 };
 BA.debugLineNum = 866;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2);
service_server.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 867;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsendfaktorall() throws Exception{
try {
		Debug.PushSubsStack("LoadSendFaktorAll (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,691);
if (RapidSub.canDelegate("loadsendfaktorall")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadsendfaktorall");}
RemoteObject _listjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 691;BA.debugLine="Sub LoadSendFaktorAll";
Debug.ShouldStop(262144);
 BA.debugLineNum = 692;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 693;BA.debugLine="Dim ListJson As List";
Debug.ShouldStop(1048576);
_listjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListJson", _listjson);
 BA.debugLineNum = 694;BA.debugLine="ListJson.Initialize";
Debug.ShouldStop(2097152);
_listjson.runVoidMethod ("Initialize");
 BA.debugLineNum = 698;BA.debugLine="If MCode.CheckAdmin=1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",service_server.mostCurrent._mcode._checkadmin /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 699;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldRadi";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"),service_server.mostCurrent._mcode._raghamashar /*RemoteObject*/ ,RemoteObject.createImmutable("') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,-1 as fldShomareFactorReal,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 }else {
 BA.debugLineNum = 701;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldRadi";
Debug.ShouldStop(268435456);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"),service_server.mostCurrent._mcode._raghamashar /*RemoteObject*/ ,RemoteObject.createImmutable("') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 };
 BA.debugLineNum = 704;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 706;BA.debugLine="SendFaktor(MCode.DtToJson(Cu))";
Debug.ShouldStop(2);
_sendfaktor(service_server.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,service_server.processBA,(Object)(_cu)));
 }else {
 BA.debugLineNum = 708;BA.debugLine="ToastMessageShow(\"فاکتور جهت ارسال موجود نمی باش";
Debug.ShouldStop(8);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فاکتور جهت ارسال موجود نمی باشد")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 709;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
service_server.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e16.toString()); BA.debugLineNum = 713;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59043990",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 714;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(512);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadSendFaktorAll")));
 };
 BA.debugLineNum = 716;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
service_server.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 717;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsendfaktorall2(RemoteObject _codetafzili) throws Exception{
try {
		Debug.PushSubsStack("LoadSendFaktorAll2 (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,719);
if (RapidSub.canDelegate("loadsendfaktorall2")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadsendfaktorall2", _codetafzili);}
RemoteObject _listjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("CodeTafzili", _codetafzili);
 BA.debugLineNum = 719;BA.debugLine="Sub LoadSendFaktorAll2(CodeTafzili As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 720;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 721;BA.debugLine="Dim ListJson As List";
Debug.ShouldStop(65536);
_listjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListJson", _listjson);
 BA.debugLineNum = 722;BA.debugLine="ListJson.Initialize";
Debug.ShouldStop(131072);
_listjson.runVoidMethod ("Initialize");
 BA.debugLineNum = 728;BA.debugLine="If MCode.CheckAdmin=1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",service_server.mostCurrent._mcode._checkadmin /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 729;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldRadi";
Debug.ShouldStop(16777216);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"),service_server.mostCurrent._mcode._raghamashar /*RemoteObject*/ ,RemoteObject.createImmutable("') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,-1 as fldShomareFactorReal,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False' and FldShomareFaktor='"),service_server._shomarefactorselect,RemoteObject.createImmutable("' and FldC_Tafzili='"),_codetafzili,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 }else {
 BA.debugLineNum = 731;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldRadi";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"),service_server.mostCurrent._mcode._raghamashar /*RemoteObject*/ ,RemoteObject.createImmutable("') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False' and FldShomareFaktor='"),service_server._shomarefactorselect,RemoteObject.createImmutable("' and FldC_Tafzili='"),_codetafzili,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 };
 BA.debugLineNum = 734;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 736;BA.debugLine="SendFaktor(MCode.DtToJson(Cu))";
Debug.ShouldStop(-2147483648);
_sendfaktor(service_server.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,service_server.processBA,(Object)(_cu)));
 }else {
 BA.debugLineNum = 738;BA.debugLine="ToastMessageShow(\"فاکتور جهت ارسال موجود نمی با";
Debug.ShouldStop(2);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فاکتور جهت ارسال موجود نمی باشد")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 739;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
service_server.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e16.toString()); BA.debugLineNum = 743;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59109528",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 744;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(128);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadSendFaktorAll2")));
 };
 BA.debugLineNum = 746;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
service_server.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 747;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsendtourvisitor() throws Exception{
try {
		Debug.PushSubsStack("LoadSendTourVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1491);
if (RapidSub.canDelegate("loadsendtourvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadsendtourvisitor");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 1491;BA.debugLine="Sub LoadSendTourVisitor";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1492;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 1493;BA.debugLine="Dim Cu As Cursor = MCode.Result($\"SELECT tblTour";
Debug.ShouldStop(1048576);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT tblTourVisitor.fldRadif,tblTourVisitor.fldCodeSuperVisor,tblTourVisitor.fldCodeVisitor,tblTourVisitor.fldCodeGroup,tblTourVisitor.fldCodeTafzili,TblAshkhas.fldSharheTafzili,tblTourVisitor.fldDate,tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit,tblTourVisitor.fldDateNextVisit,tblTourVisitor.fldDateTozie,tblTourVisitor.fldShomareSefaresh,tblTourVisitor.fldTimeSefaresh,tblTourVisitor.fldSharh,tblTourVisitor.fldVaziat,tblTourVisitor.fldShomareFactor,tblTourVisitor.fldType,TblAshkhas.FldLat,TblAshkhas.FldLon FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND fldDateVisit = "),service_server.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((service_server.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,service_server.processBA)))),RemoteObject.createImmutable(" and tblTourVisitor.fldSend='False' ORDER BY tblTourVisitor.fldRadif ASC")))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1494;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1495;BA.debugLine="SendTourVisitor(MCode.DtToJson(Cu))";
Debug.ShouldStop(4194304);
_sendtourvisitor(service_server.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,service_server.processBA,(Object)(_cu)));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e7.toString()); BA.debugLineNum = 1498;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512386311",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1499;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(67108864);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadSend")));
 };
 BA.debugLineNum = 1501;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadshowfactorforooshbyhavale(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadShowFactorForooshByHavale (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1175);
if (RapidSub.canDelegate("loadshowfactorforooshbyhavale")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadshowfactorforooshbyhavale", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1175;BA.debugLine="Sub LoadShowFactorForooshByHavale(Str As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1176;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 1177;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(16777216);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1178;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(33554432);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1179;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(67108864);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1181;BA.debugLine="CallSubDelayed2(Act_RizHavale,\"LoadData\",RowsLis";
Debug.ShouldStop(268435456);
service_server.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",service_server.processBA,(Object)((service_server.mostCurrent._act_rizhavale.getObject())),(Object)(BA.ObjectToString("LoadData")),(Object)((_rowslist)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e7.toString()); BA.debugLineNum = 1184;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","510616841",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1185;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(1);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadShowFactorForooshByHavale")));
 };
 BA.debugLineNum = 1187;BA.debugLine="ToastMessageShow(\"ریز حواله ی توزیع دریافت گردید\"";
Debug.ShouldStop(4);
service_server.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ریز حواله ی توزیع دریافت گردید")),(Object)(service_server.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1188;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("LoadShowRizeFactorForooshByHavale (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1297);
if (RapidSub.canDelegate("loadshowrizefactorforooshbyhavale")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","loadshowrizefactorforooshbyhavale", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1297;BA.debugLine="Sub LoadShowRizeFactorForooshByHavale(Str As Strin";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1298;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 1299;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(262144);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1300;BA.debugLine="MCode.SaveUpdate(\"Delete From TblRizFactorHavale";
Debug.ShouldStop(524288);
service_server.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblRizFactorHavale")));
 BA.debugLineNum = 1301;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(1048576);
service_server.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1302;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(2097152);
_rowslist = service_server.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1303;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblRizFactorHaval";
Debug.ShouldStop(4194304);
service_server.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblRizFactorHavale")),(Object)(_rowslist));
 BA.debugLineNum = 1304;BA.debugLine="Log(\"ریز فاکتور های حواله دریافت گردید\")";
Debug.ShouldStop(8388608);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511272199",RemoteObject.createImmutable("ریز فاکتور های حواله دریافت گردید"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e9.toString()); BA.debugLineNum = 1308;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511272203",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 1309;BA.debugLine="myCode.SendError(LastException,\"Service_Server-L";
Debug.ShouldStop(268435456);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-LoadShowFactorForooshByHavale")));
 };
 BA.debugLineNum = 1312;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim jobInternet As HttpJob";
service_server._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");
 //BA.debugLineNum = 8;BA.debugLine="Dim tgps As Boolean";
service_server._tgps = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 9;BA.debugLine="Dim shomareFactorSelect As Int";
service_server._shomarefactorselect = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 10;BA.debugLine="Dim Sendtype As String";
service_server._sendtype = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim dt1 As String";
service_server._dt1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim dt2 As String";
service_server._dt2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim datenow As String";
service_server._datenow = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim th As Thread";
service_server._th = RemoteObject.createNew ("anywheresoftware.b4a.agraham.threading.Threading");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _request(RemoteObject _j) throws Exception{
try {
		Debug.PushSubsStack("Request (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1564);
if (RapidSub.canDelegate("request")) { ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","request", _j); return;}
ResumableSub_Request rsub = new ResumableSub_Request(null,_j);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Request extends BA.ResumableSub {
public ResumableSub_Request(ir.parsikhesab.pakhsh.service_server parent,RemoteObject _j) {
this.parent = parent;
this._j = _j;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.service_server parent;
RemoteObject _j;
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapteversion");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _strcurrentdate = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _query = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Request (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1564);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("j", _j);
 BA.debugLineNum = 1565;BA.debugLine="Try";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//try
this.state = 512;
this.catchState = 511;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 511;
 BA.debugLineNum = 1566;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", service_server.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "service_server", "request"), (_j));
this.state = 513;
return;
case 513:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1567;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 509;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 500;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1568;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 7:
//try
this.state = 498;
this.catchState = 497;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 497;
 BA.debugLineNum = 1569;BA.debugLine="Dim Str As String = j.GetString";
Debug.ShouldStop(1);
_str = _j.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 1570;BA.debugLine="Log(j.JobName)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845062",_j.getField(true,"_jobname" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1571;BA.debugLine="Select Case j.JobName";
Debug.ShouldStop(4);
if (true) break;

case 10:
//select
this.state = 495;
switch (BA.switchObjectToInt(_j.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("GetVersion"),BA.ObjectToString("GetSetting"),BA.ObjectToString("GetTanzimatAndroid"),BA.ObjectToString("SaveVersionAndroidInfo"),BA.ObjectToString("SaveAndroidLog"),BA.ObjectToString("SaveLocationMoshtari"),BA.ObjectToString("GetCurrentDate"),BA.ObjectToString("GetGoroohKala"),BA.ObjectToString("GetKala"),BA.ObjectToString("GetGoroohAshkhas"),BA.ObjectToString("GetAllNotification"),BA.ObjectToString("GetGalleryKala"),BA.ObjectToString("GetEshantion2"),BA.ObjectToString("GetDaftarchTell"),BA.ObjectToString("GetGroupDastrasiAshkhas"),BA.ObjectToString("GetEshantionGroup"),BA.ObjectToString("GetReportRizePishFactor3"),BA.ObjectToString("GetHavaleByUser"),BA.ObjectToString("GetAshkhas"),BA.ObjectToString("GetFee"),BA.ObjectToString("GetTasvie"),BA.ObjectToString("GetTourVisitor"),BA.ObjectToString("GetCodeMoshtari"),BA.ObjectToString("GetVaziat"),BA.ObjectToString("SendTokenId"),BA.ObjectToString("SendFaktor"),BA.ObjectToString("SendTourVisitor"),BA.ObjectToString("SendAshkhasNew"),BA.ObjectToString("GetReportVisitor"),BA.ObjectToString("GetListGpsVisitor"),BA.ObjectToString("GetReportMoshtari"),BA.ObjectToString("GetReportFactor"),BA.ObjectToString("GetReportRizePishFactor"),BA.ObjectToString("GetSooratHesab"),BA.ObjectToString("GetVisitor"),BA.ObjectToString("GetReportFactorVisitor"),BA.ObjectToString("GetReportRizFactorVisitor"),BA.ObjectToString("ShowFactorForooshByHavale"),BA.ObjectToString("ShowRizFactorForooshByHavale"),BA.ObjectToString("GetBankMa"),BA.ObjectToString("GetBankMoshtari"),BA.ObjectToString("GetSandoogh"),BA.ObjectToString("GetDaryaft"),BA.ObjectToString("GetCheckDaryaft"),BA.ObjectToString("GetVideoAmoozesh"),BA.ObjectToString("GetPicFTPForAndroid"),BA.ObjectToString("SendDaryaft"),BA.ObjectToString("SendUpdateQuery"))) {
case 0: {
this.state = 12;
if (true) break;
}
case 1: {
this.state = 22;
if (true) break;
}
case 2: {
this.state = 30;
if (true) break;
}
case 3: {
this.state = 38;
if (true) break;
}
case 4: {
this.state = 46;
if (true) break;
}
case 5: {
this.state = 54;
if (true) break;
}
case 6: {
this.state = 64;
if (true) break;
}
case 7: {
this.state = 81;
if (true) break;
}
case 8: {
this.state = 89;
if (true) break;
}
case 9: {
this.state = 97;
if (true) break;
}
case 10: {
this.state = 105;
if (true) break;
}
case 11: {
this.state = 113;
if (true) break;
}
case 12: {
this.state = 121;
if (true) break;
}
case 13: {
this.state = 129;
if (true) break;
}
case 14: {
this.state = 137;
if (true) break;
}
case 15: {
this.state = 145;
if (true) break;
}
case 16: {
this.state = 170;
if (true) break;
}
case 17: {
this.state = 189;
if (true) break;
}
case 18: {
this.state = 197;
if (true) break;
}
case 19: {
this.state = 211;
if (true) break;
}
case 20: {
this.state = 219;
if (true) break;
}
case 21: {
this.state = 227;
if (true) break;
}
case 22: {
this.state = 240;
if (true) break;
}
case 23: {
this.state = 248;
if (true) break;
}
case 24: {
this.state = 258;
if (true) break;
}
case 25: {
this.state = 268;
if (true) break;
}
case 26: {
this.state = 282;
if (true) break;
}
case 27: {
this.state = 290;
if (true) break;
}
case 28: {
this.state = 318;
if (true) break;
}
case 29: {
this.state = 326;
if (true) break;
}
case 30: {
this.state = 334;
if (true) break;
}
case 31: {
this.state = 342;
if (true) break;
}
case 32: {
this.state = 350;
if (true) break;
}
case 33: {
this.state = 358;
if (true) break;
}
case 34: {
this.state = 366;
if (true) break;
}
case 35: {
this.state = 379;
if (true) break;
}
case 36: {
this.state = 387;
if (true) break;
}
case 37: {
this.state = 395;
if (true) break;
}
case 38: {
this.state = 403;
if (true) break;
}
case 39: {
this.state = 411;
if (true) break;
}
case 40: {
this.state = 419;
if (true) break;
}
case 41: {
this.state = 427;
if (true) break;
}
case 42: {
this.state = 435;
if (true) break;
}
case 43: {
this.state = 443;
if (true) break;
}
case 44: {
this.state = 454;
if (true) break;
}
case 45: {
this.state = 462;
if (true) break;
}
case 46: {
this.state = 470;
if (true) break;
}
case 47: {
this.state = 478;
if (true) break;
}
}
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1574;BA.debugLine="If Str <> \"No Result\" Then";
Debug.ShouldStop(32);
if (true) break;

case 13:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",_str,BA.ObjectToString("No Result"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1575;BA.debugLine="Log(Str)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845067",_str,0);
 BA.debugLineNum = 1576;BA.debugLine="If MCode.page=\"act_setting\" Then";
Debug.ShouldStop(128);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("act_setting"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1577;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(256);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1578;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(512);
parent.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1579;BA.debugLine="Dim item As AdapteVersion";
Debug.ShouldStop(1024);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapteversion");Debug.locals.put("item", _item);
 BA.debugLineNum = 1580;BA.debugLine="item.Initialize";
Debug.ShouldStop(2048);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 1581;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(4096);
_rowslist = parent.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1582;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(8192);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1583;BA.debugLine="Row=RowsList.Get(0)";
Debug.ShouldStop(16384);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1585;BA.debugLine="MCode.linkposparsian=Row.Get(\"FldLink\")";
Debug.ShouldStop(65536);
parent.mostCurrent._mcode._linkposparsian /*RemoteObject*/  = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldLink")))));
 BA.debugLineNum = 1587;BA.debugLine="CallSubDelayed(Act_Setting,\"DownloadAppPos\")";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",service_server.processBA,(Object)((parent.mostCurrent._act_setting.getObject())),(Object)(RemoteObject.createImmutable("DownloadAppPos")));
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 495;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1592;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(8388608);
if (true) break;

case 23:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 BA.debugLineNum = 1593;BA.debugLine="ToastMessageShow(\"شما مجاز به استفاده از نرم";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شما مجاز به استفاده از نرم افزار نمی باشید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 1597;BA.debugLine="th.RunOnGuiThread(\"LoadGetSetting\",Array As O";
Debug.ShouldStop(268435456);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetSetting")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 28:
//C
this.state = 495;
;
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1603;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(4);
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1608;BA.debugLine="th.RunOnGuiThread(\"LoadGetTanzimatAndroid\",Ar";
Debug.ShouldStop(128);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetTanzimatAndroid")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 36:
//C
this.state = 495;
;
 BA.debugLineNum = 1611;BA.debugLine="GetLinkFtp";
Debug.ShouldStop(1024);
_getlinkftp();
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 1613;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 39:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 41;
}else {
this.state = 43;
}if (true) break;

case 41:
//C
this.state = 44;
 BA.debugLineNum = 1614;BA.debugLine="Log(\"اطلاعات نرم افزار ارسال نشد\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845106",RemoteObject.createImmutable("اطلاعات نرم افزار ارسال نشد"),0);
 if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 1616;BA.debugLine="Log(\"اطلاعات نرم افزار ارسال شد\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845108",RemoteObject.createImmutable("اطلاعات نرم افزار ارسال شد"),0);
 if (true) break;

case 44:
//C
this.state = 495;
;
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1619;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 47:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
 BA.debugLineNum = 1620;BA.debugLine="Log(\"خطا ارسال نشد\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845112",RemoteObject.createImmutable("خطا ارسال نشد"),0);
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1622;BA.debugLine="Log(\"خطا ارسال شد\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845114",RemoteObject.createImmutable("خطا ارسال شد"),0);
 if (true) break;

case 52:
//C
this.state = 495;
;
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 1625;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 55:
//if
this.state = 62;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 57;
}else 
{ BA.debugLineNum = 1627;BA.debugLine="Else If Str=\"Insert\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("Insert"))) { 
this.state = 59;
}else 
{ BA.debugLineNum = 1629;BA.debugLine="Else If Str=\"Update\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("Update"))) { 
this.state = 61;
}}}
if (true) break;

case 57:
//C
this.state = 62;
 BA.debugLineNum = 1626;BA.debugLine="Log(\"خطا در ارسال موقعیت مشتری\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845118",RemoteObject.createImmutable("خطا در ارسال موقعیت مشتری"),0);
 if (true) break;

case 59:
//C
this.state = 62;
 BA.debugLineNum = 1628;BA.debugLine="Log(\"موقعیت مشتری با موفقیت ثبت شد\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845120",RemoteObject.createImmutable("موقعیت مشتری با موفقیت ثبت شد"),0);
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 1630;BA.debugLine="Log(\"موقعیت مشتری بروزرسانی شد\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845122",RemoteObject.createImmutable("موقعیت مشتری بروزرسانی شد"),0);
 if (true) break;

case 62:
//C
this.state = 495;
;
 if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 1633;BA.debugLine="Dim StrCurrentDate As String = j.GetString";
Debug.ShouldStop(1);
_strcurrentdate = _j.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("StrCurrentDate", _strcurrentdate);Debug.locals.put("StrCurrentDate", _strcurrentdate);
 BA.debugLineNum = 1635;BA.debugLine="If StrCurrentDate <> \"No Result\" Then";
Debug.ShouldStop(4);
if (true) break;

case 65:
//if
this.state = 72;
if (RemoteObject.solveBoolean("!",_strcurrentdate,BA.ObjectToString("No Result"))) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 1636;BA.debugLine="datenow=StrCurrentDate";
Debug.ShouldStop(8);
parent._datenow = _strcurrentdate;
 BA.debugLineNum = 1638;BA.debugLine="If datenow.Length = 24 Then";
Debug.ShouldStop(32);
if (true) break;

case 68:
//if
this.state = 71;
if (RemoteObject.solveBoolean("=",parent._datenow.runMethod(true,"length"),BA.numberCast(double.class, 24))) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 1639;BA.debugLine="datenow=datenow.SubString2(0,23)";
Debug.ShouldStop(64);
parent._datenow = parent._datenow.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 23)));
 if (true) break;

case 71:
//C
this.state = 72;
;
 BA.debugLineNum = 1641;BA.debugLine="Log(\"datenow: \"&datenow)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845133",RemoteObject.concat(RemoteObject.createImmutable("datenow: "),parent._datenow),0);
 if (true) break;
;
 BA.debugLineNum = 1644;BA.debugLine="If	Act_Main.NoeGet=\"MojoodiAnbar\" Then";
Debug.ShouldStop(2048);

case 72:
//if
this.state = 79;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._act_main._noeget /*RemoteObject*/ ,BA.ObjectToString("MojoodiAnbar"))) { 
this.state = 74;
}else 
{ BA.debugLineNum = 1646;BA.debugLine="Else If Act_Main.NoeGet=\"UpdateFee\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._act_main._noeget /*RemoteObject*/ ,BA.ObjectToString("UpdateFee"))) { 
this.state = 76;
}else {
this.state = 78;
}}
if (true) break;

case 74:
//C
this.state = 79;
 BA.debugLineNum = 1645;BA.debugLine="GetKala";
Debug.ShouldStop(4096);
_getkala();
 if (true) break;

case 76:
//C
this.state = 79;
 BA.debugLineNum = 1647;BA.debugLine="GetFee";
Debug.ShouldStop(16384);
_getfee();
 if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 1649;BA.debugLine="GetSetting";
Debug.ShouldStop(65536);
_getsetting();
 if (true) break;

case 79:
//C
this.state = 495;
;
 if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 1653;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 82:
//if
this.state = 87;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 84;
}else {
this.state = 86;
}if (true) break;

case 84:
//C
this.state = 87;
 BA.debugLineNum = 1654;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohKala\")";
Debug.ShouldStop(2097152);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGoroohKala")));
 BA.debugLineNum = 1655;BA.debugLine="ToastMessageShow(\"گروه کالا موجود نمی باشد\",T";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گروه کالا موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 86:
//C
this.state = 87;
 BA.debugLineNum = 1658;BA.debugLine="th.RunOnGuiThread(\"LoadGetGoroohKala\",Array A";
Debug.ShouldStop(33554432);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetGoroohKala")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 87:
//C
this.state = 495;
;
 BA.debugLineNum = 1661;BA.debugLine="GetKala";
Debug.ShouldStop(268435456);
_getkala();
 if (true) break;

case 89:
//C
this.state = 90;
 BA.debugLineNum = 1663;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 90:
//if
this.state = 95;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 92;
}else {
this.state = 94;
}if (true) break;

case 92:
//C
this.state = 95;
 BA.debugLineNum = 1664;BA.debugLine="MCode.SaveUpdate(\"Delete From TblKala\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblKala")));
 BA.debugLineNum = 1665;BA.debugLine="ToastMessageShow(\"کالا موجود نمی باشد\",True)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کالا موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 94:
//C
this.state = 95;
 BA.debugLineNum = 1668;BA.debugLine="th.RunOnGuiThread(\"LoadGetKala\",Array As Obje";
Debug.ShouldStop(8);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetKala")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 95:
//C
this.state = 495;
;
 BA.debugLineNum = 1672;BA.debugLine="GetGoroohAshkhas";
Debug.ShouldStop(128);
_getgoroohashkhas();
 if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 1677;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 98:
//if
this.state = 103;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 100;
}else {
this.state = 102;
}if (true) break;

case 100:
//C
this.state = 103;
 BA.debugLineNum = 1678;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGoroohAshkha";
Debug.ShouldStop(8192);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGoroohAshkhas")));
 BA.debugLineNum = 1679;BA.debugLine="ToastMessageShow(\"گروه اشخاص موجود نمی باشد\",";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گروه اشخاص موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 102:
//C
this.state = 103;
 BA.debugLineNum = 1682;BA.debugLine="th.RunOnGuiThread(\"LoadGetGoroohAshkhas\",Arra";
Debug.ShouldStop(131072);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetGoroohAshkhas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 103:
//C
this.state = 495;
;
 BA.debugLineNum = 1686;BA.debugLine="GetAshkhas";
Debug.ShouldStop(2097152);
_getashkhas();
 if (true) break;

case 105:
//C
this.state = 106;
 BA.debugLineNum = 1688;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(8388608);
if (true) break;

case 106:
//if
this.state = 111;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 108;
}else {
this.state = 110;
}if (true) break;

case 108:
//C
this.state = 111;
 BA.debugLineNum = 1689;BA.debugLine="MCode.SaveUpdate(\"Delete From TblNotifi\")";
Debug.ShouldStop(16777216);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblNotifi")));
 if (true) break;

case 110:
//C
this.state = 111;
 BA.debugLineNum = 1693;BA.debugLine="th.RunOnGuiThread(\"LoadGetAllNotification\",Ar";
Debug.ShouldStop(268435456);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetAllNotification")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 111:
//C
this.state = 495;
;
 BA.debugLineNum = 1696;BA.debugLine="GetGalleryKala";
Debug.ShouldStop(-2147483648);
_getgallerykala();
 if (true) break;

case 113:
//C
this.state = 114;
 BA.debugLineNum = 1698;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(2);
if (true) break;

case 114:
//if
this.state = 119;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 116;
}else {
this.state = 118;
}if (true) break;

case 116:
//C
this.state = 119;
 BA.debugLineNum = 1699;BA.debugLine="MCode.SaveUpdate(\"Delete From tblGalleryPic\")";
Debug.ShouldStop(4);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblGalleryPic")));
 BA.debugLineNum = 1700;BA.debugLine="ToastMessageShow(\"گالری تصاویر موجود نمی باشد";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گالری تصاویر موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 118:
//C
this.state = 119;
 BA.debugLineNum = 1703;BA.debugLine="th.RunOnGuiThread(\"LoadGetGalleryKala\",Array";
Debug.ShouldStop(64);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetGalleryKala")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 119:
//C
this.state = 495;
;
 BA.debugLineNum = 1707;BA.debugLine="GetEshantion2";
Debug.ShouldStop(1024);
_geteshantion2();
 if (true) break;

case 121:
//C
this.state = 122;
 BA.debugLineNum = 1709;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 122:
//if
this.state = 127;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 124;
}else {
this.state = 126;
}if (true) break;

case 124:
//C
this.state = 127;
 BA.debugLineNum = 1710;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionTab";
Debug.ShouldStop(8192);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblEshantionTabaghati")));
 BA.debugLineNum = 1711;BA.debugLine="ToastMessageShow(\"اشانتیون موجود نمی باشد\",Tr";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اشانتیون موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 126:
//C
this.state = 127;
 BA.debugLineNum = 1716;BA.debugLine="th.RunOnGuiThread(\"LoadGetEshantion2\",Array A";
Debug.ShouldStop(524288);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetEshantion2")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 127:
//C
this.state = 495;
;
 BA.debugLineNum = 1718;BA.debugLine="GetDaftarchTell";
Debug.ShouldStop(2097152);
_getdaftarchtell();
 if (true) break;

case 129:
//C
this.state = 130;
 BA.debugLineNum = 1720;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(8388608);
if (true) break;

case 130:
//if
this.state = 135;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 132;
}else {
this.state = 134;
}if (true) break;

case 132:
//C
this.state = 135;
 BA.debugLineNum = 1721;BA.debugLine="MCode.SaveUpdate(\"Delete From tblDaftarcheTel";
Debug.ShouldStop(16777216);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblDaftarcheTell")));
 BA.debugLineNum = 1722;BA.debugLine="ToastMessageShow(\"دفترچه تلفن موجود نمی باشد\"";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دفترچه تلفن موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 134:
//C
this.state = 135;
 BA.debugLineNum = 1728;BA.debugLine="th.RunOnGuiThread(\"LoadGetDaftarchTell\",Array";
Debug.ShouldStop(-2147483648);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetDaftarchTell")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 135:
//C
this.state = 495;
;
 BA.debugLineNum = 1730;BA.debugLine="GetGroupDastrasiAshkhas";
Debug.ShouldStop(2);
_getgroupdastrasiashkhas();
 if (true) break;

case 137:
//C
this.state = 138;
 BA.debugLineNum = 1733;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16);
if (true) break;

case 138:
//if
this.state = 143;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 140;
}else {
this.state = 142;
}if (true) break;

case 140:
//C
this.state = 143;
 BA.debugLineNum = 1734;BA.debugLine="MCode.SaveUpdate(\"Delete From tblGroupDastras";
Debug.ShouldStop(32);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblGroupDastrasi")));
 if (true) break;

case 142:
//C
this.state = 143;
 BA.debugLineNum = 1741;BA.debugLine="th.RunOnGuiThread(\"LoadGetGroupDastrasiAshkha";
Debug.ShouldStop(4096);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetGroupDastrasiAshkhas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 143:
//C
this.state = 495;
;
 BA.debugLineNum = 1743;BA.debugLine="GetEshantionGroup";
Debug.ShouldStop(16384);
_geteshantiongroup();
 if (true) break;

case 145:
//C
this.state = 146;
 BA.debugLineNum = 1745;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 146:
//if
this.state = 151;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 148;
}else {
this.state = 150;
}if (true) break;

case 148:
//C
this.state = 151;
 BA.debugLineNum = 1746;BA.debugLine="MCode.SaveUpdate(\"Delete From tblEshantionGro";
Debug.ShouldStop(131072);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From tblEshantionGroup")));
 BA.debugLineNum = 1747;BA.debugLine="ToastMessageShow(\"اشانتیون گروهی موجود نمی با";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اشانتیون گروهی موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 150:
//C
this.state = 151;
 BA.debugLineNum = 1751;BA.debugLine="th.RunOnGuiThread(\"LoadGetEshantionGroup\",Arr";
Debug.ShouldStop(4194304);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetEshantionGroup")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;
;
 BA.debugLineNum = 1755;BA.debugLine="If MCode.Visitor=1 Then";
Debug.ShouldStop(67108864);

case 151:
//if
this.state = 168;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._visitor /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 153;
}else {
this.state = 155;
}if (true) break;

case 153:
//C
this.state = 168;
 BA.debugLineNum = 1756;BA.debugLine="GetReportRizePishFactor3";
Debug.ShouldStop(134217728);
_getreportrizepishfactor3();
 if (true) break;

case 155:
//C
this.state = 156;
 BA.debugLineNum = 1758;BA.debugLine="If MCode.Tozie=1 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 156:
//if
this.state = 167;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._tozie /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 158;
}else {
this.state = 160;
}if (true) break;

case 158:
//C
this.state = 167;
 BA.debugLineNum = 1759;BA.debugLine="GetHavaleByUser";
Debug.ShouldStop(1073741824);
_gethavalebyuser();
 if (true) break;

case 160:
//C
this.state = 161;
 BA.debugLineNum = 1761;BA.debugLine="If MCode.Daryaft=1 Then";
Debug.ShouldStop(1);
if (true) break;

case 161:
//if
this.state = 166;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._daryaft /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 163;
}else {
this.state = 165;
}if (true) break;

case 163:
//C
this.state = 166;
 BA.debugLineNum = 1762;BA.debugLine="GetDaryaft";
Debug.ShouldStop(2);
_getdaryaft();
 if (true) break;

case 165:
//C
this.state = 166;
 BA.debugLineNum = 1764;BA.debugLine="MCode.GetDataStatus=False";
Debug.ShouldStop(8);
parent.mostCurrent._mcode._getdatastatus /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1765;BA.debugLine="StartService(Service_Helper)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("StartService",service_server.processBA,(Object)((parent.mostCurrent._service_helper.getObject())));
 BA.debugLineNum = 1766;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 166:
//C
this.state = 167;
;
 if (true) break;

case 167:
//C
this.state = 168;
;
 if (true) break;

case 168:
//C
this.state = 495;
;
 if (true) break;

case 170:
//C
this.state = 171;
 BA.debugLineNum = 1775;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 171:
//if
this.state = 176;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 173;
}else {
this.state = 175;
}if (true) break;

case 173:
//C
this.state = 176;
 BA.debugLineNum = 1777;BA.debugLine="ToastMessageShow(\"سفارش موجود نمی باشد\",True)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 175:
//C
this.state = 176;
 BA.debugLineNum = 1781;BA.debugLine="th.RunOnGuiThread(\"LoadGetReportRizePishFacto";
Debug.ShouldStop(1048576);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetReportRizePishFactor3")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;
;
 BA.debugLineNum = 1787;BA.debugLine="If MCode.Tozie=1 Then";
Debug.ShouldStop(67108864);

case 176:
//if
this.state = 187;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._tozie /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 178;
}else {
this.state = 180;
}if (true) break;

case 178:
//C
this.state = 187;
 BA.debugLineNum = 1788;BA.debugLine="GetHavaleByUser";
Debug.ShouldStop(134217728);
_gethavalebyuser();
 if (true) break;

case 180:
//C
this.state = 181;
 BA.debugLineNum = 1790;BA.debugLine="If MCode.Daryaft=1 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 181:
//if
this.state = 186;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._daryaft /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 183;
}else {
this.state = 185;
}if (true) break;

case 183:
//C
this.state = 186;
 BA.debugLineNum = 1791;BA.debugLine="GetBankMa";
Debug.ShouldStop(1073741824);
_getbankma();
 if (true) break;

case 185:
//C
this.state = 186;
 BA.debugLineNum = 1793;BA.debugLine="MCode.GetDataStatus=False";
Debug.ShouldStop(1);
parent.mostCurrent._mcode._getdatastatus /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1794;BA.debugLine="StartService(Service_Helper)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("StartService",service_server.processBA,(Object)((parent.mostCurrent._service_helper.getObject())));
 BA.debugLineNum = 1795;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 186:
//C
this.state = 187;
;
 if (true) break;

case 187:
//C
this.state = 495;
;
 if (true) break;

case 189:
//C
this.state = 190;
 BA.debugLineNum = 1801;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(256);
if (true) break;

case 190:
//if
this.state = 195;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 192;
}else {
this.state = 194;
}if (true) break;

case 192:
//C
this.state = 195;
 if (true) break;

case 194:
//C
this.state = 195;
 BA.debugLineNum = 1808;BA.debugLine="th.RunOnGuiThread(\"LoadGetGetHavale\",Array As";
Debug.ShouldStop(32768);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetGetHavale")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 195:
//C
this.state = 495;
;
 BA.debugLineNum = 1812;BA.debugLine="ShowRizeFactorForooshByHavale";
Debug.ShouldStop(524288);
_showrizefactorforooshbyhavale();
 if (true) break;

case 197:
//C
this.state = 198;
 BA.debugLineNum = 1814;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 198:
//if
this.state = 209;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 200;
}else {
this.state = 208;
}if (true) break;

case 200:
//C
this.state = 201;
 BA.debugLineNum = 1816;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * Fro";
Debug.ShouldStop(8388608);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Select * From TblAshkhasNew")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1817;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 201:
//if
this.state = 206;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 203;
}else {
this.state = 205;
}if (true) break;

case 203:
//C
this.state = 206;
 BA.debugLineNum = 1818;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas whe";
Debug.ShouldStop(33554432);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblAshkhas where length(FldCodeTafzili)<6")));
 if (true) break;

case 205:
//C
this.state = 206;
 BA.debugLineNum = 1820;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas\")";
Debug.ShouldStop(134217728);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblAshkhas")));
 if (true) break;

case 206:
//C
this.state = 209;
;
 BA.debugLineNum = 1822;BA.debugLine="ToastMessageShow(\"شخصی موجود نمی باشد\",True)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شخصی موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 208:
//C
this.state = 209;
 BA.debugLineNum = 1825;BA.debugLine="th.RunOnGuiThread(\"LoadGetAshkhas\",Array As O";
Debug.ShouldStop(1);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetAshkhas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 209:
//C
this.state = 495;
;
 BA.debugLineNum = 1828;BA.debugLine="GetFee";
Debug.ShouldStop(8);
_getfee();
 if (true) break;

case 211:
//C
this.state = 212;
 BA.debugLineNum = 1831;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(64);
if (true) break;

case 212:
//if
this.state = 217;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 214;
}else {
this.state = 216;
}if (true) break;

case 214:
//C
this.state = 217;
 BA.debugLineNum = 1832;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFee\")";
Debug.ShouldStop(128);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblFee")));
 BA.debugLineNum = 1833;BA.debugLine="ToastMessageShow(\"لیست چند قیمت موجود نمی باش";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لیست چند قیمت موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 216:
//C
this.state = 217;
 BA.debugLineNum = 1836;BA.debugLine="th.RunOnGuiThread(\"LoadGetFee\",Array As Objec";
Debug.ShouldStop(2048);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetFee")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 217:
//C
this.state = 495;
;
 BA.debugLineNum = 1839;BA.debugLine="GetTasvie";
Debug.ShouldStop(16384);
_gettasvie();
 if (true) break;

case 219:
//C
this.state = 220;
 BA.debugLineNum = 1841;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 220:
//if
this.state = 225;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 222;
}else {
this.state = 224;
}if (true) break;

case 222:
//C
this.state = 225;
 BA.debugLineNum = 1842;BA.debugLine="MCode.SaveUpdate(\"Delete From TblTasvie\")";
Debug.ShouldStop(131072);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblTasvie")));
 BA.debugLineNum = 1843;BA.debugLine="Dim code As String=\"1000\"";
Debug.ShouldStop(262144);
_code = BA.ObjectToString("1000");Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 1844;BA.debugLine="Dim name As String=\"نقدی\"";
Debug.ShouldStop(524288);
_name = BA.ObjectToString("نقدی");Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1846;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblTasvie (FldC";
Debug.ShouldStop(2097152);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblTasvie (FldCode,FldName) Values ('"),_code,RemoteObject.createImmutable("','"),_name,RemoteObject.createImmutable("')"))));
 if (true) break;

case 224:
//C
this.state = 225;
 BA.debugLineNum = 1851;BA.debugLine="th.RunOnGuiThread(\"LoadGetTasvie\",Array As Ob";
Debug.ShouldStop(67108864);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetTasvie")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 225:
//C
this.state = 495;
;
 BA.debugLineNum = 1854;BA.debugLine="MCode.SaveUpdate(\"Update TblSetting Set FldDat";
Debug.ShouldStop(536870912);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set FldDateUpdate='"),parent._datenow,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 1857;BA.debugLine="GetTourVisitor";
Debug.ShouldStop(1);
_gettourvisitor();
 if (true) break;

case 227:
//C
this.state = 228;
 BA.debugLineNum = 1859;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(4);
if (true) break;

case 228:
//if
this.state = 233;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 230;
}else {
this.state = 232;
}if (true) break;

case 230:
//C
this.state = 233;
 BA.debugLineNum = 1861;BA.debugLine="ToastMessageShow(\"تور ویزیت موجود نمی باشد\",T";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تور ویزیت موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 232:
//C
this.state = 233;
 BA.debugLineNum = 1864;BA.debugLine="LoadGetTourVisitor(Str)";
Debug.ShouldStop(128);
_loadgettourvisitor(_str);
 if (true) break;
;
 BA.debugLineNum = 1867;BA.debugLine="If MCode.NoeGet=\"GetTourVisitor\" Then";
Debug.ShouldStop(1024);

case 233:
//if
this.state = 238;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._noeget /*RemoteObject*/ ,BA.ObjectToString("GetTourVisitor"))) { 
this.state = 235;
}else {
this.state = 237;
}if (true) break;

case 235:
//C
this.state = 238;
 BA.debugLineNum = 1868;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 237:
//C
this.state = 238;
 BA.debugLineNum = 1870;BA.debugLine="GetTanzimatAndroid";
Debug.ShouldStop(8192);
_gettanzimatandroid();
 if (true) break;

case 238:
//C
this.state = 495;
;
 if (true) break;

case 240:
//C
this.state = 241;
 BA.debugLineNum = 1875;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 241:
//if
this.state = 246;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 243;
}else {
this.state = 245;
}if (true) break;

case 243:
//C
this.state = 246;
 BA.debugLineNum = 1877;BA.debugLine="SendTokenId";
Debug.ShouldStop(1048576);
_sendtokenid();
 if (true) break;

case 245:
//C
this.state = 246;
 BA.debugLineNum = 1879;BA.debugLine="MCode.CodeMoshtari=Str";
Debug.ShouldStop(4194304);
parent.mostCurrent._mcode._codemoshtari /*RemoteObject*/  = _str;
 if (true) break;

case 246:
//C
this.state = 495;
;
 BA.debugLineNum = 1883;BA.debugLine="SendTokenId";
Debug.ShouldStop(67108864);
_sendtokenid();
 if (true) break;

case 248:
//C
this.state = 249;
 BA.debugLineNum = 1885;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(268435456);
if (true) break;

case 249:
//if
this.state = 256;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 251;
}else 
{ BA.debugLineNum = 1889;BA.debugLine="Else If Str=\"No Active\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Active"))) { 
this.state = 253;
}else {
this.state = 255;
}}
if (true) break;

case 251:
//C
this.state = 256;
 BA.debugLineNum = 1887;BA.debugLine="MCode.Vaziat=0";
Debug.ShouldStop(1073741824);
parent.mostCurrent._mcode._vaziat /*RemoteObject*/  = BA.numberCast(int.class, 0);
 if (true) break;

case 253:
//C
this.state = 256;
 BA.debugLineNum = 1890;BA.debugLine="Dim Query As String=\"Update TblSetting Set Fl";
Debug.ShouldStop(2);
_query = BA.ObjectToString("Update TblSetting Set FldVaziat = '0'");Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 1891;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(4);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(_query));
 BA.debugLineNum = 1894;BA.debugLine="MCode.Vaziat=0";
Debug.ShouldStop(32);
parent.mostCurrent._mcode._vaziat /*RemoteObject*/  = BA.numberCast(int.class, 0);
 if (true) break;

case 255:
//C
this.state = 256;
 BA.debugLineNum = 1897;BA.debugLine="th.RunOnGuiThread(\"LoadGetVaziat\",Array As Ob";
Debug.ShouldStop(256);
parent._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadGetVaziat")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 if (true) break;

case 256:
//C
this.state = 495;
;
 BA.debugLineNum = 1900;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1901;BA.debugLine="GetSetting";
Debug.ShouldStop(4096);
_getsetting();
 if (true) break;

case 258:
//C
this.state = 259;
 BA.debugLineNum = 1907;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 259:
//if
this.state = 266;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 261;
}else 
{ BA.debugLineNum = 1910;BA.debugLine="Else If Str =\"Is Exist\" Or Str=\"OK\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("Is Exist")) || RemoteObject.solveBoolean("=",_str,BA.ObjectToString("OK"))) { 
this.state = 263;
}else {
this.state = 265;
}}
if (true) break;

case 261:
//C
this.state = 266;
 BA.debugLineNum = 1908;BA.debugLine="ToastMessageShow(\"اطلاعات ارسال شده صحیح نیست";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعات ارسال شده صحیح نیست ")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1909;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 263:
//C
this.state = 266;
 BA.debugLineNum = 1911;BA.debugLine="GetVaziat";
Debug.ShouldStop(4194304);
_getvaziat();
 if (true) break;

case 265:
//C
this.state = 266;
 BA.debugLineNum = 1913;BA.debugLine="MCode.SaveUpdate(\"update TblSetting Set FldTo";
Debug.ShouldStop(16777216);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("update TblSetting Set FldTokenId='"),parent.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("' and FldCodeMoshtari='"),parent.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ,RemoteObject.createImmutable("' and FldNameVisitor='"),parent.mostCurrent._mcode._n_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 1915;BA.debugLine="ToastMessageShow(\"درخواست فعالسازی با موفقیت";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("درخواست فعالسازی با موفقیت ارسال گردید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 266:
//C
this.state = 495;
;
 if (true) break;

case 268:
//C
this.state = 269;
 BA.debugLineNum = 1918;BA.debugLine="If Str = \"Ok\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 269:
//if
this.state = 280;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("Ok"))) { 
this.state = 271;
}else {
this.state = 279;
}if (true) break;

case 271:
//C
this.state = 272;
 BA.debugLineNum = 1919;BA.debugLine="If shomareFactorSelect>0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 272:
//if
this.state = 277;
if (RemoteObject.solveBoolean(">",parent._shomarefactorselect,BA.numberCast(double.class, 0))) { 
this.state = 274;
}else {
this.state = 276;
}if (true) break;

case 274:
//C
this.state = 277;
 BA.debugLineNum = 1920;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set FldSe";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblFaktor Set FldSend='1',FldSync='True' where FldShomareFaktor="),parent._shomarefactorselect)));
 if (true) break;

case 276:
//C
this.state = 277;
 BA.debugLineNum = 1922;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set FldSe";
Debug.ShouldStop(2);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Update TblFaktor Set FldSend='1',FldSync='True'")));
 if (true) break;

case 277:
//C
this.state = 280;
;
 BA.debugLineNum = 1925;BA.debugLine="ToastMessageShow(\"فاکتور با موفقیت ارسال گردی";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فاکتور با موفقیت ارسال گردید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 279:
//C
this.state = 280;
 BA.debugLineNum = 1927;BA.debugLine="ToastMessageShow(\"خطا در ارسال فاکتور\",True)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در ارسال فاکتور")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 280:
//C
this.state = 495;
;
 BA.debugLineNum = 1929;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 282:
//C
this.state = 283;
 BA.debugLineNum = 1933;BA.debugLine="If Str = \"ok\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 283:
//if
this.state = 288;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("ok"))) { 
this.state = 285;
}else {
this.state = 287;
}if (true) break;

case 285:
//C
this.state = 288;
 BA.debugLineNum = 1935;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set f";
Debug.ShouldStop(16384);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update tblTourVisitor Set fldSend='True' where fldDateVisit='"),parent.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,service_server.processBA),RemoteObject.createImmutable("' and fldSend='False'"))));
 BA.debugLineNum = 1938;BA.debugLine="Log(\"تور ویزیت با موفقیت ارسال گردید\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845430",RemoteObject.createImmutable("تور ویزیت با موفقیت ارسال گردید"),0);
 if (true) break;

case 287:
//C
this.state = 288;
 BA.debugLineNum = 1940;BA.debugLine="ToastMessageShow(\"خطا در ارسال تور ویزیت\",Tru";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در ارسال تور ویزیت")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 288:
//C
this.state = 495;
;
 if (true) break;

case 290:
//C
this.state = 291;
 BA.debugLineNum = 1946;BA.debugLine="If Str = \"Ok\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 291:
//if
this.state = 316;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("Ok"))) { 
this.state = 293;
}else {
this.state = 315;
}if (true) break;

case 293:
//C
this.state = 294;
 BA.debugLineNum = 1947;BA.debugLine="ToastMessageShow(\"اشخاص جدید با موفقیت ارسال";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اشخاص جدید با موفقیت ارسال گردید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1951;BA.debugLine="If Sendtype=\"Daryaft\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 294:
//if
this.state = 313;
if (RemoteObject.solveBoolean("=",parent._sendtype,BA.ObjectToString("Daryaft"))) { 
this.state = 296;
}else 
{ BA.debugLineNum = 1955;BA.debugLine="Else if Sendtype=\"Faktor\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",parent._sendtype,BA.ObjectToString("Faktor"))) { 
this.state = 298;
}else 
{ BA.debugLineNum = 1963;BA.debugLine="Else If Sendtype=\"SendAshkhasNew\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",parent._sendtype,BA.ObjectToString("SendAshkhasNew"))) { 
this.state = 306;
}}}
if (true) break;

case 296:
//C
this.state = 313;
 BA.debugLineNum = 1952;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldS";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set FldSync='True' where fldCodetafzili="),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(" and FldSync='False'"))));
 BA.debugLineNum = 1953;BA.debugLine="SendDaryaft(dt1,dt2)";
Debug.ShouldStop(1);
_senddaryaft(parent._dt1,parent._dt2);
 if (true) break;

case 298:
//C
this.state = 299;
 BA.debugLineNum = 1956;BA.debugLine="If shomareFactorSelect>0 Then";
Debug.ShouldStop(8);
if (true) break;

case 299:
//if
this.state = 304;
if (RemoteObject.solveBoolean(">",parent._shomarefactorselect,BA.numberCast(double.class, 0))) { 
this.state = 301;
}else {
this.state = 303;
}if (true) break;

case 301:
//C
this.state = 304;
 BA.debugLineNum = 1957;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set Fld";
Debug.ShouldStop(16);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set FldSync='True' where fldCodetafzili="),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(" and FldSync='False'"))));
 BA.debugLineNum = 1958;BA.debugLine="LoadSendFaktor(shomareFactorSelect)";
Debug.ShouldStop(32);
_loadsendfaktor(BA.NumberToString(parent._shomarefactorselect));
 if (true) break;

case 303:
//C
this.state = 304;
 BA.debugLineNum = 1960;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set  Fl";
Debug.ShouldStop(128);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Update TblAshkhas Set  FldSync='True' where  FldSync='False'")));
 BA.debugLineNum = 1961;BA.debugLine="LoadSendFaktorAll";
Debug.ShouldStop(256);
_loadsendfaktorall();
 if (true) break;

case 304:
//C
this.state = 313;
;
 if (true) break;

case 306:
//C
this.state = 307;
 BA.debugLineNum = 1964;BA.debugLine="If MCode.C_Tafzili=0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 307:
//if
this.state = 312;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,BA.NumberToString(0))) { 
this.state = 309;
}else {
this.state = 311;
}if (true) break;

case 309:
//C
this.state = 312;
 BA.debugLineNum = 1966;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set  Fl";
Debug.ShouldStop(8192);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Update TblAshkhas Set  FldSync='True' where  FldSync='False'")));
 if (true) break;

case 311:
//C
this.state = 312;
 BA.debugLineNum = 1969;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set Fld";
Debug.ShouldStop(65536);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set FldSync='True' where fldCodetafzili="),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(" and FldSync='False'"))));
 if (true) break;

case 312:
//C
this.state = 313;
;
 if (true) break;

case 313:
//C
this.state = 316;
;
 if (true) break;

case 315:
//C
this.state = 316;
 BA.debugLineNum = 1973;BA.debugLine="ToastMessageShow(\"خطا در ارسال اشخاص جدید\",Tr";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در ارسال اشخاص جدید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 316:
//C
this.state = 495;
;
 if (true) break;

case 318:
//C
this.state = 319;
 BA.debugLineNum = 1977;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 319:
//if
this.state = 324;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 321;
}else {
this.state = 323;
}if (true) break;

case 321:
//C
this.state = 324;
 BA.debugLineNum = 1979;BA.debugLine="ToastMessageShow(\"گزارشی موجود نمی باشد\",True";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارشی موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 323:
//C
this.state = 324;
 BA.debugLineNum = 1981;BA.debugLine="LoadGetReportVisitor(Str)";
Debug.ShouldStop(268435456);
_loadgetreportvisitor(_str);
 if (true) break;

case 324:
//C
this.state = 495;
;
 BA.debugLineNum = 1985;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 326:
//C
this.state = 327;
 BA.debugLineNum = 1988;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(8);
if (true) break;

case 327:
//if
this.state = 332;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 329;
}else {
this.state = 331;
}if (true) break;

case 329:
//C
this.state = 332;
 BA.debugLineNum = 1990;BA.debugLine="ToastMessageShow(\"اطلاعات مسیریابی موجود نمی";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعات مسیریابی موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 331:
//C
this.state = 332;
 BA.debugLineNum = 1992;BA.debugLine="LoadGetListGpsVisitor(Str)";
Debug.ShouldStop(128);
_loadgetlistgpsvisitor(_str);
 if (true) break;

case 332:
//C
this.state = 495;
;
 BA.debugLineNum = 1997;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 334:
//C
this.state = 335;
 BA.debugLineNum = 1999;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 335:
//if
this.state = 340;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 337;
}else {
this.state = 339;
}if (true) break;

case 337:
//C
this.state = 340;
 BA.debugLineNum = 2001;BA.debugLine="ToastMessageShow(\"گزارشی موجود نمی باشد\",True";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارشی موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 339:
//C
this.state = 340;
 BA.debugLineNum = 2003;BA.debugLine="LoadGetReportMoshtari(Str)";
Debug.ShouldStop(262144);
_loadgetreportmoshtari(_str);
 if (true) break;

case 340:
//C
this.state = 495;
;
 BA.debugLineNum = 2008;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 342:
//C
this.state = 343;
 BA.debugLineNum = 2011;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 343:
//if
this.state = 348;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 345;
}else {
this.state = 347;
}if (true) break;

case 345:
//C
this.state = 348;
 BA.debugLineNum = 2013;BA.debugLine="ToastMessageShow(\"گزارشی موجود نمی باشد\",True";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارشی موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 347:
//C
this.state = 348;
 BA.debugLineNum = 2015;BA.debugLine="LoadGetReportFactor(Str)";
Debug.ShouldStop(1073741824);
_loadgetreportfactor(_str);
 if (true) break;

case 348:
//C
this.state = 495;
;
 BA.debugLineNum = 2020;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 350:
//C
this.state = 351;
 BA.debugLineNum = 2022;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(32);
if (true) break;

case 351:
//if
this.state = 356;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 353;
}else {
this.state = 355;
}if (true) break;

case 353:
//C
this.state = 356;
 BA.debugLineNum = 2024;BA.debugLine="ToastMessageShow(\"گزارشی موجود نمی باشد\",True";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارشی موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 355:
//C
this.state = 356;
 BA.debugLineNum = 2026;BA.debugLine="LoadGetReportRizePishFactor(Str)";
Debug.ShouldStop(512);
_loadgetreportrizepishfactor(_str);
 if (true) break;

case 356:
//C
this.state = 495;
;
 BA.debugLineNum = 2029;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 358:
//C
this.state = 359;
 BA.debugLineNum = 2031;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 359:
//if
this.state = 364;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 361;
}else {
this.state = 363;
}if (true) break;

case 361:
//C
this.state = 364;
 BA.debugLineNum = 2032;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSooratHesab\"";
Debug.ShouldStop(32768);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblSooratHesab")));
 BA.debugLineNum = 2033;BA.debugLine="ToastMessageShow(\"صورت حساب موجود نمی باشد\",T";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("صورت حساب موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 363:
//C
this.state = 364;
 BA.debugLineNum = 2035;BA.debugLine="LoadGetSooratHesab(Str)";
Debug.ShouldStop(262144);
_loadgetsoorathesab(_str);
 if (true) break;

case 364:
//C
this.state = 495;
;
 if (true) break;

case 366:
//C
this.state = 367;
 BA.debugLineNum = 2041;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 367:
//if
this.state = 372;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 369;
}else {
this.state = 371;
}if (true) break;

case 369:
//C
this.state = 372;
 BA.debugLineNum = 2042;BA.debugLine="MCode.SaveUpdate(\"Delete From TblVisitor\")";
Debug.ShouldStop(33554432);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Delete From TblVisitor")));
 BA.debugLineNum = 2043;BA.debugLine="ToastMessageShow(\"لیست ویزیتور موجود نمی باشد";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لیست ویزیتور موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2044;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 371:
//C
this.state = 372;
 BA.debugLineNum = 2046;BA.debugLine="LoadGetVisitor(Str)";
Debug.ShouldStop(536870912);
_loadgetvisitor(_str);
 if (true) break;
;
 BA.debugLineNum = 2048;BA.debugLine="Select MCode.page";
Debug.ShouldStop(-2147483648);

case 372:
//select
this.state = 377;
switch (BA.switchObjectToInt(parent.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_RepFactorVisitor"),BA.ObjectToString("Act_LocationVisitor"))) {
case 0: {
this.state = 374;
if (true) break;
}
case 1: {
this.state = 376;
if (true) break;
}
}
if (true) break;

case 374:
//C
this.state = 377;
 BA.debugLineNum = 2050;BA.debugLine="CallSubDelayed(Act_RepFactorVisitor,\"LoadDat";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",service_server.processBA,(Object)((parent.mostCurrent._act_repfactorvisitor.getObject())),(Object)(RemoteObject.createImmutable("LoadData")));
 if (true) break;

case 376:
//C
this.state = 377;
 BA.debugLineNum = 2052;BA.debugLine="CallSubDelayed(Act_LocationVisitor,\"LoadVisi";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",service_server.processBA,(Object)((parent.mostCurrent._act_locationvisitor.getObject())),(Object)(RemoteObject.createImmutable("LoadVisitor")));
 if (true) break;

case 377:
//C
this.state = 495;
;
 if (true) break;

case 379:
//C
this.state = 380;
 BA.debugLineNum = 2055;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(64);
if (true) break;

case 380:
//if
this.state = 385;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 382;
}else {
this.state = 384;
}if (true) break;

case 382:
//C
this.state = 385;
 BA.debugLineNum = 2057;BA.debugLine="ToastMessageShow(\"گزارش سفارش ویزیتور موجود ن";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارش سفارش ویزیتور موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 384:
//C
this.state = 385;
 BA.debugLineNum = 2059;BA.debugLine="LoadGetReportFactorVisitor(Str)";
Debug.ShouldStop(1024);
_loadgetreportfactorvisitor(_str);
 if (true) break;

case 385:
//C
this.state = 495;
;
 BA.debugLineNum = 2062;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 387:
//C
this.state = 388;
 BA.debugLineNum = 2065;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 388:
//if
this.state = 393;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 390;
}else {
this.state = 392;
}if (true) break;

case 390:
//C
this.state = 393;
 BA.debugLineNum = 2067;BA.debugLine="ToastMessageShow(\"گزارش سفارش ویزیتور موجود ن";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گزارش سفارش ویزیتور موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 392:
//C
this.state = 393;
 BA.debugLineNum = 2069;BA.debugLine="LoadGetReportRizFactorVisitor(Str)";
Debug.ShouldStop(1048576);
_loadgetreportrizfactorvisitor(_str);
 if (true) break;

case 393:
//C
this.state = 495;
;
 BA.debugLineNum = 2072;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 395:
//C
this.state = 396;
 BA.debugLineNum = 2074;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 396:
//if
this.state = 401;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 398;
}else {
this.state = 400;
}if (true) break;

case 398:
//C
this.state = 401;
 if (true) break;

case 400:
//C
this.state = 401;
 BA.debugLineNum = 2078;BA.debugLine="LoadShowFactorForooshByHavale(Str)";
Debug.ShouldStop(536870912);
_loadshowfactorforooshbyhavale(_str);
 if (true) break;

case 401:
//C
this.state = 495;
;
 if (true) break;

case 403:
//C
this.state = 404;
 BA.debugLineNum = 2082;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(2);
if (true) break;

case 404:
//if
this.state = 409;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 406;
}else {
this.state = 408;
}if (true) break;

case 406:
//C
this.state = 409;
 if (true) break;

case 408:
//C
this.state = 409;
 BA.debugLineNum = 2086;BA.debugLine="LoadShowRizeFactorForooshByHavale(Str)";
Debug.ShouldStop(32);
_loadshowrizefactorforooshbyhavale(_str);
 if (true) break;

case 409:
//C
this.state = 495;
;
 BA.debugLineNum = 2090;BA.debugLine="GetBankMa";
Debug.ShouldStop(512);
_getbankma();
 if (true) break;

case 411:
//C
this.state = 412;
 BA.debugLineNum = 2092;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 412:
//if
this.state = 417;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 414;
}else {
this.state = 416;
}if (true) break;

case 414:
//C
this.state = 417;
 if (true) break;

case 416:
//C
this.state = 417;
 BA.debugLineNum = 2096;BA.debugLine="LoadGetBankMa(Str)";
Debug.ShouldStop(32768);
_loadgetbankma(_str);
 if (true) break;

case 417:
//C
this.state = 495;
;
 BA.debugLineNum = 2099;BA.debugLine="GetBankMoshtari";
Debug.ShouldStop(262144);
_getbankmoshtari();
 if (true) break;

case 419:
//C
this.state = 420;
 BA.debugLineNum = 2101;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 420:
//if
this.state = 425;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 422;
}else {
this.state = 424;
}if (true) break;

case 422:
//C
this.state = 425;
 if (true) break;

case 424:
//C
this.state = 425;
 BA.debugLineNum = 2105;BA.debugLine="LoadGetBankMoshtari(Str)";
Debug.ShouldStop(16777216);
_loadgetbankmoshtari(_str);
 if (true) break;

case 425:
//C
this.state = 495;
;
 BA.debugLineNum = 2108;BA.debugLine="GetSandoogh";
Debug.ShouldStop(134217728);
_getsandoogh();
 if (true) break;

case 427:
//C
this.state = 428;
 BA.debugLineNum = 2110;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 428:
//if
this.state = 433;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 430;
}else {
this.state = 432;
}if (true) break;

case 430:
//C
this.state = 433;
 if (true) break;

case 432:
//C
this.state = 433;
 BA.debugLineNum = 2114;BA.debugLine="LoadGetSandoogh(Str)";
Debug.ShouldStop(2);
_loadgetsandoogh(_str);
 if (true) break;

case 433:
//C
this.state = 495;
;
 BA.debugLineNum = 2117;BA.debugLine="GetDaryaft";
Debug.ShouldStop(16);
_getdaryaft();
 if (true) break;

case 435:
//C
this.state = 436;
 BA.debugLineNum = 2119;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(64);
if (true) break;

case 436:
//if
this.state = 441;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 438;
}else {
this.state = 440;
}if (true) break;

case 438:
//C
this.state = 441;
 if (true) break;

case 440:
//C
this.state = 441;
 BA.debugLineNum = 2123;BA.debugLine="LoadGetDaryaft(Str)";
Debug.ShouldStop(1024);
_loadgetdaryaft(_str);
 if (true) break;

case 441:
//C
this.state = 495;
;
 BA.debugLineNum = 2126;BA.debugLine="GetCheckDaryaft";
Debug.ShouldStop(8192);
_getcheckdaryaft();
 if (true) break;

case 443:
//C
this.state = 444;
 BA.debugLineNum = 2128;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 444:
//if
this.state = 449;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 446;
}else {
this.state = 448;
}if (true) break;

case 446:
//C
this.state = 449;
 if (true) break;

case 448:
//C
this.state = 449;
 BA.debugLineNum = 2132;BA.debugLine="LoadGetCheckDaryaft(Str)";
Debug.ShouldStop(524288);
_loadgetcheckdaryaft(_str);
 if (true) break;
;
 BA.debugLineNum = 2136;BA.debugLine="If MCode.page=\"Act_HavaleTozie\" Then";
Debug.ShouldStop(8388608);

case 449:
//if
this.state = 452;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_HavaleTozie"))) { 
this.state = 451;
}if (true) break;

case 451:
//C
this.state = 452;
 BA.debugLineNum = 2137;BA.debugLine="CallSubDelayed(Act_HavaleTozie,\"LoadFilter\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",service_server.processBA,(Object)((parent.mostCurrent._act_havaletozie.getObject())),(Object)(RemoteObject.createImmutable("LoadFilter")));
 if (true) break;

case 452:
//C
this.state = 495;
;
 BA.debugLineNum = 2139;BA.debugLine="MCode.GetDataStatus=False";
Debug.ShouldStop(67108864);
parent.mostCurrent._mcode._getdatastatus /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2140;BA.debugLine="StartService(Service_Helper)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("StartService",service_server.processBA,(Object)((parent.mostCurrent._service_helper.getObject())));
 BA.debugLineNum = 2141;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 454:
//C
this.state = 455;
 BA.debugLineNum = 2143;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 455:
//if
this.state = 460;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 457;
}else {
this.state = 459;
}if (true) break;

case 457:
//C
this.state = 460;
 BA.debugLineNum = 2144;BA.debugLine="ToastMessageShow(\"لیست ویدیو موجود نمی باشد\",";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لیست ویدیو موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 459:
//C
this.state = 460;
 BA.debugLineNum = 2147;BA.debugLine="LoadGetVideoAmoozesh(Str)";
Debug.ShouldStop(4);
_loadgetvideoamoozesh(_str);
 if (true) break;

case 460:
//C
this.state = 495;
;
 if (true) break;

case 462:
//C
this.state = 463;
 BA.debugLineNum = 2150;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(32);
if (true) break;

case 463:
//if
this.state = 468;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 465;
}else {
this.state = 467;
}if (true) break;

case 465:
//C
this.state = 468;
 if (true) break;

case 467:
//C
this.state = 468;
 BA.debugLineNum = 2154;BA.debugLine="LoadGetPicFTPForAndroid(Str)";
Debug.ShouldStop(512);
_loadgetpicftpforandroid(_str);
 if (true) break;

case 468:
//C
this.state = 495;
;
 BA.debugLineNum = 2156;BA.debugLine="GetGalleryKala";
Debug.ShouldStop(2048);
_getgallerykala();
 if (true) break;

case 470:
//C
this.state = 471;
 BA.debugLineNum = 2158;BA.debugLine="If Str = \"Ok\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 471:
//if
this.state = 476;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("Ok"))) { 
this.state = 473;
}else {
this.state = 475;
}if (true) break;

case 473:
//C
this.state = 476;
 BA.debugLineNum = 2159;BA.debugLine="ToastMessageShow(\"دریافت با موفقیت ارسال گردی";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت با موفقیت ارسال گردید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2161;BA.debugLine="MCode.SaveUpdate(\"Update TblDaryaft Set fldSe";
Debug.ShouldStop(65536);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblDaryaft Set fldSend=1 where fldShomareDaryaft="),parent.mostCurrent._mcode._shomaredaryaft /*RemoteObject*/ )));
 BA.debugLineNum = 2163;BA.debugLine="MCode.SaveUpdate(\"Update TblCheckDaryafti Set";
Debug.ShouldStop(262144);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblCheckDaryafti Set fldSend=1 where fldShomareDaryaft="),parent.mostCurrent._mcode._shomaredaryaft /*RemoteObject*/ )));
 BA.debugLineNum = 2164;BA.debugLine="CallSubDelayed(Act_Mali,\"btnNew_Click\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",service_server.processBA,(Object)((parent.mostCurrent._act_mali.getObject())),(Object)(RemoteObject.createImmutable("btnNew_Click")));
 if (true) break;

case 475:
//C
this.state = 476;
 BA.debugLineNum = 2166;BA.debugLine="ToastMessageShow(\"خطا در ارسال دریافت\",True)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در ارسال دریافت")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 476:
//C
this.state = 495;
;
 BA.debugLineNum = 2168;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 478:
//C
this.state = 479;
 BA.debugLineNum = 2170;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 479:
//if
this.state = 494;
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
this.state = 481;
}else {
this.state = 483;
}if (true) break;

case 481:
//C
this.state = 494;
 BA.debugLineNum = 2172;BA.debugLine="ToastMessageShow(\"خطا در بروزرسانی\",True)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در بروزرسانی")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 483:
//C
this.state = 484;
 BA.debugLineNum = 2174;BA.debugLine="If MCode.page=\"Act_RizeFactorHavale\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 484:
//if
this.state = 487;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_RizeFactorHavale"))) { 
this.state = 486;
}if (true) break;

case 486:
//C
this.state = 487;
 BA.debugLineNum = 2175;BA.debugLine="CallSubDelayed(Act_RizeFactorHavale,\"btnUpda";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",service_server.processBA,(Object)((parent.mostCurrent._act_rizefactorhavale.getObject())),(Object)(RemoteObject.createImmutable("btnUpdate_Click")));
 if (true) break;
;
 BA.debugLineNum = 2177;BA.debugLine="If MCode.page=\"Act_RepFactorVisitor\" Then";
Debug.ShouldStop(1);

case 487:
//if
this.state = 490;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_RepFactorVisitor"))) { 
this.state = 489;
}if (true) break;

case 489:
//C
this.state = 490;
 BA.debugLineNum = 2178;BA.debugLine="CallSubDelayed(Act_RepFactorVisitor,\"BtnRepo";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",service_server.processBA,(Object)((parent.mostCurrent._act_repfactorvisitor.getObject())),(Object)(RemoteObject.createImmutable("BtnReport_Click")));
 if (true) break;
;
 BA.debugLineNum = 2181;BA.debugLine="If MCode.page=\"Act_RepRizFactorVisitor\" Then";
Debug.ShouldStop(16);

case 490:
//if
this.state = 493;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_RepRizFactorVisitor"))) { 
this.state = 492;
}if (true) break;

case 492:
//C
this.state = 493;
 BA.debugLineNum = 2182;BA.debugLine="CallSubDelayed(Act_RepRizFactorVisitor,\"LblB";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",service_server.processBA,(Object)((parent.mostCurrent._act_reprizfactorvisitor.getObject())),(Object)(RemoteObject.createImmutable("LblBack_Click")));
 if (true) break;

case 493:
//C
this.state = 494;
;
 if (true) break;

case 494:
//C
this.state = 495;
;
 BA.debugLineNum = 2186;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2187;BA.debugLine="MCode.GetDataStatus=False";
Debug.ShouldStop(1024);
parent.mostCurrent._mcode._getdatastatus /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2188;BA.debugLine="StartService(Service_Helper)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("StartService",service_server.processBA,(Object)((parent.mostCurrent._service_helper.getObject())));
 if (true) break;

case 495:
//C
this.state = 498;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 497:
//C
this.state = 498;
this.catchState = 511;
 BA.debugLineNum = 2191;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845683",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 if (true) break;
if (true) break;

case 498:
//C
this.state = 509;
this.catchState = 511;
;
 BA.debugLineNum = 2193;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 500:
//C
this.state = 501;
 BA.debugLineNum = 2196;BA.debugLine="StartActivity(Act_Main)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",service_server.processBA,(Object)((parent.mostCurrent._act_main.getObject())));
 BA.debugLineNum = 2197;BA.debugLine="If	MCode.IsConnected=False Then";
Debug.ShouldStop(1048576);
if (true) break;

case 501:
//if
this.state = 504;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,service_server.processBA),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 503;
}if (true) break;

case 503:
//C
this.state = 504;
 BA.debugLineNum = 2198;BA.debugLine="ToastMessageShow(\"خطا در دسترسی اینترنت\",True)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در دسترسی اینترنت")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2199;BA.debugLine="myCode.SendError(j.ErrorMessage,\"Service_Server-";
Debug.ShouldStop(4194304);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(_j.getField(true,"_errormessage" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Service_Server-JobDone-"),_str,RemoteObject.createImmutable("-"),parent.mostCurrent._mcode._page /*RemoteObject*/ )));
 if (true) break;

case 504:
//C
this.state = 505;
;
 BA.debugLineNum = 2202;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2204;BA.debugLine="MCode.GetDataStatus=False";
Debug.ShouldStop(134217728);
parent.mostCurrent._mcode._getdatastatus /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2205;BA.debugLine="StartService(FusedLocationService)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("StartService",service_server.processBA,(Object)((parent.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 2206;BA.debugLine="StartService(Service_Helper)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("StartService",service_server.processBA,(Object)((parent.mostCurrent._service_helper.getObject())));
 BA.debugLineNum = 2207;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845699",RemoteObject.createImmutable("Gps Start"),0);
 BA.debugLineNum = 2208;BA.debugLine="If MCode.IsOnlineDataFactor=1 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 505:
//if
this.state = 508;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._isonlinedatafactor /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 507;
}if (true) break;

case 507:
//C
this.state = 508;
 BA.debugLineNum = 2210;BA.debugLine="Log(\"Notifi Start\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845702",RemoteObject.createImmutable("Notifi Start"),0);
 if (true) break;

case 508:
//C
this.state = 509;
;
 if (true) break;

case 509:
//C
this.state = 512;
;
 BA.debugLineNum = 2215;BA.debugLine="jobInternet.Release";
Debug.ShouldStop(64);
parent._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2216;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Sleep",service_server.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "service_server", "request"),BA.numberCast(int.class, 1000));
this.state = 514;
return;
case 514:
//C
this.state = 512;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 511:
//C
this.state = 512;
this.catchState = 0;
 BA.debugLineNum = 2218;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2219;BA.debugLine="MCode.GetDataStatus=False";
Debug.ShouldStop(1024);
parent.mostCurrent._mcode._getdatastatus /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2220;BA.debugLine="StartService(Service_Helper)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("StartService",service_server.processBA,(Object)((parent.mostCurrent._service_helper.getObject())));
 BA.debugLineNum = 2221;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","512845713",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 if (true) break;
if (true) break;

case 512:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 2224;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e0.toString());}
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
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _run(RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("Run (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,31);
if (RapidSub.canDelegate("run")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","run", _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 31;BA.debugLine="Public Sub Run(i As Int)";
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
public static RemoteObject  _saveandroidlog(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SaveAndroidLog (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1430);
if (RapidSub.canDelegate("saveandroidlog")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","saveandroidlog", _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 1430;BA.debugLine="Sub SaveAndroidLog(item As AdapterAndroidLog)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1431;BA.debugLine="jobInternet.JobName =\"SaveAndroidLog\"";
Debug.ShouldStop(4194304);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SaveAndroidLog"));
 BA.debugLineNum = 1432;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8388608);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveAndroidLog"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &CodeVisitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(" &NameVisitor="),service_server.mostCurrent._mcode._n_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(" &ShomareMoshtari="),service_server.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ,RemoteObject.createImmutable(" &Date1="),_item.getField(true,"date" /*RemoteObject*/ ),RemoteObject.createImmutable(" &Time1="),_item.getField(true,"time" /*RemoteObject*/ ),RemoteObject.createImmutable(" &Message="),_item.getField(true,"message" /*RemoteObject*/ ),RemoteObject.createImmutable(" &action="),_item.getField(true,"Action" /*RemoteObject*/ ),RemoteObject.createImmutable(" &Version="),service_server.mostCurrent._mcode._version /*RemoteObject*/ ,RemoteObject.createImmutable(" &VersionNumber="),service_server.mostCurrent._mcode._numberversion /*RemoteObject*/ )));
 BA.debugLineNum = 1433;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(16777216);
_request(service_server._jobinternet);
 BA.debugLineNum = 1434;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _savelocationmoshtari(RemoteObject _lat,RemoteObject _lon) throws Exception{
try {
		Debug.PushSubsStack("SaveLocationMoshtari (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1451);
if (RapidSub.canDelegate("savelocationmoshtari")) { ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","savelocationmoshtari", _lat, _lon); return;}
ResumableSub_SaveLocationMoshtari rsub = new ResumableSub_SaveLocationMoshtari(null,_lat,_lon);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SaveLocationMoshtari extends BA.ResumableSub {
public ResumableSub_SaveLocationMoshtari(ir.parsikhesab.pakhsh.service_server parent,RemoteObject _lat,RemoteObject _lon) {
this.parent = parent;
this._lat = _lat;
this._lon = _lon;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.service_server parent;
RemoteObject _lat;
RemoteObject _lon;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SaveLocationMoshtari (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1451);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("Lat", _lat);
Debug.locals.put("Lon", _lon);
 BA.debugLineNum = 1452;BA.debugLine="Sleep(100)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Sleep",service_server.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "service_server", "savelocationmoshtari"),BA.numberCast(int.class, 100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 1453;BA.debugLine="jobInternet.JobName =\"SaveLocationMoshtari\"";
Debug.ShouldStop(4096);
parent._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SaveLocationMoshtari"));
 BA.debugLineNum = 1454;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8192);
parent._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),parent.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveLocationMoshtari"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("C_Tafzili="),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(" &Lat="),_lat,RemoteObject.createImmutable(" &Lon="),_lon,RemoteObject.createImmutable(" &Imei="),parent.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 1455;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(16384);
_request(parent._jobinternet);
 BA.debugLineNum = 1456;BA.debugLine="End Sub";
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
public static RemoteObject  _saveversionandroidinfo() throws Exception{
try {
		Debug.PushSubsStack("SaveVersionAndroidInfo (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1436);
if (RapidSub.canDelegate("saveversionandroidinfo")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","saveversionandroidinfo");}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 1436;BA.debugLine="Sub SaveVersionAndroidInfo";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1437;BA.debugLine="jobInternet.JobName =\"SaveVersionAndroidInfo\"";
Debug.ShouldStop(268435456);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SaveVersionAndroidInfo"));
 BA.debugLineNum = 1438;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(536870912);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1440;BA.debugLine="Cur=MCode.Result(\"Select * From TblSetting\")";
Debug.ShouldStop(-2147483648);
_cur = service_server.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,service_server.processBA,(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1441;BA.debugLine="Cur.Position=0";
Debug.ShouldStop(1);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1442;BA.debugLine="Log(Cur.GetString(\"FldImei\"))";
Debug.ShouldStop(2);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512124166",_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldImei"))),0);
 BA.debugLineNum = 1443;BA.debugLine="Log(Cur.GetString(\"FldC_Visitor\"))";
Debug.ShouldStop(4);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512124167",_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),0);
 BA.debugLineNum = 1444;BA.debugLine="Log(Cur.GetString(\"FldN_Visitor\"))";
Debug.ShouldStop(8);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512124168",_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Visitor"))),0);
 BA.debugLineNum = 1445;BA.debugLine="Log(Cur.GetString(\"FldCodeMoshtari\"))";
Debug.ShouldStop(16);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512124169",_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeMoshtari"))),0);
 BA.debugLineNum = 1446;BA.debugLine="Log(Cur.GetString(\"fldLastVersion\"))";
Debug.ShouldStop(32);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512124170",_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldLastVersion"))),0);
 BA.debugLineNum = 1447;BA.debugLine="Log(Cur.GetString(\"fldDateSetup\"))";
Debug.ShouldStop(64);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512124171",_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateSetup"))),0);
 BA.debugLineNum = 1448;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(128);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveVersionAndroidInfo"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldImei"))),RemoteObject.createImmutable(" &CodeVisitor="),_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),RemoteObject.createImmutable(" &NameVisitor="),_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Visitor"))),RemoteObject.createImmutable(" &ShomareMoshtari="),_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeMoshtari"))),RemoteObject.createImmutable(" &DateVersion="),service_server.mostCurrent._mcode._dateversion /*RemoteObject*/ .runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(" &DateSetup="),_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateSetup"))),RemoteObject.createImmutable(" &Version="),service_server.mostCurrent._mcode._version /*RemoteObject*/ ,RemoteObject.createImmutable(" &VersionNumber="),service_server.mostCurrent._mcode._numberversion /*RemoteObject*/ ,RemoteObject.createImmutable(" &LastVersion="),_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldLastVersion"))),RemoteObject.createImmutable(" &TypeVersion="),service_server.mostCurrent._mcode._typeversion /*RemoteObject*/ )));
 BA.debugLineNum = 1449;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendashkhasnew(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("SendAshkhasNew (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,869);
if (RapidSub.canDelegate("sendashkhasnew")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","sendashkhasnew", _str);}
Debug.locals.put("Str", _str);
 BA.debugLineNum = 869;BA.debugLine="Sub SendAshkhasNew(Str As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 870;BA.debugLine="jobInternet.JobName =\"SendAshkhasNew\"";
Debug.ShouldStop(32);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendAshkhasNew"));
 BA.debugLineNum = 871;BA.debugLine="Log(Str)";
Debug.ShouldStop(64);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","59437186",_str,0);
 BA.debugLineNum = 872;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(128);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveAshkhasNew4"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("JsonDt="),_str,RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 873;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(256);
_request(service_server._jobinternet);
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
public static RemoteObject  _senddaryaft(RemoteObject _strdtdaryaft,RemoteObject _strdtcheckdaryaft) throws Exception{
try {
		Debug.PushSubsStack("SendDaryaft (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1483);
if (RapidSub.canDelegate("senddaryaft")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","senddaryaft", _strdtdaryaft, _strdtcheckdaryaft);}
Debug.locals.put("StrDtDaryaft", _strdtdaryaft);
Debug.locals.put("StrDtCheckDaryaft", _strdtcheckdaryaft);
 BA.debugLineNum = 1483;BA.debugLine="Sub SendDaryaft(StrDtDaryaft As String,StrDtCheckD";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1484;BA.debugLine="jobInternet.JobName =\"SendDaryaft\"";
Debug.ShouldStop(2048);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendDaryaft"));
 BA.debugLineNum = 1485;BA.debugLine="Log(StrDtDaryaft)";
Debug.ShouldStop(4096);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512320770",_strdtdaryaft,0);
 BA.debugLineNum = 1486;BA.debugLine="Log(StrDtCheckDaryaft)";
Debug.ShouldStop(8192);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512320771",_strdtcheckdaryaft,0);
 BA.debugLineNum = 1487;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(16384);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveDaryaft2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("JsonDaryaftDt="),_strdtdaryaft,RemoteObject.createImmutable("&JsonCheckDaryaftDt="),_strdtcheckdaryaft,RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 1488;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(32768);
_request(service_server._jobinternet);
 BA.debugLineNum = 1489;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendfaktor(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("SendFaktor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,682);
if (RapidSub.canDelegate("sendfaktor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","sendfaktor", _str);}
Debug.locals.put("Str", _str);
 BA.debugLineNum = 682;BA.debugLine="Sub SendFaktor(Str As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 683;BA.debugLine="jobInternet.JobName =\"SendFaktor\"";
Debug.ShouldStop(1024);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendFaktor"));
 BA.debugLineNum = 684;BA.debugLine="Log(Str)";
Debug.ShouldStop(2048);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","58978434",_str,0);
 BA.debugLineNum = 686;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(8192);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveFaktor5"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("JsonDt="),_str,RemoteObject.createImmutable("&Visitor="),service_server.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&Version=3"))));
 BA.debugLineNum = 688;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(32768);
_request(service_server._jobinternet);
 BA.debugLineNum = 689;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendtokenid() throws Exception{
try {
		Debug.PushSubsStack("SendTokenId (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,169);
if (RapidSub.canDelegate("sendtokenid")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","sendtokenid");}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 169;BA.debugLine="Sub SendTokenId";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="jobInternet.JobName =\"SendTokenId\"";
Debug.ShouldStop(512);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendTokenId"));
 BA.debugLineNum = 171;BA.debugLine="Dim str As String=MCode.TokenPush";
Debug.ShouldStop(1024);
_str = service_server.mostCurrent._mcode._tokenpush /*RemoteObject*/ ;Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 172;BA.debugLine="Log(str)";
Debug.ShouldStop(2048);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","56815747",_str,0);
 BA.debugLineNum = 173;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(4096);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/TokenSave2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("fldTokenId="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &fldNameVisitor="),service_server.mostCurrent._mcode._n_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(" &fldCodeMoshtari="),service_server.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ,RemoteObject.createImmutable(" &fldVersion="),service_server.mostCurrent._mcode._version /*RemoteObject*/ ,RemoteObject.createImmutable(" &fldVersionNumber="),service_server.mostCurrent._mcode._numberversion /*RemoteObject*/ ,RemoteObject.createImmutable(" &fldDate="),service_server.mostCurrent._mcode.runMethod(true,"_removeslashdate" /*RemoteObject*/ ,service_server.processBA,(Object)(service_server.mostCurrent._mcode._dateversion /*RemoteObject*/ )))));
 BA.debugLineNum = 175;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(16384);
_request(service_server._jobinternet);
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
public static RemoteObject  _sendtourvisitor(RemoteObject _strdttourvisitor) throws Exception{
try {
		Debug.PushSubsStack("SendTourVisitor (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1505);
if (RapidSub.canDelegate("sendtourvisitor")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","sendtourvisitor", _strdttourvisitor);}
Debug.locals.put("StrDtTourVisitor", _strdttourvisitor);
 BA.debugLineNum = 1505;BA.debugLine="Sub SendTourVisitor(StrDtTourVisitor As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 1506;BA.debugLine="jobInternet.JobName =\"SendTourVisitor\"";
Debug.ShouldStop(2);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendTourVisitor"));
 BA.debugLineNum = 1507;BA.debugLine="Log(StrDtTourVisitor)";
Debug.ShouldStop(4);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","512451842",_strdttourvisitor,0);
 BA.debugLineNum = 1509;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(16);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveTourFromAndroid"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("JsonDt="),_strdttourvisitor,RemoteObject.createImmutable("&Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 1510;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(32);
_request(service_server._jobinternet);
 BA.debugLineNum = 1511;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendupdatequery(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("SendUpdateQuery (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1423);
if (RapidSub.canDelegate("sendupdatequery")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","sendupdatequery", _query);}
Debug.locals.put("query", _query);
 BA.debugLineNum = 1423;BA.debugLine="Sub SendUpdateQuery(query As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1424;BA.debugLine="jobInternet.JobName =\"SendUpdateQuery\"";
Debug.ShouldStop(32768);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendUpdateQuery"));
 BA.debugLineNum = 1425;BA.debugLine="Log(query)";
Debug.ShouldStop(65536);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","511993090",_query,0);
 BA.debugLineNum = 1426;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(131072);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/UpdateQuery"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Query="),_query,RemoteObject.createImmutable(" &Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 1427;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(262144);
_request(service_server._jobinternet);
 BA.debugLineNum = 1428;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Service_Create (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,17);
if (RapidSub.canDelegate("service_create")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","service_create");}
 BA.debugLineNum = 17;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { Debug.CheckDeviceExceptions();
} 
       catch (Exception e3) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e3.toString()); BA.debugLineNum = 21;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","56291460",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 };
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Service_Destroy (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,78);
if (RapidSub.canDelegate("service_destroy")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","service_destroy");}
 BA.debugLineNum = 78;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Service_Start (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,37);
if (RapidSub.canDelegate("service_start")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 37;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(16);
 BA.debugLineNum = 46;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 47;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(16384);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,service_server.processBA,(Object)(BA.ObjectToString("jobInternet")),(Object)(service_server.getObject()));
 BA.debugLineNum = 48;BA.debugLine="jobInternet.GetRequest.Timeout=50000";
Debug.ShouldStop(32768);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 49;BA.debugLine="th.Initialise(\"th\")";
Debug.ShouldStop(65536);
service_server._th.runVoidMethod ("Initialise",service_server.processBA,(Object)(RemoteObject.createImmutable("th")));
 BA.debugLineNum = 51;BA.debugLine="Select MCode.NoeGet";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(service_server.mostCurrent._mcode._noeget /*RemoteObject*/ ,BA.ObjectToString("DaryaftEtlaat"),BA.ObjectToString("GetCodeMoshtari"),BA.ObjectToString("GetVaziat"),BA.ObjectToString("SendTokenId"),BA.ObjectToString("GetEshantion2"),BA.ObjectToString("GetVisitor"),BA.ObjectToString("SaveTourVisit"))) {
case 0: {
 BA.debugLineNum = 53;BA.debugLine="MCode.GetDataStatus=True";
Debug.ShouldStop(1048576);
service_server.mostCurrent._mcode._getdatastatus /*RemoteObject*/  = service_server.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 54;BA.debugLine="StopService(Service_Helper)";
Debug.ShouldStop(2097152);
service_server.mostCurrent.__c.runVoidMethod ("StopService",service_server.processBA,(Object)((service_server.mostCurrent._service_helper.getObject())));
 BA.debugLineNum = 55;BA.debugLine="GetCurrentDate";
Debug.ShouldStop(4194304);
_getcurrentdate();
 break; }
case 1: {
 BA.debugLineNum = 57;BA.debugLine="GetCodeMoshtari";
Debug.ShouldStop(16777216);
_getcodemoshtari();
 break; }
case 2: {
 BA.debugLineNum = 60;BA.debugLine="GetVaziat";
Debug.ShouldStop(134217728);
_getvaziat();
 break; }
case 3: {
 BA.debugLineNum = 62;BA.debugLine="SendTokenId";
Debug.ShouldStop(536870912);
_sendtokenid();
 break; }
case 4: {
 BA.debugLineNum = 64;BA.debugLine="GetEshantion2";
Debug.ShouldStop(-2147483648);
_geteshantion2();
 break; }
case 5: {
 BA.debugLineNum = 66;BA.debugLine="GetVisitor";
Debug.ShouldStop(2);
_getvisitor();
 break; }
case 6: {
 BA.debugLineNum = 68;BA.debugLine="LoadSendTourVisitor";
Debug.ShouldStop(8);
_loadsendtourvisitor();
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_server.processBA, e24.toString()); BA.debugLineNum = 71;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","56488098",BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA)),0);
 BA.debugLineNum = 72;BA.debugLine="myCode.SendError(LastException,\"Service_Server-S";
Debug.ShouldStop(128);
service_server.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,service_server.processBA,(Object)(BA.ObjectToString(service_server.mostCurrent.__c.runMethod(false,"LastException",service_server.processBA))),(Object)(RemoteObject.createImmutable("Service_Server-Service_Start")));
 };
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showfactorforooshbyhavale() throws Exception{
try {
		Debug.PushSubsStack("ShowFactorForooshByHavale (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1169);
if (RapidSub.canDelegate("showfactorforooshbyhavale")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","showfactorforooshbyhavale");}
 BA.debugLineNum = 1169;BA.debugLine="Sub ShowFactorForooshByHavale()";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1170;BA.debugLine="jobInternet.JobName =\"ShowFactorForooshByHavale\"";
Debug.ShouldStop(131072);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("ShowFactorForooshByHavale"));
 BA.debugLineNum = 1171;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(262144);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/ShowFactorForooshByHavale"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&flag="),service_server.mostCurrent._mcode._gethavaleflag /*RemoteObject*/ ,RemoteObject.createImmutable("&ShomareHavale="),service_server.mostCurrent._mcode._shomarehavale /*RemoteObject*/ )));
 BA.debugLineNum = 1172;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(524288);
_request(service_server._jobinternet);
 BA.debugLineNum = 1173;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ShowRizeFactorForooshByHavale (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,1291);
if (RapidSub.canDelegate("showrizefactorforooshbyhavale")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","showrizefactorforooshbyhavale");}
 BA.debugLineNum = 1291;BA.debugLine="Sub ShowRizeFactorForooshByHavale()";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1292;BA.debugLine="jobInternet.JobName =\"ShowRizFactorForooshByHaval";
Debug.ShouldStop(2048);
service_server._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("ShowRizFactorForooshByHavale"));
 BA.debugLineNum = 1293;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(4096);
service_server._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_server.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/ShowRizFactorForooshByHavale"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_server.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 1294;BA.debugLine="Request(jobInternet)";
Debug.ShouldStop(8192);
_request(service_server._jobinternet);
 BA.debugLineNum = 1295;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _th_ended(RemoteObject _endedok,RemoteObject _error) throws Exception{
try {
		Debug.PushSubsStack("th_Ended (service_server) ","service_server",2,service_server.processBA,service_server.mostCurrent,26);
if (RapidSub.canDelegate("th_ended")) { return ir.parsikhesab.pakhsh.service_server.remoteMe.runUserSub(false, "service_server","th_ended", _endedok, _error);}
Debug.locals.put("endedOK", _endedok);
Debug.locals.put("error", _error);
 BA.debugLineNum = 26;BA.debugLine="Private Sub th_Ended(endedOK As Boolean, error As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Log(\"th \" & endedOK)";
Debug.ShouldStop(67108864);
service_server.mostCurrent.__c.runVoidMethod ("LogImpl","56356993",RemoteObject.concat(RemoteObject.createImmutable("th "),_endedok),0);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}