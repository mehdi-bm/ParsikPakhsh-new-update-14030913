package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_rizcheck_subs_0 {


public static RemoteObject  _btndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (cls_rizcheck) ","cls_rizcheck",88,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("btndelete_click")) { return __ref.runUserSub(false, "cls_rizcheck","btndelete_click", __ref);}
RemoteObject _result = RemoteObject.createImmutable(0);
 BA.debugLineNum = 91;BA.debugLine="Sub btnDelete_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Log(item.ID)";
Debug.ShouldStop(134217728);
cls_rizcheck.__c.runVoidMethod ("LogImpl","5108068865",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"ID" /*RemoteObject*/ ),0);
 BA.debugLineNum = 93;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 94;BA.debugLine="Dim result As Int";
Debug.ShouldStop(536870912);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 95;BA.debugLine="result = Msgbox2(\"آیا از حذف چک مورد نظر اطمینان";
Debug.ShouldStop(1073741824);
_result = cls_rizcheck.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("آیا از حذف چک مورد نظر اطمینان دارید؟")),(Object)(BA.ObjectToCharSequence("حذف چک")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((cls_rizcheck.__c.runMethod(false,"LoadBitmap",(Object)(cls_rizcheck.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png"))).getObject())),__ref.getField(false, "ba"));Debug.locals.put("result", _result);
 BA.debugLineNum = 96;BA.debugLine="If result = DialogResponse.Positive Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, cls_rizcheck.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 97;BA.debugLine="MCode.SaveUpdate(\"delete From TblCheckDaryafti";
Debug.ShouldStop(1);
cls_rizcheck._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("delete From TblCheckDaryafti where ID="),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"ID" /*RemoteObject*/ ))));
 BA.debugLineNum = 98;BA.debugLine="If item.count>1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"count" /*RemoteObject*/ )),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 99;BA.debugLine="MCode.SaveUpdate(\"Update TblDaryaft set fldMab";
Debug.ShouldStop(4);
cls_rizcheck._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblDaryaft set fldMablaghDaryafti=fldMablaghDaryafti-"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldMablagh" /*RemoteObject*/ ),RemoteObject.createImmutable(" where fldShomareDaryaft="),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldShomareDaryaft" /*RemoteObject*/ ),RemoteObject.createImmutable(" and fldType=2"))));
 BA.debugLineNum = 100;BA.debugLine="CallSubDelayed(Act_SabtRizCheck,\"LoadCheck\")";
Debug.ShouldStop(8);
cls_rizcheck.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((cls_rizcheck._act_sabtrizcheck.getObject())),(Object)(RemoteObject.createImmutable("LoadCheck")));
 }else {
 BA.debugLineNum = 104;BA.debugLine="MCode.SaveUpdate(\"delete From TblDaryaft  wher";
Debug.ShouldStop(128);
cls_rizcheck._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("delete From TblDaryaft  where fldShomareDaryaft="),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldShomareDaryaft" /*RemoteObject*/ ),RemoteObject.createImmutable(" and fldType=2"))));
 BA.debugLineNum = 105;BA.debugLine="CallSubDelayed(Act_SabtRizCheck,\"btn_Back_Clic";
Debug.ShouldStop(256);
cls_rizcheck.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((cls_rizcheck._act_sabtrizcheck.getObject())),(Object)(RemoteObject.createImmutable("btn_Back_Click")));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 110;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
cls_rizcheck.__c.runVoidMethod ("LogImpl","5108068883",BA.ObjectToString(cls_rizcheck.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnprint_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPrint_Click (cls_rizcheck) ","cls_rizcheck",88,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("btnprint_click")) { return __ref.runUserSub(false, "cls_rizcheck","btnprint_click", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Sub btnPrint_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
cls_rizcheck._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_rizcheck._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_rizcheck._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_rizcheck._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private base As Object";
cls_rizcheck._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_rizcheck._base);
 //BA.debugLineNum = 5;BA.debugLine="Private Key As IME";
cls_rizcheck._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_key",cls_rizcheck._key);
 //BA.debugLineNum = 7;BA.debugLine="Private LblDateCheck As Label";
cls_rizcheck._lbldatecheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldatecheck",cls_rizcheck._lbldatecheck);
 //BA.debugLineNum = 8;BA.debugLine="Private LblDateSabt As Label";
cls_rizcheck._lbldatesabt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldatesabt",cls_rizcheck._lbldatesabt);
 //BA.debugLineNum = 9;BA.debugLine="Private LblMablagh As Label";
cls_rizcheck._lblmablagh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablagh",cls_rizcheck._lblmablagh);
 //BA.debugLineNum = 10;BA.debugLine="Private LblNameBank As Label";
cls_rizcheck._lblnamebank = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamebank",cls_rizcheck._lblnamebank);
 //BA.debugLineNum = 11;BA.debugLine="Private LblShomareCheck As Label";
cls_rizcheck._lblshomarecheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarecheck",cls_rizcheck._lblshomarecheck);
 //BA.debugLineNum = 13;BA.debugLine="Dim item As AdapterListCheckDaryafti";
cls_rizcheck._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti");__ref.setField("_item",cls_rizcheck._item);
 //BA.debugLineNum = 14;BA.debugLine="Private LblShomareHesab As Label";
cls_rizcheck._lblshomarehesab = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomarehesab",cls_rizcheck._lblshomarehesab);
 //BA.debugLineNum = 15;BA.debugLine="Private LblShomareDaryaft As Label";
cls_rizcheck._lblshomaredaryaft = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshomaredaryaft",cls_rizcheck._lblshomaredaryaft);
 //BA.debugLineNum = 16;BA.debugLine="Private LblNameSahebcheck As Label";
cls_rizcheck._lblnamesahebcheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamesahebcheck",cls_rizcheck._lblnamesahebcheck);
 //BA.debugLineNum = 17;BA.debugLine="Private LblShobe As Label";
cls_rizcheck._lblshobe = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshobe",cls_rizcheck._lblshobe);
 //BA.debugLineNum = 18;BA.debugLine="Private LblSharh As Label";
cls_rizcheck._lblsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsharh",cls_rizcheck._lblsharh);
 //BA.debugLineNum = 19;BA.debugLine="Dim send As Boolean";
cls_rizcheck._send = RemoteObject.createImmutable(false);__ref.setField("_send",cls_rizcheck._send);
 //BA.debugLineNum = 20;BA.debugLine="Private btnDelete As Label";
cls_rizcheck._btndelete = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndelete",cls_rizcheck._btndelete);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_rizcheck) ","cls_rizcheck",88,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_rizcheck","getheight", __ref);}
 BA.debugLineNum = 72;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(256);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getPanel (cls_rizcheck) ","cls_rizcheck",88,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_rizcheck","getpanel", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 78;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Initialize (cls_rizcheck) ","cls_rizcheck",88,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_rizcheck","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 25;BA.debugLine="base = mdl";
Debug.ShouldStop(16777216);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 26;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_key" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 27;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_rizcheck.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_rizcheck.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 29;BA.debugLine="p.LoadLayout(\"l_rec_rizcheck\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_rec_rizcheck")),__ref.getField(false, "ba"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 34;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(2);
cls_rizcheck._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_rizcheck.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 35;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
cls_rizcheck.__c.runVoidMethod ("LogImpl","5107741196",BA.ObjectToString(cls_rizcheck.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _item1,RemoteObject _issend) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_rizcheck) ","cls_rizcheck",88,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_rizcheck","show", __ref, _item1, _issend);}
Debug.locals.put("Item1", _item1);
Debug.locals.put("issend", _issend);
 BA.debugLineNum = 39;BA.debugLine="Public Sub Show(Item1 As AdapterListCheckDaryafti,";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="item=Item1";
Debug.ShouldStop(128);
__ref.setField ("_item" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 41;BA.debugLine="If Item1.fldDateSarResid <> 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",_item1.getField(true,"fldDateSarResid" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 42;BA.debugLine="LblDateCheck.text = \"تاریخ چک: \" & MCode.Sf.Mid(";
Debug.ShouldStop(512);
__ref.getField(false,"_lbldatecheck" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تاریخ چک: "),cls_rizcheck._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"fldDateSarResid" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),cls_rizcheck._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"fldDateSarResid" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),cls_rizcheck._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"fldDateSarResid" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))))));
 }else {
 BA.debugLineNum = 44;BA.debugLine="LblDateCheck.text = \"تاریخ چک: -\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbldatecheck" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("تاریخ چک: -"));
 };
 BA.debugLineNum = 46;BA.debugLine="LblDateSabt.Text=\"تاریخ ثبت: \" & MCode.Sf.Mid(Ite";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbldatesabt" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تاریخ ثبت: "),cls_rizcheck._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"fldDate" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),cls_rizcheck._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"fldDate" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),cls_rizcheck._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(_item1.getField(true,"fldDate" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 47;BA.debugLine="LblMablagh.Text=\"مبلغ: \" & myCode.AdadToPrice(Ite";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblmablagh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ: "),cls_rizcheck._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_item1.getField(true,"fldMablagh" /*RemoteObject*/ )))))));
 BA.debugLineNum = 48;BA.debugLine="LblShomareHesab.Text=\"شماره حساب: \" & Item1.fldSh";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblshomarehesab" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شماره حساب: "),_item1.getField(true,"fldShomareHesab" /*RemoteObject*/ ))));
 BA.debugLineNum = 49;BA.debugLine="LblShomareDaryaft.Text=\"شماره دریافت: \" & Item1.f";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblshomaredaryaft" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شماره دریافت: "),_item1.getField(true,"fldShomareDaryaft" /*RemoteObject*/ ))));
 BA.debugLineNum = 51;BA.debugLine="If Item1.fldNameBank<>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_item1.getField(true,"fldNameBank" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 52;BA.debugLine="LblNameBank.text = \"نام بانک: \" & Item1.fldNameB";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblnamebank" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نام بانک: "),_item1.getField(true,"fldNameBank" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 54;BA.debugLine="LblNameBank.text = \"نام بانک: -\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblnamebank" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("نام بانک: -"));
 };
 BA.debugLineNum = 57;BA.debugLine="If Item1.FldShomareCheck <> 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",_item1.getField(true,"fldShomareCheck" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 58;BA.debugLine="LblShomareCheck.text = \"شماره چک: \" & Item1.FldS";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblshomarecheck" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شماره چک: "),_item1.getField(true,"fldShomareCheck" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 60;BA.debugLine="LblShomareCheck.text = \"شماره چک: -\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblshomarecheck" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("شماره چک: -"));
 };
 BA.debugLineNum = 62;BA.debugLine="LblShobe.Text=\"شعبه: \"& Item1.fldShobe";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblshobe" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شعبه: "),_item1.getField(true,"fldShobe" /*RemoteObject*/ ))));
 BA.debugLineNum = 64;BA.debugLine="LblNameSahebcheck.Text=\"نام صاحب چک: \"&Item1.fldN";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblnamesahebcheck" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نام صاحب چک: "),_item1.getField(true,"fldNameSahebeCheck" /*RemoteObject*/ ))));
 BA.debugLineNum = 65;BA.debugLine="LblSharh.Text=\"شرح: \"&Item1.fldSharh";
Debug.ShouldStop(1);
__ref.getField(false,"_lblsharh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("شرح: "),_item1.getField(true,"fldSharh" /*RemoteObject*/ ))));
 BA.debugLineNum = 67;BA.debugLine="If issend Then";
Debug.ShouldStop(4);
if (_issend.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 68;BA.debugLine="btnDelete.Enabled=False";
Debug.ShouldStop(8);
__ref.getField(false,"_btndelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_rizcheck.__c.getField(true,"False"));
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
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