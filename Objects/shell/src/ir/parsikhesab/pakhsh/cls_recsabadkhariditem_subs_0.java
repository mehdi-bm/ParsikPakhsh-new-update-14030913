package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_recsabadkhariditem_subs_0 {


public static RemoteObject  _addeshantion(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("AddEshantion (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,433);
if (RapidSub.canDelegate("addeshantion")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","addeshantion", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 433;BA.debugLine="Sub AddEshantion(t As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addeshantion2(RemoteObject __ref,RemoteObject _itemsabad) throws Exception{
try {
		Debug.PushSubsStack("AddEshantion2 (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,473);
if (RapidSub.canDelegate("addeshantion2")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","addeshantion2", __ref, _itemsabad);}
RemoteObject _codekala = RemoteObject.createImmutable("");
RemoteObject _tedaddarkarton = RemoteObject.createImmutable("");
RemoteObject _fldtedaddarsabadjoz = RemoteObject.createImmutable("");
RemoteObject _fldtedaddarsabadkol = RemoteObject.createImmutable("");
RemoteObject _eshantion = RemoteObject.createImmutable("");
RemoteObject _tedadsabad = RemoteObject.createImmutable("");
RemoteObject _tedadkol = RemoteObject.createImmutable(0);
RemoteObject _listeshantion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itemmax = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantion");
RemoteObject _fldtedadforooshmax = RemoteObject.createImmutable(0);
RemoteObject _fldtedadeshantionmax = RemoteObject.createImmutable(0);
RemoteObject _tedadeshantion = RemoteObject.createImmutable("");
RemoteObject _codekalaeshantation = RemoteObject.createImmutable("");
RemoteObject _u = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _item1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantion");
RemoteObject _fldtedadforoosh = RemoteObject.createImmutable(0);
RemoteObject _fldtedadeshantion = RemoteObject.createImmutable(0);
RemoteObject _query = RemoteObject.createImmutable("");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recdefultkala");
int _j = 0;
Debug.locals.put("ItemSabad", _itemsabad);
 BA.debugLineNum = 473;BA.debugLine="Sub AddEshantion2(ItemSabad As Cursor)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 474;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 475;BA.debugLine="Dim CodeKala As String =ItemSabad.GetString(\"Fld";
Debug.ShouldStop(67108864);
_codekala = _itemsabad.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")));Debug.locals.put("CodeKala", _codekala);Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 476;BA.debugLine="Dim TedadDarKarton As String =myCode.Is_Null_ada";
Debug.ShouldStop(134217728);
_tedaddarkarton = cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_itemsabad.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarKarton")))));Debug.locals.put("TedadDarKarton", _tedaddarkarton);Debug.locals.put("TedadDarKarton", _tedaddarkarton);
 BA.debugLineNum = 477;BA.debugLine="Dim FldTedadDarSabadJoz As String =myCode.Is_Nul";
Debug.ShouldStop(268435456);
_fldtedaddarsabadjoz = cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_itemsabad.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz")))));Debug.locals.put("FldTedadDarSabadJoz", _fldtedaddarsabadjoz);Debug.locals.put("FldTedadDarSabadJoz", _fldtedaddarsabadjoz);
 BA.debugLineNum = 478;BA.debugLine="Dim FldTedadDarSabadKol As String =myCode.Is_Nul";
Debug.ShouldStop(536870912);
_fldtedaddarsabadkol = cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_itemsabad.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol")))));Debug.locals.put("FldTedadDarSabadKol", _fldtedaddarsabadkol);Debug.locals.put("FldTedadDarSabadKol", _fldtedaddarsabadkol);
 BA.debugLineNum = 479;BA.debugLine="Dim Eshantion As String= ItemSabad.GetString(\"Fl";
Debug.ShouldStop(1073741824);
_eshantion = _itemsabad.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion")));Debug.locals.put("Eshantion", _eshantion);Debug.locals.put("Eshantion", _eshantion);
 BA.debugLineNum = 480;BA.debugLine="Dim TedadSabad As String=0";
Debug.ShouldStop(-2147483648);
_tedadsabad = BA.NumberToString(0);Debug.locals.put("TedadSabad", _tedadsabad);Debug.locals.put("TedadSabad", _tedadsabad);
 BA.debugLineNum = 481;BA.debugLine="If TedadDarKarton>0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedaddarkarton),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 482;BA.debugLine="Dim tedadKol As Int=(TedadDarKarton*FldTedadDar";
Debug.ShouldStop(2);
_tedadkol = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedaddarkarton),BA.numberCast(double.class, _fldtedaddarsabadkol)}, "*",0, 0)));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 483;BA.debugLine="TedadSabad=tedadKol+FldTedadDarSabadJoz";
Debug.ShouldStop(4);
_tedadsabad = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_tedadkol,BA.numberCast(double.class, _fldtedaddarsabadjoz)}, "+",1, 0));Debug.locals.put("TedadSabad", _tedadsabad);
 }else {
 BA.debugLineNum = 485;BA.debugLine="TedadSabad=FldTedadDarSabadJoz";
Debug.ShouldStop(16);
_tedadsabad = _fldtedaddarsabadjoz;Debug.locals.put("TedadSabad", _tedadsabad);
 };
 BA.debugLineNum = 487;BA.debugLine="Dim ListEshantion As List";
Debug.ShouldStop(64);
_listeshantion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListEshantion", _listeshantion);
 BA.debugLineNum = 488;BA.debugLine="ListEshantion.Initialize";
Debug.ShouldStop(128);
_listeshantion.runVoidMethod ("Initialize");
 BA.debugLineNum = 489;BA.debugLine="ListEshantion=MCode.LoadEshantionTabaghati(CodeK";
Debug.ShouldStop(256);
_listeshantion = cls_recsabadkhariditem._mcode.runMethod(false,"_loadeshantiontabaghati" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_codekala));Debug.locals.put("ListEshantion", _listeshantion);
 BA.debugLineNum = 490;BA.debugLine="If ListEshantion.Size>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_listeshantion.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 491;BA.debugLine="Dim ItemMax = ListEshantion.Get(ListEshantion.S";
Debug.ShouldStop(1024);
_itemmax = (_listeshantion.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_listeshantion.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("ItemMax", _itemmax);Debug.locals.put("ItemMax", _itemmax);
 BA.debugLineNum = 492;BA.debugLine="Dim fldTedadForooshMax As Int=ItemMax.fldTedadF";
Debug.ShouldStop(2048);
_fldtedadforooshmax = BA.numberCast(int.class, _itemmax.getField(true,"fldTedadForoosh" /*RemoteObject*/ ));Debug.locals.put("fldTedadForooshMax", _fldtedadforooshmax);Debug.locals.put("fldTedadForooshMax", _fldtedadforooshmax);
 BA.debugLineNum = 493;BA.debugLine="Dim fldTedadEshantionMax As Int=ItemMax.fldTeda";
Debug.ShouldStop(4096);
_fldtedadeshantionmax = BA.numberCast(int.class, _itemmax.getField(true,"fldTedadEshantion" /*RemoteObject*/ ));Debug.locals.put("fldTedadEshantionMax", _fldtedadeshantionmax);Debug.locals.put("fldTedadEshantionMax", _fldtedadeshantionmax);
 BA.debugLineNum = 494;BA.debugLine="Dim TedadEshantion As String";
Debug.ShouldStop(8192);
_tedadeshantion = RemoteObject.createImmutable("");Debug.locals.put("TedadEshantion", _tedadeshantion);
 BA.debugLineNum = 495;BA.debugLine="Dim CodeKalaEshantation As String=0";
Debug.ShouldStop(16384);
_codekalaeshantation = BA.NumberToString(0);Debug.locals.put("CodeKalaEshantation", _codekalaeshantation);Debug.locals.put("CodeKalaEshantation", _codekalaeshantation);
 BA.debugLineNum = 496;BA.debugLine="CodeKalaEshantation=ItemMax.fldCodeKalaEshantio";
Debug.ShouldStop(32768);
_codekalaeshantation = _itemmax.getField(true,"fldCodeKalaEshantion" /*RemoteObject*/ );Debug.locals.put("CodeKalaEshantation", _codekalaeshantation);
 BA.debugLineNum = 497;BA.debugLine="If TedadSabad=fldTedadForooshMax Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_tedadsabad,BA.NumberToString(_fldtedadforooshmax))) { 
 BA.debugLineNum = 498;BA.debugLine="TedadEshantion=fldTedadEshantionMax";
Debug.ShouldStop(131072);
_tedadeshantion = BA.NumberToString(_fldtedadeshantionmax);Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 499;BA.debugLine="else if TedadSabad > fldTedadForooshMax Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforooshmax))) { 
 BA.debugLineNum = 500;BA.debugLine="Dim u As Int=0";
Debug.ShouldStop(524288);
_u = BA.numberCast(int.class, 0);Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 501;BA.debugLine="u=(TedadSabad/fldTedadForooshMax)";
Debug.ShouldStop(1048576);
_u = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadsabad),_fldtedadforooshmax}, "/",0, 0)));Debug.locals.put("u", _u);
 BA.debugLineNum = 502;BA.debugLine="TedadEshantion=u*fldTedadEshantionMax";
Debug.ShouldStop(2097152);
_tedadeshantion = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_u,_fldtedadeshantionmax}, "*",0, 1));Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 503;BA.debugLine="Else If TedadSabad < fldTedadForooshMax Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforooshmax))) { 
 BA.debugLineNum = 504;BA.debugLine="For i=0 To ListEshantion.Size-2";
Debug.ShouldStop(8388608);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_listeshantion.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 505;BA.debugLine="Dim item1 = ListEshantion.Get(i) As AdapterLi";
Debug.ShouldStop(16777216);
_item1 = (_listeshantion.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item1", _item1);Debug.locals.put("item1", _item1);
 BA.debugLineNum = 506;BA.debugLine="Log(item1.fldCodeKalaForoosh)";
Debug.ShouldStop(33554432);
cls_recsabadkhariditem.__c.runVoidMethod ("LogImpl","5106496033",_item1.getField(true,"fldCodeKalaForoosh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 507;BA.debugLine="Log(item1.fldCodeKalaEshantion)";
Debug.ShouldStop(67108864);
cls_recsabadkhariditem.__c.runVoidMethod ("LogImpl","5106496034",_item1.getField(true,"fldCodeKalaEshantion" /*RemoteObject*/ ),0);
 BA.debugLineNum = 508;BA.debugLine="Dim fldTedadForoosh As Int=item1.fldTedadForo";
Debug.ShouldStop(134217728);
_fldtedadforoosh = BA.numberCast(int.class, _item1.getField(true,"fldTedadForoosh" /*RemoteObject*/ ));Debug.locals.put("fldTedadForoosh", _fldtedadforoosh);Debug.locals.put("fldTedadForoosh", _fldtedadforoosh);
 BA.debugLineNum = 509;BA.debugLine="Dim fldTedadEshantion As Int=item1.fldTedadEs";
Debug.ShouldStop(268435456);
_fldtedadeshantion = BA.numberCast(int.class, _item1.getField(true,"fldTedadEshantion" /*RemoteObject*/ ));Debug.locals.put("fldTedadEshantion", _fldtedadeshantion);Debug.locals.put("fldTedadEshantion", _fldtedadeshantion);
 BA.debugLineNum = 510;BA.debugLine="CodeKalaEshantation=item1.fldCodeKalaEshantio";
Debug.ShouldStop(536870912);
_codekalaeshantation = _item1.getField(true,"fldCodeKalaEshantion" /*RemoteObject*/ );Debug.locals.put("CodeKalaEshantation", _codekalaeshantation);
 BA.debugLineNum = 511;BA.debugLine="Log(fldTedadForoosh)";
Debug.ShouldStop(1073741824);
cls_recsabadkhariditem.__c.runVoidMethod ("LogImpl","5106496038",BA.NumberToString(_fldtedadforoosh),0);
 BA.debugLineNum = 512;BA.debugLine="Log(item1.fldTedadEshantion)";
Debug.ShouldStop(-2147483648);
cls_recsabadkhariditem.__c.runVoidMethod ("LogImpl","5106496039",_item1.getField(true,"fldTedadEshantion" /*RemoteObject*/ ),0);
 BA.debugLineNum = 513;BA.debugLine="If TedadSabad= fldTedadForoosh Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_tedadsabad,BA.NumberToString(_fldtedadforoosh))) { 
 BA.debugLineNum = 514;BA.debugLine="TedadEshantion=fldTedadEshantion";
Debug.ShouldStop(2);
_tedadeshantion = BA.NumberToString(_fldtedadeshantion);Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 515;BA.debugLine="else if TedadSabad>fldTedadForoosh Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforoosh))) { 
 BA.debugLineNum = 516;BA.debugLine="Dim u As Int=0";
Debug.ShouldStop(8);
_u = BA.numberCast(int.class, 0);Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 517;BA.debugLine="u=(TedadSabad/fldTedadForoosh)";
Debug.ShouldStop(16);
_u = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadsabad),_fldtedadforoosh}, "/",0, 0)));Debug.locals.put("u", _u);
 BA.debugLineNum = 518;BA.debugLine="TedadEshantion=u*fldTedadEshantion";
Debug.ShouldStop(32);
_tedadeshantion = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_u,_fldtedadeshantion}, "*",0, 1));Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 519;BA.debugLine="else if TedadSabad<fldTedadForoosh Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforoosh))) { 
 BA.debugLineNum = 520;BA.debugLine="TedadEshantion=0";
Debug.ShouldStop(128);
_tedadeshantion = BA.NumberToString(0);Debug.locals.put("TedadEshantion", _tedadeshantion);
 }}}
;
 }
}Debug.locals.put("i", _i);
;
 }}}
;
 BA.debugLineNum = 524;BA.debugLine="If TedadEshantion>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadeshantion),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 526;BA.debugLine="Dim Query As String=\"select * from TblKala whe";
Debug.ShouldStop(8192);
_query = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeKala="),_codekalaeshantation);Debug.locals.put("Query", _query);Debug.locals.put("Query", _query);
 BA.debugLineNum = 527;BA.debugLine="Dim lst As List";
Debug.ShouldStop(16384);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 528;BA.debugLine="lst.Initialize";
Debug.ShouldStop(32768);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 529;BA.debugLine="lst=MCode.LoadListKala(Query)";
Debug.ShouldStop(65536);
_lst = cls_recsabadkhariditem._mcode.runMethod(false,"_loadlistkala" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_query));Debug.locals.put("lst", _lst);
 BA.debugLineNum = 530;BA.debugLine="Dim item2 = lst.Get(0) As AdapterListKala";
Debug.ShouldStop(131072);
_item2 = (_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("item2", _item2);Debug.locals.put("item2", _item2);
 BA.debugLineNum = 531;BA.debugLine="Dim rec As CLs_RecDefultKala";
Debug.ShouldStop(262144);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recdefultkala");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 532;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(524288);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 533;BA.debugLine="rec.Show(item2,0)";
Debug.ShouldStop(1048576);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_show" /*void*/ ,(Object)(_item2),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 534;BA.debugLine="item2.TedadDarSabadJoz=0";
Debug.ShouldStop(2097152);
_item2.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 535;BA.debugLine="item2.TedadDarSabadKol=0";
Debug.ShouldStop(4194304);
_item2.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 536;BA.debugLine="item2.fldCountEshantion=TedadEshantion";
Debug.ShouldStop(8388608);
_item2.setField ("fldCountEshantion" /*RemoteObject*/ ,_tedadeshantion);
 BA.debugLineNum = 538;BA.debugLine="For j=0 To TedadEshantion-1";
Debug.ShouldStop(33554432);
{
final int step63 = 1;
final int limit63 = (int) (0 + RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadeshantion),RemoteObject.createImmutable(1)}, "-",1, 0).<Double>get().doubleValue());
_j = 0 ;
for (;(step63 > 0 && _j <= limit63) || (step63 < 0 && _j >= limit63) ;_j = ((int)(0 + _j + step63))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 539;BA.debugLine="rec.BtnUpEshan_Click";
Debug.ShouldStop(67108864);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_btnupeshan_click" /*RemoteObject*/ );
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 542;BA.debugLine="MCode.AddToSabad(item2)";
Debug.ShouldStop(536870912);
cls_recsabadkhariditem._mcode.runVoidMethod ("_addtosabad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item2));
 };
 BA.debugLineNum = 546;BA.debugLine="CallSubDelayed(Act_Sabad,\"LoadListSabad\")";
Debug.ShouldStop(2);
cls_recsabadkhariditem.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((cls_recsabadkhariditem._act_sabad.getObject())),(Object)(RemoteObject.createImmutable("LoadListSabad")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e71) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e71.toString()); BA.debugLineNum = 550;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
cls_recsabadkhariditem.__c.runVoidMethod ("LogImpl","5106496077",BA.ObjectToString(cls_recsabadkhariditem.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 551;BA.debugLine="myCode.SendError(LastException,\"AddEshantion2\")";
Debug.ShouldStop(64);
cls_recsabadkhariditem._mycode.runVoidMethod ("_senderror" /*void*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_recsabadkhariditem.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(RemoteObject.createImmutable("AddEshantion2")));
 };
 BA.debugLineNum = 580;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtosabad(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddToSabad (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,883);
if (RapidSub.canDelegate("addtosabad")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","addtosabad", __ref);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _check = RemoteObject.createImmutable(false);
int _i = 0;
 BA.debugLineNum = 883;BA.debugLine="Sub AddToSabad";
Debug.ShouldStop(262144);
 BA.debugLineNum = 929;BA.debugLine="lblTedadjoz.Text = item.TedadDarSabadJoz";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )));
 BA.debugLineNum = 930;BA.debugLine="lblTedadKol.Text = item.TedadDarSabadKol";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )));
 BA.debugLineNum = 931;BA.debugLine="LblTedadEshan.Text = item.FldEshantion";
Debug.ShouldStop(4);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )));
 BA.debugLineNum = 933;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(16);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_recsabadkhariditem._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 934;BA.debugLine="Dim Check As Boolean";
Debug.ShouldStop(32);
_check = RemoteObject.createImmutable(false);Debug.locals.put("Check", _check);
 BA.debugLineNum = 935;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(64);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 936;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(128);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 937;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = item.CodeKala T";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 938;BA.debugLine="If item.TedadDarSabadJoz = 0 And item.TedadDarS";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 939;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
Debug.ShouldStop(1024);
cls_recsabadkhariditem._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldCodeKala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 941;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
Debug.ShouldStop(4096);
cls_recsabadkhariditem._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadDarSabadJoz = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadDarSabadKol = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldMablaghTakhfif = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldEshantion = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ),RemoteObject.createImmutable("' Where FldCodeKala = '"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 944;BA.debugLine="Check = True";
Debug.ShouldStop(32768);
_check = cls_recsabadkhariditem.__c.getField(true,"True");Debug.locals.put("Check", _check);
 BA.debugLineNum = 945;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 948;BA.debugLine="If Check = False Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,cls_recsabadkhariditem.__c.getField(true,"False"))) { 
 BA.debugLineNum = 949;BA.debugLine="MCode.AddToSabad(item)";
Debug.ShouldStop(1048576);
cls_recsabadkhariditem._mcode.runVoidMethod ("_addtosabad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 952;BA.debugLine="CallSubDelayed(Act_Sabad,\"SaveChange\")";
Debug.ShouldStop(8388608);
cls_recsabadkhariditem.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((cls_recsabadkhariditem._act_sabad.getObject())),(Object)(RemoteObject.createImmutable("SaveChange")));
 BA.debugLineNum = 953;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndowneshan_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnDownEshan_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,866);
if (RapidSub.canDelegate("btndowneshan_click")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","btndowneshan_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 866;BA.debugLine="Sub BtnDownEshan_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 867;BA.debugLine="If item.FldEshantion>0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 868;BA.debugLine="If MCode.EshantionRemove=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._eshantionremove /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 869;BA.debugLine="ToastMessageShow(\"شما مجوز حذف قلم اشانتیون را";
Debug.ShouldStop(16);
cls_recsabadkhariditem.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شما مجوز حذف قلم اشانتیون را ندارید")),(Object)(cls_recsabadkhariditem.__c.getField(true,"False")));
 BA.debugLineNum = 870;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 873;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(256);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 874;BA.debugLine="A = item.FldEshantion";
Debug.ShouldStop(512);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 875;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 876;BA.debugLine="A = A - 1";
Debug.ShouldStop(2048);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 877;BA.debugLine="item.SumMande = item.SumMande + 1";
Debug.ShouldStop(4096);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "+",1, 0)));
 BA.debugLineNum = 878;BA.debugLine="item.FldEshantion  = A";
Debug.ShouldStop(8192);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(_a));
 };
 BA.debugLineNum = 880;BA.debugLine="AddToSabad";
Debug.ShouldStop(32768);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 881;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndownjoz_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnDownJoz_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,687);
if (RapidSub.canDelegate("btndownjoz_click")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","btndownjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 687;BA.debugLine="Sub BtnDownJoz_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 688;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(32768);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 689;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(65536);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 694;BA.debugLine="Val = 1";
Debug.ShouldStop(2097152);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 BA.debugLineNum = 697;BA.debugLine="A = item.TedadDarSabadJoz";
Debug.ShouldStop(16777216);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 698;BA.debugLine="If A > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_a,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 699;BA.debugLine="A = A - Val";
Debug.ShouldStop(67108864);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "-",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 700;BA.debugLine="item.SumMande = item.SumMande + Val";
Debug.ShouldStop(134217728);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "+",1, 0)));
 BA.debugLineNum = 701;BA.debugLine="item.TedadDarSabadJoz = A";
Debug.ShouldStop(268435456);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_a));
 }else {
 BA.debugLineNum = 703;BA.debugLine="lblRemove_Click";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_lblremove_click" /*void*/ );
 };
 BA.debugLineNum = 705;BA.debugLine="AddEshantion(A)";
Debug.ShouldStop(1);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_addeshantion" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _a)));
 BA.debugLineNum = 706;BA.debugLine="AddToSabad";
Debug.ShouldStop(2);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 707;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._eshantiontabaghati /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 708;BA.debugLine="SetEshantion";
Debug.ShouldStop(8);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_seteshantion" /*RemoteObject*/ );
 };
 BA.debugLineNum = 710;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndownkol_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnDownKol_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,755);
if (RapidSub.canDelegate("btndownkol_click")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","btndownkol_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 755;BA.debugLine="Sub BtnDownKol_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 768;BA.debugLine="If item.TedadDarKarton=0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 769;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 771;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(4);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 772;BA.debugLine="Dim Val As Float = 1";
Debug.ShouldStop(8);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 775;BA.debugLine="A = item.TedadDarSabadKol";
Debug.ShouldStop(64);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 776;BA.debugLine="A = A - 1";
Debug.ShouldStop(128);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 777;BA.debugLine="item.SumMandeKarton = item.SumMandeKarton + Val";
Debug.ShouldStop(256);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_val}, "+",1, 0)));
 BA.debugLineNum = 778;BA.debugLine="item.TedadDarSabadKol = A";
Debug.ShouldStop(512);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 780;BA.debugLine="AddToSabad";
Debug.ShouldStop(2048);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 781;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._eshantiontabaghati /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 782;BA.debugLine="SetEshantion";
Debug.ShouldStop(8192);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_seteshantion" /*RemoteObject*/ );
 };
 BA.debugLineNum = 784;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnupeshan_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnUpEshan_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,840);
if (RapidSub.canDelegate("btnupeshan_click")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","btnupeshan_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
 BA.debugLineNum = 840;BA.debugLine="Sub BtnUpEshan_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 841;BA.debugLine="Dim A As Int = 0";
Debug.ShouldStop(256);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 842;BA.debugLine="Dim B As Int = 0";
Debug.ShouldStop(512);
_b = BA.numberCast(int.class, 0);Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 843;BA.debugLine="A = item.FldEshantion";
Debug.ShouldStop(1024);
_a = BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 844;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 845;BA.debugLine="If item.FldEshantion<item.fldCountEshantion Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 846;BA.debugLine="A = A + 1";
Debug.ShouldStop(8192);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 847;BA.debugLine="item.SumMande = item.SumMande - 1";
Debug.ShouldStop(16384);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "-",1, 0)));
 };
 }else 
{ BA.debugLineNum = 850;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 851;BA.debugLine="B = item.SumMande - ((item.TedadDarSabadKol * it";
Debug.ShouldStop(262144);
_b = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ))}, "++",2, 0))}, "-",1, 0));Debug.locals.put("B", _b);
 BA.debugLineNum = 852;BA.debugLine="If B > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_b,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 853;BA.debugLine="If item.FldEshantion<item.fldCountEshantion The";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldCountEshantion" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 854;BA.debugLine="A = A + 1";
Debug.ShouldStop(2097152);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 855;BA.debugLine="item.SumMande = item.SumMande - 1";
Debug.ShouldStop(4194304);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),RemoteObject.createImmutable(1)}, "-",1, 0)));
 };
 }else {
 BA.debugLineNum = 859;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(67108864);
cls_recsabadkhariditem.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_recsabadkhariditem.__c.getField(true,"True")));
 };
 }}
;
 BA.debugLineNum = 862;BA.debugLine="item.FldEshantion = A";
Debug.ShouldStop(536870912);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 863;BA.debugLine="AddToSabad";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 864;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnupjoz_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnUpJoz_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,648);
if (RapidSub.canDelegate("btnupjoz_click")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","btnupjoz_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 648;BA.debugLine="Sub BtnUpJoz_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 649;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(256);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 650;BA.debugLine="Dim Val As Float = 0";
Debug.ShouldStop(512);
_val = BA.numberCast(float.class, 0);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 655;BA.debugLine="Val = 1";
Debug.ShouldStop(16384);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);
 BA.debugLineNum = 658;BA.debugLine="A = item.TedadDarSabadJoz";
Debug.ShouldStop(131072);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 659;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 660;BA.debugLine="A = A + Val";
Debug.ShouldStop(524288);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 661;BA.debugLine="item.SumMande = item.SumMande - Val";
Debug.ShouldStop(1048576);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 663;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 664;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 665;BA.debugLine="A = A + Val";
Debug.ShouldStop(16777216);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 666;BA.debugLine="item.SumMande = item.SumMande - Val";
Debug.ShouldStop(33554432);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 668;BA.debugLine="If item.SumMande > 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 669;BA.debugLine="A = A + Val";
Debug.ShouldStop(268435456);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 670;BA.debugLine="item.SumMande = item.SumMande - Val";
Debug.ShouldStop(536870912);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 672;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(-2147483648);
cls_recsabadkhariditem.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_recsabadkhariditem.__c.getField(true,"True")));
 };
 };
 }}
;
 BA.debugLineNum = 677;BA.debugLine="item.TedadDarSabadJoz = A";
Debug.ShouldStop(16);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 678;BA.debugLine="AddEshantion(A)";
Debug.ShouldStop(32);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_addeshantion" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _a)));
 BA.debugLineNum = 679;BA.debugLine="AddToSabad";
Debug.ShouldStop(64);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 682;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._eshantiontabaghati /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 683;BA.debugLine="SetEshantion";
Debug.ShouldStop(1024);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_seteshantion" /*RemoteObject*/ );
 };
 BA.debugLineNum = 685;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnupkol_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnUpKol_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,712);
if (RapidSub.canDelegate("btnupkol_click")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","btnupkol_click", __ref);}
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _val = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 712;BA.debugLine="Sub BtnUpKol_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 714;BA.debugLine="If item.TedadDarKarton=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 715;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 717;BA.debugLine="Dim A As Float = 0";
Debug.ShouldStop(4096);
_a = BA.numberCast(float.class, 0);Debug.locals.put("A", _a);Debug.locals.put("A", _a);
 BA.debugLineNum = 718;BA.debugLine="Dim Val As Float = 1";
Debug.ShouldStop(8192);
_val = BA.numberCast(float.class, 1);Debug.locals.put("Val", _val);Debug.locals.put("Val", _val);
 BA.debugLineNum = 721;BA.debugLine="A = item.TedadDarSabadKol";
Debug.ShouldStop(65536);
_a = BA.numberCast(float.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ ));Debug.locals.put("A", _a);
 BA.debugLineNum = 722;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 723;BA.debugLine="A = A + 1";
Debug.ShouldStop(262144);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 724;BA.debugLine="item.SumMandeKarton = item.SumMandeKarton - Val";
Debug.ShouldStop(524288);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 726;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 727;BA.debugLine="A = A + 1";
Debug.ShouldStop(4194304);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 728;BA.debugLine="item.SumMandeKarton = item.SumMandeKarton - Val";
Debug.ShouldStop(8388608);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 729;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 730;BA.debugLine="If item.SumMandeKarton > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 731;BA.debugLine="A = A + Val";
Debug.ShouldStop(67108864);
_a = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,_val}, "+",1, 0));Debug.locals.put("A", _a);
 BA.debugLineNum = 732;BA.debugLine="item.SumMandeKarton = item.SumMandeKarton - Va";
Debug.ShouldStop(134217728);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )),_val}, "-",1, 0)));
 }else {
 BA.debugLineNum = 734;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
Debug.ShouldStop(536870912);
cls_recsabadkhariditem.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(cls_recsabadkhariditem.__c.getField(true,"True")));
 };
 }}
;
 };
 BA.debugLineNum = 745;BA.debugLine="item.TedadDarSabadKol = A";
Debug.ShouldStop(256);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_a));
 BA.debugLineNum = 748;BA.debugLine="AddToSabad";
Debug.ShouldStop(2048);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_addtosabad" /*RemoteObject*/ );
 BA.debugLineNum = 750;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._eshantiontabaghati /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 751;BA.debugLine="SetEshantion";
Debug.ShouldStop(16384);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_seteshantion" /*RemoteObject*/ );
 };
 BA.debugLineNum = 753;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
cls_recsabadkhariditem._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_recsabadkhariditem._p);
 //BA.debugLineNum = 3;BA.debugLine="Private item As AdapterListKala";
cls_recsabadkhariditem._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");__ref.setField("_item",cls_recsabadkhariditem._item);
 //BA.debugLineNum = 4;BA.debugLine="Private pnl_BK As Panel";
cls_recsabadkhariditem._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_recsabadkhariditem._pnl_bk);
 //BA.debugLineNum = 5;BA.debugLine="Private lbl_Price As Label";
cls_recsabadkhariditem._lbl_price = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_price",cls_recsabadkhariditem._lbl_price);
 //BA.debugLineNum = 6;BA.debugLine="Private lbl_title As Label";
cls_recsabadkhariditem._lbl_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_title",cls_recsabadkhariditem._lbl_title);
 //BA.debugLineNum = 7;BA.debugLine="Private Img_Kala As ImageView";
cls_recsabadkhariditem._img_kala = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_img_kala",cls_recsabadkhariditem._img_kala);
 //BA.debugLineNum = 8;BA.debugLine="Private lblTedadjoz As Label";
cls_recsabadkhariditem._lbltedadjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadjoz",cls_recsabadkhariditem._lbltedadjoz);
 //BA.debugLineNum = 9;BA.debugLine="Private lblTedadKol As Label";
cls_recsabadkhariditem._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkol",cls_recsabadkhariditem._lbltedadkol);
 //BA.debugLineNum = 10;BA.debugLine="Private lblRemove As Label";
cls_recsabadkhariditem._lblremove = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblremove",cls_recsabadkhariditem._lblremove);
 //BA.debugLineNum = 11;BA.debugLine="Private LblTedadEshan As Label";
cls_recsabadkhariditem._lbltedadeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadeshan",cls_recsabadkhariditem._lbltedadeshan);
 //BA.debugLineNum = 12;BA.debugLine="Private BtnUpJoz As Label";
cls_recsabadkhariditem._btnupjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupjoz",cls_recsabadkhariditem._btnupjoz);
 //BA.debugLineNum = 13;BA.debugLine="Private BtnDownJoz As Label";
cls_recsabadkhariditem._btndownjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownjoz",cls_recsabadkhariditem._btndownjoz);
 //BA.debugLineNum = 14;BA.debugLine="Private lblTedadjoz As Label";
cls_recsabadkhariditem._lbltedadjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadjoz",cls_recsabadkhariditem._lbltedadjoz);
 //BA.debugLineNum = 15;BA.debugLine="Private Panel2 As Panel";
cls_recsabadkhariditem._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel2",cls_recsabadkhariditem._panel2);
 //BA.debugLineNum = 16;BA.debugLine="Private BtnUpKol As Label";
cls_recsabadkhariditem._btnupkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupkol",cls_recsabadkhariditem._btnupkol);
 //BA.debugLineNum = 17;BA.debugLine="Private BtnDownKol As Label";
cls_recsabadkhariditem._btndownkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndownkol",cls_recsabadkhariditem._btndownkol);
 //BA.debugLineNum = 18;BA.debugLine="Private lblTedadKol As Label";
cls_recsabadkhariditem._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkol",cls_recsabadkhariditem._lbltedadkol);
 //BA.debugLineNum = 19;BA.debugLine="Private Panel3 As Panel";
cls_recsabadkhariditem._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel3",cls_recsabadkhariditem._panel3);
 //BA.debugLineNum = 20;BA.debugLine="Private BtnDownEshan As Label";
cls_recsabadkhariditem._btndowneshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btndowneshan",cls_recsabadkhariditem._btndowneshan);
 //BA.debugLineNum = 21;BA.debugLine="Private BtnUpEshan As Label";
cls_recsabadkhariditem._btnupeshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnupeshan",cls_recsabadkhariditem._btnupeshan);
 //BA.debugLineNum = 22;BA.debugLine="Private txtComment As EditText";
cls_recsabadkhariditem._txtcomment = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtcomment",cls_recsabadkhariditem._txtcomment);
 //BA.debugLineNum = 23;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
cls_recsabadkhariditem._lblfeebadaztakhfid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfeebadaztakhfid",cls_recsabadkhariditem._lblfeebadaztakhfid);
 //BA.debugLineNum = 24;BA.debugLine="Private lblVahedJoz As Label";
cls_recsabadkhariditem._lblvahedjoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedjoz",cls_recsabadkhariditem._lblvahedjoz);
 //BA.debugLineNum = 25;BA.debugLine="Private lblVahedKol As Label";
cls_recsabadkhariditem._lblvahedkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvahedkol",cls_recsabadkhariditem._lblvahedkol);
 //BA.debugLineNum = 26;BA.debugLine="Private LblMojoodiJoz As Label";
cls_recsabadkhariditem._lblmojoodijoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodijoz",cls_recsabadkhariditem._lblmojoodijoz);
 //BA.debugLineNum = 27;BA.debugLine="Private LblMojoodiKol As Label";
cls_recsabadkhariditem._lblmojoodikol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmojoodikol",cls_recsabadkhariditem._lblmojoodikol);
 //BA.debugLineNum = 28;BA.debugLine="Private LblTozihat As Label";
cls_recsabadkhariditem._lbltozihat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltozihat",cls_recsabadkhariditem._lbltozihat);
 //BA.debugLineNum = 29;BA.debugLine="Private LblGift As Label";
cls_recsabadkhariditem._lblgift = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblgift",cls_recsabadkhariditem._lblgift);
 //BA.debugLineNum = 30;BA.debugLine="Private ImageOff As ImageView";
cls_recsabadkhariditem._imageoff = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageoff",cls_recsabadkhariditem._imageoff);
 //BA.debugLineNum = 31;BA.debugLine="Private LblC_Kala As Label";
cls_recsabadkhariditem._lblc_kala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblc_kala",cls_recsabadkhariditem._lblc_kala);
 //BA.debugLineNum = 32;BA.debugLine="Private LblTedadKarton As Label";
cls_recsabadkhariditem._lbltedadkarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltedadkarton",cls_recsabadkhariditem._lbltedadkarton);
 //BA.debugLineNum = 33;BA.debugLine="Private LblBuyPrice As Label";
cls_recsabadkhariditem._lblbuyprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblbuyprice",cls_recsabadkhariditem._lblbuyprice);
 //BA.debugLineNum = 34;BA.debugLine="Dim maxkolRond As String";
cls_recsabadkhariditem._maxkolrond = RemoteObject.createImmutable("");__ref.setField("_maxkolrond",cls_recsabadkhariditem._maxkolrond);
 //BA.debugLineNum = 35;BA.debugLine="Private lblSumMablaghKala As Label";
cls_recsabadkhariditem._lblsummablaghkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsummablaghkala",cls_recsabadkhariditem._lblsummablaghkala);
 //BA.debugLineNum = 36;BA.debugLine="Private LblMablaghTakhfif As Label";
cls_recsabadkhariditem._lblmablaghtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmablaghtakhfif",cls_recsabadkhariditem._lblmablaghtakhfif);
 //BA.debugLineNum = 37;BA.debugLine="Private lblDarsadTakhfif As Label";
cls_recsabadkhariditem._lbldarsadtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldarsadtakhfif",cls_recsabadkhariditem._lbldarsadtakhfif);
 //BA.debugLineNum = 38;BA.debugLine="Private pnlJoz As Panel";
cls_recsabadkhariditem._pnljoz = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnljoz",cls_recsabadkhariditem._pnljoz);
 //BA.debugLineNum = 39;BA.debugLine="Private pnlKol As Panel";
cls_recsabadkhariditem._pnlkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlkol",cls_recsabadkhariditem._pnlkol);
 //BA.debugLineNum = 40;BA.debugLine="Private pnlEshan As Panel";
cls_recsabadkhariditem._pnleshan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnleshan",cls_recsabadkhariditem._pnleshan);
 //BA.debugLineNum = 41;BA.debugLine="Private LblFeeYekKarton As Label";
cls_recsabadkhariditem._lblfeeyekkarton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblfeeyekkarton",cls_recsabadkhariditem._lblfeeyekkarton);
 //BA.debugLineNum = 42;BA.debugLine="Private base As Object";
cls_recsabadkhariditem._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_recsabadkhariditem._base);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,601);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","getheight", __ref);}
 BA.debugLineNum = 601;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 602;BA.debugLine="Return pnl_BK.Height+10dip";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight"),cls_recsabadkhariditem.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 1);
 BA.debugLineNum = 603;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("getPanel (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,597);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","getpanel", __ref);}
 BA.debugLineNum = 597;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 598;BA.debugLine="pnl_BK.RemoveView";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 599;BA.debugLine="Return pnl_BK";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 600;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWidth (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,604);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","getwidth", __ref);}
 BA.debugLineNum = 604;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 605;BA.debugLine="Return pnl_BK.Width+5dip";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getWidth"),cls_recsabadkhariditem.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1);
 BA.debugLineNum = 606;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mdl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 45;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="base = mdl";
Debug.ShouldStop(8192);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 47;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 48;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(32768);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recsabadkhariditem.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_recsabadkhariditem.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 49;BA.debugLine="p.LoadLayout(\"L_RecSabadKharidItem_2\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_RecSabadKharidItem_2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 51;BA.debugLine="MojavezSefaresh";
Debug.ShouldStop(262144);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_mojavezsefaresh" /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblremove_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblRemove_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,612);
if (RapidSub.canDelegate("lblremove_click")) { __ref.runUserSub(false, "cls_recsabadkhariditem","lblremove_click", __ref); return;}
ResumableSub_lblRemove_Click rsub = new ResumableSub_lblRemove_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblRemove_Click extends BA.ResumableSub {
public ResumableSub_lblRemove_Click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_recsabadkhariditem parent;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
int step9;
int limit9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblRemove_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,612);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 613;BA.debugLine="If item.FldEshantion>0 Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 22;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 614;BA.debugLine="If MCode.EshantionRemove=0 Then";
Debug.ShouldStop(32);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",parent._mcode._eshantionremove /*RemoteObject*/ ,BA.NumberToString(0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 615;BA.debugLine="ToastMessageShow(\"شما مجوز حذف قلم اشانتیون را";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شما مجوز حذف قلم اشانتیون را ندارید")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 616;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 22;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 619;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
Debug.ShouldStop(1024);
if (true) break;

case 10:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent._mcode._eshantiontabaghati /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 620;BA.debugLine="Dim cu As Cursor=MCode.Result(\"Select * from Tb";
Debug.ShouldStop(2048);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * from TblSabad where FldEshantion>0 ")));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 621;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(4096);
if (true) break;

case 13:
//for
this.state = 20;
step9 = 1;
limit9 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 27;
if (true) break;

case 27:
//C
this.state = 20;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 15;
if (true) break;

case 28:
//C
this.state = 27;
_i = ((int)(0 + _i + step9)) ;
Debug.locals.put("i", _i);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 622;BA.debugLine="cu.Position=i";
Debug.ShouldStop(8192);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 623;BA.debugLine="If MCode.CheckCodeKalaEshantion(item.CodeKala,";
Debug.ShouldStop(16384);
if (true) break;

case 16:
//if
this.state = 19;
if (parent._mcode.runMethod(true,"_checkcodekalaeshantion" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ )),(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))))).<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 624;BA.debugLine="MCode.SaveUpdate(\"delete From TblSabad where";
Debug.ShouldStop(32768);
parent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("delete From TblSabad where FldCodeKala='"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 625;BA.debugLine="Exit";
Debug.ShouldStop(65536);
this.state = 20;
if (true) break;
 if (true) break;

case 19:
//C
this.state = 28;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("i", _i);
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 632;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(8388608);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 633;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"آیا مایل به";
Debug.ShouldStop(16777216);
_sf = _xui.runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("آیا مایل به حذف این محصول از سبد خرید هستید؟")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 634;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_recsabadkhariditem", "lblremove_click"), _sf);
this.state = 29;
return;
case 29:
//C
this.state = 23;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 635;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(67108864);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 636;BA.debugLine="Log(\"Deleted!!!\")";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","5106889240",RemoteObject.createImmutable("Deleted!!!"),0);
 BA.debugLineNum = 637;BA.debugLine="MCode.SaveUpdate(\"delete From TblSabad where Fld";
Debug.ShouldStop(268435456);
parent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("delete From TblSabad where FldCodeKala='"),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 638;BA.debugLine="CallSubDelayed(Act_Sabad,\"LoadListSabad\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((parent._act_sabad.getObject())),(Object)(RemoteObject.createImmutable("LoadListSabad")));
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 640;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _lbltedadjoz_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblTedadJoz_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,960);
if (RapidSub.canDelegate("lbltedadjoz_click")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","lbltedadjoz_click", __ref);}
 BA.debugLineNum = 960;BA.debugLine="Sub LblTedadJoz_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 962;BA.debugLine="CallSubDelayed2(base,\"LblTedadJoz_Click\",item)";
Debug.ShouldStop(2);
cls_recsabadkhariditem.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("LblTedadJoz_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 965;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbltedadkol_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblTedadKol_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,967);
if (RapidSub.canDelegate("lbltedadkol_click")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","lbltedadkol_click", __ref);}
 BA.debugLineNum = 967;BA.debugLine="Sub LblTedadKol_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 968;BA.debugLine="If myCode.Is_Null_adad(item.TedadDarKarton)=0 The";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))),BA.NumberToString(0))) { 
 BA.debugLineNum = 969;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 972;BA.debugLine="CallSubDelayed2(base,\"LblTedadKol_Click\",item)";
Debug.ShouldStop(2048);
cls_recsabadkhariditem.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )),(Object)(BA.ObjectToString("LblTedadKol_Click")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ))));
 BA.debugLineNum = 975;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbltozihat_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblTozihat_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,642);
if (RapidSub.canDelegate("lbltozihat_click")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","lbltozihat_click", __ref);}
 BA.debugLineNum = 642;BA.debugLine="Sub LblTozihat_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 643;BA.debugLine="If item.Tozihat <> \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"Tozihat" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 644;BA.debugLine="Msgbox(item.Tozihat,\"توضیحات کالا\")";
Debug.ShouldStop(8);
cls_recsabadkhariditem.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"Tozihat" /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("توضیحات کالا"))),__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 646;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mojavezsefaresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MojavezSefaresh (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("mojavezsefaresh")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","mojavezsefaresh", __ref);}
 BA.debugLineNum = 54;BA.debugLine="Private Sub MojavezSefaresh";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Select MCode.MojavezSefaresh";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(cls_recsabadkhariditem._mcode._mojavezsefaresh /*RemoteObject*/ ,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2))) {
case 0: {
 BA.debugLineNum = 57;BA.debugLine="BtnUpJoz.Enabled=True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnupjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="BtnDownJoz.Enabled=True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btndownjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="pnlJoz.Enabled=True";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnljoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="lblTedadjoz.Enabled=True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="BtnUpKol.Enabled=True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btnupkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 63;BA.debugLine="BtnDownKol.Enabled=True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btndownkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="pnlKol.Enabled=True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="lblTedadKol.Enabled=True";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 break; }
case 1: {
 BA.debugLineNum = 67;BA.debugLine="BtnUpJoz.Enabled=True";
Debug.ShouldStop(4);
__ref.getField(false,"_btnupjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 68;BA.debugLine="BtnDownJoz.Enabled=True";
Debug.ShouldStop(8);
__ref.getField(false,"_btndownjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 69;BA.debugLine="pnlJoz.Enabled=True";
Debug.ShouldStop(16);
__ref.getField(false,"_pnljoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 70;BA.debugLine="lblTedadjoz.Enabled=True";
Debug.ShouldStop(32);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 72;BA.debugLine="BtnUpKol.Enabled=False";
Debug.ShouldStop(128);
__ref.getField(false,"_btnupkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"False"));
 BA.debugLineNum = 73;BA.debugLine="BtnDownKol.Enabled=False";
Debug.ShouldStop(256);
__ref.getField(false,"_btndownkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="pnlKol.Enabled=False";
Debug.ShouldStop(512);
__ref.getField(false,"_pnlkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="lblTedadKol.Enabled=False";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"False"));
 break; }
case 2: {
 BA.debugLineNum = 77;BA.debugLine="BtnUpJoz.Enabled=False";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnupjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"False"));
 BA.debugLineNum = 78;BA.debugLine="BtnDownJoz.Enabled=False";
Debug.ShouldStop(8192);
__ref.getField(false,"_btndownjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="pnlJoz.Enabled=False";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnljoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="lblTedadjoz.Enabled=False";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"False"));
 BA.debugLineNum = 82;BA.debugLine="BtnUpKol.Enabled=True";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnupkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 83;BA.debugLine="BtnDownKol.Enabled=True";
Debug.ShouldStop(262144);
__ref.getField(false,"_btndownkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 84;BA.debugLine="pnlKol.Enabled=True";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 85;BA.debugLine="lblTedadKol.Enabled=True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"True"));
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
public static RemoteObject  _pnl_bk_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnl_bk_Click (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,607);
if (RapidSub.canDelegate("pnl_bk_click")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","pnl_bk_click", __ref);}
 BA.debugLineNum = 607;BA.debugLine="Private Sub pnl_bk_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 610;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteshantion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetEshantion (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,463);
if (RapidSub.canDelegate("seteshantion")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","seteshantion", __ref);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 463;BA.debugLine="Sub SetEshantion";
Debug.ShouldStop(16384);
 BA.debugLineNum = 464;BA.debugLine="MCode.SaveUpdate(\"Delete from TblSabad where FldE";
Debug.ShouldStop(32768);
cls_recsabadkhariditem._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Delete from TblSabad where FldEshantion<>'0'")));
 BA.debugLineNum = 466;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(131072);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_recsabadkhariditem._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Select * From TblSabad where FldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 467;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(262144);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 468;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(524288);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 470;BA.debugLine="AddEshantion2(Cu)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_addeshantion2" /*RemoteObject*/ ,(Object)(_cu));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 472;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show_data(RemoteObject __ref,RemoteObject _kala) throws Exception{
try {
		Debug.PushSubsStack("show_data (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("show_data")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","show_data", __ref, _kala);}
RemoteObject _fee = RemoteObject.createImmutable(0);
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _feekol = RemoteObject.createImmutable("");
RemoteObject _price = RemoteObject.createImmutable(0L);
Debug.locals.put("kala", _kala);
 BA.debugLineNum = 89;BA.debugLine="Public Sub show_data(kala As AdapterListKala)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 91;BA.debugLine="item=kala";
Debug.ShouldStop(67108864);
__ref.setField ("_item" /*RemoteObject*/ ,_kala);
 BA.debugLineNum = 92;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & item.CodeKala";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblc_kala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد کالا: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 93;BA.debugLine="lbl_title.Text=item.NameKala";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbl_title" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameKala" /*RemoteObject*/ )));
 BA.debugLineNum = 111;BA.debugLine="Dim fee As Int";
Debug.ShouldStop(16384);
_fee = RemoteObject.createImmutable(0);Debug.locals.put("fee", _fee);
 BA.debugLineNum = 113;BA.debugLine="fee=item.FeeForoosh";
Debug.ShouldStop(65536);
_fee = __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ );Debug.locals.put("fee", _fee);
 BA.debugLineNum = 115;BA.debugLine="If item.MablaghTakhfif>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 116;BA.debugLine="Dim tedadKol As String=item.TedadDarSabadJoz+(i";
Debug.ShouldStop(524288);
_tedadkol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 117;BA.debugLine="Dim FeeKol As String=(item.FeeForoosh*tedadKol)";
Debug.ShouldStop(1048576);
_feekol = BA.NumberToString((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)));Debug.locals.put("FeeKol", _feekol);Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 118;BA.debugLine="If tedadKol>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadkol),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 119;BA.debugLine="item.MablaghTakhfif=(((item.FeeForoosh*tedadKo";
Debug.ShouldStop(4194304);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 }else {
 BA.debugLineNum = 121;BA.debugLine="item.MablaghTakhfif=(((item.FeeForoosh)*item.f";
Debug.ShouldStop(16777216);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 };
 BA.debugLineNum = 123;BA.debugLine="item.fldFeeBadAzTakhfif=FeeKol-item.MablaghTakh";
Debug.ShouldStop(67108864);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _feekol),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 BA.debugLineNum = 124;BA.debugLine="LblMablaghTakhfif.Text=\"فی تخفیف: \"& myCode.Ada";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی تخفیف: "),cls_recsabadkhariditem._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"MablaghTakhfif" /*RemoteObject*/ )))))))));
 BA.debugLineNum = 125;BA.debugLine="LblMablaghTakhfif.TextColor=Colors.Red";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_recsabadkhariditem.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 126;BA.debugLine="lblDarsadTakhfif.TextColor=Colors.Red";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbldarsadtakhfif" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_recsabadkhariditem.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 127;BA.debugLine="LblMablaghTakhfif.Visible=True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 128;BA.debugLine="lblDarsadTakhfif.Visible=True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lbldarsadtakhfif" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 129;BA.debugLine="lblDarsadTakhfif.Text=\"درصد تخفیف: %\"& myCode.I";
Debug.ShouldStop(1);
__ref.getField(false,"_lbldarsadtakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("درصد تخفیف: %"),cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))))));
 }else {
 BA.debugLineNum = 131;BA.debugLine="lblDarsadTakhfif.Text=0";
Debug.ShouldStop(4);
__ref.getField(false,"_lbldarsadtakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 132;BA.debugLine="LblMablaghTakhfif.Text=0";
Debug.ShouldStop(8);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 133;BA.debugLine="LblMablaghTakhfif.Visible=False";
Debug.ShouldStop(16);
__ref.getField(false,"_lblmablaghtakhfif" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"False"));
 BA.debugLineNum = 134;BA.debugLine="lblDarsadTakhfif.Visible=False";
Debug.ShouldStop(32);
__ref.getField(false,"_lbldarsadtakhfif" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"False"));
 };
 BA.debugLineNum = 138;BA.debugLine="If IsNumber(item.FldFeeBadAzTakhfif) = True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),cls_recsabadkhariditem.__c.getField(true,"True"))) { 
 BA.debugLineNum = 145;BA.debugLine="If item.FldFeeBadAzTakhfif > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 146;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(";
Debug.ShouldStop(131072);
cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),cls_recsabadkhariditem.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_fee))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_recsabadkhariditem._mcode._vahedpool /*RemoteObject*/ ))));
 BA.debugLineNum = 147;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
Debug.ShouldStop(262144);
cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runVoidMethod ("Strikethrough",(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 148;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
Debug.ShouldStop(524288);
cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runVoidMethod ("Color",(Object)(cls_recsabadkhariditem.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 149;BA.debugLine="lbl_Price.Text = MCode.Rs";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbl_price" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 150;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"&";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی بعد از تخفیف: "),cls_recsabadkhariditem.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_recsabadkhariditem._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 151;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 152;BA.debugLine="Else If item.FldFeeBadAzTakhfif = 0 And item.fl";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ),BA.NumberToString(100))) { 
 BA.debugLineNum = 153;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(";
Debug.ShouldStop(16777216);
cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),cls_recsabadkhariditem.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_fee))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_recsabadkhariditem._mcode._vahedpool /*RemoteObject*/ ))));
 BA.debugLineNum = 154;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
Debug.ShouldStop(33554432);
cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runVoidMethod ("Strikethrough",(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 155;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
Debug.ShouldStop(67108864);
cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runVoidMethod ("Color",(Object)(cls_recsabadkhariditem.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 156;BA.debugLine="item.MablaghTakhfif=(item.FeeForoosh*item.Teda";
Debug.ShouldStop(134217728);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "*+",1, 0))));
 BA.debugLineNum = 157;BA.debugLine="item.FldFeeBadAzTakhfif=0";
Debug.ShouldStop(268435456);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 158;BA.debugLine="lbl_Price.Text = 0";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbl_price" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 159;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"&";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی بعد از تخفیف: "),cls_recsabadkhariditem.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_recsabadkhariditem._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 160;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 161;BA.debugLine="Else If item.FldFeeBadAzTakhfif = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 162;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(";
Debug.ShouldStop(2);
cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),cls_recsabadkhariditem.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_fee))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_recsabadkhariditem._mcode._vahedpool /*RemoteObject*/ ))));
 BA.debugLineNum = 163;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
Debug.ShouldStop(4);
cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runVoidMethod ("Strikethrough",(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 164;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
Debug.ShouldStop(8);
cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runVoidMethod ("Color",(Object)(cls_recsabadkhariditem.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .runMethod(true,"getLength")));
 BA.debugLineNum = 165;BA.debugLine="lbl_Price.Text = MCode.Rs";
Debug.ShouldStop(16);
__ref.getField(false,"_lbl_price" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_recsabadkhariditem._mcode._rs /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 166;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"&";
Debug.ShouldStop(32);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی بعد از تخفیف: "),cls_recsabadkhariditem.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_recsabadkhariditem._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 167;BA.debugLine="ImageOff.Visible=True";
Debug.ShouldStop(64);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 169;BA.debugLine="lbl_Price.Text =\"فی فروش: \"& NumberFormat(myCo";
Debug.ShouldStop(256);
__ref.getField(false,"_lbl_price" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),cls_recsabadkhariditem.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_fee))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_recsabadkhariditem._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 170;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(512);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 171;BA.debugLine="ImageOff.Visible=False";
Debug.ShouldStop(1024);
__ref.getField(false,"_imageoff" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"False"));
 }}}
;
 }else {
 BA.debugLineNum = 174;BA.debugLine="lbl_Price.Text =\"فی فروش: \"& NumberFormat(myCod";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbl_price" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی فروش: "),cls_recsabadkhariditem.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_fee))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_recsabadkhariditem._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 175;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblfeebadaztakhfid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 236;BA.debugLine="item.FldEshantion=myCode.Is_Null_adad(item.FldEs";
Debug.ShouldStop(2048);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("FldEshantion" /*RemoteObject*/ ,cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ ))));
 BA.debugLineNum = 239;BA.debugLine="Dim Price As Long=0";
Debug.ShouldStop(16384);
_price = BA.numberCast(long.class, 0);Debug.locals.put("Price", _price);Debug.locals.put("Price", _price);
 BA.debugLineNum = 246;BA.debugLine="Price = item.FeeForoosh * ((item.TedadDarSabadKo";
Debug.ShouldStop(2097152);
_price = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "+",1, 0))}, "*",0, 0));Debug.locals.put("Price", _price);
 BA.debugLineNum = 250;BA.debugLine="If Price>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_price,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 251;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: \"& NumberForm";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblsummablaghkala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("جمع مبلغ: "),cls_recsabadkhariditem.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(_price))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" "),cls_recsabadkhariditem._mcode._vahedpool /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 253;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: 0\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblsummablaghkala" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("جمع مبلغ: 0"));
 };
 BA.debugLineNum = 256;BA.debugLine="lblTedadjoz.Text = item.TedadDarSabadJoz";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lbltedadjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )));
 BA.debugLineNum = 257;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& item.NameVahed";
Debug.ShouldStop(1);
__ref.getField(false,"_lblvahedjoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 258;BA.debugLine="lblTedadKol.Text = item.TedadDarSabadKol";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltedadkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadKol" /*RemoteObject*/ )));
 BA.debugLineNum = 259;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& item.NameVahed2";
Debug.ShouldStop(4);
__ref.getField(false,"_lblvahedkol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد به "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 260;BA.debugLine="LblTedadEshan.Text = myCode.Is_Null_adad(item.Fl";
Debug.ShouldStop(8);
__ref.getField(false,"_lbltedadeshan" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(cls_recsabadkhariditem._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldEshantion" /*RemoteObject*/ )))));
 BA.debugLineNum = 261;BA.debugLine="txtComment.Text=item.Tozihat";
Debug.ShouldStop(16);
__ref.getField(false,"_txtcomment" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"Tozihat" /*RemoteObject*/ )));
 BA.debugLineNum = 263;BA.debugLine="If item.Tozihat <> \"\"   Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"Tozihat" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 264;BA.debugLine="LblTozihat.Visible=True";
Debug.ShouldStop(128);
__ref.getField(false,"_lbltozihat" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 266;BA.debugLine="LblTozihat.Visible=False";
Debug.ShouldStop(512);
__ref.getField(false,"_lbltozihat" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"False"));
 };
 BA.debugLineNum = 268;BA.debugLine="myCode.DownloadImage5(item.CodeKala,item.fldPath";
Debug.ShouldStop(2048);
cls_recsabadkhariditem._mycode.runVoidMethod ("_downloadimage5" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"fldPathPic" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_img_kala" /*RemoteObject*/ )));
 BA.debugLineNum = 284;BA.debugLine="If item.TedadDarKarton<>0 And IsNumber(item.Teda";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",cls_recsabadkhariditem.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))),cls_recsabadkhariditem.__c.getField(true,"True"))) { 
 BA.debugLineNum = 285;BA.debugLine="maxkolRond=(item.SumMandeKarton)";
Debug.ShouldStop(268435456);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ )));
 BA.debugLineNum = 287;BA.debugLine="If item.NameVahed2=\"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 288;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& item.T";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 290;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&item.NameVahed";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),RemoteObject.createImmutable(": "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 292;BA.debugLine="LblFeeYekKarton.Text=\"فی یک کارتن: \"&myCode.Ada";
Debug.ShouldStop(8);
__ref.getField(false,"_lblfeeyekkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی یک کارتن: "),cls_recsabadkhariditem._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)))))));
 BA.debugLineNum = 293;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(16);
cls_recsabadkhariditem.__c.runVoidMethod ("LogImpl","5106299596",__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ),0);
 }else {
 BA.debugLineNum = 295;BA.debugLine="maxkolRond=0";
Debug.ShouldStop(64);
__ref.setField ("_maxkolrond" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 297;BA.debugLine="If item.NameVahed2=\"\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 298;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& maxkol";
Debug.ShouldStop(512);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن: "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 300;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&item.NameVahed";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ),RemoteObject.createImmutable(": "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 302;BA.debugLine="LblFeeYekKarton.Text=\"فی یک کارتن: \"&0";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblfeeyekkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("فی یک کارتن: "),RemoteObject.createImmutable(0))));
 BA.debugLineNum = 303;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 };
 BA.debugLineNum = 305;BA.debugLine="Log(maxkolRond)";
Debug.ShouldStop(65536);
cls_recsabadkhariditem.__c.runVoidMethod ("LogImpl","5106299608",__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ),0);
 BA.debugLineNum = 306;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& item.SumMand";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی جزء: "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMande" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 308;BA.debugLine="If  item.SumMandeKarton <> Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"SumMandeKarton" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 309;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("موجودی کل: "),__ref.getField(true,"_maxkolrond" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"NameVahed2" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 311;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("موجودی کل: -"));
 };
 BA.debugLineNum = 315;BA.debugLine="AddEshantion(item.TedadDarSabadJoz)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_addeshantion" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))));
 BA.debugLineNum = 316;BA.debugLine="LblBuyPrice.Text=\"قیمت مصرف کننده \"& myCode.Adad";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblbuyprice" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("قیمت مصرف کننده "),cls_recsabadkhariditem._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FldMablaghMasrafKonande" /*RemoteObject*/ ))))));
 BA.debugLineNum = 317;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن \"&item.Tedad";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbltedadkarton" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تعداد در کارتن "),__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 BA.debugLineNum = 338;BA.debugLine="If MCode.HideMojodi=1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",cls_recsabadkhariditem._mcode._hidemojodi /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 339;BA.debugLine="LblMojoodiJoz.Visible=False";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"False"));
 BA.debugLineNum = 340;BA.debugLine="LblMojoodiKol.Visible=False";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 342;BA.debugLine="LblMojoodiJoz.Visible=True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblmojoodijoz" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"True"));
 BA.debugLineNum = 343;BA.debugLine="LblMojoodiKol.Visible=True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblmojoodikol" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recsabadkhariditem.__c.getField(true,"True"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e118) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e118.toString()); BA.debugLineNum = 422;BA.debugLine="Log(kala.NameKala)";
Debug.ShouldStop(32);
cls_recsabadkhariditem.__c.runVoidMethod ("LogImpl","5106299725",_kala.getField(true,"NameKala" /*RemoteObject*/ ),0);
 BA.debugLineNum = 423;BA.debugLine="Img_Kala.Enabled=False";
Debug.ShouldStop(64);
__ref.getField(false,"_img_kala" /*RemoteObject*/ ).runMethod(true,"setEnabled",cls_recsabadkhariditem.__c.getField(true,"False"));
 BA.debugLineNum = 424;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
cls_recsabadkhariditem.__c.runVoidMethod ("LogImpl","5106299727",BA.ObjectToString(cls_recsabadkhariditem.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _status(RemoteObject __ref,RemoteObject _enable) throws Exception{
try {
		Debug.PushSubsStack("Status (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,582);
if (RapidSub.canDelegate("status")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","status", __ref, _enable);}
Debug.locals.put("Enable", _enable);
 BA.debugLineNum = 582;BA.debugLine="Sub Status(Enable As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 595;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtcomment_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtComment_TextChanged (cls_recsabadkhariditem) ","cls_recsabadkhariditem",87,__ref.getField(false, "ba"),__ref,955);
if (RapidSub.canDelegate("txtcomment_textchanged")) { return __ref.runUserSub(false, "cls_recsabadkhariditem","txtcomment_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 955;BA.debugLine="Sub txtComment_TextChanged (Old As String, New As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 956;BA.debugLine="item.Tozihat=MCode.ConvertNumbersPersian2English(";
Debug.ShouldStop(134217728);
__ref.getField(false,"_item" /*RemoteObject*/ ).setField ("Tozihat" /*RemoteObject*/ ,cls_recsabadkhariditem._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_new)));
 BA.debugLineNum = 957;BA.debugLine="MCode.SaveUpdate($\"Update TblSabad Set FldTozihat";
Debug.ShouldStop(268435456);
cls_recsabadkhariditem._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTozihat = '"),cls_recsabadkhariditem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_new))),RemoteObject.createImmutable("' Where FldCodeKala = '"),cls_recsabadkhariditem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"CodeKala" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 958;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}