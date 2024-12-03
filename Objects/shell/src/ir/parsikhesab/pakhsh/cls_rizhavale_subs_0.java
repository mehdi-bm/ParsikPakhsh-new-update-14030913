package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_rizhavale_subs_0 {


public static RemoteObject  _btnshowmap_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnShowMap_Click (cls_rizhavale) ","cls_rizhavale",89,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("btnshowmap_click")) { return __ref.runUserSub(false, "cls_rizhavale","btnshowmap_click", __ref);}
RemoteObject _destlat = RemoteObject.createImmutable(0);
RemoteObject _destlng = RemoteObject.createImmutable(0);
RemoteObject _label = RemoteObject.createImmutable("");
RemoteObject _uri = RemoteObject.createImmutable("");
RemoteObject _intent = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 83;BA.debugLine="Private Sub BtnShowMap_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Dim destLat As Double = Item.fldLat ' عرض جغرافیا";
Debug.ShouldStop(524288);
_destlat = BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldLat" /*RemoteObject*/ ));Debug.locals.put("destLat", _destlat);Debug.locals.put("destLat", _destlat);
 BA.debugLineNum = 85;BA.debugLine="Dim destLng As Double = Item.fldLon ' طول جغرافیا";
Debug.ShouldStop(1048576);
_destlng = BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldLon" /*RemoteObject*/ ));Debug.locals.put("destLng", _destlng);Debug.locals.put("destLng", _destlng);
 BA.debugLineNum = 86;BA.debugLine="Dim label As String = Item.fldSharhTafzili ' برچس";
Debug.ShouldStop(2097152);
_label = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldSharhTafzili" /*RemoteObject*/ );Debug.locals.put("label", _label);Debug.locals.put("label", _label);
 BA.debugLineNum = 88;BA.debugLine="Dim Uri As String";
Debug.ShouldStop(8388608);
_uri = RemoteObject.createImmutable("");Debug.locals.put("Uri", _uri);
 BA.debugLineNum = 89;BA.debugLine="Uri = \"google.navigation:q=\" & destLat & \",\" & de";
Debug.ShouldStop(16777216);
_uri = RemoteObject.concat(RemoteObject.createImmutable("google.navigation:q="),_destlat,RemoteObject.createImmutable(","),_destlng,RemoteObject.createImmutable("&label="),_label);Debug.locals.put("Uri", _uri);
 BA.debugLineNum = 91;BA.debugLine="Dim intent As Intent";
Debug.ShouldStop(67108864);
_intent = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("intent", _intent);
 BA.debugLineNum = 92;BA.debugLine="intent.Initialize(intent.ACTION_VIEW, Uri)";
Debug.ShouldStop(134217728);
_intent.runVoidMethod ("Initialize",(Object)(_intent.getField(true,"ACTION_VIEW")),(Object)(_uri));
 BA.debugLineNum = 93;BA.debugLine="intent.SetComponent(\"com.google.android.apps.maps";
Debug.ShouldStop(268435456);
_intent.runVoidMethod ("SetComponent",(Object)(RemoteObject.createImmutable("com.google.android.apps.maps")));
 BA.debugLineNum = 95;BA.debugLine="If intent.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (_intent.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 96;BA.debugLine="StartActivity(intent)";
Debug.ShouldStop(-2147483648);
cls_rizhavale.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_intent.getObject())));
 }else {
 BA.debugLineNum = 98;BA.debugLine="ToastMessageShow(\"لطفا GoogleMap را نصب نمایید.\"";
Debug.ShouldStop(2);
cls_rizhavale.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا GoogleMap را نصب نمایید.")),(Object)(cls_rizhavale.__c.getField(true,"True")));
 };
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_rizhavale._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_rizhavale._p);
 //BA.debugLineNum = 4;BA.debugLine="Dim Item As AdapteRizHavale";
cls_rizhavale._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterizhavale");__ref.setField("_item",cls_rizhavale._item);
 //BA.debugLineNum = 5;BA.debugLine="Private pnl_bk As Panel";
cls_rizhavale._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_rizhavale._pnl_bk);
 //BA.debugLineNum = 6;BA.debugLine="Private base As Object";
cls_rizhavale._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_rizhavale._base);
 //BA.debugLineNum = 7;BA.debugLine="Private LblDate As Label";
cls_rizhavale._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldate",cls_rizhavale._lbldate);
 //BA.debugLineNum = 9;BA.debugLine="Private LblShomareFaktor As Label";
cls_rizhavale._lblshomarefaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarefaktor",cls_rizhavale._lblshomarefaktor);
 //BA.debugLineNum = 10;BA.debugLine="Private LblTotalFaktor As Label";
cls_rizhavale._lbltotalfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotalfaktor",cls_rizhavale._lbltotalfaktor);
 //BA.debugLineNum = 11;BA.debugLine="Private LblC_Ashkhas As Label";
cls_rizhavale._lblc_ashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblc_ashkhas",cls_rizhavale._lblc_ashkhas);
 //BA.debugLineNum = 12;BA.debugLine="Private LblN_Ashkhas As Label";
cls_rizhavale._lbln_ashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbln_ashkhas",cls_rizhavale._lbln_ashkhas);
 //BA.debugLineNum = 13;BA.debugLine="Private Lbl_Tell As Label";
cls_rizhavale._lbl_tell = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_tell",cls_rizhavale._lbl_tell);
 //BA.debugLineNum = 14;BA.debugLine="Private lblAddress As Label";
cls_rizhavale._lbladdress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbladdress",cls_rizhavale._lbladdress);
 //BA.debugLineNum = 15;BA.debugLine="Private BtnShowMap As Label";
cls_rizhavale._btnshowmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnshowmap",cls_rizhavale._btnshowmap);
 //BA.debugLineNum = 16;BA.debugLine="Private lblUnCheck As Label";
cls_rizhavale._lbluncheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbluncheck",cls_rizhavale._lbluncheck);
 //BA.debugLineNum = 17;BA.debugLine="Private lblCheck As Label";
cls_rizhavale._lblcheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcheck",cls_rizhavale._lblcheck);
 //BA.debugLineNum = 18;BA.debugLine="Public shomareHavale As String";
cls_rizhavale._shomarehavale = RemoteObject.createImmutable("");__ref.setField("_shomarehavale",cls_rizhavale._shomarehavale);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_rizhavale) ","cls_rizhavale",89,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_rizhavale","getheight", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getPanel (cls_rizhavale) ","cls_rizhavale",89,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_rizhavale","getpanel", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 31;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Initialize (cls_rizhavale) ","cls_rizhavale",89,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_rizhavale","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="base = mdl";
Debug.ShouldStop(2097152);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 23;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_rizhavale.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_rizhavale.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 25;BA.debugLine="p.LoadLayout(\"l_RecRizFactorHavale\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_RecRizFactorHavale")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblshowhavale_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblShowHavale_Click (cls_rizhavale) ","cls_rizhavale",89,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("lblshowhavale_click")) { return __ref.runUserSub(false, "cls_rizhavale","lblshowhavale_click", __ref);}
 BA.debugLineNum = 72;BA.debugLine="Public Sub lblShowHavale_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Act_RizeFactorHavale.ShomareFaktor=Item.fldShomar";
Debug.ShouldStop(256);
cls_rizhavale._act_rizefactorhavale._shomarefaktor /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldShomareFactor" /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="Act_RizeFactorHavale.ShomareHavale=shomareHavale";
Debug.ShouldStop(512);
cls_rizhavale._act_rizefactorhavale._shomarehavale /*RemoteObject*/  = __ref.getField(true,"_shomarehavale" /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="Act_RizeFactorHavale.CodeMoshtari=LblC_Ashkhas.Te";
Debug.ShouldStop(1024);
cls_rizhavale._act_rizefactorhavale._codemoshtari /*RemoteObject*/  = __ref.getField(false,"_lblc_ashkhas" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 76;BA.debugLine="Act_RizeFactorHavale.NameMoshtari=LblN_Ashkhas.Te";
Debug.ShouldStop(2048);
cls_rizhavale._act_rizefactorhavale._namemoshtari /*RemoteObject*/  = __ref.getField(false,"_lbln_ashkhas" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 77;BA.debugLine="Act_RizeFactorHavale.date=LblDate.Text";
Debug.ShouldStop(4096);
cls_rizhavale._act_rizefactorhavale._date /*RemoteObject*/  = __ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 78;BA.debugLine="Act_RizeFactorHavale.fldLat=Item.fldLat";
Debug.ShouldStop(8192);
cls_rizhavale._act_rizefactorhavale._fldlat /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldLat" /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="Act_RizeFactorHavale.fldLon=Item.fldLon";
Debug.ShouldStop(16384);
cls_rizhavale._act_rizefactorhavale._fldlon /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldLon" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="StartActivity(Act_RizeFactorHavale)";
Debug.ShouldStop(65536);
cls_rizhavale.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_rizhavale._act_rizefactorhavale.getObject())));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Show (cls_rizhavale) ","cls_rizhavale",89,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_rizhavale","show", __ref, _item1, _position);}
Debug.locals.put("Item1", _item1);
Debug.locals.put("position", _position);
 BA.debugLineNum = 38;BA.debugLine="Public Sub Show(Item1 As AdapteRizHavale,position";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Item=Item1";
Debug.ShouldStop(64);
__ref.setField ("_item" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 40;BA.debugLine="BtnShowMap.Tag=position";
Debug.ShouldStop(128);
__ref.getField(false,"_btnshowmap" /*RemoteObject*/ ).runMethod(false,"setTag",(_position));
 BA.debugLineNum = 41;BA.debugLine="LblShomareFaktor.Text=Item1.fldShomareFactor";
Debug.ShouldStop(256);
__ref.getField(false,"_lblshomarefaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldShomareFactor" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="LblDate.Text=MCode.PersianDateDash(Item1.fldDate)";
Debug.ShouldStop(512);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_rizhavale._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldDate" /*RemoteObject*/ )))));
 BA.debugLineNum = 44;BA.debugLine="If Item1.fldMablaghKhales>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item1.getField(true,"fldMablaghKhales" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 45;BA.debugLine="LblTotalFaktor.Text=MCode.qomaAshar(Item1.fldMab";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbltotalfaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_rizhavale._mcode.runMethod(true,"_qomaashar" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((_item1.getField(true,"fldMablaghKhales" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),cls_rizhavale._mcode._vahedpool /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 47;BA.debugLine="LblTotalFaktor.Text=0";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbltotalfaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 50;BA.debugLine="LblC_Ashkhas.Text=Item1.fldCodeTafzili";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblc_ashkhas" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldCodeTafzili" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="LblN_Ashkhas.Text=Item1.fldSharhTafzili";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbln_ashkhas" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldSharhTafzili" /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="Lbl_Tell.Text=Item1.fldTell";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbl_tell" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldTell" /*RemoteObject*/ )));
 BA.debugLineNum = 53;BA.debugLine="lblAddress.Text=Item1.fldAddress";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbladdress" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldAddress" /*RemoteObject*/ )));
 BA.debugLineNum = 54;BA.debugLine="Log(Item1.fldCodeTafzili)";
Debug.ShouldStop(2097152);
cls_rizhavale.__c.runVoidMethod ("LogImpl","5108396560",_item1.getField(true,"fldCodeTafzili" /*RemoteObject*/ ),0);
 BA.debugLineNum = 55;BA.debugLine="Log(Item1.Distance)";
Debug.ShouldStop(4194304);
cls_rizhavale.__c.runVoidMethod ("LogImpl","5108396561",_item1.getField(true,"Distance" /*RemoteObject*/ ),0);
 BA.debugLineNum = 56;BA.debugLine="Log(Item1.fldLat)";
Debug.ShouldStop(8388608);
cls_rizhavale.__c.runVoidMethod ("LogImpl","5108396562",_item1.getField(true,"fldLat" /*RemoteObject*/ ),0);
 BA.debugLineNum = 57;BA.debugLine="Log(Item1.fldLon)";
Debug.ShouldStop(16777216);
cls_rizhavale.__c.runVoidMethod ("LogImpl","5108396563",_item1.getField(true,"fldLon" /*RemoteObject*/ ),0);
 BA.debugLineNum = 58;BA.debugLine="If myCode.Is_Null_adad(Item1.fldVaziat)=0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",cls_rizhavale._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldVaziat" /*RemoteObject*/ ))),BA.NumberToString(0))) { 
 BA.debugLineNum = 59;BA.debugLine="lblUnCheck.Visible=True";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbluncheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rizhavale.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="lblCheck.Visible=False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblcheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rizhavale.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 62;BA.debugLine="lblUnCheck.Visible=False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbluncheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rizhavale.__c.getField(true,"False"));
 BA.debugLineNum = 63;BA.debugLine="lblCheck.Visible=True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblcheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rizhavale.__c.getField(true,"True"));
 };
 BA.debugLineNum = 65;BA.debugLine="If Item.fldLat<>\"\" And Item.fldLon<>\"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldLat" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldLon" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 }else {
 BA.debugLineNum = 68;BA.debugLine="BtnShowMap.Visible=False";
Debug.ShouldStop(8);
__ref.getField(false,"_btnshowmap" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rizhavale.__c.getField(true,"False"));
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}