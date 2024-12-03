package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_reportsoorathesab_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","activity_create", _firsttime);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _name = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"l_reportsoorathesab\")";
Debug.ShouldStop(-2147483648);
act_reportsoorathesab.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_reportsoorathesab")),act_reportsoorathesab.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="LstReport.Initialize";
Debug.ShouldStop(1);
act_reportsoorathesab.mostCurrent._lstreport.runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="Base = Activity";
Debug.ShouldStop(4);
act_reportsoorathesab.mostCurrent._base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_reportsoorathesab.mostCurrent._activity.getObject());
 BA.debugLineNum = 36;BA.debugLine="Dialog.Initialize (Panel1)";
Debug.ShouldStop(8);
act_reportsoorathesab.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_reportsoorathesab.mostCurrent._panel1.getObject()));
 BA.debugLineNum = 37;BA.debugLine="Dialog.Title = \"جستجو\"";
Debug.ShouldStop(16);
act_reportsoorathesab.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("جستجو")));
 BA.debugLineNum = 38;BA.debugLine="SearchTemplate.Initialize";
Debug.ShouldStop(32);
act_reportsoorathesab.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="Dim Items As List";
Debug.ShouldStop(64);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 40;BA.debugLine="Items.Initialize";
Debug.ShouldStop(128);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(256);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_reportsoorathesab.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblAshkhas ")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 42;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(512);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 43;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(1024);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 44;BA.debugLine="Dim Name As String =  Cu.GetString(\"fldSharheTaf";
Debug.ShouldStop(2048);
_name = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili")));Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 45;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(4096);
_items.runVoidMethod ("Add",(Object)((_name)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 47;BA.debugLine="SearchTemplate.SetItems(Items)";
Debug.ShouldStop(16384);
act_reportsoorathesab.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 48;BA.debugLine="SearchTemplate.GetPanel(Dialog).BringToFront";
Debug.ShouldStop(32768);
act_reportsoorathesab.mostCurrent._searchtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xsearchtemplate.class, "_getpanel" /*RemoteObject*/ ,(Object)(act_reportsoorathesab.mostCurrent._dialog)).runVoidMethod ("BringToFront");
 BA.debugLineNum = 50;BA.debugLine="MCode.C_Tafzili=0";
Debug.ShouldStop(131072);
act_reportsoorathesab.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_KeyPress (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,82);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_reportsoorathesab.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 84;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
act_reportsoorathesab.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 86;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return act_reportsoorathesab.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 88;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return act_reportsoorathesab.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,78);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 78;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,74);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","activity_resume");}
 BA.debugLineNum = 74;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("AnimateDialog (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,243);
if (RapidSub.canDelegate("animatedialog")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","animatedialog", _dlg, _fromedge);}
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
Debug.locals.put("dlg", _dlg);
Debug.locals.put("FromEdge", _fromedge);
 BA.debugLineNum = 243;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="Dim Base As B4XView = dlg.Base";
Debug.ShouldStop(524288);
act_reportsoorathesab.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
act_reportsoorathesab.mostCurrent._base = _dlg.getField(false,"_base" /*RemoteObject*/ );
 BA.debugLineNum = 245;BA.debugLine="Dim top As Int = Base.Top";
Debug.ShouldStop(1048576);
_top = act_reportsoorathesab.mostCurrent._base.runMethod(true,"getTop");Debug.locals.put("top", _top);Debug.locals.put("top", _top);
 BA.debugLineNum = 246;BA.debugLine="Dim left As Int = Base.Left";
Debug.ShouldStop(2097152);
_left = act_reportsoorathesab.mostCurrent._base.runMethod(true,"getLeft");Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 247;BA.debugLine="Select FromEdge.ToLowerCase";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_fromedge.runMethod(true,"toLowerCase"),BA.ObjectToString("bottom"),BA.ObjectToString("top"),BA.ObjectToString("left"),BA.ObjectToString("right"))) {
case 0: {
 BA.debugLineNum = 249;BA.debugLine="Base.Top = Base.Parent.Height";
Debug.ShouldStop(16777216);
act_reportsoorathesab.mostCurrent._base.runMethod(true,"setTop",act_reportsoorathesab.mostCurrent._base.runMethod(false,"getParent").runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 251;BA.debugLine="Base.Top = -Base.Height";
Debug.ShouldStop(67108864);
act_reportsoorathesab.mostCurrent._base.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + act_reportsoorathesab.mostCurrent._base.runMethod(true,"getHeight").<Integer>get().intValue())));
 break; }
case 2: {
 BA.debugLineNum = 253;BA.debugLine="Base.Left = -Base.Width";
Debug.ShouldStop(268435456);
act_reportsoorathesab.mostCurrent._base.runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + act_reportsoorathesab.mostCurrent._base.runMethod(true,"getWidth").<Integer>get().intValue())));
 break; }
case 3: {
 BA.debugLineNum = 255;BA.debugLine="Base.Left = Base.Parent.Width";
Debug.ShouldStop(1073741824);
act_reportsoorathesab.mostCurrent._base.runMethod(true,"setLeft",act_reportsoorathesab.mostCurrent._base.runMethod(false,"getParent").runMethod(true,"getWidth"));
 break; }
}
;
 BA.debugLineNum = 257;BA.debugLine="Base.SetLayoutAnimated(300, left, top, Base.Width";
Debug.ShouldStop(1);
act_reportsoorathesab.mostCurrent._base.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(_left),(Object)(_top),(Object)(act_reportsoorathesab.mostCurrent._base.runMethod(true,"getWidth")),(Object)(act_reportsoorathesab.mostCurrent._base.runMethod(true,"getHeight")));
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
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,263);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 263;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(64);
 BA.debugLineNum = 265;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) return act_reportsoorathesab.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_selashkhas_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_SelAshkhas_Click (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,219);
if (RapidSub.canDelegate("btn_selashkhas_click")) { ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","btn_selashkhas_click"); return;}
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
public ResumableSub_Btn_SelAshkhas_Click(ir.parsikhesab.pakhsh.act_reportsoorathesab parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_reportsoorathesab parent;
RemoteObject _rs = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_SelAshkhas_Click (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,219);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 222;BA.debugLine="Panel1.BringToFront";
Debug.ShouldStop(536870912);
parent.mostCurrent._panel1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 223;BA.debugLine="Panel1.Visible=True";
Debug.ShouldStop(1073741824);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 224;BA.debugLine="SearchTemplate.SearchField.HintText=\"نام مشتری\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString("نام مشتری"));
 BA.debugLineNum = 225;BA.debugLine="SearchTemplate.SearchField.lblClear.Text=\"\"";
Debug.ShouldStop(1);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 226;BA.debugLine="SearchTemplate.SearchField.lblV.Text=\"\"";
Debug.ShouldStop(2);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 227;BA.debugLine="SearchTemplate.SearchField.Update";
Debug.ShouldStop(4);
parent.mostCurrent._searchtemplate.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 228;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
Debug.ShouldStop(8);
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._searchtemplate)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("انصراف"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 229;BA.debugLine="AnimateDialog(Dialog, \"right\")";
Debug.ShouldStop(16);
_animatedialog(parent.mostCurrent._dialog,RemoteObject.createImmutable("right"));
 BA.debugLineNum = 230;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_reportsoorathesab.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_reportsoorathesab", "btn_selashkhas_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 231;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 232;BA.debugLine="Btn_SelAshkhas.Text = SearchTemplate.SelectedIte";
Debug.ShouldStop(128);
parent.mostCurrent._btn_selashkhas.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate.getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 233;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(256);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas where fldSharheTafzili='"),parent.mostCurrent._btn_selashkhas.runMethod(true,"getText"),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 234;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(512);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 235;BA.debugLine="MCode.C_Tafzili =  Cu.GetString(\"fldCodetafzili\"";
Debug.ShouldStop(1024);
parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili")));
 BA.debugLineNum = 236;BA.debugLine="Log(\"کد مشتری : \"&Cu.GetString(\"fldCodetafzili\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","563242257",RemoteObject.concat(RemoteObject.createImmutable("کد مشتری : "),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili")))),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 238;BA.debugLine="Btn_SelAshkhas.Text = \"انتخاب مشتری\"";
Debug.ShouldStop(8192);
parent.mostCurrent._btn_selashkhas.runMethod(true,"setText",BA.ObjectToCharSequence("انتخاب مشتری"));
 BA.debugLineNum = 239;BA.debugLine="MCode.C_Tafzili=0";
Debug.ShouldStop(16384);
parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = BA.NumberToString(0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 241;BA.debugLine="Panel1.Visible=False";
Debug.ShouldStop(65536);
parent.mostCurrent._panel1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("BtnAz_Click (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,155);
if (RapidSub.canDelegate("btnaz_click")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","btnaz_click");}
RemoteObject _p = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 155;BA.debugLine="Sub BtnAz_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Dim p As PersianMaterialDatePicker";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 157;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("Initialize",act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString("p")),(Object)(_p.runMethod(true,"getPersianYear")),(Object)(_p.runMethod(true,"getPersianMonth")),(Object)(_p.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 158;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(536870912);
_p.runMethod(true,"setAccentColor",act_reportsoorathesab.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 159;BA.debugLine="p.OkText = \"تایید\"";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 160;BA.debugLine="p.CancelText = \"لغو\"";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 161;BA.debugLine="p.Title = \"از تاریخ\"";
Debug.ShouldStop(1);
_p.runVoidMethod ("setTitle",BA.ObjectToString("از تاریخ"));
 BA.debugLineNum = 162;BA.debugLine="p.Typeface = \"iransansmonospacednum.ttf\"";
Debug.ShouldStop(2);
_p.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmonospacednum.ttf"));
 BA.debugLineNum = 163;BA.debugLine="p.Show(\"p\")";
Debug.ShouldStop(4);
_p.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p")));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("BtnReport_Click (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,91);
if (RapidSub.canDelegate("btnreport_click")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","btnreport_click");}
 BA.debugLineNum = 91;BA.debugLine="Sub BtnReport_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(B";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_reportsoorathesab.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(BA.ObjectToString(act_reportsoorathesab.mostCurrent._btnaz.runMethod(false,"getTag")))),BA.numberCast(long.class, 8)) && RemoteObject.solveBoolean("=",act_reportsoorathesab.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(BA.ObjectToString(act_reportsoorathesab.mostCurrent._btnta.runMethod(false,"getTag")))),BA.numberCast(long.class, 8))) { 
 BA.debugLineNum = 93;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .";
Debug.ShouldStop(268435456);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال دریافت اطلاعات . . .")),(Object)(act_reportsoorathesab.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 95;BA.debugLine="CallSubDelayed3(Service_Server,\"GetSooratHesab\",";
Debug.ShouldStop(1073741824);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",act_reportsoorathesab.processBA,(Object)((act_reportsoorathesab.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("GetSooratHesab")),(Object)((act_reportsoorathesab.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(act_reportsoorathesab.mostCurrent._dateaz)))),(Object)((act_reportsoorathesab.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(act_reportsoorathesab.mostCurrent._dateta)))));
 }else {
 BA.debugLineNum = 97;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
Debug.ShouldStop(1);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید")),(Object)(act_reportsoorathesab.mostCurrent.__c.getField(true,"True")));
 };
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
public static RemoteObject  _btnta_click() throws Exception{
try {
		Debug.PushSubsStack("BtnTa_Click (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,176);
if (RapidSub.canDelegate("btnta_click")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","btnta_click");}
RemoteObject _p1 = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 176;BA.debugLine="Sub BtnTa_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
Debug.ShouldStop(65536);
_p1 = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 178;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
Debug.ShouldStop(131072);
_p1.runVoidMethod ("Initialize",act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString("p1")),(Object)(_p1.runMethod(true,"getPersianYear")),(Object)(_p1.runMethod(true,"getPersianMonth")),(Object)(_p1.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 179;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(262144);
_p1.runMethod(true,"setAccentColor",act_reportsoorathesab.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 180;BA.debugLine="p1.OkText = \"تایید\"";
Debug.ShouldStop(524288);
_p1.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 181;BA.debugLine="p1.CancelText = \"لغو\"";
Debug.ShouldStop(1048576);
_p1.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 182;BA.debugLine="p1.Title = \"تا تاریخ\"";
Debug.ShouldStop(2097152);
_p1.runVoidMethod ("setTitle",BA.ObjectToString("تا تاریخ"));
 BA.debugLineNum = 183;BA.debugLine="p1.Typeface = \"iransansmonospacednum.ttf\"";
Debug.ShouldStop(4194304);
_p1.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmonospacednum.ttf"));
 BA.debugLineNum = 184;BA.debugLine="p1.Show(\"p1\")";
Debug.ShouldStop(8388608);
_p1.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p1")));
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
public static RemoteObject  _creategrid() throws Exception{
try {
		Debug.PushSubsStack("CreateGrid (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,53);
if (RapidSub.canDelegate("creategrid")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","creategrid");}
RemoteObject _lst_colnametitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 53;BA.debugLine="Sub CreateGrid";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="PnlGrid.RemoveAllViews";
Debug.ShouldStop(2097152);
act_reportsoorathesab.mostCurrent._pnlgrid.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 55;BA.debugLine="Table1.Initialize(Me,\"Table1\",9)";
Debug.ShouldStop(4194304);
act_reportsoorathesab.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_initialize" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(act_reportsoorathesab.getObject()),(Object)(BA.ObjectToString("Table1")),(Object)(BA.numberCast(int.class, 9)));
 BA.debugLineNum = 56;BA.debugLine="Table1.AddToActivity(PnlGrid, 0,0,100%x,PnlGrid.H";
Debug.ShouldStop(8388608);
act_reportsoorathesab.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addtoactivity" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), act_reportsoorathesab.mostCurrent._pnlgrid.getObject()),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_reportsoorathesab.mostCurrent.activityBA)),(Object)(act_reportsoorathesab.mostCurrent._pnlgrid.runMethod(true,"getHeight")));
 BA.debugLineNum = 58;BA.debugLine="Dim Lst_ColNameTitle As List";
Debug.ShouldStop(33554432);
_lst_colnametitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
 BA.debugLineNum = 59;BA.debugLine="Lst_ColNameTitle.Initialize";
Debug.ShouldStop(67108864);
_lst_colnametitle.runVoidMethod ("Initialize");
 BA.debugLineNum = 60;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"مانده\",\"";
Debug.ShouldStop(134217728);
_lst_colnametitle.runVoidMethod ("AddAll",(Object)(act_reportsoorathesab.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString("مانده"),BA.ObjectToString("مبلغ بستانکاری"),BA.ObjectToString("مبلغ بدهکاری"),BA.ObjectToString("تاریخ"),BA.ObjectToString("ریز.سند"),BA.ObjectToString("شرح"),BA.ObjectToString("ش.سند"),BA.ObjectToString("ش"),RemoteObject.createImmutable("ردیف")})))));
 BA.debugLineNum = 63;BA.debugLine="Table1.LoadSListSoorathesab(LstReport,Lst_ColName";
Debug.ShouldStop(1073741824);
act_reportsoorathesab.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_loadslistsoorathesab" /*RemoteObject*/ ,(Object)(act_reportsoorathesab.mostCurrent._lstreport),(Object)(_lst_colnametitle),(Object)(BA.numberCast(int.class, 9)));
 BA.debugLineNum = 64;BA.debugLine="Table1.SetColumnsWidths(Array As Int(22%x, 22%x,2";
Debug.ShouldStop(-2147483648);
act_reportsoorathesab.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("int",new int[] {9},new Object[] {act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportsoorathesab.mostCurrent.activityBA)})));
 BA.debugLineNum = 65;BA.debugLine="Table1.SetHeader(Array As String(\"مانده\",\"مبلغ بس";
Debug.ShouldStop(1);
act_reportsoorathesab.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setheader" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString("مانده"),BA.ObjectToString("مبلغ بستانکاری"),BA.ObjectToString("مبلغ بدهکاری"),BA.ObjectToString("تاریخ"),BA.ObjectToString("ریز.سند"),BA.ObjectToString("شرح"),BA.ObjectToString("ش.سند"),BA.ObjectToString("ش"),RemoteObject.createImmutable("ردیف")})),(Object)(RemoteObject.createNewArray("int",new int[] {9},new Object[] {act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 22)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportsoorathesab.mostCurrent.activityBA),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportsoorathesab.mostCurrent.activityBA)})));
 BA.debugLineNum = 67;BA.debugLine="LblSumBedehkar.Text = NumberFormat(TitleReport(0)";
Debug.ShouldStop(4);
act_reportsoorathesab.mostCurrent._lblsumbedehkar.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_reportsoorathesab._titlereport.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" ریال "))));
 BA.debugLineNum = 68;BA.debugLine="LblSumBestankar.Text = NumberFormat(TitleReport(1";
Debug.ShouldStop(8);
act_reportsoorathesab.mostCurrent._lblsumbestankar.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_reportsoorathesab._titlereport.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" ریال "))));
 BA.debugLineNum = 69;BA.debugLine="LblSumMande.Text = NumberFormat(TitleReport(2),1,";
Debug.ShouldStop(16);
act_reportsoorathesab.mostCurrent._lblsummande.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_reportsoorathesab._titlereport.getArrayElement(true,BA.numberCast(int.class, 2)))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" ریال "))));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("CreateList (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,101);
if (RapidSub.canDelegate("createlist")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","createlist", _lst);}
RemoteObject _mande = RemoteObject.createImmutable(0L);
RemoteObject _coljroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterreportsoorathesab");
Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 101;BA.debugLine="Sub CreateList(Lst As List)";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="LstReport.Clear";
Debug.ShouldStop(32);
act_reportsoorathesab.mostCurrent._lstreport.runVoidMethod ("Clear");
 BA.debugLineNum = 103;BA.debugLine="TitleReport(0) = 0";
Debug.ShouldStop(64);
act_reportsoorathesab._titlereport.setArrayElement (BA.numberCast(long.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 104;BA.debugLine="TitleReport(1) = 0";
Debug.ShouldStop(128);
act_reportsoorathesab._titlereport.setArrayElement (BA.numberCast(long.class, 0),BA.numberCast(int.class, 1));
 BA.debugLineNum = 105;BA.debugLine="TitleReport(2) = 0";
Debug.ShouldStop(256);
act_reportsoorathesab._titlereport.setArrayElement (BA.numberCast(long.class, 0),BA.numberCast(int.class, 2));
 BA.debugLineNum = 106;BA.debugLine="Dim mande As Long=0";
Debug.ShouldStop(512);
_mande = BA.numberCast(long.class, 0);Debug.locals.put("mande", _mande);Debug.locals.put("mande", _mande);
 BA.debugLineNum = 107;BA.debugLine="For Each coljRoot As Map In Lst";
Debug.ShouldStop(1024);
_coljroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group6 = _lst;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_coljroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group6.runMethod(false,"Get",index6));Debug.locals.put("coljRoot", _coljroot);
Debug.locals.put("coljRoot", _coljroot);
 BA.debugLineNum = 108;BA.debugLine="Dim Item As AdapterReportSooratHesab";
Debug.ShouldStop(2048);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterreportsoorathesab");Debug.locals.put("Item", _item);
 BA.debugLineNum = 109;BA.debugLine="Item.fldRadif =  coljRoot.Get(\"fldRadif\")";
Debug.ShouldStop(4096);
_item.setField ("fldRadif" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldRadif"))))));
 BA.debugLineNum = 110;BA.debugLine="Item.shomare = myCode.Is_Null(coljRoot.Get(\"shom";
Debug.ShouldStop(8192);
_item.setField ("shomare" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shomare"))))))));
 BA.debugLineNum = 111;BA.debugLine="Item.fldSanad =myCode.Is_Null(coljRoot.Get(\"fldS";
Debug.ShouldStop(16384);
_item.setField ("fldSanad" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSanad"))))))));
 BA.debugLineNum = 112;BA.debugLine="Item.fldSharh =myCode.Is_Null(coljRoot.Get(\"fldS";
Debug.ShouldStop(32768);
_item.setField ("fldSharh" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharh"))))))));
 BA.debugLineNum = 113;BA.debugLine="Item.fldRiz =myCode.Is_Null(coljRoot.Get(\"fldRiz";
Debug.ShouldStop(65536);
_item.setField ("fldRiz" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldRiz"))))))));
 BA.debugLineNum = 114;BA.debugLine="Item.fldDate =myCode.Is_Null(coljRoot.Get(\"fldDa";
Debug.ShouldStop(131072);
_item.setField ("fldDate" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate"))))))));
 BA.debugLineNum = 115;BA.debugLine="Item.fldBedehkar =0";
Debug.ShouldStop(262144);
_item.setField ("fldBedehkar" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 116;BA.debugLine="Item.fldBestankar =0";
Debug.ShouldStop(524288);
_item.setField ("fldBestankar" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 119;BA.debugLine="LstReport.Add(Item)";
Debug.ShouldStop(4194304);
act_reportsoorathesab.mostCurrent._lstreport.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 122;BA.debugLine="If myCode.Is_Null(coljRoot.Get(\"fldBedehkar\"))<>";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBedehkar"))))))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 123;BA.debugLine="Item.fldBedehkar =myCode.Is_Null(coljRoot.Get(\"";
Debug.ShouldStop(67108864);
_item.setField ("fldBedehkar" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBedehkar"))))))));
 BA.debugLineNum = 124;BA.debugLine="Log(coljRoot.Get(\"fldBedehkar\"))";
Debug.ShouldStop(134217728);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("LogImpl","562652439",BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBedehkar"))))),0);
 BA.debugLineNum = 125;BA.debugLine="TitleReport(0) = TitleReport(0) + coljRoot.Get(";
Debug.ShouldStop(268435456);
act_reportsoorathesab._titlereport.setArrayElement (BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {act_reportsoorathesab._titlereport.getArrayElement(true,BA.numberCast(int.class, 0)),BA.numberCast(double.class, _coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBedehkar")))))}, "+",1, 0)),BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 127;BA.debugLine="If myCode.Is_Null(coljRoot.Get(\"fldBestankar\"))<";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBestankar"))))))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 128;BA.debugLine="Item.fldBestankar =myCode.Is_Null(coljRoot.Get(";
Debug.ShouldStop(-2147483648);
_item.setField ("fldBestankar" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBestankar"))))))));
 BA.debugLineNum = 129;BA.debugLine="Log(coljRoot.Get(\"fldBestankar\"))";
Debug.ShouldStop(1);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("LogImpl","562652444",BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBestankar"))))),0);
 BA.debugLineNum = 130;BA.debugLine="TitleReport(1) = TitleReport(1) + coljRoot.Get(";
Debug.ShouldStop(2);
act_reportsoorathesab._titlereport.setArrayElement (BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {act_reportsoorathesab._titlereport.getArrayElement(true,BA.numberCast(int.class, 1)),BA.numberCast(double.class, _coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldBestankar")))))}, "+",1, 0)),BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 132;BA.debugLine="If myCode.Check_Null_or_NotNumber(Item.fldBestan";
Debug.ShouldStop(8);
if (act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_check_null_or_notnumber" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(_item.getField(true,"fldBestankar" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 133;BA.debugLine="mande=mande-Item.fldBestankar";
Debug.ShouldStop(16);
_mande = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_mande,BA.numberCast(double.class, _item.getField(true,"fldBestankar" /*RemoteObject*/ ))}, "-",1, 0));Debug.locals.put("mande", _mande);
 };
 BA.debugLineNum = 135;BA.debugLine="If myCode.Check_Null_or_NotNumber(Item.fldBedehk";
Debug.ShouldStop(64);
if (act_reportsoorathesab.mostCurrent._mycode.runMethod(true,"_check_null_or_notnumber" /*RemoteObject*/ ,act_reportsoorathesab.mostCurrent.activityBA,(Object)(_item.getField(true,"fldBedehkar" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 136;BA.debugLine="mande=mande+Item.fldBedehkar";
Debug.ShouldStop(128);
_mande = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_mande,BA.numberCast(double.class, _item.getField(true,"fldBedehkar" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("mande", _mande);
 };
 BA.debugLineNum = 139;BA.debugLine="If mande>0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_mande,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 140;BA.debugLine="Item.fldMande =mande";
Debug.ShouldStop(2048);
_item.setField ("fldMande" /*RemoteObject*/ ,BA.NumberToString(_mande));
 BA.debugLineNum = 141;BA.debugLine="Log(Item.fldMande)";
Debug.ShouldStop(4096);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("LogImpl","562652456",_item.getField(true,"fldMande" /*RemoteObject*/ ),0);
 BA.debugLineNum = 142;BA.debugLine="TitleReport(2) = TitleReport(0) - TitleReport(1";
Debug.ShouldStop(8192);
act_reportsoorathesab._titlereport.setArrayElement (RemoteObject.solve(new RemoteObject[] {act_reportsoorathesab._titlereport.getArrayElement(true,BA.numberCast(int.class, 0)),act_reportsoorathesab._titlereport.getArrayElement(true,BA.numberCast(int.class, 1))}, "-",1, 2),BA.numberCast(int.class, 2));
 };
 }
}Debug.locals.put("coljRoot", _coljroot);
;
 BA.debugLineNum = 152;BA.debugLine="CreateGrid";
Debug.ShouldStop(8388608);
_creategrid();
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
act_reportsoorathesab.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 12;BA.debugLine="Private Dialog As B4XDialog";
act_reportsoorathesab.mostCurrent._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 13;BA.debugLine="Private Base As B4XView";
act_reportsoorathesab.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private SearchTemplate As B4XSearchTemplate";
act_reportsoorathesab.mostCurrent._searchtemplate = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xsearchtemplate");
 //BA.debugLineNum = 16;BA.debugLine="Dim Table1 As Table";
act_reportsoorathesab.mostCurrent._table1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table");
 //BA.debugLineNum = 17;BA.debugLine="Private PnlGrid As Panel";
act_reportsoorathesab.mostCurrent._pnlgrid = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Panel1 As Panel";
act_reportsoorathesab.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private BtnAz As Button";
act_reportsoorathesab.mostCurrent._btnaz = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private BtnTa As Button";
act_reportsoorathesab.mostCurrent._btnta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim DateAz,DateTa As String";
act_reportsoorathesab.mostCurrent._dateaz = RemoteObject.createImmutable("");
act_reportsoorathesab.mostCurrent._dateta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim LstReport As List";
act_reportsoorathesab.mostCurrent._lstreport = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 23;BA.debugLine="Dim TitleReport(3) As Long";
act_reportsoorathesab._titlereport = RemoteObject.createNewArray ("long", new int[] {3}, new Object[]{});
 //BA.debugLineNum = 25;BA.debugLine="Private LblSumBedehkar As Label";
act_reportsoorathesab.mostCurrent._lblsumbedehkar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LblSumBestankar As Label";
act_reportsoorathesab.mostCurrent._lblsumbestankar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private LblSumMande As Label";
act_reportsoorathesab.mostCurrent._lblsummande = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Btn_SelAshkhas As Button";
act_reportsoorathesab.mostCurrent._btn_selashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _img_chart_click() throws Exception{
try {
		Debug.PushSubsStack("Img_Chart_Click (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,259);
if (RapidSub.canDelegate("img_chart_click")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","img_chart_click");}
 BA.debugLineNum = 259;BA.debugLine="Sub Img_Chart_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Img_Sort_Click (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,207);
if (RapidSub.canDelegate("img_sort_click")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","img_sort_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 207;BA.debugLine="Sub Img_Sort_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="Dim Lst As List = Array As String(\"مبلغ کم به زیا";
Debug.ShouldStop(32768);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_reportsoorathesab.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("مبلغ کم به زیاد"),RemoteObject.createImmutable("مبلغ زیاد به کم")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 209;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
Debug.ShouldStop(65536);
_res = act_reportsoorathesab.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("مرتب سازی براساس:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_reportsoorathesab.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 210;BA.debugLine="Select Case res";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 212;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",False)";
Debug.ShouldStop(524288);
act_reportsoorathesab.mostCurrent._lstreport.runVoidMethod ("SortType",(Object)(BA.ObjectToString("fldFeeJoz")),(Object)(act_reportsoorathesab.mostCurrent.__c.getField(true,"False")));
 break; }
case 1: {
 BA.debugLineNum = 214;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",True)";
Debug.ShouldStop(2097152);
act_reportsoorathesab.mostCurrent._lstreport.runVoidMethod ("SortType",(Object)(BA.ObjectToString("fldFeeJoz")),(Object)(act_reportsoorathesab.mostCurrent.__c.getField(true,"True")));
 break; }
}
;
 BA.debugLineNum = 216;BA.debugLine="ProgressDialogShow(\"لطفا چند لحظه صبر کنید\")";
Debug.ShouldStop(8388608);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_reportsoorathesab.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("لطفا چند لحظه صبر کنید"))));
 BA.debugLineNum = 217;BA.debugLine="CreateGrid";
Debug.ShouldStop(16777216);
_creategrid();
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("LblBack_Click (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,203);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","lblback_click");}
 BA.debugLineNum = 203;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
act_reportsoorathesab.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 205;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("p_onDateSet (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,165);
if (RapidSub.canDelegate("p_ondateset")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","p_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 165;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(32);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("LogImpl","562783489",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 167;BA.debugLine="BtnAz.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(64);
act_reportsoorathesab.mostCurrent._btnaz.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 168;BA.debugLine="BtnAz.Tag =year&NumberFormat(day,2,0)&NumberForma";
Debug.ShouldStop(128);
act_reportsoorathesab.mostCurrent._btnaz.runMethod(false,"setTag",(RemoteObject.concat(_year,act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 172;BA.debugLine="DateAz=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(2048);
act_reportsoorathesab.mostCurrent._dateaz = RemoteObject.concat(_year,act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 173;BA.debugLine="LogColor(DateAz,Colors.Magenta)";
Debug.ShouldStop(4096);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("LogImpl","562783496",act_reportsoorathesab.mostCurrent._dateaz,act_reportsoorathesab.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("p1_onCancel (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,196);
if (RapidSub.canDelegate("p1_oncancel")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","p1_oncancel");}
 BA.debugLineNum = 196;BA.debugLine="Sub p1_onCancel";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(16);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("LogImpl","562980097",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("p1_onDateSet (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,186);
if (RapidSub.canDelegate("p1_ondateset")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","p1_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 186;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(67108864);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("LogImpl","562914561",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 188;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(134217728);
act_reportsoorathesab.mostCurrent._btnta.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 189;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
Debug.ShouldStop(268435456);
act_reportsoorathesab.mostCurrent._btnta.runMethod(false,"setTag",(RemoteObject.concat(_year,act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 193;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(1);
act_reportsoorathesab.mostCurrent._dateta = RemoteObject.concat(_year,act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportsoorathesab.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 194;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
Debug.ShouldStop(2);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("LogImpl","562914568",act_reportsoorathesab.mostCurrent._dateta,act_reportsoorathesab.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
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
public static RemoteObject  _p1_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("p1_onDismiss (act_reportsoorathesab) ","act_reportsoorathesab",33,act_reportsoorathesab.mostCurrent.activityBA,act_reportsoorathesab.mostCurrent,199);
if (RapidSub.canDelegate("p1_ondismiss")) { return ir.parsikhesab.pakhsh.act_reportsoorathesab.remoteMe.runUserSub(false, "act_reportsoorathesab","p1_ondismiss");}
 BA.debugLineNum = 199;BA.debugLine="Sub p1_onDismiss";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(128);
act_reportsoorathesab.mostCurrent.__c.runVoidMethod ("LogImpl","563045633",RemoteObject.createImmutable("dismiss"),0);
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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