package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_recfaktor_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_recfaktor._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_recfaktor._p);
 //BA.debugLineNum = 3;BA.debugLine="Private faktor As AdapterListFaktor";
cls_recfaktor._faktor = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");__ref.setField("_faktor",cls_recfaktor._faktor);
 //BA.debugLineNum = 4;BA.debugLine="Private LblShomareFaktor As Label";
cls_recfaktor._lblshomarefaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarefaktor",cls_recfaktor._lblshomarefaktor);
 //BA.debugLineNum = 5;BA.debugLine="Private LblDate As Label";
cls_recfaktor._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldate",cls_recfaktor._lbldate);
 //BA.debugLineNum = 6;BA.debugLine="Private LblTotalFaktor As Label";
cls_recfaktor._lbltotalfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotalfaktor",cls_recfaktor._lbltotalfaktor);
 //BA.debugLineNum = 7;BA.debugLine="Private pnl_bk As Panel";
cls_recfaktor._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_recfaktor._pnl_bk);
 //BA.debugLineNum = 8;BA.debugLine="Private LblSync As Label";
cls_recfaktor._lblsync = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsync",cls_recfaktor._lblsync);
 //BA.debugLineNum = 9;BA.debugLine="Private LblBargasht As Label";
cls_recfaktor._lblbargasht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblbargasht",cls_recfaktor._lblbargasht);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_recfaktor) ","cls_recfaktor",84,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_recfaktor","getheight", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
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
		Debug.PushSubsStack("getPanel (cls_recfaktor) ","cls_recfaktor",84,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_recfaktor","getpanel", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(1);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 34;BA.debugLine="Return pnl_bk";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_recfaktor) ","cls_recfaktor",84,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_recfaktor","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 14;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(8192);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recfaktor.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_recfaktor.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 15;BA.debugLine="p.LoadLayout(\"L_RecFaktor\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_RecFaktor")),__ref.getField(false, "ba"));
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
public static RemoteObject  _panel1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel1_Click (cls_recfaktor) ","cls_recfaktor",84,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("panel1_click")) { return __ref.runUserSub(false, "cls_recfaktor","panel1_click", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Sub Panel1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="MCode.FaktorSelect=faktor.FldShomareFaktor";
Debug.ShouldStop(256);
cls_recfaktor._mcode._faktorselect /*RemoteObject*/  = __ref.getField(false,"_faktor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ );
 BA.debugLineNum = 42;BA.debugLine="faktor.fldC_Ashkhas=MCode.C_Tafzili";
Debug.ShouldStop(512);
__ref.getField(false,"_faktor" /*RemoteObject*/ ).setField ("fldC_Ashkhas" /*RemoteObject*/ ,cls_recfaktor._mcode._c_tafzili /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="Act_RizFaktor.Faktor = faktor";
Debug.ShouldStop(1024);
cls_recfaktor._act_rizfaktor._faktor /*RemoteObject*/  = __ref.getField(false,"_faktor" /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="StartActivity(Act_RizFaktor)";
Debug.ShouldStop(2048);
cls_recfaktor.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_recfaktor._act_rizfaktor.getObject())));
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
public static RemoteObject  _pnl_bk_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_bk_Click (cls_recfaktor) ","cls_recfaktor",84,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("pnl_bk_click")) { return __ref.runUserSub(false, "cls_recfaktor","pnl_bk_click", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Sub pnl_bk_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("show (cls_recfaktor) ","cls_recfaktor",84,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_recfaktor","show", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 18;BA.debugLine="Public Sub show(item As AdapterListFaktor)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 20;BA.debugLine="faktor=item";
Debug.ShouldStop(524288);
__ref.setField ("_faktor" /*RemoteObject*/ ,_item);
 BA.debugLineNum = 21;BA.debugLine="LblShomareFaktor.Text =\"شماره سفارش \"& item.FldS";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblshomarefaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شماره سفارش "),_item.getField(true,"fldShomareFaktor" /*RemoteObject*/ ))));
 BA.debugLineNum = 22;BA.debugLine="LblTotalFaktor.Text = myCode.AdadToPrice(item.Fl";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbltotalfaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_recfaktor._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldTotalFaktor" /*RemoteObject*/ )))));
 BA.debugLineNum = 23;BA.debugLine="LblDate.text = MCode.PersianDateDash(item.FldDat";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_recfaktor._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldDate" /*RemoteObject*/ )))));
 BA.debugLineNum = 24;BA.debugLine="LblDate.text = LblDate.text & \" | \" & MCode.Sf.M";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" | "),cls_recfaktor._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item.getField(true,"fldTime" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))),cls_recfaktor._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item.getField(true,"fldTime" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 25;BA.debugLine="LblSync.Visible = item.synced";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblsync" /*RemoteObject*/ ).runMethod(true,"setVisible",_item.getField(true,"synced" /*RemoteObject*/ ));
 BA.debugLineNum = 26;BA.debugLine="LblBargasht.Visible=item.wIsBacked";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblbargasht" /*RemoteObject*/ ).runMethod(true,"setVisible",_item.getField(true,"wIsBacked" /*RemoteObject*/ ));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e10.toString()); BA.debugLineNum = 28;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
cls_recfaktor.__c.runVoidMethod ("LogImpl","5103809034",BA.ObjectToString(cls_recfaktor.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 30;BA.debugLine="End Sub";
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