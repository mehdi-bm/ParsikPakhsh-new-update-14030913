package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_rec_video_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_rec_video._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_rec_video._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_rec_video._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_rec_video._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private base As Object";
cls_rec_video._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_rec_video._base);
 //BA.debugLineNum = 5;BA.debugLine="Private Key As IME";
cls_rec_video._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_key",cls_rec_video._key);
 //BA.debugLineNum = 7;BA.debugLine="Dim item As AdapterListVideo";
cls_rec_video._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistvideo");__ref.setField("_item",cls_rec_video._item);
 //BA.debugLineNum = 8;BA.debugLine="Private lblTitle As Label";
cls_rec_video._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitle",cls_rec_video._lbltitle);
 //BA.debugLineNum = 9;BA.debugLine="Private imgV As ImageView";
cls_rec_video._imgv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgv",cls_rec_video._imgv);
 //BA.debugLineNum = 10;BA.debugLine="Private lblPlay As Label";
cls_rec_video._lblplay = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblplay",cls_rec_video._lblplay);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_rec_video) ","cls_rec_video",80,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_rec_video","getheight", __ref);}
 BA.debugLineNum = 54;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 56;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getPanel (cls_rec_video) ","cls_rec_video",80,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_rec_video","getpanel", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 60;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _glide_ongetbitmap(RemoteObject __ref,RemoteObject _tag,RemoteObject _getbitmap) throws Exception{
try {
		Debug.PushSubsStack("Glide_onGetBitmap (cls_rec_video) ","cls_rec_video",80,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("glide_ongetbitmap")) { return __ref.runUserSub(false, "cls_rec_video","glide_ongetbitmap", __ref, _tag, _getbitmap);}
Debug.locals.put("Tag", _tag);
Debug.locals.put("getBitmap", _getbitmap);
 BA.debugLineNum = 48;BA.debugLine="Sub Glide_onGetBitmap (Tag As Object, getBitmap As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Log(Tag)";
Debug.ShouldStop(65536);
cls_rec_video.__c.runVoidMethod ("LogImpl","5100466689",BA.ObjectToString(_tag),0);
 BA.debugLineNum = 50;BA.debugLine="Log(getBitmap)";
Debug.ShouldStop(131072);
cls_rec_video.__c.runVoidMethod ("LogImpl","5100466690",BA.ObjectToString(_getbitmap),0);
 BA.debugLineNum = 51;BA.debugLine="imgV.Bitmap = getBitmap";
Debug.ShouldStop(262144);
__ref.getField(false,"_imgv" /*RemoteObject*/ ).runMethod(false,"setBitmap",(_getbitmap.getObject()));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mdl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_rec_video) ","cls_rec_video",80,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_rec_video","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 15;BA.debugLine="base = mdl";
Debug.ShouldStop(16384);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 16;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_key" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 17;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 18;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(131072);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_rec_video.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_rec_video.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 19;BA.debugLine="p.LoadLayout(\"l_rec_video\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_rec_video")),__ref.getField(false, "ba"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 24;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(8388608);
cls_rec_video._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_rec_video.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 25;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
cls_rec_video.__c.runVoidMethod ("LogImpl","5100335628",BA.ObjectToString(cls_rec_video.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
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
public static RemoteObject  _lblplay_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblPlay_Click (cls_rec_video) ","cls_rec_video",80,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("lblplay_click")) { return __ref.runUserSub(false, "cls_rec_video","lblplay_click", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Private Sub lblPlay_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="CallSubDelayed2(Act_Video,\"LoadVideo\",item)";
Debug.ShouldStop(1);
cls_rec_video.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((cls_rec_video._act_video.getObject())),(Object)(BA.ObjectToString("LoadVideo")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Show (cls_rec_video) ","cls_rec_video",80,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_rec_video","show", __ref, _item1, _position);}
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _glide = RemoteObject.declareNull("com.glide.Hitex_Glide");
RemoteObject _requestoptions = RemoteObject.declareNull("com.glide.Hitex_RequestOptions");
Debug.locals.put("Item1", _item1);
Debug.locals.put("position", _position);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Show(Item1 As AdapterListVideo,position";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="item=Item1";
Debug.ShouldStop(536870912);
__ref.setField ("_item" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 31;BA.debugLine="lblTitle.Text=Item1.fldTitle";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldTitle" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="Dim Link As String=item.fldImage";
Debug.ShouldStop(-2147483648);
_link = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldImage" /*RemoteObject*/ );Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 35;BA.debugLine="Dim Glide As Hitex_Glide";
Debug.ShouldStop(4);
_glide = RemoteObject.createNew ("com.glide.Hitex_Glide");Debug.locals.put("Glide", _glide);
 BA.debugLineNum = 38;BA.debugLine="Dim RequestOptions As Hitex_RequestOptions";
Debug.ShouldStop(32);
_requestoptions = RemoteObject.createNew ("com.glide.Hitex_RequestOptions");Debug.locals.put("RequestOptions", _requestoptions);
 BA.debugLineNum = 39;BA.debugLine="RequestOptions.Initialize.FitCenter";
Debug.ShouldStop(64);
_requestoptions.runMethod(false,"Initialize").runVoidMethod ("FitCenter");
 BA.debugLineNum = 41;BA.debugLine="Glide.GetBitmap2(\"Glide\", item.fldTitle, Link, Re";
Debug.ShouldStop(256);
_glide.runVoidMethod ("GetBitmap2",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Glide")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldTitle" /*RemoteObject*/ ))),(Object)(_link),(Object)(_requestoptions));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}