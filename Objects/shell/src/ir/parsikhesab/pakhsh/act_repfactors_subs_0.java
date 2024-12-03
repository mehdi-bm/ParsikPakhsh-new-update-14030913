package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_repfactors_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"L_RepProfile\")";
Debug.ShouldStop(4);
act_repfactors.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_RepProfile")),act_repfactors.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(8);
act_repfactors.mostCurrent._hlv.runMethod(false,"Initializer",act_repfactors.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 37;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
Debug.ShouldStop(16);
act_repfactors.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_repfactors.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_repfactors.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(act_repfactors.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 38;BA.debugLine="ListFaktor.Initialize";
Debug.ShouldStop(32);
act_repfactors.mostCurrent._listfaktor.runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="Gps.Initialize(\"Gps\")";
Debug.ShouldStop(64);
act_repfactors._gps.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Gps")));
 BA.debugLineNum = 40;BA.debugLine="HLV.Ripple.Color(0xFF909090)";
Debug.ShouldStop(128);
act_repfactors.mostCurrent._hlv.runMethod(false,"Ripple").runVoidMethod ("Color",(Object)(BA.numberCast(int.class, ((int)0xff909090))));
 BA.debugLineNum = 42;BA.debugLine="HLV.Show";
Debug.ShouldStop(512);
act_repfactors.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 43;BA.debugLine="CmbVaziat.cmbBox.Add(\"همه سفارشات\")";
Debug.ShouldStop(1024);
act_repfactors.mostCurrent._cmbvaziat.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همه سفارشات")));
 BA.debugLineNum = 44;BA.debugLine="CmbVaziat.cmbBox.Add(\"سفارشات ارسال نشده\")";
Debug.ShouldStop(2048);
act_repfactors.mostCurrent._cmbvaziat.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("سفارشات ارسال نشده")));
 BA.debugLineNum = 45;BA.debugLine="CmbVaziat.cmbBox.Add(\"سفارشات ارسال شده\")";
Debug.ShouldStop(4096);
act_repfactors.mostCurrent._cmbvaziat.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("سفارشات ارسال شده")));
 BA.debugLineNum = 46;BA.debugLine="CmbVaziat.cmbBox.Add(\"فاکتورهای فروش رفته\")";
Debug.ShouldStop(8192);
act_repfactors.mostCurrent._cmbvaziat.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("فاکتورهای فروش رفته")));
 BA.debugLineNum = 47;BA.debugLine="CmbVaziat.cmbBox.Add(\"فاکتورهای فروش نرفته\")";
Debug.ShouldStop(16384);
act_repfactors.mostCurrent._cmbvaziat.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("فاکتورهای فروش نرفته")));
 BA.debugLineNum = 48;BA.debugLine="CmbVaziat.cmbBox.Add(\"فاکتورهای مرجوع شده\")";
Debug.ShouldStop(32768);
act_repfactors.mostCurrent._cmbvaziat.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("فاکتورهای مرجوع شده")));
 BA.debugLineNum = 49;BA.debugLine="CmbVaziat.cmbBox.Add(\"فاکتورهای امانی شده\")";
Debug.ShouldStop(65536);
act_repfactors.mostCurrent._cmbvaziat.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("فاکتورهای امانی شده")));
 BA.debugLineNum = 51;BA.debugLine="CmbVaziat.SelectedIndex=0";
Debug.ShouldStop(262144);
act_repfactors.mostCurrent._cmbvaziat.runClassMethod (ir.parsikhesab.pakhsh.b4xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 52;BA.debugLine="LoadData";
Debug.ShouldStop(524288);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,237);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 237;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,229);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","activity_resume");}
 BA.debugLineNum = 229;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(32);
act_repfactors.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Application_Error (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,244);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 244;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(524288);
 BA.debugLineNum = 246;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return act_repfactors.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlistprofile_click() throws Exception{
try {
		Debug.PushSubsStack("BtnListProfile_Click (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,233);
if (RapidSub.canDelegate("btnlistprofile_click")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","btnlistprofile_click");}
 BA.debugLineNum = 233;BA.debugLine="Sub BtnListProfile_Click";
Debug.ShouldStop(256);
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
public static RemoteObject  _cmbvaziat_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("CmbVaziat_SelectedIndexChanged (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,249);
if (RapidSub.canDelegate("cmbvaziat_selectedindexchanged")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","cmbvaziat_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 249;BA.debugLine="Private Sub CmbVaziat_SelectedIndexChanged (Index";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="Log(Index)";
Debug.ShouldStop(33554432);
act_repfactors.mostCurrent.__c.runVoidMethod ("LogImpl","559768833",BA.NumberToString(_index),0);
 BA.debugLineNum = 251;BA.debugLine="LoadData";
Debug.ShouldStop(67108864);
_loaddata();
 BA.debugLineNum = 252;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim HLV As Hitex_LayoutView";
act_repfactors.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 17;BA.debugLine="Private LblName As Label";
act_repfactors.mostCurrent._lblname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ListFaktor As List";
act_repfactors.mostCurrent._listfaktor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 19;BA.debugLine="Private PnlTop As Panel";
act_repfactors.mostCurrent._pnltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private pnl_HLV As Panel";
act_repfactors.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Label1 As Label";
act_repfactors.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Label2 As Label";
act_repfactors.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Label4 As Label";
act_repfactors.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LblBack As Button";
act_repfactors.mostCurrent._lblback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LblNameS As Label";
act_repfactors.mostCurrent._lblnames = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LblVaziatS As Label";
act_repfactors.mostCurrent._lblvaziats = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private LblSumForoosh As Label";
act_repfactors.mostCurrent._lblsumforoosh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private LblSumSefaresh As Label";
act_repfactors.mostCurrent._lblsumsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private LblSumBargasht As Label";
act_repfactors.mostCurrent._lblsumbargasht = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private LblSumKhales As Label";
act_repfactors.mostCurrent._lblsumkhales = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private CmbVaziat As B4XComboBox";
act_repfactors.mostCurrent._cmbvaziat = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,211);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","hlv_getitemcount");}
 BA.debugLineNum = 211;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="Return ListFaktor.Size";
Debug.ShouldStop(524288);
if (true) return act_repfactors.mostCurrent._listfaktor.runMethod(true,"getSize");
 BA.debugLineNum = 213;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("HLV_onBindViewHolder (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,222);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_factor");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 222;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="Dim Item = ListFaktor.Get(Position) As AdapterLis";
Debug.ShouldStop(1073741824);
_item = (act_repfactors.mostCurrent._listfaktor.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 224;BA.debugLine="Dim rec As Cls_Rec_Factor=Parent.Tag";
Debug.ShouldStop(-2147483648);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 225;BA.debugLine="rec.Show(Item,DateAz,DateTa)";
Debug.ShouldStop(1);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_factor.class, "_show" /*RemoteObject*/ ,(Object)(_item),(Object)(act_repfactors._dateaz),(Object)(act_repfactors._dateta));
 BA.debugLineNum = 226;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(2);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_factor.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,215);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_factor");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 215;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="Dim rec As Cls_Rec_Factor";
Debug.ShouldStop(8388608);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_rec_factor");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 217;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(16777216);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_factor.class, "_initialize" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(act_repfactors.getObject()));
 BA.debugLineNum = 218;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(33554432);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_factor.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_repfactors.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_repfactors.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_factor.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 219;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(67108864);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("LblBack_Click (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,241);
if (RapidSub.canDelegate("lblback_click")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","lblback_click");}
 BA.debugLineNum = 241;BA.debugLine="Sub LblBack_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 242;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
act_repfactors.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("LoadData (act_repfactors) ","act_repfactors",30,act_repfactors.mostCurrent.activityBA,act_repfactors.mostCurrent,57);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_repfactors.remoteMe.runUserSub(false, "act_repfactors","loaddata");}
RemoteObject _filtervaziat = RemoteObject.createImmutable("");
RemoteObject _sumforoosh = RemoteObject.createImmutable("");
RemoteObject _sumsefaresh = RemoteObject.createImmutable("");
RemoteObject _sumbargasht = RemoteObject.createImmutable("");
RemoteObject _sumkhales = RemoteObject.createImmutable("");
RemoteObject _tfsum = RemoteObject.createImmutable(0L);
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _fldtedadjozforoosh = RemoteObject.createImmutable("");
RemoteObject _fldtedadkolforoosh = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");
RemoteObject _cu2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _j = 0;
RemoteObject _fldtedadjozsefaresh = RemoteObject.createImmutable("");
RemoteObject _fldtedadkolsefaresh = RemoteObject.createImmutable("");
RemoteObject _cu3 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _item2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");
 BA.debugLineNum = 57;BA.debugLine="Sub LoadData";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim FilterVaziat As String=\"\"";
Debug.ShouldStop(33554432);
_filtervaziat = BA.ObjectToString("");Debug.locals.put("FilterVaziat", _filtervaziat);Debug.locals.put("FilterVaziat", _filtervaziat);
 BA.debugLineNum = 59;BA.debugLine="Dim SumForoosh As String=0";
Debug.ShouldStop(67108864);
_sumforoosh = BA.NumberToString(0);Debug.locals.put("SumForoosh", _sumforoosh);Debug.locals.put("SumForoosh", _sumforoosh);
 BA.debugLineNum = 60;BA.debugLine="Dim SumSefaresh As String=0";
Debug.ShouldStop(134217728);
_sumsefaresh = BA.NumberToString(0);Debug.locals.put("SumSefaresh", _sumsefaresh);Debug.locals.put("SumSefaresh", _sumsefaresh);
 BA.debugLineNum = 61;BA.debugLine="Dim SumBargasht As String=0";
Debug.ShouldStop(268435456);
_sumbargasht = BA.NumberToString(0);Debug.locals.put("SumBargasht", _sumbargasht);Debug.locals.put("SumBargasht", _sumbargasht);
 BA.debugLineNum = 62;BA.debugLine="Dim SumKhales As String=0";
Debug.ShouldStop(536870912);
_sumkhales = BA.NumberToString(0);Debug.locals.put("SumKhales", _sumkhales);Debug.locals.put("SumKhales", _sumkhales);
 BA.debugLineNum = 64;BA.debugLine="Select CmbVaziat.SelectedIndex";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(act_repfactors.mostCurrent._cmbvaziat.runClassMethod (ir.parsikhesab.pakhsh.b4xcombobox.class, "_getselectedindex" /*RemoteObject*/ ),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6))) {
case 0: {
 BA.debugLineNum = 66;BA.debugLine="FilterVaziat=\"\"";
Debug.ShouldStop(2);
_filtervaziat = BA.ObjectToString("");Debug.locals.put("FilterVaziat", _filtervaziat);
 break; }
case 1: {
 BA.debugLineNum = 68;BA.debugLine="FilterVaziat=\" And FldSync='False'\"";
Debug.ShouldStop(8);
_filtervaziat = BA.ObjectToString(" And FldSync='False'");Debug.locals.put("FilterVaziat", _filtervaziat);
 break; }
case 2: {
 BA.debugLineNum = 70;BA.debugLine="FilterVaziat=\" And FldSync='True'\"";
Debug.ShouldStop(32);
_filtervaziat = BA.ObjectToString(" And FldSync='True'");Debug.locals.put("FilterVaziat", _filtervaziat);
 break; }
case 3: {
 BA.debugLineNum = 72;BA.debugLine="FilterVaziat=\" And fldShomareForoosh>0 and FldT";
Debug.ShouldStop(128);
_filtervaziat = BA.ObjectToString(" And fldShomareForoosh>0 and FldType='Foroosh'");Debug.locals.put("FilterVaziat", _filtervaziat);
 break; }
case 4: {
 BA.debugLineNum = 74;BA.debugLine="FilterVaziat=\" And fldShomareForoosh=0 and FldT";
Debug.ShouldStop(512);
_filtervaziat = BA.ObjectToString(" And fldShomareForoosh=0 and FldType='Foroosh'");Debug.locals.put("FilterVaziat", _filtervaziat);
 break; }
case 5: {
 BA.debugLineNum = 76;BA.debugLine="FilterVaziat=\" And FldType='Marjoee'\"";
Debug.ShouldStop(2048);
_filtervaziat = BA.ObjectToString(" And FldType='Marjoee'");Debug.locals.put("FilterVaziat", _filtervaziat);
 break; }
case 6: {
 BA.debugLineNum = 78;BA.debugLine="FilterVaziat=\" And FldAmani='1'\"";
Debug.ShouldStop(8192);
_filtervaziat = BA.ObjectToString(" And FldAmani='1'");Debug.locals.put("FilterVaziat", _filtervaziat);
 break; }
}
;
 BA.debugLineNum = 81;BA.debugLine="ListFaktor.Clear";
Debug.ShouldStop(65536);
act_repfactors.mostCurrent._listfaktor.runVoidMethod ("Clear");
 BA.debugLineNum = 82;BA.debugLine="Dim TFsum As Long=0";
Debug.ShouldStop(131072);
_tfsum = BA.numberCast(long.class, 0);Debug.locals.put("TFsum", _tfsum);Debug.locals.put("TFsum", _tfsum);
 BA.debugLineNum = 83;BA.debugLine="If CodeMoshtari=0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",act_repfactors._codemoshtari,BA.NumberToString(0))) { 
 BA.debugLineNum = 84;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select distinct";
Debug.ShouldStop(524288);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_repfactors.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select distinct fldShomareForoosh from  TblFaktor where fldShomareForoosh>0   and FldDate between "),act_repfactors._dateaz,RemoteObject.createImmutable(" and "),act_repfactors._dateta,RemoteObject.createImmutable(" "),_filtervaziat)));Debug.locals.put("cu1", _cu1);Debug.locals.put("cu1", _cu1);
 }else {
 BA.debugLineNum = 86;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select distinct";
Debug.ShouldStop(2097152);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_repfactors.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select distinct fldShomareForoosh from  TblFaktor where fldShomareForoosh>0 and FldC_Tafzili="),act_repfactors._codemoshtari,RemoteObject.createImmutable("   and FldDate between "),act_repfactors._dateaz,RemoteObject.createImmutable(" and "),act_repfactors._dateta,RemoteObject.createImmutable(" "),_filtervaziat)));Debug.locals.put("cu1", _cu1);Debug.locals.put("cu1", _cu1);
 };
 BA.debugLineNum = 88;BA.debugLine="If cu1.RowCount>0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 89;BA.debugLine="For i=0 To cu1.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {_cu1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30) ;_i = ((int)(0 + _i + step30))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 90;BA.debugLine="Dim c As Int=0";
Debug.ShouldStop(33554432);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 91;BA.debugLine="cu1.Position=i";
Debug.ShouldStop(67108864);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 92;BA.debugLine="Dim fldTedadJozForoosh As String=0";
Debug.ShouldStop(134217728);
_fldtedadjozforoosh = BA.NumberToString(0);Debug.locals.put("fldTedadJozForoosh", _fldtedadjozforoosh);Debug.locals.put("fldTedadJozForoosh", _fldtedadjozforoosh);
 BA.debugLineNum = 93;BA.debugLine="Dim fldTedadKolForoosh As String=0";
Debug.ShouldStop(268435456);
_fldtedadkolforoosh = BA.NumberToString(0);Debug.locals.put("fldTedadKolForoosh", _fldtedadkolforoosh);Debug.locals.put("fldTedadKolForoosh", _fldtedadkolforoosh);
 BA.debugLineNum = 94;BA.debugLine="Dim Item As AdapterListFaktor";
Debug.ShouldStop(536870912);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");Debug.locals.put("Item", _item);
 BA.debugLineNum = 95;BA.debugLine="Log(cu1.GetString(\"fldShomareForoosh\"))";
Debug.ShouldStop(1073741824);
act_repfactors.mostCurrent.__c.runVoidMethod ("LogImpl","559179046",_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))),0);
 BA.debugLineNum = 96;BA.debugLine="Dim cu2 As Cursor = MCode.Result(\"select * from";
Debug.ShouldStop(-2147483648);
_cu2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu2 = act_repfactors.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  TblFaktor where fldShomareForoosh="),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))),RemoteObject.createImmutable("  And FldDate between "),act_repfactors._dateaz,RemoteObject.createImmutable(" And "),act_repfactors._dateta,RemoteObject.createImmutable(" "),_filtervaziat)));Debug.locals.put("cu2", _cu2);Debug.locals.put("cu2", _cu2);
 BA.debugLineNum = 97;BA.debugLine="If cu2.RowCount>0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_cu2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 98;BA.debugLine="For j=0 To cu2.RowCount-1";
Debug.ShouldStop(2);
{
final int step39 = 1;
final int limit39 = RemoteObject.solve(new RemoteObject[] {_cu2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step39 > 0 && _j <= limit39) || (step39 < 0 && _j >= limit39) ;_j = ((int)(0 + _j + step39))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 99;BA.debugLine="cu2.Position=j";
Debug.ShouldStop(4);
_cu2.runMethod(true,"setPosition",BA.numberCast(int.class, _j));
 BA.debugLineNum = 102;BA.debugLine="Item.fldC_Ashkhas=cu2.GetString(\"FldC_Tafzili";
Debug.ShouldStop(32);
_item.setField ("fldC_Ashkhas" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Tafzili"))));
 BA.debugLineNum = 103;BA.debugLine="Item.FldAmani=myCode.Is_Null_adad(cu2.GetStri";
Debug.ShouldStop(64);
_item.setField ("FldAmani" /*RemoteObject*/ ,act_repfactors.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAmani"))))));
 BA.debugLineNum = 104;BA.debugLine="Item.fldDate=MCode.PersianDateDash(cu2.GetStr";
Debug.ShouldStop(128);
_item.setField ("fldDate" /*RemoteObject*/ ,act_repfactors.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDate"))))));
 BA.debugLineNum = 105;BA.debugLine="Item.FldType=cu2.GetString(\"FldType\")";
Debug.ShouldStop(256);
_item.setField ("FldType" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))));
 BA.debugLineNum = 106;BA.debugLine="Item.fldShomareForoosh=cu2.GetString(\"fldShom";
Debug.ShouldStop(512);
_item.setField ("fldShomareForoosh" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))));
 BA.debugLineNum = 107;BA.debugLine="Item.fldTotalFaktor=cu2.GetString(\"FldTotalFa";
Debug.ShouldStop(1024);
_item.setField ("fldTotalFaktor" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))));
 BA.debugLineNum = 108;BA.debugLine="If cu2.Getstring(\"FldSync\")=\"True\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSync"))),BA.ObjectToString("True"))) { 
 BA.debugLineNum = 109;BA.debugLine="Item.synced=True";
Debug.ShouldStop(4096);
_item.setField ("synced" /*RemoteObject*/ ,act_repfactors.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 111;BA.debugLine="Item.synced=False";
Debug.ShouldStop(16384);
_item.setField ("synced" /*RemoteObject*/ ,act_repfactors.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 113;BA.debugLine="Select cu2.GetString(\"FldType\")";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),BA.ObjectToString("Foroosh"),BA.ObjectToString("Marjoee"))) {
case 0: {
 BA.debugLineNum = 115;BA.debugLine="Item.fldShomareFaktor=cu2.GetString(\"FldSho";
Debug.ShouldStop(262144);
_item.setField ("fldShomareFaktor" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))));
 BA.debugLineNum = 117;BA.debugLine="fldTedadJozForoosh=fldTedadJozForoosh+cu2.G";
Debug.ShouldStop(1048576);
_fldtedadjozforoosh = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldtedadjozforoosh),BA.numberCast(double.class, _cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))))}, "+",1, 0));Debug.locals.put("fldTedadJozForoosh", _fldtedadjozforoosh);
 BA.debugLineNum = 118;BA.debugLine="fldTedadKolForoosh=fldTedadKolForoosh+cu2.G";
Debug.ShouldStop(2097152);
_fldtedadkolforoosh = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldtedadkolforoosh),BA.numberCast(double.class, _cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))))}, "+",1, 0));Debug.locals.put("fldTedadKolForoosh", _fldtedadkolforoosh);
 break; }
case 1: {
 BA.debugLineNum = 124;BA.debugLine="Item.FldShomareBargasht=cu2.GetString(\"FldS";
Debug.ShouldStop(134217728);
_item.setField ("FldShomareBargasht" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareBargasht"))));
 BA.debugLineNum = 125;BA.debugLine="Item.fldShomareFaktor=cu2.GetString(\"FldSho";
Debug.ShouldStop(268435456);
_item.setField ("fldShomareFaktor" /*RemoteObject*/ ,_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))));
 BA.debugLineNum = 126;BA.debugLine="Item.FldDateBargasht=MCode.PersianDateDash(";
Debug.ShouldStop(536870912);
_item.setField ("FldDateBargasht" /*RemoteObject*/ ,act_repfactors.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDate"))))));
 BA.debugLineNum = 127;BA.debugLine="Item.FldMablaghBargasht=MCode.SingleResult(";
Debug.ShouldStop(1073741824);
_item.setField ("FldMablaghBargasht" /*RemoteObject*/ ,BA.ObjectToString(act_repfactors.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select distinct FldTotalFaktor from TblFaktor where FldType='"),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),RemoteObject.createImmutable("' and FldDate between "),act_repfactors._dateaz,RemoteObject.createImmutable(" and "),act_repfactors._dateta,RemoteObject.createImmutable(" and fldShomareForoosh="),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))),RemoteObject.createImmutable(" "),_filtervaziat)))));
 BA.debugLineNum = 128;BA.debugLine="Item.fldTedadJozMarjoee=MCode.SingleResult(";
Debug.ShouldStop(-2147483648);
_item.setField ("fldTedadJozMarjoee" /*RemoteObject*/ ,BA.ObjectToString(act_repfactors.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select sum(FldTedadDarSabadJoz) from TblFaktor where FldType='"),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),RemoteObject.createImmutable("' and FldDate between "),act_repfactors._dateaz,RemoteObject.createImmutable(" and "),act_repfactors._dateta,RemoteObject.createImmutable("  and fldShomareForoosh="),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))),RemoteObject.createImmutable(" "),_filtervaziat)))));
 BA.debugLineNum = 129;BA.debugLine="Item.fldTedadCartonMarjoee=MCode.SingleResu";
Debug.ShouldStop(1);
_item.setField ("fldTedadCartonMarjoee" /*RemoteObject*/ ,BA.ObjectToString(act_repfactors.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select sum(FldTedadDarSabadKol) from TblFaktor where FldType='"),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldType"))),RemoteObject.createImmutable("' and FldDate between "),act_repfactors._dateaz,RemoteObject.createImmutable(" and "),act_repfactors._dateta,RemoteObject.createImmutable("  and fldShomareForoosh="),_cu2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))),RemoteObject.createImmutable(" "),_filtervaziat)))));
 BA.debugLineNum = 131;BA.debugLine="Item.fldTedadJozMande=fldTedadJozForoosh-It";
Debug.ShouldStop(4);
_item.setField ("fldTedadJozMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldtedadjozforoosh),BA.numberCast(double.class, _item.getField(true,"fldTedadJozMarjoee" /*RemoteObject*/ ))}, "-",1, 0)));
 BA.debugLineNum = 132;BA.debugLine="Item.fldTedadCartonMande=fldTedadKolForoosh";
Debug.ShouldStop(8);
_item.setField ("fldTedadCartonMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldtedadkolforoosh),BA.numberCast(double.class, _item.getField(true,"fldTedadCartonMarjoee" /*RemoteObject*/ ))}, "-",1, 0)));
 BA.debugLineNum = 133;BA.debugLine="Item.fldMablaghMande=myCode.Is_Null_adad(It";
Debug.ShouldStop(16);
_item.setField ("fldMablaghMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_repfactors.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_item.getField(true,"fldTotalFaktor" /*RemoteObject*/ )))),BA.numberCast(double.class, _item.getField(true,"FldMablaghBargasht" /*RemoteObject*/ ))}, "-",1, 0)));
 break; }
}
;
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 138;BA.debugLine="If Item.FldType=\"Foroosh\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_item.getField(true,"FldType" /*RemoteObject*/ ),BA.ObjectToString("Foroosh"))) { 
 BA.debugLineNum = 140;BA.debugLine="SumForoosh=SumForoosh + myCode.Is_Null_adad(I";
Debug.ShouldStop(2048);
_sumforoosh = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumforoosh),BA.numberCast(double.class, act_repfactors.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_item.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))))}, "+",1, 0));Debug.locals.put("SumForoosh", _sumforoosh);
 }else 
{ BA.debugLineNum = 141;BA.debugLine="else If Item.FldType=\"Marjoee\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_item.getField(true,"FldType" /*RemoteObject*/ ),BA.ObjectToString("Marjoee"))) { 
 BA.debugLineNum = 142;BA.debugLine="SumBargasht=SumBargasht +myCode.Is_Null_adad(";
Debug.ShouldStop(8192);
_sumbargasht = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumbargasht),BA.numberCast(double.class, act_repfactors.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_item.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))))}, "+",1, 0));Debug.locals.put("SumBargasht", _sumbargasht);
 }}
;
 BA.debugLineNum = 144;BA.debugLine="SumKhales =SumKhales + (SumForoosh-SumBargasht";
Debug.ShouldStop(32768);
_sumkhales = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumkhales),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumforoosh),BA.numberCast(double.class, _sumbargasht)}, "-",1, 0))}, "+",1, 0));Debug.locals.put("SumKhales", _sumkhales);
 BA.debugLineNum = 145;BA.debugLine="Item.fldTedadJoz=fldTedadJozForoosh";
Debug.ShouldStop(65536);
_item.setField ("fldTedadJoz" /*RemoteObject*/ ,_fldtedadjozforoosh);
 BA.debugLineNum = 146;BA.debugLine="Item.fldTedadCarton=fldTedadKolForoosh";
Debug.ShouldStop(131072);
_item.setField ("fldTedadCarton" /*RemoteObject*/ ,_fldtedadkolforoosh);
 BA.debugLineNum = 147;BA.debugLine="ListFaktor.Add(Item)";
Debug.ShouldStop(262144);
act_repfactors.mostCurrent._listfaktor.runVoidMethod ("Add",(Object)((_item)));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 154;BA.debugLine="If CodeMoshtari=0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",act_repfactors._codemoshtari,BA.NumberToString(0))) { 
 BA.debugLineNum = 155;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select distinct";
Debug.ShouldStop(67108864);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_repfactors.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select distinct FldShomareFaktor from  TblFaktor where fldShomareForoosh=0 and FldType='Foroosh'  and FldDate between "),act_repfactors._dateaz,RemoteObject.createImmutable(" and "),act_repfactors._dateta,RemoteObject.createImmutable(" "),_filtervaziat)));Debug.locals.put("cu1", _cu1);Debug.locals.put("cu1", _cu1);
 }else {
 BA.debugLineNum = 157;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select distinct";
Debug.ShouldStop(268435456);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_repfactors.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select distinct FldShomareFaktor from  TblFaktor where fldShomareForoosh=0 and FldC_Tafzili="),act_repfactors._codemoshtari,RemoteObject.createImmutable(" and FldType='Foroosh'  and FldDate between "),act_repfactors._dateaz,RemoteObject.createImmutable(" and "),act_repfactors._dateta,RemoteObject.createImmutable(" "),_filtervaziat)));Debug.locals.put("cu1", _cu1);Debug.locals.put("cu1", _cu1);
 };
 BA.debugLineNum = 159;BA.debugLine="If cu1.RowCount>0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 162;BA.debugLine="For i=0 To cu1.RowCount-1";
Debug.ShouldStop(2);
{
final int step87 = 1;
final int limit87 = RemoteObject.solve(new RemoteObject[] {_cu1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step87 > 0 && _i <= limit87) || (step87 < 0 && _i >= limit87) ;_i = ((int)(0 + _i + step87))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 163;BA.debugLine="cu1.Position=i";
Debug.ShouldStop(4);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 164;BA.debugLine="Dim fldTedadJozSefaresh  As String=0";
Debug.ShouldStop(8);
_fldtedadjozsefaresh = BA.NumberToString(0);Debug.locals.put("fldTedadJozSefaresh", _fldtedadjozsefaresh);Debug.locals.put("fldTedadJozSefaresh", _fldtedadjozsefaresh);
 BA.debugLineNum = 165;BA.debugLine="Dim fldTedadKolSefaresh As String=0";
Debug.ShouldStop(16);
_fldtedadkolsefaresh = BA.NumberToString(0);Debug.locals.put("fldTedadKolSefaresh", _fldtedadkolsefaresh);Debug.locals.put("fldTedadKolSefaresh", _fldtedadkolsefaresh);
 BA.debugLineNum = 166;BA.debugLine="Log(cu1.GetString(\"FldShomareFaktor\"))";
Debug.ShouldStop(32);
act_repfactors.mostCurrent.__c.runVoidMethod ("LogImpl","559179117",_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))),0);
 BA.debugLineNum = 167;BA.debugLine="Dim cu3 As Cursor = MCode.Result(\"select * from";
Debug.ShouldStop(64);
_cu3 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu3 = act_repfactors.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from  TblFaktor where fldShomareForoosh=0 and FldShomareFaktor="),_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))),RemoteObject.createImmutable("  And FldDate between "),act_repfactors._dateaz,RemoteObject.createImmutable(" And "),act_repfactors._dateta,RemoteObject.createImmutable(" "),_filtervaziat)));Debug.locals.put("cu3", _cu3);Debug.locals.put("cu3", _cu3);
 BA.debugLineNum = 168;BA.debugLine="If cu3.RowCount>0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_cu3.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 169;BA.debugLine="For j=0 To cu3.RowCount-1";
Debug.ShouldStop(256);
{
final int step94 = 1;
final int limit94 = RemoteObject.solve(new RemoteObject[] {_cu3.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step94 > 0 && _j <= limit94) || (step94 < 0 && _j >= limit94) ;_j = ((int)(0 + _j + step94))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 170;BA.debugLine="cu3.Position=j";
Debug.ShouldStop(512);
_cu3.runMethod(true,"setPosition",BA.numberCast(int.class, _j));
 BA.debugLineNum = 171;BA.debugLine="Dim Item2 As AdapterListFaktor";
Debug.ShouldStop(1024);
_item2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistfaktor");Debug.locals.put("Item2", _item2);
 BA.debugLineNum = 172;BA.debugLine="Item2.fldShomareForoosh=cu3.GetString(\"fldSho";
Debug.ShouldStop(2048);
_item2.setField ("fldShomareForoosh" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldShomareForoosh"))));
 BA.debugLineNum = 173;BA.debugLine="Item2.fldC_Ashkhas=cu3.GetString(\"FldC_Tafzil";
Debug.ShouldStop(4096);
_item2.setField ("fldC_Ashkhas" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Tafzili"))));
 BA.debugLineNum = 174;BA.debugLine="Item2.FldAmani=myCode.Is_Null_adad(cu3.GetStr";
Debug.ShouldStop(8192);
_item2.setField ("FldAmani" /*RemoteObject*/ ,act_repfactors.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldAmani"))))));
 BA.debugLineNum = 175;BA.debugLine="Item2.fldShomareFaktor=cu3.GetString(\"FldShom";
Debug.ShouldStop(16384);
_item2.setField ("fldShomareFaktor" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldShomareFaktor"))));
 BA.debugLineNum = 176;BA.debugLine="Item2.fldDate=MCode.PersianDateDash(cu3.GetSt";
Debug.ShouldStop(32768);
_item2.setField ("fldDate" /*RemoteObject*/ ,act_repfactors.mostCurrent._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDate"))))));
 BA.debugLineNum = 177;BA.debugLine="Item2.fldTotalFaktor=cu3.GetString(\"FldTotalF";
Debug.ShouldStop(65536);
_item2.setField ("fldTotalFaktor" /*RemoteObject*/ ,_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTotalFaktor"))));
 BA.debugLineNum = 178;BA.debugLine="If cu3.Getstring(\"FldSync\")=\"True\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldSync"))),BA.ObjectToString("True"))) { 
 BA.debugLineNum = 179;BA.debugLine="Item2.synced=True";
Debug.ShouldStop(262144);
_item2.setField ("synced" /*RemoteObject*/ ,act_repfactors.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 181;BA.debugLine="Item2.synced=False";
Debug.ShouldStop(1048576);
_item2.setField ("synced" /*RemoteObject*/ ,act_repfactors.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 184;BA.debugLine="fldTedadJozSefaresh=fldTedadJozSefaresh+cu3.G";
Debug.ShouldStop(8388608);
_fldtedadjozsefaresh = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldtedadjozsefaresh),BA.numberCast(double.class, _cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))))}, "+",1, 0));Debug.locals.put("fldTedadJozSefaresh", _fldtedadjozsefaresh);
 BA.debugLineNum = 185;BA.debugLine="fldTedadKolSefaresh=fldTedadKolSefaresh+cu3.G";
Debug.ShouldStop(16777216);
_fldtedadkolsefaresh = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fldtedadkolsefaresh),BA.numberCast(double.class, _cu3.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))))}, "+",1, 0));Debug.locals.put("fldTedadKolSefaresh", _fldtedadkolsefaresh);
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 190;BA.debugLine="SumSefaresh=SumSefaresh + myCode.Is_Null_adad(";
Debug.ShouldStop(536870912);
_sumsefaresh = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _sumsefaresh),BA.numberCast(double.class, act_repfactors.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_item2.getField(true,"fldTotalFaktor" /*RemoteObject*/ ))))}, "+",1, 0));Debug.locals.put("SumSefaresh", _sumsefaresh);
 BA.debugLineNum = 191;BA.debugLine="Item2.fldTedadJoz=fldTedadJozSefaresh";
Debug.ShouldStop(1073741824);
_item2.setField ("fldTedadJoz" /*RemoteObject*/ ,_fldtedadjozsefaresh);
 BA.debugLineNum = 192;BA.debugLine="Item2.fldTedadCarton=fldTedadKolSefaresh";
Debug.ShouldStop(-2147483648);
_item2.setField ("fldTedadCarton" /*RemoteObject*/ ,_fldtedadkolsefaresh);
 BA.debugLineNum = 193;BA.debugLine="ListFaktor.Add(Item2)";
Debug.ShouldStop(1);
act_repfactors.mostCurrent._listfaktor.runVoidMethod ("Add",(Object)((_item2)));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 202;BA.debugLine="LblSumForoosh.Text=myCode.AdadToPrice(SumForoosh)";
Debug.ShouldStop(512);
act_repfactors.mostCurrent._lblsumforoosh.runMethod(true,"setText",BA.ObjectToCharSequence(act_repfactors.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_sumforoosh))));
 BA.debugLineNum = 203;BA.debugLine="LblSumSefaresh.Text=myCode.AdadToPrice(SumSefares";
Debug.ShouldStop(1024);
act_repfactors.mostCurrent._lblsumsefaresh.runMethod(true,"setText",BA.ObjectToCharSequence(act_repfactors.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_sumsefaresh))));
 BA.debugLineNum = 204;BA.debugLine="LblSumBargasht.Text=myCode.AdadToPrice(SumBargash";
Debug.ShouldStop(2048);
act_repfactors.mostCurrent._lblsumbargasht.runMethod(true,"setText",BA.ObjectToCharSequence(act_repfactors.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_sumbargasht))));
 BA.debugLineNum = 205;BA.debugLine="LblSumKhales.Text=myCode.AdadToPrice(SumKhales)";
Debug.ShouldStop(4096);
act_repfactors.mostCurrent._lblsumkhales.runMethod(true,"setText",BA.ObjectToCharSequence(act_repfactors.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_repfactors.mostCurrent.activityBA,(Object)(_sumkhales))));
 BA.debugLineNum = 206;BA.debugLine="LblName.Text = ListFaktor.Size & \" عدد\"";
Debug.ShouldStop(8192);
act_repfactors.mostCurrent._lblname.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(act_repfactors.mostCurrent._listfaktor.runMethod(true,"getSize"),RemoteObject.createImmutable(" عدد"))));
 BA.debugLineNum = 207;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(16384);
act_repfactors.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 8;BA.debugLine="Dim Gps As GPS";
act_repfactors._gps = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 9;BA.debugLine="Dim DateAz,DateTa As String";
act_repfactors._dateaz = RemoteObject.createImmutable("");
act_repfactors._dateta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim CodeMoshtari As String";
act_repfactors._codemoshtari = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim TotalFactor As String";
act_repfactors._totalfactor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}