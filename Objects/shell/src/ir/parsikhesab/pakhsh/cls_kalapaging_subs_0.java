package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_kalapaging_subs_0 {


public static RemoteObject  _add_item(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("Add_Item (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("add_item")) { return __ref.runUserSub(false, "cls_kalapaging","add_item", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 256;BA.debugLine="Private Sub Add_Item(s As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 258;BA.debugLine="If s=Null Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("n",_s)) { 
 BA.debugLineNum = 259;BA.debugLine="Log(\"Null\")";
Debug.ShouldStop(4);
cls_kalapaging.__c.runVoidMethod ("LogImpl","593913091",RemoteObject.createImmutable("Null"),0);
 }else 
{ BA.debugLineNum = 260;BA.debugLine="Else If s.Trim=\"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_s.runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 261;BA.debugLine="Log(\"empty\")";
Debug.ShouldStop(16);
cls_kalapaging.__c.runVoidMethod ("LogImpl","593913093",RemoteObject.createImmutable("empty"),0);
 }else 
{ BA.debugLineNum = 262;BA.debugLine="Else If s.Trim=\"0\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_s.runMethod(true,"trim"),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 263;BA.debugLine="Log(\"zeroo\")";
Debug.ShouldStop(64);
cls_kalapaging.__c.runVoidMethod ("LogImpl","593913095",RemoteObject.createImmutable("zeroo"),0);
 }else {
 BA.debugLineNum = 265;BA.debugLine="options.Options.Add(s)";
Debug.ShouldStop(256);
__ref.getField(false,"_options" /*RemoteObject*/ ).getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }}}
;
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
public static RemoteObject  _addeshantion(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("AddEshantion (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,308);
if (RapidSub.canDelegate("addeshantion")) { return __ref.runUserSub(false, "cls_kalapaging","addeshantion", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 308;BA.debugLine="Sub AddEshantion(t As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("AddToSabad (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,447);
if (RapidSub.canDelegate("addtosabad")) { return __ref.runUserSub(false, "cls_kalapaging","addtosabad", __ref);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _check = RemoteObject.createImmutable(false);
int _i = 0;
 BA.debugLineNum = 447;BA.debugLine="Sub AddToSabad";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 449;BA.debugLine="LblTedadJoz.Text = Item.TedadDarSabadJoz";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )));
 BA.debugLineNum = 450;BA.debugLine="LblTedadkol.Text = Item.TedadDarSabadKol";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )));
 BA.debugLineNum = 451;BA.debugLine="LblTedadEshan.Text = Item.FldEshantion";
Debug.ShouldStop(4);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )));
 BA.debugLineNum = 453;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(16);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_kalapaging._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 454;BA.debugLine="Dim Check As Boolean";
Debug.ShouldStop(32);
_check = RemoteObject.createImmutable(false);Debug.locals.put("Check", _check);
 BA.debugLineNum = 455;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(64);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 456;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(128);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 457;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 458;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 459;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
Debug.ShouldStop(1024);
cls_kalapaging._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldCodeKala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 461;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
Debug.ShouldStop(4096);
cls_kalapaging._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadDarSabadJoz = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadDarSabadKol = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("', FldEshantion = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ),RemoteObject.createImmutable("' Where FldCodeKala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 464;BA.debugLine="Check = True";
Debug.ShouldStop(32768);
_check = cls_kalapaging.__c.getField(true,"True");Debug.locals.put("Check", _check);
 BA.debugLineNum = 465;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 468;BA.debugLine="If Check = False Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,cls_kalapaging.__c.getField(true,"False"))) { 
 BA.debugLineNum = 469;BA.debugLine="MCode.AddToSabad(Item)";
Debug.ShouldStop(1048576);
cls_kalapaging._mcode.runVoidMethod ("_addtosabad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 472;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(8388608);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_refreshlblsabad" /*RemoteObject*/ );
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
public static RemoteObject  _btn_back_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_back_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,499);
if (RapidSub.canDelegate("btn_back_click")) { return __ref.runUserSub(false, "cls_kalapaging","btn_back_click", __ref);}
 BA.debugLineNum = 499;BA.debugLine="Private Sub btn_back_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 502;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("btn_close_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,504);
if (RapidSub.canDelegate("btn_close_click")) { return __ref.runUserSub(false, "cls_kalapaging","btn_close_click", __ref);}
 BA.debugLineNum = 504;BA.debugLine="Private Sub btn_close_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 505;BA.debugLine="btn_back_Click";
Debug.ShouldStop(16777216);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_btn_back_click" /*RemoteObject*/ );
 BA.debugLineNum = 506;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_edit_price_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_edit_Price_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,538);
if (RapidSub.canDelegate("btn_edit_price_click")) { return __ref.runUserSub(false, "cls_kalapaging","btn_edit_price_click", __ref);}
 BA.debugLineNum = 538;BA.debugLine="Private Sub btn_edit_Price_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndowneshan_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnDownEshan_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,587);
if (RapidSub.canDelegate("btndowneshan_click")) { return __ref.runUserSub(false, "cls_kalapaging","btndowneshan_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 587;BA.debugLine="Sub BtnDownEshan_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 588;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 589;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(4096);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 590;BA.debugLine="A = Item.FldEshantion";
Debug.ShouldStop(8192);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 591;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 592;BA.debugLine="A = A - 1";
Debug.ShouldStop(32768);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 593;BA.debugLine="Item.SumMande = Item.SumMande + 1";
Debug.ShouldStop(65536);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "+",1, 0)));
 BA.debugLineNum = 594;BA.debugLine="Item.FldEshantion  = A";
Debug.ShouldStop(131072);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 596;BA.debugLine="AddToSabad";
Debug.ShouldStop(524288);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_addtosabad" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 598;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(2097152);
cls_kalapaging._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_kalapaging.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 599;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
cls_kalapaging.__c.runVoidMethod ("LogImpl","595027212",BA.ObjectToString(cls_kalapaging.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 601;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("BtnDownJoz_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,383);
if (RapidSub.canDelegate("btndownjoz_click")) { return __ref.runUserSub(false, "cls_kalapaging","btndownjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 383;BA.debugLine="Sub BtnDownJoz_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 385;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(1);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 386;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(2);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 387;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(cls_kalapaging._mcode._isfloat /*RemoteObject*/ ,cls_kalapaging.__c.getField(true,"True"),cls_kalapaging.__c.getField(true,"False"))) {
case 0: {
 BA.debugLineNum = 389;BA.debugLine="Val = 0.25";
Debug.ShouldStop(16);
_val = BA.numberCast(float.class, 0.25);Debug.locals.put("Val", _val);
 break; }
case 1: {
 BA.debugLineNum = 391;BA.debugLine="Val = 1";
Debug.ShouldStop(64);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 break; }
}
;
 BA.debugLineNum = 394;BA.debugLine="A = Item.TedadDarSabadJoz";
Debug.ShouldStop(512);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 395;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 396;BA.debugLine="A = A - Val";
Debug.ShouldStop(2048);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "-",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 397;BA.debugLine="Item.SumMande = Item.SumMande + Val";
Debug.ShouldStop(4096);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "+",1, 0)));
 BA.debugLineNum = 398;BA.debugLine="Item.TedadDarSabadJoz = A";
Debug.ShouldStop(8192);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 406;BA.debugLine="AddToSabad";
Debug.ShouldStop(2097152);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("BtnDownKol_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,436);
if (RapidSub.canDelegate("btndownkol_click")) { return __ref.runUserSub(false, "cls_kalapaging","btndownkol_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 436;BA.debugLine="Sub BtnDownKol_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 437;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(1048576);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 438;BA.debugLine="A = Item.TedadDarSabadKol";
Debug.ShouldStop(2097152);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 439;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 440;BA.debugLine="A = A - 1";
Debug.ShouldStop(8388608);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 441;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton + Item";
Debug.ShouldStop(16777216);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))}, "+",1, 0)));
 BA.debugLineNum = 442;BA.debugLine="Item.TedadDarSabadKol = A";
Debug.ShouldStop(33554432);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 444;BA.debugLine="AddToSabad";
Debug.ShouldStop(134217728);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("BtnUpEshan_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,557);
if (RapidSub.canDelegate("btnupeshan_click")) { return __ref.runUserSub(false, "cls_kalapaging","btnupeshan_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
 BA.debugLineNum = 557;BA.debugLine="Sub BtnUpEshan_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 559;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(16384);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 560;BA.debugLine="Dim B As Int = 0";
Debug.ShouldStop(32768);
_b = BA.numberCast(int.class, 0);Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 561;BA.debugLine="A = Item.FldEshantion";
Debug.ShouldStop(65536);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 562;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",cls_kalapaging._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 563;BA.debugLine="If Item.FldEshantion<Item.fldCountEshantion The";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 564;BA.debugLine="A = A + 1";
Debug.ShouldStop(524288);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 565;BA.debugLine="Item.SumMande = Item.SumMande - 1";
Debug.ShouldStop(1048576);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "-",1, 0)));
 };
 }else 
{ BA.debugLineNum = 568;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",cls_kalapaging._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 569;BA.debugLine="B = Item.SumMande - ((Item.TedadDarSabadKol * I";
Debug.ShouldStop(16777216);
_b = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ))}, "++",2, 0))}, "-",1, 0));Debug.locals.put("B", _b);
 BA.debugLineNum = 570;BA.debugLine="If B > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_b,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 571;BA.debugLine="If Item.FldEshantion<Item.fldCountEshantion Th";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 572;BA.debugLine="A = A + 1";
Debug.ShouldStop(134217728);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 573;BA.debugLine="Item.SumMande = Item.SumMande - 1";
Debug.ShouldStop(268435456);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "-",1, 0)));
 };
 }else {
 BA.debugLineNum = 576;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(-2147483648);
cls_kalapaging.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_kalapaging.__c.getField(true,"True")));
 };
 }}
;
 BA.debugLineNum = 579;BA.debugLine="Item.FldEshantion = A";
Debug.ShouldStop(4);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 580;BA.debugLine="AddToSabad";
Debug.ShouldStop(8);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_addtosabad" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e24.toString()); BA.debugLineNum = 582;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(32);
cls_kalapaging._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_kalapaging.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 583;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
cls_kalapaging.__c.runVoidMethod ("LogImpl","594961690",BA.ObjectToString(cls_kalapaging.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 585;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("BtnUpJoz_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("btnupjoz_click")) { return __ref.runUserSub(false, "cls_kalapaging","btnupjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 342;BA.debugLine="Sub BtnUpJoz_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(4194304);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 344;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(8388608);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 345;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(cls_kalapaging._mcode._isfloat /*RemoteObject*/ ,cls_kalapaging.__c.getField(true,"True"),cls_kalapaging.__c.getField(true,"False"))) {
case 0: {
 BA.debugLineNum = 347;BA.debugLine="Val = 0.25";
Debug.ShouldStop(67108864);
_val = BA.numberCast(float.class, 0.25);Debug.locals.put("Val", _val);
 break; }
case 1: {
 BA.debugLineNum = 349;BA.debugLine="Val = 1";
Debug.ShouldStop(268435456);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 break; }
}
;
 BA.debugLineNum = 351;BA.debugLine="If	Item.TedadDarSabadJoz=Null Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 352;BA.debugLine="Item.TedadDarSabadJoz=0";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 353;BA.debugLine="LblTedadJoz.Text=0";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 356;BA.debugLine="A = Item.TedadDarSabadJoz";
Debug.ShouldStop(8);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 357;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",cls_kalapaging._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 358;BA.debugLine="A = A + Val";
Debug.ShouldStop(32);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 359;BA.debugLine="Item.SumMande = Item.SumMande - Val";
Debug.ShouldStop(64);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 360;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",cls_kalapaging._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 361;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",cls_kalapaging._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 362;BA.debugLine="A = A + Val";
Debug.ShouldStop(512);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 363;BA.debugLine="Item.SumMande = Item.SumMande - Val";
Debug.ShouldStop(1024);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 365;BA.debugLine="If Item.SumMande > 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 366;BA.debugLine="A = A + Val";
Debug.ShouldStop(8192);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 367;BA.debugLine="Item.SumMande = Item.SumMande - Val";
Debug.ShouldStop(16384);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 369;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(65536);
cls_kalapaging.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_kalapaging.__c.getField(true,"True")));
 };
 };
 }}
;
 BA.debugLineNum = 373;BA.debugLine="Item.TedadDarSabadJoz = A";
Debug.ShouldStop(1048576);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 380;BA.debugLine="AddToSabad";
Debug.ShouldStop(134217728);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("BtnUpKol_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,409);
if (RapidSub.canDelegate("btnupkol_click")) { return __ref.runUserSub(false, "cls_kalapaging","btnupkol_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 409;BA.debugLine="Sub BtnUpKol_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 410;BA.debugLine="If Item.TedadDarKarton=0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 411;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 413;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(268435456);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 414;BA.debugLine="A = Item.TedadDarSabadKol";
Debug.ShouldStop(536870912);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 415;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",cls_kalapaging._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 416;BA.debugLine="A = A + 1";
Debug.ShouldStop(-2147483648);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 417;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - A";
Debug.ShouldStop(1);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_a}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 418;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",cls_kalapaging._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 419;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",cls_kalapaging._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 420;BA.debugLine="A = A + 1";
Debug.ShouldStop(8);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 421;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Ite";
Debug.ShouldStop(16);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))}, "-",1, 0)));
 }else {
 BA.debugLineNum = 423;BA.debugLine="If Item.SumMandeKarton >= Item.TedadDarSabadKol";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 424;BA.debugLine="A = A + 1";
Debug.ShouldStop(128);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 425;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - It";
Debug.ShouldStop(256);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))}, "-",1, 0)));
 }else {
 BA.debugLineNum = 427;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(1024);
cls_kalapaging.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_kalapaging.__c.getField(true,"True")));
 };
 };
 }}
;
 BA.debugLineNum = 432;BA.debugLine="Item.TedadDarSabadKol = A";
Debug.ShouldStop(32768);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 433;BA.debugLine="AddToSabad";
Debug.ShouldStop(65536);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
cls_kalapaging._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_kalapaging._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_kalapaging._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_kalapaging._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private Key As IME";
cls_kalapaging._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_key",cls_kalapaging._key);
 //BA.debugLineNum = 5;BA.debugLine="Private Item  As AdapterListKala";
cls_kalapaging._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");__ref.setField("_item",cls_kalapaging._item);
 //BA.debugLineNum = 7;BA.debugLine="Private pnl_bk As Panel";
cls_kalapaging._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_kalapaging._pnl_bk);
 //BA.debugLineNum = 8;BA.debugLine="Private lbl_title As Label";
cls_kalapaging._lbl_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_title",cls_kalapaging._lbl_title);
 //BA.debugLineNum = 9;BA.debugLine="Private LblFee As Label";
cls_kalapaging._lblfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfee",cls_kalapaging._lblfee);
 //BA.debugLineNum = 10;BA.debugLine="Private Panel1 As Panel";
cls_kalapaging._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",cls_kalapaging._panel1);
 //BA.debugLineNum = 11;BA.debugLine="Private BtnUpJoz As Label";
cls_kalapaging._btnupjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupjoz",cls_kalapaging._btnupjoz);
 //BA.debugLineNum = 12;BA.debugLine="Private BtnDownJoz As Label";
cls_kalapaging._btndownjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownjoz",cls_kalapaging._btndownjoz);
 //BA.debugLineNum = 13;BA.debugLine="Private LblTedadJoz As Label";
cls_kalapaging._lbltedadjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadjoz",cls_kalapaging._lbltedadjoz);
 //BA.debugLineNum = 14;BA.debugLine="Private Panel2 As Panel";
cls_kalapaging._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel2",cls_kalapaging._panel2);
 //BA.debugLineNum = 15;BA.debugLine="Private BtnUpKol As Label";
cls_kalapaging._btnupkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupkol",cls_kalapaging._btnupkol);
 //BA.debugLineNum = 16;BA.debugLine="Private BtnDownKol As Label";
cls_kalapaging._btndownkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownkol",cls_kalapaging._btndownkol);
 //BA.debugLineNum = 17;BA.debugLine="Private LblTedadkol As Label";
cls_kalapaging._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkol",cls_kalapaging._lbltedadkol);
 //BA.debugLineNum = 18;BA.debugLine="Private Panel3 As Panel";
cls_kalapaging._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel3",cls_kalapaging._panel3);
 //BA.debugLineNum = 21;BA.debugLine="Private Label4 As Label";
cls_kalapaging._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label4",cls_kalapaging._label4);
 //BA.debugLineNum = 22;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
cls_kalapaging._lblfeebadaztakhfid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfeebadaztakhfid",cls_kalapaging._lblfeebadaztakhfid);
 //BA.debugLineNum = 23;BA.debugLine="Private LblTedadKarton As Label";
cls_kalapaging._lbltedadkarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkarton",cls_kalapaging._lbltedadkarton);
 //BA.debugLineNum = 24;BA.debugLine="Private LblMojoodiJoz As Label";
cls_kalapaging._lblmojoodijoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodijoz",cls_kalapaging._lblmojoodijoz);
 //BA.debugLineNum = 25;BA.debugLine="Private LblMojoodiKol As Label";
cls_kalapaging._lblmojoodikol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodikol",cls_kalapaging._lblmojoodikol);
 //BA.debugLineNum = 26;BA.debugLine="Private LblC_Kala As Label";
cls_kalapaging._lblc_kala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblc_kala",cls_kalapaging._lblc_kala);
 //BA.debugLineNum = 28;BA.debugLine="Private options As B4XListTemplate";
cls_kalapaging._options = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xlisttemplate");__ref.setField("_options",cls_kalapaging._options);
 //BA.debugLineNum = 29;BA.debugLine="Private Dialog As B4XDialog";
cls_kalapaging._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");__ref.setField("_dialog",cls_kalapaging._dialog);
 //BA.debugLineNum = 30;BA.debugLine="Private XUI As XUI";
cls_kalapaging._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cls_kalapaging._xui);
 //BA.debugLineNum = 31;BA.debugLine="Private base As B4XView";
cls_kalapaging._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",cls_kalapaging._base);
 //BA.debugLineNum = 33;BA.debugLine="Private lbl_changePrice As Label";
cls_kalapaging._lbl_changeprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_changeprice",cls_kalapaging._lbl_changeprice);
 //BA.debugLineNum = 34;BA.debugLine="Private btn_edit_Price As Label";
cls_kalapaging._btn_edit_price = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btn_edit_price",cls_kalapaging._btn_edit_price);
 //BA.debugLineNum = 35;BA.debugLine="Private LblTedadEshan As Label";
cls_kalapaging._lbltedadeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadeshan",cls_kalapaging._lbltedadeshan);
 //BA.debugLineNum = 36;BA.debugLine="Private BtnDownEshan As Label";
cls_kalapaging._btndowneshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndowneshan",cls_kalapaging._btndowneshan);
 //BA.debugLineNum = 37;BA.debugLine="Private BtnUpEshan As Label";
cls_kalapaging._btnupeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupeshan",cls_kalapaging._btnupeshan);
 //BA.debugLineNum = 38;BA.debugLine="Private ImageRow As ImageView";
cls_kalapaging._imagerow = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imagerow",cls_kalapaging._imagerow);
 //BA.debugLineNum = 39;BA.debugLine="Private ImageOff As ImageView";
cls_kalapaging._imageoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageoff",cls_kalapaging._imageoff);
 //BA.debugLineNum = 42;BA.debugLine="Private lblVahedKol As Label";
cls_kalapaging._lblvahedkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedkol",cls_kalapaging._lblvahedkol);
 //BA.debugLineNum = 43;BA.debugLine="Private lblVahedJoz As Label";
cls_kalapaging._lblvahedjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedjoz",cls_kalapaging._lblvahedjoz);
 //BA.debugLineNum = 44;BA.debugLine="Private LblGift As Label";
cls_kalapaging._lblgift = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblgift",cls_kalapaging._lblgift);
 //BA.debugLineNum = 45;BA.debugLine="Private LblTozihat As Label";
cls_kalapaging._lbltozihat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltozihat",cls_kalapaging._lbltozihat);
 //BA.debugLineNum = 46;BA.debugLine="Private Lbl_Bascket As Label";
cls_kalapaging._lbl_bascket = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_bascket",cls_kalapaging._lbl_bascket);
 //BA.debugLineNum = 47;BA.debugLine="Private LblBasketCount As Label";
cls_kalapaging._lblbasketcount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblbasketcount",cls_kalapaging._lblbasketcount);
 //BA.debugLineNum = 48;BA.debugLine="Dim maxkolRond As Long";
cls_kalapaging._maxkolrond = RemoteObject.createImmutable(0L);__ref.setField("_maxkolrond",cls_kalapaging._maxkolrond);
 //BA.debugLineNum = 49;BA.debugLine="Private LblCountEshantion As Label";
cls_kalapaging._lblcounteshantion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcounteshantion",cls_kalapaging._lblcounteshantion);
 //BA.debugLineNum = 50;BA.debugLine="Private LblMablaghMasrafkonande As Label";
cls_kalapaging._lblmablaghmasrafkonande = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghmasrafkonande",cls_kalapaging._lblmablaghmasrafkonande);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_kalapaging","getheight", __ref);}
 BA.debugLineNum = 72;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(256);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("getPanel (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_kalapaging","getpanel", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(8);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 69;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("getWidth (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_kalapaging","getwidth", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Return pnl_bk.Width";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth");
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("ImageRow_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,508);
if (RapidSub.canDelegate("imagerow_click")) { return __ref.runUserSub(false, "cls_kalapaging","imagerow_click", __ref);}
 BA.debugLineNum = 508;BA.debugLine="Private Sub ImageRow_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 509;BA.debugLine="Act_ImageSlideShow.Item = Item";
Debug.ShouldStop(268435456);
cls_kalapaging._act_imageslideshow._item /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ );
 BA.debugLineNum = 510;BA.debugLine="StartActivity(Act_ImageSlideShow)";
Debug.ShouldStop(536870912);
cls_kalapaging.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_kalapaging._act_imageslideshow.getObject())));
 BA.debugLineNum = 512;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Initialize (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_kalapaging","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 53;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="base = mdl";
Debug.ShouldStop(2097152);
__ref.getField(false,"_base" /*RemoteObject*/ ).setObject (_mdl);
 BA.debugLineNum = 55;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_key" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 56;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 57;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_kalapaging.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_kalapaging.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 58;BA.debugLine="p.LoadLayout(\"L_PageKala_2\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_PageKala_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 60;BA.debugLine="Dialog.Initialize (base)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )));
 BA.debugLineNum = 61;BA.debugLine="options.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_options" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 62;BA.debugLine="options.AllowMultiSelection = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_options" /*RemoteObject*/ ).setField ("_allowmultiselection" /*RemoteObject*/ ,cls_kalapaging.__c.getField(true,"False"));
 BA.debugLineNum = 63;BA.debugLine="options.MultiSelectionMinimum = 1";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_options" /*RemoteObject*/ ).setField ("_multiselectionminimum" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lbl_changeprice_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lbl_changePrice_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,514);
if (RapidSub.canDelegate("lbl_changeprice_click")) { __ref.runUserSub(false, "cls_kalapaging","lbl_changeprice_click", __ref); return;}
ResumableSub_lbl_changePrice_Click rsub = new ResumableSub_lbl_changePrice_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lbl_changePrice_Click extends BA.ResumableSub {
public ResumableSub_lbl_changePrice_Click(ir.parsikhesab.pakhsh.cls_kalapaging parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_kalapaging parent;
RemoteObject _timedtemplate = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xtimedtemplate");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lbl_changePrice_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,514);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 515;BA.debugLine="Dialog.Title = \"انتخاب تیپ قیمت\"";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("انتخاب تیپ قیمت")));
 BA.debugLineNum = 516;BA.debugLine="If options.Options.Size<1 Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_options" /*RemoteObject*/ ).getField(false,"_options" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 517;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 519;BA.debugLine="Dim TimedTemplate As B4XTimedTemplate";
Debug.ShouldStop(64);
_timedtemplate = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xtimedtemplate");Debug.locals.put("TimedTemplate", _timedtemplate);
 BA.debugLineNum = 520;BA.debugLine="TimedTemplate.Initialize(options)";
Debug.ShouldStop(128);
_timedtemplate.runClassMethod (ir.parsikhesab.pakhsh.b4xtimedtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref.getField(false,"_options" /*RemoteObject*/ ))));
 BA.debugLineNum = 521;BA.debugLine="TimedTemplate.TimeoutMilliseconds = 10000 'close";
Debug.ShouldStop(256);
_timedtemplate.setField ("_timeoutmilliseconds" /*RemoteObject*/ ,BA.numberCast(int.class, 10000));
 BA.debugLineNum = 522;BA.debugLine="Wait For (Dialog.ShowTemplate(TimedTemplate, \"OK\"";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_kalapaging", "lbl_changeprice_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_timedtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 9;
return;
case 9:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 523;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(1024);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 528;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _lblgift_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblGift_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("lblgift_click")) { return __ref.runUserSub(false, "cls_kalapaging","lblgift_click", __ref);}
 BA.debugLineNum = 269;BA.debugLine="Sub LblGift_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { Debug.CheckDeviceExceptions();
} 
       catch (Exception e3) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e3.toString()); BA.debugLineNum = 296;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
cls_kalapaging.__c.runVoidMethod ("LogImpl","593978651",BA.ObjectToString(cls_kalapaging.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("LblTedadJoz_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,530);
if (RapidSub.canDelegate("lbltedadjoz_click")) { return __ref.runUserSub(false, "cls_kalapaging","lbltedadjoz_click", __ref);}
 BA.debugLineNum = 530;BA.debugLine="Sub LblTedadJoz_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 531;BA.debugLine="CallSubDelayed2(base,\"LblTedadJoz_Click\",Item)";
Debug.ShouldStop(262144);
cls_kalapaging.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((__ref.getField(false,"_base" /*RemoteObject*/ ).getObject())),(Object)(BA.ObjectToString("LblTedadJoz_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 532;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("LblTedadKol_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,534);
if (RapidSub.canDelegate("lbltedadkol_click")) { return __ref.runUserSub(false, "cls_kalapaging","lbltedadkol_click", __ref);}
 BA.debugLineNum = 534;BA.debugLine="Sub LblTedadKol_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 535;BA.debugLine="CallSubDelayed2(base,\"LblTedadKol_Click\",Item)";
Debug.ShouldStop(4194304);
cls_kalapaging.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((__ref.getField(false,"_base" /*RemoteObject*/ ).getObject())),(Object)(BA.ObjectToString("LblTedadKol_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 536;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("LblTozihat_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("lbltozihat_click")) { return __ref.runUserSub(false, "cls_kalapaging","lbltozihat_click", __ref);}
 BA.debugLineNum = 301;BA.debugLine="Private Sub LblTozihat_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel3_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel3_Click (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,603);
if (RapidSub.canDelegate("panel3_click")) { return __ref.runUserSub(false, "cls_kalapaging","panel3_click", __ref);}
 BA.debugLineNum = 603;BA.debugLine="Sub Panel3_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 604;BA.debugLine="If LblBasketCount.Visible Then";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_lblbasketcount" /*RemoteObject*/ ).runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 605;BA.debugLine="CallSubDelayed(Act_KalaPaging,\"Panel3_Click\")";
Debug.ShouldStop(268435456);
cls_kalapaging.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((cls_kalapaging._act_kalapaging.getObject())),(Object)(RemoteObject.createImmutable("Panel3_Click")));
 }else {
 BA.debugLineNum = 607;BA.debugLine="ToastMessageShow(\"سبد خرید خالی است\",False)";
Debug.ShouldStop(1073741824);
cls_kalapaging.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سبد خرید خالی است")),(Object)(cls_kalapaging.__c.getField(true,"False")));
 };
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshlblsabad(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshLblSabad (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,611);
if (RapidSub.canDelegate("refreshlblsabad")) { return __ref.runUserSub(false, "cls_kalapaging","refreshlblsabad", __ref);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 611;BA.debugLine="Sub RefreshLblSabad";
Debug.ShouldStop(4);
 BA.debugLineNum = 612;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 613;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(16);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_kalapaging._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 614;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 615;BA.debugLine="LblBasketCount.Visible=True";
Debug.ShouldStop(64);
__ref.getField(false,"_lblbasketcount" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging.__c.getField(true,"True"));
 BA.debugLineNum = 616;BA.debugLine="LblBasketCount.Text=Cu.RowCount";
Debug.ShouldStop(128);
__ref.getField(false,"_lblbasketcount" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"getRowCount")));
 }else {
 BA.debugLineNum = 619;BA.debugLine="LblBasketCount.Visible=False";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblbasketcount" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging.__c.getField(true,"False"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e10.toString()); BA.debugLineNum = 622;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
cls_kalapaging.__c.runVoidMethod ("LogImpl","595158283",BA.ObjectToString(cls_kalapaging.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 625;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("show (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_kalapaging","show", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 80;BA.debugLine="Sub show(data As AdapterListKala)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Item=data";
Debug.ShouldStop(65536);
__ref.setField ("_item" /*RemoteObject*/ ,_data);
 BA.debugLineNum = 83;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(262144);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_refreshlblsabad" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 86;BA.debugLine="lbl_title.Text = Item.NameKala";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbl_title" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameKala" /*RemoteObject*/ )));
 BA.debugLineNum = 87;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & Item.CodeKala";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblc_kala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد کالا: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 116;BA.debugLine="If IsNumber(Item.FldFeeBadAzTakhfif) = True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",cls_kalapaging.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),cls_kalapaging.__c.getField(true,"True"))) { 
 BA.debugLineNum = 117;BA.debugLine="If Item.FldFeeBadAzTakhfif > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 118;BA.debugLine="MCode.Rs.Initialize(NumberFormat(Item.FeeForoo";
Debug.ShouldStop(2097152);
cls_kalapaging._mcode._rs /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(cls_kalapaging.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_kalapaging._mcode._vahedpool /*RemoteObject*/ ))));
 BA.debugLineNum = 119;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
Debug.ShouldStop(4194304);
cls_kalapaging._mcode._rs /*RemoteObject*/ .runVoidMethod ("Strikethrough",(Object)(BA.numberCast(int.class, 0)),(Object)(cls_kalapaging._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 120;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
Debug.ShouldStop(8388608);
cls_kalapaging._mcode._rs /*RemoteObject*/ .runVoidMethod ("Color",(Object)(cls_kalapaging.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_kalapaging._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 121;BA.debugLine="LblFee.Text = MCode.Rs";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_kalapaging._mcode._rs /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 122;BA.debugLine="LblFeeBadAzTakhfid.Text = NumberFormat(Item.Fl";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_kalapaging.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_kalapaging._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 123;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(67108864);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 125;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_kalapaging.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_kalapaging._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 126;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 127;BA.debugLine="ImageOff.Visible=False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging.__c.getField(true,"False"));
 };
 }else {
 BA.debugLineNum = 130;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3)";
Debug.ShouldStop(2);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_kalapaging.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_kalapaging._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 131;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(4);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 135;BA.debugLine="If Item.TedadDarSabadJoz=Null Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 136;BA.debugLine="LblTedadJoz.Text=0";
Debug.ShouldStop(128);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 137;BA.debugLine="Item.TedadDarSabadJoz=0";
Debug.ShouldStop(256);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(0));
 }else {
 BA.debugLineNum = 139;BA.debugLine="LblTedadJoz.Text =Item.TedadDarSabadJoz";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 141;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& Item.NameVahed";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblvahedjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 143;BA.debugLine="If Item.TedadDarSabadKol=Null Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 144;BA.debugLine="LblTedadkol.Text=0";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 145;BA.debugLine="Item.TedadDarSabadKol=0";
Debug.ShouldStop(65536);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(0));
 }else {
 BA.debugLineNum = 147;BA.debugLine="LblTedadkol.Text =Item.TedadDarSabadKol";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 149;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& Item.NameVahed2";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblvahedkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 161;BA.debugLine="If Item.FldEshantion=Null Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 162;BA.debugLine="Item.FldEshantion=0";
Debug.ShouldStop(2);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 BA.debugLineNum = 165;BA.debugLine="If Item.TedadDarKarton<>0 And IsNumber(Item.Teda";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",cls_kalapaging.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))),cls_kalapaging.__c.getField(true,"True"))) { 
 BA.debugLineNum = 166;BA.debugLine="maxkolRond=(Item.SumMandeKarton)";
Debug.ShouldStop(32);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,BA.numberCast(long.class, (__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ ))));
 BA.debugLineNum = 167;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& Item.Te";
Debug.ShouldStop(64);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 BA.debugLineNum = 168;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(128);
cls_kalapaging.__c.runVoidMethod ("LogImpl","593782104",BA.NumberToString(__ref.getField(true,"_maxkolrond" /*RemoteObject*/ )),0);
 }else {
 BA.debugLineNum = 170;BA.debugLine="maxkolRond=0";
Debug.ShouldStop(512);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 171;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن:\"&maxkolRon";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن:"),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ))));
 BA.debugLineNum = 172;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 };
 BA.debugLineNum = 174;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(8192);
cls_kalapaging.__c.runVoidMethod ("LogImpl","593782110",BA.NumberToString(__ref.getField(true,"_maxkolrond" /*RemoteObject*/ )),0);
 BA.debugLineNum = 175;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& Item.SumMand";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی جزء: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 177;BA.debugLine="If  Item.SumMandeKarton <> Null Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 178;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی کل: "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 180;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 };
 BA.debugLineNum = 185;BA.debugLine="If myCode.Is_Null_adad(Item.FldMablaghMasrafKona";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, cls_kalapaging._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldMablaghMasrafKonande" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 186;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده:";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblmablaghmasrafkonande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("قیمت مصرف کننده: "),cls_kalapaging.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldMablaghMasrafKonande" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_kalapaging._mcode._vahedpool /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 188;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده:";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblmablaghmasrafkonande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("قیمت مصرف کننده: 0"));
 };
 BA.debugLineNum = 191;BA.debugLine="If Item.fldCountEshantion<>Null Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 192;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : \" & Item.f";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblcounteshantion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد هدیه : "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ ))));
 BA.debugLineNum = 193;BA.debugLine="LblTedadEshan.Text=Item.FldEshantion";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 195;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : 0\"";
Debug.ShouldStop(4);
__ref.getField(false,"_lblcounteshantion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("تعداد هدیه : 0"));
 };
 BA.debugLineNum = 200;BA.debugLine="If MCode.HideMojodi=1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",cls_kalapaging._mcode._hidemojodi /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 201;BA.debugLine="LblMojoodiJoz.Visible=False";
Debug.ShouldStop(256);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging.__c.getField(true,"False"));
 BA.debugLineNum = 202;BA.debugLine="LblMojoodiKol.Visible=False";
Debug.ShouldStop(512);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 204;BA.debugLine="LblMojoodiJoz.Visible=True";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging.__c.getField(true,"True"));
 BA.debugLineNum = 205;BA.debugLine="LblMojoodiKol.Visible=True";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_kalapaging.__c.getField(true,"True"));
 };
 BA.debugLineNum = 207;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 208;BA.debugLine="myCode.DownloadImage5(Item.CodeKala,Item.fldPat";
Debug.ShouldStop(32768);
cls_kalapaging._mycode.runVoidMethod ("_downloadimage5" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldPathPic" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_imagerow" /*RemoteObject*/ )));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e77) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e77.toString()); BA.debugLineNum = 228;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
cls_kalapaging.__c.runVoidMethod ("LogImpl","593782164",BA.ObjectToString(cls_kalapaging.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e80) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e80.toString()); BA.debugLineNum = 232;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
cls_kalapaging.__c.runVoidMethod ("LogImpl","593782168",BA.ObjectToString(cls_kalapaging.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 234;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",cls_kalapaging._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 235;BA.debugLine="BtnUpEshan.Enabled=False";
Debug.ShouldStop(1024);
__ref.getField(false,"_btnupeshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_kalapaging.__c.getField(true,"False"));
 BA.debugLineNum = 236;BA.debugLine="BtnDownEshan.Enabled=False";
Debug.ShouldStop(2048);
__ref.getField(false,"_btndowneshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_kalapaging.__c.getField(true,"False"));
 BA.debugLineNum = 237;BA.debugLine="LblTedadEshan.Color=Colors.LightGray";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runVoidMethod ("setColor",cls_kalapaging.__c.getField(false,"Colors").getField(true,"LightGray"));
 };
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Status (cls_kalapaging) ","cls_kalapaging",69,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("status")) { return __ref.runUserSub(false, "cls_kalapaging","status", __ref, _enable);}
Debug.locals.put("Enable", _enable);
 BA.debugLineNum = 241;BA.debugLine="Sub Status(Enable As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 242;BA.debugLine="LogColor(\"status: \"&Enable,Colors.Red)";
Debug.ShouldStop(131072);
cls_kalapaging.__c.runVoidMethod ("LogImpl","593847553",RemoteObject.concat(RemoteObject.createImmutable("status: "),_enable),cls_kalapaging.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 243;BA.debugLine="BtnDownEshan.Enabled=Enable";
Debug.ShouldStop(262144);
__ref.getField(false,"_btndowneshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 244;BA.debugLine="BtnUpEshan.Enabled=Enable";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnupeshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 245;BA.debugLine="LblTedadEshan.Enabled=Enable";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 247;BA.debugLine="BtnDownJoz.Enabled=Enable";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btndownjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 248;BA.debugLine="BtnUpJoz.Enabled=Enable";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnupjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 249;BA.debugLine="LblTedadJoz.Enabled=Enable";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 251;BA.debugLine="BtnDownKol.Enabled=Enable";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btndownkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 252;BA.debugLine="BtnUpKol.Enabled=Enable";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnupkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 253;BA.debugLine="LblTedadkol.Enabled=Enable";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}