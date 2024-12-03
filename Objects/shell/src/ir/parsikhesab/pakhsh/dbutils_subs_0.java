package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dbutils_subs_0 {


public static RemoteObject  _copydbfromassets(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CopyDBFromAssets (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,29);
if (RapidSub.canDelegate("copydbfromassets")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","copydbfromassets", _ba, _filename);}
RemoteObject _targetdir = RemoteObject.createImmutable("");
;
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 29;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String) A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Dim TargetDir As String = GetDBFolder";
Debug.ShouldStop(536870912);
_targetdir = _getdbfolder(_ba);Debug.locals.put("TargetDir", _targetdir);Debug.locals.put("TargetDir", _targetdir);
 BA.debugLineNum = 32;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_targetdir),(Object)(_filename)),dbutils.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 33;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
Debug.ShouldStop(1);
dbutils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(_targetdir),(Object)(_filename));
 };
 BA.debugLineNum = 35;BA.debugLine="Return TargetDir";
Debug.ShouldStop(4);
if (true) return _targetdir;
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _fieldsandtypes,RemoteObject _primarykey) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,42);
if (RapidSub.canDelegate("createtable")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","createtable", _ba, _sql, _tablename, _fieldsandtypes, _primarykey);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _field = RemoteObject.createImmutable("");
RemoteObject _ftype = RemoteObject.createImmutable("");
RemoteObject _query = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("FieldsAndTypes", _fieldsandtypes);
Debug.locals.put("PrimaryKey", _primarykey);
 BA.debugLineNum = 42;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1024);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 44;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="sb.Append(\"(\")";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(")));
 BA.debugLineNum = 46;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
Debug.ShouldStop(8192);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_fieldsandtypes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 47;BA.debugLine="Dim field, ftype As String";
Debug.ShouldStop(16384);
_field = RemoteObject.createImmutable("");Debug.locals.put("field", _field);
_ftype = RemoteObject.createImmutable("");Debug.locals.put("ftype", _ftype);
 BA.debugLineNum = 48;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
Debug.ShouldStop(32768);
_field = BA.ObjectToString(_fieldsandtypes.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("field", _field);
 BA.debugLineNum = 49;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
Debug.ShouldStop(65536);
_ftype = BA.ObjectToString(_fieldsandtypes.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ftype", _ftype);
 BA.debugLineNum = 50;BA.debugLine="If i > 0 Then sb.Append(\", \")";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));};
 BA.debugLineNum = 51;BA.debugLine="sb.Append(\"[\").Append(field).Append(\"] \").Append";
Debug.ShouldStop(262144);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(_field)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("] "))).runVoidMethod ("Append",(Object)(_ftype));
 BA.debugLineNum = 52;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_field,_primarykey)) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" PRIMARY KEY")));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 54;BA.debugLine="sb.Append(\")\")";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 55;BA.debugLine="Dim query As String";
Debug.ShouldStop(4194304);
_query = RemoteObject.createImmutable("");Debug.locals.put("query", _query);
 BA.debugLineNum = 56;BA.debugLine="query = \"CREATE TABLE IF NOT EXISTS [\" & TableNam";
Debug.ShouldStop(8388608);
_query = RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS ["),_tablename,RemoteObject.createImmutable("] "),_sb.runMethod(true,"ToString"));Debug.locals.put("query", _query);
 BA.debugLineNum = 57;BA.debugLine="Log(\"CreateTable: \" & query)";
Debug.ShouldStop(16777216);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5112787471",RemoteObject.concat(RemoteObject.createImmutable("CreateTable: "),_query),0);
 BA.debugLineNum = 58;BA.debugLine="SQL.ExecNonQuery(query)";
Debug.ShouldStop(33554432);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleterecord(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("DeleteRecord (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,393);
if (RapidSub.canDelegate("deleterecord")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","deleterecord", _ba, _sql, _tablename, _wherefieldequals);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 393;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
Debug.ShouldStop(256);
 BA.debugLineNum = 394;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(512);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 395;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 396;BA.debugLine="sb.Append(\"DELETE FROM [\").Append(TableName).A";
Debug.ShouldStop(2048);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("DELETE FROM ["))).runMethod(false,"Append",(Object)(_tablename)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] WHERE ")));
 BA.debugLineNum = 397;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 398;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(8192);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113639429",RemoteObject.createImmutable("WhereFieldEquals map empty!"),0);
 BA.debugLineNum = 399;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 401;BA.debugLine="Dim args As List";
Debug.ShouldStop(65536);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 402;BA.debugLine="args.Initialize";
Debug.ShouldStop(131072);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 403;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
Debug.ShouldStop(262144);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_wherefieldequals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 404;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));};
 BA.debugLineNum = 405;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.Get";
Debug.ShouldStop(1048576);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_wherefieldequals.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] = ?")));
 BA.debugLineNum = 406;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
Debug.ShouldStop(2097152);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 408;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
Debug.ShouldStop(8388608);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113639439",RemoteObject.concat(RemoteObject.createImmutable("DeleteRecord: "),_sb.runMethod(true,"ToString")),0);
 BA.debugLineNum = 409;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(16777216);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 410;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptable(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("DropTable (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,62);
if (RapidSub.canDelegate("droptable")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","droptable", _ba, _sql, _tablename);}
RemoteObject _query = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
 BA.debugLineNum = 62;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Dim query As String";
Debug.ShouldStop(1073741824);
_query = RemoteObject.createImmutable("");Debug.locals.put("query", _query);
 BA.debugLineNum = 64;BA.debugLine="query = \"DROP TABLE IF EXISTS [\" & TableName & \"]";
Debug.ShouldStop(-2147483648);
_query = RemoteObject.concat(RemoteObject.createImmutable("DROP TABLE IF EXISTS ["),_tablename,RemoteObject.createImmutable("]"));Debug.locals.put("query", _query);
 BA.debugLineNum = 65;BA.debugLine="Log(\"DropTable: \" & query)";
Debug.ShouldStop(1);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5112852995",RemoteObject.concat(RemoteObject.createImmutable("DropTable: "),_query),0);
 BA.debugLineNum = 66;BA.debugLine="SQL.ExecNonQuery(query)";
Debug.ShouldStop(2);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executehtml(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _clickable) throws Exception{
try {
		Debug.PushSubsStack("ExecuteHtml (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,313);
if (RapidSub.canDelegate("executehtml")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","executehtml", _ba, _sql, _query, _stringargs, _limit, _clickable);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
int _row = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Clickable", _clickable);
 BA.debugLineNum = 313;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(33554432);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 315;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 316;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(134217728);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 318;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(536870912);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 320;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
Debug.ShouldStop(-2147483648);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113442823",RemoteObject.concat(RemoteObject.createImmutable("ExecuteHtml: "),_query),0);
 BA.debugLineNum = 321;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0))) { 
_limit = BA.numberCast(int.class, dbutils.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _limit)),(Object)(BA.numberCast(double.class, _cur.runMethod(true,"getRowCount")))));Debug.locals.put("Limit", _limit);}
else {
_limit = _cur.runMethod(true,"getRowCount");Debug.locals.put("Limit", _limit);};
 BA.debugLineNum = 322;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 323;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 324;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
Debug.ShouldStop(8);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<html><body>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 325;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
Debug.ShouldStop(16);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<style type='text/css'>"))).runMethod(false,"Append",(Object)(dbutils._htmlcss)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</style>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 326;BA.debugLine="sb.Append(\"<table><tr>\").Append(CRLF)";
Debug.ShouldStop(32);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<table><tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 327;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(64);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 328;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
Debug.ShouldStop(128);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<th>"))).runMethod(false,"Append",(Object)(_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</th>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 339;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(262144);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 340;BA.debugLine="For row = 0 To Limit - 1";
Debug.ShouldStop(524288);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_limit,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step18 > 0 && _row <= limit18) || (step18 < 0 && _row >= limit18) ;_row = ((int)(0 + _row + step18))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 341;BA.debugLine="cur.Position = row";
Debug.ShouldStop(1048576);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 342;BA.debugLine="If row Mod 2 = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_row),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 343;BA.debugLine="sb.Append(\"<tr>\")";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr>")));
 }else {
 BA.debugLineNum = 345;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr class='odd'>")));
 };
 BA.debugLineNum = 347;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(67108864);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 348;BA.debugLine="sb.Append(\"<td>\")";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<td>")));
 BA.debugLineNum = 349;BA.debugLine="If Clickable Then";
Debug.ShouldStop(268435456);
if (_clickable.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 350;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
Debug.ShouldStop(536870912);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<a href='http://"))).runMethod(false,"Append",(Object)(BA.NumberToString(_i))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(".")));
 BA.debugLineNum = 351;BA.debugLine="sb.Append(row)";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(BA.NumberToString(_row)));
 BA.debugLineNum = 352;BA.debugLine="sb.Append(\".com'>\").Append(cur.GetString2(i)).";
Debug.ShouldStop(-2147483648);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(".com'>"))).runMethod(false,"Append",(Object)(_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</a>")));
 }else {
 BA.debugLineNum = 354;BA.debugLine="sb.Append(cur.GetString2(i))";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)))));
 };
 BA.debugLineNum = 356;BA.debugLine="sb.Append(\"</td>\")";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</td>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 358;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(32);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.mostCurrent.__c.getField(true,"CRLF")));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 360;BA.debugLine="cur.Close";
Debug.ShouldStop(128);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 361;BA.debugLine="sb.Append(\"</table></body></html>\")";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</table></body></html>")));
 BA.debugLineNum = 362;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(512);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executejson(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _dbtypes) throws Exception{
try {
		Debug.PushSubsStack("ExecuteJSON (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,274);
if (RapidSub.canDelegate("executejson")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","executejson", _ba, _sql, _query, _stringargs, _limit, _dbtypes);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _row = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("DBTypes", _dbtypes);
 BA.debugLineNum = 274;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Dim table As List";
Debug.ShouldStop(262144);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 276;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(524288);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 277;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 278;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(2097152);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 280;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 282;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
Debug.ShouldStop(33554432);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113377288",RemoteObject.concat(RemoteObject.createImmutable("ExecuteJSON: "),_query),0);
 BA.debugLineNum = 283;BA.debugLine="Dim table As List";
Debug.ShouldStop(67108864);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 284;BA.debugLine="table.Initialize";
Debug.ShouldStop(134217728);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 285;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0))) { 
_limit = BA.numberCast(int.class, dbutils.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _limit)),(Object)(BA.numberCast(double.class, _cur.runMethod(true,"getRowCount")))));Debug.locals.put("Limit", _limit);}
else {
_limit = _cur.runMethod(true,"getRowCount");Debug.locals.put("Limit", _limit);};
 BA.debugLineNum = 286;BA.debugLine="For row = 0 To Limit - 1";
Debug.ShouldStop(536870912);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_limit,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step12 > 0 && _row <= limit12) || (step12 < 0 && _row >= limit12) ;_row = ((int)(0 + _row + step12))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 287;BA.debugLine="cur.Position = row";
Debug.ShouldStop(1073741824);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 288;BA.debugLine="Dim m As Map";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 289;BA.debugLine="m.Initialize";
Debug.ShouldStop(1);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 290;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(2);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 291;BA.debugLine="Select DBTypes.Get(i)";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(_dbtypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),(dbutils._db_text),(dbutils._db_integer),(dbutils._db_real))) {
case 0: {
 BA.debugLineNum = 293;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 1: {
 BA.debugLineNum = 295;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetLong2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 2: {
 BA.debugLineNum = 297;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetDouble2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
default: {
 BA.debugLineNum = 299;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
Debug.ShouldStop(1024);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113377305",RemoteObject.concat(RemoteObject.createImmutable("Invalid type: "),_dbtypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 302;BA.debugLine="table.Add(m)";
Debug.ShouldStop(8192);
_table.runVoidMethod ("Add",(Object)((_m.getObject())));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 304;BA.debugLine="cur.Close";
Debug.ShouldStop(32768);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 305;BA.debugLine="Dim root As Map";
Debug.ShouldStop(65536);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("root", _root);
 BA.debugLineNum = 306;BA.debugLine="root.Initialize";
Debug.ShouldStop(131072);
_root.runVoidMethod ("Initialize");
 BA.debugLineNum = 307;BA.debugLine="root.Put(\"root\", table)";
Debug.ShouldStop(262144);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("root"))),(Object)((_table.getObject())));
 BA.debugLineNum = 308;BA.debugLine="Return root";
Debug.ShouldStop(524288);
if (true) return _root;
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executelistview(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _listview1,RemoteObject _twolines) throws Exception{
try {
		Debug.PushSubsStack("ExecuteListView (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,249);
if (RapidSub.canDelegate("executelistview")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","executelistview", _ba, _sql, _query, _stringargs, _limit, _listview1, _twolines);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("ListView1", _listview1);
Debug.locals.put("TwoLines", _twolines);
 BA.debugLineNum = 249;BA.debugLine="Public Sub ExecuteListView(SQL As SQL, Query As St";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 251;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(67108864);
_listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 252;BA.debugLine="Dim Table As List";
Debug.ShouldStop(134217728);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 253;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
Debug.ShouldStop(268435456);
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 254;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(536870912);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 255;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(1073741824);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 256;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(-2147483648);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 257;BA.debugLine="If TwoLines Then";
Debug.ShouldStop(1);
if (_twolines.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 258;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
Debug.ShouldStop(2);
_listview1.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)((_cols)));
 }else {
 BA.debugLineNum = 260;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
Debug.ShouldStop(8);
_listview1.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(_cols.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)((_cols)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executemap(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMap (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,211);
if (RapidSub.canDelegate("executemap")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","executemap", _ba, _sql, _query, _stringargs);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
 BA.debugLineNum = 211;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(524288);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 213;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 214;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(2097152);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 216;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 218;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
Debug.ShouldStop(33554432);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113180679",RemoteObject.concat(RemoteObject.createImmutable("ExecuteMap: "),_query),0);
 BA.debugLineNum = 219;BA.debugLine="If cur.RowCount = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 220;BA.debugLine="Log(\"No records found.\")";
Debug.ShouldStop(134217728);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113180681",RemoteObject.createImmutable("No records found."),0);
 BA.debugLineNum = 221;BA.debugLine="Return Null";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), dbutils.mostCurrent.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 223;BA.debugLine="Dim res As Map";
Debug.ShouldStop(1073741824);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("res", _res);
 BA.debugLineNum = 224;BA.debugLine="res.Initialize";
Debug.ShouldStop(-2147483648);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 225;BA.debugLine="cur.Position = 0";
Debug.ShouldStop(1);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 226;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(2);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 227;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
Debug.ShouldStop(4);
_res.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"toLowerCase"))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 229;BA.debugLine="cur.Close";
Debug.ShouldStop(16);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 230;BA.debugLine="Return res";
Debug.ShouldStop(32);
if (true) return _res;
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executememorytable(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMemoryTable (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,184);
if (RapidSub.canDelegate("executememorytable")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","executememorytable", _ba, _sql, _query, _stringargs, _limit);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _row = 0;
RemoteObject _values = null;
int _col = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
 BA.debugLineNum = 184;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(16777216);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 186;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 187;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(67108864);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(_stringargs)));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 189;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(268435456);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sql.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 191;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
Debug.ShouldStop(1073741824);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113115143",RemoteObject.concat(RemoteObject.createImmutable("ExecuteMemoryTable: "),_query),0);
 BA.debugLineNum = 192;BA.debugLine="Dim table As List";
Debug.ShouldStop(-2147483648);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 193;BA.debugLine="table.Initialize";
Debug.ShouldStop(1);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 194;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0))) { 
_limit = BA.numberCast(int.class, dbutils.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _limit)),(Object)(BA.numberCast(double.class, _cur.runMethod(true,"getRowCount")))));Debug.locals.put("Limit", _limit);}
else {
_limit = _cur.runMethod(true,"getRowCount");Debug.locals.put("Limit", _limit);};
 BA.debugLineNum = 195;BA.debugLine="For row = 0 To Limit - 1";
Debug.ShouldStop(4);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_limit,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step11 > 0 && _row <= limit11) || (step11 < 0 && _row >= limit11) ;_row = ((int)(0 + _row + step11))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 196;BA.debugLine="cur.Position = row";
Debug.ShouldStop(8);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 197;BA.debugLine="Dim values(cur.ColumnCount) As String";
Debug.ShouldStop(16);
_values = RemoteObject.createNewArray ("String", new int[] {_cur.runMethod(true,"getColumnCount").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 198;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(32);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step14 > 0 && _col <= limit14) || (step14 < 0 && _col >= limit14) ;_col = ((int)(0 + _col + step14))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 199;BA.debugLine="values(col) = cur.GetString2(col)";
Debug.ShouldStop(64);
_values.setArrayElement (_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _col))),BA.numberCast(int.class, _col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 201;BA.debugLine="table.Add(values)";
Debug.ShouldStop(256);
_table.runVoidMethod ("Add",(Object)((_values)));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 203;BA.debugLine="cur.Close";
Debug.ShouldStop(1024);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 204;BA.debugLine="Return table";
Debug.ShouldStop(2048);
if (true) return _table;
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executespinner(RemoteObject _ba,RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _spinner1) throws Exception{
try {
		Debug.PushSubsStack("ExecuteSpinner (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,234);
if (RapidSub.canDelegate("executespinner")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","executespinner", _ba, _sql, _query, _stringargs, _limit, _spinner1);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("Spinner1", _spinner1);
 BA.debugLineNum = 234;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
Debug.ShouldStop(512);
 BA.debugLineNum = 235;BA.debugLine="Spinner1.Clear";
Debug.ShouldStop(1024);
_spinner1.runVoidMethod ("Clear");
 BA.debugLineNum = 236;BA.debugLine="Dim Table As List";
Debug.ShouldStop(2048);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 237;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
Debug.ShouldStop(4096);
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 238;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(8192);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 239;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(16384);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 240;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(32768);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 241;BA.debugLine="Spinner1.Add(Cols(0))";
Debug.ShouldStop(65536);
_spinner1.runVoidMethod ("Add",(Object)(_cols.getArrayElement(true,BA.numberCast(int.class, 0))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdbfolder(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetDBFolder (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,20);
if (RapidSub.canDelegate("getdbfolder")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","getdbfolder", _ba);}
RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
;
 BA.debugLineNum = 20;BA.debugLine="Public Sub GetDBFolder As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Dim rp As RuntimePermissions";
Debug.ShouldStop(1048576);
_rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");Debug.locals.put("rp", _rp);
 BA.debugLineNum = 22;BA.debugLine="If File.ExternalWritable Then Return rp.GetSafeDi";
Debug.ShouldStop(2097152);
if (dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getExternalWritable").<Boolean>get().booleanValue()) { 
if (true) return _rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));}
else {
if (true) return dbutils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal");};
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdbversion(RemoteObject _ba,RemoteObject _sql) throws Exception{
try {
		Debug.PushSubsStack("GetDBVersion (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,367);
if (RapidSub.canDelegate("getdbversion")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","getdbversion", _ba, _sql);}
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _version = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 367;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 368;BA.debugLine="Dim count, version As Int";
Debug.ShouldStop(32768);
_count = RemoteObject.createImmutable(0);Debug.locals.put("count", _count);
_version = RemoteObject.createImmutable(0);Debug.locals.put("version", _version);
 BA.debugLineNum = 369;BA.debugLine="count = SQL.ExecQuerySingleResult(\"SELECT count(*";
Debug.ShouldStop(65536);
_count = BA.numberCast(int.class, _sql.runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("SELECT count(*) FROM sqlite_master WHERE Type='table' AND name='DBVersion'"))));Debug.locals.put("count", _count);
 BA.debugLineNum = 370;BA.debugLine="If count > 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 371;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
Debug.ShouldStop(262144);
_version = BA.numberCast(int.class, _sql.runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("SELECT version FROM DBVersion"))));Debug.locals.put("version", _version);
 }else {
 BA.debugLineNum = 374;BA.debugLine="Dim m As Map";
Debug.ShouldStop(2097152);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 375;BA.debugLine="m.Initialize";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 376;BA.debugLine="m.Put(\"version\", DB_INTEGER)";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("version"))),(Object)((dbutils._db_integer)));
 BA.debugLineNum = 377;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
Debug.ShouldStop(16777216);
_createtable(_ba,_sql,BA.ObjectToString("DBVersion"),_m,RemoteObject.createImmutable("version"));
 BA.debugLineNum = 379;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
Debug.ShouldStop(67108864);
_sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("INSERT INTO DBVersion VALUES (1)")));
 BA.debugLineNum = 381;BA.debugLine="version = 1";
Debug.ShouldStop(268435456);
_version = BA.numberCast(int.class, 1);Debug.locals.put("version", _version);
 };
 BA.debugLineNum = 384;BA.debugLine="Return version";
Debug.ShouldStop(-2147483648);
if (true) return _version;
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertmaps(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _listofmaps) throws Exception{
try {
		Debug.PushSubsStack("InsertMaps (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,73);
if (RapidSub.canDelegate("insertmaps")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","insertmaps", _ba, _sql, _tablename, _listofmaps);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i1 = 0;
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i2 = 0;
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 73;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Dim sb, columns, values As StringBuilder";
Debug.ShouldStop(512);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 76;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_listofmaps.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 77;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
Debug.ShouldStop(4096);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5112918532",RemoteObject.createImmutable("Same Map found twice in list. Each item in the list should include a different map object."),0);
 BA.debugLineNum = 78;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 80;BA.debugLine="SQL.BeginTransaction";
Debug.ShouldStop(32768);
_sql.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 81;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 82;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
Debug.ShouldStop(131072);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
for (;(step8 > 0 && _i1 <= limit8) || (step8 < 0 && _i1 >= limit8) ;_i1 = ((int)(0 + _i1 + step8))  ) {
Debug.locals.put("i1", _i1);
 BA.debugLineNum = 83;BA.debugLine="sb.Initialize";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="columns.Initialize";
Debug.ShouldStop(524288);
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="values.Initialize";
Debug.ShouldStop(1048576);
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 86;BA.debugLine="Dim listOfValues As List";
Debug.ShouldStop(2097152);
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 87;BA.debugLine="listOfValues.Initialize";
Debug.ShouldStop(4194304);
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 88;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
Debug.ShouldStop(8388608);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO ["),_tablename,RemoteObject.createImmutable("] ("))));
 BA.debugLineNum = 89;BA.debugLine="Dim m As Map";
Debug.ShouldStop(16777216);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 90;BA.debugLine="m = ListOfMaps.Get(i1)";
Debug.ShouldStop(33554432);
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));Debug.locals.put("m", _m);
 BA.debugLineNum = 91;BA.debugLine="For i2 = 0 To m.Size - 1";
Debug.ShouldStop(67108864);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i2 = 0 ;
for (;(step17 > 0 && _i2 <= limit17) || (step17 < 0 && _i2 >= limit17) ;_i2 = ((int)(0 + _i2 + step17))  ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 92;BA.debugLine="Dim col As String";
Debug.ShouldStop(134217728);
_col = RemoteObject.createImmutable("");Debug.locals.put("col", _col);
 BA.debugLineNum = 93;BA.debugLine="Dim value As Object";
Debug.ShouldStop(268435456);
_value = RemoteObject.createNew ("Object");Debug.locals.put("value", _value);
 BA.debugLineNum = 95;BA.debugLine="col = m.GetKeyAt(i2)";
Debug.ShouldStop(1073741824);
_col = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("col", _col);
 BA.debugLineNum = 96;BA.debugLine="value = m.GetValueAt(i2)";
Debug.ShouldStop(-2147483648);
_value = _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i2)));Debug.locals.put("value", _value);
 BA.debugLineNum = 97;BA.debugLine="Log(i2)";
Debug.ShouldStop(1);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5112918552",BA.NumberToString(_i2),0);
 BA.debugLineNum = 98;BA.debugLine="Log(col)";
Debug.ShouldStop(2);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5112918553",_col,0);
 BA.debugLineNum = 99;BA.debugLine="Log(value)";
Debug.ShouldStop(4);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5112918554",BA.ObjectToString(_value),0);
 BA.debugLineNum = 100;BA.debugLine="If i2 > 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i2),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 101;BA.debugLine="columns.Append(\", \")";
Debug.ShouldStop(16);
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 102;BA.debugLine="values.Append(\", \")";
Debug.ShouldStop(32);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 104;BA.debugLine="columns.Append(\"[\").Append(col).Append(\"]\")";
Debug.ShouldStop(128);
_columns.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(_col)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("]")));
 BA.debugLineNum = 105;BA.debugLine="values.Append(\"?\")";
Debug.ShouldStop(256);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 BA.debugLineNum = 106;BA.debugLine="listOfValues.Add(value)";
Debug.ShouldStop(512);
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 108;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
Debug.ShouldStop(2048);
_sb.runMethod(false,"Append",(Object)(_columns.runMethod(true,"ToString"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(") VALUES ("))).runMethod(false,"Append",(Object)(_values.runMethod(true,"ToString"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 109;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i1),BA.numberCast(double.class, 0))) { 
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5112918564",RemoteObject.concat(RemoteObject.createImmutable("InsertMaps (first query out of "),_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable("): "),_sb.runMethod(true,"ToString")),0);};
 BA.debugLineNum = 110;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
Debug.ShouldStop(8192);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_listofvalues));
 }
}Debug.locals.put("i1", _i1);
;
 BA.debugLineNum = 112;BA.debugLine="SQL.TransactionSuccessful";
Debug.ShouldStop(32768);
_sql.runVoidMethod ("TransactionSuccessful");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e39) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e39.toString()); BA.debugLineNum = 114;BA.debugLine="ToastMessageShow(LastException.Message, True)";
Debug.ShouldStop(131072);
dbutils.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(dbutils.mostCurrent.__c.runMethod(false,"LastException",_ba).runMethod(true,"getMessage"))),(Object)(dbutils.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 115;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5112918570",BA.ObjectToString(dbutils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 117;BA.debugLine="SQL.EndTransaction";
Debug.ShouldStop(1048576);
_sql.runVoidMethod ("EndTransaction");
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public DB_REAL, DB_INTEGER, DB_BLOB, DB_TEXT As S";
dbutils._db_real = RemoteObject.createImmutable("");
dbutils._db_integer = RemoteObject.createImmutable("");
dbutils._db_blob = RemoteObject.createImmutable("");
dbutils._db_text = RemoteObject.createImmutable("");
 //BA.debugLineNum = 5;BA.debugLine="DB_REAL = \"REAL\"";
dbutils._db_real = BA.ObjectToString("REAL");
 //BA.debugLineNum = 6;BA.debugLine="DB_INTEGER = \"INTEGER\"";
dbutils._db_integer = BA.ObjectToString("INTEGER");
 //BA.debugLineNum = 7;BA.debugLine="DB_BLOB = \"BLOB\"";
dbutils._db_blob = BA.ObjectToString("BLOB");
 //BA.debugLineNum = 8;BA.debugLine="DB_TEXT = \"TEXT\"";
dbutils._db_text = BA.ObjectToString("TEXT");
 //BA.debugLineNum = 9;BA.debugLine="Dim HtmlCSS As String";
dbutils._htmlcss = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="HtmlCSS = $\" 		table {width: 100%;border: 1px sol";
dbutils._htmlcss = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		table {width: 100%;border: 1px solid #cef;text-align: left; }\n"),RemoteObject.createImmutable("		th { font-weight: bold;	background-color: #acf;	border-bottom: 1px solid #cef; }\n"),RemoteObject.createImmutable("		td,th {	padding: 4px 5px; }\n"),RemoteObject.createImmutable("		.odd {background-color: #def; } \n"),RemoteObject.createImmutable("		.odd td {border-bottom: 1px solid #cef; }\n"),RemoteObject.createImmutable("		a { text-decoration:none; color: #000;}")));
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdbversion(RemoteObject _ba,RemoteObject _sql,RemoteObject _version) throws Exception{
try {
		Debug.PushSubsStack("SetDBVersion (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,388);
if (RapidSub.canDelegate("setdbversion")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","setdbversion", _ba, _sql, _version);}
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Version", _version);
 BA.debugLineNum = 388;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
Debug.ShouldStop(8);
 BA.debugLineNum = 389;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
Debug.ShouldStop(16);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE DBVersion set version = ?")),(Object)(dbutils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_version)})))));
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecord(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _field,RemoteObject _newvalue,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,122);
if (RapidSub.canDelegate("updaterecord")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","updaterecord", _ba, _sql, _tablename, _field, _newvalue, _wherefieldequals);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Field", _field);
Debug.locals.put("NewValue", _newvalue);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 122;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(134217728);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 125;BA.debugLine="sb.Initialize";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 126;BA.debugLine="sb.Append(\"UPDATE [\").Append(TableName).Append(\"]";
Debug.ShouldStop(536870912);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("UPDATE ["))).runMethod(false,"Append",(Object)(_tablename)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("] SET ["))).runMethod(false,"Append",(Object)(_field)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] = ? WHERE ")));
 BA.debugLineNum = 127;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 128;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(-2147483648);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5112984070",RemoteObject.createImmutable("WhereFieldEquals map empty!"),0);
 BA.debugLineNum = 129;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 131;BA.debugLine="Dim args As List";
Debug.ShouldStop(4);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 132;BA.debugLine="args.Initialize";
Debug.ShouldStop(8);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 133;BA.debugLine="args.Add(NewValue)";
Debug.ShouldStop(16);
_args.runVoidMethod ("Add",(Object)(_newvalue));
 BA.debugLineNum = 134;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
Debug.ShouldStop(32);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_wherefieldequals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 135;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));};
 BA.debugLineNum = 136;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKeyAt(";
Debug.ShouldStop(128);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_wherefieldequals.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] = ?")));
 BA.debugLineNum = 137;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
Debug.ShouldStop(256);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 139;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
Debug.ShouldStop(1024);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5112984081",RemoteObject.concat(RemoteObject.createImmutable("UpdateRecord: "),_sb.runMethod(true,"ToString")),0);
 BA.debugLineNum = 140;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(2048);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecord2(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _fields,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord2 (dbutils) ","dbutils",93,_ba,dbutils.mostCurrent,145);
if (RapidSub.canDelegate("updaterecord2")) { return ir.parsikhesab.pakhsh.dbutils.remoteMe.runUserSub(false, "dbutils","updaterecord2", _ba, _sql, _tablename, _fields, _wherefieldequals);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Fields", _fields);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 145;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 147;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(262144);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113049602",RemoteObject.createImmutable("WhereFieldEquals map empty!"),0);
 BA.debugLineNum = 148;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 150;BA.debugLine="If Fields.Size = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_fields.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 151;BA.debugLine="Log(\"Fields empty\")";
Debug.ShouldStop(4194304);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113049606",RemoteObject.createImmutable("Fields empty"),0);
 BA.debugLineNum = 152;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 154;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(33554432);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 155;BA.debugLine="sb.Initialize";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 156;BA.debugLine="sb.Append(\"UPDATE [\").Append(TableName).Append(\"]";
Debug.ShouldStop(134217728);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("UPDATE ["))).runMethod(false,"Append",(Object)(_tablename)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] SET ")));
 BA.debugLineNum = 157;BA.debugLine="Dim args As List";
Debug.ShouldStop(268435456);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 158;BA.debugLine="args.Initialize";
Debug.ShouldStop(536870912);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 159;BA.debugLine="For i=0 To Fields.Size-1";
Debug.ShouldStop(1073741824);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_fields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 160;BA.debugLine="If i<>Fields.Size-1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_fields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 161;BA.debugLine="sb.Append(\"[\").Append(Fields.GetKeyAt(i)).Appen";
Debug.ShouldStop(1);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_fields.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("]=?,")));
 }else {
 BA.debugLineNum = 163;BA.debugLine="sb.Append(\"[\").Append(Fields.GetKeyAt(i)).Appen";
Debug.ShouldStop(4);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_fields.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("]=?")));
 };
 BA.debugLineNum = 165;BA.debugLine="args.Add(Fields.GetValueAt(i))";
Debug.ShouldStop(16);
_args.runVoidMethod ("Add",(Object)(_fields.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 168;BA.debugLine="sb.Append(\" WHERE \")";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" WHERE ")));
 BA.debugLineNum = 169;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
Debug.ShouldStop(256);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_wherefieldequals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 170;BA.debugLine="If i > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 171;BA.debugLine="sb.Append(\" AND \")";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 173;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKeyAt(";
Debug.ShouldStop(4096);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_wherefieldequals.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] = ?")));
 BA.debugLineNum = 174;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
Debug.ShouldStop(8192);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 176;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
Debug.ShouldStop(32768);
dbutils.mostCurrent.__c.runVoidMethod ("LogImpl","5113049631",RemoteObject.concat(RemoteObject.createImmutable("UpdateRecord: "),_sb.runMethod(true,"ToString")),0);
 BA.debugLineNum = 177;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(65536);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}