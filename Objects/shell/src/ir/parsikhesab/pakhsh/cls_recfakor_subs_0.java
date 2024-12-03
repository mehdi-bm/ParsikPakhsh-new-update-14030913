package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_recfakor_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_recfakor._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_recfakor._p);
 //BA.debugLineNum = 3;BA.debugLine="Private faktor As AdapterListFaktor";
cls_recfakor._faktor = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");__ref.setField("_faktor",cls_recfakor._faktor);
 //BA.debugLineNum = 4;BA.debugLine="Private Item As AdapterListAshkhas";
cls_recfakor._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");__ref.setField("_item",cls_recfakor._item);
 //BA.debugLineNum = 6;BA.debugLine="Private pnl_bk As Panel";
cls_recfakor._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_recfakor._pnl_bk);
 //BA.debugLineNum = 7;BA.debugLine="Private TxtSharhFaktor As EditText";
cls_recfakor._txtsharhfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtsharhfaktor",cls_recfakor._txtsharhfaktor);
 //BA.debugLineNum = 8;BA.debugLine="Private LblTotalFaktor As Label";
cls_recfakor._lbltotalfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotalfaktor",cls_recfakor._lbltotalfaktor);
 //BA.debugLineNum = 9;BA.debugLine="Private LblNameMoshtari As Label";
cls_recfakor._lblnamemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamemoshtari",cls_recfakor._lblnamemoshtari);
 //BA.debugLineNum = 10;BA.debugLine="Private LblshFaktor As Label";
cls_recfakor._lblshfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshfaktor",cls_recfakor._lblshfaktor);
 //BA.debugLineNum = 11;BA.debugLine="Private lbl_city As Label";
cls_recfakor._lbl_city = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_city",cls_recfakor._lbl_city);
 //BA.debugLineNum = 12;BA.debugLine="Private ChK_send As CheckBox";
cls_recfakor._chk_send = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_chk_send",cls_recfakor._chk_send);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcode_tafzili(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCode_Tafzili (cls_recfakor) ","cls_recfakor",83,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("getcode_tafzili")) { return __ref.runUserSub(false, "cls_recfakor","getcode_tafzili", __ref);}
 BA.debugLineNum = 82;BA.debugLine="Public Sub getCode_Tafzili As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Return Item.CodeTafzili";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeTafzili" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfaktor_number(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFaktor_number (cls_recfakor) ","cls_recfakor",83,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("getfaktor_number")) { return __ref.runUserSub(false, "cls_recfakor","getfaktor_number", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Public Sub getFaktor_number As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Return faktor.FldShomareFaktor";
Debug.ShouldStop(16384);
if (true) return __ref.getField(false,"_faktor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ );
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
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_recfakor) ","cls_recfakor",83,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_recfakor","getheight", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Return pnl_bk.Height'+10dip";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getischecked(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIsChecked (cls_recfakor) ","cls_recfakor",83,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("getischecked")) { return __ref.runUserSub(false, "cls_recfakor","getischecked", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Public Sub getIsChecked As Boolean";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Return ChK_send.Checked";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_chk_send" /*RemoteObject*/ ).runMethod(true,"getChecked");
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPanel (cls_recfakor) ","cls_recfakor",83,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_recfakor","getpanel", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 58;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("getWidth (cls_recfakor) ","cls_recfakor",83,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_recfakor","getwidth", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Return pnl_bk.Width+5dip";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth"),cls_recfakor.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _shomarefaktor) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_recfakor) ","cls_recfakor",83,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_recfakor","initialize", __ref, _ba, _shomarefaktor);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ca = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("shomareFaktor", _shomarefaktor);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(shomareFaktor As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="faktor.FldShomareFaktor=shomareFaktor";
Debug.ShouldStop(32768);
__ref.getField(false,"_faktor" /*RemoteObject*/ ).setField ("fldShomareFaktor" /*RemoteObject*/ ,_shomarefaktor);
 BA.debugLineNum = 17;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 18;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(131072);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recfakor.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_recfakor.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 19;BA.debugLine="p.LoadLayout(\"l_recfaktor_2\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_recfaktor_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="LblshFaktor.Text=faktor.FldShomareFaktor";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblshfaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_faktor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ )));
 BA.debugLineNum = 22;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(2097152);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = cls_recfakor._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblFaktor Where FldShomareFaktor = '"),__ref.getField(false,"_faktor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu1", _cu1);Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 23;BA.debugLine="If Cu1.RowCount>0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 24;BA.debugLine="Cu1.Position=0";
Debug.ShouldStop(8388608);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 25;BA.debugLine="TxtSharhFaktor.Text = Cu1.GetString(\"FldTozih\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtsharhfaktor" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTozih")))));
 BA.debugLineNum = 28;BA.debugLine="Dim ca As String=Cu1.GetString(\"FldC_Tafzili\")";
Debug.ShouldStop(134217728);
_ca = _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Tafzili")));Debug.locals.put("ca", _ca);Debug.locals.put("ca", _ca);
 BA.debugLineNum = 29;BA.debugLine="LblTotalFaktor.Text = \"مبلغ فاکتور: \" & NumberFo";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbltotalfaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ فاکتور: "),cls_recfakor.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_recfakor._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="If Cu1.GetString(\"FldTozih\") = \"\" Then TxtSharhF";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTozih"))),BA.ObjectToString(""))) { 
__ref.getField(false,"_txtsharhfaktor" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 };
 BA.debugLineNum = 34;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(2);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_recfakor._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodetafzili = '"),_ca,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 35;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 36;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(8);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 37;BA.debugLine="Item.CodeTafzili=Cu.GetString(\"fldCodetafzili\")";
Debug.ShouldStop(16);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("CodeTafzili" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili"))));
 BA.debugLineNum = 38;BA.debugLine="Item.SharhTafzili=Cu.GetString(\"fldSharheTafzili";
Debug.ShouldStop(32);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SharhTafzili" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili"))));
 BA.debugLineNum = 39;BA.debugLine="Item.Address=Cu.GetString(\"fldAdress\")";
Debug.ShouldStop(64);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("Address" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldAdress"))));
 BA.debugLineNum = 40;BA.debugLine="Item.Tell=Cu.GetString(\"fldTell\")";
Debug.ShouldStop(128);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("Tell" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell"))));
 BA.debugLineNum = 41;BA.debugLine="Item.FldMobile=Cu.GetString(\"FldMobile\")";
Debug.ShouldStop(256);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldMobile" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMobile"))));
 BA.debugLineNum = 42;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"fldCodeGroup\")";
Debug.ShouldStop(512);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroup"))));
 BA.debugLineNum = 43;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"fldNameGroup\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameGroup"))));
 BA.debugLineNum = 44;BA.debugLine="Item.FldVaziat=Cu.GetString(\"FldVaziat\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldVaziat" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVaziat"))));
 BA.debugLineNum = 45;BA.debugLine="Item.FldEtebar=Cu.GetString(\"FldEtebar\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEtebar" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEtebar"))));
 BA.debugLineNum = 46;BA.debugLine="Item.FldLastVisit=myCode.Is_Null(Cu.GetString(\"F";
Debug.ShouldStop(8192);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldLastVisit" /*RemoteObject*/ ,cls_recfakor._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLastVisit"))))));
 BA.debugLineNum = 47;BA.debugLine="Item.FldLastSefaresh=myCode.Is_Null(Cu.GetString";
Debug.ShouldStop(16384);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldLastSefaresh" /*RemoteObject*/ ,cls_recfakor._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLastSefaresh"))))));
 BA.debugLineNum = 48;BA.debugLine="LblNameMoshtari.Text = Item.SharhTafzili";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblnamemoshtari" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SharhTafzili" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="lbl_city.Text=Item.FldN_Gorooh";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbl_city" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldN_Gorooh" /*RemoteObject*/ )));
 };
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
public static RemoteObject  _pnl_bk_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_bk_Click (cls_recfakor) ","cls_recfakor",83,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("pnl_bk_click")) { return __ref.runUserSub(false, "cls_recfakor","pnl_bk_click", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Private Sub pnl_bk_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="MCode.FaktorSelect=faktor.FldShomareFaktor";
Debug.ShouldStop(8);
cls_recfakor._mcode._faktorselect /*RemoteObject*/  = __ref.getField(false,"_faktor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="faktor.fldC_Ashkhas=Item.CodeTafzili";
Debug.ShouldStop(16);
__ref.getField(false,"_faktor" /*RemoteObject*/ ).setField ("fldC_Ashkhas" /*RemoteObject*/ ,__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeTafzili" /*RemoteObject*/ ));
 BA.debugLineNum = 70;BA.debugLine="Act_RizFaktor.Faktor = faktor";
Debug.ShouldStop(32);
cls_recfakor._act_rizfaktor._faktor /*RemoteObject*/  = __ref.getField(false,"_faktor" /*RemoteObject*/ );
 BA.debugLineNum = 71;BA.debugLine="StartActivity(Act_RizFaktor)";
Debug.ShouldStop(64);
cls_recfakor.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_recfakor._act_rizfaktor.getObject())));
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
}