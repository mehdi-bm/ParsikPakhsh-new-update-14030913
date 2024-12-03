package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_rec_havale extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_rec_havale");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_rec_havale.class).invoke(this, new Object[] {null});
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
public ir.parsikhesab.pakhsh.mcode._adapterephavale _item = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public Object _base = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotal = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarehavale = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcount = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluncheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshowhavale = null;
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
public String  _lblshowhavale_click(ir.parsikhesab.pakhsh.cls_rec_havale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_havale";
if (Debug.shouldDelegate(ba, "lblshowhavale_click", false))
	 {return ((String) Debug.delegate(ba, "lblshowhavale_click", null));}
RDebugUtils.currentLine=98500608;
 //BA.debugLineNum = 98500608;BA.debugLine="Public Sub lblShowHavale_Click";
RDebugUtils.currentLine=98500609;
 //BA.debugLineNum = 98500609;BA.debugLine="MCode.ShomareHavale=Item.fldShomareHavale";
_mcode._shomarehavale /*String*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterephavale*/ .fldShomareHavale /*String*/ ;
RDebugUtils.currentLine=98500610;
 //BA.debugLineNum = 98500610;BA.debugLine="Act_RizHavale.Item1=Item";
_act_rizhavale._item1 /*ir.parsikhesab.pakhsh.mcode._adapterephavale*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterephavale*/ ;
RDebugUtils.currentLine=98500611;
 //BA.debugLineNum = 98500611;BA.debugLine="StartActivity(Act_RizHavale)";
__c.StartActivity(ba,(Object)(_act_rizhavale.getObject()));
RDebugUtils.currentLine=98500612;
 //BA.debugLineNum = 98500612;BA.debugLine="End Sub";
return "";
}
public String  _show(ir.parsikhesab.pakhsh.cls_rec_havale __ref,ir.parsikhesab.pakhsh.mcode._adapterephavale _item1) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_havale";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1}));}
RDebugUtils.currentLine=98435072;
 //BA.debugLineNum = 98435072;BA.debugLine="Public Sub Show(Item1 As AdapteRepHavale)";
RDebugUtils.currentLine=98435073;
 //BA.debugLineNum = 98435073;BA.debugLine="Item=Item1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterephavale*/  = _item1;
RDebugUtils.currentLine=98435074;
 //BA.debugLineNum = 98435074;BA.debugLine="LblShomareHavale.Text=\"شماره حواله \"&Item1.fldSho";
__ref._lblshomarehavale /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شماره حواله "+_item1.fldShomareHavale /*String*/ ));
RDebugUtils.currentLine=98435075;
 //BA.debugLineNum = 98435075;BA.debugLine="LblDate.Text=MCode.PersianDateDash(Item1.fldDate)";
__ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._persiandatedash /*String*/ (ba,_item1.fldDate /*String*/ )));
RDebugUtils.currentLine=98435076;
 //BA.debugLineNum = 98435076;BA.debugLine="lblCount.Text=Item1.fldCountFactor";
__ref._lblcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldCountFactor /*String*/ ));
RDebugUtils.currentLine=98435077;
 //BA.debugLineNum = 98435077;BA.debugLine="If Item1.fldMandeFactor>0 Then";
if ((double)(Double.parseDouble(_item1.fldMandeFactor /*String*/ ))>0) { 
RDebugUtils.currentLine=98435078;
 //BA.debugLineNum = 98435078;BA.debugLine="LblTotal.Text=MCode.qomaAshar(Item1.fldMandeFact";
__ref._lbltotal /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._qomaashar /*String*/ (ba,(Object)(_item1.fldMandeFactor /*String*/ ))+" "+_mcode._vahedpool /*String*/ ));
 }else {
RDebugUtils.currentLine=98435080;
 //BA.debugLineNum = 98435080;BA.debugLine="LblTotal.Text=0";
__ref._lbltotal /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=98435083;
 //BA.debugLineNum = 98435083;BA.debugLine="If myCode.Is_Null_adad(Item1.fldVaziat)=0 Then";
if ((_mycode._is_null_adad /*String*/ (ba,_item1.fldVaziat /*String*/ )).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=98435084;
 //BA.debugLineNum = 98435084;BA.debugLine="lblUnCheck.Visible=True";
__ref._lbluncheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=98435085;
 //BA.debugLineNum = 98435085;BA.debugLine="lblCheck.Visible=False";
__ref._lblcheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=98435087;
 //BA.debugLineNum = 98435087;BA.debugLine="lblUnCheck.Visible=False";
__ref._lbluncheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=98435088;
 //BA.debugLineNum = 98435088;BA.debugLine="lblCheck.Visible=True";
__ref._lblcheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=98435090;
 //BA.debugLineNum = 98435090;BA.debugLine="Log(Item1.fldVaziat)";
__c.LogImpl("598435090",_item1.fldVaziat /*String*/ ,0);
RDebugUtils.currentLine=98435093;
 //BA.debugLineNum = 98435093;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_rec_havale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_havale";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=98369536;
 //BA.debugLineNum = 98369536;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=98369537;
 //BA.debugLineNum = 98369537;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=98369538;
 //BA.debugLineNum = 98369538;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_rec_havale __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_rec_havale";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=98238464;
 //BA.debugLineNum = 98238464;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=98238465;
 //BA.debugLineNum = 98238465;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=98238466;
 //BA.debugLineNum = 98238466;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=98238467;
 //BA.debugLineNum = 98238467;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=98238468;
 //BA.debugLineNum = 98238468;BA.debugLine="p.LoadLayout(\"l_rechavale\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_rechavale",ba);
RDebugUtils.currentLine=98238470;
 //BA.debugLineNum = 98238470;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_rec_havale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_havale";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=98304000;
 //BA.debugLineNum = 98304000;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=98304001;
 //BA.debugLineNum = 98304001;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=98304002;
 //BA.debugLineNum = 98304002;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=98304003;
 //BA.debugLineNum = 98304003;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_rec_havale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_havale";
RDebugUtils.currentLine=98172928;
 //BA.debugLineNum = 98172928;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=98172929;
 //BA.debugLineNum = 98172929;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=98172931;
 //BA.debugLineNum = 98172931;BA.debugLine="Dim Item As AdapteRepHavale";
_item = new ir.parsikhesab.pakhsh.mcode._adapterephavale();
RDebugUtils.currentLine=98172932;
 //BA.debugLineNum = 98172932;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=98172933;
 //BA.debugLineNum = 98172933;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=98172934;
 //BA.debugLineNum = 98172934;BA.debugLine="Private LblDate As Label";
_lbldate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98172935;
 //BA.debugLineNum = 98172935;BA.debugLine="Private LblTotal As Label";
_lbltotal = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98172936;
 //BA.debugLineNum = 98172936;BA.debugLine="Private LblShomareHavale As Label";
_lblshomarehavale = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98172937;
 //BA.debugLineNum = 98172937;BA.debugLine="Private lblCount As Label";
_lblcount = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98172938;
 //BA.debugLineNum = 98172938;BA.debugLine="Private lblCheck As Label";
_lblcheck = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98172939;
 //BA.debugLineNum = 98172939;BA.debugLine="Private lblUnCheck As Label";
_lbluncheck = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98172940;
 //BA.debugLineNum = 98172940;BA.debugLine="Private lblShowHavale As Label";
_lblshowhavale = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98172941;
 //BA.debugLineNum = 98172941;BA.debugLine="End Sub";
return "";
}
}