
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

public class act_newashkhas implements IRemote{
	public static act_newashkhas mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public act_newashkhas() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("act_newashkhas"), "ir.parsikhesab.pakhsh.act_newashkhas");
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
		pcBA = new PCBA(this, act_newashkhas.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _gps1 = RemoteObject.declareNull("anywheresoftware.b4a.gps.GPS");
public static RemoteObject _t1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _shakhs = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistashkhas");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _txtname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txttell = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtmob = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtaddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnsavenewmoshtari = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lat = RemoteObject.createImmutable("");
public static RemoteObject _lon = RemoteObject.createImmutable("");
public static RemoteObject _chgps = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _key = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _txtshomarehesab = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtlat = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtlon = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtc_meli = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnnewnumber = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlspcity = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _nicespinner = RemoteObject.declareNull("nicespinnerwrapper.niceSpinnerWrapper");
public static RemoteObject _nicespinner1 = RemoteObject.declareNull("nicespinnerwrapper.niceSpinnerWrapper");
public static RemoteObject _b4xcombobox1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xcombobox");
public static RemoteObject _b4xcombobox2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xcombobox");
public static RemoteObject _listgoroohashkhas1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _originallistgoroohashkhas1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listgoroohashkhas2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _originallistgoroohashkhas2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _groupcodeselect = RemoteObject.createImmutable(0L);
public static RemoteObject _groupnameselect = RemoteObject.createImmutable("");
public static RemoteObject _gmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
public static RemoteObject _mapfragment1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper");
public static RemoteObject _txtc_posti = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _loc = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");
public static RemoteObject _pnlspgroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lstgroup1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstgroup2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstsearchgroup1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstsearchgroup2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstselectedcodegroupashkhas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _groupcodeselect1 = RemoteObject.createImmutable("");
public static RemoteObject _groupnameselect1 = RemoteObject.createImmutable("");
public static RemoteObject _groupcodeselect2 = RemoteObject.createImmutable("");
public static RemoteObject _groupnameselect2 = RemoteObject.createImmutable("");
public static RemoteObject _indexgroup1 = RemoteObject.createImmutable(0);
public static RemoteObject _indexgroup2 = RemoteObject.createImmutable(0);
public static RemoteObject _lbltitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _typeselectgroup = RemoteObject.createImmutable("");
public static RemoteObject _txtcodemostari = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _searchtemplate1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xsearchtemplate");
public static RemoteObject _searchtemplate2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xsearchtemplate");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dialog = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xdialog");
public static RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _fused = RemoteObject.declareNull("igolub.fused.b4a.location.FusedLocationProviderClientWrapper");
public static RemoteObject _btnsearchgroup1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnsearchgroup2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _querysearch1 = RemoteObject.createImmutable("");
public static RemoteObject _querysearch2 = RemoteObject.createImmutable("");
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
  public Object[] GetGlobals() {
		return new Object[] {"Act_Choose_Report",Debug.moduleToString(ir.parsikhesab.pakhsh.act_choose_report.class),"Act_Emza",Debug.moduleToString(ir.parsikhesab.pakhsh.act_emza.class),"Act_HavaleTozie",Debug.moduleToString(ir.parsikhesab.pakhsh.act_havaletozie.class),"Act_ImageSlideShow",Debug.moduleToString(ir.parsikhesab.pakhsh.act_imageslideshow.class),"Act_Kala_listi",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kala_listi.class),"Act_KalaDefault",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kaladefault.class),"Act_KalaPaging",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kalapaging.class),"Act_KalaPaging2",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kalapaging2.class),"Act_LocationMoshtarian",Debug.moduleToString(ir.parsikhesab.pakhsh.act_locationmoshtarian.class),"Act_LocationVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_locationvisitor.class),"Act_Main",Debug.moduleToString(ir.parsikhesab.pakhsh.act_main.class),"Act_Mali",Debug.moduleToString(ir.parsikhesab.pakhsh.act_mali.class),"Act_Moshtarian",Debug.moduleToString(ir.parsikhesab.pakhsh.act_moshtarian.class),"Act_Notif",Debug.moduleToString(ir.parsikhesab.pakhsh.act_notif.class),"Act_PrintMali",Debug.moduleToString(ir.parsikhesab.pakhsh.act_printmali.class),"Act_PrintPic",Debug.moduleToString(ir.parsikhesab.pakhsh.act_printpic.class),"Act_PrintPic2",Debug.moduleToString(ir.parsikhesab.pakhsh.act_printpic2.class),"Act_Profile",Debug.moduleToString(ir.parsikhesab.pakhsh.act_profile.class),"Act_RepFactors",Debug.moduleToString(ir.parsikhesab.pakhsh.act_repfactors.class),"Act_RepFactorVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_repfactorvisitor.class),"Act_ReportRizeBargasht",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportrizebargasht.class),"Act_ReportSoorathesab",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportsoorathesab.class),"Act_ReportVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportvisitor.class),"Act_ReportVisitor2",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportvisitor2.class),"Act_RepRizFactorVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reprizfactorvisitor.class),"Act_Restore",Debug.moduleToString(ir.parsikhesab.pakhsh.act_restore.class),"Act_RizeFactorHavale",Debug.moduleToString(ir.parsikhesab.pakhsh.act_rizefactorhavale.class),"Act_RizFaktor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_rizfaktor.class),"Act_RizHavale",Debug.moduleToString(ir.parsikhesab.pakhsh.act_rizhavale.class),"Act_Sabad",Debug.moduleToString(ir.parsikhesab.pakhsh.act_sabad.class),"Act_SabtMarjooii",Debug.moduleToString(ir.parsikhesab.pakhsh.act_sabtmarjooii.class),"Act_SabtRizCheck",Debug.moduleToString(ir.parsikhesab.pakhsh.act_sabtrizcheck.class),"Act_SaveInfoCompany",Debug.moduleToString(ir.parsikhesab.pakhsh.act_saveinfocompany.class),"Act_SaveLocation",Debug.moduleToString(ir.parsikhesab.pakhsh.act_savelocation.class),"Act_Search",Debug.moduleToString(ir.parsikhesab.pakhsh.act_search.class),"Act_SelectMantage",Debug.moduleToString(ir.parsikhesab.pakhsh.act_selectmantage.class),"Act_SelFaktor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_selfaktor.class),"Act_SendData",Debug.moduleToString(ir.parsikhesab.pakhsh.act_senddata.class),"Act_Setting",Debug.moduleToString(ir.parsikhesab.pakhsh.act_setting.class),"Act_SettingPos",Debug.moduleToString(ir.parsikhesab.pakhsh.act_settingpos.class),"Act_ShowLocation",Debug.moduleToString(ir.parsikhesab.pakhsh.act_showlocation.class),"Act_Support",Debug.moduleToString(ir.parsikhesab.pakhsh.act_support.class),"Act_Ticket",Debug.moduleToString(ir.parsikhesab.pakhsh.act_ticket.class),"Act_Video",Debug.moduleToString(ir.parsikhesab.pakhsh.act_video.class),"Activity",act_newashkhas.mostCurrent._activity,"B4XComboBox1",act_newashkhas.mostCurrent._b4xcombobox1,"B4XComboBox2",act_newashkhas.mostCurrent._b4xcombobox2,"Base",act_newashkhas.mostCurrent._base,"Base64EncodeDecodeImage",Debug.moduleToString(ir.parsikhesab.pakhsh.base64encodedecodeimage.class),"BtnNewNumber",act_newashkhas.mostCurrent._btnnewnumber,"BtnSaveNewMoshtari",act_newashkhas.mostCurrent._btnsavenewmoshtari,"btnSearchGroup1",act_newashkhas.mostCurrent._btnsearchgroup1,"btnSearchGroup2",act_newashkhas.mostCurrent._btnsearchgroup2,"ChGps",act_newashkhas.mostCurrent._chgps,"ClsKala",Debug.moduleToString(ir.parsikhesab.pakhsh.clskala.class),"DateUtils",act_newashkhas.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(ir.parsikhesab.pakhsh.dbutils.class),"Dialog",act_newashkhas.mostCurrent._dialog,"FileProvider",act_newashkhas.mostCurrent._fileprovider,"FirebaseMessaging",Debug.moduleToString(ir.parsikhesab.pakhsh.firebasemessaging.class),"Fused",act_newashkhas.mostCurrent._fused,"FusedLocationService",Debug.moduleToString(ir.parsikhesab.pakhsh.fusedlocationservice.class),"GeoService",Debug.moduleToString(ir.parsikhesab.pakhsh.geoservice.class),"gmap",act_newashkhas.mostCurrent._gmap,"GPS1",act_newashkhas._gps1,"GpsWiget",Debug.moduleToString(ir.parsikhesab.pakhsh.gpswiget.class),"Granularity",act_newashkhas.mostCurrent._granularity,"GroupCodeSelect",act_newashkhas._groupcodeselect,"GroupCodeSelect1",act_newashkhas.mostCurrent._groupcodeselect1,"GroupCodeSelect2",act_newashkhas.mostCurrent._groupcodeselect2,"GroupNameSelect",act_newashkhas.mostCurrent._groupnameselect,"GroupNameSelect1",act_newashkhas.mostCurrent._groupnameselect1,"GroupNameSelect2",act_newashkhas.mostCurrent._groupnameselect2,"HttpUtils2Service",Debug.moduleToString(ir.parsikhesab.pakhsh.httputils2service.class),"ImageDownloader",Debug.moduleToString(ir.parsikhesab.pakhsh.imagedownloader.class),"IndexGroup1",act_newashkhas._indexgroup1,"IndexGroup2",act_newashkhas._indexgroup2,"Key",act_newashkhas.mostCurrent._key,"Lat",act_newashkhas.mostCurrent._lat,"lblTitle",act_newashkhas.mostCurrent._lbltitle,"ListGoroohAshkhas1",act_newashkhas.mostCurrent._listgoroohashkhas1,"ListGoroohAshkhas2",act_newashkhas.mostCurrent._listgoroohashkhas2,"loc",act_newashkhas.mostCurrent._loc,"LocationF",act_newashkhas.mostCurrent._locationf,"LocationRequest",act_newashkhas.mostCurrent._locationrequest,"LocationResult",act_newashkhas.mostCurrent._locationresult,"Lon",act_newashkhas.mostCurrent._lon,"lstGroup1",act_newashkhas.mostCurrent._lstgroup1,"lstGroup2",act_newashkhas.mostCurrent._lstgroup2,"lstSearchGroup1",act_newashkhas.mostCurrent._lstsearchgroup1,"lstSearchGroup2",act_newashkhas.mostCurrent._lstsearchgroup2,"lstSelectedCodeGroupAshkhas",act_newashkhas.mostCurrent._lstselectedcodegroupashkhas,"Main",Debug.moduleToString(ir.parsikhesab.pakhsh.main.class),"MapFragment1",act_newashkhas.mostCurrent._mapfragment1,"MCode",Debug.moduleToString(ir.parsikhesab.pakhsh.mcode.class),"MDatabase",Debug.moduleToString(ir.parsikhesab.pakhsh.mdatabase.class),"myCode",Debug.moduleToString(ir.parsikhesab.pakhsh.mycode.class),"MyReceiver",Debug.moduleToString(ir.parsikhesab.pakhsh.myreceiver.class),"newinst2",Debug.moduleToString(ir.parsikhesab.pakhsh.newinst2.class),"NiceSpinner",act_newashkhas.mostCurrent._nicespinner,"NiceSpinner1",act_newashkhas.mostCurrent._nicespinner1,"OriginalListGoroohAshkhas1",act_newashkhas.mostCurrent._originallistgoroohashkhas1,"OriginalListGoroohAshkhas2",act_newashkhas.mostCurrent._originallistgoroohashkhas2,"Panel1",act_newashkhas.mostCurrent._panel1,"PermissionsManager",act_newashkhas.mostCurrent._permissionsmanager,"PnlSpCity",act_newashkhas.mostCurrent._pnlspcity,"PnlSpGroup",act_newashkhas.mostCurrent._pnlspgroup,"Priority",act_newashkhas.mostCurrent._priority,"querySearch1",act_newashkhas.mostCurrent._querysearch1,"querySearch2",act_newashkhas.mostCurrent._querysearch2,"rp",act_newashkhas.mostCurrent._rp,"SearchTemplate1",act_newashkhas.mostCurrent._searchtemplate1,"SearchTemplate2",act_newashkhas.mostCurrent._searchtemplate2,"Service_Gps",Debug.moduleToString(ir.parsikhesab.pakhsh.service_gps.class),"Service_Helper",Debug.moduleToString(ir.parsikhesab.pakhsh.service_helper.class),"Service_Notification",Debug.moduleToString(ir.parsikhesab.pakhsh.service_notification.class),"Service_Server",Debug.moduleToString(ir.parsikhesab.pakhsh.service_server.class),"shakhs",act_newashkhas._shakhs,"SignatureCapture",Debug.moduleToString(ir.parsikhesab.pakhsh.signaturecapture.class),"Starter",Debug.moduleToString(ir.parsikhesab.pakhsh.starter.class),"t1",act_newashkhas._t1,"Tracker",Debug.moduleToString(ir.parsikhesab.pakhsh.tracker.class),"TxtAddress",act_newashkhas.mostCurrent._txtaddress,"TxtC_Meli",act_newashkhas.mostCurrent._txtc_meli,"TxtC_Posti",act_newashkhas.mostCurrent._txtc_posti,"TxtCodeMostari",act_newashkhas.mostCurrent._txtcodemostari,"TxtLat",act_newashkhas.mostCurrent._txtlat,"TxtLon",act_newashkhas.mostCurrent._txtlon,"TxtMob",act_newashkhas.mostCurrent._txtmob,"TxtName",act_newashkhas.mostCurrent._txtname,"TxtShomarehesab",act_newashkhas.mostCurrent._txtshomarehesab,"TxtTell",act_newashkhas.mostCurrent._txttell,"TypeSelectGroup",act_newashkhas.mostCurrent._typeselectgroup,"Wiget_Service",Debug.moduleToString(ir.parsikhesab.pakhsh.wiget_service.class),"XmlViewEx",Debug.moduleToString(ir.parsikhesab.pakhsh.xmlviewex.class),"XUI",act_newashkhas.mostCurrent._xui,"XUIViewsUtils",Debug.moduleToString(ir.parsikhesab.pakhsh.xuiviewsutils.class)};
}
}