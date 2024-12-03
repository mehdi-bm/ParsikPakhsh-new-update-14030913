package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_printmali_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,16);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 16;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Activity.LoadLayout(\"L_PrintPic\")";
Debug.ShouldStop(65536);
act_printmali.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_PrintPic")),act_printmali.mostCurrent.activityBA);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Pause (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,26);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Resume (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,21);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","activity_resume");}
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="clv1.Clear";
Debug.ShouldStop(2097152);
act_printmali.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 23;BA.debugLine="CreateReport";
Debug.ShouldStop(4194304);
_createreport();
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("btn_Back_Click (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,165);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","btn_back_click");}
 BA.debugLineNum = 165;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
act_printmali.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createreport() throws Exception{
try {
		Debug.PushSubsStack("CreateReport (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,125);
if (RapidSub.canDelegate("createreport")) { return ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","createreport");}
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _pd = RemoteObject.declareNull("anywheresoftware.b4a.student.PersianDate");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _namemoshtari = RemoteObject.createImmutable("");
RemoteObject _address = RemoteObject.createImmutable("");
RemoteObject _tell = RemoteObject.createImmutable("");
RemoteObject _rec1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_printmali");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
 BA.debugLineNum = 125;BA.debugLine="Sub CreateReport";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(536870912);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_printmali.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_printmali.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblAshkhas Where fldCodetafzili = '"),act_printmali.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu1", _cu1);Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 127;BA.debugLine="Cu1.Position=0";
Debug.ShouldStop(1073741824);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 128;BA.debugLine="Dim pd As PersianDate";
Debug.ShouldStop(-2147483648);
_pd = RemoteObject.createNew ("anywheresoftware.b4a.student.PersianDate");Debug.locals.put("pd", _pd);
 BA.debugLineNum = 129;BA.debugLine="Dim Date As String= pd.getDate(0,0,0,\"/\")";
Debug.ShouldStop(1);
_date = _pd.runMethod(true,"getDate",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 130;BA.debugLine="Dim nameMoshtari As String = Cu1.GetString(\"fldSh";
Debug.ShouldStop(2);
_namemoshtari = _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharheTafzili")));Debug.locals.put("nameMoshtari", _namemoshtari);Debug.locals.put("nameMoshtari", _namemoshtari);
 BA.debugLineNum = 131;BA.debugLine="Dim Address As String = Cu1.GetString(\"fldAdress\"";
Debug.ShouldStop(4);
_address = _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldAdress")));Debug.locals.put("Address", _address);Debug.locals.put("Address", _address);
 BA.debugLineNum = 132;BA.debugLine="Dim Tell As String = myCode.Is_Null(Cu1.GetString";
Debug.ShouldStop(8);
_tell = RemoteObject.concat(act_printmali.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_printmali.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTell"))))),RemoteObject.createImmutable(" | "),act_printmali.mostCurrent._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,act_printmali.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMobile"))))));Debug.locals.put("Tell", _tell);Debug.locals.put("Tell", _tell);
 BA.debugLineNum = 136;BA.debugLine="Dim rec1 As cls_PrintMali";
Debug.ShouldStop(128);
_rec1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_printmali");Debug.locals.put("rec1", _rec1);
 BA.debugLineNum = 137;BA.debugLine="rec1.Initialize(Date,nameMoshtari,Address,Tell,P";
Debug.ShouldStop(256);
_rec1.runClassMethod (ir.parsikhesab.pakhsh.cls_printmali.class, "_initialize" /*RemoteObject*/ ,act_printmali.mostCurrent.activityBA,(Object)(_date),(Object)(_namemoshtari),(Object)(_address),(Object)(_tell),(Object)(act_printmali._pardakhti),(Object)(act_printmali._cu));
 BA.debugLineNum = 138;BA.debugLine="clv1.Add(rec1.Panel,0)";
Debug.ShouldStop(512);
act_printmali.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rec1.runClassMethod (ir.parsikhesab.pakhsh.cls_printmali.class, "_getpanel" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 142;BA.debugLine="Dim filename As String=MCode.ShomareSabt & \".jpg\"";
Debug.ShouldStop(8192);
_filename = RemoteObject.concat(act_printmali.mostCurrent._mcode._shomaresabt /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 143;BA.debugLine="Dim bmp As Bitmap = clv1.sv.ScrollViewInnerPanel.";
Debug.ShouldStop(16384);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), act_printmali.mostCurrent._clv1.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(false,"Snapshot").getObject());Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 144;BA.debugLine="Dim B As B4XBitmap = bmp.Resize(bmp.Width/2,bmp.H";
Debug.ShouldStop(32768);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _bmp.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(act_printmali.mostCurrent.__c.getField(true,"True"))).getObject());Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 146;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(131072);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 147;BA.debugLine="out = File.OpenOutput(File.DirDefaultExternal, fi";
Debug.ShouldStop(262144);
_out = act_printmali.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(act_printmali.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename),(Object)(act_printmali.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 148;BA.debugLine="b.WriteToStream(out, 90, \"JPEG\")";
Debug.ShouldStop(524288);
_b.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 90)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 149;BA.debugLine="out.Close";
Debug.ShouldStop(1048576);
_out.runVoidMethod ("Close");
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
public static RemoteObject  _getba() throws Exception{
try {
		Debug.PushSubsStack("GetBA (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,118);
if (RapidSub.canDelegate("getba")) { return ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","getba");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cls = RemoteObject.createImmutable("");
 BA.debugLineNum = 118;BA.debugLine="Sub GetBA As Object";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(4194304);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 120;BA.debugLine="Dim cls As String = Me";
Debug.ShouldStop(8388608);
_cls = BA.ObjectToString(act_printmali.getObject());Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 121;BA.debugLine="cls = cls.SubString(\"class \".Length)";
Debug.ShouldStop(16777216);
_cls = _cls.runMethod(true,"substring",(Object)(RemoteObject.createImmutable("class ").runMethod(true,"length")));Debug.locals.put("cls", _cls);
 BA.debugLineNum = 122;BA.debugLine="jo.InitializeStatic(cls)";
Debug.ShouldStop(33554432);
_jo.runVoidMethod ("InitializeStatic",(Object)(_cls));
 BA.debugLineNum = 123;BA.debugLine="Return jo.GetField(\"processBA\")";
Debug.ShouldStop(67108864);
if (true) return _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("processBA")));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private ion As Object";
act_printmali.mostCurrent._ion = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 13;BA.debugLine="Private clv1 As CustomListView";
act_printmali.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblprint_click() throws Exception{
try {
		Debug.PushSubsStack("LblPrint_Click (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,53);
if (RapidSub.canDelegate("lblprint_click")) { return ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","lblprint_click");}
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _ispos = RemoteObject.createImmutable(0);
 BA.debugLineNum = 53;BA.debugLine="Sub LblPrint_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Dim filename As String=MCode.ShomareSabt & \".jpg\"";
Debug.ShouldStop(2097152);
_filename = RemoteObject.concat(act_printmali.mostCurrent._mcode._shomaresabt /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 56;BA.debugLine="Dim bmp As Bitmap = clv1.sv.ScrollViewInnerPanel.";
Debug.ShouldStop(8388608);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), act_printmali.mostCurrent._clv1.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(false,"Snapshot").getObject());Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 58;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(33554432);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 59;BA.debugLine="out = File.OpenOutput(File.DirDefaultExternal, fi";
Debug.ShouldStop(67108864);
_out = act_printmali.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(act_printmali.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename),(Object)(act_printmali.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 60;BA.debugLine="bmp.WriteToStream(out, 90, \"JPEG\")";
Debug.ShouldStop(134217728);
_bmp.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 90)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 61;BA.debugLine="out.Close";
Debug.ShouldStop(268435456);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 63;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"print_sep";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",act_printmali.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(act_printmali.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("print_sepehr"))),act_printmali.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 64;BA.debugLine="File.MakeDir(File.DirDefaultExternal,\"print_sepe";
Debug.ShouldStop(-2147483648);
act_printmali.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(act_printmali.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("print_sepehr")));
 };
 BA.debugLineNum = 66;BA.debugLine="Dim filename As String=MCode.ShomareSabt & \".jpg\"";
Debug.ShouldStop(2);
_filename = RemoteObject.concat(act_printmali.mostCurrent._mcode._shomaresabt /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 67;BA.debugLine="File.Copy(File.DirDefaultExternal,filename,File.D";
Debug.ShouldStop(4);
act_printmali.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(act_printmali.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename),(Object)(act_printmali.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("print_sepehr/factor.jpg")));
 BA.debugLineNum = 69;BA.debugLine="Dim isPos As Int = myCode.getSetting(\"setting.dat";
Debug.ShouldStop(16);
_ispos = BA.numberCast(int.class, act_printmali.mostCurrent._mycode.runMethod(true,"_getsetting" /*RemoteObject*/ ,act_printmali.mostCurrent.activityBA,(Object)(BA.ObjectToString("setting.dat")),(Object)(BA.ObjectToString("isPos")),(Object)(BA.NumberToString(0))));Debug.locals.put("isPos", _ispos);Debug.locals.put("isPos", _ispos);
 BA.debugLineNum = 70;BA.debugLine="Select Case isPos";
Debug.ShouldStop(32);
switch (BA.switchObjectToInt(_ispos,BA.numberCast(int.class, 1),BA.numberCast(int.class, 0))) {
case 0: {
 BA.debugLineNum = 72;BA.debugLine="PrintPos";
Debug.ShouldStop(128);
_printpos();
 break; }
case 1: {
 BA.debugLineNum = 74;BA.debugLine="PrintBlutooth";
Debug.ShouldStop(512);
_printblutooth();
 break; }
}
;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblshare_click() throws Exception{
try {
		Debug.PushSubsStack("LblShare_Click (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,30);
if (RapidSub.canDelegate("lblshare_click")) { ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","lblshare_click"); return;}
ResumableSub_LblShare_Click rsub = new ResumableSub_LblShare_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LblShare_Click extends BA.ResumableSub {
public ResumableSub_LblShare_Click(ir.parsikhesab.pakhsh.act_printmali parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_printmali parent;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _pn = RemoteObject.declareNull("ir.cafetoseeh.PNMultipleSharing");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblShare_Click (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,30);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 31;BA.debugLine="Dim filename As String=MCode.ShomareSabt & \".jpg\"";
Debug.ShouldStop(1073741824);
_filename = RemoteObject.concat(parent.mostCurrent._mcode._shomaresabt /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 34;BA.debugLine="Dim bmp As Bitmap = clv1.sv.ScrollViewInnerPanel.";
Debug.ShouldStop(2);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent._clv1.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(false,"Snapshot").getObject());Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 35;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(4);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 36;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
Debug.ShouldStop(8);
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 37;BA.debugLine="bmp.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(16);
_bmp.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 38;BA.debugLine="out.Close";
Debug.ShouldStop(32);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 39;BA.debugLine="Sleep(200)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printmali.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printmali", "lblshare_click"),BA.numberCast(int.class, 200));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 40;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
Debug.ShouldStop(128);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename));
 BA.debugLineNum = 41;BA.debugLine="Sleep(200)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_printmali.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_printmali", "lblshare_click"),BA.numberCast(int.class, 200));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
 BA.debugLineNum = 42;BA.debugLine="Try";
Debug.ShouldStop(512);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 43;BA.debugLine="Dim pn As PNMultipleSharing";
Debug.ShouldStop(1024);
_pn = RemoteObject.createNew ("ir.cafetoseeh.PNMultipleSharing");Debug.locals.put("pn", _pn);
 BA.debugLineNum = 44;BA.debugLine="pn.ShareFileWithCaption(File.DirDefaultExternal,";
Debug.ShouldStop(2048);
_pn.runVoidMethod ("ShareFileWithCaption",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(_filename),(Object)(BA.ObjectToString("image/*")),(Object)(BA.ObjectToString("فاکتور ")),(Object)(RemoteObject.createImmutable("اشتراک گذاری")));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 47;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","552690961",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_printmali.mostCurrent.activityBA)),0);
 BA.debugLineNum = 48;BA.debugLine="ToastMessageShow(\"برنامه ای جهت اشتراک گذاری یاف";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برنامه ای جهت اشتراک گذاری یافت نشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_printmali.processBA, e0.toString());}
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
public static RemoteObject  _printblutooth() throws Exception{
try {
		Debug.PushSubsStack("PrintBlutooth (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,84);
if (RapidSub.canDelegate("printblutooth")) { return ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","printblutooth");}
 BA.debugLineNum = 84;BA.debugLine="Sub PrintBlutooth";
Debug.ShouldStop(524288);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printpos() throws Exception{
try {
		Debug.PushSubsStack("PrintPos (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,78);
if (RapidSub.canDelegate("printpos")) { return ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","printpos");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 78;BA.debugLine="Sub PrintPos";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(16384);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 80;BA.debugLine="i.Initialize(\"com.dml.sima7.sepehr.activity.Inten";
Debug.ShouldStop(32768);
_i.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("com.dml.sima7.sepehr.activity.Intent_PrintFactorActivity")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 81;BA.debugLine="StartActivityForResult(i)";
Debug.ShouldStop(65536);
_startactivityforresult(_i);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim Pardakhti As String";
act_printmali._pardakhti = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Dim cu As Cursor";
act_printmali._cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _startactivityforresult(RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("StartActivityForResult (act_printmali) ","act_printmali",26,act_printmali.mostCurrent.activityBA,act_printmali.mostCurrent,112);
if (RapidSub.canDelegate("startactivityforresult")) { return ir.parsikhesab.pakhsh.act_printmali.remoteMe.runUserSub(false, "act_printmali","startactivityforresult", _i);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("i", _i);
 BA.debugLineNum = 112;BA.debugLine="Sub StartActivityForResult(i As Intent)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Dim jo As JavaObject = GetBA";
Debug.ShouldStop(65536);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _getba());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 114;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
Debug.ShouldStop(131072);
act_printmali.mostCurrent._ion = _jo.runMethod(false,"CreateEvent",act_printmali.processBA,(Object)(BA.ObjectToString("anywheresoftware.b4a.IOnActivityResult")),(Object)(BA.ObjectToString("ion")),(Object)(act_printmali.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 115;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
Debug.ShouldStop(262144);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startActivityForResult")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {act_printmali.mostCurrent._ion,(_i.getObject())})));
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
}