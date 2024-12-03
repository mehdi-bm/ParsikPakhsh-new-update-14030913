package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class asbuttonslider_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "asbuttonslider","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 167;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 169;BA.debugLine="If xpnl_leftside.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xpnl_leftside" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),asbuttonslider.__c.getField(true,"False"))) { 
 BA.debugLineNum = 171;BA.debugLine="ini_views";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_ini_views" /*RemoteObject*/ );
 };
 BA.debugLineNum = 175;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then xpnl_le";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xbuttonorientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
__ref.getField(false,"_xpnl_leftside" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, _height)));}
else {
__ref.getField(false,"_xpnl_leftside" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))));};
 BA.debugLineNum = 176;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then xpnl_ri";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xbuttonorientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
__ref.getField(false,"_xpnl_rightside" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, _height)));}
else {
__ref.getField(false,"_xpnl_rightside" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))));};
 BA.debugLineNum = 177;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then xpnl_";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xbuttonorientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2),_height,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _height)),(Object)(BA.numberCast(int.class, _height)));}
else {
__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2),_width,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _width)));};
 BA.debugLineNum = 179;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then tmp_xpn";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xbuttonorientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
__ref.getField(false,"_tmp_xpnl_leftside" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2),(RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(3)}, "/",0, 0)),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(BA.numberCast(int.class, _height)));}
else {
__ref.getField(false,"_tmp_xpnl_leftside" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2),(RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(3)}, "/",0, 0)),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(3)}, "/",0, 0))));};
 BA.debugLineNum = 180;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then tmp_xpn";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xbuttonorientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
__ref.getField(false,"_tmp_xpnl_rightside" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(BA.numberCast(int.class, _height)));}
else {
__ref.getField(false,"_tmp_xpnl_rightside" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(3)}, "/",0, 0))));};
 BA.debugLineNum = 182;BA.debugLine="xpnl_leftside.SetColorAndBorder(xLeftTopColor,0,x";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_leftside" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_xlefttopcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 183;BA.debugLine="xpnl_rightside.SetColorAndBorder(xRightBottomColo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_rightside" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_xrightbottomcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 184;BA.debugLine="xpnl_slidebutton.SetColorAndBorder(xSliderButtonC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_xsliderbuttoncolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 185;BA.debugLine="tmp_xpnl_leftside.Color = xLeftTopColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tmp_xpnl_leftside" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_xlefttopcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 186;BA.debugLine="tmp_xpnl_rightside.Color = xRightBottomColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tmp_xpnl_rightside" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_xrightbottomcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private mEventName As String 'ignore";
asbuttonslider._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",asbuttonslider._meventname);
 //BA.debugLineNum = 26;BA.debugLine="Private mCallBack As Object 'ignore";
asbuttonslider._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",asbuttonslider._mcallback);
 //BA.debugLineNum = 27;BA.debugLine="Private mBase As B4XView 'ignore";
asbuttonslider._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",asbuttonslider._mbase);
 //BA.debugLineNum = 28;BA.debugLine="Private xui As XUI 'ignore";
asbuttonslider._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",asbuttonslider._xui);
 //BA.debugLineNum = 30;BA.debugLine="Private xpnl_leftside,xpnl_rightside,xpnl_slidebu";
asbuttonslider._xpnl_leftside = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_leftside",asbuttonslider._xpnl_leftside);
asbuttonslider._xpnl_rightside = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_rightside",asbuttonslider._xpnl_rightside);
asbuttonslider._xpnl_slidebutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_slidebutton",asbuttonslider._xpnl_slidebutton);
 //BA.debugLineNum = 31;BA.debugLine="Private tmp_xpnl_leftside,tmp_xpnl_rightside As B";
asbuttonslider._tmp_xpnl_leftside = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_tmp_xpnl_leftside",asbuttonslider._tmp_xpnl_leftside);
asbuttonslider._tmp_xpnl_rightside = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_tmp_xpnl_rightside",asbuttonslider._tmp_xpnl_rightside);
 //BA.debugLineNum = 33;BA.debugLine="Private donwx,downy As Int";
asbuttonslider._donwx = RemoteObject.createImmutable(0);__ref.setField("_donwx",asbuttonslider._donwx);
asbuttonslider._downy = RemoteObject.createImmutable(0);__ref.setField("_downy",asbuttonslider._downy);
 //BA.debugLineNum = 35;BA.debugLine="Private bReachedLeftTop,bReachedRightBottom As Bo";
asbuttonslider._breachedlefttop = RemoteObject.createImmutable(false);__ref.setField("_breachedlefttop",asbuttonslider._breachedlefttop);
asbuttonslider._breachedrightbottom = asbuttonslider.__c.getField(true,"False");__ref.setField("_breachedrightbottom",asbuttonslider._breachedrightbottom);
 //BA.debugLineNum = 38;BA.debugLine="Private xButtonOrientation As String";
asbuttonslider._xbuttonorientation = RemoteObject.createImmutable("");__ref.setField("_xbuttonorientation",asbuttonslider._xbuttonorientation);
 //BA.debugLineNum = 39;BA.debugLine="Private xLeftTopColor,xRightBottomColor,xSliderBu";
asbuttonslider._xlefttopcolor = RemoteObject.createImmutable(0);__ref.setField("_xlefttopcolor",asbuttonslider._xlefttopcolor);
asbuttonslider._xrightbottomcolor = RemoteObject.createImmutable(0);__ref.setField("_xrightbottomcolor",asbuttonslider._xrightbottomcolor);
asbuttonslider._xsliderbuttoncolor = RemoteObject.createImmutable(0);__ref.setField("_xsliderbuttoncolor",asbuttonslider._xsliderbuttoncolor);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "asbuttonslider","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 49;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 52;BA.debugLine="ini_props(Props)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_ini_props" /*RemoteObject*/ ,(Object)(_props));
 BA.debugLineNum = 56;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dropslider(RemoteObject __ref,RemoteObject _lefttop) throws Exception{
try {
		Debug.PushSubsStack("DropSlider (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("dropslider")) { return __ref.runUserSub(false, "asbuttonslider","dropslider", __ref, _lefttop);}
Debug.locals.put("LeftTop", _lefttop);
 BA.debugLineNum = 335;BA.debugLine="Private Sub DropSlider(LeftTop As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 337;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_DropSl";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DropSlider"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 338;BA.debugLine="CallSub2(mCallBack, mEventName & \"_DropSlider\",L";
Debug.JustUpdateDeviceLine();
asbuttonslider.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DropSlider"))),(Object)((_lefttop)));
 };
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbuttonorientation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getButtonOrientation (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("getbuttonorientation")) { return __ref.runUserSub(false, "asbuttonslider","getbuttonorientation", __ref);}
 BA.debugLineNum = 64;BA.debugLine="Public Sub getButtonOrientation As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="Return xButtonOrientation";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_xbuttonorientation" /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbuttonorientation_horizontal(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBUTTONORIENTATION_HORIZONTAL (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("getbuttonorientation_horizontal")) { return __ref.runUserSub(false, "asbuttonslider","getbuttonorientation_horizontal", __ref);}
 BA.debugLineNum = 84;BA.debugLine="Public Sub getBUTTONORIENTATION_HORIZONTAL As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Return \"Horizontal\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Horizontal");
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbuttonorientation_vertical(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBUTTONORIENTATION_VERTICAL (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("getbuttonorientation_vertical")) { return __ref.runUserSub(false, "asbuttonslider","getbuttonorientation_vertical", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Public Sub getBUTTONORIENTATION_VERTICAL As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="Return \"Vertical\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Vertical");
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlefttopcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeftTopColor (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("getlefttopcolor")) { return __ref.runUserSub(false, "asbuttonslider","getlefttopcolor", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Public Sub getLeftTopColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="Return xLeftTopColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_xlefttopcolor" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlefttoppnl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeftTopPnl (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("getlefttoppnl")) { return __ref.runUserSub(false, "asbuttonslider","getlefttoppnl", __ref);}
 BA.debugLineNum = 136;BA.debugLine="Public Sub getLeftTopPnl As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="Return xpnl_leftside";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_leftside" /*RemoteObject*/ );
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrightbottomcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRightBottomColor (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("getrightbottomcolor")) { return __ref.runUserSub(false, "asbuttonslider","getrightbottomcolor", __ref);}
 BA.debugLineNum = 109;BA.debugLine="Public Sub getRightBottomColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="Return xRightBottomColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_xrightbottomcolor" /*RemoteObject*/ );
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrightbottompnl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRightBottomPnl (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("getrightbottompnl")) { return __ref.runUserSub(false, "asbuttonslider","getrightbottompnl", __ref);}
 BA.debugLineNum = 143;BA.debugLine="Public Sub getRightBottomPnl As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="Return xpnl_rightside";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_rightside" /*RemoteObject*/ );
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsliderbuttoncolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSliderButtonColor (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("getsliderbuttoncolor")) { return __ref.runUserSub(false, "asbuttonslider","getsliderbuttoncolor", __ref);}
 BA.debugLineNum = 122;BA.debugLine="Public Sub getSliderButtonColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="Return xSliderButtonColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_xsliderbuttoncolor" /*RemoteObject*/ );
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsliderbuttonpnl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSliderButtonPnl (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("getsliderbuttonpnl")) { return __ref.runUserSub(false, "asbuttonslider","getsliderbuttonpnl", __ref);}
 BA.debugLineNum = 150;BA.debugLine="Public Sub getSliderButtonPnl As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="Return xpnl_slidebutton";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ );
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ini_props(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("ini_props (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("ini_props")) { return __ref.runUserSub(false, "asbuttonslider","ini_props", __ref, _props);}
Debug.locals.put("Props", _props);
 BA.debugLineNum = 158;BA.debugLine="Private Sub ini_props(Props As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="xButtonOrientation = Props.Get(\"ButtonOrientation";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xbuttonorientation" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ButtonOrientation"))))));
 BA.debugLineNum = 161;BA.debugLine="xLeftTopColor = xui.PaintOrColorToColor(Props.Get";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xlefttopcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("LeftTopColor")))))));
 BA.debugLineNum = 162;BA.debugLine="xRightBottomColor = xui.PaintOrColorToColor( Prop";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xrightbottomcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RightBottomColor")))))));
 BA.debugLineNum = 163;BA.debugLine="xSliderButtonColor = xui.PaintOrColorToColor( Pro";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xsliderbuttoncolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SliderButtonColor")))))));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ini_views(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ini_views (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("ini_views")) { return __ref.runUserSub(false, "asbuttonslider","ini_views", __ref);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 190;BA.debugLine="Private Sub ini_views";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 192;BA.debugLine="xpnl_leftside = xui.CreatePanel(\"xpnl_leftside\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_leftside" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_leftside"))));
 BA.debugLineNum = 193;BA.debugLine="xpnl_rightside = xui.CreatePanel(\"xpnl_rightside\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_rightside" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_rightside"))));
 BA.debugLineNum = 194;BA.debugLine="xpnl_slidebutton = xui.CreatePanel(\"xpnl_slidebut";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_slidebutton" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_slidebutton"))));
 BA.debugLineNum = 196;BA.debugLine="tmp_xpnl_leftside = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tmp_xpnl_leftside" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 197;BA.debugLine="tmp_xpnl_rightside = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tmp_xpnl_rightside" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 201;BA.debugLine="Private r As Reflector";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 202;BA.debugLine="r.Target = xpnl_slidebutton";
Debug.JustUpdateDeviceLine();
_r.setField ("Target",(__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 203;BA.debugLine="r.SetOnTouchListener(\"xpnl_slidebutton_Touch2\")";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("SetOnTouchListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_slidebutton_Touch2")));
 BA.debugLineNum = 206;BA.debugLine="mBase.AddView(tmp_xpnl_leftside,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tmp_xpnl_leftside" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 207;BA.debugLine="mBase.AddView(tmp_xpnl_rightside,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tmp_xpnl_rightside" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 209;BA.debugLine="mBase.AddView(xpnl_leftside,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_leftside" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 210;BA.debugLine="mBase.AddView(xpnl_rightside,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_rightside" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 211;BA.debugLine="mBase.AddView(xpnl_slidebutton,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "asbuttonslider","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 43;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 45;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lefttopclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LeftTopClick (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,359);
if (RapidSub.canDelegate("lefttopclick")) { return __ref.runUserSub(false, "asbuttonslider","lefttopclick", __ref);}
 BA.debugLineNum = 359;BA.debugLine="Private Sub LeftTopClick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 361;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_LeftTo";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_LeftTopClick"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 362;BA.debugLine="CallSub(mCallBack, mEventName & \"_LeftTopClick\")";
Debug.JustUpdateDeviceLine();
asbuttonslider.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_LeftTopClick"))));
 };
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reachedlefttop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReachedLeftTop (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("reachedlefttop")) { return __ref.runUserSub(false, "asbuttonslider","reachedlefttop", __ref);}
 BA.debugLineNum = 343;BA.debugLine="Private Sub ReachedLeftTop";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 345;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Reache";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachedLeftTop"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 346;BA.debugLine="CallSub(mCallBack, mEventName & \"_ReachedLeftTop";
Debug.JustUpdateDeviceLine();
asbuttonslider.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachedLeftTop"))));
 };
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reachedrightbottom(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReachedRightBottom (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,351);
if (RapidSub.canDelegate("reachedrightbottom")) { return __ref.runUserSub(false, "asbuttonslider","reachedrightbottom", __ref);}
 BA.debugLineNum = 351;BA.debugLine="Private Sub ReachedRightBottom";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 353;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Reache";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachedRightBottom"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 354;BA.debugLine="CallSub(mCallBack, mEventName & \"_ReachedRightBo";
Debug.JustUpdateDeviceLine();
asbuttonslider.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachedRightBottom"))));
 };
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rightbottomclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RightBottomClick (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,367);
if (RapidSub.canDelegate("rightbottomclick")) { return __ref.runUserSub(false, "asbuttonslider","rightbottomclick", __ref);}
 BA.debugLineNum = 367;BA.debugLine="Private Sub RightBottomClick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 369;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_RightB";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_RightBottomClick"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 370;BA.debugLine="CallSub(mCallBack, mEventName & \"_RightBottomCli";
Debug.JustUpdateDeviceLine();
asbuttonslider.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_RightBottomClick"))));
 };
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbuttonorientation(RemoteObject __ref,RemoteObject _orientation) throws Exception{
try {
		Debug.PushSubsStack("setButtonOrientation (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setbuttonorientation")) { return __ref.runUserSub(false, "asbuttonslider","setbuttonorientation", __ref, _orientation);}
Debug.locals.put("Orientation", _orientation);
 BA.debugLineNum = 70;BA.debugLine="Public Sub setButtonOrientation(Orientation As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="If Orientation = \"Horizontal\" Or Orientation = \"V";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_orientation,BA.ObjectToString("Horizontal")) || RemoteObject.solveBoolean("=",_orientation,BA.ObjectToString("Vertical"))) { 
 BA.debugLineNum = 74;BA.debugLine="xButtonOrientation = Orientation";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xbuttonorientation" /*RemoteObject*/ ,_orientation);
 }else {
 BA.debugLineNum = 78;BA.debugLine="xButtonOrientation = \"Horizontal\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xbuttonorientation" /*RemoteObject*/ ,BA.ObjectToString("Horizontal"));
 };
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlefttopcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setLeftTopColor (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("setlefttopcolor")) { return __ref.runUserSub(false, "asbuttonslider","setlefttopcolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 102;BA.debugLine="Public Sub setLeftTopColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="xLeftTopColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xlefttopcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 105;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrightbottomcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setRightBottomColor (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("setrightbottomcolor")) { return __ref.runUserSub(false, "asbuttonslider","setrightbottomcolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 115;BA.debugLine="Public Sub setRightBottomColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="xRightBottomColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xrightbottomcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 118;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsliderbuttoncolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setSliderButtonColor (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("setsliderbuttoncolor")) { return __ref.runUserSub(false, "asbuttonslider","setsliderbuttoncolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 128;BA.debugLine="Public Sub setSliderButtonColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="xSliderButtonColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xsliderbuttoncolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 131;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_leftside_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xpnl_leftside_Click (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("xpnl_leftside_click")) { return __ref.runUserSub(false, "asbuttonslider","xpnl_leftside_click", __ref);}
 BA.debugLineNum = 231;BA.debugLine="Private Sub xpnl_leftside_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 232;BA.debugLine="LeftTopClick";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_lefttopclick" /*RemoteObject*/ );
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_rightside_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xpnl_rightside_Click (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("xpnl_rightside_click")) { return __ref.runUserSub(false, "asbuttonslider","xpnl_rightside_click", __ref);}
 BA.debugLineNum = 235;BA.debugLine="Private Sub xpnl_rightside_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 236;BA.debugLine="RightBottomClick";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_rightbottomclick" /*RemoteObject*/ );
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_slidebutton_touch2(RemoteObject __ref,RemoteObject _o,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motion) throws Exception{
try {
		Debug.PushSubsStack("xpnl_slidebutton_Touch2 (asbuttonslider) ","asbuttonslider",108,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("xpnl_slidebutton_touch2")) { return __ref.runUserSub(false, "asbuttonslider","xpnl_slidebutton_touch2", __ref, _o, _action, _x, _y, _motion);}
Debug.locals.put("o", _o);
Debug.locals.put("ACTION", _action);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("motion", _motion);
 BA.debugLineNum = 243;BA.debugLine="Private Sub xpnl_slidebutton_Touch2 (o As Object,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 248;BA.debugLine="If xButtonOrientation = \"Horizontal\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xbuttonorientation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
 BA.debugLineNum = 250;BA.debugLine="If ACTION = xpnl_slidebutton.TOUCH_ACTION_DOWN T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 252;BA.debugLine="donwx = X";
Debug.JustUpdateDeviceLine();
__ref.setField ("_donwx" /*RemoteObject*/ ,BA.numberCast(int.class, _x));
 }else 
{ BA.debugLineNum = 254;BA.debugLine="Else if ACTION = xpnl_slidebutton.TOUCH_ACTION_M";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE")))) { 
 BA.debugLineNum = 256;BA.debugLine="If xpnl_slidebutton.Left + x - donwx + xpnl_sli";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getLeft"),_x,__ref.getField(true,"_donwx" /*RemoteObject*/ ),__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+-+",3, 0),BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")))) { 
 BA.debugLineNum = 257;BA.debugLine="xpnl_slidebutton.Left = Max(0,xpnl_slidebutton";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, asbuttonslider.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getLeft"),_x,__ref.getField(true,"_donwx" /*RemoteObject*/ )}, "+-",2, 0)))));
 }else {
 BA.debugLineNum = 259;BA.debugLine="xpnl_slidebutton.Left = Min(mBase.Width - xpnl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, asbuttonslider.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getLeft"),_x,__ref.getField(true,"_donwx" /*RemoteObject*/ ),__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+-+",3, 0)))));
 };
 BA.debugLineNum = 262;BA.debugLine="If xpnl_slidebutton.Left = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 264;BA.debugLine="If bReachedLeftTop = False Then	ReachedLeftTop";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_breachedlefttop" /*RemoteObject*/ ),asbuttonslider.__c.getField(true,"False"))) { 
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_reachedlefttop" /*RemoteObject*/ );};
 BA.debugLineNum = 265;BA.debugLine="bReachedLeftTop = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_breachedlefttop" /*RemoteObject*/ ,asbuttonslider.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 267;BA.debugLine="Else if xpnl_slidebutton.Left + xpnl_slidebutto";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 1),BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")))) { 
 BA.debugLineNum = 269;BA.debugLine="If bReachedRightBottom = False Then	ReachedRig";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_breachedrightbottom" /*RemoteObject*/ ),asbuttonslider.__c.getField(true,"False"))) { 
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_reachedrightbottom" /*RemoteObject*/ );};
 BA.debugLineNum = 270;BA.debugLine="bReachedRightBottom = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_breachedrightbottom" /*RemoteObject*/ ,asbuttonslider.__c.getField(true,"True"));
 }}
;
 }else 
{ BA.debugLineNum = 274;BA.debugLine="else If xpnl_slidebutton.TOUCH_ACTION_UP = ACTIO";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP"),BA.numberCast(double.class, _action))) { 
 BA.debugLineNum = 276;BA.debugLine="If xpnl_slidebutton.Left + xpnl_slidebutton.Wid";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0),RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))) { 
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_dropslider" /*RemoteObject*/ ,(Object)(asbuttonslider.__c.getField(true,"True")));}
else {
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_dropslider" /*RemoteObject*/ ,(Object)(asbuttonslider.__c.getField(true,"False")));};
 BA.debugLineNum = 278;BA.debugLine="xpnl_slidebutton.SetLayoutAnimated(0,mBase.Widt";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 280;BA.debugLine="bReachedLeftTop = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_breachedlefttop" /*RemoteObject*/ ,asbuttonslider.__c.getField(true,"False"));
 BA.debugLineNum = 281;BA.debugLine="bReachedRightBottom = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_breachedrightbottom" /*RemoteObject*/ ,asbuttonslider.__c.getField(true,"False"));
 }}}
;
 }else {
 BA.debugLineNum = 288;BA.debugLine="If ACTION = xpnl_slidebutton.TOUCH_ACTION_DOWN T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 290;BA.debugLine="downy  = y";
Debug.JustUpdateDeviceLine();
__ref.setField ("_downy" /*RemoteObject*/ ,BA.numberCast(int.class, _y));
 }else 
{ BA.debugLineNum = 292;BA.debugLine="Else if ACTION = xpnl_slidebutton.TOUCH_ACTION_M";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE")))) { 
 BA.debugLineNum = 294;BA.debugLine="If xpnl_slidebutton.Top + y - downy + xpnl_sli";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getTop"),_y,__ref.getField(true,"_downy" /*RemoteObject*/ ),__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+-+",3, 0),BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 295;BA.debugLine="xpnl_slidebutton.Top = Max(0,xpnl_slidebutton.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, asbuttonslider.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getTop"),_y,__ref.getField(true,"_downy" /*RemoteObject*/ )}, "+-",2, 0)))));
 }else {
 BA.debugLineNum = 297;BA.debugLine="xpnl_slidebutton.Top = Min(mBase.Height - xpnl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, asbuttonslider.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getTop"),_y,__ref.getField(true,"_downy" /*RemoteObject*/ ),__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+-+",3, 0)))));
 };
 BA.debugLineNum = 300;BA.debugLine="If xpnl_slidebutton.Top = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getTop"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 302;BA.debugLine="If bReachedLeftTop = False Then	ReachedLeftTop";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_breachedlefttop" /*RemoteObject*/ ),asbuttonslider.__c.getField(true,"False"))) { 
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_reachedlefttop" /*RemoteObject*/ );};
 BA.debugLineNum = 303;BA.debugLine="bReachedLeftTop = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_breachedlefttop" /*RemoteObject*/ ,asbuttonslider.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 305;BA.debugLine="Else if xpnl_slidebutton.Top + xpnl_slidebutton";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1),BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 307;BA.debugLine="If bReachedRightBottom = False Then	ReachedRig";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_breachedrightbottom" /*RemoteObject*/ ),asbuttonslider.__c.getField(true,"False"))) { 
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_reachedrightbottom" /*RemoteObject*/ );};
 BA.debugLineNum = 308;BA.debugLine="bReachedRightBottom = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_breachedrightbottom" /*RemoteObject*/ ,asbuttonslider.__c.getField(true,"True"));
 }}
;
 }else 
{ BA.debugLineNum = 312;BA.debugLine="else If xpnl_slidebutton.TOUCH_ACTION_UP = ACTIO";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP"),BA.numberCast(double.class, _action))) { 
 BA.debugLineNum = 314;BA.debugLine="If xpnl_slidebutton.Top + xpnl_slidebutton.Heig";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0),RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))) { 
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_dropslider" /*RemoteObject*/ ,(Object)(asbuttonslider.__c.getField(true,"True")));}
else {
__ref.runClassMethod (ir.parsikhesab.pakhsh.asbuttonslider.class, "_dropslider" /*RemoteObject*/ ,(Object)(asbuttonslider.__c.getField(true,"False")));};
 BA.debugLineNum = 318;BA.debugLine="xpnl_slidebutton.SetLayoutAnimated(0,0,mBase.He";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_slidebutton" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")));
 BA.debugLineNum = 320;BA.debugLine="bReachedLeftTop = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_breachedlefttop" /*RemoteObject*/ ,asbuttonslider.__c.getField(true,"False"));
 BA.debugLineNum = 321;BA.debugLine="bReachedRightBottom = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_breachedrightbottom" /*RemoteObject*/ ,asbuttonslider.__c.getField(true,"False"));
 }}}
;
 };
 BA.debugLineNum = 329;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return asbuttonslider.__c.getField(true,"True");
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}