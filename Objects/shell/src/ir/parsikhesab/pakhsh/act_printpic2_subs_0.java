package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_printpic2_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"L_PrintPic2\")";
Debug.ShouldStop(2097152);
act_printpic2.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_PrintPic2")),act_printpic2.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="Printer1.Initialize(Me, \"Printer1\")";
Debug.ShouldStop(8388608);
act_printpic2._printer1.runVoidMethod ("_initialize",act_printpic2.processBA,(Object)(act_printpic2.getObject()),(Object)(RemoteObject.createImmutable("Printer1")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","activity_resume");}
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="clv1.Clear";
Debug.ShouldStop(134217728);
act_printpic2.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 29;BA.debugLine="Select TypePrint";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(act_printpic2._typeprint,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 31;BA.debugLine="CreateReport";
Debug.ShouldStop(1073741824);
_createreport();
 break; }
case 1: {
 BA.debugLineNum = 33;BA.debugLine="CreateReport2";
Debug.ShouldStop(1);
_createreport2();
 break; }
}
;
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btn_Back_Click (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,492);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","btn_back_click");}
 BA.debugLineNum = 492;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 493;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
act_printpic2.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 494;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("CreateReport (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,255);
if (RapidSub.canDelegate("createreport")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","createreport");}
RemoteObject _rec1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_faktor1_havale_type1");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _radif = RemoteObject.createImmutable("");
RemoteObject _codekala = RemoteObject.createImmutable("");
RemoteObject _namekala = RemoteObject.createImmutable("");
RemoteObject _fee = RemoteObject.createImmutable("");
RemoteObject _darsadtakhfif = RemoteObject.createImmutable("");
RemoteObject _feetakhfif = RemoteObject.createImmutable("");
RemoteObject _tedadjoze = RemoteObject.createImmutable("");
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _feeyekkarton = RemoteObject.createImmutable("");
RemoteObject _sharhfactor = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _mablaghkhales = RemoteObject.createImmutable(0L);
RemoteObject _mablaghtakhfif = RemoteObject.createImmutable(0L);
RemoteObject _mandetalab = RemoteObject.createImmutable(0L);
RemoteObject _mandetasfienashode = RemoteObject.createImmutable(0L);
RemoteObject _mablaghekoldaryafti = RemoteObject.createImmutable(0L);
RemoteObject _mablaghtakhfifdaryafti = RemoteObject.createImmutable(0L);
RemoteObject _totalfaktor = RemoteObject.createImmutable(0L);
RemoteObject _signature = RemoteObject.createImmutable("");
RemoteObject _ghabelepardakht = RemoteObject.createImmutable(0L);
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale");
RemoteObject _rec2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_faktor2_havale_type1");
RemoteObject _strmablaghkhales = RemoteObject.createImmutable("");
RemoteObject _strmablaghtakhfif = RemoteObject.createImmutable("");
RemoteObject _strmandetalab = RemoteObject.createImmutable("");
RemoteObject _strmandetasfienashode = RemoteObject.createImmutable("");
RemoteObject _strmablaghekoldaryafti = RemoteObject.createImmutable("");
RemoteObject _strmablaghtakhfifdaryafti = RemoteObject.createImmutable("");
RemoteObject _strtotalfaktor = RemoteObject.createImmutable("");
RemoteObject _strghabelepardakht = RemoteObject.createImmutable("");
RemoteObject _dr = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _rec3 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_faktor3_havale_type1");
 BA.debugLineNum = 255;BA.debugLine="Sub CreateReport";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 260;BA.debugLine="Dim rec1 As cls_Faktor1_Havale_Type1";
Debug.ShouldStop(8);
_rec1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_faktor1_havale_type1");Debug.locals.put("rec1", _rec1);
 BA.debugLineNum = 261;BA.debugLine="Dim Date As String= MCode.Sf.Mid(MCode.DatePersia";
Debug.ShouldStop(16);
_date = RemoteObject.concat(act_printpic2.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic2.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),act_printpic2.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic2.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),act_printpic2.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic2.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 262;BA.debugLine="Dim DateFactor As String= DateFactor";
Debug.ShouldStop(32);
act_printpic2._datefactor = act_printpic2._datefactor;
 BA.debugLineNum = 263;BA.debugLine="Dim Time As String=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(64);
_time = act_printpic2.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_printpic2.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 264;BA.debugLine="rec1.Initialize(MCode.C_Tafzili,MCode.N_Tafzili,M";
Debug.ShouldStop(128);
_rec1.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor1_havale_type1.class, "_initialize" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(act_printpic2.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._c_visitor /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._n_visitor /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._appname /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._shomarefaktor /*RemoteObject*/ ),(Object)(act_printpic2._datefactor),(Object)(_date),(Object)(_time),(Object)(act_printpic2.mostCurrent._mcode._tell_tafzili /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._address_tafzili /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._companyname /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._companytell /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._companyaddress /*RemoteObject*/ ));
 BA.debugLineNum = 265;BA.debugLine="clv1.Add(rec1.Panel,0)";
Debug.ShouldStop(256);
act_printpic2.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec1.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor1_havale_type1.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 271;BA.debugLine="Dim Radif As String";
Debug.ShouldStop(16384);
_radif = RemoteObject.createImmutable("");Debug.locals.put("Radif", _radif);
 BA.debugLineNum = 272;BA.debugLine="Dim CodeKala As String";
Debug.ShouldStop(32768);
_codekala = RemoteObject.createImmutable("");Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 273;BA.debugLine="Dim NameKala As String";
Debug.ShouldStop(65536);
_namekala = RemoteObject.createImmutable("");Debug.locals.put("NameKala", _namekala);
 BA.debugLineNum = 274;BA.debugLine="Dim Fee As String";
Debug.ShouldStop(131072);
_fee = RemoteObject.createImmutable("");Debug.locals.put("Fee", _fee);
 BA.debugLineNum = 275;BA.debugLine="Dim DarsadTakhfif As String";
Debug.ShouldStop(262144);
_darsadtakhfif = RemoteObject.createImmutable("");Debug.locals.put("DarsadTakhfif", _darsadtakhfif);
 BA.debugLineNum = 276;BA.debugLine="Dim FeeTakhfif As String";
Debug.ShouldStop(524288);
_feetakhfif = RemoteObject.createImmutable("");Debug.locals.put("FeeTakhfif", _feetakhfif);
 BA.debugLineNum = 277;BA.debugLine="Dim TedadJoze As String";
Debug.ShouldStop(1048576);
_tedadjoze = RemoteObject.createImmutable("");Debug.locals.put("TedadJoze", _tedadjoze);
 BA.debugLineNum = 278;BA.debugLine="Dim TedadKol As String";
Debug.ShouldStop(2097152);
_tedadkol = RemoteObject.createImmutable("");Debug.locals.put("TedadKol", _tedadkol);
 BA.debugLineNum = 279;BA.debugLine="Dim FeeYekKarton As String";
Debug.ShouldStop(4194304);
_feeyekkarton = RemoteObject.createImmutable("");Debug.locals.put("FeeYekKarton", _feeyekkarton);
 BA.debugLineNum = 280;BA.debugLine="Dim SharhFactor As String";
Debug.ShouldStop(8388608);
_sharhfactor = RemoteObject.createImmutable("");Debug.locals.put("SharhFactor", _sharhfactor);
 BA.debugLineNum = 282;BA.debugLine="Dim count As Int=0";
Debug.ShouldStop(33554432);
_count = BA.numberCast(int.class, 0);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 284;BA.debugLine="Dim MablaghKhales As Long=0";
Debug.ShouldStop(134217728);
_mablaghkhales = BA.numberCast(long.class, 0);Debug.locals.put("MablaghKhales", _mablaghkhales);Debug.locals.put("MablaghKhales", _mablaghkhales);
 BA.debugLineNum = 285;BA.debugLine="Dim MablaghTakhfif As Long=0";
Debug.ShouldStop(268435456);
_mablaghtakhfif = BA.numberCast(long.class, 0);Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);
 BA.debugLineNum = 286;BA.debugLine="Dim MandeTalab As Long=0";
Debug.ShouldStop(536870912);
_mandetalab = BA.numberCast(long.class, 0);Debug.locals.put("MandeTalab", _mandetalab);Debug.locals.put("MandeTalab", _mandetalab);
 BA.debugLineNum = 287;BA.debugLine="Dim MandeTasfieNashode As Long=0";
Debug.ShouldStop(1073741824);
_mandetasfienashode = BA.numberCast(long.class, 0);Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);
 BA.debugLineNum = 288;BA.debugLine="Dim MablagheKolDaryafti As Long=0";
Debug.ShouldStop(-2147483648);
_mablaghekoldaryafti = BA.numberCast(long.class, 0);Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);
 BA.debugLineNum = 289;BA.debugLine="Dim MablaghTakhfifDaryafti As Long=0";
Debug.ShouldStop(1);
_mablaghtakhfifdaryafti = BA.numberCast(long.class, 0);Debug.locals.put("MablaghTakhfifDaryafti", _mablaghtakhfifdaryafti);Debug.locals.put("MablaghTakhfifDaryafti", _mablaghtakhfifdaryafti);
 BA.debugLineNum = 290;BA.debugLine="Dim TotalFaktor As Long=0";
Debug.ShouldStop(2);
_totalfaktor = BA.numberCast(long.class, 0);Debug.locals.put("TotalFaktor", _totalfaktor);Debug.locals.put("TotalFaktor", _totalfaktor);
 BA.debugLineNum = 291;BA.debugLine="Dim Signature As String";
Debug.ShouldStop(4);
_signature = RemoteObject.createImmutable("");Debug.locals.put("Signature", _signature);
 BA.debugLineNum = 292;BA.debugLine="Dim GHabelePardakht As Long=0";
Debug.ShouldStop(8);
_ghabelepardakht = BA.numberCast(long.class, 0);Debug.locals.put("GHabelePardakht", _ghabelepardakht);Debug.locals.put("GHabelePardakht", _ghabelepardakht);
 BA.debugLineNum = 297;BA.debugLine="For i=0 To Listkala.Size-1";
Debug.ShouldStop(256);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {act_printpic2._listkala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 298;BA.debugLine="Dim item As AdapteRizFactorHavale=Listkala.Get(i";
Debug.ShouldStop(512);
_item = (act_printpic2._listkala.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 299;BA.debugLine="Radif=i+1";
Debug.ShouldStop(1024);
_radif = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("Radif", _radif);
 BA.debugLineNum = 300;BA.debugLine="CodeKala=item.fldCodeKala";
Debug.ShouldStop(2048);
_codekala = _item.getField(true,"fldCodeKala" /*RemoteObject*/ );Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 301;BA.debugLine="NameKala=item.fldSharhKala";
Debug.ShouldStop(4096);
_namekala = _item.getField(true,"fldSharhKala" /*RemoteObject*/ );Debug.locals.put("NameKala", _namekala);
 BA.debugLineNum = 302;BA.debugLine="Fee=item.fldFeeJoz";
Debug.ShouldStop(8192);
_fee = _item.getField(true,"fldFeeJoz" /*RemoteObject*/ );Debug.locals.put("Fee", _fee);
 BA.debugLineNum = 303;BA.debugLine="TedadJoze=item.fldTedadJoz";
Debug.ShouldStop(16384);
_tedadjoze = _item.getField(true,"fldTedadJoz" /*RemoteObject*/ );Debug.locals.put("TedadJoze", _tedadjoze);
 BA.debugLineNum = 304;BA.debugLine="TedadKol=item.fldTedadCarton";
Debug.ShouldStop(32768);
_tedadkol = _item.getField(true,"fldTedadCarton" /*RemoteObject*/ );Debug.locals.put("TedadKol", _tedadkol);
 BA.debugLineNum = 306;BA.debugLine="If  item.fldMablaghTakhfif>0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldMablaghTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 307;BA.debugLine="FeeTakhfif=item.fldMablaghTakhfif";
Debug.ShouldStop(262144);
_feetakhfif = _item.getField(true,"fldMablaghTakhfif" /*RemoteObject*/ );Debug.locals.put("FeeTakhfif", _feetakhfif);
 }else {
 BA.debugLineNum = 310;BA.debugLine="FeeTakhfif=0";
Debug.ShouldStop(2097152);
_feetakhfif = BA.NumberToString(0);Debug.locals.put("FeeTakhfif", _feetakhfif);
 };
 BA.debugLineNum = 312;BA.debugLine="If item.fldDarsadTakhfif=0 And item.fldDarsadTak";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 313;BA.debugLine="DarsadTakhfif=item.fldDarsadTakhfif";
Debug.ShouldStop(16777216);
_darsadtakhfif = _item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ );Debug.locals.put("DarsadTakhfif", _darsadtakhfif);
 }else {
 BA.debugLineNum = 316;BA.debugLine="DarsadTakhfif=0";
Debug.ShouldStop(134217728);
_darsadtakhfif = BA.NumberToString(0);Debug.locals.put("DarsadTakhfif", _darsadtakhfif);
 };
 BA.debugLineNum = 319;BA.debugLine="FeeYekKarton=item.fldFeeYekCarton";
Debug.ShouldStop(1073741824);
_feeyekkarton = _item.getField(true,"fldFeeYekCarton" /*RemoteObject*/ );Debug.locals.put("FeeYekKarton", _feeyekkarton);
 BA.debugLineNum = 320;BA.debugLine="Signature=item.fldSignature";
Debug.ShouldStop(-2147483648);
_signature = _item.getField(true,"fldSignature" /*RemoteObject*/ );Debug.locals.put("Signature", _signature);
 BA.debugLineNum = 322;BA.debugLine="Dim rec2 As cls_Faktor2_Havale_Type1";
Debug.ShouldStop(2);
_rec2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_faktor2_havale_type1");Debug.locals.put("rec2", _rec2);
 BA.debugLineNum = 323;BA.debugLine="rec2.Initialize(Radif,CodeKala,NameKala,myCode.A";
Debug.ShouldStop(4);
_rec2.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor2_havale_type1.class, "_initialize" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(_radif),(Object)(_codekala),(Object)(_namekala),(Object)(act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(_fee))),(Object)(act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(_feeyekkarton))),(Object)(act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(_feetakhfif))),(Object)(_darsadtakhfif),(Object)(_tedadjoze),(Object)(_tedadkol));
 BA.debugLineNum = 324;BA.debugLine="SharhFactor=item.fldSharhFactor";
Debug.ShouldStop(8);
_sharhfactor = _item.getField(true,"fldSharhFactor" /*RemoteObject*/ );Debug.locals.put("SharhFactor", _sharhfactor);
 BA.debugLineNum = 325;BA.debugLine="clv1.Add(rec2.Panel,i)";
Debug.ShouldStop(16);
act_printpic2.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec2.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor2_havale_type1.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable((_i))));
 BA.debugLineNum = 328;BA.debugLine="MablaghKhales=MablaghKhales+item.fldMablaghKhale";
Debug.ShouldStop(128);
_mablaghkhales = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_mablaghkhales,BA.numberCast(double.class, _item.getField(true,"fldMablaghKhales" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("MablaghKhales", _mablaghkhales);
 BA.debugLineNum = 329;BA.debugLine="MablaghTakhfif=MablaghTakhfif+item.fldMablaghTak";
Debug.ShouldStop(256);
_mablaghtakhfif = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_mablaghtakhfif,BA.numberCast(double.class, _item.getField(true,"fldMablaghTakhfif" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);
 BA.debugLineNum = 330;BA.debugLine="MandeTalab=item.fldMandeTalab";
Debug.ShouldStop(512);
_mandetalab = BA.numberCast(long.class, _item.getField(true,"fldMandeTalab" /*RemoteObject*/ ));Debug.locals.put("MandeTalab", _mandetalab);
 BA.debugLineNum = 331;BA.debugLine="MandeTasfieNashode=item.fldMandeTasfieNashode";
Debug.ShouldStop(1024);
_mandetasfienashode = BA.numberCast(long.class, _item.getField(true,"fldMandeTasfieNashode" /*RemoteObject*/ ));Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);
 BA.debugLineNum = 332;BA.debugLine="MablagheKolDaryafti=item.fldMablagheKolDaryafti";
Debug.ShouldStop(2048);
_mablaghekoldaryafti = BA.numberCast(long.class, _item.getField(true,"fldMablagheKolDaryafti" /*RemoteObject*/ ));Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 335;BA.debugLine="TotalFaktor=MablaghKhales+MablaghTakhfif";
Debug.ShouldStop(16384);
_totalfaktor = RemoteObject.solve(new RemoteObject[] {_mablaghkhales,_mablaghtakhfif}, "+",1, 2);Debug.locals.put("TotalFaktor", _totalfaktor);
 BA.debugLineNum = 336;BA.debugLine="Dim StrMablaghKhales As String=0";
Debug.ShouldStop(32768);
_strmablaghkhales = BA.NumberToString(0);Debug.locals.put("StrMablaghKhales", _strmablaghkhales);Debug.locals.put("StrMablaghKhales", _strmablaghkhales);
 BA.debugLineNum = 337;BA.debugLine="Dim StrMablaghTakhfif As String=0";
Debug.ShouldStop(65536);
_strmablaghtakhfif = BA.NumberToString(0);Debug.locals.put("StrMablaghTakhfif", _strmablaghtakhfif);Debug.locals.put("StrMablaghTakhfif", _strmablaghtakhfif);
 BA.debugLineNum = 338;BA.debugLine="Dim StrMandeTalab As String=0";
Debug.ShouldStop(131072);
_strmandetalab = BA.NumberToString(0);Debug.locals.put("StrMandeTalab", _strmandetalab);Debug.locals.put("StrMandeTalab", _strmandetalab);
 BA.debugLineNum = 339;BA.debugLine="Dim StrMandeTasfieNashode As String=0";
Debug.ShouldStop(262144);
_strmandetasfienashode = BA.NumberToString(0);Debug.locals.put("StrMandeTasfieNashode", _strmandetasfienashode);Debug.locals.put("StrMandeTasfieNashode", _strmandetasfienashode);
 BA.debugLineNum = 340;BA.debugLine="Dim StrMablagheKolDaryafti As String=0";
Debug.ShouldStop(524288);
_strmablaghekoldaryafti = BA.NumberToString(0);Debug.locals.put("StrMablagheKolDaryafti", _strmablaghekoldaryafti);Debug.locals.put("StrMablagheKolDaryafti", _strmablaghekoldaryafti);
 BA.debugLineNum = 341;BA.debugLine="Dim StrMablaghTakhfifDaryafti As String=0";
Debug.ShouldStop(1048576);
_strmablaghtakhfifdaryafti = BA.NumberToString(0);Debug.locals.put("StrMablaghTakhfifDaryafti", _strmablaghtakhfifdaryafti);Debug.locals.put("StrMablaghTakhfifDaryafti", _strmablaghtakhfifdaryafti);
 BA.debugLineNum = 342;BA.debugLine="Dim StrTotalFaktor As String=0";
Debug.ShouldStop(2097152);
_strtotalfaktor = BA.NumberToString(0);Debug.locals.put("StrTotalFaktor", _strtotalfaktor);Debug.locals.put("StrTotalFaktor", _strtotalfaktor);
 BA.debugLineNum = 343;BA.debugLine="Dim StrGHabelePardakht As String=0";
Debug.ShouldStop(4194304);
_strghabelepardakht = BA.NumberToString(0);Debug.locals.put("StrGHabelePardakht", _strghabelepardakht);Debug.locals.put("StrGHabelePardakht", _strghabelepardakht);
 BA.debugLineNum = 344;BA.debugLine="Dim dr As Cursor=MCode.Result(\"select * from TblD";
Debug.ShouldStop(8388608);
_dr = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dr = act_printpic2.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblDaryaft where fldShomareFactor="),act_printpic2.mostCurrent._mcode._shomarefaktor /*RemoteObject*/ )));Debug.locals.put("dr", _dr);Debug.locals.put("dr", _dr);
 BA.debugLineNum = 345;BA.debugLine="If dr.RowCount>0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_dr.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 346;BA.debugLine="MablagheKolDaryafti=MCode.SingleResult(\"select s";
Debug.ShouldStop(33554432);
_mablaghekoldaryafti = BA.numberCast(long.class, act_printpic2.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select sum(fldMablaghDaryafti) as fldMablaghDaryafti from TblDaryaft where fldType<>3 and fldShomareFactor="),act_printpic2.mostCurrent._mcode._shomarefaktor /*RemoteObject*/ ))));Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);
 BA.debugLineNum = 347;BA.debugLine="MablaghTakhfifDaryafti=MCode.SingleResult(\"selec";
Debug.ShouldStop(67108864);
_mablaghtakhfifdaryafti = BA.numberCast(long.class, act_printpic2.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select sum(FldMablaghTakhfif) as fldMablaghTakhfifDaryafti from TblDaryaft where fldType=3 and fldShomareFactor="),act_printpic2.mostCurrent._mcode._shomarefaktor /*RemoteObject*/ ))));Debug.locals.put("MablaghTakhfifDaryafti", _mablaghtakhfifdaryafti);
 BA.debugLineNum = 350;BA.debugLine="MandeTasfieNashode=MablaghKhales-MablagheKolDary";
Debug.ShouldStop(536870912);
_mandetasfienashode = RemoteObject.solve(new RemoteObject[] {_mablaghkhales,_mablaghekoldaryafti}, "-",1, 2);Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);
 BA.debugLineNum = 351;BA.debugLine="StrMablaghTakhfifDaryafti=NumberFormat(myCode.Is";
Debug.ShouldStop(1073741824);
_strmablaghtakhfifdaryafti = RemoteObject.concat(act_printpic2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_printpic2.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghtakhfifdaryafti))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_printpic2.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("StrMablaghTakhfifDaryafti", _strmablaghtakhfifdaryafti);
 BA.debugLineNum = 352;BA.debugLine="StrGHabelePardakht = NumberFormat(myCode.Is_Null";
Debug.ShouldStop(-2147483648);
_strghabelepardakht = RemoteObject.concat(act_printpic2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_printpic2.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mandetalab))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_printpic2.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("StrGHabelePardakht", _strghabelepardakht);
 }else {
 BA.debugLineNum = 354;BA.debugLine="StrGHabelePardakht = NumberFormat(myCode.Is_Null";
Debug.ShouldStop(2);
_strghabelepardakht = RemoteObject.concat(act_printpic2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_printpic2.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghkhales))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_printpic2.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("StrGHabelePardakht", _strghabelepardakht);
 };
 BA.debugLineNum = 357;BA.debugLine="StrMablaghKhales = myCode.AdadToPrice(MablaghKhal";
Debug.ShouldStop(16);
_strmablaghkhales = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghkhales)));Debug.locals.put("StrMablaghKhales", _strmablaghkhales);
 BA.debugLineNum = 358;BA.debugLine="StrTotalFaktor = myCode.AdadToPrice(TotalFaktor)";
Debug.ShouldStop(32);
_strtotalfaktor = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_totalfaktor)));Debug.locals.put("StrTotalFaktor", _strtotalfaktor);
 BA.debugLineNum = 360;BA.debugLine="StrMablaghTakhfif = myCode.AdadToPrice(MablaghTak";
Debug.ShouldStop(128);
_strmablaghtakhfif = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghtakhfif)));Debug.locals.put("StrMablaghTakhfif", _strmablaghtakhfif);
 BA.debugLineNum = 361;BA.debugLine="StrMandeTalab = myCode.AdadToPrice(MandeTalab)";
Debug.ShouldStop(256);
_strmandetalab = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mandetalab)));Debug.locals.put("StrMandeTalab", _strmandetalab);
 BA.debugLineNum = 362;BA.debugLine="StrMandeTasfieNashode = myCode.AdadToPrice(MandeT";
Debug.ShouldStop(512);
_strmandetasfienashode = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mandetasfienashode)));Debug.locals.put("StrMandeTasfieNashode", _strmandetasfienashode);
 BA.debugLineNum = 363;BA.debugLine="StrMablagheKolDaryafti = myCode.AdadToPrice(Mabla";
Debug.ShouldStop(1024);
_strmablaghekoldaryafti = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghekoldaryafti)));Debug.locals.put("StrMablagheKolDaryafti", _strmablaghekoldaryafti);
 BA.debugLineNum = 366;BA.debugLine="Dim rec3 As cls_Faktor3_Havale_Type1";
Debug.ShouldStop(8192);
_rec3 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_faktor3_havale_type1");Debug.locals.put("rec3", _rec3);
 BA.debugLineNum = 367;BA.debugLine="rec3.Initialize(StrGHabelePardakht,StrMablaghKhal";
Debug.ShouldStop(16384);
_rec3.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor3_havale_type1.class, "_initialize" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(_strghabelepardakht),(Object)(_strmablaghkhales),(Object)(_strmablaghtakhfifdaryafti),(Object)(_strmandetasfienashode),(Object)(_strmablaghtakhfif),(Object)(_strmablaghekoldaryafti),(Object)(_strtotalfaktor),(Object)(_sharhfactor),(Object)(_signature));
 BA.debugLineNum = 369;BA.debugLine="clv1.Add(rec3.Panel,count+1)";
Debug.ShouldStop(65536);
act_printpic2.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec3.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor3_havale_type1.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createreport2() throws Exception{
try {
		Debug.PushSubsStack("CreateReport2 (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,373);
if (RapidSub.canDelegate("createreport2")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","createreport2");}
RemoteObject _rec1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_faktor1_havale_type2");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _radif = RemoteObject.createImmutable("");
RemoteObject _codekala = RemoteObject.createImmutable("");
RemoteObject _namekala = RemoteObject.createImmutable("");
RemoteObject _fee = RemoteObject.createImmutable("");
RemoteObject _darsadtakhfif = RemoteObject.createImmutable("");
RemoteObject _feetakhfif = RemoteObject.createImmutable("");
RemoteObject _tedadjoze = RemoteObject.createImmutable("");
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _feeyekkarton = RemoteObject.createImmutable("");
RemoteObject _sharhfactor = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _mablaghkhales = RemoteObject.createImmutable(0L);
RemoteObject _mablaghtakhfif = RemoteObject.createImmutable(0L);
RemoteObject _mandetalab = RemoteObject.createImmutable(0L);
RemoteObject _mandetasfienashode = RemoteObject.createImmutable(0L);
RemoteObject _mablaghekoldaryafti = RemoteObject.createImmutable(0L);
RemoteObject _mablaghtakhfifdaryafti = RemoteObject.createImmutable(0L);
RemoteObject _totalfaktor = RemoteObject.createImmutable(0L);
RemoteObject _signature = RemoteObject.createImmutable("");
RemoteObject _ghabelepardakht = RemoteObject.createImmutable(0L);
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale");
RemoteObject _rec2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_faktor2_havale_type2");
RemoteObject _strmablaghkhales = RemoteObject.createImmutable("");
RemoteObject _strmablaghtakhfif = RemoteObject.createImmutable("");
RemoteObject _strmandetalab = RemoteObject.createImmutable("");
RemoteObject _strmandetasfienashode = RemoteObject.createImmutable("");
RemoteObject _strmablaghekoldaryafti = RemoteObject.createImmutable("");
RemoteObject _strmablaghtakhfifdaryafti = RemoteObject.createImmutable("");
RemoteObject _strtotalfaktor = RemoteObject.createImmutable("");
RemoteObject _strghabelepardakht = RemoteObject.createImmutable("");
RemoteObject _dr = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _rec3 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_faktor3_havale_type2");
 BA.debugLineNum = 373;BA.debugLine="Sub CreateReport2";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 378;BA.debugLine="Dim rec1 As cls_Faktor1_Havale_Type2";
Debug.ShouldStop(33554432);
_rec1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_faktor1_havale_type2");Debug.locals.put("rec1", _rec1);
 BA.debugLineNum = 379;BA.debugLine="Dim Date As String= MCode.Sf.Mid(MCode.DatePersia";
Debug.ShouldStop(67108864);
_date = RemoteObject.concat(act_printpic2.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic2.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("/"),act_printpic2.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic2.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),act_printpic2.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv5",(Object)(act_printpic2.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 380;BA.debugLine="Dim DateFactor As String= DateFactor";
Debug.ShouldStop(134217728);
act_printpic2._datefactor = act_printpic2._datefactor;
 BA.debugLineNum = 381;BA.debugLine="Dim Time As String=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(268435456);
_time = act_printpic2.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_printpic2.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 382;BA.debugLine="rec1.Initialize(MCode.C_Tafzili,MCode.N_Tafzili,M";
Debug.ShouldStop(536870912);
_rec1.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor1_havale_type2.class, "_initialize" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(act_printpic2.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._c_visitor /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._n_visitor /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._appname /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._shomarefaktor /*RemoteObject*/ ),(Object)(act_printpic2._datefactor),(Object)(_date),(Object)(_time),(Object)(act_printpic2.mostCurrent._mcode._tell_tafzili /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._address_tafzili /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._companyname /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._companytell /*RemoteObject*/ ),(Object)(act_printpic2.mostCurrent._mcode._companyaddress /*RemoteObject*/ ));
 BA.debugLineNum = 383;BA.debugLine="clv1.Add(rec1.Panel,0)";
Debug.ShouldStop(1073741824);
act_printpic2.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec1.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor1_havale_type2.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 389;BA.debugLine="Dim Radif As String";
Debug.ShouldStop(16);
_radif = RemoteObject.createImmutable("");Debug.locals.put("Radif", _radif);
 BA.debugLineNum = 390;BA.debugLine="Dim CodeKala As String";
Debug.ShouldStop(32);
_codekala = RemoteObject.createImmutable("");Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 391;BA.debugLine="Dim NameKala As String";
Debug.ShouldStop(64);
_namekala = RemoteObject.createImmutable("");Debug.locals.put("NameKala", _namekala);
 BA.debugLineNum = 392;BA.debugLine="Dim Fee As String";
Debug.ShouldStop(128);
_fee = RemoteObject.createImmutable("");Debug.locals.put("Fee", _fee);
 BA.debugLineNum = 393;BA.debugLine="Dim DarsadTakhfif As String";
Debug.ShouldStop(256);
_darsadtakhfif = RemoteObject.createImmutable("");Debug.locals.put("DarsadTakhfif", _darsadtakhfif);
 BA.debugLineNum = 394;BA.debugLine="Dim FeeTakhfif As String";
Debug.ShouldStop(512);
_feetakhfif = RemoteObject.createImmutable("");Debug.locals.put("FeeTakhfif", _feetakhfif);
 BA.debugLineNum = 395;BA.debugLine="Dim TedadJoze As String";
Debug.ShouldStop(1024);
_tedadjoze = RemoteObject.createImmutable("");Debug.locals.put("TedadJoze", _tedadjoze);
 BA.debugLineNum = 396;BA.debugLine="Dim TedadKol As String";
Debug.ShouldStop(2048);
_tedadkol = RemoteObject.createImmutable("");Debug.locals.put("TedadKol", _tedadkol);
 BA.debugLineNum = 397;BA.debugLine="Dim FeeYekKarton As String";
Debug.ShouldStop(4096);
_feeyekkarton = RemoteObject.createImmutable("");Debug.locals.put("FeeYekKarton", _feeyekkarton);
 BA.debugLineNum = 398;BA.debugLine="Dim SharhFactor As String";
Debug.ShouldStop(8192);
_sharhfactor = RemoteObject.createImmutable("");Debug.locals.put("SharhFactor", _sharhfactor);
 BA.debugLineNum = 400;BA.debugLine="Dim count As Int=0";
Debug.ShouldStop(32768);
_count = BA.numberCast(int.class, 0);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 402;BA.debugLine="Dim MablaghKhales As Long=0";
Debug.ShouldStop(131072);
_mablaghkhales = BA.numberCast(long.class, 0);Debug.locals.put("MablaghKhales", _mablaghkhales);Debug.locals.put("MablaghKhales", _mablaghkhales);
 BA.debugLineNum = 403;BA.debugLine="Dim MablaghTakhfif As Long=0";
Debug.ShouldStop(262144);
_mablaghtakhfif = BA.numberCast(long.class, 0);Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);
 BA.debugLineNum = 404;BA.debugLine="Dim MandeTalab As Long=0";
Debug.ShouldStop(524288);
_mandetalab = BA.numberCast(long.class, 0);Debug.locals.put("MandeTalab", _mandetalab);Debug.locals.put("MandeTalab", _mandetalab);
 BA.debugLineNum = 405;BA.debugLine="Dim MandeTasfieNashode As Long=0";
Debug.ShouldStop(1048576);
_mandetasfienashode = BA.numberCast(long.class, 0);Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);
 BA.debugLineNum = 406;BA.debugLine="Dim MablagheKolDaryafti As Long=0";
Debug.ShouldStop(2097152);
_mablaghekoldaryafti = BA.numberCast(long.class, 0);Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);
 BA.debugLineNum = 407;BA.debugLine="Dim MablaghTakhfifDaryafti As Long=0";
Debug.ShouldStop(4194304);
_mablaghtakhfifdaryafti = BA.numberCast(long.class, 0);Debug.locals.put("MablaghTakhfifDaryafti", _mablaghtakhfifdaryafti);Debug.locals.put("MablaghTakhfifDaryafti", _mablaghtakhfifdaryafti);
 BA.debugLineNum = 408;BA.debugLine="Dim TotalFaktor As Long=0";
Debug.ShouldStop(8388608);
_totalfaktor = BA.numberCast(long.class, 0);Debug.locals.put("TotalFaktor", _totalfaktor);Debug.locals.put("TotalFaktor", _totalfaktor);
 BA.debugLineNum = 409;BA.debugLine="Dim Signature As String";
Debug.ShouldStop(16777216);
_signature = RemoteObject.createImmutable("");Debug.locals.put("Signature", _signature);
 BA.debugLineNum = 410;BA.debugLine="Dim GHabelePardakht As Long=0";
Debug.ShouldStop(33554432);
_ghabelepardakht = BA.numberCast(long.class, 0);Debug.locals.put("GHabelePardakht", _ghabelepardakht);Debug.locals.put("GHabelePardakht", _ghabelepardakht);
 BA.debugLineNum = 415;BA.debugLine="For i=0 To Listkala.Size-1";
Debug.ShouldStop(1073741824);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {act_printpic2._listkala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 416;BA.debugLine="Dim item As AdapteRizFactorHavale=Listkala.Get(i";
Debug.ShouldStop(-2147483648);
_item = (act_printpic2._listkala.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 417;BA.debugLine="Radif=i+1";
Debug.ShouldStop(1);
_radif = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("Radif", _radif);
 BA.debugLineNum = 418;BA.debugLine="CodeKala=item.fldCodeKala";
Debug.ShouldStop(2);
_codekala = _item.getField(true,"fldCodeKala" /*RemoteObject*/ );Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 419;BA.debugLine="NameKala=item.fldSharhKala";
Debug.ShouldStop(4);
_namekala = _item.getField(true,"fldSharhKala" /*RemoteObject*/ );Debug.locals.put("NameKala", _namekala);
 BA.debugLineNum = 420;BA.debugLine="Fee=item.fldFeeJoz";
Debug.ShouldStop(8);
_fee = _item.getField(true,"fldFeeJoz" /*RemoteObject*/ );Debug.locals.put("Fee", _fee);
 BA.debugLineNum = 421;BA.debugLine="TedadJoze=item.fldTedadJoz";
Debug.ShouldStop(16);
_tedadjoze = _item.getField(true,"fldTedadJoz" /*RemoteObject*/ );Debug.locals.put("TedadJoze", _tedadjoze);
 BA.debugLineNum = 422;BA.debugLine="TedadKol=item.fldTedadCarton";
Debug.ShouldStop(32);
_tedadkol = _item.getField(true,"fldTedadCarton" /*RemoteObject*/ );Debug.locals.put("TedadKol", _tedadkol);
 BA.debugLineNum = 424;BA.debugLine="If  item.fldMablaghTakhfif>0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldMablaghTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 425;BA.debugLine="FeeTakhfif=item.fldMablaghTakhfif";
Debug.ShouldStop(256);
_feetakhfif = _item.getField(true,"fldMablaghTakhfif" /*RemoteObject*/ );Debug.locals.put("FeeTakhfif", _feetakhfif);
 }else {
 BA.debugLineNum = 428;BA.debugLine="FeeTakhfif=0";
Debug.ShouldStop(2048);
_feetakhfif = BA.NumberToString(0);Debug.locals.put("FeeTakhfif", _feetakhfif);
 };
 BA.debugLineNum = 430;BA.debugLine="If item.fldDarsadTakhfif=0 And item.fldDarsadTak";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 431;BA.debugLine="DarsadTakhfif=item.fldDarsadTakhfif";
Debug.ShouldStop(16384);
_darsadtakhfif = _item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ );Debug.locals.put("DarsadTakhfif", _darsadtakhfif);
 }else {
 BA.debugLineNum = 434;BA.debugLine="DarsadTakhfif=0";
Debug.ShouldStop(131072);
_darsadtakhfif = BA.NumberToString(0);Debug.locals.put("DarsadTakhfif", _darsadtakhfif);
 };
 BA.debugLineNum = 437;BA.debugLine="FeeYekKarton=item.fldFeeYekCarton";
Debug.ShouldStop(1048576);
_feeyekkarton = _item.getField(true,"fldFeeYekCarton" /*RemoteObject*/ );Debug.locals.put("FeeYekKarton", _feeyekkarton);
 BA.debugLineNum = 438;BA.debugLine="Signature=item.fldSignature";
Debug.ShouldStop(2097152);
_signature = _item.getField(true,"fldSignature" /*RemoteObject*/ );Debug.locals.put("Signature", _signature);
 BA.debugLineNum = 440;BA.debugLine="Dim rec2 As cls_Faktor2_Havale_Type2";
Debug.ShouldStop(8388608);
_rec2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_faktor2_havale_type2");Debug.locals.put("rec2", _rec2);
 BA.debugLineNum = 441;BA.debugLine="rec2.Initialize(Radif,CodeKala,NameKala,myCode.A";
Debug.ShouldStop(16777216);
_rec2.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor2_havale_type2.class, "_initialize" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(_radif),(Object)(_codekala),(Object)(_namekala),(Object)(act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(_fee))),(Object)(act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(_feeyekkarton))),(Object)(act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(_feetakhfif))),(Object)(_darsadtakhfif),(Object)(_tedadjoze),(Object)(_tedadkol));
 BA.debugLineNum = 442;BA.debugLine="SharhFactor=item.fldSharhFactor";
Debug.ShouldStop(33554432);
_sharhfactor = _item.getField(true,"fldSharhFactor" /*RemoteObject*/ );Debug.locals.put("SharhFactor", _sharhfactor);
 BA.debugLineNum = 443;BA.debugLine="clv1.Add(rec2.Panel,i)";
Debug.ShouldStop(67108864);
act_printpic2.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec2.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor2_havale_type2.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable((_i))));
 BA.debugLineNum = 446;BA.debugLine="MablaghKhales=MablaghKhales+item.fldMablaghKhale";
Debug.ShouldStop(536870912);
_mablaghkhales = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_mablaghkhales,BA.numberCast(double.class, _item.getField(true,"fldMablaghKhales" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("MablaghKhales", _mablaghkhales);
 BA.debugLineNum = 447;BA.debugLine="MablaghTakhfif=MablaghTakhfif+item.fldMablaghTak";
Debug.ShouldStop(1073741824);
_mablaghtakhfif = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_mablaghtakhfif,BA.numberCast(double.class, _item.getField(true,"fldMablaghTakhfif" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("MablaghTakhfif", _mablaghtakhfif);
 BA.debugLineNum = 448;BA.debugLine="MandeTalab=item.fldMandeTalab";
Debug.ShouldStop(-2147483648);
_mandetalab = BA.numberCast(long.class, _item.getField(true,"fldMandeTalab" /*RemoteObject*/ ));Debug.locals.put("MandeTalab", _mandetalab);
 BA.debugLineNum = 449;BA.debugLine="MandeTasfieNashode=item.fldMandeTasfieNashode";
Debug.ShouldStop(1);
_mandetasfienashode = BA.numberCast(long.class, _item.getField(true,"fldMandeTasfieNashode" /*RemoteObject*/ ));Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);
 BA.debugLineNum = 450;BA.debugLine="MablagheKolDaryafti=item.fldMablagheKolDaryafti";
Debug.ShouldStop(2);
_mablaghekoldaryafti = BA.numberCast(long.class, _item.getField(true,"fldMablagheKolDaryafti" /*RemoteObject*/ ));Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 453;BA.debugLine="TotalFaktor=MablaghKhales+MablaghTakhfif";
Debug.ShouldStop(16);
_totalfaktor = RemoteObject.solve(new RemoteObject[] {_mablaghkhales,_mablaghtakhfif}, "+",1, 2);Debug.locals.put("TotalFaktor", _totalfaktor);
 BA.debugLineNum = 454;BA.debugLine="Dim StrMablaghKhales As String=0";
Debug.ShouldStop(32);
_strmablaghkhales = BA.NumberToString(0);Debug.locals.put("StrMablaghKhales", _strmablaghkhales);Debug.locals.put("StrMablaghKhales", _strmablaghkhales);
 BA.debugLineNum = 455;BA.debugLine="Dim StrMablaghTakhfif As String=0";
Debug.ShouldStop(64);
_strmablaghtakhfif = BA.NumberToString(0);Debug.locals.put("StrMablaghTakhfif", _strmablaghtakhfif);Debug.locals.put("StrMablaghTakhfif", _strmablaghtakhfif);
 BA.debugLineNum = 456;BA.debugLine="Dim StrMandeTalab As String=0";
Debug.ShouldStop(128);
_strmandetalab = BA.NumberToString(0);Debug.locals.put("StrMandeTalab", _strmandetalab);Debug.locals.put("StrMandeTalab", _strmandetalab);
 BA.debugLineNum = 457;BA.debugLine="Dim StrMandeTasfieNashode As String=0";
Debug.ShouldStop(256);
_strmandetasfienashode = BA.NumberToString(0);Debug.locals.put("StrMandeTasfieNashode", _strmandetasfienashode);Debug.locals.put("StrMandeTasfieNashode", _strmandetasfienashode);
 BA.debugLineNum = 458;BA.debugLine="Dim StrMablagheKolDaryafti As String=0";
Debug.ShouldStop(512);
_strmablaghekoldaryafti = BA.NumberToString(0);Debug.locals.put("StrMablagheKolDaryafti", _strmablaghekoldaryafti);Debug.locals.put("StrMablagheKolDaryafti", _strmablaghekoldaryafti);
 BA.debugLineNum = 459;BA.debugLine="Dim StrMablaghTakhfifDaryafti As String=0";
Debug.ShouldStop(1024);
_strmablaghtakhfifdaryafti = BA.NumberToString(0);Debug.locals.put("StrMablaghTakhfifDaryafti", _strmablaghtakhfifdaryafti);Debug.locals.put("StrMablaghTakhfifDaryafti", _strmablaghtakhfifdaryafti);
 BA.debugLineNum = 460;BA.debugLine="Dim StrTotalFaktor As String=0";
Debug.ShouldStop(2048);
_strtotalfaktor = BA.NumberToString(0);Debug.locals.put("StrTotalFaktor", _strtotalfaktor);Debug.locals.put("StrTotalFaktor", _strtotalfaktor);
 BA.debugLineNum = 461;BA.debugLine="Dim StrGHabelePardakht As String=0";
Debug.ShouldStop(4096);
_strghabelepardakht = BA.NumberToString(0);Debug.locals.put("StrGHabelePardakht", _strghabelepardakht);Debug.locals.put("StrGHabelePardakht", _strghabelepardakht);
 BA.debugLineNum = 462;BA.debugLine="Dim dr As Cursor=MCode.Result(\"select * from TblD";
Debug.ShouldStop(8192);
_dr = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dr = act_printpic2.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblDaryaft where fldShomareFactor="),act_printpic2.mostCurrent._mcode._shomarefaktor /*RemoteObject*/ )));Debug.locals.put("dr", _dr);Debug.locals.put("dr", _dr);
 BA.debugLineNum = 463;BA.debugLine="If dr.RowCount>0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_dr.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 464;BA.debugLine="MablagheKolDaryafti=MCode.SingleResult(\"select s";
Debug.ShouldStop(32768);
_mablaghekoldaryafti = BA.numberCast(long.class, act_printpic2.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select sum(fldMablaghDaryafti) as fldMablaghDaryafti from TblDaryaft where fldType<>3 and fldShomareFactor="),act_printpic2.mostCurrent._mcode._shomarefaktor /*RemoteObject*/ ))));Debug.locals.put("MablagheKolDaryafti", _mablaghekoldaryafti);
 BA.debugLineNum = 465;BA.debugLine="MablaghTakhfifDaryafti=MCode.SingleResult(\"selec";
Debug.ShouldStop(65536);
_mablaghtakhfifdaryafti = BA.numberCast(long.class, act_printpic2.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select sum(FldMablaghTakhfif) as fldMablaghTakhfifDaryafti from TblDaryaft where fldType=3 and fldShomareFactor="),act_printpic2.mostCurrent._mcode._shomarefaktor /*RemoteObject*/ ))));Debug.locals.put("MablaghTakhfifDaryafti", _mablaghtakhfifdaryafti);
 BA.debugLineNum = 468;BA.debugLine="MandeTasfieNashode=MablaghKhales-MablagheKolDary";
Debug.ShouldStop(524288);
_mandetasfienashode = RemoteObject.solve(new RemoteObject[] {_mablaghkhales,_mablaghekoldaryafti}, "-",1, 2);Debug.locals.put("MandeTasfieNashode", _mandetasfienashode);
 BA.debugLineNum = 469;BA.debugLine="StrMablaghTakhfifDaryafti=NumberFormat(myCode.Is";
Debug.ShouldStop(1048576);
_strmablaghtakhfifdaryafti = RemoteObject.concat(act_printpic2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_printpic2.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghtakhfifdaryafti))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_printpic2.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("StrMablaghTakhfifDaryafti", _strmablaghtakhfifdaryafti);
 BA.debugLineNum = 470;BA.debugLine="StrGHabelePardakht = NumberFormat(myCode.Is_Null";
Debug.ShouldStop(2097152);
_strghabelepardakht = RemoteObject.concat(act_printpic2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_printpic2.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mandetalab))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_printpic2.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("StrGHabelePardakht", _strghabelepardakht);
 }else {
 BA.debugLineNum = 472;BA.debugLine="StrGHabelePardakht = NumberFormat(myCode.Is_Null";
Debug.ShouldStop(8388608);
_strghabelepardakht = RemoteObject.concat(act_printpic2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_printpic2.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghkhales))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),act_printpic2.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("StrGHabelePardakht", _strghabelepardakht);
 };
 BA.debugLineNum = 475;BA.debugLine="StrMablaghKhales = myCode.AdadToPrice(MablaghKhal";
Debug.ShouldStop(67108864);
_strmablaghkhales = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghkhales)));Debug.locals.put("StrMablaghKhales", _strmablaghkhales);
 BA.debugLineNum = 476;BA.debugLine="StrTotalFaktor = myCode.AdadToPrice(TotalFaktor)";
Debug.ShouldStop(134217728);
_strtotalfaktor = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_totalfaktor)));Debug.locals.put("StrTotalFaktor", _strtotalfaktor);
 BA.debugLineNum = 478;BA.debugLine="StrMablaghTakhfif = myCode.AdadToPrice(MablaghTak";
Debug.ShouldStop(536870912);
_strmablaghtakhfif = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghtakhfif)));Debug.locals.put("StrMablaghTakhfif", _strmablaghtakhfif);
 BA.debugLineNum = 479;BA.debugLine="StrMandeTalab = myCode.AdadToPrice(MandeTalab)";
Debug.ShouldStop(1073741824);
_strmandetalab = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mandetalab)));Debug.locals.put("StrMandeTalab", _strmandetalab);
 BA.debugLineNum = 480;BA.debugLine="StrMandeTasfieNashode = myCode.AdadToPrice(MandeT";
Debug.ShouldStop(-2147483648);
_strmandetasfienashode = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mandetasfienashode)));Debug.locals.put("StrMandeTasfieNashode", _strmandetasfienashode);
 BA.debugLineNum = 481;BA.debugLine="StrMablagheKolDaryafti = myCode.AdadToPrice(Mabla";
Debug.ShouldStop(1);
_strmablaghekoldaryafti = act_printpic2.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(BA.NumberToString(_mablaghekoldaryafti)));Debug.locals.put("StrMablagheKolDaryafti", _strmablaghekoldaryafti);
 BA.debugLineNum = 484;BA.debugLine="Dim rec3 As cls_Faktor3_Havale_Type2";
Debug.ShouldStop(8);
_rec3 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_faktor3_havale_type2");Debug.locals.put("rec3", _rec3);
 BA.debugLineNum = 485;BA.debugLine="rec3.Initialize(StrGHabelePardakht,StrMablaghKhal";
Debug.ShouldStop(16);
_rec3.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor3_havale_type2.class, "_initialize" /*RemoteObject*/ ,act_printpic2.mostCurrent.activityBA,(Object)(_strghabelepardakht),(Object)(_strmablaghkhales),(Object)(_strmablaghtakhfifdaryafti),(Object)(_strmandetasfienashode),(Object)(_strmablaghtakhfif),(Object)(_strmablaghekoldaryafti),(Object)(_strtotalfaktor),(Object)(_sharhfactor),(Object)(_signature));
 BA.debugLineNum = 487;BA.debugLine="clv1.Add(rec3.Panel,count+1)";
Debug.ShouldStop(64);
act_printpic2.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec3.runClassMethod (ir.parsikhesab.pakhsh.cls_faktor3_havale_type2.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Crop_Image (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,67);
if (RapidSub.canDelegate("crop_image")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","crop_image", _v, _left, _top, _width, _height);}
Debug.locals.put("V", _v);
Debug.locals.put("left", _left);
Debug.locals.put("top", _top);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 67;BA.debugLine="Sub Crop_Image(V As B4XView, left As Int, top As I";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="Return V.Snapshot.Crop(left, top, width, height)";
Debug.ShouldStop(16);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _v.runMethod(false,"Snapshot").runMethod(false,"Crop",(Object)(_left),(Object)(_top),(Object)(_width),(Object)(_height)).getObject());
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("GetBA (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,248);
if (RapidSub.canDelegate("getba")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","getba");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cls = RemoteObject.createImmutable("");
 BA.debugLineNum = 248;BA.debugLine="Sub GetBA As Object";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 249;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(16777216);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 250;BA.debugLine="Dim cls As String = Me";
Debug.ShouldStop(33554432);
_cls = BA.ObjectToString(act_printpic2.getObject());Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 251;BA.debugLine="cls = cls.SubString(\"class \".Length)";
Debug.ShouldStop(67108864);
_cls = _cls.runMethod(true,"substring",(Object)(RemoteObject.createImmutable("class ").runMethod(true,"length")));Debug.locals.put("cls", _cls);
 BA.debugLineNum = 252;BA.debugLine="jo.InitializeStatic(cls)";
Debug.ShouldStop(134217728);
_jo.runVoidMethod ("InitializeStatic",(Object)(_cls));
 BA.debugLineNum = 253;BA.debugLine="Return jo.GetField(\"processBA\")";
Debug.ShouldStop(268435456);
if (true) return _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("processBA")));
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private ion As Object";
act_printpic2.mostCurrent._ion = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 15;BA.debugLine="Private LblPrint As Label";
act_printpic2.mostCurrent._lblprint = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private ImageView1 As ImageView";
act_printpic2.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private clv1 As CustomListView";
act_printpic2.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 18;BA.debugLine="Private LblSettingBTPrinter As Label";
act_printpic2.mostCurrent._lblsettingbtprinter = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblprint_click() throws Exception{
try {
		Debug.PushSubsStack("LblPrint_Click (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,76);
if (RapidSub.canDelegate("lblprint_click")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","lblprint_click");}
 BA.debugLineNum = 76;BA.debugLine="Private Sub LblPrint_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="Select MCode.PrinterType";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(act_printpic2.mostCurrent._mcode._printertype /*RemoteObject*/ ,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 81;BA.debugLine="If Printer1.IsBluetoothOn = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",act_printpic2._printer1.runMethod(true,"_isbluetoothon"),act_printpic2.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 82;BA.debugLine="Msgbox(\"لطفا بلوتوث گوشی خود را فعال نمائید و";
Debug.ShouldStop(131072);
act_printpic2.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("لطفا بلوتوث گوشی خود را فعال نمائید و دستگاه پرینتر خود را انتخاب کنید.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),act_printpic2.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 83;BA.debugLine="Else If Printer1.IsConnected = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",act_printpic2._printer1.runMethod(true,"_isconnected"),act_printpic2.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 84;BA.debugLine="Printer1.Connect";
Debug.ShouldStop(524288);
act_printpic2._printer1.runVoidMethod ("_connect");
 }else {
 BA.debugLineNum = 86;BA.debugLine="PrintBluetooth";
Debug.ShouldStop(2097152);
_printbluetooth();
 }}
;
 break; }
case 1: {
 BA.debugLineNum = 91;BA.debugLine="PrintPos";
Debug.ShouldStop(67108864);
_printpos();
 break; }
}
;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("LblSettingBTPrinter_Click (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,72);
if (RapidSub.canDelegate("lblsettingbtprinter_click")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","lblsettingbtprinter_click");}
 BA.debugLineNum = 72;BA.debugLine="Private Sub LblSettingBTPrinter_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Printer1.Connect";
Debug.ShouldStop(256);
act_printpic2._printer1.runVoidMethod ("_connect");
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("LblShare_Click (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,47);
if (RapidSub.canDelegate("lblshare_click")) { ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","lblshare_click"); return;}
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
public ResumableSub_LblShare_Click(ir.parsikhesab.pakhsh.act_printpic2 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_printpic2 parent;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _pn = RemoteObject.declareNull("ir.cafetoseeh.PNMultipleSharing");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblShare_Click (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,47);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 48;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
Debug.ShouldStop(32768);
_filename = RemoteObject.concat(parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 50;BA.debugLine="Dim bmp As B4XBitmap = clv1.sv.ScrollViewInnerPan";
Debug.ShouldStop(131072);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = parent.mostCurrent._clv1.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(false,"Snapshot");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 51;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(262144);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 52;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
Debug.ShouldStop(524288);
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 53;BA.debugLine="bmp.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(1048576);
_bmp.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 54;BA.debugLine="out.Close";
Debug.ShouldStop(2097152);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 55;BA.debugLine="Sleep(200)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic2", "lblshare_click"),BA.numberCast(int.class, 200));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 56;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename));
 BA.debugLineNum = 57;BA.debugLine="Sleep(200)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic2", "lblshare_click"),BA.numberCast(int.class, 200));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
 BA.debugLineNum = 58;BA.debugLine="Try";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 59;BA.debugLine="Dim pn As PNMultipleSharing";
Debug.ShouldStop(67108864);
_pn = RemoteObject.createNew ("ir.cafetoseeh.PNMultipleSharing");Debug.locals.put("pn", _pn);
 BA.debugLineNum = 60;BA.debugLine="pn.ShareFileWithCaption(File.DirDefaultExternal,";
Debug.ShouldStop(134217728);
_pn.runVoidMethod ("ShareFileWithCaption",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename),(Object)(BA.ObjectToString("image/*")),(Object)(BA.ObjectToString("فاکتور ")),(Object)(RemoteObject.createImmutable("اشتراک گذاری")));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 62;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","554919183",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_printpic2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 63;BA.debugLine="ToastMessageShow(\"برنامه ای جهت اشتراک گذاری یاف";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برنامه ای جهت اشتراک گذاری یافت نشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_printpic2.processBA, e0.toString());}
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
public static void  _printbluetooth() throws Exception{
try {
		Debug.PushSubsStack("PrintBluetooth (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,101);
if (RapidSub.canDelegate("printbluetooth")) { ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","printbluetooth"); return;}
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
public ResumableSub_PrintBluetooth(ir.parsikhesab.pakhsh.act_printpic2 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_printpic2 parent;
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
		Debug.PushSubsStack("PrintBluetooth (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,101);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 102;BA.debugLine="Printer1.Reset";
Debug.ShouldStop(32);
parent._printer1.runVoidMethod ("_reset");
 BA.debugLineNum = 103;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
Debug.ShouldStop(64);
_filename = RemoteObject.concat(parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 105;BA.debugLine="Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPa";
Debug.ShouldStop(256);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp1 = parent.mostCurrent._clv1.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(false,"Snapshot");Debug.locals.put("bmp1", _bmp1);Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 106;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(512);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 107;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
Debug.ShouldStop(1024);
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 108;BA.debugLine="bmp1.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(2048);
_bmp1.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 109;BA.debugLine="out.Close";
Debug.ShouldStop(4096);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 110;BA.debugLine="Sleep(200)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic2", "printbluetooth"),BA.numberCast(int.class, 200));
this.state = 18;
return;
case 18:
//C
this.state = 1;
;
 BA.debugLineNum = 111;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename));
 BA.debugLineNum = 112;BA.debugLine="Sleep(200)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic2", "printbluetooth"),BA.numberCast(int.class, 200));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
 BA.debugLineNum = 114;BA.debugLine="Dim highdensity As Boolean = True";
Debug.ShouldStop(131072);
_highdensity = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("highdensity", _highdensity);Debug.locals.put("highdensity", _highdensity);
 BA.debugLineNum = 115;BA.debugLine="Dim dots24 As Boolean = True";
Debug.ShouldStop(262144);
_dots24 = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dots24", _dots24);Debug.locals.put("dots24", _dots24);
 BA.debugLineNum = 118;BA.debugLine="Dim LowXdpi As Int = 90";
Debug.ShouldStop(2097152);
_lowxdpi = BA.numberCast(int.class, 90);Debug.locals.put("LowXdpi", _lowxdpi);Debug.locals.put("LowXdpi", _lowxdpi);
 BA.debugLineNum = 119;BA.debugLine="Dim HighXdpi As Int = 180";
Debug.ShouldStop(4194304);
_highxdpi = BA.numberCast(int.class, 180);Debug.locals.put("HighXdpi", _highxdpi);Debug.locals.put("HighXdpi", _highxdpi);
 BA.debugLineNum = 121;BA.debugLine="Dim dots8Ydpi As Int = 60";
Debug.ShouldStop(16777216);
_dots8ydpi = BA.numberCast(int.class, 60);Debug.locals.put("dots8Ydpi", _dots8ydpi);Debug.locals.put("dots8Ydpi", _dots8ydpi);
 BA.debugLineNum = 122;BA.debugLine="Dim dots24Ydpi As Int = 180";
Debug.ShouldStop(33554432);
_dots24ydpi = BA.numberCast(int.class, 180);Debug.locals.put("dots24Ydpi", _dots24ydpi);Debug.locals.put("dots24Ydpi", _dots24ydpi);
 BA.debugLineNum = 125;BA.debugLine="Dim maxwidth As Int  = 288";
Debug.ShouldStop(268435456);
_maxwidth = BA.numberCast(int.class, 288);Debug.locals.put("maxwidth", _maxwidth);Debug.locals.put("maxwidth", _maxwidth);
 BA.debugLineNum = 126;BA.debugLine="Dim Xdpi As Int = LowXdpi";
Debug.ShouldStop(536870912);
_xdpi = _lowxdpi;Debug.locals.put("Xdpi", _xdpi);Debug.locals.put("Xdpi", _xdpi);
 BA.debugLineNum = 127;BA.debugLine="Dim Ydpi As Int = dots8Ydpi";
Debug.ShouldStop(1073741824);
_ydpi = _dots8ydpi;Debug.locals.put("Ydpi", _ydpi);Debug.locals.put("Ydpi", _ydpi);
 BA.debugLineNum = 128;BA.debugLine="Dim sliceheight As Int = 8";
Debug.ShouldStop(-2147483648);
_sliceheight = BA.numberCast(int.class, 8);Debug.locals.put("sliceheight", _sliceheight);Debug.locals.put("sliceheight", _sliceheight);
 BA.debugLineNum = 130;BA.debugLine="If highdensity Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 131;BA.debugLine="maxwidth = 288*2";
Debug.ShouldStop(4);
_maxwidth = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(288),RemoteObject.createImmutable(2)}, "*",0, 1);Debug.locals.put("maxwidth", _maxwidth);
 BA.debugLineNum = 132;BA.debugLine="Xdpi = HighXdpi";
Debug.ShouldStop(8);
_xdpi = _highxdpi;Debug.locals.put("Xdpi", _xdpi);
 if (true) break;
;
 BA.debugLineNum = 135;BA.debugLine="If dots24 Then";
Debug.ShouldStop(64);

case 4:
//if
this.state = 7;
if (_dots24.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 136;BA.debugLine="Ydpi = dots24Ydpi";
Debug.ShouldStop(128);
_ydpi = _dots24ydpi;Debug.locals.put("Ydpi", _ydpi);
 BA.debugLineNum = 137;BA.debugLine="sliceheight = 24";
Debug.ShouldStop(256);
_sliceheight = BA.numberCast(int.class, 24);Debug.locals.put("sliceheight", _sliceheight);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 140;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(2048);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 142;BA.debugLine="bmp.InitializeResize(File.DirDefaultExternal,file";
Debug.ShouldStop(8192);
_bmp.runVoidMethod ("InitializeResize",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename),(Object)(_maxwidth),(Object)(BA.numberCast(int.class, 3000)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 145;BA.debugLine="bmp = bmp.Resize(bmp.Width, bmp.Height * Ydpi / X";
Debug.ShouldStop(65536);
_bmp = _bmp.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, _bmp.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_ydpi,_xdpi}, "*/",0, 0))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 148;BA.debugLine="Dim myimage As AnImage = Printer1.ImageToBWIMage(";
Debug.ShouldStop(524288);
_myimage = parent._printer1.runMethod(false,"_imagetobwimage",(Object)(_bmp));Debug.locals.put("myimage", _myimage);Debug.locals.put("myimage", _myimage);
 BA.debugLineNum = 153;BA.debugLine="myimage = Printer1.DitherImage2D(myimage, 128)";
Debug.ShouldStop(16777216);
_myimage = parent._printer1.runMethod(false,"_ditherimage2d",(Object)(_myimage),(Object)(BA.numberCast(int.class, 128)));Debug.locals.put("myimage", _myimage);
 BA.debugLineNum = 157;BA.debugLine="Dim lastslice As Int = myimage.Height / sliceheig";
Debug.ShouldStop(268435456);
_lastslice = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_myimage.getField(true,"Height"),_sliceheight,RemoteObject.createImmutable(1)}, "/-",1, 0));Debug.locals.put("lastslice", _lastslice);Debug.locals.put("lastslice", _lastslice);
 BA.debugLineNum = 158;BA.debugLine="Dim excess As Int = myimage.Height * sliceheight";
Debug.ShouldStop(536870912);
_excess = RemoteObject.solve(new RemoteObject[] {_myimage.getField(true,"Height"),_sliceheight,_lastslice}, "*-",1, 1);Debug.locals.put("excess", _excess);Debug.locals.put("excess", _excess);
 BA.debugLineNum = 159;BA.debugLine="If excess > 0 Then lastslice = lastslice - 1";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 161;BA.debugLine="Printer1.LineSpacing = 0";
Debug.ShouldStop(1);
parent._printer1.runVoidMethod ("_setlinespacing",BA.numberCast(int.class, 0));
 BA.debugLineNum = 162;BA.debugLine="Printer1.WriteString(CRLF) ' to show the user som";
Debug.ShouldStop(2);
parent._printer1.runVoidMethod ("_writestring",(Object)(parent.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 163;BA.debugLine="For i = 0 To lastslice";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 164;BA.debugLine="Dim slice() As Byte = Printer1.PackImageSlice(my";
Debug.ShouldStop(8);
_slice = parent._printer1.runMethod(false,"_packimageslice",(Object)(_myimage),(Object)(BA.numberCast(int.class, _i)),(Object)(_dots24));Debug.locals.put("slice", _slice);Debug.locals.put("slice", _slice);
 BA.debugLineNum = 165;BA.debugLine="Printer1.PrintImage2(myimage.Width, slice, highd";
Debug.ShouldStop(16);
parent._printer1.runVoidMethod ("_printimage2",(Object)(_myimage.getField(true,"Width")),(Object)(_slice),(Object)(_highdensity),(Object)(_dots24));
 BA.debugLineNum = 166;BA.debugLine="Sleep(350)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic2", "printbluetooth"),BA.numberCast(int.class, 350));
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
 BA.debugLineNum = 168;BA.debugLine="Printer1.WriteString(CRLF  & CRLF & \"Ended\" & CRL";
Debug.ShouldStop(128);
parent._printer1.runVoidMethod ("_writestring",(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Ended"),parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent.__c.getField(true,"CRLF"))));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Printer_Terminated (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,213);
if (RapidSub.canDelegate("printer_terminated")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","printer_terminated");}
 BA.debugLineNum = 213;BA.debugLine="Private Sub Printer_Terminated";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="ToastMessageShow(\"Connection is terminated.\", Tru";
Debug.ShouldStop(2097152);
act_printpic2.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Connection is terminated.")),(Object)(act_printpic2.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Printer1_Connected (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,196);
if (RapidSub.canDelegate("printer1_connected")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","printer1_connected", _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 196;BA.debugLine="Sub Printer1_Connected (Success As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="If Success Then";
Debug.ShouldStop(16);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 198;BA.debugLine="ToastMessageShow(\"اتصال پرینتر برقرار شد\", False";
Debug.ShouldStop(32);
act_printpic2.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اتصال پرینتر برقرار شد")),(Object)(act_printpic2.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 199;BA.debugLine="LblSettingBTPrinter.Enabled=True";
Debug.ShouldStop(64);
act_printpic2.mostCurrent._lblsettingbtprinter.runMethod(true,"setEnabled",act_printpic2.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 201;BA.debugLine="Msgbox(Printer1.ConnectedErrorMsg, \"خطا در اتصال";
Debug.ShouldStop(256);
act_printpic2.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(act_printpic2._printer1.runMethod(true,"_connectederrormsg"))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("خطا در اتصال پرینتر."))),act_printpic2.mostCurrent.activityBA);
 };
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Printer1_Error (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,208);
if (RapidSub.canDelegate("printer1_error")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","printer1_error");}
 BA.debugLineNum = 208;BA.debugLine="Private Sub Printer1_Error";
Debug.ShouldStop(32768);
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Printer1_NewData (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,205);
if (RapidSub.canDelegate("printer1_newdata")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","printer1_newdata", _buffer);}
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 205;BA.debugLine="Private Sub Printer1_NewData (Buffer() As Byte)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("PrintPos (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,172);
if (RapidSub.canDelegate("printpos")) { ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","printpos"); return;}
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
public ResumableSub_PrintPos(ir.parsikhesab.pakhsh.act_printpic2 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_printpic2 parent;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _pathimage = RemoteObject.createImmutable("");
RemoteObject _intent = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrintPos (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,172);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 175;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
Debug.ShouldStop(16384);
_filename = RemoteObject.concat(parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 177;BA.debugLine="Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPa";
Debug.ShouldStop(65536);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp1 = parent.mostCurrent._clv1.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(false,"Snapshot");Debug.locals.put("bmp1", _bmp1);Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 178;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(131072);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 179;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
Debug.ShouldStop(262144);
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 180;BA.debugLine="bmp1.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(524288);
_bmp1.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 181;BA.debugLine="out.Close";
Debug.ShouldStop(1048576);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 182;BA.debugLine="Sleep(200)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic2", "printpos"),BA.numberCast(int.class, 200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 183;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename));
 BA.debugLineNum = 184;BA.debugLine="Sleep(200)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printpic2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printpic2", "printpos"),BA.numberCast(int.class, 200));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
 BA.debugLineNum = 185;BA.debugLine="Dim pathimage As String=File.Combine(File.DirDefa";
Debug.ShouldStop(16777216);
_pathimage = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename));Debug.locals.put("pathimage", _pathimage);Debug.locals.put("pathimage", _pathimage);
 BA.debugLineNum = 186;BA.debugLine="Dim intent As Intent";
Debug.ShouldStop(33554432);
_intent = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("intent", _intent);
 BA.debugLineNum = 187;BA.debugLine="intent.Initialize(\"Print\", \"\")";
Debug.ShouldStop(67108864);
_intent.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("Print")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 188;BA.debugLine="intent.SetComponent(MCode.PackageNamePosParsian &";
Debug.ShouldStop(134217728);
_intent.runVoidMethod ("SetComponent",(Object)(RemoteObject.concat(parent.mostCurrent._mcode._packagenameposparsian /*RemoteObject*/ ,RemoteObject.createImmutable("/.MyJavaService"))));
 BA.debugLineNum = 190;BA.debugLine="intent.PutExtra(\"imagepath\", pathimage) ' ارسال د";
Debug.ShouldStop(536870912);
_intent.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("imagepath")),(Object)((_pathimage)));
 BA.debugLineNum = 191;BA.debugLine="intent.PutExtra(\"CompanyName\", \"Parsik\") ' ارسال";
Debug.ShouldStop(1073741824);
_intent.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("CompanyName")),(Object)((RemoteObject.createImmutable("Parsik"))));
 BA.debugLineNum = 192;BA.debugLine="StartService(intent)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("StartService",act_printpic2.processBA,(Object)((_intent.getObject())));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim Listkala As List";
act_printpic2._listkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 8;BA.debugLine="Dim DateFactor As String";
act_printpic2._datefactor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim TypePrint As Int";
act_printpic2._typeprint = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 10;BA.debugLine="Dim Printer1 As EscPosPrinter";
act_printpic2._printer1 = RemoteObject.createNew ("uk.agraham.bluetoothprinter.escposprinter");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _startactivityforresult(RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("StartActivityForResult (act_printpic2) ","act_printpic2",28,act_printpic2.mostCurrent.activityBA,act_printpic2.mostCurrent,242);
if (RapidSub.canDelegate("startactivityforresult")) { return ir.parsikhesab.pakhsh.act_printpic2.remoteMe.runUserSub(false, "act_printpic2","startactivityforresult", _i);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("i", _i);
 BA.debugLineNum = 242;BA.debugLine="Sub StartActivityForResult(i As Intent)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="Dim jo As JavaObject = GetBA";
Debug.ShouldStop(262144);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _getba());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 244;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
Debug.ShouldStop(524288);
act_printpic2.mostCurrent._ion = _jo.runMethod(false,"CreateEvent",act_printpic2.processBA,(Object)(BA.ObjectToString("anywheresoftware.b4a.IOnActivityResult")),(Object)(BA.ObjectToString("ion")),(Object)(act_printpic2.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 245;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
Debug.ShouldStop(1048576);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startActivityForResult")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {act_printpic2.mostCurrent._ion,(_i.getObject())})));
 BA.debugLineNum = 246;BA.debugLine="End Sub";
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