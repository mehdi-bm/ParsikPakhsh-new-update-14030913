package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clskala_subs_0 {


public static RemoteObject  _initialize(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clskala) ","clskala",92,_ba,clskala.mostCurrent,10);
if (RapidSub.canDelegate("initialize")) { return ir.parsikhesab.pakhsh.clskala.remoteMe.runUserSub(false, "clskala","initialize", _ba);}
;
 BA.debugLineNum = 10;BA.debugLine="Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="OrginalListKala.Initialize";
Debug.ShouldStop(1024);
clskala._orginallistkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim OrginalListKala As List";
clskala._orginallistkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _selectfordefaultkalalist(RemoteObject _ba,RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("SelectForDefaultKalaList (clskala) ","clskala",92,_ba,clskala.mostCurrent,14);
if (RapidSub.canDelegate("selectfordefaultkalalist")) { return ir.parsikhesab.pakhsh.clskala.remoteMe.runUserSub(false, "clskala","selectfordefaultkalalist", _ba, _query);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _itemkala = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _fee = RemoteObject.createImmutable("");
RemoteObject _c = RemoteObject.createImmutable(0L);
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _fldfeeforoosh = RemoteObject.createImmutable(0);
RemoteObject _fldtedaddarkarton = RemoteObject.createImmutable(0);
RemoteObject _summande = RemoteObject.createImmutable(0);
;
Debug.locals.put("query", _query);
 BA.debugLineNum = 14;BA.debugLine="Sub SelectForDefaultKalaList(query As String) As L";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="Dim Cu As Cursor = MCode.Result(query)";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = clskala.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,_ba,(Object)(_query));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 17;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 19;BA.debugLine="For i = 0 To Cu.RowCount - 1";
Debug.ShouldStop(262144);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 20;BA.debugLine="Dim ItemKala As AdapterListKala";
Debug.ShouldStop(524288);
_itemkala = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");Debug.locals.put("ItemKala", _itemkala);
 BA.debugLineNum = 21;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(1048576);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 22;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
Debug.ShouldStop(2097152);
_itemkala.setField ("CodeKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeKala"))));
 BA.debugLineNum = 23;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
Debug.ShouldStop(4194304);
_itemkala.setField ("NameKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameKala"))));
 BA.debugLineNum = 24;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\")";
Debug.ShouldStop(8388608);
_itemkala.setField ("NameVahed" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed"))));
 BA.debugLineNum = 25;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed2\"";
Debug.ShouldStop(16777216);
_itemkala.setField ("NameVahed2" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))));
 BA.debugLineNum = 26;BA.debugLine="ItemKala.fldSharh=Cu.Getstring(\"fldSharh\")";
Debug.ShouldStop(33554432);
_itemkala.setField ("fldSharh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh"))));
 BA.debugLineNum = 27;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
Debug.ShouldStop(67108864);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));
 BA.debugLineNum = 28;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTedadD";
Debug.ShouldStop(134217728);
_itemkala.setField ("TedadDarKarton" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))));
 BA.debugLineNum = 29;BA.debugLine="Dim fee As String";
Debug.ShouldStop(268435456);
_fee = RemoteObject.createImmutable("");Debug.locals.put("fee", _fee);
 BA.debugLineNum = 30;BA.debugLine="If MCode.feeTip=0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",clskala.mostCurrent._mcode._feetip /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 31;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(1073741824);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 }else {
 BA.debugLineNum = 35;BA.debugLine="fee=myCode.Is_Null_adad(Cu.GetString(\"fldFeeTas";
Debug.ShouldStop(4);
_fee = clskala.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeTasvie")))));Debug.locals.put("fee", _fee);
 BA.debugLineNum = 37;BA.debugLine="If 	IsNumber(fee) And fee>0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(".",clskala.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_fee))) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _fee),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 38;BA.debugLine="Log(Cu.GetString(\"fldFeeTasvie\"))";
Debug.ShouldStop(32);
clskala.mostCurrent.__c.runVoidMethod ("LogImpl","5112525336",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeTasvie"))),0);
 BA.debugLineNum = 40;BA.debugLine="If  fee>Cu.GetString(\"fldFeeBadAzTakhfif\") The";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _fee),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif")))))) { 
 BA.debugLineNum = 42;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(512);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 }else 
{ BA.debugLineNum = 43;BA.debugLine="Else if fee<Cu.GetString(\"fldFeeBadAzTakhfif\")";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _fee),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif")))))) { 
 BA.debugLineNum = 44;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee";
Debug.ShouldStop(2048);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_fee);
 BA.debugLineNum = 45;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(4096);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 }else {
 BA.debugLineNum = 49;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fld";
Debug.ShouldStop(65536);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 BA.debugLineNum = 50;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(131072);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 }}
;
 }else {
 BA.debugLineNum = 54;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(2097152);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 };
 };
 BA.debugLineNum = 66;BA.debugLine="fee=MCode.GetUpdateFeeSabad(fee,ItemKala.CodeKal";
Debug.ShouldStop(2);
_fee = clskala.mostCurrent._mcode.runMethod(true,"_getupdatefeesabad" /*RemoteObject*/ ,_ba,(Object)(_fee),(Object)(_itemkala.getField(true,"CodeKala" /*RemoteObject*/ )));Debug.locals.put("fee", _fee);
 BA.debugLineNum = 70;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))))) { 
 BA.debugLineNum = 72;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fldFe";
Debug.ShouldStop(128);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 }else {
 BA.debugLineNum = 76;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(2048);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 };
 BA.debugLineNum = 79;BA.debugLine="If ItemKala.MablaghTakhfif>0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 80;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.Mablag";
Debug.ShouldStop(32768);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fee),_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 };
 BA.debugLineNum = 83;BA.debugLine="ItemKala.FeeForoosh=fee";
Debug.ShouldStop(262144);
_itemkala.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _fee));
 BA.debugLineNum = 86;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString(\"f";
Debug.ShouldStop(2097152);
_itemkala.setField ("FldMablaghMasrafKonande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldGhymatMasrafkonande"))));
 BA.debugLineNum = 89;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
Debug.ShouldStop(16777216);
_itemkala.setField ("fldPathPic" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))));
 BA.debugLineNum = 90;BA.debugLine="Dim c As Long=MCode.SingleResult(\"select count(F";
Debug.ShouldStop(33554432);
_c = BA.numberCast(long.class, clskala.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,_ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select count(FldCodeKala) as count from TblSabad where FldCodeKala="),_itemkala.getField(true,"CodeKala" /*RemoteObject*/ )))));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 91;BA.debugLine="If c>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_c,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 92;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select * from T";
Debug.ShouldStop(134217728);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = clskala.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,_ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblSabad where FldCodeKala="),_itemkala.getField(true,"CodeKala" /*RemoteObject*/ ))));Debug.locals.put("cu1", _cu1);Debug.locals.put("cu1", _cu1);
 BA.debugLineNum = 93;BA.debugLine="If cu1.RowCount>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 94;BA.debugLine="cu1.Position=0";
Debug.ShouldStop(536870912);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 96;BA.debugLine="ItemKala.TedadDarSabadJoz =cu1.Getstring(\"FldT";
Debug.ShouldStop(-2147483648);
_itemkala.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))));
 BA.debugLineNum = 97;BA.debugLine="ItemKala.TedadDarSabadKol =cu1.Getstring(\"FldT";
Debug.ShouldStop(1);
_itemkala.setField ("TedadDarSabadKol" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))));
 BA.debugLineNum = 98;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")-cu1";
Debug.ShouldStop(2);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande")))),BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))))}, "-",1, 0)));
 BA.debugLineNum = 99;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 100;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Ge";
Debug.ShouldStop(8);
_fldfeeforoosh = BA.numberCast(int.class, clskala.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 101;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(c";
Debug.ShouldStop(16);
_fldtedaddarkarton = BA.numberCast(int.class, clskala.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 102;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\"";
Debug.ShouldStop(32);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 103;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fld";
Debug.ShouldStop(64);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 104;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fl";
Debug.ShouldStop(128);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(clskala.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0)))));
 };
 BA.debugLineNum = 108;BA.debugLine="ItemKala.FldEshantion=cu1.Getstring(\"FldEshant";
Debug.ShouldStop(2048);
_itemkala.setField ("FldEshantion" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion"))));
 BA.debugLineNum = 110;BA.debugLine="If	MCode.TakhfifKala=\"1\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",clskala.mostCurrent._mcode._takhfifkala /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 113;BA.debugLine="If cu1.GetString(\"FldMablaghTakhfif\")>0 And c";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif")))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("N",_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif"))))) { 
 BA.debugLineNum = 115;BA.debugLine="ItemKala.fldDarsadTakhfif=cu1.GetString(\"Fld";
Debug.ShouldStop(262144);
_itemkala.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif"))));
 BA.debugLineNum = 116;BA.debugLine="ItemKala.MablaghTakhfif=cu1.GetString(\"FldMa";
Debug.ShouldStop(524288);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif")))));
 }else {
 BA.debugLineNum = 120;BA.debugLine="ItemKala.MablaghTakhfif=\"0\"";
Debug.ShouldStop(8388608);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, "0"));
 };
 };
 };
 BA.debugLineNum = 126;BA.debugLine="cu1.Close";
Debug.ShouldStop(536870912);
_cu1.runVoidMethod ("Close");
 };
 BA.debugLineNum = 129;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\"  Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 130;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetI";
Debug.ShouldStop(2);
_fldfeeforoosh = BA.numberCast(int.class, clskala.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 131;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.";
Debug.ShouldStop(4);
_fldtedaddarkarton = BA.numberCast(int.class, clskala.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 132;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\")";
Debug.ShouldStop(8);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 133;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * FldTe";
Debug.ShouldStop(16);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 134;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / FldT";
Debug.ShouldStop(32);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(clskala.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0)))));
 };
 BA.debugLineNum = 139;BA.debugLine="OrginalListKala.Add(ItemKala)";
Debug.ShouldStop(1024);
clskala._orginallistkala.runVoidMethod ("Add",(Object)((_itemkala)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 145;BA.debugLine="Cu.Close";
Debug.ShouldStop(65536);
_cu.runVoidMethod ("Close");
 BA.debugLineNum = 146;BA.debugLine="Return OrginalListKala";
Debug.ShouldStop(131072);
if (true) return clskala._orginallistkala;
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}