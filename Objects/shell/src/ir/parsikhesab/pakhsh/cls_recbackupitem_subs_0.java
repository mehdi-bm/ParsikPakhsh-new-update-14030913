package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_recbackupitem_subs_0 {


public static RemoteObject  _btndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (cls_recbackupitem) ","cls_recbackupitem",81,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("btndelete_click")) { return __ref.runUserSub(false, "cls_recbackupitem","btndelete_click", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Sub btnDelete_Click";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _btnreturn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnReturn_Click (cls_recbackupitem) ","cls_recbackupitem",81,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btnreturn_click")) { return __ref.runUserSub(false, "cls_recbackupitem","btnreturn_click", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Sub btnReturn_Click";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_recbackupitem._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_recbackupitem._p);
 //BA.debugLineNum = 4;BA.debugLine="Private pnl_bk As Panel";
cls_recbackupitem._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_recbackupitem._pnl_bk);
 //BA.debugLineNum = 5;BA.debugLine="Private lblRow As Label";
cls_recbackupitem._lblrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblrow",cls_recbackupitem._lblrow);
 //BA.debugLineNum = 6;BA.debugLine="Private lblDate As Label";
cls_recbackupitem._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldate",cls_recbackupitem._lbldate);
 //BA.debugLineNum = 7;BA.debugLine="Private lblTime As Label";
cls_recbackupitem._lbltime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltime",cls_recbackupitem._lbltime);
 //BA.debugLineNum = 8;BA.debugLine="Private btnDelete As Button";
cls_recbackupitem._btndelete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btndelete",cls_recbackupitem._btndelete);
 //BA.debugLineNum = 9;BA.debugLine="Private btnReturn As Button";
cls_recbackupitem._btnreturn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnreturn",cls_recbackupitem._btnreturn);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_recbackupitem) ","cls_recbackupitem",81,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_recbackupitem","getheight", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(64);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeft (cls_recbackupitem) ","cls_recbackupitem",81,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("getleft")) { return __ref.runUserSub(false, "cls_recbackupitem","getleft", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Public Sub getLeft As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Return pnl_bk.Left";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getLeft");
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("getPanel (cls_recbackupitem) ","cls_recbackupitem",81,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_recbackupitem","getpanel", __ref);}
 BA.debugLineNum = 30;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 32;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTop (cls_recbackupitem) ","cls_recbackupitem",81,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("gettop")) { return __ref.runUserSub(false, "cls_recbackupitem","gettop", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Public Sub getTop As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Return pnl_bk.Top";
Debug.ShouldStop(512);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getTop");
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWidth (cls_recbackupitem) ","cls_recbackupitem",81,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_recbackupitem","getwidth", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Return pnl_bk.Width";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth");
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _row,RemoteObject _date,RemoteObject _time) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_recbackupitem) ","cls_recbackupitem",81,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_recbackupitem","initialize", __ref, _ba, _row, _date, _time);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Row", _row);
Debug.locals.put("Date", _date);
Debug.locals.put("Time", _time);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(Row As String,Date As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 15;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recbackupitem.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_recbackupitem.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 16;BA.debugLine="p.LoadLayout(\"l_backupitem\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_backupitem")),__ref.getField(false, "ba"));
 BA.debugLineNum = 17;BA.debugLine="lblRow.Text=Row";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblrow" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_row));
 BA.debugLineNum = 18;BA.debugLine="lblDate.Text=Date";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_date));
 BA.debugLineNum = 19;BA.debugLine="lblTime.Text=Time";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbltime" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_time));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
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