package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_selectmantage_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,71);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","activity_create", _firsttime);}
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 71;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Activity.LoadLayout(\"L_SelectMantaghe_2\")";
Debug.ShouldStop(128);
act_selectmantage.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_SelectMantaghe_2")),act_selectmantage.mostCurrent.activityBA);
 BA.debugLineNum = 73;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 74;BA.debugLine="lstSelectedCodeGroupAshkhas.Initialize";
Debug.ShouldStop(512);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Initialize");
 BA.debugLineNum = 75;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 76;BA.debugLine="ListAshkhas.Initialize";
Debug.ShouldStop(2048);
act_selectmantage.mostCurrent._listashkhas.runVoidMethod ("Initialize");
 BA.debugLineNum = 77;BA.debugLine="OrginalListAshkhas.Initialize";
Debug.ShouldStop(4096);
act_selectmantage.mostCurrent._orginallistashkhas.runVoidMethod ("Initialize");
 BA.debugLineNum = 78;BA.debugLine="OriginalListGoroohAshkhas1.Initialize";
Debug.ShouldStop(8192);
act_selectmantage.mostCurrent._originallistgoroohashkhas1.runVoidMethod ("Initialize");
 BA.debugLineNum = 79;BA.debugLine="ListGoroohAshkhas1.Initialize";
Debug.ShouldStop(16384);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Initialize");
 BA.debugLineNum = 80;BA.debugLine="OriginalListGoroohAshkhas2.Initialize";
Debug.ShouldStop(32768);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Initialize");
 BA.debugLineNum = 81;BA.debugLine="ListGoroohAshkhas2.Initialize";
Debug.ShouldStop(65536);
act_selectmantage.mostCurrent._listgoroohashkhas2.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="lstGroup1.Initialize";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent._lstgroup1.runVoidMethod ("Initialize");
 BA.debugLineNum = 83;BA.debugLine="lstGroup2.Initialize";
Debug.ShouldStop(262144);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="sidemenu.Initialize(\"sidmenu\")";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._sidemenu.runVoidMethod ("Initialize",act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("sidmenu")));
 BA.debugLineNum = 85;BA.debugLine="sidemenu.Menu.LoadLayout(\"groupashkhasmenulyr\")";
Debug.ShouldStop(1048576);
act_selectmantage.mostCurrent._sidemenu.runMethod(false,"getMenu").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("groupashkhasmenulyr")),act_selectmantage.mostCurrent.activityBA);
 BA.debugLineNum = 86;BA.debugLine="sidemenu.Mode=sidemenu.LEFT";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent._sidemenu.runMethod(true,"setMode",act_selectmantage.mostCurrent._sidemenu.getField(true,"LEFT"));
 BA.debugLineNum = 87;BA.debugLine="sidemenu.BehindOffset=33%x";
Debug.ShouldStop(4194304);
act_selectmantage.mostCurrent._sidemenu.runVoidMethod ("setBehindOffset",act_selectmantage.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33)),act_selectmantage.mostCurrent.activityBA));
 BA.debugLineNum = 88;BA.debugLine="HLVGoroohAshkhas.Initializer(\"HLVGoroohAshkhas\").";
Debug.ShouldStop(8388608);
act_selectmantage.mostCurrent._hlvgoroohashkhas.runMethod(false,"Initializer",act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLVGoroohAshkhas"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 89;BA.debugLine="pnlGroup.AddView(HLVGoroohAshkhas,1%x,1%y,65%x,87";
Debug.ShouldStop(16777216);
act_selectmantage.mostCurrent._pnlgroup.runVoidMethod ("AddView",(Object)((act_selectmantage.mostCurrent._hlvgoroohashkhas.getObject())),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_selectmantage.mostCurrent.activityBA)),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_selectmantage.mostCurrent.activityBA)),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 65)),act_selectmantage.mostCurrent.activityBA)),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 87)),act_selectmantage.mostCurrent.activityBA)));
 BA.debugLineNum = 91;BA.debugLine="tcount=3";
Debug.ShouldStop(67108864);
act_selectmantage._tcount = BA.numberCast(int.class, 3);
 BA.debugLineNum = 93;BA.debugLine="Gps.Initialize(\"gps\")";
Debug.ShouldStop(268435456);
act_selectmantage._gps.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("gps")));
 BA.debugLineNum = 94;BA.debugLine="t1.Initialize(\"t1\",5000)";
Debug.ShouldStop(536870912);
act_selectmantage._t1.runVoidMethod ("Initialize",act_selectmantage.processBA,(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 5000)));
 BA.debugLineNum = 96;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(-2147483648);
act_selectmantage.mostCurrent._hlv.runMethod(false,"Initializer",act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 98;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
Debug.ShouldStop(2);
act_selectmantage.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_selectmantage.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_selectmantage.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_selectmantage.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 100;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\")";
Debug.ShouldStop(8);
act_selectmantage.mostCurrent._nicespinner.runVoidMethod ("Initialize",act_selectmantage.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner")));
 BA.debugLineNum = 101;BA.debugLine="PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBase";
Debug.ShouldStop(16);
act_selectmantage.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_selectmantage.mostCurrent._nicespinner.getObject())),(Object)(act_selectmantage.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_selectmantage.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_selectmantage.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_selectmantage.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 102;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
Debug.ShouldStop(32);
act_selectmantage.mostCurrent._nicespinner.runMethod(true,"setTextColor",act_selectmantage.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 103;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent._nicespinner.runMethod(true,"setGravity",act_selectmantage.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 104;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"p";
Debug.ShouldStop(128);
act_selectmantage.mostCurrent._nicespinner.runMethod(false,"setTypeface",act_selectmantage.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 105;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(256);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 106;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
Debug.ShouldStop(512);
_op.runVoidMethod ("Initialize2",(Object)(act_selectmantage.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_selectmantage.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 107;BA.debugLine="NiceSpinner.Background=op";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._nicespinner.runMethod(false,"setBackground",(_op.getObject()));
 BA.debugLineNum = 109;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
Debug.ShouldStop(4096);
act_selectmantage.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_selectmantage.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner1")));
 BA.debugLineNum = 110;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBas";
Debug.ShouldStop(8192);
act_selectmantage.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_selectmantage.mostCurrent._nicespinner1.getObject())),(Object)(act_selectmantage.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_selectmantage.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_selectmantage.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_selectmantage.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 111;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(16384);
act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_selectmantage.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 112;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(32768);
act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_selectmantage.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 113;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(\"";
Debug.ShouldStop(65536);
act_selectmantage.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_selectmantage.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 114;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(131072);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 115;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
Debug.ShouldStop(262144);
_op1.runVoidMethod ("Initialize2",(Object)(act_selectmantage.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_selectmantage.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 116;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 117;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(1048576);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 118;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_selectmantage.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 120;BA.debugLine="LoadAcSpGroohAshkas";
Debug.ShouldStop(8388608);
_loadacspgroohashkas();
 BA.debugLineNum = 121;BA.debugLine="LoadAcSpGroohAshkas2";
Debug.ShouldStop(16777216);
_loadacspgroohashkas2();
 BA.debugLineNum = 124;BA.debugLine="HLVGoroohAshkhas.CardView.BackgroundColor(0x8aacc";
Debug.ShouldStop(134217728);
act_selectmantage.mostCurrent._hlvgoroohashkhas.runMethod(false,"CardView").runVoidMethod ("BackgroundColor",(Object)(BA.numberCast(int.class, ((int)0x8aacc8))));
 BA.debugLineNum = 125;BA.debugLine="HLVGoroohAshkhas.Ripple.Color(0x8aacc8)";
Debug.ShouldStop(268435456);
act_selectmantage.mostCurrent._hlvgoroohashkhas.runMethod(false,"Ripple").runVoidMethod ("Color",(Object)(BA.numberCast(int.class, ((int)0x8aacc8))));
 BA.debugLineNum = 126;BA.debugLine="HLVGoroohAshkhas.CardView.CardElevation(0dip).Rad";
Debug.ShouldStop(536870912);
act_selectmantage.mostCurrent._hlvgoroohashkhas.runMethod(false,"CardView").runMethod(false,"CardElevation",(Object)(BA.numberCast(float.class, act_selectmantage.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))))).runVoidMethod ("Radius",(Object)(BA.numberCast(float.class, act_selectmantage.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))));
 BA.debugLineNum = 129;BA.debugLine="HLVGoroohAshkhas.Show";
Debug.ShouldStop(1);
act_selectmantage.mostCurrent._hlvgoroohashkhas.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 130;BA.debugLine="HLV.Show";
Debug.ShouldStop(2);
act_selectmantage.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 132;BA.debugLine="Date = MCode.ConvertNumbersPersian2English(MCode.";
Debug.ShouldStop(8);
act_selectmantage.mostCurrent._date = act_selectmantage.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(act_selectmantage.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)));
 BA.debugLineNum = 134;BA.debugLine="Log(\"showbedehkaran: \" & MCode.showbedehkaran)";
Debug.ShouldStop(32);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","522675519",RemoteObject.concat(RemoteObject.createImmutable("showbedehkaran: "),act_selectmantage.mostCurrent._mcode._showbedehkaran /*RemoteObject*/ ),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e52) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e52.toString()); BA.debugLineNum = 150;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","522675535",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 151;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4194304);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_KeyPress (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,155);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 155;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 157;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_selectmantage.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 158;BA.debugLine="If sidemenu.Visible Then";
Debug.ShouldStop(536870912);
if (act_selectmantage.mostCurrent._sidemenu.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 159;BA.debugLine="If MCode.C_LayeAshkhas.Length > 3 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",act_selectmantage.mostCurrent._mcode._c_layeashkhas /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 160;BA.debugLine="LoadGoroohAshkasBack(MCode.C_LayeAshkhas)";
Debug.ShouldStop(-2147483648);
_loadgoroohashkasback(act_selectmantage.mostCurrent._mcode._c_layeashkhas /*RemoteObject*/ );
 BA.debugLineNum = 161;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return act_selectmantage.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 163;BA.debugLine="sidemenu.HideMenus";
Debug.ShouldStop(4);
act_selectmantage.mostCurrent._sidemenu.runVoidMethod ("HideMenus");
 BA.debugLineNum = 164;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return act_selectmantage.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 168;BA.debugLine="btn_Back_Click";
Debug.ShouldStop(128);
_btn_back_click();
 BA.debugLineNum = 169;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) return act_selectmantage.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 171;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return act_selectmantage.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Pause (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1109);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 1109;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1111;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Resume (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1081);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","activity_resume");}
 BA.debugLineNum = 1081;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1082;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 1085;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_selectmantage.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA),act_selectmantage.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",act_selectmantage.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 1086;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
Debug.ShouldStop(536870912);
act_selectmantage.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(act_selectmantage.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 1095;BA.debugLine="StartService(FusedLocationService)";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent.__c.runVoidMethod ("StartService",act_selectmantage.processBA,(Object)((act_selectmantage.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 1097;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(256);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","523658512",RemoteObject.createImmutable("Gps Start"),0);
 BA.debugLineNum = 1098;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(512);
_loadashkhas();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e9.toString()); BA.debugLineNum = 1104;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","523658519",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1105;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(65536);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Resume"))));
 };
 BA.debugLineNum = 1107;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Application_Error (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1586);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 1586;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1588;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return act_selectmantage.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1589;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("btn_Back_Click (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1113);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","btn_back_click");}
 BA.debugLineNum = 1113;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1114;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
act_selectmantage.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1115;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_sort_click() throws Exception{
try {
		Debug.PushSubsStack("btn_sort_Click (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1473);
if (RapidSub.canDelegate("btn_sort_click")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","btn_sort_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1473;BA.debugLine="Sub btn_sort_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 1474;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 1475;BA.debugLine="Dim Lst As List = Array As String(\"کد شخص\",\"نام";
Debug.ShouldStop(4);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_selectmantage.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("کد شخص"),BA.ObjectToString("نام شخص نزولی"),RemoteObject.createImmutable("نام شخص صعودی")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 1476;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس";
Debug.ShouldStop(8);
_res = act_selectmantage.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("مرتب سازی براساس:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_selectmantage.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1477;BA.debugLine="Select Case res";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 1479;BA.debugLine="Str_sort = \" Order by fldCodetafzili Asc\"";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodetafzili Asc");
 break; }
case 1: {
 BA.debugLineNum = 1481;BA.debugLine="Str_sort = \" Order by fldSharheTafzili\"";
Debug.ShouldStop(256);
act_selectmantage.mostCurrent._str_sort = BA.ObjectToString(" Order by fldSharheTafzili");
 break; }
case 2: {
 BA.debugLineNum = 1483;BA.debugLine="Str_sort = \" Order by fldSharheTafzili Desc\"";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._str_sort = BA.ObjectToString(" Order by fldSharheTafzili Desc");
 break; }
}
;
 BA.debugLineNum = 1486;BA.debugLine="Log(Str_sort)";
Debug.ShouldStop(8192);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524444941",act_selectmantage.mostCurrent._str_sort,0);
 BA.debugLineNum = 1487;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(16384);
_loadashkhas();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e15.toString()); BA.debugLineNum = 1489;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524444944",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1490;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btn_sort_Click"))));
 };
 BA.debugLineNum = 1492;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlocationmoshtarian_click() throws Exception{
try {
		Debug.PushSubsStack("btnLocationMoshtarian_Click (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1624);
if (RapidSub.canDelegate("btnlocationmoshtarian_click")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","btnlocationmoshtarian_click");}
 BA.debugLineNum = 1624;BA.debugLine="Private Sub btnLocationMoshtarian_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1625;BA.debugLine="StartActivity(Act_LocationMoshtarian)";
Debug.ShouldStop(16777216);
act_selectmantage.mostCurrent.__c.runVoidMethod ("StartActivity",act_selectmantage.processBA,(Object)((act_selectmantage.mostCurrent._act_locationmoshtarian.getObject())));
 BA.debugLineNum = 1626;BA.debugLine="Act_LocationMoshtarian.LstLocation=ListAshkhas";
Debug.ShouldStop(33554432);
act_selectmantage.mostCurrent._act_locationmoshtarian._lstlocation /*RemoteObject*/  = act_selectmantage.mostCurrent._listashkhas;
 BA.debugLineNum = 1629;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmenugroup_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenuGroup_Click (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1599);
if (RapidSub.canDelegate("btnmenugroup_click")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","btnmenugroup_click");}
 BA.debugLineNum = 1599;BA.debugLine="Private Sub btnMenuGroup_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1600;BA.debugLine="sidemenu.ShowMenu";
Debug.ShouldStop(-2147483648);
act_selectmantage.mostCurrent._sidemenu.runVoidMethod ("ShowMenu");
 BA.debugLineNum = 1601;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnewashkhas_click() throws Exception{
try {
		Debug.PushSubsStack("btnNewAshkhas_Click (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1593);
if (RapidSub.canDelegate("btnnewashkhas_click")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","btnnewashkhas_click");}
 BA.debugLineNum = 1593;BA.debugLine="Private Sub btnNewAshkhas_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1594;BA.debugLine="MCode.UpdateShakhs=False";
Debug.ShouldStop(33554432);
act_selectmantage.mostCurrent._mcode._updateshakhs /*RemoteObject*/  = act_selectmantage.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1595;BA.debugLine="StartActivity(Act_NewAshkhas)";
Debug.ShouldStop(67108864);
act_selectmantage.mostCurrent.__c.runVoidMethod ("StartActivity",act_selectmantage.processBA,(Object)((act_selectmantage.mostCurrent._act_newashkhas.getObject())));
 BA.debugLineNum = 1597;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("btnUpdate_Click (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1577);
if (RapidSub.canDelegate("btnupdate_click")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","btnupdate_click");}
 BA.debugLineNum = 1577;BA.debugLine="Sub btnUpdate_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 1580;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlisttours() throws Exception{
try {
		Debug.PushSubsStack("GetListTours (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1630);
if (RapidSub.canDelegate("getlisttours")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","getlisttours");}
 BA.debugLineNum = 1630;BA.debugLine="Public Sub GetListTours";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1631;BA.debugLine="CallSubDelayed2(Act_LocationMoshtarian,\"LoadData\"";
Debug.ShouldStop(1073741824);
act_selectmantage.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",act_selectmantage.processBA,(Object)((act_selectmantage.mostCurrent._act_locationmoshtarian.getObject())),(Object)(BA.ObjectToString("LoadData")),(Object)((act_selectmantage.mostCurrent._listashkhas)));
 BA.debugLineNum = 1632;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private rp As RuntimePermissions";
act_selectmantage.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 14;BA.debugLine="Dim UtilS As Hitex_Utils";
act_selectmantage.mostCurrent._utils = RemoteObject.createNew ("wir.hitex.recycler.Hitex_Utils");
 //BA.debugLineNum = 15;BA.debugLine="Dim Key As IME";
act_selectmantage.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 16;BA.debugLine="Dim ListAshkhas,OrginalListAshkhas As List";
act_selectmantage.mostCurrent._listashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_selectmantage.mostCurrent._orginallistashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 17;BA.debugLine="Dim CuAshkhas As Cursor";
act_selectmantage.mostCurrent._cuashkhas = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Public NiceSpinner As NiceSpinner";
act_selectmantage.mostCurrent._nicespinner = RemoteObject.createNew ("nicespinnerwrapper.niceSpinnerWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Public NiceSpinner1 As NiceSpinner";
act_selectmantage.mostCurrent._nicespinner1 = RemoteObject.createNew ("nicespinnerwrapper.niceSpinnerWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
act_selectmantage.mostCurrent._b4xcombobox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 21;BA.debugLine="Private B4XComboBox2 As B4XComboBox";
act_selectmantage.mostCurrent._b4xcombobox2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 22;BA.debugLine="Dim ListGoroohAshkhas1,OriginalListGoroohAshkhas1";
act_selectmantage.mostCurrent._listgoroohashkhas1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_selectmantage.mostCurrent._originallistgoroohashkhas1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 23;BA.debugLine="Dim ListGoroohAshkhas2,OriginalListGoroohAshkhas2";
act_selectmantage.mostCurrent._listgoroohashkhas2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_selectmantage.mostCurrent._originallistgoroohashkhas2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 24;BA.debugLine="Private pnl_HLV As Panel";
act_selectmantage.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private HLV As Hitex_LayoutView";
act_selectmantage.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 26;BA.debugLine="Private ListMantaghe As List";
act_selectmantage.mostCurrent._listmantaghe = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 27;BA.debugLine="Private Date As String";
act_selectmantage.mostCurrent._date = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Private TxtSearch As EditText";
act_selectmantage.mostCurrent._txtsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private LblTedadVisit As Label";
act_selectmantage.mostCurrent._lbltedadvisit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private LblTedadSefaresh As Label";
act_selectmantage.mostCurrent._lbltedadsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblTedadKol As Label";
act_selectmantage.mostCurrent._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private PnlSpGroup As Panel";
act_selectmantage.mostCurrent._pnlspgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private btn_sort As Label";
act_selectmantage.mostCurrent._btn_sort = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Str_sort As String = \" Order by fldCodeta";
act_selectmantage.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodetafzili Asc");
 //BA.debugLineNum = 38;BA.debugLine="Private Date As String";
act_selectmantage.mostCurrent._date = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Dim GroupCodeSelect1 As String=\"0\"";
act_selectmantage.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 //BA.debugLineNum = 40;BA.debugLine="Dim GroupNameSelect1 As String=\"\"";
act_selectmantage.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 //BA.debugLineNum = 41;BA.debugLine="Dim GroupCodeSelect2 As String=\"0\"";
act_selectmantage.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 //BA.debugLineNum = 42;BA.debugLine="Dim GroupNameSelect2 As String=\"\"";
act_selectmantage.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 //BA.debugLineNum = 43;BA.debugLine="Dim countvisit As Int=0";
act_selectmantage._countvisit = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 44;BA.debugLine="Dim countsefaresh As Int=0";
act_selectmantage._countsefaresh = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 45;BA.debugLine="Private SwVisit As ACSwitch";
act_selectmantage.mostCurrent._swvisit = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Dim lstSelectedCodeGroupAshkhas As List";
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 47;BA.debugLine="Private PnlBed As Panel";
act_selectmantage.mostCurrent._pnlbed = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private SwBed As ACSwitch";
act_selectmantage.mostCurrent._swbed = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Dim tcount As Int";
act_selectmantage._tcount = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 51;BA.debugLine="Private SwBes As ACSwitch";
act_selectmantage.mostCurrent._swbes = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private SwNew As ACSwitch";
act_selectmantage.mostCurrent._swnew = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Dim lstGroup1 As List";
act_selectmantage.mostCurrent._lstgroup1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 54;BA.debugLine="Dim lstGroup2 As List";
act_selectmantage.mostCurrent._lstgroup2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 58;BA.debugLine="Private swSearchByAddress As ACSwitch";
act_selectmantage.mostCurrent._swsearchbyaddress = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private btnNewAshkhas As Panel";
act_selectmantage.mostCurrent._btnnewashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private btnMenuGroup As Button";
act_selectmantage.mostCurrent._btnmenugroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private sidemenu As SlidingMenu";
act_selectmantage.mostCurrent._sidemenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.SlidingMenuWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Dim HLVGoroohAshkhas As Hitex_LayoutView";
act_selectmantage.mostCurrent._hlvgoroohashkhas = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 63;BA.debugLine="Private pnlGroup As Panel";
act_selectmantage.mostCurrent._pnlgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private lblBackGroup As Label";
act_selectmantage.mostCurrent._lblbackgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private SwBlackList As ACSwitch";
act_selectmantage.mostCurrent._swblacklist = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private SwTourToday As ACSwitch";
act_selectmantage.mostCurrent._swtourtoday = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private btnLocationMoshtarian As Label";
act_selectmantage.mostCurrent._btnlocationmoshtarian = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gps_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("Gps_LocationChanged (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1582);
if (RapidSub.canDelegate("gps_locationchanged")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","gps_locationchanged", _location1);}
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 1582;BA.debugLine="Sub Gps_LocationChanged (Location1 As Location)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1584;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1129);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","hlv_getitemcount");}
 BA.debugLineNum = 1129;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(256);
 BA.debugLineNum = 1130;BA.debugLine="Return ListAshkhas.Size '/ItemList.Size";
Debug.ShouldStop(512);
if (true) return act_selectmantage.mostCurrent._listashkhas.runMethod(true,"getSize");
 BA.debugLineNum = 1131;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("HLV_onBindViewHolder (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1122);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recashkhas");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1122;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(2);
 BA.debugLineNum = 1123;BA.debugLine="Dim item As AdapterListAshkhas=ListAshkhas.Get(Po";
Debug.ShouldStop(4);
_item = (act_selectmantage.mostCurrent._listashkhas.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 1124;BA.debugLine="Dim rec As cls_RecAshkhas=Parent.Tag";
Debug.ShouldStop(8);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 1125;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(16);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_selectmantage.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 1126;BA.debugLine="rec.show(item,Date)";
Debug.ShouldStop(32);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_show" /*RemoteObject*/ ,(Object)(_item),(Object)(act_selectmantage.mostCurrent._date));
 BA.debugLineNum = 1127;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(64);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 1128;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1117);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recashkhas");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 1117;BA.debugLine="Private Sub HLV_onCreateViewHolder (Parent As Pane";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1118;BA.debugLine="Dim rec As cls_RecAshkhas";
Debug.ShouldStop(536870912);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recashkhas");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 1119;BA.debugLine="rec.Initialize";
Debug.ShouldStop(1073741824);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_initialize" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA);
 BA.debugLineNum = 1120;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(-2147483648);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 1121;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlvgoroohashkhas_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLVGoroohAshkhas_GetItemCount (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1041);
if (RapidSub.canDelegate("hlvgoroohashkhas_getitemcount")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","hlvgoroohashkhas_getitemcount");}
 BA.debugLineNum = 1041;BA.debugLine="Sub HLVGoroohAshkhas_GetItemCount As Int";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1042;BA.debugLine="Return ListGoroohAshkhas2.Size";
Debug.ShouldStop(131072);
if (true) return act_selectmantage.mostCurrent._listgoroohashkhas2.runMethod(true,"getSize");
 BA.debugLineNum = 1043;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlvgoroohashkhas_itemclick(RemoteObject _clickeditem,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLVGoroohAshkhas_ItemClick (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1036);
if (RapidSub.canDelegate("hlvgoroohashkhas_itemclick")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","hlvgoroohashkhas_itemclick", _clickeditem, _position);}
Debug.locals.put("ClickedItem", _clickeditem);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1036;BA.debugLine="Sub HLVGoroohAshkhas_ItemClick (ClickedItem As Pan";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1037;BA.debugLine="LoadGoroohAshkhasGo(Position)";
Debug.ShouldStop(4096);
_loadgoroohashkhasgo(_position);
 BA.debugLineNum = 1038;BA.debugLine="sidemenu.HideMenus";
Debug.ShouldStop(8192);
act_selectmantage.mostCurrent._sidemenu.runVoidMethod ("HideMenus");
 BA.debugLineNum = 1039;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlvgoroohashkhas_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLVGoroohAshkhas_onBindViewHolder (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1047);
if (RapidSub.canDelegate("hlvgoroohashkhas_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","hlvgoroohashkhas_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _lblsharh = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1047;BA.debugLine="Sub HLVGoroohAshkhas_onBindViewHolder (Parent As P";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1048;BA.debugLine="Dim Item = ListGoroohAshkhas2.Get(Position) As Ad";
Debug.ShouldStop(8388608);
_item = (act_selectmantage.mostCurrent._listgoroohashkhas2.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1049;BA.debugLine="Dim LblSharh As Label  = Parent.getview(0)";
Debug.ShouldStop(16777216);
_lblsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblsharh = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("LblSharh", _lblsharh);Debug.locals.put("LblSharh", _lblsharh);
 BA.debugLineNum = 1050;BA.debugLine="LblSharh.Text = Item.FldN_Gorooh";
Debug.ShouldStop(33554432);
_lblsharh.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ )));
 BA.debugLineNum = 1051;BA.debugLine="Parent.Elevation=1dip";
Debug.ShouldStop(67108864);
_parent.runMethod(true,"setElevation",BA.numberCast(float.class, act_selectmantage.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 1052;BA.debugLine="Parent.Height = 9%y";
Debug.ShouldStop(134217728);
_parent.runMethod(true,"setHeight",act_selectmantage.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 9)),act_selectmantage.mostCurrent.activityBA));
 BA.debugLineNum = 1053;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlvgoroohashkhas_oncreateviewholder(RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("HLVGoroohAshkhas_onCreateViewHolder (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1022);
if (RapidSub.canDelegate("hlvgoroohashkhas_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","hlvgoroohashkhas_oncreateviewholder", _parent, _viewtype);}
RemoteObject _lblsharh = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 1022;BA.debugLine="Sub HLVGoroohAshkhas_onCreateViewHolder (Parent As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1023;BA.debugLine="Dim LblSharh As Label";
Debug.ShouldStop(1073741824);
_lblsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("LblSharh", _lblsharh);
 BA.debugLineNum = 1024;BA.debugLine="Dim bmp1 As BitmapDrawable";
Debug.ShouldStop(-2147483648);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 1025;BA.debugLine="LblSharh.Initialize(\"LblSharh\")";
Debug.ShouldStop(1);
_lblsharh.runVoidMethod ("Initialize",act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("LblSharh")));
 BA.debugLineNum = 1026;BA.debugLine="LblSharh.TextColor=Colors.black";
Debug.ShouldStop(2);
_lblsharh.runMethod(true,"setTextColor",act_selectmantage.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 1027;BA.debugLine="LblSharh.TextSize=20";
Debug.ShouldStop(4);
_lblsharh.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 1028;BA.debugLine="LblSharh.Gravity=Gravity.CENTER";
Debug.ShouldStop(8);
_lblsharh.runMethod(true,"setGravity",act_selectmantage.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 1029;BA.debugLine="LblSharh.SingleLine=False";
Debug.ShouldStop(16);
_lblsharh.runVoidMethod ("setSingleLine",act_selectmantage.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1030;BA.debugLine="bmp1.Initialize(LoadBitmap(File.DirAssets,\"button";
Debug.ShouldStop(32);
_bmp1.runVoidMethod ("Initialize",(Object)((act_selectmantage.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_selectmantage.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("button5.png"))).getObject())));
 BA.debugLineNum = 1031;BA.debugLine="LblSharh.Background=bmp1";
Debug.ShouldStop(64);
_lblsharh.runMethod(false,"setBackground",(_bmp1.getObject()));
 BA.debugLineNum = 1032;BA.debugLine="LblSharh.Typeface= MCode.Font2";
Debug.ShouldStop(128);
_lblsharh.runMethod(false,"setTypeface",(act_selectmantage.mostCurrent._mcode._font2 /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 1033;BA.debugLine="Parent.AddView(LblSharh,2%x,1%y,61%x,7%y)";
Debug.ShouldStop(256);
_parent.runVoidMethod ("AddView",(Object)((_lblsharh.getObject())),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),act_selectmantage.mostCurrent.activityBA)),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_selectmantage.mostCurrent.activityBA)),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 61)),act_selectmantage.mostCurrent.activityBA)),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),act_selectmantage.mostCurrent.activityBA)));
 BA.debugLineNum = 1034;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblbackgroup_click() throws Exception{
try {
		Debug.PushSubsStack("lblBackGroup_Click (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1603);
if (RapidSub.canDelegate("lblbackgroup_click")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","lblbackgroup_click");}
 BA.debugLineNum = 1603;BA.debugLine="Private Sub lblBackGroup_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 1604;BA.debugLine="If MCode.C_LayeAshkhas.Length > 3 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",act_selectmantage.mostCurrent._mcode._c_layeashkhas /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 1606;BA.debugLine="If MCode.C_LayeAshkhas.Length=6 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",act_selectmantage.mostCurrent._mcode._c_layeashkhas /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 1607;BA.debugLine="lblBackGroup.Visible=False";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent._lblbackgroup.runMethod(true,"setVisible",act_selectmantage.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1609;BA.debugLine="LoadGoroohAshkasBack(MCode.C_LayeAshkhas)";
Debug.ShouldStop(256);
_loadgoroohashkasback(act_selectmantage.mostCurrent._mcode._c_layeashkhas /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1611;BA.debugLine="lblBackGroup.Visible=False";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._lblbackgroup.runMethod(true,"setVisible",act_selectmantage.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1613;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadacspgroohashkas() throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpGroohAshkas (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,796);
if (RapidSub.canDelegate("loadacspgroohashkas")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","loadacspgroohashkas");}
RemoteObject _lsttemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dt1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _indextemp = RemoteObject.createImmutable("");
RemoteObject _dt2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _j = 0;
RemoteObject _code2 = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0L);
RemoteObject _mincode = RemoteObject.createImmutable("");
RemoteObject _sizecode = RemoteObject.createImmutable(0L);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _a = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _namegroup = RemoteObject.createImmutable("");
RemoteObject _codegroup = RemoteObject.createImmutable("");
 BA.debugLineNum = 796;BA.debugLine="Sub LoadAcSpGroohAshkas";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 797;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 798;BA.debugLine="Dim lstTemp As List";
Debug.ShouldStop(536870912);
_lsttemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstTemp", _lsttemp);
 BA.debugLineNum = 799;BA.debugLine="lstTemp.Initialize";
Debug.ShouldStop(1073741824);
_lsttemp.runVoidMethod ("Initialize");
 BA.debugLineNum = 801;BA.debugLine="lstGroup1.Add(\"همه گروه ها\")";
Debug.ShouldStop(1);
act_selectmantage.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 802;BA.debugLine="Dim Dt1 As Cursor = MCode.Result(\"Select FldC_Go";
Debug.ShouldStop(2);
_dt1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt1 = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")));Debug.locals.put("Dt1", _dt1);Debug.locals.put("Dt1", _dt1);
 BA.debugLineNum = 803;BA.debugLine="For i=0 To Dt1.RowCount-1";
Debug.ShouldStop(4);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_dt1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 804;BA.debugLine="Dt1.Position=i";
Debug.ShouldStop(8);
_dt1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 805;BA.debugLine="Dim code As String=Dt1.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(16);
_code = _dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 806;BA.debugLine="Dim indexTemp As String=lstTemp.IndexOf(code)";
Debug.ShouldStop(32);
_indextemp = BA.NumberToString(_lsttemp.runMethod(true,"IndexOf",(Object)((_code))));Debug.locals.put("indexTemp", _indextemp);Debug.locals.put("indexTemp", _indextemp);
 BA.debugLineNum = 807;BA.debugLine="If indexTemp=-1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_indextemp,BA.NumberToString(-(double) (0 + 1)))) { 
 BA.debugLineNum = 808;BA.debugLine="Dim dt2 As Cursor =MCode.Result(\"Select * From";
Debug.ShouldStop(128);
_dt2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt2 = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblGoroohAshkhas where FldC_Gorooh Like '"),_code,RemoteObject.createImmutable("%'"))));Debug.locals.put("dt2", _dt2);Debug.locals.put("dt2", _dt2);
 BA.debugLineNum = 809;BA.debugLine="If dt2.RowCount>0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_dt2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 810;BA.debugLine="For j=0 To dt2.RowCount-1";
Debug.ShouldStop(512);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_dt2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step13 > 0 && _j <= limit13) || (step13 < 0 && _j >= limit13) ;_j = ((int)(0 + _j + step13))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 811;BA.debugLine="dt2.Position=j";
Debug.ShouldStop(1024);
_dt2.runMethod(true,"setPosition",BA.numberCast(int.class, _j));
 BA.debugLineNum = 812;BA.debugLine="Dim code2 As String=dt2.GetString(\"FldC_Goro";
Debug.ShouldStop(2048);
_code2 = _dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("code2", _code2);Debug.locals.put("code2", _code2);
 BA.debugLineNum = 814;BA.debugLine="Dim count As Long";
Debug.ShouldStop(8192);
_count = RemoteObject.createImmutable(0L);Debug.locals.put("count", _count);
 BA.debugLineNum = 815;BA.debugLine="Dim MinCode As String =MCode.SingleResult(\"S";
Debug.ShouldStop(16384);
_mincode = BA.ObjectToString(act_selectmantage.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"),_code2,RemoteObject.createImmutable("%'")))));Debug.locals.put("MinCode", _mincode);Debug.locals.put("MinCode", _mincode);
 BA.debugLineNum = 816;BA.debugLine="Dim sizeCode As Long=dt2.GetString(\"FldC_Gor";
Debug.ShouldStop(32768);
_sizecode = BA.numberCast(long.class, _dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"length"));Debug.locals.put("sizeCode", _sizecode);Debug.locals.put("sizeCode", _sizecode);
 BA.debugLineNum = 817;BA.debugLine="If MinCode.Length=sizeCode Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_mincode.runMethod(true,"length"),BA.numberCast(double.class, _sizecode))) { 
 BA.debugLineNum = 818;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(131072);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 819;BA.debugLine="Item.FldC_Gorooh= dt2.GetString(\"FldC_Goroo";
Debug.ShouldStop(262144);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 820;BA.debugLine="Item.FldN_Gorooh= dt2.GetString(\"FldN_Goroo";
Debug.ShouldStop(524288);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 821;BA.debugLine="OriginalListGoroohAshkhas1.Add(Item)";
Debug.ShouldStop(1048576);
act_selectmantage.mostCurrent._originallistgoroohashkhas1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 822;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 825;BA.debugLine="If MinCode.Length=sizeCode Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_mincode.runMethod(true,"length"),BA.numberCast(double.class, _sizecode))) { 
 BA.debugLineNum = 826;BA.debugLine="For Each a As AdapterGoroohAshkhas In Orig";
Debug.ShouldStop(33554432);
{
final RemoteObject group27 = act_selectmantage.mostCurrent._originallistgoroohashkhas1;
final int groupLen27 = group27.runMethod(true,"getSize").<Integer>get()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_a = (group27.runMethod(false,"Get",index27));Debug.locals.put("a", _a);
Debug.locals.put("a", _a);
 BA.debugLineNum = 827;BA.debugLine="If a.FldC_Gorooh.SubString2(0,3)=code2 Th";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_a.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),_code2)) { 
 BA.debugLineNum = 828;BA.debugLine="count=1";
Debug.ShouldStop(134217728);
_count = BA.numberCast(long.class, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 829;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
if (true) break;
 };
 }
}Debug.locals.put("a", _a);
;
 BA.debugLineNum = 832;BA.debugLine="If count =0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 833;BA.debugLine="Dim NameGroup,CodeGroup As String";
Debug.ShouldStop(1);
_namegroup = RemoteObject.createImmutable("");Debug.locals.put("NameGroup", _namegroup);
_codegroup = RemoteObject.createImmutable("");Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 834;BA.debugLine="CodeGroup=MinCode";
Debug.ShouldStop(2);
_codegroup = _mincode;Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 835;BA.debugLine="NameGroup=MCode.SingleResult(\"Select FldN";
Debug.ShouldStop(4);
_namegroup = BA.ObjectToString(act_selectmantage.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"),_mincode,RemoteObject.createImmutable("'")))));Debug.locals.put("NameGroup", _namegroup);
 BA.debugLineNum = 836;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(8);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 837;BA.debugLine="Item.FldC_Gorooh= CodeGroup";
Debug.ShouldStop(16);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_codegroup);
 BA.debugLineNum = 838;BA.debugLine="Item.FldN_Gorooh= NameGroup";
Debug.ShouldStop(32);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_namegroup);
 BA.debugLineNum = 839;BA.debugLine="OriginalListGoroohAshkhas1.Add(Item)";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent._originallistgoroohashkhas1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 840;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(128);
act_selectmantage.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ))));
 };
 }else {
 };
 };
 }
}Debug.locals.put("j", _j);
;
 };
 BA.debugLineNum = 858;BA.debugLine="lstTemp.Add(code)";
Debug.ShouldStop(33554432);
_lsttemp.runVoidMethod ("Add",(Object)((_code)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 889;BA.debugLine="NiceSpinner.attachDataSource(lstGroup1)";
Debug.ShouldStop(16777216);
act_selectmantage.mostCurrent._nicespinner.runVoidMethod ("attachDataSource",(Object)((act_selectmantage.mostCurrent._lstgroup1.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e53) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e53.toString()); BA.debugLineNum = 891;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","523134303",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 892;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(134217728);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadAcSpGroohAshkas"))));
 };
 BA.debugLineNum = 894;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadacspgroohashkas2() throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpGroohAshkas2 (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,632);
if (RapidSub.canDelegate("loadacspgroohashkas2")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","loadacspgroohashkas2");}
RemoteObject _lsttemp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _dt1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _indextemp = RemoteObject.createImmutable("");
RemoteObject _dt2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _j = 0;
RemoteObject _code2 = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0L);
RemoteObject _mincode = RemoteObject.createImmutable("");
RemoteObject _sizecode = RemoteObject.createImmutable(0L);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _a = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _namegroup = RemoteObject.createImmutable("");
RemoteObject _codegroup = RemoteObject.createImmutable("");
 BA.debugLineNum = 632;BA.debugLine="Sub LoadAcSpGroohAshkas2";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 633;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 634;BA.debugLine="Dim lstTemp As List";
Debug.ShouldStop(33554432);
_lsttemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstTemp", _lsttemp);
 BA.debugLineNum = 635;BA.debugLine="lstTemp.Initialize";
Debug.ShouldStop(67108864);
_lsttemp.runVoidMethod ("Initialize");
 BA.debugLineNum = 637;BA.debugLine="Dim Item1 As AdapterGoroohAshkhas";
Debug.ShouldStop(268435456);
_item1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 638;BA.debugLine="Item1.FldC_Gorooh= 0";
Debug.ShouldStop(536870912);
_item1.setField ("FldC_Gorooh" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 639;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
Debug.ShouldStop(1073741824);
_item1.setField ("FldN_Gorooh" /*RemoteObject*/ ,BA.ObjectToString("همه گروه ها"));
 BA.debugLineNum = 640;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item1)";
Debug.ShouldStop(-2147483648);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Add",(Object)((_item1)));
 BA.debugLineNum = 641;BA.debugLine="Dim Dt1 As Cursor = MCode.Result(\"Select FldC_Go";
Debug.ShouldStop(1);
_dt1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt1 = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")));Debug.locals.put("Dt1", _dt1);Debug.locals.put("Dt1", _dt1);
 BA.debugLineNum = 642;BA.debugLine="For i=0 To Dt1.RowCount-1";
Debug.ShouldStop(2);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_dt1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 643;BA.debugLine="Dt1.Position=i";
Debug.ShouldStop(4);
_dt1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 644;BA.debugLine="Dim code As String=Dt1.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(8);
_code = _dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 645;BA.debugLine="Dim indexTemp As String=lstTemp.IndexOf(code)";
Debug.ShouldStop(16);
_indextemp = BA.NumberToString(_lsttemp.runMethod(true,"IndexOf",(Object)((_code))));Debug.locals.put("indexTemp", _indextemp);Debug.locals.put("indexTemp", _indextemp);
 BA.debugLineNum = 646;BA.debugLine="If indexTemp=-1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_indextemp,BA.NumberToString(-(double) (0 + 1)))) { 
 BA.debugLineNum = 647;BA.debugLine="Dim dt2 As Cursor =MCode.Result(\"Select * From";
Debug.ShouldStop(64);
_dt2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt2 = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblGoroohAshkhas where FldC_Gorooh Like '"),_code,RemoteObject.createImmutable("%'"))));Debug.locals.put("dt2", _dt2);Debug.locals.put("dt2", _dt2);
 BA.debugLineNum = 648;BA.debugLine="If dt2.RowCount>0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_dt2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 649;BA.debugLine="For j=0 To dt2.RowCount-1";
Debug.ShouldStop(256);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_dt2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step16 > 0 && _j <= limit16) || (step16 < 0 && _j >= limit16) ;_j = ((int)(0 + _j + step16))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 650;BA.debugLine="dt2.Position=j";
Debug.ShouldStop(512);
_dt2.runMethod(true,"setPosition",BA.numberCast(int.class, _j));
 BA.debugLineNum = 651;BA.debugLine="Dim code2 As String=dt2.GetString(\"FldC_Goro";
Debug.ShouldStop(1024);
_code2 = _dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("code2", _code2);Debug.locals.put("code2", _code2);
 BA.debugLineNum = 653;BA.debugLine="Dim count As Long";
Debug.ShouldStop(4096);
_count = RemoteObject.createImmutable(0L);Debug.locals.put("count", _count);
 BA.debugLineNum = 654;BA.debugLine="Dim MinCode As String =MCode.SingleResult(\"S";
Debug.ShouldStop(8192);
_mincode = BA.ObjectToString(act_selectmantage.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"),_code2,RemoteObject.createImmutable("%'")))));Debug.locals.put("MinCode", _mincode);Debug.locals.put("MinCode", _mincode);
 BA.debugLineNum = 655;BA.debugLine="Dim sizeCode As Long=dt2.GetString(\"FldC_Gor";
Debug.ShouldStop(16384);
_sizecode = BA.numberCast(long.class, _dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"length"));Debug.locals.put("sizeCode", _sizecode);Debug.locals.put("sizeCode", _sizecode);
 BA.debugLineNum = 656;BA.debugLine="If MinCode.Length=sizeCode Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_mincode.runMethod(true,"length"),BA.numberCast(double.class, _sizecode))) { 
 BA.debugLineNum = 657;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(65536);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 658;BA.debugLine="Item.FldC_Gorooh= dt2.GetString(\"FldC_Goroo";
Debug.ShouldStop(131072);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 659;BA.debugLine="Item.FldN_Gorooh= dt2.GetString(\"FldN_Goroo";
Debug.ShouldStop(262144);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 660;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Add",(Object)((_item)));
 }else {
 BA.debugLineNum = 664;BA.debugLine="If MinCode.Length=sizeCode Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_mincode.runMethod(true,"length"),BA.numberCast(double.class, _sizecode))) { 
 BA.debugLineNum = 665;BA.debugLine="For Each a As AdapterGoroohAshkhas In Orig";
Debug.ShouldStop(16777216);
{
final RemoteObject group29 = act_selectmantage.mostCurrent._originallistgoroohashkhas2;
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_a = (group29.runMethod(false,"Get",index29));Debug.locals.put("a", _a);
Debug.locals.put("a", _a);
 BA.debugLineNum = 666;BA.debugLine="If a.FldC_Gorooh.SubString2(0,3)=code2 Th";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_a.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),_code2)) { 
 BA.debugLineNum = 667;BA.debugLine="count=1";
Debug.ShouldStop(67108864);
_count = BA.numberCast(long.class, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 668;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 };
 }
}Debug.locals.put("a", _a);
;
 BA.debugLineNum = 671;BA.debugLine="If count =0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 672;BA.debugLine="Dim NameGroup,CodeGroup As String";
Debug.ShouldStop(-2147483648);
_namegroup = RemoteObject.createImmutable("");Debug.locals.put("NameGroup", _namegroup);
_codegroup = RemoteObject.createImmutable("");Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 673;BA.debugLine="CodeGroup=MinCode";
Debug.ShouldStop(1);
_codegroup = _mincode;Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 674;BA.debugLine="NameGroup=MCode.SingleResult(\"Select FldN";
Debug.ShouldStop(2);
_namegroup = BA.ObjectToString(act_selectmantage.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"),_mincode,RemoteObject.createImmutable("'")))));Debug.locals.put("NameGroup", _namegroup);
 BA.debugLineNum = 675;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(4);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 676;BA.debugLine="Item.FldC_Gorooh= CodeGroup";
Debug.ShouldStop(8);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_codegroup);
 BA.debugLineNum = 677;BA.debugLine="Item.FldN_Gorooh= NameGroup";
Debug.ShouldStop(16);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_namegroup);
 BA.debugLineNum = 678;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
Debug.ShouldStop(32);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Add",(Object)((_item)));
 };
 }else {
 };
 };
 }
}Debug.locals.put("j", _j);
;
 };
 BA.debugLineNum = 697;BA.debugLine="lstTemp.Add(code)";
Debug.ShouldStop(16777216);
_lsttemp.runVoidMethod ("Add",(Object)((_code)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 788;BA.debugLine="ListGoroohAshkhas2 = OriginalListGoroohAshkhas2";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._listgoroohashkhas2 = act_selectmantage.mostCurrent._originallistgoroohashkhas2;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e54) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e54.toString()); BA.debugLineNum = 791;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","523068831",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 792;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8388608);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadAcSpGroohAshkas"))));
 };
 BA.debugLineNum = 794;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadashkhas() throws Exception{
try {
		Debug.PushSubsStack("LoadAshkhas (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,292);
if (RapidSub.canDelegate("loadashkhas")) { ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","loadashkhas"); return;}
ResumableSub_LoadAshkhas rsub = new ResumableSub_LoadAshkhas(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadAshkhas extends BA.ResumableSub {
public ResumableSub_LoadAshkhas(ir.parsikhesab.pakhsh.act_selectmantage parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_selectmantage parent;
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _countfilter = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.createImmutable(false);
RemoteObject _datemiladi = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _cutedad = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _search = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadAshkhas (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,292);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 293;BA.debugLine="Try";
Debug.ShouldStop(16);
if (true) break;

case 1:
//try
this.state = 212;
this.catchState = 211;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 211;
 BA.debugLineNum = 295;BA.debugLine="UpdateVaziatAshkhas";
Debug.ShouldStop(64);
_updatevaziatashkhas();
 BA.debugLineNum = 296;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_selectmantage.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_selectmantage", "loadashkhas"),BA.numberCast(int.class, 1000));
this.state = 213;
return;
case 213:
//C
this.state = 4;
;
 BA.debugLineNum = 297;BA.debugLine="Dim str As String=\"\"";
Debug.ShouldStop(256);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 298;BA.debugLine="Dim countfilter As Int=0";
Debug.ShouldStop(512);
_countfilter = BA.numberCast(int.class, 0);Debug.locals.put("countfilter", _countfilter);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 299;BA.debugLine="Dim filter As Boolean=False";
Debug.ShouldStop(1024);
_filter = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("filter", _filter);Debug.locals.put("filter", _filter);
 BA.debugLineNum = 300;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 301;BA.debugLine="Dim DateMiladi As String = MCode.ConvertNumbersP";
Debug.ShouldStop(4096);
_datemiladi = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("DateMiladi", _datemiladi);Debug.locals.put("DateMiladi", _datemiladi);
 BA.debugLineNum = 302;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(8192);
_time = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 303;BA.debugLine="Dim Date As String =MCode.DatePersian '& \"T\" & T";
Debug.ShouldStop(16384);
parent.mostCurrent._date = parent.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA);
 BA.debugLineNum = 304;BA.debugLine="LogColor(\"D: \" & Date,Colors.Red)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","522937612",RemoteObject.concat(RemoteObject.createImmutable("D: "),parent.mostCurrent._date),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 305;BA.debugLine="Dim CuTedad As Cursor";
Debug.ShouldStop(65536);
_cutedad = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 306;BA.debugLine="Log(GroupCodeSelect1)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","522937614",parent.mostCurrent._groupcodeselect1,0);
 BA.debugLineNum = 307;BA.debugLine="Log(GroupCodeSelect2)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","522937615",parent.mostCurrent._groupcodeselect2,0);
 BA.debugLineNum = 308;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 The";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 77;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",parent.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 309;BA.debugLine="If SwVisit.Checked=True Then";
Debug.ShouldStop(1048576);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swvisit.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 310;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2097152);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 312;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
Debug.ShouldStop(8388608);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and FldLastVisit <> 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 313;BA.debugLine="filter=True";
Debug.ShouldStop(16777216);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 314;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 315;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(67108864);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
 BA.debugLineNum = 319;BA.debugLine="If SwBlackList.Checked=True Then";
Debug.ShouldStop(1073741824);

case 14:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swblacklist.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 320;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(-2147483648);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 322;BA.debugLine="str= str & \" and fldBlackList = 1 \"";
Debug.ShouldStop(2);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldBlackList = 1 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 323;BA.debugLine="filter=True";
Debug.ShouldStop(4);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 324;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(8);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 325;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(16);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;
;
 BA.debugLineNum = 329;BA.debugLine="If SwNew.Checked=True Then";
Debug.ShouldStop(256);

case 21:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swnew.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 330;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(512);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 332;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
Debug.ShouldStop(2048);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and length(fldCodetafzili)>5 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 333;BA.debugLine="filter=True";
Debug.ShouldStop(4096);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 334;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(8192);
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 335;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(16384);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
 BA.debugLineNum = 339;BA.debugLine="If SwBed.Checked=True Then";
Debug.ShouldStop(262144);

case 28:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbed.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 340;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(524288);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 342;BA.debugLine="str= str & \" and fldMande > 0 \"";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande > 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 343;BA.debugLine="filter=True";
Debug.ShouldStop(4194304);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 344;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 345;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(16777216);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;
;
 BA.debugLineNum = 349;BA.debugLine="If SwBes.Checked=True Then";
Debug.ShouldStop(268435456);

case 35:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbes.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 350;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(536870912);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 352;BA.debugLine="str= str & \" and fldMande < 0 \"";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande < 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 353;BA.debugLine="filter=True";
Debug.ShouldStop(1);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 354;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(2);
if (true) break;

case 38:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 355;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(4);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 41:
//C
this.state = 42;
;
 if (true) break;
;
 BA.debugLineNum = 361;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(256);

case 42:
//if
this.state = 65;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 363;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
Debug.ShouldStop(1024);
_search = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(parent.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 364;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 45:
//if
this.state = 48;
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 365;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(4096);
_search = parent.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 if (true) break;

case 48:
//C
this.state = 49;
;
 BA.debugLineNum = 367;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16384);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 368;BA.debugLine="If swSearchByAddress.Checked Then";
Debug.ShouldStop(32768);
if (true) break;

case 49:
//if
this.state = 60;
if (parent.mostCurrent._swsearchbyaddress.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 51;
}else {
this.state = 53;
}if (true) break;

case 51:
//C
this.state = 60;
 BA.debugLineNum = 369;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldAdress like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 371;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(262144);
if (true) break;

case 54:
//if
this.state = 59;
if (parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
this.state = 56;
}else {
this.state = 58;
}if (true) break;

case 56:
//C
this.state = 59;
 BA.debugLineNum = 372;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
Debug.ShouldStop(524288);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodetafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 374;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSharheTafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 377;BA.debugLine="filter=True";
Debug.ShouldStop(16777216);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 378;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 61:
//if
this.state = 64;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 379;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(67108864);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 64:
//C
this.state = 65;
;
 if (true) break;
;
 BA.debugLineNum = 383;BA.debugLine="If SwTourToday.Checked=True Then";
Debug.ShouldStop(1073741824);

case 65:
//if
this.state = 76;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swtourtoday.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 67;
}else {
this.state = 69;
}if (true) break;

case 67:
//C
this.state = 76;
 BA.debugLineNum = 384;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(-2147483648);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 385;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(1);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 386;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(2);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 388;BA.debugLine="str=$\"SELECT TblAshkhas.*, tblTourVisitor.fldR";
Debug.ShouldStop(8);
_str = (RemoteObject.concat(RemoteObject.createImmutable("SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldType FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldType='Tour' AND fldDateVisit = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)))),RemoteObject.createImmutable(" ORDER BY fldRadif ASC")));Debug.locals.put("str", _str);
 if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 392;BA.debugLine="If filter=True And str<>\"\" Then";
Debug.ShouldStop(128);
if (true) break;

case 70:
//if
this.state = 75;
if (RemoteObject.solveBoolean("=",_filter,parent.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
this.state = 72;
}else {
this.state = 74;
}if (true) break;

case 72:
//C
this.state = 75;
 BA.debugLineNum = 393;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(256);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where "),_str,RemoteObject.createImmutable(" and FldLastVisit > '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 394;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(512);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 395;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(1024);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where "),_str,RemoteObject.createImmutable(" and FldLastSefaresh > '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 396;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(2048);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 399;BA.debugLine="str=\"Select * From TblAshkhas where \"&str&\" \"";
Debug.ShouldStop(16384);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas where "),_str,RemoteObject.createImmutable(" "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 401;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(65536);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 402;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(131072);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 403;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(262144);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 404;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(524288);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 406;BA.debugLine="str=\"Select * From TblAshkhas \"&Str_sort";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 if (true) break;

case 75:
//C
this.state = 76;
;
 BA.debugLineNum = 409;BA.debugLine="Log(str)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","522937717",_str,0);
 if (true) break;

case 76:
//C
this.state = 77;
;
 if (true) break;
;
 BA.debugLineNum = 414;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Th";
Debug.ShouldStop(536870912);

case 77:
//if
this.state = 143;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",parent.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 416;BA.debugLine="If SwVisit.Checked=True Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 80:
//if
this.state = 87;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swvisit.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 82;
}if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 417;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 419;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and FldLastVisit <> 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 420;BA.debugLine="filter=True";
Debug.ShouldStop(8);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 421;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(16);
if (true) break;

case 83:
//if
this.state = 86;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 85;
}if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 422;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(32);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;
;
 BA.debugLineNum = 426;BA.debugLine="If SwNew.Checked=True Then";
Debug.ShouldStop(512);

case 87:
//if
this.state = 94;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swnew.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
 BA.debugLineNum = 427;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1024);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 429;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
Debug.ShouldStop(4096);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and length(fldCodetafzili)>5 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 430;BA.debugLine="filter=True";
Debug.ShouldStop(8192);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 431;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(16384);
if (true) break;

case 90:
//if
this.state = 93;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 92;
}if (true) break;

case 92:
//C
this.state = 93;
 BA.debugLineNum = 432;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(32768);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 93:
//C
this.state = 94;
;
 if (true) break;
;
 BA.debugLineNum = 436;BA.debugLine="If SwBed.Checked=True Then";
Debug.ShouldStop(524288);

case 94:
//if
this.state = 101;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbed.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 437;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1048576);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 439;BA.debugLine="str= str & \" and fldMande > 0 \"";
Debug.ShouldStop(4194304);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande > 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 440;BA.debugLine="filter=True";
Debug.ShouldStop(8388608);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 441;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 97:
//if
this.state = 100;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 99;
}if (true) break;

case 99:
//C
this.state = 100;
 BA.debugLineNum = 442;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(33554432);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 100:
//C
this.state = 101;
;
 if (true) break;
;
 BA.debugLineNum = 446;BA.debugLine="If SwBes.Checked=True Then";
Debug.ShouldStop(536870912);

case 101:
//if
this.state = 108;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbes.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 103;
}if (true) break;

case 103:
//C
this.state = 104;
 BA.debugLineNum = 447;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1073741824);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 449;BA.debugLine="str= str & \" and fldMande < 0 \"";
Debug.ShouldStop(1);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande < 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 450;BA.debugLine="filter=True";
Debug.ShouldStop(2);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 451;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4);
if (true) break;

case 104:
//if
this.state = 107;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 106;
}if (true) break;

case 106:
//C
this.state = 107;
 BA.debugLineNum = 452;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 107:
//C
this.state = 108;
;
 if (true) break;
;
 BA.debugLineNum = 457;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(256);

case 108:
//if
this.state = 131;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 110;
}if (true) break;

case 110:
//C
this.state = 111;
 BA.debugLineNum = 459;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
Debug.ShouldStop(1024);
_search = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(parent.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 460;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 111:
//if
this.state = 114;
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
this.state = 113;
}if (true) break;

case 113:
//C
this.state = 114;
 BA.debugLineNum = 461;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(4096);
_search = parent.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 if (true) break;

case 114:
//C
this.state = 115;
;
 BA.debugLineNum = 463;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16384);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 464;BA.debugLine="If swSearchByAddress.Checked Then";
Debug.ShouldStop(32768);
if (true) break;

case 115:
//if
this.state = 126;
if (parent.mostCurrent._swsearchbyaddress.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 117;
}else {
this.state = 119;
}if (true) break;

case 117:
//C
this.state = 126;
 BA.debugLineNum = 465;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldAdress like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 119:
//C
this.state = 120;
 BA.debugLineNum = 467;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(262144);
if (true) break;

case 120:
//if
this.state = 125;
if (parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
this.state = 122;
}else {
this.state = 124;
}if (true) break;

case 122:
//C
this.state = 125;
 BA.debugLineNum = 468;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
Debug.ShouldStop(524288);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodetafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 124:
//C
this.state = 125;
 BA.debugLineNum = 470;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSharheTafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 125:
//C
this.state = 126;
;
 if (true) break;

case 126:
//C
this.state = 127;
;
 BA.debugLineNum = 473;BA.debugLine="filter=True";
Debug.ShouldStop(16777216);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 474;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 127:
//if
this.state = 130;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 129;
}if (true) break;

case 129:
//C
this.state = 130;
 BA.debugLineNum = 475;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(67108864);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 130:
//C
this.state = 131;
;
 if (true) break;
;
 BA.debugLineNum = 478;BA.debugLine="If SwTourToday.Checked=True Then";
Debug.ShouldStop(536870912);

case 131:
//if
this.state = 142;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swtourtoday.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 133;
}else {
this.state = 135;
}if (true) break;

case 133:
//C
this.state = 142;
 BA.debugLineNum = 479;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(1073741824);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 480;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 481;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(1);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 483;BA.debugLine="str=$\"SELECT TblAshkhas.*, tblTourVisitor.fldR";
Debug.ShouldStop(4);
_str = (RemoteObject.concat(RemoteObject.createImmutable("SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldType FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldType='Tour' AND fldDateVisit = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)))),RemoteObject.createImmutable(" ORDER BY fldRadif ASC")));Debug.locals.put("str", _str);
 if (true) break;

case 135:
//C
this.state = 136;
 BA.debugLineNum = 487;BA.debugLine="If filter=True And str<>\"\" Then";
Debug.ShouldStop(64);
if (true) break;

case 136:
//if
this.state = 141;
if (RemoteObject.solveBoolean("=",_filter,parent.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
this.state = 138;
}else {
this.state = 140;
}if (true) break;

case 138:
//C
this.state = 141;
 BA.debugLineNum = 488;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(128);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" and FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 489;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(256);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 490;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(512);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" and FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 491;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(1024);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 493;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGr";
Debug.ShouldStop(4096);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 BA.debugLineNum = 494;BA.debugLine="Log(str)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","522937802",_str,0);
 if (true) break;

case 140:
//C
this.state = 141;
 BA.debugLineNum = 496;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(32768);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 497;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(65536);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 498;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(131072);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 499;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(262144);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 501;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGr";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 BA.debugLineNum = 502;BA.debugLine="Log(str)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","522937810",_str,0);
 if (true) break;

case 141:
//C
this.state = 142;
;
 if (true) break;

case 142:
//C
this.state = 143;
;
 if (true) break;
;
 BA.debugLineNum = 509;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 T";
Debug.ShouldStop(268435456);

case 143:
//if
this.state = 209;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("!",parent.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
this.state = 145;
}if (true) break;

case 145:
//C
this.state = 146;
 BA.debugLineNum = 510;BA.debugLine="If SwVisit.Checked=True Then";
Debug.ShouldStop(536870912);
if (true) break;

case 146:
//if
this.state = 153;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swvisit.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 148;
}if (true) break;

case 148:
//C
this.state = 149;
 BA.debugLineNum = 511;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1073741824);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 513;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
Debug.ShouldStop(1);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and FldLastVisit <> 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 514;BA.debugLine="filter=True";
Debug.ShouldStop(2);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 515;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4);
if (true) break;

case 149:
//if
this.state = 152;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 151;
}if (true) break;

case 151:
//C
this.state = 152;
 BA.debugLineNum = 516;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 152:
//C
this.state = 153;
;
 if (true) break;
;
 BA.debugLineNum = 520;BA.debugLine="If SwNew.Checked=True Then";
Debug.ShouldStop(128);

case 153:
//if
this.state = 160;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swnew.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
 BA.debugLineNum = 521;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(256);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 523;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
Debug.ShouldStop(1024);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and length(fldCodetafzili)>5 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 524;BA.debugLine="filter=True";
Debug.ShouldStop(2048);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 525;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4096);
if (true) break;

case 156:
//if
this.state = 159;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 158;
}if (true) break;

case 158:
//C
this.state = 159;
 BA.debugLineNum = 526;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8192);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 159:
//C
this.state = 160;
;
 if (true) break;
;
 BA.debugLineNum = 530;BA.debugLine="If SwBed.Checked=True Then";
Debug.ShouldStop(131072);

case 160:
//if
this.state = 167;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbed.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 162;
}if (true) break;

case 162:
//C
this.state = 163;
 BA.debugLineNum = 531;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(262144);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 533;BA.debugLine="str= str & \" and fldMande > 0 \"";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande > 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 534;BA.debugLine="filter=True";
Debug.ShouldStop(2097152);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 535;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 163:
//if
this.state = 166;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 165;
}if (true) break;

case 165:
//C
this.state = 166;
 BA.debugLineNum = 536;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8388608);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 166:
//C
this.state = 167;
;
 if (true) break;
;
 BA.debugLineNum = 540;BA.debugLine="If SwBes.Checked=True Then";
Debug.ShouldStop(134217728);

case 167:
//if
this.state = 174;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbes.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 169;
}if (true) break;

case 169:
//C
this.state = 170;
 BA.debugLineNum = 541;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(268435456);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 543;BA.debugLine="str= str & \" and fldMande < 0 \"";
Debug.ShouldStop(1073741824);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande < 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 544;BA.debugLine="filter=True";
Debug.ShouldStop(-2147483648);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 545;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(1);
if (true) break;

case 170:
//if
this.state = 173;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 172;
}if (true) break;

case 172:
//C
this.state = 173;
 BA.debugLineNum = 546;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(2);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 173:
//C
this.state = 174;
;
 if (true) break;
;
 BA.debugLineNum = 551;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(64);

case 174:
//if
this.state = 197;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 176;
}if (true) break;

case 176:
//C
this.state = 177;
 BA.debugLineNum = 553;BA.debugLine="Dim Search As String=TxtSearch.Text";
Debug.ShouldStop(256);
_search = parent.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 554;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(512);
if (true) break;

case 177:
//if
this.state = 180;
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
this.state = 179;
}if (true) break;

case 179:
//C
this.state = 180;
 BA.debugLineNum = 555;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(1024);
_search = parent.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 if (true) break;

case 180:
//C
this.state = 181;
;
 BA.debugLineNum = 557;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(4096);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 558;BA.debugLine="If swSearchByAddress.Checked Then";
Debug.ShouldStop(8192);
if (true) break;

case 181:
//if
this.state = 192;
if (parent.mostCurrent._swsearchbyaddress.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 183;
}else {
this.state = 185;
}if (true) break;

case 183:
//C
this.state = 192;
 BA.debugLineNum = 559;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
Debug.ShouldStop(16384);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldAdress like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 185:
//C
this.state = 186;
 BA.debugLineNum = 561;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(65536);
if (true) break;

case 186:
//if
this.state = 191;
if (parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
this.state = 188;
}else {
this.state = 190;
}if (true) break;

case 188:
//C
this.state = 191;
 BA.debugLineNum = 562;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
Debug.ShouldStop(131072);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodetafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 190:
//C
this.state = 191;
 BA.debugLineNum = 564;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
Debug.ShouldStop(524288);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSharheTafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 191:
//C
this.state = 192;
;
 if (true) break;

case 192:
//C
this.state = 193;
;
 BA.debugLineNum = 568;BA.debugLine="filter=True";
Debug.ShouldStop(8388608);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 569;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 193:
//if
this.state = 196;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 195;
}if (true) break;

case 195:
//C
this.state = 196;
 BA.debugLineNum = 570;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(33554432);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 196:
//C
this.state = 197;
;
 if (true) break;
;
 BA.debugLineNum = 573;BA.debugLine="If SwTourToday.Checked=True Then";
Debug.ShouldStop(268435456);

case 197:
//if
this.state = 208;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swtourtoday.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 199;
}else {
this.state = 201;
}if (true) break;

case 199:
//C
this.state = 208;
 BA.debugLineNum = 574;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(536870912);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 575;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 576;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(-2147483648);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 578;BA.debugLine="str=$\"SELECT TblAshkhas.*, tblTourVisitor.fldR";
Debug.ShouldStop(2);
_str = (RemoteObject.concat(RemoteObject.createImmutable("SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldType FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldType='Tour' AND fldDateVisit = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)))),RemoteObject.createImmutable(" ORDER BY fldRadif ASC")));Debug.locals.put("str", _str);
 if (true) break;

case 201:
//C
this.state = 202;
 BA.debugLineNum = 582;BA.debugLine="If filter=True And str<>\"\" Then";
Debug.ShouldStop(32);
if (true) break;

case 202:
//if
this.state = 207;
if (RemoteObject.solveBoolean("=",_filter,parent.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
this.state = 204;
}else {
this.state = 206;
}if (true) break;

case 204:
//C
this.state = 207;
 BA.debugLineNum = 583;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(64);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" and FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 584;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(128);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 585;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(256);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" and FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 586;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(512);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 590;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGro";
Debug.ShouldStop(8192);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 if (true) break;

case 206:
//C
this.state = 207;
 BA.debugLineNum = 592;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(32768);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%'"),RemoteObject.createImmutable(" and FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 593;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(65536);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 594;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
Debug.ShouldStop(131072);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%'"),RemoteObject.createImmutable(" and FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 595;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(262144);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 597;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGr";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 if (true) break;

case 207:
//C
this.state = 208;
;
 if (true) break;

case 208:
//C
this.state = 209;
;
 BA.debugLineNum = 602;BA.debugLine="Log(str)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","522937910",_str,0);
 if (true) break;

case 209:
//C
this.state = 212;
;
 BA.debugLineNum = 604;BA.debugLine="Sleep(200)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_selectmantage.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_selectmantage", "loadashkhas"),BA.numberCast(int.class, 200));
this.state = 214;
return;
case 214:
//C
this.state = 212;
;
 BA.debugLineNum = 605;BA.debugLine="LoadListAshkhas(str)";
Debug.ShouldStop(268435456);
_loadlistashkhas(_str);
 Debug.CheckDeviceExceptions();
if (true) break;

case 211:
//C
this.state = 212;
this.catchState = 0;
 BA.debugLineNum = 607;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","522937915",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 608;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadAshkhas"))));
 if (true) break;
if (true) break;

case 212:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 610;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e0.toString());}
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
public static RemoteObject  _loadgoroohashkasback(RemoteObject _code) throws Exception{
try {
		Debug.PushSubsStack("LoadGoroohAshkasBack (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,986);
if (RapidSub.canDelegate("loadgoroohashkasback")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","loadgoroohashkasback", _code);}
RemoteObject _c_gorooh = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _item1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
Debug.locals.put("Code", _code);
 BA.debugLineNum = 986;BA.debugLine="Sub LoadGoroohAshkasBack(Code As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 987;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 988;BA.debugLine="Dim C_Gorooh As String = MCode.Sf.Left(Code,Code";
Debug.ShouldStop(134217728);
_c_gorooh = act_selectmantage.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vv0",(Object)(_code),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_code.runMethod(true,"length"),RemoteObject.createImmutable(6)}, "-",1, 1))));Debug.locals.put("C_Gorooh", _c_gorooh);Debug.locals.put("C_Gorooh", _c_gorooh);
 BA.debugLineNum = 989;BA.debugLine="If C_Gorooh.Length=0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_c_gorooh.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 990;BA.debugLine="OriginalListGoroohAshkhas2.Clear";
Debug.ShouldStop(536870912);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Clear");
 BA.debugLineNum = 991;BA.debugLine="LoadAcSpGroohAshkas2";
Debug.ShouldStop(1073741824);
_loadacspgroohashkas2();
 BA.debugLineNum = 992;BA.debugLine="HLVGoroohAshkhas.notifyDataSetChanged";
Debug.ShouldStop(-2147483648);
act_selectmantage.mostCurrent._hlvgoroohashkhas.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 993;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(1);
_loadashkhas();
 BA.debugLineNum = 994;BA.debugLine="Return";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 996;BA.debugLine="Dim Count As Int = C_Gorooh.Length + 3";
Debug.ShouldStop(8);
_count = RemoteObject.solve(new RemoteObject[] {_c_gorooh.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 997;BA.debugLine="Dim Dt As Cursor=MCode.Result(\"Select FldC_Goroo";
Debug.ShouldStop(16);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_c_gorooh,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 998;BA.debugLine="If Dt.RowCount>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_dt.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 999;BA.debugLine="OriginalListGoroohAshkhas2.Clear";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Clear");
 BA.debugLineNum = 1000;BA.debugLine="Dim Item1 As AdapterGoroohAshkhas";
Debug.ShouldStop(128);
_item1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 1001;BA.debugLine="Item1.FldC_Gorooh= 0";
Debug.ShouldStop(256);
_item1.setField ("FldC_Gorooh" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 1002;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
Debug.ShouldStop(512);
_item1.setField ("FldN_Gorooh" /*RemoteObject*/ ,BA.ObjectToString("همه گروه ها"));
 BA.debugLineNum = 1003;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item1)";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Add",(Object)((_item1)));
 BA.debugLineNum = 1004;BA.debugLine="For i=0 To Dt.RowCount-1";
Debug.ShouldStop(2048);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_dt.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1005;BA.debugLine="Dt.Position=i";
Debug.ShouldStop(4096);
_dt.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1006;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(8192);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1007;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(16384);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 1008;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(32768);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 1009;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
Debug.ShouldStop(65536);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1010;BA.debugLine="MCode.C_LayeAshkhas=Item.FldC_Gorooh";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent._mcode._c_layeashkhas /*RemoteObject*/  = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1012;BA.debugLine="ListGoroohAshkhas2 = OriginalListGoroohAshkhas2";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._listgoroohashkhas2 = act_selectmantage.mostCurrent._originallistgoroohashkhas2;
 BA.debugLineNum = 1013;BA.debugLine="HLVGoroohAshkhas.notifyDataSetChanged";
Debug.ShouldStop(1048576);
act_selectmantage.mostCurrent._hlvgoroohashkhas.runVoidMethodAndSync ("notifyDataSetChanged");
 };
 BA.debugLineNum = 1015;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(4194304);
_loadashkhas();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e31) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e31.toString()); BA.debugLineNum = 1017;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","523265311",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1018;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(33554432);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadGoroohAshkasBack"))));
 };
 BA.debugLineNum = 1020;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgoroohashkasback1(RemoteObject _code) throws Exception{
try {
		Debug.PushSubsStack("LoadGoroohAshkasBack1 (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,962);
if (RapidSub.canDelegate("loadgoroohashkasback1")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","loadgoroohashkasback1", _code);}
RemoteObject _c_gorooh = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _item1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
Debug.locals.put("Code", _code);
 BA.debugLineNum = 962;BA.debugLine="Sub LoadGoroohAshkasBack1(Code As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 963;BA.debugLine="Dim C_Gorooh As String = MCode.Sf.Left(Code,Code.";
Debug.ShouldStop(4);
_c_gorooh = act_selectmantage.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vv0",(Object)(_code),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_code.runMethod(true,"length"),RemoteObject.createImmutable(6)}, "-",1, 1))));Debug.locals.put("C_Gorooh", _c_gorooh);Debug.locals.put("C_Gorooh", _c_gorooh);
 BA.debugLineNum = 964;BA.debugLine="Dim Count As Int = C_Gorooh.Length + 3";
Debug.ShouldStop(8);
_count = RemoteObject.solve(new RemoteObject[] {_c_gorooh.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 965;BA.debugLine="Dim Dt As Cursor=MCode.Result(\"Select FldC_Gorooh";
Debug.ShouldStop(16);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_c_gorooh,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 966;BA.debugLine="If Dt.RowCount>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_dt.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 967;BA.debugLine="OriginalListGoroohAshkhas2.Clear";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Clear");
 BA.debugLineNum = 968;BA.debugLine="Dim Item1 As AdapterGoroohAshkhas";
Debug.ShouldStop(128);
_item1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 969;BA.debugLine="Item1.FldC_Gorooh= 0";
Debug.ShouldStop(256);
_item1.setField ("FldC_Gorooh" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 970;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
Debug.ShouldStop(512);
_item1.setField ("FldN_Gorooh" /*RemoteObject*/ ,BA.ObjectToString("همه گروه ها"));
 BA.debugLineNum = 971;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item1)";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Add",(Object)((_item1)));
 BA.debugLineNum = 972;BA.debugLine="For i=0 To Dt.RowCount-1";
Debug.ShouldStop(2048);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_dt.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 973;BA.debugLine="Dt.Position=i";
Debug.ShouldStop(4096);
_dt.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 974;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(8192);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 975;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(16384);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 976;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(32768);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 977;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
Debug.ShouldStop(65536);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 978;BA.debugLine="MCode.C_LayeAshkhas=Item.FldC_Gorooh";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent._mcode._c_layeashkhas /*RemoteObject*/  = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 980;BA.debugLine="ListGoroohAshkhas2 = OriginalListGoroohAshkhas2";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._listgoroohashkhas2 = act_selectmantage.mostCurrent._originallistgoroohashkhas2;
 BA.debugLineNum = 981;BA.debugLine="HLVGoroohAshkhas.notifyDataSetChanged";
Debug.ShouldStop(1048576);
act_selectmantage.mostCurrent._hlvgoroohashkhas.runVoidMethodAndSync ("notifyDataSetChanged");
 };
 BA.debugLineNum = 983;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(4194304);
_loadashkhas();
 BA.debugLineNum = 984;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadgoroohashkhasgo(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LoadGoroohAshkhasGo (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1055);
if (RapidSub.canDelegate("loadgoroohashkhasgo")) { ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","loadgoroohashkhasgo", _position); return;}
ResumableSub_LoadGoroohAshkhasGo rsub = new ResumableSub_LoadGoroohAshkhasGo(null,_position);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadGoroohAshkhasGo extends BA.ResumableSub {
public ResumableSub_LoadGoroohAshkhasGo(ir.parsikhesab.pakhsh.act_selectmantage parent,RemoteObject _position) {
this.parent = parent;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_selectmantage parent;
RemoteObject _position;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
int step10;
int limit10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadGoroohAshkhasGo (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1055);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1056;BA.debugLine="Sleep(100)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_selectmantage.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_selectmantage", "loadgoroohashkhasgo"),BA.numberCast(int.class, 100));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 1057;BA.debugLine="Dim Item = ListGoroohAshkhas2.Get(Position) As Ad";
Debug.ShouldStop(1);
_item = (parent.mostCurrent._listgoroohashkhas2.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1058;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(2);
parent.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1060;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(8);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1061;BA.debugLine="Dim Dt As Cursor=MCode.Result(\"Select FldC_Gorooh";
Debug.ShouldStop(16);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 1062;BA.debugLine="If Dt.RowCount>0 Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",_dt.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1063;BA.debugLine="lblBackGroup.Visible=True";
Debug.ShouldStop(64);
parent.mostCurrent._lblbackgroup.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1064;BA.debugLine="ListGoroohAshkhas2.Clear";
Debug.ShouldStop(128);
parent.mostCurrent._listgoroohashkhas2.runVoidMethod ("Clear");
 BA.debugLineNum = 1065;BA.debugLine="OriginalListGoroohAshkhas2.Clear";
Debug.ShouldStop(256);
parent.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Clear");
 BA.debugLineNum = 1067;BA.debugLine="For i=0 To Dt.RowCount-1";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//for
this.state = 7;
step10 = 1;
limit10 = RemoteObject.solve(new RemoteObject[] {_dt.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step10)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 1068;BA.debugLine="Dt.Position=i";
Debug.ShouldStop(2048);
_dt.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1069;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(4096);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1070;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(8192);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 1071;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(16384);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 1072;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
Debug.ShouldStop(32768);
parent.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1073;BA.debugLine="MCode.C_LayeAshkhas=Item.FldC_Gorooh";
Debug.ShouldStop(65536);
parent.mostCurrent._mcode._c_layeashkhas /*RemoteObject*/  = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1075;BA.debugLine="ListGoroohAshkhas2 = OriginalListGoroohAshkhas2";
Debug.ShouldStop(262144);
parent.mostCurrent._listgoroohashkhas2 = parent.mostCurrent._originallistgoroohashkhas2;
 BA.debugLineNum = 1076;BA.debugLine="HLVGoroohAshkhas.notifyDataSetChanged";
Debug.ShouldStop(524288);
parent.mostCurrent._hlvgoroohashkhas.runVoidMethodAndSync ("notifyDataSetChanged");
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1078;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(2097152);
_loadashkhas();
 BA.debugLineNum = 1079;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _loadlistashkhas(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("LoadListAshkhas (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1399);
if (RapidSub.canDelegate("loadlistashkhas")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","loadlistashkhas", _query);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _itemashkhas = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");
Debug.locals.put("Query", _query);
 BA.debugLineNum = 1399;BA.debugLine="Sub LoadListAshkhas(Query As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1400;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 1401;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
Debug.ShouldStop(16777216);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_query));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1402;BA.debugLine="OrginalListAshkhas.Clear";
Debug.ShouldStop(33554432);
act_selectmantage.mostCurrent._orginallistashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 1403;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1404;BA.debugLine="For i = 0 To Cu.RowCount - 1";
Debug.ShouldStop(134217728);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1405;BA.debugLine="Dim ItemAshkhas As AdapterListAshkhas";
Debug.ShouldStop(268435456);
_itemashkhas = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");Debug.locals.put("ItemAshkhas", _itemashkhas);
 BA.debugLineNum = 1406;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(536870912);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1407;BA.debugLine="ItemAshkhas.CodeTafzili=Cu.Getstring(\"fldCodeta";
Debug.ShouldStop(1073741824);
_itemashkhas.setField ("CodeTafzili" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili"))));
 BA.debugLineNum = 1408;BA.debugLine="ItemAshkhas.SharhTafzili=Cu.Getstring(\"fldSharh";
Debug.ShouldStop(-2147483648);
_itemashkhas.setField ("SharhTafzili" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili"))));
 BA.debugLineNum = 1409;BA.debugLine="ItemAshkhas.Address=Cu.Getstring(\"fldAdress\")";
Debug.ShouldStop(1);
_itemashkhas.setField ("Address" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldAdress"))));
 BA.debugLineNum = 1410;BA.debugLine="ItemAshkhas.Tell=Cu.Getstring(\"fldTell\")";
Debug.ShouldStop(2);
_itemashkhas.setField ("Tell" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell"))));
 BA.debugLineNum = 1411;BA.debugLine="ItemAshkhas.FldMobile=myCode.Is_Null(Cu.GetStri";
Debug.ShouldStop(4);
_itemashkhas.setField ("FldMobile" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMobile"))))));
 BA.debugLineNum = 1412;BA.debugLine="ItemAshkhas.FldVaziat=myCode.Is_Null(Cu.GetStri";
Debug.ShouldStop(8);
_itemashkhas.setField ("FldVaziat" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVaziat"))))));
 BA.debugLineNum = 1413;BA.debugLine="ItemAshkhas.FldEtebar=myCode.Is_Null(Cu.GetStri";
Debug.ShouldStop(16);
_itemashkhas.setField ("FldEtebar" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEtebar"))))));
 BA.debugLineNum = 1414;BA.debugLine="ItemAshkhas.lastSeen=Cu.GetString(\"lastSeen\")";
Debug.ShouldStop(32);
_itemashkhas.setField ("lastSeen" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("lastSeen"))));
 BA.debugLineNum = 1415;BA.debugLine="ItemAshkhas.lastOrderDate=myCode.Is_Null(Cu.Get";
Debug.ShouldStop(64);
_itemashkhas.setField ("lastOrderDate" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("lastOrderDate"))))));
 BA.debugLineNum = 1416;BA.debugLine="ItemAshkhas.Mande=Cu.Getstring(\"fldMande\")";
Debug.ShouldStop(128);
_itemashkhas.setField ("Mande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMande"))));
 BA.debugLineNum = 1417;BA.debugLine="ItemAshkhas.FldLastVisit=myCode.Is_Null(Cu.GetS";
Debug.ShouldStop(256);
_itemashkhas.setField ("FldLastVisit" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLastVisit"))))));
 BA.debugLineNum = 1418;BA.debugLine="ItemAshkhas.FldLastSefaresh=myCode.Is_Null(Cu.G";
Debug.ShouldStop(512);
_itemashkhas.setField ("FldLastSefaresh" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLastSefaresh"))))));
 BA.debugLineNum = 1419;BA.debugLine="ItemAshkhas.FldC_Gorooh=Cu.GetString(\"fldCodeGr";
Debug.ShouldStop(1024);
_itemashkhas.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroup"))));
 BA.debugLineNum = 1420;BA.debugLine="ItemAshkhas.FldN_Gorooh=Cu.GetString(\"fldNameGr";
Debug.ShouldStop(2048);
_itemashkhas.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameGroup"))));
 BA.debugLineNum = 1421;BA.debugLine="ItemAshkhas.FldC_Posti=myCode.Is_Null(Cu.GetStr";
Debug.ShouldStop(4096);
_itemashkhas.setField ("FldC_Posti" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Posti"))))));
 BA.debugLineNum = 1422;BA.debugLine="ItemAshkhas.FldC_Meli=myCode.Is_Null(Cu.GetStri";
Debug.ShouldStop(8192);
_itemashkhas.setField ("FldC_Meli" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Meli"))))));
 BA.debugLineNum = 1423;BA.debugLine="ItemAshkhas.FldShomarehesab=myCode.Is_Null(Cu.G";
Debug.ShouldStop(16384);
_itemashkhas.setField ("FldShomarehesab" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomarehesab"))))));
 BA.debugLineNum = 1424;BA.debugLine="ItemAshkhas.fldBlackList=myCode.Is_Null_adad(Cu";
Debug.ShouldStop(32768);
_itemashkhas.setField ("fldBlackList" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldBlackList"))))));
 BA.debugLineNum = 1425;BA.debugLine="ItemAshkhas.fldSaghfeEtebar=myCode.Is_Null_adad";
Debug.ShouldStop(65536);
_itemashkhas.setField ("fldSaghfeEtebar" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSaghfeEtebar"))))));
 BA.debugLineNum = 1426;BA.debugLine="ItemAshkhas.Lat=myCode.Is_Null_adad(Cu.GetStrin";
Debug.ShouldStop(131072);
_itemashkhas.setField ("Lat" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLat"))))));
 BA.debugLineNum = 1427;BA.debugLine="ItemAshkhas.Lon=myCode.Is_Null_adad(Cu.GetStrin";
Debug.ShouldStop(262144);
_itemashkhas.setField ("Lon" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLon"))))));
 BA.debugLineNum = 1428;BA.debugLine="ItemAshkhas.FldSync=myCode.Is_Null(Cu.GetString";
Debug.ShouldStop(524288);
_itemashkhas.setField ("FldSync" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSync"))))));
 BA.debugLineNum = 1429;BA.debugLine="If SwTourToday.Checked Then";
Debug.ShouldStop(1048576);
if (act_selectmantage.mostCurrent._swtourtoday.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1430;BA.debugLine="ItemAshkhas.fldRadif=myCode.Is_Null(Cu.GetStri";
Debug.ShouldStop(2097152);
_itemashkhas.setField ("fldRadif" /*RemoteObject*/ ,BA.numberCast(int.class, act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldRadif")))))));
 BA.debugLineNum = 1431;BA.debugLine="ItemAshkhas.fldDateVisit=myCode.Is_Null(Cu.Get";
Debug.ShouldStop(4194304);
_itemashkhas.setField ("fldDateVisit" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateVisit"))))));
 BA.debugLineNum = 1432;BA.debugLine="ItemAshkhas.fldVaziatTour=myCode.Is_Null(Cu.Ge";
Debug.ShouldStop(8388608);
_itemashkhas.setField ("fldVaziatTour" /*RemoteObject*/ ,act_selectmantage.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldVaziatTour"))))));
 };
 BA.debugLineNum = 1439;BA.debugLine="lblTedadKol.Text =  Cu.RowCount";
Debug.ShouldStop(1073741824);
act_selectmantage.mostCurrent._lbltedadkol.runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"getRowCount")));
 BA.debugLineNum = 1448;BA.debugLine="OrginalListAshkhas.Add(ItemAshkhas)";
Debug.ShouldStop(128);
act_selectmantage.mostCurrent._orginallistashkhas.runVoidMethod ("Add",(Object)((_itemashkhas)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1453;BA.debugLine="ListAshkhas=OrginalListAshkhas";
Debug.ShouldStop(4096);
act_selectmantage.mostCurrent._listashkhas = act_selectmantage.mostCurrent._orginallistashkhas;
 BA.debugLineNum = 1456;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(32768);
act_selectmantage.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e42) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e42.toString()); BA.debugLineNum = 1458;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524313915",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1459;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(262144);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadListAshkhas"))));
 };
 BA.debugLineNum = 1461;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadlistgoroohashkhas() throws Exception{
try {
		Debug.PushSubsStack("LoadListGoroohAshkhas (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,612);
if (RapidSub.canDelegate("loadlistgoroohashkhas")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","loadlistgoroohashkhas");}
RemoteObject _item1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
 BA.debugLineNum = 612;BA.debugLine="Sub LoadListGoroohAshkhas";
Debug.ShouldStop(8);
 BA.debugLineNum = 614;BA.debugLine="Dim Item1 As AdapterGoroohAshkhas";
Debug.ShouldStop(32);
_item1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 615;BA.debugLine="Item1.FldC_Gorooh= 0";
Debug.ShouldStop(64);
_item1.setField ("FldC_Gorooh" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 616;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
Debug.ShouldStop(128);
_item1.setField ("FldN_Gorooh" /*RemoteObject*/ ,BA.ObjectToString("همه گروه ها"));
 BA.debugLineNum = 617;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item1)";
Debug.ShouldStop(256);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Add",(Object)((_item1)));
 BA.debugLineNum = 618;BA.debugLine="Dim Dt As Cursor = MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(512);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 619;BA.debugLine="For i=0 To Dt.RowCount-1";
Debug.ShouldStop(1024);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_dt.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 620;BA.debugLine="Dt.Position=i";
Debug.ShouldStop(2048);
_dt.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 621;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(4096);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 622;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(8192);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 623;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(16384);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 624;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
Debug.ShouldStop(32768);
act_selectmantage.mostCurrent._originallistgoroohashkhas2.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 628;BA.debugLine="ListGoroohAshkhas2 = OriginalListGoroohAshkhas2";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._listgoroohashkhas2 = act_selectmantage.mostCurrent._originallistgoroohashkhas2;
 BA.debugLineNum = 630;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner_item_clicked() throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner_item_clicked (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1133);
if (RapidSub.canDelegate("nicespinner_item_clicked")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","nicespinner_item_clicked");}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 1133;BA.debugLine="Sub NiceSpinner_item_clicked";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1134;BA.debugLine="Dim Position As Int=NiceSpinner.SelectedIndex";
Debug.ShouldStop(8192);
_position = act_selectmantage.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex");Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 1135;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.SelectedIndex &\" se";
Debug.ShouldStop(16384);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524051714",RemoteObject.concat(RemoteObject.createImmutable("ns1 item "),act_selectmantage.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 1136;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.Text &\" selected\")";
Debug.ShouldStop(32768);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524051715",RemoteObject.concat(RemoteObject.createImmutable("ns1 item "),act_selectmantage.mostCurrent._nicespinner.runMethod(true,"getText"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 1138;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 1139;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(262144);
act_selectmantage.mostCurrent._key.runVoidMethod ("HideKeyboard",act_selectmantage.mostCurrent.activityBA);
 BA.debugLineNum = 1141;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1142;BA.debugLine="ListGoroohAshkhas1.Clear";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Clear");
 BA.debugLineNum = 1143;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(4194304);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 1145;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(16777216);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1147;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(67108864);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1149;BA.debugLine="GroupCodeSelect1=\"0\"";
Debug.ShouldStop(268435456);
act_selectmantage.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 BA.debugLineNum = 1150;BA.debugLine="GroupNameSelect1=\"\"";
Debug.ShouldStop(536870912);
act_selectmantage.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 BA.debugLineNum = 1151;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(1073741824);
act_selectmantage.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1152;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(-2147483648);
act_selectmantage.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 }else {
 BA.debugLineNum = 1155;BA.debugLine="Dim lst As List=OriginalListGoroohAshkhas1";
Debug.ShouldStop(4);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_selectmantage.mostCurrent._originallistgoroohashkhas1;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1156;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
Debug.ShouldStop(8);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524051735",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_selectmantage.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1)),0);
 BA.debugLineNum = 1157;BA.debugLine="Dim index As Int=Position-1";
Debug.ShouldStop(16);
_index = RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 1158;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(index)";
Debug.ShouldStop(32);
_item = (_lst.runMethod(false,"Get",(Object)(_index)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1159;BA.debugLine="Log(Item.FldN_Gorooh)";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524051738",_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1160;BA.debugLine="Log(Item.FldC_Gorooh)";
Debug.ShouldStop(128);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524051739",_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1161;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(256);
act_selectmantage.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1162;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
Debug.ShouldStop(512);
act_selectmantage.mostCurrent._groupnameselect1 = _item.getField(true,"FldN_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1163;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1164;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(2048);
act_selectmantage.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 1165;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(4096);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 1167;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(16384);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1168;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1169;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1170;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 1172;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1174;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1175;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(4194304);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33) ;_i = ((int)(0 + _i + step33))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1176;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(8388608);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1177;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(16777216);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1178;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(33554432);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 1179;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(67108864);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 1180;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
Debug.ShouldStop(134217728);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1182;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(536870912);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1185;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(1);
act_selectmantage.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_selectmantage.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 1187;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(GroupCodeSelec";
Debug.ShouldStop(4);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Add",(Object)((act_selectmantage.mostCurrent._groupcodeselect1)));
 }else {
 BA.debugLineNum = 1189;BA.debugLine="ListGoroohAshkhas1.Clear";
Debug.ShouldStop(16);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Clear");
 BA.debugLineNum = 1190;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(32);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 1192;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(128);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1194;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(512);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1195;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1196;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(2048);
act_selectmantage.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 };
 };
 BA.debugLineNum = 1201;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(65536);
_loadashkhas();
 BA.debugLineNum = 1202;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524051781",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_selectmantage.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 1203;BA.debugLine="Log(\"postion1: \"&Position)";
Debug.ShouldStop(262144);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524051782",RemoteObject.concat(RemoteObject.createImmutable("postion1: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e56) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e56.toString()); BA.debugLineNum = 1205;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524051784",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1206;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner_ItemClick"))));
 };
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
public static RemoteObject  _nicespinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner_ItemClick (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1275);
if (RapidSub.canDelegate("nicespinner_itemclick")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","nicespinner_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1275;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1277;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 1278;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(536870912);
act_selectmantage.mostCurrent._key.runVoidMethod ("HideKeyboard",act_selectmantage.mostCurrent.activityBA);
 BA.debugLineNum = 1280;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1281;BA.debugLine="ListGoroohAshkhas1.Clear";
Debug.ShouldStop(1);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Clear");
 BA.debugLineNum = 1282;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(2);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 1284;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(8);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1285;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(16);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1287;BA.debugLine="GroupCodeSelect1=\"0\"";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 BA.debugLineNum = 1288;BA.debugLine="GroupNameSelect1=\"\"";
Debug.ShouldStop(128);
act_selectmantage.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 BA.debugLineNum = 1289;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(256);
act_selectmantage.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1290;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(512);
act_selectmantage.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 1291;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1293;BA.debugLine="Dim lst As List=OriginalListGoroohAshkhas1";
Debug.ShouldStop(4096);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_selectmantage.mostCurrent._originallistgoroohashkhas1;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1294;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
Debug.ShouldStop(8192);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524182803",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_selectmantage.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1)),0);
 BA.debugLineNum = 1295;BA.debugLine="Dim index As Int=Position-1";
Debug.ShouldStop(16384);
_index = RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 1296;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(index)";
Debug.ShouldStop(32768);
_item = (_lst.runMethod(false,"Get",(Object)(_index)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1297;BA.debugLine="Log(Item.FldN_Gorooh)";
Debug.ShouldStop(65536);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524182806",_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1298;BA.debugLine="Log(Item.FldC_Gorooh)";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524182807",_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1299;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(262144);
act_selectmantage.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1300;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._groupnameselect1 = _item.getField(true,"FldN_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1301;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(1048576);
act_selectmantage.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1302;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 1303;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(4194304);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 1305;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(16777216);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1306;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
Debug.ShouldStop(33554432);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1307;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1308;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(134217728);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 1310;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(536870912);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1312;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(-2147483648);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1313;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(1);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1314;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(2);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1315;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(4);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1316;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(8);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 1317;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(16);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 1318;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
Debug.ShouldStop(32);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1320;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(128);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1323;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_selectmantage.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 1324;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(2048);
act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1325;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(GroupCodeSelect";
Debug.ShouldStop(4096);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Add",(Object)((act_selectmantage.mostCurrent._groupcodeselect1)));
 }else {
 BA.debugLineNum = 1327;BA.debugLine="ListGoroohAshkhas1.Clear";
Debug.ShouldStop(16384);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Clear");
 BA.debugLineNum = 1328;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(32768);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 1330;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1332;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1333;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(1048576);
act_selectmantage.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1334;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 1335;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(4194304);
act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 1339;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(67108864);
_loadashkhas();
 BA.debugLineNum = 1340;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(134217728);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524182849",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_selectmantage.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 1341;BA.debugLine="Log(\"postion1: \"&Position)";
Debug.ShouldStop(268435456);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524182850",RemoteObject.concat(RemoteObject.createImmutable("postion1: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e56) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e56.toString()); BA.debugLineNum = 1343;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524182852",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1344;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(-2147483648);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner_ItemClick"))));
 };
 BA.debugLineNum = 1346;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner1_item_clicked() throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner1_item_clicked (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1210);
if (RapidSub.canDelegate("nicespinner1_item_clicked")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","nicespinner1_item_clicked");}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
 BA.debugLineNum = 1210;BA.debugLine="Sub NiceSpinner1_item_clicked";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1211;BA.debugLine="Dim Position As Int=NiceSpinner1.SelectedIndex";
Debug.ShouldStop(67108864);
_position = act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex");Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 1212;BA.debugLine="Dim Value As Object=NiceSpinner1.Text";
Debug.ShouldStop(134217728);
_value = (act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"getText"));Debug.locals.put("Value", _value);Debug.locals.put("Value", _value);
 BA.debugLineNum = 1213;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.SelectedIndex &\" s";
Debug.ShouldStop(268435456);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524117251",RemoteObject.concat(RemoteObject.createImmutable("ns2 item "),act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 1214;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.Text &\" selected\")";
Debug.ShouldStop(536870912);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524117252",RemoteObject.concat(RemoteObject.createImmutable("ns2 item "),act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"getText"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 1215;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 1216;BA.debugLine="If Position=0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1217;BA.debugLine="If lstSelectedCodeGroupAshkhas.Size>0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1218;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupAshkhas.G";
Debug.ShouldStop(2);
act_selectmantage.mostCurrent._groupcodeselect2 = BA.ObjectToString(act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 };
 }else {
 BA.debugLineNum = 1222;BA.debugLine="Dim lst As List=ListGoroohAshkhas1";
Debug.ShouldStop(32);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_selectmantage.mostCurrent._listgoroohashkhas1;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1223;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(Positi";
Debug.ShouldStop(64);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1224;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
Debug.ShouldStop(128);
act_selectmantage.mostCurrent._groupcodeselect2 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1226;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(512);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 1228;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(2048);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1229;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(4096);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1230;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1231;BA.debugLine="ListGoroohAshkhas1.Clear";
Debug.ShouldStop(16384);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Clear");
 BA.debugLineNum = 1235;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(Item.FldC_Goro";
Debug.ShouldStop(262144);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Add",(Object)((_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 1239;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(4194304);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1241;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(16777216);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1243;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(67108864);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1244;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(134217728);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1245;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(268435456);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1246;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(536870912);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 1247;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(1073741824);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 1248;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
Debug.ShouldStop(-2147483648);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1250;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(2);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1253;BA.debugLine="NiceSpinner1.RemoveView";
Debug.ShouldStop(16);
act_selectmantage.mostCurrent._nicespinner1.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1254;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
Debug.ShouldStop(32);
act_selectmantage.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_selectmantage.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner1")));
 BA.debugLineNum = 1255;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.m";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_selectmantage.mostCurrent._nicespinner1.getObject())),(Object)(act_selectmantage.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_selectmantage.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_selectmantage.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_selectmantage.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 1256;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(128);
act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_selectmantage.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 1257;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONT";
Debug.ShouldStop(256);
act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_selectmantage.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 1258;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAsset";
Debug.ShouldStop(512);
act_selectmantage.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_selectmantage.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 1259;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(1024);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 1260;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.";
Debug.ShouldStop(2048);
_op1.runVoidMethod ("Initialize2",(Object)(act_selectmantage.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_selectmantage.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_selectmantage.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 1261;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(4096);
act_selectmantage.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 1262;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(8192);
act_selectmantage.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_selectmantage.mostCurrent._lstgroup2.getObject())));
 };
 };
 BA.debugLineNum = 1266;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(131072);
_loadashkhas();
 BA.debugLineNum = 1267;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(262144);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524117305",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_selectmantage.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 1268;BA.debugLine="Log(\"position2: \"&Position)";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524117306",RemoteObject.concat(RemoteObject.createImmutable("position2: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e46) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e46.toString()); BA.debugLineNum = 1270;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524117308",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1271;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4194304);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner1_ItemClick"))));
 };
 BA.debugLineNum = 1273;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("NiceSpinner1_ItemClick (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1348);
if (RapidSub.canDelegate("nicespinner1_itemclick")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","nicespinner1_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1348;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
Debug.ShouldStop(8);
 BA.debugLineNum = 1349;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 1350;BA.debugLine="If Position=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1351;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupAshkhas.Get";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent._groupcodeselect2 = BA.ObjectToString(act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 }else {
 BA.debugLineNum = 1353;BA.debugLine="Dim lst As List=ListGoroohAshkhas1";
Debug.ShouldStop(256);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_selectmantage.mostCurrent._listgoroohashkhas1;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1354;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(Positio";
Debug.ShouldStop(512);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1355;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._groupcodeselect2 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1357;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(4096);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 1359;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(16384);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1360;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1361;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1362;BA.debugLine="ListGoroohAshkhas1.Clear";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Clear");
 BA.debugLineNum = 1366;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(Item.FldC_Goroo";
Debug.ShouldStop(2097152);
act_selectmantage.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Add",(Object)((_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 1370;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(33554432);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1372;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(134217728);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1374;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(536870912);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1375;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(1073741824);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1376;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(-2147483648);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1377;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(1);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 1378;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(2);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 1379;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
Debug.ShouldStop(4);
act_selectmantage.mostCurrent._listgoroohashkhas1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1381;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(16);
act_selectmantage.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1386;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(512);
act_selectmantage.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_selectmantage.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 1387;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(1024);
act_selectmantage.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 1390;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(8192);
_loadashkhas();
 BA.debugLineNum = 1391;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(16384);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524248363",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_selectmantage.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 1392;BA.debugLine="Log(\"position2: \"&Position)";
Debug.ShouldStop(32768);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524248364",RemoteObject.concat(RemoteObject.createImmutable("position2: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e32.toString()); BA.debugLineNum = 1394;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","524248366",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1395;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(262144);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner1_ItemClick"))));
 };
 BA.debugLineNum = 1397;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim Gps As GPS";
act_selectmantage._gps = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 8;BA.debugLine="Private t1 As Timer";
act_selectmantage._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savegps() throws Exception{
try {
		Debug.PushSubsStack("SaveGps (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1518);
if (RapidSub.canDelegate("savegps")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","savegps");}
 BA.debugLineNum = 1518;BA.debugLine="Sub SaveGps";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1520;BA.debugLine="If Gps.GPSEnabled=False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",act_selectmantage._gps.runMethod(true,"getGPSEnabled"),act_selectmantage.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1521;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید\"";
Debug.ShouldStop(65536);
act_selectmantage.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید")),(Object)(act_selectmantage.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1522;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(131072);
act_selectmantage._t1.runMethod(true,"setEnabled",act_selectmantage.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 1525;BA.debugLine="ProgressDialogShow2(\"لطفا تا دریافت موقعیت مکانی";
Debug.ShouldStop(1048576);
act_selectmantage.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("لطفا تا دریافت موقعیت مکانی صبر کنید")),(Object)(act_selectmantage.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1526;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(2097152);
act_selectmantage._t1.runMethod(true,"setEnabled",act_selectmantage.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1528;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swbed_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwBed_CheckedChange (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1502);
if (RapidSub.canDelegate("swbed_checkedchange")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","swbed_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1502;BA.debugLine="Sub SwBed_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1503;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_checked,act_selectmantage.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1504;BA.debugLine="SwBes.Checked=False";
Debug.ShouldStop(-2147483648);
act_selectmantage.mostCurrent._swbes.runMethodAndSync(true,"setChecked",act_selectmantage.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1506;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(2);
_loadashkhas();
 BA.debugLineNum = 1507;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swbes_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwBes_CheckedChange (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1509);
if (RapidSub.canDelegate("swbes_checkedchange")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","swbes_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1509;BA.debugLine="Sub SwBes_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1510;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_checked,act_selectmantage.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1511;BA.debugLine="SwBed.Checked=False";
Debug.ShouldStop(64);
act_selectmantage.mostCurrent._swbed.runMethodAndSync(true,"setChecked",act_selectmantage.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1513;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(256);
_loadashkhas();
 BA.debugLineNum = 1514;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swblacklist_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwBlackList_CheckedChange (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1615);
if (RapidSub.canDelegate("swblacklist_checkedchange")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","swblacklist_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1615;BA.debugLine="Private Sub SwBlackList_CheckedChange(Checked As B";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1616;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(32768);
_loadashkhas();
 BA.debugLineNum = 1617;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swnew_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwNew_CheckedChange (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1498);
if (RapidSub.canDelegate("swnew_checkedchange")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","swnew_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1498;BA.debugLine="Private Sub SwNew_CheckedChange(Checked As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1499;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(67108864);
_loadashkhas();
 BA.debugLineNum = 1500;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swsearchbyaddress_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("swSearchByAddress_CheckedChange (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1515);
if (RapidSub.canDelegate("swsearchbyaddress_checkedchange")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","swsearchbyaddress_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1515;BA.debugLine="Private Sub swSearchByAddress_CheckedChange(Checke";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1516;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(2048);
_loadashkhas();
 BA.debugLineNum = 1517;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swtourtoday_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwTourToday_CheckedChange (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1619);
if (RapidSub.canDelegate("swtourtoday_checkedchange")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","swtourtoday_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1619;BA.debugLine="Private Sub SwTourToday_CheckedChange(Checked As B";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1620;BA.debugLine="MCode.TourVisitSW=Checked";
Debug.ShouldStop(524288);
act_selectmantage.mostCurrent._mcode._tourvisitsw /*RemoteObject*/  = _checked;
 BA.debugLineNum = 1621;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(1048576);
_loadashkhas();
 BA.debugLineNum = 1622;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swvisit_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwVisit_CheckedChange (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1494);
if (RapidSub.canDelegate("swvisit_checkedchange")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","swvisit_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1494;BA.debugLine="Sub SwVisit_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1495;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(4194304);
_loadashkhas();
 BA.debugLineNum = 1496;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t1_tick() throws Exception{
try {
		Debug.PushSubsStack("t1_tick (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1547);
if (RapidSub.canDelegate("t1_tick")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","t1_tick");}
 BA.debugLineNum = 1547;BA.debugLine="Sub t1_tick";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1575;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("TxtSearch_TextChanged (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,1464);
if (RapidSub.canDelegate("txtsearch_textchanged")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","txtsearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1464;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1465;BA.debugLine="If TxtSearch.Text.StartsWith(\" \") Then";
Debug.ShouldStop(16777216);
if (act_selectmantage.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable(" "))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1466;BA.debugLine="TxtSearch.Text=TxtSearch.Text.SubString(1)";
Debug.ShouldStop(33554432);
act_selectmantage.mostCurrent._txtsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_selectmantage.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 1468;BA.debugLine="TxtSearch.SelectionStart=TxtSearch.Text.Length";
Debug.ShouldStop(134217728);
act_selectmantage.mostCurrent._txtsearch.runMethod(true,"setSelectionStart",act_selectmantage.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 1470;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(536870912);
_loadashkhas();
 BA.debugLineNum = 1471;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update_data() throws Exception{
try {
		Debug.PushSubsStack("update_data (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,174);
if (RapidSub.canDelegate("update_data")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","update_data");}
 BA.debugLineNum = 174;BA.debugLine="Sub update_data";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 176;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(32768);
if (act_selectmantage.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 178;BA.debugLine="FirebaseMessaging.mode=\"GetGoroohAshkhas\"";
Debug.ShouldStop(131072);
act_selectmantage.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = BA.ObjectToString("GetGoroohAshkhas");
 BA.debugLineNum = 179;BA.debugLine="StartService(FirebaseMessaging)";
Debug.ShouldStop(262144);
act_selectmantage.mostCurrent.__c.runVoidMethod ("StartService",act_selectmantage.processBA,(Object)((act_selectmantage.mostCurrent._firebasemessaging.getObject())));
 }else {
 BA.debugLineNum = 181;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(1048576);
_loadashkhas();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e9.toString()); BA.debugLineNum = 184;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","522806538",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 185;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(16777216);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-update_data"))));
 };
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatevaziatashkhas() throws Exception{
try {
		Debug.PushSubsStack("UpdateVaziatAshkhas (act_selectmantage) ","act_selectmantage",9,act_selectmantage.mostCurrent.activityBA,act_selectmantage.mostCurrent,239);
if (RapidSub.canDelegate("updatevaziatashkhas")) { return ir.parsikhesab.pakhsh.act_selectmantage.remoteMe.runUserSub(false, "act_selectmantage","updatevaziatashkhas");}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _maxradif = RemoteObject.createImmutable(0);
RemoteObject _str2 = RemoteObject.createImmutable("");
RemoteObject _cu2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _d = RemoteObject.createImmutable("");
RemoteObject _datev = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _dates = RemoteObject.createImmutable("");
 BA.debugLineNum = 239;BA.debugLine="Sub UpdateVaziatAshkhas";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 241;BA.debugLine="Dim str As String =$\"SELECT DISTINCT fldCodeTafz";
Debug.ShouldStop(65536);
_str = (RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT fldCodeTafzili from tblTourVisitor WHERE fldDateVisit = "),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_selectmantage.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)))),RemoteObject.createImmutable(" AND fldTimeVisit<>''")));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 243;BA.debugLine="Dim cu As Cursor=MCode.Result(str)";
Debug.ShouldStop(262144);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_str));Debug.locals.put("cu", _cu);Debug.locals.put("cu", _cu);
 BA.debugLineNum = 244;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 245;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(1048576);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 246;BA.debugLine="cu.Position=i";
Debug.ShouldStop(2097152);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 249;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select";
Debug.ShouldStop(16777216);
_count = BA.numberCast(int.class, act_selectmantage.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_selectmantage.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldCodeTafzili="),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili")))))),RemoteObject.createImmutable(" and tblTourVisitor.fldTimeVisit<>''"))))));Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 250;BA.debugLine="Dim MaxRadif As Int";
Debug.ShouldStop(33554432);
_maxradif = RemoteObject.createImmutable(0);Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 251;BA.debugLine="If Count>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 252;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fld";
Debug.ShouldStop(134217728);
_maxradif = BA.numberCast(int.class, act_selectmantage.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_selectmantage.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldCodeTafzili="),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili")))))),RemoteObject.createImmutable(" and tblTourVisitor.fldTimeVisit<>''"))))));Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 254;BA.debugLine="Dim str2 As String =$\"SELECT TblAshkhas.*, tb";
Debug.ShouldStop(536870912);
_str2 = (RemoteObject.concat(RemoteObject.createImmutable("SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldTimeSefaresh FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldDateVisit = "),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_selectmantage.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)))),RemoteObject.createImmutable(" AND tblTourVisitor.fldTimeVisit<>'' and tblTourVisitor.fldCodeTafzili="),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili")))))),RemoteObject.createImmutable(" And fldRadif="),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxradif))),RemoteObject.createImmutable(" ORDER BY fldRadif ASC")));Debug.locals.put("str2", _str2);Debug.locals.put("str2", _str2);
 BA.debugLineNum = 255;BA.debugLine="Dim cu2 As Cursor=MCode.Result(str2)";
Debug.ShouldStop(1073741824);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_str2));Debug.locals.put("cu2", _cu2);Debug.locals.put("cu2", _cu2);
 BA.debugLineNum = 256;BA.debugLine="cu2.Position=0";
Debug.ShouldStop(-2147483648);
_cu2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 258;BA.debugLine="If cu2.GetString(\"fldTimeVisit\")<>\"\" And cu2.";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTimeVisit"))),BA.ObjectToString("")) && RemoteObject.solveBoolean("N",_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTimeVisit"))))) { 
 BA.debugLineNum = 259;BA.debugLine="Dim D As String = cu2.GetString(\"fldDateVisi";
Debug.ShouldStop(4);
_d = RemoteObject.concat(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateVisit"))),RemoteObject.createImmutable("T"),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTimeVisit"))));Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 260;BA.debugLine="Dim DateV As String=cu2.GetString(\"fldDateVi";
Debug.ShouldStop(8);
_datev = _cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateVisit")));Debug.locals.put("DateV", _datev);Debug.locals.put("DateV", _datev);
 BA.debugLineNum = 262;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set last";
Debug.ShouldStop(32);
act_selectmantage.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set lastSeen = '"),_d,RemoteObject.createImmutable("',FldLastVisit='"),_datev,RemoteObject.createImmutable("' Where fldCodetafzili = '"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili"))),RemoteObject.createImmutable("'"))));
 };
 };
 BA.debugLineNum = 268;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select";
Debug.ShouldStop(2048);
_count = BA.numberCast(int.class, act_selectmantage.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_selectmantage.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldCodeTafzili="),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili")))))),RemoteObject.createImmutable(" and tblTourVisitor.fldTimeSefaresh<>''"))))));Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 269;BA.debugLine="Dim MaxRadif As Int";
Debug.ShouldStop(4096);
_maxradif = RemoteObject.createImmutable(0);Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 270;BA.debugLine="If Count>0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 271;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fld";
Debug.ShouldStop(16384);
_maxradif = BA.numberCast(int.class, act_selectmantage.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_selectmantage.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)))),RemoteObject.createImmutable("' and fldCodeTafzili="),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili")))))),RemoteObject.createImmutable(" and tblTourVisitor.fldTimeSefaresh<>''"))))));Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 273;BA.debugLine="Dim str2 As String =$\"SELECT TblAshkhas.*, tb";
Debug.ShouldStop(65536);
_str2 = (RemoteObject.concat(RemoteObject.createImmutable("SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldTimeSefaresh FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldDateVisit = "),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_selectmantage.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA)))),RemoteObject.createImmutable(" AND tblTourVisitor.fldTimeSefaresh<>'' and tblTourVisitor.fldCodeTafzili="),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili")))))),RemoteObject.createImmutable(" And fldRadif="),act_selectmantage.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxradif))),RemoteObject.createImmutable(" ORDER BY fldRadif ASC")));Debug.locals.put("str2", _str2);Debug.locals.put("str2", _str2);
 BA.debugLineNum = 274;BA.debugLine="Dim cu2 As Cursor=MCode.Result(str2)";
Debug.ShouldStop(131072);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = act_selectmantage.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(_str2));Debug.locals.put("cu2", _cu2);Debug.locals.put("cu2", _cu2);
 BA.debugLineNum = 275;BA.debugLine="cu2.Position=0";
Debug.ShouldStop(262144);
_cu2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 276;BA.debugLine="If cu2.GetString(\"fldTimeSefaresh\")<>\"\" And c";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTimeSefaresh"))),BA.ObjectToString("")) && RemoteObject.solveBoolean("N",_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTimeSefaresh"))))) { 
 BA.debugLineNum = 277;BA.debugLine="Dim s As String = cu2.GetString(\"fldDateVisi";
Debug.ShouldStop(1048576);
_s = RemoteObject.concat(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateVisit"))),RemoteObject.createImmutable("T"),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTimeSefaresh"))));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 278;BA.debugLine="Dim DateS As String=cu2.GetString(\"fldDateVi";
Debug.ShouldStop(2097152);
_dates = _cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDateVisit")));Debug.locals.put("DateS", _dates);Debug.locals.put("DateS", _dates);
 BA.debugLineNum = 280;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set last";
Debug.ShouldStop(8388608);
act_selectmantage.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set lastOrderDate = '"),_s,RemoteObject.createImmutable("' ,FldLastSefaresh='"),_dates,RemoteObject.createImmutable("' Where fldCodetafzili = '"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeTafzili"))),RemoteObject.createImmutable("'"))));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_selectmantage.processBA, e36.toString()); BA.debugLineNum = 287;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
act_selectmantage.mostCurrent.__c.runVoidMethod ("LogImpl","522872112",BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA)),0);
 BA.debugLineNum = 288;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(-2147483648);
act_selectmantage.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_selectmantage.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_selectmantage.mostCurrent.__c.runMethod(false,"LastException",act_selectmantage.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_selectmantage.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-UpdateVaziatAshkhas"))));
 };
 BA.debugLineNum = 290;BA.debugLine="End Sub";
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