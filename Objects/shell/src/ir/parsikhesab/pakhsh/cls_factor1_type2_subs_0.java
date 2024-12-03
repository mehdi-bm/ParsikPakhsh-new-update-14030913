package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_factor1_type2_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_factor1_type2._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_factor1_type2._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_factor1_type2._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_factor1_type2._pnl_bk);
 //BA.debugLineNum = 7;BA.debugLine="Private lblDateFactor As Label";
cls_factor1_type2._lbldatefactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldatefactor",cls_factor1_type2._lbldatefactor);
 //BA.debugLineNum = 9;BA.debugLine="Private lblNameCo As Label";
cls_factor1_type2._lblnameco = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnameco",cls_factor1_type2._lblnameco);
 //BA.debugLineNum = 10;BA.debugLine="Private lblNameMoshtari As Label";
cls_factor1_type2._lblnamemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamemoshtari",cls_factor1_type2._lblnamemoshtari);
 //BA.debugLineNum = 12;BA.debugLine="Private lblShomareFactor As Label";
cls_factor1_type2._lblshomarefactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarefactor",cls_factor1_type2._lblshomarefactor);
 //BA.debugLineNum = 14;BA.debugLine="Private lblTell As Label";
cls_factor1_type2._lbltell = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltell",cls_factor1_type2._lbltell);
 //BA.debugLineNum = 15;BA.debugLine="Private lblAddress As Label";
cls_factor1_type2._lbladdress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbladdress",cls_factor1_type2._lbladdress);
 //BA.debugLineNum = 16;BA.debugLine="Private lblNameCompany As Label";
cls_factor1_type2._lblnamecompany = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamecompany",cls_factor1_type2._lblnamecompany);
 //BA.debugLineNum = 17;BA.debugLine="Private lblTellCompany As Label";
cls_factor1_type2._lbltellcompany = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltellcompany",cls_factor1_type2._lbltellcompany);
 //BA.debugLineNum = 18;BA.debugLine="Private lblAddressCompany As Label";
cls_factor1_type2._lbladdresscompany = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbladdresscompany",cls_factor1_type2._lbladdresscompany);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_factor1_type2) ","cls_factor1_type2",55,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_factor1_type2","getheight", __ref);}
 BA.debugLineNum = 49;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(131072);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("getLeft (cls_factor1_type2) ","cls_factor1_type2",55,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("getleft")) { return __ref.runUserSub(false, "cls_factor1_type2","getleft", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Public Sub getLeft As Int";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Return pnl_bk.Left";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getLeft");
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("getPanel (cls_factor1_type2) ","cls_factor1_type2",55,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_factor1_type2","getpanel", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(512);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 43;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("getTop (cls_factor1_type2) ","cls_factor1_type2",55,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("gettop")) { return __ref.runUserSub(false, "cls_factor1_type2","gettop", __ref);}
 BA.debugLineNum = 52;BA.debugLine="Public Sub getTop As Int";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Return pnl_bk.Top";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getTop");
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("getWidth (cls_factor1_type2) ","cls_factor1_type2",55,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_factor1_type2","getwidth", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Return pnl_bk.Width";
Debug.ShouldStop(16384);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth");
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _codemoshtari,RemoteObject _namemoshtari,RemoteObject _codevisitor,RemoteObject _namevisitor,RemoteObject _nameco,RemoteObject _shomarefactor,RemoteObject _datefactor,RemoteObject _datereport,RemoteObject _timereport,RemoteObject _tell,RemoteObject _address,RemoteObject _namecompany,RemoteObject _tellcompany,RemoteObject _addresscompany) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_factor1_type2) ","cls_factor1_type2",55,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_factor1_type2","initialize", __ref, _ba, _codemoshtari, _namemoshtari, _codevisitor, _namevisitor, _nameco, _shomarefactor, _datefactor, _datereport, _timereport, _tell, _address, _namecompany, _tellcompany, _addresscompany);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CodeMoshtari", _codemoshtari);
Debug.locals.put("NameMoshtari", _namemoshtari);
Debug.locals.put("CodeVisitor", _codevisitor);
Debug.locals.put("NameVisitor", _namevisitor);
Debug.locals.put("NameCo", _nameco);
Debug.locals.put("ShomareFactor", _shomarefactor);
Debug.locals.put("DateFactor", _datefactor);
Debug.locals.put("DateReport", _datereport);
Debug.locals.put("TimeReport", _timereport);
Debug.locals.put("Tell", _tell);
Debug.locals.put("Address", _address);
Debug.locals.put("NameCompany", _namecompany);
Debug.locals.put("TellCompany", _tellcompany);
Debug.locals.put("AddressCompany", _addresscompany);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize(CodeMoshtari As String,NameM";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_factor1_type2.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_factor1_type2.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 25;BA.debugLine="p.LoadLayout(\"l_faktor1_type2\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_faktor1_type2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="lblNameMoshtari.Text=NameMoshtari";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblnamemoshtari" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_namemoshtari));
 BA.debugLineNum = 29;BA.debugLine="lblNameCo.Text=NameCo";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblnameco" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_nameco));
 BA.debugLineNum = 30;BA.debugLine="lblShomareFactor.Text=ShomareFactor";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblshomarefactor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_shomarefactor));
 BA.debugLineNum = 31;BA.debugLine="lblDateFactor.Text=DateFactor";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbldatefactor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datefactor));
 BA.debugLineNum = 33;BA.debugLine="lblTell.Text=Tell";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltell" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tell));
 BA.debugLineNum = 34;BA.debugLine="lblAddress.Text=Address";
Debug.ShouldStop(2);
__ref.getField(false,"_lbladdress" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_address));
 BA.debugLineNum = 36;BA.debugLine="lblNameCompany.Text=NameCompany";
Debug.ShouldStop(8);
__ref.getField(false,"_lblnamecompany" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_namecompany));
 BA.debugLineNum = 37;BA.debugLine="lblTellCompany.Text=TellCompany";
Debug.ShouldStop(16);
__ref.getField(false,"_lbltellcompany" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tellcompany));
 BA.debugLineNum = 38;BA.debugLine="lblAddressCompany.Text=AddressCompany";
Debug.ShouldStop(32);
__ref.getField(false,"_lbladdresscompany" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_addresscompany));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}