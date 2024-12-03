package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_pos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_pos) ","cls_pos",71,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_pos","initialize", __ref, _ba, _startingintent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize(StartingIntent As Intent)";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="Dim data As String";
Debug.ShouldStop(64);
_data = RemoteObject.createImmutable("");Debug.locals.put("data", _data);
 BA.debugLineNum = 8;BA.debugLine="data = StartingIntent.GetExtra(\"result_key\") ' در";
Debug.ShouldStop(128);
_data = BA.ObjectToString(_startingintent.runMethod(false,"GetExtra",(Object)(RemoteObject.createImmutable("result_key"))));Debug.locals.put("data", _data);
 BA.debugLineNum = 9;BA.debugLine="Log(\"Received data in service: \" & data)";
Debug.ShouldStop(256);
cls_pos.__c.runVoidMethod ("LogImpl","596862211",RemoteObject.concat(RemoteObject.createImmutable("Received data in service: "),_data),0);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
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