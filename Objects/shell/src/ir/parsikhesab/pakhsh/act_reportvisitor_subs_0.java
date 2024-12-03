package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_reportvisitor_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,38);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","activity_create", _firsttime);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _name = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"L_ReportVisitor\")";
Debug.ShouldStop(64);
act_reportvisitor.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_ReportVisitor")),act_reportvisitor.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="LstReport.Initialize";
Debug.ShouldStop(128);
act_reportvisitor.mostCurrent._lstreport.runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="Base = Activity";
Debug.ShouldStop(524288);
act_reportvisitor.mostCurrent._base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_reportvisitor.mostCurrent._activity.getObject());
 BA.debugLineNum = 53;BA.debugLine="Dialog.Initialize (Panel1)";
Debug.ShouldStop(1048576);
act_reportvisitor.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_reportvisitor.mostCurrent._panel1.getObject()));
 BA.debugLineNum = 54;BA.debugLine="Dialog.Title = \"جستجو\"";
Debug.ShouldStop(2097152);
act_reportvisitor.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("جستجو")));
 BA.debugLineNum = 55;BA.debugLine="SearchTemplate.Initialize";
Debug.ShouldStop(4194304);
act_reportvisitor.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="Dim Items As List";
Debug.ShouldStop(8388608);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 57;BA.debugLine="Items.Initialize";
Debug.ShouldStop(16777216);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 58;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(33554432);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_reportvisitor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblAshkhas ")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 59;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(67108864);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(134217728);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 61;BA.debugLine="Dim Name As String =  Cu.GetString(\"fldSharheTaf";
Debug.ShouldStop(268435456);
_name = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili")));Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 62;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(536870912);
_items.runVoidMethod ("Add",(Object)((_name)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 64;BA.debugLine="SearchTemplate.SetItems(Items)";
Debug.ShouldStop(-2147483648);
act_reportvisitor.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 65;BA.debugLine="SearchTemplate.GetPanel(Dialog).BringToFront";
Debug.ShouldStop(1);
act_reportvisitor.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_getpanel" /*RemoteObject*/ ,(Object)(act_reportvisitor.mostCurrent._dialog)).runVoidMethod ("BringToFront");
 BA.debugLineNum = 66;BA.debugLine="Btn_show.Visible=False";
Debug.ShouldStop(2);
act_reportvisitor.mostCurrent._btn_show.runMethod(true,"setVisible",act_reportvisitor.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 67;BA.debugLine="MCode.CodeMoshtariSelect=0";
Debug.ShouldStop(4);
act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/  = BA.NumberToString(0);
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,70);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_reportvisitor.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 72;BA.debugLine="Activity.Finish";
Debug.ShouldStop(128);
act_reportvisitor.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 74;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return act_reportvisitor.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 76;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return act_reportvisitor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,83);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 83;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Resume (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,79);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","activity_resume");}
 BA.debugLineNum = 79;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("AnimateDialog (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,297);
if (RapidSub.canDelegate("animatedialog")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","animatedialog", _dlg, _fromedge);}
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
Debug.locals.put("dlg", _dlg);
Debug.locals.put("FromEdge", _fromedge);
 BA.debugLineNum = 297;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="Dim Base As B4XView = dlg.Base";
Debug.ShouldStop(512);
act_reportvisitor.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
act_reportvisitor.mostCurrent._base = _dlg.getField(false,"_base" /*RemoteObject*/ );
 BA.debugLineNum = 299;BA.debugLine="Dim top As Int = Base.Top";
Debug.ShouldStop(1024);
_top = act_reportvisitor.mostCurrent._base.runMethod(true,"getTop");Debug.locals.put("top", _top);Debug.locals.put("top", _top);
 BA.debugLineNum = 300;BA.debugLine="Dim left As Int = Base.Left";
Debug.ShouldStop(2048);
_left = act_reportvisitor.mostCurrent._base.runMethod(true,"getLeft");Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 301;BA.debugLine="Select FromEdge.ToLowerCase";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(_fromedge.runMethod(true,"toLowerCase"),BA.ObjectToString("bottom"),BA.ObjectToString("top"),BA.ObjectToString("left"),BA.ObjectToString("right"))) {
case 0: {
 BA.debugLineNum = 303;BA.debugLine="Base.Top = Base.Parent.Height";
Debug.ShouldStop(16384);
act_reportvisitor.mostCurrent._base.runMethod(true,"setTop",act_reportvisitor.mostCurrent._base.runMethod(false,"getParent").runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 305;BA.debugLine="Base.Top = -Base.Height";
Debug.ShouldStop(65536);
act_reportvisitor.mostCurrent._base.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + act_reportvisitor.mostCurrent._base.runMethod(true,"getHeight").<Integer>get().intValue())));
 break; }
case 2: {
 BA.debugLineNum = 307;BA.debugLine="Base.Left = -Base.Width";
Debug.ShouldStop(262144);
act_reportvisitor.mostCurrent._base.runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + act_reportvisitor.mostCurrent._base.runMethod(true,"getWidth").<Integer>get().intValue())));
 break; }
case 3: {
 BA.debugLineNum = 309;BA.debugLine="Base.Left = Base.Parent.Width";
Debug.ShouldStop(1048576);
act_reportvisitor.mostCurrent._base.runMethod(true,"setLeft",act_reportvisitor.mostCurrent._base.runMethod(false,"getParent").runMethod(true,"getWidth"));
 break; }
}
;
 BA.debugLineNum = 311;BA.debugLine="Base.SetLayoutAnimated(300, left, top, Base.Width";
Debug.ShouldStop(4194304);
act_reportvisitor.mostCurrent._base.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(_left),(Object)(_top),(Object)(act_reportvisitor.mostCurrent._base.runMethod(true,"getWidth")),(Object)(act_reportvisitor.mostCurrent._base.runMethod(true,"getHeight")));
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
public static void  _btn_selashkhas_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_SelAshkhas_Click (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,273);
if (RapidSub.canDelegate("btn_selashkhas_click")) { ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","btn_selashkhas_click"); return;}
ResumableSub_Btn_SelAshkhas_Click rsub = new ResumableSub_Btn_SelAshkhas_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_SelAshkhas_Click extends BA.ResumableSub {
public ResumableSub_Btn_SelAshkhas_Click(ir.parsikhesab.pakhsh.act_reportvisitor parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_reportvisitor parent;
RemoteObject _rs = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_SelAshkhas_Click (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,273);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 274;BA.debugLine="Btn_show.Visible=False";
Debug.ShouldStop(131072);
parent.mostCurrent._btn_show.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 275;BA.debugLine="Panel1.BringToFront";
Debug.ShouldStop(262144);
parent.mostCurrent._panel1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 276;BA.debugLine="Panel1.Visible=True";
Debug.ShouldStop(524288);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 277;BA.debugLine="SearchTemplate.SearchField.HintText=\"نام مشتری\"";
Debug.ShouldStop(1048576);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString("نام مشتری"));
 BA.debugLineNum = 278;BA.debugLine="SearchTemplate.SearchField.lblClear.Text=\"\"";
Debug.ShouldStop(2097152);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 279;BA.debugLine="SearchTemplate.SearchField.lblV.Text=\"\"";
Debug.ShouldStop(4194304);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 280;BA.debugLine="SearchTemplate.SearchField.Update";
Debug.ShouldStop(8388608);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 281;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
Debug.ShouldStop(16777216);
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._searchtemplate)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("انصراف"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 282;BA.debugLine="AnimateDialog(Dialog, \"right\")";
Debug.ShouldStop(33554432);
_animatedialog(parent.mostCurrent._dialog,RemoteObject.createImmutable("right"));
 BA.debugLineNum = 283;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_reportvisitor.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_reportvisitor", "btn_selashkhas_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 284;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 285;BA.debugLine="Btn_SelAshkhas.Text = SearchTemplate.SelectedIte";
Debug.ShouldStop(268435456);
parent.mostCurrent._btn_selashkhas.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate.getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 286;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(536870912);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas where fldSharheTafzili='"),parent.mostCurrent._btn_selashkhas.runMethod(true,"getText"),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 287;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(1073741824);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 288;BA.debugLine="MCode.CodeMoshtariSelect =  Cu.GetString(\"fldCod";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/  = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili")));
 BA.debugLineNum = 289;BA.debugLine="Log(\"کد مشتری : \"&Cu.GetString(\"fldCodetafzili\")";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","564552976",RemoteObject.concat(RemoteObject.createImmutable("کد مشتری : "),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili")))),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 291;BA.debugLine="Btn_SelAshkhas.Text = \"انتخاب مشتری\"";
Debug.ShouldStop(4);
parent.mostCurrent._btn_selashkhas.runMethod(true,"setText",BA.ObjectToCharSequence("انتخاب مشتری"));
 BA.debugLineNum = 292;BA.debugLine="MCode.CodeMoshtariSelect=0";
Debug.ShouldStop(8);
parent.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/  = BA.NumberToString(0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 294;BA.debugLine="Panel1.Visible=False";
Debug.ShouldStop(32);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static RemoteObject  _btn_show_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_show_Click (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,314);
if (RapidSub.canDelegate("btn_show_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","btn_show_click");}
 BA.debugLineNum = 314;BA.debugLine="Sub Btn_show_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="Act_RepFactors.CodeMoshtari=MCode.CodeMoshtariSel";
Debug.ShouldStop(67108864);
act_reportvisitor.mostCurrent._act_repfactors._codemoshtari /*RemoteObject*/  = act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ;
 BA.debugLineNum = 316;BA.debugLine="Act_RepFactors.DateAz=DateAz";
Debug.ShouldStop(134217728);
act_reportvisitor.mostCurrent._act_repfactors._dateaz /*RemoteObject*/  = act_reportvisitor.mostCurrent._dateaz;
 BA.debugLineNum = 317;BA.debugLine="Act_RepFactors.DateTa=DateTa";
Debug.ShouldStop(268435456);
act_reportvisitor.mostCurrent._act_repfactors._dateta /*RemoteObject*/  = act_reportvisitor.mostCurrent._dateta;
 BA.debugLineNum = 318;BA.debugLine="Act_RepFactors.TotalFactor=LblSumKhales.Text";
Debug.ShouldStop(536870912);
act_reportvisitor.mostCurrent._act_repfactors._totalfactor /*RemoteObject*/  = act_reportvisitor.mostCurrent._lblsumkhales.runMethod(true,"getText");
 BA.debugLineNum = 319;BA.debugLine="StartActivity(Act_RepFactors)";
Debug.ShouldStop(1073741824);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("StartActivity",act_reportvisitor.processBA,(Object)((act_reportvisitor.mostCurrent._act_repfactors.getObject())));
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaz_click() throws Exception{
try {
		Debug.PushSubsStack("BtnAz_Click (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,87);
if (RapidSub.canDelegate("btnaz_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","btnaz_click");}
RemoteObject _p = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 87;BA.debugLine="Sub BtnAz_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Dim p As PersianMaterialDatePicker";
Debug.ShouldStop(8388608);
_p = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 89;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
Debug.ShouldStop(16777216);
_p.runVoidMethod ("Initialize",act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString("p")),(Object)(_p.runMethod(true,"getPersianYear")),(Object)(_p.runMethod(true,"getPersianMonth")),(Object)(_p.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 90;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(33554432);
_p.runMethod(true,"setAccentColor",act_reportvisitor.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 91;BA.debugLine="p.OkText = \"تایید\"";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 92;BA.debugLine="p.CancelText = \"لغو\"";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 93;BA.debugLine="p.Title = \"از تاریخ\"";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("setTitle",BA.ObjectToString("از تاریخ"));
 BA.debugLineNum = 94;BA.debugLine="p.Typeface = \"iransansmonospacednum.ttf\"";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmonospacednum.ttf"));
 BA.debugLineNum = 95;BA.debugLine="p.Show(\"p\")";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p")));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("BtnReport_Click (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,140);
if (RapidSub.canDelegate("btnreport_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","btnreport_click");}
 BA.debugLineNum = 140;BA.debugLine="Sub BtnReport_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="LblSumForoosh.Text = \"0\"";
Debug.ShouldStop(4096);
act_reportvisitor.mostCurrent._lblsumforoosh.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 BA.debugLineNum = 142;BA.debugLine="LblSumBargasht.Text = \"0\"";
Debug.ShouldStop(8192);
act_reportvisitor.mostCurrent._lblsumbargasht.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 BA.debugLineNum = 143;BA.debugLine="LblTedadEshantion.Text = \"0\"";
Debug.ShouldStop(16384);
act_reportvisitor.mostCurrent._lbltedadeshantion.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 BA.debugLineNum = 144;BA.debugLine="LblSumKhales.Text = \"0\"";
Debug.ShouldStop(32768);
act_reportvisitor.mostCurrent._lblsumkhales.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 BA.debugLineNum = 145;BA.debugLine="If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(B";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",act_reportvisitor.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._btnaz.runMethod(false,"getTag")))),BA.numberCast(long.class, 8)) && RemoteObject.solveBoolean("=",act_reportvisitor.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._btnta.runMethod(false,"getTag")))),BA.numberCast(long.class, 8))) { 
 BA.debugLineNum = 147;BA.debugLine="ProgressDialogShow2(\"لطفا صبر کنید . . .\",False)";
Debug.ShouldStop(262144);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("لطفا صبر کنید . . .")),(Object)(act_reportvisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 149;BA.debugLine="LoadData";
Debug.ShouldStop(1048576);
_loaddata();
 }else {
 BA.debugLineNum = 151;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
Debug.ShouldStop(4194304);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید")),(Object)(act_reportvisitor.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("BtnTa_Click (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,113);
if (RapidSub.canDelegate("btnta_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","btnta_click");}
RemoteObject _p1 = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 113;BA.debugLine="Sub BtnTa_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
Debug.ShouldStop(131072);
_p1 = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 115;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
Debug.ShouldStop(262144);
_p1.runVoidMethod ("Initialize",act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString("p1")),(Object)(_p1.runMethod(true,"getPersianYear")),(Object)(_p1.runMethod(true,"getPersianMonth")),(Object)(_p1.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 116;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(524288);
_p1.runMethod(true,"setAccentColor",act_reportvisitor.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 117;BA.debugLine="p1.OkText = \"تایید\"";
Debug.ShouldStop(1048576);
_p1.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 118;BA.debugLine="p1.CancelText = \"لغو\"";
Debug.ShouldStop(2097152);
_p1.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 119;BA.debugLine="p1.Title = \"تا تاریخ\"";
Debug.ShouldStop(4194304);
_p1.runVoidMethod ("setTitle",BA.ObjectToString("تا تاریخ"));
 BA.debugLineNum = 120;BA.debugLine="p1.Typeface = \"iransansmonospacednum.ttf\"";
Debug.ShouldStop(8388608);
_p1.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmonospacednum.ttf"));
 BA.debugLineNum = 121;BA.debugLine="p1.Show(\"p1\")";
Debug.ShouldStop(16777216);
_p1.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p1")));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
 //BA.debugLineNum = 11;BA.debugLine="Private Dialog As B4XDialog";
act_reportvisitor.mostCurrent._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 12;BA.debugLine="Private XUI As XUI";
act_reportvisitor.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 13;BA.debugLine="Private Base As B4XView";
act_reportvisitor.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private SearchTemplate As B4XSearchTemplate";
act_reportvisitor.mostCurrent._searchtemplate = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xsearchtemplate");
 //BA.debugLineNum = 15;BA.debugLine="Dim MPD As ManamPersianDate";
act_reportvisitor.mostCurrent._mpd = RemoteObject.createNew ("com.b4a.manamsoftware.PersianDate.ManamPersianDate");
 //BA.debugLineNum = 18;BA.debugLine="Private BtnReport As Button";
act_reportvisitor.mostCurrent._btnreport = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private BtnTa As Button";
act_reportvisitor.mostCurrent._btnta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private BtnAz As Button";
act_reportvisitor.mostCurrent._btnaz = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim DateAz,DateTa As String";
act_reportvisitor.mostCurrent._dateaz = RemoteObject.createImmutable("");
act_reportvisitor.mostCurrent._dateta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Private Btn_SelAshkhas As Button";
act_reportvisitor.mostCurrent._btn_selashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Panel1 As Panel";
act_reportvisitor.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Btn_show As Button";
act_reportvisitor.mostCurrent._btn_show = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim LstReport As List";
act_reportvisitor.mostCurrent._lstreport = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 28;BA.debugLine="Private LblSumForoosh As Label";
act_reportvisitor.mostCurrent._lblsumforoosh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private LblTedadEshantion As Label";
act_reportvisitor.mostCurrent._lbltedadeshantion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private LblSumBargasht As Label";
act_reportvisitor.mostCurrent._lblsumbargasht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private LblSumKhales As Label";
act_reportvisitor.mostCurrent._lblsumkhales = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private LblTedadForoosh As Label";
act_reportvisitor.mostCurrent._lbltedadforoosh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private LblTedadBargasht As Label";
act_reportvisitor.mostCurrent._lbltedadbargasht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private LblTedadSefaresh As Label";
act_reportvisitor.mostCurrent._lbltedadsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private LblSumSefaresh As Label";
act_reportvisitor.mostCurrent._lblsumsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,393);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","lblback_click");}
 BA.debugLineNum = 393;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 394;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
act_reportvisitor.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("LoadData (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,156);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","loaddata");}
RemoteObject _hasreport = RemoteObject.createImmutable("");
RemoteObject _fldfeejoz = RemoteObject.createImmutable("");
RemoteObject _fldfeebargasht = RemoteObject.createImmutable("");
RemoteObject _fldtedadeshantionjoz = RemoteObject.createImmutable("");
RemoteObject _fldtedadeshantionkol = RemoteObject.createImmutable("");
RemoteObject _fldtedadjozforoosh = RemoteObject.createImmutable("");
RemoteObject _fldtedadkolforoosh = RemoteObject.createImmutable("");
RemoteObject _fldtedadjozbargasht = RemoteObject.createImmutable("");
RemoteObject _fldtedadkolbargasht = RemoteObject.createImmutable("");
RemoteObject _fldsumkhales = RemoteObject.createImmutable("");
RemoteObject _fldfeejozsefaresh = RemoteObject.createImmutable("");
RemoteObject _fldtedadjozsefaresh = RemoteObject.createImmutable("");
RemoteObject _fldtedadkolsefaresh = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 156;BA.debugLine="Sub LoadData";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 158;BA.debugLine="LstReport.Clear";
Debug.ShouldStop(536870912);
act_reportvisitor.mostCurrent._lstreport.runVoidMethod ("Clear");
 BA.debugLineNum = 159;BA.debugLine="Dim hasreport As String=0";
Debug.ShouldStop(1073741824);
_hasreport = BA.NumberToString(0);Debug.locals.put("hasreport", _hasreport);Debug.locals.put("hasreport", _hasreport);
 BA.debugLineNum = 161;BA.debugLine="Dim fldFeeJoz As String=0";
Debug.ShouldStop(1);
_fldfeejoz = BA.NumberToString(0);Debug.locals.put("fldFeeJoz", _fldfeejoz);Debug.locals.put("fldFeeJoz", _fldfeejoz);
 BA.debugLineNum = 162;BA.debugLine="Dim fldFeeBargasht As String=0";
Debug.ShouldStop(2);
_fldfeebargasht = BA.NumberToString(0);Debug.locals.put("fldFeeBargasht", _fldfeebargasht);Debug.locals.put("fldFeeBargasht", _fldfeebargasht);
 BA.debugLineNum = 163;BA.debugLine="Dim fldTedadEshantionJoz As String=0";
Debug.ShouldStop(4);
_fldtedadeshantionjoz = BA.NumberToString(0);Debug.locals.put("fldTedadEshantionJoz", _fldtedadeshantionjoz);Debug.locals.put("fldTedadEshantionJoz", _fldtedadeshantionjoz);
 BA.debugLineNum = 164;BA.debugLine="Dim fldTedadEshantionKol As String=0";
Debug.ShouldStop(8);
_fldtedadeshantionkol = BA.NumberToString(0);Debug.locals.put("fldTedadEshantionKol", _fldtedadeshantionkol);Debug.locals.put("fldTedadEshantionKol", _fldtedadeshantionkol);
 BA.debugLineNum = 165;BA.debugLine="Dim fldTedadJozForoosh As String=0";
Debug.ShouldStop(16);
_fldtedadjozforoosh = BA.NumberToString(0);Debug.locals.put("fldTedadJozForoosh", _fldtedadjozforoosh);Debug.locals.put("fldTedadJozForoosh", _fldtedadjozforoosh);
 BA.debugLineNum = 166;BA.debugLine="Dim fldTedadKolForoosh As String=0";
Debug.ShouldStop(32);
_fldtedadkolforoosh = BA.NumberToString(0);Debug.locals.put("fldTedadKolForoosh", _fldtedadkolforoosh);Debug.locals.put("fldTedadKolForoosh", _fldtedadkolforoosh);
 BA.debugLineNum = 167;BA.debugLine="Dim fldTedadJozBargasht As String=0";
Debug.ShouldStop(64);
_fldtedadjozbargasht = BA.NumberToString(0);Debug.locals.put("fldTedadJozBargasht", _fldtedadjozbargasht);Debug.locals.put("fldTedadJozBargasht", _fldtedadjozbargasht);
 BA.debugLineNum = 168;BA.debugLine="Dim fldTedadKolBargasht As String=0";
Debug.ShouldStop(128);
_fldtedadkolbargasht = BA.NumberToString(0);Debug.locals.put("fldTedadKolBargasht", _fldtedadkolbargasht);Debug.locals.put("fldTedadKolBargasht", _fldtedadkolbargasht);
 BA.debugLineNum = 169;BA.debugLine="Dim fldSumKhales As String=0";
Debug.ShouldStop(256);
_fldsumkhales = BA.NumberToString(0);Debug.locals.put("fldSumKhales", _fldsumkhales);Debug.locals.put("fldSumKhales", _fldsumkhales);
 BA.debugLineNum = 170;BA.debugLine="Dim fldFeeJozSefaresh As String=0";
Debug.ShouldStop(512);
_fldfeejozsefaresh = BA.NumberToString(0);Debug.locals.put("fldFeeJozSefaresh", _fldfeejozsefaresh);Debug.locals.put("fldFeeJozSefaresh", _fldfeejozsefaresh);
 BA.debugLineNum = 171;BA.debugLine="Dim fldTedadJozSefaresh  As String=0";
Debug.ShouldStop(1024);
_fldtedadjozsefaresh = BA.NumberToString(0);Debug.locals.put("fldTedadJozSefaresh", _fldtedadjozsefaresh);Debug.locals.put("fldTedadJozSefaresh", _fldtedadjozsefaresh);
 BA.debugLineNum = 172;BA.debugLine="Dim fldTedadKolSefaresh As String=0";
Debug.ShouldStop(2048);
_fldtedadkolsefaresh = BA.NumberToString(0);Debug.locals.put("fldTedadKolSefaresh", _fldtedadkolsefaresh);Debug.locals.put("fldTedadKolSefaresh", _fldtedadkolsefaresh);
 BA.debugLineNum = 173;BA.debugLine="If MCode.CodeMoshtariSelect=0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 174;BA.debugLine="fldTedadJozSefaresh=myCode.Is_Null_adad(MCode.S";
Debug.ShouldStop(8192);
_fldtedadjozsefaresh = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldDate between "),act_reportvisitor.mostCurrent._dateaz,RemoteObject.createImmutable(" and "),act_reportvisitor.mostCurrent._dateta))))));Debug.locals.put("fldTedadJozSefaresh", _fldtedadjozsefaresh);
 BA.debugLineNum = 175;BA.debugLine="fldTedadKolSefaresh=myCode.Is_Null_adad(MCode.S";
Debug.ShouldStop(16384);
_fldtedadkolsefaresh = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldDate between "),act_reportvisitor.mostCurrent._dateaz,RemoteObject.createImmutable(" and "),act_reportvisitor.mostCurrent._dateta))))));Debug.locals.put("fldTedadKolSefaresh", _fldtedadkolsefaresh);
 BA.debugLineNum = 176;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select distinct";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_reportvisitor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldDate between "),act_reportvisitor.mostCurrent._dateaz,RemoteObject.createImmutable(" and "),act_reportvisitor.mostCurrent._dateta)));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 177;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 178;BA.debugLine="For  i=0 To cu.RowCount-1";
Debug.ShouldStop(131072);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21) ;_i = ((int)(0 + _i + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 179;BA.debugLine="cu.Position=i";
Debug.ShouldStop(262144);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 180;BA.debugLine="fldFeeJozSefaresh =fldFeeJozSefaresh+ myCode.";
Debug.ShouldStop(524288);
_fldfeejozsefaresh = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldfeejozsefaresh),BA.numberCast(double.class, act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))))))}, "+",1, 0));Debug.locals.put("fldFeeJozSefaresh", _fldfeejozsefaresh);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 182;BA.debugLine="hasreport=1";
Debug.ShouldStop(2097152);
_hasreport = BA.NumberToString(1);Debug.locals.put("hasreport", _hasreport);
 };
 BA.debugLineNum = 185;BA.debugLine="fldTedadJozForoosh=myCode.Is_Null_adad(MCode.Si";
Debug.ShouldStop(16777216);
_fldtedadjozforoosh = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldDate between "),act_reportvisitor.mostCurrent._dateaz,RemoteObject.createImmutable(" and "),act_reportvisitor.mostCurrent._dateta))))));Debug.locals.put("fldTedadJozForoosh", _fldtedadjozforoosh);
 BA.debugLineNum = 186;BA.debugLine="fldTedadKolForoosh=myCode.Is_Null_adad(MCode.Si";
Debug.ShouldStop(33554432);
_fldtedadkolforoosh = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldDate between "),act_reportvisitor.mostCurrent._dateaz,RemoteObject.createImmutable(" and "),act_reportvisitor.mostCurrent._dateta))))));Debug.locals.put("fldTedadKolForoosh", _fldtedadkolforoosh);
 BA.debugLineNum = 187;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select distinct";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_reportvisitor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldDate between "),act_reportvisitor.mostCurrent._dateaz,RemoteObject.createImmutable(" and "),act_reportvisitor.mostCurrent._dateta)));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 188;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 189;BA.debugLine="For  i=0 To cu.RowCount-1";
Debug.ShouldStop(268435456);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 190;BA.debugLine="cu.Position=i";
Debug.ShouldStop(536870912);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 191;BA.debugLine="fldFeeJoz =fldFeeJoz+ myCode.Is_Null_adad(cu.";
Debug.ShouldStop(1073741824);
_fldfeejoz = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldfeejoz),BA.numberCast(double.class, act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))))))}, "+",1, 0));Debug.locals.put("fldFeeJoz", _fldfeejoz);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 193;BA.debugLine="hasreport=1";
Debug.ShouldStop(1);
_hasreport = BA.NumberToString(1);Debug.locals.put("hasreport", _hasreport);
 };
 BA.debugLineNum = 196;BA.debugLine="fldTedadJozBargasht=myCode.Is_Null_adad(MCode.S";
Debug.ShouldStop(8);
_fldtedadjozbargasht = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldDate between "),act_reportvisitor.mostCurrent._dateaz,RemoteObject.createImmutable(" and "),act_reportvisitor.mostCurrent._dateta))))));Debug.locals.put("fldTedadJozBargasht", _fldtedadjozbargasht);
 BA.debugLineNum = 197;BA.debugLine="fldTedadKolBargasht=myCode.Is_Null_adad(MCode.S";
Debug.ShouldStop(16);
_fldtedadkolbargasht = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldDate between "),act_reportvisitor.mostCurrent._dateaz,RemoteObject.createImmutable(" and "),act_reportvisitor.mostCurrent._dateta))))));Debug.locals.put("fldTedadKolBargasht", _fldtedadkolbargasht);
 BA.debugLineNum = 198;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select distinct";
Debug.ShouldStop(32);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_reportvisitor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldDate between "),act_reportvisitor.mostCurrent._dateaz,RemoteObject.createImmutable(" and "),act_reportvisitor.mostCurrent._dateta)));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 199;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 200;BA.debugLine="For  i=0 To cu.RowCount-1";
Debug.ShouldStop(128);
{
final int step41 = 1;
final int limit41 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step41 > 0 && _i <= limit41) || (step41 < 0 && _i >= limit41) ;_i = ((int)(0 + _i + step41))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 201;BA.debugLine="cu.Position=i";
Debug.ShouldStop(256);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 202;BA.debugLine="fldFeeBargasht =fldFeeBargasht+ myCode.Is_Nul";
Debug.ShouldStop(512);
_fldfeebargasht = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldfeebargasht),BA.numberCast(double.class, act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))))))}, "+",1, 0));Debug.locals.put("fldFeeBargasht", _fldfeebargasht);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 204;BA.debugLine="hasreport=1";
Debug.ShouldStop(2048);
_hasreport = BA.NumberToString(1);Debug.locals.put("hasreport", _hasreport);
 };
 }else {
 BA.debugLineNum = 208;BA.debugLine="fldTedadJozSefaresh=myCode.Is_Null_adad(MCode.S";
Debug.ShouldStop(32768);
_fldtedadjozsefaresh = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldC_Tafzili="),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ))),RemoteObject.createImmutable(" and FldDate between "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateaz))),RemoteObject.createImmutable("  and  "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateta))),RemoteObject.createImmutable(""))))))));Debug.locals.put("fldTedadJozSefaresh", _fldtedadjozsefaresh);
 BA.debugLineNum = 209;BA.debugLine="fldTedadKolSefaresh=myCode.Is_Null_adad(MCode.S";
Debug.ShouldStop(65536);
_fldtedadkolsefaresh = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldC_Tafzili="),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ))),RemoteObject.createImmutable(" and FldDate between "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateaz))),RemoteObject.createImmutable("  and  "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateta))),RemoteObject.createImmutable(""))))))));Debug.locals.put("fldTedadKolSefaresh", _fldtedadkolsefaresh);
 BA.debugLineNum = 210;BA.debugLine="Dim cu As Cursor=MCode.Result($\"select distinct";
Debug.ShouldStop(131072);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_reportvisitor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldC_Tafzili="),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ))),RemoteObject.createImmutable(" and FldDate between "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateaz))),RemoteObject.createImmutable("   and  "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateta))),RemoteObject.createImmutable("")))));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 211;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 212;BA.debugLine="For  i=0 To cu.RowCount-1";
Debug.ShouldStop(524288);
{
final int step52 = 1;
final int limit52 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step52 > 0 && _i <= limit52) || (step52 < 0 && _i >= limit52) ;_i = ((int)(0 + _i + step52))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 213;BA.debugLine="cu.Position=i";
Debug.ShouldStop(1048576);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 214;BA.debugLine="fldFeeJozSefaresh =fldFeeJozSefaresh+ myCode.";
Debug.ShouldStop(2097152);
_fldfeejozsefaresh = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldfeejozsefaresh),BA.numberCast(double.class, act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))))))}, "+",1, 0));Debug.locals.put("fldFeeJozSefaresh", _fldfeejozsefaresh);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 216;BA.debugLine="hasreport=1";
Debug.ShouldStop(8388608);
_hasreport = BA.NumberToString(1);Debug.locals.put("hasreport", _hasreport);
 };
 BA.debugLineNum = 219;BA.debugLine="fldTedadJozForoosh=myCode.Is_Null_adad(MCode.Si";
Debug.ShouldStop(67108864);
_fldtedadjozforoosh = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldC_Tafzili="),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ))),RemoteObject.createImmutable(" and FldDate between "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateaz))),RemoteObject.createImmutable("  and  "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateta))),RemoteObject.createImmutable(""))))))));Debug.locals.put("fldTedadJozForoosh", _fldtedadjozforoosh);
 BA.debugLineNum = 220;BA.debugLine="fldTedadKolForoosh=myCode.Is_Null_adad(MCode.Si";
Debug.ShouldStop(134217728);
_fldtedadkolforoosh = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldC_Tafzili="),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ))),RemoteObject.createImmutable(" and FldDate between "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateaz))),RemoteObject.createImmutable("  and  "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateta))),RemoteObject.createImmutable(""))))))));Debug.locals.put("fldTedadKolForoosh", _fldtedadkolforoosh);
 BA.debugLineNum = 221;BA.debugLine="Dim cu As Cursor=MCode.Result($\"select distinct";
Debug.ShouldStop(268435456);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_reportvisitor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldC_Tafzili="),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ))),RemoteObject.createImmutable(" and FldDate between "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateaz))),RemoteObject.createImmutable("   and  "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateta))),RemoteObject.createImmutable("")))));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 222;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 223;BA.debugLine="For  i=0 To cu.RowCount-1";
Debug.ShouldStop(1073741824);
{
final int step62 = 1;
final int limit62 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step62 > 0 && _i <= limit62) || (step62 < 0 && _i >= limit62) ;_i = ((int)(0 + _i + step62))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 224;BA.debugLine="cu.Position=i";
Debug.ShouldStop(-2147483648);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 225;BA.debugLine="fldFeeJoz =fldFeeJoz+ myCode.Is_Null_adad(cu.";
Debug.ShouldStop(1);
_fldfeejoz = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldfeejoz),BA.numberCast(double.class, act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))))))}, "+",1, 0));Debug.locals.put("fldFeeJoz", _fldfeejoz);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 227;BA.debugLine="hasreport=1";
Debug.ShouldStop(4);
_hasreport = BA.NumberToString(1);Debug.locals.put("hasreport", _hasreport);
 };
 BA.debugLineNum = 230;BA.debugLine="fldTedadJozBargasht=myCode.Is_Null_adad(MCode.S";
Debug.ShouldStop(32);
_fldtedadjozbargasht = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldC_Tafzili="),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ))),RemoteObject.createImmutable(" and FldDate between "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateaz))),RemoteObject.createImmutable("  and  "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateta))),RemoteObject.createImmutable(""))))))));Debug.locals.put("fldTedadJozBargasht", _fldtedadjozbargasht);
 BA.debugLineNum = 231;BA.debugLine="fldTedadKolBargasht=myCode.Is_Null_adad(MCode.S";
Debug.ShouldStop(64);
_fldtedadkolbargasht = act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldC_Tafzili="),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ))),RemoteObject.createImmutable(" and FldDate between "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateaz))),RemoteObject.createImmutable("  and  "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateta))),RemoteObject.createImmutable(""))))))));Debug.locals.put("fldTedadKolBargasht", _fldtedadkolbargasht);
 BA.debugLineNum = 232;BA.debugLine="Dim cu As Cursor=MCode.Result($\"select distinct";
Debug.ShouldStop(128);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_reportvisitor.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldC_Tafzili="),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ))),RemoteObject.createImmutable(" and FldDate between "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateaz))),RemoteObject.createImmutable("   and  "),act_reportvisitor.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_reportvisitor.mostCurrent._dateta))),RemoteObject.createImmutable("")))));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 233;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 234;BA.debugLine="For  i=0 To cu.RowCount-1";
Debug.ShouldStop(512);
{
final int step72 = 1;
final int limit72 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step72 > 0 && _i <= limit72) || (step72 < 0 && _i >= limit72) ;_i = ((int)(0 + _i + step72))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 235;BA.debugLine="cu.Position=i";
Debug.ShouldStop(1024);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 236;BA.debugLine="fldFeeBargasht =fldFeeBargasht+ myCode.Is_Nul";
Debug.ShouldStop(2048);
_fldfeebargasht = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldfeebargasht),BA.numberCast(double.class, act_reportvisitor.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))))))}, "+",1, 0));Debug.locals.put("fldFeeBargasht", _fldfeebargasht);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 238;BA.debugLine="hasreport=1";
Debug.ShouldStop(8192);
_hasreport = BA.NumberToString(1);Debug.locals.put("hasreport", _hasreport);
 };
 };
 BA.debugLineNum = 243;BA.debugLine="LblTedadForoosh.Text= fldTedadJozForoosh &\" عدد";
Debug.ShouldStop(262144);
act_reportvisitor.mostCurrent._lbltedadforoosh.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_fldtedadjozforoosh,RemoteObject.createImmutable(" عدد و "),_fldtedadkolforoosh,RemoteObject.createImmutable(" کارتن "))));
 BA.debugLineNum = 244;BA.debugLine="LblTedadSefaresh.Text= fldTedadJozSefaresh &\" عد";
Debug.ShouldStop(524288);
act_reportvisitor.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_fldtedadjozsefaresh,RemoteObject.createImmutable(" عدد و "),_fldtedadkolsefaresh,RemoteObject.createImmutable(" کارتن "))));
 BA.debugLineNum = 245;BA.debugLine="LblTedadBargasht.Text= fldTedadJozBargasht &\" عد";
Debug.ShouldStop(1048576);
act_reportvisitor.mostCurrent._lbltedadbargasht.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_fldtedadjozbargasht,RemoteObject.createImmutable(" عدد و "),_fldtedadkolbargasht,RemoteObject.createImmutable(" کارتن "))));
 BA.debugLineNum = 246;BA.debugLine="LblTedadEshantion.Text= fldTedadEshantionJoz &\"";
Debug.ShouldStop(2097152);
act_reportvisitor.mostCurrent._lbltedadeshantion.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_fldtedadeshantionjoz,RemoteObject.createImmutable(" عدد و "),_fldtedadeshantionkol,RemoteObject.createImmutable(" کارتن "))));
 BA.debugLineNum = 248;BA.debugLine="LblSumForoosh.Text =myCode.AdadToPrice(fldFeeJoz";
Debug.ShouldStop(8388608);
act_reportvisitor.mostCurrent._lblsumforoosh.runMethod(true,"setText",BA.ObjectToCharSequence(act_reportvisitor.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(_fldfeejoz))));
 BA.debugLineNum = 249;BA.debugLine="LblSumSefaresh.Text =myCode.AdadToPrice(fldFeeJo";
Debug.ShouldStop(16777216);
act_reportvisitor.mostCurrent._lblsumsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(act_reportvisitor.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(_fldfeejozsefaresh))));
 BA.debugLineNum = 250;BA.debugLine="LblSumBargasht.Text =myCode.AdadToPrice(fldFeeBa";
Debug.ShouldStop(33554432);
act_reportvisitor.mostCurrent._lblsumbargasht.runMethod(true,"setText",BA.ObjectToCharSequence(act_reportvisitor.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(_fldfeebargasht))));
 BA.debugLineNum = 252;BA.debugLine="If	fldFeeJoz>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _fldfeejoz),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 253;BA.debugLine="fldSumKhales=fldFeeJoz-fldFeeBargasht";
Debug.ShouldStop(268435456);
_fldsumkhales = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldfeejoz),BA.numberCast(double.class, _fldfeebargasht)}, "-",1, 0));Debug.locals.put("fldSumKhales", _fldsumkhales);
 }else {
 BA.debugLineNum = 256;BA.debugLine="fldSumKhales=0";
Debug.ShouldStop(-2147483648);
_fldsumkhales = BA.NumberToString(0);Debug.locals.put("fldSumKhales", _fldsumkhales);
 };
 BA.debugLineNum = 259;BA.debugLine="LblSumKhales.Text =myCode.AdadToPrice(fldSumKhal";
Debug.ShouldStop(4);
act_reportvisitor.mostCurrent._lblsumkhales.runMethod(true,"setText",BA.ObjectToCharSequence(act_reportvisitor.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(_fldsumkhales))));
 BA.debugLineNum = 261;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 262;BA.debugLine="If hasreport=1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_hasreport,BA.NumberToString(1))) { 
 BA.debugLineNum = 263;BA.debugLine="Btn_show.Visible=True";
Debug.ShouldStop(64);
act_reportvisitor.mostCurrent._btn_show.runMethod(true,"setVisible",act_reportvisitor.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 265;BA.debugLine="Btn_show.Visible=False";
Debug.ShouldStop(256);
act_reportvisitor.mostCurrent._btn_show.runMethod(true,"setVisible",act_reportvisitor.mostCurrent.__c.getField(true,"False"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e99) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_reportvisitor.processBA, e99.toString()); BA.debugLineNum = 268;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","564487536",BA.ObjectToString(act_reportvisitor.mostCurrent.__c.runMethod(false,"LastException",act_reportvisitor.mostCurrent.activityBA)),0);
 BA.debugLineNum = 269;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4096);
act_reportvisitor.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_reportvisitor.mostCurrent.__c.runMethod(false,"LastException",act_reportvisitor.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_reportvisitor.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadData"))));
 };
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadfactor(RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("LoadFactor (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,379);
if (RapidSub.canDelegate("loadfactor")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","loadfactor", _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 379;BA.debugLine="Sub LoadFactor(lst As List)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 380;BA.debugLine="If	lst.Size>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 381;BA.debugLine="Act_RepFactors.DateAz=DateAz";
Debug.ShouldStop(268435456);
act_reportvisitor.mostCurrent._act_repfactors._dateaz /*RemoteObject*/  = act_reportvisitor.mostCurrent._dateaz;
 BA.debugLineNum = 382;BA.debugLine="Act_RepFactors.Dateta=DateTa";
Debug.ShouldStop(536870912);
act_reportvisitor.mostCurrent._act_repfactors._dateta /*RemoteObject*/  = act_reportvisitor.mostCurrent._dateta;
 BA.debugLineNum = 383;BA.debugLine="Act_RepFactors.CodeMoshtari=MCode.CodeMoshtariSe";
Debug.ShouldStop(1073741824);
act_reportvisitor.mostCurrent._act_repfactors._codemoshtari /*RemoteObject*/  = act_reportvisitor.mostCurrent._mcode._codemoshtariselect /*RemoteObject*/ ;
 BA.debugLineNum = 384;BA.debugLine="Act_RepFactors.TotalFactor=LblSumKhales.Text";
Debug.ShouldStop(-2147483648);
act_reportvisitor.mostCurrent._act_repfactors._totalfactor /*RemoteObject*/  = act_reportvisitor.mostCurrent._lblsumkhales.runMethod(true,"getText");
 BA.debugLineNum = 385;BA.debugLine="StartActivity(Act_RepFactors)";
Debug.ShouldStop(1);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("StartActivity",act_reportvisitor.processBA,(Object)((act_reportvisitor.mostCurrent._act_repfactors.getObject())));
 }else {
 BA.debugLineNum = 387;BA.debugLine="ToastMessageShow(\"اطلاعات ارسالی وجود ندارد\",Tru";
Debug.ShouldStop(4);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعات ارسالی وجود ندارد")),(Object)(act_reportvisitor.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 389;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadlistfaktor() throws Exception{
try {
		Debug.PushSubsStack("LoadListFaktor (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,323);
if (RapidSub.canDelegate("loadlistfaktor")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","loadlistfaktor");}
RemoteObject _tfsum = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 323;BA.debugLine="Sub LoadListFaktor";
Debug.ShouldStop(4);
 BA.debugLineNum = 324;BA.debugLine="Dim TFsum As Long=0";
Debug.ShouldStop(8);
_tfsum = BA.numberCast(long.class, 0);Debug.locals.put("TFsum", _tfsum);Debug.locals.put("TFsum", _tfsum);
 BA.debugLineNum = 326;BA.debugLine="If MCode.Sf.Len(DateAz) = 8 And MCode.Sf.Len(Date";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",act_reportvisitor.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(act_reportvisitor.mostCurrent._dateaz)),BA.numberCast(long.class, 8)) && RemoteObject.solveBoolean("=",act_reportvisitor.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(act_reportvisitor.mostCurrent._dateta)),BA.numberCast(long.class, 8))) { 
 BA.debugLineNum = 327;BA.debugLine="MCode.page=\"Act_ReportVisitor\"";
Debug.ShouldStop(64);
act_reportvisitor.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_ReportVisitor");
 BA.debugLineNum = 328;BA.debugLine="ProgressDialogShow2(\"لطفا چند لحظه صبر کنید . .";
Debug.ShouldStop(128);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_reportvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("لطفا چند لحظه صبر کنید . . .")),(Object)(act_reportvisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 330;BA.debugLine="CallSubDelayed3(Service_Server,\"GetReportFactor\"";
Debug.ShouldStop(512);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",act_reportvisitor.processBA,(Object)((act_reportvisitor.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("GetReportFactor")),(Object)((act_reportvisitor.mostCurrent._dateaz)),(Object)((act_reportvisitor.mostCurrent._dateta)));
 }else {
 BA.debugLineNum = 374;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
Debug.ShouldStop(2097152);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید")),(Object)(act_reportvisitor.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_oncancel() throws Exception{
try {
		Debug.PushSubsStack("p_onCancel (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,107);
if (RapidSub.canDelegate("p_oncancel")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","p_oncancel");}
 BA.debugLineNum = 107;BA.debugLine="Sub p_onCancel";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(2048);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","564028673",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("p_onDateSet (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,97);
if (RapidSub.canDelegate("p_ondateset")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","p_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 97;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(2);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","563963137",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 99;BA.debugLine="BtnAz.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(4);
act_reportvisitor.mostCurrent._btnaz.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 100;BA.debugLine="BtnAz.Tag=year&NumberFormat(month,2,0)&NumberForm";
Debug.ShouldStop(8);
act_reportvisitor.mostCurrent._btnaz.runMethod(false,"setTag",(RemoteObject.concat(_year,act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 101;BA.debugLine="DateAz=MPD.PersianToGregorian(year,month,day)";
Debug.ShouldStop(16);
act_reportvisitor.mostCurrent._dateaz = act_reportvisitor.mostCurrent._mpd.runMethod(true,"PersianToGregorian",(Object)(_year),(Object)(_month),(Object)(_day));
 BA.debugLineNum = 104;BA.debugLine="DateAz=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(128);
act_reportvisitor.mostCurrent._dateaz = RemoteObject.concat(_year,act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 105;BA.debugLine="LogColor(DateAz,Colors.Magenta)";
Debug.ShouldStop(256);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","563963144",act_reportvisitor.mostCurrent._dateaz,act_reportvisitor.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
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
public static RemoteObject  _p_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("p_onDismiss (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,110);
if (RapidSub.canDelegate("p_ondismiss")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","p_ondismiss");}
 BA.debugLineNum = 110;BA.debugLine="Sub p_onDismiss";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(16384);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","564094209",RemoteObject.createImmutable("dismiss"),0);
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("p1_onCancel (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,133);
if (RapidSub.canDelegate("p1_oncancel")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","p1_oncancel");}
 BA.debugLineNum = 133;BA.debugLine="Sub p1_onCancel";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(32);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","564290817",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("p1_onDateSet (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,123);
if (RapidSub.canDelegate("p1_ondateset")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","p1_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 123;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(134217728);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","564225281",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 125;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(268435456);
act_reportvisitor.mostCurrent._btnta.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 126;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
Debug.ShouldStop(536870912);
act_reportvisitor.mostCurrent._btnta.runMethod(false,"setTag",(RemoteObject.concat(_year,act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 127;BA.debugLine="DateTa= MPD.PersianToGregorian(year,month,day)";
Debug.ShouldStop(1073741824);
act_reportvisitor.mostCurrent._dateta = act_reportvisitor.mostCurrent._mpd.runMethod(true,"PersianToGregorian",(Object)(_year),(Object)(_month),(Object)(_day));
 BA.debugLineNum = 130;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(2);
act_reportvisitor.mostCurrent._dateta = RemoteObject.concat(_year,act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportvisitor.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 131;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
Debug.ShouldStop(4);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","564225288",act_reportvisitor.mostCurrent._dateta,act_reportvisitor.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("p1_onDismiss (act_reportvisitor) ","act_reportvisitor",34,act_reportvisitor.mostCurrent.activityBA,act_reportvisitor.mostCurrent,136);
if (RapidSub.canDelegate("p1_ondismiss")) { return ir.parsikhesab.pakhsh.act_reportvisitor.remoteMe.runUserSub(false, "act_reportvisitor","p1_ondismiss");}
 BA.debugLineNum = 136;BA.debugLine="Sub p1_onDismiss";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(256);
act_reportvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","564356353",RemoteObject.createImmutable("dismiss"),0);
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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