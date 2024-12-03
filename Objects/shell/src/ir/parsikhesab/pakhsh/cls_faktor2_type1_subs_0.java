package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_faktor2_type1_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private p As Panel";
cls_faktor2_type1._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_faktor2_type1._p);
 //BA.debugLineNum = 6;BA.debugLine="Private pnl_bk As Panel";
cls_faktor2_type1._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_faktor2_type1._pnl_bk);
 //BA.debugLineNum = 7;BA.debugLine="Private lblCodeKala As Label";
cls_faktor2_type1._lblcodekala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcodekala",cls_faktor2_type1._lblcodekala);
 //BA.debugLineNum = 8;BA.debugLine="Private lblFee As Label";
cls_faktor2_type1._lblfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfee",cls_faktor2_type1._lblfee);
 //BA.debugLineNum = 9;BA.debugLine="Private lblMablagh As Label";
cls_faktor2_type1._lblmablagh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablagh",cls_faktor2_type1._lblmablagh);
 //BA.debugLineNum = 10;BA.debugLine="Private lblNameKala As Label";
cls_faktor2_type1._lblnamekala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamekala",cls_faktor2_type1._lblnamekala);
 //BA.debugLineNum = 11;BA.debugLine="Private lblRadif As Label";
cls_faktor2_type1._lblradif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblradif",cls_faktor2_type1._lblradif);
 //BA.debugLineNum = 12;BA.debugLine="Private lblTedadKol As Label";
cls_faktor2_type1._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkol",cls_faktor2_type1._lbltedadkol);
 //BA.debugLineNum = 13;BA.debugLine="Private lblTedaJoze As Label";
cls_faktor2_type1._lbltedajoze = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedajoze",cls_faktor2_type1._lbltedajoze);
 //BA.debugLineNum = 14;BA.debugLine="Private lblTakhfifiKala As Label";
cls_faktor2_type1._lbltakhfifikala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltakhfifikala",cls_faktor2_type1._lbltakhfifikala);
 //BA.debugLineNum = 15;BA.debugLine="Private lblTakhfifVizhe As Label";
cls_faktor2_type1._lbltakhfifvizhe = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltakhfifvizhe",cls_faktor2_type1._lbltakhfifvizhe);
 //BA.debugLineNum = 16;BA.debugLine="Private lblMablaghKhales As Label";
cls_faktor2_type1._lblmablaghkhales = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghkhales",cls_faktor2_type1._lblmablaghkhales);
 //BA.debugLineNum = 17;BA.debugLine="Private lblTedadDarKarton As Label";
cls_faktor2_type1._lbltedaddarkarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedaddarkarton",cls_faktor2_type1._lbltedaddarkarton);
 //BA.debugLineNum = 18;BA.debugLine="Private lblSharh As Label";
cls_faktor2_type1._lblsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsharh",cls_faktor2_type1._lblsharh);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_faktor2_type1) ","cls_faktor2_type1",63,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_faktor2_type1","getheight", __ref);}
 BA.debugLineNum = 48;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(65536);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("getLeft (cls_faktor2_type1) ","cls_faktor2_type1",63,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("getleft")) { return __ref.runUserSub(false, "cls_faktor2_type1","getleft", __ref);}
 BA.debugLineNum = 54;BA.debugLine="Public Sub getLeft As Int";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Return pnl_bk.Left";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getLeft");
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
		Debug.PushSubsStack("getPanel (cls_faktor2_type1) ","cls_faktor2_type1",63,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_faktor2_type1","getpanel", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(256);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 42;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(512);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("getTop (cls_faktor2_type1) ","cls_faktor2_type1",63,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("gettop")) { return __ref.runUserSub(false, "cls_faktor2_type1","gettop", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub getTop As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Return pnl_bk.Top";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getTop");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("getWidth (cls_faktor2_type1) ","cls_faktor2_type1",63,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_faktor2_type1","getwidth", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Return pnl_bk.Width";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth");
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _radif,RemoteObject _codekala,RemoteObject _namekala,RemoteObject _fee,RemoteObject _feetakhfifkala,RemoteObject _feetakhfifvizhe,RemoteObject _sum,RemoteObject _mablaghkhales,RemoteObject _tedadjoze,RemoteObject _tedadkol,RemoteObject _tedaddarkarton,RemoteObject _sharh) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_faktor2_type1) ","cls_faktor2_type1",63,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_faktor2_type1","initialize", __ref, _ba, _radif, _codekala, _namekala, _fee, _feetakhfifkala, _feetakhfifvizhe, _sum, _mablaghkhales, _tedadjoze, _tedadkol, _tedaddarkarton, _sharh);}
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
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize(Radif,CodeKala,NameKala,Fee,";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_faktor2_type1.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_faktor2_type1.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 25;BA.debugLine="p.LoadLayout(\"l_faktor2_type1\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_faktor2_type1")),__ref.getField(false, "ba"));
 BA.debugLineNum = 26;BA.debugLine="lblRadif.Text=Radif";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblradif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_radif));
 BA.debugLineNum = 27;BA.debugLine="lblCodeKala.Text=CodeKala";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblcodekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_codekala));
 BA.debugLineNum = 28;BA.debugLine="lblNameKala.Text=NameKala";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblnamekala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_namekala));
 BA.debugLineNum = 29;BA.debugLine="lblFee.Text=Fee";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblfee" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_fee));
 BA.debugLineNum = 30;BA.debugLine="lblTakhfifiKala.Text=FeeTakhfifKala";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbltakhfifikala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_feetakhfifkala));
 BA.debugLineNum = 31;BA.debugLine="lblTakhfifVizhe.Text=FeeTakhfifVizhe";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbltakhfifvizhe" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_feetakhfifvizhe));
 BA.debugLineNum = 32;BA.debugLine="lblMablagh.Text=Sum";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblmablagh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sum));
 BA.debugLineNum = 33;BA.debugLine="lblMablaghKhales.Text=MablaghKhales";
Debug.ShouldStop(1);
__ref.getField(false,"_lblmablaghkhales" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_mablaghkhales));
 BA.debugLineNum = 34;BA.debugLine="lblTedaJoze.Text=TedadJoze";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltedajoze" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tedadjoze));
 BA.debugLineNum = 35;BA.debugLine="lblTedadKol.Text=TedadKol";
Debug.ShouldStop(4);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tedadkol));
 BA.debugLineNum = 36;BA.debugLine="lblTedadDarKarton.Text=TedadDarKarton";
Debug.ShouldStop(8);
__ref.getField(false,"_lbltedaddarkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tedaddarkarton));
 BA.debugLineNum = 37;BA.debugLine="lblSharh.Text=Sharh";
Debug.ShouldStop(16);
__ref.getField(false,"_lblsharh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_sharh));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}