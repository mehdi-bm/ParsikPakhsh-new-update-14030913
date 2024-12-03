package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_recfaktor extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_recfaktor");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_recfaktor.class).invoke(this, new Object[] {null});
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
public ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _faktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarefaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalfaktor = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsync = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbargasht = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_recfaktor __ref,ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfaktor";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item}));}
RDebugUtils.currentLine=103809024;
 //BA.debugLineNum = 103809024;BA.debugLine="Public Sub show(item As AdapterListFaktor)";
RDebugUtils.currentLine=103809025;
 //BA.debugLineNum = 103809025;BA.debugLine="Try";
try {RDebugUtils.currentLine=103809026;
 //BA.debugLineNum = 103809026;BA.debugLine="faktor=item";
__ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/  = _item;
RDebugUtils.currentLine=103809027;
 //BA.debugLineNum = 103809027;BA.debugLine="LblShomareFaktor.Text =\"شماره سفارش \"& item.FldS";
__ref._lblshomarefaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شماره سفارش "+_item.fldShomareFaktor /*String*/ ));
RDebugUtils.currentLine=103809028;
 //BA.debugLineNum = 103809028;BA.debugLine="LblTotalFaktor.Text = myCode.AdadToPrice(item.Fl";
__ref._lbltotalfaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mycode._adadtoprice /*String*/ (ba,_item.fldTotalFaktor /*String*/ )));
RDebugUtils.currentLine=103809029;
 //BA.debugLineNum = 103809029;BA.debugLine="LblDate.text = MCode.PersianDateDash(item.FldDat";
__ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._persiandatedash /*String*/ (ba,_item.fldDate /*String*/ )));
RDebugUtils.currentLine=103809030;
 //BA.debugLineNum = 103809030;BA.debugLine="LblDate.text = LblDate.text & \" | \" & MCode.Sf.M";
__ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" | "+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item.fldTime /*String*/ ,(int) (1),(int) (2))+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item.fldTime /*String*/ ,(int) (3),(int) (2))));
RDebugUtils.currentLine=103809031;
 //BA.debugLineNum = 103809031;BA.debugLine="LblSync.Visible = item.synced";
__ref._lblsync /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(_item.synced /*boolean*/ );
RDebugUtils.currentLine=103809032;
 //BA.debugLineNum = 103809032;BA.debugLine="LblBargasht.Visible=item.wIsBacked";
__ref._lblbargasht /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(_item.wIsBacked /*boolean*/ );
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=103809034;
 //BA.debugLineNum = 103809034;BA.debugLine="Log(LastException)";
__c.LogImpl("5103809034",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=103809036;
 //BA.debugLineNum = 103809036;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_recfaktor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfaktor";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=103940096;
 //BA.debugLineNum = 103940096;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=103940097;
 //BA.debugLineNum = 103940097;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=103940098;
 //BA.debugLineNum = 103940098;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_recfaktor __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_recfaktor";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=103743488;
 //BA.debugLineNum = 103743488;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=103743489;
 //BA.debugLineNum = 103743489;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=103743490;
 //BA.debugLineNum = 103743490;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=103743491;
 //BA.debugLineNum = 103743491;BA.debugLine="p.LoadLayout(\"L_RecFaktor\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("L_RecFaktor",ba);
RDebugUtils.currentLine=103743493;
 //BA.debugLineNum = 103743493;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_recfaktor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfaktor";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=103874560;
 //BA.debugLineNum = 103874560;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=103874561;
 //BA.debugLineNum = 103874561;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=103874562;
 //BA.debugLineNum = 103874562;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=103874563;
 //BA.debugLineNum = 103874563;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_recfaktor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfaktor";
RDebugUtils.currentLine=103677952;
 //BA.debugLineNum = 103677952;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=103677953;
 //BA.debugLineNum = 103677953;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=103677954;
 //BA.debugLineNum = 103677954;BA.debugLine="Private faktor As AdapterListFaktor";
_faktor = new ir.parsikhesab.pakhsh.mcode._adapterlistfaktor();
RDebugUtils.currentLine=103677955;
 //BA.debugLineNum = 103677955;BA.debugLine="Private LblShomareFaktor As Label";
_lblshomarefaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=103677956;
 //BA.debugLineNum = 103677956;BA.debugLine="Private LblDate As Label";
_lbldate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=103677957;
 //BA.debugLineNum = 103677957;BA.debugLine="Private LblTotalFaktor As Label";
_lbltotalfaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=103677958;
 //BA.debugLineNum = 103677958;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=103677959;
 //BA.debugLineNum = 103677959;BA.debugLine="Private LblSync As Label";
_lblsync = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=103677960;
 //BA.debugLineNum = 103677960;BA.debugLine="Private LblBargasht As Label";
_lblbargasht = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=103677961;
 //BA.debugLineNum = 103677961;BA.debugLine="End Sub";
return "";
}
public String  _panel1_click(ir.parsikhesab.pakhsh.cls_recfaktor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfaktor";
if (Debug.shouldDelegate(ba, "panel1_click", false))
	 {return ((String) Debug.delegate(ba, "panel1_click", null));}
RDebugUtils.currentLine=104005632;
 //BA.debugLineNum = 104005632;BA.debugLine="Sub Panel1_Click";
RDebugUtils.currentLine=104005633;
 //BA.debugLineNum = 104005633;BA.debugLine="MCode.FaktorSelect=faktor.FldShomareFaktor";
_mcode._faktorselect /*String*/  = __ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareFaktor /*String*/ ;
RDebugUtils.currentLine=104005634;
 //BA.debugLineNum = 104005634;BA.debugLine="faktor.fldC_Ashkhas=MCode.C_Tafzili";
__ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldC_Ashkhas /*String*/  = _mcode._c_tafzili /*String*/ ;
RDebugUtils.currentLine=104005635;
 //BA.debugLineNum = 104005635;BA.debugLine="Act_RizFaktor.Faktor = faktor";
_act_rizfaktor._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/  = __ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ ;
RDebugUtils.currentLine=104005636;
 //BA.debugLineNum = 104005636;BA.debugLine="StartActivity(Act_RizFaktor)";
__c.StartActivity(ba,(Object)(_act_rizfaktor.getObject()));
RDebugUtils.currentLine=104005637;
 //BA.debugLineNum = 104005637;BA.debugLine="End Sub";
return "";
}
public String  _pnl_bk_click(ir.parsikhesab.pakhsh.cls_recfaktor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfaktor";
if (Debug.shouldDelegate(ba, "pnl_bk_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_bk_click", null));}
RDebugUtils.currentLine=104071168;
 //BA.debugLineNum = 104071168;BA.debugLine="Sub pnl_bk_Click";
RDebugUtils.currentLine=104071170;
 //BA.debugLineNum = 104071170;BA.debugLine="End Sub";
return "";
}
}