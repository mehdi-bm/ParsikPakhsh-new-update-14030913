package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mycode_subs_0 {


public static RemoteObject  _adadtoprice(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("AdadToPrice (mycode) ","mycode",4,_ba,mycode.mostCurrent,478);
if (RapidSub.canDelegate("adadtoprice")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","adadtoprice", _ba, _str);}
RemoteObject _result = RemoteObject.createImmutable("");
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 478;BA.debugLine="Public Sub AdadToPrice(str As String) As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 479;BA.debugLine="Dim result As String";
Debug.ShouldStop(1073741824);
_result = RemoteObject.createImmutable("");Debug.locals.put("result", _result);
 BA.debugLineNum = 480;BA.debugLine="If IsNumber(str) And str>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",mycode.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_str))) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _str),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 481;BA.debugLine="result=NumberFormat2(str,0,0,0,True)&\" \"&MCode.V";
Debug.ShouldStop(1);
_result = RemoteObject.concat(mycode.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _str)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(mycode.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable(" "),mycode.mostCurrent._mcode._vahedpool /*RemoteObject*/ );Debug.locals.put("result", _result);
 }else {
 BA.debugLineNum = 483;BA.debugLine="result=0";
Debug.ShouldStop(4);
_result = BA.NumberToString(0);Debug.locals.put("result", _result);
 };
 BA.debugLineNum = 485;BA.debugLine="Return result";
Debug.ShouldStop(16);
if (true) return _result;
 BA.debugLineNum = 486;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _between(RemoteObject _ba,RemoteObject _t1,RemoteObject _t2) throws Exception{
try {
		Debug.PushSubsStack("between (mycode) ","mycode",4,_ba,mycode.mostCurrent,99);
if (RapidSub.canDelegate("between")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","between", _ba, _t1, _t2);}
RemoteObject _t = RemoteObject.createImmutable(0L);
RemoteObject _days = RemoteObject.createImmutable(0);
RemoteObject _hours = RemoteObject.createImmutable(0);
RemoteObject _minutes = RemoteObject.createImmutable(0);
;
Debug.locals.put("t1", _t1);
Debug.locals.put("t2", _t2);
 BA.debugLineNum = 99;BA.debugLine="Sub between(t1 As Long,t2 As Long) As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Dim t As Long=Abs(t1-t2)";
Debug.ShouldStop(8);
_t = BA.numberCast(long.class, mycode.mostCurrent.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_t1,_t2}, "-",1, 2)))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 101;BA.debugLine="Dim days, hours, minutes As Int";
Debug.ShouldStop(16);
_days = RemoteObject.createImmutable(0);Debug.locals.put("days", _days);
_hours = RemoteObject.createImmutable(0);Debug.locals.put("hours", _hours);
_minutes = RemoteObject.createImmutable(0);Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 102;BA.debugLine="days = Floor(t / DateTime.TicksPerDay)";
Debug.ShouldStop(32);
_days = BA.numberCast(int.class, mycode.mostCurrent.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_t,mycode.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "/",0, 0))));Debug.locals.put("days", _days);
 BA.debugLineNum = 103;BA.debugLine="hours = Floor((t Mod DateTime.TicksPerDay) / Date";
Debug.ShouldStop(64);
_hours = BA.numberCast(int.class, mycode.mostCurrent.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_t,mycode.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "%",0, 2)),mycode.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "/",0, 0))));Debug.locals.put("hours", _hours);
 BA.debugLineNum = 104;BA.debugLine="minutes = Floor((t Mod DateTime.TicksPerHour) / D";
Debug.ShouldStop(128);
_minutes = BA.numberCast(int.class, mycode.mostCurrent.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_t,mycode.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "%",0, 2)),mycode.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "/",0, 0))));Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 106;BA.debugLine="Return days&\"روز و \"&hours&\"ساعت و \"&minutes&\"دقی";
Debug.ShouldStop(512);
if (true) return RemoteObject.concat(_days,RemoteObject.createImmutable("روز و "),_hours,RemoteObject.createImmutable("ساعت و "),_minutes,RemoteObject.createImmutable("دقیقه "));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check_is_null(RemoteObject _ba,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Check_Is_Null (mycode) ","mycode",4,_ba,mycode.mostCurrent,211);
if (RapidSub.canDelegate("check_is_null")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","check_is_null", _ba, _data);}
;
Debug.locals.put("data", _data);
 BA.debugLineNum = 211;BA.debugLine="Public Sub Check_Is_Null(data As String) As Boolea";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="If (data=Null Or data=\"null\") Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("n",_data) || RemoteObject.solveBoolean("=",_data,RemoteObject.createImmutable("null")))) { 
 BA.debugLineNum = 213;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) return mycode.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 215;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) return mycode.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check_null_or_notnumber(RemoteObject _ba,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Check_Null_or_NotNumber (mycode) ","mycode",4,_ba,mycode.mostCurrent,254);
if (RapidSub.canDelegate("check_null_or_notnumber")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","check_null_or_notnumber", _ba, _data);}
;
Debug.locals.put("data", _data);
 BA.debugLineNum = 254;BA.debugLine="Public Sub Check_Null_or_NotNumber(data As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 255;BA.debugLine="If (data=Null Or IsNumber(data)=False) Then";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("n",_data) || RemoteObject.solveBoolean("=",mycode.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_data)),mycode.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 256;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) return mycode.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 258;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return mycode.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _closeactivities(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CloseActivities (mycode) ","mycode",4,_ba,mycode.mostCurrent,464);
if (RapidSub.canDelegate("closeactivities")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","closeactivities", _ba);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
 BA.debugLineNum = 464;BA.debugLine="Sub CloseActivities";
Debug.ShouldStop(32768);
 BA.debugLineNum = 465;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(65536);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 466;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(131072);
_jo.runVoidMethod ("InitializeContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 467;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
Debug.ShouldStop(262144);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("finishAffinity")),(Object)((mycode.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 468;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletecash(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("DeleteCash (mycode) ","mycode",4,_ba,mycode.mostCurrent,177);
if (RapidSub.canDelegate("deletecash")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","deletecash", _ba);}
;
 BA.debugLineNum = 177;BA.debugLine="Sub DeleteCash";
Debug.ShouldStop(65536);
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadimage(RemoteObject _ba,RemoteObject _link,RemoteObject _ph) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage (mycode) ","mycode",4,_ba,mycode.mostCurrent,313);
if (RapidSub.canDelegate("downloadimage")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","downloadimage", _ba, _link, _ph);}
RemoteObject _glide = RemoteObject.declareNull("com.glide.Hitex_Glide");
RemoteObject _lowercaselink = RemoteObject.createImmutable("");
;
Debug.locals.put("Link", _link);
Debug.locals.put("ph", _ph);
 BA.debugLineNum = 313;BA.debugLine="Public Sub DownloadImage(Link As String,ph As Imag";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="Dim Glide As Hitex_Glide";
Debug.ShouldStop(33554432);
_glide = RemoteObject.createNew ("com.glide.Hitex_Glide");Debug.locals.put("Glide", _glide);
 BA.debugLineNum = 316;BA.debugLine="Glide.Get.ClearDiskCache";
Debug.ShouldStop(134217728);
_glide.runMethod(false,"Get",_ba).runVoidMethod ("ClearDiskCache");
 BA.debugLineNum = 317;BA.debugLine="Glide.Get.ClearMemory";
Debug.ShouldStop(268435456);
_glide.runMethod(false,"Get",_ba).runVoidMethod ("ClearMemory",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 318;BA.debugLine="Dim LowerCaseLink As String = Link.ToLowerCase";
Debug.ShouldStop(536870912);
_lowercaselink = _link.runMethod(true,"toLowerCase");Debug.locals.put("LowerCaseLink", _lowercaselink);Debug.locals.put("LowerCaseLink", _lowercaselink);
 BA.debugLineNum = 319;BA.debugLine="If LowerCaseLink.Contains(\"jpg\") Or LowerCaseLink";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(".",_lowercaselink.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("jpg")))) || RemoteObject.solveBoolean(".",_lowercaselink.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("jpeg")))) || RemoteObject.solveBoolean(".",_lowercaselink.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("png"))))) { 
 }else {
 };
 BA.debugLineNum = 325;BA.debugLine="ph.Tag=Null";
Debug.ShouldStop(16);
_ph.runMethod(false,"setTag",mycode.mostCurrent.__c.getField(false,"Null"));
 BA.debugLineNum = 326;BA.debugLine="Log(\"show= \" & Link)";
Debug.ShouldStop(32);
mycode.mostCurrent.__c.runVoidMethod ("LogImpl","518874381",RemoteObject.concat(RemoteObject.createImmutable("show= "),_link),0);
 BA.debugLineNum = 330;BA.debugLine="Glide.Load2(Link).Apply(Glide.RequestOptions.Plac";
Debug.ShouldStop(512);
_glide.runMethod(false,"Load2",_ba,(Object)(_link)).runMethod(false,"Apply",(Object)(_glide.runMethod(false,"getRequestOptions").runMethod(false,"Placeholder",(Object)(mycode.mostCurrent._mcode._placeholder /*RemoteObject*/ )))).runMethod(false,"Apply",(Object)(_glide.runMethod(false,"getRO").runMethod(false,"FitCenter"))).runVoidMethod ("Into",(Object)(_ph));
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadimage2(RemoteObject _ba,RemoteObject _link,RemoteObject _ph) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage2 (mycode) ","mycode",4,_ba,mycode.mostCurrent,378);
if (RapidSub.canDelegate("downloadimage2")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","downloadimage2", _ba, _link, _ph);}
RemoteObject _pic = RemoteObject.declareNull("uk.co.martinpearman.b4a.squareup.picasso.Picasso");
;
Debug.locals.put("Link", _link);
Debug.locals.put("ph", _ph);
 BA.debugLineNum = 378;BA.debugLine="Public Sub DownloadImage2(Link As String,ph As Ima";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 380;BA.debugLine="Dim pic As Picasso";
Debug.ShouldStop(134217728);
_pic = RemoteObject.createNew ("uk.co.martinpearman.b4a.squareup.picasso.Picasso");Debug.locals.put("pic", _pic);
 BA.debugLineNum = 384;BA.debugLine="ph.Tag=Null";
Debug.ShouldStop(-2147483648);
_ph.runMethod(false,"setTag",mycode.mostCurrent.__c.getField(false,"Null"));
 BA.debugLineNum = 385;BA.debugLine="Log(\"show= \" & Link)";
Debug.ShouldStop(1);
mycode.mostCurrent.__c.runVoidMethod ("LogImpl","519005447",RemoteObject.concat(RemoteObject.createImmutable("show= "),_link),0);
 BA.debugLineNum = 387;BA.debugLine="pic.Initialize";
Debug.ShouldStop(4);
_pic.runVoidMethod ("Initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 388;BA.debugLine="pic.LoadUrl(Link).IntoImageView(ph)";
Debug.ShouldStop(8);
_pic.runMethod(false,"LoadUrl",(Object)(_link)).runVoidMethod ("IntoImageView",(Object)((_ph.getObject())));
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadimage3(RemoteObject _ba,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage3 (mycode) ","mycode",4,_ba,mycode.mostCurrent,398);
if (RapidSub.canDelegate("downloadimage3")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","downloadimage3", _ba, _link);}
RemoteObject _glide = RemoteObject.declareNull("com.glide.Hitex_Glide");
RemoteObject _ph = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _lowercaselink = RemoteObject.createImmutable("");
;
Debug.locals.put("Link", _link);
 BA.debugLineNum = 398;BA.debugLine="Public Sub DownloadImage3(Link As String) As Image";
Debug.ShouldStop(8192);
 BA.debugLineNum = 399;BA.debugLine="Dim Glide As Hitex_Glide";
Debug.ShouldStop(16384);
_glide = RemoteObject.createNew ("com.glide.Hitex_Glide");Debug.locals.put("Glide", _glide);
 BA.debugLineNum = 400;BA.debugLine="Dim ph As ImageView";
Debug.ShouldStop(32768);
_ph = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("ph", _ph);
 BA.debugLineNum = 401;BA.debugLine="ph.Initialize(\"ph\")";
Debug.ShouldStop(65536);
_ph.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("ph")));
 BA.debugLineNum = 404;BA.debugLine="Dim LowerCaseLink As String = Link.ToLowerCase";
Debug.ShouldStop(524288);
_lowercaselink = _link.runMethod(true,"toLowerCase");Debug.locals.put("LowerCaseLink", _lowercaselink);Debug.locals.put("LowerCaseLink", _lowercaselink);
 BA.debugLineNum = 405;BA.debugLine="If LowerCaseLink.Contains(\"jpg\") Or LowerCaseLink";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(".",_lowercaselink.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("jpg")))) || RemoteObject.solveBoolean(".",_lowercaselink.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("jpeg")))) || RemoteObject.solveBoolean(".",_lowercaselink.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("png"))))) { 
 BA.debugLineNum = 406;BA.debugLine="ph.Tag=Null";
Debug.ShouldStop(2097152);
_ph.runMethod(false,"setTag",mycode.mostCurrent.__c.getField(false,"Null"));
 BA.debugLineNum = 407;BA.debugLine="Log(\"show= \" & Link)";
Debug.ShouldStop(4194304);
mycode.mostCurrent.__c.runVoidMethod ("LogImpl","519070985",RemoteObject.concat(RemoteObject.createImmutable("show= "),_link),0);
 BA.debugLineNum = 408;BA.debugLine="Glide.Load2(Link).Apply(Glide.RequestOptions).Ap";
Debug.ShouldStop(8388608);
_glide.runMethod(false,"Load2",_ba,(Object)(_link)).runMethod(false,"Apply",(Object)(_glide.runMethod(false,"getRequestOptions"))).runMethod(false,"Apply",(Object)(_glide.runMethod(false,"getRO").runMethod(false,"FitCenter"))).runVoidMethod ("Into",(Object)(_ph));
 };
 BA.debugLineNum = 410;BA.debugLine="Return ph";
Debug.ShouldStop(33554432);
if (true) return _ph;
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadimage5(RemoteObject _ba,RemoteObject _codekala,RemoteObject _fldpathpic,RemoteObject _ph) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage5 (mycode) ","mycode",4,_ba,mycode.mostCurrent,333);
if (RapidSub.canDelegate("downloadimage5")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","downloadimage5", _ba, _codekala, _fldpathpic, _ph);}
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _links = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("CodeKala", _codekala);
Debug.locals.put("fldPathPic", _fldpathpic);
Debug.locals.put("ph", _ph);
 BA.debugLineNum = 333;BA.debugLine="Public Sub DownloadImage5(CodeKala As String,fldPa";
Debug.ShouldStop(4096);
 BA.debugLineNum = 334;BA.debugLine="Dim Link As String";
Debug.ShouldStop(8192);
_link = RemoteObject.createImmutable("");Debug.locals.put("Link", _link);
 BA.debugLineNum = 335;BA.debugLine="Log(\"CodeKala \"& CodeKala)";
Debug.ShouldStop(16384);
mycode.mostCurrent.__c.runVoidMethod ("LogImpl","518939906",RemoteObject.concat(RemoteObject.createImmutable("CodeKala "),_codekala),0);
 BA.debugLineNum = 336;BA.debugLine="If MCode.PicOnline=1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",mycode.mostCurrent._mcode._piconline /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 338;BA.debugLine="Dim filename As String=CodeKala & \".jpg\"";
Debug.ShouldStop(131072);
_filename = RemoteObject.concat(_codekala,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 339;BA.debugLine="If fldPathPic=\"0\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_fldpathpic,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 342;BA.debugLine="If File.Exists(File.DirDefaultExternal&\"/Parsik";
Debug.ShouldStop(2097152);
if (mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/AksKala"))),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 343;BA.debugLine="File.Delete(File.DirDefaultExternal&\"/Parsik/A";
Debug.ShouldStop(4194304);
mycode.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(RemoteObject.concat(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/AksKala"))),(Object)(_filename));
 };
 BA.debugLineNum = 345;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(CodeKala)";
Debug.ShouldStop(16777216);
mycode.mostCurrent._mcode._placeholder /*RemoteObject*/  = mycode.mostCurrent._mcode.runMethod(false,"_getpickala" /*RemoteObject*/ ,_ba,(Object)(_codekala));
 BA.debugLineNum = 346;BA.debugLine="ph.Bitmap=MCode.placeHolder";
Debug.ShouldStop(33554432);
_ph.runMethod(false,"setBitmap",(mycode.mostCurrent._mcode._placeholder /*RemoteObject*/ .getObject()));
 }else {
 BA.debugLineNum = 348;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(134217728);
if (mycode.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,_ba).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 349;BA.debugLine="If File.Exists(File.DirDefaultExternal&\"/Parsi";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/AksKala"))),(Object)(_filename)),mycode.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 350;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(CodeKala)";
Debug.ShouldStop(536870912);
mycode.mostCurrent._mcode._placeholder /*RemoteObject*/  = mycode.mostCurrent._mcode.runMethod(false,"_getpickala" /*RemoteObject*/ ,_ba,(Object)(_codekala));
 BA.debugLineNum = 351;BA.debugLine="ph.Bitmap=MCode.placeHolder";
Debug.ShouldStop(1073741824);
_ph.runMethod(false,"setBitmap",(mycode.mostCurrent._mcode._placeholder /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 352;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 357;BA.debugLine="Link=MCode.ImageUrl &fldPathPic";
Debug.ShouldStop(16);
_link = RemoteObject.concat(mycode.mostCurrent._mcode._imageurl /*RemoteObject*/ ,_fldpathpic);Debug.locals.put("Link", _link);
 BA.debugLineNum = 358;BA.debugLine="Log(\"Link= \" & MCode.ImageUrl & fldPathPic)";
Debug.ShouldStop(32);
mycode.mostCurrent.__c.runVoidMethod ("LogImpl","518939929",RemoteObject.concat(RemoteObject.createImmutable("Link= "),mycode.mostCurrent._mcode._imageurl /*RemoteObject*/ ,_fldpathpic),0);
 BA.debugLineNum = 360;BA.debugLine="Dim links As Map";
Debug.ShouldStop(128);
_links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("links", _links);
 BA.debugLineNum = 361;BA.debugLine="links.Initialize";
Debug.ShouldStop(256);
_links.runVoidMethod ("Initialize");
 BA.debugLineNum = 362;BA.debugLine="links.Put(ph, Link)";
Debug.ShouldStop(512);
_links.runVoidMethod ("Put",(Object)((_ph.getObject())),(Object)((_link)));
 BA.debugLineNum = 363;BA.debugLine="MCode.CodeKalaImage=CodeKala";
Debug.ShouldStop(1024);
mycode.mostCurrent._mcode._codekalaimage /*RemoteObject*/  = _codekala;
 BA.debugLineNum = 364;BA.debugLine="CallSubDelayed2(ImageDownloader, \"Download\", l";
Debug.ShouldStop(2048);
mycode.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((mycode.mostCurrent._imagedownloader.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_links)));
 BA.debugLineNum = 365;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(CodeKala)";
Debug.ShouldStop(4096);
mycode.mostCurrent._mcode._placeholder /*RemoteObject*/  = mycode.mostCurrent._mcode.runMethod(false,"_getpickala" /*RemoteObject*/ ,_ba,(Object)(_codekala));
 BA.debugLineNum = 366;BA.debugLine="ph.Bitmap=MCode.placeHolder";
Debug.ShouldStop(8192);
_ph.runMethod(false,"setBitmap",(mycode.mostCurrent._mcode._placeholder /*RemoteObject*/ .getObject()));
 }else {
 BA.debugLineNum = 368;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(CodeKala)";
Debug.ShouldStop(32768);
mycode.mostCurrent._mcode._placeholder /*RemoteObject*/  = mycode.mostCurrent._mcode.runMethod(false,"_getpickala" /*RemoteObject*/ ,_ba,(Object)(_codekala));
 BA.debugLineNum = 369;BA.debugLine="ph.Bitmap=MCode.placeHolder";
Debug.ShouldStop(65536);
_ph.runMethod(false,"setBitmap",(mycode.mostCurrent._mcode._placeholder /*RemoteObject*/ .getObject()));
 };
 };
 }else {
 BA.debugLineNum = 374;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(CodeKala)";
Debug.ShouldStop(2097152);
mycode.mostCurrent._mcode._placeholder /*RemoteObject*/  = mycode.mostCurrent._mcode.runMethod(false,"_getpickala" /*RemoteObject*/ ,_ba,(Object)(_codekala));
 BA.debugLineNum = 375;BA.debugLine="ph.Bitmap=MCode.placeHolder";
Debug.ShouldStop(4194304);
_ph.runMethod(false,"setBitmap",(mycode.mostCurrent._mcode._placeholder /*RemoteObject*/ .getObject()));
 };
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbytefrombitmap(RemoteObject _ba,RemoteObject _img,RemoteObject _quality) throws Exception{
try {
		Debug.PushSubsStack("GetByteFromBitmap (mycode) ","mycode",4,_ba,mycode.mostCurrent,156);
if (RapidSub.canDelegate("getbytefrombitmap")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","getbytefrombitmap", _ba, _img, _quality);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _data = null;
;
Debug.locals.put("img", _img);
Debug.locals.put("Quality", _quality);
 BA.debugLineNum = 156;BA.debugLine="Sub GetByteFromBitmap(img As Bitmap, Quality As In";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(268435456);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 158;BA.debugLine="Dim data() As Byte";
Debug.ShouldStop(536870912);
_data = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 159;BA.debugLine="out.InitializeToBytesArray(1)";
Debug.ShouldStop(1073741824);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 160;BA.debugLine="img.WriteToStream(out,Quality,\"JPEG\")";
Debug.ShouldStop(-2147483648);
_img.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(_quality),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 161;BA.debugLine="data = out.ToBytesArray";
Debug.ShouldStop(1);
_data = _out.runMethod(false,"ToBytesArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 162;BA.debugLine="out.Close";
Debug.ShouldStop(2);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 163;BA.debugLine="Return data";
Debug.ShouldStop(4);
if (true) return _data;
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnametafsilibycode(RemoteObject _ba,RemoteObject _code) throws Exception{
try {
		Debug.PushSubsStack("GetNameTafsiliByCode (mycode) ","mycode",4,_ba,mycode.mostCurrent,413);
if (RapidSub.canDelegate("getnametafsilibycode")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","getnametafsilibycode", _ba, _code);}
RemoteObject _name = RemoteObject.createImmutable("");
;
Debug.locals.put("code", _code);
 BA.debugLineNum = 413;BA.debugLine="Public Sub GetNameTafsiliByCode(code As String)As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 414;BA.debugLine="Dim name As String";
Debug.ShouldStop(536870912);
_name = RemoteObject.createImmutable("");Debug.locals.put("name", _name);
 BA.debugLineNum = 415;BA.debugLine="name=MCode.SingleResult(\"select fldSharheTafzili";
Debug.ShouldStop(1073741824);
_name = BA.ObjectToString(mycode.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,_ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select fldSharheTafzili from TblAshkhas where fldCodetafzili="),_code))));Debug.locals.put("name", _name);
 BA.debugLineNum = 416;BA.debugLine="Return name";
Debug.ShouldStop(-2147483648);
if (true) return _name;
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpathpicbycodekala(RemoteObject _ba,RemoteObject _codekala) throws Exception{
try {
		Debug.PushSubsStack("GetPathPicByCodeKala (mycode) ","mycode",4,_ba,mycode.mostCurrent,419);
if (RapidSub.canDelegate("getpathpicbycodekala")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","getpathpicbycodekala", _ba, _codekala);}
RemoteObject _path = RemoteObject.createImmutable("");
;
Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 419;BA.debugLine="Public Sub GetPathPicByCodeKala(CodeKala As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 420;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 421;BA.debugLine="If File.Exists(File.DirDefaultExternal &\"/Parsik";
Debug.ShouldStop(16);
if (mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/AksKala"))),(Object)(RemoteObject.concat(_codekala,RemoteObject.createImmutable(".jpg")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 422;BA.debugLine="Dim path As String=File.Combine(File.DirDefault";
Debug.ShouldStop(32);
_path = mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/AksKala"))),(Object)(RemoteObject.concat(_codekala,RemoteObject.createImmutable(".jpg"))));Debug.locals.put("path", _path);Debug.locals.put("path", _path);
 BA.debugLineNum = 423;BA.debugLine="Return path";
Debug.ShouldStop(64);
Debug.CheckDeviceExceptions();if (true) return _path;
 }else {
 BA.debugLineNum = 425;BA.debugLine="Return \"0\"";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("0");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e9.toString()); BA.debugLineNum = 429;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
mycode.mostCurrent.__c.runVoidMethod ("LogImpl","519202058",BA.ObjectToString(mycode.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 430;BA.debugLine="Return \"0\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("0");
 };
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsetting(RemoteObject _ba,RemoteObject _sfilename,RemoteObject _skey,RemoteObject _sdefault) throws Exception{
try {
		Debug.PushSubsStack("getSetting (mycode) ","mycode",4,_ba,mycode.mostCurrent,122);
if (RapidSub.canDelegate("getsetting")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","getsetting", _ba, _sfilename, _skey, _sdefault);}
RemoteObject _m1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("sFilename", _sfilename);
Debug.locals.put("sKey", _skey);
Debug.locals.put("sDefault", _sdefault);
 BA.debugLineNum = 122;BA.debugLine="Sub getSetting(sFilename As String,sKey As String,";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Dim m1 As Map";
Debug.ShouldStop(67108864);
_m1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m1", _m1);
 BA.debugLineNum = 124;BA.debugLine="m1.Initialize";
Debug.ShouldStop(134217728);
_m1.runVoidMethod ("Initialize");
 BA.debugLineNum = 125;BA.debugLine="If File.Exists(File.DirInternalCache,sFilename) =";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_sfilename)),mycode.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 126;BA.debugLine="m1 = File.ReadMap(File.DirInternalCache,sFilena";
Debug.ShouldStop(536870912);
_m1 = mycode.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_sfilename));Debug.locals.put("m1", _m1);
 }else {
 BA.debugLineNum = 128;BA.debugLine="Return sDefault";
Debug.ShouldStop(-2147483648);
if (true) return _sdefault;
 };
 BA.debugLineNum = 130;BA.debugLine="If m1.ContainsKey(sKey) = True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_m1.runMethod(true,"ContainsKey",(Object)((_skey))),mycode.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 131;BA.debugLine="Return BytesToString( b64.DecodeBase64(m1.get(sK";
Debug.ShouldStop(4);
if (true) return mycode.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(mycode._b64.runMethod(false,"DecodeBase64",(Object)(BA.ObjectToString(_m1.runMethod(false,"Get",(Object)((_skey))))))),(Object)(BA.numberCast(int.class, 0)),(Object)(mycode._b64.runMethod(false,"DecodeBase64",(Object)(BA.ObjectToString(_m1.runMethod(false,"Get",(Object)((_skey)))))).getField(true,"length")),(Object)(RemoteObject.createImmutable("UTF-8")));
 }else {
 BA.debugLineNum = 133;BA.debugLine="Return sDefault";
Debug.ShouldStop(16);
if (true) return _sdefault;
 };
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gregorian_to_jalali(RemoteObject _ba,RemoteObject _dt) throws Exception{
try {
		Debug.PushSubsStack("gregorian_to_jalali (mycode) ","mycode",4,_ba,mycode.mostCurrent,12);
if (RapidSub.canDelegate("gregorian_to_jalali")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","gregorian_to_jalali", _ba, _dt);}
RemoteObject _g_y = RemoteObject.createImmutable("");
RemoteObject _g_m = RemoteObject.createImmutable("");
RemoteObject _g_d = RemoteObject.createImmutable("");
RemoteObject _gy = RemoteObject.createImmutable(0);
RemoteObject _gm = RemoteObject.createImmutable(0);
RemoteObject _gd = RemoteObject.createImmutable(0);
RemoteObject _g_day_no = RemoteObject.createImmutable(0);
RemoteObject _k = null;
RemoteObject _g_days_in_month = null;
RemoteObject _j_days_in_month = null;
int _i = 0;
RemoteObject _j_day_no = RemoteObject.createImmutable(0);
RemoteObject _j_np = RemoteObject.createImmutable(0);
RemoteObject _jy = RemoteObject.createImmutable(0);
RemoteObject _jm = RemoteObject.createImmutable(0);
RemoteObject _jd = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable("");
;
Debug.locals.put("dt", _dt);
 BA.debugLineNum = 12;BA.debugLine="Sub gregorian_to_jalali(dt As String) As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="Dim g_y,g_m,g_d As String";
Debug.ShouldStop(4096);
_g_y = RemoteObject.createImmutable("");Debug.locals.put("g_y", _g_y);
_g_m = RemoteObject.createImmutable("");Debug.locals.put("g_m", _g_m);
_g_d = RemoteObject.createImmutable("");Debug.locals.put("g_d", _g_d);
 BA.debugLineNum = 14;BA.debugLine="Dim gy,gm,gd,g_day_no As Int";
Debug.ShouldStop(8192);
_gy = RemoteObject.createImmutable(0);Debug.locals.put("gy", _gy);
_gm = RemoteObject.createImmutable(0);Debug.locals.put("gm", _gm);
_gd = RemoteObject.createImmutable(0);Debug.locals.put("gd", _gd);
_g_day_no = RemoteObject.createImmutable(0);Debug.locals.put("g_day_no", _g_day_no);
 BA.debugLineNum = 15;BA.debugLine="Dim k() As String";
Debug.ShouldStop(16384);
_k = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("k", _k);
 BA.debugLineNum = 16;BA.debugLine="k = Regex.Split(\"/\",dt)";
Debug.ShouldStop(32768);
_k = mycode.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(_dt));Debug.locals.put("k", _k);
 BA.debugLineNum = 17;BA.debugLine="g_y = k(0)";
Debug.ShouldStop(65536);
_g_y = _k.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("g_y", _g_y);
 BA.debugLineNum = 18;BA.debugLine="g_m = k(1)";
Debug.ShouldStop(131072);
_g_m = _k.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("g_m", _g_m);
 BA.debugLineNum = 19;BA.debugLine="g_d = k(2)";
Debug.ShouldStop(262144);
_g_d = _k.getArrayElement(true,BA.numberCast(int.class, 2));Debug.locals.put("g_d", _g_d);
 BA.debugLineNum = 20;BA.debugLine="Dim g_days_in_month(12) As Int";
Debug.ShouldStop(524288);
_g_days_in_month = RemoteObject.createNewArray ("int", new int[] {12}, new Object[]{});Debug.locals.put("g_days_in_month", _g_days_in_month);
 BA.debugLineNum = 21;BA.debugLine="Dim j_days_in_month(12) As Int";
Debug.ShouldStop(1048576);
_j_days_in_month = RemoteObject.createNewArray ("int", new int[] {12}, new Object[]{});Debug.locals.put("j_days_in_month", _j_days_in_month);
 BA.debugLineNum = 22;BA.debugLine="g_days_in_month(0) = 31";
Debug.ShouldStop(2097152);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 0));
 BA.debugLineNum = 23;BA.debugLine="g_days_in_month(1) = 28";
Debug.ShouldStop(4194304);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 28),BA.numberCast(int.class, 1));
 BA.debugLineNum = 24;BA.debugLine="g_days_in_month(2) = 31";
Debug.ShouldStop(8388608);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 2));
 BA.debugLineNum = 25;BA.debugLine="g_days_in_month(3) = 30";
Debug.ShouldStop(16777216);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 30),BA.numberCast(int.class, 3));
 BA.debugLineNum = 26;BA.debugLine="g_days_in_month(4) = 31";
Debug.ShouldStop(33554432);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 4));
 BA.debugLineNum = 27;BA.debugLine="g_days_in_month(5) = 30";
Debug.ShouldStop(67108864);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 30),BA.numberCast(int.class, 5));
 BA.debugLineNum = 28;BA.debugLine="g_days_in_month(6) = 31";
Debug.ShouldStop(134217728);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 6));
 BA.debugLineNum = 29;BA.debugLine="g_days_in_month(7) = 31";
Debug.ShouldStop(268435456);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 7));
 BA.debugLineNum = 30;BA.debugLine="g_days_in_month(8) = 30";
Debug.ShouldStop(536870912);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 30),BA.numberCast(int.class, 8));
 BA.debugLineNum = 31;BA.debugLine="g_days_in_month(9) = 31";
Debug.ShouldStop(1073741824);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 9));
 BA.debugLineNum = 32;BA.debugLine="g_days_in_month(10)= 30";
Debug.ShouldStop(-2147483648);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 30),BA.numberCast(int.class, 10));
 BA.debugLineNum = 33;BA.debugLine="g_days_in_month(11)= 31";
Debug.ShouldStop(1);
_g_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 11));
 BA.debugLineNum = 35;BA.debugLine="j_days_in_month(0) = 31";
Debug.ShouldStop(4);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 0));
 BA.debugLineNum = 36;BA.debugLine="j_days_in_month(1) = 31";
Debug.ShouldStop(8);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 1));
 BA.debugLineNum = 37;BA.debugLine="j_days_in_month(2) = 31";
Debug.ShouldStop(16);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 2));
 BA.debugLineNum = 38;BA.debugLine="j_days_in_month(3) = 31";
Debug.ShouldStop(32);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 3));
 BA.debugLineNum = 39;BA.debugLine="j_days_in_month(4) = 31";
Debug.ShouldStop(64);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 4));
 BA.debugLineNum = 40;BA.debugLine="j_days_in_month(5) = 31";
Debug.ShouldStop(128);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 31),BA.numberCast(int.class, 5));
 BA.debugLineNum = 41;BA.debugLine="j_days_in_month(6) = 30";
Debug.ShouldStop(256);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 30),BA.numberCast(int.class, 6));
 BA.debugLineNum = 42;BA.debugLine="j_days_in_month(7) = 30";
Debug.ShouldStop(512);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 30),BA.numberCast(int.class, 7));
 BA.debugLineNum = 43;BA.debugLine="j_days_in_month(8) = 30";
Debug.ShouldStop(1024);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 30),BA.numberCast(int.class, 8));
 BA.debugLineNum = 44;BA.debugLine="j_days_in_month(9) = 30";
Debug.ShouldStop(2048);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 30),BA.numberCast(int.class, 9));
 BA.debugLineNum = 45;BA.debugLine="j_days_in_month(10)= 30";
Debug.ShouldStop(4096);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 30),BA.numberCast(int.class, 10));
 BA.debugLineNum = 46;BA.debugLine="j_days_in_month(11)= 29";
Debug.ShouldStop(8192);
_j_days_in_month.setArrayElement (BA.numberCast(int.class, 29),BA.numberCast(int.class, 11));
 BA.debugLineNum = 48;BA.debugLine="gy = g_y - 1600";
Debug.ShouldStop(32768);
_gy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _g_y),RemoteObject.createImmutable(1600)}, "-",1, 0));Debug.locals.put("gy", _gy);
 BA.debugLineNum = 49;BA.debugLine="gm = g_m - 1";
Debug.ShouldStop(65536);
_gm = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _g_m),RemoteObject.createImmutable(1)}, "-",1, 0));Debug.locals.put("gm", _gm);
 BA.debugLineNum = 50;BA.debugLine="gd = g_d - 1";
Debug.ShouldStop(131072);
_gd = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _g_d),RemoteObject.createImmutable(1)}, "-",1, 0));Debug.locals.put("gd", _gd);
 BA.debugLineNum = 52;BA.debugLine="g_day_no = 365 * gy + ((gy + 3) / 4) - ((gy + 99";
Debug.ShouldStop(524288);
_g_day_no = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(365),_gy,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_gy,RemoteObject.createImmutable(3)}, "+",1, 1)),RemoteObject.createImmutable(4)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_gy,RemoteObject.createImmutable(99)}, "+",1, 1)),RemoteObject.createImmutable(100)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_gy,RemoteObject.createImmutable(399)}, "+",1, 1)),RemoteObject.createImmutable(400)}, "/",0, 0))}, "*+-+",3, 0));Debug.locals.put("g_day_no", _g_day_no);
 BA.debugLineNum = 54;BA.debugLine="For i = 0 To gm - 1";
Debug.ShouldStop(2097152);
{
final int step38 = 1;
final int limit38 = RemoteObject.solve(new RemoteObject[] {_gm,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step38 > 0 && _i <= limit38) || (step38 < 0 && _i >= limit38) ;_i = ((int)(0 + _i + step38))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 55;BA.debugLine="g_day_no = g_day_no + g_days_in_month(i)";
Debug.ShouldStop(4194304);
_g_day_no = RemoteObject.solve(new RemoteObject[] {_g_day_no,_g_days_in_month.getArrayElement(true,BA.numberCast(int.class, _i))}, "+",1, 1);Debug.locals.put("g_day_no", _g_day_no);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 60;BA.debugLine="If gm > 1 And ((gy Mod 4 = 0 And gy Mod 100 <> 0";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_gm,BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_gy,RemoteObject.createImmutable(4)}, "%",0, 1),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",RemoteObject.solve(new RemoteObject[] {_gy,RemoteObject.createImmutable(100)}, "%",0, 1),BA.numberCast(double.class, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_gy,RemoteObject.createImmutable(400)}, "%",0, 1),BA.numberCast(double.class, 0))))))))) { 
 BA.debugLineNum = 61;BA.debugLine="g_day_no = g_day_no + 1";
Debug.ShouldStop(268435456);
_g_day_no = RemoteObject.solve(new RemoteObject[] {_g_day_no,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("g_day_no", _g_day_no);
 };
 BA.debugLineNum = 65;BA.debugLine="g_day_no = g_day_no + gd";
Debug.ShouldStop(1);
_g_day_no = RemoteObject.solve(new RemoteObject[] {_g_day_no,_gd}, "+",1, 1);Debug.locals.put("g_day_no", _g_day_no);
 BA.debugLineNum = 67;BA.debugLine="Dim j_day_no,j_np,jy As Int";
Debug.ShouldStop(4);
_j_day_no = RemoteObject.createImmutable(0);Debug.locals.put("j_day_no", _j_day_no);
_j_np = RemoteObject.createImmutable(0);Debug.locals.put("j_np", _j_np);
_jy = RemoteObject.createImmutable(0);Debug.locals.put("jy", _jy);
 BA.debugLineNum = 69;BA.debugLine="j_day_no = g_day_no - 79";
Debug.ShouldStop(16);
_j_day_no = RemoteObject.solve(new RemoteObject[] {_g_day_no,RemoteObject.createImmutable(79)}, "-",1, 1);Debug.locals.put("j_day_no", _j_day_no);
 BA.debugLineNum = 71;BA.debugLine="j_np = (j_day_no / 12053)";
Debug.ShouldStop(64);
_j_np = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {_j_day_no,RemoteObject.createImmutable(12053)}, "/",0, 0)));Debug.locals.put("j_np", _j_np);
 BA.debugLineNum = 72;BA.debugLine="j_day_no = j_day_no Mod 12053";
Debug.ShouldStop(128);
_j_day_no = RemoteObject.solve(new RemoteObject[] {_j_day_no,RemoteObject.createImmutable(12053)}, "%",0, 1);Debug.locals.put("j_day_no", _j_day_no);
 BA.debugLineNum = 74;BA.debugLine="jy = 979 + 33 * j_np + 4 * (j_day_no / 1461)";
Debug.ShouldStop(512);
_jy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(979),RemoteObject.createImmutable(33),_j_np,RemoteObject.createImmutable(4),(RemoteObject.solve(new RemoteObject[] {_j_day_no,RemoteObject.createImmutable(1461)}, "/",0, 0))}, "+*+*",2, 0));Debug.locals.put("jy", _jy);
 BA.debugLineNum = 76;BA.debugLine="j_day_no = j_day_no Mod 1461";
Debug.ShouldStop(2048);
_j_day_no = RemoteObject.solve(new RemoteObject[] {_j_day_no,RemoteObject.createImmutable(1461)}, "%",0, 1);Debug.locals.put("j_day_no", _j_day_no);
 BA.debugLineNum = 80;BA.debugLine="If (j_day_no >= 366) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("g",_j_day_no,BA.numberCast(double.class, 366)))) { 
 BA.debugLineNum = 81;BA.debugLine="jy = jy + ((j_day_no - 1) / 365)";
Debug.ShouldStop(65536);
_jy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_jy,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_j_day_no,RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(365)}, "/",0, 0))}, "+",1, 0));Debug.locals.put("jy", _jy);
 BA.debugLineNum = 82;BA.debugLine="j_day_no = (j_day_no - 1) Mod 365";
Debug.ShouldStop(131072);
_j_day_no = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_j_day_no,RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(365)}, "%",0, 1);Debug.locals.put("j_day_no", _j_day_no);
 };
 BA.debugLineNum = 85;BA.debugLine="i = 0";
Debug.ShouldStop(1048576);
_i = 0;Debug.locals.put("i", _i);
 BA.debugLineNum = 86;BA.debugLine="Do While (i < 11 And j_day_no >= j_days_in_month(";
Debug.ShouldStop(2097152);
while ((RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 11)) && RemoteObject.solveBoolean("g",_j_day_no,BA.numberCast(double.class, _j_days_in_month.getArrayElement(true,BA.numberCast(int.class, _i)))))) {
 BA.debugLineNum = 87;BA.debugLine="j_day_no = j_day_no - j_days_in_month(i)";
Debug.ShouldStop(4194304);
_j_day_no = RemoteObject.solve(new RemoteObject[] {_j_day_no,_j_days_in_month.getArrayElement(true,BA.numberCast(int.class, _i))}, "-",1, 1);Debug.locals.put("j_day_no", _j_day_no);
 BA.debugLineNum = 88;BA.debugLine="i = i + 1";
Debug.ShouldStop(8388608);
_i = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue();Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 91;BA.debugLine="Dim jm,jd As Int";
Debug.ShouldStop(67108864);
_jm = RemoteObject.createImmutable(0);Debug.locals.put("jm", _jm);
_jd = RemoteObject.createImmutable(0);Debug.locals.put("jd", _jd);
 BA.debugLineNum = 92;BA.debugLine="jm = i + 1";
Debug.ShouldStop(134217728);
_jm = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("jm", _jm);
 BA.debugLineNum = 93;BA.debugLine="jd = j_day_no + 1";
Debug.ShouldStop(268435456);
_jd = RemoteObject.solve(new RemoteObject[] {_j_day_no,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("jd", _jd);
 BA.debugLineNum = 94;BA.debugLine="Dim res As String";
Debug.ShouldStop(536870912);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 95;BA.debugLine="res = jy & \"/\" & jm & \"/\" & jd";
Debug.ShouldStop(1073741824);
_res = RemoteObject.concat(_jy,RemoteObject.createImmutable("/"),_jm,RemoteObject.createImmutable("/"),_jd);Debug.locals.put("res", _res);
 BA.debugLineNum = 96;BA.debugLine="Return res";
Debug.ShouldStop(-2147483648);
if (true) return _res;
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
public static RemoteObject  _is_int(RemoteObject _ba,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Is_int (mycode) ","mycode",4,_ba,mycode.mostCurrent,197);
if (RapidSub.canDelegate("is_int")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","is_int", _ba, _data);}
RemoteObject _n = RemoteObject.createImmutable(0);
;
Debug.locals.put("data", _data);
 BA.debugLineNum = 197;BA.debugLine="Public Sub Is_int(data As String) As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 199;BA.debugLine="If IsNumber(data) And data<>Null Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(".",mycode.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_data))) && RemoteObject.solveBoolean("N",_data)) { 
 BA.debugLineNum = 200;BA.debugLine="Dim n As Int=data";
Debug.ShouldStop(128);
_n = BA.numberCast(int.class, _data);Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 201;BA.debugLine="Return n";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return _n;
 }else {
 BA.debugLineNum = 203;BA.debugLine="Return 0";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, 0);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e9.toString()); BA.debugLineNum = 206;BA.debugLine="Return 0";
Debug.ShouldStop(8192);
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 207;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
mycode.mostCurrent.__c.runVoidMethod ("LogImpl","518350090",BA.ObjectToString(mycode.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _is_null(RemoteObject _ba,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Is_Null (mycode) ","mycode",4,_ba,mycode.mostCurrent,218);
if (RapidSub.canDelegate("is_null")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","is_null", _ba, _data);}
;
Debug.locals.put("data", _data);
 BA.debugLineNum = 218;BA.debugLine="Public Sub Is_Null(data As String) As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 220;BA.debugLine="If (data=Null Or data=\"null\") Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("n",_data) || RemoteObject.solveBoolean("=",_data,RemoteObject.createImmutable("null")))) { 
 BA.debugLineNum = 221;BA.debugLine="Return \"\"";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("");
 }else {
 BA.debugLineNum = 223;BA.debugLine="Return data";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return _data;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e8.toString()); BA.debugLineNum = 226;BA.debugLine="Return \"\"";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _is_null_adad(RemoteObject _ba,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Is_Null_adad (mycode) ","mycode",4,_ba,mycode.mostCurrent,230);
if (RapidSub.canDelegate("is_null_adad")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","is_null_adad", _ba, _data);}
;
Debug.locals.put("data", _data);
 BA.debugLineNum = 230;BA.debugLine="Public Sub Is_Null_adad(data As String) As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 231;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 232;BA.debugLine="If (data=Null Or data=\"null\" Or data=\"\" Or IsNum";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("n",_data) || RemoteObject.solveBoolean("=",_data,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",_data,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",mycode.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_data)),mycode.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 233;BA.debugLine="Return 0";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return BA.NumberToString(0);
 }else {
 BA.debugLineNum = 235;BA.debugLine="Return data";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) return _data;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e8.toString()); BA.debugLineNum = 238;BA.debugLine="Return 0";
Debug.ShouldStop(8192);
if (true) return BA.NumberToString(0);
 };
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _is_null_price(RemoteObject _ba,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Is_Null_Price (mycode) ","mycode",4,_ba,mycode.mostCurrent,242);
if (RapidSub.canDelegate("is_null_price")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","is_null_price", _ba, _data);}
;
Debug.locals.put("data", _data);
 BA.debugLineNum = 242;BA.debugLine="Public Sub Is_Null_Price(data As String) As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 244;BA.debugLine="If (data=Null Or data=\"null\" Or data=\"\" Or IsNum";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("n",_data) || RemoteObject.solveBoolean("=",_data,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",_data,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",mycode.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_data)),mycode.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 245;BA.debugLine="Return 0";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) return BA.NumberToString(0);
 }else {
 BA.debugLineNum = 247;BA.debugLine="Return NumberFormat(data,1,3)";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return mycode.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _data)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e8.toString()); BA.debugLineNum = 250;BA.debugLine="Return 0";
Debug.ShouldStop(33554432);
if (true) return BA.NumberToString(0);
 };
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
public static RemoteObject  _isnullorwhitespace(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("IsNullOrWhiteSpace (mycode) ","mycode",4,_ba,mycode.mostCurrent,470);
if (RapidSub.canDelegate("isnullorwhitespace")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","isnullorwhitespace", _ba, _str);}
RemoteObject _b = RemoteObject.createImmutable(false);
;
Debug.locals.put("Str", _str);
 BA.debugLineNum = 470;BA.debugLine="Public Sub IsNullOrWhiteSpace(Str As String) As Bo";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 471;BA.debugLine="Dim b As Boolean=False";
Debug.ShouldStop(4194304);
_b = mycode.mostCurrent.__c.getField(true,"False");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 472;BA.debugLine="b=IIf(Str=Null,True,False)";
Debug.ShouldStop(8388608);
_b = BA.ObjectToBoolean(((RemoteObject.solveBoolean("n",_str)) ? ((mycode.mostCurrent.__c.getField(true,"True"))) : ((mycode.mostCurrent.__c.getField(true,"False")))));Debug.locals.put("b", _b);
 BA.debugLineNum = 473;BA.debugLine="b=IIf(Str=\"\",True,False)";
Debug.ShouldStop(16777216);
_b = BA.ObjectToBoolean(((RemoteObject.solveBoolean("=",_str,BA.ObjectToString(""))) ? ((mycode.mostCurrent.__c.getField(true,"True"))) : ((mycode.mostCurrent.__c.getField(true,"False")))));Debug.locals.put("b", _b);
 BA.debugLineNum = 474;BA.debugLine="b=IIf(Str=\" \",True,False)";
Debug.ShouldStop(33554432);
_b = BA.ObjectToBoolean(((RemoteObject.solveBoolean("=",_str,BA.ObjectToString(" "))) ? ((mycode.mostCurrent.__c.getField(true,"True"))) : ((mycode.mostCurrent.__c.getField(true,"False")))));Debug.locals.put("b", _b);
 BA.debugLineNum = 475;BA.debugLine="Return b";
Debug.ShouldStop(67108864);
if (true) return _b;
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Dim b64 As StringUtils";
mycode._b64 = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _readobject(RemoteObject _ba,RemoteObject _listname) throws Exception{
try {
		Debug.PushSubsStack("ReadObject (mycode) ","mycode",4,_ba,mycode.mostCurrent,297);
if (RapidSub.canDelegate("readobject")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","readobject", _ba, _listname);}
RemoteObject _dateslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _datesfile = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
;
Debug.locals.put("ListName", _listname);
 BA.debugLineNum = 297;BA.debugLine="Public Sub ReadObject(ListName As String) As List";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="Dim datesList As List";
Debug.ShouldStop(512);
_dateslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("datesList", _dateslist);
 BA.debugLineNum = 299;BA.debugLine="datesList.Initialize";
Debug.ShouldStop(1024);
_dateslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 300;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 301;BA.debugLine="Dim DatesFile As RandomAccessFile";
Debug.ShouldStop(4096);
_datesfile = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");Debug.locals.put("DatesFile", _datesfile);
 BA.debugLineNum = 302;BA.debugLine="DatesFile.Initialize(File.DirDefaultExternal, Li";
Debug.ShouldStop(8192);
_datesfile.runVoidMethod ("Initialize",(Object)(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.concat(_listname,RemoteObject.createImmutable(".dat"))),(Object)(mycode.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 303;BA.debugLine="datesList = DatesFile.ReadObject(0)";
Debug.ShouldStop(16384);
_dateslist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _datesfile.runMethod(false,"ReadObject",(Object)(BA.numberCast(long.class, 0))));Debug.locals.put("datesList", _dateslist);
 BA.debugLineNum = 304;BA.debugLine="DatesFile.Close";
Debug.ShouldStop(32768);
_datesfile.runVoidMethod ("Close");
 BA.debugLineNum = 305;BA.debugLine="Log(ListName &\"===>>\"& datesList.Size)";
Debug.ShouldStop(65536);
mycode.mostCurrent.__c.runVoidMethod ("LogImpl","518808840",RemoteObject.concat(_listname,RemoteObject.createImmutable("===>>"),_dateslist.runMethod(true,"getSize")),0);
 BA.debugLineNum = 306;BA.debugLine="Return datesList";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return _dateslist;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e11.toString()); BA.debugLineNum = 308;BA.debugLine="datesList.Clear";
Debug.ShouldStop(524288);
_dateslist.runVoidMethod ("Clear");
 BA.debugLineNum = 309;BA.debugLine="Return datesList";
Debug.ShouldStop(1048576);
if (true) return _dateslist;
 };
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removesetting(RemoteObject _ba,RemoteObject _sfilename,RemoteObject _skey) throws Exception{
try {
		Debug.PushSubsStack("removeSetting (mycode) ","mycode",4,_ba,mycode.mostCurrent,137);
if (RapidSub.canDelegate("removesetting")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","removesetting", _ba, _sfilename, _skey);}
RemoteObject _m1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("sFilename", _sfilename);
Debug.locals.put("sKey", _skey);
 BA.debugLineNum = 137;BA.debugLine="Sub removeSetting(sFilename As String,sKey As Stri";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="Dim m1 As Map";
Debug.ShouldStop(512);
_m1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m1", _m1);
 BA.debugLineNum = 139;BA.debugLine="m1.Initialize";
Debug.ShouldStop(1024);
_m1.runVoidMethod ("Initialize");
 BA.debugLineNum = 140;BA.debugLine="If File.Exists(File.DirInternalCache,sFilename) =";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_sfilename)),mycode.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 141;BA.debugLine="m1 = File.ReadMap(File.DirInternalCache,sFilenam";
Debug.ShouldStop(4096);
_m1 = mycode.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_sfilename));Debug.locals.put("m1", _m1);
 }else {
 BA.debugLineNum = 143;BA.debugLine="Return \"\"";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 145;BA.debugLine="If m1.ContainsKey(sKey) = True Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_m1.runMethod(true,"ContainsKey",(Object)((_skey))),mycode.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 146;BA.debugLine="m1.Remove(sKey)";
Debug.ShouldStop(131072);
_m1.runVoidMethod ("Remove",(Object)((_skey)));
 BA.debugLineNum = 147;BA.debugLine="File.WriteMap(File.DirInternalCache,sFilename,m1";
Debug.ShouldStop(262144);
mycode.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_sfilename),(Object)(_m1));
 }else {
 BA.debugLineNum = 149;BA.debugLine="Return \"\"";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 151;BA.debugLine="Return \"\"";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveobject(RemoteObject _ba,RemoteObject _dateslist,RemoteObject _listname) throws Exception{
try {
		Debug.PushSubsStack("SaveObject (mycode) ","mycode",4,_ba,mycode.mostCurrent,286);
if (RapidSub.canDelegate("saveobject")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","saveobject", _ba, _dateslist, _listname);}
RemoteObject _datesfile = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
;
Debug.locals.put("datesList", _dateslist);
Debug.locals.put("ListName", _listname);
 BA.debugLineNum = 286;BA.debugLine="Public Sub SaveObject(datesList As List,ListName A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="If datesList.IsInitialized=False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_dateslist.runMethod(true,"IsInitialized"),mycode.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 288;BA.debugLine="datesList.Initialize";
Debug.ShouldStop(-2147483648);
_dateslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 289;BA.debugLine="datesList.Clear";
Debug.ShouldStop(1);
_dateslist.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 291;BA.debugLine="Dim DatesFile As RandomAccessFile";
Debug.ShouldStop(4);
_datesfile = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");Debug.locals.put("DatesFile", _datesfile);
 BA.debugLineNum = 292;BA.debugLine="DatesFile.Initialize(File.DirDefaultExternal, Lis";
Debug.ShouldStop(8);
_datesfile.runVoidMethod ("Initialize",(Object)(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.concat(_listname,RemoteObject.createImmutable(".dat"))),(Object)(mycode.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 293;BA.debugLine="DatesFile.WriteObject(datesList,True,0)";
Debug.ShouldStop(16);
_datesfile.runVoidMethod ("WriteObject",(Object)((_dateslist.getObject())),(Object)(mycode.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(long.class, 0)));
 BA.debugLineNum = 294;BA.debugLine="DatesFile.Close";
Debug.ShouldStop(32);
_datesfile.runVoidMethod ("Close");
 BA.debugLineNum = 295;BA.debugLine="Log(ListName &\"===\"& datesList.Size)";
Debug.ShouldStop(64);
mycode.mostCurrent.__c.runVoidMethod ("LogImpl","518743305",RemoteObject.concat(_listname,RemoteObject.createImmutable("==="),_dateslist.runMethod(true,"getSize")),0);
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _senderror(RemoteObject _ba,RemoteObject _message,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("SendError (mycode) ","mycode",4,_ba,mycode.mostCurrent,440);
if (RapidSub.canDelegate("senderror")) { ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","senderror", _ba, _message, _action); return;}
ResumableSub_SendError rsub = new ResumableSub_SendError(null,_ba,_message,_action);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SendError extends BA.ResumableSub {
public ResumableSub_SendError(ir.parsikhesab.pakhsh.mycode parent,RemoteObject _ba,RemoteObject _message,RemoteObject _action) {
this.parent = parent;
this._ba = _ba;
this._message = _message;
this._action = _action;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.mycode parent;
RemoteObject _ba;
RemoteObject _message;
RemoteObject _action;
RemoteObject _datemiladi = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterandroidlog");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SendError (mycode) ","mycode",4,_ba,mycode.mostCurrent,440);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
Debug.locals.put("message", _message);
Debug.locals.put("action", _action);
 BA.debugLineNum = 441;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,_ba).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 442;BA.debugLine="Dim DateMiladi As String = MCode.ConvertNumbersPe";
Debug.ShouldStop(33554432);
_datemiladi = parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,_ba,(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("DateMiladi", _datemiladi);Debug.locals.put("DateMiladi", _datemiladi);
 BA.debugLineNum = 443;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(67108864);
_time = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 444;BA.debugLine="Dim item As AdapterAndroidLog";
Debug.ShouldStop(134217728);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterandroidlog");Debug.locals.put("item", _item);
 BA.debugLineNum = 451;BA.debugLine="item.Initialize";
Debug.ShouldStop(4);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 452;BA.debugLine="item.date=MCode.ConvertNumbersPersian2English(MC";
Debug.ShouldStop(8);
_item.setField ("date" /*RemoteObject*/ ,parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,_ba,(Object)(parent.mostCurrent._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,_ba))));
 BA.debugLineNum = 453;BA.debugLine="item.time=MCode.ConvertNumbersPersian2English(Ti";
Debug.ShouldStop(16);
_item.setField ("time" /*RemoteObject*/ ,parent.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,_ba,(Object)(_time)));
 BA.debugLineNum = 454;BA.debugLine="item.message=message";
Debug.ShouldStop(32);
_item.setField ("message" /*RemoteObject*/ ,_message);
 BA.debugLineNum = 455;BA.debugLine="item.Action=action";
Debug.ShouldStop(64);
_item.setField ("Action" /*RemoteObject*/ ,_action);
 BA.debugLineNum = 456;BA.debugLine="CallSubDelayed2(Service_Server,\"SaveAndroidLog\",i";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((parent.mostCurrent._service_server.getObject())),(Object)(BA.ObjectToString("SaveAndroidLog")),(Object)((_item)));
 BA.debugLineNum = 457;BA.debugLine="Sleep(200)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mycode", "senderror"),BA.numberCast(int.class, 200));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;

case 5:
//C
this.state = 6;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _setanimation(RemoteObject _ba,RemoteObject _inanimation,RemoteObject _outanimation) throws Exception{
try {
		Debug.PushSubsStack("SetAnimation (mycode) ","mycode",4,_ba,mycode.mostCurrent,166);
if (RapidSub.canDelegate("setanimation")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","setanimation", _ba, _inanimation, _outanimation);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
;
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 166;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(64);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 168;BA.debugLine="Dim package As String";
Debug.ShouldStop(128);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 169;BA.debugLine="Dim in, out As Int";
Debug.ShouldStop(256);
_in = RemoteObject.createImmutable(0);Debug.locals.put("in", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 170;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(512);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 171;BA.debugLine="in = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(1024);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("in", _in);
 BA.debugLineNum = 172;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(2048);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 173;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(4096);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 174;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(8192);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsetting(RemoteObject _ba,RemoteObject _sfilename,RemoteObject _skey,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("setSetting (mycode) ","mycode",4,_ba,mycode.mostCurrent,112);
if (RapidSub.canDelegate("setsetting")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","setsetting", _ba, _sfilename, _skey, _svalue);}
RemoteObject _m1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("sFilename", _sfilename);
Debug.locals.put("sKey", _skey);
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 112;BA.debugLine="Sub setSetting(sFilename As String,sKey As String,";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Dim m1 As Map";
Debug.ShouldStop(65536);
_m1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m1", _m1);
 BA.debugLineNum = 114;BA.debugLine="m1.Initialize";
Debug.ShouldStop(131072);
_m1.runVoidMethod ("Initialize");
 BA.debugLineNum = 115;BA.debugLine="If File.Exists(File.DirInternalCache,sFilename) =";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_sfilename)),mycode.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 116;BA.debugLine="m1 = File.ReadMap(File.DirInternalCache,sFilenam";
Debug.ShouldStop(524288);
_m1 = mycode.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_sfilename));Debug.locals.put("m1", _m1);
 };
 BA.debugLineNum = 118;BA.debugLine="m1.Put(sKey,b64.EncodeBase64(sValue.GetBytes(\"UTF";
Debug.ShouldStop(2097152);
_m1.runVoidMethod ("Put",(Object)((_skey)),(Object)((mycode._b64.runMethod(true,"EncodeBase64",(Object)(_svalue.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8"))))))));
 BA.debugLineNum = 119;BA.debugLine="File.WriteMap(File.DirInternalCache,sFilename,m1)";
Debug.ShouldStop(4194304);
mycode.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(mycode.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_sfilename),(Object)(_m1));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatusbarcolor(RemoteObject _ba,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("SetStatusBarColor (mycode) ","mycode",4,_ba,mycode.mostCurrent,185);
if (RapidSub.canDelegate("setstatusbarcolor")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","setstatusbarcolor", _ba, _clr);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _window = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 185;BA.debugLine="Sub SetStatusBarColor(clr As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 187;BA.debugLine="If p.SdkVersion >= 21 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("g",_p.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 21))) { 
 BA.debugLineNum = 188;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(134217728);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 189;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(268435456);
_jo.runVoidMethod ("InitializeContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 190;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
Debug.ShouldStop(536870912);
_window = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_window = _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWindow")),(Object)((mycode.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("window", _window);Debug.locals.put("window", _window);
 BA.debugLineNum = 191;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
Debug.ShouldStop(1073741824);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((((int)0x80000000)))})));
 BA.debugLineNum = 192;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
Debug.ShouldStop(-2147483648);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("clearFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((((int)0x04000000)))})));
 BA.debugLineNum = 193;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr)";
Debug.ShouldStop(1);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStatusBarColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_clr)})));
 };
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toint(RemoteObject _ba,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("ToInt (mycode) ","mycode",4,_ba,mycode.mostCurrent,434);
if (RapidSub.canDelegate("toint")) { return ir.parsikhesab.pakhsh.mycode.remoteMe.runUserSub(false, "mycode","toint", _ba, _obj);}
RemoteObject _num = RemoteObject.createImmutable(0);
;
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 434;BA.debugLine="Public Sub ToInt(obj As Object) As Int";
Debug.ShouldStop(131072);
 BA.debugLineNum = 435;BA.debugLine="Dim num As Int";
Debug.ShouldStop(262144);
_num = RemoteObject.createImmutable(0);Debug.locals.put("num", _num);
 BA.debugLineNum = 436;BA.debugLine="num=obj";
Debug.ShouldStop(524288);
_num = BA.numberCast(int.class, _obj);Debug.locals.put("num", _num);
 BA.debugLineNum = 437;BA.debugLine="Return num";
Debug.ShouldStop(1048576);
if (true) return _num;
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}