package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gpswiget_subs_0 {


public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (gpswiget) ","gpswiget",6,gpswiget.processBA,gpswiget.mostCurrent,82);
if (RapidSub.canDelegate("imageview1_click")) { return ir.parsikhesab.pakhsh.gpswiget.remoteMe.runUserSub(false, "gpswiget","imageview1_click");}
 BA.debugLineNum = 82;BA.debugLine="Private Sub ImageView1_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="StartActivity(Act_Main)";
Debug.ShouldStop(262144);
gpswiget.mostCurrent.__c.runVoidMethod ("StartActivity",gpswiget.processBA,(Object)((gpswiget.mostCurrent._act_main.getObject())));
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
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (gpswiget) ","gpswiget",6,gpswiget.processBA,gpswiget.mostCurrent,61);
if (RapidSub.canDelegate("jobdone")) { return ir.parsikhesab.pakhsh.gpswiget.remoteMe.runUserSub(false, "gpswiget","jobdone", _job);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 61;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Job.GetRequest.Timeout=50000";
Debug.ShouldStop(536870912);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 64;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(-2147483648);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 65;BA.debugLine="Dim Str As String = Job.GetString";
Debug.ShouldStop(1);
_str = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 66;BA.debugLine="Select Case Job.JobName";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("SendGps"))) {
case 0: {
 BA.debugLineNum = 68;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 }else {
 BA.debugLineNum = 71;BA.debugLine="MCode.SaveUpdate(\"Delete From TblGpsVisitor\")";
Debug.ShouldStop(64);
gpswiget.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,gpswiget.processBA,(Object)(RemoteObject.createImmutable("Delete From TblGpsVisitor")));
 BA.debugLineNum = 72;BA.debugLine="Log(\"GPS OK\")";
Debug.ShouldStop(128);
gpswiget.mostCurrent.__c.runVoidMethod ("LogImpl","520709387",RemoteObject.createImmutable("GPS OK"),0);
 };
 break; }
}
;
 }else {
 };
 BA.debugLineNum = 79;BA.debugLine="jobInternet.Release";
Debug.ShouldStop(16384);
gpswiget._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
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
public static RemoteObject  _label1_click() throws Exception{
try {
		Debug.PushSubsStack("Label1_Click (gpswiget) ","gpswiget",6,gpswiget.processBA,gpswiget.mostCurrent,136);
if (RapidSub.canDelegate("label1_click")) { return ir.parsikhesab.pakhsh.gpswiget.remoteMe.runUserSub(false, "gpswiget","label1_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 136;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",gpswiget.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 138;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(512);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 139;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 141;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",gpswiget.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 142;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(8192);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 143;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 145;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",gpswiget.mostCurrent._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 146;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
Debug.ShouldStop(131072);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 147;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 149;BA.debugLine="MCode.page = \"Act_Moshtarian\"";
Debug.ShouldStop(1048576);
gpswiget.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_Moshtarian");
 BA.debugLineNum = 150;BA.debugLine="Dim Cu As Cursor";
Debug.ShouldStop(2097152);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 151;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
Debug.ShouldStop(4194304);
_cu = gpswiget.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,gpswiget.processBA,(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 152;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(8388608);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 153;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
Debug.ShouldStop(16777216);
gpswiget.mostCurrent.__c.runVoidMethod ("LogImpl","520906001",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),0);
 BA.debugLineNum = 154;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" Th";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 155;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بعد";
Debug.ShouldStop(67108864);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 156;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 158;BA.debugLine="StartActivity(Act_SelectMantage)";
Debug.ShouldStop(536870912);
gpswiget.mostCurrent.__c.runVoidMethod ("StartActivity",gpswiget.processBA,(Object)((gpswiget.mostCurrent._act_selectmantage.getObject())));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label4_click() throws Exception{
try {
		Debug.PushSubsStack("Label4_Click (gpswiget) ","gpswiget",6,gpswiget.processBA,gpswiget.mostCurrent,161);
if (RapidSub.canDelegate("label4_click")) { return ir.parsikhesab.pakhsh.gpswiget.remoteMe.runUserSub(false, "gpswiget","label4_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 161;BA.debugLine="Private Sub Label4_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 165;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",gpswiget.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 166;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(32);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 167;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 169;BA.debugLine="Dim Cu As Cursor";
Debug.ShouldStop(256);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 170;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
Debug.ShouldStop(512);
_cu = gpswiget.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,gpswiget.processBA,(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 171;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(1024);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 172;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
Debug.ShouldStop(2048);
gpswiget.mostCurrent.__c.runVoidMethod ("LogImpl","520971531",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),0);
 BA.debugLineNum = 173;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" Th";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 174;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بعد";
Debug.ShouldStop(8192);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 175;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 177;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",gpswiget.mostCurrent._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 178;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
Debug.ShouldStop(131072);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 179;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 181;BA.debugLine="MCode.UpdateShakhs=False";
Debug.ShouldStop(1048576);
gpswiget.mostCurrent._mcode._updateshakhs /*RemoteObject*/  = gpswiget.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 182;BA.debugLine="StartActivity(Act_NewAshkhas)";
Debug.ShouldStop(2097152);
gpswiget.mostCurrent.__c.runVoidMethod ("StartActivity",gpswiget.processBA,(Object)((gpswiget.mostCurrent._act_newashkhas.getObject())));
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label5_click() throws Exception{
try {
		Debug.PushSubsStack("Label5_Click (gpswiget) ","gpswiget",6,gpswiget.processBA,gpswiget.mostCurrent,86);
if (RapidSub.canDelegate("label5_click")) { return ir.parsikhesab.pakhsh.gpswiget.remoteMe.runUserSub(false, "gpswiget","label5_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 86;BA.debugLine="Private Sub Label5_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",gpswiget.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 88;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(8388608);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 89;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 91;BA.debugLine="If	MCode.Visitor=\"0\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",gpswiget.mostCurrent._mcode._visitor /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 92;BA.debugLine="ToastMessageShow(\"این بخش مربوط به نسخه ویزیتور";
Debug.ShouldStop(134217728);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 93;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 95;BA.debugLine="Dim Cu As Cursor";
Debug.ShouldStop(1073741824);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 96;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
Debug.ShouldStop(-2147483648);
_cu = gpswiget.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,gpswiget.processBA,(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 97;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(1);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 98;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
Debug.ShouldStop(2);
gpswiget.mostCurrent.__c.runVoidMethod ("LogImpl","520840460",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),0);
 BA.debugLineNum = 99;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" Th";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 100;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بعد";
Debug.ShouldStop(8);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 101;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 103;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",gpswiget.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 104;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(128);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 105;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 107;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",gpswiget.mostCurrent._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 108;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
Debug.ShouldStop(2048);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 109;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 116;BA.debugLine="Cu=MCode.Result(\"Select * From TblKala\")";
Debug.ShouldStop(524288);
_cu = gpswiget.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,gpswiget.processBA,(Object)(RemoteObject.createImmutable("Select * From TblKala")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 117;BA.debugLine="If Cu.RowCount=0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 118;BA.debugLine="ToastMessageShow(\"لیست کالا به درستی دریافت نشده";
Debug.ShouldStop(2097152);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لیست کالا به درستی دریافت نشده است")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 119;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 121;BA.debugLine="Cu=MCode.Result(\"Select * From TblGoroohKala\")";
Debug.ShouldStop(16777216);
_cu = gpswiget.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,gpswiget.processBA,(Object)(RemoteObject.createImmutable("Select * From TblGoroohKala")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 122;BA.debugLine="If Cu.RowCount=0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 123;BA.debugLine="ToastMessageShow(\"جدول گروه کالا به درستی دریافت";
Debug.ShouldStop(67108864);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("جدول گروه کالا به درستی دریافت نشده است")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 124;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 126;BA.debugLine="Cu=MCode.Result(\"Select * From TblTasvie\")";
Debug.ShouldStop(536870912);
_cu = gpswiget.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,gpswiget.processBA,(Object)(RemoteObject.createImmutable("Select * From TblTasvie")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 127;BA.debugLine="If Cu.RowCount=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 128;BA.debugLine="ToastMessageShow(\"جدول تسویه حساب به درستی دریاف";
Debug.ShouldStop(-2147483648);
gpswiget.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("جدول تسویه حساب به درستی دریافت نشده است")),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 129;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 132;BA.debugLine="MCode.Action=\"SabtFaktor\"";
Debug.ShouldStop(8);
gpswiget.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtFaktor");
 BA.debugLineNum = 133;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(16);
gpswiget.mostCurrent.__c.runVoidMethod ("StartActivity",gpswiget.processBA,(Object)((gpswiget.mostCurrent._act_kaladefault.getObject())));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
 //BA.debugLineNum = 2;BA.debugLine="Private rv As RemoteViews";
gpswiget._rv = RemoteObject.createNew ("anywheresoftware.b4a.objects.RemoteViewsWrapper");
 //BA.debugLineNum = 3;BA.debugLine="Dim jobInternet As HttpJob";
gpswiget._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");
 //BA.debugLineNum = 4;BA.debugLine="Dim t1 As Timer";
gpswiget._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _receiver_receive(RemoteObject _firsttime,RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Receiver_Receive (gpswiget) ","gpswiget",6,gpswiget.processBA,gpswiget.mostCurrent,9);
if (RapidSub.canDelegate("receiver_receive")) { return ir.parsikhesab.pakhsh.gpswiget.remoteMe.runUserSub(false, "gpswiget","receiver_receive", _firsttime, _startingintent);}
Debug.locals.put("FirstTime", _firsttime);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 9;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(512);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 11;BA.debugLine="rv = ConfigureHomeWidget(\"L2\", \"rv\", 30, \"Parsik";
Debug.ShouldStop(1024);
gpswiget._rv = BA.rdebugUtils.runMethod(false, "createRemoteView", gpswiget.processBA,"gpswiget_layout", "L2",BA.ObjectToString("rv"));
 };
 BA.debugLineNum = 14;BA.debugLine="MCode.widgetEnable=rv.HandleWidgetEvents(Starting";
Debug.ShouldStop(8192);
gpswiget.mostCurrent._mcode._widgetenable /*RemoteObject*/  = gpswiget._rv.runMethod(true,"HandleWidgetEvents",gpswiget.processBA,(Object)((_startingintent.getObject())));
 BA.debugLineNum = 15;BA.debugLine="Log(\"recever\")";
Debug.ShouldStop(16384);
gpswiget.mostCurrent.__c.runVoidMethod ("LogImpl","520447238",RemoteObject.createImmutable("recever"),0);
 BA.debugLineNum = 16;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(32768);
gpswiget._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,gpswiget.processBA,(Object)(BA.ObjectToString("jobInternet")),(Object)(gpswiget.getObject()));
 BA.debugLineNum = 17;BA.debugLine="jobInternet.GetRequest.Timeout=50000";
Debug.ShouldStop(65536);
gpswiget._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 18;BA.debugLine="t1.Initialize(\"t1\", 10000)";
Debug.ShouldStop(131072);
gpswiget._t1.runVoidMethod ("Initialize",gpswiget.processBA,(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 10000)));
 BA.debugLineNum = 19;BA.debugLine="t1.Enabled = True";
Debug.ShouldStop(262144);
gpswiget._t1.runMethod(true,"setEnabled",gpswiget.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 20;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now+";
Debug.ShouldStop(524288);
gpswiget.mostCurrent.__c.runVoidMethod ("StartServiceAt",gpswiget.processBA,(Object)((gpswiget.mostCurrent._fusedlocationservice.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {gpswiget.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000)}, "+",1, 2)),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rv_requestupdate() throws Exception{
try {
		Debug.PushSubsStack("rv_RequestUpdate (gpswiget) ","gpswiget",6,gpswiget.processBA,gpswiget.mostCurrent,54);
if (RapidSub.canDelegate("rv_requestupdate")) { return ir.parsikhesab.pakhsh.gpswiget.remoteMe.runUserSub(false, "gpswiget","rv_requestupdate");}
 BA.debugLineNum = 54;BA.debugLine="Private Sub rv_RequestUpdate";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="t1.Initialize(\"t1\", 10000)";
Debug.ShouldStop(4194304);
gpswiget._t1.runVoidMethod ("Initialize",gpswiget.processBA,(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 10000)));
 BA.debugLineNum = 56;BA.debugLine="t1.Enabled = True";
Debug.ShouldStop(8388608);
gpswiget._t1.runMethod(true,"setEnabled",gpswiget.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="Log(\"UpdateWidget2\")";
Debug.ShouldStop(16777216);
gpswiget.mostCurrent.__c.runVoidMethod ("LogImpl","520643843",RemoteObject.createImmutable("UpdateWidget2"),0);
 BA.debugLineNum = 58;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now+";
Debug.ShouldStop(33554432);
gpswiget.mostCurrent.__c.runVoidMethod ("StartServiceAt",gpswiget.processBA,(Object)((gpswiget.mostCurrent._fusedlocationservice.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {gpswiget.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000)}, "+",1, 2)),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("SendGps (gpswiget) ","gpswiget",6,gpswiget.processBA,gpswiget.mostCurrent,45);
if (RapidSub.canDelegate("sendgps")) { return ir.parsikhesab.pakhsh.gpswiget.remoteMe.runUserSub(false, "gpswiget","sendgps", _str);}
Debug.locals.put("Str", _str);
 BA.debugLineNum = 45;BA.debugLine="Sub SendGps(Str As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 50;BA.debugLine="jobInternet.JobName =\"SendGps\"";
Debug.ShouldStop(131072);
gpswiget._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("SendGps"));
 BA.debugLineNum = 51;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(262144);
gpswiget._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),gpswiget.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/SaveGps"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("JsonDt="),_str,RemoteObject.createImmutable("&Imei="),gpswiget.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("t1_Tick (gpswiget) ","gpswiget",6,gpswiget.processBA,gpswiget.mostCurrent,22);
if (RapidSub.canDelegate("t1_tick")) { return ir.parsikhesab.pakhsh.gpswiget.remoteMe.runUserSub(false, "gpswiget","t1_tick");}
 BA.debugLineNum = 22;BA.debugLine="Sub t1_Tick";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="rv.SetText(\"Label2\", Application.LabelName)";
Debug.ShouldStop(4194304);
gpswiget._rv.runVoidMethod ("SetText",gpswiget.processBA,(Object)(BA.ObjectToString("Label2")),(Object)(BA.ObjectToCharSequence(gpswiget.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"))));
 BA.debugLineNum = 32;BA.debugLine="rv.SetText(\"Label3\",\"طول جغرافیایی : \"& MCode.fus";
Debug.ShouldStop(-2147483648);
gpswiget._rv.runVoidMethod ("SetText",gpswiget.processBA,(Object)(BA.ObjectToString("Label3")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("طول جغرافیایی : "),gpswiget.mostCurrent._mcode._fuslat /*RemoteObject*/ ))));
 BA.debugLineNum = 33;BA.debugLine="rv.SetText(\"Label7\",\"عرض جغرافیایی : \"& MCode.fus";
Debug.ShouldStop(1);
gpswiget._rv.runVoidMethod ("SetText",gpswiget.processBA,(Object)(BA.ObjectToString("Label7")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("عرض جغرافیایی : "),gpswiget.mostCurrent._mcode._fuslon /*RemoteObject*/ ))));
 BA.debugLineNum = 35;BA.debugLine="rv.SetText(\"Label6\",\"آخرین ساعت ارسال موقعیت : \"";
Debug.ShouldStop(4);
gpswiget._rv.runVoidMethod ("SetText",gpswiget.processBA,(Object)(BA.ObjectToString("Label6")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("آخرین ساعت ارسال موقعیت : "),gpswiget.mostCurrent._mcode._fusgettime /*RemoteObject*/ ))));
 BA.debugLineNum = 37;BA.debugLine="Log(\"SendGps\")";
Debug.ShouldStop(16);
gpswiget.mostCurrent.__c.runVoidMethod ("LogImpl","520512783",RemoteObject.createImmutable("SendGps"),0);
 BA.debugLineNum = 39;BA.debugLine="StartServiceAt(FusedLocationService,DateTime.Now+";
Debug.ShouldStop(64);
gpswiget.mostCurrent.__c.runVoidMethod ("StartServiceAt",gpswiget.processBA,(Object)((gpswiget.mostCurrent._fusedlocationservice.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {gpswiget.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000)}, "+",1, 2)),(Object)(gpswiget.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 40;BA.debugLine="rv.UpdateWidget";
Debug.ShouldStop(128);
gpswiget._rv.runVoidMethod ("UpdateWidget",gpswiget.processBA);
 BA.debugLineNum = 42;BA.debugLine="Log(\"UpdateWidget1\")";
Debug.ShouldStop(512);
gpswiget.mostCurrent.__c.runVoidMethod ("LogImpl","520512788",RemoteObject.createImmutable("UpdateWidget1"),0);
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
}