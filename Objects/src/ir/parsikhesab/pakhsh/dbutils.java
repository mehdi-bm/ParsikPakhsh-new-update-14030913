package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbutils {
private static dbutils mostCurrent = new dbutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _db_real = "";
public static String _db_integer = "";
public static String _db_blob = "";
public static String _db_text = "";
public static String _htmlcss = "";
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
public static String  _insertmaps(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "insertmaps", false))
	 {return ((String) Debug.delegate(null, "insertmaps", new Object[] {_ba,_sql,_tablename,_listofmaps}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i2 = 0;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=112918528;
 //BA.debugLineNum = 112918528;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=112918529;
 //BA.debugLineNum = 112918529;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=112918531;
 //BA.debugLineNum = 112918531;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=112918532;
 //BA.debugLineNum = 112918532;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.LogImpl("5112918532","Same Map found twice in list. Each item in the list should include a different map object.",0);
RDebugUtils.currentLine=112918533;
 //BA.debugLineNum = 112918533;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=112918535;
 //BA.debugLineNum = 112918535;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=112918536;
 //BA.debugLineNum = 112918536;BA.debugLine="Try";
try {RDebugUtils.currentLine=112918537;
 //BA.debugLineNum = 112918537;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit8 ;_i1 = _i1 + step8 ) {
RDebugUtils.currentLine=112918538;
 //BA.debugLineNum = 112918538;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=112918539;
 //BA.debugLineNum = 112918539;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=112918540;
 //BA.debugLineNum = 112918540;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=112918541;
 //BA.debugLineNum = 112918541;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=112918542;
 //BA.debugLineNum = 112918542;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=112918543;
 //BA.debugLineNum = 112918543;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=112918544;
 //BA.debugLineNum = 112918544;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=112918545;
 //BA.debugLineNum = 112918545;BA.debugLine="m = ListOfMaps.Get(i1)";
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=112918546;
 //BA.debugLineNum = 112918546;BA.debugLine="For i2 = 0 To m.Size - 1";
{
final int step17 = 1;
final int limit17 = (int) (_m.getSize()-1);
_i2 = (int) (0) ;
for (;_i2 <= limit17 ;_i2 = _i2 + step17 ) {
RDebugUtils.currentLine=112918547;
 //BA.debugLineNum = 112918547;BA.debugLine="Dim col As String";
_col = "";
RDebugUtils.currentLine=112918548;
 //BA.debugLineNum = 112918548;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=112918550;
 //BA.debugLineNum = 112918550;BA.debugLine="col = m.GetKeyAt(i2)";
_col = BA.ObjectToString(_m.GetKeyAt(_i2));
RDebugUtils.currentLine=112918551;
 //BA.debugLineNum = 112918551;BA.debugLine="value = m.GetValueAt(i2)";
_value = _m.GetValueAt(_i2);
RDebugUtils.currentLine=112918552;
 //BA.debugLineNum = 112918552;BA.debugLine="Log(i2)";
anywheresoftware.b4a.keywords.Common.LogImpl("5112918552",BA.NumberToString(_i2),0);
RDebugUtils.currentLine=112918553;
 //BA.debugLineNum = 112918553;BA.debugLine="Log(col)";
anywheresoftware.b4a.keywords.Common.LogImpl("5112918553",_col,0);
RDebugUtils.currentLine=112918554;
 //BA.debugLineNum = 112918554;BA.debugLine="Log(value)";
anywheresoftware.b4a.keywords.Common.LogImpl("5112918554",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=112918555;
 //BA.debugLineNum = 112918555;BA.debugLine="If i2 > 0 Then";
if (_i2>0) { 
RDebugUtils.currentLine=112918556;
 //BA.debugLineNum = 112918556;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=112918557;
 //BA.debugLineNum = 112918557;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=112918559;
 //BA.debugLineNum = 112918559;BA.debugLine="columns.Append(\"[\").Append(col).Append(\"]\")";
_columns.Append("[").Append(_col).Append("]");
RDebugUtils.currentLine=112918560;
 //BA.debugLineNum = 112918560;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=112918561;
 //BA.debugLineNum = 112918561;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=112918563;
 //BA.debugLineNum = 112918563;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=112918564;
 //BA.debugLineNum = 112918564;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("5112918564","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
RDebugUtils.currentLine=112918565;
 //BA.debugLineNum = 112918565;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=112918567;
 //BA.debugLineNum = 112918567;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e39) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e39);RDebugUtils.currentLine=112918569;
 //BA.debugLineNum = 112918569;BA.debugLine="ToastMessageShow(LastException.Message, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(_ba).getMessage()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=112918570;
 //BA.debugLineNum = 112918570;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5112918570",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=112918572;
 //BA.debugLineNum = 112918572;BA.debugLine="SQL.EndTransaction";
_sql.EndTransaction();
RDebugUtils.currentLine=112918573;
 //BA.debugLineNum = 112918573;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "updaterecord2", false))
	 {return ((String) Debug.delegate(null, "updaterecord2", new Object[] {_ba,_sql,_tablename,_fields,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _i = 0;
RDebugUtils.currentLine=113049600;
 //BA.debugLineNum = 113049600;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
RDebugUtils.currentLine=113049601;
 //BA.debugLineNum = 113049601;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=113049602;
 //BA.debugLineNum = 113049602;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5113049602","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=113049603;
 //BA.debugLineNum = 113049603;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=113049605;
 //BA.debugLineNum = 113049605;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=113049606;
 //BA.debugLineNum = 113049606;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5113049606","Fields empty",0);
RDebugUtils.currentLine=113049607;
 //BA.debugLineNum = 113049607;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=113049609;
 //BA.debugLineNum = 113049609;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=113049610;
 //BA.debugLineNum = 113049610;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=113049611;
 //BA.debugLineNum = 113049611;BA.debugLine="sb.Append(\"UPDATE [\").Append(TableName).Append(\"]";
_sb.Append("UPDATE [").Append(_tablename).Append("] SET ");
RDebugUtils.currentLine=113049612;
 //BA.debugLineNum = 113049612;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113049613;
 //BA.debugLineNum = 113049613;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=113049614;
 //BA.debugLineNum = 113049614;BA.debugLine="For i=0 To Fields.Size-1";
{
final int step14 = 1;
final int limit14 = (int) (_fields.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=113049615;
 //BA.debugLineNum = 113049615;BA.debugLine="If i<>Fields.Size-1 Then";
if (_i!=_fields.getSize()-1) { 
RDebugUtils.currentLine=113049616;
 //BA.debugLineNum = 113049616;BA.debugLine="sb.Append(\"[\").Append(Fields.GetKeyAt(i)).Appen";
_sb.Append("[").Append(BA.ObjectToString(_fields.GetKeyAt(_i))).Append("]=?,");
 }else {
RDebugUtils.currentLine=113049618;
 //BA.debugLineNum = 113049618;BA.debugLine="sb.Append(\"[\").Append(Fields.GetKeyAt(i)).Appen";
_sb.Append("[").Append(BA.ObjectToString(_fields.GetKeyAt(_i))).Append("]=?");
 };
RDebugUtils.currentLine=113049620;
 //BA.debugLineNum = 113049620;BA.debugLine="args.Add(Fields.GetValueAt(i))";
_args.Add(_fields.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=113049623;
 //BA.debugLineNum = 113049623;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=113049624;
 //BA.debugLineNum = 113049624;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
{
final int step23 = 1;
final int limit23 = (int) (_wherefieldequals.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=113049625;
 //BA.debugLineNum = 113049625;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=113049626;
 //BA.debugLineNum = 113049626;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=113049628;
 //BA.debugLineNum = 113049628;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKeyAt(";
_sb.Append("[").Append(BA.ObjectToString(_wherefieldequals.GetKeyAt(_i))).Append("] = ?");
RDebugUtils.currentLine=113049629;
 //BA.debugLineNum = 113049629;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
_args.Add(_wherefieldequals.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=113049631;
 //BA.debugLineNum = 113049631;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("5113049631","UpdateRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=113049632;
 //BA.debugLineNum = 113049632;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=113049633;
 //BA.debugLineNum = 113049633;BA.debugLine="End Sub";
return "";
}
public static String  _copydbfromassets(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "copydbfromassets", false))
	 {return ((String) Debug.delegate(null, "copydbfromassets", new Object[] {_ba,_filename}));}
String _targetdir = "";
RDebugUtils.currentLine=112721920;
 //BA.debugLineNum = 112721920;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String) A";
RDebugUtils.currentLine=112721921;
 //BA.debugLineNum = 112721921;BA.debugLine="Dim TargetDir As String = GetDBFolder";
_targetdir = _getdbfolder(_ba);
RDebugUtils.currentLine=112721923;
 //BA.debugLineNum = 112721923;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=112721924;
 //BA.debugLineNum = 112721924;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
RDebugUtils.currentLine=112721926;
 //BA.debugLineNum = 112721926;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
RDebugUtils.currentLine=112721927;
 //BA.debugLineNum = 112721927;BA.debugLine="End Sub";
return "";
}
public static String  _getdbfolder(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getdbfolder", false))
	 {return ((String) Debug.delegate(null, "getdbfolder", new Object[] {_ba}));}
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
RDebugUtils.currentLine=112656384;
 //BA.debugLineNum = 112656384;BA.debugLine="Public Sub GetDBFolder As String";
RDebugUtils.currentLine=112656385;
 //BA.debugLineNum = 112656385;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=112656386;
 //BA.debugLineNum = 112656386;BA.debugLine="If File.ExternalWritable Then Return rp.GetSafeDi";
if (anywheresoftware.b4a.keywords.Common.File.getExternalWritable()) { 
if (true) return _rp.GetSafeDirDefaultExternal("");}
else {
if (true) return anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal();};
RDebugUtils.currentLine=112656387;
 //BA.debugLineNum = 112656387;BA.debugLine="End Sub";
return "";
}
public static String  _createtable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "createtable", false))
	 {return ((String) Debug.delegate(null, "createtable", new Object[] {_ba,_sql,_tablename,_fieldsandtypes,_primarykey}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
RDebugUtils.currentLine=112787456;
 //BA.debugLineNum = 112787456;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
RDebugUtils.currentLine=112787457;
 //BA.debugLineNum = 112787457;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=112787458;
 //BA.debugLineNum = 112787458;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=112787459;
 //BA.debugLineNum = 112787459;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=112787460;
 //BA.debugLineNum = 112787460;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=112787461;
 //BA.debugLineNum = 112787461;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=112787462;
 //BA.debugLineNum = 112787462;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=112787463;
 //BA.debugLineNum = 112787463;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=112787464;
 //BA.debugLineNum = 112787464;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=112787465;
 //BA.debugLineNum = 112787465;BA.debugLine="sb.Append(\"[\").Append(field).Append(\"] \").Append";
_sb.Append("[").Append(_field).Append("] ").Append(_ftype);
RDebugUtils.currentLine=112787466;
 //BA.debugLineNum = 112787466;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=112787468;
 //BA.debugLineNum = 112787468;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=112787469;
 //BA.debugLineNum = 112787469;BA.debugLine="Dim query As String";
_query = "";
RDebugUtils.currentLine=112787470;
 //BA.debugLineNum = 112787470;BA.debugLine="query = \"CREATE TABLE IF NOT EXISTS [\" & TableNam";
_query = "CREATE TABLE IF NOT EXISTS ["+_tablename+"] "+_sb.ToString();
RDebugUtils.currentLine=112787471;
 //BA.debugLineNum = 112787471;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("5112787471","CreateTable: "+_query,0);
RDebugUtils.currentLine=112787472;
 //BA.debugLineNum = 112787472;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=112787473;
 //BA.debugLineNum = 112787473;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "deleterecord", false))
	 {return ((String) Debug.delegate(null, "deleterecord", new Object[] {_ba,_sql,_tablename,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _i = 0;
RDebugUtils.currentLine=113639424;
 //BA.debugLineNum = 113639424;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=113639425;
 //BA.debugLineNum = 113639425;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=113639426;
 //BA.debugLineNum = 113639426;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=113639427;
 //BA.debugLineNum = 113639427;BA.debugLine="sb.Append(\"DELETE FROM [\").Append(TableName).A";
_sb.Append("DELETE FROM [").Append(_tablename).Append("] WHERE ");
RDebugUtils.currentLine=113639428;
 //BA.debugLineNum = 113639428;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=113639429;
 //BA.debugLineNum = 113639429;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5113639429","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=113639430;
 //BA.debugLineNum = 113639430;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=113639432;
 //BA.debugLineNum = 113639432;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113639433;
 //BA.debugLineNum = 113639433;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=113639434;
 //BA.debugLineNum = 113639434;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_wherefieldequals.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=113639435;
 //BA.debugLineNum = 113639435;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
if (_i>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=113639436;
 //BA.debugLineNum = 113639436;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.Get";
_sb.Append("[").Append(BA.ObjectToString(_wherefieldequals.GetKeyAt(_i))).Append("] = ?");
RDebugUtils.currentLine=113639437;
 //BA.debugLineNum = 113639437;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
_args.Add(_wherefieldequals.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=113639439;
 //BA.debugLineNum = 113639439;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("5113639439","DeleteRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=113639440;
 //BA.debugLineNum = 113639440;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=113639441;
 //BA.debugLineNum = 113639441;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "droptable", false))
	 {return ((String) Debug.delegate(null, "droptable", new Object[] {_ba,_sql,_tablename}));}
String _query = "";
RDebugUtils.currentLine=112852992;
 //BA.debugLineNum = 112852992;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
RDebugUtils.currentLine=112852993;
 //BA.debugLineNum = 112852993;BA.debugLine="Dim query As String";
_query = "";
RDebugUtils.currentLine=112852994;
 //BA.debugLineNum = 112852994;BA.debugLine="query = \"DROP TABLE IF EXISTS [\" & TableName & \"]";
_query = "DROP TABLE IF EXISTS ["+_tablename+"]";
RDebugUtils.currentLine=112852995;
 //BA.debugLineNum = 112852995;BA.debugLine="Log(\"DropTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("5112852995","DropTable: "+_query,0);
RDebugUtils.currentLine=112852996;
 //BA.debugLineNum = 112852996;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=112852997;
 //BA.debugLineNum = 112852997;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executehtml", false))
	 {return ((String) Debug.delegate(null, "executehtml", new Object[] {_ba,_sql,_query,_stringargs,_limit,_clickable}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
RDebugUtils.currentLine=113442816;
 //BA.debugLineNum = 113442816;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
RDebugUtils.currentLine=113442817;
 //BA.debugLineNum = 113442817;BA.debugLine="Dim cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=113442818;
 //BA.debugLineNum = 113442818;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=113442819;
 //BA.debugLineNum = 113442819;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=113442821;
 //BA.debugLineNum = 113442821;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=113442823;
 //BA.debugLineNum = 113442823;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("5113442823","ExecuteHtml: "+_query,0);
RDebugUtils.currentLine=113442824;
 //BA.debugLineNum = 113442824;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
if (_limit>0) { 
_limit = (int) (anywheresoftware.b4a.keywords.Common.Min(_limit,_cur.getRowCount()));}
else {
_limit = _cur.getRowCount();};
RDebugUtils.currentLine=113442825;
 //BA.debugLineNum = 113442825;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=113442826;
 //BA.debugLineNum = 113442826;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=113442827;
 //BA.debugLineNum = 113442827;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=113442828;
 //BA.debugLineNum = 113442828;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=113442829;
 //BA.debugLineNum = 113442829;BA.debugLine="sb.Append(\"<table><tr>\").Append(CRLF)";
_sb.Append("<table><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=113442830;
 //BA.debugLineNum = 113442830;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=113442831;
 //BA.debugLineNum = 113442831;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=113442842;
 //BA.debugLineNum = 113442842;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=113442843;
 //BA.debugLineNum = 113442843;BA.debugLine="For row = 0 To Limit - 1";
{
final int step18 = 1;
final int limit18 = (int) (_limit-1);
_row = (int) (0) ;
for (;_row <= limit18 ;_row = _row + step18 ) {
RDebugUtils.currentLine=113442844;
 //BA.debugLineNum = 113442844;BA.debugLine="cur.Position = row";
_cur.setPosition(_row);
RDebugUtils.currentLine=113442845;
 //BA.debugLineNum = 113442845;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=113442846;
 //BA.debugLineNum = 113442846;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=113442848;
 //BA.debugLineNum = 113442848;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=113442850;
 //BA.debugLineNum = 113442850;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=113442851;
 //BA.debugLineNum = 113442851;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=113442852;
 //BA.debugLineNum = 113442852;BA.debugLine="If Clickable Then";
if (_clickable) { 
RDebugUtils.currentLine=113442853;
 //BA.debugLineNum = 113442853;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
RDebugUtils.currentLine=113442854;
 //BA.debugLineNum = 113442854;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
RDebugUtils.currentLine=113442855;
 //BA.debugLineNum = 113442855;BA.debugLine="sb.Append(\".com'>\").Append(cur.GetString2(i)).";
_sb.Append(".com'>").Append(_cur.GetString2(_i)).Append("</a>");
 }else {
RDebugUtils.currentLine=113442857;
 //BA.debugLineNum = 113442857;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
RDebugUtils.currentLine=113442859;
 //BA.debugLineNum = 113442859;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=113442861;
 //BA.debugLineNum = 113442861;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 }
};
RDebugUtils.currentLine=113442863;
 //BA.debugLineNum = 113442863;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=113442864;
 //BA.debugLineNum = 113442864;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=113442865;
 //BA.debugLineNum = 113442865;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=113442866;
 //BA.debugLineNum = 113442866;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executejson", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executejson", new Object[] {_ba,_sql,_query,_stringargs,_limit,_dbtypes}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _row = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=113377280;
 //BA.debugLineNum = 113377280;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
RDebugUtils.currentLine=113377281;
 //BA.debugLineNum = 113377281;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113377282;
 //BA.debugLineNum = 113377282;BA.debugLine="Dim cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=113377283;
 //BA.debugLineNum = 113377283;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=113377284;
 //BA.debugLineNum = 113377284;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=113377286;
 //BA.debugLineNum = 113377286;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=113377288;
 //BA.debugLineNum = 113377288;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("5113377288","ExecuteJSON: "+_query,0);
RDebugUtils.currentLine=113377289;
 //BA.debugLineNum = 113377289;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113377290;
 //BA.debugLineNum = 113377290;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=113377291;
 //BA.debugLineNum = 113377291;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
if (_limit>0) { 
_limit = (int) (anywheresoftware.b4a.keywords.Common.Min(_limit,_cur.getRowCount()));}
else {
_limit = _cur.getRowCount();};
RDebugUtils.currentLine=113377292;
 //BA.debugLineNum = 113377292;BA.debugLine="For row = 0 To Limit - 1";
{
final int step12 = 1;
final int limit12 = (int) (_limit-1);
_row = (int) (0) ;
for (;_row <= limit12 ;_row = _row + step12 ) {
RDebugUtils.currentLine=113377293;
 //BA.debugLineNum = 113377293;BA.debugLine="cur.Position = row";
_cur.setPosition(_row);
RDebugUtils.currentLine=113377294;
 //BA.debugLineNum = 113377294;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=113377295;
 //BA.debugLineNum = 113377295;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=113377296;
 //BA.debugLineNum = 113377296;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step16 = 1;
final int limit16 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=113377297;
 //BA.debugLineNum = 113377297;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real))) {
case 0: {
RDebugUtils.currentLine=113377299;
 //BA.debugLineNum = 113377299;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=113377301;
 //BA.debugLineNum = 113377301;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: {
RDebugUtils.currentLine=113377303;
 //BA.debugLineNum = 113377303;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
default: {
RDebugUtils.currentLine=113377305;
 //BA.debugLineNum = 113377305;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("5113377305","Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=113377308;
 //BA.debugLineNum = 113377308;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
 }
};
RDebugUtils.currentLine=113377310;
 //BA.debugLineNum = 113377310;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=113377311;
 //BA.debugLineNum = 113377311;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=113377312;
 //BA.debugLineNum = 113377312;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=113377313;
 //BA.debugLineNum = 113377313;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=113377314;
 //BA.debugLineNum = 113377314;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=113377315;
 //BA.debugLineNum = 113377315;BA.debugLine="End Sub";
return null;
}
public static String  _executelistview(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.ListViewWrapper _listview1,boolean _twolines) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelistview", false))
	 {return ((String) Debug.delegate(null, "executelistview", new Object[] {_ba,_sql,_query,_stringargs,_limit,_listview1,_twolines}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=113311744;
 //BA.debugLineNum = 113311744;BA.debugLine="Public Sub ExecuteListView(SQL As SQL, Query As St";
RDebugUtils.currentLine=113311746;
 //BA.debugLineNum = 113311746;BA.debugLine="ListView1.Clear";
_listview1.Clear();
RDebugUtils.currentLine=113311747;
 //BA.debugLineNum = 113311747;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113311748;
 //BA.debugLineNum = 113311748;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=113311749;
 //BA.debugLineNum = 113311749;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=113311750;
 //BA.debugLineNum = 113311750;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=113311751;
 //BA.debugLineNum = 113311751;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=113311752;
 //BA.debugLineNum = 113311752;BA.debugLine="If TwoLines Then";
if (_twolines) { 
RDebugUtils.currentLine=113311753;
 //BA.debugLineNum = 113311753;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
_listview1.AddTwoLines2(BA.ObjectToCharSequence(_cols[(int) (0)]),BA.ObjectToCharSequence(_cols[(int) (1)]),(Object)(_cols));
 }else {
RDebugUtils.currentLine=113311755;
 //BA.debugLineNum = 113311755;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
_listview1.AddSingleLine2(BA.ObjectToCharSequence(_cols[(int) (0)]),(Object)(_cols));
 };
 }
};
RDebugUtils.currentLine=113311758;
 //BA.debugLineNum = 113311758;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executememorytable", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "executememorytable", new Object[] {_ba,_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
int _row = 0;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=113115136;
 //BA.debugLineNum = 113115136;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
RDebugUtils.currentLine=113115137;
 //BA.debugLineNum = 113115137;BA.debugLine="Dim cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=113115138;
 //BA.debugLineNum = 113115138;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=113115139;
 //BA.debugLineNum = 113115139;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=113115141;
 //BA.debugLineNum = 113115141;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=113115143;
 //BA.debugLineNum = 113115143;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("5113115143","ExecuteMemoryTable: "+_query,0);
RDebugUtils.currentLine=113115144;
 //BA.debugLineNum = 113115144;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113115145;
 //BA.debugLineNum = 113115145;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=113115146;
 //BA.debugLineNum = 113115146;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
if (_limit>0) { 
_limit = (int) (anywheresoftware.b4a.keywords.Common.Min(_limit,_cur.getRowCount()));}
else {
_limit = _cur.getRowCount();};
RDebugUtils.currentLine=113115147;
 //BA.debugLineNum = 113115147;BA.debugLine="For row = 0 To Limit - 1";
{
final int step11 = 1;
final int limit11 = (int) (_limit-1);
_row = (int) (0) ;
for (;_row <= limit11 ;_row = _row + step11 ) {
RDebugUtils.currentLine=113115148;
 //BA.debugLineNum = 113115148;BA.debugLine="cur.Position = row";
_cur.setPosition(_row);
RDebugUtils.currentLine=113115149;
 //BA.debugLineNum = 113115149;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=113115150;
 //BA.debugLineNum = 113115150;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=113115151;
 //BA.debugLineNum = 113115151;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=113115153;
 //BA.debugLineNum = 113115153;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
 }
};
RDebugUtils.currentLine=113115155;
 //BA.debugLineNum = 113115155;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=113115156;
 //BA.debugLineNum = 113115156;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=113115157;
 //BA.debugLineNum = 113115157;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executemap", new Object[] {_ba,_sql,_query,_stringargs}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _res = null;
int _i = 0;
RDebugUtils.currentLine=113180672;
 //BA.debugLineNum = 113180672;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
RDebugUtils.currentLine=113180673;
 //BA.debugLineNum = 113180673;BA.debugLine="Dim cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=113180674;
 //BA.debugLineNum = 113180674;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=113180675;
 //BA.debugLineNum = 113180675;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=113180677;
 //BA.debugLineNum = 113180677;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=113180679;
 //BA.debugLineNum = 113180679;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("5113180679","ExecuteMap: "+_query,0);
RDebugUtils.currentLine=113180680;
 //BA.debugLineNum = 113180680;BA.debugLine="If cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=113180681;
 //BA.debugLineNum = 113180681;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5113180681","No records found.",0);
RDebugUtils.currentLine=113180682;
 //BA.debugLineNum = 113180682;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 };
RDebugUtils.currentLine=113180684;
 //BA.debugLineNum = 113180684;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=113180685;
 //BA.debugLineNum = 113180685;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=113180686;
 //BA.debugLineNum = 113180686;BA.debugLine="cur.Position = 0";
_cur.setPosition((int) (0));
RDebugUtils.currentLine=113180687;
 //BA.debugLineNum = 113180687;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step15 = 1;
final int limit15 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=113180688;
 //BA.debugLineNum = 113180688;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=113180690;
 //BA.debugLineNum = 113180690;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=113180691;
 //BA.debugLineNum = 113180691;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=113180692;
 //BA.debugLineNum = 113180692;BA.debugLine="End Sub";
return null;
}
public static String  _executespinner(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.SpinnerWrapper _spinner1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executespinner", false))
	 {return ((String) Debug.delegate(null, "executespinner", new Object[] {_ba,_sql,_query,_stringargs,_limit,_spinner1}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=113246208;
 //BA.debugLineNum = 113246208;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
RDebugUtils.currentLine=113246209;
 //BA.debugLineNum = 113246209;BA.debugLine="Spinner1.Clear";
_spinner1.Clear();
RDebugUtils.currentLine=113246210;
 //BA.debugLineNum = 113246210;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113246211;
 //BA.debugLineNum = 113246211;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=113246212;
 //BA.debugLineNum = 113246212;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=113246213;
 //BA.debugLineNum = 113246213;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=113246214;
 //BA.debugLineNum = 113246214;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=113246215;
 //BA.debugLineNum = 113246215;BA.debugLine="Spinner1.Add(Cols(0))";
_spinner1.Add(_cols[(int) (0)]);
 }
};
RDebugUtils.currentLine=113246217;
 //BA.debugLineNum = 113246217;BA.debugLine="End Sub";
return "";
}
public static int  _getdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getdbversion", false))
	 {return ((Integer) Debug.delegate(null, "getdbversion", new Object[] {_ba,_sql}));}
int _count = 0;
int _version = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=113508352;
 //BA.debugLineNum = 113508352;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
RDebugUtils.currentLine=113508353;
 //BA.debugLineNum = 113508353;BA.debugLine="Dim count, version As Int";
_count = 0;
_version = 0;
RDebugUtils.currentLine=113508354;
 //BA.debugLineNum = 113508354;BA.debugLine="count = SQL.ExecQuerySingleResult(\"SELECT count(*";
_count = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE Type='table' AND name='DBVersion'")));
RDebugUtils.currentLine=113508355;
 //BA.debugLineNum = 113508355;BA.debugLine="If count > 0 Then";
if (_count>0) { 
RDebugUtils.currentLine=113508356;
 //BA.debugLineNum = 113508356;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
_version = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT version FROM DBVersion")));
 }else {
RDebugUtils.currentLine=113508359;
 //BA.debugLineNum = 113508359;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=113508360;
 //BA.debugLineNum = 113508360;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=113508361;
 //BA.debugLineNum = 113508361;BA.debugLine="m.Put(\"version\", DB_INTEGER)";
_m.Put((Object)("version"),(Object)(_db_integer));
RDebugUtils.currentLine=113508362;
 //BA.debugLineNum = 113508362;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
_createtable(_ba,_sql,"DBVersion",_m,"version");
RDebugUtils.currentLine=113508364;
 //BA.debugLineNum = 113508364;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
_sql.ExecNonQuery("INSERT INTO DBVersion VALUES (1)");
RDebugUtils.currentLine=113508366;
 //BA.debugLineNum = 113508366;BA.debugLine="version = 1";
_version = (int) (1);
 };
RDebugUtils.currentLine=113508369;
 //BA.debugLineNum = 113508369;BA.debugLine="Return version";
if (true) return _version;
RDebugUtils.currentLine=113508370;
 //BA.debugLineNum = 113508370;BA.debugLine="End Sub";
return 0;
}
public static String  _setdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,int _version) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "setdbversion", false))
	 {return ((String) Debug.delegate(null, "setdbversion", new Object[] {_ba,_sql,_version}));}
RDebugUtils.currentLine=113573888;
 //BA.debugLineNum = 113573888;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
RDebugUtils.currentLine=113573889;
 //BA.debugLineNum = 113573889;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
_sql.ExecNonQuery2("UPDATE DBVersion set version = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_version)}));
RDebugUtils.currentLine=113573890;
 //BA.debugLineNum = 113573890;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "updaterecord", false))
	 {return ((String) Debug.delegate(null, "updaterecord", new Object[] {_ba,_sql,_tablename,_field,_newvalue,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _i = 0;
RDebugUtils.currentLine=112984064;
 //BA.debugLineNum = 112984064;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=112984066;
 //BA.debugLineNum = 112984066;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=112984067;
 //BA.debugLineNum = 112984067;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=112984068;
 //BA.debugLineNum = 112984068;BA.debugLine="sb.Append(\"UPDATE [\").Append(TableName).Append(\"]";
_sb.Append("UPDATE [").Append(_tablename).Append("] SET [").Append(_field).Append("] = ? WHERE ");
RDebugUtils.currentLine=112984069;
 //BA.debugLineNum = 112984069;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=112984070;
 //BA.debugLineNum = 112984070;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5112984070","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=112984071;
 //BA.debugLineNum = 112984071;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=112984073;
 //BA.debugLineNum = 112984073;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=112984074;
 //BA.debugLineNum = 112984074;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=112984075;
 //BA.debugLineNum = 112984075;BA.debugLine="args.Add(NewValue)";
_args.Add(_newvalue);
RDebugUtils.currentLine=112984076;
 //BA.debugLineNum = 112984076;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_wherefieldequals.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=112984077;
 //BA.debugLineNum = 112984077;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
if (_i>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=112984078;
 //BA.debugLineNum = 112984078;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKeyAt(";
_sb.Append("[").Append(BA.ObjectToString(_wherefieldequals.GetKeyAt(_i))).Append("] = ?");
RDebugUtils.currentLine=112984079;
 //BA.debugLineNum = 112984079;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
_args.Add(_wherefieldequals.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=112984081;
 //BA.debugLineNum = 112984081;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("5112984081","UpdateRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=112984082;
 //BA.debugLineNum = 112984082;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=112984083;
 //BA.debugLineNum = 112984083;BA.debugLine="End Sub";
return "";
}
}