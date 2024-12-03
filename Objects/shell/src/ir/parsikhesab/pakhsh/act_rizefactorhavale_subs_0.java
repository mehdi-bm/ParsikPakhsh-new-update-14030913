package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_rizefactorhavale_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,51);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Activity.LoadLayout(\"L_RizeFactorHavale\")";
Debug.ShouldStop(524288);
act_rizefactorhavale.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_RizeFactorHavale")),act_rizefactorhavale.mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(4194304);
act_rizefactorhavale.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 56;BA.debugLine="Listkala.Initialize";
Debug.ShouldStop(8388608);
act_rizefactorhavale.mostCurrent._listkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="Gps.Initialize(\"Gps\")";
Debug.ShouldStop(16777216);
act_rizefactorhavale._gps.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Gps")));
 BA.debugLineNum = 58;BA.debugLine="t1.Initialize(\"t1\",3000)";
Debug.ShouldStop(33554432);
act_rizefactorhavale._t1.runVoidMethod ("Initialize",act_rizefactorhavale.processBA,(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 3000)));
 BA.debugLineNum = 68;BA.debugLine="Table1.Initialize(Me, \"Table1\",9)";
Debug.ShouldStop(8);
act_rizefactorhavale.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_initialize" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(act_rizefactorhavale.getObject()),(Object)(BA.ObjectToString("Table1")),(Object)(BA.numberCast(int.class, 9)));
 BA.debugLineNum = 69;BA.debugLine="Table1.AddToActivity(PnlTable, 0,0,100%x,PnlTable";
Debug.ShouldStop(16);
act_rizefactorhavale.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addtoactivity" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), act_rizefactorhavale.mostCurrent._pnltable.getObject()),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_rizefactorhavale.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_rizefactorhavale.mostCurrent.activityBA)),(Object)(act_rizefactorhavale.mostCurrent._pnltable.runMethod(true,"getHeight")));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_KeyPress (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,223);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 223;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_rizefactorhavale.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 226;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
act_rizefactorhavale.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 228;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return act_rizefactorhavale.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Pause (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,235);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 235;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Resume (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,231);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","activity_resume");}
 BA.debugLineNum = 231;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="CreatePge";
Debug.ShouldStop(128);
_createpge();
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_back_click() throws Exception{
try {
		Debug.PushSubsStack("btn_Back_Click (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,256);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","btn_back_click");}
 BA.debugLineNum = 256;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
act_rizefactorhavale.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _btn_print_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_print_Click (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,240);
if (RapidSub.canDelegate("btn_print_click")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","btn_print_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 240;BA.debugLine="Sub Btn_print_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="Act_PrintPic2.DateFactor= lblDate.Text";
Debug.ShouldStop(65536);
act_rizefactorhavale.mostCurrent._act_printpic2._datefactor /*RemoteObject*/  = act_rizefactorhavale.mostCurrent._lbldate.runMethod(true,"getText");
 BA.debugLineNum = 242;BA.debugLine="Act_PrintPic2.listKala = Listkala";
Debug.ShouldStop(131072);
act_rizefactorhavale.mostCurrent._act_printpic2._listkala /*RemoteObject*/  = act_rizefactorhavale.mostCurrent._listkala;
 BA.debugLineNum = 243;BA.debugLine="Dim Lst As List = Array As String(\"چاپ 1\",\"چاپ 2\"";
Debug.ShouldStop(262144);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_rizefactorhavale.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("چاپ 1"),RemoteObject.createImmutable("چاپ 2")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 244;BA.debugLine="Dim res As Int = InputList(Lst,\"نوع چاپ را انتخاب";
Debug.ShouldStop(524288);
_res = act_rizefactorhavale.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("نوع چاپ را انتخاب نمایید:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_rizefactorhavale.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 245;BA.debugLine="Select Case res";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 247;BA.debugLine="Act_PrintPic2.TypePrint=res";
Debug.ShouldStop(4194304);
act_rizefactorhavale.mostCurrent._act_printpic2._typeprint /*RemoteObject*/  = _res;
 BA.debugLineNum = 248;BA.debugLine="StartActivity(Act_PrintPic2)";
Debug.ShouldStop(8388608);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizefactorhavale.processBA,(Object)((act_rizefactorhavale.mostCurrent._act_printpic2.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 250;BA.debugLine="Act_PrintPic2.TypePrint=res";
Debug.ShouldStop(33554432);
act_rizefactorhavale.mostCurrent._act_printpic2._typeprint /*RemoteObject*/  = _res;
 BA.debugLineNum = 251;BA.debugLine="StartActivity(Act_PrintPic2)";
Debug.ShouldStop(67108864);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizefactorhavale.processBA,(Object)((act_rizefactorhavale.mostCurrent._act_printpic2.getObject())));
 break; }
}
;
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_tasvie_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Tasvie_Click (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,264);
if (RapidSub.canDelegate("btn_tasvie_click")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","btn_tasvie_click");}
 BA.debugLineNum = 264;BA.debugLine="Private Sub Btn_Tasvie_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="Act_Mali.ShomareFactor=lblShomareFactor.Text";
Debug.ShouldStop(256);
act_rizefactorhavale.mostCurrent._act_mali._shomarefactor /*RemoteObject*/  = act_rizefactorhavale.mostCurrent._lblshomarefactor.runMethod(true,"getText");
 BA.debugLineNum = 266;BA.debugLine="Act_Mali.MabalghGhablepardakht=mablaghFinal";
Debug.ShouldStop(512);
act_rizefactorhavale.mostCurrent._act_mali._mabalghghablepardakht /*RemoteObject*/  = act_rizefactorhavale.mostCurrent._mablaghfinal;
 BA.debugLineNum = 267;BA.debugLine="Act_Mali.CodeMoshtari=CodeMoshtari";
Debug.ShouldStop(1024);
act_rizefactorhavale.mostCurrent._act_mali._codemoshtari /*RemoteObject*/  = act_rizefactorhavale._codemoshtari;
 BA.debugLineNum = 268;BA.debugLine="Act_Mali.NameMoshtari=LblNameMoshtari.Text";
Debug.ShouldStop(2048);
act_rizefactorhavale.mostCurrent._act_mali._namemoshtari /*RemoteObject*/  = act_rizefactorhavale.mostCurrent._lblnamemoshtari.runMethod(true,"getText");
 BA.debugLineNum = 269;BA.debugLine="Act_Mali.ShomareHavale=ShomareHavale";
Debug.ShouldStop(4096);
act_rizefactorhavale.mostCurrent._act_mali._shomarehavale /*RemoteObject*/  = act_rizefactorhavale._shomarehavale;
 BA.debugLineNum = 270;BA.debugLine="StartActivity(Act_Mali)";
Debug.ShouldStop(8192);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizefactorhavale.processBA,(Object)((act_rizefactorhavale.mostCurrent._act_mali.getObject())));
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
public static RemoteObject  _btncheck_click() throws Exception{
try {
		Debug.PushSubsStack("BtnCheck_Click (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,313);
if (RapidSub.canDelegate("btncheck_click")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","btncheck_click");}
 BA.debugLineNum = 313;BA.debugLine="Private Sub BtnCheck_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="MCode.C_Tafzili=LblCodeMoshtari.Text";
Debug.ShouldStop(33554432);
act_rizefactorhavale.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = act_rizefactorhavale.mostCurrent._lblcodemoshtari.runMethod(true,"getText");
 BA.debugLineNum = 315;BA.debugLine="StartActivity(Act_Emza)";
Debug.ShouldStop(67108864);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizefactorhavale.processBA,(Object)((act_rizefactorhavale.mostCurrent._act_emza.getObject())));
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshowmap_click() throws Exception{
try {
		Debug.PushSubsStack("BtnShowMap_Click (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,275);
if (RapidSub.canDelegate("btnshowmap_click")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","btnshowmap_click");}
RemoteObject _destlat = RemoteObject.createImmutable(0);
RemoteObject _destlng = RemoteObject.createImmutable(0);
RemoteObject _label = RemoteObject.createImmutable("");
RemoteObject _uri = RemoteObject.createImmutable("");
RemoteObject _intent = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 275;BA.debugLine="Private Sub BtnShowMap_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="If fldLat =\"\" And fldLon=\"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_rizefactorhavale._fldlat,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",act_rizefactorhavale._fldlon,BA.ObjectToString(""))) { 
 BA.debugLineNum = 277;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نشده ا";
Debug.ShouldStop(1048576);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نشده است")),(Object)(act_rizefactorhavale.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 278;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 281;BA.debugLine="Dim destLat As Double = fldLat ' عرض جغرافیایی مق";
Debug.ShouldStop(16777216);
_destlat = BA.numberCast(double.class, act_rizefactorhavale._fldlat);Debug.locals.put("destLat", _destlat);Debug.locals.put("destLat", _destlat);
 BA.debugLineNum = 282;BA.debugLine="Dim destLng As Double = fldLon ' طول جغرافیایی مق";
Debug.ShouldStop(33554432);
_destlng = BA.numberCast(double.class, act_rizefactorhavale._fldlon);Debug.locals.put("destLng", _destlng);Debug.locals.put("destLng", _destlng);
 BA.debugLineNum = 284;BA.debugLine="Dim label As String = \"Destination\" ' برچسب مقصد";
Debug.ShouldStop(134217728);
_label = BA.ObjectToString("Destination");Debug.locals.put("label", _label);Debug.locals.put("label", _label);
 BA.debugLineNum = 286;BA.debugLine="Dim uri As String";
Debug.ShouldStop(536870912);
_uri = RemoteObject.createImmutable("");Debug.locals.put("uri", _uri);
 BA.debugLineNum = 287;BA.debugLine="uri = \"google.navigation:q=\" & destLat & \",\" & de";
Debug.ShouldStop(1073741824);
_uri = RemoteObject.concat(RemoteObject.createImmutable("google.navigation:q="),_destlat,RemoteObject.createImmutable(","),_destlng,RemoteObject.createImmutable("&label="),_label);Debug.locals.put("uri", _uri);
 BA.debugLineNum = 289;BA.debugLine="Dim intent As Intent";
Debug.ShouldStop(1);
_intent = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("intent", _intent);
 BA.debugLineNum = 290;BA.debugLine="intent.Initialize(intent.ACTION_VIEW, uri)";
Debug.ShouldStop(2);
_intent.runVoidMethod ("Initialize",(Object)(_intent.getField(true,"ACTION_VIEW")),(Object)(_uri));
 BA.debugLineNum = 291;BA.debugLine="intent.SetComponent(\"com.google.android.apps.maps";
Debug.ShouldStop(4);
_intent.runVoidMethod ("SetComponent",(Object)(RemoteObject.createImmutable("com.google.android.apps.maps")));
 BA.debugLineNum = 293;BA.debugLine="If intent.IsInitialized Then";
Debug.ShouldStop(16);
if (_intent.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 294;BA.debugLine="StartActivity(intent)";
Debug.ShouldStop(32);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizefactorhavale.processBA,(Object)((_intent.getObject())));
 }else {
 BA.debugLineNum = 296;BA.debugLine="ToastMessageShow(\"Google Maps app not found\", Tr";
Debug.ShouldStop(128);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Google Maps app not found")),(Object)(act_rizefactorhavale.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnupdate_click() throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,460);
if (RapidSub.canDelegate("btnupdate_click")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","btnupdate_click");}
 BA.debugLineNum = 460;BA.debugLine="Private Sub btnUpdate_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 461;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
act_rizefactorhavale.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 462;BA.debugLine="StartActivity(Act_HavaleTozie)";
Debug.ShouldStop(8192);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("StartActivity",act_rizefactorhavale.processBA,(Object)((act_rizefactorhavale.mostCurrent._act_havaletozie.getObject())));
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
public static RemoteObject  _createpge() throws Exception{
try {
		Debug.PushSubsStack("CreatePge (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,97);
if (RapidSub.canDelegate("createpge")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","createpge");}
 BA.debugLineNum = 97;BA.debugLine="Sub CreatePge";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="ProgressDialogShow(\"در حال بارگذاری اطلاعات . . .";
Debug.ShouldStop(2);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال بارگذاری اطلاعات . . ."))));
 BA.debugLineNum = 99;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 100;BA.debugLine="MCode.page=\"Act_RizeFactorHavale\"";
Debug.ShouldStop(8);
act_rizefactorhavale.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_RizeFactorHavale");
 BA.debugLineNum = 101;BA.debugLine="lblShomareFactor.Text=ShomareFaktor";
Debug.ShouldStop(16);
act_rizefactorhavale.mostCurrent._lblshomarefactor.runMethod(true,"setText",BA.ObjectToCharSequence(act_rizefactorhavale._shomarefaktor));
 BA.debugLineNum = 102;BA.debugLine="lblShomareHavale.Text=ShomareHavale";
Debug.ShouldStop(32);
act_rizefactorhavale.mostCurrent._lblshomarehavale.runMethod(true,"setText",BA.ObjectToCharSequence(act_rizefactorhavale._shomarehavale));
 BA.debugLineNum = 103;BA.debugLine="MCode.ShomareFaktor=ShomareFaktor";
Debug.ShouldStop(64);
act_rizefactorhavale.mostCurrent._mcode._shomarefaktor /*RemoteObject*/  = act_rizefactorhavale._shomarefaktor;
 BA.debugLineNum = 104;BA.debugLine="LblCodeMoshtari.Text=CodeMoshtari";
Debug.ShouldStop(128);
act_rizefactorhavale.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_rizefactorhavale._codemoshtari));
 BA.debugLineNum = 105;BA.debugLine="LblNameMoshtari.Text=NameMoshtari";
Debug.ShouldStop(256);
act_rizefactorhavale.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_rizefactorhavale._namemoshtari));
 BA.debugLineNum = 106;BA.debugLine="lblDate.Text=date";
Debug.ShouldStop(512);
act_rizefactorhavale.mostCurrent._lbldate.runMethod(true,"setText",BA.ObjectToCharSequence(act_rizefactorhavale._date));
 BA.debugLineNum = 107;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(1024);
act_rizefactorhavale._t1.runMethod(true,"setEnabled",act_rizefactorhavale.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 108;BA.debugLine="LoadData";
Debug.ShouldStop(2048);
_loaddata();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizefactorhavale.processBA, e13.toString()); BA.debugLineNum = 111;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("LogImpl","567174414",BA.ObjectToString(act_rizefactorhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizefactorhavale.mostCurrent.activityBA)),0);
 BA.debugLineNum = 112;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32768);
act_rizefactorhavale.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_rizefactorhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizefactorhavale.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_rizefactorhavale.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-CreatePge"))));
 };
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim Table1 As Table";
act_rizefactorhavale.mostCurrent._table1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table");
 //BA.debugLineNum = 22;BA.debugLine="Dim Key As IME";
act_rizefactorhavale.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 23;BA.debugLine="Dim Listkala As List";
act_rizefactorhavale.mostCurrent._listkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 24;BA.debugLine="Private LblNameMoshtari As Label";
act_rizefactorhavale.mostCurrent._lblnamemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private TxtSharhFaktor As Label";
act_rizefactorhavale.mostCurrent._txtsharhfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Btn_print As Button";
act_rizefactorhavale.mostCurrent._btn_print = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PnlTable As Panel";
act_rizefactorhavale.mostCurrent._pnltable = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private rp As RuntimePermissions";
act_rizefactorhavale.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 29;BA.debugLine="Private LblGHabelePardakht As Label";
act_rizefactorhavale.mostCurrent._lblghabelepardakht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private LblMandeGhabl As Label";
act_rizefactorhavale.mostCurrent._lblmandeghabl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private LblTakhfifKala As Label";
act_rizefactorhavale.mostCurrent._lbltakhfifkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private LblTotalFaktor2 As Label";
act_rizefactorhavale.mostCurrent._lbltotalfaktor2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private LblMablaghKhales As Label";
act_rizefactorhavale.mostCurrent._lblmablaghkhales = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lblShomareFactor As Label";
act_rizefactorhavale.mostCurrent._lblshomarefactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private Btn_Tasvie As Button";
act_rizefactorhavale.mostCurrent._btn_tasvie = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private BtnShowMap As Button";
act_rizefactorhavale.mostCurrent._btnshowmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private BtnCheck As Button";
act_rizefactorhavale.mostCurrent._btncheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private LblCodeMoshtari As Label";
act_rizefactorhavale.mostCurrent._lblcodemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lblShomareHavale As Label";
act_rizefactorhavale.mostCurrent._lblshomarehavale = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lblDate As Label";
act_rizefactorhavale.mostCurrent._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private lblMablagheKolDaryafti As Label";
act_rizefactorhavale.mostCurrent._lblmablaghekoldaryafti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private LblVaziat As Label";
act_rizefactorhavale.mostCurrent._lblvaziat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim Vaziat As String=0";
act_rizefactorhavale.mostCurrent._vaziat = BA.NumberToString(0);
 //BA.debugLineNum = 44;BA.debugLine="Private MapFragment1 As MapFragment";
act_rizefactorhavale.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private gmap As GoogleMap";
act_rizefactorhavale.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Dim mablaghFinal As String";
act_rizefactorhavale.mostCurrent._mablaghfinal = RemoteObject.createImmutable("");
 //BA.debugLineNum = 47;BA.debugLine="Private LblMabalghTahkfifDaryafti As Label";
act_rizefactorhavale.mostCurrent._lblmabalghtahkfifdaryafti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Dim loc As LatLng";
act_rizefactorhavale.mostCurrent._loc = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _grid() throws Exception{
try {
		Debug.PushSubsStack("Grid (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,81);
if (RapidSub.canDelegate("grid")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","grid");}
RemoteObject _lst_colnametitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 81;BA.debugLine="Sub Grid";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim Lst_ColNameTitle As List";
Debug.ShouldStop(131072);
_lst_colnametitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
 BA.debugLineNum = 83;BA.debugLine="Lst_ColNameTitle.Initialize";
Debug.ShouldStop(262144);
_lst_colnametitle.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"ردیف\",\"ن";
Debug.ShouldStop(1048576);
_lst_colnametitle.runVoidMethod ("AddAll",(Object)(act_rizefactorhavale.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {13},new Object[] {BA.ObjectToString("ردیف"),BA.ObjectToString("نام کالا"),BA.ObjectToString("کد کالا"),BA.ObjectToString("فروش فی"),BA.ObjectToString("فی کارتن"),BA.ObjectToString("مبلغ تخفیف"),BA.ObjectToString("درصد تخفیف"),BA.ObjectToString("تعداد جزء"),BA.ObjectToString("تعداد کل"),BA.ObjectToString("کد انبار"),BA.ObjectToString("کد واسطه"),BA.ObjectToString("کد راننده"),RemoteObject.createImmutable("نام راننده")})))));
 BA.debugLineNum = 88;BA.debugLine="Table1.LoadSListRizFactorHavale(Listkala,Lst_ColN";
Debug.ShouldStop(8388608);
act_rizefactorhavale.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_loadslistrizfactorhavale" /*RemoteObject*/ ,(Object)(act_rizefactorhavale.mostCurrent._listkala),(Object)(_lst_colnametitle),(Object)(BA.numberCast(int.class, 13)));
 BA.debugLineNum = 91;BA.debugLine="Table1.SetColumnsWidths(Array As Int(50dip,100dip";
Debug.ShouldStop(67108864);
act_rizefactorhavale.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("int",new int[] {13},new Object[] {act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),act_rizefactorhavale.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))})));
 BA.debugLineNum = 94;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcheck() throws Exception{
try {
		Debug.PushSubsStack("LoadCheck (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,318);
if (RapidSub.canDelegate("loadcheck")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","loadcheck");}
RemoteObject _imagesignature = RemoteObject.createImmutable("");
RemoteObject _dates = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _queryandroid = RemoteObject.createImmutable("");
RemoteObject _queryserver = RemoteObject.createImmutable("");
 BA.debugLineNum = 318;BA.debugLine="Sub LoadCheck";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="If File.Exists(File.DirDefaultExternal & \"/Parsi";
Debug.ShouldStop(1073741824);
if (act_rizefactorhavale.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Signature"))),(Object)(RemoteObject.concat(act_rizefactorhavale.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(".png")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 320;BA.debugLine="Log(\"Check\")";
Debug.ShouldStop(-2147483648);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("LogImpl","567829762",RemoteObject.createImmutable("Check"),0);
 BA.debugLineNum = 321;BA.debugLine="Dim ImageSignature As String";
Debug.ShouldStop(1);
_imagesignature = RemoteObject.createImmutable("");Debug.locals.put("ImageSignature", _imagesignature);
 BA.debugLineNum = 322;BA.debugLine="Dim DateS As String =MCode.DatePersian";
Debug.ShouldStop(2);
_dates = act_rizefactorhavale.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA);Debug.locals.put("DateS", _dates);Debug.locals.put("DateS", _dates);
 BA.debugLineNum = 323;BA.debugLine="Dim Time As String =DateTime.Time(DateTime.Now)";
Debug.ShouldStop(4);
_time = act_rizefactorhavale.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_rizefactorhavale.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 324;BA.debugLine="ImageSignature =MCode.Encrypted(MCode.ConvertBlo";
Debug.ShouldStop(8);
_imagesignature = act_rizefactorhavale.mostCurrent._mcode.runMethod(true,"_encrypted" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(act_rizefactorhavale.mostCurrent._mcode.runMethod(true,"_convertblobtostring" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Signature"))),(Object)(RemoteObject.concat(act_rizefactorhavale.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(".png"))))));Debug.locals.put("ImageSignature", _imagesignature);
 BA.debugLineNum = 327;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 328;BA.debugLine="Dim QueryAndroid As String=\"Update TblRizFactor";
Debug.ShouldStop(128);
_queryandroid = RemoteObject.concat(RemoteObject.createImmutable("Update TblRizFactorHavale "),RemoteObject.createImmutable("set fldVaziat='1',fldDateTahvil='"),_dates,RemoteObject.createImmutable("',fldTimeTahvil='"),_time,RemoteObject.createImmutable("',fldLat='"),act_rizefactorhavale.mostCurrent._mcode._lat /*RemoteObject*/ ,RemoteObject.createImmutable("',fldLon='"),act_rizefactorhavale.mostCurrent._mcode._lon /*RemoteObject*/ ,RemoteObject.createImmutable("',fldSignature='"),_imagesignature,RemoteObject.createImmutable("'"),RemoteObject.createImmutable("where fldShomareFactor='"),act_rizefactorhavale.mostCurrent._lblshomarefactor.runMethod(true,"getText"),RemoteObject.createImmutable("' and fldShomareHavale='"),act_rizefactorhavale.mostCurrent._lblshomarehavale.runMethod(true,"getText"),RemoteObject.createImmutable("'"));Debug.locals.put("QueryAndroid", _queryandroid);Debug.locals.put("QueryAndroid", _queryandroid);
 BA.debugLineNum = 332;BA.debugLine="MCode.SaveUpdate(QueryAndroid)";
Debug.ShouldStop(2048);
act_rizefactorhavale.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(_queryandroid));
 BA.debugLineNum = 334;BA.debugLine="Dim queryServer As String=\"Update zomorodo_maji";
Debug.ShouldStop(8192);
_queryserver = RemoteObject.concat(RemoteObject.createImmutable("Update zomorodo_majidmarashi.tblHavaleGroohi Set fldVaziat=1,fldDateTahvil="),_dates,RemoteObject.createImmutable(",fldTimeTahvil='"),_time,RemoteObject.createImmutable("',fldLat='"),act_rizefactorhavale.mostCurrent._mcode._lat /*RemoteObject*/ ,RemoteObject.createImmutable("',fldLon='"),act_rizefactorhavale.mostCurrent._mcode._lon /*RemoteObject*/ ,RemoteObject.createImmutable("',fldSignature='"),_imagesignature,RemoteObject.createImmutable("' where fldShomareFactor="),act_rizefactorhavale.mostCurrent._lblshomarefactor.runMethod(true,"getText"));Debug.locals.put("queryServer", _queryserver);Debug.locals.put("queryServer", _queryserver);
 BA.debugLineNum = 335;BA.debugLine="SendVaziat(queryServer)";
Debug.ShouldStop(16384);
_sendvaziat(_queryserver);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizefactorhavale.processBA, e13.toString()); BA.debugLineNum = 337;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("LogImpl","567829779",BA.ObjectToString(act_rizefactorhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizefactorhavale.mostCurrent.activityBA)),0);
 };
 };
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("LoadData (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,116);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","loaddata");}
RemoteObject _cr = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _mablaghkhales = RemoteObject.createImmutable(0L);
RemoteObject _mablaghtakhfif = RemoteObject.createImmutable(0L);
RemoteObject _mablaghtakhfifdaryafti = RemoteObject.createImmutable(0L);
RemoteObject _mandetalab = RemoteObject.createImmutable(0L);
RemoteObject _mandetasfienashode = RemoteObject.createImmutable(0L);
RemoteObject _mablaghekoldaryafti = RemoteObject.createImmutable(0L);
RemoteObject _totalfaktor2 = RemoteObject.createImmutable(0L);
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale");
RemoteObject _dr = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 116;BA.debugLine="Sub LoadData";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 118;BA.debugLine="Dim cr As Cursor=MCode.Result(\"select * from TblR";
Debug.ShouldStop(2097152);
_cr = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cr = act_rizefactorhavale.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblRizFactorHavale where fldShomareFactor='"),act_rizefactorhavale.mostCurrent._lblshomarefactor.runMethod(true,"getText"),RemoteObject.createImmutable("' and fldShomareHavale='"),act_rizefactorhavale.mostCurrent._lblshomarehavale.runMethod(true,"getText"),RemoteObject.createImmutable("'"))));Debug.locals.put("cr", _cr);Debug.locals.put("cr", _cr);
 BA.debugLineNum = 119;BA.debugLine="Listkala.Clear";
Debug.ShouldStop(4194304);
act_rizefactorhavale.mostCurrent._listkala.runVoidMethod ("Clear");
 BA.debugLineNum = 120;BA.debugLine="If cr.RowCount>0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_cr.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 121;BA.debugLine="Dim MablaghKhales As Long=0";
Debug.ShouldStop(16777216);
_mablaghkhales = BA.numberCast(long.class, 0);Debug.locals.put("MablaghKhales", _mablaghkhales);Debug.locals.put("MablaghKhales", _mablaghkhales);
 BA.debugLineNum = 122;BA.debugLine="Dim MablaghTakhfif As Long=0";
Debug.ShouldStop(33554432);
_mablaghtakhfif = BA.numberCast(long.class, 0);Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);
 BA.debugLineNum = 123;BA.debugLine="Dim MablaghTakhfifDaryafti As Long=0";
Debug.ShouldStop(67108864);
_mablaghtakhfifdaryafti = BA.numberCast(long.class, 0);Debug.locals.put("MablaghTakhfifDaryafti", _mablaghtakhfifdaryafti);Debug.locals.put("MablaghTakhfifDaryafti", _mablaghtakhfifdaryafti);
 BA.debugLineNum = 124;BA.debugLine="Dim MandeTalab As Long=0";
Debug.ShouldStop(134217728);
_mandetalab = BA.numberCast(long.class, 0);Debug.locals.put("MandeTalab", _mandetalab);Debug.locals.put("MandeTalab", _mandetalab);
 BA.debugLineNum = 125;BA.debugLine="Dim MandeTasfieNashode As Long=0";
Debug.ShouldStop(268435456);
_mandetasfienashode = BA.numberCast(long.class, 0);Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);
 BA.debugLineNum = 126;BA.debugLine="Dim MablagheKolDaryafti As Long=0";
Debug.ShouldStop(536870912);
_mablaghekoldaryafti = BA.numberCast(long.class, 0);Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);
 BA.debugLineNum = 127;BA.debugLine="Dim TotalFaktor2 As Long=0";
Debug.ShouldStop(1073741824);
_totalfaktor2 = BA.numberCast(long.class, 0);Debug.locals.put("TotalFaktor2", _totalfaktor2);Debug.locals.put("TotalFaktor2", _totalfaktor2);
 BA.debugLineNum = 128;BA.debugLine="For i=0 To cr.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_cr.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 129;BA.debugLine="cr.Position=i";
Debug.ShouldStop(1);
_cr.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 130;BA.debugLine="Dim Item As AdapteRizFactorHavale";
Debug.ShouldStop(2);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale");Debug.locals.put("Item", _item);
 BA.debugLineNum = 131;BA.debugLine="Item.fldShomareFactor=cr.GetString(\"fldShomareF";
Debug.ShouldStop(4);
_item.setField ("fldShomareFactor" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareFactor"))));
 BA.debugLineNum = 132;BA.debugLine="Item.fldShomareHavale=cr.GetString(\"fldShomareH";
Debug.ShouldStop(8);
_item.setField ("fldShomareHavale" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareHavale"))));
 BA.debugLineNum = 133;BA.debugLine="lblShomareHavale.Text=Item.fldShomareHavale";
Debug.ShouldStop(16);
act_rizefactorhavale.mostCurrent._lblshomarehavale.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"fldShomareHavale" /*RemoteObject*/ )));
 BA.debugLineNum = 134;BA.debugLine="Item.fldShomareSanad=cr.GetString(\"fldShomareSa";
Debug.ShouldStop(32);
_item.setField ("fldShomareSanad" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareSanad"))));
 BA.debugLineNum = 135;BA.debugLine="Item.fldC_Ranandeh=cr.GetString(\"fldC_Ranandeh\"";
Debug.ShouldStop(64);
_item.setField ("fldC_Ranandeh" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldC_Ranandeh"))));
 BA.debugLineNum = 136;BA.debugLine="Item.fldN_Ranandeh=cr.GetString(\"fldN_Ranandeh\"";
Debug.ShouldStop(128);
_item.setField ("fldN_Ranandeh" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldN_Ranandeh"))));
 BA.debugLineNum = 137;BA.debugLine="Item.fldCodeVasete=cr.GetString(\"fldCodeVasete\"";
Debug.ShouldStop(256);
_item.setField ("fldCodeVasete" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeVasete"))));
 BA.debugLineNum = 138;BA.debugLine="Item.fldCodeAnbar=cr.GetString(\"fldCodeAnbar\")";
Debug.ShouldStop(512);
_item.setField ("fldCodeAnbar" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeAnbar"))));
 BA.debugLineNum = 139;BA.debugLine="Item.fldRadif=cr.GetString(\"fldRadif\")";
Debug.ShouldStop(1024);
_item.setField ("fldRadif" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldRadif"))));
 BA.debugLineNum = 140;BA.debugLine="Item.fldCodeKala=cr.GetString(\"fldCodeKala\")";
Debug.ShouldStop(2048);
_item.setField ("fldCodeKala" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeKala"))));
 BA.debugLineNum = 141;BA.debugLine="Item.fldSharhKala=cr.GetString(\"fldSharhKala\")";
Debug.ShouldStop(4096);
_item.setField ("fldSharhKala" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharhKala"))));
 BA.debugLineNum = 142;BA.debugLine="Item.fldDarsadTakhfif=myCode.Is_Null_adad(Item.";
Debug.ShouldStop(8192);
_item.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))));
 BA.debugLineNum = 143;BA.debugLine="Item.fldMablaghTakhfif=myCode.Is_Null_adad(cr.G";
Debug.ShouldStop(16384);
_item.setField ("fldMablaghTakhfif" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablaghTakhfif"))))));
 BA.debugLineNum = 144;BA.debugLine="Item.fldMandeTalab=myCode.Is_Null_adad(cr.GetSt";
Debug.ShouldStop(32768);
_item.setField ("fldMandeTalab" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMandeTalab"))))));
 BA.debugLineNum = 145;BA.debugLine="Item.fldMandeTasfieNashode=myCode.Is_Null_adad(";
Debug.ShouldStop(65536);
_item.setField ("fldMandeTasfieNashode" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMandeTasfieNashode"))))));
 BA.debugLineNum = 146;BA.debugLine="Item.fldMablaghKhales=myCode.Is_Null_adad(cr.Ge";
Debug.ShouldStop(131072);
_item.setField ("fldMablaghKhales" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablaghKhales"))))));
 BA.debugLineNum = 147;BA.debugLine="Item.fldMablagheKolDaryafti=myCode.Is_Null_adad";
Debug.ShouldStop(262144);
_item.setField ("fldMablagheKolDaryafti" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablagheKolDaryafti"))))));
 BA.debugLineNum = 148;BA.debugLine="Item.fldTedadCarton=cr.GetString(\"fldTedadCarto";
Debug.ShouldStop(524288);
_item.setField ("fldTedadCarton" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadCarton"))));
 BA.debugLineNum = 149;BA.debugLine="Item.fldTedadJoz=cr.GetString(\"fldTedadJoz\")";
Debug.ShouldStop(1048576);
_item.setField ("fldTedadJoz" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadJoz"))));
 BA.debugLineNum = 150;BA.debugLine="Item.fldFeeJoz=cr.GetString(\"fldFeeJoz\")";
Debug.ShouldStop(2097152);
_item.setField ("fldFeeJoz" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeJoz"))));
 BA.debugLineNum = 151;BA.debugLine="Item.fldFeeKol=cr.GetString(\"fldFeeKol\")";
Debug.ShouldStop(4194304);
_item.setField ("fldFeeKol" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeKol"))));
 BA.debugLineNum = 152;BA.debugLine="Item.fldDateSarResid=cr.GetString(\"fldDateSarRe";
Debug.ShouldStop(8388608);
_item.setField ("fldDateSarResid" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateSarResid"))));
 BA.debugLineNum = 153;BA.debugLine="Item.fldDateFactor=cr.GetString(\"fldDateFactor\"";
Debug.ShouldStop(16777216);
_item.setField ("fldDateFactor" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateFactor"))));
 BA.debugLineNum = 154;BA.debugLine="Item.fldDate=cr.GetString(\"fldDate\")";
Debug.ShouldStop(33554432);
_item.setField ("fldDate" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDate"))));
 BA.debugLineNum = 155;BA.debugLine="Item.fldTime=cr.GetString(\"fldTime\")";
Debug.ShouldStop(67108864);
_item.setField ("fldTime" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTime"))));
 BA.debugLineNum = 156;BA.debugLine="Item.fldCodeTafzili=cr.GetString(\"fldCodeTafzil";
Debug.ShouldStop(134217728);
_item.setField ("fldCodeTafzili" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili"))));
 BA.debugLineNum = 157;BA.debugLine="Item.fldSharhTafzili=cr.GetString(\"fldSharhTafz";
Debug.ShouldStop(268435456);
_item.setField ("fldSharhTafzili" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharhTafzili"))));
 BA.debugLineNum = 158;BA.debugLine="Item.fldLat=cr.GetString(\"fldLat\")";
Debug.ShouldStop(536870912);
_item.setField ("fldLat" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldLat"))));
 BA.debugLineNum = 159;BA.debugLine="Item.fldLon=cr.GetString(\"fldLon\")";
Debug.ShouldStop(1073741824);
_item.setField ("fldLon" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldLon"))));
 BA.debugLineNum = 160;BA.debugLine="Item.fldFeeYekCarton=cr.GetString(\"fldFeeYekCar";
Debug.ShouldStop(-2147483648);
_item.setField ("fldFeeYekCarton" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeYekCarton"))));
 BA.debugLineNum = 161;BA.debugLine="Item.fldArzeshAfzode=cr.GetString(\"fldArzeshAfz";
Debug.ShouldStop(1);
_item.setField ("fldArzeshAfzode" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldArzeshAfzode"))));
 BA.debugLineNum = 162;BA.debugLine="Item.fldTell=cr.GetString(\"fldTell\")";
Debug.ShouldStop(2);
_item.setField ("fldTell" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell"))));
 BA.debugLineNum = 163;BA.debugLine="Item.fldAddress=cr.GetString(\"fldAddress\")";
Debug.ShouldStop(4);
_item.setField ("fldAddress" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldAddress"))));
 BA.debugLineNum = 164;BA.debugLine="Item.fldVaziat=cr.GetString(\"fldVaziat\")";
Debug.ShouldStop(8);
_item.setField ("fldVaziat" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldVaziat"))));
 BA.debugLineNum = 165;BA.debugLine="Item.fldDateTahvil=cr.GetString(\"fldDateTahvil\"";
Debug.ShouldStop(16);
_item.setField ("fldDateTahvil" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateTahvil"))));
 BA.debugLineNum = 166;BA.debugLine="Item.fldTimeTahvil=cr.GetString(\"fldTimeTahvil\"";
Debug.ShouldStop(32);
_item.setField ("fldTimeTahvil" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTimeTahvil"))));
 BA.debugLineNum = 167;BA.debugLine="Item.fldSignature=cr.GetString(\"fldSignature\")";
Debug.ShouldStop(64);
_item.setField ("fldSignature" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSignature"))));
 BA.debugLineNum = 168;BA.debugLine="Item.fldSharhFactor=cr.GetString(\"fldSharhFacto";
Debug.ShouldStop(128);
_item.setField ("fldSharhFactor" /*RemoteObject*/ ,_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharhFactor"))));
 BA.debugLineNum = 169;BA.debugLine="Listkala.Add(Item)";
Debug.ShouldStop(256);
act_rizefactorhavale.mostCurrent._listkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 171;BA.debugLine="MablaghKhales=MablaghKhales+Item.fldMablaghKhal";
Debug.ShouldStop(1024);
_mablaghkhales = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_mablaghkhales,BA.numberCast(double.class, _item.getField(true,"fldMablaghKhales" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("MablaghKhales", _mablaghkhales);
 BA.debugLineNum = 172;BA.debugLine="MablaghTakhfif=MablaghTakhfif+Item.fldMablaghTa";
Debug.ShouldStop(2048);
_mablaghtakhfif = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_mablaghtakhfif,BA.numberCast(double.class, _item.getField(true,"fldMablaghTakhfif" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);
 BA.debugLineNum = 173;BA.debugLine="MandeTalab=Item.fldMandeTalab";
Debug.ShouldStop(4096);
_mandetalab = BA.numberCast(long.class, _item.getField(true,"fldMandeTalab" /*RemoteObject*/ ));Debug.locals.put("MandeTalab", _mandetalab);
 BA.debugLineNum = 174;BA.debugLine="MandeTasfieNashode=Item.fldMandeTasfieNashode";
Debug.ShouldStop(8192);
_mandetasfienashode = BA.numberCast(long.class, _item.getField(true,"fldMandeTasfieNashode" /*RemoteObject*/ ));Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);
 BA.debugLineNum = 175;BA.debugLine="MablagheKolDaryafti=Item.fldMablagheKolDaryafti";
Debug.ShouldStop(16384);
_mablaghekoldaryafti = BA.numberCast(long.class, _item.getField(true,"fldMablagheKolDaryafti" /*RemoteObject*/ ));Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);
 BA.debugLineNum = 177;BA.debugLine="Vaziat=Item.fldVaziat";
Debug.ShouldStop(65536);
act_rizefactorhavale.mostCurrent._vaziat = _item.getField(true,"fldVaziat" /*RemoteObject*/ );
 BA.debugLineNum = 178;BA.debugLine="MCode.C_Tafzili=Item.fldCodeTafzili";
Debug.ShouldStop(131072);
act_rizefactorhavale.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = _item.getField(true,"fldCodeTafzili" /*RemoteObject*/ );
 BA.debugLineNum = 179;BA.debugLine="MCode.N_Tafzili=Item.fldSharhTafzili";
Debug.ShouldStop(262144);
act_rizefactorhavale.mostCurrent._mcode._n_tafzili /*RemoteObject*/  = _item.getField(true,"fldSharhTafzili" /*RemoteObject*/ );
 BA.debugLineNum = 180;BA.debugLine="MCode.N_Tafzili=Item.fldSharhTafzili";
Debug.ShouldStop(524288);
act_rizefactorhavale.mostCurrent._mcode._n_tafzili /*RemoteObject*/  = _item.getField(true,"fldSharhTafzili" /*RemoteObject*/ );
 BA.debugLineNum = 181;BA.debugLine="MCode.Tell_Tafzili=Item.fldTell";
Debug.ShouldStop(1048576);
act_rizefactorhavale.mostCurrent._mcode._tell_tafzili /*RemoteObject*/  = _item.getField(true,"fldTell" /*RemoteObject*/ );
 BA.debugLineNum = 182;BA.debugLine="MCode.Address_Tafzili=Item.fldAddress";
Debug.ShouldStop(2097152);
act_rizefactorhavale.mostCurrent._mcode._address_tafzili /*RemoteObject*/  = _item.getField(true,"fldAddress" /*RemoteObject*/ );
 BA.debugLineNum = 183;BA.debugLine="TxtSharhFaktor.Text=Item.fldSharhFactor";
Debug.ShouldStop(4194304);
act_rizefactorhavale.mostCurrent._txtsharhfaktor.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"fldSharhFactor" /*RemoteObject*/ )));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 186;BA.debugLine="TotalFaktor2=MablaghKhales+MablaghTakhfif";
Debug.ShouldStop(33554432);
_totalfaktor2 = RemoteObject.solve(new RemoteObject[] {_mablaghkhales,_mablaghtakhfif}, "+",1, 2);Debug.locals.put("TotalFaktor2", _totalfaktor2);
 BA.debugLineNum = 188;BA.debugLine="LblMablaghKhales.text = NumberFormat(myCode.Is_N";
Debug.ShouldStop(134217728);
act_rizefactorhavale.mostCurrent._lblmablaghkhales.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghkhales))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_rizefactorhavale.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 189;BA.debugLine="mablaghFinal=MablaghKhales";
Debug.ShouldStop(268435456);
act_rizefactorhavale.mostCurrent._mablaghfinal = BA.NumberToString(_mablaghkhales);
 BA.debugLineNum = 190;BA.debugLine="Dim dr As Cursor=MCode.Result(\"select * from Tbl";
Debug.ShouldStop(536870912);
_dr = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dr = act_rizefactorhavale.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblDaryaft where fldShomareFactor="),act_rizefactorhavale._shomarefaktor)));Debug.locals.put("dr", _dr);Debug.locals.put("dr", _dr);
 BA.debugLineNum = 191;BA.debugLine="If dr.RowCount>0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_dr.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 192;BA.debugLine="MablagheKolDaryafti=MCode.SingleResult(\"select";
Debug.ShouldStop(-2147483648);
_mablaghekoldaryafti = BA.numberCast(long.class, act_rizefactorhavale.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select sum(fldMablaghDaryafti) as fldMablaghDaryafti from TblDaryaft where fldType<>3 and fldShomareFactor="),act_rizefactorhavale._shomarefaktor))));Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);
 BA.debugLineNum = 193;BA.debugLine="MablaghTakhfifDaryafti=myCode.Is_Null_adad(MCod";
Debug.ShouldStop(1);
_mablaghtakhfifdaryafti = BA.numberCast(long.class, act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_rizefactorhavale.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select sum(FldMablaghTakhfif) as fldMablaghTakhfifDaryafti from TblDaryaft where fldType=3 and fldShomareFactor="),act_rizefactorhavale._shomarefaktor)))))));Debug.locals.put("MablaghTakhfifDaryafti", _mablaghtakhfifdaryafti);
 BA.debugLineNum = 194;BA.debugLine="MandeTalab=MablaghKhales-MablagheKolDaryafti-my";
Debug.ShouldStop(2);
_mandetalab = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_mablaghkhales,_mablaghekoldaryafti,BA.numberCast(double.class, act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghtakhfifdaryafti))))}, "--",2, 0));Debug.locals.put("MandeTalab", _mandetalab);
 BA.debugLineNum = 195;BA.debugLine="MandeTasfieNashode=MablaghKhales-MablagheKolDar";
Debug.ShouldStop(4);
_mandetasfienashode = RemoteObject.solve(new RemoteObject[] {_mablaghkhales,_mablaghekoldaryafti}, "-",1, 2);Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);
 BA.debugLineNum = 196;BA.debugLine="LblMabalghTahkfifDaryafti.Text=NumberFormat(myC";
Debug.ShouldStop(8);
act_rizefactorhavale.mostCurrent._lblmabalghtahkfifdaryafti.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghtakhfifdaryafti))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_rizefactorhavale.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 197;BA.debugLine="LblGHabelePardakht.text = NumberFormat(myCode.I";
Debug.ShouldStop(16);
act_rizefactorhavale.mostCurrent._lblghabelepardakht.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.NumberToString(_mandetalab))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_rizefactorhavale.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 199;BA.debugLine="LblGHabelePardakht.text = NumberFormat(myCode.I";
Debug.ShouldStop(64);
act_rizefactorhavale.mostCurrent._lblghabelepardakht.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghkhales))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_rizefactorhavale.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 };
 BA.debugLineNum = 201;BA.debugLine="LblTakhfifKala.text = NumberFormat(myCode.Is_Nul";
Debug.ShouldStop(256);
act_rizefactorhavale.mostCurrent._lbltakhfifkala.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghtakhfif))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_rizefactorhavale.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 202;BA.debugLine="LblMandeGhabl.text = NumberFormat(myCode.Is_Null";
Debug.ShouldStop(512);
act_rizefactorhavale.mostCurrent._lblmandeghabl.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.NumberToString(_mandetalab))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_rizefactorhavale.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 204;BA.debugLine="lblMablagheKolDaryafti.text = NumberFormat(myCod";
Debug.ShouldStop(2048);
act_rizefactorhavale.mostCurrent._lblmablaghekoldaryafti.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghekoldaryafti))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_rizefactorhavale.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 205;BA.debugLine="LblTotalFaktor2.text = NumberFormat(myCode.Is_Nu";
Debug.ShouldStop(4096);
act_rizefactorhavale.mostCurrent._lbltotalfaktor2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.NumberToString(_totalfaktor2))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_rizefactorhavale.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 207;BA.debugLine="If myCode.Is_Null_adad(Vaziat)=0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_rizefactorhavale.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(act_rizefactorhavale.mostCurrent._vaziat)),BA.NumberToString(0))) { 
 BA.debugLineNum = 208;BA.debugLine="LblVaziat.TextColor=Colors.Red";
Debug.ShouldStop(32768);
act_rizefactorhavale.mostCurrent._lblvaziat.runMethod(true,"setTextColor",act_rizefactorhavale.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 209;BA.debugLine="LblVaziat.Text=\"تحویل داده نشده\"";
Debug.ShouldStop(65536);
act_rizefactorhavale.mostCurrent._lblvaziat.runMethod(true,"setText",BA.ObjectToCharSequence("تحویل داده نشده"));
 }else {
 BA.debugLineNum = 211;BA.debugLine="LblVaziat.TextColor=Colors.Green";
Debug.ShouldStop(262144);
act_rizefactorhavale.mostCurrent._lblvaziat.runMethod(true,"setTextColor",act_rizefactorhavale.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 212;BA.debugLine="LblVaziat.Text=\"تحویل داده شده\"";
Debug.ShouldStop(524288);
act_rizefactorhavale.mostCurrent._lblvaziat.runMethod(true,"setText",BA.ObjectToCharSequence("تحویل داده شده"));
 BA.debugLineNum = 213;BA.debugLine="BtnCheck.Enabled=False";
Debug.ShouldStop(1048576);
act_rizefactorhavale.mostCurrent._btncheck.runMethod(true,"setEnabled",act_rizefactorhavale.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 215;BA.debugLine="Grid";
Debug.ShouldStop(4194304);
_grid();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e96) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizefactorhavale.processBA, e96.toString()); BA.debugLineNum = 218;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("LogImpl","567240038",BA.ObjectToString(act_rizefactorhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizefactorhavale.mostCurrent.activityBA)),0);
 BA.debugLineNum = 219;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(67108864);
act_rizefactorhavale.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_rizefactorhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizefactorhavale.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_rizefactorhavale.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadData"))));
 };
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mapfragment1_ready() throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,365);
if (RapidSub.canDelegate("mapfragment1_ready")) { ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","mapfragment1_ready"); return;}
ResumableSub_MapFragment1_Ready rsub = new ResumableSub_MapFragment1_Ready(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MapFragment1_Ready extends BA.ResumableSub {
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_rizefactorhavale parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_rizefactorhavale parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,365);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 368;BA.debugLine="Try";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 369;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(65536);
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 BA.debugLineNum = 370;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOC";
Debug.ShouldStop(131072);
parent.mostCurrent._rp.runVoidMethod ("CheckAndRequest",act_rizefactorhavale.processBA,(Object)(parent.mostCurrent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 371;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_rizefactorhavale.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizefactorhavale", "mapfragment1_ready"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 372;BA.debugLine="If Result Then";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 9;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 373;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(1048576);
parent.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 377;BA.debugLine="Sleep(200)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_rizefactorhavale.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_rizefactorhavale", "mapfragment1_ready"),BA.numberCast(int.class, 200));
this.state = 14;
return;
case 14:
//C
this.state = 9;
;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 386;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","567960853",RemoteObject.createImmutable("No permission!"),0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 389;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","567960856",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_rizefactorhavale.mostCurrent.activityBA)),0);
 BA.debugLineNum = 390;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
Debug.ShouldStop(32);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_rizefactorhavale.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-MapFragment1_Ready"))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_rizefactorhavale.processBA, e0.toString());}
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim ShomareFaktor As String";
act_rizefactorhavale._shomarefaktor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Dim ShomareHavale As String";
act_rizefactorhavale._shomarehavale = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim CodeMoshtari As String";
act_rizefactorhavale._codemoshtari = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim NameMoshtari As String";
act_rizefactorhavale._namemoshtari = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim date As String";
act_rizefactorhavale._date = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim fldLat,fldLon As String";
act_rizefactorhavale._fldlat = RemoteObject.createImmutable("");
act_rizefactorhavale._fldlon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim Gps As GPS";
act_rizefactorhavale._gps = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 14;BA.debugLine="Dim t1 As Timer";
act_rizefactorhavale._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sendvaziat(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("SendVaziat (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,344);
if (RapidSub.canDelegate("sendvaziat")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","sendvaziat", _query);}
Debug.locals.put("Query", _query);
 BA.debugLineNum = 344;BA.debugLine="Private Sub SendVaziat(Query As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="CallSubDelayed2(Service_Server,\"SendUpdateQuery\",";
Debug.ShouldStop(16777216);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_rizefactorhavale.processBA,(Object)((act_rizefactorhavale.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("SendUpdateQuery")),(Object)((_query)));
 BA.debugLineNum = 346;BA.debugLine="File.Delete(File.DirDefaultExternal & \"/Parsik/Si";
Debug.ShouldStop(33554432);
act_rizefactorhavale.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(RemoteObject.concat(act_rizefactorhavale.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Signature"))),(Object)(RemoteObject.concat(act_rizefactorhavale.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(".png"))));
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t1_tick() throws Exception{
try {
		Debug.PushSubsStack("t1_tick (act_rizefactorhavale) ","act_rizefactorhavale",37,act_rizefactorhavale.mostCurrent.activityBA,act_rizefactorhavale.mostCurrent,420);
if (RapidSub.canDelegate("t1_tick")) { return ir.parsikhesab.pakhsh.act_rizefactorhavale.remoteMe.runUserSub(false, "act_rizefactorhavale","t1_tick");}
 BA.debugLineNum = 420;BA.debugLine="Sub t1_tick";
Debug.ShouldStop(8);
 BA.debugLineNum = 421;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(16);
act_rizefactorhavale._t1.runMethod(true,"setEnabled",act_rizefactorhavale.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 422;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(32);
if (act_rizefactorhavale.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 423;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 429;BA.debugLine="Log(\"GetLocation ok\")";
Debug.ShouldStop(4096);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("LogImpl","568026377",RemoteObject.createImmutable("GetLocation ok"),0);
 BA.debugLineNum = 442;BA.debugLine="loc.Initialize(gmap.MyLocation.Latitude,gmap.My";
Debug.ShouldStop(33554432);
act_rizefactorhavale.mostCurrent._loc.runVoidMethod ("Initialize",(Object)(act_rizefactorhavale.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLatitude")),(Object)(act_rizefactorhavale.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLongitude")));
 BA.debugLineNum = 443;BA.debugLine="If loc.IsInitialized Then";
Debug.ShouldStop(67108864);
if (act_rizefactorhavale.mostCurrent._loc.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 444;BA.debugLine="MCode.Lat = loc.Latitude";
Debug.ShouldStop(134217728);
act_rizefactorhavale.mostCurrent._mcode._lat /*RemoteObject*/  = BA.NumberToString(act_rizefactorhavale.mostCurrent._loc.runMethod(true,"getLatitude"));
 BA.debugLineNum = 445;BA.debugLine="MCode.Lon = loc.Longitude";
Debug.ShouldStop(268435456);
act_rizefactorhavale.mostCurrent._mcode._lon /*RemoteObject*/  = BA.NumberToString(act_rizefactorhavale.mostCurrent._loc.runMethod(true,"getLongitude"));
 BA.debugLineNum = 446;BA.debugLine="Log(MCode.Lat)";
Debug.ShouldStop(536870912);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("LogImpl","568026394",act_rizefactorhavale.mostCurrent._mcode._lat /*RemoteObject*/ ,0);
 BA.debugLineNum = 447;BA.debugLine="Log(MCode.Lon)";
Debug.ShouldStop(1073741824);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("LogImpl","568026395",act_rizefactorhavale.mostCurrent._mcode._lon /*RemoteObject*/ ,0);
 BA.debugLineNum = 448;BA.debugLine="Gps.Stop";
Debug.ShouldStop(-2147483648);
act_rizefactorhavale._gps.runVoidMethod ("Stop");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_rizefactorhavale.processBA, e14.toString()); BA.debugLineNum = 452;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
act_rizefactorhavale.mostCurrent.__c.runVoidMethod ("LogImpl","568026400",BA.ObjectToString(act_rizefactorhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizefactorhavale.mostCurrent.activityBA)),0);
 BA.debugLineNum = 453;BA.debugLine="myCode.SendError(LastException, Activity.Title&";
Debug.ShouldStop(16);
act_rizefactorhavale.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_rizefactorhavale.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_rizefactorhavale.mostCurrent.__c.runMethod(false,"LastException",act_rizefactorhavale.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_rizefactorhavale.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-t1_tick"))));
 };
 }else {
 BA.debugLineNum = 456;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(128);
act_rizefactorhavale._t1.runMethod(true,"setEnabled",act_rizefactorhavale.mostCurrent.__c.getField(true,"True"));
 };
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
}