package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_rec_rizfactorvisitor_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_rec_rizfactorvisitor._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_rec_rizfactorvisitor._p);
 //BA.debugLineNum = 5;BA.debugLine="Private Panel4 As Panel";
cls_rec_rizfactorvisitor._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel4",cls_rec_rizfactorvisitor._panel4);
 //BA.debugLineNum = 6;BA.debugLine="Private pnl_bk As Panel";
cls_rec_rizfactorvisitor._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_rec_rizfactorvisitor._pnl_bk);
 //BA.debugLineNum = 7;BA.debugLine="Private base As Object";
cls_rec_rizfactorvisitor._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_rec_rizfactorvisitor._base);
 //BA.debugLineNum = 10;BA.debugLine="Private lblCodeKala As Label";
cls_rec_rizfactorvisitor._lblcodekala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcodekala",cls_rec_rizfactorvisitor._lblcodekala);
 //BA.debugLineNum = 11;BA.debugLine="Private LblFeeJoz As Label";
cls_rec_rizfactorvisitor._lblfeejoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfeejoz",cls_rec_rizfactorvisitor._lblfeejoz);
 //BA.debugLineNum = 12;BA.debugLine="Private LblRadif As Label";
cls_rec_rizfactorvisitor._lblradif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblradif",cls_rec_rizfactorvisitor._lblradif);
 //BA.debugLineNum = 13;BA.debugLine="Private lblSharh As Label";
cls_rec_rizfactorvisitor._lblsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsharh",cls_rec_rizfactorvisitor._lblsharh);
 //BA.debugLineNum = 14;BA.debugLine="Private lblSharhKala As Label";
cls_rec_rizfactorvisitor._lblsharhkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsharhkala",cls_rec_rizfactorvisitor._lblsharhkala);
 //BA.debugLineNum = 15;BA.debugLine="Private LblTedadCarton As Label";
cls_rec_rizfactorvisitor._lbltedadcarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadcarton",cls_rec_rizfactorvisitor._lbltedadcarton);
 //BA.debugLineNum = 16;BA.debugLine="Private lblTedadJoz As Label";
cls_rec_rizfactorvisitor._lbltedadjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadjoz",cls_rec_rizfactorvisitor._lbltedadjoz);
 //BA.debugLineNum = 17;BA.debugLine="Private LblMablaghKol As Label";
cls_rec_rizfactorvisitor._lblmablaghkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghkol",cls_rec_rizfactorvisitor._lblmablaghkol);
 //BA.debugLineNum = 18;BA.debugLine="Private LblTedadDarKarton As Label";
cls_rec_rizfactorvisitor._lbltedaddarkarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedaddarkarton",cls_rec_rizfactorvisitor._lbltedaddarkarton);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_rec_rizfactorvisitor) ","cls_rec_rizfactorvisitor",79,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_rec_rizfactorvisitor","getheight", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("getPanel (cls_rec_rizfactorvisitor) ","cls_rec_rizfactorvisitor",79,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_rec_rizfactorvisitor","getpanel", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 31;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Initialize (cls_rec_rizfactorvisitor) ","cls_rec_rizfactorvisitor",79,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_rec_rizfactorvisitor","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="base = mdl";
Debug.ShouldStop(2097152);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 23;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_rec_rizfactorvisitor.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_rec_rizfactorvisitor.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 25;BA.debugLine="p.LoadLayout(\"l_rec_rizfactorvisitor\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_rec_rizfactorvisitor")),__ref.getField(false, "ba"));
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
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _item1) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_rec_rizfactorvisitor) ","cls_rec_rizfactorvisitor",79,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_rec_rizfactorvisitor","show", __ref, _item1);}
Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 38;BA.debugLine="Public Sub Show(Item1 As AdapteRepRizFactorVisitor";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="LblRadif.Text=Item1.fldRadif";
Debug.ShouldStop(128);
__ref.getField(false,"_lblradif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldRadif" /*RemoteObject*/ )));
 BA.debugLineNum = 41;BA.debugLine="lblCodeKala.Text=Item1.fldCodeKala";
Debug.ShouldStop(256);
__ref.getField(false,"_lblcodekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldCodeKala" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="LblFeeJoz.Text=Item1.fldFeeJoz &\" \"&MCode.VahedPo";
Debug.ShouldStop(512);
__ref.getField(false,"_lblfeejoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_item1.getField(true,"fldFeeJoz" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),cls_rec_rizfactorvisitor._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="lblSharhKala.Text=Item1.fldSharhKala";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblsharhkala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldSharhKala" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="lblTedadJoz.Text=Item1.fldTedadJoz";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldTedadJoz" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="LblTedadCarton.Text=Item1.fldTedadCarton";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbltedadcarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldTedadCarton" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="lblSharh.Text=Item1.fldTozihatRecord";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblsharh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldTozihatRecord" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="If Item1.SumFee>0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_item1.getField(true,"SumFee" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 48;BA.debugLine="LblMablaghKol.Text=MCode.qomaAshar(Item1.SumFee)";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblmablaghkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_rec_rizfactorvisitor._mcode.runMethod(true,"_qomaashar" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((_item1.getField(true,"SumFee" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),cls_rec_rizfactorvisitor._mcode._vahedpool /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 50;BA.debugLine="LblMablaghKol.Text=0";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblmablaghkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 53;BA.debugLine="LblTedadDarKarton.Text=Item1.FldTedadDarKarton";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbltedaddarkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"FldTedadDarKarton" /*RemoteObject*/ )));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}