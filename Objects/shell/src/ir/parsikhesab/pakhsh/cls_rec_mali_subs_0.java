package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_rec_mali_subs_0 {


public static RemoteObject  _btndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (cls_rec_mali) ","cls_rec_mali",76,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("btndelete_click")) { return __ref.runUserSub(false, "cls_rec_mali","btndelete_click", __ref);}
 BA.debugLineNum = 87;BA.debugLine="Sub btnDelete_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnprint_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPrint_Click (cls_rec_mali) ","cls_rec_mali",76,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("btnprint_click")) { return __ref.runUserSub(false, "cls_rec_mali","btnprint_click", __ref);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 77;BA.debugLine="Sub btnPrint_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="MCode.ShomareSabt= item.FldShomareSabt";
Debug.ShouldStop(8192);
cls_rec_mali._mcode._shomaresabt /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldShomareSabt" /*RemoteObject*/ );
 BA.debugLineNum = 80;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select * from TblS";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_rec_mali._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblSabt where FldShomareSabt = '"),cls_rec_mali._mcode._shomaresabt /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 81;BA.debugLine="Act_PrintMali.Pardakhti = item.FldMablagh";
Debug.ShouldStop(65536);
cls_rec_mali._act_printmali._pardakhti /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldMablagh" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="Act_PrintMali.cu = cu";
Debug.ShouldStop(131072);
cls_rec_mali._act_printmali._cu /*RemoteObject*/  = _cu;
 BA.debugLineNum = 83;BA.debugLine="StartActivity(Act_PrintMali)";
Debug.ShouldStop(262144);
cls_rec_mali.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_rec_mali._act_printmali.getObject())));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_rec_mali._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_rec_mali._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_rec_mali._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_rec_mali._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private base As Object";
cls_rec_mali._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_rec_mali._base);
 //BA.debugLineNum = 5;BA.debugLine="Private Key As IME";
cls_rec_mali._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_key",cls_rec_mali._key);
 //BA.debugLineNum = 7;BA.debugLine="Private LblDateCheck As Label";
cls_rec_mali._lbldatecheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldatecheck",cls_rec_mali._lbldatecheck);
 //BA.debugLineNum = 8;BA.debugLine="Private LblDateSabt As Label";
cls_rec_mali._lbldatesabt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldatesabt",cls_rec_mali._lbldatesabt);
 //BA.debugLineNum = 9;BA.debugLine="Private LblMablagh As Label";
cls_rec_mali._lblmablagh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablagh",cls_rec_mali._lblmablagh);
 //BA.debugLineNum = 10;BA.debugLine="Private LblNameBank As Label";
cls_rec_mali._lblnamebank = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamebank",cls_rec_mali._lblnamebank);
 //BA.debugLineNum = 11;BA.debugLine="Private LblShomareCheck As Label";
cls_rec_mali._lblshomarecheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarecheck",cls_rec_mali._lblshomarecheck);
 //BA.debugLineNum = 12;BA.debugLine="Private LblShomareSabt As Label";
cls_rec_mali._lblshomaresabt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomaresabt",cls_rec_mali._lblshomaresabt);
 //BA.debugLineNum = 13;BA.debugLine="Private LblTypeSabt As Label";
cls_rec_mali._lbltypesabt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltypesabt",cls_rec_mali._lbltypesabt);
 //BA.debugLineNum = 14;BA.debugLine="Private LblNoeSabt As Label";
cls_rec_mali._lblnoesabt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnoesabt",cls_rec_mali._lblnoesabt);
 //BA.debugLineNum = 15;BA.debugLine="Dim item As AdapterListSabt";
cls_rec_mali._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistsabt");__ref.setField("_item",cls_rec_mali._item);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_rec_mali) ","cls_rec_mali",76,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_rec_mali","getheight", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("getPanel (cls_rec_mali) ","cls_rec_mali",76,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_rec_mali","getpanel", __ref);}
 BA.debugLineNum = 70;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(64);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 72;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Initialize (cls_rec_mali) ","cls_rec_mali",76,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_rec_mali","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 20;BA.debugLine="base = mdl";
Debug.ShouldStop(524288);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 21;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_key" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 22;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 23;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_rec_mali.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_rec_mali.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 24;BA.debugLine="p.LoadLayout(\"l_rec_mali\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_rec_mali")),__ref.getField(false, "ba"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 29;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(268435456);
cls_rec_mali._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_rec_mali.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 30;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
cls_rec_mali.__c.runVoidMethod ("LogImpl","598631692",BA.ObjectToString(cls_rec_mali.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Show (cls_rec_mali) ","cls_rec_mali",76,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_rec_mali","show", __ref, _item1, _position);}
Debug.locals.put("Item1", _item1);
Debug.locals.put("position", _position);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Show(Item1 As AdapterListSabt,position";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="item=Item1";
Debug.ShouldStop(4);
__ref.setField ("_item" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 36;BA.debugLine="If Item1.FldDateCheck <> 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",_item1.getField(true,"FldDateCheck" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 37;BA.debugLine="LblDateCheck.text = \"تاریخ چک: \" & MCode.Sf.Mid(";
Debug.ShouldStop(16);
__ref.getField(false,"_lbldatecheck" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تاریخ چک: "),cls_rec_mali._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"FldDateCheck" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),cls_rec_mali._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"FldDateCheck" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),cls_rec_mali._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"FldDateCheck" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))))));
 }else {
 BA.debugLineNum = 39;BA.debugLine="LblDateCheck.text = \"تاریخ چک: -\"";
Debug.ShouldStop(64);
__ref.getField(false,"_lbldatecheck" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("تاریخ چک: -"));
 };
 BA.debugLineNum = 41;BA.debugLine="LblDateSabt.Text=\"تاریخ ثبت: \" & MCode.Sf.Mid(Ite";
Debug.ShouldStop(256);
__ref.getField(false,"_lbldatesabt" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تاریخ ثبت: "),cls_rec_mali._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"FldDateSabt" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),cls_rec_mali._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"FldDateSabt" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),cls_rec_mali._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"FldDateSabt" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 42;BA.debugLine="LblMablagh.Text=\"مبلغ: \" & NumberFormat(Item1.Fld";
Debug.ShouldStop(512);
__ref.getField(false,"_lblmablagh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ: "),cls_rec_mali.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item1.getField(true,"FldMablagh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 43;BA.debugLine="LblShomareSabt.Text=\"شماره ثبت: \" & Item1.FldShoma";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblshomaresabt" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شماره ثبت: "),_item1.getField(true,"FldShomareSabt" /*RemoteObject*/ ))));
 BA.debugLineNum = 45;BA.debugLine="If Item1.FldBankName<>0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",_item1.getField(true,"FldBankName" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 46;BA.debugLine="LblNameBank.text = \"نام بانک: \" & Item1.FldBankN";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblnamebank" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نام بانک: "),_item1.getField(true,"FldBankName" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 48;BA.debugLine="LblNameBank.text = \"نام بانک: -\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblnamebank" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("نام بانک: -"));
 };
 BA.debugLineNum = 51;BA.debugLine="LblNoeSabt.text = \"نوع ثبت: \" & Item1.FldNoe";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblnoesabt" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نوع ثبت: "),_item1.getField(true,"FldNoe" /*RemoteObject*/ ))));
 BA.debugLineNum = 53;BA.debugLine="Select Case Item1.FldType";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_item1.getField(true,"FldType" /*RemoteObject*/ ),BA.NumberToString(1),BA.NumberToString(2))) {
case 0: {
 BA.debugLineNum = 55;BA.debugLine="LblTypeSabt.text = \"نوع تراکنش: دریافت\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbltypesabt" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("نوع تراکنش: دریافت"));
 break; }
case 1: {
 BA.debugLineNum = 57;BA.debugLine="LblTypeSabt.text = \"نوع تراکنش: پرداخت\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lbltypesabt" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("نوع تراکنش: پرداخت"));
 break; }
}
;
 BA.debugLineNum = 59;BA.debugLine="If Item1.FldShomareCheck <> 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",_item1.getField(true,"FldShomareCheck" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 60;BA.debugLine="LblShomareCheck.text = \"شماره چک: \" & Item1.FldS";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblshomarecheck" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شماره چک: "),_item1.getField(true,"FldShomareCheck" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 62;BA.debugLine="LblShomareCheck.text = \"شماره چک: -\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblshomarecheck" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("شماره چک: -"));
 };
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
}