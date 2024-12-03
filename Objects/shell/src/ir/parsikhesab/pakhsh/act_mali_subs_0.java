package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_mali_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,110);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","activity_create", _firsttime);}
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 110;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Activity.LoadLayout(\"L_Mali\")";
Debug.ShouldStop(16384);
act_mali.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Mali")),act_mali.mostCurrent.activityBA);
 BA.debugLineNum = 112;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 114;BA.debugLine="Tab1.AddTab(\"نقدی\",\"l_Daryaftnaghdi\")";
Debug.ShouldStop(131072);
act_mali.mostCurrent._tab1.runVoidMethodAndSync ("AddTab",act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString("نقدی")),(Object)(RemoteObject.createImmutable("l_Daryaftnaghdi")));
 BA.debugLineNum = 115;BA.debugLine="Tab1.AddTab(\"بانکی\",\"l_Daryaftbanki\")";
Debug.ShouldStop(262144);
act_mali.mostCurrent._tab1.runVoidMethodAndSync ("AddTab",act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString("بانکی")),(Object)(RemoteObject.createImmutable("l_Daryaftbanki")));
 BA.debugLineNum = 116;BA.debugLine="Tab1.AddTab(\"چکی\",\"l_Daryaftchecki\")";
Debug.ShouldStop(524288);
act_mali.mostCurrent._tab1.runVoidMethodAndSync ("AddTab",act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString("چکی")),(Object)(RemoteObject.createImmutable("l_Daryaftchecki")));
 BA.debugLineNum = 117;BA.debugLine="Tab1.AddTab(\"تخفیف\",\"l_DaryaftTakhfif\")";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._tab1.runVoidMethodAndSync ("AddTab",act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString("تخفیف")),(Object)(RemoteObject.createImmutable("l_DaryaftTakhfif")));
 BA.debugLineNum = 119;BA.debugLine="Btn_SendInfo.Enabled=False";
Debug.ShouldStop(4194304);
act_mali.mostCurrent._btn_sendinfo.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 120;BA.debugLine="NSN_BankD.Initialize(\"NSN_BankD\",True,False)";
Debug.ShouldStop(8388608);
act_mali.mostCurrent._nsn_bankd.runVoidMethod ("Initialize",act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString("NSN_BankD")),(Object)(act_mali.mostCurrent.__c.getField(true,"True")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 121;BA.debugLine="PnlNBank.AddView(NSN_BankD,0,0,PnlNBank.Width,Pn";
Debug.ShouldStop(16777216);
act_mali.mostCurrent._pnlnbank.runVoidMethod ("AddView",(Object)((act_mali.mostCurrent._nsn_bankd.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent._pnlnbank.runMethod(true,"getWidth")),(Object)(act_mali.mostCurrent._pnlnbank.runMethod(true,"getHeight")));
 BA.debugLineNum = 122;BA.debugLine="NSN_BankD.TextColor = Colors.RGB(192,53,38)";
Debug.ShouldStop(33554432);
act_mali.mostCurrent._nsn_bankd.runMethod(true,"setTextColor",act_mali.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 192)),(Object)(BA.numberCast(int.class, 53)),(Object)(BA.numberCast(int.class, 38))));
 BA.debugLineNum = 123;BA.debugLine="NSN_BankD.Gravity = Gravity.CENTER";
Debug.ShouldStop(67108864);
act_mali.mostCurrent._nsn_bankd.runMethod(true,"setGravity",act_mali.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 124;BA.debugLine="NSN_BankD.Typeface = Typeface.LoadFromAssets(\"p_";
Debug.ShouldStop(134217728);
act_mali.mostCurrent._nsn_bankd.runMethod(false,"setTypeface",act_mali.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 125;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(268435456);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 126;BA.debugLine="op.Initialize2(Colors.White,5dip,0dip,Colors.Bla";
Debug.ShouldStop(536870912);
_op.runVoidMethod ("Initialize2",(Object)(act_mali.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_mali.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(act_mali.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(act_mali.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 127;BA.debugLine="NSN_BankD.Background=op";
Debug.ShouldStop(1073741824);
act_mali.mostCurrent._nsn_bankd.runMethod(false,"setBackground",(_op.getObject()));
 BA.debugLineNum = 129;BA.debugLine="NSN_SandooghD.Initialize(\"NSN_SandooghD\",True,Fa";
Debug.ShouldStop(1);
act_mali.mostCurrent._nsn_sandooghd.runVoidMethod ("Initialize",act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString("NSN_SandooghD")),(Object)(act_mali.mostCurrent.__c.getField(true,"True")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 130;BA.debugLine="pnlNSandoogh.AddView(NSN_SandooghD,0,0,pnlNSando";
Debug.ShouldStop(2);
act_mali.mostCurrent._pnlnsandoogh.runVoidMethod ("AddView",(Object)((act_mali.mostCurrent._nsn_sandooghd.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent._pnlnsandoogh.runMethod(true,"getWidth")),(Object)(act_mali.mostCurrent._pnlnsandoogh.runMethod(true,"getHeight")));
 BA.debugLineNum = 131;BA.debugLine="NSN_SandooghD.TextColor = Colors.RGB(192,53,38)";
Debug.ShouldStop(4);
act_mali.mostCurrent._nsn_sandooghd.runMethod(true,"setTextColor",act_mali.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 192)),(Object)(BA.numberCast(int.class, 53)),(Object)(BA.numberCast(int.class, 38))));
 BA.debugLineNum = 132;BA.debugLine="NSN_SandooghD.Gravity = Gravity.CENTER";
Debug.ShouldStop(8);
act_mali.mostCurrent._nsn_sandooghd.runMethod(true,"setGravity",act_mali.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 133;BA.debugLine="NSN_SandooghD.Typeface = Typeface.LoadFromAssets";
Debug.ShouldStop(16);
act_mali.mostCurrent._nsn_sandooghd.runMethod(false,"setTypeface",act_mali.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 134;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(32);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 135;BA.debugLine="op.Initialize2(Colors.White,5dip,0dip,Colors.Bla";
Debug.ShouldStop(64);
_op.runVoidMethod ("Initialize2",(Object)(act_mali.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_mali.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(act_mali.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(act_mali.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 136;BA.debugLine="NSN_SandooghD.Background=op";
Debug.ShouldStop(128);
act_mali.mostCurrent._nsn_sandooghd.runMethod(false,"setBackground",(_op.getObject()));
 BA.debugLineNum = 138;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(512);
act_mali.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 139;BA.debugLine="Key.SetCustomFilter(TxtMablaghNaghdi,TxtMablaghN";
Debug.ShouldStop(1024);
act_mali.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_mali.mostCurrent._txtmablaghnaghdi.getObject())),(Object)(act_mali.mostCurrent._txtmablaghnaghdi.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 140;BA.debugLine="Key.SetCustomFilter(TxtMablaghBanki,TxtMablaghBa";
Debug.ShouldStop(2048);
act_mali.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_mali.mostCurrent._txtmablaghbanki.getObject())),(Object)(act_mali.mostCurrent._txtmablaghbanki.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 141;BA.debugLine="Key.SetCustomFilter(TxtMablaghChecki,TxtMablaghC";
Debug.ShouldStop(4096);
act_mali.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_mali.mostCurrent._txtmablaghchecki.getObject())),(Object)(act_mali.mostCurrent._txtmablaghchecki.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 142;BA.debugLine="Key.SetCustomFilter(TxtMablaghTakhfif,TxtMablagh";
Debug.ShouldStop(8192);
act_mali.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_mali.mostCurrent._txtmablaghtakhfif.getObject())),(Object)(act_mali.mostCurrent._txtmablaghtakhfif.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 143;BA.debugLine="Key.SetCustomFilter(TxtDarsadTakhfif,TxtDarsadTa";
Debug.ShouldStop(16384);
act_mali.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_mali.mostCurrent._txtdarsadtakhfif.getObject())),(Object)(act_mali.mostCurrent._txtdarsadtakhfif.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 148;BA.debugLine="ListDaryaft.Initialize";
Debug.ShouldStop(524288);
act_mali.mostCurrent._listdaryaft.runVoidMethod ("Initialize");
 BA.debugLineNum = 149;BA.debugLine="lstCodeSandogh.Initialize";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._lstcodesandogh.runVoidMethod ("Initialize");
 BA.debugLineNum = 150;BA.debugLine="lstCodeBank1.Initialize";
Debug.ShouldStop(2097152);
act_mali.mostCurrent._lstcodebank1.runVoidMethod ("Initialize");
 BA.debugLineNum = 151;BA.debugLine="lstCheck.Initialize";
Debug.ShouldStop(4194304);
act_mali.mostCurrent._lstcheck.runVoidMethod ("Initialize");
 BA.debugLineNum = 155;BA.debugLine="lblShomareFactor.Text=ShomareFactor";
Debug.ShouldStop(67108864);
act_mali.mostCurrent._lblshomarefactor.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali._shomarefactor));
 BA.debugLineNum = 156;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
Debug.ShouldStop(134217728);
act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 157;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
Debug.ShouldStop(268435456);
act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 158;BA.debugLine="MabalghKolFactor=MabalghGhablepardakht";
Debug.ShouldStop(536870912);
act_mali._mabalghkolfactor = act_mali._mabalghghablepardakht;
 BA.debugLineNum = 159;BA.debugLine="LblMablaghKolFactor.Text=myCode.AdadToPrice(Maba";
Debug.ShouldStop(1073741824);
act_mali.mostCurrent._lblmablaghkolfactor.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali._mabalghkolfactor))));
 BA.debugLineNum = 160;BA.debugLine="LoadSp";
Debug.ShouldStop(-2147483648);
_loadsp();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e41) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e41.toString()); BA.debugLineNum = 162;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","545875252",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 163;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_KeyPress (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,776);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 776;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 777;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_mali.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 778;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(512);
act_mali.mostCurrent._key.runVoidMethod ("HideKeyboard",act_mali.mostCurrent.activityBA);
 BA.debugLineNum = 779;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
act_mali.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 781;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) return act_mali.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 782;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Pause (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,789);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 789;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 790;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
Debug.ShouldStop(2097152);
act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 791;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
Debug.ShouldStop(4194304);
act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 792;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Resume (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,784);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","activity_resume");}
 BA.debugLineNum = 784;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 785;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
Debug.ShouldStop(65536);
act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 786;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
Debug.ShouldStop(131072);
act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 787;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Application_Error (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,1065);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 1065;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(256);
 BA.debugLineNum = 1067;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return act_mali.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1068;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("btn_Back_Click (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,838);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","btn_back_click");}
 BA.debugLineNum = 838;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 839;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
act_mali.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 840;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_delete_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Delete_Click (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,959);
if (RapidSub.canDelegate("btn_delete_click")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","btn_delete_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _cu2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 959;BA.debugLine="Private Sub Btn_Delete_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 960;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 961;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShomare";
Debug.ShouldStop(1);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"));
 BA.debugLineNum = 962;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(2);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 963;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 964;BA.debugLine="Dim result As Int";
Debug.ShouldStop(8);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 965;BA.debugLine="result = Msgbox2(\"آیا از حذف اطلاعات دریافتی اط";
Debug.ShouldStop(16);
_result = act_mali.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("آیا از حذف اطلاعات دریافتی اطمینان دارید؟")),(Object)(BA.ObjectToCharSequence("حذف دریافتی")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((act_mali.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_mali.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png"))).getObject())),act_mali.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 966;BA.debugLine="If result = DialogResponse.Positive Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, act_mali.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 967;BA.debugLine="Query=\"SELECT * from TblCheckDaryafti where fl";
Debug.ShouldStop(64);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblCheckDaryafti where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"));
 BA.debugLineNum = 968;BA.debugLine="Dim cu2 As Cursor=MCode.Result(Query)";
Debug.ShouldStop(128);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu2", _cu2);Debug.locals.put("cu2", _cu2);
 BA.debugLineNum = 969;BA.debugLine="If cu2.RowCount>0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_cu2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 970;BA.debugLine="Query=\"Delete From TblCheckDaryafti where fld";
Debug.ShouldStop(512);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("Delete From TblCheckDaryafti where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"));
 BA.debugLineNum = 971;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(1024);
act_mali.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));
 };
 BA.debugLineNum = 973;BA.debugLine="Query=\"Delete From TblDaryaft where fldShomare";
Debug.ShouldStop(4096);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("Delete From TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"));
 BA.debugLineNum = 974;BA.debugLine="MCode.SaveUpdate(Query)";
Debug.ShouldStop(8192);
act_mali.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));
 BA.debugLineNum = 975;BA.debugLine="btnNew_Click";
Debug.ShouldStop(16384);
_btnnew_click();
 BA.debugLineNum = 976;BA.debugLine="GetSum";
Debug.ShouldStop(32768);
_getsum();
 };
 }else {
 BA.debugLineNum = 980;BA.debugLine="ToastMessageShow(\"اطلاعاتی جهت حذف وجود ندارد\",";
Debug.ShouldStop(524288);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعاتی جهت حذف وجود ندارد")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e23.toString()); BA.debugLineNum = 983;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","547120408",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 984;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8388608);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Btn_Delete_Click"))));
 };
 BA.debugLineNum = 986;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_sendinfo_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_SendInfo_Click (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,988);
if (RapidSub.canDelegate("btn_sendinfo_click")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","btn_sendinfo_click");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _dtdaryaft = RemoteObject.createImmutable("");
RemoteObject _dtcheckdaryaft = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _cu2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 988;BA.debugLine="Private Sub Btn_SendInfo_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 989;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 990;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA),act_mali.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",act_mali.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 991;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
Debug.ShouldStop(1073741824);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 992;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 994;BA.debugLine="Query=\"SELECT fldShomareDaryaft,fldShomareHavale";
Debug.ShouldStop(2);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT fldShomareDaryaft,fldShomareHavale,fldMablaghDaryafti,FldDarsadTakhfif as fldDarsadTakhfif"),RemoteObject.createImmutable(",FldMablaghTakhfif as fldMablaghTakhfif,fldSharhKol,fldCodeTafzili,fldSharheTafzili,fldShomareTell,fldSharh,fldCodeVaste,fldCodeSandoogh"),RemoteObject.createImmutable(",fldCodeBank,FldDateDaryaft as fldDateDaryaft,fldType,fldShomareFactor from TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"));
 BA.debugLineNum = 997;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(16);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 998;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 999;BA.debugLine="Dim dtDaryaft,dtCheckDaryaft As String";
Debug.ShouldStop(64);
_dtdaryaft = RemoteObject.createImmutable("");Debug.locals.put("dtDaryaft", _dtdaryaft);
_dtcheckdaryaft = RemoteObject.createImmutable("");Debug.locals.put("dtCheckDaryaft", _dtcheckdaryaft);
 BA.debugLineNum = 1000;BA.debugLine="Dim result As Int";
Debug.ShouldStop(128);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 1001;BA.debugLine="dtDaryaft=MCode.DtToJson(cu)";
Debug.ShouldStop(256);
_dtdaryaft = act_mali.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_cu));Debug.locals.put("dtDaryaft", _dtdaryaft);
 BA.debugLineNum = 1002;BA.debugLine="Query=\"SELECT fldShomareCheck,fldShomareHesab,f";
Debug.ShouldStop(512);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT fldShomareCheck,fldShomareHesab,fldDate,fldDateSarResid,fldCodeBank,fldShobe,fldMablagh as fldMablaghDaryafti,fldCodeSahebeCheck as fldCodeTafzili,fldShomareDaryaft,fldSharh,fldCodeVaste from TblCheckDaryafti where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"));
 BA.debugLineNum = 1003;BA.debugLine="Dim cu2 As Cursor=MCode.Result(Query)";
Debug.ShouldStop(1024);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu2", _cu2);Debug.locals.put("cu2", _cu2);
 BA.debugLineNum = 1004;BA.debugLine="If cu2.RowCount>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_cu2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1005;BA.debugLine="dtCheckDaryaft=MCode.DtToJson(cu2)";
Debug.ShouldStop(4096);
_dtcheckdaryaft = act_mali.mostCurrent._mcode.runMethod(true,"_dttojson" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_cu2));Debug.locals.put("dtCheckDaryaft", _dtcheckdaryaft);
 };
 BA.debugLineNum = 1007;BA.debugLine="result = Msgbox2(\"آیا از ارسال اطلاعات دریافتی";
Debug.ShouldStop(16384);
_result = act_mali.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("آیا از ارسال اطلاعات دریافتی اطمینان دارید؟")),(Object)(BA.ObjectToCharSequence("ارسال دریافتی")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((act_mali.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_mali.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png"))).getObject())),act_mali.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 1008;BA.debugLine="If result = DialogResponse.Positive Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, act_mali.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 1009;BA.debugLine="Service_Server.shomareFactorSelect=lblShomareF";
Debug.ShouldStop(65536);
act_mali.mostCurrent._service_server._shomarefactorselect /*RemoteObject*/  = BA.numberCast(int.class, act_mali.mostCurrent._lblshomarefactor.runMethod(true,"getText"));
 BA.debugLineNum = 1010;BA.debugLine="CallSubDelayed3(Service_Server,\"LoadSendDaryaf";
Debug.ShouldStop(131072);
act_mali.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",act_mali.processBA,(Object)((act_mali.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("LoadSendDaryaft")),(Object)((_dtdaryaft)),(Object)((_dtcheckdaryaft)));
 };
 BA.debugLineNum = 1012;BA.debugLine="Btn_SendInfo.Enabled=False";
Debug.ShouldStop(524288);
act_mali.mostCurrent._btn_sendinfo.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1013;BA.debugLine="Btn_Delete.Enabled=False";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._btn_delete.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1014;BA.debugLine="IsSend=True";
Debug.ShouldStop(2097152);
act_mali._issend = act_mali.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1015;BA.debugLine="btnNew_Click";
Debug.ShouldStop(4194304);
_btnnew_click();
 }else {
 BA.debugLineNum = 1017;BA.debugLine="ToastMessageShow(\"اطلاعاتی جهت ارسال وجود ندارد";
Debug.ShouldStop(16777216);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اطلاعاتی جهت ارسال وجود ندارد")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e30) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e30.toString()); BA.debugLineNum = 1020;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","547185952",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1021;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(268435456);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Btn_SendInfo_Click"))));
 };
 BA.debugLineNum = 1023;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbacktrack_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackTrack_Click (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,1031);
if (RapidSub.canDelegate("btnbacktrack_click")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","btnbacktrack_click");}
RemoteObject _shomare = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1031;BA.debugLine="Private Sub btnBackTrack_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 1032;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 1033;BA.debugLine="If btnBackTrack.Enabled=True And Current>0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._btnbacktrack.runMethod(true,"getEnabled"),act_mali.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean(">",act_mali._current,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1034;BA.debugLine="Dim shomare As Int=0";
Debug.ShouldStop(512);
_shomare = BA.numberCast(int.class, 0);Debug.locals.put("shomare", _shomare);Debug.locals.put("shomare", _shomare);
 BA.debugLineNum = 1035;BA.debugLine="Current=Current-1";
Debug.ShouldStop(1024);
act_mali._current = RemoteObject.solve(new RemoteObject[] {act_mali._current,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 1036;BA.debugLine="shomare=ListDaryaft.Get(Current)";
Debug.ShouldStop(2048);
_shomare = BA.numberCast(int.class, act_mali.mostCurrent._listdaryaft.runMethod(false,"Get",(Object)(act_mali._current)));Debug.locals.put("shomare", _shomare);
 BA.debugLineNum = 1038;BA.debugLine="LoadDaryaft(shomare)";
Debug.ShouldStop(8192);
_loaddaryaft(BA.NumberToString(_shomare));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e9.toString()); BA.debugLineNum = 1041;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","547317002",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1042;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(131072);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btnBackTrack_Click"))));
 };
 BA.debugLineNum = 1044;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnew_click() throws Exception{
try {
		Debug.PushSubsStack("btnNew_Click (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,1026);
if (RapidSub.canDelegate("btnnew_click")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","btnnew_click");}
 BA.debugLineNum = 1026;BA.debugLine="Private Sub btnNew_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 1027;BA.debugLine="BtnSaveD.Enabled=True";
Debug.ShouldStop(4);
act_mali.mostCurrent._btnsaved.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1028;BA.debugLine="LoadDaryaft(0)";
Debug.ShouldStop(8);
_loaddaryaft(BA.NumberToString(0));
 BA.debugLineNum = 1029;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnexttrack_click() throws Exception{
try {
		Debug.PushSubsStack("btnNextTrack_Click (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,1046);
if (RapidSub.canDelegate("btnnexttrack_click")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","btnnexttrack_click");}
RemoteObject _shomare = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1046;BA.debugLine="Private Sub btnNextTrack_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1047;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 1048;BA.debugLine="If btnNextTrack.Enabled=True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._btnnexttrack.runMethod(true,"getEnabled"),act_mali.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1049;BA.debugLine="Dim shomare As Int=0";
Debug.ShouldStop(16777216);
_shomare = BA.numberCast(int.class, 0);Debug.locals.put("shomare", _shomare);Debug.locals.put("shomare", _shomare);
 BA.debugLineNum = 1050;BA.debugLine="Current=Current+1";
Debug.ShouldStop(33554432);
act_mali._current = RemoteObject.solve(new RemoteObject[] {act_mali._current,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 1051;BA.debugLine="If Current = ListDaryaft.Size Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",act_mali._current,BA.numberCast(double.class, act_mali.mostCurrent._listdaryaft.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 1052;BA.debugLine="btnNew_Click";
Debug.ShouldStop(134217728);
_btnnew_click();
 BA.debugLineNum = 1053;BA.debugLine="Return";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1055;BA.debugLine="shomare=ListDaryaft.Get(Current)";
Debug.ShouldStop(1073741824);
_shomare = BA.numberCast(int.class, act_mali.mostCurrent._listdaryaft.runMethod(false,"Get",(Object)(act_mali._current)));Debug.locals.put("shomare", _shomare);
 BA.debugLineNum = 1057;BA.debugLine="LoadDaryaft(shomare)";
Debug.ShouldStop(1);
_loaddaryaft(BA.NumberToString(_shomare));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e13.toString()); BA.debugLineNum = 1060;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","547382542",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1061;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(16);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btnNextTrack_Click"))));
 };
 BA.debugLineNum = 1063;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpaymentcard_click() throws Exception{
try {
		Debug.PushSubsStack("btnPaymentCard_Click (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,1070);
if (RapidSub.canDelegate("btnpaymentcard_click")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","btnpaymentcard_click");}
RemoteObject _intent2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 1070;BA.debugLine="Private Sub btnPaymentCard_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1071;BA.debugLine="If TxtMablaghBanki.Text=\"\" Or TxtMablaghBanki.Tex";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._txtmablaghbanki.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",act_mali.mostCurrent._txtmablaghbanki.runMethod(true,"getText"),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 1072;BA.debugLine="ToastMessageShow(\"لطفا مبلغ بانکی را وارد نمایید";
Debug.ShouldStop(32768);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا مبلغ بانکی را وارد نمایید")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1073;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1076;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 1077;BA.debugLine="Dim intent2 As Intent";
Debug.ShouldStop(1048576);
_intent2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("intent2", _intent2);
 BA.debugLineNum = 1078;BA.debugLine="intent2.Initialize(\"com.parsikhesab.parsianpos.S";
Debug.ShouldStop(2097152);
_intent2.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("com.parsikhesab.parsianpos.Sale")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1079;BA.debugLine="intent2.SetComponent(MCode.PackageNamePosParsian";
Debug.ShouldStop(4194304);
_intent2.runVoidMethod ("SetComponent",(Object)(RemoteObject.concat(act_mali.mostCurrent._mcode._packagenameposparsian /*RemoteObject*/ ,RemoteObject.createImmutable("/.MainActivity"))));
 BA.debugLineNum = 1080;BA.debugLine="intent2.PutExtra(\"CompanyName\", MCode.CompanyNam";
Debug.ShouldStop(8388608);
_intent2.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("CompanyName")),(Object)((act_mali.mostCurrent._mcode._companyname /*RemoteObject*/ )));
 BA.debugLineNum = 1081;BA.debugLine="intent2.PutExtra(\"AMOUNT\", TxtMablaghBanki.Text.";
Debug.ShouldStop(16777216);
_intent2.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("AMOUNT")),(Object)((act_mali.mostCurrent._txtmablaghbanki.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1082;BA.debugLine="intent2.PutExtra(\"SignCode\", \"100015\") ' ارسال د";
Debug.ShouldStop(33554432);
_intent2.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("SignCode")),(Object)((RemoteObject.createImmutable("100015"))));
 BA.debugLineNum = 1083;BA.debugLine="intent2.PutExtra(\"additionalData\",TxtSharhKol.Te";
Debug.ShouldStop(67108864);
_intent2.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("additionalData")),(Object)((act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"))));
 BA.debugLineNum = 1084;BA.debugLine="StartActivity(intent2)";
Debug.ShouldStop(134217728);
act_mali.mostCurrent.__c.runVoidMethod ("StartActivity",act_mali.processBA,(Object)((_intent2.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e15.toString()); BA.debugLineNum = 1086;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","547513616",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 1088;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnrizchecki_click() throws Exception{
try {
		Debug.PushSubsStack("btnRizChecki_Click (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,943);
if (RapidSub.canDelegate("btnrizchecki_click")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","btnrizchecki_click");}
 BA.debugLineNum = 943;BA.debugLine="Private Sub btnRizChecki_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 944;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 945;BA.debugLine="Act_SabtRizCheck.ShomareDaryafti=lblShomareDarya";
Debug.ShouldStop(65536);
act_mali.mostCurrent._act_sabtrizcheck._shomaredaryafti /*RemoteObject*/  = act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText");
 BA.debugLineNum = 946;BA.debugLine="Act_SabtRizCheck.ShomareFactor=ShomareFactor";
Debug.ShouldStop(131072);
act_mali.mostCurrent._act_sabtrizcheck._shomarefactor /*RemoteObject*/  = act_mali._shomarefactor;
 BA.debugLineNum = 947;BA.debugLine="Act_SabtRizCheck.CodeMoshtari=CodeMoshtari";
Debug.ShouldStop(262144);
act_mali.mostCurrent._act_sabtrizcheck._codemoshtari /*RemoteObject*/  = act_mali._codemoshtari;
 BA.debugLineNum = 948;BA.debugLine="Act_SabtRizCheck.NameMoshtari=NameMoshtari";
Debug.ShouldStop(524288);
act_mali.mostCurrent._act_sabtrizcheck._namemoshtari /*RemoteObject*/  = act_mali._namemoshtari;
 BA.debugLineNum = 949;BA.debugLine="Act_SabtRizCheck.issend=IsSend";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._act_sabtrizcheck._issend /*RemoteObject*/  = act_mali._issend;
 BA.debugLineNum = 951;BA.debugLine="StartActivity(Act_SabtRizCheck)";
Debug.ShouldStop(4194304);
act_mali.mostCurrent.__c.runVoidMethod ("StartActivity",act_mali.processBA,(Object)((act_mali.mostCurrent._act_sabtrizcheck.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e9.toString()); BA.debugLineNum = 953;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","547054858",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 954;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(33554432);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btnRizChecki_Click"))));
 };
 BA.debugLineNum = 956;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsaved_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSaveD_Click (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,479);
if (RapidSub.canDelegate("btnsaved_click")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","btnsaved_click");}
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _sharh = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _where = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _darsad = RemoteObject.createImmutable("");
 BA.debugLineNum = 479;BA.debugLine="Sub BtnSaveD_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 480;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 482;BA.debugLine="Dim status As String=\"Not Ok\"";
Debug.ShouldStop(2);
_status = BA.ObjectToString("Not Ok");Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 483;BA.debugLine="Dim sharh As String";
Debug.ShouldStop(4);
_sharh = RemoteObject.createImmutable("");Debug.locals.put("sharh", _sharh);
 BA.debugLineNum = 484;BA.debugLine="MCode.ShomareDaryaft=lblShomareDaryaft.Text";
Debug.ShouldStop(8);
act_mali.mostCurrent._mcode._shomaredaryaft /*RemoteObject*/  = act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText");
 BA.debugLineNum = 485;BA.debugLine="MCode.SQL1.BeginTransaction";
Debug.ShouldStop(16);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 487;BA.debugLine="If TxtSharhKol.Text=\"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 488;BA.debugLine="TxtSharhKol.Text= \"  \"&lblCodeMoshtari.Text &\"";
Debug.ShouldStop(128);
act_mali.mostCurrent._txtsharhkol.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("  "),act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable(" _ "),act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText"))));
 }else 
{ BA.debugLineNum = 489;BA.debugLine="Else if TxtSharhKol.Text.Contains(\"  \"&lblCodeMo";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.concat(RemoteObject.createImmutable("  "),act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable(" _ "),act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText")))),act_mali.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 490;BA.debugLine="TxtSharhKol.Text= TxtSharhKol.Text &\"  \"&lblCod";
Debug.ShouldStop(512);
act_mali.mostCurrent._txtsharhkol.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"),RemoteObject.createImmutable("  "),act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable(" _ "),act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText"))));
 }}
;
 BA.debugLineNum = 493;BA.debugLine="If ShomareHavale=\"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",act_mali._shomarehavale,BA.ObjectToString(""))) { 
 BA.debugLineNum = 494;BA.debugLine="ShomareHavale=\"0\"";
Debug.ShouldStop(8192);
act_mali._shomarehavale = BA.ObjectToString("0");
 };
 BA.debugLineNum = 497;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 498;BA.debugLine="If TxtMablaghNaghdi.Text<>\"0\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",act_mali.mostCurrent._txtmablaghnaghdi.runMethod(true,"getText"),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 499;BA.debugLine="Log(\"نقدی\")";
Debug.ShouldStop(262144);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546333972",RemoteObject.createImmutable("نقدی"),0);
 BA.debugLineNum = 500;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
Debug.ShouldStop(524288);
act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 501;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 503;BA.debugLine="MablaghDaryafti=TxtMablaghNaghdi.Text.Replace(";
Debug.ShouldStop(4194304);
act_mali._mablaghdaryafti = BA.numberCast(long.class, act_mali.mostCurrent._txtmablaghnaghdi.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 504;BA.debugLine="sharh=TxtSharhNaghdi.Text";
Debug.ShouldStop(8388608);
_sharh = act_mali.mostCurrent._txtsharhnaghdi.runMethod(true,"getText");Debug.locals.put("sharh", _sharh);
 BA.debugLineNum = 505;BA.debugLine="If myCode.Is_Null_adad(CodeSandogh)=0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._codesandogh)),BA.NumberToString(0))) { 
 BA.debugLineNum = 506;BA.debugLine="ToastMessageShow(\"لیست کد صندوق به خوبی دریاف";
Debug.ShouldStop(33554432);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لیست کد صندوق به خوبی دریافت نشده لطفا دریافت اطلاعات را بزنید")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 507;BA.debugLine="Return";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 510;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
Debug.ShouldStop(536870912);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=0"));
 BA.debugLineNum = 511;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(1073741824);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 512;BA.debugLine="If cu.RowCount=0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 513;BA.debugLine="Query=\"INSERT into TblDaryaft(FldRadif,fldSho";
Debug.ShouldStop(1);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("),act_mali._radif,RemoteObject.createImmutable(","),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(","),act_mali._shomarefactor,RemoteObject.createImmutable(","),act_mali._shomarehavale,RemoteObject.createImmutable(","),act_mali._mablaghdaryafti,RemoteObject.createImmutable(",0,'"),act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable("','"),_sharh,RemoteObject.createImmutable("',"),act_mali.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(","),act_mali.mostCurrent._codesandogh,RemoteObject.createImmutable(",'"),act_mali.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA),RemoteObject.createImmutable("',0,'0','"),act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"),RemoteObject.createImmutable("',0,'"),act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_mali._shomaretell,RemoteObject.createImmutable("',0) "));
 BA.debugLineNum = 514;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
Debug.ShouldStop(2);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(act_mali.mostCurrent._query));
 BA.debugLineNum = 515;BA.debugLine="Log(\"Sucessful\")";
Debug.ShouldStop(4);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546333988",RemoteObject.createImmutable("Sucessful"),0);
 BA.debugLineNum = 516;BA.debugLine="status=\"OK\"";
Debug.ShouldStop(8);
_status = BA.ObjectToString("OK");Debug.locals.put("status", _status);
 }else {
 BA.debugLineNum = 518;BA.debugLine="If MablaghDaryafti>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",act_mali._mablaghdaryafti,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 519;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(64);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 520;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(128);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 522;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(512);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 523;BA.debugLine="Where.Initialize";
Debug.ShouldStop(1024);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 525;BA.debugLine="Fields.Put(\"fldShomareDaryaft\",lblShomareDar";
Debug.ShouldStop(4096);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareDaryaft"))),(Object)((act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"))));
 BA.debugLineNum = 526;BA.debugLine="Fields.Put(\"fldShomareHavale\",ShomareHavale)";
Debug.ShouldStop(8192);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareHavale"))),(Object)((act_mali._shomarehavale)));
 BA.debugLineNum = 527;BA.debugLine="Fields.Put(\"fldShomareFactor\",ShomareFactor)";
Debug.ShouldStop(16384);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareFactor"))),(Object)((act_mali._shomarefactor)));
 BA.debugLineNum = 528;BA.debugLine="Fields.Put(\"fldMablaghDaryafti\",MablaghDarya";
Debug.ShouldStop(32768);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldMablaghDaryafti"))),(Object)((act_mali._mablaghdaryafti)));
 BA.debugLineNum = 529;BA.debugLine="Fields.Put(\"fldCodeTafzili\",lblCodeMoshtari.";
Debug.ShouldStop(65536);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeTafzili"))),(Object)((act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"))));
 BA.debugLineNum = 530;BA.debugLine="Fields.Put(\"fldSharheTafzili\",lblNameMoshtar";
Debug.ShouldStop(131072);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharheTafzili"))),(Object)((act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText"))));
 BA.debugLineNum = 531;BA.debugLine="Fields.Put(\"fldShomareTell\",ShomareTell)";
Debug.ShouldStop(262144);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareTell"))),(Object)((act_mali._shomaretell)));
 BA.debugLineNum = 532;BA.debugLine="Fields.Put(\"fldSharh\",sharh)";
Debug.ShouldStop(524288);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharh"))),(Object)((_sharh)));
 BA.debugLineNum = 533;BA.debugLine="Fields.Put(\"fldCodeVaste\",MCode.C_Visitor)";
Debug.ShouldStop(1048576);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeVaste"))),(Object)((act_mali.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 534;BA.debugLine="Fields.Put(\"fldCodeSandoogh\",CodeSandogh)";
Debug.ShouldStop(2097152);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeSandoogh"))),(Object)((act_mali.mostCurrent._codesandogh)));
 BA.debugLineNum = 535;BA.debugLine="Fields.Put(\"FldDateDaryaft\",MCode.DatePersia";
Debug.ShouldStop(4194304);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDateDaryaft"))),(Object)((act_mali.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA))));
 BA.debugLineNum = 536;BA.debugLine="Fields.Put(\"FldSharhKol\",TxtSharhKol.Text)";
Debug.ShouldStop(8388608);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSharhKol"))),(Object)((act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"))));
 BA.debugLineNum = 537;BA.debugLine="Where.Put(\"fldShomareDaryaft\",lblShomareDary";
Debug.ShouldStop(16777216);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareDaryaft"))),(Object)((act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"))));
 BA.debugLineNum = 538;BA.debugLine="Where.Put(\"fldShomareFactor\",lblShomareFacto";
Debug.ShouldStop(33554432);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareFactor"))),(Object)((act_mali.mostCurrent._lblshomarefactor.runMethod(true,"getText"))));
 BA.debugLineNum = 539;BA.debugLine="Where.Put(\"fldType\",\"0\")";
Debug.ShouldStop(67108864);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldType"))),(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 541;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblDaryaft";
Debug.ShouldStop(268435456);
act_mali.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblDaryaft")),(Object)(_fields),(Object)(_where));
 BA.debugLineNum = 542;BA.debugLine="Log(\"Sucessful\")";
Debug.ShouldStop(536870912);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334015",RemoteObject.createImmutable("Sucessful"),0);
 BA.debugLineNum = 543;BA.debugLine="ToastMessageShow(\"دریافت نقدی موفقیت بروزرسا";
Debug.ShouldStop(1073741824);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت نقدی موفقیت بروزرسانی شد")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 544;BA.debugLine="status=\"OK\"";
Debug.ShouldStop(-2147483648);
_status = BA.ObjectToString("OK");Debug.locals.put("status", _status);
 };
 };
 }else {
 BA.debugLineNum = 550;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
Debug.ShouldStop(32);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=0"));
 BA.debugLineNum = 551;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(64);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 552;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 553;BA.debugLine="Query=\"Delete From TblDaryaft where fldShomar";
Debug.ShouldStop(256);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("Delete From TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=0 "));
 BA.debugLineNum = 554;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
Debug.ShouldStop(512);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(act_mali.mostCurrent._query));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e68) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e68.toString()); BA.debugLineNum = 558;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334031",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 559;BA.debugLine="err=1";
Debug.ShouldStop(16384);
act_mali._err = BA.numberCast(int.class, 1);
 };
 BA.debugLineNum = 561;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 562;BA.debugLine="If TxtMablaghBanki.Text<>\"0\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",act_mali.mostCurrent._txtmablaghbanki.runMethod(true,"getText"),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 563;BA.debugLine="Log(\"بانکی\")";
Debug.ShouldStop(262144);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334036",RemoteObject.createImmutable("بانکی"),0);
 BA.debugLineNum = 564;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
Debug.ShouldStop(524288);
act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 565;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 567;BA.debugLine="MablaghDaryafti=TxtMablaghBanki.Text.Replace(\"";
Debug.ShouldStop(4194304);
act_mali._mablaghdaryafti = BA.numberCast(long.class, act_mali.mostCurrent._txtmablaghbanki.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 568;BA.debugLine="sharh=TxtSharhBanki.Text";
Debug.ShouldStop(8388608);
_sharh = act_mali.mostCurrent._txtsharhbanki.runMethod(true,"getText");Debug.locals.put("sharh", _sharh);
 BA.debugLineNum = 569;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
Debug.ShouldStop(16777216);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=1"));
 BA.debugLineNum = 570;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(33554432);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 571;BA.debugLine="If cu.RowCount=0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 572;BA.debugLine="Query=\"INSERT into TblDaryaft(FldRadif,fldSho";
Debug.ShouldStop(134217728);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("),act_mali._radif,RemoteObject.createImmutable(","),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(","),act_mali._shomarefactor,RemoteObject.createImmutable(","),act_mali._shomarehavale,RemoteObject.createImmutable(","),act_mali._mablaghdaryafti,RemoteObject.createImmutable(",0,'"),act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable("','"),_sharh,RemoteObject.createImmutable("',"),act_mali.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(","),act_mali.mostCurrent._codesandogh,RemoteObject.createImmutable(",'"),act_mali.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA),RemoteObject.createImmutable("',"),act_mali.mostCurrent._codebank1,RemoteObject.createImmutable(",'1','"),act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"),RemoteObject.createImmutable("',0,'"),act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_mali._shomaretell,RemoteObject.createImmutable("',0) "));
 BA.debugLineNum = 573;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
Debug.ShouldStop(268435456);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(act_mali.mostCurrent._query));
 BA.debugLineNum = 574;BA.debugLine="Log(\"Sucessful\")";
Debug.ShouldStop(536870912);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334047",RemoteObject.createImmutable("Sucessful"),0);
 BA.debugLineNum = 575;BA.debugLine="ToastMessageShow(\"دریافت بانکی با موفقیت ثبت";
Debug.ShouldStop(1073741824);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت بانکی با موفقیت ثبت گردید")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 576;BA.debugLine="status=\"OK\"";
Debug.ShouldStop(-2147483648);
_status = BA.ObjectToString("OK");Debug.locals.put("status", _status);
 }else {
 BA.debugLineNum = 579;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(4);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 580;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(8);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 582;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(32);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 583;BA.debugLine="Where.Initialize";
Debug.ShouldStop(64);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 585;BA.debugLine="Fields.Put(\"fldShomareDaryaft\",lblShomareDary";
Debug.ShouldStop(256);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareDaryaft"))),(Object)((act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"))));
 BA.debugLineNum = 586;BA.debugLine="Fields.Put(\"fldShomareFactor\",ShomareFactor)";
Debug.ShouldStop(512);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareFactor"))),(Object)((act_mali._shomarefactor)));
 BA.debugLineNum = 587;BA.debugLine="Fields.Put(\"fldShomareHavale\",ShomareHavale)";
Debug.ShouldStop(1024);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareHavale"))),(Object)((act_mali._shomarehavale)));
 BA.debugLineNum = 588;BA.debugLine="Fields.Put(\"fldMablaghDaryafti\",MablaghDaryaf";
Debug.ShouldStop(2048);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldMablaghDaryafti"))),(Object)((act_mali._mablaghdaryafti)));
 BA.debugLineNum = 589;BA.debugLine="Fields.Put(\"fldCodeTafzili\",lblCodeMoshtari.T";
Debug.ShouldStop(4096);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeTafzili"))),(Object)((act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"))));
 BA.debugLineNum = 590;BA.debugLine="Fields.Put(\"fldSharheTafzili\",lblNameMoshtari";
Debug.ShouldStop(8192);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharheTafzili"))),(Object)((act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText"))));
 BA.debugLineNum = 591;BA.debugLine="Fields.Put(\"fldShomareTell\",ShomareTell)";
Debug.ShouldStop(16384);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareTell"))),(Object)((act_mali._shomaretell)));
 BA.debugLineNum = 592;BA.debugLine="Fields.Put(\"fldSharh\",sharh)";
Debug.ShouldStop(32768);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharh"))),(Object)((_sharh)));
 BA.debugLineNum = 593;BA.debugLine="Fields.Put(\"fldCodeBank\",CodeBank1)";
Debug.ShouldStop(65536);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeBank"))),(Object)((act_mali.mostCurrent._codebank1)));
 BA.debugLineNum = 594;BA.debugLine="Fields.Put(\"FldDateDaryaft\",MCode.DatePersian";
Debug.ShouldStop(131072);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDateDaryaft"))),(Object)((act_mali.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA))));
 BA.debugLineNum = 595;BA.debugLine="Fields.Put(\"FldSharhKol\",TxtSharhKol.Text)";
Debug.ShouldStop(262144);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSharhKol"))),(Object)((act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"))));
 BA.debugLineNum = 596;BA.debugLine="Where.Put(\"fldShomareDaryaft\",lblShomareDarya";
Debug.ShouldStop(524288);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareDaryaft"))),(Object)((act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"))));
 BA.debugLineNum = 597;BA.debugLine="Where.Put(\"fldShomareFactor\",lblShomareFactor";
Debug.ShouldStop(1048576);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareFactor"))),(Object)((act_mali.mostCurrent._lblshomarefactor.runMethod(true,"getText"))));
 BA.debugLineNum = 598;BA.debugLine="Where.Put(\"fldType\",\"1\")";
Debug.ShouldStop(2097152);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldType"))),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 600;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblDaryaft\"";
Debug.ShouldStop(8388608);
act_mali.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblDaryaft")),(Object)(_fields),(Object)(_where));
 BA.debugLineNum = 601;BA.debugLine="Log(\"Sucessful\")";
Debug.ShouldStop(16777216);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334074",RemoteObject.createImmutable("Sucessful"),0);
 BA.debugLineNum = 602;BA.debugLine="ToastMessageShow(\"دریافت بانکی با موفقیت بروز";
Debug.ShouldStop(33554432);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت بانکی با موفقیت بروزرسانی شد")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 603;BA.debugLine="status=\"OK\"";
Debug.ShouldStop(67108864);
_status = BA.ObjectToString("OK");Debug.locals.put("status", _status);
 };
 }else {
 BA.debugLineNum = 607;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
Debug.ShouldStop(1073741824);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=1"));
 BA.debugLineNum = 608;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(-2147483648);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 609;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 610;BA.debugLine="Query=\"Delete From TblDaryaft where fldShomar";
Debug.ShouldStop(2);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("Delete From TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=1 "));
 BA.debugLineNum = 611;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
Debug.ShouldStop(4);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(act_mali.mostCurrent._query));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e119) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e119.toString()); BA.debugLineNum = 615;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(64);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334088",act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 616;BA.debugLine="err=2";
Debug.ShouldStop(128);
act_mali._err = BA.numberCast(int.class, 2);
 };
 BA.debugLineNum = 619;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 620;BA.debugLine="If	TxtMablaghChecki.Text<>\"0\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",act_mali.mostCurrent._txtmablaghchecki.runMethod(true,"getText"),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 621;BA.debugLine="Log(\"چکی\")";
Debug.ShouldStop(4096);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334094",RemoteObject.createImmutable("چکی"),0);
 BA.debugLineNum = 622;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
Debug.ShouldStop(8192);
act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 623;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
Debug.ShouldStop(16384);
act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 624;BA.debugLine="MablaghDaryafti=TxtMablaghChecki.Text.Replace(";
Debug.ShouldStop(32768);
act_mali._mablaghdaryafti = BA.numberCast(long.class, act_mali.mostCurrent._txtmablaghchecki.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 625;BA.debugLine="sharh=TxtSharhChecki.Text";
Debug.ShouldStop(65536);
_sharh = act_mali.mostCurrent._txtsharhchecki.runMethod(true,"getText");Debug.locals.put("sharh", _sharh);
 BA.debugLineNum = 626;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
Debug.ShouldStop(131072);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=2"));
 BA.debugLineNum = 627;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(262144);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 630;BA.debugLine="If cu.RowCount=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 631;BA.debugLine="Query=\"INSERT into TblDaryaft(FldRadif,fldSho";
Debug.ShouldStop(4194304);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("),act_mali._radif,RemoteObject.createImmutable(","),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(","),act_mali._shomarefactor,RemoteObject.createImmutable(","),act_mali._shomarehavale,RemoteObject.createImmutable(","),act_mali._mablaghdaryafti,RemoteObject.createImmutable(",0,'"),act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable("','"),_sharh,RemoteObject.createImmutable("',"),act_mali.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(",0,'"),act_mali.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA),RemoteObject.createImmutable("',0,'2','"),act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"),RemoteObject.createImmutable("',0,'"),act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_mali._shomaretell,RemoteObject.createImmutable("',0) "));
 BA.debugLineNum = 632;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
Debug.ShouldStop(8388608);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(act_mali.mostCurrent._query));
 BA.debugLineNum = 633;BA.debugLine="Log(\"Sucessful\")";
Debug.ShouldStop(16777216);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334106",RemoteObject.createImmutable("Sucessful"),0);
 BA.debugLineNum = 634;BA.debugLine="ToastMessageShow(\"دریافت چکی با موفقیت ثبت گر";
Debug.ShouldStop(33554432);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت چکی با موفقیت ثبت گردید")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 635;BA.debugLine="status=\"OK\"";
Debug.ShouldStop(67108864);
_status = BA.ObjectToString("OK");Debug.locals.put("status", _status);
 }else {
 BA.debugLineNum = 638;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(536870912);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 639;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(1073741824);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 641;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(1);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 642;BA.debugLine="Where.Initialize";
Debug.ShouldStop(2);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 644;BA.debugLine="Fields.Put(\"fldShomareDaryaft\",lblShomareDary";
Debug.ShouldStop(8);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareDaryaft"))),(Object)((act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"))));
 BA.debugLineNum = 645;BA.debugLine="Fields.Put(\"fldShomareFactor\",ShomareFactor)";
Debug.ShouldStop(16);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareFactor"))),(Object)((act_mali._shomarefactor)));
 BA.debugLineNum = 646;BA.debugLine="Fields.Put(\"fldShomareHavale\",ShomareHavale)";
Debug.ShouldStop(32);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareHavale"))),(Object)((act_mali._shomarehavale)));
 BA.debugLineNum = 647;BA.debugLine="Fields.Put(\"fldMablaghDaryafti\",MablaghDaryaf";
Debug.ShouldStop(64);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldMablaghDaryafti"))),(Object)((act_mali._mablaghdaryafti)));
 BA.debugLineNum = 648;BA.debugLine="Fields.Put(\"fldCodeTafzili\",lblCodeMoshtari.T";
Debug.ShouldStop(128);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeTafzili"))),(Object)((act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"))));
 BA.debugLineNum = 649;BA.debugLine="Fields.Put(\"fldSharheTafzili\",lblNameMoshtari";
Debug.ShouldStop(256);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharheTafzili"))),(Object)((act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText"))));
 BA.debugLineNum = 650;BA.debugLine="Fields.Put(\"fldShomareTell\",ShomareTell)";
Debug.ShouldStop(512);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareTell"))),(Object)((act_mali._shomaretell)));
 BA.debugLineNum = 651;BA.debugLine="Fields.Put(\"fldSharh\",sharh)";
Debug.ShouldStop(1024);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharh"))),(Object)((_sharh)));
 BA.debugLineNum = 652;BA.debugLine="Fields.Put(\"FldDateDaryaft\",MCode.DatePersian";
Debug.ShouldStop(2048);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDateDaryaft"))),(Object)((act_mali.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA))));
 BA.debugLineNum = 653;BA.debugLine="Fields.Put(\"FldSharhKol\",TxtSharhKol.Text)";
Debug.ShouldStop(4096);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSharhKol"))),(Object)((act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"))));
 BA.debugLineNum = 654;BA.debugLine="Where.Put(\"fldShomareDaryaft\",lblShomareDarya";
Debug.ShouldStop(8192);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareDaryaft"))),(Object)((act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"))));
 BA.debugLineNum = 655;BA.debugLine="Where.Put(\"fldShomareFactor\",lblShomareFactor";
Debug.ShouldStop(16384);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareFactor"))),(Object)((act_mali.mostCurrent._lblshomarefactor.runMethod(true,"getText"))));
 BA.debugLineNum = 656;BA.debugLine="Where.Put(\"fldType\",\"2\")";
Debug.ShouldStop(32768);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldType"))),(Object)((RemoteObject.createImmutable("2"))));
 BA.debugLineNum = 658;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblDaryaft\"";
Debug.ShouldStop(131072);
act_mali.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblDaryaft")),(Object)(_fields),(Object)(_where));
 BA.debugLineNum = 659;BA.debugLine="Log(\"Sucessful\")";
Debug.ShouldStop(262144);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334132",RemoteObject.createImmutable("Sucessful"),0);
 BA.debugLineNum = 660;BA.debugLine="ToastMessageShow(\"دریافت چکی با موفقیت بروزرس";
Debug.ShouldStop(524288);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت چکی با موفقیت بروزرسانی شد")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 661;BA.debugLine="status=\"OK\"";
Debug.ShouldStop(1048576);
_status = BA.ObjectToString("OK");Debug.locals.put("status", _status);
 };
 }else {
 BA.debugLineNum = 667;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
Debug.ShouldStop(67108864);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=2"));
 BA.debugLineNum = 668;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(134217728);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 669;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 670;BA.debugLine="Query=\"Delete From TblDaryaft where fldShomar";
Debug.ShouldStop(536870912);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("Delete From TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=2 "));
 BA.debugLineNum = 671;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
Debug.ShouldStop(1073741824);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(act_mali.mostCurrent._query));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e169) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e169.toString()); BA.debugLineNum = 676;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(8);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334149",act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 677;BA.debugLine="err=3";
Debug.ShouldStop(16);
act_mali._err = BA.numberCast(int.class, 3);
 };
 BA.debugLineNum = 680;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 681;BA.debugLine="If	TxtMablaghTakhfif.Text<>\"0\" Or TxtDarsadTakh";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",act_mali.mostCurrent._txtmablaghtakhfif.runMethod(true,"getText"),BA.ObjectToString("0")) || RemoteObject.solveBoolean("!",act_mali.mostCurrent._txtdarsadtakhfif.runMethod(true,"getText"),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 682;BA.debugLine="Log(\"تخفیف\")";
Debug.ShouldStop(512);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334155",RemoteObject.createImmutable("تخفیف"),0);
 BA.debugLineNum = 684;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
Debug.ShouldStop(2048);
act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 685;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
Debug.ShouldStop(4096);
act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 687;BA.debugLine="If TxtMablaghTakhfif.Text=\"0\" Or TxtMablaghTak";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._txtmablaghtakhfif.runMethod(true,"getText"),BA.ObjectToString("0")) || RemoteObject.solveBoolean("=",act_mali.mostCurrent._txtmablaghtakhfif.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 688;BA.debugLine="Dim darsad As String=TxtDarsadTakhfif.Text";
Debug.ShouldStop(32768);
_darsad = act_mali.mostCurrent._txtdarsadtakhfif.runMethod(true,"getText");Debug.locals.put("darsad", _darsad);Debug.locals.put("darsad", _darsad);
 BA.debugLineNum = 689;BA.debugLine="MablaghTakhfif=(MabalghKolFactor*darsad)/100";
Debug.ShouldStop(65536);
act_mali._mablaghtakhfif = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_mali._mabalghkolfactor),BA.numberCast(double.class, _darsad)}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0));
 }else {
 BA.debugLineNum = 691;BA.debugLine="MablaghTakhfif=TxtMablaghTakhfif.Text.Replace";
Debug.ShouldStop(262144);
act_mali._mablaghtakhfif = BA.numberCast(long.class, act_mali.mostCurrent._txtmablaghtakhfif.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 693;BA.debugLine="sharh=TxtSharhTakhfif.Text";
Debug.ShouldStop(1048576);
_sharh = act_mali.mostCurrent._txtsharhtakhfif.runMethod(true,"getText");Debug.locals.put("sharh", _sharh);
 BA.debugLineNum = 694;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
Debug.ShouldStop(2097152);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=3"));
 BA.debugLineNum = 695;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(4194304);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 696;BA.debugLine="If cu.RowCount=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 697;BA.debugLine="Query=\"INSERT into TblDaryaft(FldRadif,fldSho";
Debug.ShouldStop(16777216);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("),act_mali._radif,RemoteObject.createImmutable(","),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(","),act_mali._shomarefactor,RemoteObject.createImmutable(","),act_mali._shomarehavale,RemoteObject.createImmutable(",0,"),act_mali._mablaghtakhfif,RemoteObject.createImmutable(",'"),act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable("','"),_sharh,RemoteObject.createImmutable("',"),act_mali.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable(",0,'"),act_mali.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA),RemoteObject.createImmutable("',0,'3','"),act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"),RemoteObject.createImmutable("','"),_darsad,RemoteObject.createImmutable("','"),act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_mali._shomaretell,RemoteObject.createImmutable("',0) "));
 BA.debugLineNum = 698;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
Debug.ShouldStop(33554432);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(act_mali.mostCurrent._query));
 BA.debugLineNum = 699;BA.debugLine="Log(\"Sucessful\")";
Debug.ShouldStop(67108864);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334172",RemoteObject.createImmutable("Sucessful"),0);
 BA.debugLineNum = 700;BA.debugLine="ToastMessageShow(\"دریافت تخفیف با موفقیت ثبت";
Debug.ShouldStop(134217728);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت تخفیف با موفقیت ثبت گردید")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 701;BA.debugLine="status=\"OK\"";
Debug.ShouldStop(268435456);
_status = BA.ObjectToString("OK");Debug.locals.put("status", _status);
 }else {
 BA.debugLineNum = 704;BA.debugLine="Dim Fields As Map";
Debug.ShouldStop(-2147483648);
_fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fields", _fields);
 BA.debugLineNum = 705;BA.debugLine="Dim Where As Map";
Debug.ShouldStop(1);
_where = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Where", _where);
 BA.debugLineNum = 707;BA.debugLine="Fields.Initialize";
Debug.ShouldStop(4);
_fields.runVoidMethod ("Initialize");
 BA.debugLineNum = 708;BA.debugLine="Where.Initialize";
Debug.ShouldStop(8);
_where.runVoidMethod ("Initialize");
 BA.debugLineNum = 710;BA.debugLine="Fields.Put(\"fldShomareDaryaft\",lblShomareDary";
Debug.ShouldStop(32);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareDaryaft"))),(Object)((act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"))));
 BA.debugLineNum = 711;BA.debugLine="Fields.Put(\"fldShomareFactor\",ShomareFactor)";
Debug.ShouldStop(64);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareFactor"))),(Object)((act_mali._shomarefactor)));
 BA.debugLineNum = 712;BA.debugLine="Fields.Put(\"fldShomareHavale\",ShomareHavale)";
Debug.ShouldStop(128);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareHavale"))),(Object)((act_mali._shomarehavale)));
 BA.debugLineNum = 713;BA.debugLine="Fields.Put(\"FldMablaghTakhfif\",MablaghTakhfif";
Debug.ShouldStop(256);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldMablaghTakhfif"))),(Object)((act_mali._mablaghtakhfif)));
 BA.debugLineNum = 714;BA.debugLine="Fields.Put(\"fldCodeTafzili\",lblCodeMoshtari.T";
Debug.ShouldStop(512);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldCodeTafzili"))),(Object)((act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"))));
 BA.debugLineNum = 715;BA.debugLine="Fields.Put(\"fldSharheTafzili\",lblNameMoshtari";
Debug.ShouldStop(1024);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharheTafzili"))),(Object)((act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"getText"))));
 BA.debugLineNum = 716;BA.debugLine="Fields.Put(\"fldShomareTell\",ShomareTell)";
Debug.ShouldStop(2048);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareTell"))),(Object)((act_mali._shomaretell)));
 BA.debugLineNum = 717;BA.debugLine="Fields.Put(\"fldSharh\",sharh)";
Debug.ShouldStop(4096);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldSharh"))),(Object)((_sharh)));
 BA.debugLineNum = 718;BA.debugLine="Fields.Put(\"FldDarsadTakhfif\",darsad)";
Debug.ShouldStop(8192);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDarsadTakhfif"))),(Object)((_darsad)));
 BA.debugLineNum = 719;BA.debugLine="Fields.Put(\"FldDateDaryaft\",MCode.DatePersian";
Debug.ShouldStop(16384);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldDateDaryaft"))),(Object)((act_mali.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA))));
 BA.debugLineNum = 720;BA.debugLine="Fields.Put(\"FldSharhKol\",TxtSharhKol.Text)";
Debug.ShouldStop(32768);
_fields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FldSharhKol"))),(Object)((act_mali.mostCurrent._txtsharhkol.runMethod(true,"getText"))));
 BA.debugLineNum = 721;BA.debugLine="Where.Put(\"fldShomareDaryaft\",lblShomareDarya";
Debug.ShouldStop(65536);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareDaryaft"))),(Object)((act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"))));
 BA.debugLineNum = 722;BA.debugLine="Where.Put(\"fldShomareFactor\",lblShomareFactor";
Debug.ShouldStop(131072);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldShomareFactor"))),(Object)((act_mali.mostCurrent._lblshomarefactor.runMethod(true,"getText"))));
 BA.debugLineNum = 723;BA.debugLine="Where.Put(\"fldType\",\"3\")";
Debug.ShouldStop(262144);
_where.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fldType"))),(Object)((RemoteObject.createImmutable("3"))));
 BA.debugLineNum = 725;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblDaryaft\"";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ ),(Object)(BA.ObjectToString("TblDaryaft")),(Object)(_fields),(Object)(_where));
 BA.debugLineNum = 726;BA.debugLine="Log(\"Sucessful\")";
Debug.ShouldStop(2097152);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334199",RemoteObject.createImmutable("Sucessful"),0);
 BA.debugLineNum = 727;BA.debugLine="ToastMessageShow(\"دریافت تخفیف با موفقیت بروز";
Debug.ShouldStop(4194304);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت تخفیف با موفقیت بروزرسانی شد")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 728;BA.debugLine="status=\"OK\"";
Debug.ShouldStop(8388608);
_status = BA.ObjectToString("OK");Debug.locals.put("status", _status);
 };
 }else {
 BA.debugLineNum = 734;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
Debug.ShouldStop(536870912);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=3"));
 BA.debugLineNum = 735;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(1073741824);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 736;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 737;BA.debugLine="Query=\"Delete From TblDaryaft where fldShomar";
Debug.ShouldStop(1);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("Delete From TblDaryaft where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor,RemoteObject.createImmutable(" and fldType=3 "));
 BA.debugLineNum = 738;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
Debug.ShouldStop(2);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(act_mali.mostCurrent._query));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e225) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e225.toString()); BA.debugLineNum = 742;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(32);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334215",act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 743;BA.debugLine="err=4";
Debug.ShouldStop(64);
act_mali._err = BA.numberCast(int.class, 4);
 };
 BA.debugLineNum = 746;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 747;BA.debugLine="If status=\"OK\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_status,BA.ObjectToString("OK"))) { 
 BA.debugLineNum = 748;BA.debugLine="MCode.SQL1.TransactionSuccessful";
Debug.ShouldStop(2048);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 749;BA.debugLine="Btn_SendInfo_Click";
Debug.ShouldStop(4096);
_btn_sendinfo_click();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e234) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e234.toString()); BA.debugLineNum = 753;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(65536);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334226",act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 754;BA.debugLine="If err=1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_mali._err,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 755;BA.debugLine="ToastMessageShow(\"دریافت نقدی ناموفق بود\",Fals";
Debug.ShouldStop(262144);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت نقدی ناموفق بود")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 }else 
{ BA.debugLineNum = 756;BA.debugLine="else if err=2 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_mali._err,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 757;BA.debugLine="ToastMessageShow(\"دریافت بانکی ناموفق بود\",Fal";
Debug.ShouldStop(1048576);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت بانکی ناموفق بود")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 }else 
{ BA.debugLineNum = 758;BA.debugLine="else if err=3 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",act_mali._err,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 759;BA.debugLine="ToastMessageShow(\"دریافت چکی ناموفق بود\",False";
Debug.ShouldStop(4194304);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دریافت چکی ناموفق بود")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 }else 
{ BA.debugLineNum = 760;BA.debugLine="else if err=4 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",act_mali._err,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 761;BA.debugLine="ToastMessageShow(\"ثبت تخفیف ناموفق بود\",False)";
Debug.ShouldStop(16777216);
act_mali.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ثبت تخفیف ناموفق بود")),(Object)(act_mali.mostCurrent.__c.getField(true,"False")));
 }}}}
;
 };
 BA.debugLineNum = 766;BA.debugLine="MCode.SQL1.EndTransaction";
Debug.ShouldStop(536870912);
act_mali.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("EndTransaction");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e247) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e247.toString()); BA.debugLineNum = 768;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546334241",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 769;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnSaveD_Click"))));
 };
 BA.debugLineNum = 771;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearalltext() throws Exception{
try {
		Debug.PushSubsStack("clearAllText (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,410);
if (RapidSub.canDelegate("clearalltext")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","clearalltext");}
 BA.debugLineNum = 410;BA.debugLine="Sub clearAllText";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 411;BA.debugLine="TxtMablaghNaghdi.Text=0";
Debug.ShouldStop(67108864);
act_mali.mostCurrent._txtmablaghnaghdi.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 412;BA.debugLine="TxtSharhNaghdi.Text=\"\"";
Debug.ShouldStop(134217728);
act_mali.mostCurrent._txtsharhnaghdi.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 413;BA.debugLine="NSN_SandooghD.SelectedIndex=0";
Debug.ShouldStop(268435456);
act_mali.mostCurrent._nsn_sandooghd.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 415;BA.debugLine="TxtMablaghBanki.Text=0";
Debug.ShouldStop(1073741824);
act_mali.mostCurrent._txtmablaghbanki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 416;BA.debugLine="TxtSharhBanki.Text=\"\"";
Debug.ShouldStop(-2147483648);
act_mali.mostCurrent._txtsharhbanki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 417;BA.debugLine="NSN_BankD.SelectedIndex=0";
Debug.ShouldStop(1);
act_mali.mostCurrent._nsn_bankd.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 419;BA.debugLine="TxtMablaghChecki.Text=0";
Debug.ShouldStop(4);
act_mali.mostCurrent._txtmablaghchecki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 420;BA.debugLine="TxtSharhChecki.Text=\"\"";
Debug.ShouldStop(8);
act_mali.mostCurrent._txtsharhchecki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 422;BA.debugLine="TxtDarsadTakhfif.Text=0";
Debug.ShouldStop(32);
act_mali.mostCurrent._txtdarsadtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 423;BA.debugLine="TxtMablaghTakhfif.Text=0";
Debug.ShouldStop(64);
act_mali.mostCurrent._txtmablaghtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 424;BA.debugLine="TxtSharhTakhfif.Text=\"\"";
Debug.ShouldStop(128);
act_mali.mostCurrent._txtsharhtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 426;BA.debugLine="TxtSharhKol.Text=\"\"";
Debug.ShouldStop(512);
act_mali.mostCurrent._txtsharhkol.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsum() throws Exception{
try {
		Debug.PushSubsStack("GetSum (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,429);
if (RapidSub.canDelegate("getsum")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","getsum");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sum = RemoteObject.createImmutable("");
RemoteObject _sumtakhfif = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _mande = RemoteObject.createImmutable("");
 BA.debugLineNum = 429;BA.debugLine="Sub GetSum";
Debug.ShouldStop(4096);
 BA.debugLineNum = 430;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 431;BA.debugLine="Query=\"SELECT * from TblDaryaft where  fldShomar";
Debug.ShouldStop(16384);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where  fldShomareFactor="),act_mali._shomarefactor);
 BA.debugLineNum = 432;BA.debugLine="If ShomareFactor=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",act_mali._shomarefactor,BA.NumberToString(0))) { 
 BA.debugLineNum = 434;BA.debugLine="Query=\"SELECT * from TblDaryaft where  fldShoma";
Debug.ShouldStop(131072);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where  fldShomareFactor=0 and fldCodeTafzili='"),act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"),RemoteObject.createImmutable("'"));
 };
 BA.debugLineNum = 436;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(524288);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 438;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 440;BA.debugLine="Dim sum As String=0";
Debug.ShouldStop(8388608);
_sum = BA.NumberToString(0);Debug.locals.put("sum", _sum);Debug.locals.put("sum", _sum);
 BA.debugLineNum = 441;BA.debugLine="Dim sumTakhfif As String=0";
Debug.ShouldStop(16777216);
_sumtakhfif = BA.NumberToString(0);Debug.locals.put("sumTakhfif", _sumtakhfif);Debug.locals.put("sumTakhfif", _sumtakhfif);
 BA.debugLineNum = 442;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(33554432);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 443;BA.debugLine="cu.Position=i";
Debug.ShouldStop(67108864);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 444;BA.debugLine="If cu.GetString(\"fldType\")=0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldType"))),BA.NumberToString(0))) { 
 BA.debugLineNum = 445;BA.debugLine="sum=sum+cu.GetString(\"fldMablaghDaryafti\")";
Debug.ShouldStop(268435456);
_sum = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sum),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablaghDaryafti"))))}, "+",1, 0));Debug.locals.put("sum", _sum);
 }else 
{ BA.debugLineNum = 446;BA.debugLine="Else if cu.GetString(\"fldType\")=1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldType"))),BA.NumberToString(1))) { 
 BA.debugLineNum = 447;BA.debugLine="sum=sum+cu.GetString(\"fldMablaghDaryafti\")";
Debug.ShouldStop(1073741824);
_sum = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sum),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablaghDaryafti"))))}, "+",1, 0));Debug.locals.put("sum", _sum);
 }else 
{ BA.debugLineNum = 448;BA.debugLine="Else if cu.GetString(\"fldType\")=2 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldType"))),BA.NumberToString(2))) { 
 BA.debugLineNum = 449;BA.debugLine="sum=sum+cu.GetString(\"fldMablaghDaryafti\")";
Debug.ShouldStop(1);
_sum = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sum),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablaghDaryafti"))))}, "+",1, 0));Debug.locals.put("sum", _sum);
 }else 
{ BA.debugLineNum = 450;BA.debugLine="Else if cu.GetString(\"fldType\")=3 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldType"))),BA.NumberToString(3))) { 
 BA.debugLineNum = 451;BA.debugLine="MablaghTakhfif= cu.GetString(\"FldMablaghTakhf";
Debug.ShouldStop(4);
act_mali._mablaghtakhfif = BA.numberCast(long.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif"))));
 BA.debugLineNum = 452;BA.debugLine="sumTakhfif=sumTakhfif+MablaghTakhfif";
Debug.ShouldStop(8);
_sumtakhfif = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumtakhfif),act_mali._mablaghtakhfif}, "+",1, 0));Debug.locals.put("sumTakhfif", _sumtakhfif);
 }}}}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 456;BA.debugLine="LblMablaghKolTakhfif.Text=myCode.AdadToPrice(su";
Debug.ShouldStop(128);
act_mali.mostCurrent._lblmablaghkoltakhfif.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_sumtakhfif))));
 BA.debugLineNum = 457;BA.debugLine="MabalghGhablepardakht=MabalghKolFactor-sumTakhf";
Debug.ShouldStop(256);
act_mali._mabalghghablepardakht = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_mali._mabalghkolfactor),BA.numberCast(double.class, _sumtakhfif)}, "-",1, 0));
 BA.debugLineNum = 458;BA.debugLine="LblGHabelePardakht.Text=myCode.AdadToPrice(Maba";
Debug.ShouldStop(512);
act_mali.mostCurrent._lblghabelepardakht.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali._mabalghghablepardakht))));
 BA.debugLineNum = 459;BA.debugLine="lblMablaghKolDaryafti.Text=myCode.AdadToPrice(s";
Debug.ShouldStop(1024);
act_mali.mostCurrent._lblmablaghkoldaryafti.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_sum))));
 BA.debugLineNum = 460;BA.debugLine="If lblShomareFactor.Text=0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._lblshomarefactor.runMethod(true,"getText"),BA.NumberToString(0))) { 
 BA.debugLineNum = 461;BA.debugLine="lblMablaghMande.Text=myCode.AdadToPrice(Mabalg";
Debug.ShouldStop(4096);
act_mali.mostCurrent._lblmablaghmande.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali._mabalghghablepardakht))));
 }else {
 BA.debugLineNum = 463;BA.debugLine="Dim mande As String=MabalghGhablepardakht-sum";
Debug.ShouldStop(16384);
_mande = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_mali._mabalghghablepardakht),BA.numberCast(double.class, _sum)}, "-",1, 0));Debug.locals.put("mande", _mande);Debug.locals.put("mande", _mande);
 BA.debugLineNum = 464;BA.debugLine="lblMablaghMande.Text=myCode.AdadToPrice(mande)";
Debug.ShouldStop(32768);
act_mali.mostCurrent._lblmablaghmande.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_mande))));
 };
 }else {
 BA.debugLineNum = 467;BA.debugLine="LblGHabelePardakht.Text=0 &\" \"& MCode.VahedPool";
Debug.ShouldStop(262144);
act_mali.mostCurrent._lblghabelepardakht.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" "),act_mali.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 468;BA.debugLine="lblMablaghKolDaryafti.Text=0 &\" \"& MCode.VahedP";
Debug.ShouldStop(524288);
act_mali.mostCurrent._lblmablaghkoldaryafti.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" "),act_mali.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 469;BA.debugLine="LblMablaghKolTakhfif.Text=0 &\" \"& MCode.VahedPo";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._lblmablaghkoltakhfif.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(0),RemoteObject.createImmutable(" "),act_mali.mostCurrent._mcode._vahedpool /*RemoteObject*/ )));
 BA.debugLineNum = 470;BA.debugLine="lblMablaghMande.Text=myCode.AdadToPrice(Mabalgh";
Debug.ShouldStop(2097152);
act_mali.mostCurrent._lblmablaghmande.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali._mabalghghablepardakht))));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e40) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e40.toString()); BA.debugLineNum = 473;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546268460",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 474;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(33554432);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-GetSum"))));
 };
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Public IsSend As Boolean=False";
act_mali._issend = act_mali.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 21;BA.debugLine="Public NSN_BankD As Hitex_NiceSpinner";
act_mali.mostCurrent._nsn_bankd = RemoteObject.createNew ("hitex.nice.spinner.Hitex_NiceSpinner");
 //BA.debugLineNum = 22;BA.debugLine="Public NSN_SandooghD As Hitex_NiceSpinner";
act_mali.mostCurrent._nsn_sandooghd = RemoteObject.createNew ("hitex.nice.spinner.Hitex_NiceSpinner");
 //BA.debugLineNum = 24;BA.debugLine="Dim HLV As Hitex_LayoutView";
act_mali.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 25;BA.debugLine="Dim Key As IME";
act_mali.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 26;BA.debugLine="Dim err As Int=0";
act_mali._err = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 27;BA.debugLine="Dim DateCheck As String";
act_mali.mostCurrent._datecheck = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Private TxtShomareCheckD As EditText";
act_mali.mostCurrent._txtshomarecheckd = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private BtnDateCheckD As Button";
act_mali.mostCurrent._btndatecheckd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private BtnSaveD As Button";
act_mali.mostCurrent._btnsaved = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private txtchanged As Boolean=False";
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 32;BA.debugLine="Dim ListTarakonesh As List";
act_mali.mostCurrent._listtarakonesh = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 33;BA.debugLine="Private LblShomareCheckD As Label";
act_mali.mostCurrent._lblshomarecheckd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private LblDateCheckD As Label";
act_mali.mostCurrent._lbldatecheckd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private LblN_BankD As Label";
act_mali.mostCurrent._lbln_bankd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private pnlNDaryaft As Panel";
act_mali.mostCurrent._pnlndaryaft = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private pnl_Hlv As Panel";
act_mali.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lastMablag As String";
act_mali.mostCurrent._lastmablag = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Private lblDaryaft As Label";
act_mali.mostCurrent._lbldaryaft = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private pnlNSandoogh As Panel";
act_mali.mostCurrent._pnlnsandoogh = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private TxtMablaghNaghdi As EditText";
act_mali.mostCurrent._txtmablaghnaghdi = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private lblShomareDaryaft As Label";
act_mali.mostCurrent._lblshomaredaryaft = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private lblShomareFactor As Label";
act_mali.mostCurrent._lblshomarefactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private LblGHabelePardakht As Label";
act_mali.mostCurrent._lblghabelepardakht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private PnlNaghdi As Panel";
act_mali.mostCurrent._pnlnaghdi = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private PnlBanki As Panel";
act_mali.mostCurrent._pnlbanki = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private PnlChecki As Panel";
act_mali.mostCurrent._pnlchecki = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private TxtSharhNaghdi As EditText";
act_mali.mostCurrent._txtsharhnaghdi = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private LblSharhNaghdi As Label";
act_mali.mostCurrent._lblsharhnaghdi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private LblNSandoogh As Label";
act_mali.mostCurrent._lblnsandoogh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private LblMablaghNaghdi As Label";
act_mali.mostCurrent._lblmablaghnaghdi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private LblNBank As Label";
act_mali.mostCurrent._lblnbank = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private TxtSharhBanki As EditText";
act_mali.mostCurrent._txtsharhbanki = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private LblSharhBanki As Label";
act_mali.mostCurrent._lblsharhbanki = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private TxtMablaghChecki As EditText";
act_mali.mostCurrent._txtmablaghchecki = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private TxtSharhChecki As EditText";
act_mali.mostCurrent._txtsharhchecki = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private TxtDarsadTakhfif As EditText";
act_mali.mostCurrent._txtdarsadtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private TxtMablaghTakhfif As EditText";
act_mali.mostCurrent._txtmablaghtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private TxtSharhTakhfif As EditText";
act_mali.mostCurrent._txtsharhtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private LblSharhTakhfif As Label";
act_mali.mostCurrent._lblsharhtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private LblMablaghTakhfif As Label";
act_mali.mostCurrent._lblmablaghtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private LblDarsadTakhfif As Label";
act_mali.mostCurrent._lbldarsadtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private LblMablaghChecki As Label";
act_mali.mostCurrent._lblmablaghchecki = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private btnRizChecki As Panel";
act_mali.mostCurrent._btnrizchecki = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private LblSharhChecki As Label";
act_mali.mostCurrent._lblsharhchecki = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private TxtMablaghBanki As EditText";
act_mali.mostCurrent._txtmablaghbanki = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private PnlNBank As Panel";
act_mali.mostCurrent._pnlnbank = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Dim c1,c2,c3,c4 As Int";
act_mali._c1 = RemoteObject.createImmutable(0);
act_mali._c2 = RemoteObject.createImmutable(0);
act_mali._c3 = RemoteObject.createImmutable(0);
act_mali._c4 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 72;BA.debugLine="Dim MablaghDaryafti As Long";
act_mali._mablaghdaryafti = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 73;BA.debugLine="Dim MablaghTakhfif As Long";
act_mali._mablaghtakhfif = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 74;BA.debugLine="Dim Query,DaryaftMode As String";
act_mali.mostCurrent._query = RemoteObject.createImmutable("");
act_mali.mostCurrent._daryaftmode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 75;BA.debugLine="Dim ShomarhDaryafti,Radif As Int";
act_mali._shomarhdaryafti = RemoteObject.createImmutable(0);
act_mali._radif = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 76;BA.debugLine="Dim CountDaryaft,CountRadif As Int";
act_mali._countdaryaft = RemoteObject.createImmutable(0);
act_mali._countradif = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 77;BA.debugLine="Dim lstCodeSandogh As List";
act_mali.mostCurrent._lstcodesandogh = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 78;BA.debugLine="Dim CodeSandogh,NameSandogh As String";
act_mali.mostCurrent._codesandogh = RemoteObject.createImmutable("");
act_mali.mostCurrent._namesandogh = RemoteObject.createImmutable("");
 //BA.debugLineNum = 80;BA.debugLine="Dim lstCodeBank1 As List";
act_mali.mostCurrent._lstcodebank1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 81;BA.debugLine="Dim CodeBank1,NameBank1 As String";
act_mali.mostCurrent._codebank1 = RemoteObject.createImmutable("");
act_mali.mostCurrent._namebank1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 82;BA.debugLine="Private Tab1 As TabHost";
act_mali.mostCurrent._tab1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private PnlTakhfif As Panel";
act_mali.mostCurrent._pnltakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private lblMablaghKolDaryafti As Label";
act_mali.mostCurrent._lblmablaghkoldaryafti = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private lblMablaghMande As Label";
act_mali.mostCurrent._lblmablaghmande = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Dim id1,id2,id3,id4 As String=0";
act_mali.mostCurrent._id1 = RemoteObject.createImmutable("");
act_mali.mostCurrent._id2 = RemoteObject.createImmutable("");
act_mali.mostCurrent._id3 = RemoteObject.createImmutable("");
act_mali.mostCurrent._id4 = BA.NumberToString(0);
 //BA.debugLineNum = 89;BA.debugLine="Private lblCodeMoshtari As Label";
act_mali.mostCurrent._lblcodemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private lblNameMoshtari As Label";
act_mali.mostCurrent._lblnamemoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Dim lstCheck As List";
act_mali.mostCurrent._lstcheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 92;BA.debugLine="Private LblMablaghKolFactor As Label";
act_mali.mostCurrent._lblmablaghkolfactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private LblMablaghKolTakhfif As Label";
act_mali.mostCurrent._lblmablaghkoltakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private Btn_Delete As Button";
act_mali.mostCurrent._btn_delete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private Btn_SendInfo As Button";
act_mali.mostCurrent._btn_sendinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private Btn_print As Button";
act_mali.mostCurrent._btn_print = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private TxtSharhKol As EditText";
act_mali.mostCurrent._txtsharhkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 98;BA.debugLine="Private btnNew As Button";
act_mali.mostCurrent._btnnew = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 99;BA.debugLine="Private btnBackTrack As Button";
act_mali.mostCurrent._btnbacktrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private btnNextTrack As Button";
act_mali.mostCurrent._btnnexttrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 101;BA.debugLine="Dim ListDaryaft As List";
act_mali.mostCurrent._listdaryaft = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 102;BA.debugLine="Dim Current As Int=0";
act_mali._current = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 103;BA.debugLine="Dim isnew As Boolean";
act_mali._isnew = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 107;BA.debugLine="Private btnPaymentCard As Panel";
act_mali.mostCurrent._btnpaymentcard = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loaddaryaft(RemoteObject _strshomaredaryaft) throws Exception{
try {
		Debug.PushSubsStack("LoadDaryaft (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,238);
if (RapidSub.canDelegate("loaddaryaft")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","loaddaryaft", _strshomaredaryaft);}
RemoteObject _cukol = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _maxshomaredaryaft = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _sum = RemoteObject.createImmutable("");
Debug.locals.put("strShomareDaryaft", _strshomaredaryaft);
 BA.debugLineNum = 238;BA.debugLine="Sub LoadDaryaft(strShomareDaryaft As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 240;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
Debug.ShouldStop(32768);
act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 241;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
Debug.ShouldStop(65536);
act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 242;BA.debugLine="clearAllText";
Debug.ShouldStop(131072);
_clearalltext();
 BA.debugLineNum = 244;BA.debugLine="Dim cuKol As Cursor=MCode.Result(\"Select * from";
Debug.ShouldStop(524288);
_cukol = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cukol = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * from TblDaryaft")));Debug.locals.put("cuKol", _cukol);Debug.locals.put("cuKol", _cukol);
 BA.debugLineNum = 245;BA.debugLine="If cuKol.RowCount=0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cukol.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 246;BA.debugLine="lblShomareDaryaft.Text=1";
Debug.ShouldStop(2097152);
act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"setText",BA.ObjectToCharSequence(1));
 BA.debugLineNum = 247;BA.debugLine="Btn_Delete.Enabled=False";
Debug.ShouldStop(4194304);
act_mali.mostCurrent._btn_delete.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 248;BA.debugLine="Btn_SendInfo.Enabled=False";
Debug.ShouldStop(8388608);
act_mali.mostCurrent._btn_sendinfo.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 249;BA.debugLine="btnBackTrack.Enabled=False";
Debug.ShouldStop(16777216);
act_mali.mostCurrent._btnbacktrack.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 250;BA.debugLine="btnNextTrack.Enabled=False";
Debug.ShouldStop(33554432);
act_mali.mostCurrent._btnnexttrack.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 251;BA.debugLine="IsSend=False";
Debug.ShouldStop(67108864);
act_mali._issend = act_mali.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 252;BA.debugLine="GetSum";
Debug.ShouldStop(134217728);
_getsum();
 }else {
 BA.debugLineNum = 255;BA.debugLine="If strShomareDaryaft=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_strshomaredaryaft,BA.NumberToString(0))) { 
 BA.debugLineNum = 256;BA.debugLine="Dim MaxShomareDaryaft As Int=cuKol.RowCount'MC";
Debug.ShouldStop(-2147483648);
_maxshomaredaryaft = _cukol.runMethod(true,"getRowCount");Debug.locals.put("MaxShomareDaryaft", _maxshomaredaryaft);Debug.locals.put("MaxShomareDaryaft", _maxshomaredaryaft);
 BA.debugLineNum = 257;BA.debugLine="lblShomareDaryaft.Text=MaxShomareDaryaft+1";
Debug.ShouldStop(1);
act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {_maxshomaredaryaft,RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 258;BA.debugLine="Query=\"SELECT distinct  fldShomareDaryaft  fro";
Debug.ShouldStop(2);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT distinct  fldShomareDaryaft  from TblDaryaft where fldShomareFactor="),act_mali._shomarefactor);
 BA.debugLineNum = 259;BA.debugLine="If ShomareFactor=0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_mali._shomarefactor,BA.NumberToString(0))) { 
 BA.debugLineNum = 260;BA.debugLine="Query=\"SELECT distinct  fldShomareDaryaft  fr";
Debug.ShouldStop(8);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT distinct  fldShomareDaryaft  from TblDaryaft where fldShomareFactor=0 and fldCodeTafzili="),act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"));
 };
 BA.debugLineNum = 263;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(64);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 264;BA.debugLine="Current=cu.RowCount";
Debug.ShouldStop(128);
act_mali._current = _cu.runMethod(true,"getRowCount");
 BA.debugLineNum = 265;BA.debugLine="ListDaryaft.Clear";
Debug.ShouldStop(256);
act_mali.mostCurrent._listdaryaft.runVoidMethod ("Clear");
 BA.debugLineNum = 266;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(512);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 267;BA.debugLine="cu.Position=i";
Debug.ShouldStop(1024);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 268;BA.debugLine="ListDaryaft.Add(cu.GetString(\"fldShomareDarya";
Debug.ShouldStop(2048);
act_mali.mostCurrent._listdaryaft.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareDaryaft"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 272;BA.debugLine="Btn_Delete.Enabled=False";
Debug.ShouldStop(32768);
act_mali.mostCurrent._btn_delete.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 273;BA.debugLine="Btn_SendInfo.Enabled=False";
Debug.ShouldStop(65536);
act_mali.mostCurrent._btn_sendinfo.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 274;BA.debugLine="IsSend=False";
Debug.ShouldStop(131072);
act_mali._issend = act_mali.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 292;BA.debugLine="If Current=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_mali._current,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 293;BA.debugLine="btnBackTrack.Enabled=False";
Debug.ShouldStop(16);
act_mali.mostCurrent._btnbacktrack.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 296;BA.debugLine="btnBackTrack.Enabled=True";
Debug.ShouldStop(128);
act_mali.mostCurrent._btnbacktrack.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 299;BA.debugLine="If ListDaryaft.Size=Current Or ListDaryaft.Siz";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._listdaryaft.runMethod(true,"getSize"),BA.numberCast(double.class, act_mali._current)) || RemoteObject.solveBoolean("=",act_mali.mostCurrent._listdaryaft.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 300;BA.debugLine="btnNextTrack.Enabled=False";
Debug.ShouldStop(2048);
act_mali.mostCurrent._btnnexttrack.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 302;BA.debugLine="btnNextTrack.Enabled=True";
Debug.ShouldStop(8192);
act_mali.mostCurrent._btnnexttrack.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 305;BA.debugLine="clearAllText";
Debug.ShouldStop(65536);
_clearalltext();
 BA.debugLineNum = 306;BA.debugLine="GetSum";
Debug.ShouldStop(131072);
_getsum();
 }else {
 BA.debugLineNum = 308;BA.debugLine="clearAllText";
Debug.ShouldStop(524288);
_clearalltext();
 BA.debugLineNum = 317;BA.debugLine="If Current=0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_mali._current,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 318;BA.debugLine="btnBackTrack.Enabled=False";
Debug.ShouldStop(536870912);
act_mali.mostCurrent._btnbacktrack.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 321;BA.debugLine="btnBackTrack.Enabled=True";
Debug.ShouldStop(1);
act_mali.mostCurrent._btnbacktrack.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 324;BA.debugLine="If ListDaryaft.Size=Current Or ListDaryaft.Siz";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._listdaryaft.runMethod(true,"getSize"),BA.numberCast(double.class, act_mali._current)) || RemoteObject.solveBoolean("=",act_mali.mostCurrent._listdaryaft.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 325;BA.debugLine="btnNextTrack.Enabled=False";
Debug.ShouldStop(16);
act_mali.mostCurrent._btnnexttrack.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 327;BA.debugLine="btnNextTrack.Enabled=True";
Debug.ShouldStop(64);
act_mali.mostCurrent._btnnexttrack.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 330;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
Debug.ShouldStop(512);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),_strshomaredaryaft,RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor);
 BA.debugLineNum = 331;BA.debugLine="If ShomareFactor=0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_mali._shomarefactor,BA.NumberToString(0))) { 
 BA.debugLineNum = 332;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShom";
Debug.ShouldStop(2048);
act_mali.mostCurrent._query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * from TblDaryaft where fldShomareDaryaft="),_strshomaredaryaft,RemoteObject.createImmutable(" and fldShomareFactor=0 and fldCodeTafzili="),act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"getText"));
 };
 BA.debugLineNum = 335;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
Debug.ShouldStop(16384);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(act_mali.mostCurrent._query));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 336;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 338;BA.debugLine="Dim sum As String=0";
Debug.ShouldStop(131072);
_sum = BA.NumberToString(0);Debug.locals.put("sum", _sum);Debug.locals.put("sum", _sum);
 BA.debugLineNum = 339;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(262144);
{
final int step63 = 1;
final int limit63 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step63 > 0 && _i <= limit63) || (step63 < 0 && _i >= limit63) ;_i = ((int)(0 + _i + step63))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 340;BA.debugLine="cu.Position=i";
Debug.ShouldStop(524288);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 341;BA.debugLine="If cu.GetString(\"fldSend\")=\"1\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSend"))),BA.ObjectToString("1"))) { 
 BA.debugLineNum = 342;BA.debugLine="BtnSaveD.Enabled=False";
Debug.ShouldStop(2097152);
act_mali.mostCurrent._btnsaved.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 343;BA.debugLine="Btn_SendInfo.Enabled=False";
Debug.ShouldStop(4194304);
act_mali.mostCurrent._btn_sendinfo.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 344;BA.debugLine="Btn_Delete.Enabled=False";
Debug.ShouldStop(8388608);
act_mali.mostCurrent._btn_delete.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 345;BA.debugLine="IsSend=True";
Debug.ShouldStop(16777216);
act_mali._issend = act_mali.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 347;BA.debugLine="BtnSaveD.Enabled=True";
Debug.ShouldStop(67108864);
act_mali.mostCurrent._btnsaved.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 348;BA.debugLine="Btn_SendInfo.Enabled=True";
Debug.ShouldStop(134217728);
act_mali.mostCurrent._btn_sendinfo.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 349;BA.debugLine="Btn_Delete.Enabled=True";
Debug.ShouldStop(268435456);
act_mali.mostCurrent._btn_delete.runMethod(true,"setEnabled",act_mali.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 350;BA.debugLine="IsSend=False";
Debug.ShouldStop(536870912);
act_mali._issend = act_mali.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 354;BA.debugLine="lblShomareDaryaft.Text=strShomareDaryaft";
Debug.ShouldStop(2);
act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"setText",BA.ObjectToCharSequence(_strshomaredaryaft));
 BA.debugLineNum = 355;BA.debugLine="TxtSharhKol.Text=cu.GetString(\"fldSharhKol\")";
Debug.ShouldStop(4);
act_mali.mostCurrent._txtsharhkol.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharhKol")))));
 BA.debugLineNum = 356;BA.debugLine="If cu.GetString(\"fldType\")=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldType"))),BA.NumberToString(0))) { 
 BA.debugLineNum = 358;BA.debugLine="TxtMablaghNaghdi.Text=NumberFormat2(cu.GetS";
Debug.ShouldStop(32);
act_mali.mostCurrent._txtmablaghnaghdi.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablaghDaryafti"))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent.__c.getField(true,"True")))));
 BA.debugLineNum = 359;BA.debugLine="TxtSharhNaghdi.Text=cu.GetString(\"fldSharh\"";
Debug.ShouldStop(64);
act_mali.mostCurrent._txtsharhnaghdi.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh")))));
 BA.debugLineNum = 360;BA.debugLine="id1=cu.GetInt(\"ID\")";
Debug.ShouldStop(128);
act_mali.mostCurrent._id1 = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID"))));
 BA.debugLineNum = 362;BA.debugLine="CodeSandogh=cu.GetString(\"fldCodeSandoogh\")";
Debug.ShouldStop(512);
act_mali.mostCurrent._codesandogh = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeSandoogh")));
 BA.debugLineNum = 363;BA.debugLine="Log(lstCodeSandogh.IndexOf(CodeSandogh))";
Debug.ShouldStop(1024);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546137469",BA.NumberToString(act_mali.mostCurrent._lstcodesandogh.runMethod(true,"IndexOf",(Object)((act_mali.mostCurrent._codesandogh)))),0);
 BA.debugLineNum = 364;BA.debugLine="NSN_SandooghD.SelectedIndex=lstCodeSandogh.";
Debug.ShouldStop(2048);
act_mali.mostCurrent._nsn_sandooghd.runMethod(true,"setSelectedIndex",act_mali.mostCurrent._lstcodesandogh.runMethod(true,"IndexOf",(Object)((act_mali.mostCurrent._codesandogh))));
 }else 
{ BA.debugLineNum = 367;BA.debugLine="Else if cu.GetString(\"fldType\")=1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldType"))),BA.NumberToString(1))) { 
 BA.debugLineNum = 369;BA.debugLine="TxtMablaghBanki.Text=NumberFormat2(cu.GetSt";
Debug.ShouldStop(65536);
act_mali.mostCurrent._txtmablaghbanki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablaghDaryafti"))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent.__c.getField(true,"True")))));
 BA.debugLineNum = 370;BA.debugLine="TxtSharhBanki.Text=cu.GetString(\"fldSharh\")";
Debug.ShouldStop(131072);
act_mali.mostCurrent._txtsharhbanki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh")))));
 BA.debugLineNum = 371;BA.debugLine="id2=cu.GetInt(\"ID\")";
Debug.ShouldStop(262144);
act_mali.mostCurrent._id2 = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID"))));
 BA.debugLineNum = 373;BA.debugLine="CodeBank1= cu.GetString(\"fldCodeBank\")";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._codebank1 = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeBank")));
 BA.debugLineNum = 374;BA.debugLine="Log(lstCodeBank1.IndexOf(CodeBank1))";
Debug.ShouldStop(2097152);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546137480",BA.NumberToString(act_mali.mostCurrent._lstcodebank1.runMethod(true,"IndexOf",(Object)((act_mali.mostCurrent._codebank1)))),0);
 BA.debugLineNum = 375;BA.debugLine="NSN_BankD.SelectedIndex=lstCodeBank1.IndexO";
Debug.ShouldStop(4194304);
act_mali.mostCurrent._nsn_bankd.runMethod(true,"setSelectedIndex",act_mali.mostCurrent._lstcodebank1.runMethod(true,"IndexOf",(Object)((act_mali.mostCurrent._codebank1))));
 }else 
{ BA.debugLineNum = 377;BA.debugLine="Else if cu.GetString(\"fldType\")=2 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldType"))),BA.NumberToString(2))) { 
 BA.debugLineNum = 379;BA.debugLine="TxtMablaghChecki.Text=NumberFormat2(cu.GetS";
Debug.ShouldStop(67108864);
act_mali.mostCurrent._txtmablaghchecki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablaghDaryafti"))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent.__c.getField(true,"True")))));
 BA.debugLineNum = 380;BA.debugLine="TxtSharhChecki.Text=cu.GetString(\"fldSharh\"";
Debug.ShouldStop(134217728);
act_mali.mostCurrent._txtsharhchecki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh")))));
 BA.debugLineNum = 381;BA.debugLine="id3=cu.GetInt(\"ID\")";
Debug.ShouldStop(268435456);
act_mali.mostCurrent._id3 = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID"))));
 }else 
{ BA.debugLineNum = 384;BA.debugLine="Else if cu.GetString(\"fldType\")=3 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldType"))),BA.NumberToString(3))) { 
 BA.debugLineNum = 385;BA.debugLine="MablaghTakhfif= cu.GetString(\"FldMablaghTak";
Debug.ShouldStop(1);
act_mali._mablaghtakhfif = BA.numberCast(long.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif"))));
 BA.debugLineNum = 386;BA.debugLine="TxtMablaghTakhfif.Text=NumberFormat2(Mablag";
Debug.ShouldStop(2);
act_mali.mostCurrent._txtmablaghtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, act_mali._mablaghtakhfif)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent.__c.getField(true,"True")))));
 BA.debugLineNum = 388;BA.debugLine="TxtDarsadTakhfif.Text=myCode.Is_int(cu.GetS";
Debug.ShouldStop(8);
act_mali.mostCurrent._txtdarsadtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mycode.runMethod(true,"_is_int" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif")))))));
 BA.debugLineNum = 389;BA.debugLine="TxtSharhTakhfif.Text=cu.GetString(\"fldSharh";
Debug.ShouldStop(16);
act_mali.mostCurrent._txtsharhtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh")))));
 BA.debugLineNum = 391;BA.debugLine="id4=cu.GetInt(\"ID\")";
Debug.ShouldStop(64);
act_mali.mostCurrent._id4 = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID"))));
 }}}}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 398;BA.debugLine="GetSum";
Debug.ShouldStop(8192);
_getsum();
 };
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e109) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e109.toString()); BA.debugLineNum = 404;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546137510",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 405;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadDaryaft"))));
 };
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsp() throws Exception{
try {
		Debug.PushSubsStack("LoadSp (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,169);
if (RapidSub.canDelegate("loadsp")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","loadsp");}
RemoteObject _cr = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _cr1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 169;BA.debugLine="Sub LoadSp";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 171;BA.debugLine="Dim cr As Cursor=MCode.Result(\"Select * from Tbl";
Debug.ShouldStop(1024);
_cr = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cr = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * from TblSandoogh")));Debug.locals.put("cr", _cr);Debug.locals.put("cr", _cr);
 BA.debugLineNum = 172;BA.debugLine="lstCodeSandogh.Clear";
Debug.ShouldStop(2048);
act_mali.mostCurrent._lstcodesandogh.runVoidMethod ("Clear");
 BA.debugLineNum = 173;BA.debugLine="For i=0 To cr.RowCount-1";
Debug.ShouldStop(4096);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cr.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 174;BA.debugLine="cr.Position=i";
Debug.ShouldStop(8192);
_cr.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 175;BA.debugLine="NSN_SandooghD.Add(cr.GetString(\"fldNameSandoogh";
Debug.ShouldStop(16384);
act_mali.mostCurrent._nsn_sandooghd.runVoidMethod ("Add",(Object)(_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameSandoogh")))));
 BA.debugLineNum = 176;BA.debugLine="lstCodeSandogh.Add(cr.GetString(\"fldCodeSandoog";
Debug.ShouldStop(32768);
act_mali.mostCurrent._lstcodesandogh.runVoidMethod ("Add",(Object)((_cr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeSandoogh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 179;BA.debugLine="Dim cr1 As Cursor=MCode.Result(\"Select * from Tb";
Debug.ShouldStop(262144);
_cr1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cr1 = act_mali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * from TblBankMa")));Debug.locals.put("cr1", _cr1);Debug.locals.put("cr1", _cr1);
 BA.debugLineNum = 180;BA.debugLine="lstCodeBank1.Clear";
Debug.ShouldStop(524288);
act_mali.mostCurrent._lstcodebank1.runVoidMethod ("Clear");
 BA.debugLineNum = 181;BA.debugLine="For i=0 To cr1.RowCount-1";
Debug.ShouldStop(1048576);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_cr1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 182;BA.debugLine="cr1.Position=i";
Debug.ShouldStop(2097152);
_cr1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 183;BA.debugLine="NSN_BankD.Add(cr1.GetString(\"fldNameBank\"))";
Debug.ShouldStop(4194304);
act_mali.mostCurrent._nsn_bankd.runVoidMethod ("Add",(Object)(_cr1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameBank")))));
 BA.debugLineNum = 184;BA.debugLine="lstCodeBank1.Add(cr1.GetString(\"fldCodeBank\"))";
Debug.ShouldStop(8388608);
act_mali.mostCurrent._lstcodebank1.runVoidMethod ("Add",(Object)((_cr1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeBank"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 186;BA.debugLine="If MCode.PrinterType=1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",act_mali.mostCurrent._mcode._printertype /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 187;BA.debugLine="btnPaymentCard.Visible=True";
Debug.ShouldStop(67108864);
act_mali.mostCurrent._btnpaymentcard.runMethod(true,"setVisible",act_mali.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 191;BA.debugLine="NSN_SandooghD.Show(Colors.Black, 16)";
Debug.ShouldStop(1073741824);
act_mali.mostCurrent._nsn_sandooghd.runVoidMethod ("Show",(Object)(act_mali.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(float.class, 16)));
 BA.debugLineNum = 192;BA.debugLine="NSN_BankD.Show(Colors.Black, 16)";
Debug.ShouldStop(-2147483648);
act_mali.mostCurrent._nsn_bankd.runVoidMethod ("Show",(Object)(act_mali.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(float.class, 16)));
 BA.debugLineNum = 194;BA.debugLine="CodeSandogh=lstCodeSandogh.Get(0)";
Debug.ShouldStop(2);
act_mali.mostCurrent._codesandogh = BA.ObjectToString(act_mali.mostCurrent._lstcodesandogh.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 195;BA.debugLine="NameSandogh=NSN_SandooghD.Text";
Debug.ShouldStop(4);
act_mali.mostCurrent._namesandogh = act_mali.mostCurrent._nsn_sandooghd.runMethod(true,"getText");
 BA.debugLineNum = 196;BA.debugLine="Log(CodeSandogh)";
Debug.ShouldStop(8);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","545940763",act_mali.mostCurrent._codesandogh,0);
 BA.debugLineNum = 197;BA.debugLine="Log(NameSandogh)";
Debug.ShouldStop(16);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","545940764",act_mali.mostCurrent._namesandogh,0);
 BA.debugLineNum = 199;BA.debugLine="CodeBank1=lstCodeBank1.Get(0)";
Debug.ShouldStop(64);
act_mali.mostCurrent._codebank1 = BA.ObjectToString(act_mali.mostCurrent._lstcodebank1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 200;BA.debugLine="NameBank1=NSN_BankD.Text";
Debug.ShouldStop(128);
act_mali.mostCurrent._namebank1 = act_mali.mostCurrent._nsn_bankd.runMethod(true,"getText");
 BA.debugLineNum = 201;BA.debugLine="Log(CodeBank1)";
Debug.ShouldStop(256);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","545940768",act_mali.mostCurrent._codebank1,0);
 BA.debugLineNum = 202;BA.debugLine="Log(NameBank1)";
Debug.ShouldStop(512);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","545940769",act_mali.mostCurrent._namebank1,0);
 BA.debugLineNum = 206;BA.debugLine="btnNew_Click";
Debug.ShouldStop(8192);
_btnnew_click();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e31) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e31.toString()); BA.debugLineNum = 208;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","545940775",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 209;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(65536);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadSp"))));
 };
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
public static RemoteObject  _nsn_bankd_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NSN_BankD_ItemClick (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,225);
if (RapidSub.canDelegate("nsn_bankd_itemclick")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","nsn_bankd_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 225;BA.debugLine="Sub NSN_BankD_ItemClick (Position As Int, Value As";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 227;BA.debugLine="CodeBank1=lstCodeBank1.Get(Position)";
Debug.ShouldStop(4);
act_mali.mostCurrent._codebank1 = BA.ObjectToString(act_mali.mostCurrent._lstcodebank1.runMethod(false,"Get",(Object)(_position)));
 BA.debugLineNum = 228;BA.debugLine="NameBank1=Value";
Debug.ShouldStop(8);
act_mali.mostCurrent._namebank1 = BA.ObjectToString(_value);
 BA.debugLineNum = 229;BA.debugLine="Log(CodeBank1)";
Debug.ShouldStop(16);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546071812",act_mali.mostCurrent._codebank1,0);
 BA.debugLineNum = 230;BA.debugLine="Log(NameBank1)";
Debug.ShouldStop(32);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546071813",act_mali.mostCurrent._namebank1,0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e7.toString()); BA.debugLineNum = 232;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546071815",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 233;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(256);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NSN_BankD_ItemClick"))));
 };
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nsn_sandooghd_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NSN_SandooghD_ItemClick (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,213);
if (RapidSub.canDelegate("nsn_sandooghd_itemclick")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","nsn_sandooghd_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 213;BA.debugLine="Sub NSN_SandooghD_ItemClick (Position As Int, Valu";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 215;BA.debugLine="CodeSandogh=lstCodeSandogh.Get(Position)";
Debug.ShouldStop(4194304);
act_mali.mostCurrent._codesandogh = BA.ObjectToString(act_mali.mostCurrent._lstcodesandogh.runMethod(false,"Get",(Object)(_position)));
 BA.debugLineNum = 216;BA.debugLine="NameSandogh=Value";
Debug.ShouldStop(8388608);
act_mali.mostCurrent._namesandogh = BA.ObjectToString(_value);
 BA.debugLineNum = 217;BA.debugLine="Log(CodeSandogh)";
Debug.ShouldStop(16777216);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546006276",act_mali.mostCurrent._codesandogh,0);
 BA.debugLineNum = 218;BA.debugLine="Log(NameSandogh)";
Debug.ShouldStop(33554432);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546006277",act_mali.mostCurrent._namesandogh,0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e7.toString()); BA.debugLineNum = 220;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546006279",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 221;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(268435456);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NSN_SandooghD_ItemClick"))));
 };
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 8;BA.debugLine="Private ion As Object";
act_mali._ion = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 9;BA.debugLine="Public ShomareFactor As String";
act_mali._shomarefactor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Public CodeMoshtari As String";
act_mali._codemoshtari = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Public NameMoshtari As String";
act_mali._namemoshtari = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Public ShomareTell As String";
act_mali._shomaretell = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Public MabalghGhablepardakht As String";
act_mali._mabalghghablepardakht = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Public MabalghKolFactor As String";
act_mali._mabalghkolfactor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Public ShomareHavale As String";
act_mali._shomarehavale = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savecheck() throws Exception{
try {
		Debug.PushSubsStack("SaveCheck (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,794);
if (RapidSub.canDelegate("savecheck")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","savecheck");}
RemoteObject _mablagh = RemoteObject.createImmutable("");
 BA.debugLineNum = 794;BA.debugLine="Public Sub SaveCheck";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 795;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 796;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
Debug.ShouldStop(134217728);
act_mali.mostCurrent._lblcodemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 797;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
Debug.ShouldStop(268435456);
act_mali.mostCurrent._lblnamemoshtari.runMethod(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent._mcode._n_tafzili /*RemoteObject*/ ));
 BA.debugLineNum = 798;BA.debugLine="Dim mablagh As String=MCode.SingleResult(\"select";
Debug.ShouldStop(536870912);
_mablagh = BA.ObjectToString(act_mali.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select sum(fldMablagh) as fldMablagh from TblCheckDaryafti where fldShomareDaryaft="),act_mali.mostCurrent._lblshomaredaryaft.runMethod(true,"getText"),RemoteObject.createImmutable(" and fldShomareFactor="),act_mali._shomarefactor))));Debug.locals.put("mablagh", _mablagh);Debug.locals.put("mablagh", _mablagh);
 BA.debugLineNum = 799;BA.debugLine="If IsNumber(mablagh) Then";
Debug.ShouldStop(1073741824);
if (act_mali.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_mablagh)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 800;BA.debugLine="TxtMablaghChecki.Text= NumberFormat2(mablagh,0,";
Debug.ShouldStop(-2147483648);
act_mali.mostCurrent._txtmablaghchecki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _mablagh)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent.__c.getField(true,"True")))));
 }else {
 BA.debugLineNum = 802;BA.debugLine="TxtMablaghChecki.Text=0";
Debug.ShouldStop(2);
act_mali.mostCurrent._txtmablaghchecki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e11.toString()); BA.debugLineNum = 805;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546596107",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 806;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(32);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-SaveCheck"))));
 };
 BA.debugLineNum = 808;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtdarsadtakhfif_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtDarsadTakhfif_TextChanged (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,893);
if (RapidSub.canDelegate("txtdarsadtakhfif_textchanged")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","txtdarsadtakhfif_textchanged", _old, _new);}
RemoteObject _no = RemoteObject.createImmutable(0L);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 893;BA.debugLine="Private Sub TxtDarsadTakhfif_TextChanged (Old As S";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 894;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 895;BA.debugLine="Dim no As Long";
Debug.ShouldStop(1073741824);
_no = RemoteObject.createImmutable(0L);Debug.locals.put("no", _no);
 BA.debugLineNum = 896;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> M";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",act_mali.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_old)),act_mali.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_new)))) { 
 BA.debugLineNum = 897;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 899;BA.debugLine="no = TxtDarsadTakhfif.Text";
Debug.ShouldStop(4);
_no = BA.numberCast(long.class, act_mali.mostCurrent._txtdarsadtakhfif.runMethod(true,"getText"));Debug.locals.put("no", _no);
 BA.debugLineNum = 900;BA.debugLine="If no>100 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_no,BA.numberCast(long.class, 100))) { 
 BA.debugLineNum = 901;BA.debugLine="no=Old";
Debug.ShouldStop(16);
_no = BA.numberCast(long.class, _old);Debug.locals.put("no", _no);
 };
 BA.debugLineNum = 903;BA.debugLine="txtchanged=True";
Debug.ShouldStop(64);
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 905;BA.debugLine="Log(no)";
Debug.ShouldStop(256);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546923788",BA.NumberToString(_no),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e12.toString()); BA.debugLineNum = 907;BA.debugLine="no=0";
Debug.ShouldStop(1024);
_no = BA.numberCast(long.class, 0);Debug.locals.put("no", _no);
 BA.debugLineNum = 908;BA.debugLine="TxtDarsadTakhfif.Text=\"0\"";
Debug.ShouldStop(2048);
act_mali.mostCurrent._txtdarsadtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 };
 };
 BA.debugLineNum = 911;BA.debugLine="If txtchanged Then";
Debug.ShouldStop(16384);
if (act_mali._txtchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 912;BA.debugLine="txtchanged=False";
Debug.ShouldStop(32768);
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 913;BA.debugLine="TxtDarsadTakhfif.Tag=no";
Debug.ShouldStop(65536);
act_mali.mostCurrent._txtdarsadtakhfif.runMethod(false,"setTag",(_no));
 BA.debugLineNum = 914;BA.debugLine="TxtDarsadTakhfif.Text=no";
Debug.ShouldStop(131072);
act_mali.mostCurrent._txtdarsadtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_no));
 };
 BA.debugLineNum = 916;BA.debugLine="TxtDarsadTakhfif.SelectionStart=TxtDarsadTakhfif";
Debug.ShouldStop(524288);
act_mali.mostCurrent._txtdarsadtakhfif.runMethod(true,"setSelectionStart",act_mali.mostCurrent._txtdarsadtakhfif.runMethod(true,"getText").runMethod(true,"length"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e23.toString()); BA.debugLineNum = 918;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546923801",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 919;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4194304);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-TxtDarsadTakhfif_TextChanged"))));
 };
 BA.debugLineNum = 921;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtmablaghbanki_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtMablaghBanki_TextChanged (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,843);
if (RapidSub.canDelegate("txtmablaghbanki_textchanged")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","txtmablaghbanki_textchanged", _old, _new);}
RemoteObject _no = RemoteObject.createImmutable(0L);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 843;BA.debugLine="Private Sub TxtMablaghBanki_TextChanged (Old As St";
Debug.ShouldStop(1024);
 BA.debugLineNum = 844;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 845;BA.debugLine="Dim no As Long";
Debug.ShouldStop(4096);
_no = RemoteObject.createImmutable(0L);Debug.locals.put("no", _no);
 BA.debugLineNum = 846;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> M";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",act_mali.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_old)),act_mali.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_new)))) { 
 BA.debugLineNum = 847;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 848;BA.debugLine="no = TxtMablaghBanki.Text.Replace(\",\",\"\")";
Debug.ShouldStop(32768);
_no = BA.numberCast(long.class, act_mali.mostCurrent._txtmablaghbanki.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("no", _no);
 BA.debugLineNum = 849;BA.debugLine="txtchanged=True";
Debug.ShouldStop(65536);
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 850;BA.debugLine="Log(no)";
Debug.ShouldStop(131072);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546792711",BA.NumberToString(_no),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e9.toString()); BA.debugLineNum = 852;BA.debugLine="no=0";
Debug.ShouldStop(524288);
_no = BA.numberCast(long.class, 0);Debug.locals.put("no", _no);
 BA.debugLineNum = 853;BA.debugLine="TxtMablaghBanki.Text=\"0\"";
Debug.ShouldStop(1048576);
act_mali.mostCurrent._txtmablaghbanki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 };
 };
 BA.debugLineNum = 856;BA.debugLine="If txtchanged Then";
Debug.ShouldStop(8388608);
if (act_mali._txtchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 857;BA.debugLine="txtchanged=False";
Debug.ShouldStop(16777216);
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 858;BA.debugLine="TxtMablaghBanki.Tag=no";
Debug.ShouldStop(33554432);
act_mali.mostCurrent._txtmablaghbanki.runMethod(false,"setTag",(_no));
 BA.debugLineNum = 859;BA.debugLine="TxtMablaghBanki.Text=NumberFormat2(no,0,0,0,Tru";
Debug.ShouldStop(67108864);
act_mali.mostCurrent._txtmablaghbanki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _no)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent.__c.getField(true,"True")))));
 };
 BA.debugLineNum = 861;BA.debugLine="TxtMablaghBanki.SetSelection(TxtMablaghBanki.Tex";
Debug.ShouldStop(268435456);
act_mali.mostCurrent._txtmablaghbanki.runVoidMethod ("SetSelection",(Object)(act_mali.mostCurrent._txtmablaghbanki.runMethod(true,"getText").runMethod(true,"length")),(Object)(BA.numberCast(int.class, 0)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e20.toString()); BA.debugLineNum = 863;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546792724",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 864;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(-2147483648);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-TxtMablaghBanki_TextChanged"))));
 };
 BA.debugLineNum = 866;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtmablaghchecki_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtMablaghChecki_TextChanged (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,868);
if (RapidSub.canDelegate("txtmablaghchecki_textchanged")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","txtmablaghchecki_textchanged", _old, _new);}
RemoteObject _no = RemoteObject.createImmutable(0L);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 868;BA.debugLine="Private Sub TxtMablaghChecki_TextChanged (Old As S";
Debug.ShouldStop(8);
 BA.debugLineNum = 869;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 870;BA.debugLine="Dim no As Long";
Debug.ShouldStop(32);
_no = RemoteObject.createImmutable(0L);Debug.locals.put("no", _no);
 BA.debugLineNum = 871;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> M";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",act_mali.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_old)),act_mali.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_new)))) { 
 BA.debugLineNum = 872;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 873;BA.debugLine="no = TxtMablaghChecki.Text.Replace(\",\",\"\")";
Debug.ShouldStop(256);
_no = BA.numberCast(long.class, act_mali.mostCurrent._txtmablaghchecki.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("no", _no);
 BA.debugLineNum = 874;BA.debugLine="txtchanged=True";
Debug.ShouldStop(512);
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 875;BA.debugLine="Log(no)";
Debug.ShouldStop(1024);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546858247",BA.NumberToString(_no),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e9.toString()); BA.debugLineNum = 877;BA.debugLine="no=0";
Debug.ShouldStop(4096);
_no = BA.numberCast(long.class, 0);Debug.locals.put("no", _no);
 BA.debugLineNum = 878;BA.debugLine="TxtMablaghChecki.Text=\"0\"";
Debug.ShouldStop(8192);
act_mali.mostCurrent._txtmablaghchecki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 };
 };
 BA.debugLineNum = 881;BA.debugLine="If txtchanged Then";
Debug.ShouldStop(65536);
if (act_mali._txtchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 882;BA.debugLine="txtchanged=False";
Debug.ShouldStop(131072);
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 883;BA.debugLine="TxtMablaghChecki.Tag=no";
Debug.ShouldStop(262144);
act_mali.mostCurrent._txtmablaghchecki.runMethod(false,"setTag",(_no));
 BA.debugLineNum = 884;BA.debugLine="TxtMablaghChecki.Text=NumberFormat2(no,0,0,0,Tr";
Debug.ShouldStop(524288);
act_mali.mostCurrent._txtmablaghchecki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _no)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent.__c.getField(true,"True")))));
 };
 BA.debugLineNum = 886;BA.debugLine="TxtMablaghChecki.SetSelection(TxtMablaghChecki.T";
Debug.ShouldStop(2097152);
act_mali.mostCurrent._txtmablaghchecki.runVoidMethod ("SetSelection",(Object)(act_mali.mostCurrent._txtmablaghchecki.runMethod(true,"getText").runMethod(true,"length")),(Object)(BA.numberCast(int.class, 0)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e20.toString()); BA.debugLineNum = 888;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546858260",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 889;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(16777216);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-TxtMablaghChecki_TextChanged"))));
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
public static RemoteObject  _txtmablaghnaghdi_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtMablaghNaghdi_TextChanged (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,812);
if (RapidSub.canDelegate("txtmablaghnaghdi_textchanged")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","txtmablaghnaghdi_textchanged", _old, _new);}
RemoteObject _no = RemoteObject.createImmutable(0L);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 812;BA.debugLine="Sub TxtMablaghNaghdi_TextChanged (Old As String, N";
Debug.ShouldStop(2048);
 BA.debugLineNum = 813;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 814;BA.debugLine="Dim no As Long";
Debug.ShouldStop(8192);
_no = RemoteObject.createImmutable(0L);Debug.locals.put("no", _no);
 BA.debugLineNum = 815;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> M";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",act_mali.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_old)),act_mali.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_new)))) { 
 BA.debugLineNum = 816;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 817;BA.debugLine="no = TxtMablaghNaghdi.Text.Replace(\",\",\"\")";
Debug.ShouldStop(65536);
_no = BA.numberCast(long.class, act_mali.mostCurrent._txtmablaghnaghdi.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("no", _no);
 BA.debugLineNum = 818;BA.debugLine="txtchanged=True";
Debug.ShouldStop(131072);
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 819;BA.debugLine="Log(no)";
Debug.ShouldStop(262144);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546661639",BA.NumberToString(_no),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e9.toString()); BA.debugLineNum = 821;BA.debugLine="no=0";
Debug.ShouldStop(1048576);
_no = BA.numberCast(long.class, 0);Debug.locals.put("no", _no);
 BA.debugLineNum = 822;BA.debugLine="TxtMablaghNaghdi.Text=\"0\"";
Debug.ShouldStop(2097152);
act_mali.mostCurrent._txtmablaghnaghdi.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 };
 };
 BA.debugLineNum = 825;BA.debugLine="If txtchanged Then";
Debug.ShouldStop(16777216);
if (act_mali._txtchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 826;BA.debugLine="txtchanged=False";
Debug.ShouldStop(33554432);
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 827;BA.debugLine="TxtMablaghNaghdi.Tag=no";
Debug.ShouldStop(67108864);
act_mali.mostCurrent._txtmablaghnaghdi.runMethod(false,"setTag",(_no));
 BA.debugLineNum = 828;BA.debugLine="TxtMablaghNaghdi.Text=NumberFormat2(no,0,0,0,Tr";
Debug.ShouldStop(134217728);
act_mali.mostCurrent._txtmablaghnaghdi.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _no)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent.__c.getField(true,"True")))));
 };
 BA.debugLineNum = 830;BA.debugLine="TxtMablaghNaghdi.SetSelection(TxtMablaghNaghdi.T";
Debug.ShouldStop(536870912);
act_mali.mostCurrent._txtmablaghnaghdi.runVoidMethod ("SetSelection",(Object)(act_mali.mostCurrent._txtmablaghnaghdi.runMethod(true,"getText").runMethod(true,"length")),(Object)(BA.numberCast(int.class, 0)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e20.toString()); BA.debugLineNum = 832;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546661652",BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 833;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1);
act_mali.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_mali.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_mali.mostCurrent.__c.runMethod(false,"LastException",act_mali.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_mali.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-TxtMablaghNaghdi_TextChanged"))));
 };
 BA.debugLineNum = 835;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtmablaghtakhfif_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtMablaghTakhfif_TextChanged (act_mali) ","act_mali",22,act_mali.mostCurrent.activityBA,act_mali.mostCurrent,923);
if (RapidSub.canDelegate("txtmablaghtakhfif_textchanged")) { return ir.parsikhesab.pakhsh.act_mali.remoteMe.runUserSub(false, "act_mali","txtmablaghtakhfif_textchanged", _old, _new);}
RemoteObject _no = RemoteObject.createImmutable(0L);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 923;BA.debugLine="Private Sub TxtMablaghTakhfif_TextChanged (Old As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 924;BA.debugLine="Dim no As Long";
Debug.ShouldStop(134217728);
_no = RemoteObject.createImmutable(0L);Debug.locals.put("no", _no);
 BA.debugLineNum = 925;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> MC";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",act_mali.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_old)),act_mali.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_mali.mostCurrent.activityBA,(Object)(_new)))) { 
 BA.debugLineNum = 926;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 927;BA.debugLine="no = TxtMablaghTakhfif.Text.Replace(\",\",\"\")";
Debug.ShouldStop(1073741824);
_no = BA.numberCast(long.class, act_mali.mostCurrent._txtmablaghtakhfif.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("no", _no);
 BA.debugLineNum = 928;BA.debugLine="txtchanged=True";
Debug.ShouldStop(-2147483648);
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 929;BA.debugLine="Log(no)";
Debug.ShouldStop(1);
act_mali.mostCurrent.__c.runVoidMethod ("LogImpl","546989318",BA.NumberToString(_no),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_mali.processBA, e8.toString()); BA.debugLineNum = 931;BA.debugLine="no=0";
Debug.ShouldStop(4);
_no = BA.numberCast(long.class, 0);Debug.locals.put("no", _no);
 BA.debugLineNum = 932;BA.debugLine="TxtMablaghTakhfif.Text=\"0\"";
Debug.ShouldStop(8);
act_mali.mostCurrent._txtmablaghtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 };
 };
 BA.debugLineNum = 935;BA.debugLine="If txtchanged Then";
Debug.ShouldStop(64);
if (act_mali._txtchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 936;BA.debugLine="txtchanged=False";
Debug.ShouldStop(128);
act_mali._txtchanged = act_mali.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 937;BA.debugLine="TxtMablaghTakhfif.Tag=no";
Debug.ShouldStop(256);
act_mali.mostCurrent._txtmablaghtakhfif.runMethod(false,"setTag",(_no));
 BA.debugLineNum = 938;BA.debugLine="TxtMablaghTakhfif.Text=NumberFormat2(no,0,0,0,Tr";
Debug.ShouldStop(512);
act_mali.mostCurrent._txtmablaghtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_mali.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _no)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_mali.mostCurrent.__c.getField(true,"True")))));
 };
 BA.debugLineNum = 940;BA.debugLine="TxtMablaghTakhfif.SetSelection(TxtMablaghTakhfif.";
Debug.ShouldStop(2048);
act_mali.mostCurrent._txtmablaghtakhfif.runVoidMethod ("SetSelection",(Object)(act_mali.mostCurrent._txtmablaghtakhfif.runMethod(true,"getText").runMethod(true,"length")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 941;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}