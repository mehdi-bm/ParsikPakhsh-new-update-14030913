package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_reportrizebargasht_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_reportrizebargasht) ","act_reportrizebargasht",32,act_reportrizebargasht.mostCurrent.activityBA,act_reportrizebargasht.mostCurrent,39);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_reportrizebargasht.remoteMe.runUserSub(false, "act_reportrizebargasht","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"L_RepRizeBargasht\")";
Debug.ShouldStop(128);
act_reportrizebargasht.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_RepRizeBargasht")),act_reportrizebargasht.mostCurrent.activityBA);
 BA.debugLineNum = 43;BA.debugLine="ListFaktor1.Initialize";
Debug.ShouldStop(1024);
act_reportrizebargasht.mostCurrent._listfaktor1.runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="ListFaktor2.Initialize";
Debug.ShouldStop(2048);
act_reportrizebargasht.mostCurrent._listfaktor2.runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="ListFaktor3.Initialize";
Debug.ShouldStop(4096);
act_reportrizebargasht.mostCurrent._listfaktor3.runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="Table1.Initialize(Me, \"Table1\",6)";
Debug.ShouldStop(8192);
act_reportrizebargasht.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_initialize" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(act_reportrizebargasht.getObject()),(Object)(BA.ObjectToString("Table1")),(Object)(BA.numberCast(int.class, 6)));
 BA.debugLineNum = 47;BA.debugLine="Table1.AddToActivity(pnl_Table1, 0,0,100%x,pnl_Ta";
Debug.ShouldStop(16384);
act_reportrizebargasht.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addtoactivity" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), act_reportrizebargasht.mostCurrent._pnl_table1.getObject()),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_reportrizebargasht.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_reportrizebargasht.mostCurrent.activityBA)),(Object)(act_reportrizebargasht.mostCurrent._pnl_table1.runMethod(true,"getHeight")));
 BA.debugLineNum = 49;BA.debugLine="Table2.Initialize(Me, \"Table2\",6)";
Debug.ShouldStop(65536);
act_reportrizebargasht.mostCurrent._table2.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_initialize" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(act_reportrizebargasht.getObject()),(Object)(BA.ObjectToString("Table2")),(Object)(BA.numberCast(int.class, 6)));
 BA.debugLineNum = 50;BA.debugLine="Table2.AddToActivity(pnl_Table2, 0,0,100%x,pnl_Ta";
Debug.ShouldStop(131072);
act_reportrizebargasht.mostCurrent._table2.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addtoactivity" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), act_reportrizebargasht.mostCurrent._pnl_table2.getObject()),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_reportrizebargasht.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_reportrizebargasht.mostCurrent.activityBA)),(Object)(act_reportrizebargasht.mostCurrent._pnl_table2.runMethod(true,"getHeight")));
 BA.debugLineNum = 53;BA.debugLine="CreatePage";
Debug.ShouldStop(1048576);
_createpage();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_reportrizebargasht) ","act_reportrizebargasht",32,act_reportrizebargasht.mostCurrent.activityBA,act_reportrizebargasht.mostCurrent,304);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_reportrizebargasht.remoteMe.runUserSub(false, "act_reportrizebargasht","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 304;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Resume (act_reportrizebargasht) ","act_reportrizebargasht",32,act_reportrizebargasht.mostCurrent.activityBA,act_reportrizebargasht.mostCurrent,296);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_reportrizebargasht.remoteMe.runUserSub(false, "act_reportrizebargasht","activity_resume");}
 BA.debugLineNum = 296;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("CreatePage (act_reportrizebargasht) ","act_reportrizebargasht",32,act_reportrizebargasht.mostCurrent.activityBA,act_reportrizebargasht.mostCurrent,72);
if (RapidSub.canDelegate("createpage")) { return ir.parsikhesab.pakhsh.act_reportrizebargasht.remoteMe.runUserSub(false, "act_reportrizebargasht","createpage");}
RemoteObject _fldtedadjozforoosh = RemoteObject.createImmutable("");
RemoteObject _fldtedadkolforoosh = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");
RemoteObject _cu2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _j = 0;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _item2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");
RemoteObject _cu3 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 72;BA.debugLine="Sub CreatePage";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 74;BA.debugLine="If shomareForoosh>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_reportrizebargasht._shomareforoosh),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="Dim fldTedadJozForoosh As String=0";
Debug.ShouldStop(1024);
_fldtedadjozforoosh = BA.NumberToString(0);Debug.locals.put("fldTedadJozForoosh", _fldtedadjozforoosh);Debug.locals.put("fldTedadJozForoosh", _fldtedadjozforoosh);
 BA.debugLineNum = 76;BA.debugLine="Dim fldTedadKolForoosh As String=0";
Debug.ShouldStop(2048);
_fldtedadkolforoosh = BA.NumberToString(0);Debug.locals.put("fldTedadKolForoosh", _fldtedadkolforoosh);Debug.locals.put("fldTedadKolForoosh", _fldtedadkolforoosh);
 BA.debugLineNum = 77;BA.debugLine="Dim Item As AdapterListFaktor";
Debug.ShouldStop(4096);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");Debug.locals.put("Item", _item);
 BA.debugLineNum = 78;BA.debugLine="Dim cu2 As Cursor = MCode.Result(\"select * from";
Debug.ShouldStop(8192);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = act_reportrizebargasht.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  TblFaktor where fldShomareForoosh="),act_reportrizebargasht._shomareforoosh,RemoteObject.createImmutable(" and FldDate between "),act_reportrizebargasht._dateaz,RemoteObject.createImmutable(" and "),act_reportrizebargasht._dateta)));Debug.locals.put("cu2", _cu2);Debug.locals.put("cu2", _cu2);
 BA.debugLineNum = 79;BA.debugLine="For j=0 To cu2.RowCount-1";
Debug.ShouldStop(16384);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_cu2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step7 > 0 && _j <= limit7) || (step7 < 0 && _j >= limit7) ;_j = ((int)(0 + _j + step7))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 80;BA.debugLine="cu2.Position=j";
Debug.ShouldStop(32768);
_cu2.runMethod(true,"setPosition",BA.numberCast(int.class, _j));
 BA.debugLineNum = 81;BA.debugLine="Item.fldShomareForoosh=cu2.GetString(\"fldShomar";
Debug.ShouldStop(65536);
_item.setField ("fldShomareForoosh" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))));
 BA.debugLineNum = 82;BA.debugLine="Item.fldC_Ashkhas=cu2.GetString(\"FldC_Tafzili\")";
Debug.ShouldStop(131072);
_item.setField ("fldC_Ashkhas" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Tafzili"))));
 BA.debugLineNum = 83;BA.debugLine="Item.FldAmani=cu2.GetString(\"FldAmani\")";
Debug.ShouldStop(262144);
_item.setField ("FldAmani" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAmani"))));
 BA.debugLineNum = 84;BA.debugLine="Select cu2.GetString(\"FldType\")";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),BA.ObjectToString("Foroosh"),BA.ObjectToString("Marjoee"))) {
case 0: {
 BA.debugLineNum = 86;BA.debugLine="Item.fldShomareFaktor=cu2.GetString(\"FldShoma";
Debug.ShouldStop(2097152);
_item.setField ("fldShomareFaktor" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))));
 BA.debugLineNum = 87;BA.debugLine="Item.fldDate=MCode.PersianDateDash(cu2.GetStr";
Debug.ShouldStop(4194304);
_item.setField ("fldDate" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDate"))))));
 BA.debugLineNum = 88;BA.debugLine="Item.fldTotalFaktor=cu2.GetString(\"FldTotalFa";
Debug.ShouldStop(8388608);
_item.setField ("fldTotalFaktor" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))));
 BA.debugLineNum = 89;BA.debugLine="fldTedadJozForoosh=fldTedadJozForoosh+cu2.Get";
Debug.ShouldStop(16777216);
_fldtedadjozforoosh = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldtedadjozforoosh),BA.numberCast(double.class, _cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))))}, "+",1, 0));Debug.locals.put("fldTedadJozForoosh", _fldtedadjozforoosh);
 BA.debugLineNum = 90;BA.debugLine="fldTedadKolForoosh=fldTedadKolForoosh+cu2.Get";
Debug.ShouldStop(33554432);
_fldtedadkolforoosh = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldtedadkolforoosh),BA.numberCast(double.class, _cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))))}, "+",1, 0));Debug.locals.put("fldTedadKolForoosh", _fldtedadkolforoosh);
 break; }
case 1: {
 BA.debugLineNum = 93;BA.debugLine="Item.FldShomareBargasht=cu2.GetString(\"FldSho";
Debug.ShouldStop(268435456);
_item.setField ("FldShomareBargasht" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))));
 BA.debugLineNum = 94;BA.debugLine="Item.FldDateBargasht=MCode.PersianDateDash(cu";
Debug.ShouldStop(536870912);
_item.setField ("FldDateBargasht" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDate"))))));
 BA.debugLineNum = 95;BA.debugLine="Item.FldMablaghBargasht=MCode.SingleResult(\"S";
Debug.ShouldStop(1073741824);
_item.setField ("FldMablaghBargasht" /*RemoteObject*/ ,BA.ObjectToString(act_reportrizebargasht.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select distinct FldTotalFaktor from TblFaktor where FldType='"),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),RemoteObject.createImmutable("' and FldDate between "),act_reportrizebargasht._dateaz,RemoteObject.createImmutable(" and "),act_reportrizebargasht._dateta,RemoteObject.createImmutable(" and fldShomareForoosh="),act_reportrizebargasht._shomareforoosh)))));
 BA.debugLineNum = 96;BA.debugLine="Item.fldTedadJozMarjoee=MCode.SingleResult(\"S";
Debug.ShouldStop(-2147483648);
_item.setField ("fldTedadJozMarjoee" /*RemoteObject*/ ,BA.ObjectToString(act_reportrizebargasht.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select sum(FldTedadDarSabadJoz) from TblFaktor where FldType='"),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),RemoteObject.createImmutable("' and FldDate between "),act_reportrizebargasht._dateaz,RemoteObject.createImmutable(" and "),act_reportrizebargasht._dateta,RemoteObject.createImmutable("  and fldShomareForoosh="),act_reportrizebargasht._shomareforoosh)))));
 BA.debugLineNum = 97;BA.debugLine="Item.fldTedadCartonMarjoee=MCode.SingleResult";
Debug.ShouldStop(1);
_item.setField ("fldTedadCartonMarjoee" /*RemoteObject*/ ,BA.ObjectToString(act_reportrizebargasht.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select sum(FldTedadDarSabadKol) from TblFaktor where FldType='"),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),RemoteObject.createImmutable("' and FldDate between "),act_reportrizebargasht._dateaz,RemoteObject.createImmutable(" and "),act_reportrizebargasht._dateta,RemoteObject.createImmutable("  and fldShomareForoosh="),act_reportrizebargasht._shomareforoosh)))));
 BA.debugLineNum = 98;BA.debugLine="Item.fldTedadJozMande=fldTedadJozForoosh-Item";
Debug.ShouldStop(2);
_item.setField ("fldTedadJozMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldtedadjozforoosh),BA.numberCast(double.class, _item.getField(true,"fldTedadJozMarjoee" /*RemoteObject*/ ))}, "-",1, 0)));
 BA.debugLineNum = 99;BA.debugLine="Item.fldTedadCartonMande=fldTedadKolForoosh-I";
Debug.ShouldStop(4);
_item.setField ("fldTedadCartonMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldtedadkolforoosh),BA.numberCast(double.class, _item.getField(true,"fldTedadCartonMarjoee" /*RemoteObject*/ ))}, "-",1, 0)));
 BA.debugLineNum = 100;BA.debugLine="Item.fldMablaghMande=Item.fldTotalFaktor-Item";
Debug.ShouldStop(8);
_item.setField ("fldMablaghMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"fldTotalFaktor" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"FldMablaghBargasht" /*RemoteObject*/ ))}, "-",1, 0)));
 break; }
}
;
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 103;BA.debugLine="Item.fldTedadJoz=fldTedadJozForoosh";
Debug.ShouldStop(64);
_item.setField ("fldTedadJoz" /*RemoteObject*/ ,_fldtedadjozforoosh);
 BA.debugLineNum = 104;BA.debugLine="Item.fldTedadCarton=fldTedadKolForoosh";
Debug.ShouldStop(128);
_item.setField ("fldTedadCarton" /*RemoteObject*/ ,_fldtedadkolforoosh);
 BA.debugLineNum = 105;BA.debugLine="LblShomareFaktor.Text = Item.fldShomareFaktor";
Debug.ShouldStop(256);
act_reportrizebargasht.mostCurrent._lblshomarefaktor.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"fldShomareFaktor" /*RemoteObject*/ )));
 BA.debugLineNum = 106;BA.debugLine="LblTotalFaktor.Text = NumberFormat(Item.fldTotal";
Debug.ShouldStop(512);
act_reportrizebargasht.mostCurrent._lbltotalfaktor.runMethod(true,"setText",BA.ObjectToCharSequence(act_reportrizebargasht.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 107;BA.debugLine="LblDate.Text = Item.fldDate";
Debug.ShouldStop(1024);
act_reportrizebargasht.mostCurrent._lbldate.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"fldDate" /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="LblC_Ashkhas.Text = Item.fldC_Ashkhas";
Debug.ShouldStop(2048);
act_reportrizebargasht.mostCurrent._lblc_ashkhas.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"fldC_Ashkhas" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="lblShomareForoosh.Text=Item.fldShomareForoosh";
Debug.ShouldStop(4096);
act_reportrizebargasht.mostCurrent._lblshomareforoosh.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"fldShomareForoosh" /*RemoteObject*/ )));
 BA.debugLineNum = 110;BA.debugLine="lblShomareBargashti.Text=IIf(myCode.Check_Is_Nul";
Debug.ShouldStop(8192);
act_reportrizebargasht.mostCurrent._lblshomarebargashti.runMethod(true,"setText",BA.ObjectToCharSequence(((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_check_is_null" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"FldShomareBargasht" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable(("-"))) : ((_item.getField(true,"FldShomareBargasht" /*RemoteObject*/ ))))));
 BA.debugLineNum = 111;BA.debugLine="lblDateBargashti.Text=IIf(myCode.Check_Is_Null(I";
Debug.ShouldStop(16384);
act_reportrizebargasht.mostCurrent._lbldatebargashti.runMethod(true,"setText",BA.ObjectToCharSequence(((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_check_is_null" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"FldDateBargasht" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable(("-"))) : ((_item.getField(true,"FldDateBargasht" /*RemoteObject*/ ))))));
 BA.debugLineNum = 112;BA.debugLine="lblTedadSefaresh.Text=myCode.ToInt(myCode.Is_Nul";
Debug.ShouldStop(32768);
act_reportrizebargasht.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"fldTedadJoz" /*RemoteObject*/ )))))),RemoteObject.createImmutable("-"),act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"fldTedadCarton" /*RemoteObject*/ )))))))));
 BA.debugLineNum = 113;BA.debugLine="lblTedadBargashti.Text=myCode.ToInt(myCode.Is_Nu";
Debug.ShouldStop(65536);
act_reportrizebargasht.mostCurrent._lbltedadbargashti.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"fldTedadJozMarjoee" /*RemoteObject*/ )))))),RemoteObject.createImmutable("-"),act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"fldTedadCartonMarjoee" /*RemoteObject*/ )))))))));
 BA.debugLineNum = 114;BA.debugLine="lblTedadMande.Text=myCode.ToInt(myCode.Is_Null_a";
Debug.ShouldStop(131072);
act_reportrizebargasht.mostCurrent._lbltedadmande.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"fldTedadJozMande" /*RemoteObject*/ )))))),RemoteObject.createImmutable("-"),act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"fldTedadCartonMande" /*RemoteObject*/ )))))))));
 BA.debugLineNum = 115;BA.debugLine="lblMablaghMande.Text=IIf(myCode.Check_Is_Null(It";
Debug.ShouldStop(262144);
act_reportrizebargasht.mostCurrent._lblmablaghmande.runMethod(true,"setText",BA.ObjectToCharSequence(((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_check_is_null" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"fldMablaghMande" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable((0))) : ((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"fldMablaghMande" /*RemoteObject*/ ))))))));
 BA.debugLineNum = 116;BA.debugLine="lblTotalBargashti.Text=IIf(myCode.Check_Is_Null(";
Debug.ShouldStop(524288);
act_reportrizebargasht.mostCurrent._lbltotalbargashti.runMethod(true,"setText",BA.ObjectToCharSequence(((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_check_is_null" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"FldMablaghBargasht" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable((0))) : ((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item.getField(true,"FldMablaghBargasht" /*RemoteObject*/ ))))))));
 BA.debugLineNum = 117;BA.debugLine="Dim Cu As Cursor= MCode.Result(\"Select fldSharhe";
Debug.ShouldStop(1048576);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_reportrizebargasht.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select fldSharheTafzili From TblAshkhas where FldCodeTafzili = '"),_item.getField(true,"fldC_Ashkhas" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 118;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 119;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(4194304);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 120;BA.debugLine="LblN_Ashkhas.Text = Cu.GetString(\"fldSharheTafz";
Debug.ShouldStop(8388608);
act_reportrizebargasht.mostCurrent._lbln_ashkhas.runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili")))));
 }else {
 BA.debugLineNum = 122;BA.debugLine="LblN_Ashkhas.Text = \"-\"";
Debug.ShouldStop(33554432);
act_reportrizebargasht.mostCurrent._lbln_ashkhas.runMethod(true,"setText",BA.ObjectToCharSequence("-"));
 };
 }else {
 BA.debugLineNum = 126;BA.debugLine="Dim Item2 As AdapterListFaktor";
Debug.ShouldStop(536870912);
_item2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");Debug.locals.put("Item2", _item2);
 BA.debugLineNum = 127;BA.debugLine="Dim cu3 As Cursor = MCode.Result(\"select * from";
Debug.ShouldStop(1073741824);
_cu3 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu3 = act_reportrizebargasht.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  TblFaktor where FldShomareFaktor="),act_reportrizebargasht._shomarefaktor,RemoteObject.createImmutable("  And FldDate between "),act_reportrizebargasht._dateaz,RemoteObject.createImmutable(" And "),act_reportrizebargasht._dateta)));Debug.locals.put("cu3", _cu3);Debug.locals.put("cu3", _cu3);
 BA.debugLineNum = 128;BA.debugLine="If cu3.RowCount>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_cu3.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 129;BA.debugLine="For j=0 To cu3.RowCount-1";
Debug.ShouldStop(1);
{
final int step55 = 1;
final int limit55 = RemoteObject.solve(new RemoteObject[] {_cu3.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step55 > 0 && _j <= limit55) || (step55 < 0 && _j >= limit55) ;_j = ((int)(0 + _j + step55))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 130;BA.debugLine="cu3.Position=j";
Debug.ShouldStop(2);
_cu3.runMethod(true,"setPosition",BA.numberCast(int.class, _j));
 BA.debugLineNum = 131;BA.debugLine="Item2.fldShomareForoosh=cu3.GetString(\"fldSho";
Debug.ShouldStop(4);
_item2.setField ("fldShomareForoosh" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))));
 BA.debugLineNum = 132;BA.debugLine="Item2.fldC_Ashkhas=cu3.GetString(\"FldC_Tafzil";
Debug.ShouldStop(8);
_item2.setField ("fldC_Ashkhas" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Tafzili"))));
 BA.debugLineNum = 133;BA.debugLine="Item2.FldAmani=cu3.GetString(\"FldAmani\")";
Debug.ShouldStop(16);
_item2.setField ("FldAmani" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAmani"))));
 BA.debugLineNum = 134;BA.debugLine="Select cu3.GetString(\"FldType\")";
Debug.ShouldStop(32);
switch (BA.switchObjectToInt(_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),BA.ObjectToString("Foroosh"))) {
case 0: {
 BA.debugLineNum = 136;BA.debugLine="Item2.fldShomareFaktor=cu3.GetString(\"FldSh";
Debug.ShouldStop(128);
_item2.setField ("fldShomareFaktor" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))));
 BA.debugLineNum = 137;BA.debugLine="Item2.fldDate=MCode.PersianDateDash(cu3.Get";
Debug.ShouldStop(256);
_item2.setField ("fldDate" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDate"))))));
 BA.debugLineNum = 138;BA.debugLine="Item2.fldTotalFaktor=cu3.GetString(\"FldTota";
Debug.ShouldStop(512);
_item2.setField ("fldTotalFaktor" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))));
 BA.debugLineNum = 139;BA.debugLine="Item2.fldTedadJoz=cu3.GetString(\"FldTedadDa";
Debug.ShouldStop(1024);
_item2.setField ("fldTedadJoz" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))));
 BA.debugLineNum = 140;BA.debugLine="Item2.fldTedadCarton=cu3.GetString(\"FldTeda";
Debug.ShouldStop(2048);
_item2.setField ("fldTedadCarton" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))));
 break; }
}
;
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 145;BA.debugLine="LblShomareFaktor.Text = Item2.fldShomareFaktor";
Debug.ShouldStop(65536);
act_reportrizebargasht.mostCurrent._lblshomarefaktor.runMethod(true,"setText",BA.ObjectToCharSequence(_item2.getField(true,"fldShomareFaktor" /*RemoteObject*/ )));
 BA.debugLineNum = 146;BA.debugLine="LblTotalFaktor.Text = NumberFormat(Item2.fldTo";
Debug.ShouldStop(131072);
act_reportrizebargasht.mostCurrent._lbltotalfaktor.runMethod(true,"setText",BA.ObjectToCharSequence(act_reportrizebargasht.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item2.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 147;BA.debugLine="LblDate.Text = Item2.fldDate";
Debug.ShouldStop(262144);
act_reportrizebargasht.mostCurrent._lbldate.runMethod(true,"setText",BA.ObjectToCharSequence(_item2.getField(true,"fldDate" /*RemoteObject*/ )));
 BA.debugLineNum = 148;BA.debugLine="LblC_Ashkhas.Text = Item2.fldC_Ashkhas";
Debug.ShouldStop(524288);
act_reportrizebargasht.mostCurrent._lblc_ashkhas.runMethod(true,"setText",BA.ObjectToCharSequence(_item2.getField(true,"fldC_Ashkhas" /*RemoteObject*/ )));
 BA.debugLineNum = 149;BA.debugLine="lblShomareForoosh.Text=Item2.fldShomareForoosh";
Debug.ShouldStop(1048576);
act_reportrizebargasht.mostCurrent._lblshomareforoosh.runMethod(true,"setText",BA.ObjectToCharSequence(_item2.getField(true,"fldShomareForoosh" /*RemoteObject*/ )));
 BA.debugLineNum = 150;BA.debugLine="lblShomareBargashti.Text=0'IIf(myCode.Check_Is";
Debug.ShouldStop(2097152);
act_reportrizebargasht.mostCurrent._lblshomarebargashti.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 151;BA.debugLine="lblDateBargashti.Text=0'IIf(myCode.Check_Is_Nu";
Debug.ShouldStop(4194304);
act_reportrizebargasht.mostCurrent._lbldatebargashti.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 152;BA.debugLine="lblTedadSefaresh.Text=myCode.ToInt(myCode.Is_N";
Debug.ShouldStop(8388608);
act_reportrizebargasht.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item2.getField(true,"fldTedadJoz" /*RemoteObject*/ )))))),RemoteObject.createImmutable("-"),act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_toint" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)((act_reportrizebargasht.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(_item2.getField(true,"fldTedadCarton" /*RemoteObject*/ )))))))));
 BA.debugLineNum = 153;BA.debugLine="lblTedadBargashti.Text=0'myCode.ToInt(myCode.I";
Debug.ShouldStop(16777216);
act_reportrizebargasht.mostCurrent._lbltedadbargashti.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 154;BA.debugLine="lblTedadMande.Text=0'myCode.ToInt(myCode.Is_Nu";
Debug.ShouldStop(33554432);
act_reportrizebargasht.mostCurrent._lbltedadmande.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 155;BA.debugLine="lblMablaghMande.Text=0'IIf(myCode.Check_Is_Nul";
Debug.ShouldStop(67108864);
act_reportrizebargasht.mostCurrent._lblmablaghmande.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 156;BA.debugLine="lblTotalBargashti.Text=0'IIf(myCode.Check_Is_N";
Debug.ShouldStop(134217728);
act_reportrizebargasht.mostCurrent._lbltotalbargashti.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 };
 };
 BA.debugLineNum = 160;BA.debugLine="LoadData";
Debug.ShouldStop(-2147483648);
_loaddata();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e85) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_reportrizebargasht.processBA, e85.toString()); BA.debugLineNum = 162;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
act_reportrizebargasht.mostCurrent.__c.runVoidMethod ("LogImpl","561800538",BA.ObjectToString(act_reportrizebargasht.mostCurrent.__c.runMethod(false,"LastException",act_reportrizebargasht.mostCurrent.activityBA)),0);
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim Table1 As Table";
act_reportrizebargasht.mostCurrent._table1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table");
 //BA.debugLineNum = 16;BA.debugLine="Dim Table2 As Table";
act_reportrizebargasht.mostCurrent._table2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table");
 //BA.debugLineNum = 17;BA.debugLine="Private LblDate As Label";
act_reportrizebargasht.mostCurrent._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private lblDateBargashti As Label";
act_reportrizebargasht.mostCurrent._lbldatebargashti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lblMablaghMande As Label";
act_reportrizebargasht.mostCurrent._lblmablaghmande = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private LblN_Ashkhas As Label";
act_reportrizebargasht.mostCurrent._lbln_ashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lblShomareBargashti As Label";
act_reportrizebargasht.mostCurrent._lblshomarebargashti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LblShomareFaktor As Label";
act_reportrizebargasht.mostCurrent._lblshomarefaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblShomareForoosh As Label";
act_reportrizebargasht.mostCurrent._lblshomareforoosh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblTedadBargashti As Label";
act_reportrizebargasht.mostCurrent._lbltedadbargashti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblTedadMande As Label";
act_reportrizebargasht.mostCurrent._lbltedadmande = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblTedadSefaresh As Label";
act_reportrizebargasht.mostCurrent._lbltedadsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblTotalBargashti As Label";
act_reportrizebargasht.mostCurrent._lbltotalbargashti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private LblTotalFaktor As Label";
act_reportrizebargasht.mostCurrent._lbltotalfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private LblC_Ashkhas As Label";
act_reportrizebargasht.mostCurrent._lblc_ashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ListFaktor1 As List";
act_reportrizebargasht.mostCurrent._listfaktor1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 32;BA.debugLine="Private ListFaktor2 As List";
act_reportrizebargasht.mostCurrent._listfaktor2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 33;BA.debugLine="Private ListFaktor3 As List";
act_reportrizebargasht.mostCurrent._listfaktor3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 34;BA.debugLine="Private LblBack As Button";
act_reportrizebargasht.mostCurrent._lblback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private pnl_Table1 As Panel";
act_reportrizebargasht.mostCurrent._pnl_table1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private pnl_Table2 As Panel";
act_reportrizebargasht.mostCurrent._pnl_table2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _grid1() throws Exception{
try {
		Debug.PushSubsStack("Grid1 (act_reportrizebargasht) ","act_reportrizebargasht",32,act_reportrizebargasht.mostCurrent.activityBA,act_reportrizebargasht.mostCurrent,56);
if (RapidSub.canDelegate("grid1")) { return ir.parsikhesab.pakhsh.act_reportrizebargasht.remoteMe.runUserSub(false, "act_reportrizebargasht","grid1");}
RemoteObject _lst_colnametitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 56;BA.debugLine="Sub Grid1";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim Lst_ColNameTitle As List";
Debug.ShouldStop(16777216);
_lst_colnametitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
 BA.debugLineNum = 58;BA.debugLine="Lst_ColNameTitle.Initialize";
Debug.ShouldStop(33554432);
_lst_colnametitle.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"ردیف\",\"ک";
Debug.ShouldStop(67108864);
_lst_colnametitle.runVoidMethod ("AddAll",(Object)(act_reportrizebargasht.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("ردیف"),BA.ObjectToString("کد کالا"),BA.ObjectToString("نام کالا"),BA.ObjectToString("تعداد جزء"),BA.ObjectToString("تعداد کل"),RemoteObject.createImmutable("نوع فاکتور")})))));
 BA.debugLineNum = 60;BA.debugLine="Table1.LoadSListReportRizeBargasht(ListFaktor1,Ls";
Debug.ShouldStop(134217728);
act_reportrizebargasht.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_loadslistreportrizebargasht" /*RemoteObject*/ ,(Object)(act_reportrizebargasht.mostCurrent._listfaktor1),(Object)(_lst_colnametitle),(Object)(BA.numberCast(int.class, 6)));
 BA.debugLineNum = 61;BA.debugLine="Table1.SetColumnsWidths(Array As Int(70dip,70dip,";
Debug.ShouldStop(268435456);
act_reportrizebargasht.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("int",new int[] {6},new Object[] {act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))})));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grid2() throws Exception{
try {
		Debug.PushSubsStack("Grid2 (act_reportrizebargasht) ","act_reportrizebargasht",32,act_reportrizebargasht.mostCurrent.activityBA,act_reportrizebargasht.mostCurrent,64);
if (RapidSub.canDelegate("grid2")) { return ir.parsikhesab.pakhsh.act_reportrizebargasht.remoteMe.runUserSub(false, "act_reportrizebargasht","grid2");}
RemoteObject _lst_colnametitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 64;BA.debugLine="Sub Grid2";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Dim Lst_ColNameTitle As List";
Debug.ShouldStop(1);
_lst_colnametitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
 BA.debugLineNum = 66;BA.debugLine="Lst_ColNameTitle.Initialize";
Debug.ShouldStop(2);
_lst_colnametitle.runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"ردیف\",\"ک";
Debug.ShouldStop(4);
_lst_colnametitle.runVoidMethod ("AddAll",(Object)(act_reportrizebargasht.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("ردیف"),BA.ObjectToString("کد کالا"),BA.ObjectToString("نام کالا"),BA.ObjectToString("تعداد جزء"),BA.ObjectToString("تعداد کل"),RemoteObject.createImmutable("نوع")})))));
 BA.debugLineNum = 68;BA.debugLine="Table2.LoadSListReportRizeBargashtResult(ListFakt";
Debug.ShouldStop(8);
act_reportrizebargasht.mostCurrent._table2.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_loadslistreportrizebargashtresult" /*RemoteObject*/ ,(Object)(act_reportrizebargasht.mostCurrent._listfaktor3),(Object)(_lst_colnametitle),(Object)(BA.numberCast(int.class, 6)));
 BA.debugLineNum = 69;BA.debugLine="Table2.SetColumnsWidths(Array As Int(70dip,70dip,";
Debug.ShouldStop(16);
act_reportrizebargasht.mostCurrent._table2.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("int",new int[] {6},new Object[] {act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140))),act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))),act_reportrizebargasht.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))})));
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
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (act_reportrizebargasht) ","act_reportrizebargasht",32,act_reportrizebargasht.mostCurrent.activityBA,act_reportrizebargasht.mostCurrent,300);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_reportrizebargasht.remoteMe.runUserSub(false, "act_reportrizebargasht","lblback_click");}
 BA.debugLineNum = 300;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 301;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
act_reportrizebargasht.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddata() throws Exception{
try {
		Debug.PushSubsStack("LoadData (act_reportrizebargasht) ","act_reportrizebargasht",32,act_reportrizebargasht.mostCurrent.activityBA,act_reportrizebargasht.mostCurrent,166);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_reportrizebargasht.remoteMe.runUserSub(false, "act_reportrizebargasht","loaddata");}
RemoteObject _cu2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _j = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor");
RemoteObject _c = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _item2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor");
RemoteObject _itemforoosh = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor");
RemoteObject _tedadjoz = RemoteObject.createImmutable("");
RemoteObject _tedadcarton = RemoteObject.createImmutable("");
RemoteObject _totalfaktor = RemoteObject.createImmutable("");
RemoteObject _itembargasht = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor");
 BA.debugLineNum = 166;BA.debugLine="Public Sub LoadData";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 195;BA.debugLine="ListFaktor1.Clear";
Debug.ShouldStop(4);
act_reportrizebargasht.mostCurrent._listfaktor1.runVoidMethod ("Clear");
 BA.debugLineNum = 196;BA.debugLine="ListFaktor2.Clear";
Debug.ShouldStop(8);
act_reportrizebargasht.mostCurrent._listfaktor2.runVoidMethod ("Clear");
 BA.debugLineNum = 198;BA.debugLine="Dim cu2 As Cursor = MCode.Result(\"select * from";
Debug.ShouldStop(32);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = act_reportrizebargasht.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  TblFaktor where  fldShomareForoosh="),act_reportrizebargasht._shomareforoosh,RemoteObject.createImmutable(" and FldDate between "),act_reportrizebargasht._dateaz,RemoteObject.createImmutable(" and "),act_reportrizebargasht._dateta)));Debug.locals.put("cu2", _cu2);Debug.locals.put("cu2", _cu2);
 BA.debugLineNum = 199;BA.debugLine="For j=0 To cu2.RowCount-1";
Debug.ShouldStop(64);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step5 > 0 && _j <= limit5) || (step5 < 0 && _j >= limit5) ;_j = ((int)(0 + _j + step5))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 200;BA.debugLine="cu2.Position=j";
Debug.ShouldStop(128);
_cu2.runMethod(true,"setPosition",BA.numberCast(int.class, _j));
 BA.debugLineNum = 201;BA.debugLine="Dim Item As AdapterListRizeFaktor";
Debug.ShouldStop(256);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor");Debug.locals.put("Item", _item);
 BA.debugLineNum = 202;BA.debugLine="Item.FldRadif=j+1";
Debug.ShouldStop(512);
_item.setField ("FldRadif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_j),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 203;BA.debugLine="Item.fldShomareFaktor=cu2.GetString(\"FldShomar";
Debug.ShouldStop(1024);
_item.setField ("fldShomareFaktor" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))));
 BA.debugLineNum = 204;BA.debugLine="Item.fldCodeKala=cu2.GetString(\"FldCodeKala\")";
Debug.ShouldStop(2048);
_item.setField ("fldCodeKala" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))));
 BA.debugLineNum = 205;BA.debugLine="Item.fldSharhKala=cu2.GetString(\"FldNamekala\")";
Debug.ShouldStop(4096);
_item.setField ("fldSharhKala" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNamekala"))));
 BA.debugLineNum = 206;BA.debugLine="Item.fldTotalFaktor=cu2.GetString(\"FldTotalFak";
Debug.ShouldStop(8192);
_item.setField ("fldTotalFaktor" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))));
 BA.debugLineNum = 207;BA.debugLine="Item.fldTedadJoz=cu2.GetString(\"FldTedadDarSab";
Debug.ShouldStop(16384);
_item.setField ("fldTedadJoz" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))));
 BA.debugLineNum = 208;BA.debugLine="Item.fldTedadCarton=cu2.GetString(\"FldTedadDar";
Debug.ShouldStop(32768);
_item.setField ("fldTedadCarton" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))));
 BA.debugLineNum = 209;BA.debugLine="Select cu2.GetString(\"FldType\")";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),BA.ObjectToString("Foroosh"),BA.ObjectToString("Marjoee"))) {
case 0: {
 BA.debugLineNum = 211;BA.debugLine="Item.FldType=\"فروش\"";
Debug.ShouldStop(262144);
_item.setField ("FldType" /*RemoteObject*/ ,BA.ObjectToString("فروش"));
 BA.debugLineNum = 212;BA.debugLine="ListFaktor1.Add(Item)";
Debug.ShouldStop(524288);
act_reportrizebargasht.mostCurrent._listfaktor1.runVoidMethod ("Add",(Object)((_item)));
 break; }
case 1: {
 BA.debugLineNum = 214;BA.debugLine="Item.FldType=\"مرجوعی\"";
Debug.ShouldStop(2097152);
_item.setField ("FldType" /*RemoteObject*/ ,BA.ObjectToString("مرجوعی"));
 BA.debugLineNum = 215;BA.debugLine="ListFaktor2.Add(Item)";
Debug.ShouldStop(4194304);
act_reportrizebargasht.mostCurrent._listfaktor2.runVoidMethod ("Add",(Object)((_item)));
 break; }
}
;
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 219;BA.debugLine="ListFaktor3.Clear";
Debug.ShouldStop(67108864);
act_reportrizebargasht.mostCurrent._listfaktor3.runVoidMethod ("Clear");
 BA.debugLineNum = 220;BA.debugLine="Dim c As Int=0";
Debug.ShouldStop(134217728);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 221;BA.debugLine="For i=0 To ListFaktor1.Size-1";
Debug.ShouldStop(268435456);
{
final int step26 = 1;
final int limit26 = RemoteObject.solve(new RemoteObject[] {act_reportrizebargasht.mostCurrent._listfaktor1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26) ;_i = ((int)(0 + _i + step26))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 222;BA.debugLine="Dim Item2 As AdapterListRizeFaktor";
Debug.ShouldStop(536870912);
_item2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor");Debug.locals.put("Item2", _item2);
 BA.debugLineNum = 223;BA.debugLine="Dim ItemForoosh  = ListFaktor1.Get(i) As Adapt";
Debug.ShouldStop(1073741824);
_itemforoosh = (act_reportrizebargasht.mostCurrent._listfaktor1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ItemForoosh", _itemforoosh);Debug.locals.put("ItemForoosh", _itemforoosh);
 BA.debugLineNum = 224;BA.debugLine="Dim TedadJoz As String=0";
Debug.ShouldStop(-2147483648);
_tedadjoz = BA.NumberToString(0);Debug.locals.put("TedadJoz", _tedadjoz);Debug.locals.put("TedadJoz", _tedadjoz);
 BA.debugLineNum = 225;BA.debugLine="Dim TedadCarton As String=0";
Debug.ShouldStop(1);
_tedadcarton = BA.NumberToString(0);Debug.locals.put("TedadCarton", _tedadcarton);Debug.locals.put("TedadCarton", _tedadcarton);
 BA.debugLineNum = 226;BA.debugLine="Dim TotalFaktor As String=0";
Debug.ShouldStop(2);
_totalfaktor = BA.NumberToString(0);Debug.locals.put("TotalFaktor", _totalfaktor);Debug.locals.put("TotalFaktor", _totalfaktor);
 BA.debugLineNum = 227;BA.debugLine="For j=0 To ListFaktor2.Size-1";
Debug.ShouldStop(4);
{
final int step32 = 1;
final int limit32 = RemoteObject.solve(new RemoteObject[] {act_reportrizebargasht.mostCurrent._listfaktor2.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step32 > 0 && _j <= limit32) || (step32 < 0 && _j >= limit32) ;_j = ((int)(0 + _j + step32))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 228;BA.debugLine="Dim  ItemBargasht = ListFaktor2.Get(j) As Adap";
Debug.ShouldStop(8);
_itembargasht = (act_reportrizebargasht.mostCurrent._listfaktor2.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("ItemBargasht", _itembargasht);Debug.locals.put("ItemBargasht", _itembargasht);
 BA.debugLineNum = 229;BA.debugLine="If ItemForoosh.fldCodeKala=ItemBargasht.fldCo";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_itemforoosh.getField(true,"fldCodeKala" /*RemoteObject*/ ),_itembargasht.getField(true,"fldCodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 230;BA.debugLine="TedadJoz=TedadJoz+ItemBargasht.fldTedadJoz";
Debug.ShouldStop(32);
_tedadjoz = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadjoz),BA.numberCast(double.class, _itembargasht.getField(true,"fldTedadJoz" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("TedadJoz", _tedadjoz);
 BA.debugLineNum = 231;BA.debugLine="TedadCarton=TedadCarton+ItemBargasht.fldTedad";
Debug.ShouldStop(64);
_tedadcarton = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadcarton),BA.numberCast(double.class, _itembargasht.getField(true,"fldTedadCarton" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("TedadCarton", _tedadcarton);
 BA.debugLineNum = 232;BA.debugLine="TotalFaktor=TotalFaktor+ItemBargasht.fldTotal";
Debug.ShouldStop(128);
_totalfaktor = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _totalfaktor),BA.numberCast(double.class, _itembargasht.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("TotalFaktor", _totalfaktor);
 };
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 235;BA.debugLine="c=c+1";
Debug.ShouldStop(1024);
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("c", _c);
 BA.debugLineNum = 236;BA.debugLine="Item2.FldRadif=c";
Debug.ShouldStop(2048);
_item2.setField ("FldRadif" /*RemoteObject*/ ,BA.NumberToString(_c));
 BA.debugLineNum = 237;BA.debugLine="Item2.fldCodeKala=ItemForoosh.fldCodeKala";
Debug.ShouldStop(4096);
_item2.setField ("fldCodeKala" /*RemoteObject*/ ,_itemforoosh.getField(true,"fldCodeKala" /*RemoteObject*/ ));
 BA.debugLineNum = 238;BA.debugLine="Item2.fldSharhKala=ItemForoosh.fldSharhKala";
Debug.ShouldStop(8192);
_item2.setField ("fldSharhKala" /*RemoteObject*/ ,_itemforoosh.getField(true,"fldSharhKala" /*RemoteObject*/ ));
 BA.debugLineNum = 239;BA.debugLine="Item2.fldTedadJoz=ItemForoosh.fldTedadJoz-Tedad";
Debug.ShouldStop(16384);
_item2.setField ("fldTedadJoz" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _itemforoosh.getField(true,"fldTedadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, _tedadjoz)}, "-",1, 0)));
 BA.debugLineNum = 240;BA.debugLine="Item2.fldTedadCarton=ItemForoosh.fldTedadCarton";
Debug.ShouldStop(32768);
_item2.setField ("fldTedadCarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _itemforoosh.getField(true,"fldTedadCarton" /*RemoteObject*/ )),BA.numberCast(double.class, _tedadcarton)}, "-",1, 0)));
 BA.debugLineNum = 241;BA.debugLine="Item2.fldTotalFaktor=ItemForoosh.fldTotalFaktor";
Debug.ShouldStop(65536);
_item2.setField ("fldTotalFaktor" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _itemforoosh.getField(true,"fldTotalFaktor" /*RemoteObject*/ )),BA.numberCast(double.class, _totalfaktor)}, "-",1, 0)));
 BA.debugLineNum = 242;BA.debugLine="ListFaktor3.Add(Item2)";
Debug.ShouldStop(131072);
act_reportrizebargasht.mostCurrent._listfaktor3.runVoidMethod ("Add",(Object)((_item2)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 246;BA.debugLine="ListFaktor1.Clear";
Debug.ShouldStop(2097152);
act_reportrizebargasht.mostCurrent._listfaktor1.runVoidMethod ("Clear");
 BA.debugLineNum = 247;BA.debugLine="ListFaktor2.Clear";
Debug.ShouldStop(4194304);
act_reportrizebargasht.mostCurrent._listfaktor2.runVoidMethod ("Clear");
 BA.debugLineNum = 248;BA.debugLine="Dim cu2 As Cursor = MCode.Result(\"select * from";
Debug.ShouldStop(8388608);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = act_reportrizebargasht.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_reportrizebargasht.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  TblFaktor where  fldShomareForoosh="),act_reportrizebargasht._shomareforoosh,RemoteObject.createImmutable(" and FldDate between "),act_reportrizebargasht._dateaz,RemoteObject.createImmutable(" and "),act_reportrizebargasht._dateta)));Debug.locals.put("cu2", _cu2);Debug.locals.put("cu2", _cu2);
 BA.debugLineNum = 249;BA.debugLine="For j=0 To cu2.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step52 = 1;
final int limit52 = RemoteObject.solve(new RemoteObject[] {_cu2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step52 > 0 && _j <= limit52) || (step52 < 0 && _j >= limit52) ;_j = ((int)(0 + _j + step52))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 250;BA.debugLine="cu2.Position=j";
Debug.ShouldStop(33554432);
_cu2.runMethod(true,"setPosition",BA.numberCast(int.class, _j));
 BA.debugLineNum = 251;BA.debugLine="Dim Item As AdapterListRizeFaktor";
Debug.ShouldStop(67108864);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor");Debug.locals.put("Item", _item);
 BA.debugLineNum = 252;BA.debugLine="Item.FldRadif=j+1";
Debug.ShouldStop(134217728);
_item.setField ("FldRadif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_j),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 253;BA.debugLine="Item.fldShomareFaktor=cu2.GetString(\"FldShomar";
Debug.ShouldStop(268435456);
_item.setField ("fldShomareFaktor" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))));
 BA.debugLineNum = 254;BA.debugLine="Item.fldCodeKala=cu2.GetString(\"FldCodeKala\")";
Debug.ShouldStop(536870912);
_item.setField ("fldCodeKala" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))));
 BA.debugLineNum = 255;BA.debugLine="Item.fldSharhKala=cu2.GetString(\"FldNamekala\")";
Debug.ShouldStop(1073741824);
_item.setField ("fldSharhKala" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNamekala"))));
 BA.debugLineNum = 256;BA.debugLine="Item.fldTotalFaktor=cu2.GetString(\"FldTotalFak";
Debug.ShouldStop(-2147483648);
_item.setField ("fldTotalFaktor" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))));
 BA.debugLineNum = 257;BA.debugLine="Item.fldTedadJoz=cu2.GetString(\"FldTedadDarSab";
Debug.ShouldStop(1);
_item.setField ("fldTedadJoz" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))));
 BA.debugLineNum = 258;BA.debugLine="Item.fldTedadCarton=cu2.GetString(\"FldTedadDar";
Debug.ShouldStop(2);
_item.setField ("fldTedadCarton" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))));
 BA.debugLineNum = 259;BA.debugLine="Select cu2.GetString(\"FldType\")";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),BA.ObjectToString("Foroosh"),BA.ObjectToString("Marjoee"))) {
case 0: {
 BA.debugLineNum = 261;BA.debugLine="Item.FldType=\"فروش\"";
Debug.ShouldStop(16);
_item.setField ("FldType" /*RemoteObject*/ ,BA.ObjectToString("فروش"));
 break; }
case 1: {
 BA.debugLineNum = 264;BA.debugLine="Item.FldType=\"مرجوعی\"";
Debug.ShouldStop(128);
_item.setField ("FldType" /*RemoteObject*/ ,BA.ObjectToString("مرجوعی"));
 break; }
}
;
 BA.debugLineNum = 267;BA.debugLine="ListFaktor1.Add(Item)";
Debug.ShouldStop(1024);
act_reportrizebargasht.mostCurrent._listfaktor1.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 270;BA.debugLine="Grid1";
Debug.ShouldStop(8192);
_grid1();
 BA.debugLineNum = 271;BA.debugLine="Grid2";
Debug.ShouldStop(16384);
_grid2();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e73) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_reportrizebargasht.processBA, e73.toString()); BA.debugLineNum = 274;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
act_reportrizebargasht.mostCurrent.__c.runVoidMethod ("LogImpl","561866092",BA.ObjectToString(act_reportrizebargasht.mostCurrent.__c.runMethod(false,"LastException",act_reportrizebargasht.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim shomareForoosh As String";
act_reportrizebargasht._shomareforoosh = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Dim shomareFaktor As String";
act_reportrizebargasht._shomarefaktor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim DateAz,DateTa As String";
act_reportrizebargasht._dateaz = RemoteObject.createImmutable("");
act_reportrizebargasht._dateta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}