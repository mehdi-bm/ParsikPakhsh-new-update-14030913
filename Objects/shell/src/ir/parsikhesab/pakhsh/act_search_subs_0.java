package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_search_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,82);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","activity_create", _firsttime);}
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 86;BA.debugLine="Activity.LoadLayout(\"L_Search_3\")";
Debug.ShouldStop(2097152);
act_search.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Search_3")),act_search.mostCurrent.activityBA);
 BA.debugLineNum = 87;BA.debugLine="lstSelectedCodeGroupKala.Initialize";
Debug.ShouldStop(4194304);
act_search.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 89;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(16777216);
act_search.mostCurrent._hlv.runMethod(false,"Initializer",act_search.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 90;BA.debugLine="pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)";
Debug.ShouldStop(33554432);
act_search.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_search.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_search.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_search.mostCurrent.activityBA)),(Object)(act_search.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 91;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(67108864);
act_search.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 92;BA.debugLine="Dialog.Initialize(Activity)";
Debug.ShouldStop(134217728);
act_search.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_search.mostCurrent._activity.getObject()));
 BA.debugLineNum = 93;BA.debugLine="ListGoroohKala.Initialize";
Debug.ShouldStop(268435456);
act_search.mostCurrent._listgoroohkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 94;BA.debugLine="OriginalListGoroohKala.Initialize";
Debug.ShouldStop(536870912);
act_search.mostCurrent._originallistgoroohkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 95;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\",True,True)";
Debug.ShouldStop(1073741824);
act_search.mostCurrent._nicespinner.runVoidMethod ("Initialize",act_search.mostCurrent.activityBA,(Object)(BA.ObjectToString("NiceSpinner")),(Object)(act_search.mostCurrent.__c.getField(true,"True")),(Object)(act_search.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 97;BA.debugLine="Panel2.AddView(NiceSpinner,B4XComboBox1.mBase.Lef";
Debug.ShouldStop(1);
act_search.mostCurrent._panel2.runVoidMethod ("AddView",(Object)((act_search.mostCurrent._nicespinner.getObject())),(Object)(act_search.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_search.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_search.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_search.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 98;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
Debug.ShouldStop(2);
act_search.mostCurrent._nicespinner.runMethod(true,"setTextColor",act_search.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 99;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(4);
act_search.mostCurrent._nicespinner.runMethod(true,"setGravity",act_search.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 100;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"p";
Debug.ShouldStop(8);
act_search.mostCurrent._nicespinner.runMethod(false,"setTypeface",act_search.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 101;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(16);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 102;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
Debug.ShouldStop(32);
_op.runVoidMethod ("Initialize2",(Object)(act_search.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_search.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_search.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_search.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 103;BA.debugLine="NiceSpinner.Background=op";
Debug.ShouldStop(64);
act_search.mostCurrent._nicespinner.runMethod(false,"setBackground",(_op.getObject()));
 BA.debugLineNum = 105;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\",True,True)";
Debug.ShouldStop(256);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_search.mostCurrent.activityBA,(Object)(BA.ObjectToString("NiceSpinner1")),(Object)(act_search.mostCurrent.__c.getField(true,"True")),(Object)(act_search.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 107;BA.debugLine="Panel2.AddView(NiceSpinner1,B4XComboBox2.mBase.Le";
Debug.ShouldStop(1024);
act_search.mostCurrent._panel2.runVoidMethod ("AddView",(Object)((act_search.mostCurrent._nicespinner1.getObject())),(Object)(act_search.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_search.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_search.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_search.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 108;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(2048);
act_search.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_search.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 109;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(4096);
act_search.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_search.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 110;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(\"";
Debug.ShouldStop(8192);
act_search.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_search.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 111;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(16384);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 112;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
Debug.ShouldStop(32768);
_op1.runVoidMethod ("Initialize2",(Object)(act_search.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_search.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_search.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_search.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 113;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(65536);
act_search.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 114;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(131072);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 116;BA.debugLine="ListGroohKala.Initialize";
Debug.ShouldStop(524288);
act_search.mostCurrent._listgroohkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 117;BA.debugLine="OrginalListKala.Initialize";
Debug.ShouldStop(1048576);
act_search.mostCurrent._orginallistkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 118;BA.debugLine="ListKalaSp.Initialize";
Debug.ShouldStop(2097152);
act_search.mostCurrent._listkalasp.runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="ListKalaTxt.Initialize";
Debug.ShouldStop(4194304);
act_search.mostCurrent._listkalatxt.runVoidMethod ("Initialize");
 BA.debugLineNum = 121;BA.debugLine="LoadAcSpGroohKala";
Debug.ShouldStop(16777216);
_loadacspgroohkala();
 BA.debugLineNum = 124;BA.debugLine="HLV.Show";
Debug.ShouldStop(134217728);
act_search.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 125;BA.debugLine="MCode.CodeMoshtari = 0";
Debug.ShouldStop(268435456);
act_search.mostCurrent._mcode._codemoshtari /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 128;BA.debugLine="LoadKala";
Debug.ShouldStop(-2147483648);
_loadkala();
 BA.debugLineNum = 129;BA.debugLine="Img_TipFee.Visible=False";
Debug.ShouldStop(1);
act_search.mostCurrent._img_tipfee.runMethod(true,"setVisible",act_search.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 130;BA.debugLine="Label5.Visible=False";
Debug.ShouldStop(2);
act_search.mostCurrent._label5.runMethod(true,"setVisible",act_search.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,413);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 413;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Resume (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,394);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","activity_resume");}
 BA.debugLineNum = 394;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Application_Error (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1174);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 1174;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1176;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return act_search.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1177;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btn_Back_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1160);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","btn_back_click");}
 BA.debugLineNum = 1160;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1161;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
act_search.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1162;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("BtnCommentExit_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1020);
if (RapidSub.canDelegate("btncommentexit_click")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","btncommentexit_click");}
 BA.debugLineNum = 1020;BA.debugLine="Sub BtnCommentExit_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1021;BA.debugLine="pnlFilter.SetVisibleAnimated(300,False)";
Debug.ShouldStop(268435456);
act_search.mostCurrent._pnlfilter.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(act_search.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1022;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("BtnSearch_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1079);
if (RapidSub.canDelegate("btnsearch_click")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","btnsearch_click");}
 BA.debugLineNum = 1079;BA.debugLine="Sub BtnSearch_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1080;BA.debugLine="Log(\"BtnSearch_Click\")";
Debug.ShouldStop(8388608);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","580412673",RemoteObject.createImmutable("BtnSearch_Click"),0);
 BA.debugLineNum = 1090;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("BtnShowFilterPnl_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1024);
if (RapidSub.canDelegate("btnshowfilterpnl_click")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","btnshowfilterpnl_click");}
 BA.debugLineNum = 1024;BA.debugLine="Sub BtnShowFilterPnl_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1026;BA.debugLine="If Panel2.Height = Label11.top Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._panel2.runMethod(true,"getHeight"),BA.numberCast(double.class, act_search.mostCurrent._label11.runMethod(true,"getTop")))) { 
 BA.debugLineNum = 1027;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
Debug.ShouldStop(4);
act_search.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_search.mostCurrent._panel2.runMethod(true,"getLeft")),(Object)(act_search.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(act_search.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._lblpoint.runMethod(true,"getTop"),act_search.mostCurrent._lblpoint.runMethod(true,"getHeight")}, "+",1, 1)));
 BA.debugLineNum = 1028;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
Debug.ShouldStop(8);
act_search.mostCurrent._pnl_tools.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_search.mostCurrent._pnl_tools.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._panel2.runMethod(true,"getTop"),act_search.mostCurrent._panel2.runMethod(true,"getHeight"),act_search.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_search.mostCurrent.activityBA)}, "++",2, 1)),(Object)(act_search.mostCurrent._pnl_tools.runMethod(true,"getWidth")),(Object)(act_search.mostCurrent._pnl_tools.runMethod(true,"getHeight")));
 BA.debugLineNum = 1029;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
Debug.ShouldStop(16);
act_search.mostCurrent._pnl_hlv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_search.mostCurrent._pnl_hlv.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._pnl_tools.runMethod(true,"getTop"),act_search.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(act_search.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_search.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 1031;BA.debugLine="HLV.Height=pnl_HLV.Height - 15%y";
Debug.ShouldStop(64);
act_search.mostCurrent._hlv.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._pnl_hlv.runMethod(true,"getHeight"),act_search.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),act_search.mostCurrent.activityBA)}, "-",1, 1));
 }else {
 BA.debugLineNum = 1033;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
Debug.ShouldStop(256);
act_search.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_search.mostCurrent._panel2.runMethod(true,"getLeft")),(Object)(act_search.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(act_search.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(act_search.mostCurrent._label11.runMethod(true,"getTop")));
 BA.debugLineNum = 1034;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
Debug.ShouldStop(512);
act_search.mostCurrent._pnl_tools.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_search.mostCurrent._pnl_tools.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._pnl_top.runMethod(true,"getTop"),act_search.mostCurrent._pnl_top.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(act_search.mostCurrent._pnl_tools.runMethod(true,"getWidth")),(Object)(act_search.mostCurrent._pnl_tools.runMethod(true,"getHeight")));
 BA.debugLineNum = 1035;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
Debug.ShouldStop(1024);
act_search.mostCurrent._pnl_hlv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(act_search.mostCurrent._pnl_hlv.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._pnl_tools.runMethod(true,"getTop"),act_search.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(act_search.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_search.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 1038;BA.debugLine="HLV.Height=pnl_HLV.Height";
Debug.ShouldStop(8192);
act_search.mostCurrent._hlv.runMethod(true,"setHeight",act_search.mostCurrent._pnl_hlv.runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 1041;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("btnUpdate_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,149);
if (RapidSub.canDelegate("btnupdate_click")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","btnupdate_click");}
 BA.debugLineNum = 149;BA.debugLine="Sub btnUpdate_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 152;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(8388608);
if (act_search.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_search.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 153;BA.debugLine="StartService(FirebaseMessaging)";
Debug.ShouldStop(16777216);
act_search.mostCurrent.__c.runVoidMethod ("StartService",act_search.processBA,(Object)((act_search.mostCurrent._firebasemessaging.getObject())));
 BA.debugLineNum = 154;BA.debugLine="MCode.page=\"Search\"";
Debug.ShouldStop(33554432);
act_search.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Search");
 BA.debugLineNum = 155;BA.debugLine="FirebaseMessaging.mode=\"GetGalleryKala\"";
Debug.ShouldStop(67108864);
act_search.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = BA.ObjectToString("GetGalleryKala");
 }else {
 BA.debugLineNum = 157;BA.debugLine="LoadKala";
Debug.ShouldStop(268435456);
_loadkala();
 };
 BA.debugLineNum = 161;BA.debugLine="End Sub";
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
act_search.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 14;BA.debugLine="Dim Key As IME";
act_search.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 15;BA.debugLine="Dim ListKalaTxt,ListKalaSp,OrginalListKala As Lis";
act_search.mostCurrent._listkalatxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_search.mostCurrent._listkalasp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_search.mostCurrent._orginallistkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="Dim ListGroohKala As List";
act_search.mostCurrent._listgroohkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 17;BA.debugLine="Dim FeeTip As String";
act_search.mostCurrent._feetip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private Str_sort As String = \" Order by fldCodeKa";
act_search.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodeKala Asc");
 //BA.debugLineNum = 20;BA.debugLine="Dim Barcode As JhsIceZxing1";
act_search.mostCurrent._barcode = RemoteObject.createNew ("ice.zxing.b4aZXingLib");
 //BA.debugLineNum = 23;BA.debugLine="Private LblBasketCount As Label";
act_search.mostCurrent._lblbasketcount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LblBasket As Label";
act_search.mostCurrent._lblbasket = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private BtnShowFilterPnl As ImageView";
act_search.mostCurrent._btnshowfilterpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private TxtSearch As EditText";
act_search.mostCurrent._txtsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private BtnCommentExit As Button";
act_search.mostCurrent._btncommentexit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private BtnCommentOK As Button";
act_search.mostCurrent._btncommentok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private pnlFilter As Panel";
act_search.mostCurrent._pnlfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private pnl_HLV As Panel";
act_search.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Pnl_Top As Panel";
act_search.mostCurrent._pnl_top = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private ImageView1 As ImageView";
act_search.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private btn_Back As Button";
act_search.mostCurrent._btn_back = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private Label4 As Label";
act_search.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Panel2 As Panel";
act_search.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Panel3 As Panel";
act_search.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Label5 As Label";
act_search.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Label6 As Label";
act_search.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private BtnSearch As Label";
act_search.mostCurrent._btnsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private XUI As XUI";
act_search.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 53;BA.debugLine="Private Dialog As B4XDialog";
act_search.mostCurrent._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 54;BA.debugLine="Private Img_barcode As ImageView";
act_search.mostCurrent._img_barcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private Img_Paging As ImageView";
act_search.mostCurrent._img_paging = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private Img_sort As ImageView";
act_search.mostCurrent._img_sort = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private Img_TipFee As ImageView";
act_search.mostCurrent._img_tipfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private Label11 As Label";
act_search.mostCurrent._label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private Pnl_Tools As Panel";
act_search.mostCurrent._pnl_tools = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private LblPoint As Label";
act_search.mostCurrent._lblpoint = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private SwGift As ACSwitch";
act_search.mostCurrent._swgift = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private SwMojoodi As ACSwitch";
act_search.mostCurrent._swmojoodi = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private SwPic As ACSwitch";
act_search.mostCurrent._swpic = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private SwTakhfif As ACSwitch";
act_search.mostCurrent._swtakhfif = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private Pnl_Down As Panel";
act_search.mostCurrent._pnl_down = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Dim ListGoroohKala,OriginalListGoroohKala As List";
act_search.mostCurrent._listgoroohkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_search.mostCurrent._originallistgoroohkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 69;BA.debugLine="Public NiceSpinner As Hitex_NiceSpinner";
act_search.mostCurrent._nicespinner = RemoteObject.createNew ("hitex.nice.spinner.Hitex_NiceSpinner");
 //BA.debugLineNum = 70;BA.debugLine="Public NiceSpinner1 As Hitex_NiceSpinner";
act_search.mostCurrent._nicespinner1 = RemoteObject.createNew ("hitex.nice.spinner.Hitex_NiceSpinner");
 //BA.debugLineNum = 71;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
act_search.mostCurrent._b4xcombobox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 72;BA.debugLine="Private B4XComboBox2 As B4XComboBox";
act_search.mostCurrent._b4xcombobox2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 73;BA.debugLine="Dim GroupCodeSelect1 As String=\"0\"";
act_search.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 //BA.debugLineNum = 74;BA.debugLine="Dim GroupNameSelect1 As String=\"\"";
act_search.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 //BA.debugLineNum = 75;BA.debugLine="Dim GroupCodeSelect2 As String=\"0\"";
act_search.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 //BA.debugLineNum = 76;BA.debugLine="Dim GroupNameSelect2 As String=\"\"";
act_search.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 //BA.debugLineNum = 78;BA.debugLine="Dim lstSelectedCodeGroupKala As List";
act_search.mostCurrent._lstselectedcodegroupkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,888);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","hlv_getitemcount");}
 BA.debugLineNum = 888;BA.debugLine="Sub HLV_GetItemCount As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 889;BA.debugLine="Try								        '💯 ItemCount 💯'";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 890;BA.debugLine="Return ListKalaTxt.Size";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) return act_search.mostCurrent._listkalatxt.runMethod(true,"getSize");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_search.processBA, e4.toString()); BA.debugLineNum = 893;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(268435456);
act_search.mostCurrent._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_search.mostCurrent.__c.runMethod(false,"LastException",act_search.mostCurrent.activityBA))));
 BA.debugLineNum = 894;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579560710",BA.ObjectToString(act_search.mostCurrent.__c.runMethod(false,"LastException",act_search.mostCurrent.activityBA)),0);
 BA.debugLineNum = 895;BA.debugLine="Return 0";
Debug.ShouldStop(1073741824);
if (true) return BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 897;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("HLV_onBindViewHolder (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,906);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_search");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 906;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(512);
 BA.debugLineNum = 907;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 908;BA.debugLine="Dim Item = ListKalaTxt.Get(Position) As AdapterLi";
Debug.ShouldStop(2048);
_item = (act_search.mostCurrent._listkalatxt.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 909;BA.debugLine="Dim rec As cls_Search=Parent.Tag";
Debug.ShouldStop(4096);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 910;BA.debugLine="rec.Show(Item,Position)";
Debug.ShouldStop(8192);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_show" /*RemoteObject*/ ,(Object)(_item),(Object)(_position));
 BA.debugLineNum = 911;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(16384);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_getheight" /*RemoteObject*/ ));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_search.processBA, e7.toString()); BA.debugLineNum = 913;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(65536);
act_search.mostCurrent._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_search.mostCurrent.__c.runMethod(false,"LastException",act_search.mostCurrent.activityBA))));
 BA.debugLineNum = 914;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579691784",BA.ObjectToString(act_search.mostCurrent.__c.runMethod(false,"LastException",act_search.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 916;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,898);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_search");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 898;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(2);
 BA.debugLineNum = 900;BA.debugLine="Dim rec As cls_Search";
Debug.ShouldStop(8);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_search");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 901;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(16);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_initialize" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(act_search.getObject()));
 BA.debugLineNum = 902;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(32);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_search.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_search.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_search.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 903;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(64);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 905;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Img_barcode_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,918);
if (RapidSub.canDelegate("img_barcode_click")) { ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","img_barcode_click"); return;}
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
public ResumableSub_Img_barcode_Click(ir.parsikhesab.pakhsh.act_search parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_search parent;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _permission = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Img_barcode_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,918);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 920;BA.debugLine="Dim Result As Boolean = True";
Debug.ShouldStop(8388608);
_result = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 921;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 922;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
Debug.ShouldStop(33554432);
parent._rp.runVoidMethod ("CheckAndRequest",act_search.processBA,(Object)(parent._rp.getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 923;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_search.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_search", "img_barcode_click"), null);
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
 BA.debugLineNum = 925;BA.debugLine="If Result=False Then";
Debug.ShouldStop(268435456);

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
 BA.debugLineNum = 926;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 928;BA.debugLine="Barcode.BeginScan(\"myzx\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._barcode.runVoidMethod ("BeginScan",act_search.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("myzx")));
 if (true) break;

case 9:
//C
this.state = -1;
;
 BA.debugLineNum = 931;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Img_Paging_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1125);
if (RapidSub.canDelegate("img_paging_click")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","img_paging_click");}
 BA.debugLineNum = 1125;BA.debugLine="Sub Img_Paging_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 1127;BA.debugLine="Act_KalaPaging2.listKala=ListKalaTxt";
Debug.ShouldStop(64);
act_search.mostCurrent._act_kalapaging2._listkala /*RemoteObject*/  = act_search.mostCurrent._listkalatxt;
 BA.debugLineNum = 1128;BA.debugLine="StartActivity(Act_KalaPaging2)";
Debug.ShouldStop(128);
act_search.mostCurrent.__c.runVoidMethod ("StartActivity",act_search.processBA,(Object)((act_search.mostCurrent._act_kalapaging2.getObject())));
 BA.debugLineNum = 1130;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Img_sort_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1092);
if (RapidSub.canDelegate("img_sort_click")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","img_sort_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1092;BA.debugLine="Sub Img_sort_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1101;BA.debugLine="Dim Lst As List = Array As String(\"کد کالا\",\"نام";
Debug.ShouldStop(4096);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_search.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("کد کالا"),BA.ObjectToString("نام کالا نزولی"),BA.ObjectToString("نام کالا صعودی"),BA.ObjectToString("ارزان ترین قیمت"),BA.ObjectToString("گرانترین قیمت"),BA.ObjectToString("کمترین موجودی"),RemoteObject.createImmutable("بیشترین موجودی")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 1102;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
Debug.ShouldStop(8192);
_res = act_search.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("مرتب سازی براساس:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_search.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1103;BA.debugLine="Select Case res";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6))) {
case 0: {
 BA.debugLineNum = 1105;BA.debugLine="Str_sort = \" Order by fldCodeKala Asc\"";
Debug.ShouldStop(65536);
act_search.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodeKala Asc");
 break; }
case 1: {
 BA.debugLineNum = 1107;BA.debugLine="Str_sort = \" Order by fldNameKala\"";
Debug.ShouldStop(262144);
act_search.mostCurrent._str_sort = BA.ObjectToString(" Order by fldNameKala");
 break; }
case 2: {
 BA.debugLineNum = 1109;BA.debugLine="Str_sort = \" Order by fldNameKala Desc\"";
Debug.ShouldStop(1048576);
act_search.mostCurrent._str_sort = BA.ObjectToString(" Order by fldNameKala Desc");
 break; }
case 3: {
 BA.debugLineNum = 1111;BA.debugLine="Str_sort = \" Order by fldFeeForoosh\"";
Debug.ShouldStop(4194304);
act_search.mostCurrent._str_sort = BA.ObjectToString(" Order by fldFeeForoosh");
 break; }
case 4: {
 BA.debugLineNum = 1113;BA.debugLine="Str_sort = \" Order by fldFeeForoosh Desc\"";
Debug.ShouldStop(16777216);
act_search.mostCurrent._str_sort = BA.ObjectToString(" Order by fldFeeForoosh Desc");
 break; }
case 5: {
 BA.debugLineNum = 1115;BA.debugLine="Str_sort = \" Order by SumMande\"";
Debug.ShouldStop(67108864);
act_search.mostCurrent._str_sort = BA.ObjectToString(" Order by SumMande");
 break; }
case 6: {
 BA.debugLineNum = 1117;BA.debugLine="Str_sort = \" Order by SumMande Desc\"";
Debug.ShouldStop(268435456);
act_search.mostCurrent._str_sort = BA.ObjectToString(" Order by SumMande Desc");
 break; }
}
;
 BA.debugLineNum = 1119;BA.debugLine="Log(Str_sort)";
Debug.ShouldStop(1073741824);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","580478235",act_search.mostCurrent._str_sort,0);
 BA.debugLineNum = 1121;BA.debugLine="LoadKala";
Debug.ShouldStop(1);
_loadkala();
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
public static void  _img_tipfee_click() throws Exception{
try {
		Debug.PushSubsStack("Img_TipFee_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1132);
if (RapidSub.canDelegate("img_tipfee_click")) { ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","img_tipfee_click"); return;}
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
public ResumableSub_Img_TipFee_Click(ir.parsikhesab.pakhsh.act_search parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_search parent;
RemoteObject _btnshow = RemoteObject.createImmutable(0);
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Img_TipFee_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1132);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1134;BA.debugLine="Dim btnshow As Int=myCode.getSetting(\"setting.dat";
Debug.ShouldStop(8192);
_btnshow = BA.numberCast(int.class, parent.mostCurrent._mycode.runMethod(true,"_getsetting" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(BA.ObjectToString("setting.dat")),(Object)(BA.ObjectToString("WSetTip")),(Object)(BA.NumberToString(0))));Debug.locals.put("btnshow", _btnshow);Debug.locals.put("btnshow", _btnshow);
 BA.debugLineNum = 1135;BA.debugLine="Log(btnshow)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","580609283",BA.NumberToString(_btnshow),0);
 BA.debugLineNum = 1136;BA.debugLine="If btnshow=0 Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 1137;BA.debugLine="ToastMessageShow(\"دسترسی شما به این گزینه محدود";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("دسترسی شما به این گزینه محدود است")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1138;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1142;BA.debugLine="Dim Lst As List";
Debug.ShouldStop(2097152);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 1144;BA.debugLine="Lst.Initialize2(Array As String(\"تیپ1 (بدون احتسا";
Debug.ShouldStop(8388608);
_lst.runVoidMethod ("Initialize2",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.ObjectToString("تیپ1 (بدون احتساب تخفیف)"),BA.ObjectToString("تیپ1 (با احتساب تخفیف)"),BA.ObjectToString("تیپ قیمت 3"),BA.ObjectToString("تیپ قیمت 4"),BA.ObjectToString("تیپ قیمت 5"),BA.ObjectToString("تیپ قیمت 6"),BA.ObjectToString("تیپ قیمت 7"),BA.ObjectToString("تیپ قیمت 8"),BA.ObjectToString("تیپ قیمت 9"),RemoteObject.createImmutable("تیپ قیمت 10")})))));
 BA.debugLineNum = 1145;BA.debugLine="If FeeTip = 0 Then FeeTip=1";
Debug.ShouldStop(16777216);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._feetip,BA.NumberToString(0))) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
parent.mostCurrent._feetip = BA.NumberToString(1);
if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1146;BA.debugLine="InputListAsync(Lst,\"تیپ قیمت را انتخاب کنید\",FeeT";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("InputListAsync",(Object)(_lst),(Object)(BA.ObjectToCharSequence("تیپ قیمت را انتخاب کنید")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent.mostCurrent._feetip),RemoteObject.createImmutable(1)}, "-",1, 0))),act_search.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1147;BA.debugLine="Wait For InputList_Result (Result As Int)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","inputlist_result", act_search.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_search", "img_tipfee_click"), null);
this.state = 19;
return;
case 19:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1148;BA.debugLine="If Result <> -3 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 11:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, -(double) (0 + 3)))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1149;BA.debugLine="Dim Res As Int=Msgbox2(\"توجه داشته باشید که با ت";
Debug.ShouldStop(268435456);
_res = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟")),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),act_search.mostCurrent.activityBA);Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 1150;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(536870912);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1151;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Delete From TblSabad")));
 BA.debugLineNum = 1152;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(-2147483648);
_refreshlblsabad();
 BA.debugLineNum = 1153;BA.debugLine="FeeTip = Result+1";
Debug.ShouldStop(1);
parent.mostCurrent._feetip = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_result,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 1154;BA.debugLine="search(True)";
Debug.ShouldStop(2);
_search(parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1158;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _loadacspgroohkala() throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpGroohKala (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,417);
if (RapidSub.canDelegate("loadacspgroohkala")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","loadacspgroohkala");}
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 417;BA.debugLine="Sub LoadAcSpGroohKala";
Debug.ShouldStop(1);
 BA.debugLineNum = 419;BA.debugLine="Dim Dt As Cursor = MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(4);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt = act_search.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 420;BA.debugLine="NiceSpinner.Add(\"همه گروه ها\")";
Debug.ShouldStop(8);
act_search.mostCurrent._nicespinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 421;BA.debugLine="For i=0 To Dt.RowCount-1";
Debug.ShouldStop(16);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_dt.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 422;BA.debugLine="Dt.Position=i";
Debug.ShouldStop(32);
_dt.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 423;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(64);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 424;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(128);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 425;BA.debugLine="Log(Dt.GetString(\"FldC_Gorooh\"))";
Debug.ShouldStop(256);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579167496",_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))),0);
 BA.debugLineNum = 426;BA.debugLine="cu=MCode.Result(\"Select fldCodeKala From TblKala";
Debug.ShouldStop(512);
_cu = act_search.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select fldCodeKala From TblKala where fldCodeGroup like '"),_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))),RemoteObject.createImmutable("%'"))));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 427;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 428;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(2048);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 429;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(4096);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 430;BA.debugLine="OriginalListGoroohKala.Add(Item)";
Debug.ShouldStop(8192);
act_search.mostCurrent._originallistgoroohkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 431;BA.debugLine="NiceSpinner.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(16384);
act_search.mostCurrent._nicespinner.runVoidMethod ("Add",(Object)(_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 435;BA.debugLine="NiceSpinner.Show(Colors.blue, 14)";
Debug.ShouldStop(262144);
act_search.mostCurrent._nicespinner.runVoidMethod ("Show",(Object)(act_search.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 437;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("LoadKala (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,165);
if (RapidSub.canDelegate("loadkala")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","loadkala");}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _countfilter = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.createImmutable(false);
RemoteObject _strsearch = RemoteObject.createImmutable("");
 BA.debugLineNum = 165;BA.debugLine="Sub LoadKala";
Debug.ShouldStop(16);
 BA.debugLineNum = 167;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 170;BA.debugLine="Dim str As String=\"\"";
Debug.ShouldStop(512);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 171;BA.debugLine="Dim countfilter As Int=0";
Debug.ShouldStop(1024);
_countfilter = BA.numberCast(int.class, 0);Debug.locals.put("countfilter", _countfilter);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 172;BA.debugLine="Dim filter As Boolean=False";
Debug.ShouldStop(2048);
_filter = act_search.mostCurrent.__c.getField(true,"False");Debug.locals.put("filter", _filter);Debug.locals.put("filter", _filter);
 BA.debugLineNum = 179;BA.debugLine="Log(GroupCodeSelect1)";
Debug.ShouldStop(262144);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","578905358",act_search.mostCurrent._groupcodeselect1,0);
 BA.debugLineNum = 180;BA.debugLine="Log(GroupCodeSelect2)";
Debug.ShouldStop(524288);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","578905359",act_search.mostCurrent._groupcodeselect2,0);
 BA.debugLineNum = 181;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 The";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",act_search.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 182;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swgift.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 183;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(4194304);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 184;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
Debug.ShouldStop(8388608);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"));Debug.locals.put("str", _str);
 BA.debugLineNum = 185;BA.debugLine="filter=True";
Debug.ShouldStop(16777216);
_filter = act_search.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 186;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 187;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(67108864);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 190;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 191;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1073741824);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 192;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 193;BA.debugLine="filter=True";
Debug.ShouldStop(1);
_filter = act_search.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 194;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 195;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(4);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 198;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._mcode._namayeshkalasefr /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 199;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(64);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 200;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(128);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 201;BA.debugLine="filter=True";
Debug.ShouldStop(256);
_filter = act_search.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 202;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 203;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(1024);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 207;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 208;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(32768);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 209;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 210;BA.debugLine="filter=True";
Debug.ShouldStop(131072);
_filter = act_search.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 211;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 212;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(524288);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 215;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swpic.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 216;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(8388608);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 217;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(16777216);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 218;BA.debugLine="filter=True";
Debug.ShouldStop(33554432);
_filter = act_search.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 219;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 220;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(134217728);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 224;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",act_search.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",act_search.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",act_search.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 225;BA.debugLine="Dim StrSearch As String= MCode.ConvertNumbersP";
Debug.ShouldStop(1);
_strsearch = act_search.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(act_search.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("StrSearch", _strsearch);Debug.locals.put("StrSearch", _strsearch);
 BA.debugLineNum = 226;BA.debugLine="If StrSearch=\"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_strsearch,BA.ObjectToString(""))) { 
 BA.debugLineNum = 227;BA.debugLine="StrSearch=TxtSearch.Text";
Debug.ShouldStop(4);
_strsearch = act_search.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("StrSearch", _strsearch);
 };
 BA.debugLineNum = 229;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 230;BA.debugLine="If IsNumber(StrSearch) Then";
Debug.ShouldStop(32);
if (act_search.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_strsearch)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 231;BA.debugLine="If StrSearch.Length>5 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_strsearch.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 232;BA.debugLine="str = str & $\" and (fldSerial = '${StrSearch";
Debug.ShouldStop(128);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSerial = '"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strsearch))),RemoteObject.createImmutable("') "))));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 234;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Str";
Debug.ShouldStop(512);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodeKala like '%"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strsearch))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 }else {
 BA.debugLineNum = 238;BA.debugLine="str = str & $\" and (fldNameKala like '%${StrS";
Debug.ShouldStop(8192);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldNameKala like '%"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strsearch))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 240;BA.debugLine="filter=True";
Debug.ShouldStop(32768);
_filter = act_search.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 241;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 242;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(131072);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 245;BA.debugLine="If filter=True And str<>\"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_filter,act_search.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 248;BA.debugLine="str=\"select * from TblKala where \"&str&\" \"&Str";
Debug.ShouldStop(8388608);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where "),_str,RemoteObject.createImmutable(" "),act_search.mostCurrent._str_sort);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 250;BA.debugLine="str=\"select * from TblKala  \"&Str_sort";
Debug.ShouldStop(33554432);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala  "),act_search.mostCurrent._str_sort);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 252;BA.debugLine="Log(str)";
Debug.ShouldStop(134217728);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","578905431",_str,0);
 };
 BA.debugLineNum = 255;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Th";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",act_search.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",act_search.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 256;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swgift.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 257;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 258;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
Debug.ShouldStop(2);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 261;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 262;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(32);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 263;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 266;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 267;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1024);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 268;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(2048);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 271;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._mcode._namayeshkalasefr /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 272;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(32768);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 273;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 274;BA.debugLine="filter=True";
Debug.ShouldStop(131072);
_filter = act_search.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 275;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 276;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(524288);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 279;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swpic.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 280;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(8388608);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 281;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(16777216);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 285;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",act_search.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",act_search.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",act_search.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 286;BA.debugLine="Dim StrSearch As String=MCode.ConvertNumbersPe";
Debug.ShouldStop(536870912);
_strsearch = act_search.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(act_search.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("StrSearch", _strsearch);Debug.locals.put("StrSearch", _strsearch);
 BA.debugLineNum = 287;BA.debugLine="If StrSearch=\"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_strsearch,BA.ObjectToString(""))) { 
 BA.debugLineNum = 288;BA.debugLine="StrSearch=TxtSearch.Text";
Debug.ShouldStop(-2147483648);
_strsearch = act_search.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("StrSearch", _strsearch);
 };
 BA.debugLineNum = 290;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 291;BA.debugLine="If IsNumber(StrSearch) Then";
Debug.ShouldStop(4);
if (act_search.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_strsearch)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 292;BA.debugLine="If StrSearch.Length>5 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_strsearch.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 293;BA.debugLine="str = str & $\" and (fldSerial = '${StrSearch";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSerial = '"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strsearch))),RemoteObject.createImmutable("') "))));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 295;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Str";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodeKala like '%"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strsearch))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 }else {
 BA.debugLineNum = 299;BA.debugLine="str = str & $\" and (fldNameKala like '%${StrS";
Debug.ShouldStop(1024);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldNameKala like '%"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strsearch))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 301;BA.debugLine="filter=True";
Debug.ShouldStop(4096);
_filter = act_search.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 302;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 303;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(16384);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 306;BA.debugLine="If	filter=True And str<>\"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_filter,act_search.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 307;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_search.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" "),act_search.mostCurrent._str_sort);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 309;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_search.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' "),act_search.mostCurrent._str_sort);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 313;BA.debugLine="Log(str)";
Debug.ShouldStop(16777216);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","578905492",_str,0);
 };
 BA.debugLineNum = 316;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 T";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("!",act_search.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("!",act_search.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 317;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swgift.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 318;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(536870912);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 319;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
Debug.ShouldStop(1073741824);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 322;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 323;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(4);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 324;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 327;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 328;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(128);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 329;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(256);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 332;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._mcode._namayeshkalasefr /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 333;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(4096);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 334;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(8192);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 335;BA.debugLine="filter=True";
Debug.ShouldStop(16384);
_filter = act_search.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 336;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 337;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(65536);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 340;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swpic.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 341;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1048576);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 342;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 346;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",act_search.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",act_search.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(" ")) && RemoteObject.solveBoolean("!",act_search.mostCurrent._txtsearch.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 347;BA.debugLine="Dim StrSearch As String=MCode.ConvertNumbersPe";
Debug.ShouldStop(67108864);
_strsearch = act_search.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(act_search.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("StrSearch", _strsearch);Debug.locals.put("StrSearch", _strsearch);
 BA.debugLineNum = 348;BA.debugLine="If StrSearch=\"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_strsearch,BA.ObjectToString(""))) { 
 BA.debugLineNum = 349;BA.debugLine="StrSearch=TxtSearch.Text";
Debug.ShouldStop(268435456);
_strsearch = act_search.mostCurrent._txtsearch.runMethod(true,"getText");Debug.locals.put("StrSearch", _strsearch);
 };
 BA.debugLineNum = 351;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1073741824);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 352;BA.debugLine="If IsNumber(StrSearch) Then";
Debug.ShouldStop(-2147483648);
if (act_search.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_strsearch)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 353;BA.debugLine="If StrSearch.Length>5 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_strsearch.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 354;BA.debugLine="str = str & $\" and (fldSerial = '${StrSearch";
Debug.ShouldStop(2);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldSerial = '"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strsearch))),RemoteObject.createImmutable("') "))));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 356;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Str";
Debug.ShouldStop(8);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodeKala like '%"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strsearch))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 }else {
 BA.debugLineNum = 360;BA.debugLine="str = str & $\" and (fldNameKala like '%${StrS";
Debug.ShouldStop(128);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldNameKala like '%"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strsearch))),RemoteObject.createImmutable("%') "))));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 362;BA.debugLine="filter=True";
Debug.ShouldStop(512);
_filter = act_search.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 363;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 364;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(2048);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 368;BA.debugLine="If	filter=True And str<>\"\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_filter,act_search.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 369;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_search.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" "),act_search.mostCurrent._str_sort);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 371;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_search.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' "),act_search.mostCurrent._str_sort);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 374;BA.debugLine="Log(str)";
Debug.ShouldStop(2097152);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","578905553",_str,0);
 };
 BA.debugLineNum = 376;BA.debugLine="FirebaseMessaging.mode=\"stop\"";
Debug.ShouldStop(8388608);
act_search.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = BA.ObjectToString("stop");
 BA.debugLineNum = 377;BA.debugLine="LoadListKala(str)";
Debug.ShouldStop(16777216);
_loadlistkala(_str);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e182) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_search.processBA, e182.toString()); BA.debugLineNum = 383;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","578905562",BA.ObjectToString(act_search.mostCurrent.__c.runMethod(false,"LastException",act_search.mostCurrent.activityBA)),0);
 BA.debugLineNum = 384;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(-2147483648);
act_search.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_search.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_search.mostCurrent.__c.runMethod(false,"LastException",act_search.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_search.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadKala"))));
 };
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("LoadListKala (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,440);
if (RapidSub.canDelegate("loadlistkala")) { ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","loadlistkala", _query); return;}
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
public ResumableSub_LoadListKala(ir.parsikhesab.pakhsh.act_search parent,RemoteObject _query) {
this.parent = parent;
this._query = _query;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_search parent;
RemoteObject _query;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _itemkala = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _fldfeeforoosh = RemoteObject.createImmutable(0);
RemoteObject _fldtedaddarkarton = RemoteObject.createImmutable(0);
RemoteObject _summande = RemoteObject.createImmutable(0);
int step4;
int limit4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadListKala (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,440);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Query", _query);
 BA.debugLineNum = 442;BA.debugLine="OrginalListKala.Clear";
Debug.ShouldStop(33554432);
parent.mostCurrent._orginallistkala.runVoidMethod ("Clear");
 BA.debugLineNum = 443;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(_query));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 445;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 446;BA.debugLine="For i = 0 To Cu.RowCount - 1";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//for
this.state = 17;
step4 = 1;
limit4 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 17;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 6;
if (true) break;

case 20:
//C
this.state = 19;
_i = ((int)(0 + _i + step4)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 447;BA.debugLine="Dim ItemKala As AdapterListKala";
Debug.ShouldStop(1073741824);
_itemkala = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");Debug.locals.put("ItemKala", _itemkala);
 BA.debugLineNum = 448;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(-2147483648);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 449;BA.debugLine="Log(Cu.Getstring(\"fldCodeGroup\"))";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","579233033",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroup"))),0);
 BA.debugLineNum = 450;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
Debug.ShouldStop(2);
_itemkala.setField ("CodeKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeKala"))));
 BA.debugLineNum = 451;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
Debug.ShouldStop(4);
_itemkala.setField ("NameKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameKala"))));
 BA.debugLineNum = 452;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\")";
Debug.ShouldStop(8);
_itemkala.setField ("NameVahed" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed"))));
 BA.debugLineNum = 453;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed2";
Debug.ShouldStop(16);
_itemkala.setField ("NameVahed2" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))));
 BA.debugLineNum = 454;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
Debug.ShouldStop(32);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));
 BA.debugLineNum = 457;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTedad";
Debug.ShouldStop(256);
_itemkala.setField ("TedadDarKarton" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))));
 BA.debugLineNum = 458;BA.debugLine="ItemKala.FeeForoosh=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(512);
_itemkala.setField ("FeeForoosh" /*RemoteObject*/ ,_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));
 BA.debugLineNum = 459;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString(\"";
Debug.ShouldStop(1024);
_itemkala.setField ("FldMablaghMasrafKonande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldGhymatMasrafkonande"))));
 BA.debugLineNum = 461;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
Debug.ShouldStop(4096);
_itemkala.setField ("fldPathPic" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))));
 BA.debugLineNum = 462;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null The";
Debug.ShouldStop(8192);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 463;BA.debugLine="Log(Cu.GetString(\"fldFeeBadAzTakhfif\"))";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","579233047",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))),0);
 BA.debugLineNum = 464;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fldF";
Debug.ShouldStop(32768);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 466;BA.debugLine="Log(Cu.GetString(\"fldFeeBadAzTakhfif\"))";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","579233050",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))),0);
 BA.debugLineNum = 467;BA.debugLine="Log(\"0\")";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","579233051",RemoteObject.createImmutable("0"),0);
 BA.debugLineNum = 468;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(524288);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 470;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
Debug.ShouldStop(2097152);
_itemkala.setField ("fldPathPic" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))));
 BA.debugLineNum = 473;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 474;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Get";
Debug.ShouldStop(33554432);
_fldfeeforoosh = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 475;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu";
Debug.ShouldStop(67108864);
_fldtedaddarkarton = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 476;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\")";
Debug.ShouldStop(134217728);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 477;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * FldT";
Debug.ShouldStop(268435456);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 478;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fld";
Debug.ShouldStop(536870912);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0)))));
 if (true) break;

case 16:
//C
this.state = 20;
;
 BA.debugLineNum = 480;BA.debugLine="OrginalListKala.Add(ItemKala)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._orginallistkala.runVoidMethod ("Add",(Object)((_itemkala)));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
Debug.locals.put("i", _i);
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 484;BA.debugLine="Log(OrginalListKala.Size)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","579233068",BA.NumberToString(parent.mostCurrent._orginallistkala.runMethod(true,"getSize")),0);
 BA.debugLineNum = 485;BA.debugLine="ListKalaSp=OrginalListKala";
Debug.ShouldStop(16);
parent.mostCurrent._listkalasp = parent.mostCurrent._orginallistkala;
 BA.debugLineNum = 486;BA.debugLine="ListKalaTxt=ListKalaSp";
Debug.ShouldStop(32);
parent.mostCurrent._listkalatxt = parent.mostCurrent._listkalasp;
 BA.debugLineNum = 487;BA.debugLine="Sleep(100)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_search.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_search", "loadlistkala"),BA.numberCast(int.class, 100));
this.state = 21;
return;
case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 490;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(512);
parent.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 492;BA.debugLine="End Sub";
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
public static RemoteObject  _myzx_result(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("myzx_result (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,933);
if (RapidSub.canDelegate("myzx_result")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","myzx_result", _atype, _values);}
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 933;BA.debugLine="Sub myzx_result(atype As String,Values As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 935;BA.debugLine="LogColor(\"type:\"&atype&\"values:\"&Values,Colors.re";
Debug.ShouldStop(64);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579822850",RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("values:"),_values),act_search.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 938;BA.debugLine="TxtSearch.Text=Values";
Debug.ShouldStop(512);
act_search.mostCurrent._txtsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_values));
 BA.debugLineNum = 939;BA.debugLine="BtnSearch.Tag=True";
Debug.ShouldStop(1024);
act_search.mostCurrent._btnsearch.runMethod(false,"setTag",(act_search.mostCurrent.__c.getField(true,"True")));
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
public static RemoteObject  _nicespinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner_ItemClick (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,531);
if (RapidSub.canDelegate("nicespinner_itemclick")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","nicespinner_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 531;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
Debug.ShouldStop(262144);
 BA.debugLineNum = 534;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(2097152);
act_search.mostCurrent._key.runVoidMethod ("HideKeyboard",act_search.mostCurrent.activityBA);
 BA.debugLineNum = 537;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 538;BA.debugLine="ListGroohKala.Clear";
Debug.ShouldStop(33554432);
act_search.mostCurrent._listgroohkala.runVoidMethod ("Clear");
 BA.debugLineNum = 539;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(67108864);
act_search.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 540;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(134217728);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 541;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(268435456);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 543;BA.debugLine="GroupCodeSelect1=\"0\"";
Debug.ShouldStop(1073741824);
act_search.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 BA.debugLineNum = 544;BA.debugLine="GroupNameSelect1=\"\"";
Debug.ShouldStop(-2147483648);
act_search.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 BA.debugLineNum = 545;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(1);
act_search.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 546;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(2);
act_search.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 547;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(4);
act_search.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 550;BA.debugLine="Dim lst As List=OriginalListGoroohKala";
Debug.ShouldStop(32);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_search.mostCurrent._originallistgoroohkala;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 551;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
Debug.ShouldStop(64);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 552;BA.debugLine="Log(Item.FldN_Gorooh)";
Debug.ShouldStop(128);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579364117",_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 553;BA.debugLine="Log(Item.FldC_Gorooh)";
Debug.ShouldStop(256);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579364118",_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 554;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(512);
act_search.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 555;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
Debug.ShouldStop(1024);
act_search.mostCurrent._groupnameselect1 = _item.getField(true,"FldN_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 556;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2048);
act_search.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 557;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4096);
act_search.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 558;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(8192);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 560;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(32768);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 561;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
Debug.ShouldStop(65536);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_search.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 562;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 563;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(262144);
act_search.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 564;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(524288);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 565;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(1048576);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 566;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(2097152);
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 567;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(4194304);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 568;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(8388608);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 569;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(16777216);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 570;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(33554432);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 571;BA.debugLine="ListGroohKala.Add(Item)";
Debug.ShouldStop(67108864);
act_search.mostCurrent._listgroohkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 572;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(134217728);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 574;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
Debug.ShouldStop(536870912);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Show",(Object)(act_search.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 575;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(1073741824);
act_search.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 576;BA.debugLine="lstSelectedCodeGroupKala.Add(GroupCodeSelect1)";
Debug.ShouldStop(-2147483648);
act_search.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Add",(Object)((act_search.mostCurrent._groupcodeselect1)));
 }else {
 BA.debugLineNum = 578;BA.debugLine="ListGroohKala.Clear";
Debug.ShouldStop(2);
act_search.mostCurrent._listgroohkala.runVoidMethod ("Clear");
 BA.debugLineNum = 579;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(4);
act_search.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 580;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(8);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 581;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(16);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 582;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(32);
act_search.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 583;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(64);
act_search.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 584;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(128);
act_search.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 588;BA.debugLine="LoadKala";
Debug.ShouldStop(2048);
_loadkala();
 BA.debugLineNum = 589;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(4096);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579364154",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_search.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 590;BA.debugLine="Log(\"postion1: \"&Position)";
Debug.ShouldStop(8192);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579364155",RemoteObject.concat(RemoteObject.createImmutable("postion1: "),_position),0);
 BA.debugLineNum = 593;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("NiceSpinner1_ItemClick (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,595);
if (RapidSub.canDelegate("nicespinner1_itemclick")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","nicespinner1_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 595;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
Debug.ShouldStop(262144);
 BA.debugLineNum = 597;BA.debugLine="If Position=0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 599;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupKala.Get(ls";
Debug.ShouldStop(4194304);
act_search.mostCurrent._groupcodeselect2 = BA.ObjectToString(act_search.mostCurrent._lstselectedcodegroupkala.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._lstselectedcodegroupkala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 }else {
 BA.debugLineNum = 601;BA.debugLine="Dim lst As List=ListGroohKala";
Debug.ShouldStop(16777216);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_search.mostCurrent._listgroohkala;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 602;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
Debug.ShouldStop(33554432);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 603;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
Debug.ShouldStop(67108864);
act_search.mostCurrent._groupcodeselect2 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 605;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(268435456);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 607;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(1073741824);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 608;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
Debug.ShouldStop(-2147483648);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_search.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 609;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 610;BA.debugLine="ListGroohKala.Clear";
Debug.ShouldStop(2);
act_search.mostCurrent._listgroohkala.runVoidMethod ("Clear");
 BA.debugLineNum = 611;BA.debugLine="NiceSpinner1.Clear";
Debug.ShouldStop(4);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 614;BA.debugLine="lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)";
Debug.ShouldStop(32);
act_search.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Add",(Object)((_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 617;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
Debug.ShouldStop(256);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه گروه ها")));
 BA.debugLineNum = 619;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(1024);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 620;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(2048);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 621;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(4096);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 622;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(8192);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 623;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(16384);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 624;BA.debugLine="ListGroohKala.Add(Item)";
Debug.ShouldStop(32768);
act_search.mostCurrent._listgroohkala.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 625;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(65536);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Add",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 628;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
Debug.ShouldStop(524288);
act_search.mostCurrent._nicespinner1.runVoidMethod ("Show",(Object)(act_search.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 629;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(1048576);
act_search.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 632;BA.debugLine="LoadKala";
Debug.ShouldStop(8388608);
_loadkala();
 BA.debugLineNum = 633;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(16777216);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579429670",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_search.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 634;BA.debugLine="Log(\"position2: \"&Position)";
Debug.ShouldStop(33554432);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579429671",RemoteObject.concat(RemoteObject.createImmutable("position2: "),_position),0);
 BA.debugLineNum = 636;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("NumberSearch_TextChanged (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1010);
if (RapidSub.canDelegate("numbersearch_textchanged")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","numbersearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1010;BA.debugLine="Sub NumberSearch_TextChanged (Old As String, New A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1012;BA.debugLine="LoadKala";
Debug.ShouldStop(524288);
_loadkala();
 BA.debugLineNum = 1013;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Pnl_Down_Click (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1164);
if (RapidSub.canDelegate("pnl_down_click")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","pnl_down_click");}
 BA.debugLineNum = 1164;BA.debugLine="Sub Pnl_Down_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1166;BA.debugLine="If LblBasketCount.Visible Then";
Debug.ShouldStop(8192);
if (act_search.mostCurrent._lblbasketcount.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1167;BA.debugLine="StartActivity(Act_Sabad)";
Debug.ShouldStop(16384);
act_search.mostCurrent.__c.runVoidMethod ("StartActivity",act_search.processBA,(Object)((act_search.mostCurrent._act_sabad.getObject())));
 BA.debugLineNum = 1168;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
act_search.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 1170;BA.debugLine="ToastMessageShow(\"سبد خرید خالی است\",False)";
Debug.ShouldStop(131072);
act_search.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سبد خرید خالی است")),(Object)(act_search.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 1173;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Dim rp As RuntimePermissions";
act_search._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refreshlblsabad() throws Exception{
try {
		Debug.PushSubsStack("RefreshLblSabad (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,400);
if (RapidSub.canDelegate("refreshlblsabad")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","refreshlblsabad");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 400;BA.debugLine="Sub RefreshLblSabad";
Debug.ShouldStop(32768);
 BA.debugLineNum = 402;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(131072);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_search.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 403;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 404;BA.debugLine="LblBasketCount.Visible=True";
Debug.ShouldStop(524288);
act_search.mostCurrent._lblbasketcount.runMethod(true,"setVisible",act_search.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 405;BA.debugLine="LblBasketCount.Text=Cu.RowCount";
Debug.ShouldStop(1048576);
act_search.mostCurrent._lblbasketcount.runMethod(true,"setText",BA.ObjectToCharSequence(_cu.runMethod(true,"getRowCount")));
 }else {
 BA.debugLineNum = 407;BA.debugLine="LblBasketCount.Visible=False";
Debug.ShouldStop(4194304);
act_search.mostCurrent._lblbasketcount.runMethod(true,"setVisible",act_search.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 409;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(16777216);
act_search.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshtedadkalaonlistkala() throws Exception{
try {
		Debug.PushSubsStack("RefreshTedadKalaOnListKala (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,494);
if (RapidSub.canDelegate("refreshtedadkalaonlistkala")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","refreshtedadkalaonlistkala");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _j = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
int _i = 0;
 BA.debugLineNum = 494;BA.debugLine="Sub RefreshTedadKalaOnListKala";
Debug.ShouldStop(8192);
 BA.debugLineNum = 496;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(32768);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_search.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_search.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 497;BA.debugLine="If Cu.RowCount=0 Then Return";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 498;BA.debugLine="For j=0 To ListKalaTxt.Size-1";
Debug.ShouldStop(131072);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._listkalatxt.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step3 > 0 && _j <= limit3) || (step3 < 0 && _j >= limit3) ;_j = ((int)(0 + _j + step3))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 499;BA.debugLine="Dim Item=ListKalaTxt.Get(j) As AdapterListKala";
Debug.ShouldStop(262144);
_item = (act_search.mostCurrent._listkalatxt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 500;BA.debugLine="For i=0 To Cu.RowCount - 1";
Debug.ShouldStop(524288);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 501;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(1048576);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 502;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),_item.getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 504;BA.debugLine="If Cu.GetString(\"FldTedadDarSabadJoz\") > 0 The";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz")))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 505;BA.debugLine="Item.TedadDarSabadJoz = Cu.GetString(\"FldTeda";
Debug.ShouldStop(16777216);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))));
 }else {
 BA.debugLineNum = 507;BA.debugLine="Item.TedadDarSabadJoz = 0";
Debug.ShouldStop(67108864);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 BA.debugLineNum = 510;BA.debugLine="If Cu.GetString(\"FldTedadDarSabadKol\") > 0 The";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol")))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 511;BA.debugLine="Item.TedadDarSabadKol = Cu.GetString(\"FldTeda";
Debug.ShouldStop(1073741824);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))));
 }else {
 BA.debugLineNum = 513;BA.debugLine="Item.TedadDarSabadKol = 0";
Debug.ShouldStop(1);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 BA.debugLineNum = 516;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 517;BA.debugLine="If Cu.GetString(\"FldEshantion\") > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion")))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 518;BA.debugLine="Item.FldEshantion = Cu.GetString(\"FldEshanti";
Debug.ShouldStop(32);
_item.setField ("FldEshantion" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion"))));
 }else {
 BA.debugLineNum = 520;BA.debugLine="Item.FldEshantion = 0";
Debug.ShouldStop(128);
_item.setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e25) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_search.processBA, e25.toString()); BA.debugLineNum = 523;BA.debugLine="Item.FldEshantion = 0";
Debug.ShouldStop(1024);
_item.setField ("FldEshantion" /*RemoteObject*/ ,BA.NumberToString(0));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 529;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _search(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("search (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,803);
if (RapidSub.canDelegate("search")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","search", _checked);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _codegroohkala = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _d = null;
RemoteObject _txt = RemoteObject.createImmutable("");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 803;BA.debugLine="Private Sub search(Checked As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 805;BA.debugLine="Log(Checked)";
Debug.ShouldStop(16);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579495170",BA.ObjectToString(_checked),0);
 BA.debugLineNum = 806;BA.debugLine="Dim Str As String";
Debug.ShouldStop(32);
_str = RemoteObject.createImmutable("");Debug.locals.put("Str", _str);
 BA.debugLineNum = 807;BA.debugLine="Dim CodeGroohKala As String";
Debug.ShouldStop(64);
_codegroohkala = RemoteObject.createImmutable("");Debug.locals.put("CodeGroohKala", _codegroohkala);
 BA.debugLineNum = 808;BA.debugLine="If NiceSpinner1.SelectedIndex > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",act_search.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 809;BA.debugLine="Dim Item = ListGroohKala.Get(NiceSpinner1.Select";
Debug.ShouldStop(256);
_item = (act_search.mostCurrent._listgroohkala.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_search.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 810;BA.debugLine="CodeGroohKala = Item.FldC_Gorooh";
Debug.ShouldStop(512);
_codegroohkala = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("CodeGroohKala", _codegroohkala);
 }else {
 BA.debugLineNum = 812;BA.debugLine="Dim lst As List=OriginalListGoroohKala";
Debug.ShouldStop(2048);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_search.mostCurrent._originallistgoroohkala;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 813;BA.debugLine="Dim I As Int = NiceSpinner.SelectedIndex";
Debug.ShouldStop(4096);
_i = act_search.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex");Debug.locals.put("I", _i);Debug.locals.put("I", _i);
 BA.debugLineNum = 814;BA.debugLine="If I = 0 Then I = 1";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, 0))) { 
_i = BA.numberCast(int.class, 1);Debug.locals.put("I", _i);};
 BA.debugLineNum = 815;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(I-1)";
Debug.ShouldStop(16384);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 816;BA.debugLine="CodeGroohKala = Item.FldC_Gorooh' & Item.FldC_S_";
Debug.ShouldStop(32768);
_codegroohkala = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("CodeGroohKala", _codegroohkala);
 };
 BA.debugLineNum = 819;BA.debugLine="Str =  \"  fldCodeGroup Like '\"& CodeGroohKala &\"";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(RemoteObject.createImmutable("  fldCodeGroup Like '"),_codegroohkala,RemoteObject.createImmutable("%'"));Debug.locals.put("Str", _str);
 BA.debugLineNum = 846;BA.debugLine="Log(Str)";
Debug.ShouldStop(8192);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579495211",_str,0);
 BA.debugLineNum = 847;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swgift.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 };
 BA.debugLineNum = 850;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 851;BA.debugLine="Str= Str & \" and fldFeeBadAzTakhfif <> '0.0000'\"";
Debug.ShouldStop(262144);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("Str", _str);
 };
 BA.debugLineNum = 853;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 854;BA.debugLine="Str= Str & \" and SumMande > '0'\"";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("Str", _str);
 };
 BA.debugLineNum = 856;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",act_search.mostCurrent._swpic.runMethod(true,"getChecked"),act_search.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 857;BA.debugLine="Str= Str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(16777216);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("Str", _str);
 };
 BA.debugLineNum = 859;BA.debugLine="If TxtSearch.Text.Length>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",act_search.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 860;BA.debugLine="If IsNumber(TxtSearch.Text) Then";
Debug.ShouldStop(134217728);
if (act_search.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(act_search.mostCurrent._txtsearch.runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 862;BA.debugLine="Str = Str & $\" and (fldCodeKala like '%${TxtSea";
Debug.ShouldStop(536870912);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldCodeKala like '%"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_search.mostCurrent._txtsearch.runMethod(true,"getText")))),RemoteObject.createImmutable("%') "))));Debug.locals.put("Str", _str);
 }else {
 BA.debugLineNum = 864;BA.debugLine="Dim d() As String=Regex.Split(\" \",TxtSearch.Tex";
Debug.ShouldStop(-2147483648);
_d = act_search.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(act_search.mostCurrent._txtsearch.runMethod(true,"getText")));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 865;BA.debugLine="Dim txt As String=\"\"";
Debug.ShouldStop(1);
_txt = BA.ObjectToString("");Debug.locals.put("txt", _txt);Debug.locals.put("txt", _txt);
 BA.debugLineNum = 866;BA.debugLine="For i=0 To d.Length-1";
Debug.ShouldStop(2);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {_d.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step33 > 0 && _i.<Integer>get().intValue() <= limit33) || (step33 < 0 && _i.<Integer>get().intValue() >= limit33) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step33))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 867;BA.debugLine="txt = txt &  $\" and (fldNameKala Like '%${d(i)";
Debug.ShouldStop(4);
_txt = RemoteObject.concat(_txt,(RemoteObject.concat(RemoteObject.createImmutable(" and (fldNameKala Like '%"),act_search.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_d.getArrayElement(true,_i)))),RemoteObject.createImmutable("%') "))));Debug.locals.put("txt", _txt);
 }
}Debug.locals.put("I", _i);
;
 BA.debugLineNum = 869;BA.debugLine="Log(txt)";
Debug.ShouldStop(16);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579495234",_txt,0);
 BA.debugLineNum = 870;BA.debugLine="Str= Str & txt";
Debug.ShouldStop(32);
_str = RemoteObject.concat(_str,_txt);Debug.locals.put("Str", _str);
 };
 };
 BA.debugLineNum = 876;BA.debugLine="If Str.Length>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_str.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 880;BA.debugLine="Log(Str)";
Debug.ShouldStop(32768);
act_search.mostCurrent.__c.runVoidMethod ("LogImpl","579495245",_str,0);
 BA.debugLineNum = 881;BA.debugLine="LoadListKala(\"Select * From TblKala Where \" & St";
Debug.ShouldStop(65536);
_loadlistkala(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblKala Where "),_str,RemoteObject.createImmutable(" "),act_search.mostCurrent._str_sort));
 }else {
 BA.debugLineNum = 883;BA.debugLine="LoadListKala(\"Select * From TblKala \" & Str_sort";
Debug.ShouldStop(262144);
_loadlistkala(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblKala "),act_search.mostCurrent._str_sort));
 };
 BA.debugLineNum = 885;BA.debugLine="Str = \"\"";
Debug.ShouldStop(1048576);
_str = BA.ObjectToString("");Debug.locals.put("Str", _str);
 BA.debugLineNum = 887;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("SwGift_CheckedChange (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1055);
if (RapidSub.canDelegate("swgift_checkedchange")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","swgift_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1055;BA.debugLine="Sub SwGift_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1057;BA.debugLine="LoadKala";
Debug.ShouldStop(1);
_loadkala();
 BA.debugLineNum = 1058;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("SwMojoodi_CheckedChange (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1065);
if (RapidSub.canDelegate("swmojoodi_checkedchange")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","swmojoodi_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1065;BA.debugLine="Sub SwMojoodi_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 1067;BA.debugLine="LoadKala";
Debug.ShouldStop(1024);
_loadkala();
 BA.debugLineNum = 1068;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("SwPic_CheckedChange (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1070);
if (RapidSub.canDelegate("swpic_checkedchange")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","swpic_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1070;BA.debugLine="Sub SwPic_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1072;BA.debugLine="LoadKala";
Debug.ShouldStop(32768);
_loadkala();
 BA.debugLineNum = 1073;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("SwTakhfif_CheckedChange (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1060);
if (RapidSub.canDelegate("swtakhfif_checkedchange")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","swtakhfif_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1060;BA.debugLine="Sub SwTakhfif_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 1062;BA.debugLine="LoadKala";
Debug.ShouldStop(32);
_loadkala();
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
public static RemoteObject  _txtsearch_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtSearch_TextChanged (act_search) ","act_search",45,act_search.mostCurrent.activityBA,act_search.mostCurrent,1015);
if (RapidSub.canDelegate("txtsearch_textchanged")) { return ir.parsikhesab.pakhsh.act_search.remoteMe.runUserSub(false, "act_search","txtsearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1015;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1017;BA.debugLine="LoadKala";
Debug.ShouldStop(16777216);
_loadkala();
 BA.debugLineNum = 1018;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}