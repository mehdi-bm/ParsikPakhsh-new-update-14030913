package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_recbackupitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_recbackupitem");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_recbackupitem.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lblrow = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltime = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndelete = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnreturn = null;
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
public String  _btndelete_click(ir.parsikhesab.pakhsh.cls_recbackupitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recbackupitem";
if (Debug.shouldDelegate(ba, "btndelete_click", false))
	 {return ((String) Debug.delegate(ba, "btndelete_click", null));}
RDebugUtils.currentLine=100859904;
 //BA.debugLineNum = 100859904;BA.debugLine="Sub btnDelete_Click";
RDebugUtils.currentLine=100859906;
 //BA.debugLineNum = 100859906;BA.debugLine="End Sub";
return "";
}
public String  _btnreturn_click(ir.parsikhesab.pakhsh.cls_recbackupitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recbackupitem";
if (Debug.shouldDelegate(ba, "btnreturn_click", false))
	 {return ((String) Debug.delegate(ba, "btnreturn_click", null));}
RDebugUtils.currentLine=100925440;
 //BA.debugLineNum = 100925440;BA.debugLine="Sub btnReturn_Click";
RDebugUtils.currentLine=100925442;
 //BA.debugLineNum = 100925442;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_recbackupitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recbackupitem";
RDebugUtils.currentLine=100728832;
 //BA.debugLineNum = 100728832;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=100728833;
 //BA.debugLineNum = 100728833;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=100728835;
 //BA.debugLineNum = 100728835;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=100728836;
 //BA.debugLineNum = 100728836;BA.debugLine="Private lblRow As Label";
_lblrow = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=100728837;
 //BA.debugLineNum = 100728837;BA.debugLine="Private lblDate As Label";
_lbldate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=100728838;
 //BA.debugLineNum = 100728838;BA.debugLine="Private lblTime As Label";
_lbltime = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=100728839;
 //BA.debugLineNum = 100728839;BA.debugLine="Private btnDelete As Button";
_btndelete = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=100728840;
 //BA.debugLineNum = 100728840;BA.debugLine="Private btnReturn As Button";
_btnreturn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=100728841;
 //BA.debugLineNum = 100728841;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_recbackupitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recbackupitem";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=101122048;
 //BA.debugLineNum = 101122048;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=101122049;
 //BA.debugLineNum = 101122049;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=101122050;
 //BA.debugLineNum = 101122050;BA.debugLine="End Sub";
return 0;
}
public int  _getleft(ir.parsikhesab.pakhsh.cls_recbackupitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recbackupitem";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=101253120;
 //BA.debugLineNum = 101253120;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=101253121;
 //BA.debugLineNum = 101253121;BA.debugLine="Return pnl_bk.Left";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=101253122;
 //BA.debugLineNum = 101253122;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_recbackupitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recbackupitem";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=100990976;
 //BA.debugLineNum = 100990976;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=100990977;
 //BA.debugLineNum = 100990977;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=100990978;
 //BA.debugLineNum = 100990978;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=100990979;
 //BA.debugLineNum = 100990979;BA.debugLine="End Sub";
return null;
}
public int  _gettop(ir.parsikhesab.pakhsh.cls_recbackupitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recbackupitem";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=101187584;
 //BA.debugLineNum = 101187584;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=101187585;
 //BA.debugLineNum = 101187585;BA.debugLine="Return pnl_bk.Top";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=101187586;
 //BA.debugLineNum = 101187586;BA.debugLine="End Sub";
return 0;
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_recbackupitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recbackupitem";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=101056512;
 //BA.debugLineNum = 101056512;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=101056513;
 //BA.debugLineNum = 101056513;BA.debugLine="Return pnl_bk.Width";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=101056514;
 //BA.debugLineNum = 101056514;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_recbackupitem __ref,anywheresoftware.b4a.BA _ba,String _row,String _date,String _time) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_recbackupitem";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_row,_date,_time}));}
RDebugUtils.currentLine=100794368;
 //BA.debugLineNum = 100794368;BA.debugLine="Public Sub Initialize(Row As String,Date As String";
RDebugUtils.currentLine=100794369;
 //BA.debugLineNum = 100794369;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=100794370;
 //BA.debugLineNum = 100794370;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=100794371;
 //BA.debugLineNum = 100794371;BA.debugLine="p.LoadLayout(\"l_backupitem\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_backupitem",ba);
RDebugUtils.currentLine=100794372;
 //BA.debugLineNum = 100794372;BA.debugLine="lblRow.Text=Row";
__ref._lblrow /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_row));
RDebugUtils.currentLine=100794373;
 //BA.debugLineNum = 100794373;BA.debugLine="lblDate.Text=Date";
__ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_date));
RDebugUtils.currentLine=100794374;
 //BA.debugLineNum = 100794374;BA.debugLine="lblTime.Text=Time";
__ref._lbltime /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_time));
RDebugUtils.currentLine=100794375;
 //BA.debugLineNum = 100794375;BA.debugLine="End Sub";
return "";
}
}