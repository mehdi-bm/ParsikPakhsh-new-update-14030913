package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_submenu1_subs_0 {


public static RemoteObject  _backinfo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BackInfo_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("backinfo_click")) { return __ref.runUserSub(false, "cls_submenu1","backinfo_click", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Sub BackInfo_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"Parsik/Ba";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",cls_submenu1.__c.getField(false,"File").runMethod(true,"Exists",(Object)(cls_submenu1.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("Parsik/Backup/backlist.txt"))),cls_submenu1.__c.getField(true,"True"))) { 
 BA.debugLineNum = 81;BA.debugLine="StartActivity(Act_Restore)";
Debug.ShouldStop(65536);
cls_submenu1.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_restore.getObject())));
 }else {
 BA.debugLineNum = 83;BA.debugLine="ToastMessageShow(\"هیچ فایل پشتیبانی موجود نمی با";
Debug.ShouldStop(262144);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("هیچ فایل پشتیبانی موجود نمی باشد")),(Object)(cls_submenu1.__c.getField(true,"False")));
 };
 BA.debugLineNum = 85;BA.debugLine="HideMenu";
Debug.ShouldStop(1048576);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncompare_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCompare_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,308);
if (RapidSub.canDelegate("btncompare_click")) { return __ref.runUserSub(false, "cls_submenu1","btncompare_click", __ref);}
 BA.debugLineNum = 308;BA.debugLine="Sub btnCompare_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 309;BA.debugLine="VerFlag=\"checkupdate\"";
Debug.ShouldStop(1048576);
__ref.setField ("_verflag" /*RemoteObject*/ ,BA.ObjectToString("checkupdate"));
 BA.debugLineNum = 310;BA.debugLine="GetVersion";
Debug.ShouldStop(2097152);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_getversion" /*RemoteObject*/ );
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
public static RemoteObject  _btndwnld_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDwnld_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("btndwnld_click")) { return __ref.runUserSub(false, "cls_submenu1","btndwnld_click", __ref);}
 BA.debugLineNum = 315;BA.debugLine="Sub btnDwnld_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 317;BA.debugLine="apkupdt.DownloadApk  'send out command; async res";
Debug.ShouldStop(268435456);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_downloadapk" /*void*/ );
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btninstall_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnInstall_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("btninstall_click")) { __ref.runUserSub(false, "cls_submenu1","btninstall_click", __ref); return;}
ResumableSub_btnInstall_Click rsub = new ResumableSub_btnInstall_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnInstall_Click extends BA.ResumableSub {
public ResumableSub_btnInstall_Click(ir.parsikhesab.pakhsh.cls_submenu1 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInstall_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,323);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 324;BA.debugLine="Wait For (CheckInstallationRequirements) Complete";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_submenu1", "btninstall_click"), __ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_checkinstallationrequirements" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 325;BA.debugLine="apkupdt.InstallApk(Result)  'send out command; as";
Debug.ShouldStop(16);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_installapk" /*RemoteObject*/ ,(Object)(_result));
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _btnwebver_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnWebVer_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("btnwebver_click")) { return __ref.runUserSub(false, "cls_submenu1","btnwebver_click", __ref);}
 BA.debugLineNum = 301;BA.debugLine="Sub btnWebVer_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 303;BA.debugLine="apkupdt.ReadWebVN  'send out command; async resul";
Debug.ShouldStop(16384);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_readwebvn" /*void*/ );
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttonupdate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonUpdate_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("buttonupdate_click")) { __ref.runUserSub(false, "cls_submenu1","buttonupdate_click", __ref); return;}
ResumableSub_ButtonUpdate_Click rsub = new ResumableSub_ButtonUpdate_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonUpdate_Click extends BA.ResumableSub {
public ResumableSub_ButtonUpdate_Click(ir.parsikhesab.pakhsh.cls_submenu1 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonUpdate_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,329);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 332;BA.debugLine="Wait For (CheckInstallationRequirements) Complete";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_submenu1", "buttonupdate_click"), __ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_checkinstallationrequirements" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 334;BA.debugLine="apkupdt.SetAndStartSplashScreen(mdl,LoadBitmap(Fi";
Debug.ShouldStop(8192);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setandstartsplashscreen" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), __ref.getField(false,"_mdl" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bg-update-parsik-splash.jpg")))));
 BA.debugLineNum = 336;BA.debugLine="apkupdt.UpdateApk(Result) 'checks for newer apk,";
Debug.ShouldStop(32768);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_updateapk" /*void*/ ,(Object)(_result));
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _checkinstallationrequirements(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckInstallationRequirements (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("checkinstallationrequirements")) { return __ref.runUserSub(false, "cls_submenu1","checkinstallationrequirements", __ref);}
ResumableSub_CheckInstallationRequirements rsub = new ResumableSub_CheckInstallationRequirements(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckInstallationRequirements extends BA.ResumableSub {
public ResumableSub_CheckInstallationRequirements(ir.parsikhesab.pakhsh.cls_submenu1 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckInstallationRequirements (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,375);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 376;BA.debugLine="If File.ExternalWritable = False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"getExternalWritable"),parent.__c.getField(true,"False"))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 379;BA.debugLine="Else If MCode.PImei.SdkVersion >= 26 And apkupdt.";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("g",parent._mcode._pimei /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 26)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_canrequestpackageinstalls" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 5;
}else 
{ BA.debugLineNum = 387;BA.debugLine="Else If apkupdt.CheckNonMarketAppsEnabled = False";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_checknonmarketappsenabled" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 377;BA.debugLine="MsgboxAsync(\"Storage card not available. Make su";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Storage card not available. Make sure that your device is not connected in USB storage mode.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),__ref.getField(false, "ba"));
 BA.debugLineNum = 378;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 10;
 BA.debugLineNum = 380;BA.debugLine="MsgboxAsync(\"Please allow me to install applicat";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please allow me to install applications.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),__ref.getField(false, "ba"));
 BA.debugLineNum = 381;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_submenu1", "checkinstallationrequirements"), null);
this.state = 11;
return;
case 11:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 382;BA.debugLine="Dim in As Intent";
Debug.ShouldStop(536870912);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 383;BA.debugLine="in.Initialize(\"android.settings.MANAGE_UNKNOWN_A";
Debug.ShouldStop(1073741824);
_in.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.settings.MANAGE_UNKNOWN_APP_SOURCES")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("package:"),parent.__c.getField(false,"Application").runMethod(true,"getPackageName"))));
 BA.debugLineNum = 384;BA.debugLine="StartActivity(in)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_in.getObject())));
 BA.debugLineNum = 385;BA.debugLine="Wait For Activity_Resume '<-- wait for Activity_";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","activity_resume", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_submenu1", "checkinstallationrequirements"), null);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 BA.debugLineNum = 386;BA.debugLine="Return apkupdt.CanRequestPackageInstalls";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_canrequestpackageinstalls" /*RemoteObject*/ )));return;};
 if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 388;BA.debugLine="MsgboxAsync(\"Please enable installation of non-m";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Please enable installation of non-market applications."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Under Settings - Security - Unknown sources"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Or Settings - Applications - Unknown sources")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),__ref.getField(false, "ba"));
 BA.debugLineNum = 390;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 392;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 394;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static void  _activity_resume(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim jobInternet As HttpJob";
cls_submenu1._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");__ref.setField("_jobinternet",cls_submenu1._jobinternet);
 //BA.debugLineNum = 3;BA.debugLine="Private p As Panel";
cls_submenu1._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_submenu1._p);
 //BA.debugLineNum = 4;BA.debugLine="Private pnl_bk As Panel";
cls_submenu1._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_submenu1._pnl_bk);
 //BA.debugLineNum = 5;BA.debugLine="Private mdl As Object";
cls_submenu1._mdl = RemoteObject.createNew ("Object");__ref.setField("_mdl",cls_submenu1._mdl);
 //BA.debugLineNum = 6;BA.debugLine="Private lbl_Login As Label";
cls_submenu1._lbl_login = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_login",cls_submenu1._lbl_login);
 //BA.debugLineNum = 7;BA.debugLine="Private lblVertion As Label";
cls_submenu1._lblvertion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvertion",cls_submenu1._lblvertion);
 //BA.debugLineNum = 8;BA.debugLine="Private pnl_CallSuport As Panel";
cls_submenu1._pnl_callsuport = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_callsuport",cls_submenu1._pnl_callsuport);
 //BA.debugLineNum = 9;BA.debugLine="Private Pnl_Exit As Panel";
cls_submenu1._pnl_exit = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_exit",cls_submenu1._pnl_exit);
 //BA.debugLineNum = 11;BA.debugLine="Private pnl_GetData As Panel";
cls_submenu1._pnl_getdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_getdata",cls_submenu1._pnl_getdata);
 //BA.debugLineNum = 12;BA.debugLine="Private Pnl_SendData As Panel";
cls_submenu1._pnl_senddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_senddata",cls_submenu1._pnl_senddata);
 //BA.debugLineNum = 13;BA.debugLine="Private pnl_NewSefaresh As Panel";
cls_submenu1._pnl_newsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_newsefaresh",cls_submenu1._pnl_newsefaresh);
 //BA.debugLineNum = 14;BA.debugLine="Private pnl_AddNewMoshtari As Panel";
cls_submenu1._pnl_addnewmoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_addnewmoshtari",cls_submenu1._pnl_addnewmoshtari);
 //BA.debugLineNum = 15;BA.debugLine="Private pnlSendTiket As Panel";
cls_submenu1._pnlsendtiket = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlsendtiket",cls_submenu1._pnlsendtiket);
 //BA.debugLineNum = 16;BA.debugLine="Private pnl_Elanat As Panel";
cls_submenu1._pnl_elanat = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_elanat",cls_submenu1._pnl_elanat);
 //BA.debugLineNum = 17;BA.debugLine="Private pnl_Reports As Panel";
cls_submenu1._pnl_reports = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_reports",cls_submenu1._pnl_reports);
 //BA.debugLineNum = 18;BA.debugLine="Private pnl_Backup As Panel";
cls_submenu1._pnl_backup = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_backup",cls_submenu1._pnl_backup);
 //BA.debugLineNum = 19;BA.debugLine="Private PnlChangeCompany As Panel";
cls_submenu1._pnlchangecompany = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlchangecompany",cls_submenu1._pnlchangecompany);
 //BA.debugLineNum = 20;BA.debugLine="Private BackInfo As Panel";
cls_submenu1._backinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_backinfo",cls_submenu1._backinfo);
 //BA.debugLineNum = 21;BA.debugLine="Dim apkupdt As cl_appupdate";
cls_submenu1._apkupdt = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cl_appupdate");__ref.setField("_apkupdt",cls_submenu1._apkupdt);
 //BA.debugLineNum = 22;BA.debugLine="Dim VerFlag As String=\"checkupdate\"";
cls_submenu1._verflag = BA.ObjectToString("checkupdate");__ref.setField("_verflag",cls_submenu1._verflag);
 //BA.debugLineNum = 24;BA.debugLine="Private Pnl_Video As Panel";
cls_submenu1._pnl_video = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_video",cls_submenu1._pnl_video);
 //BA.debugLineNum = 25;BA.debugLine="Private lblEditNumber As Label";
cls_submenu1._lbleditnumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbleditnumber",cls_submenu1._lbleditnumber);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _download(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Download (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,452);
if (RapidSub.canDelegate("download")) { __ref.runUserSub(false, "cls_submenu1","download", __ref); return;}
ResumableSub_Download rsub = new ResumableSub_Download(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Download extends BA.ResumableSub {
public ResumableSub_Download(ir.parsikhesab.pakhsh.cls_submenu1 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
RemoteObject _result1 = RemoteObject.createImmutable(0);
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Download (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,452);
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
 BA.debugLineNum = 453;BA.debugLine="Try";
Debug.ShouldStop(16);
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 BA.debugLineNum = 454;BA.debugLine="Msgbox2Async(\"\" & CRLF & \"آیا از اطلاعات فعلی فا";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟")))),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("انصراف")),(Object)(BA.ObjectToString("خیر")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 455;BA.debugLine="Wait For Msgbox_Result(Result1 As Int)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_submenu1", "download"), null);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result1 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result1", _result1);
;
 BA.debugLineNum = 456;BA.debugLine="If Result1=DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result1,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 457;BA.debugLine="MCode.CreateBK(\"\")";
Debug.ShouldStop(256);
parent._mcode.runVoidMethod ("_createbk" /*void*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 458;BA.debugLine="Dim p1 As PhoneIntents";
Debug.ShouldStop(512);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 459;BA.debugLine="StartActivity(p1.OpenBrowser(MCode.LinkDownload";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_p1.runMethod(false,"OpenBrowser",(Object)(parent._mcode._linkdownload /*RemoteObject*/ )))));
 if (true) break;

case 7:
//C
this.state = 10;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 BA.debugLineNum = 463;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","5112197643",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 465;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_submenu1","getheight", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Return pnl_bk.Height";
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
public static RemoteObject  _getpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPanel (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_submenu1","getpanel", __ref);}
 BA.debugLineNum = 64;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(1);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 66;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getversion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetVersion (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("getversion")) { return __ref.runUserSub(false, "cls_submenu1","getversion", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 398;BA.debugLine="Sub GetVersion";
Debug.ShouldStop(8192);
 BA.debugLineNum = 399;BA.debugLine="jobInternet.JobName =\"GetVersion\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_jobinternet" /*RemoteObject*/ ).setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetVersion"));
 BA.debugLineNum = 401;BA.debugLine="Dim str As String=\"parsiknew-\"&MCode.TypeVersion";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(RemoteObject.createImmutable("parsiknew-"),cls_submenu1._mcode._typeversion /*RemoteObject*/ );Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 402;BA.debugLine="If MCode.PrinterType=1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._printertype /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 403;BA.debugLine="str=\"parsikPos\"";
Debug.ShouldStop(262144);
_str = BA.ObjectToString("parsikPos");Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 406;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jobinternet" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),cls_submenu1._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/Version"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),cls_submenu1._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &Type="),_str)));
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
public static RemoteObject  _hidemenu(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideMenu (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("hidemenu")) { return __ref.runUserSub(false, "cls_submenu1","hidemenu", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Private Sub HideMenu";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="CallSubDelayed(mdl,\"BtnBackMenu_Click\")";
Debug.ShouldStop(32);
cls_submenu1.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mdl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("BtnBackMenu_Click")));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _ref,RemoteObject _with) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_submenu1","initialize", __ref, _ba, _ref, _with);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _dt = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("ref", _ref);
Debug.locals.put("with", _with);
 BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize(ref As Object,with As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="mdl = ref";
Debug.ShouldStop(268435456);
__ref.setField ("_mdl" /*RemoteObject*/ ,_ref);
 BA.debugLineNum = 31;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 32;BA.debugLine="p.SetLayout(0,0,with,100%y)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_with),(Object)(cls_submenu1.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 33;BA.debugLine="p.LoadLayout(\"l_MenuItems\")";
Debug.ShouldStop(1);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_MenuItems")),__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="apkupdt.Initialize(Me,\"update\")";
Debug.ShouldStop(2);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("update")));
 BA.debugLineNum = 35;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(4);
__ref.getField(false,"_jobinternet" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("jobInternet")),(Object)(__ref));
 BA.debugLineNum = 36;BA.debugLine="apkupdt.Verbose = True";
Debug.ShouldStop(8);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setverbose",cls_submenu1.__c.getField(true,"True"));
 BA.debugLineNum = 37;BA.debugLine="VerFlag=\"checkupdate\"";
Debug.ShouldStop(16);
__ref.setField ("_verflag" /*RemoteObject*/ ,BA.ObjectToString("checkupdate"));
 BA.debugLineNum = 38;BA.debugLine="pnl_bk.Tag=False";
Debug.ShouldStop(32);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(false,"setTag",(cls_submenu1.__c.getField(true,"False")));
 BA.debugLineNum = 39;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(64);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_submenu1._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 40;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(128);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 43;BA.debugLine="lblVertion.Text = Application.VersionName";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblvertion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_submenu1.__c.getField(false,"Application").runMethod(true,"getVersionName")));
 BA.debugLineNum = 44;BA.debugLine="lblEditNumber.Text=\"نسخه ویرایش: \" &MCode.NumberV";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbleditnumber" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نسخه ویرایش: "),cls_submenu1._mcode._numberversion /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="If MCode.HaveShift = True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._haveshift /*RemoteObject*/ ,cls_submenu1.__c.getField(true,"True"))) { 
 BA.debugLineNum = 46;BA.debugLine="Dim Dt As String=myCode.getSetting(\"OUT.dat\",\"in";
Debug.ShouldStop(8192);
_dt = cls_submenu1._mycode.runMethod(true,"_getsetting" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("OUT.dat")),(Object)(BA.ObjectToString("input")),(Object)(BA.NumberToString(0)));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 47;BA.debugLine="Select Case Dt";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(_dt,BA.NumberToString(0),BA.NumberToString(1))) {
case 0: {
 BA.debugLineNum = 49;BA.debugLine="Pnl_SendData.Enabled=False";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnl_senddata" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_submenu1.__c.getField(true,"False"));
 BA.debugLineNum = 50;BA.debugLine="pnl_NewSefaresh.Enabled=False";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnl_newsefaresh" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_submenu1.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="pnl_Reports.Enabled=False";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnl_reports" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_submenu1.__c.getField(true,"False"));
 break; }
case 1: {
 BA.debugLineNum = 53;BA.debugLine="Pnl_SendData.Enabled=True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pnl_senddata" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_submenu1.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="pnl_NewSefaresh.Enabled=True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnl_newsefaresh" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_submenu1.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="pnl_Reports.Enabled=True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnl_reports" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_submenu1.__c.getField(true,"True"));
 break; }
}
;
 };
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,432);
if (RapidSub.canDelegate("jobdone")) { return __ref.runUserSub(false, "cls_submenu1","jobdone", __ref, _job);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 432;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 433;BA.debugLine="Job.GetRequest.Timeout=50000";
Debug.ShouldStop(65536);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 434;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(131072);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 435;BA.debugLine="Dim Str As String = Job.GetString";
Debug.ShouldStop(262144);
_str = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 436;BA.debugLine="Select Case Job.JobName";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("GetVersion"))) {
case 0: {
 BA.debugLineNum = 438;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 439;BA.debugLine="ToastMessageShow(\"امکان آپدیت نرم افزار وجود";
Debug.ShouldStop(4194304);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("امکان آپدیت نرم افزار وجود ندارد")),(Object)(cls_submenu1.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 441;BA.debugLine="LoadGetVersion(Str)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_loadgetversion" /*RemoteObject*/ ,(Object)(_str));
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 446;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
cls_submenu1.__c.runVoidMethod ("ProgressDialogHide");
 };
 BA.debugLineNum = 449;BA.debugLine="jobInternet.Release";
Debug.ShouldStop(1);
__ref.getField(false,"_jobinternet" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
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
public static RemoteObject  _loadgetversion(RemoteObject __ref,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetVersion (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,409);
if (RapidSub.canDelegate("loadgetversion")) { return __ref.runUserSub(false, "cls_submenu1","loadgetversion", __ref, _str);}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 409;BA.debugLine="Sub LoadGetVersion(Str As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 410;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(33554432);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 411;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(67108864);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 412;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(134217728);
cls_submenu1._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 413;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(268435456);
_rowslist = cls_submenu1._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 414;BA.debugLine="Row=RowsList.Get(0)";
Debug.ShouldStop(536870912);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 415;BA.debugLine="MCode.NewVersion = Row.Get(\"FldVersion\")";
Debug.ShouldStop(1073741824);
cls_submenu1._mcode._newversion /*RemoteObject*/  = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldVersion")))));
 BA.debugLineNum = 416;BA.debugLine="MCode.LinkDownload = Row.Get(\"FldLink\")";
Debug.ShouldStop(-2147483648);
cls_submenu1._mcode._linkdownload /*RemoteObject*/  = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldLink")))));
 BA.debugLineNum = 417;BA.debugLine="If VerFlag=\"Download\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_verflag" /*RemoteObject*/ ),BA.ObjectToString("Download"))) { 
 BA.debugLineNum = 418;BA.debugLine="Download";
Debug.ShouldStop(2);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_download" /*void*/ );
 }else {
 BA.debugLineNum = 420;BA.debugLine="If MCode.NewVersion>MCode.Version Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, cls_submenu1._mcode._newversion /*RemoteObject*/ ),BA.numberCast(double.class, cls_submenu1._mcode._version /*RemoteObject*/ ))) { 
 BA.debugLineNum = 421;BA.debugLine="If VerFlag=\"update\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_verflag" /*RemoteObject*/ ),BA.ObjectToString("update"))) { 
 BA.debugLineNum = 422;BA.debugLine="UpdateApp";
Debug.ShouldStop(32);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_updateapp" /*RemoteObject*/ );
 };
 BA.debugLineNum = 424;BA.debugLine="If VerFlag=\"checkupdate\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_verflag" /*RemoteObject*/ ),BA.ObjectToString("checkupdate"))) { 
 BA.debugLineNum = 425;BA.debugLine="ToastMessageShow(\"نسخه جدید موجود است لطفا برو";
Debug.ShouldStop(256);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نسخه جدید موجود است لطفا بروزرسانی کنید")),(Object)(cls_submenu1.__c.getField(true,"True")));
 };
 }else {
 BA.debugLineNum = 428;BA.debugLine="ToastMessageShow(\"شما از آخرین ورژن استفاده می";
Debug.ShouldStop(2048);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شما از آخرین ورژن استفاده می کنید")),(Object)(cls_submenu1.__c.getField(true,"True")));
 };
 };
 BA.debugLineNum = 431;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_addnewmoshtari_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_AddNewMoshtari_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("pnl_addnewmoshtari_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_addnewmoshtari_click", __ref);}
 BA.debugLineNum = 168;BA.debugLine="Sub pnl_AddNewMoshtari_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="HideMenu";
Debug.ShouldStop(256);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 170;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 171;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(1024);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 172;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 174;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 175;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(16384);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 176;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 178;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("<",cls_submenu1._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 179;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
Debug.ShouldStop(262144);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 180;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 182;BA.debugLine="StartActivity(Act_NewAshkhas)";
Debug.ShouldStop(2097152);
cls_submenu1.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_newashkhas.getObject())));
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_backup_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_Backup_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("pnl_backup_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_backup_click", __ref);}
 BA.debugLineNum = 244;BA.debugLine="Sub pnl_Backup_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 245;BA.debugLine="HideMenu";
Debug.ShouldStop(1048576);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 246;BA.debugLine="CallSubDelayed(Act_Main,\"OpenBackUpPnl\")";
Debug.ShouldStop(2097152);
cls_submenu1.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_main.getObject())),(Object)(RemoteObject.createImmutable("OpenBackUpPnl")));
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_callsuport_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_CallSuport_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("pnl_callsuport_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_callsuport_click", __ref);}
 BA.debugLineNum = 226;BA.debugLine="Sub pnl_CallSuport_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="HideMenu";
Debug.ShouldStop(4);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 228;BA.debugLine="StartActivity(Act_Support)";
Debug.ShouldStop(8);
cls_submenu1.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_support.getObject())));
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_downloadlastversion_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_DownloadLastVersion_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,466);
if (RapidSub.canDelegate("pnl_downloadlastversion_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_downloadlastversion_click", __ref);}
 BA.debugLineNum = 466;BA.debugLine="Private Sub pnl_DownloadLastVersion_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 467;BA.debugLine="VerFlag=\"Download\"";
Debug.ShouldStop(262144);
__ref.setField ("_verflag" /*RemoteObject*/ ,BA.ObjectToString("Download"));
 BA.debugLineNum = 468;BA.debugLine="GetVersion";
Debug.ShouldStop(524288);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_getversion" /*RemoteObject*/ );
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_elanat_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_Elanat_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("pnl_elanat_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_elanat_click", __ref);}
 BA.debugLineNum = 187;BA.debugLine="Sub pnl_Elanat_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="HideMenu";
Debug.ShouldStop(134217728);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 189;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 190;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(536870912);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 191;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 193;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 194;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(2);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 195;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 197;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",cls_submenu1._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 198;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
Debug.ShouldStop(32);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 199;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 201;BA.debugLine="StartActivity(Act_Notif)";
Debug.ShouldStop(256);
cls_submenu1.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_notif.getObject())));
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_exit_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Pnl_Exit_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("pnl_exit_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_exit_click", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 231;BA.debugLine="Sub Pnl_Exit_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="HideMenu";
Debug.ShouldStop(128);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 233;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(256);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 234;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(512);
_jo.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 235;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
Debug.ShouldStop(1024);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("finishAffinity")),(Object)((cls_submenu1.__c.getField(false,"Null"))));
 BA.debugLineNum = 236;BA.debugLine="ExitApplication";
Debug.ShouldStop(2048);
cls_submenu1.__c.runVoidMethod ("ExitApplication");
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
public static RemoteObject  _pnl_getdata_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_GetData_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("pnl_getdata_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_getdata_click", __ref);}
 BA.debugLineNum = 88;BA.debugLine="Sub pnl_GetData_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="HideMenu";
Debug.ShouldStop(16777216);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="CallSubDelayed(Act_Main,\"pnlGetData_Click\")";
Debug.ShouldStop(256);
cls_submenu1.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_main.getObject())),(Object)(RemoteObject.createImmutable("pnlGetData_Click")));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_newsefaresh_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_NewSefaresh_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("pnl_newsefaresh_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_newsefaresh_click", __ref);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 117;BA.debugLine="Sub pnl_NewSefaresh_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="HideMenu";
Debug.ShouldStop(2097152);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 119;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 120;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(8388608);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 121;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 123;BA.debugLine="If	MCode.Visitor=\"0\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._visitor /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 124;BA.debugLine="ToastMessageShow(\"این بخش مربوط به نسخه ویزیتور";
Debug.ShouldStop(134217728);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 125;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 127;BA.debugLine="Dim Cu As Cursor";
Debug.ShouldStop(1073741824);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 128;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
Debug.ShouldStop(-2147483648);
_cu = cls_submenu1._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 129;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(1);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 130;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
Debug.ShouldStop(2);
cls_submenu1.__c.runVoidMethod ("LogImpl","5110755853",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),0);
 BA.debugLineNum = 131;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" Th";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 132;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بعد";
Debug.ShouldStop(8);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 133;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 135;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 136;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(128);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 137;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 139;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",cls_submenu1._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 140;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
Debug.ShouldStop(2048);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 141;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 148;BA.debugLine="Cu=MCode.Result(\"Select * From TblKala\")";
Debug.ShouldStop(524288);
_cu = cls_submenu1._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblKala")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 149;BA.debugLine="If Cu.RowCount=0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 150;BA.debugLine="ToastMessageShow(\"لیست کالا به درستی دریافت نشده";
Debug.ShouldStop(2097152);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لیست کالا به درستی دریافت نشده است")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 151;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 153;BA.debugLine="Cu=MCode.Result(\"Select * From TblGoroohKala\")";
Debug.ShouldStop(16777216);
_cu = cls_submenu1._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblGoroohKala")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 154;BA.debugLine="If Cu.RowCount=0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 155;BA.debugLine="ToastMessageShow(\"جدول گروه کالا به درستی دریافت";
Debug.ShouldStop(67108864);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("جدول گروه کالا به درستی دریافت نشده است")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 156;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 158;BA.debugLine="Cu=MCode.Result(\"Select * From TblTasvie\")";
Debug.ShouldStop(536870912);
_cu = cls_submenu1._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblTasvie")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 159;BA.debugLine="If Cu.RowCount=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 160;BA.debugLine="ToastMessageShow(\"جدول تسویه حساب به درستی دریاف";
Debug.ShouldStop(-2147483648);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("جدول تسویه حساب به درستی دریافت نشده است")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 161;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 164;BA.debugLine="MCode.Action=\"SabtFaktor\"";
Debug.ShouldStop(8);
cls_submenu1._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtFaktor");
 BA.debugLineNum = 165;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(16);
cls_submenu1.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_kaladefault.getObject())));
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_printsetting_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_PrintSetting_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("pnl_printsetting_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_printsetting_click", __ref);}
 BA.debugLineNum = 221;BA.debugLine="Sub pnl_PrintSetting_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="HideMenu";
Debug.ShouldStop(536870912);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_reports_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_Reports_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("pnl_reports_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_reports_click", __ref);}
 BA.debugLineNum = 204;BA.debugLine="Sub pnl_Reports_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="HideMenu";
Debug.ShouldStop(4096);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 206;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 207;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(16384);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 208;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 210;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 211;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(262144);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 212;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 214;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",cls_submenu1._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 215;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
Debug.ShouldStop(4194304);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 216;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 218;BA.debugLine="StartActivity(Act_Choose_Report)";
Debug.ShouldStop(33554432);
cls_submenu1.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_choose_report.getObject())));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_senddata_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Pnl_SendData_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("pnl_senddata_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_senddata_click", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Sub Pnl_SendData_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="HideMenu";
Debug.ShouldStop(4096);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 110;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 111;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(16384);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 112;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 114;BA.debugLine="StartActivity(Act_SendData)";
Debug.ShouldStop(131072);
cls_submenu1.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_senddata.getObject())));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _pnl_updateapk_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_updateApk_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("pnl_updateapk_click")) { __ref.runUserSub(false, "cls_submenu1","pnl_updateapk_click", __ref); return;}
ResumableSub_pnl_updateApk_Click rsub = new ResumableSub_pnl_updateApk_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_pnl_updateApk_Click extends BA.ResumableSub {
public ResumableSub_pnl_updateApk_Click(ir.parsikhesab.pakhsh.cls_submenu1 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
RemoteObject _result1 = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("pnl_updateApk_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,270);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 271;BA.debugLine="HideMenu";
Debug.ShouldStop(16384);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 272;BA.debugLine="Msgbox2Async(\"\" & CRLF & \"آیا از اطلاعات فعلی فای";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟")))),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("انصراف")),(Object)(BA.ObjectToString("خیر")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 273;BA.debugLine="Wait For Msgbox_Result(Result1 As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_submenu1", "pnl_updateapk_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result1 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result1", _result1);
;
 BA.debugLineNum = 274;BA.debugLine="If Result1=DialogResponse.POSITIVE Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result1,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 275;BA.debugLine="MCode.CreateBK(\"\")";
Debug.ShouldStop(262144);
parent._mcode.runVoidMethod ("_createbk" /*void*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 276;BA.debugLine="CallSubDelayed(Act_Main,\"UpdateVersion\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((parent._act_main.getObject())),(Object)(RemoteObject.createImmutable("UpdateVersion")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _pnl_video_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Pnl_Video_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,471);
if (RapidSub.canDelegate("pnl_video_click")) { return __ref.runUserSub(false, "cls_submenu1","pnl_video_click", __ref);}
 BA.debugLineNum = 471;BA.debugLine="Private Sub Pnl_Video_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 472;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 473;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(16777216);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 474;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 476;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(134217728);
if (cls_submenu1._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,__ref.getField(false, "ba")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 477;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",cls_submenu1._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 478;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(536870912);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 479;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 481;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",cls_submenu1._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 482;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tru";
Debug.ShouldStop(2);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(cls_submenu1.__c.getField(true,"True")));
 BA.debugLineNum = 483;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 485;BA.debugLine="StartActivity(Act_Video)";
Debug.ShouldStop(16);
cls_submenu1.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_video.getObject())));
 }else {
 BA.debugLineNum = 487;BA.debugLine="ToastMessageShow(\"ارتباط اینترنت شما قطع میباشد\"";
Debug.ShouldStop(64);
cls_submenu1.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ارتباط اینترنت شما قطع میباشد")),(Object)(cls_submenu1.__c.getField(true,"False")));
 };
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
public static void  _pnlchangecompany_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PnlChangeCompany_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("pnlchangecompany_click")) { __ref.runUserSub(false, "cls_submenu1","pnlchangecompany_click", __ref); return;}
ResumableSub_PnlChangeCompany_Click rsub = new ResumableSub_PnlChangeCompany_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PnlChangeCompany_Click extends BA.ResumableSub {
public ResumableSub_PnlChangeCompany_Click(ir.parsikhesab.pakhsh.cls_submenu1 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PnlChangeCompany_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,251);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 252;BA.debugLine="Msgbox2Async(\"با تغییر فروشگاه اطلاعات فعلی حذف م";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("با تغییر فروشگاه اطلاعات فعلی حذف میگردد، لطفا قبل از تغییر فروشگاه نسبت به ارسال اطلاعات اطمینان حاصل فرمایید."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("آیا می خواهید فروشگاه را تغییر دهید؟")))),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 253;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_submenu1", "pnlchangecompany_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 254;BA.debugLine="If Result=DialogResponse.POSITIVE Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 255;BA.debugLine="Msgbox2Async(\"\" & CRLF & \"آیا از اطلاعات فعلی فا";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟")))),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("انصراف")),(Object)(BA.ObjectToString("خیر")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 256;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_submenu1", "pnlchangecompany_click"), null);
this.state = 10;
return;
case 10:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 257;BA.debugLine="If Result=DialogResponse.POSITIVE Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 258;BA.debugLine="MCode.CreateBK(\"\")";
Debug.ShouldStop(2);
parent._mcode.runVoidMethod ("_createbk" /*void*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 260;BA.debugLine="File.Delete(File.DirDefaultExternal &\"/Parsik\",\"";
Debug.ShouldStop(8);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("parsik_db.db")));
 BA.debugLineNum = 261;BA.debugLine="Sleep(200)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_submenu1", "pnlchangecompany_click"),BA.numberCast(int.class, 200));
this.state = 11;
return;
case 11:
//C
this.state = 8;
;
 BA.debugLineNum = 262;BA.debugLine="File.Copy(File.DirAssets,\"parsik_db.db\",File.Dir";
Debug.ShouldStop(32);
parent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("parsik_db.db")),(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("parsik_db.db")));
 BA.debugLineNum = 263;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((parent._main.getObject())));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 265;BA.debugLine="HideMenu";
Debug.ShouldStop(256);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static RemoteObject  _pnlsendtiket_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlSendTiket_Click (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("pnlsendtiket_click")) { return __ref.runUserSub(false, "cls_submenu1","pnlsendtiket_click", __ref);}
 BA.debugLineNum = 239;BA.debugLine="Sub pnlSendTiket_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="HideMenu";
Debug.ShouldStop(32768);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_hidemenu" /*RemoteObject*/ );
 BA.debugLineNum = 241;BA.debugLine="StartActivity(Act_Ticket)";
Debug.ShouldStop(65536);
cls_submenu1.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_submenu1._act_ticket.getObject())));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "cls_submenu1","refresh", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Public Sub Refresh";
Debug.ShouldStop(512);
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update_updatecomplete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("update_UpdateComplete (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("update_updatecomplete")) { return __ref.runUserSub(false, "cls_submenu1","update_updatecomplete", __ref);}
 BA.debugLineNum = 342;BA.debugLine="Sub update_UpdateComplete";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="LogColor($\"UpdateComplete - time: ${DateTime.Time";
Debug.ShouldStop(4194304);
cls_submenu1.__c.runVoidMethod ("LogImpl","5111869953",(RemoteObject.concat(RemoteObject.createImmutable("UpdateComplete - time: "),cls_submenu1.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cls_submenu1.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(cls_submenu1.__c.getField(false,"DateTime").runMethod(true,"getNow")))))),RemoteObject.createImmutable(""))),BA.numberCast(int.class, ((int)0xff556b2f)));
 BA.debugLineNum = 344;BA.debugLine="apkupdt.StopSplashScreen";
Debug.ShouldStop(8388608);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_stopsplashscreen" /*RemoteObject*/ );
 BA.debugLineNum = 346;BA.debugLine="Select apkupdt.Status";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_getstatus" /*RemoteObject*/ ),__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).getField(true,"_ok_curver" /*RemoteObject*/ ),__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).getField(true,"_ok_webver" /*RemoteObject*/ ),__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).getField(true,"_ok_newerapk" /*RemoteObject*/ ),__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).getField(true,"_no_newerapk" /*RemoteObject*/ ),__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).getField(true,"_ok_download" /*RemoteObject*/ ),__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).getField(true,"_ok_install" /*RemoteObject*/ ),__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).getField(true,"_err_noperm" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 348;BA.debugLine="Log($\"Running apk version: ${apkupdt.CurVN}${CR";
Debug.ShouldStop(134217728);
cls_submenu1.__c.runVoidMethod ("LogImpl","5111869958",(RemoteObject.concat(RemoteObject.createImmutable("Running apk version: "),cls_submenu1.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_getcurvn" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),cls_submenu1.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cls_submenu1.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""))),0);
 break; }
case 1: {
 BA.debugLineNum = 350;BA.debugLine="Log($\"Webserver apk version: ${apkupdt.WebVN}${";
Debug.ShouldStop(536870912);
cls_submenu1.__c.runVoidMethod ("LogImpl","5111869960",(RemoteObject.concat(RemoteObject.createImmutable("Webserver apk version: "),cls_submenu1.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_getwebvn" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),cls_submenu1.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cls_submenu1.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""))),0);
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 break; }
case 5: {
 break; }
case 6: {
 BA.debugLineNum = 362;BA.debugLine="Log(\"No permission to install\")";
Debug.ShouldStop(512);
cls_submenu1.__c.runVoidMethod ("LogImpl","5111869972",RemoteObject.createImmutable("No permission to install"),0);
 break; }
default: {
 break; }
}
;
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateapp(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateApp (cls_submenu1) ","cls_submenu1",91,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("updateapp")) { return __ref.runUserSub(false, "cls_submenu1","updateapp", __ref);}
 BA.debugLineNum = 281;BA.debugLine="Sub UpdateApp";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 283;BA.debugLine="apkupdt.PackageName = \"ir.parsikhesab.pakhsh\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setpackagename" /*RemoteObject*/ ,BA.ObjectToString("ir.parsikhesab.pakhsh"));
 BA.debugLineNum = 284;BA.debugLine="apkupdt.NewVerApk = MCode.LinkDownload";
Debug.ShouldStop(134217728);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setnewverapk",cls_submenu1._mcode._linkdownload /*RemoteObject*/ );
 BA.debugLineNum = 285;BA.debugLine="apkupdt.setCredentials(\"test\",\"test\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_apkupdt" /*RemoteObject*/ ).runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setcredentials" /*RemoteObject*/ ,(Object)(BA.ObjectToString("test")),(Object)(RemoteObject.createImmutable("test")));
 BA.debugLineNum = 286;BA.debugLine="ButtonUpdate_Click";
Debug.ShouldStop(536870912);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_buttonupdate_click" /*void*/ );
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}