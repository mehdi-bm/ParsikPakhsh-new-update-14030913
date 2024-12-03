package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.b4xmainpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.Timer _t_gif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblver = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnllogo = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltitle = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlver = null;
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
public String  _b4xpage_created(ir.parsikhesab.pakhsh.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=86638592;
 //BA.debugLineNum = 86638592;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=86638593;
 //BA.debugLineNum = 86638593;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=86638595;
 //BA.debugLineNum = 86638595;BA.debugLine="Root.LoadLayout(\"l_Splash\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("l_Splash",ba);
RDebugUtils.currentLine=86638596;
 //BA.debugLineNum = 86638596;BA.debugLine="ShowSplash";
__ref._showsplash /*String*/ (null);
RDebugUtils.currentLine=86638597;
 //BA.debugLineNum = 86638597;BA.debugLine="End Sub";
return "";
}
public String  _showsplash(ir.parsikhesab.pakhsh.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showsplash", false))
	 {return ((String) Debug.delegate(ba, "showsplash", null));}
RDebugUtils.currentLine=86704128;
 //BA.debugLineNum = 86704128;BA.debugLine="Sub ShowSplash";
RDebugUtils.currentLine=86704129;
 //BA.debugLineNum = 86704129;BA.debugLine="Try";
try {RDebugUtils.currentLine=86704130;
 //BA.debugLineNum = 86704130;BA.debugLine="MCode.Initialize";
_mcode._initialize /*String*/ (ba);
RDebugUtils.currentLine=86704131;
 //BA.debugLineNum = 86704131;BA.debugLine="MCode.UpdateDataBase";
_mcode._updatedatabase /*String*/ (ba);
RDebugUtils.currentLine=86704134;
 //BA.debugLineNum = 86704134;BA.debugLine="StopService(FusedLocationService)";
__c.StopService(ba,(Object)(_fusedlocationservice.getObject()));
RDebugUtils.currentLine=86704135;
 //BA.debugLineNum = 86704135;BA.debugLine="Service_Gps.GPS1.Stop";
_service_gps._gps1 /*anywheresoftware.b4a.gps.GPS*/ .Stop();
RDebugUtils.currentLine=86704136;
 //BA.debugLineNum = 86704136;BA.debugLine="MCode.GpsIsEnable=False";
_mcode._gpsisenable /*boolean*/  = __c.False;
RDebugUtils.currentLine=86704139;
 //BA.debugLineNum = 86704139;BA.debugLine="T_Gif.Initialize(\"T_Gif\",3000)";
__ref._t_gif /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"T_Gif",(long) (3000));
RDebugUtils.currentLine=86704140;
 //BA.debugLineNum = 86704140;BA.debugLine="T_Gif.Enabled=True";
__ref._t_gif /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=86704142;
 //BA.debugLineNum = 86704142;BA.debugLine="lblTitle.Text=Application.LabelName";
__ref._lbltitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Application.getLabelName()));
RDebugUtils.currentLine=86704143;
 //BA.debugLineNum = 86704143;BA.debugLine="lblVer.Text=\"نسخه \"&Application.VersionName";
__ref._lblver /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نسخه "+__c.Application.getVersionName()));
RDebugUtils.currentLine=86704148;
 //BA.debugLineNum = 86704148;BA.debugLine="If MCode.Vaziat=1 Then";
if (_mcode._vaziat /*int*/ ==1) { 
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=86704152;
 //BA.debugLineNum = 86704152;BA.debugLine="Log(LastException)";
__c.LogImpl("586704152",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=86704155;
 //BA.debugLineNum = 86704155;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=86507520;
 //BA.debugLineNum = 86507520;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=86507521;
 //BA.debugLineNum = 86507521;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=86507522;
 //BA.debugLineNum = 86507522;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=86507523;
 //BA.debugLineNum = 86507523;BA.debugLine="Dim T_Gif As Timer";
_t_gif = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=86507524;
 //BA.debugLineNum = 86507524;BA.debugLine="Private lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=86507525;
 //BA.debugLineNum = 86507525;BA.debugLine="Private lblVer As Label";
_lblver = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=86507526;
 //BA.debugLineNum = 86507526;BA.debugLine="Private pnlLogo As Panel";
_pnllogo = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=86507527;
 //BA.debugLineNum = 86507527;BA.debugLine="Private pnlTitle As Panel";
_pnltitle = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=86507528;
 //BA.debugLineNum = 86507528;BA.debugLine="Private pnlVer As Panel";
_pnlver = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=86507529;
 //BA.debugLineNum = 86507529;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(ir.parsikhesab.pakhsh.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=86573056;
 //BA.debugLineNum = 86573056;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=86573057;
 //BA.debugLineNum = 86573057;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=86573058;
 //BA.debugLineNum = 86573058;BA.debugLine="End Sub";
return null;
}
public String  _t_gif_tick(ir.parsikhesab.pakhsh.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "t_gif_tick", false))
	 {return ((String) Debug.delegate(ba, "t_gif_tick", null));}
RDebugUtils.currentLine=86769664;
 //BA.debugLineNum = 86769664;BA.debugLine="Sub T_Gif_Tick";
RDebugUtils.currentLine=86769665;
 //BA.debugLineNum = 86769665;BA.debugLine="T_Gif.Enabled=False";
__ref._t_gif /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=86769669;
 //BA.debugLineNum = 86769669;BA.debugLine="StartActivity(Act_Main)";
__c.StartActivity(ba,(Object)(_act_main.getObject()));
RDebugUtils.currentLine=86769671;
 //BA.debugLineNum = 86769671;BA.debugLine="End Sub";
return "";
}
}