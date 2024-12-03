package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_notif_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_notif) ","act_notif",25,act_notif.mostCurrent.activityBA,act_notif.mostCurrent,16);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_notif.remoteMe.runUserSub(false, "act_notif","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 16;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="MCode.ListNotif.Initialize";
Debug.ShouldStop(65536);
act_notif.mostCurrent._mcode._listnotif /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="MCode.ListNotif.Clear";
Debug.ShouldStop(131072);
act_notif.mostCurrent._mcode._listnotif /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 19;BA.debugLine="Activity.LoadLayout(\"L_Notif\")";
Debug.ShouldStop(262144);
act_notif.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_Notif")),act_notif.mostCurrent.activityBA);
 BA.debugLineNum = 20;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(524288);
act_notif.mostCurrent._hlv.runMethod(false,"Initializer",act_notif.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 22;BA.debugLine="Pnl_HLV.AddView(HLV,0,5%y,Pnl_HLV.Width,Pnl_HLV.H";
Debug.ShouldStop(2097152);
act_notif.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_notif.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(act_notif.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_notif.mostCurrent.activityBA)),(Object)(act_notif.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_notif.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
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
		Debug.PushSubsStack("Activity_Pause (act_notif) ","act_notif",25,act_notif.mostCurrent.activityBA,act_notif.mostCurrent,56);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_notif.remoteMe.runUserSub(false, "act_notif","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (act_notif) ","act_notif",25,act_notif.mostCurrent.activityBA,act_notif.mostCurrent,52);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_notif.remoteMe.runUserSub(false, "act_notif","activity_resume");}
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("btn_Back_Click (act_notif) ","act_notif",25,act_notif.mostCurrent.activityBA,act_notif.mostCurrent,87);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_notif.remoteMe.runUserSub(false, "act_notif","btn_back_click");}
 BA.debugLineNum = 87;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
act_notif.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistview() throws Exception{
try {
		Debug.PushSubsStack("CreateListView (act_notif) ","act_notif",25,act_notif.mostCurrent.activityBA,act_notif.mostCurrent,59);
if (RapidSub.canDelegate("createlistview")) { return ir.parsikhesab.pakhsh.act_notif.remoteMe.runUserSub(false, "act_notif","createlistview");}
 BA.debugLineNum = 59;BA.debugLine="Sub CreateListView";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
act_notif.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 61;BA.debugLine="If MCode.ListNotif.Size>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",act_notif.mostCurrent._mcode._listnotif /*RemoteObject*/ .runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 62;BA.debugLine="HLV.Show";
Debug.ShouldStop(536870912);
act_notif.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 }else {
 BA.debugLineNum = 64;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
act_notif.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 65;BA.debugLine="ToastMessageShow(\"اعلانی وجود ندارد\",True)";
Debug.ShouldStop(1);
act_notif.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("اعلانی وجود ندارد")),(Object)(act_notif.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
act_notif.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 13;BA.debugLine="Private Pnl_HLV As Panel";
act_notif.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_notif) ","act_notif",25,act_notif.mostCurrent.activityBA,act_notif.mostCurrent,69);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_notif.remoteMe.runUserSub(false, "act_notif","hlv_getitemcount");}
 BA.debugLineNum = 69;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Return MCode.ListNotif.Size";
Debug.ShouldStop(32);
if (true) return act_notif.mostCurrent._mcode._listnotif /*RemoteObject*/ .runMethod(true,"getSize");
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("HLV_onBindViewHolder (act_notif) ","act_notif",25,act_notif.mostCurrent.activityBA,act_notif.mostCurrent,80);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_notif.remoteMe.runUserSub(false, "act_notif","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnotif");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recnotif");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 80;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Dim Item = MCode.ListNotif.Get(Position) As Adapt";
Debug.ShouldStop(65536);
_item = (act_notif.mostCurrent._mcode._listnotif /*RemoteObject*/ .runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 82;BA.debugLine="Dim rec As cls_RecNotif=Parent.Tag";
Debug.ShouldStop(131072);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 83;BA.debugLine="rec.show_data(Item)";
Debug.ShouldStop(262144);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recnotif.class, "_show_data" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 84;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(524288);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recnotif.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_notif) ","act_notif",25,act_notif.mostCurrent.activityBA,act_notif.mostCurrent,73);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_notif.remoteMe.runUserSub(false, "act_notif","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recnotif");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 73;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Dim rec As cls_RecNotif";
Debug.ShouldStop(512);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recnotif");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 75;BA.debugLine="rec.Initialize";
Debug.ShouldStop(1024);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recnotif.class, "_initialize" /*RemoteObject*/ ,act_notif.mostCurrent.activityBA);
 BA.debugLineNum = 76;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(2048);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recnotif.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_notif.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_notif.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recnotif.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 77;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(4096);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("LoadData (act_notif) ","act_notif",25,act_notif.mostCurrent.activityBA,act_notif.mostCurrent,33);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_notif.remoteMe.runUserSub(false, "act_notif","loaddata");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnotif");
 BA.debugLineNum = 33;BA.debugLine="Sub LoadData";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(2);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 36;BA.debugLine="MCode.ListNotif.Clear";
Debug.ShouldStop(8);
act_notif.mostCurrent._mcode._listnotif /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 38;BA.debugLine="cu=MCode.Result(\"Select * from TblNotifi order by";
Debug.ShouldStop(32);
_cu = act_notif.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_notif.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * from TblNotifi order by Id desc")));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 39;BA.debugLine="For i = 0 To cu.RowCount - 1";
Debug.ShouldStop(64);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 40;BA.debugLine="Dim Item As AdapterListNotif";
Debug.ShouldStop(128);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnotif");Debug.locals.put("Item", _item);
 BA.debugLineNum = 41;BA.debugLine="cu.Position=i";
Debug.ShouldStop(256);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 42;BA.debugLine="Item.FldId=cu.GetInt(\"Id\")";
Debug.ShouldStop(512);
_item.setField ("FldId" /*RemoteObject*/ ,BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Id")))));
 BA.debugLineNum = 43;BA.debugLine="Item.FldTitle=cu.GetString(\"FldTitle\")";
Debug.ShouldStop(1024);
_item.setField ("FldTitle" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTitle"))));
 BA.debugLineNum = 44;BA.debugLine="Item.FldBody=cu.GetString(\"FldBody\")";
Debug.ShouldStop(2048);
_item.setField ("FldBody" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldBody"))));
 BA.debugLineNum = 45;BA.debugLine="Item.FldDate=cu.GetString(\"FldDate\")";
Debug.ShouldStop(4096);
_item.setField ("FldDate" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDate"))));
 BA.debugLineNum = 46;BA.debugLine="Item.FldTime=cu.GetString(\"FldTime\")";
Debug.ShouldStop(8192);
_item.setField ("FldTime" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTime"))));
 BA.debugLineNum = 47;BA.debugLine="MCode.ListNotif.Add(Item)";
Debug.ShouldStop(16384);
act_notif.mostCurrent._mcode._listnotif /*RemoteObject*/ .runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 49;BA.debugLine="CreateListView";
Debug.ShouldStop(65536);
_createlistview();
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