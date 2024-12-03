package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_selfaktor_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_selfaktor) ","act_selfaktor",46,act_selfaktor.mostCurrent.activityBA,act_selfaktor.mostCurrent,16);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_selfaktor.remoteMe.runUserSub(false, "act_selfaktor","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 16;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Activity.LoadLayout(\"L_SelFactor\")";
Debug.ShouldStop(65536);
act_selfaktor.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_SelFactor")),act_selfaktor.mostCurrent.activityBA);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_KeyPress (act_selfaktor) ","act_selfaktor",46,act_selfaktor.mostCurrent.activityBA,act_selfaktor.mostCurrent,40);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_selfaktor.remoteMe.runUserSub(false, "act_selfaktor","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_selfaktor.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 42;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
act_selfaktor.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 44;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return act_selfaktor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Pause (act_selfaktor) ","act_selfaktor",46,act_selfaktor.mostCurrent.activityBA,act_selfaktor.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_selfaktor.remoteMe.runUserSub(false, "act_selfaktor","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Resume (act_selfaktor) ","act_selfaktor",46,act_selfaktor.mostCurrent.activityBA,act_selfaktor.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_selfaktor.remoteMe.runUserSub(false, "act_selfaktor","activity_resume");}
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="LoadListFaktor";
Debug.ShouldStop(1);
_loadlistfaktor();
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
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_selfaktor) ","act_selfaktor",46,act_selfaktor.mostCurrent.activityBA,act_selfaktor.mostCurrent,70);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_selfaktor.remoteMe.runUserSub(false, "act_selfaktor","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 70;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return act_selfaktor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btn_Back_Click (act_selfaktor) ","act_selfaktor",46,act_selfaktor.mostCurrent.activityBA,act_selfaktor.mostCurrent,66);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_selfaktor.remoteMe.runUserSub(false, "act_selfaktor","btn_back_click");}
 BA.debugLineNum = 66;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
act_selfaktor.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnsabtsefaresh_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSabtSefaresh_Click (act_selfaktor) ","act_selfaktor",46,act_selfaktor.mostCurrent.activityBA,act_selfaktor.mostCurrent,47);
if (RapidSub.canDelegate("btnsabtsefaresh_click")) { ir.parsikhesab.pakhsh.act_selfaktor.remoteMe.runUserSub(false, "act_selfaktor","btnsabtsefaresh_click"); return;}
ResumableSub_BtnSabtSefaresh_Click rsub = new ResumableSub_BtnSabtSefaresh_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnSabtSefaresh_Click extends BA.ResumableSub {
public ResumableSub_BtnSabtSefaresh_Click(ir.parsikhesab.pakhsh.act_selfaktor parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_selfaktor parent;
RemoteObject _sel = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recfakor");
int step2;
int limit2;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnSabtSefaresh_Click (act_selfaktor) ","act_selfaktor",46,act_selfaktor.mostCurrent.activityBA,act_selfaktor.mostCurrent,47);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 48;BA.debugLine="Dim sel As Int=0";
Debug.ShouldStop(32768);
_sel = BA.numberCast(int.class, 0);Debug.locals.put("sel", _sel);Debug.locals.put("sel", _sel);
 BA.debugLineNum = 49;BA.debugLine="For i=0 To CLV1.Size-1";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//for
this.state = 12;
step2 = 1;
limit2 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._clv1.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 12;
if ((step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2)) this.state = 3;
if (true) break;

case 14:
//C
this.state = 13;
_i = ((int)(0 + _i + step2)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 50;BA.debugLine="Dim rec As cls_RecFakor=CLV1.GetValue(i)";
Debug.ShouldStop(131072);
_rec = (parent.mostCurrent._clv1.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 51;BA.debugLine="If rec.IsChecked Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 11;
if (_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recfakor.class, "_getischecked" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 52;BA.debugLine="ProgressDialogShow2(\"در حال ارسال موارد انتخابی";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_selfaktor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال ارسال موارد انتخابی . . .")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 53;BA.debugLine="sel= rec.Faktor_number";
Debug.ShouldStop(1048576);
_sel = BA.numberCast(int.class, _rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recfakor.class, "_getfaktor_number" /*RemoteObject*/ ));Debug.locals.put("sel", _sel);
 BA.debugLineNum = 54;BA.debugLine="MCode.C_Tafzili=rec.getCode_Tafzili";
Debug.ShouldStop(2097152);
parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = _rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recfakor.class, "_getcode_tafzili" /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="If sel>0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_sel,BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 57;BA.debugLine="CallSubDelayed2(Service_Server,\"LoadSend\",sel)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_selfaktor.processBA,(Object)((parent.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("LoadSend")),(Object)((_sel)));
 BA.debugLineNum = 58;BA.debugLine="Sleep(2000)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_selfaktor.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_selfaktor", "btnsabtsefaresh_click"),BA.numberCast(int.class, 2000));
this.state = 15;
return;
case 15:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 62;BA.debugLine="Sleep(200)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_selfaktor.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_selfaktor", "btnsabtsefaresh_click"),BA.numberCast(int.class, 200));
this.state = 16;
return;
case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 63;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private BtnSabtSefaresh As Button";
act_selfaktor.mostCurrent._btnsabtsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private CLV1 As CustomListView";
act_selfaktor.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loadlistfaktor() throws Exception{
try {
		Debug.PushSubsStack("LoadListFaktor (act_selfaktor) ","act_selfaktor",46,act_selfaktor.mostCurrent.activityBA,act_selfaktor.mostCurrent,20);
if (RapidSub.canDelegate("loadlistfaktor")) { return ir.parsikhesab.pakhsh.act_selfaktor.remoteMe.runUserSub(false, "act_selfaktor","loadlistfaktor");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recfakor");
 BA.debugLineNum = 20;BA.debugLine="Sub LoadListFaktor";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(1048576);
act_selfaktor.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 22;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(2097152);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_selfaktor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selfaktor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblFaktor where FldSync = 'False' Group by FldShomareFaktor")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 23;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(4194304);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 24;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(8388608);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 25;BA.debugLine="Dim rec As cls_RecFakor";
Debug.ShouldStop(16777216);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recfakor");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 26;BA.debugLine="rec.Initialize(Cu.GetString(\"FldShomareFaktor\"))";
Debug.ShouldStop(33554432);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recfakor.class, "_initialize" /*RemoteObject*/ ,act_selfaktor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor")))));
 BA.debugLineNum = 27;BA.debugLine="CLV1.Add(rec.Panel,rec)";
Debug.ShouldStop(67108864);
act_selfaktor.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recfakor.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)((_rec)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}