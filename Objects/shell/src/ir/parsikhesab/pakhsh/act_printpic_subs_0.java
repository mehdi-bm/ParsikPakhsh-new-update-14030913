package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_printpic_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"L_PrintPic\")";
Debug.ShouldStop(134217728);
act_printpic.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_PrintPic")),act_printpic.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="Printer1.Initialize(Me, \"Printer1\")";
Debug.ShouldStop(536870912);
act_printpic._printer1.runVoidMethod ("_initialize",act_printpic.processBA,(Object)(act_printpic.getObject()),(Object)(RemoteObject.createImmutable("Printer1")));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,93);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 93;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Resume (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","activity_resume");}
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="clv1.Clear";
Debug.ShouldStop(262144);
act_printpic.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 52;BA.debugLine="CreateSign";
Debug.ShouldStop(524288);
_createsign();
 BA.debugLineNum = 53;BA.debugLine="Select TypePrint";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(act_printpic._typeprint,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 55;BA.debugLine="CreateReport";
Debug.ShouldStop(4194304);
_createreport();
 break; }
case 1: {
 BA.debugLineNum = 57;BA.debugLine="CreateReport1";
Debug.ShouldStop(16777216);
_createreport1();
 break; }
}
;
 BA.debugLineNum = 60;BA.debugLine="Select MCode.PrinterType";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(act_printpic.mostCurrent._mcode._printertype /*RemoteObject*/ ,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 break; }
case 1: {
 break; }
}
;
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_back_click() throws Exception{
try {
		Debug.PushSubsStack("btn_Back_Click (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,586);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","btn_back_click");}
 BA.debugLineNum = 586;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 587;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
act_printpic.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 588;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createreport() throws Exception{
try {
		Debug.PushSubsStack("CreateReport (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,292);
if (RapidSub.canDelegate("createreport")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","createreport");}
RemoteObject _rec1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_faktor1_type1");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _datefactor = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _query = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _radif = RemoteObject.createImmutable("");
RemoteObject _codekala = RemoteObject.createImmutable("");
RemoteObject _namekala = RemoteObject.createImmutable("");
RemoteObject _fee = RemoteObject.createImmutable(0);
RemoteObject _takhfifkala = RemoteObject.createImmutable(0);
RemoteObject _takhfifvizhe = RemoteObject.createImmutable(0);
RemoteObject _tedadjoze = RemoteObject.createImmutable("");
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _tedaddarkarton = RemoteObject.createImmutable(0);
RemoteObject _sum = RemoteObject.createImmutable("");
RemoteObject _sumkol = RemoteObject.createImmutable("");
RemoteObject _summablaghkhales = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _sumfactor = RemoteObject.createImmutable("");
RemoteObject _sumpardakht = RemoteObject.createImmutable("");
RemoteObject _sumkhales = RemoteObject.createImmutable("");
RemoteObject _sumkoltakhfif = RemoteObject.createImmutable("");
RemoteObject _tozihat = RemoteObject.createImmutable("");
RemoteObject _vaziatpardakht = RemoteObject.createImmutable("");
RemoteObject _signaturebitmapstring = RemoteObject.createImmutable("");
RemoteObject _sumtakhfifkala = RemoteObject.createImmutable("");
RemoteObject _sumtakhfifvizhe = RemoteObject.createImmutable("");
RemoteObject _summandeazghabl = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _rec2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_faktor2_type1");
RemoteObject _darsadarzeshafzode = RemoteObject.createImmutable("");
RemoteObject _arzeshafzode = RemoteObject.createImmutable("");
RemoteObject _rec3 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_faktor3_type1");
 BA.debugLineNum = 292;BA.debugLine="Sub CreateReport";
Debug.ShouldStop(8);
 BA.debugLineNum = 296;BA.debugLine="Dim rec1 As cls_Faktor1_Type1";
Debug.ShouldStop(128);
_rec1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_faktor1_type1");Debug.locals.put("rec1", _rec1);
 BA.debugLineNum = 297;BA.debugLine="Dim Date As String= MCode.Sf.Mid(MCode.DatePersia";
Debug.ShouldStop(256);
_date = RemoteObject.concat(act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 298;BA.debugLine="Dim DateFactor As String= MCode.Sf.Mid(Faktor.fld";
Debug.ShouldStop(512);
_datefactor = RemoteObject.concat(act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic._faktor.getField(true,"fldDate" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic._faktor.getField(true,"fldDate" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic._faktor.getField(true,"fldDate" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("DateFactor", _datefactor);Debug.locals.put("DateFactor", _datefactor);
 BA.debugLineNum = 299;BA.debugLine="Dim Time As String=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(1024);
_time = act_printpic.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_printpic.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 300;BA.debugLine="rec1.Initialize(MCode.C_Tafzili,Faktor.C_Name,MCo";
Debug.ShouldStop(2048);
_rec1.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor1_type1.class, "_initialize" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(act_printpic.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ),(Object)(act_printpic._faktor.getField(true,"C_Name" /*RemoteObject*/ )),(Object)(act_printpic.mostCurrent._mcode._c_visitor /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._n_visitor /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._appname /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._faktorselect /*RemoteObject*/ ),(Object)(_datefactor),(Object)(_date),(Object)(_time),(Object)(act_printpic.mostCurrent._mcode._tell_tafzili /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._address_tafzili /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._companyname /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._companytell /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._companyaddress /*RemoteObject*/ ));
 BA.debugLineNum = 301;BA.debugLine="clv1.Add(rec1.Panel,0)";
Debug.ShouldStop(4096);
act_printpic.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec1.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor1_type1.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 304;BA.debugLine="Dim Query As String";
Debug.ShouldStop(32768);
_query = RemoteObject.createImmutable("");Debug.locals.put("Query", _query);
 BA.debugLineNum = 305;BA.debugLine="Query = \"SELECT  TblFaktor.FldRadif,TblFaktor.Fld";
Debug.ShouldStop(65536);
_query = RemoteObject.concat(RemoteObject.createImmutable("SELECT  TblFaktor.FldRadif,TblFaktor.FldNamekala,Cast(Round(TblFaktor.FldFeeForoosh,'"),act_printpic.mostCurrent._mcode._raghamashar /*RemoteObject*/ ,RemoteObject.createImmutable("') As Int) As FldFeeForoosh ,TblFaktor.FldTedadDarSabadJoz,TblKala.FldNamevahed,TblFaktor.FldTedadDarSabadKol,TblKala.FldNameVahed2,TblFaktor.FldCodeKala,TblFaktor.FldMablaghMasrafKonande,TblFaktor.FldTozihat FROM TblFaktor,TblKala WHERE TblFaktor.FldCodeKala = TblKala.FldCodeKala And FldShomareFaktor = '"),act_printpic.mostCurrent._mcode._shomarefaktor /*RemoteObject*/ ,RemoteObject.createImmutable("'"));Debug.locals.put("Query", _query);
 BA.debugLineNum = 306;BA.debugLine="Dim Cu As Cursor =MCode.Result(Query)";
Debug.ShouldStop(131072);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_printpic.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(_query));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 307;BA.debugLine="Dim Radif As String";
Debug.ShouldStop(262144);
_radif = RemoteObject.createImmutable("");Debug.locals.put("Radif", _radif);
 BA.debugLineNum = 308;BA.debugLine="Dim CodeKala As String";
Debug.ShouldStop(524288);
_codekala = RemoteObject.createImmutable("");Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 309;BA.debugLine="Dim NameKala As String";
Debug.ShouldStop(1048576);
_namekala = RemoteObject.createImmutable("");Debug.locals.put("NameKala", _namekala);
 BA.debugLineNum = 310;BA.debugLine="Dim Fee As Int";
Debug.ShouldStop(2097152);
_fee = RemoteObject.createImmutable(0);Debug.locals.put("Fee", _fee);
 BA.debugLineNum = 311;BA.debugLine="Dim TakhfifKala As Int";
Debug.ShouldStop(4194304);
_takhfifkala = RemoteObject.createImmutable(0);Debug.locals.put("TakhfifKala", _takhfifkala);
 BA.debugLineNum = 312;BA.debugLine="Dim TakhfifVizhe As Int";
Debug.ShouldStop(8388608);
_takhfifvizhe = RemoteObject.createImmutable(0);Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 BA.debugLineNum = 313;BA.debugLine="Dim TedadJoze As String";
Debug.ShouldStop(16777216);
_tedadjoze = RemoteObject.createImmutable("");Debug.locals.put("TedadJoze", _tedadjoze);
 BA.debugLineNum = 314;BA.debugLine="Dim TedadKol As String";
Debug.ShouldStop(33554432);
_tedadkol = RemoteObject.createImmutable("");Debug.locals.put("TedadKol", _tedadkol);
 BA.debugLineNum = 315;BA.debugLine="Dim TedadDarKarton As Int";
Debug.ShouldStop(67108864);
_tedaddarkarton = RemoteObject.createImmutable(0);Debug.locals.put("TedadDarKarton", _tedaddarkarton);
 BA.debugLineNum = 316;BA.debugLine="Dim Sum As String";
Debug.ShouldStop(134217728);
_sum = RemoteObject.createImmutable("");Debug.locals.put("Sum", _sum);
 BA.debugLineNum = 317;BA.debugLine="Dim SumKol As String=0";
Debug.ShouldStop(268435456);
_sumkol = BA.NumberToString(0);Debug.locals.put("SumKol", _sumkol);Debug.locals.put("SumKol", _sumkol);
 BA.debugLineNum = 318;BA.debugLine="Dim SumMablaghKhales As String=0";
Debug.ShouldStop(536870912);
_summablaghkhales = BA.NumberToString(0);Debug.locals.put("SumMablaghKhales", _summablaghkhales);Debug.locals.put("SumMablaghKhales", _summablaghkhales);
 BA.debugLineNum = 319;BA.debugLine="Dim count As Int=0";
Debug.ShouldStop(1073741824);
_count = BA.numberCast(int.class, 0);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 320;BA.debugLine="Dim sumFactor,sumPardakht,sumKhales,SumKolTakhfif";
Debug.ShouldStop(-2147483648);
_sumfactor = RemoteObject.createImmutable("");Debug.locals.put("sumFactor", _sumfactor);
_sumpardakht = RemoteObject.createImmutable("");Debug.locals.put("sumPardakht", _sumpardakht);
_sumkhales = RemoteObject.createImmutable("");Debug.locals.put("sumKhales", _sumkhales);
_sumkoltakhfif = BA.NumberToString(0);Debug.locals.put("SumKolTakhfif", _sumkoltakhfif);Debug.locals.put("SumKolTakhfif", _sumkoltakhfif);
 BA.debugLineNum = 321;BA.debugLine="Dim Tozihat,VaziatPardakht,SignatureBitmapString";
Debug.ShouldStop(1);
_tozihat = RemoteObject.createImmutable("");Debug.locals.put("Tozihat", _tozihat);
_vaziatpardakht = RemoteObject.createImmutable("");Debug.locals.put("VaziatPardakht", _vaziatpardakht);
_signaturebitmapstring = RemoteObject.createImmutable("");Debug.locals.put("SignatureBitmapString", _signaturebitmapstring);
 BA.debugLineNum = 322;BA.debugLine="Dim sumTakhfifKala As String=0";
Debug.ShouldStop(2);
_sumtakhfifkala = BA.NumberToString(0);Debug.locals.put("sumTakhfifKala", _sumtakhfifkala);Debug.locals.put("sumTakhfifKala", _sumtakhfifkala);
 BA.debugLineNum = 323;BA.debugLine="Dim sumTakhfifVizhe As String=0";
Debug.ShouldStop(4);
_sumtakhfifvizhe = BA.NumberToString(0);Debug.locals.put("sumTakhfifVizhe", _sumtakhfifvizhe);Debug.locals.put("sumTakhfifVizhe", _sumtakhfifvizhe);
 BA.debugLineNum = 324;BA.debugLine="Dim sumMandeAzGhabl As String=0";
Debug.ShouldStop(8);
_summandeazghabl = BA.NumberToString(0);Debug.locals.put("sumMandeAzGhabl", _summandeazghabl);Debug.locals.put("sumMandeAzGhabl", _summandeazghabl);
 BA.debugLineNum = 346;BA.debugLine="For i=0 To listKala.Size-1";
Debug.ShouldStop(33554432);
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {act_printpic._listkala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 347;BA.debugLine="Dim item As AdapterListKala=listKala.Get(i)";
Debug.ShouldStop(67108864);
_item = (act_printpic._listkala.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 348;BA.debugLine="Radif=i+1";
Debug.ShouldStop(134217728);
_radif = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("Radif", _radif);
 BA.debugLineNum = 349;BA.debugLine="CodeKala=item.CodeKala";
Debug.ShouldStop(268435456);
_codekala = _item.getField(true,"CodeKala" /*RemoteObject*/ );Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 350;BA.debugLine="NameKala=item.NameKala";
Debug.ShouldStop(536870912);
_namekala = _item.getField(true,"NameKala" /*RemoteObject*/ );Debug.locals.put("NameKala", _namekala);
 BA.debugLineNum = 351;BA.debugLine="Fee=item.FeeForoosh";
Debug.ShouldStop(1073741824);
_fee = _item.getField(true,"FeeForoosh" /*RemoteObject*/ );Debug.locals.put("Fee", _fee);
 BA.debugLineNum = 367;BA.debugLine="TakhfifKala=myCode.Is_Null_adad(item.TakhfifKala";
Debug.ShouldStop(16384);
_takhfifkala = BA.numberCast(int.class, act_printpic.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(_item.getField(true,"TakhfifKala" /*RemoteObject*/ ))));Debug.locals.put("TakhfifKala", _takhfifkala);
 BA.debugLineNum = 368;BA.debugLine="sumTakhfifKala=sumTakhfifKala+TakhfifKala";
Debug.ShouldStop(32768);
_sumtakhfifkala = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumtakhfifkala),_takhfifkala}, "+",1, 0));Debug.locals.put("sumTakhfifKala", _sumtakhfifkala);
 BA.debugLineNum = 369;BA.debugLine="TakhfifVizhe=myCode.Is_Null_adad(item.MablaghTak";
Debug.ShouldStop(65536);
_takhfifvizhe = BA.numberCast(int.class, act_printpic.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(BA.NumberToString(_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ )))));Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 BA.debugLineNum = 370;BA.debugLine="sumTakhfifVizhe=sumTakhfifVizhe+TakhfifVizhe";
Debug.ShouldStop(131072);
_sumtakhfifvizhe = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumtakhfifvizhe),_takhfifvizhe}, "+",1, 0));Debug.locals.put("sumTakhfifVizhe", _sumtakhfifvizhe);
 BA.debugLineNum = 371;BA.debugLine="Tozihat=item.Tozihat";
Debug.ShouldStop(262144);
_tozihat = _item.getField(true,"Tozihat" /*RemoteObject*/ );Debug.locals.put("Tozihat", _tozihat);
 BA.debugLineNum = 372;BA.debugLine="TedadJoze=item.TedadDarSabadJoz";
Debug.ShouldStop(524288);
_tedadjoze = _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ );Debug.locals.put("TedadJoze", _tedadjoze);
 BA.debugLineNum = 373;BA.debugLine="TedadKol=item.TedadDarSabadKol";
Debug.ShouldStop(1048576);
_tedadkol = _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ );Debug.locals.put("TedadKol", _tedadkol);
 BA.debugLineNum = 374;BA.debugLine="TedadDarKarton=item.TedadDarKarton";
Debug.ShouldStop(2097152);
_tedaddarkarton = BA.numberCast(int.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ));Debug.locals.put("TedadDarKarton", _tedaddarkarton);
 BA.debugLineNum = 375;BA.debugLine="Sum=((TedadKol*TedadDarKarton)+TedadJoze)*Fee";
Debug.ShouldStop(4194304);
_sum = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadkol),_tedaddarkarton}, "*",0, 0)),BA.numberCast(double.class, _tedadjoze)}, "+",1, 0)),_fee}, "*",0, 0));Debug.locals.put("Sum", _sum);
 BA.debugLineNum = 376;BA.debugLine="SumKol=SumKol+Sum";
Debug.ShouldStop(8388608);
_sumkol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumkol),BA.numberCast(double.class, _sum)}, "+",1, 0));Debug.locals.put("SumKol", _sumkol);
 BA.debugLineNum = 377;BA.debugLine="SumMablaghKhales=SumMablaghKhales+Sum-(TakhfifKa";
Debug.ShouldStop(16777216);
_summablaghkhales = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _summablaghkhales),BA.numberCast(double.class, _sum),(RemoteObject.solve(new RemoteObject[] {_takhfifkala,_takhfifvizhe}, "+",1, 1))}, "+-",2, 0));Debug.locals.put("SumMablaghKhales", _summablaghkhales);
 BA.debugLineNum = 381;BA.debugLine="Dim rec2 As cls_Faktor2_Type1";
Debug.ShouldStop(268435456);
_rec2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_faktor2_type1");Debug.locals.put("rec2", _rec2);
 BA.debugLineNum = 383;BA.debugLine="rec2.Initialize(Radif,item.CodeKala,item.NameKal";
Debug.ShouldStop(1073741824);
_rec2.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor2_type1.class, "_initialize" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(_radif),(Object)(_item.getField(true,"CodeKala" /*RemoteObject*/ )),(Object)(_item.getField(true,"NameKala" /*RemoteObject*/ )),(Object)(act_printpic.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(BA.NumberToString(_item.getField(true,"FeeForoosh" /*RemoteObject*/ ))))),(Object)(act_printpic.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(BA.NumberToString(_takhfifkala)))),(Object)(act_printpic.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(BA.NumberToString(_takhfifvizhe)))),(Object)(RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sum)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ )),(Object)(RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _summablaghkhales)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ )),(Object)(_tedadjoze),(Object)(_tedadkol),(Object)(BA.NumberToString(_tedaddarkarton)),(Object)(_tozihat));
 BA.debugLineNum = 384;BA.debugLine="count=i+1";
Debug.ShouldStop(-2147483648);
_count = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 386;BA.debugLine="clv1.Add(rec2.Panel,i)";
Debug.ShouldStop(2);
act_printpic.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec2.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor2_type1.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable((_i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 391;BA.debugLine="Dim DarsadArzeshAfzode As String";
Debug.ShouldStop(64);
_darsadarzeshafzode = RemoteObject.createImmutable("");Debug.locals.put("DarsadArzeshAfzode", _darsadarzeshafzode);
 BA.debugLineNum = 392;BA.debugLine="Dim ArzeshAfzode As String";
Debug.ShouldStop(128);
_arzeshafzode = RemoteObject.createImmutable("");Debug.locals.put("ArzeshAfzode", _arzeshafzode);
 BA.debugLineNum = 402;BA.debugLine="Log(\"تخفیف کالا : \" & sumTakhfifKala)";
Debug.ShouldStop(131072);
act_printpic.mostCurrent.__c.runVoidMethod ("LogImpl","554394990",RemoteObject.concat(RemoteObject.createImmutable("تخفیف کالا : "),_sumtakhfifkala),0);
 BA.debugLineNum = 413;BA.debugLine="Log(\"تخفیف ویژه : \" & sumTakhfifVizhe)";
Debug.ShouldStop(268435456);
act_printpic.mostCurrent.__c.runVoidMethod ("LogImpl","554395001",RemoteObject.concat(RemoteObject.createImmutable("تخفیف ویژه : "),_sumtakhfifvizhe),0);
 BA.debugLineNum = 415;BA.debugLine="SumKolTakhfif=sumTakhfifKala+sumTakhfifVizhe";
Debug.ShouldStop(1073741824);
_sumkoltakhfif = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumtakhfifkala),BA.numberCast(double.class, _sumtakhfifvizhe)}, "+",1, 0));Debug.locals.put("SumKolTakhfif", _sumkoltakhfif);
 BA.debugLineNum = 418;BA.debugLine="sumFactor=NumberFormat2(Faktor.fldMablaghKol,0,0,";
Debug.ShouldStop(2);
_sumfactor = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, act_printpic._faktor.getField(true,"fldMablaghKol" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("sumFactor", _sumfactor);
 BA.debugLineNum = 419;BA.debugLine="sumPardakht=NumberFormat2(Faktor.fldTotalFaktor,0";
Debug.ShouldStop(4);
_sumpardakht = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, act_printpic._faktor.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("sumPardakht", _sumpardakht);
 BA.debugLineNum = 420;BA.debugLine="SumMablaghKhales=NumberFormat2(Faktor.fldTotalFak";
Debug.ShouldStop(8);
_summablaghkhales = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, act_printpic._faktor.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("SumMablaghKhales", _summablaghkhales);
 BA.debugLineNum = 421;BA.debugLine="sumTakhfifKala=NumberFormat2(sumTakhfifKala,0,0,0";
Debug.ShouldStop(16);
_sumtakhfifkala = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sumtakhfifkala)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("sumTakhfifKala", _sumtakhfifkala);
 BA.debugLineNum = 422;BA.debugLine="sumTakhfifVizhe=NumberFormat2(sumTakhfifVizhe,0,0";
Debug.ShouldStop(32);
_sumtakhfifvizhe = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sumtakhfifvizhe)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("sumTakhfifVizhe", _sumtakhfifvizhe);
 BA.debugLineNum = 423;BA.debugLine="SumKolTakhfif=NumberFormat2(SumKolTakhfif,0,0,0,T";
Debug.ShouldStop(64);
_sumkoltakhfif = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sumkoltakhfif)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("SumKolTakhfif", _sumkoltakhfif);
 BA.debugLineNum = 424;BA.debugLine="SumKol=NumberFormat2(SumKol,0,0,0,True)&\" \"&MCode";
Debug.ShouldStop(128);
_sumkol = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sumkol)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("SumKol", _sumkol);
 BA.debugLineNum = 425;BA.debugLine="Tozihat=MCode.Tozihat_faktor";
Debug.ShouldStop(256);
_tozihat = act_printpic.mostCurrent._mcode._tozihat_faktor /*RemoteObject*/ ;Debug.locals.put("Tozihat", _tozihat);
 BA.debugLineNum = 426;BA.debugLine="VaziatPardakht=MCode.NoeTasvieFaktor";
Debug.ShouldStop(512);
_vaziatpardakht = act_printpic.mostCurrent._mcode._noetasviefaktor /*RemoteObject*/ ;Debug.locals.put("VaziatPardakht", _vaziatpardakht);
 BA.debugLineNum = 427;BA.debugLine="DarsadArzeshAfzode =$\"% ${Faktor.fldDarsadArzeshA";
Debug.ShouldStop(1024);
_darsadarzeshafzode = (RemoteObject.concat(RemoteObject.createImmutable("% "),act_printpic.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_printpic._faktor.getField(true,"fldDarsadArzeshAfzode" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("DarsadArzeshAfzode", _darsadarzeshafzode);
 BA.debugLineNum = 428;BA.debugLine="ArzeshAfzode=myCode.AdadToPrice(Faktor.fldArzeshA";
Debug.ShouldStop(2048);
_arzeshafzode = act_printpic.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(act_printpic._faktor.getField(true,"fldArzeshAfzode" /*RemoteObject*/ )));Debug.locals.put("ArzeshAfzode", _arzeshafzode);
 BA.debugLineNum = 429;BA.debugLine="sumMandeAzGhabl=IIf(Faktor.fldSumMandeAzGhabl=0,0";
Debug.ShouldStop(4096);
_summandeazghabl = BA.ObjectToString(((RemoteObject.solveBoolean("=",act_printpic._faktor.getField(true,"fldSumMandeAzGhabl" /*RemoteObject*/ ),BA.NumberToString(0))) ? (RemoteObject.createImmutable((0))) : ((act_printpic.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(act_printpic._faktor.getField(true,"fldSumMandeAzGhabl" /*RemoteObject*/ )))))));Debug.locals.put("sumMandeAzGhabl", _summandeazghabl);
 BA.debugLineNum = 430;BA.debugLine="If SignatureUpdate=\"OK\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",act_printpic.mostCurrent._signatureupdate,BA.ObjectToString("OK"))) { 
 BA.debugLineNum = 431;BA.debugLine="SignatureBitmapString=ImageSignature";
Debug.ShouldStop(16384);
_signaturebitmapstring = act_printpic.mostCurrent._imagesignature;Debug.locals.put("SignatureBitmapString", _signaturebitmapstring);
 }else {
 BA.debugLineNum = 433;BA.debugLine="SignatureBitmapString=Faktor.Signature";
Debug.ShouldStop(65536);
_signaturebitmapstring = act_printpic._faktor.getField(true,"Signature" /*RemoteObject*/ );Debug.locals.put("SignatureBitmapString", _signaturebitmapstring);
 };
 BA.debugLineNum = 436;BA.debugLine="Dim rec3 As cls_Faktor3_Type1";
Debug.ShouldStop(524288);
_rec3 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_faktor3_type1");Debug.locals.put("rec3", _rec3);
 BA.debugLineNum = 437;BA.debugLine="rec3.Initialize(SumKol,sumPardakht,VaziatPardakht";
Debug.ShouldStop(1048576);
_rec3.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor3_type1.class, "_initialize" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(_sumkol),(Object)(_sumpardakht),(Object)(_vaziatpardakht),(Object)(_summablaghkhales),(Object)(_sumtakhfifkala),(Object)(_sumtakhfifvizhe),(Object)(_sumkoltakhfif),(Object)(_tozihat),(Object)(_signaturebitmapstring),(Object)(_darsadarzeshafzode),(Object)(_arzeshafzode),(Object)(_summandeazghabl));
 BA.debugLineNum = 439;BA.debugLine="clv1.Add(rec3.Panel,count+1)";
Debug.ShouldStop(4194304);
act_printpic.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec3.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor3_type1.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 441;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createreport1() throws Exception{
try {
		Debug.PushSubsStack("CreateReport1 (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,443);
if (RapidSub.canDelegate("createreport1")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","createreport1");}
RemoteObject _rec1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_factor1_type2");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _datefactor = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _query = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _radif = RemoteObject.createImmutable("");
RemoteObject _codekala = RemoteObject.createImmutable("");
RemoteObject _namekala = RemoteObject.createImmutable("");
RemoteObject _fee = RemoteObject.createImmutable(0);
RemoteObject _takhfifkala = RemoteObject.createImmutable(0);
RemoteObject _takhfifvizhe = RemoteObject.createImmutable(0);
RemoteObject _tedadjoze = RemoteObject.createImmutable("");
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _tedaddarkarton = RemoteObject.createImmutable(0);
RemoteObject _sum = RemoteObject.createImmutable("");
RemoteObject _sumkol = RemoteObject.createImmutable("");
RemoteObject _summablaghkhales = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _sumfactor = RemoteObject.createImmutable("");
RemoteObject _sumpardakht = RemoteObject.createImmutable("");
RemoteObject _sumkhales = RemoteObject.createImmutable("");
RemoteObject _sumkoltakhfif = RemoteObject.createImmutable("");
RemoteObject _tozihat = RemoteObject.createImmutable("");
RemoteObject _vaziatpardakht = RemoteObject.createImmutable("");
RemoteObject _signaturebitmapstring = RemoteObject.createImmutable("");
RemoteObject _sumtakhfifkala = RemoteObject.createImmutable("");
RemoteObject _sumtakhfifvizhe = RemoteObject.createImmutable("");
RemoteObject _summandeazghabl = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _rec2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_factor2_type2");
RemoteObject _rec3 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_factor3_type2");
 BA.debugLineNum = 443;BA.debugLine="Sub CreateReport1";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 447;BA.debugLine="Dim rec1 As cls_Factor1_Type2";
Debug.ShouldStop(1073741824);
_rec1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_factor1_type2");Debug.locals.put("rec1", _rec1);
 BA.debugLineNum = 448;BA.debugLine="Dim Date As String= MCode.Sf.Mid(MCode.DatePersia";
Debug.ShouldStop(-2147483648);
_date = RemoteObject.concat(act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 449;BA.debugLine="Dim DateFactor As String= MCode.Sf.Mid(Faktor.fld";
Debug.ShouldStop(1);
_datefactor = RemoteObject.concat(act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic._faktor.getField(true,"fldDate" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic._faktor.getField(true,"fldDate" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),act_printpic.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic._faktor.getField(true,"fldDate" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("DateFactor", _datefactor);Debug.locals.put("DateFactor", _datefactor);
 BA.debugLineNum = 450;BA.debugLine="Dim Time As String=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(2);
_time = act_printpic.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_printpic.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 451;BA.debugLine="rec1.Initialize(MCode.C_Tafzili,Faktor.C_Name,MCo";
Debug.ShouldStop(4);
_rec1.runClassMethod (ir.parsikhesab.pakhsh.cls_factor1_type2.class, "_initialize" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(act_printpic.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ),(Object)(act_printpic._faktor.getField(true,"C_Name" /*RemoteObject*/ )),(Object)(act_printpic.mostCurrent._mcode._c_visitor /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._n_visitor /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._appname /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._faktorselect /*RemoteObject*/ ),(Object)(_datefactor),(Object)(_date),(Object)(_time),(Object)(act_printpic.mostCurrent._mcode._tell_tafzili /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._address_tafzili /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._companyname /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._companytell /*RemoteObject*/ ),(Object)(act_printpic.mostCurrent._mcode._companyaddress /*RemoteObject*/ ));
 BA.debugLineNum = 452;BA.debugLine="clv1.Add(rec1.Panel,0)";
Debug.ShouldStop(8);
act_printpic.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec1.runClassMethod (ir.parsikhesab.pakhsh.cls_factor1_type2.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 455;BA.debugLine="Dim Query As String";
Debug.ShouldStop(64);
_query = RemoteObject.createImmutable("");Debug.locals.put("Query", _query);
 BA.debugLineNum = 456;BA.debugLine="Query = \"SELECT  TblFaktor.FldRadif,TblFaktor.Fld";
Debug.ShouldStop(128);
_query = RemoteObject.concat(RemoteObject.createImmutable("SELECT  TblFaktor.FldRadif,TblFaktor.FldNamekala,Cast(Round(TblFaktor.FldFeeForoosh,'"),act_printpic.mostCurrent._mcode._raghamashar /*RemoteObject*/ ,RemoteObject.createImmutable("') As Int) As FldFeeForoosh ,TblFaktor.FldTedadDarSabadJoz,TblKala.FldNamevahed,TblFaktor.FldTedadDarSabadKol,TblKala.FldNameVahed2,TblFaktor.FldCodeKala,TblFaktor.FldMablaghMasrafKonande,TblFaktor.FldTozihat FROM TblFaktor,TblKala WHERE TblFaktor.FldCodeKala = TblKala.FldCodeKala And FldShomareFaktor = '"),act_printpic.mostCurrent._mcode._shomarefaktor /*RemoteObject*/ ,RemoteObject.createImmutable("'"));Debug.locals.put("Query", _query);
 BA.debugLineNum = 457;BA.debugLine="Dim Cu As Cursor =MCode.Result(Query)";
Debug.ShouldStop(256);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_printpic.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(_query));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 458;BA.debugLine="Dim Radif As String";
Debug.ShouldStop(512);
_radif = RemoteObject.createImmutable("");Debug.locals.put("Radif", _radif);
 BA.debugLineNum = 459;BA.debugLine="Dim CodeKala As String";
Debug.ShouldStop(1024);
_codekala = RemoteObject.createImmutable("");Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 460;BA.debugLine="Dim NameKala As String";
Debug.ShouldStop(2048);
_namekala = RemoteObject.createImmutable("");Debug.locals.put("NameKala", _namekala);
 BA.debugLineNum = 461;BA.debugLine="Dim Fee As Int";
Debug.ShouldStop(4096);
_fee = RemoteObject.createImmutable(0);Debug.locals.put("Fee", _fee);
 BA.debugLineNum = 462;BA.debugLine="Dim TakhfifKala As Int";
Debug.ShouldStop(8192);
_takhfifkala = RemoteObject.createImmutable(0);Debug.locals.put("TakhfifKala", _takhfifkala);
 BA.debugLineNum = 463;BA.debugLine="Dim TakhfifVizhe As Int";
Debug.ShouldStop(16384);
_takhfifvizhe = RemoteObject.createImmutable(0);Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 BA.debugLineNum = 464;BA.debugLine="Dim TedadJoze As String";
Debug.ShouldStop(32768);
_tedadjoze = RemoteObject.createImmutable("");Debug.locals.put("TedadJoze", _tedadjoze);
 BA.debugLineNum = 465;BA.debugLine="Dim TedadKol As String";
Debug.ShouldStop(65536);
_tedadkol = RemoteObject.createImmutable("");Debug.locals.put("TedadKol", _tedadkol);
 BA.debugLineNum = 466;BA.debugLine="Dim TedadDarKarton As Int";
Debug.ShouldStop(131072);
_tedaddarkarton = RemoteObject.createImmutable(0);Debug.locals.put("TedadDarKarton", _tedaddarkarton);
 BA.debugLineNum = 467;BA.debugLine="Dim Sum As String";
Debug.ShouldStop(262144);
_sum = RemoteObject.createImmutable("");Debug.locals.put("Sum", _sum);
 BA.debugLineNum = 468;BA.debugLine="Dim SumKol As String=0";
Debug.ShouldStop(524288);
_sumkol = BA.NumberToString(0);Debug.locals.put("SumKol", _sumkol);Debug.locals.put("SumKol", _sumkol);
 BA.debugLineNum = 469;BA.debugLine="Dim SumMablaghKhales As String=0";
Debug.ShouldStop(1048576);
_summablaghkhales = BA.NumberToString(0);Debug.locals.put("SumMablaghKhales", _summablaghkhales);Debug.locals.put("SumMablaghKhales", _summablaghkhales);
 BA.debugLineNum = 470;BA.debugLine="Dim count As Int=0";
Debug.ShouldStop(2097152);
_count = BA.numberCast(int.class, 0);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 471;BA.debugLine="Dim sumFactor,sumPardakht,sumKhales,SumKolTakhfif";
Debug.ShouldStop(4194304);
_sumfactor = RemoteObject.createImmutable("");Debug.locals.put("sumFactor", _sumfactor);
_sumpardakht = RemoteObject.createImmutable("");Debug.locals.put("sumPardakht", _sumpardakht);
_sumkhales = RemoteObject.createImmutable("");Debug.locals.put("sumKhales", _sumkhales);
_sumkoltakhfif = BA.NumberToString(0);Debug.locals.put("SumKolTakhfif", _sumkoltakhfif);Debug.locals.put("SumKolTakhfif", _sumkoltakhfif);
 BA.debugLineNum = 472;BA.debugLine="Dim Tozihat,VaziatPardakht,SignatureBitmapString";
Debug.ShouldStop(8388608);
_tozihat = RemoteObject.createImmutable("");Debug.locals.put("Tozihat", _tozihat);
_vaziatpardakht = RemoteObject.createImmutable("");Debug.locals.put("VaziatPardakht", _vaziatpardakht);
_signaturebitmapstring = RemoteObject.createImmutable("");Debug.locals.put("SignatureBitmapString", _signaturebitmapstring);
 BA.debugLineNum = 473;BA.debugLine="Dim sumTakhfifKala As String=0";
Debug.ShouldStop(16777216);
_sumtakhfifkala = BA.NumberToString(0);Debug.locals.put("sumTakhfifKala", _sumtakhfifkala);Debug.locals.put("sumTakhfifKala", _sumtakhfifkala);
 BA.debugLineNum = 474;BA.debugLine="Dim sumTakhfifVizhe As String=0";
Debug.ShouldStop(33554432);
_sumtakhfifvizhe = BA.NumberToString(0);Debug.locals.put("sumTakhfifVizhe", _sumtakhfifvizhe);Debug.locals.put("sumTakhfifVizhe", _sumtakhfifvizhe);
 BA.debugLineNum = 475;BA.debugLine="Dim sumMandeAzGhabl As String=0";
Debug.ShouldStop(67108864);
_summandeazghabl = BA.NumberToString(0);Debug.locals.put("sumMandeAzGhabl", _summandeazghabl);Debug.locals.put("sumMandeAzGhabl", _summandeazghabl);
 BA.debugLineNum = 497;BA.debugLine="For i=0 To listKala.Size-1";
Debug.ShouldStop(65536);
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {act_printpic._listkala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 498;BA.debugLine="Dim item As AdapterListKala=listKala.Get(i)";
Debug.ShouldStop(131072);
_item = (act_printpic._listkala.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 499;BA.debugLine="Radif=i+1";
Debug.ShouldStop(262144);
_radif = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("Radif", _radif);
 BA.debugLineNum = 500;BA.debugLine="CodeKala=item.CodeKala";
Debug.ShouldStop(524288);
_codekala = _item.getField(true,"CodeKala" /*RemoteObject*/ );Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 501;BA.debugLine="NameKala=item.NameKala";
Debug.ShouldStop(1048576);
_namekala = _item.getField(true,"NameKala" /*RemoteObject*/ );Debug.locals.put("NameKala", _namekala);
 BA.debugLineNum = 502;BA.debugLine="Fee=item.FeeForoosh";
Debug.ShouldStop(2097152);
_fee = _item.getField(true,"FeeForoosh" /*RemoteObject*/ );Debug.locals.put("Fee", _fee);
 BA.debugLineNum = 504;BA.debugLine="If item.MablaghTakhfif=0 And item.fldFeeBadAzTak";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 505;BA.debugLine="TakhfifKala=(item.FeeForoosh-item.fldFeeBadAzTa";
Debug.ShouldStop(16777216);
_takhfifkala = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))}, "-",1, 0)),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "+",1, 0))}, "*",0, 0));Debug.locals.put("TakhfifKala", _takhfifkala);
 BA.debugLineNum = 506;BA.debugLine="sumTakhfifKala=sumTakhfifKala+TakhfifKala";
Debug.ShouldStop(33554432);
_sumtakhfifkala = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumtakhfifkala),_takhfifkala}, "+",1, 0));Debug.locals.put("sumTakhfifKala", _sumtakhfifkala);
 }else {
 BA.debugLineNum = 508;BA.debugLine="TakhfifKala=0";
Debug.ShouldStop(134217728);
_takhfifkala = BA.numberCast(int.class, 0);Debug.locals.put("TakhfifKala", _takhfifkala);
 };
 BA.debugLineNum = 512;BA.debugLine="If item.MablaghTakhfif>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 513;BA.debugLine="TakhfifVizhe=(item.MablaghTakhfif)";
Debug.ShouldStop(1);
_takhfifvizhe = (_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ));Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 BA.debugLineNum = 514;BA.debugLine="sumTakhfifVizhe=sumTakhfifVizhe+TakhfifVizhe";
Debug.ShouldStop(2);
_sumtakhfifvizhe = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumtakhfifvizhe),_takhfifvizhe}, "+",1, 0));Debug.locals.put("sumTakhfifVizhe", _sumtakhfifvizhe);
 }else {
 BA.debugLineNum = 516;BA.debugLine="TakhfifVizhe=0";
Debug.ShouldStop(8);
_takhfifvizhe = BA.numberCast(int.class, 0);Debug.locals.put("TakhfifVizhe", _takhfifvizhe);
 };
 BA.debugLineNum = 518;BA.debugLine="Tozihat=item.Tozihat";
Debug.ShouldStop(32);
_tozihat = _item.getField(true,"Tozihat" /*RemoteObject*/ );Debug.locals.put("Tozihat", _tozihat);
 BA.debugLineNum = 519;BA.debugLine="TedadJoze=item.TedadDarSabadJoz";
Debug.ShouldStop(64);
_tedadjoze = _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ );Debug.locals.put("TedadJoze", _tedadjoze);
 BA.debugLineNum = 520;BA.debugLine="TedadKol=item.TedadDarSabadKol";
Debug.ShouldStop(128);
_tedadkol = _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ );Debug.locals.put("TedadKol", _tedadkol);
 BA.debugLineNum = 521;BA.debugLine="TedadDarKarton=item.TedadDarKarton";
Debug.ShouldStop(256);
_tedaddarkarton = BA.numberCast(int.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ));Debug.locals.put("TedadDarKarton", _tedaddarkarton);
 BA.debugLineNum = 522;BA.debugLine="Sum=((TedadKol*TedadDarKarton)+TedadJoze)*Fee";
Debug.ShouldStop(512);
_sum = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadkol),_tedaddarkarton}, "*",0, 0)),BA.numberCast(double.class, _tedadjoze)}, "+",1, 0)),_fee}, "*",0, 0));Debug.locals.put("Sum", _sum);
 BA.debugLineNum = 523;BA.debugLine="SumKol=SumKol+Sum";
Debug.ShouldStop(1024);
_sumkol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumkol),BA.numberCast(double.class, _sum)}, "+",1, 0));Debug.locals.put("SumKol", _sumkol);
 BA.debugLineNum = 524;BA.debugLine="SumMablaghKhales=SumMablaghKhales+Sum-TakhfifKal";
Debug.ShouldStop(2048);
_summablaghkhales = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _summablaghkhales),BA.numberCast(double.class, _sum),_takhfifkala,_takhfifvizhe}, "+--",3, 0));Debug.locals.put("SumMablaghKhales", _summablaghkhales);
 BA.debugLineNum = 528;BA.debugLine="Dim rec2 As cls_Factor2_Type2";
Debug.ShouldStop(32768);
_rec2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_factor2_type2");Debug.locals.put("rec2", _rec2);
 BA.debugLineNum = 529;BA.debugLine="rec2.Initialize(Radif,CodeKala,NameKala,NumberFo";
Debug.ShouldStop(65536);
_rec2.runClassMethod (ir.parsikhesab.pakhsh.cls_factor2_type2.class, "_initialize" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(_radif),(Object)(_codekala),(Object)(_namekala),(Object)(RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _fee)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ )),(Object)(RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _takhfifkala)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ )),(Object)(RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _takhfifvizhe)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ )),(Object)(RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sum)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ )),(Object)(RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _summablaghkhales)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ )),(Object)(_tedadjoze),(Object)(_tedadkol),(Object)(BA.NumberToString(_tedaddarkarton)),(Object)(_tozihat));
 BA.debugLineNum = 530;BA.debugLine="count=i+1";
Debug.ShouldStop(131072);
_count = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 532;BA.debugLine="clv1.Add(rec2.Panel,i)";
Debug.ShouldStop(524288);
act_printpic.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec2.runClassMethod (ir.parsikhesab.pakhsh.cls_factor2_type2.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable((_i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 547;BA.debugLine="Log(\"تخفیف کالا : \" & sumTakhfifKala)";
Debug.ShouldStop(4);
act_printpic.mostCurrent.__c.runVoidMethod ("LogImpl","554460520",RemoteObject.concat(RemoteObject.createImmutable("تخفیف کالا : "),_sumtakhfifkala),0);
 BA.debugLineNum = 558;BA.debugLine="Log(\"تخفیف ویژه : \" & sumTakhfifVizhe)";
Debug.ShouldStop(8192);
act_printpic.mostCurrent.__c.runVoidMethod ("LogImpl","554460531",RemoteObject.concat(RemoteObject.createImmutable("تخفیف ویژه : "),_sumtakhfifvizhe),0);
 BA.debugLineNum = 560;BA.debugLine="SumKolTakhfif=sumTakhfifKala+sumTakhfifVizhe";
Debug.ShouldStop(32768);
_sumkoltakhfif = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumtakhfifkala),BA.numberCast(double.class, _sumtakhfifvizhe)}, "+",1, 0));Debug.locals.put("SumKolTakhfif", _sumkoltakhfif);
 BA.debugLineNum = 563;BA.debugLine="sumFactor=NumberFormat2(Faktor.fldMablaghKol,0,0,";
Debug.ShouldStop(262144);
_sumfactor = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, act_printpic._faktor.getField(true,"fldMablaghKol" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("sumFactor", _sumfactor);
 BA.debugLineNum = 564;BA.debugLine="sumPardakht=NumberFormat2(Faktor.fldTotalFaktor,0";
Debug.ShouldStop(524288);
_sumpardakht = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, act_printpic._faktor.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("sumPardakht", _sumpardakht);
 BA.debugLineNum = 565;BA.debugLine="SumMablaghKhales=NumberFormat2(Faktor.fldTotalFak";
Debug.ShouldStop(1048576);
_summablaghkhales = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, act_printpic._faktor.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("SumMablaghKhales", _summablaghkhales);
 BA.debugLineNum = 566;BA.debugLine="sumTakhfifKala=NumberFormat2(sumTakhfifKala,0,0,0";
Debug.ShouldStop(2097152);
_sumtakhfifkala = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sumtakhfifkala)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("sumTakhfifKala", _sumtakhfifkala);
 BA.debugLineNum = 567;BA.debugLine="sumTakhfifVizhe=NumberFormat2(sumTakhfifVizhe,0,0";
Debug.ShouldStop(4194304);
_sumtakhfifvizhe = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sumtakhfifvizhe)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("sumTakhfifVizhe", _sumtakhfifvizhe);
 BA.debugLineNum = 568;BA.debugLine="SumKolTakhfif=NumberFormat2(SumKolTakhfif,0,0,0,T";
Debug.ShouldStop(8388608);
_sumkoltakhfif = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sumkoltakhfif)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("SumKolTakhfif", _sumkoltakhfif);
 BA.debugLineNum = 569;BA.debugLine="SumKol=NumberFormat2(SumKol,0,0,0,True)&\" \"&MCode";
Debug.ShouldStop(16777216);
_sumkol = RemoteObject.concat(act_printpic.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sumkol)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_printpic.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_printpic.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("SumKol", _sumkol);
 BA.debugLineNum = 571;BA.debugLine="Tozihat=MCode.Tozihat_faktor";
Debug.ShouldStop(67108864);
_tozihat = act_printpic.mostCurrent._mcode._tozihat_faktor /*RemoteObject*/ ;Debug.locals.put("Tozihat", _tozihat);
 BA.debugLineNum = 572;BA.debugLine="VaziatPardakht=MCode.NoeTasvieFaktor";
Debug.ShouldStop(134217728);
_vaziatpardakht = act_printpic.mostCurrent._mcode._noetasviefaktor /*RemoteObject*/ ;Debug.locals.put("VaziatPardakht", _vaziatpardakht);
 BA.debugLineNum = 573;BA.debugLine="If SignatureUpdate=\"OK\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_printpic.mostCurrent._signatureupdate,BA.ObjectToString("OK"))) { 
 BA.debugLineNum = 574;BA.debugLine="SignatureBitmapString=ImageSignature";
Debug.ShouldStop(536870912);
_signaturebitmapstring = act_printpic.mostCurrent._imagesignature;Debug.locals.put("SignatureBitmapString", _signaturebitmapstring);
 }else {
 BA.debugLineNum = 576;BA.debugLine="SignatureBitmapString=Faktor.Signature";
Debug.ShouldStop(-2147483648);
_signaturebitmapstring = act_printpic._faktor.getField(true,"Signature" /*RemoteObject*/ );Debug.locals.put("SignatureBitmapString", _signaturebitmapstring);
 };
 BA.debugLineNum = 578;BA.debugLine="Dim rec3 As cls_Factor3_Type2";
Debug.ShouldStop(2);
_rec3 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_factor3_type2");Debug.locals.put("rec3", _rec3);
 BA.debugLineNum = 579;BA.debugLine="rec3.Initialize(SumKol,sumPardakht,VaziatPardakht";
Debug.ShouldStop(4);
_rec3.runClassMethod (ir.parsikhesab.pakhsh.cls_factor3_type2.class, "_initialize" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(_sumkol),(Object)(_sumpardakht),(Object)(_vaziatpardakht),(Object)(_summablaghkhales),(Object)(_sumtakhfifkala),(Object)(_sumtakhfifvizhe),(Object)(_sumkoltakhfif),(Object)(_tozihat),(Object)(_signaturebitmapstring));
 BA.debugLineNum = 581;BA.debugLine="clv1.Add(rec3.Panel,count+1)";
Debug.ShouldStop(16);
act_printpic.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec3.runClassMethod (ir.parsikhesab.pakhsh.cls_factor3_type2.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 583;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsign() throws Exception{
try {
		Debug.PushSubsStack("CreateSign (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,37);
if (RapidSub.canDelegate("createsign")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","createsign");}
RemoteObject _dates = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _query = RemoteObject.createImmutable("");
 BA.debugLineNum = 37;BA.debugLine="Sub CreateSign";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="If File.Exists(File.DirDefaultExternal & \"/Parsik";
Debug.ShouldStop(32);
if (act_printpic.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(act_printpic.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Signature"))),(Object)(RemoteObject.concat(act_printpic.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(".png")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 39;BA.debugLine="SignatureUpdate=\"OK\"";
Debug.ShouldStop(64);
act_printpic.mostCurrent._signatureupdate = BA.ObjectToString("OK");
 BA.debugLineNum = 40;BA.debugLine="Dim DateS As String =MCode.DatePersian";
Debug.ShouldStop(128);
_dates = act_printpic.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA);Debug.locals.put("DateS", _dates);Debug.locals.put("DateS", _dates);
 BA.debugLineNum = 41;BA.debugLine="Dim Time As String =DateTime.Time(DateTime.Now)";
Debug.ShouldStop(256);
_time = act_printpic.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_printpic.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 42;BA.debugLine="ImageSignature =MCode.Encrypted(MCode.ConvertBlo";
Debug.ShouldStop(512);
act_printpic.mostCurrent._imagesignature = act_printpic.mostCurrent._mcode.runMethod(true,"_encrypted" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(act_printpic.mostCurrent._mcode.runMethod(true,"_convertblobtostring" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(RemoteObject.concat(act_printpic.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Signature"))),(Object)(RemoteObject.concat(act_printpic.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(".png"))))));
 BA.debugLineNum = 43;BA.debugLine="Dim query As String=\"Update TblFaktor Set FldSig";
Debug.ShouldStop(1024);
_query = RemoteObject.concat(RemoteObject.createImmutable("Update TblFaktor Set FldSignatureBitmapString='"),act_printpic.mostCurrent._imagesignature,RemoteObject.createImmutable("' where FldShomareFaktor="),act_printpic._faktor.getField(true,"fldShomareFaktor" /*RemoteObject*/ ));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 44;BA.debugLine="MCode.SaveUpdate(query)";
Debug.ShouldStop(2048);
act_printpic.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_printpic.mostCurrent.activityBA,(Object)(_query));
 BA.debugLineNum = 46;BA.debugLine="File.Delete(File.DirDefaultExternal & \"/Parsik/S";
Debug.ShouldStop(8192);
act_printpic.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(RemoteObject.concat(act_printpic.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Signature"))),(Object)(RemoteObject.concat(act_printpic.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(".png"))));
 };
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crop_image(RemoteObject _v,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Crop_Image (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,271);
if (RapidSub.canDelegate("crop_image")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","crop_image", _v, _left, _top, _width, _height);}
Debug.locals.put("V", _v);
Debug.locals.put("left", _left);
Debug.locals.put("top", _top);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 271;BA.debugLine="Sub Crop_Image(V As B4XView, left As Int, top As I";
Debug.ShouldStop(16384);
 BA.debugLineNum = 273;BA.debugLine="Return V.Snapshot.Crop(left, top, width, height)";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _v.runMethod(false,"Snapshot").runMethod(false,"Crop",(Object)(_left),(Object)(_top),(Object)(_width),(Object)(_height)).getObject());
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getba() throws Exception{
try {
		Debug.PushSubsStack("GetBA (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,285);
if (RapidSub.canDelegate("getba")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","getba");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cls = RemoteObject.createImmutable("");
 BA.debugLineNum = 285;BA.debugLine="Sub GetBA As Object";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 286;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(536870912);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 287;BA.debugLine="Dim cls As String = Me";
Debug.ShouldStop(1073741824);
_cls = BA.ObjectToString(act_printpic.getObject());Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 288;BA.debugLine="cls = cls.SubString(\"class \".Length)";
Debug.ShouldStop(-2147483648);
_cls = _cls.runMethod(true,"substring",(Object)(RemoteObject.createImmutable("class ").runMethod(true,"length")));Debug.locals.put("cls", _cls);
 BA.debugLineNum = 289;BA.debugLine="jo.InitializeStatic(cls)";
Debug.ShouldStop(1);
_jo.runVoidMethod ("InitializeStatic",(Object)(_cls));
 BA.debugLineNum = 290;BA.debugLine="Return jo.GetField(\"processBA\")";
Debug.ShouldStop(2);
if (true) return _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("processBA")));
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private ion As Object";
act_printpic.mostCurrent._ion = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 18;BA.debugLine="Private LblPrint As Label";
act_printpic.mostCurrent._lblprint = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ImageView1 As ImageView";
act_printpic.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private clv1 As CustomListView";
act_printpic.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 22;BA.debugLine="Dim ImageSignature As String";
act_printpic.mostCurrent._imagesignature = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim SignatureUpdate As String";
act_printpic.mostCurrent._signatureupdate = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Private LblSettingBTPrinter As Label";
act_printpic.mostCurrent._lblsettingbtprinter = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblprint_click() throws Exception{
try {
		Debug.PushSubsStack("LblPrint_Click (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,126);
if (RapidSub.canDelegate("lblprint_click")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","lblprint_click");}
 BA.debugLineNum = 126;BA.debugLine="Private Sub LblPrint_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 128;BA.debugLine="Select MCode.PrinterType";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(act_printpic.mostCurrent._mcode._printertype /*RemoteObject*/ ,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 131;BA.debugLine="If Printer1.IsBluetoothOn = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_printpic._printer1.runMethod(true,"_isbluetoothon"),act_printpic.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 132;BA.debugLine="Msgbox(\"لطفا بلوتوث گوشی خود را فعال نمائید و";
Debug.ShouldStop(8);
act_printpic.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("لطفا بلوتوث گوشی خود را فعال نمائید و دستگاه پرینتر خود را انتخاب کنید.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),act_printpic.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 133;BA.debugLine="Else If Printer1.IsConnected = False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",act_printpic._printer1.runMethod(true,"_isconnected"),act_printpic.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 134;BA.debugLine="Printer1.Connect";
Debug.ShouldStop(32);
act_printpic._printer1.runVoidMethod ("_connect");
 }else {
 BA.debugLineNum = 136;BA.debugLine="PrintBluetooth";
Debug.ShouldStop(128);
_printbluetooth();
 }}
;
 break; }
case 1: {
 BA.debugLineNum = 141;BA.debugLine="PrintPos";
Debug.ShouldStop(4096);
_printpos();
 break; }
}
;
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblsettingbtprinter_click() throws Exception{
try {
		Debug.PushSubsStack("LblSettingBTPrinter_Click (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,122);
if (RapidSub.canDelegate("lblsettingbtprinter_click")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","lblsettingbtprinter_click");}
 BA.debugLineNum = 122;BA.debugLine="Private Sub LblSettingBTPrinter_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Printer1.Connect";
Debug.ShouldStop(67108864);
act_printpic._printer1.runVoidMethod ("_connect");
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblshare_click() throws Exception{
try {
		Debug.PushSubsStack("LblShare_Click (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,97);
if (RapidSub.canDelegate("lblshare_click")) { ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","lblshare_click"); return;}
ResumableSub_LblShare_Click rsub = new ResumableSub_LblShare_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LblShare_Click extends BA.ResumableSub {
public ResumableSub_LblShare_Click(ir.parsikhesab.pakhsh.act_printpic parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_printpic parent;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _pn = RemoteObject.declareNull("ir.cafetoseeh.PNMultipleSharing");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblShare_Click (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,97);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 98;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
Debug.ShouldStop(2);
_filename = RemoteObject.concat(parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 100;BA.debugLine="Dim bmp As B4XBitmap = clv1.sv.ScrollViewInnerPan";
Debug.ShouldStop(8);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = parent.mostCurrent._clv1.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(false,"Snapshot");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 101;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(16);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 102;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
Debug.ShouldStop(32);
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 103;BA.debugLine="bmp.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(64);
_bmp.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 104;BA.debugLine="out.Close";
Debug.ShouldStop(128);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 105;BA.debugLine="Sleep(200)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic", "lblshare_click"),BA.numberCast(int.class, 200));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 106;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
Debug.ShouldStop(512);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename));
 BA.debugLineNum = 107;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic", "lblshare_click"),BA.numberCast(int.class, 200));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
 BA.debugLineNum = 111;BA.debugLine="Try";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 112;BA.debugLine="Dim pn As PNMultipleSharing";
Debug.ShouldStop(32768);
_pn = RemoteObject.createNew ("ir.cafetoseeh.PNMultipleSharing");Debug.locals.put("pn", _pn);
 BA.debugLineNum = 113;BA.debugLine="pn.ShareFileWithCaption(File.DirDefaultExternal,";
Debug.ShouldStop(65536);
_pn.runVoidMethod ("ShareFileWithCaption",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename),(Object)(BA.ObjectToString("image/*")),(Object)(BA.ObjectToString("فاکتور ")),(Object)(RemoteObject.createImmutable("اشتراک گذاری")));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 115;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","553608466",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_printpic.mostCurrent.activityBA)),0);
 BA.debugLineNum = 116;BA.debugLine="ToastMessageShow(\"برنامه ای جهت اشتراک گذاری یاف";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برنامه ای جهت اشتراک گذاری یافت نشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_printpic.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _lblsign_click() throws Exception{
try {
		Debug.PushSubsStack("LblSign_Click (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,276);
if (RapidSub.canDelegate("lblsign_click")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","lblsign_click");}
 BA.debugLineNum = 276;BA.debugLine="Sub LblSign_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 278;BA.debugLine="StartActivity(Act_Emza)";
Debug.ShouldStop(2097152);
act_printpic.mostCurrent.__c.runVoidMethod ("StartActivity",act_printpic.processBA,(Object)((act_printpic.mostCurrent._act_emza.getObject())));
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _printbluetooth() throws Exception{
try {
		Debug.PushSubsStack("PrintBluetooth (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,151);
if (RapidSub.canDelegate("printbluetooth")) { ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","printbluetooth"); return;}
ResumableSub_PrintBluetooth rsub = new ResumableSub_PrintBluetooth(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PrintBluetooth extends BA.ResumableSub {
public ResumableSub_PrintBluetooth(ir.parsikhesab.pakhsh.act_printpic parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_printpic parent;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _highdensity = RemoteObject.createImmutable(false);
RemoteObject _dots24 = RemoteObject.createImmutable(false);
RemoteObject _lowxdpi = RemoteObject.createImmutable(0);
RemoteObject _highxdpi = RemoteObject.createImmutable(0);
RemoteObject _dots8ydpi = RemoteObject.createImmutable(0);
RemoteObject _dots24ydpi = RemoteObject.createImmutable(0);
RemoteObject _maxwidth = RemoteObject.createImmutable(0);
RemoteObject _xdpi = RemoteObject.createImmutable(0);
RemoteObject _ydpi = RemoteObject.createImmutable(0);
RemoteObject _sliceheight = RemoteObject.createImmutable(0);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _myimage = RemoteObject.declareNull("uk.agraham.bluetoothprinter.escposprinter._animage");
RemoteObject _lastslice = RemoteObject.createImmutable(0);
RemoteObject _excess = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _slice = null;
int step39;
int limit39;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrintBluetooth (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,151);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 152;BA.debugLine="Printer1.Reset";
Debug.ShouldStop(8388608);
parent._printer1.runVoidMethod ("_reset");
 BA.debugLineNum = 153;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
Debug.ShouldStop(16777216);
_filename = RemoteObject.concat(parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 155;BA.debugLine="Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPa";
Debug.ShouldStop(67108864);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp1 = parent.mostCurrent._clv1.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(false,"Snapshot");Debug.locals.put("bmp1", _bmp1);Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 156;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(134217728);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 157;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
Debug.ShouldStop(268435456);
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 158;BA.debugLine="bmp1.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(536870912);
_bmp1.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 159;BA.debugLine="out.Close";
Debug.ShouldStop(1073741824);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 160;BA.debugLine="Sleep(200)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic", "printbluetooth"),BA.numberCast(int.class, 200));
this.state = 18;
return;
case 18:
//C
this.state = 1;
;
 BA.debugLineNum = 161;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
Debug.ShouldStop(1);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename));
 BA.debugLineNum = 162;BA.debugLine="Sleep(200)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic", "printbluetooth"),BA.numberCast(int.class, 200));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
 BA.debugLineNum = 164;BA.debugLine="Dim highdensity As Boolean = True";
Debug.ShouldStop(8);
_highdensity = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("highdensity", _highdensity);Debug.locals.put("highdensity", _highdensity);
 BA.debugLineNum = 165;BA.debugLine="Dim dots24 As Boolean = True";
Debug.ShouldStop(16);
_dots24 = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dots24", _dots24);Debug.locals.put("dots24", _dots24);
 BA.debugLineNum = 168;BA.debugLine="Dim LowXdpi As Int = 90";
Debug.ShouldStop(128);
_lowxdpi = BA.numberCast(int.class, 90);Debug.locals.put("LowXdpi", _lowxdpi);Debug.locals.put("LowXdpi", _lowxdpi);
 BA.debugLineNum = 169;BA.debugLine="Dim HighXdpi As Int = 180";
Debug.ShouldStop(256);
_highxdpi = BA.numberCast(int.class, 180);Debug.locals.put("HighXdpi", _highxdpi);Debug.locals.put("HighXdpi", _highxdpi);
 BA.debugLineNum = 171;BA.debugLine="Dim dots8Ydpi As Int = 60";
Debug.ShouldStop(1024);
_dots8ydpi = BA.numberCast(int.class, 60);Debug.locals.put("dots8Ydpi", _dots8ydpi);Debug.locals.put("dots8Ydpi", _dots8ydpi);
 BA.debugLineNum = 172;BA.debugLine="Dim dots24Ydpi As Int = 180";
Debug.ShouldStop(2048);
_dots24ydpi = BA.numberCast(int.class, 180);Debug.locals.put("dots24Ydpi", _dots24ydpi);Debug.locals.put("dots24Ydpi", _dots24ydpi);
 BA.debugLineNum = 175;BA.debugLine="Dim maxwidth As Int  = 288";
Debug.ShouldStop(16384);
_maxwidth = BA.numberCast(int.class, 288);Debug.locals.put("maxwidth", _maxwidth);Debug.locals.put("maxwidth", _maxwidth);
 BA.debugLineNum = 176;BA.debugLine="Dim Xdpi As Int = LowXdpi";
Debug.ShouldStop(32768);
_xdpi = _lowxdpi;Debug.locals.put("Xdpi", _xdpi);Debug.locals.put("Xdpi", _xdpi);
 BA.debugLineNum = 177;BA.debugLine="Dim Ydpi As Int = dots8Ydpi";
Debug.ShouldStop(65536);
_ydpi = _dots8ydpi;Debug.locals.put("Ydpi", _ydpi);Debug.locals.put("Ydpi", _ydpi);
 BA.debugLineNum = 178;BA.debugLine="Dim sliceheight As Int = 8";
Debug.ShouldStop(131072);
_sliceheight = BA.numberCast(int.class, 8);Debug.locals.put("sliceheight", _sliceheight);Debug.locals.put("sliceheight", _sliceheight);
 BA.debugLineNum = 180;BA.debugLine="If highdensity Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (_highdensity.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 181;BA.debugLine="maxwidth = 288*2";
Debug.ShouldStop(1048576);
_maxwidth = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(288),RemoteObject.createImmutable(2)}, "*",0, 1);Debug.locals.put("maxwidth", _maxwidth);
 BA.debugLineNum = 182;BA.debugLine="Xdpi = HighXdpi";
Debug.ShouldStop(2097152);
_xdpi = _highxdpi;Debug.locals.put("Xdpi", _xdpi);
 if (true) break;
;
 BA.debugLineNum = 185;BA.debugLine="If dots24 Then";
Debug.ShouldStop(16777216);

case 4:
//if
this.state = 7;
if (_dots24.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 186;BA.debugLine="Ydpi = dots24Ydpi";
Debug.ShouldStop(33554432);
_ydpi = _dots24ydpi;Debug.locals.put("Ydpi", _ydpi);
 BA.debugLineNum = 187;BA.debugLine="sliceheight = 24";
Debug.ShouldStop(67108864);
_sliceheight = BA.numberCast(int.class, 24);Debug.locals.put("sliceheight", _sliceheight);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 190;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(536870912);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 192;BA.debugLine="bmp.InitializeResize(File.DirDefaultExternal,file";
Debug.ShouldStop(-2147483648);
_bmp.runVoidMethod ("InitializeResize",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename),(Object)(_maxwidth),(Object)(BA.numberCast(int.class, 3000)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 195;BA.debugLine="bmp = bmp.Resize(bmp.Width, bmp.Height * Ydpi / X";
Debug.ShouldStop(4);
_bmp = _bmp.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, _bmp.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_ydpi,_xdpi}, "*/",0, 0))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 198;BA.debugLine="Dim myimage As AnImage = Printer1.ImageToBWIMage(";
Debug.ShouldStop(32);
_myimage = parent._printer1.runMethod(false,"_imagetobwimage",(Object)(_bmp));Debug.locals.put("myimage", _myimage);Debug.locals.put("myimage", _myimage);
 BA.debugLineNum = 203;BA.debugLine="myimage = Printer1.DitherImage2D(myimage, 128)";
Debug.ShouldStop(1024);
_myimage = parent._printer1.runMethod(false,"_ditherimage2d",(Object)(_myimage),(Object)(BA.numberCast(int.class, 128)));Debug.locals.put("myimage", _myimage);
 BA.debugLineNum = 207;BA.debugLine="Dim lastslice As Int = myimage.Height / sliceheig";
Debug.ShouldStop(16384);
_lastslice = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_myimage.getField(true,"Height"),_sliceheight,RemoteObject.createImmutable(1)}, "/-",1, 0));Debug.locals.put("lastslice", _lastslice);Debug.locals.put("lastslice", _lastslice);
 BA.debugLineNum = 208;BA.debugLine="Dim excess As Int = myimage.Height * sliceheight";
Debug.ShouldStop(32768);
_excess = RemoteObject.solve(new RemoteObject[] {_myimage.getField(true,"Height"),_sliceheight,_lastslice}, "*-",1, 1);Debug.locals.put("excess", _excess);Debug.locals.put("excess", _excess);
 BA.debugLineNum = 209;BA.debugLine="If excess > 0 Then lastslice = lastslice - 1";
Debug.ShouldStop(65536);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean(">",_excess,BA.numberCast(double.class, 0))) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_lastslice = RemoteObject.solve(new RemoteObject[] {_lastslice,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("lastslice", _lastslice);
if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 211;BA.debugLine="Printer1.LineSpacing = 0";
Debug.ShouldStop(262144);
parent._printer1.runVoidMethod ("_setlinespacing",BA.numberCast(int.class, 0));
 BA.debugLineNum = 212;BA.debugLine="Printer1.WriteString(CRLF) ' to show the user som";
Debug.ShouldStop(524288);
parent._printer1.runVoidMethod ("_writestring",(Object)(parent.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 213;BA.debugLine="For i = 0 To lastslice";
Debug.ShouldStop(1048576);
if (true) break;

case 14:
//for
this.state = 17;
step39 = 1;
limit39 = _lastslice.<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 20;
if (true) break;

case 20:
//C
this.state = 17;
if ((step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39)) this.state = 16;
if (true) break;

case 21:
//C
this.state = 20;
_i = ((int)(0 + _i + step39)) ;
Debug.locals.put("i", _i);
if (true) break;

case 16:
//C
this.state = 21;
 BA.debugLineNum = 214;BA.debugLine="Dim slice() As Byte = Printer1.PackImageSlice(my";
Debug.ShouldStop(2097152);
_slice = parent._printer1.runMethod(false,"_packimageslice",(Object)(_myimage),(Object)(BA.numberCast(int.class, _i)),(Object)(_dots24));Debug.locals.put("slice", _slice);Debug.locals.put("slice", _slice);
 BA.debugLineNum = 215;BA.debugLine="Printer1.PrintImage2(myimage.Width, slice, highd";
Debug.ShouldStop(4194304);
parent._printer1.runVoidMethod ("_printimage2",(Object)(_myimage.getField(true,"Width")),(Object)(_slice),(Object)(_highdensity),(Object)(_dots24));
 BA.debugLineNum = 216;BA.debugLine="Sleep(350)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic", "printbluetooth"),BA.numberCast(int.class, 350));
this.state = 22;
return;
case 22:
//C
this.state = 21;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 218;BA.debugLine="Printer1.WriteString(CRLF  & CRLF & \"Ended\" & CRL";
Debug.ShouldStop(33554432);
parent._printer1.runVoidMethod ("_writestring",(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Ended"),parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent.__c.getField(true,"CRLF"))));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _printer_terminated() throws Exception{
try {
		Debug.PushSubsStack("Printer_Terminated (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,263);
if (RapidSub.canDelegate("printer_terminated")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","printer_terminated");}
 BA.debugLineNum = 263;BA.debugLine="Private Sub Printer_Terminated";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="ToastMessageShow(\"Connection is terminated.\", Tru";
Debug.ShouldStop(128);
act_printpic.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Connection is terminated.")),(Object)(act_printpic.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer1_connected(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Printer1_Connected (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,246);
if (RapidSub.canDelegate("printer1_connected")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","printer1_connected", _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 246;BA.debugLine="Sub Printer1_Connected (Success As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 247;BA.debugLine="If Success Then";
Debug.ShouldStop(4194304);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 248;BA.debugLine="ToastMessageShow(\"اتصال پرینتر برقرار شد\", False";
Debug.ShouldStop(8388608);
act_printpic.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اتصال پرینتر برقرار شد")),(Object)(act_printpic.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 249;BA.debugLine="LblSettingBTPrinter.Enabled=True";
Debug.ShouldStop(16777216);
act_printpic.mostCurrent._lblsettingbtprinter.runMethod(true,"setEnabled",act_printpic.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 251;BA.debugLine="Msgbox(Printer1.ConnectedErrorMsg, \"خطا در اتصال";
Debug.ShouldStop(67108864);
act_printpic.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(act_printpic._printer1.runMethod(true,"_connectederrormsg"))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("خطا در اتصال پرینتر."))),act_printpic.mostCurrent.activityBA);
 };
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer1_error() throws Exception{
try {
		Debug.PushSubsStack("Printer1_Error (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,258);
if (RapidSub.canDelegate("printer1_error")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","printer1_error");}
 BA.debugLineNum = 258;BA.debugLine="Private Sub Printer1_Error";
Debug.ShouldStop(2);
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printer1_newdata(RemoteObject _buffer) throws Exception{
try {
		Debug.PushSubsStack("Printer1_NewData (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,255);
if (RapidSub.canDelegate("printer1_newdata")) { return ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","printer1_newdata", _buffer);}
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 255;BA.debugLine="Private Sub Printer1_NewData (Buffer() As Byte)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _printpos() throws Exception{
try {
		Debug.PushSubsStack("PrintPos (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,222);
if (RapidSub.canDelegate("printpos")) { ir.parsikhesab.pakhsh.act_printpic.remoteMe.runUserSub(false, "act_printpic","printpos"); return;}
ResumableSub_PrintPos rsub = new ResumableSub_PrintPos(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PrintPos extends BA.ResumableSub {
public ResumableSub_PrintPos(ir.parsikhesab.pakhsh.act_printpic parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_printpic parent;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _pathimage = RemoteObject.createImmutable("");
RemoteObject _intent = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrintPos (act_printpic) ","act_printpic",27,act_printpic.mostCurrent.activityBA,act_printpic.mostCurrent,222);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 225;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
Debug.ShouldStop(1);
_filename = RemoteObject.concat(parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 227;BA.debugLine="Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPa";
Debug.ShouldStop(4);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp1 = parent.mostCurrent._clv1.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(false,"Snapshot");Debug.locals.put("bmp1", _bmp1);Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 228;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(8);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 229;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
Debug.ShouldStop(16);
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 230;BA.debugLine="bmp1.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(32);
_bmp1.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 231;BA.debugLine="out.Close";
Debug.ShouldStop(64);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 232;BA.debugLine="Sleep(200)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic", "printpos"),BA.numberCast(int.class, 200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 233;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
Debug.ShouldStop(256);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename));
 BA.debugLineNum = 234;BA.debugLine="Sleep(200)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic", "printpos"),BA.numberCast(int.class, 200));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
 BA.debugLineNum = 235;BA.debugLine="Dim pathimage As String=File.Combine(File.DirDefa";
Debug.ShouldStop(1024);
_pathimage = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename));Debug.locals.put("pathimage", _pathimage);Debug.locals.put("pathimage", _pathimage);
 BA.debugLineNum = 236;BA.debugLine="Dim intent As Intent";
Debug.ShouldStop(2048);
_intent = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("intent", _intent);
 BA.debugLineNum = 237;BA.debugLine="intent.Initialize(\"Print\", \"\")";
Debug.ShouldStop(4096);
_intent.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("Print")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 238;BA.debugLine="intent.SetComponent(MCode.PackageNamePosParsian &";
Debug.ShouldStop(8192);
_intent.runVoidMethod ("SetComponent",(Object)(RemoteObject.concat(parent.mostCurrent._mcode._packagenameposparsian /*RemoteObject*/ ,RemoteObject.createImmutable("/.MyJavaService"))));
 BA.debugLineNum = 240;BA.debugLine="intent.PutExtra(\"imagepath\", pathimage) ' ارسال د";
Debug.ShouldStop(32768);
_intent.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("imagepath")),(Object)((_pathimage)));
 BA.debugLineNum = 241;BA.debugLine="intent.PutExtra(\"CompanyName\", \"Parsik\") ' ارسال";
Debug.ShouldStop(65536);
_intent.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("CompanyName")),(Object)((RemoteObject.createImmutable("Parsik"))));
 BA.debugLineNum = 242;BA.debugLine="StartService(intent)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("StartService",act_printpic.processBA,(Object)((_intent.getObject())));
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim Faktor As AdapterListFaktor";
act_printpic._faktor = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");
 //BA.debugLineNum = 9;BA.debugLine="Dim listKala As List";
act_printpic._listkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 10;BA.debugLine="Dim TypePrint As Int";
act_printpic._typeprint = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Dim Printer1 As EscPosPrinter";
act_printpic._printer1 = RemoteObject.createNew ("uk.agraham.bluetoothprinter.escposprinter");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}