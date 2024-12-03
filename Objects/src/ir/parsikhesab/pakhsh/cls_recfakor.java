package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_recfakor extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_recfakor");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_recfakor.class).invoke(this, new Object[] {null});
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
public ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _item = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsharhfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamemoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_city = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk_send = null;
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
public boolean  _getischecked(ir.parsikhesab.pakhsh.cls_recfakor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfakor";
if (Debug.shouldDelegate(ba, "getischecked", false))
	 {return ((Boolean) Debug.delegate(ba, "getischecked", null));}
RDebugUtils.currentLine=103481344;
 //BA.debugLineNum = 103481344;BA.debugLine="Public Sub getIsChecked As Boolean";
RDebugUtils.currentLine=103481345;
 //BA.debugLineNum = 103481345;BA.debugLine="Return ChK_send.Checked";
if (true) return __ref._chk_send /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getChecked();
RDebugUtils.currentLine=103481346;
 //BA.debugLineNum = 103481346;BA.debugLine="End Sub";
return false;
}
public String  _getfaktor_number(ir.parsikhesab.pakhsh.cls_recfakor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfakor";
if (Debug.shouldDelegate(ba, "getfaktor_number", false))
	 {return ((String) Debug.delegate(ba, "getfaktor_number", null));}
RDebugUtils.currentLine=103546880;
 //BA.debugLineNum = 103546880;BA.debugLine="Public Sub getFaktor_number As String";
RDebugUtils.currentLine=103546881;
 //BA.debugLineNum = 103546881;BA.debugLine="Return faktor.FldShomareFaktor";
if (true) return __ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareFaktor /*String*/ ;
RDebugUtils.currentLine=103546882;
 //BA.debugLineNum = 103546882;BA.debugLine="End Sub";
return "";
}
public String  _getcode_tafzili(ir.parsikhesab.pakhsh.cls_recfakor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfakor";
if (Debug.shouldDelegate(ba, "getcode_tafzili", false))
	 {return ((String) Debug.delegate(ba, "getcode_tafzili", null));}
RDebugUtils.currentLine=103612416;
 //BA.debugLineNum = 103612416;BA.debugLine="Public Sub getCode_Tafzili As String";
RDebugUtils.currentLine=103612417;
 //BA.debugLineNum = 103612417;BA.debugLine="Return Item.CodeTafzili";
if (true) return __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .CodeTafzili /*String*/ ;
RDebugUtils.currentLine=103612418;
 //BA.debugLineNum = 103612418;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_recfakor __ref,anywheresoftware.b4a.BA _ba,String _shomarefaktor) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_recfakor";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_shomarefaktor}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
String _ca = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=103153664;
 //BA.debugLineNum = 103153664;BA.debugLine="Public Sub Initialize(shomareFaktor As String)";
RDebugUtils.currentLine=103153665;
 //BA.debugLineNum = 103153665;BA.debugLine="faktor.FldShomareFaktor=shomareFaktor";
__ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareFaktor /*String*/  = _shomarefaktor;
RDebugUtils.currentLine=103153666;
 //BA.debugLineNum = 103153666;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=103153667;
 //BA.debugLineNum = 103153667;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=103153668;
 //BA.debugLineNum = 103153668;BA.debugLine="p.LoadLayout(\"l_recfaktor_2\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_recfaktor_2",ba);
RDebugUtils.currentLine=103153670;
 //BA.debugLineNum = 103153670;BA.debugLine="LblshFaktor.Text=faktor.FldShomareFaktor";
__ref._lblshfaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareFaktor /*String*/ ));
RDebugUtils.currentLine=103153671;
 //BA.debugLineNum = 103153671;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblFaktor Where FldShomareFaktor = '"+__ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareFaktor /*String*/ +"'");
RDebugUtils.currentLine=103153672;
 //BA.debugLineNum = 103153672;BA.debugLine="If Cu1.RowCount>0 Then";
if (_cu1.getRowCount()>0) { 
RDebugUtils.currentLine=103153673;
 //BA.debugLineNum = 103153673;BA.debugLine="Cu1.Position=0";
_cu1.setPosition((int) (0));
RDebugUtils.currentLine=103153674;
 //BA.debugLineNum = 103153674;BA.debugLine="TxtSharhFaktor.Text = Cu1.GetString(\"FldTozih\")";
__ref._txtsharhfaktor /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_cu1.GetString("FldTozih")));
RDebugUtils.currentLine=103153677;
 //BA.debugLineNum = 103153677;BA.debugLine="Dim ca As String=Cu1.GetString(\"FldC_Tafzili\")";
_ca = _cu1.GetString("FldC_Tafzili");
RDebugUtils.currentLine=103153678;
 //BA.debugLineNum = 103153678;BA.debugLine="LblTotalFaktor.Text = \"مبلغ فاکتور: \" & NumberFo";
__ref._lbltotalfaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مبلغ فاکتور: "+__c.NumberFormat((double)(Double.parseDouble(_cu1.GetString("FldTotalFaktor"))),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=103153679;
 //BA.debugLineNum = 103153679;BA.debugLine="If Cu1.GetString(\"FldTozih\") = \"\" Then TxtSharhF";
if ((_cu1.GetString("FldTozih")).equals("")) { 
__ref._txtsharhfaktor /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));};
 };
RDebugUtils.currentLine=103153683;
 //BA.debugLineNum = 103153683;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblAshkhas Where fldCodetafzili = '"+_ca+"'");
RDebugUtils.currentLine=103153684;
 //BA.debugLineNum = 103153684;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=103153685;
 //BA.debugLineNum = 103153685;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=103153686;
 //BA.debugLineNum = 103153686;BA.debugLine="Item.CodeTafzili=Cu.GetString(\"fldCodetafzili\")";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .CodeTafzili /*String*/  = _cu.GetString("fldCodetafzili");
RDebugUtils.currentLine=103153687;
 //BA.debugLineNum = 103153687;BA.debugLine="Item.SharhTafzili=Cu.GetString(\"fldSharheTafzili";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .SharhTafzili /*String*/  = _cu.GetString("fldSharheTafzili");
RDebugUtils.currentLine=103153688;
 //BA.debugLineNum = 103153688;BA.debugLine="Item.Address=Cu.GetString(\"fldAdress\")";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .Address /*String*/  = _cu.GetString("fldAdress");
RDebugUtils.currentLine=103153689;
 //BA.debugLineNum = 103153689;BA.debugLine="Item.Tell=Cu.GetString(\"fldTell\")";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .Tell /*String*/  = _cu.GetString("fldTell");
RDebugUtils.currentLine=103153690;
 //BA.debugLineNum = 103153690;BA.debugLine="Item.FldMobile=Cu.GetString(\"FldMobile\")";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .FldMobile /*String*/  = _cu.GetString("FldMobile");
RDebugUtils.currentLine=103153691;
 //BA.debugLineNum = 103153691;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"fldCodeGroup\")";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .FldC_Gorooh /*String*/  = _cu.GetString("fldCodeGroup");
RDebugUtils.currentLine=103153692;
 //BA.debugLineNum = 103153692;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"fldNameGroup\")";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .FldN_Gorooh /*String*/  = _cu.GetString("fldNameGroup");
RDebugUtils.currentLine=103153693;
 //BA.debugLineNum = 103153693;BA.debugLine="Item.FldVaziat=Cu.GetString(\"FldVaziat\")";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .FldVaziat /*String*/  = _cu.GetString("FldVaziat");
RDebugUtils.currentLine=103153694;
 //BA.debugLineNum = 103153694;BA.debugLine="Item.FldEtebar=Cu.GetString(\"FldEtebar\")";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .FldEtebar /*String*/  = _cu.GetString("FldEtebar");
RDebugUtils.currentLine=103153695;
 //BA.debugLineNum = 103153695;BA.debugLine="Item.FldLastVisit=myCode.Is_Null(Cu.GetString(\"F";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .FldLastVisit /*String*/  = _mycode._is_null /*String*/ (ba,_cu.GetString("FldLastVisit"));
RDebugUtils.currentLine=103153696;
 //BA.debugLineNum = 103153696;BA.debugLine="Item.FldLastSefaresh=myCode.Is_Null(Cu.GetString";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .FldLastSefaresh /*String*/  = _mycode._is_null /*String*/ (ba,_cu.GetString("FldLastSefaresh"));
RDebugUtils.currentLine=103153697;
 //BA.debugLineNum = 103153697;BA.debugLine="LblNameMoshtari.Text = Item.SharhTafzili";
__ref._lblnamemoshtari /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .SharhTafzili /*String*/ ));
RDebugUtils.currentLine=103153698;
 //BA.debugLineNum = 103153698;BA.debugLine="lbl_city.Text=Item.FldN_Gorooh";
__ref._lbl_city /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .FldN_Gorooh /*String*/ ));
 };
RDebugUtils.currentLine=103153703;
 //BA.debugLineNum = 103153703;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_recfakor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfakor";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=103219200;
 //BA.debugLineNum = 103219200;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=103219201;
 //BA.debugLineNum = 103219201;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=103219202;
 //BA.debugLineNum = 103219202;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=103219203;
 //BA.debugLineNum = 103219203;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_recfakor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfakor";
RDebugUtils.currentLine=103088128;
 //BA.debugLineNum = 103088128;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=103088129;
 //BA.debugLineNum = 103088129;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=103088130;
 //BA.debugLineNum = 103088130;BA.debugLine="Private faktor As AdapterListFaktor";
_faktor = new ir.parsikhesab.pakhsh.mcode._adapterlistfaktor();
RDebugUtils.currentLine=103088131;
 //BA.debugLineNum = 103088131;BA.debugLine="Private Item As AdapterListAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistashkhas();
RDebugUtils.currentLine=103088133;
 //BA.debugLineNum = 103088133;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=103088134;
 //BA.debugLineNum = 103088134;BA.debugLine="Private TxtSharhFaktor As EditText";
_txtsharhfaktor = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=103088135;
 //BA.debugLineNum = 103088135;BA.debugLine="Private LblTotalFaktor As Label";
_lbltotalfaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=103088136;
 //BA.debugLineNum = 103088136;BA.debugLine="Private LblNameMoshtari As Label";
_lblnamemoshtari = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=103088137;
 //BA.debugLineNum = 103088137;BA.debugLine="Private LblshFaktor As Label";
_lblshfaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=103088138;
 //BA.debugLineNum = 103088138;BA.debugLine="Private lbl_city As Label";
_lbl_city = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=103088139;
 //BA.debugLineNum = 103088139;BA.debugLine="Private ChK_send As CheckBox";
_chk_send = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=103088140;
 //BA.debugLineNum = 103088140;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_recfakor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfakor";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=103284736;
 //BA.debugLineNum = 103284736;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=103284737;
 //BA.debugLineNum = 103284737;BA.debugLine="Return pnl_bk.Height'+10dip";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=103284738;
 //BA.debugLineNum = 103284738;BA.debugLine="End Sub";
return 0;
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_recfakor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfakor";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=103350272;
 //BA.debugLineNum = 103350272;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=103350273;
 //BA.debugLineNum = 103350273;BA.debugLine="Return pnl_bk.Width+5dip";
if (true) return (int) (__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=103350274;
 //BA.debugLineNum = 103350274;BA.debugLine="End Sub";
return 0;
}
public String  _pnl_bk_click(ir.parsikhesab.pakhsh.cls_recfakor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recfakor";
if (Debug.shouldDelegate(ba, "pnl_bk_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_bk_click", null));}
RDebugUtils.currentLine=103415808;
 //BA.debugLineNum = 103415808;BA.debugLine="Private Sub pnl_bk_Click";
RDebugUtils.currentLine=103415809;
 //BA.debugLineNum = 103415809;BA.debugLine="MCode.FaktorSelect=faktor.FldShomareFaktor";
_mcode._faktorselect /*String*/  = __ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldShomareFaktor /*String*/ ;
RDebugUtils.currentLine=103415810;
 //BA.debugLineNum = 103415810;BA.debugLine="faktor.fldC_Ashkhas=Item.CodeTafzili";
__ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ .fldC_Ashkhas /*String*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .CodeTafzili /*String*/ ;
RDebugUtils.currentLine=103415811;
 //BA.debugLineNum = 103415811;BA.debugLine="Act_RizFaktor.Faktor = faktor";
_act_rizfaktor._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/  = __ref._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/ ;
RDebugUtils.currentLine=103415812;
 //BA.debugLineNum = 103415812;BA.debugLine="StartActivity(Act_RizFaktor)";
__c.StartActivity(ba,(Object)(_act_rizfaktor.getObject()));
RDebugUtils.currentLine=103415813;
 //BA.debugLineNum = 103415813;BA.debugLine="End Sub";
return "";
}
}