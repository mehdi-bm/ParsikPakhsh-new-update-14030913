package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_recdefultkala_subs_0 {


public static RemoteObject  _addeshantion(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("AddEshantion (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,577);
if (RapidSub.canDelegate("addeshantion")) { return __ref.runUserSub(false, "cls_recdefultkala","addeshantion", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 577;BA.debugLine="Sub AddEshantion(t As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 606;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("AddToSabad (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,741);
if (RapidSub.canDelegate("addtosabad")) { return __ref.runUserSub(false, "cls_recdefultkala","addtosabad", __ref);}
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _feekol = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _check = RemoteObject.createImmutable(false);
int _i = 0;
 BA.debugLineNum = 741;BA.debugLine="Sub AddToSabad";
Debug.ShouldStop(16);
 BA.debugLineNum = 759;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item.T";
Debug.ShouldStop(4194304);
_tedadkol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )))),BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 760;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
Debug.ShouldStop(8388608);
_feekol = BA.NumberToString((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)));Debug.locals.put("FeeKol", _feekol);Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 763;BA.debugLine="If tedadKol>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadkol),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 764;BA.debugLine="If Item.MablaghTakhfif>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 765;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKo";
Debug.ShouldStop(268435456);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 766;BA.debugLine="Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghTak";
Debug.ShouldStop(536870912);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _feekol),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 };
 }else {
 BA.debugLineNum = 770;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>0";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 771;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh)*Item.f";
Debug.ShouldStop(4);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 772;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.M";
Debug.ShouldStop(8);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 1)));
 };
 };
 BA.debugLineNum = 776;BA.debugLine="FeeKol=CheckArzeshAfzode";
Debug.ShouldStop(128);
_feekol = __ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_checkarzeshafzode" /*RemoteObject*/ );Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 778;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(512);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_recdefultkala._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 779;BA.debugLine="Dim Check As Boolean";
Debug.ShouldStop(1024);
_check = RemoteObject.createImmutable(false);Debug.locals.put("Check", _check);
 BA.debugLineNum = 780;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(2048);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 781;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(4096);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 782;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 783;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 784;BA.debugLine="If Item.FldEshantion>0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 785;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTeda";
Debug.ShouldStop(65536);
cls_recdefultkala._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadDarSabadJoz = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadDarSabadKol = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldMablaghTakhfif = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldDarsadTakhfif = '"),cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))),RemoteObject.createImmutable(",fldFeeBadAzTakhfif = '"),cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),RemoteObject.createImmutable("',fldArzeshAfzode = '"),cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))),RemoteObject.createImmutable("',fldDarsadArzeshAfzode = '"),cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ))),RemoteObject.createImmutable("', FldEshantion = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ),RemoteObject.createImmutable("' Where FldCodeKala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 788;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where";
Debug.ShouldStop(524288);
cls_recdefultkala._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldCodeKala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 }else {
 BA.debugLineNum = 796;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
Debug.ShouldStop(134217728);
cls_recdefultkala._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadDarSabadJoz = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadDarSabadKol = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldMablaghTakhfif = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldDarsadTakhfif = '"),cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))),RemoteObject.createImmutable("',fldFeeBadAzTakhfif = '"),cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),RemoteObject.createImmutable("',fldArzeshAfzode = '"),cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))),RemoteObject.createImmutable("',fldDarsadArzeshAfzode = '"),cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ))),RemoteObject.createImmutable("',FldEshantion = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ),RemoteObject.createImmutable("' Where FldCodeKala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 799;BA.debugLine="Check = True";
Debug.ShouldStop(1073741824);
_check = cls_recdefultkala.__c.getField(true,"True");Debug.locals.put("Check", _check);
 BA.debugLineNum = 800;BA.debugLine="Exit";
Debug.ShouldStop(-2147483648);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 803;BA.debugLine="If Check = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_check,cls_recdefultkala.__c.getField(true,"False"))) { 
 BA.debugLineNum = 804;BA.debugLine="MCode.AddToSabad(Item)";
Debug.ShouldStop(8);
cls_recdefultkala._mcode.runVoidMethod ("_addtosabad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 807;BA.debugLine="CallSubDelayed(base,\"RefreshLblSabad\")";
Debug.ShouldStop(64);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("RefreshLblSabad")));
 BA.debugLineNum = 808;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("btn_discount_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,983);
if (RapidSub.canDelegate("btn_discount_click")) { return __ref.runUserSub(false, "cls_recdefultkala","btn_discount_click", __ref);}
 BA.debugLineNum = 983;BA.debugLine="Sub btn_discount_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 984;BA.debugLine="If MCode.TakhfifKala=1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._takhfifkala /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 985;BA.debugLine="CallSubDelayed2(base,\"btn_discount_Click\",Item)";
Debug.ShouldStop(16777216);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("btn_discount_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 987;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("btn_edit_Price_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,970);
if (RapidSub.canDelegate("btn_edit_price_click")) { return __ref.runUserSub(false, "cls_recdefultkala","btn_edit_price_click", __ref);}
 BA.debugLineNum = 970;BA.debugLine="Sub btn_edit_Price_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 971;BA.debugLine="If MCode.TaghirFeeKala=1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._taghirfeekala /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 972;BA.debugLine="CallSubDelayed2(base,\"btn_edit_Price_Click\",Ite";
Debug.ShouldStop(2048);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("btn_edit_Price_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 974;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("BtnDownEshan_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,942);
if (RapidSub.canDelegate("btndowneshan_click")) { return __ref.runUserSub(false, "cls_recdefultkala","btndowneshan_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 942;BA.debugLine="Sub BtnDownEshan_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 943;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 944;BA.debugLine="If Item.FldEshantion>0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 945;BA.debugLine="If MCode.EshantionRemove=0 And MCode.EshantionT";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._eshantionremove /*RemoteObject*/ ,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._eshantiontabaghati /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 946;BA.debugLine="ToastMessageShow(\"شما مجوز حذف قلم اشانتیون را";
Debug.ShouldStop(131072);
cls_recdefultkala.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شما مجوز حذف قلم اشانتیون را ندارید")),(Object)(cls_recdefultkala.__c.getField(true,"False")));
 BA.debugLineNum = 947;BA.debugLine="Return";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 950;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(2097152);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 951;BA.debugLine="A = Item.FldEshantion";
Debug.ShouldStop(4194304);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 952;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 953;BA.debugLine="A = A - 1";
Debug.ShouldStop(16777216);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 954;BA.debugLine="Item.SumMande = Item.SumMande + 1";
Debug.ShouldStop(33554432);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "+",1, 0)));
 BA.debugLineNum = 955;BA.debugLine="Item.FldEshantion  = A";
Debug.ShouldStop(67108864);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 956;BA.debugLine="If A=0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 957;BA.debugLine="Item.fldDarsadTakhfif=0";
Debug.ShouldStop(268435456);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldDarsadTakhfif" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 958;BA.debugLine="Item.MablaghTakhfif=0";
Debug.ShouldStop(536870912);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 959;BA.debugLine="Item.Tozihat=\"\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("Tozihat" /*RemoteObject*/ ,BA.ObjectToString(""));
 };
 };
 BA.debugLineNum = 962;BA.debugLine="AddToSabad";
Debug.ShouldStop(2);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 963;BA.debugLine="CallSubDelayed3(Act_KalaDefault,\"DownEshantion\",";
Debug.ShouldStop(4);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((cls_recdefultkala._act_kaladefault.getObject())),(Object)(BA.ObjectToString("DownEshantion")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))),(Object)((_a)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e23.toString()); BA.debugLineNum = 965;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(16);
cls_recdefultkala._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_recdefultkala.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 966;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
cls_recdefultkala.__c.runVoidMethod ("LogImpl","5102694936",BA.ObjectToString(cls_recdefultkala.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 968;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("BtnDownJoz_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,608);
if (RapidSub.canDelegate("btndownjoz_click")) { return __ref.runUserSub(false, "cls_recdefultkala","btndownjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 608;BA.debugLine="Sub BtnDownJoz_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 610;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(2);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 611;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(4);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 616;BA.debugLine="Val = 1";
Debug.ShouldStop(128);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 BA.debugLineNum = 619;BA.debugLine="A = Item.TedadDarSabadJoz";
Debug.ShouldStop(1024);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 620;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 621;BA.debugLine="A = A - Val";
Debug.ShouldStop(4096);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "-",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 622;BA.debugLine="Item.SumMande = Item.SumMande + Val";
Debug.ShouldStop(8192);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "+",1, 0)));
 BA.debugLineNum = 623;BA.debugLine="Item.TedadDarSabadJoz = A";
Debug.ShouldStop(16384);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 633;BA.debugLine="AddToSabad";
Debug.ShouldStop(16777216);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 635;BA.debugLine="If MCode.EshantionGroup=1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._eshantiongroup /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 639;BA.debugLine="CallSubDelayed2(Act_KalaDefault,\"AddEshantionGro";
Debug.ShouldStop(1073741824);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((cls_recdefultkala._act_kaladefault.getObject())),(Object)(BA.ObjectToString("AddEshantionGroup")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeGroup" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 642;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("BtnDownKol_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,691);
if (RapidSub.canDelegate("btndownkol_click")) { return __ref.runUserSub(false, "cls_recdefultkala","btndownkol_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 691;BA.debugLine="Sub BtnDownKol_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 704;BA.debugLine="If Item.TedadDarKarton=0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 705;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 707;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(4);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 708;BA.debugLine="Dim Val As Float = 1";
Debug.ShouldStop(8);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 711;BA.debugLine="A = Item.TedadDarSabadKol";
Debug.ShouldStop(64);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 712;BA.debugLine="A = A - 1";
Debug.ShouldStop(128);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 713;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton + Val";
Debug.ShouldStop(256);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_val}, "+",1, 0)));
 BA.debugLineNum = 714;BA.debugLine="Item.TedadDarSabadKol = A";
Debug.ShouldStop(512);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 716;BA.debugLine="AddToSabad";
Debug.ShouldStop(2048);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 717;BA.debugLine="If MCode.EshantionGroup=1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._eshantiongroup /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 721;BA.debugLine="CallSubDelayed2(Act_KalaDefault,\"AddEshantionGro";
Debug.ShouldStop(65536);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((cls_recdefultkala._act_kaladefault.getObject())),(Object)(BA.ObjectToString("AddEshantionGroup")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeGroup" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 724;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("BtnUpEshan_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,896);
if (RapidSub.canDelegate("btnupeshan_click")) { return __ref.runUserSub(false, "cls_recdefultkala","btnupeshan_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
RemoteObject _minas = RemoteObject.createImmutable(0);
 BA.debugLineNum = 896;BA.debugLine="Sub BtnUpEshan_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 897;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 898;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(2);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 899;BA.debugLine="Dim B As Int = 0";
Debug.ShouldStop(4);
_b = BA.numberCast(int.class, 0);Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 900;BA.debugLine="Dim minas As Int=MCode.GetCountEshantionGroup(Ite";
Debug.ShouldStop(8);
_minas = cls_recdefultkala._mcode.runMethod(true,"_getcounteshantiongroup" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeGroup" /*RemoteObject*/ )));Debug.locals.put("minas", _minas);Debug.locals.put("minas", _minas);
 BA.debugLineNum = 904;BA.debugLine="If minas=0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_minas,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 905;BA.debugLine="Return";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 908;BA.debugLine="A = Item.FldEshantion";
Debug.ShouldStop(2048);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 909;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 910;BA.debugLine="If Item.FldEshantion<myCode.Is_Null_adad(Item.fl";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ ))))) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(cls_recdefultkala._mcode.runMethod(true,"_getcounteshantiongroup" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeGroup" /*RemoteObject*/ ))))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 911;BA.debugLine="A = A + 1";
Debug.ShouldStop(16384);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 912;BA.debugLine="Item.SumMande = Item.SumMande - 1";
Debug.ShouldStop(32768);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "-",1, 0)));
 };
 }else 
{ BA.debugLineNum = 915;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 916;BA.debugLine="B = Item.SumMande - ((Item.TedadDarSabadKol * It";
Debug.ShouldStop(524288);
_b = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ))}, "++",2, 0))}, "-",1, 0));Debug.locals.put("B", _b);
 BA.debugLineNum = 917;BA.debugLine="If B > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_b,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 918;BA.debugLine="If Item.FldEshantion<myCode.Is_Null_adad(Item.";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ ))))) || RemoteObject.solveBoolean(">",cls_recdefultkala._mcode.runMethod(true,"_getcounteshantiongroup" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeGroup" /*RemoteObject*/ ))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 919;BA.debugLine="A = A + 1";
Debug.ShouldStop(4194304);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 920;BA.debugLine="Item.SumMande = Item.SumMande - 1";
Debug.ShouldStop(8388608);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "-",1, 0)));
 };
 }else {
 BA.debugLineNum = 923;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(67108864);
cls_recdefultkala.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_recdefultkala.__c.getField(true,"True")));
 };
 }}
;
 BA.debugLineNum = 926;BA.debugLine="Item.FldEshantion = A";
Debug.ShouldStop(536870912);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 930;BA.debugLine="AddToSabad";
Debug.ShouldStop(2);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 932;BA.debugLine="If minas>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_minas,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 933;BA.debugLine="CallSubDelayed3(Act_KalaDefault,\"UpEshantion\",I";
Debug.ShouldStop(16);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((cls_recdefultkala._act_kaladefault.getObject())),(Object)(BA.ObjectToString("UpEshantion")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeGroup" /*RemoteObject*/ ))),(Object)((_minas)));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e31) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e31.toString()); BA.debugLineNum = 937;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(256);
cls_recdefultkala._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_recdefultkala.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 938;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
cls_recdefultkala.__c.runVoidMethod ("LogImpl","5102629418",BA.ObjectToString(cls_recdefultkala.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 940;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("BtnUpJoz_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,524);
if (RapidSub.canDelegate("btnupjoz_click")) { return __ref.runUserSub(false, "cls_recdefultkala","btnupjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 524;BA.debugLine="Sub BtnUpJoz_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 525;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(4096);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 526;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(8192);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 531;BA.debugLine="Val = 1";
Debug.ShouldStop(262144);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 BA.debugLineNum = 533;BA.debugLine="If	Item.TedadDarSabadJoz=Null Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 534;BA.debugLine="Item.TedadDarSabadJoz=0";
Debug.ShouldStop(2097152);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 535;BA.debugLine="LblTedadJoz.Text=0";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 538;BA.debugLine="A = Item.TedadDarSabadJoz";
Debug.ShouldStop(33554432);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 539;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 540;BA.debugLine="A = A + Val";
Debug.ShouldStop(134217728);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 541;BA.debugLine="Item.SumMande = Item.SumMande - Val";
Debug.ShouldStop(268435456);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 542;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 543;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 544;BA.debugLine="A = A + Val";
Debug.ShouldStop(-2147483648);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 545;BA.debugLine="Item.SumMande = Item.SumMande - Val";
Debug.ShouldStop(1);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 547;BA.debugLine="If Item.SumMande > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 548;BA.debugLine="A = A + Val";
Debug.ShouldStop(8);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 549;BA.debugLine="Item.SumMande = Item.SumMande - Val";
Debug.ShouldStop(16);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 551;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(64);
cls_recdefultkala.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_recdefultkala.__c.getField(true,"True")));
 };
 };
 }}
;
 BA.debugLineNum = 555;BA.debugLine="Item.TedadDarSabadJoz = A";
Debug.ShouldStop(1024);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 566;BA.debugLine="AddToSabad";
Debug.ShouldStop(2097152);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 568;BA.debugLine="If MCode.EshantionGroup=1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._eshantiongroup /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 572;BA.debugLine="CallSubDelayed2(Act_KalaDefault,\"AddEshantionGro";
Debug.ShouldStop(134217728);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((cls_recdefultkala._act_kaladefault.getObject())),(Object)(BA.ObjectToString("AddEshantionGroup")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeGroup" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 575;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("BtnUpKol_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,644);
if (RapidSub.canDelegate("btnupkol_click")) { return __ref.runUserSub(false, "cls_recdefultkala","btnupkol_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 644;BA.debugLine="Sub BtnUpKol_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 646;BA.debugLine="If Item.TedadDarKarton=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 647;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 649;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(256);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 650;BA.debugLine="Dim Val As Float = 1";
Debug.ShouldStop(512);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 653;BA.debugLine="A = Item.TedadDarSabadKol";
Debug.ShouldStop(4096);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 654;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 655;BA.debugLine="A = A + 1";
Debug.ShouldStop(16384);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 656;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Val";
Debug.ShouldStop(32768);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 658;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 659;BA.debugLine="A = A + 1";
Debug.ShouldStop(262144);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 660;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Val";
Debug.ShouldStop(524288);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 661;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 662;BA.debugLine="If Item.SumMandeKarton > 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 663;BA.debugLine="A = A + Val";
Debug.ShouldStop(4194304);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 664;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Va";
Debug.ShouldStop(8388608);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 666;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(33554432);
cls_recdefultkala.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_recdefultkala.__c.getField(true,"True")));
 };
 }}
;
 };
 BA.debugLineNum = 677;BA.debugLine="Item.TedadDarSabadKol = A";
Debug.ShouldStop(16);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 680;BA.debugLine="AddToSabad";
Debug.ShouldStop(128);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 682;BA.debugLine="If MCode.EshantionGroup=1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mcode._eshantiongroup /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 686;BA.debugLine="CallSubDelayed2(Act_KalaDefault,\"AddEshantionGro";
Debug.ShouldStop(8192);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((cls_recdefultkala._act_kaladefault.getObject())),(Object)(BA.ObjectToString("AddEshantionGroup")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeGroup" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 689;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkarzeshafzode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckArzeshAfzode (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,726);
if (RapidSub.canDelegate("checkarzeshafzode")) { return __ref.runUserSub(false, "cls_recdefultkala","checkarzeshafzode", __ref);}
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _feekol = RemoteObject.createImmutable("");
 BA.debugLineNum = 726;BA.debugLine="Sub CheckArzeshAfzode As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 727;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item.T";
Debug.ShouldStop(4194304);
_tedadkol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )))),BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 728;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
Debug.ShouldStop(8388608);
_feekol = BA.NumberToString((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)));Debug.locals.put("FeeKol", _feekol);Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 729;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzode";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ )))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",__ref.getField(false,"_swdisablearzeshafzode" /*RemoteObject*/ ).runMethod(true,"getChecked"))) { 
 BA.debugLineNum = 730;BA.debugLine="Item.fldArzeshAfzodeKala=myCode.Is_Null_adad(MCo";
Debug.ShouldStop(33554432);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldArzeshAfzodeKala" /*RemoteObject*/ ,cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(cls_recdefultkala._mcode.runMethod(true,"_mohasbearzeshafzodekala" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, _feekol)),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ )))))));
 BA.debugLineNum = 731;BA.debugLine="If Item.fldArzeshAfzodeKala>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 732;BA.debugLine="LblArzeshAfzodeKala.Text=\"مبلغ ارزش افزوده: \"&";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblarzeshafzodekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ ارزش افزوده: "),cls_recdefultkala._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))))));
 BA.debugLineNum = 733;BA.debugLine="FeeKol=FeeKol+Item.fldArzeshAfzodeKala";
Debug.ShouldStop(268435456);
_feekol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _feekol),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("FeeKol", _feekol);
 };
 }else {
 BA.debugLineNum = 736;BA.debugLine="LblArzeshAfzodeKala.Text=\"مبلغ ارزش افزوده: \"& m";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblarzeshafzodekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ ارزش افزوده: "),cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))))));
 };
 BA.debugLineNum = 738;BA.debugLine="Return FeeKol";
Debug.ShouldStop(2);
if (true) return _feekol;
 BA.debugLineNum = 739;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
cls_recdefultkala._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_recdefultkala._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_recdefultkala._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_recdefultkala._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private ImageRow As ImageView";
cls_recdefultkala._imagerow = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imagerow",cls_recdefultkala._imagerow);
 //BA.debugLineNum = 5;BA.debugLine="Private ImageOff As ImageView";
cls_recdefultkala._imageoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageoff",cls_recdefultkala._imageoff);
 //BA.debugLineNum = 7;BA.debugLine="Private lbl_title As Label";
cls_recdefultkala._lbl_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_title",cls_recdefultkala._lbl_title);
 //BA.debugLineNum = 8;BA.debugLine="Private ImageCall As ImageView";
cls_recdefultkala._imagecall = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imagecall",cls_recdefultkala._imagecall);
 //BA.debugLineNum = 9;BA.debugLine="Private LblFee As Label";
cls_recdefultkala._lblfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfee",cls_recdefultkala._lblfee);
 //BA.debugLineNum = 10;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
cls_recdefultkala._lblfeebadaztakhfid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfeebadaztakhfid",cls_recdefultkala._lblfeebadaztakhfid);
 //BA.debugLineNum = 11;BA.debugLine="Private LblC_Kala As Label";
cls_recdefultkala._lblc_kala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblc_kala",cls_recdefultkala._lblc_kala);
 //BA.debugLineNum = 12;BA.debugLine="Private ImageTozihat As ImageView";
cls_recdefultkala._imagetozihat = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imagetozihat",cls_recdefultkala._imagetozihat);
 //BA.debugLineNum = 13;BA.debugLine="Private LblMojoodiJoz As Label";
cls_recdefultkala._lblmojoodijoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodijoz",cls_recdefultkala._lblmojoodijoz);
 //BA.debugLineNum = 14;BA.debugLine="Private LblMojoodiKol As Label";
cls_recdefultkala._lblmojoodikol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodikol",cls_recdefultkala._lblmojoodikol);
 //BA.debugLineNum = 15;BA.debugLine="Private LblTedadKarton As Label";
cls_recdefultkala._lbltedadkarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkarton",cls_recdefultkala._lbltedadkarton);
 //BA.debugLineNum = 16;BA.debugLine="Private BtnUpJoz As Label";
cls_recdefultkala._btnupjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupjoz",cls_recdefultkala._btnupjoz);
 //BA.debugLineNum = 17;BA.debugLine="Private LblTedadJoz As Label";
cls_recdefultkala._lbltedadjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadjoz",cls_recdefultkala._lbltedadjoz);
 //BA.debugLineNum = 18;BA.debugLine="Private BtnDownJoz As Label";
cls_recdefultkala._btndownjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownjoz",cls_recdefultkala._btndownjoz);
 //BA.debugLineNum = 19;BA.debugLine="Private BtnDownKol As Label";
cls_recdefultkala._btndownkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownkol",cls_recdefultkala._btndownkol);
 //BA.debugLineNum = 20;BA.debugLine="Private LblTedadkol As Label";
cls_recdefultkala._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkol",cls_recdefultkala._lbltedadkol);
 //BA.debugLineNum = 21;BA.debugLine="Private BtnUpKol As Label";
cls_recdefultkala._btnupkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupkol",cls_recdefultkala._btnupkol);
 //BA.debugLineNum = 22;BA.debugLine="Private Item As AdapterListKala";
cls_recdefultkala._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");__ref.setField("_item",cls_recdefultkala._item);
 //BA.debugLineNum = 23;BA.debugLine="Private Key As IME";
cls_recdefultkala._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_key",cls_recdefultkala._key);
 //BA.debugLineNum = 24;BA.debugLine="Private base As Object";
cls_recdefultkala._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_recdefultkala._base);
 //BA.debugLineNum = 25;BA.debugLine="Private BtnDownEshan As Label";
cls_recdefultkala._btndowneshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndowneshan",cls_recdefultkala._btndowneshan);
 //BA.debugLineNum = 26;BA.debugLine="Private BtnUpEshan As Label";
cls_recdefultkala._btnupeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupeshan",cls_recdefultkala._btnupeshan);
 //BA.debugLineNum = 27;BA.debugLine="Private LblTedadEshan As Label";
cls_recdefultkala._lbltedadeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadeshan",cls_recdefultkala._lbltedadeshan);
 //BA.debugLineNum = 28;BA.debugLine="Private lblVahedJoz As Label";
cls_recdefultkala._lblvahedjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedjoz",cls_recdefultkala._lblvahedjoz);
 //BA.debugLineNum = 29;BA.debugLine="Private lblVahedKol As Label";
cls_recdefultkala._lblvahedkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedkol",cls_recdefultkala._lblvahedkol);
 //BA.debugLineNum = 30;BA.debugLine="Private LblBuyPrice As Label";
cls_recdefultkala._lblbuyprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblbuyprice",cls_recdefultkala._lblbuyprice);
 //BA.debugLineNum = 31;BA.debugLine="Private Panel4 As Panel";
cls_recdefultkala._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel4",cls_recdefultkala._panel4);
 //BA.debugLineNum = 32;BA.debugLine="Private LblGift As Label";
cls_recdefultkala._lblgift = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblgift",cls_recdefultkala._lblgift);
 //BA.debugLineNum = 33;BA.debugLine="Private LblTozihat As Label";
cls_recdefultkala._lbltozihat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltozihat",cls_recdefultkala._lbltozihat);
 //BA.debugLineNum = 35;BA.debugLine="Private btn_edit_Price As Label";
cls_recdefultkala._btn_edit_price = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btn_edit_price",cls_recdefultkala._btn_edit_price);
 //BA.debugLineNum = 36;BA.debugLine="Dim maxkolRond As String";
cls_recdefultkala._maxkolrond = RemoteObject.createImmutable("");__ref.setField("_maxkolrond",cls_recdefultkala._maxkolrond);
 //BA.debugLineNum = 38;BA.debugLine="Private LblCountEshantion As Label";
cls_recdefultkala._lblcounteshantion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcounteshantion",cls_recdefultkala._lblcounteshantion);
 //BA.debugLineNum = 40;BA.debugLine="Private btn_discount As Label";
cls_recdefultkala._btn_discount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btn_discount",cls_recdefultkala._btn_discount);
 //BA.debugLineNum = 41;BA.debugLine="Private LblMablaghTakhfif As Label";
cls_recdefultkala._lblmablaghtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghtakhfif",cls_recdefultkala._lblmablaghtakhfif);
 //BA.debugLineNum = 42;BA.debugLine="Private LblMablaghMasrafkonande As Label";
cls_recdefultkala._lblmablaghmasrafkonande = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghmasrafkonande",cls_recdefultkala._lblmablaghmasrafkonande);
 //BA.debugLineNum = 43;BA.debugLine="Private lblSumMablaghKala As Label";
cls_recdefultkala._lblsummablaghkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsummablaghkala",cls_recdefultkala._lblsummablaghkala);
 //BA.debugLineNum = 44;BA.debugLine="Private lblDarsadTakhfif As Label";
cls_recdefultkala._lbldarsadtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldarsadtakhfif",cls_recdefultkala._lbldarsadtakhfif);
 //BA.debugLineNum = 45;BA.debugLine="Private pnlJoz As Panel";
cls_recdefultkala._pnljoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnljoz",cls_recdefultkala._pnljoz);
 //BA.debugLineNum = 46;BA.debugLine="Private pnlKol As Panel";
cls_recdefultkala._pnlkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlkol",cls_recdefultkala._pnlkol);
 //BA.debugLineNum = 47;BA.debugLine="Private pnlEshan As Panel";
cls_recdefultkala._pnleshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnleshan",cls_recdefultkala._pnleshan);
 //BA.debugLineNum = 48;BA.debugLine="Private LblCodeGroup As Label";
cls_recdefultkala._lblcodegroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcodegroup",cls_recdefultkala._lblcodegroup);
 //BA.debugLineNum = 49;BA.debugLine="Private LblFeeYekKarton As Label";
cls_recdefultkala._lblfeeyekkarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfeeyekkarton",cls_recdefultkala._lblfeeyekkarton);
 //BA.debugLineNum = 53;BA.debugLine="Private LblDarsadArzeshAfzodeKala As Label";
cls_recdefultkala._lbldarsadarzeshafzodekala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldarsadarzeshafzodekala",cls_recdefultkala._lbldarsadarzeshafzodekala);
 //BA.debugLineNum = 54;BA.debugLine="Private LblArzeshAfzodeKala As Label";
cls_recdefultkala._lblarzeshafzodekala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblarzeshafzodekala",cls_recdefultkala._lblarzeshafzodekala);
 //BA.debugLineNum = 55;BA.debugLine="Private SwDisableArzeshAfzode As ACSwitch";
cls_recdefultkala._swdisablearzeshafzode = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");__ref.setField("_swdisablearzeshafzode",cls_recdefultkala._swdisablearzeshafzode);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _disablearzeshafzodekala(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("DisableArzeshAfzodeKala (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,990);
if (RapidSub.canDelegate("disablearzeshafzodekala")) { return __ref.runUserSub(false, "cls_recdefultkala","disablearzeshafzodekala", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 990;BA.debugLine="Sub DisableArzeshAfzodeKala(Checked As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 991;BA.debugLine="SwDisableArzeshAfzode.Checked=Checked";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_swdisablearzeshafzode" /*RemoteObject*/ ).runMethodAndSync(true,"setChecked",_checked);
 BA.debugLineNum = 992;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbytefrombitmap(RemoteObject __ref,RemoteObject _img,RemoteObject _quality) throws Exception{
try {
		Debug.PushSubsStack("GetByteFromBitmap (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,885);
if (RapidSub.canDelegate("getbytefrombitmap")) { return __ref.runUserSub(false, "cls_recdefultkala","getbytefrombitmap", __ref, _img, _quality);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _data = null;
Debug.locals.put("img", _img);
Debug.locals.put("Quality", _quality);
 BA.debugLineNum = 885;BA.debugLine="Sub GetByteFromBitmap(img As Bitmap, Quality As In";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 887;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(4194304);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 888;BA.debugLine="Dim data() As Byte";
Debug.ShouldStop(8388608);
_data = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 889;BA.debugLine="out.InitializeToBytesArray(1)";
Debug.ShouldStop(16777216);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 890;BA.debugLine="img.WriteToStream(out,Quality,\"JPEG\")";
Debug.ShouldStop(33554432);
_img.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(_quality),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 891;BA.debugLine="data = out.ToBytesArray";
Debug.ShouldStop(67108864);
_data = _out.runMethod(false,"ToBytesArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 892;BA.debugLine="out.Close";
Debug.ShouldStop(134217728);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 893;BA.debugLine="Return data";
Debug.ShouldStop(268435456);
if (true) return _data;
 BA.debugLineNum = 894;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("GetFilename (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,869);
if (RapidSub.canDelegate("getfilename")) { return __ref.runUserSub(false, "cls_recdefultkala","getfilename", __ref, _fullpath);}
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("fullpath", _fullpath);
 BA.debugLineNum = 869;BA.debugLine="Sub GetFilename(fullpath As String) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 870;BA.debugLine="Dim res As String";
Debug.ShouldStop(32);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 871;BA.debugLine="res = fullpath.SubString(fullpath.LastIndexOf(\"/\"";
Debug.ShouldStop(64);
_res = _fullpath.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_fullpath.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/"))),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("res", _res);
 BA.debugLineNum = 872;BA.debugLine="Return res";
Debug.ShouldStop(128);
if (true) return _res;
 BA.debugLineNum = 873;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("getHeight (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_recdefultkala","getheight", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
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
public static RemoteObject  _getpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPanel (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_recdefultkala","getpanel", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 92;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagerow_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ImageRow_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,810);
if (RapidSub.canDelegate("imagerow_click")) { return __ref.runUserSub(false, "cls_recdefultkala","imagerow_click", __ref);}
 BA.debugLineNum = 810;BA.debugLine="Sub ImageRow_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 812;BA.debugLine="Act_ImageSlideShow.Item = Item";
Debug.ShouldStop(2048);
cls_recdefultkala._act_imageslideshow._item /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ );
 BA.debugLineNum = 813;BA.debugLine="StartActivity(Act_ImageSlideShow)";
Debug.ShouldStop(4096);
cls_recdefultkala.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_recdefultkala._act_imageslideshow.getObject())));
 BA.debugLineNum = 817;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Initialize (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_recdefultkala","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _btnchangeprice = RemoteObject.createImmutable(0);
RemoteObject _btndiscount = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 61;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 63;BA.debugLine="base = mdl";
Debug.ShouldStop(1073741824);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 64;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_key" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 65;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 66;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(2);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recdefultkala.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_recdefultkala.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 67;BA.debugLine="p.LoadLayout(\"l_rechomeitem_2\")";
Debug.ShouldStop(4);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_rechomeitem_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 70;BA.debugLine="Dim btnChangePrice As Int=MCode.TaghirFeeKala";
Debug.ShouldStop(32);
_btnchangeprice = BA.numberCast(int.class, cls_recdefultkala._mcode._taghirfeekala /*RemoteObject*/ );Debug.locals.put("btnChangePrice", _btnchangeprice);Debug.locals.put("btnChangePrice", _btnchangeprice);
 BA.debugLineNum = 71;BA.debugLine="If btnChangePrice=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_btnchangeprice,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 72;BA.debugLine="btn_edit_Price.Visible=False";
Debug.ShouldStop(128);
__ref.getField(false,"_btn_edit_price" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recdefultkala.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 74;BA.debugLine="btn_edit_Price.Visible=True";
Debug.ShouldStop(512);
__ref.getField(false,"_btn_edit_price" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recdefultkala.__c.getField(true,"True"));
 };
 BA.debugLineNum = 77;BA.debugLine="Dim btndiscount As Int=MCode.TakhfifKala";
Debug.ShouldStop(4096);
_btndiscount = BA.numberCast(int.class, cls_recdefultkala._mcode._takhfifkala /*RemoteObject*/ );Debug.locals.put("btndiscount", _btndiscount);Debug.locals.put("btndiscount", _btndiscount);
 BA.debugLineNum = 78;BA.debugLine="If btndiscount=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_btndiscount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 79;BA.debugLine="btn_discount.Visible=False";
Debug.ShouldStop(16384);
__ref.getField(false,"_btn_discount" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recdefultkala.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 81;BA.debugLine="btn_discount.Visible=True";
Debug.ShouldStop(65536);
__ref.getField(false,"_btn_discount" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recdefultkala.__c.getField(true,"True"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e20.toString()); BA.debugLineNum = 85;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(1048576);
cls_recdefultkala._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_recdefultkala.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 86;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
cls_recdefultkala.__c.runVoidMethod ("LogImpl","5101384217",BA.ObjectToString(cls_recdefultkala.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("LblTedadJoz_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,819);
if (RapidSub.canDelegate("lbltedadjoz_click")) { return __ref.runUserSub(false, "cls_recdefultkala","lbltedadjoz_click", __ref);}
 BA.debugLineNum = 819;BA.debugLine="Sub LblTedadJoz_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 821;BA.debugLine="CallSubDelayed2(base,\"LblTedadJoz_Click\",Item)";
Debug.ShouldStop(1048576);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("LblTedadJoz_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 824;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("LblTedadKol_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,826);
if (RapidSub.canDelegate("lbltedadkol_click")) { return __ref.runUserSub(false, "cls_recdefultkala","lbltedadkol_click", __ref);}
 BA.debugLineNum = 826;BA.debugLine="Sub LblTedadKol_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 827;BA.debugLine="If myCode.Is_Null_adad(Item.TedadDarKarton)=0 The";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",cls_recdefultkala._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))),BA.NumberToString(0))) { 
 BA.debugLineNum = 828;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 831;BA.debugLine="CallSubDelayed2(base,\"LblTedadKol_Click\",Item)";
Debug.ShouldStop(1073741824);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("LblTedadKol_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 834;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("LblTozihat_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,516);
if (RapidSub.canDelegate("lbltozihat_click")) { return __ref.runUserSub(false, "cls_recdefultkala","lbltozihat_click", __ref);}
 BA.debugLineNum = 516;BA.debugLine="Sub LblTozihat_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 517;BA.debugLine="If myCode.Is_Null(Item.fldSharh) <> \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",cls_recdefultkala._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldSharh" /*RemoteObject*/ ))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 518;BA.debugLine="Msgbox(myCode.Is_Null(Item.fldSharh),\"توضیحات کا";
Debug.ShouldStop(32);
cls_recdefultkala.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(cls_recdefultkala._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldSharh" /*RemoteObject*/ ))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("توضیحات کالا"))),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 520;BA.debugLine="ToastMessageShow(\"این کالا فاقد توضیحات است\",Fa";
Debug.ShouldStop(128);
cls_recdefultkala.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("این کالا فاقد توضیحات است")),(Object)(cls_recdefultkala.__c.getField(true,"False")));
 };
 BA.debugLineNum = 522;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mojavezsefaresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MojavezSefaresh (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,480);
if (RapidSub.canDelegate("mojavezsefaresh")) { return __ref.runUserSub(false, "cls_recdefultkala","mojavezsefaresh", __ref);}
 BA.debugLineNum = 480;BA.debugLine="Private Sub MojavezSefaresh";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 481;BA.debugLine="Select MCode.MojavezSefaresh";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(cls_recdefultkala._mcode._mojavezsefaresh /*RemoteObject*/ ,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2))) {
case 0: {
 BA.debugLineNum = 483;BA.debugLine="BtnUpJoz.Enabled=True";
Debug.ShouldStop(4);
__ref.getField(false,"_btnupjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 484;BA.debugLine="BtnDownJoz.Enabled=True";
Debug.ShouldStop(8);
__ref.getField(false,"_btndownjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 485;BA.debugLine="pnlJoz.Enabled=True";
Debug.ShouldStop(16);
__ref.getField(false,"_pnljoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 486;BA.debugLine="LblTedadJoz.Enabled=True";
Debug.ShouldStop(32);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 488;BA.debugLine="BtnUpKol.Enabled=True";
Debug.ShouldStop(128);
__ref.getField(false,"_btnupkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 489;BA.debugLine="BtnDownKol.Enabled=True";
Debug.ShouldStop(256);
__ref.getField(false,"_btndownkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 490;BA.debugLine="pnlKol.Enabled=True";
Debug.ShouldStop(512);
__ref.getField(false,"_pnlkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 491;BA.debugLine="LblTedadkol.Enabled=True";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 break; }
case 1: {
 BA.debugLineNum = 493;BA.debugLine="BtnUpJoz.Enabled=True";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnupjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 494;BA.debugLine="BtnDownJoz.Enabled=True";
Debug.ShouldStop(8192);
__ref.getField(false,"_btndownjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 495;BA.debugLine="pnlJoz.Enabled=True";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnljoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 496;BA.debugLine="LblTedadJoz.Enabled=True";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 498;BA.debugLine="BtnUpKol.Enabled=False";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnupkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"False"));
 BA.debugLineNum = 499;BA.debugLine="BtnDownKol.Enabled=False";
Debug.ShouldStop(262144);
__ref.getField(false,"_btndownkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"False"));
 BA.debugLineNum = 500;BA.debugLine="pnlKol.Enabled=False";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"False"));
 BA.debugLineNum = 501;BA.debugLine="LblTedadkol.Enabled=False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"False"));
 break; }
case 2: {
 BA.debugLineNum = 503;BA.debugLine="BtnUpJoz.Enabled=False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnupjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"False"));
 BA.debugLineNum = 504;BA.debugLine="BtnDownJoz.Enabled=False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btndownjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"False"));
 BA.debugLineNum = 505;BA.debugLine="pnlJoz.Enabled=False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnljoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"False"));
 BA.debugLineNum = 506;BA.debugLine="LblTedadJoz.Enabled=False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"False"));
 BA.debugLineNum = 508;BA.debugLine="BtnUpKol.Enabled=True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnupkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 509;BA.debugLine="BtnDownKol.Enabled=True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btndownkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 510;BA.debugLine="pnlKol.Enabled=True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnlkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 BA.debugLineNum = 511;BA.debugLine="LblTedadkol.Enabled=True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recdefultkala.__c.getField(true,"True"));
 break; }
}
;
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
public static RemoteObject  _pnl_bk_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_bk_Click (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,976);
if (RapidSub.canDelegate("pnl_bk_click")) { return __ref.runUserSub(false, "cls_recdefultkala","pnl_bk_click", __ref);}
 BA.debugLineNum = 976;BA.debugLine="Sub pnl_bk_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 979;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show(RemoteObject __ref,RemoteObject _item1,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cls_recdefultkala","show", __ref, _item1, _position); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,__ref,_item1,_position);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(ir.parsikhesab.pakhsh.cls_recdefultkala parent,RemoteObject __ref,RemoteObject _item1,RemoteObject _position) {
this.parent = parent;
this.__ref = __ref;
this._item1 = _item1;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_recdefultkala parent;
RemoteObject _item1;
RemoteObject _position;
RemoteObject _imagerow1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _fee = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _feekol = RemoteObject.createImmutable("");
RemoteObject _price = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,99);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Item1", _item1);
Debug.locals.put("position", _position);
 BA.debugLineNum = 100;BA.debugLine="Item=Item1";
Debug.ShouldStop(8);
__ref.setField ("_item" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 101;BA.debugLine="Private ImageRow1 As ImageView";
Debug.ShouldStop(16);
_imagerow1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("ImageRow1", _imagerow1);
 BA.debugLineNum = 102;BA.debugLine="ImageRow1.Initialize(\"\")";
Debug.ShouldStop(32);
_imagerow1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 103;BA.debugLine="ImageRow1.Tag=position";
Debug.ShouldStop(64);
_imagerow1.runMethod(false,"setTag",(_position));
 BA.debugLineNum = 106;BA.debugLine="lbl_title.Text = Item.NameKala";
Debug.ShouldStop(512);
__ref.getField(false,"_lbl_title" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameKala" /*RemoteObject*/ )));
 BA.debugLineNum = 107;BA.debugLine="LblCodeGroup.Text = \"کد گروه: \" & Item.CodeGroup";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblcodegroup" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد گروه: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeGroup" /*RemoteObject*/ ))));
 BA.debugLineNum = 108;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & Item.CodeKala";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblc_kala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد کالا: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 109;BA.debugLine="Dim fee As Int";
Debug.ShouldStop(4096);
_fee = RemoteObject.createImmutable(0);Debug.locals.put("fee", _fee);
 BA.debugLineNum = 111;BA.debugLine="fee=Item.FeeForoosh";
Debug.ShouldStop(16384);
_fee = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ );Debug.locals.put("fee", _fee);
 BA.debugLineNum = 112;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select * from TblS";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblSabad where FldCodeKala="),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 113;BA.debugLine="cu.Position=0";
Debug.ShouldStop(65536);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 114;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 115;BA.debugLine="fee=cu.GetString(\"FldFeeForoosh\")";
Debug.ShouldStop(262144);
_fee = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFeeForoosh"))));Debug.locals.put("fee", _fee);
 if (true) break;
;
 BA.debugLineNum = 154;BA.debugLine="If Item.MablaghTakhfif>0 Then";
Debug.ShouldStop(33554432);

case 4:
//if
this.state = 15;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 155;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item.";
Debug.ShouldStop(67108864);
_tedadkol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )))),BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 156;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
Debug.ShouldStop(134217728);
_feekol = BA.NumberToString((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)));Debug.locals.put("FeeKol", _feekol);Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 157;BA.debugLine="If tedadKol>0 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadkol),BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 158;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKol";
Debug.ShouldStop(536870912);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 159;BA.debugLine="Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghT";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _feekol),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 if (true) break;

case 11:
//C
this.state = 12;
 if (true) break;

case 12:
//C
this.state = 15;
;
 BA.debugLineNum = 163;BA.debugLine="LblMablaghTakhfif.Text=\"فی تخفیف: \"& myCode.Adad";
Debug.ShouldStop(4);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی تخفیف: "),parent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ )))))))));
 BA.debugLineNum = 164;BA.debugLine="LblMablaghTakhfif.TextColor=Colors.Red";
Debug.ShouldStop(8);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 165;BA.debugLine="lblDarsadTakhfif.TextColor=Colors.Red";
Debug.ShouldStop(16);
__ref.getField(false,"_lbldarsadtakhfif" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 166;BA.debugLine="LblMablaghTakhfif.Visible=True";
Debug.ShouldStop(32);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 167;BA.debugLine="lblDarsadTakhfif.Visible=True";
Debug.ShouldStop(64);
__ref.getField(false,"_lbldarsadtakhfif" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 168;BA.debugLine="lblDarsadTakhfif.Text=\"درصد تخفیف: %\"& myCode.Is";
Debug.ShouldStop(128);
__ref.getField(false,"_lbldarsadtakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("درصد تخفیف: %"),parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))))));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 170;BA.debugLine="lblDarsadTakhfif.Text=0";
Debug.ShouldStop(512);
__ref.getField(false,"_lbldarsadtakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 171;BA.debugLine="LblMablaghTakhfif.Text=0";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 172;BA.debugLine="LblMablaghTakhfif.Visible=False";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 173;BA.debugLine="lblDarsadTakhfif.Visible=False";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbldarsadtakhfif" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 177;BA.debugLine="Log(fee)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","5101580878",BA.NumberToString(_fee),0);
 BA.debugLineNum = 178;BA.debugLine="If IsNumber(Item.FldFeeBadAzTakhfif) = True Then";
Debug.ShouldStop(131072);
if (true) break;

case 16:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",parent.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),parent.__c.getField(true,"True"))) { 
this.state = 18;
}else {
this.state = 30;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 185;BA.debugLine="If Item.FldFeeBadAzTakhfif > 0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
this.state = 21;
}else 
{ BA.debugLineNum = 192;BA.debugLine="Else If Item.FldFeeBadAzTakhfif = 0 And myCode.I";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))),BA.NumberToString(100))) { 
this.state = 23;
}else 
{ BA.debugLineNum = 201;BA.debugLine="Else If Item.FldFeeBadAzTakhfif = 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ),BA.NumberToString(0))) { 
this.state = 25;
}else {
this.state = 27;
}}}
if (true) break;

case 21:
//C
this.state = 28;
 BA.debugLineNum = 186;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(m";
Debug.ShouldStop(33554432);
parent._mcode._rs /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_fee))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ ))));
 BA.debugLineNum = 187;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
Debug.ShouldStop(67108864);
parent._mcode._rs /*RemoteObject*/ .runVoidMethod ("Strikethrough",(Object)(BA.numberCast(int.class, 0)),(Object)(parent._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 188;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
Debug.ShouldStop(134217728);
parent._mcode._rs /*RemoteObject*/ .runVoidMethod ("Color",(Object)(parent.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 0)),(Object)(parent._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 189;BA.debugLine="LblFee.Text = MCode.Rs";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._mcode._rs /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 190;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"& N";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی بعد از تخفیف: "),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 191;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 23:
//C
this.state = 28;
 BA.debugLineNum = 193;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(m";
Debug.ShouldStop(1);
parent._mcode._rs /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_fee))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ ))));
 BA.debugLineNum = 194;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
Debug.ShouldStop(2);
parent._mcode._rs /*RemoteObject*/ .runVoidMethod ("Strikethrough",(Object)(BA.numberCast(int.class, 0)),(Object)(parent._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 195;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
Debug.ShouldStop(4);
parent._mcode._rs /*RemoteObject*/ .runVoidMethod ("Color",(Object)(parent.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 0)),(Object)(parent._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 196;BA.debugLine="Item.MablaghTakhfif=(Item.FeeForoosh*Item.Tedad";
Debug.ShouldStop(8);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "*+",1, 0))));
 BA.debugLineNum = 197;BA.debugLine="Item.FldFeeBadAzTakhfif=0";
Debug.ShouldStop(16);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 198;BA.debugLine="LblFee.Text = 0";
Debug.ShouldStop(32);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 199;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"& N";
Debug.ShouldStop(64);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی بعد از تخفیف: "),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 200;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(128);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 25:
//C
this.state = 28;
 BA.debugLineNum = 202;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(m";
Debug.ShouldStop(512);
parent._mcode._rs /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_fee))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ ))));
 BA.debugLineNum = 203;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
Debug.ShouldStop(1024);
parent._mcode._rs /*RemoteObject*/ .runVoidMethod ("Strikethrough",(Object)(BA.numberCast(int.class, 0)),(Object)(parent._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 204;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
Debug.ShouldStop(2048);
parent._mcode._rs /*RemoteObject*/ .runVoidMethod ("Color",(Object)(parent.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 0)),(Object)(parent._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 205;BA.debugLine="LblFee.Text = MCode.Rs";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._mcode._rs /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 206;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"& N";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی بعد از تخفیف: "),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 207;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(16384);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 209;BA.debugLine="LblFee.Text =\"فی فروش: \"& NumberFormat(myCode.I";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_fee))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 210;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 211;BA.debugLine="ImageOff.Visible=False";
Debug.ShouldStop(262144);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;

case 28:
//C
this.state = 31;
;
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 214;BA.debugLine="LblFee.Text =\"فی فروش: \"& NumberFormat(myCode.Is";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_fee))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 215;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;
;
 BA.debugLineNum = 218;BA.debugLine="If Item.TedadDarSabadJoz=Null Then";
Debug.ShouldStop(33554432);

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
 BA.debugLineNum = 219;BA.debugLine="LblTedadJoz.Text=0";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 220;BA.debugLine="Item.TedadDarSabadJoz=0";
Debug.ShouldStop(134217728);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 222;BA.debugLine="LblTedadJoz.Text =Item.TedadDarSabadJoz";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )));
 if (true) break;

case 36:
//C
this.state = 37;
;
 BA.debugLineNum = 224;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& Item.NameVahed";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblvahedjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 226;BA.debugLine="If Item.TedadDarSabadKol=Null Then";
Debug.ShouldStop(2);
if (true) break;

case 37:
//if
this.state = 42;
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 42;
 BA.debugLineNum = 227;BA.debugLine="LblTedadkol.Text=0";
Debug.ShouldStop(4);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 228;BA.debugLine="Item.TedadDarSabadKol=0";
Debug.ShouldStop(8);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 230;BA.debugLine="LblTedadkol.Text =Item.TedadDarSabadKol";
Debug.ShouldStop(32);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 232;BA.debugLine="If Item.NameVahed2=\"\" Then";
Debug.ShouldStop(128);

case 42:
//if
this.state = 47;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 44;
}else {
this.state = 46;
}if (true) break;

case 44:
//C
this.state = 47;
 BA.debugLineNum = 233;BA.debugLine="lblVahedKol.Text = \"تعداد به کارتن \"& Item.NameV";
Debug.ShouldStop(256);
__ref.getField(false,"_lblvahedkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به کارتن "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 235;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& Item.NameVahed2";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblvahedkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 if (true) break;

case 47:
//C
this.state = 48;
;
 BA.debugLineNum = 250;BA.debugLine="Item.FldEshantion=myCode.Is_Null_adad(Item.FldEsh";
Debug.ShouldStop(33554432);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ))));
 BA.debugLineNum = 252;BA.debugLine="Dim Price As Long=0";
Debug.ShouldStop(134217728);
_price = BA.numberCast(long.class, 0);Debug.locals.put("Price", _price);Debug.locals.put("Price", _price);
 BA.debugLineNum = 253;BA.debugLine="If myCode.Is_Null_adad(Item.FldFeeBadAzTakhfif) >";
Debug.ShouldStop(268435456);
if (true) break;

case 48:
//if
this.state = 55;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
this.state = 50;
}else 
{ BA.debugLineNum = 256;BA.debugLine="Else If myCode.Is_Null_adad(Item.FldFeeBadAzTakhf";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))),BA.NumberToString(100))) { 
this.state = 52;
}else {
this.state = 54;
}}
if (true) break;

case 50:
//C
this.state = 55;
 BA.debugLineNum = 254;BA.debugLine="Price = Item.FldFeeBadAzTakhfif * ((Item.TedadDa";
Debug.ShouldStop(536870912);
_price = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "+",1, 0))}, "*",0, 0));Debug.locals.put("Price", _price);
 BA.debugLineNum = 255;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 52:
//C
this.state = 55;
 BA.debugLineNum = 257;BA.debugLine="Price=0";
Debug.ShouldStop(1);
_price = BA.numberCast(long.class, 0);Debug.locals.put("Price", _price);
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 259;BA.debugLine="Price = Item.FeeForoosh * ((Item.TedadDarSabadKol";
Debug.ShouldStop(4);
_price = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))))}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "+",1, 0))}, "*",0, 0));Debug.locals.put("Price", _price);
 BA.debugLineNum = 260;BA.debugLine="ImageOff.Visible=False";
Debug.ShouldStop(8);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 263;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzode";
Debug.ShouldStop(64);

case 55:
//if
this.state = 62;
if (RemoteObject.solveBoolean("=",parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ))),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",parent._mcode._arzeshafzodeenable /*RemoteObject*/ ,BA.NumberToString(1)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_swdisablearzeshafzode" /*RemoteObject*/ ).runMethod(true,"getChecked"),parent.__c.getField(true,"True"))) { 
this.state = 57;
}else 
{ BA.debugLineNum = 265;BA.debugLine="Else If myCode.Is_Null_adad(Item.fldDarsadArzeshA";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ )))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",parent._mcode._arzeshafzodeenable /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 59;
}else {
this.state = 61;
}}
if (true) break;

case 57:
//C
this.state = 62;
 BA.debugLineNum = 264;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=myCode.Is_Null_ad";
Debug.ShouldStop(128);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ,parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent._mcode._arzeshafzode /*RemoteObject*/ )));
 if (true) break;

case 59:
//C
this.state = 62;
 BA.debugLineNum = 266;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=myCode.Is_Null_ad";
Debug.ShouldStop(512);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ,parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ))));
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 268;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=0";
Debug.ShouldStop(2048);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 62:
//C
this.state = 63;
;
 BA.debugLineNum = 271;BA.debugLine="LblDarsadArzeshAfzodeKala.Text=\"درصد ارزش افزوده:";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbldarsadarzeshafzodekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("درصد ارزش افزوده: %"),parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ))))));
 BA.debugLineNum = 274;BA.debugLine="If Item.TedadDarKarton<>0 And IsNumber(Item.Tedad";
Debug.ShouldStop(131072);
if (true) break;

case 63:
//if
this.state = 80;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",parent.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))),parent.__c.getField(true,"True"))) { 
this.state = 65;
}else {
this.state = 73;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 275;BA.debugLine="maxkolRond=(Item.SumMandeKarton)";
Debug.ShouldStop(262144);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )));
 BA.debugLineNum = 277;BA.debugLine="If Item.NameVahed2=\"\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 66:
//if
this.state = 71;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
 BA.debugLineNum = 278;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& Item.Te";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 280;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&Item.NameVahed2";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),RemoteObject.createImmutable(": "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 if (true) break;

case 71:
//C
this.state = 80;
;
 BA.debugLineNum = 282;BA.debugLine="LblFeeYekKarton.Text=\"فی یک کارتن: \"&myCode.Adad";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblfeeyekkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی یک کارتن: "),parent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)))))));
 BA.debugLineNum = 283;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","5101580984",__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ),0);
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 285;BA.debugLine="maxkolRond=0";
Debug.ShouldStop(268435456);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 287;BA.debugLine="If Item.NameVahed2=\"\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 74:
//if
this.state = 79;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 76;
}else {
this.state = 78;
}if (true) break;

case 76:
//C
this.state = 79;
 BA.debugLineNum = 288;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& maxkolR";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن: "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ))));
 if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 290;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&Item.NameVahed2";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),RemoteObject.createImmutable(": "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ))));
 if (true) break;

case 79:
//C
this.state = 80;
;
 BA.debugLineNum = 292;BA.debugLine="LblFeeYekKarton.Text=\"فی یک کارتن: \"&0";
Debug.ShouldStop(8);
__ref.getField(false,"_lblfeeyekkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی یک کارتن: "),RemoteObject.createImmutable(0))));
 BA.debugLineNum = 293;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(16);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 if (true) break;

case 80:
//C
this.state = 81;
;
 BA.debugLineNum = 295;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","5101580996",__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ),0);
 BA.debugLineNum = 296;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& Item.SumMande";
Debug.ShouldStop(128);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی جزء: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 298;BA.debugLine="If  Item.SumMandeKarton <> Null Then";
Debug.ShouldStop(512);
if (true) break;

case 81:
//if
this.state = 86;
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ ))) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
 BA.debugLineNum = 299;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی کل: "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 301;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 if (true) break;
;
 BA.debugLineNum = 304;BA.debugLine="If Item.TedadDarSabadJoz>0 Then";
Debug.ShouldStop(32768);

case 86:
//if
this.state = 89;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
this.state = 88;
}if (true) break;

case 88:
//C
this.state = 89;
 BA.debugLineNum = 305;BA.debugLine="AddEshantion(Item.TedadDarSabadJoz)";
Debug.ShouldStop(65536);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_addeshantion" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))));
 BA.debugLineNum = 306;BA.debugLine="LblTedadEshan.Text = Item.FldEshantion";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 308;BA.debugLine="If Item.fldCountEshantion<>Null Then";
Debug.ShouldStop(524288);

case 89:
//if
this.state = 94;
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ ))) { 
this.state = 91;
}else {
this.state = 93;
}if (true) break;

case 91:
//C
this.state = 94;
 BA.debugLineNum = 309;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : \" & Item.fl";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblcounteshantion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد هدیه : "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ ))));
 BA.debugLineNum = 310;BA.debugLine="LblTedadEshan.Text=Item.FldEshantion";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )));
 if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 312;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : 0\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblcounteshantion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("تعداد هدیه : 0"));
 if (true) break;
;
 BA.debugLineNum = 314;BA.debugLine="If MCode.EshantionGroup=1 Then";
Debug.ShouldStop(33554432);

case 94:
//if
this.state = 97;
if (RemoteObject.solveBoolean("=",parent._mcode._eshantiongroup /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 315;BA.debugLine="LblTedadEshan.Text=Item.FldEshantion";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 321;BA.debugLine="If Price>0 Then";
Debug.ShouldStop(1);

case 97:
//if
this.state = 112;
if (RemoteObject.solveBoolean(">",_price,BA.numberCast(long.class, 0))) { 
this.state = 99;
}else {
this.state = 111;
}if (true) break;

case 99:
//C
this.state = 100;
 BA.debugLineNum = 322;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzo";
Debug.ShouldStop(2);
if (true) break;

case 100:
//if
this.state = 109;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ )))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",__ref.getField(false,"_swdisablearzeshafzode" /*RemoteObject*/ ).runMethod(true,"getChecked"))) { 
this.state = 102;
}else {
this.state = 108;
}if (true) break;

case 102:
//C
this.state = 103;
 BA.debugLineNum = 323;BA.debugLine="Item.fldArzeshAfzodeKala=myCode.Is_Null_adad(M";
Debug.ShouldStop(4);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldArzeshAfzodeKala" /*RemoteObject*/ ,parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(parent._mcode.runMethod(true,"_mohasbearzeshafzodekala" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_price),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ )))))));
 BA.debugLineNum = 324;BA.debugLine="If Item.fldArzeshAfzodeKala>0 Then";
Debug.ShouldStop(8);
if (true) break;

case 103:
//if
this.state = 106;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
this.state = 105;
}if (true) break;

case 105:
//C
this.state = 106;
 BA.debugLineNum = 325;BA.debugLine="LblArzeshAfzodeKala.Text=\"مبلغ ارزش افزوده: \"";
Debug.ShouldStop(16);
__ref.getField(false,"_lblarzeshafzodekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ ارزش افزوده: "),parent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))))));
 BA.debugLineNum = 326;BA.debugLine="Price=Price+Item.fldArzeshAfzodeKala";
Debug.ShouldStop(32);
_price = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_price,BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("Price", _price);
 if (true) break;

case 106:
//C
this.state = 109;
;
 if (true) break;

case 108:
//C
this.state = 109;
 BA.debugLineNum = 329;BA.debugLine="LblArzeshAfzodeKala.Text=\"مبلغ ارزش افزوده: \"&";
Debug.ShouldStop(256);
__ref.getField(false,"_lblarzeshafzodekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ ارزش افزوده: "),parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))))));
 if (true) break;

case 109:
//C
this.state = 112;
;
 BA.debugLineNum = 332;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: \"& NumberForma";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblsummablaghkala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("جمع مبلغ: "),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_price))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ )));
 if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 334;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: 0\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblsummablaghkala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("جمع مبلغ: 0"));
 if (true) break;
;
 BA.debugLineNum = 357;BA.debugLine="If myCode.Is_Null_adad(Item.FldMablaghMasrafKonan";
Debug.ShouldStop(16);

case 112:
//if
this.state = 117;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, parent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldMablaghMasrafKonande" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
this.state = 114;
}else {
this.state = 116;
}if (true) break;

case 114:
//C
this.state = 117;
 BA.debugLineNum = 358;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده: \"";
Debug.ShouldStop(32);
__ref.getField(false,"_lblmablaghmasrafkonande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("قیمت مصرف کننده: "),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldMablaghMasrafKonande" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),parent._mcode._vahedpool /*RemoteObject*/ )));
 if (true) break;

case 116:
//C
this.state = 117;
 BA.debugLineNum = 360;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده: 0";
Debug.ShouldStop(128);
__ref.getField(false,"_lblmablaghmasrafkonande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("قیمت مصرف کننده: 0"));
 if (true) break;
;
 BA.debugLineNum = 363;BA.debugLine="If MCode.HideMojodi=1 Then";
Debug.ShouldStop(1024);

case 117:
//if
this.state = 122;
if (RemoteObject.solveBoolean("=",parent._mcode._hidemojodi /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 119;
}else {
this.state = 121;
}if (true) break;

case 119:
//C
this.state = 122;
 BA.debugLineNum = 364;BA.debugLine="LblMojoodiJoz.Visible=False";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 365;BA.debugLine="LblMojoodiKol.Visible=False";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;

case 121:
//C
this.state = 122;
 BA.debugLineNum = 367;BA.debugLine="LblMojoodiJoz.Visible=True";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 368;BA.debugLine="LblMojoodiKol.Visible=True";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 372;BA.debugLine="Try";
Debug.ShouldStop(524288);

case 122:
//try
this.state = 127;
this.catchState = 126;
this.state = 124;
if (true) break;

case 124:
//C
this.state = 127;
this.catchState = 126;
 BA.debugLineNum = 445;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(Item.CodeKal";
Debug.ShouldStop(268435456);
parent._mcode._placeholder /*RemoteObject*/  = parent._mcode.runMethod(false,"_getpickala" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ )));
 BA.debugLineNum = 446;BA.debugLine="ImageRow.Bitmap=MCode.placeHolder";
Debug.ShouldStop(536870912);
__ref.getField(false,"_imagerow" /*RemoteObject*/ ).runMethod(false,"setBitmap",(parent._mcode._placeholder /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 448;BA.debugLine="MojavezSefaresh";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_mojavezsefaresh" /*RemoteObject*/ );
 BA.debugLineNum = 449;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_recdefultkala", "show"),BA.numberCast(int.class, 200));
this.state = 131;
return;
case 131:
//C
this.state = 127;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 126:
//C
this.state = 127;
this.catchState = 0;
 BA.debugLineNum = 452;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","5101581153",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 454;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
Debug.ShouldStop(32);

case 127:
//if
this.state = 130;
this.catchState = 0;
if (RemoteObject.solveBoolean("=",parent._mcode._eshantiontabaghati /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 129;
}if (true) break;

case 129:
//C
this.state = 130;
 BA.debugLineNum = 455;BA.debugLine="LblGift.Visible=MCode.CheckEshantion(Item.CodeKa";
Debug.ShouldStop(64);
__ref.getField(false,"_lblgift" /*RemoteObject*/ ).runMethod(true,"setVisible",parent._mcode.runMethod(true,"_checkeshantion" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 if (true) break;

case 130:
//C
this.state = -1;
;
 BA.debugLineNum = 459;BA.debugLine="LblGift.Visible=MCode.CheckEshantionGroup(Item.Co";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblgift" /*RemoteObject*/ ).runMethod(true,"setVisible",parent._mcode.runMethod(true,"_checkeshantiongroup" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeGroup" /*RemoteObject*/ ))));
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _swdisablearzeshafzode_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwDisableArzeshAfzode_CheckedChange (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,994);
if (RapidSub.canDelegate("swdisablearzeshafzode_checkedchange")) { return __ref.runUserSub(false, "cls_recdefultkala","swdisablearzeshafzode_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 994;BA.debugLine="Private Sub SwDisableArzeshAfzode_CheckedChange(Ch";
Debug.ShouldStop(2);
 BA.debugLineNum = 995;BA.debugLine="CallSubDelayed3(base,\"DisableArzeshAfzode\",Item,S";
Debug.ShouldStop(4);
cls_recdefultkala.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("DisableArzeshAfzode")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_swdisablearzeshafzode" /*RemoteObject*/ ))));
 BA.debugLineNum = 996;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("WriteBitmap2File (cls_recdefultkala) ","cls_recdefultkala",82,__ref.getField(false, "ba"),__ref,874);
if (RapidSub.canDelegate("writebitmap2file")) { return __ref.runUserSub(false, "cls_recdefultkala","writebitmap2file", __ref, _image, _quality, _filename);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _data = null;
Debug.locals.put("Image", _image);
Debug.locals.put("Quality", _quality);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 874;BA.debugLine="Sub WriteBitmap2File(Image As Bitmap, Quality As I";
Debug.ShouldStop(512);
 BA.debugLineNum = 875;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 876;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Starte";
Debug.ShouldStop(2048);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = cls_recdefultkala.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(cls_recdefultkala._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(cls_recdefultkala.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 877;BA.debugLine="Dim data() As Byte = GetByteFromBitmap(Image, Qu";
Debug.ShouldStop(4096);
_data = __ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_getbytefrombitmap" /*RemoteObject*/ ,(Object)(_image),(Object)(_quality));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 878;BA.debugLine="out.WriteBytes(data, 0, data.Length)";
Debug.ShouldStop(8192);
_out.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 880;BA.debugLine="Log(DateTime.Date(DateTime.Now)&\"=\"&\"WriteBitmap";
Debug.ShouldStop(32768);
cls_recdefultkala.__c.runVoidMethod ("LogImpl","5102498310",RemoteObject.concat(cls_recdefultkala.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(cls_recdefultkala.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable("="),RemoteObject.createImmutable("WriteBitmap2File")),0);
 };
 BA.debugLineNum = 882;BA.debugLine="out.Close";
Debug.ShouldStop(131072);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 883;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}