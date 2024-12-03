
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

public class act_mali implements IRemote{
	public static act_mali mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public act_mali() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("act_mali"), "ir.parsikhesab.pakhsh.act_mali");
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
		pcBA = new PCBA(this, act_mali.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ion = RemoteObject.declareNull("Object");
public static RemoteObject _shomarefactor = RemoteObject.createImmutable("");
public static RemoteObject _codemoshtari = RemoteObject.createImmutable("");
public static RemoteObject _namemoshtari = RemoteObject.createImmutable("");
public static RemoteObject _shomaretell = RemoteObject.createImmutable("");
public static RemoteObject _mabalghghablepardakht = RemoteObject.createImmutable("");
public static RemoteObject _mabalghkolfactor = RemoteObject.createImmutable("");
public static RemoteObject _shomarehavale = RemoteObject.createImmutable("");
public static RemoteObject _issend = RemoteObject.createImmutable(false);
public static RemoteObject _nsn_bankd = RemoteObject.declareNull("hitex.nice.spinner.Hitex_NiceSpinner");
public static RemoteObject _nsn_sandooghd = RemoteObject.declareNull("hitex.nice.spinner.Hitex_NiceSpinner");
public static RemoteObject _hlv = RemoteObject.declareNull("wir.hitex.recycler.Hitex_LayoutView");
public static RemoteObject _key = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _err = RemoteObject.createImmutable(0);
public static RemoteObject _datecheck = RemoteObject.createImmutable("");
public static RemoteObject _txtshomarecheckd = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btndatecheckd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnsaved = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _txtchanged = RemoteObject.createImmutable(false);
public static RemoteObject _listtarakonesh = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lblshomarecheckd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldatecheckd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbln_bankd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlndaryaft = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnl_hlv = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lastmablag = RemoteObject.createImmutable("");
public static RemoteObject _lbldaryaft = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlnsandoogh = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _txtmablaghnaghdi = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblshomaredaryaft = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblshomarefactor = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblghabelepardakht = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlnaghdi = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlbanki = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlchecki = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _txtsharhnaghdi = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblsharhnaghdi = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblnsandoogh = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmablaghnaghdi = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblnbank = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txtsharhbanki = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblsharhbanki = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txtmablaghchecki = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtsharhchecki = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtdarsadtakhfif = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtmablaghtakhfif = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtsharhtakhfif = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblsharhtakhfif = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmablaghtakhfif = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldarsadtakhfif = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmablaghchecki = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnrizchecki = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblsharhchecki = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txtmablaghbanki = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _pnlnbank = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _c1 = RemoteObject.createImmutable(0);
public static RemoteObject _c2 = RemoteObject.createImmutable(0);
public static RemoteObject _c3 = RemoteObject.createImmutable(0);
public static RemoteObject _c4 = RemoteObject.createImmutable(0);
public static RemoteObject _mablaghdaryafti = RemoteObject.createImmutable(0L);
public static RemoteObject _mablaghtakhfif = RemoteObject.createImmutable(0L);
public static RemoteObject _query = RemoteObject.createImmutable("");
public static RemoteObject _daryaftmode = RemoteObject.createImmutable("");
public static RemoteObject _shomarhdaryafti = RemoteObject.createImmutable(0);
public static RemoteObject _radif = RemoteObject.createImmutable(0);
public static RemoteObject _countdaryaft = RemoteObject.createImmutable(0);
public static RemoteObject _countradif = RemoteObject.createImmutable(0);
public static RemoteObject _lstcodesandogh = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _codesandogh = RemoteObject.createImmutable("");
public static RemoteObject _namesandogh = RemoteObject.createImmutable("");
public static RemoteObject _lstcodebank1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _codebank1 = RemoteObject.createImmutable("");
public static RemoteObject _namebank1 = RemoteObject.createImmutable("");
public static RemoteObject _tab1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _pnltakhfif = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblmablaghkoldaryafti = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmablaghmande = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _id1 = RemoteObject.createImmutable("");
public static RemoteObject _id2 = RemoteObject.createImmutable("");
public static RemoteObject _id3 = RemoteObject.createImmutable("");
public static RemoteObject _id4 = RemoteObject.createImmutable("");
public static RemoteObject _lblcodemoshtari = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblnamemoshtari = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lstcheck = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lblmablaghkolfactor = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmablaghkoltakhfif = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btn_delete = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_sendinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_print = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _txtsharhkol = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnnew = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnbacktrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnnexttrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listdaryaft = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _current = RemoteObject.createImmutable(0);
public static RemoteObject _isnew = RemoteObject.createImmutable(false);
public static RemoteObject _btnpaymentcard = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
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
  public Object[] GetGlobals() {
		return new Object[] {"Act_Choose_Report",Debug.moduleToString(ir.parsikhesab.pakhsh.act_choose_report.class),"Act_Emza",Debug.moduleToString(ir.parsikhesab.pakhsh.act_emza.class),"Act_HavaleTozie",Debug.moduleToString(ir.parsikhesab.pakhsh.act_havaletozie.class),"Act_ImageSlideShow",Debug.moduleToString(ir.parsikhesab.pakhsh.act_imageslideshow.class),"Act_Kala_listi",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kala_listi.class),"Act_KalaDefault",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kaladefault.class),"Act_KalaPaging",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kalapaging.class),"Act_KalaPaging2",Debug.moduleToString(ir.parsikhesab.pakhsh.act_kalapaging2.class),"Act_LocationMoshtarian",Debug.moduleToString(ir.parsikhesab.pakhsh.act_locationmoshtarian.class),"Act_LocationVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_locationvisitor.class),"Act_Main",Debug.moduleToString(ir.parsikhesab.pakhsh.act_main.class),"Act_Moshtarian",Debug.moduleToString(ir.parsikhesab.pakhsh.act_moshtarian.class),"Act_NewAshkhas",Debug.moduleToString(ir.parsikhesab.pakhsh.act_newashkhas.class),"Act_Notif",Debug.moduleToString(ir.parsikhesab.pakhsh.act_notif.class),"Act_PrintMali",Debug.moduleToString(ir.parsikhesab.pakhsh.act_printmali.class),"Act_PrintPic",Debug.moduleToString(ir.parsikhesab.pakhsh.act_printpic.class),"Act_PrintPic2",Debug.moduleToString(ir.parsikhesab.pakhsh.act_printpic2.class),"Act_Profile",Debug.moduleToString(ir.parsikhesab.pakhsh.act_profile.class),"Act_RepFactors",Debug.moduleToString(ir.parsikhesab.pakhsh.act_repfactors.class),"Act_RepFactorVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_repfactorvisitor.class),"Act_ReportRizeBargasht",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportrizebargasht.class),"Act_ReportSoorathesab",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportsoorathesab.class),"Act_ReportVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportvisitor.class),"Act_ReportVisitor2",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reportvisitor2.class),"Act_RepRizFactorVisitor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_reprizfactorvisitor.class),"Act_Restore",Debug.moduleToString(ir.parsikhesab.pakhsh.act_restore.class),"Act_RizeFactorHavale",Debug.moduleToString(ir.parsikhesab.pakhsh.act_rizefactorhavale.class),"Act_RizFaktor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_rizfaktor.class),"Act_RizHavale",Debug.moduleToString(ir.parsikhesab.pakhsh.act_rizhavale.class),"Act_Sabad",Debug.moduleToString(ir.parsikhesab.pakhsh.act_sabad.class),"Act_SabtMarjooii",Debug.moduleToString(ir.parsikhesab.pakhsh.act_sabtmarjooii.class),"Act_SabtRizCheck",Debug.moduleToString(ir.parsikhesab.pakhsh.act_sabtrizcheck.class),"Act_SaveInfoCompany",Debug.moduleToString(ir.parsikhesab.pakhsh.act_saveinfocompany.class),"Act_SaveLocation",Debug.moduleToString(ir.parsikhesab.pakhsh.act_savelocation.class),"Act_Search",Debug.moduleToString(ir.parsikhesab.pakhsh.act_search.class),"Act_SelectMantage",Debug.moduleToString(ir.parsikhesab.pakhsh.act_selectmantage.class),"Act_SelFaktor",Debug.moduleToString(ir.parsikhesab.pakhsh.act_selfaktor.class),"Act_SendData",Debug.moduleToString(ir.parsikhesab.pakhsh.act_senddata.class),"Act_Setting",Debug.moduleToString(ir.parsikhesab.pakhsh.act_setting.class),"Act_SettingPos",Debug.moduleToString(ir.parsikhesab.pakhsh.act_settingpos.class),"Act_ShowLocation",Debug.moduleToString(ir.parsikhesab.pakhsh.act_showlocation.class),"Act_Support",Debug.moduleToString(ir.parsikhesab.pakhsh.act_support.class),"Act_Ticket",Debug.moduleToString(ir.parsikhesab.pakhsh.act_ticket.class),"Act_Video",Debug.moduleToString(ir.parsikhesab.pakhsh.act_video.class),"Activity",act_mali.mostCurrent._activity,"Base64EncodeDecodeImage",Debug.moduleToString(ir.parsikhesab.pakhsh.base64encodedecodeimage.class),"Btn_Delete",act_mali.mostCurrent._btn_delete,"Btn_print",act_mali.mostCurrent._btn_print,"Btn_SendInfo",act_mali.mostCurrent._btn_sendinfo,"btnBackTrack",act_mali.mostCurrent._btnbacktrack,"BtnDateCheckD",act_mali.mostCurrent._btndatecheckd,"btnNew",act_mali.mostCurrent._btnnew,"btnNextTrack",act_mali.mostCurrent._btnnexttrack,"btnPaymentCard",act_mali.mostCurrent._btnpaymentcard,"btnRizChecki",act_mali.mostCurrent._btnrizchecki,"BtnSaveD",act_mali.mostCurrent._btnsaved,"c1",act_mali._c1,"c2",act_mali._c2,"c3",act_mali._c3,"c4",act_mali._c4,"ClsKala",Debug.moduleToString(ir.parsikhesab.pakhsh.clskala.class),"CodeBank1",act_mali.mostCurrent._codebank1,"CodeMoshtari",act_mali._codemoshtari,"CodeSandogh",act_mali.mostCurrent._codesandogh,"CountDaryaft",act_mali._countdaryaft,"CountRadif",act_mali._countradif,"Current",act_mali._current,"DaryaftMode",act_mali.mostCurrent._daryaftmode,"DateCheck",act_mali.mostCurrent._datecheck,"DateUtils",act_mali.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(ir.parsikhesab.pakhsh.dbutils.class),"err",act_mali._err,"FileProvider",act_mali.mostCurrent._fileprovider,"FirebaseMessaging",Debug.moduleToString(ir.parsikhesab.pakhsh.firebasemessaging.class),"FusedLocationService",Debug.moduleToString(ir.parsikhesab.pakhsh.fusedlocationservice.class),"GeoService",Debug.moduleToString(ir.parsikhesab.pakhsh.geoservice.class),"GpsWiget",Debug.moduleToString(ir.parsikhesab.pakhsh.gpswiget.class),"Granularity",act_mali.mostCurrent._granularity,"HLV",act_mali.mostCurrent._hlv,"HttpUtils2Service",Debug.moduleToString(ir.parsikhesab.pakhsh.httputils2service.class),"id1",act_mali.mostCurrent._id1,"id2",act_mali.mostCurrent._id2,"id3",act_mali.mostCurrent._id3,"id4",act_mali.mostCurrent._id4,"ImageDownloader",Debug.moduleToString(ir.parsikhesab.pakhsh.imagedownloader.class),"ion",act_mali._ion,"isnew",act_mali._isnew,"IsSend",act_mali._issend,"Key",act_mali.mostCurrent._key,"lastMablag",act_mali.mostCurrent._lastmablag,"lblCodeMoshtari",act_mali.mostCurrent._lblcodemoshtari,"LblDarsadTakhfif",act_mali.mostCurrent._lbldarsadtakhfif,"lblDaryaft",act_mali.mostCurrent._lbldaryaft,"LblDateCheckD",act_mali.mostCurrent._lbldatecheckd,"LblGHabelePardakht",act_mali.mostCurrent._lblghabelepardakht,"LblMablaghChecki",act_mali.mostCurrent._lblmablaghchecki,"lblMablaghKolDaryafti",act_mali.mostCurrent._lblmablaghkoldaryafti,"LblMablaghKolFactor",act_mali.mostCurrent._lblmablaghkolfactor,"LblMablaghKolTakhfif",act_mali.mostCurrent._lblmablaghkoltakhfif,"lblMablaghMande",act_mali.mostCurrent._lblmablaghmande,"LblMablaghNaghdi",act_mali.mostCurrent._lblmablaghnaghdi,"LblMablaghTakhfif",act_mali.mostCurrent._lblmablaghtakhfif,"LblN_BankD",act_mali.mostCurrent._lbln_bankd,"lblNameMoshtari",act_mali.mostCurrent._lblnamemoshtari,"LblNBank",act_mali.mostCurrent._lblnbank,"LblNSandoogh",act_mali.mostCurrent._lblnsandoogh,"LblSharhBanki",act_mali.mostCurrent._lblsharhbanki,"LblSharhChecki",act_mali.mostCurrent._lblsharhchecki,"LblSharhNaghdi",act_mali.mostCurrent._lblsharhnaghdi,"LblSharhTakhfif",act_mali.mostCurrent._lblsharhtakhfif,"LblShomareCheckD",act_mali.mostCurrent._lblshomarecheckd,"lblShomareDaryaft",act_mali.mostCurrent._lblshomaredaryaft,"lblShomareFactor",act_mali.mostCurrent._lblshomarefactor,"ListDaryaft",act_mali.mostCurrent._listdaryaft,"ListTarakonesh",act_mali.mostCurrent._listtarakonesh,"LocationF",act_mali.mostCurrent._locationf,"LocationRequest",act_mali.mostCurrent._locationrequest,"LocationResult",act_mali.mostCurrent._locationresult,"lstCheck",act_mali.mostCurrent._lstcheck,"lstCodeBank1",act_mali.mostCurrent._lstcodebank1,"lstCodeSandogh",act_mali.mostCurrent._lstcodesandogh,"MabalghGhablepardakht",act_mali._mabalghghablepardakht,"MabalghKolFactor",act_mali._mabalghkolfactor,"MablaghDaryafti",act_mali._mablaghdaryafti,"MablaghTakhfif",act_mali._mablaghtakhfif,"Main",Debug.moduleToString(ir.parsikhesab.pakhsh.main.class),"MCode",Debug.moduleToString(ir.parsikhesab.pakhsh.mcode.class),"MDatabase",Debug.moduleToString(ir.parsikhesab.pakhsh.mdatabase.class),"myCode",Debug.moduleToString(ir.parsikhesab.pakhsh.mycode.class),"MyReceiver",Debug.moduleToString(ir.parsikhesab.pakhsh.myreceiver.class),"NameBank1",act_mali.mostCurrent._namebank1,"NameMoshtari",act_mali._namemoshtari,"NameSandogh",act_mali.mostCurrent._namesandogh,"newinst2",Debug.moduleToString(ir.parsikhesab.pakhsh.newinst2.class),"NSN_BankD",act_mali.mostCurrent._nsn_bankd,"NSN_SandooghD",act_mali.mostCurrent._nsn_sandooghd,"PermissionsManager",act_mali.mostCurrent._permissionsmanager,"pnl_Hlv",act_mali.mostCurrent._pnl_hlv,"PnlBanki",act_mali.mostCurrent._pnlbanki,"PnlChecki",act_mali.mostCurrent._pnlchecki,"PnlNaghdi",act_mali.mostCurrent._pnlnaghdi,"PnlNBank",act_mali.mostCurrent._pnlnbank,"pnlNDaryaft",act_mali.mostCurrent._pnlndaryaft,"pnlNSandoogh",act_mali.mostCurrent._pnlnsandoogh,"PnlTakhfif",act_mali.mostCurrent._pnltakhfif,"Priority",act_mali.mostCurrent._priority,"Query",act_mali.mostCurrent._query,"Radif",act_mali._radif,"Service_Gps",Debug.moduleToString(ir.parsikhesab.pakhsh.service_gps.class),"Service_Helper",Debug.moduleToString(ir.parsikhesab.pakhsh.service_helper.class),"Service_Notification",Debug.moduleToString(ir.parsikhesab.pakhsh.service_notification.class),"Service_Server",Debug.moduleToString(ir.parsikhesab.pakhsh.service_server.class),"ShomareFactor",act_mali._shomarefactor,"ShomareHavale",act_mali._shomarehavale,"ShomareTell",act_mali._shomaretell,"ShomarhDaryafti",act_mali._shomarhdaryafti,"SignatureCapture",Debug.moduleToString(ir.parsikhesab.pakhsh.signaturecapture.class),"Starter",Debug.moduleToString(ir.parsikhesab.pakhsh.starter.class),"Tab1",act_mali.mostCurrent._tab1,"Tracker",Debug.moduleToString(ir.parsikhesab.pakhsh.tracker.class),"txtchanged",act_mali._txtchanged,"TxtDarsadTakhfif",act_mali.mostCurrent._txtdarsadtakhfif,"TxtMablaghBanki",act_mali.mostCurrent._txtmablaghbanki,"TxtMablaghChecki",act_mali.mostCurrent._txtmablaghchecki,"TxtMablaghNaghdi",act_mali.mostCurrent._txtmablaghnaghdi,"TxtMablaghTakhfif",act_mali.mostCurrent._txtmablaghtakhfif,"TxtSharhBanki",act_mali.mostCurrent._txtsharhbanki,"TxtSharhChecki",act_mali.mostCurrent._txtsharhchecki,"TxtSharhKol",act_mali.mostCurrent._txtsharhkol,"TxtSharhNaghdi",act_mali.mostCurrent._txtsharhnaghdi,"TxtSharhTakhfif",act_mali.mostCurrent._txtsharhtakhfif,"TxtShomareCheckD",act_mali.mostCurrent._txtshomarecheckd,"Wiget_Service",Debug.moduleToString(ir.parsikhesab.pakhsh.wiget_service.class),"XmlViewEx",Debug.moduleToString(ir.parsikhesab.pakhsh.xmlviewex.class),"XUIViewsUtils",Debug.moduleToString(ir.parsikhesab.pakhsh.xuiviewsutils.class)};
}
}