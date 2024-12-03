package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_rec_factorvisitor extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_rec_factorvisitor");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_rec_factorvisitor.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public Object _base = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodevisitor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamevisitor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziattasfie = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziatsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharh = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnjoziat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodetafzili = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharhtafzili = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltime = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_rec_factorvisitor __ref,ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor _item1) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factorvisitor";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1}));}
RDebugUtils.currentLine=97976320;
 //BA.debugLineNum = 97976320;BA.debugLine="Public Sub Show(Item1 As AdapteRepFactorVisitor)";
RDebugUtils.currentLine=97976321;
 //BA.debugLineNum = 97976321;BA.debugLine="BtnCheck.Tag = Item1";
__ref._btncheck /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_item1));
RDebugUtils.currentLine=97976322;
 //BA.debugLineNum = 97976322;BA.debugLine="btnJoziat.Tag = Item1";
__ref._btnjoziat /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_item1));
RDebugUtils.currentLine=97976323;
 //BA.debugLineNum = 97976323;BA.debugLine="LblShomareFaktor.Text = Item1.fldShomareFactor";
__ref._lblshomarefaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldShomareFactor /*String*/ ));
RDebugUtils.currentLine=97976324;
 //BA.debugLineNum = 97976324;BA.debugLine="lblCodeVisitor.Text = Item1.fldCodeVasete";
__ref._lblcodevisitor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldCodeVasete /*String*/ ));
RDebugUtils.currentLine=97976325;
 //BA.debugLineNum = 97976325;BA.debugLine="lblNameVisitor.Text = Item1.FldN_Visitor";
__ref._lblnamevisitor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.FldN_Visitor /*String*/ ));
RDebugUtils.currentLine=97976326;
 //BA.debugLineNum = 97976326;BA.debugLine="LblDate.Text = MCode.PersianDateDash(Item1.fldDat";
__ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._persiandatedash /*String*/ (ba,_item1.fldDate /*String*/ )));
RDebugUtils.currentLine=97976327;
 //BA.debugLineNum = 97976327;BA.debugLine="lblTime.Text=Item1.fldTime";
__ref._lbltime /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldTime /*String*/ ));
RDebugUtils.currentLine=97976328;
 //BA.debugLineNum = 97976328;BA.debugLine="lblVaziatTasfie.Text = Item1.fldNahveTasvie";
__ref._lblvaziattasfie /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldNahveTasvie /*String*/ ));
RDebugUtils.currentLine=97976329;
 //BA.debugLineNum = 97976329;BA.debugLine="lblCodeTafzili.Text=Item1.fldCodeTafsili";
__ref._lblcodetafzili /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldCodeTafsili /*String*/ ));
RDebugUtils.currentLine=97976330;
 //BA.debugLineNum = 97976330;BA.debugLine="lblSharhTafzili.Text=Item1.fldSharheTafzili";
__ref._lblsharhtafzili /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldSharheTafzili /*String*/ ));
RDebugUtils.currentLine=97976332;
 //BA.debugLineNum = 97976332;BA.debugLine="lblSharh.Text = Item1.fldTozihat";
__ref._lblsharh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_item1.fldTozihat /*String*/ ));
RDebugUtils.currentLine=97976333;
 //BA.debugLineNum = 97976333;BA.debugLine="If Item1.fldShomareFactorReal =-1 Then";
if ((_item1.fldShomareFactorReal /*String*/ ).equals(BA.NumberToString(-1))) { 
RDebugUtils.currentLine=97976334;
 //BA.debugLineNum = 97976334;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Red";
__ref._lblvaziatsefaresh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
RDebugUtils.currentLine=97976335;
 //BA.debugLineNum = 97976335;BA.debugLine="lblVaziatSefaresh.Text =\"تایید نشده\"";
__ref._lblvaziatsefaresh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تایید نشده"));
RDebugUtils.currentLine=97976336;
 //BA.debugLineNum = 97976336;BA.debugLine="BtnCheck.Visible=True";
__ref._btncheck /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
 }else 
{RDebugUtils.currentLine=97976337;
 //BA.debugLineNum = 97976337;BA.debugLine="Else If Item1.fldShomareFactorReal=\"\" Then";
if ((_item1.fldShomareFactorReal /*String*/ ).equals("")) { 
RDebugUtils.currentLine=97976338;
 //BA.debugLineNum = 97976338;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Green";
__ref._lblvaziatsefaresh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Green);
RDebugUtils.currentLine=97976339;
 //BA.debugLineNum = 97976339;BA.debugLine="lblVaziatSefaresh.Text =\"تایید شده\"";
__ref._lblvaziatsefaresh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تایید شده"));
RDebugUtils.currentLine=97976340;
 //BA.debugLineNum = 97976340;BA.debugLine="BtnCheck.Visible=False";
__ref._btncheck /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=97976342;
 //BA.debugLineNum = 97976342;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Black";
__ref._lblvaziatsefaresh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=97976343;
 //BA.debugLineNum = 97976343;BA.debugLine="lblVaziatSefaresh.Text =\"ثبت شده\"";
__ref._lblvaziatsefaresh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("ثبت شده"));
RDebugUtils.currentLine=97976344;
 //BA.debugLineNum = 97976344;BA.debugLine="BtnCheck.Visible=False";
__ref._btncheck /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
 }}
;
RDebugUtils.currentLine=97976346;
 //BA.debugLineNum = 97976346;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_rec_factorvisitor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factorvisitor";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=97910784;
 //BA.debugLineNum = 97910784;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=97910785;
 //BA.debugLineNum = 97910785;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=97910786;
 //BA.debugLineNum = 97910786;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_rec_factorvisitor __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_rec_factorvisitor";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=97779712;
 //BA.debugLineNum = 97779712;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=97779713;
 //BA.debugLineNum = 97779713;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=97779714;
 //BA.debugLineNum = 97779714;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=97779715;
 //BA.debugLineNum = 97779715;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=97779716;
 //BA.debugLineNum = 97779716;BA.debugLine="p.LoadLayout(\"l_rec_factorvisitor\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_rec_factorvisitor",ba);
RDebugUtils.currentLine=97779718;
 //BA.debugLineNum = 97779718;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_rec_factorvisitor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factorvisitor";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=97845248;
 //BA.debugLineNum = 97845248;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=97845249;
 //BA.debugLineNum = 97845249;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=97845250;
 //BA.debugLineNum = 97845250;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=97845251;
 //BA.debugLineNum = 97845251;BA.debugLine="End Sub";
return null;
}
public String  _btncheck_click(ir.parsikhesab.pakhsh.cls_rec_factorvisitor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factorvisitor";
if (Debug.shouldDelegate(ba, "btncheck_click", false))
	 {return ((String) Debug.delegate(ba, "btncheck_click", null));}
String _query = "";
RDebugUtils.currentLine=98041856;
 //BA.debugLineNum = 98041856;BA.debugLine="Sub BtnCheck_Click";
RDebugUtils.currentLine=98041857;
 //BA.debugLineNum = 98041857;BA.debugLine="Log(LblShomareFaktor.Text)";
__c.LogImpl("598041857",__ref._lblshomarefaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=98041858;
 //BA.debugLineNum = 98041858;BA.debugLine="Dim query As String";
_query = "";
RDebugUtils.currentLine=98041859;
 //BA.debugLineNum = 98041859;BA.debugLine="query=\"Update tblPishPishFaktor set fldShomareFac";
_query = "Update tblPishPishFaktor set fldShomareFactorReal=NULL where fldShomareFactorReal=-1 and fldShomareFactor="+__ref._lblshomarefaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+" and fldCodeVasete="+__ref._lblcodevisitor /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
RDebugUtils.currentLine=98041860;
 //BA.debugLineNum = 98041860;BA.debugLine="MCode.BackPage=\"Act_RepFactorVisitor\"";
_mcode._backpage /*String*/  = "Act_RepFactorVisitor";
RDebugUtils.currentLine=98041861;
 //BA.debugLineNum = 98041861;BA.debugLine="CallSubDelayed2(Service_Server,\"SendUpdateQuery\",";
__c.CallSubDelayed2(ba,(Object)(_service_server.getObject()),"SendUpdateQuery",(Object)(_query));
RDebugUtils.currentLine=98041862;
 //BA.debugLineNum = 98041862;BA.debugLine="End Sub";
return "";
}
public String  _btnjoziat_click(ir.parsikhesab.pakhsh.cls_rec_factorvisitor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factorvisitor";
if (Debug.shouldDelegate(ba, "btnjoziat_click", false))
	 {return ((String) Debug.delegate(ba, "btnjoziat_click", null));}
RDebugUtils.currentLine=98107392;
 //BA.debugLineNum = 98107392;BA.debugLine="Sub btnJoziat_Click";
RDebugUtils.currentLine=98107394;
 //BA.debugLineNum = 98107394;BA.debugLine="Act_RepRizFactorVisitor.Item1=btnJoziat.Tag";
_act_reprizfactorvisitor._item1 /*ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor*/  = (ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor)(__ref._btnjoziat /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=98107395;
 //BA.debugLineNum = 98107395;BA.debugLine="StartActivity(Act_RepRizFactorVisitor)";
__c.StartActivity(ba,(Object)(_act_reprizfactorvisitor.getObject()));
RDebugUtils.currentLine=98107396;
 //BA.debugLineNum = 98107396;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_rec_factorvisitor __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_factorvisitor";
RDebugUtils.currentLine=97714176;
 //BA.debugLineNum = 97714176;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=97714177;
 //BA.debugLineNum = 97714177;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=97714178;
 //BA.debugLineNum = 97714178;BA.debugLine="Private LblShomareFaktor As Label";
_lblshomarefaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97714180;
 //BA.debugLineNum = 97714180;BA.debugLine="Private Panel4 As Panel";
_panel4 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=97714181;
 //BA.debugLineNum = 97714181;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=97714182;
 //BA.debugLineNum = 97714182;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=97714185;
 //BA.debugLineNum = 97714185;BA.debugLine="Private BtnCheck As Button";
_btncheck = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=97714186;
 //BA.debugLineNum = 97714186;BA.debugLine="Private LblDate As Label";
_lbldate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97714187;
 //BA.debugLineNum = 97714187;BA.debugLine="Private lblCodeVisitor As Label";
_lblcodevisitor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97714188;
 //BA.debugLineNum = 97714188;BA.debugLine="Private lblNameVisitor As Label";
_lblnamevisitor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97714189;
 //BA.debugLineNum = 97714189;BA.debugLine="Private lblVaziatTasfie As Label";
_lblvaziattasfie = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97714190;
 //BA.debugLineNum = 97714190;BA.debugLine="Private lblVaziatSefaresh As Label";
_lblvaziatsefaresh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97714191;
 //BA.debugLineNum = 97714191;BA.debugLine="Private lblSharh As Label";
_lblsharh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97714192;
 //BA.debugLineNum = 97714192;BA.debugLine="Private btnJoziat As Button";
_btnjoziat = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=97714193;
 //BA.debugLineNum = 97714193;BA.debugLine="Private lblCodeTafzili As Label";
_lblcodetafzili = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97714194;
 //BA.debugLineNum = 97714194;BA.debugLine="Private lblSharhTafzili As Label";
_lblsharhtafzili = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97714195;
 //BA.debugLineNum = 97714195;BA.debugLine="Private lblTime As Label";
_lbltime = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=97714196;
 //BA.debugLineNum = 97714196;BA.debugLine="End Sub";
return "";
}
}