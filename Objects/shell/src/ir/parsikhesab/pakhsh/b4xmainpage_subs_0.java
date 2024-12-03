package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",54,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"l_Splash\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("l_Splash")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="ShowSplash";
Debug.ShouldStop(4194304);
__ref.runClassMethod (ir.parsikhesab.pakhsh.b4xmainpage.class, "_showsplash" /*RemoteObject*/ );
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView 'ignore";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI 'ignore";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 5;BA.debugLine="Dim T_Gif As Timer";
b4xmainpage._t_gif = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_t_gif",b4xmainpage._t_gif);
 //BA.debugLineNum = 6;BA.debugLine="Private lblTitle As Label";
b4xmainpage._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitle",b4xmainpage._lbltitle);
 //BA.debugLineNum = 7;BA.debugLine="Private lblVer As Label";
b4xmainpage._lblver = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblver",b4xmainpage._lblver);
 //BA.debugLineNum = 8;BA.debugLine="Private pnlLogo As Panel";
b4xmainpage._pnllogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnllogo",b4xmainpage._pnllogo);
 //BA.debugLineNum = 9;BA.debugLine="Private pnlTitle As Panel";
b4xmainpage._pnltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnltitle",b4xmainpage._pnltitle);
 //BA.debugLineNum = 10;BA.debugLine="Private pnlVer As Panel";
b4xmainpage._pnlver = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlver",b4xmainpage._pnlver);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",54,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Return Me";
Debug.ShouldStop(16384);
if (true) return __ref;
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showsplash(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowSplash (b4xmainpage) ","b4xmainpage",54,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("showsplash")) { return __ref.runUserSub(false, "b4xmainpage","showsplash", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Sub ShowSplash";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 28;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(134217728);
b4xmainpage._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="MCode.UpdateDataBase";
Debug.ShouldStop(268435456);
b4xmainpage._mcode.runVoidMethod ("_updatedatabase" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="StopService(FusedLocationService)";
Debug.ShouldStop(-2147483648);
b4xmainpage.__c.runVoidMethod ("StopService",__ref.getField(false, "ba"),(Object)((b4xmainpage._fusedlocationservice.getObject())));
 BA.debugLineNum = 33;BA.debugLine="Service_Gps.GPS1.Stop";
Debug.ShouldStop(1);
b4xmainpage._service_gps._gps1 /*RemoteObject*/ .runVoidMethod ("Stop");
 BA.debugLineNum = 34;BA.debugLine="MCode.GpsIsEnable=False";
Debug.ShouldStop(2);
b4xmainpage._mcode._gpsisenable /*RemoteObject*/  = b4xmainpage.__c.getField(true,"False");
 BA.debugLineNum = 37;BA.debugLine="T_Gif.Initialize(\"T_Gif\",3000)";
Debug.ShouldStop(16);
__ref.getField(false,"_t_gif" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("T_Gif")),(Object)(BA.numberCast(long.class, 3000)));
 BA.debugLineNum = 38;BA.debugLine="T_Gif.Enabled=True";
Debug.ShouldStop(32);
__ref.getField(false,"_t_gif" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="lblTitle.Text=Application.LabelName";
Debug.ShouldStop(128);
__ref.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(b4xmainpage.__c.getField(false,"Application").runMethod(true,"getLabelName")));
 BA.debugLineNum = 41;BA.debugLine="lblVer.Text=\"نسخه \"&Application.VersionName";
Debug.ShouldStop(256);
__ref.getField(false,"_lblver" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نسخه "),b4xmainpage.__c.getField(false,"Application").runMethod(true,"getVersionName"))));
 BA.debugLineNum = 46;BA.debugLine="If MCode.Vaziat=1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",b4xmainpage._mcode._vaziat /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 50;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
b4xmainpage.__c.runVoidMethod ("LogImpl","586704152",BA.ObjectToString(b4xmainpage.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_gif_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("T_Gif_Tick (b4xmainpage) ","b4xmainpage",54,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("t_gif_tick")) { return __ref.runUserSub(false, "b4xmainpage","t_gif_tick", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Sub T_Gif_Tick";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="T_Gif.Enabled=False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_t_gif" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="StartActivity(Act_Main)";
Debug.ShouldStop(134217728);
b4xmainpage.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((b4xmainpage._act_main.getObject())));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}