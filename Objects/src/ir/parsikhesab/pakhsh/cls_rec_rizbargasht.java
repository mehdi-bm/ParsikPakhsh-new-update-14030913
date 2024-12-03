package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_rec_rizbargasht extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_rec_rizbargasht");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_rec_rizbargasht.class).invoke(this, new Object[] {null});
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
public Object _base = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor _itemfactor = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodekala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamekala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblradif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarefactor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalfactor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltype = null;
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
public String  _btnlist_click(ir.parsikhesab.pakhsh.cls_rec_rizbargasht __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_rizbargasht";
if (Debug.shouldDelegate(ba, "btnlist_click", false))
	 {return ((String) Debug.delegate(ba, "btnlist_click", null));}
RDebugUtils.currentLine=99876864;
 //BA.debugLineNum = 99876864;BA.debugLine="Private Sub BtnList_Click";
RDebugUtils.currentLine=99876865;
 //BA.debugLineNum = 99876865;BA.debugLine="MCode.FaktorSelect = ItemFactor.fldShomareFaktor";
_mcode._faktorselect /*String*/  = __ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/ .fldShomareFaktor /*String*/ ;
RDebugUtils.currentLine=99876866;
 //BA.debugLineNum = 99876866;BA.debugLine="StartActivity(Act_RizFaktor)";
__c.StartActivity(ba,(Object)(_act_rizfaktor.getObject()));
RDebugUtils.currentLine=99876867;
 //BA.debugLineNum = 99876867;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_rec_rizbargasht __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_rizbargasht";
RDebugUtils.currentLine=99549184;
 //BA.debugLineNum = 99549184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=99549185;
 //BA.debugLineNum = 99549185;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=99549186;
 //BA.debugLineNum = 99549186;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=99549187;
 //BA.debugLineNum = 99549187;BA.debugLine="Private ItemFactor As AdapterListRizeFaktor";
_itemfactor = new ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor();
RDebugUtils.currentLine=99549188;
 //BA.debugLineNum = 99549188;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=99549189;
 //BA.debugLineNum = 99549189;BA.debugLine="Private lblCodeKala As Label";
_lblcodekala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99549190;
 //BA.debugLineNum = 99549190;BA.debugLine="Private lblNameKala As Label";
_lblnamekala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99549191;
 //BA.debugLineNum = 99549191;BA.debugLine="Private lblRadif As Label";
_lblradif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99549192;
 //BA.debugLineNum = 99549192;BA.debugLine="Private lblShomareFactor As Label";
_lblshomarefactor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99549193;
 //BA.debugLineNum = 99549193;BA.debugLine="Private lblTedadJoz As Label";
_lbltedadjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99549194;
 //BA.debugLineNum = 99549194;BA.debugLine="Private lblTedadKol As Label";
_lbltedadkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99549195;
 //BA.debugLineNum = 99549195;BA.debugLine="Private lblTotalFactor As Label";
_lbltotalfactor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99549196;
 //BA.debugLineNum = 99549196;BA.debugLine="Private lblType As Label";
_lbltype = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99549197;
 //BA.debugLineNum = 99549197;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_rec_rizbargasht __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_rizbargasht";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=99811328;
 //BA.debugLineNum = 99811328;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=99811329;
 //BA.debugLineNum = 99811329;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=99811330;
 //BA.debugLineNum = 99811330;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_rec_rizbargasht __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_rizbargasht";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=99745792;
 //BA.debugLineNum = 99745792;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=99745793;
 //BA.debugLineNum = 99745793;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=99745794;
 //BA.debugLineNum = 99745794;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=99745795;
 //BA.debugLineNum = 99745795;BA.debugLine="End Sub";
return null;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_rec_rizbargasht __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_rec_rizbargasht";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=99614720;
 //BA.debugLineNum = 99614720;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=99614721;
 //BA.debugLineNum = 99614721;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=99614722;
 //BA.debugLineNum = 99614722;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=99614723;
 //BA.debugLineNum = 99614723;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=99614724;
 //BA.debugLineNum = 99614724;BA.debugLine="p.LoadLayout(\"l_Rec_RizeBargasht\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_Rec_RizeBargasht",ba);
RDebugUtils.currentLine=99614725;
 //BA.debugLineNum = 99614725;BA.debugLine="ItemFactor.Initialize";
__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/ .Initialize();
RDebugUtils.currentLine=99614727;
 //BA.debugLineNum = 99614727;BA.debugLine="End Sub";
return "";
}
public String  _show(ir.parsikhesab.pakhsh.cls_rec_rizbargasht __ref,ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor _item1) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_rizbargasht";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1}));}
RDebugUtils.currentLine=99680256;
 //BA.debugLineNum = 99680256;BA.debugLine="Public Sub Show(Item1 As AdapterListRizeFaktor)";
RDebugUtils.currentLine=99680257;
 //BA.debugLineNum = 99680257;BA.debugLine="ItemFactor=Item1";
__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/  = _item1;
RDebugUtils.currentLine=99680258;
 //BA.debugLineNum = 99680258;BA.debugLine="lblRadif.Text=ItemFactor.FldRadif";
__ref._lblradif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/ .FldRadif /*String*/ ));
RDebugUtils.currentLine=99680259;
 //BA.debugLineNum = 99680259;BA.debugLine="lblCodeKala.Text=ItemFactor.fldCodeKala";
__ref._lblcodekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/ .fldCodeKala /*String*/ ));
RDebugUtils.currentLine=99680260;
 //BA.debugLineNum = 99680260;BA.debugLine="lblNameKala.Text=ItemFactor.fldSharhKala";
__ref._lblnamekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/ .fldSharhKala /*String*/ ));
RDebugUtils.currentLine=99680261;
 //BA.debugLineNum = 99680261;BA.debugLine="lblShomareFactor.Text=ItemFactor.fldShomareFaktor";
__ref._lblshomarefactor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/ .fldShomareFaktor /*String*/ ));
RDebugUtils.currentLine=99680262;
 //BA.debugLineNum = 99680262;BA.debugLine="lblTedadJoz.Text=ItemFactor.fldTedadJoz";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/ .fldTedadJoz /*String*/ ));
RDebugUtils.currentLine=99680263;
 //BA.debugLineNum = 99680263;BA.debugLine="lblTedadKol.Text=ItemFactor.fldTedadCarton";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/ .fldTedadCarton /*String*/ ));
RDebugUtils.currentLine=99680264;
 //BA.debugLineNum = 99680264;BA.debugLine="lblType.Text=ItemFactor.FldType";
__ref._lbltype /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/ .FldType /*String*/ ));
RDebugUtils.currentLine=99680265;
 //BA.debugLineNum = 99680265;BA.debugLine="lblTotalFactor.Text=myCode.AdadToPrice(ItemFactor";
__ref._lbltotalfactor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mycode._adadtoprice /*String*/ (ba,__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor*/ .fldTotalFaktor /*String*/ )));
RDebugUtils.currentLine=99680266;
 //BA.debugLineNum = 99680266;BA.debugLine="End Sub";
return "";
}
}