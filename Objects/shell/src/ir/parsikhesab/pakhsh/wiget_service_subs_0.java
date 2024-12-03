package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class wiget_service_subs_0 {


public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (wiget_service) ","wiget_service",104,wiget_service.processBA,wiget_service.mostCurrent,22);
if (RapidSub.canDelegate("imageview1_click")) { return ir.parsikhesab.pakhsh.wiget_service.remoteMe.runUserSub(false, "wiget_service","imageview1_click");}
 BA.debugLineNum = 22;BA.debugLine="Private Sub ImageView1_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(4194304);
wiget_service.mostCurrent.__c.runVoidMethod ("StartActivity",wiget_service.processBA,(Object)((wiget_service.mostCurrent._main.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private rv As RemoteViews";
wiget_service._rv = RemoteObject.createNew ("anywheresoftware.b4a.objects.RemoteViewsWrapper");
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _receiver_receive(RemoteObject _firsttime,RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Receiver_Receive (wiget_service) ","wiget_service",104,wiget_service.processBA,wiget_service.mostCurrent,7);
if (RapidSub.canDelegate("receiver_receive")) { return ir.parsikhesab.pakhsh.wiget_service.remoteMe.runUserSub(false, "wiget_service","receiver_receive", _firsttime, _startingintent);}
Debug.locals.put("FirstTime", _firsttime);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 7;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(128);
if (_firsttime.<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 11;BA.debugLine="rv.HandleWidgetEvents(StartingIntent)";
Debug.ShouldStop(1024);
wiget_service._rv.runVoidMethod ("HandleWidgetEvents",wiget_service.processBA,(Object)((_startingintent.getObject())));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rv_requestupdate() throws Exception{
try {
		Debug.PushSubsStack("rv_RequestUpdate (wiget_service) ","wiget_service",104,wiget_service.processBA,wiget_service.mostCurrent,14);
if (RapidSub.canDelegate("rv_requestupdate")) { return ir.parsikhesab.pakhsh.wiget_service.remoteMe.runUserSub(false, "wiget_service","rv_requestupdate");}
 BA.debugLineNum = 14;BA.debugLine="Private Sub rv_RequestUpdate";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="rv.SetImage(\"ImageView1\", LoadBitmap(File.DirAsse";
Debug.ShouldStop(16384);
wiget_service._rv.runVoidMethod ("SetImage",wiget_service.processBA,(Object)(BA.ObjectToString("ImageView1")),(Object)((wiget_service.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(wiget_service.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png"))).getObject())));
 BA.debugLineNum = 19;BA.debugLine="rv.UpdateWidget";
Debug.ShouldStop(262144);
wiget_service._rv.runVoidMethod ("UpdateWidget",wiget_service.processBA);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
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