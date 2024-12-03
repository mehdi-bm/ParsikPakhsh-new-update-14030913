
package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cls_recnotif {
    public static RemoteObject myClass;
	public cls_recnotif() {
	}
    public static PCBA staticBA = new PCBA(null, cls_recnotif.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _ticket = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnotif");
public static RemoteObject _pnl_bk = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbldate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltime = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmatn = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_subject = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblback = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblline = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _locationf = RemoteObject.declareNull("igolub.fused.b4a.location.android.location.LocationFWrapper.LocationFStatic");
public static RemoteObject _locationresult = RemoteObject.declareNull("igolub.fused.b4a.location.LocationResultWrapper.LocationResultConstants");
public static RemoteObject _locationrequest = RemoteObject.declareNull("igolub.fused.b4a.location.LocationRequestWrapper.LocationRequestConstants");
public static RemoteObject _priority = RemoteObject.declareNull("igolub.fused.b4a.location.staticmodules.PriorityWrapper");
public static RemoteObject _granularity = RemoteObject.declareNull("igolub.fused.b4a.location.staticmodules.GranularityWrapper");
public static RemoteObject _fileprovider = RemoteObject.declareNull("igolub.permissionmanager.b4a.PermissionsManagerFileProvider");
public static RemoteObject _permissionsmanager = RemoteObject.declareNull("igolub.permissionmanager.b4a.PermissionsManagerConstants");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static ir.parsikhesab.pakhsh.main _main = null;
public static ir.parsikhesab.pakhsh.act_main _act_main = null;
public static ir.parsikhesab.pakhsh.service_server _service_server = null;
public static ir.parsikhesab.pakhsh.mcode _mcode = null;
public static ir.parsikhesab.pakhsh.mycode _mycode = null;
public static ir.parsikhesab.pakhsh.mdatabase _mdatabase = null;
public static ir.parsikhesab.pakhsh.gpswiget _gpswiget = null;
public static ir.parsikhesab.pakhsh.fusedlocationservice _fusedlocationservice = null;
public static ir.parsikhesab.pakhsh.service_helper _service_helper = null;
public static ir.parsikhesab.pakhsh.act_selectmantage _act_selectmantage = null;
public static ir.parsikhesab.pakhsh.act_reprizfactorvisitor _act_reprizfactorvisitor = null;
public static ir.parsikhesab.pakhsh.act_choose_report _act_choose_report = null;
public static ir.parsikhesab.pakhsh.act_emza _act_emza = null;
public static ir.parsikhesab.pakhsh.act_havaletozie _act_havaletozie = null;
public static ir.parsikhesab.pakhsh.act_imageslideshow _act_imageslideshow = null;
public static ir.parsikhesab.pakhsh.act_kala_listi _act_kala_listi = null;
public static ir.parsikhesab.pakhsh.act_kaladefault _act_kaladefault = null;
public static ir.parsikhesab.pakhsh.act_kalapaging _act_kalapaging = null;
public static ir.parsikhesab.pakhsh.act_kalapaging2 _act_kalapaging2 = null;
public static ir.parsikhesab.pakhsh.act_locationmoshtarian _act_locationmoshtarian = null;
public static ir.parsikhesab.pakhsh.act_locationvisitor _act_locationvisitor = null;
public static ir.parsikhesab.pakhsh.act_mali _act_mali = null;
public static ir.parsikhesab.pakhsh.act_moshtarian _act_moshtarian = null;
public static ir.parsikhesab.pakhsh.act_newashkhas _act_newashkhas = null;
public static ir.parsikhesab.pakhsh.act_notif _act_notif = null;
public static ir.parsikhesab.pakhsh.act_printmali _act_printmali = null;
public static ir.parsikhesab.pakhsh.act_printpic _act_printpic = null;
public static ir.parsikhesab.pakhsh.act_printpic2 _act_printpic2 = null;
public static ir.parsikhesab.pakhsh.act_profile _act_profile = null;
public static ir.parsikhesab.pakhsh.act_repfactors _act_repfactors = null;
public static ir.parsikhesab.pakhsh.act_repfactorvisitor _act_repfactorvisitor = null;
public static ir.parsikhesab.pakhsh.act_reportrizebargasht _act_reportrizebargasht = null;
public static ir.parsikhesab.pakhsh.act_reportsoorathesab _act_reportsoorathesab = null;
public static ir.parsikhesab.pakhsh.act_reportvisitor _act_reportvisitor = null;
public static ir.parsikhesab.pakhsh.act_reportvisitor2 _act_reportvisitor2 = null;
public static ir.parsikhesab.pakhsh.act_restore _act_restore = null;
public static ir.parsikhesab.pakhsh.act_rizefactorhavale _act_rizefactorhavale = null;
public static ir.parsikhesab.pakhsh.act_rizfaktor _act_rizfaktor = null;
public static ir.parsikhesab.pakhsh.act_rizhavale _act_rizhavale = null;
public static ir.parsikhesab.pakhsh.act_sabad _act_sabad = null;
public static ir.parsikhesab.pakhsh.act_sabtmarjooii _act_sabtmarjooii = null;
public static ir.parsikhesab.pakhsh.act_sabtrizcheck _act_sabtrizcheck = null;
public static ir.parsikhesab.pakhsh.act_saveinfocompany _act_saveinfocompany = null;
public static ir.parsikhesab.pakhsh.act_savelocation _act_savelocation = null;
public static ir.parsikhesab.pakhsh.act_search _act_search = null;
public static ir.parsikhesab.pakhsh.act_selfaktor _act_selfaktor = null;
public static ir.parsikhesab.pakhsh.act_senddata _act_senddata = null;
public static ir.parsikhesab.pakhsh.act_setting _act_setting = null;
public static ir.parsikhesab.pakhsh.act_settingpos _act_settingpos = null;
public static ir.parsikhesab.pakhsh.act_showlocation _act_showlocation = null;
public static ir.parsikhesab.pakhsh.act_support _act_support = null;
public static ir.parsikhesab.pakhsh.act_ticket _act_ticket = null;
public static ir.parsikhesab.pakhsh.act_video _act_video = null;
public static ir.parsikhesab.pakhsh.clskala _clskala = null;
public static ir.parsikhesab.pakhsh.dbutils _dbutils = null;
public static ir.parsikhesab.pakhsh.firebasemessaging _firebasemessaging = null;
public static ir.parsikhesab.pakhsh.geoservice _geoservice = null;
public static ir.parsikhesab.pakhsh.imagedownloader _imagedownloader = null;
public static ir.parsikhesab.pakhsh.myreceiver _myreceiver = null;
public static ir.parsikhesab.pakhsh.service_gps _service_gps = null;
public static ir.parsikhesab.pakhsh.service_notification _service_notification = null;
public static ir.parsikhesab.pakhsh.signaturecapture _signaturecapture = null;
public static ir.parsikhesab.pakhsh.starter _starter = null;
public static ir.parsikhesab.pakhsh.tracker _tracker = null;
public static ir.parsikhesab.pakhsh.wiget_service _wiget_service = null;
public static ir.parsikhesab.pakhsh.xmlviewex _xmlviewex = null;
public static ir.parsikhesab.pakhsh.newinst2 _newinst2 = null;
public static ir.parsikhesab.pakhsh.base64encodedecodeimage _base64encodedecodeimage = null;
public static ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public static ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"FileProvider",_ref.getField(false, "_fileprovider"),"Granularity",_ref.getField(false, "_granularity"),"lbl_Subject",_ref.getField(false, "_lbl_subject"),"lblBack",_ref.getField(false, "_lblback"),"lblDate",_ref.getField(false, "_lbldate"),"LblLine",_ref.getField(false, "_lblline"),"lblMatn",_ref.getField(false, "_lblmatn"),"lblTime",_ref.getField(false, "_lbltime"),"LocationF",_ref.getField(false, "_locationf"),"LocationRequest",_ref.getField(false, "_locationrequest"),"LocationResult",_ref.getField(false, "_locationresult"),"p",_ref.getField(false, "_p"),"Panel1",_ref.getField(false, "_panel1"),"PermissionsManager",_ref.getField(false, "_permissionsmanager"),"pnl_BK",_ref.getField(false, "_pnl_bk"),"Priority",_ref.getField(false, "_priority"),"ticket",_ref.getField(false, "_ticket")};
}
}