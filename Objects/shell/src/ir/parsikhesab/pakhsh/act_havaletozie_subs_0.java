package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_havaletozie_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"L_HavaleTozie\")";
Debug.ShouldStop(1);
act_havaletozie.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_HavaleTozie")),act_havaletozie.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="listHavale.Initialize";
Debug.ShouldStop(2);
act_havaletozie.mostCurrent._listhavale.runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="OriginallistHavale.Initialize";
Debug.ShouldStop(4);
act_havaletozie.mostCurrent._originallisthavale.runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(8);
act_havaletozie.mostCurrent._hlv.runMethod(false,"Initializer",act_havaletozie.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 37;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
Debug.ShouldStop(16);
act_havaletozie.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_havaletozie.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_havaletozie.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_havaletozie.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 38;BA.debugLine="HLV.Show";
Debug.ShouldStop(32);
act_havaletozie.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_havaletozie.processBA, e9.toString()); BA.debugLineNum = 40;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","528639241",BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA)),0);
 BA.debugLineNum = 41;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(256);
act_havaletozie.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_havaletozie.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,208);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 208;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Resume (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,203);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","activity_resume");}
 BA.debugLineNum = 203;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="btnUpdate_Click";
Debug.ShouldStop(2048);
_btnupdate_click();
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Application_Error (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,336);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 336;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(32768);
 BA.debugLineNum = 338;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return act_havaletozie.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_back_click() throws Exception{
try {
		Debug.PushSubsStack("btn_Back_Click (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,212);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","btn_back_click");}
 BA.debugLineNum = 212;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
act_havaletozie.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_sort_click() throws Exception{
try {
		Debug.PushSubsStack("btn_sort_Click (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,308);
if (RapidSub.canDelegate("btn_sort_click")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","btn_sort_click");}
 BA.debugLineNum = 308;BA.debugLine="Private Sub btn_sort_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaz_click() throws Exception{
try {
		Debug.PushSubsStack("BtnAz_Click (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,216);
if (RapidSub.canDelegate("btnaz_click")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","btnaz_click");}
RemoteObject _p = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 216;BA.debugLine="Sub BtnAz_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 218;BA.debugLine="Dim p As PersianMaterialDatePicker";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 219;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("Initialize",act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString("p")),(Object)(_p.runMethod(true,"getPersianYear")),(Object)(_p.runMethod(true,"getPersianMonth")),(Object)(_p.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 220;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(134217728);
_p.runMethod(true,"setAccentColor",act_havaletozie.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 221;BA.debugLine="p.OkText = \"تایید\"";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 222;BA.debugLine="p.CancelText = \"لغو\"";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 223;BA.debugLine="p.Title = \"از تاریخ\"";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("setTitle",BA.ObjectToString("از تاریخ"));
 BA.debugLineNum = 224;BA.debugLine="p.Typeface = \"iransansmonospacednum.ttf\"";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmonospacednum.ttf"));
 BA.debugLineNum = 225;BA.debugLine="p.Show(\"p\")";
Debug.ShouldStop(1);
_p.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_havaletozie.processBA, e11.toString()); BA.debugLineNum = 227;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529360139",BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA)),0);
 BA.debugLineNum = 228;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8);
act_havaletozie.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_havaletozie.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnAz_Click"))));
 };
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("BtnTa_Click (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,253);
if (RapidSub.canDelegate("btnta_click")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","btnta_click");}
RemoteObject _p1 = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 253;BA.debugLine="Sub BtnTa_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 255;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
Debug.ShouldStop(1073741824);
_p1 = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 256;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
Debug.ShouldStop(-2147483648);
_p1.runVoidMethod ("Initialize",act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString("p1")),(Object)(_p1.runMethod(true,"getPersianYear")),(Object)(_p1.runMethod(true,"getPersianMonth")),(Object)(_p1.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 257;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(1);
_p1.runMethod(true,"setAccentColor",act_havaletozie.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 258;BA.debugLine="p1.OkText = \"تایید\"";
Debug.ShouldStop(2);
_p1.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 259;BA.debugLine="p1.CancelText = \"لغو\"";
Debug.ShouldStop(4);
_p1.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 260;BA.debugLine="p1.Title = \"تا تاریخ\"";
Debug.ShouldStop(8);
_p1.runVoidMethod ("setTitle",BA.ObjectToString("تا تاریخ"));
 BA.debugLineNum = 261;BA.debugLine="p1.Typeface = \"iransansmonospacednum.ttf\"";
Debug.ShouldStop(16);
_p1.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmonospacednum.ttf"));
 BA.debugLineNum = 262;BA.debugLine="p1.Show(\"p1\")";
Debug.ShouldStop(32);
_p1.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p1")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_havaletozie.processBA, e11.toString()); BA.debugLineNum = 264;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529622283",BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA)),0);
 BA.debugLineNum = 265;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(256);
act_havaletozie.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_havaletozie.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnTa_Click"))));
 };
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
public static RemoteObject  _btnupdate_click() throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,312);
if (RapidSub.canDelegate("btnupdate_click")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","btnupdate_click");}
 BA.debugLineNum = 312;BA.debugLine="Private Sub btnUpdate_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 314;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 315;BA.debugLine="ProgressDialogShow(\"لطفا چند لحظه صبر کنید...\")";
Debug.ShouldStop(67108864);
act_havaletozie.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("لطفا چند لحظه صبر کنید..."))));
 BA.debugLineNum = 316;BA.debugLine="MCode.page=\"Act_HavaleTozie\"";
Debug.ShouldStop(134217728);
act_havaletozie.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_HavaleTozie");
 BA.debugLineNum = 317;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(268435456);
if (act_havaletozie.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_havaletozie.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 318;BA.debugLine="MCode.GetHavaleFlag=0";
Debug.ShouldStop(536870912);
act_havaletozie.mostCurrent._mcode._gethavaleflag /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 320;BA.debugLine="CallSubDelayed(Service_Server,\"GetHavaleByUser\"";
Debug.ShouldStop(-2147483648);
act_havaletozie.mostCurrent.__c.runVoidMethod ("CallSubDelayed",act_havaletozie.processBA,(Object)((act_havaletozie.mostCurrent._service_server.getObject())),(Object)(RemoteObject.createImmutable("GetHavaleByUser")));
 }else {
 BA.debugLineNum = 322;BA.debugLine="LoadFilter";
Debug.ShouldStop(2);
_loadfilter();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_havaletozie.processBA, e11.toString()); BA.debugLineNum = 326;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","530212110",BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA)),0);
 BA.debugLineNum = 327;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(64);
act_havaletozie.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_havaletozie.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btnUpdate_Click"))));
 };
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkvaziat(RemoteObject _shomarehavale) throws Exception{
try {
		Debug.PushSubsStack("CheckVaziat (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,126);
if (RapidSub.canDelegate("checkvaziat")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","checkvaziat", _shomarehavale);}
RemoteObject _countall = RemoteObject.createImmutable("");
RemoteObject _countvaziattahvilshode = RemoteObject.createImmutable("");
RemoteObject _vaziat = RemoteObject.createImmutable("");
Debug.locals.put("ShomareHavale", _shomarehavale);
 BA.debugLineNum = 126;BA.debugLine="Public Sub CheckVaziat(ShomareHavale As String) As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="Dim countAll As String=0";
Debug.ShouldStop(1073741824);
_countall = BA.NumberToString(0);Debug.locals.put("countAll", _countall);Debug.locals.put("countAll", _countall);
 BA.debugLineNum = 128;BA.debugLine="Dim countVaziatTahvilShode As String=0";
Debug.ShouldStop(-2147483648);
_countvaziattahvilshode = BA.NumberToString(0);Debug.locals.put("countVaziatTahvilShode", _countvaziattahvilshode);Debug.locals.put("countVaziatTahvilShode", _countvaziattahvilshode);
 BA.debugLineNum = 129;BA.debugLine="Dim vaziat As String=0";
Debug.ShouldStop(1);
_vaziat = BA.NumberToString(0);Debug.locals.put("vaziat", _vaziat);Debug.locals.put("vaziat", _vaziat);
 BA.debugLineNum = 131;BA.debugLine="countAll=MCode.SingleResult($\"select count(fldSho";
Debug.ShouldStop(4);
_countall = BA.ObjectToString(act_havaletozie.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_havaletozie.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select count(fldShomareHavale) from TblRizFactorHavale where fldShomareHavale="),act_havaletozie.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_shomarehavale))),RemoteObject.createImmutable(" "))))));Debug.locals.put("countAll", _countall);
 BA.debugLineNum = 132;BA.debugLine="countVaziatTahvilShode=MCode.SingleResult($\"selec";
Debug.ShouldStop(8);
_countvaziattahvilshode = BA.ObjectToString(act_havaletozie.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_havaletozie.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select count(fldShomareHavale) from TblRizFactorHavale where fldShomareHavale="),act_havaletozie.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_shomarehavale))),RemoteObject.createImmutable(" and fldVaziat=1 "))))));Debug.locals.put("countVaziatTahvilShode", _countvaziattahvilshode);
 BA.debugLineNum = 133;BA.debugLine="If countAll=countVaziatTahvilShode Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_countall,_countvaziattahvilshode)) { 
 BA.debugLineNum = 134;BA.debugLine="vaziat=1";
Debug.ShouldStop(32);
_vaziat = BA.NumberToString(1);Debug.locals.put("vaziat", _vaziat);
 };
 BA.debugLineNum = 137;BA.debugLine="Return vaziat";
Debug.ShouldStop(256);
if (true) return _vaziat;
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private pnl_HLV As Panel";
act_havaletozie.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private HLV As Hitex_LayoutView";
act_havaletozie.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 14;BA.debugLine="Dim MPD As ManamPersianDate";
act_havaletozie.mostCurrent._mpd = RemoteObject.createNew ("com.b4a.manamsoftware.PersianDate.ManamPersianDate");
 //BA.debugLineNum = 15;BA.debugLine="Dim DateAz,DateTa As String";
act_havaletozie.mostCurrent._dateaz = RemoteObject.createImmutable("");
act_havaletozie.mostCurrent._dateta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Private BtnTa As Button";
act_havaletozie.mostCurrent._btnta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnAz As Button";
act_havaletozie.mostCurrent._btnaz = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private SwOpen As ACSwitch";
act_havaletozie.mostCurrent._swopen = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private SwClose As ACSwitch";
act_havaletozie.mostCurrent._swclose = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private SwToday As ACSwitch";
act_havaletozie.mostCurrent._swtoday = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private TxtSearch As EditText";
act_havaletozie.mostCurrent._txtsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim listHavale As List";
act_havaletozie.mostCurrent._listhavale = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 23;BA.debugLine="Dim OriginallistHavale As List";
act_havaletozie.mostCurrent._originallisthavale = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 24;BA.debugLine="Dim OrderBy As String=\" Order By fldShomareHavale";
act_havaletozie.mostCurrent._orderby = BA.ObjectToString(" Order By fldShomareHavale Asc");
 //BA.debugLineNum = 25;BA.debugLine="Private LblTedadToday As Label";
act_havaletozie.mostCurrent._lbltedadtoday = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LblTedadClose As Label";
act_havaletozie.mostCurrent._lbltedadclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblTedadOpen As Label";
act_havaletozie.mostCurrent._lbltedadopen = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Img_sort As ImageView";
act_havaletozie.mostCurrent._img_sort = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,200);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","hlv_getitemcount");}
 BA.debugLineNum = 200;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Return listHavale.Size '/ItemList.Size";
Debug.ShouldStop(256);
if (true) return act_havaletozie.mostCurrent._listhavale.runMethod(true,"getSize");
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_itemclick(RemoteObject _clickeditem,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_ItemClick (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,196);
if (RapidSub.canDelegate("hlv_itemclick")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","hlv_itemclick", _clickeditem, _position);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_havale");
Debug.locals.put("ClickedItem", _clickeditem);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 196;BA.debugLine="Sub HLV_ItemClick (ClickedItem As Panel, Position";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="Dim rec As Cls_Rec_Havale=ClickedItem.Tag";
Debug.ShouldStop(16);
_rec = (_clickeditem.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 198;BA.debugLine="rec.lblShowHavale_Click";
Debug.ShouldStop(32);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_havale.class, "_lblshowhavale_click" /*RemoteObject*/ );
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_onBindViewHolder (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,190);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterephavale");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_havale");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 190;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="Dim item As AdapteRepHavale=listHavale.Get(Positi";
Debug.ShouldStop(1073741824);
_item = (act_havaletozie.mostCurrent._listhavale.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 192;BA.debugLine="Dim rec As Cls_Rec_Havale=Parent.Tag";
Debug.ShouldStop(-2147483648);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 193;BA.debugLine="rec.show(item)";
Debug.ShouldStop(1);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_havale.class, "_show" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 194;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(2);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_havale.class, "_getheight" /*RemoteObject*/ ));
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
public static RemoteObject  _hlv_oncreateviewholder(RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,184);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_havale");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 184;BA.debugLine="Private Sub HLV_onCreateViewHolder (Parent As Pane";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="Dim rec As Cls_Rec_Havale";
Debug.ShouldStop(16777216);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_rec_havale");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 186;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(33554432);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_havale.class, "_initialize" /*RemoteObject*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(act_havaletozie.getObject()));
 BA.debugLineNum = 187;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(67108864);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_havale.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_havaletozie.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_havaletozie.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_havale.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 188;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(134217728);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Img_sort_Click (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,341);
if (RapidSub.canDelegate("img_sort_click")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","img_sort_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 341;BA.debugLine="Private Sub Img_sort_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 342;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 344;BA.debugLine="Dim Lst As List = Array As String(\"از قدیم به جد";
Debug.ShouldStop(8388608);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_havaletozie.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("از قدیم به جدید"),RemoteObject.createImmutable("از جدید به قدیم")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 345;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس";
Debug.ShouldStop(16777216);
_res = act_havaletozie.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("مرتب سازی براساس:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_havaletozie.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 346;BA.debugLine="Select Case res";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 348;BA.debugLine="OrderBy = \" Order By fldShomareHavale Asc\"";
Debug.ShouldStop(134217728);
act_havaletozie.mostCurrent._orderby = BA.ObjectToString(" Order By fldShomareHavale Asc");
 break; }
case 1: {
 BA.debugLineNum = 350;BA.debugLine="OrderBy = \" Order By fldShomareHavale Desc\"";
Debug.ShouldStop(536870912);
act_havaletozie.mostCurrent._orderby = BA.ObjectToString(" Order By fldShomareHavale Desc");
 break; }
}
;
 BA.debugLineNum = 353;BA.debugLine="Log(OrderBy)";
Debug.ShouldStop(1);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","530343180",act_havaletozie.mostCurrent._orderby,0);
 BA.debugLineNum = 355;BA.debugLine="LoadFilter";
Debug.ShouldStop(4);
_loadfilter();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_havaletozie.processBA, e13.toString()); BA.debugLineNum = 357;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","530343184",BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA)),0);
 BA.debugLineNum = 358;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32);
act_havaletozie.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_havaletozie.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Img_sort_Click"))));
 };
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadfilter() throws Exception{
try {
		Debug.PushSubsStack("LoadFilter (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,45);
if (RapidSub.canDelegate("loadfilter")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","loadfilter");}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _countfilter = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.createImmutable(false);
RemoteObject _datep = RemoteObject.createImmutable("");
RemoteObject _search = RemoteObject.createImmutable("");
 BA.debugLineNum = 45;BA.debugLine="Public Sub LoadFilter";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 47;BA.debugLine="Dim str As String=\"\"";
Debug.ShouldStop(16384);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 48;BA.debugLine="Dim countfilter As Int=0";
Debug.ShouldStop(32768);
_countfilter = BA.numberCast(int.class, 0);Debug.locals.put("countfilter", _countfilter);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 49;BA.debugLine="Dim Filter As Boolean=False";
Debug.ShouldStop(65536);
_filter = act_havaletozie.mostCurrent.__c.getField(true,"False");Debug.locals.put("Filter", _filter);Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 51;BA.debugLine="If SwOpen.Checked Then";
Debug.ShouldStop(262144);
if (act_havaletozie.mostCurrent._swopen.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 52;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(524288);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 53;BA.debugLine="str= str & \" and fldVaziat=1\"";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldVaziat=1"));Debug.locals.put("str", _str);
 BA.debugLineNum = 54;BA.debugLine="Filter=True";
Debug.ShouldStop(2097152);
_filter = act_havaletozie.mostCurrent.__c.getField(true,"True");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 55;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 56;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8388608);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 60;BA.debugLine="If SwClose.Checked Then";
Debug.ShouldStop(134217728);
if (act_havaletozie.mostCurrent._swclose.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 61;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(268435456);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 62;BA.debugLine="str= str & \" and fldVaziat<>1\"";
Debug.ShouldStop(536870912);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldVaziat<>1"));Debug.locals.put("str", _str);
 BA.debugLineNum = 63;BA.debugLine="Filter=True";
Debug.ShouldStop(1073741824);
_filter = act_havaletozie.mostCurrent.__c.getField(true,"True");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 64;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 65;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(1);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 69;BA.debugLine="If BtnAz.Text<>\"تعیین تاریخ\" And BtnTa.Text<>\"تع";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",act_havaletozie.mostCurrent._btnaz.runMethod(true,"getText"),BA.ObjectToString("تعیین تاریخ")) && RemoteObject.solveBoolean("!",act_havaletozie.mostCurrent._btnta.runMethod(true,"getText"),BA.ObjectToString("تعیین تاریخ"))) { 
 BA.debugLineNum = 70;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(32);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 71;BA.debugLine="str= str & \" and fldDate between \"&BtnAz.Text.R";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldDate between "),act_havaletozie.mostCurrent._btnaz.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(" , "),act_havaletozie.mostCurrent._btnta.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("str", _str);
 BA.debugLineNum = 72;BA.debugLine="Filter=True";
Debug.ShouldStop(128);
_filter = act_havaletozie.mostCurrent.__c.getField(true,"True");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 73;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 74;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(512);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 75;BA.debugLine="str=str.Replace(\" , \",\" and \")";
Debug.ShouldStop(1024);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" , ")),(Object)(RemoteObject.createImmutable(" and ")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 80;BA.debugLine="If SwToday.Checked Then";
Debug.ShouldStop(32768);
if (act_havaletozie.mostCurrent._swtoday.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 81;BA.debugLine="Dim datep As String =MCode.DatePersian";
Debug.ShouldStop(65536);
_datep = act_havaletozie.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_havaletozie.mostCurrent.activityBA);Debug.locals.put("datep", _datep);Debug.locals.put("datep", _datep);
 BA.debugLineNum = 82;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(131072);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 83;BA.debugLine="str= str & \" and fldDate=\"&datep";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldDate="),_datep);Debug.locals.put("str", _str);
 BA.debugLineNum = 84;BA.debugLine="Filter=True";
Debug.ShouldStop(524288);
_filter = act_havaletozie.mostCurrent.__c.getField(true,"True");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 85;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 86;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(2097152);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 91;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>\"";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",act_havaletozie.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",act_havaletozie.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",act_havaletozie.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 92;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersia";
Debug.ShouldStop(134217728);
_search = act_havaletozie.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(act_havaletozie.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 93;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
 BA.debugLineNum = 94;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(536870912);
_search = act_havaletozie.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 };
 BA.debugLineNum = 96;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(-2147483648);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 97;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(1);
if (act_havaletozie.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 98;BA.debugLine="str = str & $\" and  (fldShomareHavale = '${Sea";
Debug.ShouldStop(2);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and  (fldShomareHavale = '"),act_havaletozie.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("') "))));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 100;BA.debugLine="Filter=True";
Debug.ShouldStop(8);
_filter = act_havaletozie.mostCurrent.__c.getField(true,"True");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 101;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 102;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(32);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 109;BA.debugLine="If Filter=True And str<>\"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_filter,act_havaletozie.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 112;BA.debugLine="str=\"select * from TblHavale where \"&str&\" \" &";
Debug.ShouldStop(32768);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblHavale where "),_str,RemoteObject.createImmutable(" "),act_havaletozie.mostCurrent._orderby);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 114;BA.debugLine="str=\"select * from TblHavale  \" & OrderBy";
Debug.ShouldStop(131072);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblHavale  "),act_havaletozie.mostCurrent._orderby);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 116;BA.debugLine="LoadHavale(str)";
Debug.ShouldStop(524288);
_loadhavale(_str);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e60) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_havaletozie.processBA, e60.toString()); BA.debugLineNum = 119;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","528704842",BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA)),0);
 BA.debugLineNum = 120;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8388608);
act_havaletozie.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_havaletozie.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadFilter"))));
 };
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadhavale(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("LoadHavale (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,140);
if (RapidSub.canDelegate("loadhavale")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","loadhavale", _query);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterephavale");
Debug.locals.put("query", _query);
 BA.debugLineNum = 140;BA.debugLine="Public Sub LoadHavale(query As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 142;BA.debugLine="listHavale.Clear";
Debug.ShouldStop(8192);
act_havaletozie.mostCurrent._listhavale.runVoidMethod ("Clear");
 BA.debugLineNum = 143;BA.debugLine="OriginallistHavale.Clear";
Debug.ShouldStop(16384);
act_havaletozie.mostCurrent._originallisthavale.runVoidMethod ("Clear");
 BA.debugLineNum = 144;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 145;BA.debugLine="cu=MCode.Result(query)";
Debug.ShouldStop(65536);
_cu = act_havaletozie.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(_query));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 146;BA.debugLine="If	cu.RowCount>0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 147;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(262144);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 148;BA.debugLine="cu.Position=i";
Debug.ShouldStop(524288);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 149;BA.debugLine="Dim item As AdapteRepHavale";
Debug.ShouldStop(1048576);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterephavale");Debug.locals.put("item", _item);
 BA.debugLineNum = 150;BA.debugLine="item.fldShomareHavale=cu.GetString(\"fldShomareH";
Debug.ShouldStop(2097152);
_item.setField ("fldShomareHavale" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareHavale"))));
 BA.debugLineNum = 151;BA.debugLine="item.fldDate=cu.GetString(\"fldDate\")";
Debug.ShouldStop(4194304);
_item.setField ("fldDate" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDate"))));
 BA.debugLineNum = 152;BA.debugLine="item.fldVaziat=cu.GetString(\"fldVaziat\")'CheckV";
Debug.ShouldStop(8388608);
_item.setField ("fldVaziat" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldVaziat"))));
 BA.debugLineNum = 153;BA.debugLine="item.fldMandeFactor=cu.GetString(\"fldMandeFacto";
Debug.ShouldStop(16777216);
_item.setField ("fldMandeFactor" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMandeFactor"))));
 BA.debugLineNum = 154;BA.debugLine="item.fldCountFactor=cu.GetString(\"fldCountFacto";
Debug.ShouldStop(33554432);
_item.setField ("fldCountFactor" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCountFactor"))));
 BA.debugLineNum = 155;BA.debugLine="OriginallistHavale.Add(item)";
Debug.ShouldStop(67108864);
act_havaletozie.mostCurrent._originallisthavale.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 157;BA.debugLine="cu.Close";
Debug.ShouldStop(268435456);
_cu.runVoidMethod ("Close");
 };
 BA.debugLineNum = 160;BA.debugLine="listHavale=OriginallistHavale";
Debug.ShouldStop(-2147483648);
act_havaletozie.mostCurrent._listhavale = act_havaletozie.mostCurrent._originallisthavale;
 BA.debugLineNum = 161;BA.debugLine="If	SwToday.Checked Then";
Debug.ShouldStop(1);
if (act_havaletozie.mostCurrent._swtoday.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 162;BA.debugLine="LblTedadToday.Text=listHavale.Size";
Debug.ShouldStop(2);
act_havaletozie.mostCurrent._lbltedadtoday.runMethod(true,"setText",BA.ObjectToCharSequence(act_havaletozie.mostCurrent._listhavale.runMethod(true,"getSize")));
 }else {
 BA.debugLineNum = 164;BA.debugLine="LblTedadToday.Text=0";
Debug.ShouldStop(8);
act_havaletozie.mostCurrent._lbltedadtoday.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 166;BA.debugLine="If	SwOpen.Checked Then";
Debug.ShouldStop(32);
if (act_havaletozie.mostCurrent._swopen.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 167;BA.debugLine="lblTedadOpen.Text=listHavale.Size";
Debug.ShouldStop(64);
act_havaletozie.mostCurrent._lbltedadopen.runMethod(true,"setText",BA.ObjectToCharSequence(act_havaletozie.mostCurrent._listhavale.runMethod(true,"getSize")));
 }else {
 BA.debugLineNum = 169;BA.debugLine="lblTedadOpen.Text=0";
Debug.ShouldStop(256);
act_havaletozie.mostCurrent._lbltedadopen.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 171;BA.debugLine="If	SwClose.Checked Then";
Debug.ShouldStop(1024);
if (act_havaletozie.mostCurrent._swclose.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 172;BA.debugLine="LblTedadClose.Text=listHavale.Size";
Debug.ShouldStop(2048);
act_havaletozie.mostCurrent._lbltedadclose.runMethod(true,"setText",BA.ObjectToCharSequence(act_havaletozie.mostCurrent._listhavale.runMethod(true,"getSize")));
 }else {
 BA.debugLineNum = 174;BA.debugLine="LblTedadClose.Text=0";
Debug.ShouldStop(8192);
act_havaletozie.mostCurrent._lbltedadclose.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 177;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(65536);
act_havaletozie.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e37) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_havaletozie.processBA, e37.toString()); BA.debugLineNum = 179;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","528835879",BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA)),0);
 BA.debugLineNum = 180;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(524288);
act_havaletozie.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_havaletozie.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadHavale"))));
 };
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_oncancel() throws Exception{
try {
		Debug.PushSubsStack("p_onCancel (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,246);
if (RapidSub.canDelegate("p_oncancel")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","p_oncancel");}
 BA.debugLineNum = 246;BA.debugLine="Sub p_onCancel";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 247;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(4194304);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529491201",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("p_onDateSet (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,231);
if (RapidSub.canDelegate("p_ondateset")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","p_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 231;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 233;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(256);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529425666",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 234;BA.debugLine="BtnAz.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(512);
act_havaletozie.mostCurrent._btnaz.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 235;BA.debugLine="BtnAz.Tag=year&NumberFormat(month,2,0)&NumberForm";
Debug.ShouldStop(1024);
act_havaletozie.mostCurrent._btnaz.runMethod(false,"setTag",(RemoteObject.concat(_year,act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 236;BA.debugLine="DateAz=MPD.PersianToGregorian(year,month,day)";
Debug.ShouldStop(2048);
act_havaletozie.mostCurrent._dateaz = act_havaletozie.mostCurrent._mpd.runMethod(true,"PersianToGregorian",(Object)(_year),(Object)(_month),(Object)(_day));
 BA.debugLineNum = 239;BA.debugLine="DateAz=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(16384);
act_havaletozie.mostCurrent._dateaz = RemoteObject.concat(_year,act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 240;BA.debugLine="LogColor(DateAz,Colors.Magenta)";
Debug.ShouldStop(32768);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529425673",act_havaletozie.mostCurrent._dateaz,act_havaletozie.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_havaletozie.processBA, e9.toString()); BA.debugLineNum = 242;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529425675",BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA)),0);
 BA.debugLineNum = 243;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(262144);
act_havaletozie.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_havaletozie.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-p_onDateSet"))));
 };
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("p_onDismiss (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,249);
if (RapidSub.canDelegate("p_ondismiss")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","p_ondismiss");}
 BA.debugLineNum = 249;BA.debugLine="Sub p_onDismiss";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="Log(\"dismiss1\")";
Debug.ShouldStop(33554432);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529556737",RemoteObject.createImmutable("dismiss1"),0);
 BA.debugLineNum = 251;BA.debugLine="LoadFilter";
Debug.ShouldStop(67108864);
_loadfilter();
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("p1_onCancel (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,283);
if (RapidSub.canDelegate("p1_oncancel")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","p1_oncancel");}
 BA.debugLineNum = 283;BA.debugLine="Sub p1_onCancel";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(134217728);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529753345",RemoteObject.createImmutable("cancel"),0);
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
public static RemoteObject  _p1_ondateset(RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("p1_onDateSet (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,268);
if (RapidSub.canDelegate("p1_ondateset")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","p1_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 268;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 270;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(8192);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529687810",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 271;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(16384);
act_havaletozie.mostCurrent._btnta.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 272;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
Debug.ShouldStop(32768);
act_havaletozie.mostCurrent._btnta.runMethod(false,"setTag",(RemoteObject.concat(_year,act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 273;BA.debugLine="DateTa= MPD.PersianToGregorian(year,month,day)";
Debug.ShouldStop(65536);
act_havaletozie.mostCurrent._dateta = act_havaletozie.mostCurrent._mpd.runMethod(true,"PersianToGregorian",(Object)(_year),(Object)(_month),(Object)(_day));
 BA.debugLineNum = 276;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(524288);
act_havaletozie.mostCurrent._dateta = RemoteObject.concat(_year,act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_havaletozie.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 277;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
Debug.ShouldStop(1048576);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529687817",act_havaletozie.mostCurrent._dateta,act_havaletozie.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_havaletozie.processBA, e9.toString()); BA.debugLineNum = 279;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529687819",BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA)),0);
 BA.debugLineNum = 280;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8388608);
act_havaletozie.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_havaletozie.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_havaletozie.mostCurrent.__c.runMethod(false,"LastException",act_havaletozie.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_havaletozie.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-p1_onDateSet"))));
 };
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("p1_onDismiss (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,286);
if (RapidSub.canDelegate("p1_ondismiss")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","p1_ondismiss");}
 BA.debugLineNum = 286;BA.debugLine="Sub p1_onDismiss";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(1073741824);
act_havaletozie.mostCurrent.__c.runVoidMethod ("LogImpl","529818881",RemoteObject.createImmutable("dismiss"),0);
 BA.debugLineNum = 288;BA.debugLine="LoadFilter";
Debug.ShouldStop(-2147483648);
_loadfilter();
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _swclose_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwClose_CheckedChange (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,296);
if (RapidSub.canDelegate("swclose_checkedchange")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","swclose_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 296;BA.debugLine="Private Sub SwClose_CheckedChange(Checked As Boole";
Debug.ShouldStop(128);
 BA.debugLineNum = 297;BA.debugLine="LoadFilter";
Debug.ShouldStop(256);
_loadfilter();
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swopen_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwOpen_CheckedChange (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,292);
if (RapidSub.canDelegate("swopen_checkedchange")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","swopen_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 292;BA.debugLine="Private Sub SwOpen_CheckedChange(Checked As Boolea";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="LoadFilter";
Debug.ShouldStop(16);
_loadfilter();
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swtoday_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwToday_CheckedChange (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,300);
if (RapidSub.canDelegate("swtoday_checkedchange")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","swtoday_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 300;BA.debugLine="Private Sub SwToday_CheckedChange(Checked As Boole";
Debug.ShouldStop(2048);
 BA.debugLineNum = 301;BA.debugLine="LoadFilter";
Debug.ShouldStop(4096);
_loadfilter();
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtsearch_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtSearch_TextChanged (act_havaletozie) ","act_havaletozie",14,act_havaletozie.mostCurrent.activityBA,act_havaletozie.mostCurrent,304);
if (RapidSub.canDelegate("txtsearch_textchanged")) { return ir.parsikhesab.pakhsh.act_havaletozie.remoteMe.runUserSub(false, "act_havaletozie","txtsearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 304;BA.debugLine="Private Sub TxtSearch_TextChanged (Old As String,";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="LoadFilter";
Debug.ShouldStop(65536);
_loadfilter();
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}