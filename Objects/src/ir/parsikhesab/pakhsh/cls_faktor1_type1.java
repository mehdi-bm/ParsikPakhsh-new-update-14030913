package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_faktor1_type1 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_faktor1_type1");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_faktor1_type1.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _p = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodemoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodevisitor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldatefactor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldatereport = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnameco = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamemoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamevisitor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarefactor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltimereport = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltell = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdress = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamecompany = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltellcompany = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdresscompany = null;
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
public String  _initialize(ir.parsikhesab.pakhsh.cls_faktor1_type1 __ref,anywheresoftware.b4a.BA _ba,String _codemoshtari,String _namemoshtari,String _codevisitor,String _namevisitor,String _nameco,String _shomarefactor,String _datefactor,String _datereport,String _timereport,String _tell,String _address,String _namecompany,String _tellcompany,String _addresscompany) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_faktor1_type1";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_codemoshtari,_namemoshtari,_codevisitor,_namevisitor,_nameco,_shomarefactor,_datefactor,_datereport,_timereport,_tell,_address,_namecompany,_tellcompany,_addresscompany}));}
RDebugUtils.currentLine=89260032;
 //BA.debugLineNum = 89260032;BA.debugLine="Public Sub Initialize(CodeMoshtari As String,NameM";
RDebugUtils.currentLine=89260033;
 //BA.debugLineNum = 89260033;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=89260034;
 //BA.debugLineNum = 89260034;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=89260035;
 //BA.debugLineNum = 89260035;BA.debugLine="p.LoadLayout(\"l_faktor1_type1\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_faktor1_type1",ba);
RDebugUtils.currentLine=89260036;
 //BA.debugLineNum = 89260036;BA.debugLine="lblCodeMoshtari.Text=CodeMoshtari";
__ref._lblcodemoshtari /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_codemoshtari));
RDebugUtils.currentLine=89260037;
 //BA.debugLineNum = 89260037;BA.debugLine="lblNameMoshtari.Text=NameMoshtari";
__ref._lblnamemoshtari /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_namemoshtari));
RDebugUtils.currentLine=89260038;
 //BA.debugLineNum = 89260038;BA.debugLine="lblCodeVisitor.Text=CodeVisitor";
__ref._lblcodevisitor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_codevisitor));
RDebugUtils.currentLine=89260039;
 //BA.debugLineNum = 89260039;BA.debugLine="lblNameVisitor.Text=NameVisitor";
__ref._lblnamevisitor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_namevisitor));
RDebugUtils.currentLine=89260040;
 //BA.debugLineNum = 89260040;BA.debugLine="lblNameCo.Text=NameCo";
__ref._lblnameco /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_nameco));
RDebugUtils.currentLine=89260041;
 //BA.debugLineNum = 89260041;BA.debugLine="lblShomareFactor.Text=ShomareFactor";
__ref._lblshomarefactor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_shomarefactor));
RDebugUtils.currentLine=89260042;
 //BA.debugLineNum = 89260042;BA.debugLine="lblDateFactor.Text=DateFactor";
__ref._lbldatefactor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datefactor));
RDebugUtils.currentLine=89260043;
 //BA.debugLineNum = 89260043;BA.debugLine="lblDateReport.Text=DateReport";
__ref._lbldatereport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datereport));
RDebugUtils.currentLine=89260044;
 //BA.debugLineNum = 89260044;BA.debugLine="lblTimeReport.Text=TimeReport";
__ref._lbltimereport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_timereport));
RDebugUtils.currentLine=89260045;
 //BA.debugLineNum = 89260045;BA.debugLine="lblTell.Text=Tell";
__ref._lbltell /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tell));
RDebugUtils.currentLine=89260046;
 //BA.debugLineNum = 89260046;BA.debugLine="lblAddress.Text=Address";
__ref._lbladdress /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_address));
RDebugUtils.currentLine=89260048;
 //BA.debugLineNum = 89260048;BA.debugLine="lblNameCompany.Text=NameCompany";
__ref._lblnamecompany /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_namecompany));
RDebugUtils.currentLine=89260049;
 //BA.debugLineNum = 89260049;BA.debugLine="lblTellCompany.Text=TellCompany";
__ref._lbltellcompany /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tellcompany));
RDebugUtils.currentLine=89260050;
 //BA.debugLineNum = 89260050;BA.debugLine="lblAddressCompany.Text=AddressCompany";
__ref._lbladdresscompany /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_addresscompany));
RDebugUtils.currentLine=89260051;
 //BA.debugLineNum = 89260051;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_faktor1_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor1_type1";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=89325568;
 //BA.debugLineNum = 89325568;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=89325569;
 //BA.debugLineNum = 89325569;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=89325570;
 //BA.debugLineNum = 89325570;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=89325571;
 //BA.debugLineNum = 89325571;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_faktor1_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor1_type1";
RDebugUtils.currentLine=89194496;
 //BA.debugLineNum = 89194496;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=89194497;
 //BA.debugLineNum = 89194497;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=89194498;
 //BA.debugLineNum = 89194498;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=89194501;
 //BA.debugLineNum = 89194501;BA.debugLine="Private lblCodeMoshtari As Label";
_lblcodemoshtari = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194502;
 //BA.debugLineNum = 89194502;BA.debugLine="Private lblCodeVisitor As Label";
_lblcodevisitor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194503;
 //BA.debugLineNum = 89194503;BA.debugLine="Private lblDateFactor As Label";
_lbldatefactor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194504;
 //BA.debugLineNum = 89194504;BA.debugLine="Private lblDateReport As Label";
_lbldatereport = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194505;
 //BA.debugLineNum = 89194505;BA.debugLine="Private lblNameCo As Label";
_lblnameco = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194506;
 //BA.debugLineNum = 89194506;BA.debugLine="Private lblNameMoshtari As Label";
_lblnamemoshtari = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194507;
 //BA.debugLineNum = 89194507;BA.debugLine="Private lblNameVisitor As Label";
_lblnamevisitor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194508;
 //BA.debugLineNum = 89194508;BA.debugLine="Private lblShomareFactor As Label";
_lblshomarefactor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194509;
 //BA.debugLineNum = 89194509;BA.debugLine="Private lblTimeReport As Label";
_lbltimereport = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194510;
 //BA.debugLineNum = 89194510;BA.debugLine="Private lblTell As Label";
_lbltell = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194511;
 //BA.debugLineNum = 89194511;BA.debugLine="Private lblAddress As Label";
_lbladdress = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194512;
 //BA.debugLineNum = 89194512;BA.debugLine="Private lblNameCompany As Label";
_lblnamecompany = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194513;
 //BA.debugLineNum = 89194513;BA.debugLine="Private lblTellCompany As Label";
_lbltellcompany = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194514;
 //BA.debugLineNum = 89194514;BA.debugLine="Private lblAddressCompany As Label";
_lbladdresscompany = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=89194515;
 //BA.debugLineNum = 89194515;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_faktor1_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor1_type1";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=89456640;
 //BA.debugLineNum = 89456640;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=89456641;
 //BA.debugLineNum = 89456641;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=89456642;
 //BA.debugLineNum = 89456642;BA.debugLine="End Sub";
return 0;
}
public int  _getleft(ir.parsikhesab.pakhsh.cls_faktor1_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor1_type1";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=89587712;
 //BA.debugLineNum = 89587712;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=89587713;
 //BA.debugLineNum = 89587713;BA.debugLine="Return pnl_bk.Left";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=89587714;
 //BA.debugLineNum = 89587714;BA.debugLine="End Sub";
return 0;
}
public int  _gettop(ir.parsikhesab.pakhsh.cls_faktor1_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor1_type1";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=89522176;
 //BA.debugLineNum = 89522176;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=89522177;
 //BA.debugLineNum = 89522177;BA.debugLine="Return pnl_bk.Top";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=89522178;
 //BA.debugLineNum = 89522178;BA.debugLine="End Sub";
return 0;
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_faktor1_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor1_type1";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=89391104;
 //BA.debugLineNum = 89391104;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=89391105;
 //BA.debugLineNum = 89391105;BA.debugLine="Return pnl_bk.Width";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=89391106;
 //BA.debugLineNum = 89391106;BA.debugLine="End Sub";
return 0;
}
}