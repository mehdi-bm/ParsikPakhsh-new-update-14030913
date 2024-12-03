package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_submenu1 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_submenu1");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_submenu1.class).invoke(this, new Object[] {null});
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
public ir.parsikhesab.pakhsh.httpjob _jobinternet = null;
public anywheresoftware.b4a.objects.PanelWrapper _p = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public Object _mdl = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_login = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvertion = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_callsuport = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_exit = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_getdata = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_senddata = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_newsefaresh = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_addnewmoshtari = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlsendtiket = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_elanat = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_reports = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_backup = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlchangecompany = null;
public anywheresoftware.b4a.objects.PanelWrapper _backinfo = null;
public ir.parsikhesab.pakhsh.cl_appupdate _apkupdt = null;
public String _verflag = "";
public anywheresoftware.b4a.objects.PanelWrapper _pnl_video = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbleditnumber = null;
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
public String  _initialize(ir.parsikhesab.pakhsh.cls_submenu1 __ref,anywheresoftware.b4a.BA _ba,Object _ref,int _with) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_ref,_with}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _dt = "";
RDebugUtils.currentLine=110231552;
 //BA.debugLineNum = 110231552;BA.debugLine="Public Sub Initialize(ref As Object,with As Int)";
RDebugUtils.currentLine=110231553;
 //BA.debugLineNum = 110231553;BA.debugLine="mdl = ref";
__ref._mdl /*Object*/  = _ref;
RDebugUtils.currentLine=110231555;
 //BA.debugLineNum = 110231555;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=110231556;
 //BA.debugLineNum = 110231556;BA.debugLine="p.SetLayout(0,0,with,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),_with,__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=110231557;
 //BA.debugLineNum = 110231557;BA.debugLine="p.LoadLayout(\"l_MenuItems\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_MenuItems",ba);
RDebugUtils.currentLine=110231558;
 //BA.debugLineNum = 110231558;BA.debugLine="apkupdt.Initialize(Me,\"update\")";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._initialize /*String*/ (null,ba,this,"update");
RDebugUtils.currentLine=110231559;
 //BA.debugLineNum = 110231559;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
__ref._jobinternet /*ir.parsikhesab.pakhsh.httpjob*/ ._initialize /*String*/ (null,ba,"jobInternet",this);
RDebugUtils.currentLine=110231560;
 //BA.debugLineNum = 110231560;BA.debugLine="apkupdt.Verbose = True";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._setverbose(null,__c.True);
RDebugUtils.currentLine=110231561;
 //BA.debugLineNum = 110231561;BA.debugLine="VerFlag=\"checkupdate\"";
__ref._verflag /*String*/  = "checkupdate";
RDebugUtils.currentLine=110231562;
 //BA.debugLineNum = 110231562;BA.debugLine="pnl_bk.Tag=False";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)(__c.False));
RDebugUtils.currentLine=110231563;
 //BA.debugLineNum = 110231563;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblSetting");
RDebugUtils.currentLine=110231564;
 //BA.debugLineNum = 110231564;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=110231567;
 //BA.debugLineNum = 110231567;BA.debugLine="lblVertion.Text = Application.VersionName";
__ref._lblvertion /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Application.getVersionName()));
RDebugUtils.currentLine=110231568;
 //BA.debugLineNum = 110231568;BA.debugLine="lblEditNumber.Text=\"نسخه ویرایش: \" &MCode.NumberV";
__ref._lbleditnumber /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نسخه ویرایش: "+_mcode._numberversion /*String*/ ));
RDebugUtils.currentLine=110231569;
 //BA.debugLineNum = 110231569;BA.debugLine="If MCode.HaveShift = True Then";
if (_mcode._haveshift /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=110231570;
 //BA.debugLineNum = 110231570;BA.debugLine="Dim Dt As String=myCode.getSetting(\"OUT.dat\",\"in";
_dt = _mycode._getsetting /*String*/ (ba,"OUT.dat","input",BA.NumberToString(0));
RDebugUtils.currentLine=110231571;
 //BA.debugLineNum = 110231571;BA.debugLine="Select Case Dt";
switch (BA.switchObjectToInt(_dt,BA.NumberToString(0),BA.NumberToString(1))) {
case 0: {
RDebugUtils.currentLine=110231573;
 //BA.debugLineNum = 110231573;BA.debugLine="Pnl_SendData.Enabled=False";
__ref._pnl_senddata /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=110231574;
 //BA.debugLineNum = 110231574;BA.debugLine="pnl_NewSefaresh.Enabled=False";
__ref._pnl_newsefaresh /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=110231575;
 //BA.debugLineNum = 110231575;BA.debugLine="pnl_Reports.Enabled=False";
__ref._pnl_reports /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.False);
 break; }
case 1: {
RDebugUtils.currentLine=110231577;
 //BA.debugLineNum = 110231577;BA.debugLine="Pnl_SendData.Enabled=True";
__ref._pnl_senddata /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=110231578;
 //BA.debugLineNum = 110231578;BA.debugLine="pnl_NewSefaresh.Enabled=True";
__ref._pnl_newsefaresh /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=110231579;
 //BA.debugLineNum = 110231579;BA.debugLine="pnl_Reports.Enabled=True";
__ref._pnl_reports /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
 break; }
}
;
 };
RDebugUtils.currentLine=110231582;
 //BA.debugLineNum = 110231582;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=110362624;
 //BA.debugLineNum = 110362624;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=110362625;
 //BA.debugLineNum = 110362625;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=110362626;
 //BA.debugLineNum = 110362626;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=110362627;
 //BA.debugLineNum = 110362627;BA.debugLine="End Sub";
return null;
}
public String  _backinfo_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "backinfo_click", false))
	 {return ((String) Debug.delegate(ba, "backinfo_click", null));}
RDebugUtils.currentLine=110559232;
 //BA.debugLineNum = 110559232;BA.debugLine="Sub BackInfo_Click";
RDebugUtils.currentLine=110559233;
 //BA.debugLineNum = 110559233;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"Parsik/Ba";
if (__c.File.Exists(__c.File.getDirDefaultExternal(),"Parsik/Backup/backlist.txt")==__c.True) { 
RDebugUtils.currentLine=110559234;
 //BA.debugLineNum = 110559234;BA.debugLine="StartActivity(Act_Restore)";
__c.StartActivity(ba,(Object)(_act_restore.getObject()));
 }else {
RDebugUtils.currentLine=110559236;
 //BA.debugLineNum = 110559236;BA.debugLine="ToastMessageShow(\"هیچ فایل پشتیبانی موجود نمی با";
__c.ToastMessageShow(BA.ObjectToCharSequence("هیچ فایل پشتیبانی موجود نمی باشد"),__c.False);
 };
RDebugUtils.currentLine=110559238;
 //BA.debugLineNum = 110559238;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=110559239;
 //BA.debugLineNum = 110559239;BA.debugLine="End Sub";
return "";
}
public String  _hidemenu(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "hidemenu", false))
	 {return ((String) Debug.delegate(ba, "hidemenu", null));}
RDebugUtils.currentLine=110428160;
 //BA.debugLineNum = 110428160;BA.debugLine="Private Sub HideMenu";
RDebugUtils.currentLine=110428161;
 //BA.debugLineNum = 110428161;BA.debugLine="CallSubDelayed(mdl,\"BtnBackMenu_Click\")";
__c.CallSubDelayed(ba,__ref._mdl /*Object*/ ,"BtnBackMenu_Click");
RDebugUtils.currentLine=110428162;
 //BA.debugLineNum = 110428162;BA.debugLine="End Sub";
return "";
}
public String  _btncompare_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "btncompare_click", false))
	 {return ((String) Debug.delegate(ba, "btncompare_click", null));}
RDebugUtils.currentLine=111607808;
 //BA.debugLineNum = 111607808;BA.debugLine="Sub btnCompare_Click";
RDebugUtils.currentLine=111607809;
 //BA.debugLineNum = 111607809;BA.debugLine="VerFlag=\"checkupdate\"";
__ref._verflag /*String*/  = "checkupdate";
RDebugUtils.currentLine=111607810;
 //BA.debugLineNum = 111607810;BA.debugLine="GetVersion";
__ref._getversion /*String*/ (null);
RDebugUtils.currentLine=111607811;
 //BA.debugLineNum = 111607811;BA.debugLine="End Sub";
return "";
}
public String  _getversion(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "getversion", false))
	 {return ((String) Debug.delegate(ba, "getversion", null));}
String _str = "";
RDebugUtils.currentLine=112001024;
 //BA.debugLineNum = 112001024;BA.debugLine="Sub GetVersion";
RDebugUtils.currentLine=112001025;
 //BA.debugLineNum = 112001025;BA.debugLine="jobInternet.JobName =\"GetVersion\"";
__ref._jobinternet /*ir.parsikhesab.pakhsh.httpjob*/ ._jobname /*String*/  = "GetVersion";
RDebugUtils.currentLine=112001027;
 //BA.debugLineNum = 112001027;BA.debugLine="Dim str As String=\"parsiknew-\"&MCode.TypeVersion";
_str = "parsiknew-"+_mcode._typeversion /*String*/ ;
RDebugUtils.currentLine=112001028;
 //BA.debugLineNum = 112001028;BA.debugLine="If MCode.PrinterType=1 Then";
if (_mcode._printertype /*int*/ ==1) { 
RDebugUtils.currentLine=112001029;
 //BA.debugLineNum = 112001029;BA.debugLine="str=\"parsikPos\"";
_str = "parsikPos";
 };
RDebugUtils.currentLine=112001032;
 //BA.debugLineNum = 112001032;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
__ref._jobinternet /*ir.parsikhesab.pakhsh.httpjob*/ ._poststring /*String*/ (null,"http://"+_mcode._url /*String*/ +"/marashiservice.asmx/Version","Imei="+_mcode._deviceid /*String*/ +" &Type="+_str);
RDebugUtils.currentLine=112001033;
 //BA.debugLineNum = 112001033;BA.debugLine="End Sub";
return "";
}
public String  _btndwnld_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "btndwnld_click", false))
	 {return ((String) Debug.delegate(ba, "btndwnld_click", null));}
RDebugUtils.currentLine=111673344;
 //BA.debugLineNum = 111673344;BA.debugLine="Sub btnDwnld_Click";
RDebugUtils.currentLine=111673346;
 //BA.debugLineNum = 111673346;BA.debugLine="apkupdt.DownloadApk  'send out command; async res";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._downloadapk /*void*/ (null);
RDebugUtils.currentLine=111673348;
 //BA.debugLineNum = 111673348;BA.debugLine="End Sub";
return "";
}
public void  _btninstall_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "btninstall_click", false))
	 {Debug.delegate(ba, "btninstall_click", null); return;}
ResumableSub_btnInstall_Click rsub = new ResumableSub_btnInstall_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnInstall_Click extends BA.ResumableSub {
public ResumableSub_btnInstall_Click(ir.parsikhesab.pakhsh.cls_submenu1 parent,ir.parsikhesab.pakhsh.cls_submenu1 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_submenu1 __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_submenu1";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=111738881;
 //BA.debugLineNum = 111738881;BA.debugLine="Wait For (CheckInstallationRequirements) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_submenu1", "btninstall_click"), __ref._checkinstallationrequirements /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=111738882;
 //BA.debugLineNum = 111738882;BA.debugLine="apkupdt.InstallApk(Result)  'send out command; as";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._installapk /*String*/ (null,_result);
RDebugUtils.currentLine=111738883;
 //BA.debugLineNum = 111738883;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkinstallationrequirements(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "checkinstallationrequirements", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkinstallationrequirements", null));}
ResumableSub_CheckInstallationRequirements rsub = new ResumableSub_CheckInstallationRequirements(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckInstallationRequirements extends BA.ResumableSub {
public ResumableSub_CheckInstallationRequirements(ir.parsikhesab.pakhsh.cls_submenu1 parent,ir.parsikhesab.pakhsh.cls_submenu1 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_submenu1 __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
int _result = 0;
anywheresoftware.b4a.objects.IntentWrapper _in = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_submenu1";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=111935489;
 //BA.debugLineNum = 111935489;BA.debugLine="If File.ExternalWritable = False Then";
if (true) break;

case 1:
//if
this.state = 10;
if (parent.__c.File.getExternalWritable()==parent.__c.False) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=111935492;
 //BA.debugLineNum = 111935492;BA.debugLine="Else If MCode.PImei.SdkVersion >= 26 And apkupdt.";
if (parent._mcode._pimei /*anywheresoftware.b4a.phone.Phone*/ .getSdkVersion()>=26 && __ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._canrequestpackageinstalls /*boolean*/ (null)==parent.__c.False) { 
this.state = 5;
}else 
{RDebugUtils.currentLine=111935500;
 //BA.debugLineNum = 111935500;BA.debugLine="Else If apkupdt.CheckNonMarketAppsEnabled = False";
if (__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._checknonmarketappsenabled /*boolean*/ (null)==parent.__c.False) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=111935490;
 //BA.debugLineNum = 111935490;BA.debugLine="MsgboxAsync(\"Storage card not available. Make su";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Storage card not available. Make sure that your device is not connected in USB storage mode."),BA.ObjectToCharSequence(""),ba);
RDebugUtils.currentLine=111935491;
 //BA.debugLineNum = 111935491;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=111935493;
 //BA.debugLineNum = 111935493;BA.debugLine="MsgboxAsync(\"Please allow me to install applicat";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Please allow me to install applications."),BA.ObjectToCharSequence(""),ba);
RDebugUtils.currentLine=111935494;
 //BA.debugLineNum = 111935494;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_submenu1", "checkinstallationrequirements"), null);
this.state = 11;
return;
case 11:
//C
this.state = 10;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=111935495;
 //BA.debugLineNum = 111935495;BA.debugLine="Dim in As Intent";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=111935496;
 //BA.debugLineNum = 111935496;BA.debugLine="in.Initialize(\"android.settings.MANAGE_UNKNOWN_A";
_in.Initialize("android.settings.MANAGE_UNKNOWN_APP_SOURCES","package:"+parent.__c.Application.getPackageName());
RDebugUtils.currentLine=111935497;
 //BA.debugLineNum = 111935497;BA.debugLine="StartActivity(in)";
parent.__c.StartActivity(ba,(Object)(_in.getObject()));
RDebugUtils.currentLine=111935498;
 //BA.debugLineNum = 111935498;BA.debugLine="Wait For Activity_Resume '<-- wait for Activity_";
parent.__c.WaitFor("activity_resume", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_submenu1", "checkinstallationrequirements"), null);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
RDebugUtils.currentLine=111935499;
 //BA.debugLineNum = 111935499;BA.debugLine="Return apkupdt.CanRequestPackageInstalls";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._canrequestpackageinstalls /*boolean*/ (null)));return;};
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=111935501;
 //BA.debugLineNum = 111935501;BA.debugLine="MsgboxAsync(\"Please enable installation of non-m";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Please enable installation of non-market applications."+parent.__c.CRLF+"Under Settings - Security - Unknown sources"+parent.__c.CRLF+"Or Settings - Applications - Unknown sources"),BA.ObjectToCharSequence(""),ba);
RDebugUtils.currentLine=111935503;
 //BA.debugLineNum = 111935503;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=111935505;
 //BA.debugLineNum = 111935505;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=111935507;
 //BA.debugLineNum = 111935507;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnwebver_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "btnwebver_click", false))
	 {return ((String) Debug.delegate(ba, "btnwebver_click", null));}
RDebugUtils.currentLine=111542272;
 //BA.debugLineNum = 111542272;BA.debugLine="Sub btnWebVer_Click";
RDebugUtils.currentLine=111542274;
 //BA.debugLineNum = 111542274;BA.debugLine="apkupdt.ReadWebVN  'send out command; async resul";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._readwebvn /*void*/ (null);
RDebugUtils.currentLine=111542275;
 //BA.debugLineNum = 111542275;BA.debugLine="End Sub";
return "";
}
public void  _buttonupdate_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "buttonupdate_click", false))
	 {Debug.delegate(ba, "buttonupdate_click", null); return;}
ResumableSub_ButtonUpdate_Click rsub = new ResumableSub_ButtonUpdate_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonUpdate_Click extends BA.ResumableSub {
public ResumableSub_ButtonUpdate_Click(ir.parsikhesab.pakhsh.cls_submenu1 parent,ir.parsikhesab.pakhsh.cls_submenu1 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_submenu1 __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_submenu1";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=111804419;
 //BA.debugLineNum = 111804419;BA.debugLine="Wait For (CheckInstallationRequirements) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_submenu1", "buttonupdate_click"), __ref._checkinstallationrequirements /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=111804421;
 //BA.debugLineNum = 111804421;BA.debugLine="apkupdt.SetAndStartSplashScreen(mdl,LoadBitmap(Fi";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._setandstartsplashscreen /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(__ref._mdl /*Object*/ )),parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"bg-update-parsik-splash.jpg"));
RDebugUtils.currentLine=111804423;
 //BA.debugLineNum = 111804423;BA.debugLine="apkupdt.UpdateApk(Result) 'checks for newer apk,";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._updateapk /*void*/ (null,_result);
RDebugUtils.currentLine=111804424;
 //BA.debugLineNum = 111804424;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
RDebugUtils.currentLine=110166016;
 //BA.debugLineNum = 110166016;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=110166017;
 //BA.debugLineNum = 110166017;BA.debugLine="Dim jobInternet As HttpJob";
_jobinternet = new ir.parsikhesab.pakhsh.httpjob();
RDebugUtils.currentLine=110166018;
 //BA.debugLineNum = 110166018;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166019;
 //BA.debugLineNum = 110166019;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166020;
 //BA.debugLineNum = 110166020;BA.debugLine="Private mdl As Object";
_mdl = new Object();
RDebugUtils.currentLine=110166021;
 //BA.debugLineNum = 110166021;BA.debugLine="Private lbl_Login As Label";
_lbl_login = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=110166022;
 //BA.debugLineNum = 110166022;BA.debugLine="Private lblVertion As Label";
_lblvertion = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=110166023;
 //BA.debugLineNum = 110166023;BA.debugLine="Private pnl_CallSuport As Panel";
_pnl_callsuport = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166024;
 //BA.debugLineNum = 110166024;BA.debugLine="Private Pnl_Exit As Panel";
_pnl_exit = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166026;
 //BA.debugLineNum = 110166026;BA.debugLine="Private pnl_GetData As Panel";
_pnl_getdata = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166027;
 //BA.debugLineNum = 110166027;BA.debugLine="Private Pnl_SendData As Panel";
_pnl_senddata = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166028;
 //BA.debugLineNum = 110166028;BA.debugLine="Private pnl_NewSefaresh As Panel";
_pnl_newsefaresh = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166029;
 //BA.debugLineNum = 110166029;BA.debugLine="Private pnl_AddNewMoshtari As Panel";
_pnl_addnewmoshtari = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166030;
 //BA.debugLineNum = 110166030;BA.debugLine="Private pnlSendTiket As Panel";
_pnlsendtiket = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166031;
 //BA.debugLineNum = 110166031;BA.debugLine="Private pnl_Elanat As Panel";
_pnl_elanat = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166032;
 //BA.debugLineNum = 110166032;BA.debugLine="Private pnl_Reports As Panel";
_pnl_reports = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166033;
 //BA.debugLineNum = 110166033;BA.debugLine="Private pnl_Backup As Panel";
_pnl_backup = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166034;
 //BA.debugLineNum = 110166034;BA.debugLine="Private PnlChangeCompany As Panel";
_pnlchangecompany = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166035;
 //BA.debugLineNum = 110166035;BA.debugLine="Private BackInfo As Panel";
_backinfo = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166036;
 //BA.debugLineNum = 110166036;BA.debugLine="Dim apkupdt As cl_appupdate";
_apkupdt = new ir.parsikhesab.pakhsh.cl_appupdate();
RDebugUtils.currentLine=110166037;
 //BA.debugLineNum = 110166037;BA.debugLine="Dim VerFlag As String=\"checkupdate\"";
_verflag = "checkupdate";
RDebugUtils.currentLine=110166039;
 //BA.debugLineNum = 110166039;BA.debugLine="Private Pnl_Video As Panel";
_pnl_video = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=110166040;
 //BA.debugLineNum = 110166040;BA.debugLine="Private lblEditNumber As Label";
_lbleditnumber = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=110166041;
 //BA.debugLineNum = 110166041;BA.debugLine="End Sub";
return "";
}
public void  _download(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "download", false))
	 {Debug.delegate(ba, "download", null); return;}
ResumableSub_Download rsub = new ResumableSub_Download(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Download extends BA.ResumableSub {
public ResumableSub_Download(ir.parsikhesab.pakhsh.cls_submenu1 parent,ir.parsikhesab.pakhsh.cls_submenu1 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_submenu1 __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
int _result1 = 0;
anywheresoftware.b4a.phone.Phone.PhoneIntents _p1 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_submenu1";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=112197633;
 //BA.debugLineNum = 112197633;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
RDebugUtils.currentLine=112197634;
 //BA.debugLineNum = 112197634;BA.debugLine="Msgbox2Async(\"\" & CRLF & \"آیا از اطلاعات فعلی فا";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(""+parent.__c.CRLF+"آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟"),BA.ObjectToCharSequence("توجه"),"بله","انصراف","خیر",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=112197635;
 //BA.debugLineNum = 112197635;BA.debugLine="Wait For Msgbox_Result(Result1 As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_submenu1", "download"), null);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result1 = (Integer) result[1];
;
RDebugUtils.currentLine=112197636;
 //BA.debugLineNum = 112197636;BA.debugLine="If Result1=DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result1==parent.__c.DialogResponse.POSITIVE) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=112197637;
 //BA.debugLineNum = 112197637;BA.debugLine="MCode.CreateBK(\"\")";
parent._mcode._createbk /*void*/ (ba,"");
RDebugUtils.currentLine=112197638;
 //BA.debugLineNum = 112197638;BA.debugLine="Dim p1 As PhoneIntents";
_p1 = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=112197639;
 //BA.debugLineNum = 112197639;BA.debugLine="StartActivity(p1.OpenBrowser(MCode.LinkDownload";
parent.__c.StartActivity(ba,(Object)(_p1.OpenBrowser(parent._mcode._linkdownload /*String*/ )));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
RDebugUtils.currentLine=112197643;
 //BA.debugLineNum = 112197643;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("5112197643",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=112197645;
 //BA.debugLineNum = 112197645;BA.debugLine="End Sub";
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
public int  _getheight(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=110297088;
 //BA.debugLineNum = 110297088;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=110297089;
 //BA.debugLineNum = 110297089;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=110297090;
 //BA.debugLineNum = 110297090;BA.debugLine="End Sub";
return 0;
}
public String  _jobdone(ir.parsikhesab.pakhsh.cls_submenu1 __ref,ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "jobdone", false))
	 {return ((String) Debug.delegate(ba, "jobdone", new Object[] {_job}));}
String _str = "";
RDebugUtils.currentLine=112132096;
 //BA.debugLineNum = 112132096;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=112132097;
 //BA.debugLineNum = 112132097;BA.debugLine="Job.GetRequest.Timeout=50000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=112132098;
 //BA.debugLineNum = 112132098;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=112132099;
 //BA.debugLineNum = 112132099;BA.debugLine="Dim Str As String = Job.GetString";
_str = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=112132100;
 //BA.debugLineNum = 112132100;BA.debugLine="Select Case Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"GetVersion")) {
case 0: {
RDebugUtils.currentLine=112132102;
 //BA.debugLineNum = 112132102;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=112132103;
 //BA.debugLineNum = 112132103;BA.debugLine="ToastMessageShow(\"امکان آپدیت نرم افزار وجود";
__c.ToastMessageShow(BA.ObjectToCharSequence("امکان آپدیت نرم افزار وجود ندارد"),__c.True);
 }else {
RDebugUtils.currentLine=112132105;
 //BA.debugLineNum = 112132105;BA.debugLine="LoadGetVersion(Str)";
__ref._loadgetversion /*String*/ (null,_str);
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=112132110;
 //BA.debugLineNum = 112132110;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 };
RDebugUtils.currentLine=112132113;
 //BA.debugLineNum = 112132113;BA.debugLine="jobInternet.Release";
__ref._jobinternet /*ir.parsikhesab.pakhsh.httpjob*/ ._release /*String*/ (null);
RDebugUtils.currentLine=112132114;
 //BA.debugLineNum = 112132114;BA.debugLine="End Sub";
return "";
}
public String  _loadgetversion(ir.parsikhesab.pakhsh.cls_submenu1 __ref,String _str) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "loadgetversion", false))
	 {return ((String) Debug.delegate(ba, "loadgetversion", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=112066560;
 //BA.debugLineNum = 112066560;BA.debugLine="Sub LoadGetVersion(Str As String)";
RDebugUtils.currentLine=112066561;
 //BA.debugLineNum = 112066561;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=112066562;
 //BA.debugLineNum = 112066562;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=112066563;
 //BA.debugLineNum = 112066563;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
_mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=112066564;
 //BA.debugLineNum = 112066564;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = _mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=112066565;
 //BA.debugLineNum = 112066565;BA.debugLine="Row=RowsList.Get(0)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get((int) (0))));
RDebugUtils.currentLine=112066566;
 //BA.debugLineNum = 112066566;BA.debugLine="MCode.NewVersion = Row.Get(\"FldVersion\")";
_mcode._newversion /*String*/  = BA.ObjectToString(_row.Get((Object)("FldVersion")));
RDebugUtils.currentLine=112066567;
 //BA.debugLineNum = 112066567;BA.debugLine="MCode.LinkDownload = Row.Get(\"FldLink\")";
_mcode._linkdownload /*String*/  = BA.ObjectToString(_row.Get((Object)("FldLink")));
RDebugUtils.currentLine=112066568;
 //BA.debugLineNum = 112066568;BA.debugLine="If VerFlag=\"Download\" Then";
if ((__ref._verflag /*String*/ ).equals("Download")) { 
RDebugUtils.currentLine=112066569;
 //BA.debugLineNum = 112066569;BA.debugLine="Download";
__ref._download /*void*/ (null);
 }else {
RDebugUtils.currentLine=112066571;
 //BA.debugLineNum = 112066571;BA.debugLine="If MCode.NewVersion>MCode.Version Then";
if ((double)(Double.parseDouble(_mcode._newversion /*String*/ ))>(double)(Double.parseDouble(_mcode._version /*String*/ ))) { 
RDebugUtils.currentLine=112066572;
 //BA.debugLineNum = 112066572;BA.debugLine="If VerFlag=\"update\" Then";
if ((__ref._verflag /*String*/ ).equals("update")) { 
RDebugUtils.currentLine=112066573;
 //BA.debugLineNum = 112066573;BA.debugLine="UpdateApp";
__ref._updateapp /*String*/ (null);
 };
RDebugUtils.currentLine=112066575;
 //BA.debugLineNum = 112066575;BA.debugLine="If VerFlag=\"checkupdate\" Then";
if ((__ref._verflag /*String*/ ).equals("checkupdate")) { 
RDebugUtils.currentLine=112066576;
 //BA.debugLineNum = 112066576;BA.debugLine="ToastMessageShow(\"نسخه جدید موجود است لطفا برو";
__c.ToastMessageShow(BA.ObjectToCharSequence("نسخه جدید موجود است لطفا بروزرسانی کنید"),__c.True);
 };
 }else {
RDebugUtils.currentLine=112066579;
 //BA.debugLineNum = 112066579;BA.debugLine="ToastMessageShow(\"شما از آخرین ورژن استفاده می";
__c.ToastMessageShow(BA.ObjectToCharSequence("شما از آخرین ورژن استفاده می کنید"),__c.True);
 };
 };
RDebugUtils.currentLine=112066582;
 //BA.debugLineNum = 112066582;BA.debugLine="End Sub";
return "";
}
public String  _updateapp(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "updateapp", false))
	 {return ((String) Debug.delegate(ba, "updateapp", null));}
RDebugUtils.currentLine=111476736;
 //BA.debugLineNum = 111476736;BA.debugLine="Sub UpdateApp";
RDebugUtils.currentLine=111476738;
 //BA.debugLineNum = 111476738;BA.debugLine="apkupdt.PackageName = \"ir.parsikhesab.pakhsh\"";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._setpackagename /*String*/ (null,"ir.parsikhesab.pakhsh");
RDebugUtils.currentLine=111476739;
 //BA.debugLineNum = 111476739;BA.debugLine="apkupdt.NewVerApk = MCode.LinkDownload";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._setnewverapk(null,_mcode._linkdownload /*String*/ );
RDebugUtils.currentLine=111476740;
 //BA.debugLineNum = 111476740;BA.debugLine="apkupdt.setCredentials(\"test\",\"test\")";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._setcredentials /*String*/ (null,"test","test");
RDebugUtils.currentLine=111476741;
 //BA.debugLineNum = 111476741;BA.debugLine="ButtonUpdate_Click";
__ref._buttonupdate_click /*void*/ (null);
RDebugUtils.currentLine=111476745;
 //BA.debugLineNum = 111476745;BA.debugLine="End Sub";
return "";
}
public String  _pnl_addnewmoshtari_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_addnewmoshtari_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_addnewmoshtari_click", null));}
RDebugUtils.currentLine=110821376;
 //BA.debugLineNum = 110821376;BA.debugLine="Sub pnl_AddNewMoshtari_Click";
RDebugUtils.currentLine=110821377;
 //BA.debugLineNum = 110821377;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=110821378;
 //BA.debugLineNum = 110821378;BA.debugLine="If MCode.Vaziat=0 Then";
if (_mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=110821379;
 //BA.debugLineNum = 110821379;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),__c.True);
RDebugUtils.currentLine=110821380;
 //BA.debugLineNum = 110821380;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110821382;
 //BA.debugLineNum = 110821382;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((_mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=110821383;
 //BA.debugLineNum = 110821383;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
__c.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),__c.True);
RDebugUtils.currentLine=110821384;
 //BA.debugLineNum = 110821384;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110821386;
 //BA.debugLineNum = 110821386;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (_mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=110821387;
 //BA.debugLineNum = 110821387;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
__c.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),__c.True);
RDebugUtils.currentLine=110821388;
 //BA.debugLineNum = 110821388;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110821390;
 //BA.debugLineNum = 110821390;BA.debugLine="StartActivity(Act_NewAshkhas)";
__c.StartActivity(ba,(Object)(_act_newashkhas.getObject()));
RDebugUtils.currentLine=110821391;
 //BA.debugLineNum = 110821391;BA.debugLine="End Sub";
return "";
}
public String  _pnl_backup_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_backup_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_backup_click", null));}
RDebugUtils.currentLine=111280128;
 //BA.debugLineNum = 111280128;BA.debugLine="Sub pnl_Backup_Click";
RDebugUtils.currentLine=111280129;
 //BA.debugLineNum = 111280129;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=111280130;
 //BA.debugLineNum = 111280130;BA.debugLine="CallSubDelayed(Act_Main,\"OpenBackUpPnl\")";
__c.CallSubDelayed(ba,(Object)(_act_main.getObject()),"OpenBackUpPnl");
RDebugUtils.currentLine=111280131;
 //BA.debugLineNum = 111280131;BA.debugLine="End Sub";
return "";
}
public String  _pnl_callsuport_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_callsuport_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_callsuport_click", null));}
RDebugUtils.currentLine=111083520;
 //BA.debugLineNum = 111083520;BA.debugLine="Sub pnl_CallSuport_Click";
RDebugUtils.currentLine=111083521;
 //BA.debugLineNum = 111083521;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=111083522;
 //BA.debugLineNum = 111083522;BA.debugLine="StartActivity(Act_Support)";
__c.StartActivity(ba,(Object)(_act_support.getObject()));
RDebugUtils.currentLine=111083523;
 //BA.debugLineNum = 111083523;BA.debugLine="End Sub";
return "";
}
public String  _pnl_downloadlastversion_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_downloadlastversion_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_downloadlastversion_click", null));}
RDebugUtils.currentLine=112263168;
 //BA.debugLineNum = 112263168;BA.debugLine="Private Sub pnl_DownloadLastVersion_Click";
RDebugUtils.currentLine=112263169;
 //BA.debugLineNum = 112263169;BA.debugLine="VerFlag=\"Download\"";
__ref._verflag /*String*/  = "Download";
RDebugUtils.currentLine=112263170;
 //BA.debugLineNum = 112263170;BA.debugLine="GetVersion";
__ref._getversion /*String*/ (null);
RDebugUtils.currentLine=112263171;
 //BA.debugLineNum = 112263171;BA.debugLine="End Sub";
return "";
}
public String  _pnl_elanat_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_elanat_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_elanat_click", null));}
RDebugUtils.currentLine=110886912;
 //BA.debugLineNum = 110886912;BA.debugLine="Sub pnl_Elanat_Click";
RDebugUtils.currentLine=110886913;
 //BA.debugLineNum = 110886913;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=110886914;
 //BA.debugLineNum = 110886914;BA.debugLine="If MCode.Vaziat=0 Then";
if (_mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=110886915;
 //BA.debugLineNum = 110886915;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),__c.True);
RDebugUtils.currentLine=110886916;
 //BA.debugLineNum = 110886916;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110886918;
 //BA.debugLineNum = 110886918;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((_mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=110886919;
 //BA.debugLineNum = 110886919;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
__c.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),__c.True);
RDebugUtils.currentLine=110886920;
 //BA.debugLineNum = 110886920;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110886922;
 //BA.debugLineNum = 110886922;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (_mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=110886923;
 //BA.debugLineNum = 110886923;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
__c.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),__c.True);
RDebugUtils.currentLine=110886924;
 //BA.debugLineNum = 110886924;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110886926;
 //BA.debugLineNum = 110886926;BA.debugLine="StartActivity(Act_Notif)";
__c.StartActivity(ba,(Object)(_act_notif.getObject()));
RDebugUtils.currentLine=110886927;
 //BA.debugLineNum = 110886927;BA.debugLine="End Sub";
return "";
}
public String  _pnl_exit_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_exit_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_exit_click", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=111149056;
 //BA.debugLineNum = 111149056;BA.debugLine="Sub Pnl_Exit_Click";
RDebugUtils.currentLine=111149057;
 //BA.debugLineNum = 111149057;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=111149058;
 //BA.debugLineNum = 111149058;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=111149059;
 //BA.debugLineNum = 111149059;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
RDebugUtils.currentLine=111149060;
 //BA.debugLineNum = 111149060;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
_jo.RunMethod("finishAffinity",(Object[])(__c.Null));
RDebugUtils.currentLine=111149061;
 //BA.debugLineNum = 111149061;BA.debugLine="ExitApplication";
__c.ExitApplication();
RDebugUtils.currentLine=111149062;
 //BA.debugLineNum = 111149062;BA.debugLine="End Sub";
return "";
}
public String  _pnl_getdata_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_getdata_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_getdata_click", null));}
RDebugUtils.currentLine=110624768;
 //BA.debugLineNum = 110624768;BA.debugLine="Sub pnl_GetData_Click";
RDebugUtils.currentLine=110624769;
 //BA.debugLineNum = 110624769;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=110624785;
 //BA.debugLineNum = 110624785;BA.debugLine="CallSubDelayed(Act_Main,\"pnlGetData_Click\")";
__c.CallSubDelayed(ba,(Object)(_act_main.getObject()),"pnlGetData_Click");
RDebugUtils.currentLine=110624786;
 //BA.debugLineNum = 110624786;BA.debugLine="End Sub";
return "";
}
public String  _pnl_newsefaresh_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_newsefaresh_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_newsefaresh_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=110755840;
 //BA.debugLineNum = 110755840;BA.debugLine="Sub pnl_NewSefaresh_Click";
RDebugUtils.currentLine=110755841;
 //BA.debugLineNum = 110755841;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=110755842;
 //BA.debugLineNum = 110755842;BA.debugLine="If MCode.Vaziat=0 Then";
if (_mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=110755843;
 //BA.debugLineNum = 110755843;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),__c.True);
RDebugUtils.currentLine=110755844;
 //BA.debugLineNum = 110755844;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110755846;
 //BA.debugLineNum = 110755846;BA.debugLine="If	MCode.Visitor=\"0\" Then";
if ((_mcode._visitor /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=110755847;
 //BA.debugLineNum = 110755847;BA.debugLine="ToastMessageShow(\"این بخش مربوط به نسخه ویزیتور";
__c.ToastMessageShow(BA.ObjectToCharSequence("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید"),__c.True);
RDebugUtils.currentLine=110755848;
 //BA.debugLineNum = 110755848;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110755850;
 //BA.debugLineNum = 110755850;BA.debugLine="Dim Cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=110755851;
 //BA.debugLineNum = 110755851;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblSetting");
RDebugUtils.currentLine=110755852;
 //BA.debugLineNum = 110755852;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=110755853;
 //BA.debugLineNum = 110755853;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
__c.LogImpl("5110755853",_cu.GetString("FldC_Visitor"),0);
RDebugUtils.currentLine=110755854;
 //BA.debugLineNum = 110755854;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" Th";
if ((_cu.GetString("FldC_Visitor")).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=110755855;
 //BA.debugLineNum = 110755855;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بعد";
__c.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید"),__c.True);
RDebugUtils.currentLine=110755856;
 //BA.debugLineNum = 110755856;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110755858;
 //BA.debugLineNum = 110755858;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((_mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=110755859;
 //BA.debugLineNum = 110755859;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
__c.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),__c.True);
RDebugUtils.currentLine=110755860;
 //BA.debugLineNum = 110755860;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110755862;
 //BA.debugLineNum = 110755862;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (_mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=110755863;
 //BA.debugLineNum = 110755863;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
__c.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),__c.True);
RDebugUtils.currentLine=110755864;
 //BA.debugLineNum = 110755864;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110755871;
 //BA.debugLineNum = 110755871;BA.debugLine="Cu=MCode.Result(\"Select * From TblKala\")";
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblKala");
RDebugUtils.currentLine=110755872;
 //BA.debugLineNum = 110755872;BA.debugLine="If Cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=110755873;
 //BA.debugLineNum = 110755873;BA.debugLine="ToastMessageShow(\"لیست کالا به درستی دریافت نشده";
__c.ToastMessageShow(BA.ObjectToCharSequence("لیست کالا به درستی دریافت نشده است"),__c.True);
RDebugUtils.currentLine=110755874;
 //BA.debugLineNum = 110755874;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110755876;
 //BA.debugLineNum = 110755876;BA.debugLine="Cu=MCode.Result(\"Select * From TblGoroohKala\")";
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblGoroohKala");
RDebugUtils.currentLine=110755877;
 //BA.debugLineNum = 110755877;BA.debugLine="If Cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=110755878;
 //BA.debugLineNum = 110755878;BA.debugLine="ToastMessageShow(\"جدول گروه کالا به درستی دریافت";
__c.ToastMessageShow(BA.ObjectToCharSequence("جدول گروه کالا به درستی دریافت نشده است"),__c.True);
RDebugUtils.currentLine=110755879;
 //BA.debugLineNum = 110755879;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110755881;
 //BA.debugLineNum = 110755881;BA.debugLine="Cu=MCode.Result(\"Select * From TblTasvie\")";
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblTasvie");
RDebugUtils.currentLine=110755882;
 //BA.debugLineNum = 110755882;BA.debugLine="If Cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=110755883;
 //BA.debugLineNum = 110755883;BA.debugLine="ToastMessageShow(\"جدول تسویه حساب به درستی دریاف";
__c.ToastMessageShow(BA.ObjectToCharSequence("جدول تسویه حساب به درستی دریافت نشده است"),__c.True);
RDebugUtils.currentLine=110755884;
 //BA.debugLineNum = 110755884;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110755887;
 //BA.debugLineNum = 110755887;BA.debugLine="MCode.Action=\"SabtFaktor\"";
_mcode._action /*String*/  = "SabtFaktor";
RDebugUtils.currentLine=110755888;
 //BA.debugLineNum = 110755888;BA.debugLine="StartActivity(Act_KalaDefault)";
__c.StartActivity(ba,(Object)(_act_kaladefault.getObject()));
RDebugUtils.currentLine=110755889;
 //BA.debugLineNum = 110755889;BA.debugLine="End Sub";
return "";
}
public String  _pnl_printsetting_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_printsetting_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_printsetting_click", null));}
RDebugUtils.currentLine=111017984;
 //BA.debugLineNum = 111017984;BA.debugLine="Sub pnl_PrintSetting_Click";
RDebugUtils.currentLine=111017985;
 //BA.debugLineNum = 111017985;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=111017987;
 //BA.debugLineNum = 111017987;BA.debugLine="End Sub";
return "";
}
public String  _pnl_reports_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_reports_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_reports_click", null));}
RDebugUtils.currentLine=110952448;
 //BA.debugLineNum = 110952448;BA.debugLine="Sub pnl_Reports_Click";
RDebugUtils.currentLine=110952449;
 //BA.debugLineNum = 110952449;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=110952450;
 //BA.debugLineNum = 110952450;BA.debugLine="If MCode.Vaziat=0 Then";
if (_mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=110952451;
 //BA.debugLineNum = 110952451;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),__c.True);
RDebugUtils.currentLine=110952452;
 //BA.debugLineNum = 110952452;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110952454;
 //BA.debugLineNum = 110952454;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((_mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=110952455;
 //BA.debugLineNum = 110952455;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
__c.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),__c.True);
RDebugUtils.currentLine=110952456;
 //BA.debugLineNum = 110952456;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110952458;
 //BA.debugLineNum = 110952458;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (_mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=110952459;
 //BA.debugLineNum = 110952459;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
__c.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),__c.True);
RDebugUtils.currentLine=110952460;
 //BA.debugLineNum = 110952460;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110952462;
 //BA.debugLineNum = 110952462;BA.debugLine="StartActivity(Act_Choose_Report)";
__c.StartActivity(ba,(Object)(_act_choose_report.getObject()));
RDebugUtils.currentLine=110952463;
 //BA.debugLineNum = 110952463;BA.debugLine="End Sub";
return "";
}
public String  _pnl_senddata_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_senddata_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_senddata_click", null));}
RDebugUtils.currentLine=110690304;
 //BA.debugLineNum = 110690304;BA.debugLine="Sub Pnl_SendData_Click";
RDebugUtils.currentLine=110690305;
 //BA.debugLineNum = 110690305;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=110690306;
 //BA.debugLineNum = 110690306;BA.debugLine="If MCode.Vaziat=0 Then";
if (_mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=110690307;
 //BA.debugLineNum = 110690307;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),__c.True);
RDebugUtils.currentLine=110690308;
 //BA.debugLineNum = 110690308;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=110690310;
 //BA.debugLineNum = 110690310;BA.debugLine="StartActivity(Act_SendData)";
__c.StartActivity(ba,(Object)(_act_senddata.getObject()));
RDebugUtils.currentLine=110690311;
 //BA.debugLineNum = 110690311;BA.debugLine="End Sub";
return "";
}
public void  _pnl_updateapk_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_updateapk_click", false))
	 {Debug.delegate(ba, "pnl_updateapk_click", null); return;}
ResumableSub_pnl_updateApk_Click rsub = new ResumableSub_pnl_updateApk_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_pnl_updateApk_Click extends BA.ResumableSub {
public ResumableSub_pnl_updateApk_Click(ir.parsikhesab.pakhsh.cls_submenu1 parent,ir.parsikhesab.pakhsh.cls_submenu1 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_submenu1 __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
int _result1 = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_submenu1";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=111411201;
 //BA.debugLineNum = 111411201;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=111411202;
 //BA.debugLineNum = 111411202;BA.debugLine="Msgbox2Async(\"\" & CRLF & \"آیا از اطلاعات فعلی فای";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(""+parent.__c.CRLF+"آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟"),BA.ObjectToCharSequence("توجه"),"بله","انصراف","خیر",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=111411203;
 //BA.debugLineNum = 111411203;BA.debugLine="Wait For Msgbox_Result(Result1 As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_submenu1", "pnl_updateapk_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result1 = (Integer) result[1];
;
RDebugUtils.currentLine=111411204;
 //BA.debugLineNum = 111411204;BA.debugLine="If Result1=DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result1==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=111411205;
 //BA.debugLineNum = 111411205;BA.debugLine="MCode.CreateBK(\"\")";
parent._mcode._createbk /*void*/ (ba,"");
RDebugUtils.currentLine=111411206;
 //BA.debugLineNum = 111411206;BA.debugLine="CallSubDelayed(Act_Main,\"UpdateVersion\")";
parent.__c.CallSubDelayed(ba,(Object)(parent._act_main.getObject()),"UpdateVersion");
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=111411209;
 //BA.debugLineNum = 111411209;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _pnl_video_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnl_video_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_video_click", null));}
RDebugUtils.currentLine=112328704;
 //BA.debugLineNum = 112328704;BA.debugLine="Private Sub Pnl_Video_Click";
RDebugUtils.currentLine=112328705;
 //BA.debugLineNum = 112328705;BA.debugLine="If MCode.Vaziat=0 Then";
if (_mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=112328706;
 //BA.debugLineNum = 112328706;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),__c.True);
RDebugUtils.currentLine=112328707;
 //BA.debugLineNum = 112328707;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=112328709;
 //BA.debugLineNum = 112328709;BA.debugLine="If MCode.IsConnected Then";
if (_mcode._isconnected /*boolean*/ (ba)) { 
RDebugUtils.currentLine=112328710;
 //BA.debugLineNum = 112328710;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((_mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=112328711;
 //BA.debugLineNum = 112328711;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
__c.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),__c.True);
RDebugUtils.currentLine=112328712;
 //BA.debugLineNum = 112328712;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=112328714;
 //BA.debugLineNum = 112328714;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (_mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=112328715;
 //BA.debugLineNum = 112328715;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tru";
__c.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),__c.True);
RDebugUtils.currentLine=112328716;
 //BA.debugLineNum = 112328716;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=112328718;
 //BA.debugLineNum = 112328718;BA.debugLine="StartActivity(Act_Video)";
__c.StartActivity(ba,(Object)(_act_video.getObject()));
 }else {
RDebugUtils.currentLine=112328720;
 //BA.debugLineNum = 112328720;BA.debugLine="ToastMessageShow(\"ارتباط اینترنت شما قطع میباشد\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("ارتباط اینترنت شما قطع میباشد"),__c.False);
 };
RDebugUtils.currentLine=112328722;
 //BA.debugLineNum = 112328722;BA.debugLine="End Sub";
return "";
}
public void  _pnlchangecompany_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnlchangecompany_click", false))
	 {Debug.delegate(ba, "pnlchangecompany_click", null); return;}
ResumableSub_PnlChangeCompany_Click rsub = new ResumableSub_PnlChangeCompany_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_PnlChangeCompany_Click extends BA.ResumableSub {
public ResumableSub_PnlChangeCompany_Click(ir.parsikhesab.pakhsh.cls_submenu1 parent,ir.parsikhesab.pakhsh.cls_submenu1 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_submenu1 __ref;
ir.parsikhesab.pakhsh.cls_submenu1 parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_submenu1";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=111345665;
 //BA.debugLineNum = 111345665;BA.debugLine="Msgbox2Async(\"با تغییر فروشگاه اطلاعات فعلی حذف م";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("با تغییر فروشگاه اطلاعات فعلی حذف میگردد، لطفا قبل از تغییر فروشگاه نسبت به ارسال اطلاعات اطمینان حاصل فرمایید."+parent.__c.CRLF+"آیا می خواهید فروشگاه را تغییر دهید؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=111345666;
 //BA.debugLineNum = 111345666;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_submenu1", "pnlchangecompany_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=111345667;
 //BA.debugLineNum = 111345667;BA.debugLine="If Result=DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=111345668;
 //BA.debugLineNum = 111345668;BA.debugLine="Msgbox2Async(\"\" & CRLF & \"آیا از اطلاعات فعلی فا";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(""+parent.__c.CRLF+"آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟"),BA.ObjectToCharSequence("توجه"),"بله","انصراف","خیر",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=111345669;
 //BA.debugLineNum = 111345669;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_submenu1", "pnlchangecompany_click"), null);
this.state = 10;
return;
case 10:
//C
this.state = 4;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=111345670;
 //BA.debugLineNum = 111345670;BA.debugLine="If Result=DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=111345671;
 //BA.debugLineNum = 111345671;BA.debugLine="MCode.CreateBK(\"\")";
parent._mcode._createbk /*void*/ (ba,"");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=111345673;
 //BA.debugLineNum = 111345673;BA.debugLine="File.Delete(File.DirDefaultExternal &\"/Parsik\",\"";
parent.__c.File.Delete(parent.__c.File.getDirDefaultExternal()+"/Parsik","parsik_db.db");
RDebugUtils.currentLine=111345674;
 //BA.debugLineNum = 111345674;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_submenu1", "pnlchangecompany_click"),(int) (200));
this.state = 11;
return;
case 11:
//C
this.state = 8;
;
RDebugUtils.currentLine=111345675;
 //BA.debugLineNum = 111345675;BA.debugLine="File.Copy(File.DirAssets,\"parsik_db.db\",File.Dir";
parent.__c.File.Copy(parent.__c.File.getDirAssets(),"parsik_db.db",parent.__c.File.getDirDefaultExternal()+"/Parsik","parsik_db.db");
RDebugUtils.currentLine=111345676;
 //BA.debugLineNum = 111345676;BA.debugLine="StartActivity(Main)";
parent.__c.StartActivity(ba,(Object)(parent._main.getObject()));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=111345678;
 //BA.debugLineNum = 111345678;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=111345679;
 //BA.debugLineNum = 111345679;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _pnlsendtiket_click(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "pnlsendtiket_click", false))
	 {return ((String) Debug.delegate(ba, "pnlsendtiket_click", null));}
RDebugUtils.currentLine=111214592;
 //BA.debugLineNum = 111214592;BA.debugLine="Sub pnlSendTiket_Click";
RDebugUtils.currentLine=111214593;
 //BA.debugLineNum = 111214593;BA.debugLine="HideMenu";
__ref._hidemenu /*String*/ (null);
RDebugUtils.currentLine=111214594;
 //BA.debugLineNum = 111214594;BA.debugLine="StartActivity(Act_Ticket)";
__c.StartActivity(ba,(Object)(_act_ticket.getObject()));
RDebugUtils.currentLine=111214595;
 //BA.debugLineNum = 111214595;BA.debugLine="End Sub";
return "";
}
public String  _refresh(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "refresh", false))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=110493696;
 //BA.debugLineNum = 110493696;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=110493699;
 //BA.debugLineNum = 110493699;BA.debugLine="End Sub";
return "";
}
public String  _update_updatecomplete(ir.parsikhesab.pakhsh.cls_submenu1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_submenu1";
if (Debug.shouldDelegate(ba, "update_updatecomplete", false))
	 {return ((String) Debug.delegate(ba, "update_updatecomplete", null));}
RDebugUtils.currentLine=111869952;
 //BA.debugLineNum = 111869952;BA.debugLine="Sub update_UpdateComplete";
RDebugUtils.currentLine=111869953;
 //BA.debugLineNum = 111869953;BA.debugLine="LogColor($\"UpdateComplete - time: ${DateTime.Time";
__c.LogImpl("5111869953",("UpdateComplete - time: "+__c.SmartStringFormatter("",(Object)(__c.DateTime.Time(__c.DateTime.getNow())))+""),((int)0xff556b2f));
RDebugUtils.currentLine=111869954;
 //BA.debugLineNum = 111869954;BA.debugLine="apkupdt.StopSplashScreen";
__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._stopsplashscreen /*String*/ (null);
RDebugUtils.currentLine=111869956;
 //BA.debugLineNum = 111869956;BA.debugLine="Select apkupdt.Status";
switch (BA.switchObjectToInt(__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._getstatus /*int*/ (null),__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._ok_curver /*int*/ ,__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._ok_webver /*int*/ ,__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._ok_newerapk /*int*/ ,__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._no_newerapk /*int*/ ,__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._ok_download /*int*/ ,__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._ok_install /*int*/ ,__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._err_noperm /*int*/ )) {
case 0: {
RDebugUtils.currentLine=111869958;
 //BA.debugLineNum = 111869958;BA.debugLine="Log($\"Running apk version: ${apkupdt.CurVN}${CR";
__c.LogImpl("5111869958",("Running apk version: "+__c.SmartStringFormatter("",(Object)(__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._getcurvn /*String*/ (null)))+""+__c.SmartStringFormatter("",(Object)(__c.CRLF))+""),0);
 break; }
case 1: {
RDebugUtils.currentLine=111869960;
 //BA.debugLineNum = 111869960;BA.debugLine="Log($\"Webserver apk version: ${apkupdt.WebVN}${";
__c.LogImpl("5111869960",("Webserver apk version: "+__c.SmartStringFormatter("",(Object)(__ref._apkupdt /*ir.parsikhesab.pakhsh.cl_appupdate*/ ._getwebvn /*String*/ (null)))+""+__c.SmartStringFormatter("",(Object)(__c.CRLF))+""),0);
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 break; }
case 5: {
 break; }
case 6: {
RDebugUtils.currentLine=111869972;
 //BA.debugLineNum = 111869972;BA.debugLine="Log(\"No permission to install\")";
__c.LogImpl("5111869972","No permission to install",0);
 break; }
default: {
 break; }
}
;
RDebugUtils.currentLine=111869977;
 //BA.debugLineNum = 111869977;BA.debugLine="End Sub";
return "";
}
}