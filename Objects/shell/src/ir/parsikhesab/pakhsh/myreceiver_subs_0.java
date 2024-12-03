package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class myreceiver_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _receiver_receive(RemoteObject _firsttime,RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Receiver_Receive (myreceiver) ","myreceiver",97,myreceiver.processBA,myreceiver.mostCurrent,7);
if (RapidSub.canDelegate("receiver_receive")) { return ir.parsikhesab.pakhsh.myreceiver.remoteMe.runUserSub(false, "myreceiver","receiver_receive", _firsttime, _startingintent);}
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 7;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="Dim data As String";
Debug.ShouldStop(128);
_data = RemoteObject.createImmutable("");Debug.locals.put("data", _data);
 BA.debugLineNum = 9;BA.debugLine="data = StartingIntent.GetExtra(\"result_key\") ' در";
Debug.ShouldStop(256);
_data = BA.ObjectToString(_startingintent.runMethod(false,"GetExtra",(Object)(RemoteObject.createImmutable("result_key"))));Debug.locals.put("data", _data);
 BA.debugLineNum = 10;BA.debugLine="Log(\"Received data in service: \" & data)";
Debug.ShouldStop(512);
myreceiver.mostCurrent.__c.runVoidMethod ("LogImpl","5118620163",RemoteObject.concat(RemoteObject.createImmutable("Received data in service: "),_data),0);
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}