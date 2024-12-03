package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_reprizfactorvisitor_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"l_repsefareshvisitor\")";
Debug.ShouldStop(2);
act_reprizfactorvisitor.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_repsefareshvisitor")),act_reprizfactorvisitor.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(4);
act_reprizfactorvisitor.mostCurrent._hlv.runMethod(false,"Initializer",act_reprizfactorvisitor.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 36;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
Debug.ShouldStop(8);
act_reprizfactorvisitor.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_reprizfactorvisitor.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_reprizfactorvisitor.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_reprizfactorvisitor.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 37;BA.debugLine="ListFaktor.Initialize";
Debug.ShouldStop(16);
act_reprizfactorvisitor.mostCurrent._listfaktor.runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="HLV.Ripple.Color(0xFF909090)";
Debug.ShouldStop(64);
act_reprizfactorvisitor.mostCurrent._hlv.runMethod(false,"Ripple").runVoidMethod ("Color",(Object)(BA.numberCast(int.class, ((int)0xff909090))));
 BA.debugLineNum = 41;BA.debugLine="HLV.Show";
Debug.ShouldStop(256);
act_reprizfactorvisitor.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 44;BA.debugLine="CreatePage";
Debug.ShouldStop(2048);
_createpage();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,171);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 171;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,162);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","activity_resume");}
 BA.debugLineNum = 162;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(4);
act_reprizfactorvisitor.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,187);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 187;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 189;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return act_reprizfactorvisitor.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncheck_click() throws Exception{
try {
		Debug.PushSubsStack("BtnCheck_Click (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,179);
if (RapidSub.canDelegate("btncheck_click")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","btncheck_click");}
RemoteObject _query = RemoteObject.createImmutable("");
 BA.debugLineNum = 179;BA.debugLine="Sub BtnCheck_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Log(LblShomareFaktor.Text)";
Debug.ShouldStop(524288);
act_reprizfactorvisitor.mostCurrent.__c.runVoidMethod ("LogImpl","527131905",act_reprizfactorvisitor.mostCurrent._lblshomarefaktor.runMethod(true,"getText"),0);
 BA.debugLineNum = 181;BA.debugLine="Dim query As String";
Debug.ShouldStop(1048576);
_query = RemoteObject.createImmutable("");Debug.locals.put("query", _query);
 BA.debugLineNum = 182;BA.debugLine="query=\"Update tblPishPishFaktor set fldShomareFac";
Debug.ShouldStop(2097152);
_query = RemoteObject.concat(RemoteObject.createImmutable("Update tblPishPishFaktor set fldShomareFactorReal=NULL where fldShomareFactorReal=-1 and fldShomareFactor="),act_reprizfactorvisitor.mostCurrent._lblshomarefaktor.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldCodeVasete="),act_reprizfactorvisitor.mostCurrent._lblcodevisitor.runMethod(true,"getText"));Debug.locals.put("query", _query);
 BA.debugLineNum = 183;BA.debugLine="MCode.page=\"Act_RepRizFactorVisitor\"";
Debug.ShouldStop(4194304);
act_reprizfactorvisitor.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_RepRizFactorVisitor");
 BA.debugLineNum = 184;BA.debugLine="MCode.Tag=Item1";
Debug.ShouldStop(8388608);
act_reprizfactorvisitor.mostCurrent._mcode._tag /*RemoteObject*/  = (act_reprizfactorvisitor._item1);
 BA.debugLineNum = 185;BA.debugLine="CallSubDelayed2(Service_Server,\"SendUpdateQuery\",";
Debug.ShouldStop(16777216);
act_reprizfactorvisitor.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_reprizfactorvisitor.processBA,(Object)((act_reprizfactorvisitor.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("SendUpdateQuery")),(Object)((_query)));
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlistprofile_click() throws Exception{
try {
		Debug.PushSubsStack("BtnListProfile_Click (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,167);
if (RapidSub.canDelegate("btnlistprofile_click")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","btnlistprofile_click");}
 BA.debugLineNum = 167;BA.debugLine="Sub BtnListProfile_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpage() throws Exception{
try {
		Debug.PushSubsStack("CreatePage (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,47);
if (RapidSub.canDelegate("createpage")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","createpage");}
 BA.debugLineNum = 47;BA.debugLine="Sub CreatePage";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="lblCodeTafzili.Text=Item1.fldCodeTafsili";
Debug.ShouldStop(32768);
act_reprizfactorvisitor.mostCurrent._lblcodetafzili.runMethod(true,"setText",BA.ObjectToCharSequence(act_reprizfactorvisitor._item1.getField(true,"fldCodeTafsili" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="lblCodeVisitor.Text=Item1.fldCodeVasete";
Debug.ShouldStop(65536);
act_reprizfactorvisitor.mostCurrent._lblcodevisitor.runMethod(true,"setText",BA.ObjectToCharSequence(act_reprizfactorvisitor._item1.getField(true,"fldCodeVasete" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="LblDate.Text=MCode.PersianDateDash(Item1.fldDate)";
Debug.ShouldStop(131072);
act_reprizfactorvisitor.mostCurrent._lbldate.runMethod(true,"setText",BA.ObjectToCharSequence(act_reprizfactorvisitor.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_reprizfactorvisitor.mostCurrent.activityBA,(Object)(act_reprizfactorvisitor._item1.getField(true,"fldDate" /*RemoteObject*/ )))));
 BA.debugLineNum = 51;BA.debugLine="lblNameVisitor.Text=Item1.FldN_Visitor";
Debug.ShouldStop(262144);
act_reprizfactorvisitor.mostCurrent._lblnamevisitor.runMethod(true,"setText",BA.ObjectToCharSequence(act_reprizfactorvisitor._item1.getField(true,"FldN_Visitor" /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="lblSharh.Text=Item1.fldTozihat";
Debug.ShouldStop(524288);
act_reprizfactorvisitor.mostCurrent._lblsharh.runMethod(true,"setText",BA.ObjectToCharSequence(act_reprizfactorvisitor._item1.getField(true,"fldTozihat" /*RemoteObject*/ )));
 BA.debugLineNum = 53;BA.debugLine="lblSharhTafzili.Text=Item1.fldSharheTafzili";
Debug.ShouldStop(1048576);
act_reprizfactorvisitor.mostCurrent._lblsharhtafzili.runMethod(true,"setText",BA.ObjectToCharSequence(act_reprizfactorvisitor._item1.getField(true,"fldSharheTafzili" /*RemoteObject*/ )));
 BA.debugLineNum = 54;BA.debugLine="LblShomareFaktor.Text=Item1.fldShomareFactor";
Debug.ShouldStop(2097152);
act_reprizfactorvisitor.mostCurrent._lblshomarefaktor.runMethod(true,"setText",BA.ObjectToCharSequence(act_reprizfactorvisitor._item1.getField(true,"fldShomareFactor" /*RemoteObject*/ )));
 BA.debugLineNum = 56;BA.debugLine="If Item1.fldShomareFactorReal =-1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",act_reprizfactorvisitor._item1.getField(true,"fldShomareFactorReal" /*RemoteObject*/ ),BA.NumberToString(-(double) (0 + 1)))) { 
 BA.debugLineNum = 57;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Red";
Debug.ShouldStop(16777216);
act_reprizfactorvisitor.mostCurrent._lblvaziatsefaresh.runMethod(true,"setTextColor",act_reprizfactorvisitor.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 58;BA.debugLine="lblVaziatSefaresh.Text =\"تایید نشده\"";
Debug.ShouldStop(33554432);
act_reprizfactorvisitor.mostCurrent._lblvaziatsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence("تایید نشده"));
 BA.debugLineNum = 59;BA.debugLine="BtnCheck.Visible=True";
Debug.ShouldStop(67108864);
act_reprizfactorvisitor.mostCurrent._btncheck.runMethod(true,"setVisible",act_reprizfactorvisitor.mostCurrent.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 60;BA.debugLine="Else If Item1.fldShomareFactorReal=\"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_reprizfactorvisitor._item1.getField(true,"fldShomareFactorReal" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 61;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Green";
Debug.ShouldStop(268435456);
act_reprizfactorvisitor.mostCurrent._lblvaziatsefaresh.runMethod(true,"setTextColor",act_reprizfactorvisitor.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 62;BA.debugLine="lblVaziatSefaresh.Text =\"تایید شده\"";
Debug.ShouldStop(536870912);
act_reprizfactorvisitor.mostCurrent._lblvaziatsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence("تایید شده"));
 BA.debugLineNum = 63;BA.debugLine="BtnCheck.Visible=False";
Debug.ShouldStop(1073741824);
act_reprizfactorvisitor.mostCurrent._btncheck.runMethod(true,"setVisible",act_reprizfactorvisitor.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 65;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Black";
Debug.ShouldStop(1);
act_reprizfactorvisitor.mostCurrent._lblvaziatsefaresh.runMethod(true,"setTextColor",act_reprizfactorvisitor.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 66;BA.debugLine="lblVaziatSefaresh.Text =\"ثبت شده\"";
Debug.ShouldStop(2);
act_reprizfactorvisitor.mostCurrent._lblvaziatsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence("ثبت شده"));
 BA.debugLineNum = 67;BA.debugLine="BtnCheck.Visible=False";
Debug.ShouldStop(4);
act_reprizfactorvisitor.mostCurrent._btncheck.runMethod(true,"setVisible",act_reprizfactorvisitor.mostCurrent.__c.getField(true,"False"));
 }}
;
 BA.debugLineNum = 69;BA.debugLine="lblVaziatTasfie.Text=Item1.fldNahveTasvie";
Debug.ShouldStop(16);
act_reprizfactorvisitor.mostCurrent._lblvaziattasfie.runMethod(true,"setText",BA.ObjectToCharSequence(act_reprizfactorvisitor._item1.getField(true,"fldNahveTasvie" /*RemoteObject*/ )));
 BA.debugLineNum = 72;BA.debugLine="ProgressDialogShow2(\"لطفا صبر کنید . . .\",False)";
Debug.ShouldStop(128);
act_reprizfactorvisitor.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_reprizfactorvisitor.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("لطفا صبر کنید . . .")),(Object)(act_reprizfactorvisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 73;BA.debugLine="MCode.C_Visitor=Item1.fldCodeVasete";
Debug.ShouldStop(256);
act_reprizfactorvisitor.mostCurrent._mcode._c_visitor /*RemoteObject*/  = act_reprizfactorvisitor._item1.getField(true,"fldCodeVasete" /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="MCode.FaktorSelect=Item1.fldShomareFactor";
Debug.ShouldStop(512);
act_reprizfactorvisitor.mostCurrent._mcode._faktorselect /*RemoteObject*/  = act_reprizfactorvisitor._item1.getField(true,"fldShomareFactor" /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="CallSubDelayed2(Service_Server,\"GetReportRizFacto";
Debug.ShouldStop(1024);
act_reprizfactorvisitor.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_reprizfactorvisitor.processBA,(Object)((act_reprizfactorvisitor.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("GetReportRizFactorVisitor")),(Object)((act_reprizfactorvisitor._item1.getField(true,"fldDate" /*RemoteObject*/ ))));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Dim HLV As Hitex_LayoutView";
act_reprizfactorvisitor.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 15;BA.debugLine="Private ListFaktor As List";
act_reprizfactorvisitor.mostCurrent._listfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="Private PnlTop As Panel";
act_reprizfactorvisitor.mostCurrent._pnltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private pnl_HLV As Panel";
act_reprizfactorvisitor.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private MPD As ManamPersianDate";
act_reprizfactorvisitor.mostCurrent._mpd = RemoteObject.createNew ("com.b4a.manamsoftware.PersianDate.ManamPersianDate");
 //BA.debugLineNum = 20;BA.debugLine="Private lblCodeTafzili As Label";
act_reprizfactorvisitor.mostCurrent._lblcodetafzili = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lblCodeVisitor As Label";
act_reprizfactorvisitor.mostCurrent._lblcodevisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LblDate As Label";
act_reprizfactorvisitor.mostCurrent._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblNameVisitor As Label";
act_reprizfactorvisitor.mostCurrent._lblnamevisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblSharh As Label";
act_reprizfactorvisitor.mostCurrent._lblsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblSharhTafzili As Label";
act_reprizfactorvisitor.mostCurrent._lblsharhtafzili = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LblShomareFaktor As Label";
act_reprizfactorvisitor.mostCurrent._lblshomarefaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Public lblSumForoosh As Label";
act_reprizfactorvisitor.mostCurrent._lblsumforoosh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblVaziatSefaresh As Label";
act_reprizfactorvisitor.mostCurrent._lblvaziatsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblVaziatTasfie As Label";
act_reprizfactorvisitor.mostCurrent._lblvaziattasfie = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private BtnCheck As Button";
act_reprizfactorvisitor.mostCurrent._btncheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,144);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","hlv_getitemcount");}
 BA.debugLineNum = 144;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="Return ListFaktor.Size";
Debug.ShouldStop(65536);
if (true) return act_reprizfactorvisitor.mostCurrent._listfaktor.runMethod(true,"getSize");
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_onBindViewHolder (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,155);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptereprizfactorvisitor");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 155;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Dim Item = ListFaktor.Get(Position) As AdapteRepR";
Debug.ShouldStop(134217728);
_item = (act_reprizfactorvisitor.mostCurrent._listfaktor.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 157;BA.debugLine="Dim rec As Cls_Rec_RizFactorVisitor=Parent.Tag";
Debug.ShouldStop(268435456);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 158;BA.debugLine="rec.Show(Item)";
Debug.ShouldStop(536870912);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor.class, "_show" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 159;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(1073741824);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_oncreateviewholder(RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,148);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 148;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="Dim rec As Cls_Rec_RizFactorVisitor";
Debug.ShouldStop(1048576);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 150;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(2097152);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor.class, "_initialize" /*RemoteObject*/ ,act_reprizfactorvisitor.mostCurrent.activityBA,(Object)(act_reprizfactorvisitor.getObject()));
 BA.debugLineNum = 151;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(4194304);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_reprizfactorvisitor.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_reprizfactorvisitor.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 152;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(8388608);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,175);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","lblback_click");}
 BA.debugLineNum = 175;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
act_reprizfactorvisitor.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddata(RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("LoadData (act_reprizfactorvisitor) ","act_reprizfactorvisitor",11,act_reprizfactorvisitor.mostCurrent.activityBA,act_reprizfactorvisitor.mostCurrent,79);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_reprizfactorvisitor.remoteMe.runUserSub(false, "act_reprizfactorvisitor","loaddata", _lst);}
RemoteObject _sumkol = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptereprizfactorvisitor");
RemoteObject _tedadjoz = RemoteObject.createImmutable("");
RemoteObject _tedadcarton = RemoteObject.createImmutable("");
RemoteObject _tedaddarkarton = RemoteObject.createImmutable(0);
RemoteObject _sumfee = RemoteObject.createImmutable(0);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 79;BA.debugLine="Sub LoadData(lst As List)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 82;BA.debugLine="If lst.Size>0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 84;BA.debugLine="Dim sumkol As Int";
Debug.ShouldStop(524288);
_sumkol = RemoteObject.createImmutable(0);Debug.locals.put("sumkol", _sumkol);
 BA.debugLineNum = 85;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(1048576);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 86;BA.debugLine="For i=0 To lst.Size-1";
Debug.ShouldStop(2097152);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 87;BA.debugLine="Row=lst.Get(i)";
Debug.ShouldStop(4194304);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 88;BA.debugLine="Dim Item As AdapteRepRizFactorVisitor";
Debug.ShouldStop(8388608);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptereprizfactorvisitor");Debug.locals.put("Item", _item);
 BA.debugLineNum = 89;BA.debugLine="Dim	TedadJoz As String=0";
Debug.ShouldStop(16777216);
_tedadjoz = BA.NumberToString(0);Debug.locals.put("TedadJoz", _tedadjoz);Debug.locals.put("TedadJoz", _tedadjoz);
 BA.debugLineNum = 90;BA.debugLine="Dim	TedadCarton As String=0";
Debug.ShouldStop(33554432);
_tedadcarton = BA.NumberToString(0);Debug.locals.put("TedadCarton", _tedadcarton);Debug.locals.put("TedadCarton", _tedadcarton);
 BA.debugLineNum = 91;BA.debugLine="Dim	TedadDarKarton As Int=0";
Debug.ShouldStop(67108864);
_tedaddarkarton = BA.numberCast(int.class, 0);Debug.locals.put("TedadDarKarton", _tedaddarkarton);Debug.locals.put("TedadDarKarton", _tedaddarkarton);
 BA.debugLineNum = 93;BA.debugLine="Item.fldRadif=Row.Get(\"fldRadif\")";
Debug.ShouldStop(268435456);
_item.setField ("fldRadif" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldRadif"))))));
 BA.debugLineNum = 94;BA.debugLine="Item.fldTozihatRecord=Row.Get(\"fldTozihatRecord";
Debug.ShouldStop(536870912);
_item.setField ("fldTozihatRecord" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTozihatRecord"))))));
 BA.debugLineNum = 95;BA.debugLine="Item.fldCodeKala=Row.Get(\"fldCodeKala\")";
Debug.ShouldStop(1073741824);
_item.setField ("fldCodeKala" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCodeKala"))))));
 BA.debugLineNum = 96;BA.debugLine="Item.fldSharhKala=Row.Get(\"fldSharhKala\")";
Debug.ShouldStop(-2147483648);
_item.setField ("fldSharhKala" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharhKala"))))));
 BA.debugLineNum = 98;BA.debugLine="If Row.Get(\"fldFeeJoz\")>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeJoz"))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 99;BA.debugLine="Item.fldFeeJoz =MCode.qomaAshar(Row.Get(\"fldFe";
Debug.ShouldStop(4);
_item.setField ("fldFeeJoz" /*RemoteObject*/ ,act_reprizfactorvisitor.mostCurrent._mcode.runMethod(true,"_qomaashar" /*RemoteObject*/ ,act_reprizfactorvisitor.mostCurrent.activityBA,(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeJoz")))))));
 }else {
 BA.debugLineNum = 101;BA.debugLine="Item.fldFeeJoz =0";
Debug.ShouldStop(16);
_item.setField ("fldFeeJoz" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 BA.debugLineNum = 104;BA.debugLine="If	Row.Get(\"fldTedadJoz\")<>Null Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("N",_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz")))))) { 
 BA.debugLineNum = 105;BA.debugLine="TedadJoz=Row.Get(\"fldTedadJoz\")";
Debug.ShouldStop(256);
_tedadjoz = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz")))));Debug.locals.put("TedadJoz", _tedadjoz);
 };
 BA.debugLineNum = 109;BA.debugLine="Item.fldTedadJoz =TedadJoz";
Debug.ShouldStop(4096);
_item.setField ("fldTedadJoz" /*RemoteObject*/ ,_tedadjoz);
 BA.debugLineNum = 110;BA.debugLine="If	Row.Get(\"fldTedadCarton\")<>Null And Row.Get(";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("N",_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))) && RemoteObject.solveBoolean("!",_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 111;BA.debugLine="TedadCarton=Row.Get(\"fldTedadCarton\")";
Debug.ShouldStop(16384);
_tedadcarton = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton")))));Debug.locals.put("TedadCarton", _tedadcarton);
 };
 BA.debugLineNum = 115;BA.debugLine="Item.fldTedadCarton =TedadCarton";
Debug.ShouldStop(262144);
_item.setField ("fldTedadCarton" /*RemoteObject*/ ,_tedadcarton);
 BA.debugLineNum = 118;BA.debugLine="If	Row.Get(\"FldTedadDarKarton\")<>Null Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("N",_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTedadDarKarton")))))) { 
 BA.debugLineNum = 119;BA.debugLine="TedadDarKarton=Row.Get(\"FldTedadDarKarton\")";
Debug.ShouldStop(4194304);
_tedaddarkarton = BA.numberCast(int.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FldTedadDarKarton")))));Debug.locals.put("TedadDarKarton", _tedaddarkarton);
 BA.debugLineNum = 120;BA.debugLine="Item.FldTedadDarKarton =TedadDarKarton";
Debug.ShouldStop(8388608);
_item.setField ("FldTedadDarKarton" /*RemoteObject*/ ,BA.NumberToString(_tedaddarkarton));
 };
 BA.debugLineNum = 124;BA.debugLine="Dim SumFee As Int=(TedadJoz*Row.Get(\"fldFeeJoz\"";
Debug.ShouldStop(134217728);
_sumfee = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadjoz),BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeJoz")))))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadcarton),_tedaddarkarton}, "*",0, 0)),BA.numberCast(double.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeJoz")))))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("SumFee", _sumfee);Debug.locals.put("SumFee", _sumfee);
 BA.debugLineNum = 126;BA.debugLine="Item.SumFee =SumFee";
Debug.ShouldStop(536870912);
_item.setField ("SumFee" /*RemoteObject*/ ,_sumfee);
 BA.debugLineNum = 130;BA.debugLine="sumkol=sumkol+SumFee";
Debug.ShouldStop(2);
_sumkol = RemoteObject.solve(new RemoteObject[] {_sumkol,_sumfee}, "+",1, 1);Debug.locals.put("sumkol", _sumkol);
 BA.debugLineNum = 131;BA.debugLine="ListFaktor.Add(Item)";
Debug.ShouldStop(4);
act_reprizfactorvisitor.mostCurrent._listfaktor.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 133;BA.debugLine="If sumkol>0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_sumkol,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 134;BA.debugLine="lblSumForoosh.Text=MCode.qomaAshar(sumkol) &\" \"";
Debug.ShouldStop(32);
act_reprizfactorvisitor.mostCurrent._lblsumforoosh.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_reprizfactorvisitor.mostCurrent._mcode.runMethod(true,"_qomaashar" /*RemoteObject*/ ,act_reprizfactorvisitor.mostCurrent.activityBA,(Object)((_sumkol))),RemoteObject.createImmutable(" "),act_reprizfactorvisitor.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 136;BA.debugLine="lblSumForoosh.Text=0";
Debug.ShouldStop(128);
act_reprizfactorvisitor.mostCurrent._lblsumforoosh.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 140;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(2048);
act_reprizfactorvisitor.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 };
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim Item1 As AdapteRepFactorVisitor";
act_reprizfactorvisitor._item1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}