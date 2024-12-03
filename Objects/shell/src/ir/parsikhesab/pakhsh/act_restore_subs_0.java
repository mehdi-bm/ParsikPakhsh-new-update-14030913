package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_restore_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_restore) ","act_restore",36,act_restore.mostCurrent.activityBA,act_restore.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_restore.remoteMe.runUserSub(false, "act_restore","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Activity.LoadLayout(\"l_Restore\")";
Debug.ShouldStop(262144);
act_restore.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_Restore")),act_restore.mostCurrent.activityBA);
 BA.debugLineNum = 20;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(524288);
act_restore.mostCurrent._hlv.runMethod(false,"Initializer",act_restore.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 22;BA.debugLine="Pnl_HLV.AddView(HLV,0,0,Pnl_HLV.Width,Pnl_HLV.Hei";
Debug.ShouldStop(2097152);
act_restore.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_restore.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_restore.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_restore.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 29;BA.debugLine="LoadData";
Debug.ShouldStop(268435456);
_loaddata();
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Pause (act_restore) ","act_restore",36,act_restore.mostCurrent.activityBA,act_restore.mostCurrent,56);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_restore.remoteMe.runUserSub(false, "act_restore","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Resume (act_restore) ","act_restore",36,act_restore.mostCurrent.activityBA,act_restore.mostCurrent,52);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_restore.remoteMe.runUserSub(false, "act_restore","activity_resume");}
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="LoadData";
Debug.ShouldStop(1048576);
_loaddata();
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("btn_Back_Click (act_restore) ","act_restore",36,act_restore.mostCurrent.activityBA,act_restore.mostCurrent,77);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_restore.remoteMe.runUserSub(false, "act_restore","btn_back_click");}
 BA.debugLineNum = 77;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
act_restore.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
 //BA.debugLineNum = 12;BA.debugLine="Private HLV As Hitex_LayoutView";
act_restore.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 13;BA.debugLine="Private Pnl_HLV As Panel";
act_restore.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Dim backuplist As List";
act_restore.mostCurrent._backuplist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_restore) ","act_restore",36,act_restore.mostCurrent.activityBA,act_restore.mostCurrent,61);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_restore.remoteMe.runUserSub(false, "act_restore","hlv_getitemcount");}
 BA.debugLineNum = 61;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Return backuplist.Size";
Debug.ShouldStop(536870912);
if (true) return act_restore.mostCurrent._backuplist.runMethod(true,"getSize");
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("HLV_onBindViewHolder (act_restore) ","act_restore",36,act_restore.mostCurrent.activityBA,act_restore.mostCurrent,70);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_restore.remoteMe.runUserSub(false, "act_restore","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_restorfileitem");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 70;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Dim Item = backuplist.Get(Position) As AdapterLis";
Debug.ShouldStop(64);
_item = (act_restore.mostCurrent._backuplist.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 72;BA.debugLine="Dim rec As Cls_Rec_RestorFileItem=Parent.Tag";
Debug.ShouldStop(128);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 73;BA.debugLine="rec.Show(Item,Position)";
Debug.ShouldStop(256);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_restorfileitem.class, "_show" /*RemoteObject*/ ,(Object)(_item),(Object)(_position));
 BA.debugLineNum = 74;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(512);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_restorfileitem.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_restore) ","act_restore",36,act_restore.mostCurrent.activityBA,act_restore.mostCurrent,64);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_restore.remoteMe.runUserSub(false, "act_restore","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_restorfileitem");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 64;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Dim rec As Cls_Rec_RestorFileItem";
Debug.ShouldStop(1);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_rec_restorfileitem");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 66;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(2);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_restorfileitem.class, "_initialize" /*RemoteObject*/ ,act_restore.mostCurrent.activityBA,(Object)(act_restore.getObject()));
 BA.debugLineNum = 67;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(4);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_restorfileitem.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_restore.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_restore.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_restorfileitem.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 68;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(8);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddata() throws Exception{
try {
		Debug.PushSubsStack("LoadData (act_restore) ","act_restore",36,act_restore.mostCurrent.activityBA,act_restore.mostCurrent,33);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_restore.remoteMe.runUserSub(false, "act_restore","loaddata");}
RemoteObject _rowslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _components = null;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile");
 BA.debugLineNum = 33;BA.debugLine="Sub LoadData";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="Dim RowsList As List";
Debug.ShouldStop(4);
_rowslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 36;BA.debugLine="RowsList=(File.ReadList(File.DirDefaultExternal,\"";
Debug.ShouldStop(8);
_rowslist = (act_restore.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(act_restore.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("Parsik/Backup/backlist.txt"))));Debug.locals.put("RowsList", _rowslist);
 BA.debugLineNum = 38;BA.debugLine="backuplist.Initialize";
Debug.ShouldStop(32);
act_restore.mostCurrent._backuplist.runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="For i = RowsList.Size - 1 To 0 Step -1";
Debug.ShouldStop(64);
{
final int step4 = -1;
final int limit4 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_rowslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 40;BA.debugLine="Dim str As String=RowsList.Get(i)";
Debug.ShouldStop(128);
_str = BA.ObjectToString(_rowslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 41;BA.debugLine="Dim components() As String";
Debug.ShouldStop(256);
_components = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("components", _components);
 BA.debugLineNum = 42;BA.debugLine="Dim item As AdapterListBackupFile";
Debug.ShouldStop(512);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile");Debug.locals.put("item", _item);
 BA.debugLineNum = 43;BA.debugLine="components = Regex.Split(\",\", str)";
Debug.ShouldStop(1024);
_components = act_restore.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(_str));Debug.locals.put("components", _components);
 BA.debugLineNum = 44;BA.debugLine="item.FileName=components(0)";
Debug.ShouldStop(2048);
_item.setField ("FileName" /*RemoteObject*/ ,_components.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 45;BA.debugLine="item.Date=components(1)";
Debug.ShouldStop(4096);
_item.setField ("Date" /*RemoteObject*/ ,_components.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 46;BA.debugLine="item.Time=components(2)";
Debug.ShouldStop(8192);
_item.setField ("Time" /*RemoteObject*/ ,_components.getArrayElement(true,BA.numberCast(int.class, 2)));
 BA.debugLineNum = 47;BA.debugLine="backuplist.Add(item)";
Debug.ShouldStop(16384);
act_restore.mostCurrent._backuplist.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 49;BA.debugLine="HLV.Show";
Debug.ShouldStop(65536);
act_restore.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}