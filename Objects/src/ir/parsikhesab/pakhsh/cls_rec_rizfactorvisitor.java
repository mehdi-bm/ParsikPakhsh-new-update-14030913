package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_rec_rizfactorvisitor extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public Object _base = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodekala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfeejoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblradif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharhkala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadcarton = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedaddarkarton = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor __ref,ir.parsikhesab.pakhsh.mcode._adaptereprizfactorvisitor _item1) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_rizfactorvisitor";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1}));}
RDebugUtils.currentLine=100204544;
 //BA.debugLineNum = 100204544;BA.debugLine="Public Sub Show(Item1 As AdapteRepRizFactorVisitor";
RDebugUtils.currentLine=100204546;
 //BA.debugLineNum = 100204546;BA.debugLine="LblRadif.Text=Item1.fldRadif";
__ref._lblradif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldRadif /*String*/ ));
RDebugUtils.currentLine=100204547;
 //BA.debugLineNum = 100204547;BA.debugLine="lblCodeKala.Text=Item1.fldCodeKala";
__ref._lblcodekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldCodeKala /*String*/ ));
RDebugUtils.currentLine=100204548;
 //BA.debugLineNum = 100204548;BA.debugLine="LblFeeJoz.Text=Item1.fldFeeJoz &\" \"&MCode.VahedPo";
__ref._lblfeejoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldFeeJoz /*String*/ +" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=100204549;
 //BA.debugLineNum = 100204549;BA.debugLine="lblSharhKala.Text=Item1.fldSharhKala";
__ref._lblsharhkala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldSharhKala /*String*/ ));
RDebugUtils.currentLine=100204550;
 //BA.debugLineNum = 100204550;BA.debugLine="lblTedadJoz.Text=Item1.fldTedadJoz";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldTedadJoz /*String*/ ));
RDebugUtils.currentLine=100204551;
 //BA.debugLineNum = 100204551;BA.debugLine="LblTedadCarton.Text=Item1.fldTedadCarton";
__ref._lbltedadcarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldTedadCarton /*String*/ ));
RDebugUtils.currentLine=100204552;
 //BA.debugLineNum = 100204552;BA.debugLine="lblSharh.Text=Item1.fldTozihatRecord";
__ref._lblsharh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldTozihatRecord /*String*/ ));
RDebugUtils.currentLine=100204553;
 //BA.debugLineNum = 100204553;BA.debugLine="If Item1.SumFee>0 Then";
if (_item1.SumFee /*int*/ >0) { 
RDebugUtils.currentLine=100204554;
 //BA.debugLineNum = 100204554;BA.debugLine="LblMablaghKol.Text=MCode.qomaAshar(Item1.SumFee)";
__ref._lblmablaghkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._qomaashar /*String*/ (ba,(Object)(_item1.SumFee /*int*/ ))+" "+_mcode._vahedpool /*String*/ ));
 }else {
RDebugUtils.currentLine=100204556;
 //BA.debugLineNum = 100204556;BA.debugLine="LblMablaghKol.Text=0";
__ref._lblmablaghkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=100204559;
 //BA.debugLineNum = 100204559;BA.debugLine="LblTedadDarKarton.Text=Item1.FldTedadDarKarton";
__ref._lbltedaddarkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.FldTedadDarKarton /*String*/ ));
RDebugUtils.currentLine=100204563;
 //BA.debugLineNum = 100204563;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_rizfactorvisitor";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=100139008;
 //BA.debugLineNum = 100139008;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=100139009;
 //BA.debugLineNum = 100139009;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=100139010;
 //BA.debugLineNum = 100139010;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_rec_rizfactorvisitor";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=100007936;
 //BA.debugLineNum = 100007936;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=100007937;
 //BA.debugLineNum = 100007937;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=100007938;
 //BA.debugLineNum = 100007938;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=100007939;
 //BA.debugLineNum = 100007939;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=100007940;
 //BA.debugLineNum = 100007940;BA.debugLine="p.LoadLayout(\"l_rec_rizfactorvisitor\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_rec_rizfactorvisitor",ba);
RDebugUtils.currentLine=100007942;
 //BA.debugLineNum = 100007942;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_rizfactorvisitor";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=100073472;
 //BA.debugLineNum = 100073472;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=100073473;
 //BA.debugLineNum = 100073473;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=100073474;
 //BA.debugLineNum = 100073474;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=100073475;
 //BA.debugLineNum = 100073475;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_rizfactorvisitor";
RDebugUtils.currentLine=99942400;
 //BA.debugLineNum = 99942400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=99942401;
 //BA.debugLineNum = 99942401;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=99942404;
 //BA.debugLineNum = 99942404;BA.debugLine="Private Panel4 As Panel";
_panel4 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=99942405;
 //BA.debugLineNum = 99942405;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=99942406;
 //BA.debugLineNum = 99942406;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=99942409;
 //BA.debugLineNum = 99942409;BA.debugLine="Private lblCodeKala As Label";
_lblcodekala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99942410;
 //BA.debugLineNum = 99942410;BA.debugLine="Private LblFeeJoz As Label";
_lblfeejoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99942411;
 //BA.debugLineNum = 99942411;BA.debugLine="Private LblRadif As Label";
_lblradif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99942412;
 //BA.debugLineNum = 99942412;BA.debugLine="Private lblSharh As Label";
_lblsharh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99942413;
 //BA.debugLineNum = 99942413;BA.debugLine="Private lblSharhKala As Label";
_lblsharhkala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99942414;
 //BA.debugLineNum = 99942414;BA.debugLine="Private LblTedadCarton As Label";
_lbltedadcarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99942415;
 //BA.debugLineNum = 99942415;BA.debugLine="Private lblTedadJoz As Label";
_lbltedadjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99942416;
 //BA.debugLineNum = 99942416;BA.debugLine="Private LblMablaghKol As Label";
_lblmablaghkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99942417;
 //BA.debugLineNum = 99942417;BA.debugLine="Private LblTedadDarKarton As Label";
_lbltedaddarkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99942418;
 //BA.debugLineNum = 99942418;BA.debugLine="End Sub";
return "";
}
}