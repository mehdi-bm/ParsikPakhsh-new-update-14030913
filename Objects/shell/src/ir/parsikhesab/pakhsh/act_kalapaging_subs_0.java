package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_kalapaging_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,17);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 17;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 19;BA.debugLine="Activity.LoadLayout(\"L_KalaPaging_2\")";
Debug.ShouldStop(262144);
act_kalapaging.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_KalaPaging_2")),act_kalapaging.mostCurrent.activityBA);
 BA.debugLineNum = 20;BA.debugLine="Hlv.Initializer(\"hlv\").ListView.Horizontal.Build";
Debug.ShouldStop(524288);
act_kalapaging.mostCurrent._hlv.runMethod(false,"Initializer",act_kalapaging.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("hlv"))).runMethod(false,"ListView").runMethod(false,"Horizontal").runVoidMethod ("Build");
 BA.debugLineNum = 22;BA.debugLine="pnl_hlv.AddView(Hlv,0,0,96%x ,pnl_hlv.Height)";
Debug.ShouldStop(2097152);
act_kalapaging.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_kalapaging.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_kalapaging.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 96)),act_kalapaging.mostCurrent.activityBA)),(Object)(act_kalapaging.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 23;BA.debugLine="Hlv.Show";
Debug.ShouldStop(4194304);
act_kalapaging.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kalapaging.processBA, e7.toString()); BA.debugLineNum = 25;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
act_kalapaging.mostCurrent.__c.runVoidMethod ("LogImpl","540042504",BA.ObjectToString(act_kalapaging.mostCurrent.__c.runMethod(false,"LastException",act_kalapaging.mostCurrent.activityBA)),0);
 BA.debugLineNum = 26;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(33554432);
act_kalapaging.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kalapaging.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kalapaging.mostCurrent.__c.runMethod(false,"LastException",act_kalapaging.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kalapaging.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","activity_resume");}
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Application_Error (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,108);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 108;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(2048);
 BA.debugLineNum = 110;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) return act_kalapaging.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("btn_back_Click (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,79);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","btn_back_click");}
 BA.debugLineNum = 79;BA.debugLine="Private Sub btn_back_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
act_kalapaging.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("btnNext_Click (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,88);
if (RapidSub.canDelegate("btnnext_click")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","btnnext_click");}
 BA.debugLineNum = 88;BA.debugLine="Private Sub btnNext_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="If pos<listKala.Size Then pos=pos+1";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("<",act_kalapaging._pos,BA.numberCast(double.class, act_kalapaging._listkala.runMethod(true,"getSize")))) { 
act_kalapaging._pos = RemoteObject.solve(new RemoteObject[] {act_kalapaging._pos,RemoteObject.createImmutable(1)}, "+",1, 1);};
 BA.debugLineNum = 90;BA.debugLine="Hlv.SmoothScrollToPosition(pos)";
Debug.ShouldStop(33554432);
act_kalapaging.mostCurrent._hlv.runVoidMethod ("SmoothScrollToPosition",(Object)(act_kalapaging._pos));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("btnPrev_Click (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,83);
if (RapidSub.canDelegate("btnprev_click")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","btnprev_click");}
 BA.debugLineNum = 83;BA.debugLine="Private Sub btnPrev_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="If pos>0 Then pos=pos-1";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",act_kalapaging._pos,BA.numberCast(double.class, 0))) { 
act_kalapaging._pos = RemoteObject.solve(new RemoteObject[] {act_kalapaging._pos,RemoteObject.createImmutable(1)}, "-",1, 1);};
 BA.debugLineNum = 85;BA.debugLine="Hlv.SmoothScrollToPosition(pos)";
Debug.ShouldStop(1048576);
act_kalapaging.mostCurrent._hlv.runVoidMethod ("SmoothScrollToPosition",(Object)(act_kalapaging._pos));
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
public static RemoteObject  _eventname_onscrollstatechanged(RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("EventName_onScrollStateChanged (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,93);
if (RapidSub.canDelegate("eventname_onscrollstatechanged")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","eventname_onscrollstatechanged", _state);}
Debug.locals.put("State", _state);
 BA.debugLineNum = 93;BA.debugLine="Private Sub EventName_onScrollStateChanged (State";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Select (State)";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt((_state),act_kalapaging.mostCurrent._hlv.getField(true,"SCROLL_STATE_DRAGGING"),act_kalapaging.mostCurrent._hlv.getField(true,"SCROLL_STATE_IDLE"),act_kalapaging.mostCurrent._hlv.getField(true,"SCROLL_STATE_SETTLING"))) {
case 0: {
 BA.debugLineNum = 96;BA.debugLine="Log(\"DRAGGING\")";
Debug.ShouldStop(-2147483648);
act_kalapaging.mostCurrent.__c.runVoidMethod ("LogImpl","540697859",RemoteObject.createImmutable("DRAGGING"),0);
 break; }
case 1: {
 BA.debugLineNum = 98;BA.debugLine="Log(\"IDLE\")";
Debug.ShouldStop(2);
act_kalapaging.mostCurrent.__c.runVoidMethod ("LogImpl","540697861",RemoteObject.createImmutable("IDLE"),0);
 break; }
case 2: {
 BA.debugLineNum = 100;BA.debugLine="Log(\"SETTLING\")";
Debug.ShouldStop(8);
act_kalapaging.mostCurrent.__c.runVoidMethod ("LogImpl","540697863",RemoteObject.createImmutable("SETTLING"),0);
 break; }
}
;
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private Hlv As Hitex_LayoutView";
act_kalapaging.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 13;BA.debugLine="Private pnl_hlv As Panel";
act_kalapaging.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private pos As Int=0";
act_kalapaging._pos = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("hlv_GetItemCount (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,75);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","hlv_getitemcount");}
 BA.debugLineNum = 75;BA.debugLine="Sub hlv_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Return listKala.Size '/ItemList.Size";
Debug.ShouldStop(2048);
if (true) return act_kalapaging._listkala.runMethod(true,"getSize");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("hlv_onBindViewHolder (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,69);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","hlv_onbindviewholder", _parent, _position);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_kalapaging");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 69;BA.debugLine="Sub hlv_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Dim rec As cls_KalaPaging = Parent.Tag";
Debug.ShouldStop(32);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 71;BA.debugLine="rec.show(listKala.Get(Position))";
Debug.ShouldStop(64);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_show" /*RemoteObject*/ ,(Object)((act_kalapaging._listkala.runMethod(false,"Get",(Object)(_position)))));
 BA.debugLineNum = 72;BA.debugLine="Parent.Width=rec.Width";
Debug.ShouldStop(128);
_parent.runMethod(true,"setWidth",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_getwidth" /*RemoteObject*/ ));
 BA.debugLineNum = 73;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(256);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("hlv_onCreateViewHolder (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,63);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_kalapaging");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 63;BA.debugLine="Private Sub hlv_onCreateViewHolder (Parent As Pane";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Dim rec As cls_KalaPaging";
Debug.ShouldStop(-2147483648);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_kalapaging");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 65;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(1);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_initialize" /*RemoteObject*/ ,act_kalapaging.mostCurrent.activityBA,(Object)(act_kalapaging.getObject()));
 BA.debugLineNum = 66;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,100%y)";
Debug.ShouldStop(2);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_kalapaging.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_kalapaging.mostCurrent.activityBA)),(Object)(act_kalapaging.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_kalapaging.mostCurrent.activityBA)));
 BA.debugLineNum = 67;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(4);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Hlv_onScrollListener (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,104);
if (RapidSub.canDelegate("hlv_onscrolllistener")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","hlv_onscrolllistener", _dx, _dy);}
Debug.locals.put("dx", _dx);
Debug.locals.put("dy", _dy);
 BA.debugLineNum = 104;BA.debugLine="Private Sub Hlv_onScrollListener (dx As Int,dy As";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="pos = Hlv.GetVisibleItemPosition(True,False)";
Debug.ShouldStop(256);
act_kalapaging._pos = act_kalapaging.mostCurrent._hlv.runMethod(true,"GetVisibleItemPosition",(Object)(act_kalapaging.mostCurrent.__c.getField(true,"True")),(Object)(act_kalapaging.mostCurrent.__c.getField(true,"False")));
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
public static RemoteObject  _panel3_click() throws Exception{
try {
		Debug.PushSubsStack("Panel3_Click (act_kalapaging) ","act_kalapaging",18,act_kalapaging.mostCurrent.activityBA,act_kalapaging.mostCurrent,51);
if (RapidSub.canDelegate("panel3_click")) { return ir.parsikhesab.pakhsh.act_kalapaging.remoteMe.runUserSub(false, "act_kalapaging","panel3_click");}
 BA.debugLineNum = 51;BA.debugLine="Sub Panel3_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="StartActivity(Act_Sabad)";
Debug.ShouldStop(1048576);
act_kalapaging.mostCurrent.__c.runVoidMethod ("StartActivity",act_kalapaging.processBA,(Object)((act_kalapaging.mostCurrent._act_sabad.getObject())));
 BA.debugLineNum = 54;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
act_kalapaging.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim listKala As List";
act_kalapaging._listkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}