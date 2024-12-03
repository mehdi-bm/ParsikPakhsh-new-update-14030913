package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_imageslideshow_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"L_Show_Image2\")";
Debug.ShouldStop(2097152);
act_imageslideshow.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Show_Image2")),act_imageslideshow.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="Hlv.Initializer(\"Hlv\").ListView.Horizontal.Build";
Debug.ShouldStop(4194304);
act_imageslideshow.mostCurrent._hlv.runMethod(false,"Initializer",act_imageslideshow.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Hlv"))).runMethod(false,"ListView").runMethod(false,"Horizontal").runVoidMethod ("Build");
 BA.debugLineNum = 24;BA.debugLine="lstLink.Initialize";
Debug.ShouldStop(8388608);
act_imageslideshow._lstlink.runVoidMethod ("Initialize");
 BA.debugLineNum = 25;BA.debugLine="lstGalleryOffline.Initialize";
Debug.ShouldStop(16777216);
act_imageslideshow.mostCurrent._lstgalleryoffline.runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="pnl_hlv.AddView(Hlv,0,0,96%x ,pnl_hlv.Height)";
Debug.ShouldStop(33554432);
act_imageslideshow.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_imageslideshow.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_imageslideshow.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 96)),act_imageslideshow.mostCurrent.activityBA)),(Object)(act_imageslideshow.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 27;BA.debugLine="MCode.page=\"Show_Image2\"";
Debug.ShouldStop(67108864);
act_imageslideshow.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Show_Image2");
 BA.debugLineNum = 28;BA.debugLine="Hlv.Show";
Debug.ShouldStop(134217728);
act_imageslideshow.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 29;BA.debugLine="LoadData";
Debug.ShouldStop(268435456);
_loaddata();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_imageslideshow.processBA, e11.toString()); BA.debugLineNum = 32;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
act_imageslideshow.mostCurrent.__c.runVoidMethod ("LogImpl","530539789",BA.ObjectToString(act_imageslideshow.mostCurrent.__c.runMethod(false,"LastException",act_imageslideshow.mostCurrent.activityBA)),0);
 BA.debugLineNum = 33;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1);
act_imageslideshow.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_imageslideshow.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_imageslideshow.mostCurrent.__c.runMethod(false,"LastException",act_imageslideshow.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_imageslideshow.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_KeyPress (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,217);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 217;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_imageslideshow.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 219;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
act_imageslideshow.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 221;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return act_imageslideshow.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,228);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 228;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,224);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","activity_resume");}
 BA.debugLineNum = 224;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Application_Error (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,231);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 231;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(64);
 BA.debugLineNum = 233;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) return act_imageslideshow.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("btn_back_Click (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,145);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","btn_back_click");}
 BA.debugLineNum = 145;BA.debugLine="Private Sub btn_back_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
act_imageslideshow.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _btnnext_click() throws Exception{
try {
		Debug.PushSubsStack("btnNext_Click (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,124);
if (RapidSub.canDelegate("btnnext_click")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","btnnext_click");}
 BA.debugLineNum = 124;BA.debugLine="Private Sub btnNext_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="If pos<lstLink.Size Then pos=pos+1";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",act_imageslideshow._pos,BA.numberCast(double.class, act_imageslideshow._lstlink.runMethod(true,"getSize")))) { 
act_imageslideshow._pos = RemoteObject.solve(new RemoteObject[] {act_imageslideshow._pos,RemoteObject.createImmutable(1)}, "+",1, 1);};
 BA.debugLineNum = 126;BA.debugLine="Hlv.SmoothScrollToPosition(pos)";
Debug.ShouldStop(536870912);
act_imageslideshow.mostCurrent._hlv.runVoidMethod ("SmoothScrollToPosition",(Object)(act_imageslideshow._pos));
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnprev_click() throws Exception{
try {
		Debug.PushSubsStack("btnPrev_Click (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,119);
if (RapidSub.canDelegate("btnprev_click")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","btnprev_click");}
 BA.debugLineNum = 119;BA.debugLine="Private Sub btnPrev_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="If pos>0 Then pos=pos-1";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",act_imageslideshow._pos,BA.numberCast(double.class, 0))) { 
act_imageslideshow._pos = RemoteObject.solve(new RemoteObject[] {act_imageslideshow._pos,RemoteObject.createImmutable(1)}, "-",1, 1);};
 BA.debugLineNum = 121;BA.debugLine="Hlv.SmoothScrollToPosition(pos)";
Debug.ShouldStop(16777216);
act_imageslideshow.mostCurrent._hlv.runVoidMethod ("SmoothScrollToPosition",(Object)(act_imageslideshow._pos));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eventname_onscrollstatechanged(RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("EventName_onScrollStateChanged (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,129);
if (RapidSub.canDelegate("eventname_onscrollstatechanged")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","eventname_onscrollstatechanged", _state);}
Debug.locals.put("State", _state);
 BA.debugLineNum = 129;BA.debugLine="Private Sub EventName_onScrollStateChanged (State";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Select (State)";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt((_state),act_imageslideshow.mostCurrent._hlv.getField(true,"SCROLL_STATE_DRAGGING"),act_imageslideshow.mostCurrent._hlv.getField(true,"SCROLL_STATE_IDLE"),act_imageslideshow.mostCurrent._hlv.getField(true,"SCROLL_STATE_SETTLING"))) {
case 0: {
 BA.debugLineNum = 132;BA.debugLine="Log(\"DRAGGING\")";
Debug.ShouldStop(8);
act_imageslideshow.mostCurrent.__c.runVoidMethod ("LogImpl","530998531",RemoteObject.createImmutable("DRAGGING"),0);
 break; }
case 1: {
 BA.debugLineNum = 134;BA.debugLine="Log(\"IDLE\")";
Debug.ShouldStop(32);
act_imageslideshow.mostCurrent.__c.runVoidMethod ("LogImpl","530998533",RemoteObject.createImmutable("IDLE"),0);
 break; }
case 2: {
 BA.debugLineNum = 136;BA.debugLine="Log(\"SETTLING\")";
Debug.ShouldStop(128);
act_imageslideshow.mostCurrent.__c.runVoidMethod ("LogImpl","530998535",RemoteObject.createImmutable("SETTLING"),0);
 break; }
}
;
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 13;BA.debugLine="Dim lstGalleryOffline As List";
act_imageslideshow.mostCurrent._lstgalleryoffline = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 14;BA.debugLine="Private Hlv As Hitex_LayoutView";
act_imageslideshow.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 15;BA.debugLine="Private pnl_hlv As Panel";
act_imageslideshow.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private pos As Int=0";
act_imageslideshow._pos = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("Hlv_GetItemCount (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,113);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","hlv_getitemcount");}
 BA.debugLineNum = 113;BA.debugLine="Sub Hlv_GetItemCount As Int 								        '$ Ite";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Return lstLink.Size '/ItemList.Size";
Debug.ShouldStop(131072);
if (true) return act_imageslideshow._lstlink.runMethod(true,"getSize");
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Hlv_onBindViewHolder (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,106);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","hlv_onbindviewholder", _parent, _position);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_imageslideshow");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 106;BA.debugLine="Sub Hlv_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="Dim rec As cls_ImageSlideShow = Parent.Tag";
Debug.ShouldStop(1024);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 108;BA.debugLine="rec.show(lstLink,Position,Item)";
Debug.ShouldStop(2048);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_imageslideshow.class, "_show" /*RemoteObject*/ ,(Object)(act_imageslideshow._lstlink),(Object)(_position),(Object)(act_imageslideshow._item));
 BA.debugLineNum = 109;BA.debugLine="Parent.Width=rec.Width";
Debug.ShouldStop(4096);
_parent.runMethod(true,"setWidth",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_imageslideshow.class, "_getwidth" /*RemoteObject*/ ));
 BA.debugLineNum = 110;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(8192);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_imageslideshow.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Hlv_onCreateViewHolder (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,99);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_imageslideshow");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 99;BA.debugLine="Sub Hlv_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Dim rec As cls_ImageSlideShow";
Debug.ShouldStop(8);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_imageslideshow");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 101;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(16);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_imageslideshow.class, "_initialize" /*RemoteObject*/ ,act_imageslideshow.mostCurrent.activityBA,(Object)(act_imageslideshow.getObject()));
 BA.debugLineNum = 102;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,100%y)";
Debug.ShouldStop(32);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_imageslideshow.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_imageslideshow.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_imageslideshow.mostCurrent.activityBA)),(Object)(act_imageslideshow.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_imageslideshow.mostCurrent.activityBA)));
 BA.debugLineNum = 103;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(64);
_parent.runMethod(false,"setTag",(_rec));
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
public static RemoteObject  _hlv_onscrolllistener(RemoteObject _dx,RemoteObject _dy) throws Exception{
try {
		Debug.PushSubsStack("Hlv_onScrollListener (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,140);
if (RapidSub.canDelegate("hlv_onscrolllistener")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","hlv_onscrolllistener", _dx, _dy);}
Debug.locals.put("dx", _dx);
Debug.locals.put("dy", _dy);
 BA.debugLineNum = 140;BA.debugLine="Private Sub Hlv_onScrollListener (dx As Int,dy As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="pos = Hlv.GetVisibleItemPosition(True,False)";
Debug.ShouldStop(4096);
act_imageslideshow._pos = act_imageslideshow.mostCurrent._hlv.runMethod(true,"GetVisibleItemPosition",(Object)(act_imageslideshow.mostCurrent.__c.getField(true,"True")),(Object)(act_imageslideshow.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("LoadData (act_imageslideshow) ","act_imageslideshow",15,act_imageslideshow.mostCurrent.activityBA,act_imageslideshow.mostCurrent,37);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_imageslideshow.remoteMe.runUserSub(false, "act_imageslideshow","loaddata");}
RemoteObject _defaultpath = RemoteObject.createImmutable("");
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 37;BA.debugLine="Sub LoadData";
Debug.ShouldStop(16);
 BA.debugLineNum = 41;BA.debugLine="Dim DefaultPath As String=\"\"";
Debug.ShouldStop(256);
_defaultpath = BA.ObjectToString("");Debug.locals.put("DefaultPath", _defaultpath);Debug.locals.put("DefaultPath", _defaultpath);
 BA.debugLineNum = 42;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 43;BA.debugLine="Dim Link As String";
Debug.ShouldStop(1024);
_link = RemoteObject.createImmutable("");Debug.locals.put("Link", _link);
 BA.debugLineNum = 44;BA.debugLine="If MCode.PicOnline=1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",act_imageslideshow.mostCurrent._mcode._piconline /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 45;BA.debugLine="If Item.fldPathPic=\"0\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",act_imageslideshow._item.getField(true,"fldPathPic" /*RemoteObject*/ ),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 48;BA.debugLine="DefaultPath=MCode.GetPicKalaPath(Item.CodeKala";
Debug.ShouldStop(32768);
_defaultpath = act_imageslideshow.mostCurrent._mcode.runMethod(true,"_getpickalapath" /*RemoteObject*/ ,act_imageslideshow.mostCurrent.activityBA,(Object)(act_imageslideshow._item.getField(true,"CodeKala" /*RemoteObject*/ )));Debug.locals.put("DefaultPath", _defaultpath);
 BA.debugLineNum = 49;BA.debugLine="lstLink.Add(DefaultPath)";
Debug.ShouldStop(65536);
act_imageslideshow._lstlink.runVoidMethod ("Add",(Object)((_defaultpath)));
 }else {
 BA.debugLineNum = 51;BA.debugLine="DefaultPath=MCode.ImageUrl &Item.fldPathPic";
Debug.ShouldStop(262144);
_defaultpath = RemoteObject.concat(act_imageslideshow.mostCurrent._mcode._imageurl /*RemoteObject*/ ,act_imageslideshow._item.getField(true,"fldPathPic" /*RemoteObject*/ ));Debug.locals.put("DefaultPath", _defaultpath);
 BA.debugLineNum = 52;BA.debugLine="lstLink.Add(DefaultPath)";
Debug.ShouldStop(524288);
act_imageslideshow._lstlink.runVoidMethod ("Add",(Object)((_defaultpath)));
 };
 }else {
 BA.debugLineNum = 58;BA.debugLine="DefaultPath=MCode.GetPicKalaPath(Item.CodeKala)";
Debug.ShouldStop(33554432);
_defaultpath = act_imageslideshow.mostCurrent._mcode.runMethod(true,"_getpickalapath" /*RemoteObject*/ ,act_imageslideshow.mostCurrent.activityBA,(Object)(act_imageslideshow._item.getField(true,"CodeKala" /*RemoteObject*/ )));Debug.locals.put("DefaultPath", _defaultpath);
 BA.debugLineNum = 59;BA.debugLine="lstLink.Add(DefaultPath)";
Debug.ShouldStop(67108864);
act_imageslideshow._lstlink.runVoidMethod ("Add",(Object)((_defaultpath)));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_imageslideshow.processBA, e17.toString()); BA.debugLineNum = 63;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
act_imageslideshow.mostCurrent.__c.runVoidMethod ("LogImpl","530605338",BA.ObjectToString(act_imageslideshow.mostCurrent.__c.runMethod(false,"LastException",act_imageslideshow.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 76;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select * from TblG";
Debug.ShouldStop(2048);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_imageslideshow.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_imageslideshow.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblGalleryPic where fldShow='1' and fldCodeKala='"),act_imageslideshow._item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 77;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 79;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(16384);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21) ;_i = ((int)(0 + _i + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 80;BA.debugLine="cu.Position=i";
Debug.ShouldStop(32768);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 81;BA.debugLine="lstLink.Add(MCode.ImageUrl &cu.GetString(\"fldIm";
Debug.ShouldStop(65536);
act_imageslideshow._lstlink.runVoidMethod ("Add",(Object)((RemoteObject.concat(act_imageslideshow.mostCurrent._mcode._imageurl /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldImage")))))));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 84;BA.debugLine="lstGalleryOffline=MCode.GetListGalleryKala(Item.";
Debug.ShouldStop(524288);
act_imageslideshow.mostCurrent._lstgalleryoffline = act_imageslideshow.mostCurrent._mcode.runMethod(false,"_getlistgallerykala" /*RemoteObject*/ ,act_imageslideshow.mostCurrent.activityBA,(Object)(act_imageslideshow._item.getField(true,"CodeKala" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="If lstGalleryOffline.Size>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",act_imageslideshow.mostCurrent._lstgalleryoffline.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 88;BA.debugLine="For i=0 To lstGalleryOffline.Size-1";
Debug.ShouldStop(8388608);
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {act_imageslideshow.mostCurrent._lstgalleryoffline.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 89;BA.debugLine="cu.Position=i";
Debug.ShouldStop(16777216);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 90;BA.debugLine="Dim filename As String=lstGalleryOffline.Get(i";
Debug.ShouldStop(33554432);
_filename = BA.ObjectToString(act_imageslideshow.mostCurrent._lstgalleryoffline.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 91;BA.debugLine="DefaultPath=File.Combine(File.DirDefaultExtern";
Debug.ShouldStop(67108864);
_defaultpath = act_imageslideshow.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(act_imageslideshow.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/parsik/GalleryKala/"),act_imageslideshow._item.getField(true,"CodeKala" /*RemoteObject*/ ))),(Object)(_filename));Debug.locals.put("DefaultPath", _defaultpath);
 BA.debugLineNum = 92;BA.debugLine="lstLink.Add(DefaultPath)";
Debug.ShouldStop(134217728);
act_imageslideshow._lstlink.runVoidMethod ("Add",(Object)((_defaultpath)));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 96;BA.debugLine="Hlv.notifyDataSetChanged";
Debug.ShouldStop(-2147483648);
act_imageslideshow.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 97;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Dim Item As AdapterListKala";
act_imageslideshow._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
 //BA.debugLineNum = 8;BA.debugLine="Dim lstLink As List";
act_imageslideshow._lstlink = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}