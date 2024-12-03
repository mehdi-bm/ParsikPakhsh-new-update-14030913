package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,112);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","activity_create", _firsttime);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 112;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 115;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(262144);
act_main.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,act_main.mostCurrent.activityBA);
 BA.debugLineNum = 116;BA.debugLine="MCode.UpdateDataBase";
Debug.ShouldStop(524288);
act_main.mostCurrent._mcode.runVoidMethod ("_updatedatabase" /*RemoteObject*/ ,act_main.mostCurrent.activityBA);
 BA.debugLineNum = 117;BA.debugLine="MCode.UpdateSetting";
Debug.ShouldStop(1048576);
act_main.mostCurrent._mcode.runVoidMethod ("_updatesetting" /*RemoteObject*/ ,act_main.mostCurrent.activityBA);
 BA.debugLineNum = 118;BA.debugLine="gps.Initialize(\"gps\")";
Debug.ShouldStop(2097152);
act_main._gps.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("gps")));
 BA.debugLineNum = 120;BA.debugLine="sidemenu.Initialize(\"sidmenu\")";
Debug.ShouldStop(8388608);
act_main.mostCurrent._sidemenu.runVoidMethod ("Initialize",act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("sidmenu")));
 BA.debugLineNum = 121;BA.debugLine="sidemenu.Menu.LoadLayout(\"mainmenulyr\")";
Debug.ShouldStop(16777216);
act_main.mostCurrent._sidemenu.runMethod(false,"getMenu").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("mainmenulyr")),act_main.mostCurrent.activityBA);
 BA.debugLineNum = 122;BA.debugLine="sidemenu.Mode=sidemenu.RIGHT";
Debug.ShouldStop(33554432);
act_main.mostCurrent._sidemenu.runMethod(true,"setMode",act_main.mostCurrent._sidemenu.getField(true,"RIGHT"));
 BA.debugLineNum = 123;BA.debugLine="sidemenu.BehindOffset=33%x";
Debug.ShouldStop(67108864);
act_main.mostCurrent._sidemenu.runVoidMethod ("setBehindOffset",act_main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33)),act_main.mostCurrent.activityBA));
 BA.debugLineNum = 125;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
Debug.ShouldStop(268435456);
act_main.mostCurrent._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,act_main.processBA,(Object)(BA.ObjectToString("jobInternet")),(Object)(act_main.getObject()));
 BA.debugLineNum = 131;BA.debugLine="lblAppName.Text=MCode.AppName";
Debug.ShouldStop(4);
act_main.mostCurrent._lblappname.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent._mcode._appname /*RemoteObject*/ ));
 BA.debugLineNum = 132;BA.debugLine="If MCode.TypeVersion=\"Stable\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._typeversion /*RemoteObject*/ ,BA.ObjectToString("Stable"))) { 
 BA.debugLineNum = 133;BA.debugLine="apkupdt.Initialize(Me,\"update\")";
Debug.ShouldStop(16);
act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_initialize" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(act_main.getObject()),(Object)(RemoteObject.createImmutable("update")));
 BA.debugLineNum = 134;BA.debugLine="apkupdt.Verbose = True";
Debug.ShouldStop(32);
act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setverbose",act_main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 135;BA.debugLine="VerFlag=\"checkupdate\"";
Debug.ShouldStop(64);
act_main.mostCurrent._verflag = BA.ObjectToString("checkupdate");
 BA.debugLineNum = 136;BA.debugLine="btnCompare_Click";
Debug.ShouldStop(128);
_btncompare_click();
 BA.debugLineNum = 137;BA.debugLine="lblTypeVersion.Text=\"نوع نسخه : عمومی\"";
Debug.ShouldStop(256);
act_main.mostCurrent._lbltypeversion.runMethod(true,"setText",BA.ObjectToCharSequence("نوع نسخه : عمومی"));
 }else 
{ BA.debugLineNum = 138;BA.debugLine="Else if MCode.TypeVersion=\"UpdateNew\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._typeversion /*RemoteObject*/ ,BA.ObjectToString("UpdateNew"))) { 
 BA.debugLineNum = 139;BA.debugLine="lblTypeVersion.Text=\"نوع نسخه : اختصاصی\"";
Debug.ShouldStop(1024);
act_main.mostCurrent._lbltypeversion.runMethod(true,"setText",BA.ObjectToCharSequence("نوع نسخه : اختصاصی"));
 }}
;
 BA.debugLineNum = 142;BA.debugLine="If MCode.PrinterType=1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._printertype /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 143;BA.debugLine="apkupdt.Initialize(Me,\"update\")";
Debug.ShouldStop(16384);
act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_initialize" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(act_main.getObject()),(Object)(RemoteObject.createImmutable("update")));
 BA.debugLineNum = 144;BA.debugLine="apkupdt.Verbose = True";
Debug.ShouldStop(32768);
act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setverbose",act_main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 145;BA.debugLine="VerFlag=\"checkupdate\"";
Debug.ShouldStop(65536);
act_main.mostCurrent._verflag = BA.ObjectToString("checkupdate");
 BA.debugLineNum = 146;BA.debugLine="btnCompare_Click";
Debug.ShouldStop(131072);
_btncompare_click();
 BA.debugLineNum = 147;BA.debugLine="lblTypeVersion.Text=\"نوع نسخه : کارتخوان\"";
Debug.ShouldStop(262144);
act_main.mostCurrent._lbltypeversion.runMethod(true,"setText",BA.ObjectToCharSequence("نوع نسخه : کارتخوان"));
 };
 BA.debugLineNum = 150;BA.debugLine="Label2.Text=MCode.MenuTitle2";
Debug.ShouldStop(2097152);
act_main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent._mcode._menutitle2 /*RemoteObject*/ ));
 BA.debugLineNum = 152;BA.debugLine="subMenu1.Initialize(Me,pnlMenu.Width)";
Debug.ShouldStop(8388608);
act_main.mostCurrent._submenu1.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_initialize" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(act_main.getObject()),(Object)(act_main.mostCurrent._pnlmenu.runMethod(true,"getWidth")));
 BA.debugLineNum = 153;BA.debugLine="clv1.Add(subMenu1.Panel,subMenu1)";
Debug.ShouldStop(16777216);
act_main.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_main.mostCurrent._submenu1.runClassMethod (ir.parsikhesab.pakhsh.cls_submenu1.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)((act_main.mostCurrent._submenu1)));
 BA.debugLineNum = 155;BA.debugLine="pCantent.Initialize(\"\")";
Debug.ShouldStop(67108864);
act_main.mostCurrent._pcantent.runVoidMethod ("Initialize",act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 156;BA.debugLine="pCantent.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(134217728);
act_main.mostCurrent._pcantent.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_main.mostCurrent.activityBA)),(Object)(act_main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_main.mostCurrent.activityBA)));
 BA.debugLineNum = 157;BA.debugLine="Activity.AddView(pCantent,0,0,100%x,100%y)";
Debug.ShouldStop(268435456);
act_main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((act_main.mostCurrent._pcantent.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_main.mostCurrent.activityBA)),(Object)(act_main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_main.mostCurrent.activityBA)));
 BA.debugLineNum = 159;BA.debugLine="pCantent.LoadLayout(\"L_Body\")";
Debug.ShouldStop(1073741824);
act_main.mostCurrent._pcantent.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Body")),act_main.mostCurrent.activityBA);
 BA.debugLineNum = 168;BA.debugLine="lbl_Title.text = Application.LabelName";
Debug.ShouldStop(128);
act_main.mostCurrent._lbl_title.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName")));
 BA.debugLineNum = 169;BA.debugLine="pnl_body1.LoadLayout(\"L_CLV\")";
Debug.ShouldStop(256);
act_main.mostCurrent._pnl_body1.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_CLV")),act_main.mostCurrent.activityBA);
 BA.debugLineNum = 170;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 171;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1024);
_p.runVoidMethod ("Initialize",act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 172;BA.debugLine="p.SetLayout(0,0,pnl_body1.Width,120%y)";
Debug.ShouldStop(2048);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_main.mostCurrent._pnl_body1.runMethod(true,"getWidth")),(Object)(act_main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 120)),act_main.mostCurrent.activityBA)));
 BA.debugLineNum = 176;BA.debugLine="p.LoadLayout(\"L_HomeBody\")";
Debug.ShouldStop(32768);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_HomeBody")),act_main.mostCurrent.activityBA);
 BA.debugLineNum = 177;BA.debugLine="clvH.Add(p,0)";
Debug.ShouldStop(65536);
act_main.mostCurrent._clvh.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 179;BA.debugLine="HLV.Initializer(\"HLV\").GridView(2).Build";
Debug.ShouldStop(262144);
act_main.mostCurrent._hlv.runMethod(false,"Initializer",act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"GridView",(Object)(BA.numberCast(int.class, 2))).runVoidMethod ("Build");
 BA.debugLineNum = 180;BA.debugLine="ListItemHome.Initialize";
Debug.ShouldStop(524288);
act_main.mostCurrent._listitemhome.runVoidMethod ("Initialize");
 BA.debugLineNum = 181;BA.debugLine="ListTempItemHome.Initialize";
Debug.ShouldStop(1048576);
act_main.mostCurrent._listtempitemhome.runVoidMethod ("Initialize");
 BA.debugLineNum = 186;BA.debugLine="StartService(Service_Helper)";
Debug.ShouldStop(33554432);
act_main.mostCurrent.__c.runVoidMethod ("StartService",act_main.processBA,(Object)((act_main.mostCurrent._service_helper.getObject())));
 BA.debugLineNum = 191;BA.debugLine="CreateLabel(ASB1.LeftTopPnl,\"اتمام ویزیت\",xui.Cr";
Debug.ShouldStop(1073741824);
_createlabel(act_main.mostCurrent._asb1.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_getlefttoppnl" /*RemoteObject*/ ),BA.ObjectToString("اتمام ویزیت"),act_main.mostCurrent._xui.runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 192;BA.debugLine="CreateLabel(ASB1.RightBottomPnl,\"شروع ویزیت\",xui";
Debug.ShouldStop(-2147483648);
_createlabel(act_main.mostCurrent._asb1.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_getrightbottompnl" /*RemoteObject*/ ),BA.ObjectToString("شروع ویزیت"),act_main.mostCurrent._xui.runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 193;BA.debugLine="T_EnterExit.Initialize(\"T_EnterExit\",5000)";
Debug.ShouldStop(1);
act_main._t_enterexit.runVoidMethod ("Initialize",act_main.processBA,(Object)(BA.ObjectToString("T_EnterExit")),(Object)(BA.numberCast(long.class, 5000)));
 BA.debugLineNum = 194;BA.debugLine="T_Exit.Initialize(\"T_Exit\",1500)";
Debug.ShouldStop(2);
act_main._t_exit.runVoidMethod ("Initialize",act_main.processBA,(Object)(BA.ObjectToString("T_Exit")),(Object)(BA.numberCast(long.class, 1500)));
 BA.debugLineNum = 197;BA.debugLine="MCode.page=\"Act_Main\"";
Debug.ShouldStop(16);
act_main.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_Main");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e52) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e52.toString()); BA.debugLineNum = 200;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","51245272",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 201;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(256);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_KeyPress (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,913);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 913;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 914;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 915;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 916;BA.debugLine="If sidemenu.Visible Then";
Debug.ShouldStop(524288);
if (act_main.mostCurrent._sidemenu.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 917;BA.debugLine="sidemenu.HideMenus";
Debug.ShouldStop(1048576);
act_main.mostCurrent._sidemenu.runVoidMethod ("HideMenus");
 BA.debugLineNum = 918;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return act_main.mostCurrent.__c.getField(true,"True");
 }else 
{ BA.debugLineNum = 919;BA.debugLine="Else If PnlActivate.Visible Then";
Debug.ShouldStop(4194304);
if (act_main.mostCurrent._pnlactivate.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 920;BA.debugLine="PnlActivate.Visible=False";
Debug.ShouldStop(8388608);
act_main.mostCurrent._pnlactivate.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 921;BA.debugLine="MCode.AnimationClose(PnlActivate)";
Debug.ShouldStop(16777216);
act_main.mostCurrent._mcode.runVoidMethod ("_animationclose" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)((act_main.mostCurrent._pnlactivate.getObject())));
 BA.debugLineNum = 922;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) return act_main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 924;BA.debugLine="If IntExit = 1 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_main._intexit,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 926;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
act_main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 927;BA.debugLine="CloseActivities";
Debug.ShouldStop(1073741824);
_closeactivities();
 }else 
{ BA.debugLineNum = 928;BA.debugLine="Else if IntExit = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",act_main._intexit,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 929;BA.debugLine="IntExit = IntExit + 1";
Debug.ShouldStop(1);
act_main._intexit = BA.numberCast(byte.class, RemoteObject.solve(new RemoteObject[] {act_main._intexit,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 930;BA.debugLine="ToastMessageShow(\"برای خروج کلید Back را مجدد";
Debug.ShouldStop(2);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برای خروج کلید Back را مجدداً فشار دهید")),(Object)(act_main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 931;BA.debugLine="T_Exit.Enabled = True";
Debug.ShouldStop(4);
act_main._t_exit.runMethod(true,"setEnabled",act_main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 932;BA.debugLine="Return True";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return act_main.mostCurrent.__c.getField(true,"True");
 }}
;
 }}
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e23.toString()); BA.debugLineNum = 937;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","53407896",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 938;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(512);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_KeyPress"))));
 };
 BA.debugLineNum = 940;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return act_main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 941;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Pause (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,661);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 661;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 662;BA.debugLine="T_DataCheck.Enabled=False";
Debug.ShouldStop(2097152);
act_main._t_datacheck.runMethod(true,"setEnabled",act_main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 664;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Activity_PermissionResult (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1031);
if (RapidSub.canDelegate("activity_permissionresult")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","activity_permissionresult", _permission, _result);}
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 1031;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(64);
 BA.debugLineNum = 1032;BA.debugLine="If Permission=rp.PERMISSION_READ_PHONE_STATE Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_permission,act_main.mostCurrent._rp.getField(true,"PERMISSION_READ_PHONE_STATE"))) { 
 BA.debugLineNum = 1033;BA.debugLine="If Result=True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_result,act_main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1034;BA.debugLine="Log(\"---Get IMEI\")";
Debug.ShouldStop(512);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","53866627",RemoteObject.createImmutable("---Get IMEI"),0);
 BA.debugLineNum = 1035;BA.debugLine="If MCode.PImei.SdkVersion < 29 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",act_main.mostCurrent._mcode._pimei /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 29))) { 
 BA.debugLineNum = 1036;BA.debugLine="MCode.strImei = MCode.Imei.GetDeviceId";
Debug.ShouldStop(2048);
act_main.mostCurrent._mcode._strimei /*RemoteObject*/  = act_main.mostCurrent._mcode._imei /*RemoteObject*/ .runMethod(true,"GetDeviceId");
 BA.debugLineNum = 1037;BA.debugLine="lbl_MenuIMEI.Text=MCode.strImei";
Debug.ShouldStop(4096);
act_main.mostCurrent._lbl_menuimei.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent._mcode._strimei /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 1039;BA.debugLine="GetImei10";
Debug.ShouldStop(16384);
_getimei10();
 };
 }else {
 BA.debugLineNum = 1042;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_PHONE_STA";
Debug.ShouldStop(131072);
act_main.mostCurrent._rp.runVoidMethod ("CheckAndRequest",act_main.processBA,(Object)(act_main.mostCurrent._rp.getField(true,"PERMISSION_READ_PHONE_STATE")));
 };
 };
 BA.debugLineNum = 1045;BA.debugLine="If Permission=rp.PERMISSION_ACCESS_COARSE_LOCATIO";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_permission,act_main.mostCurrent._rp.getField(true,"PERMISSION_ACCESS_COARSE_LOCATION"))) { 
 BA.debugLineNum = 1046;BA.debugLine="If Result=True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_result,act_main.mostCurrent.__c.getField(true,"True"))) { 
 }else {
 BA.debugLineNum = 1050;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_";
Debug.ShouldStop(33554432);
act_main.mostCurrent._rp.runVoidMethod ("CheckAndRequest",act_main.processBA,(Object)(act_main.mostCurrent._rp.getField(true,"PERMISSION_ACCESS_COARSE_LOCATION")));
 };
 };
 BA.debugLineNum = 1053;BA.debugLine="If Permission=rp.PERMISSION_ACCESS_FINE_LOCATION";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_permission,act_main.mostCurrent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION"))) { 
 BA.debugLineNum = 1054;BA.debugLine="If Result=True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_result,act_main.mostCurrent.__c.getField(true,"True"))) { 
 }else {
 BA.debugLineNum = 1058;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LO";
Debug.ShouldStop(2);
act_main.mostCurrent._rp.runVoidMethod ("CheckAndRequest",act_main.processBA,(Object)(act_main.mostCurrent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 };
 };
 BA.debugLineNum = 1061;BA.debugLine="If Permission= rp.PERMISSION_CALL_PHONE Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_permission,act_main.mostCurrent._rp.getField(true,"PERMISSION_CALL_PHONE"))) { 
 BA.debugLineNum = 1062;BA.debugLine="Log(Result)";
Debug.ShouldStop(32);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","53866655",BA.ObjectToString(_result),0);
 BA.debugLineNum = 1063;BA.debugLine="If Result=True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_result,act_main.mostCurrent.__c.getField(true,"True"))) { 
 }else {
 BA.debugLineNum = 1067;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CALL_PHONE)";
Debug.ShouldStop(1024);
act_main.mostCurrent._rp.runVoidMethod ("CheckAndRequest",act_main.processBA,(Object)(act_main.mostCurrent._rp.getField(true,"PERMISSION_CALL_PHONE")));
 };
 };
 BA.debugLineNum = 1070;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Resume (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,424);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","activity_resume");}
 BA.debugLineNum = 424;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 425;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 426;BA.debugLine="lblVer.Text=\"نسخه \" & MCode.Version";
Debug.ShouldStop(512);
act_main.mostCurrent._lblver.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نسخه "),act_main.mostCurrent._mcode._version /*RemoteObject*/ )));
 BA.debugLineNum = 427;BA.debugLine="Lbl_DateVersion.Text=\"تاریخ نسخه \" & MCode.DateV";
Debug.ShouldStop(1024);
act_main.mostCurrent._lbl_dateversion.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تاریخ نسخه "),act_main.mostCurrent._mcode._dateversion /*RemoteObject*/ )));
 BA.debugLineNum = 428;BA.debugLine="lblVersion1.Text=MCode.Version";
Debug.ShouldStop(2048);
act_main.mostCurrent._lblversion1.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent._mcode._version /*RemoteObject*/ ));
 BA.debugLineNum = 429;BA.debugLine="lblVersionNumber1.Text=MCode.NumberVersion";
Debug.ShouldStop(4096);
act_main.mostCurrent._lblversionnumber1.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent._mcode._numberversion /*RemoteObject*/ ));
 BA.debugLineNum = 430;BA.debugLine="lblDateVersion1.Text=MCode.DateVersion";
Debug.ShouldStop(8192);
act_main.mostCurrent._lbldateversion1.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent._mcode._dateversion /*RemoteObject*/ ));
 BA.debugLineNum = 431;BA.debugLine="If MCode.TypeVersion=\"Stable\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._typeversion /*RemoteObject*/ ,BA.ObjectToString("Stable"))) { 
 BA.debugLineNum = 432;BA.debugLine="lblTypeVersion1.Text=\"عمومی\"";
Debug.ShouldStop(32768);
act_main.mostCurrent._lbltypeversion1.runMethod(true,"setText",BA.ObjectToCharSequence("عمومی"));
 }else 
{ BA.debugLineNum = 433;BA.debugLine="Else if MCode.TypeVersion=\"UpdateNew\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._typeversion /*RemoteObject*/ ,BA.ObjectToString("UpdateNew"))) { 
 BA.debugLineNum = 434;BA.debugLine="lblTypeVersion1.Text=\"اختصاصی\"";
Debug.ShouldStop(131072);
act_main.mostCurrent._lbltypeversion1.runMethod(true,"setText",BA.ObjectToCharSequence("اختصاصی"));
 }}
;
 BA.debugLineNum = 437;BA.debugLine="If MCode.PrinterType=1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._printertype /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 438;BA.debugLine="lblTypeVersion1.Text=\"کارت خوان\"";
Debug.ShouldStop(2097152);
act_main.mostCurrent._lbltypeversion1.runMethod(true,"setText",BA.ObjectToCharSequence("کارت خوان"));
 };
 BA.debugLineNum = 441;BA.debugLine="LoadPage";
Debug.ShouldStop(16777216);
_loadpage();
 BA.debugLineNum = 450;BA.debugLine="pnlTabligh.Visible=False";
Debug.ShouldStop(2);
act_main.mostCurrent._pnltabligh.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"False"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e18.toString()); BA.debugLineNum = 453;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52031645",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 454;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Resume"))));
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
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1527);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 1527;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1529;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) return act_main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1530;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asb1_reachedlefttop() throws Exception{
try {
		Debug.PushSubsStack("ASB1_ReachedLeftTop (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,498);
if (RapidSub.canDelegate("asb1_reachedlefttop")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","asb1_reachedlefttop");}
 BA.debugLineNum = 498;BA.debugLine="Sub ASB1_ReachedLeftTop";
Debug.ShouldStop(131072);
 BA.debugLineNum = 499;BA.debugLine="ModeEnterExit = False";
Debug.ShouldStop(262144);
act_main._modeenterexit = act_main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 501;BA.debugLine="ProgressDialogShow2(\"در حال ثبت خروج  \",False)";
Debug.ShouldStop(1048576);
act_main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال ثبت خروج  ")),(Object)(act_main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 502;BA.debugLine="SaveGps";
Debug.ShouldStop(2097152);
_savegps();
 BA.debugLineNum = 503;BA.debugLine="myCode.setSetting(\"OUT.dat\",\"input\",0)";
Debug.ShouldStop(4194304);
act_main.mostCurrent._mycode.runVoidMethod ("_setsetting" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString("OUT.dat")),(Object)(BA.ObjectToString("input")),(Object)(BA.NumberToString(0)));
 BA.debugLineNum = 504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _asb1_reachedrightbottom() throws Exception{
try {
		Debug.PushSubsStack("ASB1_ReachedRightBottom (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,488);
if (RapidSub.canDelegate("asb1_reachedrightbottom")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","asb1_reachedrightbottom"); return;}
ResumableSub_ASB1_ReachedRightBottom rsub = new ResumableSub_ASB1_ReachedRightBottom(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ASB1_ReachedRightBottom extends BA.ResumableSub {
public ResumableSub_ASB1_ReachedRightBottom(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ASB1_ReachedRightBottom (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,488);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 489;BA.debugLine="Sleep(100)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "asb1_reachedrightbottom"),BA.numberCast(int.class, 100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 490;BA.debugLine="ModeEnterExit = True";
Debug.ShouldStop(512);
parent._modeenterexit = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 491;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(1024);
parent.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 493;BA.debugLine="ProgressDialogShow2(\"در حال ثبت ورود  \",False)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال ثبت ورود  ")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 494;BA.debugLine="SaveGps";
Debug.ShouldStop(8192);
_savegps();
 BA.debugLineNum = 496;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _btn_lock_click() throws Exception{
try {
		Debug.PushSubsStack("btn_Lock_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1448);
if (RapidSub.canDelegate("btn_lock_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btn_lock_click");}
 BA.debugLineNum = 1448;BA.debugLine="Sub btn_Lock_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1449;BA.debugLine="PnlActivate.Visible=True";
Debug.ShouldStop(256);
act_main.mostCurrent._pnlactivate.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1450;BA.debugLine="MCode.AnimationOpen(PnlActivate)";
Debug.ShouldStop(512);
act_main.mostCurrent._mcode.runVoidMethod ("_animationopen" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)((act_main.mostCurrent._pnlactivate.getObject())));
 BA.debugLineNum = 1451;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_menu_click() throws Exception{
try {
		Debug.PushSubsStack("btn_menu_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,906);
if (RapidSub.canDelegate("btn_menu_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btn_menu_click");}
 BA.debugLineNum = 906;BA.debugLine="private Sub btn_menu_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 907;BA.debugLine="sidemenu.ShowSecondaryMenu";
Debug.ShouldStop(1024);
act_main.mostCurrent._sidemenu.runVoidMethod ("ShowSecondaryMenu");
 BA.debugLineNum = 908;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_search_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Search_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,909);
if (RapidSub.canDelegate("btn_search_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btn_search_click");}
 BA.debugLineNum = 909;BA.debugLine="private Sub Btn_Search_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 910;BA.debugLine="Button4_Click";
Debug.ShouldStop(8192);
_button4_click();
 BA.debugLineNum = 911;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackmenu_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBackMenu_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1129);
if (RapidSub.canDelegate("btnbackmenu_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btnbackmenu_click");}
 BA.debugLineNum = 1129;BA.debugLine="Sub BtnBackMenu_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 1130;BA.debugLine="sidemenu.HideMenus";
Debug.ShouldStop(512);
act_main.mostCurrent._sidemenu.runVoidMethod ("HideMenus");
 BA.debugLineNum = 1131;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnbackuppnl_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBackUpPnl_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1140);
if (RapidSub.canDelegate("btnbackuppnl_click")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btnbackuppnl_click"); return;}
ResumableSub_BtnBackUpPnl_Click rsub = new ResumableSub_BtnBackUpPnl_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnBackUpPnl_Click extends BA.ResumableSub {
public ResumableSub_BtnBackUpPnl_Click(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnBackUpPnl_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1140);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1141;BA.debugLine="If txtBackUpFile.Text<>\"\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._txtbackupfile.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1142;BA.debugLine="Sleep(200)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "btnbackuppnl_click"),BA.numberCast(int.class, 200));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 1143;BA.debugLine="MCode.CreateBK(txtBackUpFile.Text)";
Debug.ShouldStop(4194304);
parent.mostCurrent._mcode.runVoidMethod ("_createbk" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(parent.mostCurrent._txtbackupfile.runMethod(true,"getText")));
 BA.debugLineNum = 1144;BA.debugLine="ToastMessageShow(\"پشتیبان اطلاعات با موفقیت تهیه";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("پشتیبان اطلاعات با موفقیت تهیه شد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1145;BA.debugLine="pnlbak.Visible=False";
Debug.ShouldStop(16777216);
parent.mostCurrent._pnlbak.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1146;BA.debugLine="MCode.AnimationClose(pnlbak)";
Debug.ShouldStop(33554432);
parent.mostCurrent._mcode.runVoidMethod ("_animationclose" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)((parent.mostCurrent._pnlbak.getObject())));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1149;BA.debugLine="ToastMessageShow(\"لطفا نام فایل پشتیبانی را وارد";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا نام فایل پشتیبانی را وارد نمایید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1150;BA.debugLine="txtBackUpFile.SelectionStart=0";
Debug.ShouldStop(536870912);
parent.mostCurrent._txtbackupfile.runMethod(true,"setSelectionStart",BA.numberCast(int.class, 0));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1152;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _btncloseactivate_click() throws Exception{
try {
		Debug.PushSubsStack("btnCloseActivate_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1453);
if (RapidSub.canDelegate("btncloseactivate_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btncloseactivate_click");}
 BA.debugLineNum = 1453;BA.debugLine="Sub btnCloseActivate_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1454;BA.debugLine="PnlActivate.Visible=False";
Debug.ShouldStop(8192);
act_main.mostCurrent._pnlactivate.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1455;BA.debugLine="MCode.AnimationClose(PnlActivate)";
Debug.ShouldStop(16384);
act_main.mostCurrent._mcode.runVoidMethod ("_animationclose" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)((act_main.mostCurrent._pnlactivate.getObject())));
 BA.debugLineNum = 1456;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclosebackuppnl_click() throws Exception{
try {
		Debug.PushSubsStack("BtnCloseBackUpPnl_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1154);
if (RapidSub.canDelegate("btnclosebackuppnl_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btnclosebackuppnl_click");}
 BA.debugLineNum = 1154;BA.debugLine="Sub BtnCloseBackUpPnl_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 1155;BA.debugLine="pnlbak.Visible=False";
Debug.ShouldStop(4);
act_main.mostCurrent._pnlbak.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1156;BA.debugLine="MCode.AnimationClose(pnlbak)";
Debug.ShouldStop(8);
act_main.mostCurrent._mcode.runVoidMethod ("_animationclose" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)((act_main.mostCurrent._pnlbak.getObject())));
 BA.debugLineNum = 1157;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncompare_click() throws Exception{
try {
		Debug.PushSubsStack("btnCompare_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1234);
if (RapidSub.canDelegate("btncompare_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btncompare_click");}
 BA.debugLineNum = 1234;BA.debugLine="Sub btnCompare_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1235;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1236;BA.debugLine="VerFlag=\"checkupdate\"";
Debug.ShouldStop(524288);
act_main.mostCurrent._verflag = BA.ObjectToString("checkupdate");
 BA.debugLineNum = 1237;BA.debugLine="GetVersion";
Debug.ShouldStop(1048576);
_getversion();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e5.toString()); BA.debugLineNum = 1239;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","54784133",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1240;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8388608);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btnCompare_Click"))));
 };
 BA.debugLineNum = 1242;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndarkmode_click() throws Exception{
try {
		Debug.PushSubsStack("btnDarkMode_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1496);
if (RapidSub.canDelegate("btndarkmode_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btndarkmode_click");}
 BA.debugLineNum = 1496;BA.debugLine="Sub btnDarkMode_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1497;BA.debugLine="If MCode.DarkMode=\"True\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._darkmode /*RemoteObject*/ ,BA.ObjectToString("True"))) { 
 BA.debugLineNum = 1498;BA.debugLine="MCode.DarkMode=\"False\"";
Debug.ShouldStop(33554432);
act_main.mostCurrent._mcode._darkmode /*RemoteObject*/  = BA.ObjectToString("False");
 BA.debugLineNum = 1499;BA.debugLine="btnDarkMode.Text=Chr(0xE3A8)";
Debug.ShouldStop(67108864);
act_main.mostCurrent._btndarkmode.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe3a8))))));
 }else {
 BA.debugLineNum = 1502;BA.debugLine="MCode.DarkMode=\"True\"";
Debug.ShouldStop(536870912);
act_main.mostCurrent._mcode._darkmode /*RemoteObject*/  = BA.ObjectToString("True");
 BA.debugLineNum = 1503;BA.debugLine="btnDarkMode.Text=Chr(0xE3AA)";
Debug.ShouldStop(1073741824);
act_main.mostCurrent._btndarkmode.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe3aa))))));
 };
 BA.debugLineNum = 1506;BA.debugLine="SetColorItems";
Debug.ShouldStop(2);
_setcoloritems();
 BA.debugLineNum = 1507;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndwnld_click() throws Exception{
try {
		Debug.PushSubsStack("btnDwnld_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1246);
if (RapidSub.canDelegate("btndwnld_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btndwnld_click");}
 BA.debugLineNum = 1246;BA.debugLine="Sub btnDwnld_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1248;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 1249;BA.debugLine="apkupdt.DownloadApk  'send out command; async re";
Debug.ShouldStop(1);
act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_downloadapk" /*void*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e4.toString()); BA.debugLineNum = 1251;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","54849669",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1252;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btnDwnld_Click"))));
 };
 BA.debugLineNum = 1254;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btninstall_click() throws Exception{
try {
		Debug.PushSubsStack("btnInstall_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1258);
if (RapidSub.canDelegate("btninstall_click")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btninstall_click"); return;}
ResumableSub_btnInstall_Click rsub = new ResumableSub_btnInstall_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnInstall_Click extends BA.ResumableSub {
public ResumableSub_btnInstall_Click(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInstall_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1258);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1259;BA.debugLine="Try";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 1260;BA.debugLine="Wait For (CheckInstallationRequirements) Complet";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "btninstall_click"), _checkinstallationrequirements());
this.state = 7;
return;
case 7:
//C
this.state = 6;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1261;BA.debugLine="apkupdt.InstallApk(Result)  'send out command; a";
Debug.ShouldStop(4096);
parent.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_installapk" /*RemoteObject*/ ,(Object)(_result));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 1263;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","54915205",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1264;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32768);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btnInstall_Click"))));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1266;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e0.toString());}
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnno_click() throws Exception{
try {
		Debug.PushSubsStack("btnNo_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,715);
if (RapidSub.canDelegate("btnno_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btnno_click");}
 BA.debugLineNum = 715;BA.debugLine="Sub btnNo_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 716;BA.debugLine="DialogGetData.CloseDialog(DialogResponse.NEGATIVE";
Debug.ShouldStop(2048);
act_main.mostCurrent._dialoggetdata.runVoidMethod ("CloseDialog",act_main.mostCurrent.activityBA,(Object)(act_main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")));
 BA.debugLineNum = 717;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsendactivate_click() throws Exception{
try {
		Debug.PushSubsStack("btnSendActivate_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1465);
if (RapidSub.canDelegate("btnsendactivate_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btnsendactivate_click");}
RemoteObject _query = RemoteObject.createImmutable("");
 BA.debugLineNum = 1465;BA.debugLine="Sub btnSendActivate_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1466;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 1467;BA.debugLine="If txtCodeMoshtari.Text<>\"\" And txtNameVisitor.T";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",act_main.mostCurrent._txtcodemoshtari.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",act_main.mostCurrent._txtnamevisitor.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 1469;BA.debugLine="MCode.CodeMoshtari=txtCodeMoshtari.Text";
Debug.ShouldStop(268435456);
act_main.mostCurrent._mcode._codemoshtari /*RemoteObject*/  = act_main.mostCurrent._txtcodemoshtari.runMethod(true,"getText");
 BA.debugLineNum = 1470;BA.debugLine="MCode.N_Visitor=txtNameVisitor.Text";
Debug.ShouldStop(536870912);
act_main.mostCurrent._mcode._n_visitor /*RemoteObject*/  = act_main.mostCurrent._txtnamevisitor.runMethod(true,"getText");
 BA.debugLineNum = 1472;BA.debugLine="Dim Query As String=\"Update TblSetting Set FldT";
Debug.ShouldStop(-2147483648);
_query = RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set FldTokenId = '"),act_main.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable("',FldCodeMoshtari = '"),act_main.mostCurrent._txtcodemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable("',FldNameVisitor = '"),act_main.mostCurrent._txtnamevisitor.runMethod(true,"getText"),RemoteObject.createImmutable("'"));Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 1473;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(1);
act_main.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(_query));
 BA.debugLineNum = 1474;BA.debugLine="MCode.page=\"Act_Main\"";
Debug.ShouldStop(2);
act_main.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_Main");
 BA.debugLineNum = 1475;BA.debugLine="MCode.NoeGet=\"SendTokenId\"";
Debug.ShouldStop(4);
act_main.mostCurrent._mcode._noeget /*RemoteObject*/  = BA.ObjectToString("SendTokenId");
 BA.debugLineNum = 1477;BA.debugLine="StopService(FusedLocationService)";
Debug.ShouldStop(16);
act_main.mostCurrent.__c.runVoidMethod ("StopService",act_main.processBA,(Object)((act_main.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 1478;BA.debugLine="MCode.GpsIsEnable=False";
Debug.ShouldStop(32);
act_main.mostCurrent._mcode._gpsisenable /*RemoteObject*/  = act_main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1479;BA.debugLine="Log(\"Gps Stop\")";
Debug.ShouldStop(64);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","55701646",RemoteObject.createImmutable("Gps Stop"),0);
 BA.debugLineNum = 1481;BA.debugLine="StartService(Service_Server)";
Debug.ShouldStop(256);
act_main.mostCurrent.__c.runVoidMethod ("StartService",act_main.processBA,(Object)((act_main.mostCurrent._service_server.getObject())));
 BA.debugLineNum = 1484;BA.debugLine="PnlActivate.Visible=False";
Debug.ShouldStop(2048);
act_main.mostCurrent._pnlactivate.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1485;BA.debugLine="MCode.AnimationClose(PnlActivate)";
Debug.ShouldStop(4096);
act_main.mostCurrent._mcode.runVoidMethod ("_animationclose" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)((act_main.mostCurrent._pnlactivate.getObject())));
 }else {
 BA.debugLineNum = 1488;BA.debugLine="ToastMessageShow(\"لطفا فیلد های خالی را تکمیل ن";
Debug.ShouldStop(32768);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا فیلد های خالی را تکمیل نمایید")),(Object)(act_main.mostCurrent.__c.getField(true,"False")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e19.toString()); BA.debugLineNum = 1491;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","55701658",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1492;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(524288);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btnSendActivate_Click"))));
 };
 BA.debugLineNum = 1494;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsetting_click() throws Exception{
try {
		Debug.PushSubsStack("btnSetting_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1532);
if (RapidSub.canDelegate("btnsetting_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btnsetting_click");}
 BA.debugLineNum = 1532;BA.debugLine="Private Sub btnSetting_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1533;BA.debugLine="StartActivity(Act_Setting)";
Debug.ShouldStop(268435456);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_setting.getObject())));
 BA.debugLineNum = 1534;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnwebver_click() throws Exception{
try {
		Debug.PushSubsStack("btnWebVer_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1227);
if (RapidSub.canDelegate("btnwebver_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btnwebver_click");}
 BA.debugLineNum = 1227;BA.debugLine="Sub btnWebVer_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1229;BA.debugLine="apkupdt.ReadWebVN  'send out command; async resul";
Debug.ShouldStop(4096);
act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_readwebvn" /*void*/ );
 BA.debugLineNum = 1230;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnyes_click() throws Exception{
try {
		Debug.PushSubsStack("BtnYes_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,719);
if (RapidSub.canDelegate("btnyes_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","btnyes_click");}
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _dt = RemoteObject.createImmutable("");
 BA.debugLineNum = 719;BA.debugLine="Sub BtnYes_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 720;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 721;BA.debugLine="DialogGetData.CloseDialog(DialogResponse.POSITIV";
Debug.ShouldStop(65536);
act_main.mostCurrent._dialoggetdata.runVoidMethod ("CloseDialog",act_main.mostCurrent.activityBA,(Object)(act_main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")));
 BA.debugLineNum = 722;BA.debugLine="Log(\"pnlGetData_Click\")";
Debug.ShouldStop(131072);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52883587",RemoteObject.createImmutable("pnlGetData_Click"),0);
 BA.debugLineNum = 723;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian";
Debug.ShouldStop(262144);
_date = act_main.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(act_main.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_main.mostCurrent.activityBA)));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 724;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(524288);
_time = act_main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 725;BA.debugLine="Date = MCode.sf.Mid(Date,1,4) & \"/\" & MCode.sf.M";
Debug.ShouldStop(1048576);
_date = RemoteObject.concat(act_main.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_date),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),act_main.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_date),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),act_main.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_date),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("Date", _date);
 BA.debugLineNum = 726;BA.debugLine="Dim Dt As String = Date & \"   \" & Time";
Debug.ShouldStop(2097152);
_dt = RemoteObject.concat(_date,RemoteObject.createImmutable("   "),_time);Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 727;BA.debugLine="MCode.saveUpdate(\"Update TblSetting Set FldDateT";
Debug.ShouldStop(4194304);
act_main.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set FldDateTimeRecive = '"),_dt,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 728;BA.debugLine="ProgressDialogShow2(\"درحال دریافت اطلاعات...\",Fa";
Debug.ShouldStop(8388608);
act_main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("درحال دریافت اطلاعات...")),(Object)(act_main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 734;BA.debugLine="StopService(FusedLocationService)";
Debug.ShouldStop(536870912);
act_main.mostCurrent.__c.runVoidMethod ("StopService",act_main.processBA,(Object)((act_main.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 735;BA.debugLine="MCode.GpsIsEnable=False";
Debug.ShouldStop(1073741824);
act_main.mostCurrent._mcode._gpsisenable /*RemoteObject*/  = act_main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 736;BA.debugLine="Log(\"Gps Stop\")";
Debug.ShouldStop(-2147483648);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52883601",RemoteObject.createImmutable("Gps Stop"),0);
 BA.debugLineNum = 737;BA.debugLine="StopService(FirebaseMessaging)";
Debug.ShouldStop(1);
act_main.mostCurrent.__c.runVoidMethod ("StopService",act_main.processBA,(Object)((act_main.mostCurrent._firebasemessaging.getObject())));
 BA.debugLineNum = 738;BA.debugLine="Log(\"FirebaseMessaging Stop\")";
Debug.ShouldStop(2);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52883603",RemoteObject.createImmutable("FirebaseMessaging Stop"),0);
 BA.debugLineNum = 739;BA.debugLine="MCode.NoeGet=\"DaryaftEtlaat\"";
Debug.ShouldStop(4);
act_main.mostCurrent._mcode._noeget /*RemoteObject*/  = BA.ObjectToString("DaryaftEtlaat");
 BA.debugLineNum = 740;BA.debugLine="ProgressDialogShow2(\"نرم افزار درحال دریافت اطلا";
Debug.ShouldStop(8);
act_main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("نرم افزار درحال دریافت اطلاعات از سرور میباشد، لطفا تا پایان عملیات دریافت منتظر بمانید")),(Object)(act_main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 743;BA.debugLine="StartService(Service_Server)";
Debug.ShouldStop(64);
act_main.mostCurrent.__c.runVoidMethod ("StartService",act_main.processBA,(Object)((act_main.mostCurrent._service_server.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e19.toString()); BA.debugLineNum = 745;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52883610",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 746;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(512);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnYes_Click"))));
 };
 BA.debugLineNum = 748;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1072);
if (RapidSub.canDelegate("button1_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","button1_click");}
 BA.debugLineNum = 1072;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1074;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 1075;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(262144);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1076;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1078;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 1079;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
Debug.ShouldStop(4194304);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1080;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1082;BA.debugLine="StartActivity(Act_Notif)";
Debug.ShouldStop(33554432);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_notif.getObject())));
 BA.debugLineNum = 1083;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1085);
if (RapidSub.canDelegate("button2_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","button2_click");}
 BA.debugLineNum = 1085;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1087;BA.debugLine="StartActivity(Act_Support)";
Debug.ShouldStop(1073741824);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_support.getObject())));
 BA.debugLineNum = 1088;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1090);
if (RapidSub.canDelegate("button3_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","button3_click");}
 BA.debugLineNum = 1090;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 1092;BA.debugLine="StartActivity(Act_Ticket)";
Debug.ShouldStop(8);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_ticket.getObject())));
 BA.debugLineNum = 1093;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1106);
if (RapidSub.canDelegate("button4_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","button4_click");}
 BA.debugLineNum = 1106;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1108;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 1109;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 1110;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(2097152);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1111;BA.debugLine="Return";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1113;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("<",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 1114;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tru";
Debug.ShouldStop(33554432);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1115;BA.debugLine="Return";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1117;BA.debugLine="If	MCode.Visitor=\"0\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._visitor /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 1118;BA.debugLine="ToastMessageShow(\"این بخش مربوط به نسخه ویزیتور";
Debug.ShouldStop(536870912);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1119;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1121;BA.debugLine="KalaSearch";
Debug.ShouldStop(1);
_kalasearch();
 BA.debugLineNum = 1122;BA.debugLine="MCode.SetAnimation(\"zoom_enter1\", \"zoom_exit1\")";
Debug.ShouldStop(2);
act_main.mostCurrent._mcode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter1")),(Object)(RemoteObject.createImmutable("zoom_exit1")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e17.toString()); BA.debugLineNum = 1124;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","54194322",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 1126;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttonupdate_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonUpdate_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1269);
if (RapidSub.canDelegate("buttonupdate_click")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","buttonupdate_click"); return;}
ResumableSub_ButtonUpdate_Click rsub = new ResumableSub_ButtonUpdate_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonUpdate_Click extends BA.ResumableSub {
public ResumableSub_ButtonUpdate_Click(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonUpdate_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1269);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1270;BA.debugLine="Try";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 1272;BA.debugLine="Wait For (CheckInstallationRequirements) Complet";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "buttonupdate_click"), _checkinstallationrequirements());
this.state = 7;
return;
case 7:
//C
this.state = 6;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1274;BA.debugLine="apkupdt.SetAndStartSplashScreen(Activity,LoadBit";
Debug.ShouldStop(33554432);
parent.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setandstartsplashscreen" /*RemoteObject*/ ,(Object)(parent.mostCurrent._activity),(Object)(parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bg-update-parsik-splash.jpg")))));
 BA.debugLineNum = 1276;BA.debugLine="apkupdt.UpdateApk(Result) 'checks for newer apk,";
Debug.ShouldStop(134217728);
parent.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_updateapk" /*void*/ ,(Object)(_result));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 1278;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","54980745",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1279;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1073741824);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-ButtonUpdate_Click"))));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1281;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e0.toString());}
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
public static RemoteObject  _checkadmin() throws Exception{
try {
		Debug.PushSubsStack("CheckAdmin (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,254);
if (RapidSub.canDelegate("checkadmin")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","checkadmin");}
 BA.debugLineNum = 254;BA.debugLine="Public Sub CheckAdmin";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 255;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 256;BA.debugLine="If MCode.Admin=\"1\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._admin /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 257;BA.debugLine="pnl_smartphone.Visible=False";
Debug.ShouldStop(1);
act_main.mostCurrent._pnl_smartphone.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 258;BA.debugLine="pnl_map.Visible=True";
Debug.ShouldStop(2);
act_main.mostCurrent._pnl_map.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 259;BA.debugLine="If MCode.Tozie=0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._tozie /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 260;BA.debugLine="pnl_map.Top=pnl_smartphone.Top";
Debug.ShouldStop(8);
act_main.mostCurrent._pnl_map.runMethod(true,"setTop",act_main.mostCurrent._pnl_smartphone.runMethod(true,"getTop"));
 }else {
 BA.debugLineNum = 262;BA.debugLine="pnl_map.Top=pnl_Havale.Top";
Debug.ShouldStop(32);
act_main.mostCurrent._pnl_map.runMethod(true,"setTop",act_main.mostCurrent._pnl_havale.runMethod(true,"getTop"));
 BA.debugLineNum = 263;BA.debugLine="pnl_map.Left=pnl_Havale.Left+43%x";
Debug.ShouldStop(64);
act_main.mostCurrent._pnl_map.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {act_main.mostCurrent._pnl_havale.runMethod(true,"getLeft"),act_main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 43)),act_main.mostCurrent.activityBA)}, "+",1, 1));
 };
 }else {
 BA.debugLineNum = 267;BA.debugLine="pnl_smartphone.Visible=False";
Debug.ShouldStop(1024);
act_main.mostCurrent._pnl_smartphone.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 268;BA.debugLine="pnl_map.Visible=False";
Debug.ShouldStop(2048);
act_main.mostCurrent._pnl_map.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"False"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e16.toString()); BA.debugLineNum = 271;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","51572881",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 272;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32768);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-CheckAdmin"))));
 };
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkgettourvisitortoday() throws Exception{
try {
		Debug.PushSubsStack("CheckGetTourVisitorToday (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,312);
if (RapidSub.canDelegate("checkgettourvisitortoday")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","checkgettourvisitortoday");}
RemoteObject _count = RemoteObject.createImmutable(0);
 BA.debugLineNum = 312;BA.debugLine="Sub CheckGetTourVisitorToday";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 314;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 315;BA.debugLine="Return";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 317;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 318;BA.debugLine="Return";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 320;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 321;BA.debugLine="Return";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 324;BA.debugLine="If MCode.TourVisit=1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._tourvisit /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 325;BA.debugLine="Dim count As Int=MCode.SingleResult($\"Select Co";
Debug.ShouldStop(16);
_count = BA.numberCast(int.class, act_main.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Count(Id) from tblTourVisitor where fldDateVisit="),act_main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_main.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_main.mostCurrent.activityBA)))),RemoteObject.createImmutable(""))))));Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 326;BA.debugLine="If count=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 327;BA.debugLine="ProgressDialogShow(\"جهت دریافت لیست تور های جدی";
Debug.ShouldStop(64);
act_main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("جهت دریافت لیست تور های جدید لطفا چند لحظه صبر کنید..."))));
 BA.debugLineNum = 328;BA.debugLine="MCode.NoeGet=\"GetTourVisitor\"";
Debug.ShouldStop(128);
act_main.mostCurrent._mcode._noeget /*RemoteObject*/  = BA.ObjectToString("GetTourVisitor");
 BA.debugLineNum = 329;BA.debugLine="CallSubDelayed(Service_Server,\"GetTourVisitor";
Debug.ShouldStop(256);
act_main.mostCurrent.__c.runVoidMethod ("CallSubDelayed",act_main.processBA,(Object)((act_main.mostCurrent._service_server.getObject())),(Object)(RemoteObject.createImmutable("GetTourVisitor")));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e20.toString()); BA.debugLineNum = 335;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","51769495",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 336;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32768);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-CheckGetTourVisitorToday"))));
 };
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkinstallationrequirements() throws Exception{
try {
		Debug.PushSubsStack("CheckInstallationRequirements (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1324);
if (RapidSub.canDelegate("checkinstallationrequirements")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","checkinstallationrequirements");}
ResumableSub_CheckInstallationRequirements rsub = new ResumableSub_CheckInstallationRequirements(null);
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
public ResumableSub_CheckInstallationRequirements(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckInstallationRequirements (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1324);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1325;BA.debugLine="Try";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
 BA.debugLineNum = 1326;BA.debugLine="If File.ExternalWritable = False Then";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getExternalWritable"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 1329;BA.debugLine="Else If MCode.PImei.SdkVersion >= 26 And apkupdt";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("g",parent.mostCurrent._mcode._pimei /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 26)) && RemoteObject.solveBoolean("=",parent.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_canrequestpackageinstalls" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 8;
}else 
{ BA.debugLineNum = 1337;BA.debugLine="Else If apkupdt.CheckNonMarketAppsEnabled = Fals";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_checknonmarketappsenabled" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 10;
}else {
this.state = 12;
}}}
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 1327;BA.debugLine="MsgboxAsync(\"Storage card not available. Make s";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Storage card not available. Make sure that your device is not connected in USB storage mode.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),act_main.processBA);
 BA.debugLineNum = 1328;BA.debugLine="Return False";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 8:
//C
this.state = 13;
 BA.debugLineNum = 1330;BA.debugLine="MsgboxAsync(\"Please allow me to install applica";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please allow me to install applications.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),act_main.processBA);
 BA.debugLineNum = 1331;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "checkinstallationrequirements"), null);
this.state = 17;
return;
case 17:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1332;BA.debugLine="Dim in As Intent";
Debug.ShouldStop(524288);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 1333;BA.debugLine="in.Initialize(\"android.settings.MANAGE_UNKNOWN_";
Debug.ShouldStop(1048576);
_in.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.settings.MANAGE_UNKNOWN_APP_SOURCES")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("package:"),parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"))));
 BA.debugLineNum = 1334;BA.debugLine="StartActivity(in)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((_in.getObject())));
 BA.debugLineNum = 1335;BA.debugLine="Wait For Activity_Resume '<-- wait for Activity";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_resume", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "checkinstallationrequirements"), null);
this.state = 18;
return;
case 18:
//C
this.state = 13;
;
 BA.debugLineNum = 1336;BA.debugLine="Return apkupdt.CanRequestPackageInstalls";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_canrequestpackageinstalls" /*RemoteObject*/ )));return;};
 if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 1338;BA.debugLine="MsgboxAsync(\"Please enable installation of non-";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Please enable installation of non-market applications."),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Under Settings - Security - Unknown sources"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Or Settings - Applications - Unknown sources")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),act_main.processBA);
 BA.debugLineNum = 1340;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1342;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 13:
//C
this.state = 16;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 BA.debugLineNum = 1345;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55111829",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1346;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-CheckInstallationRequirements"))));
 BA.debugLineNum = 1347;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1349;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e0.toString());}
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _checktozie() throws Exception{
try {
		Debug.PushSubsStack("CheckTozie (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,276);
if (RapidSub.canDelegate("checktozie")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","checktozie");}
 BA.debugLineNum = 276;BA.debugLine="Public Sub CheckTozie";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 278;BA.debugLine="If MCode.Tozie=\"1\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._tozie /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 279;BA.debugLine="pnl_Havale.Visible=True";
Debug.ShouldStop(4194304);
act_main.mostCurrent._pnl_havale.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 281;BA.debugLine="pnl_Havale.Visible=False";
Debug.ShouldStop(16777216);
act_main.mostCurrent._pnl_havale.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"False"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e8.toString()); BA.debugLineNum = 284;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","51638408",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 285;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(268435456);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-CheckTozie"))));
 };
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkvaziat() throws Exception{
try {
		Debug.PushSubsStack("CheckVaziat (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,289);
if (RapidSub.canDelegate("checkvaziat")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","checkvaziat");}
RemoteObject _query = RemoteObject.createImmutable("");
 BA.debugLineNum = 289;BA.debugLine="Sub CheckVaziat";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(2);
if (act_main.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_main.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 291;BA.debugLine="If MCode.CodeMoshtari=0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 292;BA.debugLine="Dim Query As String=\"Update TblSetting Set FldV";
Debug.ShouldStop(8);
_query = BA.ObjectToString("Update TblSetting Set FldVaziat = '0'");Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 293;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(16);
act_main.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(_query));
 BA.debugLineNum = 295;BA.debugLine="MCode.Vaziat=0";
Debug.ShouldStop(64);
act_main.mostCurrent._mcode._vaziat /*RemoteObject*/  = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 297;BA.debugLine="ProgressDialogShow(\"جهت بررسی وضعیت نرم افزار لط";
Debug.ShouldStop(256);
act_main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("جهت بررسی وضعیت نرم افزار لطفا چند لحظه صبر کنید..."))));
 BA.debugLineNum = 298;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 299;BA.debugLine="MCode.NoeGet=\"GetVaziat\"";
Debug.ShouldStop(1024);
act_main.mostCurrent._mcode._noeget /*RemoteObject*/  = BA.ObjectToString("GetVaziat");
 }else {
 BA.debugLineNum = 301;BA.debugLine="MCode.NoeGet=\"GetCodeMoshtari\"";
Debug.ShouldStop(4096);
act_main.mostCurrent._mcode._noeget /*RemoteObject*/  = BA.ObjectToString("GetCodeMoshtari");
 };
 BA.debugLineNum = 304;BA.debugLine="StartService(Service_Server)";
Debug.ShouldStop(32768);
act_main.mostCurrent.__c.runVoidMethod ("StartService",act_main.processBA,(Object)((act_main.mostCurrent._service_server.getObject())));
 }else {
 BA.debugLineNum = 306;BA.debugLine="LoadPage";
Debug.ShouldStop(131072);
_loadpage();
 };
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
public static RemoteObject  _closeactivities() throws Exception{
try {
		Debug.PushSubsStack("CloseActivities (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,942);
if (RapidSub.canDelegate("closeactivities")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","closeactivities");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 942;BA.debugLine="Sub CloseActivities";
Debug.ShouldStop(8192);
 BA.debugLineNum = 943;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(16384);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 944;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(32768);
_jo.runVoidMethod ("InitializeContext",act_main.processBA);
 BA.debugLineNum = 945;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
Debug.ShouldStop(65536);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("finishAffinity")),(Object)((act_main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 946;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject _parent,RemoteObject _text,RemoteObject _font) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,340);
if (RapidSub.canDelegate("createlabel")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","createlabel", _parent, _text, _font);}
RemoteObject _tmp_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _xtmp_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Text", _text);
Debug.locals.put("Font", _font);
 BA.debugLineNum = 340;BA.debugLine="Private Sub CreateLabel(Parent As B4XView,Text As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 342;BA.debugLine="Dim tmp_lbl As Label";
Debug.ShouldStop(2097152);
_tmp_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("tmp_lbl", _tmp_lbl);
 BA.debugLineNum = 343;BA.debugLine="tmp_lbl.Initialize(\"\")";
Debug.ShouldStop(4194304);
_tmp_lbl.runVoidMethod ("Initialize",act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 344;BA.debugLine="Dim xtmp_lbl As B4XView = tmp_lbl";
Debug.ShouldStop(8388608);
_xtmp_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xtmp_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tmp_lbl.getObject());Debug.locals.put("xtmp_lbl", _xtmp_lbl);Debug.locals.put("xtmp_lbl", _xtmp_lbl);
 BA.debugLineNum = 346;BA.debugLine="Parent.AddView(xtmp_lbl,0,0,Parent.Width,Parent.H";
Debug.ShouldStop(33554432);
_parent.runVoidMethod ("AddView",(Object)((_xtmp_lbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 BA.debugLineNum = 347;BA.debugLine="xtmp_lbl.Font = Font";
Debug.ShouldStop(67108864);
_xtmp_lbl.runMethod(false,"setFont",_font);
 BA.debugLineNum = 348;BA.debugLine="xtmp_lbl.Text = Text";
Debug.ShouldStop(134217728);
_xtmp_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 349;BA.debugLine="xtmp_lbl.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.ShouldStop(268435456);
_xtmp_lbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 350;BA.debugLine="xtmp_lbl.TextColor = xui.Color_White";
Debug.ShouldStop(536870912);
_xtmp_lbl.runMethod(true,"setTextColor",act_main.mostCurrent._xui.getField(true,"Color_White"));
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getadvertisingid() throws Exception{
try {
		Debug.PushSubsStack("GetAdvertisingId (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,986);
if (RapidSub.canDelegate("getadvertisingid")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","getadvertisingid");}
ResumableSub_GetAdvertisingId rsub = new ResumableSub_GetAdvertisingId(null);
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
public static class ResumableSub_GetAdvertisingId extends BA.ResumableSub {
public ResumableSub_GetAdvertisingId(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _id = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetAdvertisingId (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,986);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 987;BA.debugLine="Dim jo As JavaObject = Me";
Debug.ShouldStop(67108864);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), act_main.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 988;BA.debugLine="jo.RunMethod(\"GetAdvertisingId\", Null)";
Debug.ShouldStop(134217728);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("GetAdvertisingId")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 989;BA.debugLine="Wait For AdvertisingId_Ready (Success As Boolean,";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","advertisingid_ready", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "getadvertisingid"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_id = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Id", _id);
;
 BA.debugLineNum = 990;BA.debugLine="Return Id";
Debug.ShouldStop(536870912);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_id));return;};
 BA.debugLineNum = 991;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static void  _advertisingid_ready(RemoteObject _success,RemoteObject _id) throws Exception{
}
public static RemoteObject  _getdeviceid() throws Exception{
try {
		Debug.PushSubsStack("GetDeviceId (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,993);
if (RapidSub.canDelegate("getdeviceid")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","getdeviceid");}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _id = RemoteObject.createImmutable("");
 BA.debugLineNum = 993;BA.debugLine="Sub GetDeviceId As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 994;BA.debugLine="Dim P As Phone";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("P", _p);
 BA.debugLineNum = 995;BA.debugLine="Dim id As String";
Debug.ShouldStop(4);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 1019;BA.debugLine="id= P.GetSettings(\"android_id\")";
Debug.ShouldStop(67108864);
_id = _p.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("android_id")));Debug.locals.put("id", _id);
 BA.debugLineNum = 1020;BA.debugLine="id = id.Replace(\"-\",\"\")";
Debug.ShouldStop(134217728);
_id = _id.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("id", _id);
 BA.debugLineNum = 1024;BA.debugLine="Return id";
Debug.ShouldStop(-2147483648);
if (true) return _id;
 BA.debugLineNum = 1025;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getimei10() throws Exception{
try {
		Debug.PushSubsStack("GetImei10 (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,967);
if (RapidSub.canDelegate("getimei10")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","getimei10"); return;}
ResumableSub_GetImei10 rsub = new ResumableSub_GetImei10(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetImei10 extends BA.ResumableSub {
public ResumableSub_GetImei10(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _id = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetImei10 (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,967);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 968;BA.debugLine="Try";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 969;BA.debugLine="Wait For (GetAdvertisingId) Complete (Id As Stri";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "getimei10"), _getadvertisingid());
this.state = 13;
return;
case 13:
//C
this.state = 4;
_id = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Id", _id);
;
 BA.debugLineNum = 970;BA.debugLine="Sleep(2000)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "getimei10"),BA.numberCast(int.class, 2000));
this.state = 14;
return;
case 14:
//C
this.state = 4;
;
 BA.debugLineNum = 971;BA.debugLine="If Id <> \"\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_id,BA.ObjectToString(""))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 972;BA.debugLine="MCode.strImei = Id.Replace(\"-\",\"\")";
Debug.ShouldStop(2048);
parent.mostCurrent._mcode._strimei /*RemoteObject*/  = _id.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 973;BA.debugLine="lbl_MenuIMEI.Text=MCode.strImei";
Debug.ShouldStop(4096);
parent.mostCurrent._lbl_menuimei.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mcode._strimei /*RemoteObject*/ ));
 BA.debugLineNum = 974;BA.debugLine="Log(MCode.strImei)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","53604487",parent.mostCurrent._mcode._strimei /*RemoteObject*/ ,0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 976;BA.debugLine="MCode.strImei = GetDeviceId";
Debug.ShouldStop(32768);
parent.mostCurrent._mcode._strimei /*RemoteObject*/  = _getdeviceid();
 BA.debugLineNum = 977;BA.debugLine="lbl_MenuIMEI.Text =MCode.strImei";
Debug.ShouldStop(65536);
parent.mostCurrent._lbl_menuimei.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mcode._strimei /*RemoteObject*/ ));
 BA.debugLineNum = 978;BA.debugLine="Log(MCode.strImei)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","53604491",parent.mostCurrent._mcode._strimei /*RemoteObject*/ ,0);
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
 BA.debugLineNum = 981;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","53604494",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 982;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2097152);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-GetImei10"))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 984;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e0.toString());}
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
public static RemoteObject  _getversion() throws Exception{
try {
		Debug.PushSubsStack("GetVersion (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1353);
if (RapidSub.canDelegate("getversion")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","getversion");}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 1353;BA.debugLine="Sub GetVersion";
Debug.ShouldStop(256);
 BA.debugLineNum = 1354;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 1355;BA.debugLine="jobInternet.JobName =\"GetVersion\"";
Debug.ShouldStop(1024);
act_main.mostCurrent._jobinternet.setField ("_jobname" /*RemoteObject*/ ,BA.ObjectToString("GetVersion"));
 BA.debugLineNum = 1356;BA.debugLine="Dim str As String=\"parsiknew-\"&MCode.TypeVersion";
Debug.ShouldStop(2048);
_str = RemoteObject.concat(RemoteObject.createImmutable("parsiknew-"),act_main.mostCurrent._mcode._typeversion /*RemoteObject*/ );Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 1357;BA.debugLine="If MCode.PrinterType=1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._printertype /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1358;BA.debugLine="str=\"parsikPos\"";
Debug.ShouldStop(8192);
_str = BA.ObjectToString("parsikPos");Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 1360;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"";
Debug.ShouldStop(32768);
act_main.mostCurrent._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://"),act_main.mostCurrent._mcode._url /*RemoteObject*/ ,RemoteObject.createImmutable("/marashiservice.asmx/Version"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Imei="),act_main.mostCurrent._mcode._deviceid /*RemoteObject*/ ,RemoteObject.createImmutable(" &Type="),_str)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e9.toString()); BA.debugLineNum = 1362;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","55177353",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1363;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(262144);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-GetVersion"))));
 };
 BA.debugLineNum = 1365;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 20;BA.debugLine="Dim jobInternet As HttpJob";
act_main.mostCurrent._jobinternet = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");
 //BA.debugLineNum = 21;BA.debugLine="Private sidemenu As SlidingMenu";
act_main.mostCurrent._sidemenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.SlidingMenuWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim DialogGetData As CustomLayoutDialog";
act_main.mostCurrent._dialoggetdata = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
 //BA.debugLineNum = 23;BA.debugLine="Dim DialogBackup As CustomLayoutDialog";
act_main.mostCurrent._dialogbackup = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
 //BA.debugLineNum = 24;BA.debugLine="Private BtnBackMenu As Button";
act_main.mostCurrent._btnbackmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private clv1 As CustomListView";
act_main.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 26;BA.debugLine="Private pCantent As Panel";
act_main.mostCurrent._pcantent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private pnl_body1 As Panel";
act_main.mostCurrent._pnl_body1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Btn_Search As Button";
act_main.mostCurrent._btn_search = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblAppName As Label";
act_main.mostCurrent._lblappname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Label2 As Label";
act_main.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblVer As Label";
act_main.mostCurrent._lblver = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private pnlMenu As Panel";
act_main.mostCurrent._pnlmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Pnl_Top As Panel";
act_main.mostCurrent._pnl_top = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private btn_menu As Button";
act_main.mostCurrent._btn_menu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lbl_mnuText As Label";
act_main.mostCurrent._lbl_mnutext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Button3 As Button";
act_main.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Button2 As Button";
act_main.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Button1 As Button";
act_main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private pnl_bottom As Panel";
act_main.mostCurrent._pnl_bottom = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private subMenu1 As Cls_SubMenu1";
act_main.mostCurrent._submenu1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_submenu1");
 //BA.debugLineNum = 42;BA.debugLine="Private lbl_Title As Label";
act_main.mostCurrent._lbl_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private clvH As CustomListView";
act_main.mostCurrent._clvh = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 44;BA.debugLine="Private xui As XUI";
act_main.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 45;BA.debugLine="Private rp As RuntimePermissions";
act_main.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 46;BA.debugLine="Private IntExit As Byte";
act_main._intexit = RemoteObject.createImmutable((byte)0);
 //BA.debugLineNum = 47;BA.debugLine="Private lbl_etelaeResani As ScrollingLabel";
act_main.mostCurrent._lbl_etelaeresani = RemoteObject.createNew ("ir.parsikhesab.pakhsh.scrollinglabel");
 //BA.debugLineNum = 48;BA.debugLine="Private pnlGetData As Panel";
act_main.mostCurrent._pnlgetdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private pnlSendData As Panel";
act_main.mostCurrent._pnlsenddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private pnlSabteSefaresh As Panel";
act_main.mostCurrent._pnlsabtesefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private pnlNewMoshtari As Panel";
act_main.mostCurrent._pnlnewmoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private lbl_MenuIMEI As Label";
act_main.mostCurrent._lbl_menuimei = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private clip As BClipboard";
act_main.mostCurrent._clip = RemoteObject.createNew ("b4a.util.BClipboard");
 //BA.debugLineNum = 54;BA.debugLine="Private lblVisitorName As Label";
act_main.mostCurrent._lblvisitorname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private lbl_CodeVisitor As Label";
act_main.mostCurrent._lbl_codevisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private ASB1 As ASButtonSlider";
act_main.mostCurrent._asb1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.asbuttonslider");
 //BA.debugLineNum = 57;BA.debugLine="Private LblText As Label";
act_main.mostCurrent._lbltext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private gmap As GoogleMap";
act_main.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Dim vaziat As Int";
act_main._vaziat = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 61;BA.debugLine="Dim Lat As String";
act_main.mostCurrent._lat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 62;BA.debugLine="Dim Lon As String";
act_main.mostCurrent._lon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 63;BA.debugLine="Dim ModeEnterExit As Boolean";
act_main._modeenterexit = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 64;BA.debugLine="Private PnlReport As Panel";
act_main.mostCurrent._pnlreport = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private PnlMoshtarian As Panel";
act_main.mostCurrent._pnlmoshtarian = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private Button4 As Button";
act_main.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private PnlShift As Panel";
act_main.mostCurrent._pnlshift = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private Pnl_Bk As Panel";
act_main.mostCurrent._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private pnlBackUp As Panel";
act_main.mostCurrent._pnlbackup = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private pnlbak As Panel";
act_main.mostCurrent._pnlbak = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private txtBackUpFile As EditText";
act_main.mostCurrent._txtbackupfile = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private BtnBackUpPnl As Button";
act_main.mostCurrent._btnbackuppnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private BtnCloseBackUpPnl As Button";
act_main.mostCurrent._btnclosebackuppnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Dim apkupdt As cl_appupdate";
act_main.mostCurrent._apkupdt = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cl_appupdate");
 //BA.debugLineNum = 76;BA.debugLine="Dim VerFlag As String=\"checkupdate\"";
act_main.mostCurrent._verflag = BA.ObjectToString("checkupdate");
 //BA.debugLineNum = 77;BA.debugLine="Private pnl_smartphone As Panel";
act_main.mostCurrent._pnl_smartphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private pnl_map As Panel";
act_main.mostCurrent._pnl_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private btn_Lock As Button";
act_main.mostCurrent._btn_lock = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private btnCloseActivate As Button";
act_main.mostCurrent._btncloseactivate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private txtCodeMoshtari As EditText";
act_main.mostCurrent._txtcodemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private txtNameVisitor As EditText";
act_main.mostCurrent._txtnamevisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private btnSendActivate As Button";
act_main.mostCurrent._btnsendactivate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private PnlActivate As Panel";
act_main.mostCurrent._pnlactivate = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private lblVaziat As Label";
act_main.mostCurrent._lblvaziat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private pnlActiveStatus As Panel";
act_main.mostCurrent._pnlactivestatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private btnDarkMode As Button";
act_main.mostCurrent._btndarkmode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private Label7 As Label";
act_main.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private PnlTopActivate As Panel";
act_main.mostCurrent._pnltopactivate = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private pnlTabligh As Panel";
act_main.mostCurrent._pnltabligh = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private MapFragment1 As MapFragment";
act_main.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private Lbl_DateVersion As Label";
act_main.mostCurrent._lbl_dateversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private PnlDateVersion As Panel";
act_main.mostCurrent._pnldateversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private pnlImei As Panel";
act_main.mostCurrent._pnlimei = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 98;BA.debugLine="Private pnl_Havale As Panel";
act_main.mostCurrent._pnl_havale = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 99;BA.debugLine="Dim HLV As Hitex_LayoutView";
act_main.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 100;BA.debugLine="Dim ListItemHome As List";
act_main.mostCurrent._listitemhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 101;BA.debugLine="Dim ListTempItemHome As List";
act_main.mostCurrent._listtempitemhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 102;BA.debugLine="Private pnl_body2 As Panel";
act_main.mostCurrent._pnl_body2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private lblVersion1 As Label";
act_main.mostCurrent._lblversion1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Private lblVersionNumber1 As Label";
act_main.mostCurrent._lblversionnumber1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private lblDateVersion1 As Label";
act_main.mostCurrent._lbldateversion1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private lblTypeVersion As Label";
act_main.mostCurrent._lbltypeversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private lblImei2 As Label";
act_main.mostCurrent._lblimei2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Private btnSetting As Button";
act_main.mostCurrent._btnsetting = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Private lblTypeVersion1 As Label";
act_main.mostCurrent._lbltypeversion1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,238);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","hlv_getitemcount");}
 BA.debugLineNum = 238;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="Return ListItemHome.Size";
Debug.ShouldStop(16384);
if (true) return act_main.mostCurrent._listitemhome.runMethod(true,"getSize");
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_onBindViewHolder (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,247);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapteritemhome");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_item_home");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 247;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="Dim Item = ListItemHome.Get(Position) As AdapterI";
Debug.ShouldStop(8388608);
_item = (act_main.mostCurrent._listitemhome.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 249;BA.debugLine="Dim rec As cls_Item_Home=Parent.Tag";
Debug.ShouldStop(16777216);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 250;BA.debugLine="rec.show(Item)";
Debug.ShouldStop(33554432);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_item_home.class, "_show" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 251;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(67108864);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_item_home.class, "_getheight" /*RemoteObject*/ ));
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
public static RemoteObject  _hlv_oncreateviewholder(RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,241);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_item_home");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 241;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(65536);
 BA.debugLineNum = 242;BA.debugLine="Dim rec As cls_Item_Home";
Debug.ShouldStop(131072);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_item_home");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 243;BA.debugLine="rec.Initialize";
Debug.ShouldStop(262144);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_item_home.class, "_initialize" /*RemoteObject*/ ,act_main.mostCurrent.activityBA);
 BA.debugLineNum = 244;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(524288);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_item_home.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_main.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_item_home.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 245;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(1048576);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1406);
if (RapidSub.canDelegate("jobdone")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","jobdone", _job);}
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 1406;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1407;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 1408;BA.debugLine="Job.GetRequest.Timeout=50000";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 50000));
 BA.debugLineNum = 1409;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1411;BA.debugLine="Dim Str As String = Job.GetString";
Debug.ShouldStop(4);
_str = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("Str", _str);Debug.locals.put("Str", _str);
 BA.debugLineNum = 1412;BA.debugLine="Select Case Job.JobName";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("GetVersion"))) {
case 0: {
 BA.debugLineNum = 1414;BA.debugLine="If Str = \"No Result\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("No Result"))) { 
 BA.debugLineNum = 1415;BA.debugLine="ToastMessageShow(\"امکان آپدیت نرم افزار وجود";
Debug.ShouldStop(64);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("امکان آپدیت نرم افزار وجود ندارد")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 1417;BA.debugLine="LoadGetVersion(Str)";
Debug.ShouldStop(256);
_loadgetversion(_str);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 1421;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
act_main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 BA.debugLineNum = 1424;BA.debugLine="jobInternet.Release";
Debug.ShouldStop(32768);
act_main.mostCurrent._jobinternet.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e18.toString()); BA.debugLineNum = 1426;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","55308436",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1427;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(262144);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-JobDone"))));
 };
 BA.debugLineNum = 1429;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _kalasearch() throws Exception{
try {
		Debug.PushSubsStack("KalaSearch (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1094);
if (RapidSub.canDelegate("kalasearch")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","kalasearch");}
 BA.debugLineNum = 1094;BA.debugLine="Sub KalaSearch";
Debug.ShouldStop(32);
 BA.debugLineNum = 1104;BA.debugLine="StartActivity(Act_Search)";
Debug.ShouldStop(32768);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_search.getObject())));
 BA.debugLineNum = 1105;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_mnutext_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_mnuText_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1027);
if (RapidSub.canDelegate("lbl_mnutext_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","lbl_mnutext_click");}
 BA.debugLineNum = 1027;BA.debugLine="Sub lbl_mnuText_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 1028;BA.debugLine="btn_menu_Click";
Debug.ShouldStop(8);
_btn_menu_click();
 BA.debugLineNum = 1029;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loaddialogbackup(RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("LoadDialogBackup (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,688);
if (RapidSub.canDelegate("loaddialogbackup")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","loaddialogbackup", _list); return;}
ResumableSub_LoadDialogBackup rsub = new ResumableSub_LoadDialogBackup(null,_list);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadDialogBackup extends BA.ResumableSub {
public ResumableSub_LoadDialogBackup(ir.parsikhesab.pakhsh.act_main parent,RemoteObject _list) {
this.parent = parent;
this._list = _list;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _list;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadDialogBackup (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,688);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("list", _list);
 BA.debugLineNum = 689;BA.debugLine="Try";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 690;BA.debugLine="Dim sf As Object = DialogBackup.ShowAsync(\"\", \"\"";
Debug.ShouldStop(131072);
_sf = parent.mostCurrent._dialogbackup.runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),act_main.mostCurrent.activityBA,(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 698;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_ready", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "loaddialogbackup"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 6;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 701;BA.debugLine="pnl.Initialize(\"pnl\")";
Debug.ShouldStop(268435456);
_pnl.runVoidMethod ("Initialize",act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl")));
 BA.debugLineNum = 702;BA.debugLine="Pnl_Bk.Initialize(\"Pnl_Bk\")";
Debug.ShouldStop(536870912);
parent.mostCurrent._pnl_bk.runVoidMethod ("Initialize",act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Pnl_Bk")));
 BA.debugLineNum = 703;BA.debugLine="pnl.LoadLayout(\"l_ShowListFileBackup\")";
Debug.ShouldStop(1073741824);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_ShowListFileBackup")),act_main.mostCurrent.activityBA);
 BA.debugLineNum = 704;BA.debugLine="pnl.SetLayout(0,0,Pnl_Bk.Width,Pnl_Bk.Height)";
Debug.ShouldStop(-2147483648);
_pnl.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._pnl_bk.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._pnl_bk.runMethod(true,"getHeight")));
 BA.debugLineNum = 705;BA.debugLine="DialogBackup.SetSize(Pnl_Bk.Width + 5%x,Pnl_Bk.H";
Debug.ShouldStop(1);
parent.mostCurrent._dialogbackup.runVoidMethod ("SetSize",(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_bk.runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),act_main.mostCurrent.activityBA)}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_bk.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_main.mostCurrent.activityBA)}, "+",1, 1)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 710;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52752534",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 711;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(64);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadDialogBackup"))));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 713;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e0.toString());}
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
public static void  _dialog_ready(RemoteObject _pnl) throws Exception{
}
public static void  _loaddialoggetdata() throws Exception{
try {
		Debug.PushSubsStack("LoadDialogGetData (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,666);
if (RapidSub.canDelegate("loaddialoggetdata")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","loaddialoggetdata"); return;}
ResumableSub_LoadDialogGetData rsub = new ResumableSub_LoadDialogGetData(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadDialogGetData extends BA.ResumableSub {
public ResumableSub_LoadDialogGetData(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadDialogGetData (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,666);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 667;BA.debugLine="Try";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 668;BA.debugLine="Dim sf As Object = DialogGetData.ShowAsync(\"\", \"";
Debug.ShouldStop(134217728);
_sf = parent.mostCurrent._dialoggetdata.runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),act_main.mostCurrent.activityBA,(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 676;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_ready", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "loaddialoggetdata"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 6;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 679;BA.debugLine="pnl.LoadLayout(\"L_YesNo\")";
Debug.ShouldStop(64);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_YesNo")),act_main.mostCurrent.activityBA);
 BA.debugLineNum = 680;BA.debugLine="pnl.SetLayout(0,0,Pnl_Bk.Width,Pnl_Bk.Height)";
Debug.ShouldStop(128);
_pnl.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._pnl_bk.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._pnl_bk.runMethod(true,"getHeight")));
 BA.debugLineNum = 681;BA.debugLine="DialogGetData.SetSize(Pnl_Bk.Width + 5%x,Pnl_Bk.";
Debug.ShouldStop(256);
parent.mostCurrent._dialoggetdata.runVoidMethod ("SetSize",(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_bk.runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),act_main.mostCurrent.activityBA)}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_bk.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_main.mostCurrent.activityBA)}, "+",1, 1)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 683;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52686993",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 684;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2048);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadDialogGetData"))));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 686;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e0.toString());}
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
public static void  _loadgetversion(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("LoadGetVersion (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1367);
if (RapidSub.canDelegate("loadgetversion")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","loadgetversion", _str); return;}
ResumableSub_LoadGetVersion rsub = new ResumableSub_LoadGetVersion(null,_str);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadGetVersion extends BA.ResumableSub {
public ResumableSub_LoadGetVersion(ir.parsikhesab.pakhsh.act_main parent,RemoteObject _str) {
this.parent = parent;
this._str = _str;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _str;
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _numver = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadGetVersion (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1367);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 1368;BA.debugLine="Try";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//try
this.state = 25;
this.catchState = 24;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 24;
 BA.debugLineNum = 1369;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(16777216);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1370;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(33554432);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 1371;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
Debug.ShouldStop(67108864);
parent.mostCurrent._mcode._json /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_str.runMethod(true,"trim")));
 BA.debugLineNum = 1372;BA.debugLine="RowsList = MCode.Json.NextArray";
Debug.ShouldStop(134217728);
_rowslist = parent.mostCurrent._mcode._json /*RemoteObject*/ .runMethod(false,"NextArray");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 1373;BA.debugLine="Row=RowsList.Get(0)";
Debug.ShouldStop(268435456);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 1374;BA.debugLine="MCode.NewVersion = Row.Get(\"FldVersion\")";
Debug.ShouldStop(536870912);
parent.mostCurrent._mcode._newversion /*RemoteObject*/  = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldVersion")))));
 BA.debugLineNum = 1375;BA.debugLine="MCode.LinkDownload = Row.Get(\"FldLink\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent._mcode._linkdownload /*RemoteObject*/  = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldLink")))));
 BA.debugLineNum = 1376;BA.debugLine="Dim NumVer As String=Row.Get(\"FldNumberVersion\")";
Debug.ShouldStop(-2147483648);
_numver = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldNumberVersion")))));Debug.locals.put("NumVer", _numver);Debug.locals.put("NumVer", _numver);
 BA.debugLineNum = 1377;BA.debugLine="If NumVer>MCode.NumberVersion Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 22;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _numver),BA.numberCast(double.class, parent.mostCurrent._mcode._numberversion /*RemoteObject*/ ))) { 
this.state = 6;
}else {
this.state = 21;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1378;BA.debugLine="If VerFlag=\"update\" Then";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._verflag,BA.ObjectToString("update"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1379;BA.debugLine="UpdateApp";
Debug.ShouldStop(4);
_updateapp();
 if (true) break;
;
 BA.debugLineNum = 1382;BA.debugLine="If VerFlag=\"checkupdate\" Then";
Debug.ShouldStop(32);

case 10:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._verflag,BA.ObjectToString("checkupdate"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1383;BA.debugLine="Dim sf As Object = Msgbox2Async(\"نسخه جدید موج";
Debug.ShouldStop(64);
_sf = parent.mostCurrent.__c.runMethod(false,"Msgbox2Async",(Object)(BA.ObjectToCharSequence("نسخه جدید موجود است لطفا بروزرسانی کنید")),(Object)(BA.ObjectToCharSequence("هشدار بروزرسانی")),(Object)(BA.ObjectToString("بروزرسانی")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("بعدا بروزرسانی میکنم")),(Object)(parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png")))),act_main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1384;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "loadgetversion"), _sf);
this.state = 26;
return;
case 26:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1385;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(256);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 1386;BA.debugLine="MCode.CreateBK(\"\")";
Debug.ShouldStop(512);
parent.mostCurrent._mcode.runVoidMethod ("_createbk" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1387;BA.debugLine="UpdateVersion";
Debug.ShouldStop(1024);
_updateversion();
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1389;BA.debugLine="ToastMessageShow(\"نسخه جدید موجود است لطفا بر";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نسخه جدید موجود است لطفا بروزرسانی کنید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1395;BA.debugLine="ToastMessageShow(\"شما از آخرین ورژن استفاده می";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شما از آخرین ورژن استفاده می کنید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 22:
//C
this.state = 25;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
 BA.debugLineNum = 1398;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55242911",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1399;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4194304);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadGetVersion"))));
 if (true) break;
if (true) break;

case 25:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1401;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e0.toString());}
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
public static void  _loadpage() throws Exception{
try {
		Debug.PushSubsStack("LoadPage (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,363);
if (RapidSub.canDelegate("loadpage")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","loadpage"); return;}
ResumableSub_LoadPage rsub = new ResumableSub_LoadPage(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadPage extends BA.ResumableSub {
public ResumableSub_LoadPage(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _id = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadPage (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,363);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 364;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//try
this.state = 26;
this.catchState = 25;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 25;
 BA.debugLineNum = 365;BA.debugLine="MCode.UpdateSetting";
Debug.ShouldStop(4096);
parent.mostCurrent._mcode.runVoidMethod ("_updatesetting" /*RemoteObject*/ ,act_main.mostCurrent.activityBA);
 BA.debugLineNum = 367;BA.debugLine="CheckAdmin";
Debug.ShouldStop(16384);
_checkadmin();
 BA.debugLineNum = 368;BA.debugLine="CheckTozie";
Debug.ShouldStop(32768);
_checktozie();
 BA.debugLineNum = 369;BA.debugLine="CheckGetTourVisitorToday";
Debug.ShouldStop(65536);
_checkgettourvisitortoday();
 BA.debugLineNum = 371;BA.debugLine="lbl_CodeVisitor.Text = \"کد ویزیتور\"";
Debug.ShouldStop(262144);
parent.mostCurrent._lbl_codevisitor.runMethod(true,"setText",BA.ObjectToCharSequence("کد ویزیتور"));
 BA.debugLineNum = 372;BA.debugLine="lblVisitorName.Text = \"نام ویزیتور\"";
Debug.ShouldStop(524288);
parent.mostCurrent._lblvisitorname.runMethod(true,"setText",BA.ObjectToCharSequence("نام ویزیتور"));
 BA.debugLineNum = 374;BA.debugLine="PermissionActive4";
Debug.ShouldStop(2097152);
_permissionactive4();
 BA.debugLineNum = 375;BA.debugLine="Dim Id As String";
Debug.ShouldStop(4194304);
_id = RemoteObject.createImmutable("");Debug.locals.put("Id", _id);
 BA.debugLineNum = 376;BA.debugLine="Id=MCode.GetDeviceId";
Debug.ShouldStop(8388608);
_id = parent.mostCurrent._mcode.runMethod(true,"_getdeviceid" /*RemoteObject*/ ,act_main.mostCurrent.activityBA);Debug.locals.put("Id", _id);
 BA.debugLineNum = 377;BA.debugLine="If Id = \"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_id,BA.ObjectToString(""))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 378;BA.debugLine="Wait For (GetAdvertisingId) Complete (Id As Str";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "loadpage"), _getadvertisingid());
this.state = 27;
return;
case 27:
//C
this.state = 9;
_id = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Id", _id);
;
 BA.debugLineNum = 380;BA.debugLine="Log(MCode.GetApiVersion)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51966097",BA.NumberToString(parent.mostCurrent._mcode.runMethod(true,"_getapiversion" /*RemoteObject*/ ,act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 381;BA.debugLine="MCode.DeviceId=Id";
Debug.ShouldStop(268435456);
parent.mostCurrent._mcode._deviceid /*RemoteObject*/  = _id;
 BA.debugLineNum = 382;BA.debugLine="Log(Id)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51966099",_id,0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 384;BA.debugLine="Log(Id)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51966101",_id,0);
 BA.debugLineNum = 385;BA.debugLine="MCode.DeviceId=Id";
Debug.ShouldStop(1);
parent.mostCurrent._mcode._deviceid /*RemoteObject*/  = _id;
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 387;BA.debugLine="lbl_MenuIMEI.Text=\"سریال گوشی:  \"& MCode.DeviceI";
Debug.ShouldStop(4);
parent.mostCurrent._lbl_menuimei.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("سریال گوشی:  "),parent.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 388;BA.debugLine="lblImei2.Text=MCode.DeviceId";
Debug.ShouldStop(8);
parent.mostCurrent._lblimei2.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mcode._deviceid /*RemoteObject*/ ));
 BA.debugLineNum = 389;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(16);
if (true) break;

case 10:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 23;
 BA.debugLineNum = 390;BA.debugLine="btn_Lock.Text= Chr(0xE897)";
Debug.ShouldStop(32);
parent.mostCurrent._btn_lock.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe897))))));
 BA.debugLineNum = 391;BA.debugLine="btn_Lock.TextColor=Colors.Black";
Debug.ShouldStop(64);
parent.mostCurrent._btn_lock.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 392;BA.debugLine="lblVaziat.Text=\"غیر فعال\"";
Debug.ShouldStop(128);
parent.mostCurrent._lblvaziat.runMethod(true,"setText",BA.ObjectToCharSequence("غیر فعال"));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 396;BA.debugLine="lbl_CodeVisitor.Text =  MCode.C_Visitor";
Debug.ShouldStop(2048);
parent.mostCurrent._lbl_codevisitor.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mcode._c_visitor /*RemoteObject*/ ));
 BA.debugLineNum = 397;BA.debugLine="lblVisitorName.Text =  MCode.N_Visitor";
Debug.ShouldStop(4096);
parent.mostCurrent._lblvisitorname.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mcode._n_visitor /*RemoteObject*/ ));
 BA.debugLineNum = 399;BA.debugLine="btn_Lock.Text=Chr(0xE0DA)";
Debug.ShouldStop(16384);
parent.mostCurrent._btn_lock.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe0da))))));
 BA.debugLineNum = 400;BA.debugLine="btn_Lock.TextColor=Colors.Green";
Debug.ShouldStop(32768);
parent.mostCurrent._btn_lock.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 401;BA.debugLine="lblVaziat.Text=\"فعال\"";
Debug.ShouldStop(65536);
parent.mostCurrent._lblvaziat.runMethod(true,"setText",BA.ObjectToCharSequence("فعال"));
 BA.debugLineNum = 402;BA.debugLine="txtCodeMoshtari.Text=MCode.CodeMoshtari";
Debug.ShouldStop(131072);
parent.mostCurrent._txtcodemoshtari.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ));
 BA.debugLineNum = 404;BA.debugLine="If MCode.Gps=1 Then";
Debug.ShouldStop(524288);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._gps /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 406;BA.debugLine="StartService(FusedLocationService)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StartService",act_main.processBA,(Object)((parent.mostCurrent._fusedlocationservice.getObject())));
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 409;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51966126",RemoteObject.createImmutable("Gps Start"),0);
 BA.debugLineNum = 410;BA.debugLine="If MCode.GetDataOnline=1 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._getdataonline /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 26;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
 BA.debugLineNum = 418;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51966135",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 419;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadPage"))));
 if (true) break;
if (true) break;

case 26:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 421;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e0.toString());}
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
public static void  _mapfragment1_ready() throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,524);
if (RapidSub.canDelegate("mapfragment1_ready")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","mapfragment1_ready"); return;}
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
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,524);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 525;BA.debugLine="Sleep(100)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "mapfragment1_ready"),BA.numberCast(int.class, 100));
this.state = 23;
return;
case 23:
//C
this.state = 1;
;
 BA.debugLineNum = 526;BA.debugLine="Try";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//try
this.state = 22;
this.catchState = 21;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 21;
 BA.debugLineNum = 528;BA.debugLine="If MCode.Gps=\"1\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._gps /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 529;BA.debugLine="If gps.GPSEnabled=True Then";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent._gps.runMethod(true,"getGPSEnabled"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 530;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(131072);
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 BA.debugLineNum = 531;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_L";
Debug.ShouldStop(262144);
parent.mostCurrent._rp.runVoidMethod ("CheckAndRequest",act_main.processBA,(Object)(parent.mostCurrent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 532;BA.debugLine="Wait For Activity_PermissionResult (Permission";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "mapfragment1_ready"), null);
this.state = 24;
return;
case 24:
//C
this.state = 10;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 533;BA.debugLine="If Result Then";
Debug.ShouldStop(1048576);
if (true) break;

case 10:
//if
this.state = 15;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 534;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(2097152);
parent.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 538;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52424846",RemoteObject.createImmutable("No permission!"),0);
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 541;BA.debugLine="gmap.MyLocationEnabled=False";
Debug.ShouldStop(268435456);
parent.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 542;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کن";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 543;BA.debugLine="StartActivity(gps.LocationSettingsIntent)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((parent._gps.runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
 BA.debugLineNum = 547;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52424855",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 548;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-MapFragment1_Ready"))));
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 551;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e0.toString());}
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
public static RemoteObject  _openbackuppnl() throws Exception{
try {
		Debug.PushSubsStack("OpenBackUpPnl (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1132);
if (RapidSub.canDelegate("openbackuppnl")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","openbackuppnl");}
 BA.debugLineNum = 1132;BA.debugLine="Sub OpenBackUpPnl";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1133;BA.debugLine="pnlbak.Visible=True";
Debug.ShouldStop(4096);
act_main.mostCurrent._pnlbak.runMethod(true,"setVisible",act_main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1135;BA.debugLine="MCode.AnimationOpen(pnlbak)";
Debug.ShouldStop(16384);
act_main.mostCurrent._mcode.runVoidMethod ("_animationopen" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)((act_main.mostCurrent._pnlbak.getObject())));
 BA.debugLineNum = 1136;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _permissionactive4() throws Exception{
try {
		Debug.PushSubsStack("PermissionActive4 (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,354);
if (RapidSub.canDelegate("permissionactive4")) { ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","permissionactive4"); return;}
ResumableSub_PermissionActive4 rsub = new ResumableSub_PermissionActive4(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PermissionActive4 extends BA.ResumableSub {
public ResumableSub_PermissionActive4(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_main parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PermissionActive4 (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,354);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 355;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CALL_PHONE)";
Debug.ShouldStop(4);
parent.mostCurrent._rp.runVoidMethod ("CheckAndRequest",act_main.processBA,(Object)(parent.mostCurrent._rp.getField(true,"PERMISSION_CALL_PHONE")));
 BA.debugLineNum = 356;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissonresult", act_main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_main", "permissionactive4"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static void  _activity_permissonresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _pnl_havale_click() throws Exception{
try {
		Debug.PushSubsStack("pnl_Havale_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1513);
if (RapidSub.canDelegate("pnl_havale_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnl_havale_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 1513;BA.debugLine="Private Sub pnl_Havale_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 1515;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1516;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(2048);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1517;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1519;BA.debugLine="Dim cu As Cursor=MCode.Result(\"Select * from TblH";
Debug.ShouldStop(16384);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_main.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * from TblHavale")));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 1520;BA.debugLine="If cu.RowCount=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1521;BA.debugLine="ToastMessageShow(\"حواله موجود نمی باشد\",True)";
Debug.ShouldStop(65536);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("حواله موجود نمی باشد")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1522;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1524;BA.debugLine="StartActivity(Act_HavaleTozie)";
Debug.ShouldStop(524288);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_havaletozie.getObject())));
 BA.debugLineNum = 1525;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_map_click() throws Exception{
try {
		Debug.PushSubsStack("pnl_map_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1440);
if (RapidSub.canDelegate("pnl_map_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnl_map_click");}
 BA.debugLineNum = 1440;BA.debugLine="Sub pnl_map_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1441;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1442;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(2);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1443;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1445;BA.debugLine="StartActivity(Act_LocationVisitor)";
Debug.ShouldStop(16);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_locationvisitor.getObject())));
 BA.debugLineNum = 1446;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_smartphone_click() throws Exception{
try {
		Debug.PushSubsStack("pnl_smartphone_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1436);
if (RapidSub.canDelegate("pnl_smartphone_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnl_smartphone_click");}
 BA.debugLineNum = 1436;BA.debugLine="Sub pnl_smartphone_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1438;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlgetdata_click() throws Exception{
try {
		Debug.PushSubsStack("pnlGetData_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,750);
if (RapidSub.canDelegate("pnlgetdata_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnlgetdata_click");}
 BA.debugLineNum = 750;BA.debugLine="Sub pnlGetData_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 751;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 752;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 753;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد";
Debug.ShouldStop(65536);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 754;BA.debugLine="Return";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 756;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_main.mostCurrent.activityBA),act_main.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 757;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
Debug.ShouldStop(1048576);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(act_main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 758;BA.debugLine="Return";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 775;BA.debugLine="LoadDialogGetData";
Debug.ShouldStop(64);
_loaddialoggetdata();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e12.toString()); BA.debugLineNum = 780;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52949150",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 781;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4096);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-pnlGetData_Click"))));
 };
 BA.debugLineNum = 783;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlgoinsta_click() throws Exception{
try {
		Debug.PushSubsStack("pnlGoInsta_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1542);
if (RapidSub.canDelegate("pnlgoinsta_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnlgoinsta_click");}
 BA.debugLineNum = 1542;BA.debugLine="Private Sub pnlGoInsta_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 1543;BA.debugLine="MCode.OpenLinkInWebBrwoser(\"https://zaya.io/v10gw";
Debug.ShouldStop(64);
act_main.mostCurrent._mcode.runVoidMethod ("_openlinkinwebbrwoser" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("https://zaya.io/v10gw")));
 BA.debugLineNum = 1544;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlgosite_click() throws Exception{
try {
		Debug.PushSubsStack("pnlGoSite_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1538);
if (RapidSub.canDelegate("pnlgosite_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnlgosite_click");}
 BA.debugLineNum = 1538;BA.debugLine="Private Sub pnlGoSite_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 1539;BA.debugLine="MCode.OpenLinkInWebBrwoser(\"https://zaya.io/fbkzq";
Debug.ShouldStop(4);
act_main.mostCurrent._mcode.runVoidMethod ("_openlinkinwebbrwoser" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("https://zaya.io/fbkzq")));
 BA.debugLineNum = 1540;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlmoshtarian_click() throws Exception{
try {
		Debug.PushSubsStack("PnlMoshtarian_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,847);
if (RapidSub.canDelegate("pnlmoshtarian_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnlmoshtarian_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 847;BA.debugLine="Sub PnlMoshtarian_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 848;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 849;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(65536);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 850;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 852;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 853;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(1048576);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 854;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 856;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("<",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 857;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
Debug.ShouldStop(16777216);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 858;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 860;BA.debugLine="MCode.page = \"Act_Moshtarian\"";
Debug.ShouldStop(134217728);
act_main.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_Moshtarian");
 BA.debugLineNum = 861;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 862;BA.debugLine="Dim Cu As Cursor";
Debug.ShouldStop(536870912);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 863;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
Debug.ShouldStop(1073741824);
_cu = act_main.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 864;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(-2147483648);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 865;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
Debug.ShouldStop(1);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","53145746",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),0);
 BA.debugLineNum = 866;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" T";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 867;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بع";
Debug.ShouldStop(4);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 868;BA.debugLine="Return";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 870;BA.debugLine="StartActivity(Act_SelectMantage)";
Debug.ShouldStop(32);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_selectmantage.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e25) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e25.toString()); BA.debugLineNum = 872;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","53145753",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 873;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(256);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-PnlMoshtarian_Click"))));
 };
 BA.debugLineNum = 875;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlnewmoshtari_click() throws Exception{
try {
		Debug.PushSubsStack("pnlNewMoshtari_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,876);
if (RapidSub.canDelegate("pnlnewmoshtari_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnlnewmoshtari_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 876;BA.debugLine="Sub pnlNewMoshtari_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 878;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 879;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 880;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد";
Debug.ShouldStop(32768);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 881;BA.debugLine="Return";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 883;BA.debugLine="Dim Cu As Cursor";
Debug.ShouldStop(262144);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 884;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
Debug.ShouldStop(524288);
_cu = act_main.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 885;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(1048576);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 886;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
Debug.ShouldStop(2097152);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","53211274",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),0);
 BA.debugLineNum = 887;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" T";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 888;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بع";
Debug.ShouldStop(8388608);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 889;BA.debugLine="Return";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 891;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("<",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 892;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tru";
Debug.ShouldStop(134217728);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 893;BA.debugLine="Return";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 895;BA.debugLine="MCode.UpdateShakhs=False";
Debug.ShouldStop(1073741824);
act_main.mostCurrent._mcode._updateshakhs /*RemoteObject*/  = act_main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 896;BA.debugLine="StartActivity(Act_NewAshkhas)";
Debug.ShouldStop(-2147483648);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_newashkhas.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e21.toString()); BA.debugLineNum = 901;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","53211289",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 902;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-pnlNewMoshtari_Click"))));
 };
 BA.debugLineNum = 904;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlreport_click() throws Exception{
try {
		Debug.PushSubsStack("PnlReport_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1163);
if (RapidSub.canDelegate("pnlreport_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnlreport_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 1163;BA.debugLine="Sub PnlReport_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1165;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1166;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(8192);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1167;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1169;BA.debugLine="Dim Cu As Cursor";
Debug.ShouldStop(65536);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1170;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
Debug.ShouldStop(131072);
_cu = act_main.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1171;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(262144);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1172;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
Debug.ShouldStop(524288);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","54521993",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),0);
 BA.debugLineNum = 1173;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" Th";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 1174;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بعد";
Debug.ShouldStop(2097152);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1175;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1177;BA.debugLine="StartActivity(Act_Choose_Report)";
Debug.ShouldStop(16777216);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_choose_report.getObject())));
 BA.debugLineNum = 1189;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlsabtesefaresh_click() throws Exception{
try {
		Debug.PushSubsStack("pnlSabteSefaresh_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,793);
if (RapidSub.canDelegate("pnlsabtesefaresh_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnlsabtesefaresh_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 793;BA.debugLine="Sub pnlSabteSefaresh_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 794;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 795;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 796;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد";
Debug.ShouldStop(134217728);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 797;BA.debugLine="Return";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 799;BA.debugLine="If	MCode.Visitor=\"0\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._visitor /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 800;BA.debugLine="ToastMessageShow(\"این بخش مربوط به نسخه ویزیتور";
Debug.ShouldStop(-2147483648);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 801;BA.debugLine="Return";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 803;BA.debugLine="Dim Cu As Cursor";
Debug.ShouldStop(4);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 804;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
Debug.ShouldStop(8);
_cu = act_main.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 805;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(16);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 806;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
Debug.ShouldStop(32);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","53080205",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),0);
 BA.debugLineNum = 807;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" T";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))),BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 808;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بع";
Debug.ShouldStop(128);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 809;BA.debugLine="Return";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 811;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,BA.ObjectToString("کد ویزیتور"))) { 
 BA.debugLineNum = 812;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
Debug.ShouldStop(2048);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 813;BA.debugLine="Return";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 815;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("<",act_main.mostCurrent._mcode._c_visitor /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 816;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tru";
Debug.ShouldStop(32768);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 817;BA.debugLine="Return";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 824;BA.debugLine="Cu=MCode.Result(\"Select * From TblKala\")";
Debug.ShouldStop(8388608);
_cu = act_main.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblKala")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 825;BA.debugLine="If Cu.RowCount=0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 826;BA.debugLine="ToastMessageShow(\"لیست کالا به درستی دریافت نشد";
Debug.ShouldStop(33554432);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لیست کالا به درستی دریافت نشده است")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 827;BA.debugLine="Return";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 829;BA.debugLine="Cu=MCode.Result(\"Select * From TblGoroohKala\")";
Debug.ShouldStop(268435456);
_cu = act_main.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblGoroohKala")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 830;BA.debugLine="If Cu.RowCount=0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 831;BA.debugLine="ToastMessageShow(\"جدول گروه کالا به درستی دریاف";
Debug.ShouldStop(1073741824);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("جدول گروه کالا به درستی دریافت نشده است")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 832;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 834;BA.debugLine="Cu=MCode.Result(\"Select * From TblTasvie\")";
Debug.ShouldStop(2);
_cu = act_main.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblTasvie")));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 835;BA.debugLine="If Cu.RowCount=0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 836;BA.debugLine="ToastMessageShow(\"جدول تسویه حساب به درستی دریا";
Debug.ShouldStop(8);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("جدول تسویه حساب به درستی دریافت نشده است")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 837;BA.debugLine="Return";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 840;BA.debugLine="MCode.Action=\"SabtFaktor\"";
Debug.ShouldStop(128);
act_main.mostCurrent._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtFaktor");
 BA.debugLineNum = 841;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(256);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_kaladefault.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e44) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e44.toString()); BA.debugLineNum = 843;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","53080242",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 844;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2048);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-pnlSabteSefaresh_Click"))));
 };
 BA.debugLineNum = 846;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlsenddata_click() throws Exception{
try {
		Debug.PushSubsStack("pnlSendData_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,785);
if (RapidSub.canDelegate("pnlsenddata_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnlsenddata_click");}
 BA.debugLineNum = 785;BA.debugLine="Sub pnlSendData_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 786;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 787;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
Debug.ShouldStop(262144);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 788;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 790;BA.debugLine="StartActivity(Act_SendData)";
Debug.ShouldStop(2097152);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main.mostCurrent._act_senddata.getObject())));
 BA.debugLineNum = 791;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnltabligh_click() throws Exception{
try {
		Debug.PushSubsStack("pnlTabligh_Click (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1509);
if (RapidSub.canDelegate("pnltabligh_click")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","pnltabligh_click");}
 BA.debugLineNum = 1509;BA.debugLine="Sub pnlTabligh_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 1510;BA.debugLine="lbl_etelaeResani.TextColor=Colors.RGB(Rnd(0,255),";
Debug.ShouldStop(32);
act_main.mostCurrent._lbl_etelaeresani.runClassMethod (ir.parsikhesab.pakhsh.scrollinglabel.class, "_settextcolor" /*RemoteObject*/ ,act_main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(act_main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(act_main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(act_main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255))))));
 BA.debugLineNum = 1511;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private gps	As GPS";
act_main._gps = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 10;BA.debugLine="Dim T_EnterExit As Timer";
act_main._t_enterexit = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 11;BA.debugLine="Dim T_Exit As Timer";
act_main._t_exit = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 12;BA.debugLine="Dim T_DataCheck As Timer";
act_main._t_datacheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 13;BA.debugLine="Public NoeGet As String";
act_main._noeget = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim t_gps As Timer";
act_main._t_gps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savegps() throws Exception{
try {
		Debug.PushSubsStack("SaveGps (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,506);
if (RapidSub.canDelegate("savegps")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","savegps");}
 BA.debugLineNum = 506;BA.debugLine="Sub SaveGps";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 507;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 508;BA.debugLine="If gps.GPSEnabled=False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_main._gps.runMethod(true,"getGPSEnabled"),act_main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 509;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
act_main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 510;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید";
Debug.ShouldStop(536870912);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 511;BA.debugLine="T_EnterExit.Enabled=False";
Debug.ShouldStop(1073741824);
act_main._t_enterexit.runMethod(true,"setEnabled",act_main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 512;BA.debugLine="StartActivity(gps.LocationSettingsIntent)";
Debug.ShouldStop(-2147483648);
act_main.mostCurrent.__c.runVoidMethod ("StartActivity",act_main.processBA,(Object)((act_main._gps.runMethod(false,"getLocationSettingsIntent"))));
 }else {
 BA.debugLineNum = 514;BA.debugLine="ProgressDialogShow2(\"لطفا تا دریافت موقعیت مکان";
Debug.ShouldStop(2);
act_main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("لطفا تا دریافت موقعیت مکانی صبر کنید")),(Object)(act_main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 515;BA.debugLine="T_EnterExit.Enabled=True";
Debug.ShouldStop(4);
act_main._t_enterexit.runMethod(true,"setEnabled",act_main.mostCurrent.__c.getField(true,"True"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e12.toString()); BA.debugLineNum = 519;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52359309",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 520;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(128);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-SaveGps"))));
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
public static RemoteObject  _setcoloritems() throws Exception{
try {
		Debug.PushSubsStack("SetColorItems (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,205);
if (RapidSub.canDelegate("setcoloritems")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","setcoloritems");}
RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
 BA.debugLineNum = 205;BA.debugLine="Public Sub SetColorItems";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="Dim ac As AppCompat";
Debug.ShouldStop(8192);
_ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");Debug.locals.put("ac", _ac);
 BA.debugLineNum = 207;BA.debugLine="MCode.colorPrimary=ac.GetThemeAttribute(\"colorPr";
Debug.ShouldStop(16384);
act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/  = _ac.runMethod(true,"GetThemeAttribute",act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("colorPrimary")));
 BA.debugLineNum = 208;BA.debugLine="MCode.colorPrimaryDark=ac.GetThemeAttribute(\"colo";
Debug.ShouldStop(32768);
act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/  = _ac.runMethod(true,"GetThemeAttribute",act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("colorPrimaryDark")));
 BA.debugLineNum = 209;BA.debugLine="MCode.colorAccent=ac.GetThemeAttribute(\"colorAcce";
Debug.ShouldStop(65536);
act_main.mostCurrent._mcode._coloraccent /*RemoteObject*/  = _ac.runMethod(true,"GetThemeAttribute",act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("colorAccent")));
 BA.debugLineNum = 210;BA.debugLine="Log(MCode.colorPrimary)";
Debug.ShouldStop(131072);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","51310725",BA.NumberToString(act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/ ),0);
 BA.debugLineNum = 211;BA.debugLine="Log(MCode.colorPrimaryDark)";
Debug.ShouldStop(262144);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","51310726",BA.NumberToString(act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/ ),0);
 BA.debugLineNum = 212;BA.debugLine="Log(MCode.colorAccent)";
Debug.ShouldStop(524288);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","51310727",BA.NumberToString(act_main.mostCurrent._mcode._coloraccent /*RemoteObject*/ ),0);
 BA.debugLineNum = 214;BA.debugLine="If MCode.DarkMode=\"True\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._darkmode /*RemoteObject*/ ,BA.ObjectToString("True"))) { 
 BA.debugLineNum = 215;BA.debugLine="pnlActiveStatus.Color=MCode.colorPrimaryDark";
Debug.ShouldStop(4194304);
act_main.mostCurrent._pnlactivestatus.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/ );
 BA.debugLineNum = 216;BA.debugLine="Pnl_Top.Color=MCode.colorPrimaryDark";
Debug.ShouldStop(8388608);
act_main.mostCurrent._pnl_top.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/ );
 BA.debugLineNum = 217;BA.debugLine="PnlTopActivate.Color =MCode.colorPrimaryDark";
Debug.ShouldStop(16777216);
act_main.mostCurrent._pnltopactivate.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/ );
 BA.debugLineNum = 218;BA.debugLine="btnSendActivate.Color=MCode.colorPrimaryDark";
Debug.ShouldStop(33554432);
act_main.mostCurrent._btnsendactivate.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/ );
 BA.debugLineNum = 219;BA.debugLine="BtnBackUpPnl.Color=MCode.colorPrimaryDark";
Debug.ShouldStop(67108864);
act_main.mostCurrent._btnbackuppnl.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/ );
 BA.debugLineNum = 220;BA.debugLine="pnlMenu.Color=MCode.colorPrimaryDark";
Debug.ShouldStop(134217728);
act_main.mostCurrent._pnlmenu.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/ );
 BA.debugLineNum = 221;BA.debugLine="pnlImei.Color=MCode.colorPrimaryDark";
Debug.ShouldStop(268435456);
act_main.mostCurrent._pnlimei.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/ );
 BA.debugLineNum = 222;BA.debugLine="PnlDateVersion.Color=MCode.colorPrimaryDark";
Debug.ShouldStop(536870912);
act_main.mostCurrent._pnldateversion.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/ );
 BA.debugLineNum = 223;BA.debugLine="btnSetting.Color=MCode.colorPrimaryDark";
Debug.ShouldStop(1073741824);
act_main.mostCurrent._btnsetting.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimarydark /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 225;BA.debugLine="pnlActiveStatus.Color=MCode.colorPrimary";
Debug.ShouldStop(1);
act_main.mostCurrent._pnlactivestatus.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/ );
 BA.debugLineNum = 226;BA.debugLine="Pnl_Top.Color=MCode.colorPrimary";
Debug.ShouldStop(2);
act_main.mostCurrent._pnl_top.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/ );
 BA.debugLineNum = 227;BA.debugLine="PnlTopActivate.Color=MCode.colorPrimary";
Debug.ShouldStop(4);
act_main.mostCurrent._pnltopactivate.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/ );
 BA.debugLineNum = 228;BA.debugLine="btnSendActivate.Color=MCode.colorPrimary";
Debug.ShouldStop(8);
act_main.mostCurrent._btnsendactivate.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/ );
 BA.debugLineNum = 229;BA.debugLine="BtnBackUpPnl.Color=MCode.colorPrimary";
Debug.ShouldStop(16);
act_main.mostCurrent._btnbackuppnl.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/ );
 BA.debugLineNum = 230;BA.debugLine="pnlMenu.Color=MCode.colorPrimary";
Debug.ShouldStop(32);
act_main.mostCurrent._pnlmenu.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/ );
 BA.debugLineNum = 231;BA.debugLine="pnlImei.Color=MCode.colorPrimary";
Debug.ShouldStop(64);
act_main.mostCurrent._pnlimei.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/ );
 BA.debugLineNum = 232;BA.debugLine="PnlDateVersion.Color=MCode.colorPrimary";
Debug.ShouldStop(128);
act_main.mostCurrent._pnldateversion.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/ );
 BA.debugLineNum = 233;BA.debugLine="btnSetting.Color=MCode.colorPrimary";
Debug.ShouldStop(256);
act_main.mostCurrent._btnsetting.runVoidMethod ("setColor",act_main.mostCurrent._mcode._colorprimary /*RemoteObject*/ );
 };
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvaziat() throws Exception{
try {
		Debug.PushSubsStack("SetVaziat (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,460);
if (RapidSub.canDelegate("setvaziat")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","setvaziat");}
 BA.debugLineNum = 460;BA.debugLine="Sub SetVaziat";
Debug.ShouldStop(2048);
 BA.debugLineNum = 461;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 462;BA.debugLine="If MCode.Vaziat=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",act_main.mostCurrent._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 463;BA.debugLine="btn_Lock.Text= Chr(0xE897)";
Debug.ShouldStop(16384);
act_main.mostCurrent._btn_lock.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe897))))));
 BA.debugLineNum = 464;BA.debugLine="btn_Lock.TextColor=Colors.Black";
Debug.ShouldStop(32768);
act_main.mostCurrent._btn_lock.runMethod(true,"setTextColor",act_main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 }else {
 BA.debugLineNum = 466;BA.debugLine="StartService(Service_Notification)";
Debug.ShouldStop(131072);
act_main.mostCurrent.__c.runVoidMethod ("StartService",act_main.processBA,(Object)((act_main.mostCurrent._service_notification.getObject())));
 BA.debugLineNum = 467;BA.debugLine="btn_Lock.Text=Chr(0xE0DA)";
Debug.ShouldStop(262144);
act_main.mostCurrent._btn_lock.runMethod(true,"setText",BA.ObjectToCharSequence(act_main.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe0da))))));
 BA.debugLineNum = 468;BA.debugLine="btn_Lock.TextColor=Colors.Green";
Debug.ShouldStop(524288);
act_main.mostCurrent._btn_lock.runMethod(true,"setTextColor",act_main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e11.toString()); BA.debugLineNum = 471;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52097163",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 472;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8388608);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-SetVaziat"))));
 };
 BA.debugLineNum = 474;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _statusbutton(RemoteObject _ena) throws Exception{
try {
		Debug.PushSubsStack("StatusButton (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,476);
if (RapidSub.canDelegate("statusbutton")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","statusbutton", _ena);}
Debug.locals.put("Ena", _ena);
 BA.debugLineNum = 476;BA.debugLine="Sub StatusButton(Ena As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 477;BA.debugLine="pnlSabteSefaresh.Enabled=Ena";
Debug.ShouldStop(268435456);
act_main.mostCurrent._pnlsabtesefaresh.runMethod(true,"setEnabled",_ena);
 BA.debugLineNum = 478;BA.debugLine="pnlNewMoshtari.Enabled=Ena";
Debug.ShouldStop(536870912);
act_main.mostCurrent._pnlnewmoshtari.runMethod(true,"setEnabled",_ena);
 BA.debugLineNum = 479;BA.debugLine="pnlSendData.Enabled=Ena";
Debug.ShouldStop(1073741824);
act_main.mostCurrent._pnlsenddata.runMethod(true,"setEnabled",_ena);
 BA.debugLineNum = 480;BA.debugLine="PnlReport.Enabled=Ena";
Debug.ShouldStop(-2147483648);
act_main.mostCurrent._pnlreport.runMethod(true,"setEnabled",_ena);
 BA.debugLineNum = 481;BA.debugLine="PnlMoshtarian.Enabled=Ena";
Debug.ShouldStop(1);
act_main.mostCurrent._pnlmoshtarian.runMethod(true,"setEnabled",_ena);
 BA.debugLineNum = 482;BA.debugLine="Button1.Enabled=Ena";
Debug.ShouldStop(2);
act_main.mostCurrent._button1.runMethod(true,"setEnabled",_ena);
 BA.debugLineNum = 483;BA.debugLine="Button2.Enabled=Ena";
Debug.ShouldStop(4);
act_main.mostCurrent._button2.runMethod(true,"setEnabled",_ena);
 BA.debugLineNum = 484;BA.debugLine="Button3.Enabled=Ena";
Debug.ShouldStop(8);
act_main.mostCurrent._button3.runMethod(true,"setEnabled",_ena);
 BA.debugLineNum = 485;BA.debugLine="Button4.Enabled=Ena";
Debug.ShouldStop(16);
act_main.mostCurrent._button4.runMethod(true,"setEnabled",_ena);
 BA.debugLineNum = 486;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_datacheck_tick() throws Exception{
try {
		Debug.PushSubsStack("T_DataCheck_Tick (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,652);
if (RapidSub.canDelegate("t_datacheck_tick")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","t_datacheck_tick");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 652;BA.debugLine="Sub T_DataCheck_Tick";
Debug.ShouldStop(2048);
 BA.debugLineNum = 653;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(4096);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_main.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblLastSeen")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 654;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 655;BA.debugLine="LblText.Text = \"اطلاعات ارسال نشده وجود دارد\"";
Debug.ShouldStop(16384);
act_main.mostCurrent._lbltext.runMethod(true,"setText",BA.ObjectToCharSequence("اطلاعات ارسال نشده وجود دارد"));
 }else {
 BA.debugLineNum = 657;BA.debugLine="LblText.Text = \"\"";
Debug.ShouldStop(65536);
act_main.mostCurrent._lbltext.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_enterexit_tick() throws Exception{
try {
		Debug.PushSubsStack("T_EnterExit_tick (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,577);
if (RapidSub.canDelegate("t_enterexit_tick")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","t_enterexit_tick");}
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _cl = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapteenterexitvisitor");
RemoteObject _response = RemoteObject.createImmutable("");
 BA.debugLineNum = 577;BA.debugLine="Sub T_EnterExit_tick";
Debug.ShouldStop(1);
 BA.debugLineNum = 578;BA.debugLine="T_EnterExit.Enabled=False";
Debug.ShouldStop(2);
act_main._t_enterexit.runMethod(true,"setEnabled",act_main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 579;BA.debugLine="Dim Status As Int";
Debug.ShouldStop(4);
_status = RemoteObject.createImmutable(0);Debug.locals.put("Status", _status);
 BA.debugLineNum = 580;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(8);
if (act_main.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 581;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 582;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now";
Debug.ShouldStop(32);
_time = act_main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 583;BA.debugLine="Dim Date As String =MCode.DatePersian";
Debug.ShouldStop(64);
_date = act_main.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_main.mostCurrent.activityBA);Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 585;BA.debugLine="Dim cl As CameraPosition";
Debug.ShouldStop(256);
_cl = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cl", _cl);
 BA.debugLineNum = 586;BA.debugLine="cl.Initialize(gmap.MyLocation.Latitude,gmap.MyL";
Debug.ShouldStop(512);
_cl.runVoidMethod ("Initialize",(Object)(act_main.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLatitude")),(Object)(act_main.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLongitude")),(Object)(BA.numberCast(float.class, 15)));
 BA.debugLineNum = 587;BA.debugLine="gmap.AnimateCamera(cl)";
Debug.ShouldStop(1024);
act_main.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cl.getObject())));
 BA.debugLineNum = 588;BA.debugLine="Lat = gmap.MyLocation.Latitude";
Debug.ShouldStop(2048);
act_main.mostCurrent._lat = BA.NumberToString(act_main.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLatitude"));
 BA.debugLineNum = 589;BA.debugLine="Lon = gmap.MyLocation.Longitude";
Debug.ShouldStop(4096);
act_main.mostCurrent._lon = BA.NumberToString(act_main.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLongitude"));
 BA.debugLineNum = 590;BA.debugLine="Log(Lat)";
Debug.ShouldStop(8192);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52490381",act_main.mostCurrent._lat,0);
 BA.debugLineNum = 591;BA.debugLine="Log(Lon)";
Debug.ShouldStop(16384);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52490382",act_main.mostCurrent._lon,0);
 BA.debugLineNum = 592;BA.debugLine="gps.Stop";
Debug.ShouldStop(32768);
act_main._gps.runVoidMethod ("Stop");
 BA.debugLineNum = 596;BA.debugLine="If ModeEnterExit =True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_main._modeenterexit,act_main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 598;BA.debugLine="Status = 1";
Debug.ShouldStop(2097152);
_status = BA.numberCast(int.class, 1);Debug.locals.put("Status", _status);
 }else 
{ BA.debugLineNum = 599;BA.debugLine="Else If ModeEnterExit = False Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",act_main._modeenterexit,act_main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 601;BA.debugLine="Status = 0";
Debug.ShouldStop(16777216);
_status = BA.numberCast(int.class, 0);Debug.locals.put("Status", _status);
 }}
;
 BA.debugLineNum = 603;BA.debugLine="Dim Code As String=myCode.getSetting(\"OUT.dat\",";
Debug.ShouldStop(67108864);
_code = act_main.mostCurrent._mycode.runMethod(true,"_getsetting" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString("OUT.dat")),(Object)(BA.ObjectToString("CodeInput")),(Object)(BA.NumberToString(100)));Debug.locals.put("Code", _code);Debug.locals.put("Code", _code);
 BA.debugLineNum = 604;BA.debugLine="Dim item As AdapteEnterExitVisitor";
Debug.ShouldStop(134217728);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapteenterexitvisitor");Debug.locals.put("item", _item);
 BA.debugLineNum = 605;BA.debugLine="item.Initialize";
Debug.ShouldStop(268435456);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 606;BA.debugLine="item.fldCode=Code";
Debug.ShouldStop(536870912);
_item.setField ("fldCode" /*RemoteObject*/ ,_code);
 BA.debugLineNum = 607;BA.debugLine="item.fldType=Status";
Debug.ShouldStop(1073741824);
_item.setField ("fldType" /*RemoteObject*/ ,BA.NumberToString(_status));
 BA.debugLineNum = 608;BA.debugLine="item.fldDate=Date";
Debug.ShouldStop(-2147483648);
_item.setField ("fldDate" /*RemoteObject*/ ,_date);
 BA.debugLineNum = 609;BA.debugLine="item.fldTime=Time";
Debug.ShouldStop(1);
_item.setField ("fldTime" /*RemoteObject*/ ,_time);
 BA.debugLineNum = 610;BA.debugLine="item.fldLat=Lat";
Debug.ShouldStop(2);
_item.setField ("fldLat" /*RemoteObject*/ ,act_main.mostCurrent._lat);
 BA.debugLineNum = 611;BA.debugLine="item.fldLon=Lon";
Debug.ShouldStop(4);
_item.setField ("fldLon" /*RemoteObject*/ ,act_main.mostCurrent._lon);
 BA.debugLineNum = 612;BA.debugLine="Dim response As String = MCode.EnterExitVisito";
Debug.ShouldStop(8);
_response = act_main.mostCurrent._mcode.runMethod(true,"_enterexitvisitor" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(_item));Debug.locals.put("response", _response);Debug.locals.put("response", _response);
 BA.debugLineNum = 614;BA.debugLine="LogColor(response,Colors.red)";
Debug.ShouldStop(32);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52490405",_response,act_main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 615;BA.debugLine="Select Case response";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_response,BA.ObjectToString("Success"),BA.ObjectToString("DuplicateEnter"),BA.ObjectToString("DuplicateExit"),BA.ObjectToString("NoEnter"))) {
case 0: {
 BA.debugLineNum = 617;BA.debugLine="myCode.setSetting(\"OUT.dat\",\"input\",Status)";
Debug.ShouldStop(256);
act_main.mostCurrent._mycode.runVoidMethod ("_setsetting" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString("OUT.dat")),(Object)(BA.ObjectToString("input")),(Object)(BA.NumberToString(_status)));
 BA.debugLineNum = 618;BA.debugLine="If Status=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 619;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(1024);
if (act_main.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_main.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 622;BA.debugLine="myCode.setSetting(\"OUT.dat\",\"CodeInput\",Code";
Debug.ShouldStop(8192);
act_main.mostCurrent._mycode.runVoidMethod ("_setsetting" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString("OUT.dat")),(Object)(BA.ObjectToString("CodeInput")),(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _code),RemoteObject.createImmutable(1)}, "+",1, 0))));
 };
 BA.debugLineNum = 626;BA.debugLine="MsgboxAsync(\"عملیات با موفقیت انجام گردید\",\"";
Debug.ShouldStop(131072);
act_main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("عملیات با موفقیت انجام گردید")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),act_main.processBA);
 BA.debugLineNum = 627;BA.debugLine="Activity_Resume";
Debug.ShouldStop(262144);
_activity_resume();
 break; }
case 1: {
 BA.debugLineNum = 629;BA.debugLine="myCode.setSetting(\"OUT.dat\",\"input\",Status)";
Debug.ShouldStop(1048576);
act_main.mostCurrent._mycode.runVoidMethod ("_setsetting" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString("OUT.dat")),(Object)(BA.ObjectToString("input")),(Object)(BA.NumberToString(_status)));
 BA.debugLineNum = 630;BA.debugLine="ToastMessageShow(\"ورود شما قبلا ثبت شده است\"";
Debug.ShouldStop(2097152);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ورود شما قبلا ثبت شده است")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 631;BA.debugLine="Activity_Resume";
Debug.ShouldStop(4194304);
_activity_resume();
 break; }
case 2: {
 BA.debugLineNum = 633;BA.debugLine="myCode.setSetting(\"OUT.dat\",\"input\",Status)";
Debug.ShouldStop(16777216);
act_main.mostCurrent._mycode.runVoidMethod ("_setsetting" /*RemoteObject*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString("OUT.dat")),(Object)(BA.ObjectToString("input")),(Object)(BA.NumberToString(_status)));
 BA.debugLineNum = 634;BA.debugLine="ToastMessageShow(\"خروج شما قبلا ثبت شده است\"";
Debug.ShouldStop(33554432);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خروج شما قبلا ثبت شده است")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 635;BA.debugLine="Activity_Resume";
Debug.ShouldStop(67108864);
_activity_resume();
 break; }
case 3: {
 BA.debugLineNum = 637;BA.debugLine="ToastMessageShow(\"ورود شما ثبت نشده بدون ورو";
Debug.ShouldStop(268435456);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ورود شما ثبت نشده بدون ورود نمی توانید خروج ثبت کنید")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 638;BA.debugLine="Activity_Resume";
Debug.ShouldStop(536870912);
_activity_resume();
 break; }
default: {
 BA.debugLineNum = 640;BA.debugLine="ToastMessageShow(\"خطایی در ثبت حضور و غیاب ر";
Debug.ShouldStop(-2147483648);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطایی در ثبت حضور و غیاب رخ داده است")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 break; }
}
;
 BA.debugLineNum = 643;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
act_main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e57) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e57.toString()); BA.debugLineNum = 646;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","52490437",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 647;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"";
Debug.ShouldStop(64);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-T_EnterExit_tick"))));
 };
 };
 BA.debugLineNum = 650;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_exit_tick() throws Exception{
try {
		Debug.PushSubsStack("T_Exit_Tick (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,947);
if (RapidSub.canDelegate("t_exit_tick")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","t_exit_tick");}
 BA.debugLineNum = 947;BA.debugLine="Sub T_Exit_Tick";
Debug.ShouldStop(262144);
 BA.debugLineNum = 948;BA.debugLine="IntExit = 0";
Debug.ShouldStop(524288);
act_main._intexit = BA.numberCast(byte.class, 0);
 BA.debugLineNum = 949;BA.debugLine="T_Exit.Enabled = False";
Debug.ShouldStop(1048576);
act_main._t_exit.runMethod(true,"setEnabled",act_main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 950;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtcodemoshtari_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtCodeMoshtari_TextChanged (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1458);
if (RapidSub.canDelegate("txtcodemoshtari_textchanged")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","txtcodemoshtari_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1458;BA.debugLine="Sub txtCodeMoshtari_TextChanged (Old As String, Ne";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1459;BA.debugLine="If txtCodeMoshtari.Text.Length>14 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",act_main.mostCurrent._txtcodemoshtari.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 14))) { 
 BA.debugLineNum = 1460;BA.debugLine="txtCodeMoshtari.Text=Old";
Debug.ShouldStop(524288);
act_main.mostCurrent._txtcodemoshtari.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_old));
 BA.debugLineNum = 1461;BA.debugLine="txtCodeMoshtari.SelectionStart=txtCodeMoshtari.T";
Debug.ShouldStop(1048576);
act_main.mostCurrent._txtcodemoshtari.runMethod(true,"setSelectionStart",act_main.mostCurrent._txtcodemoshtari.runMethod(true,"getText").runMethod(true,"length"));
 };
 BA.debugLineNum = 1463;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("update_UpdateComplete (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1286);
if (RapidSub.canDelegate("update_updatecomplete")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","update_updatecomplete");}
 BA.debugLineNum = 1286;BA.debugLine="Sub update_UpdateComplete";
Debug.ShouldStop(32);
 BA.debugLineNum = 1287;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 1288;BA.debugLine="LogColor($\"UpdateComplete - time: ${DateTime.Tim";
Debug.ShouldStop(128);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","55046274",(RemoteObject.concat(RemoteObject.createImmutable("UpdateComplete - time: "),act_main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))),RemoteObject.createImmutable(""))),BA.numberCast(int.class, ((int)0xff556b2f)));
 BA.debugLineNum = 1289;BA.debugLine="apkupdt.StopSplashScreen";
Debug.ShouldStop(256);
act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_stopsplashscreen" /*RemoteObject*/ );
 BA.debugLineNum = 1291;BA.debugLine="Select apkupdt.Status";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_getstatus" /*RemoteObject*/ ),act_main.mostCurrent._apkupdt.getField(true,"_ok_curver" /*RemoteObject*/ ),act_main.mostCurrent._apkupdt.getField(true,"_ok_webver" /*RemoteObject*/ ),act_main.mostCurrent._apkupdt.getField(true,"_ok_newerapk" /*RemoteObject*/ ),act_main.mostCurrent._apkupdt.getField(true,"_no_newerapk" /*RemoteObject*/ ),act_main.mostCurrent._apkupdt.getField(true,"_ok_download" /*RemoteObject*/ ),act_main.mostCurrent._apkupdt.getField(true,"_ok_install" /*RemoteObject*/ ),act_main.mostCurrent._apkupdt.getField(true,"_err_noperm" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 1293;BA.debugLine="Log($\"Running apk version: ${apkupdt.CurVN}${C";
Debug.ShouldStop(4096);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","55046279",(RemoteObject.concat(RemoteObject.createImmutable("Running apk version: "),act_main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_getcurvn" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),act_main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_main.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""))),0);
 break; }
case 1: {
 BA.debugLineNum = 1295;BA.debugLine="Log($\"Webserver apk version: ${apkupdt.WebVN}$";
Debug.ShouldStop(16384);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","55046281",(RemoteObject.concat(RemoteObject.createImmutable("Webserver apk version: "),act_main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_getwebvn" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),act_main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_main.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""))),0);
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
 BA.debugLineNum = 1307;BA.debugLine="Log(\"No permission to install\")";
Debug.ShouldStop(67108864);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","55046293",RemoteObject.createImmutable("No permission to install"),0);
 break; }
default: {
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e18.toString()); BA.debugLineNum = 1313;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","55046299",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1314;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-update_UpdateComplete"))));
 };
 BA.debugLineNum = 1316;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateapp() throws Exception{
try {
		Debug.PushSubsStack("UpdateApp (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1203);
if (RapidSub.canDelegate("updateapp")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","updateapp");}
 BA.debugLineNum = 1203;BA.debugLine="Sub UpdateApp";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1204;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 1205;BA.debugLine="apkupdt.PackageName = \"ir.parsikhesab.pakhsh\"";
Debug.ShouldStop(1048576);
act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setpackagename" /*RemoteObject*/ ,BA.ObjectToString("ir.parsikhesab.pakhsh"));
 BA.debugLineNum = 1206;BA.debugLine="apkupdt.NewVerApk = MCode.LinkDownload";
Debug.ShouldStop(2097152);
act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setnewverapk",act_main.mostCurrent._mcode._linkdownload /*RemoteObject*/ );
 BA.debugLineNum = 1207;BA.debugLine="apkupdt.setCredentials(\"test\",\"test\")";
Debug.ShouldStop(4194304);
act_main.mostCurrent._apkupdt.runClassMethod (ir.parsikhesab.pakhsh.cl_appupdate.class, "_setcredentials" /*RemoteObject*/ ,(Object)(BA.ObjectToString("test")),(Object)(RemoteObject.createImmutable("test")));
 BA.debugLineNum = 1208;BA.debugLine="ButtonUpdate_Click";
Debug.ShouldStop(8388608);
_buttonupdate_click();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e7.toString()); BA.debugLineNum = 1210;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","54653063",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1211;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(67108864);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-UpdateApp"))));
 };
 BA.debugLineNum = 1216;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateversion() throws Exception{
try {
		Debug.PushSubsStack("UpdateVersion (act_main) ","act_main",1,act_main.mostCurrent.activityBA,act_main.mostCurrent,1193);
if (RapidSub.canDelegate("updateversion")) { return ir.parsikhesab.pakhsh.act_main.remoteMe.runUserSub(false, "act_main","updateversion");}
 BA.debugLineNum = 1193;BA.debugLine="Sub UpdateVersion";
Debug.ShouldStop(256);
 BA.debugLineNum = 1194;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 1195;BA.debugLine="GetVersion";
Debug.ShouldStop(1024);
_getversion();
 BA.debugLineNum = 1196;BA.debugLine="VerFlag=\"update\"";
Debug.ShouldStop(2048);
act_main.mostCurrent._verflag = BA.ObjectToString("update");
 BA.debugLineNum = 1197;BA.debugLine="ToastMessageShow(\"در حال بررسی ورژن نرم افزار .";
Debug.ShouldStop(4096);
act_main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("در حال بررسی ورژن نرم افزار . . .")),(Object)(act_main.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_main.processBA, e6.toString()); BA.debugLineNum = 1199;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
act_main.mostCurrent.__c.runVoidMethod ("LogImpl","54587526",BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1200;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32768);
act_main.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_main.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_main.mostCurrent.__c.runMethod(false,"LastException",act_main.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_main.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-UpdateVersion"))));
 };
 BA.debugLineNum = 1202;BA.debugLine="End Sub";
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