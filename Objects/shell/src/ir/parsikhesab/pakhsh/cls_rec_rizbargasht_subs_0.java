package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_rec_rizbargasht_subs_0 {


public static RemoteObject  _btnlist_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnList_Click (cls_rec_rizbargasht) ","cls_rec_rizbargasht",78,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("btnlist_click")) { return __ref.runUserSub(false, "cls_rec_rizbargasht","btnlist_click", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Private Sub BtnList_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="MCode.FaktorSelect = ItemFactor.fldShomareFaktor";
Debug.ShouldStop(16384);
cls_rec_rizbargasht._mcode._faktorselect /*RemoteObject*/  = __ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="StartActivity(Act_RizFaktor)";
Debug.ShouldStop(32768);
cls_rec_rizbargasht.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_rec_rizbargasht._act_rizfaktor.getObject())));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_rec_rizbargasht._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_rec_rizbargasht._p);
 //BA.debugLineNum = 3;BA.debugLine="Private base As Object";
cls_rec_rizbargasht._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_rec_rizbargasht._base);
 //BA.debugLineNum = 4;BA.debugLine="Private ItemFactor As AdapterListRizeFaktor";
cls_rec_rizbargasht._itemfactor = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor");__ref.setField("_itemfactor",cls_rec_rizbargasht._itemfactor);
 //BA.debugLineNum = 5;BA.debugLine="Private pnl_bk As Panel";
cls_rec_rizbargasht._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_rec_rizbargasht._pnl_bk);
 //BA.debugLineNum = 6;BA.debugLine="Private lblCodeKala As Label";
cls_rec_rizbargasht._lblcodekala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcodekala",cls_rec_rizbargasht._lblcodekala);
 //BA.debugLineNum = 7;BA.debugLine="Private lblNameKala As Label";
cls_rec_rizbargasht._lblnamekala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamekala",cls_rec_rizbargasht._lblnamekala);
 //BA.debugLineNum = 8;BA.debugLine="Private lblRadif As Label";
cls_rec_rizbargasht._lblradif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblradif",cls_rec_rizbargasht._lblradif);
 //BA.debugLineNum = 9;BA.debugLine="Private lblShomareFactor As Label";
cls_rec_rizbargasht._lblshomarefactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarefactor",cls_rec_rizbargasht._lblshomarefactor);
 //BA.debugLineNum = 10;BA.debugLine="Private lblTedadJoz As Label";
cls_rec_rizbargasht._lbltedadjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadjoz",cls_rec_rizbargasht._lbltedadjoz);
 //BA.debugLineNum = 11;BA.debugLine="Private lblTedadKol As Label";
cls_rec_rizbargasht._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkol",cls_rec_rizbargasht._lbltedadkol);
 //BA.debugLineNum = 12;BA.debugLine="Private lblTotalFactor As Label";
cls_rec_rizbargasht._lbltotalfactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotalfactor",cls_rec_rizbargasht._lbltotalfactor);
 //BA.debugLineNum = 13;BA.debugLine="Private lblType As Label";
cls_rec_rizbargasht._lbltype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltype",cls_rec_rizbargasht._lbltype);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_rec_rizbargasht) ","cls_rec_rizbargasht",78,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_rec_rizbargasht","getheight", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("getPanel (cls_rec_rizbargasht) ","cls_rec_rizbargasht",78,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_rec_rizbargasht","getpanel", __ref);}
 BA.debugLineNum = 37;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(32);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 39;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(64);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mdl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_rec_rizbargasht) ","cls_rec_rizbargasht",78,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_rec_rizbargasht","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="base = mdl";
Debug.ShouldStop(65536);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 18;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 19;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(262144);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_rec_rizbargasht.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_rec_rizbargasht.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 20;BA.debugLine="p.LoadLayout(\"l_Rec_RizeBargasht\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_Rec_RizeBargasht")),__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="ItemFactor.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_itemfactor" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _item1) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_rec_rizbargasht) ","cls_rec_rizbargasht",78,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_rec_rizbargasht","show", __ref, _item1);}
Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 25;BA.debugLine="Public Sub Show(Item1 As AdapterListRizeFaktor)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="ItemFactor=Item1";
Debug.ShouldStop(33554432);
__ref.setField ("_itemfactor" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 27;BA.debugLine="lblRadif.Text=ItemFactor.FldRadif";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblradif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"FldRadif" /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="lblCodeKala.Text=ItemFactor.fldCodeKala";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblcodekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldCodeKala" /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="lblNameKala.Text=ItemFactor.fldSharhKala";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblnamekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldSharhKala" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="lblShomareFactor.Text=ItemFactor.fldShomareFaktor";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblshomarefactor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="lblTedadJoz.Text=ItemFactor.fldTedadJoz";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldTedadJoz" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="lblTedadKol.Text=ItemFactor.fldTedadCarton";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldTedadCarton" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="lblType.Text=ItemFactor.FldType";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltype" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"FldType" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="lblTotalFactor.Text=myCode.AdadToPrice(ItemFactor";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltotalfactor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_rec_rizbargasht._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldTotalFaktor" /*RemoteObject*/ )))));
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
}