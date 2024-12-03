package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_rizcheck extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_rizcheck");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_rizcheck.class).invoke(this, new Object[] {null});
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
public ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti _item = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarehesab = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomaredaryaft = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamesahebcheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshobe = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharh = null;
public boolean _send = false;
public anywheresoftware.b4a.objects.LabelWrapper _btndelete = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_rizcheck __ref,ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti _item1,boolean _issend) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizcheck";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1,_issend}));}
RDebugUtils.currentLine=107806720;
 //BA.debugLineNum = 107806720;BA.debugLine="Public Sub Show(Item1 As AdapterListCheckDaryafti,";
RDebugUtils.currentLine=107806721;
 //BA.debugLineNum = 107806721;BA.debugLine="item=Item1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti*/  = _item1;
RDebugUtils.currentLine=107806722;
 //BA.debugLineNum = 107806722;BA.debugLine="If Item1.fldDateSarResid <> 0 Then";
if ((_item1.fldDateSarResid /*String*/ ).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=107806723;
 //BA.debugLineNum = 107806723;BA.debugLine="LblDateCheck.text = \"تاریخ چک: \" & MCode.Sf.Mid(";
__ref._lbldatecheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تاریخ چک: "+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.fldDateSarResid /*String*/ ,(int) (1),(int) (4))+"/"+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.fldDateSarResid /*String*/ ,(int) (5),(int) (2))+"/"+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.fldDateSarResid /*String*/ ,(int) (7),(int) (2))));
 }else {
RDebugUtils.currentLine=107806725;
 //BA.debugLineNum = 107806725;BA.debugLine="LblDateCheck.text = \"تاریخ چک: -\"";
__ref._lbldatecheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تاریخ چک: -"));
 };
RDebugUtils.currentLine=107806727;
 //BA.debugLineNum = 107806727;BA.debugLine="LblDateSabt.Text=\"تاریخ ثبت: \" & MCode.Sf.Mid(Ite";
__ref._lbldatesabt /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تاریخ ثبت: "+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.fldDate /*String*/ ,(int) (1),(int) (4))+"/"+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.fldDate /*String*/ ,(int) (5),(int) (2))+"/"+_mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_item1.fldDate /*String*/ ,(int) (7),(int) (2))));
RDebugUtils.currentLine=107806728;
 //BA.debugLineNum = 107806728;BA.debugLine="LblMablagh.Text=\"مبلغ: \" & myCode.AdadToPrice(Ite";
__ref._lblmablagh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مبلغ: "+_mycode._adadtoprice /*String*/ (ba,BA.NumberToString(_item1.fldMablagh /*int*/ ))));
RDebugUtils.currentLine=107806729;
 //BA.debugLineNum = 107806729;BA.debugLine="LblShomareHesab.Text=\"شماره حساب: \" & Item1.fldSh";
__ref._lblshomarehesab /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شماره حساب: "+_item1.fldShomareHesab /*String*/ ));
RDebugUtils.currentLine=107806730;
 //BA.debugLineNum = 107806730;BA.debugLine="LblShomareDaryaft.Text=\"شماره دریافت: \" & Item1.f";
__ref._lblshomaredaryaft /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شماره دریافت: "+_item1.fldShomareDaryaft /*String*/ ));
RDebugUtils.currentLine=107806732;
 //BA.debugLineNum = 107806732;BA.debugLine="If Item1.fldNameBank<>0 Then";
if ((_item1.fldNameBank /*String*/ ).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=107806733;
 //BA.debugLineNum = 107806733;BA.debugLine="LblNameBank.text = \"نام بانک: \" & Item1.fldNameB";
__ref._lblnamebank /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نام بانک: "+_item1.fldNameBank /*String*/ ));
 }else {
RDebugUtils.currentLine=107806735;
 //BA.debugLineNum = 107806735;BA.debugLine="LblNameBank.text = \"نام بانک: -\"";
__ref._lblnamebank /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نام بانک: -"));
 };
RDebugUtils.currentLine=107806738;
 //BA.debugLineNum = 107806738;BA.debugLine="If Item1.FldShomareCheck <> 0 Then";
if ((_item1.fldShomareCheck /*String*/ ).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=107806739;
 //BA.debugLineNum = 107806739;BA.debugLine="LblShomareCheck.text = \"شماره چک: \" & Item1.FldS";
__ref._lblshomarecheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شماره چک: "+_item1.fldShomareCheck /*String*/ ));
 }else {
RDebugUtils.currentLine=107806741;
 //BA.debugLineNum = 107806741;BA.debugLine="LblShomareCheck.text = \"شماره چک: -\"";
__ref._lblshomarecheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شماره چک: -"));
 };
RDebugUtils.currentLine=107806743;
 //BA.debugLineNum = 107806743;BA.debugLine="LblShobe.Text=\"شعبه: \"& Item1.fldShobe";
__ref._lblshobe /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شعبه: "+_item1.fldShobe /*String*/ ));
RDebugUtils.currentLine=107806745;
 //BA.debugLineNum = 107806745;BA.debugLine="LblNameSahebcheck.Text=\"نام صاحب چک: \"&Item1.fldN";
__ref._lblnamesahebcheck /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نام صاحب چک: "+_item1.fldNameSahebeCheck /*String*/ ));
RDebugUtils.currentLine=107806746;
 //BA.debugLineNum = 107806746;BA.debugLine="LblSharh.Text=\"شرح: \"&Item1.fldSharh";
__ref._lblsharh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("شرح: "+_item1.fldSharh /*String*/ ));
RDebugUtils.currentLine=107806748;
 //BA.debugLineNum = 107806748;BA.debugLine="If issend Then";
if (_issend) { 
RDebugUtils.currentLine=107806749;
 //BA.debugLineNum = 107806749;BA.debugLine="btnDelete.Enabled=False";
__ref._btndelete /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
 };
RDebugUtils.currentLine=107806751;
 //BA.debugLineNum = 107806751;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_rizcheck __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizcheck";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=107872256;
 //BA.debugLineNum = 107872256;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=107872257;
 //BA.debugLineNum = 107872257;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=107872258;
 //BA.debugLineNum = 107872258;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_rizcheck __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_rizcheck";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=107741184;
 //BA.debugLineNum = 107741184;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=107741185;
 //BA.debugLineNum = 107741185;BA.debugLine="Try";
try {RDebugUtils.currentLine=107741186;
 //BA.debugLineNum = 107741186;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=107741187;
 //BA.debugLineNum = 107741187;BA.debugLine="Key.Initialize(\"Key\")";
__ref._key /*anywheresoftware.b4a.objects.IME*/ .Initialize("Key");
RDebugUtils.currentLine=107741188;
 //BA.debugLineNum = 107741188;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=107741189;
 //BA.debugLineNum = 107741189;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=107741190;
 //BA.debugLineNum = 107741190;BA.debugLine="p.LoadLayout(\"l_rec_rizcheck\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_rec_rizcheck",ba);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=107741195;
 //BA.debugLineNum = 107741195;BA.debugLine="MCode.SendError(LastException)";
_mcode._senderror /*String*/ (ba,BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=107741196;
 //BA.debugLineNum = 107741196;BA.debugLine="Log(LastException)";
__c.LogImpl("5107741196",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=107741198;
 //BA.debugLineNum = 107741198;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_rizcheck __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizcheck";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=107937792;
 //BA.debugLineNum = 107937792;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=107937793;
 //BA.debugLineNum = 107937793;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=107937794;
 //BA.debugLineNum = 107937794;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=107937795;
 //BA.debugLineNum = 107937795;BA.debugLine="End Sub";
return null;
}
public String  _btndelete_click(ir.parsikhesab.pakhsh.cls_rizcheck __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizcheck";
if (Debug.shouldDelegate(ba, "btndelete_click", false))
	 {return ((String) Debug.delegate(ba, "btndelete_click", null));}
int _result = 0;
RDebugUtils.currentLine=108068864;
 //BA.debugLineNum = 108068864;BA.debugLine="Sub btnDelete_Click";
RDebugUtils.currentLine=108068865;
 //BA.debugLineNum = 108068865;BA.debugLine="Log(item.ID)";
__c.LogImpl("5108068865",__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti*/ .ID /*String*/ ,0);
RDebugUtils.currentLine=108068866;
 //BA.debugLineNum = 108068866;BA.debugLine="Try";
try {RDebugUtils.currentLine=108068867;
 //BA.debugLineNum = 108068867;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=108068868;
 //BA.debugLineNum = 108068868;BA.debugLine="result = Msgbox2(\"آیا از حذف چک مورد نظر اطمینان";
_result = __c.Msgbox2(BA.ObjectToCharSequence("آیا از حذف چک مورد نظر اطمینان دارید؟"),BA.ObjectToCharSequence("حذف چک"),"بله","","خیر",(android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"icon.png").getObject()),ba);
RDebugUtils.currentLine=108068869;
 //BA.debugLineNum = 108068869;BA.debugLine="If result = DialogResponse.Positive Then";
if (_result==__c.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=108068870;
 //BA.debugLineNum = 108068870;BA.debugLine="MCode.SaveUpdate(\"delete From TblCheckDaryafti";
_mcode._saveupdate /*String*/ (ba,"delete From TblCheckDaryafti where ID="+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti*/ .ID /*String*/ );
RDebugUtils.currentLine=108068871;
 //BA.debugLineNum = 108068871;BA.debugLine="If item.count>1 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti*/ .count /*String*/ ))>1) { 
RDebugUtils.currentLine=108068872;
 //BA.debugLineNum = 108068872;BA.debugLine="MCode.SaveUpdate(\"Update TblDaryaft set fldMab";
_mcode._saveupdate /*String*/ (ba,"Update TblDaryaft set fldMablaghDaryafti=fldMablaghDaryafti-"+BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti*/ .fldMablagh /*int*/ )+" where fldShomareDaryaft="+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti*/ .fldShomareDaryaft /*String*/ +" and fldType=2");
RDebugUtils.currentLine=108068873;
 //BA.debugLineNum = 108068873;BA.debugLine="CallSubDelayed(Act_SabtRizCheck,\"LoadCheck\")";
__c.CallSubDelayed(ba,(Object)(_act_sabtrizcheck.getObject()),"LoadCheck");
 }else {
RDebugUtils.currentLine=108068877;
 //BA.debugLineNum = 108068877;BA.debugLine="MCode.SaveUpdate(\"delete From TblDaryaft  wher";
_mcode._saveupdate /*String*/ (ba,"delete From TblDaryaft  where fldShomareDaryaft="+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti*/ .fldShomareDaryaft /*String*/ +" and fldType=2");
RDebugUtils.currentLine=108068878;
 //BA.debugLineNum = 108068878;BA.debugLine="CallSubDelayed(Act_SabtRizCheck,\"btn_Back_Clic";
__c.CallSubDelayed(ba,(Object)(_act_sabtrizcheck.getObject()),"btn_Back_Click");
 };
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=108068883;
 //BA.debugLineNum = 108068883;BA.debugLine="Log(LastException)";
__c.LogImpl("5108068883",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=108068885;
 //BA.debugLineNum = 108068885;BA.debugLine="End Sub";
return "";
}
public String  _btnprint_click(ir.parsikhesab.pakhsh.cls_rizcheck __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizcheck";
if (Debug.shouldDelegate(ba, "btnprint_click", false))
	 {return ((String) Debug.delegate(ba, "btnprint_click", null));}
RDebugUtils.currentLine=108003328;
 //BA.debugLineNum = 108003328;BA.debugLine="Sub btnPrint_Click";
RDebugUtils.currentLine=108003336;
 //BA.debugLineNum = 108003336;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_rizcheck __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rizcheck";
RDebugUtils.currentLine=107675648;
 //BA.debugLineNum = 107675648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=107675649;
 //BA.debugLineNum = 107675649;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=107675650;
 //BA.debugLineNum = 107675650;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=107675651;
 //BA.debugLineNum = 107675651;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=107675652;
 //BA.debugLineNum = 107675652;BA.debugLine="Private Key As IME";
_key = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=107675654;
 //BA.debugLineNum = 107675654;BA.debugLine="Private LblDateCheck As Label";
_lbldatecheck = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675655;
 //BA.debugLineNum = 107675655;BA.debugLine="Private LblDateSabt As Label";
_lbldatesabt = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675656;
 //BA.debugLineNum = 107675656;BA.debugLine="Private LblMablagh As Label";
_lblmablagh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675657;
 //BA.debugLineNum = 107675657;BA.debugLine="Private LblNameBank As Label";
_lblnamebank = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675658;
 //BA.debugLineNum = 107675658;BA.debugLine="Private LblShomareCheck As Label";
_lblshomarecheck = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675660;
 //BA.debugLineNum = 107675660;BA.debugLine="Dim item As AdapterListCheckDaryafti";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti();
RDebugUtils.currentLine=107675661;
 //BA.debugLineNum = 107675661;BA.debugLine="Private LblShomareHesab As Label";
_lblshomarehesab = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675662;
 //BA.debugLineNum = 107675662;BA.debugLine="Private LblShomareDaryaft As Label";
_lblshomaredaryaft = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675663;
 //BA.debugLineNum = 107675663;BA.debugLine="Private LblNameSahebcheck As Label";
_lblnamesahebcheck = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675664;
 //BA.debugLineNum = 107675664;BA.debugLine="Private LblShobe As Label";
_lblshobe = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675665;
 //BA.debugLineNum = 107675665;BA.debugLine="Private LblSharh As Label";
_lblsharh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675666;
 //BA.debugLineNum = 107675666;BA.debugLine="Dim send As Boolean";
_send = false;
RDebugUtils.currentLine=107675667;
 //BA.debugLineNum = 107675667;BA.debugLine="Private btnDelete As Label";
_btndelete = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=107675668;
 //BA.debugLineNum = 107675668;BA.debugLine="End Sub";
return "";
}
}