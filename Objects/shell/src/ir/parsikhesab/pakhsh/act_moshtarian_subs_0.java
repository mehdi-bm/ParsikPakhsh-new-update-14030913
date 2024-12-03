package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_moshtarian_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,57);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","activity_create", _firsttime);}
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Activity.LoadLayout(\"L_SelectMantaghe_2\")";
Debug.ShouldStop(33554432);
act_moshtarian.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_SelectMantaghe_2")),act_moshtarian.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 60;BA.debugLine="lstSelectedCodeGroupAshkhas.Initialize";
Debug.ShouldStop(134217728);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Initialize");
 BA.debugLineNum = 61;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(268435456);
act_moshtarian.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 62;BA.debugLine="ListAshkhas.Initialize";
Debug.ShouldStop(536870912);
act_moshtarian.mostCurrent._listashkhas.runVoidMethod ("Initialize");
 BA.debugLineNum = 63;BA.debugLine="OrginalListAshkhas.Initialize";
Debug.ShouldStop(1073741824);
act_moshtarian.mostCurrent._orginallistashkhas.runVoidMethod ("Initialize");
 BA.debugLineNum = 64;BA.debugLine="OriginalListGoroohAshkhas.Initialize";
Debug.ShouldStop(-2147483648);
act_moshtarian.mostCurrent._originallistgoroohashkhas.runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="ListGoroohAshkhas.Initialize";
Debug.ShouldStop(1);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Initialize");
 BA.debugLineNum = 66;BA.debugLine="gps.Initialize(\"gps\")";
Debug.ShouldStop(2);
act_moshtarian._gps.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("gps")));
 BA.debugLineNum = 70;BA.debugLine="lstGroup1.Initialize";
Debug.ShouldStop(32);
act_moshtarian.mostCurrent._lstgroup1.runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="lstGroup2.Initialize";
Debug.ShouldStop(64);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(256);
act_moshtarian.mostCurrent._hlv.runMethod(false,"Initializer",act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 75;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.He";
Debug.ShouldStop(1024);
act_moshtarian.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_moshtarian.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_moshtarian.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_moshtarian.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 77;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\")";
Debug.ShouldStop(4096);
act_moshtarian.mostCurrent._nicespinner.runVoidMethod ("Initialize",act_moshtarian.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner")));
 BA.debugLineNum = 78;BA.debugLine="PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBas";
Debug.ShouldStop(8192);
act_moshtarian.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_moshtarian.mostCurrent._nicespinner.getObject())),(Object)(act_moshtarian.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_moshtarian.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_moshtarian.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_moshtarian.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 79;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
Debug.ShouldStop(16384);
act_moshtarian.mostCurrent._nicespinner.runMethod(true,"setTextColor",act_moshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 80;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(32768);
act_moshtarian.mostCurrent._nicespinner.runMethod(true,"setGravity",act_moshtarian.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 81;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"";
Debug.ShouldStop(65536);
act_moshtarian.mostCurrent._nicespinner.runMethod(false,"setTypeface",act_moshtarian.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 82;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(131072);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 83;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
Debug.ShouldStop(262144);
_op.runVoidMethod ("Initialize2",(Object)(act_moshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_moshtarian.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_moshtarian.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_moshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 84;BA.debugLine="NiceSpinner.Background=op";
Debug.ShouldStop(524288);
act_moshtarian.mostCurrent._nicespinner.runMethod(false,"setBackground",(_op.getObject()));
 BA.debugLineNum = 86;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
Debug.ShouldStop(2097152);
act_moshtarian.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_moshtarian.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner1")));
 BA.debugLineNum = 87;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBa";
Debug.ShouldStop(4194304);
act_moshtarian.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_moshtarian.mostCurrent._nicespinner1.getObject())),(Object)(act_moshtarian.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_moshtarian.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_moshtarian.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_moshtarian.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 88;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(8388608);
act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_moshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 89;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(16777216);
act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_moshtarian.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 90;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(";
Debug.ShouldStop(33554432);
act_moshtarian.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_moshtarian.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 91;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(67108864);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 92;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bl";
Debug.ShouldStop(134217728);
_op1.runVoidMethod ("Initialize2",(Object)(act_moshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_moshtarian.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_moshtarian.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_moshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 93;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(268435456);
act_moshtarian.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 94;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(536870912);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 95;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(1073741824);
act_moshtarian.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_moshtarian.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 96;BA.debugLine="LoadAcSpGroohAshkas";
Debug.ShouldStop(-2147483648);
_loadacspgroohashkas();
 BA.debugLineNum = 98;BA.debugLine="HLV.Show";
Debug.ShouldStop(2);
act_moshtarian.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 100;BA.debugLine="Date = MCode.ConvertNumbersPersian2English(MCode.";
Debug.ShouldStop(8);
act_moshtarian.mostCurrent._date = act_moshtarian.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(act_moshtarian.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA)));
 BA.debugLineNum = 102;BA.debugLine="Log(\"showbedehkaran: \" & MCode.showbedehkaran)";
Debug.ShouldStop(32);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","547710253",RemoteObject.concat(RemoteObject.createImmutable("showbedehkaran: "),act_moshtarian.mostCurrent._mcode._showbedehkaran /*RemoteObject*/ ),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e37) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e37.toString()); BA.debugLineNum = 116;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","547710267",BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 117;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1048576);
act_moshtarian.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_moshtarian.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 121;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,543);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 543;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,526);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","activity_resume");}
 BA.debugLineNum = 526;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 527;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 528;BA.debugLine="MCode.UpdateSetting";
Debug.ShouldStop(32768);
act_moshtarian.mostCurrent._mcode.runVoidMethod ("_updatesetting" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA);
 BA.debugLineNum = 530;BA.debugLine="StartService(FusedLocationService)";
Debug.ShouldStop(131072);
act_moshtarian.mostCurrent.__c.runVoidMethod ("StartService",act_moshtarian.processBA,(Object)((act_moshtarian.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 531;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(262144);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548037893",RemoteObject.createImmutable("Gps Start"),0);
 BA.debugLineNum = 533;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(1048576);
_loadashkhas();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e7.toString()); BA.debugLineNum = 538;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548037900",BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 539;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(67108864);
act_moshtarian.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_moshtarian.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Resume"))));
 };
 BA.debugLineNum = 541;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Application_Error (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,983);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 983;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 984;BA.debugLine="Log(\"Error Moshtarian: \"&Error)";
Debug.ShouldStop(8388608);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","549217537",RemoteObject.concat(RemoteObject.createImmutable("Error Moshtarian: "),_error),0);
 BA.debugLineNum = 986;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) return act_moshtarian.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 987;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("btn_Back_Click (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,547);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","btn_back_click");}
 BA.debugLineNum = 547;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 548;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
act_moshtarian.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 549;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("btn_sort_Click (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,935);
if (RapidSub.canDelegate("btn_sort_click")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","btn_sort_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 935;BA.debugLine="Sub btn_sort_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 936;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 937;BA.debugLine="Dim Lst As List = Array As String(\"کد شخص\",\"نام";
Debug.ShouldStop(256);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_moshtarian.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("کد شخص"),BA.ObjectToString("نام شخص نزولی"),RemoteObject.createImmutable("نام شخص صعودی")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 938;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس";
Debug.ShouldStop(512);
_res = act_moshtarian.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("مرتب سازی براساس:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_moshtarian.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 939;BA.debugLine="Select Case res";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 941;BA.debugLine="Str_sort = \" Order by fldCodetafzili Asc\"";
Debug.ShouldStop(4096);
act_moshtarian.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodetafzili Asc");
 break; }
case 1: {
 BA.debugLineNum = 943;BA.debugLine="Str_sort = \" Order by fldSharheTafzili\"";
Debug.ShouldStop(16384);
act_moshtarian.mostCurrent._str_sort = BA.ObjectToString(" Order by fldSharheTafzili");
 break; }
case 2: {
 BA.debugLineNum = 945;BA.debugLine="Str_sort = \" Order by fldSharheTafzili Desc\"";
Debug.ShouldStop(65536);
act_moshtarian.mostCurrent._str_sort = BA.ObjectToString(" Order by fldSharheTafzili Desc");
 break; }
}
;
 BA.debugLineNum = 947;BA.debugLine="Log(Str_sort)";
Debug.ShouldStop(262144);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548824332",act_moshtarian.mostCurrent._str_sort,0);
 BA.debugLineNum = 948;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(524288);
_loadashkhas();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e15.toString()); BA.debugLineNum = 950;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548824335",BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 951;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4194304);
act_moshtarian.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_moshtarian.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btn_sort_Click"))));
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
public static RemoteObject  _btnnewashkhas_click() throws Exception{
try {
		Debug.PushSubsStack("btnNewAshkhas_Click (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,989);
if (RapidSub.canDelegate("btnnewashkhas_click")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","btnnewashkhas_click");}
 BA.debugLineNum = 989;BA.debugLine="Private Sub btnNewAshkhas_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 990;BA.debugLine="MCode.UpdateShakhs=False";
Debug.ShouldStop(536870912);
act_moshtarian.mostCurrent._mcode._updateshakhs /*RemoteObject*/  = act_moshtarian.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 991;BA.debugLine="StartActivity(Act_NewAshkhas)";
Debug.ShouldStop(1073741824);
act_moshtarian.mostCurrent.__c.runVoidMethod ("StartActivity",act_moshtarian.processBA,(Object)((act_moshtarian.mostCurrent._act_newashkhas.getObject())));
 BA.debugLineNum = 992;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("btnUpdate_Click (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,978);
if (RapidSub.canDelegate("btnupdate_click")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","btnupdate_click");}
 BA.debugLineNum = 978;BA.debugLine="Sub btnUpdate_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 979;BA.debugLine="tcount=3";
Debug.ShouldStop(262144);
act_moshtarian._tcount = BA.numberCast(int.class, 3);
 BA.debugLineNum = 981;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Dim UtilS As Hitex_Utils";
act_moshtarian.mostCurrent._utils = RemoteObject.createNew ("wir.hitex.recycler.Hitex_Utils");
 //BA.debugLineNum = 13;BA.debugLine="Dim Key As IME";
act_moshtarian.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 14;BA.debugLine="Dim ListAshkhas,OrginalListAshkhas As List";
act_moshtarian.mostCurrent._listashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_moshtarian.mostCurrent._orginallistashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 15;BA.debugLine="Dim CuAshkhas As Cursor";
act_moshtarian.mostCurrent._cuashkhas = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Public NiceSpinner As NiceSpinner";
act_moshtarian.mostCurrent._nicespinner = RemoteObject.createNew ("nicespinnerwrapper.niceSpinnerWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Public NiceSpinner1 As NiceSpinner";
act_moshtarian.mostCurrent._nicespinner1 = RemoteObject.createNew ("nicespinnerwrapper.niceSpinnerWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
act_moshtarian.mostCurrent._b4xcombobox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 19;BA.debugLine="Private B4XComboBox2 As B4XComboBox";
act_moshtarian.mostCurrent._b4xcombobox2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 20;BA.debugLine="Dim ListGoroohAshkhas,OriginalListGoroohAshkhas A";
act_moshtarian.mostCurrent._listgoroohashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_moshtarian.mostCurrent._originallistgoroohashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 21;BA.debugLine="Private pnl_HLV As Panel";
act_moshtarian.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private HLV As Hitex_LayoutView";
act_moshtarian.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 23;BA.debugLine="Private ListMantaghe As List";
act_moshtarian.mostCurrent._listmantaghe = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 24;BA.debugLine="Private Date As String";
act_moshtarian.mostCurrent._date = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Private TxtSearch As EditText";
act_moshtarian.mostCurrent._txtsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LblTedadVisit As Label";
act_moshtarian.mostCurrent._lbltedadvisit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private LblTedadSefaresh As Label";
act_moshtarian.mostCurrent._lbltedadsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblTedadKol As Label";
act_moshtarian.mostCurrent._lbltedadkol = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private PnlSpGroup As Panel";
act_moshtarian.mostCurrent._pnlspgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btn_sort As Label";
act_moshtarian.mostCurrent._btn_sort = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private SwTour As ACSwitch";
act_moshtarian.mostCurrent._swtour = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private SwBed As ACSwitch";
act_moshtarian.mostCurrent._swbed = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Str_sort As String = \" Order by fldCodeta";
act_moshtarian.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodetafzili Asc");
 //BA.debugLineNum = 35;BA.debugLine="Dim GroupCodeSelect1 As String=\"0\"";
act_moshtarian.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 //BA.debugLineNum = 36;BA.debugLine="Dim GroupNameSelect1 As String=\"\"";
act_moshtarian.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 //BA.debugLineNum = 37;BA.debugLine="Dim GroupCodeSelect2 As String=\"0\"";
act_moshtarian.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 //BA.debugLineNum = 38;BA.debugLine="Dim GroupNameSelect2 As String=\"\"";
act_moshtarian.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 //BA.debugLineNum = 39;BA.debugLine="Dim countvisit As Int=0";
act_moshtarian._countvisit = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 40;BA.debugLine="Dim countsefaresh As Int=0";
act_moshtarian._countsefaresh = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 41;BA.debugLine="Dim lstSelectedCodeGroupAshkhas As List";
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 43;BA.debugLine="Dim tcount As Int";
act_moshtarian._tcount = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 44;BA.debugLine="Private SwBes As ACSwitch";
act_moshtarian.mostCurrent._swbes = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private MapFragment1 As MapFragment";
act_moshtarian.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private SwNew As ACSwitch";
act_moshtarian.mostCurrent._swnew = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Dim lstGroup1 As List";
act_moshtarian.mostCurrent._lstgroup1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 52;BA.debugLine="Dim lstGroup2 As List";
act_moshtarian.mostCurrent._lstgroup2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 53;BA.debugLine="Private swSearchByAddress As ACSwitch";
act_moshtarian.mostCurrent._swsearchbyaddress = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private btnNewAshkhas As Panel";
act_moshtarian.mostCurrent._btnnewashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,563);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","hlv_getitemcount");}
 BA.debugLineNum = 563;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(262144);
 BA.debugLineNum = 564;BA.debugLine="Return ListAshkhas.Size '/ItemList.Size";
Debug.ShouldStop(524288);
if (true) return act_moshtarian.mostCurrent._listashkhas.runMethod(true,"getSize");
 BA.debugLineNum = 565;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("HLV_onBindViewHolder (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,556);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recashkhas");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 556;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(2048);
 BA.debugLineNum = 557;BA.debugLine="Dim item As AdapterListAshkhas=ListAshkhas.Get(Po";
Debug.ShouldStop(4096);
_item = (act_moshtarian.mostCurrent._listashkhas.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 558;BA.debugLine="Dim rec As cls_RecAshkhas=Parent.Tag";
Debug.ShouldStop(8192);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 559;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(16384);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_moshtarian.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_moshtarian.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 560;BA.debugLine="rec.show(item,Date)";
Debug.ShouldStop(32768);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_show" /*RemoteObject*/ ,(Object)(_item),(Object)(act_moshtarian.mostCurrent._date));
 BA.debugLineNum = 561;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(65536);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 562;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,551);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recashkhas");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 551;BA.debugLine="Private Sub HLV_onCreateViewHolder (Parent As Pane";
Debug.ShouldStop(64);
 BA.debugLineNum = 552;BA.debugLine="Dim rec As cls_RecAshkhas";
Debug.ShouldStop(128);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recashkhas");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 553;BA.debugLine="rec.Initialize";
Debug.ShouldStop(256);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_initialize" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA);
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
public static RemoteObject  _loadacspgroohashkas() throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpGroohAshkas (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,458);
if (RapidSub.canDelegate("loadacspgroohashkas")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","loadacspgroohashkas");}
RemoteObject _dt1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _sizecode = RemoteObject.createImmutable(0L);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0L);
RemoteObject _mincode = RemoteObject.createImmutable("");
RemoteObject _a = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _namegroup = RemoteObject.createImmutable("");
RemoteObject _codegroup = RemoteObject.createImmutable("");
 BA.debugLineNum = 458;BA.debugLine="Sub LoadAcSpGroohAshkas";
Debug.ShouldStop(512);
 BA.debugLineNum = 459;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 460;BA.debugLine="lstGroup1.Add(\"همه گروه ها\")";
Debug.ShouldStop(2048);
act_moshtarian.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 461;BA.debugLine="Dim Dt1 As Cursor = MCode.Result(\"Select FldC_Go";
Debug.ShouldStop(4096);
_dt1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt1 = act_moshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")));Debug.locals.put("Dt1", _dt1);Debug.locals.put("Dt1", _dt1);
 BA.debugLineNum = 462;BA.debugLine="For i=0 To Dt1.RowCount-1";
Debug.ShouldStop(8192);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_dt1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 463;BA.debugLine="Dt1.Position=i";
Debug.ShouldStop(16384);
_dt1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 465;BA.debugLine="Dim sizeCode As Long=Dt1.GetString(\"FldC_Gorooh";
Debug.ShouldStop(65536);
_sizecode = BA.numberCast(long.class, _dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"length"));Debug.locals.put("sizeCode", _sizecode);Debug.locals.put("sizeCode", _sizecode);
 BA.debugLineNum = 466;BA.debugLine="If sizeCode=3 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_sizecode,BA.numberCast(long.class, 3))) { 
 BA.debugLineNum = 467;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(262144);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 468;BA.debugLine="Item.FldC_Gorooh= Dt1.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(524288);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 469;BA.debugLine="Item.FldN_Gorooh= Dt1.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(1048576);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 470;BA.debugLine="OriginalListGoroohAshkhas.Add(Item)";
Debug.ShouldStop(2097152);
act_moshtarian.mostCurrent._originallistgoroohashkhas.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 471;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(4194304);
act_moshtarian.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 473;BA.debugLine="Dim code As String=Dt1.GetString(\"FldC_Gorooh\"";
Debug.ShouldStop(16777216);
_code = _dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 474;BA.debugLine="Dim count As Long";
Debug.ShouldStop(33554432);
_count = RemoteObject.createImmutable(0L);Debug.locals.put("count", _count);
 BA.debugLineNum = 475;BA.debugLine="Dim MinCode As String =MCode.SingleResult(\"Sel";
Debug.ShouldStop(67108864);
_mincode = BA.ObjectToString(act_moshtarian.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"),_code,RemoteObject.createImmutable("%'")))));Debug.locals.put("MinCode", _mincode);Debug.locals.put("MinCode", _mincode);
 BA.debugLineNum = 476;BA.debugLine="For Each a As AdapterGoroohAshkhas In Original";
Debug.ShouldStop(134217728);
{
final RemoteObject group17 = act_moshtarian.mostCurrent._originallistgoroohashkhas;
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_a = (group17.runMethod(false,"Get",index17));Debug.locals.put("a", _a);
Debug.locals.put("a", _a);
 BA.debugLineNum = 477;BA.debugLine="If a.FldC_Gorooh.SubString2(0,3)=code Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_a.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),_code)) { 
 BA.debugLineNum = 478;BA.debugLine="count=1";
Debug.ShouldStop(536870912);
_count = BA.numberCast(long.class, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 479;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
if (true) break;
 };
 }
}Debug.locals.put("a", _a);
;
 BA.debugLineNum = 482;BA.debugLine="If count =0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 483;BA.debugLine="Dim NameGroup,CodeGroup As String";
Debug.ShouldStop(4);
_namegroup = RemoteObject.createImmutable("");Debug.locals.put("NameGroup", _namegroup);
_codegroup = RemoteObject.createImmutable("");Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 484;BA.debugLine="CodeGroup=MinCode";
Debug.ShouldStop(8);
_codegroup = _mincode;Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 485;BA.debugLine="NameGroup=MCode.SingleResult(\"Select FldN_Gor";
Debug.ShouldStop(16);
_namegroup = BA.ObjectToString(act_moshtarian.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"),_mincode,RemoteObject.createImmutable("'")))));Debug.locals.put("NameGroup", _namegroup);
 BA.debugLineNum = 486;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(32);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 487;BA.debugLine="Item.FldC_Gorooh= CodeGroup";
Debug.ShouldStop(64);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_codegroup);
 BA.debugLineNum = 488;BA.debugLine="Item.FldN_Gorooh= NameGroup";
Debug.ShouldStop(128);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_namegroup);
 BA.debugLineNum = 489;BA.debugLine="OriginalListGoroohAshkhas.Add(Item)";
Debug.ShouldStop(256);
act_moshtarian.mostCurrent._originallistgoroohashkhas.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 490;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(512);
act_moshtarian.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ))));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 519;BA.debugLine="NiceSpinner.attachDataSource(lstGroup1)";
Debug.ShouldStop(64);
act_moshtarian.mostCurrent._nicespinner.runVoidMethod ("attachDataSource",(Object)((act_moshtarian.mostCurrent._lstgroup1.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e37) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e37.toString()); BA.debugLineNum = 521;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","547972415",BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 522;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(512);
act_moshtarian.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_moshtarian.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadAcSpGroohAshkas"))));
 };
 BA.debugLineNum = 524;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("LoadAshkhas (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,188);
if (RapidSub.canDelegate("loadashkhas")) { ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","loadashkhas"); return;}
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
public ResumableSub_LoadAshkhas(ir.parsikhesab.pakhsh.act_moshtarian parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_moshtarian parent;
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
		Debug.PushSubsStack("LoadAshkhas (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,188);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 189;BA.debugLine="Try";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//try
this.state = 187;
this.catchState = 186;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 186;
 BA.debugLineNum = 190;BA.debugLine="MCode.page =\"Act_Moshtarian\"";
Debug.ShouldStop(536870912);
parent.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_Moshtarian");
 BA.debugLineNum = 191;BA.debugLine="Dim str As String=\"\"";
Debug.ShouldStop(1073741824);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 192;BA.debugLine="Dim countfilter As Int=0";
Debug.ShouldStop(-2147483648);
_countfilter = BA.numberCast(int.class, 0);Debug.locals.put("countfilter", _countfilter);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 193;BA.debugLine="Dim filter As Boolean=False";
Debug.ShouldStop(1);
_filter = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("filter", _filter);Debug.locals.put("filter", _filter);
 BA.debugLineNum = 194;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(2);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 195;BA.debugLine="Dim DateMiladi As String = MCode.ConvertNumbersP";
Debug.ShouldStop(4);
_datemiladi = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("DateMiladi", _datemiladi);Debug.locals.put("DateMiladi", _datemiladi);
 BA.debugLineNum = 196;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(8);
_time = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 197;BA.debugLine="Dim Date As String =MCode.DatePersian '& \"T\" & T";
Debug.ShouldStop(16);
parent.mostCurrent._date = parent.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA);
 BA.debugLineNum = 198;BA.debugLine="LogColor(\"D: \" & Date,Colors.Red)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","547906826",RemoteObject.concat(RemoteObject.createImmutable("D: "),parent.mostCurrent._date),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 199;BA.debugLine="Dim CuTedad As Cursor";
Debug.ShouldStop(64);
_cutedad = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 200;BA.debugLine="Log(GroupCodeSelect1)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","547906828",parent.mostCurrent._groupcodeselect1,0);
 BA.debugLineNum = 201;BA.debugLine="Log(GroupCodeSelect2)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","547906829",parent.mostCurrent._groupcodeselect2,0);
 BA.debugLineNum = 202;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 The";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 64;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",parent.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 203;BA.debugLine="If SwTour.Checked=True Then";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swtour.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 204;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2048);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 206;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
Debug.ShouldStop(8192);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and FldLastVisit <> 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 207;BA.debugLine="filter=True";
Debug.ShouldStop(16384);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 208;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 209;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(65536);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
 BA.debugLineNum = 213;BA.debugLine="If SwNew.Checked=True Then";
Debug.ShouldStop(1048576);

case 14:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swnew.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 214;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2097152);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 216;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
Debug.ShouldStop(8388608);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and length(fldCodetafzili)>5 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 217;BA.debugLine="filter=True";
Debug.ShouldStop(16777216);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 218;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 219;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(67108864);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;
;
 BA.debugLineNum = 223;BA.debugLine="If SwBed.Checked=True Then";
Debug.ShouldStop(1073741824);

case 21:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbed.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 224;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(-2147483648);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 226;BA.debugLine="str= str & \" and fldMande > 0 \"";
Debug.ShouldStop(2);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande > 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 227;BA.debugLine="filter=True";
Debug.ShouldStop(4);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 228;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 229;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(16);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
 BA.debugLineNum = 233;BA.debugLine="If SwBes.Checked=True Then";
Debug.ShouldStop(256);

case 28:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbes.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 234;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(512);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 236;BA.debugLine="str= str & \" and fldMande < 0 \"";
Debug.ShouldStop(2048);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande < 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 237;BA.debugLine="filter=True";
Debug.ShouldStop(4096);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 238;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 239;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(16384);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;
;
 BA.debugLineNum = 243;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(262144);

case 35:
//if
this.state = 58;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 245;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
Debug.ShouldStop(1048576);
_search = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(parent.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 246;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 38:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 247;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(4194304);
_search = parent.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 if (true) break;

case 41:
//C
this.state = 42;
;
 BA.debugLineNum = 249;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16777216);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 250;BA.debugLine="If swSearchByAddress.Checked Then";
Debug.ShouldStop(33554432);
if (true) break;

case 42:
//if
this.state = 53;
if (parent.mostCurrent._swsearchbyaddress.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 44;
}else {
this.state = 46;
}if (true) break;

case 44:
//C
this.state = 53;
 BA.debugLineNum = 251;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
Debug.ShouldStop(67108864);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldAdress like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 253;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 47:
//if
this.state = 52;
if (parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
 BA.debugLineNum = 254;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
Debug.ShouldStop(536870912);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodetafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 256;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSharheTafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;

case 53:
//C
this.state = 54;
;
 BA.debugLineNum = 259;BA.debugLine="filter=True";
Debug.ShouldStop(4);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 260;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(8);
if (true) break;

case 54:
//if
this.state = 57;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 261;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(16);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 57:
//C
this.state = 58;
;
 if (true) break;
;
 BA.debugLineNum = 264;BA.debugLine="If filter=True And str<>\"\" Then";
Debug.ShouldStop(128);

case 58:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",_filter,parent.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 63;
 BA.debugLineNum = 265;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(256);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where "),_str,RemoteObject.createImmutable(" and FldLastVisit > '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 266;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(512);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 267;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(1024);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where "),_str,RemoteObject.createImmutable(" and FldLastSefaresh > '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 268;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(2048);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 271;BA.debugLine="str=\"Select * From TblAshkhas where \"&str&\" \"&";
Debug.ShouldStop(16384);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas where "),_str,RemoteObject.createImmutable(" "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 273;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(65536);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 274;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(131072);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 275;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(262144);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 276;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(524288);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 278;BA.debugLine="str=\"Select * From TblAshkhas \"&Str_sort";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 if (true) break;

case 63:
//C
this.state = 64;
;
 BA.debugLineNum = 281;BA.debugLine="Log(str)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","547906909",_str,0);
 if (true) break;
;
 BA.debugLineNum = 284;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Th";
Debug.ShouldStop(134217728);

case 64:
//if
this.state = 124;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",parent.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 286;BA.debugLine="If SwTour.Checked=True Then";
Debug.ShouldStop(536870912);
if (true) break;

case 67:
//if
this.state = 74;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swtour.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 287;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1073741824);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 289;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
Debug.ShouldStop(1);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and FldLastVisit <> 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 290;BA.debugLine="filter=True";
Debug.ShouldStop(2);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 291;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4);
if (true) break;

case 70:
//if
this.state = 73;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 292;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 73:
//C
this.state = 74;
;
 if (true) break;
;
 BA.debugLineNum = 296;BA.debugLine="If SwNew.Checked=True Then";
Debug.ShouldStop(128);

case 74:
//if
this.state = 81;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swnew.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 76;
}if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 297;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(256);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 299;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
Debug.ShouldStop(1024);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and length(fldCodetafzili)>5 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 300;BA.debugLine="filter=True";
Debug.ShouldStop(2048);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 301;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4096);
if (true) break;

case 77:
//if
this.state = 80;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 302;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8192);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;
;
 BA.debugLineNum = 306;BA.debugLine="If SwBed.Checked=True Then";
Debug.ShouldStop(131072);

case 81:
//if
this.state = 88;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbed.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 307;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(262144);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 309;BA.debugLine="str= str & \" and fldMande > 0 \"";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande > 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 310;BA.debugLine="filter=True";
Debug.ShouldStop(2097152);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 311;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 84:
//if
this.state = 87;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
 BA.debugLineNum = 312;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8388608);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 87:
//C
this.state = 88;
;
 if (true) break;
;
 BA.debugLineNum = 316;BA.debugLine="If SwBes.Checked=True Then";
Debug.ShouldStop(134217728);

case 88:
//if
this.state = 95;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbes.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
 BA.debugLineNum = 317;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(268435456);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 319;BA.debugLine="str= str & \" and fldMande < 0 \"";
Debug.ShouldStop(1073741824);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande < 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 320;BA.debugLine="filter=True";
Debug.ShouldStop(-2147483648);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 321;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(1);
if (true) break;

case 91:
//if
this.state = 94;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 322;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(2);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 94:
//C
this.state = 95;
;
 if (true) break;
;
 BA.debugLineNum = 326;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(32);

case 95:
//if
this.state = 118;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 97;
}if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 328;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
Debug.ShouldStop(128);
_search = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(parent.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 329;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(256);
if (true) break;

case 98:
//if
this.state = 101;
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
 BA.debugLineNum = 330;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(512);
_search = parent.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 if (true) break;

case 101:
//C
this.state = 102;
;
 BA.debugLineNum = 332;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2048);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 333;BA.debugLine="If swSearchByAddress.Checked Then";
Debug.ShouldStop(4096);
if (true) break;

case 102:
//if
this.state = 113;
if (parent.mostCurrent._swsearchbyaddress.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 104;
}else {
this.state = 106;
}if (true) break;

case 104:
//C
this.state = 113;
 BA.debugLineNum = 334;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
Debug.ShouldStop(8192);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldAdress like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 106:
//C
this.state = 107;
 BA.debugLineNum = 336;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(32768);
if (true) break;

case 107:
//if
this.state = 112;
if (parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
this.state = 109;
}else {
this.state = 111;
}if (true) break;

case 109:
//C
this.state = 112;
 BA.debugLineNum = 337;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodetafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 339;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSharheTafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 112:
//C
this.state = 113;
;
 if (true) break;

case 113:
//C
this.state = 114;
;
 BA.debugLineNum = 342;BA.debugLine="filter=True";
Debug.ShouldStop(2097152);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 343;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 114:
//if
this.state = 117;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 116;
}if (true) break;

case 116:
//C
this.state = 117;
 BA.debugLineNum = 344;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(8388608);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 117:
//C
this.state = 118;
;
 if (true) break;
;
 BA.debugLineNum = 347;BA.debugLine="If filter=True And str<>\"\" Then";
Debug.ShouldStop(67108864);

case 118:
//if
this.state = 123;
if (RemoteObject.solveBoolean("=",_filter,parent.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
this.state = 120;
}else {
this.state = 122;
}if (true) break;

case 120:
//C
this.state = 123;
 BA.debugLineNum = 348;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(134217728);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" and FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 349;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(268435456);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 350;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(536870912);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" and FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 351;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 353;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGro";
Debug.ShouldStop(1);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 BA.debugLineNum = 354;BA.debugLine="Log(str)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","547906982",_str,0);
 if (true) break;

case 122:
//C
this.state = 123;
 BA.debugLineNum = 356;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(8);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 357;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(16);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 358;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(32);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 359;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(64);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 361;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGro";
Debug.ShouldStop(256);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 if (true) break;

case 123:
//C
this.state = 124;
;
 if (true) break;
;
 BA.debugLineNum = 367;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 T";
Debug.ShouldStop(16384);

case 124:
//if
this.state = 184;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("!",parent.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
this.state = 126;
}if (true) break;

case 126:
//C
this.state = 127;
 BA.debugLineNum = 368;BA.debugLine="If SwTour.Checked=True Then";
Debug.ShouldStop(32768);
if (true) break;

case 127:
//if
this.state = 134;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swtour.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 129;
}if (true) break;

case 129:
//C
this.state = 130;
 BA.debugLineNum = 369;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(65536);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 371;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and FldLastVisit <> 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 372;BA.debugLine="filter=True";
Debug.ShouldStop(524288);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 373;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 130:
//if
this.state = 133;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 132;
}if (true) break;

case 132:
//C
this.state = 133;
 BA.debugLineNum = 374;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(2097152);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 133:
//C
this.state = 134;
;
 if (true) break;
;
 BA.debugLineNum = 378;BA.debugLine="If SwNew.Checked=True Then";
Debug.ShouldStop(33554432);

case 134:
//if
this.state = 141;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swnew.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 136;
}if (true) break;

case 136:
//C
this.state = 137;
 BA.debugLineNum = 379;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(67108864);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 381;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
Debug.ShouldStop(268435456);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and length(fldCodetafzili)>5 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 382;BA.debugLine="filter=True";
Debug.ShouldStop(536870912);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 383;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 137:
//if
this.state = 140;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 139;
}if (true) break;

case 139:
//C
this.state = 140;
 BA.debugLineNum = 384;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(-2147483648);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 140:
//C
this.state = 141;
;
 if (true) break;
;
 BA.debugLineNum = 388;BA.debugLine="If SwBed.Checked=True Then";
Debug.ShouldStop(8);

case 141:
//if
this.state = 148;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbed.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 143;
}if (true) break;

case 143:
//C
this.state = 144;
 BA.debugLineNum = 389;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 391;BA.debugLine="str= str & \" and fldMande > 0 \"";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande > 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 392;BA.debugLine="filter=True";
Debug.ShouldStop(128);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 393;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(256);
if (true) break;

case 144:
//if
this.state = 147;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 146;
}if (true) break;

case 146:
//C
this.state = 147;
 BA.debugLineNum = 394;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(512);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 147:
//C
this.state = 148;
;
 if (true) break;
;
 BA.debugLineNum = 398;BA.debugLine="If SwBes.Checked=True Then";
Debug.ShouldStop(8192);

case 148:
//if
this.state = 155;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._swbes.runMethod(true,"getChecked"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 150;
}if (true) break;

case 150:
//C
this.state = 151;
 BA.debugLineNum = 399;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16384);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 401;BA.debugLine="str= str & \" and fldMande < 0 \"";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldMande < 0 "));Debug.locals.put("str", _str);
 BA.debugLineNum = 402;BA.debugLine="filter=True";
Debug.ShouldStop(131072);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 403;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(262144);
if (true) break;

case 151:
//if
this.state = 154;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 153;
}if (true) break;

case 153:
//C
this.state = 154;
 BA.debugLineNum = 404;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(524288);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 154:
//C
this.state = 155;
;
 if (true) break;
;
 BA.debugLineNum = 408;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(8388608);

case 155:
//if
this.state = 178;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",parent.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 157;
}if (true) break;

case 157:
//C
this.state = 158;
 BA.debugLineNum = 410;BA.debugLine="Dim Search As String=TxtSearch.Text";
Debug.ShouldStop(33554432);
_search = parent.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);Debug.locals.put("Search", _search);
 BA.debugLineNum = 411;BA.debugLine="If Search=\"\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 158:
//if
this.state = 161;
if (RemoteObject.solveBoolean("=",_search,BA.ObjectToString(""))) { 
this.state = 160;
}if (true) break;

case 160:
//C
this.state = 161;
 BA.debugLineNum = 412;BA.debugLine="Search=TxtSearch.Text";
Debug.ShouldStop(134217728);
_search = parent.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("Search", _search);
 if (true) break;

case 161:
//C
this.state = 162;
;
 BA.debugLineNum = 414;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(536870912);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 415;BA.debugLine="If swSearchByAddress.Checked Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 162:
//if
this.state = 173;
if (parent.mostCurrent._swsearchbyaddress.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 164;
}else {
this.state = 166;
}if (true) break;

case 164:
//C
this.state = 173;
 BA.debugLineNum = 416;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldAdress like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 166:
//C
this.state = 167;
 BA.debugLineNum = 418;BA.debugLine="If IsNumber(Search) Then";
Debug.ShouldStop(2);
if (true) break;

case 167:
//if
this.state = 172;
if (parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_search)).<Boolean>get().booleanValue()) { 
this.state = 169;
}else {
this.state = 171;
}if (true) break;

case 169:
//C
this.state = 172;
 BA.debugLineNum = 419;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
Debug.ShouldStop(4);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodetafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 171:
//C
this.state = 172;
 BA.debugLineNum = 421;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSharheTafzili like '%"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 if (true) break;

case 172:
//C
this.state = 173;
;
 if (true) break;

case 173:
//C
this.state = 174;
;
 BA.debugLineNum = 425;BA.debugLine="filter=True";
Debug.ShouldStop(256);
_filter = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 426;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(512);
if (true) break;

case 174:
//if
this.state = 177;
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
this.state = 176;
}if (true) break;

case 176:
//C
this.state = 177;
 BA.debugLineNum = 427;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(1024);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 if (true) break;

case 177:
//C
this.state = 178;
;
 if (true) break;
;
 BA.debugLineNum = 431;BA.debugLine="If filter=True And str<>\"\" Then";
Debug.ShouldStop(16384);

case 178:
//if
this.state = 183;
if (RemoteObject.solveBoolean("=",_filter,parent.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
this.state = 180;
}else {
this.state = 182;
}if (true) break;

case 180:
//C
this.state = 183;
 BA.debugLineNum = 432;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(32768);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" and FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 433;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(65536);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 434;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(131072);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" and FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 435;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(262144);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 439;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGro";
Debug.ShouldStop(4194304);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 if (true) break;

case 182:
//C
this.state = 183;
 BA.debugLineNum = 441;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(16777216);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%'"),RemoteObject.createImmutable(" and FldLastVisit = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 442;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
Debug.ShouldStop(33554432);
parent.mostCurrent._lbltedadvisit.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 443;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
Debug.ShouldStop(67108864);
_cutedad = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%'"),RemoteObject.createImmutable(" and FldLastSefaresh = '"),parent.mostCurrent._date,RemoteObject.createImmutable("'"))));Debug.locals.put("CuTedad", _cutedad);
 BA.debugLineNum = 444;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbltedadsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(_cutedad.runMethod(true,"getRowCount")));
 BA.debugLineNum = 446;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGro";
Debug.ShouldStop(536870912);
_str = RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodeGroup like '"),parent.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' "),parent.mostCurrent._str_sort);Debug.locals.put("str", _str);
 if (true) break;

case 183:
//C
this.state = 184;
;
 BA.debugLineNum = 449;BA.debugLine="Log(str)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","547907077",_str,0);
 if (true) break;

case 184:
//C
this.state = 187;
;
 BA.debugLineNum = 451;BA.debugLine="Sleep(200)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_moshtarian.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_moshtarian", "loadashkhas"),BA.numberCast(int.class, 200));
this.state = 188;
return;
case 188:
//C
this.state = 187;
;
 BA.debugLineNum = 452;BA.debugLine="LoadListAshkhas(str)";
Debug.ShouldStop(8);
_loadlistashkhas(_str);
 Debug.CheckDeviceExceptions();
if (true) break;

case 186:
//C
this.state = 187;
this.catchState = 0;
 BA.debugLineNum = 454;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","547907082",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 455;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(64);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadAshkhas"))));
 if (true) break;
if (true) break;

case 187:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 457;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e0.toString());}
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
		Debug.PushSubsStack("LoadListAshkhas (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,875);
if (RapidSub.canDelegate("loadlistashkhas")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","loadlistashkhas", _query);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _itemashkhas = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");
Debug.locals.put("Query", _query);
 BA.debugLineNum = 875;BA.debugLine="Sub LoadListAshkhas(Query As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 876;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 877;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
Debug.ShouldStop(4096);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_moshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_query));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 878;BA.debugLine="OrginalListAshkhas.Clear";
Debug.ShouldStop(8192);
act_moshtarian.mostCurrent._orginallistashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 879;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 880;BA.debugLine="For i = 0 To Cu.RowCount - 1";
Debug.ShouldStop(32768);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 881;BA.debugLine="Dim ItemAshkhas As AdapterListAshkhas";
Debug.ShouldStop(65536);
_itemashkhas = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");Debug.locals.put("ItemAshkhas", _itemashkhas);
 BA.debugLineNum = 882;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(131072);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 883;BA.debugLine="ItemAshkhas.CodeTafzili=Cu.Getstring(\"fldCodeta";
Debug.ShouldStop(262144);
_itemashkhas.setField ("CodeTafzili" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodetafzili"))));
 BA.debugLineNum = 884;BA.debugLine="ItemAshkhas.SharhTafzili=Cu.Getstring(\"fldSharh";
Debug.ShouldStop(524288);
_itemashkhas.setField ("SharhTafzili" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili"))));
 BA.debugLineNum = 885;BA.debugLine="ItemAshkhas.Address=myCode.Is_Null(Cu.Getstrin";
Debug.ShouldStop(1048576);
_itemashkhas.setField ("Address" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldAdress"))))));
 BA.debugLineNum = 886;BA.debugLine="ItemAshkhas.Tell=Cu.Getstring(\"fldTell\")";
Debug.ShouldStop(2097152);
_itemashkhas.setField ("Tell" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell"))));
 BA.debugLineNum = 887;BA.debugLine="ItemAshkhas.FldMobile=myCode.Is_Null(Cu.GetStr";
Debug.ShouldStop(4194304);
_itemashkhas.setField ("FldMobile" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMobile"))))));
 BA.debugLineNum = 888;BA.debugLine="ItemAshkhas.FldVaziat=myCode.Is_Null(Cu.GetStri";
Debug.ShouldStop(8388608);
_itemashkhas.setField ("FldVaziat" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVaziat"))))));
 BA.debugLineNum = 889;BA.debugLine="ItemAshkhas.FldEtebar=myCode.Is_Null(Cu.GetStri";
Debug.ShouldStop(16777216);
_itemashkhas.setField ("FldEtebar" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEtebar"))))));
 BA.debugLineNum = 890;BA.debugLine="ItemAshkhas.lastSeen=Cu.GetString(\"lastSeen\")";
Debug.ShouldStop(33554432);
_itemashkhas.setField ("lastSeen" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("lastSeen"))));
 BA.debugLineNum = 891;BA.debugLine="ItemAshkhas.lastOrderDate=myCode.Is_Null(Cu.Get";
Debug.ShouldStop(67108864);
_itemashkhas.setField ("lastOrderDate" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("lastOrderDate"))))));
 BA.debugLineNum = 892;BA.debugLine="ItemAshkhas.Mande=Cu.Getstring(\"fldMande\")";
Debug.ShouldStop(134217728);
_itemashkhas.setField ("Mande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldMande"))));
 BA.debugLineNum = 893;BA.debugLine="ItemAshkhas.FldLastVisit=myCode.Is_Null(Cu.GetS";
Debug.ShouldStop(268435456);
_itemashkhas.setField ("FldLastVisit" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLastVisit"))))));
 BA.debugLineNum = 894;BA.debugLine="ItemAshkhas.FldLastSefaresh=myCode.Is_Null(Cu.G";
Debug.ShouldStop(536870912);
_itemashkhas.setField ("FldLastSefaresh" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldLastSefaresh"))))));
 BA.debugLineNum = 895;BA.debugLine="ItemAshkhas.FldC_Gorooh=Cu.GetString(\"fldCodeGr";
Debug.ShouldStop(1073741824);
_itemashkhas.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroup"))));
 BA.debugLineNum = 896;BA.debugLine="ItemAshkhas.FldN_Gorooh=Cu.GetString(\"fldNameGr";
Debug.ShouldStop(-2147483648);
_itemashkhas.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameGroup"))));
 BA.debugLineNum = 897;BA.debugLine="ItemAshkhas.FldC_Posti=myCode.Is_Null(Cu.GetStr";
Debug.ShouldStop(1);
_itemashkhas.setField ("FldC_Posti" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Posti"))))));
 BA.debugLineNum = 898;BA.debugLine="ItemAshkhas.FldC_Meli=myCode.Is_Null(Cu.GetStri";
Debug.ShouldStop(2);
_itemashkhas.setField ("FldC_Meli" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Meli"))))));
 BA.debugLineNum = 899;BA.debugLine="ItemAshkhas.FldShomarehesab=myCode.Is_Null(Cu.G";
Debug.ShouldStop(4);
_itemashkhas.setField ("FldShomarehesab" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomarehesab"))))));
 BA.debugLineNum = 900;BA.debugLine="ItemAshkhas.FldSync=myCode.Is_Null(Cu.GetString";
Debug.ShouldStop(8);
_itemashkhas.setField ("FldSync" /*RemoteObject*/ ,act_moshtarian.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSync"))))));
 BA.debugLineNum = 903;BA.debugLine="lblTedadKol.Text =  Cu.RowCount";
Debug.ShouldStop(64);
act_moshtarian.mostCurrent._lbltedadkol.runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"getRowCount")));
 BA.debugLineNum = 912;BA.debugLine="OrginalListAshkhas.Add(ItemAshkhas)";
Debug.ShouldStop(32768);
act_moshtarian.mostCurrent._orginallistashkhas.runVoidMethod ("Add",(Object)((_itemashkhas)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 917;BA.debugLine="ListAshkhas=OrginalListAshkhas";
Debug.ShouldStop(1048576);
act_moshtarian.mostCurrent._listashkhas = act_moshtarian.mostCurrent._orginallistashkhas;
 BA.debugLineNum = 920;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(8388608);
act_moshtarian.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e33) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e33.toString()); BA.debugLineNum = 922;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548693295",BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 923;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(67108864);
act_moshtarian.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_moshtarian.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadListAshkhas"))));
 };
 BA.debugLineNum = 925;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("NiceSpinner_item_clicked (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,567);
if (RapidSub.canDelegate("nicespinner_item_clicked")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","nicespinner_item_clicked");}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 567;BA.debugLine="Sub NiceSpinner_item_clicked";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 568;BA.debugLine="Dim Position As Int=NiceSpinner.SelectedIndex";
Debug.ShouldStop(8388608);
_position = act_moshtarian.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex");Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 569;BA.debugLine="Dim Value As Object=NiceSpinner.Text";
Debug.ShouldStop(16777216);
_value = (act_moshtarian.mostCurrent._nicespinner.runMethod(true,"getText"));Debug.locals.put("Value", _value);Debug.locals.put("Value", _value);
 BA.debugLineNum = 570;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.SelectedIndex &\" se";
Debug.ShouldStop(33554432);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548431107",RemoteObject.concat(RemoteObject.createImmutable("ns1 item "),act_moshtarian.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 571;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.Text &\" selected\")";
Debug.ShouldStop(67108864);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548431108",RemoteObject.concat(RemoteObject.createImmutable("ns1 item "),act_moshtarian.mostCurrent._nicespinner.runMethod(true,"getText"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 573;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 574;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(536870912);
act_moshtarian.mostCurrent._key.runVoidMethod ("HideKeyboard",act_moshtarian.mostCurrent.activityBA);
 BA.debugLineNum = 576;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 577;BA.debugLine="ListGoroohAshkhas.Clear";
Debug.ShouldStop(1);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 578;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(2);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 580;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(8);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 582;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(32);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 584;BA.debugLine="GroupCodeSelect1=\"0\"";
Debug.ShouldStop(128);
act_moshtarian.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 BA.debugLineNum = 585;BA.debugLine="GroupNameSelect1=\"\"";
Debug.ShouldStop(256);
act_moshtarian.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 BA.debugLineNum = 586;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(512);
act_moshtarian.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 587;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(1024);
act_moshtarian.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 }else {
 BA.debugLineNum = 590;BA.debugLine="Dim lst As List=OriginalListGoroohAshkhas";
Debug.ShouldStop(8192);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_moshtarian.mostCurrent._originallistgoroohashkhas;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 591;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
Debug.ShouldStop(16384);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548431128",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_moshtarian.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1)),0);
 BA.debugLineNum = 592;BA.debugLine="Dim index As Int=Position-1";
Debug.ShouldStop(32768);
_index = RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 593;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(index)";
Debug.ShouldStop(65536);
_item = (_lst.runMethod(false,"Get",(Object)(_index)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 594;BA.debugLine="Log(Item.FldN_Gorooh)";
Debug.ShouldStop(131072);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548431131",_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 595;BA.debugLine="Log(Item.FldC_Gorooh)";
Debug.ShouldStop(262144);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548431132",_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 596;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(524288);
act_moshtarian.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 597;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
Debug.ShouldStop(1048576);
act_moshtarian.mostCurrent._groupnameselect1 = _item.getField(true,"FldN_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 598;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2097152);
act_moshtarian.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 599;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4194304);
act_moshtarian.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 600;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(8388608);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 603;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(67108864);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 607;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(1073741824);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_moshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 608;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 609;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(1);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 611;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(4);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 613;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(16);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 614;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(32);
{
final int step34 = 1;
final int limit34 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34) ;_i = ((int)(0 + _i + step34))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 615;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(64);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 616;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(128);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 617;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(256);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 618;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(512);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 619;BA.debugLine="ListGoroohAshkhas.Add(Item)";
Debug.ShouldStop(1024);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 621;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(4096);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 624;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(32768);
act_moshtarian.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_moshtarian.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 626;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(GroupCodeSelec";
Debug.ShouldStop(131072);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Add",(Object)((act_moshtarian.mostCurrent._groupcodeselect1)));
 }else {
 BA.debugLineNum = 628;BA.debugLine="ListGoroohAshkhas.Clear";
Debug.ShouldStop(524288);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 629;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(1048576);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 631;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(4194304);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 633;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(16777216);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 634;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(33554432);
act_moshtarian.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 635;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(67108864);
act_moshtarian.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 };
 };
 BA.debugLineNum = 640;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(-2147483648);
_loadashkhas();
 BA.debugLineNum = 641;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(1);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548431178",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_moshtarian.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 642;BA.debugLine="Log(\"postion1: \"&Position)";
Debug.ShouldStop(2);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548431179",RemoteObject.concat(RemoteObject.createImmutable("postion1: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e57) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e57.toString()); BA.debugLineNum = 644;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548431181",BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 645;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(16);
act_moshtarian.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_moshtarian.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner_ItemClick"))));
 };
 BA.debugLineNum = 647;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("NiceSpinner_ItemClick (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,711);
if (RapidSub.canDelegate("nicespinner_itemclick")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","nicespinner_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 711;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
Debug.ShouldStop(64);
 BA.debugLineNum = 713;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 714;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(512);
act_moshtarian.mostCurrent._key.runVoidMethod ("HideKeyboard",act_moshtarian.mostCurrent.activityBA);
 BA.debugLineNum = 716;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 717;BA.debugLine="ListGoroohAshkhas.Clear";
Debug.ShouldStop(4096);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 718;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(8192);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 720;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(32768);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 722;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(131072);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 724;BA.debugLine="GroupCodeSelect1=\"0\"";
Debug.ShouldStop(524288);
act_moshtarian.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 BA.debugLineNum = 725;BA.debugLine="GroupNameSelect1=\"\"";
Debug.ShouldStop(1048576);
act_moshtarian.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 BA.debugLineNum = 726;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2097152);
act_moshtarian.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 727;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4194304);
act_moshtarian.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 728;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(8388608);
act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 730;BA.debugLine="Dim lst As List=OriginalListGoroohAshkhas";
Debug.ShouldStop(33554432);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_moshtarian.mostCurrent._originallistgoroohashkhas;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 731;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
Debug.ShouldStop(67108864);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548562196",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_moshtarian.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1)),0);
 BA.debugLineNum = 732;BA.debugLine="Dim index As Int=Position-1";
Debug.ShouldStop(134217728);
_index = RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 733;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(index)";
Debug.ShouldStop(268435456);
_item = (_lst.runMethod(false,"Get",(Object)(_index)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 734;BA.debugLine="Log(Item.FldN_Gorooh)";
Debug.ShouldStop(536870912);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548562199",_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 735;BA.debugLine="Log(Item.FldC_Gorooh)";
Debug.ShouldStop(1073741824);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548562200",_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 736;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(-2147483648);
act_moshtarian.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 737;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
Debug.ShouldStop(1);
act_moshtarian.mostCurrent._groupnameselect1 = _item.getField(true,"FldN_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 738;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2);
act_moshtarian.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 739;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4);
act_moshtarian.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 740;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(8);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 742;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(32);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 743;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(64);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_moshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 744;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 745;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(256);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 747;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(1024);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 749;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(4096);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 750;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(8192);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 751;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(16384);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 752;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(32768);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 753;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(65536);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 754;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(131072);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 755;BA.debugLine="ListGoroohAshkhas.Add(Item)";
Debug.ShouldStop(262144);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 757;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(1048576);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 760;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(8388608);
act_moshtarian.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_moshtarian.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 761;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(16777216);
act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 762;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(GroupCodeSelec";
Debug.ShouldStop(33554432);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Add",(Object)((act_moshtarian.mostCurrent._groupcodeselect1)));
 }else {
 BA.debugLineNum = 764;BA.debugLine="ListGoroohAshkhas.Clear";
Debug.ShouldStop(134217728);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 765;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
Debug.ShouldStop(268435456);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 767;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(1073741824);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 769;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(1);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 770;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2);
act_moshtarian.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 771;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4);
act_moshtarian.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 772;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(8);
act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 776;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(128);
_loadashkhas();
 BA.debugLineNum = 777;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(256);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548562242",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_moshtarian.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 778;BA.debugLine="Log(\"postion1: \"&Position)";
Debug.ShouldStop(512);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548562243",RemoteObject.concat(RemoteObject.createImmutable("postion1: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e56) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e56.toString()); BA.debugLineNum = 780;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548562245",BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 781;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4096);
act_moshtarian.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_moshtarian.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner_ItemClick"))));
 };
 BA.debugLineNum = 783;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("NiceSpinner1_item_clicked (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,649);
if (RapidSub.canDelegate("nicespinner1_item_clicked")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","nicespinner1_item_clicked");}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
 BA.debugLineNum = 649;BA.debugLine="Sub NiceSpinner1_item_clicked";
Debug.ShouldStop(256);
 BA.debugLineNum = 650;BA.debugLine="Dim Position As Int=NiceSpinner1.SelectedIndex";
Debug.ShouldStop(512);
_position = act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex");Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 651;BA.debugLine="Dim Value As Object=NiceSpinner1.Text";
Debug.ShouldStop(1024);
_value = (act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"getText"));Debug.locals.put("Value", _value);Debug.locals.put("Value", _value);
 BA.debugLineNum = 652;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.SelectedIndex &\" s";
Debug.ShouldStop(2048);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548496643",RemoteObject.concat(RemoteObject.createImmutable("ns2 item "),act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 653;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.Text &\" selected\")";
Debug.ShouldStop(4096);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548496644",RemoteObject.concat(RemoteObject.createImmutable("ns2 item "),act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"getText"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 654;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 655;BA.debugLine="If Position=0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 656;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupAshkhas.Ge";
Debug.ShouldStop(32768);
act_moshtarian.mostCurrent._groupcodeselect2 = BA.ObjectToString(act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 }else {
 BA.debugLineNum = 658;BA.debugLine="Dim lst As List=ListGoroohAshkhas";
Debug.ShouldStop(131072);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_moshtarian.mostCurrent._listgoroohashkhas;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 659;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(Positi";
Debug.ShouldStop(262144);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 660;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
Debug.ShouldStop(524288);
act_moshtarian.mostCurrent._groupcodeselect2 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 662;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(2097152);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 664;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(8388608);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 665;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(16777216);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_moshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 666;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 667;BA.debugLine="ListGoroohAshkhas.Clear";
Debug.ShouldStop(67108864);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 671;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(Item.FldC_Goro";
Debug.ShouldStop(1073741824);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Add",(Object)((_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 675;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(4);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 677;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(16);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 679;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(64);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20) ;_i = ((int)(0 + _i + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 680;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(128);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 681;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(256);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 682;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(512);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 683;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(1024);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 684;BA.debugLine="ListGoroohAshkhas.Add(Item)";
Debug.ShouldStop(2048);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 686;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(8192);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 689;BA.debugLine="NiceSpinner1.RemoveView";
Debug.ShouldStop(65536);
act_moshtarian.mostCurrent._nicespinner1.runVoidMethod ("RemoveView");
 BA.debugLineNum = 690;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
Debug.ShouldStop(131072);
act_moshtarian.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_moshtarian.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner1")));
 BA.debugLineNum = 691;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.m";
Debug.ShouldStop(262144);
act_moshtarian.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_moshtarian.mostCurrent._nicespinner1.getObject())),(Object)(act_moshtarian.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_moshtarian.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_moshtarian.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_moshtarian.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 692;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(524288);
act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_moshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 693;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONT";
Debug.ShouldStop(1048576);
act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_moshtarian.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 694;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAsset";
Debug.ShouldStop(2097152);
act_moshtarian.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_moshtarian.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 695;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(4194304);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 696;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.";
Debug.ShouldStop(8388608);
_op1.runVoidMethod ("Initialize2",(Object)(act_moshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_moshtarian.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_moshtarian.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_moshtarian.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 697;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(16777216);
act_moshtarian.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 698;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(33554432);
act_moshtarian.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_moshtarian.mostCurrent._lstgroup2.getObject())));
 };
 };
 BA.debugLineNum = 702;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(536870912);
_loadashkhas();
 BA.debugLineNum = 703;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(1073741824);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548496694",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_moshtarian.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 704;BA.debugLine="Log(\"position2: \"&Position)";
Debug.ShouldStop(-2147483648);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548496695",RemoteObject.concat(RemoteObject.createImmutable("position2: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e44) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e44.toString()); BA.debugLineNum = 706;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548496697",BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 707;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4);
act_moshtarian.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_moshtarian.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner1_ItemClick"))));
 };
 BA.debugLineNum = 709;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("NiceSpinner1_ItemClick (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,785);
if (RapidSub.canDelegate("nicespinner1_itemclick")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","nicespinner1_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 785;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
Debug.ShouldStop(65536);
 BA.debugLineNum = 786;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 787;BA.debugLine="If Position=0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 788;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupAshkhas.Ge";
Debug.ShouldStop(524288);
act_moshtarian.mostCurrent._groupcodeselect2 = BA.ObjectToString(act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 }else {
 BA.debugLineNum = 790;BA.debugLine="Dim lst As List=ListGoroohAshkhas";
Debug.ShouldStop(2097152);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_moshtarian.mostCurrent._listgoroohashkhas;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 791;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(Positi";
Debug.ShouldStop(4194304);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 792;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
Debug.ShouldStop(8388608);
act_moshtarian.mostCurrent._groupcodeselect2 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 794;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(33554432);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 796;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(134217728);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 797;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(268435456);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_moshtarian.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 798;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 799;BA.debugLine="ListGoroohAshkhas.Clear";
Debug.ShouldStop(1073741824);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Clear");
 BA.debugLineNum = 803;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(Item.FldC_Goro";
Debug.ShouldStop(4);
act_moshtarian.mostCurrent._lstselectedcodegroupashkhas.runVoidMethod ("Add",(Object)((_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 807;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(64);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 809;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(256);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 811;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(1024);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 812;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(2048);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 813;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
Debug.ShouldStop(4096);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas");Debug.locals.put("Item", _item);
 BA.debugLineNum = 814;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(8192);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 815;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(16384);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 816;BA.debugLine="ListGoroohAshkhas.Add(Item)";
Debug.ShouldStop(32768);
act_moshtarian.mostCurrent._listgoroohashkhas.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 818;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(131072);
act_moshtarian.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 823;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(4194304);
act_moshtarian.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_moshtarian.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 824;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(8388608);
act_moshtarian.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 827;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(67108864);
_loadashkhas();
 BA.debugLineNum = 828;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(134217728);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548627755",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_moshtarian.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 829;BA.debugLine="Log(\"position2: \"&Position)";
Debug.ShouldStop(268435456);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548627756",RemoteObject.concat(RemoteObject.createImmutable("position2: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e32.toString()); BA.debugLineNum = 831;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","548627758",BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 832;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(-2147483648);
act_moshtarian.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_moshtarian.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner1_ItemClick"))));
 };
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private gps	As GPS";
act_moshtarian._gps = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 8;BA.debugLine="Dim t_gps As Timer";
act_moshtarian._t_gps = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _swbed_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwBed_CheckedChange (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,963);
if (RapidSub.canDelegate("swbed_checkedchange")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","swbed_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 963;BA.debugLine="Sub SwBed_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 964;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_checked,act_moshtarian.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 965;BA.debugLine="SwBes.Checked=False";
Debug.ShouldStop(16);
act_moshtarian.mostCurrent._swbes.runMethodAndSync(true,"setChecked",act_moshtarian.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 967;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(64);
_loadashkhas();
 BA.debugLineNum = 968;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("SwBes_CheckedChange (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,970);
if (RapidSub.canDelegate("swbes_checkedchange")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","swbes_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 970;BA.debugLine="Sub SwBes_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 971;BA.debugLine="If Checked=True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_checked,act_moshtarian.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 972;BA.debugLine="SwBed.Checked=False";
Debug.ShouldStop(2048);
act_moshtarian.mostCurrent._swbed.runMethodAndSync(true,"setChecked",act_moshtarian.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 974;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(8192);
_loadashkhas();
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
public static RemoteObject  _swnew_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwNew_CheckedChange (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,959);
if (RapidSub.canDelegate("swnew_checkedchange")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","swnew_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 959;BA.debugLine="Private Sub SwNew_CheckedChange(Checked As Boolean";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 960;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(-2147483648);
_loadashkhas();
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
public static RemoteObject  _swtour_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwTour_CheckedChange (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,955);
if (RapidSub.canDelegate("swtour_checkedchange")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","swtour_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 955;BA.debugLine="Sub SwTour_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 956;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(134217728);
_loadashkhas();
 BA.debugLineNum = 957;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_gps_tick() throws Exception{
try {
		Debug.PushSubsStack("t_gps_Tick (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,165);
if (RapidSub.canDelegate("t_gps_tick")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","t_gps_tick");}
 BA.debugLineNum = 165;BA.debugLine="Sub t_gps_Tick";
Debug.ShouldStop(16);
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("TxtSearch_TextChanged (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,927);
if (RapidSub.canDelegate("txtsearch_textchanged")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","txtsearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 927;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 928;BA.debugLine="If TxtSearch.Text.StartsWith(\" \") Then";
Debug.ShouldStop(-2147483648);
if (act_moshtarian.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable(" "))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 929;BA.debugLine="TxtSearch.Text=TxtSearch.Text.SubString(1)";
Debug.ShouldStop(1);
act_moshtarian.mostCurrent._txtsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_moshtarian.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 931;BA.debugLine="TxtSearch.SelectionStart=TxtSearch.Text.Length";
Debug.ShouldStop(4);
act_moshtarian.mostCurrent._txtsearch.runMethod(true,"setSelectionStart",act_moshtarian.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 932;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(8);
_loadashkhas();
 BA.debugLineNum = 933;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("update_data (act_moshtarian) ","act_moshtarian",23,act_moshtarian.mostCurrent.activityBA,act_moshtarian.mostCurrent,122);
if (RapidSub.canDelegate("update_data")) { return ir.parsikhesab.pakhsh.act_moshtarian.remoteMe.runUserSub(false, "act_moshtarian","update_data");}
 BA.debugLineNum = 122;BA.debugLine="Sub update_data";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 124;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(134217728);
if (act_moshtarian.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_moshtarian.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 125;BA.debugLine="MCode.page=\"Act_Moshtarian\"";
Debug.ShouldStop(268435456);
act_moshtarian.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_Moshtarian");
 BA.debugLineNum = 126;BA.debugLine="FirebaseMessaging.mode=\"GetGoroohAshkhas\"";
Debug.ShouldStop(536870912);
act_moshtarian.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = BA.ObjectToString("GetGoroohAshkhas");
 BA.debugLineNum = 127;BA.debugLine="StartService(FirebaseMessaging)";
Debug.ShouldStop(1073741824);
act_moshtarian.mostCurrent.__c.runVoidMethod ("StartService",act_moshtarian.processBA,(Object)((act_moshtarian.mostCurrent._firebasemessaging.getObject())));
 }else {
 BA.debugLineNum = 129;BA.debugLine="LoadAshkhas";
Debug.ShouldStop(1);
_loadashkhas();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_moshtarian.processBA, e10.toString()); BA.debugLineNum = 132;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
act_moshtarian.mostCurrent.__c.runVoidMethod ("LogImpl","547775754",BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA)),0);
 BA.debugLineNum = 133;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(16);
act_moshtarian.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_moshtarian.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_moshtarian.mostCurrent.__c.runMethod(false,"LastException",act_moshtarian.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_moshtarian.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-update_data"))));
 };
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}