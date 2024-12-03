package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_faktor2_havale_type2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_faktor2_havale_type2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_faktor2_havale_type2.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lblcodekala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldarsadtakhfif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfee = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfeetakhfifi = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfeeyekkarton = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamekala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblradif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedajoze = null;
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
public String  _initialize(ir.parsikhesab.pakhsh.cls_faktor2_havale_type2 __ref,anywheresoftware.b4a.BA _ba,String _radif,String _codekala,String _namekala,String _fee,String _feeyekkarton,String _feetakhfif,String _darsadtakhfif,String _tedadjoze,String _tedadkol) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_faktor2_havale_type2";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_radif,_codekala,_namekala,_fee,_feeyekkarton,_feetakhfif,_darsadtakhfif,_tedadjoze,_tedadkol}));}
RDebugUtils.currentLine=90177536;
 //BA.debugLineNum = 90177536;BA.debugLine="Public Sub Initialize(Radif,CodeKala,NameKala,Fee,";
RDebugUtils.currentLine=90177537;
 //BA.debugLineNum = 90177537;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=90177538;
 //BA.debugLineNum = 90177538;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=90177539;
 //BA.debugLineNum = 90177539;BA.debugLine="p.LoadLayout(\"l_faktor2_havale_Type2\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_faktor2_havale_Type2",ba);
RDebugUtils.currentLine=90177540;
 //BA.debugLineNum = 90177540;BA.debugLine="lblRadif.Text=Radif";
__ref._lblradif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_radif));
RDebugUtils.currentLine=90177542;
 //BA.debugLineNum = 90177542;BA.debugLine="lblCodeKala.Text=CodeKala";
__ref._lblcodekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_codekala));
RDebugUtils.currentLine=90177543;
 //BA.debugLineNum = 90177543;BA.debugLine="lblNameKala.Text=NameKala";
__ref._lblnamekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_namekala));
RDebugUtils.currentLine=90177545;
 //BA.debugLineNum = 90177545;BA.debugLine="lblFeeTakhfifi.Text=FeeTakhfif";
__ref._lblfeetakhfifi /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_feetakhfif));
RDebugUtils.currentLine=90177546;
 //BA.debugLineNum = 90177546;BA.debugLine="lblDarsadTakhfif.Text=DarsadTakhfif";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_darsadtakhfif));
RDebugUtils.currentLine=90177548;
 //BA.debugLineNum = 90177548;BA.debugLine="lblTedaJoze.Text=TedadJoze";
__ref._lbltedajoze /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tedadjoze));
RDebugUtils.currentLine=90177549;
 //BA.debugLineNum = 90177549;BA.debugLine="lblTedadKol.Text=TedadKol";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tedadkol));
RDebugUtils.currentLine=90177551;
 //BA.debugLineNum = 90177551;BA.debugLine="lblFee.Text=Fee";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_fee));
RDebugUtils.currentLine=90177552;
 //BA.debugLineNum = 90177552;BA.debugLine="lblFeeYekKarton.Text=FeeYekKarton";
__ref._lblfeeyekkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_feeyekkarton));
RDebugUtils.currentLine=90177554;
 //BA.debugLineNum = 90177554;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_faktor2_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_havale_type2";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=90243072;
 //BA.debugLineNum = 90243072;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=90243073;
 //BA.debugLineNum = 90243073;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=90243074;
 //BA.debugLineNum = 90243074;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=90243075;
 //BA.debugLineNum = 90243075;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_faktor2_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_havale_type2";
RDebugUtils.currentLine=90112000;
 //BA.debugLineNum = 90112000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=90112001;
 //BA.debugLineNum = 90112001;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=90112004;
 //BA.debugLineNum = 90112004;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=90112006;
 //BA.debugLineNum = 90112006;BA.debugLine="Private lblCodeKala As Label";
_lblcodekala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90112007;
 //BA.debugLineNum = 90112007;BA.debugLine="Private lblDarsadTakhfif As Label";
_lbldarsadtakhfif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90112008;
 //BA.debugLineNum = 90112008;BA.debugLine="Private lblFee As Label";
_lblfee = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90112009;
 //BA.debugLineNum = 90112009;BA.debugLine="Private lblFeeTakhfifi As Label";
_lblfeetakhfifi = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90112010;
 //BA.debugLineNum = 90112010;BA.debugLine="Private lblFeeYekKarton As Label";
_lblfeeyekkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90112011;
 //BA.debugLineNum = 90112011;BA.debugLine="Private lblNameKala As Label";
_lblnamekala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90112012;
 //BA.debugLineNum = 90112012;BA.debugLine="Private lblRadif As Label";
_lblradif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90112013;
 //BA.debugLineNum = 90112013;BA.debugLine="Private lblTedadKol As Label";
_lbltedadkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90112014;
 //BA.debugLineNum = 90112014;BA.debugLine="Private lblTedaJoze As Label";
_lbltedajoze = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90112015;
 //BA.debugLineNum = 90112015;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_faktor2_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_havale_type2";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=90374144;
 //BA.debugLineNum = 90374144;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=90374145;
 //BA.debugLineNum = 90374145;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=90374146;
 //BA.debugLineNum = 90374146;BA.debugLine="End Sub";
return 0;
}
public int  _getleft(ir.parsikhesab.pakhsh.cls_faktor2_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_havale_type2";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=90505216;
 //BA.debugLineNum = 90505216;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=90505217;
 //BA.debugLineNum = 90505217;BA.debugLine="Return pnl_bk.Left";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=90505218;
 //BA.debugLineNum = 90505218;BA.debugLine="End Sub";
return 0;
}
public int  _gettop(ir.parsikhesab.pakhsh.cls_faktor2_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_havale_type2";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=90439680;
 //BA.debugLineNum = 90439680;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=90439681;
 //BA.debugLineNum = 90439681;BA.debugLine="Return pnl_bk.Top";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=90439682;
 //BA.debugLineNum = 90439682;BA.debugLine="End Sub";
return 0;
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_faktor2_havale_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_havale_type2";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=90308608;
 //BA.debugLineNum = 90308608;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=90308609;
 //BA.debugLineNum = 90308609;BA.debugLine="Return pnl_bk.Width";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=90308610;
 //BA.debugLineNum = 90308610;BA.debugLine="End Sub";
return 0;
}
}