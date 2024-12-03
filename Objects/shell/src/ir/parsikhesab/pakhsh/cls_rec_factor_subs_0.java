package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_rec_factor_subs_0 {


public static RemoteObject  _btnlist_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnList_Click (cls_rec_factor) ","cls_rec_factor",73,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("btnlist_click")) { return __ref.runUserSub(false, "cls_rec_factor","btnlist_click", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Sub BtnList_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="If ItemFactor.fldShomareForoosh>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldShomareForoosh" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 97;BA.debugLine="Act_ReportRizeBargasht.DateAz=date1";
Debug.ShouldStop(1);
cls_rec_factor._act_reportrizebargasht._dateaz /*RemoteObject*/  = __ref.getField(true,"_date1" /*RemoteObject*/ );
 BA.debugLineNum = 98;BA.debugLine="Act_ReportRizeBargasht.DateTa=date2";
Debug.ShouldStop(2);
cls_rec_factor._act_reportrizebargasht._dateta /*RemoteObject*/  = __ref.getField(true,"_date2" /*RemoteObject*/ );
 BA.debugLineNum = 99;BA.debugLine="Act_ReportRizeBargasht.shomareForoosh=ItemFactor";
Debug.ShouldStop(4);
cls_rec_factor._act_reportrizebargasht._shomareforoosh /*RemoteObject*/  = __ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldShomareForoosh" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="Act_ReportRizeBargasht.shomareFaktor=ItemFactor.";
Debug.ShouldStop(8);
cls_rec_factor._act_reportrizebargasht._shomarefaktor /*RemoteObject*/  = __ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ );
 BA.debugLineNum = 101;BA.debugLine="StartActivity(Act_ReportRizeBargasht)";
Debug.ShouldStop(16);
cls_rec_factor.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_rec_factor._act_reportrizebargasht.getObject())));
 }else {
 BA.debugLineNum = 103;BA.debugLine="MCode.FaktorSelect = ItemFactor.fldShomareFaktor";
Debug.ShouldStop(64);
cls_rec_factor._mcode._faktorselect /*RemoteObject*/  = __ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ );
 BA.debugLineNum = 104;BA.debugLine="MCode.IsOnlineDataFactor=0";
Debug.ShouldStop(128);
cls_rec_factor._mcode._isonlinedatafactor /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 105;BA.debugLine="StartActivity(Act_RizFaktor)";
Debug.ShouldStop(256);
cls_rec_factor.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_rec_factor._act_rizfaktor.getObject())));
 };
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshowjozeiat_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnShowJozeiat_Click (cls_rec_factor) ","cls_rec_factor",73,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("btnshowjozeiat_click")) { return __ref.runUserSub(false, "cls_rec_factor","btnshowjozeiat_click", __ref);}
 BA.debugLineNum = 112;BA.debugLine="Private Sub btnShowJozeiat_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="MCode.FaktorSelect = ItemFactor.fldShomareFaktor";
Debug.ShouldStop(65536);
cls_rec_factor._mcode._faktorselect /*RemoteObject*/  = __ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="MCode.IsOnlineDataFactor=0";
Debug.ShouldStop(131072);
cls_rec_factor._mcode._isonlinedatafactor /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 115;BA.debugLine="Act_RizFaktor.Faktor=ItemFactor";
Debug.ShouldStop(262144);
cls_rec_factor._act_rizfaktor._faktor /*RemoteObject*/  = __ref.getField(false,"_itemfactor" /*RemoteObject*/ );
 BA.debugLineNum = 116;BA.debugLine="StartActivity(Act_RizFaktor)";
Debug.ShouldStop(524288);
cls_rec_factor.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_rec_factor._act_rizfaktor.getObject())));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshowmoqhaerat_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnShowMoqhaerat_Click (cls_rec_factor) ","cls_rec_factor",73,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("btnshowmoqhaerat_click")) { return __ref.runUserSub(false, "cls_rec_factor","btnshowmoqhaerat_click", __ref);}
 BA.debugLineNum = 119;BA.debugLine="Private Sub btnShowMoqhaerat_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Act_ReportRizeBargasht.DateAz=date1";
Debug.ShouldStop(8388608);
cls_rec_factor._act_reportrizebargasht._dateaz /*RemoteObject*/  = __ref.getField(true,"_date1" /*RemoteObject*/ );
 BA.debugLineNum = 121;BA.debugLine="Act_ReportRizeBargasht.DateTa=date2";
Debug.ShouldStop(16777216);
cls_rec_factor._act_reportrizebargasht._dateta /*RemoteObject*/  = __ref.getField(true,"_date2" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="Act_ReportRizeBargasht.shomareForoosh=ItemFactor.";
Debug.ShouldStop(33554432);
cls_rec_factor._act_reportrizebargasht._shomareforoosh /*RemoteObject*/  = __ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldShomareForoosh" /*RemoteObject*/ );
 BA.debugLineNum = 123;BA.debugLine="Act_ReportRizeBargasht.shomareFaktor=ItemFactor.f";
Debug.ShouldStop(67108864);
cls_rec_factor._act_reportrizebargasht._shomarefaktor /*RemoteObject*/  = __ref.getField(false,"_itemfactor" /*RemoteObject*/ ).getField(true,"fldShomareFaktor" /*RemoteObject*/ );
 BA.debugLineNum = 124;BA.debugLine="StartActivity(Act_ReportRizeBargasht)";
Debug.ShouldStop(134217728);
cls_rec_factor.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_rec_factor._act_reportrizebargasht.getObject())));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
cls_rec_factor._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_rec_factor._p);
 //BA.debugLineNum = 3;BA.debugLine="Private LblShomareFaktor As Label";
cls_rec_factor._lblshomarefaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarefaktor",cls_rec_factor._lblshomarefaktor);
 //BA.debugLineNum = 4;BA.debugLine="Private LblTotalFaktor As Label";
cls_rec_factor._lbltotalfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotalfaktor",cls_rec_factor._lbltotalfaktor);
 //BA.debugLineNum = 5;BA.debugLine="Private LblDate As Label";
cls_rec_factor._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldate",cls_rec_factor._lbldate);
 //BA.debugLineNum = 6;BA.debugLine="Private LblC_Ashkhas As Label";
cls_rec_factor._lblc_ashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblc_ashkhas",cls_rec_factor._lblc_ashkhas);
 //BA.debugLineNum = 7;BA.debugLine="Private Panel4 As Panel";
cls_rec_factor._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel4",cls_rec_factor._panel4);
 //BA.debugLineNum = 8;BA.debugLine="Private pnl_bk As Panel";
cls_rec_factor._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_rec_factor._pnl_bk);
 //BA.debugLineNum = 9;BA.debugLine="Private base As Object";
cls_rec_factor._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_rec_factor._base);
 //BA.debugLineNum = 10;BA.debugLine="Private BtnList As Button";
cls_rec_factor._btnlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnlist",cls_rec_factor._btnlist);
 //BA.debugLineNum = 11;BA.debugLine="Private LblN_Ashkhas As Label";
cls_rec_factor._lbln_ashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbln_ashkhas",cls_rec_factor._lbln_ashkhas);
 //BA.debugLineNum = 12;BA.debugLine="Private ItemFactor As AdapterListFaktor";
cls_rec_factor._itemfactor = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");__ref.setField("_itemfactor",cls_rec_factor._itemfactor);
 //BA.debugLineNum = 13;BA.debugLine="Private lblDateBargashti As Label";
cls_rec_factor._lbldatebargashti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldatebargashti",cls_rec_factor._lbldatebargashti);
 //BA.debugLineNum = 14;BA.debugLine="Private lblShomareBargashti As Label";
cls_rec_factor._lblshomarebargashti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarebargashti",cls_rec_factor._lblshomarebargashti);
 //BA.debugLineNum = 15;BA.debugLine="Private lblShomareForoosh As Label";
cls_rec_factor._lblshomareforoosh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomareforoosh",cls_rec_factor._lblshomareforoosh);
 //BA.debugLineNum = 16;BA.debugLine="Private lblTedadBargashti As Label";
cls_rec_factor._lbltedadbargashti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadbargashti",cls_rec_factor._lbltedadbargashti);
 //BA.debugLineNum = 17;BA.debugLine="Private lblTedadSefaresh As Label";
cls_rec_factor._lbltedadsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadsefaresh",cls_rec_factor._lbltedadsefaresh);
 //BA.debugLineNum = 18;BA.debugLine="Private lblTotalBargashti As Label";
cls_rec_factor._lbltotalbargashti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotalbargashti",cls_rec_factor._lbltotalbargashti);
 //BA.debugLineNum = 19;BA.debugLine="Private lblTedadMande As Label";
cls_rec_factor._lbltedadmande = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadmande",cls_rec_factor._lbltedadmande);
 //BA.debugLineNum = 20;BA.debugLine="Private lblMablaghMande As Label";
cls_rec_factor._lblmablaghmande = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghmande",cls_rec_factor._lblmablaghmande);
 //BA.debugLineNum = 21;BA.debugLine="Dim date1,date2 As String";
cls_rec_factor._date1 = RemoteObject.createImmutable("");__ref.setField("_date1",cls_rec_factor._date1);
cls_rec_factor._date2 = RemoteObject.createImmutable("");__ref.setField("_date2",cls_rec_factor._date2);
 //BA.debugLineNum = 22;BA.debugLine="Private btnShowJozeiat As Button";
cls_rec_factor._btnshowjozeiat = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnshowjozeiat",cls_rec_factor._btnshowjozeiat);
 //BA.debugLineNum = 23;BA.debugLine="Private lblCheckAmani As Label";
cls_rec_factor._lblcheckamani = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcheckamani",cls_rec_factor._lblcheckamani);
 //BA.debugLineNum = 24;BA.debugLine="Private lblVaziat As Label";
cls_rec_factor._lblvaziat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvaziat",cls_rec_factor._lblvaziat);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_rec_factor) ","cls_rec_factor",73,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_rec_factor","getheight", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(256);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("getPanel (cls_rec_factor) ","cls_rec_factor",73,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_rec_factor","getpanel", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(8);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 37;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Initialize (cls_rec_factor) ","cls_rec_factor",73,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_rec_factor","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="base = mdl";
Debug.ShouldStop(134217728);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 29;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 30;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_rec_factor.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_rec_factor.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 31;BA.debugLine="p.LoadLayout(\"L_Rec_Factor\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Rec_Factor")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="ItemFactor.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_itemfactor" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _item1,RemoteObject _dateaz,RemoteObject _dateta) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_rec_factor) ","cls_rec_factor",73,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_rec_factor","show", __ref, _item1, _dateaz, _dateta);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("Item1", _item1);
Debug.locals.put("DateAz", _dateaz);
Debug.locals.put("DateTa", _dateta);
 BA.debugLineNum = 44;BA.debugLine="Public Sub Show(Item1 As AdapterListFaktor,DateAz";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="ItemFactor = Item1";
Debug.ShouldStop(8192);
__ref.setField ("_itemfactor" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 47;BA.debugLine="LblShomareFaktor.Text = Item1.fldShomareFaktor";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblshomarefaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldShomareFaktor" /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="LblTotalFaktor.Text = NumberFormat(Item1.fldTotal";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltotalfaktor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_rec_factor.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item1.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 49;BA.debugLine="LblDate.Text = Item1.fldDate";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldDate" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="LblC_Ashkhas.Text = Item1.fldC_Ashkhas";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblc_ashkhas" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldC_Ashkhas" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="lblShomareForoosh.Text=Item1.fldShomareForoosh";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblshomareforoosh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_item1.getField(true,"fldShomareForoosh" /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="lblShomareBargashti.Text=myCode.Is_Null_adad(Item";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblshomarebargashti" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_rec_factor._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"FldShomareBargasht" /*RemoteObject*/ )))));
 BA.debugLineNum = 53;BA.debugLine="lblDateBargashti.Text=IIf(myCode.Check_Is_Null(It";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbldatebargashti" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(((cls_rec_factor._mycode.runMethod(true,"_check_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"FldDateBargasht" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable(("-"))) : ((_item1.getField(true,"FldDateBargasht" /*RemoteObject*/ ))))));
 BA.debugLineNum = 54;BA.debugLine="lblTedadSefaresh.Text=myCode.ToInt(myCode.Is_Null";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbltedadsefaresh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_rec_factor._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((cls_rec_factor._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldTedadJoz" /*RemoteObject*/ )))))),RemoteObject.createImmutable("-"),cls_rec_factor._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((cls_rec_factor._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldTedadCarton" /*RemoteObject*/ )))))))));
 BA.debugLineNum = 55;BA.debugLine="lblTedadBargashti.Text=myCode.ToInt(myCode.Is_Nul";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbltedadbargashti" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_rec_factor._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((cls_rec_factor._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldTedadJozMarjoee" /*RemoteObject*/ )))))),RemoteObject.createImmutable("-"),cls_rec_factor._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((cls_rec_factor._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldTedadCartonMarjoee" /*RemoteObject*/ )))))))));
 BA.debugLineNum = 56;BA.debugLine="lblTedadMande.Text=myCode.ToInt(myCode.Is_Null_ad";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lbltedadmande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(cls_rec_factor._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((cls_rec_factor._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldTedadJozMande" /*RemoteObject*/ )))))),RemoteObject.createImmutable("-"),cls_rec_factor._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((cls_rec_factor._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldTedadCartonMande" /*RemoteObject*/ )))))))));
 BA.debugLineNum = 57;BA.debugLine="lblMablaghMande.Text=IIf(myCode.Check_Is_Null(Ite";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblmablaghmande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(((cls_rec_factor._mycode.runMethod(true,"_check_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldMablaghMande" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable((0))) : ((cls_rec_factor._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"fldMablaghMande" /*RemoteObject*/ ))))))));
 BA.debugLineNum = 58;BA.debugLine="lblTotalBargashti.Text=IIf(myCode.Check_Is_Null(I";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lbltotalbargashti" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(((cls_rec_factor._mycode.runMethod(true,"_check_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"FldMablaghBargasht" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable((0))) : ((cls_rec_factor._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item1.getField(true,"FldMablaghBargasht" /*RemoteObject*/ ))))))));
 BA.debugLineNum = 59;BA.debugLine="If Item1.FldAmani=0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_item1.getField(true,"FldAmani" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 60;BA.debugLine="lblCheckAmani.Text=Chr(0xE835)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblcheckamani" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_rec_factor.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe835))))));
 }else {
 BA.debugLineNum = 63;BA.debugLine="lblCheckAmani.Text=Chr(0xE834)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblcheckamani" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_rec_factor.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe834))))));
 };
 BA.debugLineNum = 67;BA.debugLine="If Item1.synced=True Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_item1.getField(true,"synced" /*RemoteObject*/ ),cls_rec_factor.__c.getField(true,"True"))) { 
 BA.debugLineNum = 69;BA.debugLine="lblVaziat.Text=\"سفارش ارسال شده\"";
Debug.ShouldStop(16);
__ref.getField(false,"_lblvaziat" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("سفارش ارسال شده"));
 BA.debugLineNum = 71;BA.debugLine="If lblShomareForoosh.Text>0   Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_lblshomareforoosh" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 72;BA.debugLine="lblVaziat.Text=\"سفارش تکمیل شده\"";
Debug.ShouldStop(128);
__ref.getField(false,"_lblvaziat" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("سفارش تکمیل شده"));
 BA.debugLineNum = 74;BA.debugLine="If lblShomareBargashti.Text>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_lblshomarebargashti" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="lblVaziat.Text=\"سفارش مرجوع شده\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblvaziat" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("سفارش مرجوع شده"));
 };
 };
 }else {
 BA.debugLineNum = 80;BA.debugLine="lblVaziat.Text=\"سفارش ارسال نشده\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblvaziat" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("سفارش ارسال نشده"));
 };
 BA.debugLineNum = 83;BA.debugLine="Dim Cu As Cursor= MCode.Result(\"Select fldSharheT";
Debug.ShouldStop(262144);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_rec_factor._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select fldSharheTafzili From TblAshkhas where FldCodeTafzili = '"),_item1.getField(true,"fldC_Ashkhas" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 84;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 85;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(1048576);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 86;BA.debugLine="LblN_Ashkhas.Text = Cu.GetString(\"fldSharheTafzi";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbln_ashkhas" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili")))));
 }else {
 BA.debugLineNum = 88;BA.debugLine="LblN_Ashkhas.Text = \"-\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lbln_ashkhas" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("-"));
 };
 BA.debugLineNum = 91;BA.debugLine="date1=DateAz";
Debug.ShouldStop(67108864);
__ref.setField ("_date1" /*RemoteObject*/ ,_dateaz);
 BA.debugLineNum = 92;BA.debugLine="date2=DateTa";
Debug.ShouldStop(134217728);
__ref.setField ("_date2" /*RemoteObject*/ ,_dateta);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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