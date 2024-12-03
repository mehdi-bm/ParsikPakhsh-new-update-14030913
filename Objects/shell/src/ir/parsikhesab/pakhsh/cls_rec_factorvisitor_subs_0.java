package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_rec_factorvisitor_subs_0 {


public static RemoteObject  _btncheck_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnCheck_Click (cls_rec_factorvisitor) ","cls_rec_factorvisitor",74,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("btncheck_click")) { return __ref.runUserSub(false, "cls_rec_factorvisitor","btncheck_click", __ref);}
RemoteObject _query = RemoteObject.createImmutable("");
 BA.debugLineNum = 70;BA.debugLine="Sub BtnCheck_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Log(LblShomareFaktor.Text)";
Debug.ShouldStop(64);
cls_rec_factorvisitor.__c.runVoidMethod ("LogImpl","598041857",__ref.getField(false,"_lblshomarefaktor" /*RemoteObject*/ ).runMethod(true,"getText"),0);
 BA.debugLineNum = 72;BA.debugLine="Dim query As String";
Debug.ShouldStop(128);
_query = RemoteObject.createImmutable("");Debug.locals.put("query", _query);
 BA.debugLineNum = 73;BA.debugLine="query=\"Update tblPishPishFaktor set fldShomareFac";
Debug.ShouldStop(256);
_query = RemoteObject.concat(RemoteObject.createImmutable("Update tblPishPishFaktor set fldShomareFactorReal=NULL where fldShomareFactorReal=-1 and fldShomareFactor="),__ref.getField(false,"_lblshomarefaktor" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" and fldCodeVasete="),__ref.getField(false,"_lblcodevisitor" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("query", _query);
 BA.debugLineNum = 74;BA.debugLine="MCode.BackPage=\"Act_RepFactorVisitor\"";
Debug.ShouldStop(512);
cls_rec_factorvisitor._mcode._backpage /*RemoteObject*/  = BA.ObjectToString("Act_RepFactorVisitor");
 BA.debugLineNum = 75;BA.debugLine="CallSubDelayed2(Service_Server,\"SendUpdateQuery\",";
Debug.ShouldStop(1024);
cls_rec_factorvisitor.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((cls_rec_factorvisitor._service_server.getObject())),(Object)(BA.ObjectToString("SendUpdateQuery")),(Object)((_query)));
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
public static RemoteObject  _btnjoziat_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnJoziat_Click (cls_rec_factorvisitor) ","cls_rec_factorvisitor",74,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("btnjoziat_click")) { return __ref.runUserSub(false, "cls_rec_factorvisitor","btnjoziat_click", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Sub btnJoziat_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="Act_RepRizFactorVisitor.Item1=btnJoziat.Tag";
Debug.ShouldStop(32768);
cls_rec_factorvisitor._act_reprizfactorvisitor._item1 /*RemoteObject*/  = (__ref.getField(false,"_btnjoziat" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 81;BA.debugLine="StartActivity(Act_RepRizFactorVisitor)";
Debug.ShouldStop(65536);
cls_rec_factorvisitor.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_rec_factorvisitor._act_reprizfactorvisitor.getObject())));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
cls_rec_factorvisitor._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_rec_factorvisitor._p);
 //BA.debugLineNum = 3;BA.debugLine="Private LblShomareFaktor As Label";
cls_rec_factorvisitor._lblshomarefaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarefaktor",cls_rec_factorvisitor._lblshomarefaktor);
 //BA.debugLineNum = 5;BA.debugLine="Private Panel4 As Panel";
cls_rec_factorvisitor._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel4",cls_rec_factorvisitor._panel4);
 //BA.debugLineNum = 6;BA.debugLine="Private pnl_bk As Panel";
cls_rec_factorvisitor._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_rec_factorvisitor._pnl_bk);
 //BA.debugLineNum = 7;BA.debugLine="Private base As Object";
cls_rec_factorvisitor._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_rec_factorvisitor._base);
 //BA.debugLineNum = 10;BA.debugLine="Private BtnCheck As Button";
cls_rec_factorvisitor._btncheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btncheck",cls_rec_factorvisitor._btncheck);
 //BA.debugLineNum = 11;BA.debugLine="Private LblDate As Label";
cls_rec_factorvisitor._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldate",cls_rec_factorvisitor._lbldate);
 //BA.debugLineNum = 12;BA.debugLine="Private lblCodeVisitor As Label";
cls_rec_factorvisitor._lblcodevisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcodevisitor",cls_rec_factorvisitor._lblcodevisitor);
 //BA.debugLineNum = 13;BA.debugLine="Private lblNameVisitor As Label";
cls_rec_factorvisitor._lblnamevisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamevisitor",cls_rec_factorvisitor._lblnamevisitor);
 //BA.debugLineNum = 14;BA.debugLine="Private lblVaziatTasfie As Label";
cls_rec_factorvisitor._lblvaziattasfie = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvaziattasfie",cls_rec_factorvisitor._lblvaziattasfie);
 //BA.debugLineNum = 15;BA.debugLine="Private lblVaziatSefaresh As Label";
cls_rec_factorvisitor._lblvaziatsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvaziatsefaresh",cls_rec_factorvisitor._lblvaziatsefaresh);
 //BA.debugLineNum = 16;BA.debugLine="Private lblSharh As Label";
cls_rec_factorvisitor._lblsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsharh",cls_rec_factorvisitor._lblsharh);
 //BA.debugLineNum = 17;BA.debugLine="Private btnJoziat As Button";
cls_rec_factorvisitor._btnjoziat = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnjoziat",cls_rec_factorvisitor._btnjoziat);
 //BA.debugLineNum = 18;BA.debugLine="Private lblCodeTafzili As Label";
cls_rec_factorvisitor._lblcodetafzili = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcodetafzili",cls_rec_factorvisitor._lblcodetafzili);
 //BA.debugLineNum = 19;BA.debugLine="Private lblSharhTafzili As Label";
cls_rec_factorvisitor._lblsharhtafzili = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsharhtafzili",cls_rec_factorvisitor._lblsharhtafzili);
 //BA.debugLineNum = 20;BA.debugLine="Private lblTime As Label";
cls_rec_factorvisitor._lbltime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltime",cls_rec_factorvisitor._lbltime);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_rec_factorvisitor) ","cls_rec_factorvisitor",74,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_rec_factorvisitor","getheight", __ref);}
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
		Debug.PushSubsStack("getPanel (cls_rec_factorvisitor) ","cls_rec_factorvisitor",74,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_rec_factorvisitor","getpanel", __ref);}
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mdl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_rec_factorvisitor) ","cls_rec_factorvisitor",74,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_rec_factorvisitor","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="base = mdl";
Debug.ShouldStop(8388608);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 25;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 26;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_rec_factorvisitor.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_rec_factorvisitor.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 27;BA.debugLine="p.LoadLayout(\"l_rec_factorvisitor\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_rec_factorvisitor")),__ref.getField(false, "ba"));
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
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _item1) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_rec_factorvisitor) ","cls_rec_factorvisitor",74,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_rec_factorvisitor","show", __ref, _item1);}
Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 40;BA.debugLine="Public Sub Show(Item1 As AdapteRepFactorVisitor)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="BtnCheck.Tag = Item1";
Debug.ShouldStop(256);
__ref.getField(false,"_btncheck" /*RemoteObject*/ ).runMethod(false,"setTag",(_item1));
 BA.debugLineNum = 42;BA.debugLine="btnJoziat.Tag = Item1";
Debug.ShouldStop(512);
__ref.getField(false,"_btnjoziat" /*RemoteObject*/ ).runMethod(false,"setTag",(_item1));
 BA.debugLineNum = 43;BA.debugLine="LblShomareFaktor.Text = Item1.fldShomareFactor";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblshomarefaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldShomareFactor" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="lblCodeVisitor.Text = Item1.fldCodeVasete";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblcodevisitor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldCodeVasete" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="lblNameVisitor.Text = Item1.FldN_Visitor";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblnamevisitor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"FldN_Visitor" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="LblDate.Text = MCode.PersianDateDash(Item1.fldDat";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_rec_factorvisitor._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldDate" /*RemoteObject*/ )))));
 BA.debugLineNum = 47;BA.debugLine="lblTime.Text=Item1.fldTime";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbltime" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldTime" /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="lblVaziatTasfie.Text = Item1.fldNahveTasvie";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblvaziattasfie" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldNahveTasvie" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="lblCodeTafzili.Text=Item1.fldCodeTafsili";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblcodetafzili" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldCodeTafsili" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="lblSharhTafzili.Text=Item1.fldSharheTafzili";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblsharhtafzili" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldSharheTafzili" /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="lblSharh.Text = Item1.fldTozihat";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblsharh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldTozihat" /*RemoteObject*/ )));
 BA.debugLineNum = 53;BA.debugLine="If Item1.fldShomareFactorReal =-1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_item1.getField(true,"fldShomareFactorReal" /*RemoteObject*/ ),BA.NumberToString(-(double) (0 + 1)))) { 
 BA.debugLineNum = 54;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Red";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblvaziatsefaresh" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_rec_factorvisitor.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 55;BA.debugLine="lblVaziatSefaresh.Text =\"تایید نشده\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblvaziatsefaresh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("تایید نشده"));
 BA.debugLineNum = 56;BA.debugLine="BtnCheck.Visible=True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btncheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rec_factorvisitor.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 57;BA.debugLine="Else If Item1.fldShomareFactorReal=\"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_item1.getField(true,"fldShomareFactorReal" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 58;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Green";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblvaziatsefaresh" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_rec_factorvisitor.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 59;BA.debugLine="lblVaziatSefaresh.Text =\"تایید شده\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblvaziatsefaresh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("تایید شده"));
 BA.debugLineNum = 60;BA.debugLine="BtnCheck.Visible=False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btncheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rec_factorvisitor.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 62;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Black";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblvaziatsefaresh" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_rec_factorvisitor.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 63;BA.debugLine="lblVaziatSefaresh.Text =\"ثبت شده\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblvaziatsefaresh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("ثبت شده"));
 BA.debugLineNum = 64;BA.debugLine="BtnCheck.Visible=False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btncheck" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_rec_factorvisitor.__c.getField(true,"False"));
 }}
;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}