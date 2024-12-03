package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_rec_factor extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_rec_factor");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_rec_factor.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarefaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblc_ashkhas = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public Object _base = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlist = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbln_ashkhas = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _itemfactor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldatebargashti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarebargashti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomareforoosh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadbargashti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalbargashti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadmande = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghmande = null;
public String _date1 = "";
public String _date2 = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btnshowjozeiat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcheckamani = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziat = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_rec_factor __ref,ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _item1,String _dateaz,String _dateta) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factor";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1,_dateaz,_dateta}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=97452032;
 //BA.debugLineNum = 97452032;BA.debugLine="Public Sub Show(Item1 As AdapterListFaktor,DateAz";
RDebugUtils.currentLine=97452034;
 //BA.debugLineNum = 97452034;BA.debugLine="ItemFactor = Item1";
__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/  = _item1;
RDebugUtils.currentLine=97452035;
 //BA.debugLineNum = 97452035;BA.debugLine="LblShomareFaktor.Text = Item1.fldShomareFaktor";
__ref._lblshomarefaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldShomareFaktor /*String*/ ));
RDebugUtils.currentLine=97452036;
 //BA.debugLineNum = 97452036;BA.debugLine="LblTotalFaktor.Text = NumberFormat(Item1.fldTotal";
__ref._lbltotalfaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_item1.fldTotalFaktor /*String*/ )),(int) (1),(int) (3))));
RDebugUtils.currentLine=97452037;
 //BA.debugLineNum = 97452037;BA.debugLine="LblDate.Text = Item1.fldDate";
__ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldDate /*String*/ ));
RDebugUtils.currentLine=97452038;
 //BA.debugLineNum = 97452038;BA.debugLine="LblC_Ashkhas.Text = Item1.fldC_Ashkhas";
__ref._lblc_ashkhas /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldC_Ashkhas /*String*/ ));
RDebugUtils.currentLine=97452039;
 //BA.debugLineNum = 97452039;BA.debugLine="lblShomareForoosh.Text=Item1.fldShomareForoosh";
__ref._lblshomareforoosh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldShomareForoosh /*String*/ ));
RDebugUtils.currentLine=97452040;
 //BA.debugLineNum = 97452040;BA.debugLine="lblShomareBargashti.Text=myCode.Is_Null_adad(Item";
__ref._lblshomarebargashti /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mycode._is_null_adad /*String*/ (ba,_item1.FldShomareBargasht /*String*/ )));
RDebugUtils.currentLine=97452041;
 //BA.debugLineNum = 97452041;BA.debugLine="lblDateBargashti.Text=IIf(myCode.Check_Is_Null(It";
__ref._lbldatebargashti /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(((_mycode._check_is_null /*boolean*/ (ba,_item1.FldDateBargasht /*String*/ )) ? ((Object)("-")) : ((Object)(_item1.FldDateBargasht /*String*/ )))));
RDebugUtils.currentLine=97452042;
 //BA.debugLineNum = 97452042;BA.debugLine="lblTedadSefaresh.Text=myCode.ToInt(myCode.Is_Null";
__ref._lbltedadsefaresh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_mycode._toint /*int*/ (ba,(Object)(_mycode._is_null_adad /*String*/ (ba,_item1.fldTedadJoz /*String*/ ))))+"-"+BA.NumberToString(_mycode._toint /*int*/ (ba,(Object)(_mycode._is_null_adad /*String*/ (ba,_item1.fldTedadCarton /*String*/ ))))));
RDebugUtils.currentLine=97452043;
 //BA.debugLineNum = 97452043;BA.debugLine="lblTedadBargashti.Text=myCode.ToInt(myCode.Is_Nul";
__ref._lbltedadbargashti /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_mycode._toint /*int*/ (ba,(Object)(_mycode._is_null_adad /*String*/ (ba,_item1.fldTedadJozMarjoee /*String*/ ))))+"-"+BA.NumberToString(_mycode._toint /*int*/ (ba,(Object)(_mycode._is_null_adad /*String*/ (ba,_item1.fldTedadCartonMarjoee /*String*/ ))))));
RDebugUtils.currentLine=97452044;
 //BA.debugLineNum = 97452044;BA.debugLine="lblTedadMande.Text=myCode.ToInt(myCode.Is_Null_ad";
__ref._lbltedadmande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_mycode._toint /*int*/ (ba,(Object)(_mycode._is_null_adad /*String*/ (ba,_item1.fldTedadJozMande /*String*/ ))))+"-"+BA.NumberToString(_mycode._toint /*int*/ (ba,(Object)(_mycode._is_null_adad /*String*/ (ba,_item1.fldTedadCartonMande /*String*/ ))))));
RDebugUtils.currentLine=97452045;
 //BA.debugLineNum = 97452045;BA.debugLine="lblMablaghMande.Text=IIf(myCode.Check_Is_Null(Ite";
__ref._lblmablaghmande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(((_mycode._check_is_null /*boolean*/ (ba,_item1.fldMablaghMande /*String*/ )) ? ((Object)(0)) : ((Object)(_mycode._adadtoprice /*String*/ (ba,_item1.fldMablaghMande /*String*/ ))))));
RDebugUtils.currentLine=97452046;
 //BA.debugLineNum = 97452046;BA.debugLine="lblTotalBargashti.Text=IIf(myCode.Check_Is_Null(I";
__ref._lbltotalbargashti /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(((_mycode._check_is_null /*boolean*/ (ba,_item1.FldMablaghBargasht /*String*/ )) ? ((Object)(0)) : ((Object)(_mycode._adadtoprice /*String*/ (ba,_item1.FldMablaghBargasht /*String*/ ))))));
RDebugUtils.currentLine=97452047;
 //BA.debugLineNum = 97452047;BA.debugLine="If Item1.FldAmani=0 Then";
if ((_item1.FldAmani /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=97452048;
 //BA.debugLineNum = 97452048;BA.debugLine="lblCheckAmani.Text=Chr(0xE835)";
__ref._lblcheckamani /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe835))));
 }else {
RDebugUtils.currentLine=97452051;
 //BA.debugLineNum = 97452051;BA.debugLine="lblCheckAmani.Text=Chr(0xE834)";
__ref._lblcheckamani /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe834))));
 };
RDebugUtils.currentLine=97452055;
 //BA.debugLineNum = 97452055;BA.debugLine="If Item1.synced=True Then";
if (_item1.synced /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=97452057;
 //BA.debugLineNum = 97452057;BA.debugLine="lblVaziat.Text=\"سفارش ارسال شده\"";
__ref._lblvaziat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("سفارش ارسال شده"));
RDebugUtils.currentLine=97452059;
 //BA.debugLineNum = 97452059;BA.debugLine="If lblShomareForoosh.Text>0   Then";
if ((double)(Double.parseDouble(__ref._lblshomareforoosh /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()))>0) { 
RDebugUtils.currentLine=97452060;
 //BA.debugLineNum = 97452060;BA.debugLine="lblVaziat.Text=\"سفارش تکمیل شده\"";
__ref._lblvaziat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("سفارش تکمیل شده"));
RDebugUtils.currentLine=97452062;
 //BA.debugLineNum = 97452062;BA.debugLine="If lblShomareBargashti.Text>0 Then";
if ((double)(Double.parseDouble(__ref._lblshomarebargashti /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()))>0) { 
RDebugUtils.currentLine=97452063;
 //BA.debugLineNum = 97452063;BA.debugLine="lblVaziat.Text=\"سفارش مرجوع شده\"";
__ref._lblvaziat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("سفارش مرجوع شده"));
 };
 };
 }else {
RDebugUtils.currentLine=97452068;
 //BA.debugLineNum = 97452068;BA.debugLine="lblVaziat.Text=\"سفارش ارسال نشده\"";
__ref._lblvaziat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("سفارش ارسال نشده"));
 };
RDebugUtils.currentLine=97452071;
 //BA.debugLineNum = 97452071;BA.debugLine="Dim Cu As Cursor= MCode.Result(\"Select fldSharheT";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select fldSharheTafzili From TblAshkhas where FldCodeTafzili = '"+_item1.fldC_Ashkhas /*String*/ +"'");
RDebugUtils.currentLine=97452072;
 //BA.debugLineNum = 97452072;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=97452073;
 //BA.debugLineNum = 97452073;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=97452074;
 //BA.debugLineNum = 97452074;BA.debugLine="LblN_Ashkhas.Text = Cu.GetString(\"fldSharheTafzi";
__ref._lbln_ashkhas /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cu.GetString("fldSharheTafzili")));
 }else {
RDebugUtils.currentLine=97452076;
 //BA.debugLineNum = 97452076;BA.debugLine="LblN_Ashkhas.Text = \"-\"";
__ref._lbln_ashkhas /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("-"));
 };
RDebugUtils.currentLine=97452079;
 //BA.debugLineNum = 97452079;BA.debugLine="date1=DateAz";
__ref._date1 /*String*/  = _dateaz;
RDebugUtils.currentLine=97452080;
 //BA.debugLineNum = 97452080;BA.debugLine="date2=DateTa";
__ref._date2 /*String*/  = _dateta;
RDebugUtils.currentLine=97452081;
 //BA.debugLineNum = 97452081;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_rec_factor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factor";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=97386496;
 //BA.debugLineNum = 97386496;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=97386497;
 //BA.debugLineNum = 97386497;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=97386498;
 //BA.debugLineNum = 97386498;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_rec_factor __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_rec_factor";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=97255424;
 //BA.debugLineNum = 97255424;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=97255425;
 //BA.debugLineNum = 97255425;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=97255426;
 //BA.debugLineNum = 97255426;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=97255427;
 //BA.debugLineNum = 97255427;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=97255428;
 //BA.debugLineNum = 97255428;BA.debugLine="p.LoadLayout(\"L_Rec_Factor\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("L_Rec_Factor",ba);
RDebugUtils.currentLine=97255429;
 //BA.debugLineNum = 97255429;BA.debugLine="ItemFactor.Initialize";
__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .Initialize();
RDebugUtils.currentLine=97255430;
 //BA.debugLineNum = 97255430;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_rec_factor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factor";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=97320960;
 //BA.debugLineNum = 97320960;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=97320961;
 //BA.debugLineNum = 97320961;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=97320962;
 //BA.debugLineNum = 97320962;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=97320963;
 //BA.debugLineNum = 97320963;BA.debugLine="End Sub";
return null;
}
public String  _btnlist_click(ir.parsikhesab.pakhsh.cls_rec_factor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factor";
if (Debug.shouldDelegate(ba, "btnlist_click", false))
	 {return ((String) Debug.delegate(ba, "btnlist_click", null));}
RDebugUtils.currentLine=97517568;
 //BA.debugLineNum = 97517568;BA.debugLine="Sub BtnList_Click";
RDebugUtils.currentLine=97517569;
 //BA.debugLineNum = 97517569;BA.debugLine="If ItemFactor.fldShomareForoosh>0 Then";
if ((double)(Double.parseDouble(__ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareForoosh /*String*/ ))>0) { 
RDebugUtils.currentLine=97517570;
 //BA.debugLineNum = 97517570;BA.debugLine="Act_ReportRizeBargasht.DateAz=date1";
_act_reportrizebargasht._dateaz /*String*/  = __ref._date1 /*String*/ ;
RDebugUtils.currentLine=97517571;
 //BA.debugLineNum = 97517571;BA.debugLine="Act_ReportRizeBargasht.DateTa=date2";
_act_reportrizebargasht._dateta /*String*/  = __ref._date2 /*String*/ ;
RDebugUtils.currentLine=97517572;
 //BA.debugLineNum = 97517572;BA.debugLine="Act_ReportRizeBargasht.shomareForoosh=ItemFactor";
_act_reportrizebargasht._shomareforoosh /*String*/  = __ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareForoosh /*String*/ ;
RDebugUtils.currentLine=97517573;
 //BA.debugLineNum = 97517573;BA.debugLine="Act_ReportRizeBargasht.shomareFaktor=ItemFactor.";
_act_reportrizebargasht._shomarefaktor /*String*/  = __ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareFaktor /*String*/ ;
RDebugUtils.currentLine=97517574;
 //BA.debugLineNum = 97517574;BA.debugLine="StartActivity(Act_ReportRizeBargasht)";
__c.StartActivity(ba,(Object)(_act_reportrizebargasht.getObject()));
 }else {
RDebugUtils.currentLine=97517576;
 //BA.debugLineNum = 97517576;BA.debugLine="MCode.FaktorSelect = ItemFactor.fldShomareFaktor";
_mcode._faktorselect /*String*/  = __ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareFaktor /*String*/ ;
RDebugUtils.currentLine=97517577;
 //BA.debugLineNum = 97517577;BA.debugLine="MCode.IsOnlineDataFactor=0";
_mcode._isonlinedatafactor /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=97517578;
 //BA.debugLineNum = 97517578;BA.debugLine="StartActivity(Act_RizFaktor)";
__c.StartActivity(ba,(Object)(_act_rizfaktor.getObject()));
 };
RDebugUtils.currentLine=97517583;
 //BA.debugLineNum = 97517583;BA.debugLine="End Sub";
return "";
}
public String  _btnshowjozeiat_click(ir.parsikhesab.pakhsh.cls_rec_factor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factor";
if (Debug.shouldDelegate(ba, "btnshowjozeiat_click", false))
	 {return ((String) Debug.delegate(ba, "btnshowjozeiat_click", null));}
RDebugUtils.currentLine=97583104;
 //BA.debugLineNum = 97583104;BA.debugLine="Private Sub btnShowJozeiat_Click";
RDebugUtils.currentLine=97583105;
 //BA.debugLineNum = 97583105;BA.debugLine="MCode.FaktorSelect = ItemFactor.fldShomareFaktor";
_mcode._faktorselect /*String*/  = __ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareFaktor /*String*/ ;
RDebugUtils.currentLine=97583106;
 //BA.debugLineNum = 97583106;BA.debugLine="MCode.IsOnlineDataFactor=0";
_mcode._isonlinedatafactor /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=97583107;
 //BA.debugLineNum = 97583107;BA.debugLine="Act_RizFaktor.Faktor=ItemFactor";
_act_rizfaktor._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/  = __ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ ;
RDebugUtils.currentLine=97583108;
 //BA.debugLineNum = 97583108;BA.debugLine="StartActivity(Act_RizFaktor)";
__c.StartActivity(ba,(Object)(_act_rizfaktor.getObject()));
RDebugUtils.currentLine=97583109;
 //BA.debugLineNum = 97583109;BA.debugLine="End Sub";
return "";
}
public String  _btnshowmoqhaerat_click(ir.parsikhesab.pakhsh.cls_rec_factor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factor";
if (Debug.shouldDelegate(ba, "btnshowmoqhaerat_click", false))
	 {return ((String) Debug.delegate(ba, "btnshowmoqhaerat_click", null));}
RDebugUtils.currentLine=97648640;
 //BA.debugLineNum = 97648640;BA.debugLine="Private Sub btnShowMoqhaerat_Click";
RDebugUtils.currentLine=97648641;
 //BA.debugLineNum = 97648641;BA.debugLine="Act_ReportRizeBargasht.DateAz=date1";
_act_reportrizebargasht._dateaz /*String*/  = __ref._date1 /*String*/ ;
RDebugUtils.currentLine=97648642;
 //BA.debugLineNum = 97648642;BA.debugLine="Act_ReportRizeBargasht.DateTa=date2";
_act_reportrizebargasht._dateta /*String*/  = __ref._date2 /*String*/ ;
RDebugUtils.currentLine=97648643;
 //BA.debugLineNum = 97648643;BA.debugLine="Act_ReportRizeBargasht.shomareForoosh=ItemFactor.";
_act_reportrizebargasht._shomareforoosh /*String*/  = __ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareForoosh /*String*/ ;
RDebugUtils.currentLine=97648644;
 //BA.debugLineNum = 97648644;BA.debugLine="Act_ReportRizeBargasht.shomareFaktor=ItemFactor.f";
_act_reportrizebargasht._shomarefaktor /*String*/  = __ref._itemfactor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareFaktor /*String*/ ;
RDebugUtils.currentLine=97648645;
 //BA.debugLineNum = 97648645;BA.debugLine="StartActivity(Act_ReportRizeBargasht)";
__c.StartActivity(ba,(Object)(_act_reportrizebargasht.getObject()));
RDebugUtils.currentLine=97648646;
 //BA.debugLineNum = 97648646;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_rec_factor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factor";
RDebugUtils.currentLine=97189888;
 //BA.debugLineNum = 97189888;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=97189889;
 //BA.debugLineNum = 97189889;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=97189890;
 //BA.debugLineNum = 97189890;BA.debugLine="Private LblShomareFaktor As Label";
_lblshomarefaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189891;
 //BA.debugLineNum = 97189891;BA.debugLine="Private LblTotalFaktor As Label";
_lbltotalfaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189892;
 //BA.debugLineNum = 97189892;BA.debugLine="Private LblDate As Label";
_lbldate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189893;
 //BA.debugLineNum = 97189893;BA.debugLine="Private LblC_Ashkhas As Label";
_lblc_ashkhas = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189894;
 //BA.debugLineNum = 97189894;BA.debugLine="Private Panel4 As Panel";
_panel4 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=97189895;
 //BA.debugLineNum = 97189895;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=97189896;
 //BA.debugLineNum = 97189896;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=97189897;
 //BA.debugLineNum = 97189897;BA.debugLine="Private BtnList As Button";
_btnlist = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=97189898;
 //BA.debugLineNum = 97189898;BA.debugLine="Private LblN_Ashkhas As Label";
_lbln_ashkhas = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189899;
 //BA.debugLineNum = 97189899;BA.debugLine="Private ItemFactor As AdapterListFaktor";
_itemfactor = new ir.parsikhesab.pakhsh.mcode._adapterlistfaktor();
RDebugUtils.currentLine=97189900;
 //BA.debugLineNum = 97189900;BA.debugLine="Private lblDateBargashti As Label";
_lbldatebargashti = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189901;
 //BA.debugLineNum = 97189901;BA.debugLine="Private lblShomareBargashti As Label";
_lblshomarebargashti = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189902;
 //BA.debugLineNum = 97189902;BA.debugLine="Private lblShomareForoosh As Label";
_lblshomareforoosh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189903;
 //BA.debugLineNum = 97189903;BA.debugLine="Private lblTedadBargashti As Label";
_lbltedadbargashti = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189904;
 //BA.debugLineNum = 97189904;BA.debugLine="Private lblTedadSefaresh As Label";
_lbltedadsefaresh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189905;
 //BA.debugLineNum = 97189905;BA.debugLine="Private lblTotalBargashti As Label";
_lbltotalbargashti = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189906;
 //BA.debugLineNum = 97189906;BA.debugLine="Private lblTedadMande As Label";
_lbltedadmande = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189907;
 //BA.debugLineNum = 97189907;BA.debugLine="Private lblMablaghMande As Label";
_lblmablaghmande = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189908;
 //BA.debugLineNum = 97189908;BA.debugLine="Dim date1,date2 As String";
_date1 = "";
_date2 = "";
RDebugUtils.currentLine=97189909;
 //BA.debugLineNum = 97189909;BA.debugLine="Private btnShowJozeiat As Button";
_btnshowjozeiat = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=97189910;
 //BA.debugLineNum = 97189910;BA.debugLine="Private lblCheckAmani As Label";
_lblcheckamani = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189911;
 //BA.debugLineNum = 97189911;BA.debugLine="Private lblVaziat As Label";
_lblvaziat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97189912;
 //BA.debugLineNum = 97189912;BA.debugLine="End Sub";
return "";
}
}