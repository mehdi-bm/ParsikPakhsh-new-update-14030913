package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mycode {
private static mycode mostCurrent = new mycode();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.StringUtils _b64 = null;
public igolub.fused.b4a.location.android.location.LocationFWrapper.LocationFStatic _locationf = null;
public igolub.fused.b4a.location.LocationResultWrapper.LocationResultConstants _locationresult = null;
public igolub.fused.b4a.location.LocationRequestWrapper.LocationRequestConstants _locationrequest = null;
public igolub.fused.b4a.location.staticmodules.PriorityWrapper _priority = null;
public igolub.fused.b4a.location.staticmodules.GranularityWrapper _granularity = null;
public igolub.permissionmanager.b4a.PermissionsManagerFileProvider _fileprovider = null;
public igolub.permissionmanager.b4a.PermissionsManagerConstants _permissionsmanager = null;
public b4a.example.dateutils _dateutils = null;
public ir.parsikhesab.pakhsh.main _main = null;
public ir.parsikhesab.pakhsh.act_main _act_main = null;
public ir.parsikhesab.pakhsh.service_server _service_server = null;
public ir.parsikhesab.pakhsh.mcode _mcode = null;
public ir.parsikhesab.pakhsh.mdatabase _mdatabase = null;
public ir.parsikhesab.pakhsh.gpswiget _gpswiget = null;
public ir.parsikhesab.pakhsh.fusedlocationservice _fusedlocationservice = null;
public ir.parsikhesab.pakhsh.service_helper _service_helper = null;
public ir.parsikhesab.pakhsh.act_selectmantage _act_selectmantage = null;
public ir.parsikhesab.pakhsh.act_reprizfactorvisitor _act_reprizfactorvisitor = null;
public ir.parsikhesab.pakhsh.act_choose_report _act_choose_report = null;
public ir.parsikhesab.pakhsh.act_emza _act_emza = null;
public ir.parsikhesab.pakhsh.act_havaletozie _act_havaletozie = null;
public ir.parsikhesab.pakhsh.act_imageslideshow _act_imageslideshow = null;
public ir.parsikhesab.pakhsh.act_kala_listi _act_kala_listi = null;
public ir.parsikhesab.pakhsh.act_kaladefault _act_kaladefault = null;
public ir.parsikhesab.pakhsh.act_kalapaging _act_kalapaging = null;
public ir.parsikhesab.pakhsh.act_kalapaging2 _act_kalapaging2 = null;
public ir.parsikhesab.pakhsh.act_locationmoshtarian _act_locationmoshtarian = null;
public ir.parsikhesab.pakhsh.act_locationvisitor _act_locationvisitor = null;
public ir.parsikhesab.pakhsh.act_mali _act_mali = null;
public ir.parsikhesab.pakhsh.act_moshtarian _act_moshtarian = null;
public ir.parsikhesab.pakhsh.act_newashkhas _act_newashkhas = null;
public ir.parsikhesab.pakhsh.act_notif _act_notif = null;
public ir.parsikhesab.pakhsh.act_printmali _act_printmali = null;
public ir.parsikhesab.pakhsh.act_printpic _act_printpic = null;
public ir.parsikhesab.pakhsh.act_printpic2 _act_printpic2 = null;
public ir.parsikhesab.pakhsh.act_profile _act_profile = null;
public ir.parsikhesab.pakhsh.act_repfactors _act_repfactors = null;
public ir.parsikhesab.pakhsh.act_repfactorvisitor _act_repfactorvisitor = null;
public ir.parsikhesab.pakhsh.act_reportrizebargasht _act_reportrizebargasht = null;
public ir.parsikhesab.pakhsh.act_reportsoorathesab _act_reportsoorathesab = null;
public ir.parsikhesab.pakhsh.act_reportvisitor _act_reportvisitor = null;
public ir.parsikhesab.pakhsh.act_reportvisitor2 _act_reportvisitor2 = null;
public ir.parsikhesab.pakhsh.act_restore _act_restore = null;
public ir.parsikhesab.pakhsh.act_rizefactorhavale _act_rizefactorhavale = null;
public ir.parsikhesab.pakhsh.act_rizfaktor _act_rizfaktor = null;
public ir.parsikhesab.pakhsh.act_rizhavale _act_rizhavale = null;
public ir.parsikhesab.pakhsh.act_sabad _act_sabad = null;
public ir.parsikhesab.pakhsh.act_sabtmarjooii _act_sabtmarjooii = null;
public ir.parsikhesab.pakhsh.act_sabtrizcheck _act_sabtrizcheck = null;
public ir.parsikhesab.pakhsh.act_saveinfocompany _act_saveinfocompany = null;
public ir.parsikhesab.pakhsh.act_savelocation _act_savelocation = null;
public ir.parsikhesab.pakhsh.act_search _act_search = null;
public ir.parsikhesab.pakhsh.act_selfaktor _act_selfaktor = null;
public ir.parsikhesab.pakhsh.act_senddata _act_senddata = null;
public ir.parsikhesab.pakhsh.act_setting _act_setting = null;
public ir.parsikhesab.pakhsh.act_settingpos _act_settingpos = null;
public ir.parsikhesab.pakhsh.act_showlocation _act_showlocation = null;
public ir.parsikhesab.pakhsh.act_support _act_support = null;
public ir.parsikhesab.pakhsh.act_ticket _act_ticket = null;
public ir.parsikhesab.pakhsh.act_video _act_video = null;
public ir.parsikhesab.pakhsh.clskala _clskala = null;
public ir.parsikhesab.pakhsh.dbutils _dbutils = null;
public ir.parsikhesab.pakhsh.firebasemessaging _firebasemessaging = null;
public ir.parsikhesab.pakhsh.geoservice _geoservice = null;
public ir.parsikhesab.pakhsh.imagedownloader _imagedownloader = null;
public ir.parsikhesab.pakhsh.myreceiver _myreceiver = null;
public ir.parsikhesab.pakhsh.service_gps _service_gps = null;
public ir.parsikhesab.pakhsh.service_notification _service_notification = null;
public ir.parsikhesab.pakhsh.signaturecapture _signaturecapture = null;
public ir.parsikhesab.pakhsh.starter _starter = null;
public ir.parsikhesab.pakhsh.tracker _tracker = null;
public ir.parsikhesab.pakhsh.wiget_service _wiget_service = null;
public ir.parsikhesab.pakhsh.xmlviewex _xmlviewex = null;
public ir.parsikhesab.pakhsh.newinst2 _newinst2 = null;
public ir.parsikhesab.pakhsh.base64encodedecodeimage _base64encodedecodeimage = null;
public ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public static void  _senderror(anywheresoftware.b4a.BA _ba,String _message,String _action) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "senderror", false))
	 {Debug.delegate(null, "senderror", new Object[] {_ba,_message,_action}); return;}
ResumableSub_SendError rsub = new ResumableSub_SendError(null,_ba,_message,_action);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
}
public static class ResumableSub_SendError extends BA.ResumableSub {
public ResumableSub_SendError(ir.parsikhesab.pakhsh.mycode parent,anywheresoftware.b4a.BA _ba,String _message,String _action) {
this.parent = parent;
this._ba = _ba;
this._message = _message;
this._action = _action;
}
ir.parsikhesab.pakhsh.mycode parent;
anywheresoftware.b4a.BA _ba;
String _message;
String _action;
String _datemiladi = "";
String _time = "";
ir.parsikhesab.pakhsh.mcode._adapterandroidlog _item = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mycode";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="If MCode.IsConnected Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._mcode._isconnected /*boolean*/ (_ba)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="Dim DateMiladi As String = MCode.ConvertNumbersPe";
_datemiladi = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (_ba,anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="Dim item As AdapterAndroidLog";
_item = new ir.parsikhesab.pakhsh.mcode._adapterandroidlog();
RDebugUtils.currentLine=19333131;
 //BA.debugLineNum = 19333131;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=19333132;
 //BA.debugLineNum = 19333132;BA.debugLine="item.date=MCode.ConvertNumbersPersian2English(MC";
_item.date /*String*/  = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (_ba,parent.mostCurrent._mcode._datepersian /*String*/ (_ba));
RDebugUtils.currentLine=19333133;
 //BA.debugLineNum = 19333133;BA.debugLine="item.time=MCode.ConvertNumbersPersian2English(Ti";
_item.time /*String*/  = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (_ba,_time);
RDebugUtils.currentLine=19333134;
 //BA.debugLineNum = 19333134;BA.debugLine="item.message=message";
_item.message /*String*/  = _message;
RDebugUtils.currentLine=19333135;
 //BA.debugLineNum = 19333135;BA.debugLine="item.Action=action";
_item.Action /*String*/  = _action;
RDebugUtils.currentLine=19333136;
 //BA.debugLineNum = 19333136;BA.debugLine="CallSubDelayed2(Service_Server,\"SaveAndroidLog\",i";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2((_ba.processBA == null ? _ba : _ba.processBA),(Object)(parent.mostCurrent._service_server.getObject()),"SaveAndroidLog",(Object)(_item));
RDebugUtils.currentLine=19333137;
 //BA.debugLineNum = 19333137;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mycode", "senderror"),(int) (200));
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
RDebugUtils.currentLine=19333142;
 //BA.debugLineNum = 19333142;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setsetting(anywheresoftware.b4a.BA _ba,String _sfilename,String _skey,String _svalue) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "setsetting", false))
	 {return ((String) Debug.delegate(null, "setsetting", new Object[] {_ba,_sfilename,_skey,_svalue}));}
anywheresoftware.b4a.objects.collections.Map _m1 = null;
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Sub setSetting(sFilename As String,sKey As String,";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Dim m1 As Map";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="m1.Initialize";
_m1.Initialize();
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="If File.Exists(File.DirInternalCache,sFilename) =";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_sfilename)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="m1 = File.ReadMap(File.DirInternalCache,sFilenam";
_m1 = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_sfilename);
 };
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="m1.Put(sKey,b64.EncodeBase64(sValue.GetBytes(\"UTF";
_m1.Put((Object)(_skey),(Object)(_b64.EncodeBase64(_svalue.getBytes("UTF8"))));
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="File.WriteMap(File.DirInternalCache,sFilename,m1)";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_sfilename,_m1);
RDebugUtils.currentLine=17891336;
 //BA.debugLineNum = 17891336;BA.debugLine="End Sub";
return "";
}
public static String  _getsetting(anywheresoftware.b4a.BA _ba,String _sfilename,String _skey,String _sdefault) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "getsetting", false))
	 {return ((String) Debug.delegate(null, "getsetting", new Object[] {_ba,_sfilename,_skey,_sdefault}));}
anywheresoftware.b4a.objects.collections.Map _m1 = null;
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Sub getSetting(sFilename As String,sKey As String,";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Dim m1 As Map";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="m1.Initialize";
_m1.Initialize();
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="If File.Exists(File.DirInternalCache,sFilename) =";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_sfilename)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="m1 = File.ReadMap(File.DirInternalCache,sFilena";
_m1 = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_sfilename);
 }else {
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="Return sDefault";
if (true) return _sdefault;
 };
RDebugUtils.currentLine=17956872;
 //BA.debugLineNum = 17956872;BA.debugLine="If m1.ContainsKey(sKey) = True Then";
if (_m1.ContainsKey((Object)(_skey))==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=17956873;
 //BA.debugLineNum = 17956873;BA.debugLine="Return BytesToString( b64.DecodeBase64(m1.get(sK";
if (true) return anywheresoftware.b4a.keywords.Common.BytesToString(_b64.DecodeBase64(BA.ObjectToString(_m1.Get((Object)(_skey)))),(int) (0),_b64.DecodeBase64(BA.ObjectToString(_m1.Get((Object)(_skey)))).length,"UTF-8");
 }else {
RDebugUtils.currentLine=17956875;
 //BA.debugLineNum = 17956875;BA.debugLine="Return sDefault";
if (true) return _sdefault;
 };
RDebugUtils.currentLine=17956877;
 //BA.debugLineNum = 17956877;BA.debugLine="End Sub";
return "";
}
public static String  _is_null_adad(anywheresoftware.b4a.BA _ba,String _data) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "is_null_adad", false))
	 {return ((String) Debug.delegate(null, "is_null_adad", new Object[] {_ba,_data}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub Is_Null_adad(data As String) As String";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="Try";
try {RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="If (data=Null Or data=\"null\" Or data=\"\" Or IsNum";
if ((_data== null || (_data).equals("null") || (_data).equals("") || anywheresoftware.b4a.keywords.Common.IsNumber(_data)==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="Return 0";
if (true) return BA.NumberToString(0);
 }else {
RDebugUtils.currentLine=18546693;
 //BA.debugLineNum = 18546693;BA.debugLine="Return data";
if (true) return _data;
 };
 } 
       catch (Exception e8) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e8);RDebugUtils.currentLine=18546696;
 //BA.debugLineNum = 18546696;BA.debugLine="Return 0";
if (true) return BA.NumberToString(0);
 };
RDebugUtils.currentLine=18546698;
 //BA.debugLineNum = 18546698;BA.debugLine="End Sub";
return "";
}
public static int  _is_int(anywheresoftware.b4a.BA _ba,String _data) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "is_int", false))
	 {return ((Integer) Debug.delegate(null, "is_int", new Object[] {_ba,_data}));}
int _n = 0;
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Public Sub Is_int(data As String) As Int";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="Try";
try {RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="If IsNumber(data) And data<>Null Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_data) && _data!= null) { 
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="Dim n As Int=data";
_n = (int)(Double.parseDouble(_data));
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="Return n";
if (true) return _n;
 }else {
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
 } 
       catch (Exception e9) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e9);RDebugUtils.currentLine=18350089;
 //BA.debugLineNum = 18350089;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=18350090;
 //BA.debugLineNum = 18350090;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("518350090",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=18350093;
 //BA.debugLineNum = 18350093;BA.debugLine="End Sub";
return 0;
}
public static String  _is_null(anywheresoftware.b4a.BA _ba,String _data) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "is_null", false))
	 {return ((String) Debug.delegate(null, "is_null", new Object[] {_ba,_data}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Public Sub Is_Null(data As String) As String";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="Try";
try {RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="If (data=Null Or data=\"null\") Then";
if ((_data== null || (_data).equals("null"))) { 
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="Return \"\"";
if (true) return "";
 }else {
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="Return data";
if (true) return _data;
 };
 } 
       catch (Exception e8) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e8);RDebugUtils.currentLine=18481160;
 //BA.debugLineNum = 18481160;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=18481162;
 //BA.debugLineNum = 18481162;BA.debugLine="End Sub";
return "";
}
public static String  _adadtoprice(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "adadtoprice", false))
	 {return ((String) Debug.delegate(null, "adadtoprice", new Object[] {_ba,_str}));}
String _result = "";
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Public Sub AdadToPrice(str As String) As String";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Dim result As String";
_result = "";
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="If IsNumber(str) And str>0 Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_str) && (double)(Double.parseDouble(_str))>0) { 
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="result=NumberFormat2(str,0,0,0,True)&\" \"&MCode.V";
_result = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_str)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
 }else {
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="result=0";
_result = BA.NumberToString(0);
 };
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="End Sub";
return "";
}
public static String  _between(anywheresoftware.b4a.BA _ba,long _t1,long _t2) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "between", false))
	 {return ((String) Debug.delegate(null, "between", new Object[] {_ba,_t1,_t2}));}
long _t = 0L;
int _days = 0;
int _hours = 0;
int _minutes = 0;
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Sub between(t1 As Long,t2 As Long) As String";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="Dim t As Long=Abs(t1-t2)";
_t = (long) (anywheresoftware.b4a.keywords.Common.Abs(_t1-_t2));
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="Dim days, hours, minutes As Int";
_days = 0;
_hours = 0;
_minutes = 0;
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="days = Floor(t / DateTime.TicksPerDay)";
_days = (int) (anywheresoftware.b4a.keywords.Common.Floor(_t/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerDay));
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="hours = Floor((t Mod DateTime.TicksPerDay) / Date";
_hours = (int) (anywheresoftware.b4a.keywords.Common.Floor((_t%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerDay)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour));
RDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="minutes = Floor((t Mod DateTime.TicksPerHour) / D";
_minutes = (int) (anywheresoftware.b4a.keywords.Common.Floor((_t%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute));
RDebugUtils.currentLine=17825799;
 //BA.debugLineNum = 17825799;BA.debugLine="Return days&\"روز و \"&hours&\"ساعت و \"&minutes&\"دقی";
if (true) return BA.NumberToString(_days)+"روز و "+BA.NumberToString(_hours)+"ساعت و "+BA.NumberToString(_minutes)+"دقیقه ";
RDebugUtils.currentLine=17825800;
 //BA.debugLineNum = 17825800;BA.debugLine="End Sub";
return "";
}
public static boolean  _check_is_null(anywheresoftware.b4a.BA _ba,String _data) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "check_is_null", false))
	 {return ((Boolean) Debug.delegate(null, "check_is_null", new Object[] {_ba,_data}));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Public Sub Check_Is_Null(data As String) As Boolea";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="If (data=Null Or data=\"null\") Then";
if ((_data== null || (_data).equals("null"))) { 
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=18415622;
 //BA.debugLineNum = 18415622;BA.debugLine="End Sub";
return false;
}
public static boolean  _check_null_or_notnumber(anywheresoftware.b4a.BA _ba,String _data) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "check_null_or_notnumber", false))
	 {return ((Boolean) Debug.delegate(null, "check_null_or_notnumber", new Object[] {_ba,_data}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Public Sub Check_Null_or_NotNumber(data As String)";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="If (data=Null Or IsNumber(data)=False) Then";
if ((_data== null || anywheresoftware.b4a.keywords.Common.IsNumber(_data)==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=18677766;
 //BA.debugLineNum = 18677766;BA.debugLine="End Sub";
return false;
}
public static String  _closeactivities(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "closeactivities", false))
	 {return ((String) Debug.delegate(null, "closeactivities", new Object[] {_ba}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Sub CloseActivities";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
_jo.RunMethod("finishAffinity",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="End Sub";
return "";
}
public static String  _deletecash(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "deletecash", false))
	 {return ((String) Debug.delegate(null, "deletecash", new Object[] {_ba}));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Sub DeleteCash";
RDebugUtils.currentLine=18219014;
 //BA.debugLineNum = 18219014;BA.debugLine="End Sub";
return "";
}
public static String  _downloadimage(anywheresoftware.b4a.BA _ba,String _link,anywheresoftware.b4a.objects.ImageViewWrapper _ph) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "downloadimage", false))
	 {return ((String) Debug.delegate(null, "downloadimage", new Object[] {_ba,_link,_ph}));}
com.glide.Hitex_Glide _glide = null;
String _lowercaselink = "";
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Public Sub DownloadImage(Link As String,ph As Imag";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="Dim Glide As Hitex_Glide";
_glide = new com.glide.Hitex_Glide();
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="Glide.Get.ClearDiskCache";
_glide.Get(_ba).ClearDiskCache();
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="Glide.Get.ClearMemory";
_glide.Get(_ba).ClearMemory((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="Dim LowerCaseLink As String = Link.ToLowerCase";
_lowercaselink = _link.toLowerCase();
RDebugUtils.currentLine=18874374;
 //BA.debugLineNum = 18874374;BA.debugLine="If LowerCaseLink.Contains(\"jpg\") Or LowerCaseLink";
if (_lowercaselink.contains("jpg") || _lowercaselink.contains("jpeg") || _lowercaselink.contains("png")) { 
 }else {
 };
RDebugUtils.currentLine=18874380;
 //BA.debugLineNum = 18874380;BA.debugLine="ph.Tag=Null";
_ph.setTag(anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=18874381;
 //BA.debugLineNum = 18874381;BA.debugLine="Log(\"show= \" & Link)";
anywheresoftware.b4a.keywords.Common.LogImpl("518874381","show= "+_link,0);
RDebugUtils.currentLine=18874385;
 //BA.debugLineNum = 18874385;BA.debugLine="Glide.Load2(Link).Apply(Glide.RequestOptions.Plac";
_glide.Load2(_ba,_link).Apply(_glide.getRequestOptions().Placeholder(mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ )).Apply(_glide.getRO().FitCenter()).Into(_ph);
RDebugUtils.currentLine=18874387;
 //BA.debugLineNum = 18874387;BA.debugLine="End Sub";
return "";
}
public static String  _downloadimage2(anywheresoftware.b4a.BA _ba,String _link,anywheresoftware.b4a.objects.ImageViewWrapper _ph) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "downloadimage2", false))
	 {return ((String) Debug.delegate(null, "downloadimage2", new Object[] {_ba,_link,_ph}));}
uk.co.martinpearman.b4a.squareup.picasso.Picasso _pic = null;
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Public Sub DownloadImage2(Link As String,ph As Ima";
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Dim pic As Picasso";
_pic = new uk.co.martinpearman.b4a.squareup.picasso.Picasso();
RDebugUtils.currentLine=19005446;
 //BA.debugLineNum = 19005446;BA.debugLine="ph.Tag=Null";
_ph.setTag(anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=19005447;
 //BA.debugLineNum = 19005447;BA.debugLine="Log(\"show= \" & Link)";
anywheresoftware.b4a.keywords.Common.LogImpl("519005447","show= "+_link,0);
RDebugUtils.currentLine=19005449;
 //BA.debugLineNum = 19005449;BA.debugLine="pic.Initialize";
_pic.Initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=19005450;
 //BA.debugLineNum = 19005450;BA.debugLine="pic.LoadUrl(Link).IntoImageView(ph)";
_pic.LoadUrl(_link).IntoImageView((android.widget.ImageView)(_ph.getObject()));
RDebugUtils.currentLine=19005458;
 //BA.debugLineNum = 19005458;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.ImageViewWrapper  _downloadimage3(anywheresoftware.b4a.BA _ba,String _link) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "downloadimage3", false))
	 {return ((anywheresoftware.b4a.objects.ImageViewWrapper) Debug.delegate(null, "downloadimage3", new Object[] {_ba,_link}));}
com.glide.Hitex_Glide _glide = null;
anywheresoftware.b4a.objects.ImageViewWrapper _ph = null;
String _lowercaselink = "";
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Public Sub DownloadImage3(Link As String) As Image";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Dim Glide As Hitex_Glide";
_glide = new com.glide.Hitex_Glide();
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="Dim ph As ImageView";
_ph = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="ph.Initialize(\"ph\")";
_ph.Initialize(_ba,"ph");
RDebugUtils.currentLine=19070982;
 //BA.debugLineNum = 19070982;BA.debugLine="Dim LowerCaseLink As String = Link.ToLowerCase";
_lowercaselink = _link.toLowerCase();
RDebugUtils.currentLine=19070983;
 //BA.debugLineNum = 19070983;BA.debugLine="If LowerCaseLink.Contains(\"jpg\") Or LowerCaseLink";
if (_lowercaselink.contains("jpg") || _lowercaselink.contains("jpeg") || _lowercaselink.contains("png")) { 
RDebugUtils.currentLine=19070984;
 //BA.debugLineNum = 19070984;BA.debugLine="ph.Tag=Null";
_ph.setTag(anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=19070985;
 //BA.debugLineNum = 19070985;BA.debugLine="Log(\"show= \" & Link)";
anywheresoftware.b4a.keywords.Common.LogImpl("519070985","show= "+_link,0);
RDebugUtils.currentLine=19070986;
 //BA.debugLineNum = 19070986;BA.debugLine="Glide.Load2(Link).Apply(Glide.RequestOptions).Ap";
_glide.Load2(_ba,_link).Apply(_glide.getRequestOptions()).Apply(_glide.getRO().FitCenter()).Into(_ph);
 };
RDebugUtils.currentLine=19070988;
 //BA.debugLineNum = 19070988;BA.debugLine="Return ph";
if (true) return _ph;
RDebugUtils.currentLine=19070989;
 //BA.debugLineNum = 19070989;BA.debugLine="End Sub";
return null;
}
public static String  _downloadimage5(anywheresoftware.b4a.BA _ba,String _codekala,String _fldpathpic,anywheresoftware.b4a.objects.ImageViewWrapper _ph) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "downloadimage5", false))
	 {return ((String) Debug.delegate(null, "downloadimage5", new Object[] {_ba,_codekala,_fldpathpic,_ph}));}
String _link = "";
String _filename = "";
anywheresoftware.b4a.objects.collections.Map _links = null;
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Public Sub DownloadImage5(CodeKala As String,fldPa";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="Dim Link As String";
_link = "";
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="Log(\"CodeKala \"& CodeKala)";
anywheresoftware.b4a.keywords.Common.LogImpl("518939906","CodeKala "+_codekala,0);
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="If MCode.PicOnline=1 Then";
if ((mostCurrent._mcode._piconline /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="Dim filename As String=CodeKala & \".jpg\"";
_filename = _codekala+".jpg";
RDebugUtils.currentLine=18939910;
 //BA.debugLineNum = 18939910;BA.debugLine="If fldPathPic=\"0\" Then";
if ((_fldpathpic).equals("0")) { 
RDebugUtils.currentLine=18939913;
 //BA.debugLineNum = 18939913;BA.debugLine="If File.Exists(File.DirDefaultExternal&\"/Parsik";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/AksKala",_filename)) { 
RDebugUtils.currentLine=18939914;
 //BA.debugLineNum = 18939914;BA.debugLine="File.Delete(File.DirDefaultExternal&\"/Parsik/A";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/AksKala",_filename);
 };
RDebugUtils.currentLine=18939916;
 //BA.debugLineNum = 18939916;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(CodeKala)";
mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = mostCurrent._mcode._getpickala /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (_ba,_codekala);
RDebugUtils.currentLine=18939917;
 //BA.debugLineNum = 18939917;BA.debugLine="ph.Bitmap=MCode.placeHolder";
_ph.setBitmap((android.graphics.Bitmap)(mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=18939919;
 //BA.debugLineNum = 18939919;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (_ba)) { 
RDebugUtils.currentLine=18939920;
 //BA.debugLineNum = 18939920;BA.debugLine="If File.Exists(File.DirDefaultExternal&\"/Parsi";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/AksKala",_filename)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=18939921;
 //BA.debugLineNum = 18939921;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(CodeKala)";
mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = mostCurrent._mcode._getpickala /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (_ba,_codekala);
RDebugUtils.currentLine=18939922;
 //BA.debugLineNum = 18939922;BA.debugLine="ph.Bitmap=MCode.placeHolder";
_ph.setBitmap((android.graphics.Bitmap)(mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=18939923;
 //BA.debugLineNum = 18939923;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=18939928;
 //BA.debugLineNum = 18939928;BA.debugLine="Link=MCode.ImageUrl &fldPathPic";
_link = mostCurrent._mcode._imageurl /*String*/ +_fldpathpic;
RDebugUtils.currentLine=18939929;
 //BA.debugLineNum = 18939929;BA.debugLine="Log(\"Link= \" & MCode.ImageUrl & fldPathPic)";
anywheresoftware.b4a.keywords.Common.LogImpl("518939929","Link= "+mostCurrent._mcode._imageurl /*String*/ +_fldpathpic,0);
RDebugUtils.currentLine=18939931;
 //BA.debugLineNum = 18939931;BA.debugLine="Dim links As Map";
_links = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=18939932;
 //BA.debugLineNum = 18939932;BA.debugLine="links.Initialize";
_links.Initialize();
RDebugUtils.currentLine=18939933;
 //BA.debugLineNum = 18939933;BA.debugLine="links.Put(ph, Link)";
_links.Put((Object)(_ph.getObject()),(Object)(_link));
RDebugUtils.currentLine=18939934;
 //BA.debugLineNum = 18939934;BA.debugLine="MCode.CodeKalaImage=CodeKala";
mostCurrent._mcode._codekalaimage /*String*/  = _codekala;
RDebugUtils.currentLine=18939935;
 //BA.debugLineNum = 18939935;BA.debugLine="CallSubDelayed2(ImageDownloader, \"Download\", l";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2((_ba.processBA == null ? _ba : _ba.processBA),(Object)(mostCurrent._imagedownloader.getObject()),"Download",(Object)(_links));
RDebugUtils.currentLine=18939936;
 //BA.debugLineNum = 18939936;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(CodeKala)";
mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = mostCurrent._mcode._getpickala /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (_ba,_codekala);
RDebugUtils.currentLine=18939937;
 //BA.debugLineNum = 18939937;BA.debugLine="ph.Bitmap=MCode.placeHolder";
_ph.setBitmap((android.graphics.Bitmap)(mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=18939939;
 //BA.debugLineNum = 18939939;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(CodeKala)";
mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = mostCurrent._mcode._getpickala /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (_ba,_codekala);
RDebugUtils.currentLine=18939940;
 //BA.debugLineNum = 18939940;BA.debugLine="ph.Bitmap=MCode.placeHolder";
_ph.setBitmap((android.graphics.Bitmap)(mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
 };
 };
 }else {
RDebugUtils.currentLine=18939945;
 //BA.debugLineNum = 18939945;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(CodeKala)";
mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = mostCurrent._mcode._getpickala /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (_ba,_codekala);
RDebugUtils.currentLine=18939946;
 //BA.debugLineNum = 18939946;BA.debugLine="ph.Bitmap=MCode.placeHolder";
_ph.setBitmap((android.graphics.Bitmap)(mostCurrent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
 };
RDebugUtils.currentLine=18939948;
 //BA.debugLineNum = 18939948;BA.debugLine="End Sub";
return "";
}
public static byte[]  _getbytefrombitmap(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img,int _quality) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "getbytefrombitmap", false))
	 {return ((byte[]) Debug.delegate(null, "getbytefrombitmap", new Object[] {_ba,_img,_quality}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
byte[] _data = null;
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Sub GetByteFromBitmap(img As Bitmap, Quality As In";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="out.InitializeToBytesArray(1)";
_out.InitializeToBytesArray((int) (1));
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="img.WriteToStream(out,Quality,\"JPEG\")";
_img.WriteToStream((java.io.OutputStream)(_out.getObject()),_quality,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="data = out.ToBytesArray";
_data = _out.ToBytesArray();
RDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=18087943;
 //BA.debugLineNum = 18087943;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=18087944;
 //BA.debugLineNum = 18087944;BA.debugLine="End Sub";
return null;
}
public static String  _getnametafsilibycode(anywheresoftware.b4a.BA _ba,String _code) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "getnametafsilibycode", false))
	 {return ((String) Debug.delegate(null, "getnametafsilibycode", new Object[] {_ba,_code}));}
String _name = "";
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Public Sub GetNameTafsiliByCode(code As String)As";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="Dim name As String";
_name = "";
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="name=MCode.SingleResult(\"select fldSharheTafzili";
_name = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (_ba,"select fldSharheTafzili from TblAshkhas where fldCodetafzili="+_code));
RDebugUtils.currentLine=19136515;
 //BA.debugLineNum = 19136515;BA.debugLine="Return name";
if (true) return _name;
RDebugUtils.currentLine=19136516;
 //BA.debugLineNum = 19136516;BA.debugLine="End Sub";
return "";
}
public static String  _getpathpicbycodekala(anywheresoftware.b4a.BA _ba,String _codekala) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "getpathpicbycodekala", false))
	 {return ((String) Debug.delegate(null, "getpathpicbycodekala", new Object[] {_ba,_codekala}));}
String _path = "";
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Public Sub GetPathPicByCodeKala(CodeKala As String";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Try";
try {RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="If File.Exists(File.DirDefaultExternal &\"/Parsik";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/AksKala",_codekala+".jpg")) { 
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="Dim path As String=File.Combine(File.DirDefault";
_path = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/AksKala",_codekala+".jpg");
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="Return path";
if (true) return _path;
 }else {
RDebugUtils.currentLine=19202054;
 //BA.debugLineNum = 19202054;BA.debugLine="Return \"0\"";
if (true) return "0";
 };
 } 
       catch (Exception e9) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e9);RDebugUtils.currentLine=19202058;
 //BA.debugLineNum = 19202058;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("519202058",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=19202059;
 //BA.debugLineNum = 19202059;BA.debugLine="Return \"0\"";
if (true) return "0";
 };
RDebugUtils.currentLine=19202061;
 //BA.debugLineNum = 19202061;BA.debugLine="End Sub";
return "";
}
public static String  _gregorian_to_jalali(anywheresoftware.b4a.BA _ba,String _dt) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "gregorian_to_jalali", false))
	 {return ((String) Debug.delegate(null, "gregorian_to_jalali", new Object[] {_ba,_dt}));}
String _g_y = "";
String _g_m = "";
String _g_d = "";
int _gy = 0;
int _gm = 0;
int _gd = 0;
int _g_day_no = 0;
String[] _k = null;
int[] _g_days_in_month = null;
int[] _j_days_in_month = null;
int _i = 0;
int _j_day_no = 0;
int _j_np = 0;
int _jy = 0;
int _jm = 0;
int _jd = 0;
String _res = "";
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Sub gregorian_to_jalali(dt As String) As String";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="Dim g_y,g_m,g_d As String";
_g_y = "";
_g_m = "";
_g_d = "";
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="Dim gy,gm,gd,g_day_no As Int";
_gy = 0;
_gm = 0;
_gd = 0;
_g_day_no = 0;
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="Dim k() As String";
_k = new String[(int) (0)];
java.util.Arrays.fill(_k,"");
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="k = Regex.Split(\"/\",dt)";
_k = anywheresoftware.b4a.keywords.Common.Regex.Split("/",_dt);
RDebugUtils.currentLine=17760261;
 //BA.debugLineNum = 17760261;BA.debugLine="g_y = k(0)";
_g_y = _k[(int) (0)];
RDebugUtils.currentLine=17760262;
 //BA.debugLineNum = 17760262;BA.debugLine="g_m = k(1)";
_g_m = _k[(int) (1)];
RDebugUtils.currentLine=17760263;
 //BA.debugLineNum = 17760263;BA.debugLine="g_d = k(2)";
_g_d = _k[(int) (2)];
RDebugUtils.currentLine=17760264;
 //BA.debugLineNum = 17760264;BA.debugLine="Dim g_days_in_month(12) As Int";
_g_days_in_month = new int[(int) (12)];
;
RDebugUtils.currentLine=17760265;
 //BA.debugLineNum = 17760265;BA.debugLine="Dim j_days_in_month(12) As Int";
_j_days_in_month = new int[(int) (12)];
;
RDebugUtils.currentLine=17760266;
 //BA.debugLineNum = 17760266;BA.debugLine="g_days_in_month(0) = 31";
_g_days_in_month[(int) (0)] = (int) (31);
RDebugUtils.currentLine=17760267;
 //BA.debugLineNum = 17760267;BA.debugLine="g_days_in_month(1) = 28";
_g_days_in_month[(int) (1)] = (int) (28);
RDebugUtils.currentLine=17760268;
 //BA.debugLineNum = 17760268;BA.debugLine="g_days_in_month(2) = 31";
_g_days_in_month[(int) (2)] = (int) (31);
RDebugUtils.currentLine=17760269;
 //BA.debugLineNum = 17760269;BA.debugLine="g_days_in_month(3) = 30";
_g_days_in_month[(int) (3)] = (int) (30);
RDebugUtils.currentLine=17760270;
 //BA.debugLineNum = 17760270;BA.debugLine="g_days_in_month(4) = 31";
_g_days_in_month[(int) (4)] = (int) (31);
RDebugUtils.currentLine=17760271;
 //BA.debugLineNum = 17760271;BA.debugLine="g_days_in_month(5) = 30";
_g_days_in_month[(int) (5)] = (int) (30);
RDebugUtils.currentLine=17760272;
 //BA.debugLineNum = 17760272;BA.debugLine="g_days_in_month(6) = 31";
_g_days_in_month[(int) (6)] = (int) (31);
RDebugUtils.currentLine=17760273;
 //BA.debugLineNum = 17760273;BA.debugLine="g_days_in_month(7) = 31";
_g_days_in_month[(int) (7)] = (int) (31);
RDebugUtils.currentLine=17760274;
 //BA.debugLineNum = 17760274;BA.debugLine="g_days_in_month(8) = 30";
_g_days_in_month[(int) (8)] = (int) (30);
RDebugUtils.currentLine=17760275;
 //BA.debugLineNum = 17760275;BA.debugLine="g_days_in_month(9) = 31";
_g_days_in_month[(int) (9)] = (int) (31);
RDebugUtils.currentLine=17760276;
 //BA.debugLineNum = 17760276;BA.debugLine="g_days_in_month(10)= 30";
_g_days_in_month[(int) (10)] = (int) (30);
RDebugUtils.currentLine=17760277;
 //BA.debugLineNum = 17760277;BA.debugLine="g_days_in_month(11)= 31";
_g_days_in_month[(int) (11)] = (int) (31);
RDebugUtils.currentLine=17760279;
 //BA.debugLineNum = 17760279;BA.debugLine="j_days_in_month(0) = 31";
_j_days_in_month[(int) (0)] = (int) (31);
RDebugUtils.currentLine=17760280;
 //BA.debugLineNum = 17760280;BA.debugLine="j_days_in_month(1) = 31";
_j_days_in_month[(int) (1)] = (int) (31);
RDebugUtils.currentLine=17760281;
 //BA.debugLineNum = 17760281;BA.debugLine="j_days_in_month(2) = 31";
_j_days_in_month[(int) (2)] = (int) (31);
RDebugUtils.currentLine=17760282;
 //BA.debugLineNum = 17760282;BA.debugLine="j_days_in_month(3) = 31";
_j_days_in_month[(int) (3)] = (int) (31);
RDebugUtils.currentLine=17760283;
 //BA.debugLineNum = 17760283;BA.debugLine="j_days_in_month(4) = 31";
_j_days_in_month[(int) (4)] = (int) (31);
RDebugUtils.currentLine=17760284;
 //BA.debugLineNum = 17760284;BA.debugLine="j_days_in_month(5) = 31";
_j_days_in_month[(int) (5)] = (int) (31);
RDebugUtils.currentLine=17760285;
 //BA.debugLineNum = 17760285;BA.debugLine="j_days_in_month(6) = 30";
_j_days_in_month[(int) (6)] = (int) (30);
RDebugUtils.currentLine=17760286;
 //BA.debugLineNum = 17760286;BA.debugLine="j_days_in_month(7) = 30";
_j_days_in_month[(int) (7)] = (int) (30);
RDebugUtils.currentLine=17760287;
 //BA.debugLineNum = 17760287;BA.debugLine="j_days_in_month(8) = 30";
_j_days_in_month[(int) (8)] = (int) (30);
RDebugUtils.currentLine=17760288;
 //BA.debugLineNum = 17760288;BA.debugLine="j_days_in_month(9) = 30";
_j_days_in_month[(int) (9)] = (int) (30);
RDebugUtils.currentLine=17760289;
 //BA.debugLineNum = 17760289;BA.debugLine="j_days_in_month(10)= 30";
_j_days_in_month[(int) (10)] = (int) (30);
RDebugUtils.currentLine=17760290;
 //BA.debugLineNum = 17760290;BA.debugLine="j_days_in_month(11)= 29";
_j_days_in_month[(int) (11)] = (int) (29);
RDebugUtils.currentLine=17760292;
 //BA.debugLineNum = 17760292;BA.debugLine="gy = g_y - 1600";
_gy = (int) ((double)(Double.parseDouble(_g_y))-1600);
RDebugUtils.currentLine=17760293;
 //BA.debugLineNum = 17760293;BA.debugLine="gm = g_m - 1";
_gm = (int) ((double)(Double.parseDouble(_g_m))-1);
RDebugUtils.currentLine=17760294;
 //BA.debugLineNum = 17760294;BA.debugLine="gd = g_d - 1";
_gd = (int) ((double)(Double.parseDouble(_g_d))-1);
RDebugUtils.currentLine=17760296;
 //BA.debugLineNum = 17760296;BA.debugLine="g_day_no = 365 * gy + ((gy + 3) / 4) - ((gy + 99";
_g_day_no = (int) (365*_gy+((_gy+3)/(double)4)-((_gy+99)/(double)100)+((_gy+399)/(double)400));
RDebugUtils.currentLine=17760298;
 //BA.debugLineNum = 17760298;BA.debugLine="For i = 0 To gm - 1";
{
final int step38 = 1;
final int limit38 = (int) (_gm-1);
_i = (int) (0) ;
for (;_i <= limit38 ;_i = _i + step38 ) {
RDebugUtils.currentLine=17760299;
 //BA.debugLineNum = 17760299;BA.debugLine="g_day_no = g_day_no + g_days_in_month(i)";
_g_day_no = (int) (_g_day_no+_g_days_in_month[_i]);
 }
};
RDebugUtils.currentLine=17760304;
 //BA.debugLineNum = 17760304;BA.debugLine="If gm > 1 And ((gy Mod 4 = 0 And gy Mod 100 <> 0";
if (_gm>1 && ((_gy%4==0 && _gy%100!=0) || (_gy%400==0))) { 
RDebugUtils.currentLine=17760305;
 //BA.debugLineNum = 17760305;BA.debugLine="g_day_no = g_day_no + 1";
_g_day_no = (int) (_g_day_no+1);
 };
RDebugUtils.currentLine=17760309;
 //BA.debugLineNum = 17760309;BA.debugLine="g_day_no = g_day_no + gd";
_g_day_no = (int) (_g_day_no+_gd);
RDebugUtils.currentLine=17760311;
 //BA.debugLineNum = 17760311;BA.debugLine="Dim j_day_no,j_np,jy As Int";
_j_day_no = 0;
_j_np = 0;
_jy = 0;
RDebugUtils.currentLine=17760313;
 //BA.debugLineNum = 17760313;BA.debugLine="j_day_no = g_day_no - 79";
_j_day_no = (int) (_g_day_no-79);
RDebugUtils.currentLine=17760315;
 //BA.debugLineNum = 17760315;BA.debugLine="j_np = (j_day_no / 12053)";
_j_np = (int) ((_j_day_no/(double)12053));
RDebugUtils.currentLine=17760316;
 //BA.debugLineNum = 17760316;BA.debugLine="j_day_no = j_day_no Mod 12053";
_j_day_no = (int) (_j_day_no%12053);
RDebugUtils.currentLine=17760318;
 //BA.debugLineNum = 17760318;BA.debugLine="jy = 979 + 33 * j_np + 4 * (j_day_no / 1461)";
_jy = (int) (979+33*_j_np+4*(_j_day_no/(double)1461));
RDebugUtils.currentLine=17760320;
 //BA.debugLineNum = 17760320;BA.debugLine="j_day_no = j_day_no Mod 1461";
_j_day_no = (int) (_j_day_no%1461);
RDebugUtils.currentLine=17760324;
 //BA.debugLineNum = 17760324;BA.debugLine="If (j_day_no >= 366) Then";
if ((_j_day_no>=366)) { 
RDebugUtils.currentLine=17760325;
 //BA.debugLineNum = 17760325;BA.debugLine="jy = jy + ((j_day_no - 1) / 365)";
_jy = (int) (_jy+((_j_day_no-1)/(double)365));
RDebugUtils.currentLine=17760326;
 //BA.debugLineNum = 17760326;BA.debugLine="j_day_no = (j_day_no - 1) Mod 365";
_j_day_no = (int) ((_j_day_no-1)%365);
 };
RDebugUtils.currentLine=17760329;
 //BA.debugLineNum = 17760329;BA.debugLine="i = 0";
_i = (int) (0);
RDebugUtils.currentLine=17760330;
 //BA.debugLineNum = 17760330;BA.debugLine="Do While (i < 11 And j_day_no >= j_days_in_month(";
while ((_i<11 && _j_day_no>=_j_days_in_month[_i])) {
RDebugUtils.currentLine=17760331;
 //BA.debugLineNum = 17760331;BA.debugLine="j_day_no = j_day_no - j_days_in_month(i)";
_j_day_no = (int) (_j_day_no-_j_days_in_month[_i]);
RDebugUtils.currentLine=17760332;
 //BA.debugLineNum = 17760332;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=17760335;
 //BA.debugLineNum = 17760335;BA.debugLine="Dim jm,jd As Int";
_jm = 0;
_jd = 0;
RDebugUtils.currentLine=17760336;
 //BA.debugLineNum = 17760336;BA.debugLine="jm = i + 1";
_jm = (int) (_i+1);
RDebugUtils.currentLine=17760337;
 //BA.debugLineNum = 17760337;BA.debugLine="jd = j_day_no + 1";
_jd = (int) (_j_day_no+1);
RDebugUtils.currentLine=17760338;
 //BA.debugLineNum = 17760338;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=17760339;
 //BA.debugLineNum = 17760339;BA.debugLine="res = jy & \"/\" & jm & \"/\" & jd";
_res = BA.NumberToString(_jy)+"/"+BA.NumberToString(_jm)+"/"+BA.NumberToString(_jd);
RDebugUtils.currentLine=17760340;
 //BA.debugLineNum = 17760340;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=17760341;
 //BA.debugLineNum = 17760341;BA.debugLine="End Sub";
return "";
}
public static String  _is_null_price(anywheresoftware.b4a.BA _ba,String _data) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "is_null_price", false))
	 {return ((String) Debug.delegate(null, "is_null_price", new Object[] {_ba,_data}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Public Sub Is_Null_Price(data As String) As String";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="Try";
try {RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="If (data=Null Or data=\"null\" Or data=\"\" Or IsNum";
if ((_data== null || (_data).equals("null") || (_data).equals("") || anywheresoftware.b4a.keywords.Common.IsNumber(_data)==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="Return 0";
if (true) return BA.NumberToString(0);
 }else {
RDebugUtils.currentLine=18612229;
 //BA.debugLineNum = 18612229;BA.debugLine="Return NumberFormat(data,1,3)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_data)),(int) (1),(int) (3));
 };
 } 
       catch (Exception e8) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e8);RDebugUtils.currentLine=18612232;
 //BA.debugLineNum = 18612232;BA.debugLine="Return 0";
if (true) return BA.NumberToString(0);
 };
RDebugUtils.currentLine=18612234;
 //BA.debugLineNum = 18612234;BA.debugLine="End Sub";
return "";
}
public static boolean  _isnullorwhitespace(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "isnullorwhitespace", false))
	 {return ((Boolean) Debug.delegate(null, "isnullorwhitespace", new Object[] {_ba,_str}));}
boolean _b = false;
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Public Sub IsNullOrWhiteSpace(Str As String) As Bo";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Dim b As Boolean=False";
_b = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="b=IIf(Str=Null,True,False)";
_b = BA.ObjectToBoolean(((_str== null) ? ((Object)(anywheresoftware.b4a.keywords.Common.True)) : ((Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="b=IIf(Str=\"\",True,False)";
_b = BA.ObjectToBoolean((((_str).equals("")) ? ((Object)(anywheresoftware.b4a.keywords.Common.True)) : ((Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="b=IIf(Str=\" \",True,False)";
_b = BA.ObjectToBoolean((((_str).equals(" ")) ? ((Object)(anywheresoftware.b4a.keywords.Common.True)) : ((Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=19464197;
 //BA.debugLineNum = 19464197;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=19464198;
 //BA.debugLineNum = 19464198;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.List  _readobject(anywheresoftware.b4a.BA _ba,String _listname) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "readobject", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "readobject", new Object[] {_ba,_listname}));}
anywheresoftware.b4a.objects.collections.List _dateslist = null;
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _datesfile = null;
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Public Sub ReadObject(ListName As String) As List";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Dim datesList As List";
_dateslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="datesList.Initialize";
_dateslist.Initialize();
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="Try";
try {RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="Dim DatesFile As RandomAccessFile";
_datesfile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="DatesFile.Initialize(File.DirDefaultExternal, Li";
_datesfile.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_listname+".dat",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="datesList = DatesFile.ReadObject(0)";
_dateslist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_datesfile.ReadObject((long) (0))));
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="DatesFile.Close";
_datesfile.Close();
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="Log(ListName &\"===>>\"& datesList.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("518808840",_listname+"===>>"+BA.NumberToString(_dateslist.getSize()),0);
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="Return datesList";
if (true) return _dateslist;
 } 
       catch (Exception e11) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e11);RDebugUtils.currentLine=18808843;
 //BA.debugLineNum = 18808843;BA.debugLine="datesList.Clear";
_dateslist.Clear();
RDebugUtils.currentLine=18808844;
 //BA.debugLineNum = 18808844;BA.debugLine="Return datesList";
if (true) return _dateslist;
 };
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="End Sub";
return null;
}
public static String  _removesetting(anywheresoftware.b4a.BA _ba,String _sfilename,String _skey) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "removesetting", false))
	 {return ((String) Debug.delegate(null, "removesetting", new Object[] {_ba,_sfilename,_skey}));}
anywheresoftware.b4a.objects.collections.Map _m1 = null;
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Sub removeSetting(sFilename As String,sKey As Stri";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Dim m1 As Map";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="m1.Initialize";
_m1.Initialize();
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="If File.Exists(File.DirInternalCache,sFilename) =";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_sfilename)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="m1 = File.ReadMap(File.DirInternalCache,sFilenam";
_m1 = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_sfilename);
 }else {
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="If m1.ContainsKey(sKey) = True Then";
if (_m1.ContainsKey((Object)(_skey))==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=18022409;
 //BA.debugLineNum = 18022409;BA.debugLine="m1.Remove(sKey)";
_m1.Remove((Object)(_skey));
RDebugUtils.currentLine=18022410;
 //BA.debugLineNum = 18022410;BA.debugLine="File.WriteMap(File.DirInternalCache,sFilename,m1";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_sfilename,_m1);
 }else {
RDebugUtils.currentLine=18022412;
 //BA.debugLineNum = 18022412;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=18022414;
 //BA.debugLineNum = 18022414;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=18022415;
 //BA.debugLineNum = 18022415;BA.debugLine="End Sub";
return "";
}
public static String  _saveobject(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _dateslist,String _listname) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "saveobject", false))
	 {return ((String) Debug.delegate(null, "saveobject", new Object[] {_ba,_dateslist,_listname}));}
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _datesfile = null;
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Public Sub SaveObject(datesList As List,ListName A";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="If datesList.IsInitialized=False Then";
if (_dateslist.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="datesList.Initialize";
_dateslist.Initialize();
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="datesList.Clear";
_dateslist.Clear();
 };
RDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="Dim DatesFile As RandomAccessFile";
_datesfile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=18743302;
 //BA.debugLineNum = 18743302;BA.debugLine="DatesFile.Initialize(File.DirDefaultExternal, Lis";
_datesfile.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_listname+".dat",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=18743303;
 //BA.debugLineNum = 18743303;BA.debugLine="DatesFile.WriteObject(datesList,True,0)";
_datesfile.WriteObject((Object)(_dateslist.getObject()),anywheresoftware.b4a.keywords.Common.True,(long) (0));
RDebugUtils.currentLine=18743304;
 //BA.debugLineNum = 18743304;BA.debugLine="DatesFile.Close";
_datesfile.Close();
RDebugUtils.currentLine=18743305;
 //BA.debugLineNum = 18743305;BA.debugLine="Log(ListName &\"===\"& datesList.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("518743305",_listname+"==="+BA.NumberToString(_dateslist.getSize()),0);
RDebugUtils.currentLine=18743306;
 //BA.debugLineNum = 18743306;BA.debugLine="End Sub";
return "";
}
public static String  _setanimation(anywheresoftware.b4a.BA _ba,String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "setanimation", false))
	 {return ((String) Debug.delegate(null, "setanimation", new Object[] {_ba,_inanimation,_outanimation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="Dim in, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="in = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=18153479;
 //BA.debugLineNum = 18153479;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity((_ba.processBA == null ? _ba : _ba.processBA)));
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=18153481;
 //BA.debugLineNum = 18153481;BA.debugLine="End Sub";
return "";
}
public static String  _setstatusbarcolor(anywheresoftware.b4a.BA _ba,int _clr) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "setstatusbarcolor", false))
	 {return ((String) Debug.delegate(null, "setstatusbarcolor", new Object[] {_ba,_clr}));}
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Sub SetStatusBarColor(clr As Int)";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="If p.SdkVersion >= 21 Then";
if (_p.getSdkVersion()>=21) { 
RDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=18284549;
 //BA.debugLineNum = 18284549;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18284550;
 //BA.debugLineNum = 18284550;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
RDebugUtils.currentLine=18284551;
 //BA.debugLineNum = 18284551;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
RDebugUtils.currentLine=18284552;
 //BA.debugLineNum = 18284552;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr)";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
 };
RDebugUtils.currentLine=18284554;
 //BA.debugLineNum = 18284554;BA.debugLine="End Sub";
return "";
}
public static int  _toint(anywheresoftware.b4a.BA _ba,Object _obj) throws Exception{
RDebugUtils.currentModule="mycode";
if (Debug.shouldDelegate(null, "toint", false))
	 {return ((Integer) Debug.delegate(null, "toint", new Object[] {_ba,_obj}));}
int _num = 0;
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Public Sub ToInt(obj As Object) As Int";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Dim num As Int";
_num = 0;
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="num=obj";
_num = (int)(BA.ObjectToNumber(_obj));
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="Return num";
if (true) return _num;
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="End Sub";
return 0;
}
}