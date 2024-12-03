package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_sabtmarjooii_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,83);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","activity_create", _firsttime);}
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 83;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Activity.LoadLayout(\"L_KalaDefault_2\")";
Debug.ShouldStop(524288);
act_sabtmarjooii.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_KalaDefault_2")),act_sabtmarjooii.mostCurrent.activityBA);
 BA.debugLineNum = 85;BA.debugLine="lstSelectedCodeGroupKala.Initialize";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 86;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(2097152);
act_sabtmarjooii.mostCurrent._hlv.runMethod(false,"Initializer",act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 87;BA.debugLine="pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)";
Debug.ShouldStop(4194304);
act_sabtmarjooii.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_sabtmarjooii.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_sabtmarjooii.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_sabtmarjooii.mostCurrent.activityBA)),(Object)(act_sabtmarjooii.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 88;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(8388608);
act_sabtmarjooii.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 91;BA.debugLine="Dialog.Initialize (Activity)";
Debug.ShouldStop(67108864);
act_sabtmarjooii.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_sabtmarjooii.mostCurrent._activity.getObject()));
 BA.debugLineNum = 92;BA.debugLine="t_search.Initialize(\"t_search\",50)";
Debug.ShouldStop(134217728);
act_sabtmarjooii._t_search.runVoidMethod ("Initialize",act_sabtmarjooii.processBA,(Object)(BA.ObjectToString("t_search")),(Object)(BA.numberCast(long.class, 50)));
 BA.debugLineNum = 93;BA.debugLine="ListGoroohKala.Initialize";
Debug.ShouldStop(268435456);
act_sabtmarjooii.mostCurrent._listgoroohkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 94;BA.debugLine="OriginalListGoroohKala.Initialize";
Debug.ShouldStop(536870912);
act_sabtmarjooii.mostCurrent._originallistgoroohkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 95;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\",True,True)";
Debug.ShouldStop(1073741824);
act_sabtmarjooii.mostCurrent._nicespinner.runVoidMethod ("Initialize",act_sabtmarjooii.mostCurrent.activityBA,(Object)(BA.ObjectToString("NiceSpinner")),(Object)(act_sabtmarjooii.mostCurrent.__c.getField(true,"True")),(Object)(act_sabtmarjooii.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 97;BA.debugLine="Panel2.AddView(NiceSpinner,B4XComboBox1.mBase.Lef";
Debug.ShouldStop(1);
act_sabtmarjooii.mostCurrent._panel2.runVoidMethod ("AddView",(Object)((act_sabtmarjooii.mostCurrent._nicespinner.getObject())),(Object)(act_sabtmarjooii.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_sabtmarjooii.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_sabtmarjooii.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_sabtmarjooii.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 98;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
Debug.ShouldStop(2);
act_sabtmarjooii.mostCurrent._nicespinner.runMethod(true,"setTextColor",act_sabtmarjooii.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 99;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(4);
act_sabtmarjooii.mostCurrent._nicespinner.runMethod(true,"setGravity",act_sabtmarjooii.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 100;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"p";
Debug.ShouldStop(8);
act_sabtmarjooii.mostCurrent._nicespinner.runMethod(false,"setTypeface",act_sabtmarjooii.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 101;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(16);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 102;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
Debug.ShouldStop(32);
_op.runVoidMethod ("Initialize2",(Object)(act_sabtmarjooii.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_sabtmarjooii.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_sabtmarjooii.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_sabtmarjooii.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 103;BA.debugLine="NiceSpinner.Background=op";
Debug.ShouldStop(64);
act_sabtmarjooii.mostCurrent._nicespinner.runMethod(false,"setBackground",(_op.getObject()));
 BA.debugLineNum = 105;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\",True,True)";
Debug.ShouldStop(256);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_sabtmarjooii.mostCurrent.activityBA,(Object)(BA.ObjectToString("NiceSpinner1")),(Object)(act_sabtmarjooii.mostCurrent.__c.getField(true,"True")),(Object)(act_sabtmarjooii.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 107;BA.debugLine="Panel2.AddView(NiceSpinner1,B4XComboBox2.mBase.Le";
Debug.ShouldStop(1024);
act_sabtmarjooii.mostCurrent._panel2.runVoidMethod ("AddView",(Object)((act_sabtmarjooii.mostCurrent._nicespinner1.getObject())),(Object)(act_sabtmarjooii.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_sabtmarjooii.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_sabtmarjooii.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_sabtmarjooii.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 108;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(2048);
act_sabtmarjooii.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_sabtmarjooii.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 109;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(4096);
act_sabtmarjooii.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_sabtmarjooii.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 110;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(\"";
Debug.ShouldStop(8192);
act_sabtmarjooii.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_sabtmarjooii.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 111;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(16384);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 112;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
Debug.ShouldStop(32768);
_op1.runVoidMethod ("Initialize2",(Object)(act_sabtmarjooii.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_sabtmarjooii.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_sabtmarjooii.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_sabtmarjooii.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 113;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(65536);
act_sabtmarjooii.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 114;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(131072);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 116;BA.debugLine="ListGroohKala.Initialize";
Debug.ShouldStop(524288);
act_sabtmarjooii.mostCurrent._listgroohkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 117;BA.debugLine="OrginalListKala.Initialize";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent._orginallistkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 118;BA.debugLine="ListKalaSp.Initialize";
Debug.ShouldStop(2097152);
act_sabtmarjooii.mostCurrent._listkalasp.runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="ListKalaTxt.Initialize";
Debug.ShouldStop(4194304);
act_sabtmarjooii.mostCurrent._listkalatxt.runVoidMethod ("Initialize");
 BA.debugLineNum = 121;BA.debugLine="LoadAcSpGroohKala";
Debug.ShouldStop(16777216);
_loadacspgroohkala();
 BA.debugLineNum = 124;BA.debugLine="HLV.Show";
Debug.ShouldStop(134217728);
act_sabtmarjooii.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 135;BA.debugLine="LoadKala";
Debug.ShouldStop(64);
_loadkala();
 BA.debugLineNum = 138;BA.debugLine="lblTitile.Text=\"ثبت مرجوعی\"";
Debug.ShouldStop(512);
act_sabtmarjooii.mostCurrent._lbltitile.runMethod(true,"setText",BA.ObjectToCharSequence("ثبت مرجوعی"));
 BA.debugLineNum = 139;BA.debugLine="MCode.page=\"SabtMarjooii\"";
Debug.ShouldStop(1024);
act_sabtmarjooii.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("SabtMarjooii");
 BA.debugLineNum = 141;BA.debugLine="pnlTipFee.Visible=False";
Debug.ShouldStop(4096);
act_sabtmarjooii.mostCurrent._pnltipfee.runMethod(true,"setVisible",act_sabtmarjooii.mostCurrent.__c.getField(true,"False"));
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,728);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 728;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 730;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_sabtmarjooii.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 731;BA.debugLine="btn_Back_Click";
Debug.ShouldStop(67108864);
_btn_back_click();
 BA.debugLineNum = 732;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return act_sabtmarjooii.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 734;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return act_sabtmarjooii.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 735;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Pause (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,345);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 345;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Resume (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,340);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","activity_resume");}
 BA.debugLineNum = 340;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
 BA.debugLineNum = 342;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(2097152);
_refreshlblsabad();
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("AddToSabad (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,914);
if (RapidSub.canDelegate("addtosabad")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","addtosabad", _item);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _check = RemoteObject.createImmutable(false);
int _i = 0;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 914;BA.debugLine="Sub AddToSabad(Item As AdapterListKala)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 916;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(524288);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabtmarjooii.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 917;BA.debugLine="Dim Check As Boolean";
Debug.ShouldStop(1048576);
_check = RemoteObject.createImmutable(false);Debug.locals.put("Check", _check);
 BA.debugLineNum = 918;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(2097152);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 919;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(4194304);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 920;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),_item.getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 921;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 922;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
Debug.ShouldStop(33554432);
act_sabtmarjooii.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldCodeKala = '"),_item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 924;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
Debug.ShouldStop(134217728);
act_sabtmarjooii.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadDarSabadJoz = '"),_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadDarSabadKol = '"),_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("' Where FldCodeKala = '"),_item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 927;BA.debugLine="Check = True";
Debug.ShouldStop(1073741824);
_check = act_sabtmarjooii.mostCurrent.__c.getField(true,"True");Debug.locals.put("Check", _check);
 BA.debugLineNum = 928;BA.debugLine="Exit";
Debug.ShouldStop(-2147483648);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 931;BA.debugLine="If Check = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_check,act_sabtmarjooii.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 932;BA.debugLine="MCode.AddToSabad(Item)";
Debug.ShouldStop(8);
act_sabtmarjooii.mostCurrent._mcode.runVoidMethod ("_addtosabad" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(_item));
 };
 BA.debugLineNum = 934;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(32);
_refreshlblsabad();
 BA.debugLineNum = 935;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Application_Error (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,954);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 954;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 956;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return act_sabtmarjooii.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 957;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("btn_Back_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,714);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","btn_back_click");}
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 714;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 716;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(2048);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_sabtmarjooii.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu1", _cu1);Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 717;BA.debugLine="If Cu1.RowCount>0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 718;BA.debugLine="Dim Res As Int = Msgbox2(\"با خارج شدن از این صفح";
Debug.ShouldStop(8192);
_res = act_sabtmarjooii.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("با خارج شدن از این صفحه، سبد خرید شما خالی میشود."),act_sabtmarjooii.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("آیا از این صفحه خارج می شوید؟")))),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((act_sabtmarjooii.mostCurrent.__c.getField(false,"Null"))),act_sabtmarjooii.mostCurrent.activityBA);Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 719;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, act_sabtmarjooii.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 720;BA.debugLine="MCode.SaveUpdate(\"delete from TblSabad\")";
Debug.ShouldStop(32768);
act_sabtmarjooii.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("delete from TblSabad")));
 };
 };
 BA.debugLineNum = 723;BA.debugLine="FeeTip=0";
Debug.ShouldStop(262144);
act_sabtmarjooii.mostCurrent._feetip = BA.NumberToString(0);
 BA.debugLineNum = 724;BA.debugLine="MCode.feeTip=0";
Debug.ShouldStop(524288);
act_sabtmarjooii.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 725;BA.debugLine="MCode.isAmani=0";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent._mcode._isamani /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 726;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
act_sabtmarjooii.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 727;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_edit_price_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("btn_edit_Price_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,828);
if (RapidSub.canDelegate("btn_edit_price_click")) { ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","btn_edit_price_click", _item); return;}
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
public ResumableSub_btn_edit_Price_Click(ir.parsikhesab.pakhsh.act_sabtmarjooii parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_sabtmarjooii parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btn_edit_Price_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,828);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 829;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(268435456);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 830;BA.debugLine="input.Initialize";
Debug.ShouldStop(536870912);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA);
 BA.debugLineNum = 831;BA.debugLine="input.lblTitle.Text = \"قیمت جدید:\"";
Debug.ShouldStop(1073741824);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("قیمت جدید:"));
 BA.debugLineNum = 832;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(-2147483648);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 833;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowTemplate(inpu";
Debug.ShouldStop(1);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 834;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(2);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_sabtmarjooii.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 835;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_sabtmarjooii.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabtmarjooii", "btn_edit_price_click"), _rs);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 836;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 837;BA.debugLine="If input.Text=\"\" Then input.Text=0";
Debug.ShouldStop(16);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_input.getField(true,"_text" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_input.setField ("_text" /*RemoteObject*/ ,BA.NumberToString(0));
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 838;BA.debugLine="Dim Res As Float = input.Text 'no need to check";
Debug.ShouldStop(32);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 839;BA.debugLine="Item.FeeForoosh=Res";
Debug.ShouldStop(64);
_item.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _res));
 BA.debugLineNum = 841;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(256);
parent.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 844;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static RemoteObject  _btnsearch_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSearch_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,768);
if (RapidSub.canDelegate("btnsearch_click")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","btnsearch_click");}
 BA.debugLineNum = 768;BA.debugLine="Sub BtnSearch_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 770;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 780;BA.debugLine="LoadKala";
Debug.ShouldStop(2048);
_loadkala();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabtmarjooii.processBA, e4.toString()); BA.debugLineNum = 782;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","575104270",BA.ObjectToString(act_sabtmarjooii.mostCurrent.__c.runMethod(false,"LastException",act_sabtmarjooii.mostCurrent.activityBA)),0);
 BA.debugLineNum = 783;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(16384);
act_sabtmarjooii.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabtmarjooii.mostCurrent.__c.runMethod(false,"LastException",act_sabtmarjooii.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabtmarjooii.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnSearch_Click"))));
 };
 BA.debugLineNum = 785;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("BtnShowFilterPnl_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,685);
if (RapidSub.canDelegate("btnshowfilterpnl_click")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","btnshowfilterpnl_click");}
 BA.debugLineNum = 685;BA.debugLine="Sub BtnShowFilterPnl_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 686;BA.debugLine="If Panel2.Height = Label11.top Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._panel2.runMethod(true,"getHeight"),BA.numberCast(double.class, act_sabtmarjooii.mostCurrent._label11.runMethod(true,"getTop")))) { 
 BA.debugLineNum = 687;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
Debug.ShouldStop(16384);
act_sabtmarjooii.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_sabtmarjooii.mostCurrent._panel2.runMethod(true,"getLeft")),(Object)(act_sabtmarjooii.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(act_sabtmarjooii.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._lblpoint.runMethod(true,"getTop"),act_sabtmarjooii.mostCurrent._lblpoint.runMethod(true,"getHeight")}, "+",1, 1)));
 BA.debugLineNum = 688;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
Debug.ShouldStop(32768);
act_sabtmarjooii.mostCurrent._pnl_tools.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._panel2.runMethod(true,"getTop"),act_sabtmarjooii.mostCurrent._panel2.runMethod(true,"getHeight"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_sabtmarjooii.mostCurrent.activityBA)}, "++",2, 1)),(Object)(act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getWidth")),(Object)(act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getHeight")));
 BA.debugLineNum = 689;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
Debug.ShouldStop(65536);
act_sabtmarjooii.mostCurrent._pnl_hlv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_sabtmarjooii.mostCurrent._pnl_hlv.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getTop"),act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(act_sabtmarjooii.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._pnl_down.runMethod(true,"getTop"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 13)),act_sabtmarjooii.mostCurrent.activityBA),act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getTop"),act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "--+",3, 1)));
 BA.debugLineNum = 690;BA.debugLine="HLV.Height=pnl_HLV.Height";
Debug.ShouldStop(131072);
act_sabtmarjooii.mostCurrent._hlv.runMethod(true,"setHeight",act_sabtmarjooii.mostCurrent._pnl_hlv.runMethod(true,"getHeight"));
 }else {
 BA.debugLineNum = 692;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
Debug.ShouldStop(524288);
act_sabtmarjooii.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_sabtmarjooii.mostCurrent._panel2.runMethod(true,"getLeft")),(Object)(act_sabtmarjooii.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(act_sabtmarjooii.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(act_sabtmarjooii.mostCurrent._label11.runMethod(true,"getTop")));
 BA.debugLineNum = 693;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent._pnl_tools.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._pnl_top.runMethod(true,"getTop"),act_sabtmarjooii.mostCurrent._pnl_top.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getWidth")),(Object)(act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getHeight")));
 BA.debugLineNum = 694;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
Debug.ShouldStop(2097152);
act_sabtmarjooii.mostCurrent._pnl_hlv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_sabtmarjooii.mostCurrent._pnl_hlv.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getTop"),act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(act_sabtmarjooii.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._pnl_down.runMethod(true,"getTop"),act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getTop"),act_sabtmarjooii.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "-+",2, 1)));
 BA.debugLineNum = 695;BA.debugLine="HLV.Height=pnl_HLV.Height - 13%y";
Debug.ShouldStop(4194304);
act_sabtmarjooii.mostCurrent._hlv.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._pnl_hlv.runMethod(true,"getHeight"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 13)),act_sabtmarjooii.mostCurrent.activityBA)}, "-",1, 1));
 };
 BA.debugLineNum = 697;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnUpdate_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,146);
if (RapidSub.canDelegate("btnupdate_click")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","btnupdate_click");}
 BA.debugLineNum = 146;BA.debugLine="Sub btnUpdate_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(524288);
if (act_sabtmarjooii.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 149;BA.debugLine="StartService(FirebaseMessaging)";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("StartService",act_sabtmarjooii.processBA,(Object)((act_sabtmarjooii.mostCurrent._firebasemessaging.getObject())));
 BA.debugLineNum = 150;BA.debugLine="MCode.page=\"SabtMarjooii\"";
Debug.ShouldStop(2097152);
act_sabtmarjooii.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("SabtMarjooii");
 BA.debugLineNum = 151;BA.debugLine="FirebaseMessaging.mode=\"GetGalleryKala\"";
Debug.ShouldStop(4194304);
act_sabtmarjooii.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = BA.ObjectToString("GetGalleryKala");
 }else {
 BA.debugLineNum = 153;BA.debugLine="LoadKala";
Debug.ShouldStop(16777216);
_loadkala();
 };
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
act_sabtmarjooii.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 13;BA.debugLine="Public NiceSpinner As Hitex_NiceSpinner";
act_sabtmarjooii.mostCurrent._nicespinner = RemoteObject.createNew ("hitex.nice.spinner.Hitex_NiceSpinner");
 //BA.debugLineNum = 14;BA.debugLine="Public NiceSpinner1 As Hitex_NiceSpinner";
act_sabtmarjooii.mostCurrent._nicespinner1 = RemoteObject.createNew ("hitex.nice.spinner.Hitex_NiceSpinner");
 //BA.debugLineNum = 15;BA.debugLine="Dim Key As IME";
act_sabtmarjooii.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 16;BA.debugLine="Dim ListKalaTxt,ListKalaSp,OrginalListKala As Lis";
act_sabtmarjooii.mostCurrent._listkalatxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_sabtmarjooii.mostCurrent._listkalasp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_sabtmarjooii.mostCurrent._orginallistkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 17;BA.debugLine="Dim ListGroohKala As List";
act_sabtmarjooii.mostCurrent._listgroohkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 18;BA.debugLine="Dim FeeTip As String";
act_sabtmarjooii.mostCurrent._feetip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Private Str_sort As String = \" Order by fldNameKa";
act_sabtmarjooii.mostCurrent._str_sort = BA.ObjectToString(" Order by fldNameKala Asc");
 //BA.debugLineNum = 21;BA.debugLine="Dim Barcode As JhsIceZxing1";
act_sabtmarjooii.mostCurrent._barcode = RemoteObject.createNew ("ice.zxing.b4aZXingLib");
 //BA.debugLineNum = 25;BA.debugLine="Private LblBasketCount As Label";
act_sabtmarjooii.mostCurrent._lblbasketcount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LblBasket As Label";
act_sabtmarjooii.mostCurrent._lblbasket = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private BtnShowFilterPnl As ImageView";
act_sabtmarjooii.mostCurrent._btnshowfilterpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private TxtSearch As EditText";
act_sabtmarjooii.mostCurrent._txtsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
act_sabtmarjooii.mostCurrent._b4xcombobox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 30;BA.debugLine="Private B4XComboBox2 As B4XComboBox";
act_sabtmarjooii.mostCurrent._b4xcombobox2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 31;BA.debugLine="Private BtnCommentExit As Button";
act_sabtmarjooii.mostCurrent._btncommentexit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private BtnCommentOK As Button";
act_sabtmarjooii.mostCurrent._btncommentok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private pnlFilter As Panel";
act_sabtmarjooii.mostCurrent._pnlfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private pnl_HLV As Panel";
act_sabtmarjooii.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private NumberSearch As EditText";
act_sabtmarjooii.mostCurrent._numbersearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Pnl_Top As Panel";
act_sabtmarjooii.mostCurrent._pnl_top = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private ImageView1 As ImageView";
act_sabtmarjooii.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btn_Back As Button";
act_sabtmarjooii.mostCurrent._btn_back = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Label4 As Label";
act_sabtmarjooii.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Panel2 As Panel";
act_sabtmarjooii.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Panel3 As Panel";
act_sabtmarjooii.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Label6 As Label";
act_sabtmarjooii.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private BtnSearch As Label";
act_sabtmarjooii.mostCurrent._btnsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private Dialog As B4XDialog";
act_sabtmarjooii.mostCurrent._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 55;BA.debugLine="Private XUI As XUI";
act_sabtmarjooii.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 57;BA.debugLine="Private Img_barcode As ImageView";
act_sabtmarjooii.mostCurrent._img_barcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private Img_Paging As ImageView";
act_sabtmarjooii.mostCurrent._img_paging = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private Img_sort As ImageView";
act_sabtmarjooii.mostCurrent._img_sort = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private Img_TipFee As ImageView";
act_sabtmarjooii.mostCurrent._img_tipfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private Label11 As Label";
act_sabtmarjooii.mostCurrent._label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private Pnl_Tools As Panel";
act_sabtmarjooii.mostCurrent._pnl_tools = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private LblPoint As Label";
act_sabtmarjooii.mostCurrent._lblpoint = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private SwGift As ACSwitch";
act_sabtmarjooii.mostCurrent._swgift = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private SwMojoodi As ACSwitch";
act_sabtmarjooii.mostCurrent._swmojoodi = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private SwPic As ACSwitch";
act_sabtmarjooii.mostCurrent._swpic = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private SwTakhfif As ACSwitch";
act_sabtmarjooii.mostCurrent._swtakhfif = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private Pnl_Down As Panel";
act_sabtmarjooii.mostCurrent._pnl_down = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Dim ListGoroohKala,OriginalListGoroohKala As List";
act_sabtmarjooii.mostCurrent._listgoroohkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_sabtmarjooii.mostCurrent._originallistgoroohkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 71;BA.debugLine="Dim GroupCodeSelect1 As String=\"0\"";
act_sabtmarjooii.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 //BA.debugLineNum = 72;BA.debugLine="Dim GroupNameSelect1 As String=\"\"";
act_sabtmarjooii.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 //BA.debugLineNum = 73;BA.debugLine="Dim GroupCodeSelect2 As String=\"0\"";
act_sabtmarjooii.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 //BA.debugLineNum = 74;BA.debugLine="Dim GroupNameSelect2 As String=\"\"";
act_sabtmarjooii.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 //BA.debugLineNum = 76;BA.debugLine="Dim lstSelectedCodeGroupKala As List";
act_sabtmarjooii.mostCurrent._lstselectedcodegroupkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 77;BA.debugLine="Private CmbBox1 As B4XComboBox";
act_sabtmarjooii.mostCurrent._cmbbox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 78;BA.debugLine="Private lblTitile As Label";
act_sabtmarjooii.mostCurrent._lbltitile = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private pnlTipFee As Panel";
act_sabtmarjooii.mostCurrent._pnltipfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private Img_SelectMoshtari As ImageView";
act_sabtmarjooii.mostCurrent._img_selectmoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,547);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","hlv_getitemcount");}
 BA.debugLineNum = 547;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(4);
 BA.debugLineNum = 548;BA.debugLine="Return ListKalaTxt.Size";
Debug.ShouldStop(8);
if (true) return act_sabtmarjooii.mostCurrent._listkalatxt.runMethod(true,"getSize");
 BA.debugLineNum = 549;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("HLV_onBindViewHolder (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,556);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recdefultkala");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 556;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(2048);
 BA.debugLineNum = 557;BA.debugLine="Dim Item = ListKalaTxt.Get(Position) As AdapterLi";
Debug.ShouldStop(4096);
_item = (act_sabtmarjooii.mostCurrent._listkalatxt.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 558;BA.debugLine="Dim rec As CLs_RecDefultKala=Parent.Tag";
Debug.ShouldStop(8192);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 559;BA.debugLine="rec.Show(Item,Position)";
Debug.ShouldStop(16384);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_show" /*void*/ ,(Object)(_item),(Object)(_position));
 BA.debugLineNum = 560;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(32768);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 561;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,550);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recdefultkala");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 550;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(32);
 BA.debugLineNum = 551;BA.debugLine="Dim rec As CLs_RecDefultKala";
Debug.ShouldStop(64);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recdefultkala");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 552;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(128);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_initialize" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(act_sabtmarjooii.getObject()));
 BA.debugLineNum = 553;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(256);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_sabtmarjooii.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_sabtmarjooii.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 554;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(512);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Img_barcode_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,564);
if (RapidSub.canDelegate("img_barcode_click")) { ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","img_barcode_click"); return;}
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
public ResumableSub_Img_barcode_Click(ir.parsikhesab.pakhsh.act_sabtmarjooii parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_sabtmarjooii parent;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _permission = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Img_barcode_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,564);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 565;BA.debugLine="Dim Result As Boolean = True";
Debug.ShouldStop(1048576);
_result = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 566;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 567;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
Debug.ShouldStop(4194304);
parent._rp.runVoidMethod ("CheckAndRequest",act_sabtmarjooii.processBA,(Object)(parent._rp.getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 568;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_sabtmarjooii.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabtmarjooii", "img_barcode_click"), null);
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
 BA.debugLineNum = 570;BA.debugLine="If Result=False Then";
Debug.ShouldStop(33554432);

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
 BA.debugLineNum = 571;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 573;BA.debugLine="Barcode.BeginScan(\"myzx\")";
Debug.ShouldStop(268435456);
parent.mostCurrent._barcode.runVoidMethod ("BeginScan",act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("myzx")));
 if (true) break;

case 9:
//C
this.state = -1;
;
 BA.debugLineNum = 575;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Img_Paging_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,676);
if (RapidSub.canDelegate("img_paging_click")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","img_paging_click");}
 BA.debugLineNum = 676;BA.debugLine="Private Sub Img_Paging_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 677;BA.debugLine="Act_KalaPaging.listKala=ListKalaTxt";
Debug.ShouldStop(16);
act_sabtmarjooii.mostCurrent._act_kalapaging._listkala /*RemoteObject*/  = act_sabtmarjooii.mostCurrent._listkalatxt;
 BA.debugLineNum = 678;BA.debugLine="StartActivity(Act_KalaPaging)";
Debug.ShouldStop(32);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabtmarjooii.processBA,(Object)((act_sabtmarjooii.mostCurrent._act_kalapaging.getObject())));
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
public static RemoteObject  _img_selectmoshtari_click() throws Exception{
try {
		Debug.PushSubsStack("Img_SelectMoshtari_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,959);
if (RapidSub.canDelegate("img_selectmoshtari_click")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","img_selectmoshtari_click");}
 BA.debugLineNum = 959;BA.debugLine="Private Sub Img_SelectMoshtari_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 960;BA.debugLine="StartActivity(Act_SelectMantage)";
Debug.ShouldStop(-2147483648);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabtmarjooii.processBA,(Object)((act_sabtmarjooii.mostCurrent._act_selectmantage.getObject())));
 BA.debugLineNum = 961;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Img_sort_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,737);
if (RapidSub.canDelegate("img_sort_click")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","img_sort_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 737;BA.debugLine="Sub Img_sort_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 745;BA.debugLine="Dim Lst As List = Array As String(\"کد کالا\",\"نام";
Debug.ShouldStop(256);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_sabtmarjooii.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("کد کالا"),BA.ObjectToString("نام کالا نزولی"),BA.ObjectToString("نام کالا صعودی"),BA.ObjectToString("ارزان ترین قیمت"),BA.ObjectToString("گرانترین قیمت"),BA.ObjectToString("کمترین موجودی"),RemoteObject.createImmutable("بیشترین موجودی")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 746;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
Debug.ShouldStop(512);
_res = act_sabtmarjooii.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("مرتب سازی براساس:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_sabtmarjooii.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 747;BA.debugLine="Select Case res";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6))) {
case 0: {
 BA.debugLineNum = 749;BA.debugLine="Str_sort = \" Order by fldCodeKala Asc\"";
Debug.ShouldStop(4096);
act_sabtmarjooii.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodeKala Asc");
 break; }
case 1: {
 BA.debugLineNum = 751;BA.debugLine="Str_sort = \" Order by fldNameKala\"";
Debug.ShouldStop(16384);
act_sabtmarjooii.mostCurrent._str_sort = BA.ObjectToString(" Order by fldNameKala");
 break; }
case 2: {
 BA.debugLineNum = 753;BA.debugLine="Str_sort = \" Order by fldNameKala Desc\"";
Debug.ShouldStop(65536);
act_sabtmarjooii.mostCurrent._str_sort = BA.ObjectToString(" Order by fldNameKala Desc");
 break; }
case 3: {
 BA.debugLineNum = 755;BA.debugLine="Str_sort = \" Order by fldFeeForoosh\"";
Debug.ShouldStop(262144);
act_sabtmarjooii.mostCurrent._str_sort = BA.ObjectToString(" Order by fldFeeForoosh");
 break; }
case 4: {
 BA.debugLineNum = 757;BA.debugLine="Str_sort = \" Order by fldFeeForoosh Desc\"";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent._str_sort = BA.ObjectToString(" Order by fldFeeForoosh Desc");
 break; }
case 5: {
 BA.debugLineNum = 759;BA.debugLine="Str_sort = \" Order by SumMande\"";
Debug.ShouldStop(4194304);
act_sabtmarjooii.mostCurrent._str_sort = BA.ObjectToString(" Order by SumMande");
 break; }
case 6: {
 BA.debugLineNum = 761;BA.debugLine="Str_sort = \" Order by SumMande Desc\"";
Debug.ShouldStop(16777216);
act_sabtmarjooii.mostCurrent._str_sort = BA.ObjectToString(" Order by SumMande Desc");
 break; }
}
;
 BA.debugLineNum = 763;BA.debugLine="Log(Str_sort)";
Debug.ShouldStop(67108864);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","575038746",act_sabtmarjooii.mostCurrent._str_sort,0);
 BA.debugLineNum = 765;BA.debugLine="LoadKala";
Debug.ShouldStop(268435456);
_loadkala();
 BA.debugLineNum = 766;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Img_TipFee_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,804);
if (RapidSub.canDelegate("img_tipfee_click")) { ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","img_tipfee_click"); return;}
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
public ResumableSub_Img_TipFee_Click(ir.parsikhesab.pakhsh.act_sabtmarjooii parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_sabtmarjooii parent;
RemoteObject _btnshow = RemoteObject.createImmutable(0);
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Img_TipFee_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,804);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 805;BA.debugLine="Dim btnshow As Int=myCode.getSetting(\"setting.dat";
Debug.ShouldStop(16);
_btnshow = BA.numberCast(int.class, parent.mostCurrent._mycode.runMethod(true,"_getsetting" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(BA.ObjectToString("setting.dat")),(Object)(BA.ObjectToString("WSetTip")),(Object)(BA.NumberToString(0))));Debug.locals.put("btnshow", _btnshow);Debug.locals.put("btnshow", _btnshow);
 BA.debugLineNum = 806;BA.debugLine="Log(btnshow)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","575431938",BA.NumberToString(_btnshow),0);
 BA.debugLineNum = 807;BA.debugLine="If btnshow=0 Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_btnshow,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 808;BA.debugLine="ToastMessageShow(\"دسترسی شما به این گزینه محدود";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دسترسی شما به این گزینه محدود است")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 809;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 813;BA.debugLine="Dim Lst As List";
Debug.ShouldStop(4096);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 814;BA.debugLine="Lst.Initialize2(Array As String(\"تیپ1 (بدون احتسا";
Debug.ShouldStop(8192);
_lst.runVoidMethod ("Initialize2",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.ObjectToString("تیپ1 (بدون احتساب تخفیف)"),BA.ObjectToString("تیپ1 (با احتساب تخفیف)"),BA.ObjectToString("تیپ قیمت 3"),BA.ObjectToString("تیپ قیمت 4"),BA.ObjectToString("تیپ قیمت 5"),BA.ObjectToString("تیپ قیمت 6"),BA.ObjectToString("تیپ قیمت 7"),BA.ObjectToString("تیپ قیمت 8"),BA.ObjectToString("تیپ قیمت 9"),RemoteObject.createImmutable("تیپ قیمت 10")})))));
 BA.debugLineNum = 815;BA.debugLine="InputListAsync(Lst,\"تیپ قیمت را انتخاب کنید\",FeeT";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("InputListAsync",(Object)(_lst),(Object)(BA.ObjectToCharSequence("تیپ قیمت را انتخاب کنید")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent.mostCurrent._feetip),RemoteObject.createImmutable(1)}, "-",1, 0))),act_sabtmarjooii.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 816;BA.debugLine="Wait For InputList_Result (Result As Int)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","inputlist_result", act_sabtmarjooii.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabtmarjooii", "img_tipfee_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 817;BA.debugLine="If Result <> -3 Then";
Debug.ShouldStop(65536);
if (true) break;

case 5:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, -(double) (0 + 3)))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 818;BA.debugLine="Dim Res As Int=Msgbox2(\"توجه داشته باشید که با ت";
Debug.ShouldStop(131072);
_res = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟")),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),act_sabtmarjooii.mostCurrent.activityBA);Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 819;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 820;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
Debug.ShouldStop(524288);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Delete From TblSabad")));
 BA.debugLineNum = 821;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(1048576);
_refreshlblsabad();
 BA.debugLineNum = 822;BA.debugLine="FeeTip = Result+1";
Debug.ShouldStop(2097152);
parent.mostCurrent._feetip = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_result,RemoteObject.createImmutable(1)}, "+",1, 1));
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 826;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("LblTedadJoz_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,846);
if (RapidSub.canDelegate("lbltedadjoz_click")) { ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","lbltedadjoz_click", _item); return;}
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
public ResumableSub_LblTedadJoz_Click(ir.parsikhesab.pakhsh.act_sabtmarjooii parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_sabtmarjooii parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblTedadJoz_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,846);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 847;BA.debugLine="Dialog.Title = \"  \"";
Debug.ShouldStop(16384);
parent.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("  ")));
 BA.debugLineNum = 848;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(32768);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 849;BA.debugLine="input.Initialize";
Debug.ShouldStop(65536);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA);
 BA.debugLineNum = 850;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed";
Debug.ShouldStop(131072);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" تعداد "),_item.getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 851;BA.debugLine="Log(MCode.isFloat)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","575563013",BA.ObjectToString(parent.mostCurrent._mcode._isfloat /*RemoteObject*/ ),0);
 BA.debugLineNum = 853;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 855;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(4194304);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 857;BA.debugLine="input.ConfigureForNumbers(False, True)";
Debug.ShouldStop(16777216);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 860;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
Debug.ShouldStop(134217728);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 861;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(268435456);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_sabtmarjooii.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 862;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_sabtmarjooii.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabtmarjooii", "lbltedadjoz_click"), _rs);
this.state = 27;
return;
case 27:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 863;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 864;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(-2147483648);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 865;BA.debugLine="If res>=0 Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 866;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 867;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Teda";
Debug.ShouldStop(4);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 868;BA.debugLine="Item.TedadDarSabadJoz = res";
Debug.ShouldStop(8);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 869;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(16);
_addtosabad(_item);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 871;BA.debugLine="If (Item.SumMande + Item.TedadDarSabadJoz) >=";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 872;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Ted";
Debug.ShouldStop(128);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 873;BA.debugLine="Item.TedadDarSabadJoz = res";
Debug.ShouldStop(256);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 874;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(512);
_addtosabad(_item);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 876;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 882;BA.debugLine="End Sub";
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
public static void  _lbltedadkol_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("LblTedadkol_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,884);
if (RapidSub.canDelegate("lbltedadkol_click")) { ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","lbltedadkol_click", _item); return;}
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
public ResumableSub_LblTedadkol_Click(ir.parsikhesab.pakhsh.act_sabtmarjooii parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_sabtmarjooii parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblTedadkol_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,884);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 885;BA.debugLine="Dialog.Title = \"  \"";
Debug.ShouldStop(1048576);
parent.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("  ")));
 BA.debugLineNum = 886;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(2097152);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 887;BA.debugLine="input.Initialize";
Debug.ShouldStop(4194304);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA);
 BA.debugLineNum = 888;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed2";
Debug.ShouldStop(8388608);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" تعداد "),_item.getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 889;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(16777216);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 891;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
Debug.ShouldStop(67108864);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 892;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(134217728);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_sabtmarjooii.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 893;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_sabtmarjooii.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_sabtmarjooii", "lbltedadkol_click"), _rs);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 894;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 895;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(1073741824);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 896;BA.debugLine="If res>=0 Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 897;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 898;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Ted";
Debug.ShouldStop(2);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 899;BA.debugLine="Item.TedadDarSabadKol = res";
Debug.ShouldStop(4);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 900;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(8);
_addtosabad(_item);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 902;BA.debugLine="If (Item.SumMande + (Item.TedadDarSabadKol*Ite";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 903;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Te";
Debug.ShouldStop(64);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 904;BA.debugLine="Item.TedadDarSabadKol = res";
Debug.ShouldStop(128);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 905;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(256);
_addtosabad(_item);
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 907;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 912;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("LoadAcSpGroohKala (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,349);
if (RapidSub.canDelegate("loadacspgroohkala")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","loadacspgroohkala");}
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 349;BA.debugLine="Sub LoadAcSpGroohKala";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 350;BA.debugLine="Dim Dt As Cursor = MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(536870912);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt = act_sabtmarjooii.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 351;BA.debugLine="NiceSpinner.Add(\"همه گروه ها\")";
Debug.ShouldStop(1073741824);
act_sabtmarjooii.mostCurrent._nicespinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 352;BA.debugLine="For i=0 To Dt.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_dt.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 353;BA.debugLine="Dt.Position=i";
Debug.ShouldStop(1);
_dt.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 354;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(2);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 355;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(4);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 357;BA.debugLine="cu=MCode.Result(\"Select fldCodeKala From TblKala";
Debug.ShouldStop(16);
_cu = act_sabtmarjooii.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select fldCodeKala From TblKala where fldCodeGroup like '"),_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))),RemoteObject.createImmutable("%'"))));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 358;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 359;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(64);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 360;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(128);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 361;BA.debugLine="OriginalListGoroohKala.Add(Item)";
Debug.ShouldStop(256);
act_sabtmarjooii.mostCurrent._originallistgoroohkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 362;BA.debugLine="NiceSpinner.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(512);
act_sabtmarjooii.mostCurrent._nicespinner.runVoidMethod ("Add",(Object)(_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 366;BA.debugLine="NiceSpinner.Show(Colors.blue, 14)";
Debug.ShouldStop(8192);
act_sabtmarjooii.mostCurrent._nicespinner.runVoidMethod ("Show",(Object)(act_sabtmarjooii.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(BA.numberCast(float.class, 14)));
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
public static RemoteObject  _loadkala() throws Exception{
try {
		Debug.PushSubsStack("LoadKala (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,157);
if (RapidSub.canDelegate("loadkala")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","loadkala");}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _countfilter = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.createImmutable(false);
RemoteObject _search = RemoteObject.createImmutable("");
 BA.debugLineNum = 157;BA.debugLine="Sub LoadKala";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 159;BA.debugLine="Dim str As String=\"\"";
Debug.ShouldStop(1073741824);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 160;BA.debugLine="Dim countfilter As Int=0";
Debug.ShouldStop(-2147483648);
_countfilter = BA.numberCast(int.class, 0);Debug.locals.put("countfilter", _countfilter);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 161;BA.debugLine="Dim filter As Boolean=False";
Debug.ShouldStop(1);
_filter = act_sabtmarjooii.mostCurrent.__c.getField(true,"False");Debug.locals.put("filter", _filter);Debug.locals.put("filter", _filter);
 BA.debugLineNum = 162;BA.debugLine="Log(GroupCodeSelect1)";
Debug.ShouldStop(2);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","573662469",act_sabtmarjooii.mostCurrent._groupcodeselect1,0);
 BA.debugLineNum = 163;BA.debugLine="Log(GroupCodeSelect2)";
Debug.ShouldStop(4);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","573662470",act_sabtmarjooii.mostCurrent._groupcodeselect2,0);
 BA.debugLineNum = 164;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 165;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>\"";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 166;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersia";
Debug.ShouldStop(32);
_search = act_sabtmarjooii.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 167;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
 BA.debugLineNum = 168;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(128);
_search = act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 };
 BA.debugLineNum = 170;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(512);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 171;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(1024);
if (act_sabtmarjooii.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 172;BA.debugLine="If Search.Length>5 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_search.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 173;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
Debug.ShouldStop(4096);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSerial = '"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("') "))));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 175;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sear";
Debug.ShouldStop(16384);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodeKala like '%"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 }else {
 BA.debugLineNum = 179;BA.debugLine="str = str & $\" and (fldNameKala like '%${Searc";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldNameKala like '%"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 181;BA.debugLine="filter=True";
Debug.ShouldStop(1048576);
_filter = act_sabtmarjooii.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 182;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 183;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(4194304);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 187;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swgift.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 188;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(134217728);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 189;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
Debug.ShouldStop(268435456);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"));Debug.locals.put("str", _str);
 BA.debugLineNum = 190;BA.debugLine="filter=True";
Debug.ShouldStop(536870912);
_filter = act_sabtmarjooii.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 191;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 192;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(-2147483648);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 195;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 196;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(8);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 197;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 198;BA.debugLine="filter=True";
Debug.ShouldStop(32);
_filter = act_sabtmarjooii.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 199;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 200;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(128);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 203;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 204;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2048);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 205;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(4096);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 206;BA.debugLine="filter=True";
Debug.ShouldStop(8192);
_filter = act_sabtmarjooii.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 207;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 208;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(32768);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 211;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swpic.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 212;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(524288);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 213;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 214;BA.debugLine="filter=True";
Debug.ShouldStop(2097152);
_filter = act_sabtmarjooii.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 215;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 216;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8388608);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 219;BA.debugLine="If filter=True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_filter,act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 222;BA.debugLine="str=\"select * from TblKala where \"&str&\" \"&Str_";
Debug.ShouldStop(536870912);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where "),_str,RemoteObject.createImmutable(" "),act_sabtmarjooii.mostCurrent._str_sort);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 224;BA.debugLine="str=\"select * from TblKala  \"&Str_sort";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala  "),act_sabtmarjooii.mostCurrent._str_sort);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 226;BA.debugLine="Log(str)";
Debug.ShouldStop(2);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","573662533",_str,0);
 };
 BA.debugLineNum = 229;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 The";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",act_sabtmarjooii.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 230;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>\"";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 231;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersia";
Debug.ShouldStop(64);
_search = act_sabtmarjooii.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 232;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
 BA.debugLineNum = 233;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(256);
_search = act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 };
 BA.debugLineNum = 235;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1024);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 236;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(2048);
if (act_sabtmarjooii.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 237;BA.debugLine="If Search.Length>5 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_search.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 238;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
Debug.ShouldStop(8192);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSerial = '"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("') "))));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 240;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sear";
Debug.ShouldStop(32768);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodeKala like '%"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 }else {
 BA.debugLineNum = 244;BA.debugLine="str = str & $\" and (fldNameKala like '%${Searc";
Debug.ShouldStop(524288);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldNameKala like '%"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 246;BA.debugLine="filter=True";
Debug.ShouldStop(2097152);
_filter = act_sabtmarjooii.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 247;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 248;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8388608);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 252;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swgift.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 253;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(268435456);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 254;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
Debug.ShouldStop(536870912);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 257;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 258;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 259;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 263;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 264;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(128);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 265;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(256);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 268;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swpic.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 269;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(4096);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 270;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(8192);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 274;BA.debugLine="str=\"select * from TblKala where fldCodeGroup li";
Debug.ShouldStop(131072);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_sabtmarjooii.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' "),_str,RemoteObject.createImmutable(" "),act_sabtmarjooii.mostCurrent._str_sort);Debug.locals.put("str", _str);
 BA.debugLineNum = 275;BA.debugLine="Log(str)";
Debug.ShouldStop(262144);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","573662582",_str,0);
 };
 BA.debugLineNum = 278;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 Th";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",act_sabtmarjooii.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("!",act_sabtmarjooii.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 279;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>\"";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 280;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersia";
Debug.ShouldStop(8388608);
_search = act_sabtmarjooii.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 281;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
 BA.debugLineNum = 282;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(33554432);
_search = act_sabtmarjooii.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 };
 BA.debugLineNum = 284;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(134217728);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 285;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(268435456);
if (act_sabtmarjooii.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 286;BA.debugLine="If Search.Length>5 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_search.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 287;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
Debug.ShouldStop(1073741824);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSerial = '"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("') "))));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 289;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sear";
Debug.ShouldStop(1);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodeKala like '%"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 }else {
 BA.debugLineNum = 293;BA.debugLine="str = str & $\" and (fldNameKala like '%${Searc";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldNameKala like '%"),act_sabtmarjooii.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 295;BA.debugLine="filter=True";
Debug.ShouldStop(64);
_filter = act_sabtmarjooii.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 296;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 297;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(256);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 301;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swgift.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 302;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(8192);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 303;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
Debug.ShouldStop(16384);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 306;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 307;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(262144);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 308;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
Debug.ShouldStop(524288);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 312;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 313;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16777216);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 314;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(33554432);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 317;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._mcode._namayeshkalasefr /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 318;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(536870912);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 319;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(1073741824);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 320;BA.debugLine="filter=True";
Debug.ShouldStop(-2147483648);
_filter = act_sabtmarjooii.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 321;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 322;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(2);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 325;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",act_sabtmarjooii.mostCurrent._swpic.runMethod(true,"getChecked"),act_sabtmarjooii.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 326;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(32);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 327;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 331;BA.debugLine="str=\"select * from TblKala where fldCodeGroup li";
Debug.ShouldStop(1024);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_sabtmarjooii.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' "),_str,RemoteObject.createImmutable(" "),act_sabtmarjooii.mostCurrent._str_sort);Debug.locals.put("str", _str);
 BA.debugLineNum = 332;BA.debugLine="Log(str)";
Debug.ShouldStop(2048);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","573662639",_str,0);
 };
 BA.debugLineNum = 335;BA.debugLine="LoadListKala(str)";
Debug.ShouldStop(16384);
_loadlistkala(_str);
 BA.debugLineNum = 337;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(65536);
_refreshlblsabad();
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadlistkala(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("LoadListKala (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,373);
if (RapidSub.canDelegate("loadlistkala")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","loadlistkala", _query);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _itemkala = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _fldfeeforoosh = RemoteObject.createImmutable(0);
RemoteObject _fldtedaddarkarton = RemoteObject.createImmutable(0);
RemoteObject _summande = RemoteObject.createImmutable(0);
Debug.locals.put("Query", _query);
 BA.debugLineNum = 373;BA.debugLine="Sub LoadListKala(Query As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 374;BA.debugLine="OrginalListKala.Clear";
Debug.ShouldStop(2097152);
act_sabtmarjooii.mostCurrent._orginallistkala.runVoidMethod ("Clear");
 BA.debugLineNum = 375;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
Debug.ShouldStop(4194304);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabtmarjooii.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(_query));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 376;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 377;BA.debugLine="ProgressDialogShow(\"لطفا منتظر بمانید\")";
Debug.ShouldStop(16777216);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_sabtmarjooii.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("لطفا منتظر بمانید"))));
 BA.debugLineNum = 378;BA.debugLine="For i = 0 To Cu.RowCount - 1";
Debug.ShouldStop(33554432);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 379;BA.debugLine="Dim ItemKala As AdapterListKala";
Debug.ShouldStop(67108864);
_itemkala = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");Debug.locals.put("ItemKala", _itemkala);
 BA.debugLineNum = 380;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(134217728);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 381;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
Debug.ShouldStop(268435456);
_itemkala.setField ("CodeKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeKala"))));
 BA.debugLineNum = 382;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
Debug.ShouldStop(536870912);
_itemkala.setField ("NameKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameKala"))));
 BA.debugLineNum = 383;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\")";
Debug.ShouldStop(1073741824);
_itemkala.setField ("NameVahed" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed"))));
 BA.debugLineNum = 384;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed2";
Debug.ShouldStop(-2147483648);
_itemkala.setField ("NameVahed2" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))));
 BA.debugLineNum = 385;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
Debug.ShouldStop(1);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));
 BA.debugLineNum = 386;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select * from T";
Debug.ShouldStop(2);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_sabtmarjooii.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblSabad where FldCodeKala="),_itemkala.getField(true,"CodeKala" /*RemoteObject*/ ))));Debug.locals.put("cu1", _cu1);Debug.locals.put("cu1", _cu1);
 BA.debugLineNum = 388;BA.debugLine="If cu1.RowCount>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 389;BA.debugLine="cu1.Position=0";
Debug.ShouldStop(16);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 390;BA.debugLine="ItemKala.TedadDarSabadJoz =cu1.Getstring(\"FldT";
Debug.ShouldStop(32);
_itemkala.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))));
 BA.debugLineNum = 391;BA.debugLine="ItemKala.TedadDarSabadKol =cu1.Getstring(\"FldT";
Debug.ShouldStop(64);
_itemkala.setField ("TedadDarSabadKol" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))));
 BA.debugLineNum = 392;BA.debugLine="ItemKala.FldEshantion=cu1.Getstring(\"FldEshant";
Debug.ShouldStop(128);
_itemkala.setField ("FldEshantion" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion"))));
 };
 BA.debugLineNum = 395;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTedad";
Debug.ShouldStop(1024);
_itemkala.setField ("TedadDarKarton" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))));
 BA.debugLineNum = 396;BA.debugLine="ItemKala.FeeForoosh=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(2048);
_itemkala.setField ("FeeForoosh" /*RemoteObject*/ ,_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));
 BA.debugLineNum = 397;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString(\"";
Debug.ShouldStop(4096);
_itemkala.setField ("FldMablaghMasrafKonande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldGhymatMasrafkonande"))));
 BA.debugLineNum = 400;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null The";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))))) { 
 BA.debugLineNum = 401;BA.debugLine="Log(Cu.GetString(\"fldFeeBadAzTakhfif\"))";
Debug.ShouldStop(65536);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","573924636",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))),0);
 BA.debugLineNum = 402;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fldF";
Debug.ShouldStop(131072);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 }else {
 BA.debugLineNum = 404;BA.debugLine="Log(Cu.GetString(\"fldFeeBadAzTakhfif\"))";
Debug.ShouldStop(524288);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","573924639",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))),0);
 BA.debugLineNum = 405;BA.debugLine="Log(\"0\")";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","573924640",RemoteObject.createImmutable("0"),0);
 BA.debugLineNum = 406;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(2097152);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 };
 BA.debugLineNum = 408;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
Debug.ShouldStop(8388608);
_itemkala.setField ("fldPathPic" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))));
 BA.debugLineNum = 409;BA.debugLine="ItemKala.FldEshantion=0";
Debug.ShouldStop(16777216);
_itemkala.setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 411;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 412;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Get";
Debug.ShouldStop(134217728);
_fldfeeforoosh = BA.numberCast(int.class, act_sabtmarjooii.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 413;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu";
Debug.ShouldStop(268435456);
_fldtedaddarkarton = BA.numberCast(int.class, act_sabtmarjooii.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 414;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\")";
Debug.ShouldStop(536870912);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 415;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * FldT";
Debug.ShouldStop(1073741824);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 416;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fld";
Debug.ShouldStop(-2147483648);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(act_sabtmarjooii.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0)))));
 };
 BA.debugLineNum = 418;BA.debugLine="OrginalListKala.Add(ItemKala)";
Debug.ShouldStop(2);
act_sabtmarjooii.mostCurrent._orginallistkala.runVoidMethod ("Add",(Object)((_itemkala)));
 BA.debugLineNum = 419;BA.debugLine="cu1.Close";
Debug.ShouldStop(4);
_cu1.runVoidMethod ("Close");
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 421;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 BA.debugLineNum = 425;BA.debugLine="ListKalaSp=OrginalListKala";
Debug.ShouldStop(256);
act_sabtmarjooii.mostCurrent._listkalasp = act_sabtmarjooii.mostCurrent._orginallistkala;
 BA.debugLineNum = 426;BA.debugLine="ListKalaTxt=ListKalaSp";
Debug.ShouldStop(512);
act_sabtmarjooii.mostCurrent._listkalatxt = act_sabtmarjooii.mostCurrent._listkalasp;
 BA.debugLineNum = 429;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(4096);
act_sabtmarjooii.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 430;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("myzx_result (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,577);
if (RapidSub.canDelegate("myzx_result")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","myzx_result", _atype, _values);}
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 577;BA.debugLine="Sub myzx_result(atype As String,Values As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 578;BA.debugLine="LogColor(\"type:\"&atype&\"values:\"&Values,Colors.re";
Debug.ShouldStop(2);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","574448897",RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("values:"),_values),act_sabtmarjooii.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 581;BA.debugLine="TxtSearch.Text=Values";
Debug.ShouldStop(16);
act_sabtmarjooii.mostCurrent._txtsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_values));
 BA.debugLineNum = 582;BA.debugLine="BtnSearch.Tag=True";
Debug.ShouldStop(32);
act_sabtmarjooii.mostCurrent._btnsearch.runMethod(false,"setTag",(act_sabtmarjooii.mostCurrent.__c.getField(true,"True")));
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
public static RemoteObject  _nicespinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner_ItemClick (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,444);
if (RapidSub.canDelegate("nicespinner_itemclick")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","nicespinner_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 444;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 446;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(536870912);
act_sabtmarjooii.mostCurrent._key.runVoidMethod ("HideKeyboard",act_sabtmarjooii.mostCurrent.activityBA);
 BA.debugLineNum = 449;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 450;BA.debugLine="ListGroohKala.Clear";
Debug.ShouldStop(2);
act_sabtmarjooii.mostCurrent._listgroohkala.runVoidMethod ("Clear");
 BA.debugLineNum = 451;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(4);
act_sabtmarjooii.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 452;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(8);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 453;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(16);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 455;BA.debugLine="GroupCodeSelect1=\"0\"";
Debug.ShouldStop(64);
act_sabtmarjooii.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 BA.debugLineNum = 456;BA.debugLine="GroupNameSelect1=\"\"";
Debug.ShouldStop(128);
act_sabtmarjooii.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 BA.debugLineNum = 457;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(256);
act_sabtmarjooii.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 458;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(512);
act_sabtmarjooii.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 459;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(1024);
act_sabtmarjooii.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 462;BA.debugLine="Dim lst As List=OriginalListGoroohKala";
Debug.ShouldStop(8192);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_sabtmarjooii.mostCurrent._originallistgoroohkala;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 463;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
Debug.ShouldStop(16384);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 464;BA.debugLine="Log(Item.FldN_Gorooh)";
Debug.ShouldStop(32768);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","574055700",_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 465;BA.debugLine="Log(Item.FldC_Gorooh)";
Debug.ShouldStop(65536);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","574055701",_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 466;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(131072);
act_sabtmarjooii.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 467;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
Debug.ShouldStop(262144);
act_sabtmarjooii.mostCurrent._groupnameselect1 = _item.getField(true,"FldN_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 468;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(524288);
act_sabtmarjooii.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 469;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 470;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(2097152);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 472;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(8388608);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 473;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
Debug.ShouldStop(16777216);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabtmarjooii.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 474;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 475;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(67108864);
act_sabtmarjooii.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 476;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(134217728);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 477;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(268435456);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 478;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(536870912);
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 479;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(1073741824);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 480;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(-2147483648);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 481;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(1);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 482;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(2);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 483;BA.debugLine="ListGroohKala.Add(Item)";
Debug.ShouldStop(4);
act_sabtmarjooii.mostCurrent._listgroohkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 484;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(8);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 486;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
Debug.ShouldStop(32);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Show",(Object)(act_sabtmarjooii.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 487;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(64);
act_sabtmarjooii.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 488;BA.debugLine="lstSelectedCodeGroupKala.Add(GroupCodeSelect1)";
Debug.ShouldStop(128);
act_sabtmarjooii.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Add",(Object)((act_sabtmarjooii.mostCurrent._groupcodeselect1)));
 }else {
 BA.debugLineNum = 490;BA.debugLine="ListGroohKala.Clear";
Debug.ShouldStop(512);
act_sabtmarjooii.mostCurrent._listgroohkala.runVoidMethod ("Clear");
 BA.debugLineNum = 491;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(1024);
act_sabtmarjooii.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 492;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(2048);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 493;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(4096);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 494;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(8192);
act_sabtmarjooii.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 495;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(16384);
act_sabtmarjooii.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 496;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(32768);
act_sabtmarjooii.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 500;BA.debugLine="LoadKala";
Debug.ShouldStop(524288);
_loadkala();
 BA.debugLineNum = 501;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","574055737",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_sabtmarjooii.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 502;BA.debugLine="Log(\"postion1: \"&Position)";
Debug.ShouldStop(2097152);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","574055738",RemoteObject.concat(RemoteObject.createImmutable("postion1: "),_position),0);
 BA.debugLineNum = 504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("NiceSpinner1_ItemClick (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,506);
if (RapidSub.canDelegate("nicespinner1_itemclick")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","nicespinner1_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 506;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 507;BA.debugLine="If Position=0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 509;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupKala.Get(ls";
Debug.ShouldStop(268435456);
act_sabtmarjooii.mostCurrent._groupcodeselect2 = BA.ObjectToString(act_sabtmarjooii.mostCurrent._lstselectedcodegroupkala.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._lstselectedcodegroupkala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 }else {
 BA.debugLineNum = 511;BA.debugLine="Dim lst As List=ListGroohKala";
Debug.ShouldStop(1073741824);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_sabtmarjooii.mostCurrent._listgroohkala;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 512;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
Debug.ShouldStop(-2147483648);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_sabtmarjooii.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 513;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
Debug.ShouldStop(1);
act_sabtmarjooii.mostCurrent._groupcodeselect2 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 515;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(4);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 517;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(16);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 518;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
Debug.ShouldStop(32);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabtmarjooii.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 519;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 520;BA.debugLine="ListGroohKala.Clear";
Debug.ShouldStop(128);
act_sabtmarjooii.mostCurrent._listgroohkala.runVoidMethod ("Clear");
 BA.debugLineNum = 521;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(256);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 524;BA.debugLine="lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)";
Debug.ShouldStop(2048);
act_sabtmarjooii.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Add",(Object)((_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 527;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(16384);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 529;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(65536);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 530;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(131072);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 531;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(262144);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 532;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(524288);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 533;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(1048576);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 534;BA.debugLine="ListGroohKala.Add(Item)";
Debug.ShouldStop(2097152);
act_sabtmarjooii.mostCurrent._listgroohkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 535;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(4194304);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 538;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
Debug.ShouldStop(33554432);
act_sabtmarjooii.mostCurrent._nicespinner1.runVoidMethod ("Show",(Object)(act_sabtmarjooii.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 539;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(67108864);
act_sabtmarjooii.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 542;BA.debugLine="LoadKala";
Debug.ShouldStop(536870912);
_loadkala();
 BA.debugLineNum = 543;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(1073741824);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","574121253",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_sabtmarjooii.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 544;BA.debugLine="Log(\"position2: \"&Position)";
Debug.ShouldStop(-2147483648);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("LogImpl","574121254",RemoteObject.concat(RemoteObject.createImmutable("position2: "),_position),0);
 BA.debugLineNum = 545;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("NumberSearch_TextChanged (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,650);
if (RapidSub.canDelegate("numbersearch_textchanged")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","numbersearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 650;BA.debugLine="Sub NumberSearch_TextChanged (Old As String, New A";
Debug.ShouldStop(512);
 BA.debugLineNum = 651;BA.debugLine="LoadKala";
Debug.ShouldStop(1024);
_loadkala();
 BA.debugLineNum = 652;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Pnl_Down_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,946);
if (RapidSub.canDelegate("pnl_down_click")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","pnl_down_click");}
 BA.debugLineNum = 946;BA.debugLine="Sub Pnl_Down_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 947;BA.debugLine="If LblBasketCount.Visible Then";
Debug.ShouldStop(262144);
if (act_sabtmarjooii.mostCurrent._lblbasketcount.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 948;BA.debugLine="StartActivity(Act_Sabad)";
Debug.ShouldStop(524288);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("StartActivity",act_sabtmarjooii.processBA,(Object)((act_sabtmarjooii.mostCurrent._act_sabad.getObject())));
 BA.debugLineNum = 949;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 951;BA.debugLine="ToastMessageShow(\"سبد خرید خالی است\",False)";
Debug.ShouldStop(4194304);
act_sabtmarjooii.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سبد خرید خالی است")),(Object)(act_sabtmarjooii.mostCurrent.__c.getField(true,"False")));
 };
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
public static RemoteObject  _pnltedad_click() throws Exception{
try {
		Debug.PushSubsStack("PnlTedad_Click (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,662);
if (RapidSub.canDelegate("pnltedad_click")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","pnltedad_click");}
 BA.debugLineNum = 662;BA.debugLine="Sub PnlTedad_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 664;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
act_sabtmarjooii._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 8;BA.debugLine="Dim t_search As Timer";
act_sabtmarjooii._t_search = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refreshlblsabad() throws Exception{
try {
		Debug.PushSubsStack("RefreshLblSabad (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,433);
if (RapidSub.canDelegate("refreshlblsabad")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","refreshlblsabad");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 433;BA.debugLine="Sub RefreshLblSabad";
Debug.ShouldStop(65536);
 BA.debugLineNum = 434;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(131072);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabtmarjooii.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtmarjooii.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 435;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 436;BA.debugLine="LblBasketCount.Visible=True";
Debug.ShouldStop(524288);
act_sabtmarjooii.mostCurrent._lblbasketcount.runMethod(true,"setVisible",act_sabtmarjooii.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 437;BA.debugLine="LblBasketCount.Text=Cu.RowCount";
Debug.ShouldStop(1048576);
act_sabtmarjooii.mostCurrent._lblbasketcount.runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"getRowCount")));
 }else {
 BA.debugLineNum = 439;BA.debugLine="LblBasketCount.Visible=False";
Debug.ShouldStop(4194304);
act_sabtmarjooii.mostCurrent._lblbasketcount.runMethod(true,"setVisible",act_sabtmarjooii.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 441;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(16777216);
act_sabtmarjooii.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("SwGift_CheckedChange (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,787);
if (RapidSub.canDelegate("swgift_checkedchange")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","swgift_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 787;BA.debugLine="Sub SwGift_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 788;BA.debugLine="LoadKala";
Debug.ShouldStop(524288);
_loadkala();
 BA.debugLineNum = 789;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("SwMojoodi_CheckedChange (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,795);
if (RapidSub.canDelegate("swmojoodi_checkedchange")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","swmojoodi_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 795;BA.debugLine="Sub SwMojoodi_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 796;BA.debugLine="LoadKala";
Debug.ShouldStop(134217728);
_loadkala();
 BA.debugLineNum = 797;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("SwPic_CheckedChange (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,799);
if (RapidSub.canDelegate("swpic_checkedchange")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","swpic_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 799;BA.debugLine="Sub SwPic_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 801;BA.debugLine="LoadKala";
Debug.ShouldStop(1);
_loadkala();
 BA.debugLineNum = 802;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("SwTakhfif_CheckedChange (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,791);
if (RapidSub.canDelegate("swtakhfif_checkedchange")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","swtakhfif_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 791;BA.debugLine="Sub SwTakhfif_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 792;BA.debugLine="LoadKala";
Debug.ShouldStop(8388608);
_loadkala();
 BA.debugLineNum = 793;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_search_tick() throws Exception{
try {
		Debug.PushSubsStack("t_search_Tick (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,671);
if (RapidSub.canDelegate("t_search_tick")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","t_search_tick");}
 BA.debugLineNum = 671;BA.debugLine="Private Sub t_search_Tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 672;BA.debugLine="t_search.Enabled=False";
Debug.ShouldStop(-2147483648);
act_sabtmarjooii._t_search.runMethod(true,"setEnabled",act_sabtmarjooii.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 673;BA.debugLine="BtnSearch_Click";
Debug.ShouldStop(1);
_btnsearch_click();
 BA.debugLineNum = 674;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("TxtSearch_TextChanged (act_sabtmarjooii) ","act_sabtmarjooii",41,act_sabtmarjooii.mostCurrent.activityBA,act_sabtmarjooii.mostCurrent,666);
if (RapidSub.canDelegate("txtsearch_textchanged")) { return ir.parsikhesab.pakhsh.act_sabtmarjooii.remoteMe.runUserSub(false, "act_sabtmarjooii","txtsearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 666;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 668;BA.debugLine="t_search.Enabled=True";
Debug.ShouldStop(134217728);
act_sabtmarjooii._t_search.runMethod(true,"setEnabled",act_sabtmarjooii.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 669;BA.debugLine="End Sub";
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