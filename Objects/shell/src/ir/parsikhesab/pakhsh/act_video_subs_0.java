package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_video_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(ir.parsikhesab.pakhsh.act_video parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_video parent;
RemoteObject _firsttime;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,22);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"l_Video\")";
Debug.ShouldStop(4194304);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_Video")),act_video.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="HLV.Initializer(\"HLV\").GridView(2).Build";
Debug.ShouldStop(8388608);
parent.mostCurrent._hlv.runMethod(false,"Initializer",act_video.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"GridView",(Object)(BA.numberCast(int.class, 2))).runVoidMethod ("Build");
 BA.debugLineNum = 25;BA.debugLine="Pnl_HLV.AddView(HLV,0,0,Pnl_HLV.Width,Pnl_HLV.Hei";
Debug.ShouldStop(16777216);
parent.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((parent.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 26;BA.debugLine="Videolist.Initialize";
Debug.ShouldStop(33554432);
parent._videolist.runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="player1.Initialize(\"player\")";
Debug.ShouldStop(67108864);
parent.mostCurrent._player1.runVoidMethod ("Initialize",act_video.processBA,(Object)(RemoteObject.createImmutable("player")));
 BA.debugLineNum = 28;BA.debugLine="Pnl_PlayVideo.Visible=False";
Debug.ShouldStop(134217728);
parent.mostCurrent._pnl_playvideo.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 29;BA.debugLine="ProgressDialogShow2(\"لطفا صبر کنید . . .\",False)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",act_video.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("لطفا صبر کنید . . .")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 30;BA.debugLine="Sleep(150)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_video.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_video", "activity_create"),BA.numberCast(int.class, 150));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 31;BA.debugLine="CallSubDelayed(Service_Server,\"GetVideoAmoozesh\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",act_video.processBA,(Object)((parent.mostCurrent._service_server.getObject())),(Object)(RemoteObject.createImmutable("GetVideoAmoozesh")));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,89);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 89;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 91;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_video.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 92;BA.debugLine="If Pnl_PlayVideo.Visible Then";
Debug.ShouldStop(134217728);
if (act_video.mostCurrent._pnl_playvideo.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 93;BA.debugLine="lblCloseV_Click";
Debug.ShouldStop(268435456);
_lblclosev_click();
 }else {
 BA.debugLineNum = 95;BA.debugLine="If player1.IsPlaying Then";
Debug.ShouldStop(1073741824);
if (act_video.mostCurrent._player1.runMethod(true,"getIsPlaying").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 96;BA.debugLine="player1.Pause";
Debug.ShouldStop(-2147483648);
act_video.mostCurrent._player1.runVoidMethod ("Pause");
 };
 BA.debugLineNum = 98;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
act_video.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 101;BA.debugLine="Return True";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) return act_video.mostCurrent.__c.getField(true,"True");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_video.processBA, e14.toString()); BA.debugLineNum = 105;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
act_video.mostCurrent.__c.runVoidMethod ("LogImpl","585917712",BA.ObjectToString(act_video.mostCurrent.__c.runMethod(false,"LastException",act_video.mostCurrent.activityBA)),0);
 BA.debugLineNum = 106;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(512);
act_video.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_video.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_video.mostCurrent.__c.runMethod(false,"LastException",act_video.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_video.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_KeyPress"))));
 };
 BA.debugLineNum = 108;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return act_video.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Pause (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,143);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 143;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="player1.Pause";
Debug.ShouldStop(32768);
act_video.mostCurrent._player1.runVoidMethod ("Pause");
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,139);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","activity_resume");}
 BA.debugLineNum = 139;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
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
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,146);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 146;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return act_video.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 149;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btn_Back_Click (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,77);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","btn_back_click");}
 BA.debugLineNum = 77;BA.debugLine="Private Sub btn_Back_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
act_video.mostCurrent._activity.runVoidMethod ("Finish");
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
 //BA.debugLineNum = 11;BA.debugLine="Private HLV As Hitex_LayoutView";
act_video.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 12;BA.debugLine="Private Pnl_HLV As Panel";
act_video.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private Pnl_PlayVideo As Panel";
act_video.mostCurrent._pnl_playvideo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private lblCloseV As Label";
act_video.mostCurrent._lblclosev = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private lblTitle As Label";
act_video.mostCurrent._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private SimpleExoPlayerView1 As SimpleExoPlayerVi";
act_video.mostCurrent._simpleexoplayerview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private player1 As SimpleExoPlayer";
act_video.mostCurrent._player1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SimpleExoPlayerWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private pnl_Video As Panel";
act_video.mostCurrent._pnl_video = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private items As AdapterListVideo";
act_video.mostCurrent._items = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistvideo");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,55);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","hlv_getitemcount");}
 BA.debugLineNum = 55;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Return Videolist.Size";
Debug.ShouldStop(8388608);
if (true) return act_video._videolist.runMethod(true,"getSize");
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_itemclick(RemoteObject _clickeditem,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_ItemClick (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,73);
if (RapidSub.canDelegate("hlv_itemclick")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","hlv_itemclick", _clickeditem, _position);}
Debug.locals.put("ClickedItem", _clickeditem);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 73;BA.debugLine="Private Sub HLV_ItemClick (ClickedItem As Panel, P";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="MCode.VideoSelected=Position";
Debug.ShouldStop(512);
act_video.mostCurrent._mcode._videoselected /*RemoteObject*/  = BA.NumberToString(_position);
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
public static RemoteObject  _hlv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_onBindViewHolder (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,66);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistvideo");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_video");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 66;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Dim Item = Videolist.Get(Position) As AdapterList";
Debug.ShouldStop(4);
_item = (act_video._videolist.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 68;BA.debugLine="Dim rec As Cls_Rec_Video=Parent.Tag";
Debug.ShouldStop(8);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 69;BA.debugLine="rec.Show(Item,Position)";
Debug.ShouldStop(16);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_video.class, "_show" /*RemoteObject*/ ,(Object)(_item),(Object)(_position));
 BA.debugLineNum = 70;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(32);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_video.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,59);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_rec_video");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 59;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Dim rec As Cls_Rec_Video";
Debug.ShouldStop(134217728);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_rec_video");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 61;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(268435456);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_video.class, "_initialize" /*RemoteObject*/ ,act_video.mostCurrent.activityBA,(Object)(act_video.getObject()));
 BA.debugLineNum = 62;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(536870912);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_video.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_video.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_video.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_rec_video.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 63;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(1073741824);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblclosev_click() throws Exception{
try {
		Debug.PushSubsStack("lblCloseV_Click (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,81);
if (RapidSub.canDelegate("lblclosev_click")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","lblclosev_click");}
 BA.debugLineNum = 81;BA.debugLine="Private Sub lblCloseV_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="MCode.AnimationClose(Pnl_PlayVideo)";
Debug.ShouldStop(131072);
act_video.mostCurrent._mcode.runVoidMethod ("_animationclose" /*RemoteObject*/ ,act_video.mostCurrent.activityBA,(Object)((act_video.mostCurrent._pnl_playvideo.getObject())));
 BA.debugLineNum = 83;BA.debugLine="Pnl_PlayVideo.Visible=False";
Debug.ShouldStop(262144);
act_video.mostCurrent._pnl_playvideo.runMethod(true,"setVisible",act_video.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 84;BA.debugLine="player1.Pause";
Debug.ShouldStop(524288);
act_video.mostCurrent._player1.runVoidMethod ("Pause");
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
public static RemoteObject  _lbldownload_click() throws Exception{
try {
		Debug.PushSubsStack("lblDownload_Click (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,151);
if (RapidSub.canDelegate("lbldownload_click")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","lbldownload_click");}
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 151;BA.debugLine="Private Sub lblDownload_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 153;BA.debugLine="Dim p1 As PhoneIntents";
Debug.ShouldStop(16777216);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 154;BA.debugLine="StartActivity(p1.OpenBrowser(items.fldLink))";
Debug.ShouldStop(33554432);
act_video.mostCurrent.__c.runVoidMethod ("StartActivity",act_video.processBA,(Object)((_p1.runMethod(false,"OpenBrowser",(Object)(act_video.mostCurrent._items.getField(true,"fldLink" /*RemoteObject*/ ))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_video.processBA, e5.toString()); BA.debugLineNum = 156;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
act_video.mostCurrent.__c.runVoidMethod ("LogImpl","586441989",BA.ObjectToString(act_video.mostCurrent.__c.runMethod(false,"LastException",act_video.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddata(RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("LoadData (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,34);
if (RapidSub.canDelegate("loaddata")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","loaddata", _lst);}
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistvideo");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 34;BA.debugLine="Sub LoadData(lst As List)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Videolist.Clear";
Debug.ShouldStop(4);
act_video._videolist.runVoidMethod ("Clear");
 BA.debugLineNum = 36;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(8);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 37;BA.debugLine="For i = 0 To lst.Size-1";
Debug.ShouldStop(16);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 38;BA.debugLine="Dim item As AdapterListVideo";
Debug.ShouldStop(32);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistvideo");Debug.locals.put("item", _item);
 BA.debugLineNum = 39;BA.debugLine="Row=lst.Get(i)";
Debug.ShouldStop(64);
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 40;BA.debugLine="item.Id=Row.Get(\"Id\")";
Debug.ShouldStop(128);
_item.setField ("Id" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Id"))))));
 BA.debugLineNum = 41;BA.debugLine="item.fldTitle=Row.Get(\"fldTitle\")";
Debug.ShouldStop(256);
_item.setField ("fldTitle" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTitle"))))));
 BA.debugLineNum = 42;BA.debugLine="item.fldLink=Row.Get(\"fldLink\")";
Debug.ShouldStop(512);
_item.setField ("fldLink" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldLink"))))));
 BA.debugLineNum = 43;BA.debugLine="item.fldDate=Row.Get(\"fldDate\")";
Debug.ShouldStop(1024);
_item.setField ("fldDate" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDate"))))));
 BA.debugLineNum = 44;BA.debugLine="item.fldTime=Row.Get(\"fldTime\")";
Debug.ShouldStop(2048);
_item.setField ("fldTime" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldTime"))))));
 BA.debugLineNum = 45;BA.debugLine="item.fldVaziat=Row.Get(\"fldVaziat\")";
Debug.ShouldStop(4096);
_item.setField ("fldVaziat" /*RemoteObject*/ ,BA.numberCast(int.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldVaziat"))))));
 BA.debugLineNum = 46;BA.debugLine="item.fldDescription=Row.Get(\"fldDescription\")";
Debug.ShouldStop(8192);
_item.setField ("fldDescription" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldDescription"))))));
 BA.debugLineNum = 47;BA.debugLine="item.fldImage=Row.Get(\"fldImage\")";
Debug.ShouldStop(16384);
_item.setField ("fldImage" /*RemoteObject*/ ,BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fldImage"))))));
 BA.debugLineNum = 48;BA.debugLine="Videolist.Add(item)";
Debug.ShouldStop(32768);
act_video._videolist.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 50;BA.debugLine="HLV.Show";
Debug.ShouldStop(131072);
act_video.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 51;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(262144);
act_video.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 52;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
act_video.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadvideo(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("LoadVideo (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,111);
if (RapidSub.canDelegate("loadvideo")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","loadvideo", _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 111;BA.debugLine="Public Sub LoadVideo(item As AdapterListVideo)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 113;BA.debugLine="items=item";
Debug.ShouldStop(65536);
act_video.mostCurrent._items = _item;
 BA.debugLineNum = 114;BA.debugLine="Pnl_PlayVideo.Visible=True";
Debug.ShouldStop(131072);
act_video.mostCurrent._pnl_playvideo.runMethod(true,"setVisible",act_video.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 115;BA.debugLine="MCode.AnimationOpen(Pnl_PlayVideo)";
Debug.ShouldStop(262144);
act_video.mostCurrent._mcode.runVoidMethod ("_animationopen" /*RemoteObject*/ ,act_video.mostCurrent.activityBA,(Object)((act_video.mostCurrent._pnl_playvideo.getObject())));
 BA.debugLineNum = 116;BA.debugLine="lblTitle.Text=item.fldTitle.Replace(\"-\",\" \")";
Debug.ShouldStop(524288);
act_video.mostCurrent._lbltitle.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"fldTitle" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable(" ")))));
 BA.debugLineNum = 117;BA.debugLine="SimpleExoPlayerView1.Player = player1 'Connect th";
Debug.ShouldStop(1048576);
act_video.mostCurrent._simpleexoplayerview1.runVoidMethod ("setPlayer",act_video.mostCurrent._player1);
 BA.debugLineNum = 118;BA.debugLine="player1.Prepare(player1.CreateUriSource(item.fld";
Debug.ShouldStop(2097152);
act_video.mostCurrent._player1.runVoidMethod ("Prepare",(Object)(act_video.mostCurrent._player1.runMethod(false,"CreateUriSource",(Object)(_item.getField(true,"fldLink" /*RemoteObject*/ )))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_video.processBA, e9.toString()); BA.debugLineNum = 121;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
act_video.mostCurrent.__c.runVoidMethod ("LogImpl","585983242",BA.ObjectToString(act_video.mostCurrent.__c.runMethod(false,"LastException",act_video.mostCurrent.activityBA)),0);
 BA.debugLineNum = 122;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(33554432);
act_video.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_video.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_video.mostCurrent.__c.runMethod(false,"LastException",act_video.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_video.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadVideo"))));
 };
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _player_complete() throws Exception{
try {
		Debug.PushSubsStack("Player_Complete (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,135);
if (RapidSub.canDelegate("player_complete")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","player_complete");}
 BA.debugLineNum = 135;BA.debugLine="Sub Player_Complete";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Log(\"complete\")";
Debug.ShouldStop(128);
act_video.mostCurrent.__c.runVoidMethod ("LogImpl","586179841",RemoteObject.createImmutable("complete"),0);
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _player_error(RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("Player_Error (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,131);
if (RapidSub.canDelegate("player_error")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","player_error", _message);}
Debug.locals.put("Message", _message);
 BA.debugLineNum = 131;BA.debugLine="Sub Player_Error (Message As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="Log(\"Error: \" & Message)";
Debug.ShouldStop(8);
act_video.mostCurrent.__c.runVoidMethod ("LogImpl","586114305",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_message),0);
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _player_ready() throws Exception{
try {
		Debug.PushSubsStack("Player_Ready (act_video) ","act_video",53,act_video.mostCurrent.activityBA,act_video.mostCurrent,126);
if (RapidSub.canDelegate("player_ready")) { return ir.parsikhesab.pakhsh.act_video.remoteMe.runUserSub(false, "act_video","player_ready");}
 BA.debugLineNum = 126;BA.debugLine="Sub Player_Ready";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="Log(\"Ready\")";
Debug.ShouldStop(1073741824);
act_video.mostCurrent.__c.runVoidMethod ("LogImpl","586048769",RemoteObject.createImmutable("Ready"),0);
 BA.debugLineNum = 128;BA.debugLine="player1.Play";
Debug.ShouldStop(-2147483648);
act_video.mostCurrent._player1.runVoidMethod ("Play");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim Videolist As List";
act_video._videolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}