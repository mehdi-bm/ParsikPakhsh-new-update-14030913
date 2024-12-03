package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_search_subs_0 {


public static RemoteObject  _addtosabad(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddToSabad (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,423);
if (RapidSub.canDelegate("addtosabad")) { return __ref.runUserSub(false, "cls_search","addtosabad", __ref);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _check = RemoteObject.createImmutable(false);
int _i = 0;
 BA.debugLineNum = 423;BA.debugLine="Sub AddToSabad";
Debug.ShouldStop(64);
 BA.debugLineNum = 425;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(256);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_search._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 426;BA.debugLine="Dim Check As Boolean";
Debug.ShouldStop(512);
_check = RemoteObject.createImmutable(false);Debug.locals.put("Check", _check);
 BA.debugLineNum = 427;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(1024);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 428;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(2048);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 429;BA.debugLine="If Cu.GetString(\"FldC_Kala\") = Item.CodeKala The";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Kala"))),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 430;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 431;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
Debug.ShouldStop(16384);
cls_search._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldC_Kala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 433;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
Debug.ShouldStop(65536);
cls_search._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadJoz = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadKol = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("' Where FldC_kala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 436;BA.debugLine="Check = True";
Debug.ShouldStop(524288);
_check = cls_search.__c.getField(true,"True");Debug.locals.put("Check", _check);
 BA.debugLineNum = 437;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 440;BA.debugLine="If Check = False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_check,cls_search.__c.getField(true,"False"))) { 
 };
 BA.debugLineNum = 443;BA.debugLine="CallSubDelayed(base,\"RefreshLblSabad\")";
Debug.ShouldStop(67108864);
cls_search.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("RefreshLblSabad")));
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Btn_call_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("btn_call_click")) { return __ref.runUserSub(false, "cls_search","btn_call_click", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 302;BA.debugLine="Sub Btn_call_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 303;BA.debugLine="Dim str As String=$\"جهت دریافت قیمت همکار لطفا با";
Debug.ShouldStop(16384);
_str = (RemoteObject.concat(RemoteObject.createImmutable("جهت دریافت قیمت همکار لطفا با شماره\n"),RemoteObject.createImmutable("		 021-888821546 \n"),RemoteObject.createImmutable("		 تماس بگیرید")));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 306;BA.debugLine="Msgbox(str,\"قیمت همکاری\")";
Debug.ShouldStop(131072);
cls_search.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_str)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("قیمت همکاری"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("BtnDownEshan_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,531);
if (RapidSub.canDelegate("btndowneshan_click")) { return __ref.runUserSub(false, "cls_search","btndowneshan_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 531;BA.debugLine="Sub BtnDownEshan_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 532;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(524288);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 539;BA.debugLine="AddToSabad";
Debug.ShouldStop(67108864);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("BtnDownJoz_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("btndownjoz_click")) { return __ref.runUserSub(false, "cls_search","btndownjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 375;BA.debugLine="Sub BtnDownJoz_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 376;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(8388608);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 377;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(16777216);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 378;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(cls_search._mcode._isfloat /*RemoteObject*/ ,cls_search.__c.getField(true,"True"),cls_search.__c.getField(true,"False"))) {
case 0: {
 BA.debugLineNum = 380;BA.debugLine="Val = 0.25";
Debug.ShouldStop(134217728);
_val = BA.numberCast(float.class, 0.25);Debug.locals.put("Val", _val);
 break; }
case 1: {
 BA.debugLineNum = 382;BA.debugLine="Val = 1";
Debug.ShouldStop(536870912);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 break; }
}
;
 BA.debugLineNum = 385;BA.debugLine="A = Item.TedadDarSabadJoz";
Debug.ShouldStop(1);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 386;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 387;BA.debugLine="A = A - Val";
Debug.ShouldStop(4);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "-",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 388;BA.debugLine="Item.SumMande = Item.SumMande + Val";
Debug.ShouldStop(8);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "+",1, 0)));
 BA.debugLineNum = 389;BA.debugLine="Item.TedadDarSabadJoz = A";
Debug.ShouldStop(16);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 391;BA.debugLine="AddToSabad";
Debug.ShouldStop(64);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("BtnDownKol_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,412);
if (RapidSub.canDelegate("btndownkol_click")) { return __ref.runUserSub(false, "cls_search","btndownkol_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 412;BA.debugLine="Sub BtnDownKol_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 413;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(268435456);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 414;BA.debugLine="A = Item.TedadDarSabadKol";
Debug.ShouldStop(536870912);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 415;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 416;BA.debugLine="A = A - 1";
Debug.ShouldStop(-2147483648);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 417;BA.debugLine="Item.SumMande = Item.SumMande + Item.TedadDarSab";
Debug.ShouldStop(1);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))}, "+",1, 0)));
 BA.debugLineNum = 418;BA.debugLine="Item.TedadDarSabadKol = A";
Debug.ShouldStop(2);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 420;BA.debugLine="AddToSabad";
Debug.ShouldStop(8);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 421;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("BtnUpEshan_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,511);
if (RapidSub.canDelegate("btnupeshan_click")) { return __ref.runUserSub(false, "cls_search","btnupeshan_click", __ref);}
 BA.debugLineNum = 511;BA.debugLine="Sub BtnUpEshan_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 528;BA.debugLine="AddToSabad";
Debug.ShouldStop(32768);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 529;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("BtnUpJoz_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,348);
if (RapidSub.canDelegate("btnupjoz_click")) { return __ref.runUserSub(false, "cls_search","btnupjoz_click", __ref);}
 BA.debugLineNum = 348;BA.debugLine="Sub BtnUpJoz_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 372;BA.debugLine="AddToSabad";
Debug.ShouldStop(524288);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("BtnUpKol_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,394);
if (RapidSub.canDelegate("btnupkol_click")) { return __ref.runUserSub(false, "cls_search","btnupkol_click", __ref);}
 BA.debugLineNum = 394;BA.debugLine="Sub BtnUpKol_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 409;BA.debugLine="AddToSabad";
Debug.ShouldStop(16777216);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 410;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
cls_search._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_search._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_search._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_search._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private ImageRow As ImageView";
cls_search._imagerow = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imagerow",cls_search._imagerow);
 //BA.debugLineNum = 5;BA.debugLine="Private ImageOff As ImageView";
cls_search._imageoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageoff",cls_search._imageoff);
 //BA.debugLineNum = 6;BA.debugLine="Private LblGift As Label";
cls_search._lblgift = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblgift",cls_search._lblgift);
 //BA.debugLineNum = 7;BA.debugLine="Private lbl_title As Label";
cls_search._lbl_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_title",cls_search._lbl_title);
 //BA.debugLineNum = 8;BA.debugLine="Private ImageCall As ImageView";
cls_search._imagecall = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imagecall",cls_search._imagecall);
 //BA.debugLineNum = 9;BA.debugLine="Private LblFee As Label";
cls_search._lblfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfee",cls_search._lblfee);
 //BA.debugLineNum = 10;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
cls_search._lblfeebadaztakhfid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfeebadaztakhfid",cls_search._lblfeebadaztakhfid);
 //BA.debugLineNum = 11;BA.debugLine="Private LblC_Kala As Label";
cls_search._lblc_kala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblc_kala",cls_search._lblc_kala);
 //BA.debugLineNum = 12;BA.debugLine="Private LblTozihat As Label";
cls_search._lbltozihat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltozihat",cls_search._lbltozihat);
 //BA.debugLineNum = 13;BA.debugLine="Private LblMojoodiJoz As Label";
cls_search._lblmojoodijoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodijoz",cls_search._lblmojoodijoz);
 //BA.debugLineNum = 14;BA.debugLine="Private LblMojoodiKol As Label";
cls_search._lblmojoodikol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodikol",cls_search._lblmojoodikol);
 //BA.debugLineNum = 15;BA.debugLine="Private LblTedadKarton As Label";
cls_search._lbltedadkarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkarton",cls_search._lbltedadkarton);
 //BA.debugLineNum = 16;BA.debugLine="Private BtnUpJoz As Label";
cls_search._btnupjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupjoz",cls_search._btnupjoz);
 //BA.debugLineNum = 17;BA.debugLine="Private LblTedadJoz As Label";
cls_search._lbltedadjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadjoz",cls_search._lbltedadjoz);
 //BA.debugLineNum = 18;BA.debugLine="Private BtnDownJoz As Label";
cls_search._btndownjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownjoz",cls_search._btndownjoz);
 //BA.debugLineNum = 19;BA.debugLine="Private BtnDownKol As Label";
cls_search._btndownkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownkol",cls_search._btndownkol);
 //BA.debugLineNum = 20;BA.debugLine="Private LblTedadkol As Label";
cls_search._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkol",cls_search._lbltedadkol);
 //BA.debugLineNum = 21;BA.debugLine="Private BtnUpKol As Label";
cls_search._btnupkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupkol",cls_search._btnupkol);
 //BA.debugLineNum = 22;BA.debugLine="Private Item As AdapterListKala";
cls_search._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");__ref.setField("_item",cls_search._item);
 //BA.debugLineNum = 23;BA.debugLine="Private Key As IME";
cls_search._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_key",cls_search._key);
 //BA.debugLineNum = 24;BA.debugLine="Private base As Object";
cls_search._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_search._base);
 //BA.debugLineNum = 25;BA.debugLine="Private BtnDownEshan As Label";
cls_search._btndowneshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndowneshan",cls_search._btndowneshan);
 //BA.debugLineNum = 26;BA.debugLine="Private BtnUpEshan As Label";
cls_search._btnupeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupeshan",cls_search._btnupeshan);
 //BA.debugLineNum = 27;BA.debugLine="Private LblTedadEshan As Label";
cls_search._lbltedadeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadeshan",cls_search._lbltedadeshan);
 //BA.debugLineNum = 28;BA.debugLine="Private lblVahedJoz As Label";
cls_search._lblvahedjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedjoz",cls_search._lblvahedjoz);
 //BA.debugLineNum = 29;BA.debugLine="Private lblVahedKol As Label";
cls_search._lblvahedkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedkol",cls_search._lblvahedkol);
 //BA.debugLineNum = 31;BA.debugLine="Dim maxkolRond As Long";
cls_search._maxkolrond = RemoteObject.createImmutable(0L);__ref.setField("_maxkolrond",cls_search._maxkolrond);
 //BA.debugLineNum = 32;BA.debugLine="Dim Glide As Hitex_Glide";
cls_search._glide = RemoteObject.createNew ("com.glide.Hitex_Glide");__ref.setField("_glide",cls_search._glide);
 //BA.debugLineNum = 37;BA.debugLine="Private Panel4 As Panel";
cls_search._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel4",cls_search._panel4);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _download(RemoteObject __ref,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("Download (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,460);
if (RapidSub.canDelegate("download")) { __ref.runUserSub(false, "cls_search","download", __ref, _link); return;}
ResumableSub_Download rsub = new ResumableSub_Download(null,__ref,_link);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Download extends BA.ResumableSub {
public ResumableSub_Download(ir.parsikhesab.pakhsh.cls_search parent,RemoteObject __ref,RemoteObject _link) {
this.parent = parent;
this.__ref = __ref;
this._link = _link;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_search parent;
RemoteObject _link;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("ir.parsikhesab.pakhsh.httpjob");
RemoteObject _job = RemoteObject.declareNull("ir.parsikhesab.pakhsh.httpjob");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Download (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,460);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("link", _link);
 BA.debugLineNum = 461;BA.debugLine="If link.IndexOf(\"http\")>-1 Or link.IndexOf(\"HTTP\"";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",_link.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("http"))),BA.numberCast(double.class, -(double) (0 + 1))) || RemoteObject.solveBoolean(">",_link.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("HTTP"))),BA.numberCast(double.class, -(double) (0 + 1))) || RemoteObject.solveBoolean(">",_link.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("Http"))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 462;BA.debugLine="Dim filename As String";
Debug.ShouldStop(8192);
_filename = RemoteObject.createImmutable("");Debug.locals.put("filename", _filename);
 BA.debugLineNum = 463;BA.debugLine="filename = GetFilename(link)";
Debug.ShouldStop(16384);
_filename = __ref.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_getfilename" /*RemoteObject*/ ,(Object)(_link));Debug.locals.put("filename", _filename);
 BA.debugLineNum = 464;BA.debugLine="If File.Exists(Starter.SharedFolder,filename) Th";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//if
this.state = 15;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 15;
 BA.debugLineNum = 465;BA.debugLine="ImageRow.Bitmap=LoadBitmapSample(Starter.Shared";
Debug.ShouldStop(65536);
__ref.getField(false,"_imagerow" /*RemoteObject*/ ).runMethod(false,"setBitmap",(parent.__c.runMethod(false,"LoadBitmapSample",(Object)(parent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))).getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 467;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(262144);
_j = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 468;BA.debugLine="j.Initialize(link,Me)";
Debug.ShouldStop(524288);
_j.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_link),(Object)(__ref));
 BA.debugLineNum = 469;BA.debugLine="j.Download(link)";
Debug.ShouldStop(1048576);
_j.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 470;BA.debugLine="Wait For (j) JobDone(Job As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_search", "download"), (_j));
this.state = 19;
return;
case 19:
//C
this.state = 9;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 471;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 9:
//if
this.state = 14;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 472;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
Debug.ShouldStop(8388608);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getbitmap" /*RemoteObject*/ );Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 473;BA.debugLine="ImageRow.Bitmap=bmp";
Debug.ShouldStop(16777216);
__ref.getField(false,"_imagerow" /*RemoteObject*/ ).runMethod(false,"setBitmap",(_bmp.getObject()));
 BA.debugLineNum = 474;BA.debugLine="filename = GetFilename(Job.JobName)";
Debug.ShouldStop(33554432);
_filename = __ref.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_getfilename" /*RemoteObject*/ ,(Object)(_job.getField(true,"_jobname" /*RemoteObject*/ )));Debug.locals.put("filename", _filename);
 BA.debugLineNum = 475;BA.debugLine="WriteBitmap2File(bmp,90,filename)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_writebitmap2file" /*RemoteObject*/ ,(Object)(_bmp),(Object)(BA.numberCast(int.class, 90)),(Object)(_filename));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 477;BA.debugLine="ImageRow.Bitmap=LoadBitmap(File.DirAssets,\"ICO";
Debug.ShouldStop(268435456);
__ref.getField(false,"_imagerow" /*RemoteObject*/ ).runMethod(false,"setBitmap",(parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ICON.png"))).getObject()));
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 481;BA.debugLine="ImageRow.Bitmap=LoadBitmap(File.DirAssets,\"ICON.";
Debug.ShouldStop(1);
__ref.getField(false,"_imagerow" /*RemoteObject*/ ).runMethod(false,"setBitmap",(parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ICON.png"))).getObject()));
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
}
public static RemoteObject  _getbytefrombitmap(RemoteObject __ref,RemoteObject _img,RemoteObject _quality) throws Exception{
try {
		Debug.PushSubsStack("GetByteFromBitmap (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,501);
if (RapidSub.canDelegate("getbytefrombitmap")) { return __ref.runUserSub(false, "cls_search","getbytefrombitmap", __ref, _img, _quality);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _data = null;
Debug.locals.put("Img", _img);
Debug.locals.put("Quality", _quality);
 BA.debugLineNum = 501;BA.debugLine="Sub GetByteFromBitmap(Img As Bitmap, Quality As In";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 502;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(2097152);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 503;BA.debugLine="Dim data() As Byte";
Debug.ShouldStop(4194304);
_data = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 504;BA.debugLine="out.InitializeToBytesArray(1)";
Debug.ShouldStop(8388608);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 505;BA.debugLine="Img.WriteToStream(out,Quality,\"JPEG\")";
Debug.ShouldStop(16777216);
_img.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(_quality),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 506;BA.debugLine="data = out.ToBytesArray";
Debug.ShouldStop(33554432);
_data = _out.runMethod(false,"ToBytesArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 507;BA.debugLine="out.Close";
Debug.ShouldStop(67108864);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 508;BA.debugLine="Return data";
Debug.ShouldStop(134217728);
if (true) return _data;
 BA.debugLineNum = 509;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("GetFilename (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,485);
if (RapidSub.canDelegate("getfilename")) { return __ref.runUserSub(false, "cls_search","getfilename", __ref, _fullpath);}
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("fullpath", _fullpath);
 BA.debugLineNum = 485;BA.debugLine="Sub GetFilename(fullpath As String) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 486;BA.debugLine="Dim res As String";
Debug.ShouldStop(32);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 487;BA.debugLine="res = fullpath.SubString(fullpath.LastIndexOf(\"/\"";
Debug.ShouldStop(64);
_res = _fullpath.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_fullpath.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/"))),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("res", _res);
 BA.debugLineNum = 488;BA.debugLine="Return res";
Debug.ShouldStop(128);
if (true) return _res;
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
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_search","getheight", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("getPanel (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_search","getpanel", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 53;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ImageRow_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,446);
if (RapidSub.canDelegate("imagerow_click")) { return __ref.runUserSub(false, "cls_search","imagerow_click", __ref);}
 BA.debugLineNum = 446;BA.debugLine="Sub ImageRow_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 447;BA.debugLine="Act_ImageSlideShow.Item = Item";
Debug.ShouldStop(1073741824);
cls_search._act_imageslideshow._item /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ );
 BA.debugLineNum = 448;BA.debugLine="StartActivity(Act_ImageSlideShow)";
Debug.ShouldStop(-2147483648);
cls_search.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_search._act_imageslideshow.getObject())));
 BA.debugLineNum = 450;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Initialize (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_search","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 40;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="base = mdl";
Debug.ShouldStop(256);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 42;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(512);
__ref.getField(false,"_key" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 44;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(4096);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_search.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_search.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 46;BA.debugLine="p.LoadLayout(\"L_RecSearch\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_RecSearch")),__ref.getField(false, "ba"));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("LblGift_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,309);
if (RapidSub.canDelegate("lblgift_click")) { return __ref.runUserSub(false, "cls_search","lblgift_click", __ref);}
 BA.debugLineNum = 309;BA.debugLine="Sub LblGift_Click";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _lbltedadjoz_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblTedadJoz_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,452);
if (RapidSub.canDelegate("lbltedadjoz_click")) { return __ref.runUserSub(false, "cls_search","lbltedadjoz_click", __ref);}
 BA.debugLineNum = 452;BA.debugLine="Sub LblTedadJoz_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 453;BA.debugLine="CallSubDelayed2(base,\"LblTedadJoz_Click\",Item)";
Debug.ShouldStop(16);
cls_search.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("LblTedadJoz_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 454;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("LblTedadKol_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,456);
if (RapidSub.canDelegate("lbltedadkol_click")) { return __ref.runUserSub(false, "cls_search","lbltedadkol_click", __ref);}
 BA.debugLineNum = 456;BA.debugLine="Sub LblTedadKol_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 457;BA.debugLine="CallSubDelayed2(base,\"LblTedadKol_Click\",Item)";
Debug.ShouldStop(256);
cls_search.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("LblTedadKol_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("LblTozihat_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("lbltozihat_click")) { return __ref.runUserSub(false, "cls_search","lbltozihat_click", __ref);}
 BA.debugLineNum = 342;BA.debugLine="Sub LblTozihat_Click";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _pnl_bk_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_bk_Click (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,542);
if (RapidSub.canDelegate("pnl_bk_click")) { return __ref.runUserSub(false, "cls_search","pnl_bk_click", __ref);}
 BA.debugLineNum = 542;BA.debugLine="Sub pnl_bk_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 546;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Show (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_search","show", __ref, _item1, _position);}
RemoteObject _imagerow1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("Item1", _item1);
Debug.locals.put("position", _position);
 BA.debugLineNum = 60;BA.debugLine="Public Sub Show(Item1 As AdapterListKala,position";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Item=Item1";
Debug.ShouldStop(268435456);
__ref.setField ("_item" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 62;BA.debugLine="Private ImageRow1 As ImageView";
Debug.ShouldStop(536870912);
_imagerow1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("ImageRow1", _imagerow1);
 BA.debugLineNum = 63;BA.debugLine="ImageRow1.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_imagerow1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 64;BA.debugLine="ImageRow1.Tag=position";
Debug.ShouldStop(-2147483648);
_imagerow1.runMethod(false,"setTag",(_position));
 BA.debugLineNum = 67;BA.debugLine="lbl_title.Text = Item.NameKala";
Debug.ShouldStop(4);
__ref.getField(false,"_lbl_title" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameKala" /*RemoteObject*/ )));
 BA.debugLineNum = 68;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & Item.CodeKala";
Debug.ShouldStop(8);
__ref.getField(false,"_lblc_kala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد کالا: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 97;BA.debugLine="If IsNumber(Item.FldFeeBadAzTakhfif) = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",cls_search.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),cls_search.__c.getField(true,"True"))) { 
 BA.debugLineNum = 98;BA.debugLine="If Item.FldFeeBadAzTakhfif > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 99;BA.debugLine="MCode.Rs.Initialize(NumberFormat(Item.FeeForoos";
Debug.ShouldStop(4);
cls_search._mcode._rs /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(cls_search.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_search._mcode._vahedpool /*RemoteObject*/ ))));
 BA.debugLineNum = 100;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
Debug.ShouldStop(8);
cls_search._mcode._rs /*RemoteObject*/ .runVoidMethod ("Strikethrough",(Object)(BA.numberCast(int.class, 0)),(Object)(cls_search._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 101;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
Debug.ShouldStop(16);
cls_search._mcode._rs /*RemoteObject*/ .runVoidMethod ("Color",(Object)(cls_search.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_search._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 102;BA.debugLine="LblFee.Text = MCode.Rs";
Debug.ShouldStop(32);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_search._mcode._rs /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 103;BA.debugLine="LblFeeBadAzTakhfid.Text = NumberFormat(Item.Fld";
Debug.ShouldStop(64);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_search.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_search._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 104;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(128);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_search.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 106;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3)";
Debug.ShouldStop(512);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_search.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_search._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 107;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 108;BA.debugLine="ImageOff.Visible=False";
Debug.ShouldStop(2048);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_search.__c.getField(true,"False"));
 };
 }else {
 BA.debugLineNum = 111;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3)";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_search.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_search._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 112;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 118;BA.debugLine="LblTedadJoz.Text =\"تعداد جزء\"& Item.TedadDarSabad";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد جزء"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))));
 BA.debugLineNum = 119;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& Item.NameVahed";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblvahedjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 120;BA.debugLine="LblTedadkol.Text =\"تعداد کل\"& Item.TedadDarSabadK";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد کل"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))));
 BA.debugLineNum = 121;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& Item.NameVahed2";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblvahedkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 132;BA.debugLine="If Item.TedadDarKarton<>0 And IsNumber(Item.Tedad";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",cls_search.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))),cls_search.__c.getField(true,"True"))) { 
 BA.debugLineNum = 133;BA.debugLine="maxkolRond=(Item.SumMande/Item.TedadDarKarton)";
Debug.ShouldStop(16);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,BA.numberCast(long.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "/",0, 0))));
 BA.debugLineNum = 134;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& Item.Ted";
Debug.ShouldStop(32);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 BA.debugLineNum = 135;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(64);
cls_search.__c.runVoidMethod ("LogImpl","5108855371",BA.NumberToString(__ref.getField(true,"_maxkolrond" /*RemoteObject*/ )),0);
 }else {
 BA.debugLineNum = 137;BA.debugLine="maxkolRond=0";
Debug.ShouldStop(256);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 138;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن:\"&maxkolRond";
Debug.ShouldStop(512);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن:"),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ))));
 BA.debugLineNum = 139;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 };
 BA.debugLineNum = 141;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(4096);
cls_search.__c.runVoidMethod ("LogImpl","5108855377",BA.NumberToString(__ref.getField(true,"_maxkolrond" /*RemoteObject*/ )),0);
 BA.debugLineNum = 142;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& Item.SumMande";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی جزء: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 144;BA.debugLine="If  Item.SumMandeKarton <> Null Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 145;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی کل: "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 147;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 };
 BA.debugLineNum = 151;BA.debugLine="LblGift.Visible=MCode.CheckEshantion(Item.CodeKal";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblgift" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_search._mcode.runMethod(true,"_checkeshantion" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 152;BA.debugLine="If MCode.HideMojodi=1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",cls_search._mcode._hidemojodi /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 153;BA.debugLine="LblMojoodiJoz.Visible=False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_search.__c.getField(true,"False"));
 BA.debugLineNum = 154;BA.debugLine="LblMojoodiKol.Visible=False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_search.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 156;BA.debugLine="LblMojoodiJoz.Visible=True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_search.__c.getField(true,"True"));
 BA.debugLineNum = 157;BA.debugLine="LblMojoodiKol.Visible=True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_search.__c.getField(true,"True"));
 };
 BA.debugLineNum = 160;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 177;BA.debugLine="myCode.DownloadImage5(Item.CodeKala,Item.fldPath";
Debug.ShouldStop(65536);
cls_search._mycode.runVoidMethod ("_downloadimage5" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldPathPic" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_imagerow" /*RemoteObject*/ )));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e55) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e55.toString()); BA.debugLineNum = 179;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
cls_search.__c.runVoidMethod ("LogImpl","5108855415",BA.ObjectToString(cls_search.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Status (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,287);
if (RapidSub.canDelegate("status")) { return __ref.runUserSub(false, "cls_search","status", __ref, _enable);}
Debug.locals.put("Enable", _enable);
 BA.debugLineNum = 287;BA.debugLine="Sub Status(Enable As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 288;BA.debugLine="LogColor(\"status: \"&Enable,Colors.Red)";
Debug.ShouldStop(-2147483648);
cls_search.__c.runVoidMethod ("LogImpl","5108920833",RemoteObject.concat(RemoteObject.createImmutable("status: "),_enable),cls_search.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 289;BA.debugLine="BtnDownEshan.Enabled=Enable";
Debug.ShouldStop(1);
__ref.getField(false,"_btndowneshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 290;BA.debugLine="BtnUpEshan.Enabled=Enable";
Debug.ShouldStop(2);
__ref.getField(false,"_btnupeshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 291;BA.debugLine="LblTedadEshan.Enabled=Enable";
Debug.ShouldStop(4);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 293;BA.debugLine="BtnDownJoz.Enabled=Enable";
Debug.ShouldStop(16);
__ref.getField(false,"_btndownjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 294;BA.debugLine="BtnUpJoz.Enabled=Enable";
Debug.ShouldStop(32);
__ref.getField(false,"_btnupjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 295;BA.debugLine="LblTedadJoz.Enabled=Enable";
Debug.ShouldStop(64);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 297;BA.debugLine="BtnDownKol.Enabled=Enable";
Debug.ShouldStop(256);
__ref.getField(false,"_btndownkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 298;BA.debugLine="BtnUpKol.Enabled=Enable";
Debug.ShouldStop(512);
__ref.getField(false,"_btnupkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 299;BA.debugLine="LblTedadkol.Enabled=Enable";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("WriteBitmap2File (cls_search) ","cls_search",90,__ref.getField(false, "ba"),__ref,490);
if (RapidSub.canDelegate("writebitmap2file")) { return __ref.runUserSub(false, "cls_search","writebitmap2file", __ref, _image, _quality, _filename);}
Debug.locals.put("Image", _image);
Debug.locals.put("Quality", _quality);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 490;BA.debugLine="Sub WriteBitmap2File(Image As Bitmap, Quality As I";
Debug.ShouldStop(512);
 BA.debugLineNum = 499;BA.debugLine="End Sub";
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