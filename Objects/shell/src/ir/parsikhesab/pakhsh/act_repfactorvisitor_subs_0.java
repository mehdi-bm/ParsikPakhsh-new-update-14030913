package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_repfactorvisitor_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"l_repfactorvisitor\")";
Debug.ShouldStop(1073741824);
act_repfactorvisitor.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_repfactorvisitor")),act_repfactorvisitor.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="LstReport.Initialize";
Debug.ShouldStop(-2147483648);
act_repfactorvisitor.mostCurrent._lstreport.runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="Base = Activity";
Debug.ShouldStop(1);
act_repfactorvisitor.mostCurrent._base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_repfactorvisitor.mostCurrent._activity.getObject());
 BA.debugLineNum = 34;BA.debugLine="Dialog.Initialize (Panel1)";
Debug.ShouldStop(2);
act_repfactorvisitor.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_repfactorvisitor.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_repfactorvisitor.mostCurrent._panel1.getObject()));
 BA.debugLineNum = 35;BA.debugLine="Dialog.Title = \"جستجو\"";
Debug.ShouldStop(4);
act_repfactorvisitor.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("جستجو")));
 BA.debugLineNum = 36;BA.debugLine="SearchTemplate.Initialize";
Debug.ShouldStop(8);
act_repfactorvisitor.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,act_repfactorvisitor.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="MCode.page=\"Act_RepFactorVisitor\"";
Debug.ShouldStop(16);
act_repfactorvisitor.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_RepFactorVisitor");
 BA.debugLineNum = 38;BA.debugLine="MCode.NoeGet=\"GetVisitor\"";
Debug.ShouldStop(32);
act_repfactorvisitor.mostCurrent._mcode._noeget /*RemoteObject*/  = BA.ObjectToString("GetVisitor");
 BA.debugLineNum = 39;BA.debugLine="StartService(Service_Server)";
Debug.ShouldStop(64);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("StartService",act_repfactorvisitor.processBA,(Object)((act_repfactorvisitor.mostCurrent._service_server.getObject())));
 BA.debugLineNum = 40;BA.debugLine="MCode.CodeVisitorSelect=0";
Debug.ShouldStop(128);
act_repfactorvisitor.mostCurrent._mcode._codevisitorselect /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_KeyPress (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,107);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 107;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_repfactorvisitor.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 109;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
act_repfactorvisitor.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 111;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) return act_repfactorvisitor.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 113;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) return act_repfactorvisitor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Pause (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,103);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 103;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,99);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","activity_resume");}
 BA.debugLineNum = 99;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="BtnReport_Click";
Debug.ShouldStop(8);
_btnreport_click();
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animatedialog(RemoteObject _dlg,RemoteObject _fromedge) throws Exception{
try {
		Debug.PushSubsStack("AnimateDialog (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,283);
if (RapidSub.canDelegate("animatedialog")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","animatedialog", _dlg, _fromedge);}
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
Debug.locals.put("dlg", _dlg);
Debug.locals.put("FromEdge", _fromedge);
 BA.debugLineNum = 283;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="Dim Base As B4XView = dlg.Base";
Debug.ShouldStop(134217728);
act_repfactorvisitor.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
act_repfactorvisitor.mostCurrent._base = _dlg.getField(false,"_base" /*RemoteObject*/ );
 BA.debugLineNum = 285;BA.debugLine="Dim top As Int = Base.Top";
Debug.ShouldStop(268435456);
_top = act_repfactorvisitor.mostCurrent._base.runMethod(true,"getTop");Debug.locals.put("top", _top);Debug.locals.put("top", _top);
 BA.debugLineNum = 286;BA.debugLine="Dim left As Int = Base.Left";
Debug.ShouldStop(536870912);
_left = act_repfactorvisitor.mostCurrent._base.runMethod(true,"getLeft");Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 287;BA.debugLine="Select FromEdge.ToLowerCase";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(_fromedge.runMethod(true,"toLowerCase"),BA.ObjectToString("bottom"),BA.ObjectToString("top"),BA.ObjectToString("left"),BA.ObjectToString("right"))) {
case 0: {
 BA.debugLineNum = 289;BA.debugLine="Base.Top = Base.Parent.Height";
Debug.ShouldStop(1);
act_repfactorvisitor.mostCurrent._base.runMethod(true,"setTop",act_repfactorvisitor.mostCurrent._base.runMethod(false,"getParent").runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 291;BA.debugLine="Base.Top = -Base.Height";
Debug.ShouldStop(4);
act_repfactorvisitor.mostCurrent._base.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + act_repfactorvisitor.mostCurrent._base.runMethod(true,"getHeight").<Integer>get().intValue())));
 break; }
case 2: {
 BA.debugLineNum = 293;BA.debugLine="Base.Left = -Base.Width";
Debug.ShouldStop(16);
act_repfactorvisitor.mostCurrent._base.runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + act_repfactorvisitor.mostCurrent._base.runMethod(true,"getWidth").<Integer>get().intValue())));
 break; }
case 3: {
 BA.debugLineNum = 295;BA.debugLine="Base.Left = Base.Parent.Width";
Debug.ShouldStop(64);
act_repfactorvisitor.mostCurrent._base.runMethod(true,"setLeft",act_repfactorvisitor.mostCurrent._base.runMethod(false,"getParent").runMethod(true,"getWidth"));
 break; }
}
;
 BA.debugLineNum = 297;BA.debugLine="Base.SetLayoutAnimated(300, left, top, Base.Width";
Debug.ShouldStop(256);
act_repfactorvisitor.mostCurrent._base.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(_left),(Object)(_top),(Object)(act_repfactorvisitor.mostCurrent._base.runMethod(true,"getWidth")),(Object)(act_repfactorvisitor.mostCurrent._base.runMethod(true,"getHeight")));
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Application_Error (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,303);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 303;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(16384);
 BA.debugLineNum = 305;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) return act_repfactorvisitor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_selvisitor_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_SelVisitor_Click (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,259);
if (RapidSub.canDelegate("btn_selvisitor_click")) { ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","btn_selvisitor_click"); return;}
ResumableSub_Btn_SelVisitor_Click rsub = new ResumableSub_Btn_SelVisitor_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_SelVisitor_Click extends BA.ResumableSub {
public ResumableSub_Btn_SelVisitor_Click(ir.parsikhesab.pakhsh.act_repfactorvisitor parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_repfactorvisitor parent;
RemoteObject _rs = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_SelVisitor_Click (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,259);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 262;BA.debugLine="Panel1.BringToFront";
Debug.ShouldStop(32);
parent.mostCurrent._panel1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 263;BA.debugLine="Panel1.Visible=True";
Debug.ShouldStop(64);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 264;BA.debugLine="SearchTemplate.SearchField.HintText=\"نام ویزیتور\"";
Debug.ShouldStop(128);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString("نام ویزیتور"));
 BA.debugLineNum = 265;BA.debugLine="SearchTemplate.SearchField.lblClear.Text=\"\"";
Debug.ShouldStop(256);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 266;BA.debugLine="SearchTemplate.SearchField.lblV.Text=\"\"";
Debug.ShouldStop(512);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 267;BA.debugLine="SearchTemplate.SearchField.Update";
Debug.ShouldStop(1024);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 268;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
Debug.ShouldStop(2048);
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._searchtemplate)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("انصراف"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 269;BA.debugLine="AnimateDialog(Dialog, \"right\")";
Debug.ShouldStop(4096);
_animatedialog(parent.mostCurrent._dialog,RemoteObject.createImmutable("right"));
 BA.debugLineNum = 270;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_repfactorvisitor.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_repfactorvisitor", "btn_selvisitor_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 271;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 272;BA.debugLine="Btn_SelVisitor.Text = SearchTemplate.SelectedIte";
Debug.ShouldStop(32768);
parent.mostCurrent._btn_selvisitor.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate.getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 273;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(65536);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_repfactorvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblVisitor where FldN_Visitor='"),parent.mostCurrent._btn_selvisitor.runMethod(true,"getText"),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 274;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(131072);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 275;BA.debugLine="MCode.CodeVisitorSelect =  Cu.GetString(\"FldC_Vi";
Debug.ShouldStop(262144);
parent.mostCurrent._mcode._codevisitorselect /*RemoteObject*/  = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor")));
 BA.debugLineNum = 276;BA.debugLine="Log(\"کد ویزیتور : \"&Cu.GetString(\"FldC_Visitor\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","561210641",RemoteObject.concat(RemoteObject.createImmutable("کد ویزیتور : "),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor")))),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 278;BA.debugLine="Btn_SelVisitor.Text = \"انتخاب ویزیتور\"";
Debug.ShouldStop(2097152);
parent.mostCurrent._btn_selvisitor.runMethod(true,"setText",BA.ObjectToCharSequence("انتخاب ویزیتور"));
 BA.debugLineNum = 279;BA.debugLine="MCode.CodeVisitorSelect=0";
Debug.ShouldStop(4194304);
parent.mostCurrent._mcode._codevisitorselect /*RemoteObject*/  = BA.NumberToString(0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 281;BA.debugLine="Panel1.Visible=False";
Debug.ShouldStop(16777216);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 282;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnaz_click() throws Exception{
try {
		Debug.PushSubsStack("BtnAz_Click (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,195);
if (RapidSub.canDelegate("btnaz_click")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","btnaz_click");}
RemoteObject _p = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 195;BA.debugLine="Sub BtnAz_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="Dim p As PersianMaterialDatePicker";
Debug.ShouldStop(8);
_p = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 197;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
Debug.ShouldStop(16);
_p.runVoidMethod ("Initialize",act_repfactorvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString("p")),(Object)(_p.runMethod(true,"getPersianYear")),(Object)(_p.runMethod(true,"getPersianMonth")),(Object)(_p.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 198;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(32);
_p.runMethod(true,"setAccentColor",act_repfactorvisitor.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 199;BA.debugLine="p.OkText = \"تایید\"";
Debug.ShouldStop(64);
_p.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 200;BA.debugLine="p.CancelText = \"لغو\"";
Debug.ShouldStop(128);
_p.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 201;BA.debugLine="p.Title = \"از تاریخ\"";
Debug.ShouldStop(256);
_p.runVoidMethod ("setTitle",BA.ObjectToString("از تاریخ"));
 BA.debugLineNum = 202;BA.debugLine="p.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
Debug.ShouldStop(512);
_p.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmobile(fanum)_bold.ttf"));
 BA.debugLineNum = 203;BA.debugLine="p.Show(\"p\")";
Debug.ShouldStop(1024);
_p.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p")));
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
public static RemoteObject  _btnreport_click() throws Exception{
try {
		Debug.PushSubsStack("BtnReport_Click (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,116);
if (RapidSub.canDelegate("btnreport_click")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","btnreport_click");}
 BA.debugLineNum = 116;BA.debugLine="Sub BtnReport_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(B";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",act_repfactorvisitor.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(BA.ObjectToString(act_repfactorvisitor.mostCurrent._btnaz.runMethod(false,"getTag")))),BA.numberCast(long.class, 8)) && RemoteObject.solveBoolean("=",act_repfactorvisitor.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(BA.ObjectToString(act_repfactorvisitor.mostCurrent._btnta.runMethod(false,"getTag")))),BA.numberCast(long.class, 8))) { 
 BA.debugLineNum = 118;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .";
Debug.ShouldStop(2097152);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_repfactorvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال دریافت اطلاعات . . .")),(Object)(act_repfactorvisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 120;BA.debugLine="CallSubDelayed3(Service_Server,\"GetReportFactorV";
Debug.ShouldStop(8388608);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",act_repfactorvisitor.processBA,(Object)((act_repfactorvisitor.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("GetReportFactorVisitor")),(Object)((act_repfactorvisitor.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_repfactorvisitor.mostCurrent.activityBA,(Object)(act_repfactorvisitor.mostCurrent._dateaz)))),(Object)((act_repfactorvisitor.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_repfactorvisitor.mostCurrent.activityBA,(Object)(act_repfactorvisitor.mostCurrent._dateta)))));
 }else {
 BA.debugLineNum = 122;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
Debug.ShouldStop(33554432);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید")),(Object)(act_repfactorvisitor.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnta_click() throws Exception{
try {
		Debug.PushSubsStack("BtnTa_Click (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,216);
if (RapidSub.canDelegate("btnta_click")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","btnta_click");}
RemoteObject _p1 = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 216;BA.debugLine="Sub BtnTa_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
Debug.ShouldStop(16777216);
_p1 = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 218;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
Debug.ShouldStop(33554432);
_p1.runVoidMethod ("Initialize",act_repfactorvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString("p1")),(Object)(_p1.runMethod(true,"getPersianYear")),(Object)(_p1.runMethod(true,"getPersianMonth")),(Object)(_p1.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 219;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(67108864);
_p1.runMethod(true,"setAccentColor",act_repfactorvisitor.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 220;BA.debugLine="p1.OkText = \"تایید\"";
Debug.ShouldStop(134217728);
_p1.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 221;BA.debugLine="p1.CancelText = \"لغو\"";
Debug.ShouldStop(268435456);
_p1.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 222;BA.debugLine="p1.Title = \"تا تاریخ\"";
Debug.ShouldStop(536870912);
_p1.runVoidMethod ("setTitle",BA.ObjectToString("تا تاریخ"));
 BA.debugLineNum = 223;BA.debugLine="p1.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
Debug.ShouldStop(1073741824);
_p1.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmobile(fanum)_bold.ttf"));
 BA.debugLineNum = 224;BA.debugLine="p1.Show(\"p1\")";
Debug.ShouldStop(-2147483648);
_p1.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p1")));
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creategrid() throws Exception{
try {
		Debug.PushSubsStack("CreateGrid (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,60);
if (RapidSub.canDelegate("creategrid")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","creategrid");}
 BA.debugLineNum = 60;BA.debugLine="Sub CreateGrid";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlist(RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("CreateList (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,126);
if (RapidSub.canDelegate("createlist")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","createlist", _lst);}
RemoteObject _coljroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor");
Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 126;BA.debugLine="Sub CreateList(Lst As List)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="LstReport.Clear";
Debug.ShouldStop(1073741824);
act_repfactorvisitor.mostCurrent._lstreport.runVoidMethod ("Clear");
 BA.debugLineNum = 128;BA.debugLine="TitleReport(0) = 0";
Debug.ShouldStop(-2147483648);
act_repfactorvisitor._titlereport.setArrayElement (BA.numberCast(long.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 129;BA.debugLine="TitleReport(1) = 0";
Debug.ShouldStop(1);
act_repfactorvisitor._titlereport.setArrayElement (BA.numberCast(long.class, 0),BA.numberCast(int.class, 1));
 BA.debugLineNum = 130;BA.debugLine="TitleReport(2) = 0";
Debug.ShouldStop(2);
act_repfactorvisitor._titlereport.setArrayElement (BA.numberCast(long.class, 0),BA.numberCast(int.class, 2));
 BA.debugLineNum = 132;BA.debugLine="For Each coljRoot As Map In Lst";
Debug.ShouldStop(8);
_coljroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group5 = _lst;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_coljroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group5.runMethod(false,"Get",index5));Debug.locals.put("coljRoot", _coljroot);
Debug.locals.put("coljRoot", _coljroot);
 BA.debugLineNum = 133;BA.debugLine="Dim Item As AdapteRepFactorVisitor";
Debug.ShouldStop(16);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor");Debug.locals.put("Item", _item);
 BA.debugLineNum = 134;BA.debugLine="Item.fldShomareFactor =  coljRoot.Get(\"fldShomar";
Debug.ShouldStop(32);
_item.setField ("fldShomareFactor" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactor"))))));
 BA.debugLineNum = 135;BA.debugLine="Item.fldCodeVasete = coljRoot.Get(\"fldCodeVasete";
Debug.ShouldStop(64);
_item.setField ("fldCodeVasete" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeVasete"))))));
 BA.debugLineNum = 136;BA.debugLine="Item.FldN_Visitor =coljRoot.Get(\"FldN_Visitor\")";
Debug.ShouldStop(128);
_item.setField ("FldN_Visitor" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldN_Visitor"))))));
 BA.debugLineNum = 137;BA.debugLine="Item.fldDate =coljRoot.Get(\"fldDate\")";
Debug.ShouldStop(256);
_item.setField ("fldDate" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate"))))));
 BA.debugLineNum = 138;BA.debugLine="Item.fldTime =coljRoot.Get(\"fldTime\")";
Debug.ShouldStop(512);
_item.setField ("fldTime" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTime"))))));
 BA.debugLineNum = 150;BA.debugLine="If coljRoot.Get(\"fldNahveTasvie\")<>\"0\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNahveTasvie")))),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 151;BA.debugLine="Item.fldNahveTasvie=MCode.GetNahvieTasfie(coljR";
Debug.ShouldStop(4194304);
_item.setField ("fldNahveTasvie" /*RemoteObject*/ ,act_repfactorvisitor.mostCurrent._mcode.runMethod(true,"_getnahvietasfie" /*RemoteObject*/ ,act_repfactorvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldNahveTasvie"))))))));
 }else {
 BA.debugLineNum = 153;BA.debugLine="Item.fldNahveTasvie=\"نامشخص\"";
Debug.ShouldStop(16777216);
_item.setField ("fldNahveTasvie" /*RemoteObject*/ ,BA.ObjectToString("نامشخص"));
 };
 BA.debugLineNum = 156;BA.debugLine="Item.fldCodeTafsili =coljRoot.Get(\"fldCodeTafsil";
Debug.ShouldStop(134217728);
_item.setField ("fldCodeTafsili" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeTafsili"))))));
 BA.debugLineNum = 157;BA.debugLine="Item.fldSharheTafzili =coljRoot.Get(\"fldSharheTa";
Debug.ShouldStop(268435456);
_item.setField ("fldSharheTafzili" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharheTafzili"))))));
 BA.debugLineNum = 158;BA.debugLine="Item.fldTozihat =coljRoot.Get(\"fldTozihat\")";
Debug.ShouldStop(536870912);
_item.setField ("fldTozihat" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTozihat"))))));
 BA.debugLineNum = 165;BA.debugLine="Item.fldShomareFactorReal =coljRoot.Get(\"fldShom";
Debug.ShouldStop(16);
_item.setField ("fldShomareFactorReal" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldShomareFactorReal"))))));
 BA.debugLineNum = 168;BA.debugLine="LstReport.Add(Item)";
Debug.ShouldStop(128);
act_repfactorvisitor.mostCurrent._lstreport.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("coljRoot", _coljroot);
;
 BA.debugLineNum = 189;BA.debugLine="LstReport.SortType(\"fldShomareFactor\",False)";
Debug.ShouldStop(268435456);
act_repfactorvisitor.mostCurrent._lstreport.runVoidMethod ("SortType",(Object)(BA.ObjectToString("fldShomareFactor")),(Object)(act_repfactorvisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 191;BA.debugLine="HLV.Show";
Debug.ShouldStop(1073741824);
act_repfactorvisitor.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private XUI As XUI";
act_repfactorvisitor.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 12;BA.debugLine="Private Dialog As B4XDialog";
act_repfactorvisitor.mostCurrent._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 13;BA.debugLine="Private Base As B4XView";
act_repfactorvisitor.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private SearchTemplate As B4XSearchTemplate";
act_repfactorvisitor.mostCurrent._searchtemplate = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xsearchtemplate");
 //BA.debugLineNum = 17;BA.debugLine="Private PnlGrid As Panel";
act_repfactorvisitor.mostCurrent._pnlgrid = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Panel1 As Panel";
act_repfactorvisitor.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private BtnAz As Button";
act_repfactorvisitor.mostCurrent._btnaz = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private BtnTa As Button";
act_repfactorvisitor.mostCurrent._btnta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim DateAz,DateTa As String";
act_repfactorvisitor.mostCurrent._dateaz = RemoteObject.createImmutable("");
act_repfactorvisitor.mostCurrent._dateta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim LstReport As List";
act_repfactorvisitor.mostCurrent._lstreport = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 23;BA.debugLine="Dim TitleReport(3) As Long";
act_repfactorvisitor._titlereport = RemoteObject.createNewArray ("long", new int[] {3}, new Object[]{});
 //BA.debugLineNum = 25;BA.debugLine="Private Btn_SelVisitor As Button";
act_repfactorvisitor.mostCurrent._btn_selvisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim HLV As Hitex_LayoutView";
act_repfactorvisitor.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,95);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","hlv_getitemcount");}
 BA.debugLineNum = 95;BA.debugLine="Sub HLV_GetItemCount As Int 								        '$ Ite";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Return LstReport.Size";
Debug.ShouldStop(-2147483648);
if (true) return act_repfactorvisitor.mostCurrent._lstreport.runMethod(true,"getSize");
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_onBindViewHolder (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,88);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_factorvisitor");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 88;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Dim Item = LstReport.Get(Position) As AdapteRepFa";
Debug.ShouldStop(16777216);
_item = (act_repfactorvisitor.mostCurrent._lstreport.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 90;BA.debugLine="Dim rec As Cls_Rec_FactorVisitor=Parent.Tag";
Debug.ShouldStop(33554432);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 91;BA.debugLine="rec.Show(Item)";
Debug.ShouldStop(67108864);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_factorvisitor.class, "_show" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 92;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(134217728);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_factorvisitor.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_oncreateviewholder(RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,81);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_factorvisitor");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 81;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim rec As Cls_Rec_FactorVisitor";
Debug.ShouldStop(131072);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_rec_factorvisitor");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 83;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(262144);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_factorvisitor.class, "_initialize" /*RemoteObject*/ ,act_repfactorvisitor.mostCurrent.activityBA,(Object)(act_repfactorvisitor.getObject()));
 BA.debugLineNum = 84;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(524288);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_factorvisitor.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_repfactorvisitor.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_repfactorvisitor.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_factorvisitor.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(1048576);
_parent.runMethod(false,"setTag",(_rec));
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
public static RemoteObject  _img_chart_click() throws Exception{
try {
		Debug.PushSubsStack("Img_Chart_Click (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,299);
if (RapidSub.canDelegate("img_chart_click")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","img_chart_click");}
 BA.debugLineNum = 299;BA.debugLine="Sub Img_Chart_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _img_sort_click() throws Exception{
try {
		Debug.PushSubsStack("Img_Sort_Click (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,247);
if (RapidSub.canDelegate("img_sort_click")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","img_sort_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 247;BA.debugLine="Sub Img_Sort_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="Dim Lst As List = Array As String(\"مبلغ کم به زیا";
Debug.ShouldStop(8388608);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_repfactorvisitor.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("مبلغ کم به زیاد"),RemoteObject.createImmutable("مبلغ زیاد به کم")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 249;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
Debug.ShouldStop(16777216);
_res = act_repfactorvisitor.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("مرتب سازی براساس:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_repfactorvisitor.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 250;BA.debugLine="Select Case res";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 252;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",False)";
Debug.ShouldStop(134217728);
act_repfactorvisitor.mostCurrent._lstreport.runVoidMethod ("SortType",(Object)(BA.ObjectToString("fldFeeJoz")),(Object)(act_repfactorvisitor.mostCurrent.__c.getField(true,"False")));
 break; }
case 1: {
 BA.debugLineNum = 254;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",True)";
Debug.ShouldStop(536870912);
act_repfactorvisitor.mostCurrent._lstreport.runVoidMethod ("SortType",(Object)(BA.ObjectToString("fldFeeJoz")),(Object)(act_repfactorvisitor.mostCurrent.__c.getField(true,"True")));
 break; }
}
;
 BA.debugLineNum = 256;BA.debugLine="ProgressDialogShow(\"لطفا چند لحظه صبر کنید\")";
Debug.ShouldStop(-2147483648);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_repfactorvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("لطفا چند لحظه صبر کنید"))));
 BA.debugLineNum = 257;BA.debugLine="CreateGrid";
Debug.ShouldStop(1);
_creategrid();
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,243);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","lblback_click");}
 BA.debugLineNum = 243;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
act_repfactorvisitor.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _loaddata() throws Exception{
try {
		Debug.PushSubsStack("LoadData (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,43);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","loaddata");}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _name = RemoteObject.createImmutable("");
 BA.debugLineNum = 43;BA.debugLine="Public Sub LoadData";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="MCode.page=\"Act_RepFactorVisitor\"";
Debug.ShouldStop(2048);
act_repfactorvisitor.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_RepFactorVisitor");
 BA.debugLineNum = 45;BA.debugLine="Dim Items As List";
Debug.ShouldStop(4096);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 46;BA.debugLine="Items.Initialize";
Debug.ShouldStop(8192);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(16384);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_repfactorvisitor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_repfactorvisitor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblVisitor ")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 48;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(32768);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 49;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(65536);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 50;BA.debugLine="Dim Name As String =  Cu.GetString(\"FldN_Visitor";
Debug.ShouldStop(131072);
_name = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Visitor")));Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 51;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(262144);
_items.runVoidMethod ("Add",(Object)((_name)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 53;BA.debugLine="SearchTemplate.SetItems(Items)";
Debug.ShouldStop(1048576);
act_repfactorvisitor.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 54;BA.debugLine="SearchTemplate.GetPanel(Dialog).BringToFront";
Debug.ShouldStop(2097152);
act_repfactorvisitor.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_getpanel" /*RemoteObject*/ ,(Object)(act_repfactorvisitor.mostCurrent._dialog)).runVoidMethod ("BringToFront");
 BA.debugLineNum = 56;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(8388608);
act_repfactorvisitor.mostCurrent._hlv.runMethod(false,"Initializer",act_repfactorvisitor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 57;BA.debugLine="PnlGrid.AddView(HLV,0,0,PnlGrid.Width,PnlGrid.Hei";
Debug.ShouldStop(16777216);
act_repfactorvisitor.mostCurrent._pnlgrid.runVoidMethod ("AddView",(Object)((act_repfactorvisitor.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_repfactorvisitor.mostCurrent._pnlgrid.runMethod(true,"getWidth")),(Object)(act_repfactorvisitor.mostCurrent._pnlgrid.runMethod(true,"getHeight")));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_ondateset(RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("p_onDateSet (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,205);
if (RapidSub.canDelegate("p_ondateset")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","p_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 205;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(8192);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","560751873",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 207;BA.debugLine="BtnAz.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(16384);
act_repfactorvisitor.mostCurrent._btnaz.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 208;BA.debugLine="BtnAz.Tag =year&NumberFormat(day,2,0)&NumberForma";
Debug.ShouldStop(32768);
act_repfactorvisitor.mostCurrent._btnaz.runMethod(false,"setTag",(RemoteObject.concat(_year,act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 212;BA.debugLine="DateAz=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(524288);
act_repfactorvisitor.mostCurrent._dateaz = RemoteObject.concat(_year,act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 213;BA.debugLine="LogColor(DateAz,Colors.Magenta)";
Debug.ShouldStop(1048576);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","560751880",act_repfactorvisitor.mostCurrent._dateaz,act_repfactorvisitor.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p1_oncancel() throws Exception{
try {
		Debug.PushSubsStack("p1_onCancel (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,236);
if (RapidSub.canDelegate("p1_oncancel")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","p1_oncancel");}
 BA.debugLineNum = 236;BA.debugLine="Sub p1_onCancel";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(4096);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","560948481",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p1_ondateset(RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("p1_onDateSet (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,226);
if (RapidSub.canDelegate("p1_ondateset")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","p1_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 226;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(4);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","560882945",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 228;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(8);
act_repfactorvisitor.mostCurrent._btnta.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 229;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
Debug.ShouldStop(16);
act_repfactorvisitor.mostCurrent._btnta.runMethod(false,"setTag",(RemoteObject.concat(_year,act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 233;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(256);
act_repfactorvisitor.mostCurrent._dateta = RemoteObject.concat(_year,act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_repfactorvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 234;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
Debug.ShouldStop(512);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","560882952",act_repfactorvisitor.mostCurrent._dateta,act_repfactorvisitor.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p1_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("p1_onDismiss (act_repfactorvisitor) ","act_repfactorvisitor",31,act_repfactorvisitor.mostCurrent.activityBA,act_repfactorvisitor.mostCurrent,239);
if (RapidSub.canDelegate("p1_ondismiss")) { return ir.parsikhesab.pakhsh.act_repfactorvisitor.remoteMe.runUserSub(false, "act_repfactorvisitor","p1_ondismiss");}
 BA.debugLineNum = 239;BA.debugLine="Sub p1_onDismiss";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(32768);
act_repfactorvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","561014017",RemoteObject.createImmutable("dismiss"),0);
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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