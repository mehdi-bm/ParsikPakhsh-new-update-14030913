package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_faktor2_type1 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_faktor2_type1");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_faktor2_type1.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lblfee = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablagh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamekala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblradif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedajoze = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltakhfifikala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltakhfifvizhe = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghkhales = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedaddarkarton = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharh = null;
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
public String  _initialize(ir.parsikhesab.pakhsh.cls_faktor2_type1 __ref,anywheresoftware.b4a.BA _ba,String _radif,String _codekala,String _namekala,String _fee,String _feetakhfifkala,String _feetakhfifvizhe,String _sum,String _mablaghkhales,String _tedadjoze,String _tedadkol,String _tedaddarkarton,String _sharh) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_faktor2_type1";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_radif,_codekala,_namekala,_fee,_feetakhfifkala,_feetakhfifvizhe,_sum,_mablaghkhales,_tedadjoze,_tedadkol,_tedaddarkarton,_sharh}));}
RDebugUtils.currentLine=90636288;
 //BA.debugLineNum = 90636288;BA.debugLine="Public Sub Initialize(Radif,CodeKala,NameKala,Fee,";
RDebugUtils.currentLine=90636289;
 //BA.debugLineNum = 90636289;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=90636290;
 //BA.debugLineNum = 90636290;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=90636291;
 //BA.debugLineNum = 90636291;BA.debugLine="p.LoadLayout(\"l_faktor2_type1\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_faktor2_type1",ba);
RDebugUtils.currentLine=90636292;
 //BA.debugLineNum = 90636292;BA.debugLine="lblRadif.Text=Radif";
__ref._lblradif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_radif));
RDebugUtils.currentLine=90636293;
 //BA.debugLineNum = 90636293;BA.debugLine="lblCodeKala.Text=CodeKala";
__ref._lblcodekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_codekala));
RDebugUtils.currentLine=90636294;
 //BA.debugLineNum = 90636294;BA.debugLine="lblNameKala.Text=NameKala";
__ref._lblnamekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_namekala));
RDebugUtils.currentLine=90636295;
 //BA.debugLineNum = 90636295;BA.debugLine="lblFee.Text=Fee";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_fee));
RDebugUtils.currentLine=90636296;
 //BA.debugLineNum = 90636296;BA.debugLine="lblTakhfifiKala.Text=FeeTakhfifKala";
__ref._lbltakhfifikala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_feetakhfifkala));
RDebugUtils.currentLine=90636297;
 //BA.debugLineNum = 90636297;BA.debugLine="lblTakhfifVizhe.Text=FeeTakhfifVizhe";
__ref._lbltakhfifvizhe /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_feetakhfifvizhe));
RDebugUtils.currentLine=90636298;
 //BA.debugLineNum = 90636298;BA.debugLine="lblMablagh.Text=Sum";
__ref._lblmablagh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_sum));
RDebugUtils.currentLine=90636299;
 //BA.debugLineNum = 90636299;BA.debugLine="lblMablaghKhales.Text=MablaghKhales";
__ref._lblmablaghkhales /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mablaghkhales));
RDebugUtils.currentLine=90636300;
 //BA.debugLineNum = 90636300;BA.debugLine="lblTedaJoze.Text=TedadJoze";
__ref._lbltedajoze /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tedadjoze));
RDebugUtils.currentLine=90636301;
 //BA.debugLineNum = 90636301;BA.debugLine="lblTedadKol.Text=TedadKol";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tedadkol));
RDebugUtils.currentLine=90636302;
 //BA.debugLineNum = 90636302;BA.debugLine="lblTedadDarKarton.Text=TedadDarKarton";
__ref._lbltedaddarkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tedaddarkarton));
RDebugUtils.currentLine=90636303;
 //BA.debugLineNum = 90636303;BA.debugLine="lblSharh.Text=Sharh";
__ref._lblsharh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_sharh));
RDebugUtils.currentLine=90636304;
 //BA.debugLineNum = 90636304;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_faktor2_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_type1";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=90701824;
 //BA.debugLineNum = 90701824;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=90701825;
 //BA.debugLineNum = 90701825;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=90701826;
 //BA.debugLineNum = 90701826;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=90701827;
 //BA.debugLineNum = 90701827;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_faktor2_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_type1";
RDebugUtils.currentLine=90570752;
 //BA.debugLineNum = 90570752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=90570753;
 //BA.debugLineNum = 90570753;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=90570756;
 //BA.debugLineNum = 90570756;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=90570757;
 //BA.debugLineNum = 90570757;BA.debugLine="Private lblCodeKala As Label";
_lblcodekala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570758;
 //BA.debugLineNum = 90570758;BA.debugLine="Private lblFee As Label";
_lblfee = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570759;
 //BA.debugLineNum = 90570759;BA.debugLine="Private lblMablagh As Label";
_lblmablagh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570760;
 //BA.debugLineNum = 90570760;BA.debugLine="Private lblNameKala As Label";
_lblnamekala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570761;
 //BA.debugLineNum = 90570761;BA.debugLine="Private lblRadif As Label";
_lblradif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570762;
 //BA.debugLineNum = 90570762;BA.debugLine="Private lblTedadKol As Label";
_lbltedadkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570763;
 //BA.debugLineNum = 90570763;BA.debugLine="Private lblTedaJoze As Label";
_lbltedajoze = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570764;
 //BA.debugLineNum = 90570764;BA.debugLine="Private lblTakhfifiKala As Label";
_lbltakhfifikala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570765;
 //BA.debugLineNum = 90570765;BA.debugLine="Private lblTakhfifVizhe As Label";
_lbltakhfifvizhe = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570766;
 //BA.debugLineNum = 90570766;BA.debugLine="Private lblMablaghKhales As Label";
_lblmablaghkhales = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570767;
 //BA.debugLineNum = 90570767;BA.debugLine="Private lblTedadDarKarton As Label";
_lbltedaddarkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570768;
 //BA.debugLineNum = 90570768;BA.debugLine="Private lblSharh As Label";
_lblsharh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=90570769;
 //BA.debugLineNum = 90570769;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_faktor2_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_type1";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=90832896;
 //BA.debugLineNum = 90832896;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=90832897;
 //BA.debugLineNum = 90832897;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=90832898;
 //BA.debugLineNum = 90832898;BA.debugLine="End Sub";
return 0;
}
public int  _getleft(ir.parsikhesab.pakhsh.cls_faktor2_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_type1";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=90963968;
 //BA.debugLineNum = 90963968;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=90963969;
 //BA.debugLineNum = 90963969;BA.debugLine="Return pnl_bk.Left";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=90963970;
 //BA.debugLineNum = 90963970;BA.debugLine="End Sub";
return 0;
}
public int  _gettop(ir.parsikhesab.pakhsh.cls_faktor2_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_type1";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=90898432;
 //BA.debugLineNum = 90898432;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=90898433;
 //BA.debugLineNum = 90898433;BA.debugLine="Return pnl_bk.Top";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=90898434;
 //BA.debugLineNum = 90898434;BA.debugLine="End Sub";
return 0;
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_faktor2_type1 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_faktor2_type1";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=90767360;
 //BA.debugLineNum = 90767360;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=90767361;
 //BA.debugLineNum = 90767361;BA.debugLine="Return pnl_bk.Width";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=90767362;
 //BA.debugLineNum = 90767362;BA.debugLine="End Sub";
return 0;
}
}