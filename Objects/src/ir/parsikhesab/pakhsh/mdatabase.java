package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mdatabase {
private static mdatabase mostCurrent = new mdatabase();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
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
public static String  _createdatabasenewtable(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "createdatabasenewtable", false))
	 {return ((String) Debug.delegate(null, "createdatabasenewtable", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Sub CreateDataBaseNewTable";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblAshkhasNew'")));
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblAshkhasNew (FldId integer NOT NULL PRIMARY KEY,FldCodeTafzili Text,FldSharheTafzili Text,FldVisitor Text,FldTell Text,FldC_Meli Text,FldC_Posti Text,FldShomarehesab Text,FldAddress Text,FldCodeGroup Text)");
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660811;
 //BA.debugLineNum = 19660811;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGoroohKala'")));
RDebugUtils.currentLine=19660812;
 //BA.debugLineNum = 19660812;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660813;
 //BA.debugLineNum = 19660813;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblGoroohK";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblGoroohKala (FldC_Gorooh Text,FldN_Gorooh Text)");
RDebugUtils.currentLine=19660814;
 //BA.debugLineNum = 19660814;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660815;
 //BA.debugLineNum = 19660815;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660818;
 //BA.debugLineNum = 19660818;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGoroohAshkhas'")));
RDebugUtils.currentLine=19660819;
 //BA.debugLineNum = 19660819;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660820;
 //BA.debugLineNum = 19660820;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblGoroohA";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblGoroohAshkhas (FldC_Gorooh Text,FldN_Gorooh Text)");
RDebugUtils.currentLine=19660821;
 //BA.debugLineNum = 19660821;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660822;
 //BA.debugLineNum = 19660822;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660825;
 //BA.debugLineNum = 19660825;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSooratHesab'")));
RDebugUtils.currentLine=19660826;
 //BA.debugLineNum = 19660826;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660827;
 //BA.debugLineNum = 19660827;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblSooratH";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblSooratHesab (FldId integer NOT NULL PRIMARY KEY,FldCodeTafzili Text,FldSharheTafzili Text,FldShomareFactor Text,FldMandeTalab Text,FldMablagheKolDaryafti Text,FldMandeTasfieNashode Text,FldDateSarResid Text)");
RDebugUtils.currentLine=19660828;
 //BA.debugLineNum = 19660828;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660829;
 //BA.debugLineNum = 19660829;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660832;
 //BA.debugLineNum = 19660832;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblNotifi'")));
RDebugUtils.currentLine=19660833;
 //BA.debugLineNum = 19660833;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660834;
 //BA.debugLineNum = 19660834;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblNotifi";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblNotifi (FldId integer NOT NULL PRIMARY KEY,Id INTEGER,FldTitle Text,FldBody Text,FldDate Text,FldTime Text,FldStatus Text)");
RDebugUtils.currentLine=19660835;
 //BA.debugLineNum = 19660835;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660836;
 //BA.debugLineNum = 19660836;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660841;
 //BA.debugLineNum = 19660841;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblTablighVisitor'")));
RDebugUtils.currentLine=19660842;
 //BA.debugLineNum = 19660842;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660843;
 //BA.debugLineNum = 19660843;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblTabligh";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblTablighVisitor (Id integer NOT NULL PRIMARY KEY,FldTitle Text,FldMessage Text,FldDate Text,FldTime Text,FldVaziat Text,FldLink Text)");
RDebugUtils.currentLine=19660844;
 //BA.debugLineNum = 19660844;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660845;
 //BA.debugLineNum = 19660845;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660849;
 //BA.debugLineNum = 19660849;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblLogVisitSefaresh'")));
RDebugUtils.currentLine=19660850;
 //BA.debugLineNum = 19660850;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660851;
 //BA.debugLineNum = 19660851;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblLogVisi";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblLogVisitSefaresh (FldId INTEGER NOT NULL PRIMARY KEY,FldC_Ashkhas Text,FldVisit Text,FldSefaresh Text,FldElatSefaresh Text,FldLat Text,FldLon Text)");
RDebugUtils.currentLine=19660852;
 //BA.debugLineNum = 19660852;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660853;
 //BA.debugLineNum = 19660853;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660855;
 //BA.debugLineNum = 19660855;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblLastSeen'")));
RDebugUtils.currentLine=19660856;
 //BA.debugLineNum = 19660856;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660857;
 //BA.debugLineNum = 19660857;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblLastSee";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblLastSeen (FldC_Ashkhas Text,LastSeen Text)");
RDebugUtils.currentLine=19660858;
 //BA.debugLineNum = 19660858;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660859;
 //BA.debugLineNum = 19660859;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660862;
 //BA.debugLineNum = 19660862;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblNextVisit'")));
RDebugUtils.currentLine=19660863;
 //BA.debugLineNum = 19660863;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660864;
 //BA.debugLineNum = 19660864;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblNextVis";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblNextVisit (FldC_Ashkhas Text,NextVisitDate Text,NextVisitText Text)");
RDebugUtils.currentLine=19660865;
 //BA.debugLineNum = 19660865;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660866;
 //BA.debugLineNum = 19660866;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660869;
 //BA.debugLineNum = 19660869;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblVisitorTour'")));
RDebugUtils.currentLine=19660870;
 //BA.debugLineNum = 19660870;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660871;
 //BA.debugLineNum = 19660871;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblVisitor";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblVisitorTour (FldId Text,FldC_Ashkhas Text,FldN_Ashkhas Text,FldAddress Text,FldTell Text,FldMob Text,FldC_City Text,FldN_City Text,FldC_Visitor Text,FldVaziat Text,FldEtebar Text,FldMandeHesab Text,FldLat Text,FldLon Text,FldTakhfifVizhe Text,FldTipFee Text,FldC_Visitor1 Text,FldC_Visitor2 Text,FldC_Visitor3 Text,FldC_Visitor4 Text,FldC_Visitor5 Text,FldC_Visitor6 Text,FldC_Visitor7 Text,FldC_Visitor8 Text,FldC_Visitor9 Text,FldLastVisit Text,FldLastSefaresh Text,lastSeen Text,lastOrderDate Text,nextVisitDate Text,nextVisitText Text,visitTourDate Text,visitTourText Text,fldC_Ashkhas_C Text)");
RDebugUtils.currentLine=19660872;
 //BA.debugLineNum = 19660872;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660873;
 //BA.debugLineNum = 19660873;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660876;
 //BA.debugLineNum = 19660876;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGalleryPic'")));
RDebugUtils.currentLine=19660877;
 //BA.debugLineNum = 19660877;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660878;
 //BA.debugLineNum = 19660878;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblGallery";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblGalleryPic (Id integer NOT NULL PRIMARY KEY,fldCodeKala Text,fldImageNumber Text,fldImage Text,fldShow Text)");
RDebugUtils.currentLine=19660879;
 //BA.debugLineNum = 19660879;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660880;
 //BA.debugLineNum = 19660880;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660883;
 //BA.debugLineNum = 19660883;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionVisitori'")));
RDebugUtils.currentLine=19660884;
 //BA.debugLineNum = 19660884;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660885;
 //BA.debugLineNum = 19660885;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblEshanti";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table tblEshantionVisitori(Id integer NOT NULL PRIMARY KEY,fldCodeKala Text,fldVahed Text,fldTedadEshantion Text,fldCountForoosh Text,fldVaziat Text)");
RDebugUtils.currentLine=19660886;
 //BA.debugLineNum = 19660886;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660887;
 //BA.debugLineNum = 19660887;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660890;
 //BA.debugLineNum = 19660890;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionTabaghati'")));
RDebugUtils.currentLine=19660891;
 //BA.debugLineNum = 19660891;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660892;
 //BA.debugLineNum = 19660892;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblEshanti";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table tblEshantionTabaghati(ID integer NOT NULL PRIMARY KEY,fldCodeKalaForoosh Text,fldShomareTabaghe Text,fldTedadForoosh Text,fldCodeKalaEshantion Text,fldTedadEshantion Text)");
RDebugUtils.currentLine=19660893;
 //BA.debugLineNum = 19660893;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660894;
 //BA.debugLineNum = 19660894;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660897;
 //BA.debugLineNum = 19660897;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionGroup'")));
RDebugUtils.currentLine=19660898;
 //BA.debugLineNum = 19660898;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660899;
 //BA.debugLineNum = 19660899;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblEshanti";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table tblEshantionGroup(ID integer NOT NULL PRIMARY KEY,fldCodeGroupKala Text,fldShomareTabaghe Text,fldTedadForoosh Text,fldCodeGroupKalaEshantion Text,fldTedadEshantion Text)");
RDebugUtils.currentLine=19660900;
 //BA.debugLineNum = 19660900;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660901;
 //BA.debugLineNum = 19660901;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660904;
 //BA.debugLineNum = 19660904;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionGroupTemp'")));
RDebugUtils.currentLine=19660905;
 //BA.debugLineNum = 19660905;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660906;
 //BA.debugLineNum = 19660906;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblEshanti";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table tblEshantionGroupTemp(fldCodeGroupKala Text,fldCodeGroupKalaEshantion Text,fldTedadEshantion Text)");
RDebugUtils.currentLine=19660907;
 //BA.debugLineNum = 19660907;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660908;
 //BA.debugLineNum = 19660908;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660911;
 //BA.debugLineNum = 19660911;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblVisitor'")));
RDebugUtils.currentLine=19660912;
 //BA.debugLineNum = 19660912;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660913;
 //BA.debugLineNum = 19660913;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblVisitor";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblVisitor (FldC_Visitor Text,FldN_Visitor Text)");
RDebugUtils.currentLine=19660914;
 //BA.debugLineNum = 19660914;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660915;
 //BA.debugLineNum = 19660915;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660917;
 //BA.debugLineNum = 19660917;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSabt'")));
RDebugUtils.currentLine=19660918;
 //BA.debugLineNum = 19660918;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660919;
 //BA.debugLineNum = 19660919;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblSabt (F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblSabt (FldShomareSabt Text,FldC_Visitor Text,FldN_Visitor Text,FldC_Ashkhas Text,FldType Text,FldNoe Text,FldMablagh Text,FldShomareCheck Text,FldDateCheck Text,FldBankName Text,FldDateSabt Text)");
RDebugUtils.currentLine=19660920;
 //BA.debugLineNum = 19660920;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660921;
 //BA.debugLineNum = 19660921;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660923;
 //BA.debugLineNum = 19660923;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblHavale'")));
RDebugUtils.currentLine=19660924;
 //BA.debugLineNum = 19660924;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660925;
 //BA.debugLineNum = 19660925;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblHavale";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblHavale (fldShomareHavale Text,fldDate Text,fldVaziat int,fldMandeFactor Text,fldCountFactor Text)");
RDebugUtils.currentLine=19660926;
 //BA.debugLineNum = 19660926;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660927;
 //BA.debugLineNum = 19660927;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660929;
 //BA.debugLineNum = 19660929;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblRizFactorHavale'")));
RDebugUtils.currentLine=19660930;
 //BA.debugLineNum = 19660930;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660931;
 //BA.debugLineNum = 19660931;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblRizFact";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblRizFactorHavale (fldShomareFactor text,fldShomareHavale text,fldShomareSanad text,fldCodeAnbar text,fldRadif text,fldCodeKala text,fldSharhKala text,fldCodeTafzili text,fldSharhTafzili text,fldTedadCarton text,fldTedadJoz text,fldFeeJoz text,fldFeeYekCarton text,fldFeeKol text,fldDarsadTakhfif,fldMablaghTakhfif text,fldArzeshAfzode text,fldMablaghKhales text,fldNameCompany text,fldC_Ranandeh text,fldN_Ranandeh text,fldAddress text,fldTell text,fldCodeVasete text,fldDateFactor text,fldDate text,fldTime text,fldLat text,fldLon text,fldMandeTalab text,fldMablagheKolDaryafti text,fldMandeTasfieNashode text,fldDateSarResid text,fldVaziat int,fldDateTahvil text,fldTimeTahvil text,fldSignature text,fldSharhFactor text)");
RDebugUtils.currentLine=19660932;
 //BA.debugLineNum = 19660932;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660933;
 //BA.debugLineNum = 19660933;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660936;
 //BA.debugLineNum = 19660936;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblBankMa'")));
RDebugUtils.currentLine=19660937;
 //BA.debugLineNum = 19660937;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660938;
 //BA.debugLineNum = 19660938;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblBankMa";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblBankMa (fldCodeBank text,fldNameBank text)");
RDebugUtils.currentLine=19660939;
 //BA.debugLineNum = 19660939;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660940;
 //BA.debugLineNum = 19660940;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660943;
 //BA.debugLineNum = 19660943;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblBankMoshtari'")));
RDebugUtils.currentLine=19660944;
 //BA.debugLineNum = 19660944;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660945;
 //BA.debugLineNum = 19660945;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblBankMos";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblBankMoshtari (fldCodeBank text,fldNameBank text)");
RDebugUtils.currentLine=19660946;
 //BA.debugLineNum = 19660946;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660947;
 //BA.debugLineNum = 19660947;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660950;
 //BA.debugLineNum = 19660950;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSandoogh'")));
RDebugUtils.currentLine=19660951;
 //BA.debugLineNum = 19660951;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660952;
 //BA.debugLineNum = 19660952;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblSandoog";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblSandoogh (fldCodeSandoogh text,fldNameSandoogh text)");
RDebugUtils.currentLine=19660953;
 //BA.debugLineNum = 19660953;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660954;
 //BA.debugLineNum = 19660954;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660958;
 //BA.debugLineNum = 19660958;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblDaryaft'")));
RDebugUtils.currentLine=19660959;
 //BA.debugLineNum = 19660959;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660960;
 //BA.debugLineNum = 19660960;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblDaryaft";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblDaryaft (ID integer NOT NULL PRIMARY KEY,fldShomareDaryaft Text,fldMablaghDaryafti Text,fldShomareFactor Text,fldShomareSanad Text,fldCodeTafzili Text,fldSharh Text,fldCodeVaste Text,fldCodeSandoogh Text,fldCodeBank Text,fldType Text,FldRadif Text,FldDateDaryaft Text,FldShomareDaryaftReal Text,FldShomareCheck Text,FldDarsadTakhfif Text,FldMablaghTakhfif Text,fldSharhKol Text,fldSend Text)");
RDebugUtils.currentLine=19660961;
 //BA.debugLineNum = 19660961;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660962;
 //BA.debugLineNum = 19660962;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660965;
 //BA.debugLineNum = 19660965;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblCheckDaryafti'")));
RDebugUtils.currentLine=19660966;
 //BA.debugLineNum = 19660966;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660967;
 //BA.debugLineNum = 19660967;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblCheckDa";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblCheckDaryafti (ID integer NOT NULL PRIMARY KEY,fldShomareCheck Text,fldShomareHesab Text,fldDate Text,fldDateSarResid Text,fldCodeBank Text,fldShobe Text,fldMablagh Text,fldCodeSahebeCheck Text,fldShomareDaryaft Text,fldNameBank Text,fldNameSahebeCheck Text,fldShomareFactor Text,fldSharh Text,fldSend Text,fldCodeVaste Text)");
RDebugUtils.currentLine=19660968;
 //BA.debugLineNum = 19660968;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660969;
 //BA.debugLineNum = 19660969;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660972;
 //BA.debugLineNum = 19660972;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblEnterExitVisitor'")));
RDebugUtils.currentLine=19660973;
 //BA.debugLineNum = 19660973;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660974;
 //BA.debugLineNum = 19660974;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblEnterEx";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblEnterExitVisitor (ID integer NOT NULL PRIMARY KEY,fldType Text,fldDate Text,fldTime Text,fldLat Text,fldLon Text,fldSend Text)");
RDebugUtils.currentLine=19660975;
 //BA.debugLineNum = 19660975;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660976;
 //BA.debugLineNum = 19660976;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660979;
 //BA.debugLineNum = 19660979;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSettingPos'")));
RDebugUtils.currentLine=19660980;
 //BA.debugLineNum = 19660980;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660981;
 //BA.debugLineNum = 19660981;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table TblSettingPos (ID integer NOT NULL PRIMARY KEY,fldPosName Text,fldCompanyName Text,fldAMOUNT Text,fldSignCode Text,fldAdditionalData Text)");
RDebugUtils.currentLine=19660982;
 //BA.debugLineNum = 19660982;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660983;
 //BA.debugLineNum = 19660983;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660986;
 //BA.debugLineNum = 19660986;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblDaftarcheTell'")));
RDebugUtils.currentLine=19660987;
 //BA.debugLineNum = 19660987;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660988;
 //BA.debugLineNum = 19660988;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblDaftarc";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table tblDaftarcheTell (fldIdDaftarche integer NOT NULL PRIMARY KEY,fldCodeTafzili Text,fldName Text,fldShomare Text)");
RDebugUtils.currentLine=19660989;
 //BA.debugLineNum = 19660989;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660990;
 //BA.debugLineNum = 19660990;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19660993;
 //BA.debugLineNum = 19660993;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblGroupDastrasi'")));
RDebugUtils.currentLine=19660994;
 //BA.debugLineNum = 19660994;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19660995;
 //BA.debugLineNum = 19660995;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblGroupDa";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table tblGroupDastrasi (ID integer NOT NULL PRIMARY KEY,fldCodeGroup Text)");
RDebugUtils.currentLine=19660996;
 //BA.debugLineNum = 19660996;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19660997;
 //BA.debugLineNum = 19660997;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19661000;
 //BA.debugLineNum = 19661000;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblTourVisitor'")));
RDebugUtils.currentLine=19661001;
 //BA.debugLineNum = 19661001;BA.debugLine="If Cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=19661002;
 //BA.debugLineNum = 19661002;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblTourVis";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Create Table tblTourVisitor (ID integer NOT NULL PRIMARY KEY,fldRadif int,fldCodeSuperVisor Text,fldCodeVisitor Text,fldCodeGroup Text,fldCodeTafzili Text,fldSharheTafzili Text,fldDate Text,fldDateVisit Text,fldTimeVisit Text,fldDateNextVisit Text,fldDateTozie Text,fldShomareSefaresh Text,fldTimeSefaresh Text,fldSharh Text,fldVaziat Text,fldShomareFactor Text,fldType Text,fldSend Text)");
RDebugUtils.currentLine=19661003;
 //BA.debugLineNum = 19661003;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19661004;
 //BA.debugLineNum = 19661004;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19661006;
 //BA.debugLineNum = 19661006;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabasesetting(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "updatedatabasesetting", false))
	 {return ((String) Debug.delegate(null, "updatedatabasesetting", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _i = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Sub UpdateDataBaseSetting";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAshkhas\" Then";
if ((_cur.GetColumnName(_i)).equals("FldAshkhas")) { 
RDebugUtils.currentLine=19726344;
 //BA.debugLineNum = 19726344;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726348;
 //BA.debugLineNum = 19726348;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726349;
 //BA.debugLineNum = 19726349;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldAshkhas Text");
RDebugUtils.currentLine=19726350;
 //BA.debugLineNum = 19726350;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldKala Text");
RDebugUtils.currentLine=19726351;
 //BA.debugLineNum = 19726351;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldFee Text");
RDebugUtils.currentLine=19726352;
 //BA.debugLineNum = 19726352;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldTasvie Text");
RDebugUtils.currentLine=19726353;
 //BA.debugLineNum = 19726353;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldIntervalDownload Text");
RDebugUtils.currentLine=19726354;
 //BA.debugLineNum = 19726354;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726355;
 //BA.debugLineNum = 19726355;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726356;
 //BA.debugLineNum = 19726356;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldAshkhas = '0', FldKala = '0', FldFee = '0', FldTasvie = '0', FldIntervalDownload = '0',FldDateUpdate='0'");
 };
RDebugUtils.currentLine=19726358;
 //BA.debugLineNum = 19726358;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726359;
 //BA.debugLineNum = 19726359;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726360;
 //BA.debugLineNum = 19726360;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step23 = 1;
final int limit23 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=19726361;
 //BA.debugLineNum = 19726361;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateUpdate\" Then";
if ((_cur.GetColumnName(_i)).equals("FldDateUpdate")) { 
RDebugUtils.currentLine=19726362;
 //BA.debugLineNum = 19726362;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726363;
 //BA.debugLineNum = 19726363;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726366;
 //BA.debugLineNum = 19726366;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726367;
 //BA.debugLineNum = 19726367;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldDateUpdate Text");
RDebugUtils.currentLine=19726368;
 //BA.debugLineNum = 19726368;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726369;
 //BA.debugLineNum = 19726369;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726372;
 //BA.debugLineNum = 19726372;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726373;
 //BA.debugLineNum = 19726373;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726374;
 //BA.debugLineNum = 19726374;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step36 = 1;
final int limit36 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit36 ;_i = _i + step36 ) {
RDebugUtils.currentLine=19726375;
 //BA.debugLineNum = 19726375;BA.debugLine="If  Cur.GetColumnName(i)=\"FldToken\" Then";
if ((_cur.GetColumnName(_i)).equals("FldToken")) { 
RDebugUtils.currentLine=19726376;
 //BA.debugLineNum = 19726376;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726377;
 //BA.debugLineNum = 19726377;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726380;
 //BA.debugLineNum = 19726380;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726381;
 //BA.debugLineNum = 19726381;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldToken Text");
RDebugUtils.currentLine=19726382;
 //BA.debugLineNum = 19726382;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726383;
 //BA.debugLineNum = 19726383;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726385;
 //BA.debugLineNum = 19726385;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726386;
 //BA.debugLineNum = 19726386;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726387;
 //BA.debugLineNum = 19726387;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step49 = 1;
final int limit49 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit49 ;_i = _i + step49 ) {
RDebugUtils.currentLine=19726388;
 //BA.debugLineNum = 19726388;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateTimeSend\" Then";
if ((_cur.GetColumnName(_i)).equals("FldDateTimeSend")) { 
RDebugUtils.currentLine=19726389;
 //BA.debugLineNum = 19726389;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726390;
 //BA.debugLineNum = 19726390;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726393;
 //BA.debugLineNum = 19726393;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726394;
 //BA.debugLineNum = 19726394;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldDateTimeSend Text");
RDebugUtils.currentLine=19726395;
 //BA.debugLineNum = 19726395;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726396;
 //BA.debugLineNum = 19726396;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726398;
 //BA.debugLineNum = 19726398;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726399;
 //BA.debugLineNum = 19726399;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726400;
 //BA.debugLineNum = 19726400;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step62 = 1;
final int limit62 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit62 ;_i = _i + step62 ) {
RDebugUtils.currentLine=19726401;
 //BA.debugLineNum = 19726401;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSendFactor\" Then";
if ((_cur.GetColumnName(_i)).equals("FldSendFactor")) { 
RDebugUtils.currentLine=19726402;
 //BA.debugLineNum = 19726402;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726403;
 //BA.debugLineNum = 19726403;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726406;
 //BA.debugLineNum = 19726406;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726407;
 //BA.debugLineNum = 19726407;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldSendFactor Text");
RDebugUtils.currentLine=19726408;
 //BA.debugLineNum = 19726408;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726409;
 //BA.debugLineNum = 19726409;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726410;
 //BA.debugLineNum = 19726410;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldDateUpdate='0',FldSendFactor='1'");
 };
RDebugUtils.currentLine=19726412;
 //BA.debugLineNum = 19726412;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726413;
 //BA.debugLineNum = 19726413;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726414;
 //BA.debugLineNum = 19726414;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step76 = 1;
final int limit76 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit76 ;_i = _i + step76 ) {
RDebugUtils.currentLine=19726415;
 //BA.debugLineNum = 19726415;BA.debugLine="If  Cur.GetColumnName(i)=\"FldPrinterType\" Then";
if ((_cur.GetColumnName(_i)).equals("FldPrinterType")) { 
RDebugUtils.currentLine=19726416;
 //BA.debugLineNum = 19726416;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726417;
 //BA.debugLineNum = 19726417;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726420;
 //BA.debugLineNum = 19726420;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726421;
 //BA.debugLineNum = 19726421;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldPrinterType Text");
RDebugUtils.currentLine=19726422;
 //BA.debugLineNum = 19726422;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726423;
 //BA.debugLineNum = 19726423;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726424;
 //BA.debugLineNum = 19726424;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldPrinterType='0'");
 };
RDebugUtils.currentLine=19726427;
 //BA.debugLineNum = 19726427;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726428;
 //BA.debugLineNum = 19726428;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726429;
 //BA.debugLineNum = 19726429;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step90 = 1;
final int limit90 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit90 ;_i = _i + step90 ) {
RDebugUtils.currentLine=19726430;
 //BA.debugLineNum = 19726430;BA.debugLine="If  Cur.GetColumnName(i)=\"fldArzeshAfzodeEnable\"";
if ((_cur.GetColumnName(_i)).equals("fldArzeshAfzodeEnable")) { 
RDebugUtils.currentLine=19726431;
 //BA.debugLineNum = 19726431;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726432;
 //BA.debugLineNum = 19726432;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726435;
 //BA.debugLineNum = 19726435;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726436;
 //BA.debugLineNum = 19726436;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD fldArzeshAfzodeEnable Text");
RDebugUtils.currentLine=19726437;
 //BA.debugLineNum = 19726437;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726438;
 //BA.debugLineNum = 19726438;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726439;
 //BA.debugLineNum = 19726439;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set f";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set fldArzeshAfzodeEnable='0'");
 };
RDebugUtils.currentLine=19726441;
 //BA.debugLineNum = 19726441;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726442;
 //BA.debugLineNum = 19726442;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726443;
 //BA.debugLineNum = 19726443;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step104 = 1;
final int limit104 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit104 ;_i = _i + step104 ) {
RDebugUtils.currentLine=19726444;
 //BA.debugLineNum = 19726444;BA.debugLine="If  Cur.GetColumnName(i)=\"fldArzeshAfzode\" Then";
if ((_cur.GetColumnName(_i)).equals("fldArzeshAfzode")) { 
RDebugUtils.currentLine=19726445;
 //BA.debugLineNum = 19726445;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726446;
 //BA.debugLineNum = 19726446;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726449;
 //BA.debugLineNum = 19726449;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726450;
 //BA.debugLineNum = 19726450;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD fldArzeshAfzode Text");
RDebugUtils.currentLine=19726451;
 //BA.debugLineNum = 19726451;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726452;
 //BA.debugLineNum = 19726452;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726453;
 //BA.debugLineNum = 19726453;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set f";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set fldArzeshAfzode='0'");
 };
RDebugUtils.currentLine=19726455;
 //BA.debugLineNum = 19726455;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726456;
 //BA.debugLineNum = 19726456;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726457;
 //BA.debugLineNum = 19726457;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step118 = 1;
final int limit118 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit118 ;_i = _i + step118 ) {
RDebugUtils.currentLine=19726458;
 //BA.debugLineNum = 19726458;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateTimeRecive\" The";
if ((_cur.GetColumnName(_i)).equals("FldDateTimeRecive")) { 
RDebugUtils.currentLine=19726459;
 //BA.debugLineNum = 19726459;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726460;
 //BA.debugLineNum = 19726460;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726463;
 //BA.debugLineNum = 19726463;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726464;
 //BA.debugLineNum = 19726464;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldDateTimeRecive Text");
RDebugUtils.currentLine=19726465;
 //BA.debugLineNum = 19726465;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726466;
 //BA.debugLineNum = 19726466;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726469;
 //BA.debugLineNum = 19726469;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726470;
 //BA.debugLineNum = 19726470;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726471;
 //BA.debugLineNum = 19726471;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step131 = 1;
final int limit131 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit131 ;_i = _i + step131 ) {
RDebugUtils.currentLine=19726472;
 //BA.debugLineNum = 19726472;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTakhfifKala\" Then";
if ((_cur.GetColumnName(_i)).equals("FldTakhfifKala")) { 
RDebugUtils.currentLine=19726473;
 //BA.debugLineNum = 19726473;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726474;
 //BA.debugLineNum = 19726474;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726477;
 //BA.debugLineNum = 19726477;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726478;
 //BA.debugLineNum = 19726478;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldTakhfifKala Text");
RDebugUtils.currentLine=19726479;
 //BA.debugLineNum = 19726479;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726480;
 //BA.debugLineNum = 19726480;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726482;
 //BA.debugLineNum = 19726482;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726483;
 //BA.debugLineNum = 19726483;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726484;
 //BA.debugLineNum = 19726484;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step144 = 1;
final int limit144 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit144 ;_i = _i + step144 ) {
RDebugUtils.currentLine=19726485;
 //BA.debugLineNum = 19726485;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateTimeSend\" Then";
if ((_cur.GetColumnName(_i)).equals("FldDateTimeSend")) { 
RDebugUtils.currentLine=19726486;
 //BA.debugLineNum = 19726486;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726487;
 //BA.debugLineNum = 19726487;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726490;
 //BA.debugLineNum = 19726490;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726491;
 //BA.debugLineNum = 19726491;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldDateTimeSend Text");
RDebugUtils.currentLine=19726492;
 //BA.debugLineNum = 19726492;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726493;
 //BA.debugLineNum = 19726493;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726496;
 //BA.debugLineNum = 19726496;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726497;
 //BA.debugLineNum = 19726497;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726498;
 //BA.debugLineNum = 19726498;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step157 = 1;
final int limit157 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit157 ;_i = _i + step157 ) {
RDebugUtils.currentLine=19726499;
 //BA.debugLineNum = 19726499;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSaveFactorInLocatio";
if ((_cur.GetColumnName(_i)).equals("FldSaveFactorInLocation")) { 
RDebugUtils.currentLine=19726500;
 //BA.debugLineNum = 19726500;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726501;
 //BA.debugLineNum = 19726501;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726504;
 //BA.debugLineNum = 19726504;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726505;
 //BA.debugLineNum = 19726505;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldSaveFactorInLocation Text");
RDebugUtils.currentLine=19726506;
 //BA.debugLineNum = 19726506;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726507;
 //BA.debugLineNum = 19726507;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726508;
 //BA.debugLineNum = 19726508;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldSaveFactorInLocation='0'");
 };
RDebugUtils.currentLine=19726510;
 //BA.debugLineNum = 19726510;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726511;
 //BA.debugLineNum = 19726511;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726512;
 //BA.debugLineNum = 19726512;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step171 = 1;
final int limit171 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit171 ;_i = _i + step171 ) {
RDebugUtils.currentLine=19726513;
 //BA.debugLineNum = 19726513;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMasafat\" Then";
if ((_cur.GetColumnName(_i)).equals("FldMasafat")) { 
RDebugUtils.currentLine=19726514;
 //BA.debugLineNum = 19726514;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726515;
 //BA.debugLineNum = 19726515;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726518;
 //BA.debugLineNum = 19726518;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726519;
 //BA.debugLineNum = 19726519;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldMasafat Text");
RDebugUtils.currentLine=19726520;
 //BA.debugLineNum = 19726520;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726521;
 //BA.debugLineNum = 19726521;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726522;
 //BA.debugLineNum = 19726522;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldMasafat='50'");
 };
RDebugUtils.currentLine=19726525;
 //BA.debugLineNum = 19726525;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726526;
 //BA.debugLineNum = 19726526;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726527;
 //BA.debugLineNum = 19726527;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step185 = 1;
final int limit185 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit185 ;_i = _i + step185 ) {
RDebugUtils.currentLine=19726528;
 //BA.debugLineNum = 19726528;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTaghirFeeKala\" Then";
if ((_cur.GetColumnName(_i)).equals("FldTaghirFeeKala")) { 
RDebugUtils.currentLine=19726529;
 //BA.debugLineNum = 19726529;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726530;
 //BA.debugLineNum = 19726530;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726533;
 //BA.debugLineNum = 19726533;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726534;
 //BA.debugLineNum = 19726534;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldKalaManfi Text");
RDebugUtils.currentLine=19726535;
 //BA.debugLineNum = 19726535;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldTaghirFeeKala Text");
RDebugUtils.currentLine=19726536;
 //BA.debugLineNum = 19726536;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726537;
 //BA.debugLineNum = 19726537;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726538;
 //BA.debugLineNum = 19726538;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldKalaManfi = '0', FldTaghirFeeKala='0'");
 };
RDebugUtils.currentLine=19726541;
 //BA.debugLineNum = 19726541;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726542;
 //BA.debugLineNum = 19726542;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726543;
 //BA.debugLineNum = 19726543;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step200 = 1;
final int limit200 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit200 ;_i = _i + step200 ) {
RDebugUtils.currentLine=19726544;
 //BA.debugLineNum = 19726544;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTokenId\" Then";
if ((_cur.GetColumnName(_i)).equals("FldTokenId")) { 
RDebugUtils.currentLine=19726545;
 //BA.debugLineNum = 19726545;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726546;
 //BA.debugLineNum = 19726546;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726549;
 //BA.debugLineNum = 19726549;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726550;
 //BA.debugLineNum = 19726550;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldTokenId Text");
RDebugUtils.currentLine=19726551;
 //BA.debugLineNum = 19726551;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726552;
 //BA.debugLineNum = 19726552;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726555;
 //BA.debugLineNum = 19726555;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726556;
 //BA.debugLineNum = 19726556;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726557;
 //BA.debugLineNum = 19726557;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step213 = 1;
final int limit213 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit213 ;_i = _i + step213 ) {
RDebugUtils.currentLine=19726558;
 //BA.debugLineNum = 19726558;BA.debugLine="If  Cur.GetColumnName(i)=\"FldCodeMoshtari\" Then";
if ((_cur.GetColumnName(_i)).equals("FldCodeMoshtari")) { 
RDebugUtils.currentLine=19726559;
 //BA.debugLineNum = 19726559;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726560;
 //BA.debugLineNum = 19726560;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726563;
 //BA.debugLineNum = 19726563;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726564;
 //BA.debugLineNum = 19726564;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldCodeMoshtari Text");
RDebugUtils.currentLine=19726565;
 //BA.debugLineNum = 19726565;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726566;
 //BA.debugLineNum = 19726566;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726569;
 //BA.debugLineNum = 19726569;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726570;
 //BA.debugLineNum = 19726570;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726571;
 //BA.debugLineNum = 19726571;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step226 = 1;
final int limit226 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit226 ;_i = _i + step226 ) {
RDebugUtils.currentLine=19726572;
 //BA.debugLineNum = 19726572;BA.debugLine="If  Cur.GetColumnName(i)=\"FldNameVisitor\" Then";
if ((_cur.GetColumnName(_i)).equals("FldNameVisitor")) { 
RDebugUtils.currentLine=19726573;
 //BA.debugLineNum = 19726573;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726574;
 //BA.debugLineNum = 19726574;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726577;
 //BA.debugLineNum = 19726577;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726578;
 //BA.debugLineNum = 19726578;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldNameVisitor Text");
RDebugUtils.currentLine=19726579;
 //BA.debugLineNum = 19726579;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726580;
 //BA.debugLineNum = 19726580;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726583;
 //BA.debugLineNum = 19726583;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726584;
 //BA.debugLineNum = 19726584;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726585;
 //BA.debugLineNum = 19726585;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step239 = 1;
final int limit239 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit239 ;_i = _i + step239 ) {
RDebugUtils.currentLine=19726586;
 //BA.debugLineNum = 19726586;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVaziat\" Then";
if ((_cur.GetColumnName(_i)).equals("FldVaziat")) { 
RDebugUtils.currentLine=19726587;
 //BA.debugLineNum = 19726587;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726588;
 //BA.debugLineNum = 19726588;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726591;
 //BA.debugLineNum = 19726591;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726592;
 //BA.debugLineNum = 19726592;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldVaziat Integer");
RDebugUtils.currentLine=19726593;
 //BA.debugLineNum = 19726593;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726594;
 //BA.debugLineNum = 19726594;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726595;
 //BA.debugLineNum = 19726595;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldVaziat='0'");
 };
RDebugUtils.currentLine=19726598;
 //BA.debugLineNum = 19726598;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726599;
 //BA.debugLineNum = 19726599;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726600;
 //BA.debugLineNum = 19726600;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step253 = 1;
final int limit253 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit253 ;_i = _i + step253 ) {
RDebugUtils.currentLine=19726601;
 //BA.debugLineNum = 19726601;BA.debugLine="If  Cur.GetColumnName(i)=\"FldPicOnline\" Then";
if ((_cur.GetColumnName(_i)).equals("FldPicOnline")) { 
RDebugUtils.currentLine=19726602;
 //BA.debugLineNum = 19726602;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726603;
 //BA.debugLineNum = 19726603;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726606;
 //BA.debugLineNum = 19726606;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726607;
 //BA.debugLineNum = 19726607;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldPicOnline Text");
RDebugUtils.currentLine=19726608;
 //BA.debugLineNum = 19726608;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726609;
 //BA.debugLineNum = 19726609;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726610;
 //BA.debugLineNum = 19726610;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldPicOnline='0'");
 };
RDebugUtils.currentLine=19726613;
 //BA.debugLineNum = 19726613;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726614;
 //BA.debugLineNum = 19726614;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726615;
 //BA.debugLineNum = 19726615;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step267 = 1;
final int limit267 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit267 ;_i = _i + step267 ) {
RDebugUtils.currentLine=19726616;
 //BA.debugLineNum = 19726616;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDaryaft\" Then";
if ((_cur.GetColumnName(_i)).equals("FldDaryaft")) { 
RDebugUtils.currentLine=19726617;
 //BA.debugLineNum = 19726617;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726618;
 //BA.debugLineNum = 19726618;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726621;
 //BA.debugLineNum = 19726621;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726622;
 //BA.debugLineNum = 19726622;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldDaryaft Text");
RDebugUtils.currentLine=19726623;
 //BA.debugLineNum = 19726623;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726624;
 //BA.debugLineNum = 19726624;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726625;
 //BA.debugLineNum = 19726625;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldDaryaft='0'");
 };
RDebugUtils.currentLine=19726627;
 //BA.debugLineNum = 19726627;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726628;
 //BA.debugLineNum = 19726628;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726629;
 //BA.debugLineNum = 19726629;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step281 = 1;
final int limit281 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit281 ;_i = _i + step281 ) {
RDebugUtils.currentLine=19726630;
 //BA.debugLineNum = 19726630;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMojavezSefaresh\" Th";
if ((_cur.GetColumnName(_i)).equals("FldMojavezSefaresh")) { 
RDebugUtils.currentLine=19726631;
 //BA.debugLineNum = 19726631;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726632;
 //BA.debugLineNum = 19726632;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726635;
 //BA.debugLineNum = 19726635;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726636;
 //BA.debugLineNum = 19726636;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldMojavezSefaresh Text");
RDebugUtils.currentLine=19726637;
 //BA.debugLineNum = 19726637;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726638;
 //BA.debugLineNum = 19726638;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726639;
 //BA.debugLineNum = 19726639;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldMojavezSefaresh='0'");
 };
RDebugUtils.currentLine=19726642;
 //BA.debugLineNum = 19726642;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726644;
 //BA.debugLineNum = 19726644;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726645;
 //BA.debugLineNum = 19726645;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step295 = 1;
final int limit295 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit295 ;_i = _i + step295 ) {
RDebugUtils.currentLine=19726646;
 //BA.debugLineNum = 19726646;BA.debugLine="If  Cur.GetColumnName(i)=\"FldEshantionTabaghati\"";
if ((_cur.GetColumnName(_i)).equals("FldEshantionTabaghati")) { 
RDebugUtils.currentLine=19726647;
 //BA.debugLineNum = 19726647;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726648;
 //BA.debugLineNum = 19726648;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726651;
 //BA.debugLineNum = 19726651;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726652;
 //BA.debugLineNum = 19726652;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldEshantionTabaghati Text");
RDebugUtils.currentLine=19726653;
 //BA.debugLineNum = 19726653;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726654;
 //BA.debugLineNum = 19726654;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726655;
 //BA.debugLineNum = 19726655;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldEshantionTabaghati='0'");
 };
RDebugUtils.currentLine=19726658;
 //BA.debugLineNum = 19726658;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726659;
 //BA.debugLineNum = 19726659;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726660;
 //BA.debugLineNum = 19726660;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step309 = 1;
final int limit309 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit309 ;_i = _i + step309 ) {
RDebugUtils.currentLine=19726661;
 //BA.debugLineNum = 19726661;BA.debugLine="If  Cur.GetColumnName(i)=\"FldEshantionRemove\" Th";
if ((_cur.GetColumnName(_i)).equals("FldEshantionRemove")) { 
RDebugUtils.currentLine=19726662;
 //BA.debugLineNum = 19726662;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726663;
 //BA.debugLineNum = 19726663;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726666;
 //BA.debugLineNum = 19726666;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726667;
 //BA.debugLineNum = 19726667;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldEshantionRemove Text");
RDebugUtils.currentLine=19726668;
 //BA.debugLineNum = 19726668;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726669;
 //BA.debugLineNum = 19726669;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726670;
 //BA.debugLineNum = 19726670;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldEshantionRemove='0'");
 };
RDebugUtils.currentLine=19726673;
 //BA.debugLineNum = 19726673;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726674;
 //BA.debugLineNum = 19726674;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726675;
 //BA.debugLineNum = 19726675;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step323 = 1;
final int limit323 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit323 ;_i = _i + step323 ) {
RDebugUtils.currentLine=19726676;
 //BA.debugLineNum = 19726676;BA.debugLine="If  Cur.GetColumnName(i)=\"FldEshantionGroup\" The";
if ((_cur.GetColumnName(_i)).equals("FldEshantionGroup")) { 
RDebugUtils.currentLine=19726677;
 //BA.debugLineNum = 19726677;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726678;
 //BA.debugLineNum = 19726678;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726681;
 //BA.debugLineNum = 19726681;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726682;
 //BA.debugLineNum = 19726682;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldEshantionGroup Text");
RDebugUtils.currentLine=19726683;
 //BA.debugLineNum = 19726683;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726684;
 //BA.debugLineNum = 19726684;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726685;
 //BA.debugLineNum = 19726685;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldEshantionGroup='0'");
 };
RDebugUtils.currentLine=19726687;
 //BA.debugLineNum = 19726687;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726688;
 //BA.debugLineNum = 19726688;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726689;
 //BA.debugLineNum = 19726689;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step337 = 1;
final int limit337 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit337 ;_i = _i + step337 ) {
RDebugUtils.currentLine=19726690;
 //BA.debugLineNum = 19726690;BA.debugLine="If  Cur.GetColumnName(i)=\"FldGetDataOnline\" Then";
if ((_cur.GetColumnName(_i)).equals("FldGetDataOnline")) { 
RDebugUtils.currentLine=19726691;
 //BA.debugLineNum = 19726691;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726692;
 //BA.debugLineNum = 19726692;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726695;
 //BA.debugLineNum = 19726695;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726696;
 //BA.debugLineNum = 19726696;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldGetDataOnline Text");
RDebugUtils.currentLine=19726697;
 //BA.debugLineNum = 19726697;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726698;
 //BA.debugLineNum = 19726698;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726699;
 //BA.debugLineNum = 19726699;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldGetDataOnline='0'");
 };
RDebugUtils.currentLine=19726702;
 //BA.debugLineNum = 19726702;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726703;
 //BA.debugLineNum = 19726703;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726704;
 //BA.debugLineNum = 19726704;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step351 = 1;
final int limit351 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit351 ;_i = _i + step351 ) {
RDebugUtils.currentLine=19726705;
 //BA.debugLineNum = 19726705;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVersion\" Then";
if ((_cur.GetColumnName(_i)).equals("FldVersion")) { 
RDebugUtils.currentLine=19726706;
 //BA.debugLineNum = 19726706;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726707;
 //BA.debugLineNum = 19726707;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726710;
 //BA.debugLineNum = 19726710;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726711;
 //BA.debugLineNum = 19726711;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldVersion Text");
RDebugUtils.currentLine=19726712;
 //BA.debugLineNum = 19726712;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726713;
 //BA.debugLineNum = 19726713;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726716;
 //BA.debugLineNum = 19726716;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726717;
 //BA.debugLineNum = 19726717;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (_ba,"Select * From TblSetting");
RDebugUtils.currentLine=19726718;
 //BA.debugLineNum = 19726718;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=19726719;
 //BA.debugLineNum = 19726719;BA.debugLine="If MCode.OriginalListFaktor.IsInitialized=False T";
if (mostCurrent._mcode._originallistfaktor /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=19726720;
 //BA.debugLineNum = 19726720;BA.debugLine="MCode.OriginalListFaktor.Initialize";
mostCurrent._mcode._originallistfaktor /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=19726721;
 //BA.debugLineNum = 19726721;BA.debugLine="MCode.OriginalListFaktor.Clear";
mostCurrent._mcode._originallistfaktor /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 };
RDebugUtils.currentLine=19726724;
 //BA.debugLineNum = 19726724;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726725;
 //BA.debugLineNum = 19726725;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726726;
 //BA.debugLineNum = 19726726;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step371 = 1;
final int limit371 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit371 ;_i = _i + step371 ) {
RDebugUtils.currentLine=19726727;
 //BA.debugLineNum = 19726727;BA.debugLine="If  Cur.GetColumnName(i)=\"FldNamayeshKalaSefr\" T";
if ((_cur.GetColumnName(_i)).equals("FldNamayeshKalaSefr")) { 
RDebugUtils.currentLine=19726728;
 //BA.debugLineNum = 19726728;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726729;
 //BA.debugLineNum = 19726729;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726732;
 //BA.debugLineNum = 19726732;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726733;
 //BA.debugLineNum = 19726733;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldNamayeshKalaSefr Text");
RDebugUtils.currentLine=19726734;
 //BA.debugLineNum = 19726734;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726735;
 //BA.debugLineNum = 19726735;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726736;
 //BA.debugLineNum = 19726736;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldNamayeshKalaSefr = '1'");
 };
RDebugUtils.currentLine=19726739;
 //BA.debugLineNum = 19726739;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726740;
 //BA.debugLineNum = 19726740;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726741;
 //BA.debugLineNum = 19726741;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step385 = 1;
final int limit385 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit385 ;_i = _i + step385 ) {
RDebugUtils.currentLine=19726742;
 //BA.debugLineNum = 19726742;BA.debugLine="If  Cur.GetColumnName(i)=\"FldPrinterType\" Then";
if ((_cur.GetColumnName(_i)).equals("FldPrinterType")) { 
RDebugUtils.currentLine=19726743;
 //BA.debugLineNum = 19726743;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726744;
 //BA.debugLineNum = 19726744;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726747;
 //BA.debugLineNum = 19726747;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726748;
 //BA.debugLineNum = 19726748;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldPrinterType Integer");
RDebugUtils.currentLine=19726749;
 //BA.debugLineNum = 19726749;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726750;
 //BA.debugLineNum = 19726750;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726751;
 //BA.debugLineNum = 19726751;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldPrinterType = 0");
 };
RDebugUtils.currentLine=19726754;
 //BA.debugLineNum = 19726754;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726756;
 //BA.debugLineNum = 19726756;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726757;
 //BA.debugLineNum = 19726757;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step399 = 1;
final int limit399 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit399 ;_i = _i + step399 ) {
RDebugUtils.currentLine=19726758;
 //BA.debugLineNum = 19726758;BA.debugLine="If  Cur.GetColumnName(i)=\"FldHideMojodi\" Then";
if ((_cur.GetColumnName(_i)).equals("FldHideMojodi")) { 
RDebugUtils.currentLine=19726759;
 //BA.debugLineNum = 19726759;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726760;
 //BA.debugLineNum = 19726760;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726763;
 //BA.debugLineNum = 19726763;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726764;
 //BA.debugLineNum = 19726764;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldHideMojodi Text");
RDebugUtils.currentLine=19726765;
 //BA.debugLineNum = 19726765;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726766;
 //BA.debugLineNum = 19726766;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726767;
 //BA.debugLineNum = 19726767;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldHideMojodi = '0'");
 };
RDebugUtils.currentLine=19726770;
 //BA.debugLineNum = 19726770;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726772;
 //BA.debugLineNum = 19726772;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726773;
 //BA.debugLineNum = 19726773;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step413 = 1;
final int limit413 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit413 ;_i = _i + step413 ) {
RDebugUtils.currentLine=19726774;
 //BA.debugLineNum = 19726774;BA.debugLine="If  Cur.GetColumnName(i)=\"FldConnectionStatus\" T";
if ((_cur.GetColumnName(_i)).equals("FldConnectionStatus")) { 
RDebugUtils.currentLine=19726775;
 //BA.debugLineNum = 19726775;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726776;
 //BA.debugLineNum = 19726776;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726779;
 //BA.debugLineNum = 19726779;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726780;
 //BA.debugLineNum = 19726780;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldConnectionStatus Text");
RDebugUtils.currentLine=19726781;
 //BA.debugLineNum = 19726781;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726782;
 //BA.debugLineNum = 19726782;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726783;
 //BA.debugLineNum = 19726783;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldConnectionStatus = '0'");
 };
RDebugUtils.currentLine=19726786;
 //BA.debugLineNum = 19726786;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726788;
 //BA.debugLineNum = 19726788;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726789;
 //BA.debugLineNum = 19726789;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step427 = 1;
final int limit427 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit427 ;_i = _i + step427 ) {
RDebugUtils.currentLine=19726790;
 //BA.debugLineNum = 19726790;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAdmin\" Then";
if ((_cur.GetColumnName(_i)).equals("FldAdmin")) { 
RDebugUtils.currentLine=19726791;
 //BA.debugLineNum = 19726791;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726792;
 //BA.debugLineNum = 19726792;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726795;
 //BA.debugLineNum = 19726795;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726796;
 //BA.debugLineNum = 19726796;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldAdmin Text");
RDebugUtils.currentLine=19726797;
 //BA.debugLineNum = 19726797;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726798;
 //BA.debugLineNum = 19726798;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726799;
 //BA.debugLineNum = 19726799;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldAdmin='0'");
 };
RDebugUtils.currentLine=19726802;
 //BA.debugLineNum = 19726802;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726804;
 //BA.debugLineNum = 19726804;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726805;
 //BA.debugLineNum = 19726805;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step441 = 1;
final int limit441 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit441 ;_i = _i + step441 ) {
RDebugUtils.currentLine=19726806;
 //BA.debugLineNum = 19726806;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTozie\" Then";
if ((_cur.GetColumnName(_i)).equals("FldTozie")) { 
RDebugUtils.currentLine=19726807;
 //BA.debugLineNum = 19726807;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726808;
 //BA.debugLineNum = 19726808;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726811;
 //BA.debugLineNum = 19726811;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726812;
 //BA.debugLineNum = 19726812;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldTozie Text");
RDebugUtils.currentLine=19726813;
 //BA.debugLineNum = 19726813;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726814;
 //BA.debugLineNum = 19726814;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726815;
 //BA.debugLineNum = 19726815;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldTozie='0'");
 };
RDebugUtils.currentLine=19726818;
 //BA.debugLineNum = 19726818;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726820;
 //BA.debugLineNum = 19726820;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726821;
 //BA.debugLineNum = 19726821;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step455 = 1;
final int limit455 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit455 ;_i = _i + step455 ) {
RDebugUtils.currentLine=19726822;
 //BA.debugLineNum = 19726822;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVisitor\" Then";
if ((_cur.GetColumnName(_i)).equals("FldVisitor")) { 
RDebugUtils.currentLine=19726823;
 //BA.debugLineNum = 19726823;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726824;
 //BA.debugLineNum = 19726824;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726827;
 //BA.debugLineNum = 19726827;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726828;
 //BA.debugLineNum = 19726828;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldVisitor Text");
RDebugUtils.currentLine=19726829;
 //BA.debugLineNum = 19726829;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726830;
 //BA.debugLineNum = 19726830;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726831;
 //BA.debugLineNum = 19726831;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldVisitor='0'");
 };
RDebugUtils.currentLine=19726834;
 //BA.debugLineNum = 19726834;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726836;
 //BA.debugLineNum = 19726836;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726837;
 //BA.debugLineNum = 19726837;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step469 = 1;
final int limit469 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit469 ;_i = _i + step469 ) {
RDebugUtils.currentLine=19726838;
 //BA.debugLineNum = 19726838;BA.debugLine="If  Cur.GetColumnName(i)=\"FldLinkPicKala\" Then";
if ((_cur.GetColumnName(_i)).equals("FldLinkPicKala")) { 
RDebugUtils.currentLine=19726839;
 //BA.debugLineNum = 19726839;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726840;
 //BA.debugLineNum = 19726840;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726843;
 //BA.debugLineNum = 19726843;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726844;
 //BA.debugLineNum = 19726844;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldLinkPicKala Text");
RDebugUtils.currentLine=19726845;
 //BA.debugLineNum = 19726845;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726846;
 //BA.debugLineNum = 19726846;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19726848;
 //BA.debugLineNum = 19726848;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726850;
 //BA.debugLineNum = 19726850;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726851;
 //BA.debugLineNum = 19726851;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step482 = 1;
final int limit482 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit482 ;_i = _i + step482 ) {
RDebugUtils.currentLine=19726852;
 //BA.debugLineNum = 19726852;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSendMarjoie\" Then";
if ((_cur.GetColumnName(_i)).equals("FldSendMarjoie")) { 
RDebugUtils.currentLine=19726853;
 //BA.debugLineNum = 19726853;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726854;
 //BA.debugLineNum = 19726854;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726857;
 //BA.debugLineNum = 19726857;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726858;
 //BA.debugLineNum = 19726858;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldSendMarjoie Text");
RDebugUtils.currentLine=19726859;
 //BA.debugLineNum = 19726859;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726860;
 //BA.debugLineNum = 19726860;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726861;
 //BA.debugLineNum = 19726861;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldSendMarjoie='0'");
 };
RDebugUtils.currentLine=19726864;
 //BA.debugLineNum = 19726864;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726866;
 //BA.debugLineNum = 19726866;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726867;
 //BA.debugLineNum = 19726867;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step496 = 1;
final int limit496 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit496 ;_i = _i + step496 ) {
RDebugUtils.currentLine=19726868;
 //BA.debugLineNum = 19726868;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAmani\" Then";
if ((_cur.GetColumnName(_i)).equals("FldAmani")) { 
RDebugUtils.currentLine=19726869;
 //BA.debugLineNum = 19726869;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726870;
 //BA.debugLineNum = 19726870;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726873;
 //BA.debugLineNum = 19726873;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726874;
 //BA.debugLineNum = 19726874;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldAmani Text");
RDebugUtils.currentLine=19726875;
 //BA.debugLineNum = 19726875;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726876;
 //BA.debugLineNum = 19726876;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726877;
 //BA.debugLineNum = 19726877;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldAmani='0'");
 };
RDebugUtils.currentLine=19726882;
 //BA.debugLineNum = 19726882;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726883;
 //BA.debugLineNum = 19726883;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726884;
 //BA.debugLineNum = 19726884;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step510 = 1;
final int limit510 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit510 ;_i = _i + step510 ) {
RDebugUtils.currentLine=19726885;
 //BA.debugLineNum = 19726885;BA.debugLine="If  Cur.GetColumnName(i)=\"fldNumberVersion\" Then";
if ((_cur.GetColumnName(_i)).equals("fldNumberVersion")) { 
RDebugUtils.currentLine=19726886;
 //BA.debugLineNum = 19726886;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726887;
 //BA.debugLineNum = 19726887;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726890;
 //BA.debugLineNum = 19726890;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726891;
 //BA.debugLineNum = 19726891;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD fldNumberVersion Text");
RDebugUtils.currentLine=19726892;
 //BA.debugLineNum = 19726892;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD fldDateVersion Text");
RDebugUtils.currentLine=19726893;
 //BA.debugLineNum = 19726893;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD fldLastVersion Text");
RDebugUtils.currentLine=19726894;
 //BA.debugLineNum = 19726894;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD fldTypeVersion Text");
RDebugUtils.currentLine=19726895;
 //BA.debugLineNum = 19726895;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD fldDateSetup Text");
RDebugUtils.currentLine=19726896;
 //BA.debugLineNum = 19726896;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726897;
 //BA.debugLineNum = 19726897;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726900;
 //BA.debugLineNum = 19726900;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSetti";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726901;
 //BA.debugLineNum = 19726901;BA.debugLine="Cur.Position=0";
_cur.setPosition((int) (0));
RDebugUtils.currentLine=19726902;
 //BA.debugLineNum = 19726902;BA.debugLine="Log(Cur.GetString(\"FldVersion\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("519726902",_cur.GetString("FldVersion"),0);
RDebugUtils.currentLine=19726903;
 //BA.debugLineNum = 19726903;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set f";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set fldLastVersion='"+_cur.GetString("FldVersion")+"'");
 };
RDebugUtils.currentLine=19726909;
 //BA.debugLineNum = 19726909;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726910;
 //BA.debugLineNum = 19726910;BA.debugLine="Cur.Position=0";
_cur.setPosition((int) (0));
RDebugUtils.currentLine=19726911;
 //BA.debugLineNum = 19726911;BA.debugLine="If IsNumber(Cur.GetString(\"FldC_Visitor\")) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_cur.GetString("FldC_Visitor"))) { 
RDebugUtils.currentLine=19726913;
 //BA.debugLineNum = 19726913;BA.debugLine="If myCode.Is_Null_adad(Cur.GetString(\"fldNumberV";
if ((mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cur.GetString("fldNumberVersion"))).equals(mostCurrent._mcode._numberversion /*String*/ ) == false) { 
RDebugUtils.currentLine=19726914;
 //BA.debugLineNum = 19726914;BA.debugLine="Log(Cur.GetString(\"fldLastVersion\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("519726914",_cur.GetString("fldLastVersion"),0);
RDebugUtils.currentLine=19726915;
 //BA.debugLineNum = 19726915;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set fldNumberVersion='"+mostCurrent._mcode._numberversion /*String*/ +"'");
RDebugUtils.currentLine=19726916;
 //BA.debugLineNum = 19726916;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set fldDateVersion='"+mostCurrent._mcode._dateversion /*String*/ .replace("/","")+"'");
RDebugUtils.currentLine=19726917;
 //BA.debugLineNum = 19726917;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set fldLastVersion='"+_cur.GetString("fldLastVersion")+"'");
RDebugUtils.currentLine=19726918;
 //BA.debugLineNum = 19726918;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set fldTypeVersion='"+mostCurrent._mcode._typeversion /*String*/ +"'");
RDebugUtils.currentLine=19726919;
 //BA.debugLineNum = 19726919;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set fldDateSetup='"+mostCurrent._mcode._getdatenow /*String*/ (_ba)+"'");
RDebugUtils.currentLine=19726922;
 //BA.debugLineNum = 19726922;BA.debugLine="CallSubDelayed(Service_Server,\"SaveVersionAndro";
anywheresoftware.b4a.keywords.Common.CallSubDelayed((_ba.processBA == null ? _ba : _ba.processBA),(Object)(mostCurrent._service_server.getObject()),"SaveVersionAndroidInfo");
 };
 };
RDebugUtils.currentLine=19726926;
 //BA.debugLineNum = 19726926;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726929;
 //BA.debugLineNum = 19726929;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726930;
 //BA.debugLineNum = 19726930;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step544 = 1;
final int limit544 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit544 ;_i = _i + step544 ) {
RDebugUtils.currentLine=19726931;
 //BA.debugLineNum = 19726931;BA.debugLine="If  Cur.GetColumnName(i)=\"FldCheckAdmin\" Then";
if ((_cur.GetColumnName(_i)).equals("FldCheckAdmin")) { 
RDebugUtils.currentLine=19726932;
 //BA.debugLineNum = 19726932;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726933;
 //BA.debugLineNum = 19726933;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726936;
 //BA.debugLineNum = 19726936;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726937;
 //BA.debugLineNum = 19726937;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldCheckAdmin Text");
RDebugUtils.currentLine=19726938;
 //BA.debugLineNum = 19726938;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726939;
 //BA.debugLineNum = 19726939;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726940;
 //BA.debugLineNum = 19726940;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldCheckAdmin='0'");
 };
RDebugUtils.currentLine=19726942;
 //BA.debugLineNum = 19726942;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726943;
 //BA.debugLineNum = 19726943;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726944;
 //BA.debugLineNum = 19726944;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step558 = 1;
final int limit558 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit558 ;_i = _i + step558 ) {
RDebugUtils.currentLine=19726945;
 //BA.debugLineNum = 19726945;BA.debugLine="If  Cur.GetColumnName(i)=\"fldDateUpdateKala\" The";
if ((_cur.GetColumnName(_i)).equals("fldDateUpdateKala")) { 
RDebugUtils.currentLine=19726946;
 //BA.debugLineNum = 19726946;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726947;
 //BA.debugLineNum = 19726947;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726950;
 //BA.debugLineNum = 19726950;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726951;
 //BA.debugLineNum = 19726951;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD fldDateUpdateKala Text");
RDebugUtils.currentLine=19726952;
 //BA.debugLineNum = 19726952;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726953;
 //BA.debugLineNum = 19726953;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726954;
 //BA.debugLineNum = 19726954;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set f";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set fldDateUpdateKala='0'");
 };
RDebugUtils.currentLine=19726957;
 //BA.debugLineNum = 19726957;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726959;
 //BA.debugLineNum = 19726959;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726960;
 //BA.debugLineNum = 19726960;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step572 = 1;
final int limit572 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit572 ;_i = _i + step572 ) {
RDebugUtils.currentLine=19726961;
 //BA.debugLineNum = 19726961;BA.debugLine="If  Cur.GetColumnName(i)=\"FldNameCompany\" Then";
if ((_cur.GetColumnName(_i)).equals("FldNameCompany")) { 
RDebugUtils.currentLine=19726962;
 //BA.debugLineNum = 19726962;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726963;
 //BA.debugLineNum = 19726963;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726966;
 //BA.debugLineNum = 19726966;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726967;
 //BA.debugLineNum = 19726967;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldNameCompany Text");
RDebugUtils.currentLine=19726968;
 //BA.debugLineNum = 19726968;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726969;
 //BA.debugLineNum = 19726969;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726970;
 //BA.debugLineNum = 19726970;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldNameCompany=''");
 };
RDebugUtils.currentLine=19726973;
 //BA.debugLineNum = 19726973;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726975;
 //BA.debugLineNum = 19726975;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726976;
 //BA.debugLineNum = 19726976;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step586 = 1;
final int limit586 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit586 ;_i = _i + step586 ) {
RDebugUtils.currentLine=19726977;
 //BA.debugLineNum = 19726977;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTellCompany\" Then";
if ((_cur.GetColumnName(_i)).equals("FldTellCompany")) { 
RDebugUtils.currentLine=19726978;
 //BA.debugLineNum = 19726978;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726979;
 //BA.debugLineNum = 19726979;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726982;
 //BA.debugLineNum = 19726982;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19726983;
 //BA.debugLineNum = 19726983;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldTellCompany Text");
RDebugUtils.currentLine=19726984;
 //BA.debugLineNum = 19726984;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19726985;
 //BA.debugLineNum = 19726985;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19726986;
 //BA.debugLineNum = 19726986;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldTellCompany=''");
 };
RDebugUtils.currentLine=19726990;
 //BA.debugLineNum = 19726990;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19726992;
 //BA.debugLineNum = 19726992;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19726993;
 //BA.debugLineNum = 19726993;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step600 = 1;
final int limit600 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit600 ;_i = _i + step600 ) {
RDebugUtils.currentLine=19726994;
 //BA.debugLineNum = 19726994;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAddressCompany\" The";
if ((_cur.GetColumnName(_i)).equals("FldAddressCompany")) { 
RDebugUtils.currentLine=19726995;
 //BA.debugLineNum = 19726995;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19726996;
 //BA.debugLineNum = 19726996;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19726999;
 //BA.debugLineNum = 19726999;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19727000;
 //BA.debugLineNum = 19727000;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldAddressCompany Text");
RDebugUtils.currentLine=19727001;
 //BA.debugLineNum = 19727001;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19727002;
 //BA.debugLineNum = 19727002;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19727003;
 //BA.debugLineNum = 19727003;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldAddressCompany=''");
 };
RDebugUtils.currentLine=19727006;
 //BA.debugLineNum = 19727006;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19727008;
 //BA.debugLineNum = 19727008;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSetting")));
RDebugUtils.currentLine=19727009;
 //BA.debugLineNum = 19727009;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step614 = 1;
final int limit614 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit614 ;_i = _i + step614 ) {
RDebugUtils.currentLine=19727010;
 //BA.debugLineNum = 19727010;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMobileIsImportent\"";
if ((_cur.GetColumnName(_i)).equals("FldMobileIsImportent")) { 
RDebugUtils.currentLine=19727011;
 //BA.debugLineNum = 19727011;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19727012;
 //BA.debugLineNum = 19727012;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19727015;
 //BA.debugLineNum = 19727015;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19727016;
 //BA.debugLineNum = 19727016;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSetting ADD FldMobileIsImportent Text");
RDebugUtils.currentLine=19727017;
 //BA.debugLineNum = 19727017;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19727018;
 //BA.debugLineNum = 19727018;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19727019;
 //BA.debugLineNum = 19727019;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblSetting Set FldMobileIsImportent='0'");
 };
RDebugUtils.currentLine=19727022;
 //BA.debugLineNum = 19727022;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabasekala(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "updatedatabasekala", false))
	 {return ((String) Debug.delegate(null, "updatedatabasekala", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Sub UpdateDataBaseKala";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblKala")));
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateUpdate\" Then";
if ((_cur.GetColumnName(_i)).equals("FldDateUpdate")) { 
RDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19791881;
 //BA.debugLineNum = 19791881;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19791884;
 //BA.debugLineNum = 19791884;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19791885;
 //BA.debugLineNum = 19791885;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblKala ADD FldDateUpdate Text");
RDebugUtils.currentLine=19791886;
 //BA.debugLineNum = 19791886;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19791887;
 //BA.debugLineNum = 19791887;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19791888;
 //BA.debugLineNum = 19791888;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblKala Set FldD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblKala Set FldDateUpdate='0'");
 };
RDebugUtils.currentLine=19791891;
 //BA.debugLineNum = 19791891;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19791892;
 //BA.debugLineNum = 19791892;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblKala")));
RDebugUtils.currentLine=19791893;
 //BA.debugLineNum = 19791893;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step19 = 1;
final int limit19 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit19 ;_i = _i + step19 ) {
RDebugUtils.currentLine=19791894;
 //BA.debugLineNum = 19791894;BA.debugLine="If  Cur.GetColumnName(i)=\"fldCodeGroup\" Then";
if ((_cur.GetColumnName(_i)).equals("fldCodeGroup")) { 
RDebugUtils.currentLine=19791895;
 //BA.debugLineNum = 19791895;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19791896;
 //BA.debugLineNum = 19791896;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19791899;
 //BA.debugLineNum = 19791899;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19791900;
 //BA.debugLineNum = 19791900;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblKala ADD fldCodeGroup Text");
RDebugUtils.currentLine=19791901;
 //BA.debugLineNum = 19791901;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19791902;
 //BA.debugLineNum = 19791902;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19791904;
 //BA.debugLineNum = 19791904;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19791905;
 //BA.debugLineNum = 19791905;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblKala")));
RDebugUtils.currentLine=19791906;
 //BA.debugLineNum = 19791906;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step32 = 1;
final int limit32 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
RDebugUtils.currentLine=19791907;
 //BA.debugLineNum = 19791907;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPic\" Then";
if ((_cur.GetColumnName(_i)).equals("fldPathPic")) { 
RDebugUtils.currentLine=19791908;
 //BA.debugLineNum = 19791908;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19791909;
 //BA.debugLineNum = 19791909;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19791912;
 //BA.debugLineNum = 19791912;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19791913;
 //BA.debugLineNum = 19791913;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblKala ADD fldPathPic Text");
RDebugUtils.currentLine=19791914;
 //BA.debugLineNum = 19791914;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19791915;
 //BA.debugLineNum = 19791915;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19791918;
 //BA.debugLineNum = 19791918;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19791919;
 //BA.debugLineNum = 19791919;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblKala")));
RDebugUtils.currentLine=19791920;
 //BA.debugLineNum = 19791920;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step45 = 1;
final int limit45 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit45 ;_i = _i + step45 ) {
RDebugUtils.currentLine=19791921;
 //BA.debugLineNum = 19791921;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPicOffline\" The";
if ((_cur.GetColumnName(_i)).equals("fldPathPicOffline")) { 
RDebugUtils.currentLine=19791922;
 //BA.debugLineNum = 19791922;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19791923;
 //BA.debugLineNum = 19791923;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19791926;
 //BA.debugLineNum = 19791926;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19791927;
 //BA.debugLineNum = 19791927;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblKala ADD fldPathPicOffline Text");
RDebugUtils.currentLine=19791928;
 //BA.debugLineNum = 19791928;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19791929;
 //BA.debugLineNum = 19791929;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19791932;
 //BA.debugLineNum = 19791932;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19791933;
 //BA.debugLineNum = 19791933;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblKala")));
RDebugUtils.currentLine=19791934;
 //BA.debugLineNum = 19791934;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step58 = 1;
final int limit58 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit58 ;_i = _i + step58 ) {
RDebugUtils.currentLine=19791935;
 //BA.debugLineNum = 19791935;BA.debugLine="If  Cur.GetColumnName(i)=\"fldFeeBadAzTakhfif\" Th";
if ((_cur.GetColumnName(_i)).equals("fldFeeBadAzTakhfif")) { 
RDebugUtils.currentLine=19791936;
 //BA.debugLineNum = 19791936;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19791937;
 //BA.debugLineNum = 19791937;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19791940;
 //BA.debugLineNum = 19791940;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19791941;
 //BA.debugLineNum = 19791941;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblKala ADD fldFeeBadAzTakhfif Text");
RDebugUtils.currentLine=19791942;
 //BA.debugLineNum = 19791942;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19791943;
 //BA.debugLineNum = 19791943;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19791946;
 //BA.debugLineNum = 19791946;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19791947;
 //BA.debugLineNum = 19791947;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblKala")));
RDebugUtils.currentLine=19791948;
 //BA.debugLineNum = 19791948;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step71 = 1;
final int limit71 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit71 ;_i = _i + step71 ) {
RDebugUtils.currentLine=19791949;
 //BA.debugLineNum = 19791949;BA.debugLine="If  Cur.GetColumnName(i)=\"fldSerial\" Then";
if ((_cur.GetColumnName(_i)).equals("fldSerial")) { 
RDebugUtils.currentLine=19791950;
 //BA.debugLineNum = 19791950;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19791951;
 //BA.debugLineNum = 19791951;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19791954;
 //BA.debugLineNum = 19791954;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19791955;
 //BA.debugLineNum = 19791955;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblKala ADD fldSerial Text");
RDebugUtils.currentLine=19791956;
 //BA.debugLineNum = 19791956;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19791957;
 //BA.debugLineNum = 19791957;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19791960;
 //BA.debugLineNum = 19791960;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19791961;
 //BA.debugLineNum = 19791961;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblKala")));
RDebugUtils.currentLine=19791962;
 //BA.debugLineNum = 19791962;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step84 = 1;
final int limit84 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit84 ;_i = _i + step84 ) {
RDebugUtils.currentLine=19791963;
 //BA.debugLineNum = 19791963;BA.debugLine="If  Cur.GetColumnName(i)=\"fldSharh\" Then";
if ((_cur.GetColumnName(_i)).equals("fldSharh")) { 
RDebugUtils.currentLine=19791964;
 //BA.debugLineNum = 19791964;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19791965;
 //BA.debugLineNum = 19791965;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19791968;
 //BA.debugLineNum = 19791968;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19791969;
 //BA.debugLineNum = 19791969;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblKala ADD fldSharh Text");
RDebugUtils.currentLine=19791970;
 //BA.debugLineNum = 19791970;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19791971;
 //BA.debugLineNum = 19791971;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19791974;
 //BA.debugLineNum = 19791974;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19791975;
 //BA.debugLineNum = 19791975;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblKala")));
RDebugUtils.currentLine=19791976;
 //BA.debugLineNum = 19791976;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step97 = 1;
final int limit97 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit97 ;_i = _i + step97 ) {
RDebugUtils.currentLine=19791977;
 //BA.debugLineNum = 19791977;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghTakhfif\" The";
if ((_cur.GetColumnName(_i)).equals("FldMablaghTakhfif")) { 
RDebugUtils.currentLine=19791978;
 //BA.debugLineNum = 19791978;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19791979;
 //BA.debugLineNum = 19791979;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19791982;
 //BA.debugLineNum = 19791982;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19791983;
 //BA.debugLineNum = 19791983;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblKala ADD FldMablaghTakhfif Text");
RDebugUtils.currentLine=19791984;
 //BA.debugLineNum = 19791984;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19791985;
 //BA.debugLineNum = 19791985;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19791988;
 //BA.debugLineNum = 19791988;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19791989;
 //BA.debugLineNum = 19791989;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblKala")));
RDebugUtils.currentLine=19791990;
 //BA.debugLineNum = 19791990;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step110 = 1;
final int limit110 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit110 ;_i = _i + step110 ) {
RDebugUtils.currentLine=19791991;
 //BA.debugLineNum = 19791991;BA.debugLine="If  Cur.GetColumnName(i)=\"fldFeeTasvie\" Then";
if ((_cur.GetColumnName(_i)).equals("fldFeeTasvie")) { 
RDebugUtils.currentLine=19791992;
 //BA.debugLineNum = 19791992;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19791993;
 //BA.debugLineNum = 19791993;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19791996;
 //BA.debugLineNum = 19791996;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19791997;
 //BA.debugLineNum = 19791997;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblKala ADD fldFeeTasvie Text");
RDebugUtils.currentLine=19791998;
 //BA.debugLineNum = 19791998;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19791999;
 //BA.debugLineNum = 19791999;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19792001;
 //BA.debugLineNum = 19792001;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19792004;
 //BA.debugLineNum = 19792004;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblKala")));
RDebugUtils.currentLine=19792005;
 //BA.debugLineNum = 19792005;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step123 = 1;
final int limit123 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit123 ;_i = _i + step123 ) {
RDebugUtils.currentLine=19792006;
 //BA.debugLineNum = 19792006;BA.debugLine="If  Cur.GetColumnName(i)=\"fldArzeshAfzode\" Then";
if ((_cur.GetColumnName(_i)).equals("fldArzeshAfzode")) { 
RDebugUtils.currentLine=19792007;
 //BA.debugLineNum = 19792007;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19792008;
 //BA.debugLineNum = 19792008;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19792011;
 //BA.debugLineNum = 19792011;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19792012;
 //BA.debugLineNum = 19792012;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblKala ADD fldArzeshAfzode Text");
RDebugUtils.currentLine=19792013;
 //BA.debugLineNum = 19792013;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19792014;
 //BA.debugLineNum = 19792014;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19792017;
 //BA.debugLineNum = 19792017;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabaseashkhas(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "updatedatabaseashkhas", false))
	 {return ((String) Debug.delegate(null, "updatedatabaseashkhas", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Sub UpdateDataBaseAshkhas";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhas")));
RDebugUtils.currentLine=19857414;
 //BA.debugLineNum = 19857414;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=19857415;
 //BA.debugLineNum = 19857415;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSync\" Then";
if ((_cur.GetColumnName(_i)).equals("FldSync")) { 
RDebugUtils.currentLine=19857416;
 //BA.debugLineNum = 19857416;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19857417;
 //BA.debugLineNum = 19857417;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19857420;
 //BA.debugLineNum = 19857420;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19857421;
 //BA.debugLineNum = 19857421;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD FldSync Text");
RDebugUtils.currentLine=19857422;
 //BA.debugLineNum = 19857422;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19857423;
 //BA.debugLineNum = 19857423;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19857426;
 //BA.debugLineNum = 19857426;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19857427;
 //BA.debugLineNum = 19857427;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhas")));
RDebugUtils.currentLine=19857428;
 //BA.debugLineNum = 19857428;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step18 = 1;
final int limit18 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=19857429;
 //BA.debugLineNum = 19857429;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMobile\" Then";
if ((_cur.GetColumnName(_i)).equals("FldMobile")) { 
RDebugUtils.currentLine=19857430;
 //BA.debugLineNum = 19857430;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19857431;
 //BA.debugLineNum = 19857431;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19857434;
 //BA.debugLineNum = 19857434;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19857435;
 //BA.debugLineNum = 19857435;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD FldMobile Text");
RDebugUtils.currentLine=19857436;
 //BA.debugLineNum = 19857436;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD FldC_Meli Text");
RDebugUtils.currentLine=19857437;
 //BA.debugLineNum = 19857437;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD FldC_Posti Text");
RDebugUtils.currentLine=19857438;
 //BA.debugLineNum = 19857438;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD FldShomarehesab Text");
RDebugUtils.currentLine=19857439;
 //BA.debugLineNum = 19857439;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD FldLastVisit Text");
RDebugUtils.currentLine=19857440;
 //BA.debugLineNum = 19857440;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD FldLastSefaresh Text");
RDebugUtils.currentLine=19857441;
 //BA.debugLineNum = 19857441;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD FldVaziat Text");
RDebugUtils.currentLine=19857442;
 //BA.debugLineNum = 19857442;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD FldEtebar Text");
RDebugUtils.currentLine=19857443;
 //BA.debugLineNum = 19857443;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD lastSeen Text");
RDebugUtils.currentLine=19857444;
 //BA.debugLineNum = 19857444;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD lastOrderDate Text");
RDebugUtils.currentLine=19857445;
 //BA.debugLineNum = 19857445;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19857446;
 //BA.debugLineNum = 19857446;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19857448;
 //BA.debugLineNum = 19857448;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19857449;
 //BA.debugLineNum = 19857449;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhas")));
RDebugUtils.currentLine=19857450;
 //BA.debugLineNum = 19857450;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step40 = 1;
final int limit40 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit40 ;_i = _i + step40 ) {
RDebugUtils.currentLine=19857451;
 //BA.debugLineNum = 19857451;BA.debugLine="If  Cur.GetColumnName(i)=\"fldBlackList\" Then";
if ((_cur.GetColumnName(_i)).equals("fldBlackList")) { 
RDebugUtils.currentLine=19857452;
 //BA.debugLineNum = 19857452;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19857453;
 //BA.debugLineNum = 19857453;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19857456;
 //BA.debugLineNum = 19857456;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19857457;
 //BA.debugLineNum = 19857457;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD fldBlackList Text");
RDebugUtils.currentLine=19857458;
 //BA.debugLineNum = 19857458;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19857459;
 //BA.debugLineNum = 19857459;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19857461;
 //BA.debugLineNum = 19857461;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19857462;
 //BA.debugLineNum = 19857462;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhas")));
RDebugUtils.currentLine=19857463;
 //BA.debugLineNum = 19857463;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step53 = 1;
final int limit53 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit53 ;_i = _i + step53 ) {
RDebugUtils.currentLine=19857464;
 //BA.debugLineNum = 19857464;BA.debugLine="If  Cur.GetColumnName(i)=\"fldSaghfeEtebar\" Then";
if ((_cur.GetColumnName(_i)).equals("fldSaghfeEtebar")) { 
RDebugUtils.currentLine=19857465;
 //BA.debugLineNum = 19857465;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19857466;
 //BA.debugLineNum = 19857466;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19857469;
 //BA.debugLineNum = 19857469;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19857470;
 //BA.debugLineNum = 19857470;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD fldSaghfeEtebar Text");
RDebugUtils.currentLine=19857471;
 //BA.debugLineNum = 19857471;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19857472;
 //BA.debugLineNum = 19857472;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19857474;
 //BA.debugLineNum = 19857474;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19857475;
 //BA.debugLineNum = 19857475;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhas")));
RDebugUtils.currentLine=19857476;
 //BA.debugLineNum = 19857476;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step66 = 1;
final int limit66 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit66 ;_i = _i + step66 ) {
RDebugUtils.currentLine=19857477;
 //BA.debugLineNum = 19857477;BA.debugLine="If  Cur.GetColumnName(i)=\"fldCodeMovaghat\" Then";
if ((_cur.GetColumnName(_i)).equals("fldCodeMovaghat")) { 
RDebugUtils.currentLine=19857478;
 //BA.debugLineNum = 19857478;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19857479;
 //BA.debugLineNum = 19857479;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19857482;
 //BA.debugLineNum = 19857482;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19857483;
 //BA.debugLineNum = 19857483;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhas ADD fldCodeMovaghat Text");
RDebugUtils.currentLine=19857484;
 //BA.debugLineNum = 19857484;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19857485;
 //BA.debugLineNum = 19857485;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19857487;
 //BA.debugLineNum = 19857487;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabasesabad(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "updatedatabasesabad", false))
	 {return ((String) Debug.delegate(null, "updatedatabasesabad", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Sub UpdateDataBaseSabad";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=19922951;
 //BA.debugLineNum = 19922951;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTozihat\" Then";
if ((_cur.GetColumnName(_i)).equals("FldTozihat")) { 
RDebugUtils.currentLine=19922952;
 //BA.debugLineNum = 19922952;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19922953;
 //BA.debugLineNum = 19922953;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19922956;
 //BA.debugLineNum = 19922956;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19922957;
 //BA.debugLineNum = 19922957;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD FldTozihat varchar");
RDebugUtils.currentLine=19922958;
 //BA.debugLineNum = 19922958;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19922959;
 //BA.debugLineNum = 19922959;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19922962;
 //BA.debugLineNum = 19922962;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19922963;
 //BA.debugLineNum = 19922963;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19922964;
 //BA.debugLineNum = 19922964;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step18 = 1;
final int limit18 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=19922965;
 //BA.debugLineNum = 19922965;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVaziatPardakht\" The";
if ((_cur.GetColumnName(_i)).equals("FldVaziatPardakht")) { 
RDebugUtils.currentLine=19922966;
 //BA.debugLineNum = 19922966;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19922967;
 //BA.debugLineNum = 19922967;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19922970;
 //BA.debugLineNum = 19922970;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19922971;
 //BA.debugLineNum = 19922971;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD FldVaziatPardakht varchar");
RDebugUtils.currentLine=19922972;
 //BA.debugLineNum = 19922972;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19922973;
 //BA.debugLineNum = 19922973;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19922976;
 //BA.debugLineNum = 19922976;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19922977;
 //BA.debugLineNum = 19922977;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step30 = 1;
final int limit30 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit30 ;_i = _i + step30 ) {
RDebugUtils.currentLine=19922978;
 //BA.debugLineNum = 19922978;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghMasrafKonand";
if ((_cur.GetColumnName(_i)).equals("FldMablaghMasrafKonande")) { 
RDebugUtils.currentLine=19922979;
 //BA.debugLineNum = 19922979;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19922980;
 //BA.debugLineNum = 19922980;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19922983;
 //BA.debugLineNum = 19922983;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19922984;
 //BA.debugLineNum = 19922984;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD FldMablaghMasrafKonande Text");
RDebugUtils.currentLine=19922985;
 //BA.debugLineNum = 19922985;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19922986;
 //BA.debugLineNum = 19922986;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19922989;
 //BA.debugLineNum = 19922989;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19922990;
 //BA.debugLineNum = 19922990;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19922991;
 //BA.debugLineNum = 19922991;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step43 = 1;
final int limit43 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=19922992;
 //BA.debugLineNum = 19922992;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghTakhfif\" The";
if ((_cur.GetColumnName(_i)).equals("FldMablaghTakhfif")) { 
RDebugUtils.currentLine=19922993;
 //BA.debugLineNum = 19922993;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19922994;
 //BA.debugLineNum = 19922994;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19922997;
 //BA.debugLineNum = 19922997;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19922998;
 //BA.debugLineNum = 19922998;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD FldMablaghTakhfif Text");
RDebugUtils.currentLine=19922999;
 //BA.debugLineNum = 19922999;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923000;
 //BA.debugLineNum = 19923000;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923003;
 //BA.debugLineNum = 19923003;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923004;
 //BA.debugLineNum = 19923004;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923005;
 //BA.debugLineNum = 19923005;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step56 = 1;
final int limit56 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit56 ;_i = _i + step56 ) {
RDebugUtils.currentLine=19923006;
 //BA.debugLineNum = 19923006;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDarsadTakhfif\" Then";
if ((_cur.GetColumnName(_i)).equals("FldDarsadTakhfif")) { 
RDebugUtils.currentLine=19923007;
 //BA.debugLineNum = 19923007;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923008;
 //BA.debugLineNum = 19923008;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923011;
 //BA.debugLineNum = 19923011;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923012;
 //BA.debugLineNum = 19923012;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD FldDarsadTakhfif Text");
RDebugUtils.currentLine=19923013;
 //BA.debugLineNum = 19923013;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923014;
 //BA.debugLineNum = 19923014;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923017;
 //BA.debugLineNum = 19923017;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923018;
 //BA.debugLineNum = 19923018;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923019;
 //BA.debugLineNum = 19923019;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step69 = 1;
final int limit69 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit69 ;_i = _i + step69 ) {
RDebugUtils.currentLine=19923020;
 //BA.debugLineNum = 19923020;BA.debugLine="If  Cur.GetColumnName(i)=\"FldupdateFee\" Then";
if ((_cur.GetColumnName(_i)).equals("FldupdateFee")) { 
RDebugUtils.currentLine=19923021;
 //BA.debugLineNum = 19923021;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923022;
 //BA.debugLineNum = 19923022;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923025;
 //BA.debugLineNum = 19923025;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923026;
 //BA.debugLineNum = 19923026;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD FldupdateFee Text");
RDebugUtils.currentLine=19923027;
 //BA.debugLineNum = 19923027;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923028;
 //BA.debugLineNum = 19923028;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923031;
 //BA.debugLineNum = 19923031;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923032;
 //BA.debugLineNum = 19923032;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923033;
 //BA.debugLineNum = 19923033;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step82 = 1;
final int limit82 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit82 ;_i = _i + step82 ) {
RDebugUtils.currentLine=19923034;
 //BA.debugLineNum = 19923034;BA.debugLine="If  Cur.GetColumnName(i)=\"fldFeeBadAzTakhfif\" Th";
if ((_cur.GetColumnName(_i)).equals("fldFeeBadAzTakhfif")) { 
RDebugUtils.currentLine=19923035;
 //BA.debugLineNum = 19923035;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923036;
 //BA.debugLineNum = 19923036;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923039;
 //BA.debugLineNum = 19923039;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923040;
 //BA.debugLineNum = 19923040;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD fldFeeBadAzTakhfif Text");
RDebugUtils.currentLine=19923041;
 //BA.debugLineNum = 19923041;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923042;
 //BA.debugLineNum = 19923042;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923044;
 //BA.debugLineNum = 19923044;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923045;
 //BA.debugLineNum = 19923045;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923046;
 //BA.debugLineNum = 19923046;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step95 = 1;
final int limit95 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit95 ;_i = _i + step95 ) {
RDebugUtils.currentLine=19923047;
 //BA.debugLineNum = 19923047;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPic\" Then";
if ((_cur.GetColumnName(_i)).equals("fldPathPic")) { 
RDebugUtils.currentLine=19923048;
 //BA.debugLineNum = 19923048;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923049;
 //BA.debugLineNum = 19923049;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923052;
 //BA.debugLineNum = 19923052;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923053;
 //BA.debugLineNum = 19923053;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD fldPathPic Text");
RDebugUtils.currentLine=19923054;
 //BA.debugLineNum = 19923054;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923055;
 //BA.debugLineNum = 19923055;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923058;
 //BA.debugLineNum = 19923058;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923059;
 //BA.debugLineNum = 19923059;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923060;
 //BA.debugLineNum = 19923060;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step108 = 1;
final int limit108 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit108 ;_i = _i + step108 ) {
RDebugUtils.currentLine=19923061;
 //BA.debugLineNum = 19923061;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPicOffline\" The";
if ((_cur.GetColumnName(_i)).equals("fldPathPicOffline")) { 
RDebugUtils.currentLine=19923062;
 //BA.debugLineNum = 19923062;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923063;
 //BA.debugLineNum = 19923063;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923066;
 //BA.debugLineNum = 19923066;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923067;
 //BA.debugLineNum = 19923067;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD fldPathPicOffline Text");
RDebugUtils.currentLine=19923068;
 //BA.debugLineNum = 19923068;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923069;
 //BA.debugLineNum = 19923069;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923071;
 //BA.debugLineNum = 19923071;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923072;
 //BA.debugLineNum = 19923072;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923073;
 //BA.debugLineNum = 19923073;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step121 = 1;
final int limit121 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit121 ;_i = _i + step121 ) {
RDebugUtils.currentLine=19923074;
 //BA.debugLineNum = 19923074;BA.debugLine="If  Cur.GetColumnName(i)=\"fldSharh\" Then";
if ((_cur.GetColumnName(_i)).equals("fldSharh")) { 
RDebugUtils.currentLine=19923075;
 //BA.debugLineNum = 19923075;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923076;
 //BA.debugLineNum = 19923076;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923079;
 //BA.debugLineNum = 19923079;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923080;
 //BA.debugLineNum = 19923080;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD fldSharh Text");
RDebugUtils.currentLine=19923081;
 //BA.debugLineNum = 19923081;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923082;
 //BA.debugLineNum = 19923082;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923084;
 //BA.debugLineNum = 19923084;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923085;
 //BA.debugLineNum = 19923085;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923086;
 //BA.debugLineNum = 19923086;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step134 = 1;
final int limit134 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit134 ;_i = _i + step134 ) {
RDebugUtils.currentLine=19923087;
 //BA.debugLineNum = 19923087;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSumMande\" Then";
if ((_cur.GetColumnName(_i)).equals("FldSumMande")) { 
RDebugUtils.currentLine=19923088;
 //BA.debugLineNum = 19923088;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923089;
 //BA.debugLineNum = 19923089;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923092;
 //BA.debugLineNum = 19923092;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923093;
 //BA.debugLineNum = 19923093;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD FldSumMande Text");
RDebugUtils.currentLine=19923094;
 //BA.debugLineNum = 19923094;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923095;
 //BA.debugLineNum = 19923095;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923097;
 //BA.debugLineNum = 19923097;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923098;
 //BA.debugLineNum = 19923098;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923099;
 //BA.debugLineNum = 19923099;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step147 = 1;
final int limit147 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit147 ;_i = _i + step147 ) {
RDebugUtils.currentLine=19923100;
 //BA.debugLineNum = 19923100;BA.debugLine="If  Cur.GetColumnName(i)=\"FldEshantion\" Then";
if ((_cur.GetColumnName(_i)).equals("FldEshantion")) { 
RDebugUtils.currentLine=19923101;
 //BA.debugLineNum = 19923101;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923102;
 //BA.debugLineNum = 19923102;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923105;
 //BA.debugLineNum = 19923105;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923106;
 //BA.debugLineNum = 19923106;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD FldEshantion Text");
RDebugUtils.currentLine=19923107;
 //BA.debugLineNum = 19923107;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923108;
 //BA.debugLineNum = 19923108;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923111;
 //BA.debugLineNum = 19923111;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923112;
 //BA.debugLineNum = 19923112;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923113;
 //BA.debugLineNum = 19923113;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step160 = 1;
final int limit160 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit160 ;_i = _i + step160 ) {
RDebugUtils.currentLine=19923114;
 //BA.debugLineNum = 19923114;BA.debugLine="If  Cur.GetColumnName(i)=\"fldCodeGroup\" Then";
if ((_cur.GetColumnName(_i)).equals("fldCodeGroup")) { 
RDebugUtils.currentLine=19923115;
 //BA.debugLineNum = 19923115;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923116;
 //BA.debugLineNum = 19923116;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923119;
 //BA.debugLineNum = 19923119;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923120;
 //BA.debugLineNum = 19923120;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD fldCodeGroup Text");
RDebugUtils.currentLine=19923121;
 //BA.debugLineNum = 19923121;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923122;
 //BA.debugLineNum = 19923122;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923125;
 //BA.debugLineNum = 19923125;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923126;
 //BA.debugLineNum = 19923126;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923127;
 //BA.debugLineNum = 19923127;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step173 = 1;
final int limit173 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit173 ;_i = _i + step173 ) {
RDebugUtils.currentLine=19923128;
 //BA.debugLineNum = 19923128;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAmani\" Then";
if ((_cur.GetColumnName(_i)).equals("FldAmani")) { 
RDebugUtils.currentLine=19923129;
 //BA.debugLineNum = 19923129;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923130;
 //BA.debugLineNum = 19923130;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923133;
 //BA.debugLineNum = 19923133;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923134;
 //BA.debugLineNum = 19923134;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD FldAmani Text");
RDebugUtils.currentLine=19923135;
 //BA.debugLineNum = 19923135;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923136;
 //BA.debugLineNum = 19923136;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923138;
 //BA.debugLineNum = 19923138;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923139;
 //BA.debugLineNum = 19923139;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923140;
 //BA.debugLineNum = 19923140;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step186 = 1;
final int limit186 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit186 ;_i = _i + step186 ) {
RDebugUtils.currentLine=19923141;
 //BA.debugLineNum = 19923141;BA.debugLine="If  Cur.GetColumnName(i)=\"fldShomareForoosh\" The";
if ((_cur.GetColumnName(_i)).equals("fldShomareForoosh")) { 
RDebugUtils.currentLine=19923142;
 //BA.debugLineNum = 19923142;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923143;
 //BA.debugLineNum = 19923143;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923146;
 //BA.debugLineNum = 19923146;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923147;
 //BA.debugLineNum = 19923147;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD fldShomareForoosh Text");
RDebugUtils.currentLine=19923148;
 //BA.debugLineNum = 19923148;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923149;
 //BA.debugLineNum = 19923149;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923152;
 //BA.debugLineNum = 19923152;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923155;
 //BA.debugLineNum = 19923155;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923156;
 //BA.debugLineNum = 19923156;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step199 = 1;
final int limit199 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit199 ;_i = _i + step199 ) {
RDebugUtils.currentLine=19923157;
 //BA.debugLineNum = 19923157;BA.debugLine="If  Cur.GetColumnName(i)=\"fldDarsadArzeshAfzode\"";
if ((_cur.GetColumnName(_i)).equals("fldDarsadArzeshAfzode")) { 
RDebugUtils.currentLine=19923158;
 //BA.debugLineNum = 19923158;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923159;
 //BA.debugLineNum = 19923159;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923162;
 //BA.debugLineNum = 19923162;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923163;
 //BA.debugLineNum = 19923163;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD fldDarsadArzeshAfzode Text");
RDebugUtils.currentLine=19923164;
 //BA.debugLineNum = 19923164;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923165;
 //BA.debugLineNum = 19923165;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923167;
 //BA.debugLineNum = 19923167;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923170;
 //BA.debugLineNum = 19923170;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblSabad")));
RDebugUtils.currentLine=19923171;
 //BA.debugLineNum = 19923171;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step212 = 1;
final int limit212 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit212 ;_i = _i + step212 ) {
RDebugUtils.currentLine=19923172;
 //BA.debugLineNum = 19923172;BA.debugLine="If  Cur.GetColumnName(i)=\"fldArzeshAfzode\" Then";
if ((_cur.GetColumnName(_i)).equals("fldArzeshAfzode")) { 
RDebugUtils.currentLine=19923173;
 //BA.debugLineNum = 19923173;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19923174;
 //BA.debugLineNum = 19923174;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19923177;
 //BA.debugLineNum = 19923177;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19923178;
 //BA.debugLineNum = 19923178;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblSabad ADD fldArzeshAfzode Text");
RDebugUtils.currentLine=19923179;
 //BA.debugLineNum = 19923179;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19923180;
 //BA.debugLineNum = 19923180;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19923182;
 //BA.debugLineNum = 19923182;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19923183;
 //BA.debugLineNum = 19923183;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabasefactor(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "updatedatabasefactor", false))
	 {return ((String) Debug.delegate(null, "updatedatabasefactor", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Sub UpdateDataBaseFactor";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTozih\" Then";
if ((_cur.GetColumnName(_i)).equals("FldTozih")) { 
RDebugUtils.currentLine=19988488;
 //BA.debugLineNum = 19988488;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988489;
 //BA.debugLineNum = 19988489;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988492;
 //BA.debugLineNum = 19988492;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988493;
 //BA.debugLineNum = 19988493;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldTozih Text");
RDebugUtils.currentLine=19988494;
 //BA.debugLineNum = 19988494;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988495;
 //BA.debugLineNum = 19988495;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988498;
 //BA.debugLineNum = 19988498;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988499;
 //BA.debugLineNum = 19988499;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988500;
 //BA.debugLineNum = 19988500;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step18 = 1;
final int limit18 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=19988501;
 //BA.debugLineNum = 19988501;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateTahvilKala\" The";
if ((_cur.GetColumnName(_i)).equals("FldDateTahvilKala")) { 
RDebugUtils.currentLine=19988502;
 //BA.debugLineNum = 19988502;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988503;
 //BA.debugLineNum = 19988503;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988506;
 //BA.debugLineNum = 19988506;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988507;
 //BA.debugLineNum = 19988507;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldDateTahvilKala Text");
RDebugUtils.currentLine=19988508;
 //BA.debugLineNum = 19988508;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988509;
 //BA.debugLineNum = 19988509;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988512;
 //BA.debugLineNum = 19988512;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988513;
 //BA.debugLineNum = 19988513;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988514;
 //BA.debugLineNum = 19988514;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step31 = 1;
final int limit31 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=19988515;
 //BA.debugLineNum = 19988515;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVaziatPardakhti\" Th";
if ((_cur.GetColumnName(_i)).equals("FldVaziatPardakhti")) { 
RDebugUtils.currentLine=19988516;
 //BA.debugLineNum = 19988516;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988517;
 //BA.debugLineNum = 19988517;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988520;
 //BA.debugLineNum = 19988520;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988521;
 //BA.debugLineNum = 19988521;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldVaziatPardakhti varchar");
RDebugUtils.currentLine=19988522;
 //BA.debugLineNum = 19988522;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988523;
 //BA.debugLineNum = 19988523;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988525;
 //BA.debugLineNum = 19988525;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988528;
 //BA.debugLineNum = 19988528;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988529;
 //BA.debugLineNum = 19988529;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step44 = 1;
final int limit44 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit44 ;_i = _i + step44 ) {
RDebugUtils.currentLine=19988530;
 //BA.debugLineNum = 19988530;BA.debugLine="If  Cur.GetColumnName(i)=\"fldDarsadArzeshAfzode\"";
if ((_cur.GetColumnName(_i)).equals("fldDarsadArzeshAfzode")) { 
RDebugUtils.currentLine=19988531;
 //BA.debugLineNum = 19988531;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988532;
 //BA.debugLineNum = 19988532;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988535;
 //BA.debugLineNum = 19988535;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988536;
 //BA.debugLineNum = 19988536;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD fldDarsadArzeshAfzode Text");
RDebugUtils.currentLine=19988537;
 //BA.debugLineNum = 19988537;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988538;
 //BA.debugLineNum = 19988538;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988540;
 //BA.debugLineNum = 19988540;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988543;
 //BA.debugLineNum = 19988543;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988544;
 //BA.debugLineNum = 19988544;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step57 = 1;
final int limit57 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit57 ;_i = _i + step57 ) {
RDebugUtils.currentLine=19988545;
 //BA.debugLineNum = 19988545;BA.debugLine="If  Cur.GetColumnName(i)=\"fldArzeshAfzode\" Then";
if ((_cur.GetColumnName(_i)).equals("fldArzeshAfzode")) { 
RDebugUtils.currentLine=19988546;
 //BA.debugLineNum = 19988546;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988547;
 //BA.debugLineNum = 19988547;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988550;
 //BA.debugLineNum = 19988550;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988551;
 //BA.debugLineNum = 19988551;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD fldArzeshAfzode Text");
RDebugUtils.currentLine=19988552;
 //BA.debugLineNum = 19988552;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988553;
 //BA.debugLineNum = 19988553;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988555;
 //BA.debugLineNum = 19988555;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988556;
 //BA.debugLineNum = 19988556;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988557;
 //BA.debugLineNum = 19988557;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step70 = 1;
final int limit70 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit70 ;_i = _i + step70 ) {
RDebugUtils.currentLine=19988558;
 //BA.debugLineNum = 19988558;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTozihat\" Then";
if ((_cur.GetColumnName(_i)).equals("FldTozihat")) { 
RDebugUtils.currentLine=19988559;
 //BA.debugLineNum = 19988559;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988560;
 //BA.debugLineNum = 19988560;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988563;
 //BA.debugLineNum = 19988563;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988564;
 //BA.debugLineNum = 19988564;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldTozihat varchar");
RDebugUtils.currentLine=19988565;
 //BA.debugLineNum = 19988565;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988566;
 //BA.debugLineNum = 19988566;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988569;
 //BA.debugLineNum = 19988569;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988570;
 //BA.debugLineNum = 19988570;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step82 = 1;
final int limit82 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit82 ;_i = _i + step82 ) {
RDebugUtils.currentLine=19988571;
 //BA.debugLineNum = 19988571;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghMasrafKonand";
if ((_cur.GetColumnName(_i)).equals("FldMablaghMasrafKonande")) { 
RDebugUtils.currentLine=19988572;
 //BA.debugLineNum = 19988572;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988573;
 //BA.debugLineNum = 19988573;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988576;
 //BA.debugLineNum = 19988576;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988577;
 //BA.debugLineNum = 19988577;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldMablaghMasrafKonande Text");
RDebugUtils.currentLine=19988578;
 //BA.debugLineNum = 19988578;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988579;
 //BA.debugLineNum = 19988579;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988581;
 //BA.debugLineNum = 19988581;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988583;
 //BA.debugLineNum = 19988583;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step94 = 1;
final int limit94 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit94 ;_i = _i + step94 ) {
RDebugUtils.currentLine=19988584;
 //BA.debugLineNum = 19988584;BA.debugLine="If  Cur.GetColumnName(i)=\"FldType\" Then";
if ((_cur.GetColumnName(_i)).equals("FldType")) { 
RDebugUtils.currentLine=19988585;
 //BA.debugLineNum = 19988585;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988586;
 //BA.debugLineNum = 19988586;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988589;
 //BA.debugLineNum = 19988589;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988590;
 //BA.debugLineNum = 19988590;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldType Text");
RDebugUtils.currentLine=19988591;
 //BA.debugLineNum = 19988591;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988592;
 //BA.debugLineNum = 19988592;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988595;
 //BA.debugLineNum = 19988595;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988596;
 //BA.debugLineNum = 19988596;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step106 = 1;
final int limit106 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit106 ;_i = _i + step106 ) {
RDebugUtils.currentLine=19988597;
 //BA.debugLineNum = 19988597;BA.debugLine="If  Cur.GetColumnName(i)=\"FldC_Visitor\" Then";
if ((_cur.GetColumnName(_i)).equals("FldC_Visitor")) { 
RDebugUtils.currentLine=19988598;
 //BA.debugLineNum = 19988598;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988599;
 //BA.debugLineNum = 19988599;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988602;
 //BA.debugLineNum = 19988602;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988603;
 //BA.debugLineNum = 19988603;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldC_Visitor Text");
RDebugUtils.currentLine=19988604;
 //BA.debugLineNum = 19988604;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988605;
 //BA.debugLineNum = 19988605;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988608;
 //BA.debugLineNum = 19988608;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988609;
 //BA.debugLineNum = 19988609;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988610;
 //BA.debugLineNum = 19988610;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step119 = 1;
final int limit119 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit119 ;_i = _i + step119 ) {
RDebugUtils.currentLine=19988611;
 //BA.debugLineNum = 19988611;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghTakhfif\" The";
if ((_cur.GetColumnName(_i)).equals("FldMablaghTakhfif")) { 
RDebugUtils.currentLine=19988612;
 //BA.debugLineNum = 19988612;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988613;
 //BA.debugLineNum = 19988613;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988616;
 //BA.debugLineNum = 19988616;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988617;
 //BA.debugLineNum = 19988617;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldMablaghTakhfif Text");
RDebugUtils.currentLine=19988618;
 //BA.debugLineNum = 19988618;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988619;
 //BA.debugLineNum = 19988619;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988622;
 //BA.debugLineNum = 19988622;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988623;
 //BA.debugLineNum = 19988623;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988624;
 //BA.debugLineNum = 19988624;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step132 = 1;
final int limit132 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit132 ;_i = _i + step132 ) {
RDebugUtils.currentLine=19988625;
 //BA.debugLineNum = 19988625;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDarsadTakhfif\" Then";
if ((_cur.GetColumnName(_i)).equals("FldDarsadTakhfif")) { 
RDebugUtils.currentLine=19988626;
 //BA.debugLineNum = 19988626;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988627;
 //BA.debugLineNum = 19988627;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988630;
 //BA.debugLineNum = 19988630;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988631;
 //BA.debugLineNum = 19988631;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldDarsadTakhfif Text");
RDebugUtils.currentLine=19988632;
 //BA.debugLineNum = 19988632;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988633;
 //BA.debugLineNum = 19988633;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19988634;
 //BA.debugLineNum = 19988634;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblFaktor Set Fl";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblFaktor Set FldDarsadTakhfif='0'");
 };
RDebugUtils.currentLine=19988636;
 //BA.debugLineNum = 19988636;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988637;
 //BA.debugLineNum = 19988637;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988638;
 //BA.debugLineNum = 19988638;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step146 = 1;
final int limit146 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit146 ;_i = _i + step146 ) {
RDebugUtils.currentLine=19988639;
 //BA.debugLineNum = 19988639;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSumMablaghTakhfifVi";
if ((_cur.GetColumnName(_i)).equals("FldSumMablaghTakhfifVizhe")) { 
RDebugUtils.currentLine=19988640;
 //BA.debugLineNum = 19988640;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988641;
 //BA.debugLineNum = 19988641;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988644;
 //BA.debugLineNum = 19988644;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988645;
 //BA.debugLineNum = 19988645;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldSumMablaghTakhfifVizhe Text");
RDebugUtils.currentLine=19988646;
 //BA.debugLineNum = 19988646;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988647;
 //BA.debugLineNum = 19988647;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988650;
 //BA.debugLineNum = 19988650;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988651;
 //BA.debugLineNum = 19988651;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988652;
 //BA.debugLineNum = 19988652;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step159 = 1;
final int limit159 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit159 ;_i = _i + step159 ) {
RDebugUtils.currentLine=19988653;
 //BA.debugLineNum = 19988653;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSumMablaghTakhfifKa";
if ((_cur.GetColumnName(_i)).equals("FldSumMablaghTakhfifKala")) { 
RDebugUtils.currentLine=19988654;
 //BA.debugLineNum = 19988654;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988655;
 //BA.debugLineNum = 19988655;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988658;
 //BA.debugLineNum = 19988658;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988659;
 //BA.debugLineNum = 19988659;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldSumMablaghTakhfifKala Text");
RDebugUtils.currentLine=19988660;
 //BA.debugLineNum = 19988660;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988661;
 //BA.debugLineNum = 19988661;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988664;
 //BA.debugLineNum = 19988664;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988665;
 //BA.debugLineNum = 19988665;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988666;
 //BA.debugLineNum = 19988666;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step172 = 1;
final int limit172 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit172 ;_i = _i + step172 ) {
RDebugUtils.currentLine=19988667;
 //BA.debugLineNum = 19988667;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDate\" Then";
if ((_cur.GetColumnName(_i)).equals("FldDate")) { 
RDebugUtils.currentLine=19988668;
 //BA.debugLineNum = 19988668;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988669;
 //BA.debugLineNum = 19988669;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988672;
 //BA.debugLineNum = 19988672;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988673;
 //BA.debugLineNum = 19988673;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldDate Text");
RDebugUtils.currentLine=19988674;
 //BA.debugLineNum = 19988674;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988675;
 //BA.debugLineNum = 19988675;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988678;
 //BA.debugLineNum = 19988678;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988679;
 //BA.debugLineNum = 19988679;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988680;
 //BA.debugLineNum = 19988680;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step185 = 1;
final int limit185 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit185 ;_i = _i + step185 ) {
RDebugUtils.currentLine=19988681;
 //BA.debugLineNum = 19988681;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTime\" Then";
if ((_cur.GetColumnName(_i)).equals("FldTime")) { 
RDebugUtils.currentLine=19988682;
 //BA.debugLineNum = 19988682;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988683;
 //BA.debugLineNum = 19988683;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988686;
 //BA.debugLineNum = 19988686;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988687;
 //BA.debugLineNum = 19988687;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldTime Text");
RDebugUtils.currentLine=19988688;
 //BA.debugLineNum = 19988688;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988689;
 //BA.debugLineNum = 19988689;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988692;
 //BA.debugLineNum = 19988692;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988693;
 //BA.debugLineNum = 19988693;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988694;
 //BA.debugLineNum = 19988694;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step198 = 1;
final int limit198 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit198 ;_i = _i + step198 ) {
RDebugUtils.currentLine=19988695;
 //BA.debugLineNum = 19988695;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTotalFaktor\" Then";
if ((_cur.GetColumnName(_i)).equals("FldTotalFaktor")) { 
RDebugUtils.currentLine=19988696;
 //BA.debugLineNum = 19988696;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988697;
 //BA.debugLineNum = 19988697;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988700;
 //BA.debugLineNum = 19988700;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988701;
 //BA.debugLineNum = 19988701;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldTotalFaktor Text");
RDebugUtils.currentLine=19988702;
 //BA.debugLineNum = 19988702;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988703;
 //BA.debugLineNum = 19988703;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988706;
 //BA.debugLineNum = 19988706;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988707;
 //BA.debugLineNum = 19988707;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988708;
 //BA.debugLineNum = 19988708;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step211 = 1;
final int limit211 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit211 ;_i = _i + step211 ) {
RDebugUtils.currentLine=19988709;
 //BA.debugLineNum = 19988709;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSumMande\" Then";
if ((_cur.GetColumnName(_i)).equals("FldSumMande")) { 
RDebugUtils.currentLine=19988710;
 //BA.debugLineNum = 19988710;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988711;
 //BA.debugLineNum = 19988711;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988714;
 //BA.debugLineNum = 19988714;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988715;
 //BA.debugLineNum = 19988715;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldSumMande Text");
RDebugUtils.currentLine=19988716;
 //BA.debugLineNum = 19988716;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988717;
 //BA.debugLineNum = 19988717;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988720;
 //BA.debugLineNum = 19988720;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988721;
 //BA.debugLineNum = 19988721;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988722;
 //BA.debugLineNum = 19988722;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step224 = 1;
final int limit224 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit224 ;_i = _i + step224 ) {
RDebugUtils.currentLine=19988723;
 //BA.debugLineNum = 19988723;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSync\" Then";
if ((_cur.GetColumnName(_i)).equals("FldSync")) { 
RDebugUtils.currentLine=19988724;
 //BA.debugLineNum = 19988724;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988725;
 //BA.debugLineNum = 19988725;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988728;
 //BA.debugLineNum = 19988728;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988729;
 //BA.debugLineNum = 19988729;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldSync Text");
RDebugUtils.currentLine=19988730;
 //BA.debugLineNum = 19988730;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988731;
 //BA.debugLineNum = 19988731;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988734;
 //BA.debugLineNum = 19988734;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988735;
 //BA.debugLineNum = 19988735;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988736;
 //BA.debugLineNum = 19988736;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step237 = 1;
final int limit237 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit237 ;_i = _i + step237 ) {
RDebugUtils.currentLine=19988737;
 //BA.debugLineNum = 19988737;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPicOffline\" The";
if ((_cur.GetColumnName(_i)).equals("fldPathPicOffline")) { 
RDebugUtils.currentLine=19988738;
 //BA.debugLineNum = 19988738;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988739;
 //BA.debugLineNum = 19988739;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988742;
 //BA.debugLineNum = 19988742;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988743;
 //BA.debugLineNum = 19988743;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor AD";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD fldPathPicOffline Text");
RDebugUtils.currentLine=19988744;
 //BA.debugLineNum = 19988744;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988745;
 //BA.debugLineNum = 19988745;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988748;
 //BA.debugLineNum = 19988748;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988749;
 //BA.debugLineNum = 19988749;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988750;
 //BA.debugLineNum = 19988750;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step250 = 1;
final int limit250 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit250 ;_i = _i + step250 ) {
RDebugUtils.currentLine=19988751;
 //BA.debugLineNum = 19988751;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPic\" Then";
if ((_cur.GetColumnName(_i)).equals("fldPathPic")) { 
RDebugUtils.currentLine=19988752;
 //BA.debugLineNum = 19988752;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988753;
 //BA.debugLineNum = 19988753;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988756;
 //BA.debugLineNum = 19988756;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988757;
 //BA.debugLineNum = 19988757;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD fldPathPic Text");
RDebugUtils.currentLine=19988758;
 //BA.debugLineNum = 19988758;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988759;
 //BA.debugLineNum = 19988759;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988762;
 //BA.debugLineNum = 19988762;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988764;
 //BA.debugLineNum = 19988764;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988765;
 //BA.debugLineNum = 19988765;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step263 = 1;
final int limit263 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit263 ;_i = _i + step263 ) {
RDebugUtils.currentLine=19988766;
 //BA.debugLineNum = 19988766;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghTakhfifKol\"";
if ((_cur.GetColumnName(_i)).equals("FldMablaghTakhfifKol")) { 
RDebugUtils.currentLine=19988767;
 //BA.debugLineNum = 19988767;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988768;
 //BA.debugLineNum = 19988768;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988771;
 //BA.debugLineNum = 19988771;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988772;
 //BA.debugLineNum = 19988772;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldMablaghTakhfifKol Text");
RDebugUtils.currentLine=19988773;
 //BA.debugLineNum = 19988773;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988774;
 //BA.debugLineNum = 19988774;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988777;
 //BA.debugLineNum = 19988777;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988779;
 //BA.debugLineNum = 19988779;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988780;
 //BA.debugLineNum = 19988780;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step276 = 1;
final int limit276 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit276 ;_i = _i + step276 ) {
RDebugUtils.currentLine=19988781;
 //BA.debugLineNum = 19988781;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghKol\" Then";
if ((_cur.GetColumnName(_i)).equals("FldMablaghKol")) { 
RDebugUtils.currentLine=19988782;
 //BA.debugLineNum = 19988782;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988783;
 //BA.debugLineNum = 19988783;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988786;
 //BA.debugLineNum = 19988786;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988787;
 //BA.debugLineNum = 19988787;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldMablaghKol Text");
RDebugUtils.currentLine=19988788;
 //BA.debugLineNum = 19988788;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988789;
 //BA.debugLineNum = 19988789;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988792;
 //BA.debugLineNum = 19988792;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988794;
 //BA.debugLineNum = 19988794;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988795;
 //BA.debugLineNum = 19988795;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step289 = 1;
final int limit289 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit289 ;_i = _i + step289 ) {
RDebugUtils.currentLine=19988796;
 //BA.debugLineNum = 19988796;BA.debugLine="If  Cur.GetColumnName(i)=\"WIsBacked\" Then";
if ((_cur.GetColumnName(_i)).equals("WIsBacked")) { 
RDebugUtils.currentLine=19988797;
 //BA.debugLineNum = 19988797;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988798;
 //BA.debugLineNum = 19988798;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988801;
 //BA.debugLineNum = 19988801;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988802;
 //BA.debugLineNum = 19988802;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD WIsBacked Text");
RDebugUtils.currentLine=19988803;
 //BA.debugLineNum = 19988803;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988804;
 //BA.debugLineNum = 19988804;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988807;
 //BA.debugLineNum = 19988807;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988808;
 //BA.debugLineNum = 19988808;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988809;
 //BA.debugLineNum = 19988809;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step302 = 1;
final int limit302 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit302 ;_i = _i + step302 ) {
RDebugUtils.currentLine=19988810;
 //BA.debugLineNum = 19988810;BA.debugLine="If  Cur.GetColumnName(i)=\"WSendFrom\" Then";
if ((_cur.GetColumnName(_i)).equals("WSendFrom")) { 
RDebugUtils.currentLine=19988811;
 //BA.debugLineNum = 19988811;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988812;
 //BA.debugLineNum = 19988812;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988815;
 //BA.debugLineNum = 19988815;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988816;
 //BA.debugLineNum = 19988816;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD WSendFrom Text");
RDebugUtils.currentLine=19988817;
 //BA.debugLineNum = 19988817;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988818;
 //BA.debugLineNum = 19988818;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988821;
 //BA.debugLineNum = 19988821;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988822;
 //BA.debugLineNum = 19988822;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988823;
 //BA.debugLineNum = 19988823;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step315 = 1;
final int limit315 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit315 ;_i = _i + step315 ) {
RDebugUtils.currentLine=19988824;
 //BA.debugLineNum = 19988824;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAmani\" Then";
if ((_cur.GetColumnName(_i)).equals("FldAmani")) { 
RDebugUtils.currentLine=19988825;
 //BA.debugLineNum = 19988825;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988826;
 //BA.debugLineNum = 19988826;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988829;
 //BA.debugLineNum = 19988829;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988830;
 //BA.debugLineNum = 19988830;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldAmani Text");
RDebugUtils.currentLine=19988831;
 //BA.debugLineNum = 19988831;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988832;
 //BA.debugLineNum = 19988832;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19988833;
 //BA.debugLineNum = 19988833;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblFaktor Set Fl";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblFaktor Set FldAmani='0'");
 };
RDebugUtils.currentLine=19988836;
 //BA.debugLineNum = 19988836;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988837;
 //BA.debugLineNum = 19988837;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988838;
 //BA.debugLineNum = 19988838;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step329 = 1;
final int limit329 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit329 ;_i = _i + step329 ) {
RDebugUtils.currentLine=19988839;
 //BA.debugLineNum = 19988839;BA.debugLine="If  Cur.GetColumnName(i)=\"fldShomareFactorReal\"";
if ((_cur.GetColumnName(_i)).equals("fldShomareFactorReal")) { 
RDebugUtils.currentLine=19988840;
 //BA.debugLineNum = 19988840;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988841;
 //BA.debugLineNum = 19988841;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988844;
 //BA.debugLineNum = 19988844;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988845;
 //BA.debugLineNum = 19988845;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD fldShomareFactorReal Text");
RDebugUtils.currentLine=19988846;
 //BA.debugLineNum = 19988846;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988847;
 //BA.debugLineNum = 19988847;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19988848;
 //BA.debugLineNum = 19988848;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblFaktor Set fl";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblFaktor Set fldShomareFactorReal='0'");
 };
RDebugUtils.currentLine=19988851;
 //BA.debugLineNum = 19988851;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988852;
 //BA.debugLineNum = 19988852;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988853;
 //BA.debugLineNum = 19988853;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step343 = 1;
final int limit343 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit343 ;_i = _i + step343 ) {
RDebugUtils.currentLine=19988854;
 //BA.debugLineNum = 19988854;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSignatureBitmapStri";
if ((_cur.GetColumnName(_i)).equals("FldSignatureBitmapString")) { 
RDebugUtils.currentLine=19988855;
 //BA.debugLineNum = 19988855;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988856;
 //BA.debugLineNum = 19988856;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988859;
 //BA.debugLineNum = 19988859;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988860;
 //BA.debugLineNum = 19988860;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldSignatureBitmapString Text");
RDebugUtils.currentLine=19988861;
 //BA.debugLineNum = 19988861;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988862;
 //BA.debugLineNum = 19988862;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988865;
 //BA.debugLineNum = 19988865;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988866;
 //BA.debugLineNum = 19988866;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988867;
 //BA.debugLineNum = 19988867;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step356 = 1;
final int limit356 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit356 ;_i = _i + step356 ) {
RDebugUtils.currentLine=19988868;
 //BA.debugLineNum = 19988868;BA.debugLine="If  Cur.GetColumnName(i)=\"fldFeeBadAzTakhfif\" Th";
if ((_cur.GetColumnName(_i)).equals("fldFeeBadAzTakhfif")) { 
RDebugUtils.currentLine=19988869;
 //BA.debugLineNum = 19988869;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988870;
 //BA.debugLineNum = 19988870;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988873;
 //BA.debugLineNum = 19988873;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988874;
 //BA.debugLineNum = 19988874;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD fldFeeBadAzTakhfif Text");
RDebugUtils.currentLine=19988875;
 //BA.debugLineNum = 19988875;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988876;
 //BA.debugLineNum = 19988876;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988879;
 //BA.debugLineNum = 19988879;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988880;
 //BA.debugLineNum = 19988880;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988881;
 //BA.debugLineNum = 19988881;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step369 = 1;
final int limit369 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit369 ;_i = _i + step369 ) {
RDebugUtils.currentLine=19988882;
 //BA.debugLineNum = 19988882;BA.debugLine="If  Cur.GetColumnName(i)=\"FldNameVahed\" Then";
if ((_cur.GetColumnName(_i)).equals("FldNameVahed")) { 
RDebugUtils.currentLine=19988883;
 //BA.debugLineNum = 19988883;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988884;
 //BA.debugLineNum = 19988884;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988887;
 //BA.debugLineNum = 19988887;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988888;
 //BA.debugLineNum = 19988888;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldNameVahed Text");
RDebugUtils.currentLine=19988889;
 //BA.debugLineNum = 19988889;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988890;
 //BA.debugLineNum = 19988890;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988893;
 //BA.debugLineNum = 19988893;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988894;
 //BA.debugLineNum = 19988894;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988895;
 //BA.debugLineNum = 19988895;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step382 = 1;
final int limit382 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit382 ;_i = _i + step382 ) {
RDebugUtils.currentLine=19988896;
 //BA.debugLineNum = 19988896;BA.debugLine="If  Cur.GetColumnName(i)=\"FldNameVahed2\" Then";
if ((_cur.GetColumnName(_i)).equals("FldNameVahed2")) { 
RDebugUtils.currentLine=19988897;
 //BA.debugLineNum = 19988897;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988898;
 //BA.debugLineNum = 19988898;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988901;
 //BA.debugLineNum = 19988901;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988902;
 //BA.debugLineNum = 19988902;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldNameVahed2 Text");
RDebugUtils.currentLine=19988903;
 //BA.debugLineNum = 19988903;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988904;
 //BA.debugLineNum = 19988904;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988906;
 //BA.debugLineNum = 19988906;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988907;
 //BA.debugLineNum = 19988907;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988908;
 //BA.debugLineNum = 19988908;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step395 = 1;
final int limit395 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit395 ;_i = _i + step395 ) {
RDebugUtils.currentLine=19988909;
 //BA.debugLineNum = 19988909;BA.debugLine="If  Cur.GetColumnName(i)=\"fldShomareForoosh\" The";
if ((_cur.GetColumnName(_i)).equals("fldShomareForoosh")) { 
RDebugUtils.currentLine=19988910;
 //BA.debugLineNum = 19988910;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988911;
 //BA.debugLineNum = 19988911;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988914;
 //BA.debugLineNum = 19988914;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988915;
 //BA.debugLineNum = 19988915;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD fldShomareForoosh Text");
RDebugUtils.currentLine=19988916;
 //BA.debugLineNum = 19988916;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988917;
 //BA.debugLineNum = 19988917;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
RDebugUtils.currentLine=19988918;
 //BA.debugLineNum = 19988918;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblFaktor Set fl";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Update TblFaktor Set fldShomareForoosh='0'");
 };
RDebugUtils.currentLine=19988921;
 //BA.debugLineNum = 19988921;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=19988922;
 //BA.debugLineNum = 19988922;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblFaktor")));
RDebugUtils.currentLine=19988923;
 //BA.debugLineNum = 19988923;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step409 = 1;
final int limit409 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit409 ;_i = _i + step409 ) {
RDebugUtils.currentLine=19988924;
 //BA.debugLineNum = 19988924;BA.debugLine="If  Cur.GetColumnName(i)=\"FldShomareBargasht\" Th";
if ((_cur.GetColumnName(_i)).equals("FldShomareBargasht")) { 
RDebugUtils.currentLine=19988925;
 //BA.debugLineNum = 19988925;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=19988926;
 //BA.debugLineNum = 19988926;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19988929;
 //BA.debugLineNum = 19988929;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=19988930;
 //BA.debugLineNum = 19988930;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblFaktor ADD FldShomareBargasht Text");
RDebugUtils.currentLine=19988931;
 //BA.debugLineNum = 19988931;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=19988932;
 //BA.debugLineNum = 19988932;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=19988934;
 //BA.debugLineNum = 19988934;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabasedaryaft(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "updatedatabasedaryaft", false))
	 {return ((String) Debug.delegate(null, "updatedatabasedaryaft", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Sub UpdateDataBaseDaryaft";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblDaryaf";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblDaryaft")));
RDebugUtils.currentLine=20054022;
 //BA.debugLineNum = 20054022;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=20054023;
 //BA.debugLineNum = 20054023;BA.debugLine="If  Cur.GetColumnName(i)=\"fldSharheTafzili\" Then";
if ((_cur.GetColumnName(_i)).equals("fldSharheTafzili")) { 
RDebugUtils.currentLine=20054024;
 //BA.debugLineNum = 20054024;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20054025;
 //BA.debugLineNum = 20054025;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20054028;
 //BA.debugLineNum = 20054028;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20054029;
 //BA.debugLineNum = 20054029;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblDaryaft";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblDaryaft ADD fldSharheTafzili Text");
RDebugUtils.currentLine=20054030;
 //BA.debugLineNum = 20054030;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20054031;
 //BA.debugLineNum = 20054031;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20054033;
 //BA.debugLineNum = 20054033;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20054034;
 //BA.debugLineNum = 20054034;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblDaryaf";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblDaryaft")));
RDebugUtils.currentLine=20054035;
 //BA.debugLineNum = 20054035;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step18 = 1;
final int limit18 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=20054036;
 //BA.debugLineNum = 20054036;BA.debugLine="If  Cur.GetColumnName(i)=\"fldShomareHavale\" Then";
if ((_cur.GetColumnName(_i)).equals("fldShomareHavale")) { 
RDebugUtils.currentLine=20054037;
 //BA.debugLineNum = 20054037;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20054038;
 //BA.debugLineNum = 20054038;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20054041;
 //BA.debugLineNum = 20054041;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20054042;
 //BA.debugLineNum = 20054042;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblDaryaft";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblDaryaft ADD fldShomareHavale Text");
RDebugUtils.currentLine=20054043;
 //BA.debugLineNum = 20054043;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20054044;
 //BA.debugLineNum = 20054044;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20054046;
 //BA.debugLineNum = 20054046;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20054047;
 //BA.debugLineNum = 20054047;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblDaryaf";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblDaryaft")));
RDebugUtils.currentLine=20054048;
 //BA.debugLineNum = 20054048;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step31 = 1;
final int limit31 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=20054049;
 //BA.debugLineNum = 20054049;BA.debugLine="If  Cur.GetColumnName(i)=\"fldShomareTell\" Then";
if ((_cur.GetColumnName(_i)).equals("fldShomareTell")) { 
RDebugUtils.currentLine=20054050;
 //BA.debugLineNum = 20054050;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20054051;
 //BA.debugLineNum = 20054051;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20054054;
 //BA.debugLineNum = 20054054;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20054055;
 //BA.debugLineNum = 20054055;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblDaryaft";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblDaryaft ADD fldShomareTell Text");
RDebugUtils.currentLine=20054056;
 //BA.debugLineNum = 20054056;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20054057;
 //BA.debugLineNum = 20054057;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20054059;
 //BA.debugLineNum = 20054059;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabaseenterexitvisitor(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "updatedatabaseenterexitvisitor", false))
	 {return ((String) Debug.delegate(null, "updatedatabaseenterexitvisitor", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Sub UpdateDataBaseEnterExitVisitor";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblEnterE";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblEnterExitVisitor")));
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=20119559;
 //BA.debugLineNum = 20119559;BA.debugLine="If  Cur.GetColumnName(i)=\"FldCode\" Then";
if ((_cur.GetColumnName(_i)).equals("FldCode")) { 
RDebugUtils.currentLine=20119560;
 //BA.debugLineNum = 20119560;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20119561;
 //BA.debugLineNum = 20119561;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20119564;
 //BA.debugLineNum = 20119564;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20119565;
 //BA.debugLineNum = 20119565;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblEnterExi";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblEnterExitVisitor ADD FldCode Text");
RDebugUtils.currentLine=20119566;
 //BA.debugLineNum = 20119566;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20119567;
 //BA.debugLineNum = 20119567;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20119569;
 //BA.debugLineNum = 20119569;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabasegpsvisitor(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "updatedatabasegpsvisitor", false))
	 {return ((String) Debug.delegate(null, "updatedatabasegpsvisitor", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Sub UpdateDataBaseGpsVisitor";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblGpsVis";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblGpsVisitor")));
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVaziat\" Then";
if ((_cur.GetColumnName(_i)).equals("FldVaziat")) { 
RDebugUtils.currentLine=20185096;
 //BA.debugLineNum = 20185096;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20185097;
 //BA.debugLineNum = 20185097;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20185100;
 //BA.debugLineNum = 20185100;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20185101;
 //BA.debugLineNum = 20185101;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblGpsVisit";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblGpsVisitor ADD FldVaziat Text");
RDebugUtils.currentLine=20185102;
 //BA.debugLineNum = 20185102;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20185103;
 //BA.debugLineNum = 20185103;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20185105;
 //BA.debugLineNum = 20185105;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabasehavale(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "updatedatabasehavale", false))
	 {return ((String) Debug.delegate(null, "updatedatabasehavale", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Sub UpdateDataBaseHavale";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblHavale";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblHavale")));
RDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=20250631;
 //BA.debugLineNum = 20250631;BA.debugLine="If  Cur.GetColumnName(i)=\"fldMande\" Then";
if ((_cur.GetColumnName(_i)).equals("fldMande")) { 
RDebugUtils.currentLine=20250632;
 //BA.debugLineNum = 20250632;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20250633;
 //BA.debugLineNum = 20250633;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20250636;
 //BA.debugLineNum = 20250636;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20250637;
 //BA.debugLineNum = 20250637;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblHavale A";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblHavale ADD fldMande Text");
RDebugUtils.currentLine=20250638;
 //BA.debugLineNum = 20250638;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20250639;
 //BA.debugLineNum = 20250639;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20250641;
 //BA.debugLineNum = 20250641;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabaseashkhasnew(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdatabase";
if (Debug.shouldDelegate(null, "updatedatabaseashkhasnew", false))
	 {return ((String) Debug.delegate(null, "updatedatabaseashkhasnew", new Object[] {_ba}));}
int _check = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Sub UpdateDataBaseAshkhasNew";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Dim Check As Int";
_check = 0;
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhasNew")));
RDebugUtils.currentLine=20316166;
 //BA.debugLineNum = 20316166;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=20316167;
 //BA.debugLineNum = 20316167;BA.debugLine="If  Cur.GetColumnName(i)=\"FldCodeGroup\" Then";
if ((_cur.GetColumnName(_i)).equals("FldCodeGroup")) { 
RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20316169;
 //BA.debugLineNum = 20316169;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20316172;
 //BA.debugLineNum = 20316172;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20316173;
 //BA.debugLineNum = 20316173;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhasNew ADD FldCodeGroup Text");
RDebugUtils.currentLine=20316174;
 //BA.debugLineNum = 20316174;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20316175;
 //BA.debugLineNum = 20316175;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20316177;
 //BA.debugLineNum = 20316177;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20316178;
 //BA.debugLineNum = 20316178;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhasNew")));
RDebugUtils.currentLine=20316179;
 //BA.debugLineNum = 20316179;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step18 = 1;
final int limit18 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=20316180;
 //BA.debugLineNum = 20316180;BA.debugLine="If  Cur.GetColumnName(i)=\"FldC_Meli\" Then";
if ((_cur.GetColumnName(_i)).equals("FldC_Meli")) { 
RDebugUtils.currentLine=20316181;
 //BA.debugLineNum = 20316181;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20316182;
 //BA.debugLineNum = 20316182;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20316185;
 //BA.debugLineNum = 20316185;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20316186;
 //BA.debugLineNum = 20316186;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhasNew ADD FldC_Meli Text");
RDebugUtils.currentLine=20316187;
 //BA.debugLineNum = 20316187;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20316188;
 //BA.debugLineNum = 20316188;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20316190;
 //BA.debugLineNum = 20316190;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20316192;
 //BA.debugLineNum = 20316192;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhasNew")));
RDebugUtils.currentLine=20316193;
 //BA.debugLineNum = 20316193;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step31 = 1;
final int limit31 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=20316194;
 //BA.debugLineNum = 20316194;BA.debugLine="If  Cur.GetColumnName(i)=\"FldC_Posti\" Then";
if ((_cur.GetColumnName(_i)).equals("FldC_Posti")) { 
RDebugUtils.currentLine=20316195;
 //BA.debugLineNum = 20316195;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20316196;
 //BA.debugLineNum = 20316196;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20316199;
 //BA.debugLineNum = 20316199;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20316200;
 //BA.debugLineNum = 20316200;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhasNew ADD FldC_Posti Text");
RDebugUtils.currentLine=20316201;
 //BA.debugLineNum = 20316201;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20316202;
 //BA.debugLineNum = 20316202;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20316204;
 //BA.debugLineNum = 20316204;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20316205;
 //BA.debugLineNum = 20316205;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhasNew")));
RDebugUtils.currentLine=20316206;
 //BA.debugLineNum = 20316206;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step44 = 1;
final int limit44 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit44 ;_i = _i + step44 ) {
RDebugUtils.currentLine=20316207;
 //BA.debugLineNum = 20316207;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMobile\" Then";
if ((_cur.GetColumnName(_i)).equals("FldMobile")) { 
RDebugUtils.currentLine=20316208;
 //BA.debugLineNum = 20316208;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20316209;
 //BA.debugLineNum = 20316209;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20316212;
 //BA.debugLineNum = 20316212;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20316213;
 //BA.debugLineNum = 20316213;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhasNew ADD FldMobile Text");
RDebugUtils.currentLine=20316214;
 //BA.debugLineNum = 20316214;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20316215;
 //BA.debugLineNum = 20316215;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20316217;
 //BA.debugLineNum = 20316217;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20316219;
 //BA.debugLineNum = 20316219;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhasNew")));
RDebugUtils.currentLine=20316220;
 //BA.debugLineNum = 20316220;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step57 = 1;
final int limit57 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit57 ;_i = _i + step57 ) {
RDebugUtils.currentLine=20316221;
 //BA.debugLineNum = 20316221;BA.debugLine="If  Cur.GetColumnName(i)=\"FldLat\" Then";
if ((_cur.GetColumnName(_i)).equals("FldLat")) { 
RDebugUtils.currentLine=20316222;
 //BA.debugLineNum = 20316222;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20316223;
 //BA.debugLineNum = 20316223;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20316226;
 //BA.debugLineNum = 20316226;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20316227;
 //BA.debugLineNum = 20316227;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhasNew ADD FldLat Text");
RDebugUtils.currentLine=20316228;
 //BA.debugLineNum = 20316228;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20316229;
 //BA.debugLineNum = 20316229;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20316231;
 //BA.debugLineNum = 20316231;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20316233;
 //BA.debugLineNum = 20316233;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhasNew")));
RDebugUtils.currentLine=20316234;
 //BA.debugLineNum = 20316234;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step70 = 1;
final int limit70 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit70 ;_i = _i + step70 ) {
RDebugUtils.currentLine=20316235;
 //BA.debugLineNum = 20316235;BA.debugLine="If  Cur.GetColumnName(i)=\"FldLon\" Then";
if ((_cur.GetColumnName(_i)).equals("FldLon")) { 
RDebugUtils.currentLine=20316236;
 //BA.debugLineNum = 20316236;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20316237;
 //BA.debugLineNum = 20316237;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20316240;
 //BA.debugLineNum = 20316240;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20316241;
 //BA.debugLineNum = 20316241;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhasNew ADD FldLon Text");
RDebugUtils.currentLine=20316242;
 //BA.debugLineNum = 20316242;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20316243;
 //BA.debugLineNum = 20316243;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20316245;
 //BA.debugLineNum = 20316245;BA.debugLine="Check=0";
_check = (int) (0);
RDebugUtils.currentLine=20316247;
 //BA.debugLineNum = 20316247;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select * From TblAshkhasNew")));
RDebugUtils.currentLine=20316248;
 //BA.debugLineNum = 20316248;BA.debugLine="For i=0 To Cur.ColumnCount-1";
{
final int step83 = 1;
final int limit83 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit83 ;_i = _i + step83 ) {
RDebugUtils.currentLine=20316249;
 //BA.debugLineNum = 20316249;BA.debugLine="If  Cur.GetColumnName(i)=\"FldShomarehesab\" Then";
if ((_cur.GetColumnName(_i)).equals("FldShomarehesab")) { 
RDebugUtils.currentLine=20316250;
 //BA.debugLineNum = 20316250;BA.debugLine="Check=1";
_check = (int) (1);
RDebugUtils.currentLine=20316251;
 //BA.debugLineNum = 20316251;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=20316254;
 //BA.debugLineNum = 20316254;BA.debugLine="If Check=0 Then";
if (_check==0) { 
RDebugUtils.currentLine=20316255;
 //BA.debugLineNum = 20316255;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("Alter Table TblAshkhasNew ADD FldShomarehesab Text");
RDebugUtils.currentLine=20316256;
 //BA.debugLineNum = 20316256;BA.debugLine="MCode.Sql1.Close";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=20316257;
 //BA.debugLineNum = 20316257;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (_ba);
 };
RDebugUtils.currentLine=20316259;
 //BA.debugLineNum = 20316259;BA.debugLine="End Sub";
return "";
}
}