package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cl_appupdate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cl_appupdate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cl_appupdate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public int _err_nopkg = 0;
public int _err_notxt = 0;
public int _err_noapk = 0;
public int _err_txtrow = 0;
public int _err_html = 0;
public int _err_nospace = 0;
public int _err_noperm = 0;
public int _err_download = 0;
public int _err_http = 0;
public int _ok_init = 0;
public int _ok_curver = 0;
public int _ok_webver = 0;
public int _no_newerapk = 0;
public int _ok_newerapk = 0;
public int _ok_download = 0;
public int _ok_install = 0;
public Object _callback = null;
public String _event = "";
public String _spackagename = "";
public String _snewvertxt = "";
public String _snewverapk = "";
public int _sstatuscode = 0;
public String _susername = "";
public String _supassword = "";
public String _curver = "";
public String _webver = "";
public String _webclog = "";
public String _webfsize = "";
public boolean _sverbose = false;
public anywheresoftware.b4a.objects.PanelWrapper _pnlsplash = null;
public boolean _splashshowing = false;
public anywheresoftware.b4a.phone.Phone _phone = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public String _sharedfolder = "";
public boolean _usefileprovider = false;
public int _logcolor1 = 0;
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
public ir.parsikhesab.pakhsh.mycode _mycode = null;
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
public String  _initialize(ir.parsikhesab.pakhsh.cl_appupdate __ref,anywheresoftware.b4a.BA _ba,Object _callbackmodule,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callbackmodule,_eventname}));}
anywheresoftware.b4a.phone.Phone _p = null;
RDebugUtils.currentLine=125108224;
 //BA.debugLineNum = 125108224;BA.debugLine="Public Sub Initialize(CallbackModule As Object, Ev";
RDebugUtils.currentLine=125108225;
 //BA.debugLineNum = 125108225;BA.debugLine="Callback = CallbackModule";
__ref._callback /*Object*/  = _callbackmodule;
RDebugUtils.currentLine=125108226;
 //BA.debugLineNum = 125108226;BA.debugLine="Event = EventName";
__ref._event /*String*/  = _eventname;
RDebugUtils.currentLine=125108227;
 //BA.debugLineNum = 125108227;BA.debugLine="sPackageName = \"\"";
__ref._spackagename /*String*/  = "";
RDebugUtils.currentLine=125108228;
 //BA.debugLineNum = 125108228;BA.debugLine="sNewVerTxt = \"\"";
__ref._snewvertxt /*String*/  = "";
RDebugUtils.currentLine=125108229;
 //BA.debugLineNum = 125108229;BA.debugLine="sNewVerApk = \"\"";
__ref._snewverapk /*String*/  = "";
RDebugUtils.currentLine=125108230;
 //BA.debugLineNum = 125108230;BA.debugLine="sUserName = \"\"";
__ref._susername /*String*/  = "";
RDebugUtils.currentLine=125108231;
 //BA.debugLineNum = 125108231;BA.debugLine="sUPassword = \"\"";
__ref._supassword /*String*/  = "";
RDebugUtils.currentLine=125108232;
 //BA.debugLineNum = 125108232;BA.debugLine="sStatusCode = OK_INIT";
__ref._sstatuscode /*int*/  = __ref._ok_init /*int*/ ;
RDebugUtils.currentLine=125108233;
 //BA.debugLineNum = 125108233;BA.debugLine="curver = \"\"";
__ref._curver /*String*/  = "";
RDebugUtils.currentLine=125108234;
 //BA.debugLineNum = 125108234;BA.debugLine="webver = \"\"";
__ref._webver /*String*/  = "";
RDebugUtils.currentLine=125108235;
 //BA.debugLineNum = 125108235;BA.debugLine="sVerbose = False";
__ref._sverbose /*boolean*/  = __c.False;
RDebugUtils.currentLine=125108236;
 //BA.debugLineNum = 125108236;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=125108237;
 //BA.debugLineNum = 125108237;BA.debugLine="If p.SdkVersion >= 24 Or File.ExternalWritable =";
if (_p.getSdkVersion()>=24 || __c.File.getExternalWritable()==__c.False) { 
RDebugUtils.currentLine=125108238;
 //BA.debugLineNum = 125108238;BA.debugLine="UseFileProvider = True";
__ref._usefileprovider /*boolean*/  = __c.True;
RDebugUtils.currentLine=125108239;
 //BA.debugLineNum = 125108239;BA.debugLine="SharedFolder = File.Combine(File.DirInternal, \"s";
__ref._sharedfolder /*String*/  = __c.File.Combine(__c.File.getDirInternal(),"shared");
RDebugUtils.currentLine=125108240;
 //BA.debugLineNum = 125108240;BA.debugLine="File.MakeDir(\"\", SharedFolder)";
__c.File.MakeDir("",__ref._sharedfolder /*String*/ );
 }else {
RDebugUtils.currentLine=125108242;
 //BA.debugLineNum = 125108242;BA.debugLine="UseFileProvider = False";
__ref._usefileprovider /*boolean*/  = __c.False;
RDebugUtils.currentLine=125108243;
 //BA.debugLineNum = 125108243;BA.debugLine="SharedFolder = rp.GetSafeDirDefaultExternal(\"sha";
__ref._sharedfolder /*String*/  = __ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .GetSafeDirDefaultExternal("shared");
 };
RDebugUtils.currentLine=125108245;
 //BA.debugLineNum = 125108245;BA.debugLine="Log($\"SDK#: ${p.SdkVersion} - UseFP: ${UseFilePro";
__c.LogImpl("9125108245",("SDK#: "+__c.SmartStringFormatter("",(Object)(_p.getSdkVersion()))+" - UseFP: "+__c.SmartStringFormatter("",(Object)(__ref._usefileprovider /*boolean*/ ))+" - SharedFolder: "+__c.SmartStringFormatter("",(Object)(__ref._sharedfolder /*String*/ ))+""),0);
RDebugUtils.currentLine=125108246;
 //BA.debugLineNum = 125108246;BA.debugLine="End Sub";
return "";
}
public String  _setverbose(ir.parsikhesab.pakhsh.cl_appupdate __ref,boolean _verbose) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "setverbose", true))
	 {return ((String) Debug.delegate(ba, "setverbose", new Object[] {_verbose}));}
RDebugUtils.currentLine=125501440;
 //BA.debugLineNum = 125501440;BA.debugLine="Public Sub setVerbose(Verbose As Boolean)";
RDebugUtils.currentLine=125501441;
 //BA.debugLineNum = 125501441;BA.debugLine="sVerbose = Verbose";
__ref._sverbose /*boolean*/  = _verbose;
RDebugUtils.currentLine=125501442;
 //BA.debugLineNum = 125501442;BA.debugLine="newinst2.svcVerbose = Verbose";
_newinst2._svcverbose /*boolean*/  = _verbose;
RDebugUtils.currentLine=125501443;
 //BA.debugLineNum = 125501443;BA.debugLine="End Sub";
return "";
}
public void  _downloadapk(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "downloadapk", true))
	 {Debug.delegate(ba, "downloadapk", null); return;}
ResumableSub_DownloadApk rsub = new ResumableSub_DownloadApk(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadApk extends BA.ResumableSub {
public ResumableSub_DownloadApk(ir.parsikhesab.pakhsh.cl_appupdate parent,ir.parsikhesab.pakhsh.cl_appupdate __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cl_appupdate __ref;
ir.parsikhesab.pakhsh.cl_appupdate parent;
ir.parsikhesab.pakhsh.httpjob _j = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cl_appupdate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126091265;
 //BA.debugLineNum = 126091265;BA.debugLine="LogColor(\"---- AppUpdating.DownloadApk\", LogColor";
parent.__c.LogImpl("9126091265","---- AppUpdating.DownloadApk",__ref._logcolor1 /*int*/ );
RDebugUtils.currentLine=126091267;
 //BA.debugLineNum = 126091267;BA.debugLine="If sNewVerApk = \"\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((__ref._snewverapk /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126091268;
 //BA.debugLineNum = 126091268;BA.debugLine="sStatusCode = ERR_NOAPK";
__ref._sstatuscode /*int*/  = __ref._err_noapk /*int*/ ;
RDebugUtils.currentLine=126091269;
 //BA.debugLineNum = 126091269;BA.debugLine="If sVerbose Then Log($\"${TAB}missing apk file fu";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent.__c.LogImpl("9126091269",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"missing apk file full path indication"),0);
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=126091270;
 //BA.debugLineNum = 126091270;BA.debugLine="Finito";
__ref._finito /*String*/ (null);
RDebugUtils.currentLine=126091271;
 //BA.debugLineNum = 126091271;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=126091274;
 //BA.debugLineNum = 126091274;BA.debugLine="Dim j As HttpJob";
_j = new ir.parsikhesab.pakhsh.httpjob();
RDebugUtils.currentLine=126091275;
 //BA.debugLineNum = 126091275;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=126091276;
 //BA.debugLineNum = 126091276;BA.debugLine="j.Username = sUserName";
_j._username /*String*/  = __ref._susername /*String*/ ;
RDebugUtils.currentLine=126091277;
 //BA.debugLineNum = 126091277;BA.debugLine="j.Password = sUPassword";
_j._password /*String*/  = __ref._supassword /*String*/ ;
RDebugUtils.currentLine=126091278;
 //BA.debugLineNum = 126091278;BA.debugLine="j.Download(sNewVerApk)							'ex: j.Download(\"htt";
_j._download /*String*/ (null,__ref._snewverapk /*String*/ );
RDebugUtils.currentLine=126091279;
 //BA.debugLineNum = 126091279;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_appupdate", "downloadapk"), (Object)(_j));
this.state = 29;
return;
case 29:
//C
this.state = 11;
_j = (ir.parsikhesab.pakhsh.httpjob) result[1];
;
RDebugUtils.currentLine=126091280;
 //BA.debugLineNum = 126091280;BA.debugLine="Log($\"Donload ok? ${j.Success}\"$)";
parent.__c.LogImpl("9126091280",("Donload ok? "+parent.__c.SmartStringFormatter("",(Object)(_j._success /*boolean*/ ))+""),0);
RDebugUtils.currentLine=126091281;
 //BA.debugLineNum = 126091281;BA.debugLine="If j.Success Then";
if (true) break;

case 11:
//if
this.state = 28;
if (_j._success /*boolean*/ ) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=126091283;
 //BA.debugLineNum = 126091283;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=126091284;
 //BA.debugLineNum = 126091284;BA.debugLine="out = File.OpenOutput(SharedFolder,\"tmp.apk\",Fal";
_out = parent.__c.File.OpenOutput(__ref._sharedfolder /*String*/ ,"tmp.apk",parent.__c.False);
RDebugUtils.currentLine=126091285;
 //BA.debugLineNum = 126091285;BA.debugLine="File.Copy2(J.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=126091286;
 //BA.debugLineNum = 126091286;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=126091287;
 //BA.debugLineNum = 126091287;BA.debugLine="Log($\"Copy2 (saving) ok? TRUE\"$)";
parent.__c.LogImpl("9126091287",("Copy2 (saving) ok? TRUE"),0);
RDebugUtils.currentLine=126091288;
 //BA.debugLineNum = 126091288;BA.debugLine="sStatusCode = OK_DOWNLOAD";
__ref._sstatuscode /*int*/  = __ref._ok_download /*int*/ ;
RDebugUtils.currentLine=126091289;
 //BA.debugLineNum = 126091289;BA.debugLine="If sVerbose Then Log($\"${TAB}new apk version dow";
if (true) break;

case 14:
//if
this.state = 19;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
parent.__c.LogImpl("9126091289",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"new apk version downloaded and ready to install"),0);
if (true) break;

case 19:
//C
this.state = 28;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=126091291;
 //BA.debugLineNum = 126091291;BA.debugLine="Log($\"${TAB}Error: ${J.ErrorMessage}\"$)";
parent.__c.LogImpl("9126091291",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"Error: "+parent.__c.SmartStringFormatter("",(Object)(_j._errormessage /*String*/ ))+""),0);
RDebugUtils.currentLine=126091292;
 //BA.debugLineNum = 126091292;BA.debugLine="sStatusCode = ERR_HTTP";
__ref._sstatuscode /*int*/  = __ref._err_http /*int*/ ;
RDebugUtils.currentLine=126091293;
 //BA.debugLineNum = 126091293;BA.debugLine="If sVerbose Then Log($\"${TAB}error in httputils2";
if (true) break;

case 22:
//if
this.state = 27;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
parent.__c.LogImpl("9126091293",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"error in httputils2"),0);
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=126091294;
 //BA.debugLineNum = 126091294;BA.debugLine="ToastMessageShow(\"Error: \" & J.ErrorMessage, Tru";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_j._errormessage /*String*/ ),parent.__c.True);
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=126091296;
 //BA.debugLineNum = 126091296;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=126091297;
 //BA.debugLineNum = 126091297;BA.debugLine="Finito";
__ref._finito /*String*/ (null);
RDebugUtils.currentLine=126091298;
 //BA.debugLineNum = 126091298;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _installapk(ir.parsikhesab.pakhsh.cl_appupdate __ref,boolean _pstatus) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "installapk", true))
	 {return ((String) Debug.delegate(ba, "installapk", new Object[] {_pstatus}));}
RDebugUtils.currentLine=126156800;
 //BA.debugLineNum = 126156800;BA.debugLine="Public Sub InstallApk(pstatus As Boolean)";
RDebugUtils.currentLine=126156801;
 //BA.debugLineNum = 126156801;BA.debugLine="LogColor(\"---- AppUpdating.InstallApk\", LogColor1";
__c.LogImpl("9126156801","---- AppUpdating.InstallApk",__ref._logcolor1 /*int*/ );
RDebugUtils.currentLine=126156802;
 //BA.debugLineNum = 126156802;BA.debugLine="If pstatus Then";
if (_pstatus) { 
RDebugUtils.currentLine=126156803;
 //BA.debugLineNum = 126156803;BA.debugLine="SendInstallIntent";
__ref._sendinstallintent /*String*/ (null);
RDebugUtils.currentLine=126156804;
 //BA.debugLineNum = 126156804;BA.debugLine="sStatusCode = OK_INSTALL";
__ref._sstatuscode /*int*/  = __ref._ok_install /*int*/ ;
RDebugUtils.currentLine=126156805;
 //BA.debugLineNum = 126156805;BA.debugLine="If sVerbose Then Log(TAB & \"user asked to instal";
if (__ref._sverbose /*boolean*/ ) { 
__c.LogImpl("9126156805",__c.TAB+"user asked to install new apk",0);};
 }else {
RDebugUtils.currentLine=126156807;
 //BA.debugLineNum = 126156807;BA.debugLine="sStatusCode = ERR_NOPERM";
__ref._sstatuscode /*int*/  = __ref._err_noperm /*int*/ ;
RDebugUtils.currentLine=126156808;
 //BA.debugLineNum = 126156808;BA.debugLine="If sVerbose Then Log(TAB & \"no permissions from";
if (__ref._sverbose /*boolean*/ ) { 
__c.LogImpl("9126156808",__c.TAB+"no permissions from user to install new apk",0);};
 };
RDebugUtils.currentLine=126156810;
 //BA.debugLineNum = 126156810;BA.debugLine="Finito";
__ref._finito /*String*/ (null);
RDebugUtils.currentLine=126156811;
 //BA.debugLineNum = 126156811;BA.debugLine="End Sub";
return "";
}
public void  _readwebvn(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "readwebvn", true))
	 {Debug.delegate(ba, "readwebvn", null); return;}
ResumableSub_ReadWebVN rsub = new ResumableSub_ReadWebVN(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ReadWebVN extends BA.ResumableSub {
public ResumableSub_ReadWebVN(ir.parsikhesab.pakhsh.cl_appupdate parent,ir.parsikhesab.pakhsh.cl_appupdate __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cl_appupdate __ref;
ir.parsikhesab.pakhsh.cl_appupdate parent;
boolean _okwebver = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cl_appupdate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=126025729;
 //BA.debugLineNum = 126025729;BA.debugLine="LogColor(\"---- AppUpdating.ReadWebVN\", LogColor1)";
parent.__c.LogImpl("9126025729","---- AppUpdating.ReadWebVN",__ref._logcolor1 /*int*/ );
RDebugUtils.currentLine=126025730;
 //BA.debugLineNum = 126025730;BA.debugLine="Wait For(IsvalidWV) Complete (OkWebVer As Boolean";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_appupdate", "readwebvn"), __ref._isvalidwv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_okwebver = (Boolean) result[1];
;
RDebugUtils.currentLine=126025731;
 //BA.debugLineNum = 126025731;BA.debugLine="Finito";
__ref._finito /*String*/ (null);
RDebugUtils.currentLine=126025732;
 //BA.debugLineNum = 126025732;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setandstartsplashscreen(ir.parsikhesab.pakhsh.cl_appupdate __ref,anywheresoftware.b4a.objects.ActivityWrapper _callingact,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bm) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "setandstartsplashscreen", true))
	 {return ((String) Debug.delegate(ba, "setandstartsplashscreen", new Object[] {_callingact,_bm}));}
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bitimage = null;
RDebugUtils.currentLine=127270912;
 //BA.debugLineNum = 127270912;BA.debugLine="Public Sub SetAndStartSplashScreen(CallingAct As A";
RDebugUtils.currentLine=127270913;
 //BA.debugLineNum = 127270913;BA.debugLine="If BM.IsInitialized Then";
if (_bm.IsInitialized()) { 
RDebugUtils.currentLine=127270914;
 //BA.debugLineNum = 127270914;BA.debugLine="pnlSplash.Initialize(\"pnl1\")";
__ref._pnlsplash /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"pnl1");
RDebugUtils.currentLine=127270915;
 //BA.debugLineNum = 127270915;BA.debugLine="pnlSplash.Tag = \"splash\"";
__ref._pnlsplash /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)("splash"));
RDebugUtils.currentLine=127270916;
 //BA.debugLineNum = 127270916;BA.debugLine="Dim BitImage As BitmapDrawable";
_bitimage = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=127270917;
 //BA.debugLineNum = 127270917;BA.debugLine="BitImage.Initialize(BM)";
_bitimage.Initialize((android.graphics.Bitmap)(_bm.getObject()));
RDebugUtils.currentLine=127270918;
 //BA.debugLineNum = 127270918;BA.debugLine="BitImage.Gravity = Gravity.FILL";
_bitimage.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=127270919;
 //BA.debugLineNum = 127270919;BA.debugLine="CallingAct.AddView(pnlSplash, 0, 0, CallingAct.W";
_callingact.AddView((android.view.View)(__ref._pnlsplash /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),_callingact.getWidth(),_callingact.getHeight());
RDebugUtils.currentLine=127270920;
 //BA.debugLineNum = 127270920;BA.debugLine="pnlSplash.Background = BitImage";
__ref._pnlsplash /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_bitimage.getObject()));
RDebugUtils.currentLine=127270921;
 //BA.debugLineNum = 127270921;BA.debugLine="pnlSplash.BringToFront";
__ref._pnlsplash /*anywheresoftware.b4a.objects.PanelWrapper*/ .BringToFront();
RDebugUtils.currentLine=127270922;
 //BA.debugLineNum = 127270922;BA.debugLine="SplashShowing = True";
__ref._splashshowing /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=127270924;
 //BA.debugLineNum = 127270924;BA.debugLine="End Sub";
return "";
}
public void  _updateapk(ir.parsikhesab.pakhsh.cl_appupdate __ref,boolean _pstatus) throws Exception{
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "updateapk", true))
	 {Debug.delegate(ba, "updateapk", new Object[] {_pstatus}); return;}
ResumableSub_UpdateApk rsub = new ResumableSub_UpdateApk(this,__ref,_pstatus);
rsub.resume(ba, null);
}
public static class ResumableSub_UpdateApk extends BA.ResumableSub {
public ResumableSub_UpdateApk(ir.parsikhesab.pakhsh.cl_appupdate parent,ir.parsikhesab.pakhsh.cl_appupdate __ref,boolean _pstatus) {
this.parent = parent;
this.__ref = __ref;
this._pstatus = _pstatus;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cl_appupdate __ref;
ir.parsikhesab.pakhsh.cl_appupdate parent;
boolean _pstatus;
boolean _okwebver = false;
long _fsize = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cl_appupdate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126222337;
 //BA.debugLineNum = 126222337;BA.debugLine="LogColor(\"---- AppUpdating.UpdateApk\", LogColor1)";
parent.__c.LogImpl("9126222337","---- AppUpdating.UpdateApk",__ref._logcolor1 /*int*/ );
RDebugUtils.currentLine=126222338;
 //BA.debugLineNum = 126222338;BA.debugLine="If Not(pstatus) Then";
if (true) break;

case 1:
//if
this.state = 61;
if (parent.__c.Not(_pstatus)) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126222339;
 //BA.debugLineNum = 126222339;BA.debugLine="sStatusCode = ERR_NOPERM";
__ref._sstatuscode /*int*/  = __ref._err_noperm /*int*/ ;
RDebugUtils.currentLine=126222340;
 //BA.debugLineNum = 126222340;BA.debugLine="If sVerbose Then Log(TAB & \"no permissions from";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent.__c.LogImpl("9126222340",parent.__c.TAB+"no permissions from user to install new apk",0);
if (true) break;

case 9:
//C
this.state = 61;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=126222342;
 //BA.debugLineNum = 126222342;BA.debugLine="Wait For(IsvalidWV) Complete (OkWebVer As Boolea";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_appupdate", "updateapk"), __ref._isvalidwv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 62;
return;
case 62:
//C
this.state = 12;
_okwebver = (Boolean) result[1];
;
RDebugUtils.currentLine=126222343;
 //BA.debugLineNum = 126222343;BA.debugLine="If (IsValidCV And OkWebVer) Then							'here we";
if (true) break;

case 12:
//if
this.state = 60;
if ((__ref._isvalidcv /*boolean*/ (null) && _okwebver)) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=126222344;
 //BA.debugLineNum = 126222344;BA.debugLine="If curver < webver Then";
if (true) break;

case 15:
//if
this.state = 59;
if ((double)(Double.parseDouble(__ref._curver /*String*/ ))<(double)(Double.parseDouble(__ref._webver /*String*/ ))) { 
this.state = 17;
}else {
this.state = 52;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=126222346;
 //BA.debugLineNum = 126222346;BA.debugLine="If IsNumber(webfsize) Then";
if (true) break;

case 18:
//if
this.state = 31;
if (parent.__c.IsNumber(__ref._webfsize /*String*/ )) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=126222347;
 //BA.debugLineNum = 126222347;BA.debugLine="Dim fsize As Long = webfsize";
_fsize = (long)(Double.parseDouble(__ref._webfsize /*String*/ ));
RDebugUtils.currentLine=126222348;
 //BA.debugLineNum = 126222348;BA.debugLine="If fsize*2 > GetFreeSpace Then";
if (true) break;

case 21:
//if
this.state = 30;
if (_fsize*2>__ref._getfreespace /*long*/ (null)) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=126222349;
 //BA.debugLineNum = 126222349;BA.debugLine="sStatusCode = ERR_NOSPACE";
__ref._sstatuscode /*int*/  = __ref._err_nospace /*int*/ ;
RDebugUtils.currentLine=126222350;
 //BA.debugLineNum = 126222350;BA.debugLine="If sVerbose Then Log($\"${TAB}no enough avail";
if (true) break;

case 24:
//if
this.state = 29;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 26;
;}if (true) break;

case 26:
//C
this.state = 29;
parent.__c.LogImpl("9126222350",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"no enough available space to download apk"),0);
if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
RDebugUtils.currentLine=126222353;
 //BA.debugLineNum = 126222353;BA.debugLine="If sStatusCode >= 0 Then";

case 31:
//if
this.state = 50;
if (__ref._sstatuscode /*int*/ >=0) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=126222354;
 //BA.debugLineNum = 126222354;BA.debugLine="sStatusCode = OK_NEWERAPK			'info file tells";
__ref._sstatuscode /*int*/  = __ref._ok_newerapk /*int*/ ;
RDebugUtils.currentLine=126222355;
 //BA.debugLineNum = 126222355;BA.debugLine="If sVerbose Then Log($\"${TAB}Newer version av";
if (true) break;

case 34:
//if
this.state = 39;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
parent.__c.LogImpl("9126222355",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"Newer version available. Now I try its downloading"),0);
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=126222356;
 //BA.debugLineNum = 126222356;BA.debugLine="If sNewVerApk = \"\" Then";
if (true) break;

case 40:
//if
this.state = 49;
if ((__ref._snewverapk /*String*/ ).equals("")) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=126222357;
 //BA.debugLineNum = 126222357;BA.debugLine="sStatusCode = ERR_NOAPK";
__ref._sstatuscode /*int*/  = __ref._err_noapk /*int*/ ;
RDebugUtils.currentLine=126222358;
 //BA.debugLineNum = 126222358;BA.debugLine="If sVerbose Then Log($\"${TAB}missing apk fil";
if (true) break;

case 43:
//if
this.state = 48;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
parent.__c.LogImpl("9126222358",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"missing apk file full path indication"),0);
if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 59;
;
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=126222362;
 //BA.debugLineNum = 126222362;BA.debugLine="sStatusCode = NO_NEWERAPK";
__ref._sstatuscode /*int*/  = __ref._no_newerapk /*int*/ ;
RDebugUtils.currentLine=126222363;
 //BA.debugLineNum = 126222363;BA.debugLine="If sVerbose Then Log($\"${TAB}No newer version";
if (true) break;

case 53:
//if
this.state = 58;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 55;
;}if (true) break;

case 55:
//C
this.state = 58;
parent.__c.LogImpl("9126222363",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"No newer version available on webserver."),0);
if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = -1;
;
RDebugUtils.currentLine=126222367;
 //BA.debugLineNum = 126222367;BA.debugLine="TryApkUpdate						'if available and permitted, do";
__ref._tryapkupdate /*void*/ (null);
RDebugUtils.currentLine=126222368;
 //BA.debugLineNum = 126222368;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _canrequestpackageinstalls(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "canrequestpackageinstalls", true))
	 {return ((Boolean) Debug.delegate(ba, "canrequestpackageinstalls", null));}
anywheresoftware.b4j.object.JavaObject _ctxt = null;
anywheresoftware.b4j.object.JavaObject _packagemanager = null;
RDebugUtils.currentLine=126943232;
 //BA.debugLineNum = 126943232;BA.debugLine="Public Sub CanRequestPackageInstalls As Boolean";
RDebugUtils.currentLine=126943233;
 //BA.debugLineNum = 126943233;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=126943234;
 //BA.debugLineNum = 126943234;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(ba);
RDebugUtils.currentLine=126943235;
 //BA.debugLineNum = 126943235;BA.debugLine="Dim PackageManager As JavaObject = ctxt.RunMethod";
_packagemanager = new anywheresoftware.b4j.object.JavaObject();
_packagemanager = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_ctxt.RunMethod("getPackageManager",(Object[])(__c.Null))));
RDebugUtils.currentLine=126943236;
 //BA.debugLineNum = 126943236;BA.debugLine="Return PackageManager.RunMethod(\"canRequestPackag";
if (true) return BA.ObjectToBoolean(_packagemanager.RunMethod("canRequestPackageInstalls",(Object[])(__c.Null)));
RDebugUtils.currentLine=126943237;
 //BA.debugLineNum = 126943237;BA.debugLine="End Sub";
return false;
}
public boolean  _checknonmarketappsenabled(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "checknonmarketappsenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "checknonmarketappsenabled", null));}
anywheresoftware.b4j.object.JavaObject _context = null;
anywheresoftware.b4j.object.JavaObject _resolver = null;
anywheresoftware.b4j.object.JavaObject _global = null;
RDebugUtils.currentLine=127008768;
 //BA.debugLineNum = 127008768;BA.debugLine="Public Sub CheckNonMarketAppsEnabled As Boolean";
RDebugUtils.currentLine=127008769;
 //BA.debugLineNum = 127008769;BA.debugLine="If phone.SdkVersion >= 26 Then Return True";
if (__ref._phone /*anywheresoftware.b4a.phone.Phone*/ .getSdkVersion()>=26) { 
if (true) return __c.True;};
RDebugUtils.currentLine=127008770;
 //BA.debugLineNum = 127008770;BA.debugLine="If phone.SdkVersion < 17 Or phone.SdkVersion >= 2";
if (__ref._phone /*anywheresoftware.b4a.phone.Phone*/ .getSdkVersion()<17 || __ref._phone /*anywheresoftware.b4a.phone.Phone*/ .getSdkVersion()>=21) { 
RDebugUtils.currentLine=127008771;
 //BA.debugLineNum = 127008771;BA.debugLine="Return phone.GetSettings(\"install_non_market_app";
if (true) return (__ref._phone /*anywheresoftware.b4a.phone.Phone*/ .GetSettings("install_non_market_apps")).equals("1");
 }else {
RDebugUtils.currentLine=127008773;
 //BA.debugLineNum = 127008773;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=127008774;
 //BA.debugLineNum = 127008774;BA.debugLine="context.InitializeContext";
_context.InitializeContext(ba);
RDebugUtils.currentLine=127008775;
 //BA.debugLineNum = 127008775;BA.debugLine="Dim resolver As JavaObject = context.RunMethod(\"";
_resolver = new anywheresoftware.b4j.object.JavaObject();
_resolver = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_context.RunMethod("getContentResolver",(Object[])(__c.Null))));
RDebugUtils.currentLine=127008776;
 //BA.debugLineNum = 127008776;BA.debugLine="Dim global As JavaObject";
_global = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=127008777;
 //BA.debugLineNum = 127008777;BA.debugLine="global.InitializeStatic(\"android.provider.Settin";
_global.InitializeStatic("android.provider.Settings.Global");
RDebugUtils.currentLine=127008778;
 //BA.debugLineNum = 127008778;BA.debugLine="Return global.RunMethod(\"getString\", Array(resol";
if (true) return (_global.RunMethod("getString",new Object[]{(Object)(_resolver.getObject()),(Object)("install_non_market_apps")})).equals((Object)("1"));
 };
RDebugUtils.currentLine=127008780;
 //BA.debugLineNum = 127008780;BA.debugLine="End Sub";
return false;
}
public String  _stopsplashscreen(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "stopsplashscreen", true))
	 {return ((String) Debug.delegate(ba, "stopsplashscreen", null));}
RDebugUtils.currentLine=127336448;
 //BA.debugLineNum = 127336448;BA.debugLine="Public Sub StopSplashScreen";
RDebugUtils.currentLine=127336449;
 //BA.debugLineNum = 127336449;BA.debugLine="If SplashShowing Then";
if (__ref._splashshowing /*boolean*/ ) { 
RDebugUtils.currentLine=127336450;
 //BA.debugLineNum = 127336450;BA.debugLine="SplashShowing = False";
__ref._splashshowing /*boolean*/  = __c.False;
RDebugUtils.currentLine=127336451;
 //BA.debugLineNum = 127336451;BA.debugLine="pnlSplash.RemoveView";
__ref._pnlsplash /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
 };
RDebugUtils.currentLine=127336453;
 //BA.debugLineNum = 127336453;BA.debugLine="End Sub";
return "";
}
public int  _getstatus(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getstatus", true))
	 {return ((Integer) Debug.delegate(ba, "getstatus", null));}
RDebugUtils.currentLine=125566976;
 //BA.debugLineNum = 125566976;BA.debugLine="Public Sub getStatus As Int";
RDebugUtils.currentLine=125566977;
 //BA.debugLineNum = 125566977;BA.debugLine="Return sStatusCode";
if (true) return __ref._sstatuscode /*int*/ ;
RDebugUtils.currentLine=125566978;
 //BA.debugLineNum = 125566978;BA.debugLine="End Sub";
return 0;
}
public String  _getcurvn(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getcurvn", true))
	 {return ((String) Debug.delegate(ba, "getcurvn", null));}
RDebugUtils.currentLine=125632512;
 //BA.debugLineNum = 125632512;BA.debugLine="Public Sub getCurVN As String";
RDebugUtils.currentLine=125632513;
 //BA.debugLineNum = 125632513;BA.debugLine="Return curver";
if (true) return __ref._curver /*String*/ ;
RDebugUtils.currentLine=125632514;
 //BA.debugLineNum = 125632514;BA.debugLine="End Sub";
return "";
}
public String  _getwebvn(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getwebvn", true))
	 {return ((String) Debug.delegate(ba, "getwebvn", null));}
RDebugUtils.currentLine=125698048;
 //BA.debugLineNum = 125698048;BA.debugLine="Public Sub getWebVN As String";
RDebugUtils.currentLine=125698049;
 //BA.debugLineNum = 125698049;BA.debugLine="Return webver";
if (true) return __ref._webver /*String*/ ;
RDebugUtils.currentLine=125698050;
 //BA.debugLineNum = 125698050;BA.debugLine="End Sub";
return "";
}
public String  _setpackagename(ir.parsikhesab.pakhsh.cl_appupdate __ref,String _pn) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "setpackagename", true))
	 {return ((String) Debug.delegate(ba, "setpackagename", new Object[] {_pn}));}
RDebugUtils.currentLine=125173760;
 //BA.debugLineNum = 125173760;BA.debugLine="Public Sub setPackageName(PN As String)";
RDebugUtils.currentLine=125173761;
 //BA.debugLineNum = 125173761;BA.debugLine="sPackageName = PN";
__ref._spackagename /*String*/  = _pn;
RDebugUtils.currentLine=125173762;
 //BA.debugLineNum = 125173762;BA.debugLine="End Sub";
return "";
}
public String  _setnewverapk(ir.parsikhesab.pakhsh.cl_appupdate __ref,String _nva) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "setnewverapk", true))
	 {return ((String) Debug.delegate(ba, "setnewverapk", new Object[] {_nva}));}
RDebugUtils.currentLine=125370368;
 //BA.debugLineNum = 125370368;BA.debugLine="Public Sub setNewVerApk(NVA As String)";
RDebugUtils.currentLine=125370369;
 //BA.debugLineNum = 125370369;BA.debugLine="sNewVerApk = NVA";
__ref._snewverapk /*String*/  = _nva;
RDebugUtils.currentLine=125370370;
 //BA.debugLineNum = 125370370;BA.debugLine="End Sub";
return "";
}
public String  _setcredentials(ir.parsikhesab.pakhsh.cl_appupdate __ref,String _usern,String _userp) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "setcredentials", true))
	 {return ((String) Debug.delegate(ba, "setcredentials", new Object[] {_usern,_userp}));}
RDebugUtils.currentLine=125435904;
 //BA.debugLineNum = 125435904;BA.debugLine="Public Sub setCredentials(UserN As String, UserP A";
RDebugUtils.currentLine=125435905;
 //BA.debugLineNum = 125435905;BA.debugLine="sUserName = UserN";
__ref._susername /*String*/  = _usern;
RDebugUtils.currentLine=125435906;
 //BA.debugLineNum = 125435906;BA.debugLine="sUPassword = UserP";
__ref._supassword /*String*/  = _userp;
RDebugUtils.currentLine=125435907;
 //BA.debugLineNum = 125435907;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
RDebugUtils.currentLine=125042688;
 //BA.debugLineNum = 125042688;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=125042690;
 //BA.debugLineNum = 125042690;BA.debugLine="Public ERR_NOPKG = -1	As Int				'missing package";
_err_nopkg = (int) (-1);
RDebugUtils.currentLine=125042691;
 //BA.debugLineNum = 125042691;BA.debugLine="Public ERR_NOTXT = -2 As Int				'missing webserve";
_err_notxt = (int) (-2);
RDebugUtils.currentLine=125042692;
 //BA.debugLineNum = 125042692;BA.debugLine="Public ERR_NOAPK = -3 As Int				'missing webserve";
_err_noapk = (int) (-3);
RDebugUtils.currentLine=125042693;
 //BA.debugLineNum = 125042693;BA.debugLine="Public ERR_TXTROW = -4 As Int				'wrong row forma";
_err_txtrow = (int) (-4);
RDebugUtils.currentLine=125042694;
 //BA.debugLineNum = 125042694;BA.debugLine="Public ERR_HTML = -5 As Int					'website returned";
_err_html = (int) (-5);
RDebugUtils.currentLine=125042695;
 //BA.debugLineNum = 125042695;BA.debugLine="Public ERR_NOSPACE = -6 As Int				'no enough spac";
_err_nospace = (int) (-6);
RDebugUtils.currentLine=125042696;
 //BA.debugLineNum = 125042696;BA.debugLine="Public ERR_NOPERM = -7 As Int				'no permissions";
_err_noperm = (int) (-7);
RDebugUtils.currentLine=125042697;
 //BA.debugLineNum = 125042697;BA.debugLine="Public ERR_DOWNLOAD = -8 As Int				'failed to dow";
_err_download = (int) (-8);
RDebugUtils.currentLine=125042698;
 //BA.debugLineNum = 125042698;BA.debugLine="Public ERR_HTTP = -100 As Int				'HttpUtils error";
_err_http = (int) (-100);
RDebugUtils.currentLine=125042699;
 //BA.debugLineNum = 125042699;BA.debugLine="Public OK_INIT = 0 As Int";
_ok_init = (int) (0);
RDebugUtils.currentLine=125042700;
 //BA.debugLineNum = 125042700;BA.debugLine="Public OK_CURVER = 1 As Int					'curver has valid";
_ok_curver = (int) (1);
RDebugUtils.currentLine=125042701;
 //BA.debugLineNum = 125042701;BA.debugLine="Public OK_WEBVER = 2 As Int";
_ok_webver = (int) (2);
RDebugUtils.currentLine=125042702;
 //BA.debugLineNum = 125042702;BA.debugLine="Public NO_NEWERAPK = 3 As Int				'apk version on";
_no_newerapk = (int) (3);
RDebugUtils.currentLine=125042703;
 //BA.debugLineNum = 125042703;BA.debugLine="Public OK_NEWERAPK = 4 As Int				'current apk has";
_ok_newerapk = (int) (4);
RDebugUtils.currentLine=125042704;
 //BA.debugLineNum = 125042704;BA.debugLine="Public OK_DOWNLOAD = 5 As Int				'newer apk corre";
_ok_download = (int) (5);
RDebugUtils.currentLine=125042705;
 //BA.debugLineNum = 125042705;BA.debugLine="Public OK_INSTALL = 6 As Int				'user asked to in";
_ok_install = (int) (6);
RDebugUtils.currentLine=125042708;
 //BA.debugLineNum = 125042708;BA.debugLine="Private Callback As Object";
_callback = new Object();
RDebugUtils.currentLine=125042709;
 //BA.debugLineNum = 125042709;BA.debugLine="Private Event As String";
_event = "";
RDebugUtils.currentLine=125042710;
 //BA.debugLineNum = 125042710;BA.debugLine="Private sPackageName As String      		'ex: com.te";
_spackagename = "";
RDebugUtils.currentLine=125042711;
 //BA.debugLineNum = 125042711;BA.debugLine="Private sNewVerTxt As String        		'ex: http:/";
_snewvertxt = "";
RDebugUtils.currentLine=125042712;
 //BA.debugLineNum = 125042712;BA.debugLine="Private sNewVerApk  As String       		'ex: http:/";
_snewverapk = "";
RDebugUtils.currentLine=125042713;
 //BA.debugLineNum = 125042713;BA.debugLine="Private sStatusCode As Int          		'negatives";
_sstatuscode = 0;
RDebugUtils.currentLine=125042714;
 //BA.debugLineNum = 125042714;BA.debugLine="Private sUserName As String         		'user name";
_susername = "";
RDebugUtils.currentLine=125042715;
 //BA.debugLineNum = 125042715;BA.debugLine="Private sUPassword As String        		'password r";
_supassword = "";
RDebugUtils.currentLine=125042716;
 //BA.debugLineNum = 125042716;BA.debugLine="Private curver, webver As String    		'curver = c";
_curver = "";
_webver = "";
RDebugUtils.currentLine=125042717;
 //BA.debugLineNum = 125042717;BA.debugLine="Private webclog As String					'webclog = optional";
_webclog = "";
RDebugUtils.currentLine=125042718;
 //BA.debugLineNum = 125042718;BA.debugLine="Private webfsize As String					'webfsize = option";
_webfsize = "";
RDebugUtils.currentLine=125042719;
 //BA.debugLineNum = 125042719;BA.debugLine="Private sVerbose As Boolean					'TRUE = a lot of";
_sverbose = false;
RDebugUtils.currentLine=125042720;
 //BA.debugLineNum = 125042720;BA.debugLine="Private pnlSplash As Panel					'panel used to sup";
_pnlsplash = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=125042721;
 //BA.debugLineNum = 125042721;BA.debugLine="Private SplashShowing As Boolean			'True = splash";
_splashshowing = false;
RDebugUtils.currentLine=125042722;
 //BA.debugLineNum = 125042722;BA.debugLine="Private phone As Phone";
_phone = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=125042723;
 //BA.debugLineNum = 125042723;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=125042724;
 //BA.debugLineNum = 125042724;BA.debugLine="Private SharedFolder As String				'Foder where to";
_sharedfolder = "";
RDebugUtils.currentLine=125042725;
 //BA.debugLineNum = 125042725;BA.debugLine="Private UseFileProvider As Boolean			'TRUE = SDK";
_usefileprovider = false;
RDebugUtils.currentLine=125042726;
 //BA.debugLineNum = 125042726;BA.debugLine="Private LogColor1 As Int = 0xFFFF8C00		'first col";
_logcolor1 = ((int)0xffff8c00);
RDebugUtils.currentLine=125042727;
 //BA.debugLineNum = 125042727;BA.debugLine="End Sub";
return "";
}
public String  _finito(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "finito", true))
	 {return ((String) Debug.delegate(ba, "finito", null));}
RDebugUtils.currentLine=126353408;
 //BA.debugLineNum = 126353408;BA.debugLine="Private Sub Finito";
RDebugUtils.currentLine=126353409;
 //BA.debugLineNum = 126353409;BA.debugLine="If SubExists(Callback,Event&\"_UpdateComplete\") Th";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._event /*String*/ +"_UpdateComplete")) { 
RDebugUtils.currentLine=126353410;
 //BA.debugLineNum = 126353410;BA.debugLine="CallSub(Callback,Event&\"_UpdateComplete\")";
__c.CallSubNew(ba,__ref._callback /*Object*/ ,__ref._event /*String*/ +"_UpdateComplete");
 };
RDebugUtils.currentLine=126353412;
 //BA.debugLineNum = 126353412;BA.debugLine="End Sub";
return "";
}
public String  _extractcl(ir.parsikhesab.pakhsh.cl_appupdate __ref,String _txtrow) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "extractcl", true))
	 {return ((String) Debug.delegate(ba, "extractcl", new Object[] {_txtrow}));}
int _i = 0;
int _j1 = 0;
int _j2 = 0;
RDebugUtils.currentLine=126615552;
 //BA.debugLineNum = 126615552;BA.debugLine="Private Sub ExtractCL(TxtRow As String) As String";
RDebugUtils.currentLine=126615553;
 //BA.debugLineNum = 126615553;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=126615554;
 //BA.debugLineNum = 126615554;BA.debugLine="i = TxtRow.IndexOf(\"<ChangeLog>\")";
_i = _txtrow.indexOf("<ChangeLog>");
RDebugUtils.currentLine=126615555;
 //BA.debugLineNum = 126615555;BA.debugLine="If i <> -1 Then";
if (_i!=-1) { 
RDebugUtils.currentLine=126615556;
 //BA.debugLineNum = 126615556;BA.debugLine="Dim j1 As Int = TxtRow.IndexOf(\"</ChangeLog>\")";
_j1 = _txtrow.indexOf("</ChangeLog>");
RDebugUtils.currentLine=126615557;
 //BA.debugLineNum = 126615557;BA.debugLine="If j1 = -1 Then";
if (_j1==-1) { 
RDebugUtils.currentLine=126615558;
 //BA.debugLineNum = 126615558;BA.debugLine="Dim j2 As Int = TxtRow.IndexOf(\"<FileSize>\")	'l";
_j2 = _txtrow.indexOf("<FileSize>");
RDebugUtils.currentLine=126615559;
 //BA.debugLineNum = 126615559;BA.debugLine="j1 = j2";
_j1 = _j2;
RDebugUtils.currentLine=126615560;
 //BA.debugLineNum = 126615560;BA.debugLine="If j1 < i Then j1 = -1";
if (_j1<_i) { 
_j1 = (int) (-1);};
 };
RDebugUtils.currentLine=126615562;
 //BA.debugLineNum = 126615562;BA.debugLine="If j1 <> -1 Then Return TxtRow.SubString2(i+11,j";
if (_j1!=-1) { 
if (true) return _txtrow.substring((int) (_i+11),_j1);}
else {
if (true) return _txtrow.substring((int) (_i+11));};
 }else {
RDebugUtils.currentLine=126615564;
 //BA.debugLineNum = 126615564;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=126615566;
 //BA.debugLineNum = 126615566;BA.debugLine="End Sub";
return "";
}
public String  _extractsz(ir.parsikhesab.pakhsh.cl_appupdate __ref,String _txtrow) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "extractsz", true))
	 {return ((String) Debug.delegate(ba, "extractsz", new Object[] {_txtrow}));}
int _i = 0;
int _j1 = 0;
int _j2 = 0;
String _s = "";
RDebugUtils.currentLine=126681088;
 //BA.debugLineNum = 126681088;BA.debugLine="Private Sub ExtractSZ(TxtRow As String) As String";
RDebugUtils.currentLine=126681089;
 //BA.debugLineNum = 126681089;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=126681090;
 //BA.debugLineNum = 126681090;BA.debugLine="i = TxtRow.IndexOf(\"<FileSize>\")";
_i = _txtrow.indexOf("<FileSize>");
RDebugUtils.currentLine=126681091;
 //BA.debugLineNum = 126681091;BA.debugLine="If i <> -1 Then";
if (_i!=-1) { 
RDebugUtils.currentLine=126681092;
 //BA.debugLineNum = 126681092;BA.debugLine="Dim j1 As Int = TxtRow.IndexOf(\"</FileSize>\")		'";
_j1 = _txtrow.indexOf("</FileSize>");
RDebugUtils.currentLine=126681093;
 //BA.debugLineNum = 126681093;BA.debugLine="If j1 = -1 Then";
if (_j1==-1) { 
RDebugUtils.currentLine=126681094;
 //BA.debugLineNum = 126681094;BA.debugLine="Dim j2 As Int = TxtRow.IndexOf(\"<ChangeLog>\")	'";
_j2 = _txtrow.indexOf("<ChangeLog>");
RDebugUtils.currentLine=126681095;
 //BA.debugLineNum = 126681095;BA.debugLine="j1 = j2";
_j1 = _j2;
RDebugUtils.currentLine=126681096;
 //BA.debugLineNum = 126681096;BA.debugLine="If j1 < i Then j1 = -1";
if (_j1<_i) { 
_j1 = (int) (-1);};
 };
RDebugUtils.currentLine=126681098;
 //BA.debugLineNum = 126681098;BA.debugLine="Dim s As String";
_s = "";
RDebugUtils.currentLine=126681099;
 //BA.debugLineNum = 126681099;BA.debugLine="If j1 <> -1 Then s = TxtRow.SubString2(i+10,j1)";
if (_j1!=-1) { 
_s = _txtrow.substring((int) (_i+10),_j1);}
else {
_s = _txtrow.substring((int) (_i+10));};
RDebugUtils.currentLine=126681100;
 //BA.debugLineNum = 126681100;BA.debugLine="s = s.Replace(CRLF,\"\")";
_s = _s.replace(__c.CRLF,"");
RDebugUtils.currentLine=126681101;
 //BA.debugLineNum = 126681101;BA.debugLine="s=s.Replace(Chr(13),\"\")";
_s = _s.replace(BA.ObjectToString(__c.Chr((int) (13))),"");
RDebugUtils.currentLine=126681102;
 //BA.debugLineNum = 126681102;BA.debugLine="Return s";
if (true) return _s;
 }else {
RDebugUtils.currentLine=126681104;
 //BA.debugLineNum = 126681104;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=126681106;
 //BA.debugLineNum = 126681106;BA.debugLine="End Sub";
return "";
}
public String  _extractvn(ir.parsikhesab.pakhsh.cl_appupdate __ref,String _txtrow) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "extractvn", true))
	 {return ((String) Debug.delegate(ba, "extractvn", new Object[] {_txtrow}));}
int _i = 0;
int _j1 = 0;
int _j2 = 0;
int _j = 0;
String _s = "";
RDebugUtils.currentLine=126550016;
 //BA.debugLineNum = 126550016;BA.debugLine="Private Sub ExtractVN(TxtRow As String) As String";
RDebugUtils.currentLine=126550017;
 //BA.debugLineNum = 126550017;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=126550018;
 //BA.debugLineNum = 126550018;BA.debugLine="i = TxtRow.IndexOf(\"=\")";
_i = _txtrow.indexOf("=");
RDebugUtils.currentLine=126550019;
 //BA.debugLineNum = 126550019;BA.debugLine="If i <> -1 Then";
if (_i!=-1) { 
RDebugUtils.currentLine=126550020;
 //BA.debugLineNum = 126550020;BA.debugLine="Dim j1 As Int = TxtRow.IndexOf(\"<ChangeLog>\")	'l";
_j1 = _txtrow.indexOf("<ChangeLog>");
RDebugUtils.currentLine=126550021;
 //BA.debugLineNum = 126550021;BA.debugLine="Dim j2 As Int = TxtRow.IndexOf(\"<FileSize>\")	'lo";
_j2 = _txtrow.indexOf("<FileSize>");
RDebugUtils.currentLine=126550022;
 //BA.debugLineNum = 126550022;BA.debugLine="Dim j As Int = Min(j1, j2)";
_j = (int) (__c.Min(_j1,_j2));
RDebugUtils.currentLine=126550023;
 //BA.debugLineNum = 126550023;BA.debugLine="If j = -1 Then j = Max(j1,j2)";
if (_j==-1) { 
_j = (int) (__c.Max(_j1,_j2));};
RDebugUtils.currentLine=126550024;
 //BA.debugLineNum = 126550024;BA.debugLine="Dim s As String";
_s = "";
RDebugUtils.currentLine=126550025;
 //BA.debugLineNum = 126550025;BA.debugLine="If j <> - 1 Then s=TxtRow.SubString2(i+1,j) Else";
if (_j!=-1) { 
_s = _txtrow.substring((int) (_i+1),_j);}
else {
_s = _txtrow.substring((int) (_i+1));};
RDebugUtils.currentLine=126550026;
 //BA.debugLineNum = 126550026;BA.debugLine="s=s.Replace(CRLF,\"\")";
_s = _s.replace(__c.CRLF,"");
RDebugUtils.currentLine=126550027;
 //BA.debugLineNum = 126550027;BA.debugLine="s=s.Replace(Chr(13),\"\")";
_s = _s.replace(BA.ObjectToString(__c.Chr((int) (13))),"");
RDebugUtils.currentLine=126550028;
 //BA.debugLineNum = 126550028;BA.debugLine="Return s";
if (true) return _s;
 }else {
RDebugUtils.currentLine=126550030;
 //BA.debugLineNum = 126550030;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=126550032;
 //BA.debugLineNum = 126550032;BA.debugLine="End Sub";
return "";
}
public long  _getavailablespace(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getavailablespace", true))
	 {return ((Long) Debug.delegate(ba, "getavailablespace", null));}
RDebugUtils.currentLine=125894656;
 //BA.debugLineNum = 125894656;BA.debugLine="Public Sub GetAvailableSpace As Long";
RDebugUtils.currentLine=125894657;
 //BA.debugLineNum = 125894657;BA.debugLine="Return GetFreeSpace";
if (true) return __ref._getfreespace /*long*/ (null);
RDebugUtils.currentLine=125894658;
 //BA.debugLineNum = 125894658;BA.debugLine="End Sub";
return 0L;
}
public long  _getfreespace(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getfreespace", true))
	 {return ((Long) Debug.delegate(ba, "getfreespace", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=126746624;
 //BA.debugLineNum = 126746624;BA.debugLine="Private Sub GetFreeSpace As Long";
RDebugUtils.currentLine=126746625;
 //BA.debugLineNum = 126746625;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=126746626;
 //BA.debugLineNum = 126746626;BA.debugLine="jo.InitializeNewInstance(\"java.io.File\", Array(Sh";
_jo.InitializeNewInstance("java.io.File",new Object[]{(Object)(__ref._sharedfolder /*String*/ )});
RDebugUtils.currentLine=126746627;
 //BA.debugLineNum = 126746627;BA.debugLine="Return jo.RunMethod(\"getFreeSpace\", Null)";
if (true) return BA.ObjectToLongNumber(_jo.RunMethod("getFreeSpace",(Object[])(__c.Null)));
RDebugUtils.currentLine=126746628;
 //BA.debugLineNum = 126746628;BA.debugLine="End Sub";
return 0L;
}
public Object  _getfileuri(ir.parsikhesab.pakhsh.cl_appupdate __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getfileuri", true))
	 {return ((Object) Debug.delegate(ba, "getfileuri", new Object[] {_filename}));}
anywheresoftware.b4j.object.JavaObject _uri = null;
anywheresoftware.b4j.object.JavaObject _f = null;
anywheresoftware.b4j.object.JavaObject _fp = null;
anywheresoftware.b4j.object.JavaObject _context = null;
RDebugUtils.currentLine=127139840;
 //BA.debugLineNum = 127139840;BA.debugLine="Private Sub GetFileUri (FileName As String) As Obj";
RDebugUtils.currentLine=127139841;
 //BA.debugLineNum = 127139841;BA.debugLine="If UseFileProvider = False Then";
if (__ref._usefileprovider /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=127139842;
 //BA.debugLineNum = 127139842;BA.debugLine="Dim uri As JavaObject";
_uri = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=127139843;
 //BA.debugLineNum = 127139843;BA.debugLine="Return uri.InitializeStatic(\"android.net.Uri\").R";
if (true) return _uri.InitializeStatic("android.net.Uri").RunMethod("parse",new Object[]{(Object)("file://"+__c.File.Combine(__ref._sharedfolder /*String*/ ,_filename))});
 }else {
RDebugUtils.currentLine=127139845;
 //BA.debugLineNum = 127139845;BA.debugLine="Dim f As JavaObject";
_f = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=127139846;
 //BA.debugLineNum = 127139846;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Sh";
_f.InitializeNewInstance("java.io.File",new Object[]{(Object)(__ref._sharedfolder /*String*/ ),(Object)(_filename)});
RDebugUtils.currentLine=127139847;
 //BA.debugLineNum = 127139847;BA.debugLine="Dim fp As JavaObject";
_fp = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=127139848;
 //BA.debugLineNum = 127139848;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=127139849;
 //BA.debugLineNum = 127139849;BA.debugLine="context.InitializeContext";
_context.InitializeContext(ba);
RDebugUtils.currentLine=127139850;
 //BA.debugLineNum = 127139850;BA.debugLine="fp.InitializeStatic(\"android.support.v4.content.";
_fp.InitializeStatic("androidx.core.content.FileProvider");
RDebugUtils.currentLine=127139851;
 //BA.debugLineNum = 127139851;BA.debugLine="Return fp.RunMethod(\"getUriForFile\", Array(conte";
if (true) return _fp.RunMethod("getUriForFile",new Object[]{(Object)(_context.getObject()),(Object)(__c.Application.getPackageName()+".provider"),(Object)(_f.getObject())});
 };
RDebugUtils.currentLine=127139853;
 //BA.debugLineNum = 127139853;BA.debugLine="End Sub";
return null;
}
public String  _getnmappinst(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getnmappinst", true))
	 {return ((String) Debug.delegate(ba, "getnmappinst", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _context = null;
anywheresoftware.b4j.object.JavaObject _resolver = null;
RDebugUtils.currentLine=126877696;
 //BA.debugLineNum = 126877696;BA.debugLine="Private Sub GetNMAppInst As String";
RDebugUtils.currentLine=126877697;
 //BA.debugLineNum = 126877697;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=126877698;
 //BA.debugLineNum = 126877698;BA.debugLine="jo.InitializeStatic(\"android.provider.Settings.Se";
_jo.InitializeStatic("android.provider.Settings.Secure");
RDebugUtils.currentLine=126877699;
 //BA.debugLineNum = 126877699;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=126877700;
 //BA.debugLineNum = 126877700;BA.debugLine="context.InitializeContext";
_context.InitializeContext(ba);
RDebugUtils.currentLine=126877701;
 //BA.debugLineNum = 126877701;BA.debugLine="Dim resolver As JavaObject = context.RunMethod(\"g";
_resolver = new anywheresoftware.b4j.object.JavaObject();
_resolver = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_context.RunMethod("getContentResolver",(Object[])(__c.Null))));
RDebugUtils.currentLine=126877702;
 //BA.debugLineNum = 126877702;BA.debugLine="Return jo.RunMethod(\"getString\", Array(resolver,";
if (true) return BA.ObjectToString(_jo.RunMethod("getString",new Object[]{(Object)(_resolver.getObject()),(Object)("install_non_market_apps")}));
RDebugUtils.currentLine=126877703;
 //BA.debugLineNum = 126877703;BA.debugLine="End Sub";
return "";
}
public String  _getpackagename(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getpackagename", true))
	 {return ((String) Debug.delegate(ba, "getpackagename", null));}
RDebugUtils.currentLine=125239296;
 //BA.debugLineNum = 125239296;BA.debugLine="Public Sub getPackageName As String";
RDebugUtils.currentLine=125239297;
 //BA.debugLineNum = 125239297;BA.debugLine="Return sPackageName";
if (true) return __ref._spackagename /*String*/ ;
RDebugUtils.currentLine=125239298;
 //BA.debugLineNum = 125239298;BA.debugLine="End Sub";
return "";
}
public int  _getsdkversion(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getsdkversion", true))
	 {return ((Integer) Debug.delegate(ba, "getsdkversion", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=126812160;
 //BA.debugLineNum = 126812160;BA.debugLine="Private Sub GetSDKVersion As Int";
RDebugUtils.currentLine=126812161;
 //BA.debugLineNum = 126812161;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=126812162;
 //BA.debugLineNum = 126812162;BA.debugLine="jo.InitializeStatic(\"android.os.Build.VERSION\")";
_jo.InitializeStatic("android.os.Build.VERSION");
RDebugUtils.currentLine=126812163;
 //BA.debugLineNum = 126812163;BA.debugLine="Return jo.GetField(\"SDK_INT\")";
if (true) return (int)(BA.ObjectToNumber(_jo.GetField("SDK_INT")));
RDebugUtils.currentLine=126812164;
 //BA.debugLineNum = 126812164;BA.debugLine="End Sub";
return 0;
}
public String  _getwebchangelog(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getwebchangelog", true))
	 {return ((String) Debug.delegate(ba, "getwebchangelog", null));}
RDebugUtils.currentLine=125763584;
 //BA.debugLineNum = 125763584;BA.debugLine="Public Sub getWebChangeLog As String";
RDebugUtils.currentLine=125763585;
 //BA.debugLineNum = 125763585;BA.debugLine="Return webclog";
if (true) return __ref._webclog /*String*/ ;
RDebugUtils.currentLine=125763586;
 //BA.debugLineNum = 125763586;BA.debugLine="End Sub";
return "";
}
public String  _getwebfilesize(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "getwebfilesize", true))
	 {return ((String) Debug.delegate(ba, "getwebfilesize", null));}
RDebugUtils.currentLine=125829120;
 //BA.debugLineNum = 125829120;BA.debugLine="Public Sub getWebFileSize As String";
RDebugUtils.currentLine=125829121;
 //BA.debugLineNum = 125829121;BA.debugLine="Return webfsize";
if (true) return __ref._webfsize /*String*/ ;
RDebugUtils.currentLine=125829122;
 //BA.debugLineNum = 125829122;BA.debugLine="End Sub";
return "";
}
public String  _sendinstallintent(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "sendinstallintent", true))
	 {return ((String) Debug.delegate(ba, "sendinstallintent", null));}
String _apkname = "";
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=127074304;
 //BA.debugLineNum = 127074304;BA.debugLine="Private Sub SendInstallIntent";
RDebugUtils.currentLine=127074305;
 //BA.debugLineNum = 127074305;BA.debugLine="Dim ApkName As String = \"tmp.apk\"";
_apkname = "tmp.apk";
RDebugUtils.currentLine=127074306;
 //BA.debugLineNum = 127074306;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=127074307;
 //BA.debugLineNum = 127074307;BA.debugLine="If phone.SdkVersion >= 24 Then													'Nouga";
if (__ref._phone /*anywheresoftware.b4a.phone.Phone*/ .getSdkVersion()>=24) { 
RDebugUtils.currentLine=127074308;
 //BA.debugLineNum = 127074308;BA.debugLine="i.Initialize(\"android.intent.action.INSTALL_PACK";
_i.Initialize("android.intent.action.INSTALL_PACKAGE",BA.ObjectToString(__ref._getfileuri /*Object*/ (null,_apkname)));
RDebugUtils.currentLine=127074309;
 //BA.debugLineNum = 127074309;BA.debugLine="i.Flags = Bit.Or(i.Flags, 1) 'FLAG_GRANT_READ_UR";
_i.setFlags(__c.Bit.Or(_i.getFlags(),(int) (1)));
 }else {
RDebugUtils.currentLine=127074311;
 //BA.debugLineNum = 127074311;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"file://\" & File.Com";
_i.Initialize(_i.ACTION_VIEW,"file://"+__c.File.Combine(__ref._sharedfolder /*String*/ ,_apkname));
RDebugUtils.currentLine=127074312;
 //BA.debugLineNum = 127074312;BA.debugLine="i.SetType(\"application/vnd.android.package-archi";
_i.SetType("application/vnd.android.package-archive");
 };
RDebugUtils.currentLine=127074314;
 //BA.debugLineNum = 127074314;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
RDebugUtils.currentLine=127074315;
 //BA.debugLineNum = 127074315;BA.debugLine="End Sub";
return "";
}
public boolean  _isvalidcv(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "isvalidcv", true))
	 {return ((Boolean) Debug.delegate(ba, "isvalidcv", null));}
anywheresoftware.b4a.phone.PackageManagerWrapper _pm = null;
RDebugUtils.currentLine=126418944;
 //BA.debugLineNum = 126418944;BA.debugLine="Private Sub IsValidCV As Boolean";
RDebugUtils.currentLine=126418945;
 //BA.debugLineNum = 126418945;BA.debugLine="If sPackageName = \"\" Then";
if ((__ref._spackagename /*String*/ ).equals("")) { 
RDebugUtils.currentLine=126418946;
 //BA.debugLineNum = 126418946;BA.debugLine="curver = \"\"";
__ref._curver /*String*/  = "";
RDebugUtils.currentLine=126418947;
 //BA.debugLineNum = 126418947;BA.debugLine="sStatusCode = ERR_NOPKG";
__ref._sstatuscode /*int*/  = __ref._err_nopkg /*int*/ ;
RDebugUtils.currentLine=126418948;
 //BA.debugLineNum = 126418948;BA.debugLine="If sVerbose Then Log($\"${TAB}missing package nam";
if (__ref._sverbose /*boolean*/ ) { 
__c.LogImpl("9126418948",(""+__c.SmartStringFormatter("",(Object)(__c.TAB))+"missing package name for current version check"),0);};
 }else {
RDebugUtils.currentLine=126418950;
 //BA.debugLineNum = 126418950;BA.debugLine="Dim pm As PackageManager";
_pm = new anywheresoftware.b4a.phone.PackageManagerWrapper();
RDebugUtils.currentLine=126418951;
 //BA.debugLineNum = 126418951;BA.debugLine="curver = pm.GetVersionName(sPackageName)";
__ref._curver /*String*/  = _pm.GetVersionName(__ref._spackagename /*String*/ );
RDebugUtils.currentLine=126418952;
 //BA.debugLineNum = 126418952;BA.debugLine="sStatusCode = OK_CURVER 									'got current ve";
__ref._sstatuscode /*int*/  = __ref._ok_curver /*int*/ ;
RDebugUtils.currentLine=126418953;
 //BA.debugLineNum = 126418953;BA.debugLine="If sVerbose Then Log($\"${TAB}Current Version: ${";
if (__ref._sverbose /*boolean*/ ) { 
__c.LogImpl("9126418953",(""+__c.SmartStringFormatter("",(Object)(__c.TAB))+"Current Version: "+__c.SmartStringFormatter("",(Object)(__ref._curver /*String*/ ))+""),0);};
 };
RDebugUtils.currentLine=126418955;
 //BA.debugLineNum = 126418955;BA.debugLine="Return (sStatusCode == OK_CURVER)";
if (true) return (__ref._sstatuscode /*int*/ ==__ref._ok_curver /*int*/ );
RDebugUtils.currentLine=126418956;
 //BA.debugLineNum = 126418956;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _isvalidwv(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "isvalidwv", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "isvalidwv", null));}
ResumableSub_IsvalidWV rsub = new ResumableSub_IsvalidWV(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_IsvalidWV extends BA.ResumableSub {
public ResumableSub_IsvalidWV(ir.parsikhesab.pakhsh.cl_appupdate parent,ir.parsikhesab.pakhsh.cl_appupdate __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cl_appupdate __ref;
ir.parsikhesab.pakhsh.cl_appupdate parent;
ir.parsikhesab.pakhsh.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cl_appupdate";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126484481;
 //BA.debugLineNum = 126484481;BA.debugLine="Log(\"IsValidComplete start\")";
parent.__c.LogImpl("9126484481","IsValidComplete start",0);
RDebugUtils.currentLine=126484482;
 //BA.debugLineNum = 126484482;BA.debugLine="If sNewVerTxt = \"\" Then";
if (true) break;

case 1:
//if
this.state = 60;
if ((__ref._snewvertxt /*String*/ ).equals("")) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126484483;
 //BA.debugLineNum = 126484483;BA.debugLine="webver = \"\"";
__ref._webver /*String*/  = "";
RDebugUtils.currentLine=126484484;
 //BA.debugLineNum = 126484484;BA.debugLine="sStatusCode = ERR_NOTXT";
__ref._sstatuscode /*int*/  = __ref._err_notxt /*int*/ ;
RDebugUtils.currentLine=126484485;
 //BA.debugLineNum = 126484485;BA.debugLine="If sVerbose Then Log($\"${TAB}missing info file f";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent.__c.LogImpl("9126484485",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"missing info file full path indication"),0);
if (true) break;

case 9:
//C
this.state = 60;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=126484488;
 //BA.debugLineNum = 126484488;BA.debugLine="Dim j As HttpJob";
_j = new ir.parsikhesab.pakhsh.httpjob();
RDebugUtils.currentLine=126484489;
 //BA.debugLineNum = 126484489;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=126484490;
 //BA.debugLineNum = 126484490;BA.debugLine="j.Username = sUserName";
_j._username /*String*/  = __ref._susername /*String*/ ;
RDebugUtils.currentLine=126484491;
 //BA.debugLineNum = 126484491;BA.debugLine="j.Password = sUPassword";
_j._password /*String*/  = __ref._supassword /*String*/ ;
RDebugUtils.currentLine=126484492;
 //BA.debugLineNum = 126484492;BA.debugLine="j.Download(sNewVerTxt)								'ex: jobapk.Downlo";
_j._download /*String*/ (null,__ref._snewvertxt /*String*/ );
RDebugUtils.currentLine=126484493;
 //BA.debugLineNum = 126484493;BA.debugLine="Log(\"before\")";
parent.__c.LogImpl("9126484493","before",0);
RDebugUtils.currentLine=126484494;
 //BA.debugLineNum = 126484494;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_appupdate", "isvalidwv"), (Object)(_j));
this.state = 61;
return;
case 61:
//C
this.state = 12;
_j = (ir.parsikhesab.pakhsh.httpjob) result[1];
;
RDebugUtils.currentLine=126484495;
 //BA.debugLineNum = 126484495;BA.debugLine="Log(\"after\")";
parent.__c.LogImpl("9126484495","after",0);
RDebugUtils.currentLine=126484496;
 //BA.debugLineNum = 126484496;BA.debugLine="If j.Success Then";
if (true) break;

case 12:
//if
this.state = 59;
if (_j._success /*boolean*/ ) { 
this.state = 14;
}else {
this.state = 52;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=126484497;
 //BA.debugLineNum = 126484497;BA.debugLine="If sVerbose Then Log($\"Webserver's info file co";
if (true) break;

case 15:
//if
this.state = 20;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
parent.__c.LogImpl("9126484497",("Webserver's info file content: "+parent.__c.SmartStringFormatter("",(Object)(parent.__c.CRLF))+""+parent.__c.SmartStringFormatter("",(Object)(_j._getstring /*String*/ (null)))+""),0);
if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=126484498;
 //BA.debugLineNum = 126484498;BA.debugLine="If Not(J.GetString.Contains(\"<!DOCTYPE html>\"))";
if (true) break;

case 21:
//if
this.state = 50;
if (parent.__c.Not(_j._getstring /*String*/ (null).contains("<!DOCTYPE html>"))) { 
this.state = 23;
}else {
this.state = 43;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=126484499;
 //BA.debugLineNum = 126484499;BA.debugLine="webver = ExtractVN(J.GetString)";
__ref._webver /*String*/  = __ref._extractvn /*String*/ (null,_j._getstring /*String*/ (null));
RDebugUtils.currentLine=126484500;
 //BA.debugLineNum = 126484500;BA.debugLine="webclog = ExtractCL(J.GetString)					'optional";
__ref._webclog /*String*/  = __ref._extractcl /*String*/ (null,_j._getstring /*String*/ (null));
RDebugUtils.currentLine=126484501;
 //BA.debugLineNum = 126484501;BA.debugLine="webfsize = ExtractSZ(J.GetString)					'optiona";
__ref._webfsize /*String*/  = __ref._extractsz /*String*/ (null,_j._getstring /*String*/ (null));
RDebugUtils.currentLine=126484502;
 //BA.debugLineNum = 126484502;BA.debugLine="If webver = \"\" Then";
if (true) break;

case 24:
//if
this.state = 41;
if ((__ref._webver /*String*/ ).equals("")) { 
this.state = 26;
}else {
this.state = 34;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=126484503;
 //BA.debugLineNum = 126484503;BA.debugLine="sStatusCode = ERR_TXTROW";
__ref._sstatuscode /*int*/  = __ref._err_txtrow /*int*/ ;
RDebugUtils.currentLine=126484504;
 //BA.debugLineNum = 126484504;BA.debugLine="If sVerbose Then Log($\"${TAB}wrong row format";
if (true) break;

case 27:
//if
this.state = 32;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
parent.__c.LogImpl("9126484504",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"wrong row format in info file "),0);
if (true) break;

case 32:
//C
this.state = 41;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=126484506;
 //BA.debugLineNum = 126484506;BA.debugLine="sStatusCode = OK_WEBVER							'read apk's ver";
__ref._sstatuscode /*int*/  = __ref._ok_webver /*int*/ ;
RDebugUtils.currentLine=126484507;
 //BA.debugLineNum = 126484507;BA.debugLine="If sVerbose Then Log($\"${TAB}Web version numb";
if (true) break;

case 35:
//if
this.state = 40;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
parent.__c.LogImpl("9126484507",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"Web version number: "+parent.__c.SmartStringFormatter("",(Object)(__ref._webver /*String*/ ))+""),0);
if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = 50;
;
 if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=126484510;
 //BA.debugLineNum = 126484510;BA.debugLine="sStatusCode = ERR_HTML								'website returne";
__ref._sstatuscode /*int*/  = __ref._err_html /*int*/ ;
RDebugUtils.currentLine=126484511;
 //BA.debugLineNum = 126484511;BA.debugLine="If sVerbose Then Log($\"${TAB}ERROR: website re";
if (true) break;

case 44:
//if
this.state = 49;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 46;
;}if (true) break;

case 46:
//C
this.state = 49;
parent.__c.LogImpl("9126484511",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"ERROR: website returned an HTML error page"),0);
if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 59;
;
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=126484514;
 //BA.debugLineNum = 126484514;BA.debugLine="Log($\"${TAB}Error: ${J.ErrorMessage}\"$)";
parent.__c.LogImpl("9126484514",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"Error: "+parent.__c.SmartStringFormatter("",(Object)(_j._errormessage /*String*/ ))+""),0);
RDebugUtils.currentLine=126484515;
 //BA.debugLineNum = 126484515;BA.debugLine="sStatusCode = ERR_HTTP";
__ref._sstatuscode /*int*/  = __ref._err_http /*int*/ ;
RDebugUtils.currentLine=126484516;
 //BA.debugLineNum = 126484516;BA.debugLine="If sVerbose Then Log($\"${TAB}error in httputils";
if (true) break;

case 53:
//if
this.state = 58;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 55;
;}if (true) break;

case 55:
//C
this.state = 58;
parent.__c.LogImpl("9126484516",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"error in httputils2"),0);
if (true) break;

case 58:
//C
this.state = 59;
;
RDebugUtils.currentLine=126484517;
 //BA.debugLineNum = 126484517;BA.debugLine="ToastMessageShow(\"Error: \" & J.ErrorMessage, Tr";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_j._errormessage /*String*/ ),parent.__c.True);
 if (true) break;

case 59:
//C
this.state = 60;
;
RDebugUtils.currentLine=126484519;
 //BA.debugLineNum = 126484519;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 60:
//C
this.state = -1;
;
RDebugUtils.currentLine=126484521;
 //BA.debugLineNum = 126484521;BA.debugLine="Return (sStatusCode == OK_WEBVER)";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)((__ref._sstatuscode /*int*/ ==__ref._ok_webver /*int*/ )));return;};
RDebugUtils.currentLine=126484522;
 //BA.debugLineNum = 126484522;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _readcurvn(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "readcurvn", true))
	 {return ((String) Debug.delegate(ba, "readcurvn", null));}
RDebugUtils.currentLine=125960192;
 //BA.debugLineNum = 125960192;BA.debugLine="Public Sub ReadCurVN";
RDebugUtils.currentLine=125960193;
 //BA.debugLineNum = 125960193;BA.debugLine="LogColor(\"---- AppUpdating.ReadCurVN\", LogColor1)";
__c.LogImpl("9125960193","---- AppUpdating.ReadCurVN",__ref._logcolor1 /*int*/ );
RDebugUtils.currentLine=125960194;
 //BA.debugLineNum = 125960194;BA.debugLine="IsValidCV											'we don't care about its resu";
__ref._isvalidcv /*boolean*/ (null);
RDebugUtils.currentLine=125960195;
 //BA.debugLineNum = 125960195;BA.debugLine="Finito";
__ref._finito /*String*/ (null);
RDebugUtils.currentLine=125960196;
 //BA.debugLineNum = 125960196;BA.debugLine="End Sub";
return "";
}
public String  _setfileuriasintentdata(ir.parsikhesab.pakhsh.cl_appupdate __ref,anywheresoftware.b4a.objects.IntentWrapper _intent,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "setfileuriasintentdata", true))
	 {return ((String) Debug.delegate(ba, "setfileuriasintentdata", new Object[] {_intent,_filename}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=127205376;
 //BA.debugLineNum = 127205376;BA.debugLine="Private Sub SetFileUriAsIntentData (Intent As Inte";
RDebugUtils.currentLine=127205377;
 //BA.debugLineNum = 127205377;BA.debugLine="Dim jo As JavaObject = Intent";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_intent.getObject()));
RDebugUtils.currentLine=127205378;
 //BA.debugLineNum = 127205378;BA.debugLine="jo.RunMethod(\"setData\", Array(GetFileUri(FileName";
_jo.RunMethod("setData",new Object[]{__ref._getfileuri /*Object*/ (null,_filename)});
RDebugUtils.currentLine=127205379;
 //BA.debugLineNum = 127205379;BA.debugLine="Intent.Flags = Bit.Or(Intent.Flags, 1) 'FLAG_GRAN";
_intent.setFlags(__c.Bit.Or(_intent.getFlags(),(int) (1)));
RDebugUtils.currentLine=127205380;
 //BA.debugLineNum = 127205380;BA.debugLine="End Sub";
return "";
}
public String  _setnewvertxt(ir.parsikhesab.pakhsh.cl_appupdate __ref,String _nvt) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "setnewvertxt", true))
	 {return ((String) Debug.delegate(ba, "setnewvertxt", new Object[] {_nvt}));}
RDebugUtils.currentLine=125304832;
 //BA.debugLineNum = 125304832;BA.debugLine="Public Sub setNewVerTxt(NVT As String)";
RDebugUtils.currentLine=125304833;
 //BA.debugLineNum = 125304833;BA.debugLine="sNewVerTxt = NVT";
__ref._snewvertxt /*String*/  = _nvt;
RDebugUtils.currentLine=125304834;
 //BA.debugLineNum = 125304834;BA.debugLine="End Sub";
return "";
}
public void  _tryapkupdate(ir.parsikhesab.pakhsh.cl_appupdate __ref) throws Exception{
RDebugUtils.currentModule="cl_appupdate";
if (Debug.shouldDelegate(ba, "tryapkupdate", true))
	 {Debug.delegate(ba, "tryapkupdate", null); return;}
ResumableSub_TryApkUpdate rsub = new ResumableSub_TryApkUpdate(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_TryApkUpdate extends BA.ResumableSub {
public ResumableSub_TryApkUpdate(ir.parsikhesab.pakhsh.cl_appupdate parent,ir.parsikhesab.pakhsh.cl_appupdate __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cl_appupdate __ref;
ir.parsikhesab.pakhsh.cl_appupdate parent;
ir.parsikhesab.pakhsh.httpjob _j = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cl_appupdate";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126287873;
 //BA.debugLineNum = 126287873;BA.debugLine="LogColor($\"${TAB}-- TryApkUpdate\"$, LogColor1)";
parent.__c.LogImpl("9126287873",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"-- TryApkUpdate"),__ref._logcolor1 /*int*/ );
RDebugUtils.currentLine=126287875;
 //BA.debugLineNum = 126287875;BA.debugLine="If ((sStatusCode >= 0) And (sStatusCode <> NO_NEW";
if (true) break;

case 1:
//if
this.state = 44;
if (((__ref._sstatuscode /*int*/ >=0) && (__ref._sstatuscode /*int*/ !=__ref._no_newerapk /*int*/ ))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126287877;
 //BA.debugLineNum = 126287877;BA.debugLine="Dim j As HttpJob";
_j = new ir.parsikhesab.pakhsh.httpjob();
RDebugUtils.currentLine=126287878;
 //BA.debugLineNum = 126287878;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=126287879;
 //BA.debugLineNum = 126287879;BA.debugLine="j.Username = sUserName";
_j._username /*String*/  = __ref._susername /*String*/ ;
RDebugUtils.currentLine=126287880;
 //BA.debugLineNum = 126287880;BA.debugLine="j.Password = sUPassword";
_j._password /*String*/  = __ref._supassword /*String*/ ;
RDebugUtils.currentLine=126287881;
 //BA.debugLineNum = 126287881;BA.debugLine="j.Download(sNewVerApk)								'ex: jobapk.Downlo";
_j._download /*String*/ (null,__ref._snewverapk /*String*/ );
RDebugUtils.currentLine=126287882;
 //BA.debugLineNum = 126287882;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_appupdate", "tryapkupdate"), (Object)(_j));
this.state = 45;
return;
case 45:
//C
this.state = 4;
_j = (ir.parsikhesab.pakhsh.httpjob) result[1];
;
RDebugUtils.currentLine=126287883;
 //BA.debugLineNum = 126287883;BA.debugLine="Log($\"Donload ok? ${j.Success}\"$)";
parent.__c.LogImpl("9126287883",("Donload ok? "+parent.__c.SmartStringFormatter("",(Object)(_j._success /*boolean*/ ))+""),0);
RDebugUtils.currentLine=126287884;
 //BA.debugLineNum = 126287884;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 33;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 26;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=126287885;
 //BA.debugLineNum = 126287885;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 24;
this.catchState = 17;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 17;
RDebugUtils.currentLine=126287887;
 //BA.debugLineNum = 126287887;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=126287888;
 //BA.debugLineNum = 126287888;BA.debugLine="out = File.OpenOutput(SharedFolder,\"tmp.apk\",F";
_out = parent.__c.File.OpenOutput(__ref._sharedfolder /*String*/ ,"tmp.apk",parent.__c.False);
RDebugUtils.currentLine=126287889;
 //BA.debugLineNum = 126287889;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=126287890;
 //BA.debugLineNum = 126287890;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=126287891;
 //BA.debugLineNum = 126287891;BA.debugLine="Log($\"Copy2 (saving) ok? TRUE\"$)";
parent.__c.LogImpl("9126287891",("Copy2 (saving) ok? TRUE"),0);
RDebugUtils.currentLine=126287892;
 //BA.debugLineNum = 126287892;BA.debugLine="sStatusCode = OK_DOWNLOAD";
__ref._sstatuscode /*int*/  = __ref._ok_download /*int*/ ;
RDebugUtils.currentLine=126287893;
 //BA.debugLineNum = 126287893;BA.debugLine="If sVerbose Then Log($\"${TAB}new apk version d";
if (true) break;

case 10:
//if
this.state = 15;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
parent.__c.LogImpl("9126287893",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"new apk version downloaded and ready to install"),0);
if (true) break;

case 15:
//C
this.state = 24;
;
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=126287895;
 //BA.debugLineNum = 126287895;BA.debugLine="Log($\"Copy2 (saving) ok? FALSE\"$)";
parent.__c.LogImpl("9126287895",("Copy2 (saving) ok? FALSE"),0);
RDebugUtils.currentLine=126287896;
 //BA.debugLineNum = 126287896;BA.debugLine="sStatusCode = ERR_DOWNLOAD";
__ref._sstatuscode /*int*/  = __ref._err_download /*int*/ ;
RDebugUtils.currentLine=126287897;
 //BA.debugLineNum = 126287897;BA.debugLine="If sVerbose Then Log($\"${TAB}failed download o";
if (true) break;

case 18:
//if
this.state = 23;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
parent.__c.LogImpl("9126287897",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"failed download of new apk version"),0);
if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=126287898;
 //BA.debugLineNum = 126287898;BA.debugLine="ToastMessageShow(LastException, True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(parent.__c.LastException(ba).getObject()),parent.__c.True);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 33;
this.catchState = 0;
;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=126287901;
 //BA.debugLineNum = 126287901;BA.debugLine="Log($\"${TAB}Error: ${J.ErrorMessage}\"$)";
parent.__c.LogImpl("9126287901",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"Error: "+parent.__c.SmartStringFormatter("",(Object)(_j._errormessage /*String*/ ))+""),0);
RDebugUtils.currentLine=126287902;
 //BA.debugLineNum = 126287902;BA.debugLine="sStatusCode = ERR_HTTP";
__ref._sstatuscode /*int*/  = __ref._err_http /*int*/ ;
RDebugUtils.currentLine=126287903;
 //BA.debugLineNum = 126287903;BA.debugLine="If sVerbose Then Log($\"${TAB}error in httputils";
if (true) break;

case 27:
//if
this.state = 32;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
parent.__c.LogImpl("9126287903",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"error in httputils2"),0);
if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=126287904;
 //BA.debugLineNum = 126287904;BA.debugLine="ToastMessageShow($\"Error: ${J.ErrorMessage}\"$,";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(("Error: "+parent.__c.SmartStringFormatter("",(Object)(_j._errormessage /*String*/ ))+"")),parent.__c.True);
 if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=126287906;
 //BA.debugLineNum = 126287906;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=126287907;
 //BA.debugLineNum = 126287907;BA.debugLine="If sStatusCode == OK_DOWNLOAD Then";
if (true) break;

case 34:
//if
this.state = 43;
if (__ref._sstatuscode /*int*/ ==__ref._ok_download /*int*/ ) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=126287908;
 //BA.debugLineNum = 126287908;BA.debugLine="SendInstallIntent";
__ref._sendinstallintent /*String*/ (null);
RDebugUtils.currentLine=126287909;
 //BA.debugLineNum = 126287909;BA.debugLine="sStatusCode = OK_INSTALL";
__ref._sstatuscode /*int*/  = __ref._ok_install /*int*/ ;
RDebugUtils.currentLine=126287910;
 //BA.debugLineNum = 126287910;BA.debugLine="If sVerbose Then Log($\"${TAB}user asked to inst";
if (true) break;

case 37:
//if
this.state = 42;
if (__ref._sverbose /*boolean*/ ) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
parent.__c.LogImpl("9126287910",(""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.TAB))+"user asked to install new apk"),0);
if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;

case 44:
//C
this.state = -1;
;
RDebugUtils.currentLine=126287913;
 //BA.debugLineNum = 126287913;BA.debugLine="Finito";
__ref._finito /*String*/ (null);
RDebugUtils.currentLine=126287914;
 //BA.debugLineNum = 126287914;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
}