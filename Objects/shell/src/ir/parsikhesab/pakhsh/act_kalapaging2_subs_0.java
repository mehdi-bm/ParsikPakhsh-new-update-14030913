package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_kalapaging2_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,17);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 17;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 19;BA.debugLine="Activity.LoadLayout(\"L_KalaPaging_2\")";
Debug.ShouldStop(262144);
act_kalapaging2.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_KalaPaging_2")),act_kalapaging2.mostCurrent.activityBA);
 BA.debugLineNum = 20;BA.debugLine="Hlv.Initializer(\"hlv\").ListView.Horizontal.Build";
Debug.ShouldStop(524288);
act_kalapaging2.mostCurrent._hlv.runMethod(false,"Initializer",act_kalapaging2.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("hlv"))).runMethod(false,"ListView").runMethod(false,"Horizontal").runVoidMethod ("Build");
 BA.debugLineNum = 22;BA.debugLine="pnl_hlv.AddView(Hlv,0,0,96%x ,pnl_hlv.Height)";
Debug.ShouldStop(2097152);
act_kalapaging2.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_kalapaging2.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_kalapaging2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 96)),act_kalapaging2.mostCurrent.activityBA)),(Object)(act_kalapaging2.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 24;BA.debugLine="Hlv.Show";
Debug.ShouldStop(8388608);
act_kalapaging2.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kalapaging2.processBA, e7.toString()); BA.debugLineNum = 26;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
act_kalapaging2.mostCurrent.__c.runVoidMethod ("LogImpl","541025545",BA.ObjectToString(act_kalapaging2.mostCurrent.__c.runMethod(false,"LastException",act_kalapaging2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 27;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(67108864);
act_kalapaging2.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kalapaging2.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kalapaging2.mostCurrent.__c.runMethod(false,"LastException",act_kalapaging2.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kalapaging2.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","activity_resume");}
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Application_Error (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,111);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 111;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(16384);
 BA.debugLineNum = 113;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) return act_kalapaging2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("btn_back_Click (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,82);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","btn_back_click");}
 BA.debugLineNum = 82;BA.debugLine="Private Sub btn_back_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
act_kalapaging2.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("btnNext_Click (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,91);
if (RapidSub.canDelegate("btnnext_click")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","btnnext_click");}
 BA.debugLineNum = 91;BA.debugLine="Private Sub btnNext_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="If pos<listKala.Size Then pos=pos+1";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("<",act_kalapaging2._pos,BA.numberCast(double.class, act_kalapaging2._listkala.runMethod(true,"getSize")))) { 
act_kalapaging2._pos = RemoteObject.solve(new RemoteObject[] {act_kalapaging2._pos,RemoteObject.createImmutable(1)}, "+",1, 1);};
 BA.debugLineNum = 93;BA.debugLine="Hlv.SmoothScrollToPosition(pos)";
Debug.ShouldStop(268435456);
act_kalapaging2.mostCurrent._hlv.runVoidMethod ("SmoothScrollToPosition",(Object)(act_kalapaging2._pos));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("btnPrev_Click (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,86);
if (RapidSub.canDelegate("btnprev_click")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","btnprev_click");}
 BA.debugLineNum = 86;BA.debugLine="Private Sub btnPrev_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="If pos>0 Then pos=pos-1";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",act_kalapaging2._pos,BA.numberCast(double.class, 0))) { 
act_kalapaging2._pos = RemoteObject.solve(new RemoteObject[] {act_kalapaging2._pos,RemoteObject.createImmutable(1)}, "-",1, 1);};
 BA.debugLineNum = 88;BA.debugLine="Hlv.SmoothScrollToPosition(pos)";
Debug.ShouldStop(8388608);
act_kalapaging2.mostCurrent._hlv.runVoidMethod ("SmoothScrollToPosition",(Object)(act_kalapaging2._pos));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("EventName_onScrollStateChanged (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,96);
if (RapidSub.canDelegate("eventname_onscrollstatechanged")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","eventname_onscrollstatechanged", _state);}
Debug.locals.put("State", _state);
 BA.debugLineNum = 96;BA.debugLine="Private Sub EventName_onScrollStateChanged (State";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Select (State)";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt((_state),act_kalapaging2.mostCurrent._hlv.getField(true,"SCROLL_STATE_DRAGGING"),act_kalapaging2.mostCurrent._hlv.getField(true,"SCROLL_STATE_IDLE"),act_kalapaging2.mostCurrent._hlv.getField(true,"SCROLL_STATE_SETTLING"))) {
case 0: {
 BA.debugLineNum = 99;BA.debugLine="Log(\"DRAGGING\")";
Debug.ShouldStop(4);
act_kalapaging2.mostCurrent.__c.runVoidMethod ("LogImpl","541811971",RemoteObject.createImmutable("DRAGGING"),0);
 break; }
case 1: {
 BA.debugLineNum = 101;BA.debugLine="Log(\"IDLE\")";
Debug.ShouldStop(16);
act_kalapaging2.mostCurrent.__c.runVoidMethod ("LogImpl","541811973",RemoteObject.createImmutable("IDLE"),0);
 break; }
case 2: {
 BA.debugLineNum = 103;BA.debugLine="Log(\"SETTLING\")";
Debug.ShouldStop(64);
act_kalapaging2.mostCurrent.__c.runVoidMethod ("LogImpl","541811975",RemoteObject.createImmutable("SETTLING"),0);
 break; }
}
;
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private Hlv As Hitex_LayoutView";
act_kalapaging2.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 13;BA.debugLine="Private pnl_hlv As Panel";
act_kalapaging2.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private pos As Int=0";
act_kalapaging2._pos = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("hlv_GetItemCount (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,77);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","hlv_getitemcount");}
 BA.debugLineNum = 77;BA.debugLine="Sub hlv_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Return listKala.Size '/ItemList.Size";
Debug.ShouldStop(8192);
if (true) return act_kalapaging2._listkala.runMethod(true,"getSize");
 BA.debugLineNum = 80;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("hlv_onBindViewHolder (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,71);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","hlv_onbindviewholder", _parent, _position);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_kalapaging2");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 71;BA.debugLine="Sub hlv_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Dim rec As cls_kalaPaging2 = Parent.Tag";
Debug.ShouldStop(128);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 73;BA.debugLine="rec.show(listKala.Get(Position))";
Debug.ShouldStop(256);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging2.class, "_show" /*RemoteObject*/ ,(Object)((act_kalapaging2._listkala.runMethod(false,"Get",(Object)(_position)))));
 BA.debugLineNum = 74;BA.debugLine="Parent.Width=rec.Width";
Debug.ShouldStop(512);
_parent.runMethod(true,"setWidth",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging2.class, "_getwidth" /*RemoteObject*/ ));
 BA.debugLineNum = 75;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(1024);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging2.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("hlv_onCreateViewHolder (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,65);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_kalapaging2");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 65;BA.debugLine="Private Sub hlv_onCreateViewHolder (Parent As Pane";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Dim rec As cls_kalaPaging2";
Debug.ShouldStop(2);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_kalapaging2");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 67;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(4);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging2.class, "_initialize" /*RemoteObject*/ ,act_kalapaging2.mostCurrent.activityBA,(Object)(act_kalapaging2.getObject()));
 BA.debugLineNum = 68;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,100%y)";
Debug.ShouldStop(8);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_kalapaging2.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_kalapaging2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_kalapaging2.mostCurrent.activityBA)),(Object)(act_kalapaging2.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_kalapaging2.mostCurrent.activityBA)));
 BA.debugLineNum = 69;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(16);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Hlv_onScrollListener (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,107);
if (RapidSub.canDelegate("hlv_onscrolllistener")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","hlv_onscrolllistener", _dx, _dy);}
Debug.locals.put("dx", _dx);
Debug.locals.put("dy", _dy);
 BA.debugLineNum = 107;BA.debugLine="Private Sub Hlv_onScrollListener (dx As Int,dy As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="pos = Hlv.GetVisibleItemPosition(True,False)";
Debug.ShouldStop(2048);
act_kalapaging2._pos = act_kalapaging2.mostCurrent._hlv.runMethod(true,"GetVisibleItemPosition",(Object)(act_kalapaging2.mostCurrent.__c.getField(true,"True")),(Object)(act_kalapaging2.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblbasket_click() throws Exception{
try {
		Debug.PushSubsStack("LblBasket_Click (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,53);
if (RapidSub.canDelegate("lblbasket_click")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","lblbasket_click");}
 BA.debugLineNum = 53;BA.debugLine="Sub LblBasket_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblbasketcount_click() throws Exception{
try {
		Debug.PushSubsStack("LblBasketCount_Click (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,61);
if (RapidSub.canDelegate("lblbasketcount_click")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","lblbasketcount_click");}
 BA.debugLineNum = 61;BA.debugLine="Sub LblBasketCount_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="LblBasket_Click";
Debug.ShouldStop(536870912);
_lblbasket_click();
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
act_kalapaging2._listkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refreshlblsabad() throws Exception{
try {
		Debug.PushSubsStack("RefreshLblSabad (act_kalapaging2) ","act_kalapaging2",19,act_kalapaging2.mostCurrent.activityBA,act_kalapaging2.mostCurrent,39);
if (RapidSub.canDelegate("refreshlblsabad")) { return ir.parsikhesab.pakhsh.act_kalapaging2.remoteMe.runUserSub(false, "act_kalapaging2","refreshlblsabad");}
 BA.debugLineNum = 39;BA.debugLine="Sub RefreshLblSabad";
Debug.ShouldStop(64);
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
}