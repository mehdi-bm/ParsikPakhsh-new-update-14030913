package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class service_notification_subs_0 {


public static RemoteObject  _getnotification() throws Exception{
try {
		Debug.PushSubsStack("GetNotification (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,52);
if (RapidSub.canDelegate("getnotification")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","getnotification");}
 BA.debugLineNum = 52;BA.debugLine="Sub GetNotification";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="jobInternet.JobName =\"GetNotification\"";
Debug.ShouldStop(1048576);
service_notification._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetNotification"));
 BA.debugLineNum = 54;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(2097152);
service_notification._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_notification.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetNotification"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_notification.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("&CodeVisitor="),service_notification.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
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
public static RemoteObject  _getnotification2() throws Exception{
try {
		Debug.PushSubsStack("GetNotification2 (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,103);
if (RapidSub.canDelegate("getnotification2")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","getnotification2");}
 BA.debugLineNum = 103;BA.debugLine="Sub GetNotification2";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="jobInternet.JobName =\"GetNotification2\"";
Debug.ShouldStop(128);
service_notification._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetNotification2"));
 BA.debugLineNum = 105;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(256);
service_notification._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_notification.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetNotification2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_notification.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnotification3() throws Exception{
try {
		Debug.PushSubsStack("GetNotification3 (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,128);
if (RapidSub.canDelegate("getnotification3")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","getnotification3");}
 BA.debugLineNum = 128;BA.debugLine="Sub GetNotification3";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="jobInternet.JobName =\"GetNotification3\"";
Debug.ShouldStop(1);
service_notification._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetNotification3"));
 BA.debugLineNum = 130;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(2);
service_notification._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),service_notification.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/GetNotification3"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),service_notification.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
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
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,152);
if (RapidSub.canDelegate("jobdone")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","jobdone", _job);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 152;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="Job.GetRequest.Timeout=50000";
Debug.ShouldStop(16777216);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 154;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(33554432);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 155;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 156;BA.debugLine="Dim Str As String = Job.GetString";
Debug.ShouldStop(134217728);
_str = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 157;BA.debugLine="Select Case Job.JobName";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("GetNotification"),BA.ObjectToString("GetNotification2"),BA.ObjectToString("GetNotification3"))) {
case 0: {
 BA.debugLineNum = 161;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 162;BA.debugLine="Log(\"نوتیفیکیشن جدیدی موجود نمی باشد\")";
Debug.ShouldStop(2);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120455178",RemoteObject.createImmutable("نوتیفیکیشن جدیدی موجود نمی باشد"),0);
 BA.debugLineNum = 163;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
service_notification.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 165;BA.debugLine="LoadGetNotification(Str)";
Debug.ShouldStop(16);
_loadgetnotification(_str);
 };
 break; }
case 1: {
 BA.debugLineNum = 169;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 170;BA.debugLine="Log(\"نوتیفیکیشن2 جدیدی موجود نمی باشد\")";
Debug.ShouldStop(512);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120455186",RemoteObject.createImmutable("نوتیفیکیشن2 جدیدی موجود نمی باشد"),0);
 BA.debugLineNum = 171;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
service_notification.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 173;BA.debugLine="LoadGetNotification2(Str)";
Debug.ShouldStop(4096);
_loadgetnotification2(_str);
 };
 BA.debugLineNum = 176;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32768);
service_notification.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 2: {
 BA.debugLineNum = 179;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 180;BA.debugLine="Log(\"نوتیفیکیشن3 جدیدی موجود نمی باشد\")";
Debug.ShouldStop(524288);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120455196",RemoteObject.createImmutable("نوتیفیکیشن3 جدیدی موجود نمی باشد"),0);
 BA.debugLineNum = 181;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1048576);
service_notification.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 183;BA.debugLine="LoadGetNotification3(Str)";
Debug.ShouldStop(4194304);
_loadgetnotification3(_str);
 };
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e30) {
			BA.rdebugUtils.runVoidMethod("setLastException",service_notification.processBA, e30.toString()); BA.debugLineNum = 187;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120455203",BA.ObjectToString(service_notification.mostCurrent.__c.runMethod(false,"LastException",service_notification.processBA)),0);
 };
 BA.debugLineNum = 189;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
service_notification.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 193;BA.debugLine="StartActivity(Act_Main)";
Debug.ShouldStop(1);
service_notification.mostCurrent.__c.runVoidMethod ("StartActivity",service_notification.processBA,(Object)((service_notification.mostCurrent._act_main.getObject())));
 BA.debugLineNum = 202;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
service_notification.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 204;BA.debugLine="StartService(FusedLocationService)";
Debug.ShouldStop(2048);
service_notification.mostCurrent.__c.runVoidMethod ("StartService",service_notification.processBA,(Object)((service_notification.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 205;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(4096);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120455221",RemoteObject.createImmutable("Gps Start"),0);
 };
 BA.debugLineNum = 207;BA.debugLine="jobInternet.Release";
Debug.ShouldStop(16384);
service_notification._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetnotification(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetNotification (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,57);
if (RapidSub.canDelegate("loadgetnotification")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","loadgetnotification", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _strtype = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 57;BA.debugLine="Sub LoadGetNotification(Str As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(33554432);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 59;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(67108864);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 60;BA.debugLine="Dim Strtype As String=\"\"";
Debug.ShouldStop(134217728);
_strtype = BA.ObjectToString("");Debug.locals.put("Strtype", _strtype);Debug.locals.put("Strtype", _strtype);
 BA.debugLineNum = 61;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(268435456);
service_notification.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 62;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(536870912);
_rowslist = service_notification.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 63;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(1073741824);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 64;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(-2147483648);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 66;BA.debugLine="Log(Row.Get(\"fldTitle\"))";
Debug.ShouldStop(2);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120127497",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTitle"))))),0);
 BA.debugLineNum = 67;BA.debugLine="Log(Row.Get(\"fldTime\"))";
Debug.ShouldStop(4);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120127498",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTime"))))),0);
 BA.debugLineNum = 68;BA.debugLine="Log(Row.Get(\"fldType\"))";
Debug.ShouldStop(8);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120127499",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldType"))))),0);
 BA.debugLineNum = 70;BA.debugLine="If Row.Get(\"fldType\")=\"\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldType")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 71;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblNotifi (Id,Fld";
Debug.ShouldStop(64);
service_notification.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_notification.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblNotifi (Id,FldTitle,FldBody,FldDate,FldTime) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Id")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTitle")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBody")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTime")))),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 74;BA.debugLine="noti.SetInfo2(Row.Get(\"fldTitle\"),Row.Get(\"fldB";
Debug.ShouldStop(512);
service_notification._noti.runVoidMethod ("SetInfo2",service_notification.processBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTitle")))))),(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBody")))))),(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Id")))))),(Object)((service_notification.mostCurrent._act_notif.getObject())));
 BA.debugLineNum = 76;BA.debugLine="Strtype=\"\"";
Debug.ShouldStop(2048);
_strtype = BA.ObjectToString("");Debug.locals.put("Strtype", _strtype);
 }else {
 BA.debugLineNum = 79;BA.debugLine="Strtype=Row.Get(\"fldType\")";
Debug.ShouldStop(16384);
_strtype = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldType")))));Debug.locals.put("Strtype", _strtype);
 BA.debugLineNum = 80;BA.debugLine="MCode.downloadingData=True";
Debug.ShouldStop(32768);
service_notification.mostCurrent._mcode._downloadingdata /*RemoteObject*/  = service_notification.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 81;BA.debugLine="If Row.Get(\"fldType\")=\"GetForoosh\" Or Row.Get(\"";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldType")))),RemoteObject.createImmutable(("GetForoosh"))) || RemoteObject.solveBoolean("=",_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldType")))),RemoteObject.createImmutable(("GetKharid"))) || RemoteObject.solveBoolean("=",_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldType")))),RemoteObject.createImmutable(("GetBargashtAzForoosh"))) || RemoteObject.solveBoolean("=",_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldType")))),RemoteObject.createImmutable(("GetBargashtAzKharid")))) { 
 BA.debugLineNum = 84;BA.debugLine="CallSubDelayed3(FirebaseMessaging,\"GetForooshA";
Debug.ShouldStop(524288);
service_notification.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",service_notification.processBA,(Object)((service_notification.mostCurrent._firebasemessaging.getObject())),(Object)(BA.ObjectToString("GetForooshAndKharid")),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTitle"))))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBody"))))));
 }else {
 BA.debugLineNum = 86;BA.debugLine="FirebaseMessaging.mode=Strtype";
Debug.ShouldStop(2097152);
service_notification.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = _strtype;
 BA.debugLineNum = 87;BA.debugLine="StartService(FirebaseMessaging)";
Debug.ShouldStop(4194304);
service_notification.mostCurrent.__c.runVoidMethod ("StartService",service_notification.processBA,(Object)((service_notification.mostCurrent._firebasemessaging.getObject())));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 95;BA.debugLine="noti.Notify(1)";
Debug.ShouldStop(1073741824);
service_notification._noti.runVoidMethod ("Notify",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 97;BA.debugLine="Log(\"نوتیفیکیشن بروزرسانی گردید\")";
Debug.ShouldStop(1);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120127528",RemoteObject.createImmutable("نوتیفیکیشن بروزرسانی گردید"),0);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetnotification2(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetNotification2 (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,108);
if (RapidSub.canDelegate("loadgetnotification2")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","loadgetnotification2", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 108;BA.debugLine="Sub LoadGetNotification2(Str As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(4096);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 110;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(8192);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 111;BA.debugLine="MCode.SaveUpdate(\"Delete From TblTablighVisitor\")";
Debug.ShouldStop(16384);
service_notification.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_notification.processBA,(Object)(RemoteObject.createImmutable("Delete From TblTablighVisitor")));
 BA.debugLineNum = 112;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(32768);
service_notification.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 113;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(65536);
_rowslist = service_notification.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 114;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(131072);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 115;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(262144);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 116;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblTablighVisitor";
Debug.ShouldStop(524288);
service_notification.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,service_notification.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblTablighVisitor (Id,FldTitle,FldMessage,FldDate,FldTime,FldLink) Values ('"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Id")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTitle")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldMessage")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldDate")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTime")))),RemoteObject.createImmutable("','"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldLink")))),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 118;BA.debugLine="Log(Row.Get(\"FldTitle\"))";
Debug.ShouldStop(2097152);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120258570",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTitle"))))),0);
 BA.debugLineNum = 119;BA.debugLine="Log(Row.Get(\"FldTime\"))";
Debug.ShouldStop(4194304);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120258571",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTime"))))),0);
 BA.debugLineNum = 121;BA.debugLine="MCode.EtelaResani=Row.Get(\"FldMessage\")";
Debug.ShouldStop(16777216);
service_notification.mostCurrent._mcode._etelaresani /*RemoteObject*/  = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldMessage")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 124;BA.debugLine="Log(\"نوتیفیکیشن2 بروزرسانی گردید\")";
Debug.ShouldStop(134217728);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120258576",RemoteObject.createImmutable("نوتیفیکیشن2 بروزرسانی گردید"),0);
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgetnotification3(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetNotification3 (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,133);
if (RapidSub.canDelegate("loadgetnotification3")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","loadgetnotification3", _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 133;BA.debugLine="Sub LoadGetNotification3(Str As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(32);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 135;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(64);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 136;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(128);
service_notification.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 137;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(256);
_rowslist = service_notification.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 138;BA.debugLine="For i = 0 To RowsList.Size - 1";
Debug.ShouldStop(512);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 139;BA.debugLine="Row=RowsList.Get(i)";
Debug.ShouldStop(1024);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 142;BA.debugLine="Log(Row.Get(\"fldTitle\"))";
Debug.ShouldStop(8192);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120389641",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTitle"))))),0);
 BA.debugLineNum = 143;BA.debugLine="Log(Row.Get(\"fldTime\"))";
Debug.ShouldStop(16384);
service_notification.mostCurrent.__c.runVoidMethod ("LogImpl","5120389642",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTime"))))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
 //BA.debugLineNum = 8;BA.debugLine="Dim jobInternet As HttpJob";
service_notification._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");
 //BA.debugLineNum = 9;BA.debugLine="Dim count As Int=0";
service_notification._count = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 10;BA.debugLine="Dim t1 As Timer";
service_notification._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 11;BA.debugLine="Dim noti As AdvancedNotification";
service_notification._noti = RemoteObject.createNew ("barxdroid.advancednotification.AdvancedNotification");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,14);
if (RapidSub.canDelegate("service_create")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","service_create");}
 BA.debugLineNum = 14;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(16384);
service_notification._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,service_notification.processBA,(Object)(BA.ObjectToString("jobInternet")),(Object)(service_notification.getObject()));
 BA.debugLineNum = 16;BA.debugLine="jobInternet.GetRequest.Timeout=50000";
Debug.ShouldStop(32768);
service_notification._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 17;BA.debugLine="noti.Initialize";
Debug.ShouldStop(65536);
service_notification._noti.runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="noti.Icon=\"icon\"";
Debug.ShouldStop(131072);
service_notification._noti.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 19;BA.debugLine="noti.Light=True";
Debug.ShouldStop(262144);
service_notification._noti.runVoidMethod ("setLight",service_notification.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 20;BA.debugLine="noti.Sound=False";
Debug.ShouldStop(524288);
service_notification._noti.runVoidMethod ("setSound",service_notification.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 21;BA.debugLine="noti.NoClear=False";
Debug.ShouldStop(1048576);
service_notification._noti.runVoidMethod ("setNoClear",service_notification.mostCurrent.__c.getField(true,"False"));
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
		Debug.PushSubsStack("Service_Destroy (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,211);
if (RapidSub.canDelegate("service_destroy")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","service_destroy");}
 BA.debugLineNum = 211;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(262144);
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
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,26);
if (RapidSub.canDelegate("service_start")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","service_start", _startingintent);}
RemoteObject _t = RemoteObject.createImmutable(0L);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 26;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Dim t As Long= DateTime.Now + 6000";
Debug.ShouldStop(67108864);
_t = RemoteObject.solve(new RemoteObject[] {service_notification.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(6000)}, "+",1, 2);Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("t1_Tick (service_notification) ","service_notification",99,service_notification.processBA,service_notification.mostCurrent,46);
if (RapidSub.canDelegate("t1_tick")) { return ir.parsikhesab.pakhsh.service_notification.remoteMe.runUserSub(false, "service_notification","t1_tick");}
 BA.debugLineNum = 46;BA.debugLine="Sub t1_Tick";
Debug.ShouldStop(8192);
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
}