package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_reportvisitor2_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"L_ReportVisitor2\")";
Debug.ShouldStop(16777216);
act_reportvisitor2.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_ReportVisitor2")),act_reportvisitor2.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="LstReport.Initialize";
Debug.ShouldStop(33554432);
act_reportvisitor2.mostCurrent._lstreport.runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,53);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,49);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","activity_resume");}
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Application_Error (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,170);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 170;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(512);
 BA.debugLineNum = 172;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return act_reportvisitor2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaz_click() throws Exception{
try {
		Debug.PushSubsStack("BtnAz_Click (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,96);
if (RapidSub.canDelegate("btnaz_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","btnaz_click");}
RemoteObject _p = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 96;BA.debugLine="Sub BtnAz_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim p As PersianMaterialDatePicker";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 98;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
Debug.ShouldStop(2);
_p.runVoidMethod ("Initialize",act_reportvisitor2.mostCurrent.activityBA,(Object)(BA.ObjectToString("p")),(Object)(_p.runMethod(true,"getPersianYear")),(Object)(_p.runMethod(true,"getPersianMonth")),(Object)(_p.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 99;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(4);
_p.runMethod(true,"setAccentColor",act_reportvisitor2.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 100;BA.debugLine="p.OkText = \"تایید\"";
Debug.ShouldStop(8);
_p.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 101;BA.debugLine="p.CancelText = \"لغو\"";
Debug.ShouldStop(16);
_p.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 102;BA.debugLine="p.Title = \"از تاریخ\"";
Debug.ShouldStop(32);
_p.runVoidMethod ("setTitle",BA.ObjectToString("از تاریخ"));
 BA.debugLineNum = 103;BA.debugLine="p.Typeface = \"iransansmonospacednum.ttf\"";
Debug.ShouldStop(64);
_p.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmonospacednum.ttf"));
 BA.debugLineNum = 104;BA.debugLine="p.Show(\"p\")";
Debug.ShouldStop(128);
_p.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p")));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnreport_click() throws Exception{
try {
		Debug.PushSubsStack("BtnReport_Click (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,57);
if (RapidSub.canDelegate("btnreport_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","btnreport_click");}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 57;BA.debugLine="Sub BtnReport_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(B";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",act_reportvisitor2.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(BA.ObjectToString(act_reportvisitor2.mostCurrent._btnaz.runMethod(false,"getTag")))),BA.numberCast(long.class, 8)) && RemoteObject.solveBoolean("=",act_reportvisitor2.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvv1",(Object)(BA.ObjectToString(act_reportvisitor2.mostCurrent._btnta.runMethod(false,"getTag")))),BA.numberCast(long.class, 8))) { 
 BA.debugLineNum = 59;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .";
Debug.ShouldStop(67108864);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_reportvisitor2.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال دریافت اطلاعات . . .")),(Object)(act_reportvisitor2.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 60;BA.debugLine="Dim M As Map";
Debug.ShouldStop(134217728);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("M", _m);
 BA.debugLineNum = 61;BA.debugLine="M.Initialize";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="M.Put(\"Imei\" , MCode.DeviceId)";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Imei"))),(Object)((act_reportvisitor2.mostCurrent._mcode._deviceid /*RemoteObject*/ )));
 BA.debugLineNum = 63;BA.debugLine="M.Put(\"CodeVisitor\",MCode.C_Visitor)";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CodeVisitor"))),(Object)((act_reportvisitor2.mostCurrent._mcode._c_visitor /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="M.Put(\"DateAz\",MCode.ConvertNumbersPersian2Engli";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DateAz"))),(Object)((act_reportvisitor2.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_reportvisitor2.mostCurrent.activityBA,(Object)(act_reportvisitor2.mostCurrent._dateaz)))));
 BA.debugLineNum = 65;BA.debugLine="M.Put(\"DateTa\",MCode.ConvertNumbersPersian2Engli";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DateTa"))),(Object)((act_reportvisitor2.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_reportvisitor2.mostCurrent.activityBA,(Object)(act_reportvisitor2.mostCurrent._dateta)))));
 BA.debugLineNum = 67;BA.debugLine="ProgressDialogShow2(\"لطفا صبر کنید . . .\",False)";
Debug.ShouldStop(4);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_reportvisitor2.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("لطفا صبر کنید . . .")),(Object)(act_reportvisitor2.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 68;BA.debugLine="CallSubDelayed3(Service_Server,\"GetReportVisitor";
Debug.ShouldStop(8);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",act_reportvisitor2.processBA,(Object)((act_reportvisitor2.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("GetReportVisitor")),(Object)((act_reportvisitor2.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_reportvisitor2.mostCurrent.activityBA,(Object)(act_reportvisitor2.mostCurrent._dateaz)))),(Object)((act_reportvisitor2.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_reportvisitor2.mostCurrent.activityBA,(Object)(act_reportvisitor2.mostCurrent._dateta)))));
 }else {
 BA.debugLineNum = 70;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
Debug.ShouldStop(32);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید")),(Object)(act_reportvisitor2.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnta_click() throws Exception{
try {
		Debug.PushSubsStack("BtnTa_Click (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,122);
if (RapidSub.canDelegate("btnta_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","btnta_click");}
RemoteObject _p1 = RemoteObject.declareNull("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");
 BA.debugLineNum = 122;BA.debugLine="Sub BtnTa_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
Debug.ShouldStop(67108864);
_p1 = RemoteObject.createNew ("com.porya.datetimepicker.PersianMaterialDatePickerWrapper");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 124;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
Debug.ShouldStop(134217728);
_p1.runVoidMethod ("Initialize",act_reportvisitor2.mostCurrent.activityBA,(Object)(BA.ObjectToString("p1")),(Object)(_p1.runMethod(true,"getPersianYear")),(Object)(_p1.runMethod(true,"getPersianMonth")),(Object)(_p1.runMethod(true,"getPersianDay")));
 BA.debugLineNum = 125;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
Debug.ShouldStop(268435456);
_p1.runMethod(true,"setAccentColor",act_reportvisitor2.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 126;BA.debugLine="p1.OkText = \"تایید\"";
Debug.ShouldStop(536870912);
_p1.runVoidMethod ("setOkText",BA.ObjectToString("تایید"));
 BA.debugLineNum = 127;BA.debugLine="p1.CancelText = \"لغو\"";
Debug.ShouldStop(1073741824);
_p1.runVoidMethod ("setCancelText",BA.ObjectToString("لغو"));
 BA.debugLineNum = 128;BA.debugLine="p1.Title = \"تا تاریخ\"";
Debug.ShouldStop(-2147483648);
_p1.runVoidMethod ("setTitle",BA.ObjectToString("تا تاریخ"));
 BA.debugLineNum = 129;BA.debugLine="p1.Typeface = \"iransansmonospacednum.ttf\"";
Debug.ShouldStop(1);
_p1.runVoidMethod ("setTypeface",BA.ObjectToString("iransansmonospacednum.ttf"));
 BA.debugLineNum = 130;BA.debugLine="p1.Show(\"p1\")";
Debug.ShouldStop(2);
_p1.runVoidMethod ("Show",(Object)(RemoteObject.createImmutable("p1")));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creategrid() throws Exception{
try {
		Debug.PushSubsStack("CreateGrid (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,29);
if (RapidSub.canDelegate("creategrid")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","creategrid");}
RemoteObject _lst_colnametitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 29;BA.debugLine="Sub CreateGrid";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Table1.Initialize(Me, \"Table1\",6)";
Debug.ShouldStop(536870912);
act_reportvisitor2.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_initialize" /*RemoteObject*/ ,act_reportvisitor2.mostCurrent.activityBA,(Object)(act_reportvisitor2.getObject()),(Object)(BA.ObjectToString("Table1")),(Object)(BA.numberCast(int.class, 6)));
 BA.debugLineNum = 31;BA.debugLine="Table1.AddToActivity(PnlGrid, 0,0,100%x,PnlGrid.H";
Debug.ShouldStop(1073741824);
act_reportvisitor2.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addtoactivity" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), act_reportvisitor2.mostCurrent._pnlgrid.getObject()),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_reportvisitor2.mostCurrent.activityBA)),(Object)(act_reportvisitor2.mostCurrent._pnlgrid.runMethod(true,"getHeight")));
 BA.debugLineNum = 33;BA.debugLine="Dim Lst_ColNameTitle As List";
Debug.ShouldStop(1);
_lst_colnametitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
 BA.debugLineNum = 34;BA.debugLine="Lst_ColNameTitle.Initialize";
Debug.ShouldStop(2);
_lst_colnametitle.runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"مبلغ\",\"ت";
Debug.ShouldStop(4);
_lst_colnametitle.runVoidMethod ("AddAll",(Object)(act_reportvisitor2.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("مبلغ"),BA.ObjectToString("ت.فاکتور"),BA.ObjectToString("ت.کل"),BA.ObjectToString("ت.کارتن"),BA.ObjectToString("ت.جزء"),RemoteObject.createImmutable("نام کالا")})))));
 BA.debugLineNum = 38;BA.debugLine="Table1.LoadSListVisitor(LstReport,Lst_ColNameTitl";
Debug.ShouldStop(32);
act_reportvisitor2.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_loadslistvisitor" /*RemoteObject*/ ,(Object)(act_reportvisitor2.mostCurrent._lstreport),(Object)(_lst_colnametitle),(Object)(BA.numberCast(int.class, 6)));
 BA.debugLineNum = 39;BA.debugLine="Table1.SetColumnsWidths(Array As Int(25%x, 14%x,1";
Debug.ShouldStop(64);
act_reportvisitor2.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("int",new int[] {6},new Object[] {act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),act_reportvisitor2.mostCurrent.activityBA),act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportvisitor2.mostCurrent.activityBA),act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportvisitor2.mostCurrent.activityBA),act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportvisitor2.mostCurrent.activityBA),act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportvisitor2.mostCurrent.activityBA),act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33)),act_reportvisitor2.mostCurrent.activityBA)})));
 BA.debugLineNum = 40;BA.debugLine="Table1.SetHeader(Array As String(\"مبلغ\",\"ت.فاکتور";
Debug.ShouldStop(128);
act_reportvisitor2.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setheader" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("مبلغ"),BA.ObjectToString("ت.فاکتور"),BA.ObjectToString("ت.کل"),BA.ObjectToString("ت.کارتن"),BA.ObjectToString("ت.جزء"),RemoteObject.createImmutable("نام کالا")})),(Object)(RemoteObject.createNewArray("int",new int[] {6},new Object[] {act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),act_reportvisitor2.mostCurrent.activityBA),act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportvisitor2.mostCurrent.activityBA),act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportvisitor2.mostCurrent.activityBA),act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportvisitor2.mostCurrent.activityBA),act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),act_reportvisitor2.mostCurrent.activityBA),act_reportvisitor2.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33)),act_reportvisitor2.mostCurrent.activityBA)})));
 BA.debugLineNum = 42;BA.debugLine="LblTedadFaktor.Text = TitleReport(0)";
Debug.ShouldStop(512);
act_reportvisitor2.mostCurrent._lbltedadfaktor.runMethod(true,"setText",BA.ObjectToCharSequence(act_reportvisitor2._titlereport.getArrayElement(true,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 43;BA.debugLine="LblSumFaktor.Text = NumberFormat(TitleReport(1),1";
Debug.ShouldStop(1024);
act_reportvisitor2.mostCurrent._lblsumfaktor.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_reportvisitor2._titlereport.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" ریال "))));
 BA.debugLineNum = 44;BA.debugLine="LblPoorsant.Text = NumberFormat(TitleReport(2),1,";
Debug.ShouldStop(2048);
act_reportvisitor2.mostCurrent._lblpoorsant.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, act_reportvisitor2._titlereport.getArrayElement(true,BA.numberCast(int.class, 2)))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" ریال "))));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlist(RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("CreateList (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,74);
if (RapidSub.canDelegate("createlist")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","createlist", _lst);}
RemoteObject _coljroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterreportvisitor");
Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 74;BA.debugLine="Sub CreateList(Lst As List)";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="LstReport.Clear";
Debug.ShouldStop(1024);
act_reportvisitor2.mostCurrent._lstreport.runVoidMethod ("Clear");
 BA.debugLineNum = 76;BA.debugLine="TitleReport(0) = 0";
Debug.ShouldStop(2048);
act_reportvisitor2._titlereport.setArrayElement (BA.numberCast(long.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 77;BA.debugLine="TitleReport(1) =0";
Debug.ShouldStop(4096);
act_reportvisitor2._titlereport.setArrayElement (BA.numberCast(long.class, 0),BA.numberCast(int.class, 1));
 BA.debugLineNum = 78;BA.debugLine="For Each coljRoot As Map In Lst";
Debug.ShouldStop(8192);
_coljroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group4 = _lst;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_coljroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group4.runMethod(false,"Get",index4));Debug.locals.put("coljRoot", _coljroot);
Debug.locals.put("coljRoot", _coljroot);
 BA.debugLineNum = 79;BA.debugLine="Dim Item As AdapterReportVisitor";
Debug.ShouldStop(16384);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterreportvisitor");Debug.locals.put("Item", _item);
 BA.debugLineNum = 80;BA.debugLine="Item.fldSharhKala = coljRoot.Get(\"fldSharhKala\")";
Debug.ShouldStop(32768);
_item.setField ("fldSharhKala" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldSharhKala"))))));
 BA.debugLineNum = 81;BA.debugLine="Item.fldTedadJoz = coljRoot.Get(\"fldTedadJoz\")";
Debug.ShouldStop(65536);
_item.setField ("fldTedadJoz" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadJoz"))))));
 BA.debugLineNum = 82;BA.debugLine="Item.fldTedadCarton = coljRoot.Get(\"fldTedadCart";
Debug.ShouldStop(131072);
_item.setField ("fldTedadCarton" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadCarton"))))));
 BA.debugLineNum = 83;BA.debugLine="Item.fldTedadKol = coljRoot.Get(\"fldTedadKol\")";
Debug.ShouldStop(262144);
_item.setField ("fldTedadKol" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTedadKol"))))));
 BA.debugLineNum = 84;BA.debugLine="Item.fldCount = coljRoot.Get(\"fldCount\")";
Debug.ShouldStop(524288);
_item.setField ("fldCount" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCount"))))));
 BA.debugLineNum = 85;BA.debugLine="Item.fldFeeJoz = coljRoot.Get(\"fldFeeJoz\")";
Debug.ShouldStop(1048576);
_item.setField ("fldFeeJoz" /*RemoteObject*/ ,BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeJoz"))))));
 BA.debugLineNum = 87;BA.debugLine="LstReport.Add(Item)";
Debug.ShouldStop(4194304);
act_reportvisitor2.mostCurrent._lstreport.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 89;BA.debugLine="TitleReport(0) = TitleReport(0) + coljRoot.Get(\"";
Debug.ShouldStop(16777216);
act_reportvisitor2._titlereport.setArrayElement (BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {act_reportvisitor2._titlereport.getArrayElement(true,BA.numberCast(int.class, 0)),BA.numberCast(double.class, _coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldCount")))))}, "+",1, 0)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 90;BA.debugLine="TitleReport(1) = TitleReport(1) + coljRoot.Get(\"";
Debug.ShouldStop(33554432);
act_reportvisitor2._titlereport.setArrayElement (BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {act_reportvisitor2._titlereport.getArrayElement(true,BA.numberCast(int.class, 1)),BA.numberCast(double.class, _coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldFeeJoz")))))}, "+",1, 0)),BA.numberCast(int.class, 1));
 }
}Debug.locals.put("coljRoot", _coljroot);
;
 BA.debugLineNum = 93;BA.debugLine="CreateGrid";
Debug.ShouldStop(268435456);
_creategrid();
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Dim Table1 As Table";
act_reportvisitor2.mostCurrent._table1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table");
 //BA.debugLineNum = 12;BA.debugLine="Private PnlGrid As Panel";
act_reportvisitor2.mostCurrent._pnlgrid = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private LblTedadFaktor As Label";
act_reportvisitor2.mostCurrent._lbltedadfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private LblSumFaktor As Label";
act_reportvisitor2.mostCurrent._lblsumfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private LblPoorsant As Label";
act_reportvisitor2.mostCurrent._lblpoorsant = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private BtnAz As Button";
act_reportvisitor2.mostCurrent._btnaz = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnTa As Button";
act_reportvisitor2.mostCurrent._btnta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim DateAz,DateTa As String";
act_reportvisitor2.mostCurrent._dateaz = RemoteObject.createImmutable("");
act_reportvisitor2.mostCurrent._dateta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim LstReport As List";
act_reportvisitor2.mostCurrent._lstreport = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 20;BA.debugLine="Dim TitleReport(3) As Long";
act_reportvisitor2._titlereport = RemoteObject.createNewArray ("long", new int[] {3}, new Object[]{});
 //BA.debugLineNum = 21;BA.debugLine="Private Img_Chart As ImageView";
act_reportvisitor2.mostCurrent._img_chart = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _img_chart_click() throws Exception{
try {
		Debug.PushSubsStack("Img_Chart_Click (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,166);
if (RapidSub.canDelegate("img_chart_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","img_chart_click");}
 BA.debugLineNum = 166;BA.debugLine="Sub Img_Chart_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Img_Sort_Click (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,153);
if (RapidSub.canDelegate("img_sort_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","img_sort_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 153;BA.debugLine="Sub Img_Sort_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="Dim Lst As List = Array As String(\"مبلغ کم به زیا";
Debug.ShouldStop(33554432);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_reportvisitor2.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("مبلغ کم به زیاد"),RemoteObject.createImmutable("مبلغ زیاد به کم")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 155;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
Debug.ShouldStop(67108864);
_res = act_reportvisitor2.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("مرتب سازی براساس:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_reportvisitor2.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 156;BA.debugLine="Select Case res";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 158;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",False)";
Debug.ShouldStop(536870912);
act_reportvisitor2.mostCurrent._lstreport.runVoidMethod ("SortType",(Object)(BA.ObjectToString("fldFeeJoz")),(Object)(act_reportvisitor2.mostCurrent.__c.getField(true,"False")));
 break; }
case 1: {
 BA.debugLineNum = 160;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",True)";
Debug.ShouldStop(-2147483648);
act_reportvisitor2.mostCurrent._lstreport.runVoidMethod ("SortType",(Object)(BA.ObjectToString("fldFeeJoz")),(Object)(act_reportvisitor2.mostCurrent.__c.getField(true,"True")));
 break; }
}
;
 BA.debugLineNum = 162;BA.debugLine="ProgressDialogShow(\"لطفا چند لحظه صبر کنید\")";
Debug.ShouldStop(2);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",act_reportvisitor2.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("لطفا چند لحظه صبر کنید"))));
 BA.debugLineNum = 163;BA.debugLine="CreateGrid";
Debug.ShouldStop(4);
_creategrid();
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
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,149);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","lblback_click");}
 BA.debugLineNum = 149;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
act_reportvisitor2.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _p_oncancel() throws Exception{
try {
		Debug.PushSubsStack("p_onCancel (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,116);
if (RapidSub.canDelegate("p_oncancel")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","p_oncancel");}
 BA.debugLineNum = 116;BA.debugLine="Sub p_onCancel";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(1048576);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("LogImpl","565601537",RemoteObject.createImmutable("cancel"),0);
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("p_onDateSet (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,106);
if (RapidSub.canDelegate("p_ondateset")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","p_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 106;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(1024);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("LogImpl","565536001",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 108;BA.debugLine="BtnAz.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(2048);
act_reportvisitor2.mostCurrent._btnaz.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 109;BA.debugLine="BtnAz.Tag =year&NumberFormat(day,2,0)&NumberForma";
Debug.ShouldStop(4096);
act_reportvisitor2.mostCurrent._btnaz.runMethod(false,"setTag",(RemoteObject.concat(_year,act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 113;BA.debugLine="DateAz=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(65536);
act_reportvisitor2.mostCurrent._dateaz = RemoteObject.concat(_year,act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 114;BA.debugLine="LogColor(DateAz,Colors.Magenta)";
Debug.ShouldStop(131072);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("LogImpl","565536008",act_reportvisitor2.mostCurrent._dateaz,act_reportvisitor2.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("p_onDismiss (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,119);
if (RapidSub.canDelegate("p_ondismiss")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","p_ondismiss");}
 BA.debugLineNum = 119;BA.debugLine="Sub p_onDismiss";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(8388608);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("LogImpl","565667073",RemoteObject.createImmutable("dismiss"),0);
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
public static RemoteObject  _p1_oncancel() throws Exception{
try {
		Debug.PushSubsStack("p1_onCancel (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,142);
if (RapidSub.canDelegate("p1_oncancel")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","p1_oncancel");}
 BA.debugLineNum = 142;BA.debugLine="Sub p1_onCancel";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Log(\"cancel\")";
Debug.ShouldStop(16384);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("LogImpl","565863681",RemoteObject.createImmutable("cancel"),0);
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
public static RemoteObject  _p1_ondateset(RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("p1_onDateSet (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,132);
if (RapidSub.canDelegate("p1_ondateset")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","p1_ondateset", _year, _month, _day);}
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 132;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
Debug.ShouldStop(16);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("LogImpl","565798145",RemoteObject.concat(_year,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_day),0);
 BA.debugLineNum = 134;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
Debug.ShouldStop(32);
act_reportvisitor2.mostCurrent._btnta.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("/"),act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 135;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
Debug.ShouldStop(64);
act_reportvisitor2.mostCurrent._btnta.runMethod(false,"setTag",(RemoteObject.concat(_year,act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 139;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
Debug.ShouldStop(1024);
act_reportvisitor2.mostCurrent._dateta = RemoteObject.concat(_year,act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))),act_reportvisitor2.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 140;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
Debug.ShouldStop(2048);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("LogImpl","565798152",act_reportvisitor2.mostCurrent._dateta,act_reportvisitor2.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p1_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("p1_onDismiss (act_reportvisitor2) ","act_reportvisitor2",35,act_reportvisitor2.mostCurrent.activityBA,act_reportvisitor2.mostCurrent,145);
if (RapidSub.canDelegate("p1_ondismiss")) { return ir.parsikhesab.pakhsh.act_reportvisitor2.remoteMe.runUserSub(false, "act_reportvisitor2","p1_ondismiss");}
 BA.debugLineNum = 145;BA.debugLine="Sub p1_onDismiss";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="Log(\"dismiss\")";
Debug.ShouldStop(131072);
act_reportvisitor2.mostCurrent.__c.runVoidMethod ("LogImpl","565929217",RemoteObject.createImmutable("dismiss"),0);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}