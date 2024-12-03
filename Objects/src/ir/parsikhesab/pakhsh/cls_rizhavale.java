package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_rizhavale extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_rizhavale");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_rizhavale.class).invoke(this, new Object[] {null});
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
public ir.parsikhesab.pakhsh.mcode._adapterizhavale _item = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public Object _base = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarefaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblc_ashkhas = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbln_ashkhas = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_tell = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdress = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnshowmap = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluncheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcheck = null;
public String _shomarehavale = "";
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
public String  _lblshowhavale_click(ir.parsikhesab.pakhsh.cls_rizhavale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizhavale";
if (Debug.shouldDelegate(ba, "lblshowhavale_click", false))
	 {return ((String) Debug.delegate(ba, "lblshowhavale_click", null));}
RDebugUtils.currentLine=108462080;
 //BA.debugLineNum = 108462080;BA.debugLine="Public Sub lblShowHavale_Click";
RDebugUtils.currentLine=108462081;
 //BA.debugLineNum = 108462081;BA.debugLine="Act_RizeFactorHavale.ShomareFaktor=Item.fldShomar";
_act_rizefactorhavale._shomarefaktor /*String*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterizhavale*/ .fldShomareFactor /*String*/ ;
RDebugUtils.currentLine=108462082;
 //BA.debugLineNum = 108462082;BA.debugLine="Act_RizeFactorHavale.ShomareHavale=shomareHavale";
_act_rizefactorhavale._shomarehavale /*String*/  = __ref._shomarehavale /*String*/ ;
RDebugUtils.currentLine=108462083;
 //BA.debugLineNum = 108462083;BA.debugLine="Act_RizeFactorHavale.CodeMoshtari=LblC_Ashkhas.Te";
_act_rizefactorhavale._codemoshtari /*String*/  = __ref._lblc_ashkhas /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
RDebugUtils.currentLine=108462084;
 //BA.debugLineNum = 108462084;BA.debugLine="Act_RizeFactorHavale.NameMoshtari=LblN_Ashkhas.Te";
_act_rizefactorhavale._namemoshtari /*String*/  = __ref._lbln_ashkhas /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
RDebugUtils.currentLine=108462085;
 //BA.debugLineNum = 108462085;BA.debugLine="Act_RizeFactorHavale.date=LblDate.Text";
_act_rizefactorhavale._date /*String*/  = __ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
RDebugUtils.currentLine=108462086;
 //BA.debugLineNum = 108462086;BA.debugLine="Act_RizeFactorHavale.fldLat=Item.fldLat";
_act_rizefactorhavale._fldlat /*String*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterizhavale*/ .fldLat /*String*/ ;
RDebugUtils.currentLine=108462087;
 //BA.debugLineNum = 108462087;BA.debugLine="Act_RizeFactorHavale.fldLon=Item.fldLon";
_act_rizefactorhavale._fldlon /*String*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterizhavale*/ .fldLon /*String*/ ;
RDebugUtils.currentLine=108462089;
 //BA.debugLineNum = 108462089;BA.debugLine="StartActivity(Act_RizeFactorHavale)";
__c.StartActivity(ba,(Object)(_act_rizefactorhavale.getObject()));
RDebugUtils.currentLine=108462090;
 //BA.debugLineNum = 108462090;BA.debugLine="End Sub";
return "";
}
public String  _show(ir.parsikhesab.pakhsh.cls_rizhavale __ref,ir.parsikhesab.pakhsh.mcode._adapterizhavale _item1,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizhavale";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1,_position}));}
RDebugUtils.currentLine=108396544;
 //BA.debugLineNum = 108396544;BA.debugLine="Public Sub Show(Item1 As AdapteRizHavale,position";
RDebugUtils.currentLine=108396545;
 //BA.debugLineNum = 108396545;BA.debugLine="Item=Item1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterizhavale*/  = _item1;
RDebugUtils.currentLine=108396546;
 //BA.debugLineNum = 108396546;BA.debugLine="BtnShowMap.Tag=position";
__ref._btnshowmap /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_position));
RDebugUtils.currentLine=108396547;
 //BA.debugLineNum = 108396547;BA.debugLine="LblShomareFaktor.Text=Item1.fldShomareFactor";
__ref._lblshomarefaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldShomareFactor /*String*/ ));
RDebugUtils.currentLine=108396548;
 //BA.debugLineNum = 108396548;BA.debugLine="LblDate.Text=MCode.PersianDateDash(Item1.fldDate)";
__ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._persiandatedash /*String*/ (ba,_item1.fldDate /*String*/ )));
RDebugUtils.currentLine=108396550;
 //BA.debugLineNum = 108396550;BA.debugLine="If Item1.fldMablaghKhales>0 Then";
if ((double)(Double.parseDouble(_item1.fldMablaghKhales /*String*/ ))>0) { 
RDebugUtils.currentLine=108396551;
 //BA.debugLineNum = 108396551;BA.debugLine="LblTotalFaktor.Text=MCode.qomaAshar(Item1.fldMab";
__ref._lbltotalfaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._qomaashar /*String*/ (ba,(Object)(_item1.fldMablaghKhales /*String*/ ))+" "+_mcode._vahedpool /*String*/ ));
 }else {
RDebugUtils.currentLine=108396553;
 //BA.debugLineNum = 108396553;BA.debugLine="LblTotalFaktor.Text=0";
__ref._lbltotalfaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=108396556;
 //BA.debugLineNum = 108396556;BA.debugLine="LblC_Ashkhas.Text=Item1.fldCodeTafzili";
__ref._lblc_ashkhas /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldCodeTafzili /*String*/ ));
RDebugUtils.currentLine=108396557;
 //BA.debugLineNum = 108396557;BA.debugLine="LblN_Ashkhas.Text=Item1.fldSharhTafzili";
__ref._lbln_ashkhas /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldSharhTafzili /*String*/ ));
RDebugUtils.currentLine=108396558;
 //BA.debugLineNum = 108396558;BA.debugLine="Lbl_Tell.Text=Item1.fldTell";
__ref._lbl_tell /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldTell /*String*/ ));
RDebugUtils.currentLine=108396559;
 //BA.debugLineNum = 108396559;BA.debugLine="lblAddress.Text=Item1.fldAddress";
__ref._lbladdress /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldAddress /*String*/ ));
RDebugUtils.currentLine=108396560;
 //BA.debugLineNum = 108396560;BA.debugLine="Log(Item1.fldCodeTafzili)";
__c.LogImpl("5108396560",_item1.fldCodeTafzili /*String*/ ,0);
RDebugUtils.currentLine=108396561;
 //BA.debugLineNum = 108396561;BA.debugLine="Log(Item1.Distance)";
__c.LogImpl("5108396561",_item1.Distance /*String*/ ,0);
RDebugUtils.currentLine=108396562;
 //BA.debugLineNum = 108396562;BA.debugLine="Log(Item1.fldLat)";
__c.LogImpl("5108396562",_item1.fldLat /*String*/ ,0);
RDebugUtils.currentLine=108396563;
 //BA.debugLineNum = 108396563;BA.debugLine="Log(Item1.fldLon)";
__c.LogImpl("5108396563",_item1.fldLon /*String*/ ,0);
RDebugUtils.currentLine=108396564;
 //BA.debugLineNum = 108396564;BA.debugLine="If myCode.Is_Null_adad(Item1.fldVaziat)=0 Then";
if ((_mycode._is_null_adad /*String*/ (ba,_item1.fldVaziat /*String*/ )).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=108396565;
 //BA.debugLineNum = 108396565;BA.debugLine="lblUnCheck.Visible=True";
__ref._lbluncheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=108396566;
 //BA.debugLineNum = 108396566;BA.debugLine="lblCheck.Visible=False";
__ref._lblcheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=108396568;
 //BA.debugLineNum = 108396568;BA.debugLine="lblUnCheck.Visible=False";
__ref._lbluncheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=108396569;
 //BA.debugLineNum = 108396569;BA.debugLine="lblCheck.Visible=True";
__ref._lblcheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=108396571;
 //BA.debugLineNum = 108396571;BA.debugLine="If Item.fldLat<>\"\" And Item.fldLon<>\"\" Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterizhavale*/ .fldLat /*String*/ ).equals("") == false && (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterizhavale*/ .fldLon /*String*/ ).equals("") == false) { 
 }else {
RDebugUtils.currentLine=108396574;
 //BA.debugLineNum = 108396574;BA.debugLine="BtnShowMap.Visible=False";
__ref._btnshowmap /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=108396576;
 //BA.debugLineNum = 108396576;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_rizhavale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizhavale";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=108331008;
 //BA.debugLineNum = 108331008;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=108331009;
 //BA.debugLineNum = 108331009;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=108331010;
 //BA.debugLineNum = 108331010;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_rizhavale __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_rizhavale";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=108199936;
 //BA.debugLineNum = 108199936;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=108199937;
 //BA.debugLineNum = 108199937;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=108199938;
 //BA.debugLineNum = 108199938;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=108199939;
 //BA.debugLineNum = 108199939;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=108199940;
 //BA.debugLineNum = 108199940;BA.debugLine="p.LoadLayout(\"l_RecRizFactorHavale\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_RecRizFactorHavale",ba);
RDebugUtils.currentLine=108199942;
 //BA.debugLineNum = 108199942;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_rizhavale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizhavale";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=108265472;
 //BA.debugLineNum = 108265472;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=108265473;
 //BA.debugLineNum = 108265473;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=108265474;
 //BA.debugLineNum = 108265474;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=108265475;
 //BA.debugLineNum = 108265475;BA.debugLine="End Sub";
return null;
}
public String  _btnshowmap_click(ir.parsikhesab.pakhsh.cls_rizhavale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizhavale";
if (Debug.shouldDelegate(ba, "btnshowmap_click", false))
	 {return ((String) Debug.delegate(ba, "btnshowmap_click", null));}
double _destlat = 0;
double _destlng = 0;
String _label = "";
String _uri = "";
anywheresoftware.b4a.objects.IntentWrapper _intent = null;
RDebugUtils.currentLine=108527616;
 //BA.debugLineNum = 108527616;BA.debugLine="Private Sub BtnShowMap_Click";
RDebugUtils.currentLine=108527617;
 //BA.debugLineNum = 108527617;BA.debugLine="Dim destLat As Double = Item.fldLat ' عرض جغرافیا";
_destlat = (double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterizhavale*/ .fldLat /*String*/ ));
RDebugUtils.currentLine=108527618;
 //BA.debugLineNum = 108527618;BA.debugLine="Dim destLng As Double = Item.fldLon ' طول جغرافیا";
_destlng = (double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterizhavale*/ .fldLon /*String*/ ));
RDebugUtils.currentLine=108527619;
 //BA.debugLineNum = 108527619;BA.debugLine="Dim label As String = Item.fldSharhTafzili ' برچس";
_label = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterizhavale*/ .fldSharhTafzili /*String*/ ;
RDebugUtils.currentLine=108527621;
 //BA.debugLineNum = 108527621;BA.debugLine="Dim Uri As String";
_uri = "";
RDebugUtils.currentLine=108527622;
 //BA.debugLineNum = 108527622;BA.debugLine="Uri = \"google.navigation:q=\" & destLat & \",\" & de";
_uri = "google.navigation:q="+BA.NumberToString(_destlat)+","+BA.NumberToString(_destlng)+"&label="+_label;
RDebugUtils.currentLine=108527624;
 //BA.debugLineNum = 108527624;BA.debugLine="Dim intent As Intent";
_intent = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=108527625;
 //BA.debugLineNum = 108527625;BA.debugLine="intent.Initialize(intent.ACTION_VIEW, Uri)";
_intent.Initialize(_intent.ACTION_VIEW,_uri);
RDebugUtils.currentLine=108527626;
 //BA.debugLineNum = 108527626;BA.debugLine="intent.SetComponent(\"com.google.android.apps.maps";
_intent.SetComponent("com.google.android.apps.maps");
RDebugUtils.currentLine=108527628;
 //BA.debugLineNum = 108527628;BA.debugLine="If intent.IsInitialized Then";
if (_intent.IsInitialized()) { 
RDebugUtils.currentLine=108527629;
 //BA.debugLineNum = 108527629;BA.debugLine="StartActivity(intent)";
__c.StartActivity(ba,(Object)(_intent.getObject()));
 }else {
RDebugUtils.currentLine=108527631;
 //BA.debugLineNum = 108527631;BA.debugLine="ToastMessageShow(\"لطفا GoogleMap را نصب نمایید.\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("لطفا GoogleMap را نصب نمایید."),__c.True);
 };
RDebugUtils.currentLine=108527645;
 //BA.debugLineNum = 108527645;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_rizhavale __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizhavale";
RDebugUtils.currentLine=108134400;
 //BA.debugLineNum = 108134400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=108134401;
 //BA.debugLineNum = 108134401;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=108134403;
 //BA.debugLineNum = 108134403;BA.debugLine="Dim Item As AdapteRizHavale";
_item = new ir.parsikhesab.pakhsh.mcode._adapterizhavale();
RDebugUtils.currentLine=108134404;
 //BA.debugLineNum = 108134404;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=108134405;
 //BA.debugLineNum = 108134405;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=108134406;
 //BA.debugLineNum = 108134406;BA.debugLine="Private LblDate As Label";
_lbldate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108134408;
 //BA.debugLineNum = 108134408;BA.debugLine="Private LblShomareFaktor As Label";
_lblshomarefaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108134409;
 //BA.debugLineNum = 108134409;BA.debugLine="Private LblTotalFaktor As Label";
_lbltotalfaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108134410;
 //BA.debugLineNum = 108134410;BA.debugLine="Private LblC_Ashkhas As Label";
_lblc_ashkhas = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108134411;
 //BA.debugLineNum = 108134411;BA.debugLine="Private LblN_Ashkhas As Label";
_lbln_ashkhas = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108134412;
 //BA.debugLineNum = 108134412;BA.debugLine="Private Lbl_Tell As Label";
_lbl_tell = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108134413;
 //BA.debugLineNum = 108134413;BA.debugLine="Private lblAddress As Label";
_lbladdress = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108134414;
 //BA.debugLineNum = 108134414;BA.debugLine="Private BtnShowMap As Label";
_btnshowmap = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108134415;
 //BA.debugLineNum = 108134415;BA.debugLine="Private lblUnCheck As Label";
_lbluncheck = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108134416;
 //BA.debugLineNum = 108134416;BA.debugLine="Private lblCheck As Label";
_lblcheck = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108134417;
 //BA.debugLineNum = 108134417;BA.debugLine="Public shomareHavale As String";
_shomarehavale = "";
RDebugUtils.currentLine=108134418;
 //BA.debugLineNum = 108134418;BA.debugLine="End Sub";
return "";
}
}