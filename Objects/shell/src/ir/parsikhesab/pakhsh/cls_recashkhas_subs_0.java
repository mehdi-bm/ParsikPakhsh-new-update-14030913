package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cls_recashkhas_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private p As Panel";
cls_recashkhas._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",cls_recashkhas._p);
 //BA.debugLineNum = 3;BA.debugLine="Private pnl_bk As Panel";
cls_recashkhas._pnl_bk = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_bk",cls_recashkhas._pnl_bk);
 //BA.debugLineNum = 4;BA.debugLine="Private LblVisit As Label";
cls_recashkhas._lblvisit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvisit",cls_recashkhas._lblvisit);
 //BA.debugLineNum = 5;BA.debugLine="Private LblKharid As Label";
cls_recashkhas._lblkharid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblkharid",cls_recashkhas._lblkharid);
 //BA.debugLineNum = 6;BA.debugLine="Private LblLastSefaresh As Label";
cls_recashkhas._lbllastsefaresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbllastsefaresh",cls_recashkhas._lbllastsefaresh);
 //BA.debugLineNum = 7;BA.debugLine="Private LblLastVisit As Label";
cls_recashkhas._lbllastvisit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbllastvisit",cls_recashkhas._lbllastvisit);
 //BA.debugLineNum = 8;BA.debugLine="Private LblAddress As Label";
cls_recashkhas._lbladdress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbladdress",cls_recashkhas._lbladdress);
 //BA.debugLineNum = 9;BA.debugLine="Private LblN_Ashkhas As Label";
cls_recashkhas._lbln_ashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbln_ashkhas",cls_recashkhas._lbln_ashkhas);
 //BA.debugLineNum = 10;BA.debugLine="Private LblC_Ashkhas As Label";
cls_recashkhas._lblc_ashkhas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblc_ashkhas",cls_recashkhas._lblc_ashkhas);
 //BA.debugLineNum = 11;BA.debugLine="Private OpCol1 As ColorDrawable";
cls_recashkhas._opcol1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");__ref.setField("_opcol1",cls_recashkhas._opcol1);
 //BA.debugLineNum = 12;BA.debugLine="Private OpCol2 As ColorDrawable";
cls_recashkhas._opcol2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");__ref.setField("_opcol2",cls_recashkhas._opcol2);
 //BA.debugLineNum = 13;BA.debugLine="Private shakhs As AdapterListAshkhas";
cls_recashkhas._shakhs = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");__ref.setField("_shakhs",cls_recashkhas._shakhs);
 //BA.debugLineNum = 14;BA.debugLine="Private Panel1 As Panel";
cls_recashkhas._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",cls_recashkhas._panel1);
 //BA.debugLineNum = 16;BA.debugLine="Private LblMande As Label";
cls_recashkhas._lblmande = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmande",cls_recashkhas._lblmande);
 //BA.debugLineNum = 17;BA.debugLine="Private LblMovaghat As Label";
cls_recashkhas._lblmovaghat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmovaghat",cls_recashkhas._lblmovaghat);
 //BA.debugLineNum = 18;BA.debugLine="Private LblEdit As Label";
cls_recashkhas._lbledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbledit",cls_recashkhas._lbledit);
 //BA.debugLineNum = 19;BA.debugLine="Private LblDelete As Label";
cls_recashkhas._lbldelete = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldelete",cls_recashkhas._lbldelete);
 //BA.debugLineNum = 20;BA.debugLine="Private LblSend As Label";
cls_recashkhas._lblsend = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblsend",cls_recashkhas._lblsend);
 //BA.debugLineNum = 21;BA.debugLine="Private LblBlackList As Label";
cls_recashkhas._lblblacklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblblacklist",cls_recashkhas._lblblacklist);
 //BA.debugLineNum = 22;BA.debugLine="Private LblMandeEtebar As Label";
cls_recashkhas._lblmandeetebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmandeetebar",cls_recashkhas._lblmandeetebar);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (cls_recashkhas) ","cls_recashkhas",10,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "cls_recashkhas","getheight", __ref);}
 BA.debugLineNum = 195;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="Return pnl_bk.Height";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runMethod(true,"getHeight");
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPanel (cls_recashkhas) ","cls_recashkhas",10,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "cls_recashkhas","getpanel", __ref);}
 BA.debugLineNum = 191;BA.debugLine="Public Sub getPanel As Panel";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="pnl_bk.RemoveView";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnl_bk" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 193;BA.debugLine="Return pnl_bk";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_pnl_bk" /*RemoteObject*/ );
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cls_recashkhas) ","cls_recashkhas",10,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cls_recashkhas","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_p" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cls_recashkhas.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(cls_recashkhas.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 29;BA.debugLine="p.LoadLayout(\"L_RecAshkhas\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_p" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_RecAshkhas")),__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(536870912);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 31;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
Debug.ShouldStop(1073741824);
_op.runVoidMethod ("Initialize2",(Object)(cls_recashkhas.__c.getField(false,"Colors").getField(true,"White")),(Object)(cls_recashkhas.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(cls_recashkhas.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(cls_recashkhas.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 32;BA.debugLine="OpCol1.Initialize2(Colors.RGB(255,106,106),5dip,1";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_opcol1" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(cls_recashkhas.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 106)),(Object)(BA.numberCast(int.class, 106)))),(Object)(cls_recashkhas.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(cls_recashkhas.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(cls_recashkhas.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 33;BA.debugLine="OpCol2.Initialize2(Colors.RGB(213,213,0),5dip,1di";
Debug.ShouldStop(1);
__ref.getField(false,"_opcol2" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(cls_recashkhas.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 213)),(Object)(BA.numberCast(int.class, 213)),(Object)(BA.numberCast(int.class, 0)))),(Object)(cls_recashkhas.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(cls_recashkhas.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(cls_recashkhas.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _kaladefault(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("KalaDefault (cls_recashkhas) ","cls_recashkhas",10,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("kaladefault")) { return __ref.runUserSub(false, "cls_recashkhas","kaladefault", __ref);}
 BA.debugLineNum = 198;BA.debugLine="Sub KalaDefault";
Debug.ShouldStop(32);
 BA.debugLineNum = 206;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(8192);
cls_recashkhas.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_recashkhas._act_kaladefault.getObject())));
 BA.debugLineNum = 207;BA.debugLine="CallSubDelayed(Act_SelectMantage,\"btn_Back_Click";
Debug.ShouldStop(16384);
cls_recashkhas.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((cls_recashkhas._act_selectmantage.getObject())),(Object)(RemoteObject.createImmutable("btn_Back_Click")));
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbldelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblDelete_Click (cls_recashkhas) ","cls_recashkhas",10,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("lbldelete_click")) { return __ref.runUserSub(false, "cls_recashkhas","lbldelete_click", __ref);}
RemoteObject _result = RemoteObject.createImmutable(0);
 BA.debugLineNum = 315;BA.debugLine="Private Sub LblDelete_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 316;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 317;BA.debugLine="Dim result As Int";
Debug.ShouldStop(268435456);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 318;BA.debugLine="result = Msgbox2(\"آیا مشتری جدید حذف شود؟\", \"حذف";
Debug.ShouldStop(536870912);
_result = cls_recashkhas.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("آیا مشتری جدید حذف شود؟")),(Object)(BA.ObjectToCharSequence("حذف مشتری جدید")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((cls_recashkhas.__c.runMethod(false,"LoadBitmap",(Object)(cls_recashkhas.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png"))).getObject())),__ref.getField(false, "ba"));Debug.locals.put("result", _result);
 BA.debugLineNum = 319;BA.debugLine="If result = DialogResponse.Positive Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, cls_recashkhas.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 320;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas where";
Debug.ShouldStop(-2147483648);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblAshkhas where fldCodetafzili='"),__ref.getField(false,"_shakhs" /*RemoteObject*/ ).getField(true,"CodeTafzili" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 321;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhasNew whe";
Debug.ShouldStop(1);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblAshkhasNew where FldCodeTafzili='"),__ref.getField(false,"_shakhs" /*RemoteObject*/ ).getField(true,"CodeTafzili" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 323;BA.debugLine="CallSub(Act_SelectMantage,\"LoadAshkhas\")";
Debug.ShouldStop(4);
cls_recashkhas.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((cls_recashkhas._act_selectmantage.getObject())),(Object)(RemoteObject.createImmutable("LoadAshkhas")));
 BA.debugLineNum = 327;BA.debugLine="ToastMessageShow(\"شخص جدید با موفقیت حذف شد\",Fal";
Debug.ShouldStop(64);
cls_recashkhas.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("شخص جدید با موفقیت حذف شد")),(Object)(cls_recashkhas.__c.getField(true,"False")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 330;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
cls_recashkhas.__c.runVoidMethod ("LogImpl","526279951",BA.ObjectToString(cls_recashkhas.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 331;BA.debugLine="ToastMessageShow(\"خطا در حذف شخص جدید\",False)";
Debug.ShouldStop(1024);
cls_recashkhas.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در حذف شخص جدید")),(Object)(cls_recashkhas.__c.getField(true,"False")));
 };
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbledit_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblEdit_Click (cls_recashkhas) ","cls_recashkhas",10,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("lbledit_click")) { return __ref.runUserSub(false, "cls_recashkhas","lbledit_click", __ref);}
RemoteObject _result = RemoteObject.createImmutable(0);
 BA.debugLineNum = 303;BA.debugLine="Private Sub LblEdit_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 304;BA.debugLine="Dim result As Int";
Debug.ShouldStop(32768);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 305;BA.debugLine="result = Msgbox2(\"آیا مشتری جدید ویرایش شود؟\", \"و";
Debug.ShouldStop(65536);
_result = cls_recashkhas.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("آیا مشتری جدید ویرایش شود؟")),(Object)(BA.ObjectToCharSequence("ویرایش مشتری جدید")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((cls_recashkhas.__c.runMethod(false,"LoadBitmap",(Object)(cls_recashkhas.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png"))).getObject())),__ref.getField(false, "ba"));Debug.locals.put("result", _result);
 BA.debugLineNum = 306;BA.debugLine="If result = DialogResponse.Positive Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, cls_recashkhas.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 307;BA.debugLine="MCode.UpdateShakhs=True";
Debug.ShouldStop(262144);
cls_recashkhas._mcode._updateshakhs /*RemoteObject*/  = cls_recashkhas.__c.getField(true,"True");
 BA.debugLineNum = 308;BA.debugLine="Act_NewAshkhas.shakhs=shakhs";
Debug.ShouldStop(524288);
cls_recashkhas._act_newashkhas._shakhs /*RemoteObject*/  = __ref.getField(false,"_shakhs" /*RemoteObject*/ );
 BA.debugLineNum = 309;BA.debugLine="StartActivity(Act_NewAshkhas)";
Debug.ShouldStop(1048576);
cls_recashkhas.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_recashkhas._act_newashkhas.getObject())));
 }else {
 };
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel1_Click (cls_recashkhas) ","cls_recashkhas",10,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("panel1_click")) { return __ref.runUserSub(false, "cls_recashkhas","panel1_click", __ref);}
RemoteObject _mande = RemoteObject.createImmutable("");
RemoteObject _saghfeetebar = RemoteObject.createImmutable("");
 BA.debugLineNum = 211;BA.debugLine="Sub Panel1_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 213;BA.debugLine="MCode.C_Tafzili=shakhs.CodeTafzili";
Debug.ShouldStop(1048576);
cls_recashkhas._mcode._c_tafzili /*RemoteObject*/  = __ref.getField(false,"_shakhs" /*RemoteObject*/ ).getField(true,"CodeTafzili" /*RemoteObject*/ );
 BA.debugLineNum = 214;BA.debugLine="MCode.N_Tafzili=shakhs.SharhTafzili";
Debug.ShouldStop(2097152);
cls_recashkhas._mcode._n_tafzili /*RemoteObject*/  = __ref.getField(false,"_shakhs" /*RemoteObject*/ ).getField(true,"SharhTafzili" /*RemoteObject*/ );
 BA.debugLineNum = 215;BA.debugLine="Dim mande As String=myCode.Is_Null_adad(shakhs.Ma";
Debug.ShouldStop(4194304);
_mande = cls_recashkhas._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_shakhs" /*RemoteObject*/ ).getField(true,"Mande" /*RemoteObject*/ )));Debug.locals.put("mande", _mande);Debug.locals.put("mande", _mande);
 BA.debugLineNum = 216;BA.debugLine="Dim SaghfeEtebar As String=myCode.Is_Null_adad(sh";
Debug.ShouldStop(8388608);
_saghfeetebar = cls_recashkhas._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_shakhs" /*RemoteObject*/ ).getField(true,"fldSaghfeEtebar" /*RemoteObject*/ )));Debug.locals.put("SaghfeEtebar", _saghfeetebar);Debug.locals.put("SaghfeEtebar", _saghfeetebar);
 BA.debugLineNum = 217;BA.debugLine="MCode.MandeHesab=mande";
Debug.ShouldStop(16777216);
cls_recashkhas._mcode._mandehesab /*RemoteObject*/  = _mande;
 BA.debugLineNum = 218;BA.debugLine="If SaghfeEtebar>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _saghfeetebar),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 219;BA.debugLine="If mande>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mande),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 220;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar - mande";
Debug.ShouldStop(134217728);
cls_recashkhas._mcode._mandeetebar /*RemoteObject*/  = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _saghfeetebar),BA.numberCast(double.class, _mande)}, "-",1, 0));
 }else {
 BA.debugLineNum = 222;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar";
Debug.ShouldStop(536870912);
cls_recashkhas._mcode._mandeetebar /*RemoteObject*/  = _saghfeetebar;
 };
 BA.debugLineNum = 225;BA.debugLine="MCode.ManedEtebarEnable=True";
Debug.ShouldStop(1);
cls_recashkhas._mcode._manedetebarenable /*RemoteObject*/  = cls_recashkhas.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 227;BA.debugLine="MCode.ManedEtebarEnable=False";
Debug.ShouldStop(4);
cls_recashkhas._mcode._manedetebarenable /*RemoteObject*/  = cls_recashkhas.__c.getField(true,"False");
 BA.debugLineNum = 228;BA.debugLine="MCode.MandeEtebar=0";
Debug.ShouldStop(8);
cls_recashkhas._mcode._mandeetebar /*RemoteObject*/  = BA.NumberToString(0);
 };
 BA.debugLineNum = 231;BA.debugLine="Log(\"مانده: \"& mande)";
Debug.ShouldStop(64);
cls_recashkhas.__c.runVoidMethod ("LogImpl","526017812",RemoteObject.concat(RemoteObject.createImmutable("مانده: "),_mande),0);
 BA.debugLineNum = 232;BA.debugLine="Log(\"سقف اعتبار: \"&SaghfeEtebar)";
Debug.ShouldStop(128);
cls_recashkhas.__c.runVoidMethod ("LogImpl","526017813",RemoteObject.concat(RemoteObject.createImmutable("سقف اعتبار: "),_saghfeetebar),0);
 BA.debugLineNum = 233;BA.debugLine="Log(\"مانده اعتبار: \"&MCode.MandeEtebar)";
Debug.ShouldStop(256);
cls_recashkhas.__c.runVoidMethod ("LogImpl","526017814",RemoteObject.concat(RemoteObject.createImmutable("مانده اعتبار: "),cls_recashkhas._mcode._mandeetebar /*RemoteObject*/ ),0);
 BA.debugLineNum = 234;BA.debugLine="Log(\"وضعیت مانده اعتبار: \"&MCode.ManedEtebarEnabl";
Debug.ShouldStop(512);
cls_recashkhas.__c.runVoidMethod ("LogImpl","526017815",RemoteObject.concat(RemoteObject.createImmutable("وضعیت مانده اعتبار: "),cls_recashkhas._mcode._manedetebarenable /*RemoteObject*/ ),0);
 BA.debugLineNum = 236;BA.debugLine="Select Case MCode.page";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(cls_recashkhas._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Act_Moshtarian"))) {
case 0: {
 BA.debugLineNum = 239;BA.debugLine="StartActivity(Act_Profile)";
Debug.ShouldStop(16384);
cls_recashkhas.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_recashkhas._act_profile.getObject())));
 break; }
default: {
 BA.debugLineNum = 241;BA.debugLine="visit";
Debug.ShouldStop(65536);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_visit" /*RemoteObject*/ );
 BA.debugLineNum = 245;BA.debugLine="StartActivity(Act_KalaDefault)";
Debug.ShouldStop(1048576);
cls_recashkhas.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((cls_recashkhas._act_kaladefault.getObject())));
 break; }
}
;
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savelastseen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SaveLastSeen (cls_recashkhas) ","cls_recashkhas",10,__ref.getField(false, "ba"),__ref,267);
if (RapidSub.canDelegate("savelastseen")) { return __ref.runUserSub(false, "cls_recashkhas","savelastseen", __ref);}
RemoteObject _dateshamsi = RemoteObject.createImmutable("");
RemoteObject _time = RemoteObject.createImmutable("");
RemoteObject _d = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _maxradif = RemoteObject.createImmutable(0);
 BA.debugLineNum = 267;BA.debugLine="Sub SaveLastSeen";
Debug.ShouldStop(1024);
 BA.debugLineNum = 269;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(4096);
cls_recashkhas.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 271;BA.debugLine="Dim DateShamsi As String = MCode.DatePersian";
Debug.ShouldStop(16384);
_dateshamsi = cls_recashkhas._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("DateShamsi", _dateshamsi);Debug.locals.put("DateShamsi", _dateshamsi);
 BA.debugLineNum = 272;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(32768);
_time = cls_recashkhas.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(cls_recashkhas.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Time", _time);Debug.locals.put("Time", _time);
 BA.debugLineNum = 273;BA.debugLine="Dim D As String = DateShamsi & \"T\" & Time";
Debug.ShouldStop(65536);
_d = RemoteObject.concat(_dateshamsi,RemoteObject.createImmutable("T"),_time);Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 274;BA.debugLine="LogColor(\"D: \" & D,Colors.Red)";
Debug.ShouldStop(131072);
cls_recashkhas.__c.runVoidMethod ("LogImpl","526148871",RemoteObject.concat(RemoteObject.createImmutable("D: "),_d),cls_recashkhas.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 276;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(524288);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_recashkhas._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblLastSeen Where FldC_Ashkhas = '"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 277;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 278;BA.debugLine="MCode.SaveUpdate(\"Update TblLastSeen Set LastSee";
Debug.ShouldStop(2097152);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblLastSeen Set LastSeen = '"),_d,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 280;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLastSeen (FldC_";
Debug.ShouldStop(8388608);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblLastSeen (FldC_Ashkhas,LastSeen) Values ('"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_d,RemoteObject.createImmutable("')"))));
 };
 BA.debugLineNum = 282;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set lastSeen";
Debug.ShouldStop(33554432);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set lastSeen = '"),_d,RemoteObject.createImmutable("' Where fldCodetafzili = '"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 284;BA.debugLine="If MCode.TourVisitSW And MCode.TourVisit=1 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(".",cls_recashkhas._mcode._tourvisitsw /*RemoteObject*/ ) && RemoteObject.solveBoolean("=",cls_recashkhas._mcode._tourvisit /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 285;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set fldV";
Debug.ShouldStop(268435456);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update tblTourVisitor Set fldVaziat='2',fldTimeVisit='"),_time,RemoteObject.createImmutable("',fldSend='False' Where fldCodeTafzili = '"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("' and fldDateVisit='"),cls_recashkhas._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,__ref.getField(false, "ba")),RemoteObject.createImmutable("' and fldType='Tour'"))));
 }else {
 BA.debugLineNum = 287;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select C";
Debug.ShouldStop(1073741824);
_count = BA.numberCast(int.class, cls_recashkhas._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"),cls_recashkhas.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cls_recashkhas._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,__ref.getField(false, "ba"))))),RemoteObject.createImmutable("' and fldType='Free'"))))));Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 288;BA.debugLine="Dim MaxRadif As Int";
Debug.ShouldStop(-2147483648);
_maxradif = RemoteObject.createImmutable(0);Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 289;BA.debugLine="If Count=0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 290;BA.debugLine="MaxRadif=1";
Debug.ShouldStop(2);
_maxradif = BA.numberCast(int.class, 1);Debug.locals.put("MaxRadif", _maxradif);
 }else {
 BA.debugLineNum = 292;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fldRa";
Debug.ShouldStop(8);
_maxradif = BA.numberCast(int.class, cls_recashkhas._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"),cls_recashkhas.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cls_recashkhas._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,__ref.getField(false, "ba"))))),RemoteObject.createImmutable("' and fldType='Free'"))))));Debug.locals.put("MaxRadif", _maxradif);
 BA.debugLineNum = 293;BA.debugLine="MaxRadif=MaxRadif+1";
Debug.ShouldStop(16);
_maxradif = RemoteObject.solve(new RemoteObject[] {_maxradif,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("MaxRadif", _maxradif);
 };
 BA.debugLineNum = 295;BA.debugLine="Cu = MCode.Result($\"SELECT * FROM TblAshkhas WHE";
Debug.ShouldStop(64);
_cu = cls_recashkhas._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM TblAshkhas WHERE TblAshkhas.fldCodetafzili ="),cls_recashkhas.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 297;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(256);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 298;BA.debugLine="MCode.SaveUpdate(\"Insert into tblTourVisitor(fld";
Debug.ShouldStop(512);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert into tblTourVisitor(fldRadif,fldCodeSuperVisor,fldCodeGroup,fldCodeVisitor,fldCodeTafzili,fldSharheTafzili,fldDate,fldDateVisit,fldTimeVisit,fldDateNextVisit,fldDateTozie,fldShomareSefaresh,fldTimeSefaresh,fldSharh,fldVaziat,fldShomareFactor,fldSend,fldType) Values("),_maxradif,RemoteObject.createImmutable(",0,'"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroup"))),RemoteObject.createImmutable("','"),cls_recashkhas._mcode._c_visitor /*RemoteObject*/ ,RemoteObject.createImmutable("','"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),cls_recashkhas._mcode._n_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),cls_recashkhas._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,__ref.getField(false, "ba")),RemoteObject.createImmutable("','"),cls_recashkhas._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,__ref.getField(false, "ba")),RemoteObject.createImmutable("','"),_time,RemoteObject.createImmutable("','0','0','0','','0','2','0','False','Free')"))));
 };
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _item,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("show (cls_recashkhas) ","cls_recashkhas",10,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cls_recashkhas","show", __ref, _item, _date);}
RemoteObject _mande = RemoteObject.createImmutable("");
RemoteObject _lastvisit = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lastvisitdate = RemoteObject.createImmutable("");
RemoteObject _lastvisittime = RemoteObject.createImmutable("");
RemoteObject _datetimelastsefaresh = RemoteObject.createImmutable("");
RemoteObject _countsefaresh = RemoteObject.createImmutable(0L);
RemoteObject _lastsefareshdate = RemoteObject.createImmutable("");
RemoteObject _lastsefareshtime = RemoteObject.createImmutable("");
RemoteObject _dateshamsi = RemoteObject.createImmutable("");
RemoteObject _lstdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("item", _item);
Debug.locals.put("date", _date);
 BA.debugLineNum = 36;BA.debugLine="Public Sub show(item As AdapterListAshkhas,date As";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="shakhs=item";
Debug.ShouldStop(16);
__ref.setField ("_shakhs" /*RemoteObject*/ ,_item);
 BA.debugLineNum = 38;BA.debugLine="LblN_Ashkhas.Text =\"نام:\"& item.SharhTafzili";
Debug.ShouldStop(32);
__ref.getField(false,"_lbln_ashkhas" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("نام:"),_item.getField(true,"SharhTafzili" /*RemoteObject*/ ))));
 BA.debugLineNum = 41;BA.debugLine="If item.CodeTafzili <> Null  Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("N",_item.getField(true,"CodeTafzili" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 42;BA.debugLine="LblC_Ashkhas.Text =\"کد:\"& item.CodeTafzili";
Debug.ShouldStop(512);
__ref.getField(false,"_lblc_ashkhas" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("کد:"),_item.getField(true,"CodeTafzili" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 44;BA.debugLine="LblC_Ashkhas.Text =\"کد:\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblc_ashkhas" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("کد:"));
 };
 BA.debugLineNum = 47;BA.debugLine="If item.fldBlackList=1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_item.getField(true,"fldBlackList" /*RemoteObject*/ ),BA.NumberToString(1))) { 
 BA.debugLineNum = 48;BA.debugLine="LblBlackList.Visible=True";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblblacklist" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 50;BA.debugLine="LblBlackList.Visible=False";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblblacklist" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"False"));
 };
 BA.debugLineNum = 56;BA.debugLine="If myCode.Is_Null(item.Mande)=\"\" Or item.Mande=";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",cls_recashkhas._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"Mande" /*RemoteObject*/ ))),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_item.getField(true,"Mande" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_item.setField ("Mande" /*RemoteObject*/ ,BA.NumberToString(0));};
 BA.debugLineNum = 57;BA.debugLine="If item.Mande=0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_item.getField(true,"Mande" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 58;BA.debugLine="LblMande.TextColor=Colors.Black";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblmande" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_recashkhas.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 59;BA.debugLine="LblMande.Text =\"مانده حساب: \"&item.Mande";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblmande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مانده حساب: "),_item.getField(true,"Mande" /*RemoteObject*/ ))));
 BA.debugLineNum = 60;BA.debugLine="LblMandeEtebar.Text=\"مانده اعتبار: \"&myCode.Adad";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblmandeetebar" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مانده اعتبار: "),cls_recashkhas._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldSaghfeEtebar" /*RemoteObject*/ ))))));
 }else 
{ BA.debugLineNum = 61;BA.debugLine="else If item.Mande>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"Mande" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 62;BA.debugLine="LblMande.TextColor=Colors.red";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblmande" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_recashkhas.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 63;BA.debugLine="LblMande.Text =\"مانده حساب: \"& NumberFormat( A";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblmande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مانده حساب: "),cls_recashkhas.__c.runMethod(true,"NumberFormat",(Object)(cls_recashkhas.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _item.getField(true,"Mande" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" بد"))));
 BA.debugLineNum = 64;BA.debugLine="Dim mande As String=myCode.Is_Null_adad(item.Man";
Debug.ShouldStop(-2147483648);
_mande = cls_recashkhas._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"Mande" /*RemoteObject*/ )));Debug.locals.put("mande", _mande);Debug.locals.put("mande", _mande);
 BA.debugLineNum = 65;BA.debugLine="LblMandeEtebar.Text=\"مانده اعتبار: \"&myCode.Adad";
Debug.ShouldStop(1);
__ref.getField(false,"_lblmandeetebar" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مانده اعتبار: "),cls_recashkhas._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"fldSaghfeEtebar" /*RemoteObject*/ )),BA.numberCast(double.class, _mande)}, "-",1, 0)))))));
 }else 
{ BA.debugLineNum = 66;BA.debugLine="Else if item.Mande<0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _item.getField(true,"Mande" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 67;BA.debugLine="LblMande.TextColor= Colors.RGB(10,176,0)";
Debug.ShouldStop(4);
__ref.getField(false,"_lblmande" /*RemoteObject*/ ).runMethod(true,"setTextColor",cls_recashkhas.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 10)),(Object)(BA.numberCast(int.class, 176)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 68;BA.debugLine="LblMande.Text =\"مانده حساب: \"& NumberFormat( A";
Debug.ShouldStop(8);
__ref.getField(false,"_lblmande" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مانده حساب: "),cls_recashkhas.__c.runMethod(true,"NumberFormat",(Object)(cls_recashkhas.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _item.getField(true,"Mande" /*RemoteObject*/ ))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(" بس"))));
 BA.debugLineNum = 70;BA.debugLine="LblMandeEtebar.Text=\"مانده اعتبار: \"&myCode.Adad";
Debug.ShouldStop(32);
__ref.getField(false,"_lblmandeetebar" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مانده اعتبار: "),cls_recashkhas._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldSaghfeEtebar" /*RemoteObject*/ ))))));
 }}}
;
 BA.debugLineNum = 76;BA.debugLine="LblAddress.text =\"آدرس: \"& item.Address";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbladdress" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("آدرس: "),_item.getField(true,"Address" /*RemoteObject*/ ))));
 BA.debugLineNum = 77;BA.debugLine="LblAddress.Typeface=MCode.Font2";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbladdress" /*RemoteObject*/ ).runMethod(false,"setTypeface",(cls_recashkhas._mcode._font2 /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 80;BA.debugLine="Dim lastVisit As String = myCode.Is_Null(item.las";
Debug.ShouldStop(32768);
_lastvisit = cls_recashkhas._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"lastSeen" /*RemoteObject*/ )));Debug.locals.put("lastVisit", _lastvisit);Debug.locals.put("lastVisit", _lastvisit);
 BA.debugLineNum = 81;BA.debugLine="If lastVisit.Length = 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_lastvisit.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 82;BA.debugLine="LblLastVisit.Text=\"//\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbllastvisit" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("//"));
 }else {
 BA.debugLineNum = 84;BA.debugLine="Dim Str As List";
Debug.ShouldStop(524288);
_str = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Str", _str);
 BA.debugLineNum = 85;BA.debugLine="Str.Initialize";
Debug.ShouldStop(1048576);
_str.runVoidMethod ("Initialize");
 BA.debugLineNum = 86;BA.debugLine="Str = MCode.Sf.Split(lastVisit.Replace(\"-\",\"/\"),";
Debug.ShouldStop(2097152);
_str = cls_recashkhas._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(_lastvisit.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("/")))),(Object)(RemoteObject.createImmutable("T")));Debug.locals.put("Str", _str);
 BA.debugLineNum = 88;BA.debugLine="Dim DT As List = MCode.Sf.Split(Str.get(0),\"/\")";
Debug.ShouldStop(8388608);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dt = cls_recashkhas._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(BA.ObjectToString(_str.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("DT", _dt);Debug.locals.put("DT", _dt);
 BA.debugLineNum = 90;BA.debugLine="Log(DT.Get(0))";
Debug.ShouldStop(33554432);
cls_recashkhas.__c.runVoidMethod ("LogImpl","525755702",BA.ObjectToString(_dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),0);
 BA.debugLineNum = 93;BA.debugLine="Dim lastVisitDate As String =MCode.PersianDateDa";
Debug.ShouldStop(268435456);
_lastvisitdate = cls_recashkhas._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("lastVisitDate", _lastvisitdate);Debug.locals.put("lastVisitDate", _lastvisitdate);
 BA.debugLineNum = 94;BA.debugLine="Dim lastVisitTime As String = Str.get(1)";
Debug.ShouldStop(536870912);
_lastvisittime = BA.ObjectToString(_str.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("lastVisitTime", _lastvisittime);Debug.locals.put("lastVisitTime", _lastvisittime);
 BA.debugLineNum = 95;BA.debugLine="LblLastVisit.Text=lastVisitDate & CRLF & lastVis";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbllastvisit" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_lastvisitdate,cls_recashkhas.__c.getField(true,"CRLF"),_lastvisittime)));
 };
 BA.debugLineNum = 98;BA.debugLine="If item.CodeTafzili.Length>5 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_item.getField(true,"CodeTafzili" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 99;BA.debugLine="LblMovaghat.Visible=True";
Debug.ShouldStop(4);
__ref.getField(false,"_lblmovaghat" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"True"));
 BA.debugLineNum = 100;BA.debugLine="Dim DateTimeLastSefaresh As String = myCode.Is_N";
Debug.ShouldStop(8);
_datetimelastsefaresh = cls_recashkhas._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"lastOrderDate" /*RemoteObject*/ )));Debug.locals.put("DateTimeLastSefaresh", _datetimelastsefaresh);Debug.locals.put("DateTimeLastSefaresh", _datetimelastsefaresh);
 BA.debugLineNum = 101;BA.debugLine="Dim countSefaresh As Long=myCode.Is_Null_adad(MC";
Debug.ShouldStop(16);
_countsefaresh = BA.numberCast(long.class, cls_recashkhas._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(cls_recashkhas._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Count(FldId) From TblFaktor where FldC_Tafzili='"),_item.getField(true,"CodeTafzili" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))))))));Debug.locals.put("countSefaresh", _countsefaresh);Debug.locals.put("countSefaresh", _countsefaresh);
 BA.debugLineNum = 102;BA.debugLine="If countSefaresh>0 And item.FldSync<>\"True\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_countsefaresh,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("!",_item.getField(true,"FldSync" /*RemoteObject*/ ),BA.ObjectToString("True"))) { 
 BA.debugLineNum = 103;BA.debugLine="LblDelete.Visible=False";
Debug.ShouldStop(64);
__ref.getField(false,"_lbldelete" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 105;BA.debugLine="LblDelete.Visible=True";
Debug.ShouldStop(256);
__ref.getField(false,"_lbldelete" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"True"));
 };
 BA.debugLineNum = 108;BA.debugLine="If item.FldSync=\"True\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_item.getField(true,"FldSync" /*RemoteObject*/ ),BA.ObjectToString("True"))) { 
 BA.debugLineNum = 109;BA.debugLine="LblSend.Visible=True";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblsend" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="LblEdit.Visible=False";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbledit" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 112;BA.debugLine="LblSend.Visible=False";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblsend" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"False"));
 BA.debugLineNum = 114;BA.debugLine="LblEdit.Visible=True";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbledit" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"True"));
 };
 }else {
 BA.debugLineNum = 117;BA.debugLine="LblMovaghat.Visible=False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblmovaghat" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"False"));
 BA.debugLineNum = 118;BA.debugLine="LblEdit.Visible=False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbledit" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"False"));
 BA.debugLineNum = 119;BA.debugLine="LblDelete.Visible=False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbldelete" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"False"));
 BA.debugLineNum = 120;BA.debugLine="LblSend.Visible=False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblsend" /*RemoteObject*/ ).runMethod(true,"setVisible",cls_recashkhas.__c.getField(true,"False"));
 };
 BA.debugLineNum = 125;BA.debugLine="Dim DateTimeLastSefaresh As String = myCode.Is_Nu";
Debug.ShouldStop(268435456);
_datetimelastsefaresh = cls_recashkhas._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"lastOrderDate" /*RemoteObject*/ )));Debug.locals.put("DateTimeLastSefaresh", _datetimelastsefaresh);Debug.locals.put("DateTimeLastSefaresh", _datetimelastsefaresh);
 BA.debugLineNum = 126;BA.debugLine="If DateTimeLastSefaresh.Length = 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_datetimelastsefaresh.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 127;BA.debugLine="LblLastSefaresh.Text=\"//\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbllastsefaresh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("//"));
 }else {
 BA.debugLineNum = 129;BA.debugLine="Dim Str As List";
Debug.ShouldStop(1);
_str = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Str", _str);
 BA.debugLineNum = 130;BA.debugLine="Str.Initialize";
Debug.ShouldStop(2);
_str.runVoidMethod ("Initialize");
 BA.debugLineNum = 131;BA.debugLine="Str = MCode.Sf.Split(DateTimeLastSefaresh.Replac";
Debug.ShouldStop(4);
_str = cls_recashkhas._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(_datetimelastsefaresh.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("/")))),(Object)(RemoteObject.createImmutable("T")));Debug.locals.put("Str", _str);
 BA.debugLineNum = 133;BA.debugLine="Dim DT As List = MCode.Sf.Split(Str.get(0),\"/\")";
Debug.ShouldStop(16);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dt = cls_recashkhas._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(BA.ObjectToString(_str.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("DT", _dt);Debug.locals.put("DT", _dt);
 BA.debugLineNum = 134;BA.debugLine="Dim LastSefareshDate As String = MCode.PersianDa";
Debug.ShouldStop(32);
_lastsefareshdate = cls_recashkhas._mcode.runMethod(true,"_persiandatedash" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_dt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("LastSefareshDate", _lastsefareshdate);Debug.locals.put("LastSefareshDate", _lastsefareshdate);
 BA.debugLineNum = 135;BA.debugLine="Dim LastSefareshTime As String = Str.get(1)";
Debug.ShouldStop(64);
_lastsefareshtime = BA.ObjectToString(_str.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("LastSefareshTime", _lastsefareshtime);Debug.locals.put("LastSefareshTime", _lastsefareshtime);
 BA.debugLineNum = 136;BA.debugLine="LblLastSefaresh.Text=LastSefareshDate & CRLF & L";
Debug.ShouldStop(128);
__ref.getField(false,"_lbllastsefaresh" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_lastsefareshdate,cls_recashkhas.__c.getField(true,"CRLF"),_lastsefareshtime)));
 };
 BA.debugLineNum = 155;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(67108864);
cls_recashkhas.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 157;BA.debugLine="Dim DateShamsi As String = MCode.DatePersian";
Debug.ShouldStop(268435456);
_dateshamsi = cls_recashkhas._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("DateShamsi", _dateshamsi);Debug.locals.put("DateShamsi", _dateshamsi);
 BA.debugLineNum = 158;BA.debugLine="Dim LstDate As List";
Debug.ShouldStop(536870912);
_lstdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("LstDate", _lstdate);
 BA.debugLineNum = 159;BA.debugLine="LstDate.Initialize";
Debug.ShouldStop(1073741824);
_lstdate.runVoidMethod ("Initialize");
 BA.debugLineNum = 161;BA.debugLine="If myCode.Is_Null(item.lastOrderDate).Length>2 Th";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",cls_recashkhas._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"lastOrderDate" /*RemoteObject*/ ))).runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 162;BA.debugLine="LstDate = MCode.Sf.Split(item.lastOrderDate,\"T\")";
Debug.ShouldStop(2);
_lstdate = cls_recashkhas._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(_item.getField(true,"lastOrderDate" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("T")));Debug.locals.put("LstDate", _lstdate);
 BA.debugLineNum = 163;BA.debugLine="If LstDate.get(0)=DateShamsi Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_lstdate.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),(_dateshamsi))) { 
 BA.debugLineNum = 164;BA.debugLine="LblKharid.Text= \"سفارش داده\"";
Debug.ShouldStop(8);
__ref.getField(false,"_lblkharid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("سفارش داده"));
 BA.debugLineNum = 165;BA.debugLine="LblKharid.Background=OpCol2";
Debug.ShouldStop(16);
__ref.getField(false,"_lblkharid" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_opcol2" /*RemoteObject*/ ).getObject()));
 }else {
 BA.debugLineNum = 167;BA.debugLine="LblKharid.Text= \"سفارش نداده\"";
Debug.ShouldStop(64);
__ref.getField(false,"_lblkharid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("سفارش نداده"));
 BA.debugLineNum = 168;BA.debugLine="LblKharid.Background=OpCol1";
Debug.ShouldStop(128);
__ref.getField(false,"_lblkharid" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_opcol1" /*RemoteObject*/ ).getObject()));
 };
 }else {
 BA.debugLineNum = 171;BA.debugLine="LblKharid.Text= \"سفارش نداده\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblkharid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("سفارش نداده"));
 BA.debugLineNum = 172;BA.debugLine="LblKharid.Background=OpCol1";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblkharid" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_opcol1" /*RemoteObject*/ ).getObject()));
 };
 BA.debugLineNum = 175;BA.debugLine="LstDate.Initialize";
Debug.ShouldStop(16384);
_lstdate.runVoidMethod ("Initialize");
 BA.debugLineNum = 176;BA.debugLine="If myCode.Is_Null(item.lastSeen).Length>2 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",cls_recashkhas._mycode.runMethod(true,"_is_null" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"lastSeen" /*RemoteObject*/ ))).runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 177;BA.debugLine="Dim LstDate As List = MCode.Sf.Split(item.lastSe";
Debug.ShouldStop(65536);
_lstdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdate = cls_recashkhas._mcode._sf /*RemoteObject*/ .runMethod(false,"_vvvv4",(Object)(_item.getField(true,"lastSeen" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("T")));Debug.locals.put("LstDate", _lstdate);Debug.locals.put("LstDate", _lstdate);
 BA.debugLineNum = 178;BA.debugLine="If LstDate.get(0)=DateShamsi Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_lstdate.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),(_dateshamsi))) { 
 BA.debugLineNum = 179;BA.debugLine="LblVisit.Text= \"ویزیت شده\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblvisit" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("ویزیت شده"));
 BA.debugLineNum = 180;BA.debugLine="LblVisit.Background=OpCol2";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblvisit" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_opcol2" /*RemoteObject*/ ).getObject()));
 }else {
 BA.debugLineNum = 182;BA.debugLine="LblVisit.Text= \"ویزیت نشده\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblvisit" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("ویزیت نشده"));
 BA.debugLineNum = 183;BA.debugLine="LblVisit.Background=OpCol1";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblvisit" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_opcol1" /*RemoteObject*/ ).getObject()));
 };
 }else {
 BA.debugLineNum = 186;BA.debugLine="LblVisit.Text= \"ویزیت نشده\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblvisit" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("ویزیت نشده"));
 BA.debugLineNum = 187;BA.debugLine="LblVisit.Background=OpCol1";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblvisit" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_opcol1" /*RemoteObject*/ ).getObject()));
 };
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _visit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("visit (cls_recashkhas) ","cls_recashkhas",10,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("visit")) { return __ref.runUserSub(false, "cls_recashkhas","visit", __ref);}
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 250;BA.debugLine="Sub visit";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian2";
Debug.ShouldStop(67108864);
_date = cls_recashkhas._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(cls_recashkhas._mcode.runMethod(true,"_datepersian" /*RemoteObject*/ ,__ref.getField(false, "ba"))));Debug.locals.put("Date", _date);Debug.locals.put("Date", _date);
 BA.debugLineNum = 252;BA.debugLine="If MCode.editFactor=False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",cls_recashkhas._mcode._editfactor /*RemoteObject*/ ,cls_recashkhas.__c.getField(true,"False"))) { 
 BA.debugLineNum = 253;BA.debugLine="MCode.FaktorSelect=\"\"";
Debug.ShouldStop(268435456);
cls_recashkhas._mcode._faktorselect /*RemoteObject*/  = BA.ObjectToString("");
 };
 BA.debugLineNum = 255;BA.debugLine="MCode.Action=\"SabtFaktor\"";
Debug.ShouldStop(1073741824);
cls_recashkhas._mcode._action /*RemoteObject*/  = BA.ObjectToString("SabtFaktor");
 BA.debugLineNum = 256;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from Tb";
Debug.ShouldStop(-2147483648);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = cls_recashkhas._mcode.runMethod(false,"_result" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 257;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 258;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Set";
Debug.ShouldStop(2);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblLogVisitSefaresh Set FldVisit = '"),_date,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 }else {
 BA.debugLineNum = 260;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefares";
Debug.ShouldStop(8);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("','"),_date,RemoteObject.createImmutable("','','','','')"))));
 };
 BA.debugLineNum = 262;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldLastVi";
Debug.ShouldStop(32);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblAshkhas Set FldLastVisit = '"),_date,RemoteObject.createImmutable("' Where fldCodetafzili = '"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 263;BA.debugLine="MCode.SaveUpdate(\"Update TblVisitorTour Set FldLa";
Debug.ShouldStop(64);
cls_recashkhas._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblVisitorTour Set FldLastVisit = '"),_date,RemoteObject.createImmutable("' Where FldC_Ashkhas = '"),cls_recashkhas._mcode._c_tafzili /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 264;BA.debugLine="SaveLastSeen";
Debug.ShouldStop(128);
__ref.runClassMethod (ir.parsikhesab.pakhsh.cls_recashkhas.class, "_savelastseen" /*RemoteObject*/ );
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}