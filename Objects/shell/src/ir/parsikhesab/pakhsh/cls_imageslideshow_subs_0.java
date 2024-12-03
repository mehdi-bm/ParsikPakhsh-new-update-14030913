package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_imageslideshow_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_imageslideshow._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_imageslideshow._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_imageslideshow._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_imageslideshow._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private base As B4XView";
cls_imageslideshow._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",cls_imageslideshow._base);
 //BA.debugLineNum = 5;BA.debugLine="Private ImageRow As ImageView";
cls_imageslideshow._imagerow = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imagerow",cls_imageslideshow._imagerow);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_imageslideshow) ","cls_imageslideshow",67,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_imageslideshow","getheight", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getPanel (cls_imageslideshow) ","cls_imageslideshow",67,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_imageslideshow","getpanel", __ref);}
 BA.debugLineNum = 23;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 25;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("getWidth (cls_imageslideshow) ","cls_imageslideshow",67,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_imageslideshow","getwidth", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Return pnl_bk.Width";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth");
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mdl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_imageslideshow) ","cls_imageslideshow",67,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_imageslideshow","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="base = mdl";
Debug.ShouldStop(512);
__ref.getField(false,"_base" /*RemoteObject*/ ).setObject (_mdl);
 BA.debugLineNum = 11;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 12;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(2048);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_imageslideshow.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_imageslideshow.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 13;BA.debugLine="p.LoadLayout(\"L_ImageSlide\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_ImageSlide")),__ref.getField(false, "ba"));
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _link,RemoteObject _position,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_imageslideshow) ","cls_imageslideshow",67,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_imageslideshow","show", __ref, _link, _position, _item);}
Debug.locals.put("Link", _link);
Debug.locals.put("Position", _position);
Debug.locals.put("item", _item);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Show(Link As List,Position As Int,item";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(item.CodeKala)";
Debug.ShouldStop(262144);
cls_imageslideshow._mcode._placeholder /*RemoteObject*/  = cls_imageslideshow._mcode.runMethod(false,"_getpickala" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"CodeKala" /*RemoteObject*/ )));
 BA.debugLineNum = 20;BA.debugLine="ImageRow.Bitmap=MCode.placeHolder";
Debug.ShouldStop(524288);
__ref.getField(false,"_imagerow" /*RemoteObject*/ ).runMethod(false,"setBitmap",(cls_imageslideshow._mcode._placeholder /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}