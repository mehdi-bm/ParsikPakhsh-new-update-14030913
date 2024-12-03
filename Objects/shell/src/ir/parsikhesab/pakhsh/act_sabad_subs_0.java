package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_sabad_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,43);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","activity_create", _firsttime);}
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Activity.LoadLayout(\"L_Sabadkharid\")";
Debug.ShouldStop(2048);
act_sabad.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Sabadkharid")),act_sabad.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 47;BA.debugLine="Fused.Initialize(\"FusedLocation\")";
Debug.ShouldStop(16384);
act_sabad.mostCurrent._fused.runVoidMethod ("Initialize",act_sabad.processBA,(Object)(RemoteObject.createImmutable("FusedLocation")));
 BA.debugLineNum = 48;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(32768);
act_sabad.mostCurrent._hlv.runMethod(false,"Initializer",act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 49;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
Debug.ShouldStop(65536);
act_sabad.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_sabad.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_sabad.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_sabad.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 50;BA.debugLine="Dialog.Initialize (Activity)";
Debug.ShouldStop(131072);
act_sabad.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_sabad.mostCurrent._activity.getObject()));
 BA.debugLineNum = 56;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(8388608);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 57;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
Debug.ShouldStop(16777216);
_op.runVoidMethod ("Initialize2",(Object)(act_sabad.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_sabad.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_sabad.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_sabad.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 64;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(-2147483648);
act_sabad.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 65;BA.debugLine="ListSabad.Initialize";
Debug.ShouldStop(1);
act_sabad.mostCurrent._listsabad.runVoidMethod ("Initialize");
 BA.debugLineNum = 66;BA.debugLine="OriginalItemList.Initialize";
Debug.ShouldStop(2);
act_sabad.mostCurrent._originalitemlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="ListSabad.Clear";
Debug.ShouldStop(4);
act_sabad.mostCurrent._listsabad.runVoidMethod ("Clear");
 BA.debugLineNum = 68;BA.debugLine="OriginalItemList.Clear";
Debug.ShouldStop(8);
act_sabad.mostCurrent._originalitemlist.runVoidMethod ("Clear");
 BA.debugLineNum = 69;BA.debugLine="HLV.Show";
Debug.ShouldStop(16);
act_sabad.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 80;BA.debugLine="If  MCode.Action=\"SabtFaktor\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtFaktor"))) { 
 BA.debugLineNum = 81;BA.debugLine="ListTasvie.Initialize";
Debug.ShouldStop(65536);
act_sabad.mostCurrent._listtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="ListTasvie=LoadAcSpNoeTasvie";
Debug.ShouldStop(131072);
act_sabad.mostCurrent._listtasvie = _loadacspnoetasvie();
 BA.debugLineNum = 83;BA.debugLine="LoadNoeTasvie";
Debug.ShouldStop(262144);
_loadnoetasvie();
 BA.debugLineNum = 84;BA.debugLine="pnlNS.Visible=True";
Debug.ShouldStop(524288);
act_sabad.mostCurrent._pnlns.runMethod(true,"setVisible",act_sabad.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 86;BA.debugLine="pnlNS.Visible=False";
Debug.ShouldStop(2097152);
act_sabad.mostCurrent._pnlns.runMethod(true,"setVisible",act_sabad.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 89;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(16777216);
_refreshlblsabad();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e25) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e25.toString()); BA.debugLineNum = 95;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571172148",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 96;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(-2147483648);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,419);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 419;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(4);
 BA.debugLineNum = 420;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 421;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_sabad.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 422;BA.debugLine="If MCode.page=\"KalaDefault\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("KalaDefault"))) { 
 BA.debugLineNum = 423;BA.debugLine="Log(MCode.feeTip)";
Debug.ShouldStop(64);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572155140",act_sabad.mostCurrent._mcode._feetip /*RemoteObject*/ ,0);
 BA.debugLineNum = 424;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(128);
act_sabad.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabad.processBA,(Object)((act_sabad.mostCurrent._act_kaladefault.getObject())));
 }else 
{ BA.debugLineNum = 425;BA.debugLine="Else if MCode.page=\"Kala_listi\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Kala_listi"))) { 
 BA.debugLineNum = 426;BA.debugLine="StartActivity(Act_Kala_listi)";
Debug.ShouldStop(512);
act_sabad.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabad.processBA,(Object)((act_sabad.mostCurrent._act_kala_listi.getObject())));
 }else 
{ BA.debugLineNum = 427;BA.debugLine="Else If MCode.page=\"SabtMarjooii\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 428;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(2048);
act_sabad.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabad.processBA,(Object)((act_sabad.mostCurrent._act_kaladefault.getObject())));
 }}}
;
 BA.debugLineNum = 430;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
act_sabad.mostCurrent._activity.runVoidMethod ("Finish");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e14.toString()); BA.debugLineNum = 433;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572155150",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 434;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(131072);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Resume"))));
 };
 BA.debugLineNum = 436;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return act_sabad.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 437;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,415);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 415;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Resume (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,391);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","activity_resume");}
 BA.debugLineNum = 391;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 393;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 394;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA),act_sabad.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 395;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
Debug.ShouldStop(1024);
act_sabad.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(act_sabad.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 404;BA.debugLine="LoadListSabad";
Debug.ShouldStop(524288);
_loadlistsabad();
 BA.debugLineNum = 405;BA.debugLine="UpdateSumSabad";
Debug.ShouldStop(1048576);
_updatesumsabad();
 BA.debugLineNum = 406;BA.debugLine="CreatePage";
Debug.ShouldStop(2097152);
_createpage();
 BA.debugLineNum = 407;BA.debugLine="MojavezSefaresh";
Debug.ShouldStop(4194304);
_mojavezsefaresh();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e10.toString()); BA.debugLineNum = 409;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572024082",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 410;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(33554432);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Resume"))));
 };
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtosabad(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("AddToSabad (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1346);
if (RapidSub.canDelegate("addtosabad")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","addtosabad", _item);}
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _feekol = RemoteObject.createImmutable("");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recdefultkala");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _check = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _ishas = RemoteObject.createImmutable(false);
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _item2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterchangefeekala");
Debug.locals.put("Item", _item);
 BA.debugLineNum = 1346;BA.debugLine="Sub AddToSabad(Item As AdapterListKala)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1347;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 1348;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>0";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1349;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item";
Debug.ShouldStop(16);
_tedadkol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )))),BA.numberCast(double.class, act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 1350;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
Debug.ShouldStop(32);
_feekol = BA.NumberToString((RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)));Debug.locals.put("FeeKol", _feekol);Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 1351;BA.debugLine="If tedadKol>0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadkol),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1352;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKo";
Debug.ShouldStop(128);
_item.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)),BA.numberCast(double.class, _item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 1353;BA.debugLine="Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghTak";
Debug.ShouldStop(256);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _feekol),_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 }else {
 BA.debugLineNum = 1355;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1356;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh)*Item.";
Debug.ShouldStop(2048);
_item.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(_item.getField(true,"FeeForoosh" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 1357;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.";
Debug.ShouldStop(4096);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 1)));
 };
 };
 };
 BA.debugLineNum = 1363;BA.debugLine="Dim rec As CLs_RecDefultKala";
Debug.ShouldStop(262144);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recdefultkala");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 1364;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(524288);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_initialize" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(act_sabad.getObject()));
 BA.debugLineNum = 1365;BA.debugLine="rec.Show(Item,0)";
Debug.ShouldStop(1048576);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_show" /*void*/ ,(Object)(_item),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1366;BA.debugLine="FeeKol=rec.CheckArzeshAfzode";
Debug.ShouldStop(2097152);
_feekol = _rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_checkarzeshafzode" /*RemoteObject*/ );Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 1368;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(8388608);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabad.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1369;BA.debugLine="Dim Check As Boolean";
Debug.ShouldStop(16777216);
_check = RemoteObject.createImmutable(false);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1370;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(33554432);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21) ;_i = ((int)(0 + _i + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1371;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(67108864);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1372;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),_item.getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1373;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDar";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 1374;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where";
Debug.ShouldStop(536870912);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldCodeKala = '"),_item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 1375;BA.debugLine="Dim ishas As Boolean=False";
Debug.ShouldStop(1073741824);
_ishas = act_sabad.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 1376;BA.debugLine="Dim c As Int=0";
Debug.ShouldStop(-2147483648);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 1377;BA.debugLine="For i=0 To MCode.lstChangeFeeKala.Size-1";
Debug.ShouldStop(1);
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {act_sabad.mostCurrent._mcode._lstchangefeekala /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1378;BA.debugLine="Dim Item2 = MCode.lstChangeFeeKala.Get(i) As";
Debug.ShouldStop(2);
_item2 = (act_sabad.mostCurrent._mcode._lstchangefeekala /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item2", _item2);Debug.locals.put("Item2", _item2);
 BA.debugLineNum = 1379;BA.debugLine="If Item2.FldCodKala=Item.CodeKala Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_item2.getField(true,"FldCodKala" /*RemoteObject*/ ),_item.getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1380;BA.debugLine="ishas=True";
Debug.ShouldStop(8);
_ishas = act_sabad.mostCurrent.__c.getField(true,"True");Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 1381;BA.debugLine="c=i";
Debug.ShouldStop(16);
_c = BA.numberCast(int.class, _i);Debug.locals.put("c", _c);
 BA.debugLineNum = 1382;BA.debugLine="Exit";
Debug.ShouldStop(32);
if (true) break;
 }else {
 BA.debugLineNum = 1384;BA.debugLine="ishas=False";
Debug.ShouldStop(128);
_ishas = act_sabad.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1388;BA.debugLine="If ishas Then";
Debug.ShouldStop(2048);
if (_ishas.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1389;BA.debugLine="MCode.lstChangeFeeKala.RemoveAt(c)";
Debug.ShouldStop(4096);
act_sabad.mostCurrent._mcode._lstchangefeekala /*RemoteObject*/ .runVoidMethod ("RemoveAt",(Object)(_c));
 };
 }else {
 BA.debugLineNum = 1395;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTeda";
Debug.ShouldStop(262144);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadDarSabadJoz = '"),_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadDarSabadKol = '"),_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldMablaghTakhfif = '"),_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldDarsadTakhfif = '"),act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))),RemoteObject.createImmutable("',fldFeeBadAzTakhfif = '"),act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),RemoteObject.createImmutable("',FldEshantion = '"),_item.getField(true,"FldEshantion" /*RemoteObject*/ ),RemoteObject.createImmutable("',fldArzeshAfzode='"),_item.getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("',fldDarsadArzeshAfzode='"),_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("' Where FldCodeKala = '"),_item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 1398;BA.debugLine="Check = True";
Debug.ShouldStop(2097152);
_check = act_sabad.mostCurrent.__c.getField(true,"True");Debug.locals.put("Check", _check);
 BA.debugLineNum = 1399;BA.debugLine="Exit";
Debug.ShouldStop(4194304);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1402;BA.debugLine="If Check = False Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_check,act_sabad.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1403;BA.debugLine="MCode.AddToSabad(Item)";
Debug.ShouldStop(67108864);
act_sabad.mostCurrent._mcode.runVoidMethod ("_addtosabad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item));
 };
 BA.debugLineNum = 1405;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(268435456);
_refreshlblsabad();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e53) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e53.toString()); BA.debugLineNum = 1407;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","573334845",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1408;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(-2147483648);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","573334846",act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 1412;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-AddToSabad"))));
 };
 BA.debugLineNum = 1415;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Application_Error (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1263);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 1263;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1265;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) return act_sabad.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1266;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_back_click() throws Exception{
try {
		Debug.PushSubsStack("btn_Back_Click (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1224);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","btn_back_click");}
 BA.debugLineNum = 1224;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1225;BA.debugLine="If MCode.page=\"KalaDefault\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("KalaDefault"))) { 
 BA.debugLineNum = 1226;BA.debugLine="Log(MCode.feeTip)";
Debug.ShouldStop(512);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572876034",act_sabad.mostCurrent._mcode._feetip /*RemoteObject*/ ,0);
 BA.debugLineNum = 1227;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(1024);
act_sabad.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabad.processBA,(Object)((act_sabad.mostCurrent._act_kaladefault.getObject())));
 }else 
{ BA.debugLineNum = 1228;BA.debugLine="Else if MCode.page=\"Kala_listi\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Kala_listi"))) { 
 BA.debugLineNum = 1229;BA.debugLine="StartActivity(Act_Kala_listi)";
Debug.ShouldStop(4096);
act_sabad.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabad.processBA,(Object)((act_sabad.mostCurrent._act_kala_listi.getObject())));
 }else 
{ BA.debugLineNum = 1230;BA.debugLine="Else If MCode.page=\"SabtMarjooii\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 1231;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(16384);
act_sabad.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabad.processBA,(Object)((act_sabad.mostCurrent._act_kaladefault.getObject())));
 }}}
;
 BA.debugLineNum = 1233;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
act_sabad.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1234;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_sendfactor_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_SendFactor_Click (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,855);
if (RapidSub.canDelegate("btn_sendfactor_click")) { ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","btn_sendfactor_click"); return;}
ResumableSub_Btn_SendFactor_Click rsub = new ResumableSub_Btn_SendFactor_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_SendFactor_Click extends BA.ResumableSub {
public ResumableSub_Btn_SendFactor_Click(ir.parsikhesab.pakhsh.act_sabad parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_sabad parent;
RemoteObject _shomarefactor = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_SendFactor_Click (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,855);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 856;BA.debugLine="ProgressDialogShow2(\"در حال ارسال موارد انتخابی .";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال ارسال موارد انتخابی . . .")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 857;BA.debugLine="Dim shomarefactor As Int=0";
Debug.ShouldStop(16777216);
_shomarefactor = BA.numberCast(int.class, 0);Debug.locals.put("shomarefactor", _shomarefactor);Debug.locals.put("shomarefactor", _shomarefactor);
 BA.debugLineNum = 858;BA.debugLine="shomarefactor=MCode.FaktorSelect";
Debug.ShouldStop(33554432);
_shomarefactor = BA.numberCast(int.class, parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ );Debug.locals.put("shomarefactor", _shomarefactor);
 BA.debugLineNum = 859;BA.debugLine="If shomarefactor>0 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(">",_shomarefactor,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 860;BA.debugLine="CallSubDelayed2(Service_Server,\"LoadSend\",shomar";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_sabad.processBA,(Object)((parent.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("LoadSend")),(Object)((_shomarefactor)));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 863;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_sabad.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabad", "btn_sendfactor_click"),BA.numberCast(int.class, 1000));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 865;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static RemoteObject  _btnsabtsefaresh_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSabtSefaresh_Click (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,468);
if (RapidSub.canDelegate("btnsabtsefaresh_click")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","btnsabtsefaresh_click");}
 BA.debugLineNum = 468;BA.debugLine="Sub BtnSabtSefaresh_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 471;BA.debugLine="LoadListSabad";
Debug.ShouldStop(4194304);
_loadlistsabad();
 BA.debugLineNum = 478;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 485;BA.debugLine="If MCode.Action=\"SabtFaktor\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtFaktor"))) { 
 BA.debugLineNum = 486;BA.debugLine="If CmbBox1.SelectedIndex=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._cmbbox1.runClassMethod (ir.parsikhesab.pakhsh.b4xcombobox.class, "_getselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 487;BA.debugLine="ToastMessageShow(\"لطفا نوع تسویه را مشخص کنید\"";
Debug.ShouldStop(64);
act_sabad.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا نوع تسویه را مشخص کنید")),(Object)(act_sabad.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 488;BA.debugLine="Return";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 490;BA.debugLine="If MCode.ManedEtebarEnable=True And MCode.Mande";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._manedetebarenable /*RemoteObject*/ ,act_sabad.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._mandeetebar /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 491;BA.debugLine="ToastMessageShow(\"سقف اعتبار این مشتری به اتما";
Debug.ShouldStop(1024);
act_sabad.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سقف اعتبار این مشتری به اتمام رسیده است.")),(Object)(act_sabad.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 492;BA.debugLine="Return";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 495;BA.debugLine="If MCode.ManedEtebarEnable And MCode.FinalFakto";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",act_sabad.mostCurrent._mcode._manedetebarenable /*RemoteObject*/ ) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_sabad.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"GablePardakht" /*RemoteObject*/ )),BA.numberCast(double.class, act_sabad.mostCurrent._mcode._mandeetebar /*RemoteObject*/ ))) { 
 BA.debugLineNum = 496;BA.debugLine="ToastMessageShow(\"جمع مبلغ سفارش از اعتبار مشت";
Debug.ShouldStop(32768);
act_sabad.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد.")),(Object)(act_sabad.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 497;BA.debugLine="Return";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 524;BA.debugLine="SaveFaktor";
Debug.ShouldStop(2048);
_savefaktor();
 }else 
{ BA.debugLineNum = 529;BA.debugLine="Else If MCode.Action=\"SabtMarjooii\" Or MCode.Act";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii")) || RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("UpdateMarjooii"))) { 
 BA.debugLineNum = 530;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 531;BA.debugLine="MCode.FaktorSelect=\"\"";
Debug.ShouldStop(262144);
act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/  = BA.ObjectToString("");
 };
 BA.debugLineNum = 534;BA.debugLine="SaveMarjooii";
Debug.ShouldStop(2097152);
_savemarjooii();
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e24.toString()); BA.debugLineNum = 537;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572286277",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 538;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(33554432);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnSabtSefaresh_Click"))));
 };
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chamani_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chAmani_CheckedChange (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1268);
if (RapidSub.canDelegate("chamani_checkedchange")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","chamani_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1268;BA.debugLine="Private Sub chAmani_CheckedChange(Checked As Boole";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1269;BA.debugLine="If Checked Then";
Debug.ShouldStop(1048576);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1270;BA.debugLine="MCode.isAmani=1";
Debug.ShouldStop(2097152);
act_sabad.mostCurrent._mcode._isamani /*RemoteObject*/  = BA.NumberToString(1);
 }else {
 BA.debugLineNum = 1272;BA.debugLine="MCode.isAmani=0";
Debug.ShouldStop(8388608);
act_sabad.mostCurrent._mcode._isamani /*RemoteObject*/  = BA.NumberToString(0);
 };
 BA.debugLineNum = 1274;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checksavefaktor() throws Exception{
try {
		Debug.PushSubsStack("CheckSaveFaktor (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,546);
if (RapidSub.canDelegate("checksavefaktor")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","checksavefaktor");}
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
 BA.debugLineNum = 546;BA.debugLine="Sub CheckSaveFaktor";
Debug.ShouldStop(2);
 BA.debugLineNum = 547;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 548;BA.debugLine="If MCode.VoroodTozihKala = 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._voroodtozihkala /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 549;BA.debugLine="For i=0 To ListSabad.Size-1";
Debug.ShouldStop(16);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {act_sabad.mostCurrent._listsabad.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 550;BA.debugLine="Dim Item = ListSabad.Get(i) As AdapterListKala";
Debug.ShouldStop(32);
_item = (act_sabad.mostCurrent._listsabad.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 551;BA.debugLine="If Item.Tozihat.Length = 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_item.getField(true,"Tozihat" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 552;BA.debugLine="Msgbox(\"توضیح کالا مربوط به \" & \"'\" & Item.Nam";
Debug.ShouldStop(128);
act_sabad.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("توضیح کالا مربوط به "),RemoteObject.createImmutable("'"),_item.getField(true,"NameKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" وارد نشده است."),act_sabad.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("تا زمانی که توضیحات برای تمامی کالاهای انتخابی شما وارد نشده باشد اجازه ثبت فاکتور را ندارید")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("توجه"))),act_sabad.mostCurrent.activityBA);
 BA.debugLineNum = 553;BA.debugLine="Return";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 555;BA.debugLine="If Item.Tozihat = \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_item.getField(true,"Tozihat" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 556;BA.debugLine="Msgbox(\"توضیح کالا مربوط به \" & \"'\" & Item.Nam";
Debug.ShouldStop(2048);
act_sabad.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("توضیح کالا مربوط به "),RemoteObject.createImmutable("'"),_item.getField(true,"NameKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" وارد نشده است."),act_sabad.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("تا زمانی که توضیحات برای تمامی کالاهای انتخابی شما وارد نشده باشد اجازه ثبت فاکتور را ندارید")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("توجه"))),act_sabad.mostCurrent.activityBA);
 BA.debugLineNum = 557;BA.debugLine="Return";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 }
}Debug.locals.put("i", _i);
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e16.toString()); BA.debugLineNum = 588;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572351786",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 589;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4096);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-CheckSaveFaktor"))));
 };
 BA.debugLineNum = 594;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmbbox1_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("CmbBox1_SelectedIndexChanged (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1236);
if (RapidSub.canDelegate("cmbbox1_selectedindexchanged")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","cmbbox1_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 1236;BA.debugLine="Sub CmbBox1_SelectedIndexChanged (Index As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1237;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 1238;BA.debugLine="If Index=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1239;BA.debugLine="ToastMessageShow(\"لطفا نوع تسویه را مشخص کنید\",F";
Debug.ShouldStop(4194304);
act_sabad.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا نوع تسویه را مشخص کنید")),(Object)(act_sabad.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1240;BA.debugLine="Return";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1242;BA.debugLine="MCode.feeTip=Index";
Debug.ShouldStop(33554432);
act_sabad.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(_index);
 BA.debugLineNum = 1243;BA.debugLine="MCode.UpdateNoeTasvieDarSabad(Index,Null)";
Debug.ShouldStop(67108864);
act_sabad.mostCurrent._mcode.runVoidMethod ("_updatenoetasviedarsabad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_index),(Object)((act_sabad.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 1246;BA.debugLine="Log(\"CmbBox1 Index: \" & Index)";
Debug.ShouldStop(536870912);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572941578",RemoteObject.concat(RemoteObject.createImmutable("CmbBox1 Index: "),_index),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e10.toString()); BA.debugLineNum = 1248;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572941580",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1249;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-CmbBox1_SelectedIndexChanged"))));
 };
 BA.debugLineNum = 1251;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("CreatePage (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,139);
if (RapidSub.canDelegate("createpage")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","createpage");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
 BA.debugLineNum = 139;BA.debugLine="Sub CreatePage";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 141;BA.debugLine="If ListTasvie.IsInitialized=False Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._listtasvie.runMethod(true,"IsInitialized"),act_sabad.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 142;BA.debugLine="ListTasvie.Initialize";
Debug.ShouldStop(8192);
act_sabad.mostCurrent._listtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 143;BA.debugLine="ListTasvie=LoadAcSpNoeTasvie";
Debug.ShouldStop(16384);
act_sabad.mostCurrent._listtasvie = _loadacspnoetasvie();
 BA.debugLineNum = 144;BA.debugLine="LoadNoeTasvie";
Debug.ShouldStop(32768);
_loadnoetasvie();
 };
 BA.debugLineNum = 146;BA.debugLine="LblCodeMoshtari.Text=MCode.C_Tafzili";
Debug.ShouldStop(131072);
act_sabad.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_sabad.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 147;BA.debugLine="LblNameMoshtari.Text=MCode.N_Tafzili";
Debug.ShouldStop(262144);
act_sabad.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_sabad.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 149;BA.debugLine="If MCode.FaktorSelect<>\"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 150;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(2097152);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabad.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 151;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 152;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(8388608);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 155;BA.debugLine="For i=0 To ListTasvie.Size-1";
Debug.ShouldStop(67108864);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {act_sabad.mostCurrent._listtasvie.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 156;BA.debugLine="Dim Item = ListTasvie.Get(i) As AdapterListNoe";
Debug.ShouldStop(134217728);
_item = (act_sabad.mostCurrent._listtasvie.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 157;BA.debugLine="If Item.FldC_Tasvie=Cu.GetString(\"FldVaziatPar";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_item.getField(true,"FldC_Tasvie" /*RemoteObject*/ ),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVaziatPardakht"))))) { 
 BA.debugLineNum = 158;BA.debugLine="CmbBox1.SelectedIndex=i+1";
Debug.ShouldStop(536870912);
act_sabad.mostCurrent._cmbbox1.runClassMethod (ir.parsikhesab.pakhsh.b4xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 161;BA.debugLine="If Cu.GetString(\"fldSharh\") = \"\"  Or Cu.GetStr";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh"))),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh"))),RemoteObject.concat(RemoteObject.createImmutable("("),act_sabad.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"getSelectedItem"),RemoteObject.createImmutable(")")))) { 
 BA.debugLineNum = 162;BA.debugLine="TxtSharhFaktor.Text = \"\"";
Debug.ShouldStop(2);
act_sabad.mostCurrent._txtsharhfaktor.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else {
 BA.debugLineNum = 164;BA.debugLine="TxtSharhFaktor.Text = Cu.GetString(\"fldSharh\"";
Debug.ShouldStop(8);
act_sabad.mostCurrent._txtsharhfaktor.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh"))).runMethod(true,"replace",(Object)(RemoteObject.concat(RemoteObject.createImmutable("("),act_sabad.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"getSelectedItem"),RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("")))));
 };
 };
 }else {
 };
 BA.debugLineNum = 170;BA.debugLine="If MCode.Amani=1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._amani /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 171;BA.debugLine="chAmani.Visible=True";
Debug.ShouldStop(1024);
act_sabad.mostCurrent._chamani.runMethod(true,"setVisible",act_sabad.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 173;BA.debugLine="chAmani.Visible=False";
Debug.ShouldStop(4096);
act_sabad.mostCurrent._chamani.runMethod(true,"setVisible",act_sabad.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 175;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 177;BA.debugLine="CmbBox1.cmbBox.Visible=False";
Debug.ShouldStop(65536);
act_sabad.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"setVisible",act_sabad.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 179;BA.debugLine="lblMablaghTakhfifiKol.Visible=False";
Debug.ShouldStop(262144);
act_sabad.mostCurrent._lblmablaghtakhfifikol.runMethod(true,"setVisible",act_sabad.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 180;BA.debugLine="txtMablaghTakhfifiKol.Visible=False";
Debug.ShouldStop(524288);
act_sabad.mostCurrent._txtmablaghtakhfifikol.runMethod(true,"setVisible",act_sabad.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 181;BA.debugLine="TxtSharhFaktor.Hint=\"علت مرجوعی کالا\"";
Debug.ShouldStop(1048576);
act_sabad.mostCurrent._txtsharhfaktor.runMethod(true,"setHint",BA.ObjectToString("علت مرجوعی کالا"));
 }else {
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e40) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e40.toString()); BA.debugLineNum = 186;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571368751",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 187;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(67108864);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-CreatePage"))));
 };
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getlocation() throws Exception{
try {
		Debug.PushSubsStack("GetLocation (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,439);
if (RapidSub.canDelegate("getlocation")) { ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","getlocation"); return;}
ResumableSub_GetLocation rsub = new ResumableSub_GetLocation(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetLocation extends BA.ResumableSub {
public ResumableSub_GetLocation(ir.parsikhesab.pakhsh.act_sabad parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_sabad parent;
RemoteObject _available = RemoteObject.createImmutable(false);
RemoteObject _result = RemoteObject.declareNull("igolub.fused.b4a.location.LocationResultWrapper");
RemoteObject _lastlocation = RemoteObject.declareNull("igolub.fused.b4a.location.android.location.LocationFWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetLocation (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,439);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 440;BA.debugLine="If Fused.IsLocationEnabledInSettings Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 20;
if (parent.mostCurrent._fused.runMethod(true,"getIsLocationEnabledInSettings").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 441;BA.debugLine="Fused.GetLocationAvailability";
Debug.ShouldStop(16777216);
parent.mostCurrent._fused.runVoidMethod ("GetLocationAvailability");
 BA.debugLineNum = 443;BA.debugLine="Wait For FusedLocation_LocationAvailabilityReque";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","fusedlocation_locationavailabilityrequestcompleted", act_sabad.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabad", "getlocation"), null);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_available = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Available", _available);
;
 BA.debugLineNum = 444;BA.debugLine="Log(\"LocationAvailable=\" & Available)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","572220677",RemoteObject.concat(RemoteObject.createImmutable("LocationAvailable="),_available),0);
 BA.debugLineNum = 445;BA.debugLine="If Available Then";
Debug.ShouldStop(268435456);
if (true) break;

case 4:
//if
this.state = 17;
if (_available.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 446;BA.debugLine="Fused.GetLastLocation";
Debug.ShouldStop(536870912);
parent.mostCurrent._fused.runVoidMethod ("GetLastLocation");
 BA.debugLineNum = 447;BA.debugLine="Wait For FusedLocation_LocationRequestCompleted";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","fusedlocation_locationrequestcompleted", act_sabad.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabad", "getlocation"), null);
this.state = 22;
return;
case 22:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 448;BA.debugLine="If Result.Status=LocationResult.STATUS_SUCCESSF";
Debug.ShouldStop(-2147483648);
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"getStatus"),BA.numberCast(double.class, parent.mostCurrent._locationresult.getField(true,"STATUS_SUCCESSFUL")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 449;BA.debugLine="If Result.Location.IsInitialized Then";
Debug.ShouldStop(1);
if (true) break;

case 10:
//if
this.state = 15;
if (_result.runMethod(false,"getLocation").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 450;BA.debugLine="Dim LastLocation As LocationF = Result.Locati";
Debug.ShouldStop(2);
_lastlocation = RemoteObject.createNew ("igolub.fused.b4a.location.android.location.LocationFWrapper");
_lastlocation = _result.runMethod(false,"getLocation");Debug.locals.put("LastLocation", _lastlocation);Debug.locals.put("LastLocation", _lastlocation);
 BA.debugLineNum = 451;BA.debugLine="Log(\"LastLocation Latitude = \" & LastLocation";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","572220684",RemoteObject.concat(RemoteObject.createImmutable("LastLocation Latitude = "),_lastlocation.runMethod(true,"getLatitude")),0);
 BA.debugLineNum = 452;BA.debugLine="Log(\"LastLocation Longitude = \" & LastLocatio";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","572220685",RemoteObject.concat(RemoteObject.createImmutable("LastLocation Longitude = "),_lastlocation.runMethod(true,"getLongitude")),0);
 BA.debugLineNum = 454;BA.debugLine="MCode.Lat = LastLocation.Latitude";
Debug.ShouldStop(32);
parent.mostCurrent._mcode._lat /*RemoteObject*/  = BA.NumberToString(_lastlocation.runMethod(true,"getLatitude"));
 BA.debugLineNum = 455;BA.debugLine="MCode.Lon = LastLocation.Longitude";
Debug.ShouldStop(64);
parent.mostCurrent._mcode._lon /*RemoteObject*/  = BA.NumberToString(_lastlocation.runMethod(true,"getLongitude"));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 458;BA.debugLine="Log(\"Unknown last location\")";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","572220691",RemoteObject.createImmutable("Unknown last location"),0);
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 463;BA.debugLine="MsgboxAsync(\"Location is turned off in devices's";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Location is turned off in devices's settings. Turn it on.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),act_sabad.processBA);
 BA.debugLineNum = 464;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabad.processBA,(Object)((parent.mostCurrent._fused.runMethod(false,"getLocationSettingsIntent").getObject())));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 466;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _fusedlocation_locationavailabilityrequestcompleted(RemoteObject _available) throws Exception{
}
public static void  _fusedlocation_locationrequestcompleted(RemoteObject _result) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private rp As RuntimePermissions";
act_sabad.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 15;BA.debugLine="Dim HLV As Hitex_LayoutView";
act_sabad.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 16;BA.debugLine="Dim Key As IME";
act_sabad.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 17;BA.debugLine="Dim ListSabad,OriginalItemList As List";
act_sabad.mostCurrent._listsabad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_sabad.mostCurrent._originalitemlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 18;BA.debugLine="Dim ListTasvie As List";
act_sabad.mostCurrent._listtasvie = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 19;BA.debugLine="Private LblBasketCount As Label";
act_sabad.mostCurrent._lblbasketcount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private BtnSabtSefaresh As Button";
act_sabad.mostCurrent._btnsabtsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LblNameMoshtari As Label";
act_sabad.mostCurrent._lblnamemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private TxtSharhFaktor As EditText";
act_sabad.mostCurrent._txtsharhfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private gmap As GoogleMap";
act_sabad.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Dialog As B4XDialog";
act_sabad.mostCurrent._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 26;BA.debugLine="Private XUI As XUI";
act_sabad.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 27;BA.debugLine="Private pnl_HLV As Panel";
act_sabad.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private pnlTop As Panel";
act_sabad.mostCurrent._pnltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private pnlNS As Panel";
act_sabad.mostCurrent._pnlns = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private FeeTip As String";
act_sabad.mostCurrent._feetip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Private SumTakhfifRiali As Long=0";
act_sabad._sumtakhfifriali = BA.numberCast(long.class, 0);
 //BA.debugLineNum = 32;BA.debugLine="Private CmbBox1 As B4XComboBox";
act_sabad.mostCurrent._cmbbox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 33;BA.debugLine="Private LblCodeMoshtari As Label";
act_sabad.mostCurrent._lblcodemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private txtMablaghTakhfifiKol As EditText";
act_sabad.mostCurrent._txtmablaghtakhfifikol = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lblMablaghTakhfifiKol As Label";
act_sabad.mostCurrent._lblmablaghtakhfifikol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lblMojavezSefareshText As Label";
act_sabad.mostCurrent._lblmojavezsefareshtext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private chAmani As ACCheckBox";
act_sabad.mostCurrent._chamani = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACCheckBoxWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Dim num As Int=0";
act_sabad._num = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 39;BA.debugLine="Private Fused As FusedLocationProviderClient";
act_sabad.mostCurrent._fused = RemoteObject.createNew ("igolub.fused.b4a.location.FusedLocationProviderClientWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Dim ShomareSefaresh As String=0";
act_sabad.mostCurrent._shomaresefaresh = BA.NumberToString(0);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,313);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","hlv_getitemcount");}
 BA.debugLineNum = 313;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="Return ListSabad.Size";
Debug.ShouldStop(33554432);
if (true) return act_sabad.mostCurrent._listsabad.runMethod(true,"getSize");
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("HLV_onBindViewHolder (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,324);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","hlv_onbindviewholder", _parent, _position);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recsabadkhariditem");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 324;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="Dim rec As cls_RecSabadKharidItem=Parent.Tag";
Debug.ShouldStop(16);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 326;BA.debugLine="rec.show_data(ListSabad.Get(Position))";
Debug.ShouldStop(32);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_show_data" /*RemoteObject*/ ,(Object)((act_sabad.mostCurrent._listsabad.runMethod(false,"Get",(Object)(_position)))));
 BA.debugLineNum = 327;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(64);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,317);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recsabadkhariditem");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 317;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="Dim rec As cls_RecSabadKharidItem";
Debug.ShouldStop(536870912);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recsabadkhariditem");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 319;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(1073741824);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_initialize" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(act_sabad.getObject()));
 BA.debugLineNum = 320;BA.debugLine="Parent.AddView(rec.Panel,0,0,rec.Width,rec.Height";
Debug.ShouldStop(-2147483648);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_getwidth" /*RemoteObject*/ )),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 321;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(1);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _kasremojodi(RemoteObject _ckala,RemoteObject _tedad) throws Exception{
try {
		Debug.PushSubsStack("KasreMojodi (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1160);
if (RapidSub.canDelegate("kasremojodi")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","kasremojodi", _ckala, _tedad);}
RemoteObject _wuseanbarak = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _tedadmande = RemoteObject.createImmutable(0);
Debug.locals.put("CKala", _ckala);
Debug.locals.put("Tedad", _tedad);
 BA.debugLineNum = 1160;BA.debugLine="Private Sub KasreMojodi(CKala As String,Tedad As I";
Debug.ShouldStop(128);
 BA.debugLineNum = 1161;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 1162;BA.debugLine="Dim WUseAnbarak As Int = myCode.getSetting(\"setti";
Debug.ShouldStop(512);
_wuseanbarak = BA.numberCast(int.class, act_sabad.mostCurrent._mycode.runMethod(true,"_getsetting" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString("setting.dat")),(Object)(BA.ObjectToString("WUseAnbarak")),(Object)(BA.NumberToString(0))));Debug.locals.put("WUseAnbarak", _wuseanbarak);Debug.locals.put("WUseAnbarak", _wuseanbarak);
 BA.debugLineNum = 1165;BA.debugLine="Dim cu As Cursor=MCode.Result(\"Select * from TblK";
Debug.ShouldStop(4096);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabad.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * from TblKala Where FldCodeKala ='"),_ckala,RemoteObject.createImmutable("'"))));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 1166;BA.debugLine="Dim tedadMande As Int=0";
Debug.ShouldStop(8192);
_tedadmande = BA.numberCast(int.class, 0);Debug.locals.put("tedadMande", _tedadmande);Debug.locals.put("tedadMande", _tedadmande);
 BA.debugLineNum = 1167;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1168;BA.debugLine="cu.Position=0";
Debug.ShouldStop(32768);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1169;BA.debugLine="If WUseAnbarak=0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_wuseanbarak,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1170;BA.debugLine="tedadMande=cu.GetString(\"SumMande\")";
Debug.ShouldStop(131072);
_tedadmande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("tedadMande", _tedadmande);
 }else {
 BA.debugLineNum = 1172;BA.debugLine="tedadMande=cu.GetString(\"SumMande\")";
Debug.ShouldStop(524288);
_tedadmande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("tedadMande", _tedadmande);
 };
 BA.debugLineNum = 1175;BA.debugLine="tedadMande=tedadMande-Tedad";
Debug.ShouldStop(4194304);
_tedadmande = RemoteObject.solve(new RemoteObject[] {_tedadmande,_tedad}, "-",1, 1);Debug.locals.put("tedadMande", _tedadmande);
 BA.debugLineNum = 1176;BA.debugLine="MCode.SaveUpdate(\"Update TblKala SET SumMande='\"";
Debug.ShouldStop(8388608);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblKala SET SumMande='"),_tedadmande,RemoteObject.createImmutable("' Where FldCodeKala ='"),_ckala,RemoteObject.createImmutable("'"))));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e16.toString()); BA.debugLineNum = 1179;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572810515",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1180;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(134217728);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-KasreMojodi"))));
 };
 BA.debugLineNum = 1182;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblexit_click() throws Exception{
try {
		Debug.PushSubsStack("LblExit_Click (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,330);
if (RapidSub.canDelegate("lblexit_click")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","lblexit_click");}
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _lblexit = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
 BA.debugLineNum = 330;BA.debugLine="Sub LblExit_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 332;BA.debugLine="Dim Res As Int";
Debug.ShouldStop(2048);
_res = RemoteObject.createImmutable(0);Debug.locals.put("Res", _res);
 BA.debugLineNum = 333;BA.debugLine="Dim LblExit As Label = Sender";
Debug.ShouldStop(4096);
_lblexit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblexit = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), act_sabad.mostCurrent.__c.runMethod(false,"Sender",act_sabad.mostCurrent.activityBA));Debug.locals.put("LblExit", _lblexit);Debug.locals.put("LblExit", _lblexit);
 BA.debugLineNum = 335;BA.debugLine="Dim Item = ListSabad.Get(LblExit.Tag) As AdapterL";
Debug.ShouldStop(16384);
_item = (act_sabad.mostCurrent._listsabad.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _lblexit.runMethod(false,"getTag")))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 336;BA.debugLine="Res=Msgbox2(\"آیا می خواهید این ردیف حذف گردد؟\",\"ت";
Debug.ShouldStop(32768);
_res = act_sabad.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("آیا می خواهید این ردیف حذف گردد؟")),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((act_sabad.mostCurrent.__c.getField(false,"Null"))),act_sabad.mostCurrent.activityBA);Debug.locals.put("Res", _res);
 BA.debugLineNum = 337;BA.debugLine="If Res=DialogResponse.POSITIVE Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, act_sabad.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 338;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where Fld";
Debug.ShouldStop(131072);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldCodeKala = '"),_item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 339;BA.debugLine="ListSabad.RemoveAt(LblExit.Tag)";
Debug.ShouldStop(262144);
act_sabad.mostCurrent._listsabad.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _lblexit.runMethod(false,"getTag"))));
 BA.debugLineNum = 340;BA.debugLine="HLV.notifyItemRemoved(LblExit.Tag)";
Debug.ShouldStop(524288);
act_sabad.mostCurrent._hlv.runVoidMethodAndSync ("notifyItemRemoved",(Object)(BA.numberCast(int.class, _lblexit.runMethod(false,"getTag"))));
 BA.debugLineNum = 341;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(1048576);
act_sabad.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 344;BA.debugLine="UpdateSumSabad";
Debug.ShouldStop(8388608);
_updatesumsabad();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e14.toString()); BA.debugLineNum = 347;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571827473",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 348;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(134217728);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LblExit_Click"))));
 };
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lbltedadjoz_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("LblTedadJoz_Click (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1276);
if (RapidSub.canDelegate("lbltedadjoz_click")) { ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","lbltedadjoz_click", _item); return;}
ResumableSub_LblTedadJoz_Click rsub = new ResumableSub_LblTedadJoz_Click(null,_item);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LblTedadJoz_Click extends BA.ResumableSub {
public ResumableSub_LblTedadJoz_Click(ir.parsikhesab.pakhsh.act_sabad parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_sabad parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblTedadJoz_Click (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1276);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 1277;BA.debugLine="Dialog.Title = \"  \"";
Debug.ShouldStop(268435456);
parent.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("  ")));
 BA.debugLineNum = 1278;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(536870912);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 1279;BA.debugLine="input.Initialize";
Debug.ShouldStop(1073741824);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA);
 BA.debugLineNum = 1280;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed";
Debug.ShouldStop(-2147483648);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" تعداد "),_item.getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 1281;BA.debugLine="Log(MCode.isFloat)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","573203717",BA.ObjectToString(parent.mostCurrent._mcode._isfloat /*RemoteObject*/ ),0);
 BA.debugLineNum = 1282;BA.debugLine="MCode.isFloat = True";
Debug.ShouldStop(2);
parent.mostCurrent._mcode._isfloat /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1283;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(4);
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(parent.mostCurrent._mcode._isfloat /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"),parent.mostCurrent.__c.getField(true,"False"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1285;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(16);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1287;BA.debugLine="input.ConfigureForNumbers(False, True)";
Debug.ShouldStop(64);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1290;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
Debug.ShouldStop(512);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1291;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(1024);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_sabad.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 1292;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_sabad.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabad", "lbltedadjoz_click"), _rs);
this.state = 27;
return;
case 27:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1293;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1294;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(8192);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1295;BA.debugLine="If res>=0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 10:
//if
this.state = 25;
if (RemoteObject.solveBoolean("g",_res,BA.numberCast(double.class, 0))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1296;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 13:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 24;
 BA.debugLineNum = 1297;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Teda";
Debug.ShouldStop(65536);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 1298;BA.debugLine="Item.TedadDarSabadJoz = res";
Debug.ShouldStop(131072);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 1299;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(262144);
_addtosabad(_item);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1301;BA.debugLine="If (Item.SumMande + Item.TedadDarSabadJoz) >=";
Debug.ShouldStop(1048576);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("g",(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "+",1, 0)),BA.numberCast(double.class, _res))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 1302;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Ted";
Debug.ShouldStop(2097152);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 1303;BA.debugLine="Item.TedadDarSabadJoz = res";
Debug.ShouldStop(4194304);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 1304;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(8388608);
_addtosabad(_item);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1306;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 1310;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(536870912);
parent.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 1313;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _lbltedadkol_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("LblTedadkol_Click (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1315);
if (RapidSub.canDelegate("lbltedadkol_click")) { ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","lbltedadkol_click", _item); return;}
ResumableSub_LblTedadkol_Click rsub = new ResumableSub_LblTedadkol_Click(null,_item);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LblTedadkol_Click extends BA.ResumableSub {
public ResumableSub_LblTedadkol_Click(ir.parsikhesab.pakhsh.act_sabad parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_sabad parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblTedadkol_Click (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1315);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 1316;BA.debugLine="Dialog.Title = \"  \"";
Debug.ShouldStop(8);
parent.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("  ")));
 BA.debugLineNum = 1317;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(16);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 1318;BA.debugLine="input.Initialize";
Debug.ShouldStop(32);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA);
 BA.debugLineNum = 1319;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed2";
Debug.ShouldStop(64);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" تعداد "),_item.getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 1320;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(128);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1322;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
Debug.ShouldStop(512);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1323;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(1024);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_sabad.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 1324;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_sabad.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabad", "lbltedadkol_click"), _rs);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1325;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1326;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(8192);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1327;BA.debugLine="If res>=0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 4:
//if
this.state = 19;
if (RemoteObject.solveBoolean("g",_res,BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1328;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
 BA.debugLineNum = 1329;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Ted";
Debug.ShouldStop(65536);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 1330;BA.debugLine="Item.TedadDarSabadKol = res";
Debug.ShouldStop(131072);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 1331;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(262144);
_addtosabad(_item);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1333;BA.debugLine="If (Item.SumMande + (Item.TedadDarSabadKol*Ite";
Debug.ShouldStop(1048576);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("g",(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "+",1, 0)),(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 1334;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Te";
Debug.ShouldStop(2097152);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 1335;BA.debugLine="Item.TedadDarSabadKol = res";
Debug.ShouldStop(4194304);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 1336;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(8388608);
_addtosabad(_item);
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1338;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 1342;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(536870912);
parent.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 1344;BA.debugLine="End Sub";
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
public static RemoteObject  _loadacspnoetasvie() throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpNoeTasvie (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,111);
if (RapidSub.canDelegate("loadacspnoetasvie")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","loadacspnoetasvie");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _somearray = null;
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
 BA.debugLineNum = 111;BA.debugLine="Sub LoadAcSpNoeTasvie As List";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 113;BA.debugLine="Dim ListTasvie As List";
Debug.ShouldStop(65536);
act_sabad.mostCurrent._listtasvie = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 114;BA.debugLine="ListTasvie.Initialize";
Debug.ShouldStop(131072);
act_sabad.mostCurrent._listtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 115;BA.debugLine="Dim Cu As Cursor =MCode.Result(\"Select * From Tbl";
Debug.ShouldStop(262144);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabad.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblTasvie")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 116;BA.debugLine="Dim SomeArray(Cu.RowCount+1) As String";
Debug.ShouldStop(524288);
_somearray = RemoteObject.createNewArray ("String", new int[] {RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("SomeArray", _somearray);
 BA.debugLineNum = 117;BA.debugLine="SomeArray(0)=\"انتخاب کنید\"";
Debug.ShouldStop(1048576);
_somearray.setArrayElement (BA.ObjectToString("انتخاب کنید"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 118;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 119;BA.debugLine="For i = 0 To Cu.RowCount-1";
Debug.ShouldStop(4194304);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 120;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(8388608);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 121;BA.debugLine="Dim Item As AdapterListNoeTasvie";
Debug.ShouldStop(16777216);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("Item", _item);
 BA.debugLineNum = 122;BA.debugLine="Item.FldC_Tasvie=Cu.GetString(\"FldCode\")";
Debug.ShouldStop(33554432);
_item.setField ("FldC_Tasvie" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCode"))));
 BA.debugLineNum = 123;BA.debugLine="Item.FldN_Tasvie=Cu.GetString(\"FldName\")";
Debug.ShouldStop(67108864);
_item.setField ("FldN_Tasvie" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldName"))));
 BA.debugLineNum = 124;BA.debugLine="ListTasvie.Add(Item)";
Debug.ShouldStop(134217728);
act_sabad.mostCurrent._listtasvie.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 126;BA.debugLine="SomeArray(i+1)=Cu.GetString(\"FldName\")";
Debug.ShouldStop(536870912);
_somearray.setArrayElement (_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldName"))),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 129;BA.debugLine="MCode.ArrayTasvieForKala=SomeArray";
Debug.ShouldStop(1);
act_sabad.mostCurrent._mcode._arraytasvieforkala /*RemoteObject*/  = _somearray;
 };
 BA.debugLineNum = 131;BA.debugLine="Return ListTasvie";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return act_sabad.mostCurrent._listtasvie;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e20.toString()); BA.debugLineNum = 134;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571303191",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 135;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(64);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadAcSpNoeTasvie"))));
 BA.debugLineNum = 136;BA.debugLine="Return Null";
Debug.ShouldStop(128);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), act_sabad.mostCurrent.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadlistsabad() throws Exception{
try {
		Debug.PushSubsStack("LoadListSabad (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,191);
if (RapidSub.canDelegate("loadlistsabad")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","loadlistsabad");}
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _itemkala = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _summande = RemoteObject.createImmutable("");
RemoteObject _fldfeeforoosh = RemoteObject.createImmutable(0);
RemoteObject _fldtedaddarkarton = RemoteObject.createImmutable(0);
 BA.debugLineNum = 191;BA.debugLine="Sub LoadListSabad";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 193;BA.debugLine="ProgressDialogShow(\"\")";
Debug.ShouldStop(1);
act_sabad.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 194;BA.debugLine="OriginalItemList.Clear";
Debug.ShouldStop(2);
act_sabad.mostCurrent._originalitemlist.runVoidMethod ("Clear");
 BA.debugLineNum = 195;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(4);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_sabad.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu1", _cu1);Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 196;BA.debugLine="SumTakhfifRiali=0";
Debug.ShouldStop(8);
act_sabad._sumtakhfifriali = BA.numberCast(long.class, 0);
 BA.debugLineNum = 197;BA.debugLine="LogColor(Cu1.RowCount,Colors.Red)";
Debug.ShouldStop(16);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571434246",BA.NumberToString(_cu1.runMethod(true,"getRowCount")),act_sabad.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 198;BA.debugLine="For i=0 To Cu1.RowCount-1";
Debug.ShouldStop(32);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_cu1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 199;BA.debugLine="Cu1.Position=i";
Debug.ShouldStop(64);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 200;BA.debugLine="Dim ItemKala As AdapterListKala";
Debug.ShouldStop(128);
_itemkala = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");Debug.locals.put("ItemKala", _itemkala);
 BA.debugLineNum = 201;BA.debugLine="ItemKala.CodeKala=Cu1.Getstring(\"FldCodeKala\")";
Debug.ShouldStop(256);
_itemkala.setField ("CodeKala" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))));
 BA.debugLineNum = 202;BA.debugLine="ItemKala.NameKala=Cu1.Getstring(\"FldNameKala\")";
Debug.ShouldStop(512);
_itemkala.setField ("NameKala" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNameKala"))));
 BA.debugLineNum = 203;BA.debugLine="ItemKala.FeeForoosh=Cu1.Getstring(\"FldFeeForoosh";
Debug.ShouldStop(1024);
_itemkala.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFeeForoosh")))));
 BA.debugLineNum = 204;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu1.Getstring(\"fldFe";
Debug.ShouldStop(2048);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 BA.debugLineNum = 205;BA.debugLine="ItemKala.NameVahed=Cu1.Getstring(\"FldNamevahed\")";
Debug.ShouldStop(4096);
_itemkala.setField ("NameVahed" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNamevahed"))));
 BA.debugLineNum = 206;BA.debugLine="ItemKala.NameVahed2=Cu1.Getstring(\"FldNameVahed2";
Debug.ShouldStop(8192);
_itemkala.setField ("NameVahed2" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldNameVahed2"))));
 BA.debugLineNum = 207;BA.debugLine="ItemKala.fldPathPic=Cu1.Getstring(\"fldPathPic\")";
Debug.ShouldStop(16384);
_itemkala.setField ("fldPathPic" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))));
 BA.debugLineNum = 208;BA.debugLine="ItemKala.TedadDarSabadJoz=myCode.Is_Null_adad(Cu";
Debug.ShouldStop(32768);
_itemkala.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))))));
 BA.debugLineNum = 209;BA.debugLine="ItemKala.TedadDarSabadKol=myCode.Is_Null_adad(Cu";
Debug.ShouldStop(65536);
_itemkala.setField ("TedadDarSabadKol" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))))));
 BA.debugLineNum = 210;BA.debugLine="ItemKala.Tozihat=myCode.Is_Null(Cu1.Getstring(\"F";
Debug.ShouldStop(131072);
_itemkala.setField ("Tozihat" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTozihat"))))));
 BA.debugLineNum = 211;BA.debugLine="ItemKala.FldMablaghMasrafKonande=myCode.Is_Null(";
Debug.ShouldStop(262144);
_itemkala.setField ("FldMablaghMasrafKonande" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghMasrafKonande"))))));
 BA.debugLineNum = 212;BA.debugLine="ItemKala.MablaghTakhfif=myCode.Is_Null_adad(Cu1.";
Debug.ShouldStop(524288);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif")))))));
 BA.debugLineNum = 213;BA.debugLine="ItemKala.fldDarsadTakhfif=myCode.Is_Null_adad(Cu";
Debug.ShouldStop(1048576);
_itemkala.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif"))))));
 BA.debugLineNum = 214;BA.debugLine="ItemKala.fldArzeshAfzodeKala=myCode.Is_Null_adad";
Debug.ShouldStop(2097152);
_itemkala.setField ("fldArzeshAfzodeKala" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldArzeshAfzode"))))));
 BA.debugLineNum = 215;BA.debugLine="ItemKala.fldDarsadArzeshAfzodeKala=myCode.Is_Nul";
Debug.ShouldStop(4194304);
_itemkala.setField ("fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDarsadArzeshAfzode"))))));
 BA.debugLineNum = 216;BA.debugLine="ItemKala.TedadDarKarton=myCode.Is_Null_adad(Cu1.";
Debug.ShouldStop(8388608);
_itemkala.setField ("TedadDarKarton" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarKarton"))))));
 BA.debugLineNum = 217;BA.debugLine="If MCode.Action<>\"SabtMarjooii\" And MCode.Actio";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",act_sabad.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii")) && RemoteObject.solveBoolean("!",act_sabad.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("UpdateMarjooii"))) { 
 BA.debugLineNum = 219;BA.debugLine="Dim SumMande As String=MCode.SingleResult(\"sel";
Debug.ShouldStop(67108864);
_summande = BA.ObjectToString(act_sabad.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select SumMande from TblKala where FldCodeKala="),_itemkala.getField(true,"CodeKala" /*RemoteObject*/ )))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 220;BA.debugLine="ItemKala.SumMande=SumMande-ItemKala.TedadDarSa";
Debug.ShouldStop(134217728);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _summande),BA.numberCast(double.class, _itemkala.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "-",1, 0)));
 BA.debugLineNum = 221;BA.debugLine="If ItemKala.NameVahed2 <> \"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",_itemkala.getField(true,"NameVahed2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 222;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu1.G";
Debug.ShouldStop(536870912);
_fldfeeforoosh = BA.numberCast(int.class, act_sabad.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 223;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(C";
Debug.ShouldStop(1073741824);
_fldtedaddarkarton = BA.numberCast(int.class, act_sabad.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 225;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fld";
Debug.ShouldStop(1);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 226;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fl";
Debug.ShouldStop(2);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_sabad.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _summande),_fldtedaddarkarton}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0))),BA.numberCast(double.class, act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_itemkala.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))))}, "-",1, 0)));
 };
 BA.debugLineNum = 237;BA.debugLine="Log(ItemKala.SumMande)";
Debug.ShouldStop(4096);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571434286",_itemkala.getField(true,"SumMande" /*RemoteObject*/ ),0);
 }else {
 BA.debugLineNum = 247;BA.debugLine="Dim SumMande As String=MCode.SingleResult(\"sel";
Debug.ShouldStop(4194304);
_summande = BA.ObjectToString(act_sabad.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select SumMande from TblKala where FldCodeKala="),_itemkala.getField(true,"CodeKala" /*RemoteObject*/ )))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 248;BA.debugLine="ItemKala.SumMande=SumMande";
Debug.ShouldStop(8388608);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,_summande);
 BA.debugLineNum = 249;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / myC";
Debug.ShouldStop(16777216);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_sabad.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _summande),BA.numberCast(double.class, act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarKarton"))))))}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0))),BA.numberCast(double.class, _itemkala.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))}, "-",1, 0)));
 };
 BA.debugLineNum = 252;BA.debugLine="ItemKala.FldEshantion=myCode.Is_Null_adad(Cu1.Ge";
Debug.ShouldStop(134217728);
_itemkala.setField ("FldEshantion" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion"))))));
 BA.debugLineNum = 253;BA.debugLine="ItemKala.fldShomareForoosh=myCode.Is_Null_adad(C";
Debug.ShouldStop(268435456);
_itemkala.setField ("fldShomareForoosh" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))))));
 BA.debugLineNum = 254;BA.debugLine="ItemKala.FldAmani=myCode.Is_Null_adad(Cu1.Getstr";
Debug.ShouldStop(536870912);
_itemkala.setField ("FldAmani" /*RemoteObject*/ ,act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAmani"))))));
 BA.debugLineNum = 255;BA.debugLine="If MCode.IsAmani=1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._isamani /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 256;BA.debugLine="chAmani.Checked=True";
Debug.ShouldStop(-2147483648);
act_sabad.mostCurrent._chamani.runMethodAndSync(true,"setChecked",act_sabad.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 258;BA.debugLine="chAmani.Checked=False";
Debug.ShouldStop(2);
act_sabad.mostCurrent._chamani.runMethodAndSync(true,"setChecked",act_sabad.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 260;BA.debugLine="OriginalItemList.Add(ItemKala)";
Debug.ShouldStop(8);
act_sabad.mostCurrent._originalitemlist.runVoidMethod ("Add",(Object)((_itemkala)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 262;BA.debugLine="ListSabad=OriginalItemList";
Debug.ShouldStop(32);
act_sabad.mostCurrent._listsabad = act_sabad.mostCurrent._originalitemlist;
 BA.debugLineNum = 263;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(64);
act_sabad.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 266;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
act_sabad.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 267;BA.debugLine="If ListSabad.Size=0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._listsabad.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 269;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
act_sabad.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 270;BA.debugLine="CallSubDelayed(Act_KalaDefault,\"btn_Back_Click\"";
Debug.ShouldStop(8192);
act_sabad.mostCurrent.__c.runVoidMethod ("CallSubDelayed",act_sabad.processBA,(Object)((act_sabad.mostCurrent._act_kaladefault.getObject())),(Object)(RemoteObject.createImmutable("btn_Back_Click")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e59) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e59.toString()); BA.debugLineNum = 273;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571434322",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 274;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(131072);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadListSabad"))));
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
public static RemoteObject  _loadnoetasvie() throws Exception{
try {
		Debug.PushSubsStack("LoadNoeTasvie (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,278);
if (RapidSub.canDelegate("loadnoetasvie")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","loadnoetasvie");}
RemoteObject _itemtasvie = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
RemoteObject _count = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 278;BA.debugLine="Sub LoadNoeTasvie";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 279;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 280;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
Debug.ShouldStop(8388608);
_itemtasvie = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 281;BA.debugLine="ItemTasvie.Initialize";
Debug.ShouldStop(16777216);
_itemtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 282;BA.debugLine="CmbBox1.cmbBox.Add(\"انتخاب کنید\")";
Debug.ShouldStop(33554432);
act_sabad.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("انتخاب کنید")));
 BA.debugLineNum = 283;BA.debugLine="Dim count As Int =ListTasvie.Size";
Debug.ShouldStop(67108864);
_count = act_sabad.mostCurrent._listtasvie.runMethod(true,"getSize");Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 284;BA.debugLine="If count> 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 285;BA.debugLine="For i = 0 To count-1";
Debug.ShouldStop(268435456);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 286;BA.debugLine="ItemTasvie=ListTasvie.Get(i)";
Debug.ShouldStop(536870912);
_itemtasvie = (act_sabad.mostCurrent._listtasvie.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 288;BA.debugLine="CmbBox1.cmbBox.Add(ItemTasvie.FldN_Tasvie)";
Debug.ShouldStop(-2147483648);
act_sabad.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itemtasvie.getField(true,"FldN_Tasvie" /*RemoteObject*/ )));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 290;BA.debugLine="CmbBox1.SelectedIndex=MCode.feeTip";
Debug.ShouldStop(2);
act_sabad.mostCurrent._cmbbox1.runClassMethod (ir.parsikhesab.pakhsh.b4xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, act_sabad.mostCurrent._mcode._feetip /*RemoteObject*/ ));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e14.toString()); BA.debugLineNum = 293;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571499791",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 294;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadNoeTasvie"))));
 };
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mojavezsefaresh() throws Exception{
try {
		Debug.PushSubsStack("MojavezSefaresh (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,100);
if (RapidSub.canDelegate("mojavezsefaresh")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","mojavezsefaresh");}
 BA.debugLineNum = 100;BA.debugLine="Private Sub MojavezSefaresh";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Select MCode.MojavezSefaresh";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(act_sabad.mostCurrent._mcode._mojavezsefaresh /*RemoteObject*/ ,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2))) {
case 0: {
 BA.debugLineNum = 103;BA.debugLine="lblMojavezSefareshText.Text=\"\"";
Debug.ShouldStop(64);
act_sabad.mostCurrent._lblmojavezsefareshtext.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 break; }
case 1: {
 BA.debugLineNum = 105;BA.debugLine="lblMojavezSefareshText.Text=\"توجه : شما مجوز فر";
Debug.ShouldStop(256);
act_sabad.mostCurrent._lblmojavezsefareshtext.runMethod(true,"setText",BA.ObjectToCharSequence("توجه : شما مجوز فروش کل را ندارید"));
 break; }
case 2: {
 BA.debugLineNum = 107;BA.debugLine="lblMojavezSefareshText.Text=\"توجه : شما مجوز فر";
Debug.ShouldStop(1024);
act_sabad.mostCurrent._lblmojavezsefareshtext.runMethod(true,"setText",BA.ObjectToCharSequence("توجه : شما مجوز فروش جزء را ندارید"));
 break; }
}
;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 10;BA.debugLine="Private ion As Object";
act_sabad._ion = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refreshlblsabad() throws Exception{
try {
		Debug.PushSubsStack("RefreshLblSabad (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,298);
if (RapidSub.canDelegate("refreshlblsabad")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","refreshlblsabad");}
 BA.debugLineNum = 298;BA.debugLine="Sub RefreshLblSabad";
Debug.ShouldStop(512);
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savechange() throws Exception{
try {
		Debug.PushSubsStack("SaveChange (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,386);
if (RapidSub.canDelegate("savechange")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","savechange");}
 BA.debugLineNum = 386;BA.debugLine="Sub SaveChange";
Debug.ShouldStop(2);
 BA.debugLineNum = 387;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(4);
act_sabad.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 388;BA.debugLine="UpdateSumSabad";
Debug.ShouldStop(8);
_updatesumsabad();
 BA.debugLineNum = 389;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _savefaktor() throws Exception{
try {
		Debug.PushSubsStack("SaveFaktor (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,603);
if (RapidSub.canDelegate("savefaktor")) { ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","savefaktor"); return;}
ResumableSub_SaveFaktor rsub = new ResumableSub_SaveFaktor(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SaveFaktor extends BA.ResumableSub {
public ResumableSub_SaveFaktor(ir.parsikhesab.pakhsh.act_sabad parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_sabad parent;
RemoteObject _shomarefaktor = RemoteObject.createImmutable(0);
RemoteObject _imagesignature = RemoteObject.createImmutable("");
RemoteObject _pdate = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _dt = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _itemtasvie = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
RemoteObject _sum = RemoteObject.createImmutable(0L);
RemoteObject _summablaghtakhfifvizhe = RemoteObject.createImmutable(0L);
RemoteObject _summablaghtakhfifkala = RemoteObject.createImmutable(0L);
RemoteObject _mablaghtakhfifkol = RemoteObject.createImmutable(0L);
RemoteObject _totalfaktor = RemoteObject.createImmutable(0L);
RemoteObject _mablagharzeshafzode = RemoteObject.createImmutable(0L);
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _fee = RemoteObject.createImmutable(0);
RemoteObject _fldfeebadaztakhfif = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step38;
int limit38;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SaveFaktor (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,603);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 604;BA.debugLine="Try";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//try
this.state = 74;
this.catchState = 73;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 73;
 BA.debugLineNum = 608;BA.debugLine="Dim ShomareFaktor As Int";
Debug.ShouldStop(-2147483648);
_shomarefaktor = RemoteObject.createImmutable(0);Debug.locals.put("ShomareFaktor", _shomarefaktor);
 BA.debugLineNum = 609;BA.debugLine="Dim ImageSignature As String";
Debug.ShouldStop(1);
_imagesignature = RemoteObject.createImmutable("");Debug.locals.put("ImageSignature", _imagesignature);
 BA.debugLineNum = 612;BA.debugLine="Dim pDate As String = MCode.ConvertNumbersPersian";
Debug.ShouldStop(8);
_pdate = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(parent.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA)));Debug.locals.put("pDate", _pdate);Debug.locals.put("pDate", _pdate);
 BA.debugLineNum = 613;BA.debugLine="Dim Time As String = MCode.ConvertNumToTime(MCode";
Debug.ShouldStop(16);
_time = parent.mostCurrent._mcode.runMethod(true,"_convertnumtotime" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 617;BA.debugLine="Dim DT As String=TxtSharhFaktor.text &\" (\"&pDate";
Debug.ShouldStop(256);
_dt = RemoteObject.concat(parent.mostCurrent._txtsharhfaktor.runMethod(true,"getText"),RemoteObject.createImmutable(" ("),_pdate,RemoteObject.createImmutable("-"),_time,RemoteObject.createImmutable(") "));Debug.locals.put("DT", _dt);Debug.locals.put("DT", _dt);
 BA.debugLineNum = 618;BA.debugLine="Log(\"->>\"&DT)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","572417295",RemoteObject.concat(RemoteObject.createImmutable("->>"),_dt),0);
 BA.debugLineNum = 619;BA.debugLine="If MCode.FaktorSelect = \"\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,BA.ObjectToString(""))) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 620;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select Max(Cast";
Debug.ShouldStop(2048);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select Max(Cast(FldShomareFaktor As Int)) As MaxFldShomareFaktor From TblFaktor")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 621;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(4096);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 622;BA.debugLine="If Cu.GetString(\"MaxFldShomareFaktor\") = Null Th";
Debug.ShouldStop(8192);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("n",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MaxFldShomareFaktor"))))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 623;BA.debugLine="ShomareFaktor = 1";
Debug.ShouldStop(16384);
_shomarefaktor = BA.numberCast(int.class, 1);Debug.locals.put("ShomareFaktor", _shomarefaktor);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 625;BA.debugLine="ShomareFaktor = Cu.GetString(\"MaxFldShomareFakt";
Debug.ShouldStop(65536);
_shomarefaktor = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MaxFldShomareFaktor")))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("ShomareFaktor", _shomarefaktor);
 if (true) break;

case 12:
//C
this.state = 15;
;
 BA.debugLineNum = 627;BA.debugLine="ShomareSefaresh=ShomareFaktor";
Debug.ShouldStop(262144);
parent.mostCurrent._shomaresefaresh = BA.NumberToString(_shomarefaktor);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 629;BA.debugLine="ShomareFaktor = MCode.FaktorSelect";
Debug.ShouldStop(1048576);
_shomarefaktor = BA.numberCast(int.class, parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ );Debug.locals.put("ShomareFaktor", _shomarefaktor);
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 632;BA.debugLine="Dim ItemTasvie=ListTasvie.Get(CmbBox1.SelectedInd";
Debug.ShouldStop(8388608);
_itemtasvie = (parent.mostCurrent._listtasvie.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._cmbbox1.runClassMethod (ir.parsikhesab.pakhsh.b4xcombobox.class, "_getselectedindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("ItemTasvie", _itemtasvie);Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 633;BA.debugLine="If TxtSharhFaktor.Text.Trim = \"\" Then TxtSharhFak";
Debug.ShouldStop(16777216);
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._txtsharhfaktor.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
parent.mostCurrent._txtsharhfaktor.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 635;BA.debugLine="If MCode.FaktorSelect <> \"\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,BA.ObjectToString(""))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 636;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor Where Fl";
Debug.ShouldStop(134217728);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblFaktor Where FldShomareFaktor = '"),parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 645;BA.debugLine="Dim Sum As Long = MCode.FinalFaktor.KhamFaktor";
Debug.ShouldStop(16);
_sum = BA.numberCast(long.class, parent.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"KhamFaktor" /*RemoteObject*/ ));Debug.locals.put("Sum", _sum);Debug.locals.put("Sum", _sum);
 BA.debugLineNum = 646;BA.debugLine="Dim SumMablaghTakhfifVizhe As Long=MCode.FinalFak";
Debug.ShouldStop(32);
_summablaghtakhfifvizhe = BA.numberCast(long.class, parent.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"TakhfifVizhe" /*RemoteObject*/ ));Debug.locals.put("SumMablaghTakhfifVizhe", _summablaghtakhfifvizhe);Debug.locals.put("SumMablaghTakhfifVizhe", _summablaghtakhfifvizhe);
 BA.debugLineNum = 647;BA.debugLine="Dim SumMablaghTakhfifKala As Long=MCode.FinalFakt";
Debug.ShouldStop(64);
_summablaghtakhfifkala = BA.numberCast(long.class, parent.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"TakhfifKala" /*RemoteObject*/ ));Debug.locals.put("SumMablaghTakhfifKala", _summablaghtakhfifkala);Debug.locals.put("SumMablaghTakhfifKala", _summablaghtakhfifkala);
 BA.debugLineNum = 648;BA.debugLine="Dim MablaghTakhfifKol As Long=SumMablaghTakhfifKa";
Debug.ShouldStop(128);
_mablaghtakhfifkol = RemoteObject.solve(new RemoteObject[] {_summablaghtakhfifkala,_summablaghtakhfifvizhe}, "+",1, 2);Debug.locals.put("MablaghTakhfifKol", _mablaghtakhfifkol);Debug.locals.put("MablaghTakhfifKol", _mablaghtakhfifkol);
 BA.debugLineNum = 650;BA.debugLine="Dim TotalFaktor As Long = MCode.FinalFaktor.Gable";
Debug.ShouldStop(512);
_totalfaktor = BA.numberCast(long.class, parent.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"GablePardakht" /*RemoteObject*/ ));Debug.locals.put("TotalFaktor", _totalfaktor);Debug.locals.put("TotalFaktor", _totalfaktor);
 BA.debugLineNum = 651;BA.debugLine="Dim MablaghArzeshAfzode As Long=MCode.MohasbeArze";
Debug.ShouldStop(1024);
_mablagharzeshafzode = parent.mostCurrent._mcode.runMethod(true,"_mohasbearzeshafzode" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_totalfaktor));Debug.locals.put("MablaghArzeshAfzode", _mablagharzeshafzode);Debug.locals.put("MablaghArzeshAfzode", _mablagharzeshafzode);
 BA.debugLineNum = 653;BA.debugLine="If MCode.Signature = 1 Then";
Debug.ShouldStop(4096);
if (true) break;

case 26:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._signature /*RemoteObject*/ ,BA.NumberToString(1))) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 654;BA.debugLine="ImageSignature =MCode.Encrypted(MCode.ConvertBlo";
Debug.ShouldStop(8192);
_imagesignature = parent.mostCurrent._mcode.runMethod(true,"_encrypted" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(parent.mostCurrent._mcode.runMethod(true,"_convertblobtostring" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Signature"))),(Object)(RemoteObject.concat(parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable(".png"))))));Debug.locals.put("ImageSignature", _imagesignature);
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 656;BA.debugLine="ImageSignature = \"\"";
Debug.ShouldStop(32768);
_imagesignature = BA.ObjectToString("");Debug.locals.put("ImageSignature", _imagesignature);
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 659;BA.debugLine="Dim lst As List";
Debug.ShouldStop(262144);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 660;BA.debugLine="lst.Initialize";
Debug.ShouldStop(524288);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 661;BA.debugLine="For i=0 To OriginalItemList.Size-1";
Debug.ShouldStop(1048576);
if (true) break;

case 32:
//for
this.state = 55;
step38 = 1;
limit38 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._originalitemlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 75;
if (true) break;

case 75:
//C
this.state = 55;
if ((step38 > 0 && _i <= limit38) || (step38 < 0 && _i >= limit38)) this.state = 34;
if (true) break;

case 76:
//C
this.state = 75;
_i = ((int)(0 + _i + step38)) ;
Debug.locals.put("i", _i);
if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 662;BA.debugLine="Dim Item = OriginalItemList.Get(i) As AdapterLis";
Debug.ShouldStop(2097152);
_item = (parent.mostCurrent._originalitemlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 663;BA.debugLine="Dim fee As Int";
Debug.ShouldStop(4194304);
_fee = RemoteObject.createImmutable(0);Debug.locals.put("fee", _fee);
 BA.debugLineNum = 664;BA.debugLine="Dim fldFeeBadAzTakhfif As Int=Item.fldFeeBadAzTa";
Debug.ShouldStop(8388608);
_fldfeebadaztakhfif = BA.numberCast(int.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ));Debug.locals.put("fldFeeBadAzTakhfif", _fldfeebadaztakhfif);Debug.locals.put("fldFeeBadAzTakhfif", _fldfeebadaztakhfif);
 BA.debugLineNum = 665;BA.debugLine="If Item.TedadDarSabadJoz>0 Or Item.TedadDarSabad";
Debug.ShouldStop(16777216);
if (true) break;

case 35:
//if
this.state = 51;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 667;BA.debugLine="fee= Item.FeeForoosh";
Debug.ShouldStop(67108864);
_fee = _item.getField(true,"FeeForoosh" /*RemoteObject*/ );Debug.locals.put("fee", _fee);
 BA.debugLineNum = 668;BA.debugLine="Dim m As Map";
Debug.ShouldStop(134217728);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 669;BA.debugLine="m.Initialize";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 670;BA.debugLine="m.Put(\"FldRadif\",i+1)";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldRadif"))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 671;BA.debugLine="m.Put(\"FldC_Visitor\",MCode.C_Visitor)";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Visitor"))),(Object)((parent.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 672;BA.debugLine="m.Put(\"FldC_Tafzili\",MCode.C_Tafzili)";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Tafzili"))),(Object)((parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ )));
 BA.debugLineNum = 673;BA.debugLine="m.Put(\"FldN_Tafzili\",MCode.N_Tafzili)";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldN_Tafzili"))),(Object)((parent.mostCurrent._mcode._n_tafzili /*RemoteObject*/ )));
 BA.debugLineNum = 674;BA.debugLine="m.Put(\"FldShomareFaktor\",ShomareFaktor)";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareFaktor"))),(Object)((_shomarefaktor)));
 BA.debugLineNum = 675;BA.debugLine="m.Put(\"FldShomareBargasht\",0)";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareBargasht"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 676;BA.debugLine="m.Put(\"FldCodeKala\",Item.CodeKala)";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCodeKala"))),(Object)((_item.getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 677;BA.debugLine="m.Put(\"FldNameKala\",Item.NameKala)";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameKala"))),(Object)((_item.getField(true,"NameKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 678;BA.debugLine="m.Put(\"FldFeeForoosh\",fee)";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldFeeForoosh"))),(Object)((_fee)));
 BA.debugLineNum = 679;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Item.FldFeeBadAzTakh";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldFeeBadAzTakhfif"))),(Object)((_item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))));
 BA.debugLineNum = 680;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Item.MablaghTakhfif)";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfif"))),(Object)((_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ))));
 BA.debugLineNum = 681;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",IIf(Item.Mabl";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifVizhe"))),(Object)(((RemoteObject.solveBoolean(">",_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) ? ((_summablaghtakhfifvizhe)) : (RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 682;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",SumMablaghTakh";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifKala"))),(Object)((_summablaghtakhfifkala)));
 BA.debugLineNum = 683;BA.debugLine="m.Put(\"FldNameVahed\",Item.NameVahed)";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameVahed"))),(Object)((_item.getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 684;BA.debugLine="m.Put(\"FldNameVahed2\",Item.NameVahed2)";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameVahed2"))),(Object)((_item.getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 685;BA.debugLine="m.Put(\"FldSumMande\",Item.SumMande)";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMande"))),(Object)((_item.getField(true,"SumMande" /*RemoteObject*/ ))));
 BA.debugLineNum = 686;BA.debugLine="m.Put(\"fldPathPic\",Item.fldPathPic)";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldPathPic"))),(Object)((_item.getField(true,"fldPathPic" /*RemoteObject*/ ))));
 BA.debugLineNum = 687;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Item.TedadDarSabadJ";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadJoz"))),(Object)((_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))));
 BA.debugLineNum = 688;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Item.TedadDarSabadK";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadKol"))),(Object)((_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))));
 BA.debugLineNum = 689;BA.debugLine="m.Put(\"FldTedadDarkarton\",Item.TedadDarKarton)";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarkarton"))),(Object)((_item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 BA.debugLineNum = 690;BA.debugLine="m.Put(\"FldTotalFaktor\",IIf(Item.fldDarsadTakhfi";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTotalFaktor"))),(Object)(((RemoteObject.solveBoolean("=",_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ),BA.NumberToString(100))) ? (RemoteObject.createImmutable((0))) : ((_totalfaktor)))));
 BA.debugLineNum = 691;BA.debugLine="m.Put(\"FldTozihat\",Item.Tozihat)";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozihat"))),(Object)((_item.getField(true,"Tozihat" /*RemoteObject*/ ))));
 BA.debugLineNum = 692;BA.debugLine="m.Put(\"FldTozih\",TxtSharhFaktor.Text & \" (\" & C";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozih"))),(Object)((RemoteObject.concat(parent.mostCurrent._txtsharhfaktor.runMethod(true,"getText"),RemoteObject.createImmutable(" ("),parent.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"getSelectedItem"),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 693;BA.debugLine="m.Put(\"FldVaziatPardakht\",ItemTasvie.FldC_Tasvi";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVaziatPardakht"))),(Object)((_itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ ))));
 BA.debugLineNum = 694;BA.debugLine="m.Put(\"FldMablaghKol\",Sum)";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghKol"))),(Object)((_sum)));
 BA.debugLineNum = 695;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",MablaghTakhfifKol)";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfifKol"))),(Object)((_mablaghtakhfifkol)));
 BA.debugLineNum = 696;BA.debugLine="m.Put(\"FldDarsadTakhfif\",myCode.Is_Null_adad(It";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDarsadTakhfif"))),(Object)((parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))))));
 BA.debugLineNum = 697;BA.debugLine="m.Put(\"fldArzeshAfzode\",Item.fldArzeshAfzodeKal";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldArzeshAfzode"))),(Object)((_item.getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 698;BA.debugLine="m.Put(\"fldDarsadArzeshAfzode\",Item.fldDarsadArz";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldDarsadArzeshAfzode"))),(Object)((_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 701;BA.debugLine="m.Put(\"FldTarikh\",pDate)";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTarikh"))),(Object)((_pdate)));
 BA.debugLineNum = 702;BA.debugLine="m.Put(\"FldDate\",pDate)";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDate"))),(Object)((_pdate)));
 BA.debugLineNum = 703;BA.debugLine="m.Put(\"FldTime\",Time)";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTime"))),(Object)((_time)));
 BA.debugLineNum = 704;BA.debugLine="m.Put(\"FldSignatureBitmapString\",ImageSignature";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSignatureBitmapString"))),(Object)((_imagesignature)));
 BA.debugLineNum = 705;BA.debugLine="m.Put(\"fldShomareForoosh\",myCode.Is_Null_adad(I";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareForoosh"))),(Object)((parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldShomareForoosh" /*RemoteObject*/ ))))));
 BA.debugLineNum = 706;BA.debugLine="m.Put(\"FldSync\",\"False\")";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSync"))),(Object)((RemoteObject.createImmutable("False"))));
 BA.debugLineNum = 707;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WIsBacked"))),(Object)((RemoteObject.createImmutable("False"))));
 BA.debugLineNum = 708;BA.debugLine="m.Put(\"FldType\",\"Foroosh\")";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldType"))),(Object)((RemoteObject.createImmutable("Foroosh"))));
 BA.debugLineNum = 709;BA.debugLine="m.Put(\"FldAmani\",MCode.isAmani)";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAmani"))),(Object)((parent.mostCurrent._mcode._isamani /*RemoteObject*/ )));
 BA.debugLineNum = 710;BA.debugLine="m.Put(\"WSendFrom\",3)";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WSendFrom"))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 711;BA.debugLine="lst.Add(m)";
Debug.ShouldStop(64);
_lst.runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 715;BA.debugLine="If Item.TedadDarSabadJoz>0 And Item.TedadDarSab";
Debug.ShouldStop(1024);
if (true) break;

case 38:
//if
this.state = 50;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 50;
 BA.debugLineNum = 716;BA.debugLine="KasreMojodi(Item.CodeKala,Item.TedadDarSabadJ";
Debug.ShouldStop(2048);
_kasremojodi(_item.getField(true,"CodeKala" /*RemoteObject*/ ),BA.numberCast(int.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )));
 BA.debugLineNum = 717;BA.debugLine="KasreMojodi(Item.CodeKala,(Item.TedadDarSabad";
Debug.ShouldStop(4096);
_kasremojodi(_item.getField(true,"CodeKala" /*RemoteObject*/ ),BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))));
 if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 721;BA.debugLine="If Item.TedadDarSabadJoz>0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 43:
//if
this.state = 46;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 722;BA.debugLine="KasreMojodi(Item.CodeKala,Item.TedadDarSabadJ";
Debug.ShouldStop(131072);
_kasremojodi(_item.getField(true,"CodeKala" /*RemoteObject*/ ),BA.numberCast(int.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 725;BA.debugLine="If Item.TedadDarSabadKol>0 Then";
Debug.ShouldStop(1048576);

case 46:
//if
this.state = 49;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 726;BA.debugLine="KasreMojodi(Item.CodeKala,(Item.TedadDarSaba";
Debug.ShouldStop(2097152);
_kasremojodi(_item.getField(true,"CodeKala" /*RemoteObject*/ ),BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))));
 if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;
;
 BA.debugLineNum = 732;BA.debugLine="If Item.FldEshantion>0 Then";
Debug.ShouldStop(134217728);

case 51:
//if
this.state = 54;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 734;BA.debugLine="Item.MablaghTakhfif=Item.FeeForoosh";
Debug.ShouldStop(536870912);
_item.setField ("MablaghTakhfif" /*RemoteObject*/ ,_item.getField(true,"FeeForoosh" /*RemoteObject*/ ));
 BA.debugLineNum = 735;BA.debugLine="Item.fldDarsadTakhfif=100";
Debug.ShouldStop(1073741824);
_item.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,BA.NumberToString(100));
 BA.debugLineNum = 736;BA.debugLine="Dim m As Map";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 737;BA.debugLine="m.Initialize";
Debug.ShouldStop(1);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 738;BA.debugLine="m.Put(\"FldRadif\",i+1)";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldRadif"))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 739;BA.debugLine="m.Put(\"FldC_Visitor\",MCode.C_Visitor)";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Visitor"))),(Object)((parent.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 740;BA.debugLine="m.Put(\"FldC_Tafzili\",MCode.C_Tafzili)";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Tafzili"))),(Object)((parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ )));
 BA.debugLineNum = 741;BA.debugLine="m.Put(\"FldN_Tafzili\",MCode.N_Tafzili)";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldN_Tafzili"))),(Object)((parent.mostCurrent._mcode._n_tafzili /*RemoteObject*/ )));
 BA.debugLineNum = 742;BA.debugLine="m.Put(\"FldShomareFaktor\",ShomareFaktor)";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareFaktor"))),(Object)((_shomarefaktor)));
 BA.debugLineNum = 743;BA.debugLine="m.Put(\"FldShomareBargasht\",0)";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareBargasht"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 744;BA.debugLine="m.Put(\"FldCodeKala\",Item.CodeKala)";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCodeKala"))),(Object)((_item.getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 745;BA.debugLine="m.Put(\"FldNameKala\",Item.NameKala)";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameKala"))),(Object)((_item.getField(true,"NameKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 746;BA.debugLine="m.Put(\"FldFeeForoosh\",0)";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldFeeForoosh"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 747;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",0)";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldFeeBadAzTakhfif"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 748;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Item.MablaghTakhfif)";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfif"))),(Object)((_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ))));
 BA.debugLineNum = 749;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",0)";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifVizhe"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 750;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",0)";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifKala"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 751;BA.debugLine="m.Put(\"FldNameVahed\",Item.NameVahed)";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameVahed"))),(Object)((_item.getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 752;BA.debugLine="m.Put(\"FldNameVahed2\",Item.NameVahed2)";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameVahed2"))),(Object)((_item.getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 753;BA.debugLine="m.Put(\"FldSumMande\",Item.SumMande)";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMande"))),(Object)((_item.getField(true,"SumMande" /*RemoteObject*/ ))));
 BA.debugLineNum = 754;BA.debugLine="m.Put(\"fldPathPic\",Item.fldPathPic)";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldPathPic"))),(Object)((_item.getField(true,"fldPathPic" /*RemoteObject*/ ))));
 BA.debugLineNum = 755;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Item.FldEshantion)";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadJoz"))),(Object)((_item.getField(true,"FldEshantion" /*RemoteObject*/ ))));
 BA.debugLineNum = 756;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Item.TedadDarSabadK";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadKol"))),(Object)((_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))));
 BA.debugLineNum = 757;BA.debugLine="m.Put(\"FldTedadDarkarton\",Item.TedadDarKarton)";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarkarton"))),(Object)((_item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 BA.debugLineNum = 758;BA.debugLine="m.Put(\"FldTotalFaktor\",IIf(Item.fldDarsadTakhfi";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTotalFaktor"))),(Object)(((RemoteObject.solveBoolean("=",_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ),BA.NumberToString(100))) ? (RemoteObject.createImmutable((0))) : ((_totalfaktor)))));
 BA.debugLineNum = 759;BA.debugLine="m.Put(\"FldTozihat\",\"اشانتیون\")";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozihat"))),(Object)((RemoteObject.createImmutable("اشانتیون"))));
 BA.debugLineNum = 761;BA.debugLine="m.Put(\"FldTozih\",TxtSharhFaktor.Text & \" (\" & C";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozih"))),(Object)((RemoteObject.concat(parent.mostCurrent._txtsharhfaktor.runMethod(true,"getText"),RemoteObject.createImmutable(" ("),parent.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"getSelectedItem"),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 762;BA.debugLine="m.Put(\"FldVaziatPardakht\",ItemTasvie.FldC_Tasvi";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVaziatPardakht"))),(Object)((_itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ ))));
 BA.debugLineNum = 763;BA.debugLine="m.Put(\"FldMablaghKol\",Sum)";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghKol"))),(Object)((_sum)));
 BA.debugLineNum = 764;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",Item.MablaghTakhfi";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfifKol"))),(Object)((_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ))));
 BA.debugLineNum = 765;BA.debugLine="m.Put(\"FldDarsadTakhfif\",100)";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDarsadTakhfif"))),(Object)(RemoteObject.createImmutable((100))));
 BA.debugLineNum = 766;BA.debugLine="m.Put(\"fldArzeshAfzode\",Item.fldArzeshAfzodeKal";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldArzeshAfzode"))),(Object)((_item.getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 767;BA.debugLine="m.Put(\"fldDarsadArzeshAfzode\",Item.fldDarsadArz";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldDarsadArzeshAfzode"))),(Object)((_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 770;BA.debugLine="m.Put(\"FldTarikh\",pDate)";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTarikh"))),(Object)((_pdate)));
 BA.debugLineNum = 771;BA.debugLine="m.Put(\"FldDate\",pDate)";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDate"))),(Object)((_pdate)));
 BA.debugLineNum = 772;BA.debugLine="m.Put(\"FldTime\",Time)";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTime"))),(Object)((_time)));
 BA.debugLineNum = 773;BA.debugLine="m.Put(\"FldSignatureBitmapString\",ImageSignature";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSignatureBitmapString"))),(Object)((_imagesignature)));
 BA.debugLineNum = 774;BA.debugLine="m.Put(\"fldShomareForoosh\",myCode.Is_Null_adad(I";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareForoosh"))),(Object)((parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldShomareForoosh" /*RemoteObject*/ ))))));
 BA.debugLineNum = 775;BA.debugLine="m.Put(\"FldSync\",\"False\")";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSync"))),(Object)((RemoteObject.createImmutable("False"))));
 BA.debugLineNum = 776;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WIsBacked"))),(Object)((RemoteObject.createImmutable("False"))));
 BA.debugLineNum = 777;BA.debugLine="m.Put(\"FldType\",\"Eshantion\")";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldType"))),(Object)((RemoteObject.createImmutable("Eshantion"))));
 BA.debugLineNum = 778;BA.debugLine="m.Put(\"FldAmani\",MCode.isAmani)";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAmani"))),(Object)((parent.mostCurrent._mcode._isamani /*RemoteObject*/ )));
 BA.debugLineNum = 779;BA.debugLine="m.Put(\"WSendFrom\",3)";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WSendFrom"))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 780;BA.debugLine="lst.Add(m)";
Debug.ShouldStop(2048);
_lst.runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 782;BA.debugLine="KasreMojodi(Item.CodeKala,Item.FldEshantion)";
Debug.ShouldStop(8192);
_kasremojodi(_item.getField(true,"CodeKala" /*RemoteObject*/ ),BA.numberCast(int.class, _item.getField(true,"FldEshantion" /*RemoteObject*/ )));
 if (true) break;

case 54:
//C
this.state = 76;
;
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 785;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFaktor\",lst)";
Debug.ShouldStop(65536);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(parent.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblFaktor")),(Object)(_lst));
 BA.debugLineNum = 786;BA.debugLine="MCode.feeTip=0";
Debug.ShouldStop(131072);
parent.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 787;BA.debugLine="MCode.feeCode=0";
Debug.ShouldStop(262144);
parent.mostCurrent._mcode._feecode /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 789;BA.debugLine="MCode.isAmani=0";
Debug.ShouldStop(1048576);
parent.mostCurrent._mcode._isamani /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 790;BA.debugLine="Sleep(300)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_sabad.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabad", "savefaktor"),BA.numberCast(int.class, 300));
this.state = 77;
return;
case 77:
//C
this.state = 56;
;
 BA.debugLineNum = 791;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
Debug.ShouldStop(4194304);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Delete From TblSabad")));
 BA.debugLineNum = 792;BA.debugLine="Sleep(300)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_sabad.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabad", "savefaktor"),BA.numberCast(int.class, 300));
this.state = 78;
return;
case 78:
//C
this.state = 56;
;
 BA.debugLineNum = 793;BA.debugLine="If MCode.FaktorSelect=\"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 56:
//if
this.state = 65;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,BA.ObjectToString(""))) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 794;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from T";
Debug.ShouldStop(33554432);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 795;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 59:
//if
this.state = 64;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 61;
}else {
this.state = 63;
}if (true) break;

case 61:
//C
this.state = 64;
 BA.debugLineNum = 796;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Se";
Debug.ShouldStop(134217728);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblLogVisitSefaresh Set FldSefaresh = '"),_pdate,RemoteObject.createImmutable("' ,FldElatSefaresh = '' Where FldC_Ashkhas = '"),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 798;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefare";
Debug.ShouldStop(536870912);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh) Values ('"),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','','"),_pdate,RemoteObject.createImmutable("','')"))));
 if (true) break;

case 64:
//C
this.state = 65;
;
 BA.debugLineNum = 800;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldLastS";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set FldLastSefaresh = '"),_pdate,RemoteObject.createImmutable("' Where fldCodetafzili = '"),parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 801;BA.debugLine="SaveLastVisit";
Debug.ShouldStop(1);
_savelastvisit();
 if (true) break;

case 65:
//C
this.state = 66;
;
 BA.debugLineNum = 805;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 806;BA.debugLine="If MCode.FaktorSelect=\"\" Then";
Debug.ShouldStop(32);
if (true) break;

case 66:
//if
this.state = 71;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,BA.ObjectToString(""))) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
 BA.debugLineNum = 807;BA.debugLine="ToastMessageShow(\"فاکتور شما ثبت گردید\",True)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فاکتور شما ثبت گردید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 809;BA.debugLine="ToastMessageShow(\"فاکتور شما اصلاح گردید\",True)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فاکتور شما اصلاح گردید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 71:
//C
this.state = 74;
;
 BA.debugLineNum = 812;BA.debugLine="MCode.FaktorSelect=\"\"";
Debug.ShouldStop(2048);
parent.mostCurrent._mcode._faktorselect /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 814;BA.debugLine="Log(MCode.C_Tafzili)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","572417491",parent.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,0);
 BA.debugLineNum = 815;BA.debugLine="StartActivity(Act_Profile)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabad.processBA,(Object)((parent.mostCurrent._act_profile.getObject())));
 Debug.CheckDeviceExceptions();
if (true) break;

case 73:
//C
this.state = 74;
this.catchState = 0;
 BA.debugLineNum = 817;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","572417494",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 818;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(131072);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-SaveFaktor"))));
 if (true) break;
if (true) break;

case 74:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 820;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e0.toString());}
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
public static RemoteObject  _savefaktor_marjoee() throws Exception{
try {
		Debug.PushSubsStack("SaveFaktor_Marjoee (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,892);
if (RapidSub.canDelegate("savefaktor_marjoee")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","savefaktor_marjoee");}
RemoteObject _shomarefaktor = RemoteObject.createImmutable(0);
RemoteObject _shomarebargasht = RemoteObject.createImmutable(0);
RemoteObject _imagesignature = RemoteObject.createImmutable("");
RemoteObject _pdate = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _dt = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sum = RemoteObject.createImmutable(0L);
RemoteObject _totalfaktor = RemoteObject.createImmutable(0L);
RemoteObject _summablaghtakhfifvizhe = RemoteObject.createImmutable(0L);
RemoteObject _summablaghtakhfifkala = RemoteObject.createImmutable(0L);
RemoteObject _mablaghtakhfifkol = RemoteObject.createImmutable(0L);
RemoteObject _mablagharzeshafzode = RemoteObject.createImmutable(0L);
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 892;BA.debugLine="Sub SaveFaktor_Marjoee";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 893;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 895;BA.debugLine="Dim ShomareFaktor As Int";
Debug.ShouldStop(1073741824);
_shomarefaktor = RemoteObject.createImmutable(0);Debug.locals.put("ShomareFaktor", _shomarefaktor);
 BA.debugLineNum = 896;BA.debugLine="Dim ShomareBargasht As Int";
Debug.ShouldStop(-2147483648);
_shomarebargasht = RemoteObject.createImmutable(0);Debug.locals.put("ShomareBargasht", _shomarebargasht);
 BA.debugLineNum = 897;BA.debugLine="Dim ImageSignature As String";
Debug.ShouldStop(1);
_imagesignature = RemoteObject.createImmutable("");Debug.locals.put("ImageSignature", _imagesignature);
 BA.debugLineNum = 900;BA.debugLine="Dim pDate As String =  MCode.ConvertNumbersPersi";
Debug.ShouldStop(8);
_pdate = act_sabad.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(act_sabad.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA)));Debug.locals.put("pDate", _pdate);Debug.locals.put("pDate", _pdate);
 BA.debugLineNum = 901;BA.debugLine="Dim Time As String = MCode.ConvertNumbersPersian2";
Debug.ShouldStop(16);
_time = act_sabad.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(act_sabad.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_sabad.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 905;BA.debugLine="Dim DT As String=TxtSharhFaktor.text &\" (\"&pDate";
Debug.ShouldStop(256);
_dt = RemoteObject.concat(act_sabad.mostCurrent._txtsharhfaktor.runMethod(true,"getText"),RemoteObject.createImmutable(" ("),_pdate,RemoteObject.createImmutable("-"),_time,RemoteObject.createImmutable(") "));Debug.locals.put("DT", _dt);Debug.locals.put("DT", _dt);
 BA.debugLineNum = 906;BA.debugLine="Log(\"->>\"&DT)";
Debug.ShouldStop(512);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572679438",RemoteObject.concat(RemoteObject.createImmutable("->>"),_dt),0);
 BA.debugLineNum = 907;BA.debugLine="If MCode.FaktorSelect = \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 908;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select Max(Cast";
Debug.ShouldStop(2048);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabad.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select Max(Cast(FldShomareFaktor As Int)) As MaxFldShomareFaktor From TblFaktor")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 909;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(4096);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 910;BA.debugLine="If Cu.GetString(\"MaxFldShomareFaktor\") = Null Th";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("n",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MaxFldShomareFaktor"))))) { 
 BA.debugLineNum = 911;BA.debugLine="ShomareFaktor = 1";
Debug.ShouldStop(16384);
_shomarefaktor = BA.numberCast(int.class, 1);Debug.locals.put("ShomareFaktor", _shomarefaktor);
 }else {
 BA.debugLineNum = 913;BA.debugLine="ShomareFaktor = Cu.GetString(\"MaxFldShomareFakt";
Debug.ShouldStop(65536);
_shomarefaktor = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MaxFldShomareFaktor")))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("ShomareFaktor", _shomarefaktor);
 };
 }else {
 BA.debugLineNum = 916;BA.debugLine="ShomareFaktor = MCode.FaktorSelect";
Debug.ShouldStop(524288);
_shomarefaktor = BA.numberCast(int.class, act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/ );Debug.locals.put("ShomareFaktor", _shomarefaktor);
 };
 BA.debugLineNum = 918;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select Max(Cast(";
Debug.ShouldStop(2097152);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabad.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select Max(Cast(FldShomareBargasht As Int)) As MaxFldShomareBargasht From TblFaktor")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 919;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(4194304);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 920;BA.debugLine="If Cu.GetString(\"MaxFldShomareBargasht\") = Null T";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("n",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MaxFldShomareBargasht"))))) { 
 BA.debugLineNum = 921;BA.debugLine="ShomareBargasht = 1";
Debug.ShouldStop(16777216);
_shomarebargasht = BA.numberCast(int.class, 1);Debug.locals.put("ShomareBargasht", _shomarebargasht);
 }else {
 BA.debugLineNum = 923;BA.debugLine="ShomareBargasht = Cu.GetString(\"MaxFldShomareBar";
Debug.ShouldStop(67108864);
_shomarebargasht = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MaxFldShomareBargasht")))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("ShomareBargasht", _shomarebargasht);
 };
 BA.debugLineNum = 926;BA.debugLine="If TxtSharhFaktor.Text.Trim = \"\" Then TxtSharhFak";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._txtsharhfaktor.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
act_sabad.mostCurrent._txtsharhfaktor.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 928;BA.debugLine="If MCode.FaktorSelect <> \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 929;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor Where Fl";
Debug.ShouldStop(1);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblFaktor Where FldShomareFaktor = '"),act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 932;BA.debugLine="Dim Sum As Long = MCode.FinalFaktor.KhamFaktor";
Debug.ShouldStop(8);
_sum = BA.numberCast(long.class, act_sabad.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"KhamFaktor" /*RemoteObject*/ ));Debug.locals.put("Sum", _sum);Debug.locals.put("Sum", _sum);
 BA.debugLineNum = 933;BA.debugLine="Dim TotalFaktor As Long = Sum";
Debug.ShouldStop(16);
_totalfaktor = _sum;Debug.locals.put("TotalFaktor", _totalfaktor);Debug.locals.put("TotalFaktor", _totalfaktor);
 BA.debugLineNum = 934;BA.debugLine="Dim SumMablaghTakhfifVizhe As Long=MCode.FinalFa";
Debug.ShouldStop(32);
_summablaghtakhfifvizhe = BA.numberCast(long.class, act_sabad.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"TakhfifVizhe" /*RemoteObject*/ ));Debug.locals.put("SumMablaghTakhfifVizhe", _summablaghtakhfifvizhe);Debug.locals.put("SumMablaghTakhfifVizhe", _summablaghtakhfifvizhe);
 BA.debugLineNum = 935;BA.debugLine="Dim SumMablaghTakhfifKala As Long=MCode.FinalFak";
Debug.ShouldStop(64);
_summablaghtakhfifkala = BA.numberCast(long.class, act_sabad.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"TakhfifKala" /*RemoteObject*/ ));Debug.locals.put("SumMablaghTakhfifKala", _summablaghtakhfifkala);Debug.locals.put("SumMablaghTakhfifKala", _summablaghtakhfifkala);
 BA.debugLineNum = 936;BA.debugLine="Dim MablaghTakhfifKol As Long=SumMablaghTakhfifK";
Debug.ShouldStop(128);
_mablaghtakhfifkol = RemoteObject.solve(new RemoteObject[] {_summablaghtakhfifkala,_summablaghtakhfifvizhe}, "+",1, 2);Debug.locals.put("MablaghTakhfifKol", _mablaghtakhfifkol);Debug.locals.put("MablaghTakhfifKol", _mablaghtakhfifkol);
 BA.debugLineNum = 937;BA.debugLine="Dim MablaghArzeshAfzode As Long=MCode.MohasbeArz";
Debug.ShouldStop(256);
_mablagharzeshafzode = act_sabad.mostCurrent._mcode.runMethod(true,"_mohasbearzeshafzode" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_totalfaktor));Debug.locals.put("MablaghArzeshAfzode", _mablagharzeshafzode);Debug.locals.put("MablaghArzeshAfzode", _mablagharzeshafzode);
 BA.debugLineNum = 939;BA.debugLine="If MCode.Signature = 1 Or ImageSignature<>\"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._signature /*RemoteObject*/ ,BA.NumberToString(1)) || RemoteObject.solveBoolean("!",_imagesignature,BA.ObjectToString(""))) { 
 BA.debugLineNum = 940;BA.debugLine="ImageSignature = MCode.Encrypted(MCode.ConvertBl";
Debug.ShouldStop(2048);
_imagesignature = act_sabad.mostCurrent._mcode.runMethod(true,"_encrypted" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(act_sabad.mostCurrent._mcode.runMethod(true,"_convertblobtostring" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(act_sabad.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/parsik/Signature"))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._mcode._codemoshtari /*RemoteObject*/ ,RemoteObject.createImmutable(".png"))))));Debug.locals.put("ImageSignature", _imagesignature);
 }else {
 BA.debugLineNum = 942;BA.debugLine="ImageSignature = \"\"";
Debug.ShouldStop(8192);
_imagesignature = BA.ObjectToString("");Debug.locals.put("ImageSignature", _imagesignature);
 };
 BA.debugLineNum = 945;BA.debugLine="Dim lst As List";
Debug.ShouldStop(65536);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 946;BA.debugLine="lst.Initialize";
Debug.ShouldStop(131072);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 947;BA.debugLine="For i=0 To OriginalItemList.Size-1";
Debug.ShouldStop(262144);
{
final int step44 = 1;
final int limit44 = RemoteObject.solve(new RemoteObject[] {act_sabad.mostCurrent._originalitemlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step44 > 0 && _i <= limit44) || (step44 < 0 && _i >= limit44) ;_i = ((int)(0 + _i + step44))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 948;BA.debugLine="Dim Item = OriginalItemList.Get(i) As AdapterList";
Debug.ShouldStop(524288);
_item = (act_sabad.mostCurrent._originalitemlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 949;BA.debugLine="If Item.TedadDarSabadJoz>0 Or Item.TedadDarSabadK";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 951;BA.debugLine="Dim m As Map";
Debug.ShouldStop(4194304);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 952;BA.debugLine="m.Initialize";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 953;BA.debugLine="m.Put(\"FldRadif\",i+1)";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldRadif"))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 954;BA.debugLine="m.Put(\"FldC_Visitor\",MCode.C_Visitor)";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Visitor"))),(Object)((act_sabad.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 955;BA.debugLine="m.Put(\"FldC_Tafzili\",MCode.C_Tafzili)";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Tafzili"))),(Object)((act_sabad.mostCurrent._mcode._c_tafzili /*RemoteObject*/ )));
 BA.debugLineNum = 956;BA.debugLine="m.Put(\"FldN_Tafzili\",MCode.N_Tafzili)";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldN_Tafzili"))),(Object)((act_sabad.mostCurrent._mcode._n_tafzili /*RemoteObject*/ )));
 BA.debugLineNum = 957;BA.debugLine="m.Put(\"FldShomareFaktor\",ShomareFaktor)";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareFaktor"))),(Object)((_shomarefaktor)));
 BA.debugLineNum = 958;BA.debugLine="m.Put(\"FldShomareBargasht\",ShomareBargasht)";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareBargasht"))),(Object)((_shomarebargasht)));
 BA.debugLineNum = 959;BA.debugLine="m.Put(\"FldCodeKala\",Item.CodeKala)";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCodeKala"))),(Object)((_item.getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 960;BA.debugLine="m.Put(\"FldNameKala\",Item.NameKala)";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameKala"))),(Object)((_item.getField(true,"NameKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 961;BA.debugLine="m.Put(\"FldFeeForoosh\",Item.FeeForoosh)";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldFeeForoosh"))),(Object)((_item.getField(true,"FeeForoosh" /*RemoteObject*/ ))));
 BA.debugLineNum = 962;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Item.FldFeeBadAzTakhf";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldFeeBadAzTakhfif"))),(Object)((_item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))));
 BA.debugLineNum = 963;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Item.MablaghTakhfif)";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfif"))),(Object)((_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ))));
 BA.debugLineNum = 964;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",SumMablaghTakh";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifVizhe"))),(Object)((_summablaghtakhfifvizhe)));
 BA.debugLineNum = 965;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",SumMablaghTakhf";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifKala"))),(Object)((_summablaghtakhfifkala)));
 BA.debugLineNum = 966;BA.debugLine="m.Put(\"FldNameVahed\",Item.NameVahed)";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameVahed"))),(Object)((_item.getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 967;BA.debugLine="m.Put(\"FldNameVahed2\",Item.NameVahed2)";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameVahed2"))),(Object)((_item.getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 968;BA.debugLine="m.Put(\"FldSumMande\",Item.SumMande)";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMande"))),(Object)((_item.getField(true,"SumMande" /*RemoteObject*/ ))));
 BA.debugLineNum = 969;BA.debugLine="m.Put(\"fldPathPic\",Item.fldPathPic)";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldPathPic"))),(Object)((_item.getField(true,"fldPathPic" /*RemoteObject*/ ))));
 BA.debugLineNum = 970;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Item.TedadDarSabadJo";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadJoz"))),(Object)((_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))));
 BA.debugLineNum = 971;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Item.TedadDarSabadKo";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadKol"))),(Object)((_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))));
 BA.debugLineNum = 972;BA.debugLine="m.Put(\"FldTedadDarkarton\",Item.TedadDarKarton)";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarkarton"))),(Object)((_item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 BA.debugLineNum = 973;BA.debugLine="m.Put(\"FldTotalFaktor\",TotalFaktor)";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTotalFaktor"))),(Object)((_totalfaktor)));
 BA.debugLineNum = 974;BA.debugLine="m.Put(\"FldTozihat\",Item.Tozihat)";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozihat"))),(Object)((_item.getField(true,"Tozihat" /*RemoteObject*/ ))));
 BA.debugLineNum = 975;BA.debugLine="m.Put(\"FldTozih\",TxtSharhFaktor.Text & \" (مرجوعی";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozih"))),(Object)((RemoteObject.concat(act_sabad.mostCurrent._txtsharhfaktor.runMethod(true,"getText"),RemoteObject.createImmutable(" (مرجوعی)")))));
 BA.debugLineNum = 977;BA.debugLine="m.Put(\"FldVaziatPardakht\",0)";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVaziatPardakht"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 978;BA.debugLine="m.Put(\"FldMablaghKol\",Sum)";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghKol"))),(Object)((_sum)));
 BA.debugLineNum = 979;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",MablaghTakhfifKol)";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfifKol"))),(Object)((_mablaghtakhfifkol)));
 BA.debugLineNum = 980;BA.debugLine="m.Put(\"FldDarsadTakhfif\",myCode.Is_Null_adad(Ite";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDarsadTakhfif"))),(Object)((act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))))));
 BA.debugLineNum = 981;BA.debugLine="m.Put(\"fldArzeshAfzode\",Item.fldArzeshAfzodeKala";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldArzeshAfzode"))),(Object)((_item.getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 982;BA.debugLine="m.Put(\"fldDarsadArzeshAfzode\",Item.fldDarsadArze";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldDarsadArzeshAfzode"))),(Object)((_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 983;BA.debugLine="m.Put(\"FldMablaghKol\",Sum)";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghKol"))),(Object)((_sum)));
 BA.debugLineNum = 986;BA.debugLine="m.Put(\"FldTarikh\",pDate)";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTarikh"))),(Object)((_pdate)));
 BA.debugLineNum = 987;BA.debugLine="m.Put(\"FldDate\",pDate)";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDate"))),(Object)((_pdate)));
 BA.debugLineNum = 988;BA.debugLine="m.Put(\"FldTime\",Time)";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTime"))),(Object)((_time)));
 BA.debugLineNum = 989;BA.debugLine="m.Put(\"FldSignatureBitmapString\",ImageSignature)";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSignatureBitmapString"))),(Object)((_imagesignature)));
 BA.debugLineNum = 990;BA.debugLine="m.Put(\"fldShomareForoosh\",myCode.Is_Null_adad(It";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareForoosh"))),(Object)((act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldShomareForoosh" /*RemoteObject*/ ))))));
 BA.debugLineNum = 991;BA.debugLine="m.Put(\"FldSync\",\"False\")";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSync"))),(Object)((RemoteObject.createImmutable("False"))));
 BA.debugLineNum = 992;BA.debugLine="m.Put(\"WIsBacked\",\"True\")";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WIsBacked"))),(Object)((RemoteObject.createImmutable("True"))));
 BA.debugLineNum = 993;BA.debugLine="m.Put(\"FldType\",\"Marjoee\")";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldType"))),(Object)((RemoteObject.createImmutable("Marjoee"))));
 BA.debugLineNum = 994;BA.debugLine="m.Put(\"FldAmani\",MCode.isAmani)";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAmani"))),(Object)((act_sabad.mostCurrent._mcode._isamani /*RemoteObject*/ )));
 BA.debugLineNum = 995;BA.debugLine="m.Put(\"WSendFrom\",3)";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WSendFrom"))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 996;BA.debugLine="lst.Add(m)";
Debug.ShouldStop(8);
_lst.runVoidMethod ("Add",(Object)((_m.getObject())));
 };
 BA.debugLineNum = 999;BA.debugLine="If Item.FldEshantion>0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"FldEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1001;BA.debugLine="Dim m As Map";
Debug.ShouldStop(256);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 1002;BA.debugLine="m.Initialize";
Debug.ShouldStop(512);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 1003;BA.debugLine="m.Put(\"FldRadif\",i+2)";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldRadif"))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "+",1, 1))));
 BA.debugLineNum = 1004;BA.debugLine="m.Put(\"FldC_Visitor\",MCode.C_Visitor)";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Visitor"))),(Object)((act_sabad.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 1005;BA.debugLine="m.Put(\"FldC_Tafzili\",MCode.C_Tafzili)";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldC_Tafzili"))),(Object)((act_sabad.mostCurrent._mcode._c_tafzili /*RemoteObject*/ )));
 BA.debugLineNum = 1006;BA.debugLine="m.Put(\"FldN_Tafzili\",MCode.N_Tafzili)";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldN_Tafzili"))),(Object)((act_sabad.mostCurrent._mcode._n_tafzili /*RemoteObject*/ )));
 BA.debugLineNum = 1007;BA.debugLine="m.Put(\"FldShomareFaktor\",ShomareFaktor)";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareFaktor"))),(Object)((_shomarefaktor)));
 BA.debugLineNum = 1008;BA.debugLine="m.Put(\"FldShomareBargasht\",ShomareBargasht)";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldShomareBargasht"))),(Object)((_shomarebargasht)));
 BA.debugLineNum = 1009;BA.debugLine="m.Put(\"FldCodeKala\",Item.CodeKala)";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldCodeKala"))),(Object)((_item.getField(true,"CodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 1010;BA.debugLine="m.Put(\"FldNameKala\",Item.NameKala)";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameKala"))),(Object)((_item.getField(true,"NameKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 1011;BA.debugLine="m.Put(\"FldFeeForoosh\",0)";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldFeeForoosh"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1012;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",0)";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldFeeBadAzTakhfif"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1013;BA.debugLine="m.Put(\"FldMablaghTakhfif\",0)";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfif"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1014;BA.debugLine="m.Put(\"FldDarsadTakhfif\",myCode.Is_Null_adad(It";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDarsadTakhfif"))),(Object)((act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))))));
 BA.debugLineNum = 1015;BA.debugLine="m.Put(\"fldArzeshAfzode\",Item.fldArzeshAfzodeKal";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldArzeshAfzode"))),(Object)((_item.getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 1016;BA.debugLine="m.Put(\"fldDarsadArzeshAfzode\",Item.fldDarsadArz";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldDarsadArzeshAfzode"))),(Object)((_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ))));
 BA.debugLineNum = 1017;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",0)";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifVizhe"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1018;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",0)";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMablaghTakhfifKala"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1019;BA.debugLine="m.Put(\"FldNameVahed\",Item.NameVahed)";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameVahed"))),(Object)((_item.getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 1020;BA.debugLine="m.Put(\"FldNameVahed2\",Item.NameVahed2)";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldNameVahed2"))),(Object)((_item.getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 1021;BA.debugLine="m.Put(\"FldSumMande\",Item.SumMande)";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSumMande"))),(Object)((_item.getField(true,"SumMande" /*RemoteObject*/ ))));
 BA.debugLineNum = 1022;BA.debugLine="m.Put(\"fldPathPic\",Item.fldPathPic)";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldPathPic"))),(Object)((_item.getField(true,"fldPathPic" /*RemoteObject*/ ))));
 BA.debugLineNum = 1023;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Item.FldEshantion)";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadJoz"))),(Object)((_item.getField(true,"FldEshantion" /*RemoteObject*/ ))));
 BA.debugLineNum = 1024;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Item.TedadDarSabadK";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarSabadKol"))),(Object)((_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))));
 BA.debugLineNum = 1025;BA.debugLine="m.Put(\"FldTedadDarkarton\",Item.TedadDarKarton)";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTedadDarkarton"))),(Object)((_item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))));
 BA.debugLineNum = 1026;BA.debugLine="m.Put(\"FldTotalFaktor\",TotalFaktor)";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTotalFaktor"))),(Object)((_totalfaktor)));
 BA.debugLineNum = 1027;BA.debugLine="m.Put(\"FldMablaghKol\",Sum)";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghKol"))),(Object)((_sum)));
 BA.debugLineNum = 1028;BA.debugLine="m.Put(\"FldTozihat\",\"اشانتیون مرجوعی\")";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozihat"))),(Object)((RemoteObject.createImmutable("اشانتیون مرجوعی"))));
 BA.debugLineNum = 1030;BA.debugLine="m.Put(\"FldTozih\",TxtSharhFaktor.Text & \" (\" & C";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTozih"))),(Object)((RemoteObject.concat(act_sabad.mostCurrent._txtsharhfaktor.runMethod(true,"getText"),RemoteObject.createImmutable(" ("),act_sabad.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"getSelectedItem"),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 1032;BA.debugLine="m.Put(\"FldVaziatPardakht\",0)";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldVaziatPardakht"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1035;BA.debugLine="m.Put(\"FldTarikh\",pDate)";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTarikh"))),(Object)((_pdate)));
 BA.debugLineNum = 1036;BA.debugLine="m.Put(\"FldDate\",pDate)";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDate"))),(Object)((_pdate)));
 BA.debugLineNum = 1037;BA.debugLine="m.Put(\"FldTime\",Time)";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldTime"))),(Object)((_time)));
 BA.debugLineNum = 1038;BA.debugLine="m.Put(\"FldSignatureBitmapString\",ImageSignature";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSignatureBitmapString"))),(Object)((_imagesignature)));
 BA.debugLineNum = 1039;BA.debugLine="m.Put(\"fldShomareForoosh\",myCode.Is_Null_adad(I";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareForoosh"))),(Object)((act_sabad.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(_item.getField(true,"fldShomareForoosh" /*RemoteObject*/ ))))));
 BA.debugLineNum = 1040;BA.debugLine="m.Put(\"FldSync\",\"False\")";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSync"))),(Object)((RemoteObject.createImmutable("False"))));
 BA.debugLineNum = 1041;BA.debugLine="m.Put(\"WIsBacked\",\"True\")";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WIsBacked"))),(Object)((RemoteObject.createImmutable("True"))));
 BA.debugLineNum = 1042;BA.debugLine="m.Put(\"FldType\",\"Eshantion\")";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldType"))),(Object)((RemoteObject.createImmutable("Eshantion"))));
 BA.debugLineNum = 1043;BA.debugLine="m.Put(\"FldAmani\",MCode.isAmani)";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldAmani"))),(Object)((act_sabad.mostCurrent._mcode._isamani /*RemoteObject*/ )));
 BA.debugLineNum = 1044;BA.debugLine="m.Put(\"WSendFrom\",3)";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("WSendFrom"))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 1045;BA.debugLine="lst.Add(m)";
Debug.ShouldStop(1048576);
_lst.runVoidMethod ("Add",(Object)((_m.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1049;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFaktor\",lst)";
Debug.ShouldStop(16777216);
act_sabad.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(act_sabad.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblFaktor")),(Object)(_lst));
 BA.debugLineNum = 1050;BA.debugLine="MCode.isAmani=0";
Debug.ShouldStop(33554432);
act_sabad.mostCurrent._mcode._isamani /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1052;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
Debug.ShouldStop(134217728);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Delete From TblSabad")));
 BA.debugLineNum = 1053;BA.debugLine="If MCode.FaktorSelect=\"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1054;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from T";
Debug.ShouldStop(536870912);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabad.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"),act_sabad.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1055;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1056;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Se";
Debug.ShouldStop(-2147483648);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblLogVisitSefaresh Set FldSefaresh = '"),_dt,RemoteObject.createImmutable("' ,FldElatSefaresh = '' Where FldC_Ashkhas = '"),act_sabad.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 1058;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefare";
Debug.ShouldStop(2);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh) Values ('"),act_sabad.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','','"),_pdate,RemoteObject.createImmutable("','')"))));
 };
 BA.debugLineNum = 1060;BA.debugLine="SaveLastVisit";
Debug.ShouldStop(8);
_savelastvisit();
 };
 BA.debugLineNum = 1065;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
act_sabad.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1066;BA.debugLine="If MCode.FaktorSelect=\"\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1067;BA.debugLine="ToastMessageShow(\"فاکتور مرجوعی ثبت گردید\",True)";
Debug.ShouldStop(1024);
act_sabad.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فاکتور مرجوعی ثبت گردید")),(Object)(act_sabad.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 1069;BA.debugLine="ToastMessageShow(\"فاکتور مرجوعی اصلاح گردید\",Tru";
Debug.ShouldStop(4096);
act_sabad.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فاکتور مرجوعی اصلاح گردید")),(Object)(act_sabad.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 1072;BA.debugLine="Send_Faktor";
Debug.ShouldStop(32768);
_send_faktor();
 BA.debugLineNum = 1073;BA.debugLine="MCode.FaktorSelect=\"\"";
Debug.ShouldStop(65536);
act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 1074;BA.debugLine="MCode.editFactor=False";
Debug.ShouldStop(131072);
act_sabad.mostCurrent._mcode._editfactor /*RemoteObject*/  = act_sabad.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1075;BA.debugLine="Log(MCode.C_Tafzili)";
Debug.ShouldStop(262144);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572679607",act_sabad.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,0);
 BA.debugLineNum = 1076;BA.debugLine="StartActivity(Act_Profile)";
Debug.ShouldStop(524288);
act_sabad.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabad.processBA,(Object)((act_sabad.mostCurrent._act_profile.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e159) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e159.toString()); BA.debugLineNum = 1078;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572679610",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1079;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4194304);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-SaveFaktor_Marjoee"))));
 };
 BA.debugLineNum = 1081;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savelastvisit() throws Exception{
try {
		Debug.PushSubsStack("SaveLastVisit (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,822);
if (RapidSub.canDelegate("savelastvisit")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","savelastvisit");}
RemoteObject _dateshamsi = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _d = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _maxradif = RemoteObject.createImmutable(0);
 BA.debugLineNum = 822;BA.debugLine="Sub SaveLastVisit";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 823;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 825;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(16777216);
act_sabad.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 827;BA.debugLine="Dim DateShamsi As String = MCode.DatePersian";
Debug.ShouldStop(67108864);
_dateshamsi = act_sabad.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA);Debug.locals.put("DateShamsi", _dateshamsi);Debug.locals.put("DateShamsi", _dateshamsi);
 BA.debugLineNum = 828;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(134217728);
_time = act_sabad.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(act_sabad.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 830;BA.debugLine="Dim D As String = DateShamsi & \"T\" & Time";
Debug.ShouldStop(536870912);
_d = RemoteObject.concat(_dateshamsi,RemoteObject.createImmutable("T"),_time);Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 831;BA.debugLine="LogColor(\"D: \" & D,Colors.Red)";
Debug.ShouldStop(1073741824);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572482825",RemoteObject.concat(RemoteObject.createImmutable("D: "),_d),act_sabad.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 833;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set lastOrde";
Debug.ShouldStop(1);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set lastOrderDate = '"),_d,RemoteObject.createImmutable("'  Where fldCodetafzili = '"),act_sabad.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 835;BA.debugLine="If MCode.TourVisitSW And MCode.TourVisit=1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(".",act_sabad.mostCurrent._mcode._tourvisitsw /*RemoteObject*/ ) && RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._tourvisit /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 836;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set fld";
Debug.ShouldStop(8);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update tblTourVisitor Set fldTimeSefaresh = '"),_time,RemoteObject.createImmutable("',fldShomareSefaresh='"),act_sabad.mostCurrent._shomaresefaresh,RemoteObject.createImmutable("',fldVaziat='3',fldSend='False' Where fldCodeTafzili = '"),act_sabad.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("' and fldDateVisit='"),act_sabad.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA),RemoteObject.createImmutable("' and fldType='Tour'"))));
 }else {
 BA.debugLineNum = 838;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select";
Debug.ShouldStop(32);
_count = BA.numberCast(int.class, act_sabad.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"),act_sabad.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_sabad.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldType='Free'"))))));Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 839;BA.debugLine="Dim MaxRadif As Int";
Debug.ShouldStop(64);
_maxradif = RemoteObject.createImmutable(0);Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 840;BA.debugLine="If Count=0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 841;BA.debugLine="MaxRadif=1";
Debug.ShouldStop(256);
_maxradif = BA.numberCast(int.class, 1);Debug.locals.put("MaxRadif", _maxradif);
 }else {
 BA.debugLineNum = 843;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fldR";
Debug.ShouldStop(1024);
_maxradif = BA.numberCast(int.class, act_sabad.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"),act_sabad.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_sabad.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldType='Free'"))))));Debug.locals.put("MaxRadif", _maxradif);
 };
 BA.debugLineNum = 847;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set fld";
Debug.ShouldStop(16384);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update tblTourVisitor Set fldTimeSefaresh = '"),_time,RemoteObject.createImmutable("',fldShomareSefaresh='"),act_sabad.mostCurrent._shomaresefaresh,RemoteObject.createImmutable("',fldVaziat='3',fldSend='False' Where fldCodeTafzili = '"),act_sabad.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("' and fldDateVisit='"),act_sabad.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA),RemoteObject.createImmutable("' and fldType='Free' and fldRadif="),_maxradif)));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e21.toString()); BA.debugLineNum = 851;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572482845",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 852;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(524288);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-SaveLastVisit"))));
 };
 BA.debugLineNum = 854;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savemarjooii() throws Exception{
try {
		Debug.PushSubsStack("SaveMarjooii (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1083);
if (RapidSub.canDelegate("savemarjooii")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","savemarjooii");}
 BA.debugLineNum = 1083;BA.debugLine="Sub SaveMarjooii";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1084;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 1085;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTozihat";
Debug.ShouldStop(268435456);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Update TblSabad Set FldTozihat = '' Where FldTozihat is null Or FldTozihat = ''")));
 BA.debugLineNum = 1086;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedadDar";
Debug.ShouldStop(536870912);
act_sabad.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Update TblSabad Set FldTedadDarSabadKol = 0 Where FldTedadDarSabadKol is null Or FldTedadDarSabadKol = ''")));
 BA.debugLineNum = 1114;BA.debugLine="SaveFaktor_Marjoee";
Debug.ShouldStop(33554432);
_savefaktor_marjoee();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e6.toString()); BA.debugLineNum = 1116;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572744993",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1117;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(268435456);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-SaveMarjooii"))));
 };
 BA.debugLineNum = 1123;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _send_faktor() throws Exception{
try {
		Debug.PushSubsStack("Send_Faktor (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,866);
if (RapidSub.canDelegate("send_faktor")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","send_faktor");}
 BA.debugLineNum = 866;BA.debugLine="Private Sub Send_Faktor";
Debug.ShouldStop(2);
 BA.debugLineNum = 867;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 868;BA.debugLine="Dim XUI As XUI";
Debug.ShouldStop(8);
act_sabad.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 884;BA.debugLine="MCode.FaktorSelect=\"\"";
Debug.ShouldStop(524288);
act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 885;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
act_sabad.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 886;BA.debugLine="StartActivity(Act_Profile)";
Debug.ShouldStop(2097152);
act_sabad.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabad.processBA,(Object)((act_sabad.mostCurrent._act_profile.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e7.toString()); BA.debugLineNum = 888;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","572613910",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 889;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(16777216);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Send_Faktor"))));
 };
 BA.debugLineNum = 891;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtmablaghtakhfifikol_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtMablaghTakhfifiKol_TextChanged (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,1253);
if (RapidSub.canDelegate("txtmablaghtakhfifikol_textchanged")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","txtmablaghtakhfifikol_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1253;BA.debugLine="Sub txtMablaghTakhfifiKol_TextChanged (Old As Stri";
Debug.ShouldStop(16);
 BA.debugLineNum = 1254;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 1255;BA.debugLine="If IsNumber(New)=False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_new)),act_sabad.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1256;BA.debugLine="txtMablaghTakhfifiKol.Text=Old";
Debug.ShouldStop(128);
act_sabad.mostCurrent._txtmablaghtakhfifikol.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_old));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e6.toString()); BA.debugLineNum = 1259;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","573007110",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1260;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2048);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-txtMablaghTakhfifiKol_TextChanged"))));
 };
 BA.debugLineNum = 1262;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatesumsabad() throws Exception{
try {
		Debug.PushSubsStack("UpdateSumSabad (act_sabad) ","act_sabad",40,act_sabad.mostCurrent.activityBA,act_sabad.mostCurrent,352);
if (RapidSub.canDelegate("updatesumsabad")) { return ir.parsikhesab.pakhsh.act_sabad.remoteMe.runUserSub(false, "act_sabad","updatesumsabad");}
 BA.debugLineNum = 352;BA.debugLine="Sub UpdateSumSabad";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 354;BA.debugLine="Log(\"---->\"&(CmbBox1.SelectedIndex+1))";
Debug.ShouldStop(2);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571892994",RemoteObject.concat(RemoteObject.createImmutable("---->"),(RemoteObject.solve(new RemoteObject[] {act_sabad.mostCurrent._cmbbox1.runClassMethod (ir.parsikhesab.pakhsh.b4xcombobox.class, "_getselectedindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))),0);
 BA.debugLineNum = 356;BA.debugLine="MCode.CreateReportSabad";
Debug.ShouldStop(8);
act_sabad.mostCurrent._mcode.runVoidMethod ("_createreportsabad" /*RemoteObject*/ ,act_sabad.mostCurrent.activityBA);
 BA.debugLineNum = 357;BA.debugLine="num=num+1";
Debug.ShouldStop(16);
act_sabad._num = RemoteObject.solve(new RemoteObject[] {act_sabad._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 358;BA.debugLine="Log(num)";
Debug.ShouldStop(32);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571892998",BA.NumberToString(act_sabad._num),0);
 BA.debugLineNum = 359;BA.debugLine="If MCode.FinalFaktor.KhamFaktor > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_sabad.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"KhamFaktor" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 360;BA.debugLine="If MCode.FaktorSelect=\"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._faktorselect /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 361;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 362;BA.debugLine="BtnSabtSefaresh.Text = \"ثبت فاکتور مرجوعی\"";
Debug.ShouldStop(512);
act_sabad.mostCurrent._btnsabtsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence("ثبت فاکتور مرجوعی"));
 }else 
{ BA.debugLineNum = 363;BA.debugLine="Else If MCode.Action=\"SabtFaktor\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_sabad.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtFaktor"))) { 
 BA.debugLineNum = 364;BA.debugLine="BtnSabtSefaresh.Text = NumberFormat2(MCode.Fin";
Debug.ShouldStop(2048);
act_sabad.mostCurrent._btnsabtsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_sabad.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, act_sabad.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"GablePardakht" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_sabad.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_sabad.mostCurrent._mcode._vahedpool /*RemoteObject*/ ,RemoteObject.createImmutable("    "),RemoteObject.createImmutable("ثبت سفارش"))));
 }}
;
 }else {
 BA.debugLineNum = 368;BA.debugLine="BtnSabtSefaresh.Text = NumberFormat2(MCode.Fina";
Debug.ShouldStop(32768);
act_sabad.mostCurrent._btnsabtsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_sabad.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, act_sabad.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"GablePardakht" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_sabad.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),act_sabad.mostCurrent._mcode._vahedpool /*RemoteObject*/ ,RemoteObject.createImmutable("    "),RemoteObject.createImmutable("اصلاح سفارش"))));
 };
 BA.debugLineNum = 371;BA.debugLine="If MCode.ManedEtebarEnable And MCode.FinalFakto";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(".",act_sabad.mostCurrent._mcode._manedetebarenable /*RemoteObject*/ ) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_sabad.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"GablePardakht" /*RemoteObject*/ )),BA.numberCast(double.class, act_sabad.mostCurrent._mcode._mandeetebar /*RemoteObject*/ ))) { 
 BA.debugLineNum = 372;BA.debugLine="ToastMessageShow(\"جمع مبلغ سفارش از اعتبار مش";
Debug.ShouldStop(524288);
act_sabad.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد.")),(Object)(act_sabad.mostCurrent.__c.getField(true,"True")));
 };
 }else {
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabad.processBA, e22.toString()); BA.debugLineNum = 381;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
act_sabad.mostCurrent.__c.runVoidMethod ("LogImpl","571893021",BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA)),0);
 BA.debugLineNum = 382;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(536870912);
act_sabad.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabad.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabad.mostCurrent.__c.runMethod(false,"LastException",act_sabad.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabad.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-UpdateSumSabad"))));
 };
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}