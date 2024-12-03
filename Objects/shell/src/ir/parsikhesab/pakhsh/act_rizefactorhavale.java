
package ir.parsikhesab.pakhsh;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class act_rizefactorhavale implements IRemote{
	public static act_rizefactorhavale mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public act_rizefactorhavale() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("act_rizefactorhavale"), "ir.parsikhesab.pakhsh.act_rizefactorhavale");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, act_rizefactorhavale.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _shomarefaktor = RemoteObject.createImmutable("");
public static RemoteObject _shomarehavale = RemoteObject.createImmutable("");
public static RemoteObject _codemoshtari = RemoteObject.createImmutable("");
public static RemoteObject _namemoshtari = RemoteObject.createImmutable("");
public static RemoteObject _date = RemoteObject.createImmutable("");
public static RemoteObject _fldlat = RemoteObject.createImmutable("");
public static RemoteObject _fldlon = RemoteObject.createImmutable("");
public static RemoteObject _gps = RemoteObject.declareNull("anywheresoftware.b4a.gps.GPS");
public static RemoteObject _t1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _table1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.table");
public static RemoteObject _key = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _listkala = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lblnamemoshtari = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txtsharhfaktor = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btn_print = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pnltable = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _lblghabelepardakht = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmandeghabl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltakhfifkala = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltotalfaktor2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmablaghkhales = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblshomarefactor = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btn_tasvie = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnshowmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btncheck = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblcodemoshtari = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblshomarehavale = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmablaghekoldaryafti = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblvaziat = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _vaziat = RemoteObject.createImmutable("");
public static RemoteObject _mapfragment1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper");
public static RemoteObject _gmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
public static RemoteObject _mablaghfinal = RemoteObject.createImmutable("");
public static RemoteObject _lblmabalghtahkfifdaryafti = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _loc = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");
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
  public Object[] GetGlobals() {
		return new Object[] {"Act_Choose_Report",Debug.moduleToString(ir.parsikhesab.pakhsh.act_choose_report.class),"Act_Emza",Debug.moduleToString(ir.parsikhesab.pakhsh.act_emza.class),"Act_HavaleTozie",Debug.moduleToString(ir.parsikhesab.pakhsh.act_havaletozie.class),"Act_ImageSlideShow",Debug.moduleToString(ir.parsikhesab.pakhsh.act_imageslideshow.class),"Act_Kala_listi",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kala_listi.class),"Act_KalaDefault",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kaladefault.class),"Act_KalaPaging",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kalapaging.class),"Act_KalaPaging2",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kalapaging2.class),"Act_LocationMoshtarian",Debug.moduleToString(ir.parsikhesab.pakhsh.act_locationmoshtarian.class),"Act_LocationVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_locationvisitor.class),"Act_Main",Debug.moduleToString(ir.parsikhesab.pakhsh.act_main.class),"Act_Mali",Debug.moduleToString(ir.parsikhesab.pakhsh.act_mali.class),"Act_Moshtarian",Debug.moduleToString(ir.parsikhesab.pakhsh.act_moshtarian.class),"Act_NewAshkhas",Debug.moduleToString(ir.parsikhesab.pakhsh.act_newashkhas.class),"Act_Notif",Debug.moduleToString(ir.parsikhesab.pakhsh.act_notif.class),"Act_PrintMali",Debug.moduleToString(ir.parsikhesab.pakhsh.act_printmali.class),"Act_PrintPic",Debug.moduleToString(ir.parsikhesab.pakhsh.act_printpic.class),"Act_PrintPic2",Debug.moduleToString(ir.parsikhesab.pakhsh.act_printpic2.class),"Act_Profile",Debug.moduleToString(ir.parsikhesab.pakhsh.act_profile.class),"Act_RepFactors",Debug.moduleToString(ir.parsikhesab.pakhsh.act_repfactors.class),"Act_RepFactorVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_repfactorvisitor.class),"Act_ReportRizeBargasht",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportrizebargasht.class),"Act_ReportSoorathesab",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportsoorathesab.class),"Act_ReportVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportvisitor.class),"Act_ReportVisitor2",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportvisitor2.class),"Act_RepRizFactorVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reprizfactorvisitor.class),"Act_Restore",Debug.moduleToString(ir.parsikhesab.pakhsh.act_restore.class),"Act_RizFaktor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_rizfaktor.class),"Act_RizHavale",Debug.moduleToString(ir.parsikhesab.pakhsh.act_rizhavale.class),"Act_Sabad",Debug.moduleToString(ir.parsikhesab.pakhsh.act_sabad.class),"Act_SabtMarjooii",Debug.moduleToString(ir.parsikhesab.pakhsh.act_sabtmarjooii.class),"Act_SabtRizCheck",Debug.moduleToString(ir.parsikhesab.pakhsh.act_sabtrizcheck.class),"Act_SaveInfoCompany",Debug.moduleToString(ir.parsikhesab.pakhsh.act_saveinfocompany.class),"Act_SaveLocation",Debug.moduleToString(ir.parsikhesab.pakhsh.act_savelocation.class),"Act_Search",Debug.moduleToString(ir.parsikhesab.pakhsh.act_search.class),"Act_SelectMantage",Debug.moduleToString(ir.parsikhesab.pakhsh.act_selectmantage.class),"Act_SelFaktor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_selfaktor.class),"Act_SendData",Debug.moduleToString(ir.parsikhesab.pakhsh.act_senddata.class),"Act_Setting",Debug.moduleToString(ir.parsikhesab.pakhsh.act_setting.class),"Act_SettingPos",Debug.moduleToString(ir.parsikhesab.pakhsh.act_settingpos.class),"Act_ShowLocation",Debug.moduleToString(ir.parsikhesab.pakhsh.act_showlocation.class),"Act_Support",Debug.moduleToString(ir.parsikhesab.pakhsh.act_support.class),"Act_Ticket",Debug.moduleToString(ir.parsikhesab.pakhsh.act_ticket.class),"Act_Video",Debug.moduleToString(ir.parsikhesab.pakhsh.act_video.class),"Activity",act_rizefactorhavale.mostCurrent._activity,"Base64EncodeDecodeImage",Debug.moduleToString(ir.parsikhesab.pakhsh.base64encodedecodeimage.class),"Btn_print",act_rizefactorhavale.mostCurrent._btn_print,"Btn_Tasvie",act_rizefactorhavale.mostCurrent._btn_tasvie,"BtnCheck",act_rizefactorhavale.mostCurrent._btncheck,"BtnShowMap",act_rizefactorhavale.mostCurrent._btnshowmap,"ClsKala",Debug.moduleToString(ir.parsikhesab.pakhsh.clskala.class),"CodeMoshtari",act_rizefactorhavale._codemoshtari,"date",act_rizefactorhavale._date,"DateUtils",act_rizefactorhavale.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(ir.parsikhesab.pakhsh.dbutils.class),"FileProvider",act_rizefactorhavale.mostCurrent._fileprovider,"FirebaseMessaging",Debug.moduleToString(ir.parsikhesab.pakhsh.firebasemessaging.class),"fldLat",act_rizefactorhavale._fldlat,"fldLon",act_rizefactorhavale._fldlon,"FusedLocationService",Debug.moduleToString(ir.parsikhesab.pakhsh.fusedlocationservice.class),"GeoService",Debug.moduleToString(ir.parsikhesab.pakhsh.geoservice.class),"gmap",act_rizefactorhavale.mostCurrent._gmap,"Gps",act_rizefactorhavale._gps,"GpsWiget",Debug.moduleToString(ir.parsikhesab.pakhsh.gpswiget.class),"Granularity",act_rizefactorhavale.mostCurrent._granularity,"HttpUtils2Service",Debug.moduleToString(ir.parsikhesab.pakhsh.httputils2service.class),"ImageDownloader",Debug.moduleToString(ir.parsikhesab.pakhsh.imagedownloader.class),"Key",act_rizefactorhavale.mostCurrent._key,"LblCodeMoshtari",act_rizefactorhavale.mostCurrent._lblcodemoshtari,"lblDate",act_rizefactorhavale.mostCurrent._lbldate,"LblGHabelePardakht",act_rizefactorhavale.mostCurrent._lblghabelepardakht,"LblMabalghTahkfifDaryafti",act_rizefactorhavale.mostCurrent._lblmabalghtahkfifdaryafti,"lblMablagheKolDaryafti",act_rizefactorhavale.mostCurrent._lblmablaghekoldaryafti,"LblMablaghKhales",act_rizefactorhavale.mostCurrent._lblmablaghkhales,"LblMandeGhabl",act_rizefactorhavale.mostCurrent._lblmandeghabl,"LblNameMoshtari",act_rizefactorhavale.mostCurrent._lblnamemoshtari,"lblShomareFactor",act_rizefactorhavale.mostCurrent._lblshomarefactor,"lblShomareHavale",act_rizefactorhavale.mostCurrent._lblshomarehavale,"LblTakhfifKala",act_rizefactorhavale.mostCurrent._lbltakhfifkala,"LblTotalFaktor2",act_rizefactorhavale.mostCurrent._lbltotalfaktor2,"LblVaziat",act_rizefactorhavale.mostCurrent._lblvaziat,"Listkala",act_rizefactorhavale.mostCurrent._listkala,"loc",act_rizefactorhavale.mostCurrent._loc,"LocationF",act_rizefactorhavale.mostCurrent._locationf,"LocationRequest",act_rizefactorhavale.mostCurrent._locationrequest,"LocationResult",act_rizefactorhavale.mostCurrent._locationresult,"mablaghFinal",act_rizefactorhavale.mostCurrent._mablaghfinal,"Main",Debug.moduleToString(ir.parsikhesab.pakhsh.main.class),"MapFragment1",act_rizefactorhavale.mostCurrent._mapfragment1,"MCode",Debug.moduleToString(ir.parsikhesab.pakhsh.mcode.class),"MDatabase",Debug.moduleToString(ir.parsikhesab.pakhsh.mdatabase.class),"myCode",Debug.moduleToString(ir.parsikhesab.pakhsh.mycode.class),"MyReceiver",Debug.moduleToString(ir.parsikhesab.pakhsh.myreceiver.class),"NameMoshtari",act_rizefactorhavale._namemoshtari,"newinst2",Debug.moduleToString(ir.parsikhesab.pakhsh.newinst2.class),"PermissionsManager",act_rizefactorhavale.mostCurrent._permissionsmanager,"PnlTable",act_rizefactorhavale.mostCurrent._pnltable,"Priority",act_rizefactorhavale.mostCurrent._priority,"rp",act_rizefactorhavale.mostCurrent._rp,"Service_Gps",Debug.moduleToString(ir.parsikhesab.pakhsh.service_gps.class),"Service_Helper",Debug.moduleToString(ir.parsikhesab.pakhsh.service_helper.class),"Service_Notification",Debug.moduleToString(ir.parsikhesab.pakhsh.service_notification.class),"Service_Server",Debug.moduleToString(ir.parsikhesab.pakhsh.service_server.class),"ShomareFaktor",act_rizefactorhavale._shomarefaktor,"ShomareHavale",act_rizefactorhavale._shomarehavale,"SignatureCapture",Debug.moduleToString(ir.parsikhesab.pakhsh.signaturecapture.class),"Starter",Debug.moduleToString(ir.parsikhesab.pakhsh.starter.class),"t1",act_rizefactorhavale._t1,"Table1",act_rizefactorhavale.mostCurrent._table1,"Tracker",Debug.moduleToString(ir.parsikhesab.pakhsh.tracker.class),"TxtSharhFaktor",act_rizefactorhavale.mostCurrent._txtsharhfaktor,"Vaziat",act_rizefactorhavale.mostCurrent._vaziat,"Wiget_Service",Debug.moduleToString(ir.parsikhesab.pakhsh.wiget_service.class),"XmlViewEx",Debug.moduleToString(ir.parsikhesab.pakhsh.xmlviewex.class),"XUIViewsUtils",Debug.moduleToString(ir.parsikhesab.pakhsh.xuiviewsutils.class)};
}
}