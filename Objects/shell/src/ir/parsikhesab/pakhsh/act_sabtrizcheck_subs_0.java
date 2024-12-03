package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_sabtrizcheck_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","activity_create", _firsttime);}
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"l_SabtRizCheck\")";
Debug.ShouldStop(128);
act_sabtrizcheck.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_SabtRizCheck")),act_sabtrizcheck.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="lblShomareDaryaft.Text=ShomareDaryafti";
Debug.ShouldStop(256);
act_sabtrizcheck.mostCurrent._lblshomaredaryaft.runMethod(true,"setText",BA.ObjectToCharSequence(act_sabtrizcheck._shomaredaryafti));
 BA.debugLineNum = 42;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(512);
act_sabtrizcheck.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 43;BA.debugLine="Key.SetCustomFilter(txtShomareCheck,txtShomareChe";
Debug.ShouldStop(1024);
act_sabtrizcheck.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_sabtrizcheck.mostCurrent._txtshomarecheck.getObject())),(Object)(act_sabtrizcheck.mostCurrent._txtshomarecheck.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 44;BA.debugLine="Key.SetCustomFilter(txtShomareHesab,txtShomareHes";
Debug.ShouldStop(2048);
act_sabtrizcheck.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_sabtrizcheck.mostCurrent._txtshomarehesab.getObject())),(Object)(act_sabtrizcheck.mostCurrent._txtshomarehesab.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 45;BA.debugLine="Key.SetCustomFilter(txtMablagh,txtMablagh.INPUT_T";
Debug.ShouldStop(4096);
act_sabtrizcheck.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_sabtrizcheck.mostCurrent._txtmablagh.getObject())),(Object)(act_sabtrizcheck.mostCurrent._txtmablagh.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 46;BA.debugLine="NSN_BankD.Initialize(\"NSN_BankD\",True,False)";
Debug.ShouldStop(8192);
act_sabtrizcheck.mostCurrent._nsn_bankd.runVoidMethod ("Initialize",act_sabtrizcheck.mostCurrent.activityBA,(Object)(BA.ObjectToString("NSN_BankD")),(Object)(act_sabtrizcheck.mostCurrent.__c.getField(true,"True")),(Object)(act_sabtrizcheck.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 47;BA.debugLine="PnlNBank.AddView(NSN_BankD,0,0,PnlNBank.Width,Pnl";
Debug.ShouldStop(16384);
act_sabtrizcheck.mostCurrent._pnlnbank.runVoidMethod ("AddView",(Object)((act_sabtrizcheck.mostCurrent._nsn_bankd.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_sabtrizcheck.mostCurrent._pnlnbank.runMethod(true,"getWidth")),(Object)(act_sabtrizcheck.mostCurrent._pnlnbank.runMethod(true,"getHeight")));
 BA.debugLineNum = 48;BA.debugLine="NSN_BankD.TextColor = Colors.RGB(192,53,38)";
Debug.ShouldStop(32768);
act_sabtrizcheck.mostCurrent._nsn_bankd.runMethod(true,"setTextColor",act_sabtrizcheck.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 192)),(Object)(BA.numberCast(int.class, 53)),(Object)(BA.numberCast(int.class, 38))));
 BA.debugLineNum = 49;BA.debugLine="NSN_BankD.Gravity = Gravity.CENTER";
Debug.ShouldStop(65536);
act_sabtrizcheck.mostCurrent._nsn_bankd.runMethod(true,"setGravity",act_sabtrizcheck.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 50;BA.debugLine="NSN_BankD.Typeface = Typeface.LoadFromAssets(\"p_f";
Debug.ShouldStop(131072);
act_sabtrizcheck.mostCurrent._nsn_bankd.runMethod(false,"setTypeface",act_sabtrizcheck.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 51;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(262144);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 52;BA.debugLine="op.Initialize2(Colors.White,5dip,0dip,Colors.Blac";
Debug.ShouldStop(524288);
_op.runVoidMethod ("Initialize2",(Object)(act_sabtrizcheck.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_sabtrizcheck.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(act_sabtrizcheck.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(act_sabtrizcheck.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 53;BA.debugLine="NSN_BankD.Background=op";
Debug.ShouldStop(1048576);
act_sabtrizcheck.mostCurrent._nsn_bankd.runMethod(false,"setBackground",(_op.getObject()));
 BA.debugLineNum = 54;BA.debugLine="lstCodeBank1.Initialize";
Debug.ShouldStop(2097152);
act_sabtrizcheck.mostCurrent._lstcodebank1.runVoidMethod ("Initialize");
 BA.debugLineNum = 55;BA.debugLine="lstCheck.Initialize";
Debug.ShouldStop(4194304);
act_sabtrizcheck._lstcheck.runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="OriginallstCheck.Initialize";
Debug.ShouldStop(8388608);
act_sabtrizcheck.mostCurrent._originallstcheck.runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="LoadBank";
Debug.ShouldStop(16777216);
_loadbank();
 BA.debugLineNum = 59;BA.debugLine="NSN_BankD.Show(Colors.Black, 16)";
Debug.ShouldStop(67108864);
act_sabtrizcheck.mostCurrent._nsn_bankd.runVoidMethod ("Show",(Object)(act_sabtrizcheck.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(float.class, 16)));
 BA.debugLineNum = 61;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(268435456);
act_sabtrizcheck.mostCurrent._hlv.runMethod(false,"Initializer",act_sabtrizcheck.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 62;BA.debugLine="pnl_Hlv.AddView(HLV,0,0,pnl_Hlv.Width,pnl_Hlv.Hei";
Debug.ShouldStop(536870912);
act_sabtrizcheck.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_sabtrizcheck.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_sabtrizcheck.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_sabtrizcheck.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 63;BA.debugLine="HLV.Show";
Debug.ShouldStop(1073741824);
act_sabtrizcheck.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 65;BA.debugLine="If issend Then";
Debug.ShouldStop(1);
if (act_sabtrizcheck._issend.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 66;BA.debugLine="BtnSave.Enabled=False";
Debug.ShouldStop(2);
act_sabtrizcheck.mostCurrent._btnsave.runMethod(true,"setEnabled",act_sabtrizcheck.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 68;BA.debugLine="BtnSave.Enabled=True";
Debug.ShouldStop(8);
act_sabtrizcheck.mostCurrent._btnsave.runMethod(true,"setEnabled",act_sabtrizcheck.mostCurrent.__c.getField(true,"True"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e30) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabtrizcheck.processBA, e30.toString()); BA.debugLineNum = 71;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576087330",BA.ObjectToString(act_sabtrizcheck.mostCurrent.__c.runMethod(false,"LastException",act_sabtrizcheck.mostCurrent.activityBA)),0);
 BA.debugLineNum = 72;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(128);
act_sabtrizcheck.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabtrizcheck.mostCurrent.__c.runMethod(false,"LastException",act_sabtrizcheck.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabtrizcheck.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,371);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 371;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 372;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_sabtrizcheck.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 373;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(1048576);
act_sabtrizcheck.mostCurrent._key.runVoidMethod ("HideKeyboard",act_sabtrizcheck.mostCurrent.activityBA);
 BA.debugLineNum = 374;BA.debugLine="btn_Back_Click";
Debug.ShouldStop(2097152);
_btn_back_click();
 };
 BA.debugLineNum = 376;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return act_sabtrizcheck.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,300);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 300;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,291);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","activity_resume");}
 BA.debugLineNum = 291;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 292;BA.debugLine="LoadCheck";
Debug.ShouldStop(8);
_loadcheck();
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
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,379);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 379;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 381;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return act_sabtrizcheck.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 382;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("btn_Back_Click (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,247);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","btn_back_click");}
 BA.debugLineNum = 247;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
act_sabtrizcheck.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 249;BA.debugLine="CallSubDelayed(Act_Mali,\"SaveCheck\")";
Debug.ShouldStop(16777216);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("CallSubDelayed",act_sabtrizcheck.processBA,(Object)((act_sabtrizcheck.mostCurrent._act_mali.getObject())),(Object)(RemoteObject.createImmutable("SaveCheck")));
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndatesarresid_click() throws Exception{
try {
		Debug.PushSubsStack("BtnDateSarResid_Click (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,252);
if (RapidSub.canDelegate("btndatesarresid_click")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","btndatesarresid_click");}
RemoteObject _p = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 252;BA.debugLine="Private Sub BtnDateSarResid_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 253;BA.debugLine="Dim p As PersianMaterialDatePicker";
Debug.ShouldStop(268435456);
_p = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 254;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("Initialize",act_sabtrizcheck.mostCurrent.activityBA,(Object)(BA.ObjectToString("p")),(Object)(_p.runMethod(true,"getPersianYear")),(Object)(_p.runMethod(true,"getPersianMonth")),(Object)(_p.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 255;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(1073741824);
_p.runMethod(true,"setAccentColor",act_sabtrizcheck.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 256;BA.debugLine="p.OkText = \"تایید\"";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 257;BA.debugLine="p.CancelText = \"لغو\"";
Debug.ShouldStop(1);
_p.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 258;BA.debugLine="p.Title = \"از تاریخ\"";
Debug.ShouldStop(2);
_p.runVoidMethod ("setTitle",BA.ObjectToString("از تاریخ"));
 BA.debugLineNum = 259;BA.debugLine="p.Typeface = \"iransansmonospacednum.ttf\"";
Debug.ShouldStop(4);
_p.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmonospacednum.ttf"));
 BA.debugLineNum = 260;BA.debugLine="p.Show(\"p\")";
Debug.ShouldStop(8);
_p.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p")));
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
public static RemoteObject  _btnsave_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSave_Click (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,155);
if (RapidSub.canDelegate("btnsave_click")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","btnsave_click");}
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti");
 BA.debugLineNum = 155;BA.debugLine="Private Sub BtnSave_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 157;BA.debugLine="If txtShomareCheck.Text=\"0\" Or txtShomareCheck.Te";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(true,"getText"),BA.ObjectToString("0")) || RemoteObject.solveBoolean("=",act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 158;BA.debugLine="ToastMessageShow(\"لطفا شماره چک را وارد نمایید\",";
Debug.ShouldStop(536870912);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا شماره چک را وارد نمایید")),(Object)(act_sabtrizcheck.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 159;BA.debugLine="txtShomareCheck.SelectionStart=0";
Debug.ShouldStop(1073741824);
act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(true,"setSelectionStart",BA.numberCast(int.class, 0));
 BA.debugLineNum = 160;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 162;BA.debugLine="If txtShomareCheck.Text.Length<5 Or txtShomareC";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 5)) || RemoteObject.solveBoolean(">",act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 20))) { 
 BA.debugLineNum = 163;BA.debugLine="ToastMessageShow(\"تعداد کاراکتر شماره چک نا مع";
Debug.ShouldStop(4);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تعداد کاراکتر شماره چک نا معتبر می باشد")),(Object)(act_sabtrizcheck.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 164;BA.debugLine="Return";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 168;BA.debugLine="If txtShomareHesab.Text=\"0\" Or txtShomareHesab.Te";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(true,"getText"),BA.ObjectToString("0")) || RemoteObject.solveBoolean("=",act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 169;BA.debugLine="ToastMessageShow(\"لطفا شماره حساب را وارد نمایید";
Debug.ShouldStop(256);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا شماره حساب را وارد نمایید")),(Object)(act_sabtrizcheck.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 170;BA.debugLine="txtShomareHesab.SelectionStart=0";
Debug.ShouldStop(512);
act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(true,"setSelectionStart",BA.numberCast(int.class, 0));
 BA.debugLineNum = 171;BA.debugLine="Return";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 173;BA.debugLine="If txtShomareHesab.Text.Length<5 Or txtShomareH";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 5)) || RemoteObject.solveBoolean(">",act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 20))) { 
 BA.debugLineNum = 174;BA.debugLine="ToastMessageShow(\"تعداد کاراکتر شماره حساب نا";
Debug.ShouldStop(8192);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تعداد کاراکتر شماره حساب نا معتبر می باشد")),(Object)(act_sabtrizcheck.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 175;BA.debugLine="Return";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 178;BA.debugLine="If txtMablagh.Text=\"0\" Or txtMablagh.Text=\"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_sabtrizcheck.mostCurrent._txtmablagh.runMethod(true,"getText"),BA.ObjectToString("0")) || RemoteObject.solveBoolean("=",act_sabtrizcheck.mostCurrent._txtmablagh.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 179;BA.debugLine="ToastMessageShow(\"لطفا مبلغ را وارد نمایید\",Fals";
Debug.ShouldStop(262144);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا مبلغ را وارد نمایید")),(Object)(act_sabtrizcheck.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 180;BA.debugLine="txtMablagh.SelectionStart=0";
Debug.ShouldStop(524288);
act_sabtrizcheck.mostCurrent._txtmablagh.runMethod(true,"setSelectionStart",BA.numberCast(int.class, 0));
 BA.debugLineNum = 181;BA.debugLine="Return";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 183;BA.debugLine="If BtnDateSarResid.Text=\"تعیین تاریخ\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",act_sabtrizcheck.mostCurrent._btndatesarresid.runMethod(true,"getText"),BA.ObjectToString("تعیین تاریخ"))) { 
 BA.debugLineNum = 184;BA.debugLine="ToastMessageShow(\"لطفا تاریخ سررسید را وارد نمای";
Debug.ShouldStop(8388608);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا تاریخ سررسید را وارد نمایید")),(Object)(act_sabtrizcheck.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 185;BA.debugLine="BtnDateSarResid.RequestFocus";
Debug.ShouldStop(16777216);
act_sabtrizcheck.mostCurrent._btndatesarresid.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 186;BA.debugLine="Return";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 194;BA.debugLine="NameBank1=NSN_BankD.Text";
Debug.ShouldStop(2);
act_sabtrizcheck.mostCurrent._namebank1 = act_sabtrizcheck.mostCurrent._nsn_bankd.runMethod(true,"getText");
 BA.debugLineNum = 195;BA.debugLine="Log(CodeBank1)";
Debug.ShouldStop(4);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576480552",act_sabtrizcheck.mostCurrent._codebank1,0);
 BA.debugLineNum = 196;BA.debugLine="Log(NameBank1)";
Debug.ShouldStop(8);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576480553",act_sabtrizcheck.mostCurrent._namebank1,0);
 BA.debugLineNum = 198;BA.debugLine="Dim date As String=MCode.ConvertNumbersPersian2En";
Debug.ShouldStop(32);
_date = act_sabtrizcheck.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(act_sabtrizcheck.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA)));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 199;BA.debugLine="Dim item As AdapterListCheckDaryafti";
Debug.ShouldStop(64);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti");Debug.locals.put("item", _item);
 BA.debugLineNum = 200;BA.debugLine="item.Initialize";
Debug.ShouldStop(128);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 201;BA.debugLine="item.fldShomareCheck=txtShomareCheck.Text";
Debug.ShouldStop(256);
_item.setField ("fldShomareCheck" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(true,"getText"));
 BA.debugLineNum = 203;BA.debugLine="item.fldShomareHesab=txtShomareHesab.Text";
Debug.ShouldStop(1024);
_item.setField ("fldShomareHesab" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(true,"getText"));
 BA.debugLineNum = 204;BA.debugLine="item.fldShomareDaryaft=ShomareDaryafti";
Debug.ShouldStop(2048);
_item.setField ("fldShomareDaryaft" /*RemoteObject*/ ,act_sabtrizcheck._shomaredaryafti);
 BA.debugLineNum = 205;BA.debugLine="item.fldMablagh=txtMablagh.Text.Replace(\",\",\"\")";
Debug.ShouldStop(4096);
_item.setField ("fldMablagh" /*RemoteObject*/ ,BA.numberCast(int.class, act_sabtrizcheck.mostCurrent._txtmablagh.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 206;BA.debugLine="item.fldShobe=txtShobe.Text";
Debug.ShouldStop(8192);
_item.setField ("fldShobe" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent._txtshobe.runMethod(true,"getText"));
 BA.debugLineNum = 207;BA.debugLine="item.fldSharh=TxtSharh.Text";
Debug.ShouldStop(16384);
_item.setField ("fldSharh" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent._txtsharh.runMethod(true,"getText"));
 BA.debugLineNum = 208;BA.debugLine="item.fldDate=date";
Debug.ShouldStop(32768);
_item.setField ("fldDate" /*RemoteObject*/ ,_date);
 BA.debugLineNum = 209;BA.debugLine="item.fldDateSarResid=DateCheck";
Debug.ShouldStop(65536);
_item.setField ("fldDateSarResid" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent._datecheck);
 BA.debugLineNum = 210;BA.debugLine="item.fldCodeBank=CodeBank1";
Debug.ShouldStop(131072);
_item.setField ("fldCodeBank" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent._codebank1);
 BA.debugLineNum = 211;BA.debugLine="item.fldNameBank=NameBank1";
Debug.ShouldStop(262144);
_item.setField ("fldNameBank" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent._namebank1);
 BA.debugLineNum = 212;BA.debugLine="item.fldCodeSahebeCheck=CodeMoshtari";
Debug.ShouldStop(524288);
_item.setField ("fldCodeSahebeCheck" /*RemoteObject*/ ,act_sabtrizcheck._codemoshtari);
 BA.debugLineNum = 213;BA.debugLine="item.fldNameSahebeCheck=NameMoshtari";
Debug.ShouldStop(1048576);
_item.setField ("fldNameSahebeCheck" /*RemoteObject*/ ,act_sabtrizcheck._namemoshtari);
 BA.debugLineNum = 214;BA.debugLine="item.fldShomareFactor=ShomareFactor";
Debug.ShouldStop(2097152);
_item.setField ("fldShomareFactor" /*RemoteObject*/ ,act_sabtrizcheck._shomarefactor);
 BA.debugLineNum = 216;BA.debugLine="MCode.SaveUpdate(\"insert into TblCheckDaryafti(f";
Debug.ShouldStop(8388608);
act_sabtrizcheck.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("insert into TblCheckDaryafti(fldShomareCheck,fldShomareHesab,fldShomareDaryaft,fldMablagh,fldShobe,fldSharh,fldDate,fldDateSarResid,fldCodeBank,fldNameBank,fldCodeSahebeCheck,fldNameSahebeCheck,fldShomareFactor,fldCodeVaste) values('"),act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(true,"getText"),RemoteObject.createImmutable("','"),act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(true,"getText"),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),act_sabtrizcheck._shomaredaryafti,RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),act_sabtrizcheck.mostCurrent._txtmablagh.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),act_sabtrizcheck.mostCurrent._txtshobe.runMethod(true,"getText"),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),act_sabtrizcheck.mostCurrent._txtsharh.runMethod(true,"getText"),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),_date,RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),act_sabtrizcheck.mostCurrent._datecheck,RemoteObject.createImmutable(""),RemoteObject.createImmutable("',"),act_sabtrizcheck.mostCurrent._codebank1,RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'"),act_sabtrizcheck.mostCurrent._namebank1,RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),act_sabtrizcheck._codemoshtari,RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),act_sabtrizcheck._namemoshtari,RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),act_sabtrizcheck._shomarefactor,RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'"),act_sabtrizcheck.mostCurrent._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("'"),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 231;BA.debugLine="SumMablaghCheck=SumMablaghCheck+item.fldMablagh";
Debug.ShouldStop(64);
act_sabtrizcheck._summablaghcheck = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_sabtrizcheck._summablaghcheck),_item.getField(true,"fldMablagh" /*RemoteObject*/ )}, "+",1, 0));
 BA.debugLineNum = 232;BA.debugLine="lstCheck.Add(item)";
Debug.ShouldStop(128);
act_sabtrizcheck._lstcheck.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 234;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(512);
act_sabtrizcheck.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 235;BA.debugLine="txtShomareCheck.Text=\"\"";
Debug.ShouldStop(1024);
act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 236;BA.debugLine="txtShomareHesab.Text=\"\"";
Debug.ShouldStop(2048);
act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 237;BA.debugLine="txtMablagh.Text=0";
Debug.ShouldStop(4096);
act_sabtrizcheck.mostCurrent._txtmablagh.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 238;BA.debugLine="txtShobe.Text=\"\"";
Debug.ShouldStop(8192);
act_sabtrizcheck.mostCurrent._txtshobe.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 239;BA.debugLine="TxtSharh.Text=\"\"";
Debug.ShouldStop(16384);
act_sabtrizcheck.mostCurrent._txtsharh.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 240;BA.debugLine="BtnDateSarResid.Text=\"تعیین تاریخ\"";
Debug.ShouldStop(32768);
act_sabtrizcheck.mostCurrent._btndatesarresid.runMethod(true,"setText",BA.ObjectToCharSequence("تعیین تاریخ"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e62) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabtrizcheck.processBA, e62.toString()); BA.debugLineNum = 242;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576480599",BA.ObjectToString(act_sabtrizcheck.mostCurrent.__c.runMethod(false,"LastException",act_sabtrizcheck.mostCurrent.activityBA)),0);
 BA.debugLineNum = 243;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(262144);
act_sabtrizcheck.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabtrizcheck.mostCurrent.__c.runMethod(false,"LastException",act_sabtrizcheck.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabtrizcheck.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnSave_Click"))));
 };
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Public NSN_BankD As Hitex_NiceSpinner";
act_sabtrizcheck.mostCurrent._nsn_bankd = RemoteObject.createNew ("hitex.nice.spinner.Hitex_NiceSpinner");
 //BA.debugLineNum = 18;BA.debugLine="Dim HLV As Hitex_LayoutView";
act_sabtrizcheck.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 19;BA.debugLine="Private lblShomareDaryaft As Label";
act_sabtrizcheck.mostCurrent._lblshomaredaryaft = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private pnl_Hlv As Panel";
act_sabtrizcheck.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private txtShomareCheck As EditText";
act_sabtrizcheck.mostCurrent._txtshomarecheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private txtShomareHesab As EditText";
act_sabtrizcheck.mostCurrent._txtshomarehesab = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private txtMablagh As EditText";
act_sabtrizcheck.mostCurrent._txtmablagh = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private PnlNBank As Panel";
act_sabtrizcheck.mostCurrent._pnlnbank = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private BtnDateSarResid As Button";
act_sabtrizcheck.mostCurrent._btndatesarresid = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtShobe As EditText";
act_sabtrizcheck.mostCurrent._txtshobe = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private TxtSharh As EditText";
act_sabtrizcheck.mostCurrent._txtsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim DateCheck As String";
act_sabtrizcheck.mostCurrent._datecheck = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim BtnSave As Button";
act_sabtrizcheck.mostCurrent._btnsave = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim lstCodeBank1 As List";
act_sabtrizcheck.mostCurrent._lstcodebank1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 31;BA.debugLine="Dim CodeBank1,NameBank1 As String";
act_sabtrizcheck.mostCurrent._codebank1 = RemoteObject.createImmutable("");
act_sabtrizcheck.mostCurrent._namebank1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim Key As IME";
act_sabtrizcheck.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 33;BA.debugLine="Dim OriginallstCheck As List";
act_sabtrizcheck.mostCurrent._originallstcheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 34;BA.debugLine="Private txtchanged As Boolean=False";
act_sabtrizcheck._txtchanged = act_sabtrizcheck.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,130);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","hlv_getitemcount");}
 BA.debugLineNum = 130;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Return lstCheck.Size '/ItemList.Size";
Debug.ShouldStop(4);
if (true) return act_sabtrizcheck._lstcheck.runMethod(true,"getSize");
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("HLV_onBindViewHolder (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,124);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rizcheck");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 124;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="Dim item As AdapterListCheckDaryafti=lstCheck.Get";
Debug.ShouldStop(268435456);
_item = (act_sabtrizcheck._lstcheck.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 126;BA.debugLine="Dim rec As cls_RizCheck=Parent.Tag";
Debug.ShouldStop(536870912);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 127;BA.debugLine="rec.show(item,issend)";
Debug.ShouldStop(1073741824);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizcheck.class, "_show" /*RemoteObject*/ ,(Object)(_item),(Object)(act_sabtrizcheck._issend));
 BA.debugLineNum = 128;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(-2147483648);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizcheck.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,118);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rizcheck");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 118;BA.debugLine="Private Sub HLV_onCreateViewHolder (Parent As Pane";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Dim rec As cls_RizCheck";
Debug.ShouldStop(4194304);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_rizcheck");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 120;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(8388608);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizcheck.class, "_initialize" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(act_sabtrizcheck.getObject()));
 BA.debugLineNum = 121;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(16777216);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizcheck.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_sabtrizcheck.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_sabtrizcheck.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rizcheck.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 122;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(33554432);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadbank() throws Exception{
try {
		Debug.PushSubsStack("LoadBank (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,134);
if (RapidSub.canDelegate("loadbank")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","loadbank");}
RemoteObject _cr1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 134;BA.debugLine="Sub LoadBank";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 136;BA.debugLine="Dim cr1 As Cursor=MCode.Result(\"Select * from Tbl";
Debug.ShouldStop(128);
_cr1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cr1 = act_sabtrizcheck.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * from TblBankMoshtari")));Debug.locals.put("cr1", _cr1);Debug.locals.put("cr1", _cr1);
 BA.debugLineNum = 137;BA.debugLine="lstCodeBank1.Clear";
Debug.ShouldStop(256);
act_sabtrizcheck.mostCurrent._lstcodebank1.runVoidMethod ("Clear");
 BA.debugLineNum = 138;BA.debugLine="For i=0 To cr1.RowCount-1";
Debug.ShouldStop(512);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cr1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 139;BA.debugLine="cr1.Position=i";
Debug.ShouldStop(1024);
_cr1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 140;BA.debugLine="NSN_BankD.Add(cr1.GetString(\"fldNameBank\"))";
Debug.ShouldStop(2048);
act_sabtrizcheck.mostCurrent._nsn_bankd.runVoidMethod ("Add",(Object)(_cr1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameBank")))));
 BA.debugLineNum = 141;BA.debugLine="lstCodeBank1.Add(cr1.GetString(\"fldCodeBank\"))";
Debug.ShouldStop(4096);
act_sabtrizcheck.mostCurrent._lstcodebank1.runVoidMethod ("Add",(Object)((_cr1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeBank"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 143;BA.debugLine="CodeBank1=lstCodeBank1.Get(0)";
Debug.ShouldStop(16384);
act_sabtrizcheck.mostCurrent._codebank1 = BA.ObjectToString(act_sabtrizcheck.mostCurrent._lstcodebank1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 144;BA.debugLine="NameBank1=NSN_BankD.Text";
Debug.ShouldStop(32768);
act_sabtrizcheck.mostCurrent._namebank1 = act_sabtrizcheck.mostCurrent._nsn_bankd.runMethod(true,"getText");
 BA.debugLineNum = 145;BA.debugLine="Log(CodeBank1)";
Debug.ShouldStop(65536);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576414987",act_sabtrizcheck.mostCurrent._codebank1,0);
 BA.debugLineNum = 146;BA.debugLine="Log(NameBank1)";
Debug.ShouldStop(131072);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576414988",act_sabtrizcheck.mostCurrent._namebank1,0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabtrizcheck.processBA, e14.toString()); BA.debugLineNum = 148;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576414990",BA.ObjectToString(act_sabtrizcheck.mostCurrent.__c.runMethod(false,"LastException",act_sabtrizcheck.mostCurrent.activityBA)),0);
 BA.debugLineNum = 149;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1048576);
act_sabtrizcheck.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabtrizcheck.mostCurrent.__c.runMethod(false,"LastException",act_sabtrizcheck.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabtrizcheck.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadBank"))));
 };
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcheck() throws Exception{
try {
		Debug.PushSubsStack("LoadCheck (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,78);
if (RapidSub.canDelegate("loadcheck")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","loadcheck");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti");
 BA.debugLineNum = 78;BA.debugLine="Private Sub LoadCheck";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 80;BA.debugLine="OriginallstCheck.Clear";
Debug.ShouldStop(32768);
act_sabtrizcheck.mostCurrent._originallstcheck.runVoidMethod ("Clear");
 BA.debugLineNum = 81;BA.debugLine="SumMablaghCheck=0";
Debug.ShouldStop(65536);
act_sabtrizcheck._summablaghcheck = BA.NumberToString(0);
 BA.debugLineNum = 83;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select * from TblC";
Debug.ShouldStop(262144);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_sabtrizcheck.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblCheckDaryafti where fldShomareDaryaft="),act_sabtrizcheck._shomaredaryafti,RemoteObject.createImmutable(" and fldShomareFactor="),act_sabtrizcheck._shomarefactor)));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 84;BA.debugLine="Log(cu.RowCount)";
Debug.ShouldStop(524288);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576152838",BA.NumberToString(_cu.runMethod(true,"getRowCount")),0);
 BA.debugLineNum = 85;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 87;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(4194304);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 88;BA.debugLine="cu.Position=i";
Debug.ShouldStop(8388608);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 89;BA.debugLine="Dim item As AdapterListCheckDaryafti";
Debug.ShouldStop(16777216);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti");Debug.locals.put("item", _item);
 BA.debugLineNum = 90;BA.debugLine="item.Initialize";
Debug.ShouldStop(33554432);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 91;BA.debugLine="item.ID=cu.GetInt(\"ID\")";
Debug.ShouldStop(67108864);
_item.setField ("ID" /*RemoteObject*/ ,BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID")))));
 BA.debugLineNum = 92;BA.debugLine="item.fldShomareCheck=cu.GetString(\"fldShomareC";
Debug.ShouldStop(134217728);
_item.setField ("fldShomareCheck" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareCheck"))));
 BA.debugLineNum = 93;BA.debugLine="item.fldShomareHesab=cu.GetString(\"fldShomareH";
Debug.ShouldStop(268435456);
_item.setField ("fldShomareHesab" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareHesab"))));
 BA.debugLineNum = 94;BA.debugLine="item.fldShomareDaryaft=cu.GetString(\"fldShomar";
Debug.ShouldStop(536870912);
_item.setField ("fldShomareDaryaft" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareDaryaft"))));
 BA.debugLineNum = 95;BA.debugLine="item.fldMablagh=cu.GetString(\"fldMablagh\")";
Debug.ShouldStop(1073741824);
_item.setField ("fldMablagh" /*RemoteObject*/ ,BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMablagh")))));
 BA.debugLineNum = 96;BA.debugLine="item.fldShobe=cu.GetString(\"fldShobe\")";
Debug.ShouldStop(-2147483648);
_item.setField ("fldShobe" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShobe"))));
 BA.debugLineNum = 97;BA.debugLine="item.fldSharh=cu.GetString(\"fldSharh\")";
Debug.ShouldStop(1);
_item.setField ("fldSharh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh"))));
 BA.debugLineNum = 98;BA.debugLine="item.fldDate=cu.GetString(\"fldDate\")";
Debug.ShouldStop(2);
_item.setField ("fldDate" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDate"))));
 BA.debugLineNum = 99;BA.debugLine="item.fldDateSarResid=cu.GetString(\"fldDateSarR";
Debug.ShouldStop(4);
_item.setField ("fldDateSarResid" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateSarResid"))));
 BA.debugLineNum = 100;BA.debugLine="item.fldCodeBank=cu.GetString(\"fldCodeBank\")";
Debug.ShouldStop(8);
_item.setField ("fldCodeBank" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeBank"))));
 BA.debugLineNum = 101;BA.debugLine="item.fldNameBank=cu.GetString(\"fldNameBank\")";
Debug.ShouldStop(16);
_item.setField ("fldNameBank" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameBank"))));
 BA.debugLineNum = 102;BA.debugLine="item.fldCodeSahebeCheck=cu.GetString(\"fldCodeS";
Debug.ShouldStop(32);
_item.setField ("fldCodeSahebeCheck" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeSahebeCheck"))));
 BA.debugLineNum = 103;BA.debugLine="item.fldNameSahebeCheck=cu.GetString(\"fldNameS";
Debug.ShouldStop(64);
_item.setField ("fldNameSahebeCheck" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameSahebeCheck"))));
 BA.debugLineNum = 104;BA.debugLine="item.count=cu.RowCount";
Debug.ShouldStop(128);
_item.setField ("count" /*RemoteObject*/ ,BA.NumberToString(_cu.runMethod(true,"getRowCount")));
 BA.debugLineNum = 105;BA.debugLine="SumMablaghCheck=SumMablaghCheck+item.fldMablag";
Debug.ShouldStop(256);
act_sabtrizcheck._summablaghcheck = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_sabtrizcheck._summablaghcheck),_item.getField(true,"fldMablagh" /*RemoteObject*/ )}, "+",1, 0));
 BA.debugLineNum = 106;BA.debugLine="OriginallstCheck.Add(item)";
Debug.ShouldStop(512);
act_sabtrizcheck.mostCurrent._originallstcheck.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 108;BA.debugLine="lstCheck=OriginallstCheck";
Debug.ShouldStop(2048);
act_sabtrizcheck._lstcheck = act_sabtrizcheck.mostCurrent._originallstcheck;
 BA.debugLineNum = 109;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(4096);
act_sabtrizcheck.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabtrizcheck.processBA, e32.toString()); BA.debugLineNum = 112;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576152866",BA.ObjectToString(act_sabtrizcheck.mostCurrent.__c.runMethod(false,"LastException",act_sabtrizcheck.mostCurrent.activityBA)),0);
 BA.debugLineNum = 113;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(65536);
act_sabtrizcheck.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabtrizcheck.mostCurrent.__c.runMethod(false,"LastException",act_sabtrizcheck.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabtrizcheck.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadCheck"))));
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("NSN_BankD_ItemClick (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,278);
if (RapidSub.canDelegate("nsn_bankd_itemclick")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","nsn_bankd_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 278;BA.debugLine="Sub NSN_BankD_ItemClick (Position As Int, Value As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 279;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 280;BA.debugLine="CodeBank1=lstCodeBank1.Get(Position)";
Debug.ShouldStop(8388608);
act_sabtrizcheck.mostCurrent._codebank1 = BA.ObjectToString(act_sabtrizcheck.mostCurrent._lstcodebank1.runMethod(false,"Get",(Object)(_position)));
 BA.debugLineNum = 281;BA.debugLine="NameBank1=Value";
Debug.ShouldStop(16777216);
act_sabtrizcheck.mostCurrent._namebank1 = BA.ObjectToString(_value);
 BA.debugLineNum = 282;BA.debugLine="Log(CodeBank1)";
Debug.ShouldStop(33554432);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576873732",act_sabtrizcheck.mostCurrent._codebank1,0);
 BA.debugLineNum = 283;BA.debugLine="Log(NameBank1)";
Debug.ShouldStop(67108864);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576873733",act_sabtrizcheck.mostCurrent._namebank1,0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabtrizcheck.processBA, e7.toString()); BA.debugLineNum = 285;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576873735",BA.ObjectToString(act_sabtrizcheck.mostCurrent.__c.runMethod(false,"LastException",act_sabtrizcheck.mostCurrent.activityBA)),0);
 BA.debugLineNum = 286;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(536870912);
act_sabtrizcheck.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_sabtrizcheck.mostCurrent.__c.runMethod(false,"LastException",act_sabtrizcheck.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_sabtrizcheck.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NSN_BankD_ItemClick"))));
 };
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_oncancel() throws Exception{
try {
		Debug.PushSubsStack("p_onCancel (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,270);
if (RapidSub.canDelegate("p_oncancel")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","p_oncancel");}
 BA.debugLineNum = 270;BA.debugLine="Sub p_onCancel";
Debug.ShouldStop(8192);
 BA.debugLineNum = 271;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(16384);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576742657",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_ondateset(RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("p_onDateSet (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,264);
if (RapidSub.canDelegate("p_ondateset")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","p_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 264;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(256);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576677121",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 266;BA.debugLine="BtnDateSarResid.Text=year&\"/\"&NumberFormat(month,";
Debug.ShouldStop(512);
act_sabtrizcheck.mostCurrent._btndatesarresid.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_sabtrizcheck.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_sabtrizcheck.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 267;BA.debugLine="DateCheck=year&NumberFormat(month,2,0)&NumberForm";
Debug.ShouldStop(1024);
act_sabtrizcheck.mostCurrent._datecheck = RemoteObject.concat(_year,act_sabtrizcheck.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_sabtrizcheck.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("p_onDismiss (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,274);
if (RapidSub.canDelegate("p_ondismiss")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","p_ondismiss");}
 BA.debugLineNum = 274;BA.debugLine="Sub p_onDismiss";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(262144);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","576808193",RemoteObject.createImmutable("dismiss"),0);
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
 //BA.debugLineNum = 7;BA.debugLine="Public ShomareDaryafti As String";
act_sabtrizcheck._shomaredaryafti = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Public ShomareFactor As String";
act_sabtrizcheck._shomarefactor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Public CodeMoshtari As String";
act_sabtrizcheck._codemoshtari = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Public NameMoshtari As String";
act_sabtrizcheck._namemoshtari = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Public SumMablaghCheck As String=0";
act_sabtrizcheck._summablaghcheck = BA.NumberToString(0);
 //BA.debugLineNum = 12;BA.debugLine="Public issend As Boolean";
act_sabtrizcheck._issend = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 13;BA.debugLine="Public lstCheck As List";
act_sabtrizcheck._lstcheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _txtmablagh_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtMablagh_TextChanged (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,352);
if (RapidSub.canDelegate("txtmablagh_textchanged")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","txtmablagh_textchanged", _old, _new);}
RemoteObject _no = RemoteObject.createImmutable(0L);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 352;BA.debugLine="Private Sub txtMablagh_TextChanged (Old As String,";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="Dim no As Long";
Debug.ShouldStop(1);
_no = RemoteObject.createImmutable(0L);Debug.locals.put("no", _no);
 BA.debugLineNum = 354;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> MC";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",act_sabtrizcheck.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(_old)),act_sabtrizcheck.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(_new)))) { 
 BA.debugLineNum = 355;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 356;BA.debugLine="no = txtMablagh.Text.Replace(\",\",\"\")";
Debug.ShouldStop(8);
_no = BA.numberCast(long.class, act_sabtrizcheck.mostCurrent._txtmablagh.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("no", _no);
 BA.debugLineNum = 357;BA.debugLine="txtchanged=True";
Debug.ShouldStop(16);
act_sabtrizcheck._txtchanged = act_sabtrizcheck.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 358;BA.debugLine="Log(no)";
Debug.ShouldStop(32);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","577201414",BA.NumberToString(_no),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabtrizcheck.processBA, e8.toString()); BA.debugLineNum = 360;BA.debugLine="no=0";
Debug.ShouldStop(128);
_no = BA.numberCast(long.class, 0);Debug.locals.put("no", _no);
 };
 };
 BA.debugLineNum = 363;BA.debugLine="If txtchanged Then";
Debug.ShouldStop(1024);
if (act_sabtrizcheck._txtchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 364;BA.debugLine="txtchanged=False";
Debug.ShouldStop(2048);
act_sabtrizcheck._txtchanged = act_sabtrizcheck.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 365;BA.debugLine="txtMablagh.Tag=no";
Debug.ShouldStop(4096);
act_sabtrizcheck.mostCurrent._txtmablagh.runMethod(false,"setTag",(_no));
 BA.debugLineNum = 366;BA.debugLine="txtMablagh.Text=NumberFormat2(no,0,0,0,True)";
Debug.ShouldStop(8192);
act_sabtrizcheck.mostCurrent._txtmablagh.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_sabtrizcheck.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _no)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_sabtrizcheck.mostCurrent.__c.getField(true,"True")))));
 };
 BA.debugLineNum = 368;BA.debugLine="txtMablagh.SetSelection(txtMablagh.Text.Length,0)";
Debug.ShouldStop(32768);
act_sabtrizcheck.mostCurrent._txtmablagh.runVoidMethod ("SetSelection",(Object)(act_sabtrizcheck.mostCurrent._txtmablagh.runMethod(true,"getText").runMethod(true,"length")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtshomarecheck_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtShomareCheck_TextChanged (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,304);
if (RapidSub.canDelegate("txtshomarecheck_textchanged")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","txtshomarecheck_textchanged", _old, _new);}
RemoteObject _no = RemoteObject.createImmutable(0L);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 304;BA.debugLine="Private Sub txtShomareCheck_TextChanged (Old As St";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="Dim no As Long";
Debug.ShouldStop(65536);
_no = RemoteObject.createImmutable(0L);Debug.locals.put("no", _no);
 BA.debugLineNum = 306;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> MC";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",act_sabtrizcheck.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(_old)),act_sabtrizcheck.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(_new)))) { 
 BA.debugLineNum = 307;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 308;BA.debugLine="no = txtShomareCheck.Text";
Debug.ShouldStop(524288);
_no = BA.numberCast(long.class, act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(true,"getText"));Debug.locals.put("no", _no);
 BA.debugLineNum = 309;BA.debugLine="txtchanged=True";
Debug.ShouldStop(1048576);
act_sabtrizcheck._txtchanged = act_sabtrizcheck.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 310;BA.debugLine="Log(no)";
Debug.ShouldStop(2097152);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","577070342",BA.NumberToString(_no),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabtrizcheck.processBA, e8.toString()); BA.debugLineNum = 312;BA.debugLine="no=0";
Debug.ShouldStop(8388608);
_no = BA.numberCast(long.class, 0);Debug.locals.put("no", _no);
 BA.debugLineNum = 313;BA.debugLine="txtShomareCheck.Text=\"0\"";
Debug.ShouldStop(16777216);
act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 };
 };
 BA.debugLineNum = 316;BA.debugLine="If txtchanged Then";
Debug.ShouldStop(134217728);
if (act_sabtrizcheck._txtchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 317;BA.debugLine="txtchanged=False";
Debug.ShouldStop(268435456);
act_sabtrizcheck._txtchanged = act_sabtrizcheck.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 318;BA.debugLine="txtShomareCheck.Tag=no";
Debug.ShouldStop(536870912);
act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(false,"setTag",(_no));
 BA.debugLineNum = 319;BA.debugLine="txtShomareCheck.Text=no";
Debug.ShouldStop(1073741824);
act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_no));
 };
 BA.debugLineNum = 321;BA.debugLine="txtShomareCheck.SelectionStart=txtShomareCheck.Te";
Debug.ShouldStop(1);
act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(true,"setSelectionStart",act_sabtrizcheck.mostCurrent._txtshomarecheck.runMethod(true,"getText").runMethod(true,"length"));
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
public static RemoteObject  _txtshomarehesab_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtShomareHesab_TextChanged (act_sabtrizcheck) ","act_sabtrizcheck",42,act_sabtrizcheck.mostCurrent.activityBA,act_sabtrizcheck.mostCurrent,324);
if (RapidSub.canDelegate("txtshomarehesab_textchanged")) { return ir.parsikhesab.pakhsh.act_sabtrizcheck.remoteMe.runUserSub(false, "act_sabtrizcheck","txtshomarehesab_textchanged", _old, _new);}
RemoteObject _no = RemoteObject.createImmutable(0L);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 324;BA.debugLine="Private Sub txtShomareHesab_TextChanged (Old As St";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="Dim no As Long";
Debug.ShouldStop(16);
_no = RemoteObject.createImmutable(0L);Debug.locals.put("no", _no);
 BA.debugLineNum = 326;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> MC";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",act_sabtrizcheck.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(_old)),act_sabtrizcheck.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_sabtrizcheck.mostCurrent.activityBA,(Object)(_new)))) { 
 BA.debugLineNum = 327;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 328;BA.debugLine="no = txtShomareHesab.Text";
Debug.ShouldStop(128);
_no = BA.numberCast(long.class, act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(true,"getText"));Debug.locals.put("no", _no);
 BA.debugLineNum = 329;BA.debugLine="txtchanged=True";
Debug.ShouldStop(256);
act_sabtrizcheck._txtchanged = act_sabtrizcheck.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 330;BA.debugLine="Log(no)";
Debug.ShouldStop(512);
act_sabtrizcheck.mostCurrent.__c.runVoidMethod ("LogImpl","577135878",BA.NumberToString(_no),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_sabtrizcheck.processBA, e8.toString()); BA.debugLineNum = 332;BA.debugLine="no=0";
Debug.ShouldStop(2048);
_no = BA.numberCast(long.class, 0);Debug.locals.put("no", _no);
 BA.debugLineNum = 333;BA.debugLine="txtShomareHesab.Text=\"0\"";
Debug.ShouldStop(4096);
act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 };
 };
 BA.debugLineNum = 336;BA.debugLine="If txtchanged Then";
Debug.ShouldStop(32768);
if (act_sabtrizcheck._txtchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 337;BA.debugLine="txtchanged=False";
Debug.ShouldStop(65536);
act_sabtrizcheck._txtchanged = act_sabtrizcheck.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 338;BA.debugLine="txtShomareHesab.Tag=no";
Debug.ShouldStop(131072);
act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(false,"setTag",(_no));
 BA.debugLineNum = 339;BA.debugLine="txtShomareHesab.Text=no";
Debug.ShouldStop(262144);
act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_no));
 };
 BA.debugLineNum = 341;BA.debugLine="txtShomareHesab.SelectionStart=txtShomareHesab.Te";
Debug.ShouldStop(1048576);
act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(true,"setSelectionStart",act_sabtrizcheck.mostCurrent._txtshomarehesab.runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 342;BA.debugLine="End Sub";
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