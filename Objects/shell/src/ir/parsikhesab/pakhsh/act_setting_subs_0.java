package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_setting_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"l_setting\")";
Debug.ShouldStop(134217728);
act_setting.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_setting")),act_setting.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="apkupdt.Initialize(Me,\"update\")";
Debug.ShouldStop(268435456);
act_setting.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_initialize" /*RemoteObject*/ ,act_setting.mostCurrent.activityBA,(Object)(act_setting.getObject()),(Object)(RemoteObject.createImmutable("update")));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,80);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 80;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,74);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","activity_resume");}
 BA.debugLineNum = 74;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="MCode.page=\"act_setting\"";
Debug.ShouldStop(1024);
act_setting.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("act_setting");
 BA.debugLineNum = 76;BA.debugLine="CheckPrinter";
Debug.ShouldStop(2048);
_checkprinter();
 BA.debugLineNum = 77;BA.debugLine="CheckArzeshAfzode";
Debug.ShouldStop(4096);
_checkarzeshafzode();
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("btn_Back_Click (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,111);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","btn_back_click");}
 BA.debugLineNum = 111;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
act_setting.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsaveinfocompany_click() throws Exception{
try {
		Debug.PushSubsStack("btnSaveInfoCompany_Click (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,151);
if (RapidSub.canDelegate("btnsaveinfocompany_click")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","btnsaveinfocompany_click");}
 BA.debugLineNum = 151;BA.debugLine="Private Sub btnSaveInfoCompany_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="StartActivity(Act_SaveInfoCompany)";
Debug.ShouldStop(8388608);
act_setting.mostCurrent.__c.runVoidMethod ("StartActivity",act_setting.processBA,(Object)((act_setting.mostCurrent._act_saveinfocompany.getObject())));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkarzeshafzode() throws Exception{
try {
		Debug.PushSubsStack("CheckArzeshAfzode (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,97);
if (RapidSub.canDelegate("checkarzeshafzode")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","checkarzeshafzode");}
 BA.debugLineNum = 97;BA.debugLine="Sub CheckArzeshAfzode";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Select MCode.ArzeshAfzodeEnable";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(act_setting.mostCurrent._mcode._arzeshafzodeenable /*RemoteObject*/ ,BA.NumberToString(0),BA.NumberToString(1))) {
case 0: {
 BA.debugLineNum = 100;BA.debugLine="SwArzeshAfzodeEnable.Checked=False";
Debug.ShouldStop(8);
act_setting.mostCurrent._swarzeshafzodeenable.runMethodAndSync(true,"setChecked",act_setting.mostCurrent.__c.getField(true,"False"));
 break; }
case 1: {
 BA.debugLineNum = 102;BA.debugLine="SwArzeshAfzodeEnable.Checked=True";
Debug.ShouldStop(32);
act_setting.mostCurrent._swarzeshafzodeenable.runMethodAndSync(true,"setChecked",act_setting.mostCurrent.__c.getField(true,"True"));
 break; }
}
;
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkprinter() throws Exception{
try {
		Debug.PushSubsStack("CheckPrinter (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,84);
if (RapidSub.canDelegate("checkprinter")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","checkprinter");}
 BA.debugLineNum = 84;BA.debugLine="Sub CheckPrinter";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Select MCode.PrinterType";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(act_setting.mostCurrent._mcode._printertype /*RemoteObject*/ ,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 87;BA.debugLine="RB_PrinterBluetooth.Checked=True";
Debug.ShouldStop(4194304);
act_setting.mostCurrent._rb_printerbluetooth.runMethodAndSync(true,"setChecked",act_setting.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 88;BA.debugLine="lblSettingPosParsian.Visible=False";
Debug.ShouldStop(8388608);
act_setting.mostCurrent._lblsettingposparsian.runMethod(true,"setVisible",act_setting.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 89;BA.debugLine="lblDownloadPosParsian.Visible=False";
Debug.ShouldStop(16777216);
act_setting.mostCurrent._lbldownloadposparsian.runMethod(true,"setVisible",act_setting.mostCurrent.__c.getField(true,"False"));
 break; }
case 1: {
 BA.debugLineNum = 91;BA.debugLine="RB_PrinterPos.Checked=True";
Debug.ShouldStop(67108864);
act_setting.mostCurrent._rb_printerpos.runMethodAndSync(true,"setChecked",act_setting.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 92;BA.debugLine="lblSettingPosParsian.Visible=True";
Debug.ShouldStop(134217728);
act_setting.mostCurrent._lblsettingposparsian.runMethod(true,"setVisible",act_setting.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 93;BA.debugLine="lblDownloadPosParsian.Visible=True";
Debug.ShouldStop(268435456);
act_setting.mostCurrent._lbldownloadposparsian.runMethod(true,"setVisible",act_setting.mostCurrent.__c.getField(true,"True"));
 break; }
}
;
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
public static RemoteObject  _downloadapppos() throws Exception{
try {
		Debug.PushSubsStack("DownloadAppPos (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,32);
if (RapidSub.canDelegate("downloadapppos")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","downloadapppos");}
RemoteObject _link = RemoteObject.createImmutable("");
 BA.debugLineNum = 32;BA.debugLine="Sub DownloadAppPos As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Dim link As String= MCode.linkposparsian";
Debug.ShouldStop(1);
_link = act_setting.mostCurrent._mcode._linkposparsian /*RemoteObject*/ ;Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 34;BA.debugLine="apkupdt.PackageName = \"com.pec.cpsdk\"";
Debug.ShouldStop(2);
act_setting.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setpackagename" /*RemoteObject*/ ,BA.ObjectToString("com.pec.cpsdk"));
 BA.debugLineNum = 35;BA.debugLine="apkupdt.NewVerApk = link";
Debug.ShouldStop(4);
act_setting.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setnewverapk",_link);
 BA.debugLineNum = 37;BA.debugLine="apkupdt.DownloadApk";
Debug.ShouldStop(16);
act_setting.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_downloadapk" /*void*/ );
 BA.debugLineNum = 38;BA.debugLine="ProgressDialogShow(\"لطفا منتظر بمانید\")";
Debug.ShouldStop(32);
act_setting.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_setting.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("لطفا منتظر بمانید"))));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private RB_PrinterBluetooth As RadioButton";
act_setting.mostCurrent._rb_printerbluetooth = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private RB_PrinterPos As RadioButton";
act_setting.mostCurrent._rb_printerpos = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private lblSettingPosParsian As Label";
act_setting.mostCurrent._lblsettingposparsian = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lblDownloadPosParsian As Label";
act_setting.mostCurrent._lbldownloadposparsian = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim apkupdt As cl_appupdate";
act_setting.mostCurrent._apkupdt = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cl_appupdate");
 //BA.debugLineNum = 21;BA.debugLine="Private Panel5 As Panel";
act_setting.mostCurrent._panel5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private btnSaveInfoCompany As Button";
act_setting.mostCurrent._btnsaveinfocompany = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private SwArzeshAfzodeEnable As ACSwitch";
act_setting.mostCurrent._swarzeshafzodeenable = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbldownloadposparsian_click() throws Exception{
try {
		Debug.PushSubsStack("lblDownloadPosParsian_Click (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,119);
if (RapidSub.canDelegate("lbldownloadposparsian_click")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","lbldownloadposparsian_click");}
 BA.debugLineNum = 119;BA.debugLine="Private Sub lblDownloadPosParsian_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="CallSubDelayed2(Service_Server,\"GetVersion\",\"Pos-";
Debug.ShouldStop(8388608);
act_setting.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_setting.processBA,(Object)((act_setting.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("GetVersion")),(Object)((RemoteObject.createImmutable("Pos-Parsian"))));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblsettingposparsian_click() throws Exception{
try {
		Debug.PushSubsStack("lblSettingPosParsian_Click (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,115);
if (RapidSub.canDelegate("lblsettingposparsian_click")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","lblsettingposparsian_click");}
 BA.debugLineNum = 115;BA.debugLine="Private Sub lblSettingPosParsian_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _rb_printerbluetooth_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("RB_PrinterBluetooth_CheckedChange (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,125);
if (RapidSub.canDelegate("rb_printerbluetooth_checkedchange")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","rb_printerbluetooth_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 125;BA.debugLine="Private Sub RB_PrinterBluetooth_CheckedChange(Chec";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 127;BA.debugLine="MCode.PrinterType=0";
Debug.ShouldStop(1073741824);
act_setting.mostCurrent._mcode._printertype /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 128;BA.debugLine="MCode.SaveUpdate(\"update TblSetting Set FldPrint";
Debug.ShouldStop(-2147483648);
act_setting.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_setting.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("update TblSetting Set FldPrinterType="),act_setting.mostCurrent._mcode._printertype /*RemoteObject*/ )));
 BA.debugLineNum = 129;BA.debugLine="CheckPrinter";
Debug.ShouldStop(1);
_checkprinter();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_setting.processBA, e6.toString()); BA.debugLineNum = 131;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
act_setting.mostCurrent.__c.runVoidMethod ("LogImpl","582968582",BA.ObjectToString(act_setting.mostCurrent.__c.runMethod(false,"LastException",act_setting.mostCurrent.activityBA)),0);
 BA.debugLineNum = 132;BA.debugLine="myCode.SendError(LastException,MCode.page&\"-RB_P";
Debug.ShouldStop(8);
act_setting.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_setting.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_setting.mostCurrent.__c.runMethod(false,"LastException",act_setting.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_setting.mostCurrent._mcode._page /*RemoteObject*/ ,RemoteObject.createImmutable("-RB_PrinterBluetooth_CheckedChange"))));
 };
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rb_printerpos_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("RB_PrinterPos_CheckedChange (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,136);
if (RapidSub.canDelegate("rb_printerpos_checkedchange")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","rb_printerpos_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 136;BA.debugLine="Private Sub RB_PrinterPos_CheckedChange(Checked As";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 138;BA.debugLine="MCode.PrinterType=1";
Debug.ShouldStop(512);
act_setting.mostCurrent._mcode._printertype /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 139;BA.debugLine="MCode.SaveUpdate(\"update TblSetting Set FldPrint";
Debug.ShouldStop(1024);
act_setting.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_setting.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("update TblSetting Set FldPrinterType="),act_setting.mostCurrent._mcode._printertype /*RemoteObject*/ )));
 BA.debugLineNum = 140;BA.debugLine="CheckPrinter";
Debug.ShouldStop(2048);
_checkprinter();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_setting.processBA, e6.toString()); BA.debugLineNum = 142;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
act_setting.mostCurrent.__c.runVoidMethod ("LogImpl","583034118",BA.ObjectToString(act_setting.mostCurrent.__c.runMethod(false,"LastException",act_setting.mostCurrent.activityBA)),0);
 BA.debugLineNum = 143;BA.debugLine="myCode.SendError(LastException,MCode.page&\"-RB_P";
Debug.ShouldStop(16384);
act_setting.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_setting.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_setting.mostCurrent.__c.runMethod(false,"LastException",act_setting.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_setting.mostCurrent._mcode._page /*RemoteObject*/ ,RemoteObject.createImmutable("-RB_PrinterPos_CheckedChange"))));
 };
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swarzeshafzodeenable_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwArzeshAfzodeEnable_CheckedChange (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,155);
if (RapidSub.canDelegate("swarzeshafzodeenable_checkedchange")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","swarzeshafzodeenable_checkedchange", _checked);}
RemoteObject _enable = RemoteObject.createImmutable("");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 155;BA.debugLine="Private Sub SwArzeshAfzodeEnable_CheckedChange(Che";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 157;BA.debugLine="Dim enable As String=0";
Debug.ShouldStop(268435456);
_enable = BA.NumberToString(0);Debug.locals.put("enable", _enable);Debug.locals.put("enable", _enable);
 BA.debugLineNum = 158;BA.debugLine="If Checked Then";
Debug.ShouldStop(536870912);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 159;BA.debugLine="enable=1";
Debug.ShouldStop(1073741824);
_enable = BA.NumberToString(1);Debug.locals.put("enable", _enable);
 };
 BA.debugLineNum = 161;BA.debugLine="MCode.ArzeshAfzodeEnable=enable";
Debug.ShouldStop(1);
act_setting.mostCurrent._mcode._arzeshafzodeenable /*RemoteObject*/  = _enable;
 BA.debugLineNum = 162;BA.debugLine="MCode.SaveUpdate(\"update TblSetting Set fldArzes";
Debug.ShouldStop(2);
act_setting.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_setting.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("update TblSetting Set fldArzeshAfzodeEnable='"),_enable,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 163;BA.debugLine="CheckArzeshAfzode";
Debug.ShouldStop(4);
_checkarzeshafzode();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_setting.processBA, e10.toString()); BA.debugLineNum = 165;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
act_setting.mostCurrent.__c.runVoidMethod ("LogImpl","583165194",BA.ObjectToString(act_setting.mostCurrent.__c.runMethod(false,"LastException",act_setting.mostCurrent.activityBA)),0);
 BA.debugLineNum = 166;BA.debugLine="myCode.SendError(LastException,MCode.page&\"-SwAr";
Debug.ShouldStop(32);
act_setting.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_setting.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_setting.mostCurrent.__c.runMethod(false,"LastException",act_setting.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_setting.mostCurrent._mcode._page /*RemoteObject*/ ,RemoteObject.createImmutable("-SwArzeshAfzodeEnable_CheckedChange"))));
 };
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update_updatecomplete() throws Exception{
try {
		Debug.PushSubsStack("update_UpdateComplete (act_setting) ","act_setting",48,act_setting.mostCurrent.activityBA,act_setting.mostCurrent,41);
if (RapidSub.canDelegate("update_updatecomplete")) { return ir.parsikhesab.pakhsh.act_setting.remoteMe.runUserSub(false, "act_setting","update_updatecomplete");}
 BA.debugLineNum = 41;BA.debugLine="Sub update_UpdateComplete";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="LogColor($\"UpdateComplete - time: ${DateTime.Time";
Debug.ShouldStop(512);
act_setting.mostCurrent.__c.runVoidMethod ("LogImpl","582444289",(RemoteObject.concat(RemoteObject.createImmutable("UpdateComplete - time: "),act_setting.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_setting.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_setting.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))),RemoteObject.createImmutable(""))),BA.numberCast(int.class, ((int)0xff556b2f)));
 BA.debugLineNum = 43;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
act_setting.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 45;BA.debugLine="Select apkupdt.Status";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(act_setting.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_getstatus" /*RemoteObject*/ ),act_setting.mostCurrent._apkupdt.getField(true,"_ok_curver" /*RemoteObject*/ ),act_setting.mostCurrent._apkupdt.getField(true,"_ok_webver" /*RemoteObject*/ ),act_setting.mostCurrent._apkupdt.getField(true,"_ok_newerapk" /*RemoteObject*/ ),act_setting.mostCurrent._apkupdt.getField(true,"_no_newerapk" /*RemoteObject*/ ),act_setting.mostCurrent._apkupdt.getField(true,"_ok_download" /*RemoteObject*/ ),act_setting.mostCurrent._apkupdt.getField(true,"_ok_install" /*RemoteObject*/ ),act_setting.mostCurrent._apkupdt.getField(true,"_err_noperm" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 47;BA.debugLine="Log($\"Running apk version: ${apkupdt.CurVN}${CR";
Debug.ShouldStop(16384);
act_setting.mostCurrent.__c.runVoidMethod ("LogImpl","582444294",(RemoteObject.concat(RemoteObject.createImmutable("Running apk version: "),act_setting.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_setting.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_getcurvn" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),act_setting.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_setting.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""))),0);
 break; }
case 1: {
 BA.debugLineNum = 50;BA.debugLine="Log($\"Webserver apk version: ${apkupdt.WebVN}${";
Debug.ShouldStop(131072);
act_setting.mostCurrent.__c.runVoidMethod ("LogImpl","582444297",(RemoteObject.concat(RemoteObject.createImmutable("Webserver apk version: "),act_setting.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_setting.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_getwebvn" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),act_setting.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_setting.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""))),0);
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 BA.debugLineNum = 58;BA.debugLine="Log(\"OK_DOWNLOAD\")";
Debug.ShouldStop(33554432);
act_setting.mostCurrent.__c.runVoidMethod ("LogImpl","582444305",RemoteObject.createImmutable("OK_DOWNLOAD"),0);
 BA.debugLineNum = 60;BA.debugLine="apkupdt.InstallApk(True)";
Debug.ShouldStop(134217728);
act_setting.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_installapk" /*RemoteObject*/ ,(Object)(act_setting.mostCurrent.__c.getField(true,"True")));
 break; }
case 5: {
 BA.debugLineNum = 63;BA.debugLine="Log(\"OK_INSTALL\")";
Debug.ShouldStop(1073741824);
act_setting.mostCurrent.__c.runVoidMethod ("LogImpl","582444310",RemoteObject.createImmutable("OK_INSTALL"),0);
 break; }
case 6: {
 BA.debugLineNum = 66;BA.debugLine="Log(\"No permission to install\")";
Debug.ShouldStop(2);
act_setting.mostCurrent.__c.runVoidMethod ("LogImpl","582444313",RemoteObject.createImmutable("No permission to install"),0);
 break; }
default: {
 break; }
}
;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}