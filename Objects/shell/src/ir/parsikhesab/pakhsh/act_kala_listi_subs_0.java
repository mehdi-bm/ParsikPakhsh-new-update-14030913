package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_kala_listi_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,82);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","activity_create", _firsttime);}
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Activity.LoadLayout(\"l_kalalisti\")";
Debug.ShouldStop(262144);
act_kala_listi.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_kalalisti")),act_kala_listi.mostCurrent.activityBA);
 BA.debugLineNum = 84;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 85;BA.debugLine="lstSelectedCodeGroupKala.Initialize";
Debug.ShouldStop(1048576);
act_kala_listi.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 87;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(4194304);
act_kala_listi.mostCurrent._hlv.runMethod(false,"Initializer",act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 88;BA.debugLine="pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)";
Debug.ShouldStop(8388608);
act_kala_listi.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_kala_listi.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_kala_listi.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_kala_listi.mostCurrent.activityBA)),(Object)(act_kala_listi.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 89;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(16777216);
act_kala_listi.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 90;BA.debugLine="MCode.page = \"Kala_listi\"";
Debug.ShouldStop(33554432);
act_kala_listi.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Kala_listi");
 BA.debugLineNum = 92;BA.debugLine="Dialog.Initialize (Activity)";
Debug.ShouldStop(134217728);
act_kala_listi.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_kala_listi.mostCurrent._activity.getObject()));
 BA.debugLineNum = 93;BA.debugLine="ListGoroohKala.Initialize";
Debug.ShouldStop(268435456);
act_kala_listi.mostCurrent._listgoroohkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 94;BA.debugLine="OriginalListGoroohKala.Initialize";
Debug.ShouldStop(536870912);
act_kala_listi.mostCurrent._originallistgoroohkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 95;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\",True,True)";
Debug.ShouldStop(1073741824);
act_kala_listi.mostCurrent._nicespinner.runVoidMethod ("Initialize",act_kala_listi.mostCurrent.activityBA,(Object)(BA.ObjectToString("NiceSpinner")),(Object)(act_kala_listi.mostCurrent.__c.getField(true,"True")),(Object)(act_kala_listi.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 97;BA.debugLine="Panel2.AddView(NiceSpinner,B4XComboBox1.mBase.Lef";
Debug.ShouldStop(1);
act_kala_listi.mostCurrent._panel2.runVoidMethod ("AddView",(Object)((act_kala_listi.mostCurrent._nicespinner.getObject())),(Object)(act_kala_listi.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_kala_listi.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_kala_listi.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_kala_listi.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 98;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
Debug.ShouldStop(2);
act_kala_listi.mostCurrent._nicespinner.runMethod(true,"setTextColor",act_kala_listi.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 99;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(4);
act_kala_listi.mostCurrent._nicespinner.runMethod(true,"setGravity",act_kala_listi.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 100;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"p";
Debug.ShouldStop(8);
act_kala_listi.mostCurrent._nicespinner.runMethod(false,"setTypeface",act_kala_listi.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 101;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(16);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 102;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
Debug.ShouldStop(32);
_op.runVoidMethod ("Initialize2",(Object)(act_kala_listi.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_kala_listi.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_kala_listi.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_kala_listi.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 103;BA.debugLine="NiceSpinner.Background=op";
Debug.ShouldStop(64);
act_kala_listi.mostCurrent._nicespinner.runMethod(false,"setBackground",(_op.getObject()));
 BA.debugLineNum = 105;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\",True,True)";
Debug.ShouldStop(256);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_kala_listi.mostCurrent.activityBA,(Object)(BA.ObjectToString("NiceSpinner1")),(Object)(act_kala_listi.mostCurrent.__c.getField(true,"True")),(Object)(act_kala_listi.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 107;BA.debugLine="Panel2.AddView(NiceSpinner1,B4XComboBox2.mBase.Le";
Debug.ShouldStop(1024);
act_kala_listi.mostCurrent._panel2.runVoidMethod ("AddView",(Object)((act_kala_listi.mostCurrent._nicespinner1.getObject())),(Object)(act_kala_listi.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_kala_listi.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_kala_listi.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_kala_listi.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 108;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(2048);
act_kala_listi.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_kala_listi.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 109;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(4096);
act_kala_listi.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_kala_listi.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 110;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(\"";
Debug.ShouldStop(8192);
act_kala_listi.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_kala_listi.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 111;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(16384);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 112;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
Debug.ShouldStop(32768);
_op1.runVoidMethod ("Initialize2",(Object)(act_kala_listi.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_kala_listi.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_kala_listi.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_kala_listi.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 113;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(65536);
act_kala_listi.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 114;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(131072);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 116;BA.debugLine="ListGroohKala.Initialize";
Debug.ShouldStop(524288);
act_kala_listi.mostCurrent._listgroohkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 117;BA.debugLine="OrginalListKala.Initialize";
Debug.ShouldStop(1048576);
act_kala_listi.mostCurrent._orginallistkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 118;BA.debugLine="ListKalaSp.Initialize";
Debug.ShouldStop(2097152);
act_kala_listi.mostCurrent._listkalasp.runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="ListKalaTxt.Initialize";
Debug.ShouldStop(4194304);
act_kala_listi.mostCurrent._listkalatxt.runVoidMethod ("Initialize");
 BA.debugLineNum = 121;BA.debugLine="LoadAcSpGroohKala";
Debug.ShouldStop(16777216);
_loadacspgroohkala();
 BA.debugLineNum = 125;BA.debugLine="HLV.Show";
Debug.ShouldStop(268435456);
act_kala_listi.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 138;BA.debugLine="ListTasvie.Initialize";
Debug.ShouldStop(512);
act_kala_listi.mostCurrent._listtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 139;BA.debugLine="ListTasvie=MCode.LoadAcSpNoeTasvie";
Debug.ShouldStop(1024);
act_kala_listi.mostCurrent._listtasvie = act_kala_listi.mostCurrent._mcode.runMethod(false,"_loadacspnoetasvie" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA);
 BA.debugLineNum = 140;BA.debugLine="LoadNoeTasvie";
Debug.ShouldStop(2048);
_loadnoetasvie();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kala_listi.processBA, e38.toString()); BA.debugLineNum = 144;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","531588414",BA.ObjectToString(act_kala_listi.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA)),0);
 BA.debugLineNum = 145;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(65536);
act_kala_listi.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kala_listi.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kala_listi.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_KeyPress (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,835);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","activity_keypress", _keycode);}
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 835;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(4);
 BA.debugLineNum = 836;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_kala_listi.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 837;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From";
Debug.ShouldStop(16);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_kala_listi.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu1", _cu1);Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 838;BA.debugLine="If Cu1.RowCount>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 839;BA.debugLine="Dim Res As Int = Msgbox2(\"با خارج شدن از این صف";
Debug.ShouldStop(64);
_res = act_kala_listi.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("با خارج شدن از این صفحه، سبد خرید شما خالی میشود."),act_kala_listi.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("آیا از این صفحه خارج می شوید؟")))),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((act_kala_listi.mostCurrent.__c.getField(false,"Null"))),act_kala_listi.mostCurrent.activityBA);Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 840;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, act_kala_listi.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 841;BA.debugLine="btn_Back_Click";
Debug.ShouldStop(256);
_btn_back_click();
 };
 }else {
 BA.debugLineNum = 844;BA.debugLine="btn_Back_Click";
Debug.ShouldStop(2048);
_btn_back_click();
 };
 BA.debugLineNum = 846;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) return act_kala_listi.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 848;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return act_kala_listi.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 849;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Pause (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,384);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 384;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 386;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Resume (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,368);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","activity_resume");}
 BA.debugLineNum = 368;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 369;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 372;BA.debugLine="StartService(FusedLocationService)";
Debug.ShouldStop(524288);
act_kala_listi.mostCurrent.__c.runVoidMethod ("StartService",act_kala_listi.processBA,(Object)((act_kala_listi.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 373;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(1048576);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","531784965",RemoteObject.createImmutable("Gps Start"),0);
 BA.debugLineNum = 374;BA.debugLine="LoadKala";
Debug.ShouldStop(2097152);
_loadkala();
 BA.debugLineNum = 376;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(8388608);
_refreshlblsabad();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kala_listi.processBA, e7.toString()); BA.debugLineNum = 379;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","531784971",BA.ObjectToString(act_kala_listi.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA)),0);
 BA.debugLineNum = 380;BA.debugLine="myCode.SendError(LastException,\"Act_KalaDefault-";
Debug.ShouldStop(134217728);
act_kala_listi.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kala_listi.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA))),(Object)(RemoteObject.createImmutable("Act_KalaDefault-Activity_Resume")));
 };
 BA.debugLineNum = 382;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("AddToSabad (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1149);
if (RapidSub.canDelegate("addtosabad")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","addtosabad", _item);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _check = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _ishas = RemoteObject.createImmutable(false);
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _item2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterchangefeekala");
Debug.locals.put("Item", _item);
 BA.debugLineNum = 1149;BA.debugLine="Sub AddToSabad(Item As AdapterListKala)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1151;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(1073741824);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kala_listi.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1152;BA.debugLine="Dim Check As Boolean";
Debug.ShouldStop(-2147483648);
_check = RemoteObject.createImmutable(false);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1153;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(1);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1154;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(2);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1155;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),_item.getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1156;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 1157;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
Debug.ShouldStop(16);
act_kala_listi.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldCodeKala = '"),_item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 1158;BA.debugLine="Dim ishas As Boolean=False";
Debug.ShouldStop(32);
_ishas = act_kala_listi.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 1159;BA.debugLine="Dim c As Int=0";
Debug.ShouldStop(64);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 1160;BA.debugLine="For i=0 To MCode.lstChangeFeeKala.Size-1";
Debug.ShouldStop(128);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._mcode._lstchangefeekala /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1161;BA.debugLine="Dim Item2 = MCode.lstChangeFeeKala.Get(i) As";
Debug.ShouldStop(256);
_item2 = (act_kala_listi.mostCurrent._mcode._lstchangefeekala /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item2", _item2);Debug.locals.put("Item2", _item2);
 BA.debugLineNum = 1162;BA.debugLine="If Item2.FldCodKala=Item.CodeKala Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_item2.getField(true,"FldCodKala" /*RemoteObject*/ ),_item.getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1163;BA.debugLine="ishas=True";
Debug.ShouldStop(1024);
_ishas = act_kala_listi.mostCurrent.__c.getField(true,"True");Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 1164;BA.debugLine="c=i";
Debug.ShouldStop(2048);
_c = BA.numberCast(int.class, _i);Debug.locals.put("c", _c);
 BA.debugLineNum = 1165;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 }else {
 BA.debugLineNum = 1167;BA.debugLine="ishas=False";
Debug.ShouldStop(16384);
_ishas = act_kala_listi.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1171;BA.debugLine="If ishas Then";
Debug.ShouldStop(262144);
if (_ishas.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1172;BA.debugLine="MCode.lstChangeFeeKala.RemoveAt(c)";
Debug.ShouldStop(524288);
act_kala_listi.mostCurrent._mcode._lstchangefeekala /*RemoteObject*/ .runVoidMethod ("RemoveAt",(Object)(_c));
 };
 }else {
 BA.debugLineNum = 1175;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
Debug.ShouldStop(4194304);
act_kala_listi.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadDarSabadJoz = '"),_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadDarSabadKol = '"),_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("' Where FldCodeKala = '"),_item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 1178;BA.debugLine="Check = True";
Debug.ShouldStop(33554432);
_check = act_kala_listi.mostCurrent.__c.getField(true,"True");Debug.locals.put("Check", _check);
 BA.debugLineNum = 1179;BA.debugLine="Exit";
Debug.ShouldStop(67108864);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1182;BA.debugLine="If Check = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_check,act_kala_listi.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1183;BA.debugLine="MCode.AddToSabad(Item)";
Debug.ShouldStop(1073741824);
act_kala_listi.mostCurrent._mcode.runVoidMethod ("_addtosabad" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(_item));
 };
 BA.debugLineNum = 1185;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(1);
_refreshlblsabad();
 BA.debugLineNum = 1186;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("btn_Back_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,831);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","btn_back_click");}
 BA.debugLineNum = 831;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 833;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
act_kala_listi.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 834;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_discount_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("btn_discount_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1033);
if (RapidSub.canDelegate("btn_discount_click")) { ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","btn_discount_click", _item); return;}
ResumableSub_btn_discount_Click rsub = new ResumableSub_btn_discount_Click(null,_item);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btn_discount_Click extends BA.ResumableSub {
public ResumableSub_btn_discount_Click(ir.parsikhesab.pakhsh.act_kala_listi parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kala_listi parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);
RemoteObject _feebadaztakhfif = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btn_discount_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1033);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 1034;BA.debugLine="Try";
Debug.ShouldStop(512);
if (true) break;

case 1:
//try
this.state = 33;
this.catchState = 32;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 32;
 BA.debugLineNum = 1035;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(1024);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 1036;BA.debugLine="input.Initialize";
Debug.ShouldStop(2048);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA);
 BA.debugLineNum = 1037;BA.debugLine="input.lblTitle.Text = \"تخفیف:\"";
Debug.ShouldStop(4096);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("تخفیف:"));
 BA.debugLineNum = 1038;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(8192);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1039;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowTemplate(inp";
Debug.ShouldStop(16384);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1040;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(32768);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_kala_listi.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 1041;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_kala_listi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kala_listi", "btn_discount_click"), _rs);
this.state = 34;
return;
case 34:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1042;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1043;BA.debugLine="If input.Text=\"\" Then input.Text=0";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_input.getField(true,"_text" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_input.setField ("_text" /*RemoteObject*/ ,BA.NumberToString(0));
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1044;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(524288);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1045;BA.debugLine="If Item.FeeForoosh<res Then";
Debug.ShouldStop(1048576);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("<",_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _res))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1046;BA.debugLine="ToastMessageShow(\"مبلغ تخفیف نمیتواند بیشتر از";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مبلغ تخفیف نمیتواند بیشتر از فی فروش باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1047;BA.debugLine="Return";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1049;BA.debugLine="If Item.fldFeeBadAzTakhfif>0 And Item.fldFeeBad";
Debug.ShouldStop(16777216);

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",BA.numberCast(double.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, _res))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1050;BA.debugLine="ToastMessageShow(\"مبلغ تخفیف نمیتواند بیشتر از";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مبلغ تخفیف نمیتواند بیشتر از فی بعد از تخفیف باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1051;BA.debugLine="Return";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 1056;BA.debugLine="Dim feebadaztakhfif As Int=Item.fldFeeBadAzTakh";
Debug.ShouldStop(-2147483648);
_feebadaztakhfif = BA.numberCast(int.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ));Debug.locals.put("feebadaztakhfif", _feebadaztakhfif);Debug.locals.put("feebadaztakhfif", _feebadaztakhfif);
 BA.debugLineNum = 1057;BA.debugLine="If res>0 And feebadaztakhfif=0 Then";
Debug.ShouldStop(1);
if (true) break;

case 20:
//if
this.state = 29;
if (RemoteObject.solveBoolean(">",_res,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
this.state = 22;
}else 
{ BA.debugLineNum = 1060;BA.debugLine="else If res>0 And feebadaztakhfif>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_res,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
this.state = 24;
}else 
{ BA.debugLineNum = 1063;BA.debugLine="Else if res=0 And feebadaztakhfif=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
this.state = 26;
}else 
{ BA.debugLineNum = 1066;BA.debugLine="Else if res=0 And feebadaztakhfif>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
this.state = 28;
}}}}
if (true) break;

case 22:
//C
this.state = 29;
 BA.debugLineNum = 1058;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.FeeForoosh-res";
Debug.ShouldStop(2);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),_res}, "-",1, 0)));
 BA.debugLineNum = 1059;BA.debugLine="ToastMessageShow(\"تخفیف با موفقیت اعمال شد ، ج";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 24:
//C
this.state = 29;
 BA.debugLineNum = 1061;BA.debugLine="Item.fldFeeBadAzTakhfif=feebadaztakhfif-res";
Debug.ShouldStop(16);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_feebadaztakhfif,_res}, "-",1, 0)));
 BA.debugLineNum = 1062;BA.debugLine="ToastMessageShow(\"تخفیف با موفقیت اعمال شد ، ج";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 1064;BA.debugLine="Item.fldFeeBadAzTakhfif=res";
Debug.ShouldStop(128);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 1065;BA.debugLine="Item.MablaghTakhfif=res";
Debug.ShouldStop(256);
_item.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, _res));
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1067;BA.debugLine="Item.fldFeeBadAzTakhfif=feebadaztakhfif";
Debug.ShouldStop(1024);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(_feebadaztakhfif));
 if (true) break;

case 29:
//C
this.state = 30;
;
 BA.debugLineNum = 1069;BA.debugLine="Item.MablaghTakhfif=res";
Debug.ShouldStop(4096);
_item.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, _res));
 BA.debugLineNum = 1070;BA.debugLine="MCode.UpdateNoeTasvieDarSabad(FeeTip,Item)";
Debug.ShouldStop(8192);
parent.mostCurrent._mcode.runVoidMethod ("_updatenoetasviedarsabad" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, parent.mostCurrent._feetip)),(Object)(_item));
 BA.debugLineNum = 1072;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(32768);
parent.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 if (true) break;

case 30:
//C
this.state = 33;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 0;
 BA.debugLineNum = 1075;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","533751082",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1076;BA.debugLine="myCode.SendError(LastException,\"Kala_listi-btn_d";
Debug.ShouldStop(524288);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA))),(Object)(RemoteObject.createImmutable("Kala_listi-btn_discount_Click")));
 if (true) break;
if (true) break;

case 33:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1079;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_kala_listi.processBA, e0.toString());}
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
public static void  _btn_edit_price_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("btn_edit_Price_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,995);
if (RapidSub.canDelegate("btn_edit_price_click")) { ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","btn_edit_price_click", _item); return;}
ResumableSub_btn_edit_Price_Click rsub = new ResumableSub_btn_edit_Price_Click(null,_item);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btn_edit_Price_Click extends BA.ResumableSub {
public ResumableSub_btn_edit_Price_Click(ir.parsikhesab.pakhsh.act_kala_listi parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kala_listi parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btn_edit_Price_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,995);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 996;BA.debugLine="Try";
Debug.ShouldStop(8);
if (true) break;

case 1:
//try
this.state = 22;
this.catchState = 21;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 21;
 BA.debugLineNum = 997;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(16);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 998;BA.debugLine="input.Initialize";
Debug.ShouldStop(32);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA);
 BA.debugLineNum = 999;BA.debugLine="input.lblTitle.Text = \"قیمت جدید:\"";
Debug.ShouldStop(64);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("قیمت جدید:"));
 BA.debugLineNum = 1000;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(128);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1001;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowTemplate(inp";
Debug.ShouldStop(256);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1002;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(512);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_kala_listi.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 1003;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_kala_listi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kala_listi", "btn_edit_price_click"), _rs);
this.state = 23;
return;
case 23:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1004;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1005;BA.debugLine="If input.Text=\"\" Then input.Text=0";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_input.getField(true,"_text" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_input.setField ("_text" /*RemoteObject*/ ,BA.NumberToString(0));
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1006;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(8192);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1012;BA.debugLine="Item.FeeForoosh=res";
Debug.ShouldStop(524288);
_item.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _res));
 BA.debugLineNum = 1014;BA.debugLine="If Item.MablaghTakhfif>0 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 1015;BA.debugLine="Item.fldFeeBadAzTakhfif=res-Item.MablaghTakhfi";
Debug.ShouldStop(4194304);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_res,_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1017;BA.debugLine="Item.fldFeeBadAzTakhfif=0";
Debug.ShouldStop(16777216);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1022;BA.debugLine="MCode.UpdateFeeSabad(res,Item.CodeKala)";
Debug.ShouldStop(536870912);
parent.mostCurrent._mcode.runVoidMethod ("_updatefeesabad" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(BA.NumberToString(_res)),(Object)(_item.getField(true,"CodeKala" /*RemoteObject*/ )));
 BA.debugLineNum = 1023;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(1073741824);
_refreshlblsabad();
 if (true) break;

case 19:
//C
this.state = 22;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
 BA.debugLineNum = 1027;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","533685536",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1028;BA.debugLine="myCode.SendError(LastException,\"Kala_listi-btn_e";
Debug.ShouldStop(8);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA))),(Object)(RemoteObject.createImmutable("Kala_listi-btn_edit_Price_Click")));
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1031;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_kala_listi.processBA, e0.toString());}
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
public static RemoteObject  _btncloserestorpnl_click() throws Exception{
try {
		Debug.PushSubsStack("btnCloseRestorpnl_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1206);
if (RapidSub.canDelegate("btncloserestorpnl_click")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","btncloserestorpnl_click");}
 BA.debugLineNum = 1206;BA.debugLine="Sub btnCloseRestorpnl_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1208;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncommentexit_click() throws Exception{
try {
		Debug.PushSubsStack("BtnCommentExit_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,809);
if (RapidSub.canDelegate("btncommentexit_click")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","btncommentexit_click");}
 BA.debugLineNum = 809;BA.debugLine="Sub BtnCommentExit_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 810;BA.debugLine="pnlFilter.SetVisibleAnimated(300,False)";
Debug.ShouldStop(512);
act_kala_listi.mostCurrent._pnlfilter.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(act_kala_listi.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 811;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsearch_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSearch_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,884);
if (RapidSub.canDelegate("btnsearch_click")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","btnsearch_click");}
 BA.debugLineNum = 884;BA.debugLine="Sub BtnSearch_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 885;BA.debugLine="Log(\"BtnSearch_Click\")";
Debug.ShouldStop(1048576);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","533161217",RemoteObject.createImmutable("BtnSearch_Click"),0);
 BA.debugLineNum = 886;BA.debugLine="If BtnSearch.Tag=True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._btnsearch.runMethod(false,"getTag"),(act_kala_listi.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 887;BA.debugLine="TxtSearch.Visible=True";
Debug.ShouldStop(4194304);
act_kala_listi.mostCurrent._txtsearch.runMethod(true,"setVisible",act_kala_listi.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 889;BA.debugLine="BtnSearch.Tag=False";
Debug.ShouldStop(16777216);
act_kala_listi.mostCurrent._btnsearch.runMethod(false,"setTag",(act_kala_listi.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 892;BA.debugLine="TxtSearch.Visible=False";
Debug.ShouldStop(134217728);
act_kala_listi.mostCurrent._txtsearch.runMethod(true,"setVisible",act_kala_listi.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 893;BA.debugLine="BtnSearch.Tag=True";
Debug.ShouldStop(268435456);
act_kala_listi.mostCurrent._btnsearch.runMethod(false,"setTag",(act_kala_listi.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 895;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshowfilterpnl_click() throws Exception{
try {
		Debug.PushSubsStack("BtnShowFilterPnl_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,813);
if (RapidSub.canDelegate("btnshowfilterpnl_click")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","btnshowfilterpnl_click");}
 BA.debugLineNum = 813;BA.debugLine="Sub BtnShowFilterPnl_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 814;BA.debugLine="If Panel2.Height = Label11.top Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._panel2.runMethod(true,"getHeight"),BA.numberCast(double.class, act_kala_listi.mostCurrent._label11.runMethod(true,"getTop")))) { 
 BA.debugLineNum = 815;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
Debug.ShouldStop(16384);
act_kala_listi.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_kala_listi.mostCurrent._panel2.runMethod(true,"getLeft")),(Object)(act_kala_listi.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(act_kala_listi.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._lblpoint.runMethod(true,"getTop"),act_kala_listi.mostCurrent._lblpoint.runMethod(true,"getHeight")}, "+",1, 1)));
 BA.debugLineNum = 816;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
Debug.ShouldStop(32768);
act_kala_listi.mostCurrent._pnl_tools.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._panel2.runMethod(true,"getTop"),act_kala_listi.mostCurrent._panel2.runMethod(true,"getHeight"),act_kala_listi.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_kala_listi.mostCurrent.activityBA)}, "++",2, 1)),(Object)(act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getWidth")),(Object)(act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getHeight")));
 BA.debugLineNum = 817;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
Debug.ShouldStop(65536);
act_kala_listi.mostCurrent._pnl_hlv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_kala_listi.mostCurrent._pnl_hlv.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getTop"),act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(act_kala_listi.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._pnl_down.runMethod(true,"getTop"),act_kala_listi.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 13)),act_kala_listi.mostCurrent.activityBA),act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getTop"),act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "--+",3, 1)));
 BA.debugLineNum = 818;BA.debugLine="HLV.Height=pnl_HLV.Height";
Debug.ShouldStop(131072);
act_kala_listi.mostCurrent._hlv.runMethod(true,"setHeight",act_kala_listi.mostCurrent._pnl_hlv.runMethod(true,"getHeight"));
 }else {
 BA.debugLineNum = 820;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
Debug.ShouldStop(524288);
act_kala_listi.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_kala_listi.mostCurrent._panel2.runMethod(true,"getLeft")),(Object)(act_kala_listi.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(act_kala_listi.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(act_kala_listi.mostCurrent._label11.runMethod(true,"getTop")));
 BA.debugLineNum = 821;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
Debug.ShouldStop(1048576);
act_kala_listi.mostCurrent._pnl_tools.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._pnl_top.runMethod(true,"getTop"),act_kala_listi.mostCurrent._pnl_top.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getWidth")),(Object)(act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getHeight")));
 BA.debugLineNum = 822;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
Debug.ShouldStop(2097152);
act_kala_listi.mostCurrent._pnl_hlv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_kala_listi.mostCurrent._pnl_hlv.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getTop"),act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(act_kala_listi.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._pnl_down.runMethod(true,"getTop"),act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getTop"),act_kala_listi.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "-+",2, 1)));
 BA.debugLineNum = 823;BA.debugLine="HLV.Height=pnl_HLV.Height - 13%y";
Debug.ShouldStop(4194304);
act_kala_listi.mostCurrent._hlv.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._pnl_hlv.runMethod(true,"getHeight"),act_kala_listi.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 13)),act_kala_listi.mostCurrent.activityBA)}, "-",1, 1));
 };
 BA.debugLineNum = 825;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnupdate_click() throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,152);
if (RapidSub.canDelegate("btnupdate_click")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","btnupdate_click");}
 BA.debugLineNum = 152;BA.debugLine="Sub btnUpdate_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(16777216);
if (act_kala_listi.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 154;BA.debugLine="MCode.page=\"Kala_listi\"";
Debug.ShouldStop(33554432);
act_kala_listi.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Kala_listi");
 BA.debugLineNum = 155;BA.debugLine="FirebaseMessaging.mode=\"GetGalleryKala\"";
Debug.ShouldStop(67108864);
act_kala_listi.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = BA.ObjectToString("GetGalleryKala");
 BA.debugLineNum = 157;BA.debugLine="StopService(FusedLocationService)";
Debug.ShouldStop(268435456);
act_kala_listi.mostCurrent.__c.runVoidMethod ("StopService",act_kala_listi.processBA,(Object)((act_kala_listi.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 158;BA.debugLine="StartService(FirebaseMessaging)";
Debug.ShouldStop(536870912);
act_kala_listi.mostCurrent.__c.runVoidMethod ("StartService",act_kala_listi.processBA,(Object)((act_kala_listi.mostCurrent._firebasemessaging.getObject())));
 }else {
 BA.debugLineNum = 161;BA.debugLine="LoadKala";
Debug.ShouldStop(1);
_loadkala();
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
public static RemoteObject  _cmbbox1_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("CmbBox1_SelectedIndexChanged (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1225);
if (RapidSub.canDelegate("cmbbox1_selectedindexchanged")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","cmbbox1_selectedindexchanged", _index);}
RemoteObject _itemtasvie = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 1225;BA.debugLine="Sub CmbBox1_SelectedIndexChanged (Index As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 1226;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 1227;BA.debugLine="FeeTip = 0";
Debug.ShouldStop(1024);
act_kala_listi.mostCurrent._feetip = BA.NumberToString(0);
 BA.debugLineNum = 1228;BA.debugLine="MCode.feeTip=0";
Debug.ShouldStop(2048);
act_kala_listi.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1229;BA.debugLine="MCode.feeCode=0";
Debug.ShouldStop(4096);
act_kala_listi.mostCurrent._mcode._feecode /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1230;BA.debugLine="If Index=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1231;BA.debugLine="LoadKala";
Debug.ShouldStop(16384);
_loadkala();
 }else {
 BA.debugLineNum = 1233;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
Debug.ShouldStop(65536);
_itemtasvie = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 1234;BA.debugLine="FeeTip = Index";
Debug.ShouldStop(131072);
act_kala_listi.mostCurrent._feetip = BA.NumberToString(_index);
 BA.debugLineNum = 1235;BA.debugLine="MCode.feeTip=Index";
Debug.ShouldStop(262144);
act_kala_listi.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(_index);
 BA.debugLineNum = 1236;BA.debugLine="ItemTasvie.Initialize";
Debug.ShouldStop(524288);
_itemtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 1237;BA.debugLine="ItemTasvie=ListTasvie.Get(FeeTip-1)";
Debug.ShouldStop(1048576);
_itemtasvie = (act_kala_listi.mostCurrent._listtasvie.runMethod(false,"Get",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kala_listi.mostCurrent._feetip),RemoteObject.createImmutable(1)}, "-",1, 0)))));Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 1239;BA.debugLine="MCode.feeCode=ItemTasvie.FldC_Tasvie";
Debug.ShouldStop(4194304);
act_kala_listi.mostCurrent._mcode._feecode /*RemoteObject*/  = _itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ );
 BA.debugLineNum = 1240;BA.debugLine="Log(\"Fee: \"&Index)";
Debug.ShouldStop(8388608);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","534209807",RemoteObject.concat(RemoteObject.createImmutable("Fee: "),_index),0);
 BA.debugLineNum = 1242;BA.debugLine="UpdateFee";
Debug.ShouldStop(33554432);
_updatefee();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kala_listi.processBA, e18.toString()); BA.debugLineNum = 1245;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","534209812",BA.ObjectToString(act_kala_listi.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1246;BA.debugLine="myCode.SendError(LastException,\"Kala_listi-CmbBo";
Debug.ShouldStop(536870912);
act_kala_listi.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kala_listi.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA))),(Object)(RemoteObject.createImmutable("Kala_listi-CmbBox1_SelectedIndexChanged")));
 };
 BA.debugLineNum = 1249;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Dim HLV As Hitex_LayoutView";
act_kala_listi.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 13;BA.debugLine="Public NiceSpinner As Hitex_NiceSpinner";
act_kala_listi.mostCurrent._nicespinner = RemoteObject.createNew ("hitex.nice.spinner.Hitex_NiceSpinner");
 //BA.debugLineNum = 14;BA.debugLine="Public NiceSpinner1 As Hitex_NiceSpinner";
act_kala_listi.mostCurrent._nicespinner1 = RemoteObject.createNew ("hitex.nice.spinner.Hitex_NiceSpinner");
 //BA.debugLineNum = 15;BA.debugLine="Dim Key As IME";
act_kala_listi.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 16;BA.debugLine="Dim ListKalaTxt,ListKalaSp,OrginalListKala As Lis";
act_kala_listi.mostCurrent._listkalatxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_kala_listi.mostCurrent._listkalasp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_kala_listi.mostCurrent._orginallistkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 17;BA.debugLine="Dim ListGroohKala As List";
act_kala_listi.mostCurrent._listgroohkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 18;BA.debugLine="Dim FeeTip As String";
act_kala_listi.mostCurrent._feetip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Private Str_sort As String = \" Order by fldCodeKa";
act_kala_listi.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodeKala Asc");
 //BA.debugLineNum = 21;BA.debugLine="Dim Barcode As JhsIceZxing1";
act_kala_listi.mostCurrent._barcode = RemoteObject.createNew ("ice.zxing.b4aZXingLib");
 //BA.debugLineNum = 25;BA.debugLine="Private LblBasketCount As Label";
act_kala_listi.mostCurrent._lblbasketcount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LblBasket As Label";
act_kala_listi.mostCurrent._lblbasket = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private BtnShowFilterPnl As ImageView";
act_kala_listi.mostCurrent._btnshowfilterpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private TxtSearch As EditText";
act_kala_listi.mostCurrent._txtsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
act_kala_listi.mostCurrent._b4xcombobox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 30;BA.debugLine="Private B4XComboBox2 As B4XComboBox";
act_kala_listi.mostCurrent._b4xcombobox2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 31;BA.debugLine="Private BtnCommentExit As Button";
act_kala_listi.mostCurrent._btncommentexit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private BtnCommentOK As Button";
act_kala_listi.mostCurrent._btncommentok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private pnlFilter As Panel";
act_kala_listi.mostCurrent._pnlfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private pnl_HLV As Panel";
act_kala_listi.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private NumberSearch As EditText";
act_kala_listi.mostCurrent._numbersearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Pnl_Top As Panel";
act_kala_listi.mostCurrent._pnl_top = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private ImageView1 As ImageView";
act_kala_listi.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btn_Back As Button";
act_kala_listi.mostCurrent._btn_back = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Label4 As Label";
act_kala_listi.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Panel2 As Panel";
act_kala_listi.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Panel3 As Panel";
act_kala_listi.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Label5 As Label";
act_kala_listi.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private Label6 As Label";
act_kala_listi.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private BtnSearch As Label";
act_kala_listi.mostCurrent._btnsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private Dialog As B4XDialog";
act_kala_listi.mostCurrent._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 56;BA.debugLine="Private XUI As XUI";
act_kala_listi.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 58;BA.debugLine="Private Img_barcode As ImageView";
act_kala_listi.mostCurrent._img_barcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private Img_Paging As ImageView";
act_kala_listi.mostCurrent._img_paging = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private Img_sort As ImageView";
act_kala_listi.mostCurrent._img_sort = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private Img_TipFee As ImageView";
act_kala_listi.mostCurrent._img_tipfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private Label11 As Label";
act_kala_listi.mostCurrent._label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private Pnl_Tools As Panel";
act_kala_listi.mostCurrent._pnl_tools = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private LblPoint As Label";
act_kala_listi.mostCurrent._lblpoint = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private SwGift As ACSwitch";
act_kala_listi.mostCurrent._swgift = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private SwMojoodi As ACSwitch";
act_kala_listi.mostCurrent._swmojoodi = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private SwPic As ACSwitch";
act_kala_listi.mostCurrent._swpic = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private SwTakhfif As ACSwitch";
act_kala_listi.mostCurrent._swtakhfif = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private Pnl_Down As Panel";
act_kala_listi.mostCurrent._pnl_down = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private Lbl_Bascket As Label";
act_kala_listi.mostCurrent._lbl_bascket = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Dim ListGoroohKala,OriginalListGoroohKala As List";
act_kala_listi.mostCurrent._listgoroohkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_kala_listi.mostCurrent._originallistgoroohkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 73;BA.debugLine="Dim GroupCodeSelect1 As String=\"0\"";
act_kala_listi.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 //BA.debugLineNum = 74;BA.debugLine="Dim GroupNameSelect1 As String=\"\"";
act_kala_listi.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 //BA.debugLineNum = 75;BA.debugLine="Dim GroupCodeSelect2 As String=\"0\"";
act_kala_listi.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 //BA.debugLineNum = 76;BA.debugLine="Dim GroupNameSelect2 As String=\"\"";
act_kala_listi.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 //BA.debugLineNum = 77;BA.debugLine="Dim lstSelectedCodeGroupKala As List";
act_kala_listi.mostCurrent._lstselectedcodegroupkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 78;BA.debugLine="Dim ListTasvie As List";
act_kala_listi.mostCurrent._listtasvie = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 79;BA.debugLine="Private CmbBox1 As B4XComboBox";
act_kala_listi.mostCurrent._cmbbox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,671);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","hlv_getitemcount");}
 BA.debugLineNum = 671;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 672;BA.debugLine="Return ListKalaTxt.Size";
Debug.ShouldStop(-2147483648);
if (true) return act_kala_listi.mostCurrent._listkalatxt.runMethod(true,"getSize");
 BA.debugLineNum = 673;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("HLV_onBindViewHolder (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,680);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_reckalalisti");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 680;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(128);
 BA.debugLineNum = 681;BA.debugLine="Dim Item = ListKalaTxt.Get(Position) As AdapterLi";
Debug.ShouldStop(256);
_item = (act_kala_listi.mostCurrent._listkalatxt.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 682;BA.debugLine="Dim rec As Cls_RecKalaListi=Parent.Tag";
Debug.ShouldStop(512);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 683;BA.debugLine="rec.Show(Item,Position)";
Debug.ShouldStop(1024);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_show" /*RemoteObject*/ ,(Object)(_item),(Object)(_position));
 BA.debugLineNum = 684;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(2048);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_getheight" /*RemoteObject*/ ));
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
public static RemoteObject  _hlv_oncreateviewholder(RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,674);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_reckalalisti");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 674;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(2);
 BA.debugLineNum = 675;BA.debugLine="Dim rec As Cls_RecKalaListi";
Debug.ShouldStop(4);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_reckalalisti");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 676;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(8);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_initialize" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(act_kala_listi.getObject()));
 BA.debugLineNum = 677;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(16);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_kala_listi.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_kala_listi.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_reckalalisti.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 678;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(32);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 679;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _img_barcode_click() throws Exception{
try {
		Debug.PushSubsStack("Img_barcode_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,687);
if (RapidSub.canDelegate("img_barcode_click")) { ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","img_barcode_click"); return;}
ResumableSub_Img_barcode_Click rsub = new ResumableSub_Img_barcode_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Img_barcode_Click extends BA.ResumableSub {
public ResumableSub_Img_barcode_Click(ir.parsikhesab.pakhsh.act_kala_listi parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kala_listi parent;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _permission = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Img_barcode_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,687);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 688;BA.debugLine="Dim Result As Boolean = True";
Debug.ShouldStop(32768);
_result = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 689;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._rp.runMethod(true,"Check",(Object)(parent._rp.getField(true,"PERMISSION_CAMERA"))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 690;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
Debug.ShouldStop(131072);
parent._rp.runVoidMethod ("CheckAndRequest",act_kala_listi.processBA,(Object)(parent._rp.getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 691;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_kala_listi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kala_listi", "img_barcode_click"), null);
this.state = 10;
return;
case 10:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 if (true) break;
;
 BA.debugLineNum = 693;BA.debugLine="If Result=False Then";
Debug.ShouldStop(1048576);

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 694;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 697;BA.debugLine="Barcode.BeginScan(\"myzx\")";
Debug.ShouldStop(16777216);
parent.mostCurrent._barcode.runVoidMethod ("BeginScan",act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("myzx")));
 if (true) break;

case 9:
//C
this.state = -1;
;
 BA.debugLineNum = 699;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _img_paging_click() throws Exception{
try {
		Debug.PushSubsStack("Img_Paging_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,804);
if (RapidSub.canDelegate("img_paging_click")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","img_paging_click");}
 BA.debugLineNum = 804;BA.debugLine="Private Sub Img_Paging_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 805;BA.debugLine="Act_KalaPaging.listKala=ListKalaTxt";
Debug.ShouldStop(16);
act_kala_listi.mostCurrent._act_kalapaging._listkala /*RemoteObject*/  = act_kala_listi.mostCurrent._listkalatxt;
 BA.debugLineNum = 806;BA.debugLine="StartActivity(Act_KalaPaging)";
Debug.ShouldStop(32);
act_kala_listi.mostCurrent.__c.runVoidMethod ("StartActivity",act_kala_listi.processBA,(Object)((act_kala_listi.mostCurrent._act_kalapaging.getObject())));
 BA.debugLineNum = 807;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _img_sort_click() throws Exception{
try {
		Debug.PushSubsStack("Img_sort_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,851);
if (RapidSub.canDelegate("img_sort_click")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","img_sort_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 851;BA.debugLine="Sub Img_sort_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 860;BA.debugLine="Dim Lst As List = Array As String(\"کد کالا\",\"نام";
Debug.ShouldStop(134217728);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_kala_listi.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("کد کالا"),BA.ObjectToString("نام کالا نزولی"),BA.ObjectToString("نام کالا صعودی"),BA.ObjectToString("ارزان ترین قیمت"),BA.ObjectToString("گرانترین قیمت"),BA.ObjectToString("کمترین موجودی"),RemoteObject.createImmutable("بیشترین موجودی")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 861;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
Debug.ShouldStop(268435456);
_res = act_kala_listi.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("مرتب سازی براساس:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_kala_listi.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 862;BA.debugLine="Select Case res";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6))) {
case 0: {
 BA.debugLineNum = 864;BA.debugLine="Str_sort = \" Order by fldCodeKala Asc\"";
Debug.ShouldStop(-2147483648);
act_kala_listi.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodeKala Asc");
 break; }
case 1: {
 BA.debugLineNum = 866;BA.debugLine="Str_sort = \" Order by fldNameKala\"";
Debug.ShouldStop(2);
act_kala_listi.mostCurrent._str_sort = BA.ObjectToString(" Order by fldNameKala");
 break; }
case 2: {
 BA.debugLineNum = 868;BA.debugLine="Str_sort = \" Order by fldNameKala Desc\"";
Debug.ShouldStop(8);
act_kala_listi.mostCurrent._str_sort = BA.ObjectToString(" Order by fldNameKala Desc");
 break; }
case 3: {
 BA.debugLineNum = 870;BA.debugLine="Str_sort = \" Order by fldFeeForoosh\"";
Debug.ShouldStop(32);
act_kala_listi.mostCurrent._str_sort = BA.ObjectToString(" Order by fldFeeForoosh");
 break; }
case 4: {
 BA.debugLineNum = 872;BA.debugLine="Str_sort = \" Order by fldFeeForoosh Desc\"";
Debug.ShouldStop(128);
act_kala_listi.mostCurrent._str_sort = BA.ObjectToString(" Order by fldFeeForoosh Desc");
 break; }
case 5: {
 BA.debugLineNum = 874;BA.debugLine="Str_sort = \" Order by SumMande\"";
Debug.ShouldStop(512);
act_kala_listi.mostCurrent._str_sort = BA.ObjectToString(" Order by SumMande");
 break; }
case 6: {
 BA.debugLineNum = 876;BA.debugLine="Str_sort = \" Order by SumMande Desc\"";
Debug.ShouldStop(2048);
act_kala_listi.mostCurrent._str_sort = BA.ObjectToString(" Order by SumMande Desc");
 break; }
}
;
 BA.debugLineNum = 878;BA.debugLine="Log(Str_sort)";
Debug.ShouldStop(8192);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","533095707",act_kala_listi.mostCurrent._str_sort,0);
 BA.debugLineNum = 880;BA.debugLine="LoadKala";
Debug.ShouldStop(32768);
_loadkala();
 BA.debugLineNum = 882;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _img_tipfee_click() throws Exception{
try {
		Debug.PushSubsStack("Img_TipFee_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,914);
if (RapidSub.canDelegate("img_tipfee_click")) { ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","img_tipfee_click"); return;}
ResumableSub_Img_TipFee_Click rsub = new ResumableSub_Img_TipFee_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Img_TipFee_Click extends BA.ResumableSub {
public ResumableSub_Img_TipFee_Click(ir.parsikhesab.pakhsh.act_kala_listi parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kala_listi parent;
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _somearray = null;
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _itemtasvie = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
int step7;
int limit7;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Img_TipFee_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,914);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 915;BA.debugLine="Dim Lst As List";
Debug.ShouldStop(262144);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 916;BA.debugLine="Lst.Initialize";
Debug.ShouldStop(524288);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 917;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(1048576);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblTasvie")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 918;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 22;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 919;BA.debugLine="Dim SomeArray(Cu.RowCount+1) As String";
Debug.ShouldStop(4194304);
_somearray = RemoteObject.createNewArray ("String", new int[] {RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("SomeArray", _somearray);
 BA.debugLineNum = 920;BA.debugLine="SomeArray(0)=\"انتخاب کنید\"";
Debug.ShouldStop(8388608);
_somearray.setArrayElement (BA.ObjectToString("انتخاب کنید"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 921;BA.debugLine="For i = 0 To Cu.RowCount-1";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//for
this.state = 7;
step7 = 1;
limit7 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 7;
if ((step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7)) this.state = 6;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step7)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 24;
 BA.debugLineNum = 922;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(33554432);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 923;BA.debugLine="SomeArray(i+1)=Cu.GetString(\"FldName\")";
Debug.ShouldStop(67108864);
_somearray.setArrayElement (_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldName"))),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 925;BA.debugLine="Lst.Initialize2(SomeArray)";
Debug.ShouldStop(268435456);
_lst.runVoidMethod ("Initialize2",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_somearray))));
 BA.debugLineNum = 926;BA.debugLine="InputListAsync(Lst,\"تیپ قیمت را انتخاب کنید\",Fee";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("InputListAsync",(Object)(_lst),(Object)(BA.ObjectToCharSequence("تیپ قیمت را انتخاب کنید")),(Object)(BA.numberCast(int.class, parent.mostCurrent._feetip)),act_kala_listi.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 927;BA.debugLine="Wait For InputList_Result (Result As Int)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","inputlist_result", act_kala_listi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kala_listi", "img_tipfee_click"), null);
this.state = 25;
return;
case 25:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 928;BA.debugLine="If Result <> -3 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 8:
//if
this.state = 21;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, -(double) (0 + 3)))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 929;BA.debugLine="Dim Res As Int=Msgbox2(\"توجه داشته باشید که با";
Debug.ShouldStop(1);
_res = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟")),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),act_kala_listi.mostCurrent.activityBA);Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 930;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2);
if (true) break;

case 11:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 932;BA.debugLine="If Result=0 Then";
Debug.ShouldStop(8);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 933;BA.debugLine="FeeTip = 0";
Debug.ShouldStop(16);
parent.mostCurrent._feetip = BA.NumberToString(0);
 BA.debugLineNum = 934;BA.debugLine="MCode.feeTip=0";
Debug.ShouldStop(32);
parent.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 935;BA.debugLine="MCode.feeCode=0";
Debug.ShouldStop(64);
parent.mostCurrent._mcode._feecode /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 936;BA.debugLine="LoadKala";
Debug.ShouldStop(128);
_loadkala();
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 938;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
Debug.ShouldStop(512);
_itemtasvie = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 939;BA.debugLine="ItemTasvie.Initialize";
Debug.ShouldStop(1024);
_itemtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 940;BA.debugLine="ItemTasvie=ListTasvie.Get(FeeTip)";
Debug.ShouldStop(2048);
_itemtasvie = (parent.mostCurrent._listtasvie.runMethod(false,"Get",(Object)(BA.numberCast(int.class, parent.mostCurrent._feetip))));Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 941;BA.debugLine="FeeTip = Result";
Debug.ShouldStop(4096);
parent.mostCurrent._feetip = BA.NumberToString(_result);
 BA.debugLineNum = 942;BA.debugLine="MCode.feeTip=Result";
Debug.ShouldStop(8192);
parent.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(_result);
 BA.debugLineNum = 943;BA.debugLine="MCode.feeCode=ItemTasvie.FldC_Tasvie";
Debug.ShouldStop(16384);
parent.mostCurrent._mcode._feecode /*RemoteObject*/  = _itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ );
 BA.debugLineNum = 944;BA.debugLine="Log(\"Fee: \"&Result)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","533488926",RemoteObject.concat(RemoteObject.createImmutable("Fee: "),_result),0);
 BA.debugLineNum = 946;BA.debugLine="UpdateFee";
Debug.ShouldStop(131072);
_updatefee();
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 955;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static void  _inputlist_result(RemoteObject _result) throws Exception{
}
public static void  _lbltedadjoz_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("LblTedadJoz_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1081);
if (RapidSub.canDelegate("lbltedadjoz_click")) { ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","lbltedadjoz_click", _item); return;}
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
public ResumableSub_LblTedadJoz_Click(ir.parsikhesab.pakhsh.act_kala_listi parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kala_listi parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblTedadJoz_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1081);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 1082;BA.debugLine="Dialog.Title = \"  \"";
Debug.ShouldStop(33554432);
parent.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("  ")));
 BA.debugLineNum = 1083;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(67108864);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 1084;BA.debugLine="input.Initialize";
Debug.ShouldStop(134217728);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA);
 BA.debugLineNum = 1085;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed";
Debug.ShouldStop(268435456);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" تعداد "),_item.getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 1086;BA.debugLine="Log(MCode.isFloat)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","533816581",BA.ObjectToString(parent.mostCurrent._mcode._isfloat /*RemoteObject*/ ),0);
 BA.debugLineNum = 1088;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 1090;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(2);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1092;BA.debugLine="input.ConfigureForNumbers(False, True)";
Debug.ShouldStop(8);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1095;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
Debug.ShouldStop(64);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1096;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(128);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_kala_listi.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 1097;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_kala_listi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kala_listi", "lbltedadjoz_click"), _rs);
this.state = 27;
return;
case 27:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1098;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 1099;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(1024);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1100;BA.debugLine="If res>=0 Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 1101;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 1102;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Teda";
Debug.ShouldStop(8192);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 1103;BA.debugLine="Item.TedadDarSabadJoz = res";
Debug.ShouldStop(16384);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 1104;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(32768);
_addtosabad(_item);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1106;BA.debugLine="If (Item.SumMande + Item.TedadDarSabadJoz) >=";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 1107;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Ted";
Debug.ShouldStop(262144);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 1108;BA.debugLine="Item.TedadDarSabadJoz = res";
Debug.ShouldStop(524288);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 1109;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(1048576);
_addtosabad(_item);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1111;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
Debug.ShouldStop(4194304);
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
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 1117;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static void  _lbltedadkol_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("LblTedadkol_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1119);
if (RapidSub.canDelegate("lbltedadkol_click")) { ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","lbltedadkol_click", _item); return;}
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
public ResumableSub_LblTedadkol_Click(ir.parsikhesab.pakhsh.act_kala_listi parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kala_listi parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblTedadkol_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1119);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 1120;BA.debugLine="Dialog.Title = \"  \"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("  ")));
 BA.debugLineNum = 1121;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(1);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 1122;BA.debugLine="input.Initialize";
Debug.ShouldStop(2);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA);
 BA.debugLineNum = 1123;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed2";
Debug.ShouldStop(4);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" تعداد "),_item.getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 1124;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(8);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1126;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
Debug.ShouldStop(32);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1127;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(64);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_kala_listi.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 1128;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_kala_listi.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kala_listi", "lbltedadkol_click"), _rs);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1129;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 1130;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(512);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1131;BA.debugLine="If res>=0 Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 1132;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 1133;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Ted";
Debug.ShouldStop(4096);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 1134;BA.debugLine="Item.TedadDarSabadKol = res";
Debug.ShouldStop(8192);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 1135;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(16384);
_addtosabad(_item);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1137;BA.debugLine="If (Item.SumMande + (Item.TedadDarSabadKol*Ite";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 1138;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Te";
Debug.ShouldStop(131072);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 1139;BA.debugLine="Item.TedadDarSabadKol = res";
Debug.ShouldStop(262144);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 1140;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(524288);
_addtosabad(_item);
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1142;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
Debug.ShouldStop(2097152);
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
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 1147;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _loadacspgroohkala() throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpGroohKala (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,388);
if (RapidSub.canDelegate("loadacspgroohkala")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","loadacspgroohkala");}
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 388;BA.debugLine="Sub LoadAcSpGroohKala";
Debug.ShouldStop(8);
 BA.debugLineNum = 389;BA.debugLine="Dim Dt As Cursor = MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(16);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt = act_kala_listi.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 390;BA.debugLine="NiceSpinner.Add(\"همه گروه ها\")";
Debug.ShouldStop(32);
act_kala_listi.mostCurrent._nicespinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 391;BA.debugLine="For i=0 To Dt.RowCount-1";
Debug.ShouldStop(64);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_dt.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 392;BA.debugLine="Dt.Position=i";
Debug.ShouldStop(128);
_dt.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 393;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(256);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 394;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(512);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 396;BA.debugLine="cu=MCode.Result(\"Select fldCodeKala From TblKala";
Debug.ShouldStop(2048);
_cu = act_kala_listi.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select fldCodeKala From TblKala where fldCodeGroup like '"),_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))),RemoteObject.createImmutable("%'"))));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 397;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 398;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(8192);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 399;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(16384);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 400;BA.debugLine="OriginalListGoroohKala.Add(Item)";
Debug.ShouldStop(32768);
act_kala_listi.mostCurrent._originallistgoroohkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 401;BA.debugLine="NiceSpinner.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(65536);
act_kala_listi.mostCurrent._nicespinner.runVoidMethod ("Add",(Object)(_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 405;BA.debugLine="NiceSpinner.Show(Colors.blue, 14)";
Debug.ShouldStop(1048576);
act_kala_listi.mostCurrent._nicespinner.runVoidMethod ("Show",(Object)(act_kala_listi.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadkala() throws Exception{
try {
		Debug.PushSubsStack("LoadKala (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,166);
if (RapidSub.canDelegate("loadkala")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","loadkala");}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _countfilter = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.createImmutable(false);
RemoteObject _search = RemoteObject.createImmutable("");
 BA.debugLineNum = 166;BA.debugLine="Sub LoadKala";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 168;BA.debugLine="Dim str As String=\"\"";
Debug.ShouldStop(128);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 169;BA.debugLine="Dim countfilter As Int=0";
Debug.ShouldStop(256);
_countfilter = BA.numberCast(int.class, 0);Debug.locals.put("countfilter", _countfilter);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 170;BA.debugLine="Dim filter As Boolean=False";
Debug.ShouldStop(512);
_filter = act_kala_listi.mostCurrent.__c.getField(true,"False");Debug.locals.put("filter", _filter);Debug.locals.put("filter", _filter);
 BA.debugLineNum = 177;BA.debugLine="Log(GroupCodeSelect1)";
Debug.ShouldStop(65536);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","531719435",act_kala_listi.mostCurrent._groupcodeselect1,0);
 BA.debugLineNum = 178;BA.debugLine="Log(GroupCodeSelect2)";
Debug.ShouldStop(131072);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","531719436",act_kala_listi.mostCurrent._groupcodeselect2,0);
 BA.debugLineNum = 179;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 The";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 180;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swgift.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 181;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1048576);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 182;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"));Debug.locals.put("str", _str);
 BA.debugLineNum = 183;BA.debugLine="filter=True";
Debug.ShouldStop(4194304);
_filter = act_kala_listi.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 184;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 185;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(16777216);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 188;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 189;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(268435456);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 190;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
Debug.ShouldStop(536870912);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 191;BA.debugLine="filter=True";
Debug.ShouldStop(1073741824);
_filter = act_kala_listi.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 192;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 193;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(1);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 196;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 197;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 198;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(32);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 199;BA.debugLine="filter=True";
Debug.ShouldStop(64);
_filter = act_kala_listi.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 200;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 201;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(256);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 204;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swpic.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 205;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(4096);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 206;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(8192);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 207;BA.debugLine="filter=True";
Debug.ShouldStop(16384);
_filter = act_kala_listi.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 208;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 209;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(65536);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 213;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 214;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
Debug.ShouldStop(2097152);
_search = act_kala_listi.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 215;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
 BA.debugLineNum = 216;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(8388608);
_search = act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 };
 BA.debugLineNum = 218;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(33554432);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 219;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(67108864);
if (act_kala_listi.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 220;BA.debugLine="If Search.Length>5 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_search.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 221;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
Debug.ShouldStop(268435456);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSerial = '"),act_kala_listi.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("') "))));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 223;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sea";
Debug.ShouldStop(1073741824);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodeKala like '%"),act_kala_listi.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 }else {
 BA.debugLineNum = 227;BA.debugLine="str = str & $\" and (fldNameKala like '%${Sear";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldNameKala like '%"),act_kala_listi.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 229;BA.debugLine="filter=True";
Debug.ShouldStop(16);
_filter = act_kala_listi.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 230;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 231;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(64);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 234;BA.debugLine="If filter=True And str<>\"\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_filter,act_kala_listi.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 237;BA.debugLine="str=\"select * from TblKala where \"&str&\" \"&Str";
Debug.ShouldStop(4096);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where "),_str,RemoteObject.createImmutable(" "),act_kala_listi.mostCurrent._str_sort);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 239;BA.debugLine="str=\"select * from TblKala  \"&Str_sort";
Debug.ShouldStop(16384);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala  "),act_kala_listi.mostCurrent._str_sort);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 241;BA.debugLine="Log(str)";
Debug.ShouldStop(65536);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","531719499",_str,0);
 };
 BA.debugLineNum = 244;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Th";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",act_kala_listi.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 245;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swgift.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 246;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2097152);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 247;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
Debug.ShouldStop(4194304);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 250;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 251;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(67108864);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 252;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
Debug.ShouldStop(134217728);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 255;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 256;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(-2147483648);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 257;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(1);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 260;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swpic.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 261;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 262;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(32);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 266;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 267;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
Debug.ShouldStop(1024);
_search = act_kala_listi.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 268;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
 BA.debugLineNum = 269;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(4096);
_search = act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 };
 BA.debugLineNum = 271;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16384);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 272;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(32768);
if (act_kala_listi.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 273;BA.debugLine="If Search.Length>5 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_search.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 274;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
Debug.ShouldStop(131072);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSerial = '"),act_kala_listi.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("') "))));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 276;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sea";
Debug.ShouldStop(524288);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodeKala like '%"),act_kala_listi.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 }else {
 BA.debugLineNum = 280;BA.debugLine="str = str & $\" and (fldNameKala like '%${Sear";
Debug.ShouldStop(8388608);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldNameKala like '%"),act_kala_listi.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 282;BA.debugLine="filter=True";
Debug.ShouldStop(33554432);
_filter = act_kala_listi.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 283;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 284;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(134217728);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 287;BA.debugLine="If	filter=True And str<>\"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_filter,act_kala_listi.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 288;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_kala_listi.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' "),_str,RemoteObject.createImmutable(" "),act_kala_listi.mostCurrent._str_sort);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 290;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(2);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_kala_listi.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' "),act_kala_listi.mostCurrent._str_sort);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 294;BA.debugLine="Log(str)";
Debug.ShouldStop(32);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","531719552",_str,0);
 };
 BA.debugLineNum = 297;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 T";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",act_kala_listi.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("!",act_kala_listi.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 298;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swgift.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 299;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1024);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 300;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
Debug.ShouldStop(2048);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 303;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 304;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(32768);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 305;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 308;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 309;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1048576);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 310;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 313;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._mcode._namayeshkalasefr /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 314;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(33554432);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 315;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(67108864);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 316;BA.debugLine="filter=True";
Debug.ShouldStop(134217728);
_filter = act_kala_listi.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 317;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 318;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(536870912);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 321;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",act_kala_listi.mostCurrent._swpic.runMethod(true,"getChecked"),act_kala_listi.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 322;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 323;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 327;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 328;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
Debug.ShouldStop(128);
_search = act_kala_listi.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 329;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
 BA.debugLineNum = 330;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(512);
_search = act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 };
 BA.debugLineNum = 332;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2048);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 333;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(4096);
if (act_kala_listi.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 334;BA.debugLine="If Search.Length>5 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_search.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 335;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
Debug.ShouldStop(16384);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSerial = '"),act_kala_listi.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("') "))));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 337;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sea";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodeKala like '%"),act_kala_listi.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 }else {
 BA.debugLineNum = 341;BA.debugLine="str = str & $\" and (fldNameKala like '%${Sear";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldNameKala like '%"),act_kala_listi.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 343;BA.debugLine="filter=True";
Debug.ShouldStop(4194304);
_filter = act_kala_listi.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 344;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 345;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(16777216);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 349;BA.debugLine="If	filter=True And str<>\"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_filter,act_kala_listi.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 350;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(536870912);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_kala_listi.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' "),_str,RemoteObject.createImmutable(" "),act_kala_listi.mostCurrent._str_sort);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 352;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_kala_listi.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' "),act_kala_listi.mostCurrent._str_sort);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 355;BA.debugLine="Log(str)";
Debug.ShouldStop(4);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","531719613",_str,0);
 };
 BA.debugLineNum = 357;BA.debugLine="FirebaseMessaging.mode=\"stop\"";
Debug.ShouldStop(16);
act_kala_listi.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = BA.ObjectToString("stop");
 BA.debugLineNum = 358;BA.debugLine="LoadListKala(str)";
Debug.ShouldStop(32);
_loadlistkala(_str);
 BA.debugLineNum = 360;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(128);
_refreshlblsabad();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e167) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kala_listi.processBA, e167.toString()); BA.debugLineNum = 362;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","531719620",BA.ObjectToString(act_kala_listi.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA)),0);
 BA.debugLineNum = 363;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1024);
act_kala_listi.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kala_listi.mostCurrent.__c.runMethod(false,"LastException",act_kala_listi.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kala_listi.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadKala"))));
 };
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadlistkala(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("LoadListKala (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,408);
if (RapidSub.canDelegate("loadlistkala")) { ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","loadlistkala", _query); return;}
ResumableSub_LoadListKala rsub = new ResumableSub_LoadListKala(null,_query);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadListKala extends BA.ResumableSub {
public ResumableSub_LoadListKala(ir.parsikhesab.pakhsh.act_kala_listi parent,RemoteObject _query) {
this.parent = parent;
this._query = _query;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kala_listi parent;
RemoteObject _query;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _itemkala = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _fee = RemoteObject.createImmutable("");
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _fldfeeforoosh = RemoteObject.createImmutable(0);
RemoteObject _fldtedaddarkarton = RemoteObject.createImmutable(0);
RemoteObject _summande = RemoteObject.createImmutable(0);
int step6;
int limit6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadListKala (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,408);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Query", _query);
 BA.debugLineNum = 411;BA.debugLine="StopService(FusedLocationService)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("StopService",act_kala_listi.processBA,(Object)((parent.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 412;BA.debugLine="OrginalListKala.Clear";
Debug.ShouldStop(134217728);
parent.mostCurrent._orginallistkala.runVoidMethod ("Clear");
 BA.debugLineNum = 413;BA.debugLine="MCode.Sql1.Initialize(File.DirDefaultExternal &\"/";
Debug.ShouldStop(268435456);
parent.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(BA.ObjectToString("parsik_db.db")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 416;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
Debug.ShouldStop(-2147483648);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(_query));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 417;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 61;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 419;BA.debugLine="For i = 0 To Cu.RowCount - 1";
Debug.ShouldStop(4);
if (true) break;

case 4:
//for
this.state = 60;
step6 = 1;
limit6 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 62;
if (true) break;

case 62:
//C
this.state = 60;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 63:
//C
this.state = 62;
_i = ((int)(0 + _i + step6)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 420;BA.debugLine="Dim ItemKala As AdapterListKala";
Debug.ShouldStop(8);
_itemkala = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");Debug.locals.put("ItemKala", _itemkala);
 BA.debugLineNum = 421;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(16);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 422;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
Debug.ShouldStop(32);
_itemkala.setField ("CodeKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeKala"))));
 BA.debugLineNum = 423;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
Debug.ShouldStop(64);
_itemkala.setField ("NameKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameKala"))));
 BA.debugLineNum = 424;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\")";
Debug.ShouldStop(128);
_itemkala.setField ("NameVahed" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed"))));
 BA.debugLineNum = 425;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed2";
Debug.ShouldStop(256);
_itemkala.setField ("NameVahed2" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))));
 BA.debugLineNum = 426;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
Debug.ShouldStop(512);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));
 BA.debugLineNum = 439;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTedad";
Debug.ShouldStop(4194304);
_itemkala.setField ("TedadDarKarton" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))));
 BA.debugLineNum = 440;BA.debugLine="Dim fee As String";
Debug.ShouldStop(8388608);
_fee = RemoteObject.createImmutable("");Debug.locals.put("fee", _fee);
 BA.debugLineNum = 441;BA.debugLine="If MCode.feeTip=0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._feetip /*RemoteObject*/ ,BA.NumberToString(0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 26;
 BA.debugLineNum = 442;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(33554432);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 448;BA.debugLine="fee=myCode.Is_Null_adad(Cu.GetString(\"fldFeeTa";
Debug.ShouldStop(-2147483648);
_fee = parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeTasvie")))));Debug.locals.put("fee", _fee);
 BA.debugLineNum = 449;BA.debugLine="MCode.UpdateFeeSabad(fee,ItemKala.CodeKala)";
Debug.ShouldStop(1);
parent.mostCurrent._mcode.runVoidMethod ("_updatefeesabad" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(_fee),(Object)(_itemkala.getField(true,"CodeKala" /*RemoteObject*/ )));
 BA.debugLineNum = 450;BA.debugLine="If 	IsNumber(fee) And fee>0 Then";
Debug.ShouldStop(2);
if (true) break;

case 12:
//if
this.state = 25;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_fee))) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _fee),BA.numberCast(double.class, 0))) { 
this.state = 14;
}else {
this.state = 24;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 451;BA.debugLine="Log(Cu.GetString(\"fldFeeTasvie\"))";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","531981611",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeTasvie"))),0);
 BA.debugLineNum = 453;BA.debugLine="If  fee>Cu.GetString(\"fldFeeBadAzTakhfif\") Th";
Debug.ShouldStop(16);
if (true) break;

case 15:
//if
this.state = 22;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _fee),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif")))))) { 
this.state = 17;
}else 
{ BA.debugLineNum = 456;BA.debugLine="Else if fee<Cu.GetString(\"fldFeeBadAzTakhfif\"";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _fee),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif")))))) { 
this.state = 19;
}else {
this.state = 21;
}}
if (true) break;

case 17:
//C
this.state = 22;
 BA.debugLineNum = 455;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(64);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 457;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee";
Debug.ShouldStop(256);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_fee);
 BA.debugLineNum = 458;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(512);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 462;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fl";
Debug.ShouldStop(8192);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 BA.debugLineNum = 463;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(16384);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 467;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(262144);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 471;BA.debugLine="fee=MCode.GetUpdateFeeSabad(fee,ItemKala.CodeKa";
Debug.ShouldStop(4194304);
_fee = parent.mostCurrent._mcode.runMethod(true,"_getupdatefeesabad" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(_fee),(Object)(_itemkala.getField(true,"CodeKala" /*RemoteObject*/ )));Debug.locals.put("fee", _fee);
 BA.debugLineNum = 472;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null The";
Debug.ShouldStop(8388608);
if (true) break;

case 27:
//if
this.state = 32;
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))))) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 474;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fldF";
Debug.ShouldStop(33554432);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 478;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(536870912);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 if (true) break;
;
 BA.debugLineNum = 480;BA.debugLine="If ItemKala.MablaghTakhfif>0 Then";
Debug.ShouldStop(-2147483648);

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean(">",_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 481;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.Mabla";
Debug.ShouldStop(1);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fee),_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 if (true) break;

case 35:
//C
this.state = 36;
;
 BA.debugLineNum = 483;BA.debugLine="ItemKala.FeeForoosh=fee";
Debug.ShouldStop(4);
_itemkala.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _fee));
 BA.debugLineNum = 486;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString(\"";
Debug.ShouldStop(32);
_itemkala.setField ("FldMablaghMasrafKonande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldGhymatMasrafkonande"))));
 BA.debugLineNum = 489;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
Debug.ShouldStop(256);
_itemkala.setField ("fldPathPic" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))));
 BA.debugLineNum = 490;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select * from T";
Debug.ShouldStop(512);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblSabad where FldCodeKala="),_itemkala.getField(true,"CodeKala" /*RemoteObject*/ ))));Debug.locals.put("cu1", _cu1);Debug.locals.put("cu1", _cu1);
 BA.debugLineNum = 491;BA.debugLine="If cu1.RowCount>0 Then";
Debug.ShouldStop(1024);
if (true) break;

case 36:
//if
this.state = 59;
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 38;
}else {
this.state = 54;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 492;BA.debugLine="cu1.Position=0";
Debug.ShouldStop(2048);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 493;BA.debugLine="FeeTip=MCode.feeTip";
Debug.ShouldStop(4096);
parent.mostCurrent._feetip = parent.mostCurrent._mcode._feetip /*RemoteObject*/ ;
 BA.debugLineNum = 494;BA.debugLine="ItemKala.TedadDarSabadJoz =cu1.Getstring(\"FldT";
Debug.ShouldStop(8192);
_itemkala.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))));
 BA.debugLineNum = 495;BA.debugLine="ItemKala.TedadDarSabadKol =cu1.Getstring(\"FldT";
Debug.ShouldStop(16384);
_itemkala.setField ("TedadDarSabadKol" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))));
 BA.debugLineNum = 496;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")-cu1";
Debug.ShouldStop(32768);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande")))),BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))))}, "-",1, 0)));
 BA.debugLineNum = 497;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 498;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Ge";
Debug.ShouldStop(131072);
_fldfeeforoosh = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 499;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(c";
Debug.ShouldStop(262144);
_fldtedaddarkarton = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 500;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\"";
Debug.ShouldStop(524288);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 501;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fld";
Debug.ShouldStop(1048576);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 502;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fl";
Debug.ShouldStop(2097152);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0)))));
 if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 505;BA.debugLine="ItemKala.FldEshantion=cu1.Getstring(\"FldEshant";
Debug.ShouldStop(16777216);
_itemkala.setField ("FldEshantion" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion"))));
 BA.debugLineNum = 507;BA.debugLine="If	MCode.TakhfifKala=\"1\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 43:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._takhfifkala /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 509;BA.debugLine="If cu1.GetString(\"FldMablaghTakhfif\")<>Null T";
Debug.ShouldStop(268435456);
if (true) break;

case 46:
//if
this.state = 51;
if (RemoteObject.solveBoolean("N",_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif"))))) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 51;
 BA.debugLineNum = 511;BA.debugLine="ItemKala.MablaghTakhfif=cu1.GetString(\"FldMa";
Debug.ShouldStop(1073741824);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif")))));
 if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 515;BA.debugLine="ItemKala.MablaghTakhfif=\"0\"";
Debug.ShouldStop(4);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, "0"));
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 59;
;
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 519;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\"  Then";
Debug.ShouldStop(64);
if (true) break;

case 55:
//if
this.state = 58;
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 520;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Ge";
Debug.ShouldStop(128);
_fldfeeforoosh = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 521;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(C";
Debug.ShouldStop(256);
_fldtedaddarkarton = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 522;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\"";
Debug.ShouldStop(512);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 523;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fld";
Debug.ShouldStop(1024);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 524;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fl";
Debug.ShouldStop(2048);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0)))));
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = 63;
;
 BA.debugLineNum = 527;BA.debugLine="cu1.Close";
Debug.ShouldStop(16384);
_cu1.runVoidMethod ("Close");
 BA.debugLineNum = 530;BA.debugLine="OrginalListKala.Add(ItemKala)";
Debug.ShouldStop(131072);
parent.mostCurrent._orginallistkala.runVoidMethod ("Add",(Object)((_itemkala)));
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 535;BA.debugLine="Cu.Close";
Debug.ShouldStop(4194304);
_cu.runVoidMethod ("Close");
 if (true) break;

case 61:
//C
this.state = -1;
;
 BA.debugLineNum = 543;BA.debugLine="ListKalaSp=OrginalListKala";
Debug.ShouldStop(1073741824);
parent.mostCurrent._listkalasp = parent.mostCurrent._orginallistkala;
 BA.debugLineNum = 544;BA.debugLine="ListKalaTxt=ListKalaSp";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._listkalatxt = parent.mostCurrent._listkalasp;
 BA.debugLineNum = 545;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_kala_listi.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kala_listi", "loadlistkala"),BA.numberCast(int.class, 100));
this.state = 64;
return;
case 64:
//C
this.state = -1;
;
 BA.debugLineNum = 547;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(4);
parent.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 551;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static RemoteObject  _loadnoetasvie() throws Exception{
try {
		Debug.PushSubsStack("LoadNoeTasvie (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1209);
if (RapidSub.canDelegate("loadnoetasvie")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","loadnoetasvie");}
RemoteObject _itemtasvie = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
RemoteObject _count = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 1209;BA.debugLine="Sub LoadNoeTasvie";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1211;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
Debug.ShouldStop(67108864);
_itemtasvie = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 1212;BA.debugLine="ItemTasvie.Initialize";
Debug.ShouldStop(134217728);
_itemtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 1213;BA.debugLine="CmbBox1.cmbBox.Add(\"انتخاب کنید\")";
Debug.ShouldStop(268435456);
act_kala_listi.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("انتخاب کنید")));
 BA.debugLineNum = 1214;BA.debugLine="Dim count As Int =ListTasvie.Size-1";
Debug.ShouldStop(536870912);
_count = RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._listtasvie.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 1215;BA.debugLine="If count> 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1216;BA.debugLine="For i = 0 To count";
Debug.ShouldStop(-2147483648);
{
final int step6 = 1;
final int limit6 = _count.<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1217;BA.debugLine="ItemTasvie=ListTasvie.Get(i)";
Debug.ShouldStop(1);
_itemtasvie = (act_kala_listi.mostCurrent._listtasvie.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 1219;BA.debugLine="CmbBox1.cmbBox.Add(ItemTasvie.FldN_Tasvie)";
Debug.ShouldStop(4);
act_kala_listi.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itemtasvie.getField(true,"FldN_Tasvie" /*RemoteObject*/ )));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1221;BA.debugLine="CmbBox1.SelectedIndex=MCode.feeTip";
Debug.ShouldStop(16);
act_kala_listi.mostCurrent._cmbbox1.runClassMethod (ir.parsikhesab.pakhsh.b4xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, act_kala_listi.mostCurrent._mcode._feetip /*RemoteObject*/ ));
 };
 BA.debugLineNum = 1223;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _myzx_result(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("myzx_result (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,701);
if (RapidSub.canDelegate("myzx_result")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","myzx_result", _atype, _values);}
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 701;BA.debugLine="Sub myzx_result(atype As String,Values As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 702;BA.debugLine="LogColor(\"type:\"&atype&\"values:\"&Values,Colors.re";
Debug.ShouldStop(536870912);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","532505857",RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("values:"),_values),act_kala_listi.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 705;BA.debugLine="TxtSearch.Text=Values";
Debug.ShouldStop(1);
act_kala_listi.mostCurrent._txtsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_values));
 BA.debugLineNum = 706;BA.debugLine="BtnSearch.Tag=True";
Debug.ShouldStop(2);
act_kala_listi.mostCurrent._btnsearch.runMethod(false,"setTag",(act_kala_listi.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 707;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner_ItemClick (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,567);
if (RapidSub.canDelegate("nicespinner_itemclick")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","nicespinner_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 567;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 569;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(16777216);
act_kala_listi.mostCurrent._key.runVoidMethod ("HideKeyboard",act_kala_listi.mostCurrent.activityBA);
 BA.debugLineNum = 572;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 573;BA.debugLine="ListGroohKala.Clear";
Debug.ShouldStop(268435456);
act_kala_listi.mostCurrent._listgroohkala.runVoidMethod ("Clear");
 BA.debugLineNum = 574;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(536870912);
act_kala_listi.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 575;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(1073741824);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 576;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(-2147483648);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 578;BA.debugLine="GroupCodeSelect1=\"0\"";
Debug.ShouldStop(2);
act_kala_listi.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 BA.debugLineNum = 579;BA.debugLine="GroupNameSelect1=\"\"";
Debug.ShouldStop(4);
act_kala_listi.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 BA.debugLineNum = 580;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(8);
act_kala_listi.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 581;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(16);
act_kala_listi.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 582;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(32);
act_kala_listi.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 585;BA.debugLine="Dim lst As List=OriginalListGoroohKala";
Debug.ShouldStop(256);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_kala_listi.mostCurrent._originallistgoroohkala;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 586;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
Debug.ShouldStop(512);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 587;BA.debugLine="Log(Item.FldN_Gorooh)";
Debug.ShouldStop(1024);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","532112660",_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 588;BA.debugLine="Log(Item.FldC_Gorooh)";
Debug.ShouldStop(2048);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","532112661",_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 589;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(4096);
act_kala_listi.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 590;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
Debug.ShouldStop(8192);
act_kala_listi.mostCurrent._groupnameselect1 = _item.getField(true,"FldN_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 591;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(16384);
act_kala_listi.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 592;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(32768);
act_kala_listi.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 593;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(65536);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 595;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(262144);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 596;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
Debug.ShouldStop(524288);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kala_listi.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 597;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 598;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(2097152);
act_kala_listi.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 599;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(4194304);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 600;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(8388608);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 601;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 602;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(33554432);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 603;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(67108864);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 604;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(134217728);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 605;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(268435456);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 606;BA.debugLine="ListGroohKala.Add(Item)";
Debug.ShouldStop(536870912);
act_kala_listi.mostCurrent._listgroohkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 607;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(1073741824);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 609;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
Debug.ShouldStop(1);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Show",(Object)(act_kala_listi.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 610;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(2);
act_kala_listi.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 611;BA.debugLine="lstSelectedCodeGroupKala.Add(GroupCodeSelect1)";
Debug.ShouldStop(4);
act_kala_listi.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Add",(Object)((act_kala_listi.mostCurrent._groupcodeselect1)));
 }else {
 BA.debugLineNum = 613;BA.debugLine="ListGroohKala.Clear";
Debug.ShouldStop(16);
act_kala_listi.mostCurrent._listgroohkala.runVoidMethod ("Clear");
 BA.debugLineNum = 614;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(32);
act_kala_listi.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 615;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(64);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 616;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(128);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 617;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(256);
act_kala_listi.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 618;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(512);
act_kala_listi.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 619;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(1024);
act_kala_listi.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 623;BA.debugLine="LoadKala";
Debug.ShouldStop(16384);
_loadkala();
 BA.debugLineNum = 624;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(32768);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","532112697",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_kala_listi.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 625;BA.debugLine="Log(\"postion1: \"&Position)";
Debug.ShouldStop(65536);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","532112698",RemoteObject.concat(RemoteObject.createImmutable("postion1: "),_position),0);
 BA.debugLineNum = 627;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner1_ItemClick (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,629);
if (RapidSub.canDelegate("nicespinner1_itemclick")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","nicespinner1_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 629;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 630;BA.debugLine="If Position=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 632;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupKala.Get(ls";
Debug.ShouldStop(8388608);
act_kala_listi.mostCurrent._groupcodeselect2 = BA.ObjectToString(act_kala_listi.mostCurrent._lstselectedcodegroupkala.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._lstselectedcodegroupkala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 }else {
 BA.debugLineNum = 634;BA.debugLine="Dim lst As List=ListGroohKala";
Debug.ShouldStop(33554432);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_kala_listi.mostCurrent._listgroohkala;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 635;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
Debug.ShouldStop(67108864);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_kala_listi.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 636;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
Debug.ShouldStop(134217728);
act_kala_listi.mostCurrent._groupcodeselect2 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 638;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(536870912);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 640;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(-2147483648);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 641;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
Debug.ShouldStop(1);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kala_listi.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 642;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 643;BA.debugLine="ListGroohKala.Clear";
Debug.ShouldStop(4);
act_kala_listi.mostCurrent._listgroohkala.runVoidMethod ("Clear");
 BA.debugLineNum = 644;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(8);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 647;BA.debugLine="lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)";
Debug.ShouldStop(64);
act_kala_listi.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Add",(Object)((_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 650;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(512);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 652;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(2048);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 653;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(4096);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 654;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(8192);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 655;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(16384);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 656;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(32768);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 657;BA.debugLine="ListGroohKala.Add(Item)";
Debug.ShouldStop(65536);
act_kala_listi.mostCurrent._listgroohkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 658;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(131072);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 661;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
Debug.ShouldStop(1048576);
act_kala_listi.mostCurrent._nicespinner1.runVoidMethod ("Show",(Object)(act_kala_listi.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 662;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(2097152);
act_kala_listi.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 665;BA.debugLine="LoadKala";
Debug.ShouldStop(16777216);
_loadkala();
 BA.debugLineNum = 666;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(33554432);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","532178213",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_kala_listi.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 667;BA.debugLine="Log(\"position2: \"&Position)";
Debug.ShouldStop(67108864);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","532178214",RemoteObject.concat(RemoteObject.createImmutable("position2: "),_position),0);
 BA.debugLineNum = 668;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _numbersearch_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("NumberSearch_TextChanged (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,780);
if (RapidSub.canDelegate("numbersearch_textchanged")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","numbersearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 780;BA.debugLine="Sub NumberSearch_TextChanged (Old As String, New A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 781;BA.debugLine="If TxtSearch.Text.StartsWith(\" \") Then";
Debug.ShouldStop(4096);
if (act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable(" "))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 782;BA.debugLine="TxtSearch.Text=TxtSearch.Text.SubString(1)";
Debug.ShouldStop(8192);
act_kala_listi.mostCurrent._txtsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 784;BA.debugLine="TxtSearch.SelectionStart=TxtSearch.Text.Length";
Debug.ShouldStop(32768);
act_kala_listi.mostCurrent._txtsearch.runMethod(true,"setSelectionStart",act_kala_listi.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 785;BA.debugLine="LoadKala";
Debug.ShouldStop(65536);
_loadkala();
 BA.debugLineNum = 786;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_down_click() throws Exception{
try {
		Debug.PushSubsStack("Pnl_Down_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,1197);
if (RapidSub.canDelegate("pnl_down_click")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","pnl_down_click");}
 BA.debugLineNum = 1197;BA.debugLine="Sub Pnl_Down_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1198;BA.debugLine="If LblBasketCount.Visible Then";
Debug.ShouldStop(8192);
if (act_kala_listi.mostCurrent._lblbasketcount.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1199;BA.debugLine="StartActivity(Act_Sabad)";
Debug.ShouldStop(16384);
act_kala_listi.mostCurrent.__c.runVoidMethod ("StartActivity",act_kala_listi.processBA,(Object)((act_kala_listi.mostCurrent._act_sabad.getObject())));
 BA.debugLineNum = 1200;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
act_kala_listi.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 1202;BA.debugLine="ToastMessageShow(\"سبد خرید خالی است\",False)";
Debug.ShouldStop(131072);
act_kala_listi.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سبد خرید خالی است")),(Object)(act_kala_listi.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 1204;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnltedad_click() throws Exception{
try {
		Debug.PushSubsStack("PnlTedad_Click (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,796);
if (RapidSub.canDelegate("pnltedad_click")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","pnltedad_click");}
 BA.debugLineNum = 796;BA.debugLine="Sub PnlTedad_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 798;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim rp As RuntimePermissions";
act_kala_listi._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refreshlblsabad() throws Exception{
try {
		Debug.PushSubsStack("RefreshLblSabad (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,556);
if (RapidSub.canDelegate("refreshlblsabad")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","refreshlblsabad");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 556;BA.debugLine="Sub RefreshLblSabad";
Debug.ShouldStop(2048);
 BA.debugLineNum = 557;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(4096);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kala_listi.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 558;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 559;BA.debugLine="LblBasketCount.Visible=True";
Debug.ShouldStop(16384);
act_kala_listi.mostCurrent._lblbasketcount.runMethod(true,"setVisible",act_kala_listi.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 560;BA.debugLine="LblBasketCount.Text=Cu.RowCount";
Debug.ShouldStop(32768);
act_kala_listi.mostCurrent._lblbasketcount.runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"getRowCount")));
 }else {
 BA.debugLineNum = 562;BA.debugLine="LblBasketCount.Visible=False";
Debug.ShouldStop(131072);
act_kala_listi.mostCurrent._lblbasketcount.runMethod(true,"setVisible",act_kala_listi.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 564;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(524288);
act_kala_listi.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 565;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swgift_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwGift_CheckedChange (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,897);
if (RapidSub.canDelegate("swgift_checkedchange")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","swgift_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 897;BA.debugLine="Sub SwGift_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 898;BA.debugLine="LoadKala";
Debug.ShouldStop(2);
_loadkala();
 BA.debugLineNum = 899;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swmojoodi_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwMojoodi_CheckedChange (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,905);
if (RapidSub.canDelegate("swmojoodi_checkedchange")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","swmojoodi_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 905;BA.debugLine="Sub SwMojoodi_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 906;BA.debugLine="LoadKala";
Debug.ShouldStop(512);
_loadkala();
 BA.debugLineNum = 907;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swpic_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwPic_CheckedChange (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,909);
if (RapidSub.canDelegate("swpic_checkedchange")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","swpic_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 909;BA.debugLine="Sub SwPic_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 911;BA.debugLine="LoadKala";
Debug.ShouldStop(16384);
_loadkala();
 BA.debugLineNum = 912;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swtakhfif_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwTakhfif_CheckedChange (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,901);
if (RapidSub.canDelegate("swtakhfif_checkedchange")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","swtakhfif_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 901;BA.debugLine="Sub SwTakhfif_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 902;BA.debugLine="LoadKala";
Debug.ShouldStop(32);
_loadkala();
 BA.debugLineNum = 903;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtsearch_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtSearch_TextChanged (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,800);
if (RapidSub.canDelegate("txtsearch_textchanged")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","txtsearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 800;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 801;BA.debugLine="LoadKala";
Debug.ShouldStop(1);
_loadkala();
 BA.debugLineNum = 803;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updatefee() throws Exception{
try {
		Debug.PushSubsStack("UpdateFee (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,961);
if (RapidSub.canDelegate("updatefee")) { ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","updatefee"); return;}
ResumableSub_UpdateFee rsub = new ResumableSub_UpdateFee(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateFee extends BA.ResumableSub {
public ResumableSub_UpdateFee(ir.parsikhesab.pakhsh.act_kala_listi parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kala_listi parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateFee (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,961);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 962;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 963;BA.debugLine="Log(\"UpdateFee Online\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","533554434",RemoteObject.createImmutable("UpdateFee Online"),0);
 BA.debugLineNum = 964;BA.debugLine="MCode.page=\"Kala_listi\"";
Debug.ShouldStop(8);
parent.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Kala_listi");
 BA.debugLineNum = 965;BA.debugLine="FirebaseMessaging.mode=\"GetUpdateFee\"";
Debug.ShouldStop(16);
parent.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = BA.ObjectToString("GetUpdateFee");
 BA.debugLineNum = 967;BA.debugLine="StopService(FusedLocationService)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("StopService",act_kala_listi.processBA,(Object)((parent.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 968;BA.debugLine="StartService(FirebaseMessaging)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("StartService",act_kala_listi.processBA,(Object)((parent.mostCurrent._firebasemessaging.getObject())));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 970;BA.debugLine="Log(\"UpdateFee Offline\")";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","533554441",RemoteObject.createImmutable("UpdateFee Offline"),0);
 BA.debugLineNum = 971;BA.debugLine="UpdateFeeOffline";
Debug.ShouldStop(1024);
_updatefeeoffline();
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 974;BA.debugLine="Sleep(200)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_kala_listi.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kala_listi", "updatefee"),BA.numberCast(int.class, 200));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 977;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _updatefeeoffline() throws Exception{
try {
		Debug.PushSubsStack("UpdateFeeOffline (act_kala_listi) ","act_kala_listi",16,act_kala_listi.mostCurrent.activityBA,act_kala_listi.mostCurrent,979);
if (RapidSub.canDelegate("updatefeeoffline")) { return ir.parsikhesab.pakhsh.act_kala_listi.remoteMe.runUserSub(false, "act_kala_listi","updatefeeoffline");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 979;BA.debugLine="Sub UpdateFeeOffline";
Debug.ShouldStop(262144);
 BA.debugLineNum = 980;BA.debugLine="If IsNumber(MCode.feeCode) And MCode.feeCode>0 Th";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",act_kala_listi.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(act_kala_listi.mostCurrent._mcode._feecode /*RemoteObject*/ ))) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kala_listi.mostCurrent._mcode._feecode /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 981;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(1048576);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 982;BA.debugLine="cu=MCode.Result(\"select * from TblFee where FldC";
Debug.ShouldStop(2097152);
_cu = act_kala_listi.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblFee where FldCodeTasvie="),act_kala_listi.mostCurrent._mcode._feecode /*RemoteObject*/ )));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 983;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 984;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(8388608);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 985;BA.debugLine="cu.Position=i";
Debug.ShouldStop(16777216);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 986;BA.debugLine="Log(\"FldCodeKala:\"& cu.GetString(\"FldCodeKala\"";
Debug.ShouldStop(33554432);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","533619975",RemoteObject.concat(RemoteObject.createImmutable("FldCodeKala:"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))),0);
 BA.debugLineNum = 987;BA.debugLine="Log(\"fldFeeTasvie:\"& cu.GetString(\"FldFee\"))";
Debug.ShouldStop(67108864);
act_kala_listi.mostCurrent.__c.runVoidMethod ("LogImpl","533619976",RemoteObject.concat(RemoteObject.createImmutable("fldFeeTasvie:"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFee")))),0);
 BA.debugLineNum = 988;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set fldFeeTas";
Debug.ShouldStop(134217728);
act_kala_listi.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kala_listi.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblKala Set fldFeeTasvie='"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFee"))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" where fldCodeKala="),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 991;BA.debugLine="LoadKala";
Debug.ShouldStop(1073741824);
_loadkala();
 };
 };
 BA.debugLineNum = 994;BA.debugLine="End Sub";
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