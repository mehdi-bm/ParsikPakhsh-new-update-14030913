package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_rec_havale_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_rec_havale._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_rec_havale._p);
 //BA.debugLineNum = 4;BA.debugLine="Dim Item As AdapteRepHavale";
cls_rec_havale._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterephavale");__ref.setField("_item",cls_rec_havale._item);
 //BA.debugLineNum = 5;BA.debugLine="Private pnl_bk As Panel";
cls_rec_havale._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_rec_havale._pnl_bk);
 //BA.debugLineNum = 6;BA.debugLine="Private base As Object";
cls_rec_havale._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_rec_havale._base);
 //BA.debugLineNum = 7;BA.debugLine="Private LblDate As Label";
cls_rec_havale._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldate",cls_rec_havale._lbldate);
 //BA.debugLineNum = 8;BA.debugLine="Private LblTotal As Label";
cls_rec_havale._lbltotal = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotal",cls_rec_havale._lbltotal);
 //BA.debugLineNum = 9;BA.debugLine="Private LblShomareHavale As Label";
cls_rec_havale._lblshomarehavale = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarehavale",cls_rec_havale._lblshomarehavale);
 //BA.debugLineNum = 10;BA.debugLine="Private lblCount As Label";
cls_rec_havale._lblcount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcount",cls_rec_havale._lblcount);
 //BA.debugLineNum = 11;BA.debugLine="Private lblCheck As Label";
cls_rec_havale._lblcheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcheck",cls_rec_havale._lblcheck);
 //BA.debugLineNum = 12;BA.debugLine="Private lblUnCheck As Label";
cls_rec_havale._lbluncheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbluncheck",cls_rec_havale._lbluncheck);
 //BA.debugLineNum = 13;BA.debugLine="Private lblShowHavale As Label";
cls_rec_havale._lblshowhavale = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshowhavale",cls_rec_havale._lblshowhavale);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_rec_havale) ","cls_rec_havale",75,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_rec_havale","getheight", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("getPanel (cls_rec_havale) ","cls_rec_havale",75,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_rec_havale","getpanel", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 26;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Initialize (cls_rec_havale) ","cls_rec_havale",75,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_rec_havale","initialize", __ref, _ba, _mdl);}
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
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_rec_havale.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_rec_havale.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 20;BA.debugLine="p.LoadLayout(\"l_rechavale\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_rechavale")),__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblshowhavale_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblShowHavale_Click (cls_rec_havale) ","cls_rec_havale",75,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("lblshowhavale_click")) { return __ref.runUserSub(false, "cls_rec_havale","lblshowhavale_click", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Public Sub lblShowHavale_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="MCode.ShomareHavale=Item.fldShomareHavale";
Debug.ShouldStop(16777216);
cls_rec_havale._mcode._shomarehavale /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldShomareHavale" /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="Act_RizHavale.Item1=Item";
Debug.ShouldStop(33554432);
cls_rec_havale._act_rizhavale._item1 /*RemoteObject*/  = __ref.getField(false,"_item" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="StartActivity(Act_RizHavale)";
Debug.ShouldStop(67108864);
cls_rec_havale.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_rec_havale._act_rizhavale.getObject())));
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
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _item1) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_rec_havale) ","cls_rec_havale",75,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_rec_havale","show", __ref, _item1);}
Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 33;BA.debugLine="Public Sub Show(Item1 As AdapteRepHavale)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Item=Item1";
Debug.ShouldStop(2);
__ref.setField ("_item" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 35;BA.debugLine="LblShomareHavale.Text=\"شماره حواله \"&Item1.fldSho";
Debug.ShouldStop(4);
__ref.getField(false,"_lblshomarehavale" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شماره حواله "),_item1.getField(true,"fldShomareHavale" /*RemoteObject*/ ))));
 BA.debugLineNum = 36;BA.debugLine="LblDate.Text=MCode.PersianDateDash(Item1.fldDate)";
Debug.ShouldStop(8);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_rec_havale._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldDate" /*RemoteObject*/ )))));
 BA.debugLineNum = 37;BA.debugLine="lblCount.Text=Item1.fldCountFactor";
Debug.ShouldStop(16);
__ref.getField(false,"_lblcount" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldCountFactor" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="If Item1.fldMandeFactor>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item1.getField(true,"fldMandeFactor" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 39;BA.debugLine="LblTotal.Text=MCode.qomaAshar(Item1.fldMandeFact";
Debug.ShouldStop(64);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_rec_havale._mcode.runMethod(true,"_qomaashar" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((_item1.getField(true,"fldMandeFactor" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),cls_rec_havale._mcode._vahedpool /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 41;BA.debugLine="LblTotal.Text=0";
Debug.ShouldStop(256);
__ref.getField(false,"_lbltotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 44;BA.debugLine="If myCode.Is_Null_adad(Item1.fldVaziat)=0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",cls_rec_havale._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldVaziat" /*RemoteObject*/ ))),BA.NumberToString(0))) { 
 BA.debugLineNum = 45;BA.debugLine="lblUnCheck.Visible=True";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbluncheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rec_havale.__c.getField(true,"True"));
 BA.debugLineNum = 46;BA.debugLine="lblCheck.Visible=False";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblcheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rec_havale.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 48;BA.debugLine="lblUnCheck.Visible=False";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbluncheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rec_havale.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="lblCheck.Visible=True";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblcheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rec_havale.__c.getField(true,"True"));
 };
 BA.debugLineNum = 51;BA.debugLine="Log(Item1.fldVaziat)";
Debug.ShouldStop(262144);
cls_rec_havale.__c.runVoidMethod ("LogImpl","598435090",_item1.getField(true,"fldVaziat" /*RemoteObject*/ ),0);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}