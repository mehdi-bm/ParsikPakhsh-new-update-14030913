package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_kalapaging2_subs_0 {


public static RemoteObject  _add_item(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("Add_Item (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("add_item")) { return __ref.runUserSub(false, "cls_kalapaging2","add_item", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 292;BA.debugLine="Private Sub Add_Item(s As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 294;BA.debugLine="If s=Null Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("n",_s)) { 
 BA.debugLineNum = 295;BA.debugLine="Log(\"Null\")";
Debug.ShouldStop(64);
cls_kalapaging2.__c.runVoidMethod ("LogImpl","595682563",RemoteObject.createImmutable("Null"),0);
 }else 
{ BA.debugLineNum = 296;BA.debugLine="Else If s.Trim=\"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_s.runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 297;BA.debugLine="Log(\"empty\")";
Debug.ShouldStop(256);
cls_kalapaging2.__c.runVoidMethod ("LogImpl","595682565",RemoteObject.createImmutable("empty"),0);
 }else 
{ BA.debugLineNum = 298;BA.debugLine="Else If s.Trim=\"0\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_s.runMethod(true,"trim"),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 299;BA.debugLine="Log(\"zeroo\")";
Debug.ShouldStop(1024);
cls_kalapaging2.__c.runVoidMethod ("LogImpl","595682567",RemoteObject.createImmutable("zeroo"),0);
 }else {
 BA.debugLineNum = 301;BA.debugLine="options.Options.Add(s)";
Debug.ShouldStop(4096);
__ref.getField(false,"_options" /*RemoteObject*/ ).getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }}}
;
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtosabad(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddToSabad (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,430);
if (RapidSub.canDelegate("addtosabad")) { return __ref.runUserSub(false, "cls_kalapaging2","addtosabad", __ref);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _check = RemoteObject.createImmutable(false);
int _i = 0;
 BA.debugLineNum = 430;BA.debugLine="Private Sub AddToSabad";
Debug.ShouldStop(8192);
 BA.debugLineNum = 431;BA.debugLine="LblMojoodi.Text = \"موجودی: \" & Item.SumMande";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblmojoodi" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ ))));
 BA.debugLineNum = 432;BA.debugLine="If Item.SumMande < 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 433;BA.debugLine="LblMojoodi.TextColor=Colors.Red";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblmojoodi" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_kalapaging2.__c.getField(false,"Colors").getField(true,"Red"));
 }else {
 BA.debugLineNum = 435;BA.debugLine="LblMojoodi.TextColor=Colors.Black";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblmojoodi" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_kalapaging2.__c.getField(false,"Colors").getField(true,"Black"));
 };
 BA.debugLineNum = 438;BA.debugLine="LblTedadJoz.Text = Item.TedadDarSabadJoz";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )));
 BA.debugLineNum = 439;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& Item.NameVahed";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblvahedjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 440;BA.debugLine="LblTedadkol.Text = Item.TedadDarSabadKol";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )));
 BA.debugLineNum = 441;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& Item.NameVahed2";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblvahedkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 443;BA.debugLine="lbl_sum.Text=NumberFormat2((Item.TedadDarSabadJoz";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbl_sum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_kalapaging2.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "+",1, 0)),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ )}, "*",0, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_kalapaging2.__c.getField(true,"True")))));
 BA.debugLineNum = 445;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(268435456);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_kalapaging2._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 446;BA.debugLine="Dim Check As Boolean";
Debug.ShouldStop(536870912);
_check = RemoteObject.createImmutable(false);Debug.locals.put("Check", _check);
 BA.debugLineNum = 447;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(1073741824);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 448;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(-2147483648);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 449;BA.debugLine="If Cu.GetString(\"FldC_Kala\") = Item.CodeKala The";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Kala"))),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 450;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 451;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
Debug.ShouldStop(4);
cls_kalapaging2._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldC_Kala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 453;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
Debug.ShouldStop(16);
cls_kalapaging2._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadJoz = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadKol = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("'  Where FldC_kala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 456;BA.debugLine="Check = True";
Debug.ShouldStop(128);
_check = cls_kalapaging2.__c.getField(true,"True");Debug.locals.put("Check", _check);
 BA.debugLineNum = 457;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 460;BA.debugLine="If Check = False Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_check,cls_kalapaging2.__c.getField(true,"False"))) { 
 };
 BA.debugLineNum = 463;BA.debugLine="CallSubDelayed(base,\"RefreshLblSabad\")";
Debug.ShouldStop(16384);
cls_kalapaging2.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((__ref.getField(false,"_base" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.createImmutable("RefreshLblSabad")));
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_back_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_back_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,466);
if (RapidSub.canDelegate("btn_back_click")) { return __ref.runUserSub(false, "cls_kalapaging2","btn_back_click", __ref);}
 BA.debugLineNum = 466;BA.debugLine="Private Sub btn_back_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_close_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_close_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,471);
if (RapidSub.canDelegate("btn_close_click")) { return __ref.runUserSub(false, "cls_kalapaging2","btn_close_click", __ref);}
 BA.debugLineNum = 471;BA.debugLine="Private Sub btn_close_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 472;BA.debugLine="btn_back_Click";
Debug.ShouldStop(8388608);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging2.class, "_btn_back_click" /*RemoteObject*/ );
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_edit_price_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_edit_Price_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,541);
if (RapidSub.canDelegate("btn_edit_price_click")) { __ref.runUserSub(false, "cls_kalapaging2","btn_edit_price_click", __ref); return;}
ResumableSub_btn_edit_Price_Click rsub = new ResumableSub_btn_edit_Price_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btn_edit_Price_Click extends BA.ResumableSub {
public ResumableSub_btn_edit_Price_Click(ir.parsikhesab.pakhsh.cls_kalapaging2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_kalapaging2 parent;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btn_edit_Price_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,541);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 542;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(536870912);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 543;BA.debugLine="input.Initialize";
Debug.ShouldStop(1073741824);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 544;BA.debugLine="input.lblTitle.Text = \"قیمت جدید:\"";
Debug.ShouldStop(-2147483648);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("قیمت جدید:"));
 BA.debugLineNum = 545;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(1);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 546;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowTemplate(inpu";
Debug.ShouldStop(2);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 547;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 548;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_kalapaging2", "btn_edit_price_click"), _rs);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 549;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 550;BA.debugLine="If input.Text=\"\" Then input.Text=0";
Debug.ShouldStop(32);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_input.getField(true,"_text" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_input.setField ("_text" /*RemoteObject*/ ,BA.NumberToString(0));
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 551;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(64);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 552;BA.debugLine="Item.FeeForoosh=res";
Debug.ShouldStop(128);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _res));
 BA.debugLineNum = 553;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set FldFee='\"&r";
Debug.ShouldStop(256);
parent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblKala Set FldFee='"),_res,RemoteObject.createImmutable("' where FldC_Kala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 554;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3)";
Debug.ShouldStop(512);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ )));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 556;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _btndowneshan_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnDownEshan_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,588);
if (RapidSub.canDelegate("btndowneshan_click")) { return __ref.runUserSub(false, "cls_kalapaging2","btndowneshan_click", __ref);}
 BA.debugLineNum = 588;BA.debugLine="Private Sub BtnDownEshan_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 598;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndownjoz_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnDownJoz_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("btndownjoz_click")) { return __ref.runUserSub(false, "cls_kalapaging2","btndownjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 370;BA.debugLine="Private Sub BtnDownJoz_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 371;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(262144);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 372;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(524288);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 373;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(cls_kalapaging2._mcode._isfloat /*RemoteObject*/ ,cls_kalapaging2.__c.getField(true,"True"),cls_kalapaging2.__c.getField(true,"False"))) {
case 0: {
 BA.debugLineNum = 375;BA.debugLine="Val = 0.25";
Debug.ShouldStop(4194304);
_val = BA.numberCast(float.class, 0.25);Debug.locals.put("Val", _val);
 break; }
case 1: {
 BA.debugLineNum = 377;BA.debugLine="Val = 1";
Debug.ShouldStop(16777216);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 break; }
}
;
 BA.debugLineNum = 380;BA.debugLine="A = Item.TedadDarSabadJoz";
Debug.ShouldStop(134217728);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 381;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 382;BA.debugLine="A = A - Val";
Debug.ShouldStop(536870912);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "-",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 383;BA.debugLine="Item.SumMande = Item.SumMande + Val";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "+",1, 0)));
 BA.debugLineNum = 384;BA.debugLine="Item.TedadDarSabadJoz = A";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 387;BA.debugLine="AddToSabad";
Debug.ShouldStop(4);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging2.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 388;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndownkol_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnDownKol_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("btndownkol_click")) { return __ref.runUserSub(false, "cls_kalapaging2","btndownkol_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 418;BA.debugLine="Private Sub BtnDownKol_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 419;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(4);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 421;BA.debugLine="A = Item.TedadDarSabadKol";
Debug.ShouldStop(16);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 422;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 423;BA.debugLine="A = A - 1";
Debug.ShouldStop(64);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 424;BA.debugLine="Item.SumMande = Item.SumMande + Item.TedadDarKar";
Debug.ShouldStop(128);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "+",1, 0)));
 BA.debugLineNum = 425;BA.debugLine="Item.TedadDarSabadKol = A";
Debug.ShouldStop(256);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 427;BA.debugLine="AddToSabad";
Debug.ShouldStop(1024);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging2.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnupeshan_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnUpEshan_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,558);
if (RapidSub.canDelegate("btnupeshan_click")) { return __ref.runUserSub(false, "cls_kalapaging2","btnupeshan_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
 BA.debugLineNum = 558;BA.debugLine="Private Sub BtnUpEshan_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 559;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(16384);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 560;BA.debugLine="Dim B As Int";
Debug.ShouldStop(32768);
_b = RemoteObject.createImmutable(0);Debug.locals.put("B", _b);
 BA.debugLineNum = 586;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnupjoz_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnUpJoz_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("btnupjoz_click")) { return __ref.runUserSub(false, "cls_kalapaging2","btnupjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 343;BA.debugLine="Private Sub BtnUpJoz_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(8388608);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 345;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(16777216);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 346;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(cls_kalapaging2._mcode._isfloat /*RemoteObject*/ ,cls_kalapaging2.__c.getField(true,"True"),cls_kalapaging2.__c.getField(true,"False"))) {
case 0: {
 BA.debugLineNum = 348;BA.debugLine="Val = 0.25";
Debug.ShouldStop(134217728);
_val = BA.numberCast(float.class, 0.25);Debug.locals.put("Val", _val);
 break; }
case 1: {
 BA.debugLineNum = 350;BA.debugLine="Val = 1";
Debug.ShouldStop(536870912);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 break; }
}
;
 BA.debugLineNum = 353;BA.debugLine="A = Item.TedadDarSabadJoz";
Debug.ShouldStop(1);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 367;BA.debugLine="AddToSabad";
Debug.ShouldStop(16384);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging2.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 368;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnupkol_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnUpKol_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,390);
if (RapidSub.canDelegate("btnupkol_click")) { return __ref.runUserSub(false, "cls_kalapaging2","btnupkol_click", __ref);}
 BA.debugLineNum = 390;BA.debugLine="Private Sub BtnUpKol_Click";
Debug.ShouldStop(32);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_kalapaging2._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_kalapaging2._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_kalapaging2._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_kalapaging2._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private Key As IME";
cls_kalapaging2._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_key",cls_kalapaging2._key);
 //BA.debugLineNum = 5;BA.debugLine="Private Item  As AdapterListKala";
cls_kalapaging2._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");__ref.setField("_item",cls_kalapaging2._item);
 //BA.debugLineNum = 7;BA.debugLine="Private pnl_bk As Panel";
cls_kalapaging2._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_kalapaging2._pnl_bk);
 //BA.debugLineNum = 8;BA.debugLine="Private lbl_title As Label";
cls_kalapaging2._lbl_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_title",cls_kalapaging2._lbl_title);
 //BA.debugLineNum = 9;BA.debugLine="Private LblFee As Label";
cls_kalapaging2._lblfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfee",cls_kalapaging2._lblfee);
 //BA.debugLineNum = 10;BA.debugLine="Private Panel1 As Panel";
cls_kalapaging2._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",cls_kalapaging2._panel1);
 //BA.debugLineNum = 11;BA.debugLine="Private BtnUpJoz As Label";
cls_kalapaging2._btnupjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupjoz",cls_kalapaging2._btnupjoz);
 //BA.debugLineNum = 12;BA.debugLine="Private BtnDownJoz As Label";
cls_kalapaging2._btndownjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownjoz",cls_kalapaging2._btndownjoz);
 //BA.debugLineNum = 13;BA.debugLine="Private LblTedadJoz As Label";
cls_kalapaging2._lbltedadjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadjoz",cls_kalapaging2._lbltedadjoz);
 //BA.debugLineNum = 14;BA.debugLine="Private Panel2 As Panel";
cls_kalapaging2._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel2",cls_kalapaging2._panel2);
 //BA.debugLineNum = 15;BA.debugLine="Private BtnUpKol As Label";
cls_kalapaging2._btnupkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupkol",cls_kalapaging2._btnupkol);
 //BA.debugLineNum = 16;BA.debugLine="Private BtnDownKol As Label";
cls_kalapaging2._btndownkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownkol",cls_kalapaging2._btndownkol);
 //BA.debugLineNum = 17;BA.debugLine="Private LblTedadkol As Label";
cls_kalapaging2._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkol",cls_kalapaging2._lbltedadkol);
 //BA.debugLineNum = 18;BA.debugLine="Private Panel3 As Panel";
cls_kalapaging2._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel3",cls_kalapaging2._panel3);
 //BA.debugLineNum = 20;BA.debugLine="Private lbl_sum As Label";
cls_kalapaging2._lbl_sum = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_sum",cls_kalapaging2._lbl_sum);
 //BA.debugLineNum = 22;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
cls_kalapaging2._lblfeebadaztakhfid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfeebadaztakhfid",cls_kalapaging2._lblfeebadaztakhfid);
 //BA.debugLineNum = 23;BA.debugLine="Private LblTedadKarton As Label";
cls_kalapaging2._lbltedadkarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkarton",cls_kalapaging2._lbltedadkarton);
 //BA.debugLineNum = 24;BA.debugLine="Private LblMojoodi As Label";
cls_kalapaging2._lblmojoodi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodi",cls_kalapaging2._lblmojoodi);
 //BA.debugLineNum = 25;BA.debugLine="Private LblC_Kala As Label";
cls_kalapaging2._lblc_kala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblc_kala",cls_kalapaging2._lblc_kala);
 //BA.debugLineNum = 27;BA.debugLine="Private options As B4XListTemplate";
cls_kalapaging2._options = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xlisttemplate");__ref.setField("_options",cls_kalapaging2._options);
 //BA.debugLineNum = 28;BA.debugLine="Private Dialog As B4XDialog";
cls_kalapaging2._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");__ref.setField("_dialog",cls_kalapaging2._dialog);
 //BA.debugLineNum = 29;BA.debugLine="Private XUI As XUI";
cls_kalapaging2._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cls_kalapaging2._xui);
 //BA.debugLineNum = 30;BA.debugLine="Private base As B4XView";
cls_kalapaging2._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",cls_kalapaging2._base);
 //BA.debugLineNum = 32;BA.debugLine="Private lbl_changePrice As Label";
cls_kalapaging2._lbl_changeprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_changeprice",cls_kalapaging2._lbl_changeprice);
 //BA.debugLineNum = 33;BA.debugLine="Private btn_edit_Price As Label";
cls_kalapaging2._btn_edit_price = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btn_edit_price",cls_kalapaging2._btn_edit_price);
 //BA.debugLineNum = 34;BA.debugLine="Private LblTedadEshan As Label";
cls_kalapaging2._lbltedadeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadeshan",cls_kalapaging2._lbltedadeshan);
 //BA.debugLineNum = 35;BA.debugLine="Private BtnDownEshan As Label";
cls_kalapaging2._btndowneshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndowneshan",cls_kalapaging2._btndowneshan);
 //BA.debugLineNum = 36;BA.debugLine="Private BtnUpEshan As Label";
cls_kalapaging2._btnupeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupeshan",cls_kalapaging2._btnupeshan);
 //BA.debugLineNum = 37;BA.debugLine="Private ImageRow As ImageView";
cls_kalapaging2._imagerow = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imagerow",cls_kalapaging2._imagerow);
 //BA.debugLineNum = 38;BA.debugLine="Private ImageOff As ImageView";
cls_kalapaging2._imageoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageoff",cls_kalapaging2._imageoff);
 //BA.debugLineNum = 41;BA.debugLine="Private lblVahedKol As Label";
cls_kalapaging2._lblvahedkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedkol",cls_kalapaging2._lblvahedkol);
 //BA.debugLineNum = 42;BA.debugLine="Private lblVahedJoz As Label";
cls_kalapaging2._lblvahedjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedjoz",cls_kalapaging2._lblvahedjoz);
 //BA.debugLineNum = 43;BA.debugLine="Private LblGift As Label";
cls_kalapaging2._lblgift = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblgift",cls_kalapaging2._lblgift);
 //BA.debugLineNum = 44;BA.debugLine="Private LblTozihat As Label";
cls_kalapaging2._lbltozihat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltozihat",cls_kalapaging2._lbltozihat);
 //BA.debugLineNum = 45;BA.debugLine="Private Label1 As Label";
cls_kalapaging2._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",cls_kalapaging2._label1);
 //BA.debugLineNum = 46;BA.debugLine="Private LblMojoodiKol As Label";
cls_kalapaging2._lblmojoodikol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodikol",cls_kalapaging2._lblmojoodikol);
 //BA.debugLineNum = 47;BA.debugLine="Private LblMojoodiJoz As Label";
cls_kalapaging2._lblmojoodijoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodijoz",cls_kalapaging2._lblmojoodijoz);
 //BA.debugLineNum = 48;BA.debugLine="Dim maxkolRond As Long";
cls_kalapaging2._maxkolrond = RemoteObject.createImmutable(0L);__ref.setField("_maxkolrond",cls_kalapaging2._maxkolrond);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_kalapaging2","getheight", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPanel (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_kalapaging2","getpanel", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(4);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 68;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWidth (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_kalapaging2","getwidth", __ref);}
 BA.debugLineNum = 75;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Return pnl_bk.Width";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagerow_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ImageRow_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,475);
if (RapidSub.canDelegate("imagerow_click")) { return __ref.runUserSub(false, "cls_kalapaging2","imagerow_click", __ref);}
 BA.debugLineNum = 475;BA.debugLine="Private Sub ImageRow_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 476;BA.debugLine="Act_ImageSlideShow.Item = Item";
Debug.ShouldStop(134217728);
cls_kalapaging2._act_imageslideshow._item /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ );
 BA.debugLineNum = 477;BA.debugLine="StartActivity(Act_ImageSlideShow)";
Debug.ShouldStop(268435456);
cls_kalapaging2.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_kalapaging2._act_imageslideshow.getObject())));
 BA.debugLineNum = 479;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mdl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_kalapaging2","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 51;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="base = mdl";
Debug.ShouldStop(524288);
__ref.getField(false,"_base" /*RemoteObject*/ ).setObject (_mdl);
 BA.debugLineNum = 53;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_key" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 54;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 55;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_kalapaging2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_kalapaging2.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 57;BA.debugLine="p.LoadLayout(\"L_PageKala_Search\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_PageKala_Search")),__ref.getField(false, "ba"));
 BA.debugLineNum = 59;BA.debugLine="Dialog.Initialize (base)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )));
 BA.debugLineNum = 60;BA.debugLine="options.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_options" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 61;BA.debugLine="options.AllowMultiSelection = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_options" /*RemoteObject*/ ).setField ("_allowmultiselection" /*RemoteObject*/ ,cls_kalapaging2.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="options.MultiSelectionMinimum = 1";
Debug.ShouldStop(536870912);
__ref.getField(false,"_options" /*RemoteObject*/ ).setField ("_multiselectionminimum" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_changeprice_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lbl_changePrice_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("lbl_changeprice_click")) { return __ref.runUserSub(false, "cls_kalapaging2","lbl_changeprice_click", __ref);}
 BA.debugLineNum = 481;BA.debugLine="Private Sub lbl_changePrice_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 495;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblgift_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblGift_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,305);
if (RapidSub.canDelegate("lblgift_click")) { return __ref.runUserSub(false, "cls_kalapaging2","lblgift_click", __ref);}
 BA.debugLineNum = 305;BA.debugLine="Sub LblGift_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbltedadjoz_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblTedadJoz_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,497);
if (RapidSub.canDelegate("lbltedadjoz_click")) { return __ref.runUserSub(false, "cls_kalapaging2","lbltedadjoz_click", __ref);}
 BA.debugLineNum = 497;BA.debugLine="Private Sub LblTedadJoz_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 520;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbltedadkol_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblTedadkol_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,522);
if (RapidSub.canDelegate("lbltedadkol_click")) { return __ref.runUserSub(false, "cls_kalapaging2","lbltedadkol_click", __ref);}
 BA.debugLineNum = 522;BA.debugLine="Private Sub LblTedadkol_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 539;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbltozihat_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblTozihat_Click (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,337);
if (RapidSub.canDelegate("lbltozihat_click")) { return __ref.runUserSub(false, "cls_kalapaging2","lbltozihat_click", __ref);}
 BA.debugLineNum = 337;BA.debugLine="Private Sub LblTozihat_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("show (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_kalapaging2","show", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 79;BA.debugLine="Sub show(data As AdapterListKala)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Item=data";
Debug.ShouldStop(32768);
__ref.setField ("_item" /*RemoteObject*/ ,_data);
 BA.debugLineNum = 81;BA.debugLine="CallSubDelayed(base,\"RefreshLblSabad\")";
Debug.ShouldStop(65536);
cls_kalapaging2.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((__ref.getField(false,"_base" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.createImmutable("RefreshLblSabad")));
 BA.debugLineNum = 82;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 83;BA.debugLine="lbl_title.Text = Item.NameKala";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbl_title" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameKala" /*RemoteObject*/ )));
 BA.debugLineNum = 84;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & Item.CodeKala";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblc_kala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد کالا: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 85;BA.debugLine="LblGift.Visible=MCode.CheckEshantion(Item.CodeKa";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblgift" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging2._mcode.runMethod(true,"_checkeshantion" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 87;BA.debugLine="If IsNumber(Item.FldFeeBadAzTakhfif) = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",cls_kalapaging2.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),cls_kalapaging2.__c.getField(true,"True"))) { 
 BA.debugLineNum = 88;BA.debugLine="If Item.FldFeeBadAzTakhfif > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 89;BA.debugLine="MCode.Rs.Initialize(NumberFormat(Item.FeeForoo";
Debug.ShouldStop(16777216);
cls_kalapaging2._mcode._rs /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(cls_kalapaging2.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_kalapaging2._mcode._vahedpool /*RemoteObject*/ ))));
 BA.debugLineNum = 90;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
Debug.ShouldStop(33554432);
cls_kalapaging2._mcode._rs /*RemoteObject*/ .runVoidMethod ("Strikethrough",(Object)(BA.numberCast(int.class, 0)),(Object)(cls_kalapaging2._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 91;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
Debug.ShouldStop(67108864);
cls_kalapaging2._mcode._rs /*RemoteObject*/ .runVoidMethod ("Color",(Object)(cls_kalapaging2.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_kalapaging2._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 92;BA.debugLine="LblFee.Text = MCode.Rs";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_kalapaging2._mcode._rs /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 93;BA.debugLine="LblFeeBadAzTakhfid.Text = NumberFormat(Item.Fl";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_kalapaging2.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_kalapaging2._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 94;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging2.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 96;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_kalapaging2.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_kalapaging2._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 97;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(1);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 98;BA.debugLine="ImageOff.Visible=False";
Debug.ShouldStop(2);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging2.__c.getField(true,"False"));
 };
 }else {
 BA.debugLineNum = 101;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3)";
Debug.ShouldStop(16);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_kalapaging2.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_kalapaging2._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 102;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(32);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 104;BA.debugLine="If Item.TedadDarKarton<>0 And IsNumber(Item.Teda";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",cls_kalapaging2.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))),cls_kalapaging2.__c.getField(true,"True"))) { 
 BA.debugLineNum = 105;BA.debugLine="maxkolRond=(Item.SumMande/Item.TedadDarKarton)";
Debug.ShouldStop(256);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,BA.numberCast(long.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "/",0, 0))));
 BA.debugLineNum = 106;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& Item.Te";
Debug.ShouldStop(512);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 BA.debugLineNum = 107;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(1024);
cls_kalapaging2.__c.runVoidMethod ("LogImpl","595551516",BA.NumberToString(__ref.getField(true,"_maxkolrond" /*RemoteObject*/ )),0);
 }else {
 BA.debugLineNum = 109;BA.debugLine="maxkolRond=0";
Debug.ShouldStop(4096);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 110;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن:\"&maxkolRon";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن:"),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ))));
 BA.debugLineNum = 111;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 };
 BA.debugLineNum = 113;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(65536);
cls_kalapaging2.__c.runVoidMethod ("LogImpl","595551522",BA.NumberToString(__ref.getField(true,"_maxkolrond" /*RemoteObject*/ )),0);
 BA.debugLineNum = 114;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& Item.SumMand";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی جزء: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 116;BA.debugLine="If  Item.SumMandeKarton <> Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 117;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی کل: "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 119;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 };
 BA.debugLineNum = 122;BA.debugLine="If MCode.HideMojodi=1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",cls_kalapaging2._mcode._hidemojodi /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 123;BA.debugLine="LblMojoodiJoz.Visible=False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging2.__c.getField(true,"False"));
 BA.debugLineNum = 124;BA.debugLine="LblMojoodiKol.Visible=False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging2.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 126;BA.debugLine="LblMojoodiJoz.Visible=True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging2.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="LblMojoodiKol.Visible=True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging2.__c.getField(true,"True"));
 };
 BA.debugLineNum = 129;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 130;BA.debugLine="myCode.DownloadImage5(Item.CodeKala,Item.fldPat";
Debug.ShouldStop(2);
cls_kalapaging2._mycode.runVoidMethod ("_downloadimage5" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldPathPic" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_imagerow" /*RemoteObject*/ )));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e50) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e50.toString()); BA.debugLineNum = 150;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
cls_kalapaging2.__c.runVoidMethod ("LogImpl","595551559",BA.ObjectToString(cls_kalapaging2.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 152;BA.debugLine="LblGift.Visible=MCode.CheckEshantion(Item.CodeKa";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblgift" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging2._mcode.runMethod(true,"_checkeshantion" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e54) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e54.toString()); BA.debugLineNum = 268;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
cls_kalapaging2.__c.runVoidMethod ("LogImpl","595551677",BA.ObjectToString(cls_kalapaging2.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _status(RemoteObject __ref,RemoteObject _enable) throws Exception{
try {
		Debug.PushSubsStack("Status (cls_kalapaging2) ","cls_kalapaging2",70,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("status")) { return __ref.runUserSub(false, "cls_kalapaging2","status", __ref, _enable);}
Debug.locals.put("Enable", _enable);
 BA.debugLineNum = 277;BA.debugLine="Sub Status(Enable As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="LogColor(\"status: \"&Enable,Colors.Red)";
Debug.ShouldStop(2097152);
cls_kalapaging2.__c.runVoidMethod ("LogImpl","595617025",RemoteObject.concat(RemoteObject.createImmutable("status: "),_enable),cls_kalapaging2.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 279;BA.debugLine="BtnDownEshan.Enabled=Enable";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btndowneshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 280;BA.debugLine="BtnUpEshan.Enabled=Enable";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnupeshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 281;BA.debugLine="LblTedadEshan.Enabled=Enable";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 283;BA.debugLine="BtnDownJoz.Enabled=Enable";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btndownjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 284;BA.debugLine="BtnUpJoz.Enabled=Enable";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnupjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 285;BA.debugLine="LblTedadJoz.Enabled=Enable";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 287;BA.debugLine="BtnDownKol.Enabled=Enable";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btndownkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 288;BA.debugLine="BtnUpKol.Enabled=Enable";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btnupkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 289;BA.debugLine="LblTedadkol.Enabled=Enable";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}