package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xmlviewex_subs_0 {


public static RemoteObject  _findview(RemoteObject _ba,RemoteObject _parent,RemoteObject _viewname) throws Exception{
try {
		Debug.PushSubsStack("FindView (xmlviewex) ","xmlviewex",105,_ba,xmlviewex.mostCurrent,32);
if (RapidSub.canDelegate("findview")) { return ir.parsikhesab.pakhsh.xmlviewex.remoteMe.runUserSub(false, "xmlviewex","findview", _ba, _parent, _viewname);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewName", _viewname);
 BA.debugLineNum = 32;BA.debugLine="Public Sub FindView(Parent As View, ViewName As St";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(1);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 35;BA.debugLine="jo = Parent";
Debug.ShouldStop(4);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _parent.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 36;BA.debugLine="Return jo.RunMethod(\"findViewById\", Array As Obje";
Debug.ShouldStop(8);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("findViewById")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_getresourceid(_ba,BA.ObjectToString("id"),_viewname))}))));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getresourceid(RemoteObject _ba,RemoteObject _restype,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("GetResourceId (xmlviewex) ","xmlviewex",105,_ba,xmlviewex.mostCurrent,111);
if (RapidSub.canDelegate("getresourceid")) { return ir.parsikhesab.pakhsh.xmlviewex.remoteMe.runUserSub(false, "xmlviewex","getresourceid", _ba, _restype, _name);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
Debug.locals.put("ResType", _restype);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 111;BA.debugLine="Private Sub GetResourceId(ResType As String, Name";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(32768);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 113;BA.debugLine="Return r.GetStaticField(Application.PackageName &";
Debug.ShouldStop(65536);
if (true) return BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(xmlviewex.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".R$"),_restype)),(Object)(_name)));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inflatexmllayout(RemoteObject _ba,RemoteObject _layout) throws Exception{
try {
		Debug.PushSubsStack("InflateXmlLayout (xmlviewex) ","xmlviewex",105,_ba,xmlviewex.mostCurrent,17);
if (RapidSub.canDelegate("inflatexmllayout")) { return ir.parsikhesab.pakhsh.xmlviewex.remoteMe.runUserSub(false, "xmlviewex","inflatexmllayout", _ba, _layout);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _id = RemoteObject.createImmutable(0);
;
Debug.locals.put("Layout", _layout);
 BA.debugLineNum = 17;BA.debugLine="Public Sub InflateXmlLayout(Layout As String) As V";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(131072);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 19;BA.debugLine="Dim id As Int";
Debug.ShouldStop(262144);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 21;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(1048576);
_r.setField ("Target",(_r.runMethod(false,"GetContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 22;BA.debugLine="r.Target = r.RunMethod2(\"getSystemService\", \"layo";
Debug.ShouldStop(2097152);
_r.setField ("Target",_r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getSystemService")),(Object)(BA.ObjectToString("layout_inflater")),(Object)(RemoteObject.createImmutable("java.lang.String"))));
 BA.debugLineNum = 24;BA.debugLine="id = r.GetStaticField(Application.PackageName & \"";
Debug.ShouldStop(8388608);
_id = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(xmlviewex.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".R$layout"))),(Object)(_layout)));Debug.locals.put("id", _id);
 BA.debugLineNum = 25;BA.debugLine="Return r.RunMethod4(\"inflate\", Array As Object(id";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _r.runMethod(false,"RunMethod4",(Object)(BA.ObjectToString("inflate")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_id),xmlviewex.mostCurrent.__c.getField(false,"Null")})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("android.view.ViewGroup")}))));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Public const VIS_VISIBLE As Int = 0";
xmlviewex._vis_visible = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 9;BA.debugLine="Public const VIS_INVISIBLE As Int = 4";
xmlviewex._vis_invisible = BA.numberCast(int.class, 4);
 //BA.debugLineNum = 10;BA.debugLine="Public const VIS_GONE As Int = 8";
xmlviewex._vis_gone = BA.numberCast(int.class, 8);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setxmlviewalpha(RemoteObject _ba,RemoteObject _targetview,RemoteObject _alpha) throws Exception{
try {
		Debug.PushSubsStack("SetXmlViewAlpha (xmlviewex) ","xmlviewex",105,_ba,xmlviewex.mostCurrent,66);
if (RapidSub.canDelegate("setxmlviewalpha")) { return ir.parsikhesab.pakhsh.xmlviewex.remoteMe.runUserSub(false, "xmlviewex","setxmlviewalpha", _ba, _targetview, _alpha);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("TargetView", _targetview);
Debug.locals.put("Alpha", _alpha);
 BA.debugLineNum = 66;BA.debugLine="Public Sub SetXmlViewAlpha(TargetView As View, Alp";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(4);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 69;BA.debugLine="jo = TargetView";
Debug.ShouldStop(16);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _targetview.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 70;BA.debugLine="jo.RunMethod(\"setAlpha\", Array As Object(Alpha))";
Debug.ShouldStop(32);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlpha")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_alpha)})));
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
public static RemoteObject  _setxmlviewcolor(RemoteObject _ba,RemoteObject _targetview,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetXmlViewColor (xmlviewex) ","xmlviewex",105,_ba,xmlviewex.mostCurrent,88);
if (RapidSub.canDelegate("setxmlviewcolor")) { return ir.parsikhesab.pakhsh.xmlviewex.remoteMe.runUserSub(false, "xmlviewex","setxmlviewcolor", _ba, _targetview, _color);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("TargetView", _targetview);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 88;BA.debugLine="Public Sub SetXmlViewColor(TargetView As View, Col";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(16777216);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 91;BA.debugLine="jo = TargetView";
Debug.ShouldStop(67108864);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _targetview.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 92;BA.debugLine="If Color = -1 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_color,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 93;BA.debugLine="jo.RunMethod(\"clearColorFilter\", Null)";
Debug.ShouldStop(268435456);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("clearColorFilter")),(Object)((xmlviewex.mostCurrent.__c.getField(false,"Null"))));
 }else {
 BA.debugLineNum = 95;BA.debugLine="jo.RunMethod(\"setColorFilter\", Array As Object(C";
Debug.ShouldStop(1073741824);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColorFilter")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_color)})));
 };
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setxmlviewimage(RemoteObject _ba,RemoteObject _targetview,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("SetXmlViewImage (xmlviewex) ","xmlviewex",105,_ba,xmlviewex.mostCurrent,103);
if (RapidSub.canDelegate("setxmlviewimage")) { return ir.parsikhesab.pakhsh.xmlviewex.remoteMe.runUserSub(false, "xmlviewex","setxmlviewimage", _ba, _targetview, _icon);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("TargetView", _targetview);
Debug.locals.put("Icon", _icon);
 BA.debugLineNum = 103;BA.debugLine="Public Sub SetXmlViewImage(TargetView As View, Ico";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(128);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 106;BA.debugLine="jo = TargetView";
Debug.ShouldStop(512);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _targetview.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 107;BA.debugLine="jo.RunMethod(\"setImageDrawable\", Array As Object(";
Debug.ShouldStop(1024);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setImageDrawable")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_icon.getObject())})));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setxmlviewtext(RemoteObject _ba,RemoteObject _targetview,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetXmlViewText (xmlviewex) ","xmlviewex",105,_ba,xmlviewex.mostCurrent,44);
if (RapidSub.canDelegate("setxmlviewtext")) { return ir.parsikhesab.pakhsh.xmlviewex.remoteMe.runUserSub(false, "xmlviewex","setxmlviewtext", _ba, _targetview, _text);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("TargetView", _targetview);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 44;BA.debugLine="Public Sub SetXmlViewText(TargetView As View, Text";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(4096);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 47;BA.debugLine="jo = TargetView";
Debug.ShouldStop(16384);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _targetview.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 48;BA.debugLine="jo.RunMethod(\"setText\", Array As Object(Text))";
Debug.ShouldStop(32768);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_text)})));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setxmlviewtextcolor(RemoteObject _ba,RemoteObject _targetview,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetXmlViewTextColor (xmlviewex) ","xmlviewex",105,_ba,xmlviewex.mostCurrent,55);
if (RapidSub.canDelegate("setxmlviewtextcolor")) { return ir.parsikhesab.pakhsh.xmlviewex.remoteMe.runUserSub(false, "xmlviewex","setxmlviewtextcolor", _ba, _targetview, _color);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("TargetView", _targetview);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 55;BA.debugLine="Public Sub SetXmlViewTextColor(TargetView As View,";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(8388608);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 58;BA.debugLine="jo = TargetView";
Debug.ShouldStop(33554432);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _targetview.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 59;BA.debugLine="jo.RunMethod(\"setTextColor\", Array As Object(Colo";
Debug.ShouldStop(67108864);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTextColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_color)})));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setxmlviewvisible(RemoteObject _ba,RemoteObject _targetview,RemoteObject _visibility) throws Exception{
try {
		Debug.PushSubsStack("SetXmlViewVisible (xmlviewex) ","xmlviewex",105,_ba,xmlviewex.mostCurrent,77);
if (RapidSub.canDelegate("setxmlviewvisible")) { return ir.parsikhesab.pakhsh.xmlviewex.remoteMe.runUserSub(false, "xmlviewex","setxmlviewvisible", _ba, _targetview, _visibility);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("TargetView", _targetview);
Debug.locals.put("Visibility", _visibility);
 BA.debugLineNum = 77;BA.debugLine="Public Sub SetXmlViewVisible(TargetView As View, V";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(8192);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 80;BA.debugLine="jo = TargetView";
Debug.ShouldStop(32768);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _targetview.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 81;BA.debugLine="jo.RunMethod(\"setVisibility\", Array As Object(Vis";
Debug.ShouldStop(65536);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVisibility")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_visibility)})));
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
}