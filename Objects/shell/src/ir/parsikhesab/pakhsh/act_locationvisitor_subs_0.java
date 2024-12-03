package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_locationvisitor_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,40);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"l_visitorlocation\")";
Debug.ShouldStop(256);
act_locationvisitor.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_visitorlocation")),act_locationvisitor.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="Base = Activity";
Debug.ShouldStop(512);
act_locationvisitor.mostCurrent._base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_locationvisitor.mostCurrent._activity.getObject());
 BA.debugLineNum = 43;BA.debugLine="LstLocation.Initialize";
Debug.ShouldStop(1024);
act_locationvisitor.mostCurrent._lstlocation.runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="SearchTemplate.Initialize";
Debug.ShouldStop(2048);
act_locationvisitor.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="Dialog1.Initialize (Activity)";
Debug.ShouldStop(4096);
act_locationvisitor.mostCurrent._dialog1.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_locationvisitor.mostCurrent._activity.getObject()));
 BA.debugLineNum = 46;BA.debugLine="MCode.page=\"Act_LocationVisitor\"";
Debug.ShouldStop(8192);
act_locationvisitor.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_LocationVisitor");
 BA.debugLineNum = 47;BA.debugLine="MCode.NoeGet=\"GetVisitor\"";
Debug.ShouldStop(16384);
act_locationvisitor.mostCurrent._mcode._noeget /*RemoteObject*/  = BA.ObjectToString("GetVisitor");
 BA.debugLineNum = 48;BA.debugLine="StartService(Service_Server)";
Debug.ShouldStop(32768);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("StartService",act_locationvisitor.processBA,(Object)((act_locationvisitor.mostCurrent._service_server.getObject())));
 BA.debugLineNum = 49;BA.debugLine="MCode.CodeVisitorSelect=0";
Debug.ShouldStop(65536);
act_locationvisitor.mostCurrent._mcode._codevisitorselect /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 50;BA.debugLine="Location.Initialize";
Debug.ShouldStop(131072);
act_locationvisitor._location.runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="points.Initialize";
Debug.ShouldStop(262144);
act_locationvisitor.mostCurrent._points.runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="SB1.Value=0";
Debug.ShouldStop(524288);
act_locationvisitor.mostCurrent._sb1.runMethod(true,"setValue",BA.numberCast(int.class, 0));
 BA.debugLineNum = 53;BA.debugLine="mdtime.Initialize(\"mdtime\",0,0,True)";
Debug.ShouldStop(1048576);
act_locationvisitor.mostCurrent._mdtime.runVoidMethod ("Initialize",act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString("mdtime")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_locationvisitor.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_KeyPress (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,112);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 112;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_locationvisitor.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 114;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
act_locationvisitor.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 116;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return act_locationvisitor.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 118;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return act_locationvisitor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Pause (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,108);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 108;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Resume (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,104);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","activity_resume");}
 BA.debugLineNum = 104;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
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
public static RemoteObject  _animatedialog(RemoteObject _dlg,RemoteObject _fromedge) throws Exception{
try {
		Debug.PushSubsStack("AnimateDialog (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,293);
if (RapidSub.canDelegate("animatedialog")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","animatedialog", _dlg, _fromedge);}
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
Debug.locals.put("dlg", _dlg);
Debug.locals.put("FromEdge", _fromedge);
 BA.debugLineNum = 293;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="Dim Base As B4XView = dlg.Base";
Debug.ShouldStop(32);
act_locationvisitor.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
act_locationvisitor.mostCurrent._base = _dlg.getField(false,"_base" /*RemoteObject*/ );
 BA.debugLineNum = 295;BA.debugLine="Dim top As Int = Base.Top";
Debug.ShouldStop(64);
_top = act_locationvisitor.mostCurrent._base.runMethod(true,"getTop");Debug.locals.put("top", _top);Debug.locals.put("top", _top);
 BA.debugLineNum = 296;BA.debugLine="Dim left As Int = Base.Left";
Debug.ShouldStop(128);
_left = act_locationvisitor.mostCurrent._base.runMethod(true,"getLeft");Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 297;BA.debugLine="Select FromEdge.ToLowerCase";
Debug.ShouldStop(256);
switch (BA.switchObjectToInt(_fromedge.runMethod(true,"toLowerCase"),BA.ObjectToString("bottom"),BA.ObjectToString("top"),BA.ObjectToString("left"),BA.ObjectToString("right"))) {
case 0: {
 BA.debugLineNum = 299;BA.debugLine="Base.Top = Base.Parent.Height";
Debug.ShouldStop(1024);
act_locationvisitor.mostCurrent._base.runMethod(true,"setTop",act_locationvisitor.mostCurrent._base.runMethod(false,"getParent").runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 301;BA.debugLine="Base.Top = -Base.Height";
Debug.ShouldStop(4096);
act_locationvisitor.mostCurrent._base.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + act_locationvisitor.mostCurrent._base.runMethod(true,"getHeight").<Integer>get().intValue())));
 break; }
case 2: {
 BA.debugLineNum = 303;BA.debugLine="Base.Left = -Base.Width";
Debug.ShouldStop(16384);
act_locationvisitor.mostCurrent._base.runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + act_locationvisitor.mostCurrent._base.runMethod(true,"getWidth").<Integer>get().intValue())));
 break; }
case 3: {
 BA.debugLineNum = 305;BA.debugLine="Base.Left = Base.Parent.Width";
Debug.ShouldStop(65536);
act_locationvisitor.mostCurrent._base.runMethod(true,"setLeft",act_locationvisitor.mostCurrent._base.runMethod(false,"getParent").runMethod(true,"getWidth"));
 break; }
}
;
 BA.debugLineNum = 307;BA.debugLine="Base.SetLayoutAnimated(300, left, top, Base.Width";
Debug.ShouldStop(262144);
act_locationvisitor.mostCurrent._base.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(_left),(Object)(_top),(Object)(act_locationvisitor.mostCurrent._base.runMethod(true,"getWidth")),(Object)(act_locationvisitor.mostCurrent._base.runMethod(true,"getHeight")));
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Application_Error (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,426);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 426;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(512);
 BA.debugLineNum = 428;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return act_locationvisitor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 429;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btn_Back_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,310);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","btn_back_click");}
 BA.debugLineNum = 310;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
act_locationvisitor.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_selvisitor_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_SelVisitor_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,269);
if (RapidSub.canDelegate("btn_selvisitor_click")) { ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","btn_selvisitor_click"); return;}
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
public ResumableSub_Btn_SelVisitor_Click(ir.parsikhesab.pakhsh.act_locationvisitor parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_locationvisitor parent;
RemoteObject _rs = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_SelVisitor_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,269);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 270;BA.debugLine="Dialog.Initialize (Panel1)";
Debug.ShouldStop(8192);
parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._panel1.getObject()));
 BA.debugLineNum = 271;BA.debugLine="Dialog.Title = \"جستجو\"";
Debug.ShouldStop(16384);
parent.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("جستجو")));
 BA.debugLineNum = 272;BA.debugLine="Panel1.BringToFront";
Debug.ShouldStop(32768);
parent.mostCurrent._panel1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 273;BA.debugLine="Panel1.Visible=True";
Debug.ShouldStop(65536);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 274;BA.debugLine="SearchTemplate.SearchField.HintText=\"نام ویزیتور\"";
Debug.ShouldStop(131072);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString("نام ویزیتور"));
 BA.debugLineNum = 275;BA.debugLine="SearchTemplate.SearchField.lblClear.Text=\"\"";
Debug.ShouldStop(262144);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 276;BA.debugLine="SearchTemplate.SearchField.lblV.Text=\"\"";
Debug.ShouldStop(524288);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 277;BA.debugLine="SearchTemplate.SearchField.Update";
Debug.ShouldStop(1048576);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 278;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
Debug.ShouldStop(2097152);
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._searchtemplate)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("انصراف"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 279;BA.debugLine="AnimateDialog(Dialog, \"right\")";
Debug.ShouldStop(4194304);
_animatedialog(parent.mostCurrent._dialog,RemoteObject.createImmutable("right"));
 BA.debugLineNum = 280;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_locationvisitor.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_locationvisitor", "btn_selvisitor_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 281;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 282;BA.debugLine="Btn_SelVisitor.Text = SearchTemplate.SelectedIte";
Debug.ShouldStop(33554432);
parent.mostCurrent._btn_selvisitor.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate.getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 283;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblVisitor where FldN_Visitor='"),parent.mostCurrent._btn_selvisitor.runMethod(true,"getText"),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 284;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(134217728);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 285;BA.debugLine="MCode.CodeVisitorSelect =  Cu.GetString(\"FldC_Vi";
Debug.ShouldStop(268435456);
parent.mostCurrent._mcode._codevisitorselect /*RemoteObject*/  = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor")));
 BA.debugLineNum = 286;BA.debugLine="Log(\"کد ویزیتور : \"&Cu.GetString(\"FldC_Visitor\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","544695569",RemoteObject.concat(RemoteObject.createImmutable("کد ویزیتور : "),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor")))),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 288;BA.debugLine="Btn_SelVisitor.Text = \"انتخاب ویزیتور\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._btn_selvisitor.runMethod(true,"setText",BA.ObjectToCharSequence("انتخاب ویزیتور"));
 BA.debugLineNum = 289;BA.debugLine="MCode.CodeVisitorSelect=0";
Debug.ShouldStop(1);
parent.mostCurrent._mcode._codevisitorselect /*RemoteObject*/  = BA.NumberToString(0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 291;BA.debugLine="Panel1.Visible=False";
Debug.ShouldStop(4);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _btnclearmap_click() throws Exception{
try {
		Debug.PushSubsStack("BtnClearMap_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,353);
if (RapidSub.canDelegate("btnclearmap_click")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","btnclearmap_click");}
 BA.debugLineNum = 353;BA.debugLine="Private Sub BtnClearMap_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 354;BA.debugLine="If gmap.IsInitialized And Location.IsInitialized";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",act_locationvisitor.mostCurrent._gmap.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",act_locationvisitor._location.runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 355;BA.debugLine="gmap.Clear";
Debug.ShouldStop(4);
act_locationvisitor.mostCurrent._gmap.runVoidMethod ("Clear");
 BA.debugLineNum = 356;BA.debugLine="points.Clear";
Debug.ShouldStop(8);
act_locationvisitor.mostCurrent._points.runVoidMethod ("Clear");
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
public static void  _btncount_click() throws Exception{
try {
		Debug.PushSubsStack("BtnCount_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,314);
if (RapidSub.canDelegate("btncount_click")) { ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","btncount_click"); return;}
ResumableSub_BtnCount_Click rsub = new ResumableSub_BtnCount_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnCount_Click extends BA.ResumableSub {
public ResumableSub_BtnCount_Click(ir.parsikhesab.pakhsh.act_locationvisitor parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_locationvisitor parent;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnCount_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,314);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 315;BA.debugLine="Try";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
 BA.debugLineNum = 316;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(134217728);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 317;BA.debugLine="input.Initialize";
Debug.ShouldStop(268435456);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA);
 BA.debugLineNum = 318;BA.debugLine="input.lblTitle.Text = \"تعداد نقطه ها:\"";
Debug.ShouldStop(536870912);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("تعداد نقطه ها:"));
 BA.debugLineNum = 319;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(1073741824);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 320;BA.debugLine="Dim rs As ResumableSub = Dialog1.ShowTemplate(in";
Debug.ShouldStop(-2147483648);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog1.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 321;BA.debugLine="Dialog1.Base.Top = 50%y - Dialog1.Base.Height /";
Debug.ShouldStop(1);
parent.mostCurrent._dialog1.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_locationvisitor.mostCurrent.activityBA),parent.mostCurrent._dialog1.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 322;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_locationvisitor.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_locationvisitor", "btncount_click"), _rs);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 323;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 324;BA.debugLine="If input.Text=\"\" Then input.Text=0";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_input.getField(true,"_text" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_input.setField ("_text" /*RemoteObject*/ ,BA.NumberToString(0));
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 325;BA.debugLine="Dim res As Int = input.Text 'no need to check w";
Debug.ShouldStop(16);
_res = BA.numberCast(int.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 326;BA.debugLine="BtnCount.Text=res";
Debug.ShouldStop(32);
parent.mostCurrent._btncount.runMethod(true,"setText",BA.ObjectToCharSequence(_res));
 if (true) break;

case 13:
//C
this.state = 16;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 BA.debugLineNum = 329;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","544892175",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_locationvisitor.mostCurrent.activityBA)),0);
 BA.debugLineNum = 330;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(512);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_locationvisitor.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnCount_Click"))));
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_locationvisitor.processBA, e0.toString());}
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
public static RemoteObject  _btngetlocation_click() throws Exception{
try {
		Debug.PushSubsStack("btnGetLocation_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,334);
if (RapidSub.canDelegate("btngetlocation_click")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","btngetlocation_click");}
 BA.debugLineNum = 334;BA.debugLine="Private Sub btnGetLocation_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 336;BA.debugLine="If	MCode.CodeVisitorSelect=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",act_locationvisitor.mostCurrent._mcode._codevisitorselect /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 337;BA.debugLine="ToastMessageShow(\"لطفا ویزیتور را انتخاب نمایید";
Debug.ShouldStop(65536);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ویزیتور را انتخاب نمایید.")),(Object)(act_locationvisitor.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 338;BA.debugLine="Return";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 340;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .";
Debug.ShouldStop(524288);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال دریافت اطلاعات . . .")),(Object)(act_locationvisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 341;BA.debugLine="MCode.CountShowGpsMap=0";
Debug.ShouldStop(1048576);
act_locationvisitor.mostCurrent._mcode._countshowgpsmap /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 342;BA.debugLine="MCode.GpsDateTa=0";
Debug.ShouldStop(2097152);
act_locationvisitor.mostCurrent._mcode._gpsdateta /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 343;BA.debugLine="MCode.GpsTimeAz=0";
Debug.ShouldStop(4194304);
act_locationvisitor.mostCurrent._mcode._gpstimeaz /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 344;BA.debugLine="MCode.GpsTimeTa=0";
Debug.ShouldStop(8388608);
act_locationvisitor.mostCurrent._mcode._gpstimeta /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 345;BA.debugLine="CallSubDelayed(Service_Server,\"GetListGpsVisitor";
Debug.ShouldStop(16777216);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("CallSubDelayed",act_locationvisitor.processBA,(Object)((act_locationvisitor.mostCurrent._service_server.getObject())),(Object)(RemoteObject.createImmutable("GetListGpsVisitor")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_locationvisitor.processBA, e13.toString()); BA.debugLineNum = 347;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","544957709",BA.ObjectToString(act_locationvisitor.mostCurrent.__c.runMethod(false,"LastException",act_locationvisitor.mostCurrent.activityBA)),0);
 BA.debugLineNum = 348;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(134217728);
act_locationvisitor.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_locationvisitor.mostCurrent.__c.runMethod(false,"LastException",act_locationvisitor.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_locationvisitor.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btnGetLocation_Click"))));
 };
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("BtnReport_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,205);
if (RapidSub.canDelegate("btnreport_click")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","btnreport_click");}
 BA.debugLineNum = 205;BA.debugLine="Sub BtnReport_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 207;BA.debugLine="If	MCode.CodeVisitorSelect=0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_locationvisitor.mostCurrent._mcode._codevisitorselect /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 208;BA.debugLine="ToastMessageShow(\"لطفا ویزیتور را انتخاب نمایید.";
Debug.ShouldStop(32768);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ویزیتور را انتخاب نمایید.")),(Object)(act_locationvisitor.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 209;BA.debugLine="Return";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 212;BA.debugLine="If  MCode.Sf.Len(BtnTa.Tag) <> 8 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",act_locationvisitor.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(BA.ObjectToString(act_locationvisitor.mostCurrent._btnta.runMethod(false,"getTag")))),BA.numberCast(long.class, 8))) { 
 BA.debugLineNum = 213;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
Debug.ShouldStop(1048576);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید")),(Object)(act_locationvisitor.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 214;BA.debugLine="Return";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 218;BA.debugLine="If MCode.Sf.Len(BtnTimeAz.Text)<>5 And MCode.Sf.L";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",act_locationvisitor.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(act_locationvisitor.mostCurrent._btntimeaz.runMethod(true,"getText"))),BA.numberCast(long.class, 5)) && RemoteObject.solveBoolean("!",act_locationvisitor.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(act_locationvisitor.mostCurrent._btntimeta.runMethod(true,"getText"))),BA.numberCast(long.class, 5))) { 
 BA.debugLineNum = 219;BA.debugLine="ToastMessageShow(\"ساعت را به طور صحیح وارد نمایی";
Debug.ShouldStop(67108864);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ساعت را به طور صحیح وارد نمایید")),(Object)(act_locationvisitor.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 220;BA.debugLine="Return";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 223;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .\"";
Debug.ShouldStop(1073741824);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال دریافت اطلاعات . . .")),(Object)(act_locationvisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 224;BA.debugLine="MCode.CountShowGpsMap=BtnCount.Text";
Debug.ShouldStop(-2147483648);
act_locationvisitor.mostCurrent._mcode._countshowgpsmap /*RemoteObject*/  = act_locationvisitor.mostCurrent._btncount.runMethod(true,"getText");
 BA.debugLineNum = 225;BA.debugLine="MCode.GpsDateTa=MCode.ConvertNumbersPersian2Engl";
Debug.ShouldStop(1);
act_locationvisitor.mostCurrent._mcode._gpsdateta /*RemoteObject*/  = act_locationvisitor.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA,(Object)(act_locationvisitor.mostCurrent._dateta));
 BA.debugLineNum = 226;BA.debugLine="MCode.GpsTimeAz=BtnTimeAz.Text.Replace(\":\",\"\")";
Debug.ShouldStop(2);
act_locationvisitor.mostCurrent._mcode._gpstimeaz /*RemoteObject*/  = act_locationvisitor.mostCurrent._btntimeaz.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(":")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 227;BA.debugLine="MCode.GpsTimeTa=BtnTimeTa.Text.Replace(\":\",\"\")";
Debug.ShouldStop(4);
act_locationvisitor.mostCurrent._mcode._gpstimeta /*RemoteObject*/  = act_locationvisitor.mostCurrent._btntimeta.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(":")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 228;BA.debugLine="CallSubDelayed(Service_Server,\"GetListGpsVisitor";
Debug.ShouldStop(8);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("CallSubDelayed",act_locationvisitor.processBA,(Object)((act_locationvisitor.mostCurrent._service_server.getObject())),(Object)(RemoteObject.createImmutable("GetListGpsVisitor")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_locationvisitor.processBA, e21.toString()); BA.debugLineNum = 230;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","544302361",BA.ObjectToString(act_locationvisitor.mostCurrent.__c.runMethod(false,"LastException",act_locationvisitor.mostCurrent.activityBA)),0);
 BA.debugLineNum = 231;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(64);
act_locationvisitor.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_locationvisitor.mostCurrent.__c.runMethod(false,"LastException",act_locationvisitor.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_locationvisitor.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnReport_Click"))));
 };
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("BtnTa_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,237);
if (RapidSub.canDelegate("btnta_click")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","btnta_click");}
RemoteObject _p1 = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 237;BA.debugLine="Sub BtnTa_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
Debug.ShouldStop(8192);
_p1 = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 239;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
Debug.ShouldStop(16384);
_p1.runVoidMethod ("Initialize",act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString("p1")),(Object)(_p1.runMethod(true,"getPersianYear")),(Object)(_p1.runMethod(true,"getPersianMonth")),(Object)(_p1.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 240;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(32768);
_p1.runMethod(true,"setAccentColor",act_locationvisitor.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 241;BA.debugLine="p1.OkText = \"تایید\"";
Debug.ShouldStop(65536);
_p1.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 242;BA.debugLine="p1.CancelText = \"لغو\"";
Debug.ShouldStop(131072);
_p1.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 243;BA.debugLine="p1.Title = \"تا تاریخ\"";
Debug.ShouldStop(262144);
_p1.runVoidMethod ("setTitle",BA.ObjectToString("تا تاریخ"));
 BA.debugLineNum = 244;BA.debugLine="p1.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
Debug.ShouldStop(524288);
_p1.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmobile(fanum)_bold.ttf"));
 BA.debugLineNum = 245;BA.debugLine="p1.Show(\"p1\")";
Debug.ShouldStop(1048576);
_p1.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p1")));
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntimeaz_click() throws Exception{
try {
		Debug.PushSubsStack("BtnTimeAz_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,381);
if (RapidSub.canDelegate("btntimeaz_click")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","btntimeaz_click");}
RemoteObject _t1 = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialTimePickerWrapper");
 BA.debugLineNum = 381;BA.debugLine="Private Sub BtnTimeAz_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 382;BA.debugLine="Dim t1 As PersianMaterialTimePicker";
Debug.ShouldStop(536870912);
_t1 = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialTimePickerWrapper");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 383;BA.debugLine="t1.Initialize(\"t1\",t1.Hour,t1.Minute,True)";
Debug.ShouldStop(1073741824);
_t1.runVoidMethod ("Initialize",act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString("t1")),(Object)(_t1.runMethod(true,"getHour")),(Object)(_t1.runMethod(true,"getMinute")),(Object)(act_locationvisitor.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 384;BA.debugLine="t1.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(-2147483648);
_t1.runMethod(true,"setAccentColor",act_locationvisitor.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 385;BA.debugLine="t1.OkText = \"تایید\"";
Debug.ShouldStop(1);
_t1.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 386;BA.debugLine="t1.CancelText = \"لغو\"";
Debug.ShouldStop(2);
_t1.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 387;BA.debugLine="t1.Title = \"از ساعت\"";
Debug.ShouldStop(4);
_t1.runMethod(true,"setTitle",BA.ObjectToString("از ساعت"));
 BA.debugLineNum = 388;BA.debugLine="t1.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
Debug.ShouldStop(8);
_t1.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmobile(fanum)_bold.ttf"));
 BA.debugLineNum = 389;BA.debugLine="t1.Show(\"t1\")";
Debug.ShouldStop(16);
_t1.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("t1")));
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntimeta_click() throws Exception{
try {
		Debug.PushSubsStack("BtnTimeTa_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,404);
if (RapidSub.canDelegate("btntimeta_click")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","btntimeta_click");}
RemoteObject _t2 = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialTimePickerWrapper");
 BA.debugLineNum = 404;BA.debugLine="Private Sub BtnTimeTa_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 405;BA.debugLine="Dim t2 As PersianMaterialTimePicker";
Debug.ShouldStop(1048576);
_t2 = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialTimePickerWrapper");Debug.locals.put("t2", _t2);
 BA.debugLineNum = 406;BA.debugLine="t2.Initialize(\"t2\",t2.Hour,t2.Minute,True)";
Debug.ShouldStop(2097152);
_t2.runVoidMethod ("Initialize",act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString("t2")),(Object)(_t2.runMethod(true,"getHour")),(Object)(_t2.runMethod(true,"getMinute")),(Object)(act_locationvisitor.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 407;BA.debugLine="t2.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(4194304);
_t2.runMethod(true,"setAccentColor",act_locationvisitor.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 408;BA.debugLine="t2.OkText = \"تایید\"";
Debug.ShouldStop(8388608);
_t2.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 409;BA.debugLine="t2.CancelText = \"لغو\"";
Debug.ShouldStop(16777216);
_t2.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 410;BA.debugLine="t2.Title = \"تا ساعت\"";
Debug.ShouldStop(33554432);
_t2.runMethod(true,"setTitle",BA.ObjectToString("تا ساعت"));
 BA.debugLineNum = 411;BA.debugLine="t2.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
Debug.ShouldStop(67108864);
_t2.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmobile(fanum)_bold.ttf"));
 BA.debugLineNum = 412;BA.debugLine="t2.Show(\"t2\")";
Debug.ShouldStop(134217728);
_t2.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("t2")));
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlocation() throws Exception{
try {
		Debug.PushSubsStack("GetLocation (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,142);
if (RapidSub.canDelegate("getlocation")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","getlocation");}
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lat = RemoteObject.createImmutable(0);
RemoteObject _lon = RemoteObject.createImmutable(0);
RemoteObject _latmin = RemoteObject.createImmutable(0);
RemoteObject _latmax = RemoteObject.createImmutable(0);
RemoteObject _latlast = RemoteObject.createImmutable(0);
RemoteObject _strtimeaz = RemoteObject.createImmutable("");
RemoteObject _strtimeta = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _llpoint = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");
RemoteObject _cl = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
RemoteObject _pl = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.PolylineWrapper");
 BA.debugLineNum = 142;BA.debugLine="Private Sub GetLocation";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(16384);
if (act_locationvisitor.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 144;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 148;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(524288);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 149;BA.debugLine="Dim Lat, Lon, LatMin, LatMax, LatLast As Double";
Debug.ShouldStop(1048576);
_lat = RemoteObject.createImmutable(0);Debug.locals.put("Lat", _lat);
_lon = RemoteObject.createImmutable(0);Debug.locals.put("Lon", _lon);
_latmin = RemoteObject.createImmutable(0);Debug.locals.put("LatMin", _latmin);
_latmax = RemoteObject.createImmutable(0);Debug.locals.put("LatMax", _latmax);
_latlast = RemoteObject.createImmutable(0);Debug.locals.put("LatLast", _latlast);
 BA.debugLineNum = 150;BA.debugLine="Dim strTimeAz, strTimeTa As String";
Debug.ShouldStop(2097152);
_strtimeaz = RemoteObject.createImmutable("");Debug.locals.put("strTimeAz", _strtimeaz);
_strtimeta = RemoteObject.createImmutable("");Debug.locals.put("strTimeTa", _strtimeta);
 BA.debugLineNum = 152;BA.debugLine="If Location.IsInitialized Then";
Debug.ShouldStop(8388608);
if (act_locationvisitor._location.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 153;BA.debugLine="gmap.Clear";
Debug.ShouldStop(16777216);
act_locationvisitor.mostCurrent._gmap.runVoidMethod ("Clear");
 BA.debugLineNum = 154;BA.debugLine="points.Clear";
Debug.ShouldStop(33554432);
act_locationvisitor.mostCurrent._points.runVoidMethod ("Clear");
 BA.debugLineNum = 155;BA.debugLine="LatMin=100";
Debug.ShouldStop(67108864);
_latmin = BA.numberCast(double.class, 100);Debug.locals.put("LatMin", _latmin);
 BA.debugLineNum = 156;BA.debugLine="LatMax=0";
Debug.ShouldStop(134217728);
_latmax = BA.numberCast(double.class, 0);Debug.locals.put("LatMax", _latmax);
 BA.debugLineNum = 157;BA.debugLine="For i=0 To LstLocation.Size-1";
Debug.ShouldStop(268435456);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {act_locationvisitor.mostCurrent._lstlocation.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 158;BA.debugLine="Row=LstLocation.Get(i)";
Debug.ShouldStop(536870912);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), act_locationvisitor.mostCurrent._lstlocation.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 160;BA.debugLine="Lat = Row.Get(\"FldLat\")";
Debug.ShouldStop(-2147483648);
_lat = BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldLat")))));Debug.locals.put("Lat", _lat);
 BA.debugLineNum = 161;BA.debugLine="Lon = Row.Get(\"FldLon\")";
Debug.ShouldStop(1);
_lon = BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldLon")))));Debug.locals.put("Lon", _lon);
 BA.debugLineNum = 162;BA.debugLine="If Lat > LatMin And Lat < LatMax Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_lat,_latmin) && RemoteObject.solveBoolean("<",_lat,_latmax)) { 
 }else {
 BA.debugLineNum = 165;BA.debugLine="Dim Time As String= MCode.ConvertNumToTime(R";
Debug.ShouldStop(16);
_time = act_locationvisitor.mostCurrent._mcode.runMethod(true,"_convertnumtotime" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTime")))))));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 166;BA.debugLine="Dim Date As String= MCode.PersianDateDash(Ro";
Debug.ShouldStop(32);
_date = act_locationvisitor.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTarikh")))))));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 167;BA.debugLine="Dim llPoint As LatLng";
Debug.ShouldStop(64);
_llpoint = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");Debug.locals.put("llPoint", _llpoint);
 BA.debugLineNum = 169;BA.debugLine="llPoint.Initialize(Lat,Lon)";
Debug.ShouldStop(256);
_llpoint.runVoidMethod ("Initialize",(Object)(_lat),(Object)(_lon));
 BA.debugLineNum = 170;BA.debugLine="points.Add(llPoint)";
Debug.ShouldStop(512);
act_locationvisitor.mostCurrent._points.runVoidMethod ("Add",(Object)((_llpoint.getObject())));
 BA.debugLineNum = 171;BA.debugLine="gmap.AddMarker(Lat,Lon,Time &\" \" & Date)";
Debug.ShouldStop(1024);
act_locationvisitor.mostCurrent._gmap.runVoidMethod ("AddMarker",(Object)(_lat),(Object)(_lon),(Object)(RemoteObject.concat(_time,RemoteObject.createImmutable(" "),_date)));
 BA.debugLineNum = 175;BA.debugLine="Dim cl As CameraPosition";
Debug.ShouldStop(16384);
_cl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cl", _cl);
 BA.debugLineNum = 176;BA.debugLine="cl.Initialize(Lat,Lon,50)";
Debug.ShouldStop(32768);
_cl.runVoidMethod ("Initialize",(Object)(_lat),(Object)(_lon),(Object)(BA.numberCast(float.class, 50)));
 BA.debugLineNum = 177;BA.debugLine="gmap.AnimateCamera(cl)";
Debug.ShouldStop(65536);
act_locationvisitor.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cl.getObject())));
 };
 BA.debugLineNum = 180;BA.debugLine="LatLast = Lat";
Debug.ShouldStop(524288);
_latlast = _lat;Debug.locals.put("LatLast", _latlast);
 BA.debugLineNum = 181;BA.debugLine="LatMin = LatLast - Deghat";
Debug.ShouldStop(1048576);
_latmin = RemoteObject.solve(new RemoteObject[] {_latlast,act_locationvisitor._deghat}, "-",1, 0);Debug.locals.put("LatMin", _latmin);
 BA.debugLineNum = 182;BA.debugLine="LatMax = LatLast + Deghat";
Debug.ShouldStop(2097152);
_latmax = RemoteObject.solve(new RemoteObject[] {_latlast,act_locationvisitor._deghat}, "+",1, 0);Debug.locals.put("LatMax", _latmax);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 184;BA.debugLine="Dim pl As Polyline = gmap.AddPolyline";
Debug.ShouldStop(8388608);
_pl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.PolylineWrapper");
_pl = act_locationvisitor.mostCurrent._gmap.runMethod(false,"AddPolyline");Debug.locals.put("pl", _pl);Debug.locals.put("pl", _pl);
 BA.debugLineNum = 185;BA.debugLine="pl.points = points";
Debug.ShouldStop(16777216);
_pl.runMethod(false,"setPoints",act_locationvisitor.mostCurrent._points);
 BA.debugLineNum = 186;BA.debugLine="pl.Color = Colors.Blue";
Debug.ShouldStop(33554432);
_pl.runMethod(true,"setColor",act_locationvisitor.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 187;BA.debugLine="SB1.Value = BtnCount.Text";
Debug.ShouldStop(67108864);
act_locationvisitor.mostCurrent._sb1.runMethod(true,"setValue",BA.numberCast(int.class, act_locationvisitor.mostCurrent._btncount.runMethod(true,"getText")));
 BA.debugLineNum = 188;BA.debugLine="Deghat = BtnCount.Text / 100000";
Debug.ShouldStop(134217728);
act_locationvisitor._deghat = RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_locationvisitor.mostCurrent._btncount.runMethod(true,"getText")),RemoteObject.createImmutable(100000)}, "/",0, 0);
 };
 BA.debugLineNum = 196;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e39) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_locationvisitor.processBA, e39.toString()); BA.debugLineNum = 198;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","544236856",BA.ObjectToString(act_locationvisitor.mostCurrent.__c.runMethod(false,"LastException",act_locationvisitor.mostCurrent.activityBA)),0);
 };
 };
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private gmap As GoogleMap";
act_locationvisitor.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private MapFragment1 As MapFragment";
act_locationvisitor.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private XUI As XUI";
act_locationvisitor.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 17;BA.debugLine="Private Dialog As B4XDialog";
act_locationvisitor.mostCurrent._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 18;BA.debugLine="Private Dialog1 As B4XDialog";
act_locationvisitor.mostCurrent._dialog1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 19;BA.debugLine="Private Base As B4XView";
act_locationvisitor.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private SearchTemplate As B4XSearchTemplate";
act_locationvisitor.mostCurrent._searchtemplate = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xsearchtemplate");
 //BA.debugLineNum = 21;BA.debugLine="Private Panel1 As Panel";
act_locationvisitor.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private BtnTa As Button";
act_locationvisitor.mostCurrent._btnta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Btn_SelVisitor As Button";
act_locationvisitor.mostCurrent._btn_selvisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim DateTa As String";
act_locationvisitor.mostCurrent._dateta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="Private pnlMap As Panel";
act_locationvisitor.mostCurrent._pnlmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private BtnCount As Button";
act_locationvisitor.mostCurrent._btncount = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim LstLocation As List";
act_locationvisitor.mostCurrent._lstlocation = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 29;BA.debugLine="Private PnlTop As Panel";
act_locationvisitor.mostCurrent._pnltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private BtnClearMap As Button";
act_locationvisitor.mostCurrent._btnclearmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private btnGetLocation As Button";
act_locationvisitor.mostCurrent._btngetlocation = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Dim points As List";
act_locationvisitor.mostCurrent._points = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 33;BA.debugLine="Public Deghat As Double";
act_locationvisitor._deghat = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 34;BA.debugLine="Private SB1 As SeekBar";
act_locationvisitor.mostCurrent._sb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SeekBarWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private BtnTimeAz As Button";
act_locationvisitor.mostCurrent._btntimeaz = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private BtnTimeTa As Button";
act_locationvisitor.mostCurrent._btntimeta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Dim mdtime As PersianMaterialTimePicker";
act_locationvisitor.mostCurrent._mdtime = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialTimePickerWrapper");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,265);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","lblback_click");}
 BA.debugLineNum = 265;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
act_locationvisitor.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _loaddata(RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("LoadData (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,70);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","loaddata", _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 70;BA.debugLine="Sub LoadData(lst As List)";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="If lst.Size>0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 72;BA.debugLine="LstLocation=lst";
Debug.ShouldStop(128);
act_locationvisitor.mostCurrent._lstlocation = _lst;
 BA.debugLineNum = 73;BA.debugLine="LoadMap";
Debug.ShouldStop(256);
_loadmap();
 };
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadmap() throws Exception{
try {
		Debug.PushSubsStack("LoadMap (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,77);
if (RapidSub.canDelegate("loadmap")) { ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","loadmap"); return;}
ResumableSub_LoadMap rsub = new ResumableSub_LoadMap(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadMap extends BA.ResumableSub {
public ResumableSub_LoadMap(ir.parsikhesab.pakhsh.act_locationvisitor parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_locationvisitor parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadMap (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,77);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 78;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionSt";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA),parent.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 79;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود ر";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 80;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 82;BA.debugLine="If MapFragment1.IsGooglePlayServicesAvailable = F";
Debug.ShouldStop(131072);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mapfragment1.runMethod(true,"IsGooglePlayServicesAvailable",act_locationvisitor.mostCurrent.activityBA),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 83;BA.debugLine="ToastMessageShow(\"Please install Google Play Ser";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please install Google Play Services.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 84;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 86;BA.debugLine="Sleep(100)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_locationvisitor.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_locationvisitor", "loadmap"),BA.numberCast(int.class, 100));
this.state = 21;
return;
case 21:
//C
this.state = 8;
;
 BA.debugLineNum = 87;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(4194304);
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 BA.debugLineNum = 88;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
Debug.ShouldStop(8388608);
parent._rp.runVoidMethod ("CheckAndRequest",act_locationvisitor.processBA,(Object)(parent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 89;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_locationvisitor.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_locationvisitor", "loadmap"), null);
this.state = 22;
return;
case 22:
//C
this.state = 8;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 90;BA.debugLine="If Result Then";
Debug.ShouldStop(33554432);
if (true) break;

case 8:
//if
this.state = 20;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 19;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 91;BA.debugLine="If LstLocation.Size>0 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._lstlocation.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 92;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(134217728);
parent.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 93;BA.debugLine="GetLocation";
Debug.ShouldStop(268435456);
_getlocation();
 if (true) break;
;
 BA.debugLineNum = 95;BA.debugLine="If pnlMap.Visible=False Then";
Debug.ShouldStop(1073741824);

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._pnlmap.runMethod(true,"getVisible"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 96;BA.debugLine="pnlMap.Visible=True";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._pnlmap.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 99;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","543909142",RemoteObject.createImmutable("No permission!"),0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _loadvisitor() throws Exception{
try {
		Debug.PushSubsStack("LoadVisitor (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,57);
if (RapidSub.canDelegate("loadvisitor")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","loadvisitor");}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 57;BA.debugLine="Sub LoadVisitor";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim Items As List";
Debug.ShouldStop(33554432);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 59;BA.debugLine="Items.Initialize";
Debug.ShouldStop(67108864);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 60;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(134217728);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_locationvisitor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblVisitor ")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 61;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(268435456);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 62;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(536870912);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 63;BA.debugLine="Dim Name As String =  Cu.GetString(\"FldN_Visitor";
Debug.ShouldStop(1073741824);
act_locationvisitor._name = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Visitor")));
 BA.debugLineNum = 64;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(-2147483648);
_items.runVoidMethod ("Add",(Object)((act_locationvisitor._name)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 66;BA.debugLine="SearchTemplate.SetItems(Items)";
Debug.ShouldStop(2);
act_locationvisitor.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 67;BA.debugLine="SearchTemplate.GetPanel(Dialog).BringToFront";
Debug.ShouldStop(4);
act_locationvisitor.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_getpanel" /*RemoteObject*/ ,(Object)(act_locationvisitor.mostCurrent._dialog)).runVoidMethod ("BringToFront");
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
public static RemoteObject  _mdtime_ontimeset(RemoteObject _hourofday,RemoteObject _minute) throws Exception{
try {
		Debug.PushSubsStack("mdtime_onTimeSet (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,121);
if (RapidSub.canDelegate("mdtime_ontimeset")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","mdtime_ontimeset", _hourofday, _minute);}
Debug.locals.put("hourOfday", _hourofday);
Debug.locals.put("minute", _minute);
 BA.debugLineNum = 121;BA.debugLine="Private Sub mdtime_onTimeSet(hourOfday As Int,minu";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("p1_onCancel (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,258);
if (RapidSub.canDelegate("p1_oncancel")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","p1_oncancel");}
 BA.debugLineNum = 258;BA.debugLine="Sub p1_onCancel";
Debug.ShouldStop(2);
 BA.debugLineNum = 259;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(4);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","544498945",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("p1_onDateSet (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,248);
if (RapidSub.canDelegate("p1_ondateset")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","p1_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 248;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 249;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(16777216);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","544433409",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 250;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(33554432);
act_locationvisitor.mostCurrent._btnta.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_locationvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_locationvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 251;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
Debug.ShouldStop(67108864);
act_locationvisitor.mostCurrent._btnta.runMethod(false,"setTag",(RemoteObject.concat(_year,act_locationvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_locationvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 255;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(1073741824);
act_locationvisitor.mostCurrent._dateta = RemoteObject.concat(_year,act_locationvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_locationvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 256;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
Debug.ShouldStop(-2147483648);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","544433416",act_locationvisitor.mostCurrent._dateta,act_locationvisitor.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("p1_onDismiss (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,261);
if (RapidSub.canDelegate("p1_ondismiss")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","p1_ondismiss");}
 BA.debugLineNum = 261;BA.debugLine="Sub p1_onDismiss";
Debug.ShouldStop(16);
 BA.debugLineNum = 262;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(32);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","544564481",RemoteObject.createImmutable("dismiss"),0);
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 7;BA.debugLine="Private rp As RuntimePermissions";
act_locationvisitor._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 8;BA.debugLine="Dim Location As Location";
act_locationvisitor._location = RemoteObject.createNew ("anywheresoftware.b4a.gps.LocationWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Dim Name As String";
act_locationvisitor._name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sb1_valuechanged(RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("SB1_ValueChanged (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,360);
if (RapidSub.canDelegate("sb1_valuechanged")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","sb1_valuechanged", _value, _userchanged);}
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 360;BA.debugLine="Private Sub SB1_ValueChanged (Value As Int, UserCh";
Debug.ShouldStop(128);
 BA.debugLineNum = 361;BA.debugLine="If UserChanged Then";
Debug.ShouldStop(256);
if (_userchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 362;BA.debugLine="BtnCount.Text=SB1.Value";
Debug.ShouldStop(512);
act_locationvisitor.mostCurrent._btncount.runMethod(true,"setText",BA.ObjectToCharSequence(act_locationvisitor.mostCurrent._sb1.runMethod(true,"getValue")));
 BA.debugLineNum = 363;BA.debugLine="Deghat=SB1.Value/100000";
Debug.ShouldStop(1024);
act_locationvisitor._deghat = RemoteObject.solve(new RemoteObject[] {act_locationvisitor.mostCurrent._sb1.runMethod(true,"getValue"),RemoteObject.createImmutable(100000)}, "/",0, 0);
 };
 BA.debugLineNum = 366;BA.debugLine="SB1.Max = 200";
Debug.ShouldStop(8192);
act_locationvisitor.mostCurrent._sb1.runMethod(true,"setMax",BA.numberCast(int.class, 200));
 BA.debugLineNum = 367;BA.debugLine="If BtnCount.Text = \"\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_locationvisitor.mostCurrent._btncount.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 368;BA.debugLine="BtnCount.Text = 1";
Debug.ShouldStop(32768);
act_locationvisitor.mostCurrent._btncount.runMethod(true,"setText",BA.ObjectToCharSequence(1));
 };
 BA.debugLineNum = 370;BA.debugLine="If BtnCount.Text <= 200 And BtnCount.Text >= 1 Th";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, act_locationvisitor.mostCurrent._btncount.runMethod(true,"getText")),BA.numberCast(double.class, 200)) && RemoteObject.solveBoolean("g",BA.numberCast(double.class, act_locationvisitor.mostCurrent._btncount.runMethod(true,"getText")),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 371;BA.debugLine="SB1.Value = BtnCount.Text";
Debug.ShouldStop(262144);
act_locationvisitor.mostCurrent._sb1.runMethod(true,"setValue",BA.numberCast(int.class, act_locationvisitor.mostCurrent._btncount.runMethod(true,"getText")));
 BA.debugLineNum = 372;BA.debugLine="Deghat = SB1.Value / 100000";
Debug.ShouldStop(524288);
act_locationvisitor._deghat = RemoteObject.solve(new RemoteObject[] {act_locationvisitor.mostCurrent._sb1.runMethod(true,"getValue"),RemoteObject.createImmutable(100000)}, "/",0, 0);
 }else {
 BA.debugLineNum = 374;BA.debugLine="ToastMessageShow(\"لطفا مقداری بین 1 تا 200 را وا";
Debug.ShouldStop(2097152);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا مقداری بین 1 تا 200 را وارد نمایید")),(Object)(act_locationvisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 375;BA.debugLine="BtnCount.Text = 200";
Debug.ShouldStop(4194304);
act_locationvisitor.mostCurrent._btncount.runMethod(true,"setText",BA.ObjectToCharSequence(200));
 };
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t1_oncancel() throws Exception{
try {
		Debug.PushSubsStack("t1_onCancel (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,391);
if (RapidSub.canDelegate("t1_oncancel")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","t1_oncancel");}
 BA.debugLineNum = 391;BA.debugLine="Private Sub t1_onCancel";
Debug.ShouldStop(64);
 BA.debugLineNum = 392;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(128);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","545219841",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 393;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t1_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("t1_onDismiss (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,394);
if (RapidSub.canDelegate("t1_ondismiss")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","t1_ondismiss");}
 BA.debugLineNum = 394;BA.debugLine="Private Sub t1_onDismiss";
Debug.ShouldStop(512);
 BA.debugLineNum = 395;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(1024);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","545285377",RemoteObject.createImmutable("dismiss"),0);
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t1_ontimeset(RemoteObject _hourofday,RemoteObject _minute) throws Exception{
try {
		Debug.PushSubsStack("t1_onTimeSet (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,397);
if (RapidSub.canDelegate("t1_ontimeset")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","t1_ontimeset", _hourofday, _minute);}
Debug.locals.put("hourOfday", _hourofday);
Debug.locals.put("minute", _minute);
 BA.debugLineNum = 397;BA.debugLine="Private Sub t1_onTimeSet(hourOfday As Int,minute A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 398;BA.debugLine="Log(\"time1 : \"&hourOfday&\":\"&minute)";
Debug.ShouldStop(8192);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","545350913",RemoteObject.concat(RemoteObject.createImmutable("time1 : "),_hourofday,RemoteObject.createImmutable(":"),_minute),0);
 BA.debugLineNum = 401;BA.debugLine="BtnTimeAz.Text=MCode.ConvertNumToTime2(hourOfday,";
Debug.ShouldStop(65536);
act_locationvisitor.mostCurrent._btntimeaz.runMethod(true,"setText",BA.ObjectToCharSequence(act_locationvisitor.mostCurrent._mcode.runMethod(true,"_convertnumtotime2" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA,(Object)(BA.NumberToString(_hourofday)),(Object)(BA.NumberToString(_minute)))));
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t2_oncancel() throws Exception{
try {
		Debug.PushSubsStack("t2_onCancel (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,414);
if (RapidSub.canDelegate("t2_oncancel")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","t2_oncancel");}
 BA.debugLineNum = 414;BA.debugLine="Private Sub t2_onCancel";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 415;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(1073741824);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","545481985",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t2_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("t2_onDismiss (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,417);
if (RapidSub.canDelegate("t2_ondismiss")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","t2_ondismiss");}
 BA.debugLineNum = 417;BA.debugLine="Private Sub t2_onDismiss";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(2);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","545547521",RemoteObject.createImmutable("dismiss"),0);
 BA.debugLineNum = 419;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t2_ontimeset(RemoteObject _hourofday,RemoteObject _minute) throws Exception{
try {
		Debug.PushSubsStack("t2_onTimeSet (act_locationvisitor) ","act_locationvisitor",21,act_locationvisitor.mostCurrent.activityBA,act_locationvisitor.mostCurrent,420);
if (RapidSub.canDelegate("t2_ontimeset")) { return ir.parsikhesab.pakhsh.act_locationvisitor.remoteMe.runUserSub(false, "act_locationvisitor","t2_ontimeset", _hourofday, _minute);}
Debug.locals.put("hourOfday", _hourofday);
Debug.locals.put("minute", _minute);
 BA.debugLineNum = 420;BA.debugLine="Private Sub t2_onTimeSet(hourOfday As Int,minute A";
Debug.ShouldStop(8);
 BA.debugLineNum = 421;BA.debugLine="Log(\"time2 : \"&hourOfday&\":\"&minute)";
Debug.ShouldStop(16);
act_locationvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","545613057",RemoteObject.concat(RemoteObject.createImmutable("time2 : "),_hourofday,RemoteObject.createImmutable(":"),_minute),0);
 BA.debugLineNum = 424;BA.debugLine="BtnTimeTa.Text=MCode.ConvertNumToTime2(hourOfday,";
Debug.ShouldStop(128);
act_locationvisitor.mostCurrent._btntimeta.runMethod(true,"setText",BA.ObjectToCharSequence(act_locationvisitor.mostCurrent._mcode.runMethod(true,"_convertnumtotime2" /*RemoteObject*/ ,act_locationvisitor.mostCurrent.activityBA,(Object)(BA.NumberToString(_hourofday)),(Object)(BA.NumberToString(_minute)))));
 BA.debugLineNum = 425;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}