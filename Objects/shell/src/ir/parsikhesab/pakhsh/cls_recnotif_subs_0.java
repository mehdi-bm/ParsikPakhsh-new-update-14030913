package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_recnotif_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_recnotif._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_recnotif._p);
 //BA.debugLineNum = 3;BA.debugLine="Private ticket As AdapterListNotif";
cls_recnotif._ticket = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnotif");__ref.setField("_ticket",cls_recnotif._ticket);
 //BA.debugLineNum = 4;BA.debugLine="Private pnl_BK As Panel";
cls_recnotif._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_recnotif._pnl_bk);
 //BA.debugLineNum = 5;BA.debugLine="Private lblDate As Label";
cls_recnotif._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldate",cls_recnotif._lbldate);
 //BA.debugLineNum = 6;BA.debugLine="Private lblTime As Label";
cls_recnotif._lbltime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltime",cls_recnotif._lbltime);
 //BA.debugLineNum = 7;BA.debugLine="Private lblMatn As Label";
cls_recnotif._lblmatn = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmatn",cls_recnotif._lblmatn);
 //BA.debugLineNum = 8;BA.debugLine="Private lbl_Subject As Label";
cls_recnotif._lbl_subject = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_subject",cls_recnotif._lbl_subject);
 //BA.debugLineNum = 9;BA.debugLine="Private lblBack As Label";
cls_recnotif._lblback = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblback",cls_recnotif._lblback);
 //BA.debugLineNum = 10;BA.debugLine="Private Panel1 As Panel";
cls_recnotif._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",cls_recnotif._panel1);
 //BA.debugLineNum = 11;BA.debugLine="Private LblLine As Label";
cls_recnotif._lblline = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblline",cls_recnotif._lblline);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_recnotif) ","cls_recnotif",86,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_recnotif","getheight", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return pnl_BK.Height+20dip";
Debug.ShouldStop(16);
if (true) return RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight"),cls_recnotif.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 1);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("getPanel (cls_recnotif) ","cls_recnotif",86,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_recnotif","getpanel", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="pnl_BK.RemoveView";
Debug.ShouldStop(1);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 34;BA.debugLine="Return pnl_BK";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("getWidth (cls_recnotif) ","cls_recnotif",86,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_recnotif","getwidth", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Return pnl_BK.Width+5dip";
Debug.ShouldStop(128);
if (true) return RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth"),cls_recnotif.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Initialize (cls_recnotif) ","cls_recnotif",86,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_recnotif","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 16;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(32768);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recnotif.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_recnotif.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 17;BA.debugLine="p.LoadLayout(\"L_RecNotif\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_RecNotif")),__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("pnl_bk_Click (cls_recnotif) ","cls_recnotif",86,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("pnl_bk_click")) { return __ref.runUserSub(false, "cls_recnotif","pnl_bk_click", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Private Sub pnl_bk_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show_data(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("show_data (cls_recnotif) ","cls_recnotif",86,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("show_data")) { return __ref.runUserSub(false, "cls_recnotif","show_data", __ref, _item);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
Debug.locals.put("item", _item);
 BA.debugLineNum = 19;BA.debugLine="Public Sub show_data(item As AdapterListNotif)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="ticket			=item";
Debug.ShouldStop(524288);
__ref.setField ("_ticket" /*RemoteObject*/ ,_item);
 BA.debugLineNum = 21;BA.debugLine="lblDate.Text	=ticket.FldDate";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_ticket" /*RemoteObject*/ ).getField(true,"FldDate" /*RemoteObject*/ )));
 BA.debugLineNum = 22;BA.debugLine="lblTime.Text	=ticket.FldTime";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbltime" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_ticket" /*RemoteObject*/ ).getField(true,"FldTime" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="lbl_Subject.Text=ticket.FldTitle";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbl_subject" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_ticket" /*RemoteObject*/ ).getField(true,"FldTitle" /*RemoteObject*/ )));
 BA.debugLineNum = 24;BA.debugLine="lblMatn.Text	=\"شرح :\"&ticket.FldBody";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblmatn" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شرح :"),__ref.getField(false,"_ticket" /*RemoteObject*/ ).getField(true,"FldBody" /*RemoteObject*/ ))));
 BA.debugLineNum = 25;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(16777216);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 26;BA.debugLine="lblMatn.Height = su.MeasureMultilineTextHeight(lb";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblmatn" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_su.runMethod(true,"MeasureMultilineTextHeight",(Object)((__ref.getField(false,"_lblmatn" /*RemoteObject*/ ).getObject())),(Object)(BA.ObjectToCharSequence(__ref.getField(false,"_lblmatn" /*RemoteObject*/ ).runMethod(true,"getText")))),cls_recnotif.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 1));
 BA.debugLineNum = 27;BA.debugLine="lblBack.Height=lblMatn.Height+lbl_Subject.Height";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblback" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblmatn" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_lbl_subject" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 28;BA.debugLine="Panel1.Height=lblMatn.Height+lbl_Subject.Height+l";
Debug.ShouldStop(134217728);
__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblmatn" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_lbl_subject" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_lbl_subject" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "++",2, 1));
 BA.debugLineNum = 29;BA.debugLine="pnl_BK.Height=lblMatn.Height+lbl_Subject.Height+l";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblmatn" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_lbl_subject" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_lbl_subject" /*RemoteObject*/ ).runMethod(true,"getTop"),cls_recnotif.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+++",3, 1));
 BA.debugLineNum = 30;BA.debugLine="LblLine.Height = lblMatn.Height+10dip";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblline" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblmatn" /*RemoteObject*/ ).runMethod(true,"getHeight"),cls_recnotif.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 1));
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
}