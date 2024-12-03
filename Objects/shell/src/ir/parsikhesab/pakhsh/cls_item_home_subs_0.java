package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_item_home_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_item_home._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_item_home._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_BK As Panel";
cls_item_home._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_item_home._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private imgV As ImageView";
cls_item_home._imgv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgv",cls_item_home._imgv);
 //BA.debugLineNum = 5;BA.debugLine="Private lblTitle As Label";
cls_item_home._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitle",cls_item_home._lbltitle);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_item_home) ","cls_item_home",68,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_item_home","getheight", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Return pnl_BK.Height+20dip";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight"),cls_item_home.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 1);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("getPanel (cls_item_home) ","cls_item_home",68,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_item_home","getpanel", __ref);}
 BA.debugLineNum = 18;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="pnl_BK.RemoveView";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 20;BA.debugLine="Return pnl_BK";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("getWidth (cls_item_home) ","cls_item_home",68,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_item_home","getwidth", __ref);}
 BA.debugLineNum = 25;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Return pnl_BK.Width+5dip";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth"),cls_item_home.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_item_home) ","cls_item_home",68,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_item_home","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(256);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 10;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(512);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_item_home.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_item_home.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 11;BA.debugLine="p.LoadLayout(\"l_item_home\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_item_home")),__ref.getField(false, "ba"));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("pnl_bk_Click (cls_item_home) ","cls_item_home",68,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("pnl_bk_click")) { return __ref.runUserSub(false, "cls_item_home","pnl_bk_click", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Private Sub pnl_bk_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("show (cls_item_home) ","cls_item_home",68,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_item_home","show", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 14;BA.debugLine="Public Sub show(item As AdapterItemHome)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="imgV.Bitmap=LoadBitmap(File.DirAssets,item.img)";
Debug.ShouldStop(16384);
__ref.getField(false,"_imgv" /*RemoteObject*/ ).runMethod(false,"setBitmap",(cls_item_home.__c.runMethod(false,"LoadBitmap",(Object)(cls_item_home.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_item.getField(true,"img" /*RemoteObject*/ ))).getObject()));
 BA.debugLineNum = 16;BA.debugLine="lblTitle.Text=item.title";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"title" /*RemoteObject*/ )));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}