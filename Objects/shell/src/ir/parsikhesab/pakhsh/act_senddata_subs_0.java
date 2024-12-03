package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_senddata_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_senddata) ","act_senddata",47,act_senddata.mostCurrent.activityBA,act_senddata.mostCurrent,17);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_senddata.remoteMe.runUserSub(false, "act_senddata","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 17;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Activity.LoadLayout(\"L_SendData\")";
Debug.ShouldStop(131072);
act_senddata.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_SendData")),act_senddata.mostCurrent.activityBA);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Pause (act_senddata) ","act_senddata",47,act_senddata.mostCurrent.activityBA,act_senddata.mostCurrent,26);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_senddata.remoteMe.runUserSub(false, "act_senddata","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_senddata) ","act_senddata",47,act_senddata.mostCurrent.activityBA,act_senddata.mostCurrent,22);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_senddata.remoteMe.runUserSub(false, "act_senddata","activity_resume");}
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_senddata) ","act_senddata",47,act_senddata.mostCurrent.activityBA,act_senddata.mostCurrent,106);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_senddata.remoteMe.runUserSub(false, "act_senddata","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 106;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(512);
 BA.debugLineNum = 108;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return act_senddata.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("btn_Back_Click (act_senddata) ","act_senddata",47,act_senddata.mostCurrent.activityBA,act_senddata.mostCurrent,102);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_senddata.remoteMe.runUserSub(false, "act_senddata","btn_back_click");}
 BA.debugLineNum = 102;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
act_senddata.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_cancel_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_cancel_Click (act_senddata) ","act_senddata",47,act_senddata.mostCurrent.activityBA,act_senddata.mostCurrent,93);
if (RapidSub.canDelegate("btn_cancel_click")) { return ir.parsikhesab.pakhsh.act_senddata.remoteMe.runUserSub(false, "act_senddata","btn_cancel_click");}
 BA.debugLineNum = 93;BA.debugLine="Sub Btn_cancel_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
act_senddata.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_ok_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_ok_Click (act_senddata) ","act_senddata",47,act_senddata.mostCurrent.activityBA,act_senddata.mostCurrent,31);
if (RapidSub.canDelegate("btn_ok_click")) { ir.parsikhesab.pakhsh.act_senddata.remoteMe.runUserSub(false, "act_senddata","btn_ok_click"); return;}
ResumableSub_Btn_ok_Click rsub = new ResumableSub_Btn_ok_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_ok_Click extends BA.ResumableSub {
public ResumableSub_Btn_ok_Click(ir.parsikhesab.pakhsh.act_senddata parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_senddata parent;
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _dt = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _cu2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptersendfaktor");
int step14;
int limit14;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_ok_Click (act_senddata) ","act_senddata",47,act_senddata.mostCurrent.activityBA,act_senddata.mostCurrent,31);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 32;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionSt";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_senddata.mostCurrent.activityBA),parent.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 33;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود ر";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 34;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 36;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian2";
Debug.ShouldStop(8);
_date = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_senddata.mostCurrent.activityBA,(Object)(parent.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_senddata.mostCurrent.activityBA)));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 37;BA.debugLine="Dim Time As String =DateTime.Time(DateTime.Now)";
Debug.ShouldStop(16);
_time = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 38;BA.debugLine="Date = MCode.Sf.Mid(Date,1,4) & \"/\" & MCode.Sf.Mi";
Debug.ShouldStop(32);
_date = RemoteObject.concat(parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_date),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_date),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_date),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("Date", _date);
 BA.debugLineNum = 39;BA.debugLine="Dim Dt As String = Date & \"   \" & Time";
Debug.ShouldStop(64);
_dt = RemoteObject.concat(_date,RemoteObject.createImmutable("   "),_time);Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 40;BA.debugLine="MCode.SaveUpdate(\"Update TblSetting Set FldDateTi";
Debug.ShouldStop(128);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_senddata.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set FldDateTimeSend = '"),_dt,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 41;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(256);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_senddata.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblFaktor Where FldSync = 'False' GROUP BY FldShomareFaktor,FldC_Tafzili")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 42;BA.debugLine="Dim Cu2 As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(512);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_senddata.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblAshkhasNew")));Debug.locals.put("Cu2", _cu2);Debug.locals.put("Cu2", _cu2);
 BA.debugLineNum = 43;BA.debugLine="If RB_auto.Checked Then";
Debug.ShouldStop(1024);
if (true) break;

case 5:
//if
this.state = 36;
if (parent.mostCurrent._rb_auto.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 7;
}else 
{ BA.debugLineNum = 70;BA.debugLine="else If RB_Manuel.Checked Then";
Debug.ShouldStop(32);
if (parent.mostCurrent._rb_manuel.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 19;
}else 
{ BA.debugLineNum = 77;BA.debugLine="Else If RB_SendMoshtarian.Checked Then";
Debug.ShouldStop(4096);
if (parent.mostCurrent._rb_sendmoshtarian.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 27;
}else {
this.state = 35;
}}}
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 45;BA.debugLine="If Cu.RowCount>0 Or Cu2.RowCount>0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 8:
//if
this.state = 17;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_cu2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 10;
}else {
this.state = 16;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 53;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(1048576);
if (true) break;

case 11:
//for
this.state = 14;
step14 = 1;
limit14 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 14;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 13;
if (true) break;

case 38:
//C
this.state = 37;
_i = ((int)(0 + _i + step14)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 38;
 BA.debugLineNum = 54;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(2097152);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 55;BA.debugLine="Dim Item As AdapterSendFaktor";
Debug.ShouldStop(4194304);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptersendfaktor");Debug.locals.put("Item", _item);
 BA.debugLineNum = 56;BA.debugLine="Item.FldShomareFaktor=Cu.Getstring(\"FldShomare";
Debug.ShouldStop(8388608);
_item.setField ("FldShomareFaktor" /*RemoteObject*/ ,BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor")))));
 BA.debugLineNum = 57;BA.debugLine="Item.FldC_Tafzili=Cu.Getstring(\"FldC_Tafzili\")";
Debug.ShouldStop(16777216);
_item.setField ("FldC_Tafzili" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Tafzili"))));
 BA.debugLineNum = 58;BA.debugLine="Service_Server.shomareFactorSelect=Item.FldSho";
Debug.ShouldStop(33554432);
parent.mostCurrent._service_server._shomarefactorselect /*RemoteObject*/  = _item.getField(true,"FldShomareFaktor" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="ProgressDialogShow2(\"در حال ارسال اطلاعات . .";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_senddata.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال ارسال اطلاعات . . .")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 60;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_senddata.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_senddata", "btn_ok_click"),BA.numberCast(int.class, 1000));
this.state = 39;
return;
case 39:
//C
this.state = 38;
;
 BA.debugLineNum = 61;BA.debugLine="CallSubDelayed2(Service_Server,\"LoadSend2\",Ite";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_senddata.processBA,(Object)((parent.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("LoadSend2")),(Object)((_item.getField(true,"FldC_Tafzili" /*RemoteObject*/ ))));
 BA.debugLineNum = 62;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_senddata.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_senddata", "btn_ok_click"),BA.numberCast(int.class, 1000));
this.state = 40;
return;
case 40:
//C
this.state = 38;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 65;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 67;BA.debugLine="ToastMessageShow(\"اطلاعات ارسال نشده موجود نمی";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعات ارسال نشده موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 17:
//C
this.state = 36;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 71;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(64);
if (true) break;

case 20:
//if
this.state = 25;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 72;BA.debugLine="StartActivity(Act_SelFaktor)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_senddata.processBA,(Object)((parent.mostCurrent._act_selfaktor.getObject())));
 BA.debugLineNum = 73;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 75;BA.debugLine="ToastMessageShow(\"فاکتور ارسال نشده موجود نمی ب";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فاکتور ارسال نشده موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 25:
//C
this.state = 36;
;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 78;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(8192);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_senddata.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblAshkhas where FldSync='False'")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 79;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 28:
//if
this.state = 33;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 33;
 BA.debugLineNum = 81;BA.debugLine="StopService(Service_Notification)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("StopService",act_senddata.processBA,(Object)((parent.mostCurrent._service_notification.getObject())));
 BA.debugLineNum = 82;BA.debugLine="ProgressDialogShow2(\"در حال ارسال مشتریان جدید";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_senddata.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال ارسال مشتریان جدید . . .")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 83;BA.debugLine="CallSubDelayed(Service_Server,\"LoadSendAshkhasN";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",act_senddata.processBA,(Object)((parent.mostCurrent._service_server.getObject())),(Object)(RemoteObject.createImmutable("LoadSendAshkhasNew")));
 BA.debugLineNum = 84;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 86;BA.debugLine="ToastMessageShow(\"مشتری جدید ارسال نشده موجود ن";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مشتری جدید ارسال نشده موجود نمی باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 89;BA.debugLine="ToastMessageShow(\"لطفا یکی از گزینه ها را انتخاب";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا یکی از گزینه ها را انتخاب کنید.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private RB_Manuel As RadioButton";
act_senddata.mostCurrent._rb_manuel = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private RB_auto As RadioButton";
act_senddata.mostCurrent._rb_auto = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private RB_SendMoshtarian As RadioButton";
act_senddata.mostCurrent._rb_sendmoshtarian = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (act_senddata) ","act_senddata",47,act_senddata.mostCurrent.activityBA,act_senddata.mostCurrent,97);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_senddata.remoteMe.runUserSub(false, "act_senddata","lblback_click");}
 BA.debugLineNum = 97;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
act_senddata.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}