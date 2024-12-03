package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_rizfaktor_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,48);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Activity.LoadLayout(\"L_RizFaktor\")";
Debug.ShouldStop(65536);
act_rizfaktor.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_RizFaktor")),act_rizfaktor.mostCurrent.activityBA);
 BA.debugLineNum = 52;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(524288);
act_rizfaktor.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 53;BA.debugLine="Listkala.Initialize";
Debug.ShouldStop(1048576);
act_rizfaktor.mostCurrent._listkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 63;BA.debugLine="Table1.Initialize(Me, \"Table1\",9)";
Debug.ShouldStop(1073741824);
act_rizfaktor.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_initialize" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(act_rizfaktor.getObject()),(Object)(BA.ObjectToString("Table1")),(Object)(BA.numberCast(int.class, 9)));
 BA.debugLineNum = 64;BA.debugLine="Table1.AddToActivity(PnlTable, 0,0,100%x,PnlTable";
Debug.ShouldStop(-2147483648);
act_rizfaktor.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addtoactivity" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), act_rizfaktor.mostCurrent._pnltable.getObject()),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_rizfaktor.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_rizfaktor.mostCurrent.activityBA)),(Object)(act_rizfaktor.mostCurrent._pnltable.runMethod(true,"getHeight")));
 BA.debugLineNum = 68;BA.debugLine="th.Initialise(\"th\")";
Debug.ShouldStop(8);
act_rizfaktor._th.runVoidMethod ("Initialise",act_rizfaktor.processBA,(Object)(RemoteObject.createImmutable("th")));
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,326);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 326;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_rizfaktor.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 329;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
act_rizfaktor.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 331;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return act_rizfaktor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Pause (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,348);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 348;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,334);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","activity_resume");}
 BA.debugLineNum = 334;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 345;BA.debugLine="th.RunOnGuiThread(\"LoadListKalaFaktor\",Null)";
Debug.ShouldStop(16777216);
act_rizfaktor._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadListKalaFaktor")),(Object)((act_rizfaktor.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Application_Error (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,641);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 641;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(1);
 BA.debugLineNum = 643;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return act_rizfaktor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 644;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btn_Back_Click (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,585);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","btn_back_click");}
 BA.debugLineNum = 585;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 586;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
act_rizfaktor.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 587;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_del_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_del_Click (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,477);
if (RapidSub.canDelegate("btn_del_click")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","btn_del_click");}
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 477;BA.debugLine="Sub Btn_del_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 478;BA.debugLine="Dim res As Int = Msgbox2(\"آیا از حذف این فاکتور م";
Debug.ShouldStop(536870912);
_res = act_rizfaktor.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("آیا از حذف این فاکتور مطمئن هستید؟")),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((act_rizfaktor.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_rizfaktor.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png"))).getObject())),act_rizfaktor.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 479;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, act_rizfaktor.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 480;BA.debugLine="MCode.CreateBK(\"\")";
Debug.ShouldStop(-2147483648);
act_rizfaktor.mostCurrent._mcode.runVoidMethod ("_createbk" /*void*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 481;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor Where Fl";
Debug.ShouldStop(1);
act_rizfaktor.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblFaktor Where FldShomareFaktor = '"),act_rizfaktor.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 484;BA.debugLine="SaveLastVisit";
Debug.ShouldStop(8);
_savelastvisit();
 BA.debugLineNum = 485;BA.debugLine="ToastMessageShow(\"فاکتور مورد نظر حذف گردید\",Tru";
Debug.ShouldStop(16);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فاکتور مورد نظر حذف گردید")),(Object)(act_rizfaktor.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 486;BA.debugLine="MCode.FaktorSelect=\"\"";
Debug.ShouldStop(32);
act_rizfaktor.mostCurrent._mcode._faktorselect /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 487;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
act_rizfaktor.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_edit_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Edit_Click (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,503);
if (RapidSub.canDelegate("btn_edit_click")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","btn_edit_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 503;BA.debugLine="Sub Btn_Edit_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 505;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(16777216);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_rizfaktor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 506;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 507;BA.debugLine="Dim res As Int = Msgbox2(\"در صورتی که بخواهید ای";
Debug.ShouldStop(67108864);
_res = act_rizfaktor.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("در صورتی که بخواهید این فاکتور را ویرایش کنید ، سبد خرید شما حذف می شود، آیا می خواهید ادامه دهید؟")),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((act_rizfaktor.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_rizfaktor.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("logo.png"))).getObject())),act_rizfaktor.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 508;BA.debugLine="If res=DialogResponse.POSITIVE Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, act_rizfaktor.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 509;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
Debug.ShouldStop(268435456);
act_rizfaktor.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Delete From TblSabad")));
 BA.debugLineNum = 510;BA.debugLine="FaktorToSabad(\"False\")";
Debug.ShouldStop(536870912);
_faktortosabad(RemoteObject.createImmutable("False"));
 };
 }else {
 BA.debugLineNum = 513;BA.debugLine="FaktorToSabad(\"False\")";
Debug.ShouldStop(1);
_faktortosabad(RemoteObject.createImmutable("False"));
 };
 BA.debugLineNum = 515;BA.debugLine="If isMarjoei=\"True\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_rizfaktor.mostCurrent._ismarjoei,BA.ObjectToString("True"))) { 
 BA.debugLineNum = 516;BA.debugLine="MCode.Action=\"UpdateMarjooii\"";
Debug.ShouldStop(8);
act_rizfaktor.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("UpdateMarjooii");
 BA.debugLineNum = 517;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(16);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizfaktor.processBA,(Object)((act_rizfaktor.mostCurrent._act_kaladefault.getObject())));
 }else {
 BA.debugLineNum = 519;BA.debugLine="MCode.Action=\"SabtFaktor\"";
Debug.ShouldStop(64);
act_rizfaktor.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtFaktor");
 BA.debugLineNum = 520;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(128);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizfaktor.processBA,(Object)((act_rizfaktor.mostCurrent._act_kaladefault.getObject())));
 };
 BA.debugLineNum = 522;BA.debugLine="MCode.Action=\"SabtFaktor\"";
Debug.ShouldStop(512);
act_rizfaktor.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtFaktor");
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
public static RemoteObject  _btn_print_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_print_Click (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,458);
if (RapidSub.canDelegate("btn_print_click")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","btn_print_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 458;BA.debugLine="Sub Btn_print_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 459;BA.debugLine="Act_PrintPic.Faktor	  = Faktor";
Debug.ShouldStop(1024);
act_rizfaktor.mostCurrent._act_printpic._faktor /*RemoteObject*/  = act_rizfaktor._faktor;
 BA.debugLineNum = 460;BA.debugLine="Act_PrintPic.listKala = Listkala";
Debug.ShouldStop(2048);
act_rizfaktor.mostCurrent._act_printpic._listkala /*RemoteObject*/  = act_rizfaktor.mostCurrent._listkala;
 BA.debugLineNum = 461;BA.debugLine="Dim Lst As List = Array As String(\"چاپ 1\",\"چاپ مو";
Debug.ShouldStop(4096);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_rizfaktor.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("چاپ 1"),RemoteObject.createImmutable("چاپ مولایی")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 462;BA.debugLine="Dim res As Int = InputList(Lst,\"نوع چاپ را انتخاب";
Debug.ShouldStop(8192);
_res = act_rizfaktor.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("نوع چاپ را انتخاب نمایید:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_rizfaktor.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 463;BA.debugLine="Select Case res";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 465;BA.debugLine="Act_PrintPic.TypePrint=res";
Debug.ShouldStop(65536);
act_rizfaktor.mostCurrent._act_printpic._typeprint /*RemoteObject*/  = _res;
 BA.debugLineNum = 466;BA.debugLine="StartActivity(Act_PrintPic)";
Debug.ShouldStop(131072);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizfaktor.processBA,(Object)((act_rizfaktor.mostCurrent._act_printpic.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 468;BA.debugLine="Act_PrintPic.TypePrint=res";
Debug.ShouldStop(524288);
act_rizfaktor.mostCurrent._act_printpic._typeprint /*RemoteObject*/  = _res;
 BA.debugLineNum = 469;BA.debugLine="StartActivity(Act_PrintPic)";
Debug.ShouldStop(1048576);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizfaktor.processBA,(Object)((act_rizfaktor.mostCurrent._act_printpic.getObject())));
 break; }
}
;
 BA.debugLineNum = 475;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_sendfactor_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_SendFactor_Click (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,422);
if (RapidSub.canDelegate("btn_sendfactor_click")) { ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","btn_sendfactor_click"); return;}
ResumableSub_Btn_SendFactor_Click rsub = new ResumableSub_Btn_SendFactor_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_SendFactor_Click extends BA.ResumableSub {
public ResumableSub_Btn_SendFactor_Click(ir.parsikhesab.pakhsh.act_rizfaktor parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_rizfaktor parent;
RemoteObject _shomarefactor = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_SendFactor_Click (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,422);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 423;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionSt";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA),parent.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 424;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود ر";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 425;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 427;BA.debugLine="ProgressDialogShow2(\"در حال ارسال موارد انتخابی .";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_rizfaktor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال ارسال موارد انتخابی . . .")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 428;BA.debugLine="Btn_SendFactor.Enabled=False";
Debug.ShouldStop(2048);
parent.mostCurrent._btn_sendfactor.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 429;BA.debugLine="Dim shomarefactor As Int=0";
Debug.ShouldStop(4096);
_shomarefactor = BA.numberCast(int.class, 0);Debug.locals.put("shomarefactor", _shomarefactor);Debug.locals.put("shomarefactor", _shomarefactor);
 BA.debugLineNum = 430;BA.debugLine="shomarefactor=MCode.FaktorSelect";
Debug.ShouldStop(8192);
_shomarefactor = BA.numberCast(int.class, parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ );Debug.locals.put("shomarefactor", _shomarefactor);
 BA.debugLineNum = 431;BA.debugLine="If shomarefactor>0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//if
this.state = 20;
if (RemoteObject.solveBoolean(">",_shomarefactor,BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 435;BA.debugLine="If Faktor.synced=True Then";
Debug.ShouldStop(262144);
if (true) break;

case 8:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",parent._faktor.getField(true,"synced" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 10;
}else {
this.state = 18;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 436;BA.debugLine="Dim Res As Int = Msgbox2(\"این سفارش قبلا ارسال";
Debug.ShouldStop(524288);
_res = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("این سفارش قبلا ارسال شده است آیا مجددا ارسال شود؟")),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),act_rizfaktor.mostCurrent.activityBA);Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 437;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1048576);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 438;BA.debugLine="CallSubDelayed2(Service_Server,\"LoadSend\",shom";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_rizfaktor.processBA,(Object)((parent.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("LoadSend")),(Object)((_shomarefactor)));
 BA.debugLineNum = 439;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_rizfaktor.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizfaktor", "btn_sendfactor_click"),BA.numberCast(int.class, 1000));
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 440;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 442;BA.debugLine="Btn_SendFactor.Enabled=True";
Debug.ShouldStop(33554432);
parent.mostCurrent._btn_sendfactor.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 443;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 447;BA.debugLine="CallSubDelayed2(Service_Server,\"LoadSend\",shoma";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_rizfaktor.processBA,(Object)((parent.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("LoadSend")),(Object)((_shomarefactor)));
 BA.debugLineNum = 448;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_rizfaktor.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizfaktor", "btn_sendfactor_click"),BA.numberCast(int.class, 1000));
this.state = 22;
return;
case 22:
//C
this.state = 19;
;
 BA.debugLineNum = 449;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static RemoteObject  _btnmarjooii_click() throws Exception{
try {
		Debug.PushSubsStack("btnMarjooii_Click (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,646);
if (RapidSub.canDelegate("btnmarjooii_click")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","btnmarjooii_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 646;BA.debugLine="Private Sub btnMarjooii_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 648;BA.debugLine="MCode.Action=\"SabtMarjooii\"";
Debug.ShouldStop(128);
act_rizfaktor.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtMarjooii");
 BA.debugLineNum = 649;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(256);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_rizfaktor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 650;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 651;BA.debugLine="Dim res As Int = Msgbox2(\"در صورتی که بخواهید ای";
Debug.ShouldStop(1024);
_res = act_rizfaktor.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("در صورتی که بخواهید این فاکتور را ویرایش کنید ، سبد خرید شما حذف می شود، آیا می خواهید ادامه دهید؟")),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((act_rizfaktor.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_rizfaktor.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("logo.png"))).getObject())),act_rizfaktor.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 652;BA.debugLine="If res=DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, act_rizfaktor.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 653;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
Debug.ShouldStop(4096);
act_rizfaktor.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Delete From TblSabad")));
 BA.debugLineNum = 654;BA.debugLine="FaktorToSabad(\"True\")";
Debug.ShouldStop(8192);
_faktortosabad(RemoteObject.createImmutable("True"));
 };
 }else {
 BA.debugLineNum = 657;BA.debugLine="FaktorToSabad(\"True\")";
Debug.ShouldStop(65536);
_faktortosabad(RemoteObject.createImmutable("True"));
 };
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _createpge() throws Exception{
try {
		Debug.PushSubsStack("CreatePge (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,92);
if (RapidSub.canDelegate("createpge")) { ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","createpge"); return;}
ResumableSub_CreatePge rsub = new ResumableSub_CreatePge(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreatePge extends BA.ResumableSub {
public ResumableSub_CreatePge(ir.parsikhesab.pakhsh.act_rizfaktor parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_rizfaktor parent;
RemoteObject _cutasview = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreatePge (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,92);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 93;BA.debugLine="Sleep(200)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_rizfaktor.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizfaktor", "createpge"),BA.numberCast(int.class, 200));
this.state = 33;
return;
case 33:
//C
this.state = 1;
;
 BA.debugLineNum = 95;BA.debugLine="TxtSharhFaktor.Text = Faktor.fldTozihFaktor";
Debug.ShouldStop(1073741824);
parent.mostCurrent._txtsharhfaktor.runMethod(true,"setText",BA.ObjectToCharSequence(parent._faktor.getField(true,"fldTozihFaktor" /*RemoteObject*/ )));
 BA.debugLineNum = 96;BA.debugLine="MCode.Tozihat_faktor=Faktor.fldTozihFaktor";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mcode._tozihat_faktor /*RemoteObject*/  = parent._faktor.getField(true,"fldTozihFaktor" /*RemoteObject*/ );
 BA.debugLineNum = 97;BA.debugLine="Dim CuTasview As Cursor = MCode.Result(\"Select *";
Debug.ShouldStop(1);
_cutasview = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cutasview = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblTasvie Where FldCode = '"),parent._faktor.getField(true,"fldC_Tasvie" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));Debug.locals.put("CuTasview", _cutasview);Debug.locals.put("CuTasview", _cutasview);
 BA.debugLineNum = 98;BA.debugLine="If CuTasview.RowCount>0 Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(">",_cutasview.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 99;BA.debugLine="CuTasview.Position=0";
Debug.ShouldStop(4);
_cutasview.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 100;BA.debugLine="LblNoeTasvie.Text = CuTasview.GetString(\"FldName";
Debug.ShouldStop(8);
parent.mostCurrent._lblnoetasvie.runMethod(true,"setText",BA.ObjectToCharSequence(_cutasview.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldName")))));
 BA.debugLineNum = 101;BA.debugLine="MCode.NoeTasvieFaktor=CuTasview.GetString(\"FldNa";
Debug.ShouldStop(16);
parent.mostCurrent._mcode._noetasviefaktor /*RemoteObject*/  = _cutasview.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldName")));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 104;BA.debugLine="LblTotalFaktor.Text = NumberFormat(myCode.Is_Null";
Debug.ShouldStop(128);
parent.mostCurrent._lbltotalfaktor.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(parent._faktor.getField(true,"fldMablaghKol" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 107;BA.debugLine="LblTotalFaktor2.text = NumberFormat(myCode.Is_Nul";
Debug.ShouldStop(1024);
parent.mostCurrent._lbltotalfaktor2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(parent._faktor.getField(true,"fldMablaghKol" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 5:
//try
this.state = 14;
this.catchState = 13;
this.state = 7;
if (true) break;

case 7:
//C
this.state = 8;
this.catchState = 13;
 BA.debugLineNum = 109;BA.debugLine="If Faktor.fldTozihFaktor = \"\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",parent._faktor.getField(true,"fldTozihFaktor" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 110;BA.debugLine="TxtSharhFaktor.Text = \"\"";
Debug.ShouldStop(8192);
parent.mostCurrent._txtsharhfaktor.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 11:
//C
this.state = 14;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 113;BA.debugLine="TxtSharhFaktor.Text = \"\"";
Debug.ShouldStop(65536);
parent.mostCurrent._txtsharhfaktor.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
;
 BA.debugLineNum = 117;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(1048576);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas where fldCodetafzili='"),parent._faktor.getField(true,"fldC_Ashkhas" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu1", _cu1);Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 118;BA.debugLine="If Cu1.RowCount>0 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 15:
//if
this.state = 26;
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 17;
}else {
this.state = 25;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 119;BA.debugLine="Cu1.Position=0";
Debug.ShouldStop(4194304);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 120;BA.debugLine="LblNameMoshtari.Text=Cu1.GetString(\"fldSharheTaf";
Debug.ShouldStop(8388608);
parent.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili")))));
 BA.debugLineNum = 121;BA.debugLine="Faktor.C_Name=Cu1.GetString(\"fldSharheTafzili\")";
Debug.ShouldStop(16777216);
parent._faktor.setField ("C_Name" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili"))));
 BA.debugLineNum = 123;BA.debugLine="If IsNumber(Cu1.GetString(\"fldMande\")) = True Th";
Debug.ShouldStop(67108864);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMande"))))),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 124;BA.debugLine="LblMandeGhabl.text = NumberFormat(Cu1.GetString";
Debug.ShouldStop(134217728);
parent.mostCurrent._lblmandeghabl.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMande"))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 125;BA.debugLine="Faktor.fldSumMandeAzGhabl=Cu1.GetString(\"fldMan";
Debug.ShouldStop(268435456);
parent._faktor.setField ("fldSumMandeAzGhabl" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMande"))));
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 127;BA.debugLine="LblMandeGhabl.text = \"-\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lblmandeghabl.runMethod(true,"setText",BA.ObjectToCharSequence("-"));
 BA.debugLineNum = 128;BA.debugLine="Faktor.fldSumMandeAzGhabl=0";
Debug.ShouldStop(-2147483648);
parent._faktor.setField ("fldSumMandeAzGhabl" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 131;BA.debugLine="ToastMessageShow(\"اطلاعات مشتری یافت نشد احتمالا";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعات مشتری یافت نشد احتمالا از لیست مشتریان شما حذف شده است")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 132;BA.debugLine="LblNameMoshtari.Text=\"نام مشتری یافت نشد\"";
Debug.ShouldStop(8);
parent.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence("نام مشتری یافت نشد"));
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 136;BA.debugLine="LblTakhfifKala.text = NumberFormat(myCode.Is_Null";
Debug.ShouldStop(128);
parent.mostCurrent._lbltakhfifkala.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(parent._faktor.getField(true,"FldTakhfifKala" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 137;BA.debugLine="LblTakhfifVizhe.text = NumberFormat(myCode.Is_Nul";
Debug.ShouldStop(256);
parent.mostCurrent._lbltakhfifvizhe.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(parent._faktor.getField(true,"FldTakhfifVizhe" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 138;BA.debugLine="lblMablaghBadAzTakhfif.Text=myCode.AdadToPrice(Fa";
Debug.ShouldStop(512);
parent.mostCurrent._lblmablaghbadaztakhfif.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(parent._faktor.getField(true,"fldSumMablaghBadAzTakhfif" /*RemoteObject*/ )))));
 BA.debugLineNum = 139;BA.debugLine="LblMablaghKhales.text = NumberFormat(myCode.Is_Nu";
Debug.ShouldStop(1024);
parent.mostCurrent._lblmablaghkhales.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(parent._faktor.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 140;BA.debugLine="LblGHabelePardakht.text = NumberFormat(myCode.Is_";
Debug.ShouldStop(2048);
parent.mostCurrent._lblghabelepardakht.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(parent._faktor.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 142;BA.debugLine="If MCode.Amani=1 Then";
Debug.ShouldStop(8192);
if (true) break;

case 27:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._amani /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 143;BA.debugLine="lblCheckAmani.Visible=True";
Debug.ShouldStop(16384);
parent.mostCurrent._lblcheckamani.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 145;BA.debugLine="lblCheckAmani.Visible=False";
Debug.ShouldStop(65536);
parent.mostCurrent._lblcheckamani.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 159;BA.debugLine="Grid";
Debug.ShouldStop(1073741824);
_grid();
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_rizfaktor.processBA, e0.toString());}
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
public static RemoteObject  _faktortosabad(RemoteObject _marjoee) throws Exception{
try {
		Debug.PushSubsStack("FaktorToSabad (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,352);
if (RapidSub.canDelegate("faktortosabad")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","faktortosabad", _marjoee);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("marjoee", _marjoee);
 BA.debugLineNum = 352;BA.debugLine="Sub FaktorToSabad(marjoee As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 354;BA.debugLine="MCode.editFactor=True";
Debug.ShouldStop(2);
act_rizfaktor.mostCurrent._mcode._editfactor /*RemoteObject*/  = act_rizfaktor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 355;BA.debugLine="MCode.FaktorSelect=Faktor.FldShomareFaktor";
Debug.ShouldStop(4);
act_rizfaktor.mostCurrent._mcode._faktorselect /*RemoteObject*/  = act_rizfaktor._faktor.getField(true,"fldShomareFaktor" /*RemoteObject*/ );
 BA.debugLineNum = 356;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(8);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_rizfaktor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblFaktor Where FldShomareFaktor = '"),act_rizfaktor.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable("' "))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 357;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 358;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(32);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 359;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(64);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 360;BA.debugLine="Log(Cu.GetString(\"FldNamekala\"))";
Debug.ShouldStop(128);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("LogImpl","568878344",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNamekala"))),0);
 BA.debugLineNum = 361;BA.debugLine="Log(Cu.GetString(\"FldFeeForoosh\"))";
Debug.ShouldStop(256);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("LogImpl","568878345",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFeeForoosh"))),0);
 BA.debugLineNum = 362;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblSabad (FldCod";
Debug.ShouldStop(512);
act_rizfaktor.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblSabad (FldCodeKala,FldNameKala,FldFeeForoosh,fldFeeBadAzTakhfif,FldNamevahed,FldNameVahed2,fldPathPic,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldMablaghMasrafKonande,FldSumMande,fldDarsadArzeshAfzode,fldArzeshAfzode,FldTedadDarKarton,FldMablaghTakhfif,FldDarsadTakhfif,FldVaziatPardakht,FldAmani,fldShomareForoosh,fldSharh) Values ('"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNamekala"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFeeForoosh"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNameVahed"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNameVahed2"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTozihat"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghMasrafKonande"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSumMande"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDarsadArzeshAfzode"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldArzeshAfzode"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarKarton"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif"))),RemoteObject.createImmutable("',"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVaziatPardakht"))),RemoteObject.createImmutable(",'"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAmani"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))),RemoteObject.createImmutable("','"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTozih"))),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 370;BA.debugLine="If marjoee=\"False\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_marjoee,BA.ObjectToString("False"))) { 
 BA.debugLineNum = 371;BA.debugLine="marjoee=Cu.GetString(\"WIsBacked\")";
Debug.ShouldStop(262144);
_marjoee = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("WIsBacked")));Debug.locals.put("marjoee", _marjoee);
 };
 BA.debugLineNum = 373;BA.debugLine="MCode.isAmani=Cu.GetString(\"FldAmani\")";
Debug.ShouldStop(1048576);
act_rizfaktor.mostCurrent._mcode._isamani /*RemoteObject*/  = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAmani")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 375;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set fldSharh";
Debug.ShouldStop(4194304);
act_rizfaktor.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Update TblSabad Set fldSharh = '' Where fldSharh = ''")));
 };
 BA.debugLineNum = 404;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set fldSharh =";
Debug.ShouldStop(524288);
act_rizfaktor.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Update TblSabad Set fldSharh = '' Where fldSharh = ''")));
 BA.debugLineNum = 405;BA.debugLine="If MCode.Action=\"UpdateMarjooii\" Or MCode.Action";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",act_rizfaktor.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("UpdateMarjooii")) || RemoteObject.solveBoolean("=",act_rizfaktor.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 407;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(4194304);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizfaktor.processBA,(Object)((act_rizfaktor.mostCurrent._act_kaladefault.getObject())));
 }else {
 BA.debugLineNum = 409;BA.debugLine="MCode.Action=\"SabtFaktor\"";
Debug.ShouldStop(16777216);
act_rizfaktor.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtFaktor");
 BA.debugLineNum = 410;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(33554432);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizfaktor.processBA,(Object)((act_rizfaktor.mostCurrent._act_kaladefault.getObject())));
 };
 BA.debugLineNum = 413;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
act_rizfaktor.mostCurrent._activity.runVoidMethod ("Finish");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizfaktor.processBA, e27.toString()); BA.debugLineNum = 415;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(1073741824);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("LogImpl","568878399",act_rizfaktor.mostCurrent.__c.runMethod(false,"LastException",act_rizfaktor.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 416;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(-2147483648);
act_rizfaktor.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_rizfaktor.mostCurrent.__c.runMethod(false,"LastException",act_rizfaktor.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_rizfaktor.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-FaktorToSabad"))));
 };
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim Table1 As Table";
act_rizfaktor.mostCurrent._table1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table");
 //BA.debugLineNum = 14;BA.debugLine="Dim Key As IME";
act_rizfaktor.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 15;BA.debugLine="Dim Listkala As List";
act_rizfaktor.mostCurrent._listkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="Private LblNoeTasvie As Label";
act_rizfaktor.mostCurrent._lblnoetasvie = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private LblNameMoshtari As Label";
act_rizfaktor.mostCurrent._lblnamemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private TxtSharhFaktor As Label";
act_rizfaktor.mostCurrent._txtsharhfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LblTotalFaktor As Label";
act_rizfaktor.mostCurrent._lbltotalfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Btn_print As Button";
act_rizfaktor.mostCurrent._btn_print = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Btn_SendFactor As Button";
act_rizfaktor.mostCurrent._btn_sendfactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Btn_del As Button";
act_rizfaktor.mostCurrent._btn_del = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Btn_Edit As Button";
act_rizfaktor.mostCurrent._btn_edit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private PnlTable As Panel";
act_rizfaktor.mostCurrent._pnltable = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private LblGHabelePardakht As Label";
act_rizfaktor.mostCurrent._lblghabelepardakht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private LblMandeGhabl As Label";
act_rizfaktor.mostCurrent._lblmandeghabl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private LblTakhfifVizhe As Label";
act_rizfaktor.mostCurrent._lbltakhfifvizhe = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private LblTakhfifRiali As Label";
act_rizfaktor.mostCurrent._lbltakhfifriali = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private LblTakhfifKala As Label";
act_rizfaktor.mostCurrent._lbltakhfifkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private LblTotalFaktor2 As Label";
act_rizfaktor.mostCurrent._lbltotalfaktor2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Dim Item1 As AdapterListKala";
act_rizfaktor.mostCurrent._item1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
 //BA.debugLineNum = 34;BA.debugLine="Private LblMablaghKhales As Label";
act_rizfaktor.mostCurrent._lblmablaghkhales = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lblShomareFactor As Label";
act_rizfaktor.mostCurrent._lblshomarefactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Dim mablaghFinal As String";
act_rizfaktor.mostCurrent._mablaghfinal = RemoteObject.createImmutable("");
 //BA.debugLineNum = 37;BA.debugLine="Private lblShomareForoosh As Label";
act_rizfaktor.mostCurrent._lblshomareforoosh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btnMarjooii As Button";
act_rizfaktor.mostCurrent._btnmarjooii = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim isMarjoei As String=\"False\"";
act_rizfaktor.mostCurrent._ismarjoei = BA.ObjectToString("False");
 //BA.debugLineNum = 40;BA.debugLine="Private lblCheckAmani As Label";
act_rizfaktor.mostCurrent._lblcheckamani = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private lblType As Label";
act_rizfaktor.mostCurrent._lbltype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private lblVaziat As Label";
act_rizfaktor.mostCurrent._lblvaziat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private lblDarsadArzeshAfzode As Label";
act_rizfaktor.mostCurrent._lbldarsadarzeshafzode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private lblArzeshAfzode As Label";
act_rizfaktor.mostCurrent._lblarzeshafzode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private lblMablaghBadAzTakhfif As Label";
act_rizfaktor.mostCurrent._lblmablaghbadaztakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _grid() throws Exception{
try {
		Debug.PushSubsStack("Grid (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,76);
if (RapidSub.canDelegate("grid")) { ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","grid"); return;}
ResumableSub_Grid rsub = new ResumableSub_Grid(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Grid extends BA.ResumableSub {
public ResumableSub_Grid(ir.parsikhesab.pakhsh.act_rizfaktor parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_rizfaktor parent;
RemoteObject _lst_colnametitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Grid (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,76);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 77;BA.debugLine="Sleep(200)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_rizfaktor.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizfaktor", "grid"),BA.numberCast(int.class, 200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 78;BA.debugLine="Dim Lst_ColNameTitle As List";
Debug.ShouldStop(8192);
_lst_colnametitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
 BA.debugLineNum = 79;BA.debugLine="Lst_ColNameTitle.Initialize";
Debug.ShouldStop(16384);
_lst_colnametitle.runVoidMethod ("Initialize");
 BA.debugLineNum = 81;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"ردیف\",\"ن";
Debug.ShouldStop(65536);
_lst_colnametitle.runVoidMethod ("AddAll",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {15},new Object[] {BA.ObjectToString("ردیف"),BA.ObjectToString("نام کالا"),BA.ObjectToString("کد کالا"),BA.ObjectToString("فروش فی"),BA.ObjectToString("بعد از تخفیف فی"),BA.ObjectToString("تخفیف ویژه"),BA.ObjectToString("درصد تخفیف"),BA.ObjectToString("تخفیف کالا"),BA.ObjectToString("درصد ارزش افزوده"),BA.ObjectToString("مبلغ ارزش افزوده"),BA.ObjectToString("تعداد جزء"),BA.ObjectToString("واحد جزء"),BA.ObjectToString("تعداد کل"),BA.ObjectToString("واحد کل"),RemoteObject.createImmutable("توضیحات")})))));
 BA.debugLineNum = 84;BA.debugLine="Table1.LoadSList(Listkala,Lst_ColNameTitle,15)";
Debug.ShouldStop(524288);
parent.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_loadslist" /*RemoteObject*/ ,(Object)(parent.mostCurrent._listkala),(Object)(_lst_colnametitle),(Object)(BA.numberCast(int.class, 15)));
 BA.debugLineNum = 87;BA.debugLine="Table1.SetColumnsWidths(Array As Int(50dip,100dip";
Debug.ShouldStop(4194304);
parent.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("int",new int[] {15},new Object[] {parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))})));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,318);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","lblback_click");}
 BA.debugLineNum = 318;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="Activity_KeyPress(KeyCodes.KEYCODE_BACK)";
Debug.ShouldStop(1073741824);
_activity_keypress(act_rizfaktor.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK"));
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("LoadData (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,591);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","loaddata", _lst);}
RemoteObject _fldtakhfifvizhe = RemoteObject.createImmutable(0);
RemoteObject _fldtakhfifkala = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 591;BA.debugLine="Sub LoadData(lst As List)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 593;BA.debugLine="If lst.Size>0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 594;BA.debugLine="Dim FldTakhfifVizhe,FldTakhfifKala As Int=0";
Debug.ShouldStop(131072);
_fldtakhfifvizhe = RemoteObject.createImmutable(0);Debug.locals.put("FldTakhfifVizhe", _fldtakhfifvizhe);
_fldtakhfifkala = BA.numberCast(int.class, 0);Debug.locals.put("FldTakhfifKala", _fldtakhfifkala);Debug.locals.put("FldTakhfifKala", _fldtakhfifkala);
 BA.debugLineNum = 595;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(262144);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 596;BA.debugLine="For i=0 To lst.Size-1";
Debug.ShouldStop(524288);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 597;BA.debugLine="Row=lst.Get(i)";
Debug.ShouldStop(1048576);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 598;BA.debugLine="Dim Item As AdapterListKala";
Debug.ShouldStop(2097152);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 602;BA.debugLine="Item.CodeKala=Row.Get(\"fldCodeKala\")";
Debug.ShouldStop(33554432);
_item.setField ("CodeKala" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))));
 BA.debugLineNum = 604;BA.debugLine="Item.NameKala=Row.Get(\"fldSharhKala\")";
Debug.ShouldStop(134217728);
_item.setField ("NameKala" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharhKala"))))));
 BA.debugLineNum = 605;BA.debugLine="Item.FeeForoosh=Row.Get(\"fldFeeForoosh\")";
Debug.ShouldStop(268435456);
_item.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeForoosh"))))));
 BA.debugLineNum = 606;BA.debugLine="Item.FldFeeBadAzTakhfif=myCode.Is_Null_adad(Row";
Debug.ShouldStop(536870912);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,act_rizfaktor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeBadAzTakhfif"))))))));
 BA.debugLineNum = 607;BA.debugLine="Item.MablaghTakhfif=myCode.Is_Null_adad(Row.Get";
Debug.ShouldStop(1073741824);
_item.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, act_rizfaktor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MablaghTakhfif")))))))));
 BA.debugLineNum = 608;BA.debugLine="Item.NameVahed=MCode.SingleResult(\"select FldNa";
Debug.ShouldStop(-2147483648);
_item.setField ("NameVahed" /*RemoteObject*/ ,BA.ObjectToString(act_rizfaktor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select FldNameVahed from TblKala where fldCodeKala="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))))))));
 BA.debugLineNum = 609;BA.debugLine="Item.NameVahed2=MCode.SingleResult(\"select FldN";
Debug.ShouldStop(1);
_item.setField ("NameVahed2" /*RemoteObject*/ ,BA.ObjectToString(act_rizfaktor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select FldNameVahed2 from TblKala where fldCodeKala="),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala")))))))));
 BA.debugLineNum = 610;BA.debugLine="Item.fldPathPic=Row.Get(\"fldPathPic\")";
Debug.ShouldStop(2);
_item.setField ("fldPathPic" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldPathPic"))))));
 BA.debugLineNum = 611;BA.debugLine="Item.TedadDarSabadJoz=Row.Get(\"fldTedadJoz\")";
Debug.ShouldStop(4);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz"))))));
 BA.debugLineNum = 612;BA.debugLine="Item.TedadDarSabadKol=Row.Get(\"fldTedadCarton\")";
Debug.ShouldStop(8);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))));
 BA.debugLineNum = 613;BA.debugLine="Item.TedadDarKarton=Row.Get(\"fldTedadDarKarton\"";
Debug.ShouldStop(16);
_item.setField ("TedadDarKarton" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadDarKarton"))))));
 BA.debugLineNum = 614;BA.debugLine="Item.MablaghTakhfif=myCode.Is_Null_adad(Row.Get";
Debug.ShouldStop(32);
_item.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, act_rizfaktor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldMablaghTakhfif")))))))));
 BA.debugLineNum = 615;BA.debugLine="If Item.fldFeeBadAzTakhfif>0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 616;BA.debugLine="Item.TakhfifKala=Item.FeeForoosh-Item.FldFeeBa";
Debug.ShouldStop(128);
_item.setField ("TakhfifKala" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))}, "-",1, 0)));
 BA.debugLineNum = 617;BA.debugLine="FldTakhfifKala=FldTakhfifKala+Item.TakhfifKala";
Debug.ShouldStop(256);
_fldtakhfifkala = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_fldtakhfifkala,BA.numberCast(double.class, _item.getField(true,"TakhfifKala" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("FldTakhfifKala", _fldtakhfifkala);
 };
 BA.debugLineNum = 619;BA.debugLine="If Item.MablaghTakhfif>0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 620;BA.debugLine="FldTakhfifVizhe=FldTakhfifVizhe+Item.MablaghTa";
Debug.ShouldStop(2048);
_fldtakhfifvizhe = RemoteObject.solve(new RemoteObject[] {_fldtakhfifvizhe,_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("FldTakhfifVizhe", _fldtakhfifvizhe);
 };
 BA.debugLineNum = 622;BA.debugLine="Item.FldMablaghMasrafKonande=Row.Get(\"fldGhymat";
Debug.ShouldStop(8192);
_item.setField ("FldMablaghMasrafKonande" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldGhymatMasrafkonande"))))));
 BA.debugLineNum = 625;BA.debugLine="Faktor.Signature=Row.Get(\"FldSignatureBitmapStr";
Debug.ShouldStop(65536);
act_rizfaktor._faktor.setField ("Signature" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldSignatureBitmapString"))))));
 BA.debugLineNum = 626;BA.debugLine="Item.Tozihat=myCode.Is_Null(Row.Get(\"fldTozihat";
Debug.ShouldStop(131072);
_item.setField ("Tozihat" /*RemoteObject*/ ,act_rizfaktor.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTozihatRecord"))))))));
 BA.debugLineNum = 627;BA.debugLine="Faktor.fldTozihFaktor = myCode.Is_Null(Row.Get(";
Debug.ShouldStop(262144);
act_rizfaktor._faktor.setField ("fldTozihFaktor" /*RemoteObject*/ ,act_rizfaktor.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTozihat"))))))));
 BA.debugLineNum = 629;BA.debugLine="Listkala.Add(Item)";
Debug.ShouldStop(1048576);
act_rizfaktor.mostCurrent._listkala.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 631;BA.debugLine="Faktor.FldTakhfifKala=FldTakhfifKala";
Debug.ShouldStop(4194304);
act_rizfaktor._faktor.setField ("FldTakhfifKala" /*RemoteObject*/ ,BA.NumberToString(_fldtakhfifkala));
 BA.debugLineNum = 632;BA.debugLine="Faktor.FldTakhfifVizhe=FldTakhfifVizhe";
Debug.ShouldStop(8388608);
act_rizfaktor._faktor.setField ("FldTakhfifVizhe" /*RemoteObject*/ ,BA.NumberToString(_fldtakhfifvizhe));
 BA.debugLineNum = 634;BA.debugLine="MCode.IsOnlineDataFactor=0";
Debug.ShouldStop(33554432);
act_rizfaktor.mostCurrent._mcode._isonlinedatafactor /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 635;BA.debugLine="CreatePge";
Debug.ShouldStop(67108864);
_createpge();
 }else {
 BA.debugLineNum = 637;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 638;BA.debugLine="ToastMessageShow(\"خطا در دریافت اطلاعات\",True)";
Debug.ShouldStop(536870912);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در دریافت اطلاعات")),(Object)(act_rizfaktor.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 640;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadlistkalafaktor() throws Exception{
try {
		Debug.PushSubsStack("LoadListKalaFaktor (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,163);
if (RapidSub.canDelegate("loadlistkalafaktor")) { ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","loadlistkalafaktor"); return;}
ResumableSub_LoadListKalaFaktor rsub = new ResumableSub_LoadListKalaFaktor(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadListKalaFaktor extends BA.ResumableSub {
public ResumableSub_LoadListKalaFaktor(ir.parsikhesab.pakhsh.act_rizfaktor parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_rizfaktor parent;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _flddarsadarzeshafzode = RemoteObject.createImmutable(0);
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int step12;
int limit12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadListKalaFaktor (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,163);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 164;BA.debugLine="Sleep(200)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_rizfaktor.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizfaktor", "loadlistkalafaktor"),BA.numberCast(int.class, 200));
this.state = 65;
return;
case 65:
//C
this.state = 1;
;
 BA.debugLineNum = 165;BA.debugLine="Listkala.Clear";
Debug.ShouldStop(16);
parent.mostCurrent._listkala.runVoidMethod ("Clear");
 BA.debugLineNum = 167;BA.debugLine="If MCode.IsOnlineDataFactor=0 Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 59;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._isonlinedatafactor /*RemoteObject*/ ,BA.NumberToString(0))) { 
this.state = 3;
}else {
this.state = 58;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 168;BA.debugLine="lblShomareFactor.Text=MCode.FaktorSelect";
Debug.ShouldStop(128);
parent.mostCurrent._lblshomarefactor.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ));
 BA.debugLineNum = 169;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(256);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblFaktor Where FldShomareFaktor = '"),parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable("' and FldC_Tafzili="),parent._faktor.getField(true,"fldC_Ashkhas" /*RemoteObject*/ ))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 170;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 56;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 172;BA.debugLine="Faktor.fldDarsadArzeshAfzode=0";
Debug.ShouldStop(2048);
parent._faktor.setField ("fldDarsadArzeshAfzode" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 173;BA.debugLine="Faktor.fldArzeshAfzode=0";
Debug.ShouldStop(4096);
parent._faktor.setField ("fldArzeshAfzode" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 174;BA.debugLine="Faktor.FldTakhfifKala=0";
Debug.ShouldStop(8192);
parent._faktor.setField ("FldTakhfifKala" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 175;BA.debugLine="Faktor.FldTakhfifVizhe=0";
Debug.ShouldStop(16384);
parent._faktor.setField ("FldTakhfifVizhe" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 176;BA.debugLine="Faktor.fldSumMablaghBadAzTakhfif=0";
Debug.ShouldStop(32768);
parent._faktor.setField ("fldSumMablaghBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 178;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//for
this.state = 55;
step12 = 1;
limit12 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 66;
if (true) break;

case 66:
//C
this.state = 55;
if ((step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12)) this.state = 9;
if (true) break;

case 67:
//C
this.state = 66;
_i = ((int)(0 + _i + step12)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 179;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 10:
//try
this.state = 54;
this.catchState = 53;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 53;
 BA.debugLineNum = 180;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(524288);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 181;BA.debugLine="Dim Item As AdapterListKala";
Debug.ShouldStop(1048576);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 182;BA.debugLine="Item.CodeKala=Cu.Getstring(\"FldCodeKala\")";
Debug.ShouldStop(2097152);
_item.setField ("CodeKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))));
 BA.debugLineNum = 183;BA.debugLine="Item.NameKala=Cu.Getstring(\"FldNamekala\")";
Debug.ShouldStop(4194304);
_item.setField ("NameKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNamekala"))));
 BA.debugLineNum = 184;BA.debugLine="MCode.C_Tafzili=Cu.Getstring(\"FldC_Tafzili\")";
Debug.ShouldStop(8388608);
parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Tafzili")));
 BA.debugLineNum = 185;BA.debugLine="Item.FeeForoosh=Cu.Getstring(\"FldFeeForoosh\")";
Debug.ShouldStop(16777216);
_item.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFeeForoosh")))));
 BA.debugLineNum = 186;BA.debugLine="Item.FldFeeBadAzTakhfif=Cu.Getstring(\"fldFeeB";
Debug.ShouldStop(33554432);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 BA.debugLineNum = 187;BA.debugLine="Item.NameVahed=Cu.Getstring(\"FldNameVahed\")";
Debug.ShouldStop(67108864);
_item.setField ("NameVahed" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNameVahed"))));
 BA.debugLineNum = 188;BA.debugLine="Item.NameVahed2=Cu.Getstring(\"FldNameVahed2\")";
Debug.ShouldStop(134217728);
_item.setField ("NameVahed2" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNameVahed2"))));
 BA.debugLineNum = 189;BA.debugLine="Item.fldPathPic=Cu.Getstring(\"fldPathPic\")";
Debug.ShouldStop(268435456);
_item.setField ("fldPathPic" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))));
 BA.debugLineNum = 190;BA.debugLine="Item.TedadDarSabadJoz=Cu.Getstring(\"FldTedadD";
Debug.ShouldStop(536870912);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))));
 BA.debugLineNum = 191;BA.debugLine="Item.TedadDarSabadKol=Cu.Getstring(\"FldTedadD";
Debug.ShouldStop(1073741824);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))));
 BA.debugLineNum = 192;BA.debugLine="Item.TedadDarKarton=Cu.Getstring(\"FldTedadDar";
Debug.ShouldStop(-2147483648);
_item.setField ("TedadDarKarton" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarKarton"))));
 BA.debugLineNum = 193;BA.debugLine="Item.FldMablaghMasrafKonande=Cu.Getstring(\"Fl";
Debug.ShouldStop(1);
_item.setField ("FldMablaghMasrafKonande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghMasrafKonande"))));
 BA.debugLineNum = 194;BA.debugLine="Item.MablaghTakhfif=myCode.Is_Null_adad(Cu.Ge";
Debug.ShouldStop(2);
_item.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif")))))));
 BA.debugLineNum = 195;BA.debugLine="Item.fldDarsadTakhfif=myCode.Is_Null_adad(Cu.";
Debug.ShouldStop(4);
_item.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif"))))));
 BA.debugLineNum = 196;BA.debugLine="Item.fldArzeshAfzode=myCode.Is_Null_adad(Cu.G";
Debug.ShouldStop(8);
_item.setField ("fldArzeshAfzode" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldArzeshAfzode"))))));
 BA.debugLineNum = 197;BA.debugLine="Dim fldDarsadArzeshAfzode  As Int=myCode.Is_N";
Debug.ShouldStop(16);
_flddarsadarzeshafzode = BA.numberCast(int.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDarsadArzeshAfzode"))))));Debug.locals.put("fldDarsadArzeshAfzode", _flddarsadarzeshafzode);Debug.locals.put("fldDarsadArzeshAfzode", _flddarsadarzeshafzode);
 BA.debugLineNum = 198;BA.debugLine="Item.fldDarsadArzeshAfzode=fldDarsadArzeshAfz";
Debug.ShouldStop(32);
_item.setField ("fldDarsadArzeshAfzode" /*RemoteObject*/ ,BA.NumberToString(_flddarsadarzeshafzode));
 BA.debugLineNum = 199;BA.debugLine="Item.fldShomareForoosh=myCode.Is_Null_adad(Cu";
Debug.ShouldStop(64);
_item.setField ("fldShomareForoosh" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))))));
 BA.debugLineNum = 200;BA.debugLine="Item.Tozihat=myCode.Is_Null(Cu.Getstring(\"Fld";
Debug.ShouldStop(128);
_item.setField ("Tozihat" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTozihat"))))));
 BA.debugLineNum = 201;BA.debugLine="Log(myCode.Is_Null(Cu.Getstring(\"FldTozih\")))";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","568485158",parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTozih"))))),0);
 BA.debugLineNum = 202;BA.debugLine="Item.SumMande=myCode.Is_int(Cu.Getstring(\"Fld";
Debug.ShouldStop(512);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(parent.mostCurrent._mycode.runMethod(true,"_is_int" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSumMande")))))));
 BA.debugLineNum = 203;BA.debugLine="Faktor.fldDarsadArzeshAfzode=fldDarsadArzeshA";
Debug.ShouldStop(1024);
parent._faktor.setField ("fldDarsadArzeshAfzode" /*RemoteObject*/ ,BA.NumberToString(_flddarsadarzeshafzode));
 BA.debugLineNum = 204;BA.debugLine="Faktor.fldArzeshAfzode=myCode.Is_Null_adad(Fa";
Debug.ShouldStop(2048);
parent._faktor.setField ("fldArzeshAfzode" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(parent._faktor.getField(true,"fldArzeshAfzode" /*RemoteObject*/ )))),BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldArzeshAfzode"))))))}, "+",1, 0)));
 BA.debugLineNum = 206;BA.debugLine="Faktor.fldSumMablaghBadAzTakhfif=Faktor.fldSu";
Debug.ShouldStop(8192);
parent._faktor.setField ("fldSumMablaghBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent._faktor.getField(true,"fldSumMablaghBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))}, "+",1, 0)));
 BA.debugLineNum = 208;BA.debugLine="lblArzeshAfzode.Text=myCode.AdadToPrice(Fakto";
Debug.ShouldStop(32768);
parent.mostCurrent._lblarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(parent._faktor.getField(true,"fldArzeshAfzode" /*RemoteObject*/ )))));
 BA.debugLineNum = 210;BA.debugLine="Faktor.Signature=myCode.Is_Null(Cu.Getstring(";
Debug.ShouldStop(131072);
parent._faktor.setField ("Signature" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSignatureBitmapString"))))));
 BA.debugLineNum = 211;BA.debugLine="Faktor.fldTozihFaktor=myCode.Is_Null(Cu.Getst";
Debug.ShouldStop(262144);
parent._faktor.setField ("fldTozihFaktor" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTozih"))))));
 BA.debugLineNum = 212;BA.debugLine="Faktor.fldC_Tasvie = Cu.Getstring(\"FldVaziatP";
Debug.ShouldStop(524288);
parent._faktor.setField ("fldC_Tasvie" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVaziatPardakht"))));
 BA.debugLineNum = 213;BA.debugLine="Faktor.fldTotalFaktor = myCode.Is_Null_adad(C";
Debug.ShouldStop(1048576);
parent._faktor.setField ("fldTotalFaktor" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))))));
 BA.debugLineNum = 214;BA.debugLine="Faktor.FldTakhfifKala =Faktor.FldTakhfifKala+";
Debug.ShouldStop(2097152);
parent._faktor.setField ("FldTakhfifKala" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent._faktor.getField(true,"FldTakhfifKala" /*RemoteObject*/ )),BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSumMablaghTakhfifKala"))))))}, "+",1, 0)));
 BA.debugLineNum = 215;BA.debugLine="Faktor.FldTakhfifVizhe =Faktor.FldTakhfifVizh";
Debug.ShouldStop(4194304);
parent._faktor.setField ("FldTakhfifVizhe" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent._faktor.getField(true,"FldTakhfifVizhe" /*RemoteObject*/ )),BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSumMablaghTakhfifVizhe"))))))}, "+",1, 0)));
 BA.debugLineNum = 216;BA.debugLine="Faktor.fldMablaghKol = myCode.Is_Null_adad(Cu";
Debug.ShouldStop(8388608);
parent._faktor.setField ("fldMablaghKol" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghKol"))))));
 BA.debugLineNum = 217;BA.debugLine="Faktor.fldC_Ashkhas = Cu.Getstring(\"FldC_Tafz";
Debug.ShouldStop(16777216);
parent._faktor.setField ("fldC_Ashkhas" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Tafzili"))));
 BA.debugLineNum = 218;BA.debugLine="lblShomareForoosh.Text=Item.fldShomareForoosh";
Debug.ShouldStop(33554432);
parent.mostCurrent._lblshomareforoosh.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"fldShomareForoosh" /*RemoteObject*/ )));
 BA.debugLineNum = 219;BA.debugLine="isMarjoei = Cu.Getstring(\"WIsBacked\")";
Debug.ShouldStop(67108864);
parent.mostCurrent._ismarjoei = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("WIsBacked")));
 BA.debugLineNum = 220;BA.debugLine="If isMarjoei=\"True\" Then";
Debug.ShouldStop(134217728);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._ismarjoei,BA.ObjectToString("True"))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 221;BA.debugLine="lblType.Text=\"فاکتور مرجوعی\"";
Debug.ShouldStop(268435456);
parent.mostCurrent._lbltype.runMethod(true,"setText",BA.ObjectToCharSequence("فاکتور مرجوعی"));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 224;BA.debugLine="lblType.Text=\"فاکتور فروش\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbltype.runMethod(true,"setText",BA.ObjectToCharSequence("فاکتور فروش"));
 if (true) break;
;
 BA.debugLineNum = 226;BA.debugLine="If Cu.Getstring(\"FldSync\")=\"True\" Then";
Debug.ShouldStop(2);

case 18:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSync"))),BA.ObjectToString("True"))) { 
this.state = 20;
}else {
this.state = 30;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 227;BA.debugLine="Faktor.synced=True";
Debug.ShouldStop(4);
parent._faktor.setField ("synced" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 228;BA.debugLine="lblVaziat.Text=\"سفارش ارسال شده\"";
Debug.ShouldStop(8);
parent.mostCurrent._lblvaziat.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش ارسال شده"));
 BA.debugLineNum = 229;BA.debugLine="If lblShomareForoosh.Text>0   Then";
Debug.ShouldStop(16);
if (true) break;

case 21:
//if
this.state = 28;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, parent.mostCurrent._lblshomareforoosh.runMethod(true,"getText")),BA.numberCast(double.class, 0))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 230;BA.debugLine="lblVaziat.Text=\"سفارش تکمیل شده\"";
Debug.ShouldStop(32);
parent.mostCurrent._lblvaziat.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش تکمیل شده"));
 BA.debugLineNum = 231;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"Select * fr";
Debug.ShouldStop(64);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * from TblFaktor where fldShomareForoosh="),_item.getField(true,"fldShomareForoosh" /*RemoteObject*/ ),RemoteObject.createImmutable(" and WIsBacked='True'"))));Debug.locals.put("cu1", _cu1);Debug.locals.put("cu1", _cu1);
 BA.debugLineNum = 232;BA.debugLine="If cu1.RowCount>0 And Cu.Getstring(\"FldType";
Debug.ShouldStop(128);
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),BA.ObjectToString("Marjoee"))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 233;BA.debugLine="lblVaziat.Text=\"سفارش مرجوع شده\"";
Debug.ShouldStop(256);
parent.mostCurrent._lblvaziat.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش مرجوع شده"));
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 31;
;
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 237;BA.debugLine="Faktor.synced=False";
Debug.ShouldStop(4096);
parent._faktor.setField ("synced" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 238;BA.debugLine="lblVaziat.Text=\"سفارش ارسال نشده\"";
Debug.ShouldStop(8192);
parent.mostCurrent._lblvaziat.runMethod(true,"setText",BA.ObjectToCharSequence("سفارش ارسال نشده"));
 if (true) break;
;
 BA.debugLineNum = 242;BA.debugLine="If myCode.Is_Null_adad(Cu.Getstring(\"FldAmani";
Debug.ShouldStop(131072);

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAmani"))))),BA.NumberToString(0))) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
 BA.debugLineNum = 243;BA.debugLine="lblCheckAmani.Text=Chr(0xE835)";
Debug.ShouldStop(262144);
parent.mostCurrent._lblcheckamani.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe835))))));
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 246;BA.debugLine="lblCheckAmani.Text=Chr(0xE834)";
Debug.ShouldStop(2097152);
parent.mostCurrent._lblcheckamani.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe834))))));
 if (true) break;
;
 BA.debugLineNum = 250;BA.debugLine="If Cu.Getstring(\"FldAmani\") =Null Then";
Debug.ShouldStop(33554432);

case 36:
//if
this.state = 39;
if (RemoteObject.solveBoolean("n",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAmani"))))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 251;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set FldAm";
Debug.ShouldStop(67108864);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblFaktor Set FldAmani='0' Where FldShomareFaktor = '"),parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 if (true) break;
;
 BA.debugLineNum = 253;BA.debugLine="If Cu.Getstring(\"fldShomareForoosh\") =Null Th";
Debug.ShouldStop(268435456);

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean("n",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 254;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set fldSh";
Debug.ShouldStop(536870912);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblFaktor Set fldShomareForoosh='0' Where FldShomareFaktor = '"),parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 if (true) break;
;
 BA.debugLineNum = 256;BA.debugLine="If Cu.Getstring(\"FldDarsadTakhfif\") =Null The";
Debug.ShouldStop(-2147483648);

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean("n",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif"))))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 257;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set FldDa";
Debug.ShouldStop(1);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblFaktor Set FldDarsadTakhfif='0' Where FldShomareFaktor = '"),parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 264;BA.debugLine="Listkala.Add(Item)";
Debug.ShouldStop(128);
parent.mostCurrent._listkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 265;BA.debugLine="If MCode.SendMarjoie=1 And Item.fldShomareFor";
Debug.ShouldStop(256);
if (true) break;

case 46:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._sendmarjoie /*RemoteObject*/ ,BA.NumberToString(1)) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldShomareForoosh" /*RemoteObject*/ )),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),BA.ObjectToString("Marjoee"))) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 51;
 BA.debugLineNum = 266;BA.debugLine="btnMarjooii.Enabled=True";
Debug.ShouldStop(512);
parent.mostCurrent._btnmarjooii.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 268;BA.debugLine="btnMarjooii.Enabled=False";
Debug.ShouldStop(2048);
parent.mostCurrent._btnmarjooii.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 51:
//C
this.state = 54;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 53:
//C
this.state = 54;
this.catchState = 0;
 BA.debugLineNum = 272;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","568485229",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_rizfaktor.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 54:
//C
this.state = 67;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
Debug.locals.put("i", _i);
;
 if (true) break;

case 56:
//C
this.state = 59;
;
 if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 277;BA.debugLine="Listkala.Clear";
Debug.ShouldStop(1048576);
parent.mostCurrent._listkala.runVoidMethod ("Clear");
 BA.debugLineNum = 278;BA.debugLine="Log(\"load faktor online\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","568485235",RemoteObject.createImmutable("load faktor online"),0);
 BA.debugLineNum = 279;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_rizfaktor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال دریافت اطلاعات . . .")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 280;BA.debugLine="MCode.C_Tafzili=Faktor.fldC_Ashkhas";
Debug.ShouldStop(8388608);
parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = parent._faktor.getField(true,"fldC_Ashkhas" /*RemoteObject*/ );
 BA.debugLineNum = 281;BA.debugLine="CallSubDelayed2(Service_Server,\"GetReportRizePis";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_rizfaktor.processBA,(Object)((parent.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("GetReportRizePishFactor")),(Object)((parent._faktor.getField(true,"fldShomareFaktor" /*RemoteObject*/ ))));
 BA.debugLineNum = 282;BA.debugLine="lblShomareFactor.Text=Faktor.fldShomareFaktor";
Debug.ShouldStop(33554432);
parent.mostCurrent._lblshomarefactor.runMethod(true,"setText",BA.ObjectToCharSequence(parent._faktor.getField(true,"fldShomareFaktor" /*RemoteObject*/ )));
 BA.debugLineNum = 283;BA.debugLine="ProgressDialogShow2(\"لطفا صبر کنید . . .\",False)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_rizfaktor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("لطفا صبر کنید . . .")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;
;
 BA.debugLineNum = 287;BA.debugLine="If Faktor.synced = False Then";
Debug.ShouldStop(1073741824);

case 59:
//if
this.state = 64;
if (RemoteObject.solveBoolean("=",parent._faktor.getField(true,"synced" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 61;
}else {
this.state = 63;
}if (true) break;

case 61:
//C
this.state = 64;
 BA.debugLineNum = 288;BA.debugLine="Btn_SendFactor.Enabled=True";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._btn_sendfactor.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 289;BA.debugLine="Btn_del.Enabled=True";
Debug.ShouldStop(1);
parent.mostCurrent._btn_del.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 290;BA.debugLine="Btn_Edit.Enabled=True";
Debug.ShouldStop(2);
parent.mostCurrent._btn_edit.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 293;BA.debugLine="Btn_del.Enabled=False";
Debug.ShouldStop(16);
parent.mostCurrent._btn_del.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 294;BA.debugLine="Btn_Edit.Enabled=False";
Debug.ShouldStop(32);
parent.mostCurrent._btn_edit.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 64:
//C
this.state = -1;
;
 BA.debugLineNum = 297;BA.debugLine="CreatePge";
Debug.ShouldStop(256);
_createpge();
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_rizfaktor.processBA, e0.toString());}
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
public static RemoteObject  _pnltozihat_click() throws Exception{
try {
		Debug.PushSubsStack("PnlTozihat_Click (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,322);
if (RapidSub.canDelegate("pnltozihat_click")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","pnltozihat_click");}
 BA.debugLineNum = 322;BA.debugLine="Sub PnlTozihat_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 324;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Dim Faktor As AdapterListFaktor";
act_rizfaktor._faktor = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");
 //BA.debugLineNum = 8;BA.debugLine="Dim th As Thread";
act_rizfaktor._th = RemoteObject.createNew ("anywheresoftware.b4a.agraham.threading.Threading");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _readblob(RemoteObject _cu) throws Exception{
try {
		Debug.PushSubsStack("ReadBlob (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,525);
if (RapidSub.canDelegate("readblob")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","readblob", _cu);}
RemoteObject _buffer = null;
RemoteObject _inputstream1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bitmap1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 525;BA.debugLine="Sub ReadBlob(Cu As Cursor) As Bitmap";
Debug.ShouldStop(4096);
 BA.debugLineNum = 526;BA.debugLine="Cu.Position = 0";
Debug.ShouldStop(8192);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 527;BA.debugLine="Dim Buffer() As Byte 'declare an empty byte array";
Debug.ShouldStop(16384);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 529;BA.debugLine="Buffer=MCode.Su.DecodeBase64(Cu.Getstring(\"FldSig";
Debug.ShouldStop(65536);
_buffer = act_rizfaktor.mostCurrent._mcode._su /*RemoteObject*/ .runMethod(false,"DecodeBase64",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSignatureBitmapString")))));Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 531;BA.debugLine="Dim InputStream1 As InputStream";
Debug.ShouldStop(262144);
_inputstream1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("InputStream1", _inputstream1);
 BA.debugLineNum = 532;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer, 0,";
Debug.ShouldStop(524288);
_inputstream1.runVoidMethod ("InitializeFromBytesArray",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")));
 BA.debugLineNum = 539;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 540;BA.debugLine="Dim Bitmap1 As Bitmap";
Debug.ShouldStop(134217728);
_bitmap1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("Bitmap1", _bitmap1);
 BA.debugLineNum = 541;BA.debugLine="Bitmap1.Initialize2(InputStream1)";
Debug.ShouldStop(268435456);
_bitmap1.runVoidMethod ("Initialize2",(Object)((_inputstream1.getObject())));
 BA.debugLineNum = 542;BA.debugLine="InputStream1.Close";
Debug.ShouldStop(536870912);
_inputstream1.runVoidMethod ("Close");
 BA.debugLineNum = 543;BA.debugLine="Return Bitmap1";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return _bitmap1;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizfaktor.processBA, e12.toString()); BA.debugLineNum = 545;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("LogImpl","569271572",BA.ObjectToString(act_rizfaktor.mostCurrent.__c.runMethod(false,"LastException",act_rizfaktor.mostCurrent.activityBA)),0);
 BA.debugLineNum = 546;BA.debugLine="Return Null";
Debug.ShouldStop(2);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), act_rizfaktor.mostCurrent.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 549;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savelastvisit() throws Exception{
try {
		Debug.PushSubsStack("SaveLastVisit (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,491);
if (RapidSub.canDelegate("savelastvisit")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","savelastvisit");}
RemoteObject _datemiladi = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _d = RemoteObject.createImmutable("");
 BA.debugLineNum = 491;BA.debugLine="Sub SaveLastVisit";
Debug.ShouldStop(1024);
 BA.debugLineNum = 493;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(4096);
act_rizfaktor.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 494;BA.debugLine="Dim DateMiladi As String = MCode.ConvertNumbersPe";
Debug.ShouldStop(8192);
_datemiladi = act_rizfaktor.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(act_rizfaktor.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(act_rizfaktor.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("DateMiladi", _datemiladi);Debug.locals.put("DateMiladi", _datemiladi);
 BA.debugLineNum = 495;BA.debugLine="Dim Time As String = MCode.ConvertNumbersPersian2";
Debug.ShouldStop(16384);
_time = act_rizfaktor.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(act_rizfaktor.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_rizfaktor.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 496;BA.debugLine="Dim D As String = DateMiladi & \"T\" & Time";
Debug.ShouldStop(32768);
_d = RemoteObject.concat(_datemiladi,RemoteObject.createImmutable("T"),_time);Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 497;BA.debugLine="LogColor(\"D: \" & D,Colors.Red)";
Debug.ShouldStop(65536);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("LogImpl","569140486",RemoteObject.concat(RemoteObject.createImmutable("D: "),_d),act_rizfaktor.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 499;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set lastOrder";
Debug.ShouldStop(262144);
act_rizfaktor.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set lastOrderDate = '"),_d,RemoteObject.createImmutable("' Where fldCodetafzili = '"),act_rizfaktor.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _takhfifkala() throws Exception{
try {
		Debug.PushSubsStack("TakhfifKala (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,572);
if (RapidSub.canDelegate("takhfifkala")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","takhfifkala");}
RemoteObject _takhfif = RemoteObject.createImmutable("");
RemoteObject _cu2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 572;BA.debugLine="Sub TakhfifKala As Long";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 573;BA.debugLine="Dim Takhfif As String";
Debug.ShouldStop(268435456);
_takhfif = RemoteObject.createImmutable("");Debug.locals.put("Takhfif", _takhfif);
 BA.debugLineNum = 574;BA.debugLine="Dim Cu2 As Cursor= MCode.Result(\"SELECT Sum((FldF";
Debug.ShouldStop(536870912);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = act_rizfaktor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizfaktor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT Sum((FldFee - FldFeeBadAzTakhfif) * ((FldTedadKol*FldTedadKarton) + FldTedadJoz)) as SumTakhfif FROM TblFaktor Where FldShomareFaktor = '"),act_rizfaktor.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable("' And Cast(FldFeeBadAzTakhfif AS Int) > 0 "))));Debug.locals.put("Cu2", _cu2);Debug.locals.put("Cu2", _cu2);
 BA.debugLineNum = 575;BA.debugLine="Cu2.Position = 0";
Debug.ShouldStop(1073741824);
_cu2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 576;BA.debugLine="If Cu2.GetString(\"SumTakhfif\") <> Null Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("N",_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumTakhfif"))))) { 
 BA.debugLineNum = 577;BA.debugLine="Takhfif = Cu2.GetString(\"SumTakhfif\")";
Debug.ShouldStop(1);
_takhfif = _cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumTakhfif")));Debug.locals.put("Takhfif", _takhfif);
 }else {
 BA.debugLineNum = 579;BA.debugLine="Takhfif = 0";
Debug.ShouldStop(4);
_takhfif = BA.NumberToString(0);Debug.locals.put("Takhfif", _takhfif);
 };
 BA.debugLineNum = 581;BA.debugLine="Log(\"تخفیف کالا : \" & Takhfif)";
Debug.ShouldStop(16);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("LogImpl","569468169",RemoteObject.concat(RemoteObject.createImmutable("تخفیف کالا : "),_takhfif),0);
 BA.debugLineNum = 582;BA.debugLine="Return Takhfif";
Debug.ShouldStop(32);
if (true) return BA.numberCast(long.class, _takhfif);
 BA.debugLineNum = 583;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _takhfifriali(RemoteObject _mablaghkhamfaktor) throws Exception{
try {
		Debug.PushSubsStack("TakhfifRiali (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,551);
if (RapidSub.canDelegate("takhfifriali")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","takhfifriali", _mablaghkhamfaktor);}
RemoteObject _takhfif = RemoteObject.createImmutable(0L);
Debug.locals.put("MablaghKhamFaktor", _mablaghkhamfaktor);
 BA.debugLineNum = 551;BA.debugLine="Sub TakhfifRiali(MablaghKhamFaktor As Long) As Lon";
Debug.ShouldStop(64);
 BA.debugLineNum = 552;BA.debugLine="Dim Takhfif As Long";
Debug.ShouldStop(128);
_takhfif = RemoteObject.createImmutable(0L);Debug.locals.put("Takhfif", _takhfif);
 BA.debugLineNum = 553;BA.debugLine="If MCode.KharidBiashAz > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_rizfaktor.mostCurrent._mcode._kharidbiashaz /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 554;BA.debugLine="If MablaghKhamFaktor >= MCode.KharidBiashAz Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("g",_mablaghkhamfaktor,BA.numberCast(long.class, act_rizfaktor.mostCurrent._mcode._kharidbiashaz /*RemoteObject*/ ))) { 
 BA.debugLineNum = 556;BA.debugLine="Log(\"تخفیف ریالی : \" & Takhfif)";
Debug.ShouldStop(2048);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("LogImpl","569337093",RemoteObject.concat(RemoteObject.createImmutable("تخفیف ریالی : "),_takhfif),0);
 BA.debugLineNum = 557;BA.debugLine="Return Takhfif";
Debug.ShouldStop(4096);
if (true) return _takhfif;
 }else {
 BA.debugLineNum = 559;BA.debugLine="Return 0";
Debug.ShouldStop(16384);
if (true) return BA.numberCast(long.class, 0);
 };
 }else {
 BA.debugLineNum = 562;BA.debugLine="Return 0";
Debug.ShouldStop(131072);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 564;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _takhfifvizhe(RemoteObject _mablaghkhamfaktor) throws Exception{
try {
		Debug.PushSubsStack("TakhfifVizhe (act_rizfaktor) ","act_rizfaktor",38,act_rizfaktor.mostCurrent.activityBA,act_rizfaktor.mostCurrent,566);
if (RapidSub.canDelegate("takhfifvizhe")) { return ir.parsikhesab.pakhsh.act_rizfaktor.remoteMe.runUserSub(false, "act_rizfaktor","takhfifvizhe", _mablaghkhamfaktor);}
RemoteObject _takhfif = RemoteObject.createImmutable(0L);
Debug.locals.put("MablaghKhamFaktor", _mablaghkhamfaktor);
 BA.debugLineNum = 566;BA.debugLine="Sub TakhfifVizhe(MablaghKhamFaktor As Long) As Lon";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 567;BA.debugLine="Dim Takhfif As Long = (MCode.DarsadTakhfifVizhe/1";
Debug.ShouldStop(4194304);
_takhfif = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {act_rizfaktor.mostCurrent._mcode._darsadtakhfifvizhe /*RemoteObject*/ ,RemoteObject.createImmutable(100)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {_mablaghkhamfaktor,_takhfifkala(),_takhfifriali(_mablaghkhamfaktor)}, "--",2, 2))}, "*",0, 0));Debug.locals.put("Takhfif", _takhfif);Debug.locals.put("Takhfif", _takhfif);
 BA.debugLineNum = 568;BA.debugLine="Log(\"تخفیف ویژه : \" & Takhfif)";
Debug.ShouldStop(8388608);
act_rizfaktor.mostCurrent.__c.runVoidMethod ("LogImpl","569402626",RemoteObject.concat(RemoteObject.createImmutable("تخفیف ویژه : "),_takhfif),0);
 BA.debugLineNum = 569;BA.debugLine="Return Takhfif";
Debug.ShouldStop(16777216);
if (true) return _takhfif;
 BA.debugLineNum = 570;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}