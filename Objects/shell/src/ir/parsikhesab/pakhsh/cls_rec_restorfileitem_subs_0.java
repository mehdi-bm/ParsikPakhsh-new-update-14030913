package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_rec_restorfileitem_subs_0 {


public static void  _btnrestore_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnRestore_Click (cls_rec_restorfileitem) ","cls_rec_restorfileitem",77,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("btnrestore_click")) { __ref.runUserSub(false, "cls_rec_restorfileitem","btnrestore_click", __ref); return;}
ResumableSub_btnRestore_Click rsub = new ResumableSub_btnRestore_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnRestore_Click extends BA.ResumableSub {
public ResumableSub_btnRestore_Click(ir.parsikhesab.pakhsh.cls_rec_restorfileitem parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.parsikhesab.pakhsh.cls_rec_restorfileitem parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _restorefile = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnRestore_Click (cls_rec_restorfileitem) ","cls_rec_restorfileitem",77,__ref.getField(false, "ba"),__ref,45);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 46;BA.debugLine="Log(item.FileName)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","599352577",__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FileName" /*RemoteObject*/ ),0);
 BA.debugLineNum = 47;BA.debugLine="Msgbox2Async(\"\" & CRLF & \"آیا از اطلاعات فعلی فای";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟")))),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("انصراف")),(Object)(BA.ObjectToString("خیر")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 48;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cls_rec_restorfileitem", "btnrestore_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 49;BA.debugLine="Dim RestoreFile As String=item.FileName&\".db\"";
Debug.ShouldStop(65536);
_restorefile = RemoteObject.concat(__ref.getField(false,"_item" /*RemoteObject*/ ).getField(true,"FileName" /*RemoteObject*/ ),RemoteObject.createImmutable(".db"));Debug.locals.put("RestoreFile", _restorefile);Debug.locals.put("RestoreFile", _restorefile);
 BA.debugLineNum = 50;BA.debugLine="If Result=DialogResponse.POSITIVE Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 59;BA.debugLine="Else If Result=DialogResponse.NEGATIVE Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 5;
}}
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 51;BA.debugLine="MCode.CreateBK(\"\")";
Debug.ShouldStop(262144);
parent._mcode.runVoidMethod ("_createbk" /*void*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 52;BA.debugLine="File.Delete(File.DirDefaultExternal &\"/Parsik\",\"";
Debug.ShouldStop(524288);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("parsik_db.db")));
 BA.debugLineNum = 54;BA.debugLine="File.Copy(File.DirDefaultExternal &\"/Parsik/Back";
Debug.ShouldStop(2097152);
parent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(_restorefile),(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("parsik_db.db")));
 BA.debugLineNum = 55;BA.debugLine="ToastMessageShow(\"فایل پشتیبانی با موفقیت بازیاب";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فایل پشتیبانی با موفقیت بازیابی شد")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 57;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(16777216);
parent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 58;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((parent._main.getObject())));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 61;BA.debugLine="File.Delete(File.DirDefaultExternal &\"/Parsik\",\"";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("parsik_db.db")));
 BA.debugLineNum = 63;BA.debugLine="File.Copy(File.DirDefaultExternal &\"/Parsik/Back";
Debug.ShouldStop(1073741824);
parent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/Backup"))),(Object)(_restorefile),(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik"))),(Object)(RemoteObject.createImmutable("parsik_db.db")));
 BA.debugLineNum = 64;BA.debugLine="ToastMessageShow(\"فایل پشتیبانی با موفقیت بازیاب";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("فایل پشتیبانی با موفقیت بازیابی شد")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 66;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2);
parent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 67;BA.debugLine="CallSubDelayed(Act_Restore,\"btn_Back_Click\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((parent._act_restore.getObject())),(Object)(RemoteObject.createImmutable("btn_Back_Click")));
 BA.debugLineNum = 68;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((parent._main.getObject())));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnshare_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnShare_Click (cls_rec_restorfileitem) ","cls_rec_restorfileitem",77,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("btnshare_click")) { return __ref.runUserSub(false, "cls_rec_restorfileitem","btnshare_click", __ref);}
 BA.debugLineNum = 73;BA.debugLine="Private Sub btnShare_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Try";
Debug.ShouldStop(512);
try { Debug.CheckDeviceExceptions();
} 
       catch (Exception e3) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e3.toString()); BA.debugLineNum = 99;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
cls_rec_restorfileitem.__c.runVoidMethod ("LogImpl","599418138",BA.ObjectToString(cls_rec_restorfileitem.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 100;BA.debugLine="ToastMessageShow(\"برنامه ای جهت اشتراک گذاری یاف";
Debug.ShouldStop(8);
cls_rec_restorfileitem.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("برنامه ای جهت اشتراک گذاری یافت نشد")),(Object)(cls_rec_restorfileitem.__c.getField(true,"True")));
 };
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_rec_restorfileitem._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_rec_restorfileitem._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_rec_restorfileitem._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_rec_restorfileitem._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private base As Object";
cls_rec_restorfileitem._base = RemoteObject.createNew ("Object");__ref.setField("_base",cls_rec_restorfileitem._base);
 //BA.debugLineNum = 5;BA.debugLine="Private Key As IME";
cls_rec_restorfileitem._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_key",cls_rec_restorfileitem._key);
 //BA.debugLineNum = 6;BA.debugLine="Private lblNameFile As Label";
cls_rec_restorfileitem._lblnamefile = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnamefile",cls_rec_restorfileitem._lblnamefile);
 //BA.debugLineNum = 7;BA.debugLine="Private lblDate As Label";
cls_rec_restorfileitem._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldate",cls_rec_restorfileitem._lbldate);
 //BA.debugLineNum = 8;BA.debugLine="Private lblTime As Label";
cls_rec_restorfileitem._lbltime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltime",cls_rec_restorfileitem._lbltime);
 //BA.debugLineNum = 9;BA.debugLine="Dim item As AdapterListBackupFile";
cls_rec_restorfileitem._item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile");__ref.setField("_item",cls_rec_restorfileitem._item);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_rec_restorfileitem) ","cls_rec_restorfileitem",77,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_rec_restorfileitem","getheight", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPanel (cls_rec_restorfileitem) ","cls_rec_restorfileitem",77,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_rec_restorfileitem","getpanel", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(256);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 42;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(512);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mdl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_rec_restorfileitem) ","cls_rec_restorfileitem",77,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_rec_restorfileitem","initialize", __ref, _ba, _mdl);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mdl", _mdl);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(mdl As Object)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 15;BA.debugLine="base = mdl";
Debug.ShouldStop(16384);
__ref.setField ("_base" /*RemoteObject*/ ,_mdl);
 BA.debugLineNum = 16;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_key" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 17;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 18;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(131072);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_rec_restorfileitem.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_rec_restorfileitem.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 19;BA.debugLine="p.LoadLayout(\"l_ClsRecBackupitem\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_ClsRecBackupitem")),__ref.getField(false, "ba"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 24;BA.debugLine="MCode.SendError(LastException)";
Debug.ShouldStop(8388608);
cls_rec_restorfileitem._mcode.runVoidMethod ("_senderror" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_rec_restorfileitem.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 25;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
cls_rec_restorfileitem.__c.runVoidMethod ("LogImpl","599090444",BA.ObjectToString(cls_rec_restorfileitem.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
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
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _item1,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("Show (cls_rec_restorfileitem) ","cls_rec_restorfileitem",77,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_rec_restorfileitem","show", __ref, _item1, _position);}
Debug.locals.put("Item1", _item1);
Debug.locals.put("position", _position);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Show(Item1 As AdapterListBackupFile,pos";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="item=Item1";
Debug.ShouldStop(536870912);
__ref.setField ("_item" /*RemoteObject*/ ,_item1);
 BA.debugLineNum = 31;BA.debugLine="lblNameFile.Text=\"نام فایل: \"&Item1.FileName";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblnamefile" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نام فایل: "),_item1.getField(true,"FileName" /*RemoteObject*/ ))));
 BA.debugLineNum = 32;BA.debugLine="lblDate.Text=\"تاریخ: \"& Item1.Date";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تاریخ: "),_item1.getField(true,"Date" /*RemoteObject*/ ))));
 BA.debugLineNum = 33;BA.debugLine="lblTime.Text=\"ساعت: \"&Item1.Time";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltime" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("ساعت: "),_item1.getField(true,"Time" /*RemoteObject*/ ))));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zip_finish(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("zip_finish (cls_rec_restorfileitem) ","cls_rec_restorfileitem",77,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("zip_finish")) { return __ref.runUserSub(false, "cls_rec_restorfileitem","zip_finish", __ref, _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 104;BA.debugLine="Private Sub zip_finish (Success As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Log(Success)";
Debug.ShouldStop(256);
cls_rec_restorfileitem.__c.runVoidMethod ("LogImpl","599483649",BA.ObjectToString(_success),0);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}