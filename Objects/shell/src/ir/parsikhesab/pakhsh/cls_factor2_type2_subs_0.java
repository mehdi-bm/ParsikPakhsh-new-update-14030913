package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_factor2_type2_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private p As Panel";
cls_factor2_type2._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_factor2_type2._p);
 //BA.debugLineNum = 6;BA.debugLine="Private pnl_bk As Panel";
cls_factor2_type2._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_factor2_type2._pnl_bk);
 //BA.debugLineNum = 8;BA.debugLine="Private lblFee As Label";
cls_factor2_type2._lblfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfee",cls_factor2_type2._lblfee);
 //BA.debugLineNum = 9;BA.debugLine="Private lblMablagh As Label";
cls_factor2_type2._lblmablagh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablagh",cls_factor2_type2._lblmablagh);
 //BA.debugLineNum = 10;BA.debugLine="Private lblNameKala As Label";
cls_factor2_type2._lblnamekala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamekala",cls_factor2_type2._lblnamekala);
 //BA.debugLineNum = 11;BA.debugLine="Private lblRadif As Label";
cls_factor2_type2._lblradif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblradif",cls_factor2_type2._lblradif);
 //BA.debugLineNum = 13;BA.debugLine="Private lblTedaJoze As Label";
cls_factor2_type2._lbltedajoze = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedajoze",cls_factor2_type2._lbltedajoze);
 //BA.debugLineNum = 15;BA.debugLine="Private lblSharh As Label";
cls_factor2_type2._lblsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsharh",cls_factor2_type2._lblsharh);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_factor2_type2) ","cls_factor2_type2",56,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_factor2_type2","getheight", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
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
public static RemoteObject  _getleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeft (cls_factor2_type2) ","cls_factor2_type2",56,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("getleft")) { return __ref.runUserSub(false, "cls_factor2_type2","getleft", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Public Sub getLeft As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Return pnl_bk.Left";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getLeft");
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("getPanel (cls_factor2_type2) ","cls_factor2_type2",56,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_factor2_type2","getpanel", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 33;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("getTop (cls_factor2_type2) ","cls_factor2_type2",56,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("gettop")) { return __ref.runUserSub(false, "cls_factor2_type2","gettop", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Public Sub getTop As Int";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Return pnl_bk.Top";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getTop");
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
public static RemoteObject  _getwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWidth (cls_factor2_type2) ","cls_factor2_type2",56,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_factor2_type2","getwidth", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return pnl_bk.Width";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth");
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _radif,RemoteObject _codekala,RemoteObject _namekala,RemoteObject _fee,RemoteObject _feetakhfifkala,RemoteObject _feetakhfifvizhe,RemoteObject _sum,RemoteObject _mablaghkhales,RemoteObject _tedadjoze,RemoteObject _tedadkol,RemoteObject _tedaddarkarton,RemoteObject _sharh) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_factor2_type2) ","cls_factor2_type2",56,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_factor2_type2","initialize", __ref, _ba, _radif, _codekala, _namekala, _fee, _feetakhfifkala, _feetakhfifvizhe, _sum, _mablaghkhales, _tedadjoze, _tedadkol, _tedaddarkarton, _sharh);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Radif", _radif);
Debug.locals.put("CodeKala", _codekala);
Debug.locals.put("NameKala", _namekala);
Debug.locals.put("Fee", _fee);
Debug.locals.put("FeeTakhfifKala", _feetakhfifkala);
Debug.locals.put("FeeTakhfifVizhe", _feetakhfifvizhe);
Debug.locals.put("Sum", _sum);
Debug.locals.put("MablaghKhales", _mablaghkhales);
Debug.locals.put("TedadJoze", _tedadjoze);
Debug.locals.put("TedadKol", _tedadkol);
Debug.locals.put("TedadDarKarton", _tedaddarkarton);
Debug.locals.put("Sharh", _sharh);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize(Radif,CodeKala,NameKala,Fee,";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_factor2_type2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_factor2_type2.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 22;BA.debugLine="p.LoadLayout(\"l_faktor2_type2\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_faktor2_type2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="lblRadif.Text=Radif";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblradif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_radif));
 BA.debugLineNum = 24;BA.debugLine="lblNameKala.Text=NameKala";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblnamekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_namekala));
 BA.debugLineNum = 25;BA.debugLine="lblFee.Text=Fee";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_fee));
 BA.debugLineNum = 26;BA.debugLine="lblMablagh.Text=Sum";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblmablagh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sum));
 BA.debugLineNum = 27;BA.debugLine="lblTedaJoze.Text=TedadJoze";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbltedajoze" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tedadjoze));
 BA.debugLineNum = 28;BA.debugLine="lblSharh.Text=Sharh";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblsharh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sharh));
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
}