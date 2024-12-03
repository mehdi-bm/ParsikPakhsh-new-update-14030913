package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_reckalalisti_subs_0 {


public static RemoteObject  _addeshantion(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("AddEshantion (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("addeshantion")) { return __ref.runUserSub(false, "cls_reckalalisti","addeshantion", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 350;BA.debugLine="Sub AddEshantion(t As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("AddToSabad (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,441);
if (RapidSub.canDelegate("addtosabad")) { return __ref.runUserSub(false, "cls_reckalalisti","addtosabad", __ref);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _check = RemoteObject.createImmutable(false);
int _i = 0;
 BA.debugLineNum = 441;BA.debugLine="Sub AddToSabad";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 443;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_reckalalisti._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 444;BA.debugLine="Dim Check As Boolean";
Debug.ShouldStop(134217728);
_check = RemoteObject.createImmutable(false);Debug.locals.put("Check", _check);
 BA.debugLineNum = 445;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(268435456);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 446;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(536870912);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 447;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 448;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 449;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
Debug.ShouldStop(1);
cls_reckalalisti._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldCodeKala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 451;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
Debug.ShouldStop(4);
cls_reckalalisti._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadDarSabadJoz = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadDarSabadKol = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldEshantion = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ),RemoteObject.createImmutable("' Where FldCodeKala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 454;BA.debugLine="Check = True";
Debug.ShouldStop(32);
_check = cls_reckalalisti.__c.getField(true,"True");Debug.locals.put("Check", _check);
 BA.debugLineNum = 455;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 458;BA.debugLine="If Check = False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_check,cls_reckalalisti.__c.getField(true,"False"))) { 
 BA.debugLineNum = 459;BA.debugLine="MCode.AddToSabad(Item)";
Debug.ShouldStop(1024);
cls_reckalalisti._mcode.runVoidMethod ("_addtosabad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 461;BA.debugLine="CallSubDelayed(base,\"RefreshLblSabad\")";
Debug.ShouldStop(4096);
cls_reckalalisti.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("RefreshLblSabad")));
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_call_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Btn_call_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,267);
if (RapidSub.canDelegate("btn_call_click")) { return __ref.runUserSub(false, "cls_reckalalisti","btn_call_click", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 267;BA.debugLine="Sub Btn_call_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 268;BA.debugLine="Dim str As String=$\"جهت دریافت قیمت همکار لطفا با";
Debug.ShouldStop(2048);
_str = (RemoteObject.concat(RemoteObject.createImmutable("جهت دریافت قیمت همکار لطفا با شماره\n"),RemoteObject.createImmutable("		 021-888821546 \n"),RemoteObject.createImmutable("		 تماس بگیرید")));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 271;BA.debugLine="Msgbox(str,\"قیمت همکاری\")";
Debug.ShouldStop(16384);
cls_reckalalisti.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_str)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("قیمت همکاری"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_discount_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_discount_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,580);
if (RapidSub.canDelegate("btn_discount_click")) { return __ref.runUserSub(false, "cls_reckalalisti","btn_discount_click", __ref);}
 BA.debugLineNum = 580;BA.debugLine="Sub btn_discount_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 581;BA.debugLine="If MCode.TakhfifKala=1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",cls_reckalalisti._mcode._takhfifkala /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 582;BA.debugLine="CallSubDelayed2(base,\"btn_discount_Click\",Item)";
Debug.ShouldStop(32);
cls_reckalalisti.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("btn_discount_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 584;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("btn_edit_Price_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,571);
if (RapidSub.canDelegate("btn_edit_price_click")) { return __ref.runUserSub(false, "cls_reckalalisti","btn_edit_price_click", __ref);}
 BA.debugLineNum = 571;BA.debugLine="Sub btn_edit_Price_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 572;BA.debugLine="CallSubDelayed2(base,\"btn_edit_Price_Click\",Item)";
Debug.ShouldStop(134217728);
cls_reckalalisti.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("btn_edit_Price_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 573;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("BtnDownEshan_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,560);
if (RapidSub.canDelegate("btndowneshan_click")) { return __ref.runUserSub(false, "cls_reckalalisti","btndowneshan_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 560;BA.debugLine="Sub BtnDownEshan_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 561;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(65536);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 562;BA.debugLine="A = Item.FldEshantion";
Debug.ShouldStop(131072);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 563;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 564;BA.debugLine="A = A - 1";
Debug.ShouldStop(524288);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 565;BA.debugLine="Item.SumMande = Item.SumMande + 1";
Debug.ShouldStop(1048576);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "+",1, 0)));
 BA.debugLineNum = 566;BA.debugLine="Item.FldEshantion  = A";
Debug.ShouldStop(2097152);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 568;BA.debugLine="AddToSabad";
Debug.ShouldStop(8388608);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 569;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("BtnDownJoz_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,381);
if (RapidSub.canDelegate("btndownjoz_click")) { return __ref.runUserSub(false, "cls_reckalalisti","btndownjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 381;BA.debugLine="Sub BtnDownJoz_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 383;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(1073741824);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 384;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(-2147483648);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 385;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(cls_reckalalisti._mcode._isfloat /*RemoteObject*/ ,cls_reckalalisti.__c.getField(true,"True"),cls_reckalalisti.__c.getField(true,"False"))) {
case 0: {
 BA.debugLineNum = 387;BA.debugLine="Val = 0.25";
Debug.ShouldStop(4);
_val = BA.numberCast(float.class, 0.25);Debug.locals.put("Val", _val);
 break; }
case 1: {
 BA.debugLineNum = 389;BA.debugLine="Val = 1";
Debug.ShouldStop(16);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 break; }
}
;
 BA.debugLineNum = 392;BA.debugLine="A = Item.TedadDarSabadJoz";
Debug.ShouldStop(128);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 393;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 394;BA.debugLine="A = A - Val";
Debug.ShouldStop(512);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "-",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 395;BA.debugLine="Item.SumMande = Item.SumMande + Val";
Debug.ShouldStop(1024);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "+",1, 0)));
 BA.debugLineNum = 396;BA.debugLine="Item.TedadDarSabadJoz = A";
Debug.ShouldStop(2048);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 398;BA.debugLine="AddEshantion(A)";
Debug.ShouldStop(8192);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_addeshantion" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _a)));
 BA.debugLineNum = 399;BA.debugLine="AddToSabad";
Debug.ShouldStop(16384);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("BtnDownKol_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,430);
if (RapidSub.canDelegate("btndownkol_click")) { return __ref.runUserSub(false, "cls_reckalalisti","btndownkol_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 430;BA.debugLine="Sub BtnDownKol_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 431;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(16384);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 432;BA.debugLine="A = Item.TedadDarSabadKol";
Debug.ShouldStop(32768);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 433;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 434;BA.debugLine="A = A - 1";
Debug.ShouldStop(131072);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 435;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton + Item";
Debug.ShouldStop(262144);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))}, "+",1, 0)));
 BA.debugLineNum = 436;BA.debugLine="Item.TedadDarSabadKol = A";
Debug.ShouldStop(524288);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 438;BA.debugLine="AddToSabad";
Debug.ShouldStop(2097152);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("BtnUpEshan_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,535);
if (RapidSub.canDelegate("btnupeshan_click")) { return __ref.runUserSub(false, "cls_reckalalisti","btnupeshan_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
 BA.debugLineNum = 535;BA.debugLine="Sub BtnUpEshan_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 536;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(8388608);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 537;BA.debugLine="Dim B As Int = 0";
Debug.ShouldStop(16777216);
_b = BA.numberCast(int.class, 0);Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 538;BA.debugLine="A = Item.FldEshantion";
Debug.ShouldStop(33554432);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 539;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",cls_reckalalisti._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 540;BA.debugLine="If Item.FldEshantion<Item.fldCountEshantion Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 541;BA.debugLine="A = A + 1";
Debug.ShouldStop(268435456);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 542;BA.debugLine="Item.SumMande = Item.SumMande - 1";
Debug.ShouldStop(536870912);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "-",1, 0)));
 };
 }else 
{ BA.debugLineNum = 545;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",cls_reckalalisti._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 546;BA.debugLine="B = Item.SumMande - ((Item.TedadDarSabadKol * It";
Debug.ShouldStop(2);
_b = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ))}, "++",2, 0))}, "-",1, 0));Debug.locals.put("B", _b);
 BA.debugLineNum = 547;BA.debugLine="If B > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_b,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 548;BA.debugLine="If Item.FldEshantion<Item.fldCountEshantion The";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 549;BA.debugLine="A = A + 1";
Debug.ShouldStop(16);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 550;BA.debugLine="Item.SumMande = Item.SumMande - 1";
Debug.ShouldStop(32);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "-",1, 0)));
 };
 }else {
 BA.debugLineNum = 553;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(256);
cls_reckalalisti.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_reckalalisti.__c.getField(true,"True")));
 };
 }}
;
 BA.debugLineNum = 556;BA.debugLine="Item.FldEshantion = A";
Debug.ShouldStop(2048);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 557;BA.debugLine="AddToSabad";
Debug.ShouldStop(4096);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 558;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("BtnUpJoz_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("btnupjoz_click")) { return __ref.runUserSub(false, "cls_reckalalisti","btnupjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 314;BA.debugLine="Sub BtnUpJoz_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(67108864);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 316;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(134217728);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 317;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(cls_reckalalisti._mcode._isfloat /*RemoteObject*/ ,cls_reckalalisti.__c.getField(true,"True"),cls_reckalalisti.__c.getField(true,"False"))) {
case 0: {
 BA.debugLineNum = 319;BA.debugLine="Val = 0.25";
Debug.ShouldStop(1073741824);
_val = BA.numberCast(float.class, 0.25);Debug.locals.put("Val", _val);
 break; }
case 1: {
 BA.debugLineNum = 321;BA.debugLine="Val = 1";
Debug.ShouldStop(1);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 break; }
}
;
 BA.debugLineNum = 323;BA.debugLine="If	Item.TedadDarSabadJoz=Null Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 324;BA.debugLine="Item.TedadDarSabadJoz=0";
Debug.ShouldStop(8);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 325;BA.debugLine="LblTedadJoz.Text=0";
Debug.ShouldStop(16);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 328;BA.debugLine="A = Item.TedadDarSabadJoz";
Debug.ShouldStop(128);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 329;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",cls_reckalalisti._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 330;BA.debugLine="A = A + Val";
Debug.ShouldStop(512);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 331;BA.debugLine="Item.SumMande = Item.SumMande - Val";
Debug.ShouldStop(1024);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 332;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",cls_reckalalisti._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 333;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",cls_reckalalisti._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 334;BA.debugLine="A = A + Val";
Debug.ShouldStop(8192);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 335;BA.debugLine="Item.SumMande = Item.SumMande - Val";
Debug.ShouldStop(16384);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 337;BA.debugLine="If Item.SumMande > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 338;BA.debugLine="A = A + Val";
Debug.ShouldStop(131072);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 339;BA.debugLine="Item.SumMande = Item.SumMande - Val";
Debug.ShouldStop(262144);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 341;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(1048576);
cls_reckalalisti.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_reckalalisti.__c.getField(true,"True")));
 };
 };
 }}
;
 BA.debugLineNum = 345;BA.debugLine="Item.TedadDarSabadJoz = A";
Debug.ShouldStop(16777216);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 346;BA.debugLine="AddEshantion(A)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_addeshantion" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _a)));
 BA.debugLineNum = 347;BA.debugLine="AddToSabad";
Debug.ShouldStop(67108864);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("BtnUpKol_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,402);
if (RapidSub.canDelegate("btnupkol_click")) { return __ref.runUserSub(false, "cls_reckalalisti","btnupkol_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 402;BA.debugLine="Sub BtnUpKol_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="If Item.TedadDarKarton=0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 404;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 406;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(2097152);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 407;BA.debugLine="Dim Val As Float = 1";
Debug.ShouldStop(4194304);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 408;BA.debugLine="A = Item.TedadDarSabadKol";
Debug.ShouldStop(8388608);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 409;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",cls_reckalalisti._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 410;BA.debugLine="A = A + 1";
Debug.ShouldStop(33554432);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 411;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - A";
Debug.ShouldStop(67108864);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_a}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 412;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",cls_reckalalisti._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 413;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",cls_reckalalisti._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 414;BA.debugLine="A = A + 1";
Debug.ShouldStop(536870912);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 415;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Val";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 417;BA.debugLine="If Item.SumMandeKarton >= Item.TedadDarSabadKol";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 418;BA.debugLine="A = A + 1";
Debug.ShouldStop(2);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 419;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Va";
Debug.ShouldStop(4);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 421;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(16);
cls_reckalalisti.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_reckalalisti.__c.getField(true,"True")));
 };
 };
 }}
;
 BA.debugLineNum = 426;BA.debugLine="Item.TedadDarSabadKol = A";
Debug.ShouldStop(512);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 427;BA.debugLine="AddToSabad";
Debug.ShouldStop(1024);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_addtosabad" /*RemoteObject*/ );
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_reckalalisti._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_reckalalisti._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_reckalalisti._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_reckalalisti._pnl_bk);
 //BA.debugLineNum = 5;BA.debugLine="Private ImageOff As ImageView";
cls_reckalalisti._imageoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageoff",cls_reckalalisti._imageoff);
 //BA.debugLineNum = 6;BA.debugLine="Private LblGift As Label";
cls_reckalalisti._lblgift = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblgift",cls_reckalalisti._lblgift);
 //BA.debugLineNum = 7;BA.debugLine="Private lbl_title As Label";
cls_reckalalisti._lbl_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_title",cls_reckalalisti._lbl_title);
 //BA.debugLineNum = 8;BA.debugLine="Private ImageCall As ImageView";
cls_reckalalisti._imagecall = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imagecall",cls_reckalalisti._imagecall);
 //BA.debugLineNum = 9;BA.debugLine="Private LblFee As Label";
cls_reckalalisti._lblfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfee",cls_reckalalisti._lblfee);
 //BA.debugLineNum = 10;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
cls_reckalalisti._lblfeebadaztakhfid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfeebadaztakhfid",cls_reckalalisti._lblfeebadaztakhfid);
 //BA.debugLineNum = 11;BA.debugLine="Private LblC_Kala As Label";
cls_reckalalisti._lblc_kala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblc_kala",cls_reckalalisti._lblc_kala);
 //BA.debugLineNum = 12;BA.debugLine="Private LblTozihat As Label";
cls_reckalalisti._lbltozihat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltozihat",cls_reckalalisti._lbltozihat);
 //BA.debugLineNum = 13;BA.debugLine="Private LblMojoodiJoz As Label";
cls_reckalalisti._lblmojoodijoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodijoz",cls_reckalalisti._lblmojoodijoz);
 //BA.debugLineNum = 14;BA.debugLine="Private LblMojoodiKol As Label";
cls_reckalalisti._lblmojoodikol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodikol",cls_reckalalisti._lblmojoodikol);
 //BA.debugLineNum = 15;BA.debugLine="Private LblTedadKarton As Label";
cls_reckalalisti._lbltedadkarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkarton",cls_reckalalisti._lbltedadkarton);
 //BA.debugLineNum = 16;BA.debugLine="Private BtnUpJoz As Label";
cls_reckalalisti._btnupjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupjoz",cls_reckalalisti._btnupjoz);
 //BA.debugLineNum = 17;BA.debugLine="Private LblTedadJoz As Label";
cls_reckalalisti._lbltedadjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadjoz",cls_reckalalisti._lbltedadjoz);
 //BA.debugLineNum = 18;BA.debugLine="Private BtnDownJoz As Label";
cls_reckalalisti._btndownjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownjoz",cls_reckalalisti._btndownjoz);
 //BA.debugLineNum = 19;BA.debugLine="Private BtnDownKol As Label";
cls_reckalalisti._btndownkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownkol",cls_reckalalisti._btndownkol);
 //BA.debugLineNum = 20;BA.debugLine="Private LblTedadkol As Label";
cls_reckalalisti._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkol",cls_reckalalisti._lbltedadkol);
 //BA.debugLineNum = 21;BA.debugLine="Private BtnUpKol As Label";
cls_reckalalisti._btnupkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupkol",cls_reckalalisti._btnupkol);
 //BA.debugLineNum = 22;BA.debugLine="Private Item As AdapterListKala";
cls_reckalalisti._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");__ref.setField("_item",cls_reckalalisti._item);
 //BA.debugLineNum = 23;BA.debugLine="Private Key As IME";
cls_reckalalisti._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_key",cls_reckalalisti._key);
 //BA.debugLineNum = 24;BA.debugLine="Private base As Object";
cls_reckalalisti._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_reckalalisti._base);
 //BA.debugLineNum = 25;BA.debugLine="Private BtnDownEshan As Label";
cls_reckalalisti._btndowneshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndowneshan",cls_reckalalisti._btndowneshan);
 //BA.debugLineNum = 26;BA.debugLine="Private BtnUpEshan As Label";
cls_reckalalisti._btnupeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupeshan",cls_reckalalisti._btnupeshan);
 //BA.debugLineNum = 27;BA.debugLine="Private LblTedadEshan As Label";
cls_reckalalisti._lbltedadeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadeshan",cls_reckalalisti._lbltedadeshan);
 //BA.debugLineNum = 28;BA.debugLine="Private lblVahedJoz As Label";
cls_reckalalisti._lblvahedjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedjoz",cls_reckalalisti._lblvahedjoz);
 //BA.debugLineNum = 29;BA.debugLine="Private lblVahedKol As Label";
cls_reckalalisti._lblvahedkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedkol",cls_reckalalisti._lblvahedkol);
 //BA.debugLineNum = 32;BA.debugLine="Private btn_edit_Price As Label";
cls_reckalalisti._btn_edit_price = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btn_edit_price",cls_reckalalisti._btn_edit_price);
 //BA.debugLineNum = 33;BA.debugLine="Dim maxkolRond As Long";
cls_reckalalisti._maxkolrond = RemoteObject.createImmutable(0L);__ref.setField("_maxkolrond",cls_reckalalisti._maxkolrond);
 //BA.debugLineNum = 34;BA.debugLine="Private LblCountEshantion As Label";
cls_reckalalisti._lblcounteshantion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcounteshantion",cls_reckalalisti._lblcounteshantion);
 //BA.debugLineNum = 35;BA.debugLine="Private btn_discount As Label";
cls_reckalalisti._btn_discount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btn_discount",cls_reckalalisti._btn_discount);
 //BA.debugLineNum = 36;BA.debugLine="Private LblMablaghTakhfif As Label";
cls_reckalalisti._lblmablaghtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghtakhfif",cls_reckalalisti._lblmablaghtakhfif);
 //BA.debugLineNum = 37;BA.debugLine="Private LblMablaghMasrafkonande As Label";
cls_reckalalisti._lblmablaghmasrafkonande = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghmasrafkonande",cls_reckalalisti._lblmablaghmasrafkonande);
 //BA.debugLineNum = 38;BA.debugLine="Private lblSumMablaghKala As Label";
cls_reckalalisti._lblsummablaghkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsummablaghkala",cls_reckalalisti._lblsummablaghkala);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getbytefrombitmap(RemoteObject __ref,RemoteObject _img,RemoteObject _quality) throws Exception{
try {
		Debug.PushSubsStack("GetByteFromBitmap (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,525);
if (RapidSub.canDelegate("getbytefrombitmap")) { return __ref.runUserSub(false, "cls_reckalalisti","getbytefrombitmap", __ref, _img, _quality);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _data = null;
Debug.locals.put("img", _img);
Debug.locals.put("Quality", _quality);
 BA.debugLineNum = 525;BA.debugLine="Sub GetByteFromBitmap(img As Bitmap, Quality As In";
Debug.ShouldStop(4096);
 BA.debugLineNum = 526;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(8192);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 527;BA.debugLine="Dim data() As Byte";
Debug.ShouldStop(16384);
_data = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 528;BA.debugLine="out.InitializeToBytesArray(1)";
Debug.ShouldStop(32768);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 529;BA.debugLine="img.WriteToStream(out,Quality,\"JPEG\")";
Debug.ShouldStop(65536);
_img.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(_quality),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 530;BA.debugLine="data = out.ToBytesArray";
Debug.ShouldStop(131072);
_data = _out.runMethod(false,"ToBytesArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 531;BA.debugLine="out.Close";
Debug.ShouldStop(262144);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 532;BA.debugLine="Return data";
Debug.ShouldStop(524288);
if (true) return _data;
 BA.debugLineNum = 533;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfilename(RemoteObject __ref,RemoteObject _fullpath) throws Exception{
try {
		Debug.PushSubsStack("GetFilename (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,509);
if (RapidSub.canDelegate("getfilename")) { return __ref.runUserSub(false, "cls_reckalalisti","getfilename", __ref, _fullpath);}
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("fullpath", _fullpath);
 BA.debugLineNum = 509;BA.debugLine="Sub GetFilename(fullpath As String) As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 510;BA.debugLine="Dim res As String";
Debug.ShouldStop(536870912);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 511;BA.debugLine="res = fullpath.SubString(fullpath.LastIndexOf(\"/\"";
Debug.ShouldStop(1073741824);
_res = _fullpath.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_fullpath.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/"))),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("res", _res);
 BA.debugLineNum = 512;BA.debugLine="Return res";
Debug.ShouldStop(-2147483648);
if (true) return _res;
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_reckalalisti","getheight", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("getPanel (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_reckalalisti","getpanel", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 65;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mdl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_reckalalisti","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _btnchangeprice = RemoteObject.createImmutable(0);
RemoteObject _btndiscount = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 41;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="base = mdl";
Debug.ShouldStop(512);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 43;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_key" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 44;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(4096);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_reckalalisti.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_reckalalisti.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 46;BA.debugLine="p.LoadLayout(\"L_RecKalaListi_2\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_RecKalaListi_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 48;BA.debugLine="Dim btnChangePrice As Int=MCode.TaghirFeeKala";
Debug.ShouldStop(32768);
_btnchangeprice = BA.numberCast(int.class, cls_reckalalisti._mcode._taghirfeekala /*RemoteObject*/ );Debug.locals.put("btnChangePrice", _btnchangeprice);Debug.locals.put("btnChangePrice", _btnchangeprice);
 BA.debugLineNum = 49;BA.debugLine="If btnChangePrice=0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_btnchangeprice,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 50;BA.debugLine="btn_edit_Price.Visible=False";
Debug.ShouldStop(131072);
__ref.getField(false,"_btn_edit_price" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 52;BA.debugLine="btn_edit_Price.Visible=True";
Debug.ShouldStop(524288);
__ref.getField(false,"_btn_edit_price" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"True"));
 };
 BA.debugLineNum = 55;BA.debugLine="Dim btndiscount As Int=MCode.TakhfifKala";
Debug.ShouldStop(4194304);
_btndiscount = BA.numberCast(int.class, cls_reckalalisti._mcode._takhfifkala /*RemoteObject*/ );Debug.locals.put("btndiscount", _btndiscount);Debug.locals.put("btndiscount", _btndiscount);
 BA.debugLineNum = 56;BA.debugLine="If btndiscount=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_btndiscount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 57;BA.debugLine="btn_discount.Visible=False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btn_discount" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 59;BA.debugLine="btn_discount.Visible=True";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btn_discount" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"True"));
 };
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("LblTedadJoz_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,465);
if (RapidSub.canDelegate("lbltedadjoz_click")) { return __ref.runUserSub(false, "cls_reckalalisti","lbltedadjoz_click", __ref);}
 BA.debugLineNum = 465;BA.debugLine="Sub LblTedadJoz_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 466;BA.debugLine="CallSubDelayed2(base,\"LblTedadJoz_Click\",Item)";
Debug.ShouldStop(131072);
cls_reckalalisti.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("LblTedadJoz_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("LblTedadKol_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,469);
if (RapidSub.canDelegate("lbltedadkol_click")) { return __ref.runUserSub(false, "cls_reckalalisti","lbltedadkol_click", __ref);}
 BA.debugLineNum = 469;BA.debugLine="Sub LblTedadKol_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 470;BA.debugLine="CallSubDelayed2(base,\"LblTedadKol_Click\",Item)";
Debug.ShouldStop(2097152);
cls_reckalalisti.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("LblTedadKol_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 471;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_bk_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_bk_Click (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,575);
if (RapidSub.canDelegate("pnl_bk_click")) { return __ref.runUserSub(false, "cls_reckalalisti","pnl_bk_click", __ref);}
 BA.debugLineNum = 575;BA.debugLine="Sub pnl_bk_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 578;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _item1,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_reckalalisti","show", __ref, _item1, _position);}
RemoteObject _imagerow1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _feebadaztakhfif = RemoteObject.createImmutable(0);
RemoteObject _fee = RemoteObject.createImmutable(0);
RemoteObject _price = RemoteObject.createImmutable(0L);
Debug.locals.put("Item1", _item1);
Debug.locals.put("position", _position);
 BA.debugLineNum = 72;BA.debugLine="Public Sub Show(Item1 As AdapterListKala,position";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Item=Item1";
Debug.ShouldStop(256);
__ref.setField ("_item" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 74;BA.debugLine="Private ImageRow1 As ImageView";
Debug.ShouldStop(512);
_imagerow1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("ImageRow1", _imagerow1);
 BA.debugLineNum = 75;BA.debugLine="ImageRow1.Initialize(\"\")";
Debug.ShouldStop(1024);
_imagerow1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 76;BA.debugLine="ImageRow1.Tag=position";
Debug.ShouldStop(2048);
_imagerow1.runMethod(false,"setTag",(_position));
 BA.debugLineNum = 79;BA.debugLine="lbl_title.Text = Item.NameKala";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbl_title" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameKala" /*RemoteObject*/ )));
 BA.debugLineNum = 80;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & Item.CodeKala";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblc_kala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد کالا: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 83;BA.debugLine="Dim feebadaztakhfif As Int=(MCode.SingleResult(\"s";
Debug.ShouldStop(262144);
_feebadaztakhfif = BA.numberCast(int.class, (cls_reckalalisti._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select fldFeeBadAzTakhfif from TblKala where fldCodeKala="),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))))));Debug.locals.put("feebadaztakhfif", _feebadaztakhfif);Debug.locals.put("feebadaztakhfif", _feebadaztakhfif);
 BA.debugLineNum = 84;BA.debugLine="If Item.MablaghTakhfif>0 And feebadaztakhfif=0 Th";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 85;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.Mab";
Debug.ShouldStop(1048576);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 1)));
 }else 
{ BA.debugLineNum = 87;BA.debugLine="else If Item.MablaghTakhfif>0 And feebadaztakhfif";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 88;BA.debugLine="Item.fldFeeBadAzTakhfif=feebadaztakhfif-Item.Mab";
Debug.ShouldStop(8388608);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_feebadaztakhfif,__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 1)));
 }else 
{ BA.debugLineNum = 90;BA.debugLine="Else if Item.MablaghTakhfif=0 And feebadaztakhfif";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 91;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.MablaghTakhfif";
Debug.ShouldStop(67108864);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ )));
 BA.debugLineNum = 92;BA.debugLine="Item.MablaghTakhfif=Item.MablaghTakhfif";
Debug.ShouldStop(134217728);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("MablaghTakhfif" /*RemoteObject*/ ,__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ));
 }else 
{ BA.debugLineNum = 93;BA.debugLine="Else if Item.MablaghTakhfif=0 And feebadaztakhfif";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 94;BA.debugLine="Item.fldFeeBadAzTakhfif=feebadaztakhfif";
Debug.ShouldStop(536870912);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(_feebadaztakhfif));
 }}}}
;
 BA.debugLineNum = 97;BA.debugLine="Dim fee As Int";
Debug.ShouldStop(1);
_fee = RemoteObject.createImmutable(0);Debug.locals.put("fee", _fee);
 BA.debugLineNum = 99;BA.debugLine="fee=Item.FeeForoosh";
Debug.ShouldStop(4);
_fee = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ );Debug.locals.put("fee", _fee);
 BA.debugLineNum = 100;BA.debugLine="If Item.MablaghTakhfif>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 101;BA.debugLine="Item.fldFeeBadAzTakhfif=fee-Item.MablaghTakhfif";
Debug.ShouldStop(16);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fee,__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 1)));
 BA.debugLineNum = 102;BA.debugLine="LblMablaghTakhfif.Text=\"فی تخفیف: \"& NumberForma";
Debug.ShouldStop(32);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی تخفیف: "),cls_reckalalisti.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_reckalalisti._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 103;BA.debugLine="LblMablaghTakhfif.TextColor=Colors.Red";
Debug.ShouldStop(64);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_reckalalisti.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 104;BA.debugLine="LblMablaghTakhfif.Visible=True";
Debug.ShouldStop(128);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 106;BA.debugLine="LblMablaghTakhfif.Text=0";
Debug.ShouldStop(512);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 107;BA.debugLine="LblMablaghTakhfif.Visible=False";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"False"));
 };
 BA.debugLineNum = 125;BA.debugLine="Log(fee)";
Debug.ShouldStop(268435456);
cls_reckalalisti.__c.runVoidMethod ("LogImpl","5104398901",BA.NumberToString(_fee),0);
 BA.debugLineNum = 126;BA.debugLine="If IsNumber(Item.FldFeeBadAzTakhfif) = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",cls_reckalalisti.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),cls_reckalalisti.__c.getField(true,"True"))) { 
 BA.debugLineNum = 128;BA.debugLine="If Item.fldFeeBadAzTakhfif>=fee Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, _fee))) { 
 BA.debugLineNum = 129;BA.debugLine="LblFee.Text =\"فی فروش: \"& NumberFormat(fee,1,3)";
Debug.ShouldStop(1);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),cls_reckalalisti.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _fee)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_reckalalisti._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 130;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(2);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 131;BA.debugLine="Item.FldFeeBadAzTakhfif=0";
Debug.ShouldStop(4);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 132;BA.debugLine="ImageOff.Visible=False";
Debug.ShouldStop(8);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 133;BA.debugLine="Else If Item.FldFeeBadAzTakhfif > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 134;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(f";
Debug.ShouldStop(32);
cls_reckalalisti._mcode._rs /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),cls_reckalalisti.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _fee)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_reckalalisti._mcode._vahedpool /*RemoteObject*/ ))));
 BA.debugLineNum = 135;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
Debug.ShouldStop(64);
cls_reckalalisti._mcode._rs /*RemoteObject*/ .runVoidMethod ("Strikethrough",(Object)(BA.numberCast(int.class, 0)),(Object)(cls_reckalalisti._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 136;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
Debug.ShouldStop(128);
cls_reckalalisti._mcode._rs /*RemoteObject*/ .runVoidMethod ("Color",(Object)(cls_reckalalisti.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_reckalalisti._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 137;BA.debugLine="LblFee.Text = MCode.Rs";
Debug.ShouldStop(256);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_reckalalisti._mcode._rs /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 138;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"& N";
Debug.ShouldStop(512);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی بعد از تخفیف: "),cls_reckalalisti.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_reckalalisti._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 139;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(1024);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 141;BA.debugLine="LblFee.Text =\"فی فروش: \"& NumberFormat(fee,1,3)";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),cls_reckalalisti.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _fee)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_reckalalisti._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 142;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 143;BA.debugLine="ImageOff.Visible=False";
Debug.ShouldStop(16384);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"False"));
 }}
;
 }else {
 BA.debugLineNum = 146;BA.debugLine="LblFee.Text =\"فی فروش: \"& NumberFormat(fee,1,3)";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),cls_reckalalisti.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _fee)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_reckalalisti._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 147;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 150;BA.debugLine="If Item.TedadDarSabadJoz=Null Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 151;BA.debugLine="LblTedadJoz.Text=0";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 152;BA.debugLine="Item.TedadDarSabadJoz=0";
Debug.ShouldStop(8388608);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(0));
 }else {
 BA.debugLineNum = 154;BA.debugLine="LblTedadJoz.Text =Item.TedadDarSabadJoz";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 156;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& Item.NameVahed";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblvahedjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 158;BA.debugLine="If Item.TedadDarSabadKol=Null Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 159;BA.debugLine="LblTedadkol.Text=0";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 160;BA.debugLine="Item.TedadDarSabadKol=0";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(0));
 }else {
 BA.debugLineNum = 162;BA.debugLine="LblTedadkol.Text =Item.TedadDarSabadKol";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 164;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& Item.NameVahed2";
Debug.ShouldStop(8);
__ref.getField(false,"_lblvahedkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 176;BA.debugLine="If Item.FldEshantion=Null Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 177;BA.debugLine="Item.FldEshantion=0";
Debug.ShouldStop(65536);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 BA.debugLineNum = 179;BA.debugLine="Dim Price As Long=0";
Debug.ShouldStop(262144);
_price = BA.numberCast(long.class, 0);Debug.locals.put("Price", _price);Debug.locals.put("Price", _price);
 BA.debugLineNum = 180;BA.debugLine="If Item.FldFeeBadAzTakhfif > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 181;BA.debugLine="Price = Item.FldFeeBadAzTakhfif * ((Item.TedadDa";
Debug.ShouldStop(1048576);
_price = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "+",1, 0))}, "*",0, 0));Debug.locals.put("Price", _price);
 BA.debugLineNum = 182;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 184;BA.debugLine="Price = Item.FeeForoosh * ((Item.TedadDarSabadKo";
Debug.ShouldStop(8388608);
_price = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "+",1, 0))}, "*",0, 0));Debug.locals.put("Price", _price);
 BA.debugLineNum = 185;BA.debugLine="ImageOff.Visible=False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"False"));
 };
 BA.debugLineNum = 187;BA.debugLine="If Price>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_price,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 188;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: \"& NumberForma";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblsummablaghkala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("جمع مبلغ: "),cls_reckalalisti.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _price)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_reckalalisti._mcode._vahedpool /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 190;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: 0\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblsummablaghkala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("جمع مبلغ: 0"));
 };
 BA.debugLineNum = 193;BA.debugLine="If Item.TedadDarKarton<>0 And IsNumber(Item.Tedad";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",cls_reckalalisti.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))),cls_reckalalisti.__c.getField(true,"True"))) { 
 BA.debugLineNum = 194;BA.debugLine="maxkolRond=(Item.SumMandeKarton)";
Debug.ShouldStop(2);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,BA.numberCast(long.class, (__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ ))));
 BA.debugLineNum = 196;BA.debugLine="If Item.NameVahed2=\"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 197;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& Item.Te";
Debug.ShouldStop(16);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 199;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&Item.NameVahed2";
Debug.ShouldStop(64);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),RemoteObject.createImmutable(": "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 201;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(256);
cls_reckalalisti.__c.runVoidMethod ("LogImpl","5104398977",BA.NumberToString(__ref.getField(true,"_maxkolrond" /*RemoteObject*/ )),0);
 }else {
 BA.debugLineNum = 203;BA.debugLine="maxkolRond=0";
Debug.ShouldStop(1024);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 205;BA.debugLine="If Item.NameVahed2=\"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 206;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& maxkolR";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن: "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 208;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&Item.NameVahed2";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),RemoteObject.createImmutable(": "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 210;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 };
 BA.debugLineNum = 212;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(524288);
cls_reckalalisti.__c.runVoidMethod ("LogImpl","5104398988",BA.NumberToString(__ref.getField(true,"_maxkolrond" /*RemoteObject*/ )),0);
 BA.debugLineNum = 213;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& Item.SumMande";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی جزء: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 215;BA.debugLine="If  Item.SumMandeKarton <> Null Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 216;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی کل: "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 218;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 };
 BA.debugLineNum = 221;BA.debugLine="If Item.TedadDarSabadJoz>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 222;BA.debugLine="AddEshantion(Item.TedadDarSabadJoz)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_addeshantion" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))));
 BA.debugLineNum = 223;BA.debugLine="LblTedadEshan.Text = Item.FldEshantion";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 225;BA.debugLine="If Item.fldCountEshantion<>Null Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 226;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : \" & Item.fl";
Debug.ShouldStop(2);
__ref.getField(false,"_lblcounteshantion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد هدیه : "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ ))));
 BA.debugLineNum = 227;BA.debugLine="LblTedadEshan.Text=Item.FldEshantion";
Debug.ShouldStop(4);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 229;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : 0\"";
Debug.ShouldStop(16);
__ref.getField(false,"_lblcounteshantion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("تعداد هدیه : 0"));
 };
 BA.debugLineNum = 235;BA.debugLine="If Item.FldMablaghMasrafKonande>0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldMablaghMasrafKonande" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 236;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده: \"";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblmablaghmasrafkonande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("قیمت مصرف کننده: "),cls_reckalalisti.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldMablaghMasrafKonande" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_reckalalisti._mcode._vahedpool /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 238;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده: 0";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblmablaghmasrafkonande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("قیمت مصرف کننده: 0"));
 };
 BA.debugLineNum = 240;BA.debugLine="If MCode.HideMojodi=1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",cls_reckalalisti._mcode._hidemojodi /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 241;BA.debugLine="LblMojoodiJoz.Visible=False";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"False"));
 BA.debugLineNum = 242;BA.debugLine="LblMojoodiKol.Visible=False";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 244;BA.debugLine="LblMojoodiJoz.Visible=True";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"True"));
 BA.debugLineNum = 245;BA.debugLine="LblMojoodiKol.Visible=True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti.__c.getField(true,"True"));
 };
 BA.debugLineNum = 248;BA.debugLine="LblGift.Visible=MCode.CheckEshantion(Item.CodeKal";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblgift" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_reckalalisti._mcode.runMethod(true,"_checkeshantion" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Status (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("status")) { return __ref.runUserSub(false, "cls_reckalalisti","status", __ref, _enable);}
Debug.locals.put("Enable", _enable);
 BA.debugLineNum = 252;BA.debugLine="Sub Status(Enable As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 253;BA.debugLine="LogColor(\"status: \"&Enable,Colors.Red)";
Debug.ShouldStop(268435456);
cls_reckalalisti.__c.runVoidMethod ("LogImpl","5104464385",RemoteObject.concat(RemoteObject.createImmutable("status: "),_enable),cls_reckalalisti.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 254;BA.debugLine="BtnDownEshan.Enabled=Enable";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btndowneshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 255;BA.debugLine="BtnUpEshan.Enabled=Enable";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btnupeshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 256;BA.debugLine="LblTedadEshan.Enabled=Enable";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 258;BA.debugLine="BtnDownJoz.Enabled=Enable";
Debug.ShouldStop(2);
__ref.getField(false,"_btndownjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 259;BA.debugLine="BtnUpJoz.Enabled=Enable";
Debug.ShouldStop(4);
__ref.getField(false,"_btnupjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 260;BA.debugLine="LblTedadJoz.Enabled=Enable";
Debug.ShouldStop(8);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 262;BA.debugLine="BtnDownKol.Enabled=Enable";
Debug.ShouldStop(32);
__ref.getField(false,"_btndownkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 263;BA.debugLine="BtnUpKol.Enabled=Enable";
Debug.ShouldStop(64);
__ref.getField(false,"_btnupkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 264;BA.debugLine="LblTedadkol.Enabled=Enable";
Debug.ShouldStop(128);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writebitmap2file(RemoteObject __ref,RemoteObject _image,RemoteObject _quality,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("WriteBitmap2File (cls_reckalalisti) ","cls_reckalalisti",85,__ref.getField(false, "ba"),__ref,514);
if (RapidSub.canDelegate("writebitmap2file")) { return __ref.runUserSub(false, "cls_reckalalisti","writebitmap2file", __ref, _image, _quality, _filename);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _data = null;
Debug.locals.put("Image", _image);
Debug.locals.put("Quality", _quality);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 514;BA.debugLine="Sub WriteBitmap2File(Image As Bitmap, Quality As I";
Debug.ShouldStop(2);
 BA.debugLineNum = 515;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 516;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Starte";
Debug.ShouldStop(8);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = cls_reckalalisti.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(cls_reckalalisti._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(cls_reckalalisti.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 517;BA.debugLine="Dim data() As Byte = GetByteFromBitmap(Image, Qu";
Debug.ShouldStop(16);
_data = __ref.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_getbytefrombitmap" /*RemoteObject*/ ,(Object)(_image),(Object)(_quality));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 518;BA.debugLine="out.WriteBytes(data, 0, data.Length)";
Debug.ShouldStop(32);
_out.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 520;BA.debugLine="Log(DateTime.Date(DateTime.Now)&\"=\"&\"WriteBitmap";
Debug.ShouldStop(128);
cls_reckalalisti.__c.runVoidMethod ("LogImpl","5105185286",RemoteObject.concat(cls_reckalalisti.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(cls_reckalalisti.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable("="),RemoteObject.createImmutable("WriteBitmap2File")),0);
 };
 BA.debugLineNum = 522;BA.debugLine="out.Close";
Debug.ShouldStop(512);
_out.runVoidMethod ("Close");
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
}