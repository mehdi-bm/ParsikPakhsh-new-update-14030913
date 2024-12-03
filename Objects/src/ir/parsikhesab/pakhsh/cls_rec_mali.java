package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_rec_mali extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_rec_mali");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_rec_mali.class).invoke(this, new Object[] {null});
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
public Object _base = null;
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldatecheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldatesabt = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablagh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamebank = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarecheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomaresabt = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltypesabt = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnoesabt = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistsabt _item = null;
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
public String  _btndelete_click(ir.parsikhesab.pakhsh.cls_rec_mali __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_mali";
if (Debug.shouldDelegate(ba, "btndelete_click", false))
	 {return ((String) Debug.delegate(ba, "btndelete_click", null));}
RDebugUtils.currentLine=98959360;
 //BA.debugLineNum = 98959360;BA.debugLine="Sub btnDelete_Click";
RDebugUtils.currentLine=98959362;
 //BA.debugLineNum = 98959362;BA.debugLine="End Sub";
return "";
}
public String  _btnprint_click(ir.parsikhesab.pakhsh.cls_rec_mali __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_mali";
if (Debug.shouldDelegate(ba, "btnprint_click", false))
	 {return ((String) Debug.delegate(ba, "btnprint_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=98893824;
 //BA.debugLineNum = 98893824;BA.debugLine="Sub btnPrint_Click";
RDebugUtils.currentLine=98893825;
 //BA.debugLineNum = 98893825;BA.debugLine="MCode.ShomareSabt= item.FldShomareSabt";
_mcode._shomaresabt /*String*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistsabt*/ .FldShomareSabt /*String*/ ;
RDebugUtils.currentLine=98893827;
 //BA.debugLineNum = 98893827;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select * from TblS";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"select * from TblSabt where FldShomareSabt = '"+_mcode._shomaresabt /*String*/ +"'");
RDebugUtils.currentLine=98893828;
 //BA.debugLineNum = 98893828;BA.debugLine="Act_PrintMali.Pardakhti = item.FldMablagh";
_act_printmali._pardakhti /*String*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistsabt*/ .FldMablagh /*String*/ ;
RDebugUtils.currentLine=98893829;
 //BA.debugLineNum = 98893829;BA.debugLine="Act_PrintMali.cu = cu";
_act_printmali._cu /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/  = _cu;
RDebugUtils.currentLine=98893830;
 //BA.debugLineNum = 98893830;BA.debugLine="StartActivity(Act_PrintMali)";
__c.StartActivity(ba,(Object)(_act_printmali.getObject()));
RDebugUtils.currentLine=98893832;
 //BA.debugLineNum = 98893832;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_rec_mali __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_mali";
RDebugUtils.currentLine=98566144;
 //BA.debugLineNum = 98566144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=98566145;
 //BA.debugLineNum = 98566145;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=98566146;
 //BA.debugLineNum = 98566146;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=98566147;
 //BA.debugLineNum = 98566147;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=98566148;
 //BA.debugLineNum = 98566148;BA.debugLine="Private Key As IME";
_key = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=98566150;
 //BA.debugLineNum = 98566150;BA.debugLine="Private LblDateCheck As Label";
_lbldatecheck = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98566151;
 //BA.debugLineNum = 98566151;BA.debugLine="Private LblDateSabt As Label";
_lbldatesabt = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98566152;
 //BA.debugLineNum = 98566152;BA.debugLine="Private LblMablagh As Label";
_lblmablagh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98566153;
 //BA.debugLineNum = 98566153;BA.debugLine="Private LblNameBank As Label";
_lblnamebank = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98566154;
 //BA.debugLineNum = 98566154;BA.debugLine="Private LblShomareCheck As Label";
_lblshomarecheck = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98566155;
 //BA.debugLineNum = 98566155;BA.debugLine="Private LblShomareSabt As Label";
_lblshomaresabt = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98566156;
 //BA.debugLineNum = 98566156;BA.debugLine="Private LblTypeSabt As Label";
_lbltypesabt = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98566157;
 //BA.debugLineNum = 98566157;BA.debugLine="Private LblNoeSabt As Label";
_lblnoesabt = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=98566158;
 //BA.debugLineNum = 98566158;BA.debugLine="Dim item As AdapterListSabt";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistsabt();
RDebugUtils.currentLine=98566159;
 //BA.debugLineNum = 98566159;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_rec_mali __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_mali";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=98762752;
 //BA.debugLineNum = 98762752;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=98762753;
 //BA.debugLineNum = 98762753;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=98762754;
 //BA.debugLineNum = 98762754;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_rec_mali __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_mali";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=98828288;
 //BA.debugLineNum = 98828288;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=98828289;
 //BA.debugLineNum = 98828289;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=98828290;
 //BA.debugLineNum = 98828290;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=98828291;
 //BA.debugLineNum = 98828291;BA.debugLine="End Sub";
return null;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_rec_mali __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_rec_mali";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=98631680;
 //BA.debugLineNum = 98631680;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=98631681;
 //BA.debugLineNum = 98631681;BA.debugLine="Try";
try {RDebugUtils.currentLine=98631682;
 //BA.debugLineNum = 98631682;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=98631683;
 //BA.debugLineNum = 98631683;BA.debugLine="Key.Initialize(\"Key\")";
__ref._key /*anywheresoftware.b4a.objects.IME*/ .Initialize("Key");
RDebugUtils.currentLine=98631684;
 //BA.debugLineNum = 98631684;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=98631685;
 //BA.debugLineNum = 98631685;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=98631686;
 //BA.debugLineNum = 98631686;BA.debugLine="p.LoadLayout(\"l_rec_mali\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_rec_mali",ba);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=98631691;
 //BA.debugLineNum = 98631691;BA.debugLine="MCode.SendError(LastException)";
_mcode._senderror /*String*/ (ba,BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=98631692;
 //BA.debugLineNum = 98631692;BA.debugLine="Log(LastException)";
__c.LogImpl("598631692",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=98631694;
 //BA.debugLineNum = 98631694;BA.debugLine="End Sub";
return "";
}
public String  _show(ir.parsikhesab.pakhsh.cls_rec_mali __ref,ir.parsikhesab.pakhsh.mcode._adapterlistsabt _item1,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_mali";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1,_position}));}
RDebugUtils.currentLine=98697216;
 //BA.debugLineNum = 98697216;BA.debugLine="Public Sub Show(Item1 As AdapterListSabt,position";
RDebugUtils.currentLine=98697217;
 //BA.debugLineNum = 98697217;BA.debugLine="item=Item1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistsabt*/  = _item1;
RDebugUtils.currentLine=98697218;
 //BA.debugLineNum = 98697218;BA.debugLine="If Item1.FldDateCheck <> 0 Then";
if ((_item1.FldDateCheck /*String*/ ).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=98697219;
 //BA.debugLineNum = 98697219;BA.debugLine="LblDateCheck.text = \"تاریخ چک: \" & MCode.Sf.Mid(";
__ref._lbldatecheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تاریخ چک: "+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.FldDateCheck /*String*/ ,(int) (1),(int) (4))+"/"+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.FldDateCheck /*String*/ ,(int) (5),(int) (2))+"/"+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.FldDateCheck /*String*/ ,(int) (7),(int) (2))));
 }else {
RDebugUtils.currentLine=98697221;
 //BA.debugLineNum = 98697221;BA.debugLine="LblDateCheck.text = \"تاریخ چک: -\"";
__ref._lbldatecheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تاریخ چک: -"));
 };
RDebugUtils.currentLine=98697223;
 //BA.debugLineNum = 98697223;BA.debugLine="LblDateSabt.Text=\"تاریخ ثبت: \" & MCode.Sf.Mid(Ite";
__ref._lbldatesabt /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تاریخ ثبت: "+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.FldDateSabt /*String*/ ,(int) (1),(int) (4))+"/"+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.FldDateSabt /*String*/ ,(int) (5),(int) (2))+"/"+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.FldDateSabt /*String*/ ,(int) (7),(int) (2))));
RDebugUtils.currentLine=98697224;
 //BA.debugLineNum = 98697224;BA.debugLine="LblMablagh.Text=\"مبلغ: \" & NumberFormat(Item1.Fld";
__ref._lblmablagh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مبلغ: "+__c.NumberFormat((double)(Double.parseDouble(_item1.FldMablagh /*String*/ )),(int) (1),(int) (3))));
RDebugUtils.currentLine=98697225;
 //BA.debugLineNum = 98697225;BA.debugLine="LblShomareSabt.Text=\"شماره ثبت: \" & Item1.FldShoma";
__ref._lblshomaresabt /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شماره ثبت: "+_item1.FldShomareSabt /*String*/ ));
RDebugUtils.currentLine=98697227;
 //BA.debugLineNum = 98697227;BA.debugLine="If Item1.FldBankName<>0 Then";
if ((_item1.FldBankName /*String*/ ).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=98697228;
 //BA.debugLineNum = 98697228;BA.debugLine="LblNameBank.text = \"نام بانک: \" & Item1.FldBankN";
__ref._lblnamebank /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نام بانک: "+_item1.FldBankName /*String*/ ));
 }else {
RDebugUtils.currentLine=98697230;
 //BA.debugLineNum = 98697230;BA.debugLine="LblNameBank.text = \"نام بانک: -\"";
__ref._lblnamebank /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نام بانک: -"));
 };
RDebugUtils.currentLine=98697233;
 //BA.debugLineNum = 98697233;BA.debugLine="LblNoeSabt.text = \"نوع ثبت: \" & Item1.FldNoe";
__ref._lblnoesabt /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نوع ثبت: "+_item1.FldNoe /*String*/ ));
RDebugUtils.currentLine=98697235;
 //BA.debugLineNum = 98697235;BA.debugLine="Select Case Item1.FldType";
switch (BA.switchObjectToInt(_item1.FldType /*String*/ ,BA.NumberToString(1),BA.NumberToString(2))) {
case 0: {
RDebugUtils.currentLine=98697237;
 //BA.debugLineNum = 98697237;BA.debugLine="LblTypeSabt.text = \"نوع تراکنش: دریافت\"";
__ref._lbltypesabt /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نوع تراکنش: دریافت"));
 break; }
case 1: {
RDebugUtils.currentLine=98697239;
 //BA.debugLineNum = 98697239;BA.debugLine="LblTypeSabt.text = \"نوع تراکنش: پرداخت\"";
__ref._lbltypesabt /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نوع تراکنش: پرداخت"));
 break; }
}
;
RDebugUtils.currentLine=98697241;
 //BA.debugLineNum = 98697241;BA.debugLine="If Item1.FldShomareCheck <> 0 Then";
if ((_item1.FldShomareCheck /*String*/ ).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=98697242;
 //BA.debugLineNum = 98697242;BA.debugLine="LblShomareCheck.text = \"شماره چک: \" & Item1.FldS";
__ref._lblshomarecheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شماره چک: "+_item1.FldShomareCheck /*String*/ ));
 }else {
RDebugUtils.currentLine=98697244;
 //BA.debugLineNum = 98697244;BA.debugLine="LblShomareCheck.text = \"شماره چک: -\"";
__ref._lblshomarecheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شماره چک: -"));
 };
RDebugUtils.currentLine=98697246;
 //BA.debugLineNum = 98697246;BA.debugLine="End Sub";
return "";
}
}