package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_recnotif extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_recnotif");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_recnotif.class).invoke(this, new Object[] {null});
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
public ir.parsikhesab.pakhsh.mcode._adapterlistnotif _ticket = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltime = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmatn = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_subject = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblback = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblline = null;
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
public String  _show_data(ir.parsikhesab.pakhsh.cls_recnotif __ref,ir.parsikhesab.pakhsh.mcode._adapterlistnotif _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recnotif";
if (Debug.shouldDelegate(ba, "show_data", false))
	 {return ((String) Debug.delegate(ba, "show_data", new Object[] {_item}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
RDebugUtils.currentLine=105775104;
 //BA.debugLineNum = 105775104;BA.debugLine="Public Sub show_data(item As AdapterListNotif)";
RDebugUtils.currentLine=105775105;
 //BA.debugLineNum = 105775105;BA.debugLine="ticket			=item";
__ref._ticket /*ir.parsikhesab.pakhsh.mcode._adapterlistnotif*/  = _item;
RDebugUtils.currentLine=105775106;
 //BA.debugLineNum = 105775106;BA.debugLine="lblDate.Text	=ticket.FldDate";
__ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._ticket /*ir.parsikhesab.pakhsh.mcode._adapterlistnotif*/ .FldDate /*String*/ ));
RDebugUtils.currentLine=105775107;
 //BA.debugLineNum = 105775107;BA.debugLine="lblTime.Text	=ticket.FldTime";
__ref._lbltime /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._ticket /*ir.parsikhesab.pakhsh.mcode._adapterlistnotif*/ .FldTime /*String*/ ));
RDebugUtils.currentLine=105775108;
 //BA.debugLineNum = 105775108;BA.debugLine="lbl_Subject.Text=ticket.FldTitle";
__ref._lbl_subject /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._ticket /*ir.parsikhesab.pakhsh.mcode._adapterlistnotif*/ .FldTitle /*String*/ ));
RDebugUtils.currentLine=105775109;
 //BA.debugLineNum = 105775109;BA.debugLine="lblMatn.Text	=\"شرح :\"&ticket.FldBody";
__ref._lblmatn /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شرح :"+__ref._ticket /*ir.parsikhesab.pakhsh.mcode._adapterlistnotif*/ .FldBody /*String*/ ));
RDebugUtils.currentLine=105775110;
 //BA.debugLineNum = 105775110;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=105775111;
 //BA.debugLineNum = 105775111;BA.debugLine="lblMatn.Height = su.MeasureMultilineTextHeight(lb";
__ref._lblmatn /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight((int) (_su.MeasureMultilineTextHeight((android.widget.TextView)(__ref._lblmatn /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),BA.ObjectToCharSequence(__ref._lblmatn /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()))+__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=105775112;
 //BA.debugLineNum = 105775112;BA.debugLine="lblBack.Height=lblMatn.Height+lbl_Subject.Height";
__ref._lblback /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight((int) (__ref._lblmatn /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()+__ref._lbl_subject /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()));
RDebugUtils.currentLine=105775113;
 //BA.debugLineNum = 105775113;BA.debugLine="Panel1.Height=lblMatn.Height+lbl_Subject.Height+l";
__ref._panel1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (__ref._lblmatn /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()+__ref._lbl_subject /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()+__ref._lbl_subject /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()));
RDebugUtils.currentLine=105775114;
 //BA.debugLineNum = 105775114;BA.debugLine="pnl_BK.Height=lblMatn.Height+lbl_Subject.Height+l";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (__ref._lblmatn /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()+__ref._lbl_subject /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()+__ref._lbl_subject /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop()+__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=105775115;
 //BA.debugLineNum = 105775115;BA.debugLine="LblLine.Height = lblMatn.Height+10dip";
__ref._lblline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight((int) (__ref._lblmatn /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()+__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=105775116;
 //BA.debugLineNum = 105775116;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_recnotif __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recnotif";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=105906176;
 //BA.debugLineNum = 105906176;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=105906177;
 //BA.debugLineNum = 105906177;BA.debugLine="Return pnl_BK.Height+20dip";
if (true) return (int) (__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()+__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=105906178;
 //BA.debugLineNum = 105906178;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_recnotif __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_recnotif";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=105709568;
 //BA.debugLineNum = 105709568;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=105709569;
 //BA.debugLineNum = 105709569;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=105709570;
 //BA.debugLineNum = 105709570;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=105709571;
 //BA.debugLineNum = 105709571;BA.debugLine="p.LoadLayout(\"L_RecNotif\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("L_RecNotif",ba);
RDebugUtils.currentLine=105709572;
 //BA.debugLineNum = 105709572;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_recnotif __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recnotif";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=105840640;
 //BA.debugLineNum = 105840640;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=105840641;
 //BA.debugLineNum = 105840641;BA.debugLine="pnl_BK.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=105840642;
 //BA.debugLineNum = 105840642;BA.debugLine="Return pnl_BK";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=105840643;
 //BA.debugLineNum = 105840643;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_recnotif __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recnotif";
RDebugUtils.currentLine=105644032;
 //BA.debugLineNum = 105644032;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=105644033;
 //BA.debugLineNum = 105644033;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=105644034;
 //BA.debugLineNum = 105644034;BA.debugLine="Private ticket As AdapterListNotif";
_ticket = new ir.parsikhesab.pakhsh.mcode._adapterlistnotif();
RDebugUtils.currentLine=105644035;
 //BA.debugLineNum = 105644035;BA.debugLine="Private pnl_BK As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=105644036;
 //BA.debugLineNum = 105644036;BA.debugLine="Private lblDate As Label";
_lbldate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=105644037;
 //BA.debugLineNum = 105644037;BA.debugLine="Private lblTime As Label";
_lbltime = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=105644038;
 //BA.debugLineNum = 105644038;BA.debugLine="Private lblMatn As Label";
_lblmatn = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=105644039;
 //BA.debugLineNum = 105644039;BA.debugLine="Private lbl_Subject As Label";
_lbl_subject = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=105644040;
 //BA.debugLineNum = 105644040;BA.debugLine="Private lblBack As Label";
_lblback = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=105644041;
 //BA.debugLineNum = 105644041;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=105644042;
 //BA.debugLineNum = 105644042;BA.debugLine="Private LblLine As Label";
_lblline = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=105644043;
 //BA.debugLineNum = 105644043;BA.debugLine="End Sub";
return "";
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_recnotif __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recnotif";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=105971712;
 //BA.debugLineNum = 105971712;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=105971713;
 //BA.debugLineNum = 105971713;BA.debugLine="Return pnl_BK.Width+5dip";
if (true) return (int) (__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=105971714;
 //BA.debugLineNum = 105971714;BA.debugLine="End Sub";
return 0;
}
public String  _pnl_bk_click(ir.parsikhesab.pakhsh.cls_recnotif __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recnotif";
if (Debug.shouldDelegate(ba, "pnl_bk_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_bk_click", null));}
RDebugUtils.currentLine=106037248;
 //BA.debugLineNum = 106037248;BA.debugLine="Private Sub pnl_bk_Click";
RDebugUtils.currentLine=106037250;
 //BA.debugLineNum = 106037250;BA.debugLine="End Sub";
return "";
}
}